# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 87.4 | 51 / 210 | 2.13 | 17.1% | 28843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 146 |
| hadur117.mini.DeisePT0 0.5 | 2.0 | 17.1% | 51 |
| sgp.JollyNinja 3.53 | 3.3 | 11.6% | 10 |
| mz.MicroGodMelee 1 | 4.5 | 10.8% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.4% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.3 | 6.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.7 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 85.1 | 6 / 35 | 4785 |
| 2 | 2 | 66.3 | 85.7 | 7 / 35 | 4533 |
| 3 | 2 | 66.5 | 86.7 | 7 / 35 | 4542 |
| 4 | 2 | 66.5 | 86.3 | 8 / 35 | 4472 |
| 5 | 2 | 68.3 | 91.1 | 9 / 35 | 5268 |
| 6 | 2 | 68.4 | 89.5 | 14 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 14% |
| lorneswork.Predator 1.0 | 8 | 100% |
| sgp.JollyNinja 3.53 | 8 | 88% |
| mz.MicroGodMelee 1 | 8 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 136 | 86% | 155 |
| sgp.JollyNinja 3.53 | 11 | 7% | 16 |
| lorneswork.Predator 1.0 | 4 | 3% | 11 |
| mz.MicroGodMelee 1 | 3 | 2% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 2% | 10 |
| adt.Ar2 1.0 | 1 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.8 | 108 / 210 | 2.28 | 18.3% | 28819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.3% | 108 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.0% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.2% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.1% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.5% | 1 |
| Noran.BitchingElk 0.054 | 6.7 | 8.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.0% | 2 |
| sch.Simone 0.3d | 8.0 | 6.9% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 5.8% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 19 / 35 | 5256 |
| 2 | 1 | 67.5 | 86.7 | 18 / 35 | 4657 |
| 3 | 1 | 67.0 | 82.5 | 13 / 35 | 4848 |
| 4 | 1 | 69.1 | 88.9 | 23 / 35 | 4961 |
| 5 | 1 | 67.7 | 87.0 | 19 / 35 | 4514 |
| 6 | 1 | 66.7 | 82.2 | 16 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 58 | 69% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 77% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 81% |
| Noran.BitchingElk 0.054 | 11 | 45% |
| sch.Simone 0.3d | 9 | 78% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 43% | 73 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 21% | 54 |
| Noran.BitchingElk 0.054 | 8 | 8% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 13 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 21 |
| sch.Simone 0.3d | 5 | 5% | 13 |
| stelo.PatternRobot 1.0 | 5 | 5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 155 / 210 | 1.68 | 20.3% | 37032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.3% | 155 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.6% | 13 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 11 |
| vuen.Cake 2.51 | 3.2 | 13.4% | 30 |
| urdos.URDOS 1.3 | 5.2 | 8.5% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.9 | 26 / 35 | 6366 |
| 2 | 1 | 70.7 | 91.1 | 24 / 35 | 6327 |
| 3 | 1 | 71.5 | 93.0 | 27 / 35 | 6660 |
| 4 | 1 | 70.6 | 92.7 | 29 / 35 | 5953 |
| 5 | 1 | 70.0 | 93.0 | 23 / 35 | 5737 |
| 6 | 1 | 70.0 | 90.2 | 26 / 35 | 5989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 78 | 71% |
| kawigi.nano.Lib 1.0 | 59 | 93% |
| radnor.DoctorBob 1.42 | 41 | 98% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 26 | 47% | 77 |
| kawigi.nano.Lib 1.0 | 9 | 16% | 64 |
| radnor.DoctorBob 1.42 | 9 | 16% | 42 |
| adt.Ar1 2.1 | 4 | 7% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 7% | 5 |
| urdos.URDOS 1.3 | 2 | 4% | 3 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.6 | 36 / 210 | 2.21 | 17.5% | 32954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 171 |
| hadur117.mini.DeisePT0 0.5 | 2.0 | 17.5% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.2% | 0 |
| josago.Jorgito 0.16 | 4.8 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.9% | 0 |
| css.Delitioner 0.11 | 6.7 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.0% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 89.2 | 7 / 35 | 5624 |
| 2 | 2 | 68.6 | 87.6 | 7 / 35 | 5533 |
| 3 | 2 | 67.6 | 85.4 | 6 / 35 | 5234 |
| 4 | 2 | 67.8 | 85.4 | 6 / 35 | 5436 |
| 5 | 2 | 67.5 | 83.8 | 3 / 35 | 5476 |
| 6 | 2 | 68.6 | 87.9 | 7 / 35 | 5651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 165 | 17% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| josago.Jorgito 0.16 | 2 | 100% |
| TNT.TNT 0.99.1 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 153 | 87% | 182 |
| apc.LeeroyJenkins2 1.0 | 16 | 9% | 19 |
| josago.Jorgito 0.16 | 3 | 2% | 5 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| TNT.TNT 0.99.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.1 | 31 / 210 | 3.24 | 14.1% | 20100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.9% | 113 |
| justin.DemonicRage 3.4 | 1.8 | 17.7% | 58 |
| hadur117.mini.DeisePT0 0.5 | 3.0 | 14.1% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 3 |
| ms.Ares 0.19 | 5.2 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.5% | 3 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 77.5 | 4 / 35 | 3031 |
| 2 | 3 | 63.2 | 77.1 | 5 / 35 | 3448 |
| 3 | 3 | 62.0 | 74.3 | 6 / 35 | 3319 |
| 4 | 3 | 61.0 | 70.2 | 5 / 35 | 3280 |
| 5 | 3 | 62.3 | 74.6 | 5 / 35 | 3347 |
| 6 | 3 | 63.3 | 77.1 | 6 / 35 | 3675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 32 | 22% |
| justin.DemonicRage 3.4 | 31 | 45% |
| wompi.Numbat 2.1 | 7 | 86% |
| ms.Ares 0.19 | 2 | 50% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 40% | 85 |
| justin.DemonicRage 3.4 | 64 | 36% | 76 |
| ms.Ares 0.19 | 17 | 9% | 19 |
| wompi.Numbat 2.1 | 12 | 7% | 14 |
| axeBots.HataMoto 3.09 | 8 | 4% | 10 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.5 | 122 / 210 | 2.22 | 18.2% | 27771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.2% | 122 |
| jekl.StoneGhost 0.7 | 2.3 | 15.0% | 23 |
| origin.SleepSiphon 1.7b | 2.8 | 13.7% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 25 |
| mld.Wisdom 1.0 | 5.0 | 10.0% | 2 |
| gg.Wolverine 2.0 | 6.2 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.8% | 3 |
| DBall.NUKE 0.1 | 8.0 | 6.3% | 0 |
| spinnercat.Omen 1.0 | 8.2 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.3 | 24 / 35 | 4562 |
| 2 | 1 | 67.9 | 86.3 | 19 / 35 | 4421 |
| 3 | 1 | 67.5 | 85.4 | 20 / 35 | 4865 |
| 4 | 1 | 67.1 | 83.2 | 18 / 35 | 4644 |
| 5 | 1 | 67.9 | 86.0 | 19 / 35 | 4624 |
| 6 | 1 | 68.9 | 90.5 | 22 / 35 | 4655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 53 | 87% |
| origin.SleepSiphon 1.7b | 51 | 84% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| gg.Wolverine 2.0 | 4 | 75% |
| mld.Wisdom 1.0 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 31 | 34% | 56 |
| origin.SleepSiphon 1.7b | 25 | 27% | 75 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 18% | 44 |
| mld.Wisdom 1.0 | 8 | 9% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 11 |
| gg.Wolverine 2.0 | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
4 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.1 | 136 / 210 | 1.53 | 20.1% | 33476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.1% | 136 |
| rtk.Tachikoma 1.0 | 2.3 | 16.8% | 29 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 17.0% | 38 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 3 |
| franzor.Lizt 1.3.1 | 4.7 | 10.2% | 4 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.2 | 23 / 35 | 5551 |
| 2 | 1 | 70.0 | 91.1 | 18 / 35 | 5088 |
| 3 | 1 | 72.9 | 96.8 | 25 / 35 | 6166 |
| 4 | 1 | 72.4 | 94.0 | 25 / 35 | 6045 |
| 5 | 1 | 71.3 | 94.3 | 23 / 35 | 5365 |
| 6 | 1 | 71.3 | 93.0 | 22 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 81% |
| rsalesc.melee.Monk 0.3.6c | 51 | 35% |
| oog.melee.CapuletDroid 1.1 | 31 | 97% |
| franzor.Lizt 1.3.1 | 6 | 67% |

