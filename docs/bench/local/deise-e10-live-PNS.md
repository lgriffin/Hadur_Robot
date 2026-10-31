# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.0 | 65 / 210 | 2.17 | 17.3% | 28930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 137 |
| hadur117.mini.DeisePNS 0.4 | 2.0 | 17.3% | 65 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 2 |
| mz.MicroGodMelee 1 | 4.5 | 10.5% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 88.6 | 9 / 35 | 5146 |
| 2 | 2 | 66.4 | 83.5 | 9 / 35 | 4949 |
| 3 | 2 | 67.8 | 88.3 | 11 / 35 | 4847 |
| 4 | 2 | 65.9 | 83.8 | 11 / 35 | 4342 |
| 5 | 2 | 66.5 | 85.7 | 12 / 35 | 4468 |
| 6 | 2 | 68.9 | 92.1 | 13 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 16% |
| sgp.JollyNinja 3.53 | 15 | 100% |
| mz.MicroGodMelee 1 | 14 | 100% |
| lorneswork.Predator 1.0 | 11 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |

Hadur died in 146 of 210 rounds, at a mean tick of 1264. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 79% | 135 |
| sgp.JollyNinja 3.53 | 9 | 6% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 14 |
| lorneswork.Predator 1.0 | 6 | 4% | 12 |
| mz.MicroGodMelee 1 | 5 | 3% | 23 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.9 | 120 / 210 | 2.18 | 18.6% | 29248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.6% | 120 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 29 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.3% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 9.2% | 4 |
| sch.Simone 0.3d | 6.7 | 7.8% | 11 |
| Noran.BitchingElk 0.054 | 7.0 | 7.5% | 6 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.3 | 6.8% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 21 / 35 | 5254 |
| 2 | 1 | 68.7 | 87.0 | 22 / 35 | 5057 |
| 3 | 1 | 68.9 | 89.5 | 20 / 35 | 4899 |
| 4 | 1 | 68.0 | 87.0 | 19 / 35 | 4956 |
| 5 | 1 | 66.5 | 82.5 | 18 / 35 | 4482 |
| 6 | 1 | 67.5 | 84.4 | 20 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56 | 71% |
| pulsar.PulsarMax 0.8.9 | 49 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| sch.Simone 0.3d | 9 | 67% |
| Noran.BitchingElk 0.054 | 9 | 78% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| fullsail.SweetTea 1.1 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 28% | 64 |
| pulsar.PulsarMax 0.8.9 | 25 | 28% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 17% | 23 |
| sch.Simone 0.3d | 8 | 9% | 17 |
| stelo.PatternRobot 1.0 | 7 | 8% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 7% | 20 |
| Noran.BitchingElk 0.054 | 2 | 2% | 14 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.2 | 144 / 210 | 1.79 | 20.0% | 36802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.0% | 144 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.0% | 16 |
| radnor.DoctorBob 1.42 | 3.2 | 13.3% | 19 |
| vuen.Cake 2.51 | 3.5 | 12.7% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 7.0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 22 / 35 | 5952 |
| 2 | 1 | 70.9 | 94.0 | 26 / 35 | 6132 |
| 3 | 1 | 69.7 | 91.4 | 24 / 35 | 5852 |
| 4 | 1 | 69.3 | 88.9 | 23 / 35 | 5847 |
| 5 | 1 | 71.7 | 94.3 | 28 / 35 | 6728 |
| 6 | 1 | 69.6 | 89.2 | 21 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 92% |
| vuen.Cake 2.51 | 57 | 75% |
| radnor.DoctorBob 1.42 | 36 | 97% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |

Hadur died in 66 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 20 | 30% | 63 |
| kawigi.nano.Lib 1.0 | 19 | 29% | 69 |
| radnor.DoctorBob 1.42 | 15 | 23% | 46 |
| urdos.URDOS 1.3 | 5 | 8% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 2 |

