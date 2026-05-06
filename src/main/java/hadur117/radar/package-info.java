/**
 * Radar control for duel and melee modes.
 *
 * <p>In duel mode the radar uses a 2x-overshoot narrow lock to keep the single
 * opponent continuously tracked. In melee mode it targets the stalest (least
 * recently scanned) opponent, with an optional gun-heat-aware variant that skips
 * the radar sweep when the gun is about to fire.</p>
 */
package hadur117.radar;
