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
            // pc-shelf (BENCH-180, PR #636): held +1 point or more on 12 fresh seeds
            "ary.SMG 1.01",
            "cuoq.Kakera 1.0",
            "kenran.mega.Pantheist 1.1",
            "racso.Crono 1.0",
            "spinnercat.Robovirus 2.718",
            "suh.micro.MirrorPM 1.00",
            // pc-locks round 2 (BENCH-253, PR #845): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "EH.kms.LightningStorm 0.11B",    // +8.8
            "theo.simple.Lucid 1.0",          // +8.7
            "whind.Constitution 0.7.1",       // +5.4
            // pc-locks round 3 (BENCH-253, PR #860): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "rz.Artist 0.2",                 // +13.5
            "DM.mega.Bezier 1.618fprrr",     // +11.0
            "mue.Hyperion 0.8",              // +9.3
            "cx.Princess 1.0",               // +8.2
            "wilson.Chameleon 0.91",         // +7.9
            "jwst.DAD.DarkAndDarker 1.1",    // +7.4
            "ha2.T3 0.2",                    // +6.2
            "cbot.agile.Nibbler 0.2",        // +6.1
            "kawigi.sbf.FloodHT 0.9.2",      // +4.3
            "racso.Frog 0.9",                // +4.1
            "ahf.r2d2.R2d2 0.86",            // +3.5
            "cf.proto.Shiva 2.2",            // +2.8
            "asm.Statistas 0.1",             // +1.9
            // pc-locks round 8 (BENCH-253, PR #905): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "maribo.Omicron 1.0",            // +1.4
            // pc-locks round 10 (BENCH-253, PR #922): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "kawigi.nano.ThnikkaBot 0.9",    // +1.7 (with the shield add)
            // pc-locks round 25 (BENCH-253, PR #1036): 12 fresh PC seeds at the live turn time; cloud lock held first
            "rsim.mini.BulletCatcher 0.4",   // +4.1
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
            "0 0.000000000 css.Delitioner 0.11",
            "0 0.000000000 cuoq.Kakera 1.0",
            "0 0.000000000 cx.micro.Smoke 0.96",
            "0 0.000000000 cx.mini.Nimrod 0.55",
            "0 0.000000000 darkcanuck.Holden 1.13a",
            "0 0.000000000 davidalves.Firebird 0.25",
            "0 0.000000000 davidalves.net.DuelistMini 1.1",
            "0 0.000000000 de.erdega.robocode.Polyphemos 0.4",
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
            // pc-shards (BENCH-252, PR #840): 12 fresh PC seeds at the live turn time after the 470-robot screen
            "panzer.Panzer 0.2",             // +1.9
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
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "-1 ahf.Acero 1.0",              // +1.4
            "-1 ar.QuantumChromodynamics 1.2.1",// +2.0
            "-1 bzdp.BoxCar 2.0",            // +1.9
            "-1 kneels.ToNoone 0.2",         // +2.3
            "-1 myl.nano.KomoriNinja 1.1",   // +1.0
            "-1 sng.arco.Arco 0.0",          // +1.2
            "-1 supersample.SuperTracker 1.0",// +3.5
            "-1 uccc.MilkyWay 1.01",         // +1.0
            // pc-locks round 7 (BENCH-253, PR #902): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "-1 amarok.Rookie 1.1",          // +1.5
            "-1 ghent.ArthurPanzergon 1.0.0",// +3.6
            "-1 sul.NanoR2 1.32",            // +1.4
            "-1 ua.kiiv.kosyak.robocode.tn1.Tn1 2.0",// +2.5
            // pc-locks round 9 (BENCH-253, PR #913): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "-1 av.RobAtHome 1.2",           // +2.8
            "-1 qwaker00.Gandhi 1.2",        // +1.2
            // pc-locks round 10 (BENCH-253, PR #922): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "-1 Fenix.FenixTrack 1.0",       // +2.0
            "-1 repositorio.NanoStep 1.0",   // +1.1
            "-1 shrub.Silver v048",          // +1.9
            // pc-locks round 28 (BENCH-253, PR #1057): 24 fresh PC seeds at the live turn time; cloud lock held first
            "-1 evd.X1 0.01",                // +1.8
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
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "eem.IWillFireNoBullet v2.4",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "fala.robocode.FalaRobot 1.0",                 // +2.1 / +2.0
            "dft.Freddie 1.32",                            // +3.0 / +0.5
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
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "cf.proto.Shiva 2.2",
            "stelo.PastFuture 2.3.2",
            "wompi.Numbat 1.9",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "slugzilla.SNGGF 1.0",                         // +2.4 / +2.7
            "pez.mini.ChironexFleckeri 0.5",               // +3.8 / +1.3
            "populations.TrainStoopidbot 0.01",            // +2.2 / +0.5
            "cx.nano.Smog 2.6",                            // +4.2 / +0.3
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
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "bvh.mini.Wodan 0.50",
            "elloco.Flower 0.1r1",
            "jk.mega.DrussGT 3.1.16",
            "jw.Booring 1.11",
            "kenran.Bakko v1.0.1",
            "lazarecki.mega.PinkerStinker 0.7",
            "mnt.AHEB 0.6a",
            "oog.nano.Caligula 1.15",
            "pe.SandboxDT 3.02",
            "staticline.whiskey.Whiskey 0.6",
            "stf.PanzerGeneral 0.1",
            "stranger.nano.TestBot 1.0",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "GarmBox.Oranges 1.0.1",                       // +3.3 / +1.6
            "md.VelociRaptor 1.3",                         // +2.2 / +1.5
            "gio.RealGioBot 1.0",                          // +2.0 / +1.3
            "theo.real.Ahab 1.0",                          // +8.9 / +1.0
            "test.Podgy 4.0",                              // +4.4 / +0.9
            "dragonbyte.Neutrino 4",                       // +4.5 / +0.0
            // pc-locks (BENCH-253, PR #843): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "Grystrion.TrackerWO 1.0",       // +1.5
            // pc-locks round 3 (BENCH-253, PR #860): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "EH.Pegasus 0.113",              // +2.1
            // pc-locks round 4 (BENCH-253, PR #866): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "genprog.Rinmorikazu 1.0",       // +1.4
            "yk.JahMicro 1.0",               // +1.3
            // pc-locks round 5 (BENCH-253, PR #870): 12 fresh PC seeds at the live turn time; 24-seed cloud lock held first
            "uccc.Dorito 1.12",              // +1.4
            "knackibot.KnackOnOne 0.8.1",    // +1.2
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "sanyi.mikrobi.Roberto 1.0",     // +0.9
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
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "abc.Shadow 3.83c",
            "ags.Glacier 0.3.2",
            "ags.rougedc.RougeDC willow",
            "arthord.NanoSatanMelee Beta",
            "cb.mega.RandomBot 1.0",
            "ebo.Tahoe 1.1.79",
            "jam.RaikoMX 0.32",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "xander.cat.Mikey 1.2",                        // +2.9 / +4.3
            "kc.mega.BeepBoop 2.0",                        // +15.2 / +3.1
            // pc-class-1 (BENCH-241, PR #803): +14.1 on 8 fresh PC seeds (low end +10.4); cloud lock held first
            "cz.libors.Ogi v1",
            // pc-r31 (BENCH-244, PR #817): 12 fresh PC seeds at the live turn time, beating master and its A/A copy
            "cb.fire.Firestarter 2.0f",                    // +8.6
            "kc.serpent.WaveSerpent 2.11",                 // +4.7
            "sheldor.mini.Foilist 1.3.1",                  // +4.1
            "jk.precise.Wintermute 0.8",                   // +4.0
            // pc-gl-lines (BENCH-250, PR #829): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "fromHell.BlackBox 0.0.2",                     // +4.5
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "ap.Frederick 1.1",              // +0.7
            "el33t.EL33tGangstarr2 2.0",     // +1.0
            // pc-locks round 31 (BENCH-253, PR #1076): 24 fresh PC seeds at the live turn time; cloud lock held first
            "zyx.mega.YersiniaPestis 3.0",   // +5.5
            "mue.Ascendant 1.2.27",          // +5.2
            "pc.Wavelet 1.5",                // +4.4
            // pc-locks round 32 (BENCH-253, PR #1080): 24 fresh PC seeds at the live turn time; cloud lock held first
            "jk.melee.Neuromancer 7.12",     // +4.6
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "fnh.mega.DumDum 1.0.1",         // +7.9
            // pc-locks round 34 (BENCH-253, PR #1086): 24 fresh PC seeds at the live turn time; cloud lock held first
            "tornyil.Lajcsi2.Lajcsi2sm 1.0", // +1.9
            // pc-locks round 35 (BENCH-253, PR #1095): 24 fresh PC seeds at the live turn time; cloud lock held first
            "stelo.MatchupMini 1.1",             // +2.1
        };
    }

    /**
     * SHIELD-19: the opponents SHIELD-11 leaves the battle against at 400 damage, not 150.
     * Candidate builds add lines here (build-ablation.sh sx4list).
     *
     * @return a fresh array of names
     */
    static String[] exitLates() {
        return new String[] {
            // pc-shelf (BENCH-180, PR #636): held +3.0 points on 12 fresh seeds
            "stelo.MatchupWS 1.2c",
        };
    }

    /**
     * SHIELD-19: the opponents SHIELD-11 takes no damage exit against (SHIELD-6's budget alone).
     * Empty: candidate builds add lines here (build-ablation.sh sx0list).
     *
     * @return a fresh array of names
     */
    /**
     * SHIELD-33: opponents whose sub-0.1 shots shield mode builds waves for ({@code shield-tiny:} lines), each
     * locked on 12 or more fresh cloud seeds (build-ablation.sh stinylist adds candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] tinies() {
        return new String[] {
            "lrem.quickhack.QuickHack 1.0",
            "wiki.mako.MakoHT 1.2.2.1",
            "dz.Caedo 1.4",
            "kawigi.sbf.FloodSonnet 0.9",
            "oog.micro.SavantMicro 1.1",
            // pc-locks round 30 (BENCH-253, PR #1066): 24 fresh PC seeds at the live turn time; cloud lock held first
            "dummy.micro.Sparrow 2.5",       // +1.4
            // pc-locks round 35 (BENCH-253, PR #1095): 24 fresh PC seeds at the live turn time; cloud lock held first
            "dmh.robocode.robot.YellowBird 0.12", // +1.5 (with the shield list)
        };
    }

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
            // pc-shield-audit (BENCH-209, PR #697): Princess's learned aim moves after three exact rounds and the
            // shield re-learns it only if the mode stays; +7.0 points on 12 fresh seeds
            "cx.Princess 1.0",
            // pc-locks round 2 (BENCH-253, PR #845): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "nz.jdc.nano.PralDeGuerre 1.2",   // +6.5
            "ers.nano.meroka.Meroka 1.8a",    // +4.3
            // pc-locks round 20 (BENCH-253, PR #994): 12 fresh PC seeds at the live turn time; 36-seed cloud lock held first
            "alpha.BlackIce 1.0",             // +3.5
            // pc-locks round 21 (BENCH-253, PR #1001): 12 fresh PC seeds at the live turn time; 24-seed cloud lock held first
            "mue.Hyperion 0.8",               // +8.1
            // pc-locks round 29 (BENCH-253, PR #1062): 24 fresh PC seeds at the live turn time; cloud lock held first
            "oog.micro.MagicD3 0.41",        // +3.6
            // pc-locks round 31 (BENCH-253, PR #1076): 24 fresh PC seeds at the live turn time; cloud lock held first
            "EH.kms.LightningStorm 0.11B",   // +2.6
            // pc-locks round 36 (BENCH-253, PR #1100): 24 fresh PC seeds at the live turn time; cloud lock held first
            "cjm.Che 1.2",                   // +2.5 (on top of its copy)
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
            // pc-shelf (BENCH-180, PR #636): held +1 point or more on 12 fresh seeds
            "shinh.Entangled 0.3",
            // pc-shield-audit (BENCH-209, PR #697): +7.0 points on 12 fresh seeds, with exit off
            "cx.Princess 1.0",
            // pc-ala-shield (BENCH-220, PR #733): +7.34 points on 12 fresh seeds, low end +4.19
            "lechu.Ala 0.0.4",
            // pc-shield-rescreen (BENCH-222, PR #739): Saturn +10.5, OperatorZeze +3.5 on 12 fresh seeds
            "tobe.Saturn lambda",
            "zeze2.OperatorZeze 1.05",
            // pc-still-field (BENCH-223, PR #746): X2 +5.7, Che +3.8, Aardvark +3.6 on 12 fresh seeds
            "florent.XSeries.X2 0.17",
            "cjm.Che 1.2",
            "djc.Aardvark 0.3.6",
            // pc-shield-floor (BENCH-235, PR #781): CassiusClay +37.7 on 12 fresh seeds with the floor line
            "pez.rumble.CassiusClay 2rho.02no",
            // pc-class-1 (BENCH-241, PR #803): +24.3 on 8 fresh PC seeds with the shield list line (low end +19.9)
            "hadur117.micro.Eveimear 0.5",
            // pc-class-2 (BENCH-242, PR #806): +5.9 on 12 fresh PC seeds with the shield list line (+5.2 on pc-class-1's 8)
            "pez.mini.Gouldingi 1.5",
            // pc-r31 (BENCH-244, PR #817): +21.0 on 12 fresh PC seeds at the live turn time, with the shield list line
            "axeBots.Musashi 2.18",
            // pc-locks (BENCH-253, PR #843): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "rz.GlowBlow 2.31",                    // +18.6
            "com.spp.robocode.MostlyHarmless 010", // +3.7
            "davidalves.net.DuelistMicro 1.22",    // +3.4
            "sm.Devil 7.3",                        // +3.4 (already shielded)
            // pc-shards (BENCH-252, PR #840): 12 fresh PC seeds at the live turn time after the 470-robot screen
            "cx.mini.BlackSwans 0.60",             // +21.3
            "pa3k.Manta 1.20",                     // +4.2
            "bndl.LostLion 1.2",                   // +3.5
            "nz.jdc.nano.AralR 1.1",               // +3.0
        };
    }

    /**
     * SHIELD-25: the opponents shield mode fires no shot under 0.4 power at, one name each.
     *
     * @return a fresh array of names
     */
    static String[] shieldFloors() {
        return new String[] {
            // pc-shield-floor (BENCH-235, PR #781): 12 PC seeds against master and its A/A copy pooled
            "pez.rumble.CassiusClay 2rho.02no",  // +37.7 (control 60.9, floor arm 98.6)
        };
    }

    /**
     * SHIELD-27: the opponents shield mode breaks off a close start against: a round that starts
     * inside 150 px hands the drive to the duel until the gap opens past it or tick 60 passes.
     * Candidate builds add lines here (build-ablation.sh sbklist).
     *
     * @return a fresh array of names
     */
    static String[] closeBreaks() {
        return new String[] {
            // pc-locks round 27 (BENCH-253, PR #1050): 24 fresh PC seeds at the live turn time; cloud lock held first
            "NDH.GuessFactor 1.0",           // +6.6
            "cjm.Che 1.2",                   // +3.5
            "starpkg.StarViewerZ 1.26",      // +2.0
            "PkKillers.PkAssassin 1.0",      // +0.9
        };
    }

    /**
     * SHIELD-35: the opponents shield mode yields the drive to while they are close: inside 150 px
     * the duel drives and fires until the gap passes 250 px. Lines ship from pc-locks; candidate
     * builds add lines here (build-ablation.sh syldlist).
     *
     * @return a fresh array of names
     */
    static String[] closeYields() {
        return new String[] {
            // pc-locks round 30 (BENCH-253, PR #1066): 24 fresh PC seeds at the live turn time; cloud lock held first
            "kawigi.mini.Fhqwhgads 1.1",     // +4.0
            "simonton.micro.GFMicro 1.0",    // +6.6
        };
    }

    /**
     * POW-18: the opponents the duel never fires above 0.2 power at, one name each. Shipped by
     * pc-power-cap (BENCH-236); candidate builds add lines here (build-ablation.sh pcaplist).
     *
     * @return a fresh array of names
     */
    static String[] powerCaps() {
        return new String[] {
            "rsalesc.roborio.Roborio 1.2.4",
            "aw.Gilgalad 1.99.5c",
            "cb.fire.Firestarter 2.0f",
            "catcat20.Rabbit 0.001",
            "cb.Domogled 1.2",
            // pc-lines (BENCH-238, PR #798): JKHydra +8.6 +- 5.5 on 8 fresh PC seeds (cloud +10.6 on 8 more)
            "jkong.JKHydra 1.4",
        };
    }

    /**
     * POW-18: the opponents the duel never fires above 0.5 power at, one name each. Shipped by
     * pc-power-cap (BENCH-236); candidate builds add lines here (build-ablation.sh pcap5list).
     *
     * @return a fresh array of names
     */
    static String[] powerCapHalves() {
        return new String[] {
            "stelo.MatchupAGF 1.1",
            "suh.mega.WaveSurferPG 1.06",
        };
    }

    /**
     * POW-19: the opponents the duel fires at least 0.6 power at while our energy is 60 or more (BeepBoop's
     * hard opening against strong surfers). Gilgalad held in pc-locks round 10 (PR #922); candidate builds add lines here (build-ablation.sh hflist).
     *
     * @return a fresh array of names
     */
    static String[] hardFires() {
        return new String[] {
            // pc-locks round 10 (BENCH-253, PR #922): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "aw.Gilgalad 1.99.5c",           // +7.1
        };
    }

    /**
     * MOVE-44: the opponents whose pattern matcher only replays history at exactly our current velocity; the duel
     * never drives at exactly full speed or exactly zero against them, so the matcher finds nothing and falls back
     * (Booring falls back to linear aim, which the surf dodges). Booring held on the PC
     * (pc-locks round 3, PR #860); candidate builds add lines here (build-ablation.sh vjlist).
     *
     * @return a fresh array of names
     */
    static String[] velocityJitters() {
        return new String[] {
            // pc-locks round 3 (BENCH-253, PR #860): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "jw.Booring 1.11",               // +13.7
            // pc-locks round 4 (BENCH-253, PR #866): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "apv.AspidReloaded 0.6",         // +18.0
            // pc-locks round 5 (BENCH-253, PR #870): 12 fresh PC seeds at the live turn time; 24-seed cloud lock held first
            "nosteel.Welby 0.0.3",           // +2.7
            // pc-locks round 16 (BENCH-253, PR #975): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "sgp.MadHatter 4.13",            // +2.7
        };
    }

    /**
     * MOVE-45: the opponents whose rounded-velocity pattern matcher the duel defeats by a random top speed of 7 to 8
     * each tick ({@code speed-band:} lines). Knowledge held on the PC (pc-locks round 4, PR #866).
     *
     * @return a fresh array of names
     */
    static String[] speedBands() {
        return new String[] {
            // pc-locks round 4 (BENCH-253, PR #866): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "ntc.Knowledge 1.1",             // +2.6
            // pc-locks round 27 (BENCH-253, PR #1050): 24 fresh PC seeds at the live turn time; cloud lock held first
            "infovk.s_schwarzm16.silverbird 1.0", // +9.6
        };
    }

    /**
     * RAM-15: the slow chargers the duel backs away from at full speed while they close in ({@code ram-flee:}
     * lines). 24 robots held in pc-locks round 7 (PR #902), 1 more in round 8 (PR #905), 7 in round 9 (PR #913), 2 in round 10 (PR #922); candidate builds add lines here (build-ablation.sh rflist).
     *
     * @return a fresh array of names
     */
    static String[] ramFlees() {
        return new String[] {
            // pc-locks round 7 (BENCH-253, PR #902): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "am.Miedzix 3.0",                // +3.2
            "as.xbots 1.0",                  // +2.1
            "bbo.RamboT 0.3",                // +1.7
            "bvh.hdr.Hodur 0.4",             // +3.0
            "conscience.Bulldozer 1.0a",     // +2.9
            "csp.Eagle 3.30",                // +2.4
            "daemons.DizzyA 1.0",            // +1.1
            "demetrix.nano.SledgeHammer 0.22",// +2.1
            "genprog.Gajeel 1.0",            // +2.1
            "gg.Squaraus 0.6",               // +0.9
            "hirataatsushi.Trinity 0.003",   // +1.7
            "jgap.JGAP130166 1.0",           // +0.9
            "kurios.DOSexe .9a",             // +1.2
            "maribo.FollowFire 1.11",        // +2.8
            "mbro.Detektor3 0.1.1",          // +3.4
            "oog.nano.Caligula 1.15",        // +4.5
            "rcp.Kuramatron 1.0",            // +2.3
            "reeder.colin.WallGuy3 1.0",     // +1.3
            "robin.SCALPBot 1.0",            // +1.8
            "sheldor.nano.SabreuseNano 1.1", // +1.8
            "stelo.Lifestealer 1.0",         // +1.7
            "supersample.SuperRamFire 1.0",  // +7.2
            "uccc.Scrapple 1.0",             // +1.6
            "vort.Chaser 0.0.3",             // +2.5
            // pc-locks round 8 (BENCH-253, PR #905): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "urdos.URDOS 1.3",               // +3.9
            // pc-locks round 9 (BENCH-253, PR #913): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "blir.nano.Bruce R1.0.0",        // +2.0
            "genprog.Zafaran 1.0",           // +2.0
            "japs.Serenity 1.0",             // +0.9
            "mahrgell.mahrram 1.3",          // +2.6
            "nexus.Prototype 1.0",           // +3.5
            "rus.vv.Snezhok 1.1",            // +2.0
            "zch.David 0.21",                // +1.3
            // pc-locks round 10 (BENCH-253, PR #922): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "mbh.Mbh 0.1",                   // +1.7
            "ntw.Sighup 1.5",                // +2.6
            // pc-locks round 12 (BENCH-253, PR #940): 12 fresh PC seeds at the live turn time; 12+ seed cloud lock held first
            "acogdev.alpha 0.2",             // +1.3
            "goblin.Bender 2.4",             // +1.3
            "kjc.etc.Dharok 1.0",            // +1.4
            "marcinek.TopGun 1.3",           // +1.5
            "mbro.BelajarBot 0.0.3",         // +1.6
            // pc-locks round 13 (BENCH-253, PR #951): 12 fresh PC seeds at the live turn time; 24+ seed cloud lock held first
            "agd.Mooserwirt2 2.7",           // +2.2
            "jep.nano.Hawkwing 0.4.1",       // +2.1
            "jgap.JGAP23423 1.0",            // +0.9
            "jp.SineWall 1.0",               // +0.9
            "kjc.Karaykan 1.0",              // +0.8
            "knackibot.KnackOnOne 0.8.1",    // +1.0
            "mld.Infinity 2.2",              // +1.0
            "mmb.Roskilde 0.5",              // +1.9
            "ola.Puffin 1.0",                // +0.9
            "sanja.First 0.1",               // +0.9
            "sheldor.melee.nano.TestMelee 0.1",// +0.9
            "yk.JahRoslav 1.1",              // +1.7
            // pc-locks round 14 (BENCH-253, PR #964): 12 fresh PC seeds at the live turn time; cloud lock held first
            "robin.ScalpBotC 1.0",           // +1.0
            // pc-locks round 28 (BENCH-253, PR #1057): 24 fresh PC seeds at the live turn time; cloud lock held first
            "zyx.nano.RedBull 1.0",          // +1.5
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "oa.weak.FlyMk1 0.1",            // +0.6
            // pc-locks round 35 (BENCH-253, PR #1095): 24 fresh PC seeds at the live turn time; cloud lock held first
            "divineomega.TrialBot 0.003",        // +2.5
        };
    }

    /**
     * MOVE-46: the opponents the duel rams, once they are disabled, only after their last waves have passed
     * ({@code ram-wait:} lines). Empty until a card holds robots; candidate builds add lines here
     * (build-ablation.sh rwlist).
     *
     * @return a fresh array of names
     */
    static String[] ramWaits() {
        return new String[] {
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "cx.nano.Smog 2.6",              // +1.3
            "dukie.Ambassador 1.0",          // +1.0
            "geep.mini.GPBotA 1.0",          // +1.4
            "nexus.Experimental 0.2",        // +1.4
            "pez.nano.LittleEvilBrother 0.1",// +1.4
            "projectx.ProjectNano 2.0",      // +0.9
            "sul.Pinkbot 1.1",               // +0.8
            // pc-locks round 8 (BENCH-253, PR #905): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "Polkwane.Piyane 0.7b",          // +2.9
            // pc-locks round 12 (BENCH-253, PR #940): 12 fresh PC seeds at the live turn time; 24-seed cloud lock held first
            "nan.Ihivatar_Mk_1 1.0",         // +1.3
            // pc-locks round 28 (BENCH-253, PR #1057): 24 fresh PC seeds at the live turn time; cloud lock held first
            "Legend.Qetro 1.6",              // +0.6
            "TCMI.Enyo 0.4",                 // +0.7
            "ab.DengerousRoBatra 1.3",       // +0.9
            "ahf.Acero 1.0",                 // +1.0
            "deo.CloudBot 1.3",              // +0.8
            "doka.ShinigamiKNN 1.0",         // +0.7
            "jep.nano.Hawkwing 0.4.1",       // +0.7
            "joe.ADinosaur 1.0",             // +0.6
            "knackibot.KnackOnOne 0.8.1",    // +0.5
            "krillr.mega.Psyche 0.0.3",      // +1.3
            "lk.nano.Avesnar 1.1",           // +1.4
            "mz.Movement 1.8",               // +1.1
            "oog.nano.SavantVS 1.1",         // +0.8
            "strider.Festis 1.2.1",          // +1.0
            "wiki.BasicGFSurfer 1.02",       // +0.9
            // pc-locks round 29 (BENCH-253, PR #1062): 24 fresh PC seeds at the live turn time; cloud lock held first
            "dcs.Eater_of_Worlds_Mini 1.0",  // +0.6
            "janm.Jammy 1.0",                // +1.0
            "Legend.X_FireFly 1.3",          // +1.2
            "mladjo.iRobot 0.3",             // +1.2
            "ph.Thinker 0.2.5",              // +1.0
            "sam.Samspin 1.0",               // +0.8
            "toz.Gnome 1.1",                 // +0.7
            // pc-locks round 30 (BENCH-253, PR #1066): 24 fresh PC seeds at the live turn time; cloud lock held first
            "Krabb.fe4r.Fe4r 0.4",           // +1.6
            "ry.LightningBug 1.0",           // +1.1
            // pc-locks round 31 (BENCH-253, PR #1076): 24 fresh PC seeds at the live turn time; cloud lock held first
            "buba.Buba 0.3",                 // +1.1
            "kjc.etc.Dharok 1.0",            // +0.6
            "slugzilla.RandomLinear 1.0",    // +0.7
            "sul.NanoR2 1.32",               // +1.6
            "zzx.Gron 1.14",                 // +1.1
            // pc-locks round 32 (BENCH-253, PR #1080): 24 fresh PC seeds at the live turn time; cloud lock held first
            "jep.nano.Hotspur 0.1",          // +0.7
            "nexus.One 1.0",                 // +0.5
            "rus.vv.Dzhigit 1.1",            // +1.0
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "slugzilla.SNGGF 1.0",           // +0.6
            // pc-locks round 34 (BENCH-253, PR #1086): ram-wait class of 46 judged pooled on 24 fresh PC seeds (+0.20 +- 0.09 points a robot, gate PASS); the class ships whole
            "nexus.Prototype 1.0",           // +0.91
            "zyx.micro.Ant 1.1",             // +0.79
            "supersample.SuperWalls 1.0",    // +0.72
            "supersample.SuperBoxBot 1.0",   // +0.55
            "hvilela.HVilela 0.9",           // +0.52
            "supersample.SuperTracker 1.0",  // +0.48
            "amc.ROBv400 1.0",               // +0.44
            "PK.Twardy 0.4.2",               // +0.44
            "timmit.nano.TimDog 0.33",       // +0.38
            "spin.Bugstard 0.012b",          // +0.37
            "nat.Hikari dev0001",            // +0.36
            "sng.arco.Arco 0.0",             // +0.35
            "WidowMakersAtWar.EpicCow 1.0",  // +0.35
            "nexus.Two 0.2",                 // +0.34
            "zyx.nano.Ant 1.1",              // +0.31
            "cs.Wren 1.0",                   // +0.30
            "pak.JakeTheTestingRobot .1b",   // +0.30
            "sul.BlueBot 1.0",               // +0.29
            "mz.AdeptBSB 1.03",              // +0.28
            "asd.Cthulhu 1.2",               // +0.26
            "marcinek.TopGun 1.3",           // +0.24
            "mrm.MightyMoose .2",            // +0.22
            "stranger.nano.TestBot 1.0",     // +0.21
            "blir.micro.blixi.Blixi 1.2",    // +0.21
            "jeremyreeder.Bully 1",          // +0.18
            "jf.Dodger 1.3",                 // +0.18
            "And.BasicSurfer FF1.6",         // +0.17
            "traker.Eraser 1",               // +0.16
            "bigpete.Stewie 1.0",            // +0.15
            "zyx.nano.RedBull 1.0",          // +0.13
            "fcr.First 1.0",                 // +0.12
            "disan.Chair 2.2.0",             // +0.12
            "robo.PartsBot 1.1",             // +0.11
            "myl.nano.Graviton 1.10",        // +0.11
            "uccc.RingDing 1.12",            // +0.09
            "ratosh.Nobo 0.21",              // +0.09
            "extra.Sauce .01",               // +0.07
            "dsw.StaticD 1.0",               // +0.06
            "Fenix.FenixTrack 1.0",          // +0.03
            "Gecko.ultimateGeckoBot 1.0",    // +0.03
            "pla.Memnoch 0.5",               // +0.00
            "tvv.micro.Antares 1.1.1",       // -0.16
            "tobe.mini.Charon 0.9",          // -0.24
            "pl.robocode.Pacyfista 1.0",     // -0.29
            "caimano.Furia_Ceca 0.22",       // -0.39
            "pmc.SniperBot 1.0",             // -1.17
        };
    }

    /**
     * MOVE-47: the opponents the duel surfs with a steady orbit: no stop option, and a reversal only when the other
     * way round is under half as dangerous ({@code steady-orbit:} lines). Empty until a card holds robots; candidate
     * builds add lines here (build-ablation.sh orlist).
     *
     * @return a fresh array of names
     */
    static String[] steadyOrbits() {
        return new String[] {
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "davidalves.net.DuelistNano 1.0",// +5.1
            "dmh.robocode.robot.GreenDragon 1.0",// +2.9
            // pc-field-screen round 2 (BENCH-253 tuner, PR #1065): 12 fresh PC seeds at the live turn time after the PC screen
            "arthord.NanoSatanMelee Beta",   // +4.1
            "cb.mega.RandomBot 1.0",         // +6.8
        };
    }

    /**
     * DIST-4: per-opponent pinned duel distance, one line each: the surf's desired distance in px, then the name.
     * The pin replaces DIST-1's controller target against that robot in a duel (END-1's finish still closes in).
     * Candidate builds add lines here (build-ablation.sh dplist).
     *
     * @return a fresh array of lines
     */
    static String[] distPins() {
        return new String[] {
            // pc-locks round 4 (BENCH-253, PR #866): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "625 az.Ololobot 0.2.4",         // +3.2
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "600 mc2.enemy.Original 0.9",    // +1.2
        };
    }

    /**
     * POW-20: per-opponent power bands, one line each: four multipliers on the duel's chosen power while our energy
     * is 20-40, 40-60, 60-80 and 80 or more, then the name. Each copies BeepBoop's power by its own energy against
     * that robot (from truth logs). Candidate builds add lines here (build-ablation.sh pblist).
     *
     * @return a fresh array of lines
     */
    static String[] powerBands() {
        return new String[] {
            // pc-locks round 2 (BENCH-253, PR #845): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "0.40 0.30 0.30 0.30 ncj.MoxieBot 1.0",  // +13.4
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "0.5 0.5 0.5 0.5 dragonbyte.Neutrino 4", // +3.5
        };
    }

    /**
     * MIR-2: the opponents the duel never runs MIR-1 (the mirror detector, its drive and its aim)
     * against. Empty until a card holds robots; candidate builds add lines here (build-ablation.sh
     * mirofflist).
     *
     * @return a fresh array of names
     */
    static String[] mirrorOffs() {
        return new String[] {
            // pc-mirror-off (BENCH-224, PR #750): 12 PC seeds against master and its A/A copy pooled
            "janm.Jammy 1.0",         // +11.4
            "suh.nano.MirrorH 1.01",  // +3.8
            "suh.nano.MirrorL 1.00",  // +3.6
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
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "apv.NanoLauLectrikTheCannibal 1.1",
            "nz.jdc.micro.HedgehogP 1.2",
            "sheldor.mini.Foilist 1.3.1",
            "tornyil.bottomup.BottomUp 1.05",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "rsalesc.roborio.Roborio 1.2.4",               // +5.1 / +1.8
            "apv.LauLectrik 1.2",                          // +7.8 / -1.8
            // pc-r31 (BENCH-244, PR #817): +7.0 on 12 fresh PC seeds at the live turn time
            "mue.Ascendant 1.2.27",
        };
    }

    /**
     * MOVE-34: the opponents the duel surfs with MOVE-33's learning-gun mimics as aim members: the
     * pc-mimic-on (BENCH-172) picks that held on pc-mimic9 (BENCH-177), and pc-mimic-wide's (BENCH-179). Candidate builds add lines
     * here (build-ablation.sh mmlist).
     *
     * @return a fresh array of names
     */
    static String[] mimicOns() {
        return new String[] {
            // pc-mimic9 (BENCH-177, PR #603): pc-mimic-on's picks that held on 12 fresh seeds from 8400 (gate +0.03 +- 0.02 APS);
            // cb.Domogled 1.2 fell to -0.8 and stays off.
            "darkcanuck.Gaff 1.50",
            "darkcanuck.Pris 0.92",
            "lazarecki.mega.PinkerStinker 0.7",
            "fromHell.BlackBox 0.0.2",
            "gh.GresSuffurd 0.4.13",
            "cb.fire.Firestarter 2.0f",
            "fromHell.CHCl3 1.4.2",
            "aaa.r.ScalarR 0.005h.053-noshield",
            // pc-mimic-wide (BENCH-179, PR #614): the 2 of 36 untried learners picked on the screen (8 seeds from 8600),
            // both holding on 12 fresh seeds from 8800 (+6.1 and +5.9 points; +0.01 APS together, the most 2 robots
            // can reach, so the card's +0.02 bar was out of reach by construction).
            "gre.svman4.Morfeas 1.4.3",
            "ags.rougedc.RougeDC willow",
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "DM.mega.Regicide 2.0rrr",
            "deo.virtual.RainbowBot 1.0",
            "jk.precise.Wintermute 0.8",
            "nz.jdc.nano.PralDeGuerre 1.2",
            "romz.robot.Test 0.1.0",
            "theo.simple.Lucid 1.0",
            "voidious.Diamond 1.8.22",
            "voidious.Dookious 1.573c",
            "whind.StrengthBee 0.6.4",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "kawigi.sbf.FloodSonnet 0.9",                  // +9.0 / +4.7
            "gh.mini.Grimmig 0.3.6",                       // +2.3 / +0.8
            "djdjdj.NanoSkunk10 1.0",                      // +3.6 / +0.3
            "eat.HumblePieLite 1.0",                       // +2.9 / -0.2
            "amk.ChumbaMini 0.2",                          // +5.2 / -0.5
            // pc-locks (BENCH-253, PR #843): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first (pc-shards PR #840 held it too, +2.6)
            "cb.Domogled 1.2",               // +3.9
        };
    }

    /**
     * POW-15: the opponents the duel never fires a full-power rule (POW-1 to POW-4) at. Empty until
     * a card holds robots; candidate builds add lines here (build-ablation.sh fplist).
     *
     * @return a fresh array of names
     */
    static String[] fullOffs() {
        return new String[] {
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "DTF.Kludgy 1.2b",
            "axeBots.Musashi 2.18",
            "cb.Domogled 1.2",
            "cx.Lacrimas 1.36",
            "dsekercioglu.mini.Partial 0.1.3",
            "fushi.PvP1.PvP1 2004-02-16",
            "pa3k.Viper 5.03",
            "stelo.MatchupMicro 1.2",
            "stelo.MatchupMini 1.1",
            "suh.nano.AngularMirrorC 1.00",
            "xander.cat.Fiona 1.4",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "dz.GalbaMicro 0.11",                          // +3.9 / +4.6
            "wiki.nano.Flick 1.0",                         // +5.5 / +3.4
            "eld.Hmm 1.0",                                 // +4.6 / +1.3
            "jekl.Jekyl .70",                              // +7.8 / -1.3
            "cjm.Che 1.2",                                 // +9.1 / -2.7
        };
    }

    /**
     * POW-16: the opponents the duel fires only x.x5 powers at (2.45, 1.95, ...), whose bullet speed
     * sits on a rounding edge that a surfer matching hits to its waves by {@code round(speed * 10)}
     * misses, so it never learns where it was hit. Empty until a card holds robots; candidate builds
     * add lines here (build-ablation.sh x5list).
     *
     * @return a fresh array of names
     */
    static String[] x5Powers() {
        return new String[] {
            // BENCH-197 pc-tailor-field (PR #686): picked on the whole-field screen, kept on fresh seeds.
            "ary.Crisis 1.0",
            "dz.GalbaMini 0.121",
            "ebo.Sparse 0.02",
            "eem.zapper v6.03",
            "hp.Athena 0.1",
            "pl.Drum 0.1",
            "pulsar.PulsarMax 0.8.9",
            "rampancy.Durandal 2.2d",
            "stelo.RamTrackSurfer 1.2",
            "test.Fuzzer 1.0.1",
            // pc-class-2 (BENCH-242, PR #806): +3.1 on 12 fresh PC seeds (+4.2 on pc-class-1's 8)
            "sos.SOS 1.0",
            "tw.Exterminator 1.0",
            // BENCH-207 pc-tailor-near (PR #704): leaned on pc-tailor-field's screen, picked on 4 new seeds, kept on 4 fresh ones (screen / confirm points).
            "pl.Patton.GeneralPatton 1.54",                // +7.1 / +8.1
            "cre.Karolos 0.32",                            // +5.2 / +4.0
            // pc-field-screen (BENCH-251, PR #832): picked on 6 PC seeds, +3.7 on 12 fresh PC seeds at the live turn time (low end +0.2)
            "justin.DemonicRage 3.20",
            // pc-locks (BENCH-253, PR #843): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "kenran.Bakko v1.0.1",           // +5.9
            "deo.virtual.RainbowBot 1.0",    // +3.5 (on top of its line)
        };
    }

    /**
     * POW-17: the opponents the duel picks its bullet power against by the energy race
     * ({@code race-power:} lines): the 8 robots pc-race-power (BENCH-206, PR #695) locked at a 3-point margin on
     * 4 fresh seeds after a whole-field screen (confirm gate +0.10 +- 0.05 APS).
     *
     * @return a fresh array of names
     */
    static String[] racePowers() {
        return new String[] {
            // pc-race-power (BENCH-206, PR #695): points over master on the 4 confirm seeds
            "kc.mega.BeepBoop 2.0",          // +24.3
            "jd.Nullstride 2.3.3",           // +16.7
            "dragonbyte.Neutrino 4",         // +15.5
            "voidious.Diamond 1.8.22",       // +15.3
            "mn.Combat 3.25.0",              // +13.8
            "lxx.Tomcat 3.68",               // +10.8
            "voidious.Dookious 1.573c",      // +6.4
            "sheldor.mini.FoilistMC 1.0",    // +5.9
            // pc-r31 (BENCH-244, PR #817): 12 fresh PC seeds at the live turn time
            "eem.zapper v6.03",              // +4.1
            // pc-locks round 3 (BENCH-253, PR #860): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "eem.EvBotNG v12.8",             // +4.9
            "DM.mega.Regicide 2.0rrr",       // +4.2
            // pc-locks round 6 (BENCH-253, PR #890): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "damij.mega.Boque aaah",         // +4.3
            // pc-locks round 8 (BENCH-253, PR #905): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "kc.serpent.WaveSerpent 2.11",   // +5.2
            // pc-locks round 10 (BENCH-253, PR #922): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "hope.Identity .pope69",         // +6.8
            // pc-locks round 11 (BENCH-253, PR #929): 12 fresh PC seeds on Robocode 1.12.0 at the live turn time; 24-seed cloud lock held first
            "dsekercioglu.mega.Raven 3.56j8",    // +4.8
            "dsekercioglu.mega.WhiteFang 2.8.1", // +4.3
            "Krabb.sliNk.Garm 0.9u",             // +4.2
            "dev.kurtw.KurtBot 0.2",             // +3.7
            // pc-locks round 25 (BENCH-253, PR #1036): 12 fresh PC seeds at the live turn time; cloud lock held first
            "slugzilla.Parallax 0.1",            // +2.4
            // pc-locks round 27 (BENCH-253, PR #1050): 24 fresh PC seeds at the live turn time; cloud lock held first
            "zen.Mirage 0.9.5",                  // +7.4
        };
    }

    /**
     * RAM-14: the rammers whose shots the escape weighs twice as heavily ({@code ram-heavy:} lines). Empty on master
     * until a PC card holds a line.
     *
     * @return a fresh array of names
     */
    static String[] ramHeavies() {
        return new String[] {
        };
    }

    /**
     * RAM-17: the rammers whose linear and circular aims the escape dodges as +-4 degree fans, at RAM-14's weight
     * ({@code ram-fan:} lines). Lifestealer and nanoPri held in pc-locks round 11 (PR #929); candidate builds add
     * lines here (build-ablation.sh rfanlist).
     *
     * @return a fresh array of names
     */
    static String[] ramFans() {
        return new String[] {
            // pc-locks round 11 (BENCH-253, PR #929): 12 fresh PC seeds at the live turn time; cloud lock held first
            "step.nanoPri 1.0",              // +2.4
            "stelo.Lifestealer 1.0",         // +1.9
        };
    }

    /**
     * RAM-20: the rammers whose shots the escape dodges by the aims learned from their own bullets
     * ({@code ram-learn:} lines). Each held a PC card after a cloud lock (build-ablation.sh rlearnlist adds
     * candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] ramLearns() {
        return new String[] {
            // pc-locks round 23 (BENCH-253, PR #1018): 12 fresh PC seeds at the live turn time, 95% low end above 0; cloud lock held first
            "as.xbots 1.0",                  // +3.2
            "blir.nano.Bruce R1.0.0",        // +2.5
            "com.syncleus.robocode.Dreadnaught 0.1",// +2.9
            "demetrix.nano.SledgeHammer 0.22",// +3.7
            "gg.Squaraus 0.6",               // +1.0
            "kc.micro.rammer.MaxRisk 0.6",   // +2.5
            "kurios.DOSexe .9a",             // +2.6
            "marcinek.TopGun 1.3",           // +1.4
            "maribo.FollowFire 1.11",        // +2.4
            "mn.nano.perceptual.Impact 1.3.0",// +1.9
            "mz.NanoDeath 2.56",             // +2.2
            "nexus.Prototype 1.0",           // +1.8
            "oog.nano.Caligula 1.15",        // +2.5
            "stelo.Lifestealer 1.0",         // +3.5
            "step.nanoPri 1.0",              // +3.4
            "suh.nano.RammingC 1.00",        // +1.7
            "sul.Bicephal 1.2",              // +2.1
            "supersample.SuperRamFire 1.0",  // +3.4
            "suzushin7.nano.Galaxy03 1.01",  // +2.5
            // pc-locks round 24 (BENCH-253, PR #1024): 12 fresh PC seeds at the live turn time, 95% low end above 0; cloud lock held first.
            // Gains are with the ram-known line as well (RAM-21), Predator excepted, which holds this line alone.
            "EH.Fusion 0.32",                       // +5.2
            "benhorner.PureAggression 0.2.6",       // +2.2
            "bvh.hdr.Hodur 0.4",                    // +1.3
            "ep.MyFirstRobot 1.0",                  // +1.5
            "ers.nano.sunderer.Sunderer 1.23a",     // +2.8
            "exauge.Leopard 1.1.019",               // +1.1
            "fw.Number1 1.0b",                      // +3.0
            "gh.micro.GrubbmThree 1.01",            // +3.9
            "jeremyreeder.Bully 1",                 // +1.9
            "jk.nano.Machete 2.0",                  // +2.3
            "lorneswork.Predator 1.0",              // +1.9
            "qualidafial.MajorDick 1.0.1",          // +1.1
            "radnor.RamRod 1.0",                    // +2.9
            "stelo.RamTrackSurfer 1.2",             // +2.0
            "stranger.nano.TestBot 1.0",            // +2.6
            "wompi.Kowari 1.6",                     // +4.1
            "zch.Hirkan 0.11",                      // +1.4
            // pc-locks round 31 (BENCH-253, PR #1076): 24 fresh PC seeds at the live turn time; cloud lock held first
            "jab.micro.Sanguijuela 0.8",     // +2.5
            // pc-locks round 32 (BENCH-253, PR #1080): 24 fresh PC seeds at the live turn time; cloud lock held first
            "apc.Colossus2 0.12",            // +2.7
            "jje.BagPuss 1.2",               // +1.0
            "velas.Alpha 1.0",               // +2.5
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "agrach.MicroDalek 1.0",         // +0.7
            "blr.Chicken001 0.1",            // +0.8
            "djdjdj.NanoSkunk10 1.0",        // +1.6
            "sanyi.mikrobi.Roberto 1.0",     // +0.8
            "supersample.SuperCorners 1.0",  // +3.4
            "whitesquare.robots.SkynetAdvanced 1.1", // +0.9
            // pc-locks round 35 (BENCH-253, PR #1095): 24 fresh PC seeds at the live turn time; cloud lock held first
            "squidM.SquidmanNano 1.0",           // +1.5
            "hlavko.nano.Ringo 2.0",             // +1.5
            "zyx.nano.RedBull 1.0",              // +1.6 (with its ram flee)
        };
    }

    /**
     * RAM-21: the rammers confirmed from the battle's first scan ({@code ram-known:} lines). Each held
     * a PC card after a cloud lock (build-ablation.sh rknownlist adds candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] ramKnowns() {
        return new String[] {
            // pc-locks round 24 (BENCH-253, PR #1024): 12 fresh PC seeds at the live turn time, 95% low end above 0; cloud lock held first.
            // Each also holds a ram-learn line (RAM-20).
            "EH.Fusion 0.32",                       // +5.2
            "benhorner.PureAggression 0.2.6",       // +2.2
            "bvh.hdr.Hodur 0.4",                    // +1.3
            "com.syncleus.robocode.Dreadnaught 0.1",// +2.2
            "ep.MyFirstRobot 1.0",                  // +1.5
            "ers.nano.sunderer.Sunderer 1.23a",     // +2.8
            "exauge.Leopard 1.1.019",               // +1.1
            "fw.Number1 1.0b",                      // +3.0
            "gh.micro.GrubbmThree 1.01",            // +3.9
            "jeremyreeder.Bully 1",                 // +1.9
            "jk.nano.Machete 2.0",                  // +2.3
            "kc.micro.rammer.MaxRisk 0.6",          // +1.7
            "mn.nano.perceptual.Impact 1.3.0",      // +1.8
            "mz.NanoDeath 2.56",                    // +2.9
            "qualidafial.MajorDick 1.0.1",          // +1.1
            "radnor.RamRod 1.0",                    // +2.9
            "stelo.RamTrackSurfer 1.2",             // +2.0
            "step.nanoPri 1.0",                     // +2.0
            "stranger.nano.TestBot 1.0",            // +2.6
            "suh.nano.RammingC 1.00",               // +2.2
            "sul.Bicephal 1.2",                     // +2.5
            "suzushin7.nano.Galaxy03 1.01",         // +2.6
            "wompi.Kowari 1.6",                     // +4.1
            "zch.Hirkan 0.11",                      // +1.4
            // pc-locks round 31 (BENCH-253, PR #1076): 24 fresh PC seeds at the live turn time; cloud lock held first
            "jab.micro.Sanguijuela 0.8",     // +2.5
            // pc-locks round 32 (BENCH-253, PR #1080): 24 fresh PC seeds at the live turn time; cloud lock held first
            "apc.Colossus2 0.12",            // +2.7
            "velas.Alpha 1.0",               // +2.5
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "agrach.MicroDalek 1.0",         // +0.7
            "blr.Chicken001 0.1",            // +0.8
            "djdjdj.NanoSkunk10 1.0",        // +1.6
            "sanyi.mikrobi.Roberto 1.0",     // +0.8
            "supersample.SuperCorners 1.0",  // +3.4
            // pc-locks round 35 (BENCH-253, PR #1095): 24 fresh PC seeds at the live turn time; cloud lock held first
            "squidM.SquidmanNano 1.0",           // +1.5
            "hlavko.nano.Ringo 2.0",             // +1.5
            "zyx.nano.RedBull 1.0",              // +1.6 (with its ram flee)
        };
    }

    /**
     * RAM-18: the rammers the escape bends away from its own line of travel after each of their shots
     * ({@code ram-bend:} lines). Each held a PC card after a cloud class lock (build-ablation.sh rbendlist adds
     * candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] ramBends() {
        return new String[] {
            // pc-locks round 14 (BENCH-253, PR #964): 12 fresh PC seeds at the live turn time; 12-seed cloud class lock held first
            "bayen.UbaRamLT 1.0",            // +1.4
            "jab.micro.Sanguijuela 0.8",     // +1.4
            "mn.nano.perceptual.Impact 1.3.0",// +3.2
            "mz.NanoDeath 2.56",             // +3.1
            "sul.Bicephal 1.2",              // +2.5
            "wompi.Kowari 1.6",              // +2.9
            // pc-locks round 16 (BENCH-253, PR #975): 12 fresh PC seeds at the live turn time; 12-seed cloud lock held first
            "benhorner.PureAggression 0.2.6",// +1.3
            "gh.micro.GrubbmThree 1.01",     // +3.4
            "suh.nano.RammingC 1.00",        // +3.0
            // pc-locks round 17 (BENCH-253, PR #978): +1.24 (low +0.33) on 12 fresh PC seeds; rounds 14/16/17 (-0.59, +1.73, +1.24) pool to +0.79, low end +0.1 to +0.3
            "exauge.Leopard 1.1.019",        // +1.2
        };
    }

    /**
     * MOVE-56: the opponents whose truncated-lateral-velocity pattern matcher a mimic joins the danger for
     * ({@code pm-mimic:} lines), each locked on 12 fresh cloud seeds with a round-by-round forensic (build-ablation.sh pmlist adds candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] patternMimics() {
        return new String[] {
            "jcs.AutoBot 4.2.1",
            // pc-locks round 16 (BENCH-253, PR #975): 12 fresh PC seeds at the live turn time, +10.3
            "oog.micro.Maui 1.2",
            // pc-locks round 17 (BENCH-253, PR #978): 12 fresh PC seeds at the live turn time, +11.1
            "arthord.NanoSatan Mu",
            // pc-locks round 19 (BENCH-253, PR #991): 12 fresh PC seeds at the live turn time, +6.8, +3.6, +1.7
            "nova.Snow 1.0",
            "robar.nano.Assertive 0.3",
            "stf.PanzerGeneral 0.1",
        };
    }

    /**
     * RAM-11: the rammers whose shots the escape also dodges as circular aims ({@code ram-circ:} lines), each locked on
     * 12 fresh PC seeds at the live turn time after a 12-seed cloud lock.
     *
     * @return a fresh array of names
     */
    static String[] ramCircs() {
        return new String[] {
            // pc-ram11 (BENCH-248, PR #827)
            "step.nanoPri 1.0",                // +6.4
            "suh.nano.RammingC 1.00",          // +5.8
            "suzushin7.nano.Galaxy03 1.01",    // +4.3
            // pc-ram11b (BENCH-249, PR #828)
            "EH.Fusion 0.32",                  // +4.7
        };
    }

    /**
     * COPY-2: per-opponent bred copies of the gun, each line {@code "genome name"}: the genome as
     * {@code data/tools/copy_breed.py} writes it (COPY-1), grown from truth logs of the opponent's
     * bullets. Empty until a line locks; build-ablation.sh copylist adds candidate lines here.
     *
     * @return a fresh array of lines
     */
    static String[] copies() {
        return new String[] {
            // pc-locks round 33 (BENCH-253, PR #1083): 24 fresh PC seeds at the live turn time; cloud lock held first
            "hist;bins=61;d_max=750;lag=1;roll=0.3;s_accel=1;s_dist=1;s_lat=1;s_since=1;s_wall=1;smooth=0;ticks=0 dummy.micro.HummingBird 2.14", // +4.9
            "hist;bins=61;d_max=900;lag=1;roll=0.3;s_accel=1;s_dist=1;s_lat=2;s_since=1;s_wall=1;smooth=0;ticks=1 jaara.LambdaBot 1.1", // +7.4
            "hist;bins=41;d_max=1200;lag=0;roll=0.3;s_accel=1;s_dist=1;s_lat=1;s_since=1;s_wall=1;smooth=1;ticks=1 stelo.FretNano 1.1", // +2.8
            "hist;bins=61;d_max=750;lag=1;roll=0.03;s_accel=1;s_dist=3;s_lat=6;s_since=1;s_wall=1;smooth=2;ticks=1 tornyil.bottomup.BottomUp 1.05", // +9.1
            "knn;cap=20000;k=20;lag=0;ticks=0;w_accel=1;w_adv=0;w_dist=4;w_lat=2;w_since=2;w_wall=1;width=0.1 zen.Ronin 1.0.0", // +3.4
            // pc-locks round 34 (BENCH-253, PR #1086): 24 fresh PC seeds at the live turn time; cloud lock held first
            "pm;round=0.5x0.5;longest=20;least=1;lag=1 cjm.Che 1.2", // +1.3
            "hist;bins=61;d_max=1200;lag=0;roll=0.03;s_accel=3;s_dist=4;s_lat=1;s_since=2;s_wall=1;smooth=3;ticks=1 darkcanuck.Pris 0.92", // +4.3
            "knn;cap=20000;k=35;lag=1;ticks=1;w_accel=4;w_adv=1;w_dist=2;w_lat=4;w_since=2;w_wall=0.25;width=0.1 lancel.Lynx 1.09", // +5.5
            "knn;cap=500;k=20;lag=1;ticks=0;w_accel=0;w_adv=2;w_dist=2;w_lat=1;w_since=1;w_wall=0.25;width=0.1 mn.Combat 3.25.0", // +2.4
            // pc-locks round 36 (BENCH-253, PR #1100): 24 fresh PC seeds at the live turn time; cloud lock held first
            "knn;cap=500;k=10;lag=1;ticks=0;w_accel=1;w_adv=4;w_dist=2;w_lat=4;w_since=1;w_wall=0;width=0.1 cz.libors.Ogi v1", // +4.3
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
            // pc-locks round 5 (BENCH-253, PR #870): 12 fresh PC seeds at the live turn time, +3.2; 12-seed cloud lock held first (shard M)
            "0.8409 0.4204 0.2102 0.2973 0.25 1.414 2.828 0.5 0.2973 2.8 cb.nano.Insomnia 1.0",
        };
    }

    /**
     * MOVE-58: opponents whose cw.megas-form pattern matcher a mimic joins the danger for ({@code pm-megas:} lines), each
     * locked on 12 fresh cloud seeds (build-ablation.sh pmxlist adds candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] patternMegas() {
        return new String[] {
            "cw.megas.GhostShell GT",
            "cw.megas.Gridd 0.4",
            "cw.megas.Polar 3.2",
            "cw.megas.Silhouette 1.1",
            // pc-locks round 19 (BENCH-253, PR #991): 12 fresh PC seeds at the live turn time, +2.6
            "KiraNL.SpaceKees 0.1",
        };
    }

    /**
     * MOVE-71: mostly head-on shooters whose fire bearing gets a danger floor ({@code head-on-floor:} lines;
     * build-ablation.sh hoflist adds candidate lines here). Empty until a line locks.
     *
     * @return a fresh array of names
     */
    static String[] headOnFloors() {
        return new String[] {
            // pc-locks round 28 (BENCH-253, PR #1057): 24 fresh PC seeds at the live turn time; cloud lock held first
            "Legend.X_FireFly 1.3",          // +1.4
        };
    }

    /**
     * GUN-13: opponents the gun keeps weighing our bullets' shadows against (GUN-7) once the duel reads as won
     * ({@code shadow-keep:} lines; build-ablation.sh shklist adds candidate lines here). Empty until a line locks.
     *
     * @return a fresh array of names
     */
    static String[] shadowKeeps() {
        return new String[] {
        };
    }

    /**
     * GUN-12: opponents the duel gun fires against with free gun on ({@code free-gun:} lines; build-ablation.sh
     * fglist adds candidate lines here). Empty until a line locks.
     *
     * @return a fresh array of names
     */
    static String[] freeGuns() {
        return new String[] {
        };
    }

    /**
     * MOVE-67: opponents against which the simple aim members stand at weight 1.0 ({@code aim-weight:} lines), each
     * locked on fresh cloud seeds (build-ablation.sh aimwlist adds candidate lines here).
     *
     * @return a fresh array of names
     */
    static String[] aimWeights() {
        return new String[] {
            // pc-locks round 19 (BENCH-253, PR #991): 12 fresh PC seeds at the live turn time, +1.6, +1.2
            "com.syncleus.robocode.Dreadnaught 0.1",
            "nic.Nicator 2.4",
            // pc-locks round 20 (BENCH-253, PR #994): 12 fresh PC seeds at the live turn time, +2.4
            "lrem.micro.MoggFanatic 0.2",
            // pc-locks round 27 (BENCH-253, PR #1050): 24 fresh PC seeds at the live turn time; cloud lock held first
            "acid.Bl4ck 1.0",                // +1.1
        };
    }
}
