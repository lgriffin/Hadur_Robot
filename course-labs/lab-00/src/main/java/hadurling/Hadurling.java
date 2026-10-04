package hadurling;

import robocode.AdvancedRobot;

/**
 * Hadurling, lab 00: the smallest robot that Robocode will load.
 *
 * <p>It does one thing, spin the radar forever, so you can check that your tools build a
 * robot jar and that Robocode runs it. Every later lab grows this class.</p>
 */
public class Hadurling extends AdvancedRobot {

    /** The engine calls this once per round, on the robot's own thread. */
    @Override
    public void run() {
        while (true) {
            // Turn the radar a full turn; execute() ends the tick and lets the engine move on.
            setTurnRadarRight(360);
            execute();
        }
    }
}
