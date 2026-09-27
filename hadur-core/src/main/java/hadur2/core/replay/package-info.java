/**
 * Recorded battles as text, and a driver that replays them through a fresh core (CORE-2).
 *
 * <p>CORE-2 says the core produces identical {@code BotOrders} for identical
 * {@code BotInput} sequences and identical profile state. This package is how that is
 * checked end to end: {@code hadur2.HadurRecorder} in the robot module writes every tick's
 * input and orders from a battle in the real engine, and the replay tests feed the inputs
 * back through {@link hadur2.core.replay.Replay#run} and compare the orders tick for tick.
 * The melee extension's duel byte-identity also leans on these fixtures: they pin the
 * orchestrator's duel path.</p>
 *
 * <ul>
 * <li>{@link hadur2.core.replay.LineCodec}: one line of text per {@code BotInput}
 *     ({@code I,...}) and per {@code BotOrders} ({@code O,...}), exact to the bit for
 *     every double.</li>
 * <li>{@link hadur2.core.replay.Replay}: reads a recording ({@code F}, {@code N},
 *     {@code I} and {@code O} lines), builds a {@code HadurCore} and {@code Guard} the way
 *     the robot does, and returns the recorded and replayed orders side by side.</li>
 * </ul>
 *
 * <p>Because the tick time reaches the core as a {@code TickTime} event measured by the
 * adapter, not from a clock, it is recorded like any other event and a replay makes the
 * same budget decisions (TIME-1, TIME-2) as the live robot did.</p>
 *
 * <h2>Dependencies</h2>
 *
 * <p>This package sits above the core it drives: it depends on {@code hadur2.core}
 * ({@code HadurCore}, {@code Guard}), the model and the ports. ArchUnit
 * ({@code ArchitectureTest.layering}) forbids the model, physics and port packages from
 * depending on it. Nothing here does I/O: callers read and write the lines (RES-6), and
 * the core-wide rules (no {@code robocode.*}, CORE-1; no randomness, threads, reflection
 * or clock, RES-6; no mutable statics, CORE-2) apply as everywhere in the core.</p>
 */
package hadur2.core.replay;
