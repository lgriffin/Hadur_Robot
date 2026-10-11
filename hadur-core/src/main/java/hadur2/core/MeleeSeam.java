package hadur2.core;

import hadur2.core.melee.MeleeController;
import hadur2.core.melee.MeleeRadar;
import hadur2.core.model.Baton;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.model.RoundStats;
import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import hadur2.core.physics.Rules;
import hadur2.core.role.Role;
import hadur2.core.role.RoleId;
import hadur2.core.role.RoundFacts;
import hadur2.core.role.RoundResult;
import hadur2.core.role.Tick;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * The conductor's seam for the melee brain (A2): it turns each {@link Tick} into the
 * {@link MeleeController}'s own arguments, as {@code HadurCore} did before, and holds the melee
 * shelf ({@link MeleeMemory}) the conductor handed it by charter, or none.
 *
 * <p>This is today's {@code meleeTick} and {@code goTo}, moved as they are, with the last
 * command, the fire gate and the slow-down on sharp turns, and the melee half of the {@code M}
 * record's counters. Taking those into {@code melee} is for the Melee plan.</p>
 *
 * <p>A melee event handler that throws does not stop the tick: the first fault is kept for
 * the conductor, which fails closed to the Duel once the tick's last event is handled
 * (GATE-4).</p>
 */
final class MeleeSeam implements Role {

    private final HadurCore core;
    /** The melee brain; it sees every non-sentry scan and death, whichever role drives. */
    final MeleeController melee;
    /** MMEM-1: the opponents' melee blocks; null unless a melee charter with a store. */
    private final MeleeMemory memory;
    /** SHELF-3: whether this battle writes the melee shelf; only a Melee charter's does. */
    private final boolean writes;
    /** What the melee brain asked for last tick; its fire power goes out this tick if the gun is there. */
    private MeleeController.Command lastCommand;
    /** The first exception a melee event handler threw this tick (GATE-4). */
    private RuntimeException eventFault;
    /** Melee memory failures this battle, for the M record (RES-5). */
    private int memoryFailures;
    /** Per-round counters for the M record. */
    int ghostTicks, maxScanGap, sweepGap;
    /** The melee tracker's battle count of ghosts at the round's start, so the M record shows this round's. */
    private long ghostsAtRoundStart;
    /** The melee waves' battle totals when this round began (MGUN-4). */
    private final long[] wavesAtRoundStart = new long[3];
    /** This round's counters. */
    private RoundStats stats;

    MeleeSeam(HadurCore core, MeleeController melee, MeleeMemory memory, boolean writes, RoundStats stats) {
        this.core = core;
        this.melee = melee;
        this.memory = memory;
        this.writes = writes;
        this.stats = stats;
    }

    @Override
    public RoleId id() {
        return RoleId.MELEE;
    }

    @Override
    public void prepare() {
        if (memory != null) memory.prepare();
    }

    @Override
    public void newRound(RoundFacts round) {
        stats = round.stats();
        recover();
        ghostTicks = maxScanGap = sweepGap = 0;
        ghostsAtRoundStart = melee.ghostsDropped();
        wavesAtRoundStart[0] = melee.waves().emitted();
        wavesAtRoundStart[1] = melee.waves().resolved();
        wavesAtRoundStart[2] = melee.waves().hits();
        melee.profiles().newRound();
    }

    @Override
    public void recover() {
        melee.newRound();
        lastCommand = null;
    }

    /**
     * MMEM-1: each opponent scanned this round has the round folded into its melee block.
     * Hadur may be dead by now; the block is written at the next checkpoint or the battle's
     * end. A failure is counted, never thrown.
     */
    @Override
    public void roundEnded(RoundResult result) {
        if (memory == null) return;
        try {
            memory.foldRound(melee.profiles(), core.enemiesTotal());
        } catch (RuntimeException e) {
            memoryFailures++;
            core.emit("MEM," + core.round() + "," + result.tick() + ",melee-fold-failed," + HadurCore.clean(e.toString()));
        }
    }

    @Override
    public void checkpoint(long tick) {
        save(tick);
    }

    @Override
    public void battleEnded(long tick) {
        save(tick);
    }

    /** MMEM-1: writes the melee blocks folded since the last save. Never throws. */
    void save(long tick) {
        // The Archive's answer first: a gated save is never attempted (SHELF-3).
        if (memory == null || !writes) return;
        try {
            int before = memory.saveFailures() + memory.skippedWrites();
            memory.saveAll();
            int failed = memory.saveFailures() + memory.skippedWrites() - before;
            if (failed > 0) {
                memoryFailures += failed;
                core.emit("MEM," + core.round() + "," + tick + ",melee-save-failed," + HadurCore.clean(memory.lastNote()));
            }
        } catch (RuntimeException e) {
            memoryFailures++;
            core.emit("MEM," + core.round() + "," + tick + ",melee-save-failed," + HadurCore.clean(e.toString()));
        }
    }

