/**
 * Hadur's own bullet shield (D5): on the opponents of a list of Hadur's own it opens each
 * round sitting still and shoots the enemy's bullets down.
 *
 * <p>The package is the other half of {@code hadur2.core.shield}, which is the counter to an
 * enemy that does this to Hadur (SHIELD-1, SHIELD-2). Here Hadur is the shielder:</p>
 * <ul>
 * <li>{@link hadur2.core.shieldmode.ShieldList} names the opponents it applies to (SHIELD-5);
 *     the robot jar carries the list as a class, the adapter passes its lines, and the core only
 *     parses lines;</li>
 * <li>{@link hadur2.core.shieldmode.ShieldMode} is the mode: it predicts each enemy bullet's
 *     heading from head-on predictors, plans a lighter bullet that meets it in mid-air, and
 *     leaves the mode on the safety exits;</li>
 * <li>{@link hadur2.core.shieldmode.ShieldGeometry} is the intercept arithmetic, the engine's
 *     own rule for when two bullets destroy each other;</li>
 * <li>{@link hadur2.core.shieldmode.ShieldBudget} is SHIELD-6: how much bullet damage the
 *     mode may cost before it is left for the rest of the battle.</li>
 * </ul>
 *
 * <p>The package belongs to the Duel strand and is driven by {@code duel.DuelController}
 * only: shield mode applies to a 1v1 battle and to no other charter. It needs only plain
 * Java, the physics package and the telemetry port, keeps no randomness (RES-6) and gives
 * the same orders for the same inputs (CORE-2). Every list is bounded (RES-2). With an empty
 * list the mode never starts and the package changes nothing the core does.</p>
 */
package hadur2.core.shieldmode;