Hadur died in 74 of 210 rounds, at a mean tick of 1404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 37 | 50% | 56 |
| rtk.Tachikoma 1.0 | 30 | 41% | 111 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 32 |
| exauge.GateKeeper 1.1.121g | 2 | 3% | 6 |
| franzor.Lizt 1.3.1 | 2 | 3% | 0 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.6 | 148 / 210 | 1.84 | 19.6% | 30059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.6% | 148 |
| tm.Yuugao 1.0 | 2.2 | 14.1% | 33 |
| shrub.Vapour v159 | 3.2 | 11.9% | 13 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.5% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.0% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 8.5% | 3 |
| m3thos.Eva00 1.1 | 7.2 | 8.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.8% | 0 |
| SHAM.WOW 1.4 | 8.7 | 6.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.5 | 27 / 35 | 4979 |
| 2 | 1 | 68.8 | 87.0 | 23 / 35 | 5111 |
| 3 | 1 | 69.2 | 91.4 | 20 / 35 | 4949 |
| 4 | 1 | 69.9 | 92.4 | 28 / 35 | 4891 |
| 5 | 1 | 68.1 | 86.7 | 22 / 35 | 4865 |
| 6 | 1 | 70.8 | 95.9 | 28 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 77 | 86% |
| shrub.Vapour v159 | 36 | 81% |
| Krabb.sliNk.Garm 0.9u | 24 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| com.spp.robocode.MostlyHarmless 010 | 9 | 89% |
| m3thos.Eva00 1.1 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 21 | 33% | 95 |
| shrub.Vapour v159 | 15 | 23% | 43 |
| Krabb.sliNk.Garm 0.9u | 8 | 13% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 11% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 6% | 12 |
| m3thos.Eva00 1.1 | 3 | 5% | 9 |
| zyx.nano.BacillusComma 1.0 | 3 | 5% | 4 |
| SHAM.WOW 1.4 | 2 | 3% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.4 | 71 / 210 | 2.86 | 16.2% | 24116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 93 |
| hadur117.mini.DeisePT0 0.5 | 1.8 | 16.2% | 71 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 20 |
| yagami.Tidus 0.11 | 4.2 | 11.0% | 2 |
| mc2.enemy.Original 0.9 | 5.5 | 9.4% | 9 |
| pedersen.Grishnakh 1.0 | 5.7 | 9.5% | 12 |
| dft.Calliope 5.6 | 6.7 | 7.5% | 3 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.1 | 19 / 35 | 3958 |
| 2 | 2 | 65.6 | 80.0 | 7 / 35 | 4288 |
| 3 | 2 | 65.4 | 81.3 | 13 / 35 | 4009 |
| 4 | 2 | 66.1 | 81.3 | 13 / 35 | 4052 |
| 5 | 2 | 62.6 | 72.4 | 9 / 35 | 3888 |
| 6 | 2 | 64.0 | 77.1 | 10 / 35 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 73 | 45% |
| kc.micro.Figment 1.0 | 18 | 83% |
| yagami.Tidus 0.11 | 11 | 100% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 76 | 54% | 105 |
| kc.micro.Figment 1.0 | 20 | 14% | 43 |
| yagami.Tidus 0.11 | 15 | 11% | 22 |
| pedersen.Grishnakh 1.0 | 13 | 9% | 15 |
| mc2.enemy.Original 0.9 | 10 | 7% | 18 |
| dft.Calliope 5.6 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
| robar.nano.Assertive_Melee 0.2 | 1 | 1% | 1 |
| step.nanoPri 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.5 | 165 / 210 | 1.58 | 19.9% | 31895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.9% | 165 |
| DTF.Kludgy 1.2b | 2.2 | 14.3% | 22 |
| ne.Chimera 1.2 | 3.5 | 12.7% | 5 |
| ejb.Polaris 1.0.1 | 3.5 | 12.7% | 8 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.4% | 6 |
| vStar.RAFzilla 2.15 | 5.8 | 9.5% | 2 |
| sam.Samspin 1.0 | 7.7 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.0 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 27 / 35 | 5401 |
| 2 | 1 | 70.8 | 96.2 | 29 / 35 | 5222 |
| 3 | 1 | 71.1 | 94.9 | 28 / 35 | 5652 |
| 4 | 1 | 69.9 | 92.7 | 26 / 35 | 5209 |
| 5 | 1 | 70.5 | 93.3 | 29 / 35 | 5319 |
| 6 | 1 | 69.7 | 92.4 | 26 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 83% |
| ejb.Polaris 1.0.1 | 58 | 95% |
| ne.Chimera 1.2 | 29 | 90% |
| tvv.micro.Antares 1.1.1 | 25 | 96% |
| vStar.RAFzilla 2.15 | 7 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 1 | 0% |

Hadur died in 45 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 38% | 68 |
| ejb.Polaris 1.0.1 | 8 | 18% | 58 |
| ne.Chimera 1.2 | 7 | 16% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 11% | 5 |
| kurios.DOSexe .9b | 3 | 7% | 14 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 18 |
| sam.Samspin 1.0 | 2 | 4% | 4 |
| vStar.RAFzilla 2.15 | 1 | 2% | 8 |

## Melee bench: F11

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.3 | 72 / 210 | 2.78 | 16.5% | 25636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.3% | 82 |
| hadur117.mini.DeisePT0 0.5 | 1.7 | 16.5% | 72 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.2% | 25 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 12 |
| rdt199.Warlord 0.73 | 5.2 | 9.6% | 10 |
| br2.MobyDickBot 1.6 | 6.0 | 8.6% | 5 |
| uji.YellohFellah 1.0 | 7.0 | 7.5% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 6.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 4.9% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.4 | 14 / 35 | 4393 |
| 2 | 2 | 65.5 | 82.2 | 13 / 35 | 4210 |
| 3 | 2 | 64.9 | 78.4 | 8 / 35 | 4417 |
| 4 | 2 | 63.8 | 77.1 | 10 / 35 | 3856 |
| 5 | 2 | 65.1 | 77.1 | 13 / 35 | 4361 |
| 6 | 1 | 66.3 | 82.2 | 14 / 35 | 4399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 56% |
| cx.mini.Nimrod 0.55 | 19 | 63% |
| rdt199.Warlord 0.73 | 13 | 54% |
| djc.DynaBot 0.1.1 | 10 | 90% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| uji.YellohFellah 1.0 | 4 | 75% |

