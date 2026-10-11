package hadur2.core.role;

import hadur2.core.model.Baton;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotOrders;

/**
 * The strand contract (A2): every strand's brain sits behind one of these, and the conductor
 * runs the same steps whichever role drives. A brain never implements it itself; the
 * conductor's seam for that brain does, turning each {@link Tick} into the brain's own
 * arguments, so dependencies run one way, from conductor to brain.
 *
 * <p>Per tick: the conductor offers each event to the roles of the charter, Melee before
 * Duel, in the engine's order ({@link #observe}, ROLE-5); then the driving role alone fills
 * the orders ({@link #drive}, WEAVE-1). {@code observe} gets no orders to write: only the
 * driving role originates a tick's orders.</p>
 */
public interface Role {

    /** Which role this is. */
    RoleId id();

    /** Before the first tick: open the shelf it was handed. */
    void prepare();

    /** A new round starts. */
    void newRound(RoundFacts round);

    /** The round is over: fold what was learned onto its own shelf. */
    void roundEnded(RoundResult result);

    /** At most once a battle (MEM-10): write its shelf, statistics only. */
    void checkpoint(long tick);

    /** The battle is over: the final save. */
    void battleEnded(long tick);

    /** Every role of the charter, driving or not, is offered the tick's events (ROLE-5). */
    void observe(BotEvent event, Tick tick);

    /** The driving role only: this tick's orders (WEAVE-1), shooting only with the permission (WEAVE-3). */
    void drive(Tick tick, BotOrders.Builder out);

    /** About to drive mid-round: a clean slate. */
    void reset();

    /** Asked inside the survivor's first scan: what this role hands the next. */
    Baton give(Tick tick);

    /** In that scan, after the opponent switch: take what the last role handed over. */
    void take(Baton baton, Tick tick);

    /** RES-1: drop transient state after a fault. */
    void recover();
}
