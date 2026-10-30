# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 87.4 | 51 / 210 | 2.14 | 16.4% | 24350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 136 |
| hadur117.mini.DeiseCONS 0.4 | 2.0 | 16.4% | 51 |
| sgp.JollyNinja 3.53 | 3.2 | 11.9% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.9% | 1 |
| mz.MicroGodMelee 1 | 4.7 | 10.6% | 4 |
| lorneswork.Predator 1.0 | 6.0 | 8.9% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 89.2 | 10 / 35 | 4321 |
| 2 | 2 | 66.2 | 89.8 | 8 / 35 | 4016 |
| 3 | 2 | 65.8 | 85.4 | 10 / 35 | 4162 |
| 4 | 2 | 64.9 | 84.8 | 7 / 35 | 4136 |
| 5 | 2 | 65.0 | 85.7 | 7 / 35 | 3797 |
| 6 | 2 | 66.5 | 89.2 | 9 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 141 | 16% |
| mz.MicroGodMelee 1 | 14 | 86% |
| sgp.JollyNinja 3.53 | 13 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 1402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 81% | 157 |
| sgp.JollyNinja 3.53 | 16 | 10% | 22 |
| mz.MicroGodMelee 1 | 5 | 3% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 2% | 7 |
| lorneswork.Predator 1.0 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.3 | 117 / 210 | 2.41 | 17.6% | 25221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 17.6% | 117 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 28 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 14.0% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.3% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 9.0% | 4 |
| sch.Simone 0.3d | 6.3 | 8.2% | 11 |
| Noran.BitchingElk 0.054 | 7.0 | 7.8% | 5 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.4% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 6.6% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 20 / 35 | 4424 |
| 2 | 1 | 68.2 | 87.3 | 23 / 35 | 4410 |
| 3 | 1 | 66.4 | 84.8 | 18 / 35 | 4232 |
| 4 | 1 | 64.1 | 79.0 | 17 / 35 | 3771 |
| 5 | 1 | 67.2 | 87.6 | 19 / 35 | 4156 |
| 6 | 1 | 66.3 | 80.6 | 20 / 35 | 4228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 73% |
| pulsar.PulsarMax 0.8.9 | 43 | 70% |
| sch.Simone 0.3d | 16 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| Noran.BitchingElk 0.054 | 7 | 86% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 32% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 24% | 60 |
| sch.Simone 0.3d | 12 | 13% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 15 |
| stelo.PatternRobot 1.0 | 7 | 7% | 11 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 4% | 16 |
| Noran.BitchingElk 0.054 | 2 | 2% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 94.0 | 166 / 210 | 1.54 | 20.1% | 33007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 20.1% | 166 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.0% | 19 |
| radnor.DoctorBob 1.42 | 3.2 | 13.2% | 9 |
| vuen.Cake 2.51 | 3.7 | 12.4% | 15 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 1 |
| adt.Ar1 2.1 | 5.8 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 97.8 | 31 / 35 | 5406 |
| 2 | 1 | 70.1 | 92.1 | 26 / 35 | 5844 |
| 3 | 1 | 71.8 | 97.1 | 32 / 35 | 6017 |
| 4 | 1 | 70.1 | 94.0 | 29 / 35 | 5305 |
| 5 | 1 | 67.7 | 88.3 | 20 / 35 | 5039 |
| 6 | 1 | 70.4 | 94.9 | 28 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 96% |
| vuen.Cake 2.51 | 66 | 86% |
| radnor.DoctorBob 1.42 | 34 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 45% | 77 |
| vuen.Cake 2.51 | 14 | 30% | 71 |
| radnor.DoctorBob 1.42 | 7 | 15% | 40 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 4% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| adt.Ar1 2.1 | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| urdos.URDOS 1.3 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.6 | 46 / 210 | 2.11 | 17.2% | 29923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 163 |
| hadur117.mini.DeiseCONS 0.4 | 2.0 | 17.2% | 46 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 10.2% | 1 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.1% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 88.9 | 6 / 35 | 4511 |
| 2 | 2 | 66.8 | 86.3 | 6 / 35 | 4541 |
| 3 | 2 | 67.2 | 85.7 | 5 / 35 | 5010 |
| 4 | 2 | 70.0 | 92.7 | 14 / 35 | 5658 |
| 5 | 2 | 66.8 | 84.4 | 7 / 35 | 4942 |
| 6 | 2 | 68.1 | 87.6 | 8 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 169 | 21% |
| apc.LeeroyJenkins2 1.0 | 5 | 100% |
| TNT.TNT 0.99.1 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 88% | 182 |
| apc.LeeroyJenkins2 1.0 | 6 | 4% | 12 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 2 | 1% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 76.8 | 32 / 210 | 3.09 | 13.7% | 16897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.8% | 114 |
| justin.DemonicRage 3.4 | 1.7 | 17.3% | 50 |
| hadur117.mini.DeiseCONS 0.4 | 3.0 | 13.7% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 11 |
| ms.Ares 0.19 | 5.3 | 9.6% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.7% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 74.6 | 6 / 35 | 2694 |
| 2 | 3 | 62.1 | 79.4 | 5 / 35 | 2686 |
| 3 | 3 | 63.0 | 78.7 | 9 / 35 | 2956 |
| 4 | 3 | 61.5 | 76.2 | 4 / 35 | 2841 |
| 5 | 3 | 61.0 | 76.2 | 4 / 35 | 2752 |
| 6 | 3 | 61.3 | 75.6 | 4 / 35 | 2968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 7% |
| justin.DemonicRage 3.4 | 36 | 61% |
| wompi.Numbat 2.1 | 6 | 67% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 80 | 45% | 91 |
| justin.DemonicRage 3.4 | 53 | 30% | 68 |
| wompi.Numbat 2.1 | 21 | 12% | 25 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.8 | 129 / 210 | 2.10 | 18.0% | 24966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.0% | 129 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 18 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 20 |
| mld.Wisdom 1.0 | 5.2 | 10.5% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 1 |
| spinnercat.Omen 1.0 | 7.5 | 6.7% | 0 |
| DBall.NUKE 0.1 | 8.0 | 6.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 3 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.6 | 23 / 35 | 4096 |
| 2 | 1 | 66.6 | 83.8 | 21 / 35 | 4042 |
| 3 | 1 | 67.7 | 88.6 | 21 / 35 | 4216 |
| 4 | 1 | 67.7 | 88.6 | 21 / 35 | 4068 |
| 5 | 1 | 67.4 | 88.3 | 20 / 35 | 4035 |
| 6 | 1 | 68.6 | 89.2 | 23 / 35 | 4509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 96% |
| pe.minimelee.SandboxMiniMelee 1.1 | 39 | 77% |
| origin.SleepSiphon 1.7b | 38 | 79% |
| gg.Wolverine 2.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| mld.Wisdom 1.0 | 6 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 29% | 52 |
| origin.SleepSiphon 1.7b | 21 | 25% | 62 |
| jekl.StoneGhost 0.7 | 19 | 23% | 54 |
| mld.Wisdom 1.0 | 9 | 11% | 19 |
| gg.Wolverine 2.0 | 4 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.6 | 140 / 210 | 1.49 | 19.5% | 29353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.5% | 140 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.5% | 41 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 5 |
| franzor.Lizt 1.3.1 | 5.0 | 10.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 24 / 35 | 4973 |
| 2 | 1 | 71.5 | 97.1 | 26 / 35 | 5141 |
| 3 | 1 | 71.6 | 95.9 | 25 / 35 | 5169 |
| 4 | 1 | 70.7 | 95.2 | 22 / 35 | 4770 |
| 5 | 1 | 69.6 | 91.7 | 21 / 35 | 4450 |
| 6 | 1 | 70.6 | 93.3 | 22 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 98 | 89% |
| rsalesc.melee.Monk 0.3.6c | 48 | 23% |
| oog.melee.CapuletDroid 1.1 | 31 | 97% |
| franzor.Lizt 1.3.1 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 45 | 64% | 66 |
| rtk.Tachikoma 1.0 | 17 | 24% | 109 |
| franzor.Lizt 1.3.1 | 6 | 9% | 0 |
| oog.melee.CapuletDroid 1.1 | 1 | 1% | 31 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 91.7 | 144 / 210 | 1.74 | 19.0% | 25697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.0% | 144 |
| shrub.Vapour v159 | 2.3 | 12.7% | 20 |
| tm.Yuugao 1.0 | 2.7 | 12.7% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.2% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 8.8% | 2 |
| m3thos.Eva00 1.1 | 6.0 | 8.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.7% | 5 |
| SHAM.WOW 1.4 | 8.8 | 6.5% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.4 | 27 / 35 | 4144 |
| 2 | 1 | 68.9 | 93.0 | 23 / 35 | 4653 |
| 3 | 1 | 68.2 | 91.7 | 22 / 35 | 4218 |
| 4 | 1 | 68.6 | 91.7 | 26 / 35 | 4485 |
| 5 | 1 | 68.8 | 92.4 | 24 / 35 | 4302 |
| 6 | 1 | 67.5 | 90.2 | 22 / 35 | 3895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 82% |
| shrub.Vapour v159 | 40 | 83% |
| Krabb.sliNk.Garm 0.9u | 29 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 77% |
| m3thos.Eva00 1.1 | 8 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 33% | 71 |
| Krabb.sliNk.Garm 0.9u | 14 | 21% | 37 |
| shrub.Vapour v159 | 13 | 19% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 10% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 9% | 17 |
| SHAM.WOW 1.4 | 2 | 3% | 8 |
| m3thos.Eva00 1.1 | 1 | 1% | 11 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.4 | 94 / 210 | 2.76 | 16.3% | 21852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.4% | 77 |
| hadur117.mini.DeiseCONS 0.4 | 1.5 | 16.3% | 94 |
| kc.micro.Figment 1.0 | 3.0 | 14.4% | 19 |
| mc2.enemy.Original 0.9 | 4.5 | 10.1% | 11 |
| yagami.Tidus 0.11 | 5.2 | 10.0% | 0 |
| pedersen.Grishnakh 1.0 | 5.3 | 10.1% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 2 |
| step.nanoPri 1.0 | 8.0 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 79.7 | 17 / 35 | 3531 |
| 2 | 1 | 65.8 | 81.3 | 18 / 35 | 3796 |
| 3 | 1 | 65.2 | 79.0 | 19 / 35 | 3652 |
| 4 | 1 | 65.5 | 81.6 | 15 / 35 | 3773 |
| 5 | 2 | 64.9 | 80.6 | 12 / 35 | 3669 |
| 6 | 2 | 64.0 | 80.3 | 13 / 35 | 3431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 46 | 52% |
| kc.micro.Figment 1.0 | 40 | 93% |
| mc2.enemy.Original 0.9 | 21 | 86% |
| pedersen.Grishnakh 1.0 | 8 | 75% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 4 | 50% |

