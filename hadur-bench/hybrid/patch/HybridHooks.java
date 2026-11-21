package hadur117.core;

import java.util.ArrayDeque;

/**
 * Bench-only seam for the hybrid reference robots (hadur-bench/hybrid). The build script copies
 * this file into a scratch copy of hadur-core and patches DuelController to read it; it is never
 * part of the hadur-core module, the release jars or the hadur117 robot.
 */
public final class HybridHooks {
    private HybridHooks() {
    }

    /** Another robot's movement drives the body: the duel skips its own movement branch and shield. */
    public static boolean externalMove;
    /** Another robot's gun aims and fires: the duel registers only the real bullets handed to it. */
    public static boolean externalGun;
    /** Set by the duel each tick: Hadur's own shield drove body and gun this tick. */
    public static boolean shieldDriving;
    /** Real bullets the external gun fired: {time, x, y, heading, power}, drained by the duel. */
    public static final ArrayDeque<double[]> FIRED = new ArrayDeque<>();
}
