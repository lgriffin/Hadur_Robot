package hadur117.sepia;

import hadur117.core.ledger.EnergyLedger;
import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import hadur117.core.move.OurBullet;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.physics.MovementPredictor;
import hadur117.core.physics.Rules;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Sepia's brain for one battle: reads the enemy's shots, fixes a landing for each with the
 * {@link Gait}, lays ink across those landings with the {@link InkPlanner}, and punches with the
 * {@link PunchGun} when a punch is worth more (STRIKE-1).
 *
 * <p>It never imports Robocode: the adapter, {@code hadur117.Sepia}, turns engine events into the
 * calls below and the {@link Orders} back into setters. Each tick the adapter reports the tick's
 * events first, then the enemy's scan if there was one, then calls {@link #tick}.</p>
 */
public final class SepiaBrain {

    /** What the gun may do: the lab arms of the design's first card. */
    public enum Fire {
        /** Ink or punch, whichever is worth more per tick of reload (STRIKE-1). */
        FULL,
        /** Ink only, never a punch: the silent robot with its ink. */
        INK_ONLY,
        /** No shot at all: the silent robot with its ink off. */
        NONE
    }

    /** The orders for one tick, as the adapter applies them. */
    public static final class Orders {
        /** Body turn, radians, positive clockwise. */
        public double turn;
        /** Distance to drive, px: positive ahead, negative back. */
        public double ahead;
        /** The speed cap, px a tick. */
        public double maxVelocity;
        /** Gun turn, radians, positive clockwise. */
        public double gunTurn;
        /** Power to fire this tick, or 0 for none. */
        public double firePower;
        /** Radar turn, radians, positive clockwise. */
        public double radarTurn;
    }

    /** INK-1: an ink is fired only if it newly shades at least this share of the hit sets in flight, summed. */
    public static final double INK_FLOOR = 0.05;
    /** Ticks an ink takes to reload: 1 + 0.1 / 5 heat at 0.1 a tick. */
    static final double INK_RELOAD = 11;
    /** Gun turn a tick, radians. */
    static final double GUN_TURN = Math.toRadians(Rules.GUN_TURN_RATE);

    private final Gait gait;
    private final Fire fire;
    private final InkPlanner planner;
    private final AimBelief belief = new AimBelief();
    private final PunchGun punch = new PunchGun();
    private final EnergyLedger ledger;
    private final BattleField field;
    private final MovementPredictor predictor;
    private final double width, height;
    private final String enemyName;

    private final List<InkWave> waves = new ArrayList<>();
    private final List<OurBullet> bullets = new ArrayList<>();
    private final List<String> records = new ArrayList<>();
    private int round;
    private RobotState previous;
    private Point2D.Double enemy;
    private Point2D.Double enemyBefore;
    private double enemyHeading, enemyVelocity, enemyEnergy = 100;
    private boolean scanned;
    private boolean explained;
    /** The smallest power the enemy has fired this battle. */
    double smallestShot = Double.POSITIVE_INFINITY;
    /** The tick the gun is next expected to be cool, for the one-shot-ahead ink of JET-2. */
    private long nextCool;
    /** The shot the gun is turning toward: its tick, aim, power, and whether it is ink. */
    private long plannedTime = -1;
    private double plannedAim, plannedPower;
    private boolean plannedInk;
    private int inksFired, punchesFired;

    /**
     * A brain for one battle.
     *
     * @param kind the gait
     * @param fire what the gun may do
     * @param fieldWidth the field's width, px
     * @param fieldHeight the field's height, px
     * @param enemyName the opponent's name, for the kernel waves
     */
    public SepiaBrain(Gait.Kind kind, Fire fire, double fieldWidth, double fieldHeight, String enemyName) {
        this.gait = new Gait(kind, fieldWidth, fieldHeight);
        this.fire = fire;
        this.planner = new InkPlanner(fieldWidth, fieldHeight);
        this.ledger = new EnergyLedger(fieldWidth, fieldHeight);
        this.field = new BattleField(fieldWidth, fieldHeight);
        this.predictor = new MovementPredictor(field);
        this.width = fieldWidth;
        this.height = fieldHeight;
        this.enemyName = enemyName;
    }

    /**
     * A round starts: waves, bullets and the committed path are forgotten; the aim belief and the
     * punch gun's learning stay.
     *
     * @param round the round, from 0
     */
    public void newRound(int round) {
        this.round = round;
        waves.clear();
        bullets.clear();
        gait.newRound();
        ledger.newRound();
        punch.newRound();
        previous = null;
        enemy = null;
        enemyBefore = null;
        enemyEnergy = 100;
        plannedTime = -1;
        inksFired = 0;
        punchesFired = 0;
    }

