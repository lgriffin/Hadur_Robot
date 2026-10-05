package hadur2.core.role;

import hadur2.core.model.BotInput;
import java.util.function.Predicate;

/**
 * What the conductor hands a role on every call of a tick (A2): the input, which role drives
 * this tick, the Duel's focus as it stands, which names are sentries, and whether the tick is
 * in duress (RES-9). For {@link Role#drive} it also carries the budget level as it stands
 * after the events and the fire permission (WEAVE-3); until A5 the permission is always given.
 *
 * <p>The focus is the conductor's live {@link DuelFocus}: a scan can re-choose it mid-tick,
 * and the next event sees the new choice, as it did before A2.</p>
 */
public final class Tick {

    private final BotInput in;
    private final RoleId driving;
    private final boolean focusing;
    private final DuelFocus focus;
    private final Predicate<String> sentry;
    private final boolean duress;
    private final int level;
    private final boolean mayFire;

    /**
     * A tick as its events are offered.
     *
     * @param in the tick's input
     * @param driving the role chosen to drive
     * @param focusing whether the Duel fights one of several opponents
     * @param focus the Duel's focus, live
     * @param sentry which names are sentries (GATE-5)
     * @param duress whether the tick runs in duress
     */
    public Tick(BotInput in, RoleId driving, boolean focusing, DuelFocus focus, Predicate<String> sentry,
                boolean duress) {
        this(in, driving, focusing, focus, sentry, duress, -1, false);
    }

    private Tick(BotInput in, RoleId driving, boolean focusing, DuelFocus focus, Predicate<String> sentry,
                 boolean duress, int level, boolean mayFire) {
        this.in = in;
        this.driving = driving;
        this.focusing = focusing;
        this.focus = focus;
        this.sentry = sentry;
        this.duress = duress;
        this.level = level;
        this.mayFire = mayFire;
    }

    /**
     * The tick as the driving role drives it.
     *
     * @param driving the role that drives, which a fault may have changed since the events
     * @param focusing whether the Duel fights one of several opponents
     * @param level the budget level after the events
     * @param mayFire WEAVE-3: whether a shot may leave this tick
     * @return the tick for {@link Role#drive}
     */
    public Tick forDrive(RoleId driving, boolean focusing, int level, boolean mayFire) {
        return new Tick(in, driving, focusing, focus, sentry, duress, level, mayFire);
    }

    public BotInput in() {
        return in;
    }

    /** The role that drives this tick. */
    public RoleId driving() {
        return driving;
    }

    /** Whether the Duel fights one of several opponents alive. */
    public boolean focusing() {
        return focusing;
    }

    /** The Duel's focus, as it stands. */
    public DuelFocus focus() {
        return focus;
    }

    /** Whether {@code name} is a sentry seen this battle. */
    public boolean isSentry(String name) {
        return sentry.test(name);
    }

    /**
     * Whether an event naming {@code name} is outside the duel: a sentry, or, while the duel
     * fights one of several opponents, anyone but that one.
     */
    public boolean foreign(String name) {
        if (sentry.test(name)) return true;
        return focusing && !name.equals(focus.target());
    }

    /** Whether the tick runs in duress (RES-9). */
    public boolean duress() {
        return duress;
    }

    /** The budget level after the events; -1 before {@link #forDrive}. */
    public int level() {
        return level;
    }

    /** WEAVE-3: whether a shot may leave this tick; false before {@link #forDrive}. */
    public boolean mayFire() {
        return mayFire;
    }
}