Hadur died in 138 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 64 | 46% | 94 |
| cx.mini.Nimrod 0.55 | 32 | 23% | 45 |
| rdt199.Warlord 0.73 | 19 | 14% | 31 |
| djc.DynaBot 0.1.1 | 12 | 9% | 18 |
| br2.MobyDickBot 1.6 | 5 | 4% | 12 |
| uji.YellohFellah 1.0 | 3 | 2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 1 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.4 | 131 / 210 | 2.22 | 18.1% | 23835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.1% | 131 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.4% | 34 |
| darkcanuck.Leon 1.01 | 3.2 | 12.9% | 12 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 8 |
| jrm.Test0 1.0 | 6.5 | 7.9% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.5% | 0 |
| stuff.Vlad 0.1 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.0 | 22 / 35 | 3962 |
| 2 | 1 | 68.5 | 88.6 | 24 / 35 | 3967 |
| 3 | 1 | 67.8 | 88.6 | 23 / 35 | 3848 |
| 4 | 1 | 65.7 | 81.0 | 21 / 35 | 3878 |
| 5 | 1 | 67.3 | 86.3 | 19 / 35 | 3917 |
| 6 | 1 | 68.4 | 87.9 | 22 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 83% |
| darkcanuck.Leon 1.01 | 40 | 98% |
| nat.PallasHawk 1.0 | 39 | 90% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 23 | 29% | 56 |
| nat.PallasHawk 1.0 | 19 | 24% | 50 |
| brainfade.melee.Genghis 0.36 | 12 | 15% | 15 |
| darkcanuck.Leon 1.01 | 9 | 11% | 59 |
| jrm.Test0 1.0 | 6 | 8% | 9 |
| jp.Perpy 16.0 | 5 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |

## Melee bench: F13

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.2 | 73 / 210 | 2.33 | 16.6% | 25355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.1% | 91 |
| hadur117.mini.DeisePT0 0.5 | 2.2 | 16.6% | 73 |
| ags.Glacier 0.2.11 | 2.5 | 16.1% | 30 |
| shinh.Entangled 0.3 | 4.0 | 12.0% | 11 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.9% | 5 |
| apc.Colossus2 0.17 | 6.3 | 7.5% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.9 | 7 / 35 | 4095 |
| 2 | 1 | 66.8 | 88.3 | 15 / 35 | 4083 |
| 3 | 2 | 66.7 | 84.4 | 14 / 35 | 4243 |
| 4 | 2 | 66.3 | 83.8 | 12 / 35 | 4459 |
| 5 | 3 | 65.6 | 84.1 | 12 / 35 | 3958 |
| 6 | 2 | 67.8 | 88.6 | 13 / 35 | 4517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 79 | 38% |
| ags.Glacier 0.2.11 | 47 | 72% |
| shinh.Entangled 0.3 | 14 | 64% |

Hadur died in 137 of 210 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 47% | 89 |
| ags.Glacier 0.2.11 | 40 | 29% | 77 |
| shinh.Entangled 0.3 | 19 | 14% | 29 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 8 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.2 | 156 / 210 | 1.61 | 20.4% | 33962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.4% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.4% | 20 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.1% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 4.2 | 9.9% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 8.8% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 8.6% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 3 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 29 / 35 | 5443 |
| 2 | 1 | 70.8 | 93.3 | 27 / 35 | 5607 |
| 3 | 1 | 68.0 | 85.4 | 23 / 35 | 4877 |
| 4 | 1 | 72.4 | 96.8 | 28 / 35 | 6096 |
| 5 | 1 | 71.0 | 92.7 | 24 / 35 | 5937 |
| 6 | 1 | 72.1 | 96.2 | 25 / 35 | 6002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 92% |
| catcat20.shape.Theta 0.018 | 78 | 79% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 18 | 33% | 65 |
| simonton.micro.Sprout 1.1.3 | 17 | 31% | 90 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 13% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 9% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 9% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.8 | 110 / 210 | 2.46 | 18.1% | 30442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.1% | 110 |
| emp.Yngwie 1.11 | 2.5 | 13.6% | 56 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 10 |
| mld.DustBunny 3.8 | 3.8 | 12.4% | 7 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 3 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.4% | 22 |
| lambdaxy.TBot 0.1 | 7.2 | 6.2% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.6% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 15 / 35 | 4679 |
| 2 | 1 | 66.9 | 82.2 | 16 / 35 | 4864 |
| 3 | 1 | 69.5 | 87.6 | 19 / 35 | 5506 |
| 4 | 1 | 67.3 | 81.9 | 19 / 35 | 4846 |
| 5 | 1 | 69.1 | 85.1 | 21 / 35 | 5511 |
| 6 | 1 | 67.9 | 83.5 | 20 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 56% |
| mld.DustBunny 3.8 | 23 | 100% |
| kawigi.robot.Girl 1.2 | 22 | 91% |
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 40% | 77 |
| kawigi.micro.Shiz 1.1 | 17 | 17% | 37 |
| mld.DustBunny 3.8 | 13 | 13% | 40 |
| kawigi.robot.Girl 1.2 | 12 | 12% | 24 |
| cb.nano.Insomnia 1.0 | 9 | 9% | 15 |
| divineomega.TrialBot 0.003 | 5 | 5% | 9 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.4 | 102 / 210 | 2.22 | 18.8% | 32828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.3 | 18.8% | 102 |
| gh.Griezel 0.5.2 | 1.7 | 17.8% | 75 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.5% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 8.9% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.5% | 1 |
| asd.Cthulhu 1.3 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 2 |
| repositorio.NanoStep 1.0 | 9.3 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 19 / 35 | 5416 |
| 2 | 2 | 67.1 | 81.3 | 15 / 35 | 5098 |
| 3 | 1 | 69.8 | 89.5 | 20 / 35 | 5344 |
| 4 | 1 | 70.0 | 87.9 | 17 / 35 | 5799 |
| 5 | 2 | 67.2 | 80.0 | 9 / 35 | 5503 |
| 6 | 1 | 70.0 | 88.6 | 22 / 35 | 5668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 114 | 60% |
| techdude.forest.FlamingForest 1.1 | 19 | 63% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 66 | 61% | 137 |
| bvh.fnr.Fenrir 0.36l | 13 | 12% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 11% | 23 |
| techdude.forest.FlamingForest 1.1 | 8 | 7% | 18 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.9 | 97 / 210 | 2.45 | 17.9% | 30836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 17.9% | 97 |
| et.Predator 1.8 | 2.3 | 14.0% | 29 |
| cx.BlestPain 1.41 | 3.7 | 12.7% | 36 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.3% | 24 |
| nic.Nicator 2.4 | 4.7 | 11.5% | 15 |
| ahf.NanoAndrew .4 | 5.5 | 10.6% | 7 |
| maribo.melee.BMV 0.1 | 7.0 | 8.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.2% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.9 | 14 / 35 | 4857 |
| 2 | 1 | 64.8 | 76.5 | 10 / 35 | 4817 |
| 3 | 1 | 69.1 | 87.3 | 21 / 35 | 5397 |
| 4 | 1 | 69.0 | 87.6 | 17 / 35 | 5458 |
| 5 | 1 | 67.7 | 84.4 | 18 / 35 | 4770 |
| 6 | 1 | 69.0 | 84.4 | 17 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 56 | 82% |
| cx.BlestPain 1.41 | 30 | 47% |
| nic.Nicator 2.4 | 25 | 72% |
| oog.melee.Mercutio 1.0 | 23 | 65% |
| ahf.NanoAndrew .4 | 7 | 57% |