## Melee bench: F04

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.6 | 38 / 210 | 2.21 | 17.3% | 32003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 168 |
| hadur117.mini.DeisePNS 0.4 | 2.0 | 17.3% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 4 |
| TNT.TNT 0.99.1 | 4.5 | 9.9% | 1 |
| josago.Jorgito 0.16 | 4.5 | 9.6% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 87.0 | 7 / 35 | 5141 |
| 2 | 2 | 68.6 | 88.9 | 10 / 35 | 5472 |
| 3 | 2 | 68.0 | 85.4 | 9 / 35 | 5478 |
| 4 | 2 | 67.7 | 87.9 | 2 / 35 | 5238 |
| 5 | 2 | 66.7 | 84.1 | 3 / 35 | 4989 |
| 6 | 2 | 68.0 | 86.0 | 7 / 35 | 5685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 170 | 21% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| TNT.TNT 0.99.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 1499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 147 | 84% | 181 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 15 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.3 | 32 / 210 | 3.49 | 13.7% | 20320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.9% | 117 |
| justin.DemonicRage 3.4 | 1.8 | 16.4% | 45 |
| hadur117.mini.DeisePNS 0.4 | 3.2 | 13.7% | 32 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 11 |
| ms.Ares 0.19 | 5.5 | 9.6% | 0 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 5 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 77.1 | 5 / 35 | 3467 |
| 2 | 3 | 62.1 | 75.2 | 6 / 35 | 3251 |
| 3 | 4 | 59.8 | 67.3 | 3 / 35 | 3339 |
| 4 | 3 | 60.9 | 70.2 | 5 / 35 | 3444 |
| 5 | 3 | 60.5 | 70.5 | 6 / 35 | 2979 |
| 6 | 3 | 62.7 | 73.7 | 7 / 35 | 3840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 41 | 22% |
| justin.DemonicRage 3.4 | 22 | 45% |
| wompi.Numbat 2.1 | 8 | 100% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 37% | 76 |
| justin.DemonicRage 3.4 | 55 | 31% | 66 |
| wompi.Numbat 2.1 | 25 | 14% | 30 |
| ms.Ares 0.19 | 13 | 7% | 15 |
| axeBots.HataMoto 3.09 | 9 | 5% | 13 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.1 | 133 / 210 | 1.98 | 19.0% | 29509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.0% | 133 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 25 |
| origin.SleepSiphon 1.7b | 3.2 | 13.0% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.5% | 15 |
| mld.Wisdom 1.0 | 4.7 | 10.8% | 2 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.9% | 2 |
| DBall.NUKE 0.1 | 7.8 | 6.6% | 2 |
| spinnercat.Omen 1.0 | 8.7 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 23 / 35 | 4877 |
| 2 | 1 | 67.4 | 85.1 | 17 / 35 | 4801 |
| 3 | 1 | 68.4 | 88.3 | 23 / 35 | 4683 |
| 4 | 1 | 68.1 | 87.0 | 19 / 35 | 4662 |
| 5 | 1 | 70.6 | 93.3 | 26 / 35 | 5225 |
| 6 | 1 | 70.2 | 91.7 | 25 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 46 | 76% |
| jekl.StoneGhost 0.7 | 46 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 84% |
| gg.Wolverine 2.0 | 14 | 93% |
| mld.Wisdom 1.0 | 8 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| DBall.NUKE 0.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 30% | 55 |
| origin.SleepSiphon 1.7b | 23 | 28% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 27% | 50 |
| mld.Wisdom 1.0 | 4 | 5% | 18 |
| gg.Wolverine 2.0 | 4 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.1 | 134 / 210 | 1.62 | 20.0% | 34025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.0% | 134 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 39 |
| rtk.Tachikoma 1.0 | 2.7 | 16.4% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.0% | 6 |
| franzor.Lizt 1.3.1 | 4.7 | 10.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 22 / 35 | 5262 |
| 2 | 1 | 71.6 | 94.3 | 24 / 35 | 5875 |
| 3 | 1 | 71.9 | 93.7 | 21 / 35 | 6071 |
| 4 | 1 | 71.7 | 93.3 | 22 / 35 | 5944 |
| 5 | 1 | 71.5 | 93.3 | 23 / 35 | 5496 |
| 6 | 1 | 70.2 | 89.5 | 22 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 95 | 88% |
| rsalesc.melee.Monk 0.3.6c | 41 | 29% |
| oog.melee.CapuletDroid 1.1 | 34 | 91% |
| franzor.Lizt 1.3.1 | 11 | 55% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 40 | 53% | 63 |
| rtk.Tachikoma 1.0 | 26 | 34% | 112 |
| franzor.Lizt 1.3.1 | 5 | 7% | 1 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 27 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.5 | 129 / 210 | 1.94 | 19.1% | 29762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.1% | 129 |
| tm.Yuugao 1.0 | 2.3 | 13.7% | 41 |
| shrub.Vapour v159 | 2.7 | 13.1% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.6% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.6% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.0% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 7.6% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.4% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 15 / 35 | 5130 |
| 2 | 1 | 69.1 | 91.7 | 20 / 35 | 4884 |
| 3 | 1 | 69.6 | 92.1 | 24 / 35 | 5103 |
| 4 | 1 | 67.5 | 86.0 | 20 / 35 | 4773 |
| 5 | 1 | 70.4 | 94.0 | 28 / 35 | 5097 |
| 6 | 1 | 68.5 | 89.5 | 22 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 66% |
| shrub.Vapour v159 | 36 | 81% |
| Krabb.sliNk.Garm 0.9u | 34 | 79% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 92% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 31% | 66 |
| Krabb.sliNk.Garm 0.9u | 25 | 29% | 42 |
| shrub.Vapour v159 | 20 | 24% | 53 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 5% | 18 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
| m3thos.Eva00 1.1 | 1 | 1% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.3 | 74 / 210 | 2.95 | 16.2% | 24731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.7% | 95 |
| hadur117.mini.DeisePNS 0.4 | 1.7 | 16.2% | 74 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 22 |
| yagami.Tidus 0.11 | 4.0 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.8% | 11 |
| mc2.enemy.Original 0.9 | 6.0 | 8.9% | 5 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 76.2 | 12 / 35 | 3975 |
| 2 | 1 | 66.1 | 81.0 | 13 / 35 | 4396 |
| 3 | 2 | 61.7 | 70.8 | 8 / 35 | 3665 |
| 4 | 1 | 67.9 | 85.7 | 18 / 35 | 4550 |
| 5 | 2 | 65.9 | 80.6 | 14 / 35 | 4030 |
| 6 | 2 | 64.1 | 75.6 | 9 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 42% |
| kc.micro.Figment 1.0 | 35 | 74% |
| mc2.enemy.Original 0.9 | 10 | 80% |
| pedersen.Grishnakh 1.0 | 9 | 44% |
| yagami.Tidus 0.11 | 8 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 55 | 40% | 84 |
| kc.micro.Figment 1.0 | 25 | 18% | 53 |
| pedersen.Grishnakh 1.0 | 16 | 12% | 18 |
| yagami.Tidus 0.11 | 15 | 11% | 23 |
| mc2.enemy.Original 0.9 | 13 | 10% | 19 |
| dft.Calliope 5.6 | 4 | 3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 97.1 | 181 / 210 | 1.26 | 20.9% | 33054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.9% | 181 |
| ne.Chimera 1.2 | 2.3 | 13.4% | 8 |
| DTF.Kludgy 1.2b | 2.8 | 13.3% | 12 |
| ejb.Polaris 1.0.1 | 3.8 | 12.2% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.2% | 0 |
| sam.Samspin 1.0 | 7.8 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 98.1 | 30 / 35 | 5676 |
| 2 | 1 | 72.2 | 98.4 | 32 / 35 | 5751 |
| 3 | 1 | 70.9 | 96.8 | 30 / 35 | 5270 |
| 4 | 1 | 71.2 | 97.8 | 30 / 35 | 5336 |
| 5 | 1 | 72.0 | 97.5 | 31 / 35 | 5932 |
| 6 | 1 | 70.3 | 94.3 | 28 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 86% |
| ejb.Polaris 1.0.1 | 55 | 98% |
| ne.Chimera 1.2 | 38 | 89% |
| vStar.RAFzilla 2.15 | 21 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 100% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 55% | 58 |
| ne.Chimera 1.2 | 8 | 28% | 39 |
| ejb.Polaris 1.0.1 | 2 | 7% | 64 |
| vStar.RAFzilla 2.15 | 1 | 3% | 16 |
| donjezza.Muncho 1.0 | 1 | 3% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 14 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 9 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.0 | 106 / 210 | 2.44 | 17.4% | 25377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 17.4% | 106 |
| rz.Aleph 0.34 | 1.8 | 16.2% | 53 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.1% | 17 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 10 |
| rdt199.Warlord 0.73 | 4.8 | 9.8% | 14 |
| br2.MobyDickBot 1.6 | 6.2 | 8.5% | 5 |
| uji.YellohFellah 1.0 | 7.3 | 7.7% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 78.1 | 16 / 35 | 3942 |
| 2 | 1 | 66.3 | 83.5 | 15 / 35 | 4346 |
| 3 | 1 | 68.1 | 87.0 | 21 / 35 | 4519 |
| 4 | 1 | 66.5 | 84.8 | 18 / 35 | 4086 |
| 5 | 1 | 67.7 | 87.9 | 22 / 35 | 4217 |
| 6 | 1 | 66.1 | 82.9 | 14 / 35 | 4267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 70 | 71% |
| cx.mini.Nimrod 0.55 | 20 | 60% |
| djc.DynaBot 0.1.1 | 19 | 84% |
| uji.YellohFellah 1.0 | 15 | 87% |
| rdt199.Warlord 0.73 | 15 | 73% |
| br2.MobyDickBot 1.6 | 5 | 60% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 48 | 45% | 92 |
| cx.mini.Nimrod 0.55 | 19 | 18% | 29 |
| rdt199.Warlord 0.73 | 14 | 13% | 29 |
| djc.DynaBot 0.1.1 | 8 | 8% | 19 |
| uji.YellohFellah 1.0 | 5 | 5% | 18 |
| br2.MobyDickBot 1.6 | 3 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 7 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.0 | 130 / 210 | 2.35 | 17.8% | 23800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 17.8% | 130 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.3% | 22 |
| nat.PallasHawk 1.0 | 2.8 | 12.9% | 25 |
| darkcanuck.Leon 1.01 | 3.5 | 12.7% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 8 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 0 |
| jp.Perpy 16.0 | 7.3 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 8.3 | 6.6% | 0 |
| stuff.Vlad 0.1 | 8.7 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 25 / 35 | 3957 |
| 2 | 1 | 67.9 | 87.6 | 24 / 35 | 3936 |
| 3 | 1 | 65.7 | 81.0 | 20 / 35 | 3886 |
| 4 | 1 | 67.7 | 89.2 | 21 / 35 | 4121 |
| 5 | 1 | 65.4 | 81.3 | 18 / 35 | 3688 |
| 6 | 1 | 66.8 | 82.9 | 22 / 35 | 4212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 83% |
| darkcanuck.Leon 1.01 | 41 | 88% |
| nat.PallasHawk 1.0 | 41 | 78% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jaybot.bots.Oddball 4.0 | 7 | 71% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 18 | 23% | 46 |
| bts.wiki.RipCurl 0.9b | 18 | 23% | 42 |
| darkcanuck.Leon 1.01 | 15 | 19% | 68 |
| brainfade.melee.Genghis 0.36 | 11 | 14% | 17 |
| jrm.Test0 1.0 | 8 | 10% | 16 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| jp.Perpy 16.0 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.7 | 82 / 210 | 2.38 | 16.6% | 25142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.9% | 80 |
| hadur117.mini.DeisePNS 0.4 | 2.0 | 16.6% | 82 |
| ags.Glacier 0.2.11 | 2.3 | 16.1% | 32 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 8 |
| gh.micro.Gruweltje 0.7 | 4.7 | 10.9% | 11 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 87.9 | 17 / 35 | 4286 |
| 2 | 3 | 64.8 | 79.0 | 11 / 35 | 4228 |
| 3 | 3 | 64.7 | 81.9 | 11 / 35 | 3809 |
| 4 | 1 | 68.2 | 91.4 | 17 / 35 | 4395 |
| 5 | 1 | 67.0 | 84.8 | 15 / 35 | 4600 |
| 6 | 2 | 64.7 | 83.2 | 11 / 35 | 3824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 72 | 46% |
| ags.Glacier 0.2.11 | 51 | 71% |
| shinh.Entangled 0.3 | 13 | 77% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 63 | 48% | 92 |
| ags.Glacier 0.2.11 | 32 | 24% | 68 |
| shinh.Entangled 0.3 | 13 | 10% | 25 |
| gh.micro.Gruweltje 0.7 | 13 | 10% | 16 |
| stelo.Wang 1.0 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 2% | 4 |
| maribo.FollowFire 1 | 2 | 2% | 2 |
3 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.6 | 168 / 210 | 1.49 | 20.4% | 32382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.4% | 168 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 17 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.3% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.8% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.0% | 6 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 28 / 35 | 5461 |
| 2 | 1 | 70.9 | 94.0 | 28 / 35 | 5405 |
| 3 | 1 | 70.2 | 93.7 | 27 / 35 | 5072 |
| 4 | 1 | 70.3 | 94.6 | 26 / 35 | 5283 |
| 5 | 1 | 70.5 | 93.3 | 28 / 35 | 5452 |
| 6 | 1 | 72.1 | 97.5 | 31 / 35 | 5709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 95% |
| catcat20.shape.Theta 0.018 | 54 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 88% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 15 | 34% | 52 |
| simonton.micro.Sprout 1.1.3 | 12 | 27% | 87 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 11% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 7% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 5% | 16 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.7 | 111 / 210 | 2.47 | 18.1% | 30118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.1% | 111 |
| emp.Yngwie 1.11 | 2.5 | 13.5% | 53 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 15 |
| mld.DustBunny 3.8 | 4.3 | 11.5% | 6 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.3% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.0% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 8.2 | 5.6% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.7 | 18 / 35 | 5071 |
| 2 | 1 | 68.3 | 86.3 | 17 / 35 | 5132 |
| 3 | 1 | 67.4 | 81.9 | 19 / 35 | 4982 |
| 4 | 1 | 67.8 | 85.4 | 18 / 35 | 4928 |
| 5 | 1 | 68.3 | 86.3 | 19 / 35 | 5183 |
| 6 | 1 | 67.3 | 82.2 | 20 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 66% |
| kawigi.micro.Shiz 1.1 | 29 | 100% |
| kawigi.robot.Girl 1.2 | 26 | 85% |
| mld.DustBunny 3.8 | 16 | 94% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| divineomega.TrialBot 0.003 | 6 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 40% | 86 |
| cb.nano.Insomnia 1.0 | 18 | 18% | 18 |
| mld.DustBunny 3.8 | 13 | 13% | 33 |
| kawigi.micro.Shiz 1.1 | 11 | 11% | 36 |
| kawigi.robot.Girl 1.2 | 9 | 9% | 20 |
| divineomega.TrialBot 0.003 | 3 | 3% | 11 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |

## Melee bench: F16

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.9 | 119 / 210 | 2.00 | 19.6% | 34244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.6% | 119 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 2 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.7% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.2 | 15 / 35 | 5337 |
| 2 | 1 | 70.7 | 90.5 | 22 / 35 | 6118 |
| 3 | 1 | 71.4 | 93.0 | 21 / 35 | 6083 |
| 4 | 1 | 69.0 | 87.0 | 17 / 35 | 5451 |
| 5 | 1 | 70.4 | 92.1 | 23 / 35 | 5649 |
| 6 | 1 | 69.5 | 88.6 | 21 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 63% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 96% |
| techdude.forest.FlamingForest 1.1 | 22 | 64% |
| bvh.fnr.Fenrir 0.36l | 11 | 82% |
| divineomega.DivineBot 1.9.4.5 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 44 | 48% | 103 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 18% | 36 |
| techdude.forest.FlamingForest 1.1 | 11 | 12% | 29 |
| bvh.fnr.Fenrir 0.36l | 10 | 11% | 17 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 13 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.1 | 112 / 210 | 2.43 | 18.0% | 29245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.0% | 112 |
| cx.BlestPain 1.41 | 2.8 | 12.6% | 38 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.3% | 26 |
| et.Predator 1.8 | 3.3 | 13.0% | 16 |
| nic.Nicator 2.4 | 5.2 | 11.1% | 9 |
| ahf.NanoAndrew .4 | 5.5 | 10.7% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 3 |
| tex.Longbot 0.4 | 8.2 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 4.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 75.6 | 12 / 35 | 4471 |
| 2 | 1 | 66.8 | 80.3 | 19 / 35 | 4852 |
| 3 | 1 | 68.8 | 87.6 | 21 / 35 | 5012 |
| 4 | 1 | 68.0 | 86.7 | 20 / 35 | 4788 |
| 5 | 1 | 67.4 | 82.9 | 16 / 35 | 5055 |
| 6 | 1 | 70.3 | 91.7 | 24 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 55 | 91% |
| cx.BlestPain 1.41 | 29 | 45% |
| oog.melee.Mercutio 1.0 | 29 | 59% |
| nic.Nicator 2.4 | 23 | 78% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 30% | 50 |
| et.Predator 1.8 | 23 | 23% | 58 |
| oog.melee.Mercutio 1.0 | 19 | 19% | 40 |
| nic.Nicator 2.4 | 12 | 12% | 31 |
| ahf.NanoAndrew .4 | 9 | 9% | 20 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |
| maribo.melee.BMV 0.1 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.9 | 125 / 210 | 2.18 | 18.2% | 26136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.2% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 12.9% | 25 |
| uji.DBH 1.1 | 3.5 | 11.5% | 17 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.4% | 23 |
| ratosh.Nobo 0.21 | 5.2 | 10.1% | 4 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.4% | 3 |
| sigterm.Sigterm 1.0 | 6.8 | 8.2% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.6% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.9% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.5 | 25 / 35 | 4600 |
| 2 | 1 | 65.9 | 81.3 | 18 / 35 | 4350 |
| 3 | 1 | 66.6 | 84.8 | 20 / 35 | 4145 |
| 4 | 1 | 68.9 | 90.5 | 24 / 35 | 4556 |
| 5 | 1 | 66.0 | 85.7 | 17 / 35 | 4003 |
| 6 | 1 | 67.9 | 88.9 | 21 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 82% |
| agd.Mooserwirt2 2.7 | 29 | 66% |
| uji.DBH 1.1 | 25 | 80% |
| sigterm.Sigterm 1.0 | 18 | 89% |
| spinnercat.Robovirus 2.718 | 17 | 82% |
| ratosh.Nobo 0.21 | 9 | 89% |
| stelo.WangRobot 1.0 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 26 | 31% | 54 |
| morbid.MorbidPriest 1.0 | 18 | 21% | 59 |
| uji.DBH 1.1 | 12 | 14% | 29 |
| ratosh.Nobo 0.21 | 11 | 13% | 23 |
| sigterm.Sigterm 1.0 | 7 | 8% | 17 |
| stelo.WangRobot 1.0 | 5 | 6% | 8 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |

