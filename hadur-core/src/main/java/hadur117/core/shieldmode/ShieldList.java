package hadur117.core.shieldmode;

import hadur117.core.physics.ShotDodger;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * The opponents shield mode applies to (SHIELD-5): Hadur's own list, read by the adapter from
 * a class in the robot jar and handed to the core as lines of text. The core does no I/O
 * (RES-6), so this class only parses and matches.
 *
 * <p>One robot per line; blank lines and lines starting with {@code #} are ignored. A line is
 * a robot's name as Robocode lists it, {@code package.Class version}, or the name alone
 * without the version. A name alone matches every version of the robot ({@code apv.test.Virus}
 * matches {@code apv.test.Virus 0.6.1} and any other); a name with a version matches that
 * version only, so a robot that changes its aim in a new release is not on the list until the
 * bench says so. Matching is exact and case-sensitive: never a prefix, so
 * {@code apv.test.Virus} does not match {@code apv.test.VirusX}. Runs of white space in a
 * line count as one space.</p>
 *
 * <p>Two more kinds of line, matched by the same rule (SHIELD-17, SHIELD-18):
 * {@code shield-move: name} names an opponent the shield's opening drive is for, and
 * {@code shield-aim: predictor offset name} gives an opponent's shipped aim, its best predictor
 * (from 0) and that predictor's offset in radians. A malformed aim line is skipped.</p>
 *
 * <p>At most {@link #MAX_ENTRIES} entries of each kind are kept (RES-2).</p>
 */
public final class ShieldList {

    /** The most entries a list keeps. DrussGT's own list has 357. */
    public static final int MAX_ENTRIES = 4096;

    /** The list with nobody on it: shield mode never starts. */
    public static final ShieldList NONE = new ShieldList(Collections.<String>emptySet(),
        Collections.<String>emptySet(), Collections.<String, double[]>emptyMap(), Collections.<String>emptySet(),
        Collections.<String, Integer>emptyMap());

    /** SHIELD-17: a line starting with this names an opponent for the shield's opening drive. */
    public static final String MOVE_PREFIX = "shield-move:";
    /** SHIELD-18: a line starting with this gives an opponent's shipped aim. */
    public static final String AIM_PREFIX = "shield-aim:";
    /** DODGE-3: a line starting with this names an opponent the duel surf dodges simple aims against. */
    public static final String DODGE_PREFIX = "shot-dodge:";
    /**
     * DODGE-4: a line starting with this, {@code shot-dodge2: expert name}, names an opponent the
     * shot-dodge planner (DODGE-6) is for, with the expert shipped for it (DODGE-2's index), or -1
     * to learn it in the battle.
     */
    public static final String DODGE_PLAN_PREFIX = "shot-dodge2:";
    /** POISON-2: a line starting with this names an opponent the duel plays stop-and-go against (WavePoison). */
    public static final String STOP_GO_PREFIX = "stop-go:";
    /** POISON-2: the same with the reverse crawl two ticks before the enemy's gun is ready (WavePoisonShift). */
    public static final String STOP_GO_SHIFT_PREFIX = "stop-go2:";

    /** MOVE-28: a line starting with this names an opponent the duel plays MOVE-13's stop-and-start against. */
    public static final String HEAT_JIT_PREFIX = "heat-jit:";
    /** GUN-11: a line starting with this names an opponent the duel gun aims at with GUN-8 to GUN-10 on. */
    public static final String GUN_STACK_PREFIX = "gun-stack:";
    /** SHIELD-19: a line starting with this names an opponent SHIELD-11 leaves the battle against at 400 damage. */
    public static final String EXIT_LATE_PREFIX = "shield-exit4:";
    /** SHIELD-19: a line starting with this names an opponent SHIELD-11 takes no damage exit against. */
    public static final String EXIT_OFF_PREFIX = "shield-exit0:";
    /** SHIELD-21: a line starting with this names an opponent shield mode plans its shots still against (SHIELD-20). */
    public static final String STILL_PREFIX = "shield-still:";
    /** MOVE-32: a line starting with this names an opponent the duel surfs with the flattener views on (MOVE-24 undone). */
    public static final String FLAT_ON_PREFIX = "flat-on:";
    /** MOVE-34: a line starting with this names an opponent the duel surfs with the learning-gun mimics as aim members (MOVE-33). */
    public static final String MIMIC_ON_PREFIX = "mimic-on:";
    /** POW-15: a line starting with this names an opponent the duel never fires the full-power rules (POW-1 to POW-4) at. */
    public static final String FULL_OFF_PREFIX = "full-off:";
    /** POW-16: a line starting with this names an opponent the duel fires only x.x5 powers at. */
    public static final String X5_POWER_PREFIX = "x5-power:";
    /** POW-17: a line starting with this names an opponent the duel picks its power against by the energy race. */
    public static final String RACE_POWER_PREFIX = "race-power:";
    /** MIR-2: a line starting with this names an opponent the duel never runs MIR-1 against. */
    public static final String MIRROR_OFF_PREFIX = "mirror-off:";
    /**
     * SKEY-2: a line starting with this gives an opponent's surf key: nine multipliers on the hit
     * views' key weights, one on the kernel width, then the name ({@code "m1 ... m9 bw name"}).
     */
    public static final String SURF_KEY_PREFIX = "surf-key:";
    /** SKEY-2: the numbers a surf-key line carries before the name. */
    public static final int SURF_KEY_VALUES = 10;
    /** MOVE-28: the per-opponent switch's bit in {@link #switches}. */
    static final int HEAT_JIT = 1;
    /** GUN-11: the per-opponent switch's bit in {@link #switches}. */
    static final int GUN_STACK = 2;
    /** SHIELD-19: the per-opponent switches' bits in {@link #switches}. */
    static final int EXIT_LATE = 4;
    static final int EXIT_OFF = 8;
    /** SHIELD-21: the per-opponent still switch's bit in {@link #switches}. */
    static final int STILL = 16;
    /** MOVE-32: the per-opponent flattener switch's bit in {@link #switches}. */
    static final int FLAT_ON = 32;
    /** MOVE-34: the per-opponent mimic switch's bit in {@link #switches}. */
    static final int MIMIC_ON = 64;
    /** POW-15: the per-opponent full-power-off switch's bit in {@link #switches}. */
    static final int FULL_OFF = 128;
    /** POW-16: the per-opponent x.x5 power switch's bit in {@link #switches}. */
    static final int X5_POWER = 256;
    /** POW-17: the per-opponent energy-race power switch's bit in {@link #switches}. */
    static final int RACE_POWER = 1024;
    /** MIR-2: the per-opponent mirror-off switch's bit in {@link #switches}. */
    static final int MIRROR_OFF = 2048;

    private final Set<String> entries;
    /** SHIELD-17: the opening-drive list. */
    private final Set<String> moves;
    /** SHIELD-18: name to {predictor, offset}. */
    private final Map<String, double[]> aims;
    /** DODGE-3: the simple-aim dodge list. */
    private final Set<String> dodges;
    /** POISON-2: name to the reverse crawl's ticks before the enemy's gun is ready (1 or 2). */
    private final Map<String, Integer> stopGo;
    /** DODGE-4: name to the shipped expert, -1 for none. */
    private Map<String, Integer> dodgePlans = Collections.emptyMap();
    /** MOVE-28, GUN-11: name to the per-opponent switches' bits. */
    private Map<String, Integer> switches = Collections.emptyMap();
    /** SKEY-2: name to its surf key (nine weight multipliers, then the kernel width's). */
    private Map<String, double[]> surfKeys = Collections.emptyMap();

    private ShieldList(Set<String> entries, Set<String> moves, Map<String, double[]> aims,
                       Set<String> dodges, Map<String, Integer> stopGo) {
        this.entries = entries;
        this.moves = moves;
        this.aims = aims;
        this.dodges = dodges;
        this.stopGo = stopGo;
    }

    /**
     * Reads a list from its lines.
     *
     * @param lines the list's lines, comments and blanks included
     * @return the list; {@link #NONE} when no line names a robot
     */
    public static ShieldList parse(Iterable<String> lines) {
        Set<String> entries = new TreeSet<>();
        Set<String> moves = new TreeSet<>();
        Map<String, double[]> aims = new TreeMap<>();
        Set<String> dodges = new TreeSet<>();
        Map<String, Integer> stopGo = new TreeMap<>();
        Map<String, Integer> dodgePlans = new TreeMap<>();
        Map<String, Integer> switches = new TreeMap<>();
        Map<String, double[]> surfKeys = new TreeMap<>();
        if (lines != null) {
            for (String line : lines) {
                if (line == null) continue;
                String entry = line.trim().replaceAll("\\s+", " ");
                if (entry.isEmpty() || entry.startsWith("#")) continue;
                int bit = entry.startsWith(HEAT_JIT_PREFIX) ? HEAT_JIT : entry.startsWith(GUN_STACK_PREFIX) ? GUN_STACK
                    : entry.startsWith(EXIT_LATE_PREFIX) ? EXIT_LATE : entry.startsWith(EXIT_OFF_PREFIX) ? EXIT_OFF
                    : entry.startsWith(STILL_PREFIX) ? STILL : entry.startsWith(FLAT_ON_PREFIX) ? FLAT_ON
                    : entry.startsWith(MIMIC_ON_PREFIX) ? MIMIC_ON
                    : entry.startsWith(FULL_OFF_PREFIX) ? FULL_OFF
                    : entry.startsWith(X5_POWER_PREFIX) ? X5_POWER
                    : entry.startsWith(RACE_POWER_PREFIX) ? RACE_POWER
                    : entry.startsWith(MIRROR_OFF_PREFIX) ? MIRROR_OFF : 0;
                if (bit != 0) {
                    String name = entry.substring(entry.indexOf(':') + 1).trim();
                    if (!name.isEmpty() && (switches.containsKey(name) || switches.size() < MAX_ENTRIES)) {
                        switches.merge(name, bit, (a, b) -> a | b);
                    }
                    continue;
                }
                if (entry.startsWith(SURF_KEY_PREFIX)) {
                    String[] p = entry.substring(SURF_KEY_PREFIX.length()).trim().split(" ", SURF_KEY_VALUES + 1);
                    if (p.length == SURF_KEY_VALUES + 1 && !p[SURF_KEY_VALUES].isEmpty() && surfKeys.size() < MAX_ENTRIES) {
                        try {
                            double[] key = new double[SURF_KEY_VALUES];
                            boolean ok = true;
                            for (int i = 0; i < SURF_KEY_VALUES; i++) {
                                key[i] = Double.parseDouble(p[i]);
                                ok &= key[i] > 0 && !Double.isInfinite(key[i]);
                            }
                            if (ok) surfKeys.put(p[SURF_KEY_VALUES], key);
                        } catch (NumberFormatException e) {
                            // A malformed surf-key line is skipped.
                        }
                    }
                    continue;
                }
                if (entry.startsWith(MOVE_PREFIX)) {
                    String name = entry.substring(MOVE_PREFIX.length()).trim();
                    if (!name.isEmpty() && moves.size() < MAX_ENTRIES) moves.add(name);
                    continue;
                }
                // The shift prefix first: "stop-go2:" also starts with "stop-go".
                if (entry.startsWith(STOP_GO_SHIFT_PREFIX) || entry.startsWith(STOP_GO_PREFIX)) {
                    boolean shift = entry.startsWith(STOP_GO_SHIFT_PREFIX);
                    String name = entry.substring((shift ? STOP_GO_SHIFT_PREFIX : STOP_GO_PREFIX).length()).trim();
                    if (!name.isEmpty() && stopGo.size() < MAX_ENTRIES) stopGo.put(name, shift ? 2 : 1);
                    continue;
                }
                // Before the dodge prefix: "shot-dodge2:" does not start with "shot-dodge:", but keep the order safe.
                if (entry.startsWith(DODGE_PLAN_PREFIX)) {
                    String[] p = entry.substring(DODGE_PLAN_PREFIX.length()).trim().split(" ", 2);
                    if (p.length == 2 && !p[1].isEmpty() && dodgePlans.size() < MAX_ENTRIES) {
                        try {
                            int expert = Integer.parseInt(p[0]);
                            if (expert >= -1 && expert < ShotDodger.EXPERTS) dodgePlans.put(p[1], expert);
                        } catch (NumberFormatException e) {
                            // A malformed plan line is skipped.
                        }
                    }
                    continue;
                }
                if (entry.startsWith(DODGE_PREFIX)) {
                    String name = entry.substring(DODGE_PREFIX.length()).trim();
                    if (!name.isEmpty() && dodges.size() < MAX_ENTRIES) dodges.add(name);
                    continue;
                }
                if (entry.startsWith(AIM_PREFIX)) {
                    String[] p = entry.substring(AIM_PREFIX.length()).trim().split(" ", 3);
                    if (p.length == 3 && aims.size() < MAX_ENTRIES) {
                        try {
                            int predictor = Integer.parseInt(p[0]);
                            double offset = Double.parseDouble(p[1]);
                            if (predictor >= 0 && !Double.isNaN(offset) && !Double.isInfinite(offset)) {
                                aims.put(p[2], new double[] {predictor, offset});
                            }
                        } catch (NumberFormatException e) {
                            // A malformed aim line is skipped.
                        }
                    }
                    continue;
                }
                if (entries.size() >= MAX_ENTRIES) continue;
                entries.add(entry);
            }
        }
        if (entries.isEmpty() && moves.isEmpty() && aims.isEmpty() && dodges.isEmpty()
            && stopGo.isEmpty() && dodgePlans.isEmpty() && switches.isEmpty() && surfKeys.isEmpty()) return NONE;
        ShieldList list = new ShieldList(Collections.unmodifiableSet(entries),
            Collections.unmodifiableSet(moves), Collections.unmodifiableMap(aims), Collections.unmodifiableSet(dodges),
            Collections.unmodifiableMap(stopGo));
        list.dodgePlans = Collections.unmodifiableMap(dodgePlans);
        list.switches = Collections.unmodifiableMap(switches);
        list.surfKeys = Collections.unmodifiableMap(surfKeys);
        return list;
    }

    /**
     * Whether {@code robotName}, as the engine names a scanned robot ({@code package.Class
     * version}), is on the list: its full name is, or its name without the version is.
     *
     * @param robotName the scanned robot's name, or null
     * @return whether shield mode applies to it
     */
    public boolean matches(String robotName) {
        if (robotName == null || entries.isEmpty()) return false;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return entries.contains(name) || entries.contains(withoutVersion(name));
    }

    /**
     * SHIELD-17: whether the shield's opening drive is for {@code robotName}, by the rule of
     * {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     * @return whether it is on the opening-drive list
     */
    public boolean moves(String robotName) {
        if (robotName == null || moves.isEmpty()) return false;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return moves.contains(name) || moves.contains(withoutVersion(name));
    }

    /**
     * SKEY-2: {@code robotName}'s surf key, by the rule of {@link #matches}: the full name's entry,
     * else the name's without the version.
     *
     * @param robotName the scanned robot's name, or null
     * @return a fresh array of nine weight multipliers and the kernel width's, or null when none is shipped
     */
    public double[] surfKeyFor(String robotName) {
        if (robotName == null || surfKeys.isEmpty()) return null;
        String name = robotName.trim().replaceAll("\\s+", " ");
        double[] k = surfKeys.get(name);
        if (k == null) k = surfKeys.get(withoutVersion(name));
        return k == null ? null : k.clone();
    }

    /**
     * SHIELD-18: {@code robotName}'s shipped aim, by the rule of {@link #matches}: the full name's
     * entry, else the name's without the version.
     *
     * @param robotName the scanned robot's name, or null
     * @return a fresh {predictor, offset}, or null when none is shipped
     */
    public double[] aimFor(String robotName) {
        if (robotName == null || aims.isEmpty()) return null;
        String name = robotName.trim().replaceAll("\\s+", " ");
        double[] a = aims.get(name);
        if (a == null) a = aims.get(withoutVersion(name));
        return a == null ? null : a.clone();
    }

    /**
     * DODGE-3: whether the duel surf dodges simple aims against {@code robotName}, by the rule of
     * {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     * @return whether it is on the dodge list
     */
    public boolean dodges(String robotName) {
        if (robotName == null || dodges.isEmpty()) return false;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return dodges.contains(name) || dodges.contains(withoutVersion(name));
    }

    /**
     * DODGE-4: the shot-dodge planner's entry for {@code robotName}, by the rule of
     * {@link #matches}: the shipped expert, -1 to learn it, or {@link #NO_DODGE_PLAN} when it is
     * not listed.
     *
     * @param robotName the scanned robot's name, or null
     */
    public int dodgePlan(String robotName) {
        if (robotName == null || dodgePlans.isEmpty()) return NO_DODGE_PLAN;
        String name = robotName.trim().replaceAll("\\s+", " ");
        Integer e = dodgePlans.get(name);
        if (e == null) e = dodgePlans.get(withoutVersion(name));
        return e == null ? NO_DODGE_PLAN : e;
    }

    /** DODGE-4: {@link #dodgePlan} for an opponent not listed. */
    public static final int NO_DODGE_PLAN = -2;

    /**
     * POISON-2: the stop-and-go variant for {@code robotName}, by the rule of {@link #matches}: the
     * reverse crawl's ticks before the enemy's gun is ready, 1 or 2; 0 when it is not listed.
     *
     * @param robotName the scanned robot's name, or null
     */
    public int stopGo(String robotName) {
        if (robotName == null || stopGo.isEmpty()) return 0;
        String name = robotName.trim().replaceAll("\\s+", " ");
        Integer v = stopGo.get(name);
        if (v == null) v = stopGo.get(withoutVersion(name));
        return v == null ? 0 : v;
    }

    /**
     * MOVE-28: whether the duel plays MOVE-13's stop-and-start against {@code robotName}, by the
     * rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean heatJit(String robotName) {
        return (switchBits(robotName) & HEAT_JIT) != 0;
    }

    /**
     * GUN-11: whether the duel gun aims at {@code robotName} with GUN-8 to GUN-10 on, by the rule of
     * {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean gunStack(String robotName) {
        return (switchBits(robotName) & GUN_STACK) != 0;
    }

    /**
     * SHIELD-19: the damage the enemy's bullets must pass before SHIELD-11 leaves the battle against
     * {@code robotName}, by the rule of {@link #matches}: no damage exit for an {@code shield-exit0:}
     * entry, 400 for an {@code shield-exit4:} entry (the former when both), else {@code standard}.
     *
     * @param robotName the scanned robot's name, or null
     * @param standard the exit for an opponent not named
     */
    public double stayDamage(String robotName, double standard) {
        int bits = switchBits(robotName);
        if ((bits & EXIT_OFF) != 0) return Double.MAX_VALUE;
        if ((bits & EXIT_LATE) != 0) return ShieldDesign.STAY_DAMAGE_LATE;
        return standard;
    }

    /**
     * SHIELD-21: whether shield mode plans its shots still (SHIELD-20) against {@code robotName},
     * by the rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean still(String robotName) {
        return (switchBits(robotName) & STILL) != 0;
    }

    /**
     * MIR-2: whether the duel never runs MIR-1 (mirror detection, its drive and its aim) against
     * {@code robotName}, by the rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean mirrorOff(String robotName) {
        return (switchBits(robotName) & MIRROR_OFF) != 0;
    }

    /**
     * MOVE-32: whether the duel surfs {@code robotName} with the flattener views on, by the rule of
     * {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean flatOn(String robotName) {
        return (switchBits(robotName) & FLAT_ON) != 0;
    }

    /**
     * MOVE-34: whether the duel surfs {@code robotName} with MOVE-33's learning-gun mimics as aim
     * members, by the rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean mimicOn(String robotName) {
        return (switchBits(robotName) & MIMIC_ON) != 0;
    }

    /**
     * POW-15: whether the duel keeps the gun's own power against {@code robotName}, never a
     * full-power rule (POW-1 to POW-4), by the rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean fullOff(String robotName) {
        return (switchBits(robotName) & FULL_OFF) != 0;
    }

    /**
     * POW-16: whether the duel fires only x.x5 powers at {@code robotName}, by the rule of {@link #matches}.
     *
     * @param robotName the scanned robot's name, or null
     */
    public boolean x5Power(String robotName) {
        return (switchBits(robotName) & X5_POWER) != 0;
    }

    /**
     * POW-17: whether the table names this opponent for the energy-race power pick.
     *
     * @param robotName the opponent's name as Robocode lists it
     * @return true when a {@code race-power:} line matches it
     */
    public boolean racePower(String robotName) {
        return (switchBits(robotName) & RACE_POWER) != 0;
    }

    private int switchBits(String robotName) {
        if (robotName == null || switches.isEmpty()) return 0;
        String name = robotName.trim().replaceAll("\\s+", " ");
        return switches.getOrDefault(name, 0) | switches.getOrDefault(withoutVersion(name), 0);
    }

    /** Whether nobody is on the (shield) list. */
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    /** How many entries the list holds. */
    public int size() {
        return entries.size();
    }

    /** The name before its first space: Robocode's class names hold none, so what follows is the version. */
    static String withoutVersion(String name) {
        int space = name.indexOf(' ');
        return space < 0 ? name : name.substring(0, space);
    }
}
