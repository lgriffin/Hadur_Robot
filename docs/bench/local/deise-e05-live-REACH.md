# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.5 | 49 / 210 | 2.30 | 17.1% | 30937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 145 |
| hadur117.mini.DeiseREACH 0.3 | 2.0 | 17.1% | 49 |
| sgp.JollyNinja 3.53 | 3.2 | 11.6% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.7% | 5 |
| mz.MicroGodMelee 1 | 5.0 | 10.1% | 2 |
| lorneswork.Predator 1.0 | 5.7 | 9.7% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 86.3 | 6 / 35 | 5661 |
| 2 | 2 | 66.0 | 84.4 | 8 / 35 | 4736 |
| 3 | 2 | 67.1 | 85.4 | 8 / 35 | 5270 |
| 4 | 2 | 66.8 | 86.3 | 11 / 35 | 5019 |
| 5 | 2 | 67.4 | 86.7 | 9 / 35 | 5236 |
| 6 | 2 | 66.0 | 83.8 | 7 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 14% |
| sgp.JollyNinja 3.53 | 16 | 88% |
| mz.MicroGodMelee 1 | 9 | 89% |
| lorneswork.Predator 1.0 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 77% | 147 |
| sgp.JollyNinja 3.53 | 14 | 9% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 9 |
| mz.MicroGodMelee 1 | 8 | 5% | 12 |
| lorneswork.Predator 1.0 | 4 | 2% | 12 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.6 | 84 / 210 | 2.92 | 16.6% | 28035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 16.6% | 84 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.2% | 33 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 14.0% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.5% | 11 |
| Noran.BitchingElk 0.054 | 7.0 | 7.5% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.0% | 5 |
| sch.Simone 0.3d | 7.2 | 7.9% | 13 |
| stelo.PatternRobot 1.0 | 8.5 | 6.9% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 79.4 | 15 / 35 | 4491 |
| 2 | 1 | 66.3 | 81.3 | 17 / 35 | 4773 |
| 3 | 1 | 65.8 | 80.0 | 13 / 35 | 4776 |
| 4 | 1 | 66.2 | 82.9 | 13 / 35 | 4907 |
| 5 | 1 | 62.2 | 68.9 | 13 / 35 | 4472 |
| 6 | 1 | 65.3 | 79.4 | 13 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 76% |
| pulsar.PulsarMax 0.8.9 | 39 | 56% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| sch.Simone 0.3d | 6 | 50% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |

Hadur died in 127 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 31% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 28% | 67 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 11% | 20 |
| Noran.BitchingElk 0.054 | 10 | 8% | 16 |
| sch.Simone 0.3d | 10 | 8% | 14 |
| stelo.PatternRobot 1.0 | 8 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 3% | 11 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.3 | 159 / 210 | 1.60 | 20.6% | 38349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 20.6% | 159 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 11 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 26 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.4% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.3 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.9 | 28 / 35 | 6462 |
| 2 | 1 | 69.9 | 92.1 | 24 / 35 | 6203 |
| 3 | 1 | 70.5 | 93.3 | 24 / 35 | 6279 |
| 4 | 1 | 71.2 | 92.4 | 27 / 35 | 6575 |
| 5 | 1 | 71.2 | 93.7 | 27 / 35 | 6288 |
| 6 | 1 | 71.4 | 93.7 | 29 / 35 | 6542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 70 | 74% |
| kawigi.nano.Lib 1.0 | 63 | 95% |
| radnor.DoctorBob 1.42 | 39 | 97% |
| adt.Ar1 2.1 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 24 | 47% | 71 |
| kawigi.nano.Lib 1.0 | 13 | 25% | 79 |
| radnor.DoctorBob 1.42 | 12 | 24% | 41 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 4 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| urdos.URDOS 1.3 | 0 | 0% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.5 | 24 / 210 | 2.49 | 16.8% | 32527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 181 |
| hadur117.mini.DeiseREACH 0.3 | 2.0 | 16.8% | 24 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 2 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 7.2% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 78.4 | 1 / 35 | 5190 |
| 2 | 2 | 67.8 | 84.1 | 6 / 35 | 5615 |
| 3 | 2 | 66.7 | 83.5 | 2 / 35 | 5225 |
| 4 | 2 | 67.1 | 84.4 | 6 / 35 | 5269 |
| 5 | 2 | 68.2 | 87.3 | 5 / 35 | 5723 |
| 6 | 2 | 67.0 | 83.2 | 4 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 149 | 13% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 84% | 178 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 13 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 3 | 2% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.7 | 20 / 210 | 3.81 | 12.8% | 19622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.8% | 123 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 48 |
| hadur117.mini.DeiseREACH 0.3 | 3.2 | 12.8% | 20 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 14 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 4 |
| ms.Ares 0.19 | 5.7 | 9.4% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.3 | 6 / 35 | 3403 |
| 2 | 3 | 60.7 | 70.2 | 2 / 35 | 3559 |
| 3 | 3 | 58.0 | 66.0 | 3 / 35 | 2812 |
| 4 | 3 | 60.0 | 68.9 | 4 / 35 | 3365 |
| 5 | 3 | 61.8 | 72.4 | 4 / 35 | 3731 |
| 6 | 4 | 56.2 | 61.6 | 1 / 35 | 2752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 24 | 8% |
| justin.DemonicRage 3.4 | 21 | 38% |
| wompi.Numbat 2.1 | 5 | 100% |
| axeBots.HataMoto 3.09 | 4 | 50% |
| ms.Ares 0.19 | 3 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 64 | 34% | 67 |
| justin.DemonicRage 3.4 | 54 | 28% | 60 |
| wompi.Numbat 2.1 | 28 | 15% | 33 |
| axeBots.HataMoto 3.09 | 20 | 10% | 23 |
| ms.Ares 0.19 | 13 | 7% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.6 | 73 / 210 | 3.02 | 16.0% | 26105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.3 | 16.0% | 73 |
| jekl.StoneGhost 0.7 | 1.8 | 15.2% | 39 |
| origin.SleepSiphon 1.7b | 3.3 | 13.4% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.6% | 30 |
| mld.Wisdom 1.0 | 4.8 | 10.9% | 8 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 6.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.3% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.7% | 1 |
| sample.Fire 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 76.5 | 12 / 35 | 3888 |
| 2 | 1 | 64.9 | 79.4 | 12 / 35 | 4458 |
| 3 | 1 | 66.2 | 81.6 | 14 / 35 | 4693 |
| 4 | 1 | 64.8 | 77.1 | 14 / 35 | 4406 |
| 5 | 2 | 64.4 | 74.9 | 10 / 35 | 4430 |
| 6 | 2 | 64.0 | 75.9 | 11 / 35 | 4230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 83% |
| origin.SleepSiphon 1.7b | 26 | 58% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 57% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 7 | 57% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 48 | 35% | 73 |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 22% | 43 |
| origin.SleepSiphon 1.7b | 28 | 20% | 51 |
| mld.Wisdom 1.0 | 18 | 13% | 21 |
| gg.Wolverine 2.0 | 7 | 5% | 12 |
| DBall.NUKE 0.1 | 3 | 2% | 5 |
| spinnercat.Omen 1.0 | 2 | 1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.2 | 113 / 210 | 1.88 | 19.5% | 35746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.5% | 113 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 49 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.9% | 12 |
| franzor.Lizt 1.3.1 | 4.7 | 10.6% | 10 |
| exauge.GateKeeper 1.1.121g | 6.3 | 8.0% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.6 | 21 / 35 | 6440 |
| 2 | 1 | 69.5 | 87.9 | 15 / 35 | 5388 |
| 3 | 1 | 71.5 | 91.1 | 21 / 35 | 6192 |
| 4 | 1 | 71.3 | 91.7 | 22 / 35 | 6086 |
| 5 | 1 | 70.9 | 91.1 | 18 / 35 | 5764 |
| 6 | 1 | 70.7 | 90.8 | 16 / 35 | 5876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 80 | 78% |
| rsalesc.melee.Monk 0.3.6c | 40 | 23% |
| oog.melee.CapuletDroid 1.1 | 27 | 85% |
| franzor.Lizt 1.3.1 | 17 | 88% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1337. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 50 | 51% | 71 |
| rtk.Tachikoma 1.0 | 37 | 37% | 101 |
| oog.melee.CapuletDroid 1.1 | 5 | 5% | 27 |
| franzor.Lizt 1.3.1 | 3 | 3% | 1 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.8 | 112 / 210 | 2.28 | 18.3% | 29503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.3% | 112 |
| shrub.Vapour v159 | 2.5 | 12.9% | 29 |
| tm.Yuugao 1.0 | 3.2 | 12.1% | 35 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.1% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.6% | 10 |
| m3thos.Eva00 1.1 | 6.0 | 8.5% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.8% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.6% | 1 |
| SHAM.WOW 1.4 | 9.3 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 20 / 35 | 4864 |
| 2 | 1 | 66.3 | 82.9 | 19 / 35 | 4736 |
| 3 | 1 | 67.4 | 85.4 | 18 / 35 | 5099 |
| 4 | 1 | 67.3 | 86.7 | 16 / 35 | 4753 |
| 5 | 1 | 68.3 | 88.3 | 21 / 35 | 5032 |
| 6 | 1 | 67.3 | 83.8 | 18 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 41 | 76% |
| tm.Yuugao 1.0 | 28 | 64% |
| Krabb.sliNk.Garm 0.9u | 23 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 82% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 8 | 63% |
| SHAM.WOW 1.4 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 29% | 51 |
| shrub.Vapour v159 | 24 | 24% | 57 |
| Krabb.sliNk.Garm 0.9u | 20 | 20% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 14% | 30 |
| m3thos.Eva00 1.1 | 6 | 6% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 11 |
| SHAM.WOW 1.4 | 2 | 2% | 10 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.0 | 56 / 210 | 3.43 | 15.1% | 24621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.9% | 116 |
| hadur117.mini.DeiseREACH 0.3 | 1.8 | 15.1% | 56 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 17 |
| yagami.Tidus 0.11 | 4.2 | 11.4% | 1 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.8% | 8 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 12 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 76.5 | 11 / 35 | 4285 |
| 2 | 1 | 64.7 | 75.2 | 14 / 35 | 4360 |
| 3 | 2 | 63.1 | 72.7 | 10 / 35 | 3889 |
| 4 | 2 | 62.4 | 71.7 | 8 / 35 | 3881 |
| 5 | 2 | 63.0 | 72.1 | 6 / 35 | 4254 |
| 6 | 2 | 61.8 | 69.5 | 7 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 31% |
| kc.micro.Figment 1.0 | 16 | 88% |
| yagami.Tidus 0.11 | 13 | 100% |
| mc2.enemy.Original 0.9 | 10 | 70% |
| dft.Calliope 5.6 | 3 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 45% | 85 |
| kc.micro.Figment 1.0 | 30 | 19% | 49 |
| yagami.Tidus 0.11 | 18 | 12% | 27 |
| mc2.enemy.Original 0.9 | 14 | 9% | 21 |
| pedersen.Grishnakh 1.0 | 6 | 4% | 8 |
| dft.Calliope 5.6 | 5 | 3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

