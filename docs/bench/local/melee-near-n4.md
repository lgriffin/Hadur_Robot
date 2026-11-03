# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486754. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.5 | 45 / 210 | 2.21 | 17.4% | 31573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 150 |
| hadur117.Hadur 3.21n4 | 2.0 | 17.4% | 45 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.2% | 2 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 1 |
| mz.MicroGodMelee 1 | 5.7 | 10.0% | 2 |
| adt.Ar2 1.0 | 7.0 | 6.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 83.2 | 4 / 35 | 5363 |
| 2 | 2 | 68.2 | 88.6 | 9 / 35 | 5226 |
| 3 | 2 | 67.7 | 85.4 | 6 / 35 | 5373 |
| 4 | 2 | 67.8 | 88.3 | 11 / 35 | 4959 |
| 5 | 2 | 67.7 | 87.0 | 6 / 35 | 5296 |
| 6 | 2 | 67.8 | 86.7 | 9 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 11% |
| sgp.JollyNinja 3.53 | 22 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| mz.MicroGodMelee 1 | 6 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1221. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 127 | 77% | 147 |
| sgp.JollyNinja 3.53 | 17 | 10% | 24 |
| lorneswork.Predator 1.0 | 8 | 5% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 11 |
| mz.MicroGodMelee 1 | 3 | 2% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| skm.butterfly 1.0 | 0 | 0% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 139488 melee ticks, 96012 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 79 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44062 sent, 39379 reached their opponent, 7827 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481833. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.1 | 106 / 210 | 2.07 | 19.2% | 31257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.2% | 106 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 37 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.9% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 1 |
| sch.Simone 0.3d | 7.2 | 7.6% | 9 |
| Noran.BitchingElk 0.054 | 7.5 | 7.3% | 12 |
| stelo.PatternRobot 1.0 | 9.0 | 4.6% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 14 / 35 | 5151 |
| 2 | 1 | 69.7 | 89.5 | 17 / 35 | 5458 |
| 3 | 1 | 70.6 | 93.0 | 20 / 35 | 5711 |
| 4 | 1 | 68.2 | 83.2 | 18 / 35 | 5162 |
| 5 | 1 | 70.1 | 91.7 | 20 / 35 | 5073 |
| 6 | 1 | 67.8 | 83.5 | 17 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 60% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 72% |
| Noran.BitchingElk 0.054 | 14 | 36% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| sch.Simone 0.3d | 12 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 50% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 33% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 22% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 12% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 14 |
| Noran.BitchingElk 0.054 | 10 | 10% | 12 |
| sch.Simone 0.3d | 9 | 9% | 21 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 7 |
| stelo.PatternRobot 1.0 | 2 | 2% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 165077 melee ticks, 47219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 58399 sent, 53733 reached their opponent, 9206 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487931. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.4 | 176 / 210 | 1.50 | 21.3% | 39185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.3% | 176 |
| radnor.DoctorBob 1.42 | 2.0 | 14.3% | 12 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 8 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 13 |
| urdos.URDOS 1.3 | 5.3 | 8.5% | 0 |
| adt.Ar1 2.1 | 5.7 | 8.0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 30 / 35 | 6758 |
| 2 | 1 | 71.8 | 94.3 | 29 / 35 | 6479 |
| 3 | 1 | 71.7 | 93.3 | 27 / 35 | 6762 |
| 4 | 1 | 72.0 | 96.2 | 30 / 35 | 6363 |
| 5 | 1 | 72.5 | 97.5 | 32 / 35 | 6756 |
| 6 | 1 | 70.5 | 90.5 | 28 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 75 | 89% |
| radnor.DoctorBob 1.42 | 62 | 100% |
| kawigi.nano.Lib 1.0 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 4 | 75% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 36% | 67 |
| vuen.Cake 2.51 | 8 | 22% | 78 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 17% | 7 |
| kawigi.nano.Lib 1.0 | 4 | 11% | 36 |
| adt.Ar1 2.1 | 3 | 8% | 7 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 6 |
| urdos.URDOS 1.3 | 0 | 0% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 127898 melee ticks, 45548 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 45 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38504 sent, 33983 reached their opponent, 8435 virtual hits (24.8% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505200. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.9 | 29 / 210 | 2.18 | 18.0% | 35035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 161 |
| hadur117.Hadur 3.21n4 | 2.0 | 18.0% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 9 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.1% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 1 |
| spin.Bugstard 0.012b | 9.3 | 3.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 87.6 | 4 / 35 | 6077 |
| 2 | 2 | 68.8 | 86.7 | 5 / 35 | 5614 |
| 3 | 2 | 67.9 | 84.1 | 7 / 35 | 5728 |
| 4 | 2 | 69.7 | 87.9 | 5 / 35 | 6012 |
| 5 | 2 | 69.2 | 87.9 | 5 / 35 | 5912 |
| 6 | 2 | 68.6 | 87.3 | 3 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 6% |
| TNT.TNT 0.99.1 | 16 | 44% |
| apc.LeeroyJenkins2 1.0 | 14 | 71% |
| josago.Jorgito 0.16 | 5 | 80% |
| rampancy.Durandal 2.1d | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 1354. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 76% | 151 |
| apc.LeeroyJenkins2 1.0 | 19 | 10% | 27 |
| TNT.TNT 0.99.1 | 13 | 7% | 19 |
| josago.Jorgito 0.16 | 5 | 3% | 8 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 189405 melee ticks, 80696 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 91 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 57564 sent, 52861 reached their opponent, 7813 virtual hits (14.8% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495241. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.7 | 38 / 210 | 2.83 | 15.7% | 25151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.9% | 103 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 54 |
| hadur117.Hadur 3.21n4 | 2.8 | 15.7% | 38 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 10 |
| axeBots.HataMoto 3.09 | 5.2 | 9.3% | 4 |
| ms.Ares 0.19 | 5.8 | 9.1% | 1 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.1 | 9 / 35 | 4382 |
| 2 | 3 | 64.8 | 80.0 | 5 / 35 | 4151 |
| 3 | 3 | 64.6 | 78.7 | 9 / 35 | 3957 |
| 4 | 3 | 63.7 | 75.9 | 2 / 35 | 4096 |
| 5 | 3 | 66.3 | 79.7 | 8 / 35 | 4650 |
| 6 | 3 | 64.8 | 79.7 | 5 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 48 | 10% |
| justin.DemonicRage 3.4 | 40 | 45% |
| wompi.Numbat 2.1 | 14 | 79% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 42% | 78 |
| justin.DemonicRage 3.4 | 49 | 28% | 65 |
| wompi.Numbat 2.1 | 24 | 14% | 33 |
| axeBots.HataMoto 3.09 | 13 | 8% | 16 |
| ms.Ares 0.19 | 9 | 5% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 202 rounds): 153281 melee ticks, 41313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 46979 sent, 42126 reached their opponent, 7026 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486859. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.4 | 147 / 210 | 1.60 | 20.9% | 35133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.9% | 147 |
| jekl.StoneGhost 0.7 | 2.3 | 14.6% | 20 |
| origin.SleepSiphon 1.7b | 2.8 | 13.5% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.6% | 10 |
| mld.Wisdom 1.0 | 4.8 | 10.1% | 0 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.8% | 3 |
| DBall.NUKE 0.1 | 8.2 | 5.9% | 1 |
| spinnercat.Omen 1.0 | 8.7 | 5.4% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.5 | 21 / 35 | 5641 |
| 2 | 1 | 72.5 | 95.9 | 28 / 35 | 6277 |
| 3 | 1 | 69.8 | 89.8 | 18 / 35 | 5243 |
| 4 | 1 | 72.4 | 95.6 | 29 / 35 | 5865 |
| 5 | 1 | 71.2 | 92.7 | 22 / 35 | 5848 |
| 6 | 1 | 72.9 | 95.9 | 29 / 35 | 6259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 68 | 90% |
| origin.SleepSiphon 1.7b | 64 | 77% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 78% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 43% | 78 |
| jekl.StoneGhost 0.7 | 19 | 29% | 66 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 12% | 29 |
| mld.Wisdom 1.0 | 3 | 5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 13 |
| gg.Wolverine 2.0 | 2 | 3% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 147664 melee ticks, 45193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45164 sent, 40599 reached their opponent, 8807 virtual hits (21.7% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493202. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 95 over 6 battles (15.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.7 | 96.8 | 176 / 210 | 1.25 | 26.4% | 46786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 26.4% | 176 |
| rtk.Tachikoma 1.0 | 2.0 | 18.7% | 20 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.6% | 7 |
| franzor.Lizt 1.3.1 | 3.5 | 12.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.7% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.4% | 0 |
| sample.Target 1.0 | 8.0 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 97.9 | 31 / 35 | 7251 |
| 2 | 1 | 75.8 | 96.1 | 28 / 35 | 8068 |
| 3 | 1 | 76.6 | 99.6 | 34 / 35 | 7921 |
| 4 | 1 | 75.6 | 95.4 | 27 / 35 | 7984 |
| 5 | 1 | 75.4 | 95.0 | 28 / 35 | 7760 |
| 6 | 1 | 75.4 | 97.1 | 28 / 35 | 7802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 88% |
| oog.melee.CapuletDroid 1.1 | 40 | 95% |
| franzor.Lizt 1.3.1 | 40 | 83% |

Hadur died in 34 of 210 rounds, at a mean tick of 1570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 20 | 59% | 125 |
| franzor.Lizt 1.3.1 | 7 | 21% | 7 |
| oog.melee.CapuletDroid 1.1 | 5 | 15% | 63 |
| exauge.GateKeeper 1.1.121g | 1 | 3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 1 | 3% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 189356 melee ticks, 93251 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52913 sent, 48963 reached their opponent, 10329 virtual hits (21.1% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485203. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 157). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.5 | 140 / 210 | 1.60 | 22.5% | 31374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 22.5% | 140 |
| shrub.Vapour v159 | 2.3 | 15.2% | 30 |
| tm.Yuugao 1.0 | 2.7 | 14.7% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.1% | 6 |
| m3thos.Eva00 1.1 | 5.2 | 9.3% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.0% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 7.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 5.3% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.1 | 22 / 35 | 5201 |
| 2 | 1 | 70.0 | 89.6 | 21 / 35 | 5345 |
| 3 | 1 | 71.1 | 94.3 | 23 / 35 | 5008 |
| 4 | 1 | 70.7 | 93.2 | 24 / 35 | 5079 |
| 5 | 1 | 71.5 | 94.6 | 26 / 35 | 5407 |
| 6 | 1 | 71.1 | 92.1 | 24 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 62 | 68% |
| shrub.Vapour v159 | 60 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 27 | 96% |
| m3thos.Eva00 1.1 | 12 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 38% | 80 |
| shrub.Vapour v159 | 25 | 35% | 64 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 15% | 34 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 14 |
| m3thos.Eva00 1.1 | 1 | 1% | 9 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 145626 melee ticks, 49827 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44224 sent, 39996 reached their opponent, 7498 virtual hits (18.7% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493002. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 77.7 | 69 / 210 | 3.01 | 15.8% | 22182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 92 |
| hadur117.Hadur 3.21n4 | 2.2 | 15.8% | 69 |
| kc.micro.Figment 1.0 | 2.8 | 14.3% | 24 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.0% | 14 |
| yagami.Tidus 0.11 | 4.7 | 11.0% | 3 |
| mc2.enemy.Original 0.9 | 6.3 | 8.5% | 8 |
| dft.Calliope 5.6 | 6.7 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.1 | 11 / 35 | 3547 |
| 2 | 3 | 63.2 | 74.3 | 9 / 35 | 3632 |
| 3 | 2 | 64.7 | 78.1 | 12 / 35 | 3707 |
| 4 | 2 | 66.5 | 83.8 | 12 / 35 | 4085 |
| 5 | 2 | 64.0 | 77.5 | 12 / 35 | 3507 |
| 6 | 2 | 65.7 | 80.3 | 13 / 35 | 3704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 46 | 26% |
| kc.micro.Figment 1.0 | 45 | 84% |
| pedersen.Grishnakh 1.0 | 13 | 46% |
| yagami.Tidus 0.11 | 9 | 89% |
| mc2.enemy.Original 0.9 | 4 | 75% |
| rdm.Dueler 0.4x | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 44% | 82 |
| kc.micro.Figment 1.0 | 24 | 17% | 59 |
| yagami.Tidus 0.11 | 19 | 13% | 21 |
| pedersen.Grishnakh 1.0 | 14 | 10% | 16 |
| mc2.enemy.Original 0.9 | 12 | 9% | 18 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 138926 melee ticks, 34875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 51 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45692 sent, 41129 reached their opponent, 6014 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483076. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 239 over 6 battles (39.8 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.0 | 172 / 210 | 1.36 | 21.2% | 36013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.2% | 172 |
| DTF.Kludgy 1.2b | 2.5 | 13.6% | 15 |
| ne.Chimera 1.2 | 2.7 | 13.0% | 8 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 6 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.0% | 5 |
| kurios.DOSexe .9b | 7.3 | 5.9% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.4 | 22 / 35 | 5704 |
| 2 | 1 | 71.4 | 94.3 | 25 / 35 | 6301 |
| 3 | 1 | 72.4 | 98.1 | 32 / 35 | 5760 |
| 4 | 1 | 71.9 | 96.5 | 28 / 35 | 5881 |
| 5 | 1 | 72.7 | 97.8 | 33 / 35 | 6322 |
| 6 | 1 | 72.6 | 98.1 | 32 / 35 | 6045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 85% |
| ejb.Polaris 1.0.1 | 45 | 93% |
| ne.Chimera 1.2 | 38 | 92% |
| vStar.RAFzilla 2.15 | 21 | 90% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 41% | 66 |
| ne.Chimera 1.2 | 10 | 26% | 40 |
| ejb.Polaris 1.0.1 | 4 | 10% | 51 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 11 |
| vStar.RAFzilla 2.15 | 2 | 5% | 19 |
| kurios.DOSexe .9b | 1 | 3% | 16 |
| donjezza.Muncho 1.0 | 1 | 3% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 144931 melee ticks, 61104 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 95 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46805 sent, 42148 reached their opponent, 8254 virtual hits (19.6% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488469. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.4 | 70 / 210 | 2.58 | 16.7% | 24635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.5 | 16.7% | 70 |
| rz.Aleph 0.34 | 1.5 | 16.6% | 71 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 16 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 13 |
| rdt199.Warlord 0.73 | 4.8 | 9.6% | 17 |
| br2.MobyDickBot 1.6 | 6.2 | 9.0% | 15 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.2% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 81.3 | 11 / 35 | 3887 |
| 2 | 2 | 66.1 | 81.6 | 14 / 35 | 4272 |
| 3 | 2 | 66.2 | 84.8 | 12 / 35 | 4040 |
| 4 | 1 | 67.1 | 86.3 | 15 / 35 | 4390 |
| 5 | 2 | 64.3 | 81.0 | 7 / 35 | 3974 |
| 6 | 1 | 64.7 | 79.7 | 11 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 38% |
| cx.mini.Nimrod 0.55 | 25 | 68% |
| djc.DynaBot 0.1.1 | 17 | 76% |
| rdt199.Warlord 0.73 | 14 | 71% |
| br2.MobyDickBot 1.6 | 10 | 20% |
| uji.YellohFellah 1.0 | 6 | 83% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 66 | 47% | 91 |
| cx.mini.Nimrod 0.55 | 20 | 14% | 31 |
| rdt199.Warlord 0.73 | 18 | 13% | 29 |
| br2.MobyDickBot 1.6 | 14 | 10% | 18 |
| djc.DynaBot 0.1.1 | 12 | 9% | 22 |
| uji.YellohFellah 1.0 | 6 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 2 | 1% | 4 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 156933 melee ticks, 38068 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 87 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50531 sent, 45732 reached their opponent, 6240 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491997. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.0 | 129 / 210 | 2.08 | 18.5% | 24238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 18.5% | 129 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 21 |
| nat.PallasHawk 1.0 | 2.8 | 13.3% | 28 |
| darkcanuck.Leon 1.01 | 3.8 | 12.1% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 8 |
| jrm.Test0 1.0 | 6.0 | 8.5% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.7% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.3% | 3 |
| stuff.Vlad 0.1 | 9.0 | 5.5% | 2 |
| jaybot.bots.Oddball 4.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.8 | 22 / 35 | 4062 |
| 2 | 1 | 67.9 | 88.3 | 21 / 35 | 4029 |
| 3 | 1 | 67.4 | 84.4 | 22 / 35 | 3994 |
| 4 | 1 | 66.9 | 86.3 | 20 / 35 | 3585 |
| 5 | 1 | 69.9 | 94.0 | 24 / 35 | 4318 |
| 6 | 1 | 68.0 | 85.1 | 20 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 87% |
| nat.PallasHawk 1.0 | 41 | 73% |
| darkcanuck.Leon 1.01 | 40 | 85% |
| brainfade.melee.Genghis 0.36 | 12 | 83% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 3 | 67% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 21 | 25% | 59 |
| nat.PallasHawk 1.0 | 19 | 23% | 46 |
| jrm.Test0 1.0 | 13 | 16% | 19 |
| brainfade.melee.Genghis 0.36 | 12 | 14% | 21 |
| darkcanuck.Leon 1.01 | 11 | 13% | 45 |
| jp.Perpy 16.0 | 3 | 4% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 127953 melee ticks, 35777 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44191 sent, 39311 reached their opponent, 6604 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479447. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.7 | 60 / 210 | 2.82 | 15.8% | 25759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 44 |
| mn.Combat 3.25.0 | 2.0 | 16.2% | 82 |
| hadur117.Hadur 3.21n4 | 2.3 | 15.8% | 60 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 16 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 7 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.2% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 78.4 | 14 / 35 | 4312 |
| 2 | 3 | 64.7 | 79.4 | 6 / 35 | 4424 |
| 3 | 3 | 65.4 | 80.3 | 9 / 35 | 4362 |
| 4 | 3 | 64.2 | 76.8 | 9 / 35 | 4207 |
| 5 | 2 | 65.4 | 83.2 | 10 / 35 | 4084 |
| 6 | 1 | 65.1 | 80.3 | 12 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 49 | 59% |
| mn.Combat 3.25.0 | 45 | 31% |
| shinh.Entangled 0.3 | 19 | 53% |
| gh.micro.Gruweltje 0.7 | 6 | 83% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 54 | 36% | 82 |
| mn.Combat 3.25.0 | 49 | 33% | 63 |
| shinh.Entangled 0.3 | 22 | 15% | 31 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 19 |
| stelo.Wang 1.0 | 6 | 4% | 8 |
| maribo.FollowFire 1 | 3 | 2% | 4 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 137096 melee ticks, 42324 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40706 sent, 35733 reached their opponent, 5792 virtual hits (16.2% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475905. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 98.2 | 193 / 210 | 1.14 | 24.6% | 37569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 24.6% | 193 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.1% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 4.2 | 10.5% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 4.2 | 10.8% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 10.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.5 | 9.7% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 1 |
| pa.Improved 1.0 | 8.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 99.3 | 33 / 35 | 6787 |
| 2 | 1 | 72.6 | 94.6 | 30 / 35 | 6295 |
| 3 | 1 | 72.9 | 98.2 | 31 / 35 | 6034 |
| 4 | 1 | 73.4 | 98.9 | 34 / 35 | 6010 |
| 5 | 1 | 72.9 | 98.2 | 30 / 35 | 6010 |
| 6 | 1 | 74.2 | 100.0 | 35 / 35 | 6433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 119 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 31 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 31 | 90% |
| Lo_Ian.Gandalf_V4 4.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |

Hadur died in 17 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 9 | 53% | 101 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 24% | 37 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 12% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 12% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 7 |
| pa.Improved 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 129465 melee ticks, 55106 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38198 sent, 34207 reached their opponent, 8552 virtual hits (25.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478807. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.7 | 128 / 210 | 2.02 | 19.8% | 33035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.8% | 128 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 17 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 36 |
| mld.DustBunny 3.8 | 3.8 | 11.9% | 11 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 2 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 13 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.2% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.0 | 21 / 35 | 5572 |
| 2 | 1 | 68.0 | 81.3 | 15 / 35 | 5415 |
| 3 | 1 | 70.5 | 90.8 | 23 / 35 | 5608 |
| 4 | 1 | 71.8 | 93.0 | 27 / 35 | 5744 |
| 5 | 1 | 69.8 | 89.2 | 21 / 35 | 5517 |
| 6 | 1 | 70.0 | 90.8 | 21 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 57 | 61% |
| kawigi.micro.Shiz 1.1 | 43 | 95% |
| mld.DustBunny 3.8 | 22 | 82% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 39% | 84 |
| kawigi.micro.Shiz 1.1 | 12 | 15% | 43 |
| cb.nano.Insomnia 1.0 | 12 | 15% | 17 |
| mld.DustBunny 3.8 | 11 | 13% | 29 |
| kawigi.robot.Girl 1.2 | 9 | 11% | 17 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |

Posture (Hadur's M records, 202 rounds): 162821 melee ticks, 52785 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 50 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 53740 sent, 48933 reached their opponent, 8104 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488748. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.1 | 126 / 210 | 1.80 | 20.4% | 35399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.4% | 126 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 39 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 33 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.5% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 24 / 35 | 5886 |
| 2 | 1 | 71.5 | 93.0 | 21 / 35 | 6040 |
| 3 | 1 | 70.6 | 89.8 | 17 / 35 | 6063 |
| 4 | 1 | 69.8 | 88.6 | 19 / 35 | 5378 |
| 5 | 1 | 69.7 | 88.9 | 19 / 35 | 5607 |
| 6 | 1 | 72.7 | 94.0 | 26 / 35 | 6425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 76% |
| techdude.forest.FlamingForest 1.1 | 34 | 47% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 91% |
| bvh.fnr.Fenrir 0.36l | 8 | 75% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1256. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 29 | 34% | 90 |
| techdude.forest.FlamingForest 1.1 | 23 | 27% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 15% | 32 |
| bvh.fnr.Fenrir 0.36l | 9 | 11% | 16 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 8 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 175213 melee ticks, 72477 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56129 sent, 51482 reached their opponent, 8707 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489410. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.1 | 120 / 210 | 2.16 | 19.6% | 35397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.6% | 120 |
| et.Predator 1.8 | 2.5 | 13.6% | 15 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.3% | 38 |
| cx.BlestPain 1.41 | 4.0 | 12.2% | 29 |
| ahf.NanoAndrew .4 | 5.7 | 9.4% | 3 |
| nic.Nicator 2.4 | 5.8 | 9.1% | 3 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.0% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.7 | 21 / 35 | 5642 |
| 2 | 1 | 70.7 | 88.6 | 22 / 35 | 6092 |
| 3 | 1 | 69.3 | 84.8 | 19 / 35 | 5813 |
| 4 | 1 | 71.5 | 92.1 | 22 / 35 | 6435 |
| 5 | 1 | 69.9 | 87.6 | 19 / 35 | 6047 |
| 6 | 1 | 68.0 | 83.2 | 17 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 75% |
| et.Predator 1.8 | 47 | 85% |
| cx.BlestPain 1.41 | 34 | 47% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| ahf.NanoAndrew .4 | 8 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 5 | 100% |
| nic.Nicator 2.4 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 23 | 26% | 62 |
| cx.BlestPain 1.41 | 23 | 26% | 43 |
| oog.melee.Mercutio 1.0 | 19 | 21% | 55 |
| ahf.NanoAndrew .4 | 11 | 12% | 19 |
| maribo.melee.BMV 0.1 | 8 | 9% | 11 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| nic.Nicator 2.4 | 2 | 2% | 9 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 156887 melee ticks, 61729 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 82 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52035 sent, 47407 reached their opponent, 10025 virtual hits (21.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478851. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 253 over 6 battles (42.2 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.6 | 161 / 210 | 1.59 | 22.4% | 28518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 22.4% | 161 |
| agd.Mooserwirt2 2.7 | 2.2 | 14.1% | 22 |
| uji.DBH 1.1 | 2.8 | 13.4% | 13 |
| sigterm.Sigterm 1.0 | 4.2 | 10.5% | 8 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.8% | 4 |
| ratosh.Nobo 0.21 | 6.0 | 9.4% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 8.6% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.0% | 0 |
| stelo.WangRobot 1.0 | 8.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.6 | 28 / 35 | 4812 |
| 2 | 1 | 70.6 | 92.5 | 29 / 35 | 4800 |
| 3 | 1 | 71.0 | 95.4 | 31 / 35 | 4643 |
| 4 | 1 | 69.2 | 87.9 | 24 / 35 | 4673 |
| 5 | 1 | 69.5 | 91.4 | 23 / 35 | 4726 |
| 6 | 1 | 71.1 | 93.9 | 26 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 58 | 88% |
| agd.Mooserwirt2 2.7 | 54 | 89% |
| sigterm.Sigterm 1.0 | 32 | 84% |
| spinnercat.Robovirus 2.718 | 15 | 93% |
| ratosh.Nobo 0.21 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 86% |
| stelo.WangRobot 1.0 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 14 | 29% | 49 |
| agd.Mooserwirt2 2.7 | 13 | 27% | 62 |
| sigterm.Sigterm 1.0 | 10 | 20% | 30 |
| spinnercat.Robovirus 2.718 | 4 | 8% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 6% | 16 |
| ratosh.Nobo 0.21 | 2 | 4% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 7 |
| stelo.WangRobot 1.0 | 1 | 2% | 9 |

Posture (Hadur's M records, 198 rounds): 130890 melee ticks, 40022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40086 sent, 35994 reached their opponent, 7943 virtual hits (22.1% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482460. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 98.1 | 193 / 210 | 1.17 | 22.4% | 36995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 22.4% | 193 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 9 |
| mld.Infinity 2.2 | 3.7 | 11.7% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 1 |
| erdnis.Rover 0.3 | 4.3 | 11.0% | 1 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.3% | 1 |
| mbh.Mbh 0.1 | 6.8 | 7.4% | 0 |
| pac.ABC 2.1 | 8.0 | 6.3% | 2 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 96.5 | 32 / 35 | 6366 |
| 2 | 1 | 73.5 | 97.5 | 31 / 35 | 6308 |
| 3 | 1 | 73.3 | 99.0 | 33 / 35 | 5977 |
| 4 | 1 | 74.2 | 100.0 | 35 / 35 | 6227 |
| 5 | 1 | 73.3 | 98.7 | 32 / 35 | 6088 |
| 6 | 1 | 73.3 | 97.1 | 30 / 35 | 6029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 96% |
| krillr.mini.JointStrike 2.0.0 | 27 | 100% |
| mld.Infinity 2.2 | 20 | 100% |
| erdnis.Rover 0.3 | 16 | 94% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 39% | 71 |
| krillr.mini.JointStrike 2.0.0 | 6 | 33% | 34 |
| patson.PatsonTestBot 1.0 | 3 | 17% | 22 |
| erdnis.Rover 0.3 | 1 | 6% | 25 |
| pac.ABC 2.1 | 1 | 6% | 13 |
| mld.Infinity 2.2 | 0 | 0% | 18 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |

Posture (Hadur's M records, 200 rounds): 127861 melee ticks, 44768 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42381 sent, 37790 reached their opponent, 8848 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481290. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.4 | 136 / 210 | 1.78 | 20.8% | 36960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.8% | 136 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 39 |
| catcat20.Rabbit 0.001 | 3.5 | 11.5% | 21 |
| fwb.Nine 1.0.1 | 3.8 | 11.3% | 7 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.3% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 4.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 19 / 35 | 5931 |
| 2 | 1 | 70.2 | 88.6 | 17 / 35 | 6173 |
| 3 | 1 | 72.3 | 93.0 | 27 / 35 | 6607 |
| 4 | 1 | 71.8 | 91.7 | 26 / 35 | 6153 |
| 5 | 1 | 70.9 | 90.8 | 24 / 35 | 5757 |
| 6 | 1 | 71.4 | 91.4 | 23 / 35 | 6339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 74% |
| fwb.Nine 1.0.1 | 45 | 98% |
| catcat20.Rabbit 0.001 | 30 | 60% |
| nz.jdc.nano.GridFu 1.0 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 0% |

Hadur died in 74 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 46% | 96 |
| catcat20.Rabbit 0.001 | 19 | 26% | 46 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 18 |
| fwb.Nine 1.0.1 | 6 | 8% | 23 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 10 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 10 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 164223 melee ticks, 57648 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50986 sent, 46376 reached their opponent, 10455 virtual hits (22.5% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489563. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.9 | 132 / 210 | 1.73 | 20.7% | 36648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.7% | 132 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 66 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 3 |
| eld.Hmm 1.0 | 5.0 | 8.3% | 4 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.6% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.5% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 23 / 35 | 6084 |
| 2 | 1 | 70.0 | 88.3 | 20 / 35 | 5887 |
| 3 | 1 | 71.1 | 90.8 | 22 / 35 | 5999 |
| 4 | 1 | 72.1 | 94.3 | 24 / 35 | 6329 |
| 5 | 1 | 72.0 | 92.4 | 22 / 35 | 6224 |
| 6 | 1 | 71.2 | 91.4 | 21 / 35 | 6125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 135 | 62% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 19 | 95% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 2 | 50% |

Hadur died in 79 of 210 rounds, at a mean tick of 1376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 71% | 111 |
| dummy.mini.Scimitar 1.01 | 6 | 8% | 41 |
| eld.Hmm 1.0 | 5 | 6% | 26 |
| cf.RiO.RiOx 4.2.1 | 5 | 6% | 15 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 10 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 168370 melee ticks, 82937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49715 sent, 45179 reached their opponent, 7804 virtual hits (17.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467147. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.3 | 109 / 210 | 1.94 | 20.5% | 27105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.5% | 109 |
| pe.SandboxDT 2.71m | 2.0 | 17.3% | 59 |
| kvk.HebusLeTroll 0.35 | 3.0 | 16.2% | 27 |
| jlm.javaDisturbance 0.59 | 4.3 | 13.2% | 10 |
| bigpete.Stewie 1.0 | 4.7 | 11.1% | 4 |
| yk.JahRoslav 1.1 | 6.7 | 6.3% | 1 |
| tad.Dalek98 0.98 | 7.0 | 5.8% | 0 |
| gg.Squaraus 0.6 | 7.3 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.0 | 17 / 35 | 4400 |
| 2 | 1 | 69.5 | 90.4 | 20 / 35 | 4456 |
| 3 | 1 | 68.5 | 86.1 | 14 / 35 | 4614 |
| 4 | 1 | 70.8 | 91.8 | 23 / 35 | 4865 |
| 5 | 1 | 69.6 | 87.9 | 20 / 35 | 4747 |
| 6 | 1 | 68.1 | 88.6 | 15 / 35 | 4023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 59 | 69% |
| pe.SandboxDT 2.71m | 55 | 47% |
| jlm.javaDisturbance 0.59 | 32 | 84% |
| bigpete.Stewie 1.0 | 13 | 92% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 40% | 76 |
| kvk.HebusLeTroll 0.35 | 30 | 30% | 59 |
| jlm.javaDisturbance 0.59 | 21 | 21% | 41 |
| bigpete.Stewie 1.0 | 4 | 4% | 16 |
| yk.JahRoslav 1.1 | 4 | 4% | 7 |
| tad.Dalek98 0.98 | 1 | 1% | 5 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 150415 melee ticks, 47142 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44915 sent, 40733 reached their opponent, 5667 virtual hits (13.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481698. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 97.4 | 179 / 210 | 1.24 | 22.5% | 39121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 22.5% | 179 |
| pe.SandboxLump 1.52 | 2.0 | 16.0% | 27 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.4% | 0 |
| sample.Walls 1.0 | 8.0 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 98.7 | 32 / 35 | 6895 |
| 2 | 1 | 73.4 | 97.1 | 29 / 35 | 6327 |
| 3 | 1 | 72.6 | 94.9 | 24 / 35 | 6181 |
| 4 | 1 | 74.2 | 97.8 | 33 / 35 | 6731 |
| 5 | 1 | 73.8 | 97.8 | 31 / 35 | 6460 |
| 6 | 1 | 73.5 | 97.8 | 30 / 35 | 6527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 117 | 86% |
| cre.Karolos 0.32 | 44 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 25 | 81% | 103 |
| cre.Karolos 0.32 | 3 | 10% | 47 |
| stelo.AreaTargetingBot 1.1 | 2 | 6% | 16 |
| stelo.RamTrackSurfer 1.2 | 1 | 3% | 23 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 6 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 120476 melee ticks, 51687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 70 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38304 sent, 33731 reached their opponent, 10027 virtual hits (29.7% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478875. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.8 | 88 / 210 | 2.55 | 17.1% | 25022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 17.1% | 88 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.4% | 38 |
| florent.XSeries.X2 0.12 | 3.2 | 13.5% | 24 |
| davidalves.Phoenix 0.54 | 3.2 | 13.3% | 37 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.8% | 18 |
| oog.melee.Corsair 1.0 | 5.8 | 9.7% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.2% | 1 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.8% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.3% | 0 |
| evd.X1 0.01 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 78.7 | 8 / 35 | 4010 |
| 2 | 1 | 67.7 | 87.0 | 15 / 35 | 4470 |
| 3 | 1 | 65.9 | 80.6 | 16 / 35 | 4080 |
| 4 | 1 | 67.6 | 84.8 | 19 / 35 | 4338 |
| 5 | 1 | 66.9 | 84.4 | 17 / 35 | 4039 |
| 6 | 1 | 65.6 | 81.0 | 13 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 37 | 57% |
| florent.XSeries.X2 0.12 | 32 | 69% |
| rz.GlowBlowMelee 1.4 | 30 | 60% |
| pedersen.Ugluk 1.1.1 | 19 | 63% |
| oog.melee.Corsair 1.0 | 11 | 82% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 27% | 53 |
| florent.XSeries.X2 0.12 | 31 | 25% | 52 |
| davidalves.Phoenix 0.54 | 27 | 22% | 49 |
| pedersen.Ugluk 1.1.1 | 15 | 12% | 22 |
| oog.melee.Corsair 1.0 | 5 | 4% | 16 |
| as.FrankTheTank 1.3 | 4 | 3% | 4 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 135830 melee ticks, 37913 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 62 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45338 sent, 40381 reached their opponent, 7364 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468601. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.4 | 146 / 210 | 1.85 | 20.9% | 22168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.9% | 146 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 15.0% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 13.8% | 16 |
| jdw.Hurricane 1.4 | 3.7 | 13.0% | 19 |
| ds.Oo 2.2 | 5.0 | 9.9% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 3 |
| adt.Ar2 1.1 | 7.2 | 7.3% | 1 |
| gjr.Cephalosporin 0.1 | 7.5 | 6.8% | 1 |
| amk.ChumbaMini 0.2 | 9.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 24 / 35 | 3850 |
| 2 | 1 | 68.7 | 90.0 | 22 / 35 | 3721 |
| 3 | 1 | 70.9 | 96.4 | 31 / 35 | 3714 |
| 4 | 1 | 69.3 | 90.7 | 26 / 35 | 3860 |
| 5 | 1 | 65.8 | 82.5 | 19 / 35 | 3165 |
| 6 | 1 | 68.8 | 88.9 | 24 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 84% |
| voidious.micro.BlitzBat 1.05 | 44 | 89% |
| jdw.Hurricane 1.4 | 39 | 90% |
| ds.Oo 2.2 | 18 | 94% |
| awesomeness.Elite 1.0 | 6 | 83% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 17 | 26% | 43 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 25% | 46 |
| voidious.micro.BlitzBat 1.05 | 16 | 25% | 42 |
| ds.Oo 2.2 | 5 | 8% | 35 |
| awesomeness.Elite 1.0 | 5 | 8% | 14 |
| adt.Ar2 1.1 | 3 | 5% | 11 |
| amk.ChumbaMini 0.2 | 3 | 5% | 9 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |

Posture (Hadur's M records, 200 rounds): 121957 melee ticks, 31610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39994 sent, 35731 reached their opponent, 5975 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475272. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.3 | 156 / 210 | 1.51 | 21.7% | 40844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.7% | 156 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 26 |
| shu.nitro.LENIN .T34 | 3.5 | 12.0% | 14 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 8 |
| js.PinBall 1.6 | 5.2 | 10.4% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.3 | 25 / 35 | 6580 |
| 2 | 1 | 72.0 | 93.0 | 23 / 35 | 6485 |
| 3 | 1 | 73.7 | 96.2 | 27 / 35 | 7475 |
| 4 | 1 | 72.9 | 94.3 | 27 / 35 | 6698 |
| 5 | 1 | 73.6 | 97.5 | 29 / 35 | 6751 |
| 6 | 1 | 72.4 | 91.4 | 25 / 35 | 6855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 78 | 79% |
| lrem.Spectre 0.4.4 | 40 | 90% |
| shu.nitro.LENIN .T34 | 39 | 90% |
| js.PinBall 1.6 | 12 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 24 | 44% | 81 |
| shu.nitro.LENIN .T34 | 11 | 20% | 47 |
| lrem.Spectre 0.4.4 | 8 | 15% | 35 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 13% | 17 |
| js.PinBall 1.6 | 4 | 7% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 6 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 151118 melee ticks, 48133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 28 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 25 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 49343 sent, 44804 reached their opponent, 11269 virtual hits (25.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475419. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.8 | 157 / 210 | 2.10 | 20.0% | 32776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.2 | 20.0% | 157 |
| mk.Alpha 0.2.1 | 2.0 | 13.9% | 36 |
| EH.Eagle 1.0.6 | 4.3 | 10.3% | 4 |
| wee.Gem 1.8.4 | 5.3 | 9.0% | 8 |
| throxbot.ThroxBot 0.1 | 5.5 | 9.3% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.1% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.6% | 0 |
| joe.ADinosaur 1.0 | 7.0 | 8.4% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.5 | 31 / 35 | 5473 |
| 2 | 1 | 71.8 | 97.1 | 31 / 35 | 5560 |
| 3 | 2 | 63.1 | 63.8 | 17 / 35 | 4961 |
| 4 | 1 | 71.7 | 96.2 | 29 / 35 | 5559 |
| 5 | 1 | 68.1 | 75.9 | 21 / 35 | 5803 |
| 6 | 1 | 71.7 | 97.1 | 28 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 96 | 84% |
| EH.Eagle 1.0.6 | 31 | 100% |
| throxbot.ThroxBot 0.1 | 15 | 93% |
| wee.Gem 1.8.4 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 40% | 84 |
| cs.Grudge 1.0 | 9 | 17% | 11 |
| EH.Eagle 1.0.6 | 5 | 9% | 38 |
| joe.ADinosaur 1.0 | 5 | 9% | 15 |
| wee.Gem 1.8.4 | 4 | 8% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 15 |
| throxbot.ThroxBot 0.1 | 2 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 9 |

Posture (Hadur's M records, 198 rounds): 120789 melee ticks, 37873 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39840 sent, 35255 reached their opponent, 8823 virtual hits (25.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480258. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.3 | 131 / 210 | 2.05 | 18.5% | 25096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 18.5% | 131 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 31 |
| uji.Antique 1.0 | 3.0 | 12.7% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 3 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 10.3% | 8 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.1% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 89.5 | 20 / 35 | 3890 |
| 2 | 1 | 68.9 | 91.4 | 23 / 35 | 4166 |
| 3 | 1 | 67.1 | 83.2 | 21 / 35 | 4374 |
| 4 | 1 | 68.5 | 89.2 | 20 / 35 | 4423 |
| 5 | 1 | 70.5 | 95.6 | 28 / 35 | 4352 |
| 6 | 1 | 65.6 | 81.0 | 19 / 35 | 3891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 86% |
| uji.Antique 1.0 | 49 | 78% |
| qohnil.blot.BlotBot 3.61 | 16 | 75% |
| ahr.ice.Ice 1.0.2 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| amk.ChumbaWumba 0.3 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 18 | 23% | 53 |
| uji.Antique 1.0 | 18 | 23% | 48 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 23 |
| qohnil.blot.BlotBot 3.61 | 11 | 14% | 35 |
| amk.ChumbaWumba 0.3 | 10 | 13% | 19 |
| matt.advanced.Katana 1.0 | 3 | 4% | 12 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 14 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 126810 melee ticks, 32868 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42933 sent, 38299 reached their opponent, 5509 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467603. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.0 | 126 / 210 | 1.81 | 20.1% | 30325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.1% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.4% | 46 |
| deewiant.Anomaly 0.2 | 3.2 | 14.0% | 24 |
| myl.micro.Troodon 1.10 | 4.0 | 12.1% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 2 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.6% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.7% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.1% | 1 |
| jangs.ns51 1.0 | 9.5 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 22 / 35 | 4822 |
| 2 | 1 | 70.1 | 87.3 | 18 / 35 | 5399 |
| 3 | 1 | 70.8 | 91.1 | 21 / 35 | 5232 |
| 4 | 1 | 72.5 | 94.3 | 26 / 35 | 5592 |
| 5 | 1 | 70.0 | 89.8 | 20 / 35 | 4546 |
| 6 | 1 | 69.8 | 89.2 | 19 / 35 | 4734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 77% |
| zyx.mega.YersiniaPestis 3.1 | 61 | 57% |
| myl.micro.Troodon 1.10 | 28 | 86% |
| jok.PheonixM 0.1.2 | 15 | 93% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 37 | 44% | 76 |
| deewiant.Anomaly 0.2 | 26 | 31% | 77 |
| myl.micro.Troodon 1.10 | 9 | 11% | 22 |
| jok.PheonixM 0.1.2 | 6 | 7% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 6 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 162717 melee ticks, 57437 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 52702 sent, 48043 reached their opponent, 7338 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477340. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.2 | 81 / 210 | 2.35 | 19.1% | 26564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.1% | 81 |
| darkcanuck.B26354 1.06 | 2.3 | 16.1% | 66 |
| oog.melee.Capulet 1.2 | 3.2 | 14.5% | 24 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.8% | 23 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.9% | 7 |
| tripphippy.Alice 1.1 | 6.3 | 8.9% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.1% | 6 |
| ntc.Opposite 1.5 | 7.2 | 7.7% | 1 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.1 | 14 / 35 | 4653 |
| 2 | 1 | 68.0 | 85.4 | 15 / 35 | 4728 |
| 3 | 1 | 64.6 | 77.9 | 10 / 35 | 4282 |
| 4 | 1 | 65.4 | 80.4 | 11 / 35 | 4004 |
| 5 | 1 | 68.5 | 86.8 | 18 / 35 | 4801 |
| 6 | 1 | 66.9 | 86.4 | 13 / 35 | 4096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 44% |
| oog.melee.Capulet 1.2 | 29 | 69% |
| stelo.PastFuture 2.3.2 | 17 | 59% |
| intruder.PrairieWolf 2.61 | 15 | 80% |
| tripphippy.Alice 1.1 | 11 | 91% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 44% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 54 | 42% | 80 |
| oog.melee.Capulet 1.2 | 28 | 22% | 49 |
| stelo.PastFuture 2.3.2 | 22 | 17% | 31 |
| tripphippy.Alice 1.1 | 8 | 6% | 19 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 19 |
| ntc.Opposite 1.5 | 5 | 4% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 4% | 6 |

Posture (Hadur's M records, 201 rounds): 166173 melee ticks, 44678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47823 sent, 43500 reached their opponent, 7511 virtual hits (17.3% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478561. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.6 | 71 / 210 | 2.56 | 16.8% | 24275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.5 | 16.8% | 71 |
| abc.Shadow 3.84i | 1.5 | 17.3% | 73 |
| gh.mini.Griezel 0.2 | 3.0 | 14.2% | 44 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.5% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.6% | 10 |
| gh.nano.Grofvuil 0.2 | 6.0 | 7.9% | 1 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.3 | 5.2% | 0 |
| fm.mammillarias 1.3 | 8.8 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.5 | 15 / 35 | 3855 |
| 2 | 2 | 64.2 | 79.4 | 8 / 35 | 3714 |
| 3 | 1 | 67.7 | 87.3 | 12 / 35 | 4257 |
| 4 | 1 | 67.1 | 83.2 | 16 / 35 | 4219 |
| 5 | 2 | 65.1 | 79.4 | 9 / 35 | 4083 |
| 6 | 2 | 66.3 | 84.1 | 11 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 51% |
| gh.mini.Griezel 0.2 | 43 | 51% |
| d414.nano.Quantum 1.0.0 | 12 | 75% |
| spinnercat.micro.Tyger 0.1 | 8 | 50% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 139 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 40% | 84 |
| gh.mini.Griezel 0.2 | 42 | 30% | 72 |
| spinnercat.micro.Tyger 0.1 | 21 | 15% | 23 |
| d414.nano.Quantum 1.0.0 | 9 | 6% | 15 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 6 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 4 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 154101 melee ticks, 37654 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49144 sent, 44318 reached their opponent, 7225 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499353. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.2 | 132 / 210 | 1.79 | 19.3% | 29316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.3% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 50 |
| apc.botM 3.0 | 3.3 | 11.6% | 16 |
| lxx.ConceptA 0.8 | 4.2 | 10.3% | 2 |
| vjik.UnViolation 1.1 | 4.7 | 9.6% | 2 |
| bayen.UbaMicro 1.4 | 6.2 | 8.4% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 3 |
| conscience.Electron 1.3g | 8.5 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.5 | 26 / 35 | 4875 |
| 2 | 1 | 69.1 | 92.7 | 22 / 35 | 4854 |
| 3 | 1 | 70.0 | 93.3 | 25 / 35 | 4973 |
| 4 | 1 | 68.1 | 90.2 | 18 / 35 | 4894 |
| 5 | 1 | 69.8 | 92.4 | 22 / 35 | 5235 |
| 6 | 1 | 67.5 | 88.3 | 19 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 60% |
| apc.botM 3.0 | 33 | 85% |
| lxx.ConceptA 0.8 | 18 | 89% |
| vjik.UnViolation 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| yk.JahMicro 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 6 | 67% |
| conscience.Electron 1.3g | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 54% | 84 |
| lxx.ConceptA 0.8 | 14 | 18% | 22 |
| apc.botM 3.0 | 9 | 11% | 50 |
| panzer.Panzer 0.2 | 4 | 5% | 7 |
| vjik.UnViolation 1.1 | 3 | 4% | 25 |
| donjezza.Jezza 1.0 | 3 | 4% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 8 |
| bayen.UbaMicro 1.4 | 1 | 1% | 7 |
| conscience.Electron 1.3g | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 126048 melee ticks, 51727 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 66 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 41661 sent, 37047 reached their opponent, 6909 virtual hits (18.6% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474597. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.8 | 130 / 210 | 1.90 | 21.7% | 29048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.7% | 130 |
| maribo.Quester 0.3 | 2.0 | 17.5% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.4% | 30 |
| labg.Cataclysm 2.05 | 3.8 | 12.3% | 17 |
| baal.nano.N 1.42 | 5.0 | 10.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 9.2% | 2 |
| zyx.micro.Ant 1.1 | 7.3 | 6.1% | 1 |
| sanja.First 0.1 | 7.7 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.3 | 19 / 35 | 4856 |
| 2 | 1 | 70.2 | 90.7 | 20 / 35 | 4670 |
| 3 | 1 | 70.3 | 86.8 | 21 / 35 | 4932 |
| 4 | 1 | 70.3 | 89.6 | 22 / 35 | 4812 |
| 5 | 1 | 70.5 | 89.6 | 24 / 35 | 4597 |
| 6 | 1 | 71.4 | 91.4 | 24 / 35 | 5181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 69% |
| labg.Cataclysm 2.05 | 22 | 64% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| baal.nano.N 1.42 | 5 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 26 | 32% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 30% | 50 |
| labg.Cataclysm 2.05 | 18 | 22% | 35 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 6% | 11 |
| zyx.micro.Ant 1.1 | 4 | 5% | 7 |
| baal.nano.N 1.42 | 3 | 4% | 11 |
| sanja.First 0.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 161677 melee ticks, 56888 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 55 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 47132 sent, 42972 reached their opponent, 6462 virtual hits (15.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478264. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.1 | 113 / 210 | 1.90 | 19.4% | 32564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.4% | 113 |
| stelo.Spread 0.9 | 2.5 | 16.2% | 53 |
| kid.Gladiator .7.2 | 2.5 | 16.2% | 34 |
| tcf.Reach 3 | 4.5 | 10.7% | 2 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 10 |
| cli.Dancer 1.1 | 6.0 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 18 / 35 | 5355 |
| 2 | 1 | 70.3 | 89.8 | 17 / 35 | 5494 |
| 3 | 1 | 70.7 | 91.1 | 20 / 35 | 5638 |
| 4 | 1 | 70.9 | 91.1 | 19 / 35 | 5532 |
| 5 | 1 | 70.7 | 88.6 | 20 / 35 | 5580 |
| 6 | 1 | 69.7 | 89.5 | 19 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 77 | 68% |
| kid.Gladiator .7.2 | 51 | 75% |
| jcs.Seth 1.8 | 22 | 82% |
| tcf.Reach 3 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 40 | 40% | 84 |
| kid.Gladiator .7.2 | 38 | 38% | 72 |
| jcs.Seth 1.8 | 10 | 10% | 30 |
| tcf.Reach 3 | 6 | 6% | 14 |
| cli.Dancer 1.1 | 1 | 1% | 4 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 0 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 172002 melee ticks, 58368 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 52431 sent, 47633 reached their opponent, 7675 virtual hits (16.1% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500409. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.4 | 54 / 210 | 2.31 | 16.8% | 24169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 134 |
| hadur117.Hadur 3.21n4 | 2.0 | 16.8% | 54 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.7% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 5 |
| rz.HawkOnFire 0.1 | 4.7 | 11.1% | 3 |
| wit.Chuliath 1.0 | 6.3 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.2% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 87.3 | 10 / 35 | 4031 |
| 2 | 2 | 65.5 | 81.3 | 9 / 35 | 4073 |
| 3 | 2 | 66.2 | 85.1 | 8 / 35 | 4144 |
| 4 | 2 | 65.9 | 86.0 | 7 / 35 | 3927 |
| 5 | 2 | 66.5 | 88.3 | 8 / 35 | 3939 |
| 6 | 2 | 66.5 | 84.4 | 12 / 35 | 4055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 20% |
| gh.mini.Gruwel 0.9 | 24 | 54% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 80% |
| rz.HawkOnFire 0.1 | 13 | 77% |

Hadur died in 157 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 61% | 117 |
| gh.mini.Gruwel 0.9 | 29 | 18% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 8% | 22 |
| rz.HawkOnFire 0.1 | 11 | 7% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 142854 melee ticks, 58789 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44285 sent, 39502 reached their opponent, 6113 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1506431. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 222 over 6 battles (37.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.3 | 171 / 210 | 1.51 | 21.6% | 34616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.6% | 171 |
| alpha.RainingFire 1.0 | 2.5 | 12.1% | 7 |
| bzdp.Pansy 2.1 | 3.3 | 11.6% | 10 |
| mz.Cork 0.1 | 3.8 | 11.1% | 11 |
| bvh.micro.Freya 0.3 | 5.0 | 10.4% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.6% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.5% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 24 / 35 | 5529 |
| 2 | 1 | 73.3 | 98.1 | 31 / 35 | 6124 |
| 3 | 1 | 72.0 | 94.0 | 30 / 35 | 5818 |
| 4 | 1 | 72.4 | 96.5 | 29 / 35 | 5584 |
| 5 | 1 | 71.9 | 93.3 | 28 / 35 | 5709 |
| 6 | 1 | 71.9 | 94.0 | 29 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 41 | 88% |
| bzdp.Pansy 2.1 | 37 | 95% |
| alpha.RainingFire 1.0 | 37 | 89% |
| bvh.micro.Freya 0.3 | 31 | 90% |
| m3thos.Eva02 0.7.1 | 18 | 89% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 28% | 40 |
| bzdp.Pansy 2.1 | 8 | 21% | 43 |
| mz.Cork 0.1 | 6 | 15% | 43 |
| bvh.micro.Freya 0.3 | 6 | 15% | 21 |
| m3thos.Eva02 0.7.1 | 3 | 8% | 27 |
| bvh.mini.Fenrir 0.39 | 2 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 6 |
| dl.BetterWalls 1.0 | 1 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 138379 melee ticks, 49517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 54 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47786 sent, 43322 reached their opponent, 9178 virtual hits (21.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1617245. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 68). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.7 | 166 / 210 | 1.93 | 19.6% | 33954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.6% | 166 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.3% | 5 |
| germ.TheMind .2 | 4.3 | 9.7% | 7 |
| agrach.Dalek 1.0 | 4.7 | 9.3% | 9 |
| EBBU.Sim2 1.02 | 5.0 | 9.1% | 1 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.7% | 9 |
| lmk.ACPFinal 0.1 | 6.8 | 8.7% | 4 |
| mb.Beast 0.1 | 7.0 | 8.4% | 7 |
| skm.Ryubot 1.0 | 8.0 | 8.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.1 | 30 / 35 | 5922 |
| 2 | 1 | 69.6 | 92.7 | 28 / 35 | 5856 |
| 3 | 1 | 67.2 | 85.4 | 24 / 35 | 5361 |
| 4 | 1 | 69.9 | 94.6 | 31 / 35 | 5453 |
| 5 | 1 | 67.8 | 85.4 | 27 / 35 | 5516 |
| 6 | 1 | 68.5 | 88.9 | 26 / 35 | 5846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 100% |
| lmk.ACPFinal 0.1 | 24 | 96% |
| agrach.Dalek 1.0 | 24 | 100% |
| mb.Beast 0.1 | 22 | 100% |
| skm.Ryubot 1.0 | 22 | 100% |
| germ.TheMind .2 | 18 | 100% |
| stelo.UntouchableNano 1.3 | 18 | 83% |
| EBBU.Sim2 1.02 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 49 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 12 | 24% | 16 |
| stelo.UntouchableNano 1.3 | 7 | 14% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 10% | 36 |
| agrach.Dalek 1.0 | 5 | 10% | 31 |
| EBBU.Sim2 1.02 | 4 | 8% | 27 |
| lmk.ACPFinal 0.1 | 4 | 8% | 24 |
| mb.Beast 0.1 | 4 | 8% | 23 |
| germ.TheMind .2 | 3 | 6% | 12 |
| skm.Ryubot 1.0 | 0 | 0% | 11 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 98087 melee ticks, 26819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 33159 sent, 28575 reached their opponent, 8131 virtual hits (28.5% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1644665. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 6 battles (46.8 per battle, most in one battle 76). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.3 | 128 / 210 | 1.87 | 19.3% | 29691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 19.3% | 128 |
| justin.Mallais 14.0 | 2.0 | 16.0% | 51 |
| bts.mega.Gnarly 1.4 | 3.7 | 11.3% | 16 |
| bvh.mini.Freya 0.55 | 3.7 | 12.0% | 9 |
| cs.Wren 1.0 | 4.7 | 10.4% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.4% | 1 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.8% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 21 / 35 | 4966 |
| 2 | 1 | 68.0 | 87.3 | 15 / 35 | 4826 |
| 3 | 1 | 69.4 | 90.2 | 21 / 35 | 4974 |
| 4 | 1 | 70.9 | 93.7 | 24 / 35 | 5231 |
| 5 | 1 | 69.8 | 91.1 | 23 / 35 | 4755 |
| 6 | 1 | 69.8 | 91.1 | 24 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 89 | 69% |
| bvh.mini.Freya 0.55 | 27 | 85% |
| bts.mega.Gnarly 1.4 | 22 | 82% |
| cs.Wren 1.0 | 13 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 54% | 98 |
| bvh.mini.Freya 0.55 | 14 | 17% | 29 |
| bts.mega.Gnarly 1.4 | 10 | 12% | 35 |
| cs.Wren 1.0 | 6 | 7% | 22 |
| kdf.KoulDestroyer 1.0 | 4 | 5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 145467 melee ticks, 49564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 63 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 47519 sent, 42236 reached their opponent, 8930 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1586380. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 82). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.8 | 131 / 210 | 1.74 | 22.1% | 33711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 22.1% | 131 |
| bvh.fry.Freya 0.82 | 2.2 | 16.1% | 11 |
| az.Ololobot 0.2.4 | 2.8 | 15.1% | 60 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.5% | 2 |
| gimp.GimpBot 0.1 | 5.3 | 8.6% | 2 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 8.2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.3 | 5.9% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.9 | 26 / 35 | 5819 |
| 2 | 1 | 68.8 | 88.9 | 17 / 35 | 5229 |
| 3 | 1 | 70.8 | 91.4 | 23 / 35 | 5861 |
| 4 | 1 | 69.8 | 89.3 | 23 / 35 | 5296 |
| 5 | 1 | 70.6 | 91.8 | 24 / 35 | 5646 |
| 6 | 1 | 70.0 | 89.3 | 18 / 35 | 5860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 96 | 57% |
| bvh.fry.Freya 0.82 | 54 | 91% |
| winamp32.micro.MicroMacro 1.0 | 12 | 92% |
| gimp.GimpBot 0.1 | 9 | 100% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 75% |

Hadur died in 81 of 210 rounds, at a mean tick of 1170. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 54% | 96 |
| bvh.fry.Freya 0.82 | 21 | 26% | 54 |
| gimp.GimpBot 0.1 | 4 | 5% | 17 |
| apollokidd.ApolloKidd 0.9 | 4 | 5% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 4% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158169 melee ticks, 73445 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 121 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47032 sent, 42728 reached their opponent, 7868 virtual hits (18.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1561527. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 70). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.4 | 134 / 210 | 1.87 | 20.1% | 31892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.1% | 134 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.4% | 28 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 17 |
| mz.AntiGrav 1.0 | 4.3 | 11.2% | 8 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.9% | 6 |
| stelo.Randomness 1.0 | 6.0 | 9.4% | 14 |
| alpha.BlackIce 1.0 | 6.8 | 8.1% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.5% | 0 |
| sample.Corners 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.5 | 23 / 35 | 5102 |
| 2 | 1 | 71.1 | 92.4 | 24 / 35 | 5462 |
| 3 | 1 | 71.0 | 89.2 | 25 / 35 | 5405 |
| 4 | 1 | 69.7 | 89.2 | 17 / 35 | 5020 |
| 5 | 1 | 70.3 | 89.2 | 20 / 35 | 5345 |
| 6 | 1 | 71.5 | 92.7 | 25 / 35 | 5558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 80% |
| kano.gamma.KanoGamma 1.8 | 39 | 82% |
| mz.AntiGrav 1.0 | 23 | 91% |
| Polkwane.SmashMelee 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 14 | 57% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |

Hadur died in 80 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 22 | 28% | 55 |
| kano.gamma.KanoGamma 1.8 | 15 | 19% | 48 |
| mz.AntiGrav 1.0 | 13 | 16% | 28 |
| stelo.Randomness 1.0 | 12 | 15% | 27 |
| Polkwane.SmashMelee 1.0 | 8 | 10% | 31 |
| alpha.BlackIce 1.0 | 3 | 4% | 9 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 7 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155894 melee ticks, 41862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 123 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 123 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51220 sent, 46244 reached their opponent, 9447 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1589955. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 6 battles (33.7 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.0 | 87 / 210 | 2.26 | 17.9% | 27424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.3 | 17.9% | 87 |
| eem.EvBotNG v12.8 | 1.7 | 17.4% | 102 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.7% | 6 |
| ary.Swarm 1.1 | 3.8 | 12.5% | 7 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 6 |
| shrub.Silver v048 | 6.0 | 8.5% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 5.6% | 1 |
| stelo.Mirror 1.1 | 9.0 | 4.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 82.9 | 12 / 35 | 4150 |
| 2 | 1 | 66.6 | 81.6 | 15 / 35 | 4060 |
| 3 | 1 | 69.8 | 90.5 | 17 / 35 | 4918 |
| 4 | 1 | 68.5 | 87.0 | 14 / 35 | 4691 |
| 5 | 2 | 66.7 | 81.6 | 14 / 35 | 4389 |
| 6 | 1 | 70.1 | 92.4 | 15 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 96 | 30% |
| lessonz.robocode.Oz 0.5.0 | 26 | 100% |
| ary.Swarm 1.1 | 17 | 94% |
| simonton.nano.MeleeSeed 1.8 | 9 | 100% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 91 | 74% | 121 |
| ary.Swarm 1.1 | 12 | 10% | 25 |
| lessonz.robocode.Oz 0.5.0 | 10 | 8% | 31 |
| simonton.nano.MeleeSeed 1.8 | 6 | 5% | 17 |
| shrub.Silver v048 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 209 rounds): 156064 melee ticks, 61893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 51 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 51274 sent, 46203 reached their opponent, 7276 virtual hits (15.7% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1554826. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 363 over 6 battles (60.5 per battle, most in one battle 92). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.1 | 151 / 210 | 1.71 | 20.6% | 35138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.6% | 151 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.9% | 9 |
| ara.Shera 0.88 | 4.0 | 12.6% | 14 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 0 |
| maribo.IotaCT 1.1 | 6.5 | 6.4% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 26 / 35 | 5970 |
| 2 | 1 | 71.6 | 93.7 | 25 / 35 | 5958 |
| 3 | 1 | 71.8 | 95.6 | 27 / 35 | 5942 |
| 4 | 1 | 70.6 | 88.3 | 25 / 35 | 5941 |
| 5 | 1 | 71.5 | 93.0 | 25 / 35 | 5812 |
| 6 | 1 | 69.8 | 88.6 | 23 / 35 | 5515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 90% |
| maribo.mini.MiniQuester 0.1 | 50 | 92% |
| ara.Shera 0.88 | 26 | 77% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 20 | 30% | 96 |
| ara.Shera 0.88 | 18 | 27% | 44 |
| maribo.mini.MiniQuester 0.1 | 14 | 21% | 57 |
| dsw.StaticD 1.0 | 4 | 6% | 7 |
| amz.NanoClone 1.41 | 2 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 2% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 168615 melee ticks, 50807 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 70 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 53087 sent, 48165 reached their opponent, 9417 virtual hits (19.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1563873. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.6 | 53 / 210 | 2.39 | 17.0% | 25688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 134 |
| hadur117.Hadur 3.21n4 | 2.0 | 17.0% | 53 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.4% | 16 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.4% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.5% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 84.4 | 7 / 35 | 4269 |
| 2 | 2 | 66.2 | 81.0 | 6 / 35 | 4047 |
| 3 | 2 | 68.5 | 85.1 | 12 / 35 | 4394 |
| 4 | 2 | 67.3 | 84.1 | 8 / 35 | 4318 |
| 5 | 2 | 68.0 | 86.7 | 11 / 35 | 4203 |
| 6 | 2 | 68.3 | 86.3 | 9 / 35 | 4457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 26% |
| brainfade.melee.Dusk 0.44 | 21 | 62% |
| dummy.micro.Sparrow 2.5 | 9 | 89% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |

Hadur died in 158 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 63% | 126 |
| brainfade.melee.Dusk 0.44 | 26 | 16% | 40 |
| dummy.micro.Sparrow 2.5 | 12 | 8% | 19 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 6 | 4% | 10 |
| Krabb.akim2.Akim2 1.1b | 4 | 3% | 6 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160773 melee ticks, 57648 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 128 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51142 sent, 46138 reached their opponent, 7678 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1557095. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 301 over 6 battles (50.2 per battle, most in one battle 96). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 93.8 | 150 / 210 | 1.56 | 21.3% | 36176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.3% | 150 |
| stelo.Liblix 0.3.1 | 2.0 | 16.1% | 43 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.5% | 0 |
| jwirde.Gort 2.0 | 5.0 | 9.1% | 1 |
| disan.Chair 2.2.0 | 6.2 | 7.9% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.7% | 2 |
| wompi.Quokka 1.6 | 7.3 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.0 | 24 / 35 | 5831 |
| 2 | 1 | 70.2 | 89.8 | 23 / 35 | 5562 |
| 3 | 1 | 74.0 | 98.1 | 32 / 35 | 6771 |
| 4 | 1 | 71.3 | 92.4 | 19 / 35 | 5988 |
| 5 | 1 | 72.4 | 95.6 | 26 / 35 | 5877 |
| 6 | 1 | 72.4 | 94.0 | 26 / 35 | 6147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 101 | 73% |
| tzu.TheArtOfWar 1.2 | 57 | 89% |
| disan.Chair 2.2.0 | 9 | 100% |
| jwirde.Gort 2.0 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 56% | 113 |
| tzu.TheArtOfWar 1.2 | 11 | 17% | 55 |
| jwirde.Gort 2.0 | 4 | 6% | 15 |
| stf.PanzerGeneral 0.1 | 4 | 6% | 4 |
| disan.Chair 2.2.0 | 2 | 3% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 3% | 7 |
| sample.Crazy 1.0 | 1 | 2% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161875 melee ticks, 57073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 62 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 54314 sent, 49514 reached their opponent, 10296 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21n4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1574866. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 6 battles (46.0 per battle, most in one battle 67). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.2 | 130 / 210 | 1.80 | 20.7% | 34190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 20.7% | 130 |
| jje.BagPuss 1.2 | 2.0 | 12.9% | 10 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 8 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 9 |
| eem.IWillFireNoBullet v2.8 | 4.5 | 10.7% | 49 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 2 |
| hvilela.HVilela 0.9 | 6.8 | 8.1% | 0 |
| fm.claire 1.7 | 7.3 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 4.9% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 23 / 35 | 5367 |
| 2 | 1 | 71.3 | 92.4 | 20 / 35 | 6213 |
| 3 | 1 | 71.3 | 93.7 | 22 / 35 | 5734 |
| 4 | 1 | 69.8 | 87.0 | 20 / 35 | 5383 |
| 5 | 1 | 71.5 | 93.3 | 24 / 35 | 5775 |
| 6 | 1 | 70.0 | 86.7 | 21 / 35 | 5718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 55% |
| jje.BagPuss 1.2 | 37 | 78% |
| myl.nano.Graviton 1.10 | 26 | 92% |
| sul.Lunar 1.1 | 25 | 96% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 31 | 38% | 0 |
| jje.BagPuss 1.2 | 20 | 24% | 69 |
| myl.nano.Graviton 1.10 | 11 | 13% | 36 |
| sul.Lunar 1.1 | 10 | 12% | 52 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 6% | 27 |
| hvilela.HVilela 0.9 | 2 | 2% | 7 |
| fm.claire 1.7 | 1 | 1% | 10 |
| wit.Deep7 2.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 201476 melee ticks, 79739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 55 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 61632 sent, 56724 reached their opponent, 8502 virtual hits (15.0% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21n4 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1560647. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 291 over 6 battles (48.5 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.8 | 137 / 210 | 1.66 | 21.5% | 29065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n4 | 1.0 | 21.5% | 137 |
| kc.mini.Mirage 0.2 | 2.0 | 19.1% | 56 |
| mz.MicroSheep 1.0 | 3.5 | 12.3% | 3 |
| cx.Princess 1.0 | 3.7 | 12.2% | 11 |
| sadoner.killer 0.2 | 4.8 | 10.4% | 1 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.0% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.2 | 7.2% | 0 |
| kurios.DOSexe .9a | 7.7 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.4 | 23 / 35 | 4781 |
| 2 | 1 | 70.0 | 91.4 | 23 / 35 | 4840 |
| 3 | 1 | 69.9 | 92.1 | 24 / 35 | 4626 |
| 4 | 1 | 70.6 | 93.6 | 23 / 35 | 5046 |
| 5 | 1 | 69.1 | 88.2 | 19 / 35 | 4739 |
| 6 | 1 | 71.0 | 95.0 | 25 / 35 | 5033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 129 | 74% |
| cx.Princess 1.0 | 24 | 79% |
| mz.MicroSheep 1.0 | 17 | 94% |
| arthord.NanoSatanMelee Beta | 5 | 60% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 42 | 56% | 139 |
| cx.Princess 1.0 | 11 | 15% | 25 |
| sadoner.killer 0.2 | 10 | 13% | 15 |
| mz.MicroSheep 1.0 | 6 | 8% | 19 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 7 |
| kurios.DOSexe .9a | 0 | 0% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141232 melee ticks, 57371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 39198 sent, 34946 reached their opponent, 5698 virtual hits (16.3% of those reached).

