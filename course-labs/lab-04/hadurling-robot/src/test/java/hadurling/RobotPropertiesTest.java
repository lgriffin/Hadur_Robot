package hadurling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.InputStream;
import java.util.Properties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robocode.AdvancedRobot;

/** Robocode finds a robot through its .properties file, so a typo there loses the robot. */
class RobotPropertiesTest {

    @Test
    @DisplayName("the properties file names a loadable AdvancedRobot")
    void propertiesNameTheRobot() throws Exception {
        Properties p = new Properties();
        try (InputStream in = getClass().getResourceAsStream("/hadurling/Hadurling.properties")) {
            assertNotNull(in, "hadurling/Hadurling.properties is missing");
            p.load(in);
        }
        assertEquals("hadurling.Hadurling", p.getProperty("robot.classname"));
        Class<?> robot = Class.forName(p.getProperty("robot.classname"));
        assertEquals(true, AdvancedRobot.class.isAssignableFrom(robot));
    }
}
