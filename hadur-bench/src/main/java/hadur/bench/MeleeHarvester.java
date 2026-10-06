package hadur.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Locale;
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
 *     three columns, {@code -} when it lived or nothing hit it).</li>
 * </ul>
 */
public class MeleeHarvester extends BattleAdaptor {

    public static final String HEADER =
        "round,place,fielded,duelOpponent,duelWon,sentryHitsTaken,sentryHitsGiven,skippedTurns,"
        + "deathTick,killer,lastHit";

    private final String us;
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
    private final Set<Integer> counted = new HashSet<>();

    public MeleeHarvester(Path dir, String us, Set<String> sentries) throws IOException {
        this.us = us;
        this.sentries = sentries;
        this.hadurLog = Files.newBufferedWriter(dir.resolve("hadur.log"), StandardCharsets.UTF_8);
        this.rounds = Files.newBufferedWriter(dir.resolve("rounds.csv"), StandardCharsets.UTF_8);
        rounds.write(HEADER + "\n");
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
        counted.clear();
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
        if (meAlive && alive == 2 && duelOpponent == null) duelOpponent = other.getName();

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
            }
        }
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
            rounds.write(String.format(Locale.ROOT, "%d,%d,%d,%s,%s,%d,%d,%d,%s,%s,%s%n", round, place,
                fielded, field(duelOpponent), duelWon, sentryHitsTaken, sentryHitsGiven, skippedTurns,
                deathTick < 0 ? "-" : String.valueOf(deathTick), field(killer), field(lastHit)));
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public void close() throws IOException {
        hadurLog.close();
        rounds.close();
    }
}
