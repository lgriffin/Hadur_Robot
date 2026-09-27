/**
 * The Robocode adapter: the only code in Hadur 2 that sees the engine.
 *
 * <p>The architecture is hexagonal. All strategy lives in {@code hadur2.core}, which
 * imports nothing from {@code robocode.*} (CORE-1) and sees only plain values. This
 * package is the thin shell around it:</p>
 *
 * <ul>
 * <li>{@link hadur2.Hadur} is the robot. Each engine event handler
 *     ({@code onScannedRobot}, {@code onHitByBullet}, ...) turns the event into a
 *     {@link hadur2.core.model.BotEvent} and queues it; each turn the run loop reads the
 *     getters into a {@link hadur2.core.model.BotInput} with the queued events, passes it
 *     to the core through {@link hadur2.core.Guard}, and turns the returned
 *     {@link hadur2.core.model.BotOrders} back into {@code setTurnRightRadians},
 *     {@code setAhead}, {@code setMaxVelocity}, {@code setTurnGunRightRadians},
 *     {@code setTurnRadarRightRadians} and {@code setFire} calls before
 *     {@code execute()}. A NaN order leaves that setting alone and a fire power of 0 holds
 *     fire. Angles pass through unchanged in radians, Robocode's convention (0 = north,
 *     clockwise); distances are in px.</li>
 * <li>{@code FileProfileStore} is the {@link hadur2.core.port.ProfileStore} port on the
 *     robot's data directory, where opponent profiles live between battles.</li>
 * <li>{@link hadur2.HadurRecorder} is the robot plus a transcript of every input and
 *     order in {@code hadur2.core.replay}'s line format, for replay fixtures (CORE-2).
 *     It is left out of the competition jar.</li>
 * </ul>
 *
 * <h2>Faults (RES-1)</h2>
 *
 * <p>The adapter never calls the core directly: every tick goes through
 * {@link hadur2.core.Guard#tick}, which catches anything the core throws (or a null
 * result), records the fault, and returns the safe order set for that tick (full speed on
 * the current direction of travel, body side-on to the enemy's last bearing, hold fire,
 * radar on that bearing or sweeping). The adapter applies those orders like any others, so
 * the robot keeps moving and scanning while the core is down.</p>
 *
 * <h2>Java version (REL-1)</h2>
 *
 * <p>The module is compiled for Java 11 (the build's {@code maven.compiler.release}), like
 * the core it shades in, because RoboRumble clients run whatever Java their owners
 * installed. Main code therefore avoids records, sealed types and pattern matching;
 * {@code Path.of}, which the recorder uses, is Java 11 API.</p>
 *
 * <h2>Robocode's sandbox and the profile files (RES-3)</h2>
 *
 * <p>Robocode runs a robot under a security manager. A robot may read files in its own
 * data directory, but may write only through {@code robocode.RobocodeFileOutputStream},
 * only inside that directory, and only within its data quota; renaming a file is
 * punished. So the usual crash-safe "write a temporary file, then rename it over the old
 * one" is not available. Instead the core's {@code ProfileLibrary} writes the temporary
 * copy, then the profile, then deletes the copy, and a load takes whichever passes its
 * checksum (RES-3); {@code FileProfileStore} only moves bytes. Robocode also charges the
 * quota for bytes written and refunds a file's length only when it is reopened for
 * writing, so the store empties a file through the stream before deleting it.</p>
 *
 * <p>File work happens at safe moments: the profile store is set up and the battle clock
 * read in {@code run()} before the first tick, a profile is loaded at the first scan
 * (MEM-1), and it is saved in {@code onRoundEnded} while the robot is alive and in
 * {@code onBattleEnded} (MEM-3), never in {@code onWin} or {@code onDeath}.</p>
 *
 * <p>This package may use {@code robocode.*}, {@code java.io} and the clock
 * ({@code System.nanoTime}, to measure the core's tick for TIME-1); the ArchUnit rules
 * that forbid them apply to {@code hadur2.core} only.</p>
 */
package hadur2;
