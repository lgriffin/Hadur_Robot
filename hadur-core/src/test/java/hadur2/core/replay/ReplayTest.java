package hadur2.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.port.Telemetry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * CORE-2: the core gives identical orders for identical inputs. Each fixture is a real
 * battle recorded from the robot by the bench ({@code --record}); replaying it must
 * reproduce, bit for bit, the orders the live robot issued, and two replays must agree.
 *
 * <p>STRAND-4 (A0) widens the check from orders to the whole robot: every fixture's
 * telemetry must match the snapshot it replayed to when it was pinned
 * ({@code replay/telemetry/}), and a fixture recorded with its store must leave exactly the
 * files the live robot left. A0 added a melee, a sentry, a hand-off on a store, a warm duel
 * on a seeded store and a duress fixture to the six S1 duels. A snapshot is re-taken with
 * {@code -Dhadur.replay.snapshot=write}, only by a stage allowed to change play.</p>
 */
@Tag("CORE-2")
class ReplayTest {

    static final Path TELEMETRY = FixtureReplay.TELEMETRY;
    /** The R record's duressTicks field (RoundStats#toRecord), counted from the R. */
    static final int DURESS_TICKS = 33;

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

    @Test
    @Tag("STRAND-4")
    @DisplayName("STRAND-4: the duel, melee, sentry, hand-off, warm and duress fixtures are all there")
    void everyKindOfBattleHasAFixture() {
        List<String> names = Fixtures.all().stream().map(Fixtures::opponent).toList();
        for (String expected : List.of("melee-samples", "melee-sentry", "melee-handoff",
                "warm-abc.Shadow_3.83c", "duress-sample.Walls")) {
            assertTrue(names.contains(expected), "missing replay fixture " + expected);
        }
        FixtureReplay.Result duress = FixtureReplay.run(Fixtures.lines(Fixtures.DIR.resolve("duress-sample.Walls.txt.gz")));
        assertTrue(duress.telemetry.stream().anyMatch(l -> l.startsWith("R,")
                && Integer.parseInt(l.split(",")[DURESS_TICKS]) > 0),
            "the duress fixture must hold a round in duress (RES-9)");
        FixtureReplay.Result warm = FixtureReplay.run(Fixtures.lines(Fixtures.DIR.resolve("warm-abc.Shadow_3.83c.txt.gz")));
        assertTrue(warm.telemetry.stream().anyMatch(l -> l.startsWith("B,") && l.split(",")[6].equals("1")),
            "the warm fixture must find its opponent's profile (MEM-1)");
        FixtureReplay.Result handoff = FixtureReplay.run(Fixtures.lines(Fixtures.DIR.resolve("melee-handoff.txt.gz")));
        assertTrue(handoff.telemetry.stream().anyMatch(l -> l.startsWith("H,")),
            "the hand-off fixture must hand a survivor over (MMEM-2)");
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @DisplayName("replaying a recorded battle reproduces the live robot's orders")
    void replayMatchesLiveRobot(Path fixture) {
        FixtureReplay.Result r = FixtureReplay.run(Fixtures.lines(fixture));
        assertFalse(r.ticks.isEmpty());
        for (Replay.Tick t : r.ticks) {
            assertEquals(t.recorded(), t.replayed(),
                () -> Fixtures.opponent(fixture) + " line " + t.line() + " round "
                    + t.input().round() + " tick " + t.input().time());
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @DisplayName("the shipped replay driver agrees with the fixture replay on a store-less fixture")
    void shippedReplayAgrees(Path fixture) {
        List<String> lines = Fixtures.lines(fixture);
        FixtureReplay.Result r = FixtureReplay.run(lines);
        if (r.hasStore) return;
        List<Replay.Tick> shipped = Replay.run(lines, Telemetry.NONE);
        assertEquals(shipped.size(), r.ticks.size());
        for (int i = 0; i < shipped.size(); i++) {
            assertEquals(shipped.get(i).replayed(), r.ticks.get(i).replayed());
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @Tag("STRAND-4")
    @DisplayName("STRAND-4: a replay's telemetry matches the fixture's pinned snapshot")
    void telemetryMatchesSnapshot(Path fixture) {
        FixtureReplay.Result r = FixtureReplay.run(Fixtures.lines(fixture));
        Path snapshot = TELEMETRY.resolve(Fixtures.opponent(fixture) + ".txt.gz");
        if ("write".equals(System.getProperty("hadur.replay.snapshot"))) write(snapshot, r.telemetry);
        assertTrue(Files.exists(snapshot), "no telemetry snapshot for " + fixture);
        List<String> pinned = FixtureReplay.comparable(Fixtures.lines(snapshot));
        List<String> now = FixtureReplay.comparable(r.telemetry);
        for (int i = 0; i < Math.min(pinned.size(), now.size()); i++) {
            assertEquals(pinned.get(i), now.get(i), Fixtures.opponent(fixture) + " telemetry line " + (i + 1));
        }
        assertEquals(pinned.size(), now.size(), Fixtures.opponent(fixture) + " telemetry lines");
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @Tag("STRAND-4")
    @DisplayName("STRAND-4: a replay leaves the store files the live robot left")
    void storeMatchesLiveRobot(Path fixture) {
        FixtureReplay.Result r = FixtureReplay.run(Fixtures.lines(fixture));
        if (!r.hasStore) return;
        assertNotNull(r.recordedStore, "a fixture with a store records the files it left");
        assertEquals(FixtureReplay.readable(r.recordedStore), FixtureReplay.readable(r.store),
            Fixtures.opponent(fixture));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("fixtures")
    @DisplayName("two replays of the same battle give the same orders, telemetry and store")
    void replayIsDeterministic(Path fixture) {
        List<String> lines = Fixtures.lines(fixture);
        FixtureReplay.Result a = FixtureReplay.run(lines);
        FixtureReplay.Result b = FixtureReplay.run(lines);
        assertEquals(a.ticks.size(), b.ticks.size());
        for (int i = 0; i < a.ticks.size(); i++) {
            assertEquals(a.ticks.get(i).replayed(), b.ticks.get(i).replayed());
        }
        assertEquals(a.telemetry, b.telemetry);
        assertEquals(FixtureReplay.readable(a.store), FixtureReplay.readable(b.store));
    }

    static void write(Path snapshot, List<String> lines) {
        try {
            Files.createDirectories(snapshot.getParent());
            try (OutputStream out = new GZIPOutputStream(Files.newOutputStream(snapshot))) {
                for (String l : lines) out.write((l + "\n").getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
