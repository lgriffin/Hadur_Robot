package hadurling.core.port;

/**
 * Where the core sends its log lines. A <em>port</em>: the core says what it needs (somewhere
 * to put a line of text) and the adapter decides what that is. In the robot it is the
 * robot's console; in a test it is a list.
 */
@FunctionalInterface
public interface Telemetry {

    /** Discards every line. */
    Telemetry NONE = line -> { };

    /**
     * Records one line.
     *
     * @param line a single line of text, without a line terminator
     */
    void emit(String line);
}
