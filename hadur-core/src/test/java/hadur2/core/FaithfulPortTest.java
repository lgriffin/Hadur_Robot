package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * S1 moves 1.20 behind ports without changing how it plays. This pins an engine API quirk
 * the port has to reproduce. The other one, the gun heating as soon as 1.20 called
 * setFireBullet, only shows once the KNN gun has data; the replay fixtures and the bench's
 * same-seed comparison with 1.20 cover it.
 */
class FaithfulPortTest {

    static BotInput input(long time, double gunHeat, double gunTurnRemaining, BotEvent... events) {
        return new BotInput(time, 0, 400, 300, 0, 0, 100, gunHeat, 0.1, 0, gunTurnRemaining, 0,
            1, List.of(events));
    }

    static BotEvent.Scan scan() {
        return new BotEvent.Scan("enemy", 0.2, 400, 100, 1.0, 8);
    }

    static HadurCore scanned() {
        HadurCore core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
        core.tick(input(1, 1.0, 0, scan()));
        return core;
    }

    @Test
    @DisplayName("fires only when the gun is within 0.05 degrees, as 1.20's degree getter did")
    void fireThresholdIsDegrees() {
        // 0.01 rad is 0.57 degrees: 1.20 held fire.
        assertEquals(0, scanned().tick(input(2, 0, 0.01, scan())).firePower());
        // 0.0005 rad is 0.029 degrees: 1.20 fired.
        assertTrue(scanned().tick(input(2, 0, 0.0005, scan())).firePower() > 0);
    }
}
