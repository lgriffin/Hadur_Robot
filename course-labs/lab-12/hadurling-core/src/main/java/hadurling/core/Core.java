package hadurling.core;

import hadurling.core.gun.GuessFactorGun;
import hadurling.core.ledger.EnergyLedger;
import hadurling.core.memory.LineageKey;
import hadurling.core.memory.Profile;
import hadurling.core.memory.ProfileLibrary;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.model.Wave;
import hadurling.core.move.Orbit;
import hadurling.core.move.Surfer;
import hadurling.core.physics.Angles;
import hadurling.core.policy.Estimate;
import hadurling.core.policy.Evidence;
import hadurling.core.policy.PowerPolicy;
import hadurling.core.policy.SeedTrust;
import java.util.List;

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
 * <p>With a {@link ProfileLibrary} it also remembers opponents between battles (HL-23): at the
 * first scan of a round it loads the opponent's profile and seeds the gun with it, and the
 * adapter calls {@link #roundEnded()} to save what the round taught. Without a library it
 * remembers nothing, as before.</p>
 *
 * <p>It acts on what it knows only as far as it is sure (HL-27 to HL-30). Two {@link Evidence}
 * windows count how often our shots and theirs have landed in this battle. The
 * {@link PowerPolicy} fires full power only when both rates are certain, and a
 * {@link SeedTrust} fades the profile's seed if the live hit rate disagrees with it.</p>
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

    private final ProfileLibrary library;
    private final Evidence evidence;
    /** Judges the seed against live evidence; null until a profile with a seed is loaded. */
    private SeedTrust trust;
    /** The opponent's profile as loaded at the first scan; null until then, or without a library. */
    private Profile profile;
    private int ourShots;
    private int ourHits;
    private int theirShots;
    private int theirHits;

    /** A core with no memory, and no evidence from earlier rounds. */
    public Core() {
        this(null, new Evidence());
    }

    /**
     * A core that remembers opponents, with no evidence from earlier rounds.
     *
     * @param library where profiles are kept; may be null for no memory
     */
    public Core(ProfileLibrary library) {
        this(library, new Evidence());
    }

    /**
     * A core that remembers opponents and carries this battle's evidence from round to round.
     *
     * @param library where profiles are kept; may be null for no memory
     * @param evidence this battle's hit windows; the robot keeps one for the whole battle
     */
    public Core(ProfileLibrary library, Evidence evidence) {
        this.library = library;
        this.evidence = evidence;
    }

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
        for (boolean hit : surfer.advance(in)) {
            theirShots++;
            if (hit) theirHits++;
            evidence.theirs().record(hit);
        }
        if (in.time() - lastWallHit > WALL_COOLDOWN) orbit.face(surfer.choose(in, orbit.direction()));

        Orders.Builder orders = Orders.builder().ahead(orbit.ahead());
        if (scan == null) {
            // Nothing seen this tick. Sweep if we have lost the enemy; otherwise the radar is
            // already turning toward where it was, so leave it alone (NaN).
            if (in.time() - lastScanTime > 2) orders.radarTurn(Double.POSITIVE_INFINITY);
            return orders.build();
        }

        if (profile == null) meet(scan);
        double enemyDirection = Angles.normalAbsoluteAngle(in.heading() + scan.bearing());
        watchEnemyEnergy(in, scan, enemyDirection);
        lastScanTime = in.time();

        // Radar lock: turn twice as far as needed so the radar overshoots and sweeps back.
        orders.radarTurn(2 * Angles.normalRelativeAngle(enemyDirection - in.radarHeading()));
        orders.bodyTurn(orbit.bodyTurn(scan.bearing()));
        for (boolean hit : gun.observe(in, scan)) {
            ourShots++;
            if (hit) ourHits++;
            evidence.ours().record(hit);
            if (trust != null && trust.observe(evidence.ours().estimate())) gun.seedWeight(trust.weight());
        }
        double power = PowerPolicy.power(GuessFactorGun.POWER, evidence.ours().estimate(),
            evidence.theirs().estimate(), in.energy(), scan.energy());
        GuessFactorGun.Aim aim = gun.aim(in, scan, power);
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

    /**
     * The first scan of the round: say who we are fighting (which clears the evidence if it is
     * someone new) and, if we have a library, load the profile and give the gun its seed.
     */
    private void meet(Event.Scan scan) {
        String key = LineageKey.of(scan.name());
        evidence.against(key);
        profile = library == null ? Profile.stranger(key) : library.load(key);
        if (!profile.seed().isEmpty()) {
            gun.seed(profile.seed());
            trust = new SeedTrust(Estimate.of(profile.ourHits(), profile.ourShots()));
        }
    }

    /**
     * The round is over: save what it taught about the opponent (HL-23). Does nothing without a
     * library, or if no opponent was ever scanned. Never throws; a failed save is counted in
     * the library and costs the robot a lesson, not the battle.
     */
    public void roundEnded() {
        if (library == null || profile == null) return;
        List<float[]> learned = gun.learned();
        library.save(profile.afterRound(theirShots, theirHits, ourShots, ourHits, learned));
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