    /**
     * An enemy bullet hit Sepia.
     *
     * @param time this tick
     * @param power its power
     * @param heading its heading, radians
     * @param x where it was, px
     * @param y where it was, px
     */
    public void hitByBullet(long time, double power, double heading, double x, double y) {
        ledger.enemyBulletHitUs(power);
        explained = true;
        InkWave w = match(time, power, x, y);
        if (w != null) {
            w.hit = true;
            belief.reveal(w.wave, heading);
        }
    }

    /**
     * One of Sepia's bullets met one of the enemy's.
     *
     * @param time this tick
     * @param theirPower the enemy bullet's power
     * @param theirHeading its heading, radians
     * @param x where they met, px
     * @param y where they met, px
     * @param ourHeading our bullet's heading, radians
     * @param ourPower our bullet's power
     */
    public void bulletsMet(long time, double theirPower, double theirHeading, double x, double y,
                           double ourHeading, double ourPower) {
        removeBullet(ourHeading, ourPower);
        InkWave w = match(time, theirPower, x, y);
        if (w != null) {
            w.met = true;
            belief.reveal(w.wave, theirHeading);
        }
    }

    /**
     * One of Sepia's bullets hit the enemy.
     *
     * @param heading its heading, radians
     * @param power its power
     */
    public void bulletHit(double heading, double power) {
        ledger.ourBulletHit(power);
        explained = true;
        if (power > InkPlanner.INK_POWER + 1e-9) punch.hit();
        removeBullet(heading, power);
    }

    /**
     * One of Sepia's bullets left the field.
     *
     * @param heading its heading, radians
     * @param power its power
     */
    public void bulletMissed(double heading, double power) {
        removeBullet(heading, power);
    }

    /** The robots collided this tick. */
    public void robotsCollided() {
        ledger.robotsCollided();
        explained = true;
    }

    /**
     * The enemy was scanned this tick.
     *
     * @param x its x, px
     * @param y its y, px
     * @param heading its heading, radians
     * @param velocity its velocity, px a tick
     * @param energy its energy
     */
    public void scan(double x, double y, double heading, double velocity, double energy) {
        enemyBefore = enemy;
        enemy = new Point2D.Double(x, y);
        enemyHeading = heading;
        enemyVelocity = velocity;
        enemyEnergy = energy;
        scanned = true;
    }

    /**
     * One tick: the reading of any shot, the drive, the gun and the radar.
     *
     * @param time this tick
     * @param x Sepia's x, px
     * @param y Sepia's y, px
     * @param heading its heading, radians
     * @param velocity its velocity, px a tick
     * @param energy its energy
     * @param gunHeading the gun's heading, radians
     * @param gunHeat the gun's heat
     * @param radarHeading the radar's heading, radians
     * @return this tick's orders
     */
    public Orders tick(long time, double x, double y, double heading, double velocity, double energy,
                       double gunHeading, double gunHeat, double radarHeading) {
        RobotState now = RobotState.newBuilder().setLocation(new Point2D.Double(x, y)).setHeading(heading)
            .setVelocity(velocity).setTime(time).build();
        nextCool = time + Math.max(1, (long) Math.ceil(gunHeat / 0.1 - 1e-9));
        Orders o = new Orders();
        ledger.ourTick(time, energy, explained);
        if (scanned && enemy != null) readShot(time, now);
        retire(time, now);
        if (enemy == null) {
            o.radarTurn = Double.POSITIVE_INFINITY;
            o.maxVelocity = 8;
            finish(now);
            return o;
        }
        gait.rescue(now, enemy, this::exposure);
        driveOrders(now, o);
        gunOrders(time, now, energy, gunHeading, gunHeat, o);
        double radar = Angles.normalRelativeAngle(DiaUtils.absoluteBearing(now.location, enemy) - radarHeading);
        o.radarTurn = scanned ? 2 * radar : (radar >= 0 ? 1 : -1) * Math.PI;
        finish(now);
        return o;
    }

    private void finish(RobotState now) {
        previous = now;
        scanned = false;
        explained = false;
    }

    /** WAVE-1, WAVE-2 through the kernel's ledger: a drop it cannot explain is a shot, fired last tick. */
    private void readShot(long time, RobotState now) {
        EnergyLedger.Reading r = ledger.scan(time, enemyEnergy, enemyVelocity, enemy.x, enemy.y);
        if (!r.shot() || previous == null || enemyBefore == null) return;
        double power = r.corrected();
        smallestShot = Math.min(smallestShot, power);
        Wave w = new Wave(enemyName, enemyBefore, previous.location, round, time - 1, power,
            previous.heading, previous.velocity, previous.velocity < 0 ? -1 : 1, field, predictor);
        InkWave iw = new InkWave(w, time);
        waves.add(iw);
        gait.shotRead(iw, now, enemy, this::exposure);
        recastAll();
    }

