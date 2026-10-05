package hadur2.core;

import hadur2.core.link.LinkCodec;
import hadur2.core.link.Report;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.physics.Angles;
import hadur2.core.world.EnemyInfo;
import hadur2.core.world.EnemyTracker;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * <li>LINK-4: while a teammate lives, every completed tick's orders carry our report.</li>
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

    private final HadurCore core;
    private final BattleFacts facts;
    private final Roster roster;
    private final EnemyTracker world;
    /** WORLD-4: the latest stated tick merged from each teammate this round. */
    private final Map<String, Long> merged = new HashMap<>();
    /** This tick's fresh sightings of enemies, for our report. */
    private final List<Report.Sighting> fresh = new ArrayList<>();

    int teammateHits;
    int teammateBulletHits;
    int teammateCollisions;
    int blockedShots;
    int reportsMerged;

    TeamLink(HadurCore core, BattleFacts facts, Roster roster, EnemyTracker world) {
        this.core = core;
        this.facts = facts;
        this.roster = roster;
        this.world = world;
    }

    void newRound() {
        roster.newRound();
        merged.clear();
        teammateHits = teammateBulletHits = teammateCollisions = blockedShots = reportsMerged = 0;
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
                    roster.scanned(s.name(), at.x, at.y, now);
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
                roster.died(name, now, sentries);
                if (!roster.isTeammate(name)) kept.add(e);
            } else {
                kept.add(e);
            }
        }
        merge(in, reports, senders);
        roster.presume(now, in.others(), facts.others());
        int enemies = roster.enemiesAlive(in.others());
        return new BotInput(in.time(), in.round(), in.x(), in.y(), in.heading(), in.velocity(), in.energy(),
            in.gunHeat(), in.gunCoolingRate(), in.gunHeading(), in.gunTurnRemaining(), in.radarHeading(),
            enemies, kept, in.numSentries(), in.sentryBorderSize());
    }

    /** WORLD-4: each report once, oldest stated tick first, into the roster and the World. */
    private void merge(BotInput in, List<Report> reports, List<String> senders) {
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
            roster.reported(sender, r.tick(), r.x(), r.y(), in.others());
            for (Report.Sighting s : r.sightings()) {
                if (s.name.equals(facts.name())) continue;
                if (roster.isTeammate(s.name)) {
                    roster.sighted(s.name, s.x, s.y, s.tick);
                    continue;
                }
                roster.notSentry(s.name);
                roster.enemySighted(s.name, s.tick);
                EnemyInfo known = world.get(s.name);
                if (known != null && known.lastScanTime >= s.tick) continue;
                if (roster.enemyDead(s.name)) continue;
                Point2D.Double at = new Point2D.Double(s.x, s.y);
                world.onScan(s.name, at, s.energy, s.heading, s.velocity, s.tick, at.distance(in.x(), in.y()));
            }
            for (String dead : r.deaths()) {
                if (dead.equals(facts.name())) continue;
                roster.died(dead, r.tick(), sentries);
                if (!roster.isTeammate(dead) && roster.enemyDead(dead)) world.onRobotDeath(dead);
            }
        }
    }

    private static Point2D.Double position(BotInput in, double bearing, double distance) {
        double abs = in.heading() + bearing;
        return new Point2D.Double(in.x() + Math.sin(abs) * distance, in.y() + Math.cos(abs) * distance);
    }

    /**
     * WEAVE-4: whether a shot may leave on the gun's present heading: no living teammate's
     * last known position, no older than {@link Roster#SILENT_WINDOW}, lies within the lane's
     * half-width, grown by {@link #DRIFT} for each tick of its age, ahead of the gun.
     */
    boolean laneClear(BotInput in) {
        double dx = Math.sin(in.gunHeading());
        double dy = Math.cos(in.gunHeading());
        for (Roster.Mate m : roster.mates()) {
            if (!m.alive() || m.seen() < 0) continue;
            long age = in.time() - m.seen();
            if (age > Roster.SILENT_WINDOW) continue;
            double rx = m.x() - in.x();
            double ry = m.y() - in.y();
            double along = rx * dx + ry * dy;
            double half = LANE_HALF_WIDTH + DRIFT * Math.max(0, age);
            if (along < -half) continue;
            double across = Math.abs(rx * dy - ry * dx);
            if (along < 0 ? Math.hypot(rx, ry) <= half : across <= half) return false;
        }
        return true;
    }

    /** Counts a shot the lane held back, when the gun was cool enough to have fired it. */
    void blocked(BotInput in) {
        if (in.gunHeat() == 0) blockedShots++;
    }

    /** Whether a teammate lives, as the World believes: then the tick's orders carry a report. */
    boolean hasLivingTeammate() {
        return roster.anyAlive();
    }

    /** LINK-4: this tick's report, from the raw input and the orders the tick completed with. */
    byte[] report(BotInput in, BotOrders orders) {
        List<String> deaths = new ArrayList<>(roster.deadEnemies());
        deaths.addAll(roster.deadMates());
        List<Report.Shot> shots = orders.firePower() > 0
            ? List.of(new Report.Shot(in.time(), in.x(), in.y(), Angles.normalAbsoluteAngle(in.gunHeading()),
                orders.firePower()))
            : List.of();
        List<Report.Sighting> sightings = fresh.size() > 255 ? fresh.subList(0, 255) : fresh;
        return LinkCodec.encode(new Report(in.round(), in.time(), in.x(), in.y(), in.heading(), in.velocity(),
            in.energy(), sightings, deaths.size() > 255 ? deaths.subList(0, 255) : deaths, shots));
    }

    /** The team's round record: {@code T,round,tick,teammateHits,teammateBulletHits,collisions,blockedShots,reportsMerged,linkRejected,enemiesAlive}. */
    String record(int round, long tick, int linkRejected, int enemiesAlive) {
        return "T," + round + "," + tick + "," + teammateHits + "," + teammateBulletHits + "," + teammateCollisions
            + "," + blockedShots + "," + reportsMerged + "," + linkRejected + "," + enemiesAlive;
    }
}
