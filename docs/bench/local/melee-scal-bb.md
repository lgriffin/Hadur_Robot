# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 100 over 6 battles (16.7 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.7 | 47 / 210 | 2.38 | 17.0% | 30424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 141 |
| hadur117.Hadur 3.20bb | 2.0 | 17.0% | 47 |
| sgp.JollyNinja 3.53 | 3.5 | 11.2% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.3% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 0 |
| mz.MicroGodMelee 1 | 5.5 | 10.0% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.1% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 84.1 | 9 / 35 | 4749 |
| 2 | 2 | 68.8 | 90.2 | 8 / 35 | 5540 |
| 3 | 2 | 67.6 | 87.3 | 8 / 35 | 5333 |
| 4 | 2 | 66.1 | 80.6 | 7 / 35 | 5345 |
| 5 | 2 | 66.5 | 83.8 | 5 / 35 | 5087 |
| 6 | 2 | 65.4 | 82.2 | 10 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 11% |
| sgp.JollyNinja 3.53 | 21 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 80% |
| mz.MicroGodMelee 1 | 5 | 80% |
| lorneswork.Predator 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1149. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 68% | 130 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 11% | 25 |
| sgp.JollyNinja 3.53 | 15 | 9% | 25 |
| mz.MicroGodMelee 1 | 5 | 3% | 10 |
| lorneswork.Predator 1.0 | 5 | 3% | 8 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 4 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 134842 melee ticks, 89915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 65 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44165 sent, 39286 reached their opponent, 7800 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.6 | 101 / 210 | 2.11 | 18.8% | 29897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.8% | 101 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 41 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.4% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.4% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.3% | 2 |
| sch.Simone 0.3d | 7.0 | 7.9% | 12 |
| Noran.BitchingElk 0.054 | 7.2 | 7.9% | 12 |
| stelo.PatternRobot 1.0 | 9.2 | 5.1% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 15 / 35 | 4880 |
| 2 | 1 | 69.1 | 88.3 | 16 / 35 | 5306 |
| 3 | 1 | 68.4 | 88.3 | 14 / 35 | 5011 |
| 4 | 1 | 68.3 | 86.7 | 19 / 35 | 4910 |
| 5 | 1 | 68.3 | 87.0 | 19 / 35 | 4796 |
| 6 | 1 | 68.7 | 87.6 | 18 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 73% |
| sch.Simone 0.3d | 20 | 70% |
| Noran.BitchingElk 0.054 | 13 | 23% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 75% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 109 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 33% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 23% | 58 |
| Noran.BitchingElk 0.054 | 11 | 10% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 9% | 30 |
| sch.Simone 0.3d | 10 | 9% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 14 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 5 |
| stelo.PatternRobot 1.0 | 4 | 4% | 4 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 169013 melee ticks, 50001 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 111 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 58897 sent, 54101 reached their opponent, 9052 virtual hits (16.7% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.7 | 169 / 210 | 1.57 | 20.8% | 37907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.8% | 169 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 15 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.6% | 7 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 3 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 24 / 35 | 6079 |
| 2 | 1 | 71.3 | 94.9 | 28 / 35 | 6421 |
| 3 | 1 | 72.3 | 97.1 | 30 / 35 | 6340 |
| 4 | 1 | 70.5 | 91.1 | 28 / 35 | 6045 |
| 5 | 1 | 71.9 | 97.5 | 30 / 35 | 6403 |
| 6 | 1 | 71.6 | 93.3 | 29 / 35 | 6619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 80 | 89% |
| radnor.DoctorBob 1.42 | 59 | 98% |
| kawigi.nano.Lib 1.0 | 36 | 92% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 50% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 11 | 27% | 72 |
| radnor.DoctorBob 1.42 | 11 | 27% | 65 |
| kawigi.nano.Lib 1.0 | 6 | 15% | 40 |
| urdos.URDOS 1.3 | 6 | 15% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 5% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 126777 melee ticks, 42996 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38814 sent, 34182 reached their opponent, 8944 virtual hits (26.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 499 over 6 battles (83.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.5 | 37 / 210 | 2.22 | 17.8% | 33631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.9% | 152 |
| hadur117.Hadur 3.20bb | 2.0 | 17.8% | 37 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 8 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 10 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.2 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 88.9 | 8 / 35 | 6092 |
| 2 | 2 | 66.6 | 82.5 | 3 / 35 | 5096 |
| 3 | 2 | 67.8 | 85.4 | 5 / 35 | 5467 |
| 4 | 2 | 69.2 | 88.3 | 9 / 35 | 5538 |
| 5 | 2 | 69.7 | 89.5 | 8 / 35 | 5832 |
| 6 | 2 | 67.6 | 84.1 | 4 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 120 | 13% |
| apc.LeeroyJenkins2 1.0 | 17 | 71% |
| TNT.TNT 0.99.1 | 14 | 43% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1332. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 122 | 69% | 141 |
| apc.LeeroyJenkins2 1.0 | 26 | 15% | 36 |
| TNT.TNT 0.99.1 | 17 | 10% | 23 |
| josago.Jorgito 0.16 | 4 | 2% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 201094 melee ticks, 74050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 59 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 60715 sent, 55804 reached their opponent, 8245 virtual hits (14.8% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 311 over 6 battles (51.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.4 | 43 / 210 | 2.86 | 15.5% | 23503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.4% | 96 |
| justin.DemonicRage 3.4 | 1.7 | 17.1% | 54 |
| hadur117.Hadur 3.20bb | 2.8 | 15.5% | 43 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 10 |
| ms.Ares 0.19 | 5.3 | 9.7% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 76.8 | 4 / 35 | 3725 |
| 2 | 3 | 64.9 | 81.0 | 8 / 35 | 3996 |
| 3 | 2 | 66.9 | 85.1 | 11 / 35 | 4178 |
| 4 | 3 | 63.3 | 75.6 | 5 / 35 | 3725 |
| 5 | 3 | 64.3 | 79.4 | 8 / 35 | 3660 |
| 6 | 3 | 65.1 | 78.4 | 7 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 44 | 52% |
| cb.fire.Firestarter 2.0f | 39 | 8% |
| wompi.Numbat 2.1 | 17 | 82% |
| ms.Ares 0.19 | 2 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 65 | 38% | 70 |
| justin.DemonicRage 3.4 | 54 | 32% | 74 |
| wompi.Numbat 2.1 | 23 | 14% | 34 |
| axeBots.HataMoto 3.09 | 16 | 9% | 19 |
| ms.Ares 0.19 | 7 | 4% | 11 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155201 melee ticks, 39622 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47963 sent, 42999 reached their opponent, 7050 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.9 | 141 / 210 | 1.73 | 20.3% | 33512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.3% | 141 |
| jekl.StoneGhost 0.7 | 2.3 | 14.6% | 17 |
| origin.SleepSiphon 1.7b | 2.7 | 13.5% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.0% | 6 |
| mld.Wisdom 1.0 | 4.8 | 10.2% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.7% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.3 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 21 / 35 | 5633 |
| 2 | 1 | 70.5 | 91.7 | 23 / 35 | 5574 |
| 3 | 1 | 70.8 | 90.8 | 25 / 35 | 5495 |
| 4 | 1 | 70.6 | 90.2 | 24 / 35 | 5566 |
| 5 | 1 | 72.5 | 95.9 | 29 / 35 | 6062 |
| 6 | 1 | 69.7 | 90.2 | 19 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 89% |
| origin.SleepSiphon 1.7b | 48 | 77% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 92% |
| gg.Wolverine 2.0 | 14 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| mld.Wisdom 1.0 | 6 | 67% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 42% | 72 |
| jekl.StoneGhost 0.7 | 18 | 26% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 12% | 38 |
| mld.Wisdom 1.0 | 6 | 9% | 16 |
| gg.Wolverine 2.0 | 4 | 6% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 203 rounds): 148892 melee ticks, 41681 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45993 sent, 41139 reached their opponent, 9024 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 486 over 6 battles (81.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.9 | 121 / 210 | 1.55 | 20.8% | 38003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.8% | 121 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.7% | 44 |
| rtk.Tachikoma 1.0 | 2.7 | 16.1% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.4% | 11 |
| franzor.Lizt 1.3.1 | 5.0 | 10.8% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.7 | 20 / 35 | 6717 |
| 2 | 1 | 72.3 | 93.7 | 18 / 35 | 6289 |
| 3 | 1 | 73.7 | 96.5 | 26 / 35 | 6737 |
| 4 | 1 | 70.7 | 90.8 | 17 / 35 | 5530 |
| 5 | 1 | 71.9 | 93.7 | 19 / 35 | 5991 |
| 6 | 1 | 73.2 | 94.9 | 21 / 35 | 6739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 69% |
| rsalesc.melee.Monk 0.3.6c | 57 | 33% |
| oog.melee.CapuletDroid 1.1 | 30 | 80% |
| franzor.Lizt 1.3.1 | 27 | 81% |

Hadur died in 94 of 210 rounds, at a mean tick of 1437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 41 | 44% | 70 |
| rtk.Tachikoma 1.0 | 34 | 36% | 92 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 39 |
| franzor.Lizt 1.3.1 | 5 | 5% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 190017 melee ticks, 90626 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 57845 sent, 52956 reached their opponent, 10452 virtual hits (19.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 802 over 6 battles (133.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.0 | 132 / 210 | 1.72 | 19.7% | 29856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.7% | 132 |
| tm.Yuugao 1.0 | 2.0 | 13.5% | 35 |
| shrub.Vapour v159 | 3.2 | 11.7% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.1% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.3% | 3 |
| m3thos.Eva00 1.1 | 6.3 | 8.4% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.7% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 23 / 35 | 5152 |
| 2 | 1 | 69.5 | 91.7 | 22 / 35 | 5026 |
| 3 | 1 | 68.8 | 91.7 | 21 / 35 | 4643 |
| 4 | 1 | 68.9 | 91.4 | 20 / 35 | 4890 |
| 5 | 1 | 70.3 | 94.0 | 24 / 35 | 5078 |
| 6 | 1 | 69.7 | 92.4 | 22 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 57 | 63% |
| shrub.Vapour v159 | 34 | 65% |
| Krabb.sliNk.Garm 0.9u | 33 | 85% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 85% |
| m3thos.Eva00 1.1 | 14 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 33% | 67 |
| shrub.Vapour v159 | 19 | 22% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 17% | 28 |
| Krabb.sliNk.Garm 0.9u | 10 | 11% | 37 |
| m3thos.Eva00 1.1 | 3 | 3% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 2% | 11 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 151987 melee ticks, 48023 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 49235 sent, 44354 reached their opponent, 8165 virtual hits (18.4% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 524 over 6 battles (87.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 77.2 | 56 / 210 | 3.05 | 15.6% | 22628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 17.0% | 92 |
| hadur117.Hadur 3.20bb | 2.0 | 15.6% | 56 |
| kc.micro.Figment 1.0 | 2.5 | 14.0% | 27 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.4% | 16 |
| yagami.Tidus 0.11 | 4.7 | 10.2% | 3 |
| mc2.enemy.Original 0.9 | 6.0 | 9.3% | 12 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 1 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 76.5 | 11 / 35 | 4161 |
| 2 | 2 | 63.4 | 77.1 | 7 / 35 | 3553 |
| 3 | 1 | 67.3 | 87.0 | 12 / 35 | 4374 |
| 4 | 3 | 61.1 | 70.2 | 7 / 35 | 3330 |
| 5 | 2 | 64.1 | 79.0 | 9 / 35 | 3563 |
| 6 | 2 | 62.8 | 73.7 | 10 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 26% |
| kc.micro.Figment 1.0 | 33 | 70% |
| mc2.enemy.Original 0.9 | 12 | 33% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| dft.Calliope 5.6 | 7 | 100% |
| yagami.Tidus 0.11 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 40% | 77 |
| kc.micro.Figment 1.0 | 30 | 19% | 55 |
| yagami.Tidus 0.11 | 21 | 13% | 24 |
| mc2.enemy.Original 0.9 | 15 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 14 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 9 |
| dft.Calliope 5.6 | 2 | 1% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149670 melee ticks, 39274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 43 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49278 sent, 44586 reached their opponent, 6426 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 237 over 6 battles (39.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 97.6 | 184 / 210 | 1.22 | 21.5% | 35180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.5% | 184 |
| ne.Chimera 1.2 | 2.3 | 13.3% | 5 |
| DTF.Kludgy 1.2b | 2.8 | 13.4% | 12 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 0 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.5% | 1 |
| kurios.DOSexe .9b | 7.7 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 97.8 | 30 / 35 | 5756 |
| 2 | 1 | 72.2 | 98.1 | 31 / 35 | 5855 |
| 3 | 1 | 72.7 | 99.4 | 34 / 35 | 6037 |
| 4 | 1 | 72.7 | 98.1 | 32 / 35 | 6122 |
| 5 | 1 | 71.3 | 96.2 | 28 / 35 | 5576 |
| 6 | 1 | 71.6 | 95.9 | 29 / 35 | 5834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 86% |
| ne.Chimera 1.2 | 48 | 94% |
| ejb.Polaris 1.0.1 | 42 | 95% |
| vStar.RAFzilla 2.15 | 24 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 10 | 100% |
| donjezza.Muncho 1.0 | 3 | 67% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 56% | 60 |
| ne.Chimera 1.2 | 4 | 15% | 38 |
| ejb.Polaris 1.0.1 | 3 | 11% | 55 |
| tvv.micro.Antares 1.1.1 | 2 | 7% | 15 |
| kurios.DOSexe .9b | 1 | 4% | 14 |
| donjezza.Muncho 1.0 | 1 | 4% | 2 |
| vStar.RAFzilla 2.15 | 0 | 0% | 22 |
| sam.Samspin 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 143212 melee ticks, 58115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 82 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47225 sent, 42447 reached their opponent, 8169 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 6 battles (53.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.1 | 66 / 210 | 2.88 | 15.8% | 22565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.3% | 70 |
| hadur117.Hadur 3.20bb | 1.7 | 15.8% | 66 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.4% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 15 |
| rdt199.Warlord 0.73 | 5.5 | 9.5% | 22 |
| br2.MobyDickBot 1.6 | 5.7 | 9.2% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 1 |
| stelo.MirrorNano 1.3 | 9.3 | 4.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.9 | 10 / 35 | 3678 |
| 2 | 1 | 64.5 | 79.7 | 13 / 35 | 3798 |
| 3 | 2 | 65.4 | 82.5 | 15 / 35 | 3831 |
| 4 | 2 | 63.5 | 77.8 | 9 / 35 | 3741 |
| 5 | 2 | 61.6 | 70.8 | 9 / 35 | 3618 |
| 6 | 1 | 64.7 | 81.9 | 10 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 39 | 41% |
| djc.DynaBot 0.1.1 | 24 | 75% |
| rdt199.Warlord 0.73 | 20 | 45% |
| br2.MobyDickBot 1.6 | 13 | 62% |
| cx.mini.Nimrod 0.55 | 12 | 58% |
| uji.YellohFellah 1.0 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 48 | 32% | 69 |
| cx.mini.Nimrod 0.55 | 29 | 20% | 37 |
| rdt199.Warlord 0.73 | 24 | 16% | 32 |
| djc.DynaBot 0.1.1 | 17 | 11% | 30 |
| KiraNL.Chupacabra 0.4 | 9 | 6% | 10 |
| br2.MobyDickBot 1.6 | 8 | 5% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 5 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154113 melee ticks, 32136 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50465 sent, 45497 reached their opponent, 6174 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.3 | 123 / 210 | 2.23 | 18.0% | 23327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.0% | 123 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 29 |
| nat.PallasHawk 1.0 | 3.2 | 13.0% | 30 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 14 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.6% | 12 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.2% | 1 |
| stuff.Vlad 0.1 | 8.5 | 5.9% | 0 |
| jp.Perpy 16.0 | 8.8 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.3 | 20 / 35 | 3945 |
| 2 | 1 | 66.6 | 83.5 | 19 / 35 | 3716 |
| 3 | 1 | 67.7 | 86.0 | 20 / 35 | 4234 |
| 4 | 1 | 66.5 | 83.5 | 18 / 35 | 3840 |
| 5 | 1 | 67.1 | 87.3 | 21 / 35 | 3614 |
| 6 | 1 | 68.8 | 90.2 | 25 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 83% |
| nat.PallasHawk 1.0 | 43 | 70% |
| darkcanuck.Leon 1.01 | 41 | 98% |
| brainfade.melee.Genghis 0.36 | 11 | 73% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 27 | 31% | 52 |
| nat.PallasHawk 1.0 | 20 | 23% | 46 |
| brainfade.melee.Genghis 0.36 | 12 | 14% | 17 |
| darkcanuck.Leon 1.01 | 11 | 13% | 65 |
| jrm.Test0 1.0 | 9 | 10% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 13 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| jp.Perpy 16.0 | 1 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 126785 melee ticks, 37362 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 73 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 44021 sent, 39094 reached their opponent, 6492 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.9 | 61 / 210 | 2.72 | 15.7% | 24553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.8% | 49 |
| mn.Combat 3.25.0 | 2.0 | 15.6% | 72 |
| hadur117.Hadur 3.20bb | 2.3 | 15.7% | 61 |
| shinh.Entangled 0.3 | 4.5 | 12.0% | 18 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.1% | 11 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 85.7 | 13 / 35 | 4049 |
| 2 | 2 | 65.2 | 82.9 | 8 / 35 | 4225 |
| 3 | 3 | 64.5 | 79.7 | 10 / 35 | 3992 |
| 4 | 1 | 66.0 | 82.5 | 14 / 35 | 4487 |
| 5 | 3 | 63.3 | 76.8 | 9 / 35 | 3920 |
| 6 | 3 | 63.4 | 77.8 | 7 / 35 | 3880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 55 | 56% |
| mn.Combat 3.25.0 | 30 | 30% |
| shinh.Entangled 0.3 | 15 | 73% |
| gh.micro.Gruweltje 0.7 | 15 | 60% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 65 | 43% | 95 |
| mn.Combat 3.25.0 | 37 | 24% | 48 |
| shinh.Entangled 0.3 | 20 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 18 | 12% | 27 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 147837 melee ticks, 35640 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 43125 sent, 37952 reached their opponent, 6200 virtual hits (16.3% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.2 | 164 / 210 | 1.43 | 21.1% | 34831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.1% | 164 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 9 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.7% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 6 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.8 | 29 / 35 | 5559 |
| 2 | 1 | 72.4 | 97.5 | 28 / 35 | 6034 |
| 3 | 1 | 71.9 | 95.2 | 28 / 35 | 5869 |
| 4 | 1 | 71.8 | 96.5 | 29 / 35 | 5917 |
| 5 | 1 | 71.2 | 93.3 | 26 / 35 | 5861 |
| 6 | 1 | 70.4 | 92.1 | 24 / 35 | 5591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 96% |
| catcat20.shape.Theta 0.018 | 54 | 63% |
| sanyi.mikrobi.Roberto 1.0 | 32 | 97% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| pa.Improved 1.0 | 6 | 83% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 54% | 54 |
| simonton.micro.Sprout 1.1.3 | 8 | 17% | 83 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 9% | 34 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 9% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 6 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 142810 melee ticks, 53253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 4.

Targeting waves (198 rounds): 44736 sent, 40185 reached their opponent, 9853 virtual hits (24.5% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 238 over 6 battles (39.7 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.1 | 118 / 210 | 2.16 | 19.1% | 31472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.1% | 118 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 18 |
| emp.Yngwie 1.11 | 3.0 | 13.2% | 45 |
| mld.DustBunny 3.8 | 3.3 | 13.1% | 10 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.6% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.4% | 9 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.2% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 21 / 35 | 5651 |
| 2 | 1 | 68.7 | 86.3 | 18 / 35 | 5194 |
| 3 | 1 | 70.3 | 90.2 | 23 / 35 | 5431 |
| 4 | 1 | 67.3 | 81.9 | 17 / 35 | 4722 |
| 5 | 1 | 69.4 | 86.7 | 22 / 35 | 5562 |
| 6 | 1 | 68.1 | 85.1 | 17 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 60 | 68% |
| kawigi.micro.Shiz 1.1 | 34 | 88% |
| mld.DustBunny 3.8 | 26 | 96% |
| kawigi.robot.Girl 1.2 | 17 | 71% |
| cb.nano.Insomnia 1.0 | 8 | 75% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 26 | 28% | 76 |
| mld.DustBunny 3.8 | 19 | 20% | 41 |
| cb.nano.Insomnia 1.0 | 18 | 19% | 21 |
| kawigi.micro.Shiz 1.1 | 15 | 16% | 42 |
| kawigi.robot.Girl 1.2 | 12 | 13% | 17 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
| divineomega.TrialBot 0.003 | 0 | 0% | 3 |
| lambdaxy.TBot 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 162071 melee ticks, 50419 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 74 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52727 sent, 47886 reached their opponent, 7811 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 326 over 6 battles (54.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.0 | 118 / 210 | 1.99 | 19.7% | 33822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.7% | 118 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.1% | 30 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.7% | 5 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.0% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 2 |
| asd.Cthulhu 1.3 | 8.8 | 5.2% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 19 / 35 | 5316 |
| 2 | 1 | 71.0 | 92.1 | 23 / 35 | 5875 |
| 3 | 1 | 70.0 | 86.7 | 21 / 35 | 5701 |
| 4 | 1 | 69.9 | 88.9 | 20 / 35 | 5494 |
| 5 | 1 | 69.1 | 87.9 | 15 / 35 | 5355 |
| 6 | 1 | 70.5 | 87.9 | 20 / 35 | 6081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 68% |
| techdude.forest.FlamingForest 1.1 | 39 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 94% |
| bvh.fnr.Fenrir 0.36l | 10 | 70% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 43 | 45% | 100 |
| bvh.fnr.Fenrir 0.36l | 20 | 21% | 24 |
| techdude.forest.FlamingForest 1.1 | 18 | 19% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 6% | 20 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 7 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 180165 melee ticks, 70229 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 32 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 57408 sent, 52782 reached their opponent, 8528 virtual hits (16.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.5 | 99 / 210 | 2.40 | 18.5% | 32901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.5% | 99 |
| et.Predator 1.8 | 2.3 | 13.7% | 26 |
| cx.BlestPain 1.41 | 3.2 | 12.6% | 47 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.3% | 23 |
| ahf.NanoAndrew .4 | 5.2 | 10.6% | 7 |
| nic.Nicator 2.4 | 6.0 | 9.4% | 4 |
| maribo.melee.BMV 0.1 | 6.7 | 9.0% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.1% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 16 / 35 | 5891 |
| 2 | 1 | 69.5 | 87.0 | 22 / 35 | 5481 |
| 3 | 1 | 68.8 | 85.1 | 18 / 35 | 5633 |
| 4 | 1 | 70.3 | 89.8 | 19 / 35 | 5877 |
| 5 | 1 | 67.1 | 83.5 | 13 / 35 | 4920 |
| 6 | 1 | 64.8 | 73.7 | 11 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 77% |
| oog.melee.Mercutio 1.0 | 41 | 78% |
| cx.BlestPain 1.41 | 33 | 33% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| nic.Nicator 2.4 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 35% | 53 |
| et.Predator 1.8 | 28 | 25% | 59 |
| oog.melee.Mercutio 1.0 | 18 | 16% | 49 |
| ahf.NanoAndrew .4 | 12 | 11% | 27 |
| maribo.melee.BMV 0.1 | 10 | 9% | 13 |
| nic.Nicator 2.4 | 2 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 156382 melee ticks, 50236 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 92 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 92 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 52278 sent, 47502 reached their opponent, 10089 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 6 battles (51.0 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 92.5 | 134 / 210 | 1.68 | 20.1% | 31158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.1% | 134 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.6% | 30 |
| uji.DBH 1.1 | 3.5 | 11.7% | 15 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.1% | 13 |
| sigterm.Sigterm 1.0 | 5.7 | 8.6% | 8 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.6% | 4 |
| ratosh.Nobo 0.21 | 6.8 | 7.6% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.0% | 2 |
| stelo.WangRobot 1.0 | 8.8 | 5.8% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 18 / 35 | 4870 |
| 2 | 1 | 70.0 | 92.7 | 23 / 35 | 4919 |
| 3 | 1 | 70.2 | 92.1 | 22 / 35 | 5519 |
| 4 | 1 | 71.0 | 93.7 | 23 / 35 | 5636 |
| 5 | 1 | 70.2 | 93.7 | 21 / 35 | 5111 |
| 6 | 1 | 70.9 | 95.2 | 27 / 35 | 5103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 68 | 78% |
| agd.Mooserwirt2 2.7 | 35 | 83% |
| uji.DBH 1.1 | 33 | 67% |
| sigterm.Sigterm 1.0 | 15 | 53% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |
| spinnercat.Robovirus 2.718 | 6 | 83% |
| ratosh.Nobo 0.21 | 6 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 39% | 77 |
| uji.DBH 1.1 | 17 | 22% | 31 |
| agd.Mooserwirt2 2.7 | 9 | 12% | 40 |
| sigterm.Sigterm 1.0 | 9 | 12% | 19 |
| ratosh.Nobo 0.21 | 6 | 8% | 15 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 6 |
| stelo.WangRobot 1.0 | 1 | 1% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 141173 melee ticks, 54469 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 658 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 183 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 4.

Targeting waves (202 rounds): 46983 sent, 42123 reached their opponent, 9043 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 99.0 | 200 / 210 | 1.09 | 22.8% | 38357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 22.8% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.3% | 6 |
| mld.Infinity 2.2 | 3.3 | 12.0% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.4% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 0 |
| mbh.Mbh 0.1 | 6.3 | 7.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.8 | 8.2% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 98.4 | 33 / 35 | 6421 |
| 2 | 1 | 73.4 | 98.4 | 32 / 35 | 6117 |
| 3 | 1 | 73.2 | 97.5 | 31 / 35 | 6117 |
| 4 | 1 | 74.9 | 100.0 | 35 / 35 | 7126 |
| 5 | 1 | 73.8 | 99.7 | 34 / 35 | 6417 |
| 6 | 1 | 74.0 | 100.0 | 35 / 35 | 6159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 110 | 97% |
| mld.Infinity 2.2 | 30 | 100% |
| krillr.mini.JointStrike 2.0.0 | 27 | 93% |
| erdnis.Rover 0.3 | 18 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pac.ABC 2.1 | 3 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 60% | 84 |
| krillr.mini.JointStrike 2.0.0 | 4 | 40% | 31 |
| mld.Infinity 2.2 | 0 | 0% | 25 |
| erdnis.Rover 0.3 | 0 | 0% | 19 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 15 |
| pac.ABC 2.1 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 126532 melee ticks, 46011 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42948 sent, 38362 reached their opponent, 9145 virtual hits (23.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 745 over 6 battles (124.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.1 | 150 / 210 | 1.62 | 21.3% | 37266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.3% | 150 |
| trm.Wrekt 1.1.6.f | 2.0 | 14.8% | 31 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 12 |
| catcat20.Rabbit 0.001 | 4.0 | 10.8% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 6.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 96.2 | 26 / 35 | 6487 |
| 2 | 1 | 71.8 | 93.3 | 26 / 35 | 6215 |
| 3 | 1 | 71.6 | 93.7 | 26 / 35 | 5923 |
| 4 | 1 | 71.8 | 93.0 | 25 / 35 | 6384 |
| 5 | 1 | 70.5 | 90.5 | 24 / 35 | 5839 |
| 6 | 1 | 71.4 | 91.7 | 23 / 35 | 6418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 83% |
| fwb.Nine 1.0.1 | 45 | 98% |
| catcat20.Rabbit 0.001 | 27 | 63% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 28 | 42% | 88 |
| catcat20.Rabbit 0.001 | 14 | 21% | 44 |
| fwb.Nine 1.0.1 | 11 | 16% | 20 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 10 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 24 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166456 melee ticks, 60637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 24 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51858 sent, 47111 reached their opponent, 10567 virtual hits (22.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 374 over 6 battles (62.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.7 | 139 / 210 | 1.57 | 20.9% | 35493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.9% | 139 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 55 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 1 |
| eld.Hmm 1.0 | 5.0 | 8.6% | 7 |
| oa.weak.BotherBot 0.1 | 6.7 | 7.1% | 0 |
| fire219.CatBot 1.0 | 7.0 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.3 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.3 | 21 / 35 | 6027 |
| 2 | 1 | 72.7 | 95.9 | 24 / 35 | 6364 |
| 3 | 1 | 72.1 | 94.0 | 25 / 35 | 5932 |
| 4 | 1 | 70.5 | 89.8 | 20 / 35 | 5681 |
| 5 | 1 | 70.8 | 93.3 | 23 / 35 | 5699 |
| 6 | 1 | 72.0 | 94.6 | 26 / 35 | 5790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 67% |
| dummy.mini.Scimitar 1.01 | 31 | 90% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| eld.Hmm 1.0 | 11 | 45% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 61% | 114 |
| dummy.mini.Scimitar 1.01 | 11 | 15% | 43 |
| eld.Hmm 1.0 | 7 | 9% | 25 |
| PSW.Relentless 0.1 | 4 | 5% | 5 |
| cf.RiO.RiOx 4.2.1 | 3 | 4% | 20 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 180816 melee ticks, 85534 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 72 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 53248 sent, 48355 reached their opponent, 8355 virtual hits (17.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.2 | 101 / 210 | 1.98 | 18.8% | 30525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 18.8% | 101 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 58 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.5% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.2% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 3 |
| gg.Squaraus 0.6 | 6.5 | 6.5% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.6% | 2 |
| tad.Dalek98 0.98 | 7.3 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 23 / 35 | 5182 |
| 2 | 1 | 69.8 | 90.2 | 19 / 35 | 5148 |
| 3 | 1 | 67.8 | 88.3 | 14 / 35 | 4483 |
| 4 | 2 | 68.1 | 83.5 | 14 / 35 | 5056 |
| 5 | 1 | 67.8 | 86.3 | 13 / 35 | 4808 |
| 6 | 1 | 71.1 | 93.3 | 18 / 35 | 5848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 67 | 42% |
| kvk.HebusLeTroll 0.35 | 46 | 67% |
| jlm.javaDisturbance 0.59 | 41 | 73% |
| bigpete.Stewie 1.0 | 7 | 100% |
| pbg.NinjaX 1.2 | 3 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 48 | 42% | 83 |
| kvk.HebusLeTroll 0.35 | 27 | 24% | 46 |
| jlm.javaDisturbance 0.59 | 22 | 19% | 52 |
| bigpete.Stewie 1.0 | 6 | 5% | 12 |
| tad.Dalek98 0.98 | 4 | 4% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 6 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161868 melee ticks, 55635 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52340 sent, 47380 reached their opponent, 7447 virtual hits (15.7% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 6 battles (28.2 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 95.1 | 176 / 210 | 1.44 | 21.7% | 36504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.7% | 176 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 24 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.0% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.3% | 0 |
| sample.Walls 1.0 | 7.3 | 7.7% | 3 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 95.9 | 29 / 35 | 5873 |
| 2 | 1 | 72.8 | 94.9 | 30 / 35 | 6189 |
| 3 | 1 | 72.9 | 95.2 | 27 / 35 | 6105 |
| 4 | 1 | 73.8 | 95.6 | 32 / 35 | 6461 |
| 5 | 1 | 73.6 | 97.5 | 29 / 35 | 6245 |
| 6 | 1 | 71.7 | 91.7 | 29 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 105 | 91% |
| cre.Karolos 0.32 | 51 | 96% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| sample.Walls 1.0 | 10 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 16 | 46% | 99 |
| cre.Karolos 0.32 | 11 | 31% | 58 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 11% | 9 |
| stelo.RamTrackSurfer 1.2 | 2 | 6% | 19 |
| stelo.AreaTargetingBot 1.1 | 1 | 3% | 15 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 123063 melee ticks, 52655 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 38530 sent, 33667 reached their opponent, 10066 virtual hits (29.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 6 battles (65.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.9 | 81 / 210 | 2.63 | 16.7% | 24057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 16.7% | 81 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.8% | 40 |
| davidalves.Phoenix 0.54 | 3.3 | 13.0% | 36 |
| florent.XSeries.X2 0.12 | 4.0 | 12.5% | 25 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 7 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.8 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 4.9% | 1 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 81.9 | 11 / 35 | 4122 |
| 2 | 1 | 65.6 | 82.9 | 12 / 35 | 3954 |
| 3 | 1 | 66.2 | 84.4 | 15 / 35 | 3749 |
| 4 | 1 | 67.1 | 83.8 | 18 / 35 | 4184 |
| 5 | 1 | 66.0 | 81.3 | 14 / 35 | 4307 |
| 6 | 2 | 63.9 | 77.1 | 11 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 49 | 63% |
| davidalves.Phoenix 0.54 | 38 | 50% |
| pedersen.Ugluk 1.1.1 | 18 | 61% |
| florent.XSeries.X2 0.12 | 17 | 53% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 27% | 45 |
| davidalves.Phoenix 0.54 | 34 | 26% | 50 |
| rz.GlowBlowMelee 1.4 | 31 | 23% | 57 |
| pedersen.Ugluk 1.1.1 | 15 | 11% | 27 |
| oog.melee.Corsair 1.0 | 8 | 6% | 18 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 139207 melee ticks, 40033 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46611 sent, 41474 reached their opponent, 7630 virtual hits (18.4% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.1 | 142 / 210 | 2.07 | 18.7% | 24134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.7% | 142 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.0% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.0% | 11 |
| jdw.Hurricane 1.4 | 4.3 | 10.8% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.6% | 10 |
| ds.Oo 2.2 | 5.8 | 8.8% | 3 |
| awesomeness.Elite 1.0 | 7.2 | 7.5% | 2 |
| adt.Ar2 1.1 | 8.2 | 6.6% | 0 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.5% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.0 | 19 / 35 | 3971 |
| 2 | 1 | 68.8 | 88.9 | 25 / 35 | 4099 |
| 3 | 1 | 68.9 | 90.8 | 25 / 35 | 3985 |
| 4 | 1 | 68.7 | 90.2 | 24 / 35 | 4044 |
| 5 | 1 | 66.6 | 82.5 | 22 / 35 | 3773 |
| 6 | 1 | 69.4 | 90.2 | 27 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 59 | 86% |
| voidious.micro.BlitzBat 1.05 | 37 | 95% |
| jdw.Hurricane 1.4 | 18 | 83% |
| ds.Oo 2.2 | 13 | 100% |
| awesomeness.Elite 1.0 | 11 | 82% |
| gre.svman4.Morfeas 1.4.1 | 9 | 78% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 24% | 46 |
| voidious.micro.BlitzBat 1.05 | 14 | 20% | 46 |
| jdw.Hurricane 1.4 | 13 | 19% | 32 |
| ds.Oo 2.2 | 6 | 9% | 26 |
| adt.Ar2 1.1 | 6 | 9% | 12 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 21 |
| awesomeness.Elite 1.0 | 5 | 7% | 14 |
| amk.ChumbaMini 0.2 | 3 | 4% | 5 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127006 melee ticks, 30329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45474 sent, 40577 reached their opponent, 6582 virtual hits (16.2% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 348 over 6 battles (58.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.7 | 150 / 210 | 1.57 | 21.1% | 38293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.1% | 150 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 28 |
| lrem.Spectre 0.4.4 | 3.3 | 12.6% | 10 |
| shu.nitro.LENIN .T34 | 3.7 | 12.4% | 14 |
| js.PinBall 1.6 | 5.0 | 10.3% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 8.8% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 4 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 19 / 35 | 6204 |
| 2 | 1 | 72.9 | 96.8 | 29 / 35 | 6456 |
| 3 | 1 | 73.2 | 97.5 | 29 / 35 | 6312 |
| 4 | 1 | 70.9 | 90.8 | 23 / 35 | 6015 |
| 5 | 1 | 72.6 | 94.6 | 25 / 35 | 6729 |
| 6 | 1 | 72.6 | 93.0 | 25 / 35 | 6577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 70 | 79% |
| lrem.Spectre 0.4.4 | 46 | 91% |
| shu.nitro.LENIN .T34 | 34 | 91% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 25% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 42% | 74 |
| shu.nitro.LENIN .T34 | 12 | 19% | 54 |
| lrem.Spectre 0.4.4 | 9 | 15% | 39 |
| js.PinBall 1.6 | 6 | 10% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 6% | 8 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 11 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 160953 melee ticks, 46598 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 27 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 51983 sent, 47070 reached their opponent, 11623 virtual hits (24.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 470 over 6 battles (78.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.8 | 137 / 210 | 2.46 | 19.0% | 31752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 19.0% | 137 |
| mk.Alpha 0.2.1 | 2.5 | 13.3% | 43 |
| EH.Eagle 1.0.6 | 3.0 | 11.1% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.5% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.3% | 1 |
| wee.Gem 1.8.4 | 5.5 | 9.5% | 13 |
| joe.ADinosaur 1.0 | 5.7 | 9.0% | 2 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.7% | 3 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.0 | 23 / 35 | 5481 |
| 2 | 1 | 70.0 | 92.7 | 26 / 35 | 5217 |
| 3 | 1 | 71.5 | 96.5 | 30 / 35 | 5306 |
| 4 | 1 | 63.6 | 63.5 | 17 / 35 | 5142 |
| 5 | 2 | 62.4 | 63.2 | 13 / 35 | 5107 |
| 6 | 1 | 70.6 | 93.0 | 28 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 82% |
| EH.Eagle 1.0.6 | 35 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| joe.ADinosaur 1.0 | 10 | 90% |
| wee.Gem 1.8.4 | 10 | 70% |
| throxbot.ThroxBot 0.1 | 7 | 71% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 29% | 65 |
| cs.Grudge 1.0 | 12 | 16% | 14 |
| EH.Eagle 1.0.6 | 9 | 12% | 41 |
| joe.ADinosaur 1.0 | 9 | 12% | 17 |
| wee.Gem 1.8.4 | 6 | 8% | 15 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 5% | 20 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 20 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 120677 melee ticks, 32325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 89 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 40749 sent, 35948 reached their opponent, 9247 virtual hits (25.7% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.6 | 144 / 210 | 1.94 | 18.8% | 24638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.8% | 144 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 25 |
| uji.Antique 1.0 | 3.2 | 12.6% | 23 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.2% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.5% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.9% | 5 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 3 |
| stelo.Lifestealer 1.0 | 8.5 | 5.8% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.7% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.0 | 24 / 35 | 4092 |
| 2 | 1 | 68.1 | 87.3 | 22 / 35 | 4263 |
| 3 | 1 | 66.7 | 84.1 | 21 / 35 | 4053 |
| 4 | 1 | 69.1 | 92.1 | 24 / 35 | 4116 |
| 5 | 1 | 69.9 | 92.1 | 29 / 35 | 4245 |
| 6 | 1 | 67.7 | 88.9 | 24 / 35 | 3869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 88% |
| uji.Antique 1.0 | 48 | 88% |
| qohnil.blot.BlotBot 3.61 | 14 | 93% |
| amk.ChumbaWumba 0.3 | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 5 | 40% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 17 | 26% | 71 |
| kid.test.NightFox .2 | 17 | 26% | 47 |
| pfvicm.Sobieski 7.2.3b | 14 | 21% | 23 |
| qohnil.blot.BlotBot 3.61 | 6 | 9% | 30 |
| amk.ChumbaWumba 0.3 | 5 | 8% | 14 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 12 |
| stelo.PianistNano 1.2 | 3 | 5% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 127619 melee ticks, 37700 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 17 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 43198 sent, 38415 reached their opponent, 5421 virtual hits (14.1% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 300 over 6 battles (50.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 116 / 210 | 1.97 | 19.3% | 28810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.3% | 116 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 43 |
| deewiant.Anomaly 0.2 | 2.7 | 14.4% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.7% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.6% | 2 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.4 | 12 / 35 | 4460 |
| 2 | 1 | 68.2 | 87.0 | 15 / 35 | 4370 |
| 3 | 1 | 69.9 | 88.9 | 21 / 35 | 5020 |
| 4 | 1 | 69.8 | 88.3 | 20 / 35 | 4879 |
| 5 | 1 | 71.1 | 93.3 | 25 / 35 | 4900 |
| 6 | 1 | 71.3 | 93.3 | 23 / 35 | 5181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 56% |
| myl.micro.Troodon 1.10 | 22 | 91% |
| jok.PheonixM 0.1.2 | 18 | 89% |
| ap.Frederick 1.1 | 4 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 40 | 42% | 74 |
| deewiant.Anomaly 0.2 | 32 | 33% | 79 |
| myl.micro.Troodon 1.10 | 12 | 13% | 26 |
| jok.PheonixM 0.1.2 | 7 | 7% | 22 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 5 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 166271 melee ticks, 54515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54576 sent, 49775 reached their opponent, 7737 virtual hits (15.5% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 6 battles (118.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.6 | 53 / 210 | 3.01 | 15.4% | 23125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 15.4% | 53 |
| darkcanuck.B26354 1.06 | 2.7 | 13.5% | 50 |
| stelo.PastFuture 2.3.2 | 3.3 | 12.6% | 27 |
| catcat20.Matcha 0.006 | 3.5 | 13.1% | 35 |
| oog.melee.Capulet 1.2 | 4.3 | 12.3% | 28 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.0% | 7 |
| ntc.Opposite 1.5 | 7.8 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.2% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 76.2 | 9 / 35 | 4124 |
| 2 | 1 | 64.2 | 80.0 | 8 / 35 | 3922 |
| 3 | 2 | 63.0 | 76.8 | 5 / 35 | 3892 |
| 4 | 1 | 63.9 | 79.0 | 8 / 35 | 3828 |
| 5 | 1 | 62.5 | 74.9 | 12 / 35 | 3592 |
| 6 | 1 | 64.0 | 78.7 | 11 / 35 | 3767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 46% |
| darkcanuck.B26354 1.06 | 27 | 41% |
| oog.melee.Capulet 1.2 | 20 | 45% |
| stelo.PastFuture 2.3.2 | 19 | 53% |
| intruder.PrairieWolf 2.61 | 7 | 43% |
| tripphippy.Alice 1.1 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |

Hadur died in 164 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 23% | 47 |
| stelo.PastFuture 2.3.2 | 31 | 19% | 42 |
| catcat20.Matcha 0.006 | 30 | 18% | 45 |
| oog.melee.Capulet 1.2 | 25 | 15% | 38 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 7% | 12 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 9 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158208 melee ticks, 35258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 51642 sent, 46597 reached their opponent, 7749 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 6 battles (81.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.3 | 66 / 210 | 2.77 | 15.9% | 21730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 94 |
| hadur117.Hadur 3.20bb | 2.2 | 15.9% | 66 |
| gh.mini.Griezel 0.2 | 3.3 | 12.8% | 30 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.6% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 13 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 81.9 | 14 / 35 | 3824 |
| 2 | 2 | 67.0 | 84.1 | 15 / 35 | 4021 |
| 3 | 3 | 60.3 | 72.4 | 3 / 35 | 3036 |
| 4 | 2 | 66.5 | 83.5 | 13 / 35 | 3989 |
| 5 | 2 | 64.4 | 81.0 | 8 / 35 | 3575 |
| 6 | 2 | 64.1 | 79.0 | 13 / 35 | 3285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 64 | 50% |
| gh.mini.Griezel 0.2 | 25 | 40% |
| d414.nano.Quantum 1.0.0 | 10 | 100% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 63 | 42% | 97 |
| gh.mini.Griezel 0.2 | 39 | 26% | 55 |
| d414.nano.Quantum 1.0.0 | 15 | 10% | 20 |
| spinnercat.micro.Tyger 0.1 | 13 | 9% | 16 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 10 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
| fm.mammillarias 1.3 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155412 melee ticks, 33949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 49770 sent, 44827 reached their opponent, 7459 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 745 over 6 battles (124.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 89.0 | 115 / 210 | 1.99 | 18.4% | 27340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.4% | 115 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 50 |
| apc.botM 3.0 | 3.0 | 12.2% | 19 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 4 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 6 |
| vjik.UnViolation 1.1 | 5.7 | 9.4% | 7 |
| panzer.Panzer 0.2 | 7.7 | 7.5% | 0 |
| conscience.Electron 1.3g | 8.0 | 6.7% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.8 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 87.3 | 16 / 35 | 4199 |
| 2 | 1 | 70.0 | 92.7 | 24 / 35 | 5403 |
| 3 | 1 | 67.6 | 86.7 | 20 / 35 | 4485 |
| 4 | 1 | 65.9 | 85.1 | 16 / 35 | 4080 |
| 5 | 1 | 68.0 | 90.5 | 19 / 35 | 4467 |
| 6 | 1 | 68.5 | 92.1 | 20 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 54% |
| apc.botM 3.0 | 39 | 77% |
| lxx.ConceptA 0.8 | 14 | 79% |
| vjik.UnViolation 1.1 | 13 | 85% |
| yk.JahMicro 1.0 | 11 | 64% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| donjezza.Jezza 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 44% | 87 |
| apc.botM 3.0 | 13 | 13% | 41 |
| lxx.ConceptA 0.8 | 13 | 13% | 20 |
| bayen.UbaMicro 1.4 | 11 | 11% | 17 |
| vjik.UnViolation 1.1 | 5 | 5% | 24 |
| yk.JahMicro 1.0 | 4 | 4% | 9 |
| conscience.Electron 1.3g | 2 | 2% | 6 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 125478 melee ticks, 50919 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 42901 sent, 37967 reached their opponent, 6938 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 6 battles (66.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.2 | 114 / 210 | 2.24 | 18.7% | 28369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.7% | 114 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.3% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.1% | 10 |
| labg.Cataclysm 2.05 | 4.7 | 10.6% | 13 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.7% | 7 |
| zyx.micro.Ant 1.1 | 8.5 | 5.3% | 2 |
| sanja.First 0.1 | 8.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 24 / 35 | 4892 |
| 2 | 1 | 68.6 | 86.0 | 18 / 35 | 4639 |
| 3 | 1 | 68.6 | 87.0 | 17 / 35 | 4478 |
| 4 | 1 | 65.5 | 76.5 | 13 / 35 | 4494 |
| 5 | 1 | 67.9 | 84.1 | 16 / 35 | 4711 |
| 6 | 1 | 71.2 | 93.0 | 26 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 80% |
| gre.svman4.Leonidas 1.3.2 | 22 | 86% |
| labg.Cataclysm 2.05 | 11 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 2 | 50% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 34% | 75 |
| gre.svman4.Leonidas 1.3.2 | 21 | 21% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 19% | 58 |
| labg.Cataclysm 2.05 | 7 | 7% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 13 |
| baal.nano.N 1.42 | 4 | 4% | 8 |
| sanja.First 0.1 | 2 | 2% | 3 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 179118 melee ticks, 49392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56026 sent, 51021 reached their opponent, 7426 virtual hits (14.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 421 over 6 battles (70.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.5 | 99 / 210 | 2.04 | 18.7% | 31295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 18.7% | 99 |
| kid.Gladiator .7.2 | 1.8 | 16.8% | 48 |
| stelo.Spread 0.9 | 3.0 | 14.7% | 41 |
| jcs.Seth 1.8 | 4.2 | 11.3% | 16 |
| tcf.Reach 3 | 4.8 | 10.8% | 5 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 18 / 35 | 5219 |
| 2 | 1 | 70.3 | 91.1 | 19 / 35 | 5532 |
| 3 | 1 | 69.7 | 88.6 | 17 / 35 | 5270 |
| 4 | 1 | 69.7 | 90.8 | 18 / 35 | 5115 |
| 5 | 1 | 69.3 | 88.9 | 16 / 35 | 5221 |
| 6 | 2 | 67.4 | 83.5 | 11 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 63% |
| kid.Gladiator .7.2 | 61 | 61% |
| jcs.Seth 1.8 | 19 | 68% |
| tcf.Reach 3 | 8 | 63% |
| amk.Punbot.Punbot 0.01 | 2 | 50% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1087. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 49 | 43% | 78 |
| stelo.Spread 0.9 | 38 | 33% | 78 |
| jcs.Seth 1.8 | 11 | 10% | 26 |
| tcf.Reach 3 | 9 | 8% | 17 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| cli.Dancer 1.1 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 168932 melee ticks, 59325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51898 sent, 47103 reached their opponent, 7787 virtual hits (16.5% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 686 over 6 battles (114.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.6 | 62 / 210 | 2.39 | 16.5% | 22858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.8% | 123 |
| hadur117.Hadur 3.20bb | 2.0 | 16.5% | 62 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.5% | 10 |
| gh.mini.Gruwel 0.9 | 4.0 | 12.3% | 12 |
| rz.HawkOnFire 0.1 | 4.5 | 11.3% | 3 |
| wit.Chuliath 1.0 | 6.2 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 85.1 | 7 / 35 | 3886 |
| 2 | 2 | 66.5 | 84.1 | 14 / 35 | 4070 |
| 3 | 2 | 66.2 | 85.7 | 15 / 35 | 3511 |
| 4 | 2 | 64.3 | 79.4 | 5 / 35 | 3616 |
| 5 | 2 | 66.7 | 86.0 | 12 / 35 | 4005 |
| 6 | 2 | 66.1 | 87.0 | 9 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 23% |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 78% |
| rz.HawkOnFire 0.1 | 16 | 88% |
| gh.mini.Gruwel 0.9 | 13 | 69% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 68% | 125 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 11% | 33 |
| gh.mini.Gruwel 0.9 | 14 | 9% | 27 |
| rz.HawkOnFire 0.1 | 11 | 7% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 145892 melee ticks, 52375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45598 sent, 40536 reached their opponent, 6276 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 429 over 6 battles (71.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.2 | 147 / 210 | 1.79 | 20.4% | 32267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.4% | 147 |
| alpha.RainingFire 1.0 | 2.5 | 12.6% | 17 |
| bzdp.Pansy 2.1 | 3.0 | 11.7% | 11 |
| mz.Cork 0.1 | 4.7 | 10.6% | 15 |
| m3thos.Eva02 0.7.1 | 4.8 | 10.2% | 9 |
| bvh.micro.Freya 0.3 | 5.7 | 10.0% | 5 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 5.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 26 / 35 | 5438 |
| 2 | 1 | 70.8 | 92.1 | 23 / 35 | 5473 |
| 3 | 1 | 69.7 | 90.8 | 23 / 35 | 5143 |
| 4 | 1 | 70.4 | 88.9 | 26 / 35 | 5558 |
| 5 | 1 | 70.9 | 93.7 | 24 / 35 | 5273 |
| 6 | 1 | 70.4 | 89.8 | 25 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 91% |
| alpha.RainingFire 1.0 | 36 | 78% |
| mz.Cork 0.1 | 25 | 76% |
| bvh.micro.Freya 0.3 | 24 | 92% |
| m3thos.Eva02 0.7.1 | 19 | 84% |
| bvh.mini.Fenrir 0.39 | 17 | 94% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 29% | 47 |
| bzdp.Pansy 2.1 | 14 | 21% | 50 |
| mz.Cork 0.1 | 13 | 20% | 40 |
| m3thos.Eva02 0.7.1 | 6 | 9% | 23 |
| bvh.micro.Freya 0.3 | 5 | 8% | 20 |
| bvh.mini.Fenrir 0.39 | 3 | 5% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 3 |
| dl.BetterWalls 1.0 | 1 | 2% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144623 melee ticks, 45102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49995 sent, 45301 reached their opponent, 9324 virtual hits (20.6% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.3 | 161 / 210 | 1.96 | 19.6% | 34307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.6% | 161 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.8% | 8 |
| germ.TheMind .2 | 3.8 | 10.1% | 8 |
| EBBU.Sim2 1.02 | 4.2 | 9.5% | 3 |
| agrach.Dalek 1.0 | 5.0 | 9.4% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.7% | 0 |
| lmk.ACPFinal 0.1 | 7.5 | 8.1% | 3 |
| mb.Beast 0.1 | 7.5 | 8.3% | 5 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.2% | 6 |
| skm.Ryubot 1.0 | 9.2 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.4 | 29 / 35 | 5470 |
| 2 | 1 | 70.7 | 94.0 | 28 / 35 | 6206 |
| 3 | 1 | 68.1 | 88.3 | 27 / 35 | 5499 |
| 4 | 1 | 67.6 | 84.8 | 27 / 35 | 5281 |
| 5 | 1 | 69.4 | 90.5 | 27 / 35 | 6076 |
| 6 | 1 | 67.5 | 86.0 | 23 / 35 | 5775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 28 | 86% |
| germ.TheMind .2 | 26 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 100% |
| mb.Beast 0.1 | 22 | 91% |
| EBBU.Sim2 1.02 | 21 | 95% |
| skm.Ryubot 1.0 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 16 | 88% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 12 | 24% | 14 |
| agrach.Dalek 1.0 | 11 | 22% | 41 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 14% | 35 |
| stelo.UntouchableNano 1.3 | 6 | 12% | 19 |
| mb.Beast 0.1 | 5 | 10% | 28 |
| lmk.ACPFinal 0.1 | 4 | 8% | 18 |
| EBBU.Sim2 1.02 | 3 | 6% | 28 |
| germ.TheMind .2 | 1 | 2% | 18 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 203 rounds): 97874 melee ticks, 27711 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 32556 sent, 28112 reached their opponent, 8372 virtual hits (29.8% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 6 battles (67.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 112 / 210 | 2.17 | 18.2% | 27457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.2% | 112 |
| justin.Mallais 14.0 | 2.0 | 15.6% | 54 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 9 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.4% | 17 |
| cs.Wren 1.0 | 5.0 | 10.6% | 7 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.6% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.0% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.7 | 24 / 35 | 4714 |
| 2 | 1 | 66.6 | 83.2 | 15 / 35 | 4379 |
| 3 | 1 | 66.8 | 83.5 | 15 / 35 | 4555 |
| 4 | 1 | 68.7 | 88.3 | 21 / 35 | 4672 |
| 5 | 1 | 68.5 | 89.5 | 20 / 35 | 4388 |
| 6 | 1 | 67.7 | 84.8 | 17 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 59 | 68% |
| bvh.mini.Freya 0.55 | 28 | 89% |
| bts.mega.Gnarly 1.4 | 27 | 67% |
| cs.Wren 1.0 | 16 | 100% |
| kdf.KoulDestroyer 1.0 | 12 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 33 | 32% | 76 |
| bts.mega.Gnarly 1.4 | 20 | 20% | 42 |
| bvh.mini.Freya 0.55 | 19 | 19% | 35 |
| kdf.KoulDestroyer 1.0 | 12 | 12% | 18 |
| cs.Wren 1.0 | 6 | 6% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 6 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 138881 melee ticks, 39012 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 43 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 45899 sent, 40760 reached their opponent, 8580 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.5 | 106 / 210 | 2.13 | 18.6% | 30855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.6% | 106 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 22 |
| az.Ololobot 0.2.4 | 2.8 | 13.3% | 54 |
| catcat20.Lambda 0.024 | 4.0 | 11.1% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.4 | 14 / 35 | 4896 |
| 2 | 1 | 69.8 | 92.4 | 23 / 35 | 5338 |
| 3 | 1 | 68.0 | 87.3 | 19 / 35 | 4948 |
| 4 | 1 | 69.7 | 91.4 | 20 / 35 | 5512 |
| 5 | 1 | 67.4 | 85.4 | 17 / 35 | 5034 |
| 6 | 1 | 67.0 | 83.8 | 13 / 35 | 5127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 55% |
| bvh.fry.Freya 0.82 | 49 | 84% |
| catcat20.Lambda 0.024 | 28 | 57% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| gimp.GimpBot 0.1 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 37 | 34% | 63 |
| az.Ololobot 0.2.4 | 36 | 33% | 71 |
| catcat20.Lambda 0.024 | 17 | 16% | 31 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 16 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 10 |
| gimp.GimpBot 0.1 | 3 | 3% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163251 melee ticks, 55888 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51686 sent, 46848 reached their opponent, 8216 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 308 over 6 battles (51.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.8 | 129 / 210 | 1.83 | 19.9% | 31006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.9% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 13.9% | 26 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.8% | 30 |
| mz.AntiGrav 1.0 | 3.8 | 11.3% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 6 |
| stelo.Randomness 1.0 | 6.5 | 8.9% | 6 |
| alpha.BlackIce 1.0 | 6.5 | 9.2% | 4 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 21 / 35 | 5200 |
| 2 | 1 | 70.7 | 92.7 | 21 / 35 | 5308 |
| 3 | 1 | 72.1 | 96.2 | 27 / 35 | 5534 |
| 4 | 1 | 70.4 | 88.6 | 22 / 35 | 5517 |
| 5 | 1 | 69.0 | 88.9 | 21 / 35 | 4618 |
| 6 | 1 | 69.1 | 89.2 | 17 / 35 | 4829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 83% |
| kano.gamma.KanoGamma 1.8 | 53 | 64% |
| mz.AntiGrav 1.0 | 22 | 82% |
| Polkwane.SmashMelee 1.0 | 14 | 93% |
| stelo.Randomness 1.0 | 13 | 77% |
| alpha.BlackIce 1.0 | 8 | 63% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kano.gamma.KanoGamma 1.8 | 26 | 31% | 53 |
| kawigi.mini.Coriantumr 1.1 | 21 | 25% | 59 |
| mz.AntiGrav 1.0 | 11 | 13% | 28 |
| stelo.Randomness 1.0 | 9 | 11% | 29 |
| Polkwane.SmashMelee 1.0 | 9 | 11% | 18 |
| alpha.BlackIce 1.0 | 5 | 6% | 14 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 152533 melee ticks, 42657 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 98 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49818 sent, 44871 reached their opponent, 9143 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 609 over 6 battles (101.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.0 | 102 / 210 | 2.26 | 17.9% | 25819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 17.9% | 102 |
| eem.EvBotNG v12.8 | 2.0 | 15.6% | 69 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 19 |
| ary.Swarm 1.1 | 3.8 | 13.0% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 10 |
| shrub.Silver v048 | 6.2 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 15 / 35 | 4663 |
| 2 | 1 | 68.2 | 87.9 | 16 / 35 | 4508 |
| 3 | 1 | 68.1 | 87.9 | 19 / 35 | 4233 |
| 4 | 1 | 67.5 | 85.4 | 17 / 35 | 3935 |
| 5 | 1 | 68.6 | 87.3 | 19 / 35 | 4298 |
| 6 | 1 | 66.9 | 82.9 | 16 / 35 | 4182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 46% |
| lessonz.robocode.Oz 0.5.0 | 29 | 66% |
| ary.Swarm 1.1 | 26 | 96% |
| simonton.nano.MeleeSeed 1.8 | 15 | 100% |
| shrub.Silver v048 | 6 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 47% | 84 |
| lessonz.robocode.Oz 0.5.0 | 24 | 21% | 49 |
| ary.Swarm 1.1 | 12 | 11% | 31 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 26 |
| shrub.Silver v048 | 3 | 3% | 10 |
| jsal.Jsalbot 1.0 | 3 | 3% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 153160 melee ticks, 52566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 94 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49535 sent, 44839 reached their opponent, 7049 virtual hits (15.7% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 634 over 6 battles (105.7 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.2 | 143 / 210 | 1.79 | 20.4% | 35661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.4% | 143 |
| wompi.Wallaby 5.1 | 2.0 | 15.3% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.5% | 12 |
| ara.Shera 0.88 | 4.0 | 12.4% | 15 |
| amz.NanoClone 1.41 | 5.2 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.0 | 7.2% | 3 |
| maribo.IotaCT 1.1 | 7.2 | 6.4% | 1 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 22 / 35 | 5804 |
| 2 | 1 | 71.5 | 94.3 | 25 / 35 | 6206 |
| 3 | 1 | 71.4 | 91.1 | 26 / 35 | 6272 |
| 4 | 1 | 70.4 | 91.7 | 23 / 35 | 5631 |
| 5 | 1 | 70.9 | 89.8 | 23 / 35 | 6235 |
| 6 | 1 | 70.1 | 88.9 | 24 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 82 | 89% |
| maribo.mini.MiniQuester 0.1 | 54 | 89% |
| ara.Shera 0.88 | 24 | 71% |
| dsw.StaticD 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 22 | 30% | 93 |
| ara.Shera 0.88 | 20 | 27% | 40 |
| maribo.mini.MiniQuester 0.1 | 19 | 26% | 58 |
| dsw.StaticD 1.0 | 2 | 3% | 11 |
| amz.NanoClone 1.41 | 2 | 3% | 3 |
| maribo.IotaCT 1.1 | 1 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162151 melee ticks, 51687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51302 sent, 46546 reached their opponent, 9164 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 609 over 6 battles (101.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.0 | 31 / 210 | 2.98 | 15.2% | 22554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 137 |
| hadur117.Hadur 3.20bb | 2.0 | 15.2% | 31 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.4% | 34 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.4% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 0 |
| mz.NanoGod 2.02 | 6.8 | 7.9% | 0 |
| jab.DiamondStealer 5 | 8.0 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 79.4 | 6 / 35 | 3732 |
| 2 | 2 | 64.9 | 77.8 | 6 / 35 | 3759 |
| 3 | 2 | 66.3 | 81.3 | 5 / 35 | 4213 |
| 4 | 2 | 66.0 | 81.0 | 8 / 35 | 3959 |
| 5 | 2 | 64.4 | 76.2 | 3 / 35 | 3626 |
| 6 | 2 | 62.7 | 72.7 | 3 / 35 | 3265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 73 | 22% |
| brainfade.melee.Dusk 0.44 | 24 | 42% |
| dummy.micro.Sparrow 2.5 | 8 | 38% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 56% | 120 |
| brainfade.melee.Dusk 0.44 | 31 | 17% | 40 |
| dummy.micro.Sparrow 2.5 | 24 | 13% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154799 melee ticks, 50710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 63 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50098 sent, 44894 reached their opponent, 7448 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.7 | 145 / 210 | 1.74 | 20.7% | 35145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.7% | 145 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.3% | 21 |
| stelo.Liblix 0.3.1 | 2.5 | 15.2% | 40 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.7% | 1 |
| jwirde.Gort 2.0 | 4.8 | 9.0% | 2 |
| disan.Chair 2.2.0 | 6.2 | 7.7% | 0 |
| wompi.Quokka 1.6 | 6.8 | 7.2% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| sample.Crazy 1.0 | 9.3 | 5.0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.2 | 23 / 35 | 5711 |
| 2 | 1 | 71.0 | 93.0 | 24 / 35 | 5736 |
| 3 | 1 | 72.2 | 94.9 | 28 / 35 | 5916 |
| 4 | 1 | 71.1 | 91.7 | 21 / 35 | 5817 |
| 5 | 1 | 70.6 | 91.1 | 24 / 35 | 5700 |
| 6 | 1 | 71.5 | 90.5 | 25 / 35 | 6265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 77% |
| tzu.TheArtOfWar 1.2 | 61 | 87% |
| jwirde.Gort 2.0 | 13 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 90% |
| disan.Chair 2.2.0 | 8 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 48% | 97 |
| tzu.TheArtOfWar 1.2 | 18 | 26% | 60 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 12% | 15 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 5 |
| jwirde.Gort 2.0 | 1 | 1% | 17 |
| disan.Chair 2.2.0 | 1 | 1% | 9 |
| wompi.Quokka 1.6 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157826 melee ticks, 48159 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54050 sent, 49208 reached their opponent, 10227 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 6 battles (82.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.2 | 129 / 210 | 1.80 | 20.7% | 33417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.7% | 129 |
| jje.BagPuss 1.2 | 2.7 | 11.9% | 10 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 10.1% | 57 |
| myl.nano.Graviton 1.10 | 4.2 | 11.1% | 4 |
| sul.Lunar 1.1 | 4.3 | 10.9% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.7% | 2 |
| fm.claire 1.7 | 6.8 | 8.3% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.4% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.7% | 0 |
| abud.ThirdRobo 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 16 / 35 | 5768 |
| 2 | 1 | 71.2 | 92.1 | 21 / 35 | 6022 |
| 3 | 1 | 71.0 | 93.7 | 21 / 35 | 5695 |
| 4 | 1 | 72.9 | 95.6 | 30 / 35 | 4910 |
| 5 | 1 | 67.9 | 83.5 | 19 / 35 | 4922 |
| 6 | 1 | 71.9 | 94.6 | 22 / 35 | 6100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 56% |
| sul.Lunar 1.1 | 31 | 87% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| jje.BagPuss 1.2 | 21 | 81% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 92% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 36 | 42% | 0 |
| jje.BagPuss 1.2 | 16 | 19% | 61 |
| sul.Lunar 1.1 | 13 | 15% | 58 |
| myl.nano.Graviton 1.10 | 7 | 8% | 40 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 18 |
| fm.claire 1.7 | 3 | 3% | 13 |
| hvilela.HVilela 0.9 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 6 |
| wit.Deep7 2.0 | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 199777 melee ticks, 87306 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 60519 sent, 55755 reached their opponent, 8482 virtual hits (15.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 85.2 | 60 / 210 | 2.33 | 16.5% | 24361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.4% | 48 |
| hadur117.Hadur 3.20bb | 2.0 | 16.5% | 60 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.6% | 84 |
| mz.MicroSheep 1.0 | 4.3 | 10.0% | 5 |
| cx.Princess 1.0 | 5.0 | 10.3% | 12 |
| sadoner.killer 0.2 | 5.7 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 82.2 | 9 / 35 | 3943 |
| 2 | 1 | 66.4 | 86.0 | 12 / 35 | 4049 |
| 3 | 2 | 65.6 | 86.7 | 10 / 35 | 3790 |
| 4 | 2 | 67.9 | 89.2 | 12 / 35 | 4570 |
| 5 | 2 | 64.6 | 81.6 | 9 / 35 | 3955 |
| 6 | 2 | 65.9 | 85.4 | 8 / 35 | 4054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 64% |
| rsalesc.melee.Medina 0.4.5 | 50 | 24% |
| arthord.NanoSatanMelee Beta | 5 | 40% |
| cx.Princess 1.0 | 5 | 60% |
| mz.MicroSheep 1.0 | 4 | 50% |

Hadur died in 156 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 62 | 40% | 77 |
| kc.mini.Mirage 0.2 | 60 | 38% | 95 |
| cx.Princess 1.0 | 9 | 6% | 11 |
| sadoner.killer 0.2 | 8 | 5% | 9 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 9 |
| mz.MicroSheep 1.0 | 5 | 3% | 8 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 164539 melee ticks, 45196 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 61 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 47143 sent, 42184 reached their opponent, 6367 virtual hits (15.1% of those reached).

