/**
 * The engine's physics and the geometry built on it: the bottom layer that the duel's gun,
 * surf, waves and energy ledger, and the melee brain, all stand on.
 *
 * <ul>
 * <li>{@link hadur2.core.physics.Rules} and {@link hadur2.core.physics.Angles}: Robocode's
 *     game rules and angle normalisation, copied so the core need not import the engine
 *     (CORE-1) and checked bit for bit against it by {@code PhysicsMatchesEngineProperties}.</li>
 * <li>{@link hadur2.core.physics.BattleField}: the field's walls as a robot's centre sees
 *     them (18 px in from the edges), the wall-distance features and wall smoothing.</li>
 * <li>{@link hadur2.core.physics.MovementPredictor}: tick-by-tick prediction under the
 *     engine's turn, acceleration and braking rules, and the precise maximum escape angle
 *     that waves scale their guess factors by and the surf takes its destinations from.</li>
 * <li>{@link hadur2.core.physics.DiaUtils}: small shared helpers (projection, bearings,
 *     bullet flight times, firing-angle grids, back-as-front driving).</li>
 * </ul>
 *
 * <p>Conventions throughout: positions in px with the origin at the field's bottom-left and
 * +y north; angles in radians with 0 north, growing clockwise (so x uses {@code sin} and y
 * uses {@code cos}); velocities in px/tick, negative when reversing; time in ticks. The one
 * exception is {@code Rules}' turn-rate constants, which are the engine's degrees per tick.
 * An orbit direction of +1 is clockwise round the point orbited.</p>
 *
 * <p>Dependencies, enforced by {@code ArchitectureTest}: like the whole core, nothing here
 * may use {@code robocode.*} (CORE-1), any JDK package beyond {@code java.lang},
 * {@code java.util} and {@code java.awt.geom}, randomness, threads, reflection, I/O or a
 * clock (RES-6), or a mutable static field (CORE-2). This package may use the model, but
 * never the gun, movement, KNN, replay, opponent-memory, melee or posture packages, or the
 * adapt and policy packages; those all depend on it instead. The energy ledger may depend
 * on this package and nothing else in the core, so that only the engine's rules decide which
 * energy drops become waves (WAVE-1). The package is one of the duel's, pinned by
 * {@code DuelIdentityTest}.</p>
 */
package hadur2.core.physics;
