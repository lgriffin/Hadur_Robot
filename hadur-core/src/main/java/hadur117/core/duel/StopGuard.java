package hadur117.core.duel;

/**
 * MOVE-75: the driver guard's test. The stop-and-go mover (POISON-1) drives without looking at
 * the bullets in the air; the surf rates its three options against them every tick. The guard
 * gives a tick to the surf when the surf rates the mover's intended move clearly worse than the
 * best of its own. Pure and stateless.
 */
final class StopGuard {

    /** Not instantiated: the class is one pure function. */
    private StopGuard() {}

    /**
     * Whether the mover's move yields to the surf.
     *
     * @param rated the surf's dangers for counter-clockwise, stop and clockwise, in that order
     * @param direction the mover's intended move: +1 going clockwise, -1 going counter-clockwise,
     *     0 for its stop or reverse crawl
     * @param ratio how many times the best option's danger the move may cost
     * @return true when the move's danger is above {@code ratio} times the least of the three
     */
    static boolean yields(double[] rated, int direction, double ratio) {
        if (rated == null || rated.length != 3) return false;
        double mine = rated[direction > 0 ? 2 : direction < 0 ? 0 : 1];
        double best = Math.min(rated[0], Math.min(rated[1], rated[2]));
        // !(x > y) also keeps a NaN from yielding.
        if (!(mine > 0) || !(best >= 0)) return false;
        return mine > ratio * best;
    }
}
