package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MGUN-21: aiming at the enemy leader once its death pays. */
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
}
