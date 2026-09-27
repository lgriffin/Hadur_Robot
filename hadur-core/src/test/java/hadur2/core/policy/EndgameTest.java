package hadur2.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** END-1, END-2 and the enemy gun heat END-1 reads. */
class EndgameTest {

    @ParameterizedTest(name = "enemy {0}, ours {1}, heats {2}/{3}: {4}")
    @CsvSource({
        "15.9, 40.1, 1.0, 0.5, FINISH",
        "16.0, 80, 1.0, 0.5, NONE",
        "10, 40.0, 1.0, 0.5, NONE",
        "10, 80, 0.5, 0.5, NONE",
        "10, 80, 0.4, 0.5, NONE",
        "0, 80, 1.0, 0.5, RAM",
        "0, 1, 0, 3, RAM",
        "50, 50, 3, 0, NONE"})
    @Tag("END-1")
    @Tag("END-2")
    @DisplayName("END-1 needs all three conditions; END-2 needs only a disabled enemy")
    void states(double enemy, double ours, double enemyHeat, double ourHeat, Endgame.State expected) {
        assertEquals(expected, Endgame.of(enemy, ours, enemyHeat, ourHeat));
    }

    @Test
    @Tag("END-1")
    @DisplayName("END-1: the enemy's gun heat is 3 at the round's start, rises with each shot and cools each tick")
    void enemyGunHeat() {
        EnemyGunHeat h = new EnemyGunHeat(0.1);
        assertEquals(3.0, h.at(0), 1e-12);
        assertEquals(2.0, h.at(10), 1e-12);
        assertEquals(0.0, h.at(40), 1e-12, "never below zero");
        h.shot(40, 3.0);
        assertEquals(1.6, h.at(40), 1e-12);
        assertEquals(0.6, h.at(50), 1e-12);
        assertEquals(1.6, h.at(30), 1e-12, "a time before the shot reads the shot's heat");
        h.newRound();
        assertEquals(3.0, h.at(0), 1e-12);
        assertThrows(IllegalArgumentException.class, () -> new EnemyGunHeat(0));
    }
}
