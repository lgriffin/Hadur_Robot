# Bench suite: suite.txt

## Melee bench: F01

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 72.3 | 32 / 280 | 3.49 | 14.7% | 37449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 196 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 32 |
| sgp.JollyNinja 3.53 | 3.4 | 12.0% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.2% | 4 |
| lorneswork.Predator 1.0 | 4.9 | 10.4% | 10 |
| mz.MicroGodMelee 1 | 5.8 | 9.9% | 10 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.5 | 5.4% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 73.0 | 5 / 35 | 4592 |
| 2 | 2 | 61.1 | 65.7 | 3 / 35 | 4428 |
| 3 | 2 | 62.7 | 72.7 | 2 / 35 | 4808 |
| 4 | 2 | 63.5 | 69.5 | 3 / 35 | 5163 |
| 5 | 2 | 65.5 | 79.0 | 5 / 35 | 5056 |
| 6 | 2 | 61.2 | 71.1 | 4 / 35 | 3955 |
| 7 | 2 | 63.4 | 74.3 | 5 / 35 | 4470 |
| 8 | 2 | 63.5 | 73.0 | 5 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 5% |
| sgp.JollyNinja 3.53 | 18 | 78% |
| mz.MicroGodMelee 1 | 7 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 248 of 280 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 65% | 170 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 8% | 25 |
| mz.MicroGodMelee 1 | 19 | 8% | 24 |
| sgp.JollyNinja 3.53 | 14 | 6% | 23 |
| lorneswork.Predator 1.0 | 14 | 6% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 3% | 9 |
| skm.butterfly 1.0 | 5 | 2% | 5 |
| mym.EdgeStalker 1.0 | 4 | 2% | 4 |
| adt.Ar2 1.0 | 4 | 2% | 4 |

## Melee bench: F02

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.0 | 104 / 280 | 2.89 | 17.3% | 40977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.3% | 104 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.4 | 13.5% | 49 |
| pulsar.PulsarMax 0.8.9 | 2.6 | 13.4% | 68 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.6 | 9.9% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.6 | 10.1% | 1 |
| sch.Simone 0.3d | 6.4 | 8.6% | 20 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 8.4% | 3 |
| Noran.BitchingElk 0.054 | 8.0 | 7.2% | 13 |
| stelo.PatternRobot 1.0 | 8.5 | 6.8% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 75.2 | 14 / 35 | 5236 |
| 2 | 1 | 66.9 | 86.0 | 11 / 35 | 4873 |
| 3 | 1 | 68.3 | 85.1 | 16 / 35 | 5821 |
| 4 | 1 | 62.9 | 69.8 | 12 / 35 | 4393 |
| 5 | 1 | 66.3 | 81.9 | 13 / 35 | 4758 |
| 6 | 1 | 67.5 | 81.6 | 15 / 35 | 5512 |
| 7 | 1 | 64.3 | 74.0 | 10 / 35 | 5145 |
| 8 | 1 | 66.4 | 78.7 | 13 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 59 | 41% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 54% |
| sch.Simone 0.3d | 23 | 70% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 58% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| Noran.BitchingElk 0.054 | 11 | 73% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 179 of 280 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 58 | 32% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 26% | 71 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 9% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 8% | 29 |
| sch.Simone 0.3d | 12 | 7% | 29 |
| stelo.PatternRobot 1.0 | 11 | 6% | 12 |
| fullsail.SweetTea 1.1 | 8 | 4% | 8 |
| Noran.BitchingElk 0.054 | 6 | 3% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.6 | 154 / 280 | 3.01 | 17.6% | 45126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.6% | 154 |
| radnor.DoctorBob 1.42 | 2.0 | 14.4% | 52 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.2% | 28 |
| vuen.Cake 2.51 | 3.6 | 12.3% | 31 |
| urdos.URDOS 1.3 | 4.9 | 10.0% | 6 |
| adt.Ar1 2.1 | 6.5 | 8.0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.4% | 2 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.8% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.1 | 23 / 35 | 6113 |
| 2 | 1 | 66.1 | 74.9 | 19 / 35 | 5596 |
| 3 | 1 | 63.4 | 69.5 | 15 / 35 | 4984 |
| 4 | 1 | 67.3 | 80.0 | 20 / 35 | 5764 |
| 5 | 1 | 65.6 | 73.0 | 18 / 35 | 5540 |
| 6 | 1 | 68.7 | 81.6 | 21 / 35 | 6248 |
| 7 | 1 | 65.5 | 76.2 | 17 / 35 | 5469 |
| 8 | 1 | 66.9 | 80.6 | 21 / 35 | 5412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 82% |
| radnor.DoctorBob 1.42 | 51 | 80% |
| kawigi.nano.Lib 1.0 | 51 | 82% |
| adt.Ar1 2.1 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 80% |
| urdos.URDOS 1.3 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 29% | 81 |
| kawigi.nano.Lib 1.0 | 20 | 16% | 67 |
| vuen.Cake 2.51 | 17 | 13% | 61 |
| ghent.ArthurPanzergon 1.0.0 | 15 | 12% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 11 |
| urdos.URDOS 1.3 | 8 | 6% | 14 |
| oa.weak.FlyMk1 0.1 | 7 | 6% | 13 |
| adt.Ar1 2.1 | 6 | 5% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 2% | 4 |

## Melee bench: F04

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.7 | 8 / 280 | 3.28 | 15.6% | 43743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 251 |
| kc.micro.Figment 1.0 | 2.0 | 15.6% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 5 |
| josago.Jorgito 0.16 | 5.1 | 8.9% | 3 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 72.4 | 0 / 35 | 5332 |
| 2 | 2 | 65.1 | 71.1 | 1 / 35 | 5684 |
| 3 | 2 | 66.7 | 77.1 | 0 / 35 | 5758 |
| 4 | 2 | 67.4 | 85.1 | 2 / 35 | 5504 |
| 5 | 2 | 63.5 | 68.6 | 2 / 35 | 5237 |
| 6 | 2 | 65.1 | 72.7 | 3 / 35 | 5573 |
| 7 | 2 | 64.8 | 75.2 | 0 / 35 | 5149 |
| 8 | 2 | 65.5 | 75.6 | 0 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 101 | 1% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 5 | 40% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 273 of 280 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 205 | 75% | 208 |
| apc.LeeroyJenkins2 1.0 | 30 | 11% | 33 |
| TNT.TNT 0.99.1 | 13 | 5% | 14 |
| josago.Jorgito 0.16 | 9 | 3% | 9 |
| css.Delitioner 0.11 | 7 | 3% | 7 |
| tj.zombie1n 1.0.1 | 5 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F05

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 61.6 | 11 / 280 | 4.46 | 12.7% | 32523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.0% | 145 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 87 |
| wompi.Numbat 2.1 | 3.4 | 12.9% | 23 |
| kc.micro.Figment 1.0 | 3.6 | 12.7% | 11 |
| ms.Ares 0.19 | 5.4 | 9.0% | 3 |
| axeBots.HataMoto 3.09 | 5.6 | 9.4% | 11 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.1 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 64.4 | 1 / 35 | 4148 |
| 2 | 4 | 59.6 | 60.6 | 0 / 35 | 4320 |
| 3 | 4 | 58.6 | 59.7 | 1 / 35 | 4128 |
| 4 | 3 | 59.9 | 62.2 | 3 / 35 | 4148 |
| 5 | 4 | 58.3 | 58.7 | 1 / 35 | 4030 |
| 6 | 3 | 61.2 | 66.7 | 3 / 35 | 4117 |
| 7 | 3 | 58.7 | 62.2 | 1 / 35 | 3744 |
| 8 | 4 | 58.0 | 58.1 | 1 / 35 | 3888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 29 | 21% |
| cb.fire.Firestarter 2.0f | 26 | 4% |
| wompi.Numbat 2.1 | 7 | 43% |
| axeBots.HataMoto 3.09 | 3 | 33% |

Hadur died in 269 of 280 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 95 | 35% | 100 |
| cb.fire.Firestarter 2.0f | 91 | 34% | 94 |
| wompi.Numbat 2.1 | 37 | 14% | 39 |
| ms.Ares 0.19 | 15 | 6% | 15 |
| axeBots.HataMoto 3.09 | 13 | 5% | 14 |
| supersample.SuperBoxBot 1.0 | 8 | 3% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 7 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 1% | 3 |

## Melee bench: F06

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 75.5 | 119 / 280 | 3.21 | 16.4% | 36382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.4% | 119 |
| jekl.StoneGhost 0.7 | 1.8 | 14.8% | 50 |
| origin.SleepSiphon 1.7b | 3.5 | 13.0% | 59 |
| mld.Wisdom 1.0 | 4.3 | 11.8% | 15 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.6% | 18 |
| gg.Wolverine 2.0 | 6.3 | 8.2% | 10 |
| DBall.NUKE 0.1 | 7.8 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.9 | 6.8% | 7 |
| spinnercat.Omen 1.0 | 8.1 | 6.7% | 1 |
| sample.Fire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.7 | 13 / 35 | 4572 |
| 2 | 2 | 63.8 | 72.4 | 13 / 35 | 4582 |
| 3 | 1 | 66.5 | 80.0 | 19 / 35 | 4585 |
| 4 | 1 | 67.2 | 82.9 | 19 / 35 | 4753 |
| 5 | 1 | 65.8 | 78.1 | 16 / 35 | 4492 |
| 6 | 2 | 62.0 | 68.9 | 12 / 35 | 3967 |
| 7 | 1 | 65.0 | 75.6 | 14 / 35 | 4794 |
| 8 | 1 | 64.6 | 73.3 | 13 / 35 | 4637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 74% |
| origin.SleepSiphon 1.7b | 40 | 58% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 84% |
| gg.Wolverine 2.0 | 14 | 57% |
| DBall.NUKE 0.1 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| mld.Wisdom 1.0 | 4 | 75% |

Hadur died in 163 of 280 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 23% | 44 |
| origin.SleepSiphon 1.7b | 34 | 21% | 64 |
| jekl.StoneGhost 0.7 | 32 | 20% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 17% | 62 |
| gg.Wolverine 2.0 | 14 | 9% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 6% | 15 |
| DBall.NUKE 0.1 | 3 | 2% | 9 |
| spinnercat.Omen 1.0 | 3 | 2% | 4 |
| sample.Fire 1.0 | 2 | 1% | 3 |

