package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MGUN-21 and TMODE-31: aiming at the enemy leader, and at the eyes of a droid team. */
class FieldGunDecapTest {

    private final FieldGun gun = new FieldGun(field(1200, 1200));
    private final EnemyTracker tracker = new EnemyTracker();

    @Test
    @Tag("MGUN-21")
    @DisplayName("MGUN-21 ships off")
    void shipsOff() {
        assertFalse(FieldGun.DECAP);
    }

    @Test
    @Tag("MGUN-21")
    @DisplayName("MGUN-21: the leader is the robot first seen above 150 energy; a fresh one is not worth it, a worn one is")
    void leaderWhenItPays() {
        EnemyInfo leader = scan(tracker, "a.Lead (1)", 300, 300, 200, 1);
        EnemyInfo droid = scan(tracker, "a.Droid (2)", 600, 300, 120, 1);
        EnemyInfo m3 = scan(tracker, "a.M (3)", 900, 300, 100, 1);
        EnemyInfo m4 = scan(tracker, "a.M (4)", 300, 900, 100, 1);
        List<EnemyInfo> all = List.of(leader, droid, m3, m4);
        assertFalse(gun.decapitates(leader, all), "200 energy against a 90 drain");
        assertFalse(gun.decapitates(droid, all), "a droid is not the leader");
        // Later: the leader at 80, its three mates able to lose 30 each (90).
        leader = scan(tracker, "a.Lead (1)", 300, 300, 80, 400);
        assertTrue(gun.decapitates(leader, List.of(leader, droid, m3, m4)));
        // Its mates nearly dead: the drain is what they have left, 3 + 2 = 5.
        m3 = scan(tracker, "a.M (3)", 900, 300, 3, 500);
        m4 = scan(tracker, "a.M (4)", 300, 900, 2, 500);
        assertFalse(gun.decapitates(leader, List.of(leader, m3, m4)));
        leader = scan(tracker, "a.Lead (1)", 300, 300, 4, 600);
        assertTrue(gun.decapitates(leader, List.of(leader, m3, m4)));
    }

    @Test
    @Tag("MGUN-21")
    @DisplayName("MGUN-21: a new round forgets who led")
    void newRound() {
        EnemyInfo a = scan(tracker, "a.Lead (1)", 300, 300, 200, 1);
        EnemyInfo b = scan(tracker, "a.M (2)", 600, 300, 100, 1);
        gun.decapitates(a, List.of(a, b));
        gun.newRound();
        a = scan(tracker, "a.Lead (1)", 300, 300, 10, 2);
        b = scan(tracker, "a.M (2)", 600, 300, 100, 2);
        assertFalse(gun.decapitates(a, List.of(a, b)), "first seen at 10 this round");
    }

    @Test
    @Tag("TMODE-31")
    @DisplayName("TMODE-31: LEAD ships table-only and off by default")
    void leadOff() {
        assertFalse(TeamModes.FORCE_LEAD);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.LEAD));
    }

    @Test
    @Tag("TMODE-31")
    @DisplayName("TMODE-31: the leader weighs 4x; with a droid alive, every scanner weighs 2.5x and the droids 1x")
    void leadFactor() {
        EnemyInfo leader = scan(tracker, "a.Lead (1)", 300, 300, 200, 1);
        EnemyInfo scanner = scan(tracker, "a.Eye (2)", 600, 300, 100, 1);
        EnemyInfo droid = scan(tracker, "a.Droid (3)", 900, 300, 120, 1);
        List<EnemyInfo> all = List.of(leader, scanner, droid);
        assertEquals(FieldGun.LEAD_BOOST, gun.leadFactor(leader, all), 1e-12);
        assertEquals(FieldGun.EYES_BOOST, gun.leadFactor(scanner, all), 1e-12);
        assertEquals(1.0, gun.leadFactor(droid, all), 1e-12);
        // The droids gone: a scanner is just a robot again.
        assertEquals(1.0, gun.leadFactor(scanner, List.of(leader, scanner)), 1e-12);
    }

    @Test
    @Tag("TMODE-31")
    @DisplayName("TMODE-31: a leader scanned at 200 stays the leader when LEAD first weighs it after it is worn down")
    void leaderFromFirstScan() {
        EnemyInfo leader = scan(tracker, "a.Lead (1)", 300, 300, 200, 1);
        gun.onScan(leader, 500, 1);
        leader = scan(tracker, "a.Lead (1)", 300, 300, 80, 400);
        EnemyInfo m = scan(tracker, "a.M (2)", 600, 300, 100, 400);
        assertEquals(FieldGun.LEAD_BOOST, gun.leadFactor(leader, List.of(leader, m)), 1e-12);
    }
}
