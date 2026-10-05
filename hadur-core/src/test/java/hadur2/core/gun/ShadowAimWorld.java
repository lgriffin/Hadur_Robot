package hadur2.core.gun;

import hadur2.core.model.SeedWeight;
import hadur2.core.model.Wave;
import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;

/**
 * Test support for the GUN-7 Cucumber steps (package {@code hadur2.core.steps}): a seeded main
 * gun that aims at a wave, and a shadow term the scenario describes.
 */
public final class ShadowAimWorld {

    private final GunController gun = new GunController(GunOpeningTest.FIELD, 1);
    private final Wave wave = GunOpeningTest.wave();
    private final double plain;

    /** A gun with a full main view, and what it aims at with no shadow term. */
    public ShadowAimWorld() {
        for (int i = 0; i < 100; i++) {
            gun.seed(wave.botName, GunOpeningTest.sample(wave, 0.5, 0, 0), new SeedWeight(0.5));
        }
        plain = gun.aim(wave, GunOpeningTest.ME, 30);
    }

    private double shiftWith(ShadowValue shadow) {
        return Angles.normalRelativeAngle(gun.aim(wave, GunOpeningTest.ME, 30, shadow) - plain);
    }

    /** The shift, in radians, of the angle fired from the gun's own, when there is no enemy wave. */
    public double shiftWithNoWave() {
        return shiftWith(ShadowAimTest.shadow(false, 9, a -> 9));
    }

    /** The shift when bullets clockwise of the gun's aim would save {@code worth} damage. */
    public double shiftWhenClockwiseSaves(double worth) {
        return shiftWith(ShadowAimTest.shadow(true, worth,
            a -> Angles.normalRelativeAngle(a - plain) > 0 ? worth : 0));
    }

    /** The target's angular half-width at this range, radians. */
    public double botHalfWidth() {
        return DiaUtils.botWidthAimAngle(GunOpeningTest.ME.distance(wave.targetLocation));
    }
}
