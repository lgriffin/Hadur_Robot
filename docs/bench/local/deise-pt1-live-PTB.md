# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.8 | 40 / 210 | 2.37 | 17.2% | 31799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 157 |
| hadur117.mini.DeisePTB 0.5 | 2.0 | 17.2% | 40 |
| sgp.JollyNinja 3.53 | 3.5 | 11.7% | 11 |
| mz.MicroGodMelee 1 | 4.0 | 10.8% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.1% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 85.1 | 6 / 35 | 5362 |
| 2 | 2 | 66.2 | 84.1 | 3 / 35 | 5027 |
| 3 | 2 | 66.8 | 84.1 | 7 / 35 | 5239 |
| 4 | 2 | 68.6 | 88.3 | 6 / 35 | 5785 |
| 5 | 2 | 65.9 | 79.4 | 10 / 35 | 4831 |
| 6 | 2 | 68.2 | 87.9 | 8 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 9% |
| sgp.JollyNinja 3.53 | 12 | 83% |
| mz.MicroGodMelee 1 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 1123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 142 | 83% | 153 |
| sgp.JollyNinja 3.53 | 14 | 8% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 2% | 7 |
| mz.MicroGodMelee 1 | 3 | 2% | 11 |
| lorneswork.Predator 1.0 | 3 | 2% | 6 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.6 | 96 / 210 | 2.66 | 18.0% | 31431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.0% | 96 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.4% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.4% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.7% | 2 |
| Noran.BitchingElk 0.054 | 7.2 | 7.9% | 10 |
| sch.Simone 0.3d | 7.5 | 7.2% | 8 |
| stelo.PatternRobot 1.0 | 8.3 | 6.7% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.3 | 16 / 35 | 4933 |
| 2 | 1 | 66.7 | 80.6 | 14 / 35 | 5314 |
| 3 | 1 | 68.5 | 85.4 | 13 / 35 | 5542 |
| 4 | 1 | 69.9 | 88.9 | 22 / 35 | 5532 |
| 5 | 1 | 65.2 | 76.8 | 14 / 35 | 5000 |
| 6 | 1 | 66.4 | 76.5 | 17 / 35 | 5110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 73% |
| pulsar.PulsarMax 0.8.9 | 39 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 88% |
| stelo.PatternRobot 1.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 67% |
| sch.Simone 0.3d | 4 | 50% |
| Noran.BitchingElk 0.054 | 4 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 26% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 24% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 24 | 21% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 8% | 23 |
| Noran.BitchingElk 0.054 | 6 | 5% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 7 |
| sch.Simone 0.3d | 5 | 4% | 11 |
| stelo.PatternRobot 1.0 | 4 | 3% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.1 | 149 / 210 | 1.71 | 20.7% | 40265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.7% | 149 |
| radnor.DoctorBob 1.42 | 2.8 | 13.5% | 13 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.7% | 14 |
| vuen.Cake 2.51 | 3.3 | 13.2% | 32 |
| urdos.URDOS 1.3 | 5.2 | 8.6% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.8% | 2 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 27 / 35 | 6689 |
| 2 | 1 | 70.8 | 93.0 | 27 / 35 | 6247 |
| 3 | 1 | 70.0 | 88.3 | 20 / 35 | 6645 |
| 4 | 1 | 71.3 | 91.4 | 27 / 35 | 6945 |
| 5 | 1 | 70.2 | 89.5 | 21 / 35 | 6631 |
| 6 | 1 | 72.4 | 94.9 | 27 / 35 | 7108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 74% |
| kawigi.nano.Lib 1.0 | 55 | 93% |
| radnor.DoctorBob 1.42 | 39 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 26 | 43% | 81 |
| radnor.DoctorBob 1.42 | 13 | 21% | 42 |
| kawigi.nano.Lib 1.0 | 12 | 20% | 60 |
| urdos.URDOS 1.3 | 4 | 7% | 7 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 3 |
| adt.Ar1 2.1 | 1 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.2 | 31 / 210 | 2.33 | 17.7% | 34677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 169 |
| hadur117.mini.DeisePTB 0.5 | 2.0 | 17.7% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 8 |
| TNT.TNT 0.99.1 | 4.2 | 10.0% | 1 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.4% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 84.1 | 2 / 35 | 5607 |
| 2 | 2 | 69.0 | 86.7 | 3 / 35 | 5980 |
| 3 | 2 | 67.6 | 83.5 | 7 / 35 | 5617 |
| 4 | 2 | 68.3 | 85.4 | 6 / 35 | 5617 |
| 5 | 2 | 68.5 | 84.4 | 7 / 35 | 6184 |
| 6 | 2 | 68.8 | 87.0 | 6 / 35 | 5672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 17% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| TNT.TNT 0.99.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1308. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 153 | 85% | 179 |
| apc.LeeroyJenkins2 1.0 | 19 | 11% | 22 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| css.Delitioner 0.11 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.9 | 11 / 210 | 3.53 | 13.6% | 22166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.4% | 123 |
| justin.DemonicRage 3.4 | 2.0 | 17.2% | 61 |
| hadur117.mini.DeisePTB 0.5 | 3.0 | 13.6% | 11 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 10 |
| ms.Ares 0.19 | 5.2 | 9.3% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.6% | 4 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 73.7 | 4 / 35 | 3439 |
| 2 | 3 | 61.2 | 71.1 | 1 / 35 | 3509 |
| 3 | 3 | 61.9 | 73.3 | 4 / 35 | 3776 |
| 4 | 3 | 61.2 | 69.5 | 2 / 35 | 3814 |
| 5 | 3 | 60.5 | 70.2 | 0 / 35 | 3512 |
| 6 | 3 | 62.4 | 73.3 | 0 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 37 | 8% |
| justin.DemonicRage 3.4 | 24 | 25% |
| wompi.Numbat 2.1 | 2 | 50% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 85 | 42% | 90 |
| justin.DemonicRage 3.4 | 66 | 33% | 69 |
| wompi.Numbat 2.1 | 18 | 9% | 19 |
| ms.Ares 0.19 | 14 | 7% | 15 |
| axeBots.HataMoto 3.09 | 7 | 3% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| supersample.SuperBoxBot 1.0 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.0 | 105 / 210 | 2.53 | 18.0% | 30396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.0% | 105 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 33 |
| origin.SleepSiphon 1.7b | 3.0 | 13.5% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.9% | 13 |
| mld.Wisdom 1.0 | 4.5 | 11.0% | 4 |
| gg.Wolverine 2.0 | 6.2 | 8.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.4% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 5.9% | 1 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.9 | 16 / 35 | 5258 |
| 2 | 1 | 68.5 | 84.8 | 21 / 35 | 5111 |
| 3 | 1 | 67.3 | 82.9 | 16 / 35 | 4788 |
| 4 | 1 | 70.2 | 89.8 | 25 / 35 | 5281 |
| 5 | 1 | 65.8 | 77.8 | 14 / 35 | 4871 |
| 6 | 1 | 66.3 | 79.7 | 13 / 35 | 5087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 42 | 76% |
| jekl.StoneGhost 0.7 | 36 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 81% |
| gg.Wolverine 2.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| mld.Wisdom 1.0 | 6 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 30 | 28% | 47 |
| origin.SleepSiphon 1.7b | 28 | 26% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 24% | 45 |
| mld.Wisdom 1.0 | 13 | 12% | 29 |
| gg.Wolverine 2.0 | 6 | 6% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 11 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.7 | 127 / 210 | 1.66 | 20.3% | 36783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.3% | 127 |
| rtk.Tachikoma 1.0 | 2.3 | 17.3% | 40 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 17.0% | 37 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.1% | 4 |
| franzor.Lizt 1.3.1 | 5.0 | 10.1% | 4 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.0 | 23 / 35 | 6388 |
| 2 | 1 | 71.2 | 90.8 | 16 / 35 | 5961 |
| 3 | 1 | 73.2 | 97.1 | 28 / 35 | 6434 |
| 4 | 1 | 70.3 | 86.7 | 17 / 35 | 5826 |
| 5 | 1 | 72.2 | 94.6 | 21 / 35 | 5990 |
| 6 | 1 | 72.2 | 93.0 | 22 / 35 | 6184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 111 | 76% |
| rsalesc.melee.Monk 0.3.6c | 40 | 30% |
| oog.melee.CapuletDroid 1.1 | 25 | 100% |
| franzor.Lizt 1.3.1 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1276. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 43 | 51% | 124 |
| rsalesc.melee.Monk 0.3.6c | 36 | 43% | 56 |
| oog.melee.CapuletDroid 1.1 | 2 | 2% | 22 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| franzor.Lizt 1.3.1 | 1 | 1% | 0 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.0 | 119 / 210 | 2.17 | 19.0% | 31756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.0% | 119 |
| tm.Yuugao 1.0 | 2.2 | 13.4% | 40 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.1% | 19 |
| shrub.Vapour v159 | 3.7 | 11.7% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.8% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 8.7% | 4 |
| m3thos.Eva00 1.1 | 6.5 | 8.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.2% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 1 |
| SHAM.WOW 1.4 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 22 / 35 | 5184 |
| 2 | 1 | 67.3 | 83.2 | 16 / 35 | 5087 |
| 3 | 1 | 68.5 | 87.6 | 19 / 35 | 5435 |
| 4 | 1 | 67.5 | 82.2 | 18 / 35 | 5337 |
| 5 | 1 | 69.8 | 90.8 | 23 / 35 | 5522 |
| 6 | 1 | 68.3 | 88.6 | 21 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 68% |
| Krabb.sliNk.Garm 0.9u | 25 | 84% |
| shrub.Vapour v159 | 22 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 81% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 39 | 42% | 83 |
| shrub.Vapour v159 | 17 | 18% | 35 |
| Krabb.sliNk.Garm 0.9u | 16 | 17% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 9% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 4% | 20 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 10 |
| m3thos.Eva00 1.1 | 2 | 2% | 5 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.2 | 58 / 210 | 3.14 | 15.8% | 25747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.3% | 103 |
| hadur117.mini.DeisePTB 0.5 | 2.0 | 15.8% | 58 |
| kc.micro.Figment 1.0 | 3.0 | 14.4% | 25 |
| yagami.Tidus 0.11 | 4.0 | 11.5% | 3 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.2% | 12 |
| mc2.enemy.Original 0.9 | 5.8 | 8.9% | 8 |
| dft.Calliope 5.6 | 6.8 | 7.4% | 2 |
| step.nanoPri 1.0 | 8.0 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 69.8 | 10 / 35 | 3977 |
| 2 | 2 | 64.5 | 79.4 | 7 / 35 | 4159 |
| 3 | 2 | 65.6 | 80.0 | 12 / 35 | 4304 |
| 4 | 2 | 65.3 | 76.5 | 10 / 35 | 4524 |
| 5 | 2 | 64.5 | 75.6 | 9 / 35 | 4498 |
| 6 | 2 | 64.3 | 76.2 | 10 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 34% |
| kc.micro.Figment 1.0 | 25 | 80% |
| pedersen.Grishnakh 1.0 | 9 | 56% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 43% | 83 |
| yagami.Tidus 0.11 | 27 | 18% | 34 |
| kc.micro.Figment 1.0 | 26 | 17% | 52 |
| mc2.enemy.Original 0.9 | 12 | 8% | 16 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 11 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.3 | 154 / 210 | 1.51 | 20.5% | 35299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.5% | 154 |
| DTF.Kludgy 1.2b | 2.0 | 14.5% | 23 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 12 |
| ne.Chimera 1.2 | 3.5 | 12.2% | 12 |
| vStar.RAFzilla 2.15 | 5.2 | 10.2% | 4 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.9% | 6 |
| sam.Samspin 1.0 | 7.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 96.5 | 29 / 35 | 6080 |
| 2 | 1 | 70.2 | 92.7 | 23 / 35 | 5708 |
| 3 | 1 | 70.4 | 94.0 | 25 / 35 | 5485 |
| 4 | 1 | 70.6 | 94.6 | 25 / 35 | 5826 |
| 5 | 1 | 71.5 | 94.3 | 27 / 35 | 6253 |
| 6 | 1 | 71.0 | 94.0 | 25 / 35 | 5947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 79% |
| ejb.Polaris 1.0.1 | 49 | 92% |
| ne.Chimera 1.2 | 26 | 65% |
| vStar.RAFzilla 2.15 | 16 | 94% |
| tvv.micro.Antares 1.1.1 | 15 | 80% |
| sam.Samspin 1.0 | 4 | 100% |
| donjezza.Muncho 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 36% | 71 |
| ne.Chimera 1.2 | 13 | 22% | 35 |
| ejb.Polaris 1.0.1 | 8 | 14% | 43 |
| vStar.RAFzilla 2.15 | 8 | 14% | 21 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 20 |
| kurios.DOSexe .9b | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 2% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.1 | 81 / 210 | 2.70 | 17.0% | 27308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.5 | 17.0% | 81 |
| rz.Aleph 0.34 | 1.8 | 16.2% | 57 |
| cx.mini.Nimrod 0.55 | 2.7 | 13.3% | 28 |
| djc.DynaBot 0.1.1 | 4.0 | 11.5% | 16 |
| br2.MobyDickBot 1.6 | 5.7 | 8.7% | 14 |
| rdt199.Warlord 0.73 | 5.7 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 7.3 | 7.4% | 8 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.0% | 1 |
| stelo.MirrorNano 1.3 | 9.3 | 5.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.1 | 10 / 35 | 4389 |
| 2 | 1 | 68.9 | 88.9 | 19 / 35 | 5119 |
| 3 | 1 | 66.2 | 81.9 | 14 / 35 | 4686 |
| 4 | 2 | 64.4 | 77.5 | 12 / 35 | 4216 |
| 5 | 2 | 65.2 | 79.0 | 11 / 35 | 4352 |
| 6 | 1 | 66.4 | 82.2 | 15 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 64% |
| djc.DynaBot 0.1.1 | 19 | 95% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| rdt199.Warlord 0.73 | 9 | 78% |
| br2.MobyDickBot 1.6 | 7 | 71% |
| uji.YellohFellah 1.0 | 4 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 43% | 90 |
| cx.mini.Nimrod 0.55 | 35 | 27% | 46 |
| djc.DynaBot 0.1.1 | 12 | 9% | 28 |
| rdt199.Warlord 0.73 | 9 | 7% | 16 |
| br2.MobyDickBot 1.6 | 6 | 5% | 11 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 7 |
| uji.YellohFellah 1.0 | 3 | 2% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.5 | 129 / 210 | 2.40 | 18.0% | 25217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.0% | 129 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.2% | 30 |
| darkcanuck.Leon 1.01 | 3.2 | 12.7% | 20 |
| nat.PallasHawk 1.0 | 3.8 | 12.3% | 23 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 6 |
| jrm.Test0 1.0 | 6.5 | 7.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.0% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.7% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.6 | 19 / 35 | 3860 |
| 2 | 1 | 66.8 | 81.3 | 22 / 35 | 4262 |
| 3 | 1 | 67.9 | 88.3 | 22 / 35 | 3980 |
| 4 | 1 | 67.0 | 82.9 | 22 / 35 | 4236 |
| 5 | 1 | 67.4 | 81.9 | 22 / 35 | 4446 |
| 6 | 1 | 69.0 | 91.1 | 22 / 35 | 4433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 90% |
| nat.PallasHawk 1.0 | 38 | 87% |
| darkcanuck.Leon 1.01 | 33 | 82% |
| brainfade.melee.Genghis 0.36 | 21 | 90% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 20 | 24% | 53 |
| darkcanuck.Leon 1.01 | 15 | 18% | 57 |
| brainfade.melee.Genghis 0.36 | 14 | 17% | 23 |
| nat.PallasHawk 1.0 | 13 | 16% | 42 |
| jrm.Test0 1.0 | 9 | 11% | 12 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 8 |
| jp.Perpy 16.0 | 3 | 4% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.7 | 67 / 210 | 2.38 | 16.9% | 28240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.7 | 16.9% | 67 |
| mn.Combat 3.25.0 | 1.8 | 17.2% | 94 |
| ags.Glacier 0.2.11 | 2.5 | 16.2% | 33 |
| shinh.Entangled 0.3 | 4.0 | 11.8% | 14 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.8% | 2 |
| stelo.Wang 1.0 | 6.5 | 7.2% | 0 |
| apc.Colossus2 0.17 | 6.5 | 7.4% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 13 / 35 | 4818 |
| 2 | 1 | 67.6 | 86.3 | 12 / 35 | 4879 |
| 3 | 1 | 66.8 | 83.2 | 12 / 35 | 4806 |
| 4 | 2 | 67.6 | 87.0 | 12 / 35 | 4856 |
| 5 | 2 | 66.1 | 84.4 | 11 / 35 | 4273 |
| 6 | 3 | 65.5 | 81.0 | 7 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 75 | 33% |
| ags.Glacier 0.2.11 | 46 | 67% |
| shinh.Entangled 0.3 | 16 | 50% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 78 | 55% | 100 |
| ags.Glacier 0.2.11 | 42 | 29% | 69 |
| shinh.Entangled 0.3 | 14 | 10% | 25 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 11 |
| stelo.Wang 1.0 | 2 | 1% | 3 |
| maribo.FollowFire 1 | 0 | 0% | 1 |
| apc.Colossus2 0.17 | 0 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.7 | 154 / 210 | 1.48 | 20.9% | 36165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.9% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.0% | 30 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.2% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.5% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.3% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.2 | 7.9% | 0 |
| pa.Improved 1.0 | 8.8 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.1 | 22 / 35 | 6032 |
| 2 | 1 | 72.9 | 97.8 | 29 / 35 | 6386 |
| 3 | 1 | 72.2 | 96.2 | 29 / 35 | 6212 |
| 4 | 1 | 71.7 | 95.2 | 24 / 35 | 5962 |
| 5 | 1 | 71.0 | 93.3 | 22 / 35 | 6052 |
| 6 | 1 | 71.0 | 93.7 | 28 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 83 | 72% |
| simonton.micro.Sprout 1.1.3 | 76 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 60% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1098. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 28 | 48% | 65 |
| simonton.micro.Sprout 1.1.3 | 22 | 38% | 97 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 3% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 2% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.2 | 84 / 210 | 2.70 | 17.8% | 32410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 17.8% | 84 |
| emp.Yngwie 1.11 | 2.8 | 13.4% | 54 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.7% | 22 |
| mld.DustBunny 3.8 | 3.7 | 12.6% | 10 |
| kawigi.robot.Girl 1.2 | 5.0 | 10.7% | 27 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.6% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.2 | 5.7% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.3% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.6 | 13 / 35 | 5472 |
| 2 | 1 | 66.9 | 80.0 | 12 / 35 | 5374 |
| 3 | 1 | 65.2 | 77.1 | 10 / 35 | 4916 |
| 4 | 1 | 68.1 | 82.5 | 16 / 35 | 5671 |
| 5 | 1 | 67.4 | 81.6 | 14 / 35 | 5259 |
| 6 | 1 | 69.3 | 85.1 | 19 / 35 | 5718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 39 | 54% |
| mld.DustBunny 3.8 | 25 | 92% |
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 50% |
| cb.nano.Insomnia 1.0 | 12 | 67% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 47 | 37% | 75 |
| mld.DustBunny 3.8 | 23 | 18% | 47 |
| kawigi.robot.Girl 1.2 | 21 | 17% | 26 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 40 |
| cb.nano.Insomnia 1.0 | 16 | 13% | 11 |
| divineomega.TrialBot 0.003 | 2 | 2% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 2 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.8 | 82 / 210 | 2.46 | 18.5% | 34931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.2 | 18.5% | 82 |
| gh.Griezel 0.5.2 | 1.8 | 17.3% | 89 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 12 |
| tvv.nano.Polaris 1.2 | 4.7 | 9.1% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 9.7% | 19 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.4% | 2 |
| asd.Cthulhu 1.3 | 8.5 | 5.4% | 1 |
| repositorio.NanoStep 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 17 / 35 | 6149 |
| 2 | 1 | 69.2 | 85.1 | 14 / 35 | 6190 |
| 3 | 2 | 67.9 | 82.2 | 11 / 35 | 5609 |
| 4 | 1 | 68.6 | 84.8 | 17 / 35 | 5701 |
| 5 | 1 | 66.9 | 78.7 | 10 / 35 | 5635 |
| 6 | 1 | 67.9 | 82.9 | 13 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 106 | 45% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 81% |
| techdude.forest.FlamingForest 1.1 | 14 | 50% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1263. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 75 | 57% | 125 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 14% | 30 |
| bvh.fnr.Fenrir 0.36l | 15 | 11% | 16 |
| techdude.forest.FlamingForest 1.1 | 8 | 6% | 16 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 10 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.4 | 112 / 210 | 2.31 | 18.7% | 32967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.7% | 112 |
| et.Predator 1.8 | 2.2 | 14.0% | 30 |
| oog.melee.Mercutio 1.0 | 4.0 | 12.1% | 28 |
| cx.BlestPain 1.41 | 4.2 | 11.6% | 24 |
| nic.Nicator 2.4 | 5.0 | 10.7% | 9 |
| ahf.NanoAndrew .4 | 5.2 | 10.7% | 7 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 16 / 35 | 5362 |
| 2 | 1 | 68.2 | 81.9 | 18 / 35 | 5696 |
| 3 | 1 | 69.9 | 89.2 | 20 / 35 | 5840 |
| 4 | 1 | 69.2 | 85.4 | 22 / 35 | 5454 |
| 5 | 1 | 68.4 | 86.0 | 19 / 35 | 5127 |
| 6 | 1 | 68.5 | 85.1 | 17 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 57 | 77% |
| oog.melee.Mercutio 1.0 | 27 | 63% |
| cx.BlestPain 1.41 | 27 | 67% |
| nic.Nicator 2.4 | 20 | 100% |
| ahf.NanoAndrew .4 | 12 | 83% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 33 | 34% | 68 |
| oog.melee.Mercutio 1.0 | 20 | 20% | 38 |
| cx.BlestPain 1.41 | 19 | 19% | 42 |
| ahf.NanoAndrew .4 | 9 | 9% | 21 |
| nic.Nicator 2.4 | 7 | 7% | 27 |
| maribo.melee.BMV 0.1 | 5 | 5% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 6 |
| tex.Longbot 0.4 | 2 | 2% | 3 |

