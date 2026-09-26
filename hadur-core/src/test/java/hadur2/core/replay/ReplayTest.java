package hadur2.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.port.Telemetry;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * CORE-2: the core gives identical orders for identical inputs. Each fixture is a real
 * battle recorded from the robot by the bench ({@code --record}); replaying it must
 * reproduce, bit for bit, the orders the live robot issued, and two replays must agree.
 */
@Tag("CORE-2")
class ReplayTest {

    static Stream<Path> fixtures() {
        return Fixtures.all().stream();
    }

    @Test
    @DisplayName("there is a fixture for every reference opponent")
    void everyOpponentHasAFixture() {
        List<String> names = Fixtures.all().stream().map(Fixtures::opponent).toList();
        for (String expected : List.of("sample.SpinBot", "sample.Tracker", "sample.Crazy",
                "sample.Walls", "sample.RamFire", "abc.Shadow_3.83c")) {
            assertTrue(names.contains(expected), "missing replay fixture for " + expected);
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @DisplayName("replaying a recorded battle reproduces the live robot's orders")
    void replayMatchesLiveRobot(Path fixture) {
        List<Replay.Tick> ticks = Replay.run(Fixtures.lines(fixture), Telemetry.NONE);
        assertFalse(ticks.isEmpty());
        for (Replay.Tick t : ticks) {
            assertEquals(t.recorded(), t.replayed(),
                () -> Fixtures.opponent(fixture) + " line " + t.line() + " round "
                    + t.input().round() + " tick " + t.input().time());
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @DisplayName("two replays of the same battle give the same orders and telemetry")
    void replayIsDeterministic(Path fixture) {
        List<String> lines = Fixtures.lines(fixture);
        List<String> telemetryA = new ArrayList<>();
        List<String> telemetryB = new ArrayList<>();
        List<Replay.Tick> a = Replay.run(lines, telemetryA::add);
        List<Replay.Tick> b = Replay.run(lines, telemetryB::add);
        assertEquals(a.size(), b.size());
        for (int i = 0; i < a.size(); i++) {
            assertEquals(a.get(i).replayed(), b.get(i).replayed());
        }
        assertEquals(telemetryA, telemetryB);
    }
}
