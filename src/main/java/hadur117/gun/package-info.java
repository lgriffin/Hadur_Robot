/**
 * Targeting system with a five-gun virtual gun array.
 *
 * <p>Implements GuessFactor, pattern matching, circular prediction, linear
 * prediction, and head-on targeting. A rolling virtual gun window dynamically
 * selects the best-performing gun each tick. GuessFactor statistics persist
 * across rounds via static arrays.</p>
 */
package hadur117.gun;