## Melee bench: F18

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.9 | 116 / 210 | 2.09 | 18.7% | 28609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.7% | 116 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 36 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 27 |
| uji.DBH 1.1 | 4.0 | 11.5% | 16 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 5 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.6% | 2 |
| sigterm.Sigterm 1.0 | 7.2 | 7.8% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.1% | 0 |
| stelo.WangRobot 1.0 | 8.8 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 19 / 35 | 4928 |
| 2 | 1 | 69.0 | 91.7 | 21 / 35 | 4570 |
| 3 | 1 | 66.8 | 82.2 | 16 / 35 | 4814 |
| 4 | 1 | 67.4 | 86.7 | 20 / 35 | 4533 |
| 5 | 1 | 68.5 | 87.6 | 19 / 35 | 4894 |
| 6 | 1 | 69.0 | 89.5 | 21 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 63 | 78% |
| agd.Mooserwirt2 2.7 | 38 | 63% |
| uji.DBH 1.1 | 21 | 81% |
| sigterm.Sigterm 1.0 | 14 | 71% |
| ratosh.Nobo 0.21 | 6 | 100% |
| stelo.WangRobot 1.0 | 5 | 100% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 41% | 82 |
| agd.Mooserwirt2 2.7 | 23 | 24% | 44 |
| uji.DBH 1.1 | 14 | 15% | 31 |
| sigterm.Sigterm 1.0 | 6 | 6% | 15 |
| ratosh.Nobo 0.21 | 4 | 4% | 12 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 7 |
| stelo.WangRobot 1.0 | 2 | 2% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 1 |

