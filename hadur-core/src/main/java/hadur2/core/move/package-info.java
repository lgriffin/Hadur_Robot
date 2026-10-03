/**
 * The duel's movement: wave surfing against the enemy's bullets, the danger views it
 * scores with, and the shadows our own bullets cast on the enemy's waves.
 *
 * <ul>
 * <li>{@link hadur2.core.move.MoveController}: the enemy's waves in flight, the KNN danger
 *     views and the enemy's normalised hit rate on us that switches them on; our bullets in
 *     flight and their shadows on each firing wave (MOVE-1). It takes the opening book's
 *     prior, forced flattener and seeds (ADAPT-2, ADAPT-3, DIAL-1), drops them when the
 *     live evidence disagrees (RES-4), and sheds KNN work on the tick budget's say
 *     (TIME-1, TIME-2).</li>
 * <li>{@link hadur2.core.move.SurfMover}: decides where to drive each tick. It predicts
 *     each option with the engine's movement rules, scores the waves it would cross, and
 *     drives the safest; it orbits when no wave is in the air and rams a disabled enemy
 *     (END-2). The distance policy steers its attack angle (DIST-1, END-1) and the movement
 *     flavour its mode, three options or go-to surfing (MOVE-2).</li>
 * <li>{@link hadur2.core.move.RamEscape}: while a rammer is charging (RAM-2), the heading
 *     that keeps a pursuing enemy furthest away over the next 20 ticks, in place of the
 *     surf and the orbit.</li>
 * <li>{@link hadur2.core.move.MirrorDrive}: while the enemy mirrors us (MIR-1), straight
 *     runs planned at least 110 ticks ahead and followed exactly, and the aim at the
 *     reflection of that plan.</li>
 * <li>{@link hadur2.core.move.BulletShadows} and {@link hadur2.core.move.OurBullet}: the
 *     geometry of MOVE-1, following the engine's order of play: all bullets move before any
 *     robot, in straight segments, one at a time in a random order.</li>
 * <li>{@link hadur2.core.move.SimpleFormula}, {@link hadur2.core.move.MoveFormula} and
 *     {@link hadur2.core.move.FlattenerFormula}: the danger views' feature spaces, each
 *     scaling attributes of our own movement on an enemy wave's fire tick to about
 *     [0, 1].</li>
 * </ul>
 *
 * <p>{@code HadurCore} drives the package only in the duel posture; in melee the melee
 * brain moves the robot instead. Angles are radians on Robocode's compass (0 north,
 * clockwise), distances px, times ticks, and guess factors the firing angle's offset from
 * the wave's bearing to us, signed by our orbit direction, over the maximum escape
 * angle.</p>
 *
 * <p>The package uses only the model, physics and knn packages and the JDK's
 * {@code java.lang}, {@code java.util} and {@code java.awt.geom}. The ArchUnit rules forbid
 * it to depend on the gun package (gun and movement are independent), on melee, memory,
 * adapt, policy or posture, or on {@code robocode.*} (CORE-1). Decisions
 * from those packages (the opening, the distance, the flavour, the tick budget) reach it
 * only through its setters, called by {@code HadurCore}. Like the rest of the core it holds
 * no mutable statics (CORE-2) and no randomness, threads, reflection or I/O (RES-6), and
 * its sources are pinned by the duel identity check.</p>
 */
package hadur2.core.move;
