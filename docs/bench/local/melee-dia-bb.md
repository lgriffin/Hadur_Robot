# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 572 over 6 battles (95.3 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.0 | 59 / 210 | 2.17 | 17.5% | 30710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.1% | 127 |
| hadur117.Hadur 3.20bb | 2.0 | 17.5% | 59 |
| sgp.JollyNinja 3.53 | 3.5 | 11.2% | 20 |
| mz.MicroGodMelee 1 | 4.3 | 10.4% | 3 |
| lorneswork.Predator 1.0 | 5.0 | 10.4% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.2 | 10.2% | 1 |
| adt.Ar2 1.0 | 7.0 | 8.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 86.3 | 10 / 35 | 5097 |
| 2 | 2 | 66.7 | 86.0 | 7 / 35 | 4993 |
| 3 | 2 | 67.7 | 89.2 | 10 / 35 | 5047 |
| 4 | 2 | 67.3 | 85.1 | 9 / 35 | 5172 |
| 5 | 2 | 68.7 | 88.3 | 14 / 35 | 5517 |
| 6 | 2 | 67.2 | 87.0 | 9 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 13% |
| sgp.JollyNinja 3.53 | 29 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| mz.MicroGodMelee 1 | 8 | 88% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1142. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 70% | 134 |
| sgp.JollyNinja 3.53 | 21 | 13% | 31 |
| lorneswork.Predator 1.0 | 11 | 7% | 15 |
| mz.MicroGodMelee 1 | 4 | 3% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 3% | 10 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 139356 melee ticks, 87410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 44618 sent, 39674 reached their opponent, 7907 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.5 | 103 / 210 | 2.12 | 19.0% | 31036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.0% | 103 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.6% | 27 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.7% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 10 |
| Noran.BitchingElk 0.054 | 6.5 | 8.0% | 20 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.3% | 3 |
| sch.Simone 0.3d | 7.7 | 6.8% | 4 |
| stelo.PatternRobot 1.0 | 8.8 | 5.7% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.3 | 19 / 35 | 5087 |
| 2 | 1 | 68.6 | 87.0 | 18 / 35 | 5041 |
| 3 | 1 | 68.3 | 87.9 | 14 / 35 | 5048 |
| 4 | 1 | 70.6 | 92.4 | 22 / 35 | 5488 |
| 5 | 1 | 69.6 | 87.3 | 19 / 35 | 5444 |
| 6 | 1 | 66.8 | 84.1 | 11 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 78% |
| pulsar.PulsarMax 0.8.9 | 44 | 55% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 83% |
| Noran.BitchingElk 0.054 | 13 | 15% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| sch.Simone 0.3d | 11 | 91% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 0% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 33% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 25% | 69 |
| Noran.BitchingElk 0.054 | 12 | 11% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 10% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 13 |
| sch.Simone 0.3d | 5 | 5% | 18 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 8 |
| stelo.PatternRobot 1.0 | 1 | 1% | 4 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 169914 melee ticks, 45810 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 103 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 59345 sent, 54632 reached their opponent, 9671 virtual hits (17.7% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 6 battles (76.0 per battle, most in one battle 189). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.1 | 170 / 210 | 1.71 | 20.6% | 37947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.6% | 170 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 8 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 14 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 12 |
| urdos.URDOS 1.3 | 5.2 | 8.9% | 3 |
| adt.Ar1 2.1 | 5.8 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 26 / 35 | 6167 |
| 2 | 1 | 69.0 | 87.9 | 26 / 35 | 5927 |
| 3 | 1 | 70.9 | 94.3 | 29 / 35 | 6082 |
| 4 | 1 | 71.9 | 96.8 | 33 / 35 | 6355 |
| 5 | 1 | 70.7 | 91.7 | 26 / 35 | 6400 |
| 6 | 1 | 72.2 | 94.0 | 30 / 35 | 7016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 76 | 89% |
| radnor.DoctorBob 1.42 | 55 | 98% |
| kawigi.nano.Lib 1.0 | 37 | 95% |
| urdos.URDOS 1.3 | 5 | 80% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 12 | 29% | 78 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 20% | 9 |
| kawigi.nano.Lib 1.0 | 7 | 17% | 39 |
| radnor.DoctorBob 1.42 | 6 | 15% | 53 |
| urdos.URDOS 1.3 | 5 | 12% | 11 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 10 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 124956 melee ticks, 40060 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38230 sent, 33692 reached their opponent, 8611 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 632 over 6 battles (105.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.9 | 38 / 210 | 2.09 | 18.1% | 34255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 157 |
| hadur117.Hadur 3.20bb | 2.0 | 18.1% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 9 |
| TNT.TNT 0.99.1 | 4.3 | 10.3% | 4 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.1% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.2% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.6 | 91.1 | 11 / 35 | 6064 |
| 2 | 2 | 68.7 | 87.3 | 6 / 35 | 5753 |
| 3 | 2 | 68.6 | 88.6 | 3 / 35 | 5469 |
| 4 | 2 | 69.5 | 89.5 | 8 / 35 | 5857 |
| 5 | 2 | 68.3 | 85.7 | 5 / 35 | 5570 |
| 6 | 2 | 68.2 | 85.1 | 5 / 35 | 5542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 10% |
| apc.LeeroyJenkins2 1.0 | 20 | 70% |
| TNT.TNT 0.99.1 | 7 | 57% |
| josago.Jorgito 0.16 | 3 | 100% |
| css.Delitioner 0.11 | 3 | 67% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1349. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 78% | 155 |
| apc.LeeroyJenkins2 1.0 | 19 | 11% | 30 |
| TNT.TNT 0.99.1 | 10 | 6% | 15 |
| css.Delitioner 0.11 | 3 | 2% | 5 |
| josago.Jorgito 0.16 | 3 | 2% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 195246 melee ticks, 79716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 75 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 59623 sent, 54699 reached their opponent, 8038 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 764 over 6 battles (127.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.7 | 40 / 210 | 2.82 | 15.5% | 23408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.7% | 98 |
| justin.DemonicRage 3.4 | 1.8 | 17.1% | 56 |
| hadur117.Hadur 3.20bb | 2.8 | 15.5% | 40 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 11 |
| ms.Ares 0.19 | 5.5 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 5 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 4.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 84.4 | 6 / 35 | 3911 |
| 2 | 3 | 63.9 | 77.5 | 8 / 35 | 3535 |
| 3 | 3 | 63.0 | 76.2 | 6 / 35 | 3655 |
| 4 | 3 | 63.5 | 75.2 | 5 / 35 | 3990 |
| 5 | 3 | 65.8 | 82.5 | 4 / 35 | 4319 |
| 6 | 3 | 65.8 | 82.5 | 11 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 43 | 51% |
| cb.fire.Firestarter 2.0f | 36 | 6% |
| wompi.Numbat 2.1 | 15 | 60% |
| axeBots.HataMoto 3.09 | 6 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 65 | 37% | 89 |
| cb.fire.Firestarter 2.0f | 52 | 30% | 55 |
| wompi.Numbat 2.1 | 31 | 18% | 38 |
| axeBots.HataMoto 3.09 | 9 | 5% | 11 |
| ms.Ares 0.19 | 5 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162715 melee ticks, 34028 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49711 sent, 44581 reached their opponent, 7376 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.3 | 139 / 210 | 1.79 | 20.0% | 32063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.0% | 139 |
| jekl.StoneGhost 0.7 | 2.5 | 14.2% | 18 |
| origin.SleepSiphon 1.7b | 2.7 | 13.8% | 34 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.0% | 11 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.0% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 5.8% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.8% | 2 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 27 / 35 | 5814 |
| 2 | 1 | 68.6 | 87.0 | 18 / 35 | 4828 |
| 3 | 1 | 70.9 | 93.3 | 23 / 35 | 5309 |
| 4 | 1 | 70.0 | 90.2 | 21 / 35 | 5462 |
| 5 | 1 | 69.6 | 89.2 | 21 / 35 | 5112 |
| 6 | 1 | 71.7 | 94.6 | 29 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 53 | 81% |
| jekl.StoneGhost 0.7 | 52 | 94% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 82% |
| gg.Wolverine 2.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 57% |
| DBall.NUKE 0.1 | 1 | 0% |
| mld.Wisdom 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 39% | 85 |
| jekl.StoneGhost 0.7 | 21 | 28% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 9% | 29 |
| mld.Wisdom 1.0 | 6 | 8% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 14 |
| DBall.NUKE 0.1 | 2 | 3% | 2 |
| gg.Wolverine 2.0 | 1 | 1% | 7 |
| sample.Fire 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 150367 melee ticks, 44416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 72 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 46147 sent, 41415 reached their opponent, 9127 virtual hits (22.0% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 515 over 6 battles (85.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.9 | 130 / 210 | 1.55 | 21.1% | 39627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.1% | 130 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 16.6% | 39 |
| rtk.Tachikoma 1.0 | 3.0 | 15.5% | 20 |
| franzor.Lizt 1.3.1 | 4.2 | 11.3% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.9% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| drd.Dreadknoght 0.9 | 9.3 | 2.2% | 0 |
| sample.Target 1.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.7 | 18 / 35 | 6294 |
| 2 | 1 | 72.6 | 93.0 | 21 / 35 | 6788 |
| 3 | 1 | 73.2 | 95.2 | 23 / 35 | 6493 |
| 4 | 1 | 73.5 | 95.9 | 25 / 35 | 6807 |
| 5 | 1 | 71.9 | 93.0 | 19 / 35 | 6205 |
| 6 | 1 | 73.2 | 93.3 | 24 / 35 | 7040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 85% |
| rsalesc.melee.Monk 0.3.6c | 48 | 35% |
| franzor.Lizt 1.3.1 | 39 | 74% |
| oog.melee.CapuletDroid 1.1 | 21 | 81% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 36 | 43% | 79 |
| rtk.Tachikoma 1.0 | 25 | 30% | 87 |
| franzor.Lizt 1.3.1 | 12 | 14% | 1 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 34 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184530 melee ticks, 103453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55870 sent, 51023 reached their opponent, 10199 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 823 over 6 battles (137.2 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.2 | 136 / 210 | 1.80 | 19.8% | 30794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.8% | 136 |
| tm.Yuugao 1.0 | 2.2 | 13.8% | 35 |
| shrub.Vapour v159 | 2.8 | 12.6% | 20 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.9% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.2% | 5 |
| m3thos.Eva00 1.1 | 6.0 | 8.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.3 | 7.5% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.4% | 0 |
| SHAM.WOW 1.4 | 8.8 | 5.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 23 / 35 | 5156 |
| 2 | 1 | 70.3 | 91.4 | 25 / 35 | 5242 |
| 3 | 1 | 67.9 | 85.7 | 19 / 35 | 4869 |
| 4 | 1 | 71.1 | 94.9 | 24 / 35 | 5496 |
| 5 | 1 | 70.2 | 93.3 | 25 / 35 | 4977 |
| 6 | 1 | 69.2 | 89.8 | 20 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 47 | 77% |
| shrub.Vapour v159 | 39 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 33 | 91% |
| Krabb.sliNk.Garm 0.9u | 27 | 78% |
| m3thos.Eva00 1.1 | 9 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 86% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 35% | 69 |
| shrub.Vapour v159 | 16 | 20% | 45 |
| Krabb.sliNk.Garm 0.9u | 15 | 19% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 14% | 41 |
| m3thos.Eva00 1.1 | 2 | 2% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 1% | 10 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154533 melee ticks, 45360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 66 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 49412 sent, 44414 reached their opponent, 8133 virtual hits (18.3% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 737 over 6 battles (122.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.2 | 52 / 210 | 3.14 | 15.2% | 21568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.4% | 102 |
| hadur117.Hadur 3.20bb | 1.8 | 15.2% | 52 |
| kc.micro.Figment 1.0 | 2.8 | 14.1% | 22 |
| yagami.Tidus 0.11 | 4.7 | 10.4% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.0% | 13 |
| mc2.enemy.Original 0.9 | 5.3 | 10.0% | 20 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 77.8 | 10 / 35 | 3594 |
| 2 | 2 | 63.7 | 77.1 | 6 / 35 | 3599 |
| 3 | 1 | 64.7 | 78.4 | 12 / 35 | 4020 |
| 4 | 3 | 60.0 | 66.7 | 6 / 35 | 3389 |
| 5 | 2 | 62.7 | 75.2 | 6 / 35 | 3345 |
| 6 | 1 | 65.2 | 82.2 | 12 / 35 | 3621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 15% |
| kc.micro.Figment 1.0 | 31 | 84% |
| mc2.enemy.Original 0.9 | 17 | 35% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 4 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 37% | 70 |
| mc2.enemy.Original 0.9 | 29 | 18% | 35 |
| kc.micro.Figment 1.0 | 21 | 13% | 46 |
| yagami.Tidus 0.11 | 21 | 13% | 26 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 14 |
| dft.Calliope 5.6 | 6 | 4% | 10 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 148903 melee ticks, 38200 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 86 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48776 sent, 44060 reached their opponent, 6334 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 580 over 6 battles (96.7 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.6 | 170 / 210 | 1.31 | 21.3% | 35746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.3% | 170 |
| DTF.Kludgy 1.2b | 2.3 | 13.7% | 16 |
| ne.Chimera 1.2 | 3.0 | 13.1% | 4 |
| ejb.Polaris 1.0.1 | 3.7 | 12.5% | 8 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.7% | 4 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 6 |
| kurios.DOSexe .9b | 8.0 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 96.2 | 27 / 35 | 5797 |
| 2 | 1 | 72.2 | 96.5 | 29 / 35 | 6011 |
| 3 | 1 | 72.0 | 98.1 | 30 / 35 | 5719 |
| 4 | 1 | 72.1 | 96.8 | 29 / 35 | 6153 |
| 5 | 1 | 71.6 | 95.2 | 28 / 35 | 5863 |
| 6 | 1 | 72.4 | 96.5 | 27 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 83% |
| ejb.Polaris 1.0.1 | 52 | 90% |
| ne.Chimera 1.2 | 44 | 93% |
| vStar.RAFzilla 2.15 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| donjezza.Muncho 1.0 | 2 | 0% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 34% | 63 |
| ne.Chimera 1.2 | 9 | 20% | 43 |
| ejb.Polaris 1.0.1 | 8 | 18% | 54 |
| vStar.RAFzilla 2.15 | 3 | 7% | 18 |
| donjezza.Muncho 1.0 | 3 | 7% | 3 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 15 |
| kurios.DOSexe .9b | 0 | 0% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146144 melee ticks, 59436 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 70 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47922 sent, 43187 reached their opponent, 8107 virtual hits (18.8% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 6 battles (51.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.7 | 66 / 210 | 2.74 | 16.2% | 23263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.8% | 78 |
| hadur117.Hadur 3.20bb | 1.8 | 16.2% | 66 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.3% | 16 |
| djc.DynaBot 0.1.1 | 4.3 | 10.4% | 11 |
| br2.MobyDickBot 1.6 | 4.8 | 9.7% | 19 |
| rdt199.Warlord 0.73 | 6.3 | 8.9% | 14 |
| uji.YellohFellah 1.0 | 6.5 | 8.6% | 6 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 87.3 | 13 / 35 | 4156 |
| 2 | 2 | 64.3 | 79.0 | 10 / 35 | 3975 |
| 3 | 2 | 63.7 | 76.8 | 14 / 35 | 3584 |
| 4 | 2 | 65.1 | 80.3 | 14 / 35 | 3850 |
| 5 | 2 | 64.1 | 80.3 | 6 / 35 | 4017 |
| 6 | 2 | 63.9 | 80.3 | 9 / 35 | 3681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 47% |
| cx.mini.Nimrod 0.55 | 24 | 67% |
| djc.DynaBot 0.1.1 | 16 | 63% |
| br2.MobyDickBot 1.6 | 12 | 58% |
| uji.YellohFellah 1.0 | 7 | 57% |
| rdt199.Warlord 0.73 | 6 | 33% |

Hadur died in 147 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 70 | 48% | 96 |
| cx.mini.Nimrod 0.55 | 22 | 15% | 36 |
| djc.DynaBot 0.1.1 | 16 | 11% | 24 |
| rdt199.Warlord 0.73 | 11 | 7% | 14 |
| br2.MobyDickBot 1.6 | 10 | 7% | 16 |
| uji.YellohFellah 1.0 | 8 | 5% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 5 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 7 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154948 melee ticks, 38367 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 43 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50537 sent, 45552 reached their opponent, 6254 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 800 over 6 battles (133.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.5 | 127 / 210 | 2.13 | 18.3% | 24022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.3% | 127 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.8% | 22 |
| darkcanuck.Leon 1.01 | 3.2 | 12.3% | 21 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 29 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 6 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.3% | 1 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.4% | 2 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.2 | 20 / 35 | 3848 |
| 2 | 1 | 68.3 | 86.7 | 22 / 35 | 4455 |
| 3 | 1 | 67.8 | 88.6 | 19 / 35 | 3805 |
| 4 | 1 | 68.5 | 91.7 | 21 / 35 | 3922 |
| 5 | 1 | 68.8 | 89.5 | 24 / 35 | 4293 |
| 6 | 1 | 67.1 | 86.0 | 21 / 35 | 3699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 85% |
| darkcanuck.Leon 1.01 | 45 | 87% |
| nat.PallasHawk 1.0 | 44 | 66% |
| brainfade.melee.Genghis 0.36 | 9 | 78% |
| jaybot.bots.Oddball 4.0 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| jp.Perpy 16.0 | 2 | 50% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 26% | 55 |
| nat.PallasHawk 1.0 | 20 | 22% | 45 |
| darkcanuck.Leon 1.01 | 15 | 16% | 60 |
| jrm.Test0 1.0 | 9 | 10% | 13 |
| brainfade.melee.Genghis 0.36 | 7 | 8% | 18 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 130062 melee ticks, 40528 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44851 sent, 39932 reached their opponent, 6617 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.5 | 69 / 210 | 2.49 | 16.4% | 25433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.5% | 39 |
| hadur117.Hadur 3.20bb | 2.2 | 16.4% | 69 |
| mn.Combat 3.25.0 | 2.3 | 16.3% | 72 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 12 |
| shinh.Entangled 0.3 | 4.5 | 11.6% | 18 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 90.2 | 12 / 35 | 4435 |
| 2 | 3 | 64.9 | 81.0 | 11 / 35 | 3878 |
| 3 | 2 | 65.7 | 81.9 | 12 / 35 | 4349 |
| 4 | 1 | 68.6 | 87.9 | 16 / 35 | 4859 |
| 5 | 3 | 65.2 | 83.2 | 10 / 35 | 3942 |
| 6 | 3 | 63.6 | 76.8 | 8 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 36% |
| ags.Glacier 0.2.11 | 49 | 63% |
| shinh.Entangled 0.3 | 18 | 56% |
| gh.micro.Gruweltje 0.7 | 12 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 38% | 77 |
| ags.Glacier 0.2.11 | 42 | 30% | 69 |
| shinh.Entangled 0.3 | 19 | 13% | 27 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 21 |
| maribo.FollowFire 1 | 5 | 4% | 5 |
| apc.Colossus2 0.17 | 4 | 3% | 6 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151292 melee ticks, 50527 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43142 sent, 38061 reached their opponent, 5963 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.3 | 159 / 210 | 1.51 | 20.8% | 34819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.8% | 159 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.6% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.1% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 7.8% | 0 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.0 | 25 / 35 | 5563 |
| 2 | 1 | 71.0 | 92.4 | 25 / 35 | 5816 |
| 3 | 1 | 72.3 | 96.5 | 26 / 35 | 6155 |
| 4 | 1 | 71.9 | 96.2 | 28 / 35 | 5868 |
| 5 | 1 | 71.5 | 95.9 | 29 / 35 | 5702 |
| 6 | 1 | 71.2 | 92.1 | 26 / 35 | 5715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 93% |
| catcat20.shape.Theta 0.018 | 52 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 88% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 39% | 63 |
| simonton.micro.Sprout 1.1.3 | 18 | 35% | 82 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 16% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 143639 melee ticks, 48962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 45474 sent, 40841 reached their opponent, 10069 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 548 over 6 battles (91.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.0 | 126 / 210 | 2.08 | 19.5% | 32202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.5% | 126 |
| emp.Yngwie 1.11 | 2.8 | 13.3% | 45 |
| kawigi.micro.Shiz 1.1 | 3.0 | 12.8% | 13 |
| mld.DustBunny 3.8 | 3.2 | 12.5% | 6 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.7% | 12 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.4% | 3 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.0% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 21 / 35 | 5246 |
| 2 | 1 | 70.9 | 91.7 | 24 / 35 | 5364 |
| 3 | 1 | 69.8 | 87.9 | 20 / 35 | 5597 |
| 4 | 1 | 68.6 | 84.8 | 18 / 35 | 5301 |
| 5 | 1 | 69.7 | 88.6 | 25 / 35 | 5363 |
| 6 | 1 | 69.4 | 88.3 | 18 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 59 | 71% |
| mld.DustBunny 3.8 | 26 | 88% |
| kawigi.micro.Shiz 1.1 | 25 | 88% |
| kawigi.robot.Girl 1.2 | 22 | 77% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 40% | 82 |
| kawigi.micro.Shiz 1.1 | 13 | 15% | 39 |
| mld.DustBunny 3.8 | 12 | 13% | 36 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 19 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 13 |
| divineomega.TrialBot 0.003 | 2 | 2% | 12 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 6 |
| lambdaxy.TBot 0.1 | 0 | 0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168357 melee ticks, 52567 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 47 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 3.

Targeting waves (202 rounds): 54635 sent, 49943 reached their opponent, 8006 virtual hits (16.0% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 447 over 6 battles (74.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.4 | 125 / 210 | 1.96 | 20.0% | 34462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.0% | 125 |
| gh.Griezel 0.5.2 | 2.0 | 16.6% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.6% | 26 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.1% | 1 |
| repositorio.NanoStep 1.0 | 8.3 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.0 | 26 / 35 | 5802 |
| 2 | 1 | 72.4 | 95.6 | 25 / 35 | 6289 |
| 3 | 1 | 70.3 | 87.9 | 21 / 35 | 5674 |
| 4 | 1 | 71.3 | 91.7 | 19 / 35 | 6134 |
| 5 | 1 | 68.8 | 85.7 | 18 / 35 | 5195 |
| 6 | 1 | 68.1 | 82.2 | 16 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 100 | 73% |
| techdude.forest.FlamingForest 1.1 | 34 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 95% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 34 | 39% | 104 |
| techdude.forest.FlamingForest 1.1 | 18 | 20% | 42 |
| bvh.fnr.Fenrir 0.36l | 15 | 17% | 22 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 6% | 20 |
| stelo.IntrinsicVolatility 1.4 | 4 | 5% | 7 |
| divineomega.DivineBot 1.9.4.5 | 4 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 2 | 2% | 1 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 179551 melee ticks, 69440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57409 sent, 52602 reached their opponent, 8821 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 534 over 6 battles (89.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.3 | 106 / 210 | 2.06 | 19.4% | 34470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.4% | 106 |
| et.Predator 1.8 | 2.5 | 13.6% | 33 |
| cx.BlestPain 1.41 | 2.8 | 13.2% | 41 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.7% | 27 |
| ahf.NanoAndrew .4 | 5.5 | 9.9% | 3 |
| nic.Nicator 2.4 | 6.2 | 8.6% | 2 |
| maribo.melee.BMV 0.1 | 6.3 | 8.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.4 | 23 / 35 | 6076 |
| 2 | 1 | 69.7 | 88.9 | 15 / 35 | 6013 |
| 3 | 1 | 67.4 | 80.6 | 19 / 35 | 5111 |
| 4 | 1 | 69.3 | 85.4 | 13 / 35 | 6225 |
| 5 | 1 | 70.5 | 93.0 | 20 / 35 | 5582 |
| 6 | 1 | 69.4 | 89.2 | 16 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 79% |
| et.Predator 1.8 | 50 | 68% |
| cx.BlestPain 1.41 | 36 | 31% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 50% |

Hadur died in 111 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 34% | 53 |
| et.Predator 1.8 | 31 | 28% | 63 |
| oog.melee.Mercutio 1.0 | 22 | 20% | 55 |
| ahf.NanoAndrew .4 | 7 | 6% | 17 |
| maribo.melee.BMV 0.1 | 3 | 3% | 8 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| nic.Nicator 2.4 | 1 | 1% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164235 melee ticks, 68990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 70 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 54098 sent, 49150 reached their opponent, 10168 virtual hits (20.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 642 over 6 battles (107.0 per battle, most in one battle 154). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.1 | 133 / 210 | 1.98 | 19.3% | 29095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.3% | 133 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.9% | 29 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.1% | 13 |
| uji.DBH 1.1 | 3.8 | 10.8% | 11 |
| sigterm.Sigterm 1.0 | 5.5 | 8.9% | 12 |
| spinnercat.Robovirus 2.718 | 6.5 | 8.3% | 3 |
| ratosh.Nobo 0.21 | 6.8 | 8.1% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.8% | 4 |
| stelo.WangRobot 1.0 | 9.2 | 5.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 25 / 35 | 4711 |
| 2 | 1 | 71.0 | 94.6 | 28 / 35 | 5218 |
| 3 | 1 | 69.0 | 89.8 | 21 / 35 | 5054 |
| 4 | 1 | 67.3 | 84.4 | 18 / 35 | 4676 |
| 5 | 1 | 69.5 | 90.2 | 24 / 35 | 5011 |
| 6 | 1 | 66.9 | 83.8 | 17 / 35 | 4425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 75% |
| agd.Mooserwirt2 2.7 | 27 | 96% |
| uji.DBH 1.1 | 26 | 85% |
| sigterm.Sigterm 1.0 | 18 | 72% |
| spinnercat.Robovirus 2.718 | 11 | 91% |
| ratosh.Nobo 0.21 | 7 | 86% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 33% | 74 |
| agd.Mooserwirt2 2.7 | 12 | 15% | 42 |
| ratosh.Nobo 0.21 | 10 | 12% | 18 |
| sigterm.Sigterm 1.0 | 9 | 11% | 15 |
| uji.DBH 1.1 | 8 | 10% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 8 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 5 |
| stelo.WangRobot 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140101 melee ticks, 44752 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 46640 sent, 41696 reached their opponent, 8702 virtual hits (20.9% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.9 | 202 / 210 | 1.10 | 22.7% | 37316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 22.7% | 202 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 4 |
| mld.Infinity 2.2 | 3.7 | 11.5% | 3 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 0 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.7% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 99.0 | 34 / 35 | 6689 |
| 2 | 1 | 73.5 | 99.0 | 34 / 35 | 6125 |
| 3 | 1 | 73.5 | 98.7 | 34 / 35 | 5906 |
| 4 | 1 | 73.5 | 99.0 | 33 / 35 | 6179 |
| 5 | 1 | 73.2 | 98.4 | 33 / 35 | 5960 |
| 6 | 1 | 74.2 | 99.4 | 34 / 35 | 6457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 100% |
| krillr.mini.JointStrike 2.0.0 | 28 | 100% |
| mld.Infinity 2.2 | 26 | 100% |
| erdnis.Rover 0.3 | 15 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 4 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 4 | 40% | 34 |
| davidalves.net.DuelistMiniMelee 1.2 | 2 | 20% | 78 |
| mld.Infinity 2.2 | 1 | 10% | 24 |
| pac.ABC 2.1 | 1 | 10% | 12 |
| mbh.Mbh 0.1 | 1 | 10% | 11 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 19 |
| pbg.R2D2 1.0 | 0 | 0% | 14 |
| erdnis.Rover 0.3 | 0 | 0% | 13 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 125523 melee ticks, 46010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 25 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42314 sent, 37809 reached their opponent, 8873 virtual hits (23.5% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 526 over 6 battles (87.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.9 | 160 / 210 | 1.55 | 21.6% | 37915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.6% | 160 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 21 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 9 |
| catcat20.Rabbit 0.001 | 4.2 | 10.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.7% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 28 / 35 | 6468 |
| 2 | 1 | 71.6 | 93.3 | 24 / 35 | 6301 |
| 3 | 1 | 73.0 | 95.9 | 28 / 35 | 6555 |
| 4 | 1 | 71.4 | 93.0 | 24 / 35 | 5947 |
| 5 | 1 | 73.3 | 97.5 | 30 / 35 | 6702 |
| 6 | 1 | 71.3 | 90.5 | 26 / 35 | 5942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 89% |
| fwb.Nine 1.0.1 | 48 | 96% |
| catcat20.Rabbit 0.001 | 20 | 75% |
| nz.jdc.nano.GridFu 1.0 | 12 | 92% |
| m3thos.mini.Eva01 0.5.5 | 8 | 88% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 55% | 99 |
| catcat20.Rabbit 0.001 | 9 | 16% | 41 |
| fwb.Nine 1.0.1 | 5 | 9% | 16 |
| m3thos.mini.Eva01 0.5.5 | 3 | 5% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 9 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 22 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166282 melee ticks, 63362 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51970 sent, 47123 reached their opponent, 10531 virtual hits (22.3% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 300 over 6 battles (50.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.7 | 138 / 210 | 1.57 | 20.9% | 35635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.9% | 138 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 50 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 4 |
| eld.Hmm 1.0 | 5.0 | 8.8% | 12 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.1% | 0 |
| el.JumpShoot 0.2 | 7.5 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 24 / 35 | 6159 |
| 2 | 1 | 71.6 | 94.9 | 22 / 35 | 5909 |
| 3 | 1 | 71.8 | 94.6 | 23 / 35 | 5886 |
| 4 | 1 | 73.0 | 97.1 | 28 / 35 | 6179 |
| 5 | 1 | 70.7 | 91.7 | 22 / 35 | 5613 |
| 6 | 1 | 70.6 | 90.8 | 19 / 35 | 5889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 69% |
| dummy.mini.Scimitar 1.01 | 27 | 96% |
| cf.RiO.RiOx 4.2.1 | 23 | 96% |
| eld.Hmm 1.0 | 12 | 25% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 57% | 103 |
| eld.Hmm 1.0 | 11 | 15% | 25 |
| dummy.mini.Scimitar 1.01 | 8 | 11% | 45 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 27 |
| PSW.Relentless 0.1 | 2 | 3% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184882 melee ticks, 82748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53695 sent, 48995 reached their opponent, 8325 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 98 / 210 | 2.08 | 18.3% | 29179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.3% | 98 |
| pe.SandboxDT 2.71m | 2.3 | 16.1% | 53 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.6% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 23 |
| bigpete.Stewie 1.0 | 5.0 | 11.6% | 8 |
| yk.JahRoslav 1.1 | 6.2 | 7.2% | 2 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 16 / 35 | 5012 |
| 2 | 1 | 70.1 | 90.5 | 20 / 35 | 5163 |
| 3 | 1 | 68.2 | 87.0 | 17 / 35 | 4791 |
| 4 | 1 | 68.4 | 87.3 | 16 / 35 | 4732 |
| 5 | 1 | 69.1 | 89.2 | 18 / 35 | 4745 |
| 6 | 1 | 67.8 | 88.3 | 11 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 40% |
| kvk.HebusLeTroll 0.35 | 45 | 71% |
| jlm.javaDisturbance 0.59 | 40 | 73% |
| bigpete.Stewie 1.0 | 16 | 75% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 45 | 39% | 80 |
| kvk.HebusLeTroll 0.35 | 29 | 25% | 50 |
| jlm.javaDisturbance 0.59 | 22 | 19% | 46 |
| bigpete.Stewie 1.0 | 7 | 6% | 19 |
| tad.Dalek98 0.98 | 6 | 5% | 7 |
| yk.JahRoslav 1.1 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 160208 melee ticks, 50628 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51360 sent, 46459 reached their opponent, 7395 virtual hits (15.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 601 over 6 battles (100.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 95.9 | 169 / 210 | 1.37 | 21.8% | 36667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.8% | 169 |
| pe.SandboxLump 1.52 | 2.2 | 16.4% | 28 |
| cre.Karolos 0.32 | 2.8 | 14.0% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.0% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.3% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.2% | 1 |
| sample.Walls 1.0 | 7.5 | 7.8% | 3 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 25 / 35 | 5693 |
| 2 | 1 | 73.3 | 96.5 | 28 / 35 | 6275 |
| 3 | 1 | 73.7 | 97.8 | 30 / 35 | 6297 |
| 4 | 1 | 72.5 | 94.3 | 28 / 35 | 5961 |
| 5 | 1 | 73.1 | 94.9 | 28 / 35 | 6194 |
| 6 | 1 | 73.7 | 98.1 | 30 / 35 | 6247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 93 | 84% |
| cre.Karolos 0.32 | 57 | 95% |
| stelo.RamTrackSurfer 1.2 | 14 | 93% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| sample.Walls 1.0 | 7 | 57% |
| cw.megas.Blade 0.8 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 21 | 46% | 91 |
| cre.Karolos 0.32 | 12 | 26% | 53 |
| stelo.AreaTargetingBot 1.1 | 3 | 7% | 20 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 26 |
| sample.Walls 1.0 | 2 | 4% | 4 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128106 melee ticks, 51493 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 40006 sent, 35164 reached their opponent, 10551 virtual hits (30.0% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 772 over 6 battles (128.7 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.5 | 91 / 210 | 2.30 | 17.6% | 25685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 17.6% | 91 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.8% | 35 |
| florent.XSeries.X2 0.12 | 3.0 | 13.3% | 28 |
| davidalves.Phoenix 0.54 | 3.7 | 12.4% | 31 |
| pedersen.Ugluk 1.1.1 | 5.0 | 10.9% | 14 |
| oog.melee.Corsair 1.0 | 5.8 | 9.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.6% | 4 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.2% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 82.9 | 13 / 35 | 3855 |
| 2 | 1 | 66.3 | 81.6 | 16 / 35 | 4291 |
| 3 | 1 | 67.5 | 87.0 | 15 / 35 | 4389 |
| 4 | 1 | 67.0 | 83.5 | 14 / 35 | 4624 |
| 5 | 1 | 69.3 | 92.4 | 20 / 35 | 4499 |
| 6 | 1 | 66.4 | 85.7 | 13 / 35 | 4027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 48 | 54% |
| davidalves.Phoenix 0.54 | 31 | 45% |
| florent.XSeries.X2 0.12 | 31 | 58% |
| pedersen.Ugluk 1.1.1 | 18 | 78% |
| oog.melee.Corsair 1.0 | 12 | 67% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| as.FrankTheTank 1.3 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 32 | 25% | 51 |
| davidalves.Phoenix 0.54 | 31 | 25% | 43 |
| rz.GlowBlowMelee 1.4 | 29 | 23% | 52 |
| pedersen.Ugluk 1.1.1 | 15 | 12% | 23 |
| oog.melee.Corsair 1.0 | 8 | 6% | 22 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 7 |
| as.FrankTheTank 1.3 | 2 | 2% | 7 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 138781 melee ticks, 45360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 75 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 46451 sent, 41372 reached their opponent, 7548 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 413 over 6 battles (68.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.5 | 144 / 210 | 1.94 | 19.2% | 25275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.2% | 144 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.3% | 16 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 9 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 17 |
| ds.Oo 2.2 | 5.3 | 9.3% | 5 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.2% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 7.3% | 3 |
| adt.Ar2 1.1 | 7.7 | 6.9% | 2 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.3% | 6 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 24 / 35 | 3946 |
| 2 | 1 | 70.0 | 92.1 | 29 / 35 | 4152 |
| 3 | 1 | 67.7 | 85.7 | 20 / 35 | 4437 |
| 4 | 1 | 69.6 | 91.7 | 27 / 35 | 4218 |
| 5 | 1 | 68.6 | 88.6 | 22 / 35 | 4167 |
| 6 | 1 | 69.0 | 89.5 | 22 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 89% |
| voidious.micro.BlitzBat 1.05 | 35 | 97% |
| jdw.Hurricane 1.4 | 32 | 81% |
| ds.Oo 2.2 | 17 | 94% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| awesomeness.Elite 1.0 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 60% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 28% | 35 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 17% | 50 |
| voidious.micro.BlitzBat 1.05 | 10 | 14% | 40 |
| gre.svman4.Morfeas 1.4.1 | 8 | 12% | 22 |
| ds.Oo 2.2 | 6 | 9% | 28 |
| adt.Ar2 1.1 | 5 | 7% | 14 |
| awesomeness.Elite 1.0 | 3 | 4% | 9 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 8 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 128882 melee ticks, 32590 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 57 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45574 sent, 40667 reached their opponent, 6721 virtual hits (16.5% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.1 | 158 / 210 | 1.53 | 21.4% | 39029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.4% | 158 |
| ak.Fermat 2.0 | 2.0 | 14.5% | 22 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 17 |
| lrem.Spectre 0.4.4 | 3.5 | 12.1% | 6 |
| js.PinBall 1.6 | 5.0 | 10.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.2% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.0 | 25 / 35 | 6222 |
| 2 | 1 | 72.1 | 94.3 | 25 / 35 | 6351 |
| 3 | 1 | 73.5 | 96.8 | 29 / 35 | 7014 |
| 4 | 1 | 70.2 | 87.9 | 22 / 35 | 6120 |
| 5 | 1 | 73.4 | 98.1 | 30 / 35 | 6755 |
| 6 | 1 | 72.4 | 93.7 | 27 / 35 | 6567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 68 | 79% |
| shu.nitro.LENIN .T34 | 48 | 90% |
| lrem.Spectre 0.4.4 | 45 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| js.PinBall 1.6 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 21 | 39% | 74 |
| lrem.Spectre 0.4.4 | 12 | 22% | 48 |
| shu.nitro.LENIN .T34 | 11 | 20% | 49 |
| js.PinBall 1.6 | 4 | 7% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 6% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 7 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 158370 melee ticks, 56926 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51089 sent, 46219 reached their opponent, 11471 virtual hits (24.8% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 6 battles (69.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 96.7 | 181 / 210 | 1.30 | 21.8% | 34336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.8% | 181 |
| mk.Alpha 0.2.1 | 2.0 | 14.0% | 22 |
| EH.Eagle 1.0.6 | 3.2 | 11.2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.1% | 0 |
| wee.Gem 1.8.4 | 5.5 | 9.0% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.0% | 2 |
| joe.ADinosaur 1.0 | 7.2 | 7.4% | 0 |
| throxbot.ThroxBot 0.1 | 7.7 | 6.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.5 | 5.6% | 1 |
| cs.Grudge 1.0 | 9.0 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 99.4 | 33 / 35 | 6068 |
| 2 | 1 | 72.0 | 96.8 | 29 / 35 | 5709 |
| 3 | 1 | 72.5 | 96.8 | 29 / 35 | 5963 |
| 4 | 1 | 72.2 | 96.5 | 30 / 35 | 5842 |
| 5 | 1 | 71.4 | 94.9 | 29 / 35 | 5201 |
| 6 | 1 | 71.6 | 95.9 | 31 / 35 | 5553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 125 | 91% |
| EH.Eagle 1.0.6 | 33 | 100% |
| wee.Gem 1.8.4 | 10 | 90% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 32 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 14 | 44% | 105 |
| EH.Eagle 1.0.6 | 6 | 19% | 45 |
| joe.ADinosaur 1.0 | 3 | 9% | 7 |
| throxbot.ThroxBot 0.1 | 2 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 2 | 6% | 5 |
| wee.Gem 1.8.4 | 1 | 3% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 3% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 13 |
| cs.Grudge 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 135553 melee ticks, 45608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43519 sent, 38624 reached their opponent, 9439 virtual hits (24.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 764 over 6 battles (127.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 90.5 | 139 / 210 | 1.86 | 18.8% | 24513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.8% | 139 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 32 |
| uji.Antique 1.0 | 3.2 | 12.4% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 4 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 9.9% | 7 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.6% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.3% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 25 / 35 | 4136 |
| 2 | 1 | 68.0 | 89.2 | 21 / 35 | 4040 |
| 3 | 1 | 67.2 | 87.3 | 20 / 35 | 4017 |
| 4 | 1 | 68.5 | 91.4 | 21 / 35 | 4151 |
| 5 | 1 | 70.1 | 94.3 | 27 / 35 | 4443 |
| 6 | 1 | 68.3 | 90.5 | 25 / 35 | 3726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 65 | 82% |
| uji.Antique 1.0 | 56 | 93% |
| pfvicm.Sobieski 7.2.3b | 15 | 87% |
| qohnil.blot.BlotBot 3.61 | 13 | 69% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |
| matt.advanced.Katana 1.0 | 2 | 0% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 18 | 23% | 42 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 32 |
| uji.Antique 1.0 | 13 | 17% | 65 |
| qohnil.blot.BlotBot 3.61 | 9 | 12% | 19 |
| amk.ChumbaWumba 0.3 | 5 | 6% | 20 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 15 |
| matt.advanced.Katana 1.0 | 3 | 4% | 8 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132650 melee ticks, 39107 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 82 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45054 sent, 40219 reached their opponent, 5679 virtual hits (14.1% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.8 | 118 / 210 | 2.00 | 19.3% | 28155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.3% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.4% | 53 |
| deewiant.Anomaly 0.2 | 2.7 | 14.5% | 29 |
| myl.micro.Troodon 1.10 | 4.0 | 12.0% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.8% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.4% | 2 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.9 | 18 / 35 | 4816 |
| 2 | 1 | 69.0 | 86.3 | 20 / 35 | 4554 |
| 3 | 1 | 70.1 | 89.2 | 22 / 35 | 4607 |
| 4 | 1 | 70.0 | 89.2 | 20 / 35 | 4915 |
| 5 | 1 | 69.9 | 90.5 | 20 / 35 | 4527 |
| 6 | 1 | 69.4 | 88.9 | 18 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 69 | 72% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 48% |
| jok.PheonixM 0.1.2 | 19 | 100% |
| myl.micro.Troodon 1.10 | 19 | 95% |
| ap.Frederick 1.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 40% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 39% | 73 |
| myl.micro.Troodon 1.10 | 13 | 13% | 27 |
| jok.PheonixM 0.1.2 | 3 | 3% | 19 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 165542 melee ticks, 58845 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 54226 sent, 49301 reached their opponent, 7461 virtual hits (15.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 6 battles (85.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 77.6 | 62 / 210 | 3.02 | 15.7% | 24511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.3 | 15.7% | 62 |
| catcat20.Matcha 0.006 | 3.2 | 13.2% | 40 |
| darkcanuck.B26354 1.06 | 3.2 | 13.6% | 43 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 35 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.0% | 20 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.7% | 6 |
| tripphippy.Alice 1.1 | 7.5 | 7.5% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.2% | 2 |
| ntc.Opposite 1.5 | 8.5 | 6.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 81.0 | 14 / 35 | 4152 |
| 2 | 1 | 63.7 | 76.5 | 11 / 35 | 3798 |
| 3 | 2 | 62.5 | 73.3 | 9 / 35 | 3681 |
| 4 | 1 | 66.2 | 81.6 | 8 / 35 | 4869 |
| 5 | 2 | 63.4 | 74.9 | 10 / 35 | 3974 |
| 6 | 1 | 64.1 | 78.1 | 10 / 35 | 4037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 45% |
| darkcanuck.B26354 1.06 | 25 | 56% |
| catcat20.Matcha 0.006 | 24 | 50% |
| stelo.PastFuture 2.3.2 | 17 | 65% |
| intruder.PrairieWolf 2.61 | 10 | 70% |
| tripphippy.Alice 1.1 | 4 | 75% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 37 | 24% | 53 |
| oog.melee.Capulet 1.2 | 33 | 22% | 47 |
| catcat20.Matcha 0.006 | 32 | 21% | 46 |
| stelo.PastFuture 2.3.2 | 21 | 14% | 28 |
| tripphippy.Alice 1.1 | 11 | 7% | 12 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 6 |
| ntc.Opposite 1.5 | 2 | 1% | 2 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162718 melee ticks, 29730 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51852 sent, 46882 reached their opponent, 7792 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 733 over 6 battles (122.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 82.0 | 62 / 210 | 2.62 | 16.2% | 22082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.8% | 94 |
| hadur117.Hadur 3.20bb | 1.8 | 16.2% | 62 |
| gh.mini.Griezel 0.2 | 3.3 | 13.0% | 39 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.8% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.0% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.4% | 0 |
| fm.mammillarias 1.3 | 8.3 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.1 | 12 / 35 | 3839 |
| 2 | 2 | 63.9 | 77.1 | 8 / 35 | 3662 |
| 3 | 2 | 65.0 | 81.0 | 11 / 35 | 3751 |
| 4 | 1 | 66.6 | 86.7 | 13 / 35 | 3789 |
| 5 | 2 | 64.5 | 80.3 | 12 / 35 | 3616 |
| 6 | 2 | 64.7 | 82.9 | 6 / 35 | 3425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 60 | 37% |
| gh.mini.Griezel 0.2 | 36 | 50% |
| d414.nano.Quantum 1.0.0 | 13 | 85% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 70 | 45% | 94 |
| gh.mini.Griezel 0.2 | 36 | 23% | 55 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 18 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 20 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 9 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 7 |
| fm.mammillarias 1.3 | 3 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 161334 melee ticks, 39537 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 37 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 51654 sent, 46550 reached their opponent, 7410 virtual hits (15.9% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 6 battles (57.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.5 | 144 / 210 | 1.77 | 19.4% | 28722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.4% | 144 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 13.8% | 33 |
| apc.botM 3.0 | 3.2 | 12.2% | 12 |
| lxx.ConceptA 0.8 | 4.3 | 10.3% | 3 |
| vjik.UnViolation 1.1 | 4.8 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 5.7 | 8.8% | 3 |
| panzer.Panzer 0.2 | 7.7 | 7.0% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.6% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 27 / 35 | 4690 |
| 2 | 1 | 68.1 | 85.4 | 23 / 35 | 4873 |
| 3 | 1 | 70.0 | 94.9 | 25 / 35 | 4950 |
| 4 | 1 | 69.3 | 92.7 | 24 / 35 | 4827 |
| 5 | 1 | 69.6 | 93.7 | 25 / 35 | 4811 |
| 6 | 1 | 68.1 | 91.1 | 20 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 74% |
| apc.botM 3.0 | 45 | 87% |
| lxx.ConceptA 0.8 | 17 | 100% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| vjik.UnViolation 1.1 | 8 | 63% |
| donjezza.Jezza 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 44% | 84 |
| lxx.ConceptA 0.8 | 8 | 12% | 21 |
| apc.botM 3.0 | 6 | 9% | 49 |
| vjik.UnViolation 1.1 | 6 | 9% | 17 |
| bayen.UbaMicro 1.4 | 5 | 7% | 12 |
| yk.JahMicro 1.0 | 5 | 7% | 9 |
| donjezza.Jezza 1.0 | 3 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 4% | 6 |
| panzer.Panzer 0.2 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128607 melee ticks, 55518 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43231 sent, 38285 reached their opponent, 6760 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 220 over 6 battles (36.7 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.1 | 126 / 210 | 1.98 | 19.5% | 29889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.2 | 19.5% | 126 |
| maribo.Quester 0.3 | 1.8 | 16.1% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.5% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.4% | 10 |
| labg.Cataclysm 2.05 | 5.2 | 9.9% | 11 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.4% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.3% | 0 |
| sanja.First 0.1 | 8.8 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.9 | 28 / 35 | 5420 |
| 2 | 1 | 71.4 | 92.7 | 26 / 35 | 5226 |
| 3 | 1 | 68.2 | 84.4 | 14 / 35 | 4956 |
| 4 | 1 | 70.0 | 87.9 | 23 / 35 | 5144 |
| 5 | 1 | 70.4 | 91.4 | 23 / 35 | 4917 |
| 6 | 2 | 66.6 | 83.2 | 12 / 35 | 4226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 67 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 75% |
| gre.svman4.Leonidas 1.3.2 | 31 | 94% |
| labg.Cataclysm 2.05 | 12 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 71% |
| baal.nano.N 1.42 | 4 | 75% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 34% | 82 |
| gre.svman4.Leonidas 1.3.2 | 19 | 22% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 48 |
| labg.Cataclysm 2.05 | 10 | 12% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 19 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 170861 melee ticks, 52094 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54913 sent, 50058 reached their opponent, 7052 virtual hits (14.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 6 battles (70.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.8 | 81 / 210 | 2.19 | 18.2% | 30572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.2% | 81 |
| stelo.Spread 0.9 | 2.2 | 16.3% | 64 |
| kid.Gladiator .7.2 | 2.8 | 15.7% | 36 |
| jcs.Seth 1.8 | 4.3 | 11.0% | 19 |
| tcf.Reach 3 | 4.8 | 10.6% | 7 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 14 / 35 | 5238 |
| 2 | 1 | 68.8 | 87.3 | 13 / 35 | 4973 |
| 3 | 1 | 68.7 | 87.0 | 16 / 35 | 4932 |
| 4 | 1 | 69.0 | 88.6 | 12 / 35 | 5238 |
| 5 | 1 | 67.9 | 85.7 | 13 / 35 | 5100 |
| 6 | 1 | 68.8 | 87.0 | 13 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 51% |
| kid.Gladiator .7.2 | 46 | 50% |
| jcs.Seth 1.8 | 22 | 41% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |
| tcf.Reach 3 | 3 | 67% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 51 | 38% | 89 |
| kid.Gladiator .7.2 | 37 | 28% | 56 |
| jcs.Seth 1.8 | 17 | 13% | 28 |
| tcf.Reach 3 | 13 | 10% | 18 |
| cli.Dancer 1.1 | 6 | 5% | 11 |
| ratosh.Wesco 1.4 | 4 | 3% | 7 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 170939 melee ticks, 63510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53002 sent, 48216 reached their opponent, 7959 virtual hits (16.5% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 373 over 6 battles (62.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.2 | 54 / 210 | 2.51 | 16.2% | 22754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 128 |
| hadur117.Hadur 3.20bb | 2.0 | 16.2% | 54 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.5% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.9% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 3 |
| wit.Chuliath 1.0 | 6.0 | 7.3% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 8.5 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 80.6 | 8 / 35 | 4179 |
| 2 | 2 | 65.4 | 82.9 | 9 / 35 | 3800 |
| 3 | 2 | 67.1 | 88.6 | 9 / 35 | 3994 |
| 4 | 2 | 63.2 | 77.8 | 7 / 35 | 3269 |
| 5 | 2 | 64.1 | 80.3 | 7 / 35 | 3511 |
| 6 | 2 | 67.3 | 89.2 | 14 / 35 | 4001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 27% |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 67% |
| rz.HawkOnFire 0.1 | 12 | 83% |
| gh.mini.Gruwel 0.9 | 12 | 25% |
| wit.Chuliath 1.0 | 3 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 97 | 60% | 124 |
| rz.HawkOnFire 0.1 | 20 | 12% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 11% | 30 |
| gh.mini.Gruwel 0.9 | 15 | 9% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 146123 melee ticks, 46885 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45246 sent, 40200 reached their opponent, 6212 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 6 battles (57.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.6 | 161 / 210 | 1.58 | 21.1% | 33097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.1% | 161 |
| alpha.RainingFire 1.0 | 2.7 | 12.3% | 16 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 11 |
| bvh.micro.Freya 0.3 | 3.8 | 10.7% | 5 |
| mz.Cork 0.1 | 4.7 | 10.7% | 12 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.7% | 4 |
| bvh.mini.Fenrir 0.39 | 6.8 | 9.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 4.6% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 28 / 35 | 5647 |
| 2 | 1 | 71.0 | 93.7 | 24 / 35 | 5577 |
| 3 | 1 | 71.1 | 93.7 | 26 / 35 | 5365 |
| 4 | 1 | 69.5 | 87.3 | 24 / 35 | 5170 |
| 5 | 1 | 72.7 | 97.5 | 31 / 35 | 5780 |
| 6 | 1 | 72.2 | 96.8 | 28 / 35 | 5558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 93% |
| bvh.micro.Freya 0.3 | 35 | 91% |
| alpha.RainingFire 1.0 | 31 | 68% |
| mz.Cork 0.1 | 27 | 89% |
| m3thos.Eva02 0.7.1 | 22 | 86% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 20 | 38% | 44 |
| mz.Cork 0.1 | 7 | 13% | 37 |
| bvh.micro.Freya 0.3 | 7 | 13% | 32 |
| bzdp.Pansy 2.1 | 6 | 11% | 41 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 25 |
| bvh.mini.Fenrir 0.39 | 2 | 4% | 13 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 146574 melee ticks, 51625 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50511 sent, 45725 reached their opponent, 9534 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.8 | 152 / 210 | 1.83 | 19.7% | 34602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 19.7% | 152 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.6% | 9 |
| germ.TheMind .2 | 3.5 | 9.8% | 4 |
| EBBU.Sim2 1.02 | 5.0 | 9.6% | 5 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.3% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 6.2 | 8.8% | 5 |
| agrach.Dalek 1.0 | 6.3 | 8.7% | 9 |
| mb.Beast 0.1 | 8.0 | 8.2% | 6 |
| lmk.ACPFinal 0.1 | 8.0 | 8.0% | 5 |
| skm.Ryubot 1.0 | 9.2 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.8 | 27 / 35 | 5611 |
| 2 | 1 | 66.8 | 83.8 | 21 / 35 | 5411 |
| 3 | 1 | 68.5 | 89.5 | 24 / 35 | 5725 |
| 4 | 1 | 70.4 | 95.2 | 28 / 35 | 5960 |
| 5 | 1 | 70.0 | 94.3 | 26 / 35 | 6030 |
| 6 | 1 | 69.2 | 91.1 | 26 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 33 | 76% |
| EBBU.Sim2 1.02 | 29 | 97% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 85% |
| germ.TheMind .2 | 22 | 95% |
| mb.Beast 0.1 | 17 | 100% |
| agrach.Dalek 1.0 | 17 | 76% |
| skm.Ryubot 1.0 | 16 | 100% |
| lmk.ACPFinal 0.1 | 10 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 14 | 24% | 38 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 22% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 21% | 19 |
| agrach.Dalek 1.0 | 8 | 14% | 32 |
| lmk.ACPFinal 0.1 | 5 | 9% | 18 |
| germ.TheMind .2 | 4 | 7% | 17 |
| EBBU.Sim2 1.02 | 2 | 3% | 25 |
| mb.Beast 0.1 | 0 | 0% | 21 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 203 rounds): 100266 melee ticks, 26208 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 33294 sent, 28853 reached their opponent, 8525 virtual hits (29.5% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 6 battles (67.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.2 | 114 / 210 | 2.15 | 18.2% | 27374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.2% | 114 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 49 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 15 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.4% | 15 |
| cs.Wren 1.0 | 4.8 | 10.7% | 6 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.2% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 1 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 19 / 35 | 4751 |
| 2 | 1 | 68.3 | 87.6 | 18 / 35 | 4721 |
| 3 | 1 | 66.6 | 82.9 | 17 / 35 | 4420 |
| 4 | 1 | 68.1 | 87.6 | 19 / 35 | 4345 |
| 5 | 1 | 68.0 | 86.3 | 20 / 35 | 4684 |
| 6 | 1 | 69.0 | 90.5 | 21 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 71 | 69% |
| bvh.mini.Freya 0.55 | 25 | 68% |
| bts.mega.Gnarly 1.4 | 25 | 84% |
| cs.Wren 1.0 | 16 | 88% |
| kdf.KoulDestroyer 1.0 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 34 | 34% | 81 |
| bvh.mini.Freya 0.55 | 17 | 17% | 32 |
| kdf.KoulDestroyer 1.0 | 14 | 14% | 19 |
| cs.Wren 1.0 | 13 | 13% | 28 |
| bts.mega.Gnarly 1.4 | 12 | 12% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 138801 melee ticks, 34818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 64 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45200 sent, 40201 reached their opponent, 8441 virtual hits (21.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 741 over 6 battles (123.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.1 | 101 / 210 | 2.25 | 18.3% | 29967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.3% | 101 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 23 |
| az.Ololobot 0.2.4 | 2.8 | 13.4% | 60 |
| catcat20.Lambda 0.024 | 4.0 | 11.3% | 22 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 6.3 | 8.2% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.7% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.8 | 13 / 35 | 4920 |
| 2 | 1 | 67.7 | 85.1 | 18 / 35 | 5118 |
| 3 | 1 | 68.1 | 86.7 | 20 / 35 | 5043 |
| 4 | 1 | 68.1 | 88.3 | 18 / 35 | 5026 |
| 5 | 1 | 68.2 | 87.9 | 17 / 35 | 5041 |
| 6 | 1 | 66.9 | 84.1 | 15 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 60 | 43% |
| bvh.fry.Freya 0.82 | 57 | 86% |
| catcat20.Lambda 0.024 | 25 | 52% |
| gimp.GimpBot 0.1 | 8 | 75% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 38% | 71 |
| catcat20.Lambda 0.024 | 26 | 23% | 39 |
| bvh.fry.Freya 0.82 | 23 | 20% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 6% | 10 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 5 |
| gimp.GimpBot 0.1 | 2 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 7 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162392 melee ticks, 56288 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 79 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51125 sent, 46251 reached their opponent, 8193 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 112 over 6 battles (18.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.1 | 135 / 210 | 1.80 | 20.0% | 30549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.0% | 135 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.2% | 28 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.7% | 19 |
| mz.AntiGrav 1.0 | 4.3 | 11.2% | 7 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.8% | 10 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 2 |
| stelo.Randomness 1.0 | 6.8 | 8.7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 7.7 | 6.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.0% | 0 |
| sample.Corners 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.9 | 21 / 35 | 4620 |
| 2 | 1 | 71.5 | 94.0 | 24 / 35 | 5538 |
| 3 | 1 | 70.6 | 92.7 | 24 / 35 | 5136 |
| 4 | 1 | 69.2 | 87.6 | 20 / 35 | 4879 |
| 5 | 1 | 70.9 | 91.7 | 22 / 35 | 5340 |
| 6 | 1 | 70.8 | 92.4 | 24 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 86% |
| kano.gamma.KanoGamma 1.8 | 41 | 80% |
| mz.AntiGrav 1.0 | 30 | 93% |
| Polkwane.SmashMelee 1.0 | 23 | 78% |
| stelo.Randomness 1.0 | 10 | 50% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 37% | 64 |
| kano.gamma.KanoGamma 1.8 | 17 | 23% | 56 |
| Polkwane.SmashMelee 1.0 | 12 | 16% | 28 |
| stelo.Randomness 1.0 | 8 | 11% | 20 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 6 |
| mz.AntiGrav 1.0 | 3 | 4% | 24 |
| alpha.BlackIce 1.0 | 3 | 4% | 11 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 205 rounds): 159220 melee ticks, 41828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50698 sent, 45806 reached their opponent, 9240 virtual hits (20.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 313 over 6 battles (52.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.9 | 113 / 210 | 2.09 | 18.2% | 25646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 18.2% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 62 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 13 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.2% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.3% | 10 |
| shrub.Silver v048 | 6.2 | 8.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.1% | 3 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.4 | 20 / 35 | 4386 |
| 2 | 1 | 68.3 | 87.0 | 19 / 35 | 4248 |
| 3 | 1 | 67.9 | 87.6 | 17 / 35 | 4208 |
| 4 | 1 | 66.7 | 82.5 | 19 / 35 | 4118 |
| 5 | 1 | 69.2 | 90.5 | 21 / 35 | 4482 |
| 6 | 1 | 68.3 | 88.6 | 17 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 79 | 52% |
| lessonz.robocode.Oz 0.5.0 | 33 | 88% |
| ary.Swarm 1.1 | 27 | 89% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 54% | 92 |
| simonton.nano.MeleeSeed 1.8 | 14 | 14% | 33 |
| ary.Swarm 1.1 | 13 | 13% | 33 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 34 |
| shrub.Silver v048 | 3 | 3% | 8 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 152903 melee ticks, 52038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50514 sent, 45421 reached their opponent, 7098 virtual hits (15.6% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 540 over 6 battles (90.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.5 | 131 / 210 | 1.76 | 20.1% | 34283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.1% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.1% | 9 |
| ara.Shera 0.88 | 3.7 | 13.0% | 23 |
| amz.NanoClone 1.41 | 5.3 | 8.9% | 0 |
| dsw.StaticD 1.0 | 6.3 | 7.0% | 1 |
| stelo.MirrorMicro 1.0 | 7.2 | 6.1% | 2 |
| maribo.IotaCT 1.1 | 7.5 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 23 / 35 | 6308 |
| 2 | 1 | 71.3 | 93.0 | 24 / 35 | 5818 |
| 3 | 1 | 70.0 | 89.2 | 21 / 35 | 5626 |
| 4 | 1 | 69.7 | 90.2 | 19 / 35 | 5408 |
| 5 | 1 | 69.9 | 90.8 | 22 / 35 | 5483 |
| 6 | 1 | 70.5 | 93.0 | 22 / 35 | 5640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 76% |
| maribo.mini.MiniQuester 0.1 | 36 | 94% |
| ara.Shera 0.88 | 27 | 67% |
| dsw.StaticD 1.0 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 51% | 110 |
| ara.Shera 0.88 | 21 | 25% | 41 |
| maribo.mini.MiniQuester 0.1 | 11 | 13% | 40 |
| dsw.StaticD 1.0 | 3 | 4% | 10 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| amz.NanoClone 1.41 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 171125 melee ticks, 52407 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 53063 sent, 48254 reached their opponent, 9498 virtual hits (19.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 703 over 6 battles (117.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.5 | 34 / 210 | 2.76 | 15.7% | 23559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 141 |
| hadur117.Hadur 3.20bb | 2.0 | 15.7% | 34 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 28 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.8% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 78.1 | 4 / 35 | 3855 |
| 2 | 2 | 67.1 | 86.3 | 8 / 35 | 4024 |
| 3 | 2 | 65.1 | 77.1 | 7 / 35 | 3786 |
| 4 | 2 | 66.6 | 82.9 | 7 / 35 | 3875 |
| 5 | 2 | 64.6 | 75.9 | 3 / 35 | 3890 |
| 6 | 2 | 66.7 | 82.5 | 5 / 35 | 4129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 19% |
| brainfade.melee.Dusk 0.44 | 20 | 40% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| Krabb.akim2.Akim2 1.1b | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 109 | 60% | 127 |
| brainfade.melee.Dusk 0.44 | 21 | 11% | 27 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 16 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 160227 melee ticks, 51687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50708 sent, 45633 reached their opponent, 7508 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.9 | 157 / 210 | 1.46 | 21.5% | 36181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 21.5% | 157 |
| stelo.Liblix 0.3.1 | 2.0 | 14.9% | 39 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.3% | 1 |
| jwirde.Gort 2.0 | 4.8 | 9.1% | 2 |
| stf.PanzerGeneral 0.1 | 6.8 | 7.4% | 0 |
| disan.Chair 2.2.0 | 7.0 | 7.3% | 0 |
| wompi.Quokka 1.6 | 7.0 | 7.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.3 | 27 / 35 | 5866 |
| 2 | 1 | 72.9 | 96.8 | 28 / 35 | 6145 |
| 3 | 1 | 72.1 | 94.6 | 24 / 35 | 6267 |
| 4 | 1 | 71.3 | 94.0 | 23 / 35 | 5667 |
| 5 | 1 | 71.2 | 92.4 | 25 / 35 | 5797 |
| 6 | 1 | 73.0 | 97.1 | 30 / 35 | 6439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 70% |
| tzu.TheArtOfWar 1.2 | 76 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| jwirde.Gort 2.0 | 10 | 100% |
| stf.PanzerGeneral 0.1 | 5 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 29 | 55% | 92 |
| tzu.TheArtOfWar 1.2 | 15 | 28% | 76 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 9% | 12 |
| jwirde.Gort 2.0 | 3 | 6% | 16 |
| wompi.Quokka 1.6 | 1 | 2% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 147796 melee ticks, 49617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51231 sent, 46430 reached their opponent, 10020 virtual hits (21.6% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 104 / 210 | 1.98 | 20.0% | 34258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.0 | 20.0% | 104 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.5% | 84 |
| jje.BagPuss 1.2 | 3.0 | 11.9% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.6% | 4 |
| sul.Lunar 1.1 | 4.5 | 10.5% | 8 |
| hvilela.HVilela 0.9 | 6.3 | 8.8% | 0 |
| fm.claire 1.7 | 7.2 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.4 | 12 / 35 | 5351 |
| 2 | 1 | 69.7 | 87.9 | 14 / 35 | 5936 |
| 3 | 1 | 69.9 | 91.1 | 19 / 35 | 5357 |
| 4 | 1 | 71.5 | 92.1 | 26 / 35 | 5920 |
| 5 | 1 | 69.4 | 88.6 | 15 / 35 | 5757 |
| 6 | 1 | 70.5 | 89.8 | 18 / 35 | 5937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 52% |
| jje.BagPuss 1.2 | 20 | 85% |
| myl.nano.Graviton 1.10 | 16 | 88% |
| sul.Lunar 1.1 | 14 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| fm.claire 1.7 | 4 | 75% |
| wit.Deep7 2.0 | 4 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 49 | 45% | 0 |
| jje.BagPuss 1.2 | 20 | 19% | 63 |
| sul.Lunar 1.1 | 12 | 11% | 49 |
| myl.nano.Graviton 1.10 | 11 | 10% | 40 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 18 |
| hvilela.HVilela 0.9 | 4 | 4% | 15 |
| fm.claire 1.7 | 4 | 4% | 14 |
| wit.Deep7 2.0 | 2 | 2% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 208177 melee ticks, 99092 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 71 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 61989 sent, 57227 reached their opponent, 8527 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 703 over 6 battles (117.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.0 | 68 / 210 | 2.44 | 16.7% | 25584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bb | 1.8 | 16.7% | 68 |
| kc.mini.Mirage 0.2 | 1.8 | 16.5% | 55 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.5% | 70 |
| cx.Princess 1.0 | 4.5 | 10.2% | 13 |
| mz.MicroSheep 1.0 | 4.5 | 10.1% | 3 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.8 | 16 / 35 | 4146 |
| 2 | 2 | 65.9 | 84.4 | 8 / 35 | 4079 |
| 3 | 3 | 66.3 | 84.1 | 11 / 35 | 4134 |
| 4 | 1 | 67.0 | 84.1 | 11 / 35 | 4835 |
| 5 | 2 | 66.3 | 83.5 | 14 / 35 | 4255 |
| 6 | 2 | 65.8 | 83.8 | 8 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 71% |
| rsalesc.melee.Medina 0.4.5 | 40 | 25% |
| cx.Princess 1.0 | 13 | 38% |
| mz.MicroSheep 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 56 | 38% | 69 |
| kc.mini.Mirage 0.2 | 51 | 34% | 99 |
| cx.Princess 1.0 | 15 | 10% | 17 |
| mz.MicroSheep 1.0 | 10 | 7% | 13 |
| sadoner.killer 0.2 | 6 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 154781 melee ticks, 48170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 48 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 45955 sent, 41036 reached their opponent, 6376 virtual hits (15.5% of those reached).

