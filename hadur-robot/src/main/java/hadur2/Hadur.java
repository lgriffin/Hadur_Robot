package hadur2;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.ProfileStore;
import java.awt.Color;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import robocode.*;

/**
 * The Robocode adapter. It turns engine events and getters into a {@link BotInput},
 * hands it to the core through the {@link Guard}, and applies the {@link BotOrders} that
 * come back. All strategy lives in {@code hadur2.core}; this class only translates.
 *
 * <p>The core is static so what it learns survives from round to round, as Robocode
 * creates a new robot instance each round.</p>
 */
public class Hadur extends AdvancedRobot {

    private static HadurCore core;
    private static Guard guard;
    /** This round's console; telemetry goes to whichever round is running. */
    private static PrintStream console;

    private final List<BotEvent> pending = new ArrayList<>();
    private boolean roundReported;

    @Override
    public void run() {
        console = out;
        if (core == null) {
            core = new HadurCore(getBattleFieldWidth(), getBattleFieldHeight(), getOthers(),
                line -> console.println(line), profileStore());
            guard = new Guard(core::tick, core::recover, line -> console.println(line));
            battleStarted(getBattleFieldWidth(), getBattleFieldHeight(), getOthers());
        }
        core.newRound(getRoundNum());
        guard.newRound();
        roundStarted(getRoundNum());

        setBodyColor(new Color(139, 0, 0));
        setGunColor(new Color(218, 165, 32));
        setRadarColor(new Color(178, 34, 34));
        setBulletColor(new Color(255, 69, 0));
        setScanColor(new Color(255, 140, 0));

        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            BotInput in = input();
            BotOrders orders = guard.tick(in);
            ticked(in, orders);
            apply(orders);
            execute();
        }
    }

    /** Opponent memory lives in the data directory; without one, Hadur fights as a stranger. */
    private ProfileStore profileStore() {
        try {
            return FileProfileStore.forRobot(this);
        } catch (RuntimeException e) {
            out.println("MEM," + getRoundNum() + "," + getTime() + ",no-store," + e);
            return null;
        }
    }

    // Hooks for the bench's recorder, which captures replay fixtures (CORE-2).
    // The robot itself does nothing in them.

    protected void battleStarted(double width, double height, int enemies) {}

    protected void roundStarted(int round) {}

    protected void ticked(BotInput in, BotOrders orders) {}

    private BotInput input() {
        BotInput in = new BotInput(getTime(), getRoundNum(), getX(), getY(),
            getHeadingRadians(), getVelocity(), getEnergy(), getGunHeat(),
            getGunCoolingRate(), getGunHeadingRadians(), getGunTurnRemainingRadians(),
            getRadarHeadingRadians(), getOthers(), pending);
        pending.clear();
        return in;
    }

    private void apply(BotOrders o) {
        if (!Double.isNaN(o.maxVelocity())) setMaxVelocity(o.maxVelocity());
        if (!Double.isNaN(o.bodyTurn())) setTurnRightRadians(o.bodyTurn());
        if (!Double.isNaN(o.ahead())) setAhead(o.ahead());
        if (!Double.isNaN(o.gunTurn())) setTurnGunRightRadians(o.gunTurn());
        if (!Double.isNaN(o.radarTurn())) setTurnRadarRightRadians(o.radarTurn());
        if (o.firePower() > 0) setFire(o.firePower());
    }

    // Events arrive during execute(), in the engine's priority order, and are handed to
    // the core with the next tick's input.

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        pending.add(new BotEvent.Scan(e.getName(), e.getBearingRadians(), e.getDistance(),
            e.getEnergy(), e.getHeadingRadians(), e.getVelocity()));
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        Bullet b = e.getBullet();
        pending.add(new BotEvent.HitByBullet(e.getName(), e.getPower(), b.getX(), b.getY(),
            e.getHeadingRadians()));
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        pending.add(new BotEvent.BulletHit(e.getName(), e.getBullet().getPower(), e.getEnergy()));
    }

    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        Bullet hit = e.getHitBullet();
        pending.add(new BotEvent.BulletHitBullet(e.getBullet().getPower(), hit.getX(), hit.getY(),
            hit.getPower()));
    }

    @Override
    public void onBulletMissed(BulletMissedEvent e) {
        pending.add(new BotEvent.BulletMissed(e.getBullet().getPower()));
    }

    @Override
    public void onHitWall(HitWallEvent e) {
        pending.add(new BotEvent.HitWall(e.getBearingRadians()));
    }

    @Override
    public void onHitRobot(HitRobotEvent e) {
        pending.add(new BotEvent.HitRobot(e.getName(), e.getBearingRadians(), e.getEnergy(),
            e.isMyFault()));
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        pending.add(new BotEvent.RobotDeath(e.getName()));
    }

    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        pending.add(new BotEvent.SkippedTurn(e.getSkippedTurn()));
    }

    @Override
    public void onWin(WinEvent e) {
        reportRound("win");
    }

    @Override
    public void onDeath(DeathEvent e) {
        reportRound("loss");
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        // The engine can deliver this before WinEvent in the round's last batch.
        reportRound(getEnergy() <= 0 ? "loss" : getOthers() == 0 ? "win" : "draw");
        // A checkpoint: the robot may not get to the battle's end (MEM-3). File I/O is
        // safe here, unlike in onWin and onDeath.
        if (core != null) core.saveProfile(getTime());
    }

    @Override
    public void onBattleEnded(BattleEndedEvent e) {
        if (core != null) core.battleEnded(getTime());
    }

    /** One R record per round (RES-5), from whichever end-of-round event comes first. */
    private void reportRound(String result) {
        if (roundReported || core == null) return;
        roundReported = true;
        core.roundEnded(getTime(), result, getEnergy(), guard.faultsThisRound());
    }
}