## Melee bench: F19

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 96.5 | 183 / 210 | 1.31 | 21.7% | 35519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 21.7% | 183 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 13 |
| mld.Infinity 2.2 | 3.0 | 13.4% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 10.8% | 2 |
| erdnis.Rover 0.3 | 4.8 | 9.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.6% | 0 |
| pac.ABC 2.1 | 7.5 | 7.1% | 0 |
| pbg.R2D2 1.0 | 9.0 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.3 | 30 / 35 | 5996 |
| 2 | 1 | 73.1 | 97.5 | 31 / 35 | 6154 |
| 3 | 1 | 73.0 | 97.8 | 32 / 35 | 5934 |
| 4 | 1 | 71.6 | 96.2 | 28 / 35 | 5354 |
| 5 | 1 | 72.3 | 94.3 | 29 / 35 | 6134 |
| 6 | 1 | 73.3 | 99.0 | 33 / 35 | 5947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 97% |
| mld.Infinity 2.2 | 66 | 91% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| erdnis.Rover 0.3 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 1225. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 43% | 110 |
| mld.Infinity 2.2 | 9 | 32% | 37 |
| krillr.mini.JointStrike 2.0.0 | 2 | 7% | 24 |
| erdnis.Rover 0.3 | 2 | 7% | 12 |
| mbh.Mbh 0.1 | 1 | 4% | 7 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.4 | 148 / 210 | 1.60 | 20.3% | 32528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.3% | 148 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.3% | 3 |
| fwb.Nine 1.0.1 | 3.7 | 10.9% | 15 |
| catcat20.Rabbit 0.001 | 4.7 | 10.2% | 9 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.4% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 6.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.3 | 24 / 35 | 5343 |
| 2 | 1 | 70.1 | 90.2 | 23 / 35 | 5684 |
| 3 | 1 | 70.3 | 92.7 | 25 / 35 | 5342 |
| 4 | 1 | 69.7 | 89.5 | 23 / 35 | 5305 |
| 5 | 1 | 70.7 | 95.9 | 25 / 35 | 5235 |
| 6 | 1 | 71.9 | 97.8 | 28 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 78% |
| fwb.Nine 1.0.1 | 47 | 77% |
| catcat20.Rabbit 0.001 | 29 | 90% |
| nz.jdc.nano.GridFu 1.0 | 9 | 89% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 30 | 48% | 80 |
| fwb.Nine 1.0.1 | 15 | 24% | 17 |
| nz.jdc.nano.GridFu 1.0 | 8 | 13% | 32 |
| catcat20.Rabbit 0.001 | 7 | 11% | 42 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 7 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 133 / 210 | 1.68 | 20.2% | 33524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.2% | 133 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 54 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 3 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.5% | 2 |
| eld.Hmm 1.0 | 5.7 | 8.2% | 8 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.3 | 23 / 35 | 5339 |
| 2 | 1 | 70.8 | 91.1 | 22 / 35 | 5861 |
| 3 | 1 | 69.6 | 90.5 | 17 / 35 | 5344 |
| 4 | 1 | 69.6 | 90.5 | 21 / 35 | 5218 |
| 5 | 1 | 72.3 | 95.2 | 27 / 35 | 6159 |
| 6 | 1 | 70.9 | 93.0 | 23 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 65% |
| dummy.mini.Scimitar 1.01 | 32 | 84% |
| cf.RiO.RiOx 4.2.1 | 21 | 95% |
| eld.Hmm 1.0 | 11 | 73% |
| oa.weak.BotherBot 0.1 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 62% | 105 |
| dummy.mini.Scimitar 1.01 | 14 | 18% | 52 |
| eld.Hmm 1.0 | 7 | 9% | 20 |
| cf.RiO.RiOx 4.2.1 | 5 | 6% | 21 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 115 / 210 | 2.05 | 18.7% | 30207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.7% | 115 |
| pe.SandboxDT 2.71m | 2.2 | 15.9% | 50 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.5% | 21 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.5% | 0 |
| gg.Squaraus 0.6 | 8.2 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 8.3 | 5.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 17 / 35 | 5116 |
| 2 | 1 | 69.4 | 89.5 | 21 / 35 | 4933 |
| 3 | 1 | 70.3 | 91.7 | 23 / 35 | 5188 |
| 4 | 1 | 68.2 | 86.0 | 16 / 35 | 5175 |
| 5 | 1 | 68.5 | 87.0 | 21 / 35 | 4771 |
| 6 | 1 | 69.0 | 90.5 | 17 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 61% |
| kvk.HebusLeTroll 0.35 | 48 | 85% |
| jlm.javaDisturbance 0.59 | 33 | 76% |
| bigpete.Stewie 1.0 | 11 | 91% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 35 | 37% | 73 |
| kvk.HebusLeTroll 0.35 | 27 | 28% | 57 |
| jlm.javaDisturbance 0.59 | 21 | 22% | 44 |
| bigpete.Stewie 1.0 | 8 | 8% | 23 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.5 | 153 / 210 | 1.59 | 20.0% | 29291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.0% | 153 |
| pe.SandboxLump 1.52 | 2.0 | 17.0% | 35 |
| cre.Karolos 0.32 | 3.0 | 14.4% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.0% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.4% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.5 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 28 / 35 | 4939 |
| 2 | 1 | 70.7 | 92.1 | 26 / 35 | 4700 |
| 3 | 1 | 70.7 | 93.3 | 24 / 35 | 4835 |
| 4 | 1 | 70.2 | 90.2 | 19 / 35 | 4831 |
| 5 | 1 | 71.5 | 95.9 | 27 / 35 | 4699 |
| 6 | 1 | 72.2 | 95.6 | 29 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 97 | 82% |
| cre.Karolos 0.32 | 39 | 82% |
| stelo.AreaTargetingBot 1.1 | 26 | 96% |
| sample.Walls 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 35 | 61% | 113 |
| cre.Karolos 0.32 | 15 | 26% | 49 |
| stelo.AreaTargetingBot 1.1 | 5 | 9% | 26 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.1 | 80 / 210 | 2.97 | 15.7% | 22204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 15.7% | 80 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 38 |
| florent.XSeries.X2 0.12 | 3.5 | 13.2% | 35 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 30 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.0% | 20 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 7 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 72.4 | 9 / 35 | 3459 |
| 2 | 1 | 65.6 | 80.6 | 16 / 35 | 4013 |
| 3 | 1 | 63.1 | 74.9 | 14 / 35 | 3684 |
| 4 | 1 | 64.6 | 81.9 | 12 / 35 | 3693 |
| 5 | 1 | 65.4 | 81.3 | 15 / 35 | 3850 |
| 6 | 1 | 63.4 | 77.8 | 14 / 35 | 3505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 74% |
| davidalves.Phoenix 0.54 | 24 | 58% |
| florent.XSeries.X2 0.12 | 19 | 58% |
| pedersen.Ugluk 1.1.1 | 18 | 67% |
| stelo.SoJNanoMelee 1.1 | 16 | 88% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 23% | 53 |
| florent.XSeries.X2 0.12 | 30 | 22% | 46 |
| pedersen.Ugluk 1.1.1 | 24 | 18% | 34 |
| davidalves.Phoenix 0.54 | 24 | 18% | 34 |
| stelo.SoJNanoMelee 1.1 | 9 | 7% | 15 |
| oog.melee.Corsair 1.0 | 7 | 5% | 17 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.8 | 134 / 210 | 2.46 | 18.0% | 24766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.0% | 134 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 17 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.3% | 19 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 22 |
| ds.Oo 2.2 | 5.3 | 9.5% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.1% | 8 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.1% | 3 |
| adt.Ar2 1.1 | 8.2 | 6.6% | 0 |
| awesomeness.Elite 1.0 | 8.2 | 7.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.0 | 20 / 35 | 3964 |
| 2 | 1 | 69.0 | 90.2 | 25 / 35 | 4236 |
| 3 | 1 | 67.7 | 85.1 | 25 / 35 | 4166 |
| 4 | 1 | 68.7 | 86.0 | 26 / 35 | 4251 |
| 5 | 1 | 67.4 | 84.1 | 22 / 35 | 4144 |
| 6 | 1 | 64.8 | 77.5 | 16 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 43 | 91% |
| voidious.micro.BlitzBat 1.05 | 42 | 98% |
| jdw.Hurricane 1.4 | 24 | 92% |
| ds.Oo 2.2 | 11 | 82% |
| gre.svman4.Morfeas 1.4.1 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 26 | 34% | 42 |
| voidious.micro.BlitzBat 1.05 | 15 | 20% | 47 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 17% | 49 |
| ds.Oo 2.2 | 9 | 12% | 19 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 16 |
| adt.Ar2 1.1 | 5 | 7% | 10 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 18 |
| awesomeness.Elite 1.0 | 1 | 1% | 6 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.9 | 140 / 210 | 1.73 | 19.8% | 33877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.8% | 140 |
| ak.Fermat 2.0 | 2.3 | 14.0% | 24 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 18 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 23 |
| js.PinBall 1.6 | 5.2 | 10.5% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 8.8% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 24 / 35 | 5520 |
| 2 | 1 | 69.6 | 91.4 | 21 / 35 | 5356 |
| 3 | 1 | 70.4 | 91.7 | 22 / 35 | 5760 |
| 4 | 1 | 71.0 | 94.0 | 26 / 35 | 5969 |
| 5 | 1 | 69.9 | 89.8 | 23 / 35 | 5553 |
| 6 | 1 | 70.9 | 92.4 | 24 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 50 | 78% |
| ak.Fermat 2.0 | 49 | 80% |
| lrem.Spectre 0.4.4 | 43 | 79% |
| js.PinBall 1.6 | 16 | 94% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 23 | 33% | 69 |
| lrem.Spectre 0.4.4 | 19 | 27% | 49 |
| ak.Fermat 2.0 | 18 | 26% | 56 |
| js.PinBall 1.6 | 4 | 6% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 4% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 4 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 2 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.2 | 147 / 210 | 1.89 | 19.0% | 26874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.0% | 147 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 27 |
| wee.Gem 1.8.4 | 3.8 | 11.3% | 21 |
| EH.Eagle 1.0.6 | 4.3 | 10.6% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.4% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.8% | 1 |
| joe.ADinosaur 1.0 | 7.2 | 7.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.1% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.8 | 23 / 35 | 4280 |
| 2 | 1 | 69.1 | 92.4 | 25 / 35 | 4450 |
| 3 | 1 | 68.2 | 89.2 | 24 / 35 | 4321 |
| 4 | 1 | 68.2 | 87.0 | 23 / 35 | 4850 |
| 5 | 1 | 69.6 | 92.4 | 27 / 35 | 4680 |
| 6 | 1 | 68.5 | 90.2 | 25 / 35 | 4293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 87% |
| wee.Gem 1.8.4 | 39 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 84% |
| EH.Eagle 1.0.6 | 25 | 96% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 16 | 25% | 70 |
| wee.Gem 1.8.4 | 15 | 24% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 17% | 30 |
| EH.Eagle 1.0.6 | 7 | 11% | 28 |
| joe.ADinosaur 1.0 | 7 | 11% | 11 |
| throxbot.ThroxBot 0.1 | 5 | 8% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 5 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.5 | 131 / 210 | 2.04 | 18.6% | 26334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.6% | 131 |
| kid.test.NightFox .2 | 2.0 | 15.7% | 44 |
| uji.Antique 1.0 | 3.2 | 11.4% | 16 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.6% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.0% | 2 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.7% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 3 |
| matt.advanced.Katana 1.0 | 8.7 | 6.0% | 2 |
| stelo.PianistNano 1.2 | 9.0 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.3 | 23 / 35 | 4468 |
| 2 | 1 | 66.4 | 82.5 | 19 / 35 | 4219 |
| 3 | 1 | 68.6 | 89.5 | 21 / 35 | 4609 |
| 4 | 1 | 68.3 | 89.5 | 23 / 35 | 4321 |
| 5 | 1 | 68.4 | 90.5 | 22 / 35 | 4320 |
| 6 | 1 | 68.9 | 91.4 | 23 / 35 | 4397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 97 | 73% |
| uji.Antique 1.0 | 29 | 93% |
| qohnil.blot.BlotBot 3.61 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 37 | 46% | 102 |
| uji.Antique 1.0 | 11 | 14% | 38 |
| amk.ChumbaWumba 0.3 | 11 | 14% | 15 |
| pfvicm.Sobieski 7.2.3b | 9 | 11% | 15 |
| qohnil.blot.BlotBot 3.61 | 4 | 5% | 17 |
| matt.advanced.Katana 1.0 | 3 | 4% | 7 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 8 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.2 | 118 / 210 | 2.33 | 18.5% | 27775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.5% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.5% | 40 |
| deewiant.Anomaly 0.2 | 2.5 | 15.2% | 40 |
| myl.micro.Troodon 1.10 | 4.2 | 12.0% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 10.7% | 2 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.7% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 6.9% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.4% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.4 | 18 / 35 | 4389 |
| 2 | 1 | 66.6 | 81.0 | 16 / 35 | 4280 |
| 3 | 1 | 69.5 | 87.0 | 21 / 35 | 4728 |
| 4 | 1 | 67.1 | 79.7 | 19 / 35 | 4565 |
| 5 | 1 | 72.2 | 95.6 | 29 / 35 | 5526 |
| 6 | 1 | 67.0 | 82.5 | 15 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 81% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 72% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 14 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 38% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 27 | 29% | 62 |
| myl.micro.Troodon 1.10 | 18 | 19% | 32 |
| jok.PheonixM 0.1.2 | 8 | 9% | 23 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.5 | 62 / 210 | 3.12 | 15.1% | 22291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.3 | 15.1% | 62 |
| catcat20.Matcha 0.006 | 2.5 | 13.9% | 45 |
| oog.melee.Capulet 1.2 | 3.5 | 13.1% | 30 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.2% | 33 |
| darkcanuck.B26354 1.06 | 4.0 | 13.0% | 31 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.4% | 5 |
| intruder.PrairieWolf 2.61 | 7.3 | 7.5% | 3 |
| ntc.Opposite 1.5 | 7.5 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.1% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 76.2 | 12 / 35 | 3811 |
| 2 | 2 | 62.5 | 75.6 | 9 / 35 | 3514 |
| 3 | 1 | 65.7 | 82.5 | 15 / 35 | 4291 |
| 4 | 1 | 63.7 | 76.8 | 11 / 35 | 3761 |
| 5 | 1 | 61.5 | 72.1 | 9 / 35 | 3638 |
| 6 | 2 | 61.7 | 75.6 | 6 / 35 | 3276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 38% |
| darkcanuck.B26354 1.06 | 27 | 70% |
| stelo.PastFuture 2.3.2 | 20 | 65% |
| oog.melee.Capulet 1.2 | 18 | 56% |
| tripphippy.Alice 1.1 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| ntc.Opposite 1.5 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 43 | 29% | 52 |
| stelo.PastFuture 2.3.2 | 34 | 23% | 47 |
| darkcanuck.B26354 1.06 | 27 | 18% | 48 |
| oog.melee.Capulet 1.2 | 26 | 17% | 36 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 6 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |
| tripphippy.Alice 1.1 | 4 | 3% | 7 |
| ntc.Opposite 1.5 | 4 | 3% | 6 |

