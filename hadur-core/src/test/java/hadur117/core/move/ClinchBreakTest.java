package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.BotOrders;
import hadur117.core.model.RobotState;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-75's contact break on an 800 x 600 field. */
class ClinchBreakTest {

    static final BattleField FIELD = new BattleField(800, 600);

    private static RobotState state(double x, double y, double heading) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(x, y))
            .setHeading(heading).setVelocity(0).setTime(0).build();
    }

    @Test
    @Tag("MOVE-75")
    @DisplayName("on inside 62 px, kept until 110 px, off again after")
    void latch() {
        ClinchBreak c = new ClinchBreak(FIELD);
        assertFalse(c.update(80));
        assertTrue(c.update(61));
        assertTrue(c.update(109));
        assertFalse(c.update(111));
        assertTrue(c.update(50));
        c.initRound();
        assertFalse(c.update(100));
    }

    @Test
    @Tag("MOVE-75")
    @DisplayName("in the open the heading is straight away from the enemy")
    void open() {
        ClinchBreak c = new ClinchBreak(FIELD);
        Point2D.Double me = new Point2D.Double(400, 300);
        Point2D.Double enemy = new Point2D.Double(440, 300);
        assertEquals(-Math.PI / 2, Angles.normalRelativeAngle(c.heading(me, enemy)), 1e-9);
    }

    @Test
    @Tag("MOVE-75")
    @DisplayName("pinned by a wall, the heading runs along it and never points into the enemy")
    void pinned() {
        ClinchBreak c = new ClinchBreak(FIELD);
        // The traced clinch: we sit 37 px from the west wall, the enemy south-east of us.
        Point2D.Double me = new Point2D.Double(55, 97);
        Point2D.Double enemy = new Point2D.Double(91, 67);
        double h = c.heading(me, enemy);
        double offEnemy = Math.abs(Angles.normalRelativeAngle(h - DiaUtils.absoluteBearing(me, enemy)));
        assertTrue(offEnemy > Math.PI / 2, "away from the enemy");
        Point2D.Double end = DiaUtils.project(me, h, Math.min(ClinchBreak.RUN, c.wallRun(me, h)));
        assertTrue(end.distance(enemy) > 140, "a full run, not a 48 px dash into the wall: " + end);
        assertTrue(end.y > me.y, "north along the wall");
    }

    @Test
    @Tag("MOVE-75")
    @DisplayName("the end of the robot that points away from the enemy leads")
    void leadingEnd() {
        ClinchBreak c = new ClinchBreak(FIELD);
        Point2D.Double enemy = new Point2D.Double(440, 300);
        // Facing the enemy: reverse out, no turn.
        BotOrders.Builder o = BotOrders.builder();
        c.move(o, state(400, 300, Math.PI / 2), enemy);
        assertTrue(o.build().ahead() < 0);
        assertEquals(0, o.build().bodyTurn(), 1e-9);
        assertEquals(8.0, o.build().maxVelocity(), 1e-12);
        // Facing away: drive on.
        o = BotOrders.builder();
        c.move(o, state(400, 300, -Math.PI / 2), enemy);
        assertTrue(o.build().ahead() > 0);
        // Pinned, front 10 degrees off the wall run but 80 degrees off the enemy's bearing: the back leads.
        Point2D.Double me = new Point2D.Double(55, 97);
        Point2D.Double corner = new Point2D.Double(91, 67);
        double toEnemy = DiaUtils.absoluteBearing(me, corner);
        o = BotOrders.builder();
        c.move(o, state(me.x, me.y, toEnemy + Math.toRadians(80)), corner);
        assertTrue(o.build().ahead() < 0, "the front points at the enemy");
    }
}
