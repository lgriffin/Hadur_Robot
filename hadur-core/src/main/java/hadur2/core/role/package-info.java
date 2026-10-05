/**
 * The role contract's routing (A1 of the architecture evolution, ROLE-1 to ROLE-4): which
 * strand drives the robot this tick. The battle's facts fix its {@link hadur2.core.role.Charter}
 * at tick 0; {@link hadur2.core.role.RoleResolver} then picks the {@link hadur2.core.role.RoleId}
 * every tick from the charter, three counts, the round's vetoes and the roles that have already
 * driven, and within a round the role only steps down the ladder Team, Melee, Duel. With the
 * Duel driving and several enemies alive, {@link hadur2.core.role.DuelFocus} names the one it
 * fights, and {@link hadur2.core.role.SentryFence} keeps the duel's movement out of the
 * sentries' border. Folded in from the melee extension's {@code posture} package.
 *
 * <p>A leaf the conductor owns: it sees only the model and physics, and no strand or kernel
 * package sees it. Plain Java like the rest of the core: no Robocode (CORE-1), no randomness
 * or I/O (RES-6).</p>
 */
package hadur2.core.role;