## Melee bench: F10

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.2 | 160 / 210 | 1.52 | 20.3% | 33736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 20.3% | 160 |
| DTF.Kludgy 1.2b | 2.5 | 13.9% | 21 |
| ne.Chimera 1.2 | 3.0 | 12.4% | 10 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 7 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.2% | 8 |
| vStar.RAFzilla 2.15 | 5.7 | 9.7% | 2 |
| kurios.DOSexe .9b | 7.3 | 6.4% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.6 | 25 / 35 | 5255 |
| 2 | 1 | 70.1 | 92.1 | 26 / 35 | 5528 |
| 3 | 1 | 69.7 | 92.4 | 25 / 35 | 5330 |
| 4 | 1 | 71.3 | 97.1 | 28 / 35 | 5629 |
| 5 | 1 | 70.6 | 94.3 | 28 / 35 | 5568 |
| 6 | 1 | 71.7 | 94.9 | 28 / 35 | 6426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 50 | 78% |
| ejb.Polaris 1.0.1 | 48 | 96% |
| ne.Chimera 1.2 | 32 | 88% |
| vStar.RAFzilla 2.15 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 16 | 81% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 42% | 65 |
| ne.Chimera 1.2 | 13 | 26% | 36 |
| tvv.micro.Antares 1.1.1 | 8 | 16% | 16 |
| ejb.Polaris 1.0.1 | 6 | 12% | 53 |
| vStar.RAFzilla 2.15 | 2 | 4% | 18 |
| kurios.DOSexe .9b | 0 | 0% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.6 | 86 / 210 | 2.74 | 16.8% | 26797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.5 | 16.8% | 86 |
| rz.Aleph 0.34 | 1.5 | 16.6% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 30 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 7 |
| rdt199.Warlord 0.73 | 5.7 | 8.9% | 10 |
| uji.YellohFellah 1.0 | 6.2 | 8.5% | 7 |
| br2.MobyDickBot 1.6 | 6.5 | 8.0% | 4 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.2% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.0 | 16 / 35 | 4530 |
| 2 | 2 | 65.9 | 81.0 | 15 / 35 | 4448 |
| 3 | 1 | 65.4 | 79.4 | 14 / 35 | 4488 |
| 4 | 1 | 67.1 | 86.0 | 18 / 35 | 4540 |
| 5 | 2 | 64.7 | 77.1 | 12 / 35 | 4435 |
| 6 | 2 | 65.0 | 80.3 | 11 / 35 | 4356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 73% |
| cx.mini.Nimrod 0.55 | 24 | 75% |
| uji.YellohFellah 1.0 | 15 | 87% |
| rdt199.Warlord 0.73 | 12 | 83% |
| djc.DynaBot 0.1.1 | 10 | 90% |
| br2.MobyDickBot 1.6 | 3 | 33% |

Hadur died in 124 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 43% | 91 |
| cx.mini.Nimrod 0.55 | 34 | 27% | 47 |
| djc.DynaBot 0.1.1 | 13 | 10% | 22 |
| rdt199.Warlord 0.73 | 9 | 7% | 17 |
| br2.MobyDickBot 1.6 | 5 | 4% | 7 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 5 |
| uji.YellohFellah 1.0 | 3 | 2% | 17 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.3 | 115 / 210 | 2.50 | 17.5% | 24685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.5% | 115 |
| nat.PallasHawk 1.0 | 2.7 | 13.2% | 34 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.0% | 19 |
| darkcanuck.Leon 1.01 | 3.5 | 12.4% | 21 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.2% | 15 |
| jrm.Test0 1.0 | 6.3 | 8.0% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.0% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 76.5 | 17 / 35 | 4004 |
| 2 | 1 | 66.9 | 84.1 | 20 / 35 | 4348 |
| 3 | 1 | 67.9 | 88.9 | 21 / 35 | 4103 |
| 4 | 1 | 68.7 | 89.8 | 23 / 35 | 4286 |
| 5 | 1 | 63.5 | 74.6 | 15 / 35 | 3629 |
| 6 | 1 | 67.3 | 85.7 | 19 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 46 | 85% |
| bts.wiki.RipCurl 0.9b | 35 | 89% |
| nat.PallasHawk 1.0 | 35 | 80% |
| brainfade.melee.Genghis 0.36 | 13 | 85% |
| jaybot.bots.Oddball 4.0 | 4 | 50% |
| jp.Perpy 16.0 | 3 | 67% |
| jrm.Test0 1.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 22 | 23% | 50 |
| brainfade.melee.Genghis 0.36 | 20 | 21% | 24 |
| darkcanuck.Leon 1.01 | 17 | 18% | 70 |
| bts.wiki.RipCurl 0.9b | 14 | 15% | 35 |
| jrm.Test0 1.0 | 7 | 7% | 9 |
| cs.sheldor.Talon 1.1 | 7 | 7% | 8 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |

