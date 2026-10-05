package hadur2;

/**
 * Hadur's own shield list (SHIELD-5): the opponents on which each round opens in shield mode,
 * sitting still and shooting the enemy's bullets down (docs/bullet-shielding.md, D5 in
 * docs/druss-route-plan.md).
 *
 * <p>One robot per entry, as Robocode names it. {@code "package.Class 1.2"} matches that
 * version only; {@code "package.Class"} with no version matches every version. Exact and
 * case-sensitive, never a prefix. Blank entries and entries starting with {@code #} are
 * ignored.</p>
 *
 * <p>A name goes on this list only after the paired bench shows shield mode beats normal mode
 * for that robot (BENCH-11: {@code mvn exec:java -Dexec.args="--shield-probe FILE ..."}, which
 * prints the lines to paste below). It ships empty: with nobody on it shield mode never starts
 * and Hadur fights exactly as without the feature. SHIELD-6 still bounds the cost for a listed
 * robot: shield mode is left for the rest of a battle once the enemy's bullet damage would
 * hold our score share below 85%.</p>
 *
 * <p>This is a class so that it reaches the robot at all: Robocode's sandbox denies a robot
 * the read of its own jar, so a text resource in it cannot be opened, while a class loads.
 * The bench's shield probe replaces this class in the jars it repacks, so keep the shape: a
 * final class with one package-private static method {@code lines()}.</p>
 */
final class ShieldListData {

    private ShieldListData() {
    }

    /**
     * The list, one robot per element.
     *
     * @return a fresh array of entries
     */
    static String[] lines() {
        return new String[] {
            // "apv.test.Virus 0.6.1",
        };
    }
}
