package hadur117.core.duel;

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
     * RAM-4: once the opponent is a confirmed rammer (RAM-2), the duel plays as with heatjit on
     * (MOVE-11's gun-heat wave offered, MOVE-13's hold off) for the rest of the battle. The
     * top-5 factorial put all of heatjit's gain on the rammers (+1.4 points) and a small loss on
     * ranks 51-400, so this keeps the gain where it was measured. Off by default.
     */
    static final boolean RAM_HEAT = false;

    /**
     * RAM-5: while RAM-2's escape drives, each path it weighs loses closest approach for every
     * aim (head-on, linear) one of the rammer's shots in flight would hit it with. The 2026-10-28
     * rammer read (docs/bench/gap-to-2nd.md): against 12 nano rammers a linear aim would hit the
     * escape on 52% of shots, Saguaro on 35%. On since pc-1v1-ram (PR #394): +0.11 ± 0.04 APS over 45 rammers.
     */
    static final boolean RAM_BREAK = true;

    /**
     * MOVE-24: in a duel the flattener views stay off (3.15). The top-5 factorial (PR #221) put
     * flattener off at +0.12 +/- 0.10 APS on 1,212 bots, and the release-candidate census (PR #222)
     * put it with swall at +0.34 +/- 0.15. Melee and team are untouched.
     */
    static final boolean FLATTENER_OFF = true;

    /**
     * AES-1 (measurement): each wave's first three-option rating is printed as an {@code AES}
     * record with every term of each option's danger (docs/plan-aes.md). Behaviour unchanged.
     */
    static final boolean AES_RECORD = false;

    /**
     * ORACLE-1 (measurement, K0 of the road to king): each wave's first three-option rating also
     * prints an {@code ORC} record with every danger view's neighbours on the wave, for the offline
     * enemy-gun oracle ({@code data/tools/gun_oracle.py}). Behaviour unchanged.
     */
    static final boolean ORACLE_RECORD = false;

    /**
     * SKEY-1 (measurement): each wave's first three-option rating also prints an {@code SKN} record
     * with the wave's surf key, for the offline per-opponent surf-key fit
     * ({@code data/tools/surf_key_fit.py}). Behaviour unchanged.
     */
    static final boolean SURF_KEY_RECORD = false;

    /**
     * MOVE-25: the duel surfs with the stop-point surf (StopPointSurf, docs/bench/surf-b-rivals-read.md):
     * dozens of stop points both ways rated on a smoothed probability histogram of the same views,
     * BeepBoop's 1 / sqrt(4 + t) time weight, two waves, and a plan kept until the waves or the
     * views change. Melee and team never take it.
     */
    static final boolean STOP_POINT_SURF = false;

    /**
     * MOVE-26: with {@link #STOP_POINT_SURF}, the shot dodger reads every opponent's bullets and the
     * stop-point surf mixes the most-matched simple aim into its danger at the share of bullets it
     * matched. The three-option surf, on the ticks it still drives, then dodges as DODGE-3 does.
     */
    static final boolean AIM_MIX = false;

    /**
     * MOVE-27: with {@link #STOP_POINT_SURF}, the stop-point surf rates waves on the enemy-gun
     * ensemble (GunMimics): the views blended with visit-trained mimics of common learning guns,
     * each weighted by how well it predicted the real bullets, cubed.
     */
    static final boolean MIMICS = false;

    /**
     * MOVE-29 (K1 of the road to king, docs/bench/gun-oracle.md): the three-option surf's danger
     * mixes the views' score with the head-on, linear and circular aims' (AimMembers), each member
     * weighted by how well it predicted the bullets that hit us. Duel only. On from 3.20:
     * pc-sg-aim +0.13 +- 0.07 APS on the 434 simple guns, pc-k1-aim +0.07 +- 0.15 on the 432
     * learning guns (docs/bench/simple-gun-gap.md).
     */
    static final boolean AIM_MEMBERS = true;

    /**
     * MOVE-30: with the aim members on, an enemy bullet our bullet met also scores the members
     * (the views included, as member 0), as a hit does, without teaching the views. On for the
     * next census (simple-gun dodge part 2, pc-sg-wide passed, PR #480); the ablation sgoff turns it off.
     */
    static final boolean AIM_INTERCEPTS = true;

    private MoveDesign() { }

    /**
     * DODGE-3: dodge the enemy's simple aim (DODGE-1, DODGE-2) against every opponent, not only
     * those the table names. Off by default; the ablation {@code sdodge} turns it on for the screen.
     */
    static final boolean SHOT_DODGE = false;

    /**
     * DODGE-6: the shot-dodge planner (Saguaro's ShotDodger movement) against every opponent, not
     * only those the table's {@code shot-dodge2:} lines name; a shipped expert still primes it.
     * Off by default; the ablation {@code sdplan} turns it on for the screen.
     */
    static final boolean SHOT_DODGE_PLAN = false;

    /**
     * POISON-2: stop-and-go (POISON-1) against every opponent, not only those the table names,
     * with the reverse crawl {@link #STOP_AND_GO_PREFIRE} ticks before the enemy's gun is ready.
     * Off by default; the ablations {@code sgo} and {@code sgo2} turn it on for the screen.
     */
    static final boolean STOP_AND_GO = false;
    /** POISON-2: the forced stop-and-go's variant: 1 WavePoison, 2 WavePoisonShift. */
    static final int STOP_AND_GO_PREFIRE = 1;
}
