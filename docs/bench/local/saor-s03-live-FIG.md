# Bench suite: suite.txt

## Melee bench: F01

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.2 | 26 / 280 | 3.41 | 14.8% | 38157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 220 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.6 | 11.2% | 6 |
| sgp.JollyNinja 3.53 | 4.0 | 11.4% | 13 |
| mz.MicroGodMelee 1 | 5.1 | 10.2% | 9 |
| lorneswork.Predator 1.0 | 5.3 | 10.3% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| skm.butterfly 1.0 | 8.4 | 5.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.6 | 5.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 70.8 | 4 / 35 | 5161 |
| 2 | 2 | 63.2 | 71.7 | 0 / 35 | 5248 |
| 3 | 2 | 64.6 | 79.0 | 3 / 35 | 4698 |
| 4 | 2 | 63.3 | 70.5 | 4 / 35 | 5038 |
| 5 | 2 | 62.4 | 70.5 | 6 / 35 | 4523 |
| 6 | 2 | 61.5 | 71.1 | 2 / 35 | 4163 |
| 7 | 2 | 63.3 | 75.6 | 1 / 35 | 4715 |
| 8 | 2 | 64.6 | 76.2 | 6 / 35 | 4611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 2% |
| sgp.JollyNinja 3.53 | 17 | 82% |
| mz.MicroGodMelee 1 | 10 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 67% |
| lorneswork.Predator 1.0 | 2 | 50% |

Hadur died in 254 of 280 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 62% | 163 |
| sgp.JollyNinja 3.53 | 23 | 9% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 9% | 28 |
| mz.MicroGodMelee 1 | 18 | 7% | 25 |
| lorneswork.Predator 1.0 | 17 | 7% | 18 |
| adt.Ar2 1.0 | 9 | 4% | 10 |
| skm.butterfly 1.0 | 4 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |

## Melee bench: F02

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.0 | 107 / 280 | 2.98 | 17.3% | 41511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.3% | 107 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 71 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.2% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.6% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.8% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.1 | 8.8% | 6 |
| sch.Simone 0.3d | 7.1 | 7.8% | 14 |
| Noran.BitchingElk 0.054 | 7.5 | 7.5% | 15 |
| stelo.PatternRobot 1.0 | 8.8 | 6.3% | 7 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.6 | 12 / 35 | 5219 |
| 2 | 1 | 64.6 | 74.6 | 9 / 35 | 4945 |
| 3 | 1 | 67.5 | 82.5 | 15 / 35 | 5416 |
| 4 | 1 | 66.8 | 81.3 | 11 / 35 | 5431 |
| 5 | 1 | 66.1 | 76.5 | 19 / 35 | 4813 |
| 6 | 1 | 65.4 | 76.2 | 14 / 35 | 5015 |
| 7 | 1 | 66.0 | 77.5 | 13 / 35 | 5139 |
| 8 | 1 | 67.1 | 81.0 | 14 / 35 | 5533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 56% |
| pulsar.PulsarMax 0.8.9 | 55 | 42% |
| Noran.BitchingElk 0.054 | 17 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| sch.Simone 0.3d | 12 | 83% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 80% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 4 | 50% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 173 of 280 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 62 | 36% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 27% | 76 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 9% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 7% | 22 |
| stelo.PatternRobot 1.0 | 12 | 7% | 16 |
| sch.Simone 0.3d | 10 | 6% | 19 |
| fnc.bandit.Bandit 5.2.0 | 7 | 4% | 10 |
| Noran.BitchingElk 0.054 | 4 | 2% | 19 |
| fullsail.SweetTea 1.1 | 4 | 2% | 9 |

## Melee bench: F03

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.0 | 157 / 280 | 3.07 | 17.2% | 43258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.2% | 157 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 51 |
| vuen.Cake 2.51 | 3.4 | 12.5% | 33 |
| kawigi.nano.Lib 1.0 | 3.6 | 12.5% | 32 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 5 |
| adt.Ar1 2.1 | 6.4 | 8.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.6 | 7.3% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 6.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.0 | 23 / 35 | 6277 |
| 2 | 1 | 65.6 | 76.5 | 23 / 35 | 5041 |
| 3 | 1 | 65.0 | 74.3 | 19 / 35 | 5016 |
| 4 | 1 | 65.7 | 74.6 | 20 / 35 | 5023 |
| 5 | 1 | 63.4 | 68.3 | 15 / 35 | 5163 |
| 6 | 1 | 67.3 | 81.0 | 23 / 35 | 5369 |
| 7 | 1 | 65.0 | 73.7 | 17 / 35 | 5590 |
| 8 | 1 | 67.1 | 80.6 | 17 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 84% |
| kawigi.nano.Lib 1.0 | 58 | 90% |
| radnor.DoctorBob 1.42 | 45 | 80% |
| oa.weak.FlyMk1 0.1 | 9 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 26% | 80 |
| radnor.DoctorBob 1.42 | 30 | 24% | 65 |
| vuen.Cake 2.51 | 17 | 14% | 67 |
| urdos.URDOS 1.3 | 15 | 12% | 17 |
| adt.Ar1 2.1 | 9 | 7% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 5% | 11 |
| oa.weak.FlyMk1 0.1 | 4 | 3% | 13 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.4 | 8 / 280 | 3.30 | 15.6% | 44695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 258 |
| kc.micro.Figment 1.0 | 2.0 | 15.6% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 2 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 2 |
| tj.zombie1n 1.0.1 | 6.9 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.4 | 4.0% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 75.2 | 0 / 35 | 5806 |
| 2 | 2 | 66.3 | 77.8 | 2 / 35 | 5615 |
| 3 | 2 | 65.4 | 77.1 | 0 / 35 | 5355 |
| 4 | 2 | 64.1 | 70.5 | 1 / 35 | 5231 |
| 5 | 2 | 64.7 | 71.4 | 2 / 35 | 5444 |
| 6 | 2 | 66.6 | 76.8 | 1 / 35 | 6028 |
| 7 | 2 | 64.9 | 72.4 | 1 / 35 | 5469 |
| 8 | 2 | 65.4 | 74.0 | 1 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 103 | 2% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 2 | 50% |
| rampancy.Durandal 2.1d | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 272 of 280 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 210 | 77% | 216 |
| apc.LeeroyJenkins2 1.0 | 28 | 10% | 29 |
| josago.Jorgito 0.16 | 11 | 4% | 12 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| TNT.TNT 0.99.1 | 6 | 2% | 7 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F05

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 59.1 | 9 / 280 | 4.68 | 12.2% | 31749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.5% | 151 |
| justin.DemonicRage 3.4 | 1.9 | 17.3% | 95 |
| wompi.Numbat 2.1 | 3.3 | 13.1% | 17 |
| kc.micro.Figment 1.0 | 3.8 | 12.2% | 9 |
| ms.Ares 0.19 | 5.5 | 8.8% | 3 |
| axeBots.HataMoto 3.09 | 5.5 | 8.9% | 4 |
| supersample.SuperBoxBot 1.0 | 7.4 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.9 | 5.6% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 60.6 | 1 / 35 | 3951 |
| 2 | 3 | 60.7 | 66.3 | 1 / 35 | 4155 |
| 3 | 4 | 57.9 | 55.2 | 4 / 35 | 4170 |
| 4 | 4 | 59.1 | 61.6 | 0 / 35 | 4062 |
| 5 | 4 | 57.4 | 55.2 | 1 / 35 | 3912 |
| 6 | 3 | 57.5 | 58.7 | 1 / 35 | 3573 |
| 7 | 4 | 55.5 | 53.0 | 1 / 35 | 3614 |
| 8 | 4 | 59.5 | 61.9 | 0 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 25 | 12% |
| justin.DemonicRage 3.4 | 21 | 5% |
| wompi.Numbat 2.1 | 10 | 40% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 271 of 280 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 95 | 35% | 96 |
| cb.fire.Firestarter 2.0f | 85 | 31% | 88 |
| wompi.Numbat 2.1 | 34 | 13% | 38 |
| supersample.SuperBoxBot 1.0 | 18 | 7% | 18 |
| ms.Ares 0.19 | 14 | 5% | 15 |
| axeBots.HataMoto 3.09 | 12 | 4% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 8 |
| GarmBox.Oranges 1.0 | 4 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.1 | 129 / 280 | 3.06 | 16.6% | 35392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 16.6% | 129 |
| jekl.StoneGhost 0.7 | 2.1 | 14.6% | 42 |
| origin.SleepSiphon 1.7b | 2.8 | 14.0% | 76 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.1 | 11.5% | 18 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 3 |
| gg.Wolverine 2.0 | 6.8 | 8.3% | 6 |
| spinnercat.Omen 1.0 | 7.3 | 7.4% | 1 |
| DBall.NUKE 0.1 | 7.6 | 6.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.5% | 3 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.0 | 19 / 35 | 4651 |
| 2 | 1 | 65.5 | 80.6 | 13 / 35 | 4289 |
| 3 | 1 | 64.3 | 74.9 | 14 / 35 | 4358 |
| 4 | 1 | 67.0 | 85.7 | 15 / 35 | 4471 |
| 5 | 1 | 66.5 | 80.0 | 17 / 35 | 4572 |
| 6 | 2 | 59.9 | 61.0 | 12 / 35 | 3876 |
| 7 | 1 | 65.3 | 72.4 | 19 / 35 | 4618 |
| 8 | 1 | 67.0 | 81.9 | 20 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 67 | 87% |
| origin.SleepSiphon 1.7b | 54 | 44% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 81% |
| gg.Wolverine 2.0 | 12 | 83% |
| mld.Wisdom 1.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 51 | 33% | 85 |
| mld.Wisdom 1.0 | 32 | 21% | 45 |
| jekl.StoneGhost 0.7 | 24 | 16% | 66 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 14% | 42 |
| gg.Wolverine 2.0 | 10 | 7% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 8 |
| DBall.NUKE 0.1 | 4 | 3% | 7 |
| sample.Fire 1.0 | 4 | 3% | 5 |
| spinnercat.Omen 1.0 | 2 | 1% | 3 |

