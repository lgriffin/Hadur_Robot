/**
 * Movement strategies for duel and melee modes.
 *
 * <p>{@link hadur117.movement.WaveSurfer} implements true wave surfing with
 * precise tick-by-tick prediction, multi-wave evaluation, kernel density
 * smoothing, and a flattener that activates when the hit rate exceeds 9%.
 * {@link hadur117.movement.MinimumRiskMovement} evaluates candidate positions
 * to minimise risk in free-for-all battles.</p>
 */
package hadur117.movement;
