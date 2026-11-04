package hadur117.core.melee;

/**
 * Melee Stage 1 (docs/plan-melee-top5.md): Hadur's play with two opponents left, off a team.
 *
 * <p>The Stage 0 census (PR #292) found Hadur dies with two opponents left in 12.8% of rounds,
 * the largest share of its deaths, and enters the last duel behind on energy against every
 * survivor ranked 1-30. Today two opponents left already plays as the duel will: the endgame
 * ring and lateral weight (MMOVE-4) and the duel's power table (MGUN-2). MEND-3 raises the
 * closest-robot factor for that phase (banked with MGUN-7's 24 by the bank card, BENCH-115).</p>
 *
 * <p>None applies on a team, nor with one opponent left, so team battles and the duel (and with
 * it every 1v1 battle) are untouched.</p>
 */
public final class MeleeEndgame {

    /** MEND-3: with two opponents left off a team, being an opponent's closest robot weighs more. */
    public static final boolean THREE_FAR = true;
    /** MEND-3: the closest-robot factor then, in place of MMOVE-2's 2. */
    static final double THREE_FAR_FACTOR = 4.0;

    private MeleeEndgame() {}

    /** Whether this is the phase MEND-3 acts on: two opponents left, off a team. */
    static boolean three(int others, boolean onTeam) {
        return others == 2 && !onTeam;
    }

    /** The closest-robot factor (MMOVE-2); MEND-3 ({@code far}) raises it in this phase. */
    static double closestFactor(double base, int others, boolean onTeam, boolean far) {
        return far && three(others, onTeam) ? THREE_FAR_FACTOR : base;
    }
}
