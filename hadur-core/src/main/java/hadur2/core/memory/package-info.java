/**
 * Opponent memory (stage S3): one {@link hadur2.core.memory.OpponentProfile} per opponent
 * lineage, folded from each round's observations (MEM-2), encoded in a small checksummed
 * binary format ({@link hadur2.core.memory.ProfileCodec}) and kept in a
 * {@link hadur2.core.port.ProfileStore} by the {@link hadur2.core.memory.ProfileLibrary}
 * (MEM-1, MEM-3 to MEM-5, RES-3).
 *
 * <p>S3 records and persists; nothing here changes how Hadur fights by itself. S4's
 * {@code hadur2.core.adapt} package reads the profile's tiers and seeds to set the opening
 * book, and S5 and S6's {@code hadur2.core.policy} package reads its estimates.</p>
 *
 * <h2>Where it sits in a battle</h2>
 *
 * <ol>
 * <li>Before the first tick the robot calls {@link hadur2.core.memory.ProfileLibrary#prepare()},
 *     which reads the battle clock and warms the codec, so the first scan's load is cheap.</li>
 * <li>At the first scan of a duel, {@code HadurCore} turns the radar's name into a key with
 *     {@link hadur2.core.memory.LineageKey} and asks the library to
 *     {@link hadur2.core.memory.ProfileLibrary#load load} it before that tick's orders are
 *     made (MEM-1). A missing or damaged profile gives a fresh one, never an exception
 *     (MEM-4).</li>
 * <li>During each round the core reports shots, hits, scans and seed samples to a
 *     {@link hadur2.core.memory.ProfileFolder}; at the round's end the folder adds them to
 *     the profile in one step (MEM-2).</li>
 * <li>The adapter saves the profile at the end of each round Hadur survives and at the
 *     battle's end (MEM-3), through {@link hadur2.core.memory.ProfileLibrary#save}, which
 *     writes a temporary copy first (RES-3) and drops other profiles' seeds when the store
 *     nears its quota (MEM-5).</li>
 * </ol>
 *
 * <p>Estimates read from a profile carry a 95% margin of error
 * ({@link hadur2.core.memory.Estimate}, DIAL-1), and {@link hadur2.core.memory.Tiers}
 * names a capability tier only while that margin is narrow enough. Every count is a float
 * that is halved when its group grows past a limit, and every list is capped, so a profile
 * stays bounded however many battles it sees (RES-2).</p>
 *
 * <p>Opponent memory is for duels only: a battle that starts with two or more opponents
 * neither loads nor saves profiles (the core creates no library for it).</p>
 *
 * <h2>Dependencies</h2>
 *
 * <p>ArchUnit ({@code ArchitectureTest.memoryIsLeaf}, tagged MEM-3) keeps this package a
 * leaf: it may depend only on itself, {@code hadur2.core.port} and the JDK, and it reaches
 * storage only through the {@code ProfileStore} port, so it can be tested with an
 * in-memory store. No gun, movement, KNN, ledger, melee, physics or model code may depend
 * on it; the adapt and policy packages read it on their behalf. Like the rest of the core
 * it does no I/O of its own, uses no clock, randomness, threads or reflection (RES-6) and
 * keeps no mutable static state (CORE-2). The CRC-32 comes from {@code java.util.zip},
 * which is pure computation.</p>
 */
package hadur2.core.memory;
