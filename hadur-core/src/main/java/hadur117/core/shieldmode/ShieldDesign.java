package hadur117.core.shieldmode;

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
 * <li>{@code wall} (SHIELD-14): a shot whose power is uncertain (a wall hit inferred on its scan
 *     interval) builds a wave at the ledger's best-guess power instead of none. Not part of
 *     {@code all}, which stays Nullstride's five.</li>
 * <li>{@code trial} (SHIELD-15): every duel opponent, listed or not, starts in shield mode; an
 *     unlisted one leaves it for the battle once the shield fails Ogi's trial (see
 *     {@link #trialFails}). Listed opponents play as without it. Not part of {@code all}.</li>
 * <li>{@code prior} (SHIELD-16): the body-turn base is Saguaro's: head-on from where the enemy
 *     stood on the tick before it fired (base 0), turned by its body turn on the firing tick,
 *     instead of from the firing point. Implies the fifth base. Not part of {@code all}.</li>
 * <li>{@code move} (SHIELD-17): Saguaro's moving shield. Each round, until the enemy's first
 *     shot, the body drives away from the walls and the enemy (anti-gravity) while the enemy's
 *     gun cools, and stands still from {@link #MOVE_STOP_TICKS} ticks before that gun is ready.
 *     With the switch off, the shield list can still name opponents to do this against.
 *     Not part of {@code all}.</li>
 * <li>{@code rec} (SHIELD-18): each round's end writes the predictors' state ({@code SP}), which
 *     the bench builds shipped aims from. A shipped aim (an opponent's best predictor and its
 *     offset, from the shield list) needs no switch: it starts the battle's predictors with
 *     {@link #AIM_PRIOR} exact matches on it, so the shield aims right from the first bullet.
 *     Not part of {@code all}.</li>
 * <li>{@code still} (SHIELD-20): a shot plan that needs no step aside is taken whenever one
 *     exists; the step is kept only for a bullet no still plan can meet. Not part of {@code all}.</li>
 * <li>{@code cheap} (SHIELD-22): the rival's crossing power. Of the shot plans from the chosen
 *     spot, the cheapest whose shadow is at least {@link ShieldMode#CHEAP_SHARE} of the widest
 *     wins, first among those no dearer than the enemy's bullet scaled by our energy over its
 *     energy; the widest plan wins only when none is. Not part of {@code all}.</li>
 * <li>{@code ratio} (SHIELD-23): no shot plan dearer than the enemy's bullet scaled by our
 *     energy over its energy (never under 0.1). Not part of {@code all}.</li>
 * </ul>
 */
public final class ShieldDesign {

    /** SHIELD-10: the errors kept per base for the most frequent one. */
    public static final int KEPT_ERRORS = 500;
    /** SHIELD-11: the enemy's bullet damage in a battle after which the mode is off for it. */
    public static final double STAY_DAMAGE = 150;
    /** SHIELD-19: the later exit the shield list can give an opponent. */
    public static final double STAY_DAMAGE_LATE = 400;
    /** SHIELD-11: a round tick by which an enemy that has not fired turns the mode off. */
    public static final long SILENT_TICKS = 300;
    /** SHIELD-15: the bullet damage an unlisted opponent may do before the trial fails ... */
    public static final double TRIAL_DAMAGE = 35;
    /** SHIELD-15: ... plus this much for every shot it has fired. */
    public static final double TRIAL_DAMAGE_PER_SHOT = 0.25;
    /** SHIELD-15: rounds lost in shield mode after which the trial fails. */
    public static final int TRIAL_LOST_ROUNDS = 2;
    /** SHIELD-15: the ended enemy bullets (shot down or hit us) after which the shot-down share is judged. */
    public static final int TRIAL_JUDGE_BULLETS = 20;
    /** SHIELD-15: the least share of ended bullets shot down for the trial to go on. */
    public static final double TRIAL_DOWN_SHARE = 0.5;
    /** SHIELD-15: hits on us with none shot down after which the trial fails. */
    public static final int TRIAL_BLANK_HITS = 6;
    /** SHIELD-17: the ticks before the enemy's gun is ready from which the opening drive stands still. */
    public static final int MOVE_STOP_TICKS = 5;
    /** SHIELD-18: the exact matches a shipped aim starts its predictor with. */
    public static final int AIM_PRIOR = 3;

    /** 3.12's shield: every switch off. */
    public static final ShieldDesign NONE = new ShieldDesign(false, false, false, false, false, false, false, false, false, false, false, false, false);

    /**
     * The design the robot ships (SHIELD-13; SHIELD-14's wall since 3.15, +0.19 +/- 0.09 APS in the
     * top-5 factorial, PR #221; SHIELD-16's prior base with mode table v1, which passed the census
     * gate at +0.54 +/- 0.20 APS with the 49 robots it added to the shield list, PR #244). The
     * ablation builds edit this one line.
     */
    public static final ShieldDesign SHIPPED = parse("prior,wall,hold,learn,mode,stay");

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
    /** SHIELD-14: an uncertain shot (a wall hit inferred on its interval) builds a wave at the ledger's best-guess power. */
    public final boolean wall;
    /** SHIELD-15: shield mode on trial against every unlisted duel opponent. */
    public final boolean trial;
    /** SHIELD-16: the body-turn base from the enemy's position on the tick before it fired. */
    public final boolean prior;
    /** SHIELD-17: the opening drive against every shielded opponent. */
    public final boolean move;
    /** SHIELD-18: the round's {@code SP} record. */
    public final boolean rec;
    /** SHIELD-20: a plan without the step aside first. */
    public final boolean still;
    /** SHIELD-22: the cheapest plan wide enough, not the widest. */
    public final boolean cheap;
    /** SHIELD-23: plans capped at the enemy's power times the energy ratio. */
    public final boolean ratio;

    private ShieldDesign(boolean hold, boolean learn, boolean mode, boolean stay, boolean turn,
                         boolean wall, boolean trial, boolean prior, boolean move, boolean rec,
                         boolean still, boolean cheap, boolean ratio) {
        this.hold = hold;
        this.learn = learn;
        this.mode = mode;
        this.stay = stay;
        this.turn = turn;
        this.wall = wall;
        this.trial = trial;
        this.prior = prior;
        this.move = move;
        this.rec = rec;
        this.still = still;
        this.cheap = cheap;
        this.ratio = ratio;
    }

    /**
     * The design a comma-separated list of switch names turns on ({@code hold}, {@code learn},
     * {@code mode}, {@code stay}, {@code turn}, {@code wall}, {@code trial}, {@code prior}, {@code move}, {@code rec}, {@code still}, {@code cheap}, {@code ratio}, or {@code all}); blank
     * is {@link #NONE}.
     *
     * @param flags the switches
     * @return the design
     * @throws IllegalArgumentException for an unknown name
     */
    public static ShieldDesign parse(String flags) {
        boolean hold = false, learn = false, mode = false, stay = false, turn = false,
            wall = false, trial = false, prior = false, move = false, rec = false, still = false,
            cheap = false, ratio = false;
        for (String raw : flags.split(",")) {
            String f = raw.trim().toLowerCase(Locale.ROOT);
            switch (f) {
                case "": break;
                case "hold": hold = true; break;
                case "learn": learn = true; break;
                case "mode": mode = true; break;
                case "stay": stay = true; break;
                case "turn": turn = true; break;
                case "wall": wall = true; break;
                case "trial": trial = true; break;
                case "prior": prior = true; break;
                case "move": move = true; break;
                case "rec": rec = true; break;
                case "still": still = true; break;
                case "cheap": cheap = true; break;
                case "ratio": ratio = true; break;
                case "all": hold = learn = mode = stay = turn = true; break;
                default: throw new IllegalArgumentException("unknown shield switch: " + raw);
            }
        }
        if (!(hold || learn || mode || stay || turn || wall || trial || prior || move || rec || still || cheap || ratio)) {
            return NONE;
        }
        return new ShieldDesign(hold, learn, mode, stay, turn, wall, trial, prior, move, rec, still, cheap, ratio);
    }

    /**
     * SHIELD-15: whether Ogi's shield trial has failed against an unlisted opponent: its bullets
     * have done more than {@value #TRIAL_DAMAGE} plus {@value #TRIAL_DAMAGE_PER_SHOT} a shot it
     * fired, or {@value #TRIAL_LOST_ROUNDS} rounds are lost, or of at least
     * {@value #TRIAL_JUDGE_BULLETS} ended bullets under {@value #TRIAL_DOWN_SHARE} were shot down,
     * or {@value #TRIAL_BLANK_HITS} hit us with none shot down. Pure.
     *
     * @param damage the bullet damage it has done us in the battle
     * @param shots the shots it has fired in the battle
     * @param lostRounds the rounds lost in shield mode
     * @param down its bullets our shield shot down
     * @param hits its bullets that hit us
     * @return whether the trial has failed
     */
    public static boolean trialFails(double damage, int shots, int lostRounds, int down, int hits) {
        int ended = down + hits;
        boolean failing = ended >= TRIAL_JUDGE_BULLETS && down < TRIAL_DOWN_SHARE * ended
            || down == 0 && hits >= TRIAL_BLANK_HITS;
        return damage > TRIAL_DAMAGE + TRIAL_DAMAGE_PER_SHOT * shots
            || lostRounds >= TRIAL_LOST_ROUNDS || failing;
    }

    /** The head-on bases the predictors use: four, or five with a body-turn base. */
    public int bases() {
        return turn || prior ? ShieldMode.MAX_BASES : ShieldMode.BASES;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        if (hold) b.append(",hold");
        if (learn) b.append(",learn");
        if (mode) b.append(",mode");
        if (stay) b.append(",stay");
        if (turn) b.append(",turn");
        if (wall) b.append(",wall");
        if (trial) b.append(",trial");
        if (prior) b.append(",prior");
        if (move) b.append(",move");
        if (rec) b.append(",rec");
        if (still) b.append(",still");
        if (cheap) b.append(",cheap");
        if (ratio) b.append(",ratio");
        return b.length() == 0 ? "none" : b.substring(1);
    }
}
