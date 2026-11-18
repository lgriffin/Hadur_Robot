package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TMODE-52: a wave counts as close while its front lands on the member within CLOSE_TICKS. */
class TeamCloseRerankTest {

    private static MinimumRiskMovement.Wave wave(double distance, long fireTime, double power) {
        EnemyShot s = new EnemyShot("e.Enemy 1", new Point2D.Double(100, 100 + distance), fireTime, power);
        return new MinimumRiskMovement.Wave(s, 1.0, new double[] {Math.PI}, new double[] {1.0}, Math.PI);
    }

    @Test
    @Tag("TMODE-52")
    @DisplayName("a wave landing within 35 ticks is close; one further out, one past, or none is not; on in the shipped build")
    void closeWaves() {
        Point2D.Double me = new Point2D.Double(100, 100);
        double speed = 20 - 3 * 2.0;
        assertEquals(35, TeamDodge.CLOSE_TICKS);
        assertEquals(40, TeamDodge.CLOSE_RERANK);
        assertTrue(MinimumRiskMovement.closeWave(me, 0, List.of(wave(speed * 30, 0, 2.0))));
        assertFalse(MinimumRiskMovement.closeWave(me, 0, List.of(wave(speed * 40, 0, 2.0))));
        assertTrue(MinimumRiskMovement.closeWave(me, 10, List.of(wave(speed * 40, 0, 2.0))));
        assertFalse(MinimumRiskMovement.closeWave(me, 50, List.of(wave(speed * 40, 0, 2.0))), "front already past");
        assertFalse(MinimumRiskMovement.closeWave(me, 0, List.of()));
        assertTrue(TeamModes.FORCE_CLOSERERANK);
    }
}
