package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.MovementPredictor;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MIR-1: the planned path is followed exactly, stays clear of walls and centre, and the aim hits its mirror. */
class MirrorDriveTest {

    static final BattleField FIELD = new BattleField(800, 600);
    static final MovementPredictor PREDICTOR = new MovementPredictor(FIELD);

    private static RobotState start() {
        return RobotState.newBuilder().setLocation(new Point2D.Double(150, 120))
            .setHeading(0.3).setVelocity(0).setTime(0).build();
    }

    /** Drives the plan for {@code ticks} ticks, as the engine would, and returns the end state. */
    private static RobotState drive(MirrorDrive drive, RobotState me, int ticks, Set<Long> remade) {
        for (int t = 0; t < ticks; t++) {
            Point2D.Double planned = drive.plannedLocation(me.time + 1);
            BotOrders.Builder orders = BotOrders.builder();
            drive.move(orders, me);
            Point2D.Double nowPlanned = drive.plannedLocation(me.time + 1);
            if (planned == null || !planned.equals(nowPlanned)) remade.add(me.time);
            BotOrders o = orders.build();
            me = PREDICTOR.predict(me, o.ahead(), o.bodyTurn(), o.maxVelocity(), 1, false);
        }
        return me;
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: driven as ordered, the robot is exactly where the plan said, so the plan is never remade")
    void planIsFollowedExactly() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        Set<Long> remade = new HashSet<>();
        drive(drive, start(), 600, remade);
        assertEquals(Set.of(0L), remade, "only the first tick should make a plan");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: the plan keeps clear of the walls and the field's centre")
    void clearOfWallsAndCentre() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        RobotState me = start();
        for (int t = 0; t < 2000; t++) {
            BotOrders.Builder orders = BotOrders.builder();
            drive.move(orders, me);
            BotOrders o = orders.build();
            me = PREDICTOR.predict(me, o.ahead(), o.bodyTurn(), o.maxVelocity(), 1, false);
            if (t > 40) {
                assertTrue(me.location.x >= 18 && me.location.x <= 782
                    && me.location.y >= 18 && me.location.y <= 582, "inside the field at " + t);
                assertTrue(me.location.distance(400, 300) > 60, "away from the centre at " + t);
            }
        }
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: the plan changes direction often, so a linear gun cannot follow it")
    void changesDirection() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        RobotState me = start();
        int reversals = 0;
        double lastSign = 0;
        for (int t = 0; t < 600; t++) {
            BotOrders.Builder orders = BotOrders.builder();
            drive.move(orders, me);
            BotOrders o = orders.build();
            me = PREDICTOR.predict(me, o.ahead(), o.bodyTurn(), o.maxVelocity(), 1, false);
            double sign = Math.signum(o.ahead());
            if (lastSign != 0 && sign != lastSign) reversals++;
            lastSign = sign;
        }
        assertTrue(reversals >= 8, "only " + reversals + " reversals in 600 ticks");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: a bullet aimed at the mirror of the plan meets a robot that mirrors it")
    void aimMeetsTheMirror() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        RobotState me = start();
        Set<Long> remade = new HashSet<>();
        me = drive(drive, me, 50, remade);
        drive.follow(me);
        Point2D.Double from = drive.plannedLocation(me.time + 1);
        assertNotNull(from);
        double power = 2.0;
        double speed = Rules.getBulletSpeed(power);
        int lag = 2;
        java.util.Map<Long, Point2D.Double> past = new java.util.HashMap<>();
        past.put(me.time, me.location);
        double angle = drive.aim(from, me.time + 1, speed, lag,
            p -> new Point2D.Double(800 - p.x, 600 - p.y), past::get);
        assertFalse(Double.isNaN(angle));
        // Fly the bullet against a perfect lagged mirror of the plan.
        boolean hit = false;
        for (int k = 1; k <= 110 && !hit; k++) {
            Point2D.Double us = drive.plannedLocation(me.time + 1 + k - lag);
            if (us == null) us = past.get(me.time + 1 + k - lag);
            Point2D.Double enemy = new Point2D.Double(800 - us.x, 600 - us.y);
            Point2D.Double bullet = DiaUtils.project(from, angle, speed * k);
            hit = Math.abs(bullet.x - enemy.x) <= 18 && Math.abs(bullet.y - enemy.y) <= 18;
        }
        assertTrue(hit, "the shot should meet the mirror image");
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: knocked off the plan, the drive remakes it from where the robot really is")
    void remadeAfterDrift() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        RobotState me = start();
        BotOrders.Builder orders = BotOrders.builder();
        drive.move(orders, me);
        RobotState bumped = RobotState.newBuilder().setLocation(new Point2D.Double(300, 300))
            .setHeading(1.0).setVelocity(0).setTime(1).build();
        drive.follow(bumped);
        Point2D.Double next = drive.plannedLocation(2);
        assertNotNull(next);
        assertTrue(next.distance(300, 300) <= 8.0 + 1e-9, "the new plan starts from the bump: " + next);
    }

    @Test
    @Tag("MIR-1")
    @DisplayName("MIR-1: the aim answers NaN when the plan cannot reach the shot's arrival")
    void nanWithoutAPlan() {
        MirrorDrive drive = new MirrorDrive(FIELD, PREDICTOR);
        assertTrue(Double.isNaN(drive.aim(new Point2D.Double(100, 100), 1, 14, 2,
            p -> p, t -> null)));
    }
}