Hadur died in 113 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 30% | 51 |
| et.Predator 1.8 | 30 | 27% | 66 |
| oog.melee.Mercutio 1.0 | 16 | 14% | 36 |
| nic.Nicator 2.4 | 13 | 12% | 29 |
| ahf.NanoAndrew .4 | 12 | 11% | 19 |
| maribo.melee.BMV 0.1 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.8 | 135 / 210 | 1.91 | 18.9% | 26507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.9% | 135 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.8% | 36 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.5% | 15 |
| uji.DBH 1.1 | 3.7 | 11.2% | 11 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 2 |
| spinnercat.Robovirus 2.718 | 6.3 | 8.8% | 4 |
| sigterm.Sigterm 1.0 | 6.8 | 8.1% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.0% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 93.7 | 25 / 35 | 4446 |
| 2 | 1 | 67.8 | 87.3 | 22 / 35 | 4370 |
| 3 | 1 | 68.7 | 90.8 | 21 / 35 | 4607 |
| 4 | 1 | 68.4 | 88.9 | 21 / 35 | 4641 |
| 5 | 1 | 67.4 | 86.7 | 22 / 35 | 4246 |
| 6 | 1 | 68.4 | 91.7 | 24 / 35 | 4197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 73% |
| agd.Mooserwirt2 2.7 | 28 | 82% |
| uji.DBH 1.1 | 26 | 81% |
| sigterm.Sigterm 1.0 | 15 | 87% |
| ratosh.Nobo 0.21 | 9 | 89% |
| stelo.WangRobot 1.0 | 5 | 100% |
| spinnercat.Robovirus 2.718 | 5 | 60% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 43% | 87 |
| agd.Mooserwirt2 2.7 | 14 | 18% | 48 |
| uji.DBH 1.1 | 8 | 10% | 20 |
| ratosh.Nobo 0.21 | 7 | 9% | 12 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 8 |
| sigterm.Sigterm 1.0 | 3 | 4% | 14 |
| stelo.WangRobot 1.0 | 1 | 1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 95.2 | 178 / 210 | 1.43 | 21.3% | 34838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 21.3% | 178 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 12 |
| mld.Infinity 2.2 | 2.7 | 14.6% | 17 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.2% | 3 |
| erdnis.Rover 0.3 | 5.3 | 9.5% | 0 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.0% | 0 |
| pac.ABC 2.1 | 7.7 | 6.5% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 28 / 35 | 5408 |
| 2 | 1 | 73.0 | 97.5 | 31 / 35 | 6003 |
| 3 | 1 | 72.8 | 97.1 | 30 / 35 | 5781 |
| 4 | 1 | 72.6 | 94.6 | 30 / 35 | 5816 |
| 5 | 1 | 72.3 | 94.3 | 30 / 35 | 5730 |
| 6 | 1 | 72.9 | 96.2 | 29 / 35 | 6100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 98% |
| mld.Infinity 2.2 | 71 | 93% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| krillr.mini.JointStrike 2.0.0 | 7 | 71% |
| erdnis.Rover 0.3 | 2 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 15 | 47% | 34 |
| davidalves.net.DuelistMiniMelee 1.2 | 8 | 25% | 107 |
| krillr.mini.JointStrike 2.0.0 | 6 | 19% | 22 |
| erdnis.Rover 0.3 | 2 | 6% | 12 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.2 | 130 / 210 | 1.88 | 19.9% | 33869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.9% | 130 |
| trm.Wrekt 1.1.6.f | 2.0 | 14.9% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.6% | 11 |
| fwb.Nine 1.0.1 | 3.8 | 11.5% | 20 |
| catcat20.Rabbit 0.001 | 4.5 | 10.6% | 16 |
| bayen.nut.Squirrel 1.615 | 6.5 | 7.7% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 5.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.9 | 21 / 35 | 5864 |
| 2 | 1 | 69.5 | 88.3 | 20 / 35 | 5639 |
| 3 | 1 | 70.7 | 94.9 | 25 / 35 | 5417 |
| 4 | 1 | 69.1 | 88.3 | 19 / 35 | 5352 |
| 5 | 1 | 71.0 | 93.0 | 25 / 35 | 5703 |
| 6 | 1 | 69.9 | 87.9 | 20 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 77% |
| fwb.Nine 1.0.1 | 51 | 78% |
| catcat20.Rabbit 0.001 | 33 | 79% |
| nz.jdc.nano.GridFu 1.0 | 12 | 58% |
| bayen.nut.Squirrel 1.615 | 7 | 71% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1295. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 28 | 35% | 69 |
| fwb.Nine 1.0.1 | 19 | 24% | 23 |
| nz.jdc.nano.GridFu 1.0 | 15 | 19% | 40 |
| catcat20.Rabbit 0.001 | 11 | 14% | 42 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 15 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.1 | 132 / 210 | 1.71 | 20.0% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.0% | 132 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 62 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 3 |
| eld.Hmm 1.0 | 5.0 | 8.5% | 4 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.3 | 5.9% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 18 / 35 | 5349 |
| 2 | 1 | 70.4 | 92.7 | 24 / 35 | 5331 |
| 3 | 1 | 70.6 | 90.5 | 25 / 35 | 5508 |
| 4 | 1 | 70.6 | 92.7 | 20 / 35 | 5670 |
| 5 | 1 | 70.4 | 93.0 | 21 / 35 | 5373 |
| 6 | 1 | 72.1 | 96.2 | 24 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 119 | 64% |
| dummy.mini.Scimitar 1.01 | 39 | 87% |
| cf.RiO.RiOx 4.2.1 | 15 | 100% |
| eld.Hmm 1.0 | 6 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 64% | 106 |
| dummy.mini.Scimitar 1.01 | 16 | 19% | 69 |
| cf.RiO.RiOx 4.2.1 | 6 | 7% | 17 |
| eld.Hmm 1.0 | 2 | 2% | 10 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 111 / 210 | 1.94 | 18.9% | 30701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.9% | 111 |
| pe.SandboxDT 2.71m | 2.2 | 15.8% | 45 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.3% | 37 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.2% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.0% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.8 | 18 / 35 | 4768 |
| 2 | 1 | 69.7 | 91.1 | 20 / 35 | 5241 |
| 3 | 1 | 69.3 | 89.5 | 19 / 35 | 5237 |
| 4 | 1 | 71.5 | 94.9 | 25 / 35 | 5572 |
| 5 | 1 | 67.7 | 83.5 | 14 / 35 | 5113 |
| 6 | 1 | 68.4 | 87.6 | 15 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 61% |
| kvk.HebusLeTroll 0.35 | 50 | 72% |
| jlm.javaDisturbance 0.59 | 36 | 86% |
| bigpete.Stewie 1.0 | 5 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 41% | 72 |
| kvk.HebusLeTroll 0.35 | 35 | 35% | 66 |
| jlm.javaDisturbance 0.59 | 18 | 18% | 54 |
| bigpete.Stewie 1.0 | 3 | 3% | 8 |
| tad.Dalek98 0.98 | 1 | 1% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.6 | 145 / 210 | 1.66 | 20.0% | 30354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.0% | 145 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 45 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.7% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 7.8% | 0 |
| sample.Walls 1.0 | 7.5 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 22 / 35 | 5077 |
| 2 | 1 | 70.8 | 92.1 | 24 / 35 | 4701 |
| 3 | 1 | 71.1 | 92.1 | 27 / 35 | 5324 |
| 4 | 1 | 71.1 | 94.0 | 24 / 35 | 5222 |
| 5 | 1 | 71.4 | 92.1 | 25 / 35 | 5048 |
| 6 | 1 | 71.0 | 93.0 | 23 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 79% |
| cre.Karolos 0.32 | 42 | 90% |
| stelo.AreaTargetingBot 1.1 | 20 | 95% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 40 | 62% | 110 |
| cre.Karolos 0.32 | 15 | 23% | 53 |
| stelo.AreaTargetingBot 1.1 | 10 | 15% | 24 |
| sample.Walls 1.0 | 0 | 0% | 8 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 4 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.2 | 82 / 210 | 2.96 | 15.8% | 22488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.2 | 15.8% | 82 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.4% | 39 |
| florent.XSeries.X2 0.12 | 3.3 | 13.3% | 28 |
| davidalves.Phoenix 0.54 | 4.0 | 12.8% | 35 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.4% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.7% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.5% | 0 |
| evd.X1 0.01 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 75.6 | 11 / 35 | 3869 |
| 2 | 1 | 63.4 | 76.5 | 12 / 35 | 3707 |
| 3 | 2 | 64.1 | 78.7 | 14 / 35 | 3567 |
| 4 | 1 | 65.6 | 82.2 | 17 / 35 | 3769 |
| 5 | 1 | 64.4 | 78.1 | 13 / 35 | 3825 |
| 6 | 1 | 64.5 | 78.1 | 15 / 35 | 3751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 80% |
| davidalves.Phoenix 0.54 | 27 | 56% |
| florent.XSeries.X2 0.12 | 25 | 68% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 26% | 52 |
| rz.GlowBlowMelee 1.4 | 32 | 25% | 60 |
| davidalves.Phoenix 0.54 | 32 | 25% | 49 |
| pedersen.Ugluk 1.1.1 | 20 | 16% | 25 |
| oog.melee.Corsair 1.0 | 3 | 2% | 9 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 4 |
| evd.X1 0.01 | 1 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.8 | 153 / 210 | 1.92 | 19.5% | 26742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.5% | 153 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.7% | 16 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.9% | 11 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 19 |
| ds.Oo 2.2 | 5.2 | 9.3% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 8.7% | 4 |
| awesomeness.Elite 1.0 | 7.3 | 7.1% | 0 |
| adt.Ar2 1.1 | 7.8 | 6.5% | 1 |
| gjr.Cephalosporin 0.1 | 8.8 | 5.9% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.0 | 28 / 35 | 4424 |
| 2 | 1 | 68.5 | 86.7 | 23 / 35 | 4459 |
| 3 | 1 | 69.6 | 90.8 | 24 / 35 | 4393 |
| 4 | 1 | 68.4 | 87.0 | 26 / 35 | 4145 |
| 5 | 1 | 71.0 | 93.3 | 30 / 35 | 4987 |
| 6 | 1 | 68.2 | 87.0 | 22 / 35 | 4334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 60 | 93% |
| voidious.micro.BlitzBat 1.05 | 54 | 94% |
| jdw.Hurricane 1.4 | 24 | 75% |
| ds.Oo 2.2 | 13 | 100% |
| gre.svman4.Morfeas 1.4.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 16 | 28% | 60 |
| jdw.Hurricane 1.4 | 15 | 26% | 39 |
| voidious.micro.BlitzBat 1.05 | 11 | 19% | 51 |
| ds.Oo 2.2 | 5 | 9% | 23 |
| awesomeness.Elite 1.0 | 4 | 7% | 10 |
| gre.svman4.Morfeas 1.4.1 | 3 | 5% | 13 |
| amk.ChumbaMini 0.2 | 2 | 4% | 3 |
| adt.Ar2 1.1 | 1 | 2% | 5 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 5 |

