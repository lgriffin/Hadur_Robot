/**
 * Recognise, then adapt (S4): the opening book that turns a loaded profile into decisions
 * for the first tick (ADAPT-1, ADAPT-2), the seeds it replays into the KNN views at a lower
 * weight (ADAPT-3), and the trust that fades those seeds when the opponent no longer
 * behaves like its profile (RES-4).
 *
 * <p>This package reads memory and the model; it never reaches the gun or movement code.
 * The core applies its decisions through their own setters, so gun and movement stay
 * ignorant of profiles.</p>
 */
package hadur2.core.adapt;
