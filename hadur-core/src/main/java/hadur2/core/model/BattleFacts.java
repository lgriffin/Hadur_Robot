package hadur2.core.model;

import java.util.List;
import java.util.Objects;

/**
 * What the engine says about the battle before its first tick (ROLE-1): the field, the
 * robots against us and the teammates beside us. The adapter reads them in {@code run()}
 * and the core fixes its charter from them. A null or empty roster means no team; until the
 * adapter is a {@code TeamRobot} (A4) the roster is always empty.
 */
public final class BattleFacts {

    private final double width;
    private final double height;
    private final int others;
    private final List<String> teammates;

    /**
     * @param width the field's width in px
     * @param height the field's height in px
     * @param others the engine's count of other robots at the start, sentries excluded
     * @param teammates the other members of our team, in roster order; null or empty for none
     */
    public BattleFacts(double width, double height, int others, List<String> teammates) {
        this.width = width;
        this.height = height;
        this.others = others;
        this.teammates = teammates == null ? List.of() : List.copyOf(teammates);
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BattleFacts)) return false;
        BattleFacts b = (BattleFacts) o;
        return width == b.width && height == b.height && others == b.others && teammates.equals(b.teammates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, others, teammates);
    }

    @Override
    public String toString() {
        return "BattleFacts[" + width + "x" + height + ", others=" + others + ", teammates=" + teammates + "]";
    }
}
