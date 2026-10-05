package hadur2.core.world;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.physics.BattleField;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** A5: the World keeps a shot as long as the slowest bullet takes to cross the field. */
class ShotLifetimeTest {

    @Test
    @DisplayName("130 ticks on a melee's 1000 x 1000 field and below, 155 on the team field")
    void derivedFromTheField() {
        assertEquals(130, new EnemyTracker(new BattleField(1000, 1000)).shotLifetime());
        assertEquals(130, new EnemyTracker(new BattleField(800, 600)).shotLifetime());
        assertEquals(155, new EnemyTracker(new BattleField(1200, 1200)).shotLifetime());
        assertEquals(130, new EnemyTracker().shotLifetime());
    }
}
