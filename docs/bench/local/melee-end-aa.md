# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1535249. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.6 | 56 / 210 | 2.39 | 17.4% | 32362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 141 |
| hadur117.Hadur 3.21aa | 2.0 | 17.4% | 56 |
| sgp.JollyNinja 3.53 | 3.7 | 11.2% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.6% | 2 |
| mz.MicroGodMelee 1 | 4.8 | 10.0% | 2 |
| lorneswork.Predator 1.0 | 5.2 | 9.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 8.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.0% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.1 | 8 / 35 | 5136 |
| 2 | 2 | 67.7 | 87.3 | 9 / 35 | 5135 |
| 3 | 2 | 66.6 | 79.7 | 10 / 35 | 5482 |
| 4 | 2 | 67.1 | 81.9 | 7 / 35 | 5653 |
| 5 | 2 | 68.1 | 87.9 | 11 / 35 | 5327 |
| 6 | 2 | 68.3 | 85.7 | 11 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 10% |
| sgp.JollyNinja 3.53 | 24 | 83% |
| mz.MicroGodMelee 1 | 14 | 93% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 71% | 127 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 20 |
| sgp.JollyNinja 3.53 | 11 | 7% | 25 |
| lorneswork.Predator 1.0 | 10 | 6% | 14 |
| mz.MicroGodMelee 1 | 6 | 4% | 18 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 133991 melee ticks, 79566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 58 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 43225 sent, 38680 reached their opponent, 7913 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1543651. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.8 | 118 / 210 | 2.10 | 19.3% | 31092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.3% | 118 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.4% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.1% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.6% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.9% | 2 |
| sch.Simone 0.3d | 7.0 | 7.8% | 6 |
| Noran.BitchingElk 0.054 | 7.5 | 6.8% | 8 |
| stelo.PatternRobot 1.0 | 8.8 | 5.7% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 19 / 35 | 4878 |
| 2 | 1 | 69.9 | 90.5 | 22 / 35 | 5248 |
| 3 | 1 | 69.8 | 88.9 | 19 / 35 | 5509 |
| 4 | 1 | 69.1 | 89.2 | 19 / 35 | 4936 |
| 5 | 1 | 68.5 | 84.8 | 17 / 35 | 5263 |
| 6 | 1 | 69.7 | 87.3 | 22 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 59 | 54% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 84% |
| Noran.BitchingElk 0.054 | 17 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 67% |
| sch.Simone 0.3d | 14 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 40% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 18% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 12% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 11% | 25 |
| sch.Simone 0.3d | 8 | 9% | 21 |
| Noran.BitchingElk 0.054 | 5 | 5% | 19 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 10 |
| stelo.PatternRobot 1.0 | 2 | 2% | 4 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 161894 melee ticks, 44685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 79 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57587 sent, 52906 reached their opponent, 8994 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1552728. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.2 | 170 / 210 | 1.70 | 20.7% | 37453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.7% | 170 |
| radnor.DoctorBob 1.42 | 2.3 | 13.8% | 15 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 13 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.8% | 11 |
| urdos.URDOS 1.3 | 5.3 | 8.7% | 1 |
| adt.Ar1 2.1 | 5.8 | 8.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.7 | 29 / 35 | 6027 |
| 2 | 1 | 69.6 | 87.0 | 28 / 35 | 5821 |
| 3 | 1 | 71.2 | 92.4 | 25 / 35 | 6515 |
| 4 | 1 | 70.1 | 89.2 | 27 / 35 | 6148 |
| 5 | 1 | 72.6 | 98.1 | 31 / 35 | 6670 |
| 6 | 1 | 71.2 | 92.7 | 30 / 35 | 6272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 90% |
| radnor.DoctorBob 1.42 | 61 | 100% |
| kawigi.nano.Lib 1.0 | 40 | 93% |
| adt.Ar1 2.1 | 7 | 100% |
| urdos.URDOS 1.3 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 12 | 30% | 56 |
| vuen.Cake 2.51 | 11 | 28% | 70 |
| kawigi.nano.Lib 1.0 | 7 | 18% | 45 |
| urdos.URDOS 1.3 | 5 | 13% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 13% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 6 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 119875 melee ticks, 39111 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 36 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37220 sent, 32576 reached their opponent, 8281 virtual hits (25.4% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537876. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 6 battles (17.5 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.8 | 31 / 210 | 2.19 | 18.0% | 34825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 162 |
| hadur117.Hadur 3.21aa | 2.0 | 18.0% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 5 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 1 |
| css.Delitioner 0.11 | 5.8 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.6 | 89.2 | 10 / 35 | 5626 |
| 2 | 2 | 68.9 | 88.3 | 4 / 35 | 5944 |
| 3 | 2 | 67.8 | 83.8 | 3 / 35 | 5652 |
| 4 | 2 | 68.7 | 87.9 | 5 / 35 | 5676 |
| 5 | 2 | 69.0 | 86.0 | 5 / 35 | 6156 |
| 6 | 2 | 68.3 | 85.4 | 4 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 130 | 7% |
| TNT.TNT 0.99.1 | 14 | 64% |
| apc.LeeroyJenkins2 1.0 | 13 | 62% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 77% | 150 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 21 |
| TNT.TNT 0.99.1 | 14 | 8% | 24 |
| josago.Jorgito 0.16 | 10 | 6% | 11 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 189698 melee ticks, 71384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 58 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57362 sent, 52711 reached their opponent, 7963 virtual hits (15.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1546300. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.6 | 32 / 210 | 2.66 | 16.0% | 25953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.1% | 96 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 64 |
| hadur117.Hadur 3.21aa | 2.7 | 16.0% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 13 |
| ms.Ares 0.19 | 5.5 | 8.9% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 8.8% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 80.0 | 4 / 35 | 3920 |
| 2 | 3 | 64.4 | 79.0 | 5 / 35 | 3865 |
| 3 | 3 | 65.6 | 80.0 | 6 / 35 | 4560 |
| 4 | 3 | 66.1 | 83.8 | 5 / 35 | 4432 |
| 5 | 1 | 67.4 | 85.7 | 7 / 35 | 4732 |
| 6 | 3 | 65.6 | 81.0 | 5 / 35 | 4444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 28% |
| cb.fire.Firestarter 2.0f | 41 | 12% |
| wompi.Numbat 2.1 | 19 | 63% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 178 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 78 | 44% | 91 |
| cb.fire.Firestarter 2.0f | 62 | 35% | 70 |
| wompi.Numbat 2.1 | 29 | 16% | 38 |
| axeBots.HataMoto 3.09 | 5 | 3% | 6 |
| ms.Ares 0.19 | 3 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 202 rounds): 159995 melee ticks, 43490 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48202 sent, 43326 reached their opponent, 7330 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1543345. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.3 | 152 / 210 | 1.60 | 21.1% | 35426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.1% | 152 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 21 |
| origin.SleepSiphon 1.7b | 3.3 | 12.8% | 25 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.7% | 6 |
| mld.Wisdom 1.0 | 4.5 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.2 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.4% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.6 | 26 / 35 | 5847 |
| 2 | 1 | 71.3 | 92.1 | 23 / 35 | 5691 |
| 3 | 1 | 71.7 | 93.7 | 25 / 35 | 5740 |
| 4 | 1 | 70.7 | 88.6 | 23 / 35 | 5920 |
| 5 | 1 | 71.4 | 92.4 | 24 / 35 | 5814 |
| 6 | 1 | 73.5 | 98.4 | 31 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 90% |
| origin.SleepSiphon 1.7b | 46 | 76% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 89% |
| gg.Wolverine 2.0 | 13 | 85% |
| mld.Wisdom 1.0 | 8 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 20 | 34% | 68 |
| jekl.StoneGhost 0.7 | 18 | 31% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 15% | 48 |
| mld.Wisdom 1.0 | 5 | 8% | 14 |
| gg.Wolverine 2.0 | 4 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 9 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |
| sample.Fire 1.0 | 1 | 2% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 149890 melee ticks, 45433 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 602 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45305 sent, 40748 reached their opponent, 8988 virtual hits (22.1% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1551021. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.3 | 96.1 | 168 / 210 | 1.31 | 25.9% | 45980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 25.9% | 168 |
| rtk.Tachikoma 1.0 | 2.0 | 18.8% | 24 |
| franzor.Lizt 1.3.1 | 3.5 | 12.6% | 7 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 9.9% | 0 |
| exauge.GateKeeper 1.1.121g | 5.8 | 8.9% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.4% | 0 |
| sample.Target 1.0 | 8.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.6 | 95.7 | 28 / 35 | 7987 |
| 2 | 1 | 75.3 | 96.1 | 27 / 35 | 7944 |
| 3 | 1 | 75.5 | 96.8 | 28 / 35 | 7608 |
| 4 | 1 | 75.5 | 97.1 | 30 / 35 | 7641 |
| 5 | 1 | 74.5 | 94.3 | 26 / 35 | 7111 |
| 6 | 1 | 75.3 | 96.8 | 29 / 35 | 7689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 114 | 83% |
| oog.melee.CapuletDroid 1.1 | 46 | 91% |
| franzor.Lizt 1.3.1 | 34 | 85% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 25 | 60% | 129 |
| franzor.Lizt 1.3.1 | 9 | 21% | 6 |
| oog.melee.CapuletDroid 1.1 | 7 | 17% | 62 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 6 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 188298 melee ticks, 89131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 52511 sent, 48524 reached their opponent, 10390 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540481. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 6 battles (46.2 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.4 | 139 / 210 | 1.69 | 22.2% | 30711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.2% | 139 |
| tm.Yuugao 1.0 | 2.5 | 15.7% | 34 |
| shrub.Vapour v159 | 2.5 | 15.0% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.6% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 4.8 | 9.7% | 4 |
| m3thos.Eva00 1.1 | 5.7 | 9.4% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.3 | 7.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 5.5% | 0 |
| SHAM.WOW 1.4 | 8.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.5 | 21 / 35 | 5054 |
| 2 | 1 | 71.8 | 94.3 | 28 / 35 | 5501 |
| 3 | 1 | 69.2 | 89.6 | 21 / 35 | 4645 |
| 4 | 1 | 70.7 | 91.1 | 25 / 35 | 5168 |
| 5 | 1 | 70.0 | 90.0 | 22 / 35 | 4888 |
| 6 | 1 | 71.0 | 90.7 | 22 / 35 | 5455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 67 | 75% |
| shrub.Vapour v159 | 58 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 96% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 81% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 29 | 41% | 67 |
| tm.Yuugao 1.0 | 24 | 34% | 72 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 10% | 23 |
| zyx.nano.BacillusComma 1.0 | 6 | 8% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 6% | 25 |
| m3thos.Eva00 1.1 | 1 | 1% | 11 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 146474 melee ticks, 49796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43983 sent, 39758 reached their opponent, 7373 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1539159. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.5 | 65 / 210 | 3.02 | 15.8% | 22687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.1% | 97 |
| hadur117.Hadur 3.21aa | 2.0 | 15.8% | 65 |
| kc.micro.Figment 1.0 | 2.7 | 14.3% | 26 |
| yagami.Tidus 0.11 | 4.3 | 11.5% | 2 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.3% | 12 |
| mc2.enemy.Original 0.9 | 6.2 | 8.4% | 8 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 4.8% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 82.5 | 12 / 35 | 4160 |
| 2 | 1 | 64.6 | 77.5 | 13 / 35 | 3935 |
| 3 | 3 | 61.4 | 70.8 | 6 / 35 | 3311 |
| 4 | 2 | 64.7 | 79.0 | 11 / 35 | 3705 |
| 5 | 1 | 66.7 | 84.4 | 15 / 35 | 3932 |
| 6 | 3 | 62.7 | 70.8 | 8 / 35 | 3644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 30% |
| kc.micro.Figment 1.0 | 30 | 97% |
| yagami.Tidus 0.11 | 13 | 92% |
| pedersen.Grishnakh 1.0 | 10 | 40% |
| mc2.enemy.Original 0.9 | 6 | 33% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 41% | 77 |
| kc.micro.Figment 1.0 | 19 | 13% | 51 |
| mc2.enemy.Original 0.9 | 16 | 11% | 20 |
| yagami.Tidus 0.11 | 14 | 10% | 19 |
| pedersen.Grishnakh 1.0 | 14 | 10% | 18 |
| dft.Calliope 5.6 | 11 | 8% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 139800 melee ticks, 33015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 43 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46293 sent, 41714 reached their opponent, 5863 virtual hits (14.1% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1525029. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.9 | 173 / 210 | 1.37 | 21.3% | 36330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 173 |
| DTF.Kludgy 1.2b | 2.0 | 14.4% | 16 |
| ne.Chimera 1.2 | 3.3 | 12.6% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 12.3% | 8 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.3% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 6 |
| kurios.DOSexe .9b | 7.3 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.0 | 4.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.6% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 96.2 | 30 / 35 | 5885 |
| 2 | 1 | 72.6 | 97.1 | 30 / 35 | 6238 |
| 3 | 1 | 72.4 | 95.9 | 29 / 35 | 6250 |
| 4 | 1 | 72.1 | 95.2 | 28 / 35 | 6176 |
| 5 | 1 | 71.4 | 95.2 | 26 / 35 | 5688 |
| 6 | 1 | 72.0 | 95.9 | 30 / 35 | 6093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 78 | 88% |
| ejb.Polaris 1.0.1 | 41 | 90% |
| ne.Chimera 1.2 | 27 | 93% |
| vStar.RAFzilla 2.15 | 25 | 88% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 38% | 78 |
| ejb.Polaris 1.0.1 | 8 | 21% | 50 |
| ne.Chimera 1.2 | 7 | 18% | 32 |
| vStar.RAFzilla 2.15 | 5 | 13% | 21 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 16 |
| kurios.DOSexe .9b | 1 | 3% | 7 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 142679 melee ticks, 56747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 583 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 196 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 46447 sent, 41902 reached their opponent, 8003 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1533206. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.4 | 84 / 210 | 2.49 | 17.0% | 24517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.0% | 84 |
| rz.Aleph 0.34 | 2.0 | 16.3% | 64 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 16 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 13 |
| rdt199.Warlord 0.73 | 5.5 | 9.2% | 10 |
| br2.MobyDickBot 1.6 | 5.7 | 9.0% | 13 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.8% | 0 |
| uji.YellohFellah 1.0 | 7.5 | 7.7% | 9 |
| stelo.MirrorNano 1.3 | 9.3 | 4.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.8 | 12 / 35 | 4254 |
| 2 | 1 | 67.6 | 87.9 | 18 / 35 | 4206 |
| 3 | 1 | 64.9 | 81.9 | 12 / 35 | 3829 |
| 4 | 1 | 65.7 | 81.6 | 15 / 35 | 4059 |
| 5 | 1 | 66.4 | 84.1 | 15 / 35 | 4097 |
| 6 | 1 | 65.0 | 80.3 | 12 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 62 | 56% |
| djc.DynaBot 0.1.1 | 21 | 67% |
| br2.MobyDickBot 1.6 | 16 | 56% |
| cx.mini.Nimrod 0.55 | 15 | 67% |
| rdt199.Warlord 0.73 | 10 | 80% |
| uji.YellohFellah 1.0 | 9 | 78% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 43% | 91 |
| cx.mini.Nimrod 0.55 | 17 | 13% | 23 |
| rdt199.Warlord 0.73 | 13 | 10% | 25 |
| br2.MobyDickBot 1.6 | 13 | 10% | 21 |
| djc.DynaBot 0.1.1 | 11 | 9% | 25 |
| uji.YellohFellah 1.0 | 7 | 6% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 5% | 6 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 156601 melee ticks, 42475 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 74 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50259 sent, 45453 reached their opponent, 6151 virtual hits (13.5% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1548634. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.8 | 111 / 210 | 2.46 | 17.4% | 23117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.4% | 111 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.1% | 34 |
| nat.PallasHawk 1.0 | 3.3 | 12.8% | 30 |
| darkcanuck.Leon 1.01 | 3.5 | 12.3% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.3% | 1 |
| stuff.Vlad 0.1 | 8.8 | 6.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.0 | 19 / 35 | 4128 |
| 2 | 1 | 65.9 | 81.9 | 18 / 35 | 3863 |
| 3 | 1 | 68.1 | 87.9 | 22 / 35 | 3975 |
| 4 | 1 | 65.3 | 80.0 | 17 / 35 | 3626 |
| 5 | 1 | 65.6 | 82.5 | 17 / 35 | 3832 |
| 6 | 1 | 66.0 | 83.5 | 18 / 35 | 3693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 47 | 79% |
| nat.PallasHawk 1.0 | 40 | 70% |
| darkcanuck.Leon 1.01 | 30 | 90% |
| brainfade.melee.Genghis 0.36 | 18 | 56% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 32 | 31% | 53 |
| nat.PallasHawk 1.0 | 21 | 20% | 47 |
| darkcanuck.Leon 1.01 | 15 | 15% | 51 |
| brainfade.melee.Genghis 0.36 | 15 | 15% | 22 |
| jrm.Test0 1.0 | 12 | 12% | 16 |
| jp.Perpy 16.0 | 4 | 4% | 10 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 123345 melee ticks, 31974 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42889 sent, 38003 reached their opponent, 6341 virtual hits (16.7% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1532373. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.3 | 74 / 210 | 2.60 | 16.4% | 26272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.6% | 85 |
| hadur117.Hadur 3.21aa | 1.8 | 16.4% | 74 |
| ags.Glacier 0.2.11 | 2.3 | 16.5% | 35 |
| shinh.Entangled 0.3 | 4.3 | 11.5% | 10 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 7 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.3% | 0 |
| maribo.FollowFire 1 | 8.3 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 79.7 | 9 / 35 | 4109 |
| 2 | 3 | 64.7 | 81.0 | 9 / 35 | 4207 |
| 3 | 1 | 66.4 | 82.2 | 11 / 35 | 4656 |
| 4 | 2 | 66.1 | 83.5 | 13 / 35 | 4196 |
| 5 | 1 | 66.9 | 83.2 | 14 / 35 | 4556 |
| 6 | 1 | 67.4 | 84.1 | 18 / 35 | 4548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 56 | 75% |
| mn.Combat 3.25.0 | 47 | 28% |
| shinh.Entangled 0.3 | 17 | 82% |
| gh.micro.Gruweltje 0.7 | 7 | 57% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 39% | 72 |
| ags.Glacier 0.2.11 | 45 | 33% | 80 |
| gh.micro.Gruweltje 0.7 | 16 | 12% | 24 |
| shinh.Entangled 0.3 | 14 | 10% | 25 |
| maribo.FollowFire 1 | 5 | 4% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
| stelo.Wang 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 197 rounds): 141963 melee ticks, 45155 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 73 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 41616 sent, 36732 reached their opponent, 5868 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1532358. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 97.0 | 185 / 210 | 1.24 | 24.2% | 36831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.2% | 185 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.5% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 3.5 | 11.0% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 3.5 | 11.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.9% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 9.3% | 4 |
| pa.Improved 1.0 | 8.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.1 | 30 / 35 | 5956 |
| 2 | 1 | 72.7 | 96.4 | 29 / 35 | 6225 |
| 3 | 1 | 72.6 | 96.4 | 29 / 35 | 6102 |
| 4 | 1 | 73.4 | 98.9 | 33 / 35 | 6129 |
| 5 | 1 | 73.6 | 96.4 | 31 / 35 | 6299 |
| 6 | 1 | 73.3 | 97.9 | 33 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 27 | 93% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 12 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 14 | 56% | 106 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 24% | 39 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 12% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 4% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 4% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 11 |
| pa.Improved 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 125136 melee ticks, 52375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36991 sent, 32977 reached their opponent, 8184 virtual hits (24.8% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1548379. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.8 | 104 / 210 | 2.28 | 18.7% | 31417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.7% | 104 |
| emp.Yngwie 1.11 | 2.3 | 13.8% | 57 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.2% | 15 |
| mld.DustBunny 3.8 | 4.3 | 12.0% | 9 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.9% | 6 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.7% | 19 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.4% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 16 / 35 | 5400 |
| 2 | 1 | 68.6 | 85.7 | 19 / 35 | 5339 |
| 3 | 1 | 70.3 | 91.1 | 19 / 35 | 5443 |
| 4 | 1 | 68.4 | 84.4 | 17 / 35 | 5396 |
| 5 | 1 | 67.3 | 81.0 | 16 / 35 | 4866 |
| 6 | 1 | 68.5 | 88.3 | 17 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 57 | 47% |
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| mld.DustBunny 3.8 | 20 | 90% |
| kawigi.robot.Girl 1.2 | 19 | 58% |
| cb.nano.Insomnia 1.0 | 12 | 83% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 51 | 48% | 93 |
| cb.nano.Insomnia 1.0 | 18 | 17% | 17 |
| mld.DustBunny 3.8 | 12 | 11% | 35 |
| kawigi.robot.Girl 1.2 | 12 | 11% | 16 |
| kawigi.micro.Shiz 1.1 | 10 | 9% | 35 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 4 |
| divineomega.TrialBot 0.003 | 0 | 0% | 7 |

Posture (Hadur's M records, 201 rounds): 161341 melee ticks, 50596 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52359 sent, 47581 reached their opponent, 7861 virtual hits (16.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538098. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.5 | 132 / 210 | 1.77 | 20.6% | 35891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 132 |
| gh.Griezel 0.5.2 | 2.0 | 16.6% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.3% | 21 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.4% | 3 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.2% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.2% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 24 / 35 | 5963 |
| 2 | 1 | 71.0 | 90.8 | 22 / 35 | 5975 |
| 3 | 1 | 71.6 | 91.7 | 22 / 35 | 6158 |
| 4 | 1 | 71.6 | 94.0 | 23 / 35 | 5789 |
| 5 | 1 | 71.2 | 90.2 | 21 / 35 | 6180 |
| 6 | 1 | 70.4 | 89.5 | 20 / 35 | 5826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 71% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 32 | 97% |
| techdude.forest.FlamingForest 1.1 | 31 | 65% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |

Hadur died in 79 of 210 rounds, at a mean tick of 1220. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 33 | 42% | 102 |
| techdude.forest.FlamingForest 1.1 | 20 | 25% | 39 |
| bvh.fnr.Fenrir 0.36l | 11 | 14% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 10% | 35 |
| stelo.IntrinsicVolatility 1.4 | 4 | 5% | 7 |
| tvv.nano.Polaris 1.2 | 2 | 3% | 4 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 172558 melee ticks, 69489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 55522 sent, 50930 reached their opponent, 8556 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542065. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.4 | 115 / 210 | 2.13 | 19.5% | 34395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.5% | 115 |
| et.Predator 1.8 | 2.3 | 13.6% | 19 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.2% | 30 |
| cx.BlestPain 1.41 | 4.2 | 12.5% | 37 |
| ahf.NanoAndrew .4 | 4.8 | 10.5% | 5 |
| maribo.melee.BMV 0.1 | 6.3 | 8.7% | 1 |
| nic.Nicator 2.4 | 6.7 | 8.8% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 13 / 35 | 5393 |
| 2 | 1 | 70.9 | 90.2 | 21 / 35 | 6143 |
| 3 | 1 | 68.0 | 80.6 | 15 / 35 | 5567 |
| 4 | 1 | 71.8 | 93.0 | 24 / 35 | 6141 |
| 5 | 1 | 70.1 | 87.9 | 23 / 35 | 5612 |
| 6 | 1 | 69.9 | 89.2 | 19 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 55 | 84% |
| oog.melee.Mercutio 1.0 | 49 | 76% |
| cx.BlestPain 1.41 | 28 | 36% |
| ahf.NanoAndrew .4 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| nic.Nicator 2.4 | 5 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 28% | 58 |
| cx.BlestPain 1.41 | 27 | 28% | 49 |
| et.Predator 1.8 | 24 | 25% | 63 |
| ahf.NanoAndrew .4 | 8 | 8% | 19 |
| nic.Nicator 2.4 | 4 | 4% | 8 |
| maribo.melee.BMV 0.1 | 3 | 3% | 7 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 156380 melee ticks, 62483 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 688 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 478 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52142 sent, 47355 reached their opponent, 9872 virtual hits (20.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537373. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 243 over 6 battles (40.5 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.2 | 159 / 210 | 1.62 | 22.5% | 29386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.5% | 159 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.6% | 12 |
| uji.DBH 1.1 | 2.8 | 12.6% | 15 |
| sigterm.Sigterm 1.0 | 4.7 | 10.9% | 13 |
| ratosh.Nobo 0.21 | 5.0 | 10.7% | 2 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.2% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 6.7 | 8.6% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.2 | 6.3% | 0 |
| stelo.WangRobot 1.0 | 8.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.8 | 29 / 35 | 5003 |
| 2 | 1 | 70.4 | 92.9 | 26 / 35 | 4839 |
| 3 | 1 | 68.6 | 87.5 | 20 / 35 | 4904 |
| 4 | 1 | 71.0 | 93.6 | 28 / 35 | 4984 |
| 5 | 1 | 69.9 | 89.6 | 28 / 35 | 4661 |
| 6 | 1 | 70.7 | 92.9 | 28 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 51 | 88% |
| uji.DBH 1.1 | 45 | 82% |
| sigterm.Sigterm 1.0 | 40 | 90% |
| ratosh.Nobo 0.21 | 17 | 94% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 86% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| stelo.WangRobot 1.0 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 16 | 31% | 33 |
| agd.Mooserwirt2 2.7 | 12 | 24% | 65 |
| ratosh.Nobo 0.21 | 6 | 12% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 12% | 18 |
| spinnercat.Robovirus 2.718 | 4 | 8% | 20 |
| sigterm.Sigterm 1.0 | 3 | 6% | 27 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 10 |
| stelo.WangRobot 1.0 | 2 | 4% | 6 |

Posture (Hadur's M records, 199 rounds): 126857 melee ticks, 42259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 58 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39855 sent, 35554 reached their opponent, 7914 virtual hits (22.3% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542962. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 98.7 | 197 / 210 | 1.12 | 22.8% | 38325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.8% | 197 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 8 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 1 |
| erdnis.Rover 0.3 | 4.0 | 11.0% | 1 |
| mld.Infinity 2.2 | 4.2 | 11.4% | 2 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.3% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 8.2 | 6.4% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 98.4 | 32 / 35 | 6332 |
| 2 | 1 | 73.9 | 99.4 | 33 / 35 | 6354 |
| 3 | 1 | 73.3 | 96.8 | 31 / 35 | 6455 |
| 4 | 1 | 74.3 | 100.0 | 35 / 35 | 6337 |
| 5 | 1 | 73.9 | 97.8 | 32 / 35 | 6444 |
| 6 | 1 | 74.1 | 99.7 | 34 / 35 | 6403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 130 | 97% |
| krillr.mini.JointStrike 2.0.0 | 28 | 100% |
| mld.Infinity 2.2 | 23 | 100% |
| erdnis.Rover 0.3 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| pac.ABC 2.1 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 36% | 77 |
| erdnis.Rover 0.3 | 4 | 29% | 26 |
| krillr.mini.JointStrike 2.0.0 | 3 | 21% | 39 |
| patson.PatsonTestBot 1.0 | 2 | 14% | 16 |
| mld.Infinity 2.2 | 0 | 0% | 24 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 127533 melee ticks, 48181 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 31 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42479 sent, 37991 reached their opponent, 9019 virtual hits (23.7% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1566886. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.4 | 148 / 210 | 1.60 | 21.4% | 37401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.4% | 148 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 32 |
| fwb.Nine 1.0.1 | 3.8 | 11.1% | 9 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.7% | 1 |
| catcat20.Rabbit 0.001 | 4.3 | 10.6% | 17 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.6 | 25 / 35 | 5963 |
| 2 | 1 | 72.9 | 95.2 | 27 / 35 | 6585 |
| 3 | 1 | 71.0 | 87.9 | 21 / 35 | 6492 |
| 4 | 1 | 71.2 | 94.0 | 23 / 35 | 5816 |
| 5 | 1 | 71.5 | 91.7 | 24 / 35 | 6198 |
| 6 | 1 | 72.9 | 95.9 | 28 / 35 | 6347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 87 | 78% |
| catcat20.Rabbit 0.001 | 37 | 70% |
| fwb.Nine 1.0.1 | 36 | 97% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |

Hadur died in 63 of 210 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 32 | 51% | 87 |
| catcat20.Rabbit 0.001 | 13 | 21% | 50 |
| fwb.Nine 1.0.1 | 10 | 16% | 24 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 22 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 165011 melee ticks, 59917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 23 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51395 sent, 46713 reached their opponent, 10249 virtual hits (21.9% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1565559. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.9 | 136 / 210 | 1.55 | 20.9% | 35845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.9% | 136 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.2 | 8.2% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.2% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.3 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 18 / 35 | 5675 |
| 2 | 1 | 72.3 | 95.9 | 25 / 35 | 6151 |
| 3 | 1 | 72.1 | 94.0 | 25 / 35 | 6030 |
| 4 | 1 | 73.2 | 96.8 | 25 / 35 | 6747 |
| 5 | 1 | 71.8 | 94.6 | 28 / 35 | 5712 |
| 6 | 1 | 69.4 | 89.2 | 15 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 138 | 67% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 18 | 94% |
| eld.Hmm 1.0 | 4 | 50% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 50 | 68% | 111 |
| dummy.mini.Scimitar 1.01 | 9 | 12% | 51 |
| cf.RiO.RiOx 4.2.1 | 9 | 12% | 28 |
| eld.Hmm 1.0 | 4 | 5% | 11 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 175225 melee ticks, 85042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 87 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50708 sent, 46170 reached their opponent, 7654 virtual hits (16.6% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1530629. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.6 | 106 / 210 | 1.91 | 20.4% | 26829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 20.4% | 106 |
| pe.SandboxDT 2.71m | 1.8 | 17.6% | 61 |
| kvk.HebusLeTroll 0.35 | 3.2 | 15.1% | 17 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.7% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 11.3% | 6 |
| yk.JahRoslav 1.1 | 6.5 | 6.1% | 0 |
| tad.Dalek98 0.98 | 7.0 | 5.8% | 0 |
| gg.Squaraus 0.6 | 8.0 | 5.3% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 21 / 35 | 5107 |
| 2 | 1 | 70.0 | 93.2 | 21 / 35 | 4415 |
| 3 | 1 | 69.3 | 88.6 | 20 / 35 | 4453 |
| 4 | 1 | 69.2 | 89.6 | 17 / 35 | 4493 |
| 5 | 2 | 66.5 | 82.5 | 11 / 35 | 4146 |
| 6 | 1 | 67.4 | 85.4 | 16 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 59 | 42% |
| jlm.javaDisturbance 0.59 | 46 | 80% |
| kvk.HebusLeTroll 0.35 | 38 | 76% |
| bigpete.Stewie 1.0 | 14 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51 | 49% | 80 |
| kvk.HebusLeTroll 0.35 | 25 | 24% | 48 |
| jlm.javaDisturbance 0.59 | 17 | 16% | 49 |
| bigpete.Stewie 1.0 | 7 | 7% | 21 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 156400 melee ticks, 48858 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 27 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45852 sent, 41668 reached their opponent, 5624 virtual hits (13.5% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1532050. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.0 | 186 / 210 | 1.18 | 22.5% | 39197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.5% | 186 |
| pe.SandboxLump 1.52 | 2.0 | 16.0% | 16 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.6% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.6 | 99.7 | 34 / 35 | 6850 |
| 2 | 1 | 73.6 | 98.4 | 31 / 35 | 6410 |
| 3 | 1 | 73.4 | 97.8 | 32 / 35 | 6441 |
| 4 | 1 | 73.0 | 95.6 | 27 / 35 | 6571 |
| 5 | 1 | 73.5 | 99.0 | 32 / 35 | 6166 |
| 6 | 1 | 73.8 | 97.8 | 30 / 35 | 6759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 109 | 88% |
| cre.Karolos 0.32 | 59 | 97% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| stelo.RamTrackSurfer 1.2 | 10 | 90% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 15 | 63% | 95 |
| cre.Karolos 0.32 | 6 | 25% | 53 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 18 |
| stelo.RamTrackSurfer 1.2 | 1 | 4% | 18 |
| sample.Walls 1.0 | 1 | 4% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 122559 melee ticks, 49659 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 64 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38884 sent, 34175 reached their opponent, 10197 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1547993. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.1 | 92 / 210 | 2.43 | 17.2% | 24664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.2% | 92 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.9% | 40 |
| florent.XSeries.X2 0.12 | 3.0 | 13.3% | 31 |
| davidalves.Phoenix 0.54 | 3.7 | 12.8% | 31 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.7% | 12 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.0% | 1 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.8% | 0 |
| evd.X1 0.01 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 18 / 35 | 4086 |
| 2 | 1 | 66.4 | 83.8 | 14 / 35 | 4300 |
| 3 | 1 | 67.0 | 85.7 | 15 / 35 | 4130 |
| 4 | 1 | 65.9 | 82.9 | 14 / 35 | 4141 |
| 5 | 1 | 67.1 | 85.4 | 17 / 35 | 4324 |
| 6 | 1 | 65.7 | 82.2 | 14 / 35 | 3683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 65% |
| davidalves.Phoenix 0.54 | 34 | 59% |
| florent.XSeries.X2 0.12 | 31 | 65% |
| pedersen.Ugluk 1.1.1 | 28 | 71% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| lunchie.Lunchbox 0.93 | 4 | 100% |
| stelo.SoJNanoMelee 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 25% | 59 |
| florent.XSeries.X2 0.12 | 27 | 22% | 52 |
| davidalves.Phoenix 0.54 | 23 | 19% | 41 |
| pedersen.Ugluk 1.1.1 | 18 | 15% | 26 |
| oog.melee.Corsair 1.0 | 9 | 7% | 15 |
| lunchie.Lunchbox 0.93 | 5 | 4% | 11 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 4 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| evd.X1 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 136502 melee ticks, 41325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 48 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45247 sent, 40288 reached their opponent, 7330 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1528927. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 6 battles (22.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.0 | 149 / 210 | 1.88 | 20.8% | 22257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.8% | 149 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.6% | 15 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 14.4% | 15 |
| jdw.Hurricane 1.4 | 3.8 | 13.5% | 18 |
| ds.Oo 2.2 | 5.0 | 10.2% | 10 |
| awesomeness.Elite 1.0 | 6.8 | 7.2% | 3 |
| adt.Ar2 1.1 | 6.8 | 7.4% | 0 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.3% | 0 |
| amk.ChumbaMini 0.2 | 8.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.2 | 26 / 35 | 4054 |
| 2 | 1 | 68.7 | 88.9 | 24 / 35 | 3585 |
| 3 | 1 | 67.7 | 85.7 | 24 / 35 | 3615 |
| 4 | 1 | 68.3 | 86.1 | 25 / 35 | 3768 |
| 5 | 1 | 68.8 | 91.1 | 27 / 35 | 3516 |
| 6 | 1 | 68.6 | 88.9 | 23 / 35 | 3719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 93% |
| voidious.micro.BlitzBat 1.05 | 52 | 90% |
| jdw.Hurricane 1.4 | 38 | 87% |
| ds.Oo 2.2 | 14 | 79% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 16 | 26% | 37 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 20% | 47 |
| voidious.micro.BlitzBat 1.05 | 9 | 15% | 51 |
| ds.Oo 2.2 | 9 | 15% | 35 |
| adt.Ar2 1.1 | 7 | 11% | 13 |
| awesomeness.Elite 1.0 | 4 | 7% | 10 |
| amk.ChumbaMini 0.2 | 3 | 5% | 8 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 6 |

Posture (Hadur's M records, 200 rounds): 121732 melee ticks, 29418 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39089 sent, 34872 reached their opponent, 5685 virtual hits (16.3% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1531224. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.1 | 157 / 210 | 1.53 | 21.7% | 40868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.7% | 157 |
| ak.Fermat 2.0 | 2.2 | 14.3% | 22 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 15 |
| shu.nitro.LENIN .T34 | 3.8 | 12.4% | 12 |
| js.PinBall 1.6 | 4.8 | 11.0% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 8.8% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 6.7% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 96.5 | 27 / 35 | 6781 |
| 2 | 1 | 73.1 | 95.9 | 27 / 35 | 6623 |
| 3 | 1 | 73.6 | 94.6 | 27 / 35 | 7199 |
| 4 | 1 | 71.7 | 90.5 | 23 / 35 | 6435 |
| 5 | 1 | 72.8 | 94.6 | 27 / 35 | 7010 |
| 6 | 1 | 72.6 | 92.7 | 26 / 35 | 6820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 79% |
| shu.nitro.LENIN .T34 | 47 | 91% |
| lrem.Spectre 0.4.4 | 46 | 87% |
| js.PinBall 1.6 | 19 | 95% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 21 | 38% | 65 |
| shu.nitro.LENIN .T34 | 11 | 20% | 57 |
| lrem.Spectre 0.4.4 | 11 | 20% | 43 |
| js.PinBall 1.6 | 7 | 13% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 6 |

Posture (Hadur's M records, 201 rounds): 155927 melee ticks, 50561 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 34 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 50136 sent, 45441 reached their opponent, 10897 virtual hits (24.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1553058. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 95.3 | 172 / 210 | 1.42 | 21.1% | 31518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.1% | 172 |
| mk.Alpha 0.2.1 | 2.0 | 13.9% | 22 |
| EH.Eagle 1.0.6 | 3.0 | 11.2% | 4 |
| wee.Gem 1.8.4 | 4.7 | 9.4% | 5 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.5% | 1 |
| joe.ADinosaur 1.0 | 6.2 | 8.5% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.1% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 7.5 | 8.0% | 4 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 95.6 | 30 / 35 | 5064 |
| 2 | 1 | 70.7 | 94.6 | 28 / 35 | 4922 |
| 3 | 1 | 72.0 | 96.2 | 31 / 35 | 5666 |
| 4 | 1 | 71.1 | 93.7 | 29 / 35 | 5377 |
| 5 | 1 | 71.5 | 97.5 | 29 / 35 | 5240 |
| 6 | 1 | 70.6 | 94.6 | 25 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 118 | 87% |
| EH.Eagle 1.0.6 | 39 | 97% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| wee.Gem 1.8.4 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 50% |

Hadur died in 38 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 15 | 39% | 108 |
| joe.ADinosaur 1.0 | 7 | 18% | 9 |
| EH.Eagle 1.0.6 | 4 | 11% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 11% | 10 |
| caimano.Furia_Ceca 0.22 | 3 | 8% | 10 |
| wee.Gem 1.8.4 | 2 | 5% | 15 |
| throxbot.ThroxBot 0.1 | 2 | 5% | 14 |
| cs.Grudge 1.0 | 1 | 3% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 8 |

Posture (Hadur's M records, 198 rounds): 131030 melee ticks, 44915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42422 sent, 37743 reached their opponent, 8653 virtual hits (22.9% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1529861. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.5 | 144 / 210 | 1.76 | 19.3% | 25720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.3% | 144 |
| kid.test.NightFox .2 | 2.0 | 14.1% | 22 |
| uji.Antique 1.0 | 3.0 | 12.1% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.3% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.3% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.8% | 3 |
| stelo.Lifestealer 1.0 | 8.8 | 6.1% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.0 | 28 / 35 | 4241 |
| 2 | 1 | 67.5 | 88.3 | 19 / 35 | 4248 |
| 3 | 1 | 69.8 | 94.0 | 26 / 35 | 4417 |
| 4 | 1 | 68.5 | 90.8 | 23 / 35 | 4143 |
| 5 | 1 | 68.3 | 88.9 | 21 / 35 | 4433 |
| 6 | 1 | 69.6 | 94.3 | 27 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 72 | 86% |
| uji.Antique 1.0 | 49 | 76% |
| qohnil.blot.BlotBot 3.61 | 12 | 75% |
| amk.ChumbaWumba 0.3 | 11 | 100% |
| ahr.ice.Ice 1.0.2 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| matt.advanced.Katana 1.0 | 5 | 80% |
| stelo.Lifestealer 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 18 | 27% | 62 |
| pfvicm.Sobieski 7.2.3b | 13 | 20% | 21 |
| kid.test.NightFox .2 | 12 | 18% | 43 |
| qohnil.blot.BlotBot 3.61 | 7 | 11% | 28 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 20 |
| stelo.Lifestealer 1.0 | 5 | 8% | 8 |
| matt.advanced.Katana 1.0 | 2 | 3% | 13 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 12 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 127354 melee ticks, 37136 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 29 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 3.

Targeting waves (198 rounds): 43074 sent, 38385 reached their opponent, 5474 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540444. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.0 | 108 / 210 | 2.17 | 19.1% | 29360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.1% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.6% | 49 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 4.9% | 1 |
| ap.Frederick 1.1 | 8.8 | 4.3% | 2 |
| jangs.ns51 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.5 | 20 / 35 | 5025 |
| 2 | 1 | 70.4 | 87.6 | 23 / 35 | 5093 |
| 3 | 1 | 68.2 | 82.2 | 15 / 35 | 4918 |
| 4 | 1 | 69.6 | 89.2 | 13 / 35 | 4904 |
| 5 | 1 | 69.0 | 84.8 | 17 / 35 | 4667 |
| 6 | 1 | 69.8 | 88.9 | 20 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 63% |
| myl.micro.Troodon 1.10 | 18 | 89% |
| jok.PheonixM 0.1.2 | 15 | 80% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 45% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 30 | 29% | 65 |
| myl.micro.Troodon 1.10 | 13 | 13% | 29 |
| jok.PheonixM 0.1.2 | 8 | 8% | 20 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 164502 melee ticks, 52208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 52767 sent, 48157 reached their opponent, 7306 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1543312. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.0 | 72 / 210 | 2.68 | 18.2% | 25718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.2% | 72 |
| darkcanuck.B26354 1.06 | 2.5 | 15.4% | 57 |
| oog.melee.Capulet 1.2 | 3.2 | 14.6% | 36 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.0% | 21 |
| intruder.PrairieWolf 2.61 | 5.5 | 10.1% | 13 |
| tripphippy.Alice 1.1 | 6.0 | 9.1% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.7% | 6 |
| ntc.Opposite 1.5 | 7.5 | 7.7% | 1 |
| GarmBox.Anger 1.0 | 9.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 76.8 | 10 / 35 | 4419 |
| 2 | 1 | 66.8 | 81.8 | 17 / 35 | 4618 |
| 3 | 1 | 62.5 | 71.8 | 5 / 35 | 4031 |
| 4 | 1 | 65.6 | 81.8 | 12 / 35 | 4119 |
| 5 | 1 | 66.7 | 81.1 | 13 / 35 | 4412 |
| 6 | 1 | 65.9 | 81.1 | 15 / 35 | 4119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 44% |
| oog.melee.Capulet 1.2 | 38 | 66% |
| stelo.PastFuture 2.3.2 | 21 | 57% |
| intruder.PrairieWolf 2.61 | 12 | 42% |
| tripphippy.Alice 1.1 | 7 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 47 | 34% | 65 |
| oog.melee.Capulet 1.2 | 30 | 22% | 55 |
| stelo.PastFuture 2.3.2 | 29 | 21% | 43 |
| intruder.PrairieWolf 2.61 | 12 | 9% | 19 |
| tripphippy.Alice 1.1 | 9 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 10 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |

Posture (Hadur's M records, 199 rounds): 155493 melee ticks, 42333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 62 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45581 sent, 41429 reached their opponent, 6968 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540689. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 77.8 | 59 / 210 | 3.00 | 15.6% | 22345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 96 |
| hadur117.Hadur 3.21aa | 2.0 | 15.6% | 59 |
| gh.mini.Griezel 0.2 | 3.3 | 13.0% | 37 |
| d414.nano.Quantum 1.0.0 | 4.2 | 12.0% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.5% | 8 |
| gh.nano.Grofvuil 0.2 | 6.3 | 7.8% | 2 |
| timmit.nano.TimDog 0.33 | 6.7 | 7.3% | 3 |
| fm.mammillarias 1.3 | 8.5 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 8.8 | 5.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 76.8 | 11 / 35 | 3655 |
| 2 | 2 | 64.8 | 79.7 | 10 / 35 | 3868 |
| 3 | 2 | 63.4 | 76.2 | 8 / 35 | 3664 |
| 4 | 2 | 62.4 | 73.3 | 8 / 35 | 3496 |
| 5 | 2 | 64.8 | 81.6 | 7 / 35 | 3806 |
| 6 | 2 | 65.7 | 79.4 | 15 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 44% |
| gh.mini.Griezel 0.2 | 30 | 57% |
| spinnercat.micro.Tyger 0.1 | 11 | 82% |
| d414.nano.Quantum 1.0.0 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 151 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 40% | 86 |
| gh.mini.Griezel 0.2 | 39 | 26% | 57 |
| spinnercat.micro.Tyger 0.1 | 15 | 10% | 22 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 20 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 7 |
| fm.mammillarias 1.3 | 6 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 145770 melee ticks, 30611 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47290 sent, 42542 reached their opponent, 6845 virtual hits (16.1% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1536200. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.8 | 135 / 210 | 1.65 | 19.6% | 29290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.6% | 135 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 50 |
| apc.botM 3.0 | 3.0 | 12.1% | 13 |
| lxx.ConceptA 0.8 | 4.3 | 10.1% | 1 |
| vjik.UnViolation 1.1 | 5.0 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.3 | 8.2% | 3 |
| panzer.Panzer 0.2 | 6.8 | 7.9% | 1 |
| conscience.Electron 1.3g | 8.2 | 6.5% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 96.2 | 26 / 35 | 4922 |
| 2 | 1 | 69.6 | 94.0 | 22 / 35 | 4946 |
| 3 | 1 | 69.0 | 89.8 | 23 / 35 | 5053 |
| 4 | 1 | 68.4 | 91.4 | 19 / 35 | 4577 |
| 5 | 1 | 68.9 | 92.1 | 23 / 35 | 4670 |
| 6 | 1 | 69.9 | 93.0 | 22 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 56% |
| apc.botM 3.0 | 37 | 84% |
| lxx.ConceptA 0.8 | 18 | 100% |
| vjik.UnViolation 1.1 | 16 | 88% |
| yk.JahMicro 1.0 | 9 | 89% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 63% | 95 |
| apc.botM 3.0 | 10 | 13% | 44 |
| lxx.ConceptA 0.8 | 7 | 9% | 22 |
| vjik.UnViolation 1.1 | 6 | 8% | 28 |
| bayen.UbaMicro 1.4 | 2 | 3% | 10 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
| panzer.Panzer 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 123202 melee ticks, 57696 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 41724 sent, 37040 reached their opponent, 6727 virtual hits (18.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1587107. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.3 | 144 / 210 | 1.62 | 22.7% | 30385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.7% | 144 |
| maribo.Quester 0.3 | 2.0 | 17.2% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.0% | 16 |
| labg.Cataclysm 2.05 | 4.2 | 11.6% | 13 |
| baal.nano.N 1.42 | 5.5 | 10.1% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 9.7% | 9 |
| zyx.micro.Ant 1.1 | 7.0 | 6.1% | 0 |
| sanja.First 0.1 | 7.8 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.9 | 28 / 35 | 5284 |
| 2 | 1 | 69.8 | 88.2 | 17 / 35 | 4800 |
| 3 | 1 | 70.5 | 89.6 | 24 / 35 | 4726 |
| 4 | 1 | 71.5 | 91.8 | 24 / 35 | 5179 |
| 5 | 1 | 72.6 | 95.7 | 25 / 35 | 5265 |
| 6 | 1 | 71.8 | 94.3 | 26 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 88 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 82% |
| labg.Cataclysm 2.05 | 24 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 64% |
| baal.nano.N 1.42 | 8 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 21 | 32% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 24% | 58 |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 23% | 21 |
| labg.Cataclysm 2.05 | 11 | 17% | 33 |
| baal.nano.N 1.42 | 1 | 2% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 2% | 3 |
| zyx.micro.Ant 1.1 | 1 | 2% | 1 |
| sanja.First 0.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 159941 melee ticks, 60567 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 72 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46692 sent, 42609 reached their opponent, 6391 virtual hits (15.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538622. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.9 | 98 / 210 | 2.00 | 19.1% | 32804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.1% | 98 |
| stelo.Spread 0.9 | 2.3 | 15.9% | 56 |
| kid.Gladiator .7.2 | 2.7 | 15.6% | 35 |
| jcs.Seth 1.8 | 4.2 | 11.2% | 15 |
| tcf.Reach 3 | 5.0 | 10.5% | 5 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 19 / 35 | 5739 |
| 2 | 1 | 70.4 | 89.8 | 16 / 35 | 5834 |
| 3 | 1 | 69.0 | 85.7 | 16 / 35 | 5164 |
| 4 | 1 | 68.8 | 86.7 | 12 / 35 | 5198 |
| 5 | 1 | 69.9 | 90.5 | 16 / 35 | 5252 |
| 6 | 1 | 70.1 | 88.6 | 19 / 35 | 5617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 79 | 61% |
| kid.Gladiator .7.2 | 58 | 62% |
| jcs.Seth 1.8 | 16 | 44% |
| tcf.Reach 3 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 40 | 36% | 85 |
| kid.Gladiator .7.2 | 40 | 36% | 73 |
| jcs.Seth 1.8 | 20 | 18% | 30 |
| tcf.Reach 3 | 8 | 7% | 13 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| cli.Dancer 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 161173 melee ticks, 66425 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 37 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50174 sent, 45503 reached their opponent, 7793 virtual hits (17.1% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1542835. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.2 | 52 / 210 | 2.42 | 16.6% | 23683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 125 |
| hadur117.Hadur 3.21aa | 2.0 | 16.6% | 52 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.3% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 8 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 1 |
| wit.Chuliath 1.0 | 6.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 87.0 | 10 / 35 | 4050 |
| 2 | 2 | 66.3 | 85.1 | 9 / 35 | 3976 |
| 3 | 2 | 67.4 | 88.3 | 9 / 35 | 4057 |
| 4 | 2 | 65.8 | 81.9 | 10 / 35 | 3971 |
| 5 | 2 | 66.1 | 83.5 | 6 / 35 | 4032 |
| 6 | 2 | 64.3 | 79.4 | 8 / 35 | 3597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 94 | 21% |
| gh.mini.Gruwel 0.9 | 23 | 74% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 69% |
| rz.HawkOnFire 0.1 | 6 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 61% | 115 |
| gh.mini.Gruwel 0.9 | 23 | 15% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 13% | 28 |
| rz.HawkOnFire 0.1 | 12 | 8% | 15 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 148083 melee ticks, 50721 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 58 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 45293 sent, 40527 reached their opponent, 6181 virtual hits (15.3% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537606. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.8 | 159 / 210 | 1.56 | 21.3% | 34417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 159 |
| alpha.RainingFire 1.0 | 2.2 | 13.0% | 22 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 8 |
| mz.Cork 0.1 | 4.3 | 10.7% | 6 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 7 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.4% | 3 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.1 | 29 / 35 | 5998 |
| 2 | 1 | 69.6 | 87.9 | 23 / 35 | 5070 |
| 3 | 1 | 71.6 | 92.1 | 25 / 35 | 6044 |
| 4 | 1 | 72.0 | 95.9 | 28 / 35 | 5583 |
| 5 | 1 | 73.3 | 96.2 | 30 / 35 | 6201 |
| 6 | 1 | 71.1 | 93.7 | 24 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 88% |
| alpha.RainingFire 1.0 | 43 | 74% |
| bvh.micro.Freya 0.3 | 37 | 89% |
| mz.Cork 0.1 | 33 | 88% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 12 | 83% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 37% | 55 |
| bvh.micro.Freya 0.3 | 9 | 18% | 32 |
| bzdp.Pansy 2.1 | 8 | 16% | 41 |
| bvh.mini.Fenrir 0.39 | 6 | 12% | 13 |
| mz.Cork 0.1 | 4 | 8% | 38 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 9 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 140256 melee ticks, 47265 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48033 sent, 43597 reached their opponent, 9089 virtual hits (20.8% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540872. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 250 over 6 battles (41.7 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.3 | 158 / 210 | 2.05 | 19.4% | 34302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.4% | 158 |
| germ.TheMind .2 | 2.8 | 10.2% | 9 |
| EBBU.Sim2 1.02 | 3.8 | 9.7% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.5 | 9.9% | 8 |
| agrach.Dalek 1.0 | 5.0 | 9.3% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 7.0 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.5% | 5 |
| mb.Beast 0.1 | 7.3 | 8.4% | 6 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 6 |
| skm.Ryubot 1.0 | 9.0 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.3 | 27 / 35 | 6071 |
| 2 | 1 | 71.2 | 96.5 | 30 / 35 | 6419 |
| 3 | 1 | 68.7 | 86.0 | 28 / 35 | 5854 |
| 4 | 1 | 66.8 | 85.4 | 22 / 35 | 5263 |
| 5 | 1 | 68.2 | 87.0 | 27 / 35 | 5573 |
| 6 | 1 | 65.9 | 80.6 | 24 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 31 | 97% |
| germ.TheMind .2 | 26 | 92% |
| stelo.UntouchableNano 1.3 | 25 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 91% |
| EBBU.Sim2 1.02 | 18 | 89% |
| lmk.ACPFinal 0.1 | 15 | 80% |
| mb.Beast 0.1 | 15 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 25% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 19% | 35 |
| germ.TheMind .2 | 6 | 12% | 23 |
| EBBU.Sim2 1.02 | 6 | 12% | 19 |
| lmk.ACPFinal 0.1 | 5 | 10% | 21 |
| agrach.Dalek 1.0 | 4 | 8% | 46 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 25 |
| mb.Beast 0.1 | 4 | 8% | 18 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 95426 melee ticks, 22763 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 59 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 32142 sent, 27778 reached their opponent, 8205 virtual hits (29.5% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538658. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.2 | 126 / 210 | 1.97 | 19.2% | 29860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.2% | 126 |
| justin.Mallais 14.0 | 2.0 | 16.1% | 51 |
| bvh.mini.Freya 0.55 | 3.2 | 12.0% | 10 |
| cs.Wren 1.0 | 4.0 | 10.9% | 4 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.4% | 13 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.4% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.2% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.8% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 16 / 35 | 4980 |
| 2 | 1 | 70.2 | 91.7 | 21 / 35 | 5181 |
| 3 | 1 | 70.5 | 92.1 | 25 / 35 | 5301 |
| 4 | 1 | 71.2 | 95.9 | 28 / 35 | 5124 |
| 5 | 1 | 66.0 | 80.6 | 14 / 35 | 4191 |
| 6 | 1 | 69.6 | 88.6 | 22 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 79 | 73% |
| bvh.mini.Freya 0.55 | 23 | 83% |
| bts.mega.Gnarly 1.4 | 19 | 89% |
| cs.Wren 1.0 | 17 | 100% |
| kdf.KoulDestroyer 1.0 | 11 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 45% | 89 |
| bvh.mini.Freya 0.55 | 14 | 17% | 29 |
| bts.mega.Gnarly 1.4 | 11 | 13% | 33 |
| cs.Wren 1.0 | 9 | 11% | 24 |
| kdf.KoulDestroyer 1.0 | 9 | 11% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 135417 melee ticks, 45606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 30 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45118 sent, 40122 reached their opponent, 8541 virtual hits (21.3% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1538486. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.5 | 136 / 210 | 1.60 | 22.6% | 34772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.6% | 136 |
| bvh.fry.Freya 0.82 | 2.2 | 16.0% | 12 |
| az.Ololobot 0.2.4 | 2.8 | 14.9% | 58 |
| gimp.GimpBot 0.1 | 5.0 | 9.3% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 3 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 7.9% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.9 | 21 / 35 | 5546 |
| 2 | 1 | 70.1 | 91.4 | 20 / 35 | 5393 |
| 3 | 1 | 71.6 | 92.9 | 27 / 35 | 5946 |
| 4 | 1 | 70.0 | 88.6 | 21 / 35 | 5785 |
| 5 | 1 | 73.1 | 97.1 | 28 / 35 | 6492 |
| 6 | 1 | 69.8 | 91.1 | 19 / 35 | 5610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 83 | 55% |
| bvh.fry.Freya 0.82 | 76 | 89% |
| winamp32.micro.MicroMacro 1.0 | 12 | 83% |
| gimp.GimpBot 0.1 | 5 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1230. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 46 | 61% | 99 |
| bvh.fry.Freya 0.82 | 22 | 29% | 73 |
| gimp.GimpBot 0.1 | 5 | 7% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 2 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 157581 melee ticks, 66777 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46228 sent, 42078 reached their opponent, 8131 virtual hits (19.3% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1565712. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.0 | 140 / 210 | 1.81 | 20.4% | 32407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.4% | 140 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.5% | 12 |
| mz.AntiGrav 1.0 | 4.0 | 11.2% | 7 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.3% | 9 |
| stelo.Randomness 1.0 | 6.0 | 9.3% | 9 |
| alpha.BlackIce 1.0 | 6.7 | 8.8% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.8% | 0 |
| sample.Corners 1.0 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 24 / 35 | 5047 |
| 2 | 1 | 71.3 | 91.1 | 25 / 35 | 5594 |
| 3 | 1 | 70.7 | 90.8 | 20 / 35 | 5301 |
| 4 | 1 | 69.9 | 87.9 | 22 / 35 | 5339 |
| 5 | 1 | 71.4 | 90.8 | 24 / 35 | 5719 |
| 6 | 1 | 71.5 | 94.3 | 25 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 84% |
| kano.gamma.KanoGamma 1.8 | 38 | 87% |
| Polkwane.SmashMelee 1.0 | 20 | 95% |
| mz.AntiGrav 1.0 | 18 | 83% |
| stelo.Randomness 1.0 | 14 | 79% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 0% |

Hadur died in 71 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 27 | 38% | 69 |
| kano.gamma.KanoGamma 1.8 | 15 | 21% | 56 |
| Polkwane.SmashMelee 1.0 | 10 | 14% | 24 |
| mz.AntiGrav 1.0 | 8 | 11% | 26 |
| stelo.Randomness 1.0 | 8 | 11% | 20 |
| alpha.BlackIce 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 150646 melee ticks, 42043 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 148 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 148 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48943 sent, 44208 reached their opponent, 9002 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1529596. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 98 / 210 | 2.19 | 18.1% | 26535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.1% | 98 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 68 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.8% | 20 |
| ary.Swarm 1.1 | 3.7 | 12.9% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 10 |
| shrub.Silver v048 | 5.8 | 9.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.2% | 2 |
| stelo.Mirror 1.1 | 8.5 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 14 / 35 | 4233 |
| 2 | 1 | 68.5 | 86.7 | 17 / 35 | 4518 |
| 3 | 1 | 67.9 | 85.4 | 16 / 35 | 4444 |
| 4 | 1 | 68.5 | 88.3 | 17 / 35 | 4357 |
| 5 | 1 | 69.0 | 88.3 | 16 / 35 | 4603 |
| 6 | 1 | 68.6 | 88.6 | 18 / 35 | 4380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 79 | 47% |
| lessonz.robocode.Oz 0.5.0 | 33 | 73% |
| ary.Swarm 1.1 | 23 | 74% |
| simonton.nano.MeleeSeed 1.8 | 17 | 82% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 59 | 53% | 94 |
| lessonz.robocode.Oz 0.5.0 | 18 | 16% | 42 |
| ary.Swarm 1.1 | 16 | 14% | 31 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 24 |
| shrub.Silver v048 | 3 | 3% | 9 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 150263 melee ticks, 51430 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 62 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49414 sent, 44607 reached their opponent, 6966 virtual hits (15.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1561285. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.7 | 151 / 210 | 1.66 | 20.8% | 35922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.8% | 151 |
| wompi.Wallaby 5.1 | 2.5 | 15.0% | 26 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.9% | 11 |
| ara.Shera 0.88 | 3.5 | 13.0% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.7% | 1 |
| stelo.MirrorMicro 1.0 | 7.2 | 6.1% | 0 |
| maribo.IotaCT 1.1 | 7.5 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.3 | 26 / 35 | 5992 |
| 2 | 1 | 72.3 | 94.9 | 26 / 35 | 6190 |
| 3 | 1 | 71.9 | 94.0 | 28 / 35 | 6267 |
| 4 | 1 | 71.3 | 90.5 | 25 / 35 | 6080 |
| 5 | 1 | 71.5 | 94.6 | 26 / 35 | 5859 |
| 6 | 1 | 69.8 | 88.9 | 20 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 87% |
| maribo.mini.MiniQuester 0.1 | 54 | 96% |
| ara.Shera 0.88 | 27 | 70% |
| dsw.StaticD 1.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 25 | 41% | 42 |
| wompi.Wallaby 5.1 | 19 | 31% | 91 |
| maribo.mini.MiniQuester 0.1 | 8 | 13% | 55 |
| amz.NanoClone 1.41 | 4 | 7% | 5 |
| maribo.IotaCT 1.1 | 2 | 3% | 2 |
| dsw.StaticD 1.0 | 1 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 159723 melee ticks, 52887 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50222 sent, 45599 reached their opponent, 8996 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537852. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.0 | 45 / 210 | 2.62 | 16.5% | 26003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 140 |
| hadur117.Hadur 3.21aa | 2.0 | 16.5% | 45 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 16 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.2% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 2 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 81.3 | 6 / 35 | 4118 |
| 2 | 2 | 68.7 | 85.1 | 11 / 35 | 4847 |
| 3 | 2 | 66.5 | 80.6 | 9 / 35 | 4165 |
| 4 | 2 | 68.4 | 85.7 | 11 / 35 | 4517 |
| 5 | 2 | 66.8 | 81.9 | 7 / 35 | 4200 |
| 6 | 2 | 65.0 | 77.5 | 1 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 27% |
| brainfade.melee.Dusk 0.44 | 17 | 59% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |

Hadur died in 166 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 106 | 64% | 133 |
| brainfade.melee.Dusk 0.44 | 21 | 13% | 31 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 7% | 17 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 153789 melee ticks, 54173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47996 sent, 43274 reached their opponent, 7144 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1540749. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.4 | 131 / 210 | 1.68 | 20.7% | 35448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.7% | 131 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 57 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 17 |
| jwirde.Gort 2.0 | 4.5 | 9.2% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.2% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 0 |
| wompi.Quokka 1.6 | 7.0 | 7.4% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.2 | 24 / 35 | 6010 |
| 2 | 1 | 71.2 | 91.4 | 23 / 35 | 5915 |
| 3 | 1 | 70.2 | 91.1 | 18 / 35 | 5627 |
| 4 | 1 | 71.3 | 90.8 | 22 / 35 | 5918 |
| 5 | 1 | 71.0 | 92.7 | 20 / 35 | 5946 |
| 6 | 1 | 71.7 | 93.3 | 24 / 35 | 6032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 56% |
| tzu.TheArtOfWar 1.2 | 72 | 83% |
| jwirde.Gort 2.0 | 13 | 77% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 56% | 94 |
| tzu.TheArtOfWar 1.2 | 21 | 27% | 73 |
| jwirde.Gort 2.0 | 5 | 6% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 9 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| wompi.Quokka 1.6 | 1 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 151379 melee ticks, 52134 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50976 sent, 46370 reached their opponent, 9668 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1537801. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.4 | 112 / 210 | 1.87 | 20.2% | 33601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.2% | 112 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 16 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 11.1% | 60 |
| myl.nano.Graviton 1.10 | 3.5 | 11.0% | 5 |
| sul.Lunar 1.1 | 4.8 | 10.3% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 5.8 | 9.2% | 3 |
| hvilela.HVilela 0.9 | 7.3 | 8.2% | 0 |
| fm.claire 1.7 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.8% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.7 | 20 / 35 | 5890 |
| 2 | 1 | 68.7 | 87.6 | 15 / 35 | 5211 |
| 3 | 1 | 71.1 | 93.0 | 21 / 35 | 5860 |
| 4 | 1 | 70.1 | 90.8 | 19 / 35 | 5462 |
| 5 | 1 | 69.3 | 85.7 | 19 / 35 | 5536 |
| 6 | 1 | 70.2 | 91.4 | 18 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 42% |
| jje.BagPuss 1.2 | 32 | 66% |
| sul.Lunar 1.1 | 29 | 86% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 43 | 44% | 0 |
| jje.BagPuss 1.2 | 19 | 19% | 62 |
| sul.Lunar 1.1 | 11 | 11% | 43 |
| myl.nano.Graviton 1.10 | 9 | 9% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 29 |
| hvilela.HVilela 0.9 | 4 | 4% | 14 |
| wit.Deep7 2.0 | 3 | 3% | 12 |
| fm.claire 1.7 | 3 | 3% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 191450 melee ticks, 89417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 73 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 58844 sent, 54229 reached their opponent, 8039 virtual hits (14.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1545308. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.3 | 130 / 210 | 1.70 | 21.5% | 29772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 130 |
| kc.mini.Mirage 0.2 | 2.0 | 19.4% | 66 |
| mz.MicroSheep 1.0 | 3.5 | 12.1% | 4 |
| cx.Princess 1.0 | 4.2 | 11.5% | 9 |
| sadoner.killer 0.2 | 4.3 | 10.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 6.5 | 7.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 0 |
| kurios.DOSexe .9a | 8.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 95.7 | 23 / 35 | 5222 |
| 2 | 1 | 69.0 | 90.0 | 16 / 35 | 4746 |
| 3 | 1 | 68.7 | 87.1 | 20 / 35 | 4667 |
| 4 | 1 | 71.1 | 93.2 | 25 / 35 | 5260 |
| 5 | 1 | 70.1 | 91.1 | 22 / 35 | 5244 |
| 6 | 1 | 69.7 | 90.4 | 24 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 137 | 67% |
| cx.Princess 1.0 | 18 | 78% |
| mz.MicroSheep 1.0 | 16 | 100% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| sadoner.killer 0.2 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 56 | 69% | 148 |
| cx.Princess 1.0 | 8 | 10% | 16 |
| sadoner.killer 0.2 | 5 | 6% | 7 |
| mz.MicroSheep 1.0 | 4 | 5% | 21 |
| jeremyreeder.collective.Prophet 5 | 4 | 5% | 5 |
| kurios.DOSexe .9a | 3 | 4% | 5 |
| arthord.NanoSatanMelee Beta | 1 | 1% | 6 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 138982 melee ticks, 56550 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38538 sent, 34427 reached their opponent, 5671 virtual hits (16.5% of those reached).

