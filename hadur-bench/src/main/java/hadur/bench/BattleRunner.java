package hadur.bench;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import robocode.BattleResults;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;

/**
 * Runs one battle in this JVM and writes {@code result.csv} into the battle directory.
 * Started by {@link Bench} as a child process so each battle gets its own RANDOMSEED.
 *
 * <p>Arguments: robocode home, battle directory, rounds, field width, field height,
 * our robot name, opponent robot name.</p>
 */
public final class BattleRunner {

    private BattleRunner() {}

    public static void main(String[] args) throws Exception {
        File home = new File(args[0]);
        Path battleDir = Path.of(args[1]);
        int rounds = Integer.parseInt(args[2]);
        int width = Integer.parseInt(args[3]);
        int height = Integer.parseInt(args[4]);
        String us = args[5];
        String them = args[6];
        Files.createDirectories(battleDir);

        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        LogHarvester harvester = new LogHarvester(battleDir, us);
        engine.addBattleListener(harvester);
        StringBuilder errors = new StringBuilder();
        BattleResults[] results = new BattleResults[1];
        BattleResults[] theirs = new BattleResults[1];
        engine.addBattleListener(new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                for (BattleResults r : e.getSortedResults()) {
                    if (r.getTeamLeaderName().equals(us)) results[0] = r;
                    else theirs[0] = r;
                }
            }

            @Override
            public void onBattleError(BattleErrorEvent e) {
                // The engine reports missing GUI support as an error; it is harmless headless.
                if (!e.getError().contains("window manager") && !e.getError().contains("GUI")) {
                    errors.append(e.getError().replace('\n', ' ')).append(' ');
                }
            }
        });

        RobotSpecification[] robots = engine.getLocalRepository(us + "," + them);
        int exit = 0;
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(battleDir.resolve("result.csv")))) {
            out.println(BattleResult.HEADER);
            if (robots.length != 2) {
                out.println(BattleResult.failed("expected 2 robots, found " + robots.length));
                exit = 2;
            } else {
                engine.runBattle(new BattleSpecification(rounds,
                    new BattlefieldSpecification(width, height), robots), true);
                harvester.close();
                if (results[0] == null || theirs[0] == null) {
                    out.println(BattleResult.failed("no results " + errors));
                    exit = 3;
                } else {
                    out.println(BattleResult.of(results[0], theirs[0], rounds, harvester,
                        errors.toString()).toCsv());
                }
            }
        }
        engine.close();
        System.exit(exit);
    }
}
