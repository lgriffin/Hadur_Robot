package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.link.LinkCodec;
import hadur2.core.link.LinkCodecTest;
import hadur2.core.model.BattleFacts;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** LINK-1, LINK-2 at the conductor: teammates' messages are read, or refused and counted (A4). */
class LinkCoreTest {

    private static BotInput input(long time, List<BotEvent> events) {
        return new BotInput(time, 0, 500, 500, 0, 0, 100, 0, 0.1, 0, 0, 0, 2, events);
    }

    @Test
    @Tag("LINK-2")
    @DisplayName("LINK-2: a damaged message is ignored and counted, a good one read, and no role sees either")
    void readsGoodRefusesBad() {
        List<String> telemetry = new ArrayList<>();
        BattleFacts facts = new BattleFacts(1000, 1000, 2, List.of("mate"), "me", 200, 0);
        HadurCore core = new HadurCore(facts, telemetry::add, null);
        core.newRound(0);
        byte[] good = LinkCodec.encode(LinkCodecTest.sample());
        byte[] bad = good.clone();
        bad[10] ^= 4;
        core.tick(input(1, List.of(new BotEvent.Message("mate", good), new BotEvent.Message("mate", bad),
            new BotEvent.Message("mate", new byte[0]))));
        assertEquals(1, core.linkReceived());
        assertEquals(2, core.linkRejected());
        assertEquals(LinkCodecTest.sample(), core.reports().get("mate"));
        assertEquals(2, telemetry.stream().filter(l -> l.startsWith("LINK,0,1,rejected,mate,")).count(),
            telemetry.toString());
        assertTrue(telemetry.stream().noneMatch(l -> l.startsWith("FAULT,")), telemetry.toString());
    }
}
