package hadur117.micro.harness;

import java.net.URL;

/** The melees the equivalence test runs both adapters through (SAOR-15). */
public final class Scenarios {

    /** Ticks a scenario runs: long enough for rows to warm and the axis to flip many times. */
    public static final int TICKS = 900;
    /**
     * Ticks of {@link #lowLeft}: from about tick 524 target switches and radar gaps have put
     * two different successors in a row, the gun samples it at random and two runs of the same
     * robot part; every tick before that replays exactly. (0.1 waited for 8 samples, so its
     * runs held together to about tick 700; 0.2 samples any seen row.)
     */
    public static final int LOW_LEFT_TICKS = 500;

    private Scenarios() {
    }

    /**
     * Five circling enemies around a robot starting low left; two die, two collisions.
     *
     * @param className the robot
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld lowLeft(String className, URL... classPath) throws ReflectiveOperationException {
        return new MiniWorld(className, 200, 300, classPath)
            .enemy(new MiniWorld.Enemy("a.Alpha 1.0", 420, 380, 0.3, 8, 0.035, -1))
            .enemy(new MiniWorld.Enemy("b.Bravo 1.0", 700, 260, 2.0, 6, -0.03, 380))
            .enemy(new MiniWorld.Enemy("c.Charlie 1.0", 520, 720, 4.1, 8, 0.02, -1))
            .enemy(new MiniWorld.Enemy("d.Delta 1.0", 300, 640, 1.2, 4, 0.04, 150))
            .enemy(new MiniWorld.Enemy("e.Echo 1.0", 760, 700, 5.0, 8, -0.025, -1))
            .ram(60)
            .ram(300);
    }

    /**
     * One steady enemy whose rows are set by hand so the learned gun is deterministic and
     * differs from the cold one: its own state S has a full row of T (the robot's learning
     * cannot write into a full row), T has {@code warmth} samples of U, and U a full row of U.
     * With a sample or more at T the playouts go S, T, U, U..., voting less below 8 samples;
     * with none they hold T (SAOR-6, SAOR-7). The robot's own scans only ever record into S's row.
     *
     * @param className the robot
     * @param warmth samples in T's row
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld learned(String className, int warmth, URL... classPath) throws ReflectiveOperationException {
        // Its hash has bit 8 set, so a table picked with & 255 instead of & 511 would miss the rows.
        String name = "m.Mike 1.0";
        // Steady: speed 8, turning 0.03 a tick; S is its state scan to scan once locked.
        int s = hadur117.micro.core.Targeting.state(8, 8, 0, 0.03);
        int t = s ^ (3 << 7) ^ (5 << 2);   // another turn and speed
        int u = (8 + 3 << 2) + 1 + (2 << 7);  // speed 3, no turn, steady
        return new MiniWorld(className, 150, 150, classPath)
            .enemy(new MiniWorld.Enemy(name, 600, 420, 4.5, 8, 0.03, -1))
            .prefill(markov -> {
                char[][] table = markov[name.hashCode() & 511];
                java.util.Arrays.fill(table[s], (char) t);
                table[s][126] = 126;
                java.util.Arrays.fill(table[t], (char) u);
                table[t][126] = (char) warmth;
                java.util.Arrays.fill(table[u], (char) u);
                table[u][126] = 126;
            });
    }

    /**
     * Three enemies around a robot starting high right, one stationary; the field thins to
     * two, so the end-game power cap applies (SAOR-8). The collision comes before any scan; 0.2
     * has no collision handler, so the gun waits for its first scan.
     *
     * @param className the robot
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld highRight(String className, URL... classPath) throws ReflectiveOperationException {
        return new MiniWorld(className, 820, 760, classPath)
            .enemy(new MiniWorld.Enemy("f.Foxtrot 1.0", 700, 640, 1.0, 0, 0, -1))
            .enemy(new MiniWorld.Enemy("g.Golf 1.0", 450, 520, 3.0, 7, 0.03, 250))
            .enemy(new MiniWorld.Enemy("h.Hotel 1.0", 300, 300, 0.5, 8, -0.035, -1))
            .ram(2);
    }
}