## Melee bench: F13

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.8 | 73 / 210 | 2.55 | 16.0% | 24023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 80 |
| ags.Glacier 0.2.11 | 1.8 | 16.8% | 41 |
| hadur117.mini.DeiseREACH 0.3 | 2.7 | 16.0% | 73 |
| shinh.Entangled 0.3 | 4.0 | 12.0% | 10 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.2% | 6 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 1 |
| maribo.FollowFire 1 | 8.5 | 4.6% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 83.2 | 12 / 35 | 3935 |
| 2 | 3 | 65.2 | 82.5 | 11 / 35 | 3934 |
| 3 | 2 | 66.3 | 84.1 | 15 / 35 | 4274 |
| 4 | 3 | 65.6 | 85.1 | 12 / 35 | 3804 |
| 5 | 3 | 63.8 | 76.8 | 10 / 35 | 3738 |
| 6 | 2 | 66.5 | 84.8 | 13 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 43% |
| ags.Glacier 0.2.11 | 41 | 78% |
| shinh.Entangled 0.3 | 9 | 100% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 3 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 41% | 82 |
| ags.Glacier 0.2.11 | 40 | 29% | 71 |
| shinh.Entangled 0.3 | 21 | 15% | 31 |
| gh.micro.Gruweltje 0.7 | 15 | 11% | 19 |
| stelo.Wang 1.0 | 3 | 2% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.1 | 144 / 210 | 1.89 | 19.5% | 32749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.5% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 28 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 29 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.4% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.5% | 6 |
| pa.Improved 1.0 | 9.0 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.3 | 26 / 35 | 5566 |
| 2 | 1 | 69.4 | 89.5 | 26 / 35 | 5270 |
| 3 | 1 | 68.0 | 84.8 | 22 / 35 | 5126 |
| 4 | 1 | 70.4 | 93.7 | 27 / 35 | 5553 |
| 5 | 1 | 69.7 | 90.5 | 20 / 35 | 5771 |
| 6 | 1 | 69.4 | 88.9 | 23 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 86% |
| catcat20.shape.Theta 0.018 | 59 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 30% | 58 |
| simonton.micro.Sprout 1.1.3 | 19 | 28% | 83 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 10% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 9% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 6% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 6% | 6 |
| pa.Improved 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.3 | 82 / 210 | 2.78 | 17.3% | 31268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.2 | 17.3% | 82 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 35 |
| emp.Yngwie 1.11 | 2.7 | 13.6% | 55 |
| mld.DustBunny 3.8 | 3.8 | 12.1% | 6 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.9% | 8 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.9% | 22 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.2% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 16 / 35 | 5848 |
| 2 | 1 | 68.3 | 83.8 | 15 / 35 | 5542 |
| 3 | 1 | 64.0 | 73.7 | 12 / 35 | 4711 |
| 4 | 2 | 65.7 | 77.8 | 10 / 35 | 5375 |
| 5 | 1 | 65.9 | 80.6 | 13 / 35 | 4707 |
| 6 | 1 | 67.3 | 84.1 | 16 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 56% |
| kawigi.micro.Shiz 1.1 | 23 | 65% |
| kawigi.robot.Girl 1.2 | 19 | 63% |
| mld.DustBunny 3.8 | 17 | 94% |
| cb.nano.Insomnia 1.0 | 16 | 88% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 42 | 33% | 70 |
| kawigi.micro.Shiz 1.1 | 27 | 21% | 48 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 18 |
| mld.DustBunny 3.8 | 16 | 13% | 39 |
| kawigi.robot.Girl 1.2 | 16 | 13% | 20 |
| divineomega.TrialBot 0.003 | 5 | 4% | 10 |
| lambdaxy.TBot 0.1 | 3 | 2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.7 | 76 / 210 | 2.83 | 17.3% | 31963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.3 | 17.3% | 76 |
| gh.Griezel 0.5.2 | 1.7 | 16.6% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 33 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.2% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.2% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.9% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.3% | 4 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.1 | 12 / 35 | 5016 |
| 2 | 2 | 66.4 | 79.4 | 13 / 35 | 5227 |
| 3 | 1 | 69.2 | 84.4 | 17 / 35 | 5934 |
| 4 | 1 | 66.5 | 79.4 | 13 / 35 | 5185 |
| 5 | 1 | 67.2 | 79.7 | 11 / 35 | 5753 |
| 6 | 2 | 64.9 | 77.1 | 10 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 58 | 47% |
| techdude.forest.FlamingForest 1.1 | 24 | 46% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 88% |
| divineomega.DivineBot 1.9.4.5 | 9 | 89% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 80% |

Hadur died in 135 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 58 | 43% | 88 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 30 | 22% | 47 |
| techdude.forest.FlamingForest 1.1 | 17 | 13% | 29 |
| bvh.fnr.Fenrir 0.36l | 14 | 10% | 16 |
| divineomega.DivineBot 1.9.4.5 | 6 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 8 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 8 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.7 | 73 / 210 | 3.28 | 15.9% | 28587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 15.9% | 73 |
| et.Predator 1.8 | 2.3 | 13.9% | 28 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.9% | 36 |
| cx.BlestPain 1.41 | 3.5 | 12.7% | 49 |
| nic.Nicator 2.4 | 4.7 | 11.5% | 15 |
| ahf.NanoAndrew .4 | 6.0 | 10.4% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 14 / 35 | 4730 |
| 2 | 1 | 65.2 | 75.9 | 11 / 35 | 5301 |
| 3 | 1 | 63.2 | 71.7 | 13 / 35 | 4410 |
| 4 | 1 | 63.2 | 70.8 | 13 / 35 | 4465 |
| 5 | 1 | 66.5 | 82.9 | 12 / 35 | 4911 |
| 6 | 1 | 62.7 | 68.6 | 10 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 79% |
| cx.BlestPain 1.41 | 23 | 30% |
| oog.melee.Mercutio 1.0 | 23 | 52% |
| nic.Nicator 2.4 | 15 | 80% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 24% | 41 |
| et.Predator 1.8 | 31 | 22% | 54 |
| oog.melee.Mercutio 1.0 | 25 | 18% | 40 |
| ahf.NanoAndrew .4 | 20 | 14% | 29 |
| nic.Nicator 2.4 | 17 | 12% | 32 |
| tex.Longbot 0.4 | 5 | 4% | 5 |
| maribo.melee.BMV 0.1 | 4 | 3% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.3 | 108 / 210 | 2.23 | 18.3% | 28403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.3% | 108 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 37 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.4% | 34 |
| uji.DBH 1.1 | 4.2 | 10.5% | 5 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 3 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.0% | 8 |
| sigterm.Sigterm 1.0 | 6.5 | 8.2% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 3 |
| stelo.WangRobot 1.0 | 9.0 | 6.0% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.9 | 19 / 35 | 4804 |
| 2 | 1 | 67.5 | 85.7 | 21 / 35 | 4541 |
| 3 | 1 | 66.8 | 83.2 | 14 / 35 | 4801 |
| 4 | 1 | 66.9 | 82.5 | 17 / 35 | 4729 |
| 5 | 1 | 67.7 | 88.3 | 19 / 35 | 4597 |
| 6 | 1 | 68.3 | 89.2 | 18 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 66% |
| agd.Mooserwirt2 2.7 | 37 | 54% |
| ratosh.Nobo 0.21 | 15 | 100% |
| sigterm.Sigterm 1.0 | 15 | 93% |
| spinnercat.Robovirus 2.718 | 11 | 73% |
| uji.DBH 1.1 | 10 | 90% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 33 | 32% | 66 |
| agd.Mooserwirt2 2.7 | 32 | 31% | 58 |
| uji.DBH 1.1 | 10 | 10% | 12 |
| spinnercat.Robovirus 2.718 | 9 | 9% | 15 |
| ratosh.Nobo 0.21 | 6 | 6% | 19 |
| stelo.WangRobot 1.0 | 5 | 5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 9 |
| sigterm.Sigterm 1.0 | 3 | 3% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |

## Melee bench: F19

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.8 | 144 / 210 | 1.83 | 20.0% | 34542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 20.0% | 144 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.3% | 31 |
| mld.Infinity 2.2 | 3.0 | 13.9% | 25 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.1% | 5 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 4 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.2% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 25 / 35 | 5677 |
| 2 | 1 | 70.3 | 89.8 | 24 / 35 | 5507 |
| 3 | 1 | 71.2 | 91.7 | 26 / 35 | 5770 |
| 4 | 1 | 70.9 | 89.8 | 23 / 35 | 5979 |
| 5 | 1 | 71.5 | 93.0 | 25 / 35 | 5966 |
| 6 | 1 | 70.1 | 88.9 | 21 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 78 | 87% |
| mld.Infinity 2.2 | 49 | 86% |
| krillr.mini.JointStrike 2.0.0 | 15 | 73% |
| erdnis.Rover 0.3 | 9 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 23 | 34% | 95 |
| mld.Infinity 2.2 | 18 | 26% | 37 |
| krillr.mini.JointStrike 2.0.0 | 16 | 24% | 30 |
| erdnis.Rover 0.3 | 7 | 10% | 21 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| patson.PatsonTestBot 1.0 | 1 | 1% | 9 |
| pac.ABC 2.1 | 1 | 1% | 2 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.1 | 114 / 210 | 2.25 | 18.7% | 32487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.7% | 114 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 13 |
| fwb.Nine 1.0.1 | 3.8 | 10.8% | 13 |
| catcat20.Rabbit 0.001 | 4.8 | 10.1% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.9% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.1% | 5 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 23 / 35 | 5617 |
| 2 | 1 | 68.6 | 85.7 | 18 / 35 | 5805 |
| 3 | 1 | 69.1 | 89.8 | 22 / 35 | 5283 |
| 4 | 1 | 67.6 | 82.2 | 19 / 35 | 5362 |
| 5 | 1 | 66.7 | 81.3 | 15 / 35 | 5092 |
| 6 | 1 | 68.2 | 85.4 | 17 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 81% |
| fwb.Nine 1.0.1 | 27 | 85% |
| nz.jdc.nano.GridFu 1.0 | 19 | 63% |
| catcat20.Rabbit 0.001 | 16 | 63% |
| bayen.nut.Squirrel 1.615 | 11 | 82% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 34% | 77 |
| nz.jdc.nano.GridFu 1.0 | 17 | 18% | 42 |
| catcat20.Rabbit 0.001 | 14 | 14% | 29 |
| bayen.nut.Squirrel 1.615 | 13 | 13% | 22 |
| fwb.Nine 1.0.1 | 12 | 12% | 27 |
| m3thos.mini.Eva01 0.5.5 | 4 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.7 | 111 / 210 | 1.83 | 19.6% | 33685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.6% | 111 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 80 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 7 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.3% | 0 |
| eld.Hmm 1.0 | 5.8 | 7.9% | 6 |
| fire219.CatBot 1.0 | 7.0 | 6.7% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.7 | 20 / 35 | 5078 |
| 2 | 1 | 71.3 | 94.0 | 20 / 35 | 6104 |
| 3 | 1 | 68.3 | 87.0 | 15 / 35 | 5340 |
| 4 | 1 | 70.7 | 92.4 | 19 / 35 | 6022 |
| 5 | 1 | 70.1 | 90.5 | 19 / 35 | 5751 |
| 6 | 1 | 68.8 | 87.0 | 18 / 35 | 5390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 107 | 55% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 13 | 92% |
| eld.Hmm 1.0 | 12 | 58% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1259. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 61 | 62% | 102 |
| dummy.mini.Scimitar 1.01 | 21 | 21% | 66 |
| cf.RiO.RiOx 4.2.1 | 8 | 8% | 14 |
| eld.Hmm 1.0 | 5 | 5% | 20 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |

## Melee bench: F22

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.9 | 79 / 210 | 2.54 | 17.5% | 31220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.3 | 17.5% | 79 |
| pe.SandboxDT 2.71m | 2.2 | 16.4% | 66 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.7% | 43 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.4% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 1 |
| tad.Dalek98 0.98 | 6.7 | 6.3% | 1 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.0 | 17 / 35 | 5657 |
| 2 | 1 | 68.1 | 83.8 | 14 / 35 | 5327 |
| 3 | 2 | 67.5 | 83.8 | 11 / 35 | 5282 |
| 4 | 2 | 65.4 | 77.1 | 9 / 35 | 4775 |
| 5 | 1 | 67.1 | 80.3 | 12 / 35 | 5135 |
| 6 | 1 | 68.1 | 86.3 | 16 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 54 | 69% |
| pe.SandboxDT 2.71m | 36 | 50% |
| jlm.javaDisturbance 0.59 | 23 | 83% |
| bigpete.Stewie 1.0 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 48 | 37% | 67 |
| pe.SandboxDT 2.71m | 44 | 34% | 73 |
| jlm.javaDisturbance 0.59 | 29 | 22% | 53 |
| bigpete.Stewie 1.0 | 4 | 3% | 9 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.2 | 134 / 210 | 1.79 | 19.4% | 30087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.4% | 134 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 50 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 9 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.8% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.7 | 8.6% | 1 |
| sample.Walls 1.0 | 6.7 | 8.2% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 24 / 35 | 5050 |
| 2 | 1 | 70.2 | 89.8 | 22 / 35 | 4923 |
| 3 | 1 | 70.0 | 91.7 | 21 / 35 | 5017 |
| 4 | 1 | 70.9 | 93.0 | 25 / 35 | 5112 |
| 5 | 1 | 70.1 | 90.8 | 20 / 35 | 5109 |
| 6 | 1 | 69.8 | 90.5 | 22 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 81 | 77% |
| cre.Karolos 0.32 | 37 | 81% |
| stelo.AreaTargetingBot 1.1 | 21 | 95% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 89% |
| sample.Walls 1.0 | 8 | 88% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 41 | 54% | 101 |
| cre.Karolos 0.32 | 19 | 25% | 54 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 9 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 8 |

## Melee bench: F24

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 72.0 | 46 / 210 | 3.52 | 14.3% | 22294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.6% | 55 |
| hadur117.mini.DeiseREACH 0.3 | 1.8 | 14.3% | 46 |
| florent.XSeries.X2 0.12 | 3.3 | 13.5% | 41 |
| davidalves.Phoenix 0.54 | 3.7 | 13.4% | 42 |
| pedersen.Ugluk 1.1.1 | 4.7 | 12.0% | 23 |
| oog.melee.Corsair 1.0 | 5.8 | 9.6% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.4% | 2 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.0% | 2 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 72.1 | 10 / 35 | 3747 |
| 2 | 1 | 61.7 | 71.7 | 8 / 35 | 3755 |
| 3 | 2 | 62.0 | 73.0 | 8 / 35 | 3550 |
| 4 | 3 | 62.6 | 74.9 | 6 / 35 | 3786 |
| 5 | 1 | 61.3 | 70.8 | 6 / 35 | 3999 |
| 6 | 2 | 60.3 | 69.2 | 8 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 21 | 57% |
| rz.GlowBlowMelee 1.4 | 19 | 42% |
| davidalves.Phoenix 0.54 | 15 | 60% |
| pedersen.Ugluk 1.1.1 | 13 | 62% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 25% | 52 |
| pedersen.Ugluk 1.1.1 | 38 | 23% | 45 |
| florent.XSeries.X2 0.12 | 36 | 22% | 48 |
| davidalves.Phoenix 0.54 | 23 | 14% | 30 |
| oog.melee.Corsair 1.0 | 12 | 7% | 19 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 8 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 5 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.8 | 117 / 210 | 2.64 | 17.6% | 26198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.6% | 117 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.5% | 21 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 13.1% | 22 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.0% | 6 |
| ds.Oo 2.2 | 6.7 | 8.2% | 4 |
| awesomeness.Elite 1.0 | 7.5 | 7.6% | 6 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.5% | 5 |
| adt.Ar2 1.1 | 7.8 | 7.4% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 73.0 | 13 / 35 | 3909 |
| 2 | 1 | 68.5 | 88.3 | 21 / 35 | 4656 |
| 3 | 1 | 67.0 | 81.3 | 20 / 35 | 4648 |
| 4 | 1 | 66.4 | 82.2 | 22 / 35 | 4200 |
| 5 | 1 | 66.3 | 81.3 | 20 / 35 | 4362 |
| 6 | 1 | 67.6 | 84.8 | 21 / 35 | 4423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 91% |
| voidious.mini.BrokenSword 2.0.3 | 36 | 83% |
| jdw.Hurricane 1.4 | 26 | 81% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 100% |
| adt.Ar2 1.1 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |
| ds.Oo 2.2 | 3 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 30% | 66 |
| jdw.Hurricane 1.4 | 23 | 25% | 44 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 23% | 49 |
| gre.svman4.Morfeas 1.4.1 | 5 | 5% | 11 |
| adt.Ar2 1.1 | 5 | 5% | 10 |
| awesomeness.Elite 1.0 | 5 | 5% | 6 |
| ds.Oo 2.2 | 4 | 4% | 10 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 14 |

