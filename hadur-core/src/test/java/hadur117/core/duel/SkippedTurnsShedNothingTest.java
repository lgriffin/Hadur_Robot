package hadur117.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur117.core.HadurCore;
import hadur117.core.model.BotEvent;
import hadur117.core.model.BotInput;
import hadur117.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * TIME-15: the engine skipping turns is counted and sheds nothing: no level for the rest of the
 * round (the retired TIME-2), no learned allowance (the retired TIME-3) and no duress (RES-9 and
 * RES-14, retired in 3.11).
 */
@Tag("TIME-15")
class SkippedTurnsShedNothingTest {

    @Test
    @DisplayName("a round with skipped turns runs at full computation, never in duress, and counts the skips")
    void skippedTurnsShedNothing() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        long t = 1;
        BotEvent scan = new BotEvent.Scan("enemy 1.0", 0, 300, 100, 0, 0);
        core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1, List.of(scan)));
        for (int i = 0; i < 5; i++) {
            core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1,
                List.of(new BotEvent.SkippedTurn(t), scan)));
            assertEquals(0, core.computationLevel(), (i + 1) + " skips shed nothing");
        }
        for (int i = 0; i < 400; i++) {
            core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 0, 0.1, 0, 0, 0, 1, List.of(scan)));
        }
        assertEquals(0, core.stats().duressTicks, "no tick of the round ran in duress");
        assertEquals(0, core.computationLevel());
        assertEquals(5, core.stats().skippedTurns);
    }
}
