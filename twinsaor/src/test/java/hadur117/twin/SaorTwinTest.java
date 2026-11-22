package hadur117.twin;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.MessageEvent;
import robocode.ScannedRobotEvent;
import robocode.robotinterfaces.peer.ITeamRobotPeer;
import hadur117.twin.core.Gun;

/**
 * The shipped twin's scan handling (TWIN-4, TWIN-5, TWIN-13; its bit-2 range is in TeamTest) and radar split (TWIN-8), driven one
 * event at a time through a fake engine peer. The class keeps its battle in statics, so each test
 * starts them as {@code run()} does.
 */
class SaorTwinTest {

    static final String MATE = "hadur117.twin.SaorTwin* (2)";

    /** Getter name to value; unset getters return zero. */
    final Map<String, Object> values = new HashMap<>();
    /** Every call that is not a getter, with its first argument. */
    final List<Object[]> calls = new ArrayList<>();
    SaorTwin twin;

    @BeforeEach
    void fresh() {
        SaorTwin.seen = new double[SaorTwin.SLOTS][8];
        SaorTwin.markov = new char[SaorTwin.SLOTS][Gun.STATES][Gun.ROW + 1];
        for (double[] r : SaorTwin.seen) {
            r[SaorTwin.TIME] = -9;
        }
        SaorTwin.mode = 0;
        SaorTwin.target = -1;
        SaorTwin.leader = true;
        SaorTwin.mateAlive = true;
        SaorTwin.mateX = 0;
        SaorTwin.mateY = 0;
        SaorTwin.side = 1;
        twin = new SaorTwin();
        twin.setPeer((ITeamRobotPeer) Proxy.newProxyInstance(getClass().getClassLoader(),
            new Class<?>[] {ITeamRobotPeer.class}, (proxy, method, args) -> {
                String name = method.getName();
                if (name.equals("isTeammate")) return MATE.equals(args[0]);
                if ((name.startsWith("get") || name.startsWith("is")) && (args == null || args.length == 0)) {
                    Object v = values.get(name);
                    if (v != null) return v;
                }
                if (!name.startsWith("get") && !name.startsWith("is")) {
                    calls.add(new Object[] {name, args == null || args.length == 0 ? null : args[0]});
                }
                Class<?> t = method.getReturnType();
                return t == double.class ? 0.0 : t == int.class ? 0 : t == long.class ? 0L : t == boolean.class ? false : null;
            }));
        twin.setOut(new PrintStream(OutputStream.nullOutputStream()));
        values.put("getX", 400.0);
        values.put("getY", 400.0);
        values.put("getEnergy", 200.0);
        values.put("getOthers", 3);
        values.put("getTime", 10L);
    }

    List<double[]> broadcasts() {
        List<double[]> out = new ArrayList<>();
        for (Object[] c : calls) {
            if (c[0].equals("broadcastMessage")) out.add((double[]) c[1]);
        }
        return out;
    }

    /** A robot at (400 + dx, 400 + dy), heading north, still. */
    static ScannedRobotEvent scan(String name, double energy, double dx, double dy) {
        return new ScannedRobotEvent(name, energy, Math.atan2(dx, dy), Math.hypot(dx, dy), 0, 0, false);
    }

    /** A name whose hash lands in the mode table's slot {@code s}. */
    static String nameAt(int s) {
        for (int i = 0; ; i++) {
            if ((("e" + i).hashCode() & (SaorTwin.SLOTS - 1)) == s) {
                return "e" + i;
            }
        }
    }

    /** The first slot whose mode table entry has every bit of {@code bits}. */
    static int slotWith(int bits) {
        for (int s = 0; s < SaorTwin.SLOTS; s++) {
            if ((SaorTwin.MODES.charAt(s) & bits) == bits) return s;
        }
        throw new AssertionError("no slot with mode " + bits);
    }

