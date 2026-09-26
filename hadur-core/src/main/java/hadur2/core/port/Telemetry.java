package hadur2.core.port;

/**
 * Where the core sends telemetry lines (the artifact's CSV record format). The robot
 * adapter prints them to the console; tests collect them. The core itself does no I/O.
 */
@FunctionalInterface
public interface Telemetry {

    Telemetry NONE = line -> { };

    void emit(String line);
}
