package hadur2;

/**
 * Shield part 2 of the 1v1 mode table (docs/plan-shield-quality.md): per opponent, the shield's
 * opening drive (SHIELD-17) and its shipped aim (SHIELD-18). Both lists start empty, so the
 * shield plays as before until a bench run has picked entries for them.
 *
 * <p>{@link #moves()} names opponents, matched by the rule of {@link ShieldListData}.
 * {@link #aims()} holds one {@code "predictor offset name"} line an opponent: the predictor
 * (from 0) the shield's records showed best against it, that predictor's offset in radians,
 * then the robot's name as Robocode lists it, with or without its version.</p>
 *
 * <p>A class, not a resource, for the reason {@link ShieldListData} gives: Robocode's sandbox
 * refuses a robot the read of its own jar. Keep the shape: a final class with package-private
 * static methods {@code moves()} and {@code aims()}; the bench's {@code smove}/{@code saim}
 * ablations fill them.</p>
 */
final class ShieldTableData {

    private ShieldTableData() {
    }

    /**
     * SHIELD-17: the opponents the opening drive is for.
     *
     * @return a fresh array of names
     */
    static String[] moves() {
        return new String[] {
        };
    }

    /**
     * SHIELD-18: the shipped aims, one {@code "predictor offset name"} line each.
     *
     * @return a fresh array of lines
     */
    static String[] aims() {
        return new String[] {
        };
    }
}
