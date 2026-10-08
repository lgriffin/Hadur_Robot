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
 * prints the lines to paste below). The first 14 come from the BENCH-11 probe recorded in
 * docs/bench/d5-probe.md (gate in docs/bench/d5-gate.md): the robots shield mode wins against,
 * and those it is expected to gain against. The other 83 (3.10) come from the shield sweep of
 * DrussGT's list, ranks 51 to 700 (docs/bench/local/2026-10-08_shield-sweep.md), by the same
 * rule. SHIELD-6 still bounds the cost for a listed
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
            // 3.10, the shield sweep (docs/bench/local/2026-10-08_shield-sweep.md): every runnable robot of
            // DrussGT's shield list ranked 51st to 700th on 2026-10-07 and not above, benched at 8 seeds with
            // shield mode on against off (3.9sa against 3.9), by the same rule: interval above 0, or open
            // with a mean gain of 9 points or more. Ranks 51 to 400, the 30 of the #140 mid-table run
            // (docs/bench/local/2026-10-07_nullstride-mid-results.md).
            "dft.Cyanide 1.90",
            "cf.proto.Shiva 2.2",
            "brainfade.Fallen 0.63",
            "theo.avenge.Pequod 1.0",
            "theo.real.Ahab 1.0",
            "ary.mini.Nimi 1.0",
            "ph.micro.Pikeman 0.4.5",
            "wiki.mini.Sedan 1.0",
            "ary.SMG 1.01",
            "mladjo.Grrrrr 0.9",
            "KiraNL.ChupaLite 0.4",
            "trab.Crusader 0.1.7",
            "kid.Toa .0.5",
            "kawigi.mini.Fhqwhgads 1.1",
            "kms.Golden 0.10",
            "mk.Alpha 0.2.1",
            "lucasslf.Dodger 1.0",
            "cf.mini.Chiva 1.0",
            // Ranks 51 to 400, the sweep's other 109.
            "simonton.beta.LifelongObsession 0.5.1",
            "simonton.mini.WeeksOnEnd 1.10.4",
            "rdt.AgentSmith.AgentSmith 0.5",
            "jam.mini.Raiko 0.43",
            "tide.pear.Pear 0.62.1",
            "jekl.mini.BlackPearl .91",
            "DM.mega.Bezier 1.618fprrr",
            "pez.clean.Swiffer 0.2.9",
            "kc.micro.Thorn 1.252",
            "stefw.Tigger 0.0.23",
            "wilson.Chameleon 0.91",
            "ph.mini.Archer 0.6.6",
            "lucasslf.HariSeldon 0.2.1",
            "wiki.mini.BlackDestroyer 0.9.0",
            "wcsv.Engineer.Engineer 0.5.4",
            "lucasslf.Wiggins 0.6",
            "AIR.iRobot 1.0",
            "Krabb.krabby.Krabby 1.18b",
            "bvh.mini.Freya 0.55",
            "jekl.DarkHallow .90.9",
            "pkbots.BoyTDSurfer 1.0",
            "theo.Tungsten 1.0a",
            "trm.Wrekt 1.1.6.f",
            "pez.mako.Mako 1.5",
            "simonton.micro.GFMicro 1.0",
            "rz.Aleph 0.34",
            "bvh.frg.Friga 0.112dev",
            "florent.small.LittleAngel 1.8",
            "jekl.Jekyl .70",
            "ad.Quest 0.10",
            "ahf.r2d2.R2d2 0.86",
            "metal.small.dna2.MCoolDNA 1.5",
            "davidalves.net.DuelistMini 1.1",
            "mnt.AHEB 0.6a",
            "gh.GrubbmGrb 1.2.4",
            "rcb.Vanessa03 0",
            "tw.Exterminator 1.0",
            "robar.micro.Kirbyi 1.0",
            "jcs.Decepticon 2.5.3",
            "davidalves.net.DuelistMicroMkII 1.1",
            "kawigi.mini.Coriantumr 1.1",
            "arthord.KostyaTszyu Beta2",
            "stelo.Randomness 1.1",
            "pe.mini.SandboxMini 1.2",
            "nat.Hikari dev0001",
            "ags.micro.Carpet 1.1",
            // Ranks 401 to 700. Shield mode loses on most of these (-2.40 over all 91), so only the
            // robots it beats are here.
            "vuen.Fractal 0.55",
            "zen.Lindada 0.2",
            "syl.Centipede 0.5",
            "amk.ChumbaWumba 0.3",
            "spinnercat.CopyKat 1.2.3",
            "nat.nano.Ocnirp 1.73",
            "casey.Flee 1.0",
            "myl.micro.NekoNinja 1.30",
            "tzu.TheArtOfWar 1.2",
            "nat.nano.OcnirpPM 1.0",
            "metal.small.MCool 1.21",
            "suh.nano.RandomPM 1.02",
            "lrem.magic.TormentedAngel Antiquitie",
            "stelo.SteloTestNano 1.0",
            "apv.NanoLauLectrikTheCannibal 1.1",
            "simonton.nano.WeekendObsession_S 1.7",
            "ins.MobyNano 0.8",
            "starpkg.StarViewerZ 1.26",
            "ds.OoV4 0.3b",
        };
    }
}
