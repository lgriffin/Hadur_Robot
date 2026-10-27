# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.0 | 41 / 210 | 2.35 | 16.8% | 29584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 143 |
| hadur2.Hadur 3.17.1po | 2.0 | 16.8% | 41 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.2% | 4 |
| mz.MicroGodMelee 1 | 5.3 | 10.0% | 3 |
| lorneswork.Predator 1.0 | 5.7 | 9.9% | 3 |
| adt.Ar2 1.0 | 6.7 | 8.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.4 | 6 / 35 | 5075 |
| 2 | 2 | 67.0 | 85.4 | 12 / 35 | 5006 |
| 3 | 2 | 66.1 | 83.8 | 4 / 35 | 4936 |
| 4 | 2 | 67.1 | 87.0 | 5 / 35 | 5241 |
| 5 | 2 | 66.0 | 85.4 | 5 / 35 | 4393 |
| 6 | 2 | 66.2 | 83.8 | 9 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 8% |
| sgp.JollyNinja 3.53 | 17 | 47% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| lorneswork.Predator 1.0 | 8 | 100% |
| mz.MicroGodMelee 1 | 8 | 75% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 68% | 132 |
| sgp.JollyNinja 3.53 | 16 | 9% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 8% | 23 |
| lorneswork.Predator 1.0 | 13 | 8% | 18 |
| mz.MicroGodMelee 1 | 6 | 4% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 142695 melee ticks, 80201 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46371 sent, 41573 reached their opponent, 8369 virtual hits (20.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.7 | 91 / 210 | 2.38 | 17.8% | 27577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.8% | 91 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.8% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.7% | 11 |
| sch.Simone 0.3d | 6.7 | 8.5% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.3% | 5 |
| Noran.BitchingElk 0.054 | 7.3 | 8.4% | 11 |
| stelo.PatternRobot 1.0 | 9.2 | 4.8% | 1 |
| fullsail.SweetTea 1.1 | 9.8 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.0 | 16 / 35 | 4849 |
| 2 | 1 | 66.9 | 85.4 | 12 / 35 | 4416 |
| 3 | 1 | 66.4 | 81.0 | 16 / 35 | 4508 |
| 4 | 1 | 66.7 | 85.7 | 13 / 35 | 4330 |
| 5 | 1 | 68.7 | 86.3 | 19 / 35 | 4919 |
| 6 | 1 | 66.4 | 82.5 | 15 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 81% |
| sch.Simone 0.3d | 16 | 56% |
| Noran.BitchingElk 0.054 | 14 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| fnc.bandit.Bandit 5.2.0 | 6 | 50% |
| stelo.PatternRobot 1.0 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 36% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 19 | 16% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 13% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 21 |
| sch.Simone 0.3d | 11 | 9% | 17 |
| Noran.BitchingElk 0.054 | 8 | 7% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7 | 6% | 9 |
| stelo.PatternRobot 1.0 | 5 | 4% | 7 |

Posture (Hadur's M records, 201 rounds): 170524 melee ticks, 42042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 60940 sent, 56201 reached their opponent, 9242 virtual hits (16.4% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.9 | 143 / 210 | 2.00 | 19.4% | 34940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.4% | 143 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 31 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.1% | 19 |
| vuen.Cake 2.51 | 3.8 | 12.1% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 2 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 24 / 35 | 5698 |
| 2 | 1 | 68.6 | 87.9 | 24 / 35 | 5534 |
| 3 | 1 | 68.3 | 84.8 | 21 / 35 | 5659 |
| 4 | 1 | 71.0 | 93.0 | 27 / 35 | 6453 |
| 5 | 1 | 69.1 | 87.3 | 23 / 35 | 5924 |
| 6 | 1 | 69.1 | 89.2 | 24 / 35 | 5672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 56 | 96% |
| vuen.Cake 2.51 | 50 | 86% |
| kawigi.nano.Lib 1.0 | 36 | 94% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 67% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 36% | 67 |
| kawigi.nano.Lib 1.0 | 14 | 21% | 46 |
| vuen.Cake 2.51 | 12 | 18% | 56 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 10% | 8 |
| urdos.URDOS 1.3 | 3 | 4% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| adt.Ar1 2.1 | 2 | 3% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 6 |

Posture (Hadur's M records, 198 rounds): 121553 melee ticks, 37689 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 58 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38163 sent, 33635 reached their opponent, 8976 virtual hits (26.7% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 19 / 210 | 2.36 | 17.0% | 32064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 168 |
| hadur2.Hadur 3.17.1po | 2.0 | 17.0% | 19 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 8 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 12 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.4% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.3% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 84.1 | 2 / 35 | 5033 |
| 2 | 2 | 68.2 | 86.0 | 6 / 35 | 5633 |
| 3 | 2 | 67.2 | 83.8 | 2 / 35 | 5351 |
| 4 | 2 | 67.5 | 87.0 | 4 / 35 | 4901 |
| 5 | 2 | 67.1 | 82.2 | 2 / 35 | 5430 |
| 6 | 2 | 68.3 | 86.3 | 3 / 35 | 5716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 127 | 6% |
| apc.LeeroyJenkins2 1.0 | 11 | 64% |
| TNT.TNT 0.99.1 | 11 | 18% |
| spin.Bugstard 0.012b | 2 | 50% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 194 of 210 rounds, at a mean tick of 1296. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 74% | 152 |
| apc.LeeroyJenkins2 1.0 | 24 | 12% | 29 |
| TNT.TNT 0.99.1 | 13 | 7% | 17 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 194630 melee ticks, 68136 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 60651 sent, 55789 reached their opponent, 8398 virtual hits (15.1% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 297 over 6 battles (49.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.4 | 27 / 210 | 3.12 | 14.4% | 21121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 110 |
| justin.DemonicRage 3.4 | 2.0 | 16.6% | 56 |
| hadur2.Hadur 3.17.1po | 3.0 | 14.4% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 10 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 5 |
| ms.Ares 0.19 | 5.5 | 9.2% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 77.1 | 4 / 35 | 3527 |
| 2 | 3 | 61.3 | 72.7 | 4 / 35 | 3208 |
| 3 | 3 | 63.5 | 77.8 | 8 / 35 | 3626 |
| 4 | 3 | 63.7 | 79.7 | 6 / 35 | 3645 |
| 5 | 3 | 61.6 | 74.3 | 2 / 35 | 3211 |
| 6 | 3 | 63.4 | 76.8 | 3 / 35 | 3904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 43 | 5% |
| justin.DemonicRage 3.4 | 22 | 32% |
| wompi.Numbat 2.1 | 17 | 88% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 77 | 42% | 82 |
| justin.DemonicRage 3.4 | 50 | 27% | 59 |
| wompi.Numbat 2.1 | 32 | 17% | 40 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| axeBots.HataMoto 3.09 | 8 | 4% | 12 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 150506 melee ticks, 34441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48003 sent, 42867 reached their opponent, 6979 virtual hits (16.3% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.8 | 113 / 210 | 2.19 | 18.6% | 30183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.6% | 113 |
| jekl.StoneGhost 0.7 | 2.2 | 14.2% | 23 |
| origin.SleepSiphon 1.7b | 3.0 | 13.5% | 45 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.6% | 19 |
| mld.Wisdom 1.0 | 5.2 | 10.4% | 1 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.8% | 7 |
| DBall.NUKE 0.1 | 7.8 | 6.4% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 17 / 35 | 4890 |
| 2 | 1 | 68.6 | 87.9 | 20 / 35 | 5053 |
| 3 | 1 | 67.4 | 84.8 | 17 / 35 | 4682 |
| 4 | 1 | 68.4 | 87.9 | 17 / 35 | 4915 |
| 5 | 1 | 70.0 | 90.2 | 22 / 35 | 5450 |
| 6 | 1 | 68.6 | 85.4 | 20 / 35 | 5193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 50 | 62% |
| jekl.StoneGhost 0.7 | 41 | 95% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 60% |
| gg.Wolverine 2.0 | 10 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 37% | 68 |
| jekl.StoneGhost 0.7 | 23 | 23% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 15% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 10% | 16 |
| mld.Wisdom 1.0 | 9 | 9% | 20 |
| gg.Wolverine 2.0 | 4 | 4% | 13 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145135 melee ticks, 40749 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45786 sent, 41075 reached their opponent, 9325 virtual hits (22.7% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 764 over 6 battles (127.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.4 | 105 / 210 | 1.68 | 20.3% | 37678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.3% | 105 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.9% | 42 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 39 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 14 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.0 | 21 / 35 | 6642 |
| 2 | 1 | 72.1 | 93.0 | 18 / 35 | 6441 |
| 3 | 1 | 70.9 | 92.1 | 15 / 35 | 5533 |
| 4 | 1 | 71.8 | 92.7 | 18 / 35 | 6166 |
| 5 | 1 | 72.6 | 93.7 | 18 / 35 | 6820 |
| 6 | 1 | 70.9 | 89.2 | 15 / 35 | 6076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 82 | 59% |
| rsalesc.melee.Monk 0.3.6c | 50 | 36% |
| oog.melee.CapuletDroid 1.1 | 27 | 70% |
| franzor.Lizt 1.3.1 | 27 | 70% |

Hadur died in 111 of 210 rounds, at a mean tick of 1467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 46 | 41% | 94 |
| rsalesc.melee.Monk 0.3.6c | 39 | 35% | 73 |
| oog.melee.CapuletDroid 1.1 | 11 | 10% | 39 |
| franzor.Lizt 1.3.1 | 9 | 8% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 193222 melee ticks, 95862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 57829 sent, 53082 reached their opponent, 10541 virtual hits (19.9% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.2 | 121 / 210 | 1.88 | 19.2% | 29110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.2% | 121 |
| shrub.Vapour v159 | 2.7 | 13.0% | 29 |
| tm.Yuugao 1.0 | 2.7 | 12.7% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.5% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 5 |
| m3thos.Eva00 1.1 | 5.7 | 8.9% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 17 / 35 | 4939 |
| 2 | 1 | 68.0 | 90.5 | 19 / 35 | 4609 |
| 3 | 1 | 70.3 | 95.2 | 24 / 35 | 5150 |
| 4 | 1 | 67.7 | 85.7 | 18 / 35 | 4714 |
| 5 | 1 | 69.3 | 91.4 | 22 / 35 | 4870 |
| 6 | 1 | 68.7 | 90.5 | 21 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 50 | 60% |
| tm.Yuugao 1.0 | 43 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 96% |
| Krabb.sliNk.Garm 0.9u | 23 | 65% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 67% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 26 | 29% | 52 |
| tm.Yuugao 1.0 | 24 | 27% | 61 |
| Krabb.sliNk.Garm 0.9u | 16 | 18% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 9% | 19 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 4 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| m3thos.Eva00 1.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 204 rounds): 149994 melee ticks, 46919 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49515 sent, 44780 reached their opponent, 8323 virtual hits (18.6% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 86 over 6 battles (14.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.2 | 48 / 210 | 3.23 | 14.6% | 19374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 94 |
| kc.micro.Figment 1.0 | 2.3 | 14.5% | 36 |
| hadur2.Hadur 3.17.1po | 2.5 | 14.6% | 48 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.8% | 18 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 3 |
| mc2.enemy.Original 0.9 | 6.3 | 9.0% | 9 |
| dft.Calliope 5.6 | 6.7 | 7.9% | 2 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 70.8 | 10 / 35 | 3334 |
| 2 | 3 | 62.2 | 74.9 | 5 / 35 | 3106 |
| 3 | 2 | 63.8 | 79.7 | 10 / 35 | 3256 |
| 4 | 2 | 61.3 | 72.1 | 7 / 35 | 3224 |
| 5 | 2 | 63.3 | 79.7 | 8 / 35 | 3331 |
| 6 | 3 | 61.9 | 74.3 | 8 / 35 | 3123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 28% |
| kc.micro.Figment 1.0 | 29 | 66% |
| pedersen.Grishnakh 1.0 | 12 | 67% |
| mc2.enemy.Original 0.9 | 5 | 60% |
| yagami.Tidus 0.11 | 4 | 50% |
| dft.Calliope 5.6 | 3 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 39% | 78 |
| kc.micro.Figment 1.0 | 33 | 20% | 52 |
| yagami.Tidus 0.11 | 20 | 12% | 22 |
| pedersen.Grishnakh 1.0 | 17 | 10% | 21 |
| mc2.enemy.Original 0.9 | 12 | 7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 10 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 203 rounds): 145655 melee ticks, 30132 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 48415 sent, 43826 reached their opponent, 6175 virtual hits (14.1% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 701 over 6 battles (116.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.1 | 145 / 210 | 1.71 | 19.7% | 31877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.7% | 145 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 32 |
| ne.Chimera 1.2 | 3.3 | 12.8% | 10 |
| ejb.Polaris 1.0.1 | 3.5 | 12.4% | 8 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 5 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.8% | 6 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 95.2 | 30 / 35 | 5339 |
| 2 | 1 | 70.8 | 94.9 | 23 / 35 | 5522 |
| 3 | 1 | 69.6 | 88.6 | 24 / 35 | 5592 |
| 4 | 1 | 70.5 | 93.0 | 25 / 35 | 5457 |
| 5 | 1 | 68.8 | 90.2 | 19 / 35 | 5139 |
| 6 | 1 | 69.2 | 90.5 | 24 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 78% |
| ejb.Polaris 1.0.1 | 45 | 89% |
| ne.Chimera 1.2 | 25 | 88% |
| vStar.RAFzilla 2.15 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 2 | 50% |
| sam.Samspin 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 24 | 34% | 63 |
| ne.Chimera 1.2 | 14 | 20% | 38 |
| ejb.Polaris 1.0.1 | 9 | 13% | 56 |
| vStar.RAFzilla 2.15 | 8 | 11% | 24 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 4 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| sam.Samspin 1.0 | 1 | 1% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151709 melee ticks, 55264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49880 sent, 45216 reached their opponent, 8700 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 230 over 6 battles (38.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 79.9 | 63 / 210 | 2.81 | 15.7% | 21645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.5% | 73 |
| hadur2.Hadur 3.17.1po | 1.7 | 15.7% | 63 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 18 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 13 |
| rdt199.Warlord 0.73 | 5.5 | 9.5% | 16 |
| br2.MobyDickBot 1.6 | 5.7 | 8.8% | 15 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 13 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 78.4 | 9 / 35 | 3569 |
| 2 | 2 | 63.5 | 78.7 | 12 / 35 | 3467 |
| 3 | 2 | 62.3 | 75.9 | 8 / 35 | 3450 |
| 4 | 2 | 63.3 | 77.1 | 11 / 35 | 3732 |
| 5 | 1 | 64.6 | 82.2 | 11 / 35 | 3725 |
| 6 | 1 | 65.7 | 87.0 | 12 / 35 | 3702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 35% |
| br2.MobyDickBot 1.6 | 13 | 38% |
| uji.YellohFellah 1.0 | 12 | 67% |
| djc.DynaBot 0.1.1 | 12 | 75% |
| cx.mini.Nimrod 0.55 | 12 | 83% |
| rdt199.Warlord 0.73 | 12 | 75% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 39% | 81 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 34 |
| djc.DynaBot 0.1.1 | 15 | 10% | 26 |
| br2.MobyDickBot 1.6 | 14 | 9% | 17 |
| rdt199.Warlord 0.73 | 13 | 9% | 21 |
| uji.YellohFellah 1.0 | 8 | 5% | 14 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 6 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 153943 melee ticks, 35096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51113 sent, 46238 reached their opponent, 6197 virtual hits (13.4% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.3 | 112 / 210 | 2.32 | 17.5% | 22416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.5% | 112 |
| nat.PallasHawk 1.0 | 2.7 | 13.4% | 38 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.1% | 24 |
| darkcanuck.Leon 1.01 | 3.7 | 12.3% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 11 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.4% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.1% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.2 | 17 / 35 | 3845 |
| 2 | 1 | 66.8 | 83.2 | 22 / 35 | 3876 |
| 3 | 1 | 67.7 | 89.5 | 19 / 35 | 3914 |
| 4 | 1 | 67.9 | 89.5 | 20 / 35 | 3955 |
| 5 | 1 | 68.0 | 90.8 | 22 / 35 | 3662 |
| 6 | 1 | 62.4 | 75.9 | 12 / 35 | 3164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 49 | 61% |
| bts.wiki.RipCurl 0.9b | 36 | 83% |
| darkcanuck.Leon 1.01 | 32 | 75% |
| brainfade.melee.Genghis 0.36 | 17 | 88% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| jrm.Test0 1.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 29 | 28% | 58 |
| bts.wiki.RipCurl 0.9b | 24 | 24% | 46 |
| jrm.Test0 1.0 | 14 | 14% | 19 |
| darkcanuck.Leon 1.01 | 13 | 13% | 45 |
| brainfade.melee.Genghis 0.36 | 12 | 12% | 18 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 9 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 7 |
| jp.Perpy 16.0 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

Posture (Hadur's M records, 202 rounds): 131937 melee ticks, 34449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 30 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44886 sent, 40019 reached their opponent, 6626 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 84 over 6 battles (14.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.7 | 43 / 210 | 2.74 | 15.4% | 23800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 17.2% | 95 |
| ags.Glacier 0.2.11 | 2.3 | 16.0% | 40 |
| hadur2.Hadur 3.17.1po | 2.7 | 15.4% | 43 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 21 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 7 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 4 |
| ayk.WallHugger 1.0 | 8.5 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 84.4 | 10 / 35 | 4051 |
| 2 | 3 | 61.7 | 74.9 | 3 / 35 | 3587 |
| 3 | 3 | 64.1 | 79.7 | 8 / 35 | 4022 |
| 4 | 3 | 64.6 | 81.0 | 7 / 35 | 3910 |
| 5 | 3 | 64.3 | 81.3 | 6 / 35 | 4048 |
| 6 | 2 | 65.4 | 82.9 | 9 / 35 | 4182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 48 | 56% |
| mn.Combat 3.25.0 | 38 | 16% |
| shinh.Entangled 0.3 | 11 | 45% |
| gh.micro.Gruweltje 0.7 | 10 | 50% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 61 | 37% | 72 |
| ags.Glacier 0.2.11 | 56 | 34% | 78 |
| shinh.Entangled 0.3 | 24 | 14% | 28 |
| gh.micro.Gruweltje 0.7 | 14 | 8% | 20 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 147319 melee ticks, 38951 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 72 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43453 sent, 38429 reached their opponent, 6102 virtual hits (15.9% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.3 | 144 / 210 | 1.70 | 20.2% | 33893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.3% | 20 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.9% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.1% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.1% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.7% | 2 |
| pa.Improved 1.0 | 9.0 | 5.9% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.8 | 21 / 35 | 5590 |
| 2 | 1 | 71.6 | 95.2 | 27 / 35 | 5818 |
| 3 | 1 | 70.4 | 92.7 | 24 / 35 | 5462 |
| 4 | 1 | 70.0 | 88.9 | 25 / 35 | 5734 |
| 5 | 1 | 70.0 | 93.0 | 22 / 35 | 5221 |
| 6 | 1 | 71.6 | 93.0 | 25 / 35 | 6068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 90% |
| catcat20.shape.Theta 0.018 | 60 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| pa.Improved 1.0 | 7 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 39% | 96 |
| catcat20.shape.Theta 0.018 | 22 | 33% | 50 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 12% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 19 |
| pa.Improved 1.0 | 3 | 5% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 143843 melee ticks, 51896 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 79 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45592 sent, 41076 reached their opponent, 9904 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 423 over 6 battles (70.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.1 | 103 / 210 | 2.25 | 18.2% | 28608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.2% | 103 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 26 |
| emp.Yngwie 1.11 | 2.8 | 13.5% | 54 |
| mld.DustBunny 3.8 | 4.0 | 12.1% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 5 |
| kawigi.robot.Girl 1.2 | 6.2 | 9.1% | 15 |
| lambdaxy.TBot 0.1 | 7.2 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.2 | 20 / 35 | 5288 |
| 2 | 1 | 67.2 | 82.5 | 18 / 35 | 4726 |
| 3 | 1 | 67.6 | 84.4 | 18 / 35 | 4758 |
| 4 | 1 | 67.2 | 85.7 | 16 / 35 | 4444 |
| 5 | 1 | 66.5 | 82.9 | 13 / 35 | 4517 |
| 6 | 1 | 68.9 | 90.8 | 18 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 56 | 63% |
| kawigi.micro.Shiz 1.1 | 28 | 82% |
| mld.DustBunny 3.8 | 18 | 83% |
| kawigi.robot.Girl 1.2 | 17 | 71% |
| cb.nano.Insomnia 1.0 | 16 | 88% |
| divineomega.TrialBot 0.003 | 5 | 60% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 47 | 42% | 89 |
| kawigi.micro.Shiz 1.1 | 20 | 18% | 48 |
| mld.DustBunny 3.8 | 17 | 15% | 37 |
| kawigi.robot.Girl 1.2 | 11 | 10% | 13 |
| cb.nano.Insomnia 1.0 | 7 | 6% | 13 |
| divineomega.TrialBot 0.003 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167708 melee ticks, 47758 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54957 sent, 50207 reached their opponent, 8020 virtual hits (16.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 89 over 6 battles (14.8 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.4 | 102 / 210 | 2.40 | 18.3% | 30932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.3% | 102 |
| gh.Griezel 0.5.2 | 2.2 | 16.1% | 49 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.0% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.2% | 39 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 0 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.8% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.3% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 5.0% | 0 |
| asd.Cthulhu 1.3 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.1 | 16 / 35 | 5294 |
| 2 | 1 | 68.7 | 87.3 | 18 / 35 | 5143 |
| 3 | 1 | 69.8 | 89.8 | 20 / 35 | 5500 |
| 4 | 1 | 69.0 | 87.9 | 18 / 35 | 5283 |
| 5 | 1 | 66.8 | 79.7 | 13 / 35 | 4934 |
| 6 | 1 | 67.4 | 83.5 | 17 / 35 | 4778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 70% |
| techdude.forest.FlamingForest 1.1 | 40 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 82% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 2 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 37 | 34% | 81 |
| techdude.forest.FlamingForest 1.1 | 28 | 26% | 53 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 14% | 33 |
| bvh.fnr.Fenrir 0.36l | 11 | 10% | 12 |
| stelo.IntrinsicVolatility 1.4 | 6 | 6% | 12 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 6 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 7 |
| asd.Cthulhu 1.3 | 3 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 175944 melee ticks, 55325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 57125 sent, 52639 reached their opponent, 8913 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 230 over 6 battles (38.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.8 | 108 / 210 | 2.37 | 18.5% | 31950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.5% | 108 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.3% | 32 |
| cx.BlestPain 1.41 | 3.2 | 12.9% | 44 |
| et.Predator 1.8 | 3.2 | 13.2% | 14 |
| ahf.NanoAndrew .4 | 5.3 | 10.1% | 7 |
| nic.Nicator 2.4 | 6.2 | 9.2% | 3 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 17 / 35 | 5044 |
| 2 | 1 | 69.9 | 87.6 | 20 / 35 | 5782 |
| 3 | 1 | 68.6 | 86.7 | 21 / 35 | 5100 |
| 4 | 1 | 68.2 | 85.1 | 19 / 35 | 5242 |
| 5 | 1 | 65.9 | 77.1 | 13 / 35 | 5004 |
| 6 | 1 | 69.7 | 87.9 | 18 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 49 | 76% |
| et.Predator 1.8 | 49 | 88% |
| cx.BlestPain 1.41 | 30 | 50% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| ahf.NanoAndrew .4 | 6 | 83% |
| nic.Nicator 2.4 | 3 | 33% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 32% | 56 |
| oog.melee.Mercutio 1.0 | 25 | 24% | 58 |
| et.Predator 1.8 | 21 | 20% | 52 |
| ahf.NanoAndrew .4 | 12 | 12% | 23 |
| maribo.melee.BMV 0.1 | 6 | 6% | 12 |
| nic.Nicator 2.4 | 4 | 4% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 159616 melee ticks, 57799 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53838 sent, 49100 reached their opponent, 10055 virtual hits (20.5% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 809 over 6 battles (134.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.4 | 123 / 210 | 2.14 | 18.6% | 27737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.6% | 123 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.8% | 35 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.7% | 19 |
| uji.DBH 1.1 | 4.0 | 11.2% | 11 |
| sigterm.Sigterm 1.0 | 5.7 | 9.0% | 11 |
| spinnercat.Robovirus 2.718 | 5.7 | 8.9% | 5 |
| ratosh.Nobo 0.21 | 6.8 | 8.1% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.3% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.6% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.8 | 24 / 35 | 4746 |
| 2 | 1 | 68.0 | 87.9 | 21 / 35 | 4632 |
| 3 | 1 | 66.7 | 85.1 | 17 / 35 | 4149 |
| 4 | 1 | 68.9 | 89.2 | 22 / 35 | 4939 |
| 5 | 1 | 68.7 | 89.5 | 22 / 35 | 4834 |
| 6 | 1 | 66.2 | 82.5 | 17 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 53 | 72% |
| agd.Mooserwirt2 2.7 | 39 | 79% |
| uji.DBH 1.1 | 26 | 85% |
| sigterm.Sigterm 1.0 | 16 | 69% |
| spinnercat.Robovirus 2.718 | 10 | 70% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| ratosh.Nobo 0.21 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 28% | 70 |
| agd.Mooserwirt2 2.7 | 19 | 20% | 42 |
| uji.DBH 1.1 | 14 | 15% | 33 |
| sigterm.Sigterm 1.0 | 10 | 11% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 12 |
| ratosh.Nobo 0.21 | 5 | 5% | 10 |
| spinnercat.Robovirus 2.718 | 5 | 5% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 5 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 136243 melee ticks, 45499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46869 sent, 42019 reached their opponent, 9049 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 97.2 | 189 / 210 | 1.25 | 22.0% | 36084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 22.0% | 189 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 8 |
| mld.Infinity 2.2 | 3.2 | 12.4% | 8 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.4% | 1 |
| pac.ABC 2.1 | 7.5 | 7.0% | 1 |
| mbh.Mbh 0.1 | 7.7 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 96.2 | 32 / 35 | 5989 |
| 2 | 1 | 72.8 | 98.1 | 31 / 35 | 5826 |
| 3 | 1 | 73.3 | 96.5 | 32 / 35 | 6149 |
| 4 | 1 | 73.8 | 100.0 | 35 / 35 | 6139 |
| 5 | 1 | 73.2 | 98.1 | 31 / 35 | 6251 |
| 6 | 1 | 71.8 | 94.6 | 28 / 35 | 5730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 104 | 97% |
| mld.Infinity 2.2 | 34 | 97% |
| krillr.mini.JointStrike 2.0.0 | 21 | 90% |
| patson.PatsonTestBot 1.0 | 14 | 93% |
| erdnis.Rover 0.3 | 11 | 91% |
| pac.ABC 2.1 | 8 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 23 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 43% | 69 |
| krillr.mini.JointStrike 2.0.0 | 7 | 30% | 36 |
| patson.PatsonTestBot 1.0 | 3 | 13% | 20 |
| mld.Infinity 2.2 | 2 | 9% | 30 |
| erdnis.Rover 0.3 | 1 | 4% | 29 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 128522 melee ticks, 44241 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43537 sent, 39030 reached their opponent, 8973 virtual hits (23.0% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 333 over 6 battles (55.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.3 | 127 / 210 | 1.97 | 20.0% | 34566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.0% | 127 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 34 |
| fwb.Nine 1.0.1 | 3.3 | 11.5% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 3 |
| catcat20.Rabbit 0.001 | 4.5 | 10.6% | 15 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 9.1% | 7 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.7% | 6 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.2% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.5 | 29 / 35 | 6279 |
| 2 | 1 | 70.6 | 90.8 | 23 / 35 | 5748 |
| 3 | 1 | 69.7 | 89.2 | 20 / 35 | 5405 |
| 4 | 1 | 68.5 | 85.1 | 17 / 35 | 5533 |
| 5 | 1 | 68.4 | 84.8 | 17 / 35 | 5552 |
| 6 | 1 | 70.4 | 89.2 | 21 / 35 | 6049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 64 | 80% |
| fwb.Nine 1.0.1 | 36 | 89% |
| catcat20.Rabbit 0.001 | 26 | 69% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| m3thos.mini.Eva01 0.5.5 | 7 | 71% |
| bayen.nut.Squirrel 1.615 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 38 | 44% | 80 |
| fwb.Nine 1.0.1 | 17 | 20% | 36 |
| catcat20.Rabbit 0.001 | 11 | 13% | 39 |
| bayen.nut.Squirrel 1.615 | 6 | 7% | 9 |
| nz.jdc.nano.GridFu 1.0 | 5 | 6% | 18 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 6 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 14 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 165990 melee ticks, 51170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 44 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52648 sent, 47976 reached their opponent, 10607 virtual hits (22.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 6 battles (67.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 117 / 210 | 1.75 | 19.9% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.9% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 68 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.7% | 16 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.8% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 1 |
| fire219.CatBot 1.0 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.2 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.0 | 23 / 35 | 5155 |
| 2 | 1 | 71.0 | 95.2 | 23 / 35 | 5557 |
| 3 | 1 | 70.6 | 91.1 | 18 / 35 | 5616 |
| 4 | 1 | 69.6 | 92.1 | 18 / 35 | 5229 |
| 5 | 1 | 69.9 | 86.7 | 20 / 35 | 5924 |
| 6 | 1 | 70.0 | 90.8 | 15 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 59% |
| dummy.mini.Scimitar 1.01 | 26 | 88% |
| cf.RiO.RiOx 4.2.1 | 20 | 100% |
| eld.Hmm 1.0 | 12 | 17% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 57 | 58% | 101 |
| dummy.mini.Scimitar 1.01 | 15 | 15% | 47 |
| eld.Hmm 1.0 | 12 | 12% | 25 |
| cf.RiO.RiOx 4.2.1 | 5 | 5% | 24 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 186511 melee ticks, 72891 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54806 sent, 50144 reached their opponent, 8417 virtual hits (16.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 6 battles (17.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.1 | 94 / 210 | 2.16 | 18.2% | 29206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.2 | 18.2% | 94 |
| pe.SandboxDT 2.71m | 2.0 | 16.5% | 65 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.2% | 23 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 4 |
| yk.JahRoslav 1.1 | 6.3 | 6.9% | 2 |
| tad.Dalek98 0.98 | 6.7 | 6.7% | 0 |
| gg.Squaraus 0.6 | 8.3 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.2 | 20 / 35 | 4737 |
| 2 | 1 | 68.9 | 87.6 | 17 / 35 | 4927 |
| 3 | 1 | 69.4 | 88.9 | 18 / 35 | 4888 |
| 4 | 2 | 66.2 | 81.0 | 7 / 35 | 4617 |
| 5 | 1 | 68.1 | 87.6 | 15 / 35 | 4969 |
| 6 | 1 | 69.2 | 88.6 | 17 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 45% |
| kvk.HebusLeTroll 0.35 | 38 | 79% |
| jlm.javaDisturbance 0.59 | 35 | 77% |
| bigpete.Stewie 1.0 | 7 | 86% |
| yk.JahRoslav 1.1 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 53 | 46% | 80 |
| jlm.javaDisturbance 0.59 | 25 | 22% | 49 |
| kvk.HebusLeTroll 0.35 | 23 | 20% | 48 |
| bigpete.Stewie 1.0 | 7 | 6% | 16 |
| tad.Dalek98 0.98 | 4 | 3% | 6 |
| yk.JahRoslav 1.1 | 3 | 3% | 7 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 202 rounds): 161442 melee ticks, 47096 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 50 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 52010 sent, 47265 reached their opponent, 7740 virtual hits (16.4% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 6 battles (55.7 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.8 | 162 / 210 | 1.47 | 21.3% | 35413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 21.3% | 162 |
| pe.SandboxLump 1.52 | 2.2 | 16.4% | 30 |
| cre.Karolos 0.32 | 2.8 | 13.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.1% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.4% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 0 |
| cw.megas.Blade 0.8 | 7.3 | 7.7% | 0 |
| sample.Walls 1.0 | 7.7 | 7.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.3 | 24 / 35 | 6393 |
| 2 | 1 | 72.4 | 94.0 | 27 / 35 | 5817 |
| 3 | 1 | 72.8 | 95.6 | 30 / 35 | 5588 |
| 4 | 1 | 72.4 | 94.9 | 29 / 35 | 5625 |
| 5 | 1 | 71.9 | 93.3 | 26 / 35 | 5779 |
| 6 | 1 | 73.1 | 96.5 | 26 / 35 | 6211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 99 | 80% |
| cre.Karolos 0.32 | 56 | 93% |
| stelo.RamTrackSurfer 1.2 | 8 | 63% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 44% | 95 |
| cre.Karolos 0.32 | 15 | 30% | 63 |
| stelo.RamTrackSurfer 1.2 | 5 | 10% | 13 |
| stelo.AreaTargetingBot 1.1 | 4 | 8% | 18 |
| cw.megas.Blade 0.8 | 2 | 4% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 6 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 125648 melee ticks, 51469 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 39817 sent, 35267 reached their opponent, 10653 virtual hits (30.2% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 768 over 6 battles (128.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.6 | 76 / 210 | 2.74 | 16.2% | 22648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.2 | 16.2% | 76 |
| rz.GlowBlowMelee 1.4 | 2.2 | 13.9% | 41 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 32 |
| davidalves.Phoenix 0.54 | 4.2 | 12.1% | 29 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.2% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.8% | 4 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.2% | 4 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 1 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.5 | 11 / 35 | 3500 |
| 2 | 1 | 63.9 | 77.5 | 14 / 35 | 3538 |
| 3 | 1 | 64.8 | 81.9 | 13 / 35 | 3660 |
| 4 | 1 | 66.7 | 86.3 | 17 / 35 | 3901 |
| 5 | 1 | 64.6 | 80.3 | 9 / 35 | 4112 |
| 6 | 1 | 65.1 | 81.3 | 12 / 35 | 3937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 28 | 68% |
| rz.GlowBlowMelee 1.4 | 26 | 50% |
| pedersen.Ugluk 1.1.1 | 23 | 65% |
| davidalves.Phoenix 0.54 | 21 | 67% |
| oog.melee.Corsair 1.0 | 11 | 82% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 26% | 56 |
| rz.GlowBlowMelee 1.4 | 31 | 22% | 46 |
| pedersen.Ugluk 1.1.1 | 27 | 19% | 40 |
| davidalves.Phoenix 0.54 | 20 | 14% | 31 |
| oog.melee.Corsair 1.0 | 7 | 5% | 20 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 7 |
| evd.X1 0.01 | 5 | 4% | 5 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 136779 melee ticks, 31670 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46133 sent, 41110 reached their opponent, 7585 virtual hits (18.5% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.3 | 116 / 210 | 2.32 | 17.9% | 23446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.9% | 116 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 25 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 16 |
| jdw.Hurricane 1.4 | 4.2 | 11.3% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.9% | 15 |
| ds.Oo 2.2 | 5.7 | 9.5% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 7.7% | 4 |
| adt.Ar2 1.1 | 8.2 | 6.8% | 4 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.2% | 3 |
| amk.ChumbaMini 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.4 | 19 / 35 | 3718 |
| 2 | 1 | 68.1 | 86.7 | 23 / 35 | 4116 |
| 3 | 1 | 66.0 | 82.5 | 15 / 35 | 3793 |
| 4 | 1 | 67.0 | 86.3 | 18 / 35 | 3879 |
| 5 | 1 | 66.5 | 83.5 | 18 / 35 | 4098 |
| 6 | 1 | 68.2 | 88.6 | 23 / 35 | 3842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 76% |
| voidious.micro.BlitzBat 1.05 | 35 | 91% |
| jdw.Hurricane 1.4 | 26 | 77% |
| ds.Oo 2.2 | 11 | 91% |
| gre.svman4.Morfeas 1.4.1 | 10 | 60% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 27 | 28% | 49 |
| voidious.micro.BlitzBat 1.05 | 22 | 23% | 53 |
| jdw.Hurricane 1.4 | 13 | 14% | 33 |
| ds.Oo 2.2 | 13 | 14% | 24 |
| gre.svman4.Morfeas 1.4.1 | 7 | 7% | 17 |
| adt.Ar2 1.1 | 6 | 6% | 9 |
| awesomeness.Elite 1.0 | 4 | 4% | 11 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 125588 melee ticks, 27916 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 31 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46117 sent, 41302 reached their opponent, 6761 virtual hits (16.4% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.1 | 132 / 210 | 1.71 | 20.1% | 34854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.1% | 132 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 35 |
| shu.nitro.LENIN .T34 | 3.2 | 12.5% | 19 |
| lrem.Spectre 0.4.4 | 4.0 | 12.2% | 12 |
| js.PinBall 1.6 | 4.8 | 11.1% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.4% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.1 | 23 / 35 | 5947 |
| 2 | 1 | 70.1 | 90.2 | 18 / 35 | 5736 |
| 3 | 1 | 72.0 | 93.3 | 27 / 35 | 6179 |
| 4 | 1 | 70.4 | 92.7 | 21 / 35 | 5596 |
| 5 | 1 | 71.1 | 93.0 | 22 / 35 | 5883 |
| 6 | 1 | 70.3 | 92.4 | 21 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 67% |
| shu.nitro.LENIN .T34 | 41 | 83% |
| lrem.Spectre 0.4.4 | 39 | 85% |
| js.PinBall 1.6 | 19 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 67% |
| gh.mini.GrubbmOne 1.0 | 2 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 49% | 71 |
| shu.nitro.LENIN .T34 | 13 | 16% | 57 |
| lrem.Spectre 0.4.4 | 12 | 15% | 42 |
| js.PinBall 1.6 | 8 | 10% | 24 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 8% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 203 rounds): 162104 melee ticks, 42579 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53114 sent, 48318 reached their opponent, 11727 virtual hits (24.3% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 469 over 6 battles (78.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.4 | 122 / 210 | 2.85 | 17.7% | 28556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.3 | 17.7% | 122 |
| mk.Alpha 0.2.1 | 1.7 | 14.4% | 48 |
| EH.Eagle 1.0.6 | 3.5 | 11.5% | 7 |
| wee.Gem 1.8.4 | 5.0 | 9.7% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.9% | 11 |
| throxbot.ThroxBot 0.1 | 6.0 | 9.0% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.9% | 3 |
| joe.ADinosaur 1.0 | 7.8 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.9% | 1 |
| cs.Grudge 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.8 | 24 / 35 | 5007 |
| 2 | 1 | 71.4 | 97.1 | 30 / 35 | 5127 |
| 3 | 1 | 69.4 | 91.4 | 22 / 35 | 4926 |
| 4 | 2 | 58.5 | 52.7 | 12 / 35 | 4358 |
| 5 | 2 | 60.0 | 56.2 | 12 / 35 | 4651 |
| 6 | 1 | 68.1 | 88.3 | 22 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 79% |
| EH.Eagle 1.0.6 | 32 | 94% |
| throxbot.ThroxBot 0.1 | 13 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| wee.Gem 1.8.4 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 30% | 74 |
| cs.Grudge 1.0 | 16 | 18% | 16 |
| EH.Eagle 1.0.6 | 14 | 15% | 40 |
| joe.ADinosaur 1.0 | 7 | 8% | 15 |
| caimano.Furia_Ceca 0.22 | 7 | 8% | 13 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 5% | 7 |
| wee.Gem 1.8.4 | 4 | 4% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 13 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 122191 melee ticks, 29512 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 41408 sent, 36735 reached their opponent, 8861 virtual hits (24.1% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 89.1 | 123 / 210 | 1.98 | 18.2% | 23218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.2% | 123 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 26 |
| uji.Antique 1.0 | 3.0 | 12.7% | 28 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.0% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 6 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.7% | 4 |
| matt.advanced.Katana 1.0 | 8.0 | 6.3% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.1 | 24 / 35 | 3954 |
| 2 | 1 | 67.9 | 89.2 | 21 / 35 | 4072 |
| 3 | 1 | 66.9 | 87.0 | 20 / 35 | 3714 |
| 4 | 1 | 68.3 | 91.4 | 21 / 35 | 3988 |
| 5 | 1 | 67.6 | 89.2 | 20 / 35 | 3784 |
| 6 | 1 | 66.2 | 86.7 | 17 / 35 | 3706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 78% |
| uji.Antique 1.0 | 46 | 89% |
| qohnil.blot.BlotBot 3.61 | 17 | 53% |
| pfvicm.Sobieski 7.2.3b | 11 | 73% |
| amk.ChumbaWumba 0.3 | 9 | 56% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 29% | 58 |
| uji.Antique 1.0 | 20 | 22% | 56 |
| pfvicm.Sobieski 7.2.3b | 16 | 18% | 28 |
| qohnil.blot.BlotBot 3.61 | 12 | 13% | 24 |
| amk.ChumbaWumba 0.3 | 12 | 13% | 22 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 10 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 202 rounds): 132950 melee ticks, 35822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44743 sent, 40009 reached their opponent, 5693 virtual hits (14.2% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.4 | 92 / 210 | 2.49 | 17.7% | 26192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.2 | 17.7% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.9% | 46 |
| deewiant.Anomaly 0.2 | 2.5 | 14.9% | 54 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.8% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 5.9% | 1 |
| DBall.Anarchy 0.1 | 8.0 | 5.7% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.2% | 2 |
| jangs.ns51 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 77.1 | 13 / 35 | 3879 |
| 2 | 1 | 68.7 | 87.6 | 20 / 35 | 4505 |
| 3 | 1 | 66.9 | 81.6 | 13 / 35 | 4272 |
| 4 | 1 | 68.8 | 88.3 | 16 / 35 | 4657 |
| 5 | 1 | 67.1 | 82.9 | 13 / 35 | 4333 |
| 6 | 1 | 67.9 | 83.2 | 17 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 51% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 64% |
| myl.micro.Troodon 1.10 | 27 | 93% |
| jok.PheonixM 0.1.2 | 11 | 82% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 48% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 31 | 26% | 59 |
| myl.micro.Troodon 1.10 | 12 | 10% | 29 |
| jok.PheonixM 0.1.2 | 9 | 8% | 20 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 158201 melee ticks, 46159 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52971 sent, 48279 reached their opponent, 7514 virtual hits (15.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 772 over 6 battles (128.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.6 | 42 / 210 | 3.20 | 14.8% | 22332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.5 | 14.8% | 42 |
| darkcanuck.B26354 1.06 | 2.3 | 13.7% | 45 |
| catcat20.Matcha 0.006 | 2.5 | 13.7% | 53 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.9% | 28 |
| oog.melee.Capulet 1.2 | 4.8 | 12.3% | 23 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.4% | 6 |
| ntc.Opposite 1.5 | 7.8 | 7.1% | 1 |
| tripphippy.Alice 1.1 | 8.3 | 7.1% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 70.5 | 8 / 35 | 3667 |
| 2 | 1 | 62.9 | 75.2 | 4 / 35 | 4063 |
| 3 | 3 | 61.2 | 70.8 | 7 / 35 | 3581 |
| 4 | 1 | 62.2 | 76.8 | 7 / 35 | 3363 |
| 5 | 1 | 63.5 | 79.4 | 8 / 35 | 3705 |
| 6 | 1 | 64.3 | 81.0 | 8 / 35 | 3953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 31% |
| darkcanuck.B26354 1.06 | 19 | 47% |
| stelo.PastFuture 2.3.2 | 17 | 24% |
| oog.melee.Capulet 1.2 | 16 | 56% |
| tripphippy.Alice 1.1 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| ntc.Opposite 1.5 | 2 | 50% |

Hadur died in 174 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 24% | 52 |
| stelo.PastFuture 2.3.2 | 38 | 22% | 43 |
| darkcanuck.B26354 1.06 | 33 | 19% | 43 |
| oog.melee.Capulet 1.2 | 23 | 13% | 34 |
| intruder.PrairieWolf 2.61 | 12 | 7% | 14 |
| ntc.Opposite 1.5 | 8 | 5% | 9 |
| tripphippy.Alice 1.1 | 8 | 5% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159453 melee ticks, 26541 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 59 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52191 sent, 47173 reached their opponent, 7805 virtual hits (16.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 295 over 6 battles (49.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.8 | 41 / 210 | 3.18 | 14.8% | 20907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 95 |
| hadur2.Hadur 3.17.1po | 2.2 | 14.8% | 41 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 45 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.3% | 12 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.5% | 4 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.3% | 8 |
| fm.mammillarias 1.3 | 8.7 | 5.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 70.8 | 3 / 35 | 3369 |
| 2 | 2 | 62.9 | 75.2 | 7 / 35 | 3594 |
| 3 | 2 | 63.7 | 77.5 | 9 / 35 | 3446 |
| 4 | 2 | 63.6 | 79.4 | 6 / 35 | 3527 |
| 5 | 2 | 63.9 | 79.0 | 6 / 35 | 3685 |
| 6 | 2 | 61.9 | 73.0 | 10 / 35 | 3286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 43% |
| gh.mini.Griezel 0.2 | 21 | 52% |
| spinnercat.micro.Tyger 0.1 | 7 | 43% |
| d414.nano.Quantum 1.0.0 | 5 | 100% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 68 | 40% | 88 |
| gh.mini.Griezel 0.2 | 37 | 22% | 47 |
| spinnercat.micro.Tyger 0.1 | 21 | 12% | 22 |
| d414.nano.Quantum 1.0.0 | 16 | 9% | 22 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 13 |
| timmit.nano.TimDog 0.33 | 10 | 6% | 11 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152180 melee ticks, 25155 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 79 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50162 sent, 45094 reached their opponent, 7181 virtual hits (15.9% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 237 over 6 battles (39.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 85.1 | 105 / 210 | 2.34 | 17.3% | 24983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.2 | 17.3% | 105 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.4% | 62 |
| apc.botM 3.0 | 3.0 | 12.3% | 16 |
| vjik.UnViolation 1.1 | 4.8 | 10.0% | 13 |
| lxx.ConceptA 0.8 | 4.8 | 9.9% | 2 |
| bayen.UbaMicro 1.4 | 6.2 | 8.8% | 2 |
| panzer.Panzer 0.2 | 7.5 | 7.1% | 1 |
| conscience.Electron 1.3g | 7.8 | 6.9% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 87.3 | 16 / 35 | 4325 |
| 2 | 2 | 64.0 | 80.0 | 10 / 35 | 3963 |
| 3 | 1 | 65.8 | 83.8 | 19 / 35 | 4073 |
| 4 | 1 | 66.2 | 85.4 | 19 / 35 | 4131 |
| 5 | 1 | 65.8 | 84.8 | 21 / 35 | 4002 |
| 6 | 1 | 68.0 | 89.5 | 20 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 75 | 55% |
| apc.botM 3.0 | 33 | 91% |
| vjik.UnViolation 1.1 | 15 | 73% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| yk.JahMicro 1.0 | 6 | 50% |
| lxx.ConceptA 0.8 | 6 | 100% |
| panzer.Panzer 0.2 | 5 | 80% |
| donjezza.Jezza 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 46% | 88 |
| apc.botM 3.0 | 14 | 13% | 44 |
| lxx.ConceptA 0.8 | 11 | 10% | 18 |
| panzer.Panzer 0.2 | 10 | 9% | 11 |
| vjik.UnViolation 1.1 | 8 | 7% | 20 |
| bayen.UbaMicro 1.4 | 6 | 6% | 12 |
| conscience.Electron 1.3g | 3 | 3% | 8 |
| yk.JahMicro 1.0 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 127592 melee ticks, 42123 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43102 sent, 38445 reached their opponent, 6947 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 6 battles (17.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.8 | 112 / 210 | 2.10 | 18.7% | 27758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.7% | 112 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 19 |
| labg.Cataclysm 2.05 | 4.5 | 10.7% | 15 |
| baal.nano.N 1.42 | 6.2 | 9.2% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 1 |
| zyx.micro.Ant 1.1 | 8.5 | 5.1% | 1 |
| sanja.First 0.1 | 8.7 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 12 / 35 | 4379 |
| 2 | 1 | 69.2 | 89.2 | 21 / 35 | 4583 |
| 3 | 1 | 70.7 | 90.5 | 23 / 35 | 5207 |
| 4 | 1 | 68.9 | 87.9 | 18 / 35 | 4770 |
| 5 | 1 | 69.6 | 90.8 | 20 / 35 | 4424 |
| 6 | 1 | 67.6 | 84.8 | 18 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 79% |
| gre.svman4.Leonidas 1.3.2 | 24 | 71% |
| labg.Cataclysm 2.05 | 11 | 73% |
| baal.nano.N 1.42 | 9 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 40% | 84 |
| gre.svman4.Leonidas 1.3.2 | 23 | 23% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 16% | 52 |
| labg.Cataclysm 2.05 | 11 | 11% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 5% | 7 |
| zyx.micro.Ant 1.1 | 3 | 3% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 173519 melee ticks, 48035 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 66 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55212 sent, 50452 reached their opponent, 7489 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.2 | 70 / 210 | 2.33 | 17.4% | 28152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.5 | 17.4% | 70 |
| stelo.Spread 0.9 | 2.0 | 16.6% | 69 |
| kid.Gladiator .7.2 | 2.5 | 15.8% | 44 |
| tcf.Reach 3 | 4.5 | 11.0% | 9 |
| jcs.Seth 1.8 | 4.7 | 11.1% | 17 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 8.8 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 13 / 35 | 4735 |
| 2 | 3 | 64.8 | 77.5 | 7 / 35 | 4197 |
| 3 | 1 | 69.2 | 88.3 | 16 / 35 | 5279 |
| 4 | 2 | 66.5 | 82.9 | 8 / 35 | 4435 |
| 5 | 1 | 67.3 | 86.7 | 12 / 35 | 4399 |
| 6 | 1 | 69.5 | 90.2 | 14 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 57 | 54% |
| kid.Gladiator .7.2 | 50 | 44% |
| jcs.Seth 1.8 | 17 | 24% |
| cli.Dancer 1.1 | 7 | 100% |
| tcf.Reach 3 | 7 | 43% |
| amk.Punbot.Punbot 0.01 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 41% | 75 |
| stelo.Spread 0.9 | 44 | 31% | 76 |
| jcs.Seth 1.8 | 20 | 14% | 24 |
| tcf.Reach 3 | 15 | 11% | 22 |
| cli.Dancer 1.1 | 2 | 1% | 8 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 0 |

Posture (Hadur's M records, 202 rounds): 166888 melee ticks, 54020 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 47 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 52855 sent, 48084 reached their opponent, 8084 virtual hits (16.8% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 307 over 6 battles (51.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 82.2 | 35 / 210 | 2.60 | 15.8% | 22097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 146 |
| hadur2.Hadur 3.17.1po | 2.0 | 15.8% | 35 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.3% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 7 |
| rz.HawkOnFire 0.1 | 4.7 | 11.9% | 3 |
| wit.Chuliath 1.0 | 6.3 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.2 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 85.4 | 8 / 35 | 3715 |
| 2 | 2 | 64.8 | 81.0 | 6 / 35 | 3781 |
| 3 | 2 | 63.1 | 79.0 | 5 / 35 | 3176 |
| 4 | 2 | 65.3 | 82.5 | 6 / 35 | 3825 |
| 5 | 2 | 64.5 | 81.0 | 5 / 35 | 3586 |
| 6 | 2 | 65.6 | 84.1 | 5 / 35 | 4014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 82 | 13% |
| gh.mini.Gruwel 0.9 | 19 | 42% |
| rz.HawkOnFire 0.1 | 11 | 82% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 58% | 115 |
| gh.mini.Gruwel 0.9 | 28 | 16% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 14% | 30 |
| rz.HawkOnFire 0.1 | 17 | 10% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 148370 melee ticks, 43086 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46085 sent, 41238 reached their opponent, 6281 virtual hits (15.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 240 over 6 battles (40.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.0 | 139 / 210 | 1.81 | 20.1% | 31386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.1% | 139 |
| alpha.RainingFire 1.0 | 2.5 | 12.6% | 27 |
| bzdp.Pansy 2.1 | 2.7 | 12.6% | 17 |
| mz.Cork 0.1 | 4.3 | 11.1% | 10 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.1% | 9 |
| bvh.micro.Freya 0.3 | 6.0 | 9.9% | 7 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 25 / 35 | 5330 |
| 2 | 1 | 68.8 | 87.0 | 20 / 35 | 4946 |
| 3 | 1 | 70.0 | 89.5 | 25 / 35 | 5082 |
| 4 | 1 | 71.2 | 93.3 | 25 / 35 | 5722 |
| 5 | 1 | 71.0 | 93.0 | 25 / 35 | 5366 |
| 6 | 1 | 68.8 | 88.3 | 19 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 79% |
| alpha.RainingFire 1.0 | 35 | 69% |
| mz.Cork 0.1 | 30 | 83% |
| bvh.micro.Freya 0.3 | 30 | 90% |
| m3thos.Eva02 0.7.1 | 15 | 80% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 33% | 41 |
| bzdp.Pansy 2.1 | 16 | 22% | 50 |
| m3thos.Eva02 0.7.1 | 9 | 12% | 25 |
| bvh.mini.Fenrir 0.39 | 9 | 12% | 19 |
| bvh.micro.Freya 0.3 | 7 | 10% | 25 |
| mz.Cork 0.1 | 5 | 7% | 36 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 143937 melee ticks, 41843 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49955 sent, 45415 reached their opponent, 9499 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.9 | 160 / 210 | 2.00 | 19.5% | 33907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.5% | 160 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.3% | 12 |
| EBBU.Sim2 1.02 | 3.3 | 10.1% | 3 |
| germ.TheMind .2 | 4.0 | 10.1% | 11 |
| agrach.Dalek 1.0 | 5.0 | 9.5% | 10 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.4% | 6 |
| lmk.ACPFinal 0.1 | 7.3 | 8.2% | 4 |
| mb.Beast 0.1 | 7.3 | 8.1% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 1 |
| skm.Ryubot 1.0 | 9.8 | 6.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.1 | 24 / 35 | 5873 |
| 2 | 1 | 68.1 | 86.7 | 27 / 35 | 5513 |
| 3 | 1 | 67.9 | 86.3 | 27 / 35 | 5384 |
| 4 | 1 | 68.3 | 88.3 | 26 / 35 | 5598 |
| 5 | 1 | 70.6 | 97.1 | 29 / 35 | 5837 |
| 6 | 1 | 69.1 | 90.2 | 27 / 35 | 5702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 34 | 85% |
| agrach.Dalek 1.0 | 28 | 93% |
| EBBU.Sim2 1.02 | 22 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 90% |
| germ.TheMind .2 | 20 | 85% |
| mb.Beast 0.1 | 20 | 100% |
| lmk.ACPFinal 0.1 | 19 | 95% |
| skm.Ryubot 1.0 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 28% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 20% | 44 |
| lmk.ACPFinal 0.1 | 7 | 14% | 23 |
| agrach.Dalek 1.0 | 6 | 12% | 35 |
| mb.Beast 0.1 | 4 | 8% | 19 |
| stelo.UntouchableNano 1.3 | 4 | 8% | 19 |
| EBBU.Sim2 1.02 | 3 | 6% | 26 |
| germ.TheMind .2 | 2 | 4% | 19 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 200 rounds): 94707 melee ticks, 26765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 18 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 31945 sent, 27581 reached their opponent, 8054 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.0 | 96 / 210 | 2.26 | 17.7% | 26403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.3 | 17.7% | 96 |
| justin.Mallais 14.0 | 1.7 | 16.1% | 62 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 17 |
| cs.Wren 1.0 | 4.7 | 10.5% | 7 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.8% | 16 |
| kdf.KoulDestroyer 1.0 | 5.3 | 9.8% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.9% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.6 | 15 / 35 | 4224 |
| 2 | 1 | 66.4 | 84.1 | 13 / 35 | 4279 |
| 3 | 1 | 68.3 | 87.6 | 22 / 35 | 4405 |
| 4 | 2 | 67.4 | 85.7 | 15 / 35 | 4514 |
| 5 | 1 | 68.8 | 89.2 | 18 / 35 | 4844 |
| 6 | 2 | 65.7 | 81.0 | 13 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 60 | 62% |
| bts.mega.Gnarly 1.4 | 25 | 68% |
| bvh.mini.Freya 0.55 | 20 | 65% |
| cs.Wren 1.0 | 20 | 95% |
| kdf.KoulDestroyer 1.0 | 11 | 55% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 41% | 78 |
| bts.mega.Gnarly 1.4 | 18 | 16% | 41 |
| bvh.mini.Freya 0.55 | 17 | 15% | 28 |
| kdf.KoulDestroyer 1.0 | 13 | 11% | 16 |
| cs.Wren 1.0 | 12 | 10% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 3% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 137146 melee ticks, 35122 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45852 sent, 40815 reached their opponent, 8767 virtual hits (21.5% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 221 over 6 battles (36.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.6 | 95 / 210 | 2.30 | 17.9% | 28974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.9% | 95 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 21 |
| az.Ololobot 0.2.4 | 3.2 | 13.1% | 52 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 36 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.4% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.2% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.5% | 4 |
| gimp.GimpBot 0.1 | 7.2 | 7.4% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.5 | 13 / 35 | 4734 |
| 2 | 1 | 67.6 | 87.0 | 18 / 35 | 4828 |
| 3 | 1 | 67.4 | 86.0 | 17 / 35 | 4818 |
| 4 | 1 | 66.5 | 84.1 | 12 / 35 | 4763 |
| 5 | 1 | 67.4 | 85.7 | 16 / 35 | 4920 |
| 6 | 1 | 68.0 | 87.3 | 19 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 48 | 48% |
| bvh.fry.Freya 0.82 | 43 | 86% |
| catcat20.Lambda 0.024 | 26 | 54% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 35% | 67 |
| az.Ololobot 0.2.4 | 39 | 33% | 68 |
| catcat20.Lambda 0.024 | 22 | 19% | 35 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 12 |
| gimp.GimpBot 0.1 | 3 | 3% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 12 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 162014 melee ticks, 45683 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 52174 sent, 47559 reached their opponent, 8588 virtual hits (18.1% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.4 | 122 / 210 | 2.04 | 19.2% | 29525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.2% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 41 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.7% | 14 |
| mz.AntiGrav 1.0 | 4.0 | 11.2% | 12 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.7% | 8 |
| stelo.Randomness 1.0 | 6.0 | 9.4% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.1% | 0 |
| sample.Corners 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 21 / 35 | 4758 |
| 2 | 1 | 69.2 | 89.2 | 19 / 35 | 4994 |
| 3 | 1 | 69.9 | 88.9 | 23 / 35 | 5280 |
| 4 | 1 | 68.9 | 88.6 | 21 / 35 | 4663 |
| 5 | 1 | 69.5 | 89.2 | 21 / 35 | 4777 |
| 6 | 1 | 68.5 | 85.1 | 17 / 35 | 5053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kano.gamma.KanoGamma 1.8 | 48 | 92% |
| kawigi.mini.Coriantumr 1.1 | 45 | 58% |
| mz.AntiGrav 1.0 | 24 | 88% |
| Polkwane.SmashMelee 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 14 | 79% |
| alpha.BlackIce 1.0 | 5 | 80% |

Hadur died in 89 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 45% | 63 |
| kano.gamma.KanoGamma 1.8 | 15 | 17% | 59 |
| stelo.Randomness 1.0 | 11 | 12% | 29 |
| mz.AntiGrav 1.0 | 8 | 9% | 19 |
| Polkwane.SmashMelee 1.0 | 6 | 7% | 22 |
| alpha.BlackIce 1.0 | 6 | 7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149345 melee ticks, 35442 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 80 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50022 sent, 45295 reached their opponent, 9427 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 552 over 6 battles (92.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.6 | 91 / 210 | 2.30 | 17.4% | 24966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.2 | 17.4% | 91 |
| eem.EvBotNG v12.8 | 1.8 | 16.0% | 77 |
| ary.Swarm 1.1 | 3.5 | 12.7% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.1% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 12 |
| shrub.Silver v048 | 6.0 | 9.0% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 15 / 35 | 4279 |
| 2 | 1 | 68.0 | 90.2 | 15 / 35 | 4219 |
| 3 | 2 | 66.4 | 82.2 | 13 / 35 | 4293 |
| 4 | 1 | 68.2 | 87.9 | 13 / 35 | 4404 |
| 5 | 1 | 67.5 | 84.8 | 19 / 35 | 4065 |
| 6 | 1 | 66.3 | 83.5 | 16 / 35 | 3706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 42% |
| lessonz.robocode.Oz 0.5.0 | 32 | 81% |
| ary.Swarm 1.1 | 20 | 75% |
| simonton.nano.MeleeSeed 1.8 | 15 | 67% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 44% | 92 |
| lessonz.robocode.Oz 0.5.0 | 22 | 18% | 33 |
| ary.Swarm 1.1 | 21 | 17% | 45 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 22 |
| stelo.Mirror 1.1 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| shrub.Silver v048 | 0 | 0% | 6 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 154258 melee ticks, 42708 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51021 sent, 46288 reached their opponent, 7130 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 127 / 210 | 1.85 | 19.7% | 33628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.7% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 16.2% | 48 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 10 |
| ara.Shera 0.88 | 3.7 | 12.6% | 22 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 0 |
| dsw.StaticD 1.0 | 6.2 | 7.0% | 3 |
| maribo.IotaCT 1.1 | 7.7 | 6.2% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 21 / 35 | 5446 |
| 2 | 1 | 69.9 | 89.8 | 24 / 35 | 5531 |
| 3 | 1 | 70.1 | 89.2 | 22 / 35 | 5529 |
| 4 | 1 | 70.0 | 90.5 | 19 / 35 | 5823 |
| 5 | 1 | 70.4 | 90.2 | 21 / 35 | 5935 |
| 6 | 1 | 69.8 | 91.4 | 20 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 96 | 80% |
| maribo.mini.MiniQuester 0.1 | 39 | 87% |
| ara.Shera 0.88 | 19 | 58% |
| dsw.StaticD 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 35% | 103 |
| ara.Shera 0.88 | 29 | 34% | 44 |
| maribo.mini.MiniQuester 0.1 | 15 | 17% | 49 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| amz.NanoClone 1.41 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166727 melee ticks, 49762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52865 sent, 48146 reached their opponent, 9552 virtual hits (19.8% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 531 over 6 battles (88.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.5 | 25 / 210 | 3.02 | 15.0% | 22521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 150 |
| hadur2.Hadur 3.17.1po | 2.0 | 15.0% | 25 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.1% | 21 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.4% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 3 |
| mz.NanoGod 2.02 | 7.0 | 8.1% | 2 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 82.9 | 6 / 35 | 4479 |
| 2 | 2 | 64.3 | 76.5 | 3 / 35 | 3740 |
| 3 | 2 | 64.8 | 80.0 | 2 / 35 | 3746 |
| 4 | 2 | 64.4 | 77.5 | 4 / 35 | 3508 |
| 5 | 2 | 65.9 | 80.3 | 6 / 35 | 3807 |
| 6 | 2 | 61.2 | 67.9 | 4 / 35 | 3241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 18% |
| brainfade.melee.Dusk 0.44 | 11 | 27% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| dummy.micro.Sparrow 2.5 | 5 | 20% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 56% | 121 |
| brainfade.melee.Dusk 0.44 | 25 | 13% | 28 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 6% | 16 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154080 melee ticks, 42332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 24 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50259 sent, 45156 reached their opponent, 7583 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 450 over 6 battles (75.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.9 | 146 / 210 | 1.64 | 20.7% | 33951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.7% | 146 |
| stelo.Liblix 0.3.1 | 2.3 | 15.2% | 39 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.4% | 21 |
| jwirde.Gort 2.0 | 4.5 | 9.8% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 1 |
| wompi.Quokka 1.6 | 6.8 | 7.2% | 0 |
| disan.Chair 2.2.0 | 6.8 | 7.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 25 / 35 | 5464 |
| 2 | 1 | 70.0 | 88.3 | 19 / 35 | 5686 |
| 3 | 1 | 72.4 | 96.5 | 28 / 35 | 5884 |
| 4 | 1 | 70.6 | 91.7 | 23 / 35 | 5498 |
| 5 | 1 | 72.0 | 96.8 | 28 / 35 | 5708 |
| 6 | 1 | 70.9 | 91.4 | 23 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 71% |
| tzu.TheArtOfWar 1.2 | 63 | 86% |
| jwirde.Gort 2.0 | 17 | 100% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 57% | 103 |
| tzu.TheArtOfWar 1.2 | 15 | 22% | 67 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 10% | 10 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 5 |
| jwirde.Gort 2.0 | 1 | 1% | 18 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| wompi.Quokka 1.6 | 1 | 1% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154324 melee ticks, 51606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 37 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53910 sent, 49303 reached their opponent, 10070 virtual hits (20.4% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 433 over 6 battles (72.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.5 | 93 / 210 | 2.21 | 19.3% | 33191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.3% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.8% | 90 |
| jje.BagPuss 1.2 | 2.8 | 12.5% | 11 |
| sul.Lunar 1.1 | 4.3 | 10.1% | 8 |
| myl.nano.Graviton 1.10 | 4.3 | 10.3% | 3 |
| hvilela.HVilela 0.9 | 6.2 | 8.8% | 1 |
| fm.claire 1.7 | 7.2 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.7% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.9% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 10 / 35 | 5500 |
| 2 | 1 | 69.8 | 88.6 | 20 / 35 | 5428 |
| 3 | 1 | 69.8 | 90.8 | 17 / 35 | 5439 |
| 4 | 1 | 68.3 | 83.2 | 13 / 35 | 5761 |
| 5 | 1 | 68.7 | 85.1 | 17 / 35 | 5497 |
| 6 | 1 | 68.5 | 84.1 | 16 / 35 | 5566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 39% |
| jje.BagPuss 1.2 | 26 | 77% |
| sul.Lunar 1.1 | 17 | 88% |
| myl.nano.Graviton 1.10 | 9 | 100% |
| wit.Deep7 2.0 | 8 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 1483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 43% | 0 |
| jje.BagPuss 1.2 | 26 | 22% | 75 |
| sul.Lunar 1.1 | 11 | 9% | 39 |
| fm.claire 1.7 | 10 | 8% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 19 |
| myl.nano.Graviton 1.10 | 5 | 4% | 35 |
| wit.Deep7 2.0 | 4 | 3% | 12 |
| hvilela.HVilela 0.9 | 3 | 3% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 190532 melee ticks, 98314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 60119 sent, 55369 reached their opponent, 8461 virtual hits (15.3% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 6 battles (71.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.2 | 56 / 210 | 2.51 | 16.1% | 23641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 68 |
| hadur2.Hadur 3.17.1po | 2.2 | 16.1% | 56 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.5% | 74 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 2 |
| cx.Princess 1.0 | 4.8 | 10.0% | 9 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.9 | 14 / 35 | 4082 |
| 2 | 1 | 66.3 | 86.7 | 11 / 35 | 4067 |
| 3 | 3 | 62.9 | 78.4 | 3 / 35 | 3660 |
| 4 | 2 | 66.2 | 82.5 | 11 / 35 | 4336 |
| 5 | 3 | 64.5 | 81.6 | 9 / 35 | 3642 |
| 6 | 3 | 64.8 | 81.9 | 8 / 35 | 3854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 51% |
| rsalesc.melee.Medina 0.4.5 | 39 | 28% |
| cx.Princess 1.0 | 10 | 70% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| mz.MicroSheep 1.0 | 3 | 67% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 65 | 41% | 75 |
| kc.mini.Mirage 0.2 | 63 | 40% | 93 |
| mz.MicroSheep 1.0 | 9 | 6% | 15 |
| cx.Princess 1.0 | 8 | 5% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| sadoner.killer 0.2 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 151996 melee ticks, 39739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45002 sent, 40189 reached their opponent, 6002 virtual hits (14.9% of those reached).

