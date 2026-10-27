package hadur2.core;

import hadur2.core.link.LinkCodec;
import hadur2.core.link.Report;
import hadur2.core.melee.TeamModes;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import hadur2.core.role.TeammateFence;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyTracker;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 * The conductor's part in a team battle (A5): it turns the engine's input into what a strand
 * may see, merges teammates' reports into the World, keeps the count of enemies, gives or
 * withholds the fire permission by the fire lane, and writes this member's report. Built
 * only in a Team-charter battle: in a duel or a melee the roles see the raw input, so
 * nothing there changes.
 *
 * <ul>
 * <li>WORLD-7: a teammate's scan, hit, collision or death goes to the World alone, and a
 *     teammate's message to the link alone.</li>
 * <li>WORLD-6: our bullet that ends on a teammate, or on a teammate's bullet, reaches the
 *     role as a bullet that missed, so its count of bullets in flight stays right.</li>
 * <li>WORLD-4: each teammate's report is merged once, oldest stated tick first; a sighting
 *     older than what the World holds is dropped.</li>
 * <li>WORLD-2, WORLD-8: a role's count of others is the World's count of enemies alive,
 *     which never falls below the truth. LINK-3: with no report it is still computed, from
 *     the engine's count and the deaths it announced.</li>
 * <li>WEAVE-4: the fire permission is withheld while a living teammate's last known
 *     position, no older than {@link Roster#SILENT_WINDOW}, lies in the fire lane.</li>
 * <li>WEAVE-7 (T1): the lane is also held while a teammate's predicted track, over the time
 *     a bullet would take to pass it, comes within the lane's half-width.</li>
 * <li>WEAVE-9 (T7): the shipped lane is Ogi's narrow one: only a teammate nearer than the
 *     enemy on the gun's line, and within a robot's width of that line, holds the shot.
 *     WEAVE-4 and WEAVE-7's wide lane stays for the {@code tlanew} ablation.</li>
 * <li>WEAVE-8 (T1): the driving role's drive is replaced when it would bring Hadur into a
 *     living teammate ({@link TeammateFence}); the replacements are counted.</li>
 * <li>LINK-4: while a teammate lives, every completed tick's orders carry our report.</li>
 * <li>MGUN-8 (T5): each teammate's sighting the World takes is kept for the tick, as it was
 *     stated, so the melee strand's field gun learns the enemy's movement from every member's
 *     radar.</li>
 * </ul>
 */
final class TeamLink {

    /**
     * WEAVE-4: the fire lane's half-width at a fresh position, px: a robot's half-width (18)
     * and a bullet's few px of slack. It grows by {@link #DRIFT} for each tick of age.
     */
    static final double LANE_HALF_WIDTH = 24;
    /** A robot's top speed: how far a teammate can have moved per tick since last known. */
    static final double DRIFT = 8;
    /** WEAVE-7: a bullet's slowest and fastest speed, px a tick: when it passes a teammate's range. */
    static final double SLOWEST_BULLET = 11;
    static final double FASTEST_BULLET = 19.7;
    /** WEAVE-7: how far, px for each tick of the bullet's flight, a teammate may turn off its predicted track. */
    static final double TURN_SLACK = 3.0;
    /** WEAVE-7: the longest flight judged, ticks: far more than any field's diagonal over a bullet's slowest speed. */
    static final int MAX_FLIGHT = 400;
    /**
     * WEAVE-9: the shipped lane is the narrow one. Step C (docs/plan-team-top5.md) benched it
     * against 3.16's wide lane: +2.2 share points on 46 teams, +2.9 with TMODE-9.
     */
    static final boolean NARROW_LANE = true;
    /** WEAVE-9: a teammate holds the shot within this many px of the gun's line, at its distance. */
    static final double NARROW_MATE_HALF = 30;
    /** WEAVE-9: the target is the nearest enemy within this many px of the gun's line, at its distance. */
    static final double NARROW_TARGET_HALF = 36;
    /**
     * WEAVE-10: a teammate nearer than the target also holds the shot when its predicted track
     * meets a bullet flying the gun's line (see {@code meetsBullet}). Off: an ablation
     * (tlanep) against own-bullet hits, which tripled with the narrow lane.
     */
    static final boolean NARROW_PREDICT = false;
    /**
     * WEAVE-11: a teammate up to {@link #BEYOND_RANGE} px beyond the target holds the shot when
     * its predicted track meets the bullet there: a bullet that misses flies on into a hunter on
     * the prey's far side. Off: ablation tlaneb.
     */
    static final boolean NARROW_BEYOND = false;
    /** WEAVE-11: how far past the target a teammate still holds the shot, px: a HUNT slot's 350 and slack. */
    static final double BEYOND_RANGE = 450;
    /** WEAVE-10, WEAVE-11: the bullet speed a teammate's track is judged against, px a tick (power 2). */
    static final double LANE_BULLET_SPEED = 14;
    /** WEAVE-10, WEAVE-11: how far along the line, px, a teammate may be from the bullet and still meet it. */
    static final double LANE_ALONG_SLACK = 40;

    private final HadurCore core;
    private final BattleFacts facts;
    private final Roster roster;
    private final EnemyTracker world;
    /** WEAVE-9 or the wide lane (WEAVE-4, WEAVE-7); a test may judge the wide one. */
    boolean narrowLane = NARROW_LANE;
    /** WEAVE-10 and WEAVE-11 as this link plays them; a test may turn them on. */
    boolean predictLane = NARROW_PREDICT;
    boolean beyondLane = NARROW_BEYOND;
    /** TMODE-17, TMODE-18: the modes against the living enemies, from the team mode table; a test may name its own. */
    Function<List<EnemyInfo>, Set<TeamModes.Mode>> modes = TeamModes::against;
    /** WORLD-4: the latest stated tick merged from each teammate this round. */
    private final Map<String, Long> merged = new HashMap<>();
    /** This tick's fresh sightings of enemies, for our report. */
    private final List<Report.Sighting> fresh = new ArrayList<>();
    /** MGUN-8: this tick's teammates' sightings the World took, in the order it took them. */
    private final List<MateSighting> mateSightings = new ArrayList<>();
    /** MMOVE-10 (T6): this tick's teammates' samples of the enemies' guns, in merge order. */
    private final List<Report.Dodge> mateDodges = new ArrayList<>();
    /** TMODE-9: this tick's teammates' shots, each with its sender, in merge order. */
    private final List<MateShot> mateShots = new ArrayList<>();

    /** TMODE-9: one bullet a teammate reported firing. */
    static final class MateShot {
        final String mate;
        final Report.Shot shot;

        MateShot(String mate, Report.Shot shot) {
            this.mate = mate;
            this.shot = shot;
        }
    }

    /**
     * MGUN-8: one teammate's sighting of an enemy as the World took it: where and how it moved
     * at the stated tick, its turn rate from the World's scans then (NaN while unknown), and
     * its distance from us when the report was merged.
     */
    static final class MateSighting {
        final String name;
        final long tick;
        final double x, y, heading, velocity, turnRate, distance;

        MateSighting(String name, long tick, double x, double y, double heading, double velocity,
                     double turnRate, double distance) {
            this.name = name;
            this.tick = tick;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.velocity = velocity;
            this.turnRate = turnRate;
            this.distance = distance;
        }
    }

    int teammateHits;
    int teammateBulletHits;
    int teammateCollisions;
    int blockedShots;
    /** WEAVE-8: drives the teammate fence replaced this round. */
    int fenced;
    private boolean holding;
    private final TeammateFence mateFence;
    /** WORLD-9: the living teammates with a fresh position as of the tick's input. */
    private List<Roster.Mate> living = List.of();
    int reportsMerged;

    TeamLink(HadurCore core, BattleFacts facts, Roster roster, EnemyTracker world) {
        this.core = core;
        this.facts = facts;
        this.roster = roster;
        this.world = world;
        this.mateFence = new TeammateFence(facts.width(), facts.height());
    }

    void newRound() {
        roster.newRound();
        merged.clear();
        holding = false;
        teammateHits = teammateBulletHits = teammateCollisions = blockedShots = reportsMerged = fenced = 0;
        living = List.of();
    }

    /**
     * The input the roles see this tick: the teammates' events taken out (WORLD-7), our
     * bullets on teammates turned into misses (WORLD-6), the reports merged (WORLD-4) and
     * the count of others replaced by the count of enemies alive (WORLD-2, WORLD-8).
     */
    BotInput filter(BotInput in) {
        long now = in.time();
        roster.beginTick(now);
        fresh.clear();
        mateSightings.clear();
        mateDodges.clear();
        mateShots.clear();
        boolean sentries = in.numSentries() > 0;
        List<Report> reports = new ArrayList<>();
        List<String> senders = new ArrayList<>();
        List<BotEvent> kept = new ArrayList<>(in.events().size());
        for (BotEvent e : in.events()) {
            if (e instanceof BotEvent.Message) {
                BotEvent.Message m = (BotEvent.Message) e;
                Report r = core.readMessage(m, now);
                if (r != null && roster.isTeammate(m.sender())) {
                    reports.add(r);
                    senders.add(m.sender());
                }
            } else if (e instanceof BotEvent.Scan) {
                BotEvent.Scan s = (BotEvent.Scan) e;
                Point2D.Double at = position(in, s.bearing(), s.distance());
                if (roster.isTeammate(s.name())) {
                    roster.scanned(s.name(), at.x, at.y, s.heading(), s.velocity(), now);
                    continue;
                }
                if (!s.sentry()) {
                    roster.notSentry(s.name());
                    roster.enemySighted(s.name(), now);
                    fresh.add(new Report.Sighting(s.name(), now, at.x, at.y, s.heading(), s.velocity(), s.energy()));
                }
                kept.add(e);
            } else if (e instanceof BotEvent.HitByBullet) {
                if (!roster.isTeammate(((BotEvent.HitByBullet) e).name())) kept.add(e);
            } else if (e instanceof BotEvent.BulletHit) {
                BotEvent.BulletHit b = (BotEvent.BulletHit) e;
                if (roster.isTeammate(b.name())) {
                    teammateHits++;
                    kept.add(new BotEvent.BulletMissed(b.power(), b.bulletHeading()));
                } else {
                    kept.add(e);
                }
            } else if (e instanceof BotEvent.BulletHitBullet) {
                BotEvent.BulletHitBullet b = (BotEvent.BulletHitBullet) e;
                if (b.owner() != null && roster.isTeammate(b.owner())) {
                    teammateBulletHits++;
                    kept.add(new BotEvent.BulletMissed(b.power(), b.bulletHeading()));
                } else {
                    kept.add(e);
                }
            } else if (e instanceof BotEvent.HitRobot) {
                if (roster.isTeammate(((BotEvent.HitRobot) e).name())) teammateCollisions++;
                else kept.add(e);
            } else if (e instanceof BotEvent.RobotDeath) {
                String name = ((BotEvent.RobotDeath) e).name();
                // A death a teammate reported first was offered to the roles then (WORLD-4).
                boolean known = roster.enemyDead(name);
                roster.died(name, now, sentries);
                if (!roster.isTeammate(name) && !known) kept.add(e);
            } else {
                kept.add(e);
            }
        }
        merge(in, reports, senders, kept);
        roster.presume(now, in.others(), facts.others());
        int enemies = roster.enemiesAlive(in.others());
        living = roster.living(now);
        return new BotInput(in.time(), in.round(), in.x(), in.y(), in.heading(), in.velocity(), in.energy(),
            in.gunHeat(), in.gunCoolingRate(), in.gunHeading(), in.gunTurnRemaining(), in.radarHeading(),
            enemies, kept, in.numSentries(), in.sentryBorderSize());
    }

    /**
     * WORLD-4: each report once, oldest stated tick first, into the roster and the World. An
     * enemy's death heard first in a report is offered to the roles as the engine's would be,
     * so the World and the melee brain's books both close it; the engine's own event for it,
     * when it comes, is then not offered again.
     */
    private void merge(BotInput in, List<Report> reports, List<String> senders, List<BotEvent> kept) {
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < reports.size(); i++) order.add(i);
        order.sort(Comparator.<Integer>comparingLong(i -> reports.get(i).tick()).thenComparing(senders::get));
        boolean sentries = in.numSentries() > 0;
        for (int i : order) {
            Report r = reports.get(i);
            String sender = senders.get(i);
            // A sender skipping turns has its last message delivered again: merged once.
            Long last = merged.get(sender);
            if (r.round() != in.round() || (last != null && r.tick() <= last)) continue;
            merged.put(sender, r.tick());
            reportsMerged++;
            roster.reported(sender, r.tick(), r.x(), r.y(), r.heading(), r.velocity(), in.others());
            for (Report.Sighting s : r.sightings()) {
                if (s.name.equals(facts.name())) continue;
                if (roster.isTeammate(s.name)) {
                    roster.sighted(s.name, s.x, s.y, s.heading, s.velocity, s.tick);
                    continue;
                }
                roster.notSentry(s.name);
                roster.enemySighted(s.name, s.tick);
                EnemyInfo known = world.get(s.name);
                if (known != null && known.lastScanTime >= s.tick) continue;
                if (roster.enemyDead(s.name)) continue;
                Point2D.Double at = new Point2D.Double(s.x, s.y);
                double distance = at.distance(in.x(), in.y());
                EnemyInfo taken = world.onScan(s.name, at, s.energy, s.heading, s.velocity, s.tick, distance);
                mateSightings.add(new MateSighting(s.name, s.tick, s.x, s.y, s.heading, s.velocity,
                    taken.turnRate(), distance));
            }
            mateDodges.addAll(r.dodges());
            for (Report.Shot sh : r.shots()) mateShots.add(new MateShot(sender, sh));
            for (String dead : r.deaths()) {
                if (dead.equals(facts.name())) continue;
                boolean known = roster.enemyDead(dead);
                roster.died(dead, r.tick(), sentries);
                if (!roster.isTeammate(dead) && !known && roster.enemyDead(dead)) kept.add(new BotEvent.RobotDeath(dead));
            }
        }
    }

    private static Point2D.Double position(BotInput in, double bearing, double distance) {
        double abs = in.heading() + bearing;
        return new Point2D.Double(in.x() + Math.sin(abs) * distance, in.y() + Math.cos(abs) * distance);
    }

    /**
     * WEAVE-4, WEAVE-7: whether a shot may leave on the gun's present heading. A living
     * teammate's position no older than {@link Roster#SILENT_WINDOW} holds the shot when it
     * lies within the lane's half-width, grown by {@link #DRIFT} for each tick of its age,
     * ahead of the gun; and when, on some tick {@code t} of a bullet's flight, its predicted
     * place is within that half-width widened by {@link #TURN_SLACK} for each tick, and its
     * distance along the lane is one a bullet could have reached by then (between
     * {@code 11t} and {@code 19.7t} px, give or take the half-width): the bullet and the
     * teammate must coincide in time, not only cross the same line. A teammate behind the gun
     * keeps WEAVE-4's test on its known point alone.
     */
    boolean laneClear(BotInput in) {
        return narrowLane ? narrowLaneClear(in) : wideLaneClear(in);
    }

    /**
     * WEAVE-9 (OgiTeam's rule): the target is the nearest enemy whose bearing lies within
     * {@code atan2(36, d)} of the gun's heading, at its distance {@code d}; with none, every
     * teammate counts. A living teammate nearer than the target, whose bearing lies within
     * {@code atan2(30, d)} of the gun's heading, holds the shot. A teammate beyond the target,
     * wide of the line or behind the gun does not: the shot is worth the small risk.
     * TMODE-17 and TMODE-18 play WEAVE-10 and WEAVE-11 against the teams the mode table names.
     */
    boolean narrowLaneClear(BotInput in) {
        double gun = in.gunHeading();
        boolean predict = predictLane;
        boolean beyond = beyondLane;
        if (!predict || !beyond) {
            Set<TeamModes.Mode> playing = modes.apply(world.alive());
            predict |= playing.contains(TeamModes.Mode.LANEP);
            beyond |= playing.contains(TeamModes.Mode.LANEB);
        }
        double target = Double.POSITIVE_INFINITY;
        for (EnemyInfo e : world.alive()) {
            if (e.location == null) continue;
            double d = e.location.distance(in.x(), in.y());
            if (off(e.location.x - in.x(), e.location.y - in.y(), gun) <= Math.atan2(NARROW_TARGET_HALF, d)
                && d < target) {
                target = d;
            }
        }
        for (Roster.Mate m : roster.living(in.time())) {
            double rx = m.x() - in.x();
            double ry = m.y() - in.y();
            double d = Math.hypot(rx, ry);
            if (d < target && off(rx, ry, gun) <= Math.atan2(NARROW_MATE_HALF, d)) return false;
            if (d < target ? !predict : !beyond || d > target + BEYOND_RANGE) continue;
            if (meetsBullet(in, m, gun, target, beyond)) return false;
        }
        return true;
    }

    /**
     * WEAVE-10, WEAVE-11: whether teammate {@code m}'s predicted track meets a bullet flying the
     * gun's line at {@link #LANE_BULLET_SPEED}: on some tick of the flight, its place lies within
     * {@link #NARROW_MATE_HALF} of the line and within {@link #LANE_ALONG_SLACK} of the bullet
     * along it. The flight is judged as far as the target, or {@link #BEYOND_RANGE} past it when
     * WEAVE-11 is played.
     */
    private boolean meetsBullet(BotInput in, Roster.Mate m, double gun, double target, boolean beyond) {
        double dx = Math.sin(gun);
        double dy = Math.cos(gun);
        double reach = beyond ? target + BEYOND_RANGE : target;
        if (Double.isInfinite(reach)) reach = MAX_FLIGHT * SLOWEST_BULLET;
        int ticks = (int) Math.ceil((reach + LANE_ALONG_SLACK) / LANE_BULLET_SPEED);
        for (int t = 1; t <= ticks; t++) {
            Point2D.Double p = m.at(in.time() + t);
            double along = (p.x - in.x()) * dx + (p.y - in.y()) * dy;
            if (along > reach) continue;
            if (Math.abs(along - LANE_BULLET_SPEED * t) > LANE_ALONG_SLACK) continue;
            if (Math.abs((p.x - in.x()) * dy - (p.y - in.y()) * dx) <= NARROW_MATE_HALF) return true;
        }
        return false;
    }

    /** How far, radians, the bearing to {@code (rx, ry)} lies from {@code heading}. */
    private static double off(double rx, double ry, double heading) {
        return Math.abs(Angles.normalRelativeAngle(Math.atan2(rx, ry) - heading));
    }

    /** WEAVE-4, WEAVE-7: the wide lane, as 3.16 played it. */
    boolean wideLaneClear(BotInput in) {
        double dx = Math.sin(in.gunHeading());
        double dy = Math.cos(in.gunHeading());
        for (Roster.Mate m : roster.living(in.time())) {
            long age = in.time() - m.seen();
            double rx = m.x() - in.x();
            double ry = m.y() - in.y();
            double along = rx * dx + ry * dy;
            double half = LANE_HALF_WIDTH + DRIFT * Math.max(0, age);
            if (along < -half) continue;
            double across = Math.abs(rx * dy - ry * dx);
            if (along < 0) {
                if (Math.hypot(rx, ry) <= half) return false;
                continue;
            }
            if (across <= half) return false;
            // WEAVE-7: a bullet of any power flies 11 to 19.7 px a tick, so on tick t it is
            // somewhere between 11t and 19.7t along the lane. The teammate holds the shot only
            // if, on some tick, its predicted place is within the lane's width (widened by the
            // turn slack) and within the bullet's reach along the lane.
            for (int t = 1; t <= MAX_FLIGHT; t++) {
                Point2D.Double p = m.at(in.time() + t);
                double pa = (p.x - in.x()) * dx + (p.y - in.y()) * dy;
                double lo = SLOWEST_BULLET * t - half;
                // Past the furthest the teammate can have got: the slowest bullet is ahead of it for good.
                if (lo > along + Roster.MAX_SPEED * (age + t)) break;
                if (pa < lo || pa > FASTEST_BULLET * t + half) continue;
                double pl = Math.abs((p.x - in.x()) * dy - (p.y - in.y()) * dx);
                if (pl <= half + TURN_SLACK * t) return false;
            }
        }
        return true;
    }

    /**
     * WEAVE-4: counts a shot the lane held back. The gun is cool and the lane blocked; a held
     * shot is counted once, on the tick it is first held, not again each tick it waits.
     */
    void lane(BotInput in, boolean clear) {
        boolean hold = !clear && in.gunHeat() == 0;
        if (hold && !holding) blockedShots++;
        holding = hold;
    }

    /** MGUN-8: this tick's teammates' sightings the World took, in the order it took them. */
    List<MateSighting> mateSightings() {
        return mateSightings;
    }

    /** MMOVE-10: this tick's teammates' samples of the enemies' guns, in merge order. */
    List<Report.Dodge> mateDodges() {
        return mateDodges;
    }

    /** TMODE-9: this tick's teammates' shots, in merge order. */
    List<MateShot> mateShots() {
        return mateShots;
    }

    /** WORLD-9: the living teammates with a fresh position, as of this tick's input. */
    List<Roster.Mate> living() {
        return living;
    }

    /**
     * WEAVE-8: the driving role's {@code built} orders, or a drive of the teammate fence's
     * choosing in their place when they would bring Hadur into a living teammate. The
     * replacements are counted.
     */
    BotOrders fence(BotInput in, BotOrders built) {
        if (living.isEmpty()) return built;
        List<Point2D.Double[]> tracks = new ArrayList<>(living.size());
        for (Roster.Mate m : living) {
            Point2D.Double[] track = new Point2D.Double[TeammateFence.HORIZON + 1];
            for (int t = 0; t < track.length; t++) track[t] = m.at(in.time() + t);
            tracks.add(track);
        }
        BotOrders out = mateFence.apply(in.x(), in.y(), in.heading(), in.velocity(), built, tracks,
            in.numSentries() > 0 ? in.sentryBorderSize() : 0);
        if (out != built) fenced++;
        return out;
    }

    /** Whether a teammate lives, as the World believes: then the tick's orders carry a report. */
    boolean hasLivingTeammate() {
        return roster.anyAlive();
    }

    /** LINK-4: this tick's report, from the raw input and the orders the tick completed with. */
    byte[] report(BotInput in, BotOrders orders) {
        return report(in, orders, List.of());
    }

    /** As above, carrying {@code dodges}: the enemy bullets that hit us, as samples (MMOVE-10). */
    byte[] report(BotInput in, BotOrders orders, List<Report.Dodge> dodges) {
        List<String> deaths = new ArrayList<>(roster.deadEnemies());
        deaths.addAll(roster.deadMates());
        List<Report.Shot> shots = orders.firePower() > 0
            ? List.of(new Report.Shot(in.time(), in.x(), in.y(), Angles.normalAbsoluteAngle(in.gunHeading()),
                orders.firePower()))
            : List.of();
        List<Report.Sighting> sightings = fresh.size() > 255 ? fresh.subList(0, 255) : fresh;
        return LinkCodec.encode(new Report(in.round(), in.time(), in.x(), in.y(), in.heading(), in.velocity(),
            in.energy(), sightings, deaths.size() > 255 ? deaths.subList(0, 255) : deaths, shots,
            dodges.size() > 255 ? dodges.subList(0, 255) : dodges));
    }

    /** The team's round record: {@code T,round,tick,teammateHits,teammateBulletHits,collisions,blockedShots,reportsMerged,linkRejected,enemiesAlive,fenced}. */
    String record(int round, long tick, int linkRejected, int enemiesAlive) {
        return "T," + round + "," + tick + "," + teammateHits + "," + teammateBulletHits + "," + teammateCollisions
            + "," + blockedShots + "," + reportsMerged + "," + linkRejected + "," + enemiesAlive + "," + fenced;
    }
}
