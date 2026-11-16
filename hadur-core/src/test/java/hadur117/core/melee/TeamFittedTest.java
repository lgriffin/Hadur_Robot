package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T7: fitted enemy aims (TMODE-50). */
class TeamFittedTest {

    private static RobotStateLog track(double x0, double y0, double heading, double v, int ticks) {
        RobotStateLog log = new RobotStateLog();
        for (int t = 0; t <= ticks; t++) {
            log.addState(RobotState.newBuilder()
                .setLocation(new Point2D.Double(x0 + Math.sin(heading) * v * t, y0 + Math.cos(heading) * v * t))
                .setHeading(heading).setVelocity(v).setTime(t).build());
        }
        return log;
    }

    @Test
    @Tag("TMODE-50")
    @DisplayName("TMODE-50: a head-on fit with a lag aims at where the member stood that many ticks before the fire tick")
    void headOnLag() {
        RobotStateLog log = track(400, 300, Math.PI / 2, 8, 20);
        EnemyShot shot = new EnemyShot("kawigi.micro.Shiz 1.1 (2)", new Point2D.Double(400, 700), 20, 2.0);
        TeamModes.FittedAim fit = new TeamModes.FittedAim(6, 0, 0.0, 0.0, 0.65);
        double h = TeamDodge.fittedHeading(fit, shot, log.getState(20), log);
        Point2D.Double then = log.getState(14).location;
        assertEquals(Math.atan2(then.x - 400, then.y - 700), h, 1e-9);
    }

    @Test
    @Tag("TMODE-50")
    @DisplayName("TMODE-50: a linear fit leads by a(+b d/1200) asin(v_lat / s) at its fixed speed")
    void linearScaled() {
        RobotStateLog log = track(400, 300, Math.PI / 2, 8, 20);
        EnemyShot shot = new EnemyShot("rz.HOFMember 1.1", new Point2D.Double(400, 900), 20, 2.0);
        TeamModes.FittedAim fit = new TeamModes.FittedAim(0, 13, 1.0, -1.0, 0.45);
        RobotState at = log.getState(20);
        double bearing = Math.atan2(at.location.x - 400, at.location.y - 900);
        double d = shot.source.distance(at.location);
        double lateral = 8 * Math.sin(Math.PI / 2 - bearing);
        assertEquals(bearing + (1 - d / 1200) * Math.asin(lateral / 13), TeamDodge.fittedHeading(fit, shot, at, log), 1e-9);
    }

    @Test
    @Tag("TMODE-50")
    @DisplayName("TMODE-50: on in the shipped build; the table names the eight fitted teams' member classes, no others")
    void shippedOn() {
        assertTrue(TeamModes.FORCE_FITTED);
        assertNotNull(TeamModes.fitted("kawigi.micro.Shiz 1.1 (1)"));
        assertNull(TeamModes.fitted("cz.libors.Ogi v1 (1)"));
        for (String c : new String[] {"kawigi.micro.Shiz", "gh.nano.GrofGroupMember", "radnor.DoctorBobTeam", "rz.HOFMember",
                "tmnr.Leonardo", "ags.polylunar.Luna", "myl.micro.Troodon", "jeremyreeder.collective.Prophet"}) {
            assertNotNull(TeamModes.FITTED.get(c), c);
            assertTrue(TeamModes.FITTED.get(c).share > 0 && TeamModes.FITTED.get(c).share < 1, c);
        }
    }
}