## Melee bench: F31

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.7 | 60 / 210 | 3.00 | 15.2% | 20991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 97 |
| hadur117.mini.DeisePNS 0.4 | 2.2 | 15.2% | 60 |
| gh.mini.Griezel 0.2 | 2.8 | 13.4% | 34 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 4 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 12 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 4 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.4% | 1 |
| fm.mammillarias 1.3 | 7.8 | 5.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 70.2 | 10 / 35 | 3416 |
| 2 | 2 | 64.2 | 80.6 | 8 / 35 | 3460 |
| 3 | 2 | 64.7 | 81.3 | 13 / 35 | 3470 |
| 4 | 2 | 64.8 | 81.0 | 12 / 35 | 3641 |
| 5 | 2 | 63.0 | 75.6 | 11 / 35 | 3331 |
| 6 | 2 | 63.4 | 77.8 | 6 / 35 | 3673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 42% |
| gh.mini.Griezel 0.2 | 23 | 57% |
| spinnercat.micro.Tyger 0.1 | 11 | 100% |
| d414.nano.Quantum 1.0.0 | 10 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 151 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 38% | 79 |
| gh.mini.Griezel 0.2 | 41 | 27% | 53 |
| d414.nano.Quantum 1.0.0 | 19 | 13% | 32 |
| spinnercat.micro.Tyger 0.1 | 17 | 11% | 24 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.1 | 138 / 210 | 1.80 | 19.3% | 29785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.3% | 138 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 51 |
| apc.botM 3.0 | 3.5 | 11.1% | 11 |
| lxx.ConceptA 0.8 | 3.5 | 10.9% | 3 |
| vjik.UnViolation 1.1 | 5.5 | 9.2% | 3 |
| bayen.UbaMicro 1.4 | 5.8 | 8.7% | 1 |
| panzer.Panzer 0.2 | 7.7 | 7.0% | 0 |
| conscience.Electron 1.3g | 8.0 | 6.6% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 22 / 35 | 5171 |
| 2 | 1 | 68.2 | 87.9 | 21 / 35 | 4852 |
| 3 | 1 | 68.5 | 88.9 | 20 / 35 | 5043 |
| 4 | 1 | 69.6 | 92.4 | 26 / 35 | 5082 |
| 5 | 1 | 70.3 | 95.9 | 28 / 35 | 4908 |
| 6 | 1 | 68.2 | 90.5 | 21 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 61% |
| lxx.ConceptA 0.8 | 35 | 91% |
| apc.botM 3.0 | 29 | 93% |
| donjezza.Jezza 1.0 | 7 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| vjik.UnViolation 1.1 | 4 | 75% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 64% | 111 |
| lxx.ConceptA 0.8 | 9 | 12% | 21 |
| apc.botM 3.0 | 7 | 10% | 36 |
| bayen.UbaMicro 1.4 | 5 | 7% | 13 |
| vjik.UnViolation 1.1 | 2 | 3% | 11 |
| conscience.Electron 1.3g | 2 | 3% | 3 |
| panzer.Panzer 0.2 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |
| yk.JahMicro 1.0 | 0 | 0% | 5 |

