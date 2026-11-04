package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TGUN-1..3: the team duelist's gun, and that it ships off. */
class TeamDuelGunTest {

    @Test
    @Tag("TGUN-1")
    @DisplayName("TGUN-1: ships off: no team plays DUELGUN and the controller builds no duel gun")
    void shipsOff() {
        assertFalse(TeamModes.FORCE_DUELGUN);
        assertFalse(TeamModes.DEFAULT.contains(TeamModes.Mode.DUELGUN));
        assertNull(new MeleeController(field(1200, 1200), new hadur117.core.world.EnemyTracker(field(1200, 1200))).teamGun());
    }

    @Test
    @Tag("TGUN-2")
    @DisplayName("TGUN-2: sightings of two copies of a class teach one record; the duel gun aims only once it has learned the class and has a fresh wave")
    void learnsPerClass() {
        TeamDuelGun gun = new TeamDuelGun(field(1200, 1200), TeamModes::key);
        gun.newRound();
        Point2D.Double me = pt(600, 200);
        assertTrue(Double.isNaN(gun.aim("tmnr.TMNR 1.01 (2)", me, 0, 1.9)), "no wave yet");
        for (long t = 1; t <= 300; t++) {
            // Two copies of one class orbiting at 8 px a tick, each seen every tick.
            double a = t * 0.02;
            gun.sighted("tmnr.TMNR 1.01 (2)", t, pt(600 + 300 * Math.sin(a), 600 + 300 * Math.cos(a)), a + Math.PI / 2, 8, 100, me, 100, 5);
            gun.sighted("tmnr.TMNR 1.01 (3)", t, pt(600 - 300 * Math.sin(a), 600 - 300 * Math.cos(a)), a + Math.PI / 2, 8, 100, me, 100, 5);
        }
        assertTrue(gun.breaks("tmnr.TMNR 1.01 (2)") >= TeamDuelGun.MIN_BREAKS);
        assertEquals(gun.breaks("tmnr.TMNR 1.01 (2)"), gun.breaks("tmnr.TMNR 1.01 (3)"), "one record per class");
        assertFalse(Double.isNaN(gun.aim("tmnr.TMNR 1.01 (2)", me, 300, 1.9)));
        assertTrue(Double.isNaN(gun.aim("tmnr.TMNR 1.01 (2)", me, 300 + TeamDuelGun.MAX_WAVE_AGE + 1, 1.9)), "a stale wave hands back to the field gun");
        // A sighting no newer than the last is ignored.
        long before = gun.breaks("tmnr.TMNR 1.01 (2)");
        gun.sighted("tmnr.TMNR 1.01 (2)", 300, pt(10, 10), 0, 0, 100, me, 100, 5);
        assertEquals(before, gun.breaks("tmnr.TMNR 1.01 (2)"));
    }

    @Test
    @Tag("TGUN-2")
    @DisplayName("TGUN-2: a shot fires the virtual guns on the wave it was aimed on, at the shot's power, even when a newer sighting came between aim and fire")
    void firesOnTheAimedWave() {
        TeamDuelGun gun = new TeamDuelGun(field(1200, 1200), TeamModes::key);
        gun.newRound();
        Point2D.Double me = pt(600, 200);
        String name = "tmnr.TMNR 1.01 (2)";
        for (long t = 1; t <= 300; t++) {
            double a = t * 0.02;
            gun.sighted(name, t, pt(600 + 300 * Math.sin(a), 600 + 300 * Math.cos(a)), a + Math.PI / 2, 8, 100, me, 100, 5);
        }
        // A finishing shot below 0.2: the wave takes its power before the aim.
        assertFalse(Double.isNaN(gun.aim(name, me, 300, 0.15)));
        hadur117.core.model.Wave aimed = gun.aimedWave();
        assertNotNull(aimed);
        assertEquals(0.15, aimed.bulletPower(), 1e-9);
        // A newer sighting arrives before the command fires.
        double a = 301 * 0.02;
        gun.sighted(name, 301, pt(600 + 300 * Math.sin(a), 600 + 300 * Math.cos(a)), a + Math.PI / 2, 8, 100, me, 100, 5);
        gun.fired(name, me, 301, 0.15);
        assertTrue(aimed.firingWave, "the aimed wave is the firing wave, so its virtual bullets are scored");
        assertEquals(1, gun.fired());
        assertNull(gun.aimedWave());
        // A second fire with no new aim does nothing.
        gun.fired(name, me, 302, 0.15);
        assertEquals(1, gun.fired());
    }
}
