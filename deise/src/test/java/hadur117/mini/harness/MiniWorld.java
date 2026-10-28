package hadur117.mini.harness;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * A small deterministic melee that runs one robot's own loop: each {@code execute()} takes in
 * the robot's orders, moves the world a tick, and hands the robot that tick's events (deaths,
 * then scans), in the engine's order. It is not the engine; it only has to give two builds the
 * same inputs and react to their orders the same way, so that any difference in their orders
 * shows (DEISE-16). Enemies circle at a constant speed and turn, so each Markov row they fill
 * holds one successor and the learned gun is as deterministic as the cold one. Some fire on a
 * fixed beat, so the seen-shot waves (DEISE-5) are compared too. Adapted from
 * Saor's harness, which drives an event-only robot.
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
        double energy = 100;
        int every;
        double power;

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

        /**
         * Makes the enemy fire: its energy drops by {@code power} every {@code every} ticks, which
         * a scan reads as a shot (DEISE-5).
         *
         * @param every ticks between shots
         * @param power each shot's power
         * @return this enemy
         */
        public Enemy fires(int every, double power) {
            this.every = every;
            this.power = power;
            return this;
        }
    }

    /** Thrown from execute() to end the robot's loop when the run is over. */
    static final class Stop extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }

    /** The peer's log: every order the robot gave. */
    public final FakePeer peer = new FakePeer();
    private final AdvancedRobot robot;
    /** The robot's class, as loaded for this world, for reading its statics. */
    public final Class<?> robotClass;
    private final List<Enemy> enemies = new ArrayList<>();

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
    long time;
    int ticks;
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
        peer.turn = this::turn;
        this.x = x;
        this.y = y;
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
     * Runs the robot for some ticks.
     *
     * @param ticks how many
     * @return the orders it gave, in order
     */
    public List<String> run(int ticks) {
        this.ticks = ticks;
        publish();
        try {
            robot.run();
        } catch (Stop end) {
            // the run is over
        }
        return peer.orders;
    }

    /** The end of the robot's turn: its orders are taken in, the world moves, events come. */
    private void turn() {
        step();
        if (++time > ticks) throw new Stop();
        peer.orders.add("tick " + time);
        publish();
        for (Enemy e : enemies) {
            if (e.alive && e.diesAt == time) {
                e.alive = false;
                publish();
                robot.onRobotDeath(new RobotDeathEvent(e.name));
            }
        }
        double before = radarHeading - lastRadarStep;
        for (Enemy e : enemies) {
            if (e.alive && swept(before, radarHeading, bearing(e))) {
                robot.onScannedRobot(new ScannedRobotEvent(e.name, e.energy, bearing(e) - heading,
                    Math.hypot(e.x - x, e.y - y), e.heading, e.velocity, false));
            }
        }
    }

    private double lastRadarStep;

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
        peer.values.put("getTime", time);
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
            if (e.alive) {
                if (e.every > 0 && time % e.every == 0 && e.energy > e.power) {
                    e.energy -= e.power;
                }
                e.heading += e.turn;
                e.x += Math.sin(e.heading) * e.velocity;
                e.y += Math.cos(e.heading) * e.velocity;
            }
        }
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