## Melee bench: F07

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.5 | 108 / 280 | 2.49 | 18.8% | 50040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.8% | 108 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.2% | 72 |
| rtk.Tachikoma 1.0 | 2.9 | 16.3% | 70 |
| franzor.Lizt 1.3.1 | 4.3 | 11.1% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.9% | 11 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.5% | 0 |
| sample.Target 1.0 | 9.3 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.0 | 9 / 35 | 5906 |
| 2 | 1 | 69.1 | 79.0 | 13 / 35 | 6076 |
| 3 | 1 | 69.5 | 85.1 | 12 / 35 | 5961 |
| 4 | 1 | 69.9 | 81.9 | 16 / 35 | 6566 |
| 5 | 1 | 68.9 | 82.9 | 14 / 35 | 5724 |
| 6 | 1 | 70.9 | 86.3 | 15 / 35 | 6565 |
| 7 | 1 | 69.3 | 82.2 | 11 / 35 | 6458 |
| 8 | 1 | 71.6 | 89.2 | 18 / 35 | 6784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 90 | 53% |
| rsalesc.melee.Monk 0.3.6c | 48 | 19% |
| oog.melee.CapuletDroid 1.1 | 36 | 86% |
| franzor.Lizt 1.3.1 | 27 | 67% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 172 of 280 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 65 | 38% | 94 |
| rtk.Tachikoma 1.0 | 63 | 37% | 135 |
| oog.melee.CapuletDroid 1.1 | 16 | 9% | 24 |
| exauge.GateKeeper 1.1.121g | 9 | 5% | 14 |
| franzor.Lizt 1.3.1 | 9 | 5% | 0 |
| lrem.micro.MoggFanatic 0.2 | 7 | 4% | 10 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F08

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.5 | 111 / 280 | 2.94 | 17.8% | 45013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 111 |
| tm.Yuugao 1.0 | 2.0 | 13.8% | 87 |
| shrub.Vapour v159 | 3.5 | 11.2% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 4.4 | 10.4% | 24 |
| Krabb.sliNk.Garm 0.9u | 5.4 | 9.7% | 11 |
| m3thos.Eva00 1.1 | 5.5 | 9.5% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.3% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.0% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.4% | 0 |
| SHAM.WOW 1.4 | 9.6 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.9 | 16 / 35 | 5716 |
| 2 | 1 | 68.6 | 81.6 | 18 / 35 | 5990 |
| 3 | 1 | 67.8 | 81.9 | 16 / 35 | 5889 |
| 4 | 1 | 68.0 | 85.1 | 16 / 35 | 5393 |
| 5 | 1 | 62.9 | 65.1 | 12 / 35 | 5217 |
| 6 | 1 | 66.3 | 77.5 | 13 / 35 | 5626 |
| 7 | 1 | 65.9 | 76.5 | 12 / 35 | 5656 |
| 8 | 1 | 66.3 | 78.4 | 8 / 35 | 5526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 74 | 30% |
| shrub.Vapour v159 | 45 | 69% |
| com.spp.robocode.MostlyHarmless 010 | 27 | 59% |
| Krabb.sliNk.Garm 0.9u | 19 | 95% |
| m3thos.Eva00 1.1 | 11 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 75 | 44% | 106 |
| shrub.Vapour v159 | 30 | 18% | 50 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 12% | 41 |
| Krabb.sliNk.Garm 0.9u | 9 | 5% | 21 |
| m3thos.Eva00 1.1 | 9 | 5% | 16 |
| zyx.nano.BacillusComma 1.0 | 8 | 5% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 4% | 20 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 8 |
| SHAM.WOW 1.4 | 5 | 3% | 7 |

