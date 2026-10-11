package hadur.bench;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import robocode.BattleResults;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.BattleCompletedEvent;

/**
 * Runs one melee battle in this JVM and writes {@code melee.csv} into the battle directory:
 * one row per robot in finishing order. Started by {@link Bench} in {@code --melee} mode.
 *
 * <p>Arguments: robocode home, battle directory, rounds, field width, field height, sentry
 * border size, then every robot's name as Robocode lists it, Hadur first. A
 * {@link MeleeHarvester} writes Hadur's console and a per-round table beside it. The
 * system property {@code hadur.sentries} lists the sentries' names, comma-separated.</p>
 */
public final class MeleeRunner {

    public static final String HEADER = "rank,robot,score,firsts,survival,bulletDamage";

    private MeleeRunner() {}

    public static void main(String[] args) throws Exception {
        File home = new File(args[0]);
        Path battleDir = Path.of(args[1]);
        int rounds = Integer.parseInt(args[2]);
        int width = Integer.parseInt(args[3]);
        int height = Integer.parseInt(args[4]);
        int sentryBorder = Integer.parseInt(args[5]);
        List<String> names = List.of(args).subList(6, args.length);
        Files.createDirectories(battleDir);

        JdkWarmup.run(); // BENCH-83: before any robot can be the first to need a JDK provider
        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        java.util.Set<String> sentries = new java.util.HashSet<>();
        for (String name : System.getProperty("hadur.sentries", "").split(",")) {
            if (!name.isBlank()) sentries.add(name);
        }
        MeleeHarvester harvester = new MeleeHarvester(battleDir, names.get(0), sentries);
        engine.addBattleListener(harvester);
        List<BattleResults> results = new ArrayList<>();
        engine.addBattleListener(new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                results.addAll(List.of(e.getSortedResults()));
            }
        });

        RobotSpecification[] robots = engine.getLocalRepository(String.join(",", names));
        int exit = 0;
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(battleDir.resolve("melee.csv")))) {
            out.println(HEADER);
            if (robots.length != names.size()) {
                System.err.println("expected " + names.size() + " robots, found " + robots.length);
                exit = 2;
            } else {
                // The rumble's defaults: 450 ticks of inactivity, gun cooling 0.1.
                engine.runBattle(new BattleSpecification(new BattlefieldSpecification(width, height),
                    rounds, 450, 0.1, sentryBorder, false, robots), true);
                harvester.close();
                // Sorted by score; getRank() is not the finishing place in 1.9.5.
                int place = 0;
                for (BattleResults r : results) {
                    out.printf(java.util.Locale.ROOT, "%d,%s,%.0f,%d,%.0f,%.0f%n", ++place,
                        r.getTeamLeaderName(), (double) r.getScore(), r.getFirsts(),
                        (double) r.getSurvival(), (double) r.getBulletDamage());
                }
            }
        }
        engine.close();
        System.exit(exit);
    }
}