## Melee bench: F19

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.4 | 153 / 210 | 1.50 | 21.0% | 35982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 21.0% | 153 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.8% | 19 |
| mld.Infinity 2.2 | 2.8 | 14.3% | 34 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 2 |
| erdnis.Rover 0.3 | 5.3 | 9.8% | 0 |
| patson.PatsonTestBot 1.0 | 5.3 | 8.9% | 3 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.8 | 22 / 35 | 6138 |
| 2 | 1 | 72.6 | 95.6 | 24 / 35 | 6311 |
| 3 | 1 | 72.8 | 96.2 | 30 / 35 | 5996 |
| 4 | 1 | 72.4 | 95.6 | 26 / 35 | 6064 |
| 5 | 1 | 71.6 | 94.3 | 27 / 35 | 5726 |
| 6 | 1 | 71.5 | 94.3 | 24 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 97 | 89% |
| mld.Infinity 2.2 | 61 | 61% |
| krillr.mini.JointStrike 2.0.0 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 90% |
| erdnis.Rover 0.3 | 7 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 29 | 50% | 18 |
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 29% | 113 |
| krillr.mini.JointStrike 2.0.0 | 5 | 9% | 27 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 17 |
| erdnis.Rover 0.3 | 2 | 3% | 18 |
| pbg.R2D2 1.0 | 1 | 2% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.7 | 105 / 210 | 2.20 | 19.2% | 34845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.2% | 105 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.8% | 10 |
| fwb.Nine 1.0.1 | 3.7 | 11.4% | 32 |
| catcat20.Rabbit 0.001 | 4.7 | 10.9% | 24 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 7.9% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 15 / 35 | 5739 |
| 2 | 1 | 70.1 | 87.6 | 21 / 35 | 6051 |
| 3 | 1 | 70.0 | 90.2 | 19 / 35 | 6021 |
| 4 | 1 | 69.4 | 88.6 | 18 / 35 | 5731 |
| 5 | 1 | 67.9 | 83.5 | 16 / 35 | 5465 |
| 6 | 1 | 68.7 | 84.4 | 16 / 35 | 5838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 63 | 78% |
| catcat20.Rabbit 0.001 | 39 | 67% |
| fwb.Nine 1.0.1 | 30 | 43% |
| nz.jdc.nano.GridFu 1.0 | 10 | 80% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 32% | 80 |
| fwb.Nine 1.0.1 | 33 | 31% | 31 |
| catcat20.Rabbit 0.001 | 17 | 16% | 41 |
| nz.jdc.nano.GridFu 1.0 | 12 | 11% | 28 |
| bayen.nut.Squirrel 1.615 | 8 | 7% | 17 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.2 | 110 / 210 | 1.79 | 20.4% | 37509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.4% | 110 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 86 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 4 |
| eld.Hmm 1.0 | 5.2 | 8.6% | 7 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.0% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.8 | 4.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.7 | 20 / 35 | 6442 |
| 2 | 1 | 70.7 | 90.8 | 19 / 35 | 5904 |
| 3 | 1 | 70.1 | 90.2 | 14 / 35 | 6226 |
| 4 | 1 | 71.3 | 92.4 | 22 / 35 | 5963 |
| 5 | 1 | 72.2 | 91.4 | 20 / 35 | 6918 |
| 6 | 1 | 70.3 | 89.8 | 15 / 35 | 6056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 54% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 15 | 93% |
| eld.Hmm 1.0 | 8 | 75% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 69 | 68% | 106 |
| dummy.mini.Scimitar 1.01 | 18 | 18% | 63 |
| cf.RiO.RiOx 4.2.1 | 11 | 11% | 20 |
| eld.Hmm 1.0 | 3 | 3% | 19 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.5 | 91 / 210 | 2.40 | 18.2% | 32540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.2 | 18.2% | 91 |
| pe.SandboxDT 2.71m | 1.8 | 16.7% | 66 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 29 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.3% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 2 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.0 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 12 / 35 | 5724 |
| 2 | 1 | 67.7 | 81.9 | 13 / 35 | 5174 |
| 3 | 1 | 68.1 | 83.5 | 16 / 35 | 5521 |
| 4 | 2 | 68.1 | 83.5 | 14 / 35 | 5329 |
| 5 | 1 | 68.2 | 84.4 | 16 / 35 | 5018 |
| 6 | 1 | 70.6 | 89.8 | 20 / 35 | 5774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 58% |
| kvk.HebusLeTroll 0.35 | 33 | 73% |
| jlm.javaDisturbance 0.59 | 33 | 73% |
| bigpete.Stewie 1.0 | 8 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 50% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 37% | 75 |
| jlm.javaDisturbance 0.59 | 35 | 29% | 61 |
| kvk.HebusLeTroll 0.35 | 29 | 24% | 52 |
| bigpete.Stewie 1.0 | 8 | 7% | 18 |
| yk.JahRoslav 1.1 | 2 | 2% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 0 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.7 | 128 / 210 | 1.75 | 20.2% | 34132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.2% | 128 |
| pe.SandboxLump 1.52 | 2.0 | 17.8% | 58 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 6.8 | 8.0% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.3 | 24 / 35 | 5954 |
| 2 | 1 | 70.5 | 90.8 | 18 / 35 | 5598 |
| 3 | 1 | 71.1 | 91.1 | 22 / 35 | 5718 |
| 4 | 1 | 71.2 | 89.8 | 20 / 35 | 5753 |
| 5 | 1 | 71.7 | 93.0 | 26 / 35 | 5638 |
| 6 | 1 | 70.9 | 91.1 | 18 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 67% |
| cre.Karolos 0.32 | 32 | 84% |
| stelo.AreaTargetingBot 1.1 | 14 | 86% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| cw.megas.Blade 0.8 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 57 | 70% | 123 |
| cre.Karolos 0.32 | 11 | 13% | 37 |
| stelo.AreaTargetingBot 1.1 | 6 | 7% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 5% | 9 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 11 |
| cw.megas.Blade 0.8 | 1 | 1% | 6 |