Hadur died in 117 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 43 | 37% | 65 |
| kc.micro.Figment 1.0 | 22 | 19% | 63 |
| yagami.Tidus 0.11 | 14 | 12% | 21 |
| mc2.enemy.Original 0.9 | 12 | 10% | 30 |
| pedersen.Grishnakh 1.0 | 11 | 9% | 14 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
| rdm.Dueler 0.4x | 3 | 3% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 95.2 | 175 / 210 | 1.43 | 19.8% | 28439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.8% | 175 |
| DTF.Kludgy 1.2b | 2.0 | 14.5% | 21 |
| ejb.Polaris 1.0.1 | 3.3 | 12.2% | 7 |
| ne.Chimera 1.2 | 3.7 | 11.9% | 2 |
| vStar.RAFzilla 2.15 | 5.2 | 10.7% | 3 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.7% | 2 |
| sam.Samspin 1.0 | 7.5 | 6.2% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.2 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 96.5 | 29 / 35 | 4687 |
| 2 | 1 | 69.9 | 94.9 | 29 / 35 | 4823 |
| 3 | 1 | 69.4 | 94.0 | 27 / 35 | 4522 |
| 4 | 1 | 70.5 | 97.5 | 32 / 35 | 4613 |
| 5 | 1 | 70.1 | 93.7 | 30 / 35 | 4993 |
| 6 | 1 | 69.7 | 94.6 | 28 / 35 | 4801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 82% |
| ejb.Polaris 1.0.1 | 44 | 93% |
| ne.Chimera 1.2 | 29 | 97% |
| vStar.RAFzilla 2.15 | 23 | 100% |
| tvv.micro.Antares 1.1.1 | 19 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 60% | 73 |
| ne.Chimera 1.2 | 6 | 17% | 33 |
| ejb.Polaris 1.0.1 | 3 | 9% | 48 |
| donjezza.Muncho 1.0 | 2 | 6% | 5 |
| vStar.RAFzilla 2.15 | 1 | 3% | 22 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 17 |
| sam.Samspin 1.0 | 1 | 3% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 8 |

