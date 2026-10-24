package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Shield part 2 of the 1v1 mode table: SHIELD-17's opening drive (Saguaro's moving shield) and
 * SHIELD-18's shipped aim and {@code SP} record. The opponent stands still 400 px north of us on
 * an 800 x 600 field; every gun starts a round at heat 3.0, so at cooling 0.1 the enemy's gun is
 * ready at tick 30 and the drive stands still from tick 25.
 */
class ShieldOpeningTest {

    private static final double MY_X = 400, MY_Y = 100, ENEMY_X = 400, ENEMY_Y = 500;
    private static final double W = 800, H = 600;
    private static final String LISTED = "list.Target 1.0";

    private final List<String> records = new ArrayList<>();

    private ShieldMode mode(String design, String... extra) {
        List<String> lines = new ArrayList<>(List.of("list.Target"));
        lines.addAll(List.of(extra));
        return new ShieldMode(ShieldList.parse(lines), records::add, 35, ShieldDesign.parse(design));
    }

    private static void scan(ShieldMode m, String name, long time) {
        m.onScan(name, time, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
    }

    private static ShieldMode.Situation at(long time, double x, double y, double heading) {
        return new ShieldMode.Situation(time, x, y, heading, 0, 0, 0.1, 100, ENEMY_X, ENEMY_Y,
            100, 0, 1.9, false, true, W, H);
    }

    // ---- SHIELD-17

    @Test
    @Tag("SHIELD-17")
    @DisplayName("the move switch parses, stays out of 'all' and off the shipped design")
    void moveParses() {
        ShieldDesign d = ShieldDesign.parse("prior,move");
        assertTrue(d.move && d.prior);
        assertEquals("prior,move", d.toString());
        assertFalse(ShieldDesign.parse("all").move);
        assertFalse(ShieldDesign.SHIPPED.move);
        assertFalse(ShieldDesign.NONE.move);
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("with the switch on, a shielded opponent's round opens with a drive that stands still 5 ticks before its gun is ready")
    void drivesThenStands() {
        ShieldMode m = mode("move");
        scan(m, LISTED, 1);
        assertTrue(m.opening());
        for (long t = 1; t < 25; t++) {
            ShieldMode.Command c = m.tick(at(t, MY_X, MY_Y, 0));
            assertNotNull(c);
            assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(c.ahead), 1e-9, "tick " + t);
            assertEquals(0, c.firePower, 0.0, "no shot while driving");
        }
        assertEquals(0, m.tick(at(25, MY_X, MY_Y, 0)).ahead, 0.0, "still from tick 25");
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("the drive ends at the enemy's first shot")
    void endsAtFirstShot() {
        ShieldMode m = mode("move");
        scan(m, LISTED, 1);
        assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(m.tick(at(2, MY_X, MY_Y, 0)).ahead), 1e-9);
        m.onEnemyFired();
        assertEquals(0, m.tick(at(3, MY_X, MY_Y, 0)).ahead, 0.0);
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("without the switch, only an opponent on the list's move entries gets the drive")
    void listEntry() {
        ShieldMode off = mode("prior");
        scan(off, LISTED, 1);
        assertFalse(off.opening());
        assertEquals(0, off.tick(at(2, MY_X, MY_Y, 0)).ahead, 0.0);

        ShieldMode on = mode("prior", "shield-move: list.Target");
        scan(on, LISTED, 1);
        assertTrue(on.opening());
        assertEquals(ShieldMode.MOVE_AHEAD, Math.abs(on.tick(at(2, MY_X, MY_Y, 0)).ahead), 1e-9);
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("an unlisted opponent never gets the drive, whatever the list's move entries say")
    void unlistedNever() {
        ShieldMode m = mode("move", "shield-move: other.Robot");
        scan(m, "other.Robot 1.0", 1);
        assertFalse(m.listed());
        assertFalse(m.opening());
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("with no field size the drive does not start")
    void needsField() {
        ShieldMode m = mode("move");
        scan(m, LISTED, 1);
        ShieldMode.Command c = m.tick(new ShieldMode.Situation(2, MY_X, MY_Y, 0, 0, 0, 0.1, 100,
            ENEMY_X, ENEMY_Y, 100, 0, 1.9, false, true));
        assertEquals(0, c.ahead, 0.0);
    }

    @Test
    @Tag("SHIELD-17")
    @DisplayName("the drive goes away from a near wall and away from the enemy")
    void awayFromWallAndEnemy() {
        // Near the west wall, enemy north: the push is east (and south).
        ShieldMode.Command c = ShieldMode.openingDrive(at(2, 30, 300, 0));
        double heading = c.bodyTurn;
        double sign = Math.signum(c.ahead);
        assertTrue(Math.sin(heading) * sign > 0, "east");
        // In the middle, with the enemy straight north: the push is south.
        ShieldMode.Command d = ShieldMode.openingDrive(at(2, 400, 300, 0));
        assertTrue(Math.cos(d.bodyTurn) * Math.signum(d.ahead) < 0, "south");
        assertTrue(Math.abs(d.bodyTurn) <= Math.PI / 2 + 1e-9, "the smaller turn, driving back");
    }

    // ---- SHIELD-18

    @Test
    @Tag("SHIELD-18")
    @DisplayName("the list reads shipped aims and move entries, with or without the version, and skips malformed aims")
    void listReadsTable() {
        ShieldList l = ShieldList.parse(List.of("a.B", "shield-aim: 7 0.0125 a.B 1.0",
            "shield-aim: 2 -0.5 c.D", "shield-aim: x 0 e.F", "shield-aim: 3 e.F", "shield-move: c.D"));
        assertArrayEquals(new double[] {7, 0.0125}, l.aimFor("a.B 1.0"), 0.0);
        assertNull(l.aimFor("a.B 2.0"), "a versioned aim is for that version only");
        assertArrayEquals(new double[] {2, -0.5}, l.aimFor("c.D 9"), 0.0);
        assertNull(l.aimFor("e.F 1"));
        assertTrue(l.moves("c.D 1.2"));
        assertFalse(l.moves("a.B 1.0"));
        assertFalse(l.matches("c.D 1.2"), "a move or aim line puts nobody on the shield list");
        assertEquals(1, l.size());
    }

    @Test
    @Tag("SHIELD-18")
    @DisplayName("a shipped aim makes its predictor the best from the first bullet; one out of range is ignored")
    void seeds() {
        ShieldMode m = mode("prior", "shield-aim: 7 0.01 list.Target");
        scan(m, LISTED, 1);
        assertEquals(7, m.bestPredictor());
        ShieldMode n = mode("prior", "shield-aim: 99 0 list.Target");
        scan(n, LISTED, 1);
        assertEquals(0, n.bestPredictor());
        ShieldMode none = mode("prior");
        scan(none, LISTED, 1);
        assertEquals(0, none.bestPredictor());
    }

    @Test
    @Tag("SHIELD-18")
    @DisplayName("the rec switch writes the SP record at each round's end; without it there is none")
    void records() {
        ShieldMode m = mode("prior,rec", "shield-aim: 11 0.02 list.Target");
        scan(m, LISTED, 1);
        m.onRoundEnded(500, true);
        String sp = records.stream().filter(r -> r.startsWith("SP,")).findFirst().orElse(null);
        assertEquals("SP,0,500,5,11,0.020000000,3,0,0", sp);
        records.clear();
        ShieldMode q = mode("prior");
        scan(q, LISTED, 1);
        q.onRoundEnded(500, true);
        assertTrue(records.stream().noneMatch(r -> r.startsWith("SP,")));
        assertFalse(ShieldDesign.SHIPPED.rec);
        assertFalse(ShieldDesign.parse("all").rec);
    }
}
