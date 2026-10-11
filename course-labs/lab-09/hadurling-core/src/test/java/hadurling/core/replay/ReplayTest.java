package hadurling.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * A recorded battle is a regression test for the whole core at once: replay it through a fresh
 * core and the orders must be exactly the recorded ones.
 */
class ReplayTest {

    private static List<String> transcript() throws IOException {
        try (InputStream in = ReplayTest.class.getResourceAsStream("/replay/scripted-duel.txt")) {
            String text = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            return List.of(text.split("\\R"));
        }
    }

    @Test

    @Tag("HL-8")
    @DisplayName("replaying the scripted duel reproduces the recorded orders")
    void replayMatchesRecording() throws IOException {
        List<Replay.Tick> ticks = Replay.run(transcript());
        assertEquals(100, ticks.size());
        for (Replay.Tick t : ticks) {
            assertEquals(t.recorded(), t.replayed(), "line " + t.line());
        }
    }

    @Test

    @Tag("HL-2")
    @DisplayName("two replays give the same orders")
    void replayIsDeterministic() throws IOException {
        List<String> lines = transcript();
        List<Replay.Tick> a = Replay.run(lines);
        List<Replay.Tick> b = Replay.run(lines);
        for (int i = 0; i < a.size(); i++) assertEquals(a.get(i).replayed(), b.get(i).replayed());
    }

    @Test
    @DisplayName("a changed recording is noticed: the test can fail")
    void changedRecordingIsDetected() throws IOException {
        List<String> lines = new ArrayList<>(transcript());
        int firstOrders = lines.indexOf(lines.stream().filter(l -> l.startsWith("O,")).findFirst().get());
        lines.set(firstOrders, "O,0.0,1.0,0.0,0.0,3.0");
        List<Replay.Tick> ticks = Replay.run(lines);
        assertNotEquals(ticks.get(0).recorded(), ticks.get(0).replayed());
    }

    @Test
    @DisplayName("the scripted duel covers both a visible and a hidden enemy")
    void scriptCoversHiddenEnemy() throws IOException {
        List<Replay.Tick> ticks = Replay.run(transcript());
        assertFalse(ticks.stream().allMatch(t -> t.input().events().isEmpty()));
        assertFalse(ticks.stream().allMatch(t -> !t.input().events().isEmpty()));
    }

    @Test
    @DisplayName("a transcript with an I line but no O line is rejected")
    void missingOrders() {
        List<String> lines = List.of("R,0", "I,0,1,1,0,0,100,0,0,0,");
        assertThrows(IllegalArgumentException.class, () -> Replay.run(lines));
    }
}
