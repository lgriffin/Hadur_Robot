# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485062. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.1 | 44 / 210 | 2.34 | 17.7% | 34235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 145 |
| hadur117.Hadur 3.21y3 | 2.0 | 17.7% | 44 |
| sgp.JollyNinja 3.53 | 3.5 | 11.1% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.3% | 3 |
| lorneswork.Predator 1.0 | 5.3 | 9.7% | 0 |
| mz.MicroGodMelee 1 | 5.5 | 9.4% | 2 |
| adt.Ar2 1.0 | 6.8 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 83.8 | 6 / 35 | 5309 |
| 2 | 2 | 67.8 | 85.1 | 7 / 35 | 5757 |
| 3 | 2 | 67.7 | 84.1 | 7 / 35 | 5648 |
| 4 | 2 | 68.7 | 88.3 | 8 / 35 | 5899 |
| 5 | 2 | 69.4 | 87.6 | 12 / 35 | 6099 |
| 6 | 2 | 66.6 | 81.9 | 4 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 9% |
| sgp.JollyNinja 3.53 | 20 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| lorneswork.Predator 1.0 | 7 | 100% |
| mz.MicroGodMelee 1 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1150. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 76% | 145 |
| sgp.JollyNinja 3.53 | 13 | 8% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 12 |
| lorneswork.Predator 1.0 | 6 | 4% | 13 |
| mz.MicroGodMelee 1 | 5 | 3% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 133045 melee ticks, 89402 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 66 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 41151 sent, 35938 reached their opponent, 6410 virtual hits (17.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1550389. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 241 over 6 battles (40.2 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 110 / 210 | 2.12 | 19.5% | 33893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 19.5% | 110 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 46 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.8% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.7% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 7.4% | 5 |
| sch.Simone 0.3d | 7.2 | 7.4% | 7 |
| stelo.PatternRobot 1.0 | 9.2 | 5.2% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.8 | 17 / 35 | 5610 |
| 2 | 1 | 67.7 | 82.5 | 17 / 35 | 5128 |
| 3 | 1 | 70.6 | 87.6 | 19 / 35 | 6116 |
| 4 | 1 | 70.3 | 89.8 | 21 / 35 | 5701 |
| 5 | 1 | 70.7 | 91.1 | 22 / 35 | 5795 |
| 6 | 1 | 69.2 | 89.2 | 14 / 35 | 5543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 76% |
| pulsar.PulsarMax 0.8.9 | 48 | 54% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 50% |
| sch.Simone 0.3d | 17 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| Noran.BitchingElk 0.054 | 11 | 64% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 36% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 22% | 56 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 18% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 16 |
| sch.Simone 0.3d | 4 | 4% | 18 |
| Noran.BitchingElk 0.054 | 4 | 4% | 14 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 6 |
| stelo.PatternRobot 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 162750 melee ticks, 43194 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55278 sent, 50161 reached their opponent, 7722 virtual hits (15.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1512158. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.0 | 172 / 210 | 1.54 | 21.2% | 39421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.2% | 172 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 12 |
| vuen.Cake 2.51 | 3.3 | 12.6% | 14 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.8% | 10 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.4% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 26 / 35 | 6083 |
| 2 | 1 | 71.1 | 92.4 | 28 / 35 | 6432 |
| 3 | 1 | 72.2 | 94.9 | 30 / 35 | 6706 |
| 4 | 1 | 72.7 | 97.1 | 31 / 35 | 6741 |
| 5 | 1 | 72.5 | 94.3 | 29 / 35 | 7085 |
| 6 | 1 | 71.0 | 93.7 | 28 / 35 | 6374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 71 | 92% |
| radnor.DoctorBob 1.42 | 62 | 98% |
| kawigi.nano.Lib 1.0 | 42 | 88% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 34% | 58 |
| kawigi.nano.Lib 1.0 | 9 | 24% | 41 |
| vuen.Cake 2.51 | 8 | 21% | 78 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 11% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 6 |
| urdos.URDOS 1.3 | 1 | 3% | 7 |
| adt.Ar1 2.1 | 1 | 3% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 122841 melee ticks, 39202 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 134 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 134 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36124 sent, 30863 reached their opponent, 6858 virtual hits (22.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484276. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.2 | 36 / 210 | 2.15 | 18.7% | 38299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.0% | 160 |
| hadur117.Hadur 3.21y3 | 2.0 | 18.7% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 10.8% | 5 |
| josago.Jorgito 0.16 | 4.8 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 7.3 | 5.8% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 86.3 | 1 / 35 | 5825 |
| 2 | 2 | 70.0 | 86.7 | 6 / 35 | 6647 |
| 3 | 2 | 69.4 | 87.0 | 5 / 35 | 6268 |
| 4 | 2 | 71.0 | 88.9 | 10 / 35 | 6731 |
| 5 | 2 | 70.5 | 88.9 | 8 / 35 | 6610 |
| 6 | 2 | 69.3 | 85.4 | 6 / 35 | 6218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 10% |
| apc.LeeroyJenkins2 1.0 | 12 | 75% |
| TNT.TNT 0.99.1 | 12 | 83% |
| css.Delitioner 0.11 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 1309. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 78% | 151 |
| apc.LeeroyJenkins2 1.0 | 19 | 11% | 27 |
| TNT.TNT 0.99.1 | 9 | 5% | 20 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 187770 melee ticks, 74533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55264 sent, 50102 reached their opponent, 6815 virtual hits (13.6% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478767. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.4 | 35 / 210 | 3.04 | 15.5% | 26575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.1% | 102 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 58 |
| hadur117.Hadur 3.21y3 | 2.7 | 15.5% | 35 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 11 |
| ms.Ares 0.19 | 5.3 | 9.5% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.7% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.8% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.4 | 10 / 35 | 4931 |
| 2 | 3 | 63.5 | 74.3 | 2 / 35 | 4202 |
| 3 | 3 | 66.5 | 80.3 | 9 / 35 | 4746 |
| 4 | 3 | 63.3 | 74.6 | 4 / 35 | 3892 |
| 5 | 3 | 62.6 | 69.8 | 4 / 35 | 4417 |
| 6 | 3 | 65.4 | 80.6 | 6 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 48 | 48% |
| cb.fire.Firestarter 2.0f | 34 | 6% |
| wompi.Numbat 2.1 | 12 | 83% |

Hadur died in 175 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 61 | 35% | 63 |
| justin.DemonicRage 3.4 | 60 | 34% | 81 |
| wompi.Numbat 2.1 | 26 | 15% | 37 |
| axeBots.HataMoto 3.09 | 12 | 7% | 12 |
| ms.Ares 0.19 | 6 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 143111 melee ticks, 35478 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 74 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43282 sent, 37924 reached their opponent, 5820 virtual hits (15.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484540. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.6 | 143 / 210 | 1.75 | 20.8% | 36092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.8% | 143 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 18 |
| origin.SleepSiphon 1.7b | 2.8 | 13.4% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.4% | 7 |
| mld.Wisdom 1.0 | 5.2 | 10.3% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.0% | 6 |
| DBall.NUKE 0.1 | 8.3 | 5.6% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 96.2 | 29 / 35 | 6170 |
| 2 | 1 | 71.0 | 89.5 | 23 / 35 | 5929 |
| 3 | 1 | 72.4 | 96.2 | 27 / 35 | 6187 |
| 4 | 1 | 70.7 | 89.5 | 20 / 35 | 5928 |
| 5 | 1 | 69.6 | 86.7 | 19 / 35 | 5723 |
| 6 | 1 | 71.9 | 91.7 | 25 / 35 | 6155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 60 | 90% |
| origin.SleepSiphon 1.7b | 58 | 88% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 92% |
| gg.Wolverine 2.0 | 7 | 86% |
| mld.Wisdom 1.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 33% | 70 |
| jekl.StoneGhost 0.7 | 15 | 22% | 61 |
| mld.Wisdom 1.0 | 9 | 13% | 22 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 12% | 31 |
| gg.Wolverine 2.0 | 8 | 12% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 8 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 145265 melee ticks, 45619 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42799 sent, 37822 reached their opponent, 7453 virtual hits (19.7% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488664. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 6 battles (18.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.6 | 95.7 | 159 / 210 | 1.34 | 26.2% | 48290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 26.2% | 159 |
| rtk.Tachikoma 1.0 | 2.0 | 19.0% | 30 |
| franzor.Lizt 1.3.1 | 3.3 | 12.4% | 13 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 12.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 5.8 | 9.1% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.3 | 94.6 | 26 / 35 | 7894 |
| 2 | 1 | 75.7 | 95.7 | 27 / 35 | 8119 |
| 3 | 1 | 76.0 | 96.8 | 29 / 35 | 8035 |
| 4 | 1 | 74.7 | 93.9 | 23 / 35 | 7502 |
| 5 | 1 | 75.6 | 96.4 | 26 / 35 | 8339 |
| 6 | 1 | 76.1 | 96.8 | 28 / 35 | 8401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 128 | 81% |
| franzor.Lizt 1.3.1 | 37 | 73% |
| oog.melee.CapuletDroid 1.1 | 30 | 80% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 1546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 30 | 59% | 140 |
| franzor.Lizt 1.3.1 | 10 | 20% | 7 |
| oog.melee.CapuletDroid 1.1 | 8 | 16% | 47 |
| exauge.GateKeeper 1.1.121g | 2 | 4% | 10 |
| skm.PateranBotlock2 1.0 | 1 | 2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 181921 melee ticks, 92268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 24 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49030 sent, 44556 reached their opponent, 8527 virtual hits (19.1% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476929. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 61). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.7 | 136 / 210 | 1.74 | 22.8% | 33996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 22.8% | 136 |
| shrub.Vapour v159 | 2.5 | 14.4% | 27 |
| tm.Yuugao 1.0 | 2.5 | 14.5% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.3% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 5.0 | 10.2% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.3 | 6.5% | 0 |
| SHAM.WOW 1.4 | 7.8 | 5.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.2 | 24 / 35 | 6046 |
| 2 | 1 | 69.3 | 88.2 | 19 / 35 | 5053 |
| 3 | 1 | 72.0 | 95.4 | 26 / 35 | 5571 |
| 4 | 1 | 70.6 | 87.1 | 23 / 35 | 5853 |
| 5 | 1 | 71.8 | 92.5 | 23 / 35 | 5822 |
| 6 | 1 | 70.2 | 87.9 | 21 / 35 | 5651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 70 | 69% |
| shrub.Vapour v159 | 50 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 100% |
| m3thos.Eva00 1.1 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 28 | 38% | 60 |
| tm.Yuugao 1.0 | 25 | 34% | 68 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 12% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 26 |
| m3thos.Eva00 1.1 | 5 | 7% | 12 |
| SHAM.WOW 1.4 | 1 | 1% | 9 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 199 rounds): 141881 melee ticks, 49793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 41603 sent, 37006 reached their opponent, 6262 virtual hits (16.9% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482808. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.9 | 62 / 210 | 2.90 | 16.1% | 23664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 98 |
| hadur117.Hadur 3.21y3 | 1.8 | 16.1% | 62 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 23 |
| yagami.Tidus 0.11 | 4.7 | 10.5% | 3 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.9% | 9 |
| mc2.enemy.Original 0.9 | 5.2 | 9.8% | 13 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.5% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 74.3 | 6 / 35 | 3581 |
| 2 | 2 | 65.0 | 79.7 | 8 / 35 | 3845 |
| 3 | 1 | 68.3 | 86.3 | 17 / 35 | 4660 |
| 4 | 2 | 64.3 | 78.1 | 10 / 35 | 3917 |
| 5 | 2 | 64.2 | 76.5 | 10 / 35 | 3760 |
| 6 | 2 | 64.8 | 78.7 | 11 / 35 | 3901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 27% |
| kc.micro.Figment 1.0 | 36 | 78% |
| yagami.Tidus 0.11 | 13 | 100% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| pedersen.Grishnakh 1.0 | 5 | 40% |
| dft.Calliope 5.6 | 3 | 67% |
| rdm.Dueler 0.4x | 2 | 50% |

Hadur died in 148 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 41% | 77 |
| kc.micro.Figment 1.0 | 29 | 20% | 62 |
| mc2.enemy.Original 0.9 | 21 | 14% | 25 |
| dft.Calliope 5.6 | 9 | 6% | 11 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 10 |
| yagami.Tidus 0.11 | 8 | 5% | 13 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 0 |

Posture (Hadur's M records, 199 rounds): 147966 melee ticks, 33196 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 69 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 46116 sent, 41372 reached their opponent, 5599 virtual hits (13.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472537. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 236 over 6 battles (39.3 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.9 | 166 / 210 | 1.46 | 21.0% | 36257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.0% | 166 |
| DTF.Kludgy 1.2b | 2.3 | 14.1% | 23 |
| ne.Chimera 1.2 | 2.8 | 12.6% | 8 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 8 |
| vStar.RAFzilla 2.15 | 5.2 | 10.3% | 0 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.9% | 4 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 26 / 35 | 6130 |
| 2 | 1 | 71.1 | 94.0 | 24 / 35 | 5883 |
| 3 | 1 | 72.8 | 97.8 | 31 / 35 | 6433 |
| 4 | 1 | 72.0 | 96.5 | 31 / 35 | 5864 |
| 5 | 1 | 71.9 | 95.6 | 28 / 35 | 6153 |
| 6 | 1 | 70.3 | 90.5 | 26 / 35 | 5794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 81% |
| ejb.Polaris 1.0.1 | 51 | 92% |
| ne.Chimera 1.2 | 41 | 95% |
| vStar.RAFzilla 2.15 | 20 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| kurios.DOSexe .9b | 3 | 67% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 48% | 58 |
| ejb.Polaris 1.0.1 | 9 | 20% | 52 |
| ne.Chimera 1.2 | 8 | 18% | 37 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 11 |
| vStar.RAFzilla 2.15 | 2 | 5% | 28 |
| kurios.DOSexe .9b | 1 | 2% | 13 |
| sam.Samspin 1.0 | 0 | 0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 135293 melee ticks, 51564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42975 sent, 37906 reached their opponent, 6379 virtual hits (16.8% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479023. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.6 | 78 / 210 | 2.48 | 17.3% | 26407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.2 | 17.3% | 78 |
| rz.Aleph 0.34 | 1.8 | 15.9% | 60 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 29 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 15 |
| br2.MobyDickBot 1.6 | 5.8 | 8.6% | 11 |
| rdt199.Warlord 0.73 | 6.0 | 8.6% | 10 |
| KiraNL.Chupacabra 0.4 | 7.0 | 7.9% | 0 |
| uji.YellohFellah 1.0 | 7.2 | 7.9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 81.3 | 11 / 35 | 4126 |
| 2 | 1 | 65.1 | 80.3 | 12 / 35 | 4362 |
| 3 | 1 | 67.0 | 86.3 | 14 / 35 | 4217 |
| 4 | 2 | 65.1 | 81.6 | 7 / 35 | 4291 |
| 5 | 1 | 67.5 | 85.7 | 16 / 35 | 4737 |
| 6 | 1 | 67.6 | 86.3 | 18 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 50% |
| cx.mini.Nimrod 0.55 | 23 | 65% |
| djc.DynaBot 0.1.1 | 21 | 81% |
| uji.YellohFellah 1.0 | 10 | 80% |
| br2.MobyDickBot 1.6 | 10 | 50% |
| rdt199.Warlord 0.73 | 8 | 63% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 40% | 81 |
| cx.mini.Nimrod 0.55 | 20 | 15% | 34 |
| rdt199.Warlord 0.73 | 18 | 14% | 25 |
| br2.MobyDickBot 1.6 | 13 | 10% | 14 |
| djc.DynaBot 0.1.1 | 11 | 8% | 26 |
| uji.YellohFellah 1.0 | 7 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 149531 melee ticks, 36754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 47240 sent, 42068 reached their opponent, 5363 virtual hits (12.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476273. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.7 | 116 / 210 | 2.38 | 18.0% | 24983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 18.0% | 116 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.3% | 43 |
| nat.PallasHawk 1.0 | 3.0 | 12.8% | 29 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 11 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.3% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.1% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.3% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.0 | 21 / 35 | 4262 |
| 2 | 1 | 66.8 | 86.7 | 17 / 35 | 3815 |
| 3 | 1 | 68.0 | 85.4 | 23 / 35 | 4241 |
| 4 | 1 | 67.7 | 86.3 | 18 / 35 | 4375 |
| 5 | 1 | 66.6 | 84.4 | 17 / 35 | 3849 |
| 6 | 1 | 67.8 | 84.4 | 20 / 35 | 4441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 71% |
| nat.PallasHawk 1.0 | 40 | 75% |
| darkcanuck.Leon 1.01 | 31 | 90% |
| brainfade.melee.Genghis 0.36 | 17 | 76% |
| jrm.Test0 1.0 | 5 | 80% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 25 | 26% | 56 |
| nat.PallasHawk 1.0 | 18 | 19% | 45 |
| brainfade.melee.Genghis 0.36 | 18 | 19% | 24 |
| darkcanuck.Leon 1.01 | 11 | 12% | 41 |
| jrm.Test0 1.0 | 10 | 11% | 16 |
| cs.sheldor.Talon 1.1 | 8 | 8% | 14 |
| stuff.Vlad 0.1 | 3 | 3% | 7 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 122308 melee ticks, 35649 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 41490 sent, 36215 reached their opponent, 5313 virtual hits (14.7% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505707. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.3 | 68 / 210 | 2.59 | 16.3% | 26086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.7% | 86 |
| ags.Glacier 0.2.11 | 1.8 | 16.4% | 36 |
| hadur117.Hadur 3.21y3 | 2.3 | 16.3% | 68 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 11 |
| shinh.Entangled 0.3 | 4.7 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.0 | 7.7% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 0 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 77.5 | 8 / 35 | 3830 |
| 2 | 1 | 68.4 | 89.2 | 17 / 35 | 4642 |
| 3 | 2 | 66.2 | 85.1 | 9 / 35 | 4448 |
| 4 | 2 | 66.8 | 84.1 | 15 / 35 | 4490 |
| 5 | 3 | 63.7 | 74.3 | 10 / 35 | 4274 |
| 6 | 3 | 66.4 | 83.8 | 9 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 48 | 38% |
| ags.Glacier 0.2.11 | 42 | 71% |
| gh.micro.Gruweltje 0.7 | 11 | 91% |
| shinh.Entangled 0.3 | 11 | 73% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 50 | 35% | 68 |
| ags.Glacier 0.2.11 | 47 | 33% | 73 |
| gh.micro.Gruweltje 0.7 | 17 | 12% | 30 |
| shinh.Entangled 0.3 | 17 | 12% | 24 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 142780 melee ticks, 34560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 88 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40824 sent, 35350 reached their opponent, 4939 virtual hits (14.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483994. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.7 | 193 / 210 | 1.10 | 25.2% | 39990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 25.2% | 193 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.0% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 3.7 | 11.0% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.9% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.6% | 5 |
| pa.Improved 1.0 | 8.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 99.3 | 34 / 35 | 6755 |
| 2 | 1 | 73.4 | 98.2 | 30 / 35 | 6603 |
| 3 | 1 | 74.0 | 98.6 | 33 / 35 | 6528 |
| 4 | 1 | 74.4 | 99.6 | 34 / 35 | 6747 |
| 5 | 1 | 73.9 | 98.6 | 31 / 35 | 6482 |
| 6 | 1 | 74.0 | 98.2 | 31 / 35 | 6875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 134 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 26 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 74% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |

Hadur died in 17 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 8 | 47% | 125 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 35% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 6% | 38 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 6% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 10 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 122496 melee ticks, 50013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 35 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35057 sent, 30670 reached their opponent, 6984 virtual hits (22.8% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489066. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.9 | 103 / 210 | 2.36 | 18.7% | 32460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 18.7% | 103 |
| emp.Yngwie 1.11 | 2.7 | 13.5% | 53 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 30 |
| mld.DustBunny 3.8 | 3.8 | 12.1% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 3 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.5% | 12 |
| Grystrion.TrackerWO 1.0 | 7.2 | 6.8% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 15 / 35 | 5310 |
| 2 | 1 | 69.4 | 87.3 | 16 / 35 | 5487 |
| 3 | 1 | 70.4 | 88.3 | 21 / 35 | 5908 |
| 4 | 1 | 68.6 | 87.0 | 21 / 35 | 5071 |
| 5 | 1 | 67.2 | 80.3 | 14 / 35 | 5474 |
| 6 | 1 | 68.2 | 82.9 | 16 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 50 | 50% |
| kawigi.micro.Shiz 1.1 | 39 | 82% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| mld.DustBunny 3.8 | 16 | 88% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 35% | 77 |
| kawigi.micro.Shiz 1.1 | 19 | 18% | 38 |
| cb.nano.Insomnia 1.0 | 17 | 16% | 20 |
| mld.DustBunny 3.8 | 15 | 14% | 39 |
| kawigi.robot.Girl 1.2 | 10 | 9% | 17 |
| divineomega.TrialBot 0.003 | 3 | 3% | 9 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 3 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |

Posture (Hadur's M records, 200 rounds): 160228 melee ticks, 43159 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 51 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 50431 sent, 45304 reached their opponent, 6726 virtual hits (14.8% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474933. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.4 | 138 / 210 | 1.77 | 21.0% | 37883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.0% | 138 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.9% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.4% | 0 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 6.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.7% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.6 | 26 / 35 | 6763 |
| 2 | 1 | 70.5 | 88.9 | 20 / 35 | 5858 |
| 3 | 1 | 72.9 | 94.3 | 27 / 35 | 6601 |
| 4 | 1 | 72.1 | 93.0 | 24 / 35 | 6488 |
| 5 | 1 | 71.1 | 89.5 | 20 / 35 | 6316 |
| 6 | 1 | 70.3 | 88.3 | 21 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 74% |
| techdude.forest.FlamingForest 1.1 | 41 | 78% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 28 | 96% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1171. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 49% | 100 |
| techdude.forest.FlamingForest 1.1 | 19 | 26% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 12% | 23 |
| bvh.fnr.Fenrir 0.36l | 5 | 7% | 10 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 9 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 7 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 5 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 174344 melee ticks, 66033 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 54454 sent, 49485 reached their opponent, 7721 virtual hits (15.6% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471299. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.7 | 109 / 210 | 2.02 | 20.2% | 38609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.2% | 109 |
| et.Predator 1.8 | 2.5 | 13.7% | 23 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.7% | 23 |
| cx.BlestPain 1.41 | 3.5 | 12.8% | 39 |
| ahf.NanoAndrew .4 | 5.3 | 9.8% | 11 |
| nic.Nicator 2.4 | 6.0 | 9.0% | 5 |
| maribo.melee.BMV 0.1 | 6.7 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.8 | 4.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.1 | 22 / 35 | 6751 |
| 2 | 1 | 72.3 | 91.7 | 21 / 35 | 6893 |
| 3 | 1 | 71.3 | 90.8 | 17 / 35 | 6683 |
| 4 | 1 | 69.3 | 86.3 | 14 / 35 | 6145 |
| 5 | 1 | 70.8 | 88.6 | 20 / 35 | 6291 |
| 6 | 1 | 68.4 | 83.5 | 15 / 35 | 5846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 72% |
| et.Predator 1.8 | 49 | 80% |
| cx.BlestPain 1.41 | 33 | 30% |
| ahf.NanoAndrew .4 | 12 | 83% |
| nic.Nicator 2.4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 33% | 50 |
| et.Predator 1.8 | 28 | 27% | 66 |
| oog.melee.Mercutio 1.0 | 21 | 21% | 52 |
| ahf.NanoAndrew .4 | 12 | 12% | 21 |
| maribo.melee.BMV 0.1 | 4 | 4% | 8 |
| nic.Nicator 2.4 | 2 | 2% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 157936 melee ticks, 65762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50687 sent, 45636 reached their opponent, 8809 virtual hits (19.3% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472111. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 6 battles (48.7 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.7 | 173 / 210 | 1.35 | 23.9% | 32551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 23.9% | 173 |
| uji.DBH 1.1 | 2.7 | 13.0% | 15 |
| agd.Mooserwirt2 2.7 | 2.7 | 13.3% | 9 |
| sigterm.Sigterm 1.0 | 4.2 | 10.7% | 8 |
| spinnercat.Robovirus 2.718 | 4.8 | 9.8% | 3 |
| ratosh.Nobo 0.21 | 5.8 | 8.7% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.9% | 0 |
| stelo.WangRobot 1.0 | 8.3 | 6.2% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.9 | 26 / 35 | 5574 |
| 2 | 1 | 72.2 | 96.4 | 29 / 35 | 5373 |
| 3 | 1 | 72.2 | 96.4 | 29 / 35 | 5491 |
| 4 | 1 | 71.5 | 95.4 | 28 / 35 | 5044 |
| 5 | 1 | 71.9 | 95.4 | 30 / 35 | 5492 |
| 6 | 1 | 72.5 | 96.4 | 31 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 53 | 83% |
| agd.Mooserwirt2 2.7 | 51 | 96% |
| sigterm.Sigterm 1.0 | 46 | 89% |
| stelo.WangRobot 1.0 | 16 | 88% |
| spinnercat.Robovirus 2.718 | 12 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| ratosh.Nobo 0.21 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 11 | 30% | 52 |
| sigterm.Sigterm 1.0 | 11 | 30% | 39 |
| agd.Mooserwirt2 2.7 | 4 | 11% | 64 |
| spinnercat.Robovirus 2.718 | 4 | 11% | 19 |
| ratosh.Nobo 0.21 | 3 | 8% | 17 |
| stelo.WangRobot 1.0 | 3 | 8% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 3% | 11 |

Posture (Hadur's M records, 199 rounds): 131953 melee ticks, 50912 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 96 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 38570 sent, 33991 reached their opponent, 7133 virtual hits (21.0% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467720. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 97.8 | 199 / 210 | 1.20 | 23.0% | 40418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 23.0% | 199 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 5 |
| mld.Infinity 2.2 | 3.0 | 12.1% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 1 |
| erdnis.Rover 0.3 | 5.2 | 9.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.1% | 0 |
| pac.ABC 2.1 | 8.2 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 100.0 | 35 / 35 | 6714 |
| 2 | 1 | 74.2 | 98.7 | 34 / 35 | 6638 |
| 3 | 1 | 73.3 | 92.4 | 30 / 35 | 6731 |
| 4 | 1 | 73.5 | 96.8 | 32 / 35 | 6517 |
| 5 | 1 | 75.0 | 99.7 | 34 / 35 | 7237 |
| 6 | 1 | 74.3 | 99.4 | 34 / 35 | 6581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 111 | 98% |
| krillr.mini.JointStrike 2.0.0 | 35 | 100% |
| mld.Infinity 2.2 | 24 | 100% |
| patson.PatsonTestBot 1.0 | 13 | 92% |
| erdnis.Rover 0.3 | 10 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 11 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 27% | 67 |
| patson.PatsonTestBot 1.0 | 3 | 27% | 22 |
| krillr.mini.JointStrike 2.0.0 | 2 | 18% | 37 |
| pac.ABC 2.1 | 2 | 18% | 9 |
| mbh.Mbh 0.1 | 1 | 9% | 10 |
| erdnis.Rover 0.3 | 0 | 0% | 29 |
| mld.Infinity 2.2 | 0 | 0% | 25 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 199 rounds): 122940 melee ticks, 44717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39599 sent, 34525 reached their opponent, 7376 virtual hits (21.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467936. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.3 | 140 / 210 | 1.79 | 21.2% | 39702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.2% | 140 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 26 |
| fwb.Nine 1.0.1 | 3.5 | 11.6% | 18 |
| catcat20.Rabbit 0.001 | 3.5 | 11.3% | 21 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 10.0% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.5% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 6.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.2 | 22 / 35 | 6408 |
| 2 | 1 | 72.8 | 94.6 | 25 / 35 | 6896 |
| 3 | 1 | 71.1 | 89.8 | 20 / 35 | 6524 |
| 4 | 1 | 71.6 | 91.1 | 24 / 35 | 6675 |
| 5 | 1 | 72.5 | 92.4 | 25 / 35 | 6882 |
| 6 | 1 | 71.3 | 89.5 | 24 / 35 | 6317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 81% |
| catcat20.Rabbit 0.001 | 39 | 77% |
| fwb.Nine 1.0.1 | 36 | 97% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 30 | 43% | 83 |
| fwb.Nine 1.0.1 | 16 | 23% | 32 |
| catcat20.Rabbit 0.001 | 13 | 19% | 42 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 18 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 12 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 156666 melee ticks, 49514 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 31 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 47390 sent, 42355 reached their opponent, 8545 virtual hits (20.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472182. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.9 | 136 / 210 | 1.64 | 21.2% | 38047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.2% | 136 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 2 |
| eld.Hmm 1.0 | 5.5 | 7.9% | 4 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.8 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.2 | 5.4% | 0 |
| el.JumpShoot 0.2 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.0 | 25 / 35 | 6133 |
| 2 | 1 | 71.6 | 93.0 | 21 / 35 | 6103 |
| 3 | 1 | 72.9 | 94.3 | 25 / 35 | 6532 |
| 4 | 1 | 72.9 | 95.9 | 26 / 35 | 6722 |
| 5 | 1 | 71.9 | 92.4 | 23 / 35 | 6161 |
| 6 | 1 | 71.1 | 88.9 | 16 / 35 | 6396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 127 | 68% |
| dummy.mini.Scimitar 1.01 | 33 | 91% |
| cf.RiO.RiOx 4.2.1 | 18 | 89% |
| eld.Hmm 1.0 | 4 | 50% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1230. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 65% | 111 |
| dummy.mini.Scimitar 1.01 | 13 | 18% | 49 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 28 |
| eld.Hmm 1.0 | 3 | 4% | 13 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 165238 melee ticks, 76806 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 93 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 93 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47140 sent, 42013 reached their opponent, 6390 virtual hits (15.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473229. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.4 | 109 / 210 | 1.77 | 21.4% | 29795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.4% | 109 |
| pe.SandboxDT 2.71m | 2.3 | 17.0% | 52 |
| kvk.HebusLeTroll 0.35 | 2.7 | 16.3% | 29 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 1 |
| yk.JahRoslav 1.1 | 6.2 | 6.7% | 2 |
| gg.Squaraus 0.6 | 7.3 | 5.9% | 0 |
| tad.Dalek98 0.98 | 7.7 | 5.5% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 18 / 35 | 4972 |
| 2 | 1 | 69.4 | 88.9 | 18 / 35 | 4932 |
| 3 | 1 | 72.4 | 96.1 | 25 / 35 | 5403 |
| 4 | 1 | 70.0 | 91.4 | 18 / 35 | 4831 |
| 5 | 1 | 69.6 | 87.1 | 17 / 35 | 5167 |
| 6 | 1 | 68.6 | 87.9 | 13 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 52% |
| kvk.HebusLeTroll 0.35 | 58 | 71% |
| jlm.javaDisturbance 0.59 | 34 | 68% |
| bigpete.Stewie 1.0 | 9 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 40% | 76 |
| kvk.HebusLeTroll 0.35 | 35 | 35% | 61 |
| jlm.javaDisturbance 0.59 | 20 | 20% | 51 |
| yk.JahRoslav 1.1 | 3 | 3% | 6 |
| bigpete.Stewie 1.0 | 1 | 1% | 8 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 152418 melee ticks, 50201 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43789 sent, 39344 reached their opponent, 4801 virtual hits (12.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475801. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 179 over 6 battles (29.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.5 | 182 / 210 | 1.23 | 22.7% | 40747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 22.7% | 182 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 24 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 9.8% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.2% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 0 |
| sample.Walls 1.0 | 8.0 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.2 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 99.4 | 33 / 35 | 6708 |
| 2 | 1 | 73.4 | 95.2 | 28 / 35 | 6887 |
| 3 | 1 | 74.5 | 98.7 | 33 / 35 | 7050 |
| 4 | 1 | 73.3 | 96.2 | 27 / 35 | 6519 |
| 5 | 1 | 73.9 | 97.5 | 31 / 35 | 6718 |
| 6 | 1 | 74.0 | 97.8 | 30 / 35 | 6865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 120 | 89% |
| cre.Karolos 0.32 | 42 | 98% |
| stelo.RamTrackSurfer 1.2 | 16 | 94% |
| stelo.AreaTargetingBot 1.1 | 10 | 90% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 19 | 68% | 109 |
| cre.Karolos 0.32 | 5 | 18% | 49 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 21 |
| stelo.AreaTargetingBot 1.1 | 2 | 7% | 7 |
| sample.Walls 1.0 | 0 | 0% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 118068 melee ticks, 54721 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 69 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 35711 sent, 30393 reached their opponent, 7674 virtual hits (25.2% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474992. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.7 | 79 / 210 | 2.64 | 17.1% | 27004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 17.1% | 79 |
| rz.GlowBlowMelee 1.4 | 2.2 | 13.8% | 36 |
| florent.XSeries.X2 0.12 | 3.5 | 13.1% | 32 |
| davidalves.Phoenix 0.54 | 3.8 | 12.7% | 40 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.0% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.2% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.5 | 17 / 35 | 4807 |
| 2 | 1 | 66.9 | 82.2 | 14 / 35 | 4696 |
| 3 | 1 | 66.0 | 80.6 | 13 / 35 | 4494 |
| 4 | 1 | 66.0 | 81.0 | 14 / 35 | 4447 |
| 5 | 1 | 67.3 | 85.4 | 13 / 35 | 4657 |
| 6 | 1 | 64.1 | 77.8 | 8 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 57% |
| pedersen.Ugluk 1.1.1 | 24 | 71% |
| davidalves.Phoenix 0.54 | 23 | 57% |
| florent.XSeries.X2 0.12 | 20 | 55% |
| oog.melee.Corsair 1.0 | 9 | 78% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 38 | 29% | 50 |
| rz.GlowBlowMelee 1.4 | 26 | 20% | 50 |
| davidalves.Phoenix 0.54 | 26 | 20% | 44 |
| pedersen.Ugluk 1.1.1 | 24 | 18% | 31 |
| oog.melee.Corsair 1.0 | 7 | 5% | 20 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 5 |
| as.FrankTheTank 1.3 | 2 | 2% | 3 |
| evd.X1 0.01 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 131722 melee ticks, 36381 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42437 sent, 37166 reached their opponent, 6077 virtual hits (16.4% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479172. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 125 / 210 | 2.33 | 20.0% | 23934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.0% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 15.2% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 14.1% | 17 |
| jdw.Hurricane 1.4 | 3.7 | 13.4% | 27 |
| ds.Oo 2.2 | 5.0 | 9.5% | 10 |
| awesomeness.Elite 1.0 | 6.7 | 7.8% | 6 |
| adt.Ar2 1.1 | 7.0 | 7.8% | 1 |
| gjr.Cephalosporin 0.1 | 7.7 | 6.8% | 6 |
| amk.ChumbaMini 0.2 | 8.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.4 | 20 / 35 | 3916 |
| 2 | 1 | 68.2 | 85.7 | 22 / 35 | 3985 |
| 3 | 1 | 67.0 | 82.5 | 19 / 35 | 4103 |
| 4 | 1 | 68.3 | 86.1 | 22 / 35 | 3990 |
| 5 | 1 | 65.1 | 77.1 | 17 / 35 | 3764 |
| 6 | 1 | 69.5 | 88.6 | 25 / 35 | 4176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 62 | 94% |
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| jdw.Hurricane 1.4 | 26 | 62% |
| ds.Oo 2.2 | 10 | 80% |
| awesomeness.Elite 1.0 | 7 | 86% |
| adt.Ar2 1.1 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 23% | 25 |
| voidious.micro.BlitzBat 1.05 | 17 | 20% | 47 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 19% | 67 |
| awesomeness.Elite 1.0 | 9 | 10% | 16 |
| adt.Ar2 1.1 | 9 | 10% | 16 |
| ds.Oo 2.2 | 8 | 9% | 16 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 11 |
| amk.ChumbaMini 0.2 | 3 | 3% | 10 |

Posture (Hadur's M records, 200 rounds): 115156 melee ticks, 30988 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 36979 sent, 32479 reached their opponent, 4884 virtual hits (15.0% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485760. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 95.1 | 162 / 210 | 1.44 | 22.3% | 43256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 22.3% | 162 |
| ak.Fermat 2.0 | 2.0 | 13.8% | 23 |
| shu.nitro.LENIN .T34 | 3.5 | 12.0% | 13 |
| lrem.Spectre 0.4.4 | 3.7 | 12.3% | 10 |
| js.PinBall 1.6 | 5.0 | 10.7% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 94.6 | 27 / 35 | 7276 |
| 2 | 1 | 73.0 | 94.3 | 28 / 35 | 7067 |
| 3 | 1 | 73.9 | 95.6 | 29 / 35 | 7253 |
| 4 | 1 | 73.2 | 94.9 | 25 / 35 | 7012 |
| 5 | 1 | 73.8 | 95.2 | 28 / 35 | 7357 |
| 6 | 1 | 73.5 | 95.9 | 25 / 35 | 7291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 59 | 80% |
| shu.nitro.LENIN .T34 | 51 | 84% |
| lrem.Spectre 0.4.4 | 47 | 87% |
| js.PinBall 1.6 | 14 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 20 | 40% | 59 |
| shu.nitro.LENIN .T34 | 11 | 22% | 60 |
| lrem.Spectre 0.4.4 | 11 | 22% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 8% | 12 |
| js.PinBall 1.6 | 2 | 4% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 10 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 148043 melee ticks, 57308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46014 sent, 40983 reached their opponent, 8815 virtual hits (21.5% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474584. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.5 | 169 / 210 | 1.68 | 21.1% | 34458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.1% | 169 |
| mk.Alpha 0.2.1 | 2.3 | 13.0% | 22 |
| EH.Eagle 1.0.6 | 2.8 | 11.2% | 2 |
| joe.ADinosaur 1.0 | 5.3 | 9.3% | 1 |
| throxbot.ThroxBot 0.1 | 5.8 | 8.9% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 8.9% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.4% | 3 |
| wee.Gem 1.8.4 | 7.2 | 8.4% | 9 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 25 / 35 | 5439 |
| 2 | 1 | 70.8 | 93.3 | 27 / 35 | 5494 |
| 3 | 1 | 72.1 | 95.2 | 31 / 35 | 5895 |
| 4 | 1 | 72.2 | 96.5 | 30 / 35 | 5548 |
| 5 | 1 | 71.2 | 88.3 | 26 / 35 | 6393 |
| 6 | 1 | 71.2 | 93.0 | 30 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 93 | 91% |
| EH.Eagle 1.0.6 | 33 | 100% |
| throxbot.ThroxBot 0.1 | 23 | 91% |
| joe.ADinosaur 1.0 | 10 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 15 | 37% | 84 |
| joe.ADinosaur 1.0 | 6 | 15% | 17 |
| throxbot.ThroxBot 0.1 | 5 | 12% | 25 |
| EH.Eagle 1.0.6 | 4 | 10% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 10% | 20 |
| cs.Grudge 1.0 | 3 | 7% | 5 |
| wee.Gem 1.8.4 | 2 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 11 |

Posture (Hadur's M records, 199 rounds): 123502 melee ticks, 37108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 438 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 275 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39512 sent, 34340 reached their opponent, 7656 virtual hits (22.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478039. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.6 | 127 / 210 | 2.20 | 18.2% | 25379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 18.2% | 127 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 41 |
| uji.Antique 1.0 | 3.3 | 11.9% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.7% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.3% | 11 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.2% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 7.0% | 3 |
| stelo.Lifestealer 1.0 | 9.0 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 88.6 | 20 / 35 | 4029 |
| 2 | 1 | 68.6 | 90.2 | 23 / 35 | 4308 |
| 3 | 1 | 68.8 | 89.2 | 22 / 35 | 4552 |
| 4 | 1 | 68.1 | 87.0 | 24 / 35 | 4317 |
| 5 | 1 | 67.1 | 83.8 | 21 / 35 | 4156 |
| 6 | 1 | 65.3 | 81.0 | 17 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 78 | 79% |
| uji.Antique 1.0 | 38 | 89% |
| pfvicm.Sobieski 7.2.3b | 13 | 77% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 33% | 58 |
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 30 |
| uji.Antique 1.0 | 12 | 14% | 39 |
| qohnil.blot.BlotBot 3.61 | 11 | 13% | 33 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 15 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 12 |
| matt.advanced.Katana 1.0 | 2 | 2% | 13 |
| stelo.Lifestealer 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 121149 melee ticks, 32558 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 40685 sent, 35503 reached their opponent, 4582 virtual hits (12.9% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479152. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.7 | 121 / 210 | 1.84 | 20.3% | 32112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.3% | 121 |
| deewiant.Anomaly 0.2 | 2.3 | 15.1% | 37 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.8% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 11.3% | 6 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.3% | 1 |
| ap.Frederick 1.1 | 9.2 | 4.4% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 22 / 35 | 5116 |
| 2 | 1 | 70.9 | 90.8 | 20 / 35 | 5345 |
| 3 | 1 | 71.9 | 91.4 | 21 / 35 | 5710 |
| 4 | 1 | 70.6 | 90.2 | 17 / 35 | 5414 |
| 5 | 1 | 70.5 | 89.2 | 18 / 35 | 5342 |
| 6 | 1 | 71.4 | 92.1 | 23 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 63% |
| myl.micro.Troodon 1.10 | 25 | 96% |
| jok.PheonixM 0.1.2 | 21 | 95% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 46% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 36% | 65 |
| jok.PheonixM 0.1.2 | 8 | 9% | 23 |
| myl.micro.Troodon 1.10 | 7 | 8% | 28 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 170284 melee ticks, 53461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51685 sent, 46722 reached their opponent, 6335 virtual hits (13.6% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480178. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.0 | 64 / 210 | 2.60 | 18.6% | 27590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 18.6% | 64 |
| darkcanuck.B26354 1.06 | 2.5 | 15.6% | 58 |
| oog.melee.Capulet 1.2 | 3.2 | 14.8% | 43 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.1% | 28 |
| intruder.PrairieWolf 2.61 | 5.2 | 9.9% | 8 |
| tripphippy.Alice 1.1 | 6.7 | 8.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 6.7 | 7.9% | 8 |
| ntc.Opposite 1.5 | 7.5 | 7.7% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.7 | 8 / 35 | 4831 |
| 2 | 1 | 67.2 | 82.5 | 10 / 35 | 4891 |
| 3 | 1 | 68.3 | 85.0 | 16 / 35 | 4911 |
| 4 | 1 | 66.1 | 82.1 | 12 / 35 | 4313 |
| 5 | 1 | 63.3 | 73.2 | 9 / 35 | 4173 |
| 6 | 1 | 65.0 | 76.4 | 9 / 35 | 4471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 42% |
| oog.melee.Capulet 1.2 | 41 | 44% |
| stelo.PastFuture 2.3.2 | 20 | 50% |
| intruder.PrairieWolf 2.61 | 11 | 73% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 67% |
| tripphippy.Alice 1.1 | 5 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 49 | 33% | 69 |
| oog.melee.Capulet 1.2 | 34 | 23% | 51 |
| stelo.PastFuture 2.3.2 | 31 | 21% | 40 |
| intruder.PrairieWolf 2.61 | 12 | 8% | 21 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 7% | 13 |
| tripphippy.Alice 1.1 | 7 | 5% | 12 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |

Posture (Hadur's M records, 201 rounds): 160424 melee ticks, 40645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45352 sent, 40781 reached their opponent, 6375 virtual hits (15.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475454. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.4 | 59 / 210 | 2.86 | 16.2% | 24754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 89 |
| hadur117.Hadur 3.21y3 | 2.0 | 16.2% | 59 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 48 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.0% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.5% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.3% | 0 |
| fm.mammillarias 1.3 | 8.8 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.5 | 10 / 35 | 3916 |
| 2 | 2 | 66.0 | 82.9 | 10 / 35 | 4176 |
| 3 | 2 | 65.4 | 80.6 | 9 / 35 | 4188 |
| 4 | 2 | 66.5 | 81.9 | 13 / 35 | 4142 |
| 5 | 2 | 65.3 | 79.4 | 9 / 35 | 4315 |
| 6 | 2 | 63.3 | 74.0 | 8 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 62 | 44% |
| gh.mini.Griezel 0.2 | 35 | 34% |
| d414.nano.Quantum 1.0.0 | 13 | 69% |
| spinnercat.micro.Tyger 0.1 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 151 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 68 | 45% | 94 |
| gh.mini.Griezel 0.2 | 42 | 28% | 56 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 21 |
| spinnercat.micro.Tyger 0.1 | 8 | 5% | 15 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 10 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 9 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 149496 melee ticks, 36131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46531 sent, 41294 reached their opponent, 6267 virtual hits (15.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474508. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.9 | 136 / 210 | 1.90 | 19.3% | 30254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 19.3% | 136 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.1% | 36 |
| apc.botM 3.0 | 3.2 | 11.8% | 15 |
| lxx.ConceptA 0.8 | 4.5 | 10.2% | 4 |
| vjik.UnViolation 1.1 | 4.7 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 3 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.8% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 24 / 35 | 5242 |
| 2 | 1 | 69.8 | 90.2 | 25 / 35 | 5221 |
| 3 | 1 | 66.4 | 83.2 | 18 / 35 | 4713 |
| 4 | 1 | 70.2 | 94.3 | 24 / 35 | 5171 |
| 5 | 1 | 69.2 | 91.7 | 23 / 35 | 4926 |
| 6 | 1 | 68.8 | 89.8 | 22 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 74% |
| apc.botM 3.0 | 42 | 81% |
| lxx.ConceptA 0.8 | 20 | 80% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| vjik.UnViolation 1.1 | 11 | 82% |
| yk.JahMicro 1.0 | 8 | 63% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 75 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 40% | 83 |
| lxx.ConceptA 0.8 | 14 | 19% | 24 |
| apc.botM 3.0 | 13 | 17% | 46 |
| bayen.UbaMicro 1.4 | 7 | 9% | 11 |
| yk.JahMicro 1.0 | 3 | 4% | 12 |
| panzer.Panzer 0.2 | 3 | 4% | 5 |
| vjik.UnViolation 1.1 | 2 | 3% | 19 |
| conscience.Electron 1.3g | 2 | 3% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 118864 melee ticks, 52171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39632 sent, 34403 reached their opponent, 5636 virtual hits (16.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471737. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.1 | 127 / 210 | 1.80 | 22.0% | 29426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.2 | 22.0% | 127 |
| maribo.Quester 0.3 | 1.8 | 18.4% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.3% | 17 |
| labg.Cataclysm 2.05 | 4.7 | 11.2% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.0 | 10.2% | 9 |
| baal.nano.N 1.42 | 5.3 | 10.0% | 0 |
| zyx.micro.Ant 1.1 | 7.5 | 5.4% | 0 |
| sanja.First 0.1 | 7.5 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 83.6 | 16 / 35 | 4347 |
| 2 | 1 | 70.5 | 89.3 | 20 / 35 | 4903 |
| 3 | 1 | 71.8 | 91.8 | 24 / 35 | 5335 |
| 4 | 1 | 70.6 | 88.2 | 19 / 35 | 5136 |
| 5 | 1 | 72.9 | 96.4 | 29 / 35 | 5193 |
| 6 | 1 | 70.1 | 91.1 | 19 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 91 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 76% |
| labg.Cataclysm 2.05 | 19 | 63% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 67% |
| baal.nano.N 1.42 | 7 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 49% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 23% | 53 |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 15% | 23 |
| labg.Cataclysm 2.05 | 8 | 10% | 20 |
| baal.nano.N 1.42 | 2 | 2% | 12 |
| sanja.First 0.1 | 1 | 1% | 4 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 159388 melee ticks, 57319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45879 sent, 41309 reached their opponent, 5531 virtual hits (13.4% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484027. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.6 | 103 / 210 | 2.03 | 19.6% | 35495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 19.6% | 103 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 38 |
| stelo.Spread 0.9 | 2.5 | 15.4% | 51 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 13 |
| tcf.Reach 3 | 4.5 | 11.1% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.0% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.9 | 18 / 35 | 6310 |
| 2 | 1 | 71.8 | 92.4 | 22 / 35 | 6075 |
| 3 | 1 | 68.9 | 86.7 | 10 / 35 | 5399 |
| 4 | 1 | 71.6 | 91.1 | 19 / 35 | 6207 |
| 5 | 1 | 70.5 | 86.0 | 17 / 35 | 6127 |
| 6 | 1 | 69.4 | 87.3 | 17 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 65 | 60% |
| kid.Gladiator .7.2 | 56 | 64% |
| jcs.Seth 1.8 | 22 | 64% |
| tcf.Reach 3 | 10 | 80% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 43 | 40% | 71 |
| stelo.Spread 0.9 | 39 | 36% | 75 |
| jcs.Seth 1.8 | 14 | 13% | 34 |
| tcf.Reach 3 | 6 | 6% | 19 |
| ratosh.Wesco 1.4 | 3 | 3% | 5 |
| cli.Dancer 1.1 | 2 | 2% | 6 |

Posture (Hadur's M records, 200 rounds): 158615 melee ticks, 62328 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48656 sent, 43587 reached their opponent, 6772 virtual hits (15.5% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477432. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.8 | 41 / 210 | 2.55 | 16.4% | 25011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 134 |
| hadur117.Hadur 3.21y3 | 2.0 | 16.4% | 41 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.7% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.3% | 15 |
| rz.HawkOnFire 0.1 | 4.7 | 11.7% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.5 | 6.3% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 83.5 | 7 / 35 | 4158 |
| 2 | 2 | 65.6 | 80.6 | 9 / 35 | 4177 |
| 3 | 2 | 64.8 | 81.6 | 5 / 35 | 3779 |
| 4 | 2 | 66.2 | 83.2 | 7 / 35 | 4439 |
| 5 | 2 | 65.3 | 81.3 | 5 / 35 | 4143 |
| 6 | 2 | 66.8 | 86.3 | 8 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 21% |
| gh.mini.Gruwel 0.9 | 15 | 27% |
| rz.HawkOnFire 0.1 | 13 | 85% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 45% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 58% | 124 |
| gh.mini.Gruwel 0.9 | 25 | 15% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 15% | 29 |
| rz.HawkOnFire 0.1 | 13 | 8% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 6 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 142290 melee ticks, 49275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 42493 sent, 37236 reached their opponent, 5071 virtual hits (13.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475632. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.1 | 154 / 210 | 1.71 | 21.1% | 35428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.1% | 154 |
| alpha.RainingFire 1.0 | 3.0 | 12.5% | 18 |
| bzdp.Pansy 2.1 | 3.0 | 11.7% | 11 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 10 |
| mz.Cork 0.1 | 5.3 | 10.5% | 12 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.4% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.6% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 5.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.6 | 26 / 35 | 6000 |
| 2 | 1 | 71.8 | 92.4 | 24 / 35 | 6241 |
| 3 | 1 | 72.7 | 96.2 | 29 / 35 | 6004 |
| 4 | 1 | 71.8 | 94.9 | 28 / 35 | 5630 |
| 5 | 1 | 71.1 | 90.5 | 25 / 35 | 5541 |
| 6 | 1 | 71.0 | 90.2 | 22 / 35 | 6012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 35 | 89% |
| bzdp.Pansy 2.1 | 34 | 91% |
| alpha.RainingFire 1.0 | 33 | 82% |
| mz.Cork 0.1 | 27 | 85% |
| m3thos.Eva02 0.7.1 | 25 | 96% |
| bvh.mini.Fenrir 0.39 | 14 | 93% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 26% | 40 |
| bvh.micro.Freya 0.3 | 13 | 23% | 36 |
| mz.Cork 0.1 | 12 | 21% | 34 |
| bzdp.Pansy 2.1 | 7 | 12% | 38 |
| bvh.mini.Fenrir 0.39 | 5 | 9% | 18 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 29 |
| dl.BetterWalls 1.0 | 2 | 4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 137669 melee ticks, 46232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 50 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46210 sent, 41240 reached their opponent, 7551 virtual hits (18.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482012. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.4 | 174 / 210 | 1.68 | 20.7% | 36997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.7% | 174 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.8% | 4 |
| germ.TheMind .2 | 3.5 | 10.0% | 6 |
| agrach.Dalek 1.0 | 3.7 | 9.8% | 5 |
| EBBU.Sim2 1.02 | 4.8 | 9.3% | 1 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.0% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 7.2 | 8.3% | 0 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 7 |
| mb.Beast 0.1 | 7.8 | 8.1% | 4 |
| skm.Ryubot 1.0 | 9.7 | 7.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 27 / 35 | 6079 |
| 2 | 1 | 70.3 | 93.3 | 30 / 35 | 6048 |
| 3 | 1 | 69.9 | 93.3 | 28 / 35 | 5786 |
| 4 | 1 | 71.0 | 92.7 | 31 / 35 | 6660 |
| 5 | 1 | 71.0 | 94.3 | 29 / 35 | 6503 |
| 6 | 1 | 69.9 | 92.4 | 29 / 35 | 5921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 30 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 96% |
| germ.TheMind .2 | 26 | 100% |
| EBBU.Sim2 1.02 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 22 | 82% |
| mb.Beast 0.1 | 21 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| skm.Ryubot 1.0 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 24% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 16% | 13 |
| agrach.Dalek 1.0 | 5 | 14% | 40 |
| mb.Beast 0.1 | 5 | 14% | 20 |
| EBBU.Sim2 1.02 | 4 | 11% | 29 |
| stelo.UntouchableNano 1.3 | 4 | 11% | 18 |
| lmk.ACPFinal 0.1 | 3 | 8% | 17 |
| germ.TheMind .2 | 1 | 3% | 21 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 201 rounds): 96494 melee ticks, 28074 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 31092 sent, 26193 reached their opponent, 6909 virtual hits (26.4% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1465716. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.7 | 113 / 210 | 2.10 | 18.8% | 30396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 18.8% | 113 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 57 |
| bvh.mini.Freya 0.55 | 3.0 | 12.7% | 11 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.2% | 16 |
| cs.Wren 1.0 | 5.5 | 9.5% | 2 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.2% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.8% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 7.1% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 22 / 35 | 4986 |
| 2 | 1 | 67.0 | 80.6 | 19 / 35 | 4721 |
| 3 | 1 | 71.0 | 92.1 | 23 / 35 | 5580 |
| 4 | 1 | 66.7 | 82.5 | 13 / 35 | 4687 |
| 5 | 1 | 69.1 | 90.2 | 18 / 35 | 5217 |
| 6 | 1 | 69.2 | 88.9 | 18 / 35 | 5205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 82 | 62% |
| bts.mega.Gnarly 1.4 | 31 | 61% |
| bvh.mini.Freya 0.55 | 23 | 87% |
| kdf.KoulDestroyer 1.0 | 12 | 83% |
| cs.Wren 1.0 | 8 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 97 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 46% | 98 |
| bts.mega.Gnarly 1.4 | 17 | 18% | 35 |
| bvh.mini.Freya 0.55 | 12 | 12% | 25 |
| kdf.KoulDestroyer 1.0 | 10 | 10% | 17 |
| cs.Wren 1.0 | 6 | 6% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 134189 melee ticks, 45053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 42 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42753 sent, 37310 reached their opponent, 7031 virtual hits (18.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474906. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.7 | 132 / 210 | 1.74 | 22.6% | 35901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 22.6% | 132 |
| bvh.fry.Freya 0.82 | 2.2 | 16.3% | 14 |
| az.Ololobot 0.2.4 | 2.8 | 14.9% | 55 |
| winamp32.micro.MicroMacro 1.0 | 4.2 | 9.8% | 3 |
| apollokidd.ApolloKidd 0.9 | 5.3 | 8.8% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 7.7% | 3 |
| gimp.GimpBot 0.1 | 6.3 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.3 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.8 | 21 / 35 | 6275 |
| 2 | 1 | 71.4 | 91.4 | 23 / 35 | 6115 |
| 3 | 1 | 70.1 | 87.9 | 20 / 35 | 5964 |
| 4 | 1 | 69.0 | 87.1 | 20 / 35 | 5418 |
| 5 | 1 | 72.1 | 95.4 | 26 / 35 | 6191 |
| 6 | 1 | 70.7 | 90.7 | 22 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 77 | 57% |
| bvh.fry.Freya 0.82 | 74 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1114. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 40 | 51% | 91 |
| bvh.fry.Freya 0.82 | 19 | 24% | 64 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 6% | 11 |
| gimp.GimpBot 0.1 | 3 | 4% | 10 |
| apollokidd.ApolloKidd 0.9 | 2 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 3% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 3% | 4 |

Posture (Hadur's M records, 199 rounds): 149061 melee ticks, 65832 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 175 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 175 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42730 sent, 38123 reached their opponent, 6283 virtual hits (16.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473802. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 220 over 6 battles (36.7 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.2 | 145 / 210 | 1.79 | 20.9% | 34839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.9% | 145 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.7% | 26 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 17 |
| mz.AntiGrav 1.0 | 4.2 | 10.8% | 5 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 8 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 3 |
| stelo.Randomness 1.0 | 6.7 | 8.5% | 5 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 1 |
| sample.Corners 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.5 | 23 / 35 | 5689 |
| 2 | 1 | 71.5 | 91.4 | 25 / 35 | 5755 |
| 3 | 1 | 70.6 | 87.6 | 22 / 35 | 5488 |
| 4 | 1 | 71.8 | 91.4 | 24 / 35 | 5961 |
| 5 | 1 | 71.9 | 92.1 | 26 / 35 | 5822 |
| 6 | 1 | 72.5 | 94.3 | 25 / 35 | 6124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 81% |
| kano.gamma.KanoGamma 1.8 | 45 | 87% |
| mz.AntiGrav 1.0 | 22 | 95% |
| Polkwane.SmashMelee 1.0 | 14 | 93% |
| stelo.Randomness 1.0 | 12 | 83% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 18 | 27% | 67 |
| kano.gamma.KanoGamma 1.8 | 18 | 27% | 56 |
| Polkwane.SmashMelee 1.0 | 10 | 15% | 17 |
| stelo.Randomness 1.0 | 6 | 9% | 20 |
| mz.AntiGrav 1.0 | 5 | 8% | 25 |
| alpha.BlackIce 1.0 | 5 | 8% | 12 |
| amk.superstrike.SuperStrike 0.3 | 4 | 6% | 10 |
| sample.Corners 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 146746 melee ticks, 45855 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 118 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 118 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46350 sent, 41058 reached their opponent, 7450 virtual hits (18.1% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477894. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.8 | 125 / 210 | 1.91 | 19.4% | 30260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 19.4% | 125 |
| eem.EvBotNG v12.8 | 2.0 | 15.0% | 60 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 13 |
| ary.Swarm 1.1 | 3.7 | 12.6% | 4 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.6% | 7 |
| shrub.Silver v048 | 6.2 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.4% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 18 / 35 | 5069 |
| 2 | 1 | 69.8 | 90.2 | 20 / 35 | 4850 |
| 3 | 1 | 70.7 | 91.7 | 25 / 35 | 4978 |
| 4 | 1 | 69.7 | 88.3 | 22 / 35 | 5184 |
| 5 | 1 | 70.0 | 91.1 | 21 / 35 | 5094 |
| 6 | 1 | 69.7 | 89.5 | 19 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 71 | 56% |
| lessonz.robocode.Oz 0.5.0 | 41 | 93% |
| ary.Swarm 1.1 | 32 | 91% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 52% | 83 |
| lessonz.robocode.Oz 0.5.0 | 16 | 19% | 40 |
| simonton.nano.MeleeSeed 1.8 | 9 | 11% | 31 |
| ary.Swarm 1.1 | 7 | 8% | 29 |
| shrub.Silver v048 | 3 | 4% | 7 |
| stelo.Mirror 1.1 | 2 | 2% | 8 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 146171 melee ticks, 49359 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 98 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 46291 sent, 40974 reached their opponent, 5780 virtual hits (14.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484629. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.0 | 141 / 210 | 1.63 | 21.1% | 38294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.1% | 141 |
| wompi.Wallaby 5.1 | 2.2 | 15.3% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.6% | 15 |
| ara.Shera 0.88 | 3.8 | 12.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 1 |
| dsw.StaticD 1.0 | 7.0 | 6.3% | 3 |
| stelo.MirrorMicro 1.0 | 7.2 | 6.2% | 0 |
| maribo.IotaCT 1.1 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.2 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 89.8 | 22 / 35 | 6521 |
| 2 | 1 | 71.9 | 94.3 | 26 / 35 | 6258 |
| 3 | 1 | 73.0 | 96.2 | 26 / 35 | 6636 |
| 4 | 1 | 70.5 | 89.5 | 19 / 35 | 5998 |
| 5 | 1 | 71.3 | 93.3 | 22 / 35 | 6247 |
| 6 | 1 | 72.5 | 94.9 | 26 / 35 | 6634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 84% |
| maribo.mini.MiniQuester 0.1 | 42 | 81% |
| ara.Shera 0.88 | 31 | 68% |
| maribo.IotaCT 1.1 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 41% | 97 |
| ara.Shera 0.88 | 22 | 31% | 45 |
| maribo.mini.MiniQuester 0.1 | 16 | 23% | 53 |
| dsw.StaticD 1.0 | 2 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 3 |
| amz.NanoClone 1.41 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 158151 melee ticks, 50573 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47893 sent, 42770 reached their opponent, 7276 virtual hits (17.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484085. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.4 | 33 / 210 | 2.86 | 16.2% | 27381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 144 |
| hadur117.Hadur 3.21y3 | 2.0 | 16.2% | 33 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.2% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 81.0 | 4 / 35 | 4272 |
| 2 | 2 | 66.7 | 81.3 | 5 / 35 | 4570 |
| 3 | 2 | 67.2 | 80.3 | 6 / 35 | 4714 |
| 4 | 2 | 65.0 | 74.3 | 6 / 35 | 4305 |
| 5 | 2 | 65.6 | 74.9 | 6 / 35 | 4621 |
| 6 | 2 | 68.3 | 84.4 | 6 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 19% |
| brainfade.melee.Dusk 0.44 | 18 | 67% |
| dummy.micro.Sparrow 2.5 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 178 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 61% | 120 |
| brainfade.melee.Dusk 0.44 | 30 | 17% | 41 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 15 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 4 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 154740 melee ticks, 45680 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 25 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 46773 sent, 41381 reached their opponent, 6191 virtual hits (15.0% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471934. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.6 | 144 / 210 | 1.66 | 21.5% | 38803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.5% | 144 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 51 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.6% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 2 |
| jwirde.Gort 2.0 | 4.7 | 9.2% | 1 |
| stf.PanzerGeneral 0.1 | 6.7 | 7.0% | 0 |
| wompi.Quokka 1.6 | 6.8 | 7.0% | 1 |
| disan.Chair 2.2.0 | 7.3 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 86.3 | 23 / 35 | 6140 |
| 2 | 1 | 71.5 | 92.1 | 20 / 35 | 6244 |
| 3 | 1 | 71.8 | 93.0 | 26 / 35 | 6482 |
| 4 | 1 | 73.5 | 95.9 | 27 / 35 | 6775 |
| 5 | 1 | 71.6 | 92.7 | 23 / 35 | 6211 |
| 6 | 1 | 73.3 | 95.9 | 25 / 35 | 6951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 97 | 70% |
| tzu.TheArtOfWar 1.2 | 62 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| disan.Chair 2.2.0 | 5 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 61% | 117 |
| tzu.TheArtOfWar 1.2 | 11 | 16% | 45 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 12 |
| jwirde.Gort 2.0 | 4 | 6% | 18 |
| wompi.Quokka 1.6 | 3 | 4% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 146284 melee ticks, 53084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48560 sent, 43586 reached their opponent, 8360 virtual hits (19.2% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21y3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486010. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.5 | 129 / 210 | 1.76 | 20.9% | 34840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 20.9% | 129 |
| jje.BagPuss 1.2 | 2.0 | 12.5% | 13 |
| myl.nano.Graviton 1.10 | 3.8 | 10.5% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 8 |
| eem.IWillFireNoBullet v2.8 | 4.8 | 9.0% | 49 |
| hvilela.HVilela 0.9 | 6.5 | 8.9% | 1 |
| fm.claire 1.7 | 6.8 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.7% | 3 |
| wit.Deep7 2.0 | 8.8 | 5.9% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.3 | 25 / 35 | 6308 |
| 2 | 1 | 71.4 | 91.7 | 24 / 35 | 4760 |
| 3 | 1 | 72.5 | 96.8 | 26 / 35 | 6191 |
| 4 | 1 | 70.9 | 91.1 | 22 / 35 | 5792 |
| 5 | 1 | 68.9 | 87.3 | 12 / 35 | 5716 |
| 6 | 1 | 70.5 | 87.9 | 20 / 35 | 6073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 45% |
| jje.BagPuss 1.2 | 41 | 78% |
| sul.Lunar 1.1 | 30 | 83% |
| myl.nano.Graviton 1.10 | 24 | 96% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 93% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 34 | 42% | 0 |
| jje.BagPuss 1.2 | 18 | 22% | 70 |
| sul.Lunar 1.1 | 8 | 10% | 38 |
| myl.nano.Graviton 1.10 | 7 | 9% | 32 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 6% | 25 |
| fm.claire 1.7 | 4 | 5% | 15 |
| hvilela.HVilela 0.9 | 3 | 4% | 11 |
| wit.Deep7 2.0 | 2 | 2% | 15 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 171566 melee ticks, 78886 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52975 sent, 47984 reached their opponent, 6263 virtual hits (13.1% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21y3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478123. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.9 | 117 / 210 | 1.97 | 21.0% | 30966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21y3 | 1.0 | 21.0% | 117 |
| kc.mini.Mirage 0.2 | 2.0 | 18.5% | 64 |
| cx.Princess 1.0 | 3.5 | 12.7% | 21 |
| mz.MicroSheep 1.0 | 3.8 | 12.3% | 6 |
| sadoner.killer 0.2 | 4.8 | 10.9% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.6% | 0 |
| kurios.DOSexe .9a | 7.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 21 / 35 | 4912 |
| 2 | 1 | 71.0 | 91.8 | 24 / 35 | 5601 |
| 3 | 1 | 68.5 | 85.4 | 17 / 35 | 4935 |
| 4 | 1 | 70.7 | 91.1 | 22 / 35 | 5273 |
| 5 | 1 | 68.8 | 85.7 | 18 / 35 | 5071 |
| 6 | 1 | 68.6 | 84.3 | 15 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 109 | 73% |
| cx.Princess 1.0 | 23 | 61% |
| mz.MicroSheep 1.0 | 12 | 92% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| sadoner.killer 0.2 | 4 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 52% | 121 |
| cx.Princess 1.0 | 19 | 20% | 31 |
| sadoner.killer 0.2 | 12 | 13% | 20 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 13 |
| mz.MicroSheep 1.0 | 5 | 5% | 18 |
| kurios.DOSexe .9a | 1 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 135935 melee ticks, 51685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 36761 sent, 32246 reached their opponent, 4980 virtual hits (15.4% of those reached).

