package hadur.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.IBulletSnapshot;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.ITurnSnapshot;

/**
 * Watches a team battle from the outside, for A5's gate.
 *
 * <ul>
 * <li>{@code member-N.log}: every line member N of our team printed, as {@code round,turn,line}.</li>
 * <li>{@code rounds.csv}: one row per round ({@link #HEADER}): our members and enemies alive
 *     at the end, whether our team won, our shots fired and how many left with a living
 *     teammate truly in the lane, and the member reports of the count of enemies alive
 *     ({@code E} records) that fell below the truth (WORLD-8).</li>
 * </ul>
 */
public class TeamHarvester extends BattleAdaptor {

    public static final String HEADER = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports";
    /** A robot's half-width: a teammate this close to a bullet's line is in its lane. */
    static final double HALF_WIDTH = 18;

    private final String memberClass;
    private final Path dir;
    private final Map<Integer, BufferedWriter> logs = new HashMap<>();
    private final BufferedWriter rounds;
    private final Set<Integer> bullets = new HashSet<>();
    private int round;
    private int ourTeam = -1;
    private int membersAlive, enemiesAlive, shots, inLane, belowTruth, countReports;

    public TeamHarvester(Path dir, String memberClass) throws IOException {
        this.dir = dir;
        this.memberClass = memberClass;
        this.rounds = Files.newBufferedWriter(dir.resolve("rounds.csv"), StandardCharsets.UTF_8);
        rounds.write(HEADER + "\n");
    }

    @Override
    public void onRoundStarted(RoundStartedEvent e) {
        round = e.getRound();
        bullets.clear();
        membersAlive = enemiesAlive = shots = inLane = belowTruth = countReports = 0;
    }

    private boolean ours(IRobotSnapshot r) {
        return r.getName().startsWith(memberClass + " ") || r.getName().equals(memberClass);
    }

    @Override
    public void onTurnEnded(TurnEndedEvent e) {
        ITurnSnapshot snap = e.getTurnSnapshot();
        IRobotSnapshot[] robots = snap.getRobots();
        int turn = snap.getTurn();
        int mates = 0, enemies = 0;
        for (IRobotSnapshot r : robots) {
            if (ourTeam < 0 && ours(r)) ourTeam = r.getTeamIndex();
        }
        for (IRobotSnapshot r : robots) {
            boolean alive = r.getState().isAlive();
            boolean mine = r.getTeamIndex() == ourTeam;
            if (alive && mine) mates++;
            if (alive && !mine && !r.isSentryRobot()) enemies++;
        }
        for (IRobotSnapshot r : robots) {
            if (r.getTeamIndex() != ourTeam) continue;
            String out = r.getOutputStreamSnapshot();
            if (out == null || out.isEmpty()) continue;
            for (String line : out.split("\\r?\\n")) {
                if (line.isEmpty()) continue;
                write(log(r.getRobotIndex()), round + "," + turn + "," + line + "\n");
                // E,round,tick,count: a member's count of enemies alive as it changed.
                if (line.startsWith("E,")) {
                    countReports++;
                    String[] f = line.split(",");
                    if (f.length >= 4 && Integer.parseInt(f[3]) < enemies) belowTruth++;
                }
            }
        }
        for (IBulletSnapshot b : snap.getBullets()) {
            if (!bullets.add(b.getBulletId())) continue;
            IRobotSnapshot owner = b.getOwnerIndex() >= 0 && b.getOwnerIndex() < robots.length
                ? robots[b.getOwnerIndex()] : null;
            if (owner == null || owner.getTeamIndex() != ourTeam) continue;
            shots++;
            double dx = Math.sin(b.getHeading()), dy = Math.cos(b.getHeading());
            for (IRobotSnapshot r : robots) {
                if (r == owner || r.getTeamIndex() != ourTeam || !r.getState().isAlive()) continue;
                double rx = r.getX() - b.getX(), ry = r.getY() - b.getY();
                double along = rx * dx + ry * dy;
                if (along > 0 && Math.abs(rx * dy - ry * dx) <= HALF_WIDTH) {
                    inLane++;
                    break;
                }
            }
        }
        membersAlive = mates;
        enemiesAlive = enemies;
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        write(rounds, String.format(Locale.ROOT, "%d,%d,%d,%d,%d,%d,%d,%d%n", round, membersAlive, enemiesAlive,
            membersAlive > 0 && enemiesAlive == 0 ? 1 : 0, shots, inLane, belowTruth, countReports));
    }

    private BufferedWriter log(int robotIndex) {
        return logs.computeIfAbsent(robotIndex, i -> {
            try {
                return Files.newBufferedWriter(dir.resolve("member-" + i + ".log"), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        });
    }

    private static void write(BufferedWriter w, String s) {
        try {
            w.write(s);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public void close() throws IOException {
        rounds.close();
        for (BufferedWriter w : logs.values()) w.close();
    }
}
