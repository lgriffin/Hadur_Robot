package hadur2.core.duel;

/** Duel-side switches for movement experiments; the move package never reads them. */
final class MoveDesign {
    /** MOVE-11: surf the enemy's next shot before it leaves, when its gun is about to be cool. */
    static final boolean HEAT_WAVE = false;

    /**
     * MOVE-13: with the gun-heat wave on, false surfs each tick's newest movement wave instead of
     * holding one, so the surf re-ranks every tick and stops and starts (the first MOVE-11 build).
     */
    static final boolean HEAT_HOLD = true;

    /** MOVE-12: the first wave's danger is scaled by the escape-angle position term (BeepBoop's). */
    static final boolean ESCAPE_ROOM = false;

    /**
     * MOVE-14: while the enemy's gun is cool and no real bullet is within 10 ticks, the surf draws
     * its option from the protean pick (a softmin over the option dangers, a replaying chaotic die)
     * instead of taking the least danger.
     */
    static final boolean PROTEAN = false;

    /** MOVE-14: the protean pick's mean dwell, in ticks; 1 re-picks every tick. */
    static final int PROTEAN_DWELL = 1;

    private MoveDesign() { }
}
