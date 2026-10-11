package hadur2.core.melee;

import hadur2.core.world.EnemyTracker;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import hadur2.core.world.Roster;
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
        /** T1: the living teammates whose position is fresh; empty off a team (MMOVE-6). */
        public final List<Roster.Mate> teammates;

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
            this(me, gunHeading, radarHeading, energy, time, others, heading, velocity, gunHeat, List.of());
        }

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others, double heading, double velocity,
                         double gunHeat, List<Roster.Mate> teammates) {
            this.teammates = teammates;
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
        this(field, new EnemyTracker(field));
    }

    /**
     * A melee brain reading {@code world}, the core's one model of the field (A3, WORLD-1).
     * The core feeds the World before it offers the melee an event, so the {@code scanned},
     * {@code bulletHit}, {@code hitByBullet} and {@code died} handlers below leave it alone;
     * the {@code on...} handlers feed it themselves, for a melee brain on its own.
     */
    public MeleeController(BattleField field, EnemyTracker world) {
        this.tracker = world;
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
        scanned(info, tracker.lastScanShot(), distance, velocity, time);
        return info;
    }

    /**
     * The World has taken a scan ({@code info}, and the shot it inferred, or null); the
     * melee's own books take it now.
     */
    public void scanned(EnemyInfo info, EnemyShot shot, double distance, double velocity, long time) {
        String name = info.name;
        profiles.scanned(name, distance);
        if (shot != null) profiles.shotInferred(name, shot.power);
        book.get(name).recordScan(distance, velocity, info.turnRate());
        gun.onScan(info, distance, time);
        waves.onScan(info, time);
    }

    /** One of Hadur's bullets of {@code power} hit {@code name}. */
    public void onBulletHit(String name, double power) {
        tracker.onBulletHit(name, Rules.getBulletDamage(power));
        bulletHit(name, power);
    }

    /** The World has booked Hadur's hit on {@code name}; the melee's own books take it. */
    public void bulletHit(String name, double power) {
        book.get(name).recordDamageDealt(Rules.getBulletDamage(power));
    }

    /**
     * {@code name}'s bullet of {@code power}, travelling at {@code heading}, hit Hadur at
     * {@code me}. Logs the damage, and whether the shooter aimed head-on or led the shot.
     */
    public void onHitByBullet(String name, double power, double heading,
                              Point2D.Double me, long now) {
        EnemyInfo shooter = tracker.get(name);
        if (shooter != null) shooter.recordHitOnHadur(now);
        hitByBullet(name, power, heading, me, now);
    }

    /** The World has booked {@code name}'s hit on Hadur; the melee's own books take it. */
    public void hitByBullet(String name, double power, double heading,
                            Point2D.Double me, long now) {
        OpponentStats stats = book.get(name);
        double damage = Rules.getBulletDamage(power);
        EnemyInfo shooter = tracker.get(name);
        if (shooter == null) {
            stats.recordDamageReceived(damage, Double.NaN, 0);
            profiles.hitOnHadur(name, null);
            return;
        }
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
        tracker.onRobotDeath(name);
        died(name, sentry);
    }

    /** The World has marked {@code name} dead; the melee's own books take it. */
    public void died(String name, boolean sentry) {
        profiles.died(name, sentry);
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

    /** MMOVE-8: this member's place in its team's roster (negative off a team). */
    public void team(int index) {
        mover.team(index);
    }

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
            : mover.chooseDestination(s.me, s.energy, s.others, alive, s.time, plan, s.teammates);
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