## Melee bench: F09

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 8 battles (0.6 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 65.6 | 51 / 280 | 4.10 | 13.8% | 31219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 154 |
| kc.micro.Figment 1.0 | 2.3 | 13.8% | 51 |
| hadur117.micro.Saor 0.1 | 3.0 | 12.8% | 28 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.7% | 16 |
| yagami.Tidus 0.11 | 4.9 | 10.8% | 2 |
| mc2.enemy.Original 0.9 | 5.6 | 9.6% | 20 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 7 |
| step.nanoPri 1.0 | 8.3 | 6.2% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.7% | 1 |
| rdm.Dueler 0.4x | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 73.3 | 8 / 35 | 4219 |
| 2 | 2 | 61.6 | 66.7 | 6 / 35 | 4155 |
| 3 | 3 | 56.5 | 53.7 | 6 / 35 | 3703 |
| 4 | 2 | 62.3 | 72.4 | 5 / 35 | 4098 |
| 5 | 3 | 58.6 | 59.4 | 6 / 35 | 3704 |
| 6 | 2 | 60.6 | 65.7 | 9 / 35 | 3677 |
| 7 | 2 | 60.0 | 67.9 | 3 / 35 | 3716 |
| 8 | 2 | 61.0 | 65.7 | 8 / 35 | 3947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 6% |
| hadur117.micro.Saor 0.1 | 23 | 70% |
| pedersen.Grishnakh 1.0 | 14 | 79% |
| mc2.enemy.Original 0.9 | 13 | 46% |
| yagami.Tidus 0.11 | 12 | 92% |
| dft.Calliope 5.6 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 106 | 46% | 114 |
| hadur117.micro.Saor 0.1 | 56 | 24% | 76 |
| mc2.enemy.Original 0.9 | 23 | 10% | 29 |
| robar.nano.Assertive_Melee 0.2 | 11 | 5% | 11 |
| pedersen.Grishnakh 1.0 | 9 | 4% | 15 |
| dft.Calliope 5.6 | 7 | 3% | 11 |
| yagami.Tidus 0.11 | 6 | 3% | 13 |
| rdm.Dueler 0.4x | 6 | 3% | 6 |
| step.nanoPri 1.0 | 5 | 2% | 5 |

## Melee bench: F10

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 147 / 280 | 2.25 | 18.5% | 44102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.5% | 147 |
| DTF.Kludgy 1.2b | 1.9 | 15.0% | 81 |
| ne.Chimera 1.2 | 3.3 | 12.7% | 18 |
| ejb.Polaris 1.0.1 | 3.9 | 12.3% | 23 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.3% | 7 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.5 | 6.1% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.8 | 11 / 35 | 5642 |
| 2 | 1 | 68.3 | 86.7 | 18 / 35 | 5359 |
| 3 | 2 | 64.8 | 75.6 | 11 / 35 | 4980 |
| 4 | 1 | 68.9 | 87.3 | 22 / 35 | 5409 |
| 5 | 1 | 67.5 | 83.8 | 18 / 35 | 5340 |
| 6 | 1 | 70.0 | 89.8 | 22 / 35 | 6010 |
| 7 | 1 | 70.3 | 90.8 | 24 / 35 | 5966 |
| 8 | 1 | 69.0 | 89.8 | 21 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 77 | 32% |
| ejb.Polaris 1.0.1 | 48 | 83% |
| ne.Chimera 1.2 | 37 | 84% |
| vStar.RAFzilla 2.15 | 22 | 95% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 81 | 61% | 105 |
| ne.Chimera 1.2 | 21 | 16% | 47 |
| ejb.Polaris 1.0.1 | 15 | 11% | 66 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 8% | 14 |
| tvv.micro.Antares 1.1.1 | 2 | 2% | 14 |
| kurios.DOSexe .9b | 2 | 2% | 7 |
| vStar.RAFzilla 2.15 | 1 | 1% | 21 |
| sam.Samspin 1.0 | 1 | 1% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

## Melee bench: F11

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 69.5 | 67 / 280 | 3.75 | 15.0% | 35309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 136 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 67 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.3% | 20 |
| djc.DynaBot 0.1.1 | 3.8 | 10.6% | 13 |
| br2.MobyDickBot 1.6 | 5.9 | 9.0% | 12 |
| rdt199.Warlord 0.73 | 6.0 | 8.9% | 17 |
| uji.YellohFellah 1.0 | 7.0 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 7.1 | 7.9% | 4 |
| stelo.MirrorNano 1.3 | 9.5 | 5.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 72.4 | 10 / 35 | 4564 |
| 2 | 2 | 60.6 | 65.7 | 7 / 35 | 4108 |
| 3 | 2 | 64.3 | 74.6 | 8 / 35 | 4662 |
| 4 | 2 | 63.3 | 71.1 | 9 / 35 | 4642 |
| 5 | 2 | 58.7 | 61.6 | 7 / 35 | 3967 |
| 6 | 2 | 63.5 | 72.4 | 10 / 35 | 4259 |
| 7 | 2 | 61.9 | 67.3 | 8 / 35 | 4467 |
| 8 | 2 | 63.2 | 70.8 | 8 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 65 | 11% |
| cx.mini.Nimrod 0.55 | 23 | 78% |
| djc.DynaBot 0.1.1 | 16 | 94% |
| uji.YellohFellah 1.0 | 15 | 87% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| rdt199.Warlord 0.73 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 2 | 0% |

Hadur died in 213 of 280 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 113 | 53% | 124 |
| cx.mini.Nimrod 0.55 | 33 | 15% | 48 |
| br2.MobyDickBot 1.6 | 15 | 7% | 22 |
| KiraNL.Chupacabra 0.4 | 15 | 7% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 5% | 11 |
| djc.DynaBot 0.1.1 | 7 | 3% | 17 |
| rdt199.Warlord 0.73 | 7 | 3% | 15 |
| stelo.MirrorNano 1.3 | 7 | 3% | 9 |
| uji.YellohFellah 1.0 | 5 | 2% | 18 |

## Melee bench: F12

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 76.4 | 114 / 280 | 3.12 | 16.1% | 30897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.1% | 114 |
| darkcanuck.Leon 1.01 | 2.8 | 13.1% | 43 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.4% | 51 |
| nat.PallasHawk 1.0 | 3.3 | 12.7% | 38 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 22 |
| jrm.Test0 1.0 | 6.4 | 8.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 1 |
| jp.Perpy 16.0 | 8.0 | 7.0% | 2 |
| stuff.Vlad 0.1 | 9.1 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 74.6 | 14 / 35 | 4021 |
| 2 | 1 | 65.6 | 80.0 | 14 / 35 | 4160 |
| 3 | 1 | 63.6 | 74.6 | 12 / 35 | 3682 |
| 4 | 1 | 64.6 | 76.8 | 13 / 35 | 3931 |
| 5 | 1 | 61.9 | 70.2 | 13 / 35 | 3385 |
| 6 | 1 | 65.2 | 79.7 | 15 / 35 | 4042 |
| 7 | 1 | 65.1 | 78.7 | 19 / 35 | 3757 |
| 8 | 1 | 64.0 | 76.8 | 14 / 35 | 3919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 48 | 71% |
| bts.wiki.RipCurl 0.9b | 45 | 49% |
| darkcanuck.Leon 1.01 | 44 | 73% |
| brainfade.melee.Genghis 0.36 | 16 | 75% |
| jp.Perpy 16.0 | 8 | 88% |
| jaybot.bots.Oddball 4.0 | 4 | 50% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 43 | 26% | 73 |
| nat.PallasHawk 1.0 | 32 | 19% | 57 |
| darkcanuck.Leon 1.01 | 29 | 17% | 69 |
| brainfade.melee.Genghis 0.36 | 22 | 13% | 30 |
| jrm.Test0 1.0 | 20 | 12% | 21 |
| cs.sheldor.Talon 1.1 | 10 | 6% | 13 |
| jp.Perpy 16.0 | 7 | 4% | 9 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F13

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 65.5 | 14 / 280 | 4.11 | 13.2% | 33855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.2% | 139 |
| ags.Glacier 0.2.11 | 1.6 | 17.2% | 88 |
| kc.micro.Figment 1.0 | 3.3 | 13.2% | 14 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 12 |
| shinh.Entangled 0.3 | 4.5 | 11.7% | 26 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.4 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.5 | 5.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 61.9 | 1 / 35 | 4428 |
| 2 | 3 | 60.3 | 63.5 | 1 / 35 | 4275 |
| 3 | 3 | 63.0 | 70.2 | 3 / 35 | 4929 |
| 4 | 3 | 60.5 | 67.6 | 2 / 35 | 4135 |
| 5 | 4 | 56.6 | 55.2 | 0 / 35 | 3759 |
| 6 | 3 | 61.1 | 69.2 | 4 / 35 | 3947 |
| 7 | 4 | 59.2 | 64.4 | 2 / 35 | 3836 |
| 8 | 3 | 62.2 | 71.7 | 1 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 33 | 18% |
| mn.Combat 3.25.0 | 31 | 10% |
| shinh.Entangled 0.3 | 14 | 21% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 266 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 89 | 33% | 92 |
| ags.Glacier 0.2.11 | 82 | 31% | 87 |
| shinh.Entangled 0.3 | 37 | 14% | 39 |
| gh.micro.Gruweltje 0.7 | 21 | 8% | 24 |
| maribo.FollowFire 1 | 17 | 6% | 18 |
| stelo.Wang 1.0 | 10 | 4% | 11 |
| apc.Colossus2 0.17 | 6 | 2% | 7 |
| ayk.WallHugger 1.0 | 4 | 2% | 2 |

## Melee bench: F14

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.2 | 159 / 280 | 3.05 | 17.4% | 41000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.4% | 159 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.5% | 30 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 55 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.8% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.5% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.3% | 13 |
| pa.Improved 1.0 | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.1 | 24 / 35 | 5545 |
| 2 | 1 | 63.0 | 65.1 | 15 / 35 | 4694 |
| 3 | 1 | 67.9 | 83.5 | 21 / 35 | 5259 |
| 4 | 1 | 69.0 | 84.4 | 22 / 35 | 5532 |
| 5 | 1 | 62.2 | 63.5 | 17 / 35 | 4698 |
| 6 | 1 | 69.7 | 90.2 | 22 / 35 | 5187 |
| 7 | 1 | 67.9 | 81.0 | 22 / 35 | 5413 |
| 8 | 1 | 62.4 | 65.1 | 16 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 92 | 90% |
| catcat20.shape.Theta 0.018 | 60 | 60% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 121 of 280 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 33% | 125 |
| catcat20.shape.Theta 0.018 | 38 | 31% | 67 |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 12% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 8 | 7% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 2% | 5 |
| pa.Improved 1.0 | 2 | 2% | 6 |

## Melee bench: F15

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.8 | 158 / 280 | 2.46 | 19.2% | 47772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.2% | 158 |
| kawigi.micro.Shiz 1.1 | 2.4 | 13.7% | 30 |
| emp.Yngwie 1.11 | 3.1 | 13.2% | 62 |
| mld.DustBunny 3.8 | 3.5 | 12.1% | 8 |
| cb.nano.Insomnia 1.0 | 5.4 | 9.1% | 5 |
| kawigi.robot.Girl 1.2 | 6.1 | 8.6% | 12 |
| lambdaxy.TBot 0.1 | 7.3 | 7.1% | 0 |
| Grystrion.TrackerWO 1.0 | 7.4 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.5% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.1 | 23 / 35 | 5848 |
| 2 | 1 | 68.3 | 82.5 | 20 / 35 | 5654 |
| 3 | 1 | 70.6 | 88.9 | 25 / 35 | 6260 |
| 4 | 1 | 68.9 | 84.8 | 16 / 35 | 5985 |
| 5 | 1 | 71.2 | 89.2 | 25 / 35 | 6259 |
| 6 | 1 | 67.3 | 77.5 | 16 / 35 | 5997 |
| 7 | 1 | 67.1 | 80.0 | 12 / 35 | 5705 |
| 8 | 1 | 69.5 | 83.2 | 21 / 35 | 6064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 63 | 57% |
| kawigi.micro.Shiz 1.1 | 60 | 92% |
| mld.DustBunny 3.8 | 28 | 93% |
| kawigi.robot.Girl 1.2 | 25 | 84% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 52 | 43% | 97 |
| kawigi.micro.Shiz 1.1 | 17 | 14% | 57 |
| cb.nano.Insomnia 1.0 | 14 | 11% | 14 |
| mld.DustBunny 3.8 | 13 | 11% | 52 |
| kawigi.robot.Girl 1.2 | 10 | 8% | 25 |
| Grystrion.TrackerWO 1.0 | 7 | 6% | 10 |
| lambdaxy.TBot 0.1 | 4 | 3% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 3% | 5 |
| divineomega.TrialBot 0.003 | 1 | 1% | 12 |

## Melee bench: F16

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.4 | 101 / 280 | 2.40 | 18.6% | 46323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.6% | 101 |
| gh.Griezel 0.5.2 | 1.9 | 17.1% | 127 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.1 | 13.4% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.6% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.1 | 9.2% | 2 |
| tvv.nano.Polaris 1.2 | 5.6 | 8.8% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.1 | 6.8% | 1 |
| repositorio.NanoStep 1.0 | 8.3 | 5.7% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.8 | 12 / 35 | 5541 |
| 2 | 1 | 69.2 | 87.3 | 14 / 35 | 5699 |
| 3 | 1 | 69.7 | 87.6 | 15 / 35 | 6254 |
| 4 | 1 | 66.7 | 78.1 | 11 / 35 | 5480 |
| 5 | 1 | 69.2 | 87.0 | 14 / 35 | 5685 |
| 6 | 2 | 68.6 | 86.0 | 8 / 35 | 5823 |
| 7 | 1 | 70.0 | 89.5 | 16 / 35 | 5882 |
| 8 | 1 | 68.2 | 81.9 | 11 / 35 | 5959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 125 | 22% |
| techdude.forest.FlamingForest 1.1 | 36 | 47% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 33 | 97% |
| bvh.fnr.Fenrir 0.36l | 13 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 71% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 1517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 124 | 69% | 162 |
| techdude.forest.FlamingForest 1.1 | 23 | 13% | 40 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 6% | 37 |
| bvh.fnr.Fenrir 0.36l | 6 | 3% | 11 |
| tvv.nano.Polaris 1.2 | 5 | 3% | 6 |
| asd.Cthulhu 1.3 | 4 | 2% | 4 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 11 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |

## Melee bench: F17

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.2 | 122 / 280 | 2.78 | 17.5% | 39401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.5% | 122 |
| et.Predator 1.8 | 2.8 | 13.0% | 33 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.3% | 36 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 64 |
| nic.Nicator 2.4 | 5.0 | 11.3% | 12 |
| ahf.NanoAndrew .4 | 5.9 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 6.9 | 8.6% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 6.0% | 1 |
| tex.Longbot 0.4 | 8.6 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.5 | 12 / 35 | 4765 |
| 2 | 1 | 68.3 | 87.0 | 17 / 35 | 4919 |
| 3 | 1 | 68.4 | 82.5 | 18 / 35 | 5254 |
| 4 | 1 | 66.3 | 79.4 | 15 / 35 | 4810 |
| 5 | 1 | 66.7 | 79.0 | 15 / 35 | 5060 |
| 6 | 1 | 66.8 | 79.4 | 18 / 35 | 4790 |
| 7 | 1 | 66.7 | 82.2 | 15 / 35 | 4564 |
| 8 | 1 | 66.0 | 75.9 | 12 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 61% |
| et.Predator 1.8 | 50 | 74% |
| cx.BlestPain 1.41 | 44 | 20% |
| nic.Nicator 2.4 | 29 | 76% |
| ahf.NanoAndrew .4 | 18 | 94% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 158 of 280 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 29% | 58 |
| oog.melee.Mercutio 1.0 | 36 | 23% | 67 |
| et.Predator 1.8 | 35 | 22% | 72 |
| nic.Nicator 2.4 | 15 | 9% | 35 |
| ahf.NanoAndrew .4 | 11 | 7% | 27 |
| maribo.melee.BMV 0.1 | 5 | 3% | 9 |
| tex.Longbot 0.4 | 5 | 3% | 4 |
| goblin.Bender 2.4 | 3 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 4 |

## Melee bench: F18

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.4 | 142 / 280 | 2.67 | 17.8% | 37801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 142 |
| morbid.MorbidPriest 1.0 | 2.4 | 13.2% | 39 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.8% | 51 |
| uji.DBH 1.1 | 3.9 | 10.9% | 9 |
| ratosh.Nobo 0.21 | 5.4 | 9.9% | 6 |
| spinnercat.Robovirus 2.718 | 5.6 | 9.6% | 8 |
| sigterm.Sigterm 1.0 | 6.6 | 8.6% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 6 |
| stelo.WangRobot 1.0 | 9.3 | 5.4% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.5 | 20 / 35 | 4461 |
| 2 | 1 | 66.3 | 81.3 | 18 / 35 | 4456 |
| 3 | 1 | 67.2 | 79.4 | 18 / 35 | 5045 |
| 4 | 1 | 67.6 | 85.1 | 19 / 35 | 4694 |
| 5 | 1 | 69.0 | 87.9 | 20 / 35 | 5160 |
| 6 | 1 | 65.1 | 76.5 | 15 / 35 | 4440 |
| 7 | 1 | 65.6 | 77.8 | 15 / 35 | 4913 |
| 8 | 1 | 66.8 | 81.0 | 17 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 78% |
| agd.Mooserwirt2 2.7 | 41 | 39% |
| uji.DBH 1.1 | 34 | 91% |
| sigterm.Sigterm 1.0 | 23 | 87% |
| ratosh.Nobo 0.21 | 14 | 86% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| stelo.WangRobot 1.0 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |

Hadur died in 138 of 280 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 42 | 30% | 66 |
| morbid.MorbidPriest 1.0 | 32 | 23% | 87 |
| ratosh.Nobo 0.21 | 19 | 14% | 31 |
| uji.DBH 1.1 | 13 | 9% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 7% | 18 |
| sigterm.Sigterm 1.0 | 9 | 7% | 17 |
| stelo.WangRobot 1.0 | 6 | 4% | 16 |
| spinnercat.Robovirus 2.718 | 4 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 3% | 7 |

## Melee bench: F19

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 90.8 | 215 / 280 | 1.83 | 20.8% | 47325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 20.8% | 215 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 14.8% | 26 |
| mld.Infinity 2.2 | 2.9 | 13.3% | 30 |
| erdnis.Rover 0.3 | 4.4 | 11.0% | 4 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 10.6% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 1 |
| pac.ABC 2.1 | 8.0 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.3 | 30 / 35 | 6275 |
| 2 | 1 | 71.7 | 91.1 | 29 / 35 | 5701 |
| 3 | 1 | 71.3 | 90.2 | 29 / 35 | 5859 |
| 4 | 1 | 71.5 | 93.0 | 28 / 35 | 5438 |
| 5 | 1 | 70.6 | 85.4 | 23 / 35 | 6043 |
| 6 | 1 | 72.4 | 95.6 | 29 / 35 | 5826 |
| 7 | 1 | 71.8 | 90.2 | 27 / 35 | 6330 |
| 8 | 1 | 70.4 | 86.7 | 20 / 35 | 5853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 93% |
| mld.Infinity 2.2 | 80 | 93% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| erdnis.Rover 0.3 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 65 of 280 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 29% | 126 |
| krillr.mini.JointStrike 2.0.0 | 16 | 25% | 39 |
| mld.Infinity 2.2 | 10 | 15% | 29 |
| erdnis.Rover 0.3 | 9 | 14% | 32 |
| patson.PatsonTestBot 1.0 | 5 | 8% | 22 |
| mbh.Mbh 0.1 | 3 | 5% | 13 |
| pac.ABC 2.1 | 2 | 3% | 6 |
| pedersen.Moron 2.0 | 1 | 2% | 0 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |

## Melee bench: F20

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.2 | 134 / 280 | 2.24 | 19.2% | 46188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.2% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 58 |
| fwb.Nine 1.0.1 | 3.4 | 11.4% | 45 |
| nz.jdc.nano.GridFu 1.0 | 4.1 | 10.6% | 9 |
| catcat20.Rabbit 0.001 | 4.5 | 10.3% | 30 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 7.8% | 2 |
| bayen.nut.Squirrel 1.615 | 8.1 | 6.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.9 | 18 / 35 | 6037 |
| 2 | 1 | 69.0 | 87.0 | 17 / 35 | 5732 |
| 3 | 1 | 69.9 | 89.5 | 18 / 35 | 5757 |
| 4 | 1 | 69.6 | 89.8 | 16 / 35 | 5752 |
| 5 | 1 | 68.5 | 82.2 | 20 / 35 | 5743 |
| 6 | 1 | 69.6 | 87.3 | 18 / 35 | 5778 |
| 7 | 1 | 68.7 | 84.8 | 14 / 35 | 5989 |
| 8 | 1 | 67.4 | 81.3 | 13 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 111 | 72% |
| fwb.Nine 1.0.1 | 47 | 28% |
| catcat20.Rabbit 0.001 | 21 | 43% |
| nz.jdc.nano.GridFu 1.0 | 17 | 88% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1341. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 40% | 134 |
| fwb.Nine 1.0.1 | 35 | 24% | 10 |
| catcat20.Rabbit 0.001 | 29 | 20% | 49 |
| nz.jdc.nano.GridFu 1.0 | 12 | 8% | 37 |
| bayen.nut.Squirrel 1.615 | 4 | 3% | 13 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 1% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 5 |

## Melee bench: F21

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.5 | 153 / 280 | 2.13 | 19.5% | 44846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.5% | 153 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 98 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 2 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 3 |
| fire219.CatBot 1.0 | 7.0 | 6.5% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.3 | 20 / 35 | 5734 |
| 2 | 1 | 69.6 | 84.8 | 17 / 35 | 6014 |
| 3 | 1 | 70.6 | 91.1 | 22 / 35 | 5687 |
| 4 | 1 | 68.4 | 87.3 | 18 / 35 | 5164 |
| 5 | 1 | 68.6 | 82.2 | 18 / 35 | 5475 |
| 6 | 1 | 70.3 | 85.4 | 22 / 35 | 5499 |
| 7 | 1 | 69.6 | 86.7 | 18 / 35 | 5522 |
| 8 | 1 | 69.7 | 87.9 | 18 / 35 | 5751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 54% |
| dummy.mini.Scimitar 1.01 | 38 | 95% |
| cf.RiO.RiOx 4.2.1 | 29 | 97% |
| eld.Hmm 1.0 | 14 | 79% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 128 of 280 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 81 | 63% | 127 |
| dummy.mini.Scimitar 1.01 | 14 | 11% | 65 |
| cf.RiO.RiOx 4.2.1 | 13 | 10% | 25 |
| eld.Hmm 1.0 | 6 | 5% | 35 |
| fire219.CatBot 1.0 | 6 | 5% | 8 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 9 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| PSW.Relentless 0.1 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F23

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 79.7 | 113 / 280 | 2.83 | 18.2% | 46212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 18.2% | 113 |
| pe.SandboxLump 1.52 | 1.6 | 17.6% | 102 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 39 |
| stelo.RamTrackSurfer 1.2 | 4.6 | 9.8% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4.9 | 9.7% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.3% | 7 |
| cw.megas.Blade 0.8 | 7.3 | 8.3% | 2 |
| sample.Walls 1.0 | 7.5 | 7.8% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 4.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 80.0 | 18 / 35 | 6246 |
| 2 | 1 | 67.5 | 76.5 | 13 / 35 | 5709 |
| 3 | 1 | 67.2 | 74.0 | 13 / 35 | 5290 |
| 4 | 1 | 71.3 | 91.1 | 15 / 35 | 6418 |
| 5 | 2 | 68.5 | 79.4 | 13 / 35 | 5855 |
| 6 | 1 | 68.1 | 78.4 | 12 / 35 | 5495 |
| 7 | 2 | 69.7 | 85.1 | 13 / 35 | 5791 |
| 8 | 2 | 67.1 | 73.3 | 16 / 35 | 5408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 127 | 54% |
| cre.Karolos 0.32 | 33 | 52% |
| stelo.AreaTargetingBot 1.1 | 14 | 79% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 82 | 49% | 148 |
| cre.Karolos 0.32 | 38 | 23% | 54 |
| stelo.AreaTargetingBot 1.1 | 17 | 10% | 25 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 5% | 18 |
| stelo.RamTrackSurfer 1.2 | 9 | 5% | 14 |
| sample.Walls 1.0 | 8 | 5% | 11 |
| cw.megas.Blade 0.8 | 4 | 2% | 9 |

## Melee bench: F24

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 72.0 | 66 / 280 | 3.52 | 15.0% | 32513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.6 | 15.0% | 66 |
| rz.GlowBlowMelee 1.4 | 2.4 | 14.1% | 61 |
| florent.XSeries.X2 0.12 | 2.6 | 13.9% | 56 |
| davidalves.Phoenix 0.54 | 3.8 | 12.9% | 53 |
| pedersen.Ugluk 1.1.1 | 4.6 | 10.9% | 26 |
| oog.melee.Corsair 1.0 | 6.1 | 9.1% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 7.0% | 8 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.8% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 1 |
| evd.X1 0.01 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 69.2 | 9 / 35 | 4119 |
| 2 | 3 | 60.2 | 65.7 | 5 / 35 | 3802 |
| 3 | 1 | 63.7 | 75.6 | 9 / 35 | 4397 |
| 4 | 1 | 64.7 | 77.1 | 12 / 35 | 4147 |
| 5 | 2 | 61.8 | 72.7 | 2 / 35 | 3985 |
| 6 | 1 | 62.8 | 72.1 | 10 / 35 | 3983 |
| 7 | 2 | 61.2 | 67.9 | 10 / 35 | 3669 |
| 8 | 1 | 64.6 | 75.9 | 9 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 50% |
| florent.XSeries.X2 0.12 | 35 | 34% |
| davidalves.Phoenix 0.54 | 34 | 41% |
| pedersen.Ugluk 1.1.1 | 21 | 43% |
| stelo.SoJNanoMelee 1.1 | 8 | 75% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 71 | 33% | 81 |
| rz.GlowBlowMelee 1.4 | 51 | 24% | 70 |
| davidalves.Phoenix 0.54 | 42 | 20% | 52 |
| pedersen.Ugluk 1.1.1 | 21 | 10% | 27 |
| oog.melee.Corsair 1.0 | 9 | 4% | 18 |
| evd.X1 0.01 | 8 | 4% | 10 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 9 |
| as.FrankTheTank 1.3 | 3 | 1% | 6 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 5 |

## Melee bench: F25

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.9 | 177 / 280 | 2.54 | 18.2% | 34994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.2% | 177 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.6% | 30 |
| jdw.Hurricane 1.4 | 3.6 | 11.3% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.6 | 11.7% | 16 |
| gre.svman4.Morfeas 1.4.1 | 4.9 | 9.8% | 13 |
| ds.Oo 2.2 | 6.0 | 9.0% | 11 |
| awesomeness.Elite 1.0 | 7.4 | 7.5% | 3 |
| gjr.Cephalosporin 0.1 | 7.9 | 7.6% | 7 |
| adt.Ar2 1.1 | 8.8 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 23 / 35 | 4385 |
| 2 | 1 | 68.5 | 85.7 | 22 / 35 | 4601 |
| 3 | 1 | 65.3 | 75.9 | 19 / 35 | 4271 |
| 4 | 1 | 67.7 | 84.1 | 21 / 35 | 4326 |
| 5 | 1 | 66.9 | 79.7 | 23 / 35 | 4387 |
| 6 | 1 | 69.4 | 88.9 | 25 / 35 | 4602 |
| 7 | 1 | 65.5 | 78.7 | 21 / 35 | 3773 |
| 8 | 1 | 68.3 | 84.8 | 23 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 65 | 88% |
| voidious.micro.BlitzBat 1.05 | 52 | 98% |
| jdw.Hurricane 1.4 | 32 | 88% |
| gjr.Cephalosporin 0.1 | 13 | 92% |
| ds.Oo 2.2 | 12 | 83% |
| gre.svman4.Morfeas 1.4.1 | 9 | 89% |
| adt.Ar2 1.1 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 83% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 103 of 280 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 24% | 83 |
| jdw.Hurricane 1.4 | 17 | 17% | 41 |
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 62 |
| ds.Oo 2.2 | 13 | 13% | 23 |
| gre.svman4.Morfeas 1.4.1 | 12 | 12% | 25 |
| awesomeness.Elite 1.0 | 7 | 7% | 13 |
| adt.Ar2 1.1 | 7 | 7% | 9 |
| gjr.Cephalosporin 0.1 | 5 | 5% | 18 |
| amk.ChumbaMini 0.2 | 3 | 3% | 6 |

## Melee bench: F26

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.2 | 119 / 280 | 2.60 | 17.8% | 44269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.8% | 119 |
| ak.Fermat 2.0 | 1.9 | 15.6% | 76 |
| lrem.Spectre 0.4.4 | 3.4 | 12.8% | 31 |
| shu.nitro.LENIN .T34 | 3.9 | 12.1% | 40 |
| js.PinBall 1.6 | 4.9 | 10.8% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.5% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.0% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.1% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 17 / 35 | 5627 |
| 2 | 1 | 66.8 | 79.7 | 15 / 35 | 5224 |
| 3 | 1 | 69.3 | 87.0 | 19 / 35 | 5533 |
| 4 | 2 | 68.1 | 84.4 | 14 / 35 | 5531 |
| 5 | 1 | 68.0 | 84.1 | 12 / 35 | 5805 |
| 6 | 1 | 65.5 | 73.7 | 15 / 35 | 5177 |
| 7 | 1 | 67.9 | 80.3 | 14 / 35 | 5438 |
| 8 | 1 | 68.2 | 82.5 | 13 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 75 | 41% |
| shu.nitro.LENIN .T34 | 47 | 60% |
| lrem.Spectre 0.4.4 | 41 | 71% |
| js.PinBall 1.6 | 18 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 74 | 46% | 109 |
| shu.nitro.LENIN .T34 | 29 | 18% | 55 |
| lrem.Spectre 0.4.4 | 22 | 14% | 44 |
| js.PinBall 1.6 | 12 | 7% | 29 |
| gh.mini.GrubbmOne 1.0 | 8 | 5% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 4% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 4% | 10 |
| sample.SpinBot 1.0 | 4 | 2% | 5 |

## Melee bench: F27

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 64.4 | 124 / 280 | 4.21 | 15.1% | 33965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 13.7% | 71 |
| kc.micro.Figment 1.0 | 2.1 | 15.1% | 124 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 11.4% | 20 |
| EH.Eagle 1.0.6 | 4.8 | 10.6% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.3% | 9 |
| joe.ADinosaur 1.0 | 6.8 | 9.0% | 2 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 8.6 | 7.0% | 2 |
| cs.Grudge 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.5 | 20 / 35 | 4307 |
| 2 | 2 | 60.9 | 55.9 | 12 / 35 | 4392 |
| 3 | 1 | 67.4 | 84.4 | 22 / 35 | 4548 |
| 4 | 3 | 55.6 | 44.4 | 8 / 35 | 3907 |
| 5 | 1 | 64.4 | 73.0 | 22 / 35 | 4221 |
| 6 | 4 | 56.9 | 45.7 | 6 / 35 | 4039 |
| 7 | 4 | 54.6 | 40.6 | 8 / 35 | 4079 |
| 8 | 1 | 68.3 | 87.3 | 26 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 44 | 70% |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 100% |
| wee.Gem 1.8.4 | 29 | 93% |
| EH.Eagle 1.0.6 | 25 | 96% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 39 | 25% | 70 |
| cs.Grudge 1.0 | 31 | 20% | 32 |
| joe.ADinosaur 1.0 | 18 | 11% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 10% | 20 |
| wee.Gem 1.8.4 | 14 | 9% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 8% | 42 |
| caimano.Furia_Ceca 0.22 | 12 | 8% | 16 |
| EH.Eagle 1.0.6 | 11 | 7% | 24 |
| throxbot.ThroxBot 0.1 | 5 | 3% | 12 |

## Melee bench: F28

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.1 | 167 / 280 | 2.34 | 18.1% | 34737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.1% | 167 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 43 |
| uji.Antique 1.0 | 3.6 | 11.5% | 29 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 10.8% | 26 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 6 |
| ahr.ice.Ice 1.0.2 | 5.8 | 8.8% | 7 |
| amk.ChumbaWumba 0.3 | 6.9 | 8.0% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.4% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.4 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.2 | 20 / 35 | 4176 |
| 2 | 1 | 67.1 | 82.5 | 24 / 35 | 4408 |
| 3 | 1 | 68.4 | 88.6 | 23 / 35 | 4341 |
| 4 | 1 | 67.9 | 86.0 | 20 / 35 | 4274 |
| 5 | 1 | 67.9 | 85.7 | 17 / 35 | 4703 |
| 6 | 1 | 66.4 | 83.5 | 19 / 35 | 4442 |
| 7 | 1 | 68.1 | 90.2 | 23 / 35 | 4183 |
| 8 | 1 | 66.4 | 81.3 | 21 / 35 | 4210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 113 | 83% |
| uji.Antique 1.0 | 45 | 91% |
| qohnil.blot.BlotBot 3.61 | 22 | 41% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 22% | 93 |
| uji.Antique 1.0 | 22 | 19% | 63 |
| qohnil.blot.BlotBot 3.61 | 22 | 19% | 39 |
| pfvicm.Sobieski 7.2.3b | 16 | 14% | 27 |
| amk.ChumbaWumba 0.3 | 11 | 9% | 21 |
| stelo.Lifestealer 1.0 | 7 | 6% | 8 |
| ahr.ice.Ice 1.0.2 | 5 | 4% | 15 |
| matt.advanced.Katana 1.0 | 3 | 3% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
3 death(s) with no robot to name.

## Melee bench: F29

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.6 | 87 / 280 | 3.10 | 16.7% | 36932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.4 | 16.4% | 109 |
| kc.micro.Figment 1.0 | 1.6 | 16.7% | 87 |
| deewiant.Anomaly 0.2 | 3.1 | 13.4% | 57 |
| myl.micro.Troodon 1.10 | 4.1 | 11.3% | 10 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 7.1% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.1% | 0 |
| ap.Frederick 1.1 | 8.9 | 5.6% | 2 |
| jangs.ns51 1.0 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 75.2 | 7 / 35 | 4748 |
| 2 | 2 | 64.5 | 74.0 | 10 / 35 | 4284 |
| 3 | 1 | 66.1 | 76.8 | 9 / 35 | 4654 |
| 4 | 1 | 68.2 | 84.1 | 16 / 35 | 4961 |
| 5 | 2 | 65.1 | 75.9 | 10 / 35 | 4348 |
| 6 | 2 | 65.8 | 74.3 | 13 / 35 | 4977 |
| 7 | 2 | 64.9 | 75.2 | 11 / 35 | 4333 |
| 8 | 1 | 66.0 | 77.5 | 11 / 35 | 4627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 65 | 20% |
| deewiant.Anomaly 0.2 | 54 | 44% |
| myl.micro.Troodon 1.10 | 24 | 96% |
| jok.PheonixM 0.1.2 | 13 | 92% |
| DBall.Anarchy 0.1 | 10 | 100% |
| ap.Frederick 1.1 | 4 | 75% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 194 of 280 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 86 | 44% | 100 |
| deewiant.Anomaly 0.2 | 65 | 34% | 96 |
| jok.PheonixM 0.1.2 | 12 | 6% | 24 |
| myl.micro.Troodon 1.10 | 11 | 6% | 27 |
| ph.melee.ArcherME 0.3 | 9 | 5% | 11 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 6 |
| DBall.Anarchy 0.1 | 3 | 2% | 12 |
| jangs.ns51 1.0 | 2 | 1% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 57.8 | 31 / 280 | 4.80 | 12.5% | 33189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.0% | 68 |
| darkcanuck.B26354 1.06 | 2.1 | 13.7% | 78 |
| kc.micro.Figment 1.0 | 3.3 | 12.5% | 31 |
| oog.melee.Capulet 1.2 | 3.8 | 12.4% | 44 |
| stelo.PastFuture 2.3.2 | 4.1 | 12.2% | 32 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.0% | 10 |
| ntc.Opposite 1.5 | 7.8 | 8.0% | 0 |
| tripphippy.Alice 1.1 | 7.9 | 7.9% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.5% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.9 | 51.1 | 3 / 35 | 3678 |
| 2 | 3 | 58.2 | 58.1 | 5 / 35 | 4319 |
| 3 | 3 | 58.6 | 59.0 | 4 / 35 | 4425 |
| 4 | 4 | 56.8 | 55.2 | 2 / 35 | 4122 |
| 5 | 4 | 56.5 | 54.0 | 3 / 35 | 4122 |
| 6 | 3 | 57.9 | 56.5 | 5 / 35 | 4460 |
| 7 | 2 | 60.5 | 66.0 | 3 / 35 | 4155 |
| 8 | 2 | 58.7 | 62.2 | 6 / 35 | 3908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 19 | 53% |
| darkcanuck.B26354 1.06 | 18 | 11% |
| stelo.PastFuture 2.3.2 | 16 | 50% |
| catcat20.Matcha 0.006 | 16 | 31% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 2 | 0% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 249 of 280 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 22% | 64 |
| darkcanuck.B26354 1.06 | 54 | 22% | 58 |
| catcat20.Matcha 0.006 | 52 | 21% | 58 |
| stelo.PastFuture 2.3.2 | 33 | 13% | 41 |
| tripphippy.Alice 1.1 | 20 | 8% | 21 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 4% | 13 |
| intruder.PrairieWolf 2.61 | 11 | 4% | 11 |
| ntc.Opposite 1.5 | 7 | 3% | 7 |
| GarmBox.Anger 1.0 | 7 | 3% | 7 |

## Melee bench: F31

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.1 | 45 / 280 | 3.51 | 14.5% | 30892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 156 |
| kc.micro.Figment 1.0 | 2.3 | 14.5% | 45 |
| gh.mini.Griezel 0.2 | 2.8 | 12.8% | 52 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.2% | 14 |
| d414.nano.Quantum 1.0.0 | 4.9 | 10.4% | 7 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.1% | 4 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.0% | 1 |
| fm.mammillarias 1.3 | 7.6 | 6.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 73.7 | 7 / 35 | 4119 |
| 2 | 3 | 60.4 | 68.6 | 4 / 35 | 3537 |
| 3 | 2 | 62.0 | 69.8 | 3 / 35 | 4329 |
| 4 | 3 | 59.2 | 63.5 | 3 / 35 | 3710 |
| 5 | 2 | 60.4 | 67.0 | 9 / 35 | 3440 |
| 6 | 2 | 61.5 | 73.7 | 4 / 35 | 3632 |
| 7 | 2 | 64.8 | 80.0 | 8 / 35 | 4099 |
| 8 | 2 | 64.6 | 80.3 | 7 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 66 | 15% |
| gh.mini.Griezel 0.2 | 32 | 13% |
| spinnercat.micro.Tyger 0.1 | 14 | 86% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| gh.nano.Grofvuil 0.2 | 6 | 83% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 125 | 53% | 134 |
| gh.mini.Griezel 0.2 | 46 | 19% | 52 |
| spinnercat.micro.Tyger 0.1 | 18 | 8% | 26 |
| d414.nano.Quantum 1.0.0 | 13 | 6% | 23 |
| gh.nano.Grofvuil 0.2 | 12 | 5% | 17 |
| timmit.nano.TimDog 0.33 | 11 | 5% | 15 |
| fm.mammillarias 1.3 | 7 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.7 | 130 / 280 | 2.65 | 17.5% | 39063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.5% | 130 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 87 |
| apc.botM 3.0 | 3.5 | 11.7% | 26 |
| vjik.UnViolation 1.1 | 4.1 | 11.0% | 15 |
| lxx.ConceptA 0.8 | 4.4 | 10.6% | 7 |
| bayen.UbaMicro 1.4 | 5.9 | 9.1% | 8 |
| panzer.Panzer 0.2 | 7.4 | 7.3% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 3 |
| conscience.Electron 1.3g | 9.0 | 6.1% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.2 | 15 / 35 | 4939 |
| 2 | 1 | 68.9 | 88.6 | 22 / 35 | 5251 |
| 3 | 1 | 65.7 | 80.0 | 16 / 35 | 4613 |
| 4 | 1 | 66.8 | 81.6 | 16 / 35 | 5146 |
| 5 | 1 | 65.1 | 77.1 | 16 / 35 | 4704 |
| 6 | 1 | 65.7 | 79.0 | 14 / 35 | 4895 |
| 7 | 1 | 67.8 | 84.8 | 21 / 35 | 4997 |
| 8 | 2 | 64.9 | 80.0 | 10 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 31% |
| apc.botM 3.0 | 44 | 77% |
| lxx.ConceptA 0.8 | 31 | 87% |
| vjik.UnViolation 1.1 | 23 | 83% |
| yk.JahMicro 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 8 | 88% |
| panzer.Panzer 0.2 | 5 | 80% |
| bayen.UbaMicro 1.4 | 4 | 75% |

Hadur died in 152 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 80 | 53% | 115 |
| lxx.ConceptA 0.8 | 18 | 12% | 30 |
| apc.botM 3.0 | 13 | 9% | 52 |
| bayen.UbaMicro 1.4 | 13 | 9% | 14 |
| vjik.UnViolation 1.1 | 9 | 6% | 33 |
| panzer.Panzer 0.2 | 9 | 6% | 12 |
| yk.JahMicro 1.0 | 5 | 3% | 12 |
| conscience.Electron 1.3g | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |

## Melee bench: F33

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.8 | 156 / 280 | 2.28 | 19.2% | 42437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.2% | 156 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.0% | 13 |
| labg.Cataclysm 2.05 | 4.3 | 11.2% | 29 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 19 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.3% | 0 |
| sanja.First 0.1 | 8.6 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.5 | 18 / 35 | 5238 |
| 2 | 1 | 68.7 | 84.4 | 18 / 35 | 5085 |
| 3 | 1 | 69.4 | 85.7 | 19 / 35 | 5338 |
| 4 | 1 | 66.7 | 77.8 | 18 / 35 | 4861 |
| 5 | 1 | 68.3 | 82.5 | 15 / 35 | 5196 |
| 6 | 1 | 70.6 | 88.9 | 21 / 35 | 5608 |
| 7 | 1 | 71.8 | 94.0 | 26 / 35 | 5455 |
| 8 | 1 | 70.6 | 89.2 | 21 / 35 | 5656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 77 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 94% |
| gre.svman4.Leonidas 1.3.2 | 33 | 76% |
| labg.Cataclysm 2.05 | 26 | 42% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 92% |
| baal.nano.N 1.42 | 6 | 67% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 128 of 280 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 55 | 43% | 111 |
| labg.Cataclysm 2.05 | 28 | 22% | 40 |
| gre.svman4.Leonidas 1.3.2 | 20 | 16% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 5% | 13 |
| baal.nano.N 1.42 | 5 | 4% | 7 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 3% | 62 |
| zyx.micro.Ant 1.1 | 4 | 3% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 3% | 4 |
| sanja.First 0.1 | 1 | 1% | 3 |

## Melee bench: F34

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 75.1 | 54 / 280 | 3.24 | 15.7% | 38011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 16.9% | 87 |
| stelo.Spread 0.9 | 2.1 | 16.2% | 102 |
| kc.micro.Figment 1.0 | 2.4 | 15.7% | 54 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 23 |
| tcf.Reach 3 | 4.6 | 10.8% | 9 |
| cli.Dancer 1.1 | 5.9 | 10.0% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 76.8 | 6 / 35 | 4552 |
| 2 | 1 | 66.3 | 79.7 | 9 / 35 | 4928 |
| 3 | 3 | 63.2 | 69.5 | 4 / 35 | 4536 |
| 4 | 2 | 65.3 | 76.5 | 7 / 35 | 4885 |
| 5 | 3 | 63.9 | 71.1 | 5 / 35 | 5065 |
| 6 | 2 | 65.3 | 76.2 | 5 / 35 | 4799 |
| 7 | 3 | 62.3 | 69.2 | 6 / 35 | 3956 |
| 8 | 2 | 67.7 | 81.6 | 12 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 24% |
| kid.Gladiator .7.2 | 53 | 40% |
| tcf.Reach 3 | 12 | 42% |
| jcs.Seth 1.8 | 11 | 64% |
| cli.Dancer 1.1 | 9 | 56% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 89 | 39% | 102 |
| stelo.Spread 0.9 | 75 | 33% | 88 |
| tcf.Reach 3 | 24 | 10% | 31 |
| jcs.Seth 1.8 | 16 | 7% | 26 |
| cli.Dancer 1.1 | 8 | 3% | 14 |
| ratosh.Wesco 1.4 | 6 | 3% | 9 |
| sample.RamFire 1.0 | 5 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 4 | 2% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.6 | 22 / 280 | 3.74 | 13.5% | 28085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 219 |
| kc.micro.Figment 1.0 | 2.5 | 13.5% | 22 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.7% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 11 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.9 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.0% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.7 | 3 / 35 | 3515 |
| 2 | 2 | 62.0 | 71.4 | 2 / 35 | 3787 |
| 3 | 2 | 60.5 | 70.5 | 0 / 35 | 3358 |
| 4 | 3 | 60.1 | 68.9 | 1 / 35 | 3385 |
| 5 | 4 | 59.9 | 63.5 | 4 / 35 | 3502 |
| 6 | 3 | 58.0 | 61.0 | 3 / 35 | 3275 |
| 7 | 2 | 61.9 | 74.6 | 2 / 35 | 3723 |
| 8 | 2 | 62.8 | 74.9 | 7 / 35 | 3540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 15% |
| gh.mini.Gruwel 0.9 | 12 | 8% |
| rz.HawkOnFire 0.1 | 8 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 67% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 259 of 280 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 144 | 56% | 152 |
| gh.mini.Gruwel 0.9 | 40 | 15% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 29 | 11% | 31 |
| rz.HawkOnFire 0.1 | 16 | 6% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 4% | 11 |
| stelo.MyAgileRobot 0.2 | 11 | 4% | 11 |
| wit.Chuliath 1.0 | 4 | 2% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.7 | 200 / 280 | 2.20 | 20.0% | 43446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 20.0% | 200 |
| alpha.RainingFire 1.0 | 2.8 | 12.1% | 28 |
| bzdp.Pansy 2.1 | 2.8 | 11.7% | 13 |
| bvh.micro.Freya 0.3 | 4.6 | 10.6% | 11 |
| mz.Cork 0.1 | 5.0 | 10.5% | 8 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.9% | 11 |
| bvh.mini.Fenrir 0.39 | 6.5 | 8.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.9 | 6.9% | 3 |
| dl.BetterWalls 1.0 | 9.1 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.4 | 26 / 35 | 5257 |
| 2 | 1 | 69.2 | 83.2 | 25 / 35 | 5281 |
| 3 | 1 | 70.7 | 90.2 | 25 / 35 | 5878 |
| 4 | 1 | 68.4 | 83.2 | 21 / 35 | 5191 |
| 5 | 1 | 71.1 | 92.1 | 28 / 35 | 5540 |
| 6 | 1 | 68.3 | 82.9 | 23 / 35 | 5229 |
| 7 | 1 | 69.8 | 86.3 | 25 / 35 | 5252 |
| 8 | 1 | 71.6 | 91.4 | 27 / 35 | 5818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| bvh.micro.Freya 0.3 | 47 | 94% |
| mz.Cork 0.1 | 29 | 97% |
| alpha.RainingFire 1.0 | 29 | 83% |
| bvh.mini.Fenrir 0.39 | 28 | 96% |
| m3thos.Eva02 0.7.1 | 17 | 88% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 81 of 280 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 26 | 32% | 58 |
| bvh.mini.Fenrir 0.39 | 11 | 14% | 30 |
| mz.Cork 0.1 | 9 | 11% | 47 |
| bvh.micro.Freya 0.3 | 8 | 10% | 33 |
| m3thos.Eva02 0.7.1 | 8 | 10% | 33 |
| bzdp.Pansy 2.1 | 7 | 9% | 47 |
| dl.BetterWalls 1.0 | 4 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 9 |

## Melee bench: F37

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.7 | 176 / 280 | 2.65 | 18.3% | 43702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.3% | 176 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.7% | 15 |
| germ.TheMind .2 | 3.1 | 10.5% | 18 |
| EBBU.Sim2 1.02 | 4.6 | 9.8% | 3 |
| agrach.Dalek 1.0 | 5.8 | 8.9% | 16 |
| stelo.UntouchableNano 1.3 | 5.9 | 8.9% | 17 |
| lmk.ACPFinal 0.1 | 7.0 | 8.5% | 8 |
| mb.Beast 0.1 | 7.8 | 8.3% | 12 |
| skm.Ryubot 1.0 | 8.0 | 8.3% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.9 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 76.8 | 21 / 35 | 5979 |
| 2 | 1 | 64.8 | 73.3 | 19 / 35 | 5332 |
| 3 | 1 | 66.5 | 80.6 | 22 / 35 | 5663 |
| 4 | 1 | 65.4 | 78.7 | 18 / 35 | 4919 |
| 5 | 1 | 67.8 | 85.1 | 25 / 35 | 5369 |
| 6 | 1 | 68.3 | 87.9 | 26 / 35 | 5511 |
| 7 | 1 | 67.8 | 86.0 | 23 / 35 | 5375 |
| 8 | 1 | 67.7 | 85.1 | 22 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 88% |
| stelo.UntouchableNano 1.3 | 32 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 90% |
| EBBU.Sim2 1.02 | 26 | 96% |
| skm.Ryubot 1.0 | 24 | 92% |
| mb.Beast 0.1 | 19 | 100% |
| agrach.Dalek 1.0 | 13 | 85% |
| lmk.ACPFinal 0.1 | 9 | 89% |

Hadur died in 106 of 280 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 22 | 21% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 18% | 22 |
| germ.TheMind .2 | 16 | 15% | 40 |
| lmk.ACPFinal 0.1 | 14 | 13% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 12% | 48 |
| EBBU.Sim2 1.02 | 6 | 6% | 32 |
| mb.Beast 0.1 | 6 | 6% | 31 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 22 |
| skm.Ryubot 1.0 | 5 | 5% | 9 |

## Melee bench: F38

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.7 | 80 / 280 | 3.09 | 16.1% | 36793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 17.0% | 127 |
| kc.micro.Figment 1.0 | 1.8 | 16.1% | 80 |
| bvh.mini.Freya 0.55 | 3.1 | 12.8% | 22 |
| cs.Wren 1.0 | 4.6 | 10.5% | 18 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.5% | 23 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.3% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.4 | 9.0% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.2% | 2 |
| matt.UnderDark3 2.4.34 | 8.9 | 4.7% | 0 |
| bzdp.BoxCar 2.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 77.1 | 8 / 35 | 4538 |
| 2 | 2 | 64.9 | 79.7 | 7 / 35 | 4581 |
| 3 | 1 | 67.9 | 84.1 | 16 / 35 | 5009 |
| 4 | 2 | 64.3 | 76.2 | 9 / 35 | 4553 |
| 5 | 2 | 63.6 | 72.7 | 5 / 35 | 4927 |
| 6 | 1 | 65.4 | 79.0 | 14 / 35 | 4488 |
| 7 | 2 | 63.5 | 71.4 | 9 / 35 | 4362 |
| 8 | 2 | 63.7 | 73.7 | 12 / 35 | 4335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 69 | 17% |
| bvh.mini.Freya 0.55 | 23 | 83% |
| bts.mega.Gnarly 1.4 | 19 | 42% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 94% |
| cs.Wren 1.0 | 15 | 87% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 200 of 280 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 106 | 53% | 123 |
| bvh.mini.Freya 0.55 | 28 | 14% | 40 |
| bts.mega.Gnarly 1.4 | 24 | 12% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 7% | 27 |
| cs.Wren 1.0 | 13 | 7% | 23 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 3% | 11 |
| kdf.KoulDestroyer 1.0 | 5 | 3% | 9 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 4 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.5 | 92 / 280 | 3.20 | 16.5% | 41026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.5% | 92 |
| bvh.fry.Freya 0.82 | 2.1 | 15.1% | 40 |
| az.Ololobot 0.2.4 | 2.9 | 13.0% | 85 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 45 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 7 |
| gimp.GimpBot 0.1 | 6.4 | 8.4% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 8.0% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.4% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 72.7 | 8 / 35 | 4765 |
| 2 | 1 | 64.8 | 73.0 | 10 / 35 | 5580 |
| 3 | 1 | 64.4 | 72.4 | 15 / 35 | 4917 |
| 4 | 1 | 66.1 | 79.4 | 13 / 35 | 5272 |
| 5 | 1 | 65.5 | 74.6 | 12 / 35 | 5515 |
| 6 | 1 | 64.9 | 78.4 | 10 / 35 | 4830 |
| 7 | 1 | 66.4 | 79.0 | 15 / 35 | 5191 |
| 8 | 1 | 64.0 | 74.6 | 9 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 57 | 26% |
| bvh.fry.Freya 0.82 | 51 | 71% |
| catcat20.Lambda 0.024 | 29 | 45% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| gimp.GimpBot 0.1 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 189 of 280 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 68 | 36% | 86 |
| catcat20.Lambda 0.024 | 39 | 21% | 52 |
| bvh.fry.Freya 0.82 | 37 | 20% | 69 |
| apollokidd.ApolloKidd 0.9 | 16 | 8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 8% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 10 |
| gimp.GimpBot 0.1 | 1 | 1% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.4 | 148 / 280 | 2.58 | 18.2% | 38271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.2% | 148 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 72 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.7% | 13 |
| Polkwane.SmashMelee 1.0 | 4.4 | 10.6% | 14 |
| mz.AntiGrav 1.0 | 4.5 | 10.8% | 9 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 6 |
| stelo.Randomness 1.0 | 6.4 | 8.9% | 13 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.4% | 2 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 2 |
| sample.Corners 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 76.5 | 12 / 35 | 4479 |
| 2 | 1 | 69.5 | 89.2 | 23 / 35 | 4876 |
| 3 | 1 | 68.9 | 84.4 | 22 / 35 | 4896 |
| 4 | 1 | 65.3 | 76.2 | 14 / 35 | 4295 |
| 5 | 1 | 67.7 | 80.0 | 18 / 35 | 4952 |
| 6 | 1 | 68.3 | 84.1 | 20 / 35 | 4797 |
| 7 | 1 | 67.1 | 80.3 | 17 / 35 | 4953 |
| 8 | 1 | 69.7 | 88.6 | 22 / 35 | 5023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 86 | 51% |
| kano.gamma.KanoGamma 1.8 | 35 | 91% |
| mz.AntiGrav 1.0 | 29 | 100% |
| stelo.Randomness 1.0 | 21 | 86% |
| Polkwane.SmashMelee 1.0 | 18 | 83% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 67% |

Hadur died in 132 of 280 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 45% | 93 |
| mz.AntiGrav 1.0 | 13 | 10% | 36 |
| stelo.Randomness 1.0 | 13 | 10% | 30 |
| kano.gamma.KanoGamma 1.8 | 12 | 9% | 46 |
| amk.superstrike.SuperStrike 0.3 | 11 | 8% | 18 |
| alpha.BlackIce 1.0 | 11 | 8% | 16 |
| Polkwane.SmashMelee 1.0 | 9 | 7% | 22 |
| sample.Corners 1.0 | 3 | 2% | 10 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |

## Melee bench: F41

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.1 | 104 / 280 | 3.24 | 16.0% | 34944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 16.0% | 104 |
| eem.EvBotNG v12.8 | 1.5 | 16.1% | 110 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.0% | 28 |
| ary.Swarm 1.1 | 3.6 | 12.6% | 20 |
| shrub.Silver v048 | 5.5 | 9.6% | 4 |
| simonton.nano.MeleeSeed 1.8 | 5.6 | 9.9% | 10 |
| zyx.nano.Ant 1.1 | 7.0 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.1% | 4 |
| stelo.Mirror 1.1 | 8.5 | 5.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 15 / 35 | 4500 |
| 2 | 2 | 65.4 | 76.5 | 13 / 35 | 4543 |
| 3 | 2 | 63.5 | 71.4 | 8 / 35 | 4349 |
| 4 | 1 | 63.6 | 71.1 | 15 / 35 | 4154 |
| 5 | 2 | 63.6 | 71.4 | 11 / 35 | 4239 |
| 6 | 1 | 65.4 | 76.8 | 15 / 35 | 4366 |
| 7 | 2 | 64.6 | 73.3 | 12 / 35 | 4562 |
| 8 | 1 | 66.1 | 80.6 | 15 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 31% |
| lessonz.robocode.Oz 0.5.0 | 40 | 75% |
| simonton.nano.MeleeSeed 1.8 | 27 | 100% |
| ary.Swarm 1.1 | 25 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| shrub.Silver v048 | 3 | 33% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 178 of 280 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 78 | 44% | 104 |
| lessonz.robocode.Oz 0.5.0 | 28 | 16% | 49 |
| ary.Swarm 1.1 | 25 | 14% | 46 |
| simonton.nano.MeleeSeed 1.8 | 17 | 10% | 40 |
| acogdev.alpha 0.2 | 8 | 4% | 8 |
| zyx.nano.Ant 1.1 | 7 | 4% | 10 |
| shrub.Silver v048 | 6 | 3% | 8 |
| stelo.Mirror 1.1 | 5 | 3% | 7 |
| jsal.Jsalbot 1.0 | 4 | 2% | 7 |

## Melee bench: F42

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.3 | 53 / 280 | 3.22 | 16.1% | 41903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.7% | 146 |
| kc.micro.Figment 1.0 | 1.9 | 16.1% | 53 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 36 |
| ara.Shera 0.88 | 3.8 | 12.1% | 33 |
| amz.NanoClone 1.41 | 5.1 | 8.7% | 1 |
| maribo.IotaCT 1.1 | 6.8 | 7.6% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.4% | 10 |
| stelo.MirrorMicro 1.0 | 7.3 | 7.0% | 2 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 73.7 | 9 / 35 | 4711 |
| 2 | 2 | 64.7 | 75.6 | 7 / 35 | 5233 |
| 3 | 2 | 65.5 | 77.1 | 7 / 35 | 5517 |
| 4 | 2 | 65.4 | 76.5 | 7 / 35 | 5286 |
| 5 | 1 | 66.3 | 79.0 | 10 / 35 | 5816 |
| 6 | 2 | 64.4 | 74.9 | 4 / 35 | 5185 |
| 7 | 2 | 65.8 | 76.8 | 4 / 35 | 5588 |
| 8 | 2 | 62.2 | 68.9 | 5 / 35 | 4567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 76 | 21% |
| maribo.mini.MiniQuester 0.1 | 31 | 55% |
| ara.Shera 0.88 | 25 | 60% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 128 | 56% | 144 |
| ara.Shera 0.88 | 36 | 16% | 44 |
| maribo.mini.MiniQuester 0.1 | 27 | 12% | 47 |
| amz.NanoClone 1.41 | 16 | 7% | 17 |
| dsw.StaticD 1.0 | 10 | 4% | 12 |
| maribo.IotaCT 1.1 | 4 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 69.6 | 22 / 280 | 3.74 | 13.8% | 30464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 223 |
| kc.micro.Figment 1.0 | 2.1 | 13.8% | 22 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.3% | 24 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.1% | 3 |
| jab.DiamondStealer 5 | 7.3 | 7.8% | 1 |
| mz.NanoGod 2.02 | 7.8 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 70.2 | 3 / 35 | 3807 |
| 2 | 2 | 63.2 | 72.4 | 4 / 35 | 3741 |
| 3 | 2 | 61.6 | 66.0 | 3 / 35 | 3863 |
| 4 | 2 | 62.8 | 72.1 | 3 / 35 | 3904 |
| 5 | 3 | 60.3 | 62.5 | 1 / 35 | 3475 |
| 6 | 2 | 62.9 | 72.4 | 2 / 35 | 3907 |
| 7 | 2 | 61.5 | 66.3 | 2 / 35 | 3753 |
| 8 | 2 | 64.1 | 74.6 | 4 / 35 | 4014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 2% |
| brainfade.melee.Dusk 0.44 | 18 | 61% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| jab.DiamondStealer 5 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 259 of 280 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 165 | 64% | 170 |
| brainfade.melee.Dusk 0.44 | 29 | 11% | 38 |
| dummy.micro.Sparrow 2.5 | 20 | 8% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 7% | 19 |
| mz.NanoGod 2.02 | 9 | 3% | 10 |
| Krabb.akim2.Akim2 1.1b | 8 | 3% | 9 |
| jab.DiamondStealer 5 | 7 | 3% | 7 |
| cvt.Firsty 1.0 | 4 | 2% | 5 |

## Melee bench: F44

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.7 | 124 / 280 | 2.55 | 18.4% | 44372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.4% | 124 |
| stelo.Liblix 0.3.1 | 2.0 | 15.4% | 103 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.4% | 32 |
| wompi.Quokka 1.6 | 4.5 | 10.3% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.1% | 3 |
| jwirde.Gort 2.0 | 5.5 | 9.3% | 5 |
| disan.Chair 2.2.0 | 7.1 | 8.1% | 5 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.4% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 20 / 35 | 5903 |
| 2 | 1 | 69.6 | 87.3 | 17 / 35 | 5690 |
| 3 | 1 | 66.3 | 78.4 | 11 / 35 | 5519 |
| 4 | 1 | 68.1 | 83.2 | 15 / 35 | 5442 |
| 5 | 2 | 67.2 | 82.2 | 10 / 35 | 5430 |
| 6 | 1 | 67.2 | 78.7 | 17 / 35 | 5333 |
| 7 | 1 | 69.4 | 87.9 | 17 / 35 | 5875 |
| 8 | 1 | 66.9 | 78.1 | 17 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 101 | 37% |
| tzu.TheArtOfWar 1.2 | 69 | 80% |
| wompi.Quokka 1.6 | 14 | 71% |
| disan.Chair 2.2.0 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| jwirde.Gort 2.0 | 5 | 60% |
| stf.PanzerGeneral 0.1 | 2 | 50% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 53% | 120 |
| tzu.TheArtOfWar 1.2 | 30 | 19% | 77 |
| wompi.Quokka 1.6 | 12 | 8% | 24 |
| jwirde.Gort 2.0 | 8 | 5% | 16 |
| disan.Chair 2.2.0 | 8 | 5% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 5% | 11 |
| stf.PanzerGeneral 0.1 | 7 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.4 | 126 / 280 | 2.14 | 19.8% | 47130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.8% | 126 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 12.6% | 136 |
| jje.BagPuss 1.2 | 3.1 | 11.4% | 5 |
| sul.Lunar 1.1 | 4.5 | 9.9% | 6 |
| myl.nano.Graviton 1.10 | 4.8 | 10.0% | 0 |
| hvilela.HVilela 0.9 | 6.4 | 8.9% | 0 |
| fm.claire 1.7 | 6.9 | 8.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 7.8% | 4 |
| wit.Deep7 2.0 | 8.9 | 6.3% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 18 / 35 | 6650 |
| 2 | 1 | 67.5 | 82.2 | 11 / 35 | 5555 |
| 3 | 1 | 69.9 | 88.3 | 18 / 35 | 5878 |
| 4 | 1 | 70.0 | 87.3 | 17 / 35 | 6172 |
| 5 | 1 | 69.3 | 88.3 | 19 / 35 | 5434 |
| 6 | 1 | 68.9 | 85.4 | 17 / 35 | 5533 |
| 7 | 1 | 70.2 | 88.3 | 17 / 35 | 6299 |
| 8 | 1 | 68.1 | 87.3 | 9 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 146 | 29% |
| sul.Lunar 1.1 | 22 | 95% |
| myl.nano.Graviton 1.10 | 21 | 100% |
| jje.BagPuss 1.2 | 21 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| wit.Deep7 2.0 | 8 | 88% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 154 of 280 rounds, at a mean tick of 2197. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 112 | 73% | 0 |
| jje.BagPuss 1.2 | 14 | 9% | 80 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 25 |
| hvilela.HVilela 0.9 | 7 | 5% | 21 |
| sul.Lunar 1.1 | 6 | 4% | 63 |
| myl.nano.Graviton 1.10 | 5 | 3% | 51 |
| fm.claire 1.7 | 2 | 1% | 13 |
| wit.Deep7 2.0 | 1 | 1% | 12 |
| abud.ThirdRobo 1.0 | 0 | 0% | 10 |

## Melee bench: F46

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 69.9 | 26 / 280 | 3.71 | 14.4% | 35833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.6% | 108 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 116 |
| kc.micro.Figment 1.0 | 3.0 | 14.4% | 26 |
| cx.Princess 1.0 | 4.1 | 10.8% | 21 |
| mz.MicroSheep 1.0 | 4.9 | 10.3% | 8 |
| sadoner.killer 0.2 | 6.0 | 8.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.6 | 6.5% | 1 |
| kurios.DOSexe .9a | 8.9 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 72.7 | 4 / 35 | 4370 |
| 2 | 3 | 62.3 | 67.3 | 3 / 35 | 4611 |
| 3 | 3 | 61.2 | 66.7 | 3 / 35 | 4189 |
| 4 | 3 | 62.1 | 67.9 | 3 / 35 | 4751 |
| 5 | 3 | 63.5 | 74.0 | 3 / 35 | 4638 |
| 6 | 3 | 62.6 | 70.2 | 5 / 35 | 4278 |
| 7 | 3 | 61.9 | 68.9 | 1 / 35 | 4519 |
| 8 | 3 | 62.8 | 71.4 | 4 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 39 | 23% |
| rsalesc.melee.Medina 0.4.5 | 32 | 19% |
| cx.Princess 1.0 | 6 | 50% |
| mz.MicroSheep 1.0 | 4 | 75% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 254 of 280 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 103 | 41% | 115 |
| rsalesc.melee.Medina 0.4.5 | 85 | 33% | 91 |
| cx.Princess 1.0 | 31 | 12% | 31 |
| sadoner.killer 0.2 | 16 | 6% | 18 |
| mz.MicroSheep 1.0 | 8 | 3% | 12 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 4 |
| arthord.NanoSatanMelee Beta | 3 | 1% | 4 |

