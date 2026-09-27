/**
 * Bullet shielding: noticing an enemy that shoots our bullets down, and aiming so it can't.
 *
 * <p>A bullet shielder (oog.mega.saguaro.Saguaro's {@code BulletShieldMode}, for one) sits
 * still. Against a target that doesn't move, every gun, ours included, fires head-on at where
 * the target was on the previous tick, so the shielder can work out our bullet's heading
 * exactly and fire a weaker bullet to meet it mid-air. {@link ShieldDetector} spots this from
 * how our bullets end (SHIELD-1); {@link AimJitter} then moves each shot's aim by an amount
 * the shielder can't predict but that still lands on its body (SHIELD-2).</p>
 *
 * <p>The package needs only plain Java: it keeps no randomness of its
 * own (RES-6) and the same inputs always give the same offsets (CORE-2).</p>
 *
 * <p>Neither class knows about bullets, waves or the gun: {@code HadurCore} feeds the
 * detector our duel bullets' fates and adds the jitter to whatever angle the gun chose, so
 * the counter works the same over either gun. The package imports nothing from the rest of
 * the core; the architecture tests forbid it to depend on {@code posture}, and it is one of
 * the duel packages {@code DuelIdentityTest} pins. See docs/bullet-shielding.md for how
 * Saguaro shields and how the counter did on the bench.</p>
 */
package hadur2.core.shield;
