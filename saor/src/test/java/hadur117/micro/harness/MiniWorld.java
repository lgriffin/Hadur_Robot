package hadur117.micro.harness;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * A small deterministic melee that drives one robot through its event handlers, in the
 * engine's event order (status, deaths, collisions, scans), and moves it by its orders. It is
 * not the engine; it only has to give two adapters the same inputs and react to their orders
 * the same way, so that any difference in their orders shows (SAOR-15). Enemies circle at a
 * constant speed and turn, so the Markov rows they fill only ever hold one successor and the
 * learned gun is as deterministic as the cold one.
 */
public final class MiniWorld {

    /** An opponent on a fixed circle. */
    public static final class Enemy {
        final String name;
        double x;
        double y;
        double heading;
        final double velocity;
        final double turn;
        final int diesAt;
        boolean alive = true;

        /**
         * An enemy.
         *
         * @param name its name; one literal per enemy, as the engine passes one string per robot
         * @param x start x
         * @param y start y
         * @param heading start heading, radians
         * @param velocity constant velocity
         * @param turn constant turn a tick, radians
         * @param diesAt the tick it dies, or -1
         */
        public Enemy(String name, double x, double y, double heading, double velocity, double turn, int diesAt) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.velocity = velocity;
            this.turn = turn;
            this.diesAt = diesAt;
        }
    }

    /** The peer's log: every order the robot gave. */
    public final FakePeer peer = new FakePeer();
    private final AdvancedRobot robot;
    /** The robot's class, as loaded for this world, for reading its statics. */
    public final Class<?> robotClass;
    private final List<Enemy> enemies = new ArrayList<>();
    private final List<Integer> rams = new ArrayList<>();

    double x;
    double y;
    double heading;
    double gunHeading;
    double radarHeading;
    double gunHeat = 3;
    double energy = 100;
    double velocity;
    double distanceRemaining;
    double bodyTurnRemaining;
    double gunTurnRemaining;
    double radarTurnRemaining;
    /** Shots fired, as the world saw them. */
    public int shots;

    /**
     * A world around a robot class loaded afresh from {@code classPath}.
     *
     * @param className the robot's class
     * @param x our start x
     * @param y our start y
     * @param classPath where the robot's classes are
     * @throws ReflectiveOperationException if the robot cannot be made
     */
    public MiniWorld(String className, double x, double y, URL... classPath) throws ReflectiveOperationException {
        @SuppressWarnings("resource")
        IsolatingLoader loader = new IsolatingLoader(classPath);
        robotClass = loader.loadClass(className);
        robot = (AdvancedRobot) robotClass.getConstructor().newInstance();
        robot.setPeer(FakePeer.peer(peer));
        robot.setOut(new PrintStream(OutputStream.nullOutputStream()));
        this.x = x;
        this.y = y;
    }

    /**
     * Sets Markov rows before the battle, through the robot's {@code markov} static.
     *
     * @param prefill writes into the robot's tables
     * @return this world
     * @throws ReflectiveOperationException if the robot has no such static
     */
    public MiniWorld prefill(java.util.function.Consumer<char[][][]> prefill) throws ReflectiveOperationException {
        java.lang.reflect.Field f = robotClass.getDeclaredField("markov");
        f.setAccessible(true);
        prefill.accept((char[][][]) f.get(null));
        return this;
    }

    /**
     * Adds an enemy.
     *
     * @param e the enemy
     * @return this world
     */
    public MiniWorld enemy(Enemy e) {
        enemies.add(e);
        return this;
    }

    /**
     * A collision with the nearest enemy at this tick.
     *
     * @param tick the tick
     * @return this world
     */
    public MiniWorld ram(int tick) {
        rams.add(tick);
        return this;
    }

    /**
     * Runs the robot for some ticks.
     *
     * @param ticks how many
     * @return the orders it gave, in order
     */
    public List<String> run(int ticks) {
        publish();
        robot.run();
        orders();
        for (int t = 0; t < ticks; t++) {
            peer.orders.add("tick " + t);
            publish();
            robot.onStatus(null);
            for (Enemy e : enemies) {
                if (e.alive && e.diesAt == t) {
                    e.alive = false;
                    publish();
                    robot.onRobotDeath(new RobotDeathEvent(e.name));
                }
            }
            if (rams.contains(t)) {
                Enemy n = nearest();
                if (n != null) robot.onHitRobot(new HitRobotEvent(n.name, bearing(n) - heading, n.velocity, false));
            }
            double before = radarHeading - radarStep();
            for (Enemy e : enemies) {
                if (e.alive && swept(before, radarHeading, bearing(e))) {
                    robot.onScannedRobot(new ScannedRobotEvent(e.name, 100, bearing(e) - heading,
                        Math.hypot(e.x - x, e.y - y), e.heading, e.velocity, false));
                }
            }
            step();
        }
        return peer.orders;
    }

    private double lastRadarStep;

    private double radarStep() {
        return lastRadarStep;
    }

    private void publish() {
        peer.values.put("getX", x);
        peer.values.put("getY", y);
        peer.values.put("getBodyHeading", heading);
        peer.values.put("getGunHeading", gunHeading);
        peer.values.put("getRadarHeading", radarHeading);
        peer.values.put("getGunHeat", gunHeat);
        peer.values.put("getEnergy", energy);
        peer.values.put("getVelocity", velocity);
        peer.values.put("getDistanceRemaining", distanceRemaining);
        peer.values.put("getGunTurnRemaining", gunTurnRemaining);
        peer.values.put("getRadarTurnRemaining", radarTurnRemaining);
        peer.values.put("getBodyTurnRemaining", bodyTurnRemaining);
        peer.values.put("getOthers", (int) enemies.stream().filter(e -> e.alive).count());
        peer.values.put("getBattleFieldWidth", 1000.0);
        peer.values.put("getBattleFieldHeight", 1000.0);
    }

    /** Takes in the orders given since the last call, as the engine does at the end of a turn. */
    private void orders() {
        Object o;
        if ((o = peer.now.get("setFire")) != null && gunHeat == 0) {
            double p = Math.min(Math.max((Double) o, 0.1), 3);
            gunHeat = 1 + p / 5;
            energy -= p;
            shots++;
        }
        if ((o = peer.now.get("setMove")) != null) distanceRemaining = (Double) o;
        if ((o = peer.now.get("setTurnBody")) != null) bodyTurnRemaining = (Double) o;
        if ((o = peer.now.get("setTurnGun")) != null) gunTurnRemaining = (Double) o;
        if ((o = peer.now.get("setTurnRadar")) != null) radarTurnRemaining = (Double) o;
        peer.now.clear();
    }

    private void step() {
        orders();
        gunHeat = Math.max(0, Math.round((gunHeat - 0.1) * 1e9) / 1e9);
        double bt = clamp(bodyTurnRemaining, Math.toRadians(10 - 0.75 * Math.abs(velocity)));
        heading += bt;
        bodyTurnRemaining -= bt;
        double gt = clamp(gunTurnRemaining, Math.toRadians(20));
        gunHeading += gt;
        gunTurnRemaining -= gt;
        double rt = clamp(radarTurnRemaining, Math.toRadians(45));
        radarHeading += rt;
        radarTurnRemaining = Double.isInfinite(radarTurnRemaining) ? radarTurnRemaining : radarTurnRemaining - rt;
        lastRadarStep = rt;
        velocity = clamp(distanceRemaining, 8);
        double nx = Math.min(982, Math.max(18, x + Math.sin(heading) * velocity));
        double ny = Math.min(982, Math.max(18, y + Math.cos(heading) * velocity));
        if (nx != x + Math.sin(heading) * velocity || ny != y + Math.cos(heading) * velocity) {
            distanceRemaining = 0;
            velocity = 0;
        } else {
            distanceRemaining -= velocity;
            if (Math.abs(distanceRemaining) < 1e-9) distanceRemaining = 0;
        }
        x = nx;
        y = ny;
        for (Enemy e : enemies) {
            e.heading += e.turn;
            e.x += Math.sin(e.heading) * e.velocity;
            e.y += Math.cos(e.heading) * e.velocity;
        }
    }

    private Enemy nearest() {
        Enemy best = null;
        for (Enemy e : enemies) {
            if (e.alive && (best == null || Math.hypot(e.x - x, e.y - y) < Math.hypot(best.x - x, best.y - y))) best = e;
        }
        return best;
    }

    private double bearing(Enemy e) {
        return Math.atan2(e.x - x, e.y - y);
    }

    private static boolean swept(double from, double to, double bearing) {
        double span = to - from;
        double off = robocode.util.Utils.normalAbsoluteAngle((bearing - from) * Math.signum(span == 0 ? 1 : span));
        return off <= Math.abs(span) + 1e-9;
    }

    private static double clamp(double v, double limit) {
        return Math.max(-limit, Math.min(limit, v));
    }
}
