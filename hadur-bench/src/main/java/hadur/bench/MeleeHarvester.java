package hadur.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.BulletState;
import robocode.control.snapshot.IBulletSnapshot;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.ITurnSnapshot;

/**
 * Watches a melee battle from the outside, for the melee gates.
 *
 * <ul>
 * <li>{@code hadur.log}: every line Hadur printed, as {@code round,turn,line}.</li>
 * <li>{@code rounds.csv}: one row per round ({@link #HEADER}): Hadur's finishing place among
 *     the non-sentry robots, who was left when the field thinned to Hadur and one other
 *     (the duel the melee handed over to) and whether Hadur won it, sentry bullets that hit
 *     Hadur and Hadur bullets that hit a sentry, and skipped turns. When Hadur died, also
 *     the tick it died, its killer and the last robot to hit it ({@link #HEADER}'s last
 *     three columns, {@code -} when it lived or nothing hit it). BENCH-103 adds the endgame and
 *     the damage Hadur took: the tick the field fell to Hadur and one other, Hadur's and that
 *     survivor's energy at that tick ({@code -} when the round never came to it), and the bullet
 *     damage Hadur took while three or more fighters were alive and while two were.</li>
 * <li>{@code bullets.csv}: one row per robot per round ({@link #BULLET_HEADER}): every
 *     fighter's shots, their summed power, hits on a fighter, the damage those scored (capped
 *     at the victim's energy, as the score caps it) and shots lost to another bullet; the
 *     {@code crowd} columns count only shots fired while five or more fighters were alive
 *     (counted before the turn's deaths); then the ticks it was alive and, of those, the ticks its gun
 *     was cool (heat 0) with energy to fire, so a robot that could shoot but held is seen. It
 *     is how Hadur's firepower is read against the field's.</li>
 * <li>{@code shots.csv} (BENCH-155): one row per Hadur shot at the turn it is first seen
 *     ({@link #SHOT_HEADER}): the round and turn, the fighters alive before that turn's deaths,
 *     Hadur's energy before the shot (its energy after, plus the power), the robot the shot was
 *     aimed at (the living fighter whose bearing lies nearest the bullet's heading), that robot's
 *     energy and distance, and the power. It is Hadur's bullet-power decision as a function of
 *     what a nano can see, the input of {@code tools/distill.py}.</li>
 * <li>{@code exposure.csv} (BENCH-116): one row per robot per round ({@link #EXPOSURE_HEADER}):
 *     the ticks it was alive with three or more fighters alive; over those ticks, the summed
 *     count of other fighters whose nearest living fighter it was; the bullet damage it took
 *     while three or more were alive (capped as above); and of that damage, the part fired by a
 *     shooter whose nearest living fighter it was when the shot was first seen, and the part
 *     whose second nearest it was. It is how Hadur's place in the crowd is read against the
 *     field's: whether it takes its damage as somebody's nearest robot or from shots meant for it
 *     from further off.</li>
 * </ul>
 */
public class MeleeHarvester extends BattleAdaptor {

    public static final String HEADER =
        "round,place,fielded,duelOpponent,duelWon,sentryHitsTaken,sentryHitsGiven,skippedTurns,"
        + "deathTick,killer,lastHit,duelTick,duelEnergy,duelOppEnergy,takenCrowd,takenDuel";

    public static final String BULLET_HEADER =
        "round,robot,shots,power,hits,damage,bulletHits,crowdShots,crowdPower,crowdHits,crowdDamage,aliveTicks,readyTicks";

    public static final String EXPOSURE_HEADER =
        "round,robot,crowdTicks,nearestLoad,takenCrowd,takenNearest,takenSecond";

    public static final String SHOT_HEADER =
        "round,turn,alive,ownEnergy,target,targetEnergy,distance,power";

