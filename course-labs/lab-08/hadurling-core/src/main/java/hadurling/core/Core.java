package hadurling.core;

import hadurling.core.gun.GuessFactorGun;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.model.Wave;
import hadurling.core.move.Orbit;
import hadurling.core.move.Surfer;
import hadurling.core.physics.Angles;
import hadurling.core.physics.Rules;

/**
 * Hadurling's decisions, with no Robocode in it: an {@link Input} goes in, {@link Orders}
 * come out. It lines up four small parts: the radar lock (here), a {@link GuessFactorGun},
 * an {@link Orbit} and a {@link Surfer}. It remembers between ticks, so make one per round.
 *
 * <p>Since lab 08 it sees the enemy's shots the way the enemy's energy shows them: if the
 * enemy has lost between 0.1 and 3.0 energy since the last scan, it fired a bullet of that
 * power, and the bullet is a {@link Wave} for the surfer. That rule is naive (our own hits
 * also make the enemy lose energy), and lab 09 replaces it.</p>
 *
 * <p>It may throw, like any code. The {@link Guard} around it makes sure the robot still gets
 * orders when it does.</p>
 */
public final class Core {

    /** After a wall hit the orbit's direction is left alone for this many ticks. */
    static final int WALL_COOLDOWN = 20;

    private final GuessFactorGun gun = new GuessFactorGun();
    private final Orbit orbit = new Orbit();
    private final Surfer surfer = new Surfer();
    /** The tick of the last scan, or a long time ago before the first. */
    private long lastScanTime = -100;
    private long lastWallHit = -100;
    /** Our state and the enemy's, as of the last scan, for working out where its shot began. */
    private Input lastScanInput;
    private double lastEnemyEnergy = Double.NaN;
    private double lastEnemyX;
    private double lastEnemyY;

    /**
     * Decides what to do this tick.
     *
     * @param in what the robot knows now
     * @return the orders for this tick, never null
     */
    public Orders tick(Input in) {
        Event.Scan scan = null;
        for (Event e : in.events()) {
            if (e instanceof Event.HitWall) {
                orbit.reverse();
                lastWallHit = in.time();
            }
            if (e instanceof Event.HitByBullet) surfer.hitBy(in);
            if (e instanceof Event.Scan) scan = (Event.Scan) e;
        }
        surfer.advance(in);
        if (in.time() - lastWallHit > WALL_COOLDOWN) orbit.face(surfer.choose(in, orbit.direction()));

        Orders.Builder orders = Orders.builder().ahead(orbit.ahead());
        if (scan == null) {
            // Nothing seen this tick. Sweep if we have lost the enemy; otherwise the radar is
            // already turning toward where it was, so leave it alone (NaN).
            if (in.time() - lastScanTime > 2) orders.radarTurn(Double.POSITIVE_INFINITY);
            return orders.build();
        }

        double enemyDirection = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        watchEnemyEnergy(in, scan, enemyDirection);
        lastScanTime = in.time();

        // Radar lock: turn twice as far as needed so the radar overshoots and sweeps back.
        orders.radarTurn(2 * Angles.normalRelativeAngle(enemyDirection - in.radarHeading()));
        orders.bodyTurn(orbit.bodyTurn(scan.bearing()));
        gun.observe(in, scan);
        GuessFactorGun.Aim aim = gun.aim(in, scan);
        orders.gunTurn(aim.turn());
        orders.fire(aim.power());
        return orders.build();
    }

    /**
     * The naive shot detector: an energy drop in [0.1, 3.0] since the last scan is a bullet.
     * The wave starts where the enemy was at the last scan, aimed at where we were then.
     */
    private void watchEnemyEnergy(Input in, Event.Scan scan, double enemyDirection) {
        boolean fresh = lastScanInput != null && in.time() - lastScanTime <= 2;
        double drop = lastEnemyEnergy - scan.energy();
        if (fresh && drop >= Rules.MIN_BULLET_POWER && drop <= Rules.MAX_BULLET_POWER) {
            double toUs = Angles.absoluteBearing(lastEnemyX, lastEnemyY, lastScanInput.x(), lastScanInput.y());
            double lateral = lastScanInput.velocity() * Math.sin(lastScanInput.heading() - toUs);
            surfer.enemyFired(new Wave(lastEnemyX, lastEnemyY, lastScanTime, drop, toUs, Wave.direction(lateral)));
        }
        lastScanInput = in;
        lastEnemyEnergy = scan.energy();
        lastEnemyX = Angles.projectX(in.x(), enemyDirection, scan.distance());
        lastEnemyY = Angles.projectY(in.y(), enemyDirection, scan.distance());
    }

    /** @return the enemy waves the surfer is watching, for tests */
    int enemyWaves() {
        return surfer.waves();
    }

    /** @return the shots the gun has learned from, for tests */
    int gunSamples() {
        return gun.samples();
    }
}
