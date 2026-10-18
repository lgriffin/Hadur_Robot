package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-8 to SHIELD-12, the switches toward Nullstride's shield, and the SB record of each
 * bullet that gets through. The opponent stands still 400 px north of us, as in
 * {@link ShieldModeTest}.
 */
class ShieldDesignTest {

    private static final String ENEMY = "list.Target 1.0";
    private static final double MY_X = 400, MY_Y = 100, ENEMY_X = 400, ENEMY_Y = 500;

    private final List<String> records = new ArrayList<>();
    private ShieldMode mode;

    private ShieldMode mode(String flags) {
        mode = new ShieldMode(ShieldList.parse(List.of("list.Target")), records::add, 35,
            ShieldDesign.parse(flags));
        return mode;
    }

    private void scan(long time) {
        mode.onScan(ENEMY, time, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
    }

    private ShieldMode.Situation situation(long time, double enemyY, double enemyEnergy) {
        return new ShieldMode.Situation(time, MY_X, MY_Y, 0, 0, 0, 0.1, 100, ENEMY_X, enemyY,
            enemyEnergy, 0, 1.9, true, true);
    }

    private String last() {
        return records.get(records.size() - 1);
    }

    /** The latest SB record. */
    private String lastSb() {
        return records.stream().filter(r -> r.startsWith("SB,")).reduce((a, b) -> b).orElseThrow();
    }

    /** A head-on shot of {@code power} fired at {@code fireTime}, where it is {@code at} ticks later. */
    private double[] headOnAt(long fireTime, long at, double power) {
        double travelled = (20 - 3 * power) * (at - fireTime);
        return new double[] {ENEMY_X, ENEMY_Y - travelled};
    }

    private void shot(long fireTime, double power) {
        for (long t = fireTime - 1; t <= fireTime + 1; t++) scan(t);
        mode.onEnemyShot(fireTime, power);
    }

    private void hit(long fireTime, long hitTime, double power, double heading) {
        shot(fireTime, power);
        double[] p = headOnAt(fireTime, hitTime, power);
        mode.onHitByBullet(hitTime, power, p[0], p[1], heading);
    }

    // ---- the design itself

    @Test
    @Tag("SHIELD-13")
    @DisplayName("the robot ships hold, learn, mode and stay with turn off, and the plain constructor uses it")
    void shippedIsStep3Build() {
        ShieldDesign shipped = ShieldDesign.SHIPPED;
        assertTrue(shipped.hold && shipped.learn && shipped.mode && shipped.stay);
        assertFalse(shipped.turn);
        assertEquals("hold,learn,mode,stay", shipped.toString());
        assertEquals(ShieldMode.BASES, shipped.bases());
        assertSame(ShieldDesign.SHIPPED, new ShieldMode(ShieldList.NONE, records::add, 35).design());
    }

    @Test
    @Tag("SHIELD-8")
    @Tag("SHIELD-9")
    @Tag("SHIELD-10")
    @Tag("SHIELD-11")
    @Tag("SHIELD-12")
    @DisplayName("NONE is 3.12's shield: every switch off, and a null design means NONE")
    void noneIs312() {
        ShieldDesign none = ShieldDesign.NONE;
        assertFalse(none.hold || none.learn || none.mode || none.stay || none.turn);
        assertEquals("none", none.toString());
        assertEquals(ShieldMode.BASES, none.bases());
        assertSame(ShieldDesign.NONE, ShieldDesign.parse(""));
        assertSame(ShieldDesign.NONE, new ShieldMode(ShieldList.NONE, records::add, 35, null).design());
    }

    @Test
    @Tag("SHIELD-8")
    @DisplayName("switches parse by name, 'all' turns on every one, and an unknown name is refused")
    void parse() {
        ShieldDesign d = ShieldDesign.parse(" hold , stay");
        assertTrue(d.hold && d.stay);
        assertFalse(d.learn || d.mode || d.turn);
        assertEquals("hold,stay", d.toString());
        assertEquals("hold,learn,mode,stay,turn", ShieldDesign.parse("all").toString());
        assertEquals(ShieldMode.MAX_BASES, ShieldDesign.parse("turn").bases());
        assertThrows(IllegalArgumentException.class, () -> ShieldDesign.parse("hold,nope"));
    }

    // ---- SHIELD-8: no attack shots

    @Test
    @Tag("SHIELD-8")
    @DisplayName("3.12 fires at an idle enemy after 32 quiet ticks; with hold it points the gun and holds fire")
    void holdNeverAttacks() {
        mode("");
        scan(1);
        ShieldMode.Command fired = mode.tick(situation(40, ENEMY_Y, 100));
        assertTrue(fired.attack && fired.firePower > 0, "3.12 attacks an idle enemy");

        mode("hold");
        scan(1);
        for (long t = 2; t < 110; t++) {
            ShieldMode.Command c = mode.tick(situation(t, ENEMY_Y, 100));
            assertNotNull(c);
            assertEquals(0, c.firePower, 0, "no shot at tick " + t);
            assertFalse(c.attack);
        }
    }

    @Test
    @Tag("SHIELD-8")
    @DisplayName("with hold, a disabled enemy is still shot: it cannot fire back")
    void holdShootsADisabledEnemy() {
        mode("hold");
        scan(1);
        ShieldMode.Command c = mode.tick(situation(40, ENEMY_Y, 0));
        assertTrue(c.attack && c.firePower > 0);
    }

    // ---- SHIELD-9: learn from intercepts

    @Test
    @Tag("SHIELD-9")
    @DisplayName("an intercepted bullet's heading scores the predictors only with learn on")
    void learnFromIntercepts() {
        // The enemy aims 0.02 rad off head-on, every time. Two intercepts teach the offset
        // predictor; without learn, only hits would.
        double off = Math.PI + 0.02;
        for (String flags : new String[] {"", "learn"}) {
            mode(flags);
            scan(1);
            for (long f = 10; f <= 40; f += 30) {
                shot(f, 1.0);
                double[] p = headOnAt(f, f + 10, 1.0);
                mode.onIntercepted(f + 10, 1.0, p[0], p[1], off);
            }
            int best = mode.bestPredictor();
            if (flags.isEmpty()) {
                assertEquals(0, best, "nothing learnt: the plain head-on base is still first");
            } else {
                assertEquals(1, best / ShieldMode.BASES, "the learned-offset family is now best");
            }
        }
    }

    @Test
    @Tag("SHIELD-9")
    @DisplayName("an intercept with no heading (an older transcript) teaches nothing")
    void interceptWithoutHeading() {
        mode("learn");
        scan(1);
        shot(10, 1.0);
        double[] p = headOnAt(10, 20, 1.0);
        mode.onIntercepted(20, 1.0, p[0], p[1]);
        assertEquals(0, mode.bestPredictor());
        assertEquals(1, mode.intercepts());
    }

    // ---- SHIELD-10: the most frequent offset

    @Test
    @Tag("SHIELD-10")
    @DisplayName("one stray error moves the mean for good but not the most frequent offset")
    void modalOffsetIgnoresAStray() {
        // Three hits at +0.02 and one stray at -0.5: the mean is pulled to about -0.11, so the
        // offset predictor misses the next +0.02 bullet; the most frequent error still hits it.
        // Stay keeps the round on through the hits.
        for (String flags : new String[] {"stay", "stay,mode"}) {
            mode(flags);
            scan(1);
            hit(10, 30, 0.1, Math.PI + 0.02);
            hit(40, 60, 0.1, Math.PI + 0.02);
            hit(70, 90, 0.1, Math.PI - 0.5);
            hit(100, 120, 0.1, Math.PI + 0.02);
            hit(130, 150, 0.1, Math.PI + 0.02);
            String sb = lastSb();
            assertTrue(sb.startsWith("SB,0,150,"), sb);
            if (!flags.contains("mode")) {
                assertTrue(sb.endsWith(",0,0.10"), "the mean's predictor is not exact: " + sb);
            } else {
                assertTrue(sb.endsWith(",1,0.10"), "the most frequent offset is exact: " + sb);
            }
        }
    }

    // ---- SHIELD-11: no exits inside the round

    @Test
    @Tag("SHIELD-11")
    @DisplayName("with stay, a close enemy, a ram, a quiet enemy and unforeseen hits leave the mode on")
    void stayKeepsTheRound() {
        mode("stay");
        scan(1);
        mode.onEnemyShot(1, 0.1);
        assertNotNull(mode.tick(situation(2, MY_Y + 50, 100)), "close is no exit");
        mode.onRammed();
        assertTrue(mode.active(), "rammed is no exit");
        assertNotNull(mode.tick(situation(250, ENEMY_Y, 100)), "quiet is no exit");
        mode.onHitByBullet(260, 0.5, MY_X, MY_Y + 18, Math.PI / 2);
        mode.onHitByBullet(270, 0.5, MY_X, MY_Y + 18, Math.PI / 2);
        mode.onHitByBullet(280, 0.5, MY_X, MY_Y + 18, Math.PI / 2);
        assertTrue(mode.active(), "unpredicted and outhit are no exits");
        assertTrue(records.stream().noneMatch(r -> r.contains(",exit,")));
    }

    @Test
    @Tag("SHIELD-11")
    @DisplayName("with stay, more than 150 damage taken ends the mode for the battle")
    void stayLeavesAt150() {
        mode("stay");
        scan(1);
        // Power 3.0 does 16 damage: nine hits are 144, the tenth is 160.
        for (int i = 0; i < 9; i++) mode.onHitByBullet(10 + i, 3.0, MY_X, MY_Y, Math.PI);
        assertTrue(mode.active());
        mode.onHitByBullet(30, 3.0, MY_X, MY_Y, Math.PI);
        assertTrue(mode.battleOff());
        assertEquals("SH,0,30,off,damage", last());
        mode.newRound(1);
        scan(1);
        assertFalse(mode.active(), "never re-entered");
        mode.onRoundEnded(100);
        assertTrue(last().endsWith(",damage"), last());
    }

    @Test
    @Tag("SHIELD-11")
    @DisplayName("3.12 keeps shielding to its 370 budget; stay's 150 does not apply")
    void noStayNo150() {
        mode("");
        scan(1);
        for (int i = 0; i < 10; i++) mode.onHitByBullet(10 + 30 * i, 3.0, MY_X, MY_Y, Math.PI);
        assertFalse(mode.battleOff());
    }

    @Test
    @Tag("SHIELD-11")
    @DisplayName("with stay, an enemy that has not fired by tick 300 of a round ends the mode for the battle")
    void staySilentEnemy() {
        mode("stay");
        scan(1);
        assertNotNull(mode.tick(situation(299, ENEMY_Y, 100)));
        assertNull(mode.tick(situation(300, ENEMY_Y, 100)));
        assertTrue(mode.battleOff());
        assertEquals("SH,0,300,off,silent", last());
    }

    @Test
    @Tag("SHIELD-11")
    @DisplayName("an enemy that fired once this round is not silent")
    void firedIsNotSilent() {
        mode("stay");
        scan(1);
        mode.onEnemyShot(20, 1.0);
        assertNotNull(mode.tick(situation(400, ENEMY_Y, 100)));
        assertTrue(mode.active());
    }

    @Test
    @Tag("SHIELD-11")
    @DisplayName("a shot of unsure power (a wall hit on the same interval) still means the enemy is not silent")
    void unsureShotIsNotSilent() {
        mode("stay");
        scan(1);
        mode.onEnemyFired();
        assertNotNull(mode.tick(situation(400, ENEMY_Y, 100)));
        assertTrue(mode.active());
        assertFalse(mode.battleOff());
    }

    // ---- SHIELD-12: the body-turn base

    @Test
    @Tag("SHIELD-12")
    @DisplayName("a gun that adds its body turn to head-on is foreseen only by the body-turn base")
    void bodyTurnBase() {
        // The enemy turns 0.03 rad between the tick before firing and the firing tick, and its
        // bullet leaves head-on plus that turn.
        for (String flags : new String[] {"", "turn"}) {
            mode(flags);
            long fire = 20;
            mode.onScan(ENEMY, fire - 1, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
            mode.onScan(ENEMY, fire, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI + 0.03, 0);
            mode.onEnemyShot(fire, 0.1);
            double[] p = headOnAt(fire, fire + 20, 0.1);
            mode.onHitByBullet(fire + 20, 0.1, p[0], p[1], Math.PI + 0.03);
            String sb = lastSb();
            assertTrue(sb.contains(flags.isEmpty() ? ",0,0.10" : ",1,0.10"), flags + ": " + sb);
        }
    }

    // ---- SHIELD-14: waves from uncertain shots

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: the wall switch parses, stays out of 'all', and leaves SHIPPED off")
    void wallParses() {
        ShieldDesign d = ShieldDesign.parse("hold,wall");
        assertTrue(d.hold && d.wall);
        assertEquals("hold,wall", d.toString());
        assertFalse(ShieldDesign.parse("all").wall);
        assertFalse(ShieldDesign.SHIPPED.wall);
        assertFalse(ShieldDesign.NONE.wall);
        assertSame(ShieldDesign.NONE, ShieldDesign.parse(""));
    }

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: an uncertain wave matches a hit of another power by distance and time")
    void uncertainWaveMatchesByDistance() {
        mode("");
        scan(1);
        for (long t = 9; t <= 11; t++) scan(t);
        mode.onEnemyShot(10, 1.0, true); // guessed 1.0
        double[] p = headOnAt(10, 30, 2.0); // truly a power-2 bullet
        mode.onHitByBullet(30, 2.0, p[0], p[1], Math.PI);
        assertTrue(lastSb().startsWith("SB,0,30,first,0,"), lastSb());
    }

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: a sure wave still needs the exact power; an uncertain one is still limited by distance")
    void sureWaveNeedsPower() {
        mode("");
        scan(1);
        for (long t = 9; t <= 11; t++) scan(t);
        mode.onEnemyShot(10, 1.0);
        double[] p = headOnAt(10, 30, 2.0);
        mode.onHitByBullet(30, 2.0, p[0], p[1], Math.PI);
        assertTrue(lastSb().contains(",nowave,"), lastSb());

        mode("");
        scan(1);
        for (long t = 9; t <= 11; t++) scan(t);
        mode.onEnemyShot(10, 1.0, true);
        mode.onHitByBullet(30, 2.0, MY_X, MY_Y + 300, Math.PI); // far from where the wave is
        assertTrue(lastSb().contains(",nowave,"), lastSb());
    }

    // ---- the SB record

    @Test
    @Tag("SHIELD-5")
    @DisplayName("each hit taken from a listed opponent says why it got through")
    void hitClasses() {
        mode("");
        scan(1);
        hit(10, 30, 0.1, Math.PI);
        assertEquals("SB,0,30,first,0,1,0.10", records.get(records.size() - 1));
        hit(40, 60, 0.1, Math.PI);
        assertEquals("SB,0,60,unshielded,1,1,0.10", records.get(records.size() - 1));
        mode.onHitByBullet(70, 2.0, 0, 0, Math.PI);
        assertEquals("SB,0,70,nowave,-1,0,2.00", lastSb());
        assertFalse(mode.active(), "three hits and none shot down: the round's outhit exit");
        mode.onHitByBullet(80, 2.0, 0, 0, Math.PI);
        assertEquals("SB,0,80,off,-1,0,2.00", lastSb());
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("a bullet a shield was fired at and that still hit is 'missed'")
    void missedClass() {
        mode("");
        for (long t = 1; t <= 6; t++) scan(t);
        mode.onEnemyShot(6, 1.0);
        double gun = 0;
        double x = MY_X;
        long fired = -1;
        for (long t = 7; t < 40 && fired < 0; t++) {
            ShieldMode.Command c = mode.tick(new ShieldMode.Situation(t, x, MY_Y, Math.PI / 2, gun, 0,
                0.1, 100, ENEMY_X, ENEMY_Y, 100, 0, 1.9, false, true));
            if (c.firePower > 0 && !c.attack) fired = t;
            gun += c.gunTurn;
            x += c.ahead;
        }
        assertTrue(fired > 0, "a shield bullet left");
        double[] p = headOnAt(6, 30, 1.0);
        mode.onHitByBullet(30, 1.0, p[0], p[1], Math.PI);
        assertTrue(last().startsWith("SB,0,30,missed,0,"), last());
    }

    @Test
    @Tag("SHIELD-5")
    @DisplayName("an unlisted opponent writes no SB record")
    void unlistedWritesNothing() {
        mode("all");
        mode.onScan("other.Robot 1.0", 1, MY_X, MY_Y, 0, 0, ENEMY_X, ENEMY_Y, Math.PI, 0);
        mode.onHitByBullet(30, 1.0, MY_X, MY_Y, Math.PI);
        mode.onIntercepted(31, 1.0, MY_X, MY_Y, Math.PI);
        assertEquals(List.of(), records);
    }
}