    private final String us;
    private final BufferedWriter bullets;
    private final BufferedWriter shots;
    private final BufferedWriter exposure;
    /** BENCH-116, per robot this round: crowd ticks, nearest load, crowd damage taken, as nearest, as second. */
    private final Map<String, double[]> exposed = new LinkedHashMap<>();
    /** Bullet id to the victim's place by distance from the shooter when the shot was first seen, by robot index. */
    private final Map<Integer, Map<Integer, Integer>> shotRank = new java.util.HashMap<>();
    /** Per robot this round: shots, power, hits, damage, bullet hits, the crowd four, alive and ready ticks. */
    private final Map<String, double[]> tally = new LinkedHashMap<>();
    private final Set<Integer> seenShots = new HashSet<>();
    private final Set<Integer> endedShots = new HashSet<>();
    /** Fighters alive at the end of the previous turn: a shot first seen now left with them. */
    private int aliveBefore;
    /** Each robot's energy at the end of the previous turn, by index: a hit scores at most that. */
    private final Map<Integer, Double> energyBefore = new java.util.HashMap<>();
    /** Bullet id to whether it was fired in a crowd. */
    private final Map<Integer, Boolean> crowdShot = new java.util.HashMap<>();
    /** Sentry names: the snapshots' own sentry flag is not reliable in 1.9.5.6. */
    private final Set<String> sentries;
    private final BufferedWriter hadurLog;
    private final BufferedWriter rounds;
    private int round;
    private int place;
    private int fielded;
    /** Fighters alive at the last turn seen, Hadur included. */
    private int aliveAtEnd;
    private String duelOpponent;
    private int sentryHitsTaken, sentryHitsGiven, skippedTurns;
    private boolean placed;
    private int deathTick, lastHitTick;
    private String killer, lastHit;
    /** BENCH-103: the endgame's first tick and both energies then, and the damage taken by phase. */
    private int duelTick;
    private double duelEnergy, duelOppEnergy, takenCrowd, takenDuel;
    private final Set<Integer> counted = new HashSet<>();

    public MeleeHarvester(Path dir, String us, Set<String> sentries) throws IOException {
        this.us = us;
        this.sentries = sentries;
        this.hadurLog = Files.newBufferedWriter(dir.resolve("hadur.log"), StandardCharsets.UTF_8);
        this.rounds = Files.newBufferedWriter(dir.resolve("rounds.csv"), StandardCharsets.UTF_8);
        rounds.write(HEADER + "\n");
        this.bullets = Files.newBufferedWriter(dir.resolve("bullets.csv"), StandardCharsets.UTF_8);
        bullets.write(BULLET_HEADER + "\n");
        this.exposure = Files.newBufferedWriter(dir.resolve("exposure.csv"), StandardCharsets.UTF_8);
        exposure.write(EXPOSURE_HEADER + "\n");
        this.shots = Files.newBufferedWriter(dir.resolve("shots.csv"), StandardCharsets.UTF_8);
        shots.write(SHOT_HEADER + "\n");
    }

    @Override
    public void onRoundStarted(RoundStartedEvent e) {
        round = e.getRound();
        place = 0;
        fielded = 0;
        aliveAtEnd = 0;
        duelOpponent = null;
        sentryHitsTaken = sentryHitsGiven = skippedTurns = 0;
        placed = false;
        deathTick = lastHitTick = -1;
        killer = lastHit = null;
        duelTick = -1;
        duelEnergy = duelOppEnergy = takenCrowd = takenDuel = 0;
        counted.clear();
        tally.clear();
        seenShots.clear();
        endedShots.clear();
        crowdShot.clear();
        exposed.clear();
        shotRank.clear();
        aliveBefore = 0;
        energyBefore.clear();
    }

