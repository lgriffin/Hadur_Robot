# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487153. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.6 | 51 / 210 | 2.30 | 17.5% | 32247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 135 |
| hadur117.Hadur 3.21bb | 2.0 | 17.5% | 51 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.4% | 3 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 1 |
| mz.MicroGodMelee 1 | 5.7 | 9.9% | 2 |
| adt.Ar2 1.0 | 7.2 | 6.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 85.1 | 8 / 35 | 5334 |
| 2 | 2 | 67.5 | 83.5 | 6 / 35 | 5712 |
| 3 | 2 | 68.3 | 87.9 | 12 / 35 | 5148 |
| 4 | 2 | 66.2 | 82.5 | 4 / 35 | 5433 |
| 5 | 2 | 67.2 | 84.8 | 12 / 35 | 5043 |
| 6 | 2 | 68.6 | 89.8 | 9 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 13% |
| sgp.JollyNinja 3.53 | 16 | 69% |
| mz.MicroGodMelee 1 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1160. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 75% | 137 |
| sgp.JollyNinja 3.53 | 18 | 11% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 15 |
| mz.MicroGodMelee 1 | 7 | 4% | 16 |
| lorneswork.Predator 1.0 | 6 | 4% | 10 |
| adt.Ar2 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 139511 melee ticks, 86935 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44012 sent, 39374 reached their opponent, 8173 virtual hits (20.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478595. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.4 | 108 / 210 | 1.95 | 19.3% | 31087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.3% | 108 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.5% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.8% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.4% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 19 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 7.9% | 3 |
| sch.Simone 0.3d | 7.0 | 7.3% | 3 |
| Noran.BitchingElk 0.054 | 7.7 | 7.5% | 8 |
| stelo.PatternRobot 1.0 | 8.8 | 5.1% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 15 / 35 | 4915 |
| 2 | 1 | 69.2 | 89.2 | 16 / 35 | 5002 |
| 3 | 1 | 71.0 | 91.7 | 24 / 35 | 5720 |
| 4 | 1 | 69.3 | 88.3 | 19 / 35 | 5238 |
| 5 | 1 | 67.5 | 85.4 | 14 / 35 | 4810 |
| 6 | 1 | 70.4 | 91.7 | 20 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 71 | 54% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 67% |
| Noran.BitchingElk 0.054 | 16 | 56% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| sch.Simone 0.3d | 9 | 89% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 44% | 76 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 18% | 44 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 18% | 35 |
| Noran.BitchingElk 0.054 | 7 | 7% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 16 |
| sch.Simone 0.3d | 4 | 4% | 13 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 5 |
| stelo.PatternRobot 1.0 | 0 | 0% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 164352 melee ticks, 47582 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57634 sent, 52916 reached their opponent, 8856 virtual hits (16.7% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473084. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 172 over 6 battles (28.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.9 | 180 / 210 | 1.55 | 21.3% | 39163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 180 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 11 |
| vuen.Cake 2.51 | 3.2 | 12.7% | 15 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 4 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.3 | 30 / 35 | 6905 |
| 2 | 1 | 71.6 | 94.6 | 28 / 35 | 6436 |
| 3 | 1 | 72.3 | 95.6 | 32 / 35 | 6487 |
| 4 | 1 | 71.5 | 94.3 | 31 / 35 | 6410 |
| 5 | 1 | 70.3 | 89.2 | 27 / 35 | 6156 |
| 6 | 1 | 72.4 | 95.2 | 32 / 35 | 6769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 91% |
| radnor.DoctorBob 1.42 | 58 | 100% |
| kawigi.nano.Lib 1.0 | 47 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 10 | 33% | 71 |
| radnor.DoctorBob 1.42 | 10 | 33% | 56 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 17% | 10 |
| kawigi.nano.Lib 1.0 | 3 | 10% | 43 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 7% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 9 |
| urdos.URDOS 1.3 | 0 | 0% | 7 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 125891 melee ticks, 44586 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 101 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 101 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38162 sent, 33563 reached their opponent, 8593 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481986. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.2 | 36 / 210 | 2.15 | 18.0% | 34630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 158 |
| hadur117.Hadur 3.21bb | 2.0 | 18.0% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 11.0% | 10 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 84.1 | 7 / 35 | 5681 |
| 2 | 2 | 68.1 | 85.7 | 3 / 35 | 5590 |
| 3 | 2 | 69.5 | 89.8 | 6 / 35 | 5910 |
| 4 | 2 | 69.2 | 88.9 | 7 / 35 | 5764 |
| 5 | 2 | 68.3 | 85.7 | 4 / 35 | 5659 |
| 6 | 2 | 69.8 | 88.9 | 9 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 15% |
| apc.LeeroyJenkins2 1.0 | 12 | 75% |
| TNT.TNT 0.99.1 | 10 | 40% |
| josago.Jorgito 0.16 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 1299. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 75% | 154 |
| TNT.TNT 0.99.1 | 19 | 11% | 22 |
| apc.LeeroyJenkins2 1.0 | 16 | 9% | 24 |
| josago.Jorgito 0.16 | 6 | 3% | 7 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 184674 melee ticks, 77330 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 43 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56982 sent, 52344 reached their opponent, 7791 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481215. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.3 | 39 / 210 | 2.68 | 16.1% | 25651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.2% | 93 |
| justin.DemonicRage 3.4 | 1.8 | 16.8% | 63 |
| hadur117.Hadur 3.21bb | 2.7 | 16.1% | 39 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 10 |
| ms.Ares 0.19 | 5.2 | 9.7% | 3 |
| axeBots.HataMoto 3.09 | 5.8 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.2 | 83.5 | 6 / 35 | 4365 |
| 2 | 3 | 64.5 | 77.8 | 6 / 35 | 3963 |
| 3 | 2 | 66.5 | 84.1 | 7 / 35 | 4396 |
| 4 | 3 | 63.4 | 75.6 | 6 / 35 | 4020 |
| 5 | 2 | 67.4 | 83.8 | 9 / 35 | 4743 |
| 6 | 3 | 65.6 | 83.2 | 5 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 55 | 31% |
| cb.fire.Firestarter 2.0f | 42 | 14% |
| wompi.Numbat 2.1 | 13 | 77% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 3 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 70 | 41% | 82 |
| cb.fire.Firestarter 2.0f | 63 | 37% | 75 |
| wompi.Numbat 2.1 | 24 | 14% | 31 |
| ms.Ares 0.19 | 7 | 4% | 10 |
| axeBots.HataMoto 3.09 | 4 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 155658 melee ticks, 44422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 97 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 47450 sent, 42605 reached their opponent, 6980 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474965. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.2 | 146 / 210 | 1.70 | 20.6% | 34799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.6% | 146 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 18 |
| origin.SleepSiphon 1.7b | 2.7 | 13.6% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 10 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 1 |
| gg.Wolverine 2.0 | 6.2 | 7.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 6.8% | 4 |
| DBall.NUKE 0.1 | 8.5 | 5.6% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 25 / 35 | 5875 |
| 2 | 1 | 71.3 | 94.0 | 26 / 35 | 5574 |
| 3 | 1 | 72.4 | 94.9 | 28 / 35 | 6038 |
| 4 | 1 | 70.2 | 88.6 | 21 / 35 | 5825 |
| 5 | 1 | 71.3 | 91.7 | 23 / 35 | 5996 |
| 6 | 1 | 70.7 | 90.5 | 23 / 35 | 5491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 89% |
| origin.SleepSiphon 1.7b | 55 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 93% |
| gg.Wolverine 2.0 | 9 | 100% |
| mld.Wisdom 1.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 38% | 74 |
| jekl.StoneGhost 0.7 | 22 | 33% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 11% | 42 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 8 |
| mld.Wisdom 1.0 | 3 | 5% | 17 |
| gg.Wolverine 2.0 | 1 | 2% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 147808 melee ticks, 47411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 72 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45288 sent, 40740 reached their opponent, 8919 virtual hits (21.9% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486452. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 96.8 | 169 / 210 | 1.26 | 26.1% | 46165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 26.1% | 169 |
| rtk.Tachikoma 1.0 | 2.0 | 19.5% | 26 |
| franzor.Lizt 1.3.1 | 3.5 | 12.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 5.7 | 9.0% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.4% | 0 |
| sample.Target 1.0 | 8.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 97.1 | 29 / 35 | 7629 |
| 2 | 1 | 75.3 | 96.1 | 27 / 35 | 7684 |
| 3 | 1 | 75.5 | 97.1 | 29 / 35 | 7588 |
| 4 | 1 | 76.0 | 97.1 | 30 / 35 | 7979 |
| 5 | 1 | 75.5 | 96.8 | 28 / 35 | 7638 |
| 6 | 1 | 75.1 | 96.4 | 26 / 35 | 7647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 144 | 85% |
| oog.melee.CapuletDroid 1.1 | 27 | 81% |
| franzor.Lizt 1.3.1 | 26 | 85% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 28 | 68% | 151 |
| oog.melee.CapuletDroid 1.1 | 6 | 15% | 45 |
| franzor.Lizt 1.3.1 | 6 | 15% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 189071 melee ticks, 84944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52847 sent, 48924 reached their opponent, 10466 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476734. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 6 battles (45.2 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.8 | 150 / 210 | 1.50 | 23.0% | 31979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.0% | 150 |
| shrub.Vapour v159 | 2.5 | 14.9% | 28 |
| tm.Yuugao 1.0 | 2.5 | 15.6% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.4% | 2 |
| m3thos.Eva00 1.1 | 5.5 | 9.2% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 9.1% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 7.0% | 0 |
| SHAM.WOW 1.4 | 8.2 | 5.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.1 | 23 / 35 | 4884 |
| 2 | 1 | 73.2 | 96.8 | 28 / 35 | 5869 |
| 3 | 1 | 71.1 | 91.8 | 22 / 35 | 5682 |
| 4 | 1 | 70.6 | 92.5 | 24 / 35 | 4851 |
| 5 | 1 | 71.0 | 94.3 | 24 / 35 | 5245 |
| 6 | 1 | 72.1 | 95.4 | 29 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 77 | 81% |
| shrub.Vapour v159 | 65 | 72% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 100% |
| m3thos.Eva00 1.1 | 11 | 82% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 25 | 42% | 81 |
| shrub.Vapour v159 | 21 | 35% | 62 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 12% | 30 |
| m3thos.Eva00 1.1 | 4 | 7% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 3% | 15 |
| SHAM.WOW 1.4 | 1 | 2% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 148918 melee ticks, 50422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 38 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44704 sent, 40515 reached their opponent, 7745 virtual hits (19.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479545. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.7 | 46 / 210 | 3.19 | 15.0% | 21288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.7% | 108 |
| hadur117.Hadur 3.21bb | 2.2 | 15.0% | 46 |
| kc.micro.Figment 1.0 | 2.7 | 14.1% | 29 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.5% | 11 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 1 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 5 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 78.1 | 9 / 35 | 3288 |
| 2 | 2 | 63.6 | 79.7 | 5 / 35 | 3569 |
| 3 | 3 | 60.4 | 67.3 | 4 / 35 | 3396 |
| 4 | 1 | 65.5 | 82.5 | 9 / 35 | 4047 |
| 5 | 2 | 63.8 | 74.3 | 12 / 35 | 3821 |
| 6 | 3 | 61.4 | 72.1 | 7 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 22% |
| kc.micro.Figment 1.0 | 23 | 61% |
| pedersen.Grishnakh 1.0 | 12 | 67% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 41% | 81 |
| kc.micro.Figment 1.0 | 30 | 18% | 45 |
| mc2.enemy.Original 0.9 | 20 | 12% | 24 |
| yagami.Tidus 0.11 | 15 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 18 |
| dft.Calliope 5.6 | 6 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 5 | 3% | 6 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 142390 melee ticks, 36146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46625 sent, 42051 reached their opponent, 6092 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487414. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.6 | 179 / 210 | 1.31 | 21.2% | 34458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.2% | 179 |
| DTF.Kludgy 1.2b | 2.0 | 14.8% | 17 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 4 |
| ejb.Polaris 1.0.1 | 3.7 | 12.1% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 0 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.3% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.3 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.0% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.5 | 30 / 35 | 5802 |
| 2 | 1 | 71.8 | 96.8 | 29 / 35 | 5560 |
| 3 | 1 | 72.0 | 97.8 | 31 / 35 | 5649 |
| 4 | 1 | 70.8 | 92.1 | 26 / 35 | 5825 |
| 5 | 1 | 72.5 | 98.7 | 33 / 35 | 5764 |
| 6 | 1 | 72.2 | 97.5 | 30 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 80 | 89% |
| ejb.Polaris 1.0.1 | 49 | 88% |
| ne.Chimera 1.2 | 34 | 97% |
| vStar.RAFzilla 2.15 | 17 | 100% |
| tvv.micro.Antares 1.1.1 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 52% | 79 |
| ejb.Polaris 1.0.1 | 6 | 19% | 49 |
| ne.Chimera 1.2 | 5 | 16% | 37 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 8 |
| vStar.RAFzilla 2.15 | 1 | 3% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 139007 melee ticks, 59364 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 95 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45500 sent, 40911 reached their opponent, 7552 virtual hits (18.5% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471087. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.0 | 82 / 210 | 2.44 | 17.1% | 24681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.3 | 17.1% | 82 |
| rz.Aleph 0.34 | 1.7 | 16.5% | 73 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.1% | 16 |
| djc.DynaBot 0.1.1 | 4.5 | 10.6% | 10 |
| rdt199.Warlord 0.73 | 4.7 | 9.7% | 15 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 8 |
| uji.YellohFellah 1.0 | 6.7 | 8.2% | 6 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 88.6 | 16 / 35 | 4124 |
| 2 | 1 | 65.6 | 82.2 | 14 / 35 | 4132 |
| 3 | 2 | 63.4 | 76.2 | 9 / 35 | 4001 |
| 4 | 2 | 64.9 | 82.2 | 11 / 35 | 3784 |
| 5 | 1 | 66.8 | 86.3 | 15 / 35 | 4153 |
| 6 | 1 | 67.9 | 88.6 | 17 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 42% |
| cx.mini.Nimrod 0.55 | 24 | 75% |
| rdt199.Warlord 0.73 | 24 | 75% |
| uji.YellohFellah 1.0 | 13 | 85% |
| djc.DynaBot 0.1.1 | 11 | 82% |
| br2.MobyDickBot 1.6 | 7 | 71% |

Hadur died in 128 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 43% | 83 |
| cx.mini.Nimrod 0.55 | 23 | 18% | 33 |
| rdt199.Warlord 0.73 | 19 | 15% | 34 |
| djc.DynaBot 0.1.1 | 14 | 11% | 27 |
| uji.YellohFellah 1.0 | 6 | 5% | 14 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| br2.MobyDickBot 1.6 | 3 | 2% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 157446 melee ticks, 39618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50614 sent, 45837 reached their opponent, 6257 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484036. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.7 | 127 / 210 | 2.20 | 18.4% | 25235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.4% | 127 |
| nat.PallasHawk 1.0 | 2.5 | 13.8% | 38 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 21 |
| darkcanuck.Leon 1.01 | 3.8 | 12.3% | 10 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.0% | 9 |
| jrm.Test0 1.0 | 6.3 | 8.0% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.2% | 2 |
| jp.Perpy 16.0 | 8.0 | 6.5% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.3 | 19 / 35 | 4116 |
| 2 | 1 | 69.6 | 91.4 | 24 / 35 | 4388 |
| 3 | 1 | 67.3 | 85.1 | 19 / 35 | 4143 |
| 4 | 1 | 65.9 | 81.0 | 20 / 35 | 3664 |
| 5 | 1 | 69.3 | 88.9 | 24 / 35 | 4530 |
| 6 | 1 | 68.3 | 87.6 | 21 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 65% |
| bts.wiki.RipCurl 0.9b | 45 | 84% |
| darkcanuck.Leon 1.01 | 36 | 97% |
| brainfade.melee.Genghis 0.36 | 17 | 65% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 25 | 30% | 48 |
| bts.wiki.RipCurl 0.9b | 20 | 24% | 49 |
| darkcanuck.Leon 1.01 | 9 | 11% | 53 |
| brainfade.melee.Genghis 0.36 | 9 | 11% | 16 |
| jrm.Test0 1.0 | 9 | 11% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 11 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 7 |
| jp.Perpy 16.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 199 rounds): 126643 melee ticks, 36797 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43451 sent, 38641 reached their opponent, 6331 virtual hits (16.4% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477049. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.9 | 69 / 210 | 2.54 | 16.4% | 26080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.9% | 87 |
| hadur117.Hadur 3.21bb | 2.2 | 16.4% | 69 |
| ags.Glacier 0.2.11 | 2.3 | 16.2% | 31 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.4% | 7 |
| shinh.Entangled 0.3 | 4.5 | 12.1% | 16 |
| apc.Colossus2 0.17 | 6.2 | 7.6% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 15 / 35 | 4585 |
| 2 | 3 | 65.8 | 82.2 | 7 / 35 | 4318 |
| 3 | 2 | 66.0 | 82.2 | 15 / 35 | 4091 |
| 4 | 2 | 66.0 | 82.9 | 10 / 35 | 4314 |
| 5 | 2 | 66.2 | 81.0 | 15 / 35 | 4608 |
| 6 | 3 | 65.5 | 83.2 | 7 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 53 | 34% |
| ags.Glacier 0.2.11 | 43 | 70% |
| shinh.Entangled 0.3 | 19 | 68% |
| gh.micro.Gruweltje 0.7 | 9 | 67% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 53 | 37% | 79 |
| mn.Combat 3.25.0 | 51 | 36% | 72 |
| shinh.Entangled 0.3 | 19 | 13% | 29 |
| gh.micro.Gruweltje 0.7 | 10 | 7% | 18 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 5 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 149937 melee ticks, 43857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 90 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43168 sent, 38152 reached their opponent, 6012 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496173. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.5 | 180 / 210 | 1.36 | 23.9% | 36295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.9% | 180 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.6% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 3.5 | 11.3% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 10.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 10.3% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 9.2% | 4 |
| pa.Improved 1.0 | 8.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.1 | 32 / 35 | 6015 |
| 2 | 1 | 72.2 | 93.6 | 29 / 35 | 5840 |
| 3 | 1 | 72.6 | 95.4 | 29 / 35 | 6049 |
| 4 | 1 | 72.9 | 96.1 | 31 / 35 | 6257 |
| 5 | 1 | 73.2 | 96.4 | 31 / 35 | 6143 |
| 6 | 1 | 72.6 | 94.6 | 28 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 126 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 86% |
| sanyi.mikrobi.Roberto 1.0 | 19 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 50% | 115 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 17% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 13% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 10% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 10% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 12 |
| pa.Improved 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 127068 melee ticks, 48986 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 38094 sent, 34136 reached their opponent, 8901 virtual hits (26.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480664. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.7 | 134 / 210 | 1.83 | 20.2% | 33452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.2% | 134 |
| kawigi.micro.Shiz 1.1 | 2.0 | 13.7% | 11 |
| emp.Yngwie 1.11 | 3.2 | 12.5% | 43 |
| mld.DustBunny 3.8 | 4.0 | 12.2% | 4 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.2% | 12 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.6 | 27 / 35 | 5909 |
| 2 | 1 | 68.9 | 86.0 | 17 / 35 | 5287 |
| 3 | 1 | 71.4 | 93.3 | 24 / 35 | 5827 |
| 4 | 1 | 69.2 | 88.6 | 18 / 35 | 5299 |
| 5 | 1 | 69.0 | 86.3 | 20 / 35 | 5170 |
| 6 | 1 | 72.3 | 95.6 | 28 / 35 | 5960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 58% |
| kawigi.micro.Shiz 1.1 | 43 | 98% |
| mld.DustBunny 3.8 | 25 | 92% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 1 | 0% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 49% | 82 |
| mld.DustBunny 3.8 | 10 | 13% | 43 |
| kawigi.micro.Shiz 1.1 | 10 | 13% | 35 |
| cb.nano.Insomnia 1.0 | 7 | 9% | 14 |
| kawigi.robot.Girl 1.2 | 5 | 6% | 14 |
| divineomega.TrialBot 0.003 | 5 | 6% | 12 |
| lambdaxy.TBot 0.1 | 1 | 1% | 6 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 160447 melee ticks, 52644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 51 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52283 sent, 47713 reached their opponent, 7841 virtual hits (16.4% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480233. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.7 | 129 / 210 | 1.75 | 20.5% | 35523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.5% | 129 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.5% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 0 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.7% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.0% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 4.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 20 / 35 | 5672 |
| 2 | 1 | 70.4 | 91.7 | 20 / 35 | 5502 |
| 3 | 1 | 71.1 | 91.7 | 19 / 35 | 5881 |
| 4 | 1 | 72.9 | 95.2 | 25 / 35 | 6617 |
| 5 | 1 | 71.3 | 92.4 | 22 / 35 | 5909 |
| 6 | 1 | 71.1 | 91.1 | 23 / 35 | 5942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 67% |
| techdude.forest.FlamingForest 1.1 | 36 | 69% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 30 | 97% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1227. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 39 | 48% | 100 |
| techdude.forest.FlamingForest 1.1 | 20 | 24% | 40 |
| bvh.fnr.Fenrir 0.36l | 8 | 10% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 9% | 33 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 10 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 4 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 177932 melee ticks, 63267 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 30 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56424 sent, 51896 reached their opponent, 8536 virtual hits (16.4% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482695. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.4 | 115 / 210 | 1.95 | 19.8% | 35314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.8% | 115 |
| et.Predator 1.8 | 2.7 | 13.3% | 18 |
| cx.BlestPain 1.41 | 3.2 | 12.8% | 40 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.0% | 31 |
| ahf.NanoAndrew .4 | 5.5 | 9.8% | 4 |
| nic.Nicator 2.4 | 5.7 | 9.1% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.2 | 18 / 35 | 6049 |
| 2 | 1 | 70.4 | 89.2 | 17 / 35 | 6250 |
| 3 | 1 | 69.9 | 87.9 | 19 / 35 | 5896 |
| 4 | 1 | 69.4 | 87.3 | 17 / 35 | 5456 |
| 5 | 1 | 70.8 | 89.8 | 22 / 35 | 6076 |
| 6 | 1 | 70.9 | 93.0 | 22 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 71% |
| et.Predator 1.8 | 52 | 81% |
| cx.BlestPain 1.41 | 37 | 38% |
| ahf.NanoAndrew .4 | 8 | 100% |
| nic.Nicator 2.4 | 5 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |

Hadur died in 98 of 210 rounds, at a mean tick of 1108. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 31 | 32% | 46 |
| oog.melee.Mercutio 1.0 | 27 | 28% | 61 |
| et.Predator 1.8 | 19 | 19% | 62 |
| ahf.NanoAndrew .4 | 10 | 10% | 16 |
| maribo.melee.BMV 0.1 | 4 | 4% | 10 |
| nic.Nicator 2.4 | 3 | 3% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 168449 melee ticks, 56275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 38 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 54245 sent, 49524 reached their opponent, 10427 virtual hits (21.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486856. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 259 over 6 battles (43.2 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.0 | 149 / 210 | 1.64 | 22.2% | 28932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.2% | 149 |
| agd.Mooserwirt2 2.7 | 2.2 | 14.4% | 25 |
| uji.DBH 1.1 | 2.8 | 13.4% | 16 |
| sigterm.Sigterm 1.0 | 4.0 | 11.6% | 12 |
| ratosh.Nobo 0.21 | 5.7 | 9.6% | 1 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.6% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.0 | 7.9% | 4 |
| stelo.WangRobot 1.0 | 8.2 | 5.6% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.4 | 22 / 35 | 4793 |
| 2 | 1 | 70.6 | 92.9 | 25 / 35 | 5072 |
| 3 | 1 | 70.4 | 91.4 | 26 / 35 | 4888 |
| 4 | 1 | 70.7 | 94.3 | 25 / 35 | 4898 |
| 5 | 1 | 69.9 | 91.8 | 27 / 35 | 4535 |
| 6 | 1 | 69.7 | 91.1 | 24 / 35 | 4746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 53 | 81% |
| agd.Mooserwirt2 2.7 | 52 | 85% |
| sigterm.Sigterm 1.0 | 40 | 93% |
| ratosh.Nobo 0.21 | 10 | 90% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |

Hadur died in 63 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 20 | 32% | 46 |
| agd.Mooserwirt2 2.7 | 17 | 27% | 63 |
| sigterm.Sigterm 1.0 | 10 | 16% | 32 |
| ratosh.Nobo 0.21 | 6 | 10% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 8% | 13 |
| spinnercat.Robovirus 2.718 | 4 | 6% | 18 |
| stelo.WangRobot 1.0 | 1 | 2% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 8 |

Posture (Hadur's M records, 198 rounds): 129243 melee ticks, 52076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 39755 sent, 35655 reached their opponent, 8049 virtual hits (22.6% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492524. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.7 | 198 / 210 | 1.11 | 22.8% | 38620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.8% | 198 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.3% | 6 |
| mld.Infinity 2.2 | 2.8 | 12.2% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.2% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.2% | 0 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.3% | 1 |
| mbh.Mbh 0.1 | 6.7 | 7.9% | 0 |
| pac.ABC 2.1 | 8.2 | 6.1% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.8 | 31 / 35 | 6005 |
| 2 | 1 | 74.7 | 100.0 | 35 / 35 | 6920 |
| 3 | 1 | 74.1 | 99.7 | 34 / 35 | 6268 |
| 4 | 1 | 74.1 | 99.4 | 34 / 35 | 6679 |
| 5 | 1 | 73.7 | 97.8 | 32 / 35 | 6482 |
| 6 | 1 | 73.2 | 97.8 | 32 / 35 | 6266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 97% |
| mld.Infinity 2.2 | 27 | 96% |
| krillr.mini.JointStrike 2.0.0 | 25 | 100% |
| erdnis.Rover 0.3 | 17 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 12 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 42% | 73 |
| krillr.mini.JointStrike 2.0.0 | 4 | 33% | 33 |
| mld.Infinity 2.2 | 2 | 17% | 29 |
| patson.PatsonTestBot 1.0 | 1 | 8% | 22 |
| erdnis.Rover 0.3 | 0 | 0% | 24 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 126627 melee ticks, 41560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 51 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 42850 sent, 38319 reached their opponent, 8859 virtual hits (23.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470516. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.9 | 154 / 210 | 1.55 | 21.8% | 38949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.8% | 154 |
| trm.Wrekt 1.1.6.f | 2.0 | 14.6% | 20 |
| fwb.Nine 1.0.1 | 3.3 | 11.5% | 9 |
| catcat20.Rabbit 0.001 | 3.7 | 11.3% | 21 |
| nz.jdc.nano.GridFu 1.0 | 5.5 | 9.8% | 1 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.8% | 4 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.3 | 23 / 35 | 6157 |
| 2 | 1 | 72.3 | 93.0 | 25 / 35 | 6579 |
| 3 | 1 | 73.4 | 94.9 | 28 / 35 | 6986 |
| 4 | 1 | 72.2 | 94.0 | 27 / 35 | 6431 |
| 5 | 1 | 72.4 | 94.3 | 24 / 35 | 6513 |
| 6 | 1 | 72.1 | 93.7 | 27 / 35 | 6283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 87% |
| fwb.Nine 1.0.1 | 51 | 94% |
| catcat20.Rabbit 0.001 | 40 | 65% |
| nz.jdc.nano.GridFu 1.0 | 12 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 27 | 47% | 89 |
| catcat20.Rabbit 0.001 | 21 | 37% | 61 |
| fwb.Nine 1.0.1 | 4 | 7% | 14 |
| m3thos.mini.Eva01 0.5.5 | 2 | 4% | 12 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 16 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 159659 melee ticks, 60042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 83 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 49783 sent, 45217 reached their opponent, 10223 virtual hits (22.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479080. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.4 | 143 / 210 | 1.50 | 21.1% | 36182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.1% | 143 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 54 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.1% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.5% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.8 | 28 / 35 | 6235 |
| 2 | 1 | 70.8 | 93.3 | 23 / 35 | 5555 |
| 3 | 1 | 72.4 | 95.2 | 26 / 35 | 6102 |
| 4 | 1 | 71.8 | 93.3 | 18 / 35 | 6349 |
| 5 | 1 | 71.4 | 93.0 | 23 / 35 | 5941 |
| 6 | 1 | 72.2 | 94.6 | 25 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 133 | 67% |
| dummy.mini.Scimitar 1.01 | 34 | 88% |
| cf.RiO.RiOx 4.2.1 | 19 | 95% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 1419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 52 | 78% | 112 |
| dummy.mini.Scimitar 1.01 | 6 | 9% | 51 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 24 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| eld.Hmm 1.0 | 2 | 3% | 13 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 168594 melee ticks, 84479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 54 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 49984 sent, 45374 reached their opponent, 7736 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480643. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.1 | 102 / 210 | 1.80 | 20.7% | 27586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 102 |
| pe.SandboxDT 2.71m | 2.2 | 17.1% | 60 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.9% | 24 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.5% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 4 |
| gg.Squaraus 0.6 | 6.8 | 5.9% | 1 |
| yk.JahRoslav 1.1 | 7.0 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.7 | 17 / 35 | 4561 |
| 2 | 1 | 69.8 | 90.7 | 17 / 35 | 4760 |
| 3 | 1 | 68.8 | 87.1 | 16 / 35 | 4578 |
| 4 | 1 | 69.1 | 90.4 | 15 / 35 | 4477 |
| 5 | 1 | 68.5 | 89.6 | 17 / 35 | 4323 |
| 6 | 1 | 70.5 | 91.8 | 20 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 63 | 33% |
| kvk.HebusLeTroll 0.35 | 58 | 78% |
| jlm.javaDisturbance 0.59 | 32 | 69% |
| bigpete.Stewie 1.0 | 15 | 87% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 59 | 55% | 82 |
| kvk.HebusLeTroll 0.35 | 22 | 20% | 57 |
| jlm.javaDisturbance 0.59 | 21 | 19% | 48 |
| bigpete.Stewie 1.0 | 3 | 3% | 13 |
| tad.Dalek98 0.98 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 158209 melee ticks, 49453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46261 sent, 42112 reached their opponent, 5693 virtual hits (13.5% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477938. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 97.1 | 183 / 210 | 1.26 | 22.3% | 38917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.3% | 183 |
| pe.SandboxLump 1.52 | 2.2 | 16.0% | 20 |
| cre.Karolos 0.32 | 2.8 | 13.7% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.1% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.7 | 9.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.5% | 0 |
| cw.megas.Blade 0.8 | 7.2 | 7.8% | 0 |
| sample.Walls 1.0 | 7.7 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 99.0 | 32 / 35 | 5964 |
| 2 | 1 | 73.6 | 98.1 | 31 / 35 | 6585 |
| 3 | 1 | 73.4 | 95.9 | 29 / 35 | 6362 |
| 4 | 1 | 73.4 | 94.6 | 30 / 35 | 6522 |
| 5 | 1 | 73.3 | 96.2 | 29 / 35 | 6632 |
| 6 | 1 | 74.1 | 98.7 | 32 / 35 | 6852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 87% |
| cre.Karolos 0.32 | 58 | 100% |
| stelo.RamTrackSurfer 1.2 | 13 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 19 | 70% | 106 |
| cre.Karolos 0.32 | 5 | 19% | 51 |
| stelo.RamTrackSurfer 1.2 | 1 | 4% | 25 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 12 |
| sample.Walls 1.0 | 1 | 4% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 122881 melee ticks, 50979 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39177 sent, 34407 reached their opponent, 10119 virtual hits (29.4% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475107. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.0 | 91 / 210 | 2.35 | 17.5% | 25513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.5% | 91 |
| rz.GlowBlowMelee 1.4 | 2.7 | 14.4% | 41 |
| florent.XSeries.X2 0.12 | 3.2 | 13.3% | 21 |
| davidalves.Phoenix 0.54 | 3.5 | 12.8% | 38 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.5% | 11 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.4% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.5% | 1 |
| evd.X1 0.01 | 9.2 | 4.5% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.6 | 17 / 35 | 4079 |
| 2 | 1 | 66.9 | 85.4 | 13 / 35 | 4131 |
| 3 | 1 | 66.1 | 80.6 | 16 / 35 | 4296 |
| 4 | 1 | 67.0 | 86.0 | 16 / 35 | 4116 |
| 5 | 1 | 66.5 | 82.2 | 14 / 35 | 4259 |
| 6 | 1 | 68.1 | 87.0 | 15 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 57 | 58% |
| davidalves.Phoenix 0.54 | 31 | 52% |
| florent.XSeries.X2 0.12 | 25 | 68% |
| pedersen.Ugluk 1.1.1 | 22 | 77% |
| oog.melee.Corsair 1.0 | 7 | 86% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 35% | 65 |
| florent.XSeries.X2 0.12 | 29 | 24% | 50 |
| davidalves.Phoenix 0.54 | 29 | 24% | 46 |
| pedersen.Ugluk 1.1.1 | 12 | 10% | 23 |
| oog.melee.Corsair 1.0 | 5 | 4% | 21 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 138148 melee ticks, 42744 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45816 sent, 40779 reached their opponent, 7318 virtual hits (17.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486953. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.8 | 136 / 210 | 2.06 | 20.2% | 22122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.2% | 136 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.7% | 21 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 14.2% | 15 |
| jdw.Hurricane 1.4 | 3.8 | 12.5% | 22 |
| ds.Oo 2.2 | 5.0 | 10.8% | 8 |
| awesomeness.Elite 1.0 | 6.7 | 8.1% | 5 |
| adt.Ar2 1.1 | 6.7 | 7.8% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 6.8% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 88.6 | 23 / 35 | 3470 |
| 2 | 1 | 70.5 | 93.6 | 29 / 35 | 4020 |
| 3 | 1 | 66.1 | 82.5 | 22 / 35 | 3289 |
| 4 | 1 | 67.6 | 86.1 | 19 / 35 | 3954 |
| 5 | 1 | 68.7 | 88.9 | 25 / 35 | 3831 |
| 6 | 1 | 65.9 | 81.1 | 18 / 35 | 3558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 94% |
| voidious.micro.BlitzBat 1.05 | 47 | 91% |
| jdw.Hurricane 1.4 | 23 | 74% |
| ds.Oo 2.2 | 19 | 74% |
| awesomeness.Elite 1.0 | 9 | 78% |
| adt.Ar2 1.1 | 5 | 60% |
| gjr.Cephalosporin 0.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 16 | 22% | 49 |
| voidious.micro.BlitzBat 1.05 | 16 | 22% | 48 |
| ds.Oo 2.2 | 14 | 19% | 42 |
| jdw.Hurricane 1.4 | 10 | 14% | 27 |
| adt.Ar2 1.1 | 8 | 11% | 11 |
| awesomeness.Elite 1.0 | 5 | 7% | 14 |
| amk.ChumbaMini 0.2 | 3 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 11 |

Posture (Hadur's M records, 199 rounds): 117803 melee ticks, 28244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 28 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 28 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38320 sent, 34129 reached their opponent, 5578 virtual hits (16.3% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474551. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 94.2 | 157 / 210 | 1.52 | 21.6% | 40378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.6% | 157 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 22 |
| lrem.Spectre 0.4.4 | 3.2 | 12.3% | 16 |
| shu.nitro.LENIN .T34 | 4.2 | 11.7% | 11 |
| js.PinBall 1.6 | 5.0 | 10.4% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 8.9% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 3.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.7 | 26 / 35 | 6702 |
| 2 | 1 | 72.7 | 95.2 | 27 / 35 | 6679 |
| 3 | 1 | 72.5 | 92.7 | 26 / 35 | 6680 |
| 4 | 1 | 72.8 | 94.0 | 24 / 35 | 6926 |
| 5 | 1 | 73.2 | 96.8 | 29 / 35 | 6659 |
| 6 | 1 | 72.7 | 94.0 | 25 / 35 | 6732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 69 | 78% |
| lrem.Spectre 0.4.4 | 46 | 83% |
| shu.nitro.LENIN .T34 | 40 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| js.PinBall 1.6 | 11 | 91% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 47% | 74 |
| lrem.Spectre 0.4.4 | 14 | 25% | 45 |
| shu.nitro.LENIN .T34 | 7 | 13% | 51 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 7% | 9 |
| js.PinBall 1.6 | 3 | 5% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 9 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 154103 melee ticks, 50319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49781 sent, 45120 reached their opponent, 10899 virtual hits (24.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469653. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.2 | 173 / 210 | 1.52 | 20.9% | 31742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 173 |
| mk.Alpha 0.2.1 | 3.0 | 12.0% | 17 |
| EH.Eagle 1.0.6 | 3.0 | 10.9% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 9.7% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.2% | 1 |
| throxbot.ThroxBot 0.1 | 5.8 | 9.2% | 2 |
| wee.Gem 1.8.4 | 6.5 | 9.0% | 6 |
| joe.ADinosaur 1.0 | 7.0 | 8.5% | 1 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 25 / 35 | 4637 |
| 2 | 1 | 71.9 | 97.1 | 31 / 35 | 5419 |
| 3 | 1 | 69.4 | 91.4 | 25 / 35 | 4871 |
| 4 | 1 | 72.9 | 97.5 | 32 / 35 | 6322 |
| 5 | 1 | 71.6 | 96.5 | 30 / 35 | 5219 |
| 6 | 1 | 70.9 | 94.0 | 30 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 70 | 91% |
| EH.Eagle 1.0.6 | 44 | 98% |
| throxbot.ThroxBot 0.1 | 21 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 18 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 46% | 77 |
| joe.ADinosaur 1.0 | 5 | 14% | 8 |
| EH.Eagle 1.0.6 | 4 | 11% | 42 |
| throxbot.ThroxBot 0.1 | 4 | 11% | 22 |
| caimano.Furia_Ceca 0.22 | 3 | 8% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 5% | 20 |
| wee.Gem 1.8.4 | 2 | 5% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 20 |

Posture (Hadur's M records, 200 rounds): 128162 melee ticks, 38293 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42190 sent, 37352 reached their opponent, 9483 virtual hits (25.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473806. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.5 | 130 / 210 | 1.94 | 18.7% | 25099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 130 |
| kid.test.NightFox .2 | 2.2 | 14.6% | 28 |
| uji.Antique 1.0 | 2.8 | 12.7% | 27 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.0% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.5% | 2 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.6% | 4 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.4% | 6 |
| matt.advanced.Katana 1.0 | 8.2 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.6 | 28 / 35 | 4182 |
| 2 | 1 | 67.6 | 86.0 | 18 / 35 | 4179 |
| 3 | 1 | 67.6 | 89.2 | 22 / 35 | 3941 |
| 4 | 1 | 68.1 | 89.8 | 19 / 35 | 4267 |
| 5 | 1 | 69.1 | 91.4 | 23 / 35 | 4449 |
| 6 | 1 | 67.2 | 86.0 | 20 / 35 | 4081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 72 | 82% |
| uji.Antique 1.0 | 36 | 89% |
| qohnil.blot.BlotBot 3.61 | 21 | 81% |
| ahr.ice.Ice 1.0.2 | 10 | 70% |
| amk.ChumbaWumba 0.3 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 29% | 53 |
| uji.Antique 1.0 | 19 | 23% | 66 |
| qohnil.blot.BlotBot 3.61 | 11 | 13% | 30 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 16 |
| amk.ChumbaWumba 0.3 | 10 | 12% | 17 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 15 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 129460 melee ticks, 32937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 46 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43521 sent, 38764 reached their opponent, 5582 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486416. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.0 | 117 / 210 | 1.81 | 20.0% | 30981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.0% | 117 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 46 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.7% | 39 |
| myl.micro.Troodon 1.10 | 3.8 | 12.2% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.0% | 1 |
| ap.Frederick 1.1 | 8.7 | 4.8% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 18 / 35 | 5327 |
| 2 | 1 | 70.6 | 91.4 | 19 / 35 | 5162 |
| 3 | 1 | 70.4 | 89.5 | 20 / 35 | 5138 |
| 4 | 1 | 71.0 | 92.7 | 18 / 35 | 5071 |
| 5 | 1 | 69.9 | 88.6 | 19 / 35 | 4975 |
| 6 | 1 | 71.7 | 93.0 | 23 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 78 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 50% |
| myl.micro.Troodon 1.10 | 18 | 100% |
| jok.PheonixM 0.1.2 | 14 | 86% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 41% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 37 | 40% | 69 |
| myl.micro.Troodon 1.10 | 8 | 9% | 20 |
| jok.PheonixM 0.1.2 | 5 | 5% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 169272 melee ticks, 58790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 53137 sent, 48491 reached their opponent, 7182 virtual hits (14.8% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479769. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.5 | 72 / 210 | 2.56 | 18.4% | 25797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 18.4% | 72 |
| darkcanuck.B26354 1.06 | 2.2 | 16.3% | 64 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.5% | 23 |
| oog.melee.Capulet 1.2 | 3.3 | 14.7% | 30 |
| intruder.PrairieWolf 2.61 | 5.0 | 10.6% | 15 |
| tripphippy.Alice 1.1 | 6.8 | 8.1% | 3 |
| ntc.Opposite 1.5 | 6.8 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 6.8% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 19 / 35 | 5039 |
| 2 | 1 | 65.7 | 80.4 | 10 / 35 | 4441 |
| 3 | 1 | 65.1 | 79.3 | 13 / 35 | 4144 |
| 4 | 2 | 64.4 | 76.8 | 11 / 35 | 4041 |
| 5 | 1 | 66.1 | 80.7 | 10 / 35 | 4268 |
| 6 | 1 | 63.9 | 77.1 | 9 / 35 | 3864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 41% |
| oog.melee.Capulet 1.2 | 34 | 62% |
| stelo.PastFuture 2.3.2 | 28 | 64% |
| intruder.PrairieWolf 2.61 | 13 | 46% |
| tripphippy.Alice 1.1 | 7 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 25% |

Hadur died in 138 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 51 | 37% | 72 |
| stelo.PastFuture 2.3.2 | 30 | 22% | 48 |
| oog.melee.Capulet 1.2 | 22 | 16% | 43 |
| intruder.PrairieWolf 2.61 | 15 | 11% | 23 |
| tripphippy.Alice 1.1 | 9 | 7% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 6% | 8 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 157633 melee ticks, 39546 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 73 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46116 sent, 41838 reached their opponent, 7099 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481174. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.9 | 75 / 210 | 2.45 | 17.0% | 24151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.8% | 84 |
| hadur117.Hadur 3.21bb | 1.7 | 17.0% | 75 |
| gh.mini.Griezel 0.2 | 3.0 | 13.7% | 44 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.3% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.5% | 2 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.2% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 0 |
| fm.mammillarias 1.3 | 8.0 | 5.6% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 80.6 | 12 / 35 | 3711 |
| 2 | 2 | 66.3 | 83.5 | 9 / 35 | 4071 |
| 3 | 1 | 68.5 | 87.3 | 19 / 35 | 4348 |
| 4 | 2 | 65.8 | 83.2 | 10 / 35 | 3959 |
| 5 | 1 | 67.8 | 88.3 | 15 / 35 | 4194 |
| 6 | 2 | 65.2 | 80.3 | 10 / 35 | 3868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 71 | 46% |
| gh.mini.Griezel 0.2 | 31 | 48% |
| d414.nano.Quantum 1.0.0 | 16 | 94% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 69 | 51% | 102 |
| gh.mini.Griezel 0.2 | 32 | 24% | 54 |
| spinnercat.micro.Tyger 0.1 | 13 | 10% | 17 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 21 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 7 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 156098 melee ticks, 38063 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 55 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49407 sent, 44619 reached their opponent, 7083 virtual hits (15.9% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481593. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.5 | 127 / 210 | 1.77 | 19.2% | 29223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 55 |
| apc.botM 3.0 | 3.3 | 11.5% | 17 |
| vjik.UnViolation 1.1 | 4.5 | 10.2% | 5 |
| lxx.ConceptA 0.8 | 4.8 | 10.1% | 2 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 1 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 0 |
| conscience.Electron 1.3g | 8.0 | 6.4% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 94.0 | 25 / 35 | 4630 |
| 2 | 1 | 67.9 | 89.8 | 19 / 35 | 4432 |
| 3 | 1 | 69.4 | 93.0 | 24 / 35 | 5104 |
| 4 | 1 | 68.0 | 88.9 | 19 / 35 | 4895 |
| 5 | 1 | 70.0 | 93.7 | 23 / 35 | 5061 |
| 6 | 1 | 68.8 | 89.5 | 17 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 65% |
| apc.botM 3.0 | 30 | 73% |
| bayen.UbaMicro 1.4 | 14 | 93% |
| vjik.UnViolation 1.1 | 14 | 79% |
| lxx.ConceptA 0.8 | 12 | 92% |
| yk.JahMicro 1.0 | 5 | 60% |
| panzer.Panzer 0.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 39 | 46% | 90 |
| apc.botM 3.0 | 16 | 19% | 46 |
| lxx.ConceptA 0.8 | 12 | 14% | 20 |
| vjik.UnViolation 1.1 | 7 | 8% | 21 |
| conscience.Electron 1.3g | 4 | 5% | 4 |
| bayen.UbaMicro 1.4 | 3 | 4% | 17 |
| yk.JahMicro 1.0 | 2 | 2% | 7 |
| panzer.Panzer 0.2 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 123172 melee ticks, 50960 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 80 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 41788 sent, 37006 reached their opponent, 6822 virtual hits (18.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489193. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.3 | 134 / 210 | 1.78 | 22.0% | 29157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.0% | 134 |
| maribo.Quester 0.3 | 2.0 | 16.8% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.5% | 27 |
| labg.Cataclysm 2.05 | 4.0 | 11.9% | 12 |
| baal.nano.N 1.42 | 5.0 | 10.4% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.7% | 5 |
| zyx.micro.Ant 1.1 | 7.3 | 6.0% | 0 |
| sanja.First 0.1 | 7.7 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.8 | 26 / 35 | 4928 |
| 2 | 1 | 71.7 | 92.9 | 22 / 35 | 5112 |
| 3 | 1 | 68.7 | 87.9 | 18 / 35 | 4339 |
| 4 | 1 | 70.5 | 87.1 | 22 / 35 | 5161 |
| 5 | 1 | 69.3 | 86.1 | 19 / 35 | 4612 |
| 6 | 1 | 72.5 | 96.1 | 27 / 35 | 5005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 73% |
| labg.Cataclysm 2.05 | 27 | 78% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 6 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 38% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 26% | 54 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 14% | 19 |
| labg.Cataclysm 2.05 | 10 | 13% | 33 |
| baal.nano.N 1.42 | 6 | 8% | 14 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 163236 melee ticks, 59784 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 47794 sent, 43571 reached their opponent, 6671 virtual hits (15.3% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480209. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 6 battles (21.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.3 | 93 / 210 | 2.05 | 18.8% | 31832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.8% | 93 |
| stelo.Spread 0.9 | 2.5 | 16.5% | 59 |
| kid.Gladiator .7.2 | 2.5 | 16.5% | 43 |
| jcs.Seth 1.8 | 4.3 | 10.9% | 11 |
| tcf.Reach 3 | 4.8 | 10.6% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.0% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 16 / 35 | 5651 |
| 2 | 1 | 68.3 | 85.7 | 12 / 35 | 5066 |
| 3 | 1 | 70.6 | 88.9 | 17 / 35 | 5642 |
| 4 | 1 | 70.2 | 90.2 | 14 / 35 | 5482 |
| 5 | 1 | 69.8 | 88.9 | 17 / 35 | 5203 |
| 6 | 1 | 69.4 | 88.6 | 17 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 70 | 56% |
| kid.Gladiator .7.2 | 58 | 59% |
| jcs.Seth 1.8 | 20 | 65% |
| tcf.Reach 3 | 4 | 50% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1104. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 47 | 40% | 89 |
| kid.Gladiator .7.2 | 47 | 40% | 71 |
| jcs.Seth 1.8 | 12 | 10% | 26 |
| tcf.Reach 3 | 8 | 7% | 12 |
| cli.Dancer 1.1 | 2 | 2% | 8 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 164208 melee ticks, 59306 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 67 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 50687 sent, 45979 reached their opponent, 7622 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489128. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.5 | 59 / 210 | 2.30 | 16.8% | 24144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.3% | 129 |
| hadur117.Hadur 3.21bb | 2.0 | 16.8% | 59 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.3% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.9% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 5 |
| wit.Chuliath 1.0 | 6.8 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 84.1 | 9 / 35 | 3761 |
| 2 | 2 | 66.5 | 84.1 | 9 / 35 | 4240 |
| 3 | 2 | 67.7 | 87.6 | 11 / 35 | 4308 |
| 4 | 2 | 66.3 | 86.7 | 8 / 35 | 3908 |
| 5 | 2 | 66.4 | 84.4 | 12 / 35 | 4008 |
| 6 | 2 | 65.8 | 86.0 | 10 / 35 | 3919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 32% |
| gh.mini.Gruwel 0.9 | 16 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 73% |
| rz.HawkOnFire 0.1 | 11 | 82% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 95 | 63% | 127 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 13% | 31 |
| gh.mini.Gruwel 0.9 | 20 | 13% | 29 |
| rz.HawkOnFire 0.1 | 10 | 7% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 7 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 146985 melee ticks, 54395 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44680 sent, 39958 reached their opponent, 6149 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475261. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.2 | 164 / 210 | 1.43 | 21.5% | 33912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.5% | 164 |
| alpha.RainingFire 1.0 | 2.0 | 13.3% | 15 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 11 |
| mz.Cork 0.1 | 4.5 | 11.3% | 10 |
| bvh.micro.Freya 0.3 | 5.3 | 10.0% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.6% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.2 | 27 / 35 | 5634 |
| 2 | 1 | 70.4 | 89.2 | 23 / 35 | 5400 |
| 3 | 1 | 72.1 | 94.3 | 26 / 35 | 5875 |
| 4 | 1 | 72.8 | 97.8 | 30 / 35 | 5634 |
| 5 | 1 | 72.1 | 95.6 | 27 / 35 | 5647 |
| 6 | 1 | 72.9 | 98.4 | 31 / 35 | 5722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 85% |
| alpha.RainingFire 1.0 | 42 | 83% |
| mz.Cork 0.1 | 42 | 86% |
| bvh.micro.Freya 0.3 | 26 | 88% |
| bvh.mini.Fenrir 0.39 | 13 | 92% |
| m3thos.Eva02 0.7.1 | 12 | 83% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 28% | 46 |
| bzdp.Pansy 2.1 | 9 | 19% | 53 |
| mz.Cork 0.1 | 7 | 15% | 43 |
| bvh.micro.Freya 0.3 | 7 | 15% | 26 |
| bvh.mini.Fenrir 0.39 | 6 | 13% | 14 |
| m3thos.Eva02 0.7.1 | 3 | 6% | 17 |
| dl.BetterWalls 1.0 | 1 | 2% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 142367 melee ticks, 53127 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48755 sent, 44255 reached their opponent, 8924 virtual hits (20.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485765. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.8 | 164 / 210 | 1.83 | 19.8% | 34010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.8% | 164 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.3% | 6 |
| EBBU.Sim2 1.02 | 4.5 | 9.6% | 3 |
| germ.TheMind .2 | 4.5 | 9.4% | 5 |
| agrach.Dalek 1.0 | 4.8 | 9.3% | 6 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.0% | 10 |
| mb.Beast 0.1 | 5.7 | 9.1% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 7.0 | 8.4% | 1 |
| lmk.ACPFinal 0.1 | 8.5 | 7.9% | 3 |
| skm.Ryubot 1.0 | 9.7 | 7.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.4 | 28 / 35 | 5730 |
| 2 | 1 | 69.7 | 95.2 | 30 / 35 | 5580 |
| 3 | 1 | 69.3 | 90.5 | 30 / 35 | 5796 |
| 4 | 1 | 69.9 | 95.6 | 29 / 35 | 5443 |
| 5 | 1 | 67.2 | 85.7 | 21 / 35 | 5565 |
| 6 | 1 | 68.5 | 86.3 | 26 / 35 | 5896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 32 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 96% |
| germ.TheMind .2 | 24 | 96% |
| EBBU.Sim2 1.02 | 22 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 81% |
| mb.Beast 0.1 | 17 | 76% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 47 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 17% | 39 |
| stelo.UntouchableNano 1.3 | 8 | 17% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 17% | 15 |
| mb.Beast 0.1 | 7 | 15% | 21 |
| lmk.ACPFinal 0.1 | 6 | 13% | 22 |
| germ.TheMind .2 | 4 | 9% | 14 |
| agrach.Dalek 1.0 | 3 | 6% | 44 |
| EBBU.Sim2 1.02 | 3 | 6% | 19 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 93779 melee ticks, 25913 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 31503 sent, 27094 reached their opponent, 8061 virtual hits (29.8% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474843. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.7 | 122 / 210 | 1.92 | 19.2% | 30180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 122 |
| justin.Mallais 14.0 | 2.0 | 16.2% | 55 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 10 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.4% | 16 |
| cs.Wren 1.0 | 5.2 | 10.3% | 1 |
| kdf.KoulDestroyer 1.0 | 6.3 | 8.6% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.5% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.2% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 21 / 35 | 5052 |
| 2 | 1 | 70.4 | 92.4 | 23 / 35 | 5078 |
| 3 | 1 | 69.4 | 87.9 | 19 / 35 | 5092 |
| 4 | 1 | 68.6 | 87.0 | 20 / 35 | 4884 |
| 5 | 1 | 69.2 | 89.2 | 22 / 35 | 4727 |
| 6 | 1 | 69.7 | 90.2 | 17 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 88 | 67% |
| bts.mega.Gnarly 1.4 | 33 | 70% |
| bvh.mini.Freya 0.55 | 21 | 81% |
| cs.Wren 1.0 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 9 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 35 | 39% | 84 |
| bts.mega.Gnarly 1.4 | 18 | 20% | 47 |
| bvh.mini.Freya 0.55 | 13 | 15% | 27 |
| cs.Wren 1.0 | 10 | 11% | 25 |
| kdf.KoulDestroyer 1.0 | 6 | 7% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 139477 melee ticks, 42575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44819 sent, 39882 reached their opponent, 8518 virtual hits (21.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490669. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.2 | 136 / 210 | 1.54 | 22.6% | 34230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.6% | 136 |
| bvh.fry.Freya 0.82 | 2.3 | 16.0% | 12 |
| az.Ololobot 0.2.4 | 2.7 | 15.1% | 58 |
| winamp32.micro.MicroMacro 1.0 | 4.8 | 8.8% | 1 |
| gimp.GimpBot 0.1 | 5.3 | 9.0% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.5% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.4% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.3 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.1 | 24 / 35 | 5319 |
| 2 | 1 | 72.0 | 95.7 | 24 / 35 | 6116 |
| 3 | 1 | 71.0 | 92.9 | 19 / 35 | 5796 |
| 4 | 1 | 71.4 | 95.4 | 24 / 35 | 5705 |
| 5 | 1 | 70.6 | 92.9 | 23 / 35 | 5620 |
| 6 | 1 | 70.1 | 90.4 | 22 / 35 | 5674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 99 | 54% |
| bvh.fry.Freya 0.82 | 68 | 93% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 68% | 114 |
| bvh.fry.Freya 0.82 | 17 | 23% | 61 |
| gimp.GimpBot 0.1 | 3 | 4% | 11 |
| apollokidd.ApolloKidd 0.9 | 2 | 3% | 7 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 155882 melee ticks, 70511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 38 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45552 sent, 41402 reached their opponent, 7858 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485615. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.0 | 137 / 210 | 1.99 | 19.9% | 31598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.9% | 137 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.8% | 35 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.3% | 12 |
| mz.AntiGrav 1.0 | 3.3 | 12.1% | 13 |
| Polkwane.SmashMelee 1.0 | 5.7 | 9.8% | 3 |
| alpha.BlackIce 1.0 | 5.8 | 9.3% | 2 |
| stelo.Randomness 1.0 | 6.5 | 8.7% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.7% | 0 |
| sample.Corners 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 24 / 35 | 5510 |
| 2 | 1 | 72.0 | 93.7 | 26 / 35 | 5533 |
| 3 | 1 | 69.5 | 87.6 | 22 / 35 | 5012 |
| 4 | 1 | 69.2 | 84.1 | 21 / 35 | 5385 |
| 5 | 1 | 69.6 | 86.7 | 20 / 35 | 5172 |
| 6 | 1 | 70.4 | 89.8 | 24 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 78% |
| kano.gamma.KanoGamma 1.8 | 32 | 97% |
| mz.AntiGrav 1.0 | 26 | 96% |
| stelo.Randomness 1.0 | 10 | 70% |
| alpha.BlackIce 1.0 | 9 | 89% |
| Polkwane.SmashMelee 1.0 | 7 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 36% | 63 |
| mz.AntiGrav 1.0 | 14 | 19% | 35 |
| kano.gamma.KanoGamma 1.8 | 9 | 12% | 45 |
| stelo.Randomness 1.0 | 9 | 12% | 22 |
| alpha.BlackIce 1.0 | 8 | 11% | 14 |
| Polkwane.SmashMelee 1.0 | 4 | 5% | 18 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 7 |
| sample.Corners 1.0 | 0 | 0% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 143877 melee ticks, 41031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 103 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47624 sent, 42789 reached their opponent, 8717 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481871. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 104 / 210 | 2.01 | 18.6% | 28076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.6% | 104 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 80 |
| ary.Swarm 1.1 | 3.2 | 13.0% | 11 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.4% | 8 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.2% | 5 |
| shrub.Silver v048 | 6.0 | 9.0% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.1% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.0% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.2 | 22 / 35 | 4560 |
| 2 | 1 | 69.8 | 91.4 | 19 / 35 | 4825 |
| 3 | 1 | 69.3 | 87.0 | 16 / 35 | 4972 |
| 4 | 1 | 69.2 | 91.1 | 20 / 35 | 4507 |
| 5 | 1 | 69.0 | 88.6 | 15 / 35 | 4782 |
| 6 | 1 | 67.1 | 85.4 | 12 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 92 | 48% |
| lessonz.robocode.Oz 0.5.0 | 25 | 92% |
| ary.Swarm 1.1 | 19 | 89% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 57% | 103 |
| ary.Swarm 1.1 | 23 | 21% | 39 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 27 |
| lessonz.robocode.Oz 0.5.0 | 6 | 6% | 23 |
| shrub.Silver v048 | 4 | 4% | 13 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 152801 melee ticks, 58211 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49370 sent, 44508 reached their opponent, 6707 virtual hits (15.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471979. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.3 | 146 / 210 | 1.69 | 20.7% | 36042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 146 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 29 |
| ara.Shera 0.88 | 3.3 | 13.3% | 24 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 8 |
| amz.NanoClone 1.41 | 5.5 | 8.1% | 1 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 2 |
| maribo.IotaCT 1.1 | 6.7 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 24 / 35 | 5917 |
| 2 | 1 | 71.3 | 92.7 | 25 / 35 | 5854 |
| 3 | 1 | 71.2 | 94.0 | 23 / 35 | 5876 |
| 4 | 1 | 69.9 | 86.3 | 22 / 35 | 5796 |
| 5 | 1 | 72.2 | 94.9 | 26 / 35 | 6286 |
| 6 | 1 | 72.2 | 95.6 | 26 / 35 | 6313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 87% |
| maribo.mini.MiniQuester 0.1 | 40 | 93% |
| ara.Shera 0.88 | 32 | 75% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 41% | 102 |
| ara.Shera 0.88 | 23 | 36% | 46 |
| maribo.mini.MiniQuester 0.1 | 7 | 11% | 44 |
| amz.NanoClone 1.41 | 5 | 8% | 7 |
| dsw.StaticD 1.0 | 1 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 165868 melee ticks, 50474 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51590 sent, 46979 reached their opponent, 9298 virtual hits (19.8% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479574. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.4 | 44 / 210 | 2.59 | 16.6% | 25933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 134 |
| hadur117.Hadur 3.21bb | 2.0 | 16.6% | 44 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.4% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.4% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 2 |
| jab.DiamondStealer 5 | 7.0 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.3% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 83.2 | 10 / 35 | 4434 |
| 2 | 2 | 66.9 | 81.3 | 7 / 35 | 4272 |
| 3 | 2 | 66.4 | 82.2 | 7 / 35 | 4115 |
| 4 | 2 | 67.3 | 83.8 | 6 / 35 | 4410 |
| 5 | 2 | 66.6 | 81.6 | 6 / 35 | 4266 |
| 6 | 2 | 67.3 | 82.2 | 8 / 35 | 4436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 98 | 27% |
| brainfade.melee.Dusk 0.44 | 21 | 52% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |

Hadur died in 167 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 61% | 126 |
| brainfade.melee.Dusk 0.44 | 30 | 18% | 42 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 14 |
| dummy.micro.Sparrow 2.5 | 10 | 6% | 15 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 156223 melee ticks, 50080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49360 sent, 44551 reached their opponent, 7396 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486931. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.6 | 150 / 210 | 1.49 | 21.3% | 35477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 150 |
| stelo.Liblix 0.3.1 | 2.0 | 15.4% | 44 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 13 |
| jwirde.Gort 2.0 | 4.5 | 9.4% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 0 |
| wompi.Quokka 1.6 | 7.0 | 7.1% | 0 |
| disan.Chair 2.2.0 | 7.0 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.9% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.3 | 28 / 35 | 5977 |
| 2 | 1 | 72.3 | 95.6 | 25 / 35 | 6080 |
| 3 | 1 | 71.1 | 94.0 | 24 / 35 | 5399 |
| 4 | 1 | 70.4 | 91.7 | 21 / 35 | 5622 |
| 5 | 1 | 72.3 | 96.2 | 26 / 35 | 6097 |
| 6 | 1 | 72.8 | 95.9 | 26 / 35 | 6302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 71% |
| tzu.TheArtOfWar 1.2 | 62 | 82% |
| jwirde.Gort 2.0 | 13 | 85% |
| disan.Chair 2.2.0 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 54% | 106 |
| tzu.TheArtOfWar 1.2 | 16 | 26% | 59 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 8% | 11 |
| jwirde.Gort 2.0 | 3 | 5% | 16 |
| disan.Chair 2.2.0 | 1 | 2% | 7 |
| sample.Crazy 1.0 | 1 | 2% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 4 |
| wompi.Quokka 1.6 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 150632 melee ticks, 55268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 30 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51427 sent, 46911 reached their opponent, 9863 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477223. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.3 | 138 / 210 | 1.78 | 20.7% | 32983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 138 |
| jje.BagPuss 1.2 | 2.0 | 13.3% | 18 |
| myl.nano.Graviton 1.10 | 3.7 | 11.2% | 7 |
| sul.Lunar 1.1 | 3.8 | 10.9% | 7 |
| eem.IWillFireNoBullet v2.8 | 5.5 | 8.6% | 37 |
| hvilela.HVilela 0.9 | 6.3 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.2% | 1 |
| fm.claire 1.7 | 7.0 | 8.5% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 25 / 35 | 5247 |
| 2 | 1 | 72.5 | 94.3 | 28 / 35 | 4722 |
| 3 | 1 | 72.0 | 94.6 | 26 / 35 | 5900 |
| 4 | 1 | 69.6 | 88.3 | 21 / 35 | 5440 |
| 5 | 1 | 70.5 | 88.9 | 17 / 35 | 6071 |
| 6 | 1 | 70.3 | 90.2 | 21 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jje.BagPuss 1.2 | 57 | 75% |
| eem.IWillFireNoBullet v2.8 | 44 | 57% |
| myl.nano.Graviton 1.10 | 30 | 90% |
| sul.Lunar 1.1 | 25 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 30 | 41% | 85 |
| eem.IWillFireNoBullet v2.8 | 25 | 34% | 0 |
| myl.nano.Graviton 1.10 | 6 | 8% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 7% | 18 |
| sul.Lunar 1.1 | 4 | 5% | 42 |
| hvilela.HVilela 0.9 | 2 | 3% | 15 |
| wit.Deep7 2.0 | 1 | 1% | 2 |
| fm.claire 1.7 | 0 | 0% | 7 |

Posture (Hadur's M records, 199 rounds): 175411 melee ticks, 71431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 54959 sent, 50369 reached their opponent, 7866 virtual hits (15.6% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479771. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.9 | 117 / 210 | 1.80 | 21.0% | 29320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.0% | 117 |
| kc.mini.Mirage 0.2 | 2.0 | 19.5% | 78 |
| mz.MicroSheep 1.0 | 3.0 | 12.5% | 2 |
| cx.Princess 1.0 | 4.2 | 11.2% | 8 |
| sadoner.killer 0.2 | 5.0 | 10.2% | 2 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 7.2% | 0 |
| kurios.DOSexe .9a | 8.0 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.5 | 21 / 35 | 4680 |
| 2 | 1 | 68.5 | 88.9 | 18 / 35 | 4719 |
| 3 | 1 | 68.8 | 86.4 | 18 / 35 | 4971 |
| 4 | 1 | 69.5 | 91.8 | 18 / 35 | 5044 |
| 5 | 1 | 69.8 | 89.3 | 21 / 35 | 4916 |
| 6 | 1 | 69.8 | 90.7 | 21 / 35 | 4990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 125 | 65% |
| cx.Princess 1.0 | 20 | 75% |
| mz.MicroSheep 1.0 | 14 | 100% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 72% | 145 |
| cx.Princess 1.0 | 7 | 8% | 18 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 13 |
| sadoner.killer 0.2 | 7 | 8% | 7 |
| mz.MicroSheep 1.0 | 4 | 4% | 23 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 3 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 142616 melee ticks, 54025 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39305 sent, 35177 reached their opponent, 5887 virtual hits (16.7% of those reached).

