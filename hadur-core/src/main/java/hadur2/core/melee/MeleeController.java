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
    /** Range beyond which Hadur holds fire while conserving energy. */
    static final double CONSERVE_RANGE = 400.0;
    static final double LOW_PROFILE_RANGE = 600.0;

    /** What Hadur knows about itself this tick. */
    public static final class Situation {
        public final Point2D.Double me;
        public final double gunHeading, radarHeading, energy;
        public final long time;
        public final int others;
        /** Hadur's body heading and velocity, for the aims opponents may take at it. */
        public final double heading, velocity;

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others) {
            this(me, gunHeading, radarHeading, energy, time, others, 0, 0);
        }

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others, double heading, double velocity) {
            this.me = me;
            this.gunHeading = gunHeading;
            this.radarHeading = radarHeading;
            this.energy = energy;
            this.time = time;
            this.others = others;
            this.heading = heading;
            this.velocity = velocity;
        }
    }

    /** A weak target the radar rescans often and the gun finishes (MGUN-2's threshold). */
    static final double FINISHER_ENERGY = 16.0;

    /** What Hadur should do this tick. */
    public static final class Command {
        public double radarTurn;
        public double gunTurn;
        public double firePower;
        public Point2D.Double destination;
        public String target;
        public MeleeStrategy.Posture posture;
        public MeleeGun.Strategy gunStrategy;
    }

    public final EnemyTracker tracker;
    private final OpponentStatsBook book = new OpponentStatsBook();
    private final MeleeRadar radar = new MeleeRadar();
    private final MinimumRiskMovement mover;
    private final MeleeTargetSelector selector = new MeleeTargetSelector(book);
    private final MeleeGun gun;
    private final MeleeStrategy strategy = new MeleeStrategy();
    /** Where Hadur has been this round, to tell head-on shooters from leading ones. */
    private final RobotStateLog myPath = new RobotStateLog();
    private long ghostsDropped;

    public MeleeController(BattleField field) {
        this.tracker = new EnemyTracker(field);
        this.mover = new MinimumRiskMovement(field);
        this.gun = new MeleeGun(field);
    }

    public void newRound() {
        tracker.newRound();
        radar.newRound();
        mover.newRound();
        selector.newRound();
        myPath.clear();
    }

    public OpponentStatsBook book() { return book; }

    /** An opponent was scanned at {@code location}, {@code distance} from Hadur. */
    public EnemyInfo onScan(String name, Point2D.Double location, double distance,
                            double energy, double heading, double velocity, long time) {
        EnemyInfo info = tracker.onScan(name, location, energy, heading, velocity, time, distance);
        book.get(name).recordScan(distance, velocity, info.turnRate());
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
            return;
        }
        shooter.lastHitHadur = now;
        double distance = shooter.location.distance(me);
        long flight = Math.round(distance / Rules.getBulletSpeed(power));
        RobotState atFire = myPath.getState(now - flight);
        if (atFire == null) {
            stats.recordDamageReceived(damage, Double.NaN, 0);
            return;
        }
        double headOn = DiaUtils.absoluteBearing(shooter.location, atFire.location);
        stats.recordDamageReceived(damage, heading - headOn, DiaUtils.botWidthAimAngle(distance));
    }

    public void onRobotDeath(String name) {
        tracker.onRobotDeath(name);
        selector.onRobotDeath(name);
    }

    public MinimumRiskMovement mover() { return mover; }

    /** Opponents dropped as dead without a death event, this battle (MSENSE-1). */
    public long ghostsDropped() { return ghostsDropped; }

    /** Where Hadur has been this round, tick by tick. */
    public RobotStateLog myPath() { return myPath; }
    public MeleeTargetSelector selector() { return selector; }
    public MeleeGun gun() { return gun; }
    public MeleeStrategy strategy() { return strategy; }

    public Command tick(Situation s) {
        myPath.addState(RobotState.newBuilder().setLocation(s.me).setHeading(s.heading)
            .setVelocity(s.velocity).setTime(s.time).build());
        Command c = new Command();
        ghostsDropped += tracker.pruneGhosts(s.others, s.time, s.me);
        EnemyInfo current = tracker.get(selector.current());
        String finisher = current != null && current.energy <= FINISHER_ENERGY ? current.name : null;
        c.radarTurn = radar.radarTurn(s.me, s.radarHeading, tracker, s.others, finisher, s.time);

        List<EnemyInfo> alive = tracker.alive();
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, s.me, s.energy, s.others, s.time);
        c.posture = plan.posture;
        mover.updateBullets(tracker.shots(s.time), myPath, s.me, s.time);
        c.destination = alive.isEmpty() ? null
            : mover.chooseDestination(s.me, s.energy, s.others, alive, s.time, plan);

        c.target = selector.select(tracker, s.me, s.gunHeading, s.time, s.energy,
            plan.preferredTarget);
        EnemyInfo target = tracker.get(c.target);
        if (target == null) return c;

        double distance = target.distance(s.me);
        double power = MeleeStrategy.adjustPower(
            MeleeGun.basePower(distance, s.energy, target.energy, s.others), plan.posture);
        power = Math.min(power, MeleeGun.killPower(target.energy));
        MeleeGun.Aim aim = gun.aim(s.me, target, power, s.time);
        c.gunTurn = Angles.normalRelativeAngle(aim.angle - s.gunHeading);
        c.gunStrategy = aim.strategy;

        boolean hold = target.age(s.time) > MAX_FIRE_AGE
            || (plan.posture == MeleeStrategy.Posture.LET_THEM_FIGHT && distance > CONSERVE_RANGE)
            || (plan.posture == MeleeStrategy.Posture.LOW_PROFILE && distance > LOW_PROFILE_RANGE)
            || s.energy <= power + 0.1;
        c.firePower = hold ? 0 : power;
        return c;
    }
}