## Melee bench: F26

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 86 / 210 | 2.49 | 17.7% | 33004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.7% | 86 |
| ak.Fermat 2.0 | 2.3 | 14.4% | 44 |
| lrem.Spectre 0.4.4 | 3.3 | 12.9% | 30 |
| shu.nitro.LENIN .T34 | 3.5 | 13.0% | 37 |
| js.PinBall 1.6 | 5.2 | 10.4% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.8 | 11 / 35 | 5415 |
| 2 | 1 | 67.2 | 82.9 | 17 / 35 | 5226 |
| 3 | 1 | 66.6 | 81.3 | 14 / 35 | 5125 |
| 4 | 1 | 68.9 | 87.9 | 14 / 35 | 5950 |
| 5 | 1 | 68.0 | 85.4 | 15 / 35 | 5489 |
| 6 | 1 | 68.8 | 86.3 | 15 / 35 | 5799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 39 | 64% |
| lrem.Spectre 0.4.4 | 39 | 64% |
| ak.Fermat 2.0 | 19 | 58% |
| js.PinBall 1.6 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 38 | 31% | 52 |
| lrem.Spectre 0.4.4 | 36 | 29% | 58 |
| shu.nitro.LENIN .T34 | 28 | 23% | 57 |
| jaybot.adv.bots.JayBot 2.0 | 11 | 9% | 15 |
| js.PinBall 1.6 | 5 | 4% | 13 |
| gh.mini.GrubbmOne 1.0 | 4 | 3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.2 | 124 / 210 | 2.24 | 18.0% | 26574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.0% | 124 |
| mk.Alpha 0.2.1 | 3.0 | 12.9% | 34 |
| EH.Eagle 1.0.6 | 3.5 | 11.3% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.5% | 11 |
| wee.Gem 1.8.4 | 4.5 | 10.8% | 25 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.5% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.5% | 2 |
| throxbot.ThroxBot 0.1 | 8.3 | 6.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.4 | 20 / 35 | 4543 |
| 2 | 1 | 66.5 | 84.1 | 18 / 35 | 4352 |
| 3 | 1 | 65.8 | 81.0 | 16 / 35 | 4431 |
| 4 | 1 | 67.2 | 87.6 | 22 / 35 | 4270 |
| 5 | 1 | 66.4 | 84.4 | 18 / 35 | 4347 |
| 6 | 1 | 69.9 | 94.6 | 30 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 57 | 81% |
| wee.Gem 1.8.4 | 28 | 68% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 86% |
| EH.Eagle 1.0.6 | 19 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| throxbot.ThroxBot 0.1 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 30 | 35% | 71 |
| wee.Gem 1.8.4 | 17 | 20% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 14% | 35 |
| EH.Eagle 1.0.6 | 10 | 12% | 28 |
| joe.ADinosaur 1.0 | 7 | 8% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 11 |
| throxbot.ThroxBot 0.1 | 2 | 2% | 4 |

## Melee bench: F28

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.7 | 120 / 210 | 2.20 | 18.4% | 28004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.4% | 120 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 37 |
| uji.Antique 1.0 | 3.5 | 11.6% | 25 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.7% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 1 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 5 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| matt.advanced.Katana 1.0 | 8.8 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.6 | 21 / 35 | 4783 |
| 2 | 1 | 64.7 | 78.1 | 15 / 35 | 4285 |
| 3 | 1 | 67.1 | 86.7 | 19 / 35 | 4358 |
| 4 | 1 | 69.4 | 91.1 | 22 / 35 | 5004 |
| 5 | 1 | 68.4 | 87.0 | 21 / 35 | 4912 |
| 6 | 1 | 68.4 | 88.6 | 22 / 35 | 4662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 77 | 68% |
| uji.Antique 1.0 | 32 | 94% |
| qohnil.blot.BlotBot 3.61 | 21 | 71% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 42 | 46% | 100 |
| uji.Antique 1.0 | 14 | 15% | 36 |
| qohnil.blot.BlotBot 3.61 | 12 | 13% | 30 |
| amk.ChumbaWumba 0.3 | 10 | 11% | 14 |
| pfvicm.Sobieski 7.2.3b | 7 | 8% | 16 |
| matt.advanced.Katana 1.0 | 3 | 3% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 8 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F29

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.6 | 95 / 210 | 2.74 | 17.8% | 30115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.8% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.3% | 53 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 41 |
| myl.micro.Troodon 1.10 | 4.3 | 12.4% | 10 |
| jok.PheonixM 0.1.2 | 4.7 | 10.6% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.5% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 7.0% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.6% | 3 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 14 / 35 | 5084 |
| 2 | 1 | 67.4 | 80.3 | 18 / 35 | 4840 |
| 3 | 1 | 68.0 | 82.2 | 16 / 35 | 5077 |
| 4 | 1 | 67.5 | 78.7 | 15 / 35 | 5136 |
| 5 | 1 | 66.9 | 78.7 | 14 / 35 | 5139 |
| 6 | 1 | 67.9 | 81.9 | 18 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 74% |
| zyx.mega.YersiniaPestis 3.1 | 38 | 71% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 32% | 69 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 32% | 66 |
| myl.micro.Troodon 1.10 | 20 | 17% | 38 |
| jok.PheonixM 0.1.2 | 15 | 13% | 22 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |

## Melee bench: F30

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.1 | 32 / 210 | 3.60 | 13.9% | 22666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 2.2 | 13.9% | 32 |
| darkcanuck.B26354 1.06 | 2.3 | 13.8% | 53 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 40 |
| catcat20.Matcha 0.006 | 3.8 | 13.3% | 44 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.9% | 28 |
| intruder.PrairieWolf 2.61 | 6.8 | 8.0% | 5 |
| ntc.Opposite 1.5 | 7.3 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 6 |
| tripphippy.Alice 1.1 | 8.0 | 6.5% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.3 | 4 / 35 | 4161 |
| 2 | 1 | 62.3 | 73.0 | 6 / 35 | 4131 |
| 3 | 1 | 61.4 | 70.8 | 11 / 35 | 3468 |
| 4 | 3 | 59.0 | 68.3 | 4 / 35 | 3503 |
| 5 | 2 | 61.8 | 72.1 | 6 / 35 | 3830 |
| 6 | 4 | 58.9 | 68.3 | 1 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 16 | 50% |
| catcat20.Matcha 0.006 | 16 | 38% |
| oog.melee.Capulet 1.2 | 16 | 63% |
| darkcanuck.B26354 1.06 | 16 | 31% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 60% |

