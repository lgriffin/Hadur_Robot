package hadur117.melee;

import hadur117.utils.BattleField;
import java.awt.geom.Point2D;
import java.util.List;
import robocode.util.Utils;

/**
 * Runs Hadur's melee subsystems for one tick and returns what the robot should do.
 * Holds no reference to the robot, so the whole melee brain is testable offline.
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

        public Situation(Point2D.Double me, double gunHeading, double radarHeading,
                         double energy, long time, int others) {
            this.me = me;
            this.gunHeading = gunHeading;
            this.radarHeading = radarHeading;
            this.energy = energy;
            this.time = time;
            this.others = others;
        }
    }

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

    public final EnemyTracker tracker = new EnemyTracker();
    private final MeleeRadar radar = new MeleeRadar();
    private final MeleeMover mover;
    private final MeleeTargetSelector selector = new MeleeTargetSelector();
    private final MeleeGun gun;
    private final MeleeStrategy strategy = new MeleeStrategy();

    public MeleeController(BattleField field) {
        this.mover = new MeleeMover(field);
        this.gun = new MeleeGun(field);
    }

    public void newRound() {
        tracker.newRound();
        radar.newRound();
        mover.newRound();
        selector.newRound();
    }

    public void onRobotDeath(String name) {
        tracker.onRobotDeath(name);
        selector.onRobotDeath(name);
    }

    public MeleeMover mover() { return mover; }
    public MeleeTargetSelector selector() { return selector; }
    public MeleeGun gun() { return gun; }
    public MeleeStrategy strategy() { return strategy; }

    public Command tick(Situation s) {
        Command c = new Command();
        c.radarTurn = radar.radarTurn(s.me, s.radarHeading, tracker, s.others);

        List<EnemyInfo> alive = tracker.alive();
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, s.me, s.energy, s.others, s.time);
        c.posture = plan.posture;
        c.destination = alive.isEmpty() ? null
            : mover.chooseDestination(s.me, alive, s.time, plan);

        c.target = selector.select(tracker, s.me, s.gunHeading, s.time, s.energy,
            plan.preferredTarget);
        EnemyInfo target = tracker.get(c.target);
        if (target == null) return c;

        double distance = target.distance(s.me);
        double power = MeleeStrategy.adjustPower(
            MeleeGun.basePower(distance, s.energy, target.energy, s.others), plan.posture);
        power = Math.min(power, MeleeGun.killPower(target.energy));
        MeleeGun.Aim aim = gun.aim(s.me, target, power, s.time);
        c.gunTurn = Utils.normalRelativeAngle(aim.angle - s.gunHeading);
        c.gunStrategy = aim.strategy;

        boolean hold = target.age(s.time) > MAX_FIRE_AGE
            || (plan.posture == MeleeStrategy.Posture.LET_THEM_FIGHT && distance > CONSERVE_RANGE)
            || (plan.posture == MeleeStrategy.Posture.LOW_PROFILE && distance > LOW_PROFILE_RANGE)
            || s.energy <= power + 0.1;
        c.firePower = hold ? 0 : power;
        return c;
    }
}
