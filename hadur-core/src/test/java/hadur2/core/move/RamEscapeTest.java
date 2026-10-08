package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-2: the escape keeps a charging rammer further away than standing, orbiting or the 3.4 response. */
class RamEscapeTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    private static RobotState state(double x, double y, double heading, double velocity, long time) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(x, y))
            .setHeading(heading).setVelocity(velocity).setTime(time).build();
    }

    /**
     * Plays a pure-pursuit rammer at full speed against us driven by {@code escape} for
     * {@code ticks} ticks and returns the closest it came.
     */
    private static double closestApproach(RobotState me, RobotState rammer, int ticks) {
        RamEscape escape = new RamEscape(FIELD, PREDICTOR);
        double min = Double.POSITIVE_INFINITY;
        double ex = rammer.location.x;
        double ey = rammer.location.y;
        double eh = rammer.heading;
        double ev = rammer.velocity;
        for (int t = 0; t < ticks; t++) {
            RobotState enemy = state(ex, ey, eh, ev, me.time);
            BotOrders.Builder orders = BotOrders.builder();
            escape.move(orders, me, enemy);
            BotOrders o = orders.build();
            me = PREDICTOR.predict(me, o.ahead(), o.bodyTurn(), o.maxVelocity(), 1, false);
            double want = Math.atan2(me.location.x - ex, me.location.y - ey);
            double turn = Rules.getTurnRateRadians(ev);
            eh += DiaUtils.limit(-turn, Angles.normalRelativeAngle(want - eh), turn);
            ev = Math.min(8, ev + 1);
            ex = DiaUtils.limit(18, ex + Math.sin(eh) * ev, 782);
            ey = DiaUtils.limit(18, ey + Math.cos(eh) * ev, 582);
            min = Math.min(min, me.location.distance(ex, ey));
        }
        return min;
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: in open field the escape keeps a pursuing rammer beyond 100 px for 60 ticks")
    void openFieldKeepsTheRammerOut() {
        RobotState me = state(400, 300, 0, 0, 0);
        RobotState rammer = state(400, 120, 0, 8, 0);
        double min = closestApproach(me, rammer, 60);
        assertTrue(min > 100, "closest approach " + min + " px; a rammer fires inside 100 px");
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: from a wall the escape still slides away rather than being pinned")
    void fromAWallItSlidesAway() {
        // Backed against the bottom wall with the rammer coming straight down at us.
        RobotState me = state(400, 40, Math.PI / 2, 0, 0);
        RobotState rammer = state(400, 250, Math.PI, 8, 0);
        double min = closestApproach(me, rammer, 40);
        assertTrue(min > 60, "closest approach " + min + " px");
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: the drive is full speed, back-as-front")
    void fullSpeedBackAsFront() {
        RamEscape escape = new RamEscape(FIELD, PREDICTOR);
        BotOrders.Builder orders = BotOrders.builder();
        escape.move(orders, state(400, 300, 0, 0, 0), state(400, 150, 0, 8, 0));
        BotOrders o = orders.build();
        assertEquals(8.0, o.maxVelocity());
        assertTrue(Math.abs(o.bodyTurn()) <= Math.PI / 2 + 1e-9, "never turns more than a quarter: " + o);
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: the same inputs choose the same heading (CORE-2)")
    void deterministic() {
        RobotState me = state(300, 200, 1.0, 5, 10);
        RobotState rammer = state(420, 330, 4.0, 8, 10);
        double a = new RamEscape(FIELD, PREDICTOR).choose(me, rammer);
        double b = new RamEscape(FIELD, PREDICTOR).choose(me, rammer);
        assertEquals(a, b);
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: a rammer charging in reverse is played along its direction of travel")
    void reversingRammerIsPlayedTheWayItTravels() {
        RobotState me = state(400, 300, 0, 0, 0);
        // Heading south, away from us, but driving backward: it travels north, at us.
        RobotState backward = state(400, 150, Math.PI, -8, 0);
        RobotState forward = state(400, 150, 0, 8, 0);
        assertEquals(new RamEscape(FIELD, PREDICTOR).choose(me, forward),
            new RamEscape(FIELD, PREDICTOR).choose(me, backward), 1e-9);
    }

    @Test
    @Tag("RAM-2")
    @DisplayName("RAM-2: the chosen heading points away from the rammer, not toward it")
    void headsAway() {
        RobotState me = state(400, 300, 0, 0, 0);
        RobotState rammer = state(400, 150, 0, 8, 0);
        double h = new RamEscape(FIELD, PREDICTOR).choose(me, rammer);
        double toRammer = DiaUtils.absoluteBearing(me.location, rammer.location);
        assertTrue(Math.abs(Angles.normalRelativeAngle(h - toRammer)) > Math.PI / 2,
            "heading " + h + " vs bearing to the rammer " + toRammer);
    }

    @Test
    @Tag("RAM-4")
    @DisplayName("RAM-4: in open field the escape crosses the rammer's line of fire instead of running straight down it")
    void crossesTheLineOfFire() {
        RobotState me = state(400, 300, 0, 0, 0);
        RobotState rammer = state(400, 120, 0, 8, 0);
        double h = new RamEscape(FIELD, PREDICTOR).choose(me, rammer);
        double away = DiaUtils.absoluteBearing(rammer.location, me.location);
        double off = Math.abs(Angles.normalRelativeAngle(h - away));
        assertTrue(off > Math.PI / 8 && off < Math.PI / 2 + 1e-9,
            "heading " + h + " is " + Math.toDegrees(off) + " degrees off straight away; it should cross, still moving away");
    }

    @Test
    @Tag("RAM-4")
    @DisplayName("RAM-4: crossing never gives up more than the slack, nor the ram range, against the best run")
    void crossingKeepsTheRammerOut() {
        RobotState me = state(400, 300, 0, 0, 0);
        RobotState rammer = state(400, 120, 0, 8, 0);
        assertTrue(closestApproach(me, rammer, 60) > RamEscape.SAFE - 20,
            "a rammer fires inside 100 px; the crossing run must still keep it out");
    }

    @Test
    @Tag("RAM-4")
    @DisplayName("RAM-4: over a long chase our bearing from the rammer keeps moving")
    void bearingKeepsMoving() {
        RamEscape escape = new RamEscape(FIELD, PREDICTOR);
        RobotState me = state(400, 300, 0, 0, 0);
        double ex = 400, ey = 120, eh = 0, ev = 8;
        double moved = 0;
        double last = Math.atan2(me.location.x - ex, me.location.y - ey);
        for (int t = 0; t < 40; t++) {
            BotOrders.Builder orders = BotOrders.builder();
            escape.move(orders, me, state(ex, ey, eh, ev, t));
            BotOrders o = orders.build();
            me = PREDICTOR.predict(me, o.ahead(), o.bodyTurn(), o.maxVelocity(), 1, false);
            double want = Math.atan2(me.location.x - ex, me.location.y - ey);
            double turn = Rules.getTurnRateRadians(ev);
            eh += DiaUtils.limit(-turn, Angles.normalRelativeAngle(want - eh), turn);
            ex = DiaUtils.limit(18, ex + Math.sin(eh) * ev, 782);
            ey = DiaUtils.limit(18, ey + Math.cos(eh) * ev, 582);
            double b = Math.atan2(me.location.x - ex, me.location.y - ey);
            moved += Math.abs(Angles.normalRelativeAngle(b - last));
            last = b;
        }
        assertTrue(moved > 0.5, "bearing moved " + moved + " rad over 40 ticks");
    }
}
