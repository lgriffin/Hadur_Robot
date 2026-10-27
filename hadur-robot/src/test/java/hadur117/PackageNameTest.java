package hadur117;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** NAME-1: the family is in Leigh's package, hadur117, as Saor is. */
class PackageNameTest {

    @Test
    @Tag("NAME-1")
    @DisplayName("the robot, the recorder, the team and the core are in hadur117")
    void hadur117() throws IOException {
        assertEquals("hadur117", Hadur.class.getPackageName());
        assertEquals("hadur117", HadurRecorder.class.getPackageName());
        assertEquals("hadur117.core", hadur117.core.HadurCore.class.getPackageName());
        Properties robot = new Properties();
        try (InputStream in = Hadur.class.getResourceAsStream("/hadur117/Hadur.properties")) {
            robot.load(in);
        }
        assertEquals("hadur117.Hadur", robot.getProperty("robot.classname"));
        Properties team = new Properties();
        try (Reader in = Files.newBufferedReader(Path.of("src/team/HadurTeam.team"), StandardCharsets.ISO_8859_1)) {
            team.load(in);
        }
        for (String member : team.getProperty("team.members").split(",")) {
            assertTrue(member.startsWith("hadur117.Hadur "), member);
        }
    }
}