## Melee bench: F11

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.8 | 117 / 210 | 2.37 | 17.2% | 22573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 17.2% | 117 |
| rz.Aleph 0.34 | 2.0 | 16.0% | 48 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 17 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 13 |
| rdt199.Warlord 0.73 | 5.3 | 9.4% | 11 |
| br2.MobyDickBot 1.6 | 6.2 | 8.4% | 4 |
| uji.YellohFellah 1.0 | 6.7 | 7.9% | 2 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.8 | 19 / 35 | 3736 |
| 2 | 1 | 65.2 | 81.0 | 20 / 35 | 3738 |
| 3 | 1 | 68.6 | 92.7 | 22 / 35 | 3970 |
| 4 | 1 | 66.0 | 85.1 | 19 / 35 | 3593 |
| 5 | 1 | 65.9 | 84.8 | 19 / 35 | 3675 |
| 6 | 1 | 65.1 | 80.6 | 18 / 35 | 3861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 78% |
| cx.mini.Nimrod 0.55 | 26 | 88% |
| rdt199.Warlord 0.73 | 19 | 95% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| uji.YellohFellah 1.0 | 8 | 88% |
| br2.MobyDickBot 1.6 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 43 | 46% | 89 |
| cx.mini.Nimrod 0.55 | 17 | 18% | 36 |
| rdt199.Warlord 0.73 | 12 | 13% | 28 |
| djc.DynaBot 0.1.1 | 8 | 9% | 25 |
| uji.YellohFellah 1.0 | 4 | 4% | 10 |
| stelo.MirrorNano 1.3 | 4 | 4% | 4 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 7 |
| br2.MobyDickBot 1.6 | 1 | 1% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.2 | 146 / 210 | 2.15 | 18.0% | 21244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.0% | 146 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.6% | 17 |
| nat.PallasHawk 1.0 | 3.2 | 12.6% | 20 |
| darkcanuck.Leon 1.01 | 3.7 | 12.6% | 14 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 8 |
| jrm.Test0 1.0 | 6.0 | 7.9% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.5 | 6.6% | 2 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.0% | 2 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.8 | 22 / 35 | 3431 |
| 2 | 1 | 67.4 | 88.3 | 25 / 35 | 3604 |
| 3 | 1 | 68.0 | 90.5 | 26 / 35 | 3495 |
| 4 | 1 | 66.3 | 81.9 | 24 / 35 | 3504 |
| 5 | 1 | 66.9 | 88.3 | 24 / 35 | 3416 |
| 6 | 1 | 68.1 | 89.5 | 25 / 35 | 3794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 49 | 90% |
| nat.PallasHawk 1.0 | 44 | 86% |
| bts.wiki.RipCurl 0.9b | 42 | 100% |
| brainfade.melee.Genghis 0.36 | 15 | 93% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 16 | 25% | 52 |
| nat.PallasHawk 1.0 | 16 | 25% | 49 |
| darkcanuck.Leon 1.01 | 11 | 17% | 61 |
| cs.sheldor.Talon 1.1 | 7 | 11% | 13 |
| brainfade.melee.Genghis 0.36 | 6 | 9% | 14 |
| jrm.Test0 1.0 | 4 | 6% | 8 |
| jaybot.bots.Oddball 4.0 | 4 | 6% | 8 |
| jp.Perpy 16.0 | 0 | 0% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 87.0 | 101 / 210 | 2.17 | 16.9% | 23466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.3 | 16.9% | 101 |
| mn.Combat 3.25.0 | 2.0 | 16.7% | 76 |
| ags.Glacier 0.2.11 | 2.7 | 16.0% | 21 |
| shinh.Entangled 0.3 | 4.5 | 11.6% | 4 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 7 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 88.6 | 17 / 35 | 3689 |
| 2 | 2 | 66.1 | 85.4 | 13 / 35 | 3739 |
| 3 | 1 | 66.9 | 87.3 | 19 / 35 | 3912 |
| 4 | 1 | 66.8 | 87.6 | 18 / 35 | 3972 |
| 5 | 2 | 66.2 | 83.8 | 15 / 35 | 3869 |
| 6 | 1 | 68.1 | 89.2 | 19 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 64 | 52% |
| ags.Glacier 0.2.11 | 60 | 80% |
| shinh.Entangled 0.3 | 15 | 93% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 48 | 44% | 82 |
| ags.Glacier 0.2.11 | 30 | 28% | 75 |
| gh.micro.Gruweltje 0.7 | 14 | 13% | 20 |
| shinh.Entangled 0.3 | 9 | 8% | 24 |
| stelo.Wang 1.0 | 5 | 5% | 5 |
| ayk.WallHugger 1.0 | 2 | 2% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 94.0 | 166 / 210 | 1.54 | 19.7% | 28574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.7% | 166 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.7% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.8% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.4% | 4 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 26 / 35 | 4438 |
| 2 | 1 | 69.8 | 93.3 | 26 / 35 | 4813 |
| 3 | 1 | 69.6 | 91.4 | 26 / 35 | 4782 |
| 4 | 1 | 70.6 | 95.9 | 29 / 35 | 4900 |
| 5 | 1 | 69.8 | 94.6 | 27 / 35 | 4473 |
| 6 | 1 | 71.6 | 98.7 | 32 / 35 | 5168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 95% |
| catcat20.shape.Theta 0.018 | 52 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 18 | 41% | 94 |
| catcat20.shape.Theta 0.018 | 14 | 32% | 44 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 11% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 5% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 5% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 1 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.2 | 123 / 210 | 2.15 | 18.3% | 27210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.3% | 123 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.4% | 14 |
| emp.Yngwie 1.11 | 2.7 | 12.8% | 43 |
| mld.DustBunny 3.8 | 4.3 | 11.8% | 4 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.9% | 5 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.2% | 19 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 89.5 | 21 / 35 | 4110 |
| 2 | 1 | 69.2 | 91.4 | 23 / 35 | 4821 |
| 3 | 1 | 69.0 | 90.2 | 24 / 35 | 4532 |
| 4 | 1 | 65.5 | 81.6 | 16 / 35 | 4278 |
| 5 | 1 | 67.9 | 86.3 | 19 / 35 | 4652 |
| 6 | 1 | 67.3 | 84.4 | 20 / 35 | 4817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 61% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| kawigi.robot.Girl 1.2 | 23 | 78% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| mld.DustBunny 3.8 | 20 | 100% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 45% | 79 |
| kawigi.robot.Girl 1.2 | 12 | 14% | 20 |
| cb.nano.Insomnia 1.0 | 12 | 14% | 16 |
| mld.DustBunny 3.8 | 9 | 10% | 43 |
| kawigi.micro.Shiz 1.1 | 9 | 10% | 35 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.8 | 103 / 210 | 2.28 | 18.0% | 28914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 18.0% | 103 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 59 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 9.9% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.7% | 7 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.6% | 3 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 80.6 | 10 / 35 | 4311 |
| 2 | 1 | 68.0 | 87.0 | 16 / 35 | 4884 |
| 3 | 1 | 68.1 | 86.7 | 21 / 35 | 4648 |
| 4 | 1 | 67.2 | 82.5 | 14 / 35 | 5138 |
| 5 | 1 | 68.9 | 90.2 | 18 / 35 | 5040 |
| 6 | 1 | 68.9 | 87.6 | 24 / 35 | 4893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 62% |
| techdude.forest.FlamingForest 1.1 | 27 | 48% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| divineomega.DivineBot 1.9.4.5 | 8 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 7 | 71% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 44 | 41% | 97 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 24% | 41 |
| techdude.forest.FlamingForest 1.1 | 18 | 17% | 30 |
| divineomega.DivineBot 1.9.4.5 | 6 | 6% | 13 |
| bvh.fnr.Fenrir 0.36l | 6 | 6% | 12 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 11 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| asd.Cthulhu 1.3 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.9 | 122 / 210 | 2.18 | 18.0% | 25899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.0% | 122 |
| et.Predator 1.8 | 2.0 | 13.7% | 25 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 29 |
| oog.melee.Mercutio 1.0 | 3.8 | 11.9% | 18 |
| nic.Nicator 2.4 | 4.8 | 11.0% | 8 |
| ahf.NanoAndrew .4 | 5.7 | 10.3% | 7 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.4 | 18 / 35 | 4661 |
| 2 | 1 | 65.9 | 84.1 | 19 / 35 | 3933 |
| 3 | 1 | 67.3 | 87.6 | 19 / 35 | 4228 |
| 4 | 1 | 68.8 | 89.8 | 23 / 35 | 4373 |
| 5 | 1 | 66.9 | 83.5 | 21 / 35 | 4135 |
| 6 | 1 | 68.6 | 91.1 | 22 / 35 | 4569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 83% |
| oog.melee.Mercutio 1.0 | 40 | 90% |
| cx.BlestPain 1.41 | 32 | 50% |
| nic.Nicator 2.4 | 12 | 83% |
| ahf.NanoAndrew .4 | 7 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 41% | 57 |
| et.Predator 1.8 | 21 | 24% | 64 |
| oog.melee.Mercutio 1.0 | 9 | 10% | 40 |
| ahf.NanoAndrew .4 | 8 | 9% | 16 |
| nic.Nicator 2.4 | 6 | 7% | 18 |
| maribo.melee.BMV 0.1 | 3 | 3% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 4 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 91.0 | 146 / 210 | 1.81 | 18.8% | 24445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.8% | 146 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.1% | 23 |
| agd.Mooserwirt2 2.7 | 4.0 | 11.2% | 12 |
| uji.DBH 1.1 | 4.2 | 11.0% | 11 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.2% | 5 |
| ratosh.Nobo 0.21 | 5.0 | 10.2% | 1 |
| sigterm.Sigterm 1.0 | 7.0 | 8.3% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 6.9% | 3 |
| stelo.WangRobot 1.0 | 9.5 | 5.3% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 20 / 35 | 4086 |
| 2 | 1 | 68.6 | 92.1 | 27 / 35 | 4009 |
| 3 | 1 | 67.1 | 89.5 | 22 / 35 | 3721 |
| 4 | 1 | 69.4 | 93.0 | 28 / 35 | 4151 |
| 5 | 1 | 68.7 | 93.0 | 25 / 35 | 4208 |
| 6 | 1 | 68.7 | 91.7 | 24 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 88% |
| uji.DBH 1.1 | 31 | 84% |
| agd.Mooserwirt2 2.7 | 23 | 91% |
| sigterm.Sigterm 1.0 | 19 | 79% |
| ratosh.Nobo 0.21 | 15 | 93% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 89% |
| stelo.WangRobot 1.0 | 8 | 88% |

