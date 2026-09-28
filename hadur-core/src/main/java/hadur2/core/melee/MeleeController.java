package hadur2.core.melee;

import hadur2.core.model.RobotState;
import hadur2.core.model.RobotStateLog;
import hadur2.core.physics.Angles;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.List;

/**
 * Runs Hadur's melee subsystems for one tick and returns what the robot should do.
 * {@link hadur2.core.HadurCore} hands it every event and, while two or more opponents are
 * alive, asks it for the tick's orders. What it learns about each opponent
 * ({@link OpponentStatsBook}) lasts the whole battle; everything else is per round.
 */
public class MeleeController {

    /** Scans older than this are too stale to fire on. */
    static final long MAX_FIRE_AGE = 5;

    /** What Hadur knows about itself this tick. */
    public static final class Situation {
        public final Point2D.Double me;
        public final double gunHeading, radarHeading, energy;
        public final long time;
        public final int others;
        /** Hadur's body heading and velocity, for the aims opponents may take at it. */
        public final double heading, velocity;
        /** The gun's heat, for the targeting waves' cycles (MGUN-4). */
        public final double gunHeat;

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others) {
            this(me, gunHeading, radarHeading, energy, time, others, 0, 0);
        }

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others, double heading, double velocity) {
            this(me, gunHeading, radarHeading, energy, time, others, heading, velocity, 0);
        }

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others, double heading, double velocity,
                         double gunHeat) {
            this.me = me;
            this.gunHeading = gunHeading;
            this.radarHeading = radarHeading;
            this.energy = energy;
            this.time = time;
            this.others = others;
            this.heading = heading;
            this.velocity = velocity;
            this.gunHeat = gunHeat;
        }
    }

    /** A weak target the radar rescans often and the gun finishes (MGUN-2's threshold). */
    static final double FINISHER_ENERGY = MeleeEnergyPolicy.FINISHER_ENERGY;

    /** What Hadur should do this tick. */
    public static final class Command {
        public double radarTurn;
        public double gunTurn;
        public double firePower;
        public Point2D.Double destination;
        public String target;
        public MeleeStrategy.Posture posture;
        /** Whether the aim came from learned movement rather than circular or linear prediction. */
        public boolean learnedAim;
    }

    public final EnemyTracker tracker;
    private final OpponentStatsBook book = new OpponentStatsBook();
    private final MeleeRadar radar = new MeleeRadar();
    private final MinimumRiskMovement mover;
    private final FieldGun gun;
    private final MeleeWaves waves = new MeleeWaves();
    /** This round's observations for each opponent's melee profile block (MMEM-1). */
    private final MeleeProfileFolder profiles = new MeleeProfileFolder();
    /** The opponent the gun aimed at last tick, for the radar's finisher rescans. */
    private String lastTarget;
    private final MeleeStrategy strategy = new MeleeStrategy();
    /** Where Hadur has been this round, to tell head-on shooters from leading ones. */
    private final RobotStateLog myPath = new RobotStateLog();
    private long ghostsDropped;

    public MeleeController(BattleField field) {
        this.tracker = new EnemyTracker(field);
        this.mover = new MinimumRiskMovement(field);
        this.gun = new FieldGun(field);
    }

    public void newRound() {
        tracker.newRound();
        radar.newRound();
        mover.newRound();
        gun.newRound();
        waves.newRound();
        lastTarget = null;
        myPath.clear();
    }

    public OpponentStatsBook book() { return book; }

    /**
     * This round's observations for the melee profile blocks (MMEM-1). Unlike the rest of
     * the per-round state it is not cleared by {@link #newRound}, which the core also calls
     * to recover from a fault mid-round; the core clears it when a round starts.
     */
    public MeleeProfileFolder profiles() { return profiles; }

    /** An opponent was scanned at {@code location}, {@code distance} from Hadur. */
    public EnemyInfo onScan(String name, Point2D.Double location, double distance,
                            double energy, double heading, double velocity, long time) {
        EnemyInfo info = tracker.onScan(name, location, energy, heading, velocity, time, distance);
        profiles.scanned(name, distance);
        EnemyShot shot = tracker.lastScanShot();
        if (shot != null) profiles.shotInferred(name, shot.power);
        book.get(name).recordScan(distance, velocity, info.turnRate());
        gun.onScan(info, distance, time);
        waves.onScan(info, time);
        return info;
    }

    /** One of Hadur's bullets of {@code power} hit {@code name}. */
    public void onBulletHit(String name, double power) {
        double damage = Rules.getBulletDamage(power);
        tracker.onBulletHit(name, damage);
        book.get(name).recordDamageDealt(damage);
    }

    /**
     * {@code name}'s bullet of {@code power}, travelling at {@code heading}, hit Hadur at
     * {@code me}. Logs the damage, and whether the shooter aimed head-on or led the shot.
     */
    public void onHitByBullet(String name, double power, double heading,
                              Point2D.Double me, long now) {
        OpponentStats stats = book.get(name);
        double damage = Rules.getBulletDamage(power);
        EnemyInfo shooter = tracker.get(name);
        if (shooter == null) {
            stats.recordDamageReceived(damage, Double.NaN, 0);
            profiles.hitOnHadur(name, null);
            return;
        }
        shooter.recordHitOnHadur(now);
        double distance = shooter.location.distance(me);
        long flight = Math.round(distance / Rules.getBulletSpeed(power));
        RobotState atFire = myPath.getState(now - flight);
        if (atFire == null) {
            stats.recordDamageReceived(damage, Double.NaN, 0);
            profiles.hitOnHadur(name, null);
            return;
        }
        double headOn = DiaUtils.absoluteBearing(shooter.location, atFire.location);
        double botWidth = DiaUtils.botWidthAimAngle(distance);
        stats.recordDamageReceived(damage, heading - headOn, botWidth);
        // The same test OpponentStats uses: within Hadur's width of head-on, else led.
        profiles.hitOnHadur(name, Math.abs(Angles.normalRelativeAngle(heading - headOn)) <= botWidth
            ? MeleeProfile.AimClass.HEAD_ON : MeleeProfile.AimClass.LINEAR);
    }

    public void onRobotDeath(String name) {
        onRobotDeath(name, false);
    }

    /** A robot died; a {@code sentry} takes no place in the melee's standings (GATE-5). */
    public void onRobotDeath(String name, boolean sentry) {
        profiles.died(name, sentry);
        tracker.onRobotDeath(name);
        waves.onRobotDeath(name);
        if (name.equals(lastTarget)) lastTarget = null;
    }

    public MinimumRiskMovement mover() { return mover; }

    /** Opponents dropped as dead without a death event, this battle (MSENSE-1). */
    public long ghostsDropped() { return ghostsDropped; }

    /** Where Hadur has been this round, tick by tick. */
    public RobotStateLog myPath() { return myPath; }
    public FieldGun gun() { return gun; }
    public MeleeWaves waves() { return waves; }
    public MeleeStrategy strategy() { return strategy; }

    public Command tick(Situation s) {
        myPath.addState(RobotState.newBuilder().setLocation(s.me).setHeading(s.heading)
            .setVelocity(s.velocity).setTime(s.time).build());
        Command c = new Command();
        ghostsDropped += tracker.pruneGhosts(s.others, s.time, s.me);
        EnemyInfo last = tracker.get(lastTarget);
        String finisher = last != null && last.energy <= FINISHER_ENERGY ? last.name : null;
        c.radarTurn = radar.radarTurn(s.me, s.radarHeading, tracker, s.others, finisher, s.time);

        List<EnemyInfo> alive = tracker.alive();
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, s.me, s.energy, s.others, s.time);
        c.posture = plan.posture;
        mover.updateBullets(tracker.shots(s.time), myPath, s.me, s.time);
        c.destination = alive.isEmpty() ? null
            : mover.chooseDestination(s.me, s.energy, s.others, alive, s.time, plan);
        waves.tick(s.me, s.time, s.gunHeat, alive, gun, s.energy, s.others);

        // MGUN-1: the peak of every opponent's firing solutions.
        FieldGun.Aim aim = gun.aim(s.me, s.energy, s.others, alive, s.time);
        lastTarget = aim == null ? null : aim.target;
        if (aim == null) return c;
        EnemyInfo target = tracker.get(aim.target);
        c.target = aim.target;
        c.learnedAim = aim.learned;
        c.gunTurn = Angles.normalRelativeAngle(aim.angle - s.gunHeading);

        // MGUN-5: the energy table's power stands whatever the posture; the posture shapes
        // where Hadur goes, never whether or how hard it fires.
        double power = Math.min(aim.power, MeleeEnergyPolicy.killPower(target.energy));
        boolean hold = target.age(s.time) > MAX_FIRE_AGE
            || s.energy < MeleeEnergyPolicy.MIN_OWN_ENERGY
            || s.energy <= power + 0.1;
        c.firePower = hold ? 0 : power;
        return c;
    }
}