## Melee bench: F24

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.0 | 78 / 210 | 2.98 | 16.2% | 25281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 16.2% | 78 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.5% | 32 |
| florent.XSeries.X2 0.12 | 3.0 | 13.8% | 42 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 36 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.3% | 13 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.9% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.3% | 0 |
| evd.X1 0.01 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.9 | 16 / 35 | 4210 |
| 2 | 1 | 63.3 | 72.4 | 10 / 35 | 4339 |
| 3 | 1 | 63.7 | 75.6 | 10 / 35 | 4115 |
| 4 | 1 | 64.8 | 77.8 | 14 / 35 | 4231 |
| 5 | 1 | 65.8 | 80.0 | 17 / 35 | 4248 |
| 6 | 1 | 65.3 | 80.6 | 11 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 74% |
| davidalves.Phoenix 0.54 | 32 | 63% |
| florent.XSeries.X2 0.12 | 23 | 52% |
| pedersen.Ugluk 1.1.1 | 10 | 80% |
| stelo.SoJNanoMelee 1.1 | 9 | 89% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| oog.melee.Corsair 1.0 | 3 | 67% |

Hadur died in 134 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 37 | 28% | 53 |
| rz.GlowBlowMelee 1.4 | 28 | 21% | 50 |
| davidalves.Phoenix 0.54 | 27 | 20% | 41 |
| pedersen.Ugluk 1.1.1 | 23 | 17% | 29 |
| oog.melee.Corsair 1.0 | 8 | 6% | 13 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 12 |
| evd.X1 0.01 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 7 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.3 | 139 / 210 | 2.14 | 19.2% | 28412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.2% | 139 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.6% | 16 |
| jdw.Hurricane 1.4 | 3.7 | 11.7% | 17 |
| ds.Oo 2.2 | 5.0 | 9.3% | 8 |
| gre.svman4.Morfeas 1.4.1 | 6.2 | 8.1% | 7 |
| adt.Ar2 1.1 | 7.3 | 6.9% | 1 |
| awesomeness.Elite 1.0 | 7.5 | 6.6% | 0 |
| gjr.Cephalosporin 0.1 | 9.2 | 6.0% | 0 |
| amk.ChumbaMini 0.2 | 9.8 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.1 | 22 / 35 | 4718 |
| 2 | 1 | 69.8 | 88.3 | 26 / 35 | 4864 |
| 3 | 1 | 68.6 | 86.3 | 19 / 35 | 4841 |
| 4 | 1 | 70.2 | 90.5 | 26 / 35 | 4801 |
| 5 | 1 | 68.1 | 86.3 | 23 / 35 | 4454 |
| 6 | 1 | 69.2 | 88.3 | 23 / 35 | 4734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 88% |
| voidious.mini.BrokenSword 2.0.3 | 49 | 92% |
| jdw.Hurricane 1.4 | 30 | 90% |
| ds.Oo 2.2 | 12 | 83% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 38% | 70 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 20% | 56 |
| jdw.Hurricane 1.4 | 12 | 17% | 30 |
| ds.Oo 2.2 | 6 | 8% | 15 |
| gre.svman4.Morfeas 1.4.1 | 3 | 4% | 10 |
| adt.Ar2 1.1 | 3 | 4% | 5 |
| awesomeness.Elite 1.0 | 2 | 3% | 12 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 5 |
| amk.ChumbaMini 0.2 | 2 | 3% | 4 |