Hadur died in 65 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 18 | 28% | 73 |
| uji.DBH 1.1 | 14 | 22% | 29 |
| agd.Mooserwirt2 2.7 | 10 | 15% | 35 |
| ratosh.Nobo 0.21 | 8 | 12% | 23 |
| spinnercat.Robovirus 2.718 | 6 | 9% | 14 |
| sigterm.Sigterm 1.0 | 5 | 8% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 5% | 10 |
| stelo.WangRobot 1.0 | 1 | 2% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |

## Melee bench: F19

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.8 | 181 / 210 | 1.29 | 20.9% | 30866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 20.9% | 181 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 7 |
| mld.Infinity 2.2 | 2.7 | 13.9% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 1 |
| erdnis.Rover 0.3 | 4.5 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.9% | 0 |
| pac.ABC 2.1 | 7.0 | 7.1% | 0 |
| mbh.Mbh 0.1 | 7.8 | 6.5% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 27 / 35 | 4778 |
| 2 | 1 | 72.4 | 97.5 | 31 / 35 | 5447 |
| 3 | 1 | 72.2 | 98.1 | 30 / 35 | 5284 |
| 4 | 1 | 72.5 | 98.1 | 31 / 35 | 5289 |
| 5 | 1 | 72.3 | 97.8 | 31 / 35 | 5050 |
| 6 | 1 | 71.7 | 96.8 | 31 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 98% |
| mld.Infinity 2.2 | 63 | 87% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| pac.ABC 2.1 | 7 | 100% |
| erdnis.Rover 0.3 | 6 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 1281. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 41% | 118 |
| mld.Infinity 2.2 | 12 | 41% | 23 |
| krillr.mini.JointStrike 2.0.0 | 2 | 7% | 22 |
| erdnis.Rover 0.3 | 1 | 3% | 17 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 3% | 6 |
| pac.ABC 2.1 | 0 | 0% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.8 | 144 / 210 | 1.74 | 19.6% | 29652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.6% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 4 |
| fwb.Nine 1.0.1 | 4.2 | 11.0% | 13 |
| catcat20.Rabbit 0.001 | 4.8 | 9.8% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 21 / 35 | 4803 |
| 2 | 1 | 70.6 | 94.3 | 29 / 35 | 4943 |
| 3 | 1 | 68.6 | 88.9 | 22 / 35 | 4849 |
| 4 | 1 | 70.7 | 95.9 | 25 / 35 | 5001 |
| 5 | 1 | 69.6 | 91.7 | 23 / 35 | 5058 |
| 6 | 1 | 69.4 | 90.2 | 24 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 75% |
| fwb.Nine 1.0.1 | 43 | 81% |
| catcat20.Rabbit 0.001 | 28 | 89% |
| nz.jdc.nano.GridFu 1.0 | 16 | 88% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 1200. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 53% | 84 |
| fwb.Nine 1.0.1 | 11 | 17% | 22 |
| catcat20.Rabbit 0.001 | 10 | 15% | 39 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 34 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 8 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 6 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.4 | 156 / 210 | 1.59 | 19.8% | 28348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.8% | 156 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 37 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 1 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.4% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.1% | 6 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 96.5 | 29 / 35 | 4887 |
| 2 | 1 | 72.0 | 98.1 | 30 / 35 | 5148 |
| 3 | 1 | 69.4 | 90.2 | 25 / 35 | 4809 |
| 4 | 1 | 69.6 | 93.0 | 24 / 35 | 4616 |
| 5 | 1 | 70.8 | 94.9 | 27 / 35 | 4698 |
| 6 | 1 | 67.7 | 87.9 | 21 / 35 | 4190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 111 | 83% |
| dummy.mini.Scimitar 1.01 | 36 | 97% |
| cf.RiO.RiOx 4.2.1 | 17 | 100% |
| eld.Hmm 1.0 | 4 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1221. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 29 | 54% | 100 |
| dummy.mini.Scimitar 1.01 | 15 | 28% | 60 |
| cf.RiO.RiOx 4.2.1 | 7 | 13% | 26 |
| oa.weak.BotherBot 0.1 | 2 | 4% | 8 |
| eld.Hmm 1.0 | 1 | 2% | 13 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.3 | 129 / 210 | 1.79 | 18.7% | 27026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 18.7% | 129 |
| pe.SandboxDT 2.71m | 2.0 | 15.8% | 41 |
| kvk.HebusLeTroll 0.35 | 3.3 | 14.4% | 23 |
| jlm.javaDisturbance 0.59 | 3.5 | 13.8% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 2 |
| yk.JahRoslav 1.1 | 6.8 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.4% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 20 / 35 | 4429 |
| 2 | 1 | 68.0 | 89.2 | 17 / 35 | 4320 |
| 3 | 1 | 70.0 | 93.3 | 26 / 35 | 4685 |
| 4 | 1 | 70.1 | 94.3 | 25 / 35 | 4608 |
| 5 | 2 | 67.8 | 87.6 | 17 / 35 | 4391 |
| 6 | 1 | 69.9 | 92.7 | 24 / 35 | 4593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jlm.javaDisturbance 0.59 | 59 | 92% |
| kvk.HebusLeTroll 0.35 | 46 | 85% |
| pe.SandboxDT 2.71m | 46 | 57% |
| bigpete.Stewie 1.0 | 5 | 100% |
| pbg.NinjaX 1.2 | 3 | 67% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1108. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 31 | 38% | 62 |
| jlm.javaDisturbance 0.59 | 22 | 27% | 73 |
| kvk.HebusLeTroll 0.35 | 20 | 24% | 50 |
| bigpete.Stewie 1.0 | 4 | 5% | 12 |
| pbg.NinjaX 1.2 | 2 | 2% | 6 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.1 | 136 / 210 | 1.80 | 18.8% | 25943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 18.8% | 136 |
| pe.SandboxLump 1.52 | 1.8 | 16.9% | 49 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 8 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.5% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.8% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.2% | 0 |
| sample.Walls 1.0 | 7.5 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 87.0 | 18 / 35 | 3923 |
| 2 | 1 | 71.0 | 93.7 | 24 / 35 | 4834 |
| 3 | 1 | 69.4 | 91.4 | 24 / 35 | 3958 |
| 4 | 1 | 69.3 | 91.1 | 23 / 35 | 4223 |
| 5 | 1 | 70.0 | 90.8 | 24 / 35 | 4442 |
| 6 | 1 | 70.0 | 92.7 | 23 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 72% |
| cre.Karolos 0.32 | 39 | 92% |
| stelo.AreaTargetingBot 1.1 | 17 | 94% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 39 | 53% | 99 |
| cre.Karolos 0.32 | 16 | 22% | 53 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 20 |
| stelo.RamTrackSurfer 1.2 | 8 | 11% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 6 |
| cw.megas.Blade 0.8 | 1 | 1% | 4 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.9 | 87 / 210 | 2.72 | 15.6% | 19308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 15.6% | 87 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.5% | 26 |
| florent.XSeries.X2 0.12 | 3.2 | 12.9% | 29 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.5% | 22 |
| davidalves.Phoenix 0.54 | 4.0 | 12.7% | 38 |
| oog.melee.Corsair 1.0 | 6.3 | 9.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.7% | 6 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.8% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.0% | 0 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 78.1 | 12 / 35 | 3156 |
| 2 | 1 | 64.9 | 85.1 | 16 / 35 | 3150 |
| 3 | 2 | 61.9 | 75.6 | 13 / 35 | 2901 |
| 4 | 1 | 66.0 | 85.1 | 18 / 35 | 3594 |
| 5 | 1 | 64.2 | 81.9 | 13 / 35 | 3341 |
| 6 | 1 | 63.2 | 79.7 | 15 / 35 | 3166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 26 | 62% |
| florent.XSeries.X2 0.12 | 25 | 72% |
| rz.GlowBlowMelee 1.4 | 24 | 67% |
| pedersen.Ugluk 1.1.1 | 20 | 65% |
| stelo.SoJNanoMelee 1.1 | 18 | 94% |
| oog.melee.Corsair 1.0 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 35 | 27% | 52 |
| davidalves.Phoenix 0.54 | 27 | 21% | 48 |
| pedersen.Ugluk 1.1.1 | 21 | 16% | 40 |
| rz.GlowBlowMelee 1.4 | 20 | 16% | 32 |
| stelo.SoJNanoMelee 1.1 | 8 | 6% | 12 |
| oog.melee.Corsair 1.0 | 7 | 5% | 16 |
| evd.X1 0.01 | 4 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
4 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.1 | 150 / 210 | 2.16 | 18.2% | 21660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.2% | 150 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.3% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.5% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 6 |
| ds.Oo 2.2 | 5.7 | 9.1% | 7 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 0 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.8 | 6.2% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.9 | 24 / 35 | 3501 |
| 2 | 1 | 66.8 | 86.0 | 24 / 35 | 3451 |
| 3 | 1 | 66.6 | 83.8 | 22 / 35 | 3499 |
| 4 | 1 | 67.9 | 87.0 | 26 / 35 | 3774 |
| 5 | 1 | 66.6 | 82.9 | 23 / 35 | 3875 |
| 6 | 1 | 69.8 | 94.3 | 31 / 35 | 3560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 90% |
| voidious.micro.BlitzBat 1.05 | 49 | 98% |
| jdw.Hurricane 1.4 | 31 | 100% |
| ds.Oo 2.2 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 28% | 60 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 23% | 57 |
| jdw.Hurricane 1.4 | 13 | 21% | 39 |
| ds.Oo 2.2 | 4 | 7% | 12 |
| adt.Ar2 1.1 | 4 | 7% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 5% | 16 |
| gre.svman4.Morfeas 1.4.1 | 3 | 5% | 7 |
| awesomeness.Elite 1.0 | 2 | 3% | 8 |
| amk.ChumbaMini 0.2 | 1 | 2% | 1 |