    @Test
    @Tag("TWIN-4")
    @DisplayName("a scanned teammate is neither recorded, sent on, nor targeted: only its position is kept")
    void teammateIsIgnored() {
        twin.onScannedRobot(scan(MATE, 200, 0, 100));
        assertEquals(500.0, SaorTwin.mateY, 1e-9);
        assertTrue(broadcasts().isEmpty(), "a teammate's scan is not broadcast");
        for (double[] r : SaorTwin.seen) {
            assertEquals(0.0, r[SaorTwin.ALIVE], "no enemy record");
        }
        twin.tick();
        assertEquals(-1, SaorTwin.target);
    }

    @Test
    @Tag("TWIN-5")
    @DisplayName("an enemy's scan is broadcast, and the partner's copy is handled by the same path")
    void scanIsSharedAndHandledAlike() {
        twin.onScannedRobot(scan("a.A 1", 100, 0, 200));
        List<double[]> sent = broadcasts();
        assertEquals(1, sent.size());
        double[][] direct = copy(SaorTwin.seen);

        fresh();
        twin.onMessageReceived(new MessageEvent("partner", sent.get(0)));
        assertArrayEquals(direct, copy(SaorTwin.seen), "the received scan leaves the same records");
    }

    static double[][] copy(double[][] a) {
        double[][] c = new double[a.length][];
        for (int i = 0; i < a.length; i++) c[i] = a[i].clone();
        return c;
    }

    @Test
    @Tag("TWIN-8")
    @DisplayName("with both twins and both enemies alive, the leader's radar takes the target, the other's the other")
    void radarSplit() {
        // The target (least energy) to the east, the other enemy to the west; radar heading north.
        twin.onScannedRobot(scan("a.A 1", 50, 300, 0));
        twin.onScannedRobot(scan("b.B 1", 100, -300, 0));
        calls.clear();
        twin.tick();
        assertEquals(Double.POSITIVE_INFINITY, radarTurn(), "leader: toward the target, east");

        SaorTwin.leader = false;
        calls.clear();
        twin.tick();
        assertEquals(Double.NEGATIVE_INFINITY, radarTurn(), "other twin: toward the other enemy, west");
    }

    double radarTurn() {
        for (Object[] c : calls) {
            if (c[0].equals("setTurnRadar")) return (Double) c[1];
        }
        throw new AssertionError("no radar order in " + calls.size() + " calls");
    }

    @Test
    @Tag("TWIN-13")
    @DisplayName("each enemy scanned ORs its slot's mode table entry into the mode")
    void modeIsOredIn() {
        int two = slotWith(2);
        int one = slotWith(1);
        twin.onScannedRobot(scan(nameAt(two), 100, 0, 200));
        assertEquals(SaorTwin.MODES.charAt(two), SaorTwin.mode);
        twin.onScannedRobot(scan(nameAt(one), 100, 0, -200));
        assertEquals(SaorTwin.MODES.charAt(two) | SaorTwin.MODES.charAt(one), SaorTwin.mode);
    }

    @Test
    @Tag("TWIN-13")
    @DisplayName("mode bit 1 stops the leg reversing on the target's shot")
    void bitOneHoldsTheLeg() {
        int zero = -1;
        for (int s = 0; s < SaorTwin.SLOTS && zero < 0; s++) {
            if (SaorTwin.MODES.charAt(s) == 0) zero = s;
        }
        assertTrue(zero >= 0, "the mode table has no slot with mode 0");
        String name = nameAt(zero);
        // Without bit 1: the target's energy drop of 2 between consecutive scans reverses the leg.
        twin.onScannedRobot(scan(name, 100, 0, 200));
        SaorTwin.target = zero;
        values.put("getTime", 11L);
        twin.onScannedRobot(scan(name, 98, 0, 200));
        assertEquals(-1, SaorTwin.side);

        fresh();
        SaorTwin.mode = 1;
        twin.onScannedRobot(scan(name, 100, 0, 200));
        SaorTwin.target = zero;
        values.put("getTime", 11L);
        twin.onScannedRobot(scan(name, 98, 0, 200));
        assertEquals(1, SaorTwin.side, "bit 1 holds the leg");
    }
}
