/**
 * The melee extension's gate (M1): which set of subsystems drives the robot this tick.
 * {@link hadur2.core.posture.PostureGate} fails closed to the duel: melee runs only while two
 * or more opponents are alive, no sentry robot is on the field or has been scanned this
 * round, and the melee subsystems have not thrown this round (GATE-1 to GATE-4). With the
 * duel in charge and several opponents alive, {@link hadur2.core.posture.DuelFocus} names the
 * one it fights, and {@link hadur2.core.posture.SentryFence} keeps the duel's movement out of
 * the sentries' border.
 *
 * <p>A leaf: it sees no gun, movement, melee or memory code, and nothing in the duel sees it.
 * Plain Java like the rest of the core: no Robocode (CORE-1), no randomness or I/O (RES-6).</p>
 */
package hadur2.core.posture;
