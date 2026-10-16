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

    private MoveDesign() { }
}
