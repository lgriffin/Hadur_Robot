package hadur2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.MessageEvent;
import robocode.TeamRobot;

/** A4: one class on all three ladders, so one memory serves them. */
class HadurTeamRobotTest {

    @Test
    @Tag("ROLE-1")
    @DisplayName("ROLE-1: the adapter is a TeamRobot, so it can read its roster before the first tick")
    void isATeamRobot() throws NoSuchMethodException {
        assertTrue(TeamRobot.class.isAssignableFrom(Hadur.class));
        assertTrue(TeamRobot.class.isAssignableFrom(HadurRecorder.class));
        // It hears teammates' messages itself rather than leaving the engine's no-op.
        assertTrue(Hadur.class.getDeclaredMethod("onMessageReceived", MessageEvent.class) != null);
    }
}