    /**
     * ROLE-5: the melee brain is fed whichever role drives: scans, deaths, the bullets that
     * hit Hadur, and Hadur's own hits except on a robot the Duel is ignoring. The conductor
     * offers no sentry's scan or bullet. The World takes the event first (WORLD-1); the
     * conductor's {@link #observe(BotEvent, Tick, boolean)} says whether it held. A scan is
     * booked only against the World's view of that same robot, so a caller that skips the
     * conductor's feed books nothing rather than a stale robot's scan.
     */
    @Override
    public void observe(BotEvent event, Tick tick) {
        observe(event, tick, true);
    }

    /**
     * As {@link #observe(BotEvent, Tick)}, after the World's feed; when the feed failed the
     * melee's own books skip the event, as they did when the tracker threw inside them.
     */
    void observe(BotEvent event, Tick tick, boolean worldFed) {
        BotInput in = tick.in();
        if (event instanceof BotEvent.Scan) {
            BotEvent.Scan e = (BotEvent.Scan) event;
            long time = in.time();
            EnemyInfo info = core.scanInfo();
            if (worldFed && info != null && info.name.equals(e.name())) {
                guard(() -> melee.scanned(info, core.scanShot(), e.distance(), e.velocity(), time));
            }
            // MMEM-1: after the World has the scan and before the Duel sees it.
            loadBlock(time, e.name());
        } else if (!worldFed) {
            return;
        } else if (event instanceof BotEvent.BulletHit) {
            BotEvent.BulletHit e = (BotEvent.BulletHit) event;
            if (!tick.foreign(e.name())) guard(() -> melee.bulletHit(e.name(), e.power()));
        } else if (event instanceof BotEvent.HitByBullet) {
            BotEvent.HitByBullet e = (BotEvent.HitByBullet) event;
            guard(() -> melee.hitByBullet(e.name(), e.power(), e.heading(), in.location(), in.time()));
        } else if (event instanceof BotEvent.RobotDeath) {
            String name = ((BotEvent.RobotDeath) event).name();
            guard(() -> melee.died(name, tick.isSentry(name)));
        }
    }

    /**
     * Runs a melee event handler, keeping the first exception for the tick to fail closed on
     * (GATE-4) instead of letting it past the resolver. Returns whether it ran clean.
     */
    boolean guard(Runnable handler) {
        try {
            handler.run();
            return true;
        } catch (RuntimeException ex) {
            if (eventFault == null) eventFault = ex;
            return false;
        }
    }

    /** The first fault a melee event handler threw this tick, or null; cleared as it is read. */
    RuntimeException takeFault() {
        RuntimeException fault = eventFault;
        eventFault = null;
        return fault;
    }

    /** MMEM-1: loads {@code name}'s melee block on its first scan of the battle. Never throws. */
    private void loadBlock(long time, String name) {
        if (memory == null) return;
        try {
            if (memory.isLoaded(name)) return;
            int failures = memory.loadFailures();
            memory.load(name);
            if (memory.loadFailures() > failures) {
                memoryFailures++;
                core.emit("MEM," + core.round() + "," + time + ",melee-load-failed," + HadurCore.clean(memory.lastNote()));
            }
        } catch (RuntimeException e) {
            memoryFailures++;
            core.emit("MEM," + core.round() + "," + time + ",melee-load-failed," + HadurCore.clean(e.toString()));
        }
    }

    /** MMEM-2: whether the melee shelf knew {@code name}, for the H record. Never throws. */
    boolean knows(String name) {
        if (memory == null) return false;
        try {
            return memory.load(name).found;
        } catch (RuntimeException ex) {
            memoryFailures++;
            return false;
        }
    }

    /** Whether the battle has a melee shelf. */
    boolean hasShelf() {
        return memory != null;
    }

    /** Melee memory failures this battle (RES-5). */
    int memoryFailures() {
        return memoryFailures;
    }

    /**
     * M2's gate: the longest any living opponent has gone unscanned in melee this round, and
     * the longest while four or more were alive, the spinning radar's case (MRADAR-1). An
     * opponent never scanned (last scan tick below 0) is skipped.
     */
    void measureScanGap(long now, int others) {
        for (EnemyInfo e : core.world().alive()) {
            if (e.lastScanTime < 0) continue;
            int gap = (int) (now - e.lastScanTime);
            maxScanGap = Math.max(maxScanGap, gap);
            if (others >= MeleeRadar.SPIN_OTHERS) sweepGap = Math.max(sweepGap, gap);
        }
    }