## Melee bench: F26

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.5 | 128 / 210 | 1.94 | 18.3% | 27517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.3% | 128 |
| ak.Fermat 2.0 | 2.0 | 15.9% | 43 |
| lrem.Spectre 0.4.4 | 3.0 | 12.6% | 13 |
| shu.nitro.LENIN .T34 | 4.2 | 11.7% | 19 |
| js.PinBall 1.6 | 4.8 | 10.7% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 94.3 | 26 / 35 | 4550 |
| 2 | 1 | 69.5 | 93.3 | 27 / 35 | 4695 |
| 3 | 1 | 69.6 | 91.1 | 24 / 35 | 5135 |
| 4 | 1 | 67.0 | 85.4 | 18 / 35 | 4530 |
| 5 | 1 | 68.6 | 90.5 | 20 / 35 | 4607 |
| 6 | 1 | 65.3 | 82.5 | 13 / 35 | 4000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 66 | 74% |
| shu.nitro.LENIN .T34 | 36 | 86% |
| lrem.Spectre 0.4.4 | 35 | 86% |
| js.PinBall 1.6 | 11 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 47% | 86 |
| shu.nitro.LENIN .T34 | 14 | 17% | 50 |
| lrem.Spectre 0.4.4 | 13 | 16% | 36 |
| js.PinBall 1.6 | 9 | 11% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 4 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |

## Melee bench: F27

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.7 | 131 / 210 | 2.29 | 17.7% | 23871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 17.7% | 131 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 30 |
| wee.Gem 1.8.4 | 3.5 | 12.1% | 27 |
| EH.Eagle 1.0.6 | 4.2 | 11.2% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.4% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.4% | 3 |
| joe.ADinosaur 1.0 | 7.5 | 7.3% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.6% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 86.7 | 22 / 35 | 3683 |
| 2 | 1 | 66.9 | 86.3 | 22 / 35 | 4099 |
| 3 | 1 | 68.1 | 87.9 | 25 / 35 | 4164 |
| 4 | 1 | 66.6 | 86.3 | 21 / 35 | 3883 |
| 5 | 1 | 66.2 | 80.0 | 20 / 35 | 4161 |
| 6 | 1 | 66.8 | 86.7 | 21 / 35 | 3881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 60 | 87% |
| wee.Gem 1.8.4 | 33 | 79% |
| EH.Eagle 1.0.6 | 21 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 94% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 29 | 37% | 80 |
| wee.Gem 1.8.4 | 17 | 22% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 10% | 26 |
| joe.ADinosaur 1.0 | 7 | 9% | 10 |
| EH.Eagle 1.0.6 | 6 | 8% | 22 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 7 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F28

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 92.7 | 158 / 210 | 1.66 | 19.2% | 24052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.2% | 158 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 25 |
| uji.Antique 1.0 | 3.5 | 11.6% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.5% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 5 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 95.6 | 30 / 35 | 4161 |
| 2 | 1 | 69.8 | 94.9 | 29 / 35 | 4136 |
| 3 | 1 | 67.7 | 90.2 | 24 / 35 | 3734 |
| 4 | 1 | 68.7 | 91.4 | 26 / 35 | 3915 |
| 5 | 1 | 69.4 | 93.3 | 25 / 35 | 4406 |
| 6 | 1 | 67.7 | 90.8 | 24 / 35 | 3700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 84 | 85% |
| uji.Antique 1.0 | 46 | 91% |
| qohnil.blot.BlotBot 3.61 | 18 | 89% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 46% | 93 |
| uji.Antique 1.0 | 8 | 15% | 43 |
| pfvicm.Sobieski 7.2.3b | 8 | 15% | 14 |
| qohnil.blot.BlotBot 3.61 | 4 | 8% | 27 |
| amk.ChumbaWumba 0.3 | 3 | 6% | 9 |
| stelo.PianistNano 1.2 | 2 | 4% | 4 |
| stelo.Lifestealer 1.0 | 2 | 4% | 4 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 13 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.0 | 129 / 210 | 2.17 | 18.5% | 25892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.5% | 129 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.8% | 43 |
| deewiant.Anomaly 0.2 | 2.5 | 14.5% | 16 |
| myl.micro.Troodon 1.10 | 4.2 | 12.0% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 2 |
| DBall.Anarchy 0.1 | 7.0 | 7.2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.4% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.0% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.3 | 25 / 35 | 4515 |
| 2 | 1 | 66.2 | 80.0 | 18 / 35 | 4162 |
| 3 | 1 | 67.1 | 82.5 | 21 / 35 | 4189 |
| 4 | 1 | 69.7 | 90.5 | 22 / 35 | 4622 |
| 5 | 1 | 69.1 | 88.9 | 23 / 35 | 4280 |
| 6 | 1 | 68.0 | 86.0 | 20 / 35 | 4124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 95% |
| zyx.mega.YersiniaPestis 3.1 | 52 | 71% |
| myl.micro.Troodon 1.10 | 23 | 91% |
| jok.PheonixM 0.1.2 | 13 | 85% |
| DBall.Anarchy 0.1 | 5 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 25 | 29% | 60 |
| deewiant.Anomaly 0.2 | 23 | 27% | 78 |
| jok.PheonixM 0.1.2 | 14 | 16% | 26 |
| myl.micro.Troodon 1.10 | 13 | 15% | 30 |
| ph.melee.ArcherME 0.3 | 4 | 5% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 4% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.6 | 55 / 210 | 3.29 | 14.1% | 18600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.5 | 13.8% | 43 |
| hadur117.mini.DeiseCONS 0.4 | 2.7 | 14.1% | 55 |
| oog.melee.Capulet 1.2 | 2.8 | 13.2% | 35 |
| darkcanuck.B26354 1.06 | 3.0 | 14.2% | 49 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.6% | 19 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.2% | 8 |
| tripphippy.Alice 1.1 | 7.0 | 7.5% | 2 |
| ntc.Opposite 1.5 | 8.2 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 71.1 | 6 / 35 | 3077 |
| 2 | 1 | 62.7 | 77.8 | 12 / 35 | 3047 |
| 3 | 1 | 64.5 | 83.2 | 14 / 35 | 3406 |
| 4 | 2 | 61.3 | 75.9 | 9 / 35 | 3006 |
| 5 | 4 | 59.7 | 70.2 | 7 / 35 | 2952 |
| 6 | 4 | 60.4 | 69.5 | 7 / 35 | 3112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 28 | 64% |
| catcat20.Matcha 0.006 | 25 | 48% |
| oog.melee.Capulet 1.2 | 15 | 67% |
| stelo.PastFuture 2.3.2 | 11 | 64% |
| tripphippy.Alice 1.1 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 50% |