## Melee bench: F07

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.3 | 87 / 280 | 2.41 | 18.3% | 48146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 18.3% | 87 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.7% | 79 |
| rtk.Tachikoma 1.0 | 2.6 | 16.7% | 82 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 22 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.6% | 0 |
| sample.Target 1.0 | 9.4 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.0 | 11 / 35 | 5986 |
| 2 | 2 | 68.6 | 83.5 | 9 / 35 | 5958 |
| 3 | 1 | 71.1 | 88.6 | 17 / 35 | 6774 |
| 4 | 2 | 67.4 | 80.6 | 9 / 35 | 5261 |
| 5 | 1 | 69.6 | 84.4 | 10 / 35 | 6392 |
| 6 | 2 | 69.1 | 85.7 | 10 / 35 | 5696 |
| 7 | 1 | 69.2 | 83.2 | 11 / 35 | 6015 |
| 8 | 1 | 69.7 | 87.3 | 10 / 35 | 6064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 41% |
| rsalesc.melee.Monk 0.3.6c | 59 | 17% |
| oog.melee.CapuletDroid 1.1 | 27 | 81% |
| franzor.Lizt 1.3.1 | 23 | 57% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 193 of 280 rounds, at a mean tick of 1198. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 42% | 133 |
| rsalesc.melee.Monk 0.3.6c | 75 | 39% | 104 |
| oog.melee.CapuletDroid 1.1 | 17 | 9% | 19 |
| franzor.Lizt 1.3.1 | 11 | 6% | 3 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 10 |
| skm.PateranBotlock2 1.0 | 3 | 2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.9 | 117 / 280 | 3.08 | 17.4% | 42611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.4% | 117 |
| tm.Yuugao 1.0 | 2.5 | 12.7% | 63 |
| shrub.Vapour v159 | 2.9 | 12.2% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 11.2% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.6% | 23 |
| m3thos.Eva00 1.1 | 6.5 | 8.7% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.6% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.3% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.7% | 0 |
| SHAM.WOW 1.4 | 9.6 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 75.6 | 17 / 35 | 5418 |
| 2 | 1 | 64.7 | 72.1 | 11 / 35 | 5373 |
| 3 | 1 | 66.3 | 79.7 | 12 / 35 | 5437 |
| 4 | 1 | 67.0 | 79.4 | 17 / 35 | 5394 |
| 5 | 1 | 66.9 | 77.8 | 19 / 35 | 5227 |
| 6 | 1 | 64.1 | 70.8 | 11 / 35 | 5229 |
| 7 | 1 | 66.4 | 78.1 | 15 / 35 | 5319 |
| 8 | 1 | 67.1 | 81.6 | 15 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 40% |
| shrub.Vapour v159 | 42 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 31 | 68% |
| Krabb.sliNk.Garm 0.9u | 30 | 73% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 94% |
| SHAM.WOW 1.4 | 4 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 56 | 34% | 89 |
| shrub.Vapour v159 | 25 | 15% | 44 |
| com.spp.robocode.MostlyHarmless 010 | 24 | 15% | 48 |
| Krabb.sliNk.Garm 0.9u | 17 | 10% | 35 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 7% | 22 |
| SHAM.WOW 1.4 | 10 | 6% | 13 |
| zyx.nano.BacillusComma 1.0 | 10 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 4% | 8 |
| m3thos.Eva00 1.1 | 4 | 2% | 10 |

## Melee bench: F09

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 63.2 | 48 / 280 | 4.31 | 13.3% | 29934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 148 |
| kc.micro.Figment 1.0 | 2.5 | 13.3% | 48 |
| hadur117.micro.Saor 0.1 | 2.6 | 12.9% | 33 |
| yagami.Tidus 0.11 | 4.3 | 11.2% | 7 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.7% | 20 |
| mc2.enemy.Original 0.9 | 6.0 | 9.3% | 16 |
| dft.Calliope 5.6 | 7.1 | 8.0% | 7 |
| robar.nano.Assertive_Melee 0.2 | 8.4 | 5.9% | 0 |
| step.nanoPri 1.0 | 8.5 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 69.5 | 5 / 35 | 3794 |
| 2 | 2 | 59.5 | 65.7 | 7 / 35 | 3572 |
| 3 | 3 | 56.7 | 54.9 | 3 / 35 | 3826 |
| 4 | 2 | 58.3 | 59.0 | 5 / 35 | 3945 |
| 5 | 3 | 59.0 | 61.3 | 7 / 35 | 3736 |
| 6 | 3 | 60.0 | 65.1 | 9 / 35 | 3455 |
| 7 | 3 | 59.7 | 63.5 | 6 / 35 | 3809 |
| 8 | 2 | 60.5 | 66.3 | 6 / 35 | 3797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 15% |
| hadur117.micro.Saor 0.1 | 27 | 56% |
| mc2.enemy.Original 0.9 | 17 | 71% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 2 | 0% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 232 of 280 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 101 | 44% | 113 |
| hadur117.micro.Saor 0.1 | 62 | 27% | 80 |
| yagami.Tidus 0.11 | 18 | 8% | 20 |
| mc2.enemy.Original 0.9 | 14 | 6% | 25 |
| pedersen.Grishnakh 1.0 | 12 | 5% | 14 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 10 |
| rdm.Dueler 0.4x | 6 | 3% | 5 |
| step.nanoPri 1.0 | 5 | 2% | 7 |
| dft.Calliope 5.6 | 5 | 2% | 6 |

## Melee bench: F10

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.2 | 127 / 280 | 2.51 | 18.0% | 45295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 18.0% | 127 |
| DTF.Kludgy 1.2b | 1.8 | 15.6% | 95 |
| ne.Chimera 1.2 | 3.6 | 12.4% | 13 |
| ejb.Polaris 1.0.1 | 4.1 | 11.5% | 22 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.7% | 13 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 5 |
| sam.Samspin 1.0 | 7.5 | 6.0% | 2 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.6 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.6 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.7 | 22 / 35 | 5249 |
| 2 | 1 | 67.8 | 87.0 | 16 / 35 | 5226 |
| 3 | 2 | 63.6 | 68.9 | 9 / 35 | 5653 |
| 4 | 1 | 68.5 | 85.1 | 15 / 35 | 6380 |
| 5 | 1 | 67.9 | 84.1 | 17 / 35 | 5733 |
| 6 | 1 | 68.6 | 85.7 | 17 / 35 | 5972 |
| 7 | 2 | 67.0 | 83.5 | 10 / 35 | 5390 |
| 8 | 1 | 68.7 | 85.7 | 21 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 76 | 16% |
| ejb.Polaris 1.0.1 | 48 | 75% |
| ne.Chimera 1.2 | 37 | 89% |
| vStar.RAFzilla 2.15 | 24 | 96% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| kurios.DOSexe .9b | 4 | 75% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 94 | 61% | 104 |
| ejb.Polaris 1.0.1 | 16 | 10% | 53 |
| ne.Chimera 1.2 | 15 | 10% | 45 |
| kurios.DOSexe .9b | 8 | 5% | 14 |
| vStar.RAFzilla 2.15 | 5 | 3% | 27 |
| tvv.micro.Antares 1.1.1 | 5 | 3% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 3% | 4 |
| donjezza.Muncho 1.0 | 3 | 2% | 6 |
| sam.Samspin 1.0 | 3 | 2% | 5 |

## Melee bench: F11

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 8 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.2 | 69 / 280 | 3.68 | 15.2% | 36269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.7% | 139 |
| kc.micro.Figment 1.0 | 1.9 | 15.2% | 69 |
| cx.mini.Nimrod 0.55 | 3.1 | 11.7% | 23 |
| djc.DynaBot 0.1.1 | 3.9 | 10.8% | 20 |
| rdt199.Warlord 0.73 | 5.8 | 9.0% | 9 |
| br2.MobyDickBot 1.6 | 6.3 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 6.5 | 8.6% | 11 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 74.3 | 10 / 35 | 4378 |
| 2 | 1 | 64.5 | 72.1 | 13 / 35 | 4787 |
| 3 | 2 | 61.2 | 66.0 | 10 / 35 | 4172 |
| 4 | 2 | 62.9 | 69.8 | 8 / 35 | 4788 |
| 5 | 2 | 61.5 | 65.7 | 6 / 35 | 4600 |
| 6 | 2 | 62.4 | 69.2 | 7 / 35 | 4296 |
| 7 | 2 | 64.6 | 75.2 | 9 / 35 | 4867 |
| 8 | 2 | 62.3 | 69.5 | 6 / 35 | 4381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 76 | 21% |
| cx.mini.Nimrod 0.55 | 24 | 79% |
| djc.DynaBot 0.1.1 | 15 | 53% |
| rdt199.Warlord 0.73 | 10 | 100% |
| br2.MobyDickBot 1.6 | 10 | 90% |
| uji.YellohFellah 1.0 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 211 of 280 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 102 | 48% | 120 |
| cx.mini.Nimrod 0.55 | 26 | 12% | 40 |
| KiraNL.Chupacabra 0.4 | 18 | 9% | 19 |
| djc.DynaBot 0.1.1 | 15 | 7% | 24 |
| rdt199.Warlord 0.73 | 14 | 7% | 23 |
| br2.MobyDickBot 1.6 | 10 | 5% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 5% | 11 |
| uji.YellohFellah 1.0 | 9 | 4% | 14 |
| stelo.MirrorNano 1.3 | 7 | 3% | 8 |

