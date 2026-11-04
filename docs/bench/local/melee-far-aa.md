# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481051. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.7 | 60 / 210 | 2.20 | 17.8% | 32012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.3% | 133 |
| hadur117.Hadur 3.21aa | 2.0 | 17.8% | 60 |
| sgp.JollyNinja 3.53 | 3.2 | 11.9% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 1 |
| mz.MicroGodMelee 1 | 5.3 | 10.3% | 3 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.6 | 90.5 | 15 / 35 | 5446 |
| 2 | 2 | 67.7 | 86.3 | 8 / 35 | 5198 |
| 3 | 2 | 68.4 | 87.3 | 10 / 35 | 5497 |
| 4 | 2 | 67.7 | 86.0 | 8 / 35 | 5357 |
| 5 | 2 | 67.8 | 87.0 | 10 / 35 | 5319 |
| 6 | 2 | 67.0 | 82.9 | 9 / 35 | 5195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 17% |
| sgp.JollyNinja 3.53 | 20 | 70% |
| mz.MicroGodMelee 1 | 15 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 6 | 83% |
| adt.Ar2 1.0 | 2 | 50% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 72% | 128 |
| sgp.JollyNinja 3.53 | 11 | 7% | 24 |
| mz.MicroGodMelee 1 | 10 | 7% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 7% | 18 |
| lorneswork.Predator 1.0 | 7 | 5% | 13 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 136742 melee ticks, 89691 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 43744 sent, 39057 reached their opponent, 8001 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480977. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.5 | 104 / 210 | 2.03 | 19.0% | 30601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.0% | 104 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.2% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.7% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.5% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.8% | 3 |
| Noran.BitchingElk 0.054 | 6.5 | 8.2% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.3% | 4 |
| sch.Simone 0.3d | 7.5 | 8.0% | 7 |
| stelo.PatternRobot 1.0 | 9.0 | 4.8% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.0 | 23 / 35 | 5293 |
| 2 | 1 | 66.0 | 79.7 | 13 / 35 | 4679 |
| 3 | 1 | 70.2 | 90.8 | 18 / 35 | 5505 |
| 4 | 1 | 69.1 | 89.8 | 16 / 35 | 5233 |
| 5 | 1 | 68.9 | 90.5 | 17 / 35 | 4880 |
| 6 | 1 | 68.5 | 87.3 | 17 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 28 | 64% |
| Noran.BitchingElk 0.054 | 18 | 39% |
| sch.Simone 0.3d | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| stelo.PatternRobot 1.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 32% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 16% | 47 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 16% | 33 |
| Noran.BitchingElk 0.054 | 11 | 10% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 20 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 10 |
| sch.Simone 0.3d | 5 | 5% | 15 |
| stelo.PatternRobot 1.0 | 3 | 3% | 3 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 170733 melee ticks, 46115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 59179 sent, 54437 reached their opponent, 8968 virtual hits (16.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480123. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.9 | 177 / 210 | 1.55 | 21.0% | 37831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 177 |
| radnor.DoctorBob 1.42 | 2.0 | 14.0% | 13 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 10 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.2% | 9 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 26 / 35 | 6502 |
| 2 | 1 | 71.3 | 94.6 | 30 / 35 | 6176 |
| 3 | 1 | 70.3 | 90.8 | 26 / 35 | 6113 |
| 4 | 1 | 72.5 | 96.2 | 32 / 35 | 6524 |
| 5 | 1 | 71.8 | 94.6 | 31 / 35 | 6521 |
| 6 | 1 | 70.8 | 93.0 | 32 / 35 | 5995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 97% |
| vuen.Cake 2.51 | 61 | 97% |
| kawigi.nano.Lib 1.0 | 48 | 92% |
| urdos.URDOS 1.3 | 6 | 83% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 33% | 59 |
| kawigi.nano.Lib 1.0 | 6 | 18% | 45 |
| vuen.Cake 2.51 | 5 | 15% | 68 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 12% | 6 |
| urdos.URDOS 1.3 | 2 | 6% | 10 |
| adt.Ar1 2.1 | 2 | 6% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 6% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 121766 melee ticks, 40618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37718 sent, 33120 reached their opponent, 8430 virtual hits (25.5% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471555. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.5 | 24 / 210 | 2.13 | 18.2% | 36253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 173 |
| hadur117.Hadur 3.21aa | 2.0 | 18.2% | 24 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.6% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 87.6 | 3 / 35 | 5966 |
| 2 | 2 | 69.0 | 87.3 | 6 / 35 | 5672 |
| 3 | 2 | 69.3 | 86.7 | 4 / 35 | 6421 |
| 4 | 2 | 68.5 | 85.7 | 3 / 35 | 5966 |
| 5 | 2 | 68.9 | 87.9 | 2 / 35 | 6099 |
| 6 | 2 | 69.9 | 89.5 | 6 / 35 | 6129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 7% |
| TNT.TNT 0.99.1 | 12 | 83% |
| apc.LeeroyJenkins2 1.0 | 9 | 33% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 186 of 210 rounds, at a mean tick of 1366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 80% | 159 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 24 |
| TNT.TNT 0.99.1 | 7 | 4% | 16 |
| josago.Jorgito 0.16 | 6 | 3% | 7 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 189889 melee ticks, 80450 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 112 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 112 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 57880 sent, 53302 reached their opponent, 7875 virtual hits (14.8% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474502. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.4 | 39 / 210 | 2.86 | 15.7% | 25480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.6% | 93 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 62 |
| hadur117.Hadur 3.21aa | 2.5 | 15.7% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.7% | 4 |
| ms.Ares 0.19 | 5.7 | 9.2% | 2 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 3.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 78.7 | 7 / 35 | 4080 |
| 2 | 3 | 64.4 | 77.8 | 6 / 35 | 4046 |
| 3 | 3 | 63.4 | 76.5 | 5 / 35 | 3763 |
| 4 | 2 | 66.1 | 81.9 | 9 / 35 | 4584 |
| 5 | 2 | 66.5 | 82.9 | 7 / 35 | 4620 |
| 6 | 3 | 64.9 | 78.4 | 5 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 44 | 16% |
| justin.DemonicRage 3.4 | 34 | 38% |
| wompi.Numbat 2.1 | 18 | 83% |
| ms.Ares 0.19 | 3 | 67% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 172 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 61 | 35% | 71 |
| justin.DemonicRage 3.4 | 59 | 34% | 66 |
| wompi.Numbat 2.1 | 33 | 19% | 48 |
| axeBots.HataMoto 3.09 | 8 | 5% | 12 |
| ms.Ares 0.19 | 6 | 3% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 152607 melee ticks, 37435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 75 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46203 sent, 41378 reached their opponent, 6805 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479269. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.7 | 147 / 210 | 1.75 | 20.5% | 33650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.5% | 147 |
| jekl.StoneGhost 0.7 | 2.0 | 14.8% | 18 |
| origin.SleepSiphon 1.7b | 3.3 | 12.8% | 18 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 19 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 1 |
| gg.Wolverine 2.0 | 6.2 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.8% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.2 | 5.9% | 1 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.8 | 22 / 35 | 5514 |
| 2 | 1 | 71.6 | 94.6 | 26 / 35 | 5664 |
| 3 | 1 | 71.4 | 93.3 | 29 / 35 | 5402 |
| 4 | 1 | 71.0 | 90.5 | 25 / 35 | 5623 |
| 5 | 1 | 71.2 | 91.1 | 23 / 35 | 5753 |
| 6 | 1 | 70.9 | 90.8 | 22 / 35 | 5694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 91% |
| origin.SleepSiphon 1.7b | 50 | 84% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 86% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| mld.Wisdom 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 22 | 35% | 74 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 24% | 37 |
| jekl.StoneGhost 0.7 | 13 | 21% | 62 |
| mld.Wisdom 1.0 | 9 | 14% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 7 |
| gg.Wolverine 2.0 | 1 | 2% | 8 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 141413 melee ticks, 47023 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44302 sent, 39680 reached their opponent, 8827 virtual hits (22.2% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482988. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.0 | 96.0 | 160 / 210 | 1.32 | 25.6% | 45268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 25.6% | 160 |
| rtk.Tachikoma 1.0 | 2.0 | 18.9% | 25 |
| franzor.Lizt 1.3.1 | 3.5 | 12.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.8% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 2.5% | 0 |
| sample.Target 1.0 | 8.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.9 | 94.6 | 27 / 35 | 7509 |
| 2 | 1 | 75.1 | 96.1 | 26 / 35 | 7743 |
| 3 | 1 | 75.8 | 98.2 | 30 / 35 | 7651 |
| 4 | 1 | 74.5 | 95.0 | 24 / 35 | 7334 |
| 5 | 1 | 74.7 | 95.0 | 25 / 35 | 7460 |
| 6 | 1 | 75.1 | 97.1 | 28 / 35 | 7571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 126 | 81% |
| franzor.Lizt 1.3.1 | 35 | 74% |
| oog.melee.CapuletDroid 1.1 | 35 | 83% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 33 | 66% | 146 |
| franzor.Lizt 1.3.1 | 10 | 20% | 5 |
| oog.melee.CapuletDroid 1.1 | 6 | 12% | 45 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 8 |

Posture (Hadur's M records, 199 rounds): 187731 melee ticks, 92779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52898 sent, 48913 reached their opponent, 10261 virtual hits (21.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478404. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 273 over 6 battles (45.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.9 | 159 / 210 | 1.49 | 23.2% | 32391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.2% | 159 |
| shrub.Vapour v159 | 2.5 | 14.2% | 26 |
| tm.Yuugao 1.0 | 2.5 | 14.6% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.1% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 5.3 | 9.4% | 2 |
| m3thos.Eva00 1.1 | 5.7 | 9.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 6.8 | 7.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.3% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 96.8 | 29 / 35 | 5819 |
| 2 | 1 | 70.3 | 92.5 | 23 / 35 | 5181 |
| 3 | 1 | 71.9 | 95.4 | 27 / 35 | 5478 |
| 4 | 1 | 71.3 | 92.9 | 27 / 35 | 5414 |
| 5 | 1 | 71.9 | 94.6 | 27 / 35 | 5318 |
| 6 | 1 | 71.0 | 91.1 | 26 / 35 | 5181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 74 | 82% |
| shrub.Vapour v159 | 56 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 37 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| m3thos.Eva00 1.1 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 18 | 35% | 53 |
| tm.Yuugao 1.0 | 17 | 33% | 79 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 12% | 36 |
| m3thos.Eva00 1.1 | 5 | 10% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 6% | 21 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |
| SHAM.WOW 1.4 | 1 | 2% | 1 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 142517 melee ticks, 55210 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43857 sent, 39553 reached their opponent, 7529 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479118. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.4 | 57 / 210 | 2.95 | 15.7% | 22022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 109 |
| hadur117.Hadur 3.21aa | 2.2 | 15.7% | 57 |
| kc.micro.Figment 1.0 | 2.8 | 13.8% | 25 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 8 |
| mc2.enemy.Original 0.9 | 6.0 | 8.8% | 6 |
| dft.Calliope 5.6 | 6.7 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 76.8 | 8 / 35 | 3118 |
| 2 | 2 | 65.1 | 79.0 | 12 / 35 | 3935 |
| 3 | 3 | 62.2 | 74.0 | 4 / 35 | 3387 |
| 4 | 2 | 66.0 | 81.0 | 13 / 35 | 4105 |
| 5 | 2 | 65.4 | 82.2 | 11 / 35 | 3814 |
| 6 | 2 | 64.2 | 77.1 | 9 / 35 | 3663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 60 | 22% |
| kc.micro.Figment 1.0 | 34 | 79% |
| yagami.Tidus 0.11 | 10 | 80% |
| pedersen.Grishnakh 1.0 | 7 | 86% |
| dft.Calliope 5.6 | 4 | 75% |
| mc2.enemy.Original 0.9 | 2 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 46% | 89 |
| kc.micro.Figment 1.0 | 27 | 18% | 54 |
| mc2.enemy.Original 0.9 | 15 | 10% | 16 |
| yagami.Tidus 0.11 | 14 | 9% | 19 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 15 |
| dft.Calliope 5.6 | 6 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

Posture (Hadur's M records, 201 rounds): 145401 melee ticks, 37226 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47974 sent, 43429 reached their opponent, 6200 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493488. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 96.3 | 172 / 210 | 1.33 | 21.4% | 36620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.4% | 172 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 12 |
| ne.Chimera 1.2 | 3.0 | 13.0% | 11 |
| ejb.Polaris 1.0.1 | 3.7 | 12.4% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.9% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.0% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.0% | 0 |
| sam.Samspin 1.0 | 8.5 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.3 | 24 / 35 | 5964 |
| 2 | 1 | 72.4 | 98.7 | 31 / 35 | 5738 |
| 3 | 1 | 71.2 | 93.0 | 28 / 35 | 5796 |
| 4 | 1 | 72.7 | 98.4 | 30 / 35 | 6205 |
| 5 | 1 | 73.0 | 96.8 | 30 / 35 | 6503 |
| 6 | 1 | 72.7 | 97.8 | 29 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 91% |
| ejb.Polaris 1.0.1 | 53 | 89% |
| ne.Chimera 1.2 | 34 | 82% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| donjezza.Muncho 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 38% | 71 |
| ejb.Polaris 1.0.1 | 9 | 23% | 67 |
| ne.Chimera 1.2 | 8 | 21% | 31 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 14 |
| vStar.RAFzilla 2.15 | 2 | 5% | 18 |
| kurios.DOSexe .9b | 1 | 3% | 4 |
| donjezza.Muncho 1.0 | 1 | 3% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 140006 melee ticks, 59286 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45132 sent, 40610 reached their opponent, 7793 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485931. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.1 | 74 / 210 | 2.61 | 16.7% | 24157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.3 | 16.7% | 74 |
| rz.Aleph 0.34 | 1.7 | 16.6% | 72 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 20 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 16 |
| rdt199.Warlord 0.73 | 5.2 | 9.4% | 16 |
| br2.MobyDickBot 1.6 | 6.0 | 8.5% | 8 |
| uji.YellohFellah 1.0 | 6.8 | 7.9% | 4 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 79.4 | 16 / 35 | 4204 |
| 2 | 1 | 65.2 | 83.8 | 12 / 35 | 3765 |
| 3 | 1 | 65.3 | 81.3 | 10 / 35 | 4219 |
| 4 | 1 | 64.8 | 81.0 | 10 / 35 | 3934 |
| 5 | 2 | 64.8 | 81.9 | 12 / 35 | 3621 |
| 6 | 1 | 66.6 | 85.1 | 14 / 35 | 4414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 49% |
| cx.mini.Nimrod 0.55 | 25 | 68% |
| uji.YellohFellah 1.0 | 14 | 86% |
| djc.DynaBot 0.1.1 | 12 | 50% |
| rdt199.Warlord 0.73 | 10 | 50% |
| br2.MobyDickBot 1.6 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 42% | 83 |
| cx.mini.Nimrod 0.55 | 23 | 17% | 41 |
| rdt199.Warlord 0.73 | 17 | 13% | 25 |
| djc.DynaBot 0.1.1 | 15 | 11% | 22 |
| br2.MobyDickBot 1.6 | 8 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 4% | 6 |
| uji.YellohFellah 1.0 | 4 | 3% | 11 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 156294 melee ticks, 36095 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50749 sent, 45867 reached their opponent, 6126 virtual hits (13.4% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490380. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.2 | 123 / 210 | 2.24 | 18.1% | 24401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.1% | 123 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.7% | 31 |
| nat.PallasHawk 1.0 | 3.0 | 13.3% | 30 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.7% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.7% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.3% | 1 |
| stuff.Vlad 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.6 | 21 / 35 | 4242 |
| 2 | 1 | 68.3 | 89.2 | 22 / 35 | 3979 |
| 3 | 1 | 65.3 | 79.7 | 19 / 35 | 3723 |
| 4 | 1 | 66.5 | 82.5 | 17 / 35 | 4157 |
| 5 | 1 | 67.8 | 86.7 | 20 / 35 | 4224 |
| 6 | 1 | 68.9 | 90.5 | 24 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 74% |
| darkcanuck.Leon 1.01 | 45 | 93% |
| bts.wiki.RipCurl 0.9b | 41 | 85% |
| brainfade.melee.Genghis 0.36 | 7 | 71% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 26 | 30% | 53 |
| bts.wiki.RipCurl 0.9b | 24 | 28% | 44 |
| brainfade.melee.Genghis 0.36 | 11 | 13% | 21 |
| jrm.Test0 1.0 | 10 | 11% | 16 |
| darkcanuck.Leon 1.01 | 7 | 8% | 59 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| jp.Perpy 16.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 128521 melee ticks, 33017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43741 sent, 38823 reached their opponent, 6617 virtual hits (17.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486450. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.5 | 56 / 210 | 2.76 | 16.0% | 26131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.5% | 43 |
| mn.Combat 3.25.0 | 2.0 | 16.5% | 88 |
| hadur117.Hadur 3.21aa | 2.2 | 16.0% | 56 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 14 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.8% | 8 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 1 |
| maribo.FollowFire 1 | 8.3 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 15 / 35 | 4675 |
| 2 | 3 | 63.5 | 75.2 | 9 / 35 | 3972 |
| 3 | 3 | 62.2 | 73.7 | 1 / 35 | 3924 |
| 4 | 3 | 64.9 | 79.0 | 7 / 35 | 4633 |
| 5 | 2 | 66.1 | 82.9 | 12 / 35 | 4320 |
| 6 | 1 | 67.5 | 85.7 | 12 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 53 | 26% |
| ags.Glacier 0.2.11 | 43 | 65% |
| shinh.Entangled 0.3 | 13 | 69% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |

Hadur died in 154 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 38% | 74 |
| ags.Glacier 0.2.11 | 44 | 29% | 70 |
| shinh.Entangled 0.3 | 25 | 16% | 33 |
| gh.micro.Gruweltje 0.7 | 10 | 6% | 15 |
| stelo.Wang 1.0 | 7 | 5% | 7 |
| maribo.FollowFire 1 | 6 | 4% | 6 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |

Posture (Hadur's M records, 200 rounds): 145151 melee ticks, 39734 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 67 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42366 sent, 37457 reached their opponent, 6152 virtual hits (16.4% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492929. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 97.3 | 182 / 210 | 1.22 | 24.1% | 36870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.1% | 182 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.1% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 3.3 | 11.3% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.9% | 5 |
| pa.Improved 1.0 | 8.0 | 7.2% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.1 | 28 / 35 | 6032 |
| 2 | 1 | 73.5 | 98.6 | 31 / 35 | 6428 |
| 3 | 1 | 73.4 | 98.9 | 33 / 35 | 6039 |
| 4 | 1 | 72.6 | 95.0 | 30 / 35 | 6213 |
| 5 | 1 | 72.8 | 97.1 | 30 / 35 | 6242 |
| 6 | 1 | 72.7 | 97.9 | 30 / 35 | 5916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 117 | 90% |
| sanyi.mikrobi.Roberto 1.0 | 33 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 78% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| pa.Improved 1.0 | 9 | 89% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 18 | 62% | 110 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 21% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 7% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 3% | 11 |
| pa.Improved 1.0 | 1 | 3% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 3% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 10 |

Posture (Hadur's M records, 198 rounds): 123662 melee ticks, 49193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36602 sent, 32699 reached their opponent, 8515 virtual hits (26.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474792. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 6 battles (34.2 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 128 / 210 | 1.98 | 19.8% | 32732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.8% | 128 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 14 |
| mld.DustBunny 3.8 | 3.0 | 12.7% | 6 |
| emp.Yngwie 1.11 | 3.5 | 12.2% | 35 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.6% | 9 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.3% | 17 |
| lambdaxy.TBot 0.1 | 7.2 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.3 | 23 / 35 | 5668 |
| 2 | 1 | 69.5 | 86.3 | 21 / 35 | 5498 |
| 3 | 1 | 69.2 | 85.4 | 24 / 35 | 5286 |
| 4 | 1 | 68.5 | 86.7 | 17 / 35 | 5044 |
| 5 | 1 | 69.9 | 89.8 | 19 / 35 | 5385 |
| 6 | 1 | 71.6 | 93.3 | 24 / 35 | 5851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 51 | 94% |
| emp.Yngwie 1.11 | 45 | 51% |
| mld.DustBunny 3.8 | 32 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 67% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 40% | 76 |
| kawigi.micro.Shiz 1.1 | 13 | 16% | 46 |
| kawigi.robot.Girl 1.2 | 13 | 16% | 19 |
| mld.DustBunny 3.8 | 8 | 10% | 38 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 11 |
| divineomega.TrialBot 0.003 | 4 | 5% | 9 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |

Posture (Hadur's M records, 200 rounds): 164058 melee ticks, 48761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 52729 sent, 48109 reached their opponent, 7991 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486719. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.6 | 139 / 210 | 1.66 | 20.9% | 36487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.9% | 139 |
| gh.Griezel 0.5.2 | 2.2 | 15.9% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.9% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.7% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.8% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 0 |
| repositorio.NanoStep 1.0 | 8.3 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 23 / 35 | 6009 |
| 2 | 1 | 72.3 | 92.4 | 21 / 35 | 6588 |
| 3 | 1 | 71.3 | 91.1 | 24 / 35 | 6040 |
| 4 | 1 | 71.2 | 91.7 | 24 / 35 | 5833 |
| 5 | 1 | 71.0 | 90.2 | 20 / 35 | 5868 |
| 6 | 1 | 72.6 | 96.8 | 27 / 35 | 6149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 78% |
| techdude.forest.FlamingForest 1.1 | 42 | 64% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 93% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| tvv.nano.Polaris 1.2 | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1275. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 29 | 41% | 89 |
| techdude.forest.FlamingForest 1.1 | 22 | 31% | 54 |
| bvh.fnr.Fenrir 0.36l | 7 | 10% | 15 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 7% | 28 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 6 |
| asd.Cthulhu 1.3 | 2 | 3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 176316 melee ticks, 69970 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 55743 sent, 51201 reached their opponent, 8647 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484597. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.3 | 107 / 210 | 1.96 | 19.9% | 36164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.9% | 107 |
| et.Predator 1.8 | 2.3 | 13.7% | 27 |
| cx.BlestPain 1.41 | 3.3 | 12.0% | 40 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.4% | 22 |
| ahf.NanoAndrew .4 | 5.2 | 10.6% | 9 |
| maribo.melee.BMV 0.1 | 6.0 | 9.4% | 2 |
| nic.Nicator 2.4 | 6.8 | 8.7% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.1% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.3 | 16 / 35 | 6282 |
| 2 | 1 | 71.2 | 93.0 | 20 / 35 | 6197 |
| 3 | 1 | 68.2 | 86.0 | 14 / 35 | 5365 |
| 4 | 1 | 71.9 | 92.7 | 21 / 35 | 6482 |
| 5 | 1 | 69.7 | 87.3 | 18 / 35 | 5764 |
| 6 | 1 | 70.3 | 88.6 | 18 / 35 | 6074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 62 | 65% |
| oog.melee.Mercutio 1.0 | 47 | 79% |
| cx.BlestPain 1.41 | 33 | 30% |
| ahf.NanoAndrew .4 | 10 | 90% |
| nic.Nicator 2.4 | 5 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 35% | 48 |
| et.Predator 1.8 | 27 | 26% | 61 |
| oog.melee.Mercutio 1.0 | 16 | 16% | 50 |
| ahf.NanoAndrew .4 | 11 | 11% | 23 |
| maribo.melee.BMV 0.1 | 8 | 8% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 5 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| nic.Nicator 2.4 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 158658 melee ticks, 66269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 52281 sent, 47587 reached their opponent, 9887 virtual hits (20.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471783. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 6 battles (43.0 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.8 | 169 / 210 | 1.41 | 23.3% | 31013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.3% | 169 |
| agd.Mooserwirt2 2.7 | 2.3 | 14.1% | 14 |
| uji.DBH 1.1 | 2.7 | 12.6% | 7 |
| sigterm.Sigterm 1.0 | 4.8 | 10.8% | 13 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.8% | 2 |
| ratosh.Nobo 0.21 | 5.7 | 9.2% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 6.3 | 8.2% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.0% | 1 |
| stelo.WangRobot 1.0 | 8.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.4 | 24 / 35 | 5402 |
| 2 | 1 | 72.2 | 97.1 | 31 / 35 | 5399 |
| 3 | 1 | 70.9 | 96.8 | 30 / 35 | 4727 |
| 4 | 1 | 70.6 | 92.1 | 25 / 35 | 5160 |
| 5 | 1 | 72.0 | 98.2 | 31 / 35 | 5056 |
| 6 | 1 | 71.7 | 94.3 | 28 / 35 | 5269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 55 | 89% |
| agd.Mooserwirt2 2.7 | 55 | 95% |
| sigterm.Sigterm 1.0 | 33 | 82% |
| spinnercat.Robovirus 2.718 | 20 | 90% |
| ratosh.Nobo 0.21 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sigterm.Sigterm 1.0 | 12 | 29% | 39 |
| uji.DBH 1.1 | 9 | 22% | 49 |
| agd.Mooserwirt2 2.7 | 6 | 15% | 48 |
| ratosh.Nobo 0.21 | 5 | 12% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 7% | 11 |
| stelo.WangRobot 1.0 | 3 | 7% | 11 |
| spinnercat.Robovirus 2.718 | 2 | 5% | 22 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 2% | 7 |

Posture (Hadur's M records, 198 rounds): 128703 melee ticks, 52078 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 70 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 39683 sent, 35548 reached their opponent, 8058 virtual hits (22.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476853. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 97.0 | 192 / 210 | 1.27 | 22.3% | 37632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 192 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 11 |
| mld.Infinity 2.2 | 3.5 | 11.8% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.6% | 1 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.6% | 3 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 0 |
| pac.ABC 2.1 | 7.5 | 6.9% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 99.0 | 33 / 35 | 6586 |
| 2 | 1 | 73.0 | 96.2 | 30 / 35 | 6115 |
| 3 | 1 | 72.0 | 92.4 | 30 / 35 | 5927 |
| 4 | 1 | 73.9 | 98.4 | 33 / 35 | 6449 |
| 5 | 1 | 73.1 | 97.8 | 33 / 35 | 6011 |
| 6 | 1 | 73.9 | 98.1 | 33 / 35 | 6544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 97% |
| krillr.mini.JointStrike 2.0.0 | 32 | 97% |
| mld.Infinity 2.2 | 29 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 89% |
| pac.ABC 2.1 | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 7 | 39% | 44 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 22% | 70 |
| patson.PatsonTestBot 1.0 | 4 | 22% | 19 |
| erdnis.Rover 0.3 | 1 | 6% | 24 |
| mld.Infinity 2.2 | 1 | 6% | 23 |
| pbg.R2D2 1.0 | 1 | 6% | 10 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 8 |

Posture (Hadur's M records, 199 rounds): 127155 melee ticks, 46707 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42721 sent, 38062 reached their opponent, 8920 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474347. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 93.5 | 148 / 210 | 1.59 | 21.5% | 38228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 148 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 28 |
| catcat20.Rabbit 0.001 | 3.5 | 11.0% | 19 |
| fwb.Nine 1.0.1 | 3.8 | 11.1% | 9 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.4% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.2% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.4% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 23 / 35 | 6254 |
| 2 | 1 | 71.1 | 90.5 | 23 / 35 | 6288 |
| 3 | 1 | 72.3 | 94.9 | 24 / 35 | 6458 |
| 4 | 1 | 72.2 | 92.7 | 22 / 35 | 6799 |
| 5 | 1 | 72.2 | 95.9 | 27 / 35 | 5973 |
| 6 | 1 | 72.5 | 93.3 | 29 / 35 | 6456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 90 | 79% |
| fwb.Nine 1.0.1 | 43 | 98% |
| catcat20.Rabbit 0.001 | 33 | 64% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 55% | 101 |
| catcat20.Rabbit 0.001 | 18 | 29% | 53 |
| fwb.Nine 1.0.1 | 6 | 10% | 20 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 6 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 10 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 14 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 155784 melee ticks, 65056 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49153 sent, 44577 reached their opponent, 10368 virtual hits (23.3% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480959. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.6 | 145 / 210 | 1.49 | 21.3% | 36505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 145 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 52 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 5 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.8% | 1 |
| fire219.CatBot 1.0 | 7.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.3% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.2 | 25 / 35 | 5951 |
| 2 | 1 | 72.7 | 96.5 | 25 / 35 | 6392 |
| 3 | 1 | 72.0 | 94.3 | 23 / 35 | 6004 |
| 4 | 1 | 70.1 | 89.2 | 21 / 35 | 5629 |
| 5 | 1 | 72.5 | 96.5 | 25 / 35 | 5961 |
| 6 | 1 | 73.1 | 94.6 | 26 / 35 | 6568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 128 | 70% |
| dummy.mini.Scimitar 1.01 | 31 | 87% |
| cf.RiO.RiOx 4.2.1 | 27 | 93% |
| eld.Hmm 1.0 | 9 | 44% |
| oa.weak.BotherBot 0.1 | 1 | 0% |

Hadur died in 67 of 210 rounds, at a mean tick of 1375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 64% | 103 |
| dummy.mini.Scimitar 1.01 | 8 | 12% | 40 |
| eld.Hmm 1.0 | 5 | 7% | 25 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 30 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 169391 melee ticks, 82791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 97 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50204 sent, 45688 reached their opponent, 7878 virtual hits (17.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477989. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.9 | 109 / 210 | 1.89 | 20.6% | 27558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 109 |
| pe.SandboxDT 2.71m | 2.3 | 17.3% | 56 |
| kvk.HebusLeTroll 0.35 | 2.7 | 16.4% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 10 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 5 |
| yk.JahRoslav 1.1 | 6.2 | 6.5% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.1% | 1 |
| gg.Squaraus 0.6 | 7.7 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.5 | 22 / 35 | 5002 |
| 2 | 1 | 69.0 | 89.3 | 20 / 35 | 4538 |
| 3 | 1 | 68.3 | 87.1 | 17 / 35 | 4358 |
| 4 | 1 | 69.1 | 87.9 | 16 / 35 | 4660 |
| 5 | 1 | 68.3 | 87.9 | 16 / 35 | 4371 |
| 6 | 1 | 69.3 | 88.6 | 18 / 35 | 4629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 68 | 54% |
| kvk.HebusLeTroll 0.35 | 51 | 73% |
| jlm.javaDisturbance 0.59 | 23 | 83% |
| bigpete.Stewie 1.0 | 12 | 92% |
| tad.Dalek98 0.98 | 4 | 75% |
| yk.JahRoslav 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 42 | 42% | 86 |
| kvk.HebusLeTroll 0.35 | 28 | 28% | 47 |
| jlm.javaDisturbance 0.59 | 22 | 22% | 47 |
| bigpete.Stewie 1.0 | 4 | 4% | 13 |
| tad.Dalek98 0.98 | 4 | 4% | 7 |
| yk.JahRoslav 1.1 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 151922 melee ticks, 47693 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45317 sent, 41179 reached their opponent, 5548 virtual hits (13.5% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473447. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 97.9 | 191 / 210 | 1.19 | 22.4% | 38765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.4% | 191 |
| pe.SandboxLump 1.52 | 2.0 | 15.8% | 17 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 2 |
| stelo.RamTrackSurfer 1.2 | 4.7 | 9.3% | 0 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.5% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 98.4 | 31 / 35 | 6711 |
| 2 | 1 | 72.9 | 96.5 | 31 / 35 | 6136 |
| 3 | 1 | 73.3 | 97.8 | 31 / 35 | 6617 |
| 4 | 1 | 73.3 | 98.7 | 32 / 35 | 6244 |
| 5 | 1 | 73.8 | 98.7 | 33 / 35 | 6560 |
| 6 | 1 | 73.9 | 97.5 | 33 / 35 | 6497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 118 | 92% |
| cre.Karolos 0.32 | 44 | 100% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 14 | 74% | 105 |
| cre.Karolos 0.32 | 3 | 16% | 47 |
| stelo.RamTrackSurfer 1.2 | 1 | 5% | 20 |
| stelo.AreaTargetingBot 1.1 | 1 | 5% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 9 |
| cw.megas.Blade 0.8 | 0 | 0% | 5 |
| sample.Walls 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 115777 melee ticks, 53983 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37330 sent, 32630 reached their opponent, 9565 virtual hits (29.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479863. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.8 | 84 / 210 | 2.37 | 17.4% | 25736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.4% | 84 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.6% | 30 |
| florent.XSeries.X2 0.12 | 3.2 | 13.3% | 38 |
| davidalves.Phoenix 0.54 | 3.7 | 12.3% | 28 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.5% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.9% | 3 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 1 |
| evd.X1 0.01 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.1 | 14 / 35 | 4284 |
| 2 | 1 | 68.3 | 89.5 | 18 / 35 | 4342 |
| 3 | 1 | 67.6 | 86.3 | 17 / 35 | 4245 |
| 4 | 1 | 66.0 | 81.9 | 11 / 35 | 4200 |
| 5 | 1 | 66.5 | 84.1 | 14 / 35 | 4301 |
| 6 | 1 | 65.8 | 82.5 | 10 / 35 | 4364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 43 | 51% |
| rz.GlowBlowMelee 1.4 | 38 | 68% |
| davidalves.Phoenix 0.54 | 27 | 41% |
| pedersen.Ugluk 1.1.1 | 22 | 45% |
| oog.melee.Corsair 1.0 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 0% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 41 | 32% | 62 |
| davidalves.Phoenix 0.54 | 27 | 21% | 37 |
| rz.GlowBlowMelee 1.4 | 21 | 17% | 43 |
| pedersen.Ugluk 1.1.1 | 21 | 17% | 26 |
| oog.melee.Corsair 1.0 | 9 | 7% | 24 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 2% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 5 |

Posture (Hadur's M records, 199 rounds): 138428 melee ticks, 41063 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 251 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 251 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 45479 sent, 40560 reached their opponent, 7423 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473564. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.2 | 152 / 210 | 1.78 | 21.3% | 23646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 152 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 15.2% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 14.3% | 14 |
| jdw.Hurricane 1.4 | 4.0 | 12.8% | 19 |
| ds.Oo 2.2 | 5.0 | 9.8% | 3 |
| awesomeness.Elite 1.0 | 6.2 | 8.0% | 2 |
| gjr.Cephalosporin 0.1 | 7.5 | 6.6% | 1 |
| adt.Ar2 1.1 | 7.5 | 6.8% | 1 |
| amk.ChumbaMini 0.2 | 8.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.3 | 23 / 35 | 3863 |
| 2 | 1 | 70.2 | 92.5 | 26 / 35 | 4193 |
| 3 | 1 | 69.2 | 88.9 | 27 / 35 | 4004 |
| 4 | 1 | 68.1 | 88.2 | 22 / 35 | 3807 |
| 5 | 1 | 68.9 | 89.3 | 25 / 35 | 3851 |
| 6 | 1 | 70.4 | 93.2 | 29 / 35 | 3928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 63 | 90% |
| voidious.micro.BlitzBat 1.05 | 50 | 96% |
| jdw.Hurricane 1.4 | 31 | 84% |
| ds.Oo 2.2 | 12 | 92% |
| awesomeness.Elite 1.0 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 16 | 27% | 66 |
| voidious.micro.BlitzBat 1.05 | 13 | 22% | 47 |
| jdw.Hurricane 1.4 | 13 | 22% | 32 |
| ds.Oo 2.2 | 6 | 10% | 27 |
| awesomeness.Elite 1.0 | 5 | 8% | 13 |
| adt.Ar2 1.1 | 3 | 5% | 5 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 12 |
| amk.ChumbaMini 0.2 | 1 | 2% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 121013 melee ticks, 29826 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 31 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38917 sent, 34722 reached their opponent, 5803 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481602. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 95.1 | 165 / 210 | 1.44 | 21.8% | 39748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.8% | 165 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 23 |
| lrem.Spectre 0.4.4 | 3.3 | 12.1% | 4 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 11 |
| js.PinBall 1.6 | 5.3 | 10.2% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.4% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.4% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 7.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.6 | 27 / 35 | 7077 |
| 2 | 1 | 72.4 | 94.0 | 27 / 35 | 6314 |
| 3 | 1 | 73.0 | 96.5 | 29 / 35 | 6462 |
| 4 | 1 | 72.7 | 94.0 | 26 / 35 | 6477 |
| 5 | 1 | 72.2 | 94.0 | 26 / 35 | 6325 |
| 6 | 1 | 74.0 | 97.8 | 30 / 35 | 7093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 82% |
| lrem.Spectre 0.4.4 | 49 | 98% |
| shu.nitro.LENIN .T34 | 46 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 92% |
| js.PinBall 1.6 | 10 | 80% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 23 | 51% | 72 |
| shu.nitro.LENIN .T34 | 11 | 24% | 55 |
| lrem.Spectre 0.4.4 | 5 | 11% | 43 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 9% | 16 |
| js.PinBall 1.6 | 2 | 4% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 154333 melee ticks, 48587 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 49630 sent, 45051 reached their opponent, 11038 virtual hits (24.5% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475902. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.1 | 153 / 210 | 2.25 | 19.7% | 32753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 19.7% | 153 |
| mk.Alpha 0.2.1 | 2.2 | 14.2% | 33 |
| EH.Eagle 1.0.6 | 2.8 | 11.4% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.3% | 8 |
| wee.Gem 1.8.4 | 5.5 | 9.4% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.5% | 0 |
| joe.ADinosaur 1.0 | 7.5 | 8.0% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 97.8 | 32 / 35 | 5463 |
| 2 | 1 | 71.5 | 95.9 | 29 / 35 | 5517 |
| 3 | 1 | 66.5 | 70.8 | 20 / 35 | 5601 |
| 4 | 2 | 62.8 | 63.2 | 14 / 35 | 4946 |
| 5 | 1 | 71.2 | 94.3 | 27 / 35 | 5548 |
| 6 | 1 | 71.5 | 94.6 | 31 / 35 | 5678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 93 | 88% |
| EH.Eagle 1.0.6 | 30 | 97% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| wee.Gem 1.8.4 | 11 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 20 | 35% | 77 |
| cs.Grudge 1.0 | 13 | 23% | 13 |
| EH.Eagle 1.0.6 | 8 | 14% | 43 |
| joe.ADinosaur 1.0 | 6 | 11% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 9% | 18 |
| throxbot.ThroxBot 0.1 | 2 | 4% | 16 |
| wee.Gem 1.8.4 | 2 | 4% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 10 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 8 |

Posture (Hadur's M records, 200 rounds): 120961 melee ticks, 37164 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 69 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39860 sent, 35244 reached their opponent, 8740 virtual hits (24.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475227. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.1 | 142 / 210 | 1.80 | 19.3% | 26123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.3% | 142 |
| kid.test.NightFox .2 | 2.2 | 14.3% | 18 |
| uji.Antique 1.0 | 3.0 | 12.5% | 26 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.6% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.5% | 9 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.4% | 8 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.8% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.1% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.1% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 25 / 35 | 4516 |
| 2 | 1 | 68.4 | 90.5 | 20 / 35 | 4189 |
| 3 | 1 | 69.7 | 93.3 | 26 / 35 | 4198 |
| 4 | 1 | 67.8 | 87.9 | 25 / 35 | 4056 |
| 5 | 1 | 69.3 | 90.5 | 24 / 35 | 4614 |
| 6 | 1 | 68.9 | 90.5 | 22 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 76 | 88% |
| uji.Antique 1.0 | 55 | 82% |
| qohnil.blot.BlotBot 3.61 | 14 | 79% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| ahr.ice.Ice 1.0.2 | 8 | 63% |
| matt.advanced.Katana 1.0 | 6 | 83% |
| amk.ChumbaWumba 0.3 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 18 | 26% | 60 |
| kid.test.NightFox .2 | 17 | 25% | 48 |
| pfvicm.Sobieski 7.2.3b | 14 | 21% | 31 |
| qohnil.blot.BlotBot 3.61 | 5 | 7% | 25 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 20 |
| amk.ChumbaWumba 0.3 | 4 | 6% | 11 |
| matt.advanced.Katana 1.0 | 2 | 3% | 9 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 0 |

Posture (Hadur's M records, 199 rounds): 126850 melee ticks, 38190 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 65 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 43153 sent, 38580 reached their opponent, 5501 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489584. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.5 | 113 / 210 | 1.86 | 19.9% | 31187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.9% | 113 |
| deewiant.Anomaly 0.2 | 2.3 | 15.6% | 45 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.0% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 1 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.5% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.4% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.8 | 22 / 35 | 5270 |
| 2 | 1 | 69.2 | 86.0 | 12 / 35 | 5178 |
| 3 | 1 | 72.0 | 94.6 | 23 / 35 | 5376 |
| 4 | 1 | 70.4 | 91.4 | 18 / 35 | 5132 |
| 5 | 1 | 70.2 | 89.2 | 17 / 35 | 5005 |
| 6 | 1 | 70.7 | 90.8 | 21 / 35 | 5226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 81 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 63% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 11 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 51 | 52% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 29% | 65 |
| jok.PheonixM 0.1.2 | 13 | 13% | 22 |
| myl.micro.Troodon 1.10 | 6 | 6% | 18 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 170447 melee ticks, 63863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 111 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 53392 sent, 48860 reached their opponent, 7461 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488394. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.4 | 78 / 210 | 2.65 | 18.3% | 25425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.3% | 78 |
| darkcanuck.B26354 1.06 | 2.5 | 15.7% | 56 |
| oog.melee.Capulet 1.2 | 3.2 | 14.4% | 31 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.4% | 27 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.2% | 10 |
| tripphippy.Alice 1.1 | 6.3 | 9.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.2% | 6 |
| ntc.Opposite 1.5 | 7.3 | 7.8% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 77.1 | 13 / 35 | 4009 |
| 2 | 1 | 65.4 | 77.9 | 16 / 35 | 4047 |
| 3 | 1 | 65.6 | 81.4 | 11 / 35 | 4130 |
| 4 | 1 | 66.5 | 81.1 | 13 / 35 | 4468 |
| 5 | 1 | 67.9 | 85.4 | 15 / 35 | 4627 |
| 6 | 1 | 63.3 | 73.6 | 10 / 35 | 4144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 51% |
| oog.melee.Capulet 1.2 | 29 | 55% |
| stelo.PastFuture 2.3.2 | 19 | 63% |
| intruder.PrairieWolf 2.61 | 17 | 71% |
| tripphippy.Alice 1.1 | 9 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 34% | 69 |
| oog.melee.Capulet 1.2 | 24 | 18% | 46 |
| stelo.PastFuture 2.3.2 | 23 | 17% | 33 |
| tripphippy.Alice 1.1 | 17 | 13% | 23 |
| intruder.PrairieWolf 2.61 | 12 | 9% | 25 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 8 |
| ntc.Opposite 1.5 | 5 | 4% | 6 |

Posture (Hadur's M records, 200 rounds): 157182 melee ticks, 41699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 35 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45908 sent, 41525 reached their opponent, 7128 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476895. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.1 | 61 / 210 | 2.70 | 16.2% | 22937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.3% | 99 |
| hadur117.Hadur 3.21aa | 1.8 | 16.2% | 61 |
| gh.mini.Griezel 0.2 | 3.0 | 13.0% | 37 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.7% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.6% | 3 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 2 |
| fm.mammillarias 1.3 | 8.0 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.8% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.5 | 9 / 35 | 3818 |
| 2 | 2 | 63.3 | 76.8 | 8 / 35 | 3346 |
| 3 | 2 | 66.4 | 84.1 | 12 / 35 | 4109 |
| 4 | 2 | 64.8 | 80.3 | 9 / 35 | 3689 |
| 5 | 1 | 67.9 | 86.7 | 12 / 35 | 4408 |
| 6 | 2 | 63.6 | 75.9 | 11 / 35 | 3567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 70 | 43% |
| gh.mini.Griezel 0.2 | 32 | 50% |
| d414.nano.Quantum 1.0.0 | 14 | 64% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |

Hadur died in 149 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 65 | 44% | 94 |
| gh.mini.Griezel 0.2 | 43 | 29% | 58 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 18 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 20 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 148650 melee ticks, 36022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 45 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48053 sent, 43150 reached their opponent, 6892 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478198. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.5 | 126 / 210 | 1.95 | 18.9% | 29133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.9% | 126 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 44 |
| apc.botM 3.0 | 3.3 | 11.8% | 20 |
| lxx.ConceptA 0.8 | 4.0 | 10.0% | 7 |
| vjik.UnViolation 1.1 | 5.0 | 10.2% | 8 |
| bayen.UbaMicro 1.4 | 5.7 | 8.9% | 1 |
| conscience.Electron 1.3g | 8.0 | 6.6% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 4 |
| panzer.Panzer 0.2 | 8.0 | 7.0% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 22 / 35 | 4620 |
| 2 | 1 | 69.7 | 93.7 | 23 / 35 | 5208 |
| 3 | 1 | 68.0 | 87.6 | 19 / 35 | 4834 |
| 4 | 1 | 68.0 | 86.0 | 20 / 35 | 4995 |
| 5 | 1 | 70.3 | 94.9 | 24 / 35 | 4960 |
| 6 | 1 | 67.5 | 88.6 | 18 / 35 | 4516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 66% |
| apc.botM 3.0 | 31 | 74% |
| vjik.UnViolation 1.1 | 17 | 88% |
| lxx.ConceptA 0.8 | 11 | 91% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| yk.JahMicro 1.0 | 6 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 45% | 93 |
| apc.botM 3.0 | 14 | 16% | 39 |
| lxx.ConceptA 0.8 | 8 | 9% | 16 |
| vjik.UnViolation 1.1 | 7 | 8% | 21 |
| bayen.UbaMicro 1.4 | 5 | 6% | 11 |
| panzer.Panzer 0.2 | 5 | 6% | 8 |
| yk.JahMicro 1.0 | 4 | 5% | 9 |
| conscience.Electron 1.3g | 4 | 5% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 120255 melee ticks, 49118 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41270 sent, 36521 reached their opponent, 6650 virtual hits (18.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489600. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.6 | 123 / 210 | 1.83 | 21.6% | 28672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.6% | 123 |
| maribo.Quester 0.3 | 2.0 | 18.0% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.1% | 20 |
| labg.Cataclysm 2.05 | 4.0 | 12.1% | 19 |
| baal.nano.N 1.42 | 5.3 | 10.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.7% | 3 |
| sanja.First 0.1 | 7.5 | 5.3% | 0 |
| zyx.micro.Ant 1.1 | 7.5 | 5.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.8 | 16 / 35 | 4693 |
| 2 | 1 | 69.7 | 87.9 | 20 / 35 | 4615 |
| 3 | 1 | 71.2 | 92.5 | 23 / 35 | 4887 |
| 4 | 1 | 70.8 | 92.9 | 23 / 35 | 4667 |
| 5 | 1 | 72.0 | 93.9 | 24 / 35 | 5197 |
| 6 | 1 | 68.9 | 83.9 | 17 / 35 | 4613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 82 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 73% |
| labg.Cataclysm 2.05 | 24 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 44% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 26% | 58 |
| labg.Cataclysm 2.05 | 10 | 11% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 16 |
| baal.nano.N 1.42 | 5 | 6% | 9 |
| sanja.First 0.1 | 1 | 1% | 5 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 167867 melee ticks, 53779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48490 sent, 44320 reached their opponent, 6520 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476974. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.8 | 100 / 210 | 2.01 | 19.0% | 32550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.0% | 100 |
| kid.Gladiator .7.2 | 2.3 | 16.2% | 44 |
| stelo.Spread 0.9 | 2.7 | 15.8% | 48 |
| jcs.Seth 1.8 | 4.2 | 11.7% | 15 |
| tcf.Reach 3 | 4.8 | 10.5% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 2.9% | 0 |
| sample.RamFire 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 15 / 35 | 4958 |
| 2 | 1 | 69.3 | 87.3 | 16 / 35 | 5343 |
| 3 | 1 | 71.0 | 90.5 | 18 / 35 | 5973 |
| 4 | 1 | 69.6 | 88.3 | 16 / 35 | 5492 |
| 5 | 1 | 69.3 | 88.6 | 13 / 35 | 5124 |
| 6 | 1 | 70.9 | 91.4 | 22 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 71% |
| kid.Gladiator .7.2 | 62 | 61% |
| jcs.Seth 1.8 | 20 | 55% |
| tcf.Reach 3 | 4 | 75% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 43 | 39% | 73 |
| stelo.Spread 0.9 | 37 | 34% | 83 |
| jcs.Seth 1.8 | 19 | 17% | 33 |
| tcf.Reach 3 | 9 | 8% | 13 |
| cli.Dancer 1.1 | 1 | 1% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |

Posture (Hadur's M records, 202 rounds): 171130 melee ticks, 57610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51947 sent, 47214 reached their opponent, 7824 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480934. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.7 | 50 / 210 | 2.38 | 16.6% | 23677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 132 |
| hadur117.Hadur 3.21aa | 2.0 | 16.6% | 50 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.7% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.8% | 3 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.3 | 5.3% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.9 | 7 / 35 | 3737 |
| 2 | 2 | 66.0 | 85.1 | 9 / 35 | 3778 |
| 3 | 2 | 66.9 | 86.3 | 11 / 35 | 4059 |
| 4 | 2 | 66.1 | 85.7 | 6 / 35 | 4026 |
| 5 | 2 | 65.4 | 82.5 | 8 / 35 | 3827 |
| 6 | 2 | 67.5 | 86.3 | 9 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 20% |
| gh.mini.Gruwel 0.9 | 31 | 58% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 80% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 58% | 115 |
| gh.mini.Gruwel 0.9 | 30 | 19% | 47 |
| rz.HawkOnFire 0.1 | 17 | 11% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 23 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 147131 melee ticks, 50835 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44812 sent, 39968 reached their opponent, 5936 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478237. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 6 battles (34.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.2 | 165 / 210 | 1.52 | 21.5% | 34618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 165 |
| alpha.RainingFire 1.0 | 2.2 | 12.5% | 17 |
| bzdp.Pansy 2.1 | 3.7 | 11.5% | 10 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 7 |
| mz.Cork 0.1 | 4.7 | 10.5% | 5 |
| bvh.mini.Fenrir 0.39 | 5.7 | 10.0% | 1 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.1% | 4 |
| dl.BetterWalls 1.0 | 8.7 | 5.0% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.2 | 27 / 35 | 5934 |
| 2 | 1 | 70.9 | 89.5 | 24 / 35 | 6034 |
| 3 | 1 | 72.8 | 96.8 | 30 / 35 | 5860 |
| 4 | 1 | 72.1 | 95.6 | 29 / 35 | 5623 |
| 5 | 1 | 71.5 | 93.3 | 28 / 35 | 5436 |
| 6 | 1 | 72.1 | 94.6 | 27 / 35 | 5731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 42 | 93% |
| bzdp.Pansy 2.1 | 40 | 93% |
| alpha.RainingFire 1.0 | 39 | 82% |
| mz.Cork 0.1 | 27 | 93% |
| bvh.mini.Fenrir 0.39 | 18 | 94% |
| m3thos.Eva02 0.7.1 | 14 | 86% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 42% | 53 |
| bvh.micro.Freya 0.3 | 8 | 18% | 42 |
| bzdp.Pansy 2.1 | 6 | 13% | 40 |
| m3thos.Eva02 0.7.1 | 5 | 11% | 22 |
| bvh.mini.Fenrir 0.39 | 4 | 9% | 17 |
| mz.Cork 0.1 | 2 | 4% | 26 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 141299 melee ticks, 52051 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 48031 sent, 43596 reached their opponent, 9084 virtual hits (20.8% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482676. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 6 battles (42.3 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.1 | 165 / 210 | 1.71 | 20.0% | 34323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.0% | 165 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.9% | 6 |
| germ.TheMind .2 | 2.7 | 10.4% | 11 |
| EBBU.Sim2 1.02 | 4.0 | 9.7% | 3 |
| agrach.Dalek 1.0 | 5.5 | 8.9% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.6% | 1 |
| lmk.ACPFinal 0.1 | 7.2 | 8.3% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.1% | 6 |
| mb.Beast 0.1 | 8.5 | 7.9% | 6 |
| skm.Ryubot 1.0 | 9.7 | 7.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.4 | 25 / 35 | 5806 |
| 2 | 1 | 68.1 | 88.9 | 25 / 35 | 5307 |
| 3 | 1 | 70.5 | 93.0 | 29 / 35 | 6334 |
| 4 | 1 | 70.8 | 95.9 | 31 / 35 | 5995 |
| 5 | 1 | 68.1 | 89.2 | 27 / 35 | 5295 |
| 6 | 1 | 69.7 | 94.3 | 28 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 90% |
| EBBU.Sim2 1.02 | 26 | 96% |
| agrach.Dalek 1.0 | 25 | 84% |
| mb.Beast 0.1 | 24 | 96% |
| germ.TheMind .2 | 23 | 87% |
| lmk.ACPFinal 0.1 | 19 | 100% |
| stelo.UntouchableNano 1.3 | 17 | 88% |
| skm.Ryubot 1.0 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 11 | 23% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 15% | 43 |
| EBBU.Sim2 1.02 | 7 | 15% | 29 |
| agrach.Dalek 1.0 | 6 | 13% | 31 |
| germ.TheMind .2 | 5 | 11% | 27 |
| stelo.UntouchableNano 1.3 | 4 | 9% | 17 |
| lmk.ACPFinal 0.1 | 3 | 6% | 19 |
| mb.Beast 0.1 | 2 | 4% | 22 |
| skm.Ryubot 1.0 | 2 | 4% | 7 |

Posture (Hadur's M records, 200 rounds): 96576 melee ticks, 29340 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 32549 sent, 28195 reached their opponent, 8170 virtual hits (29.0% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495312. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.0 | 110 / 210 | 2.08 | 18.5% | 28300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.5% | 110 |
| justin.Mallais 14.0 | 2.2 | 15.6% | 61 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 16 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.2% | 14 |
| cs.Wren 1.0 | 5.5 | 9.7% | 0 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.3% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.8% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.5 | 16 / 35 | 4890 |
| 2 | 1 | 70.5 | 94.6 | 21 / 35 | 5104 |
| 3 | 1 | 68.8 | 89.5 | 18 / 35 | 4770 |
| 4 | 1 | 67.1 | 86.3 | 17 / 35 | 4245 |
| 5 | 1 | 67.4 | 86.0 | 18 / 35 | 4367 |
| 6 | 1 | 69.1 | 89.2 | 20 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 71 | 62% |
| bvh.mini.Freya 0.55 | 30 | 77% |
| bts.mega.Gnarly 1.4 | 23 | 74% |
| cs.Wren 1.0 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 42% | 77 |
| bvh.mini.Freya 0.55 | 20 | 20% | 36 |
| bts.mega.Gnarly 1.4 | 14 | 14% | 37 |
| kdf.KoulDestroyer 1.0 | 8 | 8% | 17 |
| cs.Wren 1.0 | 6 | 6% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 4% | 9 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 137524 melee ticks, 39432 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45144 sent, 40137 reached their opponent, 8356 virtual hits (20.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478407. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.8 | 131 / 210 | 1.73 | 21.9% | 32622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.9% | 131 |
| bvh.fry.Freya 0.82 | 2.2 | 15.9% | 15 |
| az.Ololobot 0.2.4 | 2.8 | 14.5% | 57 |
| winamp32.micro.MicroMacro 1.0 | 4.3 | 10.0% | 5 |
| gimp.GimpBot 0.1 | 5.3 | 8.9% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.3% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.3 | 6.1% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.3 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.0 | 25 / 35 | 5819 |
| 2 | 1 | 70.0 | 93.6 | 21 / 35 | 5162 |
| 3 | 1 | 69.2 | 88.2 | 21 / 35 | 5328 |
| 4 | 1 | 70.5 | 92.1 | 22 / 35 | 5593 |
| 5 | 1 | 68.9 | 87.5 | 21 / 35 | 5306 |
| 6 | 1 | 70.5 | 93.6 | 21 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 82 | 52% |
| bvh.fry.Freya 0.82 | 60 | 90% |
| winamp32.micro.MicroMacro 1.0 | 15 | 80% |
| gimp.GimpBot 0.1 | 13 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 40 | 51% | 88 |
| bvh.fry.Freya 0.82 | 28 | 35% | 64 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 23 |
| gimp.GimpBot 0.1 | 3 | 4% | 18 |
| apollokidd.ApolloKidd 0.9 | 3 | 4% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 154024 melee ticks, 65755 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 61 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45245 sent, 41082 reached their opponent, 7688 virtual hits (18.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490015. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.7 | 137 / 210 | 1.84 | 20.2% | 32554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.2% | 137 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 31 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.8% | 21 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 6 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.3% | 6 |
| stelo.Randomness 1.0 | 6.3 | 8.8% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 8.9% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.8% | 0 |
| sample.Corners 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.1 | 23 / 35 | 5725 |
| 2 | 1 | 70.6 | 91.1 | 26 / 35 | 5199 |
| 3 | 1 | 70.2 | 89.5 | 20 / 35 | 5132 |
| 4 | 1 | 69.4 | 85.7 | 18 / 35 | 5398 |
| 5 | 1 | 71.6 | 93.0 | 26 / 35 | 5481 |
| 6 | 1 | 71.4 | 92.7 | 24 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 76% |
| kano.gamma.KanoGamma 1.8 | 41 | 85% |
| mz.AntiGrav 1.0 | 28 | 93% |
| Polkwane.SmashMelee 1.0 | 17 | 94% |
| stelo.Randomness 1.0 | 11 | 82% |
| alpha.BlackIce 1.0 | 4 | 75% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 33% | 58 |
| kano.gamma.KanoGamma 1.8 | 14 | 19% | 57 |
| mz.AntiGrav 1.0 | 11 | 15% | 30 |
| Polkwane.SmashMelee 1.0 | 10 | 14% | 24 |
| stelo.Randomness 1.0 | 7 | 10% | 21 |
| alpha.BlackIce 1.0 | 5 | 7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 151883 melee ticks, 38747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 123 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 123 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49825 sent, 44845 reached their opponent, 9336 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472901. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 100 / 210 | 2.06 | 18.3% | 27097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.3% | 100 |
| eem.EvBotNG v12.8 | 2.0 | 17.0% | 83 |
| ary.Swarm 1.1 | 3.2 | 12.9% | 8 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 11.9% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 3 |
| shrub.Silver v048 | 5.8 | 9.1% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.8 | 20 / 35 | 4703 |
| 2 | 1 | 68.3 | 85.7 | 14 / 35 | 4893 |
| 3 | 1 | 68.7 | 89.5 | 18 / 35 | 4249 |
| 4 | 1 | 68.3 | 88.3 | 15 / 35 | 4491 |
| 5 | 1 | 68.6 | 87.0 | 18 / 35 | 4517 |
| 6 | 1 | 68.1 | 88.3 | 15 / 35 | 4244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 95 | 48% |
| ary.Swarm 1.1 | 27 | 100% |
| lessonz.robocode.Oz 0.5.0 | 18 | 78% |
| simonton.nano.MeleeSeed 1.8 | 11 | 91% |
| shrub.Silver v048 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 63 | 57% | 111 |
| lessonz.robocode.Oz 0.5.0 | 19 | 17% | 33 |
| ary.Swarm 1.1 | 11 | 10% | 27 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 21 |
| shrub.Silver v048 | 4 | 4% | 8 |
| stelo.Mirror 1.1 | 3 | 3% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 153850 melee ticks, 51033 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49670 sent, 44782 reached their opponent, 6812 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486919. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.3 | 142 / 210 | 1.78 | 20.5% | 36108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.5% | 142 |
| wompi.Wallaby 5.1 | 2.0 | 15.2% | 37 |
| ara.Shera 0.88 | 3.5 | 13.1% | 23 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 12.9% | 4 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 6.4% | 1 |
| dsw.StaticD 1.0 | 7.3 | 6.4% | 2 |
| stelo.MirrorMicro 1.0 | 7.3 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.4 | 17 / 35 | 5505 |
| 2 | 1 | 71.4 | 92.7 | 26 / 35 | 6121 |
| 3 | 1 | 71.9 | 93.3 | 27 / 35 | 6163 |
| 4 | 1 | 71.2 | 90.2 | 21 / 35 | 6222 |
| 5 | 1 | 70.0 | 91.7 | 20 / 35 | 5742 |
| 6 | 1 | 72.6 | 95.6 | 31 / 35 | 6355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 86% |
| maribo.mini.MiniQuester 0.1 | 45 | 96% |
| ara.Shera 0.88 | 27 | 59% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 70 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 31 | 44% | 54 |
| wompi.Wallaby 5.1 | 22 | 31% | 94 |
| maribo.mini.MiniQuester 0.1 | 8 | 11% | 44 |
| amz.NanoClone 1.41 | 3 | 4% | 5 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 4 |
| dsw.StaticD 1.0 | 2 | 3% | 3 |
| maribo.IotaCT 1.1 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 158149 melee ticks, 50304 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 27 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49564 sent, 45014 reached their opponent, 8951 virtual hits (19.9% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481438. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.2 | 38 / 210 | 2.69 | 16.4% | 26409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 142 |
| hadur117.Hadur 3.21aa | 2.0 | 16.4% | 38 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.2% | 9 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.2% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.4% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.5% | 0 |
| mz.NanoGod 2.02 | 7.2 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 81.6 | 6 / 35 | 4548 |
| 2 | 2 | 66.4 | 78.1 | 7 / 35 | 4414 |
| 3 | 2 | 67.3 | 81.9 | 7 / 35 | 4698 |
| 4 | 2 | 65.4 | 79.4 | 2 / 35 | 4027 |
| 5 | 2 | 68.6 | 86.0 | 10 / 35 | 4668 |
| 6 | 2 | 66.1 | 80.3 | 6 / 35 | 4054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 85 | 19% |
| dummy.micro.Sparrow 2.5 | 16 | 75% |
| brainfade.melee.Dusk 0.44 | 14 | 36% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |

Hadur died in 173 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 59% | 121 |
| brainfade.melee.Dusk 0.44 | 26 | 15% | 31 |
| dummy.micro.Sparrow 2.5 | 21 | 12% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 14 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |

Posture (Hadur's M records, 201 rounds): 155940 melee ticks, 47295 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 25 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48593 sent, 43837 reached their opponent, 7221 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487545. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.9 | 146 / 210 | 1.55 | 21.2% | 35872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.2% | 146 |
| stelo.Liblix 0.3.1 | 2.0 | 15.1% | 42 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.7% | 3 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 1 |
| disan.Chair 2.2.0 | 6.3 | 7.7% | 2 |
| wompi.Quokka 1.6 | 6.7 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 25 / 35 | 6045 |
| 2 | 1 | 72.0 | 95.2 | 24 / 35 | 5871 |
| 3 | 1 | 70.9 | 90.8 | 21 / 35 | 5937 |
| 4 | 1 | 71.5 | 92.1 | 22 / 35 | 5850 |
| 5 | 1 | 72.4 | 95.6 | 28 / 35 | 6202 |
| 6 | 1 | 72.1 | 96.2 | 26 / 35 | 5967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 68% |
| tzu.TheArtOfWar 1.2 | 65 | 91% |
| jwirde.Gort 2.0 | 11 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 73% |
| disan.Chair 2.2.0 | 8 | 88% |
| wompi.Quokka 1.6 | 3 | 67% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 58% | 98 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 14% | 20 |
| tzu.TheArtOfWar 1.2 | 8 | 13% | 58 |
| disan.Chair 2.2.0 | 4 | 6% | 8 |
| jwirde.Gort 2.0 | 3 | 5% | 16 |
| wompi.Quokka 1.6 | 3 | 5% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 153439 melee ticks, 46123 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 83 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 83 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51642 sent, 46999 reached their opponent, 9739 virtual hits (20.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484789. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.0 | 120 / 210 | 1.90 | 20.1% | 32351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.1% | 120 |
| jje.BagPuss 1.2 | 2.3 | 12.9% | 12 |
| myl.nano.Graviton 1.10 | 4.0 | 11.1% | 8 |
| eem.IWillFireNoBullet v2.8 | 4.2 | 9.4% | 48 |
| sul.Lunar 1.1 | 4.5 | 10.6% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.9% | 5 |
| hvilela.HVilela 0.9 | 6.8 | 8.7% | 0 |
| fm.claire 1.7 | 7.0 | 8.6% | 0 |
| wit.Deep7 2.0 | 9.0 | 4.9% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 19 / 35 | 5105 |
| 2 | 1 | 72.5 | 94.0 | 29 / 35 | 4834 |
| 3 | 1 | 71.8 | 93.0 | 24 / 35 | 6131 |
| 4 | 1 | 68.7 | 86.0 | 14 / 35 | 5636 |
| 5 | 1 | 70.4 | 90.8 | 21 / 35 | 5364 |
| 6 | 1 | 68.7 | 88.3 | 13 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 52 | 58% |
| jje.BagPuss 1.2 | 37 | 78% |
| myl.nano.Graviton 1.10 | 29 | 90% |
| sul.Lunar 1.1 | 24 | 71% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 80% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1379. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 26 | 29% | 0 |
| jje.BagPuss 1.2 | 23 | 26% | 72 |
| sul.Lunar 1.1 | 14 | 16% | 39 |
| myl.nano.Graviton 1.10 | 9 | 10% | 41 |
| fm.claire 1.7 | 7 | 8% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 7% | 15 |
| hvilela.HVilela 0.9 | 3 | 3% | 13 |
| wit.Deep7 2.0 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 186521 melee ticks, 64383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56524 sent, 51923 reached their opponent, 7956 virtual hits (15.3% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473292. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.8 | 129 / 210 | 1.74 | 21.4% | 29600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.4% | 129 |
| kc.mini.Mirage 0.2 | 2.0 | 18.9% | 64 |
| mz.MicroSheep 1.0 | 3.3 | 12.2% | 6 |
| cx.Princess 1.0 | 4.2 | 11.7% | 11 |
| sadoner.killer 0.2 | 5.0 | 10.4% | 0 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.7% | 0 |
| kurios.DOSexe .9a | 7.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.0 | 23 / 35 | 4890 |
| 2 | 1 | 69.2 | 88.2 | 19 / 35 | 5028 |
| 3 | 1 | 69.1 | 88.2 | 19 / 35 | 4768 |
| 4 | 1 | 70.0 | 90.7 | 22 / 35 | 5094 |
| 5 | 1 | 71.1 | 94.6 | 26 / 35 | 5055 |
| 6 | 1 | 70.0 | 92.9 | 20 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 119 | 68% |
| cx.Princess 1.0 | 21 | 81% |
| mz.MicroSheep 1.0 | 19 | 89% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| sadoner.killer 0.2 | 4 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 70% | 134 |
| cx.Princess 1.0 | 8 | 10% | 22 |
| mz.MicroSheep 1.0 | 6 | 7% | 23 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 14 |
| sadoner.killer 0.2 | 4 | 5% | 11 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 4 |
| kurios.DOSexe .9a | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 141242 melee ticks, 54702 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39029 sent, 34852 reached their opponent, 5694 virtual hits (16.3% of those reached).