## Melee bench: F26

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.5 | 157 / 210 | 1.58 | 20.5% | 34905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.5% | 157 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 26 |
| lrem.Spectre 0.4.4 | 3.7 | 12.6% | 7 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 11 |
| js.PinBall 1.6 | 4.5 | 11.0% | 8 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 8.8% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.2 | 31 / 35 | 6185 |
| 2 | 1 | 71.2 | 93.0 | 24 / 35 | 5868 |
| 3 | 1 | 70.8 | 92.1 | 22 / 35 | 5825 |
| 4 | 1 | 70.9 | 92.4 | 26 / 35 | 5522 |
| 5 | 1 | 71.6 | 93.3 | 28 / 35 | 5812 |
| 6 | 1 | 71.4 | 94.3 | 26 / 35 | 5693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 82% |
| shu.nitro.LENIN .T34 | 52 | 92% |
| lrem.Spectre 0.4.4 | 44 | 93% |
| js.PinBall 1.6 | 8 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 49% | 65 |
| shu.nitro.LENIN .T34 | 9 | 17% | 67 |
| lrem.Spectre 0.4.4 | 9 | 17% | 35 |
| js.PinBall 1.6 | 6 | 11% | 17 |
| gh.mini.GrubbmOne 1.0 | 2 | 4% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 9 |

## Melee bench: F27

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.8 | 140 / 210 | 2.00 | 19.6% | 30648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.6% | 140 |
| mk.Alpha 0.2.1 | 2.0 | 14.0% | 27 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.9% | 18 |
| EH.Eagle 1.0.6 | 4.7 | 10.3% | 3 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.3% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.1% | 0 |
| joe.ADinosaur 1.0 | 7.7 | 7.2% | 0 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 93.3 | 29 / 35 | 4275 |
| 2 | 1 | 72.2 | 90.5 | 26 / 35 | 6226 |
| 3 | 1 | 69.4 | 83.5 | 19 / 35 | 5711 |
| 4 | 1 | 70.7 | 87.3 | 19 / 35 | 6063 |
| 5 | 1 | 68.7 | 90.8 | 23 / 35 | 4479 |
| 6 | 1 | 67.7 | 87.6 | 24 / 35 | 3894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 86% |
| wee.Gem 1.8.4 | 38 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 80% |
| EH.Eagle 1.0.6 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 26 | 37% | 89 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 21% | 33 |
| wee.Gem 1.8.4 | 11 | 16% | 41 |
| EH.Eagle 1.0.6 | 7 | 10% | 21 |
| throxbot.ThroxBot 0.1 | 7 | 10% | 11 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 6 |
| joe.ADinosaur 1.0 | 1 | 1% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 2 |

## Melee bench: F28

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.7 | 131 / 210 | 2.02 | 18.6% | 25867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.6% | 131 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 36 |
| uji.Antique 1.0 | 3.2 | 12.1% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.4% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.1% | 3 |
| ahr.ice.Ice 1.0.2 | 7.3 | 7.6% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 8.5 | 6.1% | 1 |
| stelo.Lifestealer 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 23 / 35 | 4383 |
| 2 | 1 | 69.9 | 92.1 | 24 / 35 | 4779 |
| 3 | 1 | 67.9 | 88.3 | 21 / 35 | 3997 |
| 4 | 1 | 68.0 | 87.0 | 24 / 35 | 4310 |
| 5 | 1 | 66.8 | 85.1 | 17 / 35 | 4137 |
| 6 | 1 | 67.9 | 89.5 | 22 / 35 | 4261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 91 | 79% |
| uji.Antique 1.0 | 37 | 73% |
| qohnil.blot.BlotBot 3.61 | 19 | 89% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 34% | 83 |
| uji.Antique 1.0 | 20 | 25% | 50 |
| qohnil.blot.BlotBot 3.61 | 8 | 10% | 28 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 14 |
| amk.ChumbaWumba 0.3 | 7 | 9% | 12 |
| matt.advanced.Katana 1.0 | 4 | 5% | 8 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 9 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| stelo.Lifestealer 1.0 | 2 | 3% | 2 |

