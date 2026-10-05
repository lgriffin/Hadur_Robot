package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.field;
import static hadur2.core.melee.Fixtures.pt;
import static hadur2.core.melee.Fixtures.scan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.world.EnemyTracker;
import hadur2.core.world.Roster;
import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** T1: the minimum-risk movement on a team (MMOVE-6 to MMOVE-8). */
class MinimumRiskMovementTeamTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));
    private final MeleeStrategy.Plan normal = MeleeStrategy.Plan.normal();

    MinimumRiskMovementTeamTest() {
        move.newRound();
        scan(tracker, "a", 300, 800, 100, 1);
        scan(tracker, "b", 800, 800, 100, 1);
    }

    /** One living teammate at (x, y) with the heading and velocity given, known on tick 100. */
    private static List<Roster.Mate> mate(double x, double y, double heading, double velocity) {
        Roster r = new Roster(List.of("m"), 3);
        r.newRound();
        r.scanned("m", x, y, heading, velocity, 100);
        return r.living(100);
    }

    private MinimumRiskMovement.View view(List<Roster.Mate> mates) {
        return move.view(pt(500, 500), 100, 100, 3, tracker.alive(), normal, mates);
    }

    @Test
    @Tag("MMOVE-6")
    @DisplayName("MMOVE-6: a point near where a teammate will be costs more than the same point with no teammate")
    void nearTheTeammateCostsMore() {
        Point2D.Double p = pt(600, 500);
        double alone = move.risk(p, view(List.of()));
        // A teammate 100 px past the point, driving at it: by the time Hadur gets there, on top of it.
        double withMate = move.risk(p, view(mate(700, 500, 3 * Math.PI / 2, 8)));
        assertTrue(withMate - alone > 4.0, "added " + (withMate - alone));
        // The same teammate sitting still where it was seen costs little: 100 px off.
        double still = move.risk(p, view(mate(700, 500, 3 * Math.PI / 2, 0)));
        assertTrue(still - alone < 1.5, "added " + (still - alone));
    }

    @Test
    @Tag("MMOVE-6")
    @DisplayName("MMOVE-6: the term is the inverse square of the distance to the predicted point, floored at a robot's width")
    void termIsInverseSquare() {
        Point2D.Double p = pt(600, 500);
        MinimumRiskMovement.View v = view(mate(600, 500, 0, 0));
        // A path term too: Hadur's path ends on the teammate's track at the point.
        double atFloor = move.teammateRisk(p, v);
        assertEquals(MinimumRiskMovement.MATE_K * 1e4 / (36 * 36) + MinimumRiskMovement.MATE_PATH_K, atFloor, 1e-9);
        double far = move.teammateRisk(p, view(mate(600, 700, 0, 0)));
        assertEquals(MinimumRiskMovement.MATE_K * 1e4 / (200 * 200), far, 1e-9);
        double farther = move.teammateRisk(p, view(mate(600, 900, 0, 0)));
        assertEquals(far / 4, farther, 1e-9);
    }

    @Test
    @Tag("MMOVE-6")
    @DisplayName("MMOVE-6: with no teammate in view the risk is exactly what it was")
    void noTeammateNoChange() {
        for (double x = 100; x <= 900; x += 85) {
            for (double y = 100; y <= 900; y += 85) {
                Point2D.Double p = pt(x, y);
                double plain = move.risk(p, move.view(pt(500, 500), 100, 100, 3, tracker.alive(), normal));
                assertEquals(Double.doubleToLongBits(plain), Double.doubleToLongBits(move.risk(p, view(List.of()))));
            }
        }
        assertEquals(move.candidates(pt(500, 500), 3, tracker.alive(), 100),
            move.candidates(pt(500, 500), 3, tracker.alive(), 100, List.of()));
    }

    @Test
    @Tag("MMOVE-7")
    @DisplayName("MMOVE-7: a path that crosses a teammate's predicted track costs more than one that does not")
    void crossingThePathCostsMore() {
        // The teammate runs east along y = 600 from x = 400, 8 px a tick.
        List<Roster.Mate> mates = mate(400, 600, Math.PI / 2, 8);
        Point2D.Double across = pt(500, 700);
        Point2D.Double beside = pt(500, 300);
        MinimumRiskMovement.View v = view(mates);
        double crossing = move.teammateRisk(across, v);
        double clear = move.teammateRisk(beside, v);
        long arrive = 100 + (long) Math.ceil(across.distance(pt(500, 500)) / MinimumRiskMovement.TRAVEL_SPEED);
        double point = MinimumRiskMovement.MATE_K * 1e4
            / Math.pow(Math.max(36, across.distance(mates.get(0).at(arrive))), 2);
        assertEquals(point + MinimumRiskMovement.MATE_PATH_K, crossing, 1e-9);
        assertTrue(clear < MinimumRiskMovement.MATE_PATH_K, "clear path scored " + clear);
    }

    @Test
    @Tag("MMOVE-7")
    @DisplayName("MMOVE-7: the candidate ring is capped by a close teammate like a close opponent")
    void closeTeammateCapsTheRing() {
        double open = move.candidates(pt(500, 500), 3, tracker.alive(), 100).stream()
            .mapToDouble(p -> p.distance(500, 500)).max().getAsDouble();
        assertEquals(300, open, 1e-9);
        List<Point2D.Double> capped = move.candidates(pt(500, 500), 3, tracker.alive(), 100, mate(500, 550, 0, 0));
        for (Point2D.Double p : capped) {
            assertTrue(p.distance(500, 500) <= MinimumRiskMovement.NEAREST_FRACTION * 50 + 1e-9
                || p.distance(500, 500) <= MinimumRiskMovement.MIN_RING + 1e-9, "ring point " + p);
        }
        // The cap is never below a robot's width.
        List<Point2D.Double> tight = move.candidates(pt(500, 500), 3, tracker.alive(), 100, mate(500, 520, 0, 0));
        for (Point2D.Double p : tight) {
            assertEquals(MinimumRiskMovement.MIN_RING, p.distance(500, 500), 1e-9);
        }
    }

    @Test
    @Tag("MMOVE-6")
    @DisplayName("MMOVE-6: a destination chosen on a team stays off the teammate's predicted position")
    void destinationAvoidsTheMate() {
        // Without the teammate the least risky point lies somewhere; put the teammate on it.
        Point2D.Double alone = move.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 100, normal);
        MinimumRiskMovement team = new MinimumRiskMovement(field(1000, 1000));
        team.newRound();
        Point2D.Double chosen = team.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 100, normal,
            mate(alone.x, alone.y, 0, 0));
        assertTrue(chosen.distance(alone) > 60, "still heads for " + chosen + " (alone: " + alone + ")");
    }

    @Test
    @Tag("MMOVE-8")
    @DisplayName("MMOVE-8: off a team the noise field is MMOVE-1's; on a team it differs by the member's place")
    void noiseDiffersByPlace() {
        MinimumRiskMovement solo = new MinimumRiskMovement(field(1000, 1000));
        MinimumRiskMovement unsalted = new MinimumRiskMovement(field(1000, 1000));
        solo.newRound();
        unsalted.newRound();
        solo.team(-1);
        MinimumRiskMovement[] members = new MinimumRiskMovement[5];
        for (int i = 0; i < 5; i++) {
            members[i] = new MinimumRiskMovement(field(1000, 1000));
            members[i].newRound();
            members[i].team(i);
        }
        int differing = 0;
        for (double x = 10; x < 1000; x += 37) {
            for (double y = 10; y < 1000; y += 41) {
                Point2D.Double p = pt(x, y);
                assertEquals(Double.doubleToLongBits(unsalted.noise(p)), Double.doubleToLongBits(solo.noise(p)));
                Set<Double> seen = new HashSet<>();
                for (MinimumRiskMovement m : members) seen.add(m.noise(p));
                seen.add(solo.noise(p));
                if (seen.size() == 6) differing++;
            }
        }
        assertTrue(differing > 500, "the six fields agreed too often: only " + differing + " points differ");
    }

    @Test
    @Tag("MMOVE-8")
    @DisplayName("MMOVE-8: five members choosing from one position do not all choose the same destination")
    void membersChooseDifferently() {
        Set<Point2D.Double> chosen = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            MinimumRiskMovement m = new MinimumRiskMovement(field(1000, 1000));
            m.newRound();
            m.team(i);
            chosen.add(m.chooseDestination(pt(500, 500), 100, 3, tracker.alive(), 100, normal));
        }
        assertTrue(chosen.size() >= 3, "only " + chosen.size() + " destinations: " + chosen);
    }

    @Test
    @Tag("MMOVE-8")
    @DisplayName("MMOVE-8: on a team the opening spots fan out along the wall by the member's place")
    void openingSpotsFanOut() {
        Set<Point2D.Double> spots = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            MinimumRiskMovement m = new MinimumRiskMovement(field(1000, 1000));
            m.newRound();
            m.team(i);
            spots.add(m.openingSpot(pt(40, 500)));
        }
        assertEquals(5, spots.size(), spots.toString());
        for (Point2D.Double s : spots) assertEquals(MinimumRiskMovement.OPENING_WALL_GAP, s.x, 0);
        // Off a team: the one spot MMOVE-5's opening has always had.
        MinimumRiskMovement solo = new MinimumRiskMovement(field(1000, 1000));
        assertEquals(pt(MinimumRiskMovement.OPENING_WALL_GAP, 500), solo.openingSpot(pt(40, 500)));
        assertNotEquals(solo.openingSpot(pt(40, 500)).y, spots.stream().mapToDouble(s -> s.y).min().getAsDouble());
    }
}