## Melee bench: F33

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.4 | 133 / 210 | 2.05 | 19.3% | 29886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 19.3% | 133 |
| maribo.Quester 0.3 | 1.8 | 16.1% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.8% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.7% | 7 |
| labg.Cataclysm 2.05 | 4.3 | 10.3% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 7.9% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.0% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 20 / 35 | 4811 |
| 2 | 1 | 69.4 | 88.9 | 24 / 35 | 4735 |
| 3 | 1 | 68.7 | 87.0 | 21 / 35 | 4914 |
| 4 | 2 | 68.5 | 83.2 | 20 / 35 | 5052 |
| 5 | 1 | 70.1 | 90.2 | 23 / 35 | 5128 |
| 6 | 1 | 70.9 | 92.4 | 25 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 62 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 93% |
| gre.svman4.Leonidas 1.3.2 | 24 | 100% |
| labg.Cataclysm 2.05 | 17 | 88% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 49% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 19% | 53 |
| gre.svman4.Leonidas 1.3.2 | 6 | 8% | 26 |
| zyx.micro.Ant 1.1 | 5 | 6% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 6 |
| labg.Cataclysm 2.05 | 3 | 4% | 20 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 4% | 3 |
| baal.nano.N 1.42 | 2 | 3% | 5 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.3 | 98 / 210 | 2.23 | 17.9% | 28868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 17.9% | 98 |
| stelo.Spread 0.9 | 2.2 | 16.1% | 61 |
| kid.Gladiator .7.2 | 2.7 | 16.1% | 37 |
| tcf.Reach 3 | 4.2 | 11.1% | 3 |
| jcs.Seth 1.8 | 5.0 | 10.4% | 11 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.3 | 14 / 35 | 4708 |
| 2 | 1 | 68.6 | 84.4 | 20 / 35 | 5046 |
| 3 | 1 | 69.2 | 89.5 | 19 / 35 | 4974 |
| 4 | 2 | 67.9 | 85.1 | 14 / 35 | 4761 |
| 5 | 1 | 67.8 | 85.1 | 15 / 35 | 4655 |
| 6 | 1 | 67.9 | 87.3 | 16 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 75 | 61% |
| kid.Gladiator .7.2 | 55 | 62% |
| jcs.Seth 1.8 | 16 | 63% |
| tcf.Reach 3 | 6 | 83% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 54 | 48% | 81 |
| stelo.Spread 0.9 | 44 | 39% | 90 |
| jcs.Seth 1.8 | 8 | 7% | 20 |
| tcf.Reach 3 | 3 | 3% | 10 |
| cli.Dancer 1.1 | 2 | 2% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.4 | 41 / 210 | 2.77 | 15.2% | 20766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 148 |
| hadur117.mini.DeisePNS 0.4 | 2.0 | 15.2% | 41 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.1% | 13 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.5% | 6 |
| wit.Chuliath 1.0 | 6.2 | 6.7% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.3 | 6 / 35 | 3333 |
| 2 | 2 | 63.6 | 80.0 | 7 / 35 | 3539 |
| 3 | 2 | 64.5 | 82.5 | 8 / 35 | 3374 |
| 4 | 2 | 62.2 | 75.9 | 6 / 35 | 3188 |
| 5 | 2 | 64.8 | 83.2 | 7 / 35 | 3737 |
| 6 | 2 | 65.8 | 86.3 | 7 / 35 | 3595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 92 | 17% |
| gh.mini.Gruwel 0.9 | 14 | 71% |
| rz.HawkOnFire 0.1 | 12 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 75% |