## Melee bench: F26

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.8 | 123 / 210 | 1.91 | 20.3% | 38746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.3% | 123 |
| ak.Fermat 2.0 | 2.2 | 14.7% | 34 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 29 |
| lrem.Spectre 0.4.4 | 3.5 | 12.7% | 17 |
| js.PinBall 1.6 | 5.2 | 10.5% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.0% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 7.3 | 7.4% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.5 | 7.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 16 / 35 | 6252 |
| 2 | 1 | 72.3 | 93.7 | 24 / 35 | 6662 |
| 3 | 1 | 72.2 | 93.0 | 23 / 35 | 6741 |
| 4 | 1 | 71.0 | 88.6 | 23 / 35 | 6419 |
| 5 | 1 | 70.8 | 88.3 | 20 / 35 | 6427 |
| 6 | 1 | 70.0 | 87.3 | 17 / 35 | 6245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 75% |
| lrem.Spectre 0.4.4 | 45 | 78% |
| shu.nitro.LENIN .T34 | 36 | 78% |
| js.PinBall 1.6 | 9 | 78% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 30% | 60 |
| shu.nitro.LENIN .T34 | 24 | 28% | 63 |
| lrem.Spectre 0.4.4 | 17 | 20% | 42 |
| js.PinBall 1.6 | 9 | 10% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 9 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 3 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.2 | 124 / 210 | 2.24 | 19.0% | 31362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.0% | 124 |
| wee.Gem 1.8.4 | 2.7 | 12.3% | 34 |
| mk.Alpha 0.2.1 | 2.8 | 12.2% | 24 |
| EH.Eagle 1.0.6 | 4.3 | 11.3% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.8% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.2% | 3 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.3% | 2 |
| joe.ADinosaur 1.0 | 7.0 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.6% | 1 |
| cs.Grudge 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.3 | 27 / 35 | 5349 |
| 2 | 1 | 71.3 | 86.3 | 23 / 35 | 6437 |
| 3 | 1 | 66.8 | 83.5 | 21 / 35 | 4658 |
| 4 | 1 | 68.9 | 81.9 | 18 / 35 | 5663 |
| 5 | 1 | 67.9 | 87.9 | 19 / 35 | 4622 |
| 6 | 1 | 66.5 | 83.5 | 16 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 51 | 71% |
| mk.Alpha 0.2.1 | 49 | 76% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 88% |
| EH.Eagle 1.0.6 | 13 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 67% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 21 | 24% | 61 |
| mk.Alpha 0.2.1 | 20 | 23% | 51 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 20% | 39 |
| throxbot.ThroxBot 0.1 | 10 | 12% | 14 |
| joe.ADinosaur 1.0 | 8 | 9% | 11 |
| EH.Eagle 1.0.6 | 5 | 6% | 21 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 5 |

## Melee bench: F28

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.3 | 130 / 210 | 1.87 | 19.2% | 28855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.2% | 130 |
| kid.test.NightFox .2 | 2.0 | 16.0% | 47 |
| uji.Antique 1.0 | 3.7 | 11.2% | 12 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.9% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.5% | 3 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.3% | 4 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.6% | 3 |
| stelo.PianistNano 1.2 | 8.8 | 5.4% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.5% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 20 / 35 | 4736 |
| 2 | 1 | 69.5 | 92.1 | 23 / 35 | 4765 |
| 3 | 1 | 69.5 | 89.5 | 23 / 35 | 5182 |
| 4 | 1 | 69.1 | 92.1 | 20 / 35 | 4679 |
| 5 | 1 | 70.4 | 93.7 | 27 / 35 | 4797 |
| 6 | 1 | 67.4 | 84.4 | 17 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 103 | 73% |
| uji.Antique 1.0 | 26 | 88% |
| qohnil.blot.BlotBot 3.61 | 15 | 67% |
| pfvicm.Sobieski 7.2.3b | 12 | 92% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 46 | 56% | 109 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 17 |
| qohnil.blot.BlotBot 3.61 | 10 | 12% | 25 |
| uji.Antique 1.0 | 7 | 9% | 33 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| stelo.Lifestealer 1.0 | 2 | 2% | 5 |
| amk.ChumbaWumba 0.3 | 1 | 1% | 6 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.3 | 100 / 210 | 2.50 | 18.4% | 30404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.2 | 18.4% | 100 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 14.9% | 46 |
| deewiant.Anomaly 0.2 | 2.7 | 14.9% | 45 |
| myl.micro.Troodon 1.10 | 4.0 | 12.3% | 8 |
| jok.PheonixM 0.1.2 | 5.2 | 10.2% | 7 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 6.1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.9% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 78.4 | 9 / 35 | 4938 |
| 2 | 1 | 68.5 | 83.5 | 19 / 35 | 4994 |
| 3 | 1 | 70.9 | 88.6 | 23 / 35 | 5547 |
| 4 | 1 | 66.2 | 76.8 | 15 / 35 | 4794 |
| 5 | 1 | 69.2 | 87.3 | 18 / 35 | 5095 |
| 6 | 1 | 68.8 | 85.4 | 16 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 81% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 58% |
| myl.micro.Troodon 1.10 | 10 | 90% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| jangs.ns51 1.0 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 39% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 29% | 55 |
| myl.micro.Troodon 1.10 | 14 | 13% | 25 |
| jok.PheonixM 0.1.2 | 12 | 11% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 74.3 | 48 / 210 | 3.31 | 15.0% | 24184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.3 | 15.0% | 48 |
| catcat20.Matcha 0.006 | 2.7 | 13.6% | 47 |
| darkcanuck.B26354 1.06 | 2.8 | 13.9% | 53 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.1% | 29 |
| oog.melee.Capulet 1.2 | 4.5 | 13.1% | 26 |
| intruder.PrairieWolf 2.61 | 7.2 | 7.5% | 3 |
| ntc.Opposite 1.5 | 7.2 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 7.3 | 7.2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.5% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 78.7 | 10 / 35 | 4226 |
| 2 | 2 | 61.8 | 71.7 | 6 / 35 | 3832 |
| 3 | 2 | 62.8 | 74.3 | 8 / 35 | 4031 |
| 4 | 1 | 62.8 | 74.3 | 8 / 35 | 3934 |
| 5 | 1 | 63.5 | 74.6 | 8 / 35 | 4278 |
| 6 | 1 | 62.3 | 72.1 | 8 / 35 | 3883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 21 | 52% |
| stelo.PastFuture 2.3.2 | 20 | 65% |
| catcat20.Matcha 0.006 | 19 | 42% |
| oog.melee.Capulet 1.2 | 17 | 59% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 40 | 24% | 55 |
| darkcanuck.B26354 1.06 | 34 | 21% | 42 |
| catcat20.Matcha 0.006 | 30 | 18% | 40 |
| oog.melee.Capulet 1.2 | 28 | 17% | 35 |
| ntc.Opposite 1.5 | 10 | 6% | 10 |
| tripphippy.Alice 1.1 | 8 | 5% | 10 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 8 |

