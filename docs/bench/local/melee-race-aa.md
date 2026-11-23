# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 316 over 10 battles (31.6 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.4 | 85 / 350 | 2.22 | 17.9% | 56835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.1 | 19.3% | 231 |
| hadur117.Hadur 3.24aa | 1.9 | 17.9% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.6 | 11.4% | 6 |
| sgp.JollyNinja 3.53 | 3.7 | 11.3% | 22 |
| mz.MicroGodMelee 1 | 5.3 | 10.0% | 6 |
| lorneswork.Predator 1.0 | 5.4 | 10.1% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 86.0 | 11 / 35 | 5920 |
| 2 | 2 | 68.3 | 86.0 | 8 / 35 | 6003 |
| 3 | 2 | 67.9 | 86.3 | 5 / 35 | 5811 |
| 4 | 2 | 68.2 | 86.3 | 7 / 35 | 5839 |
| 5 | 2 | 65.6 | 80.0 | 6 / 35 | 5061 |
| 6 | 1 | 69.1 | 89.2 | 12 / 35 | 5843 |
| 7 | 2 | 69.2 | 90.2 | 7 / 35 | 6053 |
| 8 | 2 | 67.6 | 86.3 | 9 / 35 | 5267 |
| 9 | 2 | 68.0 | 86.3 | 10 / 35 | 5489 |
| 10 | 2 | 68.5 | 87.3 | 10 / 35 | 5549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 209 | 11% |
| sgp.JollyNinja 3.53 | 32 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| mz.MicroGodMelee 1 | 14 | 86% |
| lorneswork.Predator 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 196 | 74% | 222 |
| sgp.JollyNinja 3.53 | 25 | 9% | 37 |
| lorneswork.Predator 1.0 | 17 | 6% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 5% | 29 |
| adt.Ar2 1.0 | 7 | 3% | 13 |
| mz.MicroGodMelee 1 | 5 | 2% | 17 |
| mym.EdgeStalker 1.0 | 1 | 0% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |

