package hadur.bench;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.RobotState;

/**
 * D2's check on the engine (END-4): with two robots that never hit each other, does the one
 * with more energy survive Robocode's inactivity penalty?
 *
 * <p>Two tiny robots are compiled at run time into a scratch Robocode home: an {@code Idler}
 * that does nothing, and a {@code Spender} that waits for its gun to cool, fires one bullet of
 * a fixed power at the nearest wall (away from the field, so it cannot hit the Idler), then
 * does nothing. After the shot the Spender has less energy than the Idler by the bullet's
 * power, and neither can ever damage the other, so only the inactivity rule can end the
 * round. For each power the check runs a one-round battle on the same engine the bench uses
 * and reports the energy gap, the tick each robot died on, and who was left.</p>
 *
 * <p>Arguments: the scratch Robocode home directory (created if missing). Run with the bench's
 * classpath (hadur-bench's dependencies, which hold the engine jars) and the JVM flags of
 * {@code Bench.JVM_FLAGS}, for example
 * {@code java --add-opens=... -Djava.security.manager=allow -Djava.awt.headless=true -cp
 * target/classes:<dependencies> hadur.bench.InactivityCheck /tmp/inactivity-home}.
 * It takes about a minute and a half. Its findings on 1.9.5.6 are in docs/requirements.md's D2 notes.</p>
 */
public final class InactivityCheck {

    private static final String IDLER = "package inact;\n"
        + "import robocode.Robot;\n"
        + "public class Idler extends Robot { public void run() { while (true) doNothing(); } }\n";

    /** A spender of the given bullet power: waits for a cool gun, shoots the nearest wall, then idles. */
    private static String spender(String name, double power) {
        return "package inact;\n"
            + "import robocode.Robot;\n"
            + "import robocode.util.Utils;\n"
            + "public class " + name + " extends Robot {\n"
            + "  public void run() {\n"
            + "    double x = getX(), y = getY(), w = getBattleFieldWidth(), h = getBattleFieldHeight();\n"
            + "    double[] d = { y, h - y, x, w - x };\n"
            + "    double[] heading = { 180, 0, 270, 90 };\n"
            + "    int best = 0;\n"
            + "    for (int i = 1; i < 4; i++) if (d[i] < d[best]) best = i;\n"
            + "    turnGunRight(Utils.normalRelativeAngleDegrees(heading[best] - getGunHeading()));\n"
            + "    while (getGunHeat() > 0) doNothing();\n"
            + (power > 0 ? "    fire(" + power + ");\n" : "")
            + "    while (true) doNothing();\n"
            + "  }\n"
            + "}\n";
    }

    private InactivityCheck() {}

    public static void main(String[] args) throws Exception {
        Path home = Path.of(args.length > 0 ? args[0] : "inactivity-home").toAbsolutePath();
        Path robots = home.resolve("robots");
        Files.createDirectories(robots);
        double[] powers = {0, 0.1, 0.3, 1.0, 3.0};
        List<String> names = new ArrayList<>();
        install(robots, "Idler", IDLER);
        for (double p : powers) {
            String name = "Spend" + String.valueOf(p).replace('.', '_');
            install(robots, name, spender(name, p));
            names.add(name);
        }
        RobocodeEngine.setLogMessagesEnabled(false);
        RobocodeEngine engine = new RobocodeEngine(home.toFile());
        System.out.println("engine " + engine.getVersion());
        System.out.println("spend | gap at 440 | spender dies | idler dies | idler left at the end");
        boolean allMoreEnergySurvives = true;
        boolean allValid = true;
        for (int i = 0; i < powers.length; i++) {
            RobotSpecification[] specs = engine.getLocalRepository("inact.Idler,inact." + names.get(i));
            Outcome o = run(engine, specs);
            System.out.printf("%.1f | %.2f | %s | %s | %s%n", powers[i], o.gap, o.spenderDied, o.idlerDied, o.idlerSurvived);
            if (!o.valid) {
                System.out.println("INVALID case for spend " + powers[i] + ": " + o.problem);
                allValid = false;
            }
            if (powers[i] > 0 && !o.idlerSurvived) allMoreEnergySurvives = false;
        }
        engine.close();
        if (!allValid) {
            System.out.println("RESULT invalid: the engine did not complete every case, so nothing is concluded");
            System.exit(1);
        }
        System.out.println(allMoreEnergySurvives ? "RESULT the robot with more energy survived every unequal case"
            : "RESULT the robot with more energy did NOT survive every unequal case");
        System.exit(0);
    }

