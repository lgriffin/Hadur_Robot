package hadur2.core.melee;

import hadur2.core.world.EnemyTracker;
import static hadur2.core.melee.Fixtures.pt;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.geom.Point2D;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/** MRADAR-1 on random fields: with four to nine opponents, none waits more than 8 ticks. */
class MeleeRadarProperties {

    @Provide
    Arbitrary<List<Point2D.Double>> fields() {
        Arbitrary<Point2D.Double> robot = Combinators.combine(
                Arbitraries.doubles().between(18, 982), Arbitraries.doubles().between(18, 982))
            .as(Fixtures::pt).filter(p -> p.distance(500, 500) > 40);
        return robot.list().ofMinSize(4).ofMaxSize(9);
    }

    @Property(tries = 200)
    @Tag("MRADAR-1")
    void everyOpponentScannedWithinEightTicks(@ForAll("fields") List<Point2D.Double> robots) {
        Map<String, Point2D.Double> named = new LinkedHashMap<>();
        for (int i = 0; i < robots.size(); i++) named.put("r" + i, robots.get(i));
        RadarSim sim = new RadarSim(new EnemyTracker(), pt(500, 500), named);
        sim.run(120);
        assertTrue(sim.sawAll());
        assertTrue(sim.worstGap() <= 8, "worst gap " + sim.worstGap());
    }
}