    /** Drops waves that have passed, met a bullet or hit Sepia, writing an INK record for each (INK-6). */
    private void retire(long time, RobotState now) {
        for (Iterator<InkWave> it = waves.iterator(); it.hasNext();) {
            InkWave w = it.next();
            if (w.committed && Double.isNaN(w.landedShade) && time >= w.arrival) w.landedShade = w.shaded();
            double d = now.location.distance(w.wave.sourceLocation);
            if (w.met || w.hit || w.pastBody(time, d)) {
                records.add(record(w));
                it.remove();
            }
        }
    }

    /** INK-6: one line per enemy wave. */
    String record(InkWave w) {
        double shade = Double.isNaN(w.landedShade) ? w.shaded() : w.landedShade;
        return String.format(java.util.Locale.ROOT,
            "INK round=%d fired=%d power=%.2f option=%s width=%.1f shaded=%.3f inks=%d met=%d hit=%d",
            round, w.wave.fireTime, w.power(), w.option == null ? "-" : w.option.name, w.widthPx(), shade,
            w.inks, w.met ? 1 : 0, w.hit ? 1 : 0);
    }

    private void driveOrders(RobotState now, Orders o) {
        double[] drive = gait.drive(now, enemy);
        double turn = Angles.normalRelativeAngle(drive[0] - now.heading);
        double ahead = 1000;
        if (Math.abs(turn) > Math.PI / 2) {
            turn = Angles.normalRelativeAngle(turn + Math.PI);
            ahead = -1000;
        }
        o.turn = turn;
        o.ahead = ahead;
        o.maxVelocity = drive[1];
    }

    private void gunOrders(long time, RobotState now, double energy, double gunHeading, double gunHeat, Orders o) {
        // Fire this tick if the gun is cool and on the shot planned for it.
        if (gunHeat <= 1e-9 && plannedTime == time && fire != Fire.NONE && energy > 0.2) {
            if (plannedInk) {
                InkPlanner.Shot s = inkOn(time, now.location, gunHeading);
                if (s != null && s.newShade() >= INK_FLOOR) {
                    o.firePower = InkPlanner.INK_POWER;
                    for (int i = 0; i < s.gains.length; i++) {
                        if (s.gains[i] > 0) liveForInk(time).get(i).inks++;
                    }
                    inksFired++;
                }
            } else if (Math.abs(Angles.normalRelativeAngle(gunHeading - plannedAim))
                       < Math.atan(18 / Math.max(18, now.location.distance(enemy)))) {
                o.firePower = plannedPower;
                punch.fired();
                punchesFired++;
            }
            if (o.firePower > 0) {
                bullets.add(new OurBullet(time, now.location, gunHeading, Math.min(o.firePower, energy)));
                recastAll();
                gunHeat = Rules.getGunHeat(o.firePower);
            }
        }
        long fireAt = time + Math.max(1, (long) Math.ceil(gunHeat / 0.1 - 1e-9));
        RobotState then = gait.ahead(now, enemy, (int) (fireAt - time));
        double power = punchPower(now, energy);
        double punchAim = punch.aim(time, gait.ahead(now, enemy, 1).location, enemy, enemyHeading, enemyVelocity, power);
        plannedTime = fireAt;
        plannedInk = false;
        plannedAim = punchAim;
        plannedPower = power;
        if (fire != Fire.NONE && fireAt - time <= 3) {
            InkPlanner.Shot ink = planner.best(waves, fireAt, then.location, gunHeading,
                GUN_TURN * (fireAt - time), belief);
            boolean useInk = ink != null && ink.newShade() >= INK_FLOOR;
            if (useInk && fire == Fire.FULL) useInk = inkWorthMore(ink, power, energy);
            if (useInk) {
                plannedInk = true;
                plannedAim = ink.aim;
            }
        }
        if (fire == Fire.INK_ONLY && !plannedInk) plannedTime = -1;
        o.gunTurn = Angles.normalRelativeAngle(plannedAim - gunHeading);
    }

    /**
     * STRIKE-1 and STRIKE-3: the ink against a punch of {@code power}, per tick of reload. The ink is
     * worth the damage and energy return of the bullets it is expected to stop; the punch its hit
     * chance times its damage and return, less what it costs. With no wave in flight, or the enemy
     * too weak to fire again while Sepia leads, the punch is taken.
     */
    boolean inkWorthMore(InkPlanner.Shot ink, double power, double energy) {
        boolean live = false;
        for (InkWave w : waves) live |= w.committed && !w.met && !w.hit;
        if (!live) return false;
        if (enemyEnergy < smallestShot && energy > enemyEnergy) {
            // The enemy cannot fire its smallest shot again: take what is left of it.
            return false;
        }
        double inkPerTick = ink.worth / INK_RELOAD;
        double h = punch.hitRate();
        double punchPerTick = (h * (Rules.getBulletDamage(power) + Rules.getBulletHitBonus(power)) - power)
            / (10 + 2 * power);
        return inkPerTick > punchPerTick;
    }

