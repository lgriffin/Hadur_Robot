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

    /**
     * MOVE-15: movement by the enemy's gun (meant to be built with {@link #HEAT_WAVE}). Once enough
     * of the enemy's hits on us are of the learned class, the surf takes the protean pick at the
     * hot setting on the held gun-heat wave; until then it takes the gun-heat wave afresh each
     * tick (the stop-and-start), which does well against simple guns. When true it decides the
     * hold and the protean switch; {@link #HEAT_HOLD} and {@link #PROTEAN} are then not read.
     */
    static final boolean GUN_SPLIT = false;

    /**
     * MOVE-16: the danger views' weights evolve by the replicator equation. Each enemy bullet that
     * hits us multiplies a view's weight by how well it predicted the bullet's angle relative to
     * the weighted average, with every view's share kept at 2% or more; off, the weights are fixed.
     */
    static final boolean REPLICATOR = false;

    /**
     * MOVE-17: the gun-heat wave (meant to be built with {@link #HEAT_WAVE} and
     * {@link #HEAT_HOLD} false) is offered only while the enemy's gun is not a learning one by
     * MOVE-15's count, so the stop-and-start is dropped against learning guns. Once the gun is
     * called learning the surf is as with the gun-heat wave off. {@link #GUN_SPLIT}, if on, wins:
     * the gate is then not read.
     */
    static final boolean GUN_GATE = false;

    /**
     * DIST-3: no DIST-1 walk-in in a duel. The desired distance stays at the opening's (650 for a
     * stranger) for the whole battle; END-1's finishing distance is unchanged.
     */
    static final boolean HOLD_650 = false;

    /**
     * MOVE-18: the surf's distancing factor is measured to the enemy's last scanned position
     * (as Diamond does) rather than to the wave's source.
     */
    static final boolean DISTANCING_TO_ENEMY = false;

    /**
     * MOVE-19: an enemy bullet our bullet destroys teaches the hit views the guess factor it
     * was fired at, as a hit on us does (Diamond's onBulletHitBullet).
     */
    static final boolean BULLET_HIT_BULLET_LOG = false;

    /**
     * MOVE-20: every hit on us and every intercept clears the surf's cached neighbour searches,
     * not only a change of the surfed wave.
     */
    static final boolean HIT_CLEARS_CACHE = false;

    /**
     * MOVE-21: the danger kernel is the point value 2^-|u| at the intersection's centre
     * (Diamond's), not MOVE-4's integral over the intersection.
     */
    static final boolean POINT_KERNEL = false;

    /**
     * TIME-6: a skipped turn (level 1) no longer drops the surf's second wave for the rest of
     * the round; it is dropped from level 2, where the k halving and the go-to shedding also stay.
     */
    static final boolean KEEP_SECOND_WAVE = false;

    /**
     * MOVE-23: the stop-and-start stack (MOVE-13 heatjit, SHIELD-14 swall, and MOVE-20, MOVE-21
     * and TIME-6 whenever those are on) applies only to opponents not on the stack off-list;
     * a listed opponent plays as if those switches were off. The decision is made per
     * opponent at run time; with this off the switches are the compile-time ones alone.
     */
    static final boolean STACK_LIST = false;

    /**
     * AES-1 (measurement): each wave's first three-option rating is printed as an {@code AES}
     * record with every term of each option's danger (docs/plan-aes.md). Behaviour unchanged.
     */
    static final boolean AES_RECORD = false;

    private MoveDesign() { }
}
