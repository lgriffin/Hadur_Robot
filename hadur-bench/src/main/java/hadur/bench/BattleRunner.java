package hadur.bench;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import robocode.BattleResults;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSetup;
import robocode.control.RobotSpecification;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;
import robocode.control.events.RoundEndedEvent;

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

        JdkWarmup.run(); // BENCH-83: before any robot can be the first to need a JDK provider
        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home);
        LogHarvester harvester = new LogHarvester(battleDir, us, LogHarvester.truthLogOn());
        engine.addBattleListener(harvester);
        StringBuilder errors = new StringBuilder();
        BattleResults[] results = new BattleResults[1];
        BattleResults[] theirs = new BattleResults[1];
        long[] roundTurns = new long[2];
        engine.addBattleListener(new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                for (BattleResults r : e.getSortedResults()) {
                    if (r.getTeamLeaderName().equals(us)) results[0] = r;
                    else theirs[0] = r;
                }
            }

            @Override
            public void onRoundEnded(RoundEndedEvent e) {
                roundTurns[0] += e.getTurns();
                roundTurns[1]++;
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
                engine.runBattle(spec(rounds, width, height, robots), true);
                // G14: let the engine finish reporting before the log is read and closed.
                harvester.awaitDrain(5000, 250);
                harvester.close();
                try {
                    RoundSeries.write(battleDir, us, them, Integer.getInteger("RANDOMSEED", 0),
                        harvester.rounds());
                } catch (IOException e) {
                    System.err.println("rounds.tsv not written: " + e);
                }
                if (results[0] == null || theirs[0] == null) {
                    out.println(BattleResult.failed("no results " + errors));
                    exit = 3;
                } else {
                    BattleResult row = BattleResult.of(results[0], theirs[0], rounds, harvester,
                        errors.toString());
                    row.reference = !BattleResult.isHadur(us);
                    if (row.reference) row.duressTicks = -1;
                    row.engineRoundTicks = roundTurns[1] == 0 ? Double.NaN : (double) roundTurns[0] / roundTurns[1];
                    out.println(row.toCsv());
                }
            }
        }
        engine.close();
        System.exit(exit);
    }

    /**
     * The battle, with both robots at a fixed start every round when {@code hadur.bench.start}
     * names placements ("x1,y1,x2,y2", several joined by '|', one per seed in turn).
     */
    static BattleSpecification spec(int rounds, int width, int height, RobotSpecification[] robots) {
        String start = System.getProperty("hadur.bench.start", "");
        BattlefieldSpecification field = new BattlefieldSpecification(width, height);
        if (start.isEmpty()) return new BattleSpecification(rounds, field, robots);
        String[] picks = start.split("\\|");
        String[] v = picks[Math.floorMod(Integer.getInteger("RANDOMSEED", 0), picks.length)].split(",");
        RobotSetup[] setups = {
            new RobotSetup(Double.parseDouble(v[0]), Double.parseDouble(v[1]), null),
            new RobotSetup(Double.parseDouble(v[2]), Double.parseDouble(v[3]), null)};
        return new BattleSpecification(field, rounds, 450, 0.1, 100, false, robots, setups);
    }
}
