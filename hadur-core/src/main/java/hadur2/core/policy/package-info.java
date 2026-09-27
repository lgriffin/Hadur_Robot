/**
 * Aggressive (S5): the policies that decide how close Hadur fights and how hard it shoots.
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
 * </ul>
 *
 * <p>Every input is an {@link hadur2.core.memory.Estimate}, a value with its margin, and a
 * policy takes its aggressive setting only once the margin allows it; otherwise it keeps
 * the conservative one (DIAL-1). The package sees evidence only (waves, shots, energies),
 * never {@code BotInput} or {@code BotEvent}, so nothing here can depend on elapsed ticks or
 * the round number (DIAL-2). Gun and movement never see this package: the core applies its
 * decisions through their setters, as it does the opening book's.</p>
 */
package hadur2.core.policy;
