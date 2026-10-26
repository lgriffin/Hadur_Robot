package hadur2.core.melee;

/**
 * Melee Stage 1 (docs/plan-melee-top5.md): Hadur's play with two opponents left, off a team.
 *
 * <p>The Stage 0 census (PR #292) found Hadur dies with two opponents left in 12.8% of rounds,
 * the largest share of its deaths, and enters the last duel behind on energy against every
 * survivor ranked 1-30. Today two opponents left already plays as the duel will: the endgame
 * ring and lateral weight (MMOVE-4) and the duel's power table (MGUN-2). Each switch below
 * keeps the crowd's play for that phase instead; all are off, so the robot plays as before, and
 * the bench builds an arm with one turned on (build-ablation.sh e3ring, e3pow, e3far).</p>
 *
 * <p>None applies on a team, nor with one opponent left, so team battles and the duel (and with
 * it every 1v1 battle) are untouched.</p>
 */
public final class MeleeEndgame {

    /** MEND-1: with two opponents left off a team, keep the crowd's ring and lateral weight. */
    public static final boolean THREE_RING = false;
    /** MEND-2: with two opponents left off a team, fire by the crowd's power table. */
    public static final boolean THREE_POWER = false;
    /** MEND-3: with two opponents left off a team, being an opponent's closest robot weighs more. */
    public static final boolean THREE_FAR = false;
    /** MEND-3: the closest-robot factor then, in place of MMOVE-2's 2. */
    static final double THREE_FAR_FACTOR = 4.0;

    private MeleeEndgame() {}

    /** Whether this is the phase the switches act on: two opponents left, off a team. */
    static boolean three(int others, boolean onTeam) {
        return others == 2 && !onTeam;
    }

    /** MMOVE-4's endgame ring and lateral weight apply; MEND-1 ({@code keepCrowd}) holds them off. */
    static boolean endgameRing(int others, boolean onTeam, boolean keepCrowd) {
        return others == 2 && !(keepCrowd && three(others, onTeam));
    }

    /**
     * The opponent count the power table reads (MGUN-2, MGUN-3); MEND-2 ({@code crowdPower})
     * reads two opponents as three, so the crowd's table stands.
     */
    static int powerOthers(int others, boolean onTeam, boolean crowdPower) {
        return crowdPower && three(others, onTeam) ? 3 : others;
    }

    /** The closest-robot factor (MMOVE-2); MEND-3 ({@code far}) raises it in this phase. */
    static double closestFactor(double base, int others, boolean onTeam, boolean far) {
        return far && three(others, onTeam) ? THREE_FAR_FACTOR : base;
    }
}
