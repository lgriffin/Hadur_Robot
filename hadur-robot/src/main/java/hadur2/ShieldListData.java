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
 * prints the lines to paste below). The list below comes from the BENCH-11 probe recorded in
 * docs/bench/d5-probe.md (gate in docs/bench/d5-gate.md): the robots shield mode wins against,
 * and those it is expected to gain against. SHIELD-6 still bounds the cost for a listed
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
            // The probe's "wins": the paired difference's interval lies above 0 (3 seeds each).
            "apv.test.Virus 0.6.1",
            "kcn.unnamed.Unnamed 1.21",
            "simonton.mega.SniperFrog 1.0.fix2",
            "vic.Locke 0.7.5.5",
            "cx.micro.Smoke 0.96",
            "dft.Virgin 1.25",
            "kid.Gladiator .7.2",
            "nkn.mini.Jskr0 0.1",
            // The probe's "open" ones with a mean gain of 9 points or more: APS is the objective,
            // so a positive expected value counts even where the interval spans 0.
            "ej.ChocolateBar 1.1",
            "jam.micro.RaikoMicro 1.44",
            "ph.musketeer.Musketeer 0.6",
            "suh.micro.MirrorPM 1.00",
            "pez.gloom.GloomyDark 0.9.2",
            "reaper.Reaper 1.1",
        };
    }
}
