/**
 * Aggressive (S5): the policies that decide how close Hadur fights and how hard it shoots.
 * Unhittable (S6): the policies that change the movement's flavour and shed work when a
 * tick runs slow.
 *
 * <ul>
 * <li>{@link hadur2.core.policy.DistancePolicy}: the target distance the surf and the orbit
 *     steer to. It starts where the opening puts it and moves a step a wave on the gap between
 *     the two rolling hit rates (DIST-1); the endgame pulls it in to finish (END-1).</li>
 * <li>{@link hadur2.core.policy.PowerPolicy}: full-power shots against a gun the profile
 *     rates T0 (POW-1), or while this battle shows we out-hit them by a wide, certain margin
 *     (POW-2).</li>
 * <li>{@link hadur2.core.policy.Endgame}: the finishing and ramming states (END-1, END-2),
 *     with {@link hadur2.core.policy.EnemyGunHeat} to tell whose gun is cooler.</li>
 * <li>{@link hadur2.core.policy.HitWindow}: the rolling hit rate over the last 100 outcomes
 *     that DIST-1, POW-2 and MOVE-2 read, bounded by construction (RES-2).</li>
 * <li>{@link hadur2.core.policy.MoveFlavour}: the flattener, then go-to surfing, then a band
 *     100 px further out, each added when their hit rate on us certainly beats the
 *     profile's (MOVE-2).</li>
 * <li>{@link hadur2.core.policy.TickBudget}: the computation level, one deeper for the
 *     next tick after a slow tick (TIME-1) and for the rest of the round after each skipped
 *     turn (TIME-2).</li>
 * <li>{@link hadur2.core.policy.RammerPolicy}: a robot driving straight at us, seen from its
 *     own closing speed; full power (RAM-1) and the escape (RAM-2) while it charges.</li>
 * <li>{@link hadur2.core.policy.MirrorDetector}: a robot that drives to a reflection of our
 *     position, which reflection and how late (MIR-1).</li>
 * </ul>
 *
 * <p>Every input is an {@link hadur2.core.memory.Estimate}, a value with its margin, and a
 * policy takes its aggressive setting only once the margin allows it; otherwise it keeps
 * the conservative one (DIAL-1). The package sees evidence only (waves, shots, energies),
 * never {@code BotInput} or {@code BotEvent}, so nothing here can depend on elapsed ticks or
 * the round number (DIAL-2). Gun and movement never see this package: the core applies its
 * decisions through their setters, as it does the opening book's.</p>
 *
 * <p>Dependencies, enforced by {@code ArchitectureTest}: this package may use only itself,
 * opponent memory (for {@code Estimate} and the tiers), physics and the JDK. No gun,
 * movement, KNN, ledger, melee, physics, model, memory or adapt code may depend on it, and
 * it may not use the posture gate. Like the whole core it uses no {@code robocode.*} class
 * (CORE-1) and no randomness, threads, reflection, I/O or clock (RES-6). The package is one
 * of the duel's, pinned by {@code DuelIdentityTest}.</p>
 */
package hadur2.core.policy;
