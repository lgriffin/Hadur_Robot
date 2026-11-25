package hadur117;

import hadur117.sepia.Gait;
import hadur117.sepia.SepiaBrain;
import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.RoundEndedEvent;
import robocode.ScannedRobotEvent;

/**
 * Sepia's Robocode adapter: engine events in, {@link SepiaBrain} orders out. All play lives in
 * {@code hadur117.sepia}, which never imports Robocode.
 *
 * <p>The brain is static so what it learns (where the enemy aims, the punch gun's statistics)
 * survives from round to round, as Robocode creates a new robot each round.</p>
 *
 * <p>{@link #GAIT} and {@link #FIRE} pick the build. The shipped robot runs the jet cycle with ink
 * and punch; the lab builds the silent arms by changing these two constants
 * ({@code hadur-bench/tools/sepia_arms.sh}).</p>
 */
public class Sepia extends AdvancedRobot {

    /** The gait this build runs. */
    static final Gait.Kind GAIT = Gait.Kind.JET;
    /** What this build's gun may do. */
    static final SepiaBrain.Fire FIRE = SepiaBrain.Fire.FULL;

    /** The brain for the whole battle. */
    private static SepiaBrain brain;

    @Override
    public void run() {
        setBodyColor(new Color(0x5a, 0x4a, 0x3a));
        setGunColor(new Color(0x2b, 0x23, 0x1c));
        setRadarColor(new Color(0xd9, 0xc7, 0xa8));
        setBulletColor(new Color(0x20, 0x20, 0x28));
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setAdjustRadarForRobotTurn(true);
        if (brain == null) {
            brain = new SepiaBrain(GAIT, FIRE, getBattleFieldWidth(), getBattleFieldHeight(), "enemy");
        }
        brain.newRound(getRoundNum());
        while (true) {
            SepiaBrain.Orders o = brain.tick(getTime(), getX(), getY(), getHeadingRadians(), getVelocity(),
                getEnergy(), getGunHeadingRadians(), getGunHeat(), getRadarHeadingRadians());
            for (String line : brain.drainRecords()) out.println(line);
            setMaxVelocity(o.maxVelocity);
            setTurnRightRadians(o.turn);
            setAhead(o.ahead);
            setTurnGunRightRadians(o.gunTurn);
            setTurnRadarRightRadians(o.radarTurn);
            if (o.firePower > 0) setFire(o.firePower);
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        double bearing = getHeadingRadians() + e.getBearingRadians();
        brain.scan(getX() + Math.sin(bearing) * e.getDistance(), getY() + Math.cos(bearing) * e.getDistance(),
            e.getHeadingRadians(), e.getVelocity(), e.getEnergy());
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        Bullet b = e.getBullet();
        brain.hitByBullet(getTime(), b.getPower(), b.getHeadingRadians(), b.getX(), b.getY());
    }

    @Override
    public void onBulletHitBullet(BulletHitBulletEvent e) {
        Bullet ours = e.getBullet();
        Bullet theirs = e.getHitBullet();
        brain.bulletsMet(getTime(), theirs.getPower(), theirs.getHeadingRadians(), theirs.getX(), theirs.getY(),
            ours.getHeadingRadians(), ours.getPower());
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        brain.bulletHit(e.getBullet().getHeadingRadians(), e.getBullet().getPower());
    }

    @Override
    public void onBulletMissed(BulletMissedEvent e) {
        brain.bulletMissed(e.getBullet().getHeadingRadians(), e.getBullet().getPower());
    }

    @Override
    public void onHitWall(HitWallEvent e) {
        brain.hitWall();
    }

    @Override
    public void onHitRobot(HitRobotEvent e) {
        brain.robotsCollided();
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        out.println(brain.roundSummary());
    }
}