## Melee bench: F29

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.7 | 120 / 210 | 2.29 | 18.6% | 28032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.6% | 120 |
| deewiant.Anomaly 0.2 | 2.3 | 15.4% | 42 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.9% | 37 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 1 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 8 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.3% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.6% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.2% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 16 / 35 | 4312 |
| 2 | 1 | 68.9 | 87.0 | 23 / 35 | 4543 |
| 3 | 1 | 69.1 | 87.0 | 20 / 35 | 4811 |
| 4 | 1 | 69.2 | 87.9 | 18 / 35 | 4842 |
| 5 | 1 | 70.2 | 89.5 | 23 / 35 | 4906 |
| 6 | 1 | 68.5 | 83.8 | 20 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 76% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 75% |
| myl.micro.Troodon 1.10 | 14 | 100% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 49% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 22 | 24% | 61 |
| myl.micro.Troodon 1.10 | 10 | 11% | 22 |
| jok.PheonixM 0.1.2 | 8 | 9% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.1 | 63 / 210 | 3.06 | 15.1% | 21584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.3 | 15.1% | 63 |
| catcat20.Matcha 0.006 | 2.3 | 14.7% | 48 |
| darkcanuck.B26354 1.06 | 3.5 | 13.6% | 40 |
| stelo.PastFuture 2.3.2 | 3.8 | 13.2% | 30 |
| oog.melee.Capulet 1.2 | 4.0 | 13.2% | 24 |
| intruder.PrairieWolf 2.61 | 6.5 | 7.4% | 3 |
| ntc.Opposite 1.5 | 7.2 | 7.3% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 6.8% | 0 |
| tripphippy.Alice 1.1 | 8.7 | 6.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 75.2 | 9 / 35 | 3291 |
| 2 | 1 | 63.7 | 76.5 | 14 / 35 | 3532 |
| 3 | 2 | 62.6 | 74.6 | 10 / 35 | 3497 |
| 4 | 2 | 62.7 | 75.6 | 9 / 35 | 3405 |
| 5 | 1 | 65.8 | 81.9 | 12 / 35 | 3987 |
| 6 | 1 | 63.6 | 78.7 | 9 / 35 | 3872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 38 | 58% |
| darkcanuck.B26354 1.06 | 23 | 57% |
| stelo.PastFuture 2.3.2 | 19 | 74% |
| oog.melee.Capulet 1.2 | 17 | 71% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 37 | 25% | 60 |
| darkcanuck.B26354 1.06 | 37 | 25% | 49 |
| stelo.PastFuture 2.3.2 | 32 | 22% | 43 |
| oog.melee.Capulet 1.2 | 28 | 19% | 42 |
| tripphippy.Alice 1.1 | 6 | 4% | 7 |
| ntc.Opposite 1.5 | 3 | 2% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 3 |
| intruder.PrairieWolf 2.61 | 1 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.9 | 58 / 210 | 3.08 | 15.0% | 20316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 104 |
| hadur117.mini.DeisePT0 0.5 | 2.2 | 15.0% | 58 |
| gh.mini.Griezel 0.2 | 3.2 | 13.2% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.3% | 12 |
| d414.nano.Quantum 1.0.0 | 5.3 | 10.5% | 1 |
| gh.nano.Grofvuil 0.2 | 5.7 | 8.9% | 2 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.8% | 1 |
| fm.mammillarias 1.3 | 7.7 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.9% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 75.6 | 12 / 35 | 3259 |
| 2 | 2 | 62.3 | 75.6 | 7 / 35 | 3128 |
| 3 | 2 | 64.4 | 79.4 | 13 / 35 | 3708 |
| 4 | 2 | 64.0 | 78.4 | 11 / 35 | 3648 |
| 5 | 2 | 62.6 | 76.8 | 7 / 35 | 3307 |
| 6 | 3 | 62.5 | 75.6 | 8 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 55 | 58% |
| gh.mini.Griezel 0.2 | 24 | 54% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| d414.nano.Quantum 1.0.0 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 39% | 91 |
| gh.mini.Griezel 0.2 | 39 | 25% | 52 |
| spinnercat.micro.Tyger 0.1 | 28 | 18% | 35 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 14 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.2 | 143 / 210 | 1.88 | 19.0% | 28348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.0% | 143 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 45 |
| apc.botM 3.0 | 3.3 | 11.7% | 13 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 1 |
| vjik.UnViolation 1.1 | 5.3 | 9.2% | 5 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 2 |
| panzer.Panzer 0.2 | 6.7 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.3% | 1 |
| conscience.Electron 1.3g | 9.0 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.4 | 26 / 35 | 4863 |
| 2 | 1 | 70.9 | 96.8 | 29 / 35 | 4953 |
| 3 | 1 | 66.4 | 82.5 | 20 / 35 | 4593 |
| 4 | 1 | 67.3 | 87.9 | 22 / 35 | 4323 |
| 5 | 1 | 69.2 | 92.7 | 23 / 35 | 5015 |
| 6 | 1 | 68.0 | 88.9 | 23 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 70% |
| apc.botM 3.0 | 39 | 85% |
| lxx.ConceptA 0.8 | 19 | 100% |
| donjezza.Jezza 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| vjik.UnViolation 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 34 | 49% | 103 |
| apc.botM 3.0 | 15 | 22% | 53 |
| lxx.ConceptA 0.8 | 8 | 12% | 17 |
| bayen.UbaMicro 1.4 | 4 | 6% | 11 |
| vjik.UnViolation 1.1 | 2 | 3% | 8 |
| panzer.Panzer 0.2 | 2 | 3% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| conscience.Electron 1.3g | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.3 | 136 / 210 | 2.14 | 19.2% | 29932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.2% | 136 |
| maribo.Quester 0.3 | 2.0 | 15.2% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.2% | 21 |
| labg.Cataclysm 2.05 | 4.2 | 11.3% | 16 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 10.5% | 6 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.2% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 1 |
| sanja.First 0.1 | 8.8 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 18 / 35 | 4739 |
| 2 | 1 | 70.4 | 88.3 | 25 / 35 | 5175 |
| 3 | 1 | 67.7 | 81.6 | 19 / 35 | 4811 |
| 4 | 1 | 70.0 | 88.9 | 27 / 35 | 5042 |
| 5 | 1 | 69.7 | 88.6 | 24 / 35 | 5078 |
| 6 | 1 | 70.2 | 90.8 | 23 / 35 | 5087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 95% |
| gre.svman4.Leonidas 1.3.2 | 24 | 96% |
| labg.Cataclysm 2.05 | 15 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 92% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 41% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 19% | 53 |
| labg.Cataclysm 2.05 | 12 | 16% | 28 |
| gre.svman4.Leonidas 1.3.2 | 8 | 11% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 8% | 14 |
| zyx.micro.Ant 1.1 | 2 | 3% | 2 |
| baal.nano.N 1.42 | 1 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.8 | 86 / 210 | 2.28 | 17.6% | 28788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.7 | 17.6% | 86 |
| stelo.Spread 0.9 | 1.7 | 17.1% | 68 |
| kid.Gladiator .7.2 | 2.7 | 16.2% | 42 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 12 |
| tcf.Reach 3 | 5.0 | 10.4% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.7 | 18 / 35 | 4544 |
| 2 | 2 | 67.8 | 84.8 | 15 / 35 | 4739 |
| 3 | 2 | 68.2 | 86.0 | 13 / 35 | 4922 |
| 4 | 2 | 67.3 | 83.2 | 13 / 35 | 4601 |
| 5 | 2 | 67.7 | 86.3 | 13 / 35 | 4623 |
| 6 | 1 | 69.3 | 87.9 | 14 / 35 | 5359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 86 | 62% |
| kid.Gladiator .7.2 | 32 | 56% |
| jcs.Seth 1.8 | 10 | 70% |
| tcf.Reach 3 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1127. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 58 | 46% | 103 |
| kid.Gladiator .7.2 | 47 | 37% | 59 |
| jcs.Seth 1.8 | 10 | 8% | 26 |
| tcf.Reach 3 | 6 | 5% | 12 |
| cli.Dancer 1.1 | 2 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.6 | 32 / 210 | 2.83 | 14.9% | 20340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 151 |
| hadur117.mini.DeisePT0 0.5 | 2.0 | 14.9% | 32 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.5% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 2 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.6% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 81.6 | 6 / 35 | 3657 |
| 2 | 2 | 63.5 | 78.7 | 6 / 35 | 3531 |
| 3 | 2 | 63.8 | 82.2 | 1 / 35 | 3426 |
| 4 | 2 | 63.9 | 81.6 | 7 / 35 | 3382 |
| 5 | 2 | 62.4 | 76.5 | 7 / 35 | 3127 |
| 6 | 2 | 62.6 | 77.1 | 5 / 35 | 3217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 93 | 13% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 82% |
| gh.mini.Gruwel 0.9 | 8 | 63% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 113 | 63% | 121 |
| gh.mini.Gruwel 0.9 | 24 | 13% | 29 |
| rz.HawkOnFire 0.1 | 23 | 13% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 6% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.6 | 175 / 210 | 1.49 | 21.3% | 33567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 21.3% | 175 |
| bzdp.Pansy 2.1 | 2.5 | 12.7% | 8 |
| alpha.RainingFire 1.0 | 2.7 | 12.4% | 11 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 5 |
| mz.Cork 0.1 | 5.0 | 10.6% | 7 |
| m3thos.Eva02 0.7.1 | 6.2 | 8.9% | 2 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 2 |
| dl.BetterWalls 1.0 | 8.0 | 5.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 4.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 25 / 35 | 5465 |
| 2 | 1 | 72.1 | 94.6 | 31 / 35 | 5624 |
| 3 | 1 | 72.3 | 95.9 | 31 / 35 | 5859 |
| 4 | 1 | 72.1 | 96.2 | 31 / 35 | 5431 |
| 5 | 1 | 70.8 | 92.1 | 28 / 35 | 5554 |
| 6 | 1 | 72.0 | 95.6 | 29 / 35 | 5634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 95% |
| alpha.RainingFire 1.0 | 35 | 89% |
| bvh.micro.Freya 0.3 | 33 | 100% |
| mz.Cork 0.1 | 31 | 97% |
| m3thos.Eva02 0.7.1 | 9 | 100% |
| bvh.mini.Fenrir 0.39 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 29% | 43 |
| bvh.micro.Freya 0.3 | 7 | 20% | 28 |
| bvh.mini.Fenrir 0.39 | 6 | 17% | 12 |
| bzdp.Pansy 2.1 | 4 | 11% | 67 |
| m3thos.Eva02 0.7.1 | 4 | 11% | 16 |
| mz.Cork 0.1 | 1 | 3% | 33 |
| dl.BetterWalls 1.0 | 1 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 2 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 2 |

