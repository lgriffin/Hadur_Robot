package hadurling.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.model.Input;
import hadurling.core.model.Wave;
import hadurling.core.physics.Angles;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The enemy sits at (400, 500) and we at (400, 100), 400 px south of it. A power-3 bullet
 * moves 11 px per tick, so a wave fired at tick 0 reaches us at tick 36 or 37.
 */
class SurferTest {

    private static Wave waveFiredAt(long time) {
        return new Wave(400, 500, time, 3.0, Math.PI, 1);
    }

    private static Input at(long time, double x, double y) {
        return new Input(time, x, y, 0, 8, 100, 0, 0, 0, List.of());
    }

    /** A surfer that has been hit once, at the given guess factor of a wave fired at tick 0. */
    private static Surfer hitAt(double guessFactor) {
        Surfer surfer = new Surfer();
        Wave first = waveFiredAt(0);
        surfer.enemyFired(first);
        double angle = first.firingAngle(guessFactor);
        surfer.hitBy(at(36, Angles.projectX(400, angle, 400), Angles.projectY(500, angle, 400)));
        return surfer;
    }

    @Test
    @DisplayName("a bullet that hits us is remembered with its guess factor")
    void remembersHits() {
        Surfer surfer = hitAt(0.7);
        assertEquals(1, surfer.hits().size());
        assertEquals(0.7, surfer.hits().get(0), 1e-9);
    }

    @Test
    @Tag("HL-12")
    @DisplayName("hit on the clockwise side before, it goes anticlockwise")
    void avoidsAClockwiseHistory() {
        Surfer surfer = hitAt(0.9);
        surfer.enemyFired(waveFiredAt(100));
        assertEquals(-1, surfer.choose(at(110, 400, 100), +1));
        assertEquals(-1, surfer.choose(at(110, 400, 100), -1));
    }

    @Test
    @Tag("HL-12")
    @DisplayName("hit on the anticlockwise side before, it goes clockwise")
    void avoidsAnAnticlockwiseHistory() {
        Surfer surfer = hitAt(-0.9);
        surfer.enemyFired(waveFiredAt(100));
        assertEquals(+1, surfer.choose(at(110, 400, 100), -1));
    }

    @Test
    @Tag("HL-12")
    @DisplayName("with no wave in flight it keeps going the way it was")
    void keepsDirectionWithoutAWave() {
        assertEquals(-1, new Surfer().choose(at(5, 400, 100), -1));
        assertEquals(+1, hitAt(0.9).choose(at(500, 400, 100), +1));
    }

    @Test
    @Tag("HL-12")
    @DisplayName("with no history both ways are equally safe, so it keeps its direction")
    void keepsDirectionWithoutHistory() {
        Surfer surfer = new Surfer();
        surfer.enemyFired(waveFiredAt(0));
        assertEquals(-1, surfer.choose(at(10, 400, 100), -1));
        assertEquals(+1, surfer.choose(at(10, 400, 100), +1));
    }

    @Test
    @DisplayName("a wave that has gone past us is dropped, and reports whether it hit")
    void wavesEnd() {
        Surfer surfer = hitAt(0.0);
        surfer.enemyFired(waveFiredAt(10));
        assertEquals(2, surfer.waves());
        // At tick 60 the first wave (fired at 0) is 660 px big and the second 550 px: both gone.
        assertEquals(List.of(true, false), surfer.advance(at(60, 400, 100)));
        assertEquals(0, surfer.waves());
    }

    @Test
    @DisplayName("a hit with no wave near enough is not filed")
    void strayHit() {
        Surfer surfer = new Surfer();
        surfer.enemyFired(waveFiredAt(0));
        surfer.hitBy(at(5, 400, 100)); // the wave is 55 px big; we are 400 px away
        assertTrue(surfer.hits().isEmpty());
    }

    @Test
    @DisplayName("only the most recent hits are kept")
    void bounded() {
        Surfer surfer = new Surfer();
        for (int i = 0; i < Surfer.MAX_HITS + 20; i++) {
            long t = 1000L * i;
            Wave w = waveFiredAt(t);
            surfer.enemyFired(w);
            surfer.hitBy(at(t + 36, 400, 100));
            surfer.advance(at(t + 100, 400, 100));
        }
        assertEquals(Surfer.MAX_HITS, surfer.hits().size());
    }
}
