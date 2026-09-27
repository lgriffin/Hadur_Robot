/**
 * Recognise, then adapt (S4): the opening book that turns a loaded profile into decisions
 * for the first tick (ADAPT-1, ADAPT-2), the seeds it replays into the KNN views at a lower
 * weight (ADAPT-3), and the trust that fades those seeds when the opponent no longer
 * behaves like its profile (RES-4).
 *
 * <p>The flow, all driven by {@code HadurCore} in a duel:</p>
 * <ol>
 * <li>At the first scan, right after {@code memory.ProfileLibrary} loads the profile
 *     (MEM-1), {@link hadur2.core.adapt.OpeningBook#read} reads it once and returns an
 *     {@link hadur2.core.adapt.Opening}: the tiers, the first gun (ADAPT-1), whether the
 *     flattener starts on (ADAPT-2), the surf prior, the seeds and the starting distance.
 *     A tier too uncertain to name gives 1.20's conservative setting (DIAL-1).</li>
 * <li>A {@link hadur2.core.adapt.SeedLoader} replays the seeds into the gun's and the
 *     surf's KNN views, {@link hadur2.core.adapt.SeedLoader#PER_TICK} samples a tick, each
 *     sharing a {@link hadur2.core.model.SeedWeight} that starts at half a live sample
 *     (ADAPT-3).</li>
 * <li>Two {@link hadur2.core.adapt.SeedTrust}s, one for each seed, compare every new wave's
 *     live estimate with the profile's and lower that weight to zero within 20 diverging
 *     waves once they disagree (RES-4). The core then also hands the opening's gun choice
 *     and surf prior back to live data.</li>
 * </ol>
 *
 * <h2>Dependencies</h2>
 *
 * <p>This package reads memory and the model; it never reaches the gun or movement code.
 * The core applies its decisions through their own setters, so gun and movement stay
 * ignorant of profiles.</p>
 *
 * <p>ArchUnit enforces this ({@code ArchitectureTest.adaptSeesNoClock}, tagged DIAL-2): the
 * package may depend only on itself, {@code hadur2.core.memory}, {@code hadur2.core.model}
 * and the JDK, and never on {@code model.BotInput} or {@code model.BotEvent}, where the
 * tick and round number live. So no decision here can be conditioned on elapsed time or
 * the round alone (DIAL-2): the book is a function of the profile, and the seed trust
 * counts waves. No gun, movement, KNN, ledger, melee, physics, model or memory code may
 * depend on this package. The core-wide rules apply too: no {@code robocode.*} (CORE-1),
 * no randomness, threads, reflection, I/O or clock (RES-6), and no mutable statics
 * (CORE-2).</p>
 */
package hadur2.core.adapt;