Hadur died in 156 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 38 | 24% | 49 |
| stelo.PastFuture 2.3.2 | 36 | 23% | 48 |
| darkcanuck.B26354 1.06 | 35 | 22% | 52 |
| oog.melee.Capulet 1.2 | 23 | 15% | 33 |
| tripphippy.Alice 1.1 | 7 | 4% | 10 |
| ntc.Opposite 1.5 | 6 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 79.1 | 73 / 210 | 2.88 | 15.1% | 18010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 91 |
| hadur117.mini.DeiseCONS 0.4 | 2.0 | 15.1% | 73 |
| gh.mini.Griezel 0.2 | 3.5 | 12.7% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.9% | 4 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 2 |
| fm.mammillarias 1.3 | 8.3 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 87.3 | 15 / 35 | 3460 |
| 2 | 2 | 59.7 | 70.5 | 9 / 35 | 2633 |
| 3 | 2 | 63.6 | 80.3 | 13 / 35 | 3018 |
| 4 | 2 | 63.3 | 79.0 | 13 / 35 | 3003 |
| 5 | 2 | 62.5 | 76.2 | 12 / 35 | 2908 |
| 6 | 2 | 64.1 | 81.3 | 11 / 35 | 2988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 56% |
| gh.mini.Griezel 0.2 | 33 | 52% |
| d414.nano.Quantum 1.0.0 | 13 | 100% |
| spinnercat.micro.Tyger 0.1 | 10 | 90% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 50 | 36% | 85 |
| gh.mini.Griezel 0.2 | 35 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 23 | 17% | 29 |
| d414.nano.Quantum 1.0.0 | 12 | 9% | 22 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 5 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 4% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 90.9 | 138 / 210 | 1.82 | 18.7% | 26214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.7% | 138 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 41 |
| apc.botM 3.0 | 3.2 | 11.5% | 10 |
| lxx.ConceptA 0.8 | 4.5 | 10.5% | 3 |
| bayen.UbaMicro 1.4 | 5.0 | 9.7% | 5 |
| vjik.UnViolation 1.1 | 5.5 | 9.4% | 6 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 0 |
| yk.JahMicro 1.0 | 7.8 | 6.7% | 3 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 91.7 | 26 / 35 | 4182 |
| 2 | 1 | 68.3 | 91.4 | 22 / 35 | 4470 |
| 3 | 1 | 67.9 | 90.5 | 19 / 35 | 4640 |
| 4 | 1 | 68.2 | 91.7 | 26 / 35 | 4126 |
| 5 | 1 | 67.6 | 89.2 | 22 / 35 | 4352 |
| 6 | 1 | 68.1 | 90.8 | 23 / 35 | 4444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 70% |
| apc.botM 3.0 | 27 | 93% |
| lxx.ConceptA 0.8 | 16 | 88% |
| vjik.UnViolation 1.1 | 13 | 100% |
| donjezza.Jezza 1.0 | 12 | 92% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| yk.JahMicro 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 43% | 92 |
| apc.botM 3.0 | 14 | 19% | 42 |
| lxx.ConceptA 0.8 | 12 | 17% | 20 |
| vjik.UnViolation 1.1 | 5 | 7% | 24 |
| bayen.UbaMicro 1.4 | 4 | 6% | 16 |
| donjezza.Jezza 1.0 | 2 | 3% | 7 |
| panzer.Panzer 0.2 | 2 | 3% | 2 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 144 / 210 | 1.94 | 19.1% | 27411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.1% | 144 |
| maribo.Quester 0.3 | 2.0 | 15.2% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 7 |
| labg.Cataclysm 2.05 | 4.5 | 11.1% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.3% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.3% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.5% | 0 |
| sanja.First 0.1 | 9.2 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 26 / 35 | 4907 |
| 2 | 1 | 69.1 | 88.6 | 23 / 35 | 4661 |
| 3 | 1 | 68.6 | 87.0 | 23 / 35 | 4610 |
| 4 | 1 | 68.1 | 86.7 | 22 / 35 | 4408 |
| 5 | 1 | 68.8 | 89.2 | 25 / 35 | 4242 |
| 6 | 1 | 70.5 | 93.3 | 25 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 91% |
| maribo.Quester 0.3 | 43 | 84% |
| gre.svman4.Leonidas 1.3.2 | 33 | 97% |
| labg.Cataclysm 2.05 | 15 | 87% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 35 | 51% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 19% | 71 |
| gre.svman4.Leonidas 1.3.2 | 6 | 9% | 24 |
| labg.Cataclysm 2.05 | 5 | 7% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 7% | 7 |
| baal.nano.N 1.42 | 3 | 4% | 4 |
| zyx.micro.Ant 1.1 | 1 | 1% | 5 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.4 | 97 / 210 | 2.22 | 17.3% | 25352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.7 | 17.3% | 97 |
| stelo.Spread 0.9 | 2.0 | 16.8% | 65 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 35 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 8 |
| tcf.Reach 3 | 5.0 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 83.8 | 9 / 35 | 3924 |
| 2 | 1 | 70.1 | 92.7 | 26 / 35 | 4511 |
| 3 | 1 | 67.7 | 87.9 | 17 / 35 | 4238 |
| 4 | 1 | 68.2 | 87.9 | 18 / 35 | 4292 |
| 5 | 3 | 66.2 | 81.0 | 12 / 35 | 4295 |
| 6 | 1 | 67.1 | 85.1 | 15 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 76 | 53% |
| kid.Gladiator .7.2 | 42 | 67% |
| jcs.Seth 1.8 | 17 | 82% |
| tcf.Reach 3 | 6 | 100% |
| cli.Dancer 1.1 | 6 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 50% | 97 |
| kid.Gladiator .7.2 | 43 | 38% | 64 |
| jcs.Seth 1.8 | 7 | 6% | 24 |
| tcf.Reach 3 | 4 | 4% | 12 |
| cli.Dancer 1.1 | 1 | 1% | 10 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 81.0 | 42 / 210 | 2.71 | 15.0% | 19127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 142 |
| hadur117.mini.DeiseCONS 0.4 | 2.0 | 15.0% | 42 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.5% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.3% | 9 |
| rz.HawkOnFire 0.1 | 4.5 | 12.1% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 82.2 | 6 / 35 | 3200 |
| 2 | 2 | 63.4 | 80.6 | 6 / 35 | 3162 |
| 3 | 2 | 63.3 | 81.9 | 3 / 35 | 3159 |
| 4 | 2 | 64.5 | 82.5 | 12 / 35 | 3257 |
| 5 | 2 | 64.1 | 81.6 | 8 / 35 | 3197 |
| 6 | 2 | 62.2 | 76.8 | 7 / 35 | 3152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 87 | 16% |
| gh.mini.Gruwel 0.9 | 14 | 64% |
| rz.HawkOnFire 0.1 | 13 | 92% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 86% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 62% | 118 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 36 |
| rz.HawkOnFire 0.1 | 18 | 11% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 5% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.8 | 175 / 210 | 1.56 | 20.3% | 28094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 20.3% | 175 |
| bzdp.Pansy 2.1 | 2.8 | 11.5% | 10 |
| alpha.RainingFire 1.0 | 3.0 | 11.9% | 7 |
| bvh.micro.Freya 0.3 | 4.0 | 10.8% | 9 |
| mz.Cork 0.1 | 4.3 | 10.8% | 7 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.3% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 6.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 98.4 | 32 / 35 | 4813 |
| 2 | 1 | 70.7 | 95.9 | 29 / 35 | 4671 |
| 3 | 1 | 70.6 | 94.0 | 29 / 35 | 4780 |
| 4 | 1 | 70.0 | 93.0 | 28 / 35 | 4549 |
| 5 | 1 | 69.6 | 89.8 | 28 / 35 | 4743 |
| 6 | 1 | 69.7 | 91.7 | 29 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 96% |
| bvh.micro.Freya 0.3 | 31 | 100% |
| mz.Cork 0.1 | 29 | 97% |
| alpha.RainingFire 1.0 | 29 | 93% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| dl.BetterWalls 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 8 | 23% | 59 |
| alpha.RainingFire 1.0 | 8 | 23% | 36 |
| bvh.micro.Freya 0.3 | 6 | 17% | 27 |
| mz.Cork 0.1 | 4 | 11% | 34 |
| m3thos.Eva02 0.7.1 | 4 | 11% | 23 |
| bvh.mini.Fenrir 0.39 | 4 | 11% | 10 |
| dl.BetterWalls 1.0 | 1 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 94.0 | 180 / 210 | 1.54 | 19.7% | 30098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.7% | 180 |
| germ.TheMind .2 | 2.7 | 10.8% | 6 |
| EBBU.Sim2 1.02 | 3.5 | 9.8% | 2 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.0% | 2 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.2% | 4 |
| agrach.Dalek 1.0 | 6.0 | 8.8% | 7 |
| lmk.ACPFinal 0.1 | 7.2 | 8.2% | 2 |
| mb.Beast 0.1 | 7.5 | 8.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.9% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 95.6 | 31 / 35 | 4946 |
| 2 | 1 | 70.0 | 96.5 | 31 / 35 | 5293 |
| 3 | 1 | 68.2 | 93.0 | 28 / 35 | 4795 |
| 4 | 1 | 67.9 | 89.8 | 28 / 35 | 5009 |
| 5 | 1 | 69.4 | 96.5 | 32 / 35 | 4743 |
| 6 | 1 | 69.2 | 92.7 | 30 / 35 | 5312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 46 | 96% |
| stelo.UntouchableNano 1.3 | 30 | 90% |
| EBBU.Sim2 1.02 | 30 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| mb.Beast 0.1 | 14 | 93% |
| agrach.Dalek 1.0 | 14 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 6 | 20% | 35 |
| germ.TheMind .2 | 5 | 17% | 34 |
| mb.Beast 0.1 | 4 | 13% | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 10% | 31 |
| EBBU.Sim2 1.02 | 3 | 10% | 30 |
| stelo.UntouchableNano 1.3 | 3 | 10% | 29 |
| lmk.ACPFinal 0.1 | 3 | 10% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 7% | 7 |
| skm.Ryubot 1.0 | 1 | 3% | 7 |