## Melee bench: F31

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.1 | 45 / 210 | 3.33 | 14.7% | 22180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 102 |
| hadur117.mini.DeisePTB 0.5 | 2.2 | 14.7% | 45 |
| gh.mini.Griezel 0.2 | 2.8 | 13.8% | 44 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.4% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.4% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 72.7 | 8 / 35 | 3823 |
| 2 | 2 | 63.6 | 77.8 | 10 / 35 | 3685 |
| 3 | 2 | 60.9 | 69.2 | 6 / 35 | 3532 |
| 4 | 2 | 63.6 | 75.9 | 10 / 35 | 3697 |
| 5 | 3 | 60.8 | 71.4 | 2 / 35 | 3351 |
| 6 | 2 | 64.4 | 77.5 | 9 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 42% |
| gh.mini.Griezel 0.2 | 28 | 43% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| d414.nano.Quantum 1.0.0 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 35% | 79 |
| gh.mini.Griezel 0.2 | 48 | 29% | 59 |
| spinnercat.micro.Tyger 0.1 | 23 | 14% | 28 |
| d414.nano.Quantum 1.0.0 | 22 | 13% | 27 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| timmit.nano.TimDog 0.33 | 1 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.3 | 112 / 210 | 1.96 | 19.0% | 31513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.0% | 112 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.4% | 63 |
| apc.botM 3.0 | 3.3 | 12.4% | 23 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 1 |
| vjik.UnViolation 1.1 | 5.5 | 9.0% | 8 |
| bayen.UbaMicro 1.4 | 6.0 | 8.1% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.0% | 1 |
| conscience.Electron 1.3g | 8.5 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.8 | 18 / 35 | 5642 |
| 2 | 1 | 68.0 | 87.9 | 13 / 35 | 5173 |
| 3 | 1 | 68.6 | 89.5 | 21 / 35 | 4823 |
| 4 | 1 | 67.7 | 86.3 | 20 / 35 | 4828 |
| 5 | 1 | 68.9 | 90.5 | 18 / 35 | 5367 |
| 6 | 1 | 69.9 | 90.8 | 22 / 35 | 5680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 87 | 46% |
| lxx.ConceptA 0.8 | 29 | 100% |
| apc.botM 3.0 | 29 | 59% |
| donjezza.Jezza 1.0 | 9 | 100% |
| vjik.UnViolation 1.1 | 6 | 67% |
| panzer.Panzer 0.2 | 6 | 100% |
| bayen.UbaMicro 1.4 | 4 | 50% |
| yk.JahMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 58% | 109 |
| apc.botM 3.0 | 16 | 16% | 35 |
| lxx.ConceptA 0.8 | 10 | 10% | 19 |
| vjik.UnViolation 1.1 | 5 | 5% | 14 |
| bayen.UbaMicro 1.4 | 4 | 4% | 15 |
| panzer.Panzer 0.2 | 4 | 4% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
| yk.JahMicro 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.6 | 117 / 210 | 2.39 | 18.7% | 30544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.7% | 117 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.3% | 31 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 8 |
| labg.Cataclysm 2.05 | 4.8 | 10.1% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.5% | 5 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.9% | 2 |
| sanja.First 0.1 | 9.2 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 18 / 35 | 5125 |
| 2 | 1 | 67.2 | 80.3 | 17 / 35 | 4828 |
| 3 | 1 | 68.4 | 85.1 | 17 / 35 | 4814 |
| 4 | 1 | 69.8 | 86.3 | 22 / 35 | 5425 |
| 5 | 1 | 67.2 | 79.7 | 18 / 35 | 4884 |
| 6 | 1 | 70.8 | 89.8 | 25 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 76% |
| gre.svman4.Leonidas 1.3.2 | 25 | 96% |
| labg.Cataclysm 2.05 | 10 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 43% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 25% | 54 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 11% | 17 |
| labg.Cataclysm 2.05 | 7 | 8% | 14 |
| gre.svman4.Leonidas 1.3.2 | 6 | 6% | 29 |
| baal.nano.N 1.42 | 4 | 4% | 6 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 70 / 210 | 2.47 | 17.6% | 31691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.7 | 17.6% | 70 |
| stelo.Spread 0.9 | 2.2 | 17.0% | 82 |
| kid.Gladiator .7.2 | 2.2 | 16.5% | 46 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 8 |
| tcf.Reach 3 | 4.7 | 10.7% | 1 |
| cli.Dancer 1.1 | 5.8 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.3 | 9 / 35 | 4815 |
| 2 | 1 | 70.3 | 88.9 | 14 / 35 | 5945 |
| 3 | 2 | 67.5 | 84.1 | 10 / 35 | 5019 |
| 4 | 1 | 69.4 | 87.9 | 15 / 35 | 5434 |
| 5 | 1 | 69.8 | 86.0 | 15 / 35 | 6043 |
| 6 | 3 | 64.3 | 73.7 | 7 / 35 | 4435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 72 | 42% |
| kid.Gladiator .7.2 | 55 | 60% |
| jcs.Seth 1.8 | 5 | 80% |
| cli.Dancer 1.1 | 1 | 100% |
| tcf.Reach 3 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 76 | 54% | 106 |
| kid.Gladiator .7.2 | 48 | 34% | 71 |
| jcs.Seth 1.8 | 6 | 4% | 13 |
| tcf.Reach 3 | 6 | 4% | 12 |
| ratosh.Wesco 1.4 | 4 | 3% | 7 |
| cli.Dancer 1.1 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.2 | 29 / 210 | 3.05 | 14.8% | 21753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 139 |
| hadur117.mini.DeisePTB 0.5 | 2.0 | 14.8% | 29 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.4% | 26 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 9 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.5% | 1 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.8 | 4 / 35 | 3753 |
| 2 | 2 | 62.5 | 76.5 | 7 / 35 | 3308 |
| 3 | 2 | 64.2 | 81.6 | 5 / 35 | 3843 |
| 4 | 2 | 63.9 | 80.3 | 5 / 35 | 3747 |
| 5 | 2 | 62.0 | 73.0 | 4 / 35 | 3668 |
| 6 | 2 | 62.3 | 75.2 | 4 / 35 | 3434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 77 | 16% |
| gh.mini.Gruwel 0.9 | 12 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 57% |
| rz.HawkOnFire 0.1 | 5 | 40% |
| myl.nano.KomoriNinja 1.1 | 3 | 67% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 90 | 50% | 102 |
| gh.mini.Gruwel 0.9 | 32 | 18% | 40 |
| rz.HawkOnFire 0.1 | 28 | 15% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 10% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 6 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.3 | 175 / 210 | 1.51 | 21.7% | 35532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 21.7% | 175 |
| alpha.RainingFire 1.0 | 2.5 | 12.2% | 11 |
| bzdp.Pansy 2.1 | 3.0 | 11.6% | 5 |
| mz.Cork 0.1 | 4.2 | 11.2% | 5 |
| bvh.micro.Freya 0.3 | 5.0 | 10.6% | 5 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.5% | 3 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.3% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 4.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.0 | 30 / 35 | 5903 |
| 2 | 1 | 71.5 | 93.0 | 27 / 35 | 5888 |
| 3 | 1 | 72.4 | 96.5 | 31 / 35 | 5904 |
| 4 | 1 | 72.6 | 95.9 | 30 / 35 | 5966 |
| 5 | 1 | 73.6 | 98.1 | 33 / 35 | 6182 |
| 6 | 1 | 70.5 | 88.6 | 24 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 96% |
| alpha.RainingFire 1.0 | 41 | 88% |
| bvh.micro.Freya 0.3 | 37 | 97% |
| mz.Cork 0.1 | 28 | 96% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 8 | 23% | 51 |
| bvh.micro.Freya 0.3 | 8 | 23% | 29 |
| bzdp.Pansy 2.1 | 7 | 20% | 60 |
| bvh.mini.Fenrir 0.39 | 7 | 20% | 14 |
| mz.Cork 0.1 | 2 | 6% | 26 |
| sample.MyFirstRobot 1.0 | 2 | 6% | 6 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 17 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |

## Melee bench: F37

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 164 / 210 | 1.90 | 20.0% | 35847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 20.0% | 164 |
| germ.TheMind .2 | 2.7 | 11.0% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.3% | 8 |
| EBBU.Sim2 1.02 | 4.7 | 9.3% | 5 |
| agrach.Dalek 1.0 | 5.3 | 9.0% | 5 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.5% | 5 |
| lmk.ACPFinal 0.1 | 7.0 | 8.3% | 3 |
| mb.Beast 0.1 | 7.8 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 2 |
| skm.Ryubot 1.0 | 9.0 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.9 | 25 / 35 | 6094 |
| 2 | 1 | 69.6 | 90.8 | 28 / 35 | 5924 |
| 3 | 1 | 69.8 | 91.1 | 28 / 35 | 6174 |
| 4 | 1 | 67.3 | 85.4 | 24 / 35 | 5376 |
| 5 | 1 | 70.6 | 93.0 | 30 / 35 | 6340 |
| 6 | 1 | 70.1 | 92.1 | 29 / 35 | 5939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 92% |
| stelo.UntouchableNano 1.3 | 30 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 90% |
| skm.Ryubot 1.0 | 20 | 100% |
| agrach.Dalek 1.0 | 16 | 94% |
| mb.Beast 0.1 | 14 | 100% |
| EBBU.Sim2 1.02 | 11 | 82% |
| lmk.ACPFinal 0.1 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 47 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 12 | 26% | 17 |
| germ.TheMind .2 | 9 | 19% | 41 |
| agrach.Dalek 1.0 | 6 | 13% | 38 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 11% | 31 |
| EBBU.Sim2 1.02 | 5 | 11% | 18 |
| lmk.ACPFinal 0.1 | 4 | 9% | 16 |
| stelo.UntouchableNano 1.3 | 3 | 6% | 25 |
| mb.Beast 0.1 | 2 | 4% | 18 |
| skm.Ryubot 1.0 | 1 | 2% | 3 |

## Melee bench: F38

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.4 | 88 / 210 | 2.58 | 17.3% | 28161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.5 | 17.3% | 88 |
| justin.Mallais 14.0 | 1.5 | 16.9% | 79 |
| bvh.mini.Freya 0.55 | 3.0 | 12.5% | 12 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.0% | 17 |
| cs.Wren 1.0 | 5.7 | 10.1% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 9.7% | 3 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.7% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.0% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.0 | 17 / 35 | 5010 |
| 2 | 1 | 68.9 | 87.6 | 22 / 35 | 4893 |
| 3 | 2 | 66.9 | 83.5 | 11 / 35 | 4708 |
| 4 | 2 | 65.2 | 77.5 | 11 / 35 | 4583 |
| 5 | 2 | 65.2 | 77.5 | 12 / 35 | 4525 |
| 6 | 1 | 66.8 | 82.5 | 15 / 35 | 4442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 70 | 66% |
| bvh.mini.Freya 0.55 | 17 | 88% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| cs.Wren 1.0 | 6 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| matt.UnderDark3 2.4.34 | 2 | 50% |