    /** {@code valid} is false, with the {@code problem}, when the battle did not run to a result. */
    private record Outcome(double gap, long spenderDied, long idlerDied, boolean idlerSurvived,
                           boolean valid, String problem) {}

    private static Outcome run(RobocodeEngine engine, RobotSpecification[] specs) {
        if (specs.length != 2) throw new IllegalStateException("expected 2 robots, found " + specs.length);
        long[] died = {-1, -1};
        double[] gap = {Double.NaN};
        boolean[] idlerAliveAtEnd = {true};
        boolean[] completed = {false};
        String[] error = {null};
        BattleAdaptor listener = new BattleAdaptor() {
            @Override
            public void onBattleCompleted(BattleCompletedEvent e) {
                completed[0] = true;
            }

            @Override
            public void onBattleError(BattleErrorEvent e) {
                error[0] = e.getError();
            }

            @Override
            public void onTurnEnded(TurnEndedEvent e) {
                IRobotSnapshot[] r = e.getTurnSnapshot().getRobots();
                int turn = e.getTurnSnapshot().getTurn();
                IRobotSnapshot idler = r[0].getName().contains("Idler") ? r[0] : r[1];
                IRobotSnapshot spender = idler == r[0] ? r[1] : r[0];
                if (turn == 440) gap[0] = idler.getEnergy() - spender.getEnergy();
                if (died[0] < 0 && spender.getState() == RobotState.DEAD) died[0] = turn;
                if (died[1] < 0 && idler.getState() == RobotState.DEAD) died[1] = turn;
                idlerAliveAtEnd[0] = idler.getState() != RobotState.DEAD;
            }
        };
        engine.addBattleListener(listener);
        engine.runBattle(new BattleSpecification(1, new BattlefieldSpecification(800, 600), specs), true);
        engine.removeBattleListener(listener);
        // A battle that did not complete, or never reached the measured tick or a death, has no
        // observations to read: the unset sentinels must not pass for "the idler survived".
        String problem = problemWith(completed[0], error[0], gap[0], died[0], died[1]);
        return new Outcome(gap[0], died[0], died[1], died[1] < 0 || (died[0] >= 0 && died[0] < died[1]),
            problem == null, problem);
    }

    /**
     * What is wrong with a case's observations, or null when they can be read: the battle must
     * have completed without an engine error, reached the measured tick and ended with a death.
     */
    static String problemWith(boolean completed, String error, double gap, long spenderDied, long idlerDied) {
        if (error != null) return "engine error: " + error;
        if (!completed) return "the battle did not complete";
        if (Double.isNaN(gap)) return "no turn 440 observed (no energy gap)";
        if (spenderDied < 0 && idlerDied < 0) return "neither robot died: no result";
        return null;
    }

    /** Compiles {@code source} into a robot jar named as Robocode expects, with its properties file. */
    private static void install(Path robots, String name, String source) throws IOException {
        Path work = Files.createTempDirectory("inact-" + name);
        Path src = work.resolve("inact/" + name + ".java");
        Files.createDirectories(src.getParent());
        Files.writeString(src, source);
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fm = javac.getStandardFileManager(null, null, null)) {
            Iterable<? extends JavaFileObject> units = fm.getJavaFileObjects(src.toFile());
            boolean ok = javac.getTask(null, fm, null,
                List.of("-classpath", System.getProperty("java.class.path"), "-d", work.toString(), "--release", "8"),
                null, units).call();
            if (!ok) throw new IllegalStateException("could not compile " + name);
        }
        String props = "robot.classname=inact." + name + "\nrobot.version=1.0\nrobot.name=" + name
            + "\nrobocode.version=1.9.5.6\nrobot.java.source.included=false\n";
        try (JarOutputStream jar = new JarOutputStream(Files.newOutputStream(robots.resolve("inact_" + name + ".jar")))) {
            jar.putNextEntry(new JarEntry("inact/" + name + ".class"));
            try (InputStream in = Files.newInputStream(work.resolve("inact/" + name + ".class"))) {
                in.transferTo(jar);
            }
            jar.closeEntry();
            jar.putNextEntry(new JarEntry("inact/" + name + ".properties"));
            jar.write(props.getBytes(StandardCharsets.ISO_8859_1));
            jar.closeEntry();
        }
    }
}
