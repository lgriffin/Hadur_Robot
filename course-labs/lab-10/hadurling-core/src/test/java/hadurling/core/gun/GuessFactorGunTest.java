package hadurling.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Wave;
import hadurling.core.physics.Angles;
import hadurling.core.physics.Rules;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The gun is tested without a battle: we stand still at (400, 100) with the enemy 400 px
 * due north, and play the enemy ourselves. Each "shot" is fired at tick 60 * i and the enemy
 * is then found, 40 ticks later, wherever the test wants it to be.
 */
class GuessFactorGunTest {

    private static final double MEA = Rules.maxEscapeAngle(GuessFactorGun.POWER);

    private static Input input(long time, double gunHeading) {
        return new Input(time, 400, 100, 0, 0, 100, 0, gunHeading, 0, List.of());
    }

    /** The same, with a hot gun: the gun aims but cannot fire, so asking makes no wave. */
    private static Input hot(long time, double gunHeading) {
        return new Input(time, 400, 100, 0, 0, 100, 0.4, gunHeading, 0, List.of());
    }

    private static Event.Scan enemyAt(double bearing, double distance) {
        return new Event.Scan("foe", bearing, distance, 100, 0, 0);
    }

    /** Fires one shot at the enemy's usual place and returns the gun heading it used. */
    private static double fire(GuessFactorGun gun, int i, double gunHeading) {
        long time = 60L * i;
        // Ask once, with a hot gun, to learn where it wants to point; turn there; then ask
        // again with a cool gun to fire.
        double heading = gunHeading + gun.aim(hot(time, gunHeading), enemyAt(0, 400)).turn();
        GuessFactorGun.Aim shot = gun.aim(input(time, heading), enemyAt(0, 400));
        assertEquals(GuessFactorGun.POWER, shot.power());
        return heading;
    }

    /** The enemy turns up, 40 ticks later, at the given guess factor. */
    private static List<Boolean> enemyArrivesAt(GuessFactorGun gun, int i, double guessFactor) {
        Wave w = new Wave(400, 100, 60L * i, GuessFactorGun.POWER, 0, 1);
        double angle = w.firingAngle(guessFactor);
        double x = Angles.projectX(400, angle, 400);
        double y = Angles.projectY(100, angle, 400);
        double bearing = Angles.absoluteBearing(400, 100, x, y);
        return gun.observe(input(60L * i + 40, 0), enemyAt(bearing, Math.hypot(x - 400, y - 100)));
    }

    @Test
    @Tag("HL-11")
    @DisplayName("with nothing learned the gun aims head-on")
    void headOnUntilItHasSamples() {
        GuessFactorGun gun = new GuessFactorGun();
        Input in = input(1, 0.1);
        GuessFactorGun.Aim aim = gun.aim(in, enemyAt(0.3, 300));
        assertEquals(0.3 - 0.1, aim.turn(), 1e-12);
        assertEquals(0, gun.samples());
    }

    @Test
    @Tag("HL-11")
    @DisplayName("fewer than MIN_SAMPLES samples are still not trusted")
    void notTrustedYet() {
        GuessFactorGun gun = new GuessFactorGun();
        double heading = 0;
        for (int i = 0; i < GuessFactorGun.MIN_SAMPLES - 1; i++) {
            heading = fire(gun, i, heading);
            enemyArrivesAt(gun, i, 0.6);
        }
        assertEquals(GuessFactorGun.MIN_SAMPLES - 1, gun.samples());
        // Still head-on: the enemy is dead ahead and the gun already points at it.
        assertEquals(0, gun.aim(hot(10_000, 0), enemyAt(0, 400)).turn(), 1e-12);
    }

    @Test
    @Tag("HL-10")
    @DisplayName("when its waves break the gun learns, and then aims where the enemy went")
    void learnsWhereTheEnemyGoes() {
        GuessFactorGun gun = new GuessFactorGun();
        double heading = 0;
        for (int i = 0; i < 8; i++) {
            heading = fire(gun, i, heading);
            enemyArrivesAt(gun, i, 0.6);
        }
        assertEquals(8, gun.samples());
        double turn = gun.aim(hot(10_000, 0), enemyAt(0, 400)).turn();
        assertEquals(0.6 * MEA, turn, 1e-9);
    }

    @Test
    @Tag("HL-10")
    @DisplayName("a wave that has not reached the enemy teaches nothing yet")
    void waitsForTheWaveToBreak() {
        GuessFactorGun gun = new GuessFactorGun();
        fire(gun, 0, 0);
        assertEquals(1, gun.wavesInFlight());
        // 10 ticks later the wave has only grown 170 px of the 400 it needs.
        gun.observe(input(10, 0), enemyAt(0, 400));
        assertEquals(0, gun.samples());
        assertEquals(1, gun.wavesInFlight());
    }

    @Test
    @Tag("HL-10")
    @DisplayName("it reports a virtual hit when the enemy was where the shot was aimed, a miss otherwise")
    void virtualHitsAndMisses() {
        GuessFactorGun gun = new GuessFactorGun();
        fire(gun, 0, 0);
        assertEquals(List.of(true), enemyArrivesAt(gun, 0, 0.0));
        fire(gun, 1, 0);
        assertEquals(List.of(false), enemyArrivesAt(gun, 1, 0.9));
    }

    @Test
    @DisplayName("a hot gun does not fire and makes no wave")
    void hotGunMakesNoWave() {
        GuessFactorGun gun = new GuessFactorGun();
        assertEquals(0, gun.aim(hot(1, 0), enemyAt(0, 400)).power());
        assertEquals(0, gun.wavesInFlight());
    }
}