Hadur died in 124 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 44% | 101 |
| bts.mega.Gnarly 1.4 | 19 | 15% | 31 |
| cs.Wren 1.0 | 18 | 15% | 22 |
| bvh.mini.Freya 0.55 | 16 | 13% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 6% | 18 |
| kdf.KoulDestroyer 1.0 | 6 | 5% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.5 | 100 / 210 | 2.21 | 18.5% | 32148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 18.5% | 100 |
| bvh.fry.Freya 0.82 | 2.3 | 14.6% | 24 |
| az.Ololobot 0.2.4 | 2.7 | 13.8% | 56 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.0% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.1% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.4% | 1 |
| gimp.GimpBot 0.1 | 7.5 | 7.2% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 16 / 35 | 5740 |
| 2 | 1 | 67.7 | 87.6 | 16 / 35 | 5016 |
| 3 | 1 | 66.7 | 81.9 | 13 / 35 | 5047 |
| 4 | 1 | 67.8 | 84.1 | 14 / 35 | 5546 |
| 5 | 1 | 69.5 | 90.5 | 20 / 35 | 5419 |
| 6 | 1 | 68.4 | 86.7 | 21 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 52% |
| catcat20.Lambda 0.024 | 44 | 75% |
| bvh.fry.Freya 0.82 | 33 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 90% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 42 | 38% | 71 |
| bvh.fry.Freya 0.82 | 36 | 32% | 67 |
| catcat20.Lambda 0.024 | 20 | 18% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 5% | 8 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 4 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.8 | 111 / 210 | 2.28 | 19.1% | 33133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.1% | 111 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 52 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.9% | 20 |
| Polkwane.SmashMelee 1.0 | 4.3 | 11.4% | 18 |
| mz.AntiGrav 1.0 | 4.7 | 10.9% | 2 |
| stelo.Randomness 1.0 | 6.0 | 9.5% | 6 |
| alpha.BlackIce 1.0 | 7.0 | 8.2% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 5.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.9 | 16 / 35 | 5384 |
| 2 | 1 | 70.8 | 90.8 | 21 / 35 | 5627 |
| 3 | 1 | 68.3 | 82.2 | 16 / 35 | 5301 |
| 4 | 1 | 69.4 | 86.0 | 22 / 35 | 5361 |
| 5 | 1 | 69.5 | 86.0 | 19 / 35 | 5525 |
| 6 | 1 | 70.1 | 87.0 | 17 / 35 | 5935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 52 | 62% |
| kano.gamma.KanoGamma 1.8 | 29 | 79% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| stelo.Randomness 1.0 | 18 | 89% |
| mz.AntiGrav 1.0 | 15 | 100% |
| alpha.BlackIce 1.0 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 46 | 46% | 75 |
| kano.gamma.KanoGamma 1.8 | 18 | 18% | 48 |
| Polkwane.SmashMelee 1.0 | 15 | 15% | 26 |
| stelo.Randomness 1.0 | 8 | 8% | 24 |
| mz.AntiGrav 1.0 | 6 | 6% | 18 |
| alpha.BlackIce 1.0 | 2 | 2% | 8 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 4 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.9 | 85 / 210 | 2.54 | 17.1% | 26141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.9% | 91 |
| hadur117.mini.DeisePTB 0.5 | 1.5 | 17.1% | 85 |
| ary.Swarm 1.1 | 3.0 | 13.2% | 12 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.2% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.3% | 5 |
| shrub.Silver v048 | 6.3 | 8.2% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 0 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 84.1 | 13 / 35 | 4728 |
| 2 | 1 | 67.0 | 83.8 | 17 / 35 | 3988 |
| 3 | 1 | 67.7 | 85.1 | 17 / 35 | 4386 |
| 4 | 2 | 65.0 | 77.8 | 11 / 35 | 4457 |
| 5 | 2 | 67.0 | 83.2 | 14 / 35 | 4222 |
| 6 | 1 | 66.7 | 83.2 | 13 / 35 | 4360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 73 | 45% |
| lessonz.robocode.Oz 0.5.0 | 18 | 83% |
| ary.Swarm 1.1 | 17 | 88% |
| simonton.nano.MeleeSeed 1.8 | 15 | 93% |
| shrub.Silver v048 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 61 | 48% | 96 |
| ary.Swarm 1.1 | 29 | 23% | 48 |
| lessonz.robocode.Oz 0.5.0 | 19 | 15% | 26 |
| simonton.nano.MeleeSeed 1.8 | 8 | 6% | 20 |
| shrub.Silver v048 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 84 / 210 | 2.43 | 18.0% | 32556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.2 | 18.0% | 84 |
| wompi.Wallaby 5.1 | 1.8 | 16.2% | 69 |
| ara.Shera 0.88 | 3.3 | 13.9% | 38 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.4% | 16 |
| amz.NanoClone 1.41 | 5.2 | 8.8% | 0 |
| maribo.IotaCT 1.1 | 6.3 | 7.0% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.3% | 3 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 13 / 35 | 5404 |
| 2 | 1 | 67.9 | 84.8 | 13 / 35 | 5452 |
| 3 | 1 | 68.7 | 87.0 | 14 / 35 | 5815 |
| 4 | 1 | 67.2 | 81.3 | 16 / 35 | 5081 |
| 5 | 2 | 66.3 | 80.0 | 9 / 35 | 5339 |
| 6 | 1 | 69.0 | 87.3 | 19 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 44 | 64% |
| maribo.mini.MiniQuester 0.1 | 35 | 83% |
| ara.Shera 0.88 | 34 | 59% |
| dsw.StaticD 1.0 | 6 | 83% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 37% | 77 |
| ara.Shera 0.88 | 42 | 33% | 61 |
| maribo.mini.MiniQuester 0.1 | 25 | 20% | 50 |
| amz.NanoClone 1.41 | 7 | 6% | 9 |
| dsw.StaticD 1.0 | 4 | 3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.8 | 31 / 210 | 3.09 | 15.3% | 25052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 153 |
| hadur117.mini.DeisePTB 0.5 | 2.0 | 15.3% | 31 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.0% | 2 |
| mz.NanoGod 2.02 | 7.0 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.3 | 7 / 35 | 3984 |
| 2 | 2 | 66.6 | 80.0 | 10 / 35 | 4567 |
| 3 | 2 | 65.0 | 76.8 | 2 / 35 | 4358 |
| 4 | 2 | 62.2 | 71.4 | 1 / 35 | 3647 |
| 5 | 2 | 66.5 | 81.3 | 7 / 35 | 4237 |
| 6 | 2 | 65.5 | 78.1 | 4 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 22% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| brainfade.melee.Dusk 0.44 | 4 | 25% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 180 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 116 | 64% | 135 |
| brainfade.melee.Dusk 0.44 | 19 | 11% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 19 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 16 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 5 | 3% | 7 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.9 | 103 / 210 | 2.27 | 19.0% | 33397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.0% | 103 |
| stelo.Liblix 0.3.1 | 2.2 | 15.9% | 63 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 33 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.3% | 0 |
| disan.Chair 2.2.0 | 6.7 | 7.4% | 1 |
| jwirde.Gort 2.0 | 7.0 | 7.1% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 4.9% | 1 |
| sample.Crazy 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 16 / 35 | 5309 |
| 2 | 1 | 70.5 | 89.5 | 20 / 35 | 5998 |
| 3 | 1 | 68.9 | 86.0 | 16 / 35 | 5428 |
| 4 | 1 | 69.8 | 87.6 | 18 / 35 | 5933 |
| 5 | 1 | 67.6 | 80.3 | 15 / 35 | 5292 |
| 6 | 1 | 68.6 | 83.8 | 18 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 64% |
| tzu.TheArtOfWar 1.2 | 41 | 71% |
| wompi.Quokka 1.6 | 13 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| disan.Chair 2.2.0 | 4 | 75% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 57 | 53% | 107 |
| tzu.TheArtOfWar 1.2 | 29 | 27% | 63 |
| wompi.Quokka 1.6 | 9 | 8% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 11 |
| disan.Chair 2.2.0 | 4 | 4% | 5 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| jwirde.Gort 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.0 | 60 / 210 | 2.08 | 19.8% | 38224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTB 0.5 | 1.0 | 19.8% | 60 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 14.2% | 136 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 4 |
| sul.Lunar 1.1 | 4.5 | 10.4% | 5 |
| myl.nano.Graviton 1.10 | 4.5 | 10.4% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.4% | 2 |
| fm.claire 1.7 | 7.2 | 8.2% | 0 |
| hvilela.HVilela 0.9 | 7.3 | 7.6% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.9 | 5 / 35 | 6397 |
| 2 | 1 | 70.0 | 89.2 | 9 / 35 | 6344 |
| 3 | 1 | 70.6 | 89.8 | 11 / 35 | 6626 |
| 4 | 1 | 70.0 | 89.2 | 10 / 35 | 6247 |
| 5 | 1 | 70.3 | 89.5 | 13 / 35 | 6139 |
| 6 | 1 | 70.0 | 88.3 | 12 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 141 | 18% |
| jje.BagPuss 1.2 | 13 | 92% |
| myl.nano.Graviton 1.10 | 8 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| sul.Lunar 1.1 | 7 | 86% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 119 | 79% | 0 |
| myl.nano.Graviton 1.10 | 11 | 7% | 47 |
| jje.BagPuss 1.2 | 8 | 5% | 59 |
| fm.claire 1.7 | 4 | 3% | 15 |
| sul.Lunar 1.1 | 3 | 2% | 43 |
| hvilela.HVilela 0.9 | 3 | 2% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 1% | 20 |
| wit.Deep7 2.0 | 0 | 0% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeisePTB 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.1 | 53 / 210 | 2.70 | 16.3% | 26704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 72 |
| hadur117.mini.DeisePTB 0.5 | 2.3 | 16.3% | 53 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.1% | 78 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 2 |
| cx.Princess 1.0 | 5.3 | 9.7% | 5 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 6.3 | 7.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 13 / 35 | 4611 |
| 2 | 2 | 65.4 | 81.6 | 8 / 35 | 4204 |
| 3 | 3 | 66.0 | 81.9 | 6 / 35 | 4724 |
| 4 | 3 | 65.7 | 81.0 | 9 / 35 | 4522 |
| 5 | 3 | 63.7 | 76.8 | 7 / 35 | 4173 |
| 6 | 2 | 65.9 | 82.9 | 10 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 46% |
| rsalesc.melee.Medina 0.4.5 | 38 | 32% |
| cx.Princess 1.0 | 13 | 85% |
| mz.MicroSheep 1.0 | 4 | 75% |

Hadur died in 158 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 72 | 46% | 102 |
| rsalesc.melee.Medina 0.4.5 | 54 | 34% | 66 |
| arthord.NanoSatanMelee Beta | 9 | 6% | 9 |
| sadoner.killer 0.2 | 8 | 5% | 8 |
| mz.MicroSheep 1.0 | 7 | 4% | 13 |
| cx.Princess 1.0 | 4 | 3% | 8 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
1 death(s) with no robot to name.