    /** The round's ghosts dropped, targeting waves sent and resolved, and virtual hits, for the M record. */
    String roundCounts() {
        return (melee.ghostsDropped() - ghostsAtRoundStart)
            + "," + (melee.waves().emitted() - wavesAtRoundStart[0])
            + "," + (melee.waves().resolved() - wavesAtRoundStart[1])
            + "," + (melee.waves().hits() - wavesAtRoundStart[2]);
    }

    /**
     * MELEE-7..8, MRADAR, MMOVE, MGUN: one tick of melee. The shot aimed last tick goes out first if the gun got
     * there, as in 1.x; then the melee brain picks the radar sweep, destination and aim.
     *
     * <p>Target choice, aim, power and the decision to hold fire are all the melee brain's
     * (it sets a fire power of 0 to hold); this method only carries them out. A shot counts
     * toward {@link RoundStats#shotsFired} and toward the melee bullets whose outcomes the
     * duel must not read as its own (WORLD-5). Without the conductor's permission (WEAVE-3)
     * no shot leaves.</p>
     */
    @Override
    public void drive(Tick tick, BotOrders.Builder orders) {
        BotInput in = tick.in();
        MeleeController.Command previous = lastCommand;
        // Fire only with a cool gun that has finished turning to last tick's aim (the engine
        // reports the remaining turn in radians; 0.05 degrees is the duel gun's tolerance
        // too), and only with energy to spare, since a shot that uses our last energy
        // disables us.
        if (previous != null && previous.firePower > 0 && in.gunHeat() == 0
                && Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05
                && in.energy() > previous.firePower && tick.mayFire()) {
            orders.fire(previous.firePower);
            stats.shotsFired++;
            core.meleeShotFired();
        }

        MeleeController.Command c = melee.tick(new MeleeController.Situation(
            in.location(), in.gunHeading(), in.radarHeading(), in.energy(), in.time(),
            in.others(), in.heading(), in.velocity(), in.gunHeat(), core.livingTeammates()));
        // M2's check: a tick aimed at a robot that has died is a ghost tick.
        if (c.target != null && core.diedThisRound(c.target)) ghostTicks++;
        orders.turnRadarRight(c.radarTurn);
        orders.turnGunRight(c.gunTurn);
        if (c.destination != null) goTo(in, c.destination, orders);
        lastCommand = c;
    }

    /**
     * Drives toward {@code destination}, backwards if that is the shorter turn. A robot can
     * drive either way at the same speed, so it never needs to turn more than 90 degrees.
     * This is where melee lowers the speed limit that MELEE-2 lifts on hand-over.
     */
    private static void goTo(BotInput in, Point2D.Double destination, BotOrders.Builder orders) {
        Point2D.Double me = in.location();
        double turn = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(me, destination) - in.heading());
        double distance = me.distance(destination);
        if (Math.abs(turn) > Math.PI / 2) {
            turn = Angles.normalRelativeAngle(turn + Math.PI);
            distance = -distance;
        }
        orders.turnRight(turn);
        // Slow down for sharp turns so the robot doesn't swing wide.
        // (Robocode turns a body slower the faster it goes: 10 - 0.75 * |velocity| degrees a tick.)
        orders.maxVelocity(Math.abs(turn) > Math.PI / 4 ? 4.0 : Rules.MAX_VELOCITY);
        orders.ahead(distance);
    }

    /** Melee never takes over mid-round: the role moves only down (ROLE-4). */
    @Override
    public void reset() {
    }

    /** GATE-4: the melee failed this tick; the shot it aimed last tick never goes out. */
    void stopDriving() {
        lastCommand = null;
    }

    /**
     * MMEM-2: the shots the melee saw fired, each with how far it has flown now, and Hadur's
     * path while the melee drove. The Duel picks out the survivor's.
     */
    @Override
    public Baton give(Tick tick) {
        long now = tick.in().time();
        List<Baton.Shot> shots = new ArrayList<>();
        // A3: the shots are the World's, which the melee brain reads.
        for (EnemyShot s : core.world().shots(now)) {
            shots.add(new Baton.Shot(s.shooter, s.source, s.fireTime, s.power, s.travelled(now)));
        }
        return new Baton(shots, melee.myPath());
    }

    /** Nothing is ever handed up to the Melee role. */
    @Override
    public void take(Baton baton, Tick tick) {
    }
}
