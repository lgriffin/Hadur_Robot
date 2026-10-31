package hadur117.core.duel;

/**
 * The endgame hand-off switches (HAND-1 to HAND-3): what the duel plays when it takes over
 * from the melee with one opponent left, off a team. Each is a ship-time constant the bench
 * builds an arm from (build-ablation.sh); all off. None acts in a 1v1 (the duel never takes a
 * hand-off there) or on a team (the duel is told it is on one), so the duel and team play are
 * untouched by construction.
 *
 * <p>Live, 23% of Hadur's melee rounds are lost in that endgame duel and only 46% of them are
 * won against the top 30 (docs/bench/live-3.20-melee.md). The duel there plays plain: no 1v1
 * mode table, no shield, and nothing the melee learned about the survivor's gun.</p>
 */
public final class HandOffDesign {

    /**
     * HAND-1 (arm etab): the survivor's entries in the 1v1 mode table apply in the endgame as
     * in a duel: the shield list (shield mode, with the list's opening drive, shipped aims and
     * exits), the simple-aim dodge, the dodge planner, stop-and-go, heat-jit and the gun stack.
     */
    public static final boolean ENDGAME_TABLE = false;

    /**
     * HAND-2 (arm edge): when the melee's book says the survivor's gun is head-on (at least 3
     * hits on Hadur this battle, 60% of them within Hadur's width of head-on), the dodge planner
     * is on against it for the endgame, primed with the head-on expert.
     */
    public static final boolean ENDGAME_LEARNED_DODGE = false;

    /**
     * HAND-3 (arm eshd): the same verdict starts shield mode against the survivor on SHIELD-15's
     * trial, listed or not; the trial's exits leave it for the battle once it fails.
     */
    public static final boolean ENDGAME_LEARNED_SHIELD = false;

    private HandOffDesign() {
    }
}
