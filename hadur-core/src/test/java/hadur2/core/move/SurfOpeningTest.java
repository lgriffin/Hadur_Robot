package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.SeedWeight;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The surf's side of the opening: which danger views are on (ADAPT-2, DIAL-1) and its seeds (ADAPT-3). */
class SurfOpeningTest {

    static final List<String> FLATTENERS = List.of("lightFlattener", "flattener", "flattener2");

    static MoveController controller() {
        BattleField field = new BattleField(800, 600);
        return new MoveController(field, new MovementPredictor(field));
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("a stranger starts with only the simple view, as in 1.20")
    void strangerStartsSimple() {
        assertEquals(List.of("simple"), controller().viewsOn());
    }

    @Test
    @Tag("ADAPT-2")
    @DisplayName("a T3 opening has the flattener views on from the first wave")
    void t3HasFlattener() {
        MoveController m = controller();
        m.setPrior(0.075, 0.029);
        m.setFlattenerFirst(true);
        assertTrue(m.viewsOn().containsAll(FLATTENERS), m.viewsOn().toString());
        assertTrue(m.priorInUse());
    }

    @Test
    @Tag("ADAPT-2")
    @DisplayName("a known lower tier hands its rate to the thresholds, with no forced flattener")
    void lowerTiersUseThresholds() {
        MoveController m = controller();
        m.setPrior(0.05, 0.02);
        List<String> on = m.viewsOn();
        assertTrue(on.containsAll(List.of("simple", "normal", "recent1", "lightFlattener")), on.toString());
        assertFalse(on.contains("flattener"), "5% less 2% misses the flattener's 5.9%");
        m.setPrior(0.01, 0.005);
        assertEquals(List.of("simple"), m.viewsOn(), "T0: no recent views");
    }

    @Test
    @Tag("DIAL-1")
    @DisplayName("a prior less certain than the live estimate is ignored")
    void widerPriorIgnored() {
        MoveController m = controller();
        m.setPrior(0.09, 1.5);
        assertEquals(List.of("simple"), m.viewsOn());
        assertFalse(m.priorInUse());
    }

    @Test
    @Tag("RES-4")
    @DisplayName("clearing the prior drops the forced flattener too")
    void clearPrior() {
        MoveController m = controller();
        m.setPrior(0.09, 0.01);
        m.setFlattenerFirst(true);
        m.clearPrior();
        assertEquals(List.of("simple"), m.viewsOn());
    }

    @Test
    @Tag("ADAPT-3")
    @DisplayName("surf seeds go to every view that learns from hits, and to no flattener")
    void seedsGoToHitViews() {
        MoveController m = controller();
        double[] s = new double[MoveController.SAMPLE_WIDTH];
        s[12] = 0.3;
        SeedWeight w = new SeedWeight(0.5);
        for (int i = 0; i < 7; i++) m.seed(s, w);
        for (String name : List.of("simple", "normal", "recent3", "recent6")) assertEquals(7, m.viewSize(name), name);
        assertEquals(1, m.viewSize("recent1"), "recent1 holds one sample");
        for (String name : FLATTENERS) assertEquals(0, m.viewSize(name), name);
    }
}
