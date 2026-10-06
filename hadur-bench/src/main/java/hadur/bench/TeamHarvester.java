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
import robocode.Rules;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.BulletState;
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
 *     ({@code E} records) that fell below the truth (WORLD-8), and, from the engine's own
 *     bullet snapshots, our bullets that hit one of our own members (T1's friendly fire).</li>
 * <li>{@code friendly.log}: one line for each of those, with the bullet's power and how far
 *     it flew, so a hit can be read against the lane that was kept.</li>
 * </ul>
 *
 * <p>{@code focusFireRatio} (the last column, BENCH-42) is, from the engine's bullet snapshots,
 * the share of the damage our team's bullets did to enemy fighters that landed on the most-hit
 * enemy this round; {@code -} when none landed. It is bullet damage only: ramming is not in it,
 * and with few enemies left it rises on its own.</p>
 */
public class TeamHarvester extends BattleAdaptor {

    public static final String HEADER = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates,focusFireRatio";
    /** A robot's half-width: a teammate this close to a bullet's line is in its lane. */
    static final double HALF_WIDTH = 18;

    private final String memberClass;
    private final Path dir;
    private final Map<Integer, BufferedWriter> logs = new HashMap<>();
    private final BufferedWriter rounds;
    private final Set<Integer> bullets = new HashSet<>();
    private final Set<Integer> friendly = new HashSet<>();
    private final Map<Integer, double[]> firstSeen = new HashMap<>();
    private final Set<Integer> damaging = new HashSet<>();
    private final Map<Integer, Double> damageByEnemy = new HashMap<>();
    private final BufferedWriter debug;
    private int round;
    private int ourTeam = -1;
    private int membersAlive, enemiesAlive, shots, inLane, belowTruth, countReports, bulletsOnMates;

    public TeamHarvester(Path dir, String memberClass) throws IOException {
        this.dir = dir;
        this.memberClass = memberClass;
        this.rounds = Files.newBufferedWriter(dir.resolve("rounds.csv"), StandardCharsets.UTF_8);
        rounds.write(HEADER + "\n");
        this.debug = Files.newBufferedWriter(dir.resolve("friendly.log"), StandardCharsets.UTF_8);
    }

    @Override
    public void onRoundStarted(RoundStartedEvent e) {
        round = e.getRound();
        bullets.clear();
        friendly.clear();
        firstSeen.clear();
        damaging.clear();
        damageByEnemy.clear();
        membersAlive = enemiesAlive = shots = inLane = belowTruth = countReports = bulletsOnMates = 0;
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
            firstSeen.putIfAbsent(b.getBulletId(), new double[] {b.getX(), b.getY()});
            // The engine's own record of a bullet of ours that ended on one of our members.
            if (b.getState() == BulletState.HIT_VICTIM && b.getVictimIndex() >= 0
                    && b.getVictimIndex() < robots.length && b.getOwnerIndex() >= 0
                    && b.getOwnerIndex() < robots.length
                    && robots[b.getOwnerIndex()].getTeamIndex() == ourTeam
                    && robots[b.getVictimIndex()].getTeamIndex() == ourTeam
                    && friendly.add(b.getBulletId())) {
                bulletsOnMates++;
                IRobotSnapshot v = robots[b.getVictimIndex()], o = robots[b.getOwnerIndex()];
                double[] first = firstSeen.get(b.getBulletId());
                write(debug, String.format(Locale.ROOT, "%d,%d,owner=%d,victim=%d,power=%.2f,travelled=%.0f,"
                    + "victimVelocity=%.1f,ownerVelocity=%.1f%n", round, turn, o.getRobotIndex(), v.getRobotIndex(),
                    b.getPower(), Math.hypot(b.getX() - first[0], b.getY() - first[1]), v.getVelocity(),
                    o.getVelocity()));
            }
            if (b.getState() == BulletState.HIT_VICTIM && b.getVictimIndex() >= 0
                    && b.getVictimIndex() < robots.length && b.getOwnerIndex() >= 0
                    && b.getOwnerIndex() < robots.length
                    && robots[b.getOwnerIndex()].getTeamIndex() == ourTeam
                    && robots[b.getVictimIndex()].getTeamIndex() != ourTeam
                    && !robots[b.getVictimIndex()].isSentryRobot() && damaging.add(b.getBulletId())) {
                damageByEnemy.merge(b.getVictimIndex(), Rules.getBulletDamage(b.getPower()), Double::sum);
            }
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
        double total = 0, most = 0;
        for (double d : damageByEnemy.values()) {
            total += d;
            most = Math.max(most, d);
        }
        write(rounds, String.format(Locale.ROOT, "%d,%d,%d,%d,%d,%d,%d,%d,%d,%s%n", round, membersAlive, enemiesAlive,
            membersAlive > 0 && enemiesAlive == 0 ? 1 : 0, shots, inLane, belowTruth, countReports,
            bulletsOnMates, total > 0 ? String.format(Locale.ROOT, "%.4f", most / total) : "-"));
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
        debug.close();
        for (BufferedWriter w : logs.values()) w.close();
    }
}