## Melee bench: F38

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.0 | 101 / 210 | 2.71 | 16.1% | 21452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.3 | 16.1% | 101 |
| justin.Mallais 14.0 | 1.7 | 15.9% | 60 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 14 |
| cs.Wren 1.0 | 4.8 | 10.9% | 8 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.5% | 5 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.6% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.5% | 5 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 80.3 | 18 / 35 | 3575 |
| 2 | 1 | 65.8 | 84.4 | 18 / 35 | 3607 |
| 3 | 1 | 64.2 | 78.1 | 16 / 35 | 3639 |
| 4 | 2 | 64.5 | 79.0 | 16 / 35 | 3496 |
| 5 | 1 | 66.5 | 85.1 | 19 / 35 | 3729 |
| 6 | 1 | 63.6 | 78.7 | 14 / 35 | 3406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 76% |
| bvh.mini.Freya 0.55 | 19 | 84% |
| bts.mega.Gnarly 1.4 | 19 | 95% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| cs.Wren 1.0 | 12 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 35% | 73 |
| bvh.mini.Freya 0.55 | 21 | 19% | 29 |
| bts.mega.Gnarly 1.4 | 14 | 13% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 29 |
| cs.Wren 1.0 | 13 | 12% | 24 |
| kdf.KoulDestroyer 1.0 | 6 | 5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.1 | 110 / 210 | 2.25 | 17.5% | 25217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 17.5% | 110 |
| bvh.fry.Freya 0.82 | 2.3 | 14.0% | 12 |
| az.Ololobot 0.2.4 | 2.8 | 13.2% | 53 |
| catcat20.Lambda 0.024 | 3.8 | 11.2% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.2% | 11 |
| gimp.GimpBot 0.1 | 6.7 | 8.2% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.3% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.0% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 82.9 | 15 / 35 | 3843 |
| 2 | 1 | 67.8 | 89.2 | 23 / 35 | 4210 |
| 3 | 1 | 65.4 | 84.1 | 15 / 35 | 4117 |
| 4 | 1 | 67.1 | 87.0 | 21 / 35 | 4432 |
| 5 | 1 | 65.6 | 83.8 | 15 / 35 | 4376 |
| 6 | 1 | 67.3 | 89.8 | 21 / 35 | 4239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 63 | 54% |
| catcat20.Lambda 0.024 | 31 | 81% |
| bvh.fry.Freya 0.82 | 28 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 94% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1245. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 38 | 38% | 73 |
| bvh.fry.Freya 0.82 | 25 | 25% | 53 |
| catcat20.Lambda 0.024 | 16 | 16% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 11% | 19 |
| gimp.GimpBot 0.1 | 4 | 4% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 4 |

## Melee bench: F40

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.5 | 128 / 210 | 2.12 | 18.1% | 24377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 18.1% | 128 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.3% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 12.1% | 18 |
| mz.AntiGrav 1.0 | 4.0 | 10.6% | 7 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.2% | 4 |
| stelo.Randomness 1.0 | 5.7 | 9.5% | 11 |
| alpha.BlackIce 1.0 | 6.5 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.2% | 1 |
| sample.Corners 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.3 | 21 / 35 | 4042 |
| 2 | 1 | 66.3 | 84.4 | 20 / 35 | 3730 |
| 3 | 1 | 67.8 | 87.0 | 21 / 35 | 4294 |
| 4 | 1 | 68.6 | 89.5 | 23 / 35 | 4147 |
| 5 | 1 | 67.0 | 85.7 | 18 / 35 | 4011 |
| 6 | 1 | 68.7 | 92.1 | 25 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 73% |
| kano.gamma.KanoGamma 1.8 | 23 | 78% |
| Polkwane.SmashMelee 1.0 | 20 | 100% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 15 | 87% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |

Hadur died in 82 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 37% | 64 |
| kano.gamma.KanoGamma 1.8 | 16 | 20% | 39 |
| stelo.Randomness 1.0 | 10 | 12% | 29 |
| alpha.BlackIce 1.0 | 7 | 9% | 13 |
| mz.AntiGrav 1.0 | 6 | 7% | 24 |
| Polkwane.SmashMelee 1.0 | 5 | 6% | 23 |
| testantiswapgun.AntiSwap 1.0 | 4 | 5% | 9 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 5 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.4 | 119 / 210 | 2.14 | 17.5% | 22127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.3% | 64 |
| hadur117.mini.DeiseCONS 0.4 | 1.5 | 17.5% | 119 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 9 |
| ary.Swarm 1.1 | 3.8 | 12.4% | 8 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.5% | 7 |
| shrub.Silver v048 | 6.3 | 8.4% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.3% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 84.1 | 20 / 35 | 3219 |
| 2 | 2 | 66.8 | 86.3 | 18 / 35 | 3526 |
| 3 | 1 | 68.9 | 92.1 | 23 / 35 | 4037 |
| 4 | 1 | 69.3 | 93.7 | 23 / 35 | 4011 |
| 5 | 2 | 65.8 | 84.4 | 15 / 35 | 3617 |
| 6 | 1 | 66.1 | 83.5 | 20 / 35 | 3717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 61% |
| lessonz.robocode.Oz 0.5.0 | 29 | 93% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| ary.Swarm 1.1 | 19 | 95% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 48% | 90 |
| ary.Swarm 1.1 | 18 | 20% | 39 |
| lessonz.robocode.Oz 0.5.0 | 13 | 14% | 27 |
| simonton.nano.MeleeSeed 1.8 | 8 | 9% | 29 |
| shrub.Silver v048 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 10 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.0 | 125 / 210 | 2.08 | 18.2% | 27162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 18.2% | 125 |
| wompi.Wallaby 5.1 | 1.8 | 15.9% | 48 |
| ara.Shera 0.88 | 3.3 | 13.6% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 12 |
| amz.NanoClone 1.41 | 5.3 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.2 | 7.6% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 4 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.7 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 22 / 35 | 4506 |
| 2 | 1 | 69.1 | 90.2 | 26 / 35 | 4737 |
| 3 | 1 | 67.9 | 87.9 | 20 / 35 | 4381 |
| 4 | 1 | 68.0 | 87.6 | 22 / 35 | 4631 |
| 5 | 1 | 68.8 | 91.1 | 23 / 35 | 4592 |
| 6 | 2 | 65.1 | 81.0 | 12 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 59 | 86% |
| ara.Shera 0.88 | 44 | 82% |
| maribo.mini.MiniQuester 0.1 | 35 | 97% |
| dsw.StaticD 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 37% | 86 |
| ara.Shera 0.88 | 26 | 30% | 62 |
| maribo.mini.MiniQuester 0.1 | 17 | 20% | 46 |
| amz.NanoClone 1.41 | 4 | 5% | 5 |
| dsw.StaticD 1.0 | 2 | 2% | 4 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.8 | 49 / 210 | 3.00 | 14.5% | 18434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 133 |
| hadur117.mini.DeiseCONS 0.4 | 2.0 | 14.5% | 49 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.3% | 6 |
| brainfade.melee.Dusk 0.44 | 3.8 | 11.9% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.0% | 3 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 76.8 | 11 / 35 | 3173 |
| 2 | 2 | 63.4 | 76.5 | 8 / 35 | 3121 |
| 3 | 2 | 63.3 | 77.8 | 6 / 35 | 2929 |
| 4 | 2 | 63.5 | 76.5 | 9 / 35 | 3064 |
| 5 | 2 | 65.4 | 82.9 | 11 / 35 | 3119 |
| 6 | 2 | 62.5 | 76.2 | 4 / 35 | 3028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 87 | 31% |
| brainfade.melee.Dusk 0.44 | 13 | 77% |
| dummy.micro.Sparrow 2.5 | 10 | 90% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 161 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 60% | 124 |
| brainfade.melee.Dusk 0.44 | 21 | 13% | 30 |
| dummy.micro.Sparrow 2.5 | 12 | 7% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 6% | 14 |
| Krabb.akim2.Akim2 1.1b | 9 | 6% | 9 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.3 | 126 / 210 | 1.97 | 18.6% | 26739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.2 | 18.6% | 126 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 44 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.5% | 31 |
| wompi.Quokka 1.6 | 4.0 | 10.5% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.1% | 2 |
| jwirde.Gort 2.0 | 6.5 | 8.4% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.8% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 84.1 | 13 / 35 | 4157 |
| 2 | 1 | 69.4 | 92.4 | 23 / 35 | 4550 |
| 3 | 1 | 69.3 | 90.5 | 23 / 35 | 4477 |
| 4 | 1 | 68.9 | 89.5 | 26 / 35 | 4411 |
| 5 | 1 | 68.6 | 89.5 | 21 / 35 | 4417 |
| 6 | 1 | 68.7 | 89.5 | 20 / 35 | 4727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 78% |
| tzu.TheArtOfWar 1.2 | 59 | 73% |
| wompi.Quokka 1.6 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| disan.Chair 2.2.0 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| jwirde.Gort 2.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 32 | 38% | 76 |
| stelo.Liblix 0.3.1 | 28 | 33% | 90 |
| wompi.Quokka 1.6 | 12 | 14% | 21 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 8% | 9 |
| disan.Chair 2.2.0 | 2 | 2% | 7 |
| jwirde.Gort 2.0 | 2 | 2% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.7 | 89 / 210 | 2.02 | 19.3% | 32670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCONS 0.4 | 1.0 | 19.3% | 89 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 109 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 2 |
| sul.Lunar 1.1 | 4.2 | 10.3% | 3 |
| myl.nano.Graviton 1.10 | 5.7 | 9.4% | 1 |
| fm.claire 1.7 | 6.2 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.9% | 2 |
| hvilela.HVilela 0.9 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 11 / 35 | 5431 |
| 2 | 1 | 69.3 | 90.5 | 14 / 35 | 5659 |
| 3 | 1 | 67.3 | 83.5 | 11 / 35 | 5445 |
| 4 | 1 | 69.9 | 91.1 | 16 / 35 | 5648 |
| 5 | 1 | 69.8 | 91.1 | 18 / 35 | 5455 |
| 6 | 1 | 68.7 | 89.2 | 19 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 123 | 31% |
| jje.BagPuss 1.2 | 15 | 100% |
| sul.Lunar 1.1 | 14 | 100% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| wit.Deep7 2.0 | 7 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 2773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 71% | 0 |
| jje.BagPuss 1.2 | 8 | 7% | 58 |
| myl.nano.Graviton 1.10 | 7 | 6% | 32 |
| sul.Lunar 1.1 | 6 | 5% | 58 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 26 |
| wit.Deep7 2.0 | 4 | 3% | 12 |
| fm.claire 1.7 | 3 | 2% | 13 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
| hvilela.HVilela 0.9 | 1 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseCONS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 85.2 | 78 / 210 | 2.33 | 16.3% | 22172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.5% | 69 |
| kc.mini.Mirage 0.2 | 2.0 | 16.3% | 48 |
| hadur117.mini.DeiseCONS 0.4 | 2.2 | 16.3% | 78 |
| cx.Princess 1.0 | 4.5 | 10.2% | 6 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 5 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 86.0 | 18 / 35 | 3711 |
| 2 | 3 | 65.1 | 84.4 | 9 / 35 | 3776 |
| 3 | 1 | 67.0 | 88.9 | 18 / 35 | 3808 |
| 4 | 1 | 66.3 | 85.4 | 15 / 35 | 4002 |
| 5 | 3 | 64.3 | 83.2 | 9 / 35 | 3475 |
| 6 | 3 | 64.6 | 83.5 | 9 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 58 | 41% |
| kc.mini.Mirage 0.2 | 53 | 68% |
| cx.Princess 1.0 | 14 | 86% |
| mz.MicroSheep 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 56 | 42% | 79 |
| kc.mini.Mirage 0.2 | 44 | 33% | 85 |
| mz.MicroSheep 1.0 | 10 | 8% | 14 |
| cx.Princess 1.0 | 7 | 5% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 7 |
| sadoner.killer 0.2 | 6 | 5% | 7 |
| jeremyreeder.collective.Prophet 5 | 2 | 2% | 2 |