    /** The punch's power: hard up close, a kill shot when that is less, little when Sepia is low. */
    private double punchPower(RobotState now, double energy) {
        if (enemyEnergy <= 0) return Rules.MIN_BULLET_POWER;
        double d = now.location.distance(enemy);
        double p = d < 150 ? 3.0 : 1.95;
        double kill = enemyEnergy <= 4 ? enemyEnergy / 4 : (enemyEnergy + 2) / 6;
        p = Math.min(p, kill + 0.05);
        if (energy < 20) p = Math.min(p, energy / 10);
        return Math.max(Rules.MIN_BULLET_POWER, Math.min(Rules.MAX_BULLET_POWER, p));
    }

    /** The ink's worth on the gun's actual heading from where Sepia actually stands. */
    private InkPlanner.Shot inkOn(long time, Point2D.Double from, double gunHeading) {
        List<InkWave> live = liveForInk(time);
        if (live.isEmpty()) return null;
        double[] mass = new double[live.size()];
        double[] before = new double[live.size()];
        for (int i = 0; i < live.size(); i++) {
            mass[i] = belief.mass(live.get(i).wave, live.get(i).lo, live.get(i).hi);
            before[i] = live.get(i).shaded();
        }
        return planner.score(live, mass, before, time, from, gunHeading);
    }

    private List<InkWave> liveForInk(long time) {
        List<InkWave> live = new ArrayList<>();
        for (InkWave w : waves) if (w.committed && !w.met && !w.hit && w.arrival > time + 1) live.add(w);
        return live;
    }

    /**
     * JET-2, SURF-4: a landing's exposure. Its chance of holding the bullet, times the damage, times
     * the share of it left unshaded by our bullets in the air and by the next ink the planner could
     * lay from where the option puts Sepia when the gun is next cool. A landing near the enemy or a
     * wall costs more.
     */
    double exposure(InkWave w, Gait.Forecast f) {
        InkWave.Landing saved = w.landing();
        w.commit(f.lo, f.hi, f.distance, f.arrival, f.passed, saved.option);
        w.recast(bullets, width, height);
        double shade = w.shaded();
        if (fire != Fire.NONE) {
            long t = Math.max(nextCool, f.states.get(0).time + 1);
            InkPlanner.Shot s = planner.best(List.of(w), t, f.at(t).location, 0, Math.PI, belief);
            if (s != null) shade += s.gains[0];
        }
        double mass = belief.mass(w.wave, f.lo, f.hi);
        double e = w.damage * mass * (1 - Math.min(1, shade));
        if (f.nearestEnemy < 120) e += w.damage * (120 - f.nearestEnemy) / 120;
        if (f.wallHit) e += w.damage * 0.5;
        w.restore(saved);
        return e;
    }

    private void recastAll() {
        for (InkWave w : waves) if (w.committed) w.recast(bullets, width, height);
    }

    private void removeBullet(double heading, double power) {
        for (Iterator<OurBullet> it = bullets.iterator(); it.hasNext();) {
            if (it.next().is(heading, power)) {
                it.remove();
                recastAll();
                return;
            }
        }
    }

    /** The wave a bullet seen at ({@code x}, {@code y}) on tick {@code time} belongs to, or null. */
    private InkWave match(long time, double power, double x, double y) {
        InkWave best = null;
        double bestErr = Double.POSITIVE_INFINITY;
        Point2D.Double p = new Point2D.Double(x, y);
        for (InkWave w : waves) {
            if (Math.abs(w.power() - power) > 0.01 || w.met || w.hit) continue;
            double err = Math.abs(w.wave.distanceTraveled(time) - w.wave.sourceLocation.distance(p));
            if (err < bestErr) {
                bestErr = err;
                best = w;
            }
        }
        return best != null && bestErr < best.wave.bulletSpeed() * 2 + 5 ? best : null;
    }

    /** INK-6 records written since the last call, to be printed by the adapter. */
    public List<String> drainRecords() {
        List<String> out = new ArrayList<>(records);
        records.clear();
        return out;
    }

    /** A one-line summary of the round, for the robot's console. */
    public String roundSummary() {
        return String.format(java.util.Locale.ROOT, "SEPIA round=%d gait=%s fire=%s inks=%d punches=%d revealed=%d",
            round, gait.kind(), fire, inksFired, punchesFired, belief.revealed());
    }

    /** The waves in flight, for tests. */
    List<InkWave> waves() {
        return waves;
    }

    /** The gait, for tests. */
    Gait gait() {
        return gait;
    }
}
