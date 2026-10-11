package hadur2.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.policy.TickBudget;
import hadur2.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * 3.11 retired RES-9 and RES-14: the engine skipping turns sheds levels and teaches the
 * allowance (TIME-2, TIME-3), and nothing else; the round never drops to a head-on orbit.
 */
@Tag("TIME-2")
class DuressRetiredTest {

    @Test
    @DisplayName("three or more skipped turns shed levels to the cap, and the level holds however quiet the round gets")
    void skippedTurnsShedAndNeverRecover() {
        TickBudget b = new TickBudget();
        b.newRound();
        for (int skips = 1; skips <= 6; skips++) {
            b.skippedTurn(skips);
            assertEquals(Math.min(TickBudget.MAX_LEVEL, skips), b.level(), skips + " skips");
        }
        b.tickTook(0, 3_000_000);
        assertEquals(TickBudget.MAX_LEVEL, b.level(), "300 quiet ticks later the level is still shed: no duress to end");
        b.newRound();
        assertEquals(0, b.level(), "a new round starts at full computation");
    }

    @Test
    @DisplayName("a round with three skipped turns runs the Duel at the shed level, never in duress")
    void coreNeverEntersDuress() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        long t = 1;
        BotEvent scan = new BotEvent.Scan("enemy 1.0", 0, 300, 100, 0, 0);
        core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1, List.of(scan)));
        for (int i = 0; i < 3; i++) {
            core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 3, 0.1, 0, 0, 0, 1,
                List.of(new BotEvent.SkippedTurn(t), scan)));
        }
        assertEquals(TickBudget.MAX_LEVEL, core.computationLevel(), "the three skips shed three levels");
        for (int i = 0; i < 400; i++) {
            core.tick(new BotInput(t++, 0, 400, 200, 0, 0, 100, 0, 0.1, 0, 0, 0, 1, List.of(scan)));
        }
        assertEquals(0, core.stats().duressTicks, "no tick of the round ran in duress");
        assertEquals(TickBudget.MAX_LEVEL, core.computationLevel(), "and the shed level held");
    }
}
