/**
 * The core's outbound ports: the only ways it reaches anything outside plain computation.
 *
 * <ul>
 * <li>{@link hadur2.core.port.Telemetry} takes the core's CSV records ({@code V},
 * {@code B}, {@code EW}, {@code P}, {@code MEM}, {@code FAULT}, {@code R}, {@code M}).
 * The robot prints them; tests and the bench collect them.</li>
 * <li>{@link hadur2.core.port.ProfileStore} holds opponent profiles between battles as
 * named byte blobs under a quota. It is deliberately dumb: the {@code memory} package's
 * {@code ProfileLibrary} owns the format, the checksums, crash-safe replacement (RES-3),
 * eviction (MEM-5) and turning storage failures into an empty profile (MEM-4).</li>
 * <li>{@link hadur2.core.port.MemoryProfileStore} is the in-memory store for tests and the
 * bench; it can cut a write short at any byte, so RES-3 is tested without files. The
 * file-backed adapter, {@code hadur2.FileProfileStore}, lives in the robot module, because
 * it needs Robocode's data directory and file I/O.</li>
 * </ul>
 *
 * <p>Ports exist so the core keeps its rules: no {@code robocode.*} (CORE-1) and no I/O or
 * clock (RES-6) inside the core, with the adapter supplying the real implementations.
 * ArchUnit ({@code ArchitectureTest}) forbids this package to depend on the gun, movement
 * or replay packages; it uses nothing beyond {@code java.util}. Opponent memory reaches
 * storage only through {@code ProfileStore} (the rule tagged MEM-3).</p>
 */
package hadur2.core.port;
