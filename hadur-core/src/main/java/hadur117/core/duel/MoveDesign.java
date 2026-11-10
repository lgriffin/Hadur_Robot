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
     * MOVE-39 (candidate, cloud forensic only, docs/bench/local/2026-11-09_view-rank.md): the
     * three-option surf also rates an orbit each way round that holds full speed for half the
     * wave's remaining flight and then brakes, five options in all, so its intervals on the
     * wave fall between a stop's and a full orbit's. Off ships the surf as it is; the bench
     * arm hold sets it. Duel only.
     */
    static final boolean HOLD_OPTIONS = false;

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

    /**
     * MOVE-33: with {@link #AIM_MEMBERS}, the six visit-trained learning-gun mimics of MOVE-27
     * (GunMimics) join the aim members after the aims, sharing a standing weight of 0.3, each
     * scored on the bullets as the aims are. BeepBoop's surf blends such mimics of named guns
     * (docs/bench/gun-oracle.md). Duel only, off.
     */
    static final boolean MIMIC_MEMBERS = false;

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