Hadur died in 170 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 60% | 117 |
| gh.mini.Gruwel 0.9 | 33 | 19% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 9% | 20 |
| rz.HawkOnFire 0.1 | 12 | 7% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 96.1 | 182 / 210 | 1.35 | 21.8% | 33873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 21.8% | 182 |
| alpha.RainingFire 1.0 | 2.8 | 11.4% | 6 |
| bzdp.Pansy 2.1 | 3.2 | 11.7% | 10 |
| bvh.micro.Freya 0.3 | 4.0 | 10.6% | 7 |
| mz.Cork 0.1 | 4.8 | 10.0% | 3 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.4% | 0 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 5.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 33 / 35 | 5476 |
| 2 | 1 | 72.5 | 97.1 | 32 / 35 | 5775 |
| 3 | 1 | 73.1 | 99.0 | 33 / 35 | 5942 |
| 4 | 1 | 71.7 | 94.9 | 29 / 35 | 5489 |
| 5 | 1 | 72.6 | 97.5 | 31 / 35 | 5722 |
| 6 | 1 | 70.6 | 93.3 | 24 / 35 | 5469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 92% |
| bvh.micro.Freya 0.3 | 34 | 94% |
| mz.Cork 0.1 | 30 | 97% |
| alpha.RainingFire 1.0 | 24 | 83% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 19 | 95% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 7 | 25% | 29 |
| bzdp.Pansy 2.1 | 6 | 21% | 61 |
| bvh.micro.Freya 0.3 | 5 | 18% | 27 |
| mz.Cork 0.1 | 4 | 14% | 36 |
| bvh.mini.Fenrir 0.39 | 3 | 11% | 19 |
| dl.BetterWalls 1.0 | 2 | 7% | 6 |
| m3thos.Eva02 0.7.1 | 1 | 4% | 22 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.7 | 177 / 210 | 1.66 | 20.2% | 33999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 20.2% | 177 |
| germ.TheMind .2 | 2.2 | 11.1% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.1% | 5 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.0% | 8 |
| EBBU.Sim2 1.02 | 5.3 | 9.0% | 1 |
| lmk.ACPFinal 0.1 | 5.5 | 8.8% | 1 |
| agrach.Dalek 1.0 | 6.8 | 8.6% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.0% | 0 |
| mb.Beast 0.1 | 8.7 | 7.5% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 95.6 | 32 / 35 | 5720 |
| 2 | 1 | 69.1 | 91.7 | 25 / 35 | 5801 |
| 3 | 1 | 68.7 | 90.8 | 28 / 35 | 5390 |
| 4 | 1 | 70.9 | 97.1 | 33 / 35 | 5802 |
| 5 | 1 | 68.1 | 88.6 | 29 / 35 | 5180 |
| 6 | 1 | 70.3 | 92.4 | 30 / 35 | 6106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 52 | 98% |
| stelo.UntouchableNano 1.3 | 30 | 97% |
| mb.Beast 0.1 | 18 | 94% |
| skm.Ryubot 1.0 | 18 | 100% |
| EBBU.Sim2 1.02 | 18 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 94% |
| agrach.Dalek 1.0 | 16 | 100% |
| lmk.ACPFinal 0.1 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 8 | 24% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 15% | 34 |
| agrach.Dalek 1.0 | 5 | 15% | 33 |
| EBBU.Sim2 1.02 | 5 | 15% | 21 |
| germ.TheMind .2 | 4 | 12% | 47 |
| mb.Beast 0.1 | 3 | 9% | 21 |
| stelo.UntouchableNano 1.3 | 2 | 6% | 18 |
| skm.Ryubot 1.0 | 1 | 3% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 2 |