## Melee bench: F12

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.3 | 118 / 280 | 2.95 | 16.6% | 32340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 16.6% | 118 |
| nat.PallasHawk 1.0 | 2.5 | 13.4% | 56 |
| bts.wiki.RipCurl 0.9b | 3.1 | 13.0% | 53 |
| darkcanuck.Leon 1.01 | 3.6 | 12.7% | 31 |
| brainfade.melee.Genghis 0.36 | 4.6 | 10.4% | 12 |
| jrm.Test0 1.0 | 6.6 | 7.9% | 1 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.6 | 7.3% | 0 |
| stuff.Vlad 0.1 | 9.1 | 5.8% | 3 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 72.1 | 8 / 35 | 3894 |
| 2 | 1 | 65.0 | 77.5 | 13 / 35 | 4023 |
| 3 | 2 | 64.2 | 76.5 | 12 / 35 | 3786 |
| 4 | 1 | 65.2 | 79.7 | 17 / 35 | 4093 |
| 5 | 1 | 65.8 | 78.7 | 18 / 35 | 4127 |
| 6 | 1 | 68.3 | 89.2 | 22 / 35 | 4225 |
| 7 | 1 | 66.7 | 83.2 | 17 / 35 | 4233 |
| 8 | 1 | 62.5 | 69.8 | 11 / 35 | 3959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 60 | 62% |
| bts.wiki.RipCurl 0.9b | 47 | 57% |
| darkcanuck.Leon 1.01 | 37 | 70% |
| brainfade.melee.Genghis 0.36 | 19 | 89% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 28% | 71 |
| nat.PallasHawk 1.0 | 43 | 27% | 77 |
| darkcanuck.Leon 1.01 | 27 | 17% | 61 |
| brainfade.melee.Genghis 0.36 | 17 | 10% | 26 |
| jrm.Test0 1.0 | 11 | 7% | 14 |
| cs.sheldor.Talon 1.1 | 8 | 5% | 12 |
| jp.Perpy 16.0 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 4 | 2% | 8 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |

## Melee bench: F13

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 64.3 | 15 / 280 | 4.21 | 13.1% | 33713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.1% | 75 |
| mn.Combat 3.25.0 | 1.5 | 17.2% | 142 |
| kc.micro.Figment 1.0 | 3.3 | 13.1% | 15 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 33 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.9% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.1 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 65.7 | 4 / 35 | 4230 |
| 2 | 3 | 62.5 | 68.3 | 3 / 35 | 4848 |
| 3 | 3 | 59.5 | 62.5 | 1 / 35 | 4117 |
| 4 | 3 | 59.0 | 64.1 | 3 / 35 | 3765 |
| 5 | 3 | 58.3 | 57.8 | 1 / 35 | 4196 |
| 6 | 4 | 60.6 | 65.7 | 1 / 35 | 4320 |
| 7 | 4 | 59.5 | 62.2 | 1 / 35 | 3976 |
| 8 | 3 | 61.3 | 67.9 | 1 / 35 | 4261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 35 | 17% |
| mn.Combat 3.25.0 | 28 | 18% |
| shinh.Entangled 0.3 | 9 | 11% |
| gh.micro.Gruweltje 0.7 | 4 | 0% |
| stelo.Wang 1.0 | 3 | 67% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 265 of 280 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 100 | 38% | 110 |
| mn.Combat 3.25.0 | 70 | 26% | 73 |
| shinh.Entangled 0.3 | 41 | 15% | 40 |
| stelo.Wang 1.0 | 18 | 7% | 19 |
| gh.micro.Gruweltje 0.7 | 17 | 6% | 18 |
| maribo.FollowFire 1 | 12 | 5% | 12 |
| ayk.WallHugger 1.0 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 3 | 1% | 4 |

## Melee bench: F14

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.9 | 148 / 280 | 3.44 | 16.6% | 40495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.6% | 148 |
| catcat20.shape.Theta 0.018 | 2.5 | 13.8% | 73 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.3% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 4.6 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.9 | 9.7% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 6.9 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 8.0% | 13 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.7 | 13 / 35 | 4768 |
| 2 | 1 | 66.1 | 74.9 | 21 / 35 | 4974 |
| 3 | 1 | 67.3 | 75.9 | 20 / 35 | 5482 |
| 4 | 1 | 66.9 | 77.8 | 19 / 35 | 5526 |
| 5 | 1 | 65.4 | 73.0 | 19 / 35 | 4847 |
| 6 | 1 | 63.4 | 68.3 | 17 / 35 | 4861 |
| 7 | 1 | 64.9 | 72.1 | 19 / 35 | 4857 |
| 8 | 1 | 66.6 | 75.9 | 20 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 94% |
| catcat20.shape.Theta 0.018 | 53 | 57% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 42% | 141 |
| catcat20.shape.Theta 0.018 | 33 | 25% | 57 |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 8% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 8 | 6% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 6% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 8 |
| sample.TrackFire 1.0 | 3 | 2% | 7 |
| pa.Improved 1.0 | 2 | 2% | 6 |

## Melee bench: F15

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.0 | 154 / 280 | 2.35 | 19.6% | 49013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.6% | 154 |
| kawigi.micro.Shiz 1.1 | 2.9 | 12.7% | 16 |
| emp.Yngwie 1.11 | 2.9 | 12.5% | 61 |
| mld.DustBunny 3.8 | 3.3 | 12.2% | 11 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.8% | 25 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.3% | 9 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.2% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.6% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.2 | 19 / 35 | 5797 |
| 2 | 1 | 69.0 | 83.2 | 18 / 35 | 5884 |
| 3 | 1 | 68.5 | 80.0 | 18 / 35 | 6291 |
| 4 | 1 | 69.6 | 86.0 | 21 / 35 | 6087 |
| 5 | 1 | 70.8 | 88.3 | 20 / 35 | 6515 |
| 6 | 1 | 68.4 | 81.3 | 18 / 35 | 5992 |
| 7 | 1 | 71.2 | 92.1 | 22 / 35 | 6327 |
| 8 | 1 | 69.5 | 86.7 | 18 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 54 | 46% |
| kawigi.micro.Shiz 1.1 | 45 | 89% |
| mld.DustBunny 3.8 | 44 | 100% |
| kawigi.robot.Girl 1.2 | 29 | 66% |
| cb.nano.Insomnia 1.0 | 25 | 88% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 52 | 41% | 101 |
| cb.nano.Insomnia 1.0 | 19 | 15% | 16 |
| kawigi.robot.Girl 1.2 | 15 | 12% | 23 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 50 |
| mld.DustBunny 3.8 | 12 | 10% | 58 |
| divineomega.TrialBot 0.003 | 5 | 4% | 16 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 7 |
| lambdaxy.TBot 0.1 | 3 | 2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 3 |

## Melee bench: F16

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.2 | 94 / 280 | 2.60 | 18.3% | 45556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 18.3% | 94 |
| gh.Griezel 0.5.2 | 1.8 | 16.7% | 125 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.4% | 39 |
| tvv.nano.Polaris 1.2 | 5.4 | 8.9% | 8 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 7.7% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 81.9 | 9 / 35 | 5675 |
| 2 | 1 | 67.5 | 80.3 | 13 / 35 | 5738 |
| 3 | 1 | 68.1 | 82.9 | 13 / 35 | 5554 |
| 4 | 1 | 69.9 | 88.6 | 14 / 35 | 5960 |
| 5 | 2 | 66.6 | 76.8 | 9 / 35 | 5642 |
| 6 | 1 | 66.7 | 77.1 | 12 / 35 | 5476 |
| 7 | 1 | 67.8 | 82.9 | 11 / 35 | 5328 |
| 8 | 1 | 70.0 | 87.0 | 13 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 100 | 17% |
| techdude.forest.FlamingForest 1.1 | 37 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 33 | 91% |
| divineomega.DivineBot 1.9.4.5 | 11 | 91% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 186 of 280 rounds, at a mean tick of 1355. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 108 | 58% | 131 |
| techdude.forest.FlamingForest 1.1 | 29 | 16% | 50 |
| bvh.fnr.Fenrir 0.36l | 16 | 9% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 8% | 39 |
| divineomega.DivineBot 1.9.4.5 | 6 | 3% | 17 |
| stelo.IntrinsicVolatility 1.4 | 6 | 3% | 10 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 8 |
| asd.Cthulhu 1.3 | 3 | 2% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |

## Melee bench: F17

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.7 | 130 / 280 | 2.65 | 17.7% | 39581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.7% | 130 |
| et.Predator 1.8 | 2.8 | 13.1% | 32 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.8% | 38 |
| cx.BlestPain 1.41 | 4.0 | 11.8% | 51 |
| nic.Nicator 2.4 | 4.5 | 11.1% | 20 |
| ahf.NanoAndrew .4 | 5.9 | 10.0% | 9 |
| maribo.melee.BMV 0.1 | 6.9 | 9.0% | 0 |
| tex.Longbot 0.4 | 8.1 | 6.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.9 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.0 | 19 / 35 | 5113 |
| 2 | 1 | 65.6 | 75.6 | 14 / 35 | 4777 |
| 3 | 1 | 70.0 | 93.0 | 21 / 35 | 5025 |
| 4 | 1 | 69.2 | 88.9 | 18 / 35 | 5096 |
| 5 | 1 | 66.0 | 78.7 | 16 / 35 | 4511 |
| 6 | 1 | 66.4 | 76.5 | 17 / 35 | 5020 |
| 7 | 1 | 65.9 | 79.7 | 11 / 35 | 5164 |
| 8 | 1 | 66.2 | 81.3 | 14 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 67 | 76% |
| cx.BlestPain 1.41 | 38 | 26% |
| oog.melee.Mercutio 1.0 | 37 | 65% |
| nic.Nicator 2.4 | 37 | 78% |
| ahf.NanoAndrew .4 | 11 | 73% |
| maribo.melee.BMV 0.1 | 7 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 40 | 27% | 55 |
| et.Predator 1.8 | 34 | 23% | 79 |
| oog.melee.Mercutio 1.0 | 28 | 19% | 55 |
| nic.Nicator 2.4 | 19 | 13% | 43 |
| ahf.NanoAndrew .4 | 18 | 12% | 28 |
| goblin.Bender 2.4 | 6 | 4% | 6 |
| maribo.melee.BMV 0.1 | 4 | 3% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |

