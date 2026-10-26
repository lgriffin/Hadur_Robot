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
 *     it flew, so a hit can be read against the lane that was kept, and (BENCH-114) where the
 *     victim stood when the bullet was fired: {@code target} (how far along the bullet's line the
 *     nearest enemy within {@link #TARGET_HALF} px of it stood, {@code -} for none),
 *     {@code victimAlong}, {@code victimAcross}, and {@link #kind}.</li>
 * <li>{@code bullets.log}: every bullet in the battle, ours and the enemies', as
 *     {@code round,turn,F,id,owner,power,x,y,heading,members} when the engine first shows it
 *     (for an enemy bullet, {@code members} lists each living member of ours as
 *     {@code name:x:y:heading:velocity}, ';'-separated; {@code -} for ours) and
 *     {@code round,turn,H,id,owner,victim,power} when it hits a robot, so the shots members
 *     infer from energy drops can be matched to the engine's truth.</li>
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
    /** BENCH-114: an enemy this close to a bullet's line, ahead of it, is the shot's target. */
    static final double TARGET_HALF = 60;
    /** BENCH-114: a teammate this close to the line, before the target, was in the lane when it fired. */
    static final double LANE_HALF = 36;

    private final String memberClass;
    private final Path dir;
    private final Map<Integer, BufferedWriter> logs = new HashMap<>();
    private final BufferedWriter rounds;
    private final Set<Integer> bullets = new HashSet<>();
    private final Set<Integer> friendly = new HashSet<>();
    private final Map<Integer, double[]> firstSeen = new HashMap<>();
    /** BENCH-114: our bullets' geometry when first seen: the target's distance along, then each robot's along and across. */
    private final Map<Integer, double[]> fireGeometry = new HashMap<>();
    private final Set<Integer> damaging = new HashSet<>();
    private final Map<Integer, Double> damageByEnemy = new HashMap<>();
    private final BufferedWriter debug;
    private final BufferedWriter bulletLog;
    private final Set<Integer> hits = new HashSet<>();
    private int round;
    private int ourTeam = -1;
    private int membersAlive, enemiesAlive, shots, inLane, belowTruth, countReports, bulletsOnMates;

    public TeamHarvester(Path dir, String memberClass) throws IOException {
        this.dir = dir;
        this.memberClass = memberClass;
        this.rounds = Files.newBufferedWriter(dir.resolve("rounds.csv"), StandardCharsets.UTF_8);
        rounds.write(HEADER + "\n");
        this.debug = Files.newBufferedWriter(dir.resolve("friendly.log"), StandardCharsets.UTF_8);
        this.bulletLog = Files.newBufferedWriter(dir.resolve("bullets.log"), StandardCharsets.UTF_8);
    }

    @Override
    public void onRoundStarted(RoundStartedEvent e) {
        round = e.getRound();
        bullets.clear();
        friendly.clear();
        hits.clear();
        firstSeen.clear();
        fireGeometry.clear();
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
            // BENCH-114: our bullet's line when first seen in flight; one first seen ending has none.
            if (!firstSeen.containsKey(b.getBulletId()) && b.getState() != BulletState.HIT_VICTIM
                    && b.getOwnerIndex() >= 0 && b.getOwnerIndex() < robots.length
                    && robots[b.getOwnerIndex()].getTeamIndex() == ourTeam) {
                fireGeometry.put(b.getBulletId(), geometry(b.getX(), b.getY(), Math.sin(b.getHeading()),
                    Math.cos(b.getHeading()), robots));
            }
            firstSeen.putIfAbsent(b.getBulletId(), new double[] {b.getX(), b.getY()});
            logBullet(b, robots, turn);
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
                double travelled = Math.hypot(b.getX() - first[0], b.getY() - first[1]);
                double[] g = fireGeometry.get(b.getBulletId());
                String where = ",target=-,victimAlong=-,victimAcross=-,kind=unseen";
                if (g != null) {
                    double along = g[1 + 2 * b.getVictimIndex()], across = g[2 + 2 * b.getVictimIndex()];
                    where = String.format(Locale.ROOT, ",target=%s,victimAlong=%.0f,victimAcross=%.0f,kind=%s",
                        Double.isNaN(g[0]) ? "-" : String.format(Locale.ROOT, "%.0f", g[0]), along, across,
                        kind(g[0], along, across, travelled));
                }
                write(debug, String.format(Locale.ROOT, "%d,%d,owner=%d,victim=%d,power=%.2f,travelled=%.0f,"
                    + "victimVelocity=%.1f,ownerVelocity=%.1f%s%n", round, turn, o.getRobotIndex(), v.getRobotIndex(),
                    b.getPower(), travelled, v.getVelocity(), o.getVelocity(), where));
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

    /**
     * BENCH-114: a bullet's line from (x, y) along (dx, dy): first how far along it the nearest
     * living enemy fighter ahead and within {@link #TARGET_HALF} px of it stands (NaN for none),
     * then, per robot (in the snapshot's order, which victim indexes follow), that robot's distance along the line and across it.
     */
    private double[] geometry(double x, double y, double dx, double dy, IRobotSnapshot[] robots) {
        double[] g = new double[1 + 2 * robots.length];
        g[0] = Double.NaN;
        for (int i = 0; i < robots.length; i++) {
            IRobotSnapshot r = robots[i];
            double rx = r.getX() - x, ry = r.getY() - y;
            double along = rx * dx + ry * dy, across = Math.abs(rx * dy - ry * dx);
            g[1 + 2 * i] = along;
            g[2 + 2 * i] = across;
            if (r.getTeamIndex() != ourTeam && r.getState().isAlive() && !r.isSentryRobot() && along > 0
                    && across <= TARGET_HALF && !(along >= g[0])) {
                g[0] = along;
            }
        }
        return g;
    }

    /**
     * BENCH-114: what kind of friendly hit a bullet made, from where its victim stood when it was
     * fired: {@code noline} with no target; {@code lane} when the victim was ahead within
     * {@link #LANE_HALF} px of the line and nearer than the target; {@code walkin} when the bullet
     * hit before reaching the target (the victim stepped into its path); {@code beyond} when it
     * had flown past the target (a miss that flew on).
     */
    static String kind(double target, double along, double across, double travelled) {
        if (Double.isNaN(target)) return "noline";
        if (along > 0 && across <= LANE_HALF && along < target) return "lane";
        return travelled < target - HALF_WIDTH ? "walkin" : "beyond";
    }

    private void logBullet(IBulletSnapshot b, IRobotSnapshot[] robots, int turn) {
        int o = b.getOwnerIndex();
        String owner = o >= 0 && o < robots.length ? robots[o].getName() : "-";
        if (!bullets.contains(b.getBulletId())) {
            StringBuilder members = new StringBuilder();
            if (o >= 0 && o < robots.length && robots[o].getTeamIndex() != ourTeam) {
                for (IRobotSnapshot r : robots) {
                    if (r.getTeamIndex() != ourTeam || !r.getState().isAlive()) continue;
                    if (members.length() > 0) members.append(';');
                    members.append(String.format(Locale.ROOT, "%s:%.1f:%.1f:%.4f:%.2f", r.getName(), r.getX(), r.getY(),
                        r.getBodyHeading(), r.getVelocity()));
                }
            }
            write(bulletLog, String.format(Locale.ROOT, "%d,%d,F,%d,%s,%.2f,%.1f,%.1f,%.4f,%s%n", round, turn,
                b.getBulletId(), owner, b.getPower(), b.getX(), b.getY(), b.getHeading(),
                members.length() > 0 ? members : "-"));
        }
        int v = b.getVictimIndex();
        if (b.getState() == BulletState.HIT_VICTIM && v >= 0 && v < robots.length && hits.add(b.getBulletId())) {
            write(bulletLog, String.format(Locale.ROOT, "%d,%d,H,%d,%s,%s,%.2f%n", round, turn, b.getBulletId(),
                owner, robots[v].getName(), b.getPower()));
        }
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
        bulletLog.close();
        for (BufferedWriter w : logs.values()) w.close();
    }
}
