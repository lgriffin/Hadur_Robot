/**
 * The values the core is made of: what crosses the hexagonal boundary each tick, the robot
 * states and their logs, and the waves the duel's gun and movement learn from.
 *
 * <p><b>The port values.</b> {@link hadur2.core.model.BotInput} is everything the core sees
 * in a tick, with the engine's events as {@link hadur2.core.model.BotEvent}s, and
 * {@link hadur2.core.model.BotOrders} is everything it answers. They are immutable and
 * compare field by field, so a battle is a list of inputs and orders that the replay can
 * check tick for tick (CORE-2), and the core never needs {@code robocode.*} (CORE-1).</p>
 *
 * <p><b>States and waves.</b> A {@link hadur2.core.model.RobotState} is a robot at one tick,
 * and a {@link hadur2.core.model.RobotStateLog} keeps a bounded history of them (RES-2),
 * interpolating unobserved ticks. A {@link hadur2.core.model.Wave} is the circle a bullet
 * fired at one tick lies on; it converts between firing angles and guess factors, measures
 * the precise intersection with a robot, and carries the bullet shadows our own bullets
 * cast on an enemy wave (MOVE-1). A {@link hadur2.core.model.WaveManager} holds the waves in
 * flight on one side and reports each one as it breaks, dropping its state log (RES-2).</p>
 *
 * <p><b>KNN samples.</b> {@link hadur2.core.model.Timestamped} samples, the gun's
 * {@link hadur2.core.model.TimestampedFiringAngle}s and the surf's
 * {@link hadur2.core.model.TimestampedGuessFactor}s, are what the KNN views store; seeded
 * ones share a {@link hadur2.core.model.SeedWeight} that keeps them lighter than live ones
 * (ADAPT-3) and can fade them to nothing (RES-4).</p>
 *
 * <p><b>Units and conventions.</b> Robocode's throughout: pixels with the origin at the
 * field's bottom-left and y growing upward; angles in radians, absolute ones measured from
 * north and growing clockwise; velocities in pixels per tick; times in ticks within the
 * round.</p>
 *
 * <p><b>Dependencies.</b> The model sits at the bottom of the core, beside
 * {@code hadur2.core.physics}, which it uses for angles, the field and movement
 * prediction. ArchUnit ({@code ArchitectureTest}) forbids it to depend on the gun, movement
 * or replay packages, on opponent memory, on the adapt and policy packages, on the melee
 * brain or on the posture gate, so any of them can use the model without a cycle. Like the
 * rest of the core it uses only the JDK's {@code java.lang}, {@code java.util} and
 * {@code java.awt.geom} (CORE-1), with no randomness, threads, reflection, I/O or clock
 * (RES-6), and no mutable static fields (CORE-2).</p>
 */
package hadur2.core.model;
