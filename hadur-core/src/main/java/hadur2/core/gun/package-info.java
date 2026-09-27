/**
 * The duel's gun: two KNN guns, the virtual guns that rate them, and the choice between
 * them.
 *
 * <ul>
 * <li>{@link hadur2.core.gun.GunController}: owns each opponent's gun views, picks the gun
 *     that aims (the opening book's choice from the first wave, ADAPT-1, until the live
 *     ratings differ beyond their margin, DIAL-1), scores the virtual guns, logs broken
 *     waves, replays profile seeds (ADAPT-3) and sets 1.20's bullet power.</li>
 * <li>{@link hadur2.core.gun.MainGun}: a displacement-vector gun over one large view, with a
 *     kernel density over its neighbours' angles; the only gun used in melee.</li>
 * <li>{@link hadur2.core.gun.AntiSurferGun}: four small, fast-forgetting views pooled into
 *     one guess-factor density, for opponents that surf the main gun.</li>
 * <li>{@link hadur2.core.gun.GunFormula} and {@link hadur2.core.gun.AntiSurferFormula}: their
 *     feature spaces, which also fix the layout of a gun seed sample.</li>
 * </ul>
 *
 * <p>Each view's seeded neighbours count at the seed's weight, and faded seeds stop
 * counting as data (RES-4); every view is bounded (RES-2); the k share follows the tick
 * budget (TIME-1, TIME-2). The gun sees no clock and no randomness, so the same waves give
 * the same aim (CORE-2).</p>
 *
 * <p>Dependencies: this package uses the model, physics and {@code knn} packages and the
 * JDK (CORE-1). The architecture tests forbid it to depend on {@code move} (gun and
 * movement are independent), {@code memory}, {@code adapt}, {@code policy}, {@code melee}
 * or {@code posture}: the core applies the opening book's and the tick budget's decisions
 * through this package's setters. It is one of the duel packages {@code DuelIdentityTest}
 * pins.</p>
 */
package hadur2.core.gun;