## Melee bench: F38

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.2 | 106 / 210 | 2.42 | 17.2% | 25439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 17.2% | 106 |
| justin.Mallais 14.0 | 1.8 | 15.4% | 58 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 15 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.1% | 19 |
| cs.Wren 1.0 | 5.0 | 10.6% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.0% | 3 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.0% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.7% | 0 |
| bzdp.BoxCar 2.0 | 9.2 | 4.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 22 / 35 | 4425 |
| 2 | 1 | 68.6 | 88.9 | 22 / 35 | 4436 |
| 3 | 2 | 64.9 | 81.0 | 14 / 35 | 3962 |
| 4 | 1 | 66.0 | 80.6 | 14 / 35 | 4419 |
| 5 | 1 | 65.7 | 81.9 | 18 / 35 | 3924 |
| 6 | 1 | 66.1 | 83.8 | 16 / 35 | 4273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 63% |
| cs.Wren 1.0 | 27 | 89% |
| bvh.mini.Freya 0.55 | 23 | 83% |
| bts.mega.Gnarly 1.4 | 17 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 42% | 80 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 31 |
| bvh.mini.Freya 0.55 | 14 | 13% | 28 |
| bts.mega.Gnarly 1.4 | 11 | 11% | 29 |
| cs.Wren 1.0 | 11 | 11% | 28 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.7 | 107 / 210 | 2.38 | 17.7% | 28408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 17.7% | 107 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 27 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 49 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.1% | 5 |
| gimp.GimpBot 0.1 | 6.7 | 8.0% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.5 | 17 / 35 | 4744 |
| 2 | 1 | 67.7 | 88.3 | 21 / 35 | 4751 |
| 3 | 1 | 66.0 | 84.1 | 14 / 35 | 4399 |
| 4 | 1 | 68.3 | 87.9 | 22 / 35 | 4988 |
| 5 | 1 | 66.3 | 82.9 | 16 / 35 | 4634 |
| 6 | 1 | 66.1 | 82.2 | 17 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 51 | 59% |
| bvh.fry.Freya 0.82 | 43 | 88% |
| catcat20.Lambda 0.024 | 28 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 41% | 71 |
| az.Ololobot 0.2.4 | 30 | 28% | 64 |
| catcat20.Lambda 0.024 | 12 | 11% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 9% | 18 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 6 |
| gimp.GimpBot 0.1 | 3 | 3% | 10 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.4 | 124 / 210 | 2.14 | 18.8% | 29026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.8% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.6% | 21 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.6% | 9 |
| mz.AntiGrav 1.0 | 5.0 | 10.7% | 6 |
| stelo.Randomness 1.0 | 5.8 | 9.4% | 11 |
| alpha.BlackIce 1.0 | 6.5 | 8.8% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 5.9% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 4 |
| sample.Corners 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 20 / 35 | 5302 |
| 2 | 1 | 69.4 | 91.1 | 26 / 35 | 4506 |
| 3 | 1 | 69.0 | 88.3 | 20 / 35 | 5064 |
| 4 | 1 | 67.1 | 85.7 | 16 / 35 | 4396 |
| 5 | 1 | 68.2 | 85.7 | 19 / 35 | 4834 |
| 6 | 1 | 69.1 | 87.9 | 23 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 86% |
| kano.gamma.KanoGamma 1.8 | 27 | 70% |
| Polkwane.SmashMelee 1.0 | 21 | 86% |
| mz.AntiGrav 1.0 | 14 | 100% |
| stelo.Randomness 1.0 | 11 | 64% |
| alpha.BlackIce 1.0 | 9 | 67% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 27 | 31% | 57 |
| kano.gamma.KanoGamma 1.8 | 16 | 18% | 49 |
| stelo.Randomness 1.0 | 12 | 14% | 25 |
| Polkwane.SmashMelee 1.0 | 10 | 11% | 27 |
| mz.AntiGrav 1.0 | 7 | 8% | 24 |
| alpha.BlackIce 1.0 | 7 | 8% | 13 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 7 |
| sample.Corners 1.0 | 2 | 2% | 4 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.8 | 113 / 210 | 2.19 | 17.8% | 24937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.2 | 17.8% | 113 |
| eem.EvBotNG v12.8 | 1.8 | 15.8% | 61 |
| ary.Swarm 1.1 | 3.2 | 13.9% | 13 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.2% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.6% | 8 |
| shrub.Silver v048 | 6.2 | 8.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.2 | 18 / 35 | 4268 |
| 2 | 1 | 67.9 | 88.6 | 18 / 35 | 3964 |
| 3 | 1 | 67.5 | 84.1 | 19 / 35 | 4424 |
| 4 | 1 | 68.7 | 90.5 | 23 / 35 | 4027 |
| 5 | 2 | 65.8 | 80.3 | 15 / 35 | 4171 |
| 6 | 1 | 67.9 | 87.9 | 20 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 48% |
| ary.Swarm 1.1 | 38 | 89% |
| lessonz.robocode.Oz 0.5.0 | 23 | 100% |
| simonton.nano.MeleeSeed 1.8 | 20 | 90% |
| stelo.Mirror 1.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| shrub.Silver v048 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 49% | 79 |
| ary.Swarm 1.1 | 23 | 24% | 59 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 30 |
| simonton.nano.MeleeSeed 1.8 | 5 | 5% | 23 |
| stelo.Mirror 1.1 | 4 | 4% | 6 |
| shrub.Silver v048 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 117 / 210 | 2.25 | 18.3% | 30191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 18.3% | 117 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 49 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.1% | 17 |
| ara.Shera 0.88 | 3.7 | 12.7% | 22 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| maribo.IotaCT 1.1 | 6.3 | 7.4% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.6% | 2 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.2% | 0 |
| stelo.MirrorMicro 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 22 / 35 | 5100 |
| 2 | 1 | 69.1 | 88.3 | 19 / 35 | 5553 |
| 3 | 1 | 67.7 | 86.0 | 16 / 35 | 4994 |
| 4 | 1 | 66.9 | 85.1 | 20 / 35 | 4587 |
| 5 | 1 | 66.9 | 82.5 | 19 / 35 | 4838 |
| 6 | 1 | 68.8 | 87.6 | 21 / 35 | 5119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 77% |
| ara.Shera 0.88 | 37 | 73% |
| maribo.mini.MiniQuester 0.1 | 33 | 88% |
| dsw.StaticD 1.0 | 8 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 37% | 93 |
| ara.Shera 0.88 | 28 | 30% | 54 |
| maribo.mini.MiniQuester 0.1 | 22 | 24% | 45 |
| amz.NanoClone 1.41 | 4 | 4% | 5 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 1 | 1% | 5 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 75.4 | 36 / 210 | 3.21 | 14.5% | 21252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 147 |
| hadur117.mini.DeisePNS 0.4 | 2.0 | 14.5% | 36 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.6% | 16 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.2% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 78.4 | 7 / 35 | 3616 |
| 2 | 2 | 62.0 | 70.8 | 3 / 35 | 3272 |
| 3 | 2 | 66.4 | 82.5 | 13 / 35 | 3743 |
| 4 | 2 | 62.4 | 73.3 | 5 / 35 | 3449 |
| 5 | 2 | 63.6 | 73.7 | 5 / 35 | 3717 |
| 6 | 2 | 63.1 | 74.0 | 3 / 35 | 3455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 71 | 21% |
| brainfade.melee.Dusk 0.44 | 15 | 73% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 51% | 104 |
| brainfade.melee.Dusk 0.44 | 27 | 15% | 38 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 11% | 24 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 22 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 8 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 6 | 3% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.9 | 129 / 210 | 1.90 | 19.5% | 31559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.5% | 129 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 47 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 28 |
| wompi.Quokka 1.6 | 4.0 | 10.4% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.1% | 2 |
| jwirde.Gort 2.0 | 6.3 | 8.3% | 1 |
| disan.Chair 2.2.0 | 7.0 | 7.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 18 / 35 | 5140 |
| 2 | 1 | 69.7 | 89.2 | 20 / 35 | 5397 |
| 3 | 1 | 69.8 | 89.2 | 22 / 35 | 5506 |
| 4 | 1 | 70.9 | 93.0 | 25 / 35 | 5362 |
| 5 | 1 | 69.9 | 91.4 | 23 / 35 | 5188 |
| 6 | 1 | 69.4 | 90.5 | 21 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 75% |
| tzu.TheArtOfWar 1.2 | 54 | 74% |
| wompi.Quokka 1.6 | 12 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| disan.Chair 2.2.0 | 6 | 83% |
| jwirde.Gort 2.0 | 4 | 75% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 42% | 97 |
| tzu.TheArtOfWar 1.2 | 29 | 36% | 65 |
| wompi.Quokka 1.6 | 8 | 10% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 9% | 12 |
| jwirde.Gort 2.0 | 2 | 2% | 9 |
| disan.Chair 2.2.0 | 1 | 1% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.6 | 88 / 210 | 2.02 | 19.7% | 35276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS 0.4 | 1.0 | 19.7% | 88 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 106 |
| jje.BagPuss 1.2 | 3.2 | 11.5% | 1 |
| sul.Lunar 1.1 | 4.2 | 10.1% | 4 |
| myl.nano.Graviton 1.10 | 5.2 | 10.1% | 3 |
| fm.claire 1.7 | 6.5 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 7 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 17 / 35 | 6176 |
| 2 | 1 | 69.2 | 87.6 | 14 / 35 | 5903 |
| 3 | 1 | 69.6 | 88.6 | 17 / 35 | 5916 |
| 4 | 1 | 70.0 | 89.5 | 13 / 35 | 6234 |
| 5 | 1 | 69.2 | 90.2 | 14 / 35 | 5640 |
| 6 | 1 | 67.7 | 83.2 | 13 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 26% |
| jje.BagPuss 1.2 | 15 | 93% |
| sul.Lunar 1.1 | 12 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| myl.nano.Graviton 1.10 | 11 | 100% |
| fm.claire 1.7 | 6 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 2271. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 87 | 71% | 0 |
| myl.nano.Graviton 1.10 | 11 | 9% | 35 |
| sul.Lunar 1.1 | 6 | 5% | 56 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 20 |
| jje.BagPuss 1.2 | 5 | 4% | 57 |
| fm.claire 1.7 | 3 | 2% | 14 |
| wit.Deep7 2.0 | 3 | 2% | 12 |
| hvilela.HVilela 0.9 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeisePNS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.9 | 65 / 210 | 2.45 | 16.3% | 24071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.8% | 78 |
| kc.mini.Mirage 0.2 | 2.2 | 16.6% | 56 |
| hadur117.mini.DeisePNS 0.4 | 2.2 | 16.3% | 65 |
| mz.MicroSheep 1.0 | 4.0 | 10.7% | 3 |
| sadoner.killer 0.2 | 5.5 | 9.3% | 1 |
| cx.Princess 1.0 | 5.5 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 80.6 | 9 / 35 | 4040 |
| 2 | 3 | 63.8 | 79.0 | 8 / 35 | 3667 |
| 3 | 1 | 66.3 | 86.0 | 16 / 35 | 3794 |
| 4 | 2 | 66.2 | 83.5 | 11 / 35 | 4388 |
| 5 | 3 | 65.7 | 85.1 | 9 / 35 | 3868 |
| 6 | 1 | 67.1 | 88.9 | 12 / 35 | 4314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 56% |
| rsalesc.melee.Medina 0.4.5 | 54 | 37% |
| mz.MicroSheep 1.0 | 6 | 100% |
| cx.Princess 1.0 | 4 | 50% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 50% |

Hadur died in 146 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 45% | 93 |
| rsalesc.melee.Medina 0.4.5 | 58 | 40% | 81 |
| mz.MicroSheep 1.0 | 7 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 10 |
| cx.Princess 1.0 | 3 | 2% | 6 |
| sadoner.killer 0.2 | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
1 death(s) with no robot to name.

