package hadur.bench;

import com.sun.management.GarbageCollectionNotificationInfo;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.management.NotificationEmitter;
import javax.management.openmbean.CompositeData;
import robocode.BattleResults;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;

/**
 * BENCH-6: runs a list of battles one after another through ONE engine in this JVM, the
 * way a rumble client does, and writes a {@code result.csv} per battle plus one
 * {@code session.csv} row per battle as it goes, so a session that dies still leaves its
 * rows.
 *
 * <p>Arguments: robocode home, session directory, rounds, field width, field height, our
 * robot name, the opponent list file (one robot name per line, optionally {@code index} of
 * the first battle after a tab), {@code wipe}.</p>
 */
public final class SessionRunner {

    static final String HEADER = "index,opponent,ok,heapAfterGcMb,longestPauseMs,loadedClasses,"
        + "unloadedClasses,engineDisables,duressTicks,seconds";

    private SessionRunner() {}

    public static void main(String[] args) throws Exception {
        File home = new File(args[0]);
        Path sessionDir = Path.of(args[1]);
        int rounds = Integer.parseInt(args[2]);
        int width = Integer.parseInt(args[3]);
        int height = Integer.parseInt(args[4]);
        String us = args[5];
        List<String> lines = Files.readAllLines(Path.of(args[6]));
        boolean wipe = Boolean.parseBoolean(args[7]);
        Files.createDirectories(sessionDir);
        Path csv = sessionDir.resolve("session.csv");
        if (!Files.exists(csv)) Files.writeString(csv, HEADER + "\n");

        long[] longestPauseNanos = new long[1];
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            ((NotificationEmitter) gc).addNotificationListener((n, hb) -> {
                if (!GarbageCollectionNotificationInfo.GARBAGE_COLLECTION_NOTIFICATION.equals(n.getType())) return;
                GarbageCollectionNotificationInfo info =
                    GarbageCollectionNotificationInfo.from((CompositeData) n.getUserData());
                // The bench's own System.gc() between battles is not a pause the battle saw.
                if ("System.gc()".equals(info.getGcCause())) return;
                synchronized (longestPauseNanos) {
                    longestPauseNanos[0] = Math.max(longestPauseNanos[0], info.getGcInfo().getDuration() * 1_000_000L);
                }
            }, null, null);
        }

        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        ClassLoadingMXBean classes = ManagementFactory.getClassLoadingMXBean();
        for (String line : lines) {
            String[] f = line.split("\t");
            String them = f[0].trim();
            if (them.isEmpty()) continue;
            int index = f.length > 1 ? Integer.parseInt(f[1].trim()) : 0;
            Path dir = sessionDir.resolve(String.format("%04d-%s", index, slug(them)));
            long start = System.nanoTime();
            if (wipe) wipeData(home.toPath().resolve("robots/.data"));
            Outcome o = battle(engine, dir, rounds, width, height, us, them);
            synchronized (longestPauseNanos) {
                double pauseMs = longestPauseNanos[0] / 1e6;
                longestPauseNanos[0] = 0;
                // A full collection first, so the heap figure is the live set, not the
                // garbage the next young collection would have taken.
                System.gc();
                Runtime rt = Runtime.getRuntime();
                double heapMb = (rt.totalMemory() - rt.freeMemory()) / 1048576.0;
                String row = String.format(java.util.Locale.ROOT, "%d,%s,%s,%.1f,%.1f,%d,%d,%d,%d,%.0f%n", index,
                    them.replace(',', ' '), o.ok, heapMb, pauseMs, classes.getLoadedClassCount(),
                    classes.getUnloadedClassCount(), o.disables, o.duressTicks,
                    (System.nanoTime() - start) / 1e9);
                Files.writeString(csv, row, StandardOpenOption.APPEND);
                System.out.print(row);
            }
        }
        engine.close();
        System.exit(0);
    }

    private record Outcome(boolean ok, int disables, int duressTicks) {}

    private static Outcome battle(RobocodeEngine engine, Path dir, int rounds, int width, int height,
                                  String us, String them) throws IOException {
        Files.createDirectories(dir);
        BattleResults[] ours = new BattleResults[1];
        BattleResults[] theirs = new BattleResults[1];
        StringBuilder errors = new StringBuilder();
        LogHarvester harvester = new LogHarvester(dir, us);
        BattleAdaptor listener = new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                for (BattleResults r : e.getSortedResults()) {
                    if (r.getTeamLeaderName().equals(us)) ours[0] = r;
                    else theirs[0] = r;
                }
            }

            @Override
            public void onBattleError(BattleErrorEvent e) {
                if (!e.getError().contains("window manager") && !e.getError().contains("GUI")) {
                    errors.append(e.getError().replace('\n', ' ')).append(' ');
                }
            }
        };
        engine.addBattleListener(listener);
        engine.addBattleListener(harvester);
        boolean ok = false;
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(dir.resolve("result.csv")))) {
            out.println(BattleResult.HEADER);
            RobotSpecification[] robots = engine.getLocalRepository(us + "," + them);
            if (robots.length != 2) {
                out.println(BattleResult.failed("expected 2 robots, found " + robots.length + " for " + them));
            } else {
                engine.runBattle(new BattleSpecification(rounds,
                    new BattlefieldSpecification(width, height), robots), true);
                harvester.close();
                if (ours[0] == null || theirs[0] == null) {
                    out.println(BattleResult.failed("no results " + errors));
                } else {
                    out.println(BattleResult.of(ours[0], theirs[0], rounds, harvester, errors.toString()).toCsv());
                    ok = true;
                }
            }
        } finally {
            harvester.close();
            engine.removeBattleListener(harvester);
            engine.removeBattleListener(listener);
        }
        // The truth log is megabytes a battle; a 300-battle session has no use for it.
        Files.deleteIfExists(dir.resolve("truth.log.gz"));
        return new Outcome(ok, harvester.engineDisables(), harvester.duressTicks());
    }

    static String slug(String name) {
        return name.replaceAll("[^A-Za-z0-9.]+", "_");
    }

    private static void wipeData(Path data) throws IOException {
        if (!Files.exists(data)) return;
        try (Stream<Path> files = Files.walk(data)) {
            for (Path f : (Iterable<Path>) files.sorted(Comparator.reverseOrder())::iterator) {
                Files.delete(f);
            }
        }
    }
}
