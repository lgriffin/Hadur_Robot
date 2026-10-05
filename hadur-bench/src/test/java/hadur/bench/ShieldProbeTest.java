package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * BENCH-11: the shield probe repacks the candidate jar twice, with every opponent of the set on
 * the shield list and with nobody on it, under two robot versions, and reports the paired
 * difference per opponent and the weighted mean.
 */
@Tag("BENCH-11")
class ShieldProbeTest {

    @TempDir
    Path tmp;

    private Path fakeRobotJar(boolean withList) throws IOException {
        Path jar = tmp.resolve("hadur2.Hadur_3.8.jar");
        try (JarOutputStream out = new JarOutputStream(Files.newOutputStream(jar))) {
            put(out, "hadur2/Hadur.class", "classbytes");
            put(out, "hadur2/Hadur.properties",
                "#Robocode Robot Properties\nrobot.classname=hadur2.Hadur\nrobot.version=3.8\nrobocode.version=1.9.3.0\n");
            if (withList) put(out, ShieldProbe.LIST_ENTRY, "oldlist");
        }
        return jar;
    }

    private static void put(JarOutputStream out, String name, String text) throws IOException {
        out.putNextEntry(new JarEntry(name));
        out.write(text.getBytes(StandardCharsets.ISO_8859_1));
        out.closeEntry();
    }

    private static String read(Path jar, String entry) throws IOException {
        try (JarFile f = new JarFile(jar.toFile())) {
            return new String(f.getInputStream(f.getEntry(entry)).readAllBytes(), StandardCharsets.ISO_8859_1);
        }
    }