Posture (Hadur's M records, 332 rounds): 222513 melee ticks, 159267 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 81 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 70686 sent, 62547 reached their opponent, 12059 virtual hits (19.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 412 over 10 battles (41.2 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.7 | 189 / 350 | 2.02 | 19.6% | 55353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.6% | 189 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.3% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.5% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 11.2% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.6 | 10.5% | 23 |
| Noran.BitchingElk 0.054 | 6.8 | 7.8% | 21 |
| sch.Simone 0.3d | 7.1 | 7.3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.3% | 3 |
| stelo.PatternRobot 1.0 | 8.9 | 4.8% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 20 / 35 | 5470 |
| 2 | 1 | 69.1 | 87.3 | 16 / 35 | 5209 |
| 3 | 1 | 70.1 | 87.6 | 18 / 35 | 5562 |
| 4 | 1 | 71.4 | 93.0 | 21 / 35 | 5738 |
| 5 | 1 | 68.7 | 85.7 | 20 / 35 | 5154 |
| 6 | 1 | 71.8 | 94.0 | 22 / 35 | 6259 |
| 7 | 1 | 70.4 | 90.8 | 21 / 35 | 5868 |
| 8 | 1 | 68.0 | 82.5 | 16 / 35 | 5333 |
| 9 | 1 | 68.4 | 86.3 | 20 / 35 | 4949 |
| 10 | 1 | 69.9 | 88.9 | 15 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 99 | 54% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 74 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 39 | 82% |
| Noran.BitchingElk 0.054 | 21 | 57% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| sch.Simone 0.3d | 16 | 63% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 163 of 350 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 63 | 39% | 116 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 15% | 92 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 13% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 12% | 28 |
| Noran.BitchingElk 0.054 | 14 | 9% | 25 |
| sch.Simone 0.3d | 13 | 8% | 22 |
| stelo.PatternRobot 1.0 | 4 | 2% | 6 |
| fnc.bandit.Bandit 5.2.0 | 2 | 1% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 332 rounds): 275052 melee ticks, 80428 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 71 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 94704 sent, 86627 reached their opponent, 14036 virtual hits (16.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 348 over 10 battles (34.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.5 | 293 / 350 | 1.58 | 21.3% | 66546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.3% | 293 |
| radnor.DoctorBob 1.42 | 2.4 | 13.7% | 21 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.5% | 13 |
| vuen.Cake 2.51 | 3.4 | 12.7% | 19 |
| urdos.URDOS 1.3 | 5.1 | 9.1% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 1 |
| oa.weak.FlyMk1 0.1 | 7.1 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 8.1 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 29 / 35 | 6404 |
| 2 | 1 | 72.2 | 94.9 | 29 / 35 | 7078 |
| 3 | 1 | 72.3 | 93.7 | 31 / 35 | 6935 |
| 4 | 1 | 71.6 | 94.3 | 29 / 35 | 6453 |
| 5 | 1 | 71.2 | 92.1 | 27 / 35 | 6608 |
| 6 | 1 | 72.8 | 96.5 | 32 / 35 | 6847 |
| 7 | 1 | 72.1 | 96.5 | 30 / 35 | 6597 |
| 8 | 1 | 71.4 | 92.1 | 29 / 35 | 6391 |
| 9 | 1 | 71.2 | 92.7 | 28 / 35 | 6371 |
| 10 | 1 | 71.7 | 92.4 | 29 / 35 | 6862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 117 | 93% |
| radnor.DoctorBob 1.42 | 99 | 98% |
| kawigi.nano.Lib 1.0 | 69 | 97% |
| oa.weak.FlyMk1 0.1 | 8 | 88% |
| urdos.URDOS 1.3 | 6 | 100% |
| adt.Ar1 2.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 59 of 350 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 32% | 103 |
| vuen.Cake 2.51 | 12 | 20% | 111 |
| kawigi.nano.Lib 1.0 | 10 | 17% | 69 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 14% | 10 |
| oa.weak.FlyMk1 0.1 | 4 | 7% | 17 |
| urdos.URDOS 1.3 | 4 | 7% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 8 |
| adt.Ar1 2.1 | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 11 |

Posture (Hadur's M records, 330 rounds): 208938 melee ticks, 69969 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 64 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 62207 sent, 54094 reached their opponent, 13053 virtual hits (24.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 10 battles (20.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.1 | 54 / 350 | 2.25 | 18.1% | 60469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 272 |
| hadur117.Hadur 3.24aa | 2.0 | 18.1% | 54 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 16 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 8 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.6 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.1 | 88.3 | 6 / 35 | 6547 |
| 2 | 2 | 68.7 | 85.1 | 3 / 35 | 6122 |
| 3 | 2 | 69.9 | 86.3 | 7 / 35 | 6490 |
| 4 | 2 | 67.9 | 83.5 | 5 / 35 | 5525 |
| 5 | 2 | 68.7 | 87.0 | 6 / 35 | 5635 |
| 6 | 2 | 68.9 | 87.6 | 5 / 35 | 5904 |
| 7 | 2 | 68.6 | 86.0 | 3 / 35 | 5751 |
| 8 | 2 | 70.2 | 87.9 | 10 / 35 | 6232 |
| 9 | 2 | 67.6 | 82.2 | 3 / 35 | 5612 |
| 10 | 2 | 70.0 | 86.7 | 6 / 35 | 6651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 216 | 9% |
| apc.LeeroyJenkins2 1.0 | 22 | 73% |
| TNT.TNT 0.99.1 | 21 | 62% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 1281. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 231 | 78% | 255 |
| apc.LeeroyJenkins2 1.0 | 31 | 10% | 43 |
| TNT.TNT 0.99.1 | 18 | 6% | 31 |
| josago.Jorgito 0.16 | 7 | 2% | 10 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 309672 melee ticks, 121024 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 73 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 92070 sent, 83860 reached their opponent, 12009 virtual hits (14.3% of those reached).

## Melee bench: F05

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 10 battles (27.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.7 | 62 / 350 | 2.83 | 16.0% | 44383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 16.9% | 100 |
| cb.fire.Firestarter 2.0f | 1.7 | 17.1% | 152 |
| hadur117.Hadur 3.24aa | 2.8 | 16.0% | 62 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 26 |
| ms.Ares 0.19 | 5.4 | 9.3% | 3 |
| axeBots.HataMoto 3.09 | 5.6 | 9.1% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 3.9% | 1 |
| GarmBox.Oranges 1.0 | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 77.8 | 4 / 35 | 4341 |
| 2 | 3 | 63.8 | 74.9 | 4 / 35 | 4219 |
| 3 | 3 | 65.8 | 80.6 | 5 / 35 | 4582 |
| 4 | 3 | 64.3 | 77.1 | 1 / 35 | 4405 |
| 5 | 3 | 65.0 | 81.0 | 6 / 35 | 4032 |
| 6 | 3 | 65.9 | 81.0 | 5 / 35 | 4462 |
| 7 | 3 | 65.1 | 77.5 | 7 / 35 | 4556 |
| 8 | 2 | 67.2 | 82.5 | 10 / 35 | 4973 |
| 9 | 2 | 66.2 | 82.9 | 11 / 35 | 4333 |
| 10 | 3 | 66.4 | 81.6 | 9 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 80 | 48% |
| cb.fire.Firestarter 2.0f | 54 | 9% |
| wompi.Numbat 2.1 | 20 | 70% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 288 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 117 | 41% | 154 |
| cb.fire.Firestarter 2.0f | 90 | 31% | 97 |
| wompi.Numbat 2.1 | 46 | 16% | 57 |
| ms.Ares 0.19 | 17 | 6% | 19 |
| axeBots.HataMoto 3.09 | 13 | 5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

Posture (Hadur's M records, 334 rounds): 253677 melee ticks, 64379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 56 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 76358 sent, 68052 reached their opponent, 11010 virtual hits (16.2% of those reached).

## Melee bench: F06

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 351 over 10 battles (35.1 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 237 / 350 | 1.85 | 20.3% | 57217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.3% | 237 |
| jekl.StoneGhost 0.7 | 2.1 | 14.2% | 29 |
| origin.SleepSiphon 1.7b | 2.9 | 13.3% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.9% | 23 |
| mld.Wisdom 1.0 | 4.8 | 10.3% | 0 |
| gg.Wolverine 2.0 | 6.1 | 8.5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.1% | 6 |
| DBall.NUKE 0.1 | 8.4 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.0 | 22 / 35 | 5451 |
| 2 | 1 | 70.6 | 90.8 | 23 / 35 | 5703 |
| 3 | 1 | 71.4 | 91.4 | 26 / 35 | 5769 |
| 4 | 1 | 71.3 | 89.5 | 23 / 35 | 6224 |
| 5 | 1 | 70.9 | 91.4 | 23 / 35 | 5483 |
| 6 | 1 | 70.6 | 90.5 | 24 / 35 | 5614 |
| 7 | 1 | 70.5 | 90.8 | 20 / 35 | 5621 |
| 8 | 1 | 72.1 | 95.9 | 27 / 35 | 5782 |
| 9 | 1 | 70.3 | 87.0 | 23 / 35 | 5803 |
| 10 | 1 | 71.2 | 91.4 | 26 / 35 | 5767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 113 | 92% |
| origin.SleepSiphon 1.7b | 71 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 49 | 86% |
| gg.Wolverine 2.0 | 20 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 115 of 350 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 38 | 33% | 107 |
| jekl.StoneGhost 0.7 | 30 | 26% | 94 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 18% | 71 |
| mld.Wisdom 1.0 | 10 | 9% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 7% | 23 |
| gg.Wolverine 2.0 | 4 | 3% | 13 |
| DBall.NUKE 0.1 | 3 | 3% | 8 |
| sample.Fire 1.0 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 242787 melee ticks, 68026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 54 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 73087 sent, 65180 reached their opponent, 13451 virtual hits (20.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 241 over 10 battles (24.1 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 93.7 | 221 / 350 | 1.57 | 21.7% | 71543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.7% | 221 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 16.3% | 64 |
| rtk.Tachikoma 1.0 | 2.6 | 15.8% | 44 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.6% | 10 |
| franzor.Lizt 1.3.1 | 5.0 | 10.5% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.0 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 94.0 | 24 / 35 | 7046 |
| 2 | 1 | 73.6 | 94.6 | 25 / 35 | 7236 |
| 3 | 1 | 73.1 | 92.4 | 21 / 35 | 7046 |
| 4 | 1 | 73.1 | 92.7 | 21 / 35 | 6872 |
| 5 | 1 | 73.7 | 94.6 | 24 / 35 | 7096 |
| 6 | 1 | 73.5 | 93.7 | 20 / 35 | 7376 |
| 7 | 1 | 73.9 | 94.6 | 21 / 35 | 7408 |
| 8 | 1 | 74.2 | 95.2 | 25 / 35 | 7374 |
| 9 | 1 | 72.3 | 90.8 | 17 / 35 | 6904 |
| 10 | 1 | 73.6 | 94.0 | 23 / 35 | 7185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 152 | 81% |
| rsalesc.melee.Monk 0.3.6c | 69 | 29% |
| oog.melee.CapuletDroid 1.1 | 53 | 91% |
| franzor.Lizt 1.3.1 | 37 | 78% |

Hadur died in 129 of 350 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 61 | 47% | 114 |
| rtk.Tachikoma 1.0 | 45 | 35% | 154 |
| oog.melee.CapuletDroid 1.1 | 11 | 9% | 67 |
| franzor.Lizt 1.3.1 | 9 | 7% | 3 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 6 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 330 rounds): 295251 melee ticks, 129273 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 64 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 87038 sent, 78922 reached their opponent, 15390 virtual hits (19.5% of those reached).

## Melee bench: F08

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 10 battles (51.1 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.8 | 230 / 350 | 1.73 | 20.1% | 52698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.1% | 230 |
| tm.Yuugao 1.0 | 2.3 | 12.9% | 50 |
| shrub.Vapour v159 | 2.9 | 12.3% | 32 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.5% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 8.7% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.3% | 9 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.2% | 0 |
| SHAM.WOW 1.4 | 9.6 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 19 / 35 | 5068 |
| 2 | 1 | 70.8 | 92.7 | 25 / 35 | 5557 |
| 3 | 1 | 70.4 | 94.6 | 25 / 35 | 5147 |
| 4 | 1 | 69.7 | 91.7 | 20 / 35 | 5125 |
| 5 | 1 | 71.0 | 96.5 | 25 / 35 | 5473 |
| 6 | 1 | 68.1 | 85.7 | 18 / 35 | 4958 |
| 7 | 1 | 71.6 | 95.9 | 29 / 35 | 5493 |
| 8 | 1 | 68.3 | 87.0 | 19 / 35 | 5023 |
| 9 | 1 | 70.1 | 91.7 | 23 / 35 | 5375 |
| 10 | 1 | 71.0 | 94.0 | 27 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 90 | 77% |
| shrub.Vapour v159 | 69 | 72% |
| Krabb.sliNk.Garm 0.9u | 57 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 81% |
| m3thos.Eva00 1.1 | 17 | 88% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 122 of 350 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 34 | 28% | 81 |
| tm.Yuugao 1.0 | 29 | 24% | 100 |
| Krabb.sliNk.Garm 0.9u | 26 | 21% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 45 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 7% | 28 |
| m3thos.Eva00 1.1 | 5 | 4% | 21 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 239607 melee ticks, 74939 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 408 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 109 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 76683 sent, 68541 reached their opponent, 11844 virtual hits (17.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 10 battles (30.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.1 | 99 / 350 | 3.06 | 15.7% | 38695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.8% | 177 |
| hadur117.Hadur 3.24aa | 1.8 | 15.7% | 99 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 33 |
| yagami.Tidus 0.11 | 4.4 | 10.7% | 2 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.1% | 16 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 21 |
| dft.Calliope 5.6 | 6.9 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 68.9 | 7 / 35 | 3629 |
| 2 | 2 | 65.3 | 80.0 | 10 / 35 | 4046 |
| 3 | 1 | 65.0 | 76.5 | 13 / 35 | 4101 |
| 4 | 2 | 63.5 | 73.3 | 7 / 35 | 3904 |
| 5 | 2 | 64.1 | 78.4 | 10 / 35 | 3684 |
| 6 | 2 | 65.0 | 79.7 | 10 / 35 | 3782 |
| 7 | 2 | 63.9 | 74.9 | 10 / 35 | 3911 |
| 8 | 1 | 65.9 | 82.9 | 12 / 35 | 4073 |
| 9 | 2 | 66.2 | 81.9 | 13 / 35 | 4078 |
| 10 | 2 | 63.0 | 74.9 | 7 / 35 | 3487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 96 | 31% |
| kc.micro.Figment 1.0 | 53 | 87% |
| yagami.Tidus 0.11 | 10 | 100% |
| mc2.enemy.Original 0.9 | 10 | 40% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 114 | 45% | 145 |
| mc2.enemy.Original 0.9 | 36 | 14% | 42 |
| kc.micro.Figment 1.0 | 34 | 14% | 81 |
| yagami.Tidus 0.11 | 25 | 10% | 33 |
| dft.Calliope 5.6 | 12 | 5% | 17 |
| pedersen.Grishnakh 1.0 | 12 | 5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 10 |
| step.nanoPri 1.0 | 5 | 2% | 5 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |

Posture (Hadur's M records, 336 rounds): 245237 melee ticks, 56801 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 54 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 1.

Targeting waves (336 rounds): 78491 sent, 70580 reached their opponent, 10018 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 10 battles (43.8 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.1 | 276 / 350 | 1.44 | 21.2% | 61430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.2% | 276 |
| DTF.Kludgy 1.2b | 2.4 | 14.0% | 31 |
| ne.Chimera 1.2 | 2.6 | 13.6% | 20 |
| ejb.Polaris 1.0.1 | 4.0 | 12.3% | 14 |
| tvv.micro.Antares 1.1.1 | 5.4 | 9.9% | 3 |
| vStar.RAFzilla 2.15 | 5.6 | 9.8% | 4 |
| sam.Samspin 1.0 | 7.6 | 5.2% | 0 |
| kurios.DOSexe .9b | 8.1 | 5.1% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.6% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.2 | 24 / 35 | 6230 |
| 2 | 1 | 70.8 | 94.0 | 26 / 35 | 5793 |
| 3 | 1 | 73.0 | 98.4 | 31 / 35 | 6454 |
| 4 | 1 | 72.0 | 96.2 | 26 / 35 | 6245 |
| 5 | 1 | 73.1 | 97.8 | 34 / 35 | 6366 |
| 6 | 1 | 70.5 | 91.1 | 28 / 35 | 5545 |
| 7 | 1 | 72.0 | 95.6 | 28 / 35 | 6209 |
| 8 | 1 | 72.6 | 96.8 | 28 / 35 | 6429 |
| 9 | 1 | 70.5 | 90.2 | 24 / 35 | 5745 |
| 10 | 1 | 72.3 | 95.9 | 27 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 107 | 83% |
| ne.Chimera 1.2 | 76 | 84% |
| ejb.Polaris 1.0.1 | 73 | 92% |
| vStar.RAFzilla 2.15 | 31 | 87% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| donjezza.Muncho 1.0 | 9 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 74 of 350 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 38% | 109 |
| ne.Chimera 1.2 | 19 | 26% | 83 |
| ejb.Polaris 1.0.1 | 9 | 12% | 73 |
| vStar.RAFzilla 2.15 | 6 | 8% | 31 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 22 |
| donjezza.Muncho 1.0 | 3 | 4% | 8 |
| sam.Samspin 1.0 | 3 | 4% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 6 |
| kurios.DOSexe .9b | 0 | 0% | 12 |

Posture (Hadur's M records, 330 rounds): 232352 melee ticks, 89178 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 71 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 3.

Targeting waves (330 rounds): 73982 sent, 66019 reached their opponent, 11868 virtual hits (18.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 10 battles (39.7 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.4 | 132 / 350 | 2.50 | 17.2% | 42473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.3 | 17.2% | 132 |
| rz.Aleph 0.34 | 1.7 | 16.6% | 121 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.0% | 27 |
| djc.DynaBot 0.1.1 | 4.2 | 10.4% | 26 |
| rdt199.Warlord 0.73 | 5.4 | 9.1% | 18 |
| br2.MobyDickBot 1.6 | 6.2 | 8.6% | 12 |
| uji.YellohFellah 1.0 | 6.8 | 8.0% | 15 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 83.2 | 12 / 35 | 3950 |
| 2 | 1 | 65.6 | 82.5 | 14 / 35 | 4034 |
| 3 | 1 | 68.0 | 87.6 | 14 / 35 | 4746 |
| 4 | 1 | 66.9 | 85.1 | 14 / 35 | 4429 |
| 5 | 2 | 66.5 | 85.7 | 12 / 35 | 4073 |
| 6 | 1 | 66.7 | 83.8 | 12 / 35 | 4550 |
| 7 | 1 | 67.7 | 88.6 | 17 / 35 | 4354 |
| 8 | 2 | 64.7 | 78.4 | 12 / 35 | 4266 |
| 9 | 1 | 64.9 | 79.4 | 15 / 35 | 4052 |
| 10 | 1 | 64.3 | 79.4 | 10 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 109 | 46% |
| djc.DynaBot 0.1.1 | 35 | 63% |
| cx.mini.Nimrod 0.55 | 28 | 68% |
| rdt199.Warlord 0.73 | 22 | 68% |
| uji.YellohFellah 1.0 | 21 | 76% |
| br2.MobyDickBot 1.6 | 11 | 64% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 100 | 46% | 159 |
| cx.mini.Nimrod 0.55 | 30 | 14% | 51 |
| rdt199.Warlord 0.73 | 26 | 12% | 40 |
| djc.DynaBot 0.1.1 | 19 | 9% | 36 |
| uji.YellohFellah 1.0 | 16 | 7% | 22 |
| br2.MobyDickBot 1.6 | 15 | 7% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 9 |
| KiraNL.Chupacabra 0.4 | 4 | 2% | 9 |
| stelo.MirrorNano 1.3 | 3 | 1% | 3 |

Posture (Hadur's M records, 335 rounds): 259833 melee ticks, 68346 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 59 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 83377 sent, 74962 reached their opponent, 9682 virtual hits (12.9% of those reached).

## Melee bench: F12

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 10 battles (39.7 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 196 / 350 | 2.23 | 18.3% | 42030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 18.3% | 196 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 45 |
| nat.PallasHawk 1.0 | 2.9 | 13.3% | 59 |
| darkcanuck.Leon 1.01 | 3.7 | 12.6% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 15 |
| jrm.Test0 1.0 | 5.9 | 8.2% | 3 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.2% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.3% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 22 / 35 | 4407 |
| 2 | 1 | 68.0 | 89.5 | 19 / 35 | 3992 |
| 3 | 1 | 68.9 | 90.2 | 22 / 35 | 4331 |
| 4 | 1 | 68.6 | 88.9 | 24 / 35 | 4291 |
| 5 | 1 | 66.0 | 81.0 | 16 / 35 | 3990 |
| 6 | 1 | 67.5 | 86.7 | 17 / 35 | 4118 |
| 7 | 1 | 66.6 | 82.5 | 20 / 35 | 3853 |
| 8 | 1 | 66.7 | 82.2 | 18 / 35 | 4262 |
| 9 | 1 | 67.4 | 82.5 | 18 / 35 | 4431 |
| 10 | 1 | 68.4 | 89.2 | 20 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 74 | 61% |
| darkcanuck.Leon 1.01 | 65 | 89% |
| bts.wiki.RipCurl 0.9b | 62 | 76% |
| brainfade.melee.Genghis 0.36 | 25 | 84% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| jaybot.bots.Oddball 4.0 | 8 | 100% |
| jrm.Test0 1.0 | 6 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 155 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 49 | 32% | 100 |
| bts.wiki.RipCurl 0.9b | 32 | 21% | 63 |
| darkcanuck.Leon 1.01 | 22 | 14% | 87 |
| brainfade.melee.Genghis 0.36 | 18 | 12% | 31 |
| jrm.Test0 1.0 | 18 | 12% | 26 |
| jaybot.bots.Oddball 4.0 | 6 | 4% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 17 |
| jp.Perpy 16.0 | 3 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 1% | 7 |

Posture (Hadur's M records, 334 rounds): 215311 melee ticks, 63099 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 47 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 5.

Targeting waves (334 rounds): 72297 sent, 63910 reached their opponent, 10347 virtual hits (16.2% of those reached).

## Melee bench: F13

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 323 over 10 battles (32.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.3 | 112 / 350 | 2.51 | 16.7% | 45838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.9 | 16.4% | 130 |
| hadur117.Hadur 3.24aa | 1.9 | 16.7% | 112 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 65 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.8% | 16 |
| shinh.Entangled 0.3 | 4.7 | 11.6% | 25 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 2 |
| stelo.Wang 1.0 | 7.1 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.6 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.2 | 81.0 | 10 / 35 | 4768 |
| 2 | 1 | 67.8 | 88.9 | 12 / 35 | 4667 |
| 3 | 2 | 66.6 | 81.6 | 14 / 35 | 4517 |
| 4 | 2 | 66.1 | 83.2 | 9 / 35 | 4687 |
| 5 | 1 | 68.1 | 86.3 | 17 / 35 | 4811 |
| 6 | 2 | 65.6 | 81.9 | 8 / 35 | 4420 |
| 7 | 2 | 66.8 | 83.2 | 11 / 35 | 4776 |
| 8 | 3 | 63.6 | 77.5 | 6 / 35 | 3939 |
| 9 | 2 | 66.1 | 81.3 | 10 / 35 | 4507 |
| 10 | 1 | 67.9 | 87.9 | 15 / 35 | 4746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 88 | 69% |
| mn.Combat 3.25.0 | 83 | 24% |
| shinh.Entangled 0.3 | 30 | 67% |
| gh.micro.Gruweltje 0.7 | 14 | 64% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 238 of 350 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 92 | 39% | 121 |
| ags.Glacier 0.2.11 | 70 | 29% | 115 |
| shinh.Entangled 0.3 | 39 | 16% | 61 |
| gh.micro.Gruweltje 0.7 | 23 | 10% | 30 |
| stelo.Wang 1.0 | 9 | 4% | 12 |
| apc.Colossus2 0.17 | 3 | 1% | 7 |
| maribo.FollowFire 1 | 2 | 1% | 1 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 333 rounds): 243861 melee ticks, 75397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 118 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 118 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 69896 sent, 61385 reached their opponent, 9243 virtual hits (15.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.24aa against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 10 battles (36.0 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 96.8 | 317 / 350 | 1.25 | 24.5% | 63994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 24.5% | 317 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.3% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 4.1 | 10.8% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 4.4 | 10.8% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 4.4 | 10.6% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.1 | 9.0% | 12 |
| pa.Improved 1.0 | 8.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.6 | 30 / 35 | 6002 |
| 2 | 1 | 72.7 | 94.3 | 32 / 35 | 6110 |
| 3 | 1 | 72.8 | 95.4 | 31 / 35 | 6472 |
| 4 | 1 | 73.8 | 97.9 | 32 / 35 | 6518 |
| 5 | 1 | 74.3 | 99.3 | 34 / 35 | 6804 |
| 6 | 1 | 73.0 | 96.8 | 30 / 35 | 6208 |
| 7 | 1 | 73.6 | 98.2 | 34 / 35 | 6379 |
| 8 | 1 | 73.1 | 98.6 | 32 / 35 | 6276 |
| 9 | 1 | 73.7 | 95.7 | 30 / 35 | 6867 |
| 10 | 1 | 73.4 | 98.6 | 32 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 194 | 97% |
| sanyi.mikrobi.Roberto 1.0 | 45 | 98% |
| sheldor.micro.PointInLineRRAL 1.0 | 29 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 25 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 100% |
| pa.Improved 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |

Hadur died in 34 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 44% | 175 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 24% | 49 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 9% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 9% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 6% | 58 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 6% | 18 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 330 rounds): 202079 melee ticks, 86067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 66 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 58922 sent, 51932 reached their opponent, 12720 virtual hits (24.5% of those reached).

## Melee bench: F15

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 10 battles (42.0 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.9 | 196 / 350 | 2.09 | 19.5% | 55783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.5% | 196 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.3% | 25 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 19 |
| emp.Yngwie 1.11 | 3.4 | 12.7% | 77 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.2% | 10 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 18 |
| lambdaxy.TBot 0.1 | 7.1 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.9 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 4.8% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 16 / 35 | 5168 |
| 2 | 1 | 70.1 | 88.9 | 21 / 35 | 5769 |
| 3 | 1 | 70.5 | 89.5 | 22 / 35 | 5780 |
| 4 | 1 | 68.6 | 84.4 | 16 / 35 | 5429 |
| 5 | 1 | 68.7 | 87.0 | 19 / 35 | 5278 |
| 6 | 1 | 71.3 | 93.7 | 24 / 35 | 5837 |
| 7 | 1 | 70.5 | 89.8 | 22 / 35 | 5815 |
| 8 | 1 | 68.5 | 84.8 | 15 / 35 | 5479 |
| 9 | 1 | 68.8 | 86.7 | 19 / 35 | 5504 |
| 10 | 1 | 70.7 | 89.8 | 22 / 35 | 5724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 86 | 53% |
| kawigi.micro.Shiz 1.1 | 56 | 89% |
| mld.DustBunny 3.8 | 56 | 91% |
| kawigi.robot.Girl 1.2 | 27 | 78% |
| cb.nano.Insomnia 1.0 | 23 | 78% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| lambdaxy.TBot 0.1 | 3 | 100% |

Hadur died in 154 of 350 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 64 | 42% | 120 |
| cb.nano.Insomnia 1.0 | 22 | 14% | 32 |
| mld.DustBunny 3.8 | 21 | 14% | 72 |
| kawigi.robot.Girl 1.2 | 18 | 12% | 29 |
| kawigi.micro.Shiz 1.1 | 13 | 8% | 53 |
| divineomega.TrialBot 0.003 | 9 | 6% | 26 |
| Grystrion.TrackerWO 1.0 | 5 | 3% | 9 |
| lambdaxy.TBot 0.1 | 2 | 1% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 333 rounds): 261193 melee ticks, 83039 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 319 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 319 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 84870 sent, 76674 reached their opponent, 11944 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 402 over 10 battles (40.2 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.0 | 230 / 350 | 1.63 | 21.1% | 62371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.1% | 230 |
| gh.Griezel 0.5.2 | 2.0 | 15.9% | 73 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.1% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.1% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.4% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.1 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 25 / 35 | 6158 |
| 2 | 1 | 71.6 | 93.0 | 24 / 35 | 5815 |
| 3 | 1 | 71.8 | 93.0 | 21 / 35 | 6341 |
| 4 | 1 | 72.4 | 94.6 | 23 / 35 | 6526 |
| 5 | 1 | 73.4 | 96.8 | 26 / 35 | 6630 |
| 6 | 1 | 71.8 | 92.7 | 23 / 35 | 6335 |
| 7 | 1 | 70.6 | 88.9 | 20 / 35 | 5995 |
| 8 | 1 | 71.4 | 91.7 | 21 / 35 | 5952 |
| 9 | 1 | 72.7 | 94.3 | 25 / 35 | 6500 |
| 10 | 1 | 71.2 | 92.1 | 22 / 35 | 6119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 160 | 69% |
| techdude.forest.FlamingForest 1.1 | 78 | 72% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 37 | 92% |
| bvh.fnr.Fenrir 0.36l | 14 | 93% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 121 of 350 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 58 | 48% | 156 |
| techdude.forest.FlamingForest 1.1 | 31 | 26% | 80 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 13% | 49 |
| bvh.fnr.Fenrir 0.36l | 7 | 6% | 15 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 18 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 14 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 10 |
| asd.Cthulhu 1.3 | 0 | 0% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 292271 melee ticks, 124894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 35 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 2.

Targeting waves (333 rounds): 91616 sent, 83762 reached their opponent, 13545 virtual hits (16.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 391 over 10 battles (39.1 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.6 | 209 / 350 | 1.94 | 20.3% | 61844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.3% | 209 |
| et.Predator 1.8 | 2.6 | 13.6% | 26 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.6% | 55 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 57 |
| ahf.NanoAndrew .4 | 5.4 | 9.7% | 1 |
| nic.Nicator 2.4 | 6.1 | 8.6% | 2 |
| maribo.melee.BMV 0.1 | 6.5 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.8 | 20 / 35 | 6001 |
| 2 | 1 | 70.4 | 91.4 | 21 / 35 | 5603 |
| 3 | 1 | 69.1 | 84.8 | 18 / 35 | 5998 |
| 4 | 1 | 72.2 | 93.3 | 23 / 35 | 6597 |
| 5 | 1 | 71.8 | 92.4 | 24 / 35 | 6413 |
| 6 | 1 | 71.4 | 91.7 | 19 / 35 | 6305 |
| 7 | 1 | 70.9 | 87.6 | 21 / 35 | 6238 |
| 8 | 1 | 70.7 | 87.3 | 24 / 35 | 6137 |
| 9 | 1 | 69.6 | 85.1 | 17 / 35 | 6110 |
| 10 | 1 | 71.8 | 92.1 | 22 / 35 | 6442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 99 | 83% |
| et.Predator 1.8 | 87 | 86% |
| cx.BlestPain 1.41 | 62 | 44% |
| ahf.NanoAndrew .4 | 14 | 100% |
| nic.Nicator 2.4 | 4 | 75% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 141 of 350 rounds, at a mean tick of 1112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 54 | 38% | 92 |
| oog.melee.Mercutio 1.0 | 32 | 23% | 99 |
| et.Predator 1.8 | 21 | 15% | 83 |
| ahf.NanoAndrew .4 | 17 | 12% | 35 |
| maribo.melee.BMV 0.1 | 8 | 6% | 13 |
| nic.Nicator 2.4 | 4 | 3% | 13 |
| tex.Longbot 0.4 | 4 | 3% | 5 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 7 |

Posture (Hadur's M records, 332 rounds): 264500 melee ticks, 107233 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 42 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 85707 sent, 77589 reached their opponent, 15177 virtual hits (19.6% of those reached).

## Melee bench: F18

hadur117.Hadur 3.24aa against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 530 over 10 battles (53.0 per battle, most in one battle 71). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.5 | 266 / 350 | 1.60 | 22.9% | 52098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 22.9% | 266 |
| agd.Mooserwirt2 2.7 | 2.4 | 13.7% | 32 |
| uji.DBH 1.1 | 2.7 | 13.3% | 17 |
| sigterm.Sigterm 1.0 | 4.8 | 10.2% | 16 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.7% | 8 |
| ratosh.Nobo 0.21 | 5.5 | 9.4% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 8.3% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.3% | 3 |
| stelo.WangRobot 1.0 | 8.5 | 6.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.8 | 29 / 35 | 5425 |
| 2 | 1 | 70.7 | 93.2 | 26 / 35 | 5104 |
| 3 | 1 | 72.5 | 96.8 | 29 / 35 | 5439 |
| 4 | 1 | 70.8 | 90.7 | 26 / 35 | 5356 |
| 5 | 1 | 69.5 | 89.6 | 24 / 35 | 4809 |
| 6 | 1 | 71.3 | 92.1 | 26 / 35 | 5431 |
| 7 | 1 | 68.9 | 86.8 | 25 / 35 | 4745 |
| 8 | 1 | 71.6 | 95.4 | 29 / 35 | 5283 |
| 9 | 1 | 71.3 | 92.9 | 26 / 35 | 5329 |
| 10 | 1 | 70.4 | 90.4 | 26 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 95 | 89% |
| agd.Mooserwirt2 2.7 | 82 | 87% |
| sigterm.Sigterm 1.0 | 52 | 88% |
| ratosh.Nobo 0.21 | 19 | 95% |
| spinnercat.Robovirus 2.718 | 18 | 78% |
| stelo.WangRobot 1.0 | 16 | 94% |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 83% |

Hadur died in 84 of 350 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 29 | 35% | 94 |
| uji.DBH 1.1 | 19 | 23% | 86 |
| sigterm.Sigterm 1.0 | 14 | 17% | 49 |
| ratosh.Nobo 0.21 | 10 | 12% | 36 |
| spinnercat.Robovirus 2.718 | 8 | 10% | 32 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 7 |
| stelo.WangRobot 1.0 | 1 | 1% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 19 |

Posture (Hadur's M records, 334 rounds): 212888 melee ticks, 81556 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 66 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 1.

Targeting waves (334 rounds): 65376 sent, 58103 reached their opponent, 12833 virtual hits (22.1% of those reached).

## Melee bench: F19

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 382 over 10 battles (38.2 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.4 | 327 / 350 | 1.15 | 22.9% | 66172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 22.9% | 327 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 11 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.8% | 5 |
| mld.Infinity 2.2 | 3.8 | 11.6% | 4 |
| erdnis.Rover 0.3 | 4.6 | 10.3% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 2 |
| mbh.Mbh 0.1 | 6.9 | 7.3% | 0 |
| pac.ABC 2.1 | 7.9 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.3 | 30 / 35 | 6137 |
| 2 | 1 | 74.1 | 98.4 | 31 / 35 | 6932 |
| 3 | 1 | 74.3 | 99.4 | 33 / 35 | 6617 |
| 4 | 1 | 74.3 | 98.7 | 33 / 35 | 6889 |
| 5 | 1 | 74.1 | 98.1 | 33 / 35 | 6831 |
| 6 | 1 | 74.7 | 100.0 | 35 / 35 | 6727 |
| 7 | 1 | 74.4 | 99.7 | 34 / 35 | 6764 |
| 8 | 1 | 73.6 | 98.7 | 32 / 35 | 6486 |
| 9 | 1 | 73.7 | 98.4 | 32 / 35 | 6406 |
| 10 | 1 | 74.2 | 99.0 | 34 / 35 | 6383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 187 | 98% |
| krillr.mini.JointStrike 2.0.0 | 47 | 89% |
| mld.Infinity 2.2 | 45 | 96% |
| erdnis.Rover 0.3 | 24 | 100% |
| pac.ABC 2.1 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 11 | 91% |
| mbh.Mbh 0.1 | 10 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 25 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 11 | 44% | 74 |
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 28% | 99 |
| erdnis.Rover 0.3 | 3 | 12% | 40 |
| mld.Infinity 2.2 | 2 | 8% | 49 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 28 |
| pac.ABC 2.1 | 1 | 4% | 20 |
| mbh.Mbh 0.1 | 0 | 0% | 20 |
| pbg.R2D2 1.0 | 0 | 0% | 13 |

Posture (Hadur's M records, 331 rounds): 207577 melee ticks, 73024 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 65 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 68144 sent, 60240 reached their opponent, 13353 virtual hits (22.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 297 over 10 battles (29.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.0 | 247 / 350 | 1.54 | 21.6% | 64416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.6% | 247 |
| trm.Wrekt 1.1.6.f | 2.1 | 15.4% | 48 |
| catcat20.Rabbit 0.001 | 3.7 | 11.2% | 42 |
| fwb.Nine 1.0.1 | 4.0 | 10.4% | 7 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.4% | 4 |
| bayen.nut.Squirrel 1.615 | 7.4 | 6.9% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.6 | 27 / 35 | 6862 |
| 2 | 1 | 72.2 | 95.2 | 26 / 35 | 6202 |
| 3 | 1 | 73.3 | 96.2 | 27 / 35 | 6807 |
| 4 | 1 | 71.7 | 93.3 | 24 / 35 | 6232 |
| 5 | 1 | 71.6 | 92.1 | 22 / 35 | 6386 |
| 6 | 1 | 71.5 | 94.3 | 23 / 35 | 6129 |
| 7 | 1 | 73.0 | 94.9 | 26 / 35 | 6852 |
| 8 | 1 | 71.7 | 93.0 | 23 / 35 | 6242 |
| 9 | 1 | 72.5 | 95.9 | 26 / 35 | 6275 |
| 10 | 1 | 71.1 | 90.8 | 23 / 35 | 6429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 159 | 83% |
| catcat20.Rabbit 0.001 | 63 | 60% |
| fwb.Nine 1.0.1 | 51 | 98% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| m3thos.mini.Eva01 0.5.5 | 8 | 75% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 105 of 350 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 42 | 40% | 154 |
| catcat20.Rabbit 0.001 | 35 | 33% | 91 |
| fwb.Nine 1.0.1 | 15 | 14% | 40 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 16 |
| ntc.ControlledChaos 1.1.4 | 3 | 3% | 7 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 23 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 268422 melee ticks, 101787 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 72 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 82197 sent, 74083 reached their opponent, 15718 virtual hits (21.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 10 battles (27.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.6 | 237 / 350 | 1.58 | 21.4% | 63413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.4% | 237 |
| eem.EvBot v4.6.16 | 2.1 | 16.2% | 86 |
| dummy.mini.Scimitar 1.01 | 2.9 | 13.9% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 5 |
| eld.Hmm 1.0 | 5.1 | 8.1% | 13 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.2% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.5 | 23 / 35 | 6281 |
| 2 | 1 | 73.0 | 94.6 | 27 / 35 | 6308 |
| 3 | 1 | 72.7 | 95.2 | 25 / 35 | 6440 |
| 4 | 1 | 72.2 | 94.9 | 27 / 35 | 6280 |
| 5 | 1 | 72.4 | 94.3 | 23 / 35 | 6646 |
| 6 | 1 | 71.8 | 94.0 | 21 / 35 | 6044 |
| 7 | 1 | 72.5 | 94.6 | 26 / 35 | 6290 |
| 8 | 1 | 71.7 | 93.3 | 18 / 35 | 6188 |
| 9 | 1 | 71.9 | 92.4 | 22 / 35 | 6386 |
| 10 | 1 | 72.4 | 92.1 | 25 / 35 | 6550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 207 | 71% |
| dummy.mini.Scimitar 1.01 | 49 | 90% |
| cf.RiO.RiOx 4.2.1 | 37 | 95% |
| eld.Hmm 1.0 | 12 | 42% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 117 of 350 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 77 | 66% | 183 |
| dummy.mini.Scimitar 1.01 | 17 | 15% | 85 |
| cf.RiO.RiOx 4.2.1 | 7 | 6% | 38 |
| eld.Hmm 1.0 | 7 | 6% | 24 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 8 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 283542 melee ticks, 129389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 113 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 81303 sent, 73357 reached their opponent, 11940 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.24aa against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 336 over 10 battles (33.6 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 180 / 350 | 1.83 | 20.8% | 46536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.8% | 180 |
| pe.SandboxDT 2.71m | 2.1 | 17.7% | 97 |
| kvk.HebusLeTroll 0.35 | 2.9 | 15.8% | 49 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.8% | 6 |
| yk.JahRoslav 1.1 | 6.5 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.0 | 5.8% | 0 |
| tad.Dalek98 0.98 | 7.5 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 12 / 35 | 4530 |
| 2 | 1 | 70.2 | 91.1 | 19 / 35 | 4963 |
| 3 | 1 | 70.0 | 91.1 | 18 / 35 | 4804 |
| 4 | 1 | 68.3 | 87.9 | 17 / 35 | 4179 |
| 5 | 1 | 71.0 | 93.2 | 23 / 35 | 5003 |
| 6 | 1 | 70.5 | 92.5 | 23 / 35 | 4757 |
| 7 | 1 | 70.3 | 91.1 | 18 / 35 | 5052 |
| 8 | 1 | 69.4 | 90.4 | 16 / 35 | 4498 |
| 9 | 1 | 68.7 | 87.1 | 17 / 35 | 4518 |
| 10 | 1 | 68.0 | 86.8 | 17 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 119 | 48% |
| kvk.HebusLeTroll 0.35 | 85 | 69% |
| jlm.javaDisturbance 0.59 | 60 | 80% |
| bigpete.Stewie 1.0 | 15 | 93% |
| pbg.NinjaX 1.2 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 172 of 350 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 80 | 47% | 144 |
| kvk.HebusLeTroll 0.35 | 53 | 31% | 97 |
| jlm.javaDisturbance 0.59 | 25 | 15% | 71 |
| bigpete.Stewie 1.0 | 9 | 5% | 24 |
| tad.Dalek98 0.98 | 3 | 2% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 253170 melee ticks, 86471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 40 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 73686 sent, 66546 reached their opponent, 8686 virtual hits (13.1% of those reached).

## Melee bench: F23

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 10 battles (30.1 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.1 | 301 / 350 | 1.26 | 22.8% | 69113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 22.8% | 301 |
| pe.SandboxLump 1.52 | 2.0 | 16.0% | 36 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 9.8% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.1 | 8.9% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.1% | 0 |
| sample.Walls 1.0 | 7.7 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 96.2 | 32 / 35 | 6890 |
| 2 | 1 | 73.5 | 95.9 | 27 / 35 | 6988 |
| 3 | 1 | 73.8 | 96.8 | 29 / 35 | 6729 |
| 4 | 1 | 74.1 | 97.8 | 32 / 35 | 6753 |
| 5 | 1 | 73.5 | 97.1 | 31 / 35 | 6597 |
| 6 | 1 | 73.8 | 98.4 | 31 / 35 | 6661 |
| 7 | 1 | 74.5 | 96.8 | 30 / 35 | 7522 |
| 8 | 1 | 73.1 | 96.2 | 26 / 35 | 6547 |
| 9 | 1 | 74.5 | 97.5 | 31 / 35 | 7403 |
| 10 | 1 | 74.5 | 98.4 | 32 / 35 | 7023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 189 | 90% |
| cre.Karolos 0.32 | 87 | 97% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| stelo.RamTrackSurfer 1.2 | 13 | 85% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 49 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 26 | 53% | 176 |
| cre.Karolos 0.32 | 15 | 31% | 87 |
| stelo.RamTrackSurfer 1.2 | 4 | 8% | 21 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 30 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 331 rounds): 199810 melee ticks, 83113 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 48 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 61468 sent, 53189 reached their opponent, 15087 virtual hits (28.4% of those reached).

## Melee bench: F24

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 366 over 10 battles (36.6 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.5 | 154 / 350 | 2.30 | 17.8% | 44350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 17.8% | 154 |
| rz.GlowBlowMelee 1.4 | 2.6 | 13.7% | 60 |
| florent.XSeries.X2 0.12 | 3.0 | 13.2% | 50 |
| davidalves.Phoenix 0.54 | 4.0 | 12.3% | 49 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.9% | 26 |
| oog.melee.Corsair 1.0 | 5.9 | 9.7% | 12 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 6.5% | 2 |
| lunchie.Lunchbox 0.93 | 7.9 | 5.8% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 4.8% | 0 |
| evd.X1 0.01 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 17 / 35 | 4566 |
| 2 | 1 | 67.4 | 86.3 | 14 / 35 | 4389 |
| 3 | 1 | 68.6 | 90.5 | 18 / 35 | 4603 |
| 4 | 1 | 69.3 | 89.8 | 18 / 35 | 5042 |
| 5 | 1 | 67.1 | 82.5 | 19 / 35 | 4525 |
| 6 | 1 | 67.5 | 86.0 | 16 / 35 | 4578 |
| 7 | 1 | 66.1 | 82.2 | 12 / 35 | 4105 |
| 8 | 1 | 67.4 | 87.3 | 15 / 35 | 4171 |
| 9 | 1 | 64.7 | 78.1 | 13 / 35 | 4122 |
| 10 | 1 | 67.0 | 86.3 | 12 / 35 | 4249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 76 | 59% |
| florent.XSeries.X2 0.12 | 50 | 64% |
| pedersen.Ugluk 1.1.1 | 48 | 67% |
| davidalves.Phoenix 0.54 | 42 | 57% |
| oog.melee.Corsair 1.0 | 17 | 71% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| as.FrankTheTank 1.3 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 200 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 55 | 28% | 90 |
| florent.XSeries.X2 0.12 | 53 | 27% | 84 |
| davidalves.Phoenix 0.54 | 37 | 19% | 67 |
| pedersen.Ugluk 1.1.1 | 26 | 13% | 46 |
| oog.melee.Corsair 1.0 | 16 | 8% | 38 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 12 |
| evd.X1 0.01 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 227234 melee ticks, 74924 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 65 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 74009 sent, 65516 reached their opponent, 11464 virtual hits (17.5% of those reached).

## Melee bench: F25

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 357 over 10 battles (35.7 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.1 | 221 / 350 | 2.16 | 18.8% | 43561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 18.8% | 221 |
| voidious.mini.BrokenSword 2.0.3 | 2.6 | 13.0% | 31 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.5% | 20 |
| jdw.Hurricane 1.4 | 3.5 | 12.0% | 39 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.4% | 17 |
| ds.Oo 2.2 | 5.8 | 9.1% | 9 |
| awesomeness.Elite 1.0 | 7.2 | 7.6% | 6 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 5 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 24 / 35 | 4112 |
| 2 | 1 | 66.6 | 82.2 | 20 / 35 | 4069 |
| 3 | 1 | 67.0 | 83.2 | 20 / 35 | 4242 |
| 4 | 1 | 67.7 | 85.1 | 21 / 35 | 4311 |
| 5 | 1 | 67.6 | 85.7 | 20 / 35 | 4239 |
| 6 | 1 | 69.8 | 90.2 | 27 / 35 | 4539 |
| 7 | 1 | 68.9 | 87.0 | 23 / 35 | 4736 |
| 8 | 1 | 68.3 | 89.2 | 19 / 35 | 4220 |
| 9 | 1 | 71.1 | 94.0 | 27 / 35 | 4930 |
| 10 | 1 | 67.5 | 86.0 | 20 / 35 | 4163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 70 | 87% |
| jdw.Hurricane 1.4 | 60 | 78% |
| voidious.micro.BlitzBat 1.05 | 57 | 98% |
| ds.Oo 2.2 | 26 | 88% |
| gre.svman4.Morfeas 1.4.1 | 24 | 67% |
| awesomeness.Elite 1.0 | 11 | 91% |
| adt.Ar2 1.1 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 130 of 350 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 39 | 30% | 75 |
| voidious.mini.BrokenSword 2.0.3 | 24 | 18% | 76 |
| ds.Oo 2.2 | 18 | 14% | 49 |
| gre.svman4.Morfeas 1.4.1 | 13 | 10% | 32 |
| adt.Ar2 1.1 | 12 | 9% | 22 |
| voidious.micro.BlitzBat 1.05 | 10 | 8% | 53 |
| awesomeness.Elite 1.0 | 10 | 8% | 27 |
| amk.ChumbaMini 0.2 | 3 | 2% | 7 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 7 |

Posture (Hadur's M records, 335 rounds): 205310 melee ticks, 45964 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 33 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 71468 sent, 63489 reached their opponent, 9789 virtual hits (15.4% of those reached).

## Melee bench: F26

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 10 battles (46.0 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 95.0 | 265 / 350 | 1.45 | 22.1% | 70076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 22.1% | 265 |
| ak.Fermat 2.0 | 2.1 | 14.9% | 49 |
| shu.nitro.LENIN .T34 | 3.4 | 12.3% | 27 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 7 |
| js.PinBall 1.6 | 5.1 | 10.3% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 8.8% | 0 |
| gh.mini.GrubbmOne 1.0 | 6.9 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.0% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 96.2 | 28 / 35 | 6902 |
| 2 | 1 | 72.7 | 92.7 | 24 / 35 | 7086 |
| 3 | 1 | 73.7 | 97.5 | 29 / 35 | 7017 |
| 4 | 1 | 73.1 | 94.9 | 28 / 35 | 6766 |
| 5 | 1 | 71.6 | 89.2 | 20 / 35 | 6726 |
| 6 | 1 | 72.9 | 95.6 | 25 / 35 | 6816 |
| 7 | 1 | 73.6 | 96.2 | 27 / 35 | 7189 |
| 8 | 1 | 73.8 | 96.5 | 26 / 35 | 7403 |
| 9 | 1 | 72.9 | 94.0 | 26 / 35 | 6883 |
| 10 | 1 | 74.5 | 97.8 | 32 / 35 | 7288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 113 | 75% |
| shu.nitro.LENIN .T34 | 78 | 86% |
| lrem.Spectre 0.4.4 | 77 | 94% |
| js.PinBall 1.6 | 20 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 14 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 85 of 350 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 47% | 124 |
| shu.nitro.LENIN .T34 | 20 | 24% | 93 |
| lrem.Spectre 0.4.4 | 13 | 15% | 59 |
| js.PinBall 1.6 | 5 | 6% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 20 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 11 |

Posture (Hadur's M records, 330 rounds): 254903 melee ticks, 83962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 72 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 79649 sent, 71545 reached their opponent, 16185 virtual hits (22.6% of those reached).

## Melee bench: F27

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 362 over 10 battles (36.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.9 | 259 / 350 | 2.27 | 19.8% | 54749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.1 | 19.8% | 259 |
| mk.Alpha 0.2.1 | 2.2 | 14.2% | 50 |
| EH.Eagle 1.0.6 | 3.1 | 11.5% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.1% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.1% | 11 |
| joe.ADinosaur 1.0 | 6.2 | 8.3% | 3 |
| throxbot.ThroxBot 0.1 | 6.4 | 8.7% | 4 |
| wee.Gem 1.8.4 | 6.9 | 8.3% | 12 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 99.7 | 34 / 35 | 5877 |
| 2 | 1 | 71.8 | 95.6 | 30 / 35 | 5530 |
| 3 | 1 | 69.6 | 90.2 | 25 / 35 | 4891 |
| 4 | 1 | 70.3 | 89.5 | 27 / 35 | 5324 |
| 5 | 1 | 70.6 | 92.4 | 28 / 35 | 5148 |
| 6 | 1 | 65.2 | 67.0 | 18 / 35 | 5592 |
| 7 | 1 | 65.4 | 68.9 | 16 / 35 | 5549 |
| 8 | 1 | 72.6 | 96.8 | 32 / 35 | 6150 |
| 9 | 1 | 72.2 | 98.4 | 32 / 35 | 5586 |
| 10 | 2 | 62.6 | 60.3 | 17 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 153 | 90% |
| EH.Eagle 1.0.6 | 69 | 100% |
| throxbot.ThroxBot 0.1 | 17 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 85% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| wee.Gem 1.8.4 | 6 | 83% |
| joe.ADinosaur 1.0 | 5 | 80% |

Hadur died in 92 of 350 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 27% | 135 |
| cs.Grudge 1.0 | 21 | 23% | 22 |
| joe.ADinosaur 1.0 | 12 | 13% | 22 |
| EH.Eagle 1.0.6 | 8 | 9% | 70 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 7% | 27 |
| wee.Gem 1.8.4 | 6 | 7% | 16 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 18 |

Posture (Hadur's M records, 332 rounds): 200089 melee ticks, 58515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 48 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (332 rounds): 65191 sent, 57277 reached their opponent, 12950 virtual hits (22.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 371 over 10 battles (37.1 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.3 | 244 / 350 | 1.79 | 19.3% | 43596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.3% | 244 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 39 |
| uji.Antique 1.0 | 3.2 | 12.0% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 9.9% | 11 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.2% | 14 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.4% | 7 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 4 |
| matt.advanced.Katana 1.0 | 8.4 | 6.4% | 0 |
| stelo.PianistNano 1.2 | 9.1 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.4 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.3 | 23 / 35 | 4255 |
| 2 | 1 | 69.4 | 92.1 | 25 / 35 | 4518 |
| 3 | 1 | 70.2 | 94.0 | 26 / 35 | 4611 |
| 4 | 1 | 68.8 | 91.4 | 22 / 35 | 4383 |
| 5 | 1 | 68.6 | 88.6 | 25 / 35 | 4372 |
| 6 | 1 | 69.9 | 94.6 | 24 / 35 | 4393 |
| 7 | 1 | 68.8 | 90.2 | 24 / 35 | 4266 |
| 8 | 1 | 68.4 | 90.2 | 22 / 35 | 4256 |
| 9 | 1 | 69.5 | 92.4 | 26 / 35 | 4419 |
| 10 | 1 | 69.3 | 93.0 | 27 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 116 | 84% |
| uji.Antique 1.0 | 80 | 89% |
| qohnil.blot.BlotBot 3.61 | 24 | 88% |
| amk.ChumbaWumba 0.3 | 22 | 82% |
| ahr.ice.Ice 1.0.2 | 13 | 85% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 108 of 350 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 38 | 35% | 81 |
| uji.Antique 1.0 | 18 | 17% | 87 |
| qohnil.blot.BlotBot 3.61 | 17 | 16% | 51 |
| pfvicm.Sobieski 7.2.3b | 15 | 14% | 29 |
| amk.ChumbaWumba 0.3 | 11 | 10% | 27 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 30 |
| stelo.PianistNano 1.2 | 2 | 2% | 11 |
| stelo.Lifestealer 1.0 | 2 | 2% | 9 |
| matt.advanced.Katana 1.0 | 0 | 0% | 20 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 214403 melee ticks, 62683 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 58 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 70751 sent, 62523 reached their opponent, 8611 virtual hits (13.8% of those reached).

## Melee bench: F29

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 10 battles (34.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.2 | 215 / 350 | 1.88 | 20.1% | 51290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.1% | 215 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 67 |
| deewiant.Anomaly 0.2 | 2.7 | 14.1% | 46 |
| myl.micro.Troodon 1.10 | 4.3 | 11.8% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 12 |
| ph.melee.ArcherME 0.3 | 5.9 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.1 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.2% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.6% | 2 |
| jangs.ns51 1.0 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.0 | 24 / 35 | 5436 |
| 2 | 1 | 70.8 | 88.9 | 22 / 35 | 5232 |
| 3 | 1 | 70.3 | 90.5 | 23 / 35 | 4927 |
| 4 | 1 | 71.2 | 91.4 | 24 / 35 | 5023 |
| 5 | 1 | 70.5 | 91.7 | 20 / 35 | 4908 |
| 6 | 1 | 70.4 | 86.7 | 21 / 35 | 5244 |
| 7 | 1 | 69.6 | 87.6 | 18 / 35 | 4497 |
| 8 | 1 | 69.9 | 88.9 | 18 / 35 | 5154 |
| 9 | 1 | 71.9 | 93.7 | 23 / 35 | 5633 |
| 10 | 1 | 70.7 | 88.9 | 22 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 100 | 72% |
| deewiant.Anomaly 0.2 | 99 | 77% |
| jok.PheonixM 0.1.2 | 34 | 88% |
| myl.micro.Troodon 1.10 | 31 | 94% |
| ap.Frederick 1.1 | 6 | 83% |
| DBall.Anarchy 0.1 | 3 | 100% |

Hadur died in 140 of 350 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 40% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 49 | 35% | 120 |
| jok.PheonixM 0.1.2 | 14 | 10% | 38 |
| myl.micro.Troodon 1.10 | 12 | 9% | 39 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 5 |
| ph.melee.ArcherME 0.3 | 2 | 1% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 267754 melee ticks, 96875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 55 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 85411 sent, 77369 reached their opponent, 11168 virtual hits (14.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.24aa against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 10 battles (27.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.1 | 118 / 350 | 2.59 | 18.7% | 45535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.1 | 18.7% | 118 |
| darkcanuck.B26354 1.06 | 2.2 | 15.8% | 94 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.8% | 50 |
| oog.melee.Capulet 1.2 | 3.4 | 14.5% | 55 |
| tripphippy.Alice 1.1 | 5.4 | 9.7% | 12 |
| intruder.PrairieWolf 2.61 | 5.9 | 9.5% | 14 |
| ntc.Opposite 1.5 | 6.8 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 6.5% | 8 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.0 | 14 / 35 | 4734 |
| 2 | 1 | 67.0 | 78.9 | 12 / 35 | 4859 |
| 3 | 1 | 67.4 | 85.0 | 16 / 35 | 4547 |
| 4 | 1 | 66.3 | 80.0 | 11 / 35 | 4785 |
| 5 | 2 | 63.8 | 77.1 | 7 / 35 | 3953 |
| 6 | 1 | 65.1 | 77.5 | 11 / 35 | 4373 |
| 7 | 1 | 68.1 | 86.1 | 15 / 35 | 4662 |
| 8 | 1 | 66.7 | 80.0 | 14 / 35 | 4620 |
| 9 | 1 | 65.0 | 75.7 | 9 / 35 | 4435 |
| 10 | 1 | 65.3 | 75.4 | 9 / 35 | 4567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 71 | 49% |
| oog.melee.Capulet 1.2 | 65 | 55% |
| stelo.PastFuture 2.3.2 | 42 | 67% |
| tripphippy.Alice 1.1 | 13 | 85% |
| intruder.PrairieWolf 2.61 | 11 | 55% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 17% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 233 of 350 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 73 | 31% | 102 |
| oog.melee.Capulet 1.2 | 52 | 22% | 97 |
| stelo.PastFuture 2.3.2 | 49 | 21% | 73 |
| tripphippy.Alice 1.1 | 25 | 11% | 37 |
| intruder.PrairieWolf 2.61 | 15 | 6% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 5% | 10 |
| ntc.Opposite 1.5 | 8 | 3% | 11 |

Posture (Hadur's M records, 333 rounds): 266172 melee ticks, 63148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 61 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 76084 sent, 68582 reached their opponent, 11432 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 10 battles (32.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.5 | 125 / 350 | 2.67 | 16.7% | 40923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.3% | 144 |
| hadur117.Hadur 3.24aa | 1.7 | 16.7% | 125 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 60 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.0% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 10.9% | 12 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 0 |
| fm.mammillarias 1.3 | 8.8 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 82.9 | 14 / 35 | 3910 |
| 2 | 1 | 67.8 | 85.7 | 14 / 35 | 4434 |
| 3 | 1 | 66.8 | 87.0 | 14 / 35 | 3911 |
| 4 | 2 | 63.9 | 76.8 | 9 / 35 | 3968 |
| 5 | 2 | 63.7 | 76.2 | 11 / 35 | 3825 |
| 6 | 2 | 65.4 | 80.3 | 10 / 35 | 3957 |
| 7 | 1 | 65.9 | 81.0 | 15 / 35 | 4279 |
| 8 | 2 | 67.5 | 86.7 | 11 / 35 | 4644 |
| 9 | 2 | 64.4 | 76.5 | 13 / 35 | 3997 |
| 10 | 2 | 66.3 | 81.6 | 14 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 85 | 47% |
| gh.mini.Griezel 0.2 | 62 | 68% |
| d414.nano.Quantum 1.0.0 | 20 | 85% |
| spinnercat.micro.Tyger 0.1 | 16 | 81% |
| gh.nano.Grofvuil 0.2 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 230 of 350 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 102 | 44% | 150 |
| gh.mini.Griezel 0.2 | 54 | 23% | 90 |
| d414.nano.Quantum 1.0.0 | 22 | 10% | 37 |
| spinnercat.micro.Tyger 0.1 | 20 | 9% | 31 |
| gh.nano.Grofvuil 0.2 | 9 | 4% | 20 |
| timmit.nano.TimDog 0.33 | 8 | 3% | 10 |
| fm.mammillarias 1.3 | 5 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 336 rounds): 248347 melee ticks, 63820 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 43 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 0.

Targeting waves (336 rounds): 79094 sent, 70730 reached their opponent, 10859 virtual hits (15.4% of those reached).

## Melee bench: F32

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 383 over 10 battles (38.3 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.4 | 212 / 350 | 1.87 | 19.2% | 49394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.2% | 212 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 72 |
| apc.botM 3.0 | 3.5 | 11.7% | 31 |
| lxx.ConceptA 0.8 | 4.0 | 10.9% | 5 |
| vjik.UnViolation 1.1 | 4.6 | 10.4% | 16 |
| bayen.UbaMicro 1.4 | 6.2 | 8.6% | 7 |
| yk.JahMicro 1.0 | 7.7 | 7.2% | 5 |
| panzer.Panzer 0.2 | 7.7 | 7.0% | 1 |
| conscience.Electron 1.3g | 8.4 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.9 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 25 / 35 | 5070 |
| 2 | 1 | 68.5 | 88.9 | 17 / 35 | 5234 |
| 3 | 1 | 69.4 | 93.0 | 25 / 35 | 4748 |
| 4 | 1 | 68.7 | 90.2 | 20 / 35 | 4960 |
| 5 | 1 | 70.2 | 93.3 | 25 / 35 | 5114 |
| 6 | 1 | 67.9 | 87.6 | 20 / 35 | 4915 |
| 7 | 1 | 68.5 | 90.5 | 20 / 35 | 4944 |
| 8 | 1 | 67.1 | 87.0 | 19 / 35 | 4418 |
| 9 | 1 | 69.9 | 92.1 | 23 / 35 | 5268 |
| 10 | 1 | 68.1 | 89.2 | 18 / 35 | 4723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 129 | 64% |
| apc.botM 3.0 | 50 | 76% |
| vjik.UnViolation 1.1 | 37 | 89% |
| lxx.ConceptA 0.8 | 28 | 100% |
| yk.JahMicro 1.0 | 15 | 87% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| donjezza.Jezza 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 139 of 350 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 60 | 43% | 137 |
| apc.botM 3.0 | 24 | 17% | 60 |
| lxx.ConceptA 0.8 | 17 | 12% | 40 |
| bayen.UbaMicro 1.4 | 14 | 10% | 22 |
| vjik.UnViolation 1.1 | 11 | 8% | 53 |
| panzer.Panzer 0.2 | 5 | 4% | 9 |
| conscience.Electron 1.3g | 5 | 4% | 9 |
| yk.JahMicro 1.0 | 3 | 2% | 15 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 333 rounds): 200421 melee ticks, 82041 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 137 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 137 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 2.

Targeting waves (333 rounds): 67829 sent, 59580 reached their opponent, 10363 virtual hits (17.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 366 over 10 battles (36.6 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.2 | 208 / 350 | 1.97 | 19.7% | 51709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.7% | 208 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.9% | 37 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.3% | 28 |
| labg.Cataclysm 2.05 | 4.8 | 10.3% | 13 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 7.8% | 8 |
| sanja.First 0.1 | 8.5 | 5.4% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 19 / 35 | 4429 |
| 2 | 1 | 72.0 | 95.2 | 26 / 35 | 5429 |
| 3 | 1 | 71.1 | 91.4 | 22 / 35 | 5646 |
| 4 | 1 | 71.1 | 92.4 | 20 / 35 | 5404 |
| 5 | 1 | 70.4 | 88.3 | 21 / 35 | 5706 |
| 6 | 1 | 71.0 | 90.2 | 21 / 35 | 5725 |
| 7 | 1 | 69.0 | 85.7 | 19 / 35 | 4878 |
| 8 | 1 | 69.9 | 87.0 | 21 / 35 | 5131 |
| 9 | 1 | 69.3 | 87.0 | 20 / 35 | 4910 |
| 10 | 1 | 68.4 | 85.1 | 19 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 120 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 81% |
| gre.svman4.Leonidas 1.3.2 | 45 | 80% |
| labg.Cataclysm 2.05 | 14 | 93% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 100% |
| baal.nano.N 1.42 | 4 | 75% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 143 of 350 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 50 | 35% | 136 |
| gre.svman4.Leonidas 1.3.2 | 39 | 27% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% | 76 |
| labg.Cataclysm 2.05 | 14 | 10% | 36 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 6% | 15 |
| baal.nano.N 1.42 | 4 | 3% | 12 |
| zyx.micro.Ant 1.1 | 3 | 2% | 7 |
| sanja.First 0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 333 rounds): 286643 melee ticks, 82279 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 46 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 2.

Targeting waves (333 rounds): 89057 sent, 80809 reached their opponent, 10847 virtual hits (13.4% of those reached).

## Melee bench: F34

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 285 over 10 battles (28.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.3 | 181 / 350 | 1.97 | 19.5% | 57495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.5% | 181 |
| kid.Gladiator .7.2 | 2.3 | 16.0% | 66 |
| stelo.Spread 0.9 | 2.7 | 15.7% | 72 |
| jcs.Seth 1.8 | 4.4 | 11.2% | 22 |
| tcf.Reach 3 | 4.8 | 10.5% | 10 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 19 / 35 | 5335 |
| 2 | 1 | 69.1 | 87.3 | 13 / 35 | 5330 |
| 3 | 1 | 70.4 | 87.6 | 19 / 35 | 5905 |
| 4 | 1 | 71.5 | 91.4 | 20 / 35 | 6214 |
| 5 | 1 | 71.7 | 92.4 | 21 / 35 | 6006 |
| 6 | 1 | 71.6 | 91.7 | 21 / 35 | 6236 |
| 7 | 1 | 69.7 | 88.9 | 14 / 35 | 5464 |
| 8 | 1 | 71.1 | 89.5 | 19 / 35 | 6042 |
| 9 | 1 | 69.3 | 87.0 | 13 / 35 | 5326 |
| 10 | 1 | 70.5 | 88.3 | 22 / 35 | 5637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 120 | 74% |
| kid.Gladiator .7.2 | 99 | 65% |
| jcs.Seth 1.8 | 25 | 56% |
| tcf.Reach 3 | 7 | 71% |
| ratosh.Wesco 1.4 | 5 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 172 of 350 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 67 | 39% | 122 |
| stelo.Spread 0.9 | 58 | 34% | 135 |
| jcs.Seth 1.8 | 25 | 15% | 50 |
| tcf.Reach 3 | 14 | 8% | 20 |
| cli.Dancer 1.1 | 4 | 2% | 11 |
| ratosh.Wesco 1.4 | 2 | 1% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 329 rounds): 270780 melee ticks, 99507 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (329 rounds): longest scan gap while four or more were alive 73 ticks (329 rounds over 8); rounds whose longest gap at any count was over 8: 329; robots dropped as dead without a death event: 0.

Targeting waves (329 rounds): 81838 sent, 73783 reached their opponent, 11645 virtual hits (15.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 10 battles (26.4 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.5 | 80 / 350 | 2.40 | 16.8% | 41643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 225 |
| hadur117.Hadur 3.24aa | 2.0 | 16.8% | 80 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.0% | 16 |
| rz.HawkOnFire 0.1 | 4.5 | 11.2% | 4 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 5.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 8.9 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 83.5 | 9 / 35 | 4007 |
| 2 | 2 | 67.2 | 87.0 | 7 / 35 | 4321 |
| 3 | 2 | 66.6 | 84.1 | 5 / 35 | 4409 |
| 4 | 2 | 65.6 | 82.9 | 5 / 35 | 4136 |
| 5 | 2 | 65.4 | 83.5 | 7 / 35 | 3759 |
| 6 | 2 | 66.5 | 84.8 | 9 / 35 | 4078 |
| 7 | 2 | 65.9 | 82.2 | 9 / 35 | 4257 |
| 8 | 2 | 65.8 | 83.5 | 7 / 35 | 3998 |
| 9 | 2 | 66.1 | 83.2 | 9 / 35 | 4129 |
| 10 | 2 | 68.8 | 90.2 | 13 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 159 | 23% |
| gh.mini.Gruwel 0.9 | 34 | 47% |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 63% |
| rz.HawkOnFire 0.1 | 18 | 89% |

Hadur died in 270 of 350 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 163 | 60% | 203 |
| dmh.robocode.robot.BlackDeath 9.2 | 42 | 16% | 50 |
| gh.mini.Gruwel 0.9 | 41 | 15% | 58 |
| rz.HawkOnFire 0.1 | 16 | 6% | 30 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 1% | 4 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 1 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

Posture (Hadur's M records, 334 rounds): 247909 melee ticks, 84921 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 42 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 1.

Targeting waves (334 rounds): 74395 sent, 66050 reached their opponent, 9669 virtual hits (14.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 446 over 10 battles (44.6 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.4 | 282 / 350 | 1.50 | 21.7% | 58776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.7% | 282 |
| alpha.RainingFire 1.0 | 2.2 | 12.2% | 21 |
| bzdp.Pansy 2.1 | 3.2 | 11.5% | 11 |
| bvh.micro.Freya 0.3 | 4.7 | 10.6% | 6 |
| mz.Cork 0.1 | 5.1 | 10.5% | 15 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.9% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.8% | 11 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 4.7% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.8 | 30 / 35 | 6185 |
| 2 | 1 | 73.0 | 96.8 | 30 / 35 | 5973 |
| 3 | 1 | 71.4 | 90.8 | 25 / 35 | 6011 |
| 4 | 1 | 72.9 | 96.2 | 31 / 35 | 6101 |
| 5 | 1 | 71.3 | 89.8 | 25 / 35 | 5917 |
| 6 | 1 | 73.0 | 97.1 | 32 / 35 | 5752 |
| 7 | 1 | 70.2 | 90.5 | 25 / 35 | 5144 |
| 8 | 1 | 71.4 | 92.7 | 25 / 35 | 5739 |
| 9 | 1 | 73.9 | 99.7 | 34 / 35 | 6263 |
| 10 | 1 | 71.5 | 93.7 | 25 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 95% |
| alpha.RainingFire 1.0 | 58 | 91% |
| bvh.micro.Freya 0.3 | 58 | 97% |
| mz.Cork 0.1 | 54 | 87% |
| bvh.mini.Fenrir 0.39 | 37 | 97% |
| m3thos.Eva02 0.7.1 | 29 | 86% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 68 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 22% | 75 |
| mz.Cork 0.1 | 14 | 21% | 62 |
| m3thos.Eva02 0.7.1 | 11 | 16% | 38 |
| bzdp.Pansy 2.1 | 9 | 13% | 66 |
| bvh.micro.Freya 0.3 | 9 | 13% | 56 |
| bvh.mini.Fenrir 0.39 | 7 | 10% | 29 |
| dl.BetterWalls 1.0 | 2 | 3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 331 rounds): 235494 melee ticks, 77716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 51 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 79190 sent, 71365 reached their opponent, 13765 virtual hits (19.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 497 over 10 battles (49.7 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.7 | 276 / 350 | 1.92 | 19.9% | 58642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.9% | 276 |
| EBBU.Sim2 1.02 | 3.5 | 10.0% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.1% | 12 |
| germ.TheMind .2 | 4.2 | 9.9% | 8 |
| agrach.Dalek 1.0 | 4.5 | 9.5% | 15 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.5% | 15 |
| mb.Beast 0.1 | 7.0 | 8.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.2 | 8.4% | 1 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 1 |
| skm.Ryubot 1.0 | 9.3 | 7.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.9 | 29 / 35 | 5326 |
| 2 | 1 | 69.3 | 90.5 | 28 / 35 | 5763 |
| 3 | 1 | 68.0 | 84.8 | 27 / 35 | 5813 |
| 4 | 1 | 69.3 | 89.8 | 27 / 35 | 5975 |
| 5 | 1 | 68.9 | 88.3 | 25 / 35 | 6141 |
| 6 | 1 | 67.2 | 85.7 | 24 / 35 | 5221 |
| 7 | 1 | 68.5 | 88.3 | 24 / 35 | 5788 |
| 8 | 1 | 72.3 | 99.4 | 34 / 35 | 6547 |
| 9 | 1 | 69.8 | 92.4 | 30 / 35 | 5851 |
| 10 | 1 | 69.9 | 89.5 | 28 / 35 | 6217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 43 | 91% |
| agrach.Dalek 1.0 | 42 | 98% |
| stelo.UntouchableNano 1.3 | 37 | 92% |
| EBBU.Sim2 1.02 | 35 | 97% |
| lmk.ACPFinal 0.1 | 35 | 100% |
| mb.Beast 0.1 | 33 | 100% |
| germ.TheMind .2 | 29 | 100% |
| skm.Ryubot 1.0 | 24 | 96% |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 100% |

Hadur died in 77 of 350 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 22% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 18% | 57 |
| EBBU.Sim2 1.02 | 11 | 14% | 53 |
| lmk.ACPFinal 0.1 | 9 | 12% | 36 |
| germ.TheMind .2 | 8 | 10% | 37 |
| mb.Beast 0.1 | 7 | 9% | 39 |
| agrach.Dalek 1.0 | 6 | 8% | 62 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 28 |
| skm.Ryubot 1.0 | 1 | 1% | 6 |

Posture (Hadur's M records, 333 rounds): 153834 melee ticks, 41479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 81 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 50924 sent, 43290 reached their opponent, 12151 virtual hits (28.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 10 battles (39.7 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.8 | 195 / 350 | 2.01 | 19.0% | 50506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 19.0% | 195 |
| justin.Mallais 14.0 | 2.0 | 15.6% | 91 |
| bvh.mini.Freya 0.55 | 3.1 | 12.7% | 27 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 20 |
| cs.Wren 1.0 | 5.0 | 10.5% | 6 |
| kdf.KoulDestroyer 1.0 | 5.6 | 9.4% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.9 | 8.2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 2 |
| bzdp.BoxCar 2.0 | 9.4 | 3.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 15 / 35 | 5024 |
| 2 | 1 | 69.2 | 87.9 | 21 / 35 | 5127 |
| 3 | 1 | 67.8 | 86.0 | 18 / 35 | 4675 |
| 4 | 1 | 68.6 | 86.0 | 18 / 35 | 4866 |
| 5 | 1 | 69.2 | 90.2 | 21 / 35 | 4848 |
| 6 | 1 | 68.5 | 87.3 | 17 / 35 | 5021 |
| 7 | 1 | 70.4 | 92.1 | 24 / 35 | 5106 |
| 8 | 1 | 70.3 | 92.1 | 20 / 35 | 5219 |
| 9 | 1 | 70.9 | 90.8 | 23 / 35 | 5611 |
| 10 | 1 | 68.4 | 86.7 | 18 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 132 | 64% |
| bvh.mini.Freya 0.55 | 50 | 74% |
| bts.mega.Gnarly 1.4 | 34 | 74% |
| cs.Wren 1.0 | 21 | 86% |
| kdf.KoulDestroyer 1.0 | 16 | 88% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 88% |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 88% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 158 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 68 | 43% | 140 |
| bvh.mini.Freya 0.55 | 29 | 18% | 50 |
| bts.mega.Gnarly 1.4 | 24 | 15% | 65 |
| kdf.KoulDestroyer 1.0 | 12 | 8% | 26 |
| cs.Wren 1.0 | 11 | 7% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 4% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 14 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 226042 melee ticks, 70205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 32 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 1.

Targeting waves (331 rounds): 72504 sent, 63955 reached their opponent, 13075 virtual hits (20.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.24aa against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 341 over 10 battles (34.1 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.1 | 237 / 350 | 1.55 | 23.0% | 59162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 23.0% | 237 |
| bvh.fry.Freya 0.82 | 2.2 | 16.4% | 28 |
| az.Ololobot 0.2.4 | 2.8 | 14.0% | 76 |
| winamp32.micro.MicroMacro 1.0 | 4.4 | 9.5% | 4 |
| gimp.GimpBot 0.1 | 5.1 | 8.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.1 | 8.5% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.6 | 7.7% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.6 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.9 | 22 / 35 | 5976 |
| 2 | 1 | 71.0 | 92.5 | 24 / 35 | 5935 |
| 3 | 1 | 69.8 | 88.9 | 24 / 35 | 5549 |
| 4 | 1 | 71.9 | 93.9 | 26 / 35 | 6085 |
| 5 | 1 | 71.3 | 92.5 | 24 / 35 | 5933 |
| 6 | 1 | 70.9 | 92.1 | 18 / 35 | 5912 |
| 7 | 1 | 72.2 | 93.6 | 23 / 35 | 6351 |
| 8 | 1 | 70.4 | 91.8 | 22 / 35 | 5718 |
| 9 | 1 | 71.8 | 96.1 | 26 / 35 | 5824 |
| 10 | 1 | 72.2 | 96.8 | 28 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 137 | 87% |
| az.Ololobot 0.2.4 | 126 | 56% |
| winamp32.micro.MicroMacro 1.0 | 18 | 94% |
| gimp.GimpBot 0.1 | 17 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 100% |

Hadur died in 114 of 350 rounds, at a mean tick of 1223. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 64 | 56% | 154 |
| bvh.fry.Freya 0.82 | 35 | 31% | 107 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 15 |
| gimp.GimpBot 0.1 | 3 | 3% | 26 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 3% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 5 |

Posture (Hadur's M records, 331 rounds): 260711 melee ticks, 113843 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 48 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 74143 sent, 66950 reached their opponent, 11687 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 396 over 10 battles (39.6 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.1 | 242 / 350 | 1.80 | 20.5% | 54494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.5% | 242 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.0% | 33 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 27 |
| mz.AntiGrav 1.0 | 4.0 | 11.2% | 13 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.3% | 10 |
| stelo.Randomness 1.0 | 5.9 | 9.3% | 19 |
| alpha.BlackIce 1.0 | 6.7 | 8.8% | 5 |
| amk.superstrike.SuperStrike 0.3 | 7.9 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.8% | 1 |
| sample.Corners 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 22 / 35 | 5006 |
| 2 | 1 | 70.2 | 86.7 | 23 / 35 | 5284 |
| 3 | 1 | 71.0 | 91.4 | 23 / 35 | 5514 |
| 4 | 1 | 72.5 | 95.2 | 28 / 35 | 5578 |
| 5 | 1 | 71.7 | 93.0 | 28 / 35 | 5555 |
| 6 | 1 | 68.7 | 86.3 | 15 / 35 | 5016 |
| 7 | 1 | 69.7 | 89.2 | 20 / 35 | 4919 |
| 8 | 1 | 72.5 | 92.7 | 27 / 35 | 6151 |
| 9 | 1 | 72.4 | 95.2 | 29 / 35 | 5688 |
| 10 | 1 | 71.9 | 91.7 | 27 / 35 | 5783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 95 | 85% |
| kano.gamma.KanoGamma 1.8 | 83 | 89% |
| mz.AntiGrav 1.0 | 36 | 100% |
| Polkwane.SmashMelee 1.0 | 27 | 78% |
| stelo.Randomness 1.0 | 23 | 70% |
| alpha.BlackIce 1.0 | 9 | 78% |
| amk.superstrike.SuperStrike 0.3 | 7 | 100% |

Hadur died in 108 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 28% | 89 |
| kano.gamma.KanoGamma 1.8 | 22 | 20% | 97 |
| Polkwane.SmashMelee 1.0 | 17 | 16% | 40 |
| stelo.Randomness 1.0 | 14 | 13% | 40 |
| mz.AntiGrav 1.0 | 14 | 13% | 40 |
| alpha.BlackIce 1.0 | 6 | 6% | 17 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 18 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 330 rounds): 248427 melee ticks, 69768 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 87 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 0.

Targeting waves (330 rounds): 79337 sent, 71049 reached their opponent, 13512 virtual hits (19.0% of those reached).

## Melee bench: F41

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 10 battles (26.9 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.7 | 175 / 350 | 2.01 | 18.8% | 48379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 18.8% | 175 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 130 |
| ary.Swarm 1.1 | 3.2 | 12.9% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.4% | 23 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 13 |
| shrub.Silver v048 | 5.9 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 13 / 35 | 5093 |
| 2 | 1 | 70.0 | 92.7 | 20 / 35 | 4587 |
| 3 | 1 | 71.0 | 92.4 | 23 / 35 | 5298 |
| 4 | 1 | 68.6 | 87.6 | 18 / 35 | 4601 |
| 5 | 1 | 69.8 | 89.8 | 22 / 35 | 4647 |
| 6 | 1 | 68.4 | 83.8 | 15 / 35 | 4869 |
| 7 | 1 | 69.1 | 87.9 | 14 / 35 | 4975 |
| 8 | 1 | 69.5 | 89.8 | 17 / 35 | 5168 |
| 9 | 1 | 67.9 | 84.4 | 15 / 35 | 4651 |
| 10 | 1 | 68.9 | 89.8 | 18 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 143 | 46% |
| lessonz.robocode.Oz 0.5.0 | 52 | 83% |
| ary.Swarm 1.1 | 40 | 100% |
| simonton.nano.MeleeSeed 1.8 | 25 | 92% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 177 of 350 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 99 | 56% | 167 |
| lessonz.robocode.Oz 0.5.0 | 38 | 21% | 68 |
| ary.Swarm 1.1 | 18 | 10% | 53 |
| simonton.nano.MeleeSeed 1.8 | 11 | 6% | 37 |
| stelo.Mirror 1.1 | 3 | 2% | 5 |
| zyx.nano.Ant 1.1 | 3 | 2% | 4 |
| shrub.Silver v048 | 2 | 1% | 11 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 253827 melee ticks, 88311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 62 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 80656 sent, 72265 reached their opponent, 10517 virtual hits (14.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 393 over 10 battles (39.3 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.1 | 231 / 350 | 1.80 | 20.6% | 61717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.6% | 231 |
| wompi.Wallaby 5.1 | 2.1 | 15.1% | 56 |
| ara.Shera 0.88 | 3.2 | 13.4% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| dsw.StaticD 1.0 | 6.3 | 6.8% | 4 |
| maribo.IotaCT 1.1 | 7.3 | 6.0% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 25 / 35 | 6066 |
| 2 | 1 | 71.8 | 93.0 | 23 / 35 | 6381 |
| 3 | 1 | 72.2 | 94.9 | 28 / 35 | 6340 |
| 4 | 1 | 71.0 | 91.7 | 22 / 35 | 6134 |
| 5 | 1 | 70.9 | 89.8 | 21 / 35 | 6382 |
| 6 | 1 | 70.6 | 88.9 | 23 / 35 | 6081 |
| 7 | 1 | 71.0 | 90.5 | 22 / 35 | 6154 |
| 8 | 1 | 70.1 | 88.3 | 20 / 35 | 5760 |
| 9 | 1 | 70.7 | 91.4 | 21 / 35 | 6050 |
| 10 | 1 | 71.7 | 91.1 | 26 / 35 | 6369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 139 | 88% |
| ara.Shera 0.88 | 59 | 64% |
| maribo.mini.MiniQuester 0.1 | 58 | 95% |
| dsw.StaticD 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 120 of 350 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 50 | 42% | 98 |
| wompi.Wallaby 5.1 | 45 | 38% | 145 |
| maribo.mini.MiniQuester 0.1 | 16 | 13% | 71 |
| dsw.StaticD 1.0 | 2 | 2% | 13 |
| amz.NanoClone 1.41 | 2 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 262397 melee ticks, 81126 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 39 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 0.

Targeting waves (331 rounds): 81178 sent, 73305 reached their opponent, 13665 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 10 battles (27.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.9 | 76 / 350 | 2.63 | 16.7% | 45847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 227 |
| hadur117.Hadur 3.24aa | 2.0 | 16.7% | 76 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 34 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 4 |
| mz.NanoGod 2.02 | 7.3 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 77.8 | 8 / 35 | 4326 |
| 2 | 2 | 68.1 | 84.4 | 8 / 35 | 4769 |
| 3 | 2 | 66.6 | 78.1 | 8 / 35 | 4551 |
| 4 | 2 | 67.3 | 81.3 | 7 / 35 | 4622 |
| 5 | 2 | 67.5 | 83.8 | 9 / 35 | 4432 |
| 6 | 2 | 68.2 | 84.1 | 9 / 35 | 4686 |
| 7 | 2 | 68.4 | 85.1 | 8 / 35 | 4901 |
| 8 | 2 | 66.9 | 81.9 | 7 / 35 | 4223 |
| 9 | 2 | 68.7 | 85.7 | 10 / 35 | 5040 |
| 10 | 2 | 65.2 | 76.8 | 2 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 151 | 25% |
| brainfade.melee.Dusk 0.44 | 31 | 61% |
| dummy.micro.Sparrow 2.5 | 12 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 9 | 89% |
| Krabb.akim2.Akim2 1.1b | 5 | 60% |
| jab.DiamondStealer 5 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 160 | 58% | 195 |
| brainfade.melee.Dusk 0.44 | 49 | 18% | 66 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 8% | 28 |
| dummy.micro.Sparrow 2.5 | 21 | 8% | 27 |
| Krabb.akim2.Akim2 1.1b | 10 | 4% | 17 |
| mz.NanoGod 2.02 | 8 | 3% | 9 |
| jab.DiamondStealer 5 | 4 | 1% | 5 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 336 rounds): 254004 melee ticks, 92453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 72 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 0.

Targeting waves (336 rounds): 78836 sent, 70494 reached their opponent, 11326 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 10 battles (33.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.3 | 240 / 350 | 1.69 | 21.2% | 61701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 21.2% | 240 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 72 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 30 |
| jwirde.Gort 2.0 | 4.3 | 9.6% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.2% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.2% | 1 |
| wompi.Quokka 1.6 | 7.2 | 7.0% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.0 | 17 / 35 | 5608 |
| 2 | 1 | 71.4 | 90.2 | 22 / 35 | 6375 |
| 3 | 1 | 72.4 | 94.0 | 26 / 35 | 6454 |
| 4 | 1 | 71.7 | 93.7 | 23 / 35 | 5966 |
| 5 | 1 | 73.0 | 95.2 | 29 / 35 | 6379 |
| 6 | 1 | 72.5 | 94.9 | 25 / 35 | 6205 |
| 7 | 1 | 72.6 | 94.6 | 27 / 35 | 6648 |
| 8 | 1 | 70.3 | 87.9 | 20 / 35 | 5929 |
| 9 | 1 | 70.9 | 90.2 | 25 / 35 | 5630 |
| 10 | 1 | 72.9 | 95.9 | 26 / 35 | 6507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 137 | 69% |
| tzu.TheArtOfWar 1.2 | 120 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 93% |
| jwirde.Gort 2.0 | 14 | 79% |
| disan.Chair 2.2.0 | 9 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 110 of 350 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 54 | 49% | 152 |
| tzu.TheArtOfWar 1.2 | 25 | 23% | 112 |
| jwirde.Gort 2.0 | 15 | 14% | 37 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 7% | 20 |
| disan.Chair 2.2.0 | 3 | 3% | 13 |
| wompi.Quokka 1.6 | 2 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 332 rounds): 247095 melee ticks, 80818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 40 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 83735 sent, 75598 reached their opponent, 15140 virtual hits (20.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 372 over 10 battles (37.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.3 | 207 / 350 | 1.79 | 20.8% | 59572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.0 | 20.8% | 207 |
| jje.BagPuss 1.2 | 2.4 | 12.2% | 17 |
| eem.IWillFireNoBullet v2.8 | 3.4 | 11.1% | 89 |
| sul.Lunar 1.1 | 4.6 | 10.2% | 15 |
| myl.nano.Graviton 1.10 | 4.6 | 10.2% | 5 |
| fm.claire 1.7 | 6.5 | 9.2% | 3 |
| hvilela.HVilela 0.9 | 6.7 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.6% | 13 |
| wit.Deep7 2.0 | 9.1 | 5.2% | 2 |
| abud.ThirdRobo 1.0 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.1 | 16 / 35 | 5369 |
| 2 | 1 | 70.0 | 89.5 | 16 / 35 | 5803 |
| 3 | 1 | 70.7 | 90.5 | 22 / 35 | 5991 |
| 4 | 1 | 69.6 | 86.0 | 17 / 35 | 5976 |
| 5 | 1 | 72.0 | 93.7 | 23 / 35 | 6326 |
| 6 | 1 | 71.1 | 91.7 | 21 / 35 | 5973 |
| 7 | 1 | 71.1 | 91.4 | 24 / 35 | 5573 |
| 8 | 1 | 70.9 | 90.8 | 19 / 35 | 6087 |
| 9 | 1 | 72.5 | 94.9 | 26 / 35 | 6541 |
| 10 | 1 | 71.6 | 93.0 | 23 / 35 | 5933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 126 | 60% |
| jje.BagPuss 1.2 | 46 | 74% |
| myl.nano.Graviton 1.10 | 36 | 89% |
| sul.Lunar 1.1 | 35 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 22 | 73% |
| fm.claire 1.7 | 15 | 80% |
| hvilela.HVilela 0.9 | 4 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 145 of 350 rounds, at a mean tick of 1572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 38% | 0 |
| jje.BagPuss 1.2 | 38 | 26% | 116 |
| sul.Lunar 1.1 | 17 | 12% | 78 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 7% | 33 |
| fm.claire 1.7 | 10 | 7% | 30 |
| myl.nano.Graviton 1.10 | 8 | 6% | 52 |
| hvilela.HVilela 0.9 | 4 | 3% | 22 |
| wit.Deep7 2.0 | 2 | 1% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 331 rounds): 318099 melee ticks, 148100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (331 rounds): longest scan gap while four or more were alive 77 ticks (331 rounds over 8); rounds whose longest gap at any count was over 8: 331; robots dropped as dead without a death event: 2.

Targeting waves (331 rounds): 96050 sent, 88082 reached their opponent, 12574 virtual hits (14.3% of those reached).

## Melee bench: F46

hadur117.Hadur 3.24aa against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 10 battles (24.9 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.8 | 126 / 350 | 2.27 | 17.5% | 46607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.24aa | 1.3 | 17.5% | 126 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.5% | 130 |
| kc.mini.Mirage 0.2 | 2.5 | 16.4% | 79 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 2 |
| cx.Princess 1.0 | 5.2 | 9.6% | 11 |
| sadoner.killer 0.2 | 5.6 | 9.0% | 2 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 10 / 35 | 4789 |
| 2 | 2 | 67.0 | 83.5 | 13 / 35 | 4665 |
| 3 | 1 | 66.7 | 84.4 | 12 / 35 | 4346 |
| 4 | 2 | 67.4 | 83.5 | 13 / 35 | 4686 |
| 5 | 1 | 67.5 | 86.3 | 11 / 35 | 4640 |
| 6 | 2 | 66.5 | 84.8 | 10 / 35 | 4213 |
| 7 | 1 | 68.5 | 87.3 | 13 / 35 | 5168 |
| 8 | 1 | 68.7 | 88.3 | 18 / 35 | 4684 |
| 9 | 1 | 67.7 | 87.3 | 11 / 35 | 4801 |
| 10 | 1 | 67.8 | 85.4 | 15 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 113 | 72% |
| rsalesc.melee.Medina 0.4.5 | 84 | 26% |
| mz.MicroSheep 1.0 | 12 | 100% |
| cx.Princess 1.0 | 10 | 60% |
| sadoner.killer 0.2 | 4 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 224 of 350 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 92 | 41% | 114 |
| kc.mini.Mirage 0.2 | 88 | 39% | 159 |
| sadoner.killer 0.2 | 12 | 5% | 16 |
| mz.MicroSheep 1.0 | 10 | 4% | 25 |
| cx.Princess 1.0 | 10 | 4% | 17 |
| arthord.NanoSatanMelee Beta | 8 | 4% | 12 |
| kurios.DOSexe .9a | 3 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 0% | 3 |

Posture (Hadur's M records, 333 rounds): 254603 melee ticks, 79079 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 41 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 72517 sent, 64111 reached their opponent, 9115 virtual hits (14.2% of those reached).

