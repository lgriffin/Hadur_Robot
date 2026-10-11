package hadurling.bench;

import java.io.File;
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
 * Runs one battle in this JVM and writes its result to a file. {@link Bench} starts it as a
 * child process, because Robocode reads the {@code RANDOMSEED} system property once per JVM,
 * so each seed needs a JVM of its own.
 *
 * <p>Arguments: Robocode home folder, result file, rounds, field width, field height, our
 * robot's name, the opponent's name. The result file holds one line, {@code ourScore,theirScore},
 * or {@code ERROR message}.</p>
 */
public final class BattleRunner {

    private BattleRunner() {}

    /**
     * Runs the battle.
     *
     * @param args see the class comment
     * @throws Exception if the engine cannot be started
     */
    public static void main(String[] args) throws Exception {
        File home = new File(args[0]);
        Path result = Path.of(args[1]);
        int rounds = Integer.parseInt(args[2]);
        int width = Integer.parseInt(args[3]);
        int height = Integer.parseInt(args[4]);
        String us = args[5];
        String them = args[6];

        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        double[] scores = {-1, -1};
        StringBuilder errors = new StringBuilder();
        engine.addBattleListener(new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                for (BattleResults r : e.getSortedResults()) {
                    if (r.getTeamLeaderName().equals(us)) scores[0] = r.getScore();
                    else scores[1] = r.getScore();
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

        int exit = 0;
        RobotSpecification[] robots = engine.getLocalRepository(us + "," + them);
        if (robots.length != 2) {
            Files.writeString(result, "ERROR expected 2 robots, found " + robots.length + "\n");
            exit = 2;
        } else {
            engine.runBattle(new BattleSpecification(rounds, new BattlefieldSpecification(width, height), robots), true);
            if (scores[0] < 0 || scores[1] < 0) {
                Files.writeString(result, "ERROR no results " + errors + "\n");
                exit = 3;
            } else {
                Files.writeString(result, scores[0] + "," + scores[1] + "\n");
            }
        }
        engine.close();
        System.exit(exit);
    }
}
