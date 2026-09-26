package hadur2.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OpponentStatsTest {

    private final OpponentStatsBook book = new OpponentStatsBook();

    @Test
    void movementIsUnknownUntilThereAreEnoughSamples() {
        OpponentStats s = new OpponentStats("a");
        for (int i = 0; i < 9; i++) s.recordScan(300, 0, Double.NaN);
        assertEquals(OpponentStats.MovementType.UNKNOWN, s.movementType());
        s.recordScan(300, 0, Double.NaN);
        assertEquals(OpponentStats.MovementType.STOPPED, s.movementType());
    }

    @Test
    void classifiesLinearCircularAndOscillatingMovers() {
        OpponentStats linear = new OpponentStats("l");
        OpponentStats circular = new OpponentStats("c");
        OpponentStats oscillating = new OpponentStats("o");
        for (int i = 0; i < 20; i++) {
            linear.recordScan(300, 8, 0.0);
            circular.recordScan(300, 8, 0.1);
            oscillating.recordScan(300, i % 2 == 0 ? 6 : -6, 0.0);
        }
        assertEquals(OpponentStats.MovementType.LINEAR, linear.movementType());
        assertEquals(OpponentStats.MovementType.CIRCULAR, circular.movementType());
        assertEquals(OpponentStats.MovementType.OSCILLATING, oscillating.movementType());
    }

    @Test
    void detectsHeadOnAndLeadingGuns() {
        OpponentStats headOn = new OpponentStats("h");
        OpponentStats leading = new OpponentStats("l");
        for (int i = 0; i < 4; i++) {
            headOn.recordDamageReceived(4, 0.01, 0.05);
            leading.recordDamageReceived(4, 0.3, 0.05);
        }
        assertEquals(OpponentStats.GunType.HEAD_ON, headOn.gunType());
        assertEquals(OpponentStats.GunType.LEADING, leading.gunType());
        assertEquals(16, headOn.damageReceivedFrom());
    }

    @Test
    void hitsWithUnknownAimStillCountAsDamage() {
        OpponentStats s = new OpponentStats("a");
        s.recordDamageReceived(10, Double.NaN, 0);
        assertEquals(10, s.damageReceivedFrom());
        assertEquals(OpponentStats.GunType.UNKNOWN, s.gunType());
    }

    @Test
    void averagesEngagementDistance() {
        OpponentStats s = new OpponentStats("a");
        s.recordScan(200, 0, Double.NaN);
        s.recordScan(400, 0, Double.NaN);
        assertEquals(300, s.averageDistance());
    }

    @Test
    void theBookKeepsOneRecordPerOpponent() {
        book.get("a").recordDamageDealt(5);
        book.get("a").recordDamageDealt(5);
        book.get("b").recordDamageDealt(1);
        assertEquals(2, book.all().size());
        assertEquals(10, book.get("a").damageDealtTo());
    }

    @Test
    @Tag("RES-2")
    void theBookStopsGrowingAtItsBound() {
        for (int i = 0; i < OpponentStatsBook.MAX_OPPONENTS + 10; i++) book.get("bot" + i);
        assertEquals(OpponentStatsBook.MAX_OPPONENTS, book.all().size());
        book.get("late").recordDamageDealt(3);
        assertEquals(0, book.get("bot0").damageDealtTo());
    }
}
