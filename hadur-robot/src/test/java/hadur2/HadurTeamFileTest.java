package hadur2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Properties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** A5: the team jar's team file names five of the solo robot, at the solo robot's version. */
class HadurTeamFileTest {

    @Test
    @DisplayName("the team is five hadur2.Hadur at the robot's version, and carries that version")
    void teamMatchesTheRobot() throws IOException {
        Properties robot = new Properties();
        try (InputStream in = Hadur.class.getResourceAsStream("/hadur2/Hadur.properties")) {
            robot.load(in);
        }
        String version = robot.getProperty("robot.version");
        Properties team = new Properties();
        try (Reader in = Files.newBufferedReader(Path.of("src/team/HadurTeam.team"), StandardCharsets.ISO_8859_1)) {
            team.load(in);
        }
        assertEquals(version, team.getProperty("team.version"));
        assertEquals(String.join(",", Collections.nCopies(5, "hadur2.Hadur " + version)),
            team.getProperty("team.members"));
    }
}
