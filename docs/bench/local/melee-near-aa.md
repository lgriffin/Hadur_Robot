# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491900. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 61 / 210 | 2.17 | 18.0% | 33370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 18.8% | 120 |
| hadur117.Hadur 3.21aa | 1.7 | 18.0% | 61 |
| sgp.JollyNinja 3.53 | 3.3 | 12.0% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.3% | 3 |
| mz.MicroGodMelee 1 | 5.0 | 10.2% | 6 |
| lorneswork.Predator 1.0 | 5.5 | 9.6% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.5 | 13 / 35 | 5860 |
| 2 | 2 | 68.2 | 88.3 | 10 / 35 | 5345 |
| 3 | 2 | 67.9 | 85.7 | 7 / 35 | 5793 |
| 4 | 1 | 68.6 | 87.6 | 13 / 35 | 5509 |
| 5 | 2 | 67.9 | 87.0 | 9 / 35 | 5307 |
| 6 | 2 | 67.7 | 83.2 | 9 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 17% |
| sgp.JollyNinja 3.53 | 26 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 100% |
| mz.MicroGodMelee 1 | 9 | 78% |
| lorneswork.Predator 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 4 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 105 | 70% | 131 |
| sgp.JollyNinja 3.53 | 22 | 15% | 31 |
| mz.MicroGodMelee 1 | 8 | 5% | 18 |
| lorneswork.Predator 1.0 | 6 | 4% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 11 |
| adt.Ar2 1.0 | 1 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 139338 melee ticks, 91675 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44426 sent, 39718 reached their opponent, 8047 virtual hits (20.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477280. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.5 | 102 / 210 | 2.30 | 18.7% | 31264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.7% | 102 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.5% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.7% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.0% | 11 |
| Noran.BitchingElk 0.054 | 6.3 | 8.1% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 2 |
| sch.Simone 0.3d | 7.7 | 7.1% | 7 |
| stelo.PatternRobot 1.0 | 8.5 | 5.9% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 17 / 35 | 5264 |
| 2 | 1 | 68.1 | 86.7 | 14 / 35 | 5144 |
| 3 | 1 | 68.4 | 84.1 | 17 / 35 | 5256 |
| 4 | 1 | 69.8 | 87.9 | 20 / 35 | 5490 |
| 5 | 1 | 68.0 | 84.8 | 17 / 35 | 4863 |
| 6 | 1 | 68.2 | 84.8 | 17 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 44% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 73% |
| Noran.BitchingElk 0.054 | 20 | 65% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 95% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 59% |
| sch.Simone 0.3d | 7 | 86% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |

Hadur died in 109 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 30% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 25% | 58 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 13% | 28 |
| Noran.BitchingElk 0.054 | 11 | 10% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 16 |
| sch.Simone 0.3d | 7 | 6% | 13 |
| stelo.PatternRobot 1.0 | 4 | 4% | 8 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 160568 melee ticks, 45753 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 57330 sent, 52718 reached their opponent, 8994 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473253. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.1 | 178 / 210 | 1.44 | 21.6% | 40231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.6% | 178 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 11 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.8% | 5 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 10 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 2 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 2 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.7% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 97.1 | 33 / 35 | 6763 |
| 2 | 1 | 71.0 | 90.8 | 25 / 35 | 6876 |
| 3 | 1 | 72.8 | 96.8 | 33 / 35 | 6900 |
| 4 | 1 | 70.6 | 91.4 | 27 / 35 | 6145 |
| 5 | 1 | 72.7 | 96.8 | 29 / 35 | 7104 |
| 6 | 1 | 72.4 | 97.5 | 31 / 35 | 6443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 92% |
| radnor.DoctorBob 1.42 | 52 | 100% |
| kawigi.nano.Lib 1.0 | 51 | 94% |
| oa.weak.FlyMk1 0.1 | 4 | 75% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 10 | 31% | 54 |
| vuen.Cake 2.51 | 7 | 22% | 77 |
| kawigi.nano.Lib 1.0 | 5 | 16% | 45 |
| urdos.URDOS 1.3 | 4 | 13% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 9% | 3 |
| oa.weak.FlyMk1 0.1 | 2 | 6% | 6 |
| adt.Ar1 2.1 | 1 | 3% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 127317 melee ticks, 44305 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 52 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38399 sent, 33829 reached their opponent, 8673 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477514. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 115 over 6 battles (19.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.9 | 32 / 210 | 2.18 | 18.2% | 35666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 168 |
| hadur117.Hadur 3.21aa | 2.0 | 18.2% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 4.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 87.9 | 8 / 35 | 5857 |
| 2 | 2 | 68.2 | 83.8 | 3 / 35 | 5761 |
| 3 | 2 | 67.9 | 85.7 | 1 / 35 | 5534 |
| 4 | 2 | 70.0 | 87.6 | 5 / 35 | 6447 |
| 5 | 2 | 69.3 | 87.3 | 7 / 35 | 6134 |
| 6 | 2 | 69.6 | 89.2 | 8 / 35 | 5933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 8% |
| apc.LeeroyJenkins2 1.0 | 15 | 93% |
| TNT.TNT 0.99.1 | 7 | 43% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1356. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 80% | 154 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 28 |
| TNT.TNT 0.99.1 | 11 | 6% | 14 |
| josago.Jorgito 0.16 | 9 | 5% | 10 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
| css.Delitioner 0.11 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 184552 melee ticks, 85115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 56668 sent, 51908 reached their opponent, 7966 virtual hits (15.3% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476654. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.4 | 25 / 210 | 2.94 | 15.3% | 24686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.8% | 110 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 64 |
| hadur117.Hadur 3.21aa | 2.8 | 15.3% | 25 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 5 |
| ms.Ares 0.19 | 5.3 | 9.2% | 4 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 79.0 | 8 / 35 | 4107 |
| 2 | 3 | 63.5 | 74.9 | 2 / 35 | 4175 |
| 3 | 2 | 66.6 | 86.0 | 6 / 35 | 4365 |
| 4 | 3 | 63.9 | 75.2 | 3 / 35 | 4096 |
| 5 | 3 | 64.1 | 77.8 | 3 / 35 | 3885 |
| 6 | 3 | 64.0 | 77.5 | 3 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 43 | 28% |
| cb.fire.Firestarter 2.0f | 43 | 7% |
| wompi.Numbat 2.1 | 11 | 73% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 0% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 70 | 38% | 75 |
| justin.DemonicRage 3.4 | 68 | 37% | 79 |
| wompi.Numbat 2.1 | 28 | 15% | 37 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| axeBots.HataMoto 3.09 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 153257 melee ticks, 38244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 48 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47360 sent, 42362 reached their opponent, 7025 virtual hits (16.6% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477598. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.7 | 150 / 210 | 1.75 | 20.6% | 34287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 150 |
| jekl.StoneGhost 0.7 | 2.0 | 14.2% | 15 |
| origin.SleepSiphon 1.7b | 3.2 | 13.1% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 8 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.4% | 4 |
| DBall.NUKE 0.1 | 8.0 | 6.0% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 24 / 35 | 5430 |
| 2 | 1 | 72.2 | 93.7 | 26 / 35 | 6083 |
| 3 | 1 | 70.0 | 86.7 | 23 / 35 | 5676 |
| 4 | 1 | 72.4 | 95.9 | 27 / 35 | 5992 |
| 5 | 1 | 71.0 | 91.4 | 25 / 35 | 5461 |
| 6 | 1 | 71.1 | 92.4 | 25 / 35 | 5645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 57 | 95% |
| origin.SleepSiphon 1.7b | 48 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 89% |
| mld.Wisdom 1.0 | 12 | 100% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 33% |
| DBall.NUKE 0.1 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 38% | 67 |
| jekl.StoneGhost 0.7 | 16 | 26% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 18% | 42 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 6 |
| mld.Wisdom 1.0 | 3 | 5% | 17 |
| spinnercat.Omen 1.0 | 2 | 3% | 3 |
| DBall.NUKE 0.1 | 1 | 2% | 8 |
| gg.Wolverine 2.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 146413 melee ticks, 42580 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45199 sent, 40614 reached their opponent, 9082 virtual hits (22.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477120. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 100 over 6 battles (16.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.1 | 96.9 | 172 / 210 | 1.25 | 25.8% | 44332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 25.8% | 172 |
| rtk.Tachikoma 1.0 | 2.0 | 18.9% | 17 |
| franzor.Lizt 1.3.1 | 3.3 | 12.4% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 12.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.6% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.9 | 96.8 | 29 / 35 | 7440 |
| 2 | 1 | 75.4 | 96.8 | 29 / 35 | 7625 |
| 3 | 1 | 75.6 | 98.6 | 31 / 35 | 7412 |
| 4 | 1 | 74.1 | 95.4 | 25 / 35 | 6860 |
| 5 | 1 | 75.2 | 97.1 | 29 / 35 | 7303 |
| 6 | 1 | 75.5 | 96.8 | 29 / 35 | 7692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 121 | 90% |
| oog.melee.CapuletDroid 1.1 | 45 | 89% |
| franzor.Lizt 1.3.1 | 30 | 63% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 17 | 45% | 130 |
| franzor.Lizt 1.3.1 | 12 | 32% | 3 |
| oog.melee.CapuletDroid 1.1 | 9 | 24% | 63 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 5 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 189618 melee ticks, 87720 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 53050 sent, 49011 reached their opponent, 10489 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483632. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 6 battles (42.5 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.8 | 153 / 210 | 1.50 | 23.2% | 32511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.2% | 153 |
| shrub.Vapour v159 | 2.5 | 15.3% | 22 |
| tm.Yuugao 1.0 | 2.5 | 15.2% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.0% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 5.3 | 8.6% | 3 |
| m3thos.Eva00 1.1 | 5.5 | 8.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 6.0% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.9 | 25 / 35 | 5247 |
| 2 | 1 | 69.6 | 90.4 | 20 / 35 | 5071 |
| 3 | 1 | 71.8 | 95.7 | 25 / 35 | 5322 |
| 4 | 1 | 71.2 | 91.8 | 24 / 35 | 5405 |
| 5 | 1 | 73.1 | 97.1 | 29 / 35 | 5854 |
| 6 | 1 | 72.4 | 95.0 | 30 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 76 | 74% |
| shrub.Vapour v159 | 60 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 36 | 94% |
| m3thos.Eva00 1.1 | 11 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 25 | 42% | 79 |
| shrub.Vapour v159 | 19 | 32% | 62 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 14% | 39 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 12 |
| m3thos.Eva00 1.1 | 3 | 5% | 11 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 148820 melee ticks, 53275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 43955 sent, 39684 reached their opponent, 7425 virtual hits (18.7% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477756. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.9 | 59 / 210 | 2.99 | 15.8% | 22948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 103 |
| hadur117.Hadur 3.21aa | 2.0 | 15.8% | 59 |
| kc.micro.Figment 1.0 | 2.8 | 14.3% | 24 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 11 |
| mc2.enemy.Original 0.9 | 5.8 | 9.0% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 1 |
| rdm.Dueler 0.4x | 9.5 | 4.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 17 / 35 | 4608 |
| 2 | 2 | 63.1 | 75.2 | 9 / 35 | 3492 |
| 3 | 2 | 65.2 | 78.1 | 9 / 35 | 4120 |
| 4 | 2 | 64.3 | 78.4 | 9 / 35 | 3623 |
| 5 | 2 | 65.9 | 82.5 | 9 / 35 | 3971 |
| 6 | 3 | 59.8 | 67.6 | 6 / 35 | 3134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 25% |
| kc.micro.Figment 1.0 | 37 | 78% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| mc2.enemy.Original 0.9 | 2 | 50% |
| step.nanoPri 1.0 | 2 | 50% |

Hadur died in 151 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 68 | 45% | 85 |
| kc.micro.Figment 1.0 | 32 | 21% | 58 |
| mc2.enemy.Original 0.9 | 17 | 11% | 19 |
| yagami.Tidus 0.11 | 11 | 7% | 15 |
| step.nanoPri 1.0 | 10 | 7% | 11 |
| pedersen.Grishnakh 1.0 | 7 | 5% | 11 |
| rdm.Dueler 0.4x | 4 | 3% | 4 |
| dft.Calliope 5.6 | 1 | 1% | 6 |
| robar.nano.Assertive_Melee 0.2 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 145881 melee ticks, 34361 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47607 sent, 43153 reached their opponent, 6329 virtual hits (14.7% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482993. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.7 | 170 / 210 | 1.39 | 21.1% | 35611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.1% | 170 |
| DTF.Kludgy 1.2b | 2.3 | 14.3% | 16 |
| ejb.Polaris 1.0.1 | 3.3 | 12.7% | 11 |
| ne.Chimera 1.2 | 3.3 | 13.0% | 6 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 9.7% | 5 |
| kurios.DOSexe .9b | 7.5 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 28 / 35 | 6073 |
| 2 | 1 | 72.2 | 97.8 | 29 / 35 | 5817 |
| 3 | 1 | 71.8 | 96.5 | 29 / 35 | 5845 |
| 4 | 1 | 71.9 | 94.6 | 28 / 35 | 6013 |
| 5 | 1 | 72.8 | 97.5 | 30 / 35 | 6125 |
| 6 | 1 | 71.0 | 94.3 | 26 / 35 | 5738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 82% |
| ejb.Polaris 1.0.1 | 52 | 92% |
| ne.Chimera 1.2 | 40 | 93% |
| vStar.RAFzilla 2.15 | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 19 | 46% | 66 |
| ejb.Polaris 1.0.1 | 7 | 17% | 51 |
| ne.Chimera 1.2 | 7 | 17% | 42 |
| vStar.RAFzilla 2.15 | 3 | 7% | 20 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 14 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 142183 melee ticks, 60998 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 62 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46284 sent, 41634 reached their opponent, 7984 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505926. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.0 | 74 / 210 | 2.53 | 16.9% | 24471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.3 | 16.9% | 74 |
| rz.Aleph 0.34 | 1.7 | 16.9% | 73 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.7% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 17 |
| rdt199.Warlord 0.73 | 5.0 | 9.9% | 15 |
| br2.MobyDickBot 1.6 | 6.2 | 8.5% | 6 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 7 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 16 / 35 | 4103 |
| 2 | 2 | 65.2 | 81.6 | 8 / 35 | 4070 |
| 3 | 1 | 65.0 | 79.7 | 10 / 35 | 4205 |
| 4 | 1 | 66.5 | 84.1 | 16 / 35 | 4088 |
| 5 | 1 | 66.2 | 83.5 | 13 / 35 | 4121 |
| 6 | 2 | 65.8 | 84.8 | 11 / 35 | 3884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 66 | 50% |
| cx.mini.Nimrod 0.55 | 20 | 60% |
| uji.YellohFellah 1.0 | 14 | 71% |
| djc.DynaBot 0.1.1 | 14 | 64% |
| rdt199.Warlord 0.73 | 10 | 60% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 40% | 83 |
| cx.mini.Nimrod 0.55 | 29 | 21% | 39 |
| rdt199.Warlord 0.73 | 19 | 14% | 29 |
| djc.DynaBot 0.1.1 | 18 | 13% | 28 |
| uji.YellohFellah 1.0 | 8 | 6% | 18 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 7 |
| br2.MobyDickBot 1.6 | 2 | 1% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 153347 melee ticks, 38174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 42 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 50565 sent, 45690 reached their opponent, 6273 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483473. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.9 | 129 / 210 | 2.27 | 18.3% | 24823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.3% | 129 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 24 |
| nat.PallasHawk 1.0 | 3.0 | 13.3% | 30 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 18 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 7 |
| jrm.Test0 1.0 | 6.0 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.3 | 6.0% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 23 / 35 | 4598 |
| 2 | 1 | 67.3 | 85.7 | 21 / 35 | 3931 |
| 3 | 1 | 68.3 | 87.9 | 20 / 35 | 4313 |
| 4 | 1 | 65.8 | 79.7 | 21 / 35 | 3795 |
| 5 | 1 | 69.6 | 91.4 | 25 / 35 | 4204 |
| 6 | 1 | 66.5 | 82.9 | 19 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 91% |
| nat.PallasHawk 1.0 | 42 | 67% |
| bts.wiki.RipCurl 0.9b | 41 | 90% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 25 | 31% | 59 |
| bts.wiki.RipCurl 0.9b | 16 | 20% | 41 |
| darkcanuck.Leon 1.01 | 14 | 17% | 56 |
| brainfade.melee.Genghis 0.36 | 9 | 11% | 24 |
| jrm.Test0 1.0 | 8 | 10% | 11 |
| jp.Perpy 16.0 | 5 | 6% | 8 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |

Posture (Hadur's M records, 199 rounds): 126602 melee ticks, 38551 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42925 sent, 38057 reached their opponent, 6312 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481824. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.6 | 64 / 210 | 2.66 | 16.1% | 26036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.8 | 16.1% | 64 |
| mn.Combat 3.25.0 | 2.0 | 16.5% | 85 |
| ags.Glacier 0.2.11 | 2.2 | 16.2% | 32 |
| shinh.Entangled 0.3 | 4.2 | 12.5% | 24 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.5% | 5 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 1 |
| maribo.FollowFire 1 | 8.3 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.8 | 12 / 35 | 4515 |
| 2 | 2 | 65.7 | 81.9 | 6 / 35 | 4631 |
| 3 | 1 | 66.2 | 81.9 | 12 / 35 | 4699 |
| 4 | 2 | 65.0 | 82.2 | 12 / 35 | 3875 |
| 5 | 2 | 65.6 | 81.6 | 13 / 35 | 4190 |
| 6 | 3 | 64.5 | 77.1 | 9 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 27% |
| ags.Glacier 0.2.11 | 42 | 81% |
| shinh.Entangled 0.3 | 21 | 43% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |
| stelo.Wang 1.0 | 3 | 67% |

Hadur died in 147 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 36% | 72 |
| ags.Glacier 0.2.11 | 43 | 29% | 71 |
| shinh.Entangled 0.3 | 27 | 18% | 33 |
| gh.micro.Gruweltje 0.7 | 9 | 6% | 15 |
| apc.Colossus2 0.17 | 6 | 4% | 7 |
| stelo.Wang 1.0 | 4 | 3% | 7 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147269 melee ticks, 41850 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 89 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42311 sent, 37436 reached their opponent, 6119 virtual hits (16.3% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1512474. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 96.3 | 192 / 210 | 1.30 | 24.4% | 38434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.4% | 192 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.4% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 10.9% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 10.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.5% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.8% | 1 |
| pa.Improved 1.0 | 8.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 96.4 | 32 / 35 | 6493 |
| 2 | 1 | 73.3 | 96.8 | 33 / 35 | 6497 |
| 3 | 1 | 72.1 | 95.0 | 32 / 35 | 5910 |
| 4 | 1 | 73.4 | 96.1 | 30 / 35 | 6682 |
| 5 | 1 | 73.3 | 96.4 | 32 / 35 | 6455 |
| 6 | 1 | 73.3 | 97.1 | 33 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 116 | 97% |
| sanyi.mikrobi.Roberto 1.0 | 27 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 95% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 5 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 9 | 50% | 109 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 22% | 35 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 17% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 6% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 4 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 121866 melee ticks, 51378 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36217 sent, 32300 reached their opponent, 8679 virtual hits (26.9% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485565. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.2 | 115 / 210 | 2.06 | 19.4% | 32534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.4% | 115 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.1% | 23 |
| mld.DustBunny 3.8 | 3.3 | 13.0% | 11 |
| emp.Yngwie 1.11 | 3.7 | 12.8% | 48 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 4 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.2% | 7 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.5 | 5.5% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 18 / 35 | 5581 |
| 2 | 1 | 69.7 | 88.9 | 20 / 35 | 5285 |
| 3 | 1 | 68.7 | 86.0 | 17 / 35 | 5112 |
| 4 | 1 | 69.6 | 87.9 | 20 / 35 | 5512 |
| 5 | 1 | 69.7 | 88.3 | 19 / 35 | 5493 |
| 6 | 1 | 70.2 | 89.5 | 21 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 42% |
| kawigi.micro.Shiz 1.1 | 35 | 91% |
| mld.DustBunny 3.8 | 31 | 87% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 48% | 82 |
| kawigi.micro.Shiz 1.1 | 19 | 20% | 48 |
| mld.DustBunny 3.8 | 12 | 13% | 41 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 14 |
| divineomega.TrialBot 0.003 | 3 | 3% | 9 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 5 |
| kawigi.robot.Girl 1.2 | 1 | 1% | 7 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 165431 melee ticks, 49322 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 65 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52559 sent, 47830 reached their opponent, 7845 virtual hits (16.4% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472853. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.2 | 129 / 210 | 1.80 | 20.4% | 35138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.4% | 129 |
| gh.Griezel 0.5.2 | 2.2 | 16.1% | 43 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.5% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.4% | 21 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.7% | 3 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 1 |
| asd.Cthulhu 1.3 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.3% | 2 |
| repositorio.NanoStep 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 19 / 35 | 5535 |
| 2 | 1 | 71.1 | 92.7 | 23 / 35 | 5557 |
| 3 | 1 | 71.1 | 89.8 | 20 / 35 | 5923 |
| 4 | 1 | 71.2 | 92.1 | 20 / 35 | 5960 |
| 5 | 1 | 70.5 | 89.2 | 21 / 35 | 5830 |
| 6 | 1 | 72.9 | 95.2 | 26 / 35 | 6333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 98 | 71% |
| techdude.forest.FlamingForest 1.1 | 30 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 88% |
| bvh.fnr.Fenrir 0.36l | 11 | 91% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 32 | 40% | 96 |
| techdude.forest.FlamingForest 1.1 | 19 | 23% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 12% | 22 |
| bvh.fnr.Fenrir 0.36l | 8 | 10% | 13 |
| divineomega.DivineBot 1.9.4.5 | 4 | 5% | 6 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 11 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 7 |
| asd.Cthulhu 1.3 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 175758 melee ticks, 60533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 55941 sent, 51448 reached their opponent, 8670 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487497. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.1 | 120 / 210 | 2.16 | 19.4% | 34271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.4% | 120 |
| et.Predator 1.8 | 2.5 | 13.7% | 21 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.2% | 31 |
| cx.BlestPain 1.41 | 3.7 | 11.9% | 28 |
| ahf.NanoAndrew .4 | 5.5 | 10.1% | 7 |
| nic.Nicator 2.4 | 6.0 | 9.3% | 2 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.1 | 18 / 35 | 5762 |
| 2 | 1 | 70.4 | 87.9 | 22 / 35 | 5869 |
| 3 | 1 | 70.6 | 89.8 | 25 / 35 | 5820 |
| 4 | 1 | 69.2 | 87.0 | 17 / 35 | 5703 |
| 5 | 1 | 69.0 | 84.8 | 18 / 35 | 5616 |
| 6 | 1 | 69.8 | 88.9 | 20 / 35 | 5501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 83% |
| oog.melee.Mercutio 1.0 | 48 | 83% |
| cx.BlestPain 1.41 | 32 | 53% |
| ahf.NanoAndrew .4 | 13 | 77% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| nic.Nicator 2.4 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 25 | 28% | 70 |
| oog.melee.Mercutio 1.0 | 21 | 23% | 55 |
| cx.BlestPain 1.41 | 21 | 23% | 36 |
| ahf.NanoAndrew .4 | 15 | 17% | 24 |
| maribo.melee.BMV 0.1 | 4 | 4% | 10 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| nic.Nicator 2.4 | 1 | 1% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 198 rounds): 158064 melee ticks, 52057 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 45 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52227 sent, 47551 reached their opponent, 9965 virtual hits (21.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485301. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 256 over 6 battles (42.7 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.8 | 150 / 210 | 1.65 | 22.3% | 29475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 150 |
| agd.Mooserwirt2 2.7 | 2.3 | 13.9% | 14 |
| uji.DBH 1.1 | 2.7 | 12.9% | 14 |
| sigterm.Sigterm 1.0 | 4.5 | 11.0% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 5.3 | 9.4% | 4 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.1% | 9 |
| ratosh.Nobo 0.21 | 6.2 | 9.3% | 4 |
| stelo.WangRobot 1.0 | 8.5 | 6.1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.9 | 26 / 35 | 4802 |
| 2 | 1 | 68.7 | 86.1 | 19 / 35 | 5044 |
| 3 | 1 | 70.7 | 95.4 | 25 / 35 | 4688 |
| 4 | 1 | 71.4 | 94.6 | 28 / 35 | 5155 |
| 5 | 1 | 70.9 | 92.1 | 28 / 35 | 5035 |
| 6 | 1 | 69.3 | 90.0 | 24 / 35 | 4751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 51 | 86% |
| agd.Mooserwirt2 2.7 | 47 | 94% |
| sigterm.Sigterm 1.0 | 43 | 81% |
| spinnercat.Robovirus 2.718 | 12 | 58% |
| stelo.WangRobot 1.0 | 11 | 82% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 75% |
| ratosh.Nobo 0.21 | 7 | 71% |

Hadur died in 61 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 16 | 26% | 43 |
| agd.Mooserwirt2 2.7 | 11 | 18% | 59 |
| sigterm.Sigterm 1.0 | 9 | 15% | 36 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 13% | 22 |
| spinnercat.Robovirus 2.718 | 7 | 11% | 14 |
| ratosh.Nobo 0.21 | 6 | 10% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 5% | 10 |
| stelo.WangRobot 1.0 | 1 | 2% | 7 |

Posture (Hadur's M records, 199 rounds): 129963 melee ticks, 44701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 64 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40548 sent, 36366 reached their opponent, 8072 virtual hits (22.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476666. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 98.9 | 202 / 210 | 1.10 | 22.9% | 38598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.9% | 202 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.3% | 7 |
| mld.Infinity 2.2 | 3.7 | 12.0% | 0 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.0% | 0 |
| erdnis.Rover 0.3 | 4.3 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.5 | 6.6% | 0 |
| pac.ABC 2.1 | 7.7 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 98.7 | 34 / 35 | 6334 |
| 2 | 1 | 74.4 | 99.4 | 33 / 35 | 6665 |
| 3 | 1 | 74.5 | 100.0 | 35 / 35 | 6606 |
| 4 | 1 | 74.3 | 99.0 | 34 / 35 | 6364 |
| 5 | 1 | 73.6 | 97.8 | 32 / 35 | 6279 |
| 6 | 1 | 73.9 | 98.4 | 34 / 35 | 6350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 146 | 99% |
| mld.Infinity 2.2 | 21 | 100% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| erdnis.Rover 0.3 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 8 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 38% | 75 |
| krillr.mini.JointStrike 2.0.0 | 3 | 38% | 30 |
| mld.Infinity 2.2 | 1 | 13% | 31 |
| pac.ABC 2.1 | 1 | 13% | 11 |
| erdnis.Rover 0.3 | 0 | 0% | 22 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 127898 melee ticks, 46748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 448 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 258 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42619 sent, 38073 reached their opponent, 8883 virtual hits (23.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490519. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.9 | 152 / 210 | 1.55 | 21.7% | 38470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.7% | 152 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 30 |
| catcat20.Rabbit 0.001 | 3.5 | 10.9% | 14 |
| fwb.Nine 1.0.1 | 3.8 | 11.2% | 8 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 9.7% | 2 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.7% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.0% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 24 / 35 | 6267 |
| 2 | 1 | 71.7 | 89.2 | 25 / 35 | 6592 |
| 3 | 1 | 73.0 | 96.5 | 28 / 35 | 6490 |
| 4 | 1 | 71.7 | 94.3 | 24 / 35 | 6013 |
| 5 | 1 | 71.6 | 94.6 | 23 / 35 | 6102 |
| 6 | 1 | 73.3 | 96.2 | 28 / 35 | 7006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 89 | 81% |
| fwb.Nine 1.0.1 | 42 | 95% |
| catcat20.Rabbit 0.001 | 30 | 83% |
| nz.jdc.nano.GridFu 1.0 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| m3thos.mini.Eva01 0.5.5 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 60% | 101 |
| catcat20.Rabbit 0.001 | 7 | 12% | 45 |
| fwb.Nine 1.0.1 | 6 | 10% | 21 |
| bayen.nut.Squirrel 1.615 | 4 | 7% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 16 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |

Posture (Hadur's M records, 198 rounds): 161230 melee ticks, 57309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 50395 sent, 45799 reached their opponent, 10340 virtual hits (22.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486271. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.2 | 138 / 210 | 1.70 | 20.8% | 35966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.8% | 138 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.2 | 8.2% | 3 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.5% | 0 |
| el.JumpShoot 0.2 | 7.7 | 5.8% | 0 |
| fire219.CatBot 1.0 | 7.7 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.1 | 21 / 35 | 5926 |
| 2 | 1 | 70.4 | 87.9 | 21 / 35 | 5761 |
| 3 | 1 | 71.9 | 94.0 | 24 / 35 | 5981 |
| 4 | 1 | 71.7 | 93.3 | 20 / 35 | 6076 |
| 5 | 1 | 72.6 | 94.6 | 27 / 35 | 6179 |
| 6 | 1 | 71.8 | 92.4 | 25 / 35 | 6043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 72% |
| dummy.mini.Scimitar 1.01 | 29 | 79% |
| cf.RiO.RiOx 4.2.1 | 20 | 90% |
| eld.Hmm 1.0 | 4 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 55% | 106 |
| dummy.mini.Scimitar 1.01 | 14 | 19% | 49 |
| cf.RiO.RiOx 4.2.1 | 10 | 14% | 29 |
| eld.Hmm 1.0 | 3 | 4% | 14 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 3 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 168669 melee ticks, 75659 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50127 sent, 45573 reached their opponent, 7827 virtual hits (17.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474707. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.2 | 109 / 210 | 1.94 | 20.3% | 26431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.3% | 109 |
| pe.SandboxDT 2.71m | 2.0 | 17.5% | 63 |
| kvk.HebusLeTroll 0.35 | 3.3 | 15.1% | 15 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.9% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.2 | 5.5% | 0 |
| tad.Dalek98 0.98 | 7.5 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.4 | 15 / 35 | 4296 |
| 2 | 1 | 69.2 | 90.0 | 20 / 35 | 4330 |
| 3 | 1 | 69.9 | 90.4 | 22 / 35 | 4575 |
| 4 | 1 | 68.5 | 87.9 | 21 / 35 | 4086 |
| 5 | 1 | 69.0 | 88.2 | 15 / 35 | 4545 |
| 6 | 1 | 68.6 | 86.4 | 16 / 35 | 4599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 72 | 46% |
| kvk.HebusLeTroll 0.35 | 42 | 88% |
| jlm.javaDisturbance 0.59 | 40 | 75% |
| bigpete.Stewie 1.0 | 9 | 78% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 49% | 85 |
| jlm.javaDisturbance 0.59 | 21 | 21% | 48 |
| kvk.HebusLeTroll 0.35 | 19 | 19% | 48 |
| bigpete.Stewie 1.0 | 6 | 6% | 15 |
| tad.Dalek98 0.98 | 4 | 4% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 1 | 1% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 153937 melee ticks, 48379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45750 sent, 41536 reached their opponent, 5722 virtual hits (13.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474180. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 97.7 | 185 / 210 | 1.21 | 22.4% | 39173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.4% | 185 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 20 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 9.6% | 0 |
| cw.megas.Blade 0.8 | 5.7 | 8.9% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.6% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.4% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 97.5 | 29 / 35 | 6564 |
| 2 | 1 | 73.6 | 98.4 | 31 / 35 | 6485 |
| 3 | 1 | 74.3 | 98.7 | 32 / 35 | 6885 |
| 4 | 1 | 72.9 | 95.6 | 29 / 35 | 6482 |
| 5 | 1 | 74.5 | 100.0 | 35 / 35 | 6797 |
| 6 | 1 | 72.7 | 95.9 | 29 / 35 | 5960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 118 | 89% |
| cre.Karolos 0.32 | 59 | 97% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 20 | 80% | 115 |
| cre.Karolos 0.32 | 4 | 16% | 59 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 8 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 13 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 121254 melee ticks, 49234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38248 sent, 33524 reached their opponent, 9976 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470939. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.5 | 83 / 210 | 2.49 | 17.3% | 25998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.3% | 83 |
| rz.GlowBlowMelee 1.4 | 2.8 | 14.4% | 42 |
| davidalves.Phoenix 0.54 | 2.8 | 13.7% | 45 |
| florent.XSeries.X2 0.12 | 3.7 | 12.7% | 21 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 10 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 7 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.6% | 0 |
| stelo.SoJNanoMelee 1.1 | 8.0 | 6.0% | 2 |
| as.FrankTheTank 1.3 | 8.5 | 5.5% | 0 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.4 | 14 / 35 | 4490 |
| 2 | 1 | 65.3 | 79.4 | 10 / 35 | 4242 |
| 3 | 1 | 66.5 | 85.4 | 13 / 35 | 4048 |
| 4 | 1 | 66.6 | 85.4 | 15 / 35 | 4049 |
| 5 | 1 | 66.7 | 82.2 | 15 / 35 | 4514 |
| 6 | 1 | 67.5 | 84.1 | 16 / 35 | 4655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 51 | 55% |
| davidalves.Phoenix 0.54 | 35 | 43% |
| florent.XSeries.X2 0.12 | 29 | 72% |
| pedersen.Ugluk 1.1.1 | 12 | 67% |
| oog.melee.Corsair 1.0 | 12 | 75% |
| stelo.SoJNanoMelee 1.1 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 39 | 31% | 58 |
| rz.GlowBlowMelee 1.4 | 38 | 30% | 62 |
| florent.XSeries.X2 0.12 | 21 | 17% | 41 |
| pedersen.Ugluk 1.1.1 | 11 | 9% | 15 |
| oog.melee.Corsair 1.0 | 7 | 6% | 18 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| evd.X1 0.01 | 3 | 2% | 3 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 4 |

Posture (Hadur's M records, 199 rounds): 137064 melee ticks, 40318 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 112 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 112 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44576 sent, 39763 reached their opponent, 7244 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489121. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.9 | 143 / 210 | 1.89 | 20.9% | 23110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.9% | 143 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.5% | 11 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 14.3% | 12 |
| jdw.Hurricane 1.4 | 3.5 | 13.5% | 27 |
| ds.Oo 2.2 | 5.0 | 10.2% | 11 |
| adt.Ar2 1.1 | 6.5 | 7.9% | 2 |
| awesomeness.Elite 1.0 | 6.7 | 7.6% | 3 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.4% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.7 | 27 / 35 | 4073 |
| 2 | 1 | 68.2 | 87.5 | 22 / 35 | 3690 |
| 3 | 1 | 67.7 | 84.3 | 20 / 35 | 3787 |
| 4 | 1 | 68.7 | 88.9 | 24 / 35 | 3778 |
| 5 | 1 | 69.7 | 93.9 | 25 / 35 | 3709 |
| 6 | 1 | 69.3 | 88.2 | 25 / 35 | 4073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| jdw.Hurricane 1.4 | 47 | 81% |
| voidious.micro.BlitzBat 1.05 | 37 | 97% |
| ds.Oo 2.2 | 18 | 72% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 50% |
| gjr.Cephalosporin 0.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 29% | 47 |
| voidious.micro.BlitzBat 1.05 | 14 | 20% | 48 |
| ds.Oo 2.2 | 11 | 16% | 27 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 14% | 49 |
| adt.Ar2 1.1 | 6 | 9% | 16 |
| awesomeness.Elite 1.0 | 5 | 7% | 13 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 7 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 120484 melee ticks, 30250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 29 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39291 sent, 35067 reached their opponent, 5918 virtual hits (16.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478170. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.6 | 151 / 210 | 1.49 | 21.6% | 40454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.6% | 151 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 30 |
| shu.nitro.LENIN .T34 | 3.5 | 12.3% | 17 |
| lrem.Spectre 0.4.4 | 3.5 | 12.2% | 9 |
| js.PinBall 1.6 | 5.2 | 10.5% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.3% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.9 | 27 / 35 | 6533 |
| 2 | 1 | 72.2 | 92.7 | 21 / 35 | 6743 |
| 3 | 1 | 73.0 | 96.5 | 28 / 35 | 6737 |
| 4 | 1 | 73.3 | 93.3 | 25 / 35 | 7413 |
| 5 | 1 | 72.6 | 93.3 | 24 / 35 | 6701 |
| 6 | 1 | 72.6 | 95.6 | 26 / 35 | 6327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 73 | 77% |
| shu.nitro.LENIN .T34 | 48 | 79% |
| lrem.Spectre 0.4.4 | 33 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 15 | 87% |
| js.PinBall 1.6 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 24 | 40% | 79 |
| shu.nitro.LENIN .T34 | 17 | 28% | 58 |
| lrem.Spectre 0.4.4 | 7 | 12% | 30 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 12% | 20 |
| js.PinBall 1.6 | 5 | 8% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 156476 melee ticks, 49556 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 31 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 50334 sent, 45557 reached their opponent, 10793 virtual hits (23.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472491. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.9 | 149 / 210 | 2.36 | 19.2% | 31240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 19.2% | 149 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 35 |
| EH.Eagle 1.0.6 | 4.2 | 10.4% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 9.8% | 6 |
| wee.Gem 1.8.4 | 5.3 | 9.3% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.0% | 3 |
| joe.ADinosaur 1.0 | 6.3 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.9% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.3% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 27 / 35 | 4927 |
| 2 | 1 | 67.6 | 82.2 | 21 / 35 | 5012 |
| 3 | 2 | 62.9 | 63.2 | 15 / 35 | 5049 |
| 4 | 1 | 70.1 | 91.1 | 29 / 35 | 5255 |
| 5 | 1 | 70.7 | 91.7 | 27 / 35 | 5329 |
| 6 | 1 | 71.2 | 90.5 | 30 / 35 | 5668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 89 | 88% |
| EH.Eagle 1.0.6 | 31 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 89% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| joe.ADinosaur 1.0 | 8 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 38% | 83 |
| joe.ADinosaur 1.0 | 11 | 18% | 18 |
| cs.Grudge 1.0 | 9 | 15% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 10% | 15 |
| EH.Eagle 1.0.6 | 4 | 7% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 16 |
| throxbot.ThroxBot 0.1 | 2 | 3% | 16 |
| wee.Gem 1.8.4 | 2 | 3% | 13 |

Posture (Hadur's M records, 199 rounds): 118367 melee ticks, 34701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39139 sent, 34526 reached their opponent, 8997 virtual hits (26.1% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474408. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 172 over 6 battles (28.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 92.0 | 148 / 210 | 1.72 | 19.4% | 25732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.4% | 148 |
| kid.test.NightFox .2 | 2.3 | 14.7% | 23 |
| uji.Antique 1.0 | 2.7 | 12.7% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.1% | 6 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 8.8 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 24 / 35 | 4249 |
| 2 | 1 | 70.9 | 96.8 | 31 / 35 | 4482 |
| 3 | 1 | 68.9 | 91.7 | 23 / 35 | 4067 |
| 4 | 1 | 66.7 | 86.3 | 17 / 35 | 4110 |
| 5 | 1 | 70.2 | 94.6 | 27 / 35 | 4537 |
| 6 | 1 | 69.7 | 92.7 | 26 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 86% |
| uji.Antique 1.0 | 64 | 88% |
| ahr.ice.Ice 1.0.2 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| qohnil.blot.BlotBot 3.61 | 5 | 60% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 18 | 29% | 56 |
| uji.Antique 1.0 | 16 | 26% | 69 |
| pfvicm.Sobieski 7.2.3b | 9 | 15% | 21 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 15 |
| qohnil.blot.BlotBot 3.61 | 6 | 10% | 19 |
| stelo.Lifestealer 1.0 | 3 | 5% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 16 |
| stelo.PianistNano 1.2 | 1 | 2% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 129791 melee ticks, 38825 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 23 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43415 sent, 38700 reached their opponent, 5394 virtual hits (13.9% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481680. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.5 | 110 / 210 | 1.86 | 19.7% | 30014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.7% | 110 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 50 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.5% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 12.1% | 5 |
| jok.PheonixM 0.1.2 | 5.0 | 10.6% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.3% | 1 |
| ap.Frederick 1.1 | 8.8 | 4.6% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 19 / 35 | 5216 |
| 2 | 1 | 69.7 | 88.9 | 18 / 35 | 4878 |
| 3 | 1 | 70.3 | 91.1 | 19 / 35 | 4870 |
| 4 | 1 | 69.2 | 85.7 | 17 / 35 | 4988 |
| 5 | 1 | 70.3 | 90.8 | 18 / 35 | 5074 |
| 6 | 1 | 70.8 | 93.0 | 19 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 64% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 52% |
| myl.micro.Troodon 1.10 | 21 | 86% |
| jok.PheonixM 0.1.2 | 15 | 80% |
| ap.Frederick 1.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 41 | 41% | 76 |
| deewiant.Anomaly 0.2 | 38 | 38% | 87 |
| myl.micro.Troodon 1.10 | 10 | 10% | 18 |
| jok.PheonixM 0.1.2 | 6 | 6% | 14 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 8 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 168700 melee ticks, 59325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 53535 sent, 48876 reached their opponent, 7440 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481172. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.0 | 71 / 210 | 2.68 | 18.0% | 25114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.0% | 71 |
| stelo.PastFuture 2.3.2 | 2.8 | 15.0% | 35 |
| darkcanuck.B26354 1.06 | 3.0 | 15.3% | 47 |
| oog.melee.Capulet 1.2 | 3.2 | 14.8% | 41 |
| intruder.PrairieWolf 2.61 | 5.3 | 10.1% | 10 |
| tripphippy.Alice 1.1 | 6.2 | 9.0% | 1 |
| ntc.Opposite 1.5 | 7.0 | 8.0% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.2% | 4 |
| GarmBox.Anger 1.0 | 9.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 79.3 | 12 / 35 | 3956 |
| 2 | 1 | 67.7 | 84.3 | 17 / 35 | 4579 |
| 3 | 1 | 65.0 | 78.2 | 12 / 35 | 4045 |
| 4 | 1 | 62.9 | 73.9 | 10 / 35 | 3701 |
| 5 | 1 | 66.2 | 80.4 | 10 / 35 | 4425 |
| 6 | 1 | 65.0 | 77.9 | 10 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 62% |
| darkcanuck.B26354 1.06 | 35 | 49% |
| stelo.PastFuture 2.3.2 | 28 | 57% |
| tripphippy.Alice 1.1 | 11 | 91% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 30% | 62 |
| oog.melee.Capulet 1.2 | 30 | 21% | 52 |
| stelo.PastFuture 2.3.2 | 30 | 21% | 41 |
| tripphippy.Alice 1.1 | 12 | 9% | 19 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 6% | 9 |
| intruder.PrairieWolf 2.61 | 8 | 6% | 18 |
| ntc.Opposite 1.5 | 8 | 6% | 8 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 158303 melee ticks, 35173 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46778 sent, 42405 reached their opponent, 7295 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491523. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.8 | 52 / 210 | 2.91 | 15.7% | 22828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.7% | 82 |
| hadur117.Hadur 3.21aa | 1.8 | 15.7% | 52 |
| gh.mini.Griezel 0.2 | 3.0 | 13.7% | 56 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.4% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 0 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 2 |
| fm.mammillarias 1.3 | 8.5 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 81.0 | 8 / 35 | 4088 |
| 2 | 1 | 65.6 | 82.5 | 10 / 35 | 3801 |
| 3 | 2 | 65.4 | 83.2 | 10 / 35 | 3698 |
| 4 | 2 | 62.9 | 74.3 | 6 / 35 | 3651 |
| 5 | 2 | 64.6 | 78.7 | 9 / 35 | 3983 |
| 6 | 2 | 62.9 | 73.0 | 9 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 43% |
| gh.mini.Griezel 0.2 | 36 | 42% |
| d414.nano.Quantum 1.0.0 | 8 | 75% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 36% | 82 |
| gh.mini.Griezel 0.2 | 45 | 28% | 59 |
| spinnercat.micro.Tyger 0.1 | 17 | 11% | 21 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 19 |
| gh.nano.Grofvuil 0.2 | 12 | 8% | 13 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 203 rounds): 150412 melee ticks, 35552 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 43 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 48332 sent, 43571 reached their opponent, 7076 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485243. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.0 | 127 / 210 | 1.81 | 19.1% | 28850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.1% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 15.0% | 52 |
| apc.botM 3.0 | 3.2 | 11.8% | 16 |
| lxx.ConceptA 0.8 | 4.2 | 11.0% | 3 |
| vjik.UnViolation 1.1 | 5.0 | 9.5% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 1 |
| yk.JahMicro 1.0 | 7.5 | 7.0% | 4 |
| panzer.Panzer 0.2 | 7.7 | 7.2% | 3 |
| conscience.Electron 1.3g | 8.3 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.1 | 18 / 35 | 4446 |
| 2 | 1 | 70.5 | 96.2 | 26 / 35 | 4947 |
| 3 | 1 | 69.9 | 93.3 | 26 / 35 | 4966 |
| 4 | 1 | 68.8 | 91.7 | 17 / 35 | 4921 |
| 5 | 1 | 67.7 | 87.9 | 17 / 35 | 4919 |
| 6 | 1 | 68.7 | 91.4 | 23 / 35 | 4651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 61% |
| apc.botM 3.0 | 42 | 76% |
| lxx.ConceptA 0.8 | 20 | 85% |
| vjik.UnViolation 1.1 | 14 | 86% |
| yk.JahMicro 1.0 | 11 | 82% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 33 | 39% | 73 |
| lxx.ConceptA 0.8 | 18 | 21% | 28 |
| apc.botM 3.0 | 17 | 20% | 52 |
| bayen.UbaMicro 1.4 | 5 | 6% | 15 |
| vjik.UnViolation 1.1 | 4 | 5% | 21 |
| panzer.Panzer 0.2 | 4 | 5% | 5 |
| yk.JahMicro 1.0 | 3 | 4% | 8 |
| conscience.Electron 1.3g | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 121351 melee ticks, 52401 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 83 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 83 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41489 sent, 36745 reached their opponent, 6915 virtual hits (18.8% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471599. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.3 | 139 / 210 | 1.70 | 22.3% | 29373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 139 |
| maribo.Quester 0.3 | 2.0 | 17.4% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 15.1% | 23 |
| labg.Cataclysm 2.05 | 4.2 | 11.2% | 14 |
| baal.nano.N 1.42 | 5.3 | 9.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 9.6% | 6 |
| zyx.micro.Ant 1.1 | 7.2 | 5.9% | 0 |
| sanja.First 0.1 | 7.8 | 5.3% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.6 | 25 / 35 | 5116 |
| 2 | 1 | 70.0 | 88.9 | 22 / 35 | 4612 |
| 3 | 1 | 70.5 | 88.2 | 21 / 35 | 4839 |
| 4 | 1 | 71.6 | 92.9 | 24 / 35 | 4898 |
| 5 | 1 | 72.0 | 93.2 | 24 / 35 | 5166 |
| 6 | 1 | 70.7 | 90.7 | 23 / 35 | 4742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 79 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 74% |
| labg.Cataclysm 2.05 | 19 | 68% |
| baal.nano.N 1.42 | 8 | 88% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 1121. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 40% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 29% | 62 |
| labg.Cataclysm 2.05 | 9 | 13% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 13% | 14 |
| baal.nano.N 1.42 | 2 | 3% | 13 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 168109 melee ticks, 58959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48450 sent, 44204 reached their opponent, 6654 virtual hits (15.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486340. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.8 | 96 / 210 | 2.00 | 19.0% | 32736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.3 | 19.0% | 96 |
| stelo.Spread 0.9 | 2.2 | 16.1% | 56 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 41 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 13 |
| tcf.Reach 3 | 4.7 | 10.9% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.6% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 86.3 | 11 / 35 | 5349 |
| 2 | 1 | 69.9 | 88.6 | 15 / 35 | 5461 |
| 3 | 1 | 72.0 | 93.7 | 21 / 35 | 6087 |
| 4 | 2 | 69.2 | 84.4 | 15 / 35 | 5354 |
| 5 | 1 | 69.7 | 90.5 | 17 / 35 | 5103 |
| 6 | 1 | 69.8 | 89.5 | 17 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 53% |
| kid.Gladiator .7.2 | 58 | 67% |
| jcs.Seth 1.8 | 16 | 56% |
| tcf.Reach 3 | 6 | 83% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 0% |

Hadur died in 116 of 210 rounds, at a mean tick of 1108. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 48 | 41% | 82 |
| kid.Gladiator .7.2 | 41 | 35% | 72 |
| jcs.Seth 1.8 | 15 | 13% | 29 |
| tcf.Reach 3 | 7 | 6% | 18 |
| cli.Dancer 1.1 | 2 | 2% | 4 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 167973 melee ticks, 56123 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51183 sent, 46496 reached their opponent, 7762 virtual hits (16.7% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483323. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.4 | 42 / 210 | 2.40 | 16.5% | 24300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 141 |
| hadur117.Hadur 3.21aa | 2.0 | 16.5% | 42 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.9% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.8% | 8 |
| rz.HawkOnFire 0.1 | 4.8 | 11.2% | 1 |
| wit.Chuliath 1.0 | 6.0 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 83.5 | 7 / 35 | 3951 |
| 2 | 2 | 66.4 | 83.5 | 8 / 35 | 4239 |
| 3 | 2 | 66.6 | 86.0 | 12 / 35 | 3983 |
| 4 | 2 | 66.9 | 87.6 | 8 / 35 | 4139 |
| 5 | 2 | 65.7 | 83.2 | 6 / 35 | 3971 |
| 6 | 2 | 64.9 | 82.5 | 1 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 99 | 19% |
| gh.mini.Gruwel 0.9 | 20 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 58% |
| rz.HawkOnFire 0.1 | 9 | 89% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 109 | 65% | 126 |
| gh.mini.Gruwel 0.9 | 26 | 15% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 12% | 30 |
| rz.HawkOnFire 0.1 | 7 | 4% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 147976 melee ticks, 53690 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 45362 sent, 40517 reached their opponent, 6308 virtual hits (15.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479709. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.5 | 158 / 210 | 1.59 | 21.2% | 33982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.2% | 158 |
| alpha.RainingFire 1.0 | 2.5 | 12.5% | 13 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 10 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 7 |
| mz.Cork 0.1 | 4.5 | 10.6% | 12 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.7% | 6 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.6 | 29 / 35 | 5621 |
| 2 | 1 | 72.0 | 92.4 | 26 / 35 | 5917 |
| 3 | 1 | 71.1 | 91.4 | 27 / 35 | 5570 |
| 4 | 1 | 71.5 | 93.3 | 26 / 35 | 5640 |
| 5 | 1 | 71.2 | 94.0 | 23 / 35 | 5414 |
| 6 | 1 | 72.1 | 94.3 | 27 / 35 | 5820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 93% |
| alpha.RainingFire 1.0 | 40 | 85% |
| bvh.micro.Freya 0.3 | 30 | 90% |
| mz.Cork 0.1 | 28 | 86% |
| bvh.mini.Fenrir 0.39 | 18 | 89% |
| m3thos.Eva02 0.7.1 | 17 | 82% |
| dl.BetterWalls 1.0 | 3 | 67% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 35% | 51 |
| mz.Cork 0.1 | 9 | 17% | 28 |
| m3thos.Eva02 0.7.1 | 7 | 13% | 26 |
| bzdp.Pansy 2.1 | 6 | 12% | 44 |
| bvh.micro.Freya 0.3 | 5 | 10% | 32 |
| bvh.mini.Fenrir 0.39 | 5 | 10% | 15 |
| dl.BetterWalls 1.0 | 2 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 141023 melee ticks, 43782 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48715 sent, 44167 reached their opponent, 8829 virtual hits (20.0% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491953. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 239 over 6 battles (39.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.0 | 169 / 210 | 1.81 | 19.9% | 34412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.9% | 169 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 10.6% | 8 |
| EBBU.Sim2 1.02 | 3.7 | 9.9% | 0 |
| germ.TheMind .2 | 4.2 | 9.7% | 4 |
| lmk.ACPFinal 0.1 | 6.0 | 8.9% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.6% | 3 |
| agrach.Dalek 1.0 | 7.2 | 8.6% | 8 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.4% | 6 |
| mb.Beast 0.1 | 7.7 | 8.2% | 4 |
| skm.Ryubot 1.0 | 9.2 | 7.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 27 / 35 | 5558 |
| 2 | 1 | 69.9 | 93.7 | 29 / 35 | 5969 |
| 3 | 1 | 68.6 | 88.3 | 26 / 35 | 5834 |
| 4 | 1 | 69.3 | 90.5 | 27 / 35 | 5989 |
| 5 | 1 | 70.2 | 95.2 | 31 / 35 | 5568 |
| 6 | 1 | 68.4 | 88.9 | 29 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 33 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 93% |
| germ.TheMind .2 | 27 | 100% |
| stelo.UntouchableNano 1.3 | 25 | 92% |
| mb.Beast 0.1 | 18 | 100% |
| lmk.ACPFinal 0.1 | 17 | 88% |
| agrach.Dalek 1.0 | 16 | 94% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 33% | 19 |
| lmk.ACPFinal 0.1 | 10 | 24% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 17% | 33 |
| agrach.Dalek 1.0 | 4 | 10% | 27 |
| stelo.UntouchableNano 1.3 | 3 | 7% | 22 |
| germ.TheMind .2 | 2 | 5% | 12 |
| EBBU.Sim2 1.02 | 1 | 2% | 34 |
| mb.Beast 0.1 | 1 | 2% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 93976 melee ticks, 27491 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 31779 sent, 27403 reached their opponent, 8106 virtual hits (29.6% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501888. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.4 | 117 / 210 | 2.05 | 18.6% | 28368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.6% | 117 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 58 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 10 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.3% | 14 |
| cs.Wren 1.0 | 5.0 | 10.3% | 2 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.3 | 22 / 35 | 4469 |
| 2 | 1 | 67.5 | 85.7 | 14 / 35 | 4534 |
| 3 | 1 | 69.1 | 90.2 | 20 / 35 | 4695 |
| 4 | 1 | 68.9 | 87.9 | 21 / 35 | 4905 |
| 5 | 1 | 68.2 | 87.3 | 19 / 35 | 4561 |
| 6 | 1 | 69.9 | 90.8 | 21 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 77 | 69% |
| bts.mega.Gnarly 1.4 | 34 | 79% |
| bvh.mini.Freya 0.55 | 19 | 74% |
| kdf.KoulDestroyer 1.0 | 12 | 83% |
| cs.Wren 1.0 | 11 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 49% | 93 |
| bts.mega.Gnarly 1.4 | 16 | 17% | 43 |
| bvh.mini.Freya 0.55 | 15 | 16% | 28 |
| kdf.KoulDestroyer 1.0 | 10 | 11% | 20 |
| cs.Wren 1.0 | 3 | 3% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 134518 melee ticks, 41572 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 27 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44828 sent, 39894 reached their opponent, 8413 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483897. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.8 | 146 / 210 | 1.58 | 22.6% | 33922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.6% | 146 |
| bvh.fry.Freya 0.82 | 2.0 | 16.1% | 13 |
| az.Ololobot 0.2.4 | 3.0 | 14.2% | 41 |
| winamp32.micro.MicroMacro 1.0 | 4.3 | 9.8% | 2 |
| gimp.GimpBot 0.1 | 5.8 | 8.4% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 8.3% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 8.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 5.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.0 | 20 / 35 | 5261 |
| 2 | 1 | 70.4 | 92.5 | 25 / 35 | 5380 |
| 3 | 1 | 71.9 | 96.1 | 29 / 35 | 5870 |
| 4 | 1 | 71.4 | 92.5 | 23 / 35 | 6139 |
| 5 | 1 | 71.7 | 94.6 | 27 / 35 | 5847 |
| 6 | 1 | 69.8 | 91.1 | 22 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 81 | 91% |
| az.Ololobot 0.2.4 | 76 | 61% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 75% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 34 | 52% | 86 |
| bvh.fry.Freya 0.82 | 21 | 32% | 76 |
| apollokidd.ApolloKidd 0.9 | 5 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 3% | 5 |
| gimp.GimpBot 0.1 | 1 | 2% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 148921 melee ticks, 71751 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 150 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 150 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44871 sent, 40726 reached their opponent, 7596 virtual hits (18.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482184. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.4 | 140 / 210 | 1.86 | 20.3% | 32519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.3% | 140 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.9% | 16 |
| mz.AntiGrav 1.0 | 3.8 | 11.5% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.3% | 8 |
| stelo.Randomness 1.0 | 6.3 | 8.6% | 5 |
| alpha.BlackIce 1.0 | 6.7 | 8.2% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.2% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 27 / 35 | 5644 |
| 2 | 1 | 69.8 | 88.9 | 20 / 35 | 5241 |
| 3 | 1 | 70.4 | 88.3 | 23 / 35 | 5274 |
| 4 | 1 | 70.5 | 89.8 | 24 / 35 | 5329 |
| 5 | 1 | 70.2 | 88.3 | 22 / 35 | 5458 |
| 6 | 1 | 71.6 | 92.4 | 24 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 79% |
| kano.gamma.KanoGamma 1.8 | 42 | 83% |
| mz.AntiGrav 1.0 | 33 | 94% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| stelo.Randomness 1.0 | 7 | 86% |
| alpha.BlackIce 1.0 | 2 | 50% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 25 | 36% | 65 |
| kano.gamma.KanoGamma 1.8 | 15 | 21% | 56 |
| Polkwane.SmashMelee 1.0 | 9 | 13% | 22 |
| mz.AntiGrav 1.0 | 8 | 11% | 28 |
| stelo.Randomness 1.0 | 6 | 9% | 22 |
| alpha.BlackIce 1.0 | 3 | 4% | 8 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 3 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 150220 melee ticks, 43576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 94 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48702 sent, 43818 reached their opponent, 9114 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474309. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.1 | 108 / 210 | 2.07 | 18.5% | 27661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.5% | 108 |
| eem.EvBotNG v12.8 | 2.0 | 15.3% | 64 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.0% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.0% | 10 |
| shrub.Silver v048 | 6.2 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.6% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.9 | 13 / 35 | 4562 |
| 2 | 1 | 69.6 | 91.1 | 20 / 35 | 4592 |
| 3 | 1 | 69.9 | 91.4 | 23 / 35 | 4717 |
| 4 | 1 | 68.3 | 87.6 | 16 / 35 | 4539 |
| 5 | 1 | 68.6 | 87.0 | 21 / 35 | 4439 |
| 6 | 1 | 69.2 | 89.8 | 15 / 35 | 4812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 43% |
| ary.Swarm 1.1 | 34 | 88% |
| lessonz.robocode.Oz 0.5.0 | 34 | 85% |
| simonton.nano.MeleeSeed 1.8 | 13 | 92% |
| shrub.Silver v048 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 55% | 84 |
| lessonz.robocode.Oz 0.5.0 | 18 | 18% | 47 |
| ary.Swarm 1.1 | 16 | 16% | 38 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 24 |
| shrub.Silver v048 | 1 | 1% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 200 rounds): 152040 melee ticks, 46800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 71 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49502 sent, 44709 reached their opponent, 7008 virtual hits (15.7% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492030. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.0 | 137 / 210 | 1.72 | 20.6% | 37059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 137 |
| wompi.Wallaby 5.1 | 2.2 | 15.2% | 31 |
| ara.Shera 0.88 | 3.3 | 13.9% | 26 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.5% | 12 |
| amz.NanoClone 1.41 | 5.3 | 7.6% | 1 |
| dsw.StaticD 1.0 | 7.2 | 6.6% | 2 |
| maribo.IotaCT 1.1 | 7.3 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.0 | 6.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.0 | 22 / 35 | 6445 |
| 2 | 1 | 71.6 | 92.4 | 25 / 35 | 6308 |
| 3 | 1 | 71.8 | 93.7 | 25 / 35 | 6307 |
| 4 | 1 | 70.4 | 89.8 | 19 / 35 | 5945 |
| 5 | 1 | 70.2 | 89.5 | 21 / 35 | 5967 |
| 6 | 1 | 71.5 | 92.4 | 25 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 76 | 83% |
| maribo.mini.MiniQuester 0.1 | 48 | 94% |
| ara.Shera 0.88 | 37 | 68% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 50% |
| dsw.StaticD 1.0 | 1 | 0% |

Hadur died in 73 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 36% | 86 |
| ara.Shera 0.88 | 26 | 36% | 51 |
| maribo.mini.MiniQuester 0.1 | 14 | 19% | 54 |
| dsw.StaticD 1.0 | 3 | 4% | 5 |
| amz.NanoClone 1.41 | 2 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 167818 melee ticks, 44771 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51534 sent, 46907 reached their opponent, 9466 virtual hits (20.2% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492017. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.7 | 36 / 210 | 2.83 | 16.0% | 25719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 140 |
| hadur117.Hadur 3.21aa | 2.0 | 16.0% | 36 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 27 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 0 |
| mz.NanoGod 2.02 | 7.2 | 8.0% | 2 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 76.8 | 3 / 35 | 4260 |
| 2 | 2 | 67.3 | 84.1 | 5 / 35 | 4337 |
| 3 | 2 | 66.5 | 81.3 | 7 / 35 | 4141 |
| 4 | 2 | 65.2 | 76.2 | 6 / 35 | 4025 |
| 5 | 2 | 66.2 | 78.7 | 5 / 35 | 4415 |
| 6 | 2 | 67.4 | 81.0 | 10 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 20% |
| brainfade.melee.Dusk 0.44 | 24 | 54% |
| dummy.micro.Sparrow 2.5 | 10 | 70% |
| mz.NanoGod 2.02 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 93 | 53% | 108 |
| brainfade.melee.Dusk 0.44 | 36 | 20% | 48 |
| dummy.micro.Sparrow 2.5 | 22 | 13% | 30 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 6 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 155745 melee ticks, 44108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 32 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 48731 sent, 43849 reached their opponent, 6939 virtual hits (15.8% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484347. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.1 | 152 / 210 | 1.53 | 21.3% | 36021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 152 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 40 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.9% | 12 |
| jwirde.Gort 2.0 | 4.5 | 9.3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.5% | 0 |
| disan.Chair 2.2.0 | 6.3 | 7.8% | 1 |
| wompi.Quokka 1.6 | 7.0 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 25 / 35 | 6148 |
| 2 | 1 | 71.2 | 92.4 | 24 / 35 | 5917 |
| 3 | 1 | 71.3 | 93.7 | 24 / 35 | 5525 |
| 4 | 1 | 72.5 | 96.5 | 29 / 35 | 6138 |
| 5 | 1 | 72.4 | 95.9 | 27 / 35 | 6358 |
| 6 | 1 | 71.1 | 90.8 | 23 / 35 | 5935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 74% |
| tzu.TheArtOfWar 1.2 | 65 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 100% |
| disan.Chair 2.2.0 | 8 | 88% |
| jwirde.Gort 2.0 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 64% | 102 |
| tzu.TheArtOfWar 1.2 | 11 | 19% | 60 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 10% | 15 |
| jwirde.Gort 2.0 | 3 | 5% | 16 |
| wompi.Quokka 1.6 | 1 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 6 |
| disan.Chair 2.2.0 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 151720 melee ticks, 47551 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 88 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51648 sent, 47003 reached their opponent, 9888 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473350. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.7 | 110 / 210 | 1.93 | 20.2% | 34141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.2% | 110 |
| jje.BagPuss 1.2 | 2.5 | 12.5% | 18 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.2% | 58 |
| sul.Lunar 1.1 | 3.8 | 11.2% | 16 |
| myl.nano.Graviton 1.10 | 4.7 | 10.2% | 2 |
| fm.claire 1.7 | 6.3 | 9.1% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.7% | 4 |
| hvilela.HVilela 0.9 | 7.7 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.0% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 23 / 35 | 5758 |
| 2 | 1 | 69.1 | 85.4 | 15 / 35 | 5887 |
| 3 | 1 | 69.8 | 89.8 | 15 / 35 | 5650 |
| 4 | 1 | 69.7 | 88.6 | 19 / 35 | 5619 |
| 5 | 1 | 69.5 | 88.6 | 18 / 35 | 5336 |
| 6 | 1 | 71.2 | 92.1 | 20 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 71 | 54% |
| jje.BagPuss 1.2 | 30 | 67% |
| sul.Lunar 1.1 | 28 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 14 | 71% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| wit.Deep7 2.0 | 3 | 100% |
| fm.claire 1.7 | 3 | 67% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 35 | 35% | 0 |
| jje.BagPuss 1.2 | 25 | 25% | 66 |
| sul.Lunar 1.1 | 12 | 12% | 56 |
| myl.nano.Graviton 1.10 | 12 | 12% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 19 |
| fm.claire 1.7 | 6 | 6% | 12 |
| hvilela.HVilela 0.9 | 4 | 4% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 196422 melee ticks, 85577 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 38 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 60009 sent, 55325 reached their opponent, 8115 virtual hits (14.7% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490541. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.7 | 128 / 210 | 1.75 | 21.4% | 29830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.4% | 128 |
| kc.mini.Mirage 0.2 | 2.0 | 19.0% | 64 |
| mz.MicroSheep 1.0 | 3.2 | 12.4% | 3 |
| cx.Princess 1.0 | 4.2 | 11.3% | 11 |
| sadoner.killer 0.2 | 4.7 | 10.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.0% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.7% | 0 |
| kurios.DOSexe .9a | 7.7 | 6.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 22 / 35 | 4831 |
| 2 | 1 | 69.2 | 88.2 | 20 / 35 | 5028 |
| 3 | 1 | 69.5 | 91.1 | 20 / 35 | 4836 |
| 4 | 1 | 71.2 | 94.3 | 25 / 35 | 5141 |
| 5 | 1 | 69.2 | 88.9 | 21 / 35 | 4788 |
| 6 | 1 | 70.2 | 90.0 | 20 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 133 | 74% |
| cx.Princess 1.0 | 16 | 69% |
| mz.MicroSheep 1.0 | 12 | 83% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| sadoner.killer 0.2 | 5 | 80% |

Hadur died in 82 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 54 | 66% | 146 |
| cx.Princess 1.0 | 11 | 13% | 24 |
| mz.MicroSheep 1.0 | 7 | 9% | 23 |
| sadoner.killer 0.2 | 6 | 7% | 9 |
| arthord.NanoSatanMelee Beta | 2 | 2% | 5 |
| kurios.DOSexe .9a | 2 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 139305 melee ticks, 56776 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38683 sent, 34550 reached their opponent, 5716 virtual hits (16.5% of those reached).

