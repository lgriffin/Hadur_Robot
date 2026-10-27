# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 808 over 8 battles (101.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.3 | 66 / 280 | 2.23 | 16.8% | 36874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 187 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.8% | 66 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 10.9% | 4 |
| sgp.JollyNinja 3.53 | 3.9 | 11.3% | 15 |
| mz.MicroGodMelee 1 | 4.9 | 10.2% | 2 |
| lorneswork.Predator 1.0 | 5.4 | 9.6% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 87.9 | 6 / 35 | 5076 |
| 2 | 2 | 67.0 | 87.3 | 8 / 35 | 4785 |
| 3 | 2 | 66.2 | 86.3 | 7 / 35 | 4604 |
| 4 | 2 | 66.3 | 84.1 | 12 / 35 | 4665 |
| 5 | 2 | 64.8 | 84.1 | 5 / 35 | 4044 |
| 6 | 2 | 66.8 | 86.7 | 9 / 35 | 4745 |
| 7 | 2 | 67.5 | 89.8 | 12 / 35 | 4735 |
| 8 | 2 | 65.0 | 84.1 | 7 / 35 | 4220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 168 | 10% |
| sgp.JollyNinja 3.53 | 22 | 77% |
| mz.MicroGodMelee 1 | 20 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| lorneswork.Predator 1.0 | 7 | 71% |
| adt.Ar2 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 221 of 280 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 165 | 75% | 181 |
| sgp.JollyNinja 3.53 | 15 | 7% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 7% | 25 |
| mz.MicroGodMelee 1 | 9 | 4% | 29 |
| lorneswork.Predator 1.0 | 8 | 4% | 12 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 194056 melee ticks, 119394 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 106 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 63358 sent, 57357 reached their opponent, 12943 virtual hits (22.6% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 639 over 8 battles (79.9 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.4 | 122 / 280 | 2.41 | 17.5% | 34929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.5% | 122 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.1% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.3% | 20 |
| Noran.BitchingElk 0.054 | 6.4 | 8.8% | 26 |
| sch.Simone 0.3d | 7.1 | 7.7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.5% | 2 |
| stelo.PatternRobot 1.0 | 9.1 | 5.3% | 2 |
| fullsail.SweetTea 1.1 | 9.9 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 80.3 | 12 / 35 | 4271 |
| 2 | 1 | 67.8 | 87.6 | 18 / 35 | 4313 |
| 3 | 1 | 67.1 | 83.8 | 17 / 35 | 4760 |
| 4 | 1 | 65.0 | 79.0 | 14 / 35 | 4046 |
| 5 | 1 | 66.8 | 85.4 | 14 / 35 | 4380 |
| 6 | 1 | 66.7 | 84.4 | 15 / 35 | 4491 |
| 7 | 1 | 66.4 | 85.4 | 12 / 35 | 4205 |
| 8 | 1 | 68.5 | 88.9 | 20 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 67 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 74% |
| com.cohesiva.robocode.ManOwaR 1.0 | 26 | 62% |
| Noran.BitchingElk 0.054 | 18 | 28% |
| sch.Simone 0.3d | 15 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| fnc.bandit.Bandit 5.2.0 | 6 | 83% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 26% | 76 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 20% | 73 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 13% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 10% | 25 |
| sch.Simone 0.3d | 16 | 10% | 28 |
| Noran.BitchingElk 0.054 | 16 | 10% | 13 |
| stelo.PatternRobot 1.0 | 8 | 5% | 9 |
| fnc.bandit.Bandit 5.2.0 | 5 | 3% | 12 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 232014 melee ticks, 52828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 66 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 82763 sent, 76880 reached their opponent, 14338 virtual hits (18.6% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 8 battles (53.4 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.0 | 212 / 280 | 1.72 | 19.8% | 45504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 212 |
| radnor.DoctorBob 1.42 | 2.4 | 13.6% | 28 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 16 |
| vuen.Cake 2.51 | 3.6 | 12.6% | 20 |
| urdos.URDOS 1.3 | 5.1 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.6% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 29 / 35 | 6004 |
| 2 | 1 | 69.6 | 89.8 | 26 / 35 | 5657 |
| 3 | 1 | 70.9 | 94.9 | 29 / 35 | 5978 |
| 4 | 1 | 69.3 | 91.7 | 23 / 35 | 5616 |
| 5 | 1 | 71.0 | 96.8 | 29 / 35 | 5866 |
| 6 | 1 | 69.8 | 92.4 | 28 / 35 | 5387 |
| 7 | 1 | 68.6 | 88.9 | 24 / 35 | 5309 |
| 8 | 1 | 69.4 | 90.8 | 24 / 35 | 5687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 81 | 91% |
| radnor.DoctorBob 1.42 | 65 | 95% |
| kawigi.nano.Lib 1.0 | 64 | 94% |
| urdos.URDOS 1.3 | 7 | 86% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 71 of 280 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 39% | 90 |
| kawigi.nano.Lib 1.0 | 12 | 17% | 61 |
| vuen.Cake 2.51 | 10 | 14% | 78 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 11% | 9 |
| urdos.URDOS 1.3 | 4 | 6% | 12 |
| adt.Ar1 2.1 | 2 | 3% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 177768 melee ticks, 56263 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 47 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 55294 sent, 49365 reached their opponent, 14074 virtual hits (28.5% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 8 battles (91.1 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.3 | 33 / 280 | 2.32 | 16.9% | 39963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.6% | 221 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.9% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 10 |
| josago.Jorgito 0.16 | 5.1 | 9.0% | 2 |
| css.Delitioner 0.11 | 6.3 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 3.9% | 0 |
| spin.Bugstard 0.012b | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 84.1 | 10 / 35 | 4958 |
| 2 | 2 | 66.7 | 85.1 | 4 / 35 | 4880 |
| 3 | 2 | 67.7 | 87.3 | 3 / 35 | 5089 |
| 4 | 2 | 68.0 | 85.1 | 4 / 35 | 5396 |
| 5 | 2 | 67.5 | 86.3 | 5 / 35 | 5046 |
| 6 | 2 | 66.1 | 83.5 | 4 / 35 | 4445 |
| 7 | 2 | 67.1 | 87.0 | 2 / 35 | 5077 |
| 8 | 2 | 66.9 | 84.1 | 1 / 35 | 5072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 175 | 9% |
| apc.LeeroyJenkins2 1.0 | 18 | 39% |
| TNT.TNT 0.99.1 | 17 | 53% |
| josago.Jorgito 0.16 | 3 | 67% |

Hadur died in 253 of 280 rounds, at a mean tick of 1344. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 173 | 68% | 188 |
| apc.LeeroyJenkins2 1.0 | 38 | 15% | 46 |
| TNT.TNT 0.99.1 | 18 | 7% | 26 |
| josago.Jorgito 0.16 | 9 | 4% | 10 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 273842 melee ticks, 94579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 95 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 85016 sent, 78938 reached their opponent, 12994 virtual hits (16.5% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 682 over 8 battles (85.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.3 | 29 / 280 | 3.23 | 13.9% | 25673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.7% | 148 |
| justin.DemonicRage 3.4 | 1.9 | 16.9% | 73 |
| hadur2.Hadur 3.17.1aa | 3.0 | 13.9% | 29 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 20 |
| axeBots.HataMoto 3.09 | 5.4 | 9.4% | 9 |
| ms.Ares 0.19 | 5.6 | 9.3% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.4 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.6 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 77.8 | 6 / 35 | 3240 |
| 2 | 3 | 62.8 | 77.1 | 4 / 35 | 3257 |
| 3 | 3 | 62.5 | 76.8 | 4 / 35 | 3300 |
| 4 | 3 | 61.3 | 74.0 | 3 / 35 | 3044 |
| 5 | 3 | 62.4 | 75.9 | 4 / 35 | 3253 |
| 6 | 3 | 61.9 | 75.9 | 4 / 35 | 3139 |
| 7 | 3 | 60.9 | 73.3 | 0 / 35 | 3024 |
| 8 | 3 | 61.0 | 71.4 | 4 / 35 | 3416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 48 | 10% |
| justin.DemonicRage 3.4 | 46 | 33% |
| wompi.Numbat 2.1 | 8 | 25% |
| axeBots.HataMoto 3.09 | 5 | 40% |
| ms.Ares 0.19 | 3 | 100% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |

Hadur died in 256 of 280 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 90 | 35% | 95 |
| justin.DemonicRage 3.4 | 87 | 34% | 100 |
| wompi.Numbat 2.1 | 40 | 16% | 44 |
| axeBots.HataMoto 3.09 | 13 | 5% | 16 |
| ms.Ares 0.19 | 9 | 4% | 11 |
| supersample.SuperBoxBot 1.0 | 8 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 208020 melee ticks, 42154 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 57 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 65964 sent, 59657 reached their opponent, 10793 virtual hits (18.1% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 661 over 8 battles (82.6 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.4 | 173 / 280 | 2.04 | 18.8% | 38064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.8% | 173 |
| jekl.StoneGhost 0.7 | 2.5 | 14.2% | 22 |
| origin.SleepSiphon 1.7b | 2.8 | 13.8% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 27 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.3 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.1% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 6.3% | 2 |
| DBall.NUKE 0.1 | 8.5 | 5.9% | 2 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 24 / 35 | 5380 |
| 2 | 1 | 65.3 | 80.6 | 17 / 35 | 3994 |
| 3 | 1 | 68.6 | 87.6 | 20 / 35 | 4495 |
| 4 | 1 | 70.0 | 90.8 | 24 / 35 | 5007 |
| 5 | 1 | 69.8 | 91.7 | 24 / 35 | 4965 |
| 6 | 1 | 70.5 | 94.3 | 27 / 35 | 4881 |
| 7 | 1 | 67.4 | 84.1 | 17 / 35 | 4710 |
| 8 | 1 | 67.6 | 85.4 | 20 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 89% |
| origin.SleepSiphon 1.7b | 64 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 45 | 73% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 70% |
| gg.Wolverine 2.0 | 10 | 100% |
| mld.Wisdom 1.0 | 8 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 32% | 98 |
| jekl.StoneGhost 0.7 | 35 | 31% | 78 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 19% | 54 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 16 |
| mld.Wisdom 1.0 | 4 | 4% | 15 |
| spinnercat.Omen 1.0 | 3 | 3% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| gg.Wolverine 2.0 | 0 | 0% | 9 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 201055 melee ticks, 59735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 64226 sent, 58269 reached their opponent, 14669 virtual hits (25.2% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 970 over 8 battles (121.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.9 | 147 / 280 | 1.64 | 19.8% | 44871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 147 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 62 |
| rtk.Tachikoma 1.0 | 2.8 | 16.4% | 37 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 11.1% | 7 |
| franzor.Lizt 1.3.1 | 4.6 | 11.1% | 28 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.6 | 23 / 35 | 6021 |
| 2 | 1 | 71.9 | 93.7 | 18 / 35 | 5836 |
| 3 | 1 | 70.9 | 90.2 | 17 / 35 | 5604 |
| 4 | 1 | 70.1 | 91.4 | 19 / 35 | 5033 |
| 5 | 1 | 70.9 | 93.0 | 16 / 35 | 5719 |
| 6 | 1 | 71.0 | 92.7 | 18 / 35 | 5440 |
| 7 | 1 | 72.0 | 93.7 | 19 / 35 | 5960 |
| 8 | 1 | 70.8 | 93.7 | 17 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 77% |
| rsalesc.melee.Monk 0.3.6c | 64 | 20% |
| franzor.Lizt 1.3.1 | 36 | 44% |
| oog.melee.CapuletDroid 1.1 | 29 | 86% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 1623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 57 | 40% | 89 |
| rtk.Tachikoma 1.0 | 47 | 33% | 142 |
| franzor.Lizt 1.3.1 | 21 | 15% | 5 |
| oog.melee.CapuletDroid 1.1 | 7 | 5% | 34 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 5 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 274654 melee ticks, 128308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 698 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 372 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 81699 sent, 75665 reached their opponent, 16479 virtual hits (21.8% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 793 over 8 battles (99.1 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.4 | 168 / 280 | 1.95 | 18.9% | 36813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.9% | 168 |
| tm.Yuugao 1.0 | 2.4 | 13.4% | 44 |
| shrub.Vapour v159 | 2.6 | 12.7% | 32 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.9% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.4% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.1% | 8 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.9% | 1 |
| SHAM.WOW 1.4 | 9.5 | 5.4% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.6 | 18 / 35 | 4370 |
| 2 | 1 | 68.8 | 91.1 | 20 / 35 | 4650 |
| 3 | 1 | 70.0 | 93.3 | 25 / 35 | 4926 |
| 4 | 1 | 68.8 | 91.7 | 21 / 35 | 4553 |
| 5 | 1 | 69.7 | 93.7 | 24 / 35 | 4928 |
| 6 | 1 | 69.4 | 90.8 | 24 / 35 | 4991 |
| 7 | 1 | 66.1 | 86.7 | 15 / 35 | 3780 |
| 8 | 1 | 67.8 | 86.3 | 21 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 61 | 70% |
| shrub.Vapour v159 | 51 | 67% |
| Krabb.sliNk.Garm 0.9u | 45 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 87% |
| m3thos.Eva00 1.1 | 15 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 119 of 280 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 34 | 29% | 69 |
| tm.Yuugao 1.0 | 33 | 28% | 85 |
| Krabb.sliNk.Garm 0.9u | 15 | 13% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 13% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 19 |
| m3thos.Eva00 1.1 | 4 | 3% | 15 |
| SHAM.WOW 1.4 | 4 | 3% | 12 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 205217 melee ticks, 57832 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 67 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 68407 sent, 62234 reached their opponent, 12831 virtual hits (20.6% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1012 over 8 battles (126.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.3 | 69 / 280 | 3.13 | 14.8% | 25154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 132 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.8% | 69 |
| kc.micro.Figment 1.0 | 2.8 | 13.7% | 36 |
| yagami.Tidus 0.11 | 4.3 | 11.0% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.2% | 13 |
| mc2.enemy.Original 0.9 | 6.0 | 9.2% | 22 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 4 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.4 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.6 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 81.6 | 12 / 35 | 3339 |
| 2 | 3 | 59.9 | 70.5 | 6 / 35 | 2872 |
| 3 | 2 | 61.0 | 72.4 | 7 / 35 | 2953 |
| 4 | 2 | 61.9 | 74.0 | 6 / 35 | 3405 |
| 5 | 2 | 63.9 | 81.6 | 12 / 35 | 3030 |
| 6 | 3 | 62.5 | 76.2 | 7 / 35 | 3048 |
| 7 | 2 | 63.1 | 77.1 | 9 / 35 | 3237 |
| 8 | 2 | 63.1 | 77.1 | 10 / 35 | 3270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 68 | 26% |
| kc.micro.Figment 1.0 | 36 | 86% |
| mc2.enemy.Original 0.9 | 17 | 29% |
| pedersen.Grishnakh 1.0 | 8 | 75% |
| yagami.Tidus 0.11 | 7 | 86% |
| dft.Calliope 5.6 | 4 | 50% |
| rdm.Dueler 0.4x | 2 | 50% |

Hadur died in 219 of 280 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 37% | 102 |
| kc.micro.Figment 1.0 | 36 | 16% | 67 |
| mc2.enemy.Original 0.9 | 34 | 16% | 40 |
| yagami.Tidus 0.11 | 30 | 14% | 36 |
| pedersen.Grishnakh 1.0 | 18 | 8% | 21 |
| dft.Calliope 5.6 | 6 | 3% | 8 |
| step.nanoPri 1.0 | 3 | 1% | 3 |
| rdm.Dueler 0.4x | 3 | 1% | 2 |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 201969 melee ticks, 45171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 38 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 66650 sent, 60706 reached their opponent, 9220 virtual hits (15.2% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 8 battles (69.1 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.8 | 217 / 280 | 1.47 | 20.3% | 42526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.3% | 217 |
| DTF.Kludgy 1.2b | 2.4 | 14.3% | 30 |
| ne.Chimera 1.2 | 2.9 | 13.0% | 7 |
| ejb.Polaris 1.0.1 | 3.9 | 12.3% | 13 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.0% | 2 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 10 |
| kurios.DOSexe .9b | 7.1 | 6.0% | 1 |
| sam.Samspin 1.0 | 8.4 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 98.1 | 32 / 35 | 5612 |
| 2 | 1 | 71.5 | 97.8 | 30 / 35 | 5244 |
| 3 | 1 | 71.8 | 96.2 | 30 / 35 | 5544 |
| 4 | 1 | 70.4 | 94.6 | 25 / 35 | 5206 |
| 5 | 1 | 70.1 | 92.7 | 27 / 35 | 5122 |
| 6 | 1 | 70.0 | 93.3 | 24 / 35 | 5249 |
| 7 | 1 | 70.7 | 96.2 | 26 / 35 | 5203 |
| 8 | 1 | 69.5 | 89.5 | 23 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 85 | 82% |
| ejb.Polaris 1.0.1 | 61 | 85% |
| ne.Chimera 1.2 | 55 | 91% |
| vStar.RAFzilla 2.15 | 21 | 71% |
| tvv.micro.Antares 1.1.1 | 19 | 100% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 67 of 280 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 25 | 37% | 90 |
| ejb.Polaris 1.0.1 | 15 | 22% | 75 |
| ne.Chimera 1.2 | 12 | 18% | 55 |
| vStar.RAFzilla 2.15 | 7 | 10% | 21 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 23 |
| kurios.DOSexe .9b | 1 | 1% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 195917 melee ticks, 79397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 402 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 359 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 65105 sent, 59372 reached their opponent, 12748 virtual hits (21.5% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 244 over 8 battles (30.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.8 | 102 / 280 | 2.82 | 15.9% | 28123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.4 | 16.5% | 96 |
| hadur2.Hadur 3.17.1aa | 1.6 | 15.9% | 102 |
| cx.mini.Nimrod 0.55 | 3.4 | 12.0% | 25 |
| djc.DynaBot 0.1.1 | 3.8 | 11.0% | 15 |
| rdt199.Warlord 0.73 | 5.4 | 9.7% | 21 |
| br2.MobyDickBot 1.6 | 6.3 | 8.7% | 13 |
| uji.YellohFellah 1.0 | 6.4 | 8.6% | 7 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 1 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 83.8 | 17 / 35 | 3757 |
| 2 | 2 | 62.6 | 74.3 | 14 / 35 | 3181 |
| 3 | 1 | 66.2 | 84.4 | 16 / 35 | 3825 |
| 4 | 1 | 65.4 | 83.8 | 15 / 35 | 3556 |
| 5 | 2 | 62.4 | 76.8 | 12 / 35 | 3145 |
| 6 | 2 | 63.6 | 79.7 | 12 / 35 | 3357 |
| 7 | 2 | 64.0 | 80.3 | 7 / 35 | 3886 |
| 8 | 2 | 62.2 | 75.2 | 9 / 35 | 3416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 73 | 53% |
| djc.DynaBot 0.1.1 | 21 | 76% |
| uji.YellohFellah 1.0 | 19 | 95% |
| cx.mini.Nimrod 0.55 | 18 | 61% |
| rdt199.Warlord 0.73 | 15 | 73% |
| br2.MobyDickBot 1.6 | 10 | 60% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 81 | 45% | 123 |
| cx.mini.Nimrod 0.55 | 27 | 15% | 36 |
| djc.DynaBot 0.1.1 | 23 | 13% | 35 |
| rdt199.Warlord 0.73 | 16 | 9% | 30 |
| uji.YellohFellah 1.0 | 10 | 6% | 23 |
| br2.MobyDickBot 1.6 | 8 | 4% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 2% | 6 |
| KiraNL.Chupacabra 0.4 | 4 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 212964 melee ticks, 48605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 49 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 69719 sent, 63642 reached their opponent, 9429 virtual hits (14.8% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 723 over 8 battles (90.4 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 84.0 | 146 / 280 | 2.44 | 17.0% | 27379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 17.0% | 146 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.3% | 41 |
| darkcanuck.Leon 1.01 | 3.4 | 12.9% | 30 |
| nat.PallasHawk 1.0 | 3.5 | 12.6% | 45 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.2% | 8 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 0 |
| jp.Perpy 16.0 | 7.9 | 6.8% | 3 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.6% | 3 |
| stuff.Vlad 0.1 | 9.6 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.6 | 17 / 35 | 3632 |
| 2 | 1 | 64.6 | 82.2 | 16 / 35 | 3098 |
| 3 | 2 | 62.9 | 77.5 | 14 / 35 | 3010 |
| 4 | 1 | 69.1 | 93.0 | 25 / 35 | 3769 |
| 5 | 1 | 65.2 | 81.9 | 18 / 35 | 3393 |
| 6 | 1 | 66.4 | 86.3 | 19 / 35 | 3295 |
| 7 | 1 | 65.8 | 83.2 | 20 / 35 | 3655 |
| 8 | 1 | 64.9 | 80.3 | 17 / 35 | 3527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 60 | 78% |
| nat.PallasHawk 1.0 | 52 | 65% |
| darkcanuck.Leon 1.01 | 49 | 80% |
| brainfade.melee.Genghis 0.36 | 18 | 89% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| jrm.Test0 1.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 25% | 72 |
| nat.PallasHawk 1.0 | 28 | 20% | 64 |
| darkcanuck.Leon 1.01 | 25 | 18% | 68 |
| brainfade.melee.Genghis 0.36 | 16 | 12% | 21 |
| jrm.Test0 1.0 | 16 | 12% | 19 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 12 |
| jp.Perpy 16.0 | 4 | 3% | 10 |
| stuff.Vlad 0.1 | 3 | 2% | 7 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 176935 melee ticks, 47073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 42 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 60954 sent, 54727 reached their opponent, 9728 virtual hits (17.8% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 8 battles (15.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 82.3 | 83 / 280 | 2.59 | 15.6% | 29525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.3% | 49 |
| mn.Combat 3.25.0 | 1.8 | 16.4% | 112 |
| hadur2.Hadur 3.17.1aa | 2.5 | 15.6% | 83 |
| shinh.Entangled 0.3 | 4.1 | 12.3% | 24 |
| gh.micro.Gruweltje 0.7 | 4.9 | 11.5% | 12 |
| apc.Colossus2 0.17 | 6.5 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.5 | 7.2% | 1 |
| maribo.FollowFire 1 | 8.5 | 4.8% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 80.6 | 10 / 35 | 3729 |
| 2 | 3 | 64.3 | 81.3 | 11 / 35 | 3545 |
| 3 | 3 | 63.3 | 78.7 | 8 / 35 | 3454 |
| 4 | 2 | 65.9 | 85.7 | 15 / 35 | 3684 |
| 5 | 3 | 64.3 | 82.2 | 10 / 35 | 3571 |
| 6 | 2 | 63.8 | 81.3 | 7 / 35 | 3849 |
| 7 | 3 | 64.2 | 81.3 | 8 / 35 | 3552 |
| 8 | 1 | 66.7 | 87.3 | 14 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 70 | 71% |
| mn.Combat 3.25.0 | 61 | 30% |
| shinh.Entangled 0.3 | 15 | 47% |
| gh.micro.Gruweltje 0.7 | 10 | 70% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 198 of 280 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 66 | 33% | 87 |
| ags.Glacier 0.2.11 | 63 | 32% | 104 |
| shinh.Entangled 0.3 | 34 | 17% | 45 |
| gh.micro.Gruweltje 0.7 | 18 | 9% | 28 |
| stelo.Wang 1.0 | 7 | 4% | 7 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 202081 melee ticks, 60847 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 81 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 61113 sent, 54691 reached their opponent, 9479 virtual hits (17.3% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 8 battles (60.9 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.6 | 208 / 280 | 1.49 | 20.1% | 40901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.1% | 208 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 37 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 9.6% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 9.3% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.9% | 4 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 96.5 | 28 / 35 | 5164 |
| 2 | 1 | 70.0 | 94.9 | 24 / 35 | 4757 |
| 3 | 1 | 69.4 | 92.4 | 22 / 35 | 5022 |
| 4 | 1 | 70.6 | 95.2 | 26 / 35 | 4903 |
| 5 | 1 | 69.8 | 94.0 | 24 / 35 | 4920 |
| 6 | 1 | 71.5 | 97.5 | 29 / 35 | 5297 |
| 7 | 1 | 70.2 | 91.4 | 27 / 35 | 5259 |
| 8 | 1 | 71.2 | 94.9 | 28 / 35 | 5579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 93 | 70% |
| simonton.micro.Sprout 1.1.3 | 87 | 91% |
| sanyi.mikrobi.Roberto 1.0 | 26 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 89% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 93% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 75 of 280 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 34 | 45% | 87 |
| simonton.micro.Sprout 1.1.3 | 24 | 32% | 107 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 5% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 8 |
| pa.Improved 1.0 | 3 | 4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 5 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 200620 melee ticks, 77895 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 72 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 64150 sent, 58197 reached their opponent, 15590 virtual hits (26.8% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 789 over 8 battles (98.6 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.2 | 139 / 280 | 2.33 | 17.8% | 35293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.8% | 139 |
| kawigi.micro.Shiz 1.1 | 2.4 | 14.2% | 29 |
| emp.Yngwie 1.11 | 3.3 | 12.7% | 63 |
| mld.DustBunny 3.8 | 3.4 | 12.6% | 13 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.4% | 10 |
| kawigi.robot.Girl 1.2 | 5.9 | 9.2% | 20 |
| lambdaxy.TBot 0.1 | 7.4 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 1 |
| divineomega.TrialBot 0.003 | 8.6 | 5.5% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.6 | 18 / 35 | 4211 |
| 2 | 1 | 65.0 | 78.4 | 15 / 35 | 4174 |
| 3 | 1 | 66.7 | 84.4 | 14 / 35 | 4502 |
| 4 | 1 | 67.3 | 85.1 | 19 / 35 | 4492 |
| 5 | 1 | 68.4 | 90.2 | 22 / 35 | 4378 |
| 6 | 1 | 67.0 | 84.8 | 15 / 35 | 4437 |
| 7 | 1 | 68.8 | 89.8 | 21 / 35 | 4591 |
| 8 | 1 | 66.5 | 81.6 | 15 / 35 | 4508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 68 | 54% |
| kawigi.micro.Shiz 1.1 | 40 | 93% |
| mld.DustBunny 3.8 | 35 | 91% |
| cb.nano.Insomnia 1.0 | 16 | 69% |
| kawigi.robot.Girl 1.2 | 14 | 79% |
| divineomega.TrialBot 0.003 | 10 | 80% |
| lambdaxy.TBot 0.1 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |

Hadur died in 149 of 280 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 31% | 89 |
| cb.nano.Insomnia 1.0 | 25 | 17% | 32 |
| kawigi.micro.Shiz 1.1 | 21 | 14% | 59 |
| mld.DustBunny 3.8 | 16 | 11% | 52 |
| divineomega.TrialBot 0.003 | 15 | 10% | 22 |
| kawigi.robot.Girl 1.2 | 10 | 7% | 14 |
| Grystrion.TrackerWO 1.0 | 5 | 3% | 6 |
| lambdaxy.TBot 0.1 | 3 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 230030 melee ticks, 62497 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 69 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 2.

Targeting waves (274 rounds): 75112 sent, 68956 reached their opponent, 12372 virtual hits (17.9% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 591 over 8 battles (73.9 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.3 | 139 / 280 | 2.23 | 18.4% | 39468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.1 | 18.4% | 139 |
| gh.Griezel 0.5.2 | 1.9 | 16.1% | 58 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.1 | 14.1% | 15 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.6% | 56 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.6 | 8.9% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.2% | 2 |
| repositorio.NanoStep 1.0 | 8.4 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.4% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 83.5 | 13 / 35 | 4509 |
| 2 | 1 | 69.0 | 87.9 | 17 / 35 | 5156 |
| 3 | 1 | 66.7 | 80.3 | 17 / 35 | 4550 |
| 4 | 1 | 68.1 | 85.4 | 15 / 35 | 4884 |
| 5 | 1 | 70.3 | 91.1 | 24 / 35 | 5321 |
| 6 | 1 | 69.8 | 90.5 | 19 / 35 | 5062 |
| 7 | 1 | 67.7 | 86.0 | 16 / 35 | 4628 |
| 8 | 1 | 69.0 | 86.0 | 18 / 35 | 5358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 107 | 69% |
| techdude.forest.FlamingForest 1.1 | 47 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 78% |
| stelo.IntrinsicVolatility 1.4 | 10 | 100% |
| bvh.fnr.Fenrir 0.36l | 9 | 78% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 59 | 40% | 129 |
| techdude.forest.FlamingForest 1.1 | 34 | 23% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 12% | 34 |
| bvh.fnr.Fenrir 0.36l | 16 | 11% | 23 |
| tvv.nano.Polaris 1.2 | 5 | 3% | 11 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 9 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 7 |
| asd.Cthulhu 1.3 | 2 | 1% | 3 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 249753 melee ticks, 89143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 39 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 81279 sent, 75148 reached their opponent, 13726 virtual hits (18.3% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 497 over 8 battles (62.1 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.3 | 144 / 280 | 2.14 | 18.6% | 40774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 144 |
| et.Predator 1.8 | 2.8 | 13.3% | 32 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.0% | 42 |
| cx.BlestPain 1.41 | 3.8 | 12.1% | 47 |
| ahf.NanoAndrew .4 | 4.9 | 10.3% | 6 |
| nic.Nicator 2.4 | 6.0 | 9.5% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.3% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 15 / 35 | 5001 |
| 2 | 1 | 67.8 | 84.8 | 19 / 35 | 5131 |
| 3 | 1 | 67.7 | 86.7 | 13 / 35 | 4886 |
| 4 | 1 | 68.5 | 85.4 | 18 / 35 | 5187 |
| 5 | 1 | 69.4 | 91.1 | 18 / 35 | 5322 |
| 6 | 1 | 69.4 | 88.6 | 22 / 35 | 5326 |
| 7 | 1 | 68.3 | 86.0 | 19 / 35 | 4790 |
| 8 | 1 | 69.4 | 90.2 | 20 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 67% |
| et.Predator 1.8 | 64 | 72% |
| cx.BlestPain 1.41 | 46 | 35% |
| ahf.NanoAndrew .4 | 14 | 93% |
| nic.Nicator 2.4 | 12 | 92% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 7 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 27% | 54 |
| et.Predator 1.8 | 35 | 25% | 75 |
| oog.melee.Mercutio 1.0 | 34 | 24% | 70 |
| ahf.NanoAndrew .4 | 14 | 10% | 30 |
| maribo.melee.BMV 0.1 | 6 | 4% | 16 |
| nic.Nicator 2.4 | 5 | 4% | 20 |
| tex.Longbot 0.4 | 5 | 4% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 9 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 220713 melee ticks, 86523 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 41 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 75034 sent, 68988 reached their opponent, 15772 virtual hits (22.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 8 battles (39.3 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 92.0 | 182 / 280 | 1.72 | 19.4% | 36335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 182 |
| morbid.MorbidPriest 1.0 | 2.1 | 14.4% | 47 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.3% | 16 |
| uji.DBH 1.1 | 4.0 | 10.8% | 14 |
| sigterm.Sigterm 1.0 | 6.0 | 8.5% | 6 |
| ratosh.Nobo 0.21 | 6.1 | 8.7% | 4 |
| spinnercat.Robovirus 2.718 | 6.5 | 8.3% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 7.4 | 7.4% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.1% | 0 |
| stelo.WangRobot 1.0 | 9.6 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.0 | 23 / 35 | 4227 |
| 2 | 1 | 70.4 | 95.6 | 25 / 35 | 4830 |
| 3 | 1 | 68.7 | 90.8 | 21 / 35 | 4488 |
| 4 | 1 | 69.9 | 94.0 | 26 / 35 | 4606 |
| 5 | 1 | 69.0 | 93.3 | 22 / 35 | 4423 |
| 6 | 1 | 68.3 | 89.5 | 20 / 35 | 4477 |
| 7 | 1 | 69.4 | 93.0 | 24 / 35 | 4626 |
| 8 | 1 | 69.4 | 92.7 | 21 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 87 | 70% |
| agd.Mooserwirt2 2.7 | 47 | 91% |
| uji.DBH 1.1 | 35 | 80% |
| sigterm.Sigterm 1.0 | 22 | 82% |
| ratosh.Nobo 0.21 | 17 | 88% |
| stelo.WangRobot 1.0 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |
| spinnercat.Robovirus 2.718 | 5 | 80% |

Hadur died in 100 of 280 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 47% | 109 |
| uji.DBH 1.1 | 16 | 16% | 38 |
| agd.Mooserwirt2 2.7 | 14 | 14% | 59 |
| ratosh.Nobo 0.21 | 8 | 8% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8% | 15 |
| sigterm.Sigterm 1.0 | 5 | 5% | 20 |
| stelo.WangRobot 1.0 | 1 | 1% | 9 |
| spinnercat.Robovirus 2.718 | 1 | 1% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |

Posture (Hadur's M records, 272 rounds): 192539 melee ticks, 66384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 62 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 64897 sent, 58801 reached their opponent, 13417 virtual hits (22.8% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 8 battles (48.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.2 | 254 / 280 | 1.25 | 21.7% | 45152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.7% | 254 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 11 |
| krillr.mini.JointStrike 2.0.0 | 3.5 | 12.0% | 4 |
| mld.Infinity 2.2 | 4.1 | 11.8% | 7 |
| erdnis.Rover 0.3 | 4.4 | 11.3% | 4 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.1 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 6.6% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 98.4 | 33 / 35 | 5753 |
| 2 | 1 | 72.4 | 98.4 | 33 / 35 | 5115 |
| 3 | 1 | 73.3 | 98.4 | 32 / 35 | 6062 |
| 4 | 1 | 72.6 | 98.7 | 32 / 35 | 5453 |
| 5 | 1 | 73.0 | 97.5 | 32 / 35 | 5754 |
| 6 | 1 | 72.7 | 96.8 | 30 / 35 | 5727 |
| 7 | 1 | 72.9 | 96.8 | 33 / 35 | 5683 |
| 8 | 1 | 71.7 | 92.7 | 29 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 131 | 95% |
| mld.Infinity 2.2 | 45 | 98% |
| krillr.mini.JointStrike 2.0.0 | 41 | 95% |
| erdnis.Rover 0.3 | 23 | 91% |
| pac.ABC 2.1 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 29 of 280 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 41% | 91 |
| krillr.mini.JointStrike 2.0.0 | 8 | 28% | 50 |
| mld.Infinity 2.2 | 3 | 10% | 42 |
| erdnis.Rover 0.3 | 3 | 10% | 35 |
| pac.ABC 2.1 | 1 | 3% | 16 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 20 |
| mbh.Mbh 0.1 | 0 | 0% | 14 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 175121 melee ticks, 61560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 47 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 6.

Targeting waves (267 rounds): 59853 sent, 54209 reached their opponent, 14001 virtual hits (25.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 8 battles (56.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.4 | 184 / 280 | 1.77 | 20.0% | 42650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.0% | 184 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 44 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.3% | 5 |
| catcat20.Rabbit 0.001 | 4.4 | 10.8% | 22 |
| m3thos.mini.Eva01 0.5.5 | 5.9 | 8.6% | 3 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 21 / 35 | 4865 |
| 2 | 1 | 69.0 | 89.2 | 20 / 35 | 5028 |
| 3 | 1 | 70.3 | 92.1 | 23 / 35 | 5114 |
| 4 | 1 | 70.5 | 92.1 | 21 / 35 | 5714 |
| 5 | 1 | 71.5 | 94.3 | 28 / 35 | 5562 |
| 6 | 1 | 69.8 | 88.9 | 22 / 35 | 5384 |
| 7 | 1 | 71.0 | 92.1 | 23 / 35 | 5746 |
| 8 | 1 | 71.1 | 95.2 | 26 / 35 | 5237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 118 | 79% |
| fwb.Nine 1.0.1 | 41 | 100% |
| catcat20.Rabbit 0.001 | 28 | 79% |
| nz.jdc.nano.GridFu 1.0 | 17 | 88% |
| m3thos.mini.Eva01 0.5.5 | 8 | 88% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 54 | 54% | 145 |
| fwb.Nine 1.0.1 | 15 | 15% | 31 |
| catcat20.Rabbit 0.001 | 13 | 13% | 37 |
| nz.jdc.nano.GridFu 1.0 | 6 | 6% | 30 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 17 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 230916 melee ticks, 64241 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 41 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 2.

Targeting waves (273 rounds): 74214 sent, 68133 reached their opponent, 16703 virtual hits (24.5% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 749 over 8 battles (93.6 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 92.4 | 165 / 280 | 1.68 | 19.8% | 41962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 165 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 86 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 6 |
| eld.Hmm 1.0 | 5.4 | 8.6% | 10 |
| oa.weak.BotherBot 0.1 | 5.6 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.5 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.6 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 18 / 35 | 5645 |
| 2 | 1 | 70.0 | 93.7 | 19 / 35 | 5134 |
| 3 | 1 | 70.8 | 91.4 | 23 / 35 | 5607 |
| 4 | 1 | 69.4 | 91.4 | 21 / 35 | 4849 |
| 5 | 1 | 71.9 | 96.2 | 25 / 35 | 5661 |
| 6 | 1 | 71.3 | 96.2 | 24 / 35 | 5320 |
| 7 | 1 | 69.3 | 90.8 | 18 / 35 | 5003 |
| 8 | 1 | 68.1 | 87.3 | 17 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 167 | 61% |
| dummy.mini.Scimitar 1.01 | 31 | 81% |
| cf.RiO.RiOx 4.2.1 | 30 | 93% |
| eld.Hmm 1.0 | 12 | 50% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 33% |

Hadur died in 121 of 280 rounds, at a mean tick of 1358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 66 | 55% | 134 |
| dummy.mini.Scimitar 1.01 | 21 | 17% | 66 |
| cf.RiO.RiOx 4.2.1 | 11 | 9% | 35 |
| eld.Hmm 1.0 | 10 | 8% | 32 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 250350 melee ticks, 116934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 105 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 1.

Targeting waves (277 rounds): 75038 sent, 69041 reached their opponent, 13138 virtual hits (19.0% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 395 over 8 battles (49.4 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.4 | 119 / 280 | 2.14 | 17.6% | 35141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.6% | 119 |
| pe.SandboxDT 2.71m | 1.9 | 16.7% | 92 |
| kvk.HebusLeTroll 0.35 | 2.9 | 14.7% | 32 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 27 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 7 |
| yk.JahRoslav 1.1 | 6.6 | 7.0% | 3 |
| tad.Dalek98 0.98 | 6.9 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.6 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.9 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.4 | 15 / 35 | 4126 |
| 2 | 1 | 68.0 | 88.3 | 17 / 35 | 4410 |
| 3 | 1 | 66.5 | 83.5 | 12 / 35 | 4269 |
| 4 | 1 | 67.7 | 89.2 | 17 / 35 | 3975 |
| 5 | 1 | 68.0 | 88.3 | 13 / 35 | 4545 |
| 6 | 2 | 67.5 | 87.0 | 13 / 35 | 4503 |
| 7 | 1 | 67.7 | 88.3 | 15 / 35 | 4531 |
| 8 | 1 | 68.9 | 89.2 | 17 / 35 | 4782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 77 | 39% |
| jlm.javaDisturbance 0.59 | 50 | 68% |
| kvk.HebusLeTroll 0.35 | 47 | 74% |
| bigpete.Stewie 1.0 | 16 | 94% |
| yk.JahRoslav 1.1 | 6 | 67% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 164 of 280 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 77 | 47% | 113 |
| kvk.HebusLeTroll 0.35 | 36 | 22% | 65 |
| jlm.javaDisturbance 0.59 | 34 | 21% | 66 |
| bigpete.Stewie 1.0 | 9 | 5% | 23 |
| yk.JahRoslav 1.1 | 2 | 1% | 7 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 219807 melee ticks, 63183 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 63 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 71151 sent, 65115 reached their opponent, 11360 virtual hits (17.4% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 8 battles (39.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.6 | 219 / 280 | 1.40 | 21.1% | 43935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.1% | 219 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 49 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.4% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.1 | 9.4% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 9.0% | 0 |
| cw.megas.Blade 0.8 | 6.6 | 8.3% | 1 |
| sample.Walls 1.0 | 8.0 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 25 / 35 | 4991 |
| 2 | 1 | 72.1 | 96.8 | 27 / 35 | 5728 |
| 3 | 1 | 73.1 | 98.4 | 30 / 35 | 5743 |
| 4 | 1 | 72.1 | 95.6 | 27 / 35 | 5336 |
| 5 | 1 | 72.4 | 95.2 | 26 / 35 | 5603 |
| 6 | 1 | 71.2 | 92.4 | 25 / 35 | 5328 |
| 7 | 1 | 72.4 | 94.9 | 27 / 35 | 5482 |
| 8 | 1 | 73.3 | 98.7 | 32 / 35 | 5724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 127 | 78% |
| cre.Karolos 0.32 | 68 | 97% |
| stelo.RamTrackSurfer 1.2 | 23 | 91% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 63 of 280 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 41 | 65% | 137 |
| cre.Karolos 0.32 | 11 | 17% | 69 |
| stelo.RamTrackSurfer 1.2 | 4 | 6% | 31 |
| stelo.AreaTargetingBot 1.1 | 2 | 3% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 174518 melee ticks, 64075 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 50 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 55832 sent, 49906 reached their opponent, 16676 virtual hits (33.4% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 719 over 8 battles (89.9 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 79.9 | 98 / 280 | 2.81 | 15.7% | 27270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 15.7% | 98 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 55 |
| florent.XSeries.X2 0.12 | 3.1 | 13.0% | 42 |
| davidalves.Phoenix 0.54 | 3.9 | 12.8% | 47 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.0% | 30 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 7.3% | 3 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.1 | 4.8% | 0 |
| evd.X1 0.01 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 75.6 | 13 / 35 | 3004 |
| 2 | 1 | 63.9 | 79.0 | 13 / 35 | 3514 |
| 3 | 1 | 65.0 | 81.9 | 12 / 35 | 3749 |
| 4 | 2 | 63.1 | 78.1 | 11 / 35 | 3180 |
| 5 | 1 | 65.6 | 84.4 | 14 / 35 | 3796 |
| 6 | 1 | 65.3 | 84.1 | 13 / 35 | 3711 |
| 7 | 1 | 63.6 | 80.6 | 12 / 35 | 3155 |
| 8 | 2 | 62.3 | 75.6 | 10 / 35 | 3161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 55 | 62% |
| davidalves.Phoenix 0.54 | 35 | 49% |
| florent.XSeries.X2 0.12 | 30 | 50% |
| pedersen.Ugluk 1.1.1 | 27 | 74% |
| stelo.SoJNanoMelee 1.1 | 6 | 67% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| lunchie.Lunchbox 0.93 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 188 of 280 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 47 | 25% | 66 |
| rz.GlowBlowMelee 1.4 | 45 | 24% | 79 |
| davidalves.Phoenix 0.54 | 41 | 22% | 58 |
| pedersen.Ugluk 1.1.1 | 29 | 15% | 41 |
| oog.melee.Corsair 1.0 | 11 | 6% | 19 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 7 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 5 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| evd.X1 0.01 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 187918 melee ticks, 47013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 72 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 63551 sent, 57290 reached their opponent, 11641 virtual hits (20.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 354 over 8 battles (44.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.9 | 175 / 280 | 2.09 | 18.1% | 28564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.1% | 175 |
| voidious.mini.BrokenSword 2.0.3 | 2.4 | 14.0% | 30 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.6% | 15 |
| jdw.Hurricane 1.4 | 3.9 | 11.3% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.6% | 11 |
| ds.Oo 2.2 | 6.3 | 8.5% | 9 |
| awesomeness.Elite 1.0 | 7.3 | 7.6% | 5 |
| gjr.Cephalosporin 0.1 | 7.9 | 7.1% | 4 |
| adt.Ar2 1.1 | 8.4 | 6.9% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 88.3 | 20 / 35 | 3517 |
| 2 | 1 | 68.1 | 90.5 | 24 / 35 | 3739 |
| 3 | 1 | 66.6 | 86.0 | 19 / 35 | 3661 |
| 4 | 1 | 66.9 | 87.0 | 18 / 35 | 3681 |
| 5 | 1 | 68.2 | 89.5 | 25 / 35 | 3478 |
| 6 | 1 | 67.6 | 87.3 | 23 / 35 | 3720 |
| 7 | 1 | 67.8 | 91.1 | 24 / 35 | 3375 |
| 8 | 1 | 66.4 | 83.5 | 22 / 35 | 3393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 74 | 78% |
| voidious.micro.BlitzBat 1.05 | 45 | 100% |
| jdw.Hurricane 1.4 | 35 | 80% |
| ds.Oo 2.2 | 22 | 82% |
| gjr.Cephalosporin 0.1 | 11 | 82% |
| awesomeness.Elite 1.0 | 9 | 89% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 107 of 280 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 24% | 78 |
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 57 |
| jdw.Hurricane 1.4 | 19 | 18% | 43 |
| gre.svman4.Morfeas 1.4.1 | 14 | 13% | 26 |
| ds.Oo 2.2 | 9 | 8% | 29 |
| awesomeness.Elite 1.0 | 8 | 7% | 18 |
| gjr.Cephalosporin 0.1 | 5 | 5% | 17 |
| adt.Ar2 1.1 | 3 | 3% | 10 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 175461 melee ticks, 41371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 40 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 62585 sent, 56464 reached their opponent, 10410 virtual hits (18.4% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 8 battles (61.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.7 | 181 / 280 | 1.75 | 19.6% | 43441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 181 |
| ak.Fermat 2.0 | 2.3 | 14.6% | 38 |
| lrem.Spectre 0.4.4 | 3.0 | 12.7% | 28 |
| shu.nitro.LENIN .T34 | 4.0 | 11.9% | 18 |
| js.PinBall 1.6 | 5.0 | 11.3% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.9% | 6 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.8% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 27 / 35 | 5506 |
| 2 | 1 | 70.2 | 90.2 | 24 / 35 | 5480 |
| 3 | 1 | 72.3 | 96.8 | 29 / 35 | 5921 |
| 4 | 1 | 70.3 | 91.7 | 22 / 35 | 5287 |
| 5 | 1 | 69.1 | 88.9 | 16 / 35 | 5279 |
| 6 | 1 | 70.5 | 93.3 | 19 / 35 | 5577 |
| 7 | 1 | 68.8 | 87.3 | 21 / 35 | 4955 |
| 8 | 1 | 70.3 | 91.4 | 23 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 83 | 67% |
| lrem.Spectre 0.4.4 | 56 | 77% |
| shu.nitro.LENIN .T34 | 41 | 95% |
| js.PinBall 1.6 | 28 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 102 of 280 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 38 | 37% | 79 |
| lrem.Spectre 0.4.4 | 27 | 26% | 71 |
| shu.nitro.LENIN .T34 | 14 | 14% | 58 |
| js.PinBall 1.6 | 8 | 8% | 34 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 8% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 10 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 217068 melee ticks, 65316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 403 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 279 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 71817 sent, 65693 reached their opponent, 17033 virtual hits (25.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 455 over 8 battles (56.9 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 69.2 | 143 / 280 | 3.78 | 15.7% | 34752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 15.6% | 84 |
| hadur2.Hadur 3.17.1aa | 2.1 | 15.7% | 143 |
| wee.Gem 1.8.4 | 4.1 | 10.4% | 18 |
| EH.Eagle 1.0.6 | 4.3 | 10.4% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.1 | 9.5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.1% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.8% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.7% | 9 |
| caimano.Furia_Ceca 0.22 | 8.9 | 7.0% | 3 |
| cs.Grudge 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 98.4 | 31 / 35 | 4955 |
| 2 | 2 | 56.2 | 48.9 | 9 / 35 | 4119 |
| 3 | 2 | 55.4 | 48.6 | 6 / 35 | 4202 |
| 4 | 1 | 69.1 | 92.4 | 26 / 35 | 4344 |
| 5 | 1 | 70.8 | 93.7 | 28 / 35 | 5135 |
| 6 | 3 | 53.4 | 44.4 | 11 / 35 | 3522 |
| 7 | 1 | 69.4 | 89.5 | 27 / 35 | 4666 |
| 8 | 6 | 50.4 | 37.5 | 5 / 35 | 3809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 96 | 86% |
| EH.Eagle 1.0.6 | 21 | 100% |
| wee.Gem 1.8.4 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 7 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 45 | 32% | 43 |
| mk.Alpha 0.2.1 | 37 | 26% | 108 |
| joe.ADinosaur 1.0 | 12 | 9% | 20 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 6% | 17 |
| throxbot.ThroxBot 0.1 | 8 | 6% | 16 |
| EH.Eagle 1.0.6 | 7 | 5% | 28 |
| wee.Gem 1.8.4 | 7 | 5% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 7 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 6 | 4% | 12 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 152446 melee ticks, 38196 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 581 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 325 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 51667 sent, 45833 reached their opponent, 12509 virtual hits (27.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 275 over 8 battles (34.4 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 88.8 | 173 / 280 | 2.01 | 18.0% | 29672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.0% | 173 |
| kid.test.NightFox .2 | 2.1 | 14.8% | 38 |
| uji.Antique 1.0 | 3.3 | 11.8% | 29 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.0% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.5% | 8 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.0% | 5 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.2% | 3 |
| matt.advanced.Katana 1.0 | 7.9 | 6.9% | 3 |
| stelo.PianistNano 1.2 | 9.4 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 86.7 | 18 / 35 | 3595 |
| 2 | 1 | 67.4 | 89.8 | 22 / 35 | 3623 |
| 3 | 1 | 64.8 | 83.8 | 17 / 35 | 3453 |
| 4 | 1 | 69.3 | 93.7 | 28 / 35 | 3980 |
| 5 | 1 | 66.3 | 86.0 | 20 / 35 | 3689 |
| 6 | 1 | 66.9 | 87.9 | 22 / 35 | 3563 |
| 7 | 1 | 67.6 | 88.6 | 21 / 35 | 3924 |
| 8 | 1 | 69.0 | 93.7 | 25 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 85% |
| uji.Antique 1.0 | 54 | 81% |
| qohnil.blot.BlotBot 3.61 | 26 | 58% |
| amk.ChumbaWumba 0.3 | 13 | 92% |
| ahr.ice.Ice 1.0.2 | 10 | 70% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 109 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 29 | 27% | 45 |
| kid.test.NightFox .2 | 26 | 24% | 71 |
| uji.Antique 1.0 | 23 | 21% | 73 |
| qohnil.blot.BlotBot 3.61 | 18 | 17% | 39 |
| amk.ChumbaWumba 0.3 | 6 | 6% | 19 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 14 |
| matt.advanced.Katana 1.0 | 3 | 3% | 8 |
| stelo.Lifestealer 1.0 | 0 | 0% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 175512 melee ticks, 46508 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 49 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 4.

Targeting waves (269 rounds): 59826 sent, 53836 reached their opponent, 8593 virtual hits (16.0% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 556 over 8 battles (69.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.8 | 146 / 280 | 2.10 | 18.5% | 33825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.5% | 146 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.7% | 56 |
| deewiant.Anomaly 0.2 | 2.9 | 14.6% | 53 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 12 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.8% | 1 |
| DBall.Anarchy 0.1 | 8.0 | 5.4% | 3 |
| ap.Frederick 1.1 | 9.1 | 4.9% | 1 |
| jangs.ns51 1.0 | 9.4 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 22 / 35 | 4796 |
| 2 | 1 | 66.5 | 83.5 | 11 / 35 | 3983 |
| 3 | 1 | 69.1 | 88.3 | 19 / 35 | 4495 |
| 4 | 1 | 67.3 | 84.8 | 17 / 35 | 3844 |
| 5 | 1 | 70.9 | 92.7 | 24 / 35 | 4651 |
| 6 | 1 | 67.4 | 84.8 | 17 / 35 | 4028 |
| 7 | 1 | 67.8 | 85.4 | 18 / 35 | 3875 |
| 8 | 1 | 68.8 | 91.1 | 18 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 79 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 69 | 65% |
| myl.micro.Troodon 1.10 | 29 | 76% |
| jok.PheonixM 0.1.2 | 21 | 76% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 38% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 51 | 36% | 98 |
| myl.micro.Troodon 1.10 | 16 | 11% | 35 |
| jok.PheonixM 0.1.2 | 14 | 10% | 26 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 4 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 230693 melee ticks, 77293 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 56 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 2.

Targeting waves (277 rounds): 76757 sent, 70551 reached their opponent, 12059 virtual hits (17.1% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 856 over 8 battles (107.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.8 | 56 / 280 | 3.36 | 14.2% | 27119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 2.0 | 14.2% | 56 |
| catcat20.Matcha 0.006 | 2.3 | 14.4% | 79 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 56 |
| oog.melee.Capulet 1.2 | 3.6 | 12.7% | 42 |
| stelo.PastFuture 2.3.2 | 4.1 | 12.5% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.2% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 6.9% | 7 |
| tripphippy.Alice 1.1 | 7.6 | 7.5% | 5 |
| ntc.Opposite 1.5 | 8.6 | 6.6% | 0 |
| GarmBox.Anger 1.0 | 9.9 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 75.6 | 7 / 35 | 3415 |
| 2 | 4 | 58.0 | 63.5 | 3 / 35 | 3467 |
| 3 | 1 | 61.6 | 76.5 | 7 / 35 | 3290 |
| 4 | 1 | 63.9 | 77.8 | 11 / 35 | 3732 |
| 5 | 1 | 63.2 | 80.0 | 8 / 35 | 3247 |
| 6 | 1 | 63.1 | 78.7 | 9 / 35 | 3311 |
| 7 | 2 | 61.9 | 74.6 | 6 / 35 | 3587 |
| 8 | 5 | 57.9 | 63.8 | 5 / 35 | 3070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 43 | 40% |
| oog.melee.Capulet 1.2 | 27 | 48% |
| darkcanuck.B26354 1.06 | 26 | 35% |
| stelo.PastFuture 2.3.2 | 11 | 64% |
| intruder.PrairieWolf 2.61 | 8 | 63% |
| tripphippy.Alice 1.1 | 5 | 60% |
| ntc.Opposite 1.5 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 232 of 280 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 53 | 23% | 71 |
| stelo.PastFuture 2.3.2 | 47 | 20% | 54 |
| darkcanuck.B26354 1.06 | 42 | 18% | 50 |
| oog.melee.Capulet 1.2 | 36 | 16% | 53 |
| tripphippy.Alice 1.1 | 14 | 6% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 6% | 13 |
| intruder.PrairieWolf 2.61 | 11 | 5% | 14 |
| ntc.Opposite 1.5 | 9 | 4% | 10 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 216291 melee ticks, 34244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 71 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 71081 sent, 64922 reached their opponent, 11687 virtual hits (18.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 681 over 8 battles (85.1 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.6 | 61 / 280 | 3.20 | 14.4% | 24836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 140 |
| hadur2.Hadur 3.17.1aa | 2.1 | 14.4% | 61 |
| gh.mini.Griezel 0.2 | 3.1 | 13.1% | 59 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 10.8% | 5 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.2% | 15 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.9% | 2 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.8% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 8.4 | 5.6% | 0 |
| fm.mammillarias 1.3 | 8.4 | 6.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 75.2 | 10 / 35 | 3171 |
| 2 | 2 | 60.9 | 74.0 | 7 / 35 | 2912 |
| 3 | 2 | 60.2 | 72.7 | 4 / 35 | 3056 |
| 4 | 2 | 63.1 | 78.4 | 7 / 35 | 3175 |
| 5 | 3 | 62.5 | 77.5 | 8 / 35 | 2969 |
| 6 | 2 | 60.8 | 73.7 | 6 / 35 | 2769 |
| 7 | 2 | 63.5 | 76.8 | 10 / 35 | 3619 |
| 8 | 2 | 62.9 | 76.5 | 9 / 35 | 3165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 68 | 40% |
| gh.mini.Griezel 0.2 | 35 | 34% |
| d414.nano.Quantum 1.0.0 | 10 | 80% |
| spinnercat.micro.Tyger 0.1 | 7 | 100% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 40% | 112 |
| gh.mini.Griezel 0.2 | 57 | 25% | 70 |
| d414.nano.Quantum 1.0.0 | 20 | 9% | 29 |
| spinnercat.micro.Tyger 0.1 | 17 | 7% | 26 |
| timmit.nano.TimDog 0.33 | 12 | 5% | 15 |
| gh.nano.Grofvuil 0.2 | 10 | 4% | 15 |
| fm.mammillarias 1.3 | 7 | 3% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 206969 melee ticks, 38865 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 54 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 67581 sent, 61298 reached their opponent, 10868 virtual hits (17.7% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 8 battles (33.4 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 88.6 | 149 / 280 | 2.03 | 17.7% | 32326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.7% | 149 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 70 |
| apc.botM 3.0 | 3.0 | 12.5% | 34 |
| lxx.ConceptA 0.8 | 4.5 | 10.3% | 3 |
| vjik.UnViolation 1.1 | 5.1 | 9.5% | 10 |
| bayen.UbaMicro 1.4 | 5.5 | 9.0% | 5 |
| yk.JahMicro 1.0 | 7.6 | 7.2% | 4 |
| panzer.Panzer 0.2 | 7.8 | 7.1% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 90.5 | 19 / 35 | 4319 |
| 2 | 1 | 68.0 | 92.4 | 21 / 35 | 4188 |
| 3 | 1 | 65.6 | 86.7 | 16 / 35 | 3775 |
| 4 | 1 | 67.4 | 89.8 | 19 / 35 | 4435 |
| 5 | 1 | 64.4 | 82.5 | 15 / 35 | 3749 |
| 6 | 1 | 65.6 | 86.7 | 18 / 35 | 3827 |
| 7 | 1 | 67.6 | 90.2 | 21 / 35 | 4242 |
| 8 | 1 | 67.4 | 90.2 | 20 / 35 | 3791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 101 | 54% |
| apc.botM 3.0 | 60 | 72% |
| vjik.UnViolation 1.1 | 18 | 83% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| yk.JahMicro 1.0 | 9 | 78% |
| lxx.ConceptA 0.8 | 9 | 89% |
| donjezza.Jezza 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 3 | 67% |

Hadur died in 132 of 280 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 56 | 42% | 105 |
| apc.botM 3.0 | 23 | 17% | 64 |
| bayen.UbaMicro 1.4 | 16 | 12% | 25 |
| lxx.ConceptA 0.8 | 13 | 10% | 25 |
| vjik.UnViolation 1.1 | 8 | 6% | 33 |
| panzer.Panzer 0.2 | 7 | 5% | 7 |
| yk.JahMicro 1.0 | 6 | 5% | 12 |
| conscience.Electron 1.3g | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 174351 melee ticks, 72897 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 58 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 59766 sent, 53499 reached their opponent, 10772 virtual hits (20.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 8 battles (60.9 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.5 | 149 / 280 | 2.04 | 18.6% | 35409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 149 |
| maribo.Quester 0.3 | 2.0 | 16.1% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.9% | 33 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 10.6% | 13 |
| labg.Cataclysm 2.05 | 5.1 | 9.9% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.9% | 9 |
| baal.nano.N 1.42 | 6.4 | 8.9% | 3 |
| zyx.micro.Ant 1.1 | 8.4 | 5.5% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 20 / 35 | 4739 |
| 2 | 1 | 67.4 | 86.0 | 16 / 35 | 4378 |
| 3 | 1 | 67.1 | 84.8 | 16 / 35 | 4206 |
| 4 | 1 | 68.9 | 89.2 | 21 / 35 | 4334 |
| 5 | 1 | 68.0 | 85.1 | 17 / 35 | 4608 |
| 6 | 1 | 70.0 | 93.3 | 23 / 35 | 4529 |
| 7 | 1 | 67.9 | 87.9 | 17 / 35 | 4174 |
| 8 | 1 | 69.1 | 89.8 | 19 / 35 | 4441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 95 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 69% |
| gre.svman4.Leonidas 1.3.2 | 28 | 82% |
| labg.Cataclysm 2.05 | 16 | 63% |
| baal.nano.N 1.42 | 10 | 90% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 80% |
| sanja.First 0.1 | 3 | 67% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 45% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 19% | 56 |
| gre.svman4.Leonidas 1.3.2 | 20 | 14% | 36 |
| labg.Cataclysm 2.05 | 10 | 7% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 7% | 16 |
| baal.nano.N 1.42 | 3 | 2% | 15 |
| zyx.micro.Ant 1.1 | 2 | 1% | 7 |
| sanja.First 0.1 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 236459 melee ticks, 68038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 48 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 1.

Targeting waves (271 rounds): 76159 sent, 70105 reached their opponent, 11601 virtual hits (16.5% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 8 battles (64.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.1 | 105 / 280 | 2.34 | 17.3% | 35685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.6 | 17.3% | 105 |
| kid.Gladiator .7.2 | 2.1 | 16.6% | 53 |
| stelo.Spread 0.9 | 2.3 | 16.6% | 87 |
| jcs.Seth 1.8 | 4.4 | 11.4% | 28 |
| tcf.Reach 3 | 4.8 | 11.1% | 7 |
| cli.Dancer 1.1 | 5.9 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 11 / 35 | 4229 |
| 2 | 2 | 66.2 | 82.5 | 11 / 35 | 4133 |
| 3 | 2 | 67.3 | 85.4 | 12 / 35 | 4345 |
| 4 | 1 | 69.3 | 89.2 | 19 / 35 | 4697 |
| 5 | 3 | 65.9 | 81.0 | 10 / 35 | 4121 |
| 6 | 1 | 68.1 | 87.3 | 11 / 35 | 4671 |
| 7 | 1 | 69.3 | 87.6 | 16 / 35 | 5037 |
| 8 | 2 | 67.3 | 82.9 | 15 / 35 | 4452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 74 | 61% |
| stelo.Spread 0.9 | 70 | 49% |
| jcs.Seth 1.8 | 27 | 52% |
| tcf.Reach 3 | 13 | 62% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 180 of 280 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 65 | 36% | 109 |
| kid.Gladiator .7.2 | 65 | 36% | 99 |
| jcs.Seth 1.8 | 24 | 13% | 37 |
| tcf.Reach 3 | 14 | 8% | 22 |
| cli.Dancer 1.1 | 5 | 3% | 9 |
| ratosh.Wesco 1.4 | 2 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 239770 melee ticks, 75489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 40 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 74745 sent, 68551 reached their opponent, 12421 virtual hits (18.1% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 966 over 8 battles (120.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.0 | 38 / 280 | 2.80 | 15.0% | 26774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 203 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.0% | 38 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 21 |
| rz.HawkOnFire 0.1 | 4.4 | 11.9% | 8 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 12.0% | 10 |
| wit.Chuliath 1.0 | 6.3 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.4 | 6.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 8.9 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 77.8 | 4 / 35 | 3758 |
| 2 | 2 | 62.3 | 78.1 | 4 / 35 | 2988 |
| 3 | 2 | 65.2 | 83.8 | 7 / 35 | 3583 |
| 4 | 2 | 62.6 | 77.8 | 4 / 35 | 2962 |
| 5 | 2 | 64.0 | 81.3 | 5 / 35 | 3463 |
| 6 | 2 | 62.2 | 79.0 | 3 / 35 | 2992 |
| 7 | 2 | 63.9 | 81.0 | 7 / 35 | 3317 |
| 8 | 2 | 64.4 | 81.3 | 4 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 107 | 11% |
| gh.mini.Gruwel 0.9 | 23 | 48% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 250 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 135 | 54% | 142 |
| gh.mini.Gruwel 0.9 | 40 | 16% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 32 | 13% | 42 |
| rz.HawkOnFire 0.1 | 23 | 9% | 31 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 5 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 201889 melee ticks, 55607 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 41 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 63288 sent, 57096 reached their opponent, 9634 virtual hits (16.9% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 8 battles (24.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.4 | 205 / 280 | 1.69 | 20.3% | 40227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.3% | 205 |
| alpha.RainingFire 1.0 | 2.4 | 12.7% | 24 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 18 |
| bvh.micro.Freya 0.3 | 4.9 | 10.4% | 11 |
| mz.Cork 0.1 | 5.0 | 10.6% | 11 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.7% | 5 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.2 | 28 / 35 | 4988 |
| 2 | 1 | 69.8 | 90.2 | 25 / 35 | 4962 |
| 3 | 1 | 69.6 | 89.2 | 25 / 35 | 4934 |
| 4 | 1 | 71.0 | 94.0 | 27 / 35 | 5236 |
| 5 | 1 | 71.0 | 94.0 | 25 / 35 | 5323 |
| 6 | 1 | 68.6 | 88.9 | 22 / 35 | 4420 |
| 7 | 1 | 72.0 | 96.8 | 29 / 35 | 5285 |
| 8 | 1 | 69.9 | 90.8 | 24 / 35 | 5079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 51 | 88% |
| bzdp.Pansy 2.1 | 49 | 86% |
| bvh.micro.Freya 0.3 | 48 | 88% |
| mz.Cork 0.1 | 36 | 89% |
| bvh.mini.Fenrir 0.39 | 24 | 92% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 8 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 31% | 67 |
| bzdp.Pansy 2.1 | 13 | 17% | 55 |
| bvh.micro.Freya 0.3 | 13 | 17% | 45 |
| mz.Cork 0.1 | 11 | 15% | 51 |
| bvh.mini.Fenrir 0.39 | 9 | 12% | 25 |
| m3thos.Eva02 0.7.1 | 5 | 7% | 30 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 1 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 271 rounds): 196860 melee ticks, 65788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 95 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 2.

Targeting waves (271 rounds): 68695 sent, 62831 reached their opponent, 14337 virtual hits (22.8% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 8 battles (53.9 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.3 | 196 / 280 | 2.32 | 18.2% | 40101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 196 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.2% | 17 |
| germ.TheMind .2 | 3.6 | 10.2% | 13 |
| EBBU.Sim2 1.02 | 4.4 | 9.9% | 6 |
| agrach.Dalek 1.0 | 5.9 | 9.1% | 14 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.0% | 10 |
| lmk.ACPFinal 0.1 | 7.1 | 8.5% | 12 |
| mb.Beast 0.1 | 7.6 | 8.4% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 7.6 | 8.3% | 1 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 85.1 | 25 / 35 | 4706 |
| 2 | 1 | 68.0 | 89.2 | 26 / 35 | 5206 |
| 3 | 1 | 67.6 | 87.0 | 25 / 35 | 5174 |
| 4 | 1 | 65.7 | 82.9 | 24 / 35 | 4476 |
| 5 | 1 | 65.2 | 81.0 | 22 / 35 | 4741 |
| 6 | 1 | 65.0 | 77.8 | 19 / 35 | 5184 |
| 7 | 1 | 67.5 | 86.7 | 26 / 35 | 5148 |
| 8 | 1 | 69.6 | 93.0 | 29 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 31 | 90% |
| EBBU.Sim2 1.02 | 31 | 97% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 93% |
| agrach.Dalek 1.0 | 26 | 96% |
| mb.Beast 0.1 | 25 | 88% |
| lmk.ACPFinal 0.1 | 24 | 83% |
| skm.Ryubot 1.0 | 21 | 100% |
| germ.TheMind .2 | 21 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 88 of 280 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 24 | 27% | 30 |
| lmk.ACPFinal 0.1 | 11 | 13% | 30 |
| mb.Beast 0.1 | 11 | 13% | 28 |
| agrach.Dalek 1.0 | 10 | 11% | 43 |
| EBBU.Sim2 1.02 | 9 | 10% | 38 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 8% | 37 |
| germ.TheMind .2 | 5 | 6% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 11 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 130562 melee ticks, 34375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 63 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 44804 sent, 39317 reached their opponent, 13069 virtual hits (33.2% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 473 over 8 battles (59.1 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.7 | 118 / 280 | 2.56 | 16.6% | 31737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 16.6% | 118 |
| justin.Mallais 14.0 | 1.8 | 15.8% | 86 |
| bvh.mini.Freya 0.55 | 3.5 | 12.7% | 19 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.6% | 27 |
| cs.Wren 1.0 | 4.6 | 11.1% | 13 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.2% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.4 | 8.8% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 6.2% | 3 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.5 | 11 / 35 | 4006 |
| 2 | 1 | 67.1 | 86.3 | 18 / 35 | 4072 |
| 3 | 1 | 67.2 | 86.3 | 18 / 35 | 4089 |
| 4 | 1 | 64.8 | 81.6 | 13 / 35 | 3797 |
| 5 | 2 | 64.5 | 79.0 | 14 / 35 | 3753 |
| 6 | 1 | 65.9 | 83.5 | 16 / 35 | 4026 |
| 7 | 1 | 66.3 | 83.5 | 16 / 35 | 4106 |
| 8 | 1 | 64.4 | 78.4 | 12 / 35 | 3888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 55 | 65% |
| bts.mega.Gnarly 1.4 | 42 | 69% |
| bvh.mini.Freya 0.55 | 25 | 52% |
| cs.Wren 1.0 | 21 | 95% |
| kdf.KoulDestroyer 1.0 | 20 | 65% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 166 of 280 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 30% | 90 |
| bvh.mini.Freya 0.55 | 35 | 21% | 49 |
| bts.mega.Gnarly 1.4 | 32 | 19% | 59 |
| kdf.KoulDestroyer 1.0 | 18 | 11% | 25 |
| cs.Wren 1.0 | 16 | 10% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 2% | 10 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 4 |
| bzdp.BoxCar 2.0 | 3 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 189334 melee ticks, 46624 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 47 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 62955 sent, 56639 reached their opponent, 13160 virtual hits (23.2% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1043 over 8 battles (130.4 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.4 | 131 / 280 | 2.31 | 17.6% | 36475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.6% | 131 |
| bvh.fry.Freya 0.82 | 2.1 | 14.9% | 27 |
| az.Ololobot 0.2.4 | 3.0 | 13.7% | 85 |
| catcat20.Lambda 0.024 | 3.9 | 12.1% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.2% | 2 |
| gimp.GimpBot 0.1 | 6.1 | 8.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 7.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.4% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 16 / 35 | 4514 |
| 2 | 1 | 68.0 | 88.9 | 18 / 35 | 4852 |
| 3 | 1 | 68.3 | 88.3 | 20 / 35 | 4798 |
| 4 | 1 | 67.5 | 87.0 | 19 / 35 | 4756 |
| 5 | 1 | 65.6 | 82.5 | 12 / 35 | 4391 |
| 6 | 1 | 66.2 | 82.5 | 16 / 35 | 4684 |
| 7 | 1 | 66.8 | 87.0 | 17 / 35 | 4237 |
| 8 | 1 | 65.2 | 81.6 | 13 / 35 | 4243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 63 | 83% |
| az.Ololobot 0.2.4 | 61 | 57% |
| catcat20.Lambda 0.024 | 44 | 66% |
| gimp.GimpBot 0.1 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 53 | 33% | 96 |
| az.Ololobot 0.2.4 | 49 | 31% | 88 |
| catcat20.Lambda 0.024 | 34 | 21% | 57 |
| gimp.GimpBot 0.1 | 5 | 3% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5 | 3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 3 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 2 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 223241 melee ticks, 62537 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 45 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 72236 sent, 66259 reached their opponent, 12965 virtual hits (19.6% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 8 battles (31.8 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.3 | 179 / 280 | 1.78 | 19.5% | 37205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 179 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.9% | 20 |
| mz.AntiGrav 1.0 | 4.0 | 11.5% | 18 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.1% | 5 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 6 |
| stelo.Randomness 1.0 | 6.5 | 9.1% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.4% | 1 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.7 | 21 / 35 | 4729 |
| 2 | 1 | 69.5 | 90.5 | 20 / 35 | 4781 |
| 3 | 1 | 71.0 | 95.2 | 28 / 35 | 4868 |
| 4 | 1 | 68.3 | 87.0 | 20 / 35 | 4259 |
| 5 | 1 | 69.7 | 89.2 | 21 / 35 | 4800 |
| 6 | 1 | 69.3 | 90.8 | 21 / 35 | 4553 |
| 7 | 1 | 70.8 | 94.0 | 27 / 35 | 4875 |
| 8 | 1 | 69.1 | 91.1 | 21 / 35 | 4340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 90 | 80% |
| kano.gamma.KanoGamma 1.8 | 53 | 77% |
| mz.AntiGrav 1.0 | 35 | 89% |
| Polkwane.SmashMelee 1.0 | 18 | 89% |
| stelo.Randomness 1.0 | 15 | 60% |
| alpha.BlackIce 1.0 | 9 | 78% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 103 of 280 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 41 | 40% | 95 |
| kano.gamma.KanoGamma 1.8 | 22 | 21% | 73 |
| mz.AntiGrav 1.0 | 12 | 12% | 35 |
| stelo.Randomness 1.0 | 11 | 11% | 30 |
| Polkwane.SmashMelee 1.0 | 8 | 8% | 24 |
| alpha.BlackIce 1.0 | 4 | 4% | 14 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 5 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 202042 melee ticks, 58332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 511 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 256 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 1.

Targeting waves (268 rounds): 67766 sent, 61640 reached their opponent, 13771 virtual hits (22.3% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 670 over 8 battles (83.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.8 | 127 / 280 | 2.28 | 17.2% | 30251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.2% | 127 |
| eem.EvBotNG v12.8 | 1.8 | 15.7% | 101 |
| ary.Swarm 1.1 | 3.3 | 13.3% | 15 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.8% | 19 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.3% | 13 |
| shrub.Silver v048 | 6.0 | 8.9% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.4 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.6 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 86.0 | 15 / 35 | 3605 |
| 2 | 1 | 66.6 | 84.8 | 16 / 35 | 3685 |
| 3 | 2 | 64.8 | 81.0 | 13 / 35 | 3517 |
| 4 | 1 | 67.2 | 86.7 | 16 / 35 | 3757 |
| 5 | 1 | 68.2 | 87.6 | 17 / 35 | 4100 |
| 6 | 2 | 66.9 | 85.4 | 15 / 35 | 3845 |
| 7 | 1 | 67.8 | 86.7 | 20 / 35 | 4075 |
| 8 | 1 | 67.2 | 88.3 | 15 / 35 | 3667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 102 | 44% |
| lessonz.robocode.Oz 0.5.0 | 42 | 81% |
| ary.Swarm 1.1 | 30 | 87% |
| simonton.nano.MeleeSeed 1.8 | 16 | 100% |
| shrub.Silver v048 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 82 | 52% | 129 |
| ary.Swarm 1.1 | 30 | 19% | 49 |
| lessonz.robocode.Oz 0.5.0 | 17 | 11% | 43 |
| simonton.nano.MeleeSeed 1.8 | 11 | 7% | 28 |
| shrub.Silver v048 | 9 | 6% | 17 |
| zyx.nano.Ant 1.1 | 2 | 1% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 210258 melee ticks, 64567 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 74 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 70904 sent, 64689 reached their opponent, 10980 virtual hits (17.0% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 382 over 8 battles (47.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.5 | 179 / 280 | 1.76 | 19.6% | 41819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 179 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 52 |
| ara.Shera 0.88 | 3.5 | 13.3% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.7% | 13 |
| amz.NanoClone 1.41 | 5.3 | 9.0% | 1 |
| dsw.StaticD 1.0 | 6.1 | 6.9% | 0 |
| maribo.IotaCT 1.1 | 7.1 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.2 | 20 / 35 | 5255 |
| 2 | 1 | 71.0 | 94.6 | 26 / 35 | 5522 |
| 3 | 1 | 69.7 | 91.4 | 20 / 35 | 5219 |
| 4 | 1 | 68.4 | 87.9 | 19 / 35 | 4840 |
| 5 | 1 | 70.2 | 92.7 | 22 / 35 | 5219 |
| 6 | 1 | 69.9 | 91.1 | 23 / 35 | 5188 |
| 7 | 1 | 70.4 | 91.4 | 24 / 35 | 5329 |
| 8 | 1 | 70.7 | 93.7 | 25 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 81% |
| maribo.mini.MiniQuester 0.1 | 49 | 94% |
| ara.Shera 0.88 | 40 | 60% |
| dsw.StaticD 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 103 of 280 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 41% | 130 |
| ara.Shera 0.88 | 41 | 40% | 70 |
| maribo.mini.MiniQuester 0.1 | 13 | 13% | 56 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 18 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 220928 melee ticks, 66239 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 55 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 4.

Targeting waves (269 rounds): 70723 sent, 64942 reached their opponent, 14091 virtual hits (21.7% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 639 over 8 battles (79.9 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.3 | 49 / 280 | 2.95 | 14.9% | 27133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 184 |
| hadur2.Hadur 3.17.1aa | 2.1 | 14.9% | 49 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.7% | 31 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 11.0% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.9% | 5 |
| mz.NanoGod 2.02 | 7.4 | 7.9% | 1 |
| jab.DiamondStealer 5 | 7.6 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 80.3 | 5 / 35 | 3568 |
| 2 | 2 | 64.3 | 76.5 | 8 / 35 | 3418 |
| 3 | 2 | 63.9 | 77.8 | 4 / 35 | 3273 |
| 4 | 2 | 65.5 | 81.9 | 7 / 35 | 3383 |
| 5 | 2 | 63.2 | 76.2 | 2 / 35 | 3420 |
| 6 | 3 | 63.9 | 75.9 | 7 / 35 | 3217 |
| 7 | 2 | 65.5 | 80.6 | 9 / 35 | 3502 |
| 8 | 2 | 64.0 | 77.5 | 7 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 19% |
| brainfade.melee.Dusk 0.44 | 24 | 50% |
| dummy.micro.Sparrow 2.5 | 9 | 89% |
| Krabb.akim2.Akim2 1.1b | 7 | 43% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 125 | 53% | 148 |
| brainfade.melee.Dusk 0.44 | 40 | 17% | 48 |
| dummy.micro.Sparrow 2.5 | 23 | 10% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 9% | 28 |
| Krabb.akim2.Akim2 1.1b | 11 | 5% | 12 |
| mz.NanoGod 2.02 | 10 | 4% | 11 |
| jab.DiamondStealer 5 | 1 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 208423 melee ticks, 61291 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 31 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 68121 sent, 61956 reached their opponent, 11047 virtual hits (17.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 8 battles (61.9 per battle, most in one battle 242). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.9 | 184 / 280 | 1.82 | 19.8% | 41099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.8% | 184 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.9% | 32 |
| stelo.Liblix 0.3.1 | 2.5 | 15.4% | 54 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.4 | 9.8% | 2 |
| jwirde.Gort 2.0 | 5.1 | 9.0% | 5 |
| wompi.Quokka 1.6 | 6.0 | 8.2% | 1 |
| stf.PanzerGeneral 0.1 | 7.1 | 7.1% | 1 |
| disan.Chair 2.2.0 | 7.4 | 7.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.6 | 23 / 35 | 5295 |
| 2 | 1 | 68.5 | 86.0 | 20 / 35 | 4784 |
| 3 | 1 | 70.4 | 92.1 | 23 / 35 | 5402 |
| 4 | 1 | 70.7 | 92.7 | 19 / 35 | 5459 |
| 5 | 1 | 70.6 | 93.3 | 25 / 35 | 5102 |
| 6 | 1 | 70.1 | 91.7 | 24 / 35 | 5048 |
| 7 | 1 | 69.6 | 89.8 | 25 / 35 | 4961 |
| 8 | 1 | 70.3 | 93.0 | 25 / 35 | 5048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 100 | 73% |
| tzu.TheArtOfWar 1.2 | 90 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 93% |
| jwirde.Gort 2.0 | 10 | 90% |
| disan.Chair 2.2.0 | 8 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 40% | 112 |
| tzu.TheArtOfWar 1.2 | 31 | 31% | 96 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 9% | 22 |
| wompi.Quokka 1.6 | 6 | 6% | 10 |
| jwirde.Gort 2.0 | 5 | 5% | 21 |
| disan.Chair 2.2.0 | 4 | 4% | 8 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 211207 melee ticks, 64996 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 48 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 73822 sent, 67767 reached their opponent, 15688 virtual hits (23.1% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 8 battles (88.6 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.6 | 127 / 280 | 2.11 | 19.0% | 40381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.0% | 127 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.6% | 113 |
| jje.BagPuss 1.2 | 2.9 | 11.9% | 15 |
| myl.nano.Graviton 1.10 | 4.5 | 10.7% | 4 |
| sul.Lunar 1.1 | 4.9 | 10.3% | 13 |
| hvilela.HVilela 0.9 | 6.6 | 8.5% | 0 |
| fm.claire 1.7 | 7.0 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.1% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.3% | 4 |
| abud.ThirdRobo 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.7 | 12 / 35 | 4718 |
| 2 | 1 | 67.6 | 87.3 | 14 / 35 | 4723 |
| 3 | 1 | 69.3 | 87.0 | 20 / 35 | 5360 |
| 4 | 1 | 69.5 | 89.8 | 16 / 35 | 5507 |
| 5 | 1 | 69.1 | 91.4 | 16 / 35 | 5071 |
| 6 | 1 | 67.9 | 86.7 | 16 / 35 | 4942 |
| 7 | 1 | 68.1 | 88.9 | 17 / 35 | 4611 |
| 8 | 1 | 69.5 | 90.2 | 16 / 35 | 5449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 126 | 44% |
| jje.BagPuss 1.2 | 31 | 71% |
| sul.Lunar 1.1 | 17 | 76% |
| myl.nano.Graviton 1.10 | 16 | 81% |
| wit.Deep7 2.0 | 11 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 158 of 280 rounds, at a mean tick of 1639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 74 | 47% | 0 |
| jje.BagPuss 1.2 | 32 | 20% | 94 |
| sul.Lunar 1.1 | 15 | 9% | 57 |
| myl.nano.Graviton 1.10 | 11 | 7% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 6% | 29 |
| fm.claire 1.7 | 8 | 5% | 21 |
| hvilela.HVilela 0.9 | 2 | 1% | 15 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 271842 melee ticks, 138754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 64 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 84345 sent, 78397 reached their opponent, 13187 virtual hits (16.8% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 755 over 8 battles (94.4 per battle, most in one battle 225). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.2 | 85 / 280 | 2.51 | 16.1% | 30820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 17.1% | 81 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 101 |
| hadur2.Hadur 3.17.1aa | 2.5 | 16.1% | 85 |
| mz.MicroSheep 1.0 | 4.8 | 10.2% | 1 |
| cx.Princess 1.0 | 4.9 | 10.2% | 11 |
| sadoner.killer 0.2 | 5.4 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.3 | 16 / 35 | 4224 |
| 2 | 2 | 66.1 | 84.4 | 13 / 35 | 3999 |
| 3 | 3 | 65.4 | 83.5 | 10 / 35 | 3983 |
| 4 | 3 | 62.9 | 75.9 | 6 / 35 | 3738 |
| 5 | 3 | 65.4 | 83.5 | 11 / 35 | 3832 |
| 6 | 2 | 66.2 | 87.0 | 12 / 35 | 3662 |
| 7 | 3 | 64.9 | 81.6 | 8 / 35 | 3837 |
| 8 | 3 | 64.3 | 81.6 | 9 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 90 | 66% |
| rsalesc.melee.Medina 0.4.5 | 51 | 27% |
| cx.Princess 1.0 | 10 | 40% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 201 of 280 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 40% | 134 |
| rsalesc.melee.Medina 0.4.5 | 75 | 37% | 92 |
| cx.Princess 1.0 | 13 | 6% | 17 |
| mz.MicroSheep 1.0 | 10 | 5% | 16 |
| sadoner.killer 0.2 | 8 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| arthord.NanoSatanMelee Beta | 3 | 1% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 209782 melee ticks, 54822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 39 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 62295 sent, 56102 reached their opponent, 9397 virtual hits (16.7% of those reached).

