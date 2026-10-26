# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 6 battles (55.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 85.0 | 36 / 210 | 2.35 | 16.3% | 26603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 156 |
| hadur2.Hadur 3.17.1ef | 2.0 | 16.3% | 36 |
| sgp.JollyNinja 3.53 | 3.8 | 11.1% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 1 |
| mz.MicroGodMelee 1 | 4.5 | 10.7% | 4 |
| lorneswork.Predator 1.0 | 5.3 | 10.4% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 82.9 | 5 / 35 | 4277 |
| 2 | 2 | 64.8 | 82.2 | 7 / 35 | 4086 |
| 3 | 2 | 66.4 | 86.3 | 5 / 35 | 4554 |
| 4 | 2 | 65.4 | 85.7 | 6 / 35 | 4001 |
| 5 | 2 | 66.8 | 87.3 | 6 / 35 | 4896 |
| 6 | 2 | 66.8 | 85.7 | 7 / 35 | 4789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 8% |
| sgp.JollyNinja 3.53 | 14 | 50% |
| mz.MicroGodMelee 1 | 12 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 1185. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 131 | 74% | 144 |
| lorneswork.Predator 1.0 | 12 | 7% | 17 |
| sgp.JollyNinja 3.53 | 10 | 6% | 13 |
| mz.MicroGodMelee 1 | 9 | 5% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 11 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 150116 melee ticks, 89080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 80 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48355 sent, 43788 reached their opponent, 9454 virtual hits (21.6% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.6 | 88 / 210 | 2.39 | 17.4% | 25570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.4% | 88 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.3% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.4% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.2% | 1 |
| sch.Simone 0.3d | 7.0 | 8.1% | 15 |
| Noran.BitchingElk 0.054 | 7.3 | 7.9% | 12 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 84.1 | 19 / 35 | 3898 |
| 2 | 1 | 66.7 | 84.4 | 17 / 35 | 4229 |
| 3 | 1 | 66.7 | 85.7 | 13 / 35 | 4398 |
| 4 | 1 | 66.9 | 84.4 | 12 / 35 | 4687 |
| 5 | 1 | 66.0 | 84.1 | 14 / 35 | 4169 |
| 6 | 1 | 66.1 | 84.4 | 13 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 49% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 70% |
| sch.Simone 0.3d | 17 | 65% |
| Noran.BitchingElk 0.054 | 7 | 14% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 28% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 21% | 53 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 15% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 16 |
| sch.Simone 0.3d | 11 | 9% | 18 |
| Noran.BitchingElk 0.054 | 10 | 8% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 7 |
| stelo.PatternRobot 1.0 | 5 | 4% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 206 rounds): 175411 melee ticks, 44129 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 65 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 61988 sent, 57392 reached their opponent, 10388 virtual hits (18.1% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.2 | 165 / 210 | 1.70 | 19.7% | 32860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.7% | 165 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 20 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.8% | 12 |
| vuen.Cake 2.51 | 3.8 | 12.2% | 9 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 2 |
| adt.Ar1 2.1 | 6.8 | 7.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.3% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.9 | 29 / 35 | 5955 |
| 2 | 1 | 69.2 | 90.2 | 28 / 35 | 5236 |
| 3 | 1 | 69.8 | 93.3 | 31 / 35 | 5340 |
| 4 | 1 | 69.1 | 91.7 | 26 / 35 | 5248 |
| 5 | 1 | 68.7 | 91.4 | 24 / 35 | 5305 |
| 6 | 1 | 70.1 | 91.7 | 27 / 35 | 5776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 64 | 92% |
| radnor.DoctorBob 1.42 | 54 | 98% |
| kawigi.nano.Lib 1.0 | 42 | 93% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 40% | 64 |
| vuen.Cake 2.51 | 8 | 18% | 65 |
| urdos.URDOS 1.3 | 7 | 16% | 13 |
| kawigi.nano.Lib 1.0 | 5 | 11% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 9% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 11 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 128603 melee ticks, 38803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 99 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 99 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 39845 sent, 35605 reached their opponent, 9726 virtual hits (27.3% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.9 | 30 / 210 | 2.36 | 16.6% | 28080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 160 |
| hadur2.Hadur 3.17.1ef | 2.0 | 16.6% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 8 |
| josago.Jorgito 0.16 | 5.0 | 8.7% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.7% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.5 | 2 / 35 | 4675 |
| 2 | 2 | 67.0 | 86.7 | 7 / 35 | 4636 |
| 3 | 2 | 67.9 | 87.9 | 8 / 35 | 4796 |
| 4 | 2 | 67.8 | 87.6 | 6 / 35 | 4881 |
| 5 | 2 | 66.2 | 82.9 | 5 / 35 | 4574 |
| 6 | 2 | 65.9 | 81.9 | 2 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 126 | 10% |
| TNT.TNT 0.99.1 | 13 | 62% |
| apc.LeeroyJenkins2 1.0 | 10 | 70% |
| rampancy.Durandal 2.1d | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 76% | 157 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 27 |
| TNT.TNT 0.99.1 | 11 | 6% | 16 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 202971 melee ticks, 66021 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 94 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 63051 sent, 58436 reached their opponent, 9115 virtual hits (15.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 6 battles (65.3 per battle, most in one battle 239). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.6 | 23 / 210 | 3.01 | 14.4% | 19941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.7% | 112 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 56 |
| hadur2.Hadur 3.17.1ef | 3.0 | 14.4% | 23 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 15 |
| ms.Ares 0.19 | 5.3 | 9.2% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 4 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.4% | 1 |
| GarmBox.Oranges 1.0 | 9.3 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 78.7 | 4 / 35 | 3269 |
| 2 | 3 | 61.1 | 73.7 | 4 / 35 | 3084 |
| 3 | 3 | 62.9 | 80.0 | 3 / 35 | 3293 |
| 4 | 3 | 61.3 | 74.3 | 2 / 35 | 3036 |
| 5 | 3 | 65.4 | 82.5 | 7 / 35 | 3877 |
| 6 | 3 | 62.6 | 76.5 | 3 / 35 | 3382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 45 | 16% |
| justin.DemonicRage 3.4 | 30 | 20% |
| wompi.Numbat 2.1 | 15 | 53% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 76 | 40% | 86 |
| justin.DemonicRage 3.4 | 66 | 35% | 71 |
| wompi.Numbat 2.1 | 28 | 15% | 32 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| ms.Ares 0.19 | 4 | 2% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156007 melee ticks, 36317 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 99 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 99 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48658 sent, 44092 reached their opponent, 7837 virtual hits (17.8% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 6 battles (57.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.4 | 125 / 210 | 1.96 | 19.0% | 28984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.0% | 125 |
| jekl.StoneGhost 0.7 | 2.2 | 14.9% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.3% | 14 |
| origin.SleepSiphon 1.7b | 3.7 | 12.4% | 29 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 1 |
| gg.Wolverine 2.0 | 5.7 | 8.8% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 6.5% | 1 |
| DBall.NUKE 0.1 | 8.2 | 6.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 2 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 18 / 35 | 4741 |
| 2 | 1 | 67.8 | 87.0 | 21 / 35 | 4304 |
| 3 | 1 | 67.9 | 84.8 | 17 / 35 | 4962 |
| 4 | 1 | 70.8 | 95.2 | 27 / 35 | 5063 |
| 5 | 1 | 68.9 | 88.6 | 19 / 35 | 4932 |
| 6 | 1 | 69.7 | 90.8 | 23 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 60 | 85% |
| origin.SleepSiphon 1.7b | 35 | 74% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 87% |
| gg.Wolverine 2.0 | 11 | 73% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| DBall.NUKE 0.1 | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 22 | 25% | 57 |
| jekl.StoneGhost 0.7 | 22 | 25% | 54 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 22% | 43 |
| mld.Wisdom 1.0 | 10 | 11% | 25 |
| gg.Wolverine 2.0 | 7 | 8% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 9 |
| DBall.NUKE 0.1 | 2 | 2% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154656 melee ticks, 42117 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49410 sent, 44881 reached their opponent, 11015 virtual hits (24.5% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 71 over 6 battles (11.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 125 / 210 | 1.56 | 20.3% | 34777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.3% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.0% | 40 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 31 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.6% | 4 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 6.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| drd.Dreadknoght 0.9 | 9.2 | 2.2% | 0 |
| sample.Target 1.0 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 24 / 35 | 6153 |
| 2 | 1 | 72.5 | 95.6 | 25 / 35 | 5851 |
| 3 | 1 | 71.1 | 92.7 | 19 / 35 | 5380 |
| 4 | 1 | 71.1 | 90.8 | 17 / 35 | 5747 |
| 5 | 1 | 72.4 | 96.5 | 24 / 35 | 5718 |
| 6 | 1 | 71.2 | 92.4 | 16 / 35 | 5928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 80 | 73% |
| rsalesc.melee.Monk 0.3.6c | 50 | 32% |
| franzor.Lizt 1.3.1 | 34 | 79% |
| oog.melee.CapuletDroid 1.1 | 27 | 89% |

Hadur died in 85 of 210 rounds, at a mean tick of 1442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 45% | 67 |
| rtk.Tachikoma 1.0 | 31 | 36% | 99 |
| franzor.Lizt 1.3.1 | 9 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 37 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 194503 melee ticks, 95235 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59393 sent, 54959 reached their opponent, 11956 virtual hits (21.8% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 572 over 6 battles (95.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.8 | 126 / 210 | 1.82 | 19.0% | 26932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.0% | 126 |
| shrub.Vapour v159 | 2.7 | 12.8% | 22 |
| tm.Yuugao 1.0 | 2.8 | 12.9% | 33 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.8% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 8.6% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.9% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.4 | 19 / 35 | 4310 |
| 2 | 1 | 69.3 | 93.7 | 22 / 35 | 4599 |
| 3 | 1 | 68.0 | 89.8 | 21 / 35 | 4318 |
| 4 | 1 | 68.3 | 90.8 | 22 / 35 | 4343 |
| 5 | 1 | 68.9 | 92.4 | 19 / 35 | 4685 |
| 6 | 1 | 69.4 | 93.0 | 23 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 48 | 65% |
| tm.Yuugao 1.0 | 42 | 71% |
| Krabb.sliNk.Garm 0.9u | 32 | 66% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 67% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 25 | 28% | 58 |
| tm.Yuugao 1.0 | 23 | 26% | 59 |
| Krabb.sliNk.Garm 0.9u | 16 | 18% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 11 |
| m3thos.Eva00 1.1 | 2 | 2% | 8 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 9 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155384 melee ticks, 45240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50740 sent, 46270 reached their opponent, 9148 virtual hits (19.8% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.7 | 38 / 210 | 3.63 | 13.5% | 17552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.0% | 97 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 36 |
| hadur2.Hadur 3.17.1ef | 2.8 | 13.5% | 38 |
| yagami.Tidus 0.11 | 4.2 | 11.5% | 4 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.7% | 13 |
| mc2.enemy.Original 0.9 | 5.8 | 9.7% | 20 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 74.9 | 9 / 35 | 2914 |
| 2 | 3 | 59.4 | 69.5 | 3 / 35 | 2773 |
| 3 | 3 | 60.1 | 68.6 | 9 / 35 | 2918 |
| 4 | 2 | 59.1 | 68.6 | 7 / 35 | 2877 |
| 5 | 3 | 60.6 | 71.1 | 3 / 35 | 3056 |
| 6 | 3 | 60.9 | 71.7 | 7 / 35 | 3014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 33 | 24% |
| kc.micro.Figment 1.0 | 22 | 64% |
| mc2.enemy.Original 0.9 | 10 | 20% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| yagami.Tidus 0.11 | 7 | 86% |
| dft.Calliope 5.6 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 52 | 30% | 61 |
| kc.micro.Figment 1.0 | 33 | 19% | 45 |
| yagami.Tidus 0.11 | 25 | 14% | 31 |
| mc2.enemy.Original 0.9 | 23 | 13% | 28 |
| pedersen.Grishnakh 1.0 | 22 | 13% | 24 |
| robar.nano.Assertive_Melee 0.2 | 6 | 3% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 4 | 2% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146003 melee ticks, 27244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48639 sent, 44260 reached their opponent, 6593 virtual hits (14.9% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 6 battles (38.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 94.9 | 163 / 210 | 1.46 | 20.1% | 30957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.1% | 163 |
| DTF.Kludgy 1.2b | 2.5 | 13.5% | 26 |
| ne.Chimera 1.2 | 3.0 | 12.8% | 2 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 10 |
| vStar.RAFzilla 2.15 | 5.0 | 10.7% | 6 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 1 |
| kurios.DOSexe .9b | 8.0 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.5 | 20 / 35 | 4694 |
| 2 | 1 | 70.5 | 94.3 | 25 / 35 | 5469 |
| 3 | 1 | 71.0 | 97.8 | 30 / 35 | 5173 |
| 4 | 1 | 71.6 | 96.8 | 32 / 35 | 5609 |
| 5 | 1 | 71.1 | 97.8 | 31 / 35 | 5098 |
| 6 | 1 | 69.4 | 93.3 | 25 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 73% |
| ejb.Polaris 1.0.1 | 49 | 90% |
| ne.Chimera 1.2 | 31 | 94% |
| vStar.RAFzilla 2.15 | 31 | 100% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 0% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 48% | 63 |
| ejb.Polaris 1.0.1 | 9 | 19% | 43 |
| ne.Chimera 1.2 | 6 | 13% | 43 |
| vStar.RAFzilla 2.15 | 3 | 6% | 31 |
| kurios.DOSexe .9b | 2 | 4% | 8 |
| donjezza.Muncho 1.0 | 2 | 4% | 2 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 14 |
| sam.Samspin 1.0 | 1 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 146194 melee ticks, 57135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 88 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 48340 sent, 43978 reached their opponent, 9150 virtual hits (20.8% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.3 | 71 / 210 | 2.77 | 15.8% | 20813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.5 | 15.8% | 71 |
| rz.Aleph 0.34 | 1.5 | 16.2% | 68 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.5% | 16 |
| djc.DynaBot 0.1.1 | 3.8 | 11.1% | 19 |
| rdt199.Warlord 0.73 | 5.8 | 9.2% | 11 |
| br2.MobyDickBot 1.6 | 5.8 | 8.7% | 12 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 12 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 80.3 | 11 / 35 | 3488 |
| 2 | 2 | 63.3 | 78.4 | 13 / 35 | 3340 |
| 3 | 1 | 64.5 | 81.9 | 14 / 35 | 3553 |
| 4 | 2 | 63.2 | 78.7 | 11 / 35 | 3379 |
| 5 | 2 | 63.0 | 78.7 | 9 / 35 | 3348 |
| 6 | 1 | 65.2 | 83.8 | 13 / 35 | 3705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 44% |
| djc.DynaBot 0.1.1 | 18 | 61% |
| cx.mini.Nimrod 0.55 | 17 | 76% |
| uji.YellohFellah 1.0 | 13 | 85% |
| br2.MobyDickBot 1.6 | 11 | 27% |
| rdt199.Warlord 0.73 | 10 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 64 | 46% | 92 |
| cx.mini.Nimrod 0.55 | 27 | 19% | 39 |
| djc.DynaBot 0.1.1 | 12 | 9% | 19 |
| uji.YellohFellah 1.0 | 10 | 7% | 20 |
| br2.MobyDickBot 1.6 | 10 | 7% | 12 |
| rdt199.Warlord 0.73 | 8 | 6% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 5 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156665 melee ticks, 38566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 65 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51792 sent, 47242 reached their opponent, 6761 virtual hits (14.3% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 86.3 | 110 / 210 | 2.23 | 17.4% | 21722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.4% | 110 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.8% | 32 |
| nat.PallasHawk 1.0 | 3.2 | 13.0% | 34 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 23 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 6 |
| jrm.Test0 1.0 | 6.5 | 8.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.8% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 87.3 | 17 / 35 | 3535 |
| 2 | 1 | 68.0 | 90.2 | 22 / 35 | 3703 |
| 3 | 1 | 66.7 | 85.4 | 18 / 35 | 3961 |
| 4 | 1 | 65.2 | 83.2 | 16 / 35 | 3470 |
| 5 | 1 | 64.8 | 82.2 | 16 / 35 | 3266 |
| 6 | 1 | 67.8 | 89.8 | 21 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 50 | 80% |
| bts.wiki.RipCurl 0.9b | 41 | 76% |
| nat.PallasHawk 1.0 | 37 | 57% |
| brainfade.melee.Genghis 0.36 | 11 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 28 | 28% | 54 |
| bts.wiki.RipCurl 0.9b | 26 | 26% | 52 |
| darkcanuck.Leon 1.01 | 15 | 15% | 50 |
| brainfade.melee.Genghis 0.36 | 12 | 12% | 19 |
| jrm.Test0 1.0 | 8 | 8% | 13 |
| jp.Perpy 16.0 | 5 | 5% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 8 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 138166 melee ticks, 34712 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46730 sent, 42042 reached their opponent, 7319 virtual hits (17.4% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 81 over 6 battles (13.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.5 | 59 / 210 | 2.93 | 15.0% | 22123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.2 | 17.0% | 43 |
| mn.Combat 3.25.0 | 2.2 | 15.8% | 79 |
| hadur2.Hadur 3.17.1ef | 2.7 | 15.0% | 59 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 16 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.2 | 7.3% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 82.2 | 9 / 35 | 3801 |
| 2 | 3 | 63.0 | 76.8 | 11 / 35 | 3516 |
| 3 | 2 | 65.1 | 84.4 | 9 / 35 | 3789 |
| 4 | 3 | 61.2 | 71.4 | 6 / 35 | 3477 |
| 5 | 3 | 64.8 | 81.3 | 11 / 35 | 3997 |
| 6 | 3 | 63.1 | 74.9 | 13 / 35 | 3543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 52 | 73% |
| mn.Combat 3.25.0 | 30 | 23% |
| shinh.Entangled 0.3 | 14 | 43% |
| gh.micro.Gruweltje 0.7 | 12 | 50% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 51 | 34% | 60 |
| ags.Glacier 0.2.11 | 43 | 28% | 78 |
| gh.micro.Gruweltje 0.7 | 20 | 13% | 26 |
| shinh.Entangled 0.3 | 18 | 12% | 25 |
| stelo.Wang 1.0 | 7 | 5% | 8 |
| apc.Colossus2 0.17 | 6 | 4% | 6 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142889 melee ticks, 37638 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 42813 sent, 38147 reached their opponent, 6691 virtual hits (17.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.1 | 147 / 210 | 1.62 | 19.6% | 29693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.6% | 147 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 18 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.8% | 32 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.5% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.1% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.5% | 2 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.8 | 23 / 35 | 4632 |
| 2 | 1 | 70.7 | 96.2 | 25 / 35 | 5357 |
| 3 | 1 | 70.1 | 93.3 | 26 / 35 | 5037 |
| 4 | 1 | 69.8 | 93.0 | 25 / 35 | 5005 |
| 5 | 1 | 69.9 | 93.0 | 25 / 35 | 4897 |
| 6 | 1 | 69.4 | 92.4 | 23 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 89% |
| catcat20.shape.Theta 0.018 | 67 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| pa.Improved 1.0 | 4 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 32 | 51% | 73 |
| simonton.micro.Sprout 1.1.3 | 19 | 30% | 76 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 13 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 146362 melee ticks, 52575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46208 sent, 41975 reached their opponent, 10694 virtual hits (25.5% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 6 battles (48.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.4 | 93 / 210 | 2.50 | 17.3% | 26212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.3% | 93 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 24 |
| emp.Yngwie 1.11 | 2.7 | 13.9% | 67 |
| mld.DustBunny 3.8 | 4.2 | 12.4% | 7 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.2% | 4 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.3% | 15 |
| lambdaxy.TBot 0.1 | 7.3 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.2% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 17 / 35 | 4590 |
| 2 | 1 | 65.3 | 81.6 | 13 / 35 | 4229 |
| 3 | 1 | 68.2 | 87.3 | 20 / 35 | 4648 |
| 4 | 1 | 66.8 | 83.5 | 17 / 35 | 4265 |
| 5 | 1 | 66.6 | 83.8 | 16 / 35 | 4486 |
| 6 | 1 | 64.5 | 79.7 | 10 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 49 | 47% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| mld.DustBunny 3.8 | 27 | 89% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 50 | 42% | 86 |
| kawigi.micro.Shiz 1.1 | 19 | 16% | 46 |
| cb.nano.Insomnia 1.0 | 17 | 14% | 18 |
| mld.DustBunny 3.8 | 13 | 11% | 36 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 14 |
| divineomega.TrialBot 0.003 | 4 | 3% | 7 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166951 melee ticks, 39125 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55129 sent, 50604 reached their opponent, 8552 virtual hits (16.9% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 651 over 6 battles (108.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.0 | 94 / 210 | 2.35 | 17.8% | 27920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 17.8% | 94 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 55 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 15.0% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.1% | 39 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.9% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 20 / 35 | 4732 |
| 2 | 1 | 67.9 | 87.3 | 16 / 35 | 4664 |
| 3 | 1 | 67.8 | 84.8 | 17 / 35 | 4657 |
| 4 | 1 | 66.1 | 81.9 | 12 / 35 | 4562 |
| 5 | 2 | 66.1 | 81.0 | 14 / 35 | 4191 |
| 6 | 1 | 68.7 | 88.3 | 15 / 35 | 5114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 62 | 56% |
| techdude.forest.FlamingForest 1.1 | 29 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 28 | 89% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 60% |
| tvv.nano.Polaris 1.2 | 5 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 46 | 38% | 91 |
| techdude.forest.FlamingForest 1.1 | 21 | 17% | 36 |
| bvh.fnr.Fenrir 0.36l | 19 | 16% | 23 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 15% | 37 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 11 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 193656 melee ticks, 49469 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 61 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 61242 sent, 56719 reached their opponent, 9985 virtual hits (17.6% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.4 | 93 / 210 | 2.49 | 17.7% | 29415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.7% | 93 |
| et.Predator 1.8 | 2.2 | 14.3% | 24 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.2% | 43 |
| cx.BlestPain 1.41 | 3.8 | 12.5% | 36 |
| ahf.NanoAndrew .4 | 5.3 | 10.5% | 9 |
| maribo.melee.BMV 0.1 | 6.2 | 8.6% | 1 |
| nic.Nicator 2.4 | 6.5 | 9.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.2% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 72.1 | 10 / 35 | 4569 |
| 2 | 1 | 69.1 | 89.2 | 17 / 35 | 5146 |
| 3 | 1 | 67.2 | 86.0 | 13 / 35 | 4518 |
| 4 | 1 | 69.0 | 84.1 | 18 / 35 | 5620 |
| 5 | 1 | 67.8 | 85.4 | 18 / 35 | 4849 |
| 6 | 1 | 67.3 | 83.8 | 17 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 49 | 78% |
| oog.melee.Mercutio 1.0 | 33 | 70% |
| cx.BlestPain 1.41 | 29 | 45% |
| nic.Nicator 2.4 | 6 | 100% |
| ahf.NanoAndrew .4 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 5 | 80% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| tex.Longbot 0.4 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 34 | 29% | 65 |
| cx.BlestPain 1.41 | 30 | 25% | 47 |
| oog.melee.Mercutio 1.0 | 28 | 24% | 47 |
| ahf.NanoAndrew .4 | 12 | 10% | 21 |
| maribo.melee.BMV 0.1 | 7 | 6% | 10 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| nic.Nicator 2.4 | 2 | 2% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 164525 melee ticks, 47366 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 50 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 55368 sent, 50940 reached their opponent, 11194 virtual hits (22.0% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 471 over 6 battles (78.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.8 | 134 / 210 | 2.10 | 18.5% | 25713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.5% | 134 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.4% | 32 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.5% | 20 |
| uji.DBH 1.1 | 3.8 | 10.9% | 4 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.5% | 6 |
| ratosh.Nobo 0.21 | 6.3 | 8.4% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 6.7 | 7.9% | 1 |
| sigterm.Sigterm 1.0 | 6.8 | 8.3% | 13 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.1 | 24 / 35 | 4595 |
| 2 | 1 | 69.1 | 92.7 | 25 / 35 | 4188 |
| 3 | 1 | 66.2 | 84.1 | 19 / 35 | 3800 |
| 4 | 1 | 67.7 | 87.3 | 23 / 35 | 4365 |
| 5 | 1 | 66.6 | 84.4 | 19 / 35 | 4155 |
| 6 | 1 | 68.1 | 87.0 | 24 / 35 | 4610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 78% |
| agd.Mooserwirt2 2.7 | 37 | 89% |
| uji.DBH 1.1 | 24 | 96% |
| sigterm.Sigterm 1.0 | 14 | 86% |
| stelo.WangRobot 1.0 | 7 | 100% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 36% | 75 |
| agd.Mooserwirt2 2.7 | 15 | 19% | 44 |
| uji.DBH 1.1 | 12 | 15% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 9% | 17 |
| sigterm.Sigterm 1.0 | 4 | 5% | 14 |
| stelo.WangRobot 1.0 | 4 | 5% | 7 |
| ratosh.Nobo 0.21 | 3 | 4% | 12 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 137996 melee ticks, 44426 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47268 sent, 42837 reached their opponent, 10104 virtual hits (23.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 6 battles (15.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.7 | 175 / 210 | 1.48 | 20.9% | 32207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.9% | 175 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.2% | 17 |
| mld.Infinity 2.2 | 3.2 | 12.7% | 10 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 4 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 8.0 | 6.6% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 27 / 35 | 5491 |
| 2 | 1 | 72.3 | 96.5 | 31 / 35 | 5351 |
| 3 | 1 | 71.8 | 95.2 | 30 / 35 | 5223 |
| 4 | 1 | 71.8 | 94.6 | 28 / 35 | 5396 |
| 5 | 1 | 70.8 | 95.2 | 30 / 35 | 4764 |
| 6 | 1 | 72.5 | 96.8 | 29 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 108 | 92% |
| mld.Infinity 2.2 | 27 | 100% |
| krillr.mini.JointStrike 2.0.0 | 22 | 100% |
| erdnis.Rover 0.3 | 17 | 82% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 43% | 68 |
| krillr.mini.JointStrike 2.0.0 | 6 | 17% | 34 |
| erdnis.Rover 0.3 | 6 | 17% | 26 |
| mld.Infinity 2.2 | 5 | 14% | 38 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 16 |
| mbh.Mbh 0.1 | 1 | 3% | 10 |
| pbg.R2D2 1.0 | 1 | 3% | 7 |
| pac.ABC 2.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 204 rounds): 133938 melee ticks, 45011 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45045 sent, 40688 reached their opponent, 10024 virtual hits (24.6% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 6 battles (52.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.7 | 159 / 210 | 1.48 | 21.0% | 33517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 21.0% | 159 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 27 |
| fwb.Nine 1.0.1 | 3.2 | 11.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 1 |
| catcat20.Rabbit 0.001 | 4.7 | 10.2% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.0% | 1 |
| bayen.nut.Squirrel 1.615 | 8.0 | 6.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 28 / 35 | 5542 |
| 2 | 1 | 70.4 | 92.4 | 25 / 35 | 5126 |
| 3 | 1 | 71.1 | 94.3 | 25 / 35 | 5481 |
| 4 | 1 | 71.4 | 94.6 | 24 / 35 | 5782 |
| 5 | 1 | 72.0 | 95.6 | 28 / 35 | 5755 |
| 6 | 1 | 72.1 | 96.5 | 29 / 35 | 5831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 83% |
| fwb.Nine 1.0.1 | 40 | 100% |
| catcat20.Rabbit 0.001 | 29 | 79% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 58% | 95 |
| catcat20.Rabbit 0.001 | 7 | 13% | 41 |
| fwb.Nine 1.0.1 | 6 | 11% | 18 |
| m3thos.mini.Eva01 0.5.5 | 4 | 8% | 16 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 7 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 19 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 173866 melee ticks, 56690 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 25 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55269 sent, 50711 reached their opponent, 12181 virtual hits (24.0% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.2 | 116 / 210 | 1.70 | 19.5% | 30465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.5% | 116 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 75 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 5 |
| eld.Hmm 1.0 | 5.2 | 8.7% | 10 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 21 / 35 | 5239 |
| 2 | 1 | 68.8 | 90.8 | 17 / 35 | 4719 |
| 3 | 1 | 69.7 | 91.1 | 16 / 35 | 5224 |
| 4 | 1 | 70.7 | 95.2 | 21 / 35 | 5392 |
| 5 | 1 | 70.0 | 93.7 | 20 / 35 | 4941 |
| 6 | 1 | 69.1 | 88.6 | 21 / 35 | 4950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 132 | 58% |
| dummy.mini.Scimitar 1.01 | 19 | 89% |
| cf.RiO.RiOx 4.2.1 | 19 | 79% |
| eld.Hmm 1.0 | 10 | 40% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 61 | 62% | 118 |
| dummy.mini.Scimitar 1.01 | 10 | 10% | 44 |
| cf.RiO.RiOx 4.2.1 | 10 | 10% | 20 |
| eld.Hmm 1.0 | 9 | 9% | 17 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 187063 melee ticks, 93655 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 68 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54861 sent, 50471 reached their opponent, 9418 virtual hits (18.7% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 87 over 6 battles (14.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.7 | 105 / 210 | 1.92 | 18.4% | 27766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 18.4% | 105 |
| pe.SandboxDT 2.71m | 1.8 | 16.5% | 61 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 29 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.4% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.2 | 19 / 35 | 4711 |
| 2 | 2 | 68.1 | 88.3 | 12 / 35 | 4573 |
| 3 | 1 | 68.3 | 88.3 | 18 / 35 | 4533 |
| 4 | 1 | 69.6 | 92.4 | 20 / 35 | 4812 |
| 5 | 1 | 68.8 | 88.6 | 18 / 35 | 4554 |
| 6 | 1 | 69.1 | 90.8 | 18 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 44% |
| jlm.javaDisturbance 0.59 | 46 | 85% |
| kvk.HebusLeTroll 0.35 | 37 | 73% |
| bigpete.Stewie 1.0 | 12 | 92% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 47% | 81 |
| kvk.HebusLeTroll 0.35 | 27 | 25% | 46 |
| jlm.javaDisturbance 0.59 | 23 | 21% | 60 |
| bigpete.Stewie 1.0 | 3 | 3% | 14 |
| yk.JahRoslav 1.1 | 2 | 2% | 6 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167257 melee ticks, 59333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54175 sent, 49720 reached their opponent, 8801 virtual hits (17.7% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 6 battles (63.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.1 | 165 / 210 | 1.53 | 20.6% | 31618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 20.6% | 165 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 29 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.3% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.7% | 0 |
| sample.Walls 1.0 | 7.7 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.9 | 22 / 35 | 4930 |
| 2 | 1 | 72.8 | 96.5 | 30 / 35 | 5375 |
| 3 | 1 | 72.0 | 94.0 | 26 / 35 | 5361 |
| 4 | 1 | 72.7 | 96.2 | 29 / 35 | 5706 |
| 5 | 1 | 71.7 | 95.6 | 29 / 35 | 4939 |
| 6 | 1 | 71.9 | 93.3 | 29 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 101 | 88% |
| cre.Karolos 0.32 | 52 | 90% |
| stelo.RamTrackSurfer 1.2 | 11 | 91% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 46% | 91 |
| cre.Karolos 0.32 | 18 | 38% | 69 |
| stelo.AreaTargetingBot 1.1 | 2 | 4% | 11 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 22 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131443 melee ticks, 50535 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 41991 sent, 37532 reached their opponent, 12255 virtual hits (32.7% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 81.0 | 65 / 210 | 2.71 | 15.8% | 20800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 15.8% | 65 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 34 |
| florent.XSeries.X2 0.12 | 3.3 | 13.3% | 32 |
| davidalves.Phoenix 0.54 | 3.7 | 13.1% | 41 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.8% | 23 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.6% | 7 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.6% | 0 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 84.8 | 13 / 35 | 3497 |
| 2 | 1 | 64.1 | 80.3 | 11 / 35 | 3495 |
| 3 | 1 | 65.4 | 83.2 | 16 / 35 | 3430 |
| 4 | 1 | 63.4 | 78.4 | 9 / 35 | 3393 |
| 5 | 1 | 65.3 | 84.4 | 11 / 35 | 3604 |
| 6 | 2 | 61.9 | 74.9 | 5 / 35 | 3381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 32% |
| pedersen.Ugluk 1.1.1 | 23 | 65% |
| davidalves.Phoenix 0.54 | 22 | 36% |
| florent.XSeries.X2 0.12 | 21 | 71% |
| oog.melee.Corsair 1.0 | 10 | 70% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 28% | 56 |
| davidalves.Phoenix 0.54 | 32 | 22% | 42 |
| florent.XSeries.X2 0.12 | 30 | 21% | 47 |
| pedersen.Ugluk 1.1.1 | 27 | 18% | 36 |
| oog.melee.Corsair 1.0 | 7 | 5% | 14 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 140887 melee ticks, 30306 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47003 sent, 42382 reached their opponent, 8273 virtual hits (19.5% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 418 over 6 battles (69.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.1 | 123 / 210 | 2.34 | 17.5% | 21244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.5% | 123 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.9% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 23 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.8% | 11 |
| ds.Oo 2.2 | 5.8 | 9.3% | 10 |
| awesomeness.Elite 1.0 | 7.3 | 7.6% | 7 |
| adt.Ar2 1.1 | 8.2 | 6.9% | 2 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.9% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.9 | 18 / 35 | 3432 |
| 2 | 1 | 66.4 | 83.5 | 20 / 35 | 3760 |
| 3 | 1 | 65.2 | 82.5 | 17 / 35 | 3364 |
| 4 | 1 | 67.7 | 88.9 | 22 / 35 | 3740 |
| 5 | 1 | 67.5 | 88.6 | 25 / 35 | 3514 |
| 6 | 1 | 66.3 | 85.4 | 21 / 35 | 3434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 38 | 87% |
| voidious.micro.BlitzBat 1.05 | 34 | 97% |
| jdw.Hurricane 1.4 | 24 | 79% |
| ds.Oo 2.2 | 19 | 79% |
| gre.svman4.Morfeas 1.4.1 | 12 | 67% |
| awesomeness.Elite 1.0 | 9 | 78% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 27% | 54 |
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 42 |
| jdw.Hurricane 1.4 | 14 | 16% | 24 |
| ds.Oo 2.2 | 8 | 9% | 22 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 26 |
| awesomeness.Elite 1.0 | 6 | 7% | 15 |
| adt.Ar2 1.1 | 5 | 6% | 12 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 11 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 129770 melee ticks, 29367 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46300 sent, 41734 reached their opponent, 7525 virtual hits (18.0% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.6 | 138 / 210 | 1.85 | 19.5% | 32117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.5% | 138 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 30 |
| lrem.Spectre 0.4.4 | 3.5 | 12.9% | 15 |
| shu.nitro.LENIN .T34 | 3.5 | 12.3% | 19 |
| js.PinBall 1.6 | 5.3 | 10.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 23 / 35 | 5297 |
| 2 | 1 | 70.7 | 91.7 | 25 / 35 | 5661 |
| 3 | 1 | 70.7 | 92.1 | 25 / 35 | 5279 |
| 4 | 1 | 69.9 | 89.8 | 23 / 35 | 5279 |
| 5 | 1 | 69.1 | 87.9 | 20 / 35 | 5239 |
| 6 | 1 | 70.4 | 93.3 | 22 / 35 | 5362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 81% |
| lrem.Spectre 0.4.4 | 45 | 82% |
| shu.nitro.LENIN .T34 | 36 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| js.PinBall 1.6 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |

Hadur died in 72 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.Spectre 0.4.4 | 21 | 29% | 58 |
| ak.Fermat 2.0 | 21 | 29% | 56 |
| shu.nitro.LENIN .T34 | 13 | 18% | 48 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 8% | 18 |
| js.PinBall 1.6 | 6 | 8% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 6% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 206 rounds): 163112 melee ticks, 46466 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 19 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 19 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54009 sent, 49393 reached their opponent, 13023 virtual hits (26.4% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 295 over 6 battles (49.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.6 | 154 / 210 | 2.12 | 19.2% | 28438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.2 | 19.2% | 154 |
| mk.Alpha 0.2.1 | 2.3 | 13.3% | 30 |
| EH.Eagle 1.0.6 | 3.0 | 11.6% | 6 |
| wee.Gem 1.8.4 | 4.5 | 10.0% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.5% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.2% | 5 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.3% | 3 |
| joe.ADinosaur 1.0 | 7.5 | 8.1% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 56.2 | 12 / 35 | 4572 |
| 2 | 1 | 70.4 | 95.6 | 29 / 35 | 4638 |
| 3 | 1 | 70.9 | 96.2 | 29 / 35 | 4865 |
| 4 | 1 | 69.3 | 90.2 | 27 / 35 | 4726 |
| 5 | 1 | 70.3 | 92.4 | 29 / 35 | 5080 |
| 6 | 1 | 70.0 | 94.9 | 28 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 85% |
| EH.Eagle 1.0.6 | 46 | 93% |
| wee.Gem 1.8.4 | 16 | 88% |
| throxbot.ThroxBot 0.1 | 15 | 80% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| joe.ADinosaur 1.0 | 5 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 29% | 77 |
| cs.Grudge 1.0 | 11 | 19% | 11 |
| wee.Gem 1.8.4 | 7 | 12% | 22 |
| EH.Eagle 1.0.6 | 6 | 10% | 45 |
| throxbot.ThroxBot 0.1 | 5 | 9% | 12 |
| joe.ADinosaur 1.0 | 5 | 9% | 12 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 12 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 137343 melee ticks, 37547 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 46 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45319 sent, 40788 reached their opponent, 10858 virtual hits (26.6% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 368 over 6 battles (61.3 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 88.7 | 122 / 210 | 2.01 | 17.8% | 21417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.8% | 122 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 37 |
| uji.Antique 1.0 | 3.3 | 11.9% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.6% | 11 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.5% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.2% | 6 |
| matt.advanced.Katana 1.0 | 8.8 | 6.0% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 5.7% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 93.3 | 26 / 35 | 3694 |
| 2 | 1 | 63.6 | 80.0 | 16 / 35 | 3134 |
| 3 | 1 | 66.9 | 88.3 | 19 / 35 | 3673 |
| 4 | 1 | 69.2 | 94.3 | 25 / 35 | 3994 |
| 5 | 1 | 66.6 | 88.3 | 22 / 35 | 3289 |
| 6 | 1 | 66.3 | 88.3 | 14 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 77 | 73% |
| uji.Antique 1.0 | 42 | 74% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 31 | 34% | 56 |
| uji.Antique 1.0 | 18 | 20% | 52 |
| pfvicm.Sobieski 7.2.3b | 15 | 16% | 26 |
| qohnil.blot.BlotBot 3.61 | 9 | 10% | 27 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 16 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 13 |
| stelo.Lifestealer 1.0 | 3 | 3% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 132520 melee ticks, 40452 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44917 sent, 40443 reached their opponent, 6256 virtual hits (15.5% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 486 over 6 battles (81.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.5 | 96 / 210 | 2.30 | 18.0% | 25205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.0% | 96 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.7% | 54 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 43 |
| myl.micro.Troodon 1.10 | 4.0 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.8% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.7% | 2 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 16 / 35 | 4308 |
| 2 | 1 | 66.8 | 83.8 | 15 / 35 | 3981 |
| 3 | 1 | 67.8 | 85.4 | 15 / 35 | 4120 |
| 4 | 1 | 68.3 | 87.0 | 17 / 35 | 4281 |
| 5 | 1 | 67.5 | 85.7 | 18 / 35 | 3907 |
| 6 | 1 | 67.8 | 83.5 | 15 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 55% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 10 | 60% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 36% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 42 | 35% | 69 |
| myl.micro.Troodon 1.10 | 15 | 12% | 32 |
| jok.PheonixM 0.1.2 | 15 | 12% | 19 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 171499 melee ticks, 53337 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 55762 sent, 51281 reached their opponent, 8468 virtual hits (16.5% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 716 over 6 battles (119.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.9 | 37 / 210 | 3.17 | 14.5% | 20432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.3 | 14.5% | 37 |
| catcat20.Matcha 0.006 | 3.0 | 13.4% | 46 |
| darkcanuck.B26354 1.06 | 3.2 | 13.3% | 46 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 35 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.5% | 23 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.6% | 13 |
| tripphippy.Alice 1.1 | 8.0 | 6.9% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.4% | 7 |
| ntc.Opposite 1.5 | 8.0 | 6.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 74.3 | 3 / 35 | 3290 |
| 2 | 2 | 60.6 | 70.5 | 7 / 35 | 3348 |
| 3 | 1 | 63.1 | 76.8 | 8 / 35 | 3735 |
| 4 | 1 | 62.0 | 77.8 | 6 / 35 | 3194 |
| 5 | 1 | 62.0 | 76.2 | 5 / 35 | 3427 |
| 6 | 1 | 63.4 | 80.0 | 8 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 31% |
| oog.melee.Capulet 1.2 | 23 | 39% |
| darkcanuck.B26354 1.06 | 17 | 41% |
| stelo.PastFuture 2.3.2 | 16 | 38% |
| intruder.PrairieWolf 2.61 | 5 | 0% |
| tripphippy.Alice 1.1 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 22% | 52 |
| oog.melee.Capulet 1.2 | 36 | 20% | 42 |
| darkcanuck.B26354 1.06 | 35 | 20% | 45 |
| stelo.PastFuture 2.3.2 | 32 | 18% | 38 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 9 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 10 |
| tripphippy.Alice 1.1 | 8 | 4% | 11 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 167496 melee ticks, 27084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 122 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 122 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 54349 sent, 49721 reached their opponent, 8454 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 710 over 6 battles (118.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 79.0 | 57 / 210 | 2.89 | 15.1% | 18747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 85 |
| hadur2.Hadur 3.17.1ef | 2.3 | 15.1% | 57 |
| gh.mini.Griezel 0.2 | 2.8 | 13.6% | 47 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.4% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.2% | 4 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.0% | 3 |
| fm.mammillarias 1.3 | 8.7 | 5.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.8 | 13 / 35 | 3170 |
| 2 | 3 | 60.5 | 70.5 | 6 / 35 | 2995 |
| 3 | 2 | 63.5 | 82.5 | 10 / 35 | 2843 |
| 4 | 3 | 62.4 | 77.1 | 8 / 35 | 3069 |
| 5 | 2 | 65.0 | 82.5 | 13 / 35 | 3420 |
| 6 | 2 | 62.2 | 76.8 | 7 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 49% |
| gh.mini.Griezel 0.2 | 29 | 41% |
| d414.nano.Quantum 1.0.0 | 12 | 67% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 65 | 41% | 88 |
| gh.mini.Griezel 0.2 | 38 | 24% | 50 |
| d414.nano.Quantum 1.0.0 | 22 | 14% | 29 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 23 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 7 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 6 |
| fm.mammillarias 1.3 | 3 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162656 melee ticks, 33183 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 52705 sent, 47996 reached their opponent, 7943 virtual hits (16.5% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 701 over 6 battles (116.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 86.4 | 109 / 210 | 2.22 | 17.2% | 22874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.2% | 109 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 58 |
| apc.botM 3.0 | 3.2 | 11.9% | 17 |
| lxx.ConceptA 0.8 | 4.3 | 10.7% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 10.4% | 7 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.3% | 0 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 7 |
| conscience.Electron 1.3g | 8.7 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 4.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 86.3 | 19 / 35 | 3582 |
| 2 | 1 | 65.5 | 85.4 | 17 / 35 | 3699 |
| 3 | 1 | 65.5 | 83.2 | 17 / 35 | 3731 |
| 4 | 1 | 65.4 | 84.8 | 15 / 35 | 3831 |
| 5 | 1 | 68.2 | 92.7 | 23 / 35 | 4036 |
| 6 | 1 | 66.4 | 86.0 | 18 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 53% |
| apc.botM 3.0 | 29 | 76% |
| lxx.ConceptA 0.8 | 15 | 87% |
| vjik.UnViolation 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 6 | 100% |
| yk.JahMicro 1.0 | 5 | 80% |

Hadur died in 108 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 53 | 49% | 96 |
| lxx.ConceptA 0.8 | 16 | 15% | 24 |
| apc.botM 3.0 | 14 | 13% | 38 |
| bayen.UbaMicro 1.4 | 10 | 9% | 18 |
| vjik.UnViolation 1.1 | 5 | 5% | 22 |
| panzer.Panzer 0.2 | 1 | 1% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |
| conscience.Electron 1.3g | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 126305 melee ticks, 46141 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43672 sent, 39124 reached their opponent, 7475 virtual hits (19.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 425 over 6 battles (70.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.1 | 107 / 210 | 2.43 | 17.8% | 25952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.8% | 107 |
| maribo.Quester 0.3 | 2.2 | 15.3% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 20 |
| labg.Cataclysm 2.05 | 4.2 | 11.3% | 18 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.6% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.8% | 11 |
| baal.nano.N 1.42 | 6.7 | 8.2% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.3% | 0 |
| sanja.First 0.1 | 8.7 | 5.3% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.4 | 15 / 35 | 4184 |
| 2 | 1 | 67.6 | 85.7 | 18 / 35 | 4195 |
| 3 | 1 | 67.4 | 84.1 | 19 / 35 | 4247 |
| 4 | 1 | 67.5 | 83.5 | 17 / 35 | 4463 |
| 5 | 1 | 66.8 | 81.6 | 17 / 35 | 4319 |
| 6 | 1 | 69.4 | 90.2 | 21 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 54 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 75% |
| gre.svman4.Leonidas 1.3.2 | 26 | 81% |
| labg.Cataclysm 2.05 | 21 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 25% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 28% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 19% | 49 |
| gre.svman4.Leonidas 1.3.2 | 19 | 18% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 13% | 18 |
| labg.Cataclysm 2.05 | 13 | 12% | 31 |
| baal.nano.N 1.42 | 3 | 3% | 4 |
| zyx.micro.Ant 1.1 | 2 | 2% | 2 |
| sanja.First 0.1 | 1 | 1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 172960 melee ticks, 50513 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 86 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55595 sent, 51163 reached their opponent, 8232 virtual hits (16.1% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 378 over 6 battles (63.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.1 | 72 / 210 | 2.43 | 16.8% | 25774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.8 | 16.8% | 72 |
| stelo.Spread 0.9 | 1.8 | 16.5% | 71 |
| kid.Gladiator .7.2 | 2.3 | 16.5% | 42 |
| jcs.Seth 1.8 | 4.5 | 11.4% | 17 |
| tcf.Reach 3 | 4.8 | 10.8% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.3 | 16 / 35 | 4189 |
| 2 | 1 | 67.7 | 86.3 | 12 / 35 | 4433 |
| 3 | 1 | 66.6 | 83.2 | 13 / 35 | 4511 |
| 4 | 3 | 66.8 | 85.4 | 10 / 35 | 4063 |
| 5 | 3 | 65.5 | 77.8 | 11 / 35 | 4205 |
| 6 | 2 | 67.0 | 83.5 | 10 / 35 | 4373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 51 | 53% |
| stelo.Spread 0.9 | 44 | 43% |
| jcs.Seth 1.8 | 20 | 60% |
| tcf.Reach 3 | 12 | 75% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 40% | 80 |
| stelo.Spread 0.9 | 46 | 33% | 70 |
| jcs.Seth 1.8 | 14 | 10% | 25 |
| tcf.Reach 3 | 10 | 7% | 18 |
| ratosh.Wesco 1.4 | 6 | 4% | 7 |
| cli.Dancer 1.1 | 3 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 174368 melee ticks, 53262 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54818 sent, 50253 reached their opponent, 8703 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 517 over 6 battles (86.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.4 | 41 / 210 | 2.67 | 15.4% | 20168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 146 |
| hadur2.Hadur 3.17.1ef | 2.0 | 15.4% | 41 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.1% | 4 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 79.4 | 4 / 35 | 3054 |
| 2 | 2 | 64.4 | 81.6 | 10 / 35 | 3413 |
| 3 | 2 | 62.4 | 75.9 | 3 / 35 | 3323 |
| 4 | 2 | 64.6 | 81.9 | 11 / 35 | 3404 |
| 5 | 2 | 65.1 | 84.8 | 6 / 35 | 3644 |
| 6 | 2 | 64.9 | 85.1 | 7 / 35 | 3330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 90 | 12% |
| gh.mini.Gruwel 0.9 | 16 | 63% |
| rz.HawkOnFire 0.1 | 12 | 75% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 89% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 60% | 120 |
| gh.mini.Gruwel 0.9 | 23 | 13% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 10% | 23 |
| rz.HawkOnFire 0.1 | 18 | 10% | 22 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |
| wit.Chuliath 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 144995 melee ticks, 52941 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 46157 sent, 41564 reached their opponent, 6982 virtual hits (16.8% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.3 | 152 / 210 | 1.79 | 19.8% | 28374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.8% | 152 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 13 |
| bzdp.Pansy 2.1 | 2.7 | 12.5% | 11 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 14 |
| mz.Cork 0.1 | 5.0 | 10.5% | 8 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.8% | 4 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.1% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.3% | 2 |
| dl.BetterWalls 1.0 | 8.8 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 27 / 35 | 4970 |
| 2 | 1 | 70.3 | 94.0 | 28 / 35 | 4648 |
| 3 | 1 | 70.2 | 91.1 | 27 / 35 | 4925 |
| 4 | 1 | 69.6 | 91.4 | 25 / 35 | 4564 |
| 5 | 1 | 68.8 | 89.8 | 23 / 35 | 4449 |
| 6 | 1 | 68.8 | 87.9 | 22 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 98% |
| mz.Cork 0.1 | 33 | 88% |
| alpha.RainingFire 1.0 | 31 | 90% |
| bvh.micro.Freya 0.3 | 27 | 70% |
| m3thos.Eva02 0.7.1 | 18 | 89% |
| bvh.mini.Fenrir 0.39 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 15 | 25% | 22 |
| alpha.RainingFire 1.0 | 11 | 19% | 39 |
| m3thos.Eva02 0.7.1 | 8 | 14% | 22 |
| bzdp.Pansy 2.1 | 7 | 12% | 49 |
| mz.Cork 0.1 | 7 | 12% | 43 |
| bvh.mini.Fenrir 0.39 | 5 | 8% | 16 |
| dl.BetterWalls 1.0 | 2 | 3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150432 melee ticks, 43995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52375 sent, 47949 reached their opponent, 10641 virtual hits (22.2% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 247 over 6 battles (41.2 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.2 | 150 / 210 | 2.15 | 18.6% | 30636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 18.6% | 150 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.2 | 11.6% | 19 |
| germ.TheMind .2 | 3.3 | 10.2% | 5 |
| EBBU.Sim2 1.02 | 4.2 | 9.8% | 9 |
| agrach.Dalek 1.0 | 6.3 | 8.8% | 8 |
| lmk.ACPFinal 0.1 | 6.7 | 8.5% | 4 |
| mb.Beast 0.1 | 7.0 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.4% | 0 |
| skm.Ryubot 1.0 | 9.3 | 7.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 91.4 | 28 / 35 | 5153 |
| 2 | 1 | 68.7 | 91.1 | 25 / 35 | 5384 |
| 3 | 1 | 66.7 | 84.1 | 25 / 35 | 4975 |
| 4 | 1 | 66.2 | 82.9 | 22 / 35 | 5233 |
| 5 | 1 | 68.9 | 93.3 | 28 / 35 | 5013 |
| 6 | 1 | 65.3 | 80.6 | 22 / 35 | 4878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 71% |
| germ.TheMind .2 | 27 | 96% |
| agrach.Dalek 1.0 | 22 | 100% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| EBBU.Sim2 1.02 | 17 | 100% |
| mb.Beast 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 16 | 88% |
| stelo.UntouchableNano 1.3 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 16 | 26% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 24% | 44 |
| lmk.ACPFinal 0.1 | 9 | 15% | 20 |
| agrach.Dalek 1.0 | 7 | 11% | 36 |
| stelo.UntouchableNano 1.3 | 6 | 10% | 22 |
| germ.TheMind .2 | 4 | 6% | 19 |
| skm.Ryubot 1.0 | 2 | 3% | 4 |
| mb.Beast 0.1 | 1 | 2% | 23 |
| EBBU.Sim2 1.02 | 1 | 2% | 17 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 96396 melee ticks, 24419 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 35 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 33172 sent, 29067 reached their opponent, 9194 virtual hits (31.6% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 6 battles (52.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.0 | 84 / 210 | 2.53 | 16.5% | 23129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.4% | 79 |
| hadur2.Hadur 3.17.1ef | 1.5 | 16.5% | 84 |
| bvh.mini.Freya 0.55 | 3.0 | 13.3% | 14 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.0% | 15 |
| cs.Wren 1.0 | 5.0 | 10.7% | 5 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.6% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.6% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 83.8 | 10 / 35 | 3831 |
| 2 | 1 | 66.2 | 84.4 | 16 / 35 | 3999 |
| 3 | 2 | 64.3 | 78.4 | 13 / 35 | 3685 |
| 4 | 1 | 67.7 | 88.6 | 17 / 35 | 4141 |
| 5 | 1 | 64.9 | 82.2 | 13 / 35 | 3739 |
| 6 | 2 | 65.2 | 80.6 | 15 / 35 | 3734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 60 | 53% |
| bvh.mini.Freya 0.55 | 26 | 69% |
| bts.mega.Gnarly 1.4 | 16 | 63% |
| cs.Wren 1.0 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 8 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 51 | 40% | 85 |
| bvh.mini.Freya 0.55 | 34 | 27% | 44 |
| kdf.KoulDestroyer 1.0 | 15 | 12% | 17 |
| bts.mega.Gnarly 1.4 | 10 | 8% | 24 |
| cs.Wren 1.0 | 8 | 6% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 143695 melee ticks, 33857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47263 sent, 42595 reached their opponent, 9489 virtual hits (22.3% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 753 over 6 battles (125.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.4 | 96 / 210 | 2.14 | 17.7% | 26552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.7% | 96 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 22 |
| az.Ololobot 0.2.4 | 3.2 | 12.5% | 54 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 30 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 6.0 | 8.3% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.7% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.4% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 86.0 | 13 / 35 | 4081 |
| 2 | 1 | 66.9 | 87.9 | 18 / 35 | 4318 |
| 3 | 1 | 66.5 | 85.4 | 13 / 35 | 4643 |
| 4 | 1 | 67.9 | 88.9 | 18 / 35 | 4710 |
| 5 | 1 | 66.3 | 84.8 | 16 / 35 | 4260 |
| 6 | 1 | 68.0 | 91.1 | 18 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 52 | 83% |
| az.Ololobot 0.2.4 | 48 | 46% |
| catcat20.Lambda 0.024 | 31 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 86% |
| gimp.GimpBot 0.1 | 6 | 67% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 29% | 60 |
| bvh.fry.Freya 0.82 | 32 | 26% | 71 |
| catcat20.Lambda 0.024 | 29 | 24% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 5% | 12 |
| gimp.GimpBot 0.1 | 5 | 4% | 10 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170235 melee ticks, 53096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 61 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54287 sent, 49703 reached their opponent, 9482 virtual hits (19.1% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 555 over 6 battles (92.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.2 | 117 / 210 | 2.33 | 17.9% | 24959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.9% | 117 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.4% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.8% | 20 |
| mz.AntiGrav 1.0 | 4.3 | 11.4% | 13 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.6% | 14 |
| alpha.BlackIce 1.0 | 6.3 | 8.5% | 2 |
| stelo.Randomness 1.0 | 6.7 | 8.5% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.8% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.4% | 0 |
| sample.Corners 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 19 / 35 | 3875 |
| 2 | 1 | 66.5 | 81.9 | 16 / 35 | 4144 |
| 3 | 1 | 68.9 | 88.3 | 21 / 35 | 4536 |
| 4 | 1 | 67.3 | 84.8 | 18 / 35 | 4171 |
| 5 | 1 | 69.3 | 88.9 | 26 / 35 | 4289 |
| 6 | 1 | 66.5 | 84.4 | 17 / 35 | 3944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 53 | 81% |
| kano.gamma.KanoGamma 1.8 | 37 | 81% |
| mz.AntiGrav 1.0 | 21 | 95% |
| Polkwane.SmashMelee 1.0 | 10 | 80% |
| alpha.BlackIce 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 27% | 56 |
| kano.gamma.KanoGamma 1.8 | 22 | 22% | 55 |
| mz.AntiGrav 1.0 | 15 | 15% | 34 |
| Polkwane.SmashMelee 1.0 | 14 | 14% | 25 |
| stelo.Randomness 1.0 | 8 | 8% | 18 |
| alpha.BlackIce 1.0 | 5 | 5% | 10 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 7 |
| sample.Corners 1.0 | 0 | 0% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 152648 melee ticks, 35739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 73 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51345 sent, 46662 reached their opponent, 10261 virtual hits (22.0% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 101). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.4 | 109 / 210 | 2.05 | 17.8% | 23608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 17.8% | 109 |
| eem.EvBotNG v12.8 | 2.2 | 15.2% | 64 |
| ary.Swarm 1.1 | 3.2 | 13.0% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.1% | 9 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 11 |
| shrub.Silver v048 | 6.0 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 83.8 | 15 / 35 | 3527 |
| 2 | 1 | 67.4 | 87.0 | 16 / 35 | 4104 |
| 3 | 1 | 69.1 | 91.1 | 24 / 35 | 4177 |
| 4 | 1 | 68.3 | 89.2 | 19 / 35 | 4182 |
| 5 | 1 | 66.8 | 87.9 | 15 / 35 | 3764 |
| 6 | 1 | 68.6 | 91.1 | 20 / 35 | 3854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 49% |
| lessonz.robocode.Oz 0.5.0 | 29 | 93% |
| ary.Swarm 1.1 | 24 | 75% |
| simonton.nano.MeleeSeed 1.8 | 20 | 85% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 4 | 75% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 54% | 88 |
| ary.Swarm 1.1 | 21 | 21% | 45 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 33 |
| simonton.nano.MeleeSeed 1.8 | 7 | 7% | 21 |
| shrub.Silver v048 | 4 | 4% | 9 |
| zyx.nano.Ant 1.1 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| stelo.Mirror 1.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154440 melee ticks, 45767 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51726 sent, 47203 reached their opponent, 7732 virtual hits (16.4% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 596 over 6 battles (99.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.8 | 127 / 210 | 1.82 | 19.3% | 30728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.3% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 16.3% | 48 |
| ara.Shera 0.88 | 3.5 | 13.1% | 20 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.2% | 12 |
| amz.NanoClone 1.41 | 5.2 | 8.4% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 6.7% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.6% | 1 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 20 / 35 | 5368 |
| 2 | 1 | 69.8 | 90.5 | 22 / 35 | 5171 |
| 3 | 1 | 69.5 | 91.4 | 22 / 35 | 5006 |
| 4 | 1 | 69.7 | 91.7 | 24 / 35 | 5041 |
| 5 | 1 | 69.3 | 90.5 | 20 / 35 | 4997 |
| 6 | 1 | 68.9 | 90.8 | 19 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 78% |
| maribo.mini.MiniQuester 0.1 | 33 | 88% |
| ara.Shera 0.88 | 22 | 64% |
| dsw.StaticD 1.0 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 41% | 100 |
| ara.Shera 0.88 | 24 | 27% | 40 |
| maribo.mini.MiniQuester 0.1 | 14 | 16% | 54 |
| amz.NanoClone 1.41 | 6 | 7% | 8 |
| dsw.StaticD 1.0 | 2 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 173910 melee ticks, 48264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 25 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54931 sent, 50467 reached their opponent, 10509 virtual hits (20.8% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 717 over 6 battles (119.5 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.1 | 35 / 210 | 3.06 | 14.5% | 19453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 132 |
| hadur2.Hadur 3.17.1ef | 2.0 | 14.5% | 35 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 32 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.9% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.6% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 73.7 | 7 / 35 | 2977 |
| 2 | 2 | 63.0 | 73.7 | 6 / 35 | 3406 |
| 3 | 2 | 62.8 | 75.9 | 6 / 35 | 2844 |
| 4 | 2 | 64.1 | 77.8 | 5 / 35 | 3293 |
| 5 | 2 | 65.0 | 82.5 | 6 / 35 | 3358 |
| 6 | 2 | 64.3 | 79.0 | 5 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 18% |
| brainfade.melee.Dusk 0.44 | 20 | 45% |
| wcsv.melee.EngineerMelee 0.1 | 9 | 78% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 85 | 46% | 98 |
| brainfade.melee.Dusk 0.44 | 36 | 20% | 44 |
| dummy.micro.Sparrow 2.5 | 27 | 15% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 18 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 10 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159835 melee ticks, 39474 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 65 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51660 sent, 46962 reached their opponent, 8142 virtual hits (17.3% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.0 | 126 / 210 | 2.08 | 19.1% | 30299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.1% | 126 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 51 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 23 |
| jwirde.Gort 2.0 | 4.3 | 9.6% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.6% | 3 |
| disan.Chair 2.2.0 | 6.2 | 8.4% | 2 |
| wompi.Quokka 1.6 | 6.8 | 7.8% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 20 / 35 | 5127 |
| 2 | 1 | 69.1 | 89.2 | 20 / 35 | 5063 |
| 3 | 1 | 67.2 | 82.5 | 16 / 35 | 4602 |
| 4 | 1 | 69.1 | 87.6 | 21 / 35 | 5221 |
| 5 | 1 | 71.5 | 95.9 | 28 / 35 | 5113 |
| 6 | 1 | 68.9 | 86.0 | 21 / 35 | 5173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 64% |
| tzu.TheArtOfWar 1.2 | 54 | 83% |
| jwirde.Gort 2.0 | 15 | 100% |
| disan.Chair 2.2.0 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 75% |
| sample.Crazy 1.0 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 52% | 104 |
| tzu.TheArtOfWar 1.2 | 16 | 19% | 49 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 9% | 12 |
| jwirde.Gort 2.0 | 6 | 7% | 25 |
| wompi.Quokka 1.6 | 4 | 5% | 6 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 3 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 153481 melee ticks, 44113 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54158 sent, 49769 reached their opponent, 11086 virtual hits (22.3% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.1 | 95 / 210 | 2.07 | 19.0% | 30056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ef | 1.0 | 19.0% | 95 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.8% | 91 |
| jje.BagPuss 1.2 | 2.7 | 12.5% | 9 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 8 |
| myl.nano.Graviton 1.10 | 4.7 | 10.3% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 1 |
| fm.claire 1.7 | 6.8 | 8.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.1% | 2 |
| wit.Deep7 2.0 | 9.3 | 5.3% | 3 |
| abud.ThirdRobo 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.6 | 17 / 35 | 4568 |
| 2 | 1 | 67.6 | 85.7 | 11 / 35 | 5029 |
| 3 | 1 | 68.7 | 88.3 | 17 / 35 | 4905 |
| 4 | 1 | 68.5 | 89.2 | 14 / 35 | 5116 |
| 5 | 1 | 69.1 | 89.5 | 19 / 35 | 4914 |
| 6 | 1 | 69.3 | 87.6 | 17 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 44% |
| jje.BagPuss 1.2 | 19 | 79% |
| sul.Lunar 1.1 | 18 | 83% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| wit.Deep7 2.0 | 8 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| hvilela.HVilela 0.9 | 3 | 67% |

Hadur died in 116 of 210 rounds, at a mean tick of 1621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 52 | 45% | 0 |
| jje.BagPuss 1.2 | 17 | 15% | 66 |
| sul.Lunar 1.1 | 17 | 15% | 55 |
| myl.nano.Graviton 1.10 | 12 | 10% | 37 |
| fm.claire 1.7 | 8 | 7% | 17 |
| hvilela.HVilela 0.9 | 4 | 3% | 13 |
| wit.Deep7 2.0 | 3 | 3% | 7 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 13 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 208809 melee ticks, 88617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 63524 sent, 59064 reached their opponent, 9341 virtual hits (15.8% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1ef against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 615 over 6 battles (102.5 per battle, most in one battle 224). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 82.6 | 61 / 210 | 2.57 | 15.9% | 22669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.0% | 54 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.5% | 81 |
| hadur2.Hadur 3.17.1ef | 2.7 | 15.9% | 61 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 3 |
| cx.Princess 1.0 | 4.8 | 10.2% | 10 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 84.4 | 9 / 35 | 3851 |
| 2 | 3 | 65.8 | 83.5 | 9 / 35 | 3887 |
| 3 | 1 | 66.2 | 84.1 | 15 / 35 | 3953 |
| 4 | 3 | 64.9 | 84.1 | 11 / 35 | 3447 |
| 5 | 3 | 63.2 | 77.8 | 8 / 35 | 3646 |
| 6 | 3 | 64.7 | 81.6 | 9 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 66% |
| rsalesc.melee.Medina 0.4.5 | 42 | 19% |
| mz.MicroSheep 1.0 | 10 | 90% |
| cx.Princess 1.0 | 3 | 33% |

Hadur died in 154 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 42% | 103 |
| rsalesc.melee.Medina 0.4.5 | 54 | 35% | 67 |
| mz.MicroSheep 1.0 | 9 | 6% | 15 |
| cx.Princess 1.0 | 7 | 5% | 7 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 6 |
| sadoner.killer 0.2 | 4 | 3% | 6 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162178 melee ticks, 42070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 31 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47197 sent, 42590 reached their opponent, 6970 virtual hits (16.4% of those reached).

