/**
 * The interfaces through which the core talks to the outside world: {@link hadurling.core.port.Telemetry}
 * for log lines and {@link hadurling.core.port.ProfileStore} for saved profiles. The adapter
 * implements them; the core only calls them. {@link hadurling.core.port.MemoryProfileStore} is
 * an in-memory version for tests. This package depends on nothing else of Hadurling's.
 */
package hadurling.core.port;
