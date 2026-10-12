package hadur2.core.shieldmode;

import java.util.Locale;

/**
 * Which of Nullstride's shield differences shield mode takes (SHIELD-8 to SHIELD-12). Each is
 * one switch, so they can be benched one at a time against the shipped mode
 * (docs/plan-90.md, step 1; {@code hadur-bench/build-ablation.sh}). {@link #SHIPPED} is what
 * the robot runs (SHIELD-13): since 3.13, {@code hold}, {@code learn}, {@code mode} and
 * {@code stay}, the build plan-90's step 3 swept Nullstride's list with; {@code turn} stays
 * off. With every switch off ({@link #NONE}), shield mode is exactly 3.12's.
 *
 * <ul>
 * <li>{@code hold} (SHIELD-8): never fire at the enemy while shielding; the gun points at it
 *     and holds, unless the enemy is disabled.</li>
 * <li>{@code learn} (SHIELD-9): an enemy bullet our shield bullet met teaches the predictors
 *     its true heading, as a bullet that hit us does.</li>
 * <li>{@code mode} (SHIELD-10): a learned offset is the error that recurs most often, within
 *     {@link ShieldMode#EXACT}, among the last {@link #KEPT_ERRORS}, not the running mean.</li>
 * <li>{@code stay} (SHIELD-11): no exit inside a round; the battle's exit comes once the enemy's
 *     bullets have done {@link #STAY_DAMAGE} damage, or when it has not fired by tick
 *     {@link #SILENT_TICKS} of a round.</li>
 * <li>{@code turn} (SHIELD-12): a fifth head-on base that adds the enemy's body turn on the
 *     firing tick.</li>
 * </ul>
 */
public final class ShieldDesign {

    /** SHIELD-10: the errors kept per base for the most frequent one. */
    public static final int KEPT_ERRORS = 500;
    /** SHIELD-11: the enemy's bullet damage in a battle after which the mode is off for it. */
    public static final double STAY_DAMAGE = 150;
    /** SHIELD-11: a round tick by which an enemy that has not fired turns the mode off. */
    public static final long SILENT_TICKS = 300;

    /** 3.12's shield: every switch off. */
    public static final ShieldDesign NONE = new ShieldDesign(false, false, false, false, false);

    /** The design the robot ships (SHIELD-13). The ablation builds edit this one line. */
    public static final ShieldDesign SHIPPED = parse("hold,learn,mode,stay");

    /** SHIELD-8: no attack shots while shielding. */
    public final boolean hold;
    /** SHIELD-9: learn from intercepted bullets. */
    public final boolean learn;
    /** SHIELD-10: the most frequent offset, not the mean. */
    public final boolean mode;
    /** SHIELD-11: no in-round exits; the battle's exit at 150 damage or a silent enemy. */
    public final boolean stay;
    /** SHIELD-12: the body-turn base. */
    public final boolean turn;

    private ShieldDesign(boolean hold, boolean learn, boolean mode, boolean stay, boolean turn) {
        this.hold = hold;
        this.learn = learn;
        this.mode = mode;
        this.stay = stay;
        this.turn = turn;
    }

    /**
     * The design a comma-separated list of switch names turns on ({@code hold}, {@code learn},
     * {@code mode}, {@code stay}, {@code turn}, or {@code all}); blank is {@link #NONE}.
     *
     * @param flags the switches
     * @return the design
     * @throws IllegalArgumentException for an unknown name
     */
    public static ShieldDesign parse(String flags) {
        boolean hold = false, learn = false, mode = false, stay = false, turn = false;
        for (String raw : flags.split(",")) {
            String f = raw.trim().toLowerCase(Locale.ROOT);
            switch (f) {
                case "": break;
                case "hold": hold = true; break;
                case "learn": learn = true; break;
                case "mode": mode = true; break;
                case "stay": stay = true; break;
                case "turn": turn = true; break;
                case "all": hold = learn = mode = stay = turn = true; break;
                default: throw new IllegalArgumentException("unknown shield switch: " + raw);
            }
        }
        if (!(hold || learn || mode || stay || turn)) return NONE;
        return new ShieldDesign(hold, learn, mode, stay, turn);
    }

    /** The head-on bases the predictors use: four, or five with the body-turn base. */
    public int bases() {
        return turn ? ShieldMode.MAX_BASES : ShieldMode.BASES;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        if (hold) b.append(",hold");
        if (learn) b.append(",learn");
        if (mode) b.append(",mode");
        if (stay) b.append(",stay");
        if (turn) b.append(",turn");
        return b.length() == 0 ? "none" : b.substring(1);
    }
}