## Melee bench: F37

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 94.2 | 179 / 210 | 1.52 | 20.5% | 33710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.5% | 179 |
| germ.TheMind .2 | 2.2 | 11.4% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 9.4% | 6 |
| EBBU.Sim2 1.02 | 4.5 | 9.7% | 7 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.1% | 6 |
| agrach.Dalek 1.0 | 6.2 | 8.6% | 2 |
| lmk.ACPFinal 0.1 | 7.3 | 7.8% | 1 |
| skm.Ryubot 1.0 | 7.3 | 8.1% | 3 |
| mb.Beast 0.1 | 7.5 | 8.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 95.6 | 31 / 35 | 5885 |
| 2 | 1 | 69.6 | 93.7 | 28 / 35 | 5451 |
| 3 | 1 | 69.4 | 90.8 | 30 / 35 | 5473 |
| 4 | 1 | 70.6 | 97.8 | 31 / 35 | 5440 |
| 5 | 1 | 69.6 | 92.7 | 28 / 35 | 5524 |
| 6 | 1 | 70.5 | 94.9 | 31 / 35 | 5937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 60 | 97% |
| EBBU.Sim2 1.02 | 26 | 92% |
| stelo.UntouchableNano 1.3 | 23 | 91% |
| skm.Ryubot 1.0 | 23 | 96% |
| agrach.Dalek 1.0 | 17 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 100% |
| lmk.ACPFinal 0.1 | 8 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 5 | 16% | 32 |
| EBBU.Sim2 1.02 | 5 | 16% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 13% | 27 |
| stelo.UntouchableNano 1.3 | 4 | 13% | 20 |
| lmk.ACPFinal 0.1 | 4 | 13% | 16 |
| mb.Beast 0.1 | 3 | 10% | 24 |
| germ.TheMind .2 | 2 | 6% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 6% | 9 |
| skm.Ryubot 1.0 | 2 | 6% | 7 |