Hadur died in 179 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 50 | 28% | 56 |
| catcat20.Matcha 0.006 | 35 | 20% | 41 |
| stelo.PastFuture 2.3.2 | 34 | 19% | 43 |
| oog.melee.Capulet 1.2 | 30 | 17% | 39 |
| ntc.Opposite 1.5 | 9 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 8 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 8 |
| tripphippy.Alice 1.1 | 6 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.7 | 44 / 210 | 3.63 | 13.9% | 20729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 106 |
| hadur117.mini.DeiseREACH 0.3 | 2.3 | 13.9% | 44 |
| gh.mini.Griezel 0.2 | 2.7 | 13.4% | 32 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 12.3% | 19 |
| d414.nano.Quantum 1.0.0 | 5.2 | 10.5% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 1 |
| fm.mammillarias 1.3 | 7.2 | 6.9% | 1 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.0 | 10 / 35 | 3858 |
| 2 | 3 | 59.9 | 68.3 | 8 / 35 | 3236 |
| 3 | 2 | 62.0 | 71.4 | 8 / 35 | 3807 |
| 4 | 3 | 60.9 | 71.7 | 6 / 35 | 3365 |
| 5 | 2 | 60.7 | 71.7 | 4 / 35 | 3202 |
| 6 | 2 | 59.8 | 67.3 | 8 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 38 | 45% |
| spinnercat.micro.Tyger 0.1 | 17 | 76% |
| gh.mini.Griezel 0.2 | 10 | 60% |
| d414.nano.Quantum 1.0.0 | 7 | 71% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 48 | 29% | 64 |
| gh.mini.Griezel 0.2 | 45 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 29 | 17% | 39 |
| d414.nano.Quantum 1.0.0 | 21 | 13% | 28 |
| fm.mammillarias 1.3 | 8 | 5% | 8 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.2 | 124 / 210 | 2.15 | 18.7% | 31311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.7% | 124 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.4% | 43 |
| apc.botM 3.0 | 3.2 | 11.5% | 24 |
| lxx.ConceptA 0.8 | 4.3 | 10.8% | 5 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 5.5 | 9.5% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.6% | 0 |
| yk.JahMicro 1.0 | 8.8 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.2 | 15 / 35 | 5200 |
| 2 | 1 | 69.8 | 92.7 | 22 / 35 | 5642 |
| 3 | 1 | 66.4 | 83.5 | 20 / 35 | 4671 |
| 4 | 1 | 68.3 | 86.3 | 23 / 35 | 5153 |
| 5 | 1 | 69.2 | 90.8 | 23 / 35 | 5166 |
| 6 | 1 | 68.8 | 87.9 | 21 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 72% |
| apc.botM 3.0 | 20 | 50% |
| lxx.ConceptA 0.8 | 20 | 90% |
| vjik.UnViolation 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| panzer.Panzer 0.2 | 8 | 75% |
| donjezza.Jezza 1.0 | 7 | 86% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 35% | 94 |
| apc.botM 3.0 | 21 | 24% | 37 |
| lxx.ConceptA 0.8 | 12 | 14% | 20 |
| vjik.UnViolation 1.1 | 5 | 6% | 21 |
| bayen.UbaMicro 1.4 | 5 | 6% | 12 |
| panzer.Panzer 0.2 | 5 | 6% | 6 |
| yk.JahMicro 1.0 | 3 | 3% | 8 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |

## Melee bench: F33

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.0 | 124 / 210 | 2.17 | 19.1% | 31039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.1% | 124 |
| maribo.Quester 0.3 | 2.2 | 15.3% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.7% | 16 |
| labg.Cataclysm 2.05 | 4.3 | 10.8% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.6% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.5% | 4 |
| baal.nano.N 1.42 | 6.7 | 8.3% | 0 |
| sanja.First 0.1 | 8.5 | 5.2% | 0 |
| zyx.micro.Ant 1.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.5 | 20 / 35 | 5281 |
| 2 | 1 | 67.7 | 83.5 | 17 / 35 | 4838 |
| 3 | 1 | 68.8 | 86.7 | 22 / 35 | 4783 |
| 4 | 1 | 68.4 | 83.8 | 19 / 35 | 5182 |
| 5 | 1 | 68.7 | 85.4 | 21 / 35 | 5308 |
| 6 | 1 | 70.8 | 92.1 | 25 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 46 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 91% |
| gre.svman4.Leonidas 1.3.2 | 28 | 100% |
| labg.Cataclysm 2.05 | 19 | 68% |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 81% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 44% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 19% | 54 |
| labg.Cataclysm 2.05 | 15 | 17% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 13 |
| gre.svman4.Leonidas 1.3.2 | 7 | 8% | 25 |
| baal.nano.N 1.42 | 1 | 1% | 7 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.2 | 57 / 210 | 2.70 | 16.6% | 28866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.8 | 17.1% | 59 |
| stelo.Spread 0.9 | 1.8 | 17.0% | 76 |
| hadur117.mini.DeiseREACH 0.3 | 2.3 | 16.6% | 57 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 12 |
| tcf.Reach 3 | 5.2 | 10.2% | 3 |
| cli.Dancer 1.1 | 5.5 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 82.5 | 11 / 35 | 5055 |
| 2 | 1 | 68.5 | 86.0 | 12 / 35 | 5268 |
| 3 | 3 | 66.1 | 79.4 | 8 / 35 | 4660 |
| 4 | 3 | 65.8 | 80.3 | 12 / 35 | 4361 |
| 5 | 2 | 65.8 | 80.0 | 9 / 35 | 4552 |
| 6 | 3 | 65.4 | 78.7 | 5 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 56% |
| kid.Gladiator .7.2 | 34 | 32% |
| jcs.Seth 1.8 | 8 | 75% |
| tcf.Reach 3 | 5 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |
| cli.Dancer 1.1 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 78 | 51% | 85 |
| stelo.Spread 0.9 | 55 | 36% | 83 |
| tcf.Reach 3 | 10 | 7% | 18 |
| jcs.Seth 1.8 | 7 | 5% | 17 |
| cli.Dancer 1.1 | 2 | 1% | 2 |
| ratosh.Wesco 1.4 | 1 | 1% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.0 | 34 / 210 | 2.98 | 15.1% | 22931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 147 |
| hadur117.mini.DeiseREACH 0.3 | 2.0 | 15.1% | 34 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 19 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.1% | 8 |
| wit.Chuliath 1.0 | 6.7 | 6.6% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.8 | 8 / 35 | 4199 |
| 2 | 2 | 64.0 | 79.7 | 4 / 35 | 3971 |
| 3 | 2 | 62.1 | 73.0 | 3 / 35 | 3638 |
| 4 | 2 | 63.7 | 80.0 | 7 / 35 | 3632 |
| 5 | 2 | 64.7 | 81.3 | 7 / 35 | 3937 |
| 6 | 2 | 62.7 | 76.2 | 5 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 20% |
| gh.mini.Gruwel 0.9 | 11 | 45% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| rz.HawkOnFire 0.1 | 5 | 60% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 51% | 104 |
| gh.mini.Gruwel 0.9 | 38 | 21% | 46 |
| rz.HawkOnFire 0.1 | 23 | 13% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 8% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 156 / 210 | 1.87 | 20.4% | 33634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 20.4% | 156 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 12 |
| bzdp.Pansy 2.1 | 3.2 | 11.8% | 5 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 13 |
| mz.Cork 0.1 | 4.8 | 10.5% | 10 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.5% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.4% | 9 |
| dl.BetterWalls 1.0 | 8.3 | 6.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 27 / 35 | 5644 |
| 2 | 1 | 71.0 | 92.4 | 27 / 35 | 5486 |
| 3 | 1 | 71.2 | 92.4 | 29 / 35 | 5735 |
| 4 | 1 | 67.9 | 83.5 | 20 / 35 | 5218 |
| 5 | 1 | 70.3 | 87.9 | 26 / 35 | 5964 |
| 6 | 1 | 71.3 | 94.3 | 27 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 98% |
| bvh.micro.Freya 0.3 | 31 | 94% |
| alpha.RainingFire 1.0 | 27 | 89% |
| mz.Cork 0.1 | 25 | 92% |
| bvh.mini.Fenrir 0.39 | 18 | 94% |
| dl.BetterWalls 1.0 | 9 | 100% |
| m3thos.Eva02 0.7.1 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |

Hadur died in 54 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 22% | 64 |
| alpha.RainingFire 1.0 | 12 | 22% | 37 |
| bvh.micro.Freya 0.3 | 10 | 19% | 30 |
| bvh.mini.Fenrir 0.39 | 8 | 15% | 15 |
| mz.Cork 0.1 | 4 | 7% | 30 |
| m3thos.Eva02 0.7.1 | 4 | 7% | 17 |
| dl.BetterWalls 1.0 | 3 | 6% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.9 | 174 / 210 | 1.64 | 20.3% | 34674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 20.3% | 174 |
| germ.TheMind .2 | 2.3 | 11.1% | 3 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 9.8% | 10 |
| EBBU.Sim2 1.02 | 4.2 | 9.7% | 2 |
| stelo.UntouchableNano 1.3 | 4.5 | 9.2% | 9 |
| agrach.Dalek 1.0 | 6.0 | 9.0% | 4 |
| mb.Beast 0.1 | 7.8 | 7.9% | 2 |
| skm.Ryubot 1.0 | 8.0 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 1 |
| lmk.ACPFinal 0.1 | 9.0 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.2 | 27 / 35 | 5450 |
| 2 | 1 | 70.1 | 90.8 | 29 / 35 | 6203 |
| 3 | 1 | 70.7 | 97.8 | 32 / 35 | 5736 |
| 4 | 1 | 70.8 | 97.1 | 30 / 35 | 5957 |
| 5 | 1 | 68.7 | 90.8 | 27 / 35 | 5519 |
| 6 | 1 | 69.6 | 91.4 | 29 / 35 | 5809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 100% |
| stelo.UntouchableNano 1.3 | 29 | 90% |
| agrach.Dalek 1.0 | 28 | 100% |
| EBBU.Sim2 1.02 | 24 | 100% |
| skm.Ryubot 1.0 | 17 | 94% |
| mb.Beast 0.1 | 12 | 92% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 83% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 36 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 22% | 30 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 17% | 25 |
| germ.TheMind .2 | 5 | 14% | 47 |
| EBBU.Sim2 1.02 | 4 | 11% | 22 |
| agrach.Dalek 1.0 | 3 | 8% | 32 |
| lmk.ACPFinal 0.1 | 3 | 8% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 9 |
| mb.Beast 0.1 | 2 | 6% | 18 |
| skm.Ryubot 1.0 | 2 | 6% | 8 |

