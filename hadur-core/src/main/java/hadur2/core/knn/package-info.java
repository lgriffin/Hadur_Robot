/**
 * K-nearest-neighbour learning shared by the duel's gun and movement: a weighted KD-tree
 * and the views built on it.
 *
 * <ul>
 * <li>{@link hadur2.core.knn.KdTree}: a weighted squared-Euclidean KD-tree ported from
 *     Diamond's, with a FIFO size limit that evicts the oldest point (RES-2).</li>
 * <li>{@link hadur2.core.knn.DistanceFormula}: turns a wave into a feature point and holds
 *     each feature's weight. The gun's and the surf's formulas live in their own
 *     packages.</li>
 * <li>{@link hadur2.core.knn.KnnView}: one formula, one bounded tree and the settings that
 *     say which waves it learns from, how many neighbours it returns (scaled down while the
 *     tick budget is short, TIME-1 and TIME-2) and when the surf switches it on. It also
 *     takes the samples an opponent profile replays, at their shared seed weight (ADAPT-3),
 *     and stops counting them once that weight has faded to zero (RES-4).</li>
 * </ul>
 *
 * <p>A view is a store and a search, not a strategy: the gun and the surf decide what to
 * log and how to turn neighbours into an aim or a danger. Every view is bounded, by its own
 * cap or by {@link hadur2.core.knn.KnnView#DEFAULT_MAX_DATA_POINTS} (RES-2). Search results
 * depend only on the points and the order they went in, never on a clock or randomness
 * (CORE-2, RES-6).</p>
 *
 * <p>Dependencies: this package uses only the model (waves, timestamps, seed weights), the
 * physics helpers and the JDK (CORE-1). The architecture tests forbid it to depend on
 * {@code memory}, {@code adapt}, {@code policy}, {@code melee} or {@code posture}, and
 * {@code physics} may not depend on it. It is one of the duel packages that
 * {@code DuelIdentityTest} pins.</p>
 */
package hadur2.core.knn;