## Melee bench: F38

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.1 | 97 / 210 | 2.61 | 16.8% | 25376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.3 | 16.8% | 97 |
| justin.Mallais 14.0 | 1.7 | 16.6% | 69 |
| bvh.mini.Freya 0.55 | 3.5 | 12.3% | 13 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.1% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.7% | 2 |
| cs.Wren 1.0 | 5.8 | 10.0% | 5 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.4% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.2% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 19 / 35 | 4385 |
| 2 | 2 | 66.3 | 81.3 | 15 / 35 | 4366 |
| 3 | 1 | 64.3 | 78.7 | 14 / 35 | 4037 |
| 4 | 2 | 66.1 | 82.5 | 15 / 35 | 3975 |
| 5 | 1 | 66.7 | 82.5 | 16 / 35 | 4541 |
| 6 | 1 | 66.1 | 81.6 | 18 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 66% |
| bvh.mini.Freya 0.55 | 19 | 84% |
| bts.mega.Gnarly 1.4 | 17 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| cs.Wren 1.0 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 113 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 34% | 80 |
| bvh.mini.Freya 0.55 | 23 | 20% | 36 |
| bts.mega.Gnarly 1.4 | 15 | 13% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 10% | 21 |
| kdf.KoulDestroyer 1.0 | 11 | 10% | 17 |
| cs.Wren 1.0 | 10 | 9% | 17 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.9 | 109 / 210 | 2.18 | 18.3% | 29404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.3% | 109 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 13.4% | 54 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.0% | 1 |
| gimp.GimpBot 0.1 | 7.3 | 7.2% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.0 | 15 / 35 | 5243 |
| 2 | 1 | 67.0 | 86.3 | 19 / 35 | 4690 |
| 3 | 1 | 68.1 | 87.9 | 20 / 35 | 4762 |
| 4 | 1 | 66.4 | 84.8 | 16 / 35 | 4458 |
| 5 | 1 | 67.7 | 84.8 | 18 / 35 | 4885 |
| 6 | 1 | 70.0 | 91.7 | 21 / 35 | 5366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 61 | 61% |
| catcat20.Lambda 0.024 | 42 | 64% |
| bvh.fry.Freya 0.82 | 39 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 40% | 75 |
| az.Ololobot 0.2.4 | 30 | 30% | 67 |
| catcat20.Lambda 0.024 | 20 | 20% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 6% | 10 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 5 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.1 | 131 / 210 | 2.07 | 19.2% | 29944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.2% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.6% | 37 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.3% | 22 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.9% | 8 |
| mz.AntiGrav 1.0 | 4.8 | 10.5% | 5 |
| stelo.Randomness 1.0 | 5.8 | 9.2% | 4 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 3.7% | 0 |
| sample.Corners 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.3 | 19 / 35 | 5153 |
| 2 | 1 | 70.8 | 92.4 | 26 / 35 | 5077 |
| 3 | 1 | 68.4 | 84.1 | 21 / 35 | 4941 |
| 4 | 1 | 67.9 | 84.1 | 20 / 35 | 4660 |
| 5 | 1 | 70.1 | 91.4 | 24 / 35 | 5011 |
| 6 | 1 | 69.6 | 89.2 | 21 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kano.gamma.KanoGamma 1.8 | 52 | 83% |
| kawigi.mini.Coriantumr 1.1 | 50 | 76% |
| Polkwane.SmashMelee 1.0 | 23 | 91% |
| mz.AntiGrav 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 10 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 35% | 53 |
| kano.gamma.KanoGamma 1.8 | 21 | 27% | 70 |
| Polkwane.SmashMelee 1.0 | 11 | 14% | 24 |
| stelo.Randomness 1.0 | 10 | 13% | 26 |
| mz.AntiGrav 1.0 | 5 | 6% | 19 |
| alpha.BlackIce 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 1 | 1% | 4 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.1 | 109 / 210 | 2.16 | 17.9% | 25483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.3 | 17.9% | 109 |
| eem.EvBotNG v12.8 | 1.7 | 16.2% | 67 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 15 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.7% | 8 |
| shrub.Silver v048 | 5.8 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 6.9% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 5.9% | 0 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.3 | 19 / 35 | 3912 |
| 2 | 2 | 67.5 | 84.8 | 16 / 35 | 4362 |
| 3 | 1 | 69.2 | 89.8 | 22 / 35 | 4542 |
| 4 | 1 | 67.4 | 86.3 | 18 / 35 | 4166 |
| 5 | 2 | 67.2 | 85.1 | 13 / 35 | 4225 |
| 6 | 1 | 69.0 | 90.2 | 21 / 35 | 4276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 58% |
| lessonz.robocode.Oz 0.5.0 | 25 | 96% |
| ary.Swarm 1.1 | 23 | 83% |
| simonton.nano.MeleeSeed 1.8 | 19 | 89% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 48% | 95 |
| ary.Swarm 1.1 | 17 | 17% | 39 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 29 |
| simonton.nano.MeleeSeed 1.8 | 10 | 10% | 25 |
| shrub.Silver v048 | 4 | 4% | 8 |
| stelo.Mirror 1.1 | 4 | 4% | 7 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 122 / 210 | 1.97 | 18.9% | 30903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 18.9% | 122 |
| wompi.Wallaby 5.1 | 2.3 | 15.4% | 46 |
| ara.Shera 0.88 | 3.2 | 13.7% | 28 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.7% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 0 |
| maribo.IotaCT 1.1 | 6.3 | 7.0% | 0 |
| dsw.StaticD 1.0 | 6.7 | 6.8% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 21 / 35 | 5274 |
| 2 | 1 | 67.6 | 87.9 | 18 / 35 | 4654 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 5093 |
| 4 | 1 | 70.1 | 92.7 | 23 / 35 | 5300 |
| 5 | 1 | 69.8 | 88.6 | 21 / 35 | 5540 |
| 6 | 1 | 68.8 | 90.2 | 20 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 53 | 81% |
| wompi.Wallaby 5.1 | 51 | 71% |
| maribo.mini.MiniQuester 0.1 | 42 | 88% |
| dsw.StaticD 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 34% | 73 |
| ara.Shera 0.88 | 29 | 32% | 71 |
| maribo.mini.MiniQuester 0.1 | 22 | 24% | 57 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.6 | 43 / 210 | 2.93 | 15.3% | 22933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 145 |
| hadur117.mini.DeisePT0 0.5 | 2.0 | 15.3% | 43 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.1% | 12 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.4% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 82.2 | 8 / 35 | 3762 |
| 2 | 2 | 66.0 | 80.3 | 10 / 35 | 4012 |
| 3 | 2 | 64.3 | 75.2 | 6 / 35 | 3787 |
| 4 | 2 | 65.2 | 79.4 | 7 / 35 | 3910 |
| 5 | 2 | 65.2 | 78.7 | 8 / 35 | 3880 |
| 6 | 2 | 63.9 | 75.6 | 4 / 35 | 3582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 23% |
| brainfade.melee.Dusk 0.44 | 17 | 76% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 65% | 132 |
| brainfade.melee.Dusk 0.44 | 20 | 12% | 30 |
| dummy.micro.Sparrow 2.5 | 14 | 8% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 8% | 16 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.4 | 133 / 210 | 1.78 | 19.9% | 32038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 19.9% | 133 |
| stelo.Liblix 0.3.1 | 2.2 | 16.1% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.7% | 20 |
| wompi.Quokka 1.6 | 4.0 | 10.2% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 8.8% | 0 |
| disan.Chair 2.2.0 | 6.7 | 7.4% | 0 |
| jwirde.Gort 2.0 | 6.8 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.1% | 2 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 25 / 35 | 5015 |
| 2 | 1 | 69.7 | 87.3 | 20 / 35 | 5692 |
| 3 | 1 | 69.2 | 88.9 | 19 / 35 | 5143 |
| 4 | 1 | 70.1 | 91.4 | 22 / 35 | 5200 |
| 5 | 1 | 71.2 | 94.6 | 22 / 35 | 5549 |
| 6 | 1 | 71.2 | 93.7 | 25 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 101 | 77% |
| tzu.TheArtOfWar 1.2 | 47 | 74% |
| wompi.Quokka 1.6 | 13 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 46 | 60% | 125 |
| tzu.TheArtOfWar 1.2 | 19 | 25% | 48 |
| wompi.Quokka 1.6 | 6 | 8% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 9 |
| jwirde.Gort 2.0 | 2 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.7 | 77 / 210 | 1.84 | 20.2% | 37081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePT0 0.5 | 1.0 | 20.2% | 77 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.8% | 122 |
| jje.BagPuss 1.2 | 3.3 | 11.7% | 3 |
| myl.nano.Graviton 1.10 | 4.2 | 10.2% | 1 |
| sul.Lunar 1.1 | 5.2 | 9.8% | 6 |
| pez.mini.ChironexFleckeri 0.5 | 6.0 | 9.0% | 0 |
| fm.claire 1.7 | 6.7 | 8.1% | 0 |
| hvilela.HVilela 0.9 | 7.7 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.3 | 16 / 35 | 5951 |
| 2 | 1 | 71.2 | 92.7 | 13 / 35 | 6574 |
| 3 | 1 | 69.6 | 88.9 | 15 / 35 | 5844 |
| 4 | 1 | 69.8 | 90.2 | 9 / 35 | 5979 |
| 5 | 1 | 70.4 | 91.4 | 12 / 35 | 6215 |
| 6 | 1 | 70.0 | 87.6 | 12 / 35 | 6518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 142 | 22% |
| sul.Lunar 1.1 | 16 | 94% |
| jje.BagPuss 1.2 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 2684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 83% | 0 |
| jje.BagPuss 1.2 | 8 | 6% | 63 |
| myl.nano.Graviton 1.10 | 5 | 4% | 42 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 25 |
| sul.Lunar 1.1 | 3 | 2% | 49 |
| hvilela.HVilela 0.9 | 1 | 1% | 8 |
| fm.claire 1.7 | 1 | 1% | 6 |
| wit.Deep7 2.0 | 0 | 0% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

## Melee bench: F46

hadur117.mini.DeisePT0 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.6 | 69 / 210 | 2.39 | 16.6% | 24641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.9% | 62 |
| hadur117.mini.DeisePT0 0.5 | 1.8 | 16.6% | 69 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.3% | 69 |
| mz.MicroSheep 1.0 | 4.3 | 10.5% | 2 |
| cx.Princess 1.0 | 5.0 | 9.9% | 8 |
| sadoner.killer 0.2 | 5.7 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.3% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 85.4 | 14 / 35 | 4050 |
| 2 | 2 | 64.9 | 82.9 | 7 / 35 | 3967 |
| 3 | 2 | 65.2 | 84.4 | 10 / 35 | 3667 |
| 4 | 1 | 67.3 | 86.7 | 14 / 35 | 4408 |
| 5 | 2 | 65.6 | 82.2 | 9 / 35 | 4303 |
| 6 | 2 | 67.2 | 86.0 | 15 / 35 | 4246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 55% |
| rsalesc.melee.Medina 0.4.5 | 52 | 38% |
| cx.Princess 1.0 | 13 | 77% |
| mz.MicroSheep 1.0 | 3 | 67% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 47% | 106 |
| rsalesc.melee.Medina 0.4.5 | 53 | 38% | 69 |
| cx.Princess 1.0 | 7 | 5% | 14 |
| mz.MicroSheep 1.0 | 6 | 4% | 8 |
| sadoner.killer 0.2 | 4 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 0 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

