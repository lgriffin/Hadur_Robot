package hadurling.core;

import hadurling.core.gun.GuessFactorGun;
import hadurling.core.ledger.EnergyLedger;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.model.Wave;
import hadurling.core.move.Orbit;
import hadurling.core.move.Surfer;
import hadurling.core.physics.Angles;

/**
 * Hadurling's decisions, with no Robocode in it: an {@link Input} goes in, {@link Orders}
 * come out. It lines up four small parts: the radar lock (here), a {@link GuessFactorGun},
 * an {@link Orbit} and a {@link Surfer}. It remembers between ticks, so make one per round.
 *
 * <p>It sees the enemy's shots through an {@link EnergyLedger}: the ledger takes our hits,
 * the enemy's refunds and wall damage out of each energy drop, and only a drop it cannot
 * explain, if it is a legal bullet power, becomes a {@link Wave} for the surfer (HL-13).
 * Lab 08 read every drop between 0.1 and 3.0 as a shot, which our own hits fooled.</p>
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
    private final EnergyLedger ledger = new EnergyLedger();
    /** The tick of the last scan, or a long time ago before the first. */
    private long lastScanTime = -100;
    private long lastWallHit = -100;
    /** Our state and the enemy's, as of the last scan, for working out where its shot began. */
    private Input lastScanInput;
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
            if (e instanceof Event.HitByBullet) {
                surfer.hitBy(in);
                ledger.enemyBulletHitUs(((Event.HitByBullet) e).power());
            }
            if (e instanceof Event.BulletHit) ledger.ourBulletHit(((Event.BulletHit) e).power());
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
     * Asks the ledger whether the enemy fired since the last scan. If so, the wave starts where
     * the enemy was at the last scan, aimed at where we were then.
     */
    private void watchEnemyEnergy(Input in, Event.Scan scan, double enemyDirection) {
        EnergyLedger.Reading reading = ledger.scan(scan.energy(), scan.velocity());
        boolean fresh = lastScanInput != null && in.time() - lastScanTime <= 2;
        if (fresh && reading.shot()) {
            double power = Math.max(EnergyLedger.MIN_SHOT, Math.min(EnergyLedger.MAX_SHOT, reading.corrected()));
            double toUs = Angles.absoluteBearing(lastEnemyX, lastEnemyY, lastScanInput.x(), lastScanInput.y());
            double lateral = lastScanInput.velocity() * Math.sin(lastScanInput.heading() - toUs);
            surfer.enemyFired(new Wave(lastEnemyX, lastEnemyY, lastScanTime, power, toUs, Wave.direction(lateral)));
        }
        lastScanInput = in;
        lastEnemyX = Angles.projectX(in.x(), enemyDirection, scan.distance());
        lastEnemyY = Angles.projectY(in.y(), enemyDirection, scan.distance());
    }

    /** @return the enemy waves the surfer is watching; tests and scenarios read it */
    public int enemyWaves() {
        return surfer.waves();
    }

    /** @return the shots the gun has learned from, for tests */
    int gunSamples() {
        return gun.samples();
    }
}