## Melee bench: F18

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.6 | 170 / 280 | 2.38 | 18.5% | 37246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.5% | 170 |
| morbid.MorbidPriest 1.0 | 2.1 | 12.8% | 38 |
| uji.DBH 1.1 | 3.5 | 11.2% | 14 |
| agd.Mooserwirt2 2.7 | 4.1 | 10.8% | 25 |
| ratosh.Nobo 0.21 | 5.3 | 10.0% | 4 |
| spinnercat.Robovirus 2.718 | 5.4 | 9.6% | 10 |
| sigterm.Sigterm 1.0 | 6.8 | 8.7% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.1 | 5.8% | 0 |
| stelo.WangRobot 1.0 | 9.6 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.0 | 17 / 35 | 4414 |
| 2 | 1 | 69.9 | 91.7 | 25 / 35 | 5101 |
| 3 | 1 | 68.1 | 87.6 | 21 / 35 | 4585 |
| 4 | 1 | 67.2 | 84.1 | 21 / 35 | 4366 |
| 5 | 1 | 67.2 | 84.8 | 19 / 35 | 4578 |
| 6 | 1 | 69.6 | 88.9 | 26 / 35 | 4771 |
| 7 | 1 | 68.7 | 85.1 | 24 / 35 | 5098 |
| 8 | 1 | 64.6 | 74.0 | 17 / 35 | 4333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 57 | 74% |
| uji.DBH 1.1 | 37 | 89% |
| agd.Mooserwirt2 2.7 | 33 | 70% |
| sigterm.Sigterm 1.0 | 31 | 81% |
| spinnercat.Robovirus 2.718 | 17 | 82% |
| ratosh.Nobo 0.21 | 15 | 100% |
| stelo.WangRobot 1.0 | 11 | 91% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 28% | 80 |
| agd.Mooserwirt2 2.7 | 21 | 19% | 52 |
| uji.DBH 1.1 | 13 | 12% | 35 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 12% | 22 |
| sigterm.Sigterm 1.0 | 9 | 8% | 27 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 8% | 13 |
| ratosh.Nobo 0.21 | 8 | 7% | 24 |
| spinnercat.Robovirus 2.718 | 6 | 5% | 14 |
| stelo.WangRobot 1.0 | 2 | 2% | 11 |

## Melee bench: F19

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.3 | 216 / 280 | 1.78 | 20.8% | 47423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 20.8% | 216 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 24 |
| mld.Infinity 2.2 | 3.1 | 13.0% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.9% | 7 |
| erdnis.Rover 0.3 | 4.6 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.9% | 0 |
| pac.ABC 2.1 | 7.4 | 7.1% | 5 |
| mbh.Mbh 0.1 | 7.8 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 95.6 | 27 / 35 | 6022 |
| 2 | 1 | 72.4 | 93.7 | 27 / 35 | 6363 |
| 3 | 1 | 71.2 | 91.1 | 27 / 35 | 5993 |
| 4 | 1 | 72.9 | 96.8 | 31 / 35 | 6159 |
| 5 | 1 | 70.4 | 86.3 | 24 / 35 | 5840 |
| 6 | 1 | 71.0 | 90.5 | 27 / 35 | 5551 |
| 7 | 1 | 72.5 | 93.7 | 30 / 35 | 6038 |
| 8 | 1 | 69.4 | 83.2 | 23 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 90% |
| mld.Infinity 2.2 | 81 | 90% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 65 of 280 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 27 | 42% | 143 |
| mld.Infinity 2.2 | 16 | 25% | 29 |
| krillr.mini.JointStrike 2.0.0 | 7 | 11% | 27 |
| erdnis.Rover 0.3 | 4 | 6% | 28 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 18 |
| pac.ABC 2.1 | 3 | 5% | 7 |
| pbg.R2D2 1.0 | 2 | 3% | 16 |
| mbh.Mbh 0.1 | 1 | 2% | 6 |
| pedersen.Moron 2.0 | 1 | 2% | 0 |
1 death(s) with no robot to name.

## Melee bench: F20

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.1 | 136 / 280 | 1.98 | 19.5% | 45715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.5% | 136 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 58 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 55 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.5% | 3 |
| catcat20.Rabbit 0.001 | 4.4 | 10.3% | 25 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.7% | 0 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 17 / 35 | 5615 |
| 2 | 1 | 71.8 | 95.6 | 23 / 35 | 6413 |
| 3 | 1 | 68.3 | 86.0 | 14 / 35 | 5479 |
| 4 | 1 | 69.6 | 91.7 | 14 / 35 | 5651 |
| 5 | 1 | 68.1 | 85.1 | 15 / 35 | 5382 |
| 6 | 1 | 69.8 | 90.8 | 17 / 35 | 5871 |
| 7 | 1 | 68.8 | 86.3 | 17 / 35 | 5571 |
| 8 | 1 | 69.8 | 90.8 | 19 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 103 | 64% |
| fwb.Nine 1.0.1 | 59 | 24% |
| catcat20.Rabbit 0.001 | 32 | 59% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| m3thos.mini.Eva01 0.5.5 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 145 of 280 rounds, at a mean tick of 1538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 48% | 132 |
| fwb.Nine 1.0.1 | 46 | 32% | 7 |
| catcat20.Rabbit 0.001 | 18 | 12% | 49 |
| nz.jdc.nano.GridFu 1.0 | 3 | 2% | 34 |
| bayen.nut.Squirrel 1.615 | 3 | 2% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 1% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 14 |

## Melee bench: F21

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.0 | 124 / 280 | 2.44 | 18.7% | 44664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.7% | 124 |
| eem.EvBot v4.6.16 | 1.9 | 17.2% | 125 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 7 |
| eld.Hmm 1.0 | 5.4 | 8.4% | 9 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.0% | 2 |
| el.JumpShoot 0.2 | 7.6 | 6.3% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.5% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 13 / 35 | 5637 |
| 2 | 2 | 66.1 | 77.1 | 11 / 35 | 5246 |
| 3 | 1 | 70.8 | 91.7 | 21 / 35 | 5696 |
| 4 | 1 | 68.0 | 80.0 | 17 / 35 | 5439 |
| 5 | 1 | 68.3 | 81.0 | 13 / 35 | 5870 |
| 6 | 1 | 69.3 | 87.9 | 18 / 35 | 5563 |
| 7 | 1 | 70.0 | 88.3 | 18 / 35 | 5757 |
| 8 | 1 | 67.7 | 81.9 | 13 / 35 | 5456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 141 | 45% |
| dummy.mini.Scimitar 1.01 | 26 | 96% |
| cf.RiO.RiOx 4.2.1 | 18 | 94% |
| eld.Hmm 1.0 | 11 | 64% |
| el.JumpShoot 0.2 | 6 | 83% |
| oa.weak.BotherBot 0.1 | 6 | 83% |
| fire219.CatBot 1.0 | 2 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 97 | 62% | 138 |
| dummy.mini.Scimitar 1.01 | 17 | 11% | 55 |
| cf.RiO.RiOx 4.2.1 | 13 | 8% | 25 |
| eld.Hmm 1.0 | 7 | 4% | 26 |
| fire219.CatBot 1.0 | 7 | 4% | 10 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| arthord.MannyPacquiao Beta | 5 | 3% | 5 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 9 |
| el.JumpShoot 0.2 | 2 | 1% | 6 |

## Melee bench: F23

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.8 | 124 / 280 | 2.64 | 18.7% | 46377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.7% | 124 |
| pe.SandboxLump 1.52 | 1.9 | 16.9% | 98 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 39 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 9.9% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.4% | 5 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 2 |
| sample.Walls 1.0 | 8.0 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.0 | 17 / 35 | 5627 |
| 2 | 1 | 67.8 | 76.8 | 14 / 35 | 5591 |
| 3 | 2 | 67.9 | 79.4 | 12 / 35 | 5566 |
| 4 | 1 | 69.0 | 80.6 | 15 / 35 | 5465 |
| 5 | 1 | 69.8 | 84.4 | 14 / 35 | 5971 |
| 6 | 1 | 69.6 | 83.5 | 17 / 35 | 5889 |
| 7 | 1 | 69.0 | 81.6 | 15 / 35 | 5941 |
| 8 | 1 | 71.6 | 88.9 | 20 / 35 | 6327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 110 | 50% |
| cre.Karolos 0.32 | 47 | 66% |
| stelo.AreaTargetingBot 1.1 | 19 | 95% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 86 | 55% | 143 |
| cre.Karolos 0.32 | 35 | 22% | 68 |
| stelo.AreaTargetingBot 1.1 | 13 | 8% | 23 |
| cw.megas.Blade 0.8 | 8 | 5% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 4% | 11 |
| stelo.RamTrackSurfer 1.2 | 5 | 3% | 14 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
| cli.WasteOfAmmo 1.0 | 1 | 1% | 1 |

## Melee bench: F24

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.1 | 68 / 280 | 3.69 | 14.5% | 30736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.8 | 14.5% | 68 |
| rz.GlowBlowMelee 1.4 | 1.9 | 14.3% | 63 |
| florent.XSeries.X2 0.12 | 2.5 | 13.9% | 65 |
| davidalves.Phoenix 0.54 | 4.3 | 12.4% | 45 |
| pedersen.Ugluk 1.1.1 | 4.6 | 11.8% | 23 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 7.1% | 8 |
| lunchie.Lunchbox 0.93 | 7.6 | 6.7% | 2 |
| as.FrankTheTank 1.3 | 9.1 | 5.4% | 1 |
| evd.X1 0.01 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 69.5 | 10 / 35 | 3490 |
| 2 | 1 | 61.2 | 71.1 | 6 / 35 | 3760 |
| 3 | 2 | 62.0 | 72.1 | 5 / 35 | 4027 |
| 4 | 2 | 61.7 | 70.5 | 9 / 35 | 3678 |
| 5 | 2 | 62.4 | 70.5 | 8 / 35 | 4125 |
| 6 | 2 | 60.9 | 67.9 | 8 / 35 | 3893 |
| 7 | 2 | 60.1 | 64.4 | 8 / 35 | 3974 |
| 8 | 1 | 63.6 | 74.9 | 14 / 35 | 3789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 56% |
| florent.XSeries.X2 0.12 | 37 | 41% |
| davidalves.Phoenix 0.54 | 27 | 30% |
| pedersen.Ugluk 1.1.1 | 17 | 71% |
| stelo.SoJNanoMelee 1.1 | 5 | 60% |
| oog.melee.Corsair 1.0 | 4 | 50% |
| lunchie.Lunchbox 0.93 | 4 | 75% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 212 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 69 | 33% | 84 |
| davidalves.Phoenix 0.54 | 46 | 22% | 50 |
| rz.GlowBlowMelee 1.4 | 41 | 19% | 72 |
| pedersen.Ugluk 1.1.1 | 19 | 9% | 26 |
| oog.melee.Corsair 1.0 | 12 | 6% | 16 |
| evd.X1 0.01 | 11 | 5% | 11 |
| stelo.SoJNanoMelee 1.1 | 9 | 4% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 8 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |

## Melee bench: F25

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.3 | 176 / 280 | 2.33 | 18.6% | 35045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.6% | 176 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 12.6% | 20 |
| jdw.Hurricane 1.4 | 2.8 | 12.5% | 36 |
| voidious.micro.BlitzBat 1.05 | 3.5 | 11.9% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.7% | 13 |
| ds.Oo 2.2 | 5.8 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.3% | 6 |
| awesomeness.Elite 1.0 | 8.3 | 6.8% | 2 |
| adt.Ar2 1.1 | 8.4 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.8 | 21 / 35 | 4268 |
| 2 | 1 | 67.6 | 86.0 | 21 / 35 | 4312 |
| 3 | 1 | 65.6 | 76.8 | 18 / 35 | 4470 |
| 4 | 1 | 67.4 | 82.9 | 23 / 35 | 4188 |
| 5 | 1 | 69.0 | 89.5 | 24 / 35 | 4513 |
| 6 | 1 | 69.5 | 91.7 | 25 / 35 | 4555 |
| 7 | 1 | 69.2 | 90.2 | 23 / 35 | 4401 |
| 8 | 1 | 67.2 | 81.3 | 21 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 94% |
| jdw.Hurricane 1.4 | 52 | 81% |
| voidious.micro.BlitzBat 1.05 | 39 | 97% |
| gjr.Cephalosporin 0.1 | 16 | 100% |
| gre.svman4.Morfeas 1.4.1 | 14 | 50% |
| ds.Oo 2.2 | 13 | 85% |
| awesomeness.Elite 1.0 | 5 | 60% |
| amk.ChumbaMini 0.2 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 75% |

Hadur died in 105 of 280 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 30 | 29% | 66 |
| voidious.micro.BlitzBat 1.05 | 17 | 16% | 51 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 13% | 65 |
| ds.Oo 2.2 | 14 | 13% | 30 |
| gre.svman4.Morfeas 1.4.1 | 12 | 11% | 21 |
| gjr.Cephalosporin 0.1 | 7 | 7% | 24 |
| awesomeness.Elite 1.0 | 5 | 5% | 6 |
| adt.Ar2 1.1 | 3 | 3% | 8 |
| amk.ChumbaMini 0.2 | 3 | 3% | 7 |

## Melee bench: F26

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.2 | 123 / 280 | 2.42 | 18.1% | 43831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.1% | 123 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 89 |
| lrem.Spectre 0.4.4 | 3.6 | 11.9% | 22 |
| shu.nitro.LENIN .T34 | 4.4 | 11.4% | 27 |
| js.PinBall 1.6 | 4.4 | 11.0% | 10 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.2% | 2 |
| sample.SpinBot 1.0 | 8.9 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 19 / 35 | 5820 |
| 2 | 1 | 67.5 | 82.9 | 11 / 35 | 5456 |
| 3 | 1 | 66.6 | 81.6 | 15 / 35 | 5126 |
| 4 | 1 | 68.1 | 87.0 | 15 / 35 | 5275 |
| 5 | 1 | 68.7 | 86.0 | 15 / 35 | 5709 |
| 6 | 1 | 67.0 | 78.7 | 15 / 35 | 5224 |
| 7 | 1 | 68.4 | 84.8 | 16 / 35 | 5801 |
| 8 | 1 | 68.3 | 84.4 | 17 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 71 | 34% |
| lrem.Spectre 0.4.4 | 44 | 82% |
| shu.nitro.LENIN .T34 | 42 | 69% |
| js.PinBall 1.6 | 15 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 8 | 88% |
| sample.SpinBot 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 77 | 49% | 107 |
| shu.nitro.LENIN .T34 | 26 | 17% | 62 |
| lrem.Spectre 0.4.4 | 16 | 10% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 13 | 8% | 19 |
| js.PinBall 1.6 | 12 | 8% | 27 |
| gh.mini.GrubbmOne 1.0 | 7 | 4% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 2% | 6 |
| sample.SpinBot 1.0 | 3 | 2% | 3 |

## Melee bench: F27

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.9 | 158 / 280 | 2.72 | 17.8% | 36826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.8% | 158 |
| mk.Alpha 0.2.1 | 1.9 | 14.7% | 73 |
| wee.Gem 1.8.4 | 4.4 | 10.2% | 23 |
| EH.Eagle 1.0.6 | 4.6 | 9.9% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.1% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.0% | 4 |
| joe.ADinosaur 1.0 | 7.0 | 7.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.3% | 1 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.1% | 1 |
| cs.Grudge 1.0 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.7 | 20 / 35 | 4561 |
| 2 | 1 | 65.6 | 78.7 | 19 / 35 | 4285 |
| 3 | 2 | 63.8 | 63.5 | 12 / 35 | 4846 |
| 4 | 1 | 67.1 | 78.4 | 21 / 35 | 5215 |
| 5 | 1 | 68.3 | 91.4 | 18 / 35 | 4564 |
| 6 | 1 | 67.8 | 86.0 | 22 / 35 | 4309 |
| 7 | 1 | 67.6 | 85.7 | 23 / 35 | 4480 |
| 8 | 1 | 67.5 | 84.8 | 23 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 103 | 72% |
| wee.Gem 1.8.4 | 32 | 84% |
| EH.Eagle 1.0.6 | 21 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 54 | 44% | 121 |
| wee.Gem 1.8.4 | 13 | 11% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 10% | 31 |
| cs.Grudge 1.0 | 12 | 10% | 15 |
| joe.ADinosaur 1.0 | 11 | 9% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 7 | 6% | 18 |
| EH.Eagle 1.0.6 | 5 | 4% | 23 |
| throxbot.ThroxBot 0.1 | 4 | 3% | 11 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 8 |

## Melee bench: F28

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.8 | 164 / 280 | 2.55 | 17.8% | 34213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 164 |
| kid.test.NightFox .2 | 2.1 | 14.3% | 36 |
| uji.Antique 1.0 | 3.1 | 12.1% | 37 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.8% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 3 |
| ahr.ice.Ice 1.0.2 | 6.1 | 8.5% | 7 |
| amk.ChumbaWumba 0.3 | 7.1 | 7.5% | 2 |
| matt.advanced.Katana 1.0 | 8.0 | 6.9% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 21 / 35 | 4696 |
| 2 | 1 | 66.7 | 85.1 | 21 / 35 | 3964 |
| 3 | 1 | 64.3 | 74.3 | 16 / 35 | 4231 |
| 4 | 1 | 68.1 | 87.3 | 23 / 35 | 4216 |
| 5 | 1 | 67.9 | 88.3 | 19 / 35 | 4355 |
| 6 | 1 | 67.0 | 81.9 | 22 / 35 | 4261 |
| 7 | 1 | 66.7 | 80.0 | 22 / 35 | 4317 |
| 8 | 1 | 66.8 | 82.2 | 20 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 100 | 83% |
| uji.Antique 1.0 | 56 | 82% |
| qohnil.blot.BlotBot 3.61 | 16 | 38% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 9 | 89% |
| amk.ChumbaWumba 0.3 | 8 | 75% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 118 of 280 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 25 | 21% | 61 |
| kid.test.NightFox .2 | 24 | 20% | 93 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 40 |
| qohnil.blot.BlotBot 3.61 | 16 | 14% | 32 |
| amk.ChumbaWumba 0.3 | 14 | 12% | 18 |
| stelo.Lifestealer 1.0 | 6 | 5% | 9 |
| stelo.PianistNano 1.2 | 5 | 4% | 6 |
| ahr.ice.Ice 1.0.2 | 4 | 3% | 14 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
2 death(s) with no robot to name.

## Melee bench: F29

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.5 | 98 / 280 | 2.66 | 17.6% | 38099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.6% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 2.1 | 15.7% | 101 |
| deewiant.Anomaly 0.2 | 3.0 | 14.5% | 57 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 12 |
| jok.PheonixM 0.1.2 | 4.9 | 9.9% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 1 |
| DBall.Anarchy 0.1 | 7.4 | 6.6% | 5 |
| ap.Frederick 1.1 | 8.4 | 5.3% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.6 | 5.6% | 0 |
| jangs.ns51 1.0 | 9.6 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.2 | 14 / 35 | 4362 |
| 2 | 1 | 68.0 | 84.8 | 12 / 35 | 4916 |
| 3 | 1 | 64.7 | 72.7 | 10 / 35 | 4706 |
| 4 | 1 | 69.5 | 89.5 | 17 / 35 | 5003 |
| 5 | 1 | 66.6 | 81.3 | 10 / 35 | 4850 |
| 6 | 1 | 66.2 | 79.0 | 11 / 35 | 4461 |
| 7 | 1 | 67.7 | 83.5 | 12 / 35 | 5102 |
| 8 | 1 | 66.4 | 78.4 | 12 / 35 | 4699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 74 | 53% |
| zyx.mega.YersiniaPestis 3.1 | 67 | 21% |
| myl.micro.Troodon 1.10 | 22 | 100% |
| jok.PheonixM 0.1.2 | 12 | 100% |
| jangs.ns51 1.0 | 6 | 67% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 84 | 46% | 97 |
| deewiant.Anomaly 0.2 | 67 | 37% | 113 |
| myl.micro.Troodon 1.10 | 8 | 4% | 25 |
| jok.PheonixM 0.1.2 | 7 | 4% | 17 |
| ph.melee.ArcherME 0.3 | 6 | 3% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 6 |
| jangs.ns51 1.0 | 4 | 2% | 6 |
| DBall.Anarchy 0.1 | 2 | 1% | 8 |

