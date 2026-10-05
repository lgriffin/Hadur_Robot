package hadur2.core.model;

import java.util.List;
import java.util.Objects;

/**
 * What the engine says about the battle before its first tick (ROLE-1): the field, the
 * robots against us and the teammates beside us. The adapter reads them in {@code run()}
 * and the core fixes its charter from them. A null or empty roster means no team. From A4
 * the adapter is a {@code TeamRobot} and passes the roster, its own name, its starting
 * energy and the sentry border too.
 */
public final class BattleFacts {

    private final double width;
    private final double height;
    private final int others;
    private final List<String> teammates;
    private final String name;
    private final double startingEnergy;
    private final double sentryBorder;

    /** A team leader starts each round with 200 energy, every other robot with 100. */
    public static final double LEADER_ENERGY = 200;

    /**
     * @param width the field's width in px
     * @param height the field's height in px
     * @param others the engine's count of other robots at the start, sentries excluded
     * @param teammates the other members of our team, in roster order; null or empty for none
     */
    public BattleFacts(double width, double height, int others, List<String> teammates) {
        this(width, height, others, teammates, "", 100, 0);
    }

    /**
     * The adapter's facts (A4).
     *
     * @param width the field's width in px
     * @param height the field's height in px
     * @param others the engine's count of other robots at the start, sentries excluded
     * @param teammates the other members of our team, in roster order; null or empty for none
     * @param name our own name as the engine gives it
     * @param startingEnergy our energy before the first tick: 200 for a team's leader
     * @param sentryBorder the sentry border's size in px; 0 when it does not matter
     */
    public BattleFacts(double width, double height, int others, List<String> teammates, String name,
                       double startingEnergy, double sentryBorder) {
        this.width = width;
        this.height = height;
        this.others = others;
        this.teammates = teammates == null ? List.of() : List.copyOf(teammates);
        this.name = name == null ? "" : name;
        this.startingEnergy = startingEnergy;
        this.sentryBorder = sentryBorder;
    }

    /** Facts for a battle with no team. */
    public static BattleFacts solo(double width, double height, int others) {
        return new BattleFacts(width, height, others, List.of());
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    /** The engine's count of other robots at the start, teammates included, sentries not. */
    public int others() {
        return others;
    }

    /** The robots against us at the start: the others less the roster. */
    public int enemies() {
        return Math.max(0, others - teammates.size());
    }

    /** The other members of our team, in roster order; empty off a team. */
    public List<String> teammates() {
        return teammates;
    }

    /** Our own name as the engine gives it; empty when not known. */
    public String name() {
        return name;
    }

    /** Our energy before the first tick. */
    public double startingEnergy() {
        return startingEnergy;
    }

    /** The sentry border's size in px; 0 when it does not matter. */
    public double sentryBorder() {
        return sentryBorder;
    }

    /**
     * Whether we lead our team: only the leader starts with {@link #LEADER_ENERGY}, so each
     * member knows it from its own energy and none waits on a message. Never off a team.
     */
    public boolean leads() {
        return !teammates.isEmpty() && startingEnergy >= LEADER_ENERGY;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BattleFacts)) return false;
        BattleFacts b = (BattleFacts) o;
        return width == b.width && height == b.height && others == b.others && teammates.equals(b.teammates)
            && name.equals(b.name) && startingEnergy == b.startingEnergy && sentryBorder == b.sentryBorder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, others, teammates, name, startingEnergy, sentryBorder);
    }

    @Override
    public String toString() {
        return "BattleFacts[" + width + "x" + height + ", others=" + others + ", teammates=" + teammates
            + ", name=" + name + ", startingEnergy=" + startingEnergy + ", sentryBorder=" + sentryBorder + "]";
    }
}