## Melee bench: F38

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.9 | 67 / 210 | 3.08 | 15.5% | 24593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.4% | 80 |
| hadur117.mini.DeiseREACH 0.3 | 1.7 | 15.5% | 67 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 17 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.2% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.3% | 9 |
| cs.Wren 1.0 | 5.2 | 10.9% | 8 |
| kdf.KoulDestroyer 1.0 | 7.3 | 7.9% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.5% | 5 |
| bzdp.BoxCar 2.0 | 9.3 | 3.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 72.4 | 8 / 35 | 4020 |
| 2 | 1 | 65.4 | 81.3 | 16 / 35 | 4140 |
| 3 | 2 | 62.8 | 72.1 | 9 / 35 | 4166 |
| 4 | 1 | 66.8 | 85.4 | 15 / 35 | 4328 |
| 5 | 2 | 63.6 | 74.9 | 9 / 35 | 4023 |
| 6 | 2 | 63.0 | 75.2 | 10 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 33 | 55% |
| bvh.mini.Freya 0.55 | 18 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 87% |
| cs.Wren 1.0 | 13 | 85% |
| bts.mega.Gnarly 1.4 | 11 | 82% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 35% | 69 |
| bvh.mini.Freya 0.55 | 24 | 17% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 16% | 37 |
| bts.mega.Gnarly 1.4 | 20 | 14% | 35 |
| cs.Wren 1.0 | 13 | 9% | 21 |
| kdf.KoulDestroyer 1.0 | 6 | 4% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 7 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.5 | 69 / 210 | 2.84 | 16.6% | 29421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 16.6% | 69 |
| bvh.fry.Freya 0.82 | 2.2 | 15.2% | 35 |
| az.Ololobot 0.2.4 | 3.2 | 12.9% | 59 |
| catcat20.Lambda 0.024 | 3.7 | 11.7% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.1% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.0% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.5% | 1 |
| gimp.GimpBot 0.1 | 7.0 | 7.8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 78.7 | 11 / 35 | 4970 |
| 2 | 1 | 64.8 | 79.7 | 9 / 35 | 4871 |
| 3 | 1 | 65.5 | 81.9 | 12 / 35 | 4831 |
| 4 | 1 | 64.5 | 77.1 | 10 / 35 | 4963 |
| 5 | 1 | 66.5 | 81.0 | 16 / 35 | 5174 |
| 6 | 1 | 64.4 | 78.7 | 11 / 35 | 4612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 35 | 74% |
| az.Ololobot 0.2.4 | 35 | 40% |
| catcat20.Lambda 0.024 | 24 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 64% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 55 | 39% | 77 |
| az.Ololobot 0.2.4 | 31 | 22% | 44 |
| catcat20.Lambda 0.024 | 26 | 18% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 11% | 19 |
| gimp.GimpBot 0.1 | 6 | 4% | 13 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 1% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.7 | 101 / 210 | 2.73 | 17.4% | 28477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.4% | 101 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.9% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.9% | 26 |
| mz.AntiGrav 1.0 | 4.7 | 10.6% | 13 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.4% | 9 |
| stelo.Randomness 1.0 | 5.3 | 10.0% | 13 |
| alpha.BlackIce 1.0 | 6.7 | 9.0% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 0 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 18 / 35 | 4606 |
| 2 | 1 | 66.9 | 80.6 | 17 / 35 | 5046 |
| 3 | 1 | 65.3 | 78.1 | 16 / 35 | 4465 |
| 4 | 1 | 66.5 | 81.3 | 16 / 35 | 4708 |
| 5 | 1 | 67.4 | 86.3 | 17 / 35 | 4569 |
| 6 | 1 | 66.8 | 80.3 | 17 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 51 | 82% |
| kano.gamma.KanoGamma 1.8 | 18 | 56% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| mz.AntiGrav 1.0 | 15 | 93% |
| stelo.Randomness 1.0 | 11 | 91% |
| alpha.BlackIce 1.0 | 8 | 75% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 31% | 55 |
| kano.gamma.KanoGamma 1.8 | 25 | 23% | 44 |
| Polkwane.SmashMelee 1.0 | 15 | 14% | 27 |
| stelo.Randomness 1.0 | 11 | 10% | 27 |
| mz.AntiGrav 1.0 | 10 | 9% | 26 |
| amk.superstrike.SuperStrike 0.3 | 6 | 6% | 7 |
| alpha.BlackIce 1.0 | 5 | 5% | 16 |
| sample.Corners 1.0 | 2 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.5 | 82 / 210 | 2.84 | 16.4% | 25368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.2% | 80 |
| hadur117.mini.DeiseREACH 0.3 | 1.7 | 16.4% | 82 |
| ary.Swarm 1.1 | 3.7 | 12.9% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.3% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 12 |
| shrub.Silver v048 | 6.3 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 77.1 | 11 / 35 | 4222 |
| 2 | 2 | 64.1 | 76.8 | 12 / 35 | 3820 |
| 3 | 2 | 64.7 | 75.2 | 15 / 35 | 4273 |
| 4 | 1 | 66.4 | 81.3 | 16 / 35 | 4445 |
| 5 | 2 | 66.2 | 82.9 | 14 / 35 | 4172 |
| 6 | 1 | 66.8 | 83.8 | 14 / 35 | 4436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 46 | 37% |
| ary.Swarm 1.1 | 29 | 86% |
| lessonz.robocode.Oz 0.5.0 | 19 | 95% |
| simonton.nano.MeleeSeed 1.8 | 18 | 83% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 47 | 36% | 69 |
| ary.Swarm 1.1 | 27 | 21% | 53 |
| lessonz.robocode.Oz 0.5.0 | 23 | 18% | 34 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 29 |
| shrub.Silver v048 | 6 | 5% | 8 |
| jsal.Jsalbot 1.0 | 5 | 4% | 7 |
| zyx.nano.Ant 1.1 | 4 | 3% | 4 |
| stelo.Mirror 1.1 | 3 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.7 | 94 / 210 | 2.47 | 17.8% | 31410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 17.8% | 94 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 48 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.1% | 28 |
| ara.Shera 0.88 | 4.0 | 13.0% | 30 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 5 |
| maribo.IotaCT 1.1 | 6.3 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.5 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| stelo.MirrorMicro 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 15 / 35 | 5080 |
| 2 | 1 | 67.3 | 82.5 | 16 / 35 | 5263 |
| 3 | 1 | 67.3 | 84.1 | 13 / 35 | 5369 |
| 4 | 1 | 68.0 | 85.1 | 20 / 35 | 5172 |
| 5 | 1 | 68.1 | 85.7 | 16 / 35 | 5420 |
| 6 | 1 | 66.3 | 82.2 | 14 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.mini.MiniQuester 0.1 | 41 | 63% |
| wompi.Wallaby 5.1 | 38 | 89% |
| ara.Shera 0.88 | 29 | 69% |
| dsw.StaticD 1.0 | 12 | 92% |
| amz.NanoClone 1.41 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.mini.MiniQuester 0.1 | 36 | 31% | 59 |
| ara.Shera 0.88 | 34 | 29% | 53 |
| wompi.Wallaby 5.1 | 25 | 22% | 62 |
| amz.NanoClone 1.41 | 8 | 7% | 9 |
| maribo.IotaCT 1.1 | 6 | 5% | 9 |
| dsw.StaticD 1.0 | 2 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 70.8 | 25 / 210 | 3.62 | 14.0% | 23105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 155 |
| hadur117.mini.DeiseREACH 0.3 | 2.3 | 14.0% | 25 |
| brainfade.melee.Dusk 0.44 | 2.8 | 13.3% | 18 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.1% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.7% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.3% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.1 | 5 / 35 | 3906 |
| 2 | 2 | 64.0 | 73.7 | 5 / 35 | 4136 |
| 3 | 2 | 63.2 | 72.4 | 4 / 35 | 3950 |
| 4 | 2 | 64.1 | 73.3 | 6 / 35 | 3940 |
| 5 | 3 | 60.8 | 67.9 | 2 / 35 | 3287 |
| 6 | 3 | 61.4 | 65.7 | 3 / 35 | 3886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 53 | 21% |
| brainfade.melee.Dusk 0.44 | 8 | 75% |
| dummy.micro.Sparrow 2.5 | 4 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 42% | 90 |
| brainfade.melee.Dusk 0.44 | 34 | 18% | 40 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 11% | 23 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 25 |
| Krabb.akim2.Akim2 1.1b | 17 | 9% | 17 |
| mz.NanoGod 2.02 | 8 | 4% | 8 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.3 | 105 / 210 | 2.32 | 18.6% | 32240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 18.6% | 105 |
| stelo.Liblix 0.3.1 | 2.2 | 16.4% | 67 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.2% | 30 |
| wompi.Quokka 1.6 | 4.5 | 9.8% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.4% | 0 |
| disan.Chair 2.2.0 | 6.3 | 8.1% | 2 |
| jwirde.Gort 2.0 | 6.5 | 8.2% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.9 | 18 / 35 | 5779 |
| 2 | 1 | 67.3 | 83.8 | 10 / 35 | 5145 |
| 3 | 1 | 68.1 | 84.8 | 17 / 35 | 5229 |
| 4 | 1 | 68.8 | 84.1 | 20 / 35 | 5435 |
| 5 | 1 | 69.8 | 90.2 | 23 / 35 | 5293 |
| 6 | 1 | 67.7 | 81.0 | 17 / 35 | 5359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 73% |
| tzu.TheArtOfWar 1.2 | 39 | 56% |
| wompi.Quokka 1.6 | 12 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| disan.Chair 2.2.0 | 6 | 83% |
| jwirde.Gort 2.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 48% | 106 |
| tzu.TheArtOfWar 1.2 | 34 | 32% | 58 |
| wompi.Quokka 1.6 | 9 | 9% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 13 |
| disan.Chair 2.2.0 | 3 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| jwirde.Gort 2.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.9 | 76 / 210 | 2.27 | 19.3% | 36732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseREACH 0.3 | 1.0 | 19.3% | 76 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.1% | 107 |
| myl.nano.Graviton 1.10 | 3.5 | 10.9% | 7 |
| jje.BagPuss 1.2 | 3.7 | 11.1% | 10 |
| sul.Lunar 1.1 | 4.5 | 10.2% | 5 |
| hvilela.HVilela 0.9 | 6.7 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.0% | 1 |
| fm.claire 1.7 | 7.8 | 8.0% | 0 |
| wit.Deep7 2.0 | 8.7 | 6.6% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 9 / 35 | 5913 |
| 2 | 1 | 70.2 | 89.5 | 19 / 35 | 6300 |
| 3 | 1 | 67.8 | 82.2 | 12 / 35 | 5908 |
| 4 | 1 | 68.5 | 84.1 | 14 / 35 | 6063 |
| 5 | 1 | 69.7 | 87.0 | 11 / 35 | 6610 |
| 6 | 1 | 68.3 | 84.8 | 11 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 112 | 29% |
| myl.nano.Graviton 1.10 | 17 | 82% |
| sul.Lunar 1.1 | 12 | 100% |
| jje.BagPuss 1.2 | 12 | 67% |
| wit.Deep7 2.0 | 5 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 1975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 60% | 0 |
| jje.BagPuss 1.2 | 13 | 10% | 52 |
| myl.nano.Graviton 1.10 | 13 | 10% | 50 |
| sul.Lunar 1.1 | 10 | 7% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 18 |
| fm.claire 1.7 | 6 | 4% | 15 |
| hvilela.HVilela 0.9 | 2 | 1% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseREACH 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.2 | 50 / 210 | 2.79 | 15.6% | 24619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.1% | 88 |
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 60 |
| hadur117.mini.DeiseREACH 0.3 | 3.0 | 15.6% | 50 |
| mz.MicroSheep 1.0 | 4.0 | 10.6% | 5 |
| cx.Princess 1.0 | 5.2 | 9.8% | 6 |
| sadoner.killer 0.2 | 5.8 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 78.7 | 7 / 35 | 3882 |
| 2 | 3 | 64.8 | 80.6 | 12 / 35 | 3972 |
| 3 | 3 | 64.2 | 77.8 | 7 / 35 | 4334 |
| 4 | 3 | 64.3 | 81.0 | 6 / 35 | 4159 |
| 5 | 3 | 64.6 | 80.0 | 8 / 35 | 4022 |
| 6 | 3 | 65.8 | 82.9 | 10 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 44 | 30% |
| kc.mini.Mirage 0.2 | 36 | 53% |
| cx.Princess 1.0 | 10 | 80% |
| mz.MicroSheep 1.0 | 8 | 88% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 46% | 98 |
| rsalesc.melee.Medina 0.4.5 | 60 | 38% | 73 |
| mz.MicroSheep 1.0 | 11 | 7% | 14 |
| cx.Princess 1.0 | 8 | 5% | 12 |
| sadoner.killer 0.2 | 4 | 3% | 4 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 7 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |

