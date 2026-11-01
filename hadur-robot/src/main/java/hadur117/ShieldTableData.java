package hadur117;

/**
 * Shield part 2 of the 1v1 mode table (docs/plan-shield-quality.md): per opponent, the shield's
 * opening drive (SHIELD-17) and its shipped aim (SHIELD-18); and the opponents the duel surf
 * dodges simple aims against (DODGE-3); and the opponents fought with stop-and-go (POISON-2). Every list starts empty, so Hadur plays as before until
 * a bench run has picked entries for it; moves() and aims() hold shield part 2's (PR #256),
 * stopGos() and stopGoShifts() mode table v2's (PR #263), plus the gap-to-2nd re-pick (BENCH-126).
 *
 * <p>{@link #moves()} and {@link #dodges()} name opponents, matched by the rule of {@link ShieldListData}.
 * {@link #aims()} holds one {@code "predictor offset name"} line an opponent: the predictor
 * (from 0) the shield's records showed best against it, that predictor's offset in radians,
 * then the robot's name as Robocode lists it, with or without its version.</p>
 *
 * <p>A class, not a resource, for the reason {@link ShieldListData} gives: Robocode's sandbox
 * refuses a robot the read of its own jar. Keep the shape: a final class with package-private
 * static methods {@code moves()}, {@code aims()}, {@code dodges()}, {@code stopGos()} and
 * {@code stopGoShifts()} and {@code dodgePlans()}; the bench's {@code smovelist}/{@code saimlist}/{@code sdodgelist}/
 * {@code sgolist}/{@code sgo2list}/{@code sdplanlist} ablations fill them.</p>
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
            "AIR.iRobot 1.0",
            "CharlieN.Omega.Omega 1.03",
            "SHAM.WOW 1.4",
            "TJ.Exupery 1.39",
            "amk.ChumbaWumba 0.3",
            "ary.FourWD 1.3d",
            "ary.mini.Nimi 1.0",
            "awl.Locutus 1.5",
            "bayen.nut.Squirrel 1.621",
            "brainfade.Fallen 0.63",
            "can.Pookie 1.1",
            "cf.mini.Chiva 1.0",
            "cx.micro.Smoke 0.96",
            "deo.virtual.RainbowBot 1.0",
            "florent.small.LittleAngel 1.8",
            "gu.MicroScoob 1.3",
            "intruder.PrairieWolf 2.61",
            "jekl.mini.BlackPearl .91",
            "kms.Golden 0.10",
            "mladjo.Grrrrr 0.9",
            "nz.jdc.micro.HedgehogP 1.2",
            "oog.micro.MagicD3 0.41",
            "pez.frankie.Frankie 0.9.6.1",
            "sm.Devil 7.3",
            "spinnercat.mega.Tardis 1.2",
            "stelo.Chord 1.0",
            "stelo.Randomness 1.1",
            "synapse.rsim.GeomancyBS 0.11",
            "theo.simple.Bones 1.0",
            "tw.Exterminator 1.0",
            "voidious.micro.Jen 1.11",
            "amk.ChumbaMini 0.2",
            "cf.star.Star2 1.23",
            "deo.FlowerBot 1.0",
            "ers.nano.meroka.Meroka 1.8a",
            "satan.White 0.26",
            "stelo.MatchupWS 1.2c",
            "usa.nano.Nemo 2.0",
            "wiki.mako.MakoHT 1.2.2.1",
        };
    }

    /**
     * SHIELD-18: the shipped aims, one {@code "predictor offset name"} line each.
     *
     * @return a fresh array of lines
     */
    static String[] aims() {
        return new String[] {
            "0 0.000000000 AIR.iRobot 1.0",
            "0 0.000000000 CharlieN.Omega.Omega 1.03",
            "0 0.000000000 DM.mega.Bezier 1.618fprrr",
            "0 0.000000000 EH.kms.LightningStorm 0.11B",
            "4 0.000000000 KiraNL.Cataris 1.0",
            "0 0.000000000 KiraNL.ChupaLite 0.4",
            "0 0.000000000 KiraNL.Chupacabra 0.5",
            "0 0.000000000 Krabb.krabby.Krabby 1.18b",
            "0 0.000000000 Noran.BitchingElk 0.054",
            "0 0.000000000 Polkwane.Intensive 1.0",
            "0 0.000000000 SHAM.WOW 1.4",
            "0 0.000000000 SuperSample.SuperCrazy 1.0",
            "0 0.000000000 TJ.Exupery 1.39",
            "0 0.000000000 WarfaJibril.Jibril_Warfa_Andromeda 1.11",
            "0 0.000000000 ad.Quest 0.10",
            "0 0.000000000 ags.micro.Carpet 1.1",
            "0 0.000000000 ahf.r2d2.R2d2 0.86",
            "0 0.000000000 ak.Fermat 2.0",
            "0 0.000000000 amk.ChumbaWumba 0.3",
            "0 0.000000000 apv.MicroAspid 1.8",
            "4 0.000000000 apv.NanoLauLectrik 1.0",
            "0 0.000000000 apv.NanoLauLectrikTheCannibal 1.1",
            "0 0.000000000 apv.test.Virus 0.6.1",
            "0 0.000000000 arthord.KostyaTszyu Beta2",
            "0 0.000000000 ary.FourWD 1.3d",
            "0 0.000000000 ary.Help 1.0",
            "0 0.000000000 ary.SMG 1.01",
            "0 0.000000000 ary.mini.Nimi 1.0",
            "0 0.000000000 asm.Statistas 0.1",
            "0 0.000000000 awl.Locutus 1.5",
            "0 0.000000000 bayen.nut.Squirrel 1.621",
            "0 0.000000000 brainfade.Fallen 0.63",
            "0 0.000000000 brainfade.melee.Dusk 0.44",
            "0 0.000000000 buba.Archivist 0.1",
            "0 0.000000000 bvh.fnr.Fenrir 0.36l",
            "0 0.000000000 bvh.frg.Friga 0.112dev",
            "0 0.000000000 bvh.mini.Fenrir 0.39",
            "0 0.000000000 bvh.mini.Freya 0.55",
            "0 0.000000000 can.Pookie 1.1",
            "0 0.000000000 casey.Flee 1.0",
            "0 0.000000000 cbot.agile.Nibbler 0.2",
            "0 0.000000000 cf.mini.Chiva 1.0",
            "0 0.000000000 chase.pm.Pytko 1.0",
            "0 0.000000000 cjm.Charo 1.1",
            "0 0.000000000 cjm.Chomsky 1.5",
            "0 0.000000000 cjm.chalk.Chalk 2.6.Be",
            "0 0.000000000 cs.s2.Seraphim 2.3.1",
            "0 0.000000000 css.Delitioner 0.11",
            "0 0.000000000 cuoq.Kakera 1.0",
            "0 0.000000000 cx.micro.Smoke 0.96",
            "0 0.000000000 cx.mini.Nimrod 0.55",
            "0 0.000000000 darkcanuck.Holden 1.13a",
            "0 0.000000000 davidalves.Firebird 0.25",
            "0 0.000000000 davidalves.net.DuelistMini 1.1",
            "0 0.000000000 de.erdega.robocode.Polyphemos 0.4",
            "0 0.000000000 deo.virtual.RainbowBot 1.0",
            "0 0.000000000 dft.Cyanide 1.90",
            "0 0.000000000 dft.Cyprus 3.0",
            "0 0.000000000 dft.Virgin 1.25",
            "0 0.000000000 dmh.robocode.robot.BlackDeath 9.2",
            "0 0.000000000 dummy.micro.Sparrow 2.5",
            "0 0.000000000 dz.Caedo 1.4",
            "0 0.000000000 ej.ChocolateBar 1.1",
            "0 0.000000000 ers.nano.gokdeniz.Gokdeniz 1.5b",
            "4 0.000000000 ers.nano.iSuck.ISuckNano 1.0a",
            "4 0.000000000 exauge.GateKeeper 1.1.121g",
            "0 0.000000000 exauge.LemonDrop 1.6.130",
            "0 0.000000000 florent.small.LittleAngel 1.8",
            "0 0.000000000 frag.FragBot 1.0",
            "0 0.000000000 fromHell.C22H30N2O2S 2.2",
            "0 0.000000000 gh.micro.Grinnik 1.0",
            "0 0.000000000 gu.MicroScoob 1.3",
            "0 0.000000000 ha2.T3 0.2",
            "0 0.000000000 ins.MobyNano 0.8",
            "0 0.000000000 intruder.PrairieWolf 2.61",
            "0 0.000000000 jam.micro.RaikoMicro 1.44",
            "0 0.000000000 jam.mini.Raiko 0.43",
            "0 0.000000000 jasolo.Sonda 0.55",
            "10 -0.000009125 jbot.Rabbit2 1.1",
            "0 0.000000000 jcs.Decepticon 2.5.3",
            "0 0.000000000 jcs.Megatron 1.2",
            "0 0.000000000 jekl.DarkHallow .90.9",
            "0 0.000000000 jekl.Jekyl .70",
            "0 0.000000000 jekl.mini.BlackPearl .91",
            "7 0.012369964 jk.micro.Cotillion 0.8",
            "5 0.012368475 jk.mini.CunobelinDC 1.2",
            "4 0.000000000 jk.sheldor.nano.Yatagan 1.2.3",
            "0 0.000000000 kawigi.f.FhqwhgadsMicro 1.0",
            "0 0.000000000 kawigi.mini.Coriantumr 1.1",
            "0 0.000000000 kawigi.mini.Fhqwhgads 1.1",
            "0 0.000000000 kawigi.nano.FunkyChicken 1.1",
            "0 0.000000000 kawigi.sbf.FloodMini 1.4",
            "0 0.000000000 kawigi.sbf.FloodSonnet 0.9",
            "0 0.000000000 kc.serpent.Hydra 0.21",
            "0 0.000000000 kcn.unnamed.Unnamed 1.21",
            "0 0.000000000 kid.Gladiator .7.2",
            "0 0.000000000 kid.Toa .0.5",
            "0 0.000000000 kinsen.nano.Charp 1.0",
            "4 0.000000000 kinsen.nano.Quarrelet 1.0",
            "0 0.000000000 kms.Golden 0.10",
            "4 0.000000000 kneels.nano.Derp 0.2",
            "0 0.000000000 learn.ISmart 2.0s",
            "0 0.000000000 lrem.magic.TormentedAngel Antiquitie",
            "0 0.000000000 lrem.quickhack.QuickHack 1.0",
            "0 0.000000000 lucasslf.Dodger 1.0",
            "0 0.000000000 lucasslf.HariSeldon 0.2.1",
            "5 0.005000000 lucasslf.Wiggins 0.6",
            "0 0.000000000 metal.small.MCool 1.21",
            "0 0.000000000 metal.small.dna2.MCoolDNA 1.5",
            "0 0.000000000 mk.Alpha 0.2.1",
            "0 0.000000000 mladjo.Grrrrr 0.9",
            "0 0.000000000 mld.Moebius 2.9.3",
            "0 0.000000000 mnt.AHEB 0.6a",
            "0 0.000000000 mnt.SurferBot 0.2.5",
            "0 0.000000000 myl.micro.Avipes 1.00",
            "0 0.000000000 myl.micro.NekoNinja 1.30",
            "0 0.000000000 nat.nano.Ocnirp 1.73",
            "0 0.000000000 nat.nano.OcnirpPM 1.0",
            "0 0.000000000 nat.nano.OcnirpSNG 1.0b",
            "0 0.000000000 ngf.nano.Sparky 0.1.5",
            "0 0.000000000 nkn.mini.Jskr0 0.1",
            "0 0.000000000 nz.jdc.micro.HedgehogP 1.2",
            "4 0.000000000 nz.jdc.nano.NeophytePattern 1.1",
            "4 0.000000000 nz.jdc.nano.PatternAdept 1.0",
            "14 0.000009687 nz.jdc.nano.PralDeGuerre 1.2",
            "0 0.000000000 oog.micro.Claudius 1.11",
            "0 0.000000000 oog.micro.MagicD3 0.41",
            "4 0.000000000 oog.micro.SavantMicro 1.1",
            "0 0.000000000 oog.mini.AlphaDragon 0.1",
            "4 0.000000000 oog.nano.Fuatisha 1.1",
            "0 0.000000000 origin.SleepSiphon 1.7b",
            "5 0.005000000 ouroboros.Dragon 0.0.3",
            "2 0.000000000 pa3k.Quark 1.02",
            "1 0.000000000 pedersen.Hubris 2.4",
            "0 0.000000000 pez.clean.Swiffer 0.2.9",
            "0 0.000000000 pez.frankie.Frankie 0.9.6.1",
            "0 0.000000000 pez.gloom.GloomyDark 0.9.2",
            "0 0.000000000 pez.mako.Mako 1.5",
            "0 0.000000000 ph.micro.Pikeman 0.4.5",
            "0 0.000000000 ph.mini.Archer 0.6.6",
            "0 0.000000000 ph.musketeer.Musketeer 0.6",
            "0 0.000000000 pkbots.BoyTDSurfer 1.0",
            "0 0.000000000 qwaker00.Ahchoo 1.6",
            "0 0.000000000 racso.Crono 1.0",
            "0 0.000000000 racso.Frog 0.9",
            "0 0.000000000 rdt.AgentSmith.AgentSmith 0.5",
            "0 0.000000000 reaper.Reaper 1.1",
            "0 0.000000000 rjw.RabidWombat 0.71",
            "0 0.000000000 robar.micro.Gladius 1.15",
            "0 0.000000000 robar.micro.Kirbyi 1.0",
            "4 0.000000000 robar.nano.BlackWidow 1.3",
            "0 0.000000000 robar.nano.MosquitoPM 1.0",
            "0 0.000000000 robar.nano.Prestige 1.0",
            "4 0.000000000 robar.nano.Pugio 1.49",
            "0 0.000000000 robar.nano.Vespa 0.95",
            "0 0.000000000 rsk1.RSK1 4.0",
            "2 0.000000000 rtk.Tachikoma 1.0",
            "0 0.000000000 ry.VirtualGunExperiment 1.2.0",
            "0 0.000000000 rz.Aleph 0.34",
            "0 0.000000000 rz.Apollon 0.23",
            "0 0.000000000 rz.GlowBlowAPM 1.0",
            "4 0.000000000 sheldor.nano.Feint 1.2.1",
            "0 0.000000000 sheldor.nano.FoilistNano 3.2",
            "0 0.000000000 sheldor.nano.PointInLine 1.0",
            "0 0.000000000 shinh.Entangled 0.3",
            "0 0.000000000 simonton.GFNano_D 3.1b",
            "0 0.000000000 simonton.beta.LifelongObsession 0.5.1",
            "0 0.000000000 simonton.mega.SniperFrog 1.0.fix2",
            "0 0.000000000 simonton.micro.GFMicro 1.0",
            "0 0.000000000 simonton.mini.WeeksOnEnd 1.10.4",
            "0 0.000000000 simonton.nano.WeekendObsession_S 1.7",
            "0 0.000000000 slugzilla.Basilite 0.13",
            "4 0.000000000 slugzilla.ButtHead 2.0",
            "0 0.000000000 slugzilla.OrbitGF 1.0",
            "0 0.000000000 slugzilla.OrbitPattern 1.1",
            "0 0.000000000 slugzilla.OscillateGF 1.0",
            "0 0.000000000 slugzilla.OscillatePattern 1.0",
            "0 0.000000000 slugzilla.RandomGF 1.0",
            "0 0.000000000 slugzilla.RandomPattern 1.0",
            "0 0.000000000 slugzilla.SquirmyToad 3.9",
            "0 0.000000000 sm.Devil 7.3",
            "0 0.000000000 spinnercat.CopyKat 1.2.3",
            "0 0.000000000 spinnercat.Kitten 1.6",
            "0 0.000000000 spinnercat.mega.Tardis 1.2",
            "0 0.000000000 starpkg.StarViewerZ 1.26",
            "0 0.000000000 stefw.Tigger 0.0.23",
            "0 0.000000000 stelo.Chord 1.0",
            "0 0.000000000 stelo.PianistNano 1.3",
            "0 0.000000000 stelo.Randomness 1.1",
            "0 0.000000000 suh.nano.RandomPM 1.02",
            "0 0.000000000 supersample.SuperMercutio 1.0",
            "0 0.000000000 syl.Centipede 0.5",
            "0 0.000000000 synapse.rsim.GeomancyBS 0.11",
            "0 0.000000000 tcf.Repat3 2",
            "0 0.000000000 theo.QuarkSoup 1.5fga",
            "0 0.000000000 theo.Tungsten 1.0a",
            "0 0.000000000 theo.avenge.Pequod 1.0",
            "0 0.000000000 theo.real.Ahab 1.0",
            "0 0.000000000 theo.simple.Bones 1.0",
            "0 0.000000000 theo.simple.Lucid 1.0",
            "0 0.000000000 tide.pear.Pear 0.62.1",
            "0 0.000000000 timmit.TimmiT 0.22",
            "0 0.000000000 trab.Crusader 0.1.7",
            "4 0.000000000 trab.nano.AinippeNano 1.3",
            "2 0.000000000 trm.Wrekt 1.1.6.f",
            "0 0.000000000 tw.Exterminator 1.0",
            "0 0.000000000 tzu.TheArtOfWar 1.2",
            "0 0.000000000 vic.Locke 0.7.5.5",
            "0 0.000000000 voidious.micro.Jen 1.11",
            "0 0.000000000 voidious.mini.Komarious 1.88",
            "0 0.000000000 vuen.Fractal 0.55",
            "0 0.000000000 wcsv.Engineer.Engineer 0.5.4",
            "0 0.000000000 wcsv.PowerHouse.PowerHouse 1.7e3",
            "0 0.000000000 wcsv.mega.PowerHouse2 0.2",
            "4 0.000000000 whind.Strength 0.6.4",
            "0 0.000000000 wiki.mini.BlackDestroyer 0.9.0",
            "0 0.000000000 wiki.mini.Griffon 0.1",
            "0 0.000000000 wiki.mini.Sedan 1.0",
            "4 0.000000000 wiki.nano.RaikoNano 1.1",
            "0 0.000000000 wilson.Chameleon 0.91",
            "0 0.000000000 zen.Lindada 0.2",
            "0 0.000000000 cf.star.Star2 1.23",
            "0 0.000000000 cw.megas.Blade 0.8",
            "0 0.000000000 deo.FlowerBot 1.0",
            "0 0.000000000 kawigi.sbf.FloodHT 0.9.2",
            "0 0.000000000 stelo.MatchupWS 1.2c",
            "0 0.000000000 wiki.mako.MakoHT 1.2.2.1",
            "10 0.000003719 alpha.BlackIce 1.0",
            "4 0.000000000 amk.ChumbaMini 0.2",
            "4 0.000000000 ers.nano.meroka.Meroka 1.8a",
            "4 0.000000000 usa.nano.Nemo 2.0",
            "5 0.005000000 satan.White 0.26",
        };
    }

    /**
     * DODGE-3: the opponents the duel surf dodges simple aims against.
     *
     * @return a fresh array of names
     */
    static String[] dodges() {
        return new String[] {
        };
    }

    /**
     * DODGE-4: the opponents the shot-dodge planner (DODGE-6) is for, one {@code "expert name"}
     * line each: the expert shipped for it (DODGE-2's index, from the bench's DP records), or -1
     * to learn it in the battle, then the robot's name.
     *
     * @return a fresh array of lines
     */
    static String[] dodgePlans() {
        return new String[] {
        };
    }

    /**
     * POISON-2: the opponents fought with stop-and-go, WavePoison's variant (reverse crawl one tick early).
     *
     * @return a fresh array of names
     */
    static String[] stopGos() {
        return new String[] {
            "apv.LauLectrik 1.2",
            "areb.Union 1.06",
            "bvh.mini.Mjolnir 0.3",
            "davidalves.net.DuelistMicroMkII 1.1",
            "ender.EnderRobot 1.1",
            "jab.avk.ManuelGallegus 0.6",
            "lxx.ConceptA 0.8",
            "lxx.Emerald 0.6.5",
            "md.November 1.0",
            "mladjo.AIR 0.7",
            "mladjo.GnuKlub 0.1",
            "ntc.Cannon 1.12test",
            "penguin.Joker .611wr",
            "rh.abs.Xwing 2.1",
            "stelo.Spread 0.9",
            "urdos.URDOS 1.3",
            "xander.cat.SamAxe 1.1",
            "xander.cat.XanderCat 12.9",
            "EBBU.Sim2 1.02",
            "klein.GottesKrieger 1.1",
            "lorneswork.Predator 1.0",
            "pkdeken.Paladin 1.0",
            "projectx.ProjectNano 2.0",
            "rcb.Vanessa03 0",
            "romz.robot.circular.WildRabbit 0.9.6",
            "steff.Rebel 2.1",
            "gg.Wolverine 2.0",
        };
    }

    /**
     * POISON-2: the opponents fought with stop-and-go, WavePoisonShift's variant (two ticks early).
     *
     * @return a fresh array of names
     */
    static String[] stopGoShifts() {
        return new String[] {
            "DM.Mijit .3",
            "ab.DengerousRoBatra 1.3",
            "ahr.ice.Ice 1.0",
            "apc.Colossus2 0.12",
            "ar.TheoryOfEverything 1.2.1",
            "ar.horizon.Horizon 1.2.2",
            "arthord.micro.Apoptygma 0.4",
            "arthord.micro.Muffin 0.6.1",
            "banshee.micro.Nexus6 0.3.0",
            "da.NewBGank 1.4",
            "demetrix.nano.Neutrino 0.27",
            "deo.CloudBot 1.3",
            "element.Earth 1.1",
            "jam.RaikoMX 0.32",
            "kano.gamma.KanoGamma 1.8",
            "mladjo.iRobot 0.3",
            "nat.BlackHole 2.0gamma",
            "nat.micro.Reepicheep 0.1a",
            "oog.melee.Capulet 1.2",
            "pe.SandboxLump 1.52",
            "pez.micro.Aristocles 0.3.9",
            "pez.mini.Tityus 0.9.1",
            "pez.mini2.Pugilist 2.5.15",
            "ry.LightningBug 1.0",
            "scheronimus.AntiRebel 1.1",
            "serenity.nonSense 1.39",
            "sheldor.micro.Epeeist 3.7",
            "sheldor.micro.EpeeistDC 3.0",
            "slugzilla.Basilisk 3.9",
            "stelo.Liblix 0.3.1",
            "suh.mega.WaveSurferGF 1.04",
            "tjk.deBroglie rev0108",
            "whind.Wisdom 0.5.1",
            "wiki.BasicGFSurfer 1.02",
            "zyx.micro.Ant 1.1",
            "ajs.Guessit 1.3",
            "casey.Flump 1.0",
            "deewiant.Anomaly 0.2",
            "dz.MostlyHarmlessNano 2.1",
            "gh.mini.Grimmig 0.3.6",
            "janm.Jammy 1.0",
            "marksteam.Phoenix 1.0",
            "mb.Monte 0.1.0",
            "pulsar.PulsarMax 0.8.9",
            "serenity.serenityFire 1.29",
            "vjik.UnViolation 1.1",
            "voidious.perceptual.RetroGirl 1.0.0",
            "nat.Hikari dev0001",
            "bing2.Melody 1.3.1",
            // pc-rival-confirm (PR #537): held at a 3-point margin on 8 fresh seeds
            "pez.mini.VertiLeach 0.4.0",
            "synapse.Geomancy 15",
        };
    }

    /**
     * MOVE-28: the opponents fought with MOVE-13's stop-and-start (heatjit). Empty: candidate
     * builds add lines here (build-ablation.sh hjlist).
     *
     * @return a fresh array of names
     */
    static String[] heatJits() {
        return new String[] {
        };
    }

    /**
     * GUN-11: the opponents aimed at with the gun stack (GUN-8 to GUN-10). Empty: candidate builds
     * add lines here (build-ablation.sh gslist).
     *
     * @return a fresh array of names
     */
    static String[] gunStacks() {
        return new String[] {
        };
    }

    /**
     * SHIELD-19: the opponents SHIELD-11 leaves the battle against at 400 damage, not 150. Empty:
     * candidate builds add lines here (build-ablation.sh sx4list).
     *
     * @return a fresh array of names
     */
    static String[] exitLates() {
        return new String[] {
        };
    }

    /**
     * SHIELD-19: the opponents SHIELD-11 takes no damage exit against (SHIELD-6's budget alone).
     * Empty: candidate builds add lines here (build-ablation.sh sx0list).
     *
     * @return a fresh array of names
     */
    static String[] exitOffs() {
        return new String[] {
            // pc-rival-confirm (PR #537): held at a 3-point margin on 8 fresh seeds
            "cx.micro.Smoke 0.96",
            "dft.Cyprus 3.0",
            "myl.micro.Avipes 1.00",
            "rz.GlowBlowAPM 1.0",
            "voidious.mini.Komarious 1.88",
        };
    }

    /**
     * SHIELD-21: the opponents shield mode plans its shots still against (SHIELD-20): the 17 that
     * pc-shield-still2 locked (PR #515). Candidate builds add lines here (build-ablation.sh szlist).
     *
     * @return a fresh array of names
     */
    static String[] stills() {
        return new String[] {
            // pc-shield-still2 (PR #515): the 17 robots the still plans lock at a 5-point margin, 4 fresh seeds.
            "ags.micro.Carpet 1.1",
            "bvh.fnr.Fenrir 0.36l",
            "cf.proto.Shiva 2.2",
            "chase.pm.Pytko 1.0",
            "cx.micro.Spark 0.6",
            "et.Predator 1.8",
            "fnc.bandit2002.Bandit2002 4.0.2",
            "kid.Toa .0.5",
            "mue.Hyperion 0.8",
            "rdt199.Warlord 0.73",
            "stelo.UnfoolableNano 1.0",
            "synapse.rsim.GeomancyBS 0.11",
            "theo.Hydrogen 2.1r",
            "theo.avenge.Pequod 1.0",
            "theo.simple.Bones 1.0",
            "theo.simple.Lucid 1.0",
            "wompi.Numbat 1.9",
            // pc-rival-confirm (PR #537): held at a 3-point margin on 8 fresh seeds
            "fm.claire 1.7",
            "projectx.TestNano 1.0",
            "rz.GlowBlowMelee 1.4",
            "cx.micro.Smoke 0.96",
            "dft.Cyprus 3.0",
            "myl.micro.Avipes 1.00",
            "rz.GlowBlowAPM 1.0",
            "supersample.SuperMercutio 1.0",
            "voidious.mini.Komarious 1.88",
        };
    }

    /**
     * SKEY-2: per-opponent surf keys, each line {@code "m1 ... m9 bw name"}: nine multipliers on the
     * hit views' key weights ({@code MoveFormula}) and one on the kernel width, fitted offline from that
     * opponent's bullets ({@code data/tools/surf_key_fit.py}). Empty on master; candidate builds add
     * lines here (build-ablation.sh sklist).
     *
     * @return a fresh array of lines
     */
    static String[] surfKeys() {
        return new String[] {
        };
    }
}
