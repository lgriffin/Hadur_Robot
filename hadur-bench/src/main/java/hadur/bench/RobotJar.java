package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Where the built robot lives and which release it is, so that no bench default lags the
 * project version (issue #102). The release comes from {@code hadur-robot/pom.xml}'s
 * {@code robot.release} property, which is what names the jars; when the pom cannot be
 * read (the bench run from somewhere else), the newest built jar's name stands in.
 */
final class RobotJar {

    /** The robot module's build directory, relative to {@code hadur-bench/}. */
    static final String TARGET = "../hadur-robot/target";

    private static final Pattern RELEASE = Pattern.compile("<robot\\.release>\\s*([^<\\s]+)\\s*</robot\\.release>");
    /**
     * The robot's package today. Builds before the 2026-10-27 rename (3.18 and older) are in
     * {@code hadur2}; the jars of those builds are still read, so a bench can arm them.
     */
    static final String PACKAGE = "hadur117";

    /** The packages a robot jar can be in, newest first. */
    static final java.util.List<String> PACKAGES = java.util.List.of(PACKAGE, "hadur2");

    private static final Pattern JAR = Pattern.compile("^(?:hadur117|hadur2)\\.Hadur_([0-9][^/\\\\]*)\\.jar$");
    private static final Pattern TEAM_JAR = Pattern.compile("^(hadur117|hadur2)\\.HadurTeam_([0-9][^/\\\\]*)\\.jar$");

    private RobotJar() {}

    /**
     * The robot's release: {@code robot.release} from the robot pom beside the bench, else
     * the newest {@code <package>.Hadur_<release>.jar} built, else {@code "dev"} so a default
     * still forms (the jar check at install time then says what is missing).
     */
    static String release(Path benchDir) {
        String fromPom = releaseFromPom(benchDir.resolve("../hadur-robot/pom.xml"));
        if (fromPom != null) return fromPom;
        Path jar = newestJar(benchDir.resolve(TARGET));
        if (jar != null) return versionOf(jar.getFileName().toString());
        return "dev";
    }

    /** The release the pom names, or null when the file is missing or names none. */
    static String releaseFromPom(Path pom) {
        try {
            return Files.isRegularFile(pom) ? releaseFromPom(Files.readString(pom)) : null;
        } catch (IOException e) {
            return null;
        }
    }

    /** The release in a pom's text, or null when it names none. */
    static String releaseFromPom(String pomXml) {
        Matcher m = RELEASE.matcher(pomXml);
        return m.find() ? m.group(1) : null;
    }

    /** The newest {@code <package>.Hadur_<release>.jar} in {@code target}, or null when there is none. */
    static Path newestJar(Path target) {
        if (!Files.isDirectory(target)) return null;
        try (Stream<Path> files = Files.list(target)) {
            return files.filter(f -> JAR.matcher(f.getFileName().toString()).matches())
                .max(Comparator.comparingLong(f -> f.toFile().lastModified()))
                .orElse(null);
        } catch (IOException e) {
            return null;
        }
    }

    /** {@code hadur117.Hadur_3.8.jar} (or {@code hadur2.Hadur_3.8.jar}) is release {@code 3.8}; null when the name is not a robot jar's. */
    static String versionOf(String jarName) {
        Matcher m = JAR.matcher(jarName);
        return m.matches() ? m.group(1) : null;
    }

    /**
     * The robot a jar holds, as Robocode will list it ({@code hadur117.Hadur 3.8}): from the
     * {@code robot.classname} and {@code robot.version} in its {@code <package>/Hadur.properties},
     * else from a {@code <package>.Hadur_<release>.jar} file name; null when neither says.
     */
    static String nameOf(Path jar) {
        if (jar == null || !Files.isRegularFile(jar)) return null;
        try (java.util.jar.JarFile in = new java.util.jar.JarFile(jar.toFile())) {
            for (String pkg : PACKAGES) {
                java.util.jar.JarEntry e = in.getJarEntry(pkg + "/Hadur.properties");
                if (e == null) continue;
                java.util.Properties props = new java.util.Properties();
                try (java.io.InputStream s = in.getInputStream(e)) {
                    props.load(s);
                }
                String cls = props.getProperty("robot.classname");
                String version = props.getProperty("robot.version");
                if (cls != null && version != null) return cls.trim() + " " + version.trim();
            }
        } catch (IOException ignored) {
            // Not a readable jar: fall through to the name.
        }
        String file = jar.getFileName().toString();
        String version = versionOf(file);
        return version == null ? null : file.substring(0, file.indexOf('.')) + ".Hadur " + version;
    }

    /** {@code bisect/hadur2.HadurTeam_3.17.1.jar} is {@code hadur2.HadurTeam 3.17.1}; null when the name is not a team jar's. */
    static String teamNameOf(String jarPath) {
        Matcher m = TEAM_JAR.matcher(Path.of(jarPath).getFileName().toString());
        return m.matches() ? m.group(1) + ".HadurTeam " + m.group(2) : null;
    }

    /** The package of a robot name as Robocode lists it: {@code hadur117} for {@code hadur117.HadurTeam 3.18}. */
    static String packageOf(String robotName) {
        String cls = robotName.split(" ")[0];
        int dot = cls.lastIndexOf('.');
        return dot < 0 ? PACKAGE : cls.substring(0, dot);
    }

    /** The team member of a team name: {@code hadur117.Hadur} for {@code hadur117.HadurTeam 3.18}. */
    static String memberOf(String teamName) {
        return packageOf(teamName) + ".Hadur";
    }

    /**
     * The baseline team's member: the candidate's when both teams share a package, else the
     * baseline's own ({@code --member} names the candidate's, so a hadur2 baseline keeps hadur2.Hadur).
     */
    static String baselineMember(String member, String baselineRobot) {
        if (baselineRobot == null || packageOf(member).equals(packageOf(baselineRobot))) return member;
        return memberOf(baselineRobot);
    }

    /** The default {@code --robot-jar}: the built solo jar of the release. */
    static String soloJar(String release) {
        return TARGET + "/" + PACKAGE + ".Hadur_" + release + ".jar";
    }

    /** The default team jar of the release (A5). */
    static String teamJar(String release) {
        return TARGET + "/" + PACKAGE + ".HadurTeam_" + release + ".jar";
    }

    /** The recorder jar, named by the Maven module version, not the release. */
    static String recorderJar() {
        return TARGET + "/hadur-robot-2.0-SNAPSHOT-recorder.jar";
    }
}