    @Override
    public void onTurnEnded(TurnEndedEvent e) {
        ITurnSnapshot snap = e.getTurnSnapshot();
        IRobotSnapshot[] robots = snap.getRobots();
        IRobotSnapshot me = null;
        int alive = 0;
        int fighters = 0;
        IRobotSnapshot other = null;
        for (IRobotSnapshot r : robots) {
            if (isSentry(r)) continue;
            fighters++;
            if (r.getName().equals(us)) me = r;
            if (r.getState() != robocode.control.snapshot.RobotState.DEAD) {
                alive++;
                if (!r.getName().equals(us)) other = r;
            }
        }
        if (me == null) return;
        fielded = fighters;
        aliveAtEnd = alive;
        boolean meAlive = me.getState() != robocode.control.snapshot.RobotState.DEAD;
        boolean diedNow = !placed && !meAlive;
        if (diedNow) {
            // Hadur died this turn: it placed behind everyone still alive.
            place = alive + 1;
            placed = true;
        }
        if (meAlive && alive == 2 && duelOpponent == null) {
            duelOpponent = other.getName();
            duelTick = snap.getTurn();
            duelEnergy = me.getEnergy();
            duelOppEnergy = other.getEnergy();
        }
        // Fighters alive before this turn's deaths, as the crowd count of bullets.csv reads it.
        int aliveThen = Math.max(alive, aliveBefore);

        for (IBulletSnapshot b : snap.getBullets()) {
            if (b.getState() != BulletState.HIT_VICTIM || !counted.add(b.getBulletId())) continue;
            IRobotSnapshot owner = byIndex(robots, b.getOwnerIndex());
            IRobotSnapshot victim = byIndex(robots, b.getVictimIndex());
            if (owner == null || victim == null) continue;
            if (isSentry(owner) && victim == me) sentryHitsTaken++;
            if (owner == me && isSentry(victim)) sentryHitsGiven++;
            if (victim == me && owner != me) {
                lastHit = owner.getName();
                lastHitTick = snap.getTurn();
                Double left = energyBefore.get(me.getRobotIndex());
                double dmg = robocode.Rules.getBulletDamage(b.getPower());
                if (left != null) dmg = Math.min(dmg, left);
                if (aliveThen >= 3) takenCrowd += dmg;
                else takenDuel += dmg;
            }
        }
        tallyExposure(robots, snap.getBullets(), alive);
        try {
            logShots(me, robots, snap.getBullets(), snap.getTurn(), aliveThen);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
        tallyBullets(robots, snap.getBullets(), alive);
        if (diedNow) {
            deathTick = snap.getTurn();
            killer = killerOf(me, robots, deathTick);
        }
        try {
            harvestConsole(me, snap.getTurn());
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    /**
     * The killer rule: the owner of the bullet that last hit Hadur, if it landed on the death
     * turn or the one before (the snapshot can lag a tick); otherwise the nearest fighter
     * still alive, taken to have rammed it. Null when neither exists (it died with the field).
     */
    private String killerOf(IRobotSnapshot me, IRobotSnapshot[] robots, int turn) {
        if (lastHit != null && lastHitTick >= turn - 1) return lastHit;
        IRobotSnapshot nearest = null;
        double best = Double.MAX_VALUE;
        for (IRobotSnapshot r : robots) {
            if (r == me || isSentry(r) || r.getState() == robocode.control.snapshot.RobotState.DEAD) continue;
            double d = Math.hypot(r.getX() - me.getX(), r.getY() - me.getY());
            if (d < best) {
                best = d;
                nearest = r;
            }
        }
        return nearest == null ? null : nearest.getName();
    }

    /** BENCH-116: who stands nearest whom in the crowd, and where each robot's crowd damage came from. */
    private void tallyExposure(IRobotSnapshot[] robots, IBulletSnapshot[] shots, int alive) {
        List<IRobotSnapshot> living = new java.util.ArrayList<>();
        for (IRobotSnapshot r : robots) {
            if (!isSentry(r) && r.getState() != robocode.control.snapshot.RobotState.DEAD) living.add(r);
        }
        if (alive >= 3) {
            for (IRobotSnapshot r : living) {
                exposed.computeIfAbsent(r.getName(), k -> new double[5])[0]++;
                IRobotSnapshot nearest = null;
                double best = Double.MAX_VALUE;
                for (IRobotSnapshot o : living) {
                    if (o == r) continue;
                    double d = Math.hypot(o.getX() - r.getX(), o.getY() - r.getY());
                    if (d < best) {
                        best = d;
                        nearest = o;
                    }
                }
                if (nearest != null) exposed.computeIfAbsent(nearest.getName(), k -> new double[5])[1]++;
            }
        }
        int aliveThen = Math.max(alive, aliveBefore);
        for (IBulletSnapshot b : shots) {
            int id = b.getBulletId();
            IRobotSnapshot owner = byIndex(robots, b.getOwnerIndex());
            if (owner == null || isSentry(owner)) continue;
            if (!shotRank.containsKey(id)) {
                List<IRobotSnapshot> others = new java.util.ArrayList<>();
                for (IRobotSnapshot o : living) {
                    if (o != owner) others.add(o);
                }
                others.sort(java.util.Comparator.comparingDouble(
                    o -> Math.hypot(o.getX() - owner.getX(), o.getY() - owner.getY())));
                Map<Integer, Integer> ranks = new java.util.HashMap<>();
                for (int i = 0; i < others.size(); i++) ranks.put(others.get(i).getRobotIndex(), i + 1);
                shotRank.put(id, ranks);
            }
            if (b.getState() != BulletState.HIT_VICTIM || endedShots.contains(id) || aliveThen < 3) continue;
            IRobotSnapshot victim = byIndex(robots, b.getVictimIndex());
            if (victim == null || isSentry(victim) || victim == owner) continue;
            Double left = energyBefore.get(victim.getRobotIndex());
            double dmg = robocode.Rules.getBulletDamage(b.getPower());
            if (left != null) dmg = Math.min(dmg, left);
            double[] x = exposed.computeIfAbsent(victim.getName(), k -> new double[5]);
            x[2] += dmg;
            Integer rank = shotRank.get(id).get(victim.getRobotIndex());
            if (rank != null && rank == 1) x[3] += dmg;
            if (rank != null && rank == 2) x[4] += dmg;
        }
    }

    private void tallyBullets(IRobotSnapshot[] robots, IBulletSnapshot[] shots, int alive) {
        for (IRobotSnapshot r : robots) {
            if (isSentry(r) || r.getState() == robocode.control.snapshot.RobotState.DEAD) continue;
            double[] t = tally.computeIfAbsent(r.getName(), k -> new double[11]);
            t[9]++;
            if (r.getGunHeat() <= 0 && r.getEnergy() > 0.1) t[10]++;
        }
        for (IBulletSnapshot b : shots) {
            IRobotSnapshot owner = byIndex(robots, b.getOwnerIndex());
            if (owner == null || isSentry(owner)) continue;
            double[] t = tally.computeIfAbsent(owner.getName(), k -> new double[11]);
            int id = b.getBulletId();
            if (seenShots.add(id)) {
                // Deaths land at the end of a turn, so a shot first seen now left while the
                // previous turn's fighters were still alive.
                boolean crowd = Math.max(alive, aliveBefore) >= 5;
                crowdShot.put(id, crowd);
                t[0]++;
                t[1] += b.getPower();
                if (crowd) {
                    t[5]++;
                    t[6] += b.getPower();
                }
            }
            BulletState st = b.getState();
            if ((st == BulletState.HIT_VICTIM || st == BulletState.HIT_BULLET) && endedShots.add(id)) {
                boolean crowd = Boolean.TRUE.equals(crowdShot.get(id));
                if (st == BulletState.HIT_BULLET) {
                    t[4]++;
                } else {
                    IRobotSnapshot victim = byIndex(robots, b.getVictimIndex());
                    if (victim == null || isSentry(victim)) continue;
                    // The score counts no more damage than the victim had energy left.
                    Double left = energyBefore.get(victim.getRobotIndex());
                    double dmg = robocode.Rules.getBulletDamage(b.getPower());
                    if (left != null) dmg = Math.min(dmg, left);
                    t[2]++;
                    t[3] += dmg;
                    if (crowd) {
                        t[7]++;
                        t[8] += dmg;
                    }
                }
            }
        }
        aliveBefore = alive;
        for (IRobotSnapshot r : robots) energyBefore.put(r.getRobotIndex(), r.getEnergy());
    }

    /**
     * BENCH-155: Hadur's shots as decisions. Runs before {@link #tallyBullets}, which is what
     * adds a shot to {@code seenShots}, so a shot is logged on the turn it is first seen.
     */
    private void logShots(IRobotSnapshot me, IRobotSnapshot[] robots, IBulletSnapshot[] bullets, int turn,
                          int alive) throws IOException {
        for (IBulletSnapshot b : bullets) {
            if (b.getOwnerIndex() != me.getRobotIndex() || seenShots.contains(b.getBulletId())) continue;
            if (b.getState() != BulletState.FIRED && b.getState() != BulletState.MOVING) continue;
            IRobotSnapshot target = null;
            double best = Double.MAX_VALUE;
            for (IRobotSnapshot r : robots) {
                if (r == me || isSentry(r) || r.getState() == robocode.control.snapshot.RobotState.DEAD) continue;
                double bearing = Math.atan2(r.getX() - me.getX(), r.getY() - me.getY());
                double off = Math.abs(robocode.util.Utils.normalRelativeAngle(bearing - b.getHeading()));
                if (off < best) {
                    best = off;
                    target = r;
                }
            }
            if (target == null) continue;
            double distance = Math.hypot(target.getX() - me.getX(), target.getY() - me.getY());
            shots.write(String.format(Locale.ROOT, "%d,%d,%d,%.2f,%s,%.2f,%.1f,%.2f%n", round, turn, alive,
                me.getEnergy() + b.getPower(), field(target.getName()), target.getEnergy(), distance, b.getPower()));
        }
    }

    private static String field(String name) {
        return name == null ? "-" : name.replace(',', ';');
    }

    private boolean isSentry(IRobotSnapshot r) {
        if (r.isSentryRobot()) return true;
        return MeleeReport.isSentry(r.getName(), sentries);
    }

    private static IRobotSnapshot byIndex(IRobotSnapshot[] robots, int index) {
        for (IRobotSnapshot r : robots) {
            if (r.getRobotIndex() == index) return r;
        }
        return null;
    }

    private void harvestConsole(IRobotSnapshot me, int turn) throws IOException {
        String out = me.getOutputStreamSnapshot();
        if (out == null || out.isEmpty()) return;
        for (String line : out.split("\\R")) {
            if (line.isEmpty()) continue;
            if (line.startsWith("SYSTEM:") && line.contains("skipped turn")) skippedTurns++;
            hadurLog.write(round + "," + turn + "," + line + "\n");
        }
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        // Alive at the end: first only if alone. A round cut short with others still standing
        // (the inactivity limit) ranks Hadur behind all of them, never as a win.
        if (!placed) place = Math.max(1, aliveAtEnd);
        // Won the duel it was handed if it was one of the last two and came first.
        String duelWon = duelOpponent == null ? "-" : place == 1 ? "1" : "0";
        try {
            boolean duel = duelTick >= 0;
            rounds.write(String.format(Locale.ROOT, "%d,%d,%d,%s,%s,%d,%d,%d,%s,%s,%s,%s,%s,%s,%.2f,%.2f%n", round,
                place, fielded, field(duelOpponent), duelWon, sentryHitsTaken, sentryHitsGiven, skippedTurns,
                deathTick < 0 ? "-" : String.valueOf(deathTick), field(killer), field(lastHit),
                duel ? String.valueOf(duelTick) : "-",
                duel ? String.format(Locale.ROOT, "%.2f", duelEnergy) : "-",
                duel ? String.format(Locale.ROOT, "%.2f", duelOppEnergy) : "-", takenCrowd, takenDuel));
            for (Map.Entry<String, double[]> en : tally.entrySet()) {
                double[] t = en.getValue();
                bullets.write(String.format(Locale.ROOT, "%d,%s,%d,%.2f,%d,%.2f,%d,%d,%.2f,%d,%.2f,%d,%d%n", round,
                    field(en.getKey()), (long) t[0], t[1], (long) t[2], t[3], (long) t[4], (long) t[5], t[6],
                    (long) t[7], t[8], (long) t[9], (long) t[10]));
            }
            for (Map.Entry<String, double[]> en : exposed.entrySet()) {
                double[] x = en.getValue();
                exposure.write(String.format(Locale.ROOT, "%d,%s,%d,%d,%.2f,%.2f,%.2f%n", round,
                    field(en.getKey()), (long) x[0], (long) x[1], x[2], x[3], x[4]));
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public void close() throws IOException {
        hadurLog.close();
        rounds.close();
        bullets.close();
        exposure.close();
        shots.close();
    }
}
