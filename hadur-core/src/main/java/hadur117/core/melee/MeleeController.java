package hadur117.core.melee;

import hadur117.core.world.EnemyTracker;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import hadur117.core.world.Roster;
import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runs Hadur's melee subsystems for one tick and returns what the robot should do.
 * {@link hadur117.core.HadurCore} hands it every event and, while two or more opponents are
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
    /** Where Hadur was at its last tick, for MGUN-11's nearest robot; null before the first. */
    private Point2D.Double lastMe;
    /** T6: the team's log of each enemy's gun (MMOVE-9, MMOVE-10); untouched off a team. */
    private final TeamDanger danger;
    /** Whether the last tick had a living teammate. */
    private boolean onTeam;
    /** T7: the team's modes against this team (TMODE-1) as of the last tick; none off a team. */
    private Set<TeamModes.Mode> modes = TeamModes.NONE;
    /** TMODE-33: the team brain's battle-long state; read only while CONCORD plays. */
    private final TeamConcord concord = new TeamConcord();
    /**
     * TMODE-10: whether the battle's first tick has told whether Hadur leads its team. A team's
     * leader is the same member every round, so a fault's recovery mid-round does not ask again.
     */
    private boolean leaderKnown;
    private final BattleField field;
    /**
     * MMOVE-19 (arm mcross), inspired by ScalarR: with the surfer on, off a team, an opponent's
     * energy loss to someone other than Hadur that one other opponent's shot explains (its damage,
     * its wave at the victim between the victim's last two scans) teaches that shooter's aim, as a
     * hit on Hadur does (MMOVE-15). Off.
     */
    public static final boolean MELEE_CROSS = true;
    /** MMOVE-19: how far, energy, a loss may be from a shot's damage (losses are kept to 0.01). */
    static final double CROSS_SLACK = 0.02;
    private boolean cross = MELEE_CROSS;
    /** MMOVE-19: each opponent's scanned path this round; empty with the switch off. */
    private final Map<String, RobotStateLog> paths = new HashMap<>();

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
        this.field = field;
        this.mover = new MinimumRiskMovement(field);
        this.gun = new FieldGun(field);
        this.danger = new TeamDanger(field);
    }

    public void newRound() {
        tracker.newRound();
        radar.newRound();
        mover.newRound();
        gun.newRound();
        waves.newRound();
        lastTarget = null;
        myPath.clear();
        paths.clear();
        lastMe = null;
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
        if (EnemyHistory.CROWD) {
            List<EnemyInfo> alive = tracker.alive();
            gun.onScan(info, distance, time, nearest(info.name, info.location, alive), alive.size());
        } else {
            gun.onScan(info, distance, time);
        }
        waves.onScan(info, time);
        if (cross && !onTeam && mover.surfing()) crossHit(info, time);
    }

    /** MMOVE-19: sets the switch, for tests. */
    void cross(boolean on) {
        this.cross = on;
    }

    /**
     * MMOVE-19: logs {@code victim}'s scan and, when it shows a loss to someone other than Hadur,
     * learns the aim of the one other opponent's shot that explains it: the shot whose damage the
     * loss matches and whose wave reached the victim between its last two scans; with two or more
     * such shots it learns nothing. The aim is the heading from the shot's source to where the victim
     * was as the wave reached it. Only losses over 3 energy are seen: a smaller one cannot be told
     * from the victim's own shot.
     */
    void crossHit(EnemyInfo victim, long now) {
        RobotStateLog path = paths.computeIfAbsent(victim.name, k -> new RobotStateLog());
        path.addState(RobotState.newBuilder().setLocation(victim.location).setHeading(victim.heading)
            .setVelocity(victim.velocity).setTime(now).build());
        double loss = victim.externalLossAt(now);
        if (loss <= 0) return;
        long since = victim.previousScanTime() < 0 ? 1 : Math.max(1, now - victim.previousScanTime());
        EnemyShot best = null;
        for (EnemyShot shot : tracker.shots(now)) {
            if (shot.shooter.equals(victim.name)) continue;
            if (Math.abs(Rules.getBulletDamage(shot.power) - loss) > CROSS_SLACK) continue;
            double d = shot.source.distance(victim.location);
            double slack = LEARN_SLACK + shot.window * shot.speed();
            double far = shot.travelled(now), near = far - (since - 1) * shot.speed();
            if (d > far + slack || d < near - slack) continue;
            // Two shots that could both explain the loss teach nothing: either may be wrong.
            if (best != null) return;
            best = shot;
        }
        if (best == null) return;
        RobotState at = path.getState(best.fireTime);
        if (at == null) return;
        // Where the victim was as the wave reached it, between its last two scans.
        long arrival = Math.max(now - since, Math.min(now,
            best.fireTime + Math.round(best.source.distance(victim.location) / best.speed())));
        RobotState hit = path.getState(arrival);
        Point2D.Double struck = hit == null ? victim.location : hit.location;
        danger.add(danger.sample(best, at, DiaUtils.absoluteBearing(best.source, struck)));
    }

    /**
     * MGUN-8: a teammate saw {@code name} at {@code time}; only the field gun's history of its
     * movement takes it. The World already has it, and the profiles, the danger book and the
     * targeting waves keep to Hadur's own radar.
     */
    public void mateSighting(String name, long time, double x, double y, double heading, double velocity,
                             double distance, double turnRate) {
        if (EnemyHistory.CROWD) {
            List<EnemyInfo> alive = tracker.alive();
            gun.onSighting(name, time, x, y, heading, velocity, distance, turnRate,
                nearest(name, new Point2D.Double(x, y), alive), alive.size());
        } else {
            gun.onSighting(name, time, x, y, heading, velocity, distance, turnRate);
        }
    }

    /**
     * MGUN-11: where Hadur is now, set before the tick's scans so their crowd attributes
     * measure from this tick's position rather than the last.
     */
    public void at(Point2D.Double me) {
        lastMe = me;
    }

    /** MGUN-11: the robot nearest {@code name} at {@code at}, Hadur included, or null. */
    private Point2D.Double nearest(String name, Point2D.Double at, List<EnemyInfo> alive) {
        Point2D.Double nearest = lastMe;
        double best = lastMe == null ? Double.POSITIVE_INFINITY : lastMe.distance(at);
        for (EnemyInfo o : alive) {
            if (o.name.equals(name) || o.location == null) continue;
            double d = o.location.distance(at);
            if (d < best) {
                best = d;
                nearest = o.location;
            }
        }
        return nearest;
    }

    /** One of Hadur's bullets of {@code power} hit {@code name}. */
    public void onBulletHit(String name, double power) {
        tracker.onBulletHit(name, Rules.getBulletDamage(power));
        bulletHit(name, power);
    }

    /** The World has booked Hadur's hit on {@code name}; the melee's own books take it. */
    public void bulletHit(String name, double power) {
        book.get(name).recordDamageDealt(Rules.getBulletDamage(power));
        gun.hitOn(name);
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
        if (onTeam && (TeamDanger.LEARNED || modes.contains(TeamModes.Mode.LEARN) || modes.contains(TeamModes.Mode.POOL)
                || modes.contains(TeamModes.Mode.DODGE))) {
            learn(name, power, heading, me, now);
        } else if (!onTeam && mover.surfing()) {
            // MMOVE-15: the melee surfer learns each shooter's aim from the hits on Hadur.
            learn(name, power, heading, me, now, false);
        }
        // The same test OpponentStats uses: within Hadur's width of head-on, else led.
        profiles.hitOnHadur(name, Math.abs(Angles.normalRelativeAngle(heading - headOn)) <= botWidth
            ? MeleeProfile.AimClass.HEAD_ON : MeleeProfile.AimClass.LINEAR);
    }

    /**
     * MMOVE-10: the shot of {@code name} that this hit ended, found among the shots the World
     * inferred: the same power, its bullet's flight from its source to {@code me} matching the
     * ticks since it was fired. Its sample is logged and kept for the report. A hit no shot
     * explains teaches nothing.
     */
    void learn(String name, double power, double heading, Point2D.Double me, long now) {
        learn(name, power, heading, me, now, true);
    }

    /** As above; off a team ({@code report} false) the sample is logged, not kept for a report. */
    void learn(String name, double power, double heading, Point2D.Double me, long now, boolean report) {
        EnemyShot best = null;
        double bestErr = Double.POSITIVE_INFINITY;
        for (EnemyShot shot : tracker.shots(now)) {
            if (!shot.shooter.equals(name) || Math.abs(shot.power - power) > 0.01) continue;
            double err = Math.abs(shot.source.distance(me) - shot.travelled(now));
            if (err > LEARN_SLACK + shot.window * shot.speed()) continue;
            if (err < bestErr) {
                bestErr = err;
                best = shot;
            }
        }
        if (best == null) return;
        RobotState at = myPath.getState(best.fireTime);
        if (at == null) return;
        TeamDanger.Sample sample = danger.sample(best, at, heading);
        if (report && modes.contains(TeamModes.Mode.DODGE)) {
            // TMODE-27: score every aim expert on this hit, the learned one before it learns it.
            double[] predicted = AimExperts.headings(best, at, myPath, field);
            predicted[AimExperts.Expert.LEARNED.ordinal()] = AimExperts.strongest(danger.aims(best, at));
            double[] errors = AimExperts.errors(best, at, predicted, heading);
            mover.dodge().experts().observe(name, errors);
            sample = sample.withExperts(errors);
        }
        if (report) danger.own(sample);
        else danger.add(sample);
    }

    /** MMOVE-10: how far, px, a hit may be from where its shot's bullet should be: a robot's reach and a tick's flight. */
    static final double LEARN_SLACK = 40;

    /** MMOVE-10: a teammate's sample, from its report. */
    public void mateSample(TeamDanger.Sample s) {
        danger.add(s);
        // TMODE-27: a teammate's hit scores the aim experts here too.
        if (s.experts.length == AimExperts.COUNT) mover.dodge().experts().observe(s.shooter, s.experts);
    }

    /** TMODE-9: a teammate's bullet, from its report. */
    public void mateShot(String mate, Point2D.Double at, long tick, double heading, double power) {
        mover.mateShot(mate, at, tick, heading, power);
    }

    /** MMOVE-10: Hadur's own samples since the last report, for the next one. */
    public List<TeamDanger.Sample> takeSamples() {
        return danger.takeOutgoing();
    }

    public TeamDanger danger() { return danger; }

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

    /** MMOVE-8 with this member's own name (TMODE-13 orders the team by name). */
    public void team(int index, String name) {
        mover.team(index, name);
    }

    public Command tick(Situation s) {
        myPath.addState(RobotState.newBuilder().setLocation(s.me).setHeading(s.heading)
            .setVelocity(s.velocity).setTime(s.time).build());
        Command c = new Command();
        lastMe = s.me;
        ghostsDropped += tracker.pruneGhosts(s.others, s.time, s.me);
        EnemyInfo last = tracker.get(lastTarget);
        String finisher = last != null && last.energy <= FINISHER_ENERGY ? last.name : null;
        List<EnemyInfo> alive = tracker.alive();
        MeleeStrategy.Plan plan = strategy.evaluate(tracker, s.me, s.energy, s.others, s.time);
        c.posture = plan.posture;
        onTeam = !s.teammates.isEmpty();
        if (!leaderKnown) {
            // TMODE-10: only a team's leader starts a battle with more than 100 energy.
            leaderKnown = true;
            mover.leader(s.energy > 100);
        }
        if (onTeam) {
            // T7 (TMODE-1): the modes against this team.
            modes = TeamModes.against(alive);
            // TMODE-7: POOL is LEARN with one log per enemy class; TMODE-27's dodge reads the class logs too.
            boolean dodging = modes.contains(TeamModes.Mode.DODGE);
            danger.pool(modes.contains(TeamModes.Mode.POOL) || dodging);
            // T6 (MMOVE-9, MMOVE-10): where each teammate stands, for whom a shot was aimed at.
            List<Point2D.Double> mates = new ArrayList<>(s.teammates.size());
            for (Roster.Mate m : s.teammates) mates.add(m.at(s.time));
            if (modes.contains(TeamModes.Mode.CONCORD)) {
                // TMODE-33: the team brain's gang watch and modes.
                concord.watch(s.me, mates, alive, s.time);
                modes = concord.modes(modes);
            }
            if (modes.contains(TeamModes.Mode.CONCORD) && TeamConcord.RADAR) {
                // TMODE-33: the team brain's modes, its gang watch and its radar group.
                c.radarTurn = radar.groupTurn(s.me, s.radarHeading, tracker, s.others, finisher, s.time,
                    TeamConcord.group(s.me, mates, alive));
            } else {
                c.radarTurn = radar.radarTurn(s.me, s.radarHeading, tracker, s.others, finisher, s.time,
                    true, s.gunHeat, lastTarget);
            }
            if (dodging) {
                // TMODE-27: each shot profiled once; the virtual bullets stand down unless ranked.
                List<EnemyShot> shots = tracker.shots(s.time);
                mover.dodge().update(shots, myPath, s.me, s.time, mates, danger,
                    TeamModes.owns(modes), TeamModes.onlyAim(modes));
                if (TeamDodge.RANK_BULLETS) {
                    mover.updateBullets(shots, myPath, s.me, s.time, mates, danger,
                        TeamModes.owns(modes), false, false, TeamModes.onlyAim(modes));
                } else {
                    mover.clearBullets();
                }
            } else {
                // TMODE-20..22: shot ownership and the one aim, for a team whose code is read.
                mover.updateBullets(tracker.shots(s.time), myPath, s.me, s.time, mates, danger,
                    TeamDanger.NEAREST || TeamModes.owns(modes),
                    TeamDanger.LEARNED || modes.contains(TeamModes.Mode.LEARN)
                        || modes.contains(TeamModes.Mode.POOL),
                    modes.contains(TeamModes.Mode.SOFT), TeamModes.onlyAim(modes));
            }
        } else {
            modes = TeamModes.NONE;
            c.radarTurn = radar.radarTurn(s.me, s.radarHeading, tracker, s.others, finisher, s.time,
                false, s.gunHeat, lastTarget);
            mover.updateMeleeBullets(tracker.shots(s.time), myPath, s.me, s.time, alive, danger);
        }
        c.destination = alive.isEmpty() ? null
            : mover.chooseDestination(s.me, s.energy, s.others, alive, s.time, plan, s.teammates, modes);
        gun.onTeam(!s.teammates.isEmpty());
        gun.lead(modes.contains(TeamModes.Mode.LEAD));
        gun.swift(modes.contains(TeamModes.Mode.SWIFT));
        gun.concord(TeamConcord.GUN && modes.contains(TeamModes.Mode.CONCORD));
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

    /** MMOVE-20: a shot left from {@code at} on {@code time} along {@code gunHeading}; kept for the shadows it casts. */
    public void shotFired(Point2D.Double at, long time, double gunHeading, double power) {
        shotFired(at, time, gunHeading, power, lastTarget);
    }

    /** As above, the shot aimed at {@code target} by the command that fired it (or null). */
    public void shotFired(Point2D.Double at, long time, double gunHeading, double power, String target) {
        // TMODE-33: counted for the team brain's power, whatever plays.
        gun.shotAt(target);
        if (!onTeam && mover.bulletShading()) mover.ownShot(at, time, gunHeading, power);
    }

    /** MMOVE-20: one of Hadur's bullets hit a robot or a bullet, so it casts no more shadows. */
    public void ownBulletGone(double power, double heading) {
        if (mover.bulletShading()) mover.ownBulletGone(power, heading);
    }
}
