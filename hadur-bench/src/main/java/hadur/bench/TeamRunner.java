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
 * Runs one team battle in this JVM (A5) and writes {@code team.csv} into the battle
 * directory: one row per team, by score. Started by {@link Bench} in {@code --team} mode.
 *
 * <p>Arguments: robocode home, battle directory, rounds, field width, field height, our
 * member's class name (to pick our team out of the snapshots), then every team's name as
 * Robocode lists it, ours first. A {@link TeamHarvester} writes each member's console and a
 * per-round table beside it.</p>
 */
public final class TeamRunner {

    public static final String HEADER = "rank,team,score,firsts,survival,bulletDamage";

    private TeamRunner() {}

    public static void main(String[] args) throws Exception {
        File home = new File(args[0]);
        Path battleDir = Path.of(args[1]);
        int rounds = Integer.parseInt(args[2]);
        int width = Integer.parseInt(args[3]);
        int height = Integer.parseInt(args[4]);
        String memberClass = args[5];
        List<String> teams = List.of(args).subList(6, args.length);
        Files.createDirectories(battleDir);

        JdkWarmup.run(); // BENCH-83: before any robot can be the first to need a JDK provider
        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        TeamHarvester harvester = new TeamHarvester(battleDir, memberClass);
        engine.addBattleListener(harvester);
        List<BattleResults> results = new ArrayList<>();
        engine.addBattleListener(new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                results.addAll(List.of(e.getSortedResults()));
            }
        });

        RobotSpecification[] robots = engine.getLocalRepository(String.join(",", teams));
        int exit = 0;
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(battleDir.resolve("team.csv")))) {
            out.println(HEADER);
            // The repository expands each team into its members, so a team is found when one
            // of its members carries its team id.
            java.util.Set<String> found = new java.util.HashSet<>();
            for (RobotSpecification r : robots) if (r.getTeamId() != null) found.add(r.getTeamId());
            if (found.size() != teams.size()) {
                System.err.println("expected " + teams.size() + " teams, found " + found);
                exit = 2;
            } else {
                // The TeamRumble's settings, but for the field and rounds given.
                engine.runBattle(new BattleSpecification(new BattlefieldSpecification(width, height),
                    rounds, 450, 0.1, 0, false, robots), true);
                harvester.close();
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
