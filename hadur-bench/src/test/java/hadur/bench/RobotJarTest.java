package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * BENCH-12: the robot release the bench defaults to (issue #102) must track
 * {@code hadur-robot/pom.xml} when present, and otherwise fall back sensibly.
 */
@Tag("BENCH-12")
class RobotJarTest {

    @Test
    @DisplayName("releaseFromPom finds the robot.release property")
    void releaseFromPomFindsTheProperty() {
        String pom = "<project><properties><robot.release>3.8</robot.release></properties></project>";
        assertEquals("3.8", RobotJar.releaseFromPom(pom));
    }

    @Test
    @DisplayName("releaseFromPom is null when the pom names no release")
    void releaseFromPomIsNullWithoutTheProperty() {
        String pom = "<project><properties><other>3.8</other></properties></project>";
        assertNull(RobotJar.releaseFromPom(pom));
    }

    @Test
    @DisplayName("versionOf reads the release out of a solo jar name")
    void versionOfReadsASoloJarName() {
        assertEquals("3.8", RobotJar.versionOf("hadur2.Hadur_3.8.jar"));
    }

    @Test
    @DisplayName("versionOf keeps a suffixed release")
    void versionOfKeepsASuffixedRelease() {
        assertEquals("3.8.4-on", RobotJar.versionOf("hadur2.Hadur_3.8.4-on.jar"));
    }

    @Test
    @DisplayName("versionOf is null for a team jar name")
    void versionOfIsNullForATeamJarName() {
        assertNull(RobotJar.versionOf("hadur2.HadurTeam_3.8.jar"));
    }

    @Test
    @DisplayName("versionOf is null for an original-prefixed jar name")
    void versionOfIsNullForAnOriginalPrefixedName() {
        assertNull(RobotJar.versionOf("original-hadur2.Hadur_3.8.jar"));
    }

    @Test
    @DisplayName("newestJar is null for an empty directory")
    void newestJarIsNullForAnEmptyDirectory(@TempDir Path target) {
        assertNull(RobotJar.newestJar(target));
    }

    @Test
    @DisplayName("newestJar picks the most recently modified robot jar")
    void newestJarPicksTheMostRecentlyModified(@TempDir Path target) throws IOException {
        Path older = Files.createFile(target.resolve("hadur2.Hadur_3.7.jar"));
        Path newer = Files.createFile(target.resolve("hadur2.Hadur_3.8.jar"));
        Files.setLastModifiedTime(older, FileTime.fromMillis(System.currentTimeMillis() - 60_000));
        assertEquals(newer, RobotJar.newestJar(target));
    }

    @Test
    @DisplayName("newestJar is null for a directory that does not exist")
    void newestJarIsNullForAMissingDirectory(@TempDir Path target) {
        assertNull(RobotJar.newestJar(target.resolve("nope")));
    }

    @Test
    @DisplayName("release reads the robot pom beside the bench when present")
    void releaseReadsThePomBesideTheBench(@TempDir Path tmp) throws IOException {
        Path benchDir = Files.createDirectories(tmp.resolve("bench"));
        Path robotDir = Files.createDirectories(tmp.resolve("hadur-robot"));
        Files.writeString(robotDir.resolve("pom.xml"), "<robot.release>9.9</robot.release>");
        assertEquals("9.9", RobotJar.release(benchDir));
    }

    @Test
    @DisplayName("release falls back to dev with no pom and no built jars")
    void releaseFallsBackToDevWithNoPomOrJars(@TempDir Path tmp) throws IOException {
        Path benchDir = Files.createDirectories(tmp.resolve("bench"));
        assertEquals("dev", RobotJar.release(benchDir));
    }

    @Test
    @DisplayName("soloJar names the solo robot jar for the release")
    void soloJarNamesTheSoloJar() {
        assertTrue(RobotJar.soloJar("3.8").endsWith("hadur2.Hadur_3.8.jar"));
    }

    @Test
    @DisplayName("teamJar names the team robot jar for the release")
    void teamJarNamesTheTeamJar() {
        assertTrue(RobotJar.teamJar("3.8").endsWith("hadur2.HadurTeam_3.8.jar"));
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("nameOf reads the robot's name and version from the jar's properties, else from its file name")
    void nameOfReadsTheJar(@org.junit.jupiter.api.io.TempDir java.nio.file.Path tmp) throws Exception {
        java.nio.file.Path jar = tmp.resolve("whatever.jar");
        try (java.util.jar.JarOutputStream out = new java.util.jar.JarOutputStream(java.nio.file.Files.newOutputStream(jar))) {
            out.putNextEntry(new java.util.jar.JarEntry("hadur2/Hadur.properties"));
            out.write(String.join(System.lineSeparator(), "robot.classname=hadur2.Hadur", "robot.version=9.1", "")
                .getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            out.closeEntry();
        }
        assertEquals("hadur2.Hadur 9.1", RobotJar.nameOf(jar));
        java.nio.file.Path named = tmp.resolve("hadur2.Hadur_3.7.jar");
        java.nio.file.Files.writeString(named, "not a jar");
        assertEquals("hadur2.Hadur 3.7", RobotJar.nameOf(named));
        assertNull(RobotJar.nameOf(tmp.resolve("missing.jar")));
        java.nio.file.Files.writeString(tmp.resolve("other.jar"), "not a jar");
        assertNull(RobotJar.nameOf(tmp.resolve("other.jar")));
    }
}