## Melee bench: F30

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 58.9 | 37 / 280 | 4.70 | 12.4% | 31076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.0% | 76 |
| darkcanuck.B26354 1.06 | 2.5 | 13.3% | 68 |
| kc.micro.Figment 1.0 | 3.3 | 12.4% | 37 |
| oog.melee.Capulet 1.2 | 3.8 | 12.4% | 33 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.4% | 36 |
| intruder.PrairieWolf 2.61 | 6.4 | 9.1% | 18 |
| ntc.Opposite 1.5 | 7.6 | 7.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 8.2% | 7 |
| tripphippy.Alice 1.1 | 8.3 | 7.5% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 55.2 | 4 / 35 | 3713 |
| 2 | 5 | 53.4 | 48.9 | 2 / 35 | 3535 |
| 3 | 5 | 54.4 | 52.4 | 3 / 35 | 3579 |
| 4 | 3 | 59.8 | 65.1 | 4 / 35 | 3894 |
| 5 | 3 | 58.4 | 60.3 | 6 / 35 | 4034 |
| 6 | 2 | 59.2 | 61.9 | 5 / 35 | 4223 |
| 7 | 3 | 59.4 | 64.1 | 4 / 35 | 4147 |
| 8 | 1 | 59.5 | 63.5 | 9 / 35 | 3951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 20 | 20% |
| oog.melee.Capulet 1.2 | 17 | 47% |
| stelo.PastFuture 2.3.2 | 17 | 65% |
| catcat20.Matcha 0.006 | 16 | 19% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| ntc.Opposite 1.5 | 4 | 100% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 243 of 280 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 22% | 64 |
| catcat20.Matcha 0.006 | 53 | 22% | 58 |
| darkcanuck.B26354 1.06 | 45 | 19% | 51 |
| stelo.PastFuture 2.3.2 | 43 | 18% | 53 |
| tripphippy.Alice 1.1 | 15 | 6% | 16 |
| intruder.PrairieWolf 2.61 | 13 | 5% | 13 |
| ntc.Opposite 1.5 | 9 | 4% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 4% | 11 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.7 | 33 / 280 | 3.82 | 13.7% | 29644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 148 |
| kc.micro.Figment 1.0 | 2.4 | 13.7% | 33 |
| gh.mini.Griezel 0.2 | 2.8 | 13.2% | 61 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 11.3% | 16 |
| d414.nano.Quantum 1.0.0 | 4.6 | 11.2% | 14 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.1% | 6 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.8% | 2 |
| fm.mammillarias 1.3 | 7.9 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 65.7 | 3 / 35 | 3168 |
| 2 | 2 | 61.6 | 72.1 | 4 / 35 | 3728 |
| 3 | 2 | 62.5 | 73.7 | 1 / 35 | 4044 |
| 4 | 2 | 59.6 | 66.3 | 2 / 35 | 3818 |
| 5 | 2 | 60.5 | 67.0 | 9 / 35 | 3700 |
| 6 | 2 | 63.1 | 77.5 | 5 / 35 | 3695 |
| 7 | 3 | 59.0 | 62.9 | 4 / 35 | 3635 |
| 8 | 3 | 59.3 | 64.1 | 5 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 50 | 8% |
| gh.mini.Griezel 0.2 | 24 | 13% |
| d414.nano.Quantum 1.0.0 | 13 | 62% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 247 of 280 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 131 | 53% | 138 |
| gh.mini.Griezel 0.2 | 44 | 18% | 50 |
| spinnercat.micro.Tyger 0.1 | 24 | 10% | 30 |
| gh.nano.Grofvuil 0.2 | 13 | 5% | 19 |
| d414.nano.Quantum 1.0.0 | 12 | 5% | 18 |
| fm.mammillarias 1.3 | 10 | 4% | 10 |
| timmit.nano.TimDog 0.33 | 7 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.1 | 116 / 280 | 2.88 | 16.9% | 38461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 16.9% | 116 |
| kawigi.sbf.FloodHT 0.9.2 | 1.9 | 14.9% | 99 |
| apc.botM 3.0 | 3.4 | 11.8% | 24 |
| lxx.ConceptA 0.8 | 4.4 | 10.3% | 8 |
| vjik.UnViolation 1.1 | 4.4 | 10.7% | 17 |
| bayen.UbaMicro 1.4 | 6.1 | 8.9% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 3 |
| yk.JahMicro 1.0 | 7.9 | 7.3% | 6 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 72.4 | 8 / 35 | 5000 |
| 2 | 1 | 67.1 | 83.8 | 16 / 35 | 5132 |
| 3 | 1 | 66.0 | 80.6 | 14 / 35 | 4846 |
| 4 | 1 | 64.2 | 74.9 | 15 / 35 | 4664 |
| 5 | 1 | 67.3 | 86.7 | 14 / 35 | 4950 |
| 6 | 1 | 63.6 | 73.0 | 13 / 35 | 4546 |
| 7 | 1 | 65.2 | 79.0 | 16 / 35 | 4424 |
| 8 | 1 | 66.9 | 82.5 | 20 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 28% |
| apc.botM 3.0 | 31 | 81% |
| lxx.ConceptA 0.8 | 30 | 93% |
| vjik.UnViolation 1.1 | 18 | 72% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| donjezza.Jezza 1.0 | 8 | 63% |
| panzer.Panzer 0.2 | 6 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 52% | 113 |
| vjik.UnViolation 1.1 | 19 | 12% | 42 |
| lxx.ConceptA 0.8 | 19 | 12% | 35 |
| apc.botM 3.0 | 18 | 11% | 39 |
| bayen.UbaMicro 1.4 | 8 | 5% | 14 |
| donjezza.Jezza 1.0 | 5 | 3% | 11 |
| yk.JahMicro 1.0 | 3 | 2% | 12 |
| conscience.Electron 1.3g | 3 | 2% | 8 |
| panzer.Panzer 0.2 | 3 | 2% | 5 |

## Melee bench: F33

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.2 | 153 / 280 | 2.42 | 19.1% | 43083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.1% | 153 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.4% | 17 |
| labg.Cataclysm 2.05 | 4.0 | 10.9% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.2% | 14 |
| baal.nano.N 1.42 | 6.4 | 8.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.6% | 13 |
| zyx.micro.Ant 1.1 | 8.4 | 5.6% | 0 |
| sanja.First 0.1 | 9.0 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 16 / 35 | 4987 |
| 2 | 1 | 68.8 | 83.2 | 19 / 35 | 5370 |
| 3 | 1 | 70.4 | 89.2 | 23 / 35 | 5382 |
| 4 | 1 | 68.3 | 81.6 | 19 / 35 | 5053 |
| 5 | 1 | 69.0 | 84.4 | 20 / 35 | 5262 |
| 6 | 1 | 69.3 | 82.9 | 21 / 35 | 5750 |
| 7 | 1 | 71.1 | 91.7 | 23 / 35 | 5677 |
| 8 | 1 | 68.3 | 80.0 | 12 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 81 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 94% |
| gre.svman4.Leonidas 1.3.2 | 32 | 81% |
| labg.Cataclysm 2.05 | 21 | 52% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 69% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 52 | 40% | 109 |
| labg.Cataclysm 2.05 | 19 | 15% | 35 |
| gre.svman4.Leonidas 1.3.2 | 18 | 14% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 57 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 11 | 9% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 8% | 16 |
| zyx.micro.Ant 1.1 | 4 | 3% | 6 |
| baal.nano.N 1.42 | 2 | 2% | 4 |
| sanja.First 0.1 | 2 | 2% | 4 |

## Melee bench: F34

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.8 | 62 / 280 | 3.18 | 16.1% | 39481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 16.8% | 124 |
| kc.micro.Figment 1.0 | 2.3 | 16.1% | 62 |
| kid.Gladiator .7.2 | 2.5 | 15.6% | 58 |
| jcs.Seth 1.8 | 4.4 | 11.5% | 24 |
| tcf.Reach 3 | 4.6 | 11.2% | 11 |
| cli.Dancer 1.1 | 5.9 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.0% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 80.6 | 6 / 35 | 4753 |
| 2 | 2 | 67.2 | 80.0 | 7 / 35 | 5557 |
| 3 | 3 | 64.3 | 71.7 | 6 / 35 | 4778 |
| 4 | 2 | 67.4 | 80.3 | 13 / 35 | 4966 |
| 5 | 2 | 65.1 | 75.2 | 6 / 35 | 4811 |
| 6 | 1 | 66.4 | 77.5 | 13 / 35 | 4974 |
| 7 | 2 | 66.6 | 79.4 | 8 / 35 | 5160 |
| 8 | 4 | 60.6 | 61.6 | 3 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 30% |
| kid.Gladiator .7.2 | 44 | 41% |
| jcs.Seth 1.8 | 18 | 67% |
| tcf.Reach 3 | 11 | 27% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 218 of 280 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 80 | 37% | 102 |
| kid.Gladiator .7.2 | 77 | 35% | 92 |
| tcf.Reach 3 | 23 | 11% | 26 |
| jcs.Seth 1.8 | 19 | 9% | 33 |
| cli.Dancer 1.1 | 9 | 4% | 14 |
| ratosh.Wesco 1.4 | 6 | 3% | 8 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |

## Melee bench: F35

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.8 | 24 / 280 | 3.54 | 13.9% | 28119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 219 |
| kc.micro.Figment 1.0 | 2.3 | 13.9% | 24 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.2% | 23 |
| rz.HawkOnFire 0.1 | 4.5 | 11.1% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.6% | 9 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.1% | 0 |
| wit.Chuliath 1.0 | 6.9 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.9% | 1 |
| dans.Cinnamon 1.2 | 8.9 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 73.0 | 4 / 35 | 3705 |
| 2 | 2 | 62.1 | 73.0 | 4 / 35 | 3816 |
| 3 | 3 | 61.1 | 72.1 | 2 / 35 | 3330 |
| 4 | 3 | 60.6 | 72.1 | 0 / 35 | 3244 |
| 5 | 2 | 59.2 | 66.3 | 2 / 35 | 3063 |
| 6 | 2 | 62.4 | 70.5 | 4 / 35 | 3930 |
| 7 | 2 | 61.2 | 69.8 | 6 / 35 | 3599 |
| 8 | 2 | 62.8 | 77.5 | 2 / 35 | 3432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 58 | 7% |
| gh.mini.Gruwel 0.9 | 18 | 22% |
| rz.HawkOnFire 0.1 | 11 | 91% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 100% |

