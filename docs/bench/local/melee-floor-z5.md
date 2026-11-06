# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475122. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.8 | 45 / 210 | 2.46 | 17.3% | 32981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 139 |
| hadur117.Hadur 3.21z5 | 2.0 | 17.3% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.3% | 2 |
| sgp.JollyNinja 3.53 | 4.0 | 11.5% | 20 |
| mz.MicroGodMelee 1 | 5.2 | 9.7% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.6% | 3 |
| adt.Ar2 1.0 | 6.8 | 8.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 83.5 | 8 / 35 | 5496 |
| 2 | 2 | 67.4 | 83.5 | 7 / 35 | 5738 |
| 3 | 2 | 66.3 | 81.6 | 8 / 35 | 5246 |
| 4 | 2 | 68.3 | 86.7 | 10 / 35 | 5540 |
| 5 | 2 | 67.5 | 84.4 | 5 / 35 | 5544 |
| 6 | 2 | 66.8 | 82.9 | 7 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 11% |
| sgp.JollyNinja 3.53 | 20 | 50% |
| mz.MicroGodMelee 1 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 3 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 65% | 125 |
| lorneswork.Predator 1.0 | 16 | 10% | 19 |
| sgp.JollyNinja 3.53 | 15 | 9% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 7% | 18 |
| mz.MicroGodMelee 1 | 6 | 4% | 14 |
| adt.Ar2 1.0 | 5 | 3% | 8 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 131219 melee ticks, 83779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 114 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 114 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41929 sent, 36973 reached their opponent, 6980 virtual hits (18.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481551. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.6 | 108 / 210 | 2.30 | 19.3% | 34075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.3% | 108 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.4% | 27 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.5% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.7% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.2% | 17 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.9% | 1 |
| sch.Simone 0.3d | 7.0 | 7.6% | 7 |
| Noran.BitchingElk 0.054 | 7.3 | 7.1% | 7 |
| stelo.PatternRobot 1.0 | 9.3 | 5.0% | 2 |
| fullsail.SweetTea 1.1 | 9.5 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.5 | 18 / 35 | 5501 |
| 2 | 1 | 68.3 | 82.5 | 19 / 35 | 5544 |
| 3 | 1 | 69.2 | 86.0 | 18 / 35 | 5678 |
| 4 | 1 | 70.4 | 87.0 | 18 / 35 | 6257 |
| 5 | 1 | 69.2 | 85.7 | 19 / 35 | 5661 |
| 6 | 1 | 69.7 | 88.6 | 16 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 64% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 27 | 67% |
| sch.Simone 0.3d | 12 | 83% |
| Noran.BitchingElk 0.054 | 11 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 27% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 21% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 18% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 16% | 23 |
| sch.Simone 0.3d | 6 | 6% | 14 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 8 |
| Noran.BitchingElk 0.054 | 4 | 4% | 14 |
| stelo.PatternRobot 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 159220 melee ticks, 50532 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 55033 sent, 50271 reached their opponent, 8219 virtual hits (16.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483163. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.6 | 170 / 210 | 1.66 | 21.2% | 40735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.2% | 170 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 14 |
| vuen.Cake 2.51 | 3.3 | 12.2% | 13 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 10 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.5% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 23 / 35 | 6489 |
| 2 | 1 | 72.8 | 96.8 | 31 / 35 | 7292 |
| 3 | 1 | 72.7 | 95.2 | 31 / 35 | 7153 |
| 4 | 1 | 70.6 | 90.5 | 28 / 35 | 6408 |
| 5 | 1 | 72.4 | 94.3 | 29 / 35 | 6906 |
| 6 | 1 | 70.8 | 88.9 | 28 / 35 | 6487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 97% |
| vuen.Cake 2.51 | 63 | 90% |
| kawigi.nano.Lib 1.0 | 35 | 97% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| urdos.URDOS 1.3 | 6 | 83% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 40% | 73 |
| vuen.Cake 2.51 | 11 | 28% | 76 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 13% | 5 |
| urdos.URDOS 1.3 | 4 | 10% | 11 |
| kawigi.nano.Lib 1.0 | 3 | 8% | 29 |
| adt.Ar1 2.1 | 1 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 122325 melee ticks, 47028 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36671 sent, 31933 reached their opponent, 7942 virtual hits (24.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480742. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 94 over 6 battles (15.7 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.7 | 35 / 210 | 2.29 | 18.1% | 36044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 162 |
| hadur117.Hadur 3.21z5 | 2.0 | 18.1% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 11 |
| TNT.TNT 0.99.1 | 4.2 | 10.8% | 1 |
| josago.Jorgito 0.16 | 4.8 | 8.7% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.1% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 87.6 | 5 / 35 | 5962 |
| 2 | 2 | 68.8 | 87.0 | 5 / 35 | 5932 |
| 3 | 2 | 68.9 | 85.1 | 9 / 35 | 5746 |
| 4 | 2 | 68.1 | 82.9 | 5 / 35 | 5951 |
| 5 | 2 | 69.1 | 84.4 | 4 / 35 | 6126 |
| 6 | 2 | 69.8 | 87.3 | 7 / 35 | 6327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 140 | 14% |
| apc.LeeroyJenkins2 1.0 | 17 | 65% |
| TNT.TNT 0.99.1 | 6 | 83% |

Hadur died in 175 of 210 rounds, at a mean tick of 1249. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 130 | 74% | 149 |
| apc.LeeroyJenkins2 1.0 | 23 | 13% | 35 |
| josago.Jorgito 0.16 | 10 | 6% | 10 |
| TNT.TNT 0.99.1 | 7 | 4% | 11 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 183103 melee ticks, 72462 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55234 sent, 50375 reached their opponent, 7108 virtual hits (14.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471634. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.3 | 39 / 210 | 2.87 | 15.9% | 26234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.9% | 106 |
| justin.DemonicRage 3.4 | 1.8 | 16.5% | 49 |
| hadur117.Hadur 3.21z5 | 2.8 | 15.9% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 11 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 5 |
| ms.Ares 0.19 | 5.5 | 9.1% | 0 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.2 | 5 / 35 | 4306 |
| 2 | 3 | 65.5 | 80.6 | 10 / 35 | 4256 |
| 3 | 3 | 64.0 | 76.8 | 2 / 35 | 4178 |
| 4 | 3 | 65.2 | 77.8 | 7 / 35 | 4368 |
| 5 | 3 | 65.9 | 78.7 | 7 / 35 | 4885 |
| 6 | 3 | 65.2 | 79.4 | 8 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 42 | 38% |
| cb.fire.Firestarter 2.0f | 35 | 14% |
| wompi.Numbat 2.1 | 18 | 67% |
| axeBots.HataMoto 3.09 | 6 | 83% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 60 | 35% | 67 |
| justin.DemonicRage 3.4 | 59 | 35% | 77 |
| wompi.Numbat 2.1 | 30 | 18% | 40 |
| axeBots.HataMoto 3.09 | 9 | 5% | 13 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 151120 melee ticks, 35397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45492 sent, 40420 reached their opponent, 6395 virtual hits (15.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471661. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.7 | 164 / 210 | 1.48 | 21.3% | 35501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.3% | 164 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 11 |
| origin.SleepSiphon 1.7b | 2.7 | 13.3% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.0% | 9 |
| mld.Wisdom 1.0 | 5.2 | 10.3% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.2% | 1 |
| spinnercat.Omen 1.0 | 8.2 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 27 / 35 | 5989 |
| 2 | 1 | 71.2 | 93.0 | 24 / 35 | 5395 |
| 3 | 1 | 72.0 | 94.3 | 27 / 35 | 6112 |
| 4 | 1 | 72.8 | 97.1 | 30 / 35 | 6136 |
| 5 | 1 | 72.3 | 94.9 | 27 / 35 | 6154 |
| 6 | 1 | 72.3 | 94.6 | 29 / 35 | 5715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 97% |
| origin.SleepSiphon 1.7b | 52 | 85% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 85% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 100% |
| mld.Wisdom 1.0 | 6 | 83% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 16 | 33% | 68 |
| jekl.StoneGhost 0.7 | 14 | 29% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 23% | 43 |
| mld.Wisdom 1.0 | 5 | 10% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 10 |
| gg.Wolverine 2.0 | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 143292 melee ticks, 46446 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 81 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43324 sent, 38524 reached their opponent, 7896 virtual hits (20.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474654. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 96.0 | 160 / 210 | 1.32 | 26.1% | 47203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 26.1% | 160 |
| rtk.Tachikoma 1.0 | 2.0 | 18.6% | 24 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.6% | 12 |
| franzor.Lizt 1.3.1 | 3.7 | 12.7% | 15 |
| lrem.micro.MoggFanatic 0.2 | 4.8 | 10.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 9.0% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 5.9% | 0 |
| sample.Target 1.0 | 8.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.6 | 97.1 | 28 / 35 | 7999 |
| 2 | 1 | 75.9 | 95.7 | 26 / 35 | 8408 |
| 3 | 1 | 75.7 | 97.1 | 29 / 35 | 7859 |
| 4 | 1 | 75.2 | 93.9 | 24 / 35 | 7658 |
| 5 | 1 | 75.2 | 95.7 | 26 / 35 | 7656 |
| 6 | 1 | 75.3 | 96.1 | 27 / 35 | 7623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 113 | 83% |
| franzor.Lizt 1.3.1 | 43 | 79% |
| oog.melee.CapuletDroid 1.1 | 36 | 83% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 31 | 62% | 137 |
| franzor.Lizt 1.3.1 | 10 | 20% | 6 |
| oog.melee.CapuletDroid 1.1 | 8 | 16% | 54 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 5 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 189791 melee ticks, 91295 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 24 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51208 sent, 46999 reached their opponent, 9253 virtual hits (19.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490088. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 6 battles (44.8 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.0 | 155 / 210 | 1.48 | 23.1% | 32480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 23.1% | 155 |
| tm.Yuugao 1.0 | 2.3 | 15.3% | 24 |
| shrub.Vapour v159 | 2.7 | 13.9% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 11.6% | 6 |
| m3thos.Eva00 1.1 | 5.2 | 9.3% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.1% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 5.7% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.1 | 26 / 35 | 5454 |
| 2 | 1 | 71.7 | 95.4 | 27 / 35 | 5390 |
| 3 | 1 | 70.9 | 92.5 | 24 / 35 | 5314 |
| 4 | 1 | 71.9 | 95.0 | 27 / 35 | 5504 |
| 5 | 1 | 71.6 | 92.9 | 26 / 35 | 5464 |
| 6 | 1 | 70.9 | 92.5 | 25 / 35 | 5354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 81 | 83% |
| shrub.Vapour v159 | 47 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 40 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| m3thos.Eva00 1.1 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 21 | 38% | 53 |
| tm.Yuugao 1.0 | 18 | 32% | 77 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 16% | 39 |
| m3thos.Eva00 1.1 | 3 | 5% | 11 |
| SHAM.WOW 1.4 | 2 | 4% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 2% | 17 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 143880 melee ticks, 54828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42643 sent, 38181 reached their opponent, 6672 virtual hits (17.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479050. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.4 | 64 / 210 | 2.94 | 16.0% | 23529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 101 |
| hadur117.Hadur 3.21z5 | 1.8 | 16.0% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 13 |
| yagami.Tidus 0.11 | 4.8 | 10.2% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 14 |
| mc2.enemy.Original 0.9 | 5.3 | 9.5% | 15 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.0 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.4% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.9 | 12 / 35 | 4073 |
| 2 | 2 | 66.0 | 80.3 | 11 / 35 | 4224 |
| 3 | 2 | 63.6 | 74.3 | 10 / 35 | 3876 |
| 4 | 2 | 64.4 | 79.4 | 10 / 35 | 3705 |
| 5 | 2 | 64.3 | 76.5 | 11 / 35 | 3974 |
| 6 | 2 | 63.9 | 77.1 | 10 / 35 | 3677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 51 | 31% |
| kc.micro.Figment 1.0 | 28 | 86% |
| yagami.Tidus 0.11 | 11 | 100% |
| pedersen.Grishnakh 1.0 | 11 | 64% |
| mc2.enemy.Original 0.9 | 7 | 43% |
| dft.Calliope 5.6 | 3 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 42% | 79 |
| kc.micro.Figment 1.0 | 27 | 18% | 48 |
| mc2.enemy.Original 0.9 | 16 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 15 | 10% | 20 |
| yagami.Tidus 0.11 | 14 | 10% | 23 |
| dft.Calliope 5.6 | 5 | 3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 147853 melee ticks, 33258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 3.

Targeting waves (201 rounds): 47481 sent, 42644 reached their opponent, 5869 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497435. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.9 | 161 / 210 | 1.46 | 21.0% | 36392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.0% | 161 |
| DTF.Kludgy 1.2b | 2.0 | 14.6% | 28 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 8 |
| ejb.Polaris 1.0.1 | 3.7 | 12.5% | 10 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 1 |
| kurios.DOSexe .9b | 7.8 | 5.2% | 0 |
| sam.Samspin 1.0 | 7.8 | 5.1% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.9 | 28 / 35 | 5872 |
| 2 | 1 | 70.8 | 92.1 | 23 / 35 | 6028 |
| 3 | 1 | 71.7 | 96.2 | 27 / 35 | 6155 |
| 4 | 1 | 72.6 | 96.5 | 29 / 35 | 6467 |
| 5 | 1 | 71.7 | 94.3 | 28 / 35 | 6009 |
| 6 | 1 | 71.6 | 94.6 | 26 / 35 | 5861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 74 | 76% |
| ejb.Polaris 1.0.1 | 40 | 90% |
| ne.Chimera 1.2 | 33 | 88% |
| vStar.RAFzilla 2.15 | 18 | 100% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 42% | 74 |
| ne.Chimera 1.2 | 12 | 24% | 41 |
| ejb.Polaris 1.0.1 | 7 | 14% | 45 |
| vStar.RAFzilla 2.15 | 5 | 10% | 22 |
| sam.Samspin 1.0 | 2 | 4% | 5 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 135423 melee ticks, 57193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 81 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 43651 sent, 38882 reached their opponent, 6970 virtual hits (17.9% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472432. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.3 | 73 / 210 | 2.60 | 16.8% | 25084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.3 | 16.8% | 73 |
| rz.Aleph 0.34 | 1.7 | 16.7% | 70 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 25 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 13 |
| rdt199.Warlord 0.73 | 5.5 | 9.5% | 10 |
| uji.YellohFellah 1.0 | 6.3 | 8.2% | 10 |
| br2.MobyDickBot 1.6 | 6.5 | 8.4% | 7 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 79.0 | 11 / 35 | 4293 |
| 2 | 1 | 66.5 | 84.4 | 14 / 35 | 4243 |
| 3 | 1 | 67.1 | 88.3 | 11 / 35 | 4244 |
| 4 | 1 | 68.2 | 89.2 | 18 / 35 | 4553 |
| 5 | 2 | 63.9 | 77.1 | 10 / 35 | 3925 |
| 6 | 2 | 63.1 | 75.6 | 9 / 35 | 3826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 67 | 52% |
| djc.DynaBot 0.1.1 | 19 | 63% |
| cx.mini.Nimrod 0.55 | 17 | 59% |
| rdt199.Warlord 0.73 | 12 | 58% |
| uji.YellohFellah 1.0 | 8 | 50% |
| br2.MobyDickBot 1.6 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 59 | 43% | 94 |
| cx.mini.Nimrod 0.55 | 21 | 15% | 28 |
| rdt199.Warlord 0.73 | 17 | 12% | 30 |
| djc.DynaBot 0.1.1 | 14 | 10% | 21 |
| uji.YellohFellah 1.0 | 11 | 8% | 17 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 9 |
| br2.MobyDickBot 1.6 | 6 | 4% | 8 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 151247 melee ticks, 41466 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 48238 sent, 43317 reached their opponent, 5646 virtual hits (13.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490967. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.9 | 124 / 210 | 2.09 | 18.6% | 25677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 18.6% | 124 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.0% | 29 |
| darkcanuck.Leon 1.01 | 3.3 | 12.8% | 20 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 23 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.1% | 7 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.4% | 2 |
| stuff.Vlad 0.1 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.3 | 21 / 35 | 4331 |
| 2 | 1 | 69.2 | 90.5 | 22 / 35 | 4429 |
| 3 | 1 | 66.8 | 83.5 | 16 / 35 | 4489 |
| 4 | 1 | 69.3 | 91.4 | 22 / 35 | 4290 |
| 5 | 1 | 67.8 | 87.6 | 21 / 35 | 3983 |
| 6 | 1 | 68.0 | 87.0 | 22 / 35 | 4155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 74% |
| nat.PallasHawk 1.0 | 42 | 74% |
| darkcanuck.Leon 1.01 | 41 | 90% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 30 | 34% | 53 |
| nat.PallasHawk 1.0 | 23 | 26% | 56 |
| brainfade.melee.Genghis 0.36 | 12 | 13% | 19 |
| darkcanuck.Leon 1.01 | 9 | 10% | 55 |
| jrm.Test0 1.0 | 9 | 10% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 9 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 130033 melee ticks, 37052 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43438 sent, 38272 reached their opponent, 6133 virtual hits (16.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482842. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.3 | 49 / 210 | 2.77 | 15.9% | 26309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.4% | 38 |
| mn.Combat 3.25.0 | 1.7 | 16.7% | 97 |
| hadur117.Hadur 3.21z5 | 2.7 | 15.9% | 49 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 21 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.4% | 0 |
| maribo.FollowFire 1 | 8.3 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 77.5 | 5 / 35 | 4129 |
| 2 | 3 | 64.6 | 78.7 | 7 / 35 | 4350 |
| 3 | 3 | 64.5 | 77.8 | 7 / 35 | 4365 |
| 4 | 3 | 65.1 | 80.3 | 8 / 35 | 4215 |
| 5 | 1 | 68.6 | 89.2 | 18 / 35 | 5006 |
| 6 | 3 | 63.9 | 78.4 | 4 / 35 | 4244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 48 | 56% |
| mn.Combat 3.25.0 | 44 | 23% |
| shinh.Entangled 0.3 | 15 | 47% |
| gh.micro.Gruweltje 0.7 | 5 | 80% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 33% | 65 |
| ags.Glacier 0.2.11 | 51 | 31% | 71 |
| shinh.Entangled 0.3 | 34 | 21% | 41 |
| gh.micro.Gruweltje 0.7 | 12 | 7% | 19 |
| stelo.Wang 1.0 | 6 | 4% | 7 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 140833 melee ticks, 37644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 98 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40304 sent, 35248 reached their opponent, 5529 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478559. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 95.4 | 187 / 210 | 1.37 | 24.3% | 38488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 24.3% | 187 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.5% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 3.5 | 11.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 10.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.5 | 9.7% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.7% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 0 |
| pa.Improved 1.0 | 8.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.6 | 29 / 35 | 6214 |
| 2 | 1 | 72.8 | 95.7 | 32 / 35 | 6134 |
| 3 | 1 | 72.0 | 92.9 | 31 / 35 | 6218 |
| 4 | 1 | 74.1 | 97.5 | 32 / 35 | 6963 |
| 5 | 1 | 72.7 | 95.4 | 32 / 35 | 6179 |
| 6 | 1 | 73.9 | 96.4 | 31 / 35 | 6780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 115 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 87% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 23 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 10 | 43% | 106 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 13% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 13% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 13% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 9% | 33 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 9% | 14 |
| pa.Improved 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 198 rounds): 119046 melee ticks, 51068 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 34477 sent, 30321 reached their opponent, 7530 virtual hits (24.8% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487052. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.2 | 124 / 210 | 1.98 | 19.9% | 34062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.9% | 124 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 19 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 54 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 6 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.4% | 3 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.6% | 5 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.6% | 0 |
| divineomega.TrialBot 0.003 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 24 / 35 | 6024 |
| 2 | 1 | 69.8 | 89.5 | 20 / 35 | 5527 |
| 3 | 1 | 70.9 | 90.2 | 23 / 35 | 5994 |
| 4 | 1 | 70.4 | 90.2 | 22 / 35 | 5651 |
| 5 | 1 | 69.4 | 86.7 | 18 / 35 | 5675 |
| 6 | 1 | 68.9 | 86.0 | 17 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 54 | 56% |
| kawigi.micro.Shiz 1.1 | 47 | 98% |
| mld.DustBunny 3.8 | 32 | 97% |
| kawigi.robot.Girl 1.2 | 11 | 82% |
| cb.nano.Insomnia 1.0 | 6 | 83% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 46% | 77 |
| mld.DustBunny 3.8 | 14 | 16% | 46 |
| kawigi.micro.Shiz 1.1 | 10 | 11% | 29 |
| kawigi.robot.Girl 1.2 | 8 | 9% | 17 |
| cb.nano.Insomnia 1.0 | 8 | 9% | 13 |
| lambdaxy.TBot 0.1 | 3 | 3% | 8 |
| divineomega.TrialBot 0.003 | 1 | 1% | 14 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 164039 melee ticks, 46283 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 851 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 138 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52236 sent, 47272 reached their opponent, 7356 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479687. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.6 | 130 / 210 | 1.85 | 20.6% | 37127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.6% | 130 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 20 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 3 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.3% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.3 | 23 / 35 | 6350 |
| 2 | 1 | 71.3 | 92.1 | 21 / 35 | 6089 |
| 3 | 1 | 70.5 | 87.9 | 20 / 35 | 6053 |
| 4 | 1 | 71.8 | 92.4 | 22 / 35 | 6295 |
| 5 | 1 | 70.2 | 85.7 | 22 / 35 | 6120 |
| 6 | 1 | 71.6 | 92.1 | 22 / 35 | 6220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 94 | 76% |
| techdude.forest.FlamingForest 1.1 | 24 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| bvh.fnr.Fenrir 0.36l | 10 | 70% |
| tvv.nano.Polaris 1.2 | 8 | 75% |
| stelo.IntrinsicVolatility 1.4 | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1129. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 30 | 37% | 96 |
| techdude.forest.FlamingForest 1.1 | 17 | 21% | 33 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 16% | 28 |
| bvh.fnr.Fenrir 0.36l | 10 | 12% | 19 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 168020 melee ticks, 62112 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52865 sent, 48169 reached their opponent, 7681 virtual hits (15.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488157. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.1 | 107 / 210 | 2.16 | 19.6% | 36138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.6% | 107 |
| et.Predator 1.8 | 2.5 | 13.5% | 23 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.0% | 32 |
| cx.BlestPain 1.41 | 3.5 | 12.4% | 36 |
| ahf.NanoAndrew .4 | 5.2 | 10.5% | 7 |
| maribo.melee.BMV 0.1 | 6.2 | 9.0% | 2 |
| nic.Nicator 2.4 | 6.7 | 8.6% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 20 / 35 | 6235 |
| 2 | 1 | 70.8 | 88.9 | 21 / 35 | 6210 |
| 3 | 1 | 68.8 | 82.5 | 14 / 35 | 5947 |
| 4 | 1 | 69.2 | 84.8 | 19 / 35 | 5680 |
| 5 | 1 | 69.9 | 87.3 | 16 / 35 | 6056 |
| 6 | 1 | 69.8 | 87.3 | 17 / 35 | 6010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 62 | 79% |
| oog.melee.Mercutio 1.0 | 41 | 63% |
| cx.BlestPain 1.41 | 33 | 36% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 31 | 30% | 47 |
| oog.melee.Mercutio 1.0 | 25 | 24% | 51 |
| et.Predator 1.8 | 24 | 23% | 65 |
| ahf.NanoAndrew .4 | 10 | 10% | 21 |
| maribo.melee.BMV 0.1 | 7 | 7% | 11 |
| nic.Nicator 2.4 | 3 | 3% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 2 |

Posture (Hadur's M records, 199 rounds): 156053 melee ticks, 62759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50867 sent, 46013 reached their opponent, 9033 virtual hits (19.6% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485207. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.6 | 162 / 210 | 1.60 | 22.9% | 30878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 22.9% | 162 |
| agd.Mooserwirt2 2.7 | 2.2 | 14.2% | 23 |
| uji.DBH 1.1 | 2.8 | 12.7% | 11 |
| sigterm.Sigterm 1.0 | 4.5 | 10.6% | 7 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.4% | 0 |
| ratosh.Nobo 0.21 | 5.7 | 9.4% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 8.4% | 2 |
| stelo.WangRobot 1.0 | 8.2 | 6.4% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.7 | 30 / 35 | 5540 |
| 2 | 1 | 69.0 | 87.9 | 23 / 35 | 4929 |
| 3 | 1 | 71.0 | 93.6 | 27 / 35 | 5011 |
| 4 | 1 | 70.6 | 91.4 | 26 / 35 | 5398 |
| 5 | 1 | 70.5 | 91.8 | 27 / 35 | 4846 |
| 6 | 1 | 71.6 | 95.0 | 29 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 56 | 89% |
| uji.DBH 1.1 | 40 | 88% |
| sigterm.Sigterm 1.0 | 40 | 88% |
| ratosh.Nobo 0.21 | 15 | 87% |
| stelo.WangRobot 1.0 | 11 | 91% |
| spinnercat.Robovirus 2.718 | 10 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 16 | 33% | 59 |
| sigterm.Sigterm 1.0 | 11 | 22% | 43 |
| uji.DBH 1.1 | 9 | 18% | 36 |
| ratosh.Nobo 0.21 | 4 | 8% | 20 |
| spinnercat.Robovirus 2.718 | 3 | 6% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 6% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 6 |
| stelo.WangRobot 1.0 | 1 | 2% | 8 |

Posture (Hadur's M records, 199 rounds): 126905 melee ticks, 49725 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38817 sent, 34493 reached their opponent, 7347 virtual hits (21.3% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479088. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.0 | 191 / 210 | 1.27 | 22.9% | 40441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 22.9% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.1% | 3 |
| mld.Infinity 2.2 | 3.7 | 11.9% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.6% | 5 |
| erdnis.Rover 0.3 | 4.5 | 11.0% | 5 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.0% | 0 |
| pac.ABC 2.1 | 7.3 | 6.8% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 96.8 | 32 / 35 | 7047 |
| 2 | 1 | 74.1 | 97.8 | 33 / 35 | 6703 |
| 3 | 1 | 74.0 | 97.5 | 32 / 35 | 6754 |
| 4 | 1 | 74.2 | 97.8 | 33 / 35 | 6925 |
| 5 | 1 | 73.2 | 94.6 | 30 / 35 | 6433 |
| 6 | 1 | 73.8 | 97.8 | 31 / 35 | 6579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 111 | 98% |
| mld.Infinity 2.2 | 34 | 97% |
| krillr.mini.JointStrike 2.0.0 | 25 | 92% |
| erdnis.Rover 0.3 | 15 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 20 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 6 | 30% | 29 |
| erdnis.Rover 0.3 | 4 | 20% | 34 |
| mld.Infinity 2.2 | 4 | 20% | 32 |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 15% | 70 |
| patson.PatsonTestBot 1.0 | 2 | 10% | 18 |
| pac.ABC 2.1 | 1 | 5% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 123111 melee ticks, 45734 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40849 sent, 36075 reached their opponent, 7875 virtual hits (21.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476669. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.0 | 142 / 210 | 1.54 | 21.6% | 39070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.6% | 142 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 41 |
| catcat20.Rabbit 0.001 | 3.3 | 10.9% | 15 |
| fwb.Nine 1.0.1 | 3.7 | 11.3% | 6 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 9.9% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 5.9% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 95.2 | 25 / 35 | 6770 |
| 2 | 1 | 72.4 | 94.6 | 24 / 35 | 6474 |
| 3 | 1 | 70.9 | 89.8 | 20 / 35 | 6484 |
| 4 | 1 | 71.5 | 94.3 | 21 / 35 | 6194 |
| 5 | 1 | 72.8 | 95.2 | 25 / 35 | 6736 |
| 6 | 1 | 72.7 | 94.9 | 27 / 35 | 6412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 97 | 73% |
| fwb.Nine 1.0.1 | 40 | 95% |
| catcat20.Rabbit 0.001 | 35 | 60% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 50% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |

Hadur died in 68 of 210 rounds, at a mean tick of 1108. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 59% | 106 |
| catcat20.Rabbit 0.001 | 15 | 22% | 49 |
| fwb.Nine 1.0.1 | 8 | 12% | 18 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 14 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 4 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 159825 melee ticks, 62360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48353 sent, 43541 reached their opponent, 9236 virtual hits (21.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489552. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.3 | 144 / 210 | 1.51 | 21.4% | 37633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.4% | 144 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 57 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 2 |
| oa.weak.BotherBot 0.1 | 5.3 | 7.8% | 0 |
| eld.Hmm 1.0 | 5.7 | 7.5% | 2 |
| fire219.CatBot 1.0 | 7.7 | 5.8% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.3 | 26 / 35 | 6473 |
| 2 | 1 | 70.8 | 90.5 | 19 / 35 | 5784 |
| 3 | 1 | 72.4 | 96.5 | 26 / 35 | 6304 |
| 4 | 1 | 72.5 | 95.9 | 24 / 35 | 6475 |
| 5 | 1 | 73.1 | 96.8 | 26 / 35 | 6523 |
| 6 | 1 | 71.7 | 93.0 | 23 / 35 | 6074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 63% |
| dummy.mini.Scimitar 1.01 | 36 | 92% |
| cf.RiO.RiOx 4.2.1 | 28 | 100% |
| eld.Hmm 1.0 | 4 | 75% |
| oa.weak.BotherBot 0.1 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 47 | 68% | 101 |
| dummy.mini.Scimitar 1.01 | 13 | 19% | 47 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| cf.RiO.RiOx 4.2.1 | 2 | 3% | 29 |
| eld.Hmm 1.0 | 2 | 3% | 21 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 173032 melee ticks, 81078 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 96 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49413 sent, 44675 reached their opponent, 7171 virtual hits (16.1% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477304. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.5 | 92 / 210 | 2.16 | 19.8% | 27683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.2 | 19.8% | 92 |
| pe.SandboxDT 2.71m | 2.2 | 18.0% | 62 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.7% | 29 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.5% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 5 |
| yk.JahRoslav 1.1 | 6.3 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.2 | 5.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.4 | 15 / 35 | 4651 |
| 2 | 1 | 68.0 | 85.0 | 15 / 35 | 4653 |
| 3 | 1 | 66.9 | 82.1 | 15 / 35 | 4420 |
| 4 | 1 | 68.7 | 87.5 | 17 / 35 | 4854 |
| 5 | 2 | 68.0 | 84.3 | 13 / 35 | 4442 |
| 6 | 1 | 68.9 | 87.9 | 17 / 35 | 4663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 59 | 49% |
| kvk.HebusLeTroll 0.35 | 38 | 66% |
| jlm.javaDisturbance 0.59 | 36 | 72% |
| bigpete.Stewie 1.0 | 14 | 86% |

Hadur died in 119 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 37% | 81 |
| jlm.javaDisturbance 0.59 | 31 | 26% | 51 |
| kvk.HebusLeTroll 0.35 | 29 | 24% | 52 |
| bigpete.Stewie 1.0 | 7 | 6% | 17 |
| tad.Dalek98 0.98 | 5 | 4% | 6 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 152773 melee ticks, 44325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 18 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44270 sent, 39858 reached their opponent, 5274 virtual hits (13.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470518. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 98.2 | 185 / 210 | 1.16 | 23.0% | 41607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 23.0% | 185 |
| pe.SandboxLump 1.52 | 2.0 | 15.8% | 17 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 8.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.8% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 7.7% | 0 |
| sample.Walls 1.0 | 7.8 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 97.8 | 29 / 35 | 7118 |
| 2 | 1 | 73.3 | 96.8 | 29 / 35 | 6606 |
| 3 | 1 | 74.5 | 99.0 | 32 / 35 | 6957 |
| 4 | 1 | 74.4 | 98.1 | 31 / 35 | 7221 |
| 5 | 1 | 74.5 | 99.0 | 33 / 35 | 7007 |
| 6 | 1 | 73.9 | 98.4 | 31 / 35 | 6698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 104 | 88% |
| cre.Karolos 0.32 | 59 | 97% |
| stelo.AreaTargetingBot 1.1 | 14 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 52% | 99 |
| cre.Karolos 0.32 | 7 | 28% | 54 |
| stelo.RamTrackSurfer 1.2 | 2 | 8% | 15 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 9 |
| cw.megas.Blade 0.8 | 1 | 4% | 8 |
| sample.Walls 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 120929 melee ticks, 52240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37381 sent, 32486 reached their opponent, 9350 virtual hits (28.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472532. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 6 battles (28.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.0 | 88 / 210 | 2.44 | 17.6% | 27043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 17.6% | 88 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.3% | 34 |
| florent.XSeries.X2 0.12 | 3.0 | 13.5% | 32 |
| davidalves.Phoenix 0.54 | 3.8 | 12.5% | 32 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.3% | 14 |
| oog.melee.Corsair 1.0 | 5.8 | 9.8% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.4% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.5% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 16 / 35 | 4757 |
| 2 | 1 | 67.0 | 84.8 | 13 / 35 | 4513 |
| 3 | 1 | 67.2 | 83.8 | 13 / 35 | 4594 |
| 4 | 1 | 66.9 | 83.2 | 14 / 35 | 4440 |
| 5 | 1 | 65.4 | 80.3 | 12 / 35 | 4275 |
| 6 | 1 | 67.9 | 85.1 | 20 / 35 | 4464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 50 | 64% |
| davidalves.Phoenix 0.54 | 34 | 47% |
| florent.XSeries.X2 0.12 | 21 | 57% |
| pedersen.Ugluk 1.1.1 | 20 | 75% |
| oog.melee.Corsair 1.0 | 9 | 67% |
| lunchie.Lunchbox 0.93 | 5 | 100% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 32% | 68 |
| davidalves.Phoenix 0.54 | 28 | 23% | 41 |
| florent.XSeries.X2 0.12 | 21 | 17% | 39 |
| pedersen.Ugluk 1.1.1 | 17 | 14% | 27 |
| oog.melee.Corsair 1.0 | 11 | 9% | 22 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 5 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| evd.X1 0.01 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 136413 melee ticks, 38610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 46 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 3.

Targeting waves (198 rounds): 43991 sent, 38855 reached their opponent, 6725 virtual hits (17.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479615. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.4 | 135 / 210 | 2.09 | 20.6% | 23992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.6% | 135 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 15.2% | 27 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 14.3% | 13 |
| jdw.Hurricane 1.4 | 3.5 | 13.4% | 20 |
| ds.Oo 2.2 | 5.0 | 10.0% | 11 |
| adt.Ar2 1.1 | 6.3 | 7.6% | 1 |
| awesomeness.Elite 1.0 | 7.0 | 7.7% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.3% | 2 |
| amk.ChumbaMini 0.2 | 8.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.9 | 28 / 35 | 4086 |
| 2 | 1 | 65.1 | 76.1 | 16 / 35 | 3759 |
| 3 | 1 | 67.1 | 81.4 | 18 / 35 | 4074 |
| 4 | 1 | 69.5 | 90.0 | 26 / 35 | 3951 |
| 5 | 1 | 69.5 | 88.2 | 25 / 35 | 4129 |
| 6 | 1 | 69.0 | 88.6 | 22 / 35 | 3993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 83% |
| voidious.micro.BlitzBat 1.05 | 45 | 87% |
| jdw.Hurricane 1.4 | 38 | 89% |
| ds.Oo 2.2 | 14 | 86% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 20 | 26% | 56 |
| voidious.micro.BlitzBat 1.05 | 16 | 21% | 40 |
| jdw.Hurricane 1.4 | 15 | 19% | 41 |
| ds.Oo 2.2 | 10 | 13% | 26 |
| awesomeness.Elite 1.0 | 8 | 10% | 20 |
| adt.Ar2 1.1 | 5 | 6% | 16 |
| amk.ChumbaMini 0.2 | 2 | 3% | 4 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 121073 melee ticks, 26481 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 38301 sent, 33984 reached their opponent, 5374 virtual hits (15.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484912. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.9 | 146 / 210 | 1.64 | 21.3% | 40413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.3% | 146 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 33 |
| shu.nitro.LENIN .T34 | 3.5 | 12.1% | 17 |
| lrem.Spectre 0.4.4 | 3.7 | 11.9% | 6 |
| js.PinBall 1.6 | 5.0 | 10.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.7% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.7% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.8% | 3 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 20 / 35 | 6610 |
| 2 | 1 | 71.0 | 89.2 | 20 / 35 | 6531 |
| 3 | 1 | 72.2 | 92.4 | 22 / 35 | 6635 |
| 4 | 1 | 72.9 | 94.0 | 28 / 35 | 6843 |
| 5 | 1 | 72.9 | 95.6 | 27 / 35 | 6708 |
| 6 | 1 | 73.4 | 95.2 | 29 / 35 | 7086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 74% |
| shu.nitro.LENIN .T34 | 41 | 78% |
| lrem.Spectre 0.4.4 | 40 | 95% |
| js.PinBall 1.6 | 17 | 88% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 29 | 45% | 79 |
| shu.nitro.LENIN .T34 | 15 | 23% | 48 |
| lrem.Spectre 0.4.4 | 10 | 15% | 41 |
| js.PinBall 1.6 | 5 | 8% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 4 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 2 |
| sample.SpinBot 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 200 rounds): 153980 melee ticks, 49207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 48250 sent, 43315 reached their opponent, 9715 virtual hits (22.4% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474675. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.4 | 149 / 210 | 2.22 | 20.0% | 34324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.0% | 149 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 34 |
| EH.Eagle 1.0.6 | 3.0 | 11.2% | 6 |
| throxbot.ThroxBot 0.1 | 5.3 | 9.0% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 8.9% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 8.6% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.8% | 2 |
| wee.Gem 1.8.4 | 6.3 | 8.7% | 7 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 30 / 35 | 6393 |
| 2 | 1 | 68.3 | 78.4 | 21 / 35 | 5693 |
| 3 | 1 | 70.3 | 90.5 | 24 / 35 | 5658 |
| 4 | 1 | 70.6 | 92.1 | 27 / 35 | 5385 |
| 5 | 1 | 65.8 | 67.9 | 19 / 35 | 5690 |
| 6 | 1 | 71.8 | 96.8 | 28 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 100 | 88% |
| EH.Eagle 1.0.6 | 30 | 97% |
| wee.Gem 1.8.4 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 61 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 16 | 26% | 81 |
| cs.Grudge 1.0 | 14 | 23% | 16 |
| EH.Eagle 1.0.6 | 11 | 18% | 40 |
| joe.ADinosaur 1.0 | 7 | 11% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 12 |
| wee.Gem 1.8.4 | 3 | 5% | 19 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 7 |
| throxbot.ThroxBot 0.1 | 2 | 3% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 12 |

Posture (Hadur's M records, 199 rounds): 120533 melee ticks, 37331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 53 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39094 sent, 34293 reached their opponent, 7985 virtual hits (23.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479036. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.5 | 136 / 210 | 1.86 | 19.1% | 26371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.1% | 136 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 29 |
| uji.Antique 1.0 | 3.3 | 12.0% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.3% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.3% | 9 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 6 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.5% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.3 | 29 / 35 | 4643 |
| 2 | 1 | 67.6 | 88.3 | 20 / 35 | 4291 |
| 3 | 1 | 68.6 | 90.5 | 23 / 35 | 4358 |
| 4 | 1 | 69.5 | 91.4 | 23 / 35 | 4661 |
| 5 | 1 | 69.2 | 92.7 | 22 / 35 | 4356 |
| 6 | 1 | 66.7 | 85.7 | 19 / 35 | 4062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 82% |
| uji.Antique 1.0 | 44 | 84% |
| qohnil.blot.BlotBot 3.61 | 13 | 85% |
| ahr.ice.Ice 1.0.2 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 19 | 26% | 56 |
| uji.Antique 1.0 | 17 | 23% | 57 |
| pfvicm.Sobieski 7.2.3b | 14 | 19% | 27 |
| qohnil.blot.BlotBot 3.61 | 9 | 12% | 30 |
| ahr.ice.Ice 1.0.2 | 8 | 11% | 17 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 10 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 128893 melee ticks, 36385 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 42251 sent, 37500 reached their opponent, 5057 virtual hits (13.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474761. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.7 | 119 / 210 | 1.92 | 19.9% | 31019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.9% | 119 |
| deewiant.Anomaly 0.2 | 2.2 | 15.2% | 42 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.9% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 11.8% | 5 |
| jok.PheonixM 0.1.2 | 4.7 | 10.9% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.0 | 6.3% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 5.3% | 0 |
| ap.Frederick 1.1 | 8.8 | 4.4% | 2 |
| jangs.ns51 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.6 | 13 / 35 | 4864 |
| 2 | 1 | 72.3 | 94.6 | 24 / 35 | 5619 |
| 3 | 1 | 69.3 | 87.0 | 18 / 35 | 4833 |
| 4 | 1 | 71.0 | 92.1 | 22 / 35 | 4989 |
| 5 | 1 | 71.0 | 90.8 | 20 / 35 | 5180 |
| 6 | 1 | 72.0 | 93.3 | 22 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 70% |
| myl.micro.Troodon 1.10 | 22 | 95% |
| jok.PheonixM 0.1.2 | 19 | 95% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 48% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 30% | 57 |
| myl.micro.Troodon 1.10 | 10 | 11% | 29 |
| jok.PheonixM 0.1.2 | 4 | 4% | 25 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 162956 melee ticks, 54425 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 464 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 359 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 51587 sent, 46687 reached their opponent, 6686 virtual hits (14.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479198. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.8 | 82 / 210 | 2.38 | 19.2% | 27462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.2% | 82 |
| darkcanuck.B26354 1.06 | 2.3 | 15.7% | 53 |
| oog.melee.Capulet 1.2 | 3.0 | 14.5% | 36 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.7% | 25 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.7% | 7 |
| tripphippy.Alice 1.1 | 6.7 | 8.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 6.8 | 7.8% | 5 |
| ntc.Opposite 1.5 | 7.0 | 8.2% | 1 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 13 / 35 | 4555 |
| 2 | 1 | 66.4 | 82.9 | 13 / 35 | 4585 |
| 3 | 1 | 66.6 | 82.1 | 14 / 35 | 4283 |
| 4 | 1 | 66.8 | 82.9 | 12 / 35 | 4600 |
| 5 | 1 | 68.4 | 86.1 | 17 / 35 | 4825 |
| 6 | 1 | 66.3 | 80.4 | 13 / 35 | 4614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 59% |
| darkcanuck.B26354 1.06 | 36 | 53% |
| stelo.PastFuture 2.3.2 | 21 | 57% |
| intruder.PrairieWolf 2.61 | 17 | 76% |
| tripphippy.Alice 1.1 | 7 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 34% | 63 |
| oog.melee.Capulet 1.2 | 32 | 25% | 59 |
| stelo.PastFuture 2.3.2 | 26 | 20% | 41 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 8% | 11 |
| tripphippy.Alice 1.1 | 7 | 5% | 13 |
| ntc.Opposite 1.5 | 5 | 4% | 9 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 14 |

Posture (Hadur's M records, 200 rounds): 164660 melee ticks, 41125 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46432 sent, 41977 reached their opponent, 6728 virtual hits (16.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478010. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.0 | 85 / 210 | 2.44 | 17.5% | 26134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.3 | 17.5% | 85 |
| abc.Shadow 3.84i | 1.7 | 16.5% | 66 |
| gh.mini.Griezel 0.2 | 3.0 | 12.8% | 41 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.8% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 2 |
| fm.mammillarias 1.3 | 8.7 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 18 / 35 | 4664 |
| 2 | 1 | 67.4 | 84.1 | 14 / 35 | 4577 |
| 3 | 1 | 67.8 | 86.0 | 18 / 35 | 4483 |
| 4 | 1 | 67.7 | 86.3 | 15 / 35 | 4363 |
| 5 | 2 | 66.3 | 83.8 | 9 / 35 | 4237 |
| 6 | 2 | 63.5 | 73.7 | 11 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 54% |
| gh.mini.Griezel 0.2 | 41 | 61% |
| d414.nano.Quantum 1.0.0 | 15 | 87% |
| spinnercat.micro.Tyger 0.1 | 14 | 79% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 44 | 35% | 80 |
| gh.mini.Griezel 0.2 | 35 | 28% | 58 |
| spinnercat.micro.Tyger 0.1 | 15 | 12% | 21 |
| d414.nano.Quantum 1.0.0 | 13 | 10% | 24 |
| gh.nano.Grofvuil 0.2 | 8 | 6% | 13 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 3% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 151831 melee ticks, 38605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48044 sent, 43078 reached their opponent, 6594 virtual hits (15.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471259. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.6 | 132 / 210 | 1.85 | 19.4% | 30462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.4% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 49 |
| apc.botM 3.0 | 3.2 | 11.8% | 16 |
| lxx.ConceptA 0.8 | 4.7 | 10.1% | 2 |
| vjik.UnViolation 1.1 | 4.8 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 5.3 | 9.2% | 2 |
| yk.JahMicro 1.0 | 7.7 | 6.6% | 2 |
| panzer.Panzer 0.2 | 7.8 | 7.3% | 0 |
| conscience.Electron 1.3g | 8.5 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 22 / 35 | 4944 |
| 2 | 1 | 69.8 | 94.0 | 23 / 35 | 4970 |
| 3 | 1 | 68.1 | 87.6 | 20 / 35 | 4921 |
| 4 | 1 | 70.4 | 93.3 | 25 / 35 | 5356 |
| 5 | 1 | 68.3 | 88.3 | 18 / 35 | 5041 |
| 6 | 1 | 69.9 | 92.4 | 24 / 35 | 5230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 68% |
| apc.botM 3.0 | 32 | 75% |
| bayen.UbaMicro 1.4 | 13 | 100% |
| lxx.ConceptA 0.8 | 12 | 92% |
| vjik.UnViolation 1.1 | 10 | 70% |
| yk.JahMicro 1.0 | 8 | 75% |
| conscience.Electron 1.3g | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 45% | 94 |
| lxx.ConceptA 0.8 | 13 | 17% | 23 |
| apc.botM 3.0 | 12 | 15% | 40 |
| vjik.UnViolation 1.1 | 5 | 6% | 19 |
| yk.JahMicro 1.0 | 4 | 5% | 9 |
| panzer.Panzer 0.2 | 4 | 5% | 6 |
| bayen.UbaMicro 1.4 | 3 | 4% | 10 |
| conscience.Electron 1.3g | 2 | 3% | 7 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 121091 melee ticks, 51651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 40700 sent, 35711 reached their opponent, 6211 virtual hits (17.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478504. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.9 | 123 / 210 | 1.89 | 21.9% | 30084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.2 | 21.9% | 123 |
| maribo.Quester 0.3 | 1.8 | 17.8% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.1% | 25 |
| labg.Cataclysm 2.05 | 3.8 | 12.6% | 14 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 9.8% | 6 |
| baal.nano.N 1.42 | 5.5 | 9.7% | 0 |
| zyx.micro.Ant 1.1 | 7.2 | 5.9% | 1 |
| sanja.First 0.1 | 7.8 | 5.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.9 | 21 / 35 | 5095 |
| 2 | 1 | 71.5 | 91.4 | 23 / 35 | 5092 |
| 3 | 1 | 71.6 | 90.7 | 22 / 35 | 5324 |
| 4 | 2 | 67.2 | 80.0 | 12 / 35 | 4393 |
| 5 | 1 | 71.5 | 91.8 | 21 / 35 | 5305 |
| 6 | 1 | 71.2 | 90.7 | 24 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 93 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 62% |
| labg.Cataclysm 2.05 | 21 | 90% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 57% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 43% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 23% | 54 |
| labg.Cataclysm 2.05 | 11 | 13% | 31 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 13% | 14 |
| baal.nano.N 1.42 | 2 | 2% | 8 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 3 |
| sanja.First 0.1 | 2 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 158593 melee ticks, 55156 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46065 sent, 41845 reached their opponent, 5924 virtual hits (14.2% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478447. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.8 | 101 / 210 | 2.01 | 19.5% | 34826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.5% | 101 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 53 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 39 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 13 |
| tcf.Reach 3 | 4.8 | 10.8% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 14 / 35 | 5671 |
| 2 | 1 | 70.4 | 86.7 | 16 / 35 | 5974 |
| 3 | 1 | 71.0 | 89.5 | 20 / 35 | 6024 |
| 4 | 1 | 70.9 | 90.2 | 17 / 35 | 5847 |
| 5 | 1 | 71.4 | 92.7 | 20 / 35 | 6140 |
| 6 | 1 | 69.2 | 86.0 | 14 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 58% |
| kid.Gladiator .7.2 | 53 | 64% |
| jcs.Seth 1.8 | 15 | 73% |
| tcf.Reach 3 | 9 | 100% |
| cli.Dancer 1.1 | 4 | 75% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 111 of 210 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 44 | 40% | 83 |
| kid.Gladiator .7.2 | 43 | 39% | 75 |
| jcs.Seth 1.8 | 14 | 13% | 28 |
| tcf.Reach 3 | 3 | 3% | 14 |
| cli.Dancer 1.1 | 3 | 3% | 7 |
| ratosh.Wesco 1.4 | 2 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 165491 melee ticks, 60167 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 49967 sent, 45109 reached their opponent, 7247 virtual hits (16.1% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471364. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.8 | 59 / 210 | 2.46 | 16.8% | 25056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.4% | 116 |
| hadur117.Hadur 3.21z5 | 2.0 | 16.8% | 59 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.7% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.1% | 5 |
| rz.HawkOnFire 0.1 | 4.8 | 11.5% | 4 |
| wit.Chuliath 1.0 | 6.5 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 8.5 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.5 | 10 / 35 | 4398 |
| 2 | 2 | 64.7 | 79.0 | 6 / 35 | 4016 |
| 3 | 2 | 67.3 | 86.7 | 9 / 35 | 4363 |
| 4 | 2 | 66.9 | 84.8 | 14 / 35 | 4162 |
| 5 | 2 | 65.8 | 81.6 | 9 / 35 | 3999 |
| 6 | 2 | 67.1 | 87.0 | 11 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 23% |
| gh.mini.Gruwel 0.9 | 28 | 54% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 93% |
| rz.HawkOnFire 0.1 | 13 | 85% |
| wit.Chuliath 1.0 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 89 | 59% | 113 |
| gh.mini.Gruwel 0.9 | 26 | 17% | 39 |
| rz.HawkOnFire 0.1 | 19 | 13% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 9% | 25 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 145490 melee ticks, 48066 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 43602 sent, 38638 reached their opponent, 5767 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479006. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.2 | 161 / 210 | 1.70 | 21.3% | 35459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.3% | 161 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 12 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 15 |
| mz.Cork 0.1 | 4.7 | 10.8% | 7 |
| bvh.micro.Freya 0.3 | 4.7 | 10.6% | 4 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 27 / 35 | 5834 |
| 2 | 1 | 70.8 | 87.9 | 25 / 35 | 5680 |
| 3 | 1 | 71.9 | 93.3 | 26 / 35 | 6035 |
| 4 | 1 | 71.9 | 91.4 | 28 / 35 | 5862 |
| 5 | 1 | 71.9 | 93.7 | 25 / 35 | 5933 |
| 6 | 1 | 72.5 | 93.0 | 30 / 35 | 6115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 94% |
| alpha.RainingFire 1.0 | 35 | 80% |
| mz.Cork 0.1 | 32 | 94% |
| bvh.micro.Freya 0.3 | 32 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 91% |
| bvh.mini.Fenrir 0.39 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 36% | 49 |
| mz.Cork 0.1 | 8 | 16% | 36 |
| m3thos.Eva02 0.7.1 | 8 | 16% | 26 |
| bvh.micro.Freya 0.3 | 5 | 10% | 22 |
| bzdp.Pansy 2.1 | 4 | 8% | 51 |
| bvh.mini.Fenrir 0.39 | 4 | 8% | 14 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 139367 melee ticks, 46102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47332 sent, 42562 reached their opponent, 8321 virtual hits (19.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474518. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 232 over 6 battles (38.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.1 | 165 / 210 | 1.90 | 20.2% | 37027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.2% | 165 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.5% | 7 |
| germ.TheMind .2 | 3.2 | 10.2% | 8 |
| agrach.Dalek 1.0 | 4.5 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 5 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.5% | 2 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 2 |
| mb.Beast 0.1 | 8.0 | 7.8% | 3 |
| skm.Ryubot 1.0 | 9.5 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 26 / 35 | 6006 |
| 2 | 1 | 69.1 | 90.2 | 26 / 35 | 5894 |
| 3 | 1 | 69.1 | 89.8 | 27 / 35 | 5911 |
| 4 | 1 | 68.6 | 86.0 | 25 / 35 | 6000 |
| 5 | 1 | 70.8 | 93.0 | 29 / 35 | 6606 |
| 6 | 1 | 71.3 | 94.9 | 32 / 35 | 6610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 34 | 94% |
| stelo.UntouchableNano 1.3 | 28 | 93% |
| germ.TheMind .2 | 22 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 100% |
| EBBU.Sim2 1.02 | 21 | 86% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| mb.Beast 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 46 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 28% | 16 |
| EBBU.Sim2 1.02 | 9 | 20% | 33 |
| agrach.Dalek 1.0 | 7 | 15% | 35 |
| lmk.ACPFinal 0.1 | 6 | 13% | 32 |
| mb.Beast 0.1 | 4 | 9% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 7% | 29 |
| stelo.UntouchableNano 1.3 | 3 | 7% | 22 |
| skm.Ryubot 1.0 | 1 | 2% | 4 |
| germ.TheMind .2 | 0 | 0% | 18 |

Posture (Hadur's M records, 200 rounds): 97293 melee ticks, 25651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 51 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 31665 sent, 27069 reached their opponent, 7397 virtual hits (27.3% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473873. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.7 | 119 / 210 | 1.92 | 19.4% | 31656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 19.4% | 119 |
| justin.Mallais 14.0 | 2.0 | 15.8% | 58 |
| bvh.mini.Freya 0.55 | 3.2 | 12.6% | 10 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.3% | 15 |
| cs.Wren 1.0 | 5.0 | 10.0% | 5 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.2% | 2 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.2% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 25 / 35 | 5864 |
| 2 | 1 | 68.7 | 88.6 | 16 / 35 | 5022 |
| 3 | 1 | 67.3 | 81.9 | 16 / 35 | 4600 |
| 4 | 1 | 70.3 | 90.8 | 21 / 35 | 5421 |
| 5 | 1 | 69.4 | 89.2 | 20 / 35 | 5101 |
| 6 | 1 | 70.7 | 93.0 | 21 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 76 | 62% |
| bvh.mini.Freya 0.55 | 34 | 76% |
| bts.mega.Gnarly 1.4 | 29 | 76% |
| cs.Wren 1.0 | 13 | 92% |
| kdf.KoulDestroyer 1.0 | 9 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 46% | 85 |
| bvh.mini.Freya 0.55 | 18 | 20% | 40 |
| bts.mega.Gnarly 1.4 | 13 | 14% | 36 |
| kdf.KoulDestroyer 1.0 | 10 | 11% | 17 |
| cs.Wren 1.0 | 3 | 3% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 5 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 134706 melee ticks, 44070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43621 sent, 38396 reached their opponent, 7920 virtual hits (20.6% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1521029. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.9 | 124 / 210 | 1.73 | 22.2% | 34534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 22.2% | 124 |
| bvh.fry.Freya 0.82 | 2.0 | 16.7% | 27 |
| az.Ololobot 0.2.4 | 3.0 | 14.6% | 54 |
| gimp.GimpBot 0.1 | 4.8 | 8.9% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.1% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 8.5% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.5% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.8 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.9 | 26 / 35 | 5881 |
| 2 | 1 | 70.1 | 91.8 | 18 / 35 | 5553 |
| 3 | 1 | 71.6 | 92.5 | 23 / 35 | 6374 |
| 4 | 1 | 70.9 | 92.5 | 24 / 35 | 5796 |
| 5 | 1 | 69.4 | 88.9 | 17 / 35 | 5383 |
| 6 | 1 | 68.7 | 85.7 | 16 / 35 | 5547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 78 | 81% |
| az.Ololobot 0.2.4 | 78 | 50% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| gimp.GimpBot 0.1 | 7 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1186. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 45 | 52% | 89 |
| bvh.fry.Freya 0.82 | 28 | 32% | 77 |
| apollokidd.ApolloKidd 0.9 | 8 | 9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 11 |
| gimp.GimpBot 0.1 | 2 | 2% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 154501 melee ticks, 68665 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 79 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44125 sent, 39774 reached their opponent, 6808 virtual hits (17.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500007. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.4 | 130 / 210 | 1.95 | 20.2% | 33929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.2% | 130 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.7% | 16 |
| mz.AntiGrav 1.0 | 3.7 | 11.2% | 11 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 7 |
| alpha.BlackIce 1.0 | 6.2 | 9.2% | 3 |
| stelo.Randomness 1.0 | 6.7 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.6% | 0 |
| sample.Corners 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 23 / 35 | 5617 |
| 2 | 1 | 70.0 | 86.7 | 19 / 35 | 5835 |
| 3 | 1 | 69.7 | 86.3 | 18 / 35 | 5449 |
| 4 | 1 | 71.6 | 91.4 | 22 / 35 | 5764 |
| 5 | 1 | 70.6 | 89.2 | 23 / 35 | 5396 |
| 6 | 1 | 71.9 | 91.4 | 25 / 35 | 5868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 68 | 75% |
| kano.gamma.KanoGamma 1.8 | 39 | 92% |
| mz.AntiGrav 1.0 | 26 | 88% |
| Polkwane.SmashMelee 1.0 | 11 | 82% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 36% | 63 |
| kano.gamma.KanoGamma 1.8 | 17 | 21% | 59 |
| Polkwane.SmashMelee 1.0 | 11 | 14% | 17 |
| stelo.Randomness 1.0 | 8 | 10% | 21 |
| mz.AntiGrav 1.0 | 5 | 6% | 25 |
| alpha.BlackIce 1.0 | 4 | 5% | 11 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 3% | 4 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 146835 melee ticks, 43000 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 82 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 47004 sent, 42081 reached their opponent, 8204 virtual hits (19.5% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474614. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.7 | 95 / 210 | 2.29 | 18.3% | 29300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 18.3% | 95 |
| eem.EvBotNG v12.8 | 2.0 | 16.8% | 83 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.7% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 6 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.3% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.7 | 10 / 35 | 4740 |
| 2 | 1 | 67.6 | 83.8 | 12 / 35 | 4761 |
| 3 | 1 | 69.8 | 90.8 | 18 / 35 | 4922 |
| 4 | 1 | 69.9 | 88.9 | 23 / 35 | 5185 |
| 5 | 1 | 69.0 | 87.9 | 16 / 35 | 4636 |
| 6 | 1 | 68.5 | 83.2 | 16 / 35 | 5056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 92 | 41% |
| lessonz.robocode.Oz 0.5.0 | 31 | 94% |
| ary.Swarm 1.1 | 18 | 89% |
| simonton.nano.MeleeSeed 1.8 | 13 | 85% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 56% | 102 |
| lessonz.robocode.Oz 0.5.0 | 18 | 16% | 39 |
| ary.Swarm 1.1 | 15 | 13% | 35 |
| simonton.nano.MeleeSeed 1.8 | 8 | 7% | 19 |
| shrub.Silver v048 | 7 | 6% | 9 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 145611 melee ticks, 59464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46636 sent, 41650 reached their opponent, 5990 virtual hits (14.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491432. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.7 | 135 / 210 | 1.84 | 20.5% | 37143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.5% | 135 |
| wompi.Wallaby 5.1 | 2.3 | 15.2% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.5% | 16 |
| ara.Shera 0.88 | 3.5 | 13.6% | 25 |
| amz.NanoClone 1.41 | 5.2 | 8.6% | 0 |
| dsw.StaticD 1.0 | 5.8 | 7.0% | 1 |
| maribo.IotaCT 1.1 | 7.5 | 6.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 22 / 35 | 6075 |
| 2 | 1 | 71.6 | 92.7 | 24 / 35 | 6258 |
| 3 | 1 | 71.0 | 90.2 | 23 / 35 | 6014 |
| 4 | 1 | 71.4 | 91.7 | 23 / 35 | 6223 |
| 5 | 1 | 69.7 | 87.0 | 18 / 35 | 5878 |
| 6 | 1 | 72.1 | 92.1 | 25 / 35 | 6695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 87% |
| maribo.mini.MiniQuester 0.1 | 33 | 94% |
| ara.Shera 0.88 | 29 | 59% |
| amz.NanoClone 1.41 | 3 | 100% |
| dsw.StaticD 1.0 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 45% | 107 |
| ara.Shera 0.88 | 26 | 34% | 45 |
| maribo.mini.MiniQuester 0.1 | 13 | 17% | 44 |
| amz.NanoClone 1.41 | 2 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 154601 melee ticks, 49749 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 62 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48731 sent, 43906 reached their opponent, 8296 virtual hits (18.9% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476925. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 6 battles (16.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.8 | 44 / 210 | 2.72 | 16.7% | 28000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.2 | 20.4% | 135 |
| hadur117.Hadur 3.21z5 | 1.8 | 16.7% | 44 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.4% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.7 | 8.5% | 0 |
| mz.NanoGod 2.02 | 6.8 | 7.6% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 77.1 | 7 / 35 | 4642 |
| 2 | 2 | 66.8 | 80.6 | 6 / 35 | 4483 |
| 3 | 2 | 68.3 | 83.2 | 13 / 35 | 4662 |
| 4 | 2 | 63.7 | 70.5 | 2 / 35 | 4049 |
| 5 | 1 | 69.8 | 88.3 | 11 / 35 | 5284 |
| 6 | 2 | 68.3 | 85.4 | 5 / 35 | 4880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 27% |
| brainfade.melee.Dusk 0.44 | 19 | 42% |
| dummy.micro.Sparrow 2.5 | 9 | 56% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 57% | 121 |
| brainfade.melee.Dusk 0.44 | 30 | 18% | 39 |
| dummy.micro.Sparrow 2.5 | 22 | 13% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| mz.NanoGod 2.02 | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 149785 melee ticks, 57893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45903 sent, 40923 reached their opponent, 6593 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485632. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 95.1 | 150 / 210 | 1.44 | 21.8% | 38344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 21.8% | 150 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 46 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.9% | 11 |
| jwirde.Gort 2.0 | 4.7 | 9.4% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.1% | 0 |
| disan.Chair 2.2.0 | 6.0 | 7.6% | 1 |
| wompi.Quokka 1.6 | 7.2 | 6.6% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.9 | 26 / 35 | 6234 |
| 2 | 1 | 72.4 | 94.6 | 23 / 35 | 6343 |
| 3 | 1 | 72.8 | 95.2 | 25 / 35 | 6554 |
| 4 | 1 | 72.5 | 94.6 | 25 / 35 | 6483 |
| 5 | 1 | 73.3 | 96.8 | 27 / 35 | 6597 |
| 6 | 1 | 71.6 | 93.3 | 24 / 35 | 6133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 93 | 65% |
| tzu.TheArtOfWar 1.2 | 64 | 91% |
| jwirde.Gort 2.0 | 15 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 9 | 89% |
| wompi.Quokka 1.6 | 1 | 0% |

Hadur died in 61 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 35 | 57% | 88 |
| tzu.TheArtOfWar 1.2 | 16 | 26% | 72 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 5% | 10 |
| wompi.Quokka 1.6 | 3 | 5% | 5 |
| jwirde.Gort 2.0 | 1 | 2% | 18 |
| disan.Chair 2.2.0 | 1 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 153232 melee ticks, 50915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50768 sent, 45849 reached their opponent, 8935 virtual hits (19.5% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21z5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483206. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.2 | 106 / 210 | 1.88 | 20.3% | 34873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 20.3% | 106 |
| jje.BagPuss 1.2 | 2.7 | 12.0% | 14 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.4% | 69 |
| myl.nano.Graviton 1.10 | 3.8 | 10.9% | 7 |
| sul.Lunar 1.1 | 4.3 | 10.5% | 11 |
| fm.claire 1.7 | 6.8 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.6% | 2 |
| hvilela.HVilela 0.9 | 7.2 | 8.6% | 0 |
| wit.Deep7 2.0 | 9.3 | 5.0% | 1 |
| abud.ThirdRobo 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 18 / 35 | 5882 |
| 2 | 1 | 70.2 | 90.2 | 17 / 35 | 5758 |
| 3 | 1 | 70.8 | 91.1 | 20 / 35 | 5836 |
| 4 | 1 | 70.9 | 92.1 | 20 / 35 | 6118 |
| 5 | 1 | 68.3 | 85.7 | 11 / 35 | 5438 |
| 6 | 1 | 70.6 | 92.1 | 20 / 35 | 5841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 74 | 38% |
| sul.Lunar 1.1 | 33 | 88% |
| jje.BagPuss 1.2 | 20 | 55% |
| myl.nano.Graviton 1.10 | 17 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 100% |
| fm.claire 1.7 | 5 | 100% |
| wit.Deep7 2.0 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 50 | 48% | 0 |
| jje.BagPuss 1.2 | 15 | 14% | 58 |
| myl.nano.Graviton 1.10 | 11 | 10% | 37 |
| sul.Lunar 1.1 | 10 | 10% | 46 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 25 |
| hvilela.HVilela 0.9 | 6 | 6% | 16 |
| fm.claire 1.7 | 5 | 5% | 18 |
| wit.Deep7 2.0 | 2 | 2% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 186206 melee ticks, 91017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 57021 sent, 52131 reached their opponent, 7375 virtual hits (14.1% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21z5 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475886. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.6 | 134 / 210 | 1.60 | 22.2% | 31881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21z5 | 1.0 | 22.2% | 134 |
| kc.mini.Mirage 0.2 | 2.0 | 19.0% | 64 |
| mz.MicroSheep 1.0 | 3.3 | 12.7% | 2 |
| cx.Princess 1.0 | 3.8 | 11.9% | 10 |
| sadoner.killer 0.2 | 4.8 | 10.4% | 0 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 6.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 8.0 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.9 | 21 / 35 | 5696 |
| 2 | 1 | 71.7 | 92.9 | 24 / 35 | 5572 |
| 3 | 1 | 69.9 | 90.4 | 20 / 35 | 5154 |
| 4 | 1 | 71.3 | 96.1 | 25 / 35 | 5111 |
| 5 | 1 | 70.9 | 93.2 | 24 / 35 | 5178 |
| 6 | 1 | 70.2 | 90.0 | 20 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 136 | 71% |
| cx.Princess 1.0 | 20 | 75% |
| mz.MicroSheep 1.0 | 14 | 93% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 56 | 74% | 144 |
| cx.Princess 1.0 | 9 | 12% | 22 |
| mz.MicroSheep 1.0 | 5 | 7% | 22 |
| sadoner.killer 0.2 | 5 | 7% | 10 |
| arthord.NanoSatanMelee Beta | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 142719 melee ticks, 56611 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 32 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 39164 sent, 34808 reached their opponent, 5386 virtual hits (15.5% of those reached).

