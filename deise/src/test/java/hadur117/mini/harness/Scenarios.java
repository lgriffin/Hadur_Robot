package hadur117.mini.harness;

import java.net.URL;

/** The melees the equivalence test runs both builds through (DEISE-16). */
public final class Scenarios {

    /** Ticks a scenario runs: long enough for rows to warm, targets to switch and robots to die. */
    public static final int TICKS = 900;

    private Scenarios() {
    }

    /**
     * Five circling enemies around a robot starting low left; two die. Five left keeps the
     * corners pulling (DEISE-4) until the first death.
     *
     * @param className the robot
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld lowLeft(String className, URL... classPath) throws ReflectiveOperationException {
        return new MiniWorld(className, 200, 300, classPath)
            .enemy(new MiniWorld.Enemy("a.Alpha 1.0", 420, 380, 0.3, 8, 0.035, -1).fires(17, 2))
            .enemy(new MiniWorld.Enemy("b.Bravo 1.0", 700, 260, 2.0, 6, -0.03, 380))
            .enemy(new MiniWorld.Enemy("c.Charlie 1.0", 520, 720, 4.1, 8, 0.02, -1).fires(23, 1.5))
            .enemy(new MiniWorld.Enemy("d.Delta 1.0", 300, 640, 1.2, 4, 0.04, 150))
            .enemy(new MiniWorld.Enemy("e.Echo 1.0", 760, 700, 5.0, 8, -0.025, -1));
    }

    /**
     * Three enemies around a robot starting high right, one stationary; the field thins to
     * two, so the end-game power cap applies (DEISE-10) and the corners let go (DEISE-4).
     *
     * @param className the robot
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld highRight(String className, URL... classPath) throws ReflectiveOperationException {
        return new MiniWorld(className, 820, 760, classPath)
            .enemy(new MiniWorld.Enemy("f.Foxtrot 1.0", 700, 640, 1.0, 0, 0, -1).fires(13, 3))
            .enemy(new MiniWorld.Enemy("g.Golf 1.0", 450, 520, 3.0, 7, 0.03, 250))
            .enemy(new MiniWorld.Enemy("h.Hotel 1.0", 300, 300, 0.5, 8, -0.035, -1).fires(29, 0.5));
    }

    /**
     * Seven enemies, a crowded MiniMelee start, around a robot in the middle; three die, one of
     * them on the first tick, before the radar has seen it.
     *
     * @param className the robot
     * @param classPath where its classes are
     * @return the world
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public static MiniWorld crowd(String className, URL... classPath) throws ReflectiveOperationException {
        return new MiniWorld(className, 500, 480, classPath)
            .enemy(new MiniWorld.Enemy("i.India 1.0", 150, 150, 0.8, 8, 0.03, -1).fires(19, 2.5))
            .enemy(new MiniWorld.Enemy("j.Juliet 1.0", 850, 150, 5.5, 8, -0.04, 200))
            .enemy(new MiniWorld.Enemy("k.Kilo 1.0", 850, 850, 3.9, 6, 0.025, -1).fires(31, 1))
            .enemy(new MiniWorld.Enemy("l.Lima 1.0", 150, 850, 2.4, 8, -0.02, 420))
            .enemy(new MiniWorld.Enemy("m.Mike 1.0", 500, 820, 1.6, 5, 0.05, -1))
            .enemy(new MiniWorld.Enemy("n.November 1.0", 500, 150, 4.7, 8, 0.0, 600))
            .enemy(new MiniWorld.Enemy("o.Oscar 1.0", 300, 500, 0.1, 3, -0.06, -1).fires(11, 3))
            .enemy(new MiniWorld.Enemy("p.Papa 1.0", 900, 500, 1.0, 8, 0.03, 1));
    }
}
