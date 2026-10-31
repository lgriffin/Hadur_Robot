# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.3 | 52 / 210 | 2.32 | 17.3% | 31206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 141 |
| hadur117.Hadur 3.20bw | 2.0 | 17.3% | 52 |
| sgp.JollyNinja 3.53 | 3.2 | 12.0% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.5% | 1 |
| mz.MicroGodMelee 1 | 5.0 | 10.0% | 0 |
| lorneswork.Predator 1.0 | 5.3 | 9.9% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 85.1 | 8 / 35 | 5559 |
| 2 | 2 | 66.6 | 84.8 | 5 / 35 | 4983 |
| 3 | 2 | 67.3 | 85.4 | 11 / 35 | 5110 |
| 4 | 2 | 67.6 | 85.4 | 11 / 35 | 5107 |
| 5 | 2 | 67.9 | 86.3 | 9 / 35 | 5415 |
| 6 | 2 | 66.7 | 85.1 | 8 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 11% |
| sgp.JollyNinja 3.53 | 22 | 73% |
| mz.MicroGodMelee 1 | 10 | 100% |
| lorneswork.Predator 1.0 | 7 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 71% | 138 |
| sgp.JollyNinja 3.53 | 18 | 11% | 26 |
| lorneswork.Predator 1.0 | 12 | 8% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 13 |
| mz.MicroGodMelee 1 | 2 | 1% | 12 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142205 melee ticks, 91449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 41 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 86 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45462 sent, 40528 reached their opponent, 8061 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.4 | 111 / 210 | 2.14 | 18.9% | 29801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.9% | 111 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.4% | 40 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.7% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 13 |
| sch.Simone 0.3d | 6.7 | 8.2% | 3 |
| Noran.BitchingElk 0.054 | 6.8 | 8.6% | 20 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.8 | 5.4% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.7 | 14 / 35 | 4938 |
| 2 | 1 | 70.1 | 90.5 | 22 / 35 | 5211 |
| 3 | 1 | 68.7 | 88.3 | 19 / 35 | 4741 |
| 4 | 1 | 69.3 | 88.3 | 23 / 35 | 4963 |
| 5 | 1 | 68.5 | 87.9 | 17 / 35 | 5079 |
| 6 | 1 | 67.2 | 83.5 | 16 / 35 | 4869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 66 | 67% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 29 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 75% |
| Noran.BitchingElk 0.054 | 16 | 31% |
| sch.Simone 0.3d | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |

Hadur died in 100 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 40% | 82 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 17% | 42 |
| Noran.BitchingElk 0.054 | 13 | 13% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 11% | 29 |
| sch.Simone 0.3d | 7 | 7% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 5% | 12 |
| stelo.PatternRobot 1.0 | 3 | 3% | 6 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 171525 melee ticks, 48912 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 60389 sent, 55596 reached their opponent, 9497 virtual hits (17.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.6 | 173 / 210 | 1.67 | 20.7% | 37418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 20.7% | 173 |
| radnor.DoctorBob 1.42 | 2.3 | 13.8% | 16 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 9 |
| vuen.Cake 2.51 | 3.7 | 11.9% | 4 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 4 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 2 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 8.5 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.4 | 30 / 35 | 6070 |
| 2 | 1 | 71.8 | 94.9 | 29 / 35 | 6318 |
| 3 | 1 | 71.0 | 92.4 | 27 / 35 | 6594 |
| 4 | 1 | 70.7 | 92.1 | 29 / 35 | 5876 |
| 5 | 1 | 72.2 | 97.8 | 33 / 35 | 6584 |
| 6 | 1 | 69.3 | 86.0 | 25 / 35 | 5976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 97% |
| radnor.DoctorBob 1.42 | 54 | 96% |
| kawigi.nano.Lib 1.0 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| adt.Ar1 2.1 | 4 | 75% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 37 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 30% | 61 |
| vuen.Cake 2.51 | 6 | 16% | 71 |
| kawigi.nano.Lib 1.0 | 6 | 16% | 41 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 16% | 7 |
| oa.weak.FlyMk1 0.1 | 4 | 11% | 12 |
| adt.Ar1 2.1 | 2 | 5% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 7 |
| urdos.URDOS 1.3 | 1 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 123296 melee ticks, 40365 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 37838 sent, 33234 reached their opponent, 8746 virtual hits (26.3% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 6 battles (82.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.8 | 29 / 210 | 2.28 | 17.7% | 34033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 163 |
| hadur117.Hadur 3.20bw | 2.0 | 17.7% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.1% | 2 |
| tj.zombie1n 1.0.1 | 7.3 | 6.3% | 1 |
| rampancy.Durandal 2.1d | 7.5 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.0 | 87.0 | 7 / 35 | 5888 |
| 2 | 2 | 68.5 | 85.1 | 4 / 35 | 5799 |
| 3 | 2 | 68.1 | 85.1 | 2 / 35 | 5724 |
| 4 | 2 | 68.5 | 86.7 | 4 / 35 | 5522 |
| 5 | 2 | 69.0 | 86.7 | 8 / 35 | 5833 |
| 6 | 2 | 67.0 | 84.4 | 4 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 10% |
| apc.LeeroyJenkins2 1.0 | 14 | 50% |
| TNT.TNT 0.99.1 | 8 | 63% |
| josago.Jorgito 0.16 | 3 | 67% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 0% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1345. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 77% | 158 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 20 |
| TNT.TNT 0.99.1 | 11 | 6% | 14 |
| josago.Jorgito 0.16 | 6 | 3% | 8 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 199025 melee ticks, 79717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 60303 sent, 55349 reached their opponent, 8313 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 6 battles (121.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.2 | 28 / 210 | 2.96 | 15.1% | 23651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.1% | 111 |
| justin.DemonicRage 3.4 | 2.2 | 16.5% | 48 |
| hadur117.Hadur 3.20bw | 2.8 | 15.1% | 28 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 16 |
| ms.Ares 0.19 | 5.2 | 9.5% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 9.0% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.4 | 5 / 35 | 4203 |
| 2 | 3 | 63.2 | 76.5 | 5 / 35 | 3635 |
| 3 | 3 | 63.6 | 77.8 | 3 / 35 | 4016 |
| 4 | 3 | 64.3 | 78.4 | 4 / 35 | 4145 |
| 5 | 3 | 65.5 | 81.3 | 5 / 35 | 4118 |
| 6 | 3 | 62.6 | 75.9 | 6 / 35 | 3534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 56 | 9% |
| justin.DemonicRage 3.4 | 31 | 52% |
| wompi.Numbat 2.1 | 9 | 44% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 84 | 45% | 90 |
| justin.DemonicRage 3.4 | 44 | 23% | 60 |
| wompi.Numbat 2.1 | 34 | 18% | 36 |
| axeBots.HataMoto 3.09 | 6 | 3% | 8 |
| ms.Ares 0.19 | 6 | 3% | 8 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157187 melee ticks, 37678 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48058 sent, 43140 reached their opponent, 7224 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 433 over 6 battles (72.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.4 | 137 / 210 | 1.96 | 19.6% | 31459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.6% | 137 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 17 |
| origin.SleepSiphon 1.7b | 2.8 | 12.8% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.4% | 18 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.9% | 4 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 2 |
| spinnercat.Omen 1.0 | 8.8 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.9 | 24 / 35 | 5286 |
| 2 | 1 | 70.5 | 92.1 | 25 / 35 | 5528 |
| 3 | 1 | 70.5 | 91.7 | 23 / 35 | 5389 |
| 4 | 1 | 69.6 | 89.2 | 22 / 35 | 5018 |
| 5 | 1 | 69.5 | 87.3 | 20 / 35 | 5456 |
| 6 | 1 | 68.5 | 87.0 | 23 / 35 | 4782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 95% |
| origin.SleepSiphon 1.7b | 48 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 71% |
| gg.Wolverine 2.0 | 13 | 100% |
| mld.Wisdom 1.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| DBall.NUKE 0.1 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 23 | 30% | 63 |
| origin.SleepSiphon 1.7b | 21 | 27% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 12% | 35 |
| mld.Wisdom 1.0 | 8 | 10% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 14 |
| gg.Wolverine 2.0 | 3 | 4% | 12 |
| spinnercat.Omen 1.0 | 2 | 3% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 149240 melee ticks, 43843 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 30 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 46175 sent, 41387 reached their opponent, 9384 virtual hits (22.7% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 391 over 6 battles (65.2 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.2 | 135 / 210 | 1.52 | 21.2% | 39844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.2% | 135 |
| rtk.Tachikoma 1.0 | 2.3 | 16.0% | 25 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.0% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.1% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 10.9% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.9 | 25 / 35 | 6900 |
| 2 | 1 | 73.1 | 94.0 | 24 / 35 | 6693 |
| 3 | 1 | 72.9 | 94.3 | 23 / 35 | 6612 |
| 4 | 1 | 72.0 | 92.7 | 18 / 35 | 6369 |
| 5 | 1 | 73.1 | 94.0 | 23 / 35 | 6826 |
| 6 | 1 | 72.7 | 95.2 | 22 / 35 | 6444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 84 | 77% |
| rsalesc.melee.Monk 0.3.6c | 45 | 38% |
| oog.melee.CapuletDroid 1.1 | 32 | 91% |
| franzor.Lizt 1.3.1 | 25 | 88% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1335. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 34 | 44% | 92 |
| rsalesc.melee.Monk 0.3.6c | 31 | 40% | 63 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 40 |
| franzor.Lizt 1.3.1 | 5 | 6% | 5 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 185614 melee ticks, 86865 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55781 sent, 50953 reached their opponent, 10537 virtual hits (20.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 822 over 6 battles (137.0 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.4 | 126 / 210 | 2.04 | 19.1% | 29522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.1% | 126 |
| shrub.Vapour v159 | 2.7 | 12.3% | 25 |
| tm.Yuugao 1.0 | 2.8 | 12.3% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.8% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 10.0% | 10 |
| m3thos.Eva00 1.1 | 5.8 | 9.2% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.7% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.6% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 22 / 35 | 5344 |
| 2 | 1 | 67.5 | 87.9 | 18 / 35 | 4600 |
| 3 | 1 | 69.5 | 89.8 | 23 / 35 | 5092 |
| 4 | 1 | 67.4 | 85.4 | 19 / 35 | 4784 |
| 5 | 1 | 68.4 | 87.9 | 22 / 35 | 4852 |
| 6 | 1 | 68.4 | 86.7 | 22 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 77% |
| shrub.Vapour v159 | 36 | 69% |
| Krabb.sliNk.Garm 0.9u | 27 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 91% |
| SHAM.WOW 1.4 | 5 | 80% |
| m3thos.Eva00 1.1 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 21 | 23% | 46 |
| tm.Yuugao 1.0 | 19 | 21% | 58 |
| Krabb.sliNk.Garm 0.9u | 17 | 19% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 32 |
| m3thos.Eva00 1.1 | 8 | 9% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 15 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146772 melee ticks, 43638 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48374 sent, 43444 reached their opponent, 8038 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 6 battles (48.0 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.7 | 48 / 210 | 3.10 | 15.1% | 21236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 17.2% | 98 |
| hadur117.Hadur 3.20bw | 1.7 | 15.1% | 48 |
| kc.micro.Figment 1.0 | 2.8 | 14.1% | 29 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 11 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 19 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.4% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 78.4 | 11 / 35 | 3599 |
| 2 | 2 | 63.5 | 77.1 | 5 / 35 | 3648 |
| 3 | 1 | 62.7 | 75.6 | 9 / 35 | 3508 |
| 4 | 2 | 61.3 | 72.7 | 6 / 35 | 3249 |
| 5 | 1 | 64.8 | 81.0 | 11 / 35 | 3821 |
| 6 | 2 | 62.6 | 75.2 | 6 / 35 | 3411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 20% |
| kc.micro.Figment 1.0 | 31 | 71% |
| mc2.enemy.Original 0.9 | 17 | 41% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| yagami.Tidus 0.11 | 6 | 83% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 164 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 59 | 36% | 71 |
| kc.micro.Figment 1.0 | 37 | 23% | 56 |
| mc2.enemy.Original 0.9 | 28 | 17% | 34 |
| yagami.Tidus 0.11 | 13 | 8% | 16 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 15 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| dft.Calliope 5.6 | 3 | 2% | 7 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152702 melee ticks, 34786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49432 sent, 44718 reached their opponent, 6466 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.3 | 171 / 210 | 1.42 | 21.0% | 35236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.0% | 171 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 16 |
| ne.Chimera 1.2 | 3.0 | 12.6% | 6 |
| ejb.Polaris 1.0.1 | 3.7 | 12.3% | 9 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.6% | 4 |
| vStar.RAFzilla 2.15 | 6.0 | 9.8% | 4 |
| kurios.DOSexe .9b | 7.5 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.2 | 28 / 35 | 5644 |
| 2 | 1 | 72.6 | 97.5 | 30 / 35 | 6100 |
| 3 | 1 | 71.6 | 96.5 | 28 / 35 | 5703 |
| 4 | 1 | 71.5 | 93.7 | 29 / 35 | 5984 |
| 5 | 1 | 72.1 | 97.1 | 28 / 35 | 6120 |
| 6 | 1 | 70.6 | 92.1 | 28 / 35 | 5685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 87% |
| ejb.Polaris 1.0.1 | 49 | 94% |
| ne.Chimera 1.2 | 37 | 95% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| vStar.RAFzilla 2.15 | 9 | 56% |
| kurios.DOSexe .9b | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 44% | 71 |
| ne.Chimera 1.2 | 8 | 21% | 34 |
| ejb.Polaris 1.0.1 | 5 | 13% | 56 |
| vStar.RAFzilla 2.15 | 4 | 10% | 11 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 21 |
| kurios.DOSexe .9b | 1 | 3% | 11 |
| sam.Samspin 1.0 | 1 | 3% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 140855 melee ticks, 58863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 46684 sent, 41918 reached their opponent, 8106 virtual hits (19.3% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 564 over 6 battles (94.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 81.7 | 66 / 210 | 2.65 | 16.2% | 22441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.5 | 16.2% | 66 |
| rz.Aleph 0.34 | 1.5 | 16.6% | 77 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 17 |
| djc.DynaBot 0.1.1 | 4.2 | 10.7% | 10 |
| br2.MobyDickBot 1.6 | 5.2 | 9.6% | 18 |
| rdt199.Warlord 0.73 | 6.0 | 9.0% | 16 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 87.6 | 15 / 35 | 3971 |
| 2 | 1 | 66.1 | 82.2 | 12 / 35 | 4312 |
| 3 | 1 | 65.1 | 85.4 | 11 / 35 | 3635 |
| 4 | 2 | 65.1 | 82.5 | 13 / 35 | 3669 |
| 5 | 2 | 63.8 | 80.6 | 10 / 35 | 3439 |
| 6 | 2 | 60.7 | 71.7 | 5 / 35 | 3415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 47% |
| djc.DynaBot 0.1.1 | 21 | 71% |
| rdt199.Warlord 0.73 | 16 | 63% |
| br2.MobyDickBot 1.6 | 14 | 43% |
| cx.mini.Nimrod 0.55 | 11 | 36% |
| uji.YellohFellah 1.0 | 7 | 71% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 68 | 45% | 89 |
| cx.mini.Nimrod 0.55 | 22 | 15% | 27 |
| rdt199.Warlord 0.73 | 17 | 11% | 28 |
| br2.MobyDickBot 1.6 | 16 | 11% | 20 |
| djc.DynaBot 0.1.1 | 15 | 10% | 25 |
| uji.YellohFellah 1.0 | 4 | 3% | 10 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163231 melee ticks, 37925 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 38 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52285 sent, 47332 reached their opponent, 6386 virtual hits (13.5% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 484 over 6 battles (80.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.2 | 134 / 210 | 2.06 | 18.6% | 24292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.6% | 134 |
| nat.PallasHawk 1.0 | 3.0 | 12.7% | 27 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.2% | 28 |
| darkcanuck.Leon 1.01 | 3.0 | 12.7% | 10 |
| brainfade.melee.Genghis 0.36 | 5.3 | 10.4% | 9 |
| jrm.Test0 1.0 | 5.7 | 8.7% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.2% | 1 |
| jp.Perpy 16.0 | 8.3 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.4% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.8 | 19 / 35 | 4010 |
| 2 | 1 | 69.4 | 92.7 | 26 / 35 | 3977 |
| 3 | 1 | 68.3 | 87.3 | 21 / 35 | 4353 |
| 4 | 1 | 68.5 | 89.2 | 22 / 35 | 4219 |
| 5 | 1 | 67.9 | 87.6 | 22 / 35 | 4030 |
| 6 | 1 | 67.8 | 87.6 | 24 / 35 | 3703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 55 | 93% |
| bts.wiki.RipCurl 0.9b | 46 | 74% |
| nat.PallasHawk 1.0 | 38 | 71% |
| brainfade.melee.Genghis 0.36 | 15 | 80% |
| jrm.Test0 1.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 29% | 49 |
| nat.PallasHawk 1.0 | 17 | 21% | 49 |
| brainfade.melee.Genghis 0.36 | 16 | 20% | 23 |
| darkcanuck.Leon 1.01 | 9 | 11% | 60 |
| jrm.Test0 1.0 | 6 | 7% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132862 melee ticks, 42440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 38 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44643 sent, 39585 reached their opponent, 6291 virtual hits (15.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 83 over 6 battles (13.8 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.1 | 67 / 210 | 2.52 | 16.2% | 24899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.0% | 91 |
| hadur117.Hadur 3.20bw | 2.0 | 16.2% | 67 |
| ags.Glacier 0.2.11 | 2.8 | 15.7% | 31 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 11 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.3% | 4 |
| ayk.WallHugger 1.0 | 8.3 | 4.4% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 80.6 | 10 / 35 | 4089 |
| 2 | 1 | 67.0 | 86.3 | 16 / 35 | 4158 |
| 3 | 2 | 64.9 | 80.6 | 11 / 35 | 4316 |
| 4 | 2 | 66.2 | 83.8 | 12 / 35 | 4369 |
| 5 | 3 | 65.3 | 82.5 | 9 / 35 | 4035 |
| 6 | 2 | 65.5 | 84.4 | 9 / 35 | 3932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 26% |
| ags.Glacier 0.2.11 | 45 | 71% |
| shinh.Entangled 0.3 | 21 | 62% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 2 | 50% |
| apc.Colossus2 0.17 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 45% | 81 |
| ags.Glacier 0.2.11 | 34 | 23% | 62 |
| shinh.Entangled 0.3 | 21 | 14% | 32 |
| gh.micro.Gruweltje 0.7 | 8 | 5% | 16 |
| stelo.Wang 1.0 | 7 | 5% | 8 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 2 | 1% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145734 melee ticks, 48523 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 93 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 93 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42682 sent, 37646 reached their opponent, 6034 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.2 | 163 / 210 | 1.52 | 20.8% | 34573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 20.8% | 163 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.2% | 12 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.0% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.0% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.7 | 7.7% | 2 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.6 | 27 / 35 | 5722 |
| 2 | 1 | 70.5 | 91.4 | 26 / 35 | 5375 |
| 3 | 1 | 71.5 | 96.5 | 29 / 35 | 5699 |
| 4 | 1 | 71.1 | 92.7 | 28 / 35 | 5647 |
| 5 | 1 | 71.7 | 94.9 | 27 / 35 | 6052 |
| 6 | 1 | 71.3 | 94.0 | 26 / 35 | 6078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 95% |
| catcat20.shape.Theta 0.018 | 53 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 83% |
| pa.Improved 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |

Hadur died in 48 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 19 | 40% | 53 |
| simonton.micro.Sprout 1.1.3 | 10 | 21% | 82 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 17% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 6% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 6% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 6 |
| pa.Improved 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 203 rounds): 140265 melee ticks, 57165 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 87 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44824 sent, 40055 reached their opponent, 9433 virtual hits (23.6% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 707 over 6 battles (117.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.7 | 108 / 210 | 2.29 | 18.6% | 30405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.6% | 108 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.2% | 19 |
| mld.DustBunny 3.8 | 3.2 | 12.8% | 10 |
| emp.Yngwie 1.11 | 3.2 | 12.8% | 47 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.4% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.1% | 10 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.3 | 21 / 35 | 5234 |
| 2 | 1 | 66.3 | 81.3 | 14 / 35 | 4846 |
| 3 | 1 | 70.5 | 90.2 | 21 / 35 | 5853 |
| 4 | 1 | 67.5 | 85.1 | 17 / 35 | 4724 |
| 5 | 1 | 67.4 | 84.1 | 16 / 35 | 4988 |
| 6 | 1 | 67.8 | 86.0 | 19 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 50 | 56% |
| kawigi.micro.Shiz 1.1 | 35 | 94% |
| mld.DustBunny 3.8 | 28 | 89% |
| kawigi.robot.Girl 1.2 | 18 | 61% |
| cb.nano.Insomnia 1.0 | 9 | 78% |
| divineomega.TrialBot 0.003 | 5 | 40% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 30% | 72 |
| mld.DustBunny 3.8 | 16 | 15% | 45 |
| kawigi.robot.Girl 1.2 | 15 | 14% | 19 |
| kawigi.micro.Shiz 1.1 | 14 | 13% | 36 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 19 |
| divineomega.TrialBot 0.003 | 7 | 6% | 11 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 163347 melee ticks, 48155 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 88 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53400 sent, 48546 reached their opponent, 7909 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 777 over 6 battles (129.5 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.4 | 124 / 210 | 2.04 | 19.6% | 33107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.6% | 124 |
| gh.Griezel 0.5.2 | 2.0 | 15.5% | 43 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.4% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.5% | 2 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.9% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 6 |
| asd.Cthulhu 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 24 / 35 | 5881 |
| 2 | 1 | 69.2 | 86.0 | 17 / 35 | 5596 |
| 3 | 1 | 70.2 | 89.2 | 22 / 35 | 5632 |
| 4 | 1 | 68.7 | 86.0 | 19 / 35 | 5040 |
| 5 | 1 | 69.3 | 88.6 | 22 / 35 | 5173 |
| 6 | 1 | 70.3 | 88.9 | 20 / 35 | 5785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 83 | 75% |
| techdude.forest.FlamingForest 1.1 | 34 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 90% |
| bvh.fnr.Fenrir 0.36l | 11 | 82% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 29 | 31% | 82 |
| bvh.fnr.Fenrir 0.36l | 21 | 23% | 24 |
| techdude.forest.FlamingForest 1.1 | 20 | 22% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 9% | 26 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 12 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 11 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 6 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 173427 melee ticks, 67870 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56481 sent, 51810 reached their opponent, 8946 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 409 over 6 battles (68.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.3 | 111 / 210 | 2.05 | 19.7% | 35549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.7% | 111 |
| et.Predator 1.8 | 2.3 | 14.0% | 19 |
| cx.BlestPain 1.41 | 3.2 | 12.6% | 37 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.4% | 33 |
| ahf.NanoAndrew .4 | 5.2 | 10.3% | 5 |
| nic.Nicator 2.4 | 6.2 | 9.1% | 2 |
| maribo.melee.BMV 0.1 | 6.7 | 8.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.1% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 19 / 35 | 5945 |
| 2 | 1 | 70.5 | 89.8 | 20 / 35 | 6014 |
| 3 | 1 | 70.9 | 92.7 | 22 / 35 | 5850 |
| 4 | 1 | 69.7 | 87.6 | 16 / 35 | 5891 |
| 5 | 1 | 70.0 | 87.9 | 17 / 35 | 6174 |
| 6 | 1 | 68.3 | 82.2 | 17 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 58 | 81% |
| oog.melee.Mercutio 1.0 | 45 | 64% |
| cx.BlestPain 1.41 | 34 | 29% |
| ahf.NanoAndrew .4 | 16 | 88% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 27% | 45 |
| oog.melee.Mercutio 1.0 | 27 | 26% | 51 |
| et.Predator 1.8 | 22 | 22% | 64 |
| ahf.NanoAndrew .4 | 9 | 9% | 25 |
| maribo.melee.BMV 0.1 | 6 | 6% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 6 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| nic.Nicator 2.4 | 1 | 1% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 163261 melee ticks, 61443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 53948 sent, 49098 reached their opponent, 10809 virtual hits (22.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 342 over 6 battles (57.0 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.1 | 135 / 210 | 1.80 | 19.7% | 30238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.7% | 135 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.7% | 25 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 21 |
| uji.DBH 1.1 | 3.7 | 11.2% | 11 |
| sigterm.Sigterm 1.0 | 6.0 | 8.5% | 8 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.5% | 3 |
| ratosh.Nobo 0.21 | 6.7 | 7.7% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.9% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 5.3% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.9 | 29 / 35 | 5162 |
| 2 | 1 | 69.3 | 89.8 | 22 / 35 | 5078 |
| 3 | 1 | 69.4 | 90.8 | 22 / 35 | 4906 |
| 4 | 1 | 68.8 | 87.3 | 20 / 35 | 5125 |
| 5 | 1 | 69.4 | 91.1 | 21 / 35 | 5127 |
| 6 | 1 | 69.5 | 92.7 | 21 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 68 | 81% |
| agd.Mooserwirt2 2.7 | 32 | 72% |
| uji.DBH 1.1 | 24 | 83% |
| sigterm.Sigterm 1.0 | 19 | 84% |
| stelo.WangRobot 1.0 | 9 | 100% |
| ratosh.Nobo 0.21 | 7 | 86% |
| spinnercat.Robovirus 2.718 | 6 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 36% | 83 |
| agd.Mooserwirt2 2.7 | 13 | 17% | 31 |
| uji.DBH 1.1 | 8 | 11% | 25 |
| sigterm.Sigterm 1.0 | 7 | 9% | 21 |
| ratosh.Nobo 0.21 | 6 | 8% | 14 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 8% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 4 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 137275 melee ticks, 50013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 73 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46012 sent, 41116 reached their opponent, 8800 virtual hits (21.4% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 98.3 | 196 / 210 | 1.16 | 22.5% | 37173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 22.5% | 196 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.4% | 7 |
| mld.Infinity 2.2 | 3.2 | 12.3% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.7% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 7.9% | 1 |
| pac.ABC 2.1 | 7.3 | 6.9% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.5 | 33 / 35 | 5675 |
| 2 | 1 | 74.1 | 99.4 | 34 / 35 | 6491 |
| 3 | 1 | 72.5 | 96.8 | 30 / 35 | 5545 |
| 4 | 1 | 73.6 | 97.5 | 32 / 35 | 6465 |
| 5 | 1 | 74.1 | 99.4 | 34 / 35 | 6478 |
| 6 | 1 | 73.9 | 99.0 | 33 / 35 | 6519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 101 | 99% |
| krillr.mini.JointStrike 2.0.0 | 36 | 97% |
| mld.Infinity 2.2 | 26 | 100% |
| erdnis.Rover 0.3 | 16 | 94% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 18 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 33% | 63 |
| krillr.mini.JointStrike 2.0.0 | 4 | 22% | 38 |
| erdnis.Rover 0.3 | 2 | 11% | 25 |
| pac.ABC 2.1 | 2 | 11% | 19 |
| mld.Infinity 2.2 | 1 | 6% | 28 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 15 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 130152 melee ticks, 48590 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 43975 sent, 39271 reached their opponent, 9185 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.9 | 139 / 210 | 1.73 | 20.9% | 36873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 20.9% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 34 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 3 |
| catcat20.Rabbit 0.001 | 4.3 | 10.6% | 18 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.6% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 5.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 27 / 35 | 6233 |
| 2 | 1 | 72.0 | 92.7 | 23 / 35 | 6367 |
| 3 | 1 | 71.4 | 91.7 | 25 / 35 | 6012 |
| 4 | 1 | 71.7 | 94.0 | 24 / 35 | 6295 |
| 5 | 1 | 69.9 | 86.3 | 19 / 35 | 5919 |
| 6 | 1 | 70.9 | 91.7 | 21 / 35 | 6047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 77% |
| fwb.Nine 1.0.1 | 43 | 93% |
| catcat20.Rabbit 0.001 | 25 | 56% |
| m3thos.mini.Eva01 0.5.5 | 12 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 37 | 49% | 91 |
| catcat20.Rabbit 0.001 | 14 | 19% | 42 |
| fwb.Nine 1.0.1 | 13 | 17% | 29 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 15 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 8 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 16 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 165658 melee ticks, 56364 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52629 sent, 47794 reached their opponent, 10759 virtual hits (22.5% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 6 battles (80.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.6 | 144 / 210 | 1.58 | 21.0% | 35798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.0% | 144 |
| eem.EvBot v4.6.16 | 2.2 | 16.4% | 51 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.8% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.4% | 8 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 26 / 35 | 5844 |
| 2 | 1 | 71.5 | 92.4 | 24 / 35 | 5788 |
| 3 | 1 | 72.3 | 95.6 | 24 / 35 | 6395 |
| 4 | 1 | 70.4 | 89.8 | 20 / 35 | 5714 |
| 5 | 1 | 72.8 | 95.9 | 25 / 35 | 6437 |
| 6 | 1 | 71.3 | 93.0 | 25 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 75% |
| dummy.mini.Scimitar 1.01 | 28 | 89% |
| cf.RiO.RiOx 4.2.1 | 15 | 93% |
| eld.Hmm 1.0 | 11 | 45% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 38 | 54% | 112 |
| dummy.mini.Scimitar 1.01 | 15 | 21% | 48 |
| eld.Hmm 1.0 | 7 | 10% | 25 |
| cf.RiO.RiOx 4.2.1 | 3 | 4% | 16 |
| PSW.Relentless 0.1 | 2 | 3% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 180619 melee ticks, 89613 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 58 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 53560 sent, 48819 reached their opponent, 8386 virtual hits (17.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.9 | 97 / 210 | 2.00 | 18.8% | 30968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.8% | 97 |
| pe.SandboxDT 2.71m | 2.2 | 16.2% | 55 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 33 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.3% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 10 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 18 / 35 | 5088 |
| 2 | 1 | 69.1 | 90.2 | 13 / 35 | 5036 |
| 3 | 1 | 69.8 | 87.9 | 18 / 35 | 5604 |
| 4 | 1 | 68.6 | 87.0 | 14 / 35 | 4890 |
| 5 | 1 | 69.4 | 87.6 | 16 / 35 | 5096 |
| 6 | 1 | 70.0 | 90.8 | 18 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 45% |
| kvk.HebusLeTroll 0.35 | 47 | 66% |
| jlm.javaDisturbance 0.59 | 39 | 82% |
| bigpete.Stewie 1.0 | 11 | 45% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 41% | 75 |
| kvk.HebusLeTroll 0.35 | 37 | 32% | 58 |
| jlm.javaDisturbance 0.59 | 16 | 14% | 49 |
| bigpete.Stewie 1.0 | 10 | 9% | 17 |
| tad.Dalek98 0.98 | 3 | 3% | 5 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 168586 melee ticks, 52013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52957 sent, 48112 reached their opponent, 7678 virtual hits (16.0% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 6 battles (76.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 96.6 | 173 / 210 | 1.30 | 22.0% | 36780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 22.0% | 173 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 27 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 7 |
| stelo.RamTrackSurfer 1.2 | 4.7 | 9.5% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.4% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.4 | 22 / 35 | 5835 |
| 2 | 1 | 73.7 | 97.1 | 28 / 35 | 6280 |
| 3 | 1 | 73.9 | 97.1 | 30 / 35 | 6381 |
| 4 | 1 | 73.8 | 97.1 | 31 / 35 | 6153 |
| 5 | 1 | 73.6 | 99.7 | 34 / 35 | 5863 |
| 6 | 1 | 73.1 | 96.2 | 28 / 35 | 6268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 105 | 82% |
| cre.Karolos 0.32 | 60 | 92% |
| stelo.RamTrackSurfer 1.2 | 11 | 91% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 100% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 23 | 56% | 110 |
| cre.Karolos 0.32 | 12 | 29% | 48 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 20 |
| stelo.AreaTargetingBot 1.1 | 1 | 2% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 127260 melee ticks, 50922 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 68 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 39901 sent, 35057 reached their opponent, 10097 virtual hits (28.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 6 battles (46.2 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.5 | 90 / 210 | 2.48 | 17.0% | 24364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 17.0% | 90 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.5% | 28 |
| davidalves.Phoenix 0.54 | 3.2 | 13.1% | 34 |
| florent.XSeries.X2 0.12 | 3.3 | 13.3% | 32 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.6% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.5% | 3 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.9% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.0 | 17 / 35 | 4311 |
| 2 | 1 | 66.6 | 84.4 | 16 / 35 | 4118 |
| 3 | 1 | 66.0 | 83.5 | 16 / 35 | 3857 |
| 4 | 1 | 65.4 | 82.2 | 12 / 35 | 4113 |
| 5 | 1 | 67.0 | 85.7 | 18 / 35 | 4072 |
| 6 | 1 | 64.5 | 79.4 | 11 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 34 | 65% |
| rz.GlowBlowMelee 1.4 | 33 | 64% |
| florent.XSeries.X2 0.12 | 29 | 62% |
| pedersen.Ugluk 1.1.1 | 17 | 76% |
| oog.melee.Corsair 1.0 | 13 | 77% |
| as.FrankTheTank 1.3 | 3 | 100% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| evd.X1 0.01 | 1 | 0% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 28% | 52 |
| davidalves.Phoenix 0.54 | 28 | 23% | 54 |
| rz.GlowBlowMelee 1.4 | 28 | 23% | 45 |
| pedersen.Ugluk 1.1.1 | 14 | 11% | 27 |
| oog.melee.Corsair 1.0 | 6 | 5% | 16 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 5 |
| evd.X1 0.01 | 4 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 6 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137471 melee ticks, 35635 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45730 sent, 40634 reached their opponent, 7373 virtual hits (18.1% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 737 over 6 battles (122.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.5 | 143 / 210 | 1.94 | 19.1% | 25189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.1% | 143 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.9% | 24 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 10 |
| jdw.Hurricane 1.4 | 4.0 | 11.2% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 9 |
| ds.Oo 2.2 | 5.7 | 9.6% | 8 |
| awesomeness.Elite 1.0 | 7.7 | 6.8% | 2 |
| adt.Ar2 1.1 | 8.0 | 6.7% | 0 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.2 | 23 / 35 | 3893 |
| 2 | 1 | 69.0 | 87.6 | 27 / 35 | 4320 |
| 3 | 1 | 69.5 | 90.5 | 25 / 35 | 4274 |
| 4 | 1 | 67.2 | 87.3 | 20 / 35 | 3812 |
| 5 | 1 | 70.6 | 92.4 | 26 / 35 | 4681 |
| 6 | 1 | 68.4 | 89.2 | 22 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 87% |
| voidious.micro.BlitzBat 1.05 | 39 | 90% |
| jdw.Hurricane 1.4 | 29 | 90% |
| ds.Oo 2.2 | 17 | 88% |
| gre.svman4.Morfeas 1.4.1 | 14 | 71% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 20 | 27% | 56 |
| voidious.micro.BlitzBat 1.05 | 18 | 24% | 46 |
| jdw.Hurricane 1.4 | 8 | 11% | 27 |
| ds.Oo 2.2 | 6 | 8% | 31 |
| gre.svman4.Morfeas 1.4.1 | 6 | 8% | 24 |
| awesomeness.Elite 1.0 | 5 | 7% | 10 |
| adt.Ar2 1.1 | 3 | 4% | 10 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 3 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 132561 melee ticks, 35335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 54 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45992 sent, 41167 reached their opponent, 6719 virtual hits (16.3% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 341 over 6 battles (56.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.2 | 159 / 210 | 1.52 | 21.4% | 38166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.4% | 159 |
| ak.Fermat 2.0 | 2.0 | 14.5% | 19 |
| shu.nitro.LENIN .T34 | 3.0 | 12.5% | 13 |
| lrem.Spectre 0.4.4 | 4.2 | 11.6% | 11 |
| js.PinBall 1.6 | 5.2 | 10.2% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.8% | 6 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 7.2% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 27 / 35 | 6228 |
| 2 | 1 | 72.7 | 94.6 | 28 / 35 | 6573 |
| 3 | 1 | 71.7 | 91.1 | 24 / 35 | 6360 |
| 4 | 1 | 73.9 | 98.7 | 33 / 35 | 6478 |
| 5 | 1 | 71.2 | 90.8 | 22 / 35 | 6088 |
| 6 | 1 | 72.4 | 94.6 | 25 / 35 | 6439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 87% |
| shu.nitro.LENIN .T34 | 46 | 91% |
| lrem.Spectre 0.4.4 | 36 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 14 | 86% |
| js.PinBall 1.6 | 12 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 17 | 32% | 64 |
| ak.Fermat 2.0 | 15 | 28% | 63 |
| lrem.Spectre 0.4.4 | 12 | 23% | 38 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 8% | 15 |
| js.PinBall 1.6 | 2 | 4% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 8 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164731 melee ticks, 47890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 52604 sent, 47820 reached their opponent, 11436 virtual hits (23.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 6 battles (60.0 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.3 | 152 / 210 | 2.23 | 19.8% | 32945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.8% | 152 |
| mk.Alpha 0.2.1 | 2.5 | 13.9% | 36 |
| techdude.kombat.FlamingKombat 1.5 | 4.0 | 10.1% | 3 |
| EH.Eagle 1.0.6 | 4.3 | 10.1% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.2% | 4 |
| wee.Gem 1.8.4 | 6.2 | 8.5% | 4 |
| throxbot.ThroxBot 0.1 | 6.7 | 7.9% | 2 |
| joe.ADinosaur 1.0 | 7.0 | 8.3% | 1 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.1% | 1 |
| cs.Grudge 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 98.7 | 33 / 35 | 5502 |
| 2 | 1 | 70.5 | 92.7 | 26 / 35 | 5170 |
| 3 | 1 | 71.5 | 92.1 | 28 / 35 | 5946 |
| 4 | 1 | 64.3 | 66.0 | 17 / 35 | 5290 |
| 5 | 1 | 66.2 | 72.4 | 18 / 35 | 5595 |
| 6 | 1 | 71.5 | 96.2 | 30 / 35 | 5442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 87 | 87% |
| EH.Eagle 1.0.6 | 30 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 15 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| wee.Gem 1.8.4 | 7 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| cs.Grudge 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 39% | 86 |
| cs.Grudge 1.0 | 15 | 25% | 17 |
| EH.Eagle 1.0.6 | 6 | 10% | 26 |
| joe.ADinosaur 1.0 | 5 | 8% | 12 |
| throxbot.ThroxBot 0.1 | 3 | 5% | 11 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 17 |
| wee.Gem 1.8.4 | 0 | 0% | 15 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 125359 melee ticks, 37610 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 41666 sent, 36919 reached their opponent, 9142 virtual hits (24.8% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 90.4 | 141 / 210 | 1.86 | 18.7% | 23586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.7% | 141 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 24 |
| uji.Antique 1.0 | 3.3 | 11.9% | 20 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 11.0% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.0% | 8 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 9 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.5% | 0 |
| matt.advanced.Katana 1.0 | 8.0 | 6.8% | 3 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 93.3 | 24 / 35 | 4085 |
| 2 | 1 | 70.2 | 94.6 | 26 / 35 | 4623 |
| 3 | 1 | 68.0 | 92.4 | 23 / 35 | 3626 |
| 4 | 1 | 67.7 | 87.3 | 23 / 35 | 4035 |
| 5 | 1 | 66.6 | 86.7 | 22 / 35 | 3625 |
| 6 | 1 | 67.3 | 88.3 | 23 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 84% |
| uji.Antique 1.0 | 47 | 83% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| ahr.ice.Ice 1.0.2 | 10 | 70% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 21 | 28% | 61 |
| kid.test.NightFox .2 | 19 | 26% | 51 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 29 |
| ahr.ice.Ice 1.0.2 | 9 | 12% | 20 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 25 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 7 |
| amk.ChumbaWumba 0.3 | 0 | 0% | 7 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 133142 melee ticks, 38846 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44588 sent, 39740 reached their opponent, 5712 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 742 over 6 battles (123.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.2 | 112 / 210 | 2.06 | 19.1% | 27898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.1% | 112 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 43 |
| deewiant.Anomaly 0.2 | 2.7 | 14.5% | 44 |
| myl.micro.Troodon 1.10 | 4.5 | 10.8% | 4 |
| jok.PheonixM 0.1.2 | 4.5 | 11.2% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.9% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.3 | 21 / 35 | 4800 |
| 2 | 1 | 70.8 | 93.0 | 23 / 35 | 4860 |
| 3 | 1 | 69.1 | 87.3 | 18 / 35 | 4752 |
| 4 | 1 | 68.7 | 88.9 | 17 / 35 | 4405 |
| 5 | 1 | 66.9 | 80.3 | 16 / 35 | 4430 |
| 6 | 1 | 68.8 | 85.4 | 17 / 35 | 4651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 55% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 79% |
| jok.PheonixM 0.1.2 | 21 | 90% |
| myl.micro.Troodon 1.10 | 15 | 93% |
| ap.Frederick 1.1 | 5 | 80% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 47% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 25 | 24% | 65 |
| jok.PheonixM 0.1.2 | 14 | 13% | 35 |
| myl.micro.Troodon 1.10 | 5 | 5% | 17 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 7 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166471 melee ticks, 54292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 38 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 54085 sent, 49251 reached their opponent, 7394 virtual hits (15.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 496 over 6 battles (82.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.0 | 43 / 210 | 3.07 | 15.2% | 23169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.3 | 15.2% | 43 |
| catcat20.Matcha 0.006 | 2.3 | 14.4% | 59 |
| darkcanuck.B26354 1.06 | 3.0 | 13.6% | 48 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.3% | 22 |
| oog.melee.Capulet 1.2 | 4.2 | 12.2% | 24 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.1% | 8 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.8% | 4 |
| tripphippy.Alice 1.1 | 8.2 | 6.8% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 76.2 | 4 / 35 | 3719 |
| 2 | 1 | 62.6 | 74.6 | 7 / 35 | 3924 |
| 3 | 1 | 63.8 | 78.1 | 8 / 35 | 3964 |
| 4 | 1 | 65.0 | 79.7 | 12 / 35 | 3983 |
| 5 | 1 | 63.7 | 79.0 | 8 / 35 | 3701 |
| 6 | 2 | 62.3 | 74.3 | 4 / 35 | 3878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 36 | 25% |
| darkcanuck.B26354 1.06 | 24 | 33% |
| oog.melee.Capulet 1.2 | 21 | 62% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| intruder.PrairieWolf 2.61 | 9 | 56% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 0% |
| tripphippy.Alice 1.1 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 52 | 30% | 62 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 37 |
| darkcanuck.B26354 1.06 | 30 | 17% | 38 |
| oog.melee.Capulet 1.2 | 26 | 15% | 39 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 6 |
| tripphippy.Alice 1.1 | 6 | 3% | 8 |
| ntc.Opposite 1.5 | 6 | 3% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155946 melee ticks, 31143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 81 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50557 sent, 45578 reached their opponent, 7780 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 654 over 6 battles (109.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.3 | 73 / 210 | 2.69 | 16.5% | 23454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.5% | 83 |
| hadur117.Hadur 3.20bw | 1.8 | 16.5% | 73 |
| gh.mini.Griezel 0.2 | 3.0 | 13.1% | 37 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 5 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.3% | 0 |
| fm.mammillarias 1.3 | 9.0 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 80.6 | 12 / 35 | 3943 |
| 2 | 2 | 65.5 | 81.9 | 12 / 35 | 3837 |
| 3 | 1 | 65.9 | 83.2 | 13 / 35 | 3866 |
| 4 | 2 | 65.8 | 81.6 | 14 / 35 | 3891 |
| 5 | 2 | 65.9 | 81.9 | 14 / 35 | 3927 |
| 6 | 2 | 64.5 | 78.4 | 8 / 35 | 3990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 45% |
| gh.mini.Griezel 0.2 | 41 | 68% |
| d414.nano.Quantum 1.0.0 | 11 | 82% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 61 | 43% | 86 |
| gh.mini.Griezel 0.2 | 34 | 24% | 64 |
| d414.nano.Quantum 1.0.0 | 15 | 10% | 20 |
| spinnercat.micro.Tyger 0.1 | 11 | 8% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 10 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160784 melee ticks, 42232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50627 sent, 45559 reached their opponent, 7173 virtual hits (15.7% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 773 over 6 battles (128.8 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.4 | 129 / 210 | 1.95 | 18.7% | 27156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.7% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 41 |
| apc.botM 3.0 | 3.2 | 12.0% | 18 |
| vjik.UnViolation 1.1 | 4.5 | 10.4% | 9 |
| lxx.ConceptA 0.8 | 4.8 | 9.9% | 5 |
| bayen.UbaMicro 1.4 | 5.8 | 8.5% | 4 |
| panzer.Panzer 0.2 | 7.0 | 7.5% | 2 |
| conscience.Electron 1.3g | 8.2 | 6.4% | 1 |
| yk.JahMicro 1.0 | 8.5 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.0 | 21 / 35 | 4542 |
| 2 | 1 | 67.7 | 87.6 | 22 / 35 | 4365 |
| 3 | 1 | 69.3 | 93.0 | 22 / 35 | 4939 |
| 4 | 1 | 68.5 | 90.5 | 25 / 35 | 4205 |
| 5 | 1 | 68.6 | 91.1 | 22 / 35 | 4612 |
| 6 | 1 | 67.1 | 87.3 | 17 / 35 | 4493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 64% |
| apc.botM 3.0 | 41 | 83% |
| vjik.UnViolation 1.1 | 12 | 92% |
| lxx.ConceptA 0.8 | 9 | 89% |
| donjezza.Jezza 1.0 | 9 | 100% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| yk.JahMicro 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 4 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 34 | 39% | 81 |
| apc.botM 3.0 | 15 | 17% | 52 |
| lxx.ConceptA 0.8 | 9 | 10% | 16 |
| bayen.UbaMicro 1.4 | 8 | 9% | 14 |
| vjik.UnViolation 1.1 | 5 | 6% | 28 |
| conscience.Electron 1.3g | 5 | 6% | 8 |
| panzer.Panzer 0.2 | 4 | 5% | 4 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127675 melee ticks, 49384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 43718 sent, 38702 reached their opponent, 6838 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 6 battles (118.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.6 | 126 / 210 | 1.93 | 19.6% | 29455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.6% | 126 |
| maribo.Quester 0.3 | 2.2 | 15.3% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.0% | 19 |
| labg.Cataclysm 2.05 | 4.5 | 10.6% | 9 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.8% | 12 |
| baal.nano.N 1.42 | 6.0 | 8.8% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 7 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 21 / 35 | 5026 |
| 2 | 1 | 69.9 | 87.9 | 21 / 35 | 5109 |
| 3 | 1 | 70.3 | 94.0 | 23 / 35 | 4636 |
| 4 | 1 | 69.4 | 88.6 | 19 / 35 | 4873 |
| 5 | 1 | 69.3 | 87.0 | 20 / 35 | 4923 |
| 6 | 1 | 69.9 | 89.5 | 22 / 35 | 4888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 73% |
| gre.svman4.Leonidas 1.3.2 | 29 | 86% |
| labg.Cataclysm 2.05 | 22 | 77% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 57% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 28 | 31% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 21% | 56 |
| gre.svman4.Leonidas 1.3.2 | 16 | 18% | 31 |
| labg.Cataclysm 2.05 | 8 | 9% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 8% | 7 |
| baal.nano.N 1.42 | 4 | 4% | 9 |
| zyx.micro.Ant 1.1 | 2 | 2% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 173079 melee ticks, 56311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 55296 sent, 50472 reached their opponent, 7405 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 578 over 6 battles (96.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.3 | 96 / 210 | 1.87 | 19.0% | 31546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.0% | 96 |
| kid.Gladiator .7.2 | 2.2 | 16.4% | 45 |
| stelo.Spread 0.9 | 2.8 | 15.9% | 52 |
| jcs.Seth 1.8 | 4.3 | 10.9% | 11 |
| tcf.Reach 3 | 5.0 | 10.4% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.7 | 19 / 35 | 5657 |
| 2 | 1 | 69.3 | 87.9 | 14 / 35 | 5219 |
| 3 | 1 | 69.4 | 87.6 | 16 / 35 | 5166 |
| 4 | 1 | 70.0 | 90.5 | 16 / 35 | 5302 |
| 5 | 1 | 69.7 | 90.8 | 15 / 35 | 5105 |
| 6 | 1 | 69.8 | 91.4 | 16 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 57% |
| kid.Gladiator .7.2 | 65 | 52% |
| jcs.Seth 1.8 | 16 | 63% |
| cli.Dancer 1.1 | 6 | 100% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 119 of 210 rounds, at a mean tick of 1150. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 48 | 40% | 88 |
| kid.Gladiator .7.2 | 45 | 38% | 74 |
| jcs.Seth 1.8 | 11 | 9% | 24 |
| tcf.Reach 3 | 9 | 8% | 16 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 175076 melee ticks, 62180 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 50 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52935 sent, 48100 reached their opponent, 8072 virtual hits (16.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 666 over 6 battles (111.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 84.4 | 55 / 210 | 2.40 | 16.4% | 22443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.7% | 121 |
| hadur117.Hadur 3.20bw | 2.0 | 16.4% | 55 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.8% | 6 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 85.1 | 6 / 35 | 3644 |
| 2 | 2 | 67.0 | 87.6 | 12 / 35 | 4052 |
| 3 | 2 | 64.3 | 81.0 | 5 / 35 | 3685 |
| 4 | 2 | 66.7 | 85.1 | 12 / 35 | 3957 |
| 5 | 2 | 66.0 | 86.3 | 13 / 35 | 3550 |
| 6 | 2 | 64.5 | 81.6 | 7 / 35 | 3555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 87 | 28% |
| gh.mini.Gruwel 0.9 | 23 | 43% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 67% |
| rz.HawkOnFire 0.1 | 9 | 67% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 57% | 116 |
| gh.mini.Gruwel 0.9 | 27 | 17% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 27 |
| rz.HawkOnFire 0.1 | 13 | 8% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149260 melee ticks, 50441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46075 sent, 41179 reached their opponent, 6302 virtual hits (15.3% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.8 | 163 / 210 | 1.56 | 21.2% | 33420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.2% | 163 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 15 |
| alpha.RainingFire 1.0 | 3.2 | 11.5% | 12 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 4 |
| mz.Cork 0.1 | 4.7 | 10.5% | 11 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.0% | 5 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 4.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 26 / 35 | 5921 |
| 2 | 1 | 72.3 | 95.6 | 30 / 35 | 5717 |
| 3 | 1 | 71.5 | 94.0 | 27 / 35 | 5442 |
| 4 | 1 | 72.4 | 95.2 | 30 / 35 | 5688 |
| 5 | 1 | 69.5 | 89.2 | 20 / 35 | 5102 |
| 6 | 1 | 72.1 | 94.9 | 30 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 86% |
| bvh.micro.Freya 0.3 | 40 | 100% |
| mz.Cork 0.1 | 29 | 79% |
| alpha.RainingFire 1.0 | 28 | 86% |
| m3thos.Eva02 0.7.1 | 17 | 94% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 27% | 35 |
| bzdp.Pansy 2.1 | 12 | 24% | 51 |
| mz.Cork 0.1 | 9 | 18% | 39 |
| bvh.micro.Freya 0.3 | 6 | 12% | 34 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 10 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 27 |
| dl.BetterWalls 1.0 | 1 | 2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 145670 melee ticks, 48452 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49570 sent, 44906 reached their opponent, 9192 virtual hits (20.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.7 | 162 / 210 | 1.92 | 19.7% | 34442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.7% | 162 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.8% | 11 |
| germ.TheMind .2 | 3.8 | 9.8% | 4 |
| EBBU.Sim2 1.02 | 4.0 | 9.8% | 5 |
| agrach.Dalek 1.0 | 5.3 | 9.3% | 8 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.2% | 9 |
| mb.Beast 0.1 | 6.3 | 8.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 7.8% | 1 |
| lmk.ACPFinal 0.1 | 8.2 | 7.8% | 3 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.1 | 23 / 35 | 5564 |
| 2 | 1 | 69.4 | 92.4 | 28 / 35 | 5622 |
| 3 | 1 | 67.0 | 82.2 | 24 / 35 | 5751 |
| 4 | 1 | 70.4 | 95.6 | 30 / 35 | 5802 |
| 5 | 1 | 70.2 | 93.0 | 30 / 35 | 5926 |
| 6 | 1 | 69.1 | 90.2 | 27 / 35 | 5777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 86% |
| stelo.UntouchableNano 1.3 | 27 | 89% |
| agrach.Dalek 1.0 | 23 | 100% |
| germ.TheMind .2 | 22 | 95% |
| mb.Beast 0.1 | 21 | 90% |
| EBBU.Sim2 1.02 | 21 | 100% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| skm.Ryubot 1.0 | 14 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 29% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 22% | 14 |
| mb.Beast 0.1 | 6 | 12% | 27 |
| agrach.Dalek 1.0 | 4 | 8% | 35 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 31 |
| EBBU.Sim2 1.02 | 4 | 8% | 24 |
| lmk.ACPFinal 0.1 | 3 | 6% | 19 |
| germ.TheMind .2 | 2 | 4% | 9 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 97745 melee ticks, 29543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 33188 sent, 28671 reached their opponent, 8284 virtual hits (28.9% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.2 | 109 / 210 | 2.24 | 18.0% | 26909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.2 | 18.0% | 109 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 59 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 9 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.4% | 16 |
| cs.Wren 1.0 | 5.2 | 10.2% | 7 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.3% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.5% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 7.0% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 3.7% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 14 / 35 | 4691 |
| 2 | 2 | 66.1 | 83.5 | 11 / 35 | 4249 |
| 3 | 1 | 67.5 | 84.1 | 19 / 35 | 4516 |
| 4 | 1 | 69.4 | 91.4 | 23 / 35 | 4611 |
| 5 | 1 | 70.3 | 92.1 | 25 / 35 | 4831 |
| 6 | 1 | 66.1 | 82.2 | 17 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 61 | 64% |
| bts.mega.Gnarly 1.4 | 26 | 65% |
| bvh.mini.Freya 0.55 | 26 | 100% |
| cs.Wren 1.0 | 15 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 71% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 105 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 43% | 90 |
| bts.mega.Gnarly 1.4 | 18 | 17% | 31 |
| bvh.mini.Freya 0.55 | 12 | 11% | 32 |
| cs.Wren 1.0 | 11 | 10% | 21 |
| kdf.KoulDestroyer 1.0 | 9 | 9% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 9 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 141708 melee ticks, 41645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46300 sent, 41191 reached their opponent, 8928 virtual hits (21.7% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.2 | 102 / 210 | 2.24 | 18.2% | 29956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.2% | 102 |
| bvh.fry.Freya 0.82 | 2.2 | 15.2% | 29 |
| az.Ololobot 0.2.4 | 2.8 | 13.3% | 53 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 6.3 | 8.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 7.9% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 7.0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 18 / 35 | 4968 |
| 2 | 1 | 67.8 | 88.3 | 15 / 35 | 4905 |
| 3 | 1 | 68.0 | 86.0 | 17 / 35 | 5103 |
| 4 | 1 | 68.1 | 84.8 | 21 / 35 | 5046 |
| 5 | 1 | 68.2 | 87.9 | 19 / 35 | 5049 |
| 6 | 1 | 66.4 | 83.5 | 12 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 55 | 55% |
| bvh.fry.Freya 0.82 | 48 | 77% |
| catcat20.Lambda 0.024 | 30 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 39 | 35% | 73 |
| az.Ololobot 0.2.4 | 37 | 34% | 72 |
| catcat20.Lambda 0.024 | 17 | 15% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 5% | 8 |
| apollokidd.ApolloKidd 0.9 | 5 | 5% | 7 |
| gimp.GimpBot 0.1 | 4 | 4% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 166345 melee ticks, 48564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 86 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52868 sent, 47848 reached their opponent, 8351 virtual hits (17.5% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 714 over 6 battles (119.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.9 | 134 / 210 | 1.91 | 19.9% | 31339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.9% | 134 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.2% | 17 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 9.9% | 5 |
| alpha.BlackIce 1.0 | 6.2 | 8.9% | 1 |
| stelo.Randomness 1.0 | 6.5 | 8.6% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 19 / 35 | 5390 |
| 2 | 1 | 71.3 | 92.7 | 27 / 35 | 5340 |
| 3 | 1 | 69.5 | 87.9 | 18 / 35 | 5176 |
| 4 | 1 | 69.6 | 87.6 | 24 / 35 | 4889 |
| 5 | 1 | 69.9 | 88.6 | 23 / 35 | 5200 |
| 6 | 1 | 70.6 | 91.1 | 23 / 35 | 5344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 81% |
| kano.gamma.KanoGamma 1.8 | 34 | 74% |
| mz.AntiGrav 1.0 | 27 | 93% |
| stelo.Randomness 1.0 | 18 | 72% |
| Polkwane.SmashMelee 1.0 | 13 | 92% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 38% | 69 |
| kano.gamma.KanoGamma 1.8 | 13 | 16% | 44 |
| stelo.Randomness 1.0 | 12 | 15% | 33 |
| Polkwane.SmashMelee 1.0 | 9 | 11% | 21 |
| mz.AntiGrav 1.0 | 6 | 7% | 25 |
| alpha.BlackIce 1.0 | 5 | 6% | 8 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 5 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151581 melee ticks, 44291 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 133 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 133 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50171 sent, 45148 reached their opponent, 9350 virtual hits (20.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 454 over 6 battles (75.7 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.4 | 108 / 210 | 2.05 | 18.3% | 25936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 18.3% | 108 |
| eem.EvBotNG v12.8 | 2.0 | 15.7% | 72 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.9% | 13 |
| ary.Swarm 1.1 | 3.7 | 12.8% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.9% | 6 |
| shrub.Silver v048 | 6.0 | 8.8% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.2% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.1 | 22 / 35 | 4224 |
| 2 | 1 | 69.7 | 92.4 | 21 / 35 | 4384 |
| 3 | 1 | 68.3 | 88.9 | 17 / 35 | 4324 |
| 4 | 1 | 67.6 | 84.8 | 15 / 35 | 4346 |
| 5 | 1 | 67.6 | 84.8 | 16 / 35 | 4421 |
| 6 | 1 | 68.0 | 87.3 | 17 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 40% |
| lessonz.robocode.Oz 0.5.0 | 39 | 92% |
| ary.Swarm 1.1 | 26 | 81% |
| simonton.nano.MeleeSeed 1.8 | 17 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 55% | 94 |
| lessonz.robocode.Oz 0.5.0 | 17 | 16% | 39 |
| ary.Swarm 1.1 | 13 | 12% | 32 |
| simonton.nano.MeleeSeed 1.8 | 6 | 6% | 25 |
| shrub.Silver v048 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 3 | 3% | 5 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 152366 melee ticks, 56879 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 58 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50220 sent, 45358 reached their opponent, 6929 virtual hits (15.3% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 526 over 6 battles (87.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.1 | 146 / 210 | 1.62 | 20.7% | 35348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 20.7% | 146 |
| wompi.Wallaby 5.1 | 2.2 | 15.3% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.6% | 11 |
| ara.Shera 0.88 | 3.5 | 12.9% | 22 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 1 |
| maribo.IotaCT 1.1 | 6.7 | 6.6% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.7% | 1 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 23 / 35 | 5842 |
| 2 | 1 | 71.2 | 94.0 | 26 / 35 | 5768 |
| 3 | 1 | 71.0 | 92.4 | 24 / 35 | 5730 |
| 4 | 1 | 71.8 | 94.6 | 27 / 35 | 5987 |
| 5 | 1 | 71.1 | 92.7 | 22 / 35 | 5932 |
| 6 | 1 | 71.3 | 93.7 | 24 / 35 | 6089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 87% |
| maribo.mini.MiniQuester 0.1 | 42 | 98% |
| ara.Shera 0.88 | 30 | 67% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 38% | 94 |
| ara.Shera 0.88 | 24 | 35% | 50 |
| maribo.mini.MiniQuester 0.1 | 10 | 14% | 45 |
| amz.NanoClone 1.41 | 4 | 6% | 6 |
| dsw.StaticD 1.0 | 1 | 1% | 6 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169756 melee ticks, 51934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53036 sent, 48106 reached their opponent, 9306 virtual hits (19.3% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 690 over 6 battles (115.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.1 | 49 / 210 | 2.52 | 16.5% | 24917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 137 |
| hadur117.Hadur 3.20bw | 2.0 | 16.5% | 49 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.0% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.3% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.2% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 84.4 | 8 / 35 | 4202 |
| 2 | 2 | 67.5 | 84.8 | 10 / 35 | 4339 |
| 3 | 2 | 66.3 | 83.2 | 7 / 35 | 3999 |
| 4 | 2 | 66.2 | 80.6 | 7 / 35 | 4054 |
| 5 | 2 | 67.8 | 86.0 | 11 / 35 | 4312 |
| 6 | 2 | 65.7 | 79.7 | 6 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 20% |
| brainfade.melee.Dusk 0.44 | 25 | 56% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| Krabb.akim2.Akim2 1.1b | 3 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 61% | 126 |
| brainfade.melee.Dusk 0.44 | 21 | 12% | 32 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 14 |
| jab.DiamondStealer 5 | 5 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
| mz.NanoGod 2.02 | 1 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159011 melee ticks, 60757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50597 sent, 45454 reached their opponent, 7597 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 735 over 6 battles (122.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.4 | 149 / 210 | 1.68 | 21.0% | 35547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 21.0% | 149 |
| stelo.Liblix 0.3.1 | 2.2 | 14.6% | 43 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.5% | 1 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 3 |
| disan.Chair 2.2.0 | 6.5 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.3% | 0 |
| wompi.Quokka 1.6 | 7.2 | 7.1% | 0 |
| sample.Crazy 1.0 | 9.3 | 5.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 24 / 35 | 5459 |
| 2 | 1 | 71.5 | 93.0 | 25 / 35 | 5900 |
| 3 | 1 | 70.8 | 91.1 | 23 / 35 | 5715 |
| 4 | 1 | 70.8 | 89.5 | 23 / 35 | 5975 |
| 5 | 1 | 71.8 | 92.1 | 27 / 35 | 6332 |
| 6 | 1 | 72.5 | 97.1 | 27 / 35 | 6166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 68% |
| tzu.TheArtOfWar 1.2 | 61 | 93% |
| disan.Chair 2.2.0 | 14 | 100% |
| jwirde.Gort 2.0 | 10 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| stf.PanzerGeneral 0.1 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 67% |
| wompi.Quokka 1.6 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 55% | 98 |
| tzu.TheArtOfWar 1.2 | 13 | 19% | 55 |
| jwirde.Gort 2.0 | 4 | 6% | 21 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 11 |
| disan.Chair 2.2.0 | 2 | 3% | 7 |
| sample.Crazy 1.0 | 2 | 3% | 4 |
| wompi.Quokka 1.6 | 0 | 0% | 5 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 5 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 154260 melee ticks, 49735 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 52990 sent, 48355 reached their opponent, 10171 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 472 over 6 battles (78.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.2 | 114 / 210 | 2.15 | 19.6% | 31703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20bw | 1.0 | 19.6% | 114 |
| jje.BagPuss 1.2 | 2.3 | 12.8% | 9 |
| sul.Lunar 1.1 | 3.8 | 11.1% | 13 |
| eem.IWillFireNoBullet v2.8 | 4.3 | 9.8% | 59 |
| myl.nano.Graviton 1.10 | 4.7 | 11.1% | 5 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 1 |
| fm.claire 1.7 | 6.8 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.2% | 3 |
| wit.Deep7 2.0 | 8.8 | 5.8% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.5 | 17 / 35 | 5445 |
| 2 | 1 | 70.7 | 89.5 | 21 / 35 | 5793 |
| 3 | 1 | 69.4 | 89.8 | 16 / 35 | 5513 |
| 4 | 1 | 71.1 | 89.8 | 24 / 35 | 4614 |
| 5 | 1 | 70.5 | 89.2 | 21 / 35 | 5800 |
| 6 | 1 | 66.4 | 81.6 | 15 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 58% |
| jje.BagPuss 1.2 | 29 | 86% |
| sul.Lunar 1.1 | 27 | 81% |
| myl.nano.Graviton 1.10 | 19 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| fm.claire 1.7 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 4 | 75% |

Hadur died in 100 of 210 rounds, at a mean tick of 1385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 27 | 27% | 0 |
| jje.BagPuss 1.2 | 25 | 25% | 75 |
| sul.Lunar 1.1 | 14 | 14% | 35 |
| fm.claire 1.7 | 10 | 10% | 15 |
| myl.nano.Graviton 1.10 | 9 | 9% | 33 |
| hvilela.HVilela 0.9 | 5 | 5% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 22 |
| wit.Deep7 2.0 | 2 | 2% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 189833 melee ticks, 73522 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 46 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 57614 sent, 52918 reached their opponent, 8059 virtual hits (15.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20bw against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 724 over 6 battles (120.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 59 / 210 | 2.47 | 16.4% | 24398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 66 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.4% | 78 |
| hadur117.Hadur 3.20bw | 2.3 | 16.4% | 59 |
| mz.MicroSheep 1.0 | 4.2 | 10.4% | 2 |
| cx.Princess 1.0 | 5.2 | 9.8% | 3 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.5 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 84.4 | 10 / 35 | 4063 |
| 2 | 3 | 64.7 | 81.3 | 6 / 35 | 3946 |
| 3 | 1 | 66.6 | 86.7 | 13 / 35 | 4049 |
| 4 | 3 | 65.2 | 80.3 | 8 / 35 | 4132 |
| 5 | 2 | 66.3 | 84.8 | 12 / 35 | 3942 |
| 6 | 2 | 66.0 | 84.4 | 10 / 35 | 4266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 58% |
| rsalesc.melee.Medina 0.4.5 | 46 | 17% |
| cx.Princess 1.0 | 7 | 71% |
| arthord.NanoSatanMelee Beta | 3 | 33% |
| mz.MicroSheep 1.0 | 3 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 39% | 102 |
| rsalesc.melee.Medina 0.4.5 | 62 | 39% | 70 |
| cx.Princess 1.0 | 8 | 5% | 12 |
| mz.MicroSheep 1.0 | 7 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 7 |
| sadoner.killer 0.2 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 160955 melee ticks, 46812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 58 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45763 sent, 40808 reached their opponent, 6052 virtual hits (14.8% of those reached).

