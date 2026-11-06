# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1751934. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.6 | 52 / 210 | 2.20 | 18.0% | 33849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.7% | 138 |
| hadur117.Hadur 3.21aa | 1.8 | 18.0% | 52 |
| sgp.JollyNinja 3.53 | 3.0 | 12.0% | 14 |
| mz.MicroGodMelee 1 | 5.0 | 10.1% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.3% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 10.3% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.2% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 86.0 | 11 / 35 | 5399 |
| 2 | 2 | 67.4 | 84.4 | 9 / 35 | 5325 |
| 3 | 1 | 69.1 | 89.2 | 10 / 35 | 5882 |
| 4 | 2 | 67.9 | 85.7 | 7 / 35 | 5418 |
| 5 | 2 | 68.4 | 85.7 | 8 / 35 | 5956 |
| 6 | 2 | 68.6 | 88.6 | 7 / 35 | 5869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 8% |
| sgp.JollyNinja 3.53 | 25 | 64% |
| lorneswork.Predator 1.0 | 10 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| mz.MicroGodMelee 1 | 7 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1157. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 75% | 135 |
| sgp.JollyNinja 3.53 | 22 | 14% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 16 |
| lorneswork.Predator 1.0 | 6 | 4% | 10 |
| mz.MicroGodMelee 1 | 2 | 1% | 8 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 136192 melee ticks, 84841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 42728 sent, 37769 reached their opponent, 7164 virtual hits (19.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1832623. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 253 over 6 battles (42.2 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.2 | 120 / 210 | 1.97 | 19.8% | 33192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.8% | 120 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.8% | 37 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 10.5% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.9% | 2 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.2% | 2 |
| sch.Simone 0.3d | 7.2 | 7.5% | 7 |
| Noran.BitchingElk 0.054 | 7.3 | 7.2% | 8 |
| stelo.PatternRobot 1.0 | 9.0 | 5.1% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 21 / 35 | 5473 |
| 2 | 1 | 69.4 | 88.9 | 18 / 35 | 5518 |
| 3 | 1 | 70.3 | 89.8 | 20 / 35 | 5759 |
| 4 | 1 | 70.5 | 90.8 | 23 / 35 | 5574 |
| 5 | 1 | 70.2 | 89.2 | 20 / 35 | 5470 |
| 6 | 1 | 69.3 | 86.3 | 18 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 81% |
| sch.Simone 0.3d | 16 | 75% |
| Noran.BitchingElk 0.054 | 15 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 34% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 19 | 21% | 53 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 12% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 17 |
| Noran.BitchingElk 0.054 | 6 | 7% | 20 |
| sch.Simone 0.3d | 6 | 7% | 11 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 10 |
| stelo.PatternRobot 1.0 | 2 | 2% | 3 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 165453 melee ticks, 46572 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 56978 sent, 52143 reached their opponent, 8485 virtual hits (16.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1815837. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.5 | 169 / 210 | 1.59 | 21.3% | 40491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.3% | 169 |
| radnor.DoctorBob 1.42 | 2.2 | 14.0% | 17 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 4 |
| vuen.Cake 2.51 | 3.7 | 12.6% | 18 |
| urdos.URDOS 1.3 | 5.3 | 8.9% | 0 |
| adt.Ar1 2.1 | 5.8 | 7.7% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 4.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.4 | 25 / 35 | 6034 |
| 2 | 1 | 71.6 | 92.7 | 27 / 35 | 6832 |
| 3 | 1 | 72.2 | 93.7 | 31 / 35 | 6867 |
| 4 | 1 | 71.5 | 92.1 | 26 / 35 | 6906 |
| 5 | 1 | 72.5 | 94.9 | 30 / 35 | 6961 |
| 6 | 1 | 72.4 | 95.2 | 30 / 35 | 6891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 88% |
| radnor.DoctorBob 1.42 | 58 | 98% |
| kawigi.nano.Lib 1.0 | 33 | 91% |
| oa.weak.FlyMk1 0.1 | 4 | 75% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 15 | 36% | 78 |
| radnor.DoctorBob 1.42 | 12 | 29% | 61 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 19% | 9 |
| kawigi.nano.Lib 1.0 | 6 | 14% | 39 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 5 |
| urdos.URDOS 1.3 | 0 | 0% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 126949 melee ticks, 45591 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37335 sent, 32486 reached their opponent, 7826 virtual hits (24.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1830383. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 35 / 210 | 2.14 | 18.4% | 36413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 164 |
| hadur117.Hadur 3.21aa | 2.0 | 18.4% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 5 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 3 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 87.3 | 6 / 35 | 5874 |
| 2 | 2 | 69.5 | 86.0 | 6 / 35 | 6551 |
| 3 | 2 | 69.5 | 88.6 | 6 / 35 | 5915 |
| 4 | 2 | 69.5 | 88.3 | 8 / 35 | 5961 |
| 5 | 2 | 69.0 | 86.7 | 3 / 35 | 6108 |
| 6 | 2 | 69.3 | 87.3 | 6 / 35 | 6004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 12% |
| TNT.TNT 0.99.1 | 13 | 69% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| josago.Jorgito 0.16 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 78% | 155 |
| apc.LeeroyJenkins2 1.0 | 23 | 13% | 27 |
| TNT.TNT 0.99.1 | 8 | 5% | 17 |
| josago.Jorgito 0.16 | 5 | 3% | 7 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 186851 melee ticks, 75918 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 94 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56165 sent, 51237 reached their opponent, 7177 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1855271. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.3 | 32 / 210 | 2.95 | 15.5% | 25755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.0% | 105 |
| justin.DemonicRage 3.4 | 2.2 | 16.7% | 53 |
| hadur117.Hadur 3.21aa | 2.8 | 15.5% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 17 |
| ms.Ares 0.19 | 5.2 | 9.7% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.9% | 3 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 3.9% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.2 | 81.3 | 7 / 35 | 4651 |
| 2 | 3 | 64.3 | 79.0 | 4 / 35 | 3908 |
| 3 | 3 | 64.9 | 78.4 | 5 / 35 | 4530 |
| 4 | 3 | 64.1 | 76.2 | 6 / 35 | 4184 |
| 5 | 2 | 65.0 | 78.1 | 4 / 35 | 4537 |
| 6 | 3 | 64.0 | 76.8 | 6 / 35 | 3945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 39 | 51% |
| cb.fire.Firestarter 2.0f | 37 | 3% |
| wompi.Numbat 2.1 | 15 | 67% |
| ms.Ares 0.19 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 179 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 40% | 77 |
| justin.DemonicRage 3.4 | 56 | 31% | 74 |
| wompi.Numbat 2.1 | 26 | 15% | 30 |
| axeBots.HataMoto 3.09 | 14 | 8% | 14 |
| ms.Ares 0.19 | 7 | 4% | 10 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 150923 melee ticks, 32016 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 71 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45376 sent, 40364 reached their opponent, 6402 virtual hits (15.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1789864. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.4 | 156 / 210 | 1.60 | 21.1% | 35254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.1% | 156 |
| jekl.StoneGhost 0.7 | 2.0 | 14.4% | 19 |
| origin.SleepSiphon 1.7b | 3.3 | 12.7% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.7% | 5 |
| mld.Wisdom 1.0 | 4.7 | 10.4% | 0 |
| gg.Wolverine 2.0 | 5.8 | 8.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 5 |
| DBall.NUKE 0.1 | 8.2 | 5.8% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.0 | 28 / 35 | 5954 |
| 2 | 1 | 71.7 | 94.0 | 26 / 35 | 6038 |
| 3 | 1 | 71.7 | 92.1 | 26 / 35 | 5980 |
| 4 | 1 | 71.1 | 92.1 | 23 / 35 | 5691 |
| 5 | 1 | 71.3 | 93.7 | 24 / 35 | 5650 |
| 6 | 1 | 72.5 | 95.6 | 29 / 35 | 5941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 95% |
| origin.SleepSiphon 1.7b | 63 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| gg.Wolverine 2.0 | 11 | 73% |
| mld.Wisdom 1.0 | 4 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 22 | 40% | 77 |
| jekl.StoneGhost 0.7 | 14 | 25% | 54 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 11% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 11% | 16 |
| gg.Wolverine 2.0 | 3 | 5% | 13 |
| mld.Wisdom 1.0 | 2 | 4% | 15 |
| DBall.NUKE 0.1 | 1 | 2% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 144268 melee ticks, 48273 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 43267 sent, 38471 reached their opponent, 7925 virtual hits (20.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1835578. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.4 | 95.5 | 160 / 210 | 1.36 | 26.0% | 47884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 26.0% | 160 |
| rtk.Tachikoma 1.0 | 2.0 | 18.8% | 27 |
| franzor.Lizt 1.3.1 | 3.5 | 12.6% | 12 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 5.7 | 9.0% | 1 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.3 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.9 | 97.1 | 29 / 35 | 8217 |
| 2 | 1 | 75.6 | 96.1 | 26 / 35 | 8077 |
| 3 | 1 | 74.9 | 93.2 | 25 / 35 | 8050 |
| 4 | 1 | 74.3 | 94.3 | 23 / 35 | 7520 |
| 5 | 1 | 76.0 | 96.8 | 29 / 35 | 8031 |
| 6 | 1 | 75.5 | 95.4 | 28 / 35 | 7989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 112 | 80% |
| oog.melee.CapuletDroid 1.1 | 41 | 88% |
| franzor.Lizt 1.3.1 | 37 | 86% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 1481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 33 | 65% | 132 |
| franzor.Lizt 1.3.1 | 8 | 16% | 5 |
| oog.melee.CapuletDroid 1.1 | 7 | 14% | 55 |
| exauge.GateKeeper 1.1.121g | 1 | 2% | 11 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 191405 melee ticks, 86079 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 43 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51362 sent, 47185 reached their opponent, 9790 virtual hits (20.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1720905. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 65). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 149 / 210 | 1.64 | 23.1% | 33580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.1% | 149 |
| tm.Yuugao 1.0 | 2.2 | 14.8% | 27 |
| shrub.Vapour v159 | 3.0 | 13.4% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 11.8% | 11 |
| m3thos.Eva00 1.1 | 5.0 | 10.3% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.0% | 4 |
| qualidafial.MajorDick 1.0.1 | 7.3 | 7.1% | 0 |
| SHAM.WOW 1.4 | 8.0 | 5.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.1 | 26 / 35 | 5690 |
| 2 | 1 | 73.0 | 97.5 | 30 / 35 | 5895 |
| 3 | 1 | 70.3 | 89.6 | 24 / 35 | 5156 |
| 4 | 1 | 70.5 | 90.0 | 22 / 35 | 5285 |
| 5 | 1 | 71.5 | 91.8 | 24 / 35 | 5691 |
| 6 | 1 | 71.4 | 92.1 | 23 / 35 | 5863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 73 | 77% |
| shrub.Vapour v159 | 40 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 37 | 92% |
| m3thos.Eva00 1.1 | 12 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 20 | 33% | 77 |
| shrub.Vapour v159 | 18 | 30% | 56 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 23% | 40 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 7% | 15 |
| m3thos.Eva00 1.1 | 2 | 3% | 9 |
| SHAM.WOW 1.4 | 1 | 2% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |

Posture (Hadur's M records, 198 rounds): 144350 melee ticks, 46980 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 3.

Targeting waves (198 rounds): 42543 sent, 38124 reached their opponent, 6643 virtual hits (17.4% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1832471. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.2 | 60 / 210 | 2.79 | 16.2% | 23425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 95 |
| hadur117.Hadur 3.21aa | 1.8 | 16.2% | 60 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 28 |
| yagami.Tidus 0.11 | 4.3 | 10.6% | 5 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.1% | 14 |
| mc2.enemy.Original 0.9 | 5.8 | 8.9% | 4 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 81.9 | 12 / 35 | 4479 |
| 2 | 2 | 62.8 | 74.6 | 10 / 35 | 3518 |
| 3 | 3 | 63.5 | 78.7 | 6 / 35 | 3323 |
| 4 | 1 | 66.7 | 85.1 | 13 / 35 | 4080 |
| 5 | 1 | 66.2 | 83.5 | 11 / 35 | 4380 |
| 6 | 2 | 63.9 | 77.1 | 8 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 28% |
| kc.micro.Figment 1.0 | 32 | 69% |
| mc2.enemy.Original 0.9 | 12 | 83% |
| pedersen.Grishnakh 1.0 | 9 | 33% |
| yagami.Tidus 0.11 | 7 | 71% |
| dft.Calliope 5.6 | 5 | 60% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |

Hadur died in 151 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 68 | 45% | 87 |
| kc.micro.Figment 1.0 | 30 | 20% | 50 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 13 |
| mc2.enemy.Original 0.9 | 11 | 7% | 22 |
| yagami.Tidus 0.11 | 10 | 7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 9 |
| dft.Calliope 5.6 | 8 | 5% | 11 |
| step.nanoPri 1.0 | 1 | 1% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149259 melee ticks, 39468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 60 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47078 sent, 42279 reached their opponent, 5992 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1820896. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 237 over 6 battles (39.5 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 96.5 | 173 / 210 | 1.31 | 21.5% | 36932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 173 |
| DTF.Kludgy 1.2b | 2.0 | 13.8% | 16 |
| ejb.Polaris 1.0.1 | 3.3 | 12.7% | 11 |
| ne.Chimera 1.2 | 3.7 | 12.4% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.6% | 2 |
| sam.Samspin 1.0 | 7.7 | 5.5% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.8 | 27 / 35 | 6116 |
| 2 | 1 | 72.6 | 98.1 | 31 / 35 | 6109 |
| 3 | 1 | 71.3 | 95.2 | 29 / 35 | 5682 |
| 4 | 1 | 72.1 | 95.6 | 29 / 35 | 6021 |
| 5 | 1 | 72.8 | 96.8 | 30 / 35 | 6464 |
| 6 | 1 | 72.7 | 96.5 | 27 / 35 | 6540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 70 | 84% |
| ejb.Polaris 1.0.1 | 44 | 89% |
| ne.Chimera 1.2 | 36 | 97% |
| vStar.RAFzilla 2.15 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 38 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 42% | 69 |
| ejb.Polaris 1.0.1 | 7 | 18% | 54 |
| ne.Chimera 1.2 | 7 | 18% | 33 |
| vStar.RAFzilla 2.15 | 3 | 8% | 23 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 17 |
| kurios.DOSexe .9b | 1 | 3% | 10 |
| sam.Samspin 1.0 | 1 | 3% | 2 |
| donjezza.Muncho 1.0 | 1 | 3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 141375 melee ticks, 55950 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 4.

Targeting waves (198 rounds): 45183 sent, 40321 reached their opponent, 7140 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1831110. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.7 | 88 / 210 | 2.38 | 17.5% | 25400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 17.5% | 88 |
| rz.Aleph 0.34 | 1.8 | 16.5% | 74 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.8% | 11 |
| djc.DynaBot 0.1.1 | 4.0 | 10.4% | 11 |
| rdt199.Warlord 0.73 | 5.3 | 9.5% | 12 |
| br2.MobyDickBot 1.6 | 6.3 | 8.3% | 7 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 6.9% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 18 / 35 | 4588 |
| 2 | 1 | 67.7 | 85.7 | 14 / 35 | 4650 |
| 3 | 2 | 64.7 | 80.0 | 12 / 35 | 3970 |
| 4 | 1 | 65.8 | 83.8 | 11 / 35 | 4032 |
| 5 | 1 | 66.8 | 85.4 | 16 / 35 | 4114 |
| 6 | 1 | 66.5 | 82.9 | 17 / 35 | 4046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 50% |
| cx.mini.Nimrod 0.55 | 22 | 73% |
| djc.DynaBot 0.1.1 | 20 | 75% |
| uji.YellohFellah 1.0 | 12 | 67% |
| br2.MobyDickBot 1.6 | 11 | 73% |
| rdt199.Warlord 0.73 | 11 | 82% |

Hadur died in 122 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 48% | 89 |
| cx.mini.Nimrod 0.55 | 19 | 16% | 34 |
| rdt199.Warlord 0.73 | 15 | 12% | 25 |
| uji.YellohFellah 1.0 | 9 | 7% | 18 |
| djc.DynaBot 0.1.1 | 7 | 6% | 20 |
| br2.MobyDickBot 1.6 | 7 | 6% | 16 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 155015 melee ticks, 40891 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49474 sent, 44478 reached their opponent, 5828 virtual hits (13.1% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1877540. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.8 | 114 / 210 | 2.28 | 18.1% | 25454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.1% | 114 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.9% | 33 |
| darkcanuck.Leon 1.01 | 3.2 | 12.7% | 20 |
| nat.PallasHawk 1.0 | 3.7 | 12.8% | 35 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.1% | 6 |
| jrm.Test0 1.0 | 6.2 | 8.7% | 1 |
| cs.sheldor.Talon 1.1 | 6.8 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.5 | 6.1% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.1 | 15 / 35 | 4093 |
| 2 | 1 | 69.1 | 88.6 | 22 / 35 | 4734 |
| 3 | 1 | 67.6 | 86.3 | 21 / 35 | 4031 |
| 4 | 1 | 66.7 | 82.5 | 18 / 35 | 4230 |
| 5 | 1 | 65.6 | 81.6 | 14 / 35 | 3827 |
| 6 | 1 | 69.3 | 90.8 | 24 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 71% |
| darkcanuck.Leon 1.01 | 47 | 87% |
| nat.PallasHawk 1.0 | 35 | 51% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 29% | 54 |
| nat.PallasHawk 1.0 | 22 | 23% | 44 |
| darkcanuck.Leon 1.01 | 15 | 15% | 61 |
| brainfade.melee.Genghis 0.36 | 12 | 12% | 18 |
| jrm.Test0 1.0 | 10 | 10% | 12 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 10 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 126328 melee ticks, 37389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42489 sent, 37435 reached their opponent, 6078 virtual hits (16.2% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1795772. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.7 | 66 / 210 | 2.56 | 16.5% | 27248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.7 | 16.5% | 66 |
| mn.Combat 3.25.0 | 2.2 | 16.3% | 83 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 36 |
| shinh.Entangled 0.3 | 4.2 | 12.4% | 14 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.4% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.3% | 0 |
| maribo.FollowFire 1 | 8.3 | 4.8% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 87.0 | 11 / 35 | 4524 |
| 2 | 1 | 67.0 | 83.8 | 11 / 35 | 4841 |
| 3 | 1 | 66.5 | 85.1 | 12 / 35 | 4596 |
| 4 | 3 | 63.2 | 74.3 | 6 / 35 | 4106 |
| 5 | 1 | 66.5 | 82.5 | 12 / 35 | 4689 |
| 6 | 2 | 66.7 | 83.5 | 14 / 35 | 4492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 25% |
| ags.Glacier 0.2.11 | 43 | 58% |
| shinh.Entangled 0.3 | 25 | 80% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 40% | 71 |
| ags.Glacier 0.2.11 | 49 | 34% | 76 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 21 |
| shinh.Entangled 0.3 | 12 | 8% | 27 |
| maribo.FollowFire 1 | 6 | 4% | 6 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 144064 melee ticks, 48408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 71 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 41367 sent, 36116 reached their opponent, 5264 virtual hits (14.6% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1855941. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 97.1 | 191 / 210 | 1.23 | 24.9% | 39923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.9% | 191 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.9% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 3.7 | 10.7% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.4% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.3% | 4 |
| pa.Improved 1.0 | 7.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 96.4 | 31 / 35 | 6751 |
| 2 | 1 | 73.8 | 97.9 | 32 / 35 | 6621 |
| 3 | 1 | 73.7 | 97.1 | 34 / 35 | 6663 |
| 4 | 1 | 72.3 | 94.6 | 30 / 35 | 6116 |
| 5 | 1 | 74.2 | 98.2 | 33 / 35 | 6763 |
| 6 | 1 | 74.3 | 98.2 | 31 / 35 | 7009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 121 | 98% |
| sheldor.micro.PointInLineRRAL 1.0 | 27 | 89% |
| sanyi.mikrobi.Roberto 1.0 | 26 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 7 | 37% | 111 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 21% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 16% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 16% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 11% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 9 |
| pa.Improved 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 122362 melee ticks, 55555 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 86 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35669 sent, 31467 reached their opponent, 7855 virtual hits (25.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1823318. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 229 over 6 battles (38.2 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.7 | 123 / 210 | 2.01 | 19.6% | 32312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.6% | 123 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 17 |
| emp.Yngwie 1.11 | 3.0 | 12.9% | 48 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 9 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 2 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.8% | 11 |
| lambdaxy.TBot 0.1 | 7.3 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.8% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 18 / 35 | 4898 |
| 2 | 1 | 71.2 | 93.3 | 24 / 35 | 5675 |
| 3 | 1 | 70.5 | 89.8 | 21 / 35 | 5693 |
| 4 | 1 | 70.0 | 88.3 | 22 / 35 | 5434 |
| 5 | 1 | 69.7 | 88.6 | 19 / 35 | 5370 |
| 6 | 1 | 68.8 | 85.4 | 19 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 58% |
| kawigi.micro.Shiz 1.1 | 42 | 95% |
| mld.DustBunny 3.8 | 27 | 96% |
| kawigi.robot.Girl 1.2 | 17 | 71% |
| cb.nano.Insomnia 1.0 | 9 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 43% | 79 |
| kawigi.micro.Shiz 1.1 | 13 | 15% | 48 |
| kawigi.robot.Girl 1.2 | 12 | 14% | 17 |
| mld.DustBunny 3.8 | 11 | 13% | 29 |
| cb.nano.Insomnia 1.0 | 10 | 11% | 16 |
| lambdaxy.TBot 0.1 | 2 | 2% | 6 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |
| divineomega.TrialBot 0.003 | 0 | 0% | 10 |

Posture (Hadur's M records, 201 rounds): 157727 melee ticks, 44333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 58 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50967 sent, 46106 reached their opponent, 7210 virtual hits (15.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1839016. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.5 | 116 / 210 | 1.94 | 20.0% | 35354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.0% | 116 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 57 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.2% | 23 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.8% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.9% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 21 / 35 | 5914 |
| 2 | 1 | 70.5 | 89.2 | 21 / 35 | 5789 |
| 3 | 1 | 70.3 | 90.5 | 17 / 35 | 5674 |
| 4 | 1 | 69.5 | 88.3 | 18 / 35 | 5585 |
| 5 | 1 | 69.4 | 85.4 | 16 / 35 | 5800 |
| 6 | 1 | 71.8 | 91.4 | 23 / 35 | 6592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 65% |
| techdude.forest.FlamingForest 1.1 | 32 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 94% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 41 | 44% | 104 |
| techdude.forest.FlamingForest 1.1 | 17 | 18% | 32 |
| bvh.fnr.Fenrir 0.36l | 15 | 16% | 23 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 11% | 25 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 5 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 8 |
| asd.Cthulhu 1.3 | 3 | 3% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 166612 melee ticks, 58605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 53682 sent, 48954 reached their opponent, 7916 virtual hits (16.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1827487. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.8 | 120 / 210 | 2.00 | 20.1% | 36989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.1% | 120 |
| et.Predator 1.8 | 2.5 | 13.7% | 16 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.5% | 24 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 42 |
| ahf.NanoAndrew .4 | 5.0 | 10.6% | 6 |
| maribo.melee.BMV 0.1 | 6.3 | 8.8% | 1 |
| nic.Nicator 2.4 | 6.7 | 8.5% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.7 | 18 / 35 | 6661 |
| 2 | 1 | 71.2 | 90.2 | 22 / 35 | 6119 |
| 3 | 1 | 68.9 | 82.5 | 18 / 35 | 5999 |
| 4 | 1 | 71.2 | 91.4 | 21 / 35 | 6215 |
| 5 | 1 | 70.1 | 89.5 | 19 / 35 | 5935 |
| 6 | 1 | 71.3 | 92.7 | 22 / 35 | 6060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 58 | 88% |
| oog.melee.Mercutio 1.0 | 41 | 76% |
| cx.BlestPain 1.41 | 31 | 48% |
| ahf.NanoAndrew .4 | 15 | 93% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 38% | 59 |
| et.Predator 1.8 | 21 | 23% | 56 |
| oog.melee.Mercutio 1.0 | 15 | 16% | 48 |
| maribo.melee.BMV 0.1 | 12 | 13% | 17 |
| ahf.NanoAndrew .4 | 8 | 9% | 20 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |
| nic.Nicator 2.4 | 0 | 0% | 3 |
| tex.Longbot 0.4 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 158533 melee ticks, 60058 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51113 sent, 46328 reached their opponent, 9120 virtual hits (19.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1822069. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 62). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.7 | 152 / 210 | 1.59 | 22.6% | 30000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.6% | 152 |
| agd.Mooserwirt2 2.7 | 2.3 | 14.3% | 26 |
| uji.DBH 1.1 | 2.7 | 13.0% | 13 |
| sigterm.Sigterm 1.0 | 5.0 | 9.9% | 9 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.7% | 2 |
| ratosh.Nobo 0.21 | 5.5 | 9.2% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 6.3 | 8.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.2 | 6.6% | 1 |
| stelo.WangRobot 1.0 | 8.5 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.9 | 23 / 35 | 4635 |
| 2 | 1 | 71.2 | 93.6 | 26 / 35 | 5078 |
| 3 | 1 | 70.9 | 94.6 | 27 / 35 | 5116 |
| 4 | 1 | 70.5 | 92.9 | 26 / 35 | 4911 |
| 5 | 1 | 71.2 | 93.6 | 25 / 35 | 5246 |
| 6 | 1 | 70.7 | 93.6 | 25 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 58 | 83% |
| agd.Mooserwirt2 2.7 | 57 | 82% |
| sigterm.Sigterm 1.0 | 24 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 83% |
| stelo.WangRobot 1.0 | 11 | 91% |
| ratosh.Nobo 0.21 | 11 | 82% |
| spinnercat.Robovirus 2.718 | 7 | 86% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 17 | 29% | 60 |
| uji.DBH 1.1 | 15 | 25% | 43 |
| ratosh.Nobo 0.21 | 7 | 12% | 21 |
| sigterm.Sigterm 1.0 | 6 | 10% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 10% | 19 |
| stelo.WangRobot 1.0 | 3 | 5% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 5% | 8 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 16 |

Posture (Hadur's M records, 198 rounds): 128128 melee ticks, 47707 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 39508 sent, 35139 reached their opponent, 7326 virtual hits (20.8% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1822218. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.6 | 199 / 210 | 1.13 | 22.9% | 39791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.9% | 199 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 3 |
| mld.Infinity 2.2 | 3.5 | 12.3% | 6 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 1 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.0% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.5% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 97.1 | 32 / 35 | 6335 |
| 2 | 1 | 74.0 | 98.7 | 33 / 35 | 6626 |
| 3 | 1 | 74.6 | 100.0 | 35 / 35 | 6912 |
| 4 | 1 | 74.1 | 97.5 | 32 / 35 | 6836 |
| 5 | 1 | 74.5 | 100.0 | 35 / 35 | 6845 |
| 6 | 1 | 73.4 | 98.1 | 32 / 35 | 6237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 120 | 99% |
| mld.Infinity 2.2 | 31 | 97% |
| krillr.mini.JointStrike 2.0.0 | 26 | 96% |
| erdnis.Rover 0.3 | 11 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 11 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 2 | 18% | 78 |
| krillr.mini.JointStrike 2.0.0 | 2 | 18% | 35 |
| mld.Infinity 2.2 | 2 | 18% | 31 |
| erdnis.Rover 0.3 | 2 | 18% | 27 |
| patson.PatsonTestBot 1.0 | 2 | 18% | 13 |
| mbh.Mbh 0.1 | 1 | 9% | 9 |
| pac.ABC 2.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 123367 melee ticks, 46396 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 60 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 40679 sent, 35911 reached their opponent, 7875 virtual hits (21.9% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1796910. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.2 | 153 / 210 | 1.52 | 22.0% | 39933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.0% | 153 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 34 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 10.9% | 3 |
| fwb.Nine 1.0.1 | 4.0 | 10.1% | 9 |
| catcat20.Rabbit 0.001 | 4.7 | 9.7% | 8 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.5% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.4 | 25 / 35 | 6525 |
| 2 | 1 | 72.1 | 93.7 | 25 / 35 | 6456 |
| 3 | 1 | 73.7 | 96.8 | 29 / 35 | 7086 |
| 4 | 1 | 71.5 | 91.4 | 24 / 35 | 6356 |
| 5 | 1 | 73.1 | 96.5 | 26 / 35 | 6883 |
| 6 | 1 | 72.5 | 94.6 | 24 / 35 | 6627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 110 | 81% |
| fwb.Nine 1.0.1 | 30 | 97% |
| catcat20.Rabbit 0.001 | 24 | 71% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 62% | 107 |
| catcat20.Rabbit 0.001 | 8 | 14% | 37 |
| fwb.Nine 1.0.1 | 5 | 9% | 16 |
| bayen.nut.Squirrel 1.615 | 4 | 7% | 9 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 23 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 159386 melee ticks, 59323 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 30 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49063 sent, 44199 reached their opponent, 9638 virtual hits (21.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1823037. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.2 | 154 / 210 | 1.43 | 21.9% | 38673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.9% | 154 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 46 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 1 |
| eld.Hmm 1.0 | 5.3 | 8.1% | 2 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.4% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.0% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.3 | 26 / 35 | 6362 |
| 2 | 1 | 73.7 | 97.8 | 30 / 35 | 6559 |
| 3 | 1 | 72.3 | 95.9 | 24 / 35 | 6371 |
| 4 | 1 | 72.8 | 95.2 | 24 / 35 | 6520 |
| 5 | 1 | 72.5 | 94.0 | 24 / 35 | 6431 |
| 6 | 1 | 72.6 | 94.0 | 26 / 35 | 6430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 75% |
| dummy.mini.Scimitar 1.01 | 36 | 89% |
| cf.RiO.RiOx 4.2.1 | 21 | 100% |
| eld.Hmm 1.0 | 4 | 75% |
| oa.weak.BotherBot 0.1 | 2 | 50% |

Hadur died in 56 of 210 rounds, at a mean tick of 1322. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 71% | 107 |
| dummy.mini.Scimitar 1.01 | 10 | 18% | 51 |
| eld.Hmm 1.0 | 2 | 4% | 15 |
| PSW.Relentless 0.1 | 2 | 4% | 2 |
| cf.RiO.RiOx 4.2.1 | 1 | 2% | 21 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 171236 melee ticks, 80911 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49354 sent, 44650 reached their opponent, 7257 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1820223. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 101 / 210 | 1.97 | 20.5% | 27908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.5% | 101 |
| pe.SandboxDT 2.71m | 2.2 | 17.3% | 54 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.9% | 35 |
| jlm.javaDisturbance 0.59 | 4.0 | 14.0% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 5 |
| yk.JahRoslav 1.1 | 6.2 | 6.6% | 1 |
| tad.Dalek98 0.98 | 7.2 | 5.8% | 1 |
| gg.Squaraus 0.6 | 7.8 | 5.4% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.1 | 18 / 35 | 4672 |
| 2 | 1 | 69.5 | 90.0 | 18 / 35 | 4737 |
| 3 | 1 | 68.8 | 88.2 | 15 / 35 | 4532 |
| 4 | 1 | 69.9 | 88.6 | 17 / 35 | 5042 |
| 5 | 1 | 68.8 | 87.9 | 17 / 35 | 4397 |
| 6 | 1 | 68.3 | 85.7 | 16 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 67 | 55% |
| kvk.HebusLeTroll 0.35 | 43 | 65% |
| jlm.javaDisturbance 0.59 | 37 | 78% |
| bigpete.Stewie 1.0 | 7 | 71% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 44% | 80 |
| kvk.HebusLeTroll 0.35 | 29 | 26% | 55 |
| jlm.javaDisturbance 0.59 | 20 | 18% | 46 |
| bigpete.Stewie 1.0 | 6 | 5% | 17 |
| tad.Dalek98 0.98 | 5 | 4% | 6 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 153421 melee ticks, 47067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44439 sent, 40175 reached their opponent, 5175 virtual hits (12.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1825748. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 6 battles (28.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.0 | 180 / 210 | 1.27 | 22.5% | 40098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.5% | 180 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 24 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.2% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.3% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 6.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 94.9 | 28 / 35 | 6819 |
| 2 | 1 | 73.6 | 98.1 | 30 / 35 | 6512 |
| 3 | 1 | 73.1 | 95.9 | 28 / 35 | 6374 |
| 4 | 1 | 74.1 | 97.8 | 30 / 35 | 6842 |
| 5 | 1 | 73.8 | 95.9 | 31 / 35 | 6736 |
| 6 | 1 | 74.9 | 99.4 | 33 / 35 | 6815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 113 | 87% |
| cre.Karolos 0.32 | 52 | 94% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| stelo.AreaTargetingBot 1.1 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 24 | 73% | 108 |
| cre.Karolos 0.32 | 5 | 15% | 47 |
| stelo.RamTrackSurfer 1.2 | 2 | 6% | 16 |
| stelo.AreaTargetingBot 1.1 | 1 | 3% | 14 |
| cw.megas.Blade 0.8 | 1 | 3% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 122315 melee ticks, 50915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37475 sent, 32584 reached their opponent, 9087 virtual hits (27.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1810042. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.6 | 73 / 210 | 2.56 | 17.0% | 25671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 17.0% | 73 |
| florent.XSeries.X2 0.12 | 2.5 | 13.8% | 34 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.9% | 45 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 41 |
| pedersen.Ugluk 1.1.1 | 5.2 | 10.7% | 8 |
| oog.melee.Corsair 1.0 | 5.8 | 9.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.5% | 2 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.2% | 1 |
| evd.X1 0.01 | 9.0 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 18 / 35 | 4570 |
| 2 | 1 | 67.2 | 83.2 | 16 / 35 | 4683 |
| 3 | 1 | 66.8 | 83.5 | 15 / 35 | 4393 |
| 4 | 2 | 64.7 | 81.0 | 7 / 35 | 3827 |
| 5 | 1 | 65.4 | 80.6 | 11 / 35 | 4251 |
| 6 | 1 | 64.1 | 80.6 | 6 / 35 | 3947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 39% |
| florent.XSeries.X2 0.12 | 34 | 59% |
| davidalves.Phoenix 0.54 | 34 | 59% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| oog.melee.Corsair 1.0 | 7 | 43% |
| stelo.SoJNanoMelee 1.1 | 4 | 50% |
| as.FrankTheTank 1.3 | 3 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 43 | 31% | 63 |
| rz.GlowBlowMelee 1.4 | 36 | 26% | 55 |
| davidalves.Phoenix 0.54 | 31 | 22% | 46 |
| pedersen.Ugluk 1.1.1 | 12 | 9% | 18 |
| oog.melee.Corsair 1.0 | 8 | 6% | 16 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 7 |
| evd.X1 0.01 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 136928 melee ticks, 36710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 44928 sent, 39725 reached their opponent, 6778 virtual hits (17.1% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1817787. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.9 | 142 / 210 | 1.89 | 21.2% | 24604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.2% | 142 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.7% | 16 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 13.7% | 13 |
| jdw.Hurricane 1.4 | 3.5 | 13.3% | 17 |
| ds.Oo 2.2 | 5.3 | 9.6% | 10 |
| adt.Ar2 1.1 | 6.3 | 8.0% | 3 |
| awesomeness.Elite 1.0 | 6.7 | 8.0% | 4 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.0% | 5 |
| amk.ChumbaMini 0.2 | 9.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 26 / 35 | 4167 |
| 2 | 1 | 68.9 | 89.6 | 24 / 35 | 3909 |
| 3 | 1 | 69.5 | 90.4 | 24 / 35 | 4132 |
| 4 | 1 | 69.4 | 89.6 | 26 / 35 | 4126 |
| 5 | 1 | 68.0 | 85.7 | 19 / 35 | 3956 |
| 6 | 1 | 68.6 | 85.7 | 23 / 35 | 4314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 89% |
| voidious.micro.BlitzBat 1.05 | 49 | 92% |
| jdw.Hurricane 1.4 | 33 | 91% |
| ds.Oo 2.2 | 8 | 38% |
| adt.Ar2 1.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| gjr.Cephalosporin 0.1 | 5 | 60% |

Hadur died in 68 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ds.Oo 2.2 | 15 | 22% | 30 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 18% | 49 |
| voidious.micro.BlitzBat 1.05 | 12 | 18% | 38 |
| jdw.Hurricane 1.4 | 11 | 16% | 37 |
| awesomeness.Elite 1.0 | 6 | 9% | 21 |
| adt.Ar2 1.1 | 5 | 7% | 18 |
| amk.ChumbaMini 0.2 | 4 | 6% | 5 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 10 |

Posture (Hadur's M records, 199 rounds): 117375 melee ticks, 27051 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38172 sent, 33862 reached their opponent, 5661 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1822679. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 94.7 | 160 / 210 | 1.48 | 22.1% | 42037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.1% | 160 |
| ak.Fermat 2.0 | 2.3 | 14.3% | 19 |
| lrem.Spectre 0.4.4 | 2.8 | 12.3% | 10 |
| shu.nitro.LENIN .T34 | 4.0 | 11.1% | 15 |
| js.PinBall 1.6 | 5.0 | 10.5% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.7% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 7.1% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 95.6 | 26 / 35 | 7068 |
| 2 | 1 | 73.5 | 96.5 | 29 / 35 | 6893 |
| 3 | 1 | 72.3 | 92.1 | 25 / 35 | 6910 |
| 4 | 1 | 74.4 | 97.8 | 30 / 35 | 7178 |
| 5 | 1 | 72.6 | 93.3 | 26 / 35 | 6792 |
| 6 | 1 | 72.7 | 93.0 | 24 / 35 | 7196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 72 | 86% |
| lrem.Spectre 0.4.4 | 42 | 86% |
| shu.nitro.LENIN .T34 | 32 | 84% |
| js.PinBall 1.6 | 21 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 83% |

Hadur died in 50 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 16 | 32% | 65 |
| lrem.Spectre 0.4.4 | 13 | 26% | 51 |
| shu.nitro.LENIN .T34 | 12 | 24% | 46 |
| js.PinBall 1.6 | 3 | 6% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 4% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 4% | 9 |
| sample.SpinBot 1.0 | 1 | 2% | 2 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 199 rounds): 154291 melee ticks, 51558 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48268 sent, 43451 reached their opponent, 10011 virtual hits (23.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1850066. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.0 | 155 / 210 | 2.44 | 19.5% | 33054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.3 | 19.5% | 155 |
| mk.Alpha 0.2.1 | 2.0 | 13.2% | 25 |
| EH.Eagle 1.0.6 | 2.7 | 11.5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.4% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.1% | 6 |
| wee.Gem 1.8.4 | 6.2 | 8.7% | 8 |
| throxbot.ThroxBot 0.1 | 6.7 | 8.5% | 1 |
| joe.ADinosaur 1.0 | 7.3 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.0% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 90.8 | 29 / 35 | 6275 |
| 2 | 3 | 55.1 | 46.3 | 12 / 35 | 4142 |
| 3 | 1 | 72.7 | 99.0 | 33 / 35 | 5865 |
| 4 | 1 | 70.7 | 93.3 | 28 / 35 | 5215 |
| 5 | 1 | 68.7 | 78.7 | 24 / 35 | 5954 |
| 6 | 1 | 71.8 | 95.6 | 29 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 84 | 95% |
| EH.Eagle 1.0.6 | 45 | 96% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| wee.Gem 1.8.4 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 18 | 33% | 17 |
| mk.Alpha 0.2.1 | 10 | 18% | 64 |
| throxbot.ThroxBot 0.1 | 6 | 11% | 15 |
| EH.Eagle 1.0.6 | 5 | 9% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 16 |
| caimano.Furia_Ceca 0.22 | 4 | 7% | 11 |
| joe.ADinosaur 1.0 | 4 | 7% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 16 |
| wee.Gem 1.8.4 | 2 | 4% | 12 |

Posture (Hadur's M records, 200 rounds): 115281 melee ticks, 36217 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 37556 sent, 32827 reached their opponent, 7752 virtual hits (23.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1810568. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.4 | 138 / 210 | 1.95 | 19.0% | 26218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.0% | 138 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 25 |
| uji.Antique 1.0 | 3.2 | 12.4% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.7% | 5 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 10.0% | 8 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.4% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.2% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.0 | 26 / 35 | 4586 |
| 2 | 1 | 66.8 | 85.4 | 18 / 35 | 4113 |
| 3 | 1 | 69.1 | 91.7 | 22 / 35 | 4597 |
| 4 | 1 | 67.2 | 85.7 | 20 / 35 | 4154 |
| 5 | 1 | 69.5 | 90.8 | 29 / 35 | 4159 |
| 6 | 1 | 68.9 | 88.9 | 23 / 35 | 4609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 71 | 80% |
| uji.Antique 1.0 | 56 | 89% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 18 | 25% | 45 |
| pfvicm.Sobieski 7.2.3b | 18 | 25% | 31 |
| qohnil.blot.BlotBot 3.61 | 13 | 18% | 32 |
| uji.Antique 1.0 | 10 | 14% | 54 |
| ahr.ice.Ice 1.0.2 | 7 | 10% | 17 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 19 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 123843 melee ticks, 35015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 41126 sent, 36265 reached their opponent, 5099 virtual hits (14.1% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1756581. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.0 | 128 / 210 | 1.90 | 20.1% | 30959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.1% | 128 |
| deewiant.Anomaly 0.2 | 2.5 | 14.5% | 32 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.6% | 41 |
| myl.micro.Troodon 1.10 | 4.2 | 12.4% | 5 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 3 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 6.8 | 6.3% | 0 |
| DBall.Anarchy 0.1 | 8.5 | 4.7% | 1 |
| ap.Frederick 1.1 | 9.2 | 4.6% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.5 | 22 / 35 | 5255 |
| 2 | 1 | 71.8 | 93.0 | 22 / 35 | 5589 |
| 3 | 1 | 69.1 | 85.7 | 16 / 35 | 4679 |
| 4 | 1 | 71.6 | 92.4 | 27 / 35 | 5296 |
| 5 | 1 | 72.2 | 95.6 | 27 / 35 | 5258 |
| 6 | 1 | 68.2 | 82.9 | 14 / 35 | 4882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 72% |
| myl.micro.Troodon 1.10 | 29 | 93% |
| jok.PheonixM 0.1.2 | 15 | 93% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 46% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 25 | 30% | 63 |
| myl.micro.Troodon 1.10 | 10 | 12% | 24 |
| jok.PheonixM 0.1.2 | 4 | 5% | 20 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 160552 melee ticks, 60811 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51180 sent, 46324 reached their opponent, 6483 virtual hits (14.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1817034. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.4 | 67 / 210 | 2.57 | 18.4% | 26754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.4% | 67 |
| darkcanuck.B26354 1.06 | 2.5 | 15.6% | 58 |
| stelo.PastFuture 2.3.2 | 3.2 | 15.0% | 31 |
| oog.melee.Capulet 1.2 | 3.3 | 14.5% | 31 |
| intruder.PrairieWolf 2.61 | 5.2 | 10.6% | 13 |
| tripphippy.Alice 1.1 | 6.5 | 8.7% | 5 |
| ntc.Opposite 1.5 | 7.2 | 7.2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.4% | 4 |
| GarmBox.Anger 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 75.7 | 10 / 35 | 4348 |
| 2 | 1 | 66.3 | 80.7 | 13 / 35 | 4586 |
| 3 | 1 | 65.5 | 78.9 | 7 / 35 | 4383 |
| 4 | 1 | 64.7 | 78.6 | 9 / 35 | 4169 |
| 5 | 1 | 68.5 | 86.1 | 18 / 35 | 4872 |
| 6 | 1 | 66.0 | 82.1 | 10 / 35 | 4396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 27% |
| stelo.PastFuture 2.3.2 | 35 | 57% |
| oog.melee.Capulet 1.2 | 31 | 52% |
| intruder.PrairieWolf 2.61 | 12 | 58% |
| tripphippy.Alice 1.1 | 9 | 78% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |
| GarmBox.Anger 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 51 | 36% | 63 |
| stelo.PastFuture 2.3.2 | 33 | 23% | 51 |
| oog.melee.Capulet 1.2 | 26 | 18% | 46 |
| intruder.PrairieWolf 2.61 | 13 | 9% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 6% | 12 |
| tripphippy.Alice 1.1 | 6 | 4% | 15 |
| ntc.Opposite 1.5 | 5 | 3% | 6 |

Posture (Hadur's M records, 201 rounds): 159850 melee ticks, 42158 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46156 sent, 41640 reached their opponent, 6842 virtual hits (16.4% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1824711. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 180 over 6 battles (30.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.4 | 73 / 210 | 2.67 | 16.7% | 24182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.5 | 17.2% | 83 |
| hadur117.Hadur 3.21aa | 1.5 | 16.7% | 73 |
| gh.mini.Griezel 0.2 | 3.3 | 13.3% | 42 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.3% | 5 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.6% | 5 |
| gh.nano.Grofvuil 0.2 | 5.7 | 8.8% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 80.3 | 11 / 35 | 4123 |
| 2 | 2 | 65.8 | 82.2 | 11 / 35 | 3813 |
| 3 | 1 | 67.2 | 84.8 | 17 / 35 | 4252 |
| 4 | 1 | 66.5 | 82.5 | 14 / 35 | 4312 |
| 5 | 1 | 66.3 | 83.2 | 12 / 35 | 3995 |
| 6 | 2 | 63.2 | 75.6 | 8 / 35 | 3687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 40% |
| gh.mini.Griezel 0.2 | 45 | 56% |
| spinnercat.micro.Tyger 0.1 | 14 | 79% |
| d414.nano.Quantum 1.0.0 | 12 | 92% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 38% | 75 |
| gh.mini.Griezel 0.2 | 42 | 30% | 66 |
| spinnercat.micro.Tyger 0.1 | 14 | 10% | 25 |
| d414.nano.Quantum 1.0.0 | 10 | 7% | 18 |
| gh.nano.Grofvuil 0.2 | 9 | 7% | 11 |
| tlp.ThreeLeggedPig 1 | 4 | 3% | 5 |
| fm.mammillarias 1.3 | 3 | 2% | 5 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 147167 melee ticks, 38637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 47265 sent, 42195 reached their opponent, 6614 virtual hits (15.7% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1807701. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 225 over 6 battles (37.5 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.5 | 126 / 210 | 1.95 | 19.0% | 29305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.0% | 126 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 50 |
| apc.botM 3.0 | 3.5 | 11.3% | 17 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 2 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 10 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 0 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.7% | 4 |
| conscience.Electron 1.3g | 8.5 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.1 | 24 / 35 | 4793 |
| 2 | 1 | 68.0 | 88.3 | 20 / 35 | 4569 |
| 3 | 1 | 69.8 | 93.7 | 23 / 35 | 5128 |
| 4 | 1 | 68.3 | 85.4 | 20 / 35 | 5329 |
| 5 | 1 | 67.8 | 87.9 | 18 / 35 | 4734 |
| 6 | 1 | 68.8 | 90.5 | 21 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 95 | 62% |
| apc.botM 3.0 | 29 | 72% |
| lxx.ConceptA 0.8 | 14 | 86% |
| vjik.UnViolation 1.1 | 14 | 79% |
| yk.JahMicro 1.0 | 9 | 78% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |

Hadur died in 86 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 51% | 101 |
| apc.botM 3.0 | 12 | 14% | 32 |
| lxx.ConceptA 0.8 | 8 | 9% | 17 |
| bayen.UbaMicro 1.4 | 6 | 7% | 13 |
| yk.JahMicro 1.0 | 6 | 7% | 12 |
| vjik.UnViolation 1.1 | 5 | 6% | 24 |
| panzer.Panzer 0.2 | 2 | 2% | 6 |
| conscience.Electron 1.3g | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 119232 melee ticks, 54147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 65 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 40200 sent, 35297 reached their opponent, 5955 virtual hits (16.9% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1838467. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.3 | 122 / 210 | 1.94 | 21.5% | 28739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 122 |
| maribo.Quester 0.3 | 2.0 | 17.4% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.6% | 27 |
| labg.Cataclysm 2.05 | 4.2 | 12.4% | 15 |
| baal.nano.N 1.42 | 5.0 | 10.4% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.1% | 6 |
| zyx.micro.Ant 1.1 | 7.3 | 6.0% | 1 |
| sanja.First 0.1 | 7.7 | 5.7% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.1 | 16 / 35 | 4525 |
| 2 | 1 | 70.4 | 88.9 | 21 / 35 | 4742 |
| 3 | 1 | 69.5 | 86.1 | 19 / 35 | 4732 |
| 4 | 1 | 71.5 | 92.1 | 24 / 35 | 5033 |
| 5 | 1 | 71.3 | 91.4 | 22 / 35 | 5276 |
| 6 | 1 | 70.1 | 90.0 | 20 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 81 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 68% |
| labg.Cataclysm 2.05 | 27 | 78% |
| baal.nano.N 1.42 | 7 | 100% |
| sanja.First 0.1 | 4 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |

Hadur died in 88 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 42 | 48% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 25% | 57 |
| labg.Cataclysm 2.05 | 11 | 13% | 33 |
| zyx.micro.Ant 1.1 | 7 | 8% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 8 |
| baal.nano.N 1.42 | 2 | 2% | 11 |
| sanja.First 0.1 | 0 | 0% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 162355 melee ticks, 48370 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46797 sent, 42435 reached their opponent, 5962 virtual hits (14.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1775289. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.4 | 94 / 210 | 1.96 | 19.4% | 34705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 19.4% | 94 |
| stelo.Spread 0.9 | 2.3 | 15.8% | 51 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 45 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 15 |
| tcf.Reach 3 | 4.8 | 10.6% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.4 | 20 / 35 | 6032 |
| 2 | 1 | 68.5 | 87.3 | 10 / 35 | 5189 |
| 3 | 1 | 71.0 | 91.1 | 19 / 35 | 6031 |
| 4 | 1 | 71.3 | 90.2 | 17 / 35 | 6419 |
| 5 | 2 | 69.2 | 85.1 | 13 / 35 | 5459 |
| 6 | 1 | 70.3 | 91.1 | 15 / 35 | 5575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 62 | 63% |
| stelo.Spread 0.9 | 61 | 52% |
| jcs.Seth 1.8 | 22 | 50% |
| tcf.Reach 3 | 7 | 57% |
| ratosh.Wesco 1.4 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 48 | 41% | 82 |
| stelo.Spread 0.9 | 37 | 32% | 67 |
| jcs.Seth 1.8 | 18 | 16% | 30 |
| tcf.Reach 3 | 9 | 8% | 15 |
| cli.Dancer 1.1 | 2 | 2% | 8 |
| ratosh.Wesco 1.4 | 2 | 2% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 169703 melee ticks, 60605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 50483 sent, 45596 reached their opponent, 7326 virtual hits (16.1% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1829545. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.0 | 51 / 210 | 2.62 | 16.3% | 24285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 133 |
| hadur117.Hadur 3.21aa | 2.0 | 16.3% | 51 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.8% | 6 |
| gh.mini.Gruwel 0.9 | 3.5 | 13.0% | 18 |
| rz.HawkOnFire 0.1 | 5.0 | 10.9% | 2 |
| wit.Chuliath 1.0 | 6.2 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.3 | 5.3% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 83.2 | 11 / 35 | 4271 |
| 2 | 2 | 66.1 | 84.4 | 8 / 35 | 3959 |
| 3 | 2 | 65.0 | 80.0 | 11 / 35 | 3839 |
| 4 | 2 | 64.9 | 80.3 | 7 / 35 | 3873 |
| 5 | 2 | 66.4 | 85.1 | 7 / 35 | 4165 |
| 6 | 2 | 65.4 | 79.0 | 7 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 67 | 19% |
| gh.mini.Gruwel 0.9 | 29 | 59% |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 88% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 50% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 85 | 53% | 101 |
| gh.mini.Gruwel 0.9 | 30 | 19% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 14% | 35 |
| rz.HawkOnFire 0.1 | 12 | 8% | 19 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 3% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 142479 melee ticks, 39291 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43195 sent, 38195 reached their opponent, 5615 virtual hits (14.7% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1763133. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 252 over 6 battles (42.0 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 96.3 | 169 / 210 | 1.33 | 22.1% | 36280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.1% | 169 |
| bzdp.Pansy 2.1 | 2.3 | 12.5% | 5 |
| alpha.RainingFire 1.0 | 2.8 | 11.9% | 10 |
| mz.Cork 0.1 | 4.5 | 10.7% | 13 |
| bvh.micro.Freya 0.3 | 5.5 | 10.1% | 10 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.9% | 3 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.5 | 31 / 35 | 6507 |
| 2 | 1 | 72.2 | 94.6 | 26 / 35 | 6006 |
| 3 | 1 | 72.6 | 96.8 | 28 / 35 | 5888 |
| 4 | 1 | 72.4 | 95.6 | 27 / 35 | 6016 |
| 5 | 1 | 72.8 | 97.1 | 30 / 35 | 6031 |
| 6 | 1 | 72.5 | 96.2 | 27 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 98% |
| mz.Cork 0.1 | 34 | 79% |
| bvh.micro.Freya 0.3 | 32 | 84% |
| alpha.RainingFire 1.0 | 31 | 87% |
| m3thos.Eva02 0.7.1 | 20 | 90% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 29% | 37 |
| mz.Cork 0.1 | 9 | 22% | 38 |
| bvh.micro.Freya 0.3 | 8 | 20% | 29 |
| bzdp.Pansy 2.1 | 5 | 12% | 56 |
| bvh.mini.Fenrir 0.39 | 4 | 10% | 14 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 25 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 144292 melee ticks, 46392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47658 sent, 42949 reached their opponent, 8359 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1809439. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 6 battles (46.7 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 160 / 210 | 1.95 | 19.8% | 35952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.8% | 160 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.2% | 7 |
| germ.TheMind .2 | 4.3 | 10.0% | 6 |
| stelo.UntouchableNano 1.3 | 5.0 | 9.1% | 10 |
| EBBU.Sim2 1.02 | 5.0 | 9.5% | 6 |
| agrach.Dalek 1.0 | 5.5 | 9.0% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.7% | 1 |
| lmk.ACPFinal 0.1 | 7.5 | 7.9% | 6 |
| mb.Beast 0.1 | 8.5 | 7.8% | 4 |
| skm.Ryubot 1.0 | 9.0 | 7.1% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.0 | 25 / 35 | 6027 |
| 2 | 1 | 67.3 | 85.4 | 23 / 35 | 5563 |
| 3 | 1 | 70.1 | 91.7 | 29 / 35 | 6293 |
| 4 | 1 | 72.0 | 98.4 | 31 / 35 | 6687 |
| 5 | 1 | 69.1 | 90.2 | 28 / 35 | 5745 |
| 6 | 1 | 67.7 | 84.8 | 24 / 35 | 5637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 32 | 97% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 90% |
| stelo.UntouchableNano 1.3 | 25 | 84% |
| germ.TheMind .2 | 20 | 100% |
| lmk.ACPFinal 0.1 | 20 | 100% |
| EBBU.Sim2 1.02 | 17 | 94% |
| skm.Ryubot 1.0 | 13 | 85% |
| mb.Beast 0.1 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 50 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 34% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 14% | 41 |
| agrach.Dalek 1.0 | 5 | 10% | 30 |
| lmk.ACPFinal 0.1 | 5 | 10% | 28 |
| mb.Beast 0.1 | 4 | 8% | 23 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 22 |
| EBBU.Sim2 1.02 | 4 | 8% | 18 |
| germ.TheMind .2 | 2 | 4% | 18 |
| skm.Ryubot 1.0 | 2 | 4% | 6 |

Posture (Hadur's M records, 200 rounds): 91360 melee ticks, 26204 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 35 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 30174 sent, 25519 reached their opponent, 6941 virtual hits (27.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1817175. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.9 | 127 / 210 | 2.00 | 19.3% | 30561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.3% | 127 |
| justin.Mallais 14.0 | 2.0 | 15.5% | 43 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 16 |
| bts.mega.Gnarly 1.4 | 4.3 | 10.9% | 13 |
| cs.Wren 1.0 | 4.8 | 10.6% | 3 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.8% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.5% | 1 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 17 / 35 | 5050 |
| 2 | 1 | 68.9 | 87.9 | 20 / 35 | 4808 |
| 3 | 1 | 68.5 | 85.7 | 19 / 35 | 4984 |
| 4 | 1 | 70.0 | 90.2 | 22 / 35 | 5169 |
| 5 | 1 | 71.2 | 93.0 | 25 / 35 | 5371 |
| 6 | 1 | 69.8 | 89.5 | 24 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 74 | 76% |
| bvh.mini.Freya 0.55 | 29 | 86% |
| bts.mega.Gnarly 1.4 | 21 | 71% |
| cs.Wren 1.0 | 17 | 94% |
| kdf.KoulDestroyer 1.0 | 14 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 44% | 86 |
| bts.mega.Gnarly 1.4 | 16 | 19% | 40 |
| cs.Wren 1.0 | 10 | 12% | 25 |
| kdf.KoulDestroyer 1.0 | 9 | 11% | 18 |
| bvh.mini.Freya 0.55 | 7 | 8% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 4% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 133645 melee ticks, 42536 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43511 sent, 38440 reached their opponent, 7814 virtual hits (20.3% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1666003. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.2 | 127 / 210 | 1.70 | 22.1% | 33944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.1% | 127 |
| bvh.fry.Freya 0.82 | 2.2 | 16.1% | 13 |
| az.Ololobot 0.2.4 | 2.8 | 14.8% | 63 |
| winamp32.micro.MicroMacro 1.0 | 4.3 | 9.5% | 2 |
| gimp.GimpBot 0.1 | 5.3 | 8.8% | 2 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 8.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.9% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.6 | 22 / 35 | 5209 |
| 2 | 1 | 70.8 | 92.9 | 22 / 35 | 5853 |
| 3 | 1 | 71.3 | 92.9 | 21 / 35 | 6094 |
| 4 | 1 | 69.8 | 90.4 | 20 / 35 | 5655 |
| 5 | 1 | 69.8 | 89.3 | 20 / 35 | 5603 |
| 6 | 1 | 70.4 | 92.1 | 22 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 75 | 51% |
| bvh.fry.Freya 0.82 | 69 | 90% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| gimp.GimpBot 0.1 | 7 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1192. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 43 | 51% | 87 |
| bvh.fry.Freya 0.82 | 25 | 30% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 7% | 8 |
| gimp.GimpBot 0.1 | 3 | 4% | 14 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 13 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 153556 melee ticks, 65504 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44702 sent, 40212 reached their opponent, 7036 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1825677. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.7 | 141 / 210 | 1.66 | 20.9% | 34178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.9% | 141 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 33 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 13 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 7 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.5% | 6 |
| stelo.Randomness 1.0 | 6.3 | 8.7% | 7 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.7% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 3.8% | 0 |
| sample.Corners 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.2 | 15 / 35 | 5330 |
| 2 | 1 | 72.1 | 93.7 | 26 / 35 | 5855 |
| 3 | 1 | 70.6 | 91.1 | 22 / 35 | 5260 |
| 4 | 1 | 71.7 | 92.1 | 23 / 35 | 6114 |
| 5 | 1 | 73.1 | 97.5 | 30 / 35 | 5798 |
| 6 | 1 | 71.9 | 91.7 | 25 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 77 | 75% |
| kano.gamma.KanoGamma 1.8 | 35 | 83% |
| mz.AntiGrav 1.0 | 25 | 100% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| stelo.Randomness 1.0 | 12 | 75% |
| alpha.BlackIce 1.0 | 7 | 71% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 42% | 72 |
| kano.gamma.KanoGamma 1.8 | 12 | 17% | 51 |
| stelo.Randomness 1.0 | 8 | 12% | 20 |
| alpha.BlackIce 1.0 | 8 | 12% | 12 |
| mz.AntiGrav 1.0 | 7 | 10% | 31 |
| Polkwane.SmashMelee 1.0 | 5 | 7% | 14 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 149299 melee ticks, 45172 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 103 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 47154 sent, 42186 reached their opponent, 8107 virtual hits (19.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1770804. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.3 | 102 / 210 | 1.96 | 18.9% | 29287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.9% | 102 |
| eem.EvBotNG v12.8 | 2.0 | 16.3% | 81 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 7 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.4% | 8 |
| shrub.Silver v048 | 6.2 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.1% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.2% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 4.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 16 / 35 | 4860 |
| 2 | 1 | 70.8 | 92.4 | 22 / 35 | 4895 |
| 3 | 1 | 69.5 | 89.8 | 19 / 35 | 4719 |
| 4 | 1 | 69.1 | 87.0 | 16 / 35 | 4974 |
| 5 | 1 | 68.8 | 88.9 | 16 / 35 | 4691 |
| 6 | 1 | 69.2 | 89.5 | 13 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 90 | 42% |
| ary.Swarm 1.1 | 28 | 89% |
| lessonz.robocode.Oz 0.5.0 | 26 | 92% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 57% | 101 |
| lessonz.robocode.Oz 0.5.0 | 14 | 13% | 36 |
| ary.Swarm 1.1 | 14 | 13% | 32 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 24 |
| shrub.Silver v048 | 5 | 5% | 10 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 150608 melee ticks, 56618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47841 sent, 42794 reached their opponent, 6058 virtual hits (14.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1847452. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.6 | 143 / 210 | 1.67 | 21.0% | 38144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 143 |
| wompi.Wallaby 5.1 | 2.2 | 15.1% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.6% | 6 |
| ara.Shera 0.88 | 3.5 | 12.9% | 24 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.4% | 1 |
| stelo.MirrorMicro 1.0 | 7.3 | 6.2% | 0 |
| maribo.IotaCT 1.1 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.9 | 27 / 35 | 6876 |
| 2 | 1 | 69.7 | 88.9 | 20 / 35 | 5779 |
| 3 | 1 | 72.6 | 95.6 | 28 / 35 | 6351 |
| 4 | 1 | 72.4 | 94.6 | 26 / 35 | 6618 |
| 5 | 1 | 71.1 | 88.9 | 22 / 35 | 6429 |
| 6 | 1 | 70.9 | 91.7 | 20 / 35 | 6091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 81 | 88% |
| maribo.mini.MiniQuester 0.1 | 55 | 93% |
| ara.Shera 0.88 | 30 | 53% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 27 | 39% | 91 |
| ara.Shera 0.88 | 22 | 32% | 44 |
| maribo.mini.MiniQuester 0.1 | 15 | 22% | 58 |
| amz.NanoClone 1.41 | 3 | 4% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 6 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 160981 melee ticks, 47852 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49466 sent, 44687 reached their opponent, 8316 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1828889. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 6 battles (22.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.7 | 38 / 210 | 2.74 | 16.5% | 26679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 140 |
| hadur117.Hadur 3.21aa | 2.0 | 16.5% | 38 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 3 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.6 | 4 / 35 | 4442 |
| 2 | 2 | 66.6 | 79.7 | 7 / 35 | 4391 |
| 3 | 2 | 64.9 | 74.6 | 3 / 35 | 4438 |
| 4 | 2 | 67.2 | 79.7 | 8 / 35 | 4552 |
| 5 | 2 | 67.3 | 82.2 | 8 / 35 | 4318 |
| 6 | 2 | 68.4 | 86.3 | 8 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 23% |
| brainfade.melee.Dusk 0.44 | 15 | 47% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 172 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 62% | 125 |
| brainfade.melee.Dusk 0.44 | 27 | 16% | 34 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 7 | 4% | 14 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |

Posture (Hadur's M records, 200 rounds): 151606 melee ticks, 50854 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47281 sent, 42257 reached their opponent, 6704 virtual hits (15.9% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1813819. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.3 | 142 / 210 | 1.51 | 21.5% | 37364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 142 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 49 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.1% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.5% | 2 |
| jwirde.Gort 2.0 | 5.0 | 9.1% | 3 |
| disan.Chair 2.2.0 | 6.0 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.1% | 1 |
| wompi.Quokka 1.6 | 7.5 | 6.7% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 23 / 35 | 5946 |
| 2 | 1 | 72.7 | 95.9 | 25 / 35 | 6502 |
| 3 | 1 | 72.9 | 96.8 | 26 / 35 | 6245 |
| 4 | 1 | 72.4 | 93.7 | 23 / 35 | 6552 |
| 5 | 1 | 72.3 | 95.2 | 26 / 35 | 6351 |
| 6 | 1 | 70.7 | 91.1 | 19 / 35 | 5768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 66% |
| tzu.TheArtOfWar 1.2 | 62 | 89% |
| jwirde.Gort 2.0 | 14 | 79% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 83% |
| disan.Chair 2.2.0 | 3 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 59% | 104 |
| tzu.TheArtOfWar 1.2 | 12 | 18% | 61 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 15% | 16 |
| jwirde.Gort 2.0 | 4 | 6% | 22 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| wompi.Quokka 1.6 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 152568 melee ticks, 48648 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 94 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50783 sent, 45940 reached their opponent, 8886 virtual hits (19.3% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1800950. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.5 | 122 / 210 | 1.95 | 20.3% | 34440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.3% | 122 |
| jje.BagPuss 1.2 | 2.0 | 12.6% | 9 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 11.2% | 61 |
| sul.Lunar 1.1 | 4.5 | 10.4% | 9 |
| myl.nano.Graviton 1.10 | 4.5 | 10.8% | 3 |
| fm.claire 1.7 | 6.3 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.5% | 0 |
| hvilela.HVilela 0.9 | 7.3 | 8.4% | 2 |
| wit.Deep7 2.0 | 9.2 | 4.8% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 15 / 35 | 5805 |
| 2 | 1 | 71.4 | 92.1 | 25 / 35 | 5887 |
| 3 | 1 | 72.0 | 94.0 | 25 / 35 | 5987 |
| 4 | 1 | 70.1 | 89.2 | 22 / 35 | 5484 |
| 5 | 1 | 69.4 | 88.3 | 16 / 35 | 5564 |
| 6 | 1 | 69.6 | 87.3 | 19 / 35 | 5713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 53% |
| jje.BagPuss 1.2 | 35 | 80% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| sul.Lunar 1.1 | 21 | 81% |
| wit.Deep7 2.0 | 9 | 78% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 50% |

Hadur died in 88 of 210 rounds, at a mean tick of 1464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 36 | 41% | 0 |
| jje.BagPuss 1.2 | 18 | 20% | 58 |
| sul.Lunar 1.1 | 9 | 10% | 47 |
| myl.nano.Graviton 1.10 | 7 | 8% | 36 |
| hvilela.HVilela 0.9 | 7 | 8% | 19 |
| fm.claire 1.7 | 5 | 6% | 16 |
| wit.Deep7 2.0 | 3 | 3% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 17 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 198 rounds): 184700 melee ticks, 80338 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 73 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56561 sent, 51763 reached their opponent, 7294 virtual hits (14.1% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1819662. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.6 | 124 / 210 | 1.83 | 21.3% | 30666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 21.3% | 124 |
| kc.mini.Mirage 0.2 | 1.8 | 19.0% | 66 |
| mz.MicroSheep 1.0 | 3.3 | 12.6% | 5 |
| cx.Princess 1.0 | 3.8 | 11.7% | 12 |
| sadoner.killer 0.2 | 4.8 | 10.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 7.8 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.7 | 14 / 35 | 4889 |
| 2 | 1 | 68.4 | 86.4 | 16 / 35 | 5033 |
| 3 | 1 | 69.7 | 87.5 | 24 / 35 | 5018 |
| 4 | 1 | 72.4 | 97.5 | 29 / 35 | 5292 |
| 5 | 1 | 69.3 | 88.6 | 19 / 35 | 5120 |
| 6 | 1 | 70.5 | 91.8 | 22 / 35 | 5314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 115 | 72% |
| mz.MicroSheep 1.0 | 18 | 94% |
| cx.Princess 1.0 | 17 | 76% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| sadoner.killer 0.2 | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 56 | 65% | 140 |
| cx.Princess 1.0 | 10 | 12% | 21 |
| sadoner.killer 0.2 | 8 | 9% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 11 |
| mz.MicroSheep 1.0 | 5 | 6% | 16 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 4 |
| kurios.DOSexe .9a | 0 | 0% | 4 |

Posture (Hadur's M records, 202 rounds): 138538 melee ticks, 56414 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 31 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 38459 sent, 34017 reached their opponent, 5478 virtual hits (16.1% of those reached).

