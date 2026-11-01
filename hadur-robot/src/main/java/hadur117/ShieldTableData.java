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
            // pc-rival-near (BENCH-163, PR #545): held on PC seeds 6500 and the cloud screen
            "EE.LittleBig 1.0",
            "theo.Hydrogen 2.1r",
            "wiki.Wolverine 2.1",
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
            // pc-rival-near (BENCH-163, PR #545): held on PC seeds 6500 and the cloud screen
            "divineomega.DivineBot 1.9.5",
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
            // pc-rival-near (BENCH-163, PR #545): held on PC seeds 6500 and the cloud screen
            "intruder.PrairieWolf 2.61",
            "sheldor.nano.PointInLine 1.0",
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
            // pc-rival-near (BENCH-163, PR #545): held on PC seeds 6500 and the cloud screen
            "dmp.micro.Aurora 1.41",
            "intruder.PrairieWolf 2.61",
            "rz.Artist 0.2",
            "sL300.Mozart life",
            "sheldor.nano.PointInLine 1.0",
        };
    }

    /**
     * MOVE-32: the opponents the duel surfs with the flattener views on (MOVE-24 undone for them):
     * the two pc-flat-on (PR #554) robots that gained on every read. Candidate builds add lines here
     * (build-ablation.sh fllist).
     *
     * @return a fresh array of names
     */
    static String[] flatOns() {
        return new String[] {
            // pc-flat-on (PR #554): screen +11.7 / confirm +11.6 (Dookious); screen +13.7 / confirm +4.0,
            // cloud +13 / +8 (Combat).
            "mn.Combat 3.25.0",
            "voidious.Dookious 1.573c",
        };
    }

    /**
     * SKEY-2: per-opponent surf keys, each line {@code "m1 ... m9 bw name"}: nine multipliers on the
     * hit views' key weights ({@code MoveFormula}) and one on the kernel width, fitted offline from that
     * opponent's bullets ({@code data/tools/surf_key_fit.py}). The 175 keys of pc-surf-key (BENCH-160,
     * weights + width arm {@code kl}): gate +0.06 ± 0.05 APS on fresh seeds over the 198-robot panel.
     *
     * @return a fresh array of lines
     */
    static String[] surfKeys() {
        return new String[] {
            "1.189 0.2102 1 0.25 2.378 0.25 0.25 0.1768 3.364 2.8 spinnercat.haiku.Refrigerator 1.1",
            "0.5946 0.4204 1 0.5946 1 0.4204 2.828 0.5946 2 2.8 el33t.EL33tGangstarr2 2.0",
            "2.828 0.5946 1 1 0.5 0.7071 2 0.8409 0.7071 2.8 gtf.robocode.Strafer 2.1.1",
            "2 0.2973 0.2973 2 2 1.189 0.5 0.8409 0.8409 2.8 apc.Caan 1.0",
            "2.828 0.3536 0.5946 1.682 1.189 0.7071 0.7071 1 0.7071 2.8 ncj.MoxieBot 1.0",
            "1 1 2 0.8409 0.5 0.5 0.7071 1 1 2.8 Grystrion.TrackerWO 1.0",
            "0.25 0.2973 1.682 0.8409 1.189 0.4204 0.8409 0.125 2.378 2.8 csp.Eagle 3.30",
            "1.682 0.5946 0.5946 1 2 0.25 0.8409 1.682 1 2.8 jgap.JGAP6139 1.0",
            "1.189 1.414 3.364 1.414 0.1768 0.1768 4 0.1768 2.828 2.8 yk.JahMicro 1.0",
            "0.5946 1.682 0.2973 1 1 4 2 0.8409 1 2.8 myl.nano.Kakuru 1.20",
            "2.828 1 2 0.7071 1 1 0.5 0.5 0.5 2.8 stelo.Lifestealer 1.0",
            "1.682 0.7071 0.2102 1.414 0.25 1 2 1 0.5946 2.8 sgp.JollyNinja 3.53",
            "4 1 1 0.7071 1 0.7071 1.682 0.125 1 2.8 kjc.Karaykan 1.0",
            "1 2.378 8 0.3536 2 0.7071 0.2973 0.5 0.8409 2.8 fullsail.LaxativeTeaTwo 1.0",
            "5.657 0.4204 0.8409 0.7071 0.4204 0.1768 1 0.25 0.1768 2.8 davidalves.net.Duelist 0.1.6src",
            "0.5946 0.5 1 1 1.682 0.5 1 0.8409 1 2.8 ntw.Sighup 1.5",
            "0.125 1 0.125 0.125 8 0.5 3.364 2.378 0.7071 2 kjc.etc.Dharok 1.0",
            "0.8409 4.757 2.378 1.189 2 0.5 1.414 1 1 2.8 lion.Kresnanano 1.0",
            "0.5946 1.414 2 0.7071 1.189 2 1 0.4204 1 2 EH.Fusion 0.32",
            "0.4204 1.414 5.657 0.4204 0.5946 0.4204 1.682 1.414 0.4204 2.8 bayen.nano.Squirrel 0.2",
            "1.414 2 1 1.189 0.5946 2 0.5 1.189 0.8409 2.8 step.nanoPri 1.0",
            "1.189 0.7071 1.682 0.7071 5.657 0.7071 1 0.8409 0.5 2.8 kinsen.melee.Angsaichmophobia 1.8c",
            "4.757 0.2973 1.682 1.189 0.7071 2 1.414 0.2973 0.5 2.8 dmh.robocode.robot.PinkPanther 1.1",
            "2.828 1 0.25 0.5 1.189 0.5 0.8409 1.189 1.414 2.8 erdnis.Rover 0.3",
            "2 1 2.378 1.189 0.7071 2 1.189 1.189 1 2.8 stelo.MoojukNano 1.2",
            "2.828 1.189 4.757 2 0.5 0.7071 0.5 1 0.7071 2.8 drm.Magazine 0.39",
            "0.5 0.25 0.7071 1.189 0.5 1 2.378 0.25 2 2.8 seed.Anastasia 1.0",
            "0.3536 0.4204 1.682 0.8409 0.3536 1.414 1.414 1 1.189 2.8 dmh.robocode.robot.BlueBerry 0.5",
            "1.414 0.5 1.189 1 0.8409 1.189 0.7071 0.3536 1 2.8 penguin.Ivy 1.1r",
            "0.8409 0.4204 2.378 0.5946 2 0.7071 0.7071 1 2 2.8 japs.Sjonniebot 0.9.1",
            "0.7071 1 2 2 2 1 1 0.8409 0.7071 2.8 arthord.NanoSatanMelee Beta",
            "2.828 0.5 0.8409 2 0.8409 1.189 0.3536 2 0.8409 2.8 wcsv.Stampede 1.3.3",
            "2.378 0.8409 0.5 0.5946 4.757 0.7071 1 2 1 2.8 davidalves.net.DuelistNano 1.0",
            "1.414 2 4 0.25 1.682 0.4204 1.682 1.682 0.5 2.8 doka.KillerRabbit 1.0",
            "4 2.378 4.757 1.414 0.25 1 0.25 0.125 1.682 2.8 omens.CannonfodderNano 1.4",
            "3.364 1 0.5 2 0.25 0.8409 1.414 0.1768 0.7071 2.8 bts.wiki.RipCurl 0.9b",
            "2 0.8409 1.682 1.414 0.4204 1.189 1 0.7071 1 2.8 povik.nano.Smilee 0.2.1",
            "0.1768 4.757 1 0.2973 2.378 1.414 0.7071 0.2102 0.5946 2.8 supersample.SuperRamFire 1.0",
            "1.414 1.414 1.682 0.4204 0.5 0.8409 0.8409 1.189 0.7071 2.8 apv.Aspid 1.7",
            "4 0.7071 2.378 0.7071 0.8409 1 2 1 0.8409 2.8 apv.ScruchiPu 1.0",
            "2.378 0.3536 0.7071 1.682 1 0.4204 0.2973 0.7071 2.828 2.8 djc.Aardvark 0.3.6",
            "0.5 2.828 1 1 0.125 0.5 0.7071 0.8409 2 2.8 ers.nano.sunderer.Sunderer 1.23a",
            "2 0.5 1.414 0.8409 1 1 0.8409 1 1 2.8 boe.Minerva 0.80",
            "1.682 1 1.682 0.3536 0.7071 0.7071 1.682 1.189 2.378 2.8 stelo.FretNano 1.1",
            "0.5946 2 2.378 0.5 1.414 0.5 0.5946 0.25 0.7071 2.8 stranger.nano.TestBot 1.0",
            "2.828 0.7071 0.4204 0.5 1.682 0.1768 2.828 1.189 1.414 2.8 arthord.MannyPacquiao Delta2",
            "1.414 0.5 0.5 0.2973 0.4204 0.8409 1.189 0.5946 0.5 2.8 kawigi.sbf.FloodNano 1.2",
            "2.378 4.757 0.7071 0.125 1.414 0.5946 1 0.25 2.378 2.8 muf.CrazyKitten 0.9",
            "2.378 0.5 0.4204 0.7071 0.4204 2 4.757 0.7071 0.25 2.8 apv.TheBrainPi 0.5fix",
            "1 1.414 2 1 1.189 0.8409 1 0.25 2 2.8 strider.Festis 1.2.1",
            "2.828 0.3536 1.414 0.5 0.5946 0.7071 1 1.189 0.4204 2.8 dz.OthoMini 0.15",
            "1.189 0.5 2 1.414 0.5 0.125 0.3536 0.125 1.682 2 av.RobAtHome 1.2",
            "0.8409 0.5946 0.125 0.125 1 1 1.682 2.828 0.3536 2.8 timmit.mini.TimVA 0.43",
            "5.657 1.682 0.3536 1 0.25 0.125 1 1 2 2.8 jab.DiamondStealer 5",
            "0.7071 1.682 1 1 1.189 0.5946 0.7071 0.5 1.682 2.8 hp.Athena 0.1",
            "0.7071 1.682 1.189 1 0.4204 2 1 1 0.8409 2.8 robin.SCALPBot 1.0",
            "0.5 2 0.7071 0.5946 1 1.189 2.378 0.3536 0.2973 2.8 ghent.ArthurPanzergon 1.0.0",
            "1.189 1 3.364 1.189 0.8409 0.4204 0.3536 1.189 0.7071 2.8 staticline.whiskey.Whiskey 0.6",
            "0.8409 0.7071 1.189 1 0.8409 0.5 0.7071 1.414 2 2.8 ratosh.nano.Debo 1.36",
            "1.414 0.7071 1.189 0.8409 0.7071 1 0.7071 1.414 1 2.8 jaara.LambdaBot 1.1",
            "2.378 4 1.414 0.3536 0.3536 0.5946 0.25 0.2102 0.7071 1.4 djdjdj.NanoSkunk10 1.0",
            "8 4 5.657 0.5946 2.378 0.1768 0.2973 0.125 1.189 1 lk.nano.Avesnar 1.1",
            "1.414 1 0.8409 0.8409 4 0.3536 0.5 1.414 0.7071 2.8 patson.PatsonTestBot 1.0",
            "0.8409 1.189 2 1.189 1.189 0.7071 1.414 0.7071 1 2.8 kjc.MailManX 2.0",
            "0.8409 2 2.828 0.2102 0.8409 0.7071 1.682 0.3536 8 2.8 yk.JahRoslav 1.1",
            "0.3536 2 1.189 1 1.414 2.828 0.8409 1.414 0.8409 2.8 dmh.robocode.robot.GreenDragon 1.0",
            "0.2102 1 1.682 0.5946 4 0.8409 0.5946 1.414 0.5 2.8 velas.Beta_2_0 2.0",
            "2.378 1 0.4204 1.414 1.189 0.8409 1.682 1 0.4204 2.8 stf.PanzerGeneral 0.1",
            "2 0.7071 1.414 1.414 0.4204 0.5946 0.8409 1 1 2.8 acid.Null 1.0",
            "5.657 1.414 1.414 0.5 1.189 0.2973 1 0.4204 1.189 2.8 florent.FloatingTadpole 1.2.6",
            "1.414 1.414 1 1 1 1 1.189 1 1 2.8 ebo.Sparse 0.02",
            "0.2973 8 0.7071 0.4204 2.378 0.8409 0.25 0.5946 0.4204 1.4 mmb.Roskilde 0.5",
            "2 1.414 1 1.189 0.7071 1 1.189 1.189 1 2.8 dummy.mini.Parakeet 2.40",
            "1.414 2.828 2.828 0.3536 1.414 0.5 0.3536 0.25 2 2 panzer.Panzer 0.2",
            "0.5946 0.7071 0.7071 0.7071 4 0.25 0.7071 2.828 1.189 2.8 stelo.RamTrackSurfer 1.2",
            "0.7071 0.25 2.378 2 0.1768 0.3536 0.5 1 1.682 2.8 seed.Weed 3.0.2",
            "0.8409 0.7071 0.7071 0.4204 4 0.2102 0.3536 1 4 2 cx.micro.Blur 0.2",
            "0.7071 2.828 2.378 2 0.5946 0.2973 0.5946 0.125 0.3536 2 bzdp.BoxCar 2.0",
            "1 2.378 0.5 0.7071 0.7071 1.189 1 1 1 2.8 rampancy.Durandal 2.2d",
            "5.657 0.8409 4 0.3536 1 1.189 1.682 0.25 0.7071 2.8 jmcd.BeoWulf 2.8",
            "5.657 0.8409 1 0.5946 0.7071 0.3536 0.8409 0.5 1.414 2 doka.Shinigami 2.2",
            "2.828 2 4 2 0.3536 0.4204 0.4204 0.1768 1.414 2.8 robar.micro.Topaz 0.25",
            "0.125 1 1 0.125 0.2973 0.4204 0.2973 0.7071 2.828 2 unarmedlad.nano.VirginSteele 2.2",
            "1.414 1.189 1 0.5946 1 2 0.2973 1.414 1.189 2.8 kc.nano.Splinter 1.2",
            "2.378 0.8409 1 1.189 0.8409 1 1 0.5 0.8409 2.8 tobe.Fusion 1.0",
            "0.3536 0.5946 0.2102 0.5946 0.25 0.7071 1.414 2 1.414 2.8 slugzilla.Parallax 0.1",
            "1.682 2 1.414 1.414 0.25 0.3536 1 0.8409 1.189 2.8 lazarecki.mega.PinkerStinker 0.7",
            "2.828 2 0.2973 0.4204 0.5 0.5946 2 0.8409 0.8409 2.8 tornyil.Lajcsi2.Lajcsi2sm 1.0",
            "0.7071 1 2.828 0.3536 1 0.125 0.7071 0.3536 1 1 elloco.Flower 0.1r1",
            "2 0.7071 1.414 1.682 1.189 1 0.3536 0.4204 1 2.8 ara.Shera 0.88",
            "2 1.189 0.5946 1 0.7071 0.8409 2 0.8409 0.5946 2.8 drm.CobraBora 1.12",
            "2 1.414 1.414 1 0.5 0.5 0.3536 1 1.414 2.8 hlavko.micro.Flex 1.5",
            "4 0.5946 0.7071 1.414 0.8409 1.189 1.189 0.5946 0.7071 2.8 kawigi.sbf.Teancum 1.3",
            "0.3536 3.364 2.378 0.5 2 1.414 2.378 0.1768 0.7071 2.8 jje.BagPuss 1.2",
            "2 1 0.4204 1 0.5946 1.414 1.189 1.189 1 2.8 shrub.Vapour v159",
            "2.378 0.7071 1 0.3536 0.1768 0.5 1.682 1.189 0.8409 2.8 cs.PumpkinPie 1.0",
            "4.757 1 1.682 2 0.5 0.25 0.5946 0.2102 0.1768 2.8 bvh.mini.Wodan 0.50",
            "3.364 4 2.378 1.189 0.5946 0.5 1.189 1.414 2.828 2.8 apc.LeeroyJenkins2 1.0",
            "2 0.5 1 1 0.7071 0.8409 0.8409 1 0.8409 2.8 ntc.Knowledge 1.1",
            "2 2 1.414 0.4204 0.8409 1.189 0.7071 0.5 1 2.8 suh.micro.WallPM 1.00",
            "1 1.414 4 0.7071 0.8409 0.5946 0.1768 0.7071 2 2.8 nova.Snow 1.0",
            "1.682 1 1.189 0.25 0.4204 1.414 1.189 0.25 1.189 2.8 whind.StrengthBee 0.6.4",
            "1 1.189 0.5 0.5946 0.8409 1 0.7071 0.8409 1 2.8 kvk.HebusLeTroll 0.41",
            "2.828 2 8 2.378 1.414 0.3536 1.414 0.125 1.189 2.8 wcsv.Stampede2.Stampede2 1.1.0",
            "0.8409 2.828 2.828 1.682 0.3536 0.8409 1 1 0.3536 2.8 cre.Karolos 0.32",
            "2.378 2 1 0.7071 1.189 0.2102 0.7071 1 4 1.4 amarok.Rookie 1.1",
            "1.414 0.5 1.189 1 2.828 0.1768 0.5 1 0.4204 2.8 sheldor.nano.PointInLineRRAL 1.0.0",
            "1.414 2.378 0.7071 0.5946 1 0.5 1.414 0.8409 1.189 2.8 catcat20.Rabbit 0.001",
            "2.828 0.7071 1.414 1.189 0.5 1.682 1.414 1.414 1 2.8 xander.cat.Fiona 1.4",
            "1.414 1 0.8409 1 0.8409 1 1.414 0.4204 1 2.8 lrem.Spectre 0.4.4",
            "1 2.378 0.25 0.5946 1 0.7071 1.414 1 0.8409 2.8 elloco.Kabuto 0.2r",
            "2.378 1.682 1 0.5 0.8409 2 2 0.5 0.8409 2.8 Krabb.sliNk.Garm 0.9u",
            "2 2 0.25 0.5 1 1 0.8409 1 1.189 2 rus.vv.Snezhok 1.1",
            "3.364 0.4204 1.414 0.5 1.414 2.378 1.682 0.2102 1.189 2.8 sam.ChipmunkDuelist 1.0",
            "4 1 0.7071 0.7071 0.5946 0.7071 2.828 0.4204 1 2.8 shu.nitro.LENIN .T34",
            "8 1.189 0.125 0.5 0.5 0.3536 0.2973 0.5 0.8409 2.8 emp.Yngwie 1.11",
            "1.682 2 0.7071 0.5 0.8409 1 1 0.5 0.4204 2 am.Miedzix 3.0",
            "0.7071 2 1.414 0.8409 0.8409 1.189 2 0.7071 0.7071 2.8 ne.Chimera 1.2",
            "1.189 1.682 1.682 1 1 0.8409 1.414 0.3536 1 2.8 pl.Patton.GeneralPatton 1.54",
            "4 0.8409 0.5946 0.5946 1.414 1 0.7071 2 1 2.8 fushi.PvP1.PvP1 2004-02-16",
            "4 0.7071 1.682 0.7071 0.5 1.414 1.414 0.4204 0.5 2.8 az.Ololobot 0.2.4",
            "2.378 1.682 0.2973 0.7071 1 1 2 0.7071 0.3536 2.8 cb.mega.RandomBot 1.0",
            "2 0.8409 0.3536 0.7071 0.8409 0.4204 1 1 1.414 2 m3thos.mini.Eva01 0.5.5",
            "2.828 0.5946 3.364 1.414 0.5946 0.4204 0.3536 0.125 0.2973 2 bvh.fry.Freya 0.82",
            "2 1.414 0.125 0.25 0.5946 1 1.414 1 0.8409 2 rdm.Dueler 0.4x",
            "8 2 1.682 0.7071 0.5 0.25 0.4204 4 0.8409 2.8 oog.PricklyPear 1.0.6",
            "2 0.7071 2.378 1 0.8409 1 2 2 1 2 sgp.ShiningBeetle 1.1",
            "2 1.189 1.414 1 0.4204 0.4204 1 1 1.414 2.8 dsekercioglu.mini.Partial 0.1.3",
            "4 2 1 1 0.5 0.3536 0.25 0.7071 2 2 paulk.PaulV3 1.7",
            "0.8409 1.414 2.378 0.7071 0.2102 0.3536 0.25 0.8409 2 2.8 lancel.Lynx 1.09",
            "2 2.828 0.4204 0.7071 1.682 0.25 1 0.5 1 1 Legend.X_FireFly 1.3",
            "5.657 1.414 0.3536 0.5946 2 0.7071 0.4204 0.25 0.7071 2.8 pe.SandboxDT 3.02",
            "4 0.8409 2.378 1.414 1.189 0.7071 2 0.25 0.8409 2.8 eem.zapper v6.03",
            "4 1.414 1 1 0.4204 0.7071 1.414 0.8409 0.7071 2 bts.mega.Gnarly 1.4",
            "4 1 0.7071 0.4204 0.1768 0.7071 1 0.25 1.189 2 catcat20.helios.Helios 1.5",
            "2.378 0.8409 1.414 1.414 0.4204 2 1 0.8409 0.5946 2.8 justin.DemonicRage 3.20",
            "4.757 1 0.5 0.5 0.3536 1.682 0.5946 0.125 0.2973 1.4 sheldor.mini.FoilistMC 1.0",
            "1.414 2 1 1 0.7071 0.7071 1.414 1 1.414 0.5 mbh.Mbh 0.1",
            "2.828 1 1.414 0.3536 0.2973 0.7071 5.657 0.8409 1 2.8 sheldor.mini.Foilist 1.3.1",
            "2.378 1.189 2.378 0.7071 0.5946 0.3536 1 1 1.189 2.8 catcat20.shape.Theta 0.018",
            "8 3.364 1.189 0.8409 0.7071 0.5 1.189 0.8409 1.682 2 fromHell.C4H10O 1.5.1",
            "4 0.5946 2 2 0.3536 0.1768 0.7071 0.5 0.5 2 ur4n0.UR4NO 1.0",
            "0.8409 0.8409 2 0.7071 0.125 0.5946 0.25 1.189 1 2 ethdsy.Malacka 2.4",
            "0.8409 1.682 1.682 0.5946 0.25 0.125 1 0.8409 2.828 0.5 dragonbyte.Neutrino 4",
            "2.828 2 4 0.25 1 0.7071 1.189 0.5 2 2.8 catcat20.Lambda 0.017",
            "0.8409 1.414 0.7071 1.682 0.7071 1.414 2 0.25 1.414 2.8 pa3k.Viper 5.03",
            "4 1.414 0.5 1.414 0.5946 0.7071 1.189 0.5946 2 2 ags.Glacier 0.3.2",
            "0.4204 0.7071 1 1 0.25 1 2 0.3536 1 2.8 darkcanuck.Gaff 1.50",
            "0.25 1 0.7071 0.5 1.414 0.25 2 2.828 2.378 0.7 kawam.kmBot9 1.0",
            "2.378 1.414 1.189 0.7071 0.3536 2 0.8409 1.682 1 2 bvh.tyr.Tyr 1.74",
            "8 2.378 0.25 0.5 0.25 0.125 1.414 0.8409 1 2 acid.Bl4ck 1.0",
            "2 1.189 2 1 2 0.8409 1 0.8409 1 2.8 nz.jdc.nano.AralR 1.1",
            "2.378 0.7071 0.7071 0.8409 0.3536 0.4204 2.378 0.7071 1.414 2.8 darkcanuck.Pris 0.92",
            "4 1.414 1.189 0.2102 0.3536 0.1768 0.5946 0.2973 1.189 1.4 ary.micro.Weak 1.2",
            "2 1.189 0.7071 1.414 1 0.7071 0.5 2.828 1 2 oog.nano.SavantWS 0.1",
            "1 1.189 0.5 0.7071 0.5946 0.8409 1.682 0.7071 1 2.8 kc.serpent.WaveSerpent 2.11",
            "3.364 2 0.25 0.8409 0.4204 0.5946 2 1 1.414 2 catcat20.atom.Atom 0.51",
            "1 1 0.25 0.5 0.7071 1 1 0.8409 1 2 voidious.Dookious 1.573c",
            "0.8409 4 1.189 0.8409 0.3536 2 0.7071 0.8409 1 2 zezinho.QuerMePegarKKKK 1.0",
            "2 0.7071 0.2102 0.125 1.682 2 1.682 0.8409 0.25 2 fromHell.CHCl3 1.4.2",
            "2.828 4 2 0.7071 1.414 1 0.7071 0.4204 2 2 bjl.LoneDragon 0.5",
            "2 5.657 0.125 0.1768 2.828 0.25 3.364 0.7071 2 0.7 gio.RealGioBot 1.0",
            "2.828 1.189 2.378 0.3536 0.2102 0.7071 1.189 0.1768 1.414 1.4 jk.melee.Neuromancer 7.12",
            "4 1 4 0.3536 0.25 1.414 1.189 0.5946 0.5946 1.4 lxx.Tomcat 3.68",
            "0.1768 2.378 2.378 1.189 1.189 1 0.125 0.125 0.8409 2 dsx724.VSAB_EP3_ATR 1.1",
            "0.5 1 0.25 0.5 0.25 1.682 0.8409 0.5 0.8409 2 gh.GresSuffurd 0.4.13",
            "0.8409 0.7071 2 0.3536 1.682 0.5 1.414 0.7071 2 1.4 dft.Guppy 1.0",
            "2.828 1.682 2.378 0.8409 0.5946 0.5 0.7071 0.2102 2 1.4 rsalesc.mega.Knight 0.6.28",
            "1.682 1 2.828 1 0.5 1.414 2 0.7071 0.5 2 cb.Domogled 1.2",
            "1.414 0.7071 1.414 1 0.25 1 4 0.5946 0.8409 1.4 voidious.Diamond 1.8.22",
            "2.828 1.189 1.189 1 0.5 1 1.682 0.2102 0.8409 2 ags.rougedc.RougeDC willow",
            "1.414 1.414 0.25 0.7071 0.4204 1 1.414 0.2973 1.414 1.4 jk.precise.Wintermute 0.8",
            "2.378 2.378 0.5 1.682 0.25 0.8409 1.189 0.8409 2 2 hamilton.Hamilton 1.0",
            "0.5 0.8409 4 1 1 0.7071 0.5946 0.1768 2.828 2 mc2.enemy.Original 0.9",
            "2.828 1.189 0.5 0.7071 1.414 1.414 2 0.25 0.2102 1 pc.Wavelet 1.5",
        };
    }
}