    /** The entries the repacked jar's {@code hadur2.ShieldListData} returns, loaded as the robot would. */
    private static List<String> listOf(Path jar) throws Exception {
        byte[] bytes;
        try (JarFile f = new JarFile(jar.toFile())) {
            bytes = f.getInputStream(f.getEntry(ShieldProbe.LIST_ENTRY)).readAllBytes();
        }
        ClassLoader loader = new ClassLoader(null) {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                if (!name.equals("hadur2.ShieldListData")) throw new ClassNotFoundException(name);
                return defineClass(name, bytes, 0, bytes.length);
            }
        };
        java.lang.reflect.Method m = loader.loadClass("hadur2.ShieldListData").getDeclaredMethod("lines");
        m.setAccessible(true);
        return List.of((String[]) m.invoke(null));
    }

    private Path probeSet() throws IOException {
        Path set = tmp.resolve("probe.txt");
        Files.writeString(set, "# a probe set\n"
            + "apv.test.Virus 0.6.1 | shield-under-70 | apv.test.Virus_0.6.1.jar | 0.01289\n"
            + "cx.micro.Smoke 0.96 | shield-70-80 | cx.micro.Smoke_0.96.jar | 0.02474\n");
        return set;
    }

    @Test
    @DisplayName("repacking replaces the list and the version and copies the rest")
    void repackReplacesListAndVersion() throws Exception {
        Path source = fakeRobotJar(true);
        Path target = tmp.resolve("on.jar");
        ShieldProbe.repack(source, target, "3.8-on", "apv.test.Virus 0.6.1\n");
        assertEquals(List.of("apv.test.Virus 0.6.1"), listOf(target));
        String props = read(target, ShieldProbe.PROPERTIES_ENTRY);
        assertTrue(props.contains("robot.version=3.8-on\n"), props);
        assertFalse(props.contains("robot.version=3.8\n"));
        assertTrue(props.contains("robot.classname=hadur2.Hadur\n"), "the rest of the properties stay");
        assertEquals("classbytes", read(target, "hadur2/Hadur.class"));
    }

    @Test
    @DisplayName("a jar with no shield list predates shield mode and is refused")
    void refusesAJarWithoutAList() throws IOException {
        Path source = fakeRobotJar(false);
        IllegalStateException e = assertThrows(IllegalStateException.class,
            () -> ShieldProbe.repack(source, tmp.resolve("x.jar"), "3.8-on", "x\n"));
        assertTrue(e.getMessage().contains("shield list"), e.getMessage());
        assertFalse(Files.exists(tmp.resolve("x.jar")), "no half-written jar is left");
    }

    @Test
    @DisplayName("the on list names every opponent of the set, the off list nobody")
    void onAndOffLists() throws Exception {
        List<Opponent> set = Opponent.load(probeSet());
        String on = ShieldProbe.listFor(set);
        assertTrue(on.contains("apv.test.Virus 0.6.1\n"));
        assertTrue(on.contains("cx.micro.Smoke 0.96\n"));
        assertTrue(ShieldProbe.emptyList().lines().allMatch(l -> l.startsWith("#")));
        Path jar = fakeRobotJar(true);
        ShieldProbe.repack(jar, tmp.resolve("odd.jar"), "3.8-on", "a.b.C \"q\" \\ x\n# c\n\n  d.E  \n");
        assertEquals(List.of("a.b.C \"q\" \\ x", "d.E"), listOf(tmp.resolve("odd.jar")),
            "quotes and backslashes survive, comments and blanks drop out, entries are trimmed");
    }

    @Test
    @DisplayName("--shield-probe becomes a paired run of two distinct robots over the probe's set")
    void prepareFillsInThePairedOptions() throws Exception {
        Path jar = fakeRobotJar(true);
        Path set = probeSet();
        Map<String, String> opts = new HashMap<>();
        opts.put("shield-probe", set.toString());
        opts.put("robot-jar", jar.toString());
        opts.put("out", tmp.resolve("out").toString());
        ShieldProbe.prepare(opts, tmp);

        assertEquals("hadur2.Hadur 3.8-on", opts.get("robot"));
        assertEquals("hadur2.Hadur 3.8-off", opts.get("baseline-robot"));
        assertEquals(set.toString(), opts.get("set"));
        Path on = Path.of(opts.get("robot-jar"));
        Path off = Path.of(opts.get("baseline"));
        assertEquals(List.of("apv.test.Virus 0.6.1", "cx.micro.Smoke 0.96"), listOf(on));
        assertEquals(List.of(), listOf(off), "the off jar's list is empty");
        assertTrue(read(on, ShieldProbe.PROPERTIES_ENTRY).contains("robot.version=3.8-on"));
        assertTrue(read(off, ShieldProbe.PROPERTIES_ENTRY).contains("robot.version=3.8-off"));
    }

    @Test
    @DisplayName("Bench takes --shield-probe on its own: two distinct robots, so BENCH-2 accepts the pair")
    void benchAcceptsTheOption() throws IOException {
        Map<String, String> opts = new HashMap<>();
        opts.put("shield-probe", probeSet().toString());
        opts.put("robot-jar", fakeRobotJar(true).toString());
        opts.put("out", tmp.resolve("out2").toString());
        new Bench(opts); // does not throw
        assertEquals("hadur2.Hadur 3.8-on", opts.get("robot"));
        assertEquals("hadur2.Hadur 3.8-off", opts.get("baseline-robot"));
        assertTrue(Files.isRegularFile(Path.of(opts.get("baseline"))));
    }

    @Test
    @DisplayName("--shield-probe makes its own baseline and refuses a second one")
    void refusesABaseline() throws IOException {
        Map<String, String> opts = new HashMap<>();
        opts.put("shield-probe", probeSet().toString());
        opts.put("baseline", "/tmp/x.jar");
        assertThrows(IllegalArgumentException.class, () -> ShieldProbe.prepare(opts, tmp));
    }

    @Test
    @DisplayName("without --shield-probe the options are left alone")
    void absentMeansNothing() throws IOException {
        Map<String, String> opts = Map.of("rounds", "5");
        ShieldProbe.prepare(opts, tmp);
        assertEquals(Map.of("rounds", "5"), opts);
    }

    @Test
    @DisplayName("the SH and SR records of an on battle are summed")
    void activityFromTheLog() throws IOException {
        Path log = tmp.resolve("hadur.log");
        Files.write(log, List.of(
            "0,3,B,0,3,x,y",
            "0,3,SH,0,3,on",
            "0,500,SR,0,500,12,9,1,0,2,4.0,21.2,-",
            "1,3,SH,1,3,on",
            "1,40,SH,1,40,exit,close",
            "1,500,SR,1,500,3,1,2,1,0,12.0,31.8,close",
            "2,9,SH,2,9,off,budget",
            "2,500,SR,2,500,0,0,0,0,0,40.0,10.0,budget"));
        ShieldProbe.Activity a = new ShieldProbe.Activity();
        a.add(log);
        assertEquals(2, a.roundsOn);
        assertEquals(15, a.shieldShots);
        assertEquals(10, a.intercepts);
        assertEquals(3, a.hitsTaken);
        assertEquals(2, a.attackShots);
        assertEquals(1, a.battlesOff);
        assertEquals(Map.of("close", 1), a.exits);
        // A battle with no log adds nothing.
        a.add(tmp.resolve("missing.log"));
        assertEquals(15, a.shieldShots);
    }

    private static BattleResult share(double share) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.score = share * 100;
        r.theirScore = (1 - share) * 100;
        return r;
    }

    @Test
    @DisplayName("the report gives the paired difference, a verdict per opponent and the weighted mean")
    void reportShowsDifferencesVerdictsAndTheWeightedMean() throws IOException {
        Opponent wins = new Opponent("a.Wins 1.0", "x", "a.Wins_1.0.jar", 0.3);
        Opponent loses = new Opponent("b.Loses 1.0", "x", "b.Loses_1.0.jar", 0.1);
        Opponent open = new Opponent("c.Open 1.0", "x", "c.Open_1.0.jar", 0.1);
        Map<Opponent, List<BattleResult>> on = new LinkedHashMap<>();
        Map<Opponent, List<BattleResult>> off = new LinkedHashMap<>();
        on.put(wins, List.of(share(0.92), share(0.90), share(0.94), share(0.91)));
        off.put(wins, List.of(share(0.80), share(0.78), share(0.82), share(0.79)));
        on.put(loses, List.of(share(0.50), share(0.52), share(0.49), share(0.51)));
        off.put(loses, List.of(share(0.80), share(0.82), share(0.79), share(0.81)));
        on.put(open, List.of(share(0.70), share(0.90), share(0.60), share(0.85)));
        off.put(open, List.of(share(0.80), share(0.70), share(0.75), share(0.78)));

        String report = ShieldProbe.render(on, off, tmp.resolve("battles"), "hadur2.Hadur 3.8-on",
            "hadur2.Hadur 3.8-off");

        assertTrue(report.contains("Shield probe (BENCH-11)"), report);
        assertTrue(report.contains("| a.Wins 1.0 |") && report.contains("| wins |"), report);
        assertTrue(report.contains("| loses |"), report);
        assertTrue(report.contains("| open |"), report);
        assertTrue(report.contains("Weighted mean paired difference"), report);
        assertTrue(report.contains("```\na.Wins 1.0\n```"), "only the winner is offered for the list: " + report);
    }

    @Test
    @DisplayName("verdicts follow the interval of the paired difference")
    void verdicts() {
        assertEquals("wins", ShieldProbe.verdict(Stats.pairedDiff(List.of(0.9, 0.91, 0.92), List.of(0.8, 0.8, 0.8))));
        assertEquals("loses", ShieldProbe.verdict(Stats.pairedDiff(List.of(0.5, 0.51, 0.52), List.of(0.8, 0.8, 0.8))));
        assertEquals("open", ShieldProbe.verdict(Stats.pairedDiff(List.of(0.9), List.of(0.8))));
        assertEquals("n/a", ShieldProbe.verdict(Stats.pairedDiff(new ArrayList<>(), new ArrayList<>())));
    }
}
