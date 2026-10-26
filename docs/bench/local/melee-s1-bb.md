# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 115 over 6 battles (19.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 84.6 | 48 / 210 | 2.39 | 16.4% | 26607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 143 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.4% | 48 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 9 |
| mz.MicroGodMelee 1 | 4.5 | 10.5% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.8% | 3 |
| lorneswork.Predator 1.0 | 5.3 | 10.2% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 87.9 | 9 / 35 | 4152 |
| 2 | 2 | 66.4 | 85.7 | 8 / 35 | 4742 |
| 3 | 2 | 65.5 | 83.5 | 8 / 35 | 4378 |
| 4 | 2 | 65.3 | 81.3 | 8 / 35 | 4444 |
| 5 | 2 | 65.4 | 82.9 | 8 / 35 | 4411 |
| 6 | 2 | 66.0 | 86.3 | 7 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 9% |
| mz.MicroGodMelee 1 | 17 | 82% |
| sgp.JollyNinja 3.53 | 15 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 72% | 131 |
| sgp.JollyNinja 3.53 | 18 | 11% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 16 |
| mz.MicroGodMelee 1 | 7 | 4% | 19 |
| lorneswork.Predator 1.0 | 7 | 4% | 13 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |

Posture (Hadur's M records, 204 rounds): 143383 melee ticks, 84534 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 59 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46570 sent, 42072 reached their opponent, 9100 virtual hits (21.6% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 6 battles (21.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.3 | 73 / 210 | 2.78 | 16.3% | 23884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 16.3% | 73 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.0% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.7% | 17 |
| Noran.BitchingElk 0.054 | 6.5 | 8.6% | 16 |
| sch.Simone 0.3d | 7.3 | 7.6% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.8% | 0 |
| stelo.PatternRobot 1.0 | 8.7 | 6.3% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 77.8 | 14 / 35 | 4035 |
| 2 | 1 | 62.4 | 74.6 | 12 / 35 | 3542 |
| 3 | 1 | 66.6 | 84.4 | 15 / 35 | 4246 |
| 4 | 1 | 65.9 | 84.4 | 10 / 35 | 4236 |
| 5 | 2 | 63.4 | 76.2 | 11 / 35 | 3550 |
| 6 | 1 | 66.1 | 84.1 | 11 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 53% |
| pulsar.PulsarMax 0.8.9 | 36 | 42% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 46% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| sch.Simone 0.3d | 8 | 63% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 32% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 27% | 61 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 12% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 9% | 18 |
| Noran.BitchingElk 0.054 | 11 | 8% | 17 |
| sch.Simone 0.3d | 7 | 5% | 12 |
| stelo.PatternRobot 1.0 | 5 | 4% | 7 |
| fullsail.SweetTea 1.1 | 4 | 3% | 5 |
| fnc.bandit.Bandit 5.2.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 202 rounds): 171266 melee ticks, 36324 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 60630 sent, 56217 reached their opponent, 10320 virtual hits (18.4% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.3 | 152 / 210 | 1.97 | 19.3% | 33254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.3% | 152 |
| radnor.DoctorBob 1.42 | 2.0 | 14.9% | 32 |
| vuen.Cake 2.51 | 3.3 | 12.3% | 11 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.8% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.1 | 26 / 35 | 5594 |
| 2 | 1 | 70.2 | 93.7 | 26 / 35 | 5597 |
| 3 | 1 | 69.7 | 90.5 | 26 / 35 | 5463 |
| 4 | 1 | 68.9 | 84.8 | 23 / 35 | 5851 |
| 5 | 1 | 67.9 | 85.1 | 22 / 35 | 5265 |
| 6 | 1 | 69.2 | 89.5 | 29 / 35 | 5484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 62 | 90% |
| vuen.Cake 2.51 | 52 | 87% |
| kawigi.nano.Lib 1.0 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 50% |

Hadur died in 58 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 40% | 69 |
| vuen.Cake 2.51 | 10 | 17% | 62 |
| kawigi.nano.Lib 1.0 | 9 | 16% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 10% | 7 |
| urdos.URDOS 1.3 | 4 | 7% | 8 |
| adt.Ar1 2.1 | 4 | 7% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 126856 melee ticks, 37695 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 73 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 39537 sent, 35374 reached their opponent, 9611 virtual hits (27.2% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 6 battles (79.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.7 | 30 / 210 | 2.38 | 16.7% | 28901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 158 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.7% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 10 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 2 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 87.0 | 3 / 35 | 4590 |
| 2 | 2 | 66.9 | 85.1 | 6 / 35 | 4580 |
| 3 | 2 | 67.0 | 84.8 | 8 / 35 | 4868 |
| 4 | 2 | 66.0 | 82.5 | 1 / 35 | 4939 |
| 5 | 2 | 66.4 | 82.9 | 3 / 35 | 4834 |
| 6 | 2 | 67.8 | 85.7 | 9 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 123 | 11% |
| apc.LeeroyJenkins2 1.0 | 11 | 82% |
| TNT.TNT 0.99.1 | 9 | 44% |
| spin.Bugstard 0.012b | 3 | 33% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 184 of 210 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 75% | 153 |
| TNT.TNT 0.99.1 | 16 | 9% | 20 |
| apc.LeeroyJenkins2 1.0 | 12 | 7% | 21 |
| josago.Jorgito 0.16 | 9 | 5% | 10 |
| tj.zombie1n 1.0.1 | 2 | 1% | 3 |
| spin.Bugstard 0.012b | 2 | 1% | 0 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| css.Delitioner 0.11 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 201795 melee ticks, 67444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 62497 sent, 57955 reached their opponent, 9109 virtual hits (15.7% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 485 over 6 battles (80.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.7 | 18 / 210 | 3.28 | 13.7% | 18793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.8% | 116 |
| justin.DemonicRage 3.4 | 1.7 | 17.8% | 67 |
| hadur2.Hadur 3.17.1bb | 3.0 | 13.7% | 18 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 7 |
| ms.Ares 0.19 | 5.2 | 9.3% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 79.0 | 5 / 35 | 2991 |
| 2 | 3 | 60.5 | 71.1 | 2 / 35 | 3084 |
| 3 | 3 | 61.5 | 74.9 | 3 / 35 | 2996 |
| 4 | 3 | 61.8 | 74.0 | 2 / 35 | 3157 |
| 5 | 3 | 62.0 | 73.3 | 3 / 35 | 3397 |
| 6 | 3 | 61.6 | 75.9 | 3 / 35 | 3168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 35 | 31% |
| cb.fire.Firestarter 2.0f | 33 | 6% |
| wompi.Numbat 2.1 | 8 | 63% |

Hadur died in 196 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 74 | 38% | 78 |
| justin.DemonicRage 3.4 | 72 | 37% | 80 |
| wompi.Numbat 2.1 | 24 | 12% | 28 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| axeBots.HataMoto 3.09 | 7 | 4% | 8 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 152800 melee ticks, 27117 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 48 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48040 sent, 43401 reached their opponent, 7575 virtual hits (17.5% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 397 over 6 battles (66.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.0 | 113 / 210 | 2.17 | 18.3% | 27996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.3% | 113 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 30 |
| origin.SleepSiphon 1.7b | 3.5 | 13.2% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 13.2% | 27 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.5% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.1% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 6.1% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.7% | 1 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.5 | 16 / 35 | 4715 |
| 2 | 1 | 66.7 | 84.1 | 15 / 35 | 4285 |
| 3 | 1 | 68.8 | 87.6 | 20 / 35 | 4883 |
| 4 | 1 | 68.8 | 89.5 | 21 / 35 | 4650 |
| 5 | 1 | 70.3 | 92.7 | 23 / 35 | 5095 |
| 6 | 1 | 67.6 | 85.4 | 18 / 35 | 4368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 81% |
| origin.SleepSiphon 1.7b | 39 | 82% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 81% |
| gg.Wolverine 2.0 | 12 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 33% |
| mld.Wisdom 1.0 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 0% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 30 | 30% | 63 |
| jekl.StoneGhost 0.7 | 25 | 25% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 18% | 51 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 10% | 14 |
| gg.Wolverine 2.0 | 5 | 5% | 11 |
| mld.Wisdom 1.0 | 5 | 5% | 10 |
| spinnercat.Omen 1.0 | 3 | 3% | 3 |
| DBall.NUKE 0.1 | 2 | 2% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151006 melee ticks, 37803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 58 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 47631 sent, 43172 reached their opponent, 10528 virtual hits (24.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.5 | 108 / 210 | 1.76 | 19.5% | 33229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.5% | 108 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.3% | 45 |
| rtk.Tachikoma 1.0 | 2.7 | 16.5% | 31 |
| franzor.Lizt 1.3.1 | 4.3 | 11.4% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.1% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.3 | 23 / 35 | 6061 |
| 2 | 1 | 71.0 | 89.8 | 16 / 35 | 6010 |
| 3 | 1 | 69.4 | 89.2 | 14 / 35 | 4816 |
| 4 | 1 | 71.5 | 93.0 | 19 / 35 | 5444 |
| 5 | 1 | 70.7 | 92.4 | 18 / 35 | 5419 |
| 6 | 1 | 70.6 | 91.4 | 18 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 72% |
| rsalesc.melee.Monk 0.3.6c | 42 | 17% |
| franzor.Lizt 1.3.1 | 29 | 72% |
| oog.melee.CapuletDroid 1.1 | 28 | 79% |

Hadur died in 103 of 210 rounds, at a mean tick of 1343. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 46 | 45% | 66 |
| rtk.Tachikoma 1.0 | 35 | 34% | 102 |
| oog.melee.CapuletDroid 1.1 | 12 | 12% | 36 |
| franzor.Lizt 1.3.1 | 8 | 8% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 193698 melee ticks, 87277 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 92 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 92 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 59606 sent, 55060 reached their opponent, 11908 virtual hits (21.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 570 over 6 battles (95.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.4 | 127 / 210 | 1.96 | 18.7% | 26769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.7% | 127 |
| tm.Yuugao 1.0 | 2.5 | 12.8% | 32 |
| shrub.Vapour v159 | 3.2 | 12.1% | 13 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.8% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.8% | 13 |
| m3thos.Eva00 1.1 | 5.8 | 8.8% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.1% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 1 |
| SHAM.WOW 1.4 | 9.3 | 5.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 21 / 35 | 4552 |
| 2 | 1 | 67.7 | 87.0 | 21 / 35 | 4388 |
| 3 | 1 | 67.1 | 86.3 | 19 / 35 | 4337 |
| 4 | 1 | 69.2 | 92.1 | 24 / 35 | 4554 |
| 5 | 1 | 67.7 | 88.9 | 18 / 35 | 4249 |
| 6 | 1 | 69.3 | 94.0 | 24 / 35 | 4689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 73% |
| shrub.Vapour v159 | 37 | 73% |
| Krabb.sliNk.Garm 0.9u | 30 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 27 | 93% |
| m3thos.Eva00 1.1 | 7 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 30% | 62 |
| Krabb.sliNk.Garm 0.9u | 19 | 22% | 38 |
| shrub.Vapour v159 | 16 | 18% | 46 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 31 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 12 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151276 melee ticks, 45322 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 89 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50332 sent, 45729 reached their opponent, 9170 virtual hits (20.1% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 74.3 | 47 / 210 | 3.31 | 14.5% | 19764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 101 |
| hadur2.Hadur 3.17.1bb | 2.5 | 14.5% | 47 |
| kc.micro.Figment 1.0 | 2.5 | 14.1% | 23 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 1 |
| mc2.enemy.Original 0.9 | 5.0 | 10.1% | 19 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.9% | 16 |
| dft.Calliope 5.6 | 7.2 | 7.5% | 3 |
| step.nanoPri 1.0 | 7.8 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 77.5 | 7 / 35 | 3197 |
| 2 | 3 | 60.6 | 71.4 | 6 / 35 | 3075 |
| 3 | 3 | 60.9 | 68.3 | 9 / 35 | 3301 |
| 4 | 2 | 64.4 | 78.7 | 11 / 35 | 3544 |
| 5 | 2 | 64.4 | 80.0 | 10 / 35 | 3508 |
| 6 | 3 | 60.3 | 69.8 | 4 / 35 | 3139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 28% |
| kc.micro.Figment 1.0 | 24 | 71% |
| mc2.enemy.Original 0.9 | 12 | 50% |
| pedersen.Grishnakh 1.0 | 9 | 33% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 40% | 79 |
| kc.micro.Figment 1.0 | 26 | 16% | 43 |
| mc2.enemy.Original 0.9 | 21 | 13% | 27 |
| yagami.Tidus 0.11 | 19 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 14 | 8% | 18 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145834 melee ticks, 36095 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 27 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 48425 sent, 44115 reached their opponent, 6736 virtual hits (15.3% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 95.5 | 176 / 210 | 1.40 | 20.4% | 31636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.4% | 176 |
| DTF.Kludgy 1.2b | 2.0 | 13.8% | 14 |
| ejb.Polaris 1.0.1 | 3.3 | 12.8% | 10 |
| ne.Chimera 1.2 | 3.7 | 12.7% | 4 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 10.3% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.1% | 0 |
| kurios.DOSexe .9b | 8.7 | 5.1% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 96.5 | 28 / 35 | 5439 |
| 2 | 1 | 70.9 | 95.9 | 31 / 35 | 5072 |
| 3 | 1 | 70.3 | 93.7 | 26 / 35 | 5419 |
| 4 | 1 | 69.9 | 93.3 | 28 / 35 | 4965 |
| 5 | 1 | 72.0 | 98.7 | 32 / 35 | 5464 |
| 6 | 1 | 70.9 | 94.9 | 31 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 62 | 82% |
| ejb.Polaris 1.0.1 | 55 | 96% |
| ne.Chimera 1.2 | 31 | 94% |
| vStar.RAFzilla 2.15 | 20 | 95% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 14 | 40% | 65 |
| ejb.Polaris 1.0.1 | 10 | 29% | 66 |
| ne.Chimera 1.2 | 5 | 14% | 32 |
| tvv.micro.Antares 1.1.1 | 4 | 11% | 18 |
| vStar.RAFzilla 2.15 | 1 | 3% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 147923 melee ticks, 61668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 51 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49518 sent, 45155 reached their opponent, 9384 virtual hits (20.8% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 427 over 6 battles (71.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.6 | 67 / 210 | 2.92 | 15.3% | 19913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.4% | 71 |
| hadur2.Hadur 3.17.1bb | 1.8 | 15.3% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 23 |
| djc.DynaBot 0.1.1 | 4.2 | 11.1% | 13 |
| rdt199.Warlord 0.73 | 5.3 | 9.2% | 19 |
| uji.YellohFellah 1.0 | 6.2 | 8.8% | 11 |
| br2.MobyDickBot 1.6 | 6.3 | 8.9% | 7 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 84.8 | 11 / 35 | 3366 |
| 2 | 1 | 63.5 | 80.3 | 12 / 35 | 3213 |
| 3 | 2 | 61.2 | 73.7 | 9 / 35 | 3173 |
| 4 | 2 | 63.1 | 77.8 | 10 / 35 | 3337 |
| 5 | 2 | 62.5 | 75.9 | 11 / 35 | 3287 |
| 6 | 2 | 64.2 | 79.4 | 14 / 35 | 3537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 44 | 50% |
| djc.DynaBot 0.1.1 | 20 | 70% |
| cx.mini.Nimrod 0.55 | 18 | 39% |
| uji.YellohFellah 1.0 | 11 | 82% |
| rdt199.Warlord 0.73 | 10 | 30% |
| br2.MobyDickBot 1.6 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 38% | 83 |
| cx.mini.Nimrod 0.55 | 31 | 21% | 42 |
| rdt199.Warlord 0.73 | 22 | 15% | 27 |
| uji.YellohFellah 1.0 | 13 | 9% | 19 |
| djc.DynaBot 0.1.1 | 12 | 8% | 22 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| br2.MobyDickBot 1.6 | 2 | 1% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158461 melee ticks, 36149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52407 sent, 47837 reached their opponent, 6686 virtual hits (14.0% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 536 over 6 battles (89.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.0 | 105 / 210 | 2.71 | 16.4% | 20062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 16.4% | 105 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.4% | 34 |
| nat.PallasHawk 1.0 | 3.0 | 13.6% | 34 |
| darkcanuck.Leon 1.01 | 3.8 | 12.6% | 21 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.9% | 14 |
| jrm.Test0 1.0 | 6.5 | 8.3% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.0% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.8% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 81.3 | 17 / 35 | 3301 |
| 2 | 1 | 65.6 | 83.2 | 18 / 35 | 3368 |
| 3 | 2 | 63.1 | 74.0 | 15 / 35 | 3350 |
| 4 | 1 | 65.2 | 81.6 | 18 / 35 | 3485 |
| 5 | 1 | 66.8 | 86.3 | 18 / 35 | 3561 |
| 6 | 1 | 64.3 | 79.4 | 19 / 35 | 2997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 74% |
| bts.wiki.RipCurl 0.9b | 34 | 68% |
| darkcanuck.Leon 1.01 | 31 | 90% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 27 | 25% | 65 |
| bts.wiki.RipCurl 0.9b | 25 | 23% | 42 |
| brainfade.melee.Genghis 0.36 | 17 | 16% | 25 |
| darkcanuck.Leon 1.01 | 16 | 15% | 50 |
| jrm.Test0 1.0 | 13 | 12% | 14 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127523 melee ticks, 35499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 44371 sent, 39805 reached their opponent, 7049 virtual hits (17.7% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 77 over 6 battles (12.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.5 | 43 / 210 | 3.03 | 14.5% | 21351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 51 |
| mn.Combat 3.25.0 | 1.5 | 16.8% | 88 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.5% | 43 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 17 |
| shinh.Entangled 0.3 | 4.7 | 11.4% | 10 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| maribo.FollowFire 1 | 8.3 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 77.5 | 5 / 35 | 3907 |
| 2 | 3 | 64.1 | 81.0 | 7 / 35 | 3584 |
| 3 | 3 | 63.8 | 79.4 | 11 / 35 | 3567 |
| 4 | 3 | 62.5 | 75.9 | 7 / 35 | 3550 |
| 5 | 3 | 62.2 | 76.5 | 6 / 35 | 3444 |
| 6 | 3 | 61.5 | 74.6 | 7 / 35 | 3299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 48 | 60% |
| mn.Combat 3.25.0 | 30 | 20% |
| shinh.Entangled 0.3 | 7 | 57% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 168 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 61 | 36% | 88 |
| mn.Combat 3.25.0 | 50 | 30% | 59 |
| gh.micro.Gruweltje 0.7 | 23 | 14% | 28 |
| shinh.Entangled 0.3 | 18 | 11% | 18 |
| stelo.Wang 1.0 | 5 | 3% | 5 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147006 melee ticks, 27981 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 79 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43811 sent, 39201 reached their opponent, 6875 virtual hits (17.5% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.5 | 156 / 210 | 1.59 | 19.8% | 29435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.6% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.7% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.8% | 4 |
| pa.Improved 1.0 | 9.0 | 5.8% | 3 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.3 | 27 / 35 | 5055 |
| 2 | 1 | 69.9 | 92.7 | 23 / 35 | 4965 |
| 3 | 1 | 69.0 | 89.2 | 23 / 35 | 4845 |
| 4 | 1 | 69.8 | 93.0 | 28 / 35 | 4617 |
| 5 | 1 | 71.4 | 98.1 | 31 / 35 | 4986 |
| 6 | 1 | 70.3 | 93.7 | 24 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 94% |
| catcat20.shape.Theta 0.018 | 55 | 78% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 56 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 17 | 30% | 52 |
| simonton.micro.Sprout 1.1.3 | 16 | 29% | 90 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 11% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 9% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 12 |
| pa.Improved 1.0 | 2 | 4% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 146983 melee ticks, 46592 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47515 sent, 43162 reached their opponent, 10909 virtual hits (25.3% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.1 | 89 / 210 | 2.61 | 17.0% | 26261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.0% | 89 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 29 |
| emp.Yngwie 1.11 | 2.7 | 13.5% | 58 |
| mld.DustBunny 3.8 | 3.8 | 12.6% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.8% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.6% | 14 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 17 / 35 | 4853 |
| 2 | 1 | 63.7 | 76.5 | 7 / 35 | 4042 |
| 3 | 1 | 64.8 | 76.8 | 17 / 35 | 4185 |
| 4 | 1 | 67.4 | 86.0 | 17 / 35 | 4391 |
| 5 | 1 | 66.6 | 83.8 | 17 / 35 | 4359 |
| 6 | 1 | 66.6 | 83.5 | 14 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 47% |
| kawigi.micro.Shiz 1.1 | 22 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 67% |
| mld.DustBunny 3.8 | 16 | 81% |
| cb.nano.Insomnia 1.0 | 13 | 85% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 43 | 35% | 85 |
| mld.DustBunny 3.8 | 26 | 21% | 41 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 34 |
| kawigi.robot.Girl 1.2 | 15 | 12% | 16 |
| cb.nano.Insomnia 1.0 | 14 | 11% | 17 |
| divineomega.TrialBot 0.003 | 5 | 4% | 10 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
| lambdaxy.TBot 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170424 melee ticks, 39428 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 55760 sent, 51148 reached their opponent, 8709 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 6 battles (48.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 99 / 210 | 2.27 | 18.2% | 28981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 18.2% | 99 |
| gh.Griezel 0.5.2 | 1.8 | 16.8% | 59 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.5% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.7% | 32 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.2 | 16 / 35 | 4558 |
| 2 | 1 | 69.6 | 90.8 | 20 / 35 | 4993 |
| 3 | 1 | 69.4 | 88.3 | 18 / 35 | 5357 |
| 4 | 1 | 68.8 | 87.6 | 18 / 35 | 4994 |
| 5 | 1 | 67.1 | 84.4 | 16 / 35 | 4540 |
| 6 | 2 | 66.5 | 82.2 | 11 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 58% |
| techdude.forest.FlamingForest 1.1 | 33 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 96% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| bvh.fnr.Fenrir 0.36l | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 47 | 41% | 94 |
| techdude.forest.FlamingForest 1.1 | 23 | 20% | 48 |
| bvh.fnr.Fenrir 0.36l | 16 | 14% | 18 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 11% | 24 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 9 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 7 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 184997 melee ticks, 65059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 36 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 59751 sent, 55203 reached their opponent, 9744 virtual hits (17.7% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 647 over 6 battles (107.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.1 | 92 / 210 | 2.43 | 17.9% | 29917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.9% | 92 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.6% | 45 |
| et.Predator 1.8 | 2.7 | 13.4% | 22 |
| cx.BlestPain 1.41 | 3.8 | 12.1% | 39 |
| ahf.NanoAndrew .4 | 5.3 | 10.4% | 7 |
| nic.Nicator 2.4 | 6.2 | 9.5% | 2 |
| maribo.melee.BMV 0.1 | 6.3 | 9.2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.4 | 14 / 35 | 4575 |
| 2 | 1 | 67.5 | 84.4 | 13 / 35 | 4988 |
| 3 | 1 | 67.4 | 81.6 | 14 / 35 | 5143 |
| 4 | 1 | 66.5 | 81.3 | 14 / 35 | 5034 |
| 5 | 1 | 66.0 | 82.2 | 13 / 35 | 4345 |
| 6 | 1 | 70.6 | 89.8 | 24 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 64% |
| et.Predator 1.8 | 37 | 73% |
| cx.BlestPain 1.41 | 29 | 24% |
| ahf.NanoAndrew .4 | 13 | 92% |
| nic.Nicator 2.4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 29% | 42 |
| oog.melee.Mercutio 1.0 | 30 | 24% | 55 |
| et.Predator 1.8 | 22 | 18% | 51 |
| ahf.NanoAndrew .4 | 16 | 13% | 31 |
| maribo.melee.BMV 0.1 | 9 | 7% | 13 |
| nic.Nicator 2.4 | 2 | 2% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 168275 melee ticks, 55085 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56719 sent, 52142 reached their opponent, 12184 virtual hits (23.4% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 254 over 6 battles (42.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.2 | 113 / 210 | 2.15 | 18.2% | 26298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.2% | 113 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 31 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.2% | 18 |
| uji.DBH 1.1 | 3.8 | 11.0% | 16 |
| sigterm.Sigterm 1.0 | 6.0 | 9.0% | 13 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.8% | 5 |
| ratosh.Nobo 0.21 | 6.7 | 8.5% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.6% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.7% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.5 | 22 / 35 | 4648 |
| 2 | 1 | 67.6 | 87.3 | 20 / 35 | 4457 |
| 3 | 1 | 67.5 | 88.3 | 22 / 35 | 4339 |
| 4 | 1 | 66.1 | 85.1 | 17 / 35 | 4060 |
| 5 | 1 | 67.7 | 89.2 | 18 / 35 | 4324 |
| 6 | 1 | 66.4 | 83.2 | 14 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 52 | 71% |
| agd.Mooserwirt2 2.7 | 30 | 67% |
| uji.DBH 1.1 | 27 | 74% |
| sigterm.Sigterm 1.0 | 15 | 73% |
| spinnercat.Robovirus 2.718 | 9 | 67% |
| stelo.WangRobot 1.0 | 9 | 78% |
| ratosh.Nobo 0.21 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 31% | 71 |
| agd.Mooserwirt2 2.7 | 15 | 15% | 38 |
| uji.DBH 1.1 | 14 | 14% | 23 |
| sigterm.Sigterm 1.0 | 10 | 10% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 10% | 13 |
| ratosh.Nobo 0.21 | 8 | 8% | 18 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 9 |
| stelo.WangRobot 1.0 | 4 | 4% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141378 melee ticks, 44003 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 47969 sent, 43456 reached their opponent, 9932 virtual hits (22.9% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 444 over 6 battles (74.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 96.5 | 181 / 210 | 1.32 | 21.3% | 33280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.3% | 181 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 12 |
| mld.Infinity 2.2 | 3.3 | 12.4% | 10 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.4% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.7% | 1 |
| pac.ABC 2.1 | 7.3 | 6.7% | 2 |
| mbh.Mbh 0.1 | 7.5 | 7.3% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.9 | 29 / 35 | 5203 |
| 2 | 1 | 72.1 | 96.5 | 31 / 35 | 5372 |
| 3 | 1 | 72.0 | 94.9 | 28 / 35 | 5628 |
| 4 | 1 | 72.3 | 96.8 | 31 / 35 | 5557 |
| 5 | 1 | 72.4 | 96.8 | 29 / 35 | 5789 |
| 6 | 1 | 72.9 | 98.7 | 33 / 35 | 5731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 102 | 99% |
| mld.Infinity 2.2 | 38 | 97% |
| krillr.mini.JointStrike 2.0.0 | 21 | 95% |
| pac.ABC 2.1 | 10 | 90% |
| erdnis.Rover 0.3 | 8 | 88% |
| patson.PatsonTestBot 1.0 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 32% | 73 |
| krillr.mini.JointStrike 2.0.0 | 8 | 24% | 34 |
| mld.Infinity 2.2 | 5 | 15% | 25 |
| erdnis.Rover 0.3 | 3 | 9% | 27 |
| patson.PatsonTestBot 1.0 | 2 | 6% | 19 |
| pac.ABC 2.1 | 1 | 3% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 136630 melee ticks, 45928 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45417 sent, 41096 reached their opponent, 10169 virtual hits (24.7% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.6 | 143 / 210 | 1.76 | 20.2% | 32920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.2% | 143 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 33 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 3 |
| catcat20.Rabbit 0.001 | 4.7 | 10.3% | 16 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.3% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.2 | 6.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 6.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.0 | 24 / 35 | 5624 |
| 2 | 1 | 69.7 | 89.2 | 24 / 35 | 5119 |
| 3 | 1 | 72.3 | 97.8 | 30 / 35 | 6047 |
| 4 | 1 | 70.5 | 93.3 | 23 / 35 | 5296 |
| 5 | 1 | 70.3 | 90.8 | 20 / 35 | 5761 |
| 6 | 1 | 68.3 | 85.4 | 22 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 77% |
| fwb.Nine 1.0.1 | 40 | 88% |
| catcat20.Rabbit 0.001 | 27 | 78% |
| nz.jdc.nano.GridFu 1.0 | 9 | 78% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 61% | 95 |
| catcat20.Rabbit 0.001 | 9 | 13% | 39 |
| fwb.Nine 1.0.1 | 9 | 13% | 21 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 18 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 17 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 165897 melee ticks, 54148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52587 sent, 48194 reached their opponent, 11607 virtual hits (24.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 691 over 6 battles (115.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.8 | 109 / 210 | 1.91 | 18.9% | 29607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 18.9% | 109 |
| eem.EvBot v4.6.16 | 1.8 | 17.0% | 77 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 7 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 9 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.7% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.7 | 22 / 35 | 5056 |
| 2 | 1 | 67.6 | 88.9 | 12 / 35 | 4714 |
| 3 | 1 | 69.8 | 92.4 | 21 / 35 | 4977 |
| 4 | 2 | 68.2 | 87.9 | 14 / 35 | 4879 |
| 5 | 1 | 69.8 | 90.2 | 21 / 35 | 5122 |
| 6 | 1 | 68.4 | 87.0 | 19 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 127 | 60% |
| cf.RiO.RiOx 4.2.1 | 18 | 83% |
| dummy.mini.Scimitar 1.01 | 16 | 69% |
| eld.Hmm 1.0 | 11 | 45% |
| fire219.CatBot 1.0 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1336. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 60 | 56% | 115 |
| dummy.mini.Scimitar 1.01 | 16 | 15% | 42 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 22 |
| eld.Hmm 1.0 | 7 | 6% | 17 |
| PSW.Relentless 0.1 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 182720 melee ticks, 88637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54335 sent, 49969 reached their opponent, 9088 virtual hits (18.2% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.8 | 83 / 210 | 2.19 | 17.4% | 26279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.4% | 83 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 67 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.1% | 38 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.3% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 5 |
| yk.JahRoslav 1.1 | 6.8 | 7.0% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.2% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.4 | 14 / 35 | 4310 |
| 2 | 1 | 69.3 | 90.5 | 18 / 35 | 4974 |
| 3 | 1 | 66.7 | 84.8 | 14 / 35 | 4176 |
| 4 | 1 | 67.7 | 88.3 | 14 / 35 | 4520 |
| 5 | 2 | 65.7 | 85.1 | 11 / 35 | 3808 |
| 6 | 1 | 67.5 | 87.0 | 12 / 35 | 4491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 35% |
| kvk.HebusLeTroll 0.35 | 39 | 64% |
| jlm.javaDisturbance 0.59 | 35 | 77% |
| bigpete.Stewie 1.0 | 7 | 86% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 3 | 67% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 59 | 45% | 81 |
| kvk.HebusLeTroll 0.35 | 33 | 25% | 50 |
| jlm.javaDisturbance 0.59 | 25 | 19% | 52 |
| bigpete.Stewie 1.0 | 8 | 6% | 15 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 162884 melee ticks, 47333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 53153 sent, 48755 reached their opponent, 8461 virtual hits (17.4% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 404 over 6 battles (67.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.1 | 159 / 210 | 1.53 | 20.5% | 31435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.5% | 159 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 31 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.4% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.4% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 7.2 | 7.9% | 0 |
| sample.Walls 1.0 | 7.5 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.2 | 27 / 35 | 5472 |
| 2 | 1 | 70.2 | 90.5 | 22 / 35 | 5103 |
| 3 | 1 | 71.6 | 92.7 | 24 / 35 | 4895 |
| 4 | 1 | 72.7 | 97.1 | 31 / 35 | 5732 |
| 5 | 1 | 71.2 | 93.0 | 26 / 35 | 5235 |
| 6 | 1 | 72.0 | 95.9 | 29 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 81% |
| cre.Karolos 0.32 | 49 | 94% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 31 | 57% | 112 |
| cre.Karolos 0.32 | 10 | 19% | 45 |
| stelo.AreaTargetingBot 1.1 | 6 | 11% | 17 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 11 |
| cw.megas.Blade 0.8 | 1 | 2% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 7 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128093 melee ticks, 48372 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 31 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 40669 sent, 36296 reached their opponent, 11653 virtual hits (32.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 6 battles (118.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.9 | 54 / 210 | 2.90 | 15.2% | 19955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 15.2% | 54 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.4% | 53 |
| florent.XSeries.X2 0.12 | 3.7 | 13.0% | 28 |
| davidalves.Phoenix 0.54 | 3.7 | 12.8% | 43 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 22 |
| oog.melee.Corsair 1.0 | 5.8 | 9.8% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.3% | 5 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.5% | 0 |
| evd.X1 0.01 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 78.1 | 10 / 35 | 3503 |
| 2 | 2 | 61.3 | 76.2 | 3 / 35 | 3327 |
| 3 | 1 | 61.9 | 77.5 | 7 / 35 | 3142 |
| 4 | 1 | 62.5 | 78.7 | 9 / 35 | 2946 |
| 5 | 1 | 64.8 | 81.6 | 14 / 35 | 3750 |
| 6 | 1 | 63.9 | 81.6 | 11 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 21% |
| davidalves.Phoenix 0.54 | 29 | 45% |
| florent.XSeries.X2 0.12 | 28 | 54% |
| pedersen.Ugluk 1.1.1 | 17 | 59% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| stelo.SoJNanoMelee 1.1 | 4 | 75% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 49 | 30% | 60 |
| florent.XSeries.X2 0.12 | 39 | 24% | 51 |
| davidalves.Phoenix 0.54 | 32 | 20% | 41 |
| pedersen.Ugluk 1.1.1 | 21 | 13% | 30 |
| oog.melee.Corsair 1.0 | 7 | 4% | 13 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 5 |
| evd.X1 0.01 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140475 melee ticks, 32990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 89 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 47666 sent, 42919 reached their opponent, 8441 virtual hits (19.7% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.1 | 125 / 210 | 2.34 | 17.6% | 21164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 125 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 18 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 13.1% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 22 |
| ds.Oo 2.2 | 5.3 | 9.8% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.1% | 7 |
| adt.Ar2 1.1 | 7.7 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.8% | 4 |
| awesomeness.Elite 1.0 | 8.3 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 23 / 35 | 3801 |
| 2 | 1 | 66.4 | 87.0 | 18 / 35 | 3289 |
| 3 | 1 | 63.6 | 79.0 | 15 / 35 | 3124 |
| 4 | 1 | 67.9 | 88.9 | 23 / 35 | 3581 |
| 5 | 1 | 69.8 | 94.3 | 28 / 35 | 3976 |
| 6 | 1 | 63.2 | 73.7 | 18 / 35 | 3393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 40 | 83% |
| voidious.micro.BlitzBat 1.05 | 36 | 97% |
| jdw.Hurricane 1.4 | 34 | 76% |
| ds.Oo 2.2 | 18 | 67% |
| gre.svman4.Morfeas 1.4.1 | 8 | 63% |
| adt.Ar2 1.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 5 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 22% | 39 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 18% | 49 |
| voidious.micro.BlitzBat 1.05 | 16 | 18% | 29 |
| ds.Oo 2.2 | 13 | 14% | 28 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 23 |
| adt.Ar2 1.1 | 6 | 7% | 16 |
| awesomeness.Elite 1.0 | 4 | 4% | 13 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 11 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 130169 melee ticks, 30274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46256 sent, 41804 reached their opponent, 7349 virtual hits (17.6% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.8 | 124 / 210 | 1.92 | 19.0% | 31129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 124 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 37 |
| shu.nitro.LENIN .T34 | 3.3 | 12.7% | 23 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 14 |
| js.PinBall 1.6 | 5.3 | 10.1% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.4% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.4% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.3 | 25 / 35 | 5453 |
| 2 | 1 | 69.4 | 89.5 | 19 / 35 | 5406 |
| 3 | 1 | 69.5 | 90.2 | 21 / 35 | 5222 |
| 4 | 1 | 70.4 | 92.1 | 25 / 35 | 5105 |
| 5 | 1 | 68.9 | 88.6 | 17 / 35 | 5031 |
| 6 | 1 | 68.2 | 85.1 | 17 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 79% |
| shu.nitro.LENIN .T34 | 45 | 84% |
| lrem.Spectre 0.4.4 | 34 | 76% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 88% |
| js.PinBall 1.6 | 7 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 20% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 31 | 35% | 75 |
| lrem.Spectre 0.4.4 | 23 | 26% | 47 |
| shu.nitro.LENIN .T34 | 17 | 19% | 54 |
| js.PinBall 1.6 | 9 | 10% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 8% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 7 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161624 melee ticks, 43102 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 26 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53526 sent, 49002 reached their opponent, 12753 virtual hits (26.0% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 287 over 6 battles (47.8 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.3 | 135 / 210 | 2.50 | 18.3% | 27748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 18.3% | 135 |
| mk.Alpha 0.2.1 | 1.8 | 14.3% | 41 |
| EH.Eagle 1.0.6 | 3.0 | 11.3% | 11 |
| wee.Gem 1.8.4 | 5.2 | 9.9% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.4% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.4% | 4 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.8% | 2 |
| joe.ADinosaur 1.0 | 8.0 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.0% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 66.0 | 14 / 35 | 4695 |
| 2 | 1 | 71.2 | 96.2 | 31 / 35 | 4891 |
| 3 | 1 | 69.7 | 93.3 | 27 / 35 | 4353 |
| 4 | 1 | 71.0 | 97.1 | 30 / 35 | 4962 |
| 5 | 2 | 59.6 | 57.5 | 9 / 35 | 4497 |
| 6 | 1 | 68.4 | 89.5 | 24 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 78% |
| EH.Eagle 1.0.6 | 34 | 100% |
| throxbot.ThroxBot 0.1 | 11 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 89% |
| wee.Gem 1.8.4 | 9 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 28 | 36% | 83 |
| cs.Grudge 1.0 | 18 | 23% | 17 |
| EH.Eagle 1.0.6 | 6 | 8% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 8% | 21 |
| throxbot.ThroxBot 0.1 | 6 | 8% | 13 |
| joe.ADinosaur 1.0 | 6 | 8% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 15 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 5 |
| wee.Gem 1.8.4 | 1 | 1% | 11 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 131990 melee ticks, 36530 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44102 sent, 39693 reached their opponent, 10316 virtual hits (26.0% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 268 over 6 battles (44.7 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 88.0 | 124 / 210 | 2.08 | 17.8% | 21814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.8% | 124 |
| kid.test.NightFox .2 | 1.8 | 15.3% | 34 |
| uji.Antique 1.0 | 3.3 | 12.0% | 26 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 11.1% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 15 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.1% | 1 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.9% | 3 |
| stelo.Lifestealer 1.0 | 8.2 | 6.3% | 1 |
| matt.advanced.Katana 1.0 | 8.7 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 85.4 | 15 / 35 | 3168 |
| 2 | 1 | 66.9 | 86.7 | 20 / 35 | 3781 |
| 3 | 1 | 67.9 | 91.4 | 23 / 35 | 3616 |
| 4 | 1 | 66.4 | 85.1 | 18 / 35 | 3772 |
| 5 | 1 | 68.9 | 92.1 | 27 / 35 | 4096 |
| 6 | 1 | 67.0 | 87.6 | 21 / 35 | 3381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 76% |
| uji.Antique 1.0 | 41 | 83% |
| qohnil.blot.BlotBot 3.61 | 16 | 75% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| ahr.ice.Ice 1.0.2 | 7 | 100% |
| amk.ChumbaWumba 0.3 | 3 | 33% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 33 | 37% | 58 |
| uji.Antique 1.0 | 23 | 26% | 61 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 29 |
| qohnil.blot.BlotBot 3.61 | 6 | 7% | 26 |
| amk.ChumbaWumba 0.3 | 4 | 4% | 9 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 18 |
| stelo.Lifestealer 1.0 | 1 | 1% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132309 melee ticks, 40910 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45092 sent, 40615 reached their opponent, 6189 virtual hits (15.2% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 717 over 6 battles (119.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.0 | 90 / 210 | 2.35 | 17.5% | 23923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.5% | 90 |
| deewiant.Anomaly 0.2 | 2.3 | 15.4% | 47 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.4% | 59 |
| myl.micro.Troodon 1.10 | 4.2 | 12.2% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.9% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.6% | 0 |
| jangs.ns51 1.0 | 9.0 | 4.3% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.3 | 14 / 35 | 3686 |
| 2 | 1 | 68.9 | 91.1 | 17 / 35 | 4129 |
| 3 | 1 | 66.6 | 82.9 | 15 / 35 | 3793 |
| 4 | 1 | 67.6 | 86.3 | 14 / 35 | 4211 |
| 5 | 1 | 68.9 | 88.9 | 21 / 35 | 4158 |
| 6 | 2 | 65.6 | 79.4 | 9 / 35 | 3946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 56% |
| myl.micro.Troodon 1.10 | 13 | 100% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 38% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 45 | 36% | 77 |
| myl.micro.Troodon 1.10 | 14 | 11% | 28 |
| jok.PheonixM 0.1.2 | 9 | 7% | 16 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 175100 melee ticks, 44128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 40 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 57916 sent, 53306 reached their opponent, 8821 virtual hits (16.5% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 517 over 6 battles (86.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 71.7 | 34 / 210 | 3.54 | 13.9% | 20596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.0 | 13.7% | 53 |
| hadur2.Hadur 3.17.1bb | 2.5 | 13.9% | 34 |
| catcat20.Matcha 0.006 | 3.0 | 13.3% | 43 |
| oog.melee.Capulet 1.2 | 3.7 | 13.3% | 41 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.4% | 16 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.3% | 8 |
| tripphippy.Alice 1.1 | 7.7 | 7.3% | 5 |
| ntc.Opposite 1.5 | 8.0 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.2% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 64.1 | 3 / 35 | 3287 |
| 2 | 1 | 63.6 | 77.8 | 12 / 35 | 3693 |
| 3 | 2 | 62.3 | 73.7 | 6 / 35 | 3810 |
| 4 | 2 | 60.4 | 72.1 | 4 / 35 | 3299 |
| 5 | 4 | 60.6 | 69.5 | 5 / 35 | 3385 |
| 6 | 2 | 60.3 | 73.3 | 4 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 46% |
| darkcanuck.B26354 1.06 | 19 | 26% |
| catcat20.Matcha 0.006 | 18 | 22% |
| stelo.PastFuture 2.3.2 | 11 | 73% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 40% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| tripphippy.Alice 1.1 | 2 | 50% |

Hadur died in 180 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 37 | 21% | 39 |
| stelo.PastFuture 2.3.2 | 35 | 19% | 42 |
| catcat20.Matcha 0.006 | 34 | 19% | 38 |
| oog.melee.Capulet 1.2 | 30 | 17% | 45 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 7% | 15 |
| tripphippy.Alice 1.1 | 12 | 7% | 13 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 14 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
| ntc.Opposite 1.5 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 157718 melee ticks, 22856 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 72 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52040 sent, 47426 reached their opponent, 8320 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 496 over 6 battles (82.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.7 | 50 / 210 | 3.10 | 14.7% | 18923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 85 |
| hadur2.Hadur 3.17.1bb | 2.3 | 14.7% | 50 |
| gh.mini.Griezel 0.2 | 2.7 | 13.8% | 49 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.7% | 10 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 5 |
| fm.mammillarias 1.3 | 8.5 | 5.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.3 | 6 / 35 | 3007 |
| 2 | 2 | 63.2 | 79.7 | 10 / 35 | 2934 |
| 3 | 3 | 61.8 | 75.2 | 9 / 35 | 2937 |
| 4 | 2 | 63.9 | 78.1 | 10 / 35 | 3524 |
| 5 | 2 | 62.8 | 77.5 | 5 / 35 | 3458 |
| 6 | 2 | 62.3 | 75.6 | 10 / 35 | 3063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 36 | 47% |
| gh.mini.Griezel 0.2 | 28 | 57% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| d414.nano.Quantum 1.0.0 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 33% | 71 |
| gh.mini.Griezel 0.2 | 44 | 27% | 57 |
| d414.nano.Quantum 1.0.0 | 26 | 16% | 31 |
| spinnercat.micro.Tyger 0.1 | 21 | 13% | 25 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 12 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154749 melee ticks, 28553 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51401 sent, 46625 reached their opponent, 7906 virtual hits (17.0% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 85.3 | 106 / 210 | 2.32 | 17.2% | 23816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.2% | 106 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.6% | 63 |
| apc.botM 3.0 | 3.0 | 12.0% | 21 |
| lxx.ConceptA 0.8 | 4.8 | 10.0% | 1 |
| vjik.UnViolation 1.1 | 5.0 | 10.1% | 8 |
| bayen.UbaMicro 1.4 | 5.2 | 9.4% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.1% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.3% | 6 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 84.4 | 18 / 35 | 3911 |
| 2 | 1 | 66.2 | 88.6 | 15 / 35 | 3763 |
| 3 | 1 | 66.6 | 86.3 | 20 / 35 | 4140 |
| 4 | 1 | 66.5 | 87.3 | 18 / 35 | 3801 |
| 5 | 1 | 65.2 | 82.9 | 15 / 35 | 4173 |
| 6 | 1 | 65.7 | 82.5 | 20 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 60% |
| apc.botM 3.0 | 29 | 76% |
| vjik.UnViolation 1.1 | 13 | 77% |
| lxx.ConceptA 0.8 | 11 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| yk.JahMicro 1.0 | 7 | 86% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 39% | 84 |
| apc.botM 3.0 | 17 | 16% | 42 |
| lxx.ConceptA 0.8 | 14 | 13% | 23 |
| bayen.UbaMicro 1.4 | 13 | 12% | 19 |
| panzer.Panzer 0.2 | 7 | 7% | 8 |
| vjik.UnViolation 1.1 | 6 | 6% | 19 |
| yk.JahMicro 1.0 | 3 | 3% | 7 |
| conscience.Electron 1.3g | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 125248 melee ticks, 46720 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 43703 sent, 39219 reached their opponent, 7641 virtual hits (19.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 551 over 6 battles (91.8 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.6 | 114 / 210 | 2.20 | 18.3% | 26118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.3% | 114 |
| maribo.Quester 0.3 | 2.0 | 16.3% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.1% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.8% | 12 |
| labg.Cataclysm 2.05 | 5.0 | 10.1% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.9% | 3 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 2 |
| zyx.micro.Ant 1.1 | 8.7 | 4.9% | 0 |
| sanja.First 0.1 | 8.7 | 4.9% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 18 / 35 | 4632 |
| 2 | 1 | 67.9 | 88.3 | 18 / 35 | 3927 |
| 3 | 1 | 68.3 | 86.0 | 18 / 35 | 4329 |
| 4 | 1 | 68.5 | 87.0 | 23 / 35 | 4222 |
| 5 | 1 | 67.9 | 84.1 | 18 / 35 | 4442 |
| 6 | 1 | 68.6 | 87.3 | 19 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 84% |
| gre.svman4.Leonidas 1.3.2 | 22 | 82% |
| labg.Cataclysm 2.05 | 10 | 60% |
| baal.nano.N 1.42 | 9 | 89% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 100% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 38% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 21% | 50 |
| gre.svman4.Leonidas 1.3.2 | 17 | 17% | 31 |
| labg.Cataclysm 2.05 | 10 | 10% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 13 |
| baal.nano.N 1.42 | 2 | 2% | 13 |
| sanja.First 0.1 | 1 | 1% | 3 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 175386 melee ticks, 48685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56908 sent, 52315 reached their opponent, 8541 virtual hits (16.3% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 6 battles (67.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.0 | 73 / 210 | 2.17 | 17.5% | 27112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.5% | 73 |
| stelo.Spread 0.9 | 2.2 | 16.5% | 66 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 41 |
| jcs.Seth 1.8 | 4.0 | 11.9% | 25 |
| tcf.Reach 3 | 5.2 | 10.3% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.4% | 1 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.0 | 10 / 35 | 4539 |
| 2 | 2 | 67.6 | 86.7 | 15 / 35 | 4123 |
| 3 | 1 | 68.7 | 88.9 | 14 / 35 | 4731 |
| 4 | 1 | 66.9 | 84.1 | 10 / 35 | 4522 |
| 5 | 2 | 67.1 | 85.4 | 9 / 35 | 4507 |
| 6 | 1 | 69.3 | 90.8 | 15 / 35 | 4690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 46% |
| kid.Gladiator .7.2 | 45 | 53% |
| jcs.Seth 1.8 | 29 | 41% |
| tcf.Reach 3 | 3 | 67% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 54 | 39% | 69 |
| stelo.Spread 0.9 | 51 | 36% | 85 |
| jcs.Seth 1.8 | 22 | 16% | 35 |
| cli.Dancer 1.1 | 3 | 2% | 9 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| tcf.Reach 3 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 176095 melee ticks, 57907 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54899 sent, 50308 reached their opponent, 8715 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 669 over 6 battles (111.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.3 | 32 / 210 | 2.86 | 14.9% | 19834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 145 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.9% | 32 |
| gh.mini.Gruwel 0.9 | 3.7 | 13.0% | 20 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 8 |
| wit.Chuliath 1.0 | 6.7 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 76.8 | 4 / 35 | 3117 |
| 2 | 2 | 61.8 | 74.0 | 3 / 35 | 3098 |
| 3 | 2 | 63.0 | 79.0 | 6 / 35 | 3313 |
| 4 | 2 | 64.5 | 81.9 | 7 / 35 | 3392 |
| 5 | 2 | 62.9 | 78.7 | 4 / 35 | 3263 |
| 6 | 2 | 65.7 | 85.4 | 8 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 83 | 18% |
| gh.mini.Gruwel 0.9 | 17 | 47% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 7 | 43% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 54% | 112 |
| gh.mini.Gruwel 0.9 | 26 | 14% | 35 |
| rz.HawkOnFire 0.1 | 23 | 12% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 10% | 25 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151129 melee ticks, 42443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46944 sent, 42367 reached their opponent, 7022 virtual hits (16.6% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.4 | 145 / 210 | 1.69 | 19.8% | 28462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 145 |
| alpha.RainingFire 1.0 | 2.8 | 12.7% | 20 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 16 |
| mz.Cork 0.1 | 3.8 | 11.6% | 17 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 4 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.0% | 4 |
| bvh.mini.Fenrir 0.39 | 7.0 | 8.6% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 5.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 26 / 35 | 4833 |
| 2 | 1 | 70.0 | 94.0 | 27 / 35 | 4488 |
| 3 | 1 | 69.9 | 91.7 | 23 / 35 | 4885 |
| 4 | 1 | 70.3 | 94.3 | 25 / 35 | 4616 |
| 5 | 1 | 69.7 | 91.4 | 21 / 35 | 4773 |
| 6 | 1 | 69.6 | 91.4 | 23 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 75% |
| mz.Cork 0.1 | 41 | 80% |
| bvh.micro.Freya 0.3 | 35 | 94% |
| alpha.RainingFire 1.0 | 25 | 68% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 33% | 37 |
| bzdp.Pansy 2.1 | 19 | 28% | 55 |
| bvh.micro.Freya 0.3 | 8 | 12% | 43 |
| mz.Cork 0.1 | 7 | 10% | 26 |
| bvh.mini.Fenrir 0.39 | 5 | 7% | 17 |
| m3thos.Eva02 0.7.1 | 3 | 4% | 20 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| dl.BetterWalls 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 150556 melee ticks, 45070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 46 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51221 sent, 46877 reached their opponent, 9995 virtual hits (21.3% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 89.5 | 162 / 210 | 1.94 | 19.1% | 30564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.1% | 162 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.5% | 8 |
| germ.TheMind .2 | 4.2 | 9.8% | 6 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 2 |
| agrach.Dalek 1.0 | 5.0 | 9.3% | 9 |
| lmk.ACPFinal 0.1 | 5.8 | 9.0% | 7 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 7 |
| mb.Beast 0.1 | 7.3 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.2% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 96.8 | 31 / 35 | 4987 |
| 2 | 1 | 66.5 | 84.1 | 24 / 35 | 4985 |
| 3 | 1 | 68.5 | 89.5 | 27 / 35 | 5333 |
| 4 | 1 | 67.2 | 89.2 | 25 / 35 | 4745 |
| 5 | 1 | 67.4 | 87.9 | 28 / 35 | 4781 |
| 6 | 1 | 68.8 | 89.5 | 27 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 27 | 96% |
| mb.Beast 0.1 | 25 | 100% |
| agrach.Dalek 1.0 | 25 | 88% |
| stelo.UntouchableNano 1.3 | 24 | 92% |
| lmk.ACPFinal 0.1 | 23 | 91% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 91% |
| EBBU.Sim2 1.02 | 13 | 92% |
| skm.Ryubot 1.0 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 22% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 20% | 12 |
| agrach.Dalek 1.0 | 6 | 12% | 33 |
| mb.Beast 0.1 | 5 | 10% | 24 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 29 |
| germ.TheMind .2 | 4 | 8% | 25 |
| lmk.ACPFinal 0.1 | 4 | 8% | 20 |
| EBBU.Sim2 1.02 | 3 | 6% | 19 |
| skm.Ryubot 1.0 | 1 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 98371 melee ticks, 27239 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 33590 sent, 29499 reached their opponent, 9068 virtual hits (30.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 425 over 6 battles (70.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.2 | 87 / 210 | 2.42 | 16.8% | 23841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 16.8% | 87 |
| justin.Mallais 14.0 | 1.8 | 15.6% | 60 |
| bvh.mini.Freya 0.55 | 3.3 | 12.5% | 17 |
| bts.mega.Gnarly 1.4 | 3.8 | 12.0% | 28 |
| cs.Wren 1.0 | 5.3 | 10.3% | 3 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.9% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 9.0% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 84.8 | 12 / 35 | 3824 |
| 2 | 1 | 65.8 | 84.4 | 17 / 35 | 3713 |
| 3 | 2 | 65.0 | 81.3 | 14 / 35 | 3810 |
| 4 | 1 | 65.2 | 81.0 | 11 / 35 | 4216 |
| 5 | 1 | 67.1 | 87.3 | 14 / 35 | 4197 |
| 6 | 1 | 67.0 | 86.7 | 19 / 35 | 4081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 54% |
| bts.mega.Gnarly 1.4 | 31 | 58% |
| bvh.mini.Freya 0.55 | 19 | 74% |
| kdf.KoulDestroyer 1.0 | 15 | 73% |
| cs.Wren 1.0 | 13 | 92% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 30% | 68 |
| bvh.mini.Freya 0.55 | 26 | 20% | 38 |
| bts.mega.Gnarly 1.4 | 24 | 19% | 42 |
| kdf.KoulDestroyer 1.0 | 16 | 13% | 20 |
| cs.Wren 1.0 | 13 | 10% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142928 melee ticks, 30846 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47256 sent, 42578 reached their opponent, 9638 virtual hits (22.6% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 599 over 6 battles (99.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.9 | 85 / 210 | 2.54 | 16.8% | 25556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 16.8% | 85 |
| bvh.fry.Freya 0.82 | 1.8 | 14.7% | 23 |
| az.Ololobot 0.2.4 | 3.3 | 13.0% | 61 |
| catcat20.Lambda 0.024 | 3.7 | 12.2% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 4 |
| gimp.GimpBot 0.1 | 6.7 | 7.8% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.0 | 17 / 35 | 4418 |
| 2 | 1 | 65.0 | 82.9 | 13 / 35 | 4108 |
| 3 | 2 | 62.6 | 75.9 | 9 / 35 | 3833 |
| 4 | 1 | 67.7 | 89.8 | 19 / 35 | 4435 |
| 5 | 1 | 63.4 | 79.4 | 8 / 35 | 4131 |
| 6 | 1 | 67.5 | 88.6 | 19 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 38 | 47% |
| bvh.fry.Freya 0.82 | 36 | 78% |
| catcat20.Lambda 0.024 | 35 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 86% |
| gimp.GimpBot 0.1 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 39 | 30% | 61 |
| bvh.fry.Freya 0.82 | 35 | 27% | 57 |
| catcat20.Lambda 0.024 | 32 | 24% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 7% | 14 |
| gimp.GimpBot 0.1 | 4 | 3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 8 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162072 melee ticks, 42137 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 67 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52869 sent, 48328 reached their opponent, 9503 virtual hits (19.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.6 | 132 / 210 | 1.94 | 19.1% | 27562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.1% | 132 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.3% | 18 |
| mz.AntiGrav 1.0 | 3.8 | 11.6% | 7 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.3% | 7 |
| stelo.Randomness 1.0 | 6.0 | 9.1% | 9 |
| alpha.BlackIce 1.0 | 7.0 | 8.0% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.4% | 0 |
| sample.Corners 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.9 | 30 / 35 | 5054 |
| 2 | 1 | 68.8 | 88.9 | 20 / 35 | 4568 |
| 3 | 1 | 67.7 | 84.1 | 20 / 35 | 4477 |
| 4 | 1 | 69.6 | 91.1 | 24 / 35 | 4609 |
| 5 | 1 | 68.7 | 89.5 | 20 / 35 | 4375 |
| 6 | 1 | 68.5 | 87.9 | 18 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 77% |
| kano.gamma.KanoGamma 1.8 | 50 | 84% |
| mz.AntiGrav 1.0 | 24 | 100% |
| Polkwane.SmashMelee 1.0 | 12 | 92% |
| stelo.Randomness 1.0 | 7 | 71% |
| alpha.BlackIce 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 39% | 79 |
| kano.gamma.KanoGamma 1.8 | 17 | 20% | 51 |
| mz.AntiGrav 1.0 | 10 | 12% | 26 |
| stelo.Randomness 1.0 | 9 | 11% | 18 |
| Polkwane.SmashMelee 1.0 | 8 | 10% | 21 |
| alpha.BlackIce 1.0 | 2 | 2% | 4 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 6 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161224 melee ticks, 40195 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 73 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53540 sent, 48834 reached their opponent, 10987 virtual hits (22.5% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 703 over 6 battles (117.2 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.0 | 100 / 210 | 2.17 | 17.6% | 23672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 100 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 76 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 4 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.9% | 16 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 10 |
| shrub.Silver v048 | 6.0 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 5.4% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.7 | 16 / 35 | 3978 |
| 2 | 1 | 67.6 | 87.3 | 18 / 35 | 3795 |
| 3 | 1 | 66.6 | 84.8 | 14 / 35 | 3827 |
| 4 | 1 | 66.4 | 85.4 | 13 / 35 | 3886 |
| 5 | 1 | 69.3 | 91.4 | 21 / 35 | 4255 |
| 6 | 1 | 67.9 | 87.6 | 18 / 35 | 3931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 73 | 44% |
| lessonz.robocode.Oz 0.5.0 | 28 | 93% |
| ary.Swarm 1.1 | 23 | 100% |
| simonton.nano.MeleeSeed 1.8 | 11 | 91% |
| shrub.Silver v048 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 59 | 50% | 89 |
| lessonz.robocode.Oz 0.5.0 | 17 | 15% | 35 |
| ary.Swarm 1.1 | 16 | 14% | 39 |
| simonton.nano.MeleeSeed 1.8 | 8 | 7% | 20 |
| zyx.nano.Ant 1.1 | 5 | 4% | 6 |
| shrub.Silver v048 | 4 | 3% | 12 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159042 melee ticks, 48360 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53429 sent, 48870 reached their opponent, 7976 virtual hits (16.3% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 713 over 6 battles (118.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.0 | 127 / 210 | 1.99 | 18.9% | 29712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.9% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 41 |
| ara.Shera 0.88 | 3.3 | 13.2% | 24 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.0% | 15 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 20 / 35 | 4955 |
| 2 | 1 | 68.4 | 87.3 | 22 / 35 | 4919 |
| 3 | 1 | 69.0 | 90.5 | 20 / 35 | 4952 |
| 4 | 1 | 68.0 | 86.7 | 19 / 35 | 4829 |
| 5 | 1 | 70.2 | 92.7 | 23 / 35 | 5258 |
| 6 | 1 | 68.9 | 89.5 | 23 / 35 | 4799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 84 | 88% |
| maribo.mini.MiniQuester 0.1 | 34 | 76% |
| ara.Shera 0.88 | 30 | 57% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 32% | 91 |
| ara.Shera 0.88 | 23 | 26% | 44 |
| maribo.mini.MiniQuester 0.1 | 22 | 24% | 49 |
| amz.NanoClone 1.41 | 4 | 4% | 9 |
| dsw.StaticD 1.0 | 3 | 3% | 9 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 164042 melee ticks, 43918 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53160 sent, 48733 reached their opponent, 10169 virtual hits (20.9% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 596 over 6 battles (99.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.4 | 26 / 210 | 3.03 | 14.4% | 19324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 151 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.4% | 26 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.4% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 76.2 | 4 / 35 | 3155 |
| 2 | 2 | 63.8 | 74.6 | 6 / 35 | 3656 |
| 3 | 2 | 63.9 | 78.7 | 7 / 35 | 3220 |
| 4 | 2 | 63.1 | 77.5 | 2 / 35 | 2954 |
| 5 | 2 | 64.1 | 80.0 | 3 / 35 | 3246 |
| 6 | 2 | 63.8 | 77.5 | 4 / 35 | 3093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 14% |
| brainfade.melee.Dusk 0.44 | 14 | 50% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |

Hadur died in 191 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 111 | 58% | 126 |
| brainfade.melee.Dusk 0.44 | 28 | 15% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 10% | 20 |
| dummy.micro.Sparrow 2.5 | 14 | 7% | 17 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 158359 melee ticks, 42217 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 47 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 51359 sent, 46621 reached their opponent, 8076 virtual hits (17.3% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.7 | 120 / 210 | 1.93 | 19.3% | 30131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.3% | 120 |
| stelo.Liblix 0.3.1 | 2.0 | 16.2% | 54 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 26 |
| jwirde.Gort 2.0 | 4.7 | 9.5% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.7% | 1 |
| wompi.Quokka 1.6 | 6.3 | 7.7% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.6% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.4 | 24 / 35 | 5219 |
| 2 | 1 | 69.2 | 88.9 | 19 / 35 | 5111 |
| 3 | 1 | 70.0 | 90.8 | 21 / 35 | 5164 |
| 4 | 1 | 68.8 | 87.6 | 19 / 35 | 5146 |
| 5 | 1 | 69.9 | 93.3 | 21 / 35 | 4889 |
| 6 | 1 | 67.6 | 85.1 | 16 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 70% |
| tzu.TheArtOfWar 1.2 | 48 | 69% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 93% |
| jwirde.Gort 2.0 | 9 | 78% |
| disan.Chair 2.2.0 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 50% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 45% | 101 |
| tzu.TheArtOfWar 1.2 | 25 | 27% | 58 |
| jwirde.Gort 2.0 | 10 | 11% | 20 |
| wompi.Quokka 1.6 | 5 | 5% | 6 |
| stf.PanzerGeneral 0.1 | 4 | 4% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 14 |
| disan.Chair 2.2.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156832 melee ticks, 47793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54643 sent, 50197 reached their opponent, 11288 virtual hits (22.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 6 battles (101.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.4 | 96 / 210 | 2.22 | 18.8% | 30189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 96 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.4% | 82 |
| jje.BagPuss 1.2 | 2.7 | 12.5% | 14 |
| sul.Lunar 1.1 | 4.2 | 11.0% | 10 |
| myl.nano.Graviton 1.10 | 5.2 | 9.8% | 2 |
| fm.claire 1.7 | 6.3 | 8.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 3 |
| hvilela.HVilela 0.9 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.7 | 6.0% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 16 / 35 | 5230 |
| 2 | 1 | 67.7 | 84.1 | 15 / 35 | 5066 |
| 3 | 1 | 68.1 | 87.3 | 17 / 35 | 4687 |
| 4 | 1 | 69.5 | 89.5 | 20 / 35 | 5137 |
| 5 | 1 | 67.6 | 83.2 | 13 / 35 | 5203 |
| 6 | 1 | 68.2 | 87.9 | 15 / 35 | 4866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 82 | 54% |
| jje.BagPuss 1.2 | 26 | 62% |
| sul.Lunar 1.1 | 18 | 78% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 39 | 33% | 0 |
| jje.BagPuss 1.2 | 34 | 28% | 78 |
| sul.Lunar 1.1 | 12 | 10% | 47 |
| fm.claire 1.7 | 11 | 9% | 22 |
| myl.nano.Graviton 1.10 | 8 | 7% | 29 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 21 |
| wit.Deep7 2.0 | 2 | 2% | 6 |
| hvilela.HVilela 0.9 | 1 | 1% | 4 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 200749 melee ticks, 89339 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 63 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 63118 sent, 58695 reached their opponent, 9359 virtual hits (15.9% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 810 over 6 battles (135.0 per battle, most in one battle 218). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.5 | 49 / 210 | 2.67 | 15.5% | 21720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 62 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 86 |
| hadur2.Hadur 3.17.1bb | 2.7 | 15.5% | 49 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 5 |
| cx.Princess 1.0 | 4.8 | 10.0% | 5 |
| sadoner.killer 0.2 | 5.7 | 9.6% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.9 | 11 / 35 | 3856 |
| 2 | 3 | 63.7 | 80.6 | 6 / 35 | 3418 |
| 3 | 3 | 64.5 | 81.0 | 6 / 35 | 3965 |
| 4 | 2 | 66.2 | 86.3 | 13 / 35 | 3513 |
| 5 | 3 | 63.8 | 81.6 | 7 / 35 | 3411 |
| 6 | 3 | 62.7 | 76.5 | 6 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 59% |
| rsalesc.melee.Medina 0.4.5 | 33 | 12% |
| cx.Princess 1.0 | 8 | 75% |
| mz.MicroSheep 1.0 | 4 | 50% |

Hadur died in 169 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 43% | 110 |
| rsalesc.melee.Medina 0.4.5 | 51 | 30% | 56 |
| mz.MicroSheep 1.0 | 11 | 7% | 13 |
| sadoner.killer 0.2 | 11 | 7% | 11 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 7 |
| cx.Princess 1.0 | 5 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 150289 melee ticks, 40893 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 33 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45342 sent, 40745 reached their opponent, 6526 virtual hits (16.0% of those reached).