Hadur died in 256 of 280 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 161 | 63% | 165 |
| gh.mini.Gruwel 0.9 | 38 | 15% | 43 |
| rz.HawkOnFire 0.1 | 20 | 8% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 6% | 21 |
| stelo.MyAgileRobot 0.2 | 7 | 3% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 7 |
| wit.Chuliath 1.0 | 5 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 2 |

## Melee bench: F36

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.2 | 209 / 280 | 1.97 | 20.5% | 44650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 20.5% | 209 |
| bzdp.Pansy 2.1 | 2.4 | 12.2% | 17 |
| alpha.RainingFire 1.0 | 2.9 | 12.0% | 19 |
| bvh.micro.Freya 0.3 | 4.1 | 11.0% | 12 |
| mz.Cork 0.1 | 4.6 | 10.4% | 6 |
| m3thos.Eva02 0.7.1 | 6.4 | 8.8% | 4 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.2% | 1 |
| dl.BetterWalls 1.0 | 9.0 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.8% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 24 / 35 | 5841 |
| 2 | 1 | 70.1 | 87.6 | 25 / 35 | 5663 |
| 3 | 1 | 69.3 | 87.9 | 24 / 35 | 4986 |
| 4 | 1 | 71.7 | 93.0 | 30 / 35 | 5632 |
| 5 | 1 | 70.6 | 89.2 | 27 / 35 | 5706 |
| 6 | 1 | 71.0 | 89.5 | 28 / 35 | 5794 |
| 7 | 1 | 71.6 | 93.0 | 28 / 35 | 5700 |
| 8 | 1 | 68.9 | 82.9 | 23 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 93% |
| bvh.micro.Freya 0.3 | 45 | 96% |
| mz.Cork 0.1 | 35 | 94% |
| alpha.RainingFire 1.0 | 33 | 82% |
| bvh.mini.Fenrir 0.39 | 24 | 100% |
| sample.MyFirstRobot 1.0 | 12 | 83% |
| m3thos.Eva02 0.7.1 | 12 | 83% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 71 of 280 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 23% | 43 |
| bzdp.Pansy 2.1 | 12 | 17% | 70 |
| mz.Cork 0.1 | 9 | 13% | 48 |
| dl.BetterWalls 1.0 | 9 | 13% | 28 |
| m3thos.Eva02 0.7.1 | 8 | 11% | 22 |
| bvh.micro.Freya 0.3 | 6 | 8% | 34 |
| bvh.mini.Fenrir 0.39 | 6 | 8% | 20 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 10 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 3 |

## Melee bench: F37

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.8 | 175 / 280 | 2.81 | 18.2% | 44260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.2% | 175 |
| germ.TheMind .2 | 2.6 | 10.8% | 25 |
| EBBU.Sim2 1.02 | 4.0 | 10.1% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.5 | 9.6% | 5 |
| stelo.UntouchableNano 1.3 | 5.9 | 9.1% | 18 |
| agrach.Dalek 1.0 | 6.0 | 9.0% | 20 |
| skm.Ryubot 1.0 | 6.9 | 8.6% | 11 |
| lmk.ACPFinal 0.1 | 7.6 | 8.4% | 5 |
| mb.Beast 0.1 | 7.8 | 8.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.8 | 21 / 35 | 5212 |
| 2 | 1 | 67.1 | 80.3 | 21 / 35 | 5630 |
| 3 | 1 | 65.0 | 73.7 | 20 / 35 | 5313 |
| 4 | 1 | 67.8 | 82.5 | 22 / 35 | 5715 |
| 5 | 1 | 66.9 | 79.7 | 21 / 35 | 5746 |
| 6 | 1 | 65.8 | 76.8 | 21 / 35 | 5275 |
| 7 | 1 | 67.2 | 84.4 | 24 / 35 | 5293 |
| 8 | 1 | 68.6 | 83.5 | 25 / 35 | 6076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 88% |
| EBBU.Sim2 1.02 | 29 | 97% |
| skm.Ryubot 1.0 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 22 | 91% |
| mb.Beast 0.1 | 20 | 100% |
| agrach.Dalek 1.0 | 20 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 89% |
| lmk.ACPFinal 0.1 | 9 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 345. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 15 | 14% | 43 |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 14% | 41 |
| germ.TheMind .2 | 15 | 14% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 23 |
| EBBU.Sim2 1.02 | 11 | 10% | 42 |
| lmk.ACPFinal 0.1 | 11 | 10% | 19 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 25 |
| skm.Ryubot 1.0 | 9 | 9% | 19 |
| mb.Beast 0.1 | 5 | 5% | 28 |

## Melee bench: F38

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.4 | 78 / 280 | 3.39 | 15.5% | 35543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 17.1% | 135 |
| kc.micro.Figment 1.0 | 1.8 | 15.5% | 78 |
| bvh.mini.Freya 0.55 | 3.3 | 12.5% | 17 |
| cs.Wren 1.0 | 4.6 | 10.7% | 10 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.7% | 26 |
| kdf.KoulDestroyer 1.0 | 5.9 | 9.5% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 3 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.7% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.4 | 13 / 35 | 4461 |
| 2 | 1 | 65.5 | 77.5 | 12 / 35 | 4741 |
| 3 | 2 | 62.0 | 68.6 | 9 / 35 | 4089 |
| 4 | 2 | 64.5 | 76.5 | 8 / 35 | 4634 |
| 5 | 2 | 65.4 | 77.1 | 9 / 35 | 4749 |
| 6 | 2 | 60.8 | 63.8 | 8 / 35 | 4186 |
| 7 | 2 | 63.7 | 74.0 | 10 / 35 | 4238 |
| 8 | 2 | 62.9 | 70.5 | 9 / 35 | 4445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 73 | 16% |
| bts.mega.Gnarly 1.4 | 22 | 64% |
| bvh.mini.Freya 0.55 | 20 | 75% |
| cs.Wren 1.0 | 16 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 9 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 102 | 50% | 123 |
| bvh.mini.Freya 0.55 | 33 | 16% | 45 |
| bts.mega.Gnarly 1.4 | 19 | 9% | 35 |
| kdf.KoulDestroyer 1.0 | 18 | 9% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 6% | 28 |
| cs.Wren 1.0 | 11 | 5% | 20 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 4 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |

## Melee bench: F39

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.4 | 77 / 280 | 3.13 | 16.5% | 41461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.5% | 77 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 38 |
| az.Ololobot 0.2.4 | 2.8 | 13.6% | 109 |
| catcat20.Lambda 0.024 | 4.1 | 10.7% | 39 |
| gimp.GimpBot 0.1 | 6.1 | 8.5% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.1 | 8.3% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 6.6 | 7.9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 7.1 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.7 | 13 / 35 | 5549 |
| 2 | 1 | 64.3 | 78.1 | 8 / 35 | 4901 |
| 3 | 2 | 61.8 | 67.9 | 5 / 35 | 5017 |
| 4 | 2 | 63.7 | 72.4 | 9 / 35 | 4913 |
| 5 | 1 | 65.3 | 76.2 | 12 / 35 | 5413 |
| 6 | 1 | 65.5 | 77.1 | 9 / 35 | 5570 |
| 7 | 1 | 67.0 | 85.7 | 14 / 35 | 5131 |
| 8 | 1 | 62.4 | 67.9 | 7 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 68 | 16% |
| bvh.fry.Freya 0.82 | 49 | 73% |
| catcat20.Lambda 0.024 | 26 | 42% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 89% |
| gimp.GimpBot 0.1 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 206 of 280 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 78 | 38% | 92 |
| bvh.fry.Freya 0.82 | 42 | 20% | 68 |
| catcat20.Lambda 0.024 | 39 | 19% | 48 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 18 |
| apollokidd.ApolloKidd 0.9 | 12 | 6% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 5% | 11 |
| gimp.GimpBot 0.1 | 8 | 4% | 19 |
| winamp32.micro.MicroMacro 1.0 | 3 | 1% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 4 |

## Melee bench: F40

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.0 | 164 / 280 | 2.35 | 18.9% | 39609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.9% | 164 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 58 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.8% | 21 |
| mz.AntiGrav 1.0 | 4.4 | 10.6% | 12 |
| Polkwane.SmashMelee 1.0 | 4.4 | 10.9% | 9 |
| alpha.BlackIce 1.0 | 6.4 | 8.7% | 4 |
| stelo.Randomness 1.0 | 6.6 | 8.7% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.4 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.6 | 5.6% | 2 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 22 / 35 | 5071 |
| 2 | 1 | 69.1 | 85.7 | 22 / 35 | 4911 |
| 3 | 1 | 68.5 | 81.9 | 23 / 35 | 4887 |
| 4 | 1 | 68.4 | 87.9 | 19 / 35 | 4522 |
| 5 | 1 | 64.1 | 72.1 | 14 / 35 | 4642 |
| 6 | 1 | 70.4 | 89.8 | 21 / 35 | 5561 |
| 7 | 1 | 67.6 | 82.5 | 20 / 35 | 4842 |
| 8 | 1 | 70.3 | 90.8 | 23 / 35 | 5173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 76 | 57% |
| Polkwane.SmashMelee 1.0 | 36 | 94% |
| kano.gamma.KanoGamma 1.8 | 36 | 78% |
| mz.AntiGrav 1.0 | 34 | 100% |
| stelo.Randomness 1.0 | 16 | 81% |
| alpha.BlackIce 1.0 | 4 | 75% |
| sample.Corners 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 53 | 45% | 94 |
| kano.gamma.KanoGamma 1.8 | 20 | 17% | 53 |
| mz.AntiGrav 1.0 | 11 | 9% | 42 |
| stelo.Randomness 1.0 | 10 | 9% | 31 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 26 |
| amk.superstrike.SuperStrike 0.3 | 6 | 5% | 9 |
| alpha.BlackIce 1.0 | 5 | 4% | 13 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 8 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.6 | 81 / 280 | 3.83 | 15.1% | 36608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.7% | 129 |
| kc.micro.Figment 1.0 | 1.9 | 15.1% | 81 |
| ary.Swarm 1.1 | 3.5 | 12.7% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.5% | 29 |
| simonton.nano.MeleeSeed 1.8 | 5.5 | 10.3% | 11 |
| shrub.Silver v048 | 5.6 | 9.7% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.5 | 6.1% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 6.2% | 4 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 67.6 | 10 / 35 | 4596 |
| 2 | 2 | 63.1 | 68.3 | 9 / 35 | 4695 |
| 3 | 2 | 61.6 | 66.0 | 8 / 35 | 4117 |
| 4 | 2 | 60.5 | 61.6 | 6 / 35 | 4487 |
| 5 | 1 | 65.5 | 73.3 | 14 / 35 | 5165 |
| 6 | 2 | 61.0 | 63.5 | 12 / 35 | 4272 |
| 7 | 2 | 65.5 | 74.3 | 10 / 35 | 5070 |
| 8 | 2 | 64.2 | 74.0 | 12 / 35 | 4206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 58 | 26% |
| lessonz.robocode.Oz 0.5.0 | 31 | 87% |
| ary.Swarm 1.1 | 21 | 86% |
| simonton.nano.MeleeSeed 1.8 | 17 | 100% |
| shrub.Silver v048 | 4 | 75% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 199 of 280 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 47% | 120 |
| lessonz.robocode.Oz 0.5.0 | 28 | 14% | 43 |
| simonton.nano.MeleeSeed 1.8 | 28 | 14% | 43 |
| ary.Swarm 1.1 | 14 | 7% | 32 |
| stelo.Mirror 1.1 | 10 | 5% | 10 |
| zyx.nano.Ant 1.1 | 9 | 5% | 11 |
| acogdev.alpha 0.2 | 8 | 4% | 8 |
| shrub.Silver v048 | 6 | 3% | 10 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |

## Melee bench: F42

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.5 | 56 / 280 | 3.03 | 16.5% | 42846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 17.3% | 131 |
| kc.micro.Figment 1.0 | 1.8 | 16.5% | 56 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 45 |
| ara.Shera 0.88 | 3.8 | 12.4% | 38 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 3 |
| maribo.IotaCT 1.1 | 6.0 | 8.0% | 1 |
| dsw.StaticD 1.0 | 7.3 | 6.9% | 6 |
| stelo.MirrorMicro 1.0 | 8.1 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 7 / 35 | 5724 |
| 2 | 2 | 66.4 | 81.0 | 10 / 35 | 5391 |
| 3 | 2 | 65.4 | 76.8 | 8 / 35 | 5191 |
| 4 | 2 | 62.5 | 70.8 | 2 / 35 | 4950 |
| 5 | 1 | 68.7 | 84.4 | 13 / 35 | 6011 |
| 6 | 2 | 64.9 | 76.5 | 4 / 35 | 5225 |
| 7 | 2 | 64.7 | 74.9 | 6 / 35 | 5202 |
| 8 | 2 | 64.0 | 72.7 | 6 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 68 | 13% |
| maribo.mini.MiniQuester 0.1 | 35 | 63% |
| ara.Shera 0.88 | 34 | 59% |
| dsw.StaticD 1.0 | 4 | 50% |
| amz.NanoClone 1.41 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 226 of 280 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 128 | 57% | 138 |
| ara.Shera 0.88 | 37 | 16% | 56 |
| maribo.mini.MiniQuester 0.1 | 37 | 16% | 53 |
| dsw.StaticD 1.0 | 7 | 3% | 11 |
| amz.NanoClone 1.41 | 7 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 4 |
| maribo.IotaCT 1.1 | 3 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 68.3 | 17 / 280 | 3.85 | 13.4% | 29391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 215 |
| kc.micro.Figment 1.0 | 2.4 | 13.4% | 17 |
| brainfade.melee.Dusk 0.44 | 2.8 | 13.0% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.1% | 8 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.4% | 6 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 67.9 | 1 / 35 | 3662 |
| 2 | 2 | 60.6 | 64.8 | 1 / 35 | 3524 |
| 3 | 3 | 60.1 | 63.5 | 3 / 35 | 3519 |
| 4 | 2 | 62.6 | 72.4 | 4 / 35 | 3532 |
| 5 | 3 | 60.9 | 65.4 | 2 / 35 | 3749 |
| 6 | 3 | 62.3 | 70.2 | 1 / 35 | 3819 |
| 7 | 2 | 60.7 | 67.0 | 2 / 35 | 3573 |
| 8 | 2 | 63.8 | 75.2 | 3 / 35 | 4013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 0% |
| brainfade.melee.Dusk 0.44 | 13 | 46% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 63% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 263 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 169 | 64% | 171 |
| brainfade.melee.Dusk 0.44 | 34 | 13% | 40 |
| wcsv.melee.EngineerMelee 0.1 | 25 | 10% | 29 |
| dummy.micro.Sparrow 2.5 | 20 | 8% | 24 |
| mz.NanoGod 2.02 | 7 | 3% | 7 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |

## Melee bench: F44

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.5 | 128 / 280 | 2.48 | 18.6% | 44151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.6% | 128 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 107 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.2% | 22 |
| wompi.Quokka 1.6 | 4.1 | 10.6% | 9 |
| jwirde.Gort 2.0 | 5.6 | 9.2% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.1% | 3 |
| disan.Chair 2.2.0 | 7.1 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.5% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 15 / 35 | 5611 |
| 2 | 1 | 68.4 | 82.9 | 19 / 35 | 5330 |
| 3 | 1 | 68.9 | 87.0 | 18 / 35 | 5802 |
| 4 | 1 | 67.4 | 78.7 | 15 / 35 | 5460 |
| 5 | 1 | 66.3 | 78.4 | 13 / 35 | 5499 |
| 6 | 1 | 68.3 | 84.1 | 14 / 35 | 5856 |
| 7 | 1 | 69.4 | 87.3 | 20 / 35 | 5286 |
| 8 | 1 | 67.8 | 82.9 | 14 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 102 | 31% |
| tzu.TheArtOfWar 1.2 | 67 | 81% |
| wompi.Quokka 1.6 | 18 | 83% |
| jwirde.Gort 2.0 | 12 | 83% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 57% | 132 |
| tzu.TheArtOfWar 1.2 | 28 | 18% | 74 |
| wompi.Quokka 1.6 | 13 | 9% | 20 |
| disan.Chair 2.2.0 | 7 | 5% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 9 |
| jwirde.Gort 2.0 | 3 | 2% | 18 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.3 | 126 / 280 | 2.33 | 19.7% | 48503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.7% | 126 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.7% | 129 |
| jje.BagPuss 1.2 | 3.3 | 11.5% | 7 |
| myl.nano.Graviton 1.10 | 4.5 | 9.8% | 3 |
| sul.Lunar 1.1 | 4.6 | 10.0% | 4 |
| hvilela.HVilela 0.9 | 6.4 | 8.9% | 1 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.8 | 7.6% | 4 |
| wit.Deep7 2.0 | 9.0 | 6.3% | 6 |
| abud.ThirdRobo 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.7 | 25 / 35 | 5941 |
| 2 | 1 | 69.4 | 84.1 | 12 / 35 | 6375 |
| 3 | 1 | 68.2 | 81.3 | 11 / 35 | 6179 |
| 4 | 1 | 70.5 | 88.9 | 16 / 35 | 6404 |
| 5 | 1 | 70.6 | 89.8 | 21 / 35 | 6141 |
| 6 | 1 | 70.3 | 87.9 | 17 / 35 | 6184 |
| 7 | 1 | 65.8 | 75.2 | 11 / 35 | 5461 |
| 8 | 1 | 68.4 | 82.2 | 13 / 35 | 5818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 146 | 34% |
| sul.Lunar 1.1 | 24 | 100% |
| jje.BagPuss 1.2 | 22 | 73% |
| myl.nano.Graviton 1.10 | 18 | 94% |
| hvilela.HVilela 0.9 | 7 | 100% |
| wit.Deep7 2.0 | 7 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 2104. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 100 | 65% | 0 |
| jje.BagPuss 1.2 | 10 | 6% | 64 |
| myl.nano.Graviton 1.10 | 10 | 6% | 41 |
| fm.claire 1.7 | 10 | 6% | 16 |
| wit.Deep7 2.0 | 8 | 5% | 25 |
| sul.Lunar 1.1 | 7 | 5% | 64 |
| hvilela.HVilela 0.9 | 6 | 4% | 31 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 24 |
| abud.ThirdRobo 1.0 | 1 | 1% | 5 |

## Melee bench: F46

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 67.8 | 28 / 280 | 3.90 | 13.8% | 32811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.3% | 97 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.0% | 127 |
| kc.micro.Figment 1.0 | 3.0 | 13.8% | 28 |
| mz.MicroSheep 1.0 | 4.4 | 10.5% | 3 |
| cx.Princess 1.0 | 4.9 | 10.0% | 20 |
| sadoner.killer 0.2 | 5.8 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.5% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 74.3 | 5 / 35 | 4416 |
| 2 | 3 | 59.7 | 64.1 | 2 / 35 | 3972 |
| 3 | 3 | 63.1 | 71.7 | 6 / 35 | 4345 |
| 4 | 3 | 59.5 | 67.3 | 2 / 35 | 3498 |
| 5 | 3 | 61.9 | 69.2 | 4 / 35 | 4334 |
| 6 | 3 | 61.5 | 67.6 | 3 / 35 | 4109 |
| 7 | 3 | 60.3 | 64.8 | 2 / 35 | 4140 |
| 8 | 3 | 60.8 | 63.5 | 4 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 49 | 24% |
| rsalesc.melee.Medina 0.4.5 | 28 | 7% |
| mz.MicroSheep 1.0 | 7 | 100% |
| cx.Princess 1.0 | 6 | 83% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 0% |

Hadur died in 253 of 280 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 109 | 43% | 123 |
| rsalesc.melee.Medina 0.4.5 | 81 | 32% | 85 |
| sadoner.killer 0.2 | 18 | 7% | 20 |
| cx.Princess 1.0 | 16 | 6% | 16 |
| arthord.NanoSatanMelee Beta | 12 | 5% | 15 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| mz.MicroSheep 1.0 | 5 | 2% | 9 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

