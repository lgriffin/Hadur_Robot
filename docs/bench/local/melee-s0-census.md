# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 4 battles (94.3 per battle, most in one battle 99). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.5 | 32 / 140 | 2.39 | 16.4% | 17962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 93 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.4% | 32 |
| sgp.JollyNinja 3.53 | 3.3 | 11.9% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 10.1% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 10.2% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.4 | 7 / 35 | 4859 |
| 2 | 2 | 65.6 | 84.1 | 11 / 35 | 4142 |
| 3 | 2 | 66.1 | 85.1 | 8 / 35 | 4547 |
| 4 | 2 | 65.5 | 84.4 | 6 / 35 | 4414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 76 | 12% |
| sgp.JollyNinja 3.53 | 13 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| mz.MicroGodMelee 1 | 6 | 100% |
| adt.Ar2 1.0 | 2 | 50% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 113 of 140 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 80 | 71% | 90 |
| sgp.JollyNinja 3.53 | 11 | 10% | 17 |
| lorneswork.Predator 1.0 | 8 | 7% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 4% | 8 |
| adt.Ar2 1.0 | 4 | 4% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| mz.MicroGodMelee 1 | 0 | 0% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 96856 melee ticks, 53695 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 74 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 31543 sent, 28561 reached their opponent, 6270 virtual hits (22.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.9% ± 0.6 | 65.2% ± 0.7 | +0.7 ± 0.4 |
| Survival | 84.5% ± 0.6 | 84.0% ± 2.7 | +0.6 ± 2.2 |
| Rounds won | 22.9% ± 9.8 | 15.0% ± 6.8 | +7.9 ± 6.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| adt.Ar2 1.0 | 68.1% ± 3.0 | 69.3% ± 1.9 | -1.2 ± 3.2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 60.4% ± 1.8 | 58.4% ± 1.0 | +2.0 ± 2.7 |
| kawigi.sbf.FloodSonnet 0.9 | 75.3% ± 2.7 | 72.1% ± 3.6 | +3.3 ± 5.0 |
| mz.MicroGodMelee 1 | 61.6% ± 1.0 | 61.2% ± 4.3 | +0.4 ± 4.2 |
| skm.butterfly 1.0 | 78.7% ± 3.2 | 78.4% ± 2.4 | +0.4 ± 4.2 |
| sgp.JollyNinja 3.53 | 58.0% ± 3.1 | 57.2% ± 2.0 | +0.8 ± 4.8 |
| lorneswork.Predator 1.0 | 62.1% ± 3.4 | 61.1% ± 3.4 | +1.0 ± 3.3 |
| voidious.Diamond 1.8.28 | 45.2% ± 1.1 | 43.3% ± 0.5 | +1.9 ± 1.4 |
| mym.EdgeStalker 1.0 | 83.7% ± 2.1 | 85.7% ± 3.5 | -2.0 ± 2.9 |

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 410 over 4 battles (102.5 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 84.0 | 21 / 140 | 2.44 | 15.8% | 16676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 105 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.8% | 21 |
| sgp.JollyNinja 3.53 | 3.5 | 11.8% | 8 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.3% | 2 |
| lorneswork.Predator 1.0 | 5.3 | 10.1% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 10.1% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.1% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 84.8 | 6 / 35 | 3861 |
| 2 | 2 | 64.8 | 81.6 | 7 / 35 | 4147 |
| 3 | 2 | 65.7 | 85.4 | 4 / 35 | 4554 |
| 4 | 2 | 64.9 | 84.1 | 4 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 82 | 4% |
| sgp.JollyNinja 3.53 | 11 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 2 | 50% |
| mz.MicroGodMelee 1 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 124 of 140 rounds, at a mean tick of 1135. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 86 | 69% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 11% | 19 |
| sgp.JollyNinja 3.53 | 11 | 9% | 15 |
| lorneswork.Predator 1.0 | 5 | 4% | 5 |
| mz.MicroGodMelee 1 | 4 | 3% | 6 |
| adt.Ar2 1.0 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 99113 melee ticks, 52811 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 97 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 32094 sent, 29025 reached their opponent, 6076 virtual hits (20.9% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 4 battles (120.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.3 | 59 / 140 | 2.59 | 16.9% | 16233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 16.9% | 59 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.2% | 28 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 11.0% | 12 |
| Noran.BitchingElk 0.054 | 6.8 | 8.2% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 1 |
| sch.Simone 0.3d | 7.3 | 7.9% | 10 |
| stelo.PatternRobot 1.0 | 9.0 | 6.3% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 84.8 | 15 / 35 | 3611 |
| 2 | 1 | 67.5 | 84.8 | 21 / 35 | 4328 |
| 3 | 1 | 64.8 | 80.6 | 10 / 35 | 4109 |
| 4 | 1 | 64.8 | 79.0 | 13 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 23 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 79% |
| Noran.BitchingElk 0.054 | 11 | 27% |
| sch.Simone 0.3d | 7 | 86% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 85 of 140 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 23 | 27% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 12 | 14% | 27 |
| Noran.BitchingElk 0.054 | 12 | 14% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 11% | 21 |
| fnc.bandit.Bandit 5.2.0 | 5 | 6% | 6 |
| stelo.PatternRobot 1.0 | 5 | 6% | 6 |
| sch.Simone 0.3d | 4 | 5% | 12 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 116244 melee ticks, 26800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 56 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 41390 sent, 38354 reached their opponent, 7100 virtual hits (18.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.7% ± 2.0 | 66.4% ± 1.3 | -0.7 ± 2.3 |
| Survival | 82.3% ± 4.6 | 83.6% ± 3.3 | -1.3 ± 7.2 |
| Rounds won | 42.1% ± 21.1 | 49.3% ± 12.0 | -7.1 ± 23.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| fullsail.SweetTea 1.1 | 83.0% ± 3.8 | 79.3% ± 3.4 | +3.7 ± 3.1 |
| fnc.bandit.Bandit 5.2.0 | 67.5% ± 2.1 | 69.4% ± 1.2 | -1.9 ± 1.4 |
| Noran.BitchingElk 0.054 | 67.4% ± 1.6 | 69.5% ± 2.7 | -2.1 ± 3.7 |
| lrem.micro.SpikeSoldier 0.4 | 60.5% ± 0.8 | 61.1% ± 3.7 | -0.6 ± 4.1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 60.7% ± 3.6 | 63.7% ± 1.9 | -3.0 ± 4.9 |
| pulsar.PulsarMax 0.8.9 | 54.4% ± 3.8 | 53.2% ± 3.2 | +1.1 ± 3.0 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56.4% ± 3.4 | 56.4% ± 1.7 | +0.0 ± 3.5 |
| sch.Simone 0.3d | 68.2% ± 5.0 | 68.8% ± 5.0 | -0.6 ± 9.5 |
| stelo.PatternRobot 1.0 | 72.9% ± 4.7 | 76.2% ± 2.0 | -3.4 ± 5.6 |

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 394 over 4 battles (98.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.6 | 69 / 140 | 2.48 | 17.3% | 16515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.3% | 69 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.2% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.4% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 7 |
| Noran.BitchingElk 0.054 | 6.8 | 7.6% | 8 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.6% | 0 |
| sch.Simone 0.3d | 7.3 | 7.9% | 6 |
| stelo.PatternRobot 1.0 | 9.3 | 5.4% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.3 | 15 / 35 | 4030 |
| 2 | 1 | 66.8 | 83.2 | 19 / 35 | 4349 |
| 3 | 1 | 67.3 | 86.3 | 20 / 35 | 4203 |
| 4 | 1 | 66.1 | 83.5 | 15 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 85% |
| pulsar.PulsarMax 0.8.9 | 30 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 45% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| sch.Simone 0.3d | 9 | 67% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 75 of 140 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 37% | 39 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 15 | 20% | 43 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 11% | 17 |
| Noran.BitchingElk 0.054 | 6 | 8% | 8 |
| sch.Simone 0.3d | 5 | 7% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 7% | 11 |
| stelo.PatternRobot 1.0 | 3 | 4% | 3 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
| fnc.bandit.Bandit 5.2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 114628 melee ticks, 26050 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 65 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 40908 sent, 37832 reached their opponent, 6920 virtual hits (18.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 4 battles (88.0 per battle, most in one battle 95). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.8 | 90 / 140 | 2.28 | 18.2% | 20274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.2% | 90 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 15 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.2% | 11 |
| vuen.Cake 2.51 | 3.3 | 13.0% | 18 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.0% | 2 |
| adt.Ar1 2.1 | 7.0 | 7.6% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.3 | 23 / 35 | 5030 |
| 2 | 1 | 67.7 | 83.8 | 23 / 35 | 5412 |
| 3 | 1 | 67.3 | 85.1 | 20 / 35 | 5072 |
| 4 | 1 | 67.3 | 86.0 | 24 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 32 | 75% |
| radnor.DoctorBob 1.42 | 32 | 100% |
| kawigi.nano.Lib 1.0 | 29 | 97% |
| urdos.URDOS 1.3 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| adt.Ar1 2.1 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 54 of 140 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 28% | 42 |
| vuen.Cake 2.51 | 9 | 17% | 36 |
| urdos.URDOS 1.3 | 9 | 17% | 14 |
| kawigi.nano.Lib 1.0 | 8 | 15% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 7% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 6% | 4 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 84114 melee ticks, 26787 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 49 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 26386 sent, 23495 reached their opponent, 6495 virtual hits (27.6% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.7% ± 0.7 | 70.7% ± 1.0 | -3.0 ± 1.7 |
| Survival | 85.8% ± 3.0 | 94.1% ± 3.6 | -8.3 ± 5.8 |
| Rounds won | 64.3% ± 7.9 | 80.0% ± 6.4 | -15.7 ± 5.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| vuen.Cake 2.51 | 58.4% ± 2.3 | 61.7% ± 1.2 | -3.3 ± 2.5 |
| kawigi.nano.Lib 1.0 | 57.8% ± 1.9 | 60.5% ± 2.3 | -2.7 ± 4.2 |
| adt.Ar1 2.1 | 70.6% ± 4.7 | 73.6% ± 0.5 | -3.0 ± 5.1 |
| oa.weak.FlyMk1 0.1 | 72.3% ± 3.3 | 76.2% ± 2.3 | -3.9 ± 5.4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 78.1% ± 2.1 | 77.8% ± 3.2 | +0.3 ± 5.0 |
| urdos.URDOS 1.3 | 64.9% ± 1.4 | 68.9% ± 1.9 | -4.0 ± 3.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 78.2% ± 2.4 | 81.9% ± 3.7 | -3.7 ± 2.9 |
| radnor.DoctorBob 1.42 | 56.3% ± 2.6 | 60.0% ± 2.7 | -3.7 ± 3.3 |
| ghent.ArthurPanzergon 1.0.0 | 72.3% ± 4.6 | 75.6% ± 2.6 | -3.3 ± 5.9 |

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 382 over 4 battles (95.5 per battle, most in one battle 102). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.1 | 112 / 140 | 1.53 | 20.4% | 23257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.4% | 112 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 13 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.3% | 3 |
| vuen.Cake 2.51 | 4.0 | 12.7% | 10 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 27 / 35 | 5532 |
| 2 | 1 | 70.6 | 94.0 | 28 / 35 | 5821 |
| 3 | 1 | 71.0 | 94.9 | 27 / 35 | 5982 |
| 4 | 1 | 71.3 | 96.5 | 30 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 44 | 93% |
| kawigi.nano.Lib 1.0 | 35 | 97% |
| radnor.DoctorBob 1.42 | 33 | 91% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 32 of 140 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 34% | 34 |
| vuen.Cake 2.51 | 5 | 16% | 50 |
| urdos.URDOS 1.3 | 4 | 13% | 4 |
| kawigi.nano.Lib 1.0 | 3 | 9% | 36 |
| oa.weak.FlyMk1 0.1 | 3 | 9% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 91635 melee ticks, 29827 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 48 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 28472 sent, 25533 reached their opponent, 7118 virtual hits (27.9% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 414 over 4 battles (103.5 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.1 | 13 / 140 | 2.43 | 16.4% | 19250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 112 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.4% | 13 |
| apc.LeeroyJenkins2 1.0 | 3.3 | 13.0% | 8 |
| TNT.TNT 0.99.1 | 3.8 | 11.5% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 83.2 | 3 / 35 | 4640 |
| 2 | 2 | 66.3 | 83.8 | 2 / 35 | 4829 |
| 3 | 2 | 68.1 | 86.3 | 6 / 35 | 5330 |
| 4 | 2 | 65.8 | 83.2 | 2 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 82 | 5% |
| TNT.TNT 0.99.1 | 12 | 58% |
| apc.LeeroyJenkins2 1.0 | 8 | 25% |

Hadur died in 131 of 140 rounds, at a mean tick of 1308. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 88 | 67% | 91 |
| apc.LeeroyJenkins2 1.0 | 16 | 12% | 19 |
| TNT.TNT 0.99.1 | 12 | 9% | 19 |
| josago.Jorgito 0.16 | 10 | 8% | 10 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 132143 melee ticks, 47791 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 87 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 41610 sent, 38509 reached their opponent, 6156 virtual hits (16.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.6% ± 1.6 | 66.5% ± 1.0 | +0.0 ± 2.0 |
| Survival | 84.1% ± 2.4 | 84.0% ± 4.0 | +0.1 ± 4.1 |
| Rounds won | 9.3% ± 8.6 | 10.7% ± 9.4 | -1.4 ± 17.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| apc.LeeroyJenkins2 1.0 | 56.0% ± 3.6 | 56.0% ± 1.6 | +0.0 ± 3.8 |
| josago.Jorgito 0.16 | 64.0% ± 4.9 | 64.1% ± 2.9 | -0.1 ± 6.1 |
| rampancy.Durandal 2.1d | 75.3% ± 1.9 | 75.2% ± 4.1 | +0.1 ± 2.9 |
| tj.zombie1n 1.0.1 | 71.8% ± 2.0 | 71.1% ± 2.6 | +0.7 ± 4.4 |
| TNT.TNT 0.99.1 | 58.8% ± 1.3 | 60.4% ± 3.6 | -1.7 ± 3.6 |
| css.Delitioner 0.11 | 69.9% ± 5.0 | 67.6% ± 4.5 | +2.2 ± 5.6 |
| aaa.r.ScalarR 0.005g.047 | 41.6% ± 3.0 | 41.6% ± 2.4 | +0.0 ± 5.3 |
| spin.Bugstard 0.012b | 81.7% ± 3.2 | 81.8% ± 2.3 | -0.1 ± 3.4 |
| sp.Nanos.Ember 1.1 | 80.1% ± 3.0 | 80.8% ± 1.9 | -0.8 ± 2.8 |

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 314 over 4 battles (78.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.0 | 15 / 140 | 2.44 | 16.4% | 19322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 115 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.4% | 15 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 6 |
| TNT.TNT 0.99.1 | 4.3 | 10.8% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.9% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.9% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 84.8 | 4 / 35 | 4847 |
| 2 | 2 | 65.6 | 80.3 | 6 / 35 | 4731 |
| 3 | 2 | 66.6 | 85.7 | 1 / 35 | 4687 |
| 4 | 2 | 67.1 | 85.4 | 4 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 75 | 5% |
| TNT.TNT 0.99.1 | 9 | 56% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| spin.Bugstard 0.012b | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 1249. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 92 | 72% | 98 |
| apc.LeeroyJenkins2 1.0 | 14 | 11% | 15 |
| TNT.TNT 0.99.1 | 11 | 9% | 17 |
| josago.Jorgito 0.16 | 4 | 3% | 5 |
| css.Delitioner 0.11 | 2 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 134141 melee ticks, 38242 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 34 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 41447 sent, 38425 reached their opponent, 5991 virtual hits (15.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 414 over 4 battles (103.5 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.2 | 19 / 140 | 2.96 | 14.5% | 13146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 70 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 36 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.5% | 19 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 11 |
| ms.Ares 0.19 | 5.5 | 8.8% | 0 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 77.1 | 4 / 35 | 3321 |
| 2 | 3 | 61.2 | 75.6 | 3 / 35 | 2791 |
| 3 | 3 | 64.5 | 82.2 | 7 / 35 | 3596 |
| 4 | 3 | 63.1 | 77.8 | 5 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 25 | 4% |
| justin.DemonicRage 3.4 | 21 | 43% |
| wompi.Numbat 2.1 | 9 | 67% |
| axeBots.HataMoto 3.09 | 4 | 50% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 52 | 42% | 54 |
| justin.DemonicRage 3.4 | 40 | 32% | 46 |
| wompi.Numbat 2.1 | 15 | 12% | 21 |
| axeBots.HataMoto 3.09 | 10 | 8% | 12 |
| ms.Ares 0.19 | 2 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 102561 melee ticks, 25489 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 42 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 32513 sent, 29354 reached their opponent, 5101 virtual hits (17.4% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.9% ± 2.1 | 60.6% ± 2.0 | +2.3 ± 1.8 |
| Survival | 78.2% ± 4.5 | 72.1% ± 5.4 | +6.0 ± 5.9 |
| Rounds won | 13.6% ± 7.8 | 10.7% ± 4.4 | +2.9 ± 5.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 44.2% ± 4.5 | 42.6% ± 3.3 | +1.6 ± 5.3 |
| GarmBox.Oranges 1.0 | 77.1% ± 6.4 | 74.7% ± 3.5 | +2.4 ± 6.6 |
| wompi.Numbat 2.1 | 53.1% ± 1.6 | 50.9% ± 2.5 | +2.1 ± 3.3 |
| Queens_teamrobot.UltraRazor 1.0 | 78.2% ± 4.4 | 75.4% ± 2.5 | +2.8 ± 6.7 |
| davidalves.net.DuelistMicroMelee 1.4 | 73.2% ± 4.5 | 70.6% ± 1.7 | +2.6 ± 5.2 |
| supersample.SuperBoxBot 1.0 | 70.9% ± 2.6 | 71.0% ± 4.8 | -0.1 ± 4.3 |
| axeBots.HataMoto 3.09 | 61.4% ± 3.3 | 59.1% ± 1.8 | +2.4 ± 2.3 |
| justin.DemonicRage 3.4 | 46.0% ± 3.4 | 43.4% ± 3.3 | +2.6 ± 3.0 |
| ms.Ares 0.19 | 62.2% ± 3.8 | 57.7% ± 3.5 | +4.5 ± 6.6 |

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 309 over 4 battles (77.3 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 72.1 | 15 / 140 | 3.51 | 13.3% | 12217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.9% | 72 |
| justin.DemonicRage 3.4 | 1.5 | 17.3% | 41 |
| hadur2.Hadur 3.17.1aa | 3.3 | 13.3% | 15 |
| wompi.Numbat 2.1 | 3.8 | 12.8% | 8 |
| ms.Ares 0.19 | 5.0 | 9.7% | 2 |
| axeBots.HataMoto 3.09 | 6.0 | 9.2% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 72.4 | 4 / 35 | 2997 |
| 2 | 3 | 59.0 | 67.9 | 3 / 35 | 2868 |
| 3 | 4 | 60.8 | 72.1 | 5 / 35 | 3006 |
| 4 | 3 | 62.1 | 76.2 | 3 / 35 | 3346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 10% |
| justin.DemonicRage 3.4 | 17 | 24% |
| wompi.Numbat 2.1 | 5 | 100% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 51 | 40% | 55 |
| cb.fire.Firestarter 2.0f | 40 | 31% | 43 |
| wompi.Numbat 2.1 | 17 | 13% | 21 |
| axeBots.HataMoto 3.09 | 7 | 5% | 10 |
| ms.Ares 0.19 | 3 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 96809 melee ticks, 17612 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 46 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 30518 sent, 27538 reached their opponent, 4757 virtual hits (17.3% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 423 over 4 battles (105.8 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.2 | 86 / 140 | 1.88 | 19.0% | 18846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 86 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 13 |
| origin.SleepSiphon 1.7b | 3.3 | 12.7% | 20 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.6% | 8 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 2 |
| gg.Wolverine 2.0 | 5.5 | 9.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 6.4% | 1 |
| DBall.NUKE 0.1 | 8.5 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 25 / 35 | 4938 |
| 2 | 1 | 68.0 | 86.7 | 19 / 35 | 4656 |
| 3 | 1 | 68.2 | 89.2 | 21 / 35 | 4613 |
| 4 | 1 | 69.4 | 92.1 | 21 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 90% |
| origin.SleepSiphon 1.7b | 31 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 74% |
| gg.Wolverine 2.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| mld.Wisdom 1.0 | 3 | 67% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 59 of 140 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 19 | 32% | 42 |
| jekl.StoneGhost 0.7 | 10 | 17% | 43 |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 15% | 21 |
| mld.Wisdom 1.0 | 8 | 14% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 8 |
| gg.Wolverine 2.0 | 3 | 5% | 5 |
| DBall.NUKE 0.1 | 1 | 2% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 100525 melee ticks, 30926 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 66 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 32297 sent, 29312 reached their opponent, 6929 virtual hits (23.6% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.9% ± 1.5 | 66.7% ± 2.5 | +2.2 ± 3.8 |
| Survival | 90.2% ± 4.6 | 84.9% ± 4.6 | +5.3 ± 8.8 |
| Rounds won | 61.4% ± 11.4 | 45.7% ± 17.8 | +15.7 ± 28.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| ers.nano.hawk.HawkLA 3.0m | 72.7% ± 1.1 | 72.2% ± 3.9 | +0.6 ± 4.7 |
| jekl.StoneGhost 0.7 | 56.4% ± 1.7 | 54.3% ± 3.7 | +2.1 ± 5.1 |
| mld.Wisdom 1.0 | 65.4% ± 5.7 | 61.8% ± 3.2 | +3.6 ± 7.5 |
| gg.Wolverine 2.0 | 67.1% ± 0.7 | 66.8% ± 1.2 | +0.3 ± 0.5 |
| DBall.NUKE 0.1 | 75.8% ± 2.2 | 72.0% ± 5.8 | +3.7 ± 7.5 |
| origin.SleepSiphon 1.7b | 59.9% ± 3.3 | 55.3% ± 2.6 | +4.7 ± 5.6 |
| spinnercat.Omen 1.0 | 74.8% ± 5.4 | 73.7% ± 1.5 | +1.1 ± 6.5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 62.1% ± 1.2 | 59.2% ± 8.3 | +2.9 ± 7.3 |
| sample.Fire 1.0 | 85.7% ± 1.8 | 84.6% ± 2.3 | +1.1 ± 2.5 |

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 380 over 4 battles (95.0 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.9 | 64 / 140 | 2.36 | 17.3% | 17166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.3% | 64 |
| jekl.StoneGhost 0.7 | 2.5 | 14.6% | 18 |
| origin.SleepSiphon 1.7b | 3.0 | 14.0% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.0% | 15 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 2 |
| gg.Wolverine 2.0 | 5.8 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 5 |
| DBall.NUKE 0.1 | 8.0 | 6.7% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.9 | 12 / 35 | 3867 |
| 2 | 1 | 68.8 | 89.2 | 21 / 35 | 4814 |
| 3 | 1 | 66.2 | 83.5 | 14 / 35 | 4345 |
| 4 | 1 | 66.5 | 84.1 | 17 / 35 | 4140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 32 | 56% |
| jekl.StoneGhost 0.7 | 27 | 85% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 57% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| gg.Wolverine 2.0 | 3 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 82 of 140 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 31 | 38% | 50 |
| jekl.StoneGhost 0.7 | 17 | 21% | 34 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 13% | 24 |
| mld.Wisdom 1.0 | 7 | 9% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 7 |
| gg.Wolverine 2.0 | 3 | 4% | 7 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 101669 melee ticks, 26271 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 39 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 32163 sent, 29303 reached their opponent, 7220 virtual hits (24.6% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 4 battles (109.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 71 / 140 | 1.71 | 19.5% | 22092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 19.5% | 71 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.6% | 30 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 24 |
| franzor.Lizt 1.3.1 | 4.0 | 11.2% | 11 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.5% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 18 / 35 | 5869 |
| 2 | 1 | 71.1 | 93.0 | 21 / 35 | 5162 |
| 3 | 2 | 70.0 | 91.4 | 13 / 35 | 5345 |
| 4 | 1 | 71.4 | 91.7 | 19 / 35 | 5716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 50 | 66% |
| rsalesc.melee.Monk 0.3.6c | 39 | 36% |
| franzor.Lizt 1.3.1 | 20 | 60% |
| oog.melee.CapuletDroid 1.1 | 13 | 92% |

Hadur died in 73 of 140 rounds, at a mean tick of 1513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 33 | 45% | 52 |
| rtk.Tachikoma 1.0 | 23 | 32% | 60 |
| franzor.Lizt 1.3.1 | 8 | 11% | 0 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 23 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 132579 melee ticks, 71112 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 47 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 40547 sent, 37454 reached their opponent, 7975 virtual hits (21.3% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 71.0% ± 1.0 | 70.9% ± 0.8 | +0.1 ± 1.7 |
| Survival | 92.1% ± 1.1 | 92.9% ± 2.3 | -0.8 ± 2.9 |
| Rounds won | 50.7% ± 15.5 | 45.0% ± 13.6 | +5.7 ± 27.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| drd.Dreadknoght 0.9 | 91.9% ± 2.6 | 90.7% ± 1.5 | +1.2 ± 2.0 |
| oog.melee.CapuletDroid 1.1 | 64.9% ± 1.3 | 64.4% ± 3.1 | +0.5 ± 1.9 |
| skm.PateranBotlock2 1.0 | 80.5% ± 1.5 | 82.0% ± 3.0 | -1.4 ± 4.4 |
| sample.Target 1.0 | 88.6% ± 2.6 | 88.7% ± 1.9 | -0.1 ± 3.7 |
| lrem.micro.MoggFanatic 0.2 | 70.3% ± 2.5 | 70.7% ± 2.8 | -0.4 ± 4.3 |
| franzor.Lizt 1.3.1 | 63.5% ± 1.1 | 62.9% ± 1.7 | +0.6 ± 2.2 |
| rtk.Tachikoma 1.0 | 54.7% ± 1.9 | 54.2% ± 1.0 | +0.5 ± 2.3 |
| exauge.GateKeeper 1.1.121g | 71.6% ± 4.3 | 72.3% ± 1.3 | -0.7 ± 3.3 |
| rsalesc.melee.Monk 0.3.6c | 52.6% ± 3.7 | 51.9% ± 1.7 | +0.7 ± 4.8 |

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 505 over 4 battles (126.3 per battle, most in one battle 219). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.9 | 63 / 140 | 1.64 | 19.4% | 21921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 63 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.9% | 40 |
| rtk.Tachikoma 1.0 | 3.0 | 16.3% | 22 |
| franzor.Lizt 1.3.1 | 4.3 | 11.4% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.7% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 13 / 35 | 5746 |
| 2 | 1 | 71.0 | 93.0 | 15 / 35 | 5662 |
| 3 | 1 | 71.4 | 94.9 | 20 / 35 | 5318 |
| 4 | 1 | 70.3 | 91.7 | 15 / 35 | 5195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 50 | 64% |
| rsalesc.melee.Monk 0.3.6c | 47 | 19% |
| franzor.Lizt 1.3.1 | 22 | 55% |
| oog.melee.CapuletDroid 1.1 | 11 | 91% |

Hadur died in 82 of 140 rounds, at a mean tick of 1549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 46% | 56 |
| rtk.Tachikoma 1.0 | 26 | 32% | 71 |
| franzor.Lizt 1.3.1 | 10 | 12% | 0 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 11 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 137470 melee ticks, 68710 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 32 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 41307 sent, 38242 reached their opponent, 8093 virtual hits (21.2% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 4 battles (115.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.0 | 85 / 140 | 2.08 | 18.6% | 17951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.6% | 85 |
| shrub.Vapour v159 | 2.3 | 13.0% | 17 |
| tm.Yuugao 1.0 | 3.0 | 12.4% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.2% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.3% | 5 |
| m3thos.Eva00 1.1 | 6.0 | 9.0% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.5% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.2% | 1 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.8 | 25 / 35 | 4439 |
| 2 | 1 | 68.6 | 88.6 | 23 / 35 | 4782 |
| 3 | 1 | 68.0 | 89.2 | 19 / 35 | 4529 |
| 4 | 1 | 66.6 | 84.4 | 18 / 35 | 4201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 31 | 71% |
| tm.Yuugao 1.0 | 29 | 79% |
| Krabb.sliNk.Garm 0.9u | 20 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 50% |

Hadur died in 59 of 140 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 15 | 25% | 35 |
| tm.Yuugao 1.0 | 14 | 24% | 42 |
| Krabb.sliNk.Garm 0.9u | 11 | 19% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 12% | 17 |
| m3thos.Eva00 1.1 | 4 | 7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 3% | 11 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 102757 melee ticks, 27353 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 79 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 34063 sent, 30947 reached their opponent, 6036 virtual hits (19.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.0% ± 1.6 | 68.0% ± 1.9 | +0.0 ± 1.9 |
| Survival | 88.0% ± 3.9 | 88.9% ± 6.2 | -0.9 ± 7.6 |
| Rounds won | 60.7% ± 15.0 | 59.3% ± 15.0 | +1.4 ± 9.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| tm.Yuugao 1.0 | 60.0% ± 3.8 | 57.7% ± 2.7 | +2.3 ± 4.4 |
| Krabb.sliNk.Garm 0.9u | 62.5% ± 3.2 | 62.4% ± 3.5 | +0.1 ± 5.2 |
| zyx.nano.BacillusComma 1.0 | 79.5% ± 4.0 | 79.4% ± 2.8 | +0.0 ± 4.9 |
| shrub.Vapour v159 | 58.9% ± 4.3 | 61.4% ± 2.9 | -2.5 ± 3.1 |
| com.spp.robocode.MostlyHarmless 010 | 64.3% ± 3.4 | 64.0% ± 4.3 | +0.3 ± 7.3 |
| jwst.DAD.DarkAndDarker 1.1 | 70.1% ± 1.7 | 69.8% ± 1.1 | +0.3 ± 2.6 |
| SHAM.WOW 1.4 | 75.2% ± 3.1 | 76.3% ± 2.1 | -1.1 ± 1.6 |
| m3thos.Eva00 1.1 | 67.5% ± 2.7 | 68.0% ± 3.7 | -0.5 ± 5.9 |
| qualidafial.MajorDick 1.0.1 | 74.0% ± 3.7 | 72.5% ± 5.1 | +1.5 ± 2.4 |

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 404 over 4 battles (101.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.9 | 83 / 140 | 2.00 | 18.6% | 17555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 83 |
| tm.Yuugao 1.0 | 2.0 | 13.6% | 18 |
| shrub.Vapour v159 | 3.5 | 11.7% | 12 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.5% | 7 |
| m3thos.Eva00 1.1 | 6.3 | 8.7% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.0% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 0 |
| SHAM.WOW 1.4 | 8.8 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 25 / 35 | 4708 |
| 2 | 1 | 68.1 | 91.1 | 20 / 35 | 4237 |
| 3 | 1 | 66.5 | 83.2 | 21 / 35 | 4039 |
| 4 | 1 | 67.8 | 89.5 | 17 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 37 | 78% |
| shrub.Vapour v159 | 22 | 73% |
| Krabb.sliNk.Garm 0.9u | 19 | 58% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 77% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 78% |
| m3thos.Eva00 1.1 | 8 | 88% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 61 of 140 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 16 | 26% | 26 |
| tm.Yuugao 1.0 | 15 | 25% | 49 |
| shrub.Vapour v159 | 11 | 18% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 13% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 8 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 3 |
| m3thos.Eva00 1.1 | 1 | 2% | 5 |
| SHAM.WOW 1.4 | 1 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 100207 melee ticks, 33227 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 51 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 33460 sent, 30370 reached their opponent, 5914 virtual hits (19.5% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 334 over 4 battles (83.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 78.2 | 43 / 140 | 2.96 | 15.3% | 12901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.9% | 61 |
| hadur2.Hadur 3.17.1bb | 2.3 | 15.3% | 43 |
| kc.micro.Figment 1.0 | 2.8 | 14.9% | 18 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.7% | 7 |
| mc2.enemy.Original 0.9 | 5.8 | 9.1% | 9 |
| dft.Calliope 5.6 | 6.5 | 8.3% | 1 |
| step.nanoPri 1.0 | 8.8 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.3 | 13 / 35 | 3446 |
| 2 | 3 | 61.5 | 73.0 | 8 / 35 | 2894 |
| 3 | 2 | 63.5 | 78.7 | 11 / 35 | 3169 |
| 4 | 2 | 64.2 | 80.6 | 11 / 35 | 3392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 31 | 32% |
| kc.micro.Figment 1.0 | 30 | 87% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| mc2.enemy.Original 0.9 | 6 | 33% |
| yagami.Tidus 0.11 | 4 | 75% |

Hadur died in 101 of 140 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 36 | 36% | 49 |
| kc.micro.Figment 1.0 | 17 | 17% | 37 |
| mc2.enemy.Original 0.9 | 16 | 16% | 19 |
| yagami.Tidus 0.11 | 10 | 10% | 11 |
| pedersen.Grishnakh 1.0 | 8 | 8% | 11 |
| robar.nano.Assertive_Melee 0.2 | 5 | 5% | 5 |
| dft.Calliope 5.6 | 3 | 3% | 5 |
| rdm.Dueler 0.4x | 2 | 2% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 105639 melee ticks, 22991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 42 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 34266 sent, 31275 reached their opponent, 4538 virtual hits (14.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.4% ± 2.2 | 63.8% ± 1.8 | -0.3 ± 1.5 |
| Survival | 78.2% ± 5.6 | 77.2% ± 1.6 | +1.0 ± 5.8 |
| Rounds won | 30.7% ± 9.4 | 36.4% ± 15.5 | -5.7 ± 6.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| step.nanoPri 1.0 | 72.8% ± 4.9 | 73.0% ± 3.1 | -0.2 ± 5.6 |
| rdm.Dueler 0.4x | 76.4% ± 3.2 | 76.1% ± 3.2 | +0.3 ± 6.3 |
| robar.nano.Assertive_Melee 0.2 | 74.9% ± 3.6 | 77.5% ± 2.6 | -2.7 ± 5.3 |
| pedersen.Grishnakh 1.0 | 61.3% ± 6.7 | 58.7% ± 2.4 | +2.7 ± 6.5 |
| kc.micro.Figment 1.0 | 50.6% ± 4.4 | 52.5% ± 1.7 | -1.8 ± 4.3 |
| yagami.Tidus 0.11 | 59.8% ± 5.0 | 58.4% ± 3.1 | +1.4 ± 3.9 |
| mc2.enemy.Original 0.9 | 62.7% ± 4.2 | 62.4% ± 4.7 | +0.3 ± 2.7 |
| positive.Portia 1.26e | 47.4% ± 2.6 | 49.3% ± 3.4 | -1.9 ± 2.3 |
| dft.Calliope 5.6 | 64.8% ± 3.9 | 66.0% ± 2.8 | -1.1 ± 4.9 |

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 424 over 4 battles (106.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.2 | 51 / 140 | 3.05 | 15.5% | 13783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.0% | 51 |
| hadur2.Hadur 3.17.1aa | 1.8 | 15.5% | 51 |
| kc.micro.Figment 1.0 | 3.0 | 14.1% | 14 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 12 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 2 |
| mc2.enemy.Original 0.9 | 6.0 | 9.4% | 7 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 76.8 | 16 / 35 | 3588 |
| 2 | 2 | 62.3 | 76.8 | 8 / 35 | 3091 |
| 3 | 2 | 64.9 | 78.7 | 13 / 35 | 3771 |
| 4 | 2 | 63.5 | 76.5 | 14 / 35 | 3333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 29 | 93% |
| positive.Portia 1.26e | 24 | 29% |
| yagami.Tidus 0.11 | 6 | 100% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| dft.Calliope 5.6 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 95 of 140 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 35 | 37% | 46 |
| yagami.Tidus 0.11 | 18 | 19% | 22 |
| kc.micro.Figment 1.0 | 11 | 12% | 32 |
| mc2.enemy.Original 0.9 | 8 | 8% | 14 |
| pedersen.Grishnakh 1.0 | 6 | 6% | 10 |
| rdm.Dueler 0.4x | 4 | 4% | 4 |
| dft.Calliope 5.6 | 3 | 3% | 7 |
| step.nanoPri 1.0 | 3 | 3% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 101551 melee ticks, 25794 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 39 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 33384 sent, 30509 reached their opponent, 4653 virtual hits (15.3% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 434 over 4 battles (108.5 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.4 | 113 / 140 | 1.50 | 20.1% | 20389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.1% | 113 |
| DTF.Kludgy 1.2b | 2.0 | 14.4% | 16 |
| ejb.Polaris 1.0.1 | 3.3 | 12.6% | 8 |
| ne.Chimera 1.2 | 3.8 | 12.5% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 1 |
| vStar.RAFzilla 2.15 | 5.5 | 9.5% | 2 |
| kurios.DOSexe .9b | 7.3 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.8% | 0 |
| sam.Samspin 1.0 | 9.3 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.7 | 28 / 35 | 4831 |
| 2 | 1 | 71.3 | 97.1 | 29 / 35 | 5289 |
| 3 | 1 | 70.9 | 95.6 | 30 / 35 | 5051 |
| 4 | 1 | 70.3 | 93.3 | 26 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 47 | 85% |
| ejb.Polaris 1.0.1 | 31 | 90% |
| ne.Chimera 1.2 | 19 | 100% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| vStar.RAFzilla 2.15 | 8 | 88% |
| kurios.DOSexe .9b | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 33 of 140 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 45% | 48 |
| ejb.Polaris 1.0.1 | 4 | 12% | 33 |
| tvv.micro.Antares 1.1.1 | 4 | 12% | 16 |
| vStar.RAFzilla 2.15 | 2 | 6% | 14 |
| ne.Chimera 1.2 | 1 | 3% | 14 |
| donjezza.Muncho 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 101459 melee ticks, 37814 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 64 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 33126 sent, 30249 reached their opponent, 6190 virtual hits (20.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.4% ± 1.5 | 69.8% ± 0.7 | +0.6 ± 1.9 |
| Survival | 94.4% ± 3.8 | 92.3% ± 4.1 | +2.1 ± 6.1 |
| Rounds won | 80.7% ± 7.8 | 73.6% ± 6.8 | +7.1 ± 14.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| sam.Samspin 1.0 | 80.3% ± 5.5 | 78.4% ± 2.0 | +1.9 ± 7.5 |
| Grystrion.RandomTrackerNOREV 1.0 | 77.5% ± 4.0 | 80.6% ± 2.6 | -3.1 ± 2.0 |
| donjezza.Muncho 1.0 | 82.3% ± 1.8 | 82.5% ± 2.0 | -0.1 ± 2.3 |
| ejb.Polaris 1.0.1 | 61.5% ± 1.1 | 62.1% ± 4.2 | -0.6 ± 4.1 |
| ne.Chimera 1.2 | 61.7% ± 1.3 | 59.1% ± 2.0 | +2.5 ± 2.8 |
| DTF.Kludgy 1.2b | 58.3% ± 2.1 | 56.9% ± 3.4 | +1.3 ± 5.4 |
| vStar.RAFzilla 2.15 | 67.9% ± 2.8 | 64.6% ± 2.6 | +3.3 ± 2.2 |
| kurios.DOSexe .9b | 76.9% ± 3.3 | 76.6% ± 4.3 | +0.3 ± 6.6 |
| tvv.micro.Antares 1.1.1 | 67.0% ± 4.3 | 67.2% ± 1.1 | -0.1 ± 4.6 |

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 393 over 4 battles (98.3 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.3 | 103 / 140 | 1.69 | 19.5% | 20055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 103 |
| DTF.Kludgy 1.2b | 2.5 | 14.8% | 20 |
| ne.Chimera 1.2 | 3.0 | 13.5% | 9 |
| ejb.Polaris 1.0.1 | 3.8 | 11.9% | 4 |
| vStar.RAFzilla 2.15 | 4.8 | 10.7% | 5 |
| tvv.micro.Antares 1.1.1 | 6.0 | 9.5% | 0 |
| kurios.DOSexe .9b | 7.5 | 6.0% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 95.2 | 27 / 35 | 4841 |
| 2 | 1 | 70.1 | 93.7 | 25 / 35 | 5205 |
| 3 | 1 | 69.4 | 90.5 | 24 / 35 | 5043 |
| 4 | 1 | 69.5 | 89.8 | 27 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 40 | 83% |
| ne.Chimera 1.2 | 27 | 81% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| ejb.Polaris 1.0.1 | 15 | 100% |
| tvv.micro.Antares 1.1.1 | 7 | 100% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 41 of 140 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 37% | 41 |
| ne.Chimera 1.2 | 13 | 32% | 33 |
| ejb.Polaris 1.0.1 | 3 | 7% | 30 |
| vStar.RAFzilla 2.15 | 2 | 5% | 14 |
| sam.Samspin 1.0 | 2 | 5% | 4 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 97858 melee ticks, 37063 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 40 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 32820 sent, 29879 reached their opponent, 6093 virtual hits (20.4% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 422 over 4 battles (105.5 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.8 | 48 / 140 | 2.64 | 16.0% | 13546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 16.0% | 48 |
| rz.Aleph 0.34 | 1.8 | 15.6% | 43 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.5% | 17 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 11 |
| rdt199.Warlord 0.73 | 4.8 | 9.7% | 15 |
| br2.MobyDickBot 1.6 | 6.3 | 8.6% | 4 |
| uji.YellohFellah 1.0 | 7.0 | 8.0% | 2 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 6.1% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 79.4 | 11 / 35 | 3507 |
| 2 | 2 | 62.3 | 79.7 | 6 / 35 | 3159 |
| 3 | 1 | 66.2 | 86.7 | 17 / 35 | 3486 |
| 4 | 1 | 64.7 | 81.6 | 14 / 35 | 3394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 26 | 31% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| djc.DynaBot 0.1.1 | 11 | 45% |
| rdt199.Warlord 0.73 | 10 | 50% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| uji.YellohFellah 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 96 of 140 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 36 | 38% | 47 |
| cx.mini.Nimrod 0.55 | 19 | 20% | 28 |
| rdt199.Warlord 0.73 | 15 | 16% | 22 |
| djc.DynaBot 0.1.1 | 9 | 9% | 16 |
| br2.MobyDickBot 1.6 | 4 | 4% | 10 |
| uji.YellohFellah 1.0 | 3 | 3% | 7 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 109339 melee ticks, 23174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 47 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 35637 sent, 32572 reached their opponent, 4560 virtual hits (14.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.1% ± 2.7 | 64.4% ± 1.8 | -0.3 ± 3.4 |
| Survival | 81.8% ± 5.4 | 81.3% ± 3.7 | +0.5 ± 7.5 |
| Rounds won | 34.3% ± 21.3 | 37.1% ± 6.4 | -2.9 ± 24.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| KiraNL.Chupacabra 0.4 | 68.3% ± 4.5 | 69.2% ± 1.4 | -0.9 ± 3.6 |
| uji.YellohFellah 1.0 | 66.7% ± 4.0 | 65.3% ± 1.1 | +1.4 ± 5.0 |
| rdt199.Warlord 0.73 | 62.3% ± 7.0 | 63.3% ± 6.6 | -1.0 ± 7.5 |
| djc.DynaBot 0.1.1 | 58.8% ± 1.7 | 59.1% ± 3.0 | -0.3 ± 3.4 |
| jeremyreeder.Vincent 2011.12.09 | 72.5% ± 3.4 | 75.1% ± 1.9 | -2.6 ± 4.6 |
| rz.Aleph 0.34 | 50.7% ± 4.9 | 48.8% ± 2.1 | +1.9 ± 4.0 |
| cx.mini.Nimrod 0.55 | 56.4% ± 6.2 | 56.4% ± 0.8 | +0.0 ± 6.4 |
| br2.MobyDickBot 1.6 | 65.2% ± 5.4 | 64.5% ± 1.9 | +0.6 ± 3.7 |
| stelo.MirrorNano 1.3 | 76.2% ± 5.8 | 77.6% ± 6.2 | -1.3 ± 10.6 |

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 434 over 4 battles (108.5 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.3 | 52 / 140 | 2.68 | 16.0% | 13823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.8% | 48 |
| hadur2.Hadur 3.17.1aa | 1.8 | 16.0% | 52 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 16 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 8 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 7 |
| rdt199.Warlord 0.73 | 5.8 | 9.3% | 5 |
| uji.YellohFellah 1.0 | 6.5 | 8.5% | 5 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 84.8 | 15 / 35 | 3711 |
| 2 | 2 | 63.5 | 79.7 | 13 / 35 | 3200 |
| 3 | 2 | 64.1 | 80.6 | 12 / 35 | 3540 |
| 4 | 2 | 63.8 | 80.3 | 12 / 35 | 3372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 34 | 53% |
| rdt199.Warlord 0.73 | 13 | 77% |
| cx.mini.Nimrod 0.55 | 11 | 82% |
| djc.DynaBot 0.1.1 | 10 | 70% |
| br2.MobyDickBot 1.6 | 6 | 50% |
| uji.YellohFellah 1.0 | 5 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 92 of 140 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 33 | 36% | 54 |
| cx.mini.Nimrod 0.55 | 19 | 21% | 27 |
| djc.DynaBot 0.1.1 | 10 | 11% | 16 |
| rdt199.Warlord 0.73 | 9 | 10% | 15 |
| br2.MobyDickBot 1.6 | 7 | 8% | 12 |
| KiraNL.Chupacabra 0.4 | 6 | 7% | 8 |
| uji.YellohFellah 1.0 | 3 | 3% | 6 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 108837 melee ticks, 22724 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 32 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 35654 sent, 32571 reached their opponent, 4576 virtual hits (14.0% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 406 over 4 battles (101.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.8 | 72 / 140 | 2.37 | 17.0% | 13707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.0% | 72 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.6% | 28 |
| darkcanuck.Leon 1.01 | 3.3 | 12.9% | 13 |
| nat.PallasHawk 1.0 | 3.5 | 12.9% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.8% | 5 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.4% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.7% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.9 | 19 / 35 | 3545 |
| 2 | 1 | 64.2 | 79.7 | 15 / 35 | 3365 |
| 3 | 1 | 66.1 | 86.0 | 18 / 35 | 3340 |
| 4 | 1 | 66.5 | 85.4 | 20 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 32 | 81% |
| bts.wiki.RipCurl 0.9b | 31 | 71% |
| nat.PallasHawk 1.0 | 20 | 70% |
| brainfade.melee.Genghis 0.36 | 7 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 72 of 140 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 17 | 24% | 34 |
| nat.PallasHawk 1.0 | 17 | 24% | 32 |
| darkcanuck.Leon 1.01 | 11 | 15% | 34 |
| brainfade.melee.Genghis 0.36 | 9 | 13% | 17 |
| jrm.Test0 1.0 | 7 | 10% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 6 |
| jp.Perpy 16.0 | 2 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 91424 melee ticks, 22663 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 71 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 31076 sent, 27928 reached their opponent, 4819 virtual hits (17.3% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.9% ± 1.9 | 64.8% ± 1.8 | +1.1 ± 1.6 |
| Survival | 84.8% ± 5.7 | 80.6% ± 6.9 | +4.1 ± 6.7 |
| Rounds won | 51.4% ± 9.8 | 49.3% ± 8.6 | +2.1 ± 12.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 56.9% ± 3.1 | 55.9% ± 5.3 | +1.0 ± 5.0 |
| stuff.Vlad 0.1 | 75.8% ± 2.9 | 75.3% ± 2.3 | +0.5 ± 4.4 |
| jaybot.bots.Oddball 4.0 | 77.0% ± 2.8 | 76.6% ± 3.8 | +0.5 ± 5.6 |
| jrm.Test0 1.0 | 67.4% ± 1.7 | 64.8% ± 8.4 | +2.6 ± 7.6 |
| brainfade.melee.Genghis 0.36 | 63.4% ± 4.1 | 61.7% ± 3.1 | +1.7 ± 1.3 |
| cs.sheldor.Talon 1.1 | 69.8% ± 2.6 | 70.7% ± 2.8 | -0.9 ± 1.9 |
| darkcanuck.Leon 1.01 | 57.0% ± 3.8 | 54.6% ± 1.8 | +2.4 ± 5.3 |
| bts.wiki.RipCurl 0.9b | 53.9% ± 3.5 | 54.3% ± 2.1 | -0.4 ± 4.9 |
| jp.Perpy 16.0 | 71.8% ± 3.7 | 69.3% ± 1.1 | +2.5 ± 3.4 |

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 371 over 4 battles (92.8 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.6 | 69 / 140 | 2.74 | 16.3% | 13418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 16.3% | 69 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.8% | 19 |
| nat.PallasHawk 1.0 | 3.3 | 12.9% | 23 |
| darkcanuck.Leon 1.01 | 3.3 | 13.5% | 21 |
| brainfade.melee.Genghis 0.36 | 5.3 | 10.1% | 7 |
| jrm.Test0 1.0 | 6.0 | 8.9% | 1 |
| jp.Perpy 16.0 | 7.0 | 7.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 78.1 | 16 / 35 | 3424 |
| 2 | 1 | 63.5 | 76.2 | 16 / 35 | 3421 |
| 3 | 1 | 65.4 | 82.5 | 20 / 35 | 3246 |
| 4 | 1 | 66.1 | 85.7 | 17 / 35 | 3327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 38 | 82% |
| nat.PallasHawk 1.0 | 19 | 74% |
| bts.wiki.RipCurl 0.9b | 19 | 68% |
| brainfade.melee.Genghis 0.36 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 76 of 140 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 18 | 24% | 33 |
| nat.PallasHawk 1.0 | 15 | 20% | 28 |
| darkcanuck.Leon 1.01 | 14 | 18% | 43 |
| brainfade.melee.Genghis 0.36 | 9 | 12% | 15 |
| jrm.Test0 1.0 | 9 | 12% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 7 |
| jp.Perpy 16.0 | 1 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 88299 melee ticks, 25464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 40 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 30693 sent, 27532 reached their opponent, 4797 virtual hits (17.4% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 367 over 4 battles (91.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.4 | 36 / 140 | 2.76 | 15.3% | 14701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.8% | 59 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 24 |
| hadur2.Hadur 3.17.1bb | 2.5 | 15.3% | 36 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 9 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.1% | 10 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 4.9% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 83.8 | 11 / 35 | 3689 |
| 2 | 1 | 65.8 | 86.0 | 10 / 35 | 3979 |
| 3 | 3 | 61.7 | 73.3 | 7 / 35 | 3571 |
| 4 | 3 | 63.5 | 78.4 | 8 / 35 | 3462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 31 | 39% |
| ags.Glacier 0.2.11 | 26 | 65% |
| shinh.Entangled 0.3 | 9 | 44% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 107 of 140 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 39 | 36% | 57 |
| mn.Combat 3.25.0 | 24 | 22% | 37 |
| shinh.Entangled 0.3 | 18 | 17% | 21 |
| gh.micro.Gruweltje 0.7 | 15 | 14% | 16 |
| stelo.Wang 1.0 | 4 | 4% | 5 |
| maribo.FollowFire 1 | 3 | 3% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 96887 melee ticks, 27370 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 73 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 29059 sent, 25971 reached their opponent, 4446 virtual hits (17.1% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.1% ± 3.0 | 62.7% ± 1.3 | +1.4 ± 3.6 |
| Survival | 80.4% ± 9.1 | 76.8% ± 3.6 | +3.6 ± 11.8 |
| Rounds won | 25.7% ± 8.3 | 14.3% ± 8.3 | +11.4 ± 5.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| mn.Combat 3.25.0 | 47.5% ± 4.7 | 44.7% ± 2.3 | +2.8 ± 7.0 |
| shinh.Entangled 0.3 | 56.5% ± 1.1 | 54.3% ± 3.3 | +2.2 ± 4.0 |
| maribo.FollowFire 1 | 76.2% ± 3.6 | 77.0% ± 1.5 | -0.8 ± 4.0 |
| gh.micro.Gruweltje 0.7 | 55.8% ± 3.2 | 54.3% ± 1.9 | +1.5 ± 4.5 |
| sample.Tracker 1.0 | 82.3% ± 2.4 | 81.0% ± 1.5 | +1.3 ± 3.2 |
| stelo.Wang 1.0 | 69.7% ± 5.2 | 68.2% ± 2.7 | +1.5 ± 7.2 |
| ags.Glacier 0.2.11 | 48.4% ± 5.0 | 46.6% ± 1.1 | +1.8 ± 4.9 |
| ayk.WallHugger 1.0 | 75.5% ± 4.1 | 73.7% ± 6.3 | +1.8 ± 7.5 |
| apc.Colossus2 0.17 | 64.9% ± 2.1 | 64.6% ± 1.6 | +0.3 ± 2.6 |

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 567 over 4 battles (141.8 per battle, most in one battle 228). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 76.8 | 20 / 140 | 3.09 | 14.3% | 14313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 17.8% | 70 |
| ags.Glacier 0.2.11 | 2.0 | 16.4% | 29 |
| hadur2.Hadur 3.17.1aa | 3.0 | 14.3% | 20 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 13 |
| gh.micro.Gruweltje 0.7 | 4.8 | 12.1% | 8 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 74.3 | 6 / 35 | 3467 |
| 2 | 3 | 63.4 | 77.1 | 7 / 35 | 3544 |
| 3 | 3 | 63.5 | 79.7 | 4 / 35 | 3774 |
| 4 | 3 | 62.2 | 76.2 | 3 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 32 | 9% |
| ags.Glacier 0.2.11 | 24 | 50% |
| shinh.Entangled 0.3 | 6 | 50% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 43 | 34% | 47 |
| ags.Glacier 0.2.11 | 37 | 30% | 49 |
| shinh.Entangled 0.3 | 21 | 17% | 22 |
| gh.micro.Gruweltje 0.7 | 11 | 9% | 12 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| maribo.FollowFire 1 | 2 | 2% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 104405 melee ticks, 21302 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 47 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 30745 sent, 27577 reached their opponent, 4677 virtual hits (17.0% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 4 battles (78.0 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.7 | 98 / 140 | 1.66 | 19.7% | 20305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.7% | 98 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.1% | 10 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.4% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 10.3% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.5% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 97.1 | 27 / 35 | 5486 |
| 2 | 1 | 69.0 | 88.9 | 23 / 35 | 4880 |
| 3 | 1 | 69.9 | 92.7 | 27 / 35 | 5003 |
| 4 | 1 | 69.4 | 92.1 | 21 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 45 | 67% |
| simonton.micro.Sprout 1.1.3 | 36 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 45 of 140 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 19 | 42% | 44 |
| simonton.micro.Sprout 1.1.3 | 11 | 24% | 42 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 11% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 7% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 7% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 101515 melee ticks, 37141 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 48 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 31980 sent, 28983 reached their opponent, 7146 virtual hits (24.7% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 69.9% ± 1.7 | 70.0% ± 1.1 | -0.1 ± 1.8 |
| Survival | 92.7% ± 5.4 | 92.4% ± 4.2 | +0.3 ± 7.1 |
| Rounds won | 70.0% ± 13.6 | 72.9% ± 7.9 | -2.9 ± 11.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| Lo_Ian.Gandalf_V4 4.0 | 67.5% ± 0.7 | 67.4% ± 2.7 | +0.2 ± 2.4 |
| sample.TrackFire 1.0 | 92.1% ± 1.5 | 92.0% ± 2.3 | +0.1 ± 3.5 |
| pa.Improved 1.0 | 76.8% ± 2.1 | 76.9% ± 2.3 | -0.1 ± 1.8 |
| catcat20.shape.Theta 0.018 | 59.5% ± 4.2 | 60.4% ± 0.8 | -0.8 ± 4.7 |
| dmh.robocode.robot.RedDwarf 0.4 | 70.1% ± 2.9 | 71.2% ± 4.2 | -1.0 ± 5.5 |
| sheldor.micro.PointInLineRRAL 1.0 | 71.9% ± 3.5 | 71.6% ± 3.4 | +0.3 ± 6.1 |
| simonton.micro.Sprout 1.1.3 | 58.3% ± 2.6 | 55.9% ± 2.0 | +2.3 ± 1.7 |
| sanyi.mikrobi.Roberto 1.0 | 65.8% ± 3.8 | 67.3% ± 5.0 | -1.5 ± 8.2 |
| co.edu.usb.rc.LidisTron 1.0 | 67.3% ± 5.7 | 67.5% ± 4.6 | -0.1 ± 5.6 |

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 393 over 4 battles (98.3 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.4 | 102 / 140 | 1.69 | 19.6% | 19984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.6% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 13 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.6% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.8% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.0 | 26 / 35 | 5085 |
| 2 | 1 | 70.6 | 95.2 | 27 / 35 | 4872 |
| 3 | 1 | 69.3 | 90.2 | 26 / 35 | 4800 |
| 4 | 1 | 69.6 | 90.2 | 23 / 35 | 5227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 96% |
| catcat20.shape.Theta 0.018 | 32 | 66% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 60% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 80% |
| pa.Improved 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 42 of 140 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 13 | 31% | 34 |
| simonton.micro.Sprout 1.1.3 | 12 | 29% | 61 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 10% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 7% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 4 |
| pa.Improved 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 101864 melee ticks, 31391 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 81 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 32769 sent, 29871 reached their opponent, 7641 virtual hits (25.6% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 391 over 4 battles (97.8 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.9 | 69 / 140 | 2.27 | 17.9% | 17519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.9% | 69 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 12 |
| mld.DustBunny 3.8 | 3.0 | 12.7% | 7 |
| emp.Yngwie 1.11 | 3.5 | 12.6% | 32 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 5 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.5% | 13 |
| lambdaxy.TBot 0.1 | 7.5 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 8.8 | 5.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 15 / 35 | 4457 |
| 2 | 1 | 65.6 | 80.0 | 15 / 35 | 4345 |
| 3 | 1 | 67.8 | 87.9 | 17 / 35 | 4263 |
| 4 | 1 | 68.1 | 88.9 | 22 / 35 | 4454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 30 | 50% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| kawigi.robot.Girl 1.2 | 18 | 67% |
| mld.DustBunny 3.8 | 17 | 82% |
| cb.nano.Insomnia 1.0 | 5 | 80% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 75 of 140 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 41% | 49 |
| mld.DustBunny 3.8 | 14 | 19% | 28 |
| kawigi.robot.Girl 1.2 | 9 | 12% | 11 |
| kawigi.micro.Shiz 1.1 | 6 | 8% | 29 |
| Grystrion.TrackerWO 1.0 | 3 | 4% | 7 |
| cb.nano.Insomnia 1.0 | 3 | 4% | 6 |
| divineomega.TrialBot 0.003 | 3 | 4% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 117317 melee ticks, 31461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 47 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 38354 sent, 35313 reached their opponent, 5779 virtual hits (16.4% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.2% ± 1.8 | 66.1% ± 2.8 | +1.0 ± 3.9 |
| Survival | 85.9% ± 6.4 | 81.5% ± 6.4 | +4.4 ± 10.7 |
| Rounds won | 49.3% ± 15.0 | 45.0% ± 13.1 | +4.3 ± 22.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| mld.DustBunny 3.8 | 58.5% ± 3.2 | 58.2% ± 5.0 | +0.2 ± 7.2 |
| lambdaxy.TBot 0.1 | 71.9% ± 1.7 | 72.2% ± 5.8 | -0.4 ± 5.8 |
| divineomega.TrialBot 0.003 | 75.6% ± 3.5 | 75.4% ± 3.6 | +0.2 ± 5.9 |
| emp.Yngwie 1.11 | 58.6% ± 2.0 | 56.3% ± 2.2 | +2.4 ± 2.4 |
| kawigi.robot.Girl 1.2 | 65.3% ± 3.6 | 62.2% ± 3.8 | +3.2 ± 4.9 |
| cb.nano.Insomnia 1.0 | 65.1% ± 4.9 | 64.1% ± 1.7 | +1.0 ± 6.3 |
| Grystrion.TrackerWO 1.0 | 72.1% ± 4.8 | 72.7% ± 3.9 | -0.7 ± 6.8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 81.2% ± 5.1 | 80.6% ± 3.6 | +0.6 ± 8.7 |
| kawigi.micro.Shiz 1.1 | 56.3% ± 4.1 | 53.4% ± 4.4 | +2.9 ± 4.1 |

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 474 over 4 battles (118.5 per battle, most in one battle 199). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.5 | 63 / 140 | 2.66 | 17.1% | 17183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.1% | 63 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.9% | 22 |
| emp.Yngwie 1.11 | 3.3 | 13.3% | 34 |
| mld.DustBunny 3.8 | 4.0 | 12.2% | 2 |
| kawigi.robot.Girl 1.2 | 5.0 | 10.4% | 13 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.6% | 3 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.4% | 1 |
| divineomega.TrialBot 0.003 | 8.5 | 5.5% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.4 | 20 / 35 | 4566 |
| 2 | 1 | 67.0 | 83.5 | 14 / 35 | 4548 |
| 3 | 2 | 63.5 | 75.6 | 14 / 35 | 3737 |
| 4 | 1 | 66.6 | 82.5 | 15 / 35 | 4332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 55% |
| kawigi.micro.Shiz 1.1 | 16 | 100% |
| mld.DustBunny 3.8 | 15 | 93% |
| kawigi.robot.Girl 1.2 | 11 | 73% |
| cb.nano.Insomnia 1.0 | 7 | 86% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 83 of 140 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 28 | 34% | 45 |
| kawigi.micro.Shiz 1.1 | 16 | 19% | 32 |
| mld.DustBunny 3.8 | 13 | 16% | 26 |
| kawigi.robot.Girl 1.2 | 12 | 14% | 17 |
| cb.nano.Insomnia 1.0 | 6 | 7% | 9 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 109241 melee ticks, 25244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 55 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 36351 sent, 33336 reached their opponent, 5552 virtual hits (16.7% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 4 battles (108.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.4 | 69 / 140 | 2.22 | 18.4% | 19378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 69 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 33 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.4% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.9% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.6% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.1 | 15 / 35 | 4513 |
| 2 | 1 | 70.0 | 91.4 | 19 / 35 | 5104 |
| 3 | 1 | 68.3 | 85.1 | 19 / 35 | 4968 |
| 4 | 1 | 67.6 | 84.1 | 16 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 51 | 65% |
| techdude.forest.FlamingForest 1.1 | 25 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 75 of 140 rounds, at a mean tick of 1208. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 25 | 33% | 59 |
| techdude.forest.FlamingForest 1.1 | 18 | 24% | 36 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 17% | 19 |
| bvh.fnr.Fenrir 0.36l | 8 | 11% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 6 |
| tvv.nano.Polaris 1.2 | 2 | 3% | 4 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 125651 melee ticks, 42625 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 53 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 40739 sent, 37710 reached their opponent, 6524 virtual hits (17.3% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.4% ± 1.8 | 67.7% ± 0.7 | +0.7 ± 1.8 |
| Survival | 86.4% ± 5.4 | 84.9% ± 2.6 | +1.5 ± 5.7 |
| Rounds won | 49.3% ± 9.4 | 49.3% ± 7.8 | +0.0 ± 3.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| techdude.forest.FlamingForest 1.1 | 61.8% ± 5.6 | 61.9% ± 2.2 | -0.1 ± 5.7 |
| tvv.nano.Polaris 1.2 | 67.9% ± 5.7 | 67.6% ± 1.1 | +0.3 ± 6.4 |
| bvh.fnr.Fenrir 0.36l | 64.9% ± 3.4 | 65.3% ± 3.1 | -0.5 ± 3.7 |
| repositorio.NanoStep 1.0 | 79.5% ± 2.7 | 78.0% ± 2.1 | +1.5 ± 4.8 |
| asd.Cthulhu 1.3 | 80.4% ± 2.6 | 79.3% ± 2.4 | +1.1 ± 3.6 |
| gh.Griezel 0.5.2 | 52.8% ± 2.8 | 51.5% ± 2.0 | +1.3 ± 2.2 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57.0% ± 1.2 | 56.1% ± 3.6 | +0.9 ± 2.7 |
| divineomega.DivineBot 1.9.4.5 | 80.3% ± 3.2 | 78.7% ± 5.4 | +1.6 ± 6.3 |
| stelo.IntrinsicVolatility 1.4 | 70.7% ± 4.9 | 71.0% ± 1.8 | -0.2 ± 4.4 |

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 440 over 4 battles (110.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.9 | 69 / 140 | 2.36 | 17.9% | 18550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 69 |
| gh.Griezel 0.5.2 | 2.0 | 16.9% | 39 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.1% | 20 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.5% | 3 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 2 |
| asd.Cthulhu 1.3 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 15 / 35 | 4665 |
| 2 | 1 | 67.8 | 85.4 | 18 / 35 | 4863 |
| 3 | 1 | 67.9 | 85.4 | 19 / 35 | 4498 |
| 4 | 1 | 68.0 | 86.3 | 17 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 55 | 65% |
| techdude.forest.FlamingForest 1.1 | 19 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 92% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |

Hadur died in 76 of 140 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 28 | 37% | 61 |
| techdude.forest.FlamingForest 1.1 | 16 | 21% | 27 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 13% | 25 |
| bvh.fnr.Fenrir 0.36l | 6 | 8% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 5 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 4 |
| asd.Cthulhu 1.3 | 3 | 4% | 3 |
| divineomega.DivineBot 1.9.4.5 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 0 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 123648 melee ticks, 36896 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 24 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 39749 sent, 36785 reached their opponent, 6408 virtual hits (17.4% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 396 over 4 battles (99.0 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.7 | 61 / 140 | 2.29 | 18.1% | 19865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.1% | 61 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.5% | 19 |
| et.Predator 1.8 | 3.0 | 13.2% | 18 |
| cx.BlestPain 1.41 | 3.5 | 12.8% | 31 |
| ahf.NanoAndrew .4 | 5.0 | 10.2% | 7 |
| nic.Nicator 2.4 | 6.5 | 9.2% | 3 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.1% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 16 / 35 | 5131 |
| 2 | 1 | 66.8 | 84.8 | 14 / 35 | 4676 |
| 3 | 1 | 68.8 | 87.6 | 18 / 35 | 5159 |
| 4 | 1 | 67.3 | 84.1 | 13 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 76% |
| et.Predator 1.8 | 28 | 54% |
| cx.BlestPain 1.41 | 24 | 25% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| nic.Nicator 2.4 | 3 | 100% |

Hadur died in 83 of 140 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 26 | 31% | 39 |
| et.Predator 1.8 | 21 | 25% | 34 |
| oog.melee.Mercutio 1.0 | 17 | 20% | 38 |
| ahf.NanoAndrew .4 | 5 | 6% | 11 |
| maribo.melee.BMV 0.1 | 5 | 6% | 8 |
| nic.Nicator 2.4 | 2 | 2% | 6 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 111804 melee ticks, 39411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 80 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 38003 sent, 35058 reached their opponent, 7903 virtual hits (22.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.9% ± 1.6 | 67.8% ± 2.6 | +0.0 ± 3.9 |
| Survival | 85.7% ± 2.5 | 83.3% ± 6.2 | +2.4 ± 8.4 |
| Rounds won | 43.6% ± 10.1 | 47.1% ± 15.5 | -3.6 ± 25.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 57.3% ± 3.1 | 56.6% ± 3.5 | +0.8 ± 5.2 |
| et.Predator 1.8 | 57.9% ± 3.2 | 59.4% ± 3.9 | -1.4 ± 6.2 |
| maribo.melee.BMV 0.1 | 66.9% ± 3.7 | 68.4% ± 5.5 | -1.4 ± 7.2 |
| nic.Nicator 2.4 | 66.4% ± 2.8 | 65.1% ± 3.9 | +1.2 ± 5.0 |
| cx.BlestPain 1.41 | 58.7% ± 1.9 | 56.9% ± 5.6 | +1.8 ± 7.1 |
| ahf.NanoAndrew .4 | 64.1% ± 1.6 | 62.4% ± 2.6 | +1.7 ± 3.2 |
| goblin.Bender 2.4 | 87.6% ± 4.9 | 88.4% ± 4.1 | -0.8 ± 5.1 |
| edu.otg.spr.TheTeacher 1.2 | 74.9% ± 3.4 | 75.5% ± 1.5 | -0.6 ± 3.8 |
| tex.Longbot 0.4 | 77.0% ± 1.1 | 78.0% ± 2.8 | -1.0 ± 3.0 |

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 446 over 4 battles (111.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.3 | 66 / 140 | 2.50 | 18.0% | 20405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.0% | 66 |
| cx.BlestPain 1.41 | 2.5 | 13.7% | 36 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.8% | 20 |
| et.Predator 1.8 | 4.0 | 12.3% | 12 |
| ahf.NanoAndrew .4 | 4.8 | 10.9% | 3 |
| nic.Nicator 2.4 | 6.0 | 9.6% | 3 |
| maribo.melee.BMV 0.1 | 7.0 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.0 | 15 / 35 | 4707 |
| 2 | 1 | 68.1 | 83.2 | 17 / 35 | 5113 |
| 3 | 1 | 66.9 | 81.3 | 13 / 35 | 5102 |
| 4 | 1 | 70.1 | 88.9 | 21 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 79% |
| cx.BlestPain 1.41 | 22 | 32% |
| et.Predator 1.8 | 21 | 71% |
| ahf.NanoAndrew .4 | 5 | 100% |
| nic.Nicator 2.4 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |

Hadur died in 78 of 140 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 27 | 35% | 36 |
| et.Predator 1.8 | 18 | 23% | 33 |
| oog.melee.Mercutio 1.0 | 13 | 17% | 39 |
| ahf.NanoAndrew .4 | 8 | 10% | 14 |
| nic.Nicator 2.4 | 3 | 4% | 8 |
| maribo.melee.BMV 0.1 | 2 | 3% | 5 |
| tex.Longbot 0.4 | 2 | 3% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 110279 melee ticks, 39068 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 40 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 37620 sent, 34600 reached their opponent, 7937 virtual hits (22.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 454 over 4 battles (113.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 90.2 | 77 / 140 | 1.88 | 18.5% | 16953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 77 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.1% | 24 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.6% | 14 |
| uji.DBH 1.1 | 3.8 | 11.3% | 9 |
| ratosh.Nobo 0.21 | 5.5 | 9.1% | 3 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.7% | 2 |
| sigterm.Sigterm 1.0 | 7.0 | 7.9% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.3% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 90.2 | 20 / 35 | 4265 |
| 2 | 1 | 69.0 | 92.4 | 21 / 35 | 4284 |
| 3 | 1 | 66.6 | 87.6 | 15 / 35 | 4006 |
| 4 | 1 | 68.5 | 90.8 | 21 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 69% |
| agd.Mooserwirt2 2.7 | 23 | 74% |
| uji.DBH 1.1 | 19 | 84% |
| sigterm.Sigterm 1.0 | 10 | 20% |
| spinnercat.Robovirus 2.718 | 5 | 80% |
| stelo.WangRobot 1.0 | 4 | 100% |
| ratosh.Nobo 0.21 | 4 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |

Hadur died in 67 of 140 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 40% | 58 |
| agd.Mooserwirt2 2.7 | 11 | 16% | 23 |
| sigterm.Sigterm 1.0 | 10 | 15% | 12 |
| uji.DBH 1.1 | 7 | 10% | 22 |
| ratosh.Nobo 0.21 | 4 | 6% | 7 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |
| stelo.WangRobot 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 98056 melee ticks, 31298 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 55 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 1.

Targeting waves (137 rounds): 32886 sent, 29795 reached their opponent, 6802 virtual hits (22.8% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.0% ± 1.7 | 67.8% ± 1.9 | +0.1 ± 2.9 |
| Survival | 90.2% ± 3.2 | 88.3% ± 5.5 | +1.9 ± 7.3 |
| Rounds won | 55.0% ± 13.1 | 60.0% ± 16.6 | -5.0 ± 26.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 59.6% ± 3.3 | 61.0% ± 3.6 | -1.4 ± 2.4 |
| sigterm.Sigterm 1.0 | 70.2% ± 4.9 | 67.3% ± 3.2 | +2.9 ± 7.5 |
| spinnercat.Robovirus 2.718 | 68.1% ± 1.0 | 67.3% ± 3.7 | +0.8 ± 3.5 |
| uji.DBH 1.1 | 62.1% ± 6.2 | 63.1% ± 3.2 | -0.9 ± 8.4 |
| ratosh.Nobo 0.21 | 67.1% ± 4.0 | 69.3% ± 2.1 | -2.2 ± 4.4 |
| morbid.MorbidPriest 1.0 | 56.9% ± 2.1 | 57.0% ± 3.4 | -0.1 ± 5.4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 79.1% ± 4.8 | 77.9% ± 3.0 | +1.2 ± 2.1 |
| kawigi.mini.Fhqwhgads 1.1 | 71.7% ± 3.8 | 71.3% ± 3.9 | +0.4 ± 1.1 |
| stelo.WangRobot 1.0 | 77.0% ± 3.7 | 76.3% ± 3.0 | +0.7 ± 6.2 |

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 433 over 4 battles (108.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.3 | 84 / 140 | 2.05 | 18.5% | 17321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.5% | 84 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 24 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.8% | 13 |
| uji.DBH 1.1 | 3.8 | 10.9% | 6 |
| sigterm.Sigterm 1.0 | 5.5 | 9.0% | 8 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.0% | 3 |
| ratosh.Nobo 0.21 | 6.8 | 8.2% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.5% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.6 | 17 / 35 | 4311 |
| 2 | 1 | 68.8 | 90.2 | 23 / 35 | 4463 |
| 3 | 1 | 69.0 | 91.7 | 25 / 35 | 4343 |
| 4 | 1 | 66.6 | 83.8 | 19 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 78% |
| agd.Mooserwirt2 2.7 | 19 | 74% |
| uji.DBH 1.1 | 11 | 82% |
| sigterm.Sigterm 1.0 | 9 | 67% |
| spinnercat.Robovirus 2.718 | 5 | 100% |
| stelo.WangRobot 1.0 | 5 | 100% |
| ratosh.Nobo 0.21 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 60 of 140 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 18 | 30% | 48 |
| uji.DBH 1.1 | 15 | 25% | 21 |
| agd.Mooserwirt2 2.7 | 10 | 17% | 30 |
| sigterm.Sigterm 1.0 | 5 | 8% | 10 |
| spinnercat.Robovirus 2.718 | 3 | 5% | 8 |
| ratosh.Nobo 0.21 | 2 | 3% | 7 |
| stelo.WangRobot 1.0 | 2 | 3% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 2% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 94344 melee ticks, 30296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 36 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 32582 sent, 29509 reached their opponent, 6810 virtual hits (23.1% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 417 over 4 battles (104.3 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.0 | 123 / 140 | 1.45 | 21.0% | 21521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.0% | 123 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 8 |
| mld.Infinity 2.2 | 3.0 | 13.0% | 5 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 2 |
| pac.ABC 2.1 | 7.5 | 7.0% | 0 |
| mbh.Mbh 0.1 | 7.8 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.6 | 30 / 35 | 5305 |
| 2 | 1 | 71.5 | 93.7 | 31 / 35 | 5332 |
| 3 | 1 | 72.2 | 96.2 | 33 / 35 | 5416 |
| 4 | 1 | 71.9 | 95.6 | 29 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 71 | 99% |
| mld.Infinity 2.2 | 20 | 95% |
| erdnis.Rover 0.3 | 13 | 100% |
| krillr.mini.JointStrike 2.0.0 | 9 | 89% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 60% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 21 of 140 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 29% | 46 |
| krillr.mini.JointStrike 2.0.0 | 6 | 29% | 20 |
| erdnis.Rover 0.3 | 2 | 10% | 22 |
| patson.PatsonTestBot 1.0 | 2 | 10% | 10 |
| mld.Infinity 2.2 | 1 | 5% | 19 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 134 rounds): 88162 melee ticks, 36039 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 62 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 30339 sent, 27468 reached their opponent, 6846 virtual hits (24.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 71.8% ± 0.5 | 72.5% ± 0.4 | -0.7 ± 0.7 |
| Survival | 95.0% ± 1.8 | 97.4% ± 1.8 | -2.4 ± 3.4 |
| Rounds won | 87.9% ± 7.8 | 90.0% ± 4.5 | -2.1 ± 4.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| pbg.R2D2 1.0 | 77.7% ± 2.4 | 80.2% ± 3.0 | -2.5 ± 2.2 |
| erdnis.Rover 0.3 | 66.5% ± 1.3 | 66.0% ± 3.9 | +0.5 ± 2.9 |
| davidalves.net.DuelistMiniMelee 1.2 | 59.2% ± 1.6 | 59.9% ± 1.5 | -0.7 ± 1.9 |
| patson.PatsonTestBot 1.0 | 70.9% ± 2.2 | 72.2% ± 3.9 | -1.3 ± 4.3 |
| mbh.Mbh 0.1 | 75.3% ± 2.4 | 75.3% ± 1.2 | -0.0 ± 1.9 |
| pac.ABC 2.1 | 75.1% ± 1.7 | 74.4% ± 4.4 | +0.7 ± 5.8 |
| krillr.mini.JointStrike 2.0.0 | 65.4% ± 1.4 | 65.5% ± 3.6 | -0.1 ± 3.8 |
| mld.Infinity 2.2 | 61.8% ± 2.7 | 64.0% ± 3.8 | -2.2 ± 6.0 |
| pedersen.Moron 2.0 | 94.5% ± 2.4 | 94.8% ± 1.6 | -0.2 ± 3.9 |

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 388 over 4 battles (97.0 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 97.4 | 126 / 140 | 1.24 | 21.6% | 22178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.6% | 126 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 4 |
| mld.Infinity 2.2 | 3.5 | 12.1% | 3 |
| erdnis.Rover 0.3 | 4.0 | 11.1% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.4% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.3% | 1 |
| pac.ABC 2.1 | 7.3 | 7.5% | 1 |
| mbh.Mbh 0.1 | 7.5 | 7.1% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 97.8 | 31 / 35 | 5435 |
| 2 | 1 | 72.7 | 98.7 | 31 / 35 | 5839 |
| 3 | 1 | 72.5 | 96.8 | 33 / 35 | 5396 |
| 4 | 1 | 72.2 | 96.2 | 31 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 61 | 97% |
| mld.Infinity 2.2 | 26 | 96% |
| krillr.mini.JointStrike 2.0.0 | 18 | 94% |
| erdnis.Rover 0.3 | 12 | 83% |
| pac.ABC 2.1 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 6 | 83% |

Hadur died in 19 of 140 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 16% | 49 |
| erdnis.Rover 0.3 | 3 | 16% | 21 |
| krillr.mini.JointStrike 2.0.0 | 2 | 11% | 23 |
| mld.Infinity 2.2 | 2 | 11% | 20 |
| patson.PatsonTestBot 1.0 | 2 | 11% | 9 |
| pac.ABC 2.1 | 2 | 11% | 7 |
| pbg.R2D2 1.0 | 1 | 5% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 92196 melee ticks, 34755 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 38 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 31177 sent, 28205 reached their opponent, 7063 virtual hits (25.0% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 4 battles (109.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.5 | 90 / 140 | 1.76 | 19.8% | 21008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 90 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 25 |
| catcat20.Rabbit 0.001 | 3.3 | 11.7% | 19 |
| fwb.Nine 1.0.1 | 4.0 | 11.1% | 3 |
| nz.jdc.nano.GridFu 1.0 | 4.8 | 10.4% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 6.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 23 / 35 | 4956 |
| 2 | 1 | 71.2 | 94.6 | 26 / 35 | 5407 |
| 3 | 1 | 69.1 | 89.5 | 20 / 35 | 5289 |
| 4 | 1 | 69.9 | 89.8 | 21 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 54 | 74% |
| catcat20.Rabbit 0.001 | 28 | 79% |
| fwb.Nine 1.0.1 | 20 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |

Hadur died in 54 of 140 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 25 | 46% | 63 |
| catcat20.Rabbit 0.001 | 11 | 20% | 35 |
| bayen.nut.Squirrel 1.615 | 6 | 11% | 9 |
| fwb.Nine 1.0.1 | 4 | 7% | 9 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 111286 melee ticks, 42116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 32 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 35920 sent, 32851 reached their opponent, 7948 virtual hits (24.2% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.0% ± 1.4 | 70.4% ± 1.2 | -0.4 ± 2.1 |
| Survival | 91.5% ± 3.7 | 92.0% ± 3.3 | -0.5 ± 6.0 |
| Rounds won | 64.3% ± 12.0 | 65.0% ± 10.7 | -0.7 ± 18.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| sample.MyFirstJuniorRobot 1.0 | 81.7% ± 3.7 | 81.6% ± 3.3 | +0.1 ± 3.6 |
| m3thos.mini.Eva01 0.5.5 | 70.1% ± 2.0 | 72.1% ± 2.4 | -2.0 ± 3.5 |
| catcat20.Rabbit 0.001 | 62.9% ± 2.3 | 63.8% ± 3.8 | -1.0 ± 5.0 |
| bayen.nut.Squirrel 1.615 | 74.7% ± 1.8 | 73.6% ± 2.0 | +1.1 ± 2.3 |
| trm.Wrekt 1.1.6.f | 55.5% ± 2.0 | 56.8% ± 2.1 | -1.3 ± 2.4 |
| ntc.ControlledChaos 1.1.4 | 78.6% ± 4.3 | 78.5% ± 4.5 | +0.1 ± 3.1 |
| nz.jdc.nano.GridFu 1.0 | 65.6% ± 2.0 | 65.8% ± 1.9 | -0.2 ± 2.5 |
| fwb.Nine 1.0.1 | 64.2% ± 4.4 | 65.6% ± 1.9 | -1.4 ± 5.9 |
| djdjdj.NanoSkunk10 1.0 | 76.8% ± 3.1 | 75.8% ± 3.2 | +1.1 ± 5.0 |

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 401 over 4 battles (100.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.0 | 91 / 140 | 1.72 | 20.2% | 21974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.2% | 91 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 21 |
| catcat20.Rabbit 0.001 | 3.3 | 11.5% | 17 |
| fwb.Nine 1.0.1 | 4.0 | 10.6% | 3 |
| nz.jdc.nano.GridFu 1.0 | 4.8 | 10.5% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 7.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 23 / 35 | 5761 |
| 2 | 1 | 69.7 | 90.2 | 21 / 35 | 5368 |
| 3 | 1 | 69.8 | 90.5 | 21 / 35 | 5352 |
| 4 | 1 | 71.3 | 94.6 | 26 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 75% |
| fwb.Nine 1.0.1 | 22 | 100% |
| catcat20.Rabbit 0.001 | 19 | 68% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 24 | 45% | 58 |
| catcat20.Rabbit 0.001 | 9 | 17% | 31 |
| fwb.Nine 1.0.1 | 9 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 14 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 4 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 115987 melee ticks, 40000 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 24 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 37173 sent, 34015 reached their opponent, 8332 virtual hits (24.5% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 4 battles (100.3 per battle, most in one battle 102). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 84 / 140 | 1.67 | 20.1% | 22385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.1% | 84 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 47 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 3 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 0 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.6% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 23 / 35 | 5880 |
| 2 | 1 | 69.6 | 91.7 | 18 / 35 | 5254 |
| 3 | 1 | 71.1 | 93.0 | 24 / 35 | 5788 |
| 4 | 1 | 70.7 | 92.1 | 19 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 84 | 65% |
| cf.RiO.RiOx 4.2.1 | 16 | 100% |
| dummy.mini.Scimitar 1.01 | 10 | 80% |
| eld.Hmm 1.0 | 6 | 33% |
| el.JumpShoot 0.2 | 2 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 62 of 140 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 35 | 56% | 75 |
| dummy.mini.Scimitar 1.01 | 8 | 13% | 29 |
| eld.Hmm 1.0 | 7 | 11% | 15 |
| cf.RiO.RiOx 4.2.1 | 4 | 6% | 16 |
| fire219.CatBot 1.0 | 2 | 3% | 1 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 123145 melee ticks, 60522 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 84 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 84 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 36559 sent, 33662 reached their opponent, 6578 virtual hits (19.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.7% ± 1.2 | 69.6% ± 1.9 | +1.1 ± 3.1 |
| Survival | 92.5% ± 1.2 | 91.6% ± 3.8 | +1.0 ± 4.6 |
| Rounds won | 60.0% ± 13.4 | 53.6% ± 17.9 | +6.4 ± 27.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| fire219.CatBot 1.0 | 75.4% ± 5.0 | 73.6% ± 2.3 | +1.8 ± 7.3 |
| oa.weak.BotherBot 0.1 | 71.6% ± 0.8 | 71.2% ± 3.0 | +0.4 ± 3.1 |
| el.JumpShoot 0.2 | 76.3% ± 0.8 | 77.5% ± 3.7 | -1.2 ± 3.6 |
| eld.Hmm 1.0 | 70.3% ± 3.3 | 69.7% ± 3.5 | +0.7 ± 4.7 |
| PSW.Relentless 0.1 | 78.3% ± 2.7 | 77.1% ± 6.4 | +1.2 ± 5.4 |
| dummy.mini.Scimitar 1.01 | 59.9% ± 3.1 | 58.3% ± 1.6 | +1.7 ± 4.3 |
| cf.RiO.RiOx 4.2.1 | 64.5% ± 1.2 | 62.8% ± 1.9 | +1.7 ± 2.8 |
| arthord.MannyPacquiao Beta | 85.6% ± 4.9 | 82.9% ± 4.2 | +2.8 ± 5.4 |
| eem.EvBot v4.6.16 | 54.3% ± 1.3 | 53.3% ± 3.4 | +0.9 ± 4.7 |

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 338 over 4 battles (84.5 per battle, most in one battle 93). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.6 | 75 / 140 | 1.76 | 19.3% | 20421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.3% | 75 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 3 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.7 | 13 / 35 | 4725 |
| 2 | 1 | 71.2 | 94.9 | 22 / 35 | 5558 |
| 3 | 1 | 69.1 | 89.5 | 20 / 35 | 5004 |
| 4 | 1 | 69.8 | 90.2 | 20 / 35 | 5134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 90 | 56% |
| dummy.mini.Scimitar 1.01 | 14 | 93% |
| cf.RiO.RiOx 4.2.1 | 9 | 89% |
| eld.Hmm 1.0 | 7 | 29% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 72 of 140 rounds, at a mean tick of 1377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 61% | 74 |
| dummy.mini.Scimitar 1.01 | 9 | 13% | 32 |
| eld.Hmm 1.0 | 7 | 10% | 13 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 16 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 128093 melee ticks, 57670 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 89 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 37613 sent, 34669 reached their opponent, 6222 virtual hits (17.9% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 442 over 4 battles (110.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.3 | 68 / 140 | 2.14 | 17.7% | 17012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.7% | 68 |
| pe.SandboxDT 2.71m | 2.3 | 15.9% | 37 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.4% | 21 |
| jlm.javaDisturbance 0.59 | 4.3 | 12.9% | 11 |
| bigpete.Stewie 1.0 | 4.8 | 10.9% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.9% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 14 / 35 | 4136 |
| 2 | 1 | 68.2 | 88.6 | 18 / 35 | 4032 |
| 3 | 1 | 68.1 | 87.3 | 19 / 35 | 4419 |
| 4 | 1 | 68.2 | 88.9 | 17 / 35 | 4425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 30 | 40% |
| kvk.HebusLeTroll 0.35 | 28 | 75% |
| jlm.javaDisturbance 0.59 | 25 | 88% |
| bigpete.Stewie 1.0 | 13 | 100% |

Hadur died in 76 of 140 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 30 | 39% | 45 |
| kvk.HebusLeTroll 0.35 | 26 | 34% | 44 |
| jlm.javaDisturbance 0.59 | 13 | 17% | 34 |
| bigpete.Stewie 1.0 | 2 | 3% | 14 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 109182 melee ticks, 29131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 56 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 35735 sent, 32760 reached their opponent, 5556 virtual hits (17.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.8% ± 1.2 | 67.4% ± 2.4 | +0.4 ± 3.0 |
| Survival | 87.3% ± 3.2 | 86.3% ± 4.8 | +1.0 ± 7.0 |
| Rounds won | 48.6% ± 9.8 | 40.7% ± 27.6 | +7.9 ± 29.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| inonit.robocode.javascript.MyFirstRobot 1.1 | 86.4% ± 1.5 | 86.3% ± 4.0 | +0.2 ± 4.9 |
| gg.Squaraus 0.6 | 74.4% ± 2.8 | 72.8% ± 1.7 | +1.6 ± 3.7 |
| jlm.javaDisturbance 0.59 | 57.9% ± 3.6 | 57.7% ± 2.6 | +0.1 ± 5.0 |
| pbg.NinjaX 1.2 | 78.6% ± 2.2 | 77.2% ± 4.9 | +1.4 ± 3.4 |
| tad.Dalek98 0.98 | 72.9% ± 5.4 | 73.4% ± 3.1 | -0.5 ± 4.4 |
| bigpete.Stewie 1.0 | 62.1% ± 3.8 | 61.0% ± 2.0 | +1.0 ± 4.8 |
| kvk.HebusLeTroll 0.35 | 53.4% ± 2.3 | 53.8% ± 3.9 | -0.4 ± 5.4 |
| pe.SandboxDT 2.71m | 52.6% ± 1.5 | 51.6% ± 4.2 | +1.0 ± 3.8 |
| yk.JahRoslav 1.1 | 72.0% ± 3.4 | 73.1% ± 7.0 | -1.1 ± 6.1 |

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 358 over 4 battles (89.5 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.3 | 57 / 140 | 2.24 | 17.5% | 17746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.5% | 57 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 43 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.0% | 20 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 12 |
| bigpete.Stewie 1.0 | 5.0 | 11.1% | 7 |
| gg.Squaraus 0.6 | 6.8 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.5 | 6.4% | 2 |
| pbg.NinjaX 1.2 | 8.8 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 17 / 35 | 4534 |
| 2 | 2 | 65.5 | 82.2 | 7 / 35 | 4280 |
| 3 | 1 | 69.0 | 89.2 | 21 / 35 | 4539 |
| 4 | 1 | 67.2 | 86.0 | 12 / 35 | 4393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 40 | 38% |
| jlm.javaDisturbance 0.59 | 23 | 65% |
| kvk.HebusLeTroll 0.35 | 21 | 76% |
| bigpete.Stewie 1.0 | 8 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 87 of 140 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 35 | 40% | 51 |
| kvk.HebusLeTroll 0.35 | 21 | 24% | 38 |
| jlm.javaDisturbance 0.59 | 18 | 21% | 31 |
| bigpete.Stewie 1.0 | 8 | 9% | 14 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 111336 melee ticks, 34146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 33 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 36151 sent, 33155 reached their opponent, 5708 virtual hits (17.2% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 4 battles (100.0 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.0 | 115 / 140 | 1.45 | 20.9% | 20928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.9% | 115 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 17 |
| cre.Karolos 0.32 | 3.0 | 14.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.0% | 0 |
| sample.Walls 1.0 | 7.0 | 7.8% | 1 |
| cw.megas.Blade 0.8 | 7.5 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 27 / 35 | 4623 |
| 2 | 1 | 73.0 | 95.9 | 31 / 35 | 5662 |
| 3 | 1 | 72.2 | 94.3 | 29 / 35 | 5500 |
| 4 | 1 | 72.4 | 96.8 | 28 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 59 | 85% |
| cre.Karolos 0.32 | 43 | 95% |
| stelo.RamTrackSurfer 1.2 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 30 of 140 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 16 | 53% | 68 |
| cre.Karolos 0.32 | 6 | 20% | 29 |
| cw.megas.Blade 0.8 | 2 | 7% | 3 |
| stelo.AreaTargetingBot 1.1 | 1 | 3% | 9 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 8 |
| sample.Walls 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 88229 melee ticks, 33771 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 41 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 27895 sent, 24887 reached their opponent, 7974 virtual hits (32.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 72.1% ± 1.3 | 71.7% ± 0.9 | +0.5 ± 2.2 |
| Survival | 95.0% ± 2.7 | 93.3% ± 2.4 | +1.7 ± 4.9 |
| Rounds won | 82.1% ± 7.8 | 79.3% ± 13.1 | +2.9 ± 19.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.RamTrackSurfer 1.2 | 69.3% ± 3.1 | 68.6% ± 1.6 | +0.7 ± 2.6 |
| stelo.AreaTargetingBot 1.1 | 68.7% ± 4.5 | 66.3% ± 4.1 | +2.4 ± 8.0 |
| rrh.Iwillfindyou 2.0 | 94.1% ± 2.4 | 95.6% ± 2.5 | -1.6 ± 2.8 |
| cre.Karolos 0.32 | 59.3% ± 4.2 | 60.1% ± 3.2 | -0.8 ± 6.4 |
| sample.Walls 1.0 | 72.7% ± 2.4 | 72.9% ± 1.6 | -0.1 ± 3.6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 69.9% ± 3.1 | 68.9% ± 2.8 | +0.9 ± 4.4 |
| cw.megas.Blade 0.8 | 72.5% ± 1.7 | 70.3% ± 2.9 | +2.1 ± 1.4 |
| pe.SandboxLump 1.52 | 55.8% ± 0.8 | 55.2% ± 2.2 | +0.7 ± 2.4 |
| cli.WasteOfAmmo 1.0 | 87.0% ± 0.9 | 87.0% ± 1.6 | -0.1 ± 1.7 |

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 429 over 4 battles (107.3 per battle, most in one battle 187). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.3 | 111 / 140 | 1.60 | 20.5% | 19914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.5% | 111 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 19 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.4% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.6% | 1 |
| sample.Walls 1.0 | 8.0 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.2 | 32 / 35 | 4949 |
| 2 | 1 | 71.2 | 91.7 | 26 / 35 | 4890 |
| 3 | 1 | 71.6 | 93.7 | 26 / 35 | 5038 |
| 4 | 1 | 71.5 | 92.7 | 27 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 60 | 87% |
| cre.Karolos 0.32 | 34 | 97% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| cw.megas.Blade 0.8 | 4 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 34 of 140 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 38% | 62 |
| cre.Karolos 0.32 | 8 | 24% | 34 |
| stelo.RamTrackSurfer 1.2 | 4 | 12% | 13 |
| stelo.AreaTargetingBot 1.1 | 2 | 6% | 10 |
| cw.megas.Blade 0.8 | 1 | 3% | 7 |
| sample.Walls 1.0 | 1 | 3% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 88003 melee ticks, 32701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 54 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 27683 sent, 24719 reached their opponent, 7918 virtual hits (32.0% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 4 battles (104.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.6 | 50 / 140 | 2.84 | 15.5% | 13184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 15.5% | 50 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 27 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 27 |
| pedersen.Ugluk 1.1.1 | 3.8 | 11.8% | 15 |
| florent.XSeries.X2 0.12 | 4.5 | 12.7% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.4% | 0 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 0 |
| evd.X1 0.01 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 78.1 | 12 / 35 | 3172 |
| 2 | 1 | 63.9 | 82.2 | 11 / 35 | 3115 |
| 3 | 2 | 63.9 | 80.6 | 12 / 35 | 3243 |
| 4 | 1 | 64.0 | 77.5 | 15 / 35 | 3654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 23 | 65% |
| pedersen.Ugluk 1.1.1 | 15 | 60% |
| davidalves.Phoenix 0.54 | 13 | 69% |
| florent.XSeries.X2 0.12 | 12 | 42% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| evd.X1 0.01 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 94 of 140 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 22 | 23% | 30 |
| rz.GlowBlowMelee 1.4 | 21 | 22% | 37 |
| pedersen.Ugluk 1.1.1 | 18 | 19% | 23 |
| florent.XSeries.X2 0.12 | 12 | 13% | 19 |
| oog.melee.Corsair 1.0 | 8 | 9% | 14 |
| stelo.SoJNanoMelee 1.1 | 3 | 3% | 8 |
| as.FrankTheTank 1.3 | 3 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 94838 melee ticks, 20479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 80 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 32320 sent, 29154 reached their opponent, 5662 virtual hits (19.4% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.7% ± 0.6 | 62.2% ± 2.8 | +1.5 ± 3.2 |
| Survival | 79.6% ± 3.5 | 75.1% ± 6.8 | +4.5 ± 5.8 |
| Rounds won | 35.7% ± 7.9 | 30.0% ± 16.8 | +5.7 ± 21.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| as.FrankTheTank 1.3 | 76.0% ± 6.2 | 74.1% ± 2.9 | +1.9 ± 4.0 |
| rz.GlowBlowMelee 1.4 | 52.4% ± 3.2 | 50.7% ± 4.5 | +1.6 ± 5.2 |
| pedersen.Ugluk 1.1.1 | 57.1% ± 6.4 | 55.6% ± 4.2 | +1.4 ± 10.5 |
| davidalves.Phoenix 0.54 | 54.1% ± 3.2 | 52.3% ± 1.1 | +1.8 ± 3.2 |
| stelo.SoJNanoMelee 1.1 | 67.6% ± 2.6 | 68.1% ± 3.4 | -0.5 ± 3.4 |
| florent.XSeries.X2 0.12 | 55.1% ± 3.3 | 53.3% ± 4.3 | +1.8 ± 7.1 |
| evd.X1 0.01 | 76.9% ± 3.8 | 75.9% ± 2.3 | +1.0 ± 4.0 |
| lunchie.Lunchbox 0.93 | 72.2% ± 2.7 | 69.9% ± 5.0 | +2.2 ± 6.3 |
| oog.melee.Corsair 1.0 | 62.2% ± 2.3 | 59.6% ± 3.9 | +2.6 ± 4.2 |

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 434 over 4 battles (108.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.1 | 42 / 140 | 3.24 | 14.7% | 13000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.8 | 14.7% | 42 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.3% | 27 |
| davidalves.Phoenix 0.54 | 3.0 | 13.4% | 29 |
| florent.XSeries.X2 0.12 | 3.8 | 12.9% | 21 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.8% | 13 |
| oog.melee.Corsair 1.0 | 5.8 | 10.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.9% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 1 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 78.4 | 14 / 35 | 3382 |
| 2 | 1 | 63.6 | 78.1 | 13 / 35 | 3432 |
| 3 | 2 | 61.2 | 74.6 | 6 / 35 | 3103 |
| 4 | 3 | 60.3 | 69.2 | 9 / 35 | 3083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pedersen.Ugluk 1.1.1 | 16 | 63% |
| rz.GlowBlowMelee 1.4 | 15 | 53% |
| florent.XSeries.X2 0.12 | 13 | 46% |
| davidalves.Phoenix 0.54 | 10 | 50% |
| oog.melee.Corsair 1.0 | 7 | 86% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 102 of 140 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 25 | 25% | 34 |
| pedersen.Ugluk 1.1.1 | 21 | 21% | 26 |
| rz.GlowBlowMelee 1.4 | 20 | 20% | 30 |
| davidalves.Phoenix 0.54 | 20 | 20% | 26 |
| oog.melee.Corsair 1.0 | 6 | 6% | 14 |
| stelo.SoJNanoMelee 1.1 | 3 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 5 |
| evd.X1 0.01 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 89191 melee ticks, 18937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 33 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 30763 sent, 27599 reached their opponent, 5492 virtual hits (19.9% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 437 over 4 battles (109.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 90.0 | 91 / 140 | 1.90 | 18.7% | 15035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.7% | 91 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.5% | 13 |
| voidious.mini.BrokenSword 2.0.3 | 3.0 | 13.1% | 6 |
| jdw.Hurricane 1.4 | 3.8 | 11.7% | 14 |
| ds.Oo 2.2 | 5.5 | 9.3% | 8 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.7% | 3 |
| awesomeness.Elite 1.0 | 7.3 | 7.6% | 4 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.0% | 0 |
| adt.Ar2 1.1 | 8.5 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 89.5 | 22 / 35 | 3545 |
| 2 | 1 | 66.8 | 86.0 | 20 / 35 | 3655 |
| 3 | 1 | 68.8 | 92.4 | 24 / 35 | 3758 |
| 4 | 1 | 69.5 | 92.1 | 25 / 35 | 4077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 97% |
| voidious.mini.BrokenSword 2.0.3 | 28 | 93% |
| jdw.Hurricane 1.4 | 19 | 68% |
| ds.Oo 2.2 | 12 | 67% |
| gre.svman4.Morfeas 1.4.1 | 8 | 75% |
| awesomeness.Elite 1.0 | 6 | 67% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 10 | 19% | 42 |
| voidious.micro.BlitzBat 1.05 | 9 | 17% | 29 |
| awesomeness.Elite 1.0 | 9 | 17% | 14 |
| jdw.Hurricane 1.4 | 8 | 15% | 20 |
| ds.Oo 2.2 | 6 | 11% | 15 |
| gre.svman4.Morfeas 1.4.1 | 3 | 6% | 9 |
| adt.Ar2 1.1 | 3 | 6% | 3 |
| amk.ChumbaMini 0.2 | 1 | 2% | 1 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 91646 melee ticks, 19925 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 25 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 32416 sent, 29356 reached their opponent, 5250 virtual hits (17.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.2% ± 1.8 | 67.6% ± 2.4 | +0.6 ± 3.6 |
| Survival | 90.0% ± 4.7 | 86.7% ± 9.3 | +3.3 ± 10.6 |
| Rounds won | 65.0% ± 10.1 | 67.1% ± 9.5 | -2.1 ± 15.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| adt.Ar2 1.1 | 74.9% ± 2.1 | 74.2% ± 2.4 | +0.7 ± 3.8 |
| amk.ChumbaMini 0.2 | 81.6% ± 1.5 | 80.3% ± 3.5 | +1.3 ± 2.5 |
| gjr.Cephalosporin 0.1 | 72.7% ± 4.3 | 73.2% ± 4.0 | -0.5 ± 4.8 |
| awesomeness.Elite 1.0 | 71.4% ± 8.2 | 72.8% ± 2.8 | -1.5 ± 10.0 |
| voidious.micro.BlitzBat 1.05 | 58.0% ± 1.6 | 57.9% ± 1.6 | +0.0 ± 3.1 |
| ds.Oo 2.2 | 66.8% ± 4.9 | 66.6% ± 2.6 | +0.2 ± 5.7 |
| gre.svman4.Morfeas 1.4.1 | 68.4% ± 3.0 | 66.3% ± 4.6 | +2.0 ± 3.7 |
| voidious.mini.BrokenSword 2.0.3 | 58.7% ± 2.0 | 56.8% ± 2.9 | +1.9 ± 3.7 |
| jdw.Hurricane 1.4 | 61.5% ± 2.9 | 60.5% ± 6.2 | +1.0 ± 8.6 |

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 344 over 4 battles (86.0 per battle, most in one battle 87). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.7 | 94 / 140 | 2.20 | 18.2% | 14926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 94 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.9% | 13 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.2% | 7 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 13 |
| ds.Oo 2.2 | 5.5 | 9.1% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 7.5 | 6.8% | 1 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.7% | 1 |
| adt.Ar2 1.1 | 8.5 | 6.3% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 23 / 35 | 3856 |
| 2 | 1 | 68.2 | 87.3 | 24 / 35 | 3941 |
| 3 | 1 | 69.1 | 93.3 | 26 / 35 | 3598 |
| 4 | 1 | 65.6 | 79.0 | 21 / 35 | 3531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 97% |
| voidious.mini.BrokenSword 2.0.3 | 29 | 93% |
| jdw.Hurricane 1.4 | 18 | 89% |
| ds.Oo 2.2 | 14 | 86% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 50 of 140 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 15 | 30% | 37 |
| voidious.mini.BrokenSword 2.0.3 | 6 | 12% | 32 |
| ds.Oo 2.2 | 6 | 12% | 16 |
| gre.svman4.Morfeas 1.4.1 | 6 | 12% | 13 |
| jdw.Hurricane 1.4 | 5 | 10% | 20 |
| awesomeness.Elite 1.0 | 4 | 8% | 9 |
| gjr.Cephalosporin 0.1 | 3 | 6% | 5 |
| amk.ChumbaMini 0.2 | 1 | 2% | 4 |
| adt.Ar2 1.1 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 87292 melee ticks, 17938 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 31 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 31298 sent, 28319 reached their opponent, 5031 virtual hits (17.8% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 4 battles (108.0 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.9 | 93 / 140 | 1.82 | 19.6% | 22098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 93 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 22 |
| shu.nitro.LENIN .T34 | 3.3 | 12.5% | 13 |
| lrem.Spectre 0.4.4 | 4.0 | 11.7% | 6 |
| js.PinBall 1.6 | 5.0 | 11.1% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.9% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 20 / 35 | 5692 |
| 2 | 1 | 68.9 | 85.4 | 21 / 35 | 5328 |
| 3 | 1 | 71.3 | 93.3 | 26 / 35 | 5648 |
| 4 | 1 | 70.7 | 93.3 | 26 / 35 | 5430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 36 | 67% |
| shu.nitro.LENIN .T34 | 32 | 94% |
| lrem.Spectre 0.4.4 | 21 | 81% |
| js.PinBall 1.6 | 10 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 52 of 140 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 20 | 38% | 48 |
| lrem.Spectre 0.4.4 | 10 | 19% | 22 |
| shu.nitro.LENIN .T34 | 7 | 13% | 37 |
| js.PinBall 1.6 | 5 | 10% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 6% | 13 |
| gh.mini.GrubbmOne 1.0 | 2 | 4% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 110255 melee ticks, 27767 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 17 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 36544 sent, 33530 reached their opponent, 8775 virtual hits (26.2% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.3% ± 1.6 | 70.0% ± 1.4 | +0.3 ± 1.9 |
| Survival | 90.9% ± 6.0 | 91.0% ± 4.2 | -0.2 ± 4.9 |
| Rounds won | 66.4% ± 14.6 | 63.6% ± 6.8 | +2.9 ± 11.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| js.PinBall 1.6 | 63.9% ± 2.6 | 65.2% ± 2.5 | -1.4 ± 2.1 |
| logiblocs.SittingDroid 1.0 | 93.1% ± 3.4 | 91.4% ± 3.7 | +1.7 ± 5.0 |
| gh.mini.GrubbmOne 1.0 | 69.8% ± 2.9 | 69.2% ± 2.3 | +0.6 ± 2.7 |
| shu.nitro.LENIN .T34 | 61.2% ± 3.1 | 62.3% ± 1.7 | -1.1 ± 4.0 |
| fullsail.LaxativeTeaTwo 1.0 | 76.2% ± 3.2 | 74.2% ± 1.7 | +2.0 ± 2.5 |
| lrem.Spectre 0.4.4 | 62.6% ± 4.5 | 60.7% ± 1.4 | +1.9 ± 5.8 |
| sample.SpinBot 1.0 | 82.4% ± 1.8 | 83.4% ± 5.5 | -1.0 ± 5.5 |
| ak.Fermat 2.0 | 57.0% ± 3.5 | 55.8% ± 1.9 | +1.1 ± 4.2 |
| jaybot.adv.bots.JayBot 2.0 | 66.6% ± 2.5 | 67.5% ± 3.6 | -0.9 ± 6.0 |

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 532 over 4 battles (133.0 per battle, most in one battle 203). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.0 | 89 / 140 | 1.81 | 19.4% | 21226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 89 |
| ak.Fermat 2.0 | 2.0 | 15.4% | 21 |
| lrem.Spectre 0.4.4 | 3.0 | 12.6% | 8 |
| shu.nitro.LENIN .T34 | 4.3 | 11.8% | 14 |
| js.PinBall 1.6 | 4.8 | 10.4% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.4% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.6% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 20 / 35 | 5381 |
| 2 | 1 | 69.7 | 89.2 | 23 / 35 | 5325 |
| 3 | 1 | 69.8 | 90.5 | 23 / 35 | 5062 |
| 4 | 1 | 71.3 | 94.9 | 23 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 48 | 71% |
| lrem.Spectre 0.4.4 | 28 | 93% |
| shu.nitro.LENIN .T34 | 26 | 77% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 67% |
| js.PinBall 1.6 | 5 | 40% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 56 of 140 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 24 | 43% | 56 |
| shu.nitro.LENIN .T34 | 10 | 18% | 31 |
| lrem.Spectre 0.4.4 | 7 | 13% | 29 |
| js.PinBall 1.6 | 6 | 11% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 5% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 106142 melee ticks, 37067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 49 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 35460 sent, 32498 reached their opponent, 8427 virtual hits (25.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 4 battles (107.0 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.0 | 99 / 140 | 2.53 | 18.2% | 17640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 18.2% | 99 |
| mk.Alpha 0.2.1 | 2.5 | 13.2% | 19 |
| EH.Eagle 1.0.6 | 3.0 | 11.4% | 6 |
| wee.Gem 1.8.4 | 4.5 | 10.1% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.3% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.3% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 9.3 | 5.7% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.9 | 49.5 | 12 / 35 | 3829 |
| 2 | 1 | 69.9 | 91.7 | 29 / 35 | 4800 |
| 3 | 1 | 71.2 | 97.8 | 31 / 35 | 4786 |
| 4 | 1 | 69.1 | 93.0 | 27 / 35 | 4225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 48 | 94% |
| EH.Eagle 1.0.6 | 20 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| wee.Gem 1.8.4 | 7 | 86% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 45 of 140 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 8 | 18% | 6 |
| mk.Alpha 0.2.1 | 7 | 16% | 41 |
| EH.Eagle 1.0.6 | 5 | 11% | 25 |
| wee.Gem 1.8.4 | 5 | 11% | 17 |
| joe.ADinosaur 1.0 | 5 | 11% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 9% | 16 |
| throxbot.ThroxBot 0.1 | 3 | 7% | 11 |
| caimano.Furia_Ceca 0.22 | 3 | 7% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 11 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 85444 melee ticks, 23188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 40 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 28074 sent, 25120 reached their opponent, 6609 virtual hits (26.3% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.8% ± 10.6 | 67.2% ± 7.4 | -0.4 ± 3.3 |
| Survival | 83.0% ± 35.8 | 83.9% ± 26.4 | -0.9 ± 9.7 |
| Rounds won | 70.7% ± 39.4 | 68.6% ± 31.5 | +2.1 ± 14.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cs.Grudge 1.0 | 80.4% ± 6.3 | 81.4% ± 6.6 | -1.0 ± 4.9 |
| techdude.kombat.FlamingKombat 1.5 | 65.6% ± 9.5 | 69.9% ± 14.4 | -4.3 ± 9.2 |
| mk.Alpha 0.2.1 | 57.6% ± 15.8 | 55.4% ± 10.2 | +2.2 ± 7.2 |
| caimano.Furia_Ceca 0.22 | 75.7% ± 17.8 | 69.9% ± 3.4 | +5.9 ± 14.7 |
| sheldor.melee.nano.TestMelee 0.1 | 63.2% ± 10.4 | 65.5% ± 6.2 | -2.3 ± 4.7 |
| joe.ADinosaur 1.0 | 66.5% ± 8.9 | 66.2% ± 8.5 | +0.3 ± 3.5 |
| EH.Eagle 1.0.6 | 60.8% ± 10.9 | 61.3% ± 8.7 | -0.5 ± 3.0 |
| throxbot.ThroxBot 0.1 | 67.4% ± 9.8 | 68.3% ± 5.5 | -0.9 ± 5.7 |
| wee.Gem 1.8.4 | 63.7% ± 13.7 | 66.7% ± 10.5 | -2.9 ± 3.9 |

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 353 over 4 battles (88.3 per battle, most in one battle 92). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.9 | 96 / 140 | 2.45 | 18.2% | 17617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 18.2% | 96 |
| mk.Alpha 0.2.1 | 1.8 | 14.6% | 28 |
| EH.Eagle 1.0.6 | 3.0 | 11.4% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.5% | 4 |
| joe.ADinosaur 1.0 | 5.8 | 9.2% | 4 |
| wee.Gem 1.8.4 | 6.0 | 9.0% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 7.8% | 0 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.4% | 1 |
| caimano.Furia_Ceca 0.22 | 7.5 | 7.8% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 59.0 | 14 / 35 | 4101 |
| 2 | 1 | 69.5 | 92.1 | 30 / 35 | 4370 |
| 3 | 1 | 69.6 | 93.3 | 26 / 35 | 4712 |
| 4 | 1 | 69.4 | 91.1 | 26 / 35 | 4434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 63 | 89% |
| EH.Eagle 1.0.6 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| wee.Gem 1.8.4 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 100% |

Hadur died in 48 of 140 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 16 | 33% | 60 |
| cs.Grudge 1.0 | 9 | 19% | 9 |
| joe.ADinosaur 1.0 | 7 | 15% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 10% | 10 |
| EH.Eagle 1.0.6 | 3 | 6% | 24 |
| caimano.Furia_Ceca 0.22 | 3 | 6% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 8 |
| wee.Gem 1.8.4 | 0 | 0% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 86548 melee ticks, 26350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 58 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 28520 sent, 25613 reached their opponent, 6580 virtual hits (25.7% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 4 battles (104.0 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 89.4 | 87 / 140 | 1.96 | 18.1% | 14681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.1% | 87 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 20 |
| uji.Antique 1.0 | 3.3 | 12.3% | 14 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 1 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.8% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 89.5 | 22 / 35 | 3591 |
| 2 | 1 | 67.9 | 90.2 | 23 / 35 | 3701 |
| 3 | 1 | 67.4 | 90.2 | 22 / 35 | 3631 |
| 4 | 1 | 67.0 | 87.6 | 20 / 35 | 3758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 46 | 80% |
| uji.Antique 1.0 | 31 | 84% |
| qohnil.blot.BlotBot 3.61 | 17 | 65% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| pfvicm.Sobieski 7.2.3b | 1 | 100% |

Hadur died in 58 of 140 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 19 | 33% | 41 |
| uji.Antique 1.0 | 10 | 17% | 31 |
| qohnil.blot.BlotBot 3.61 | 10 | 17% | 28 |
| pfvicm.Sobieski 7.2.3b | 7 | 12% | 17 |
| amk.ChumbaWumba 0.3 | 4 | 7% | 9 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 8 |
| stelo.PianistNano 1.2 | 1 | 2% | 2 |
| stelo.Lifestealer 1.0 | 1 | 2% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 92063 melee ticks, 24840 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 67 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 30969 sent, 28027 reached their opponent, 4244 virtual hits (15.1% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.4% ± 0.6 | 66.4% ± 1.0 | +1.0 ± 0.3 |
| Survival | 89.4% ± 1.9 | 87.0% ± 1.8 | +2.4 ± 1.7 |
| Rounds won | 62.1% ± 5.7 | 57.1% ± 10.5 | +5.0 ± 7.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 63.7% ± 2.8 | 63.5% ± 2.5 | +0.2 ± 5.3 |
| amk.ChumbaWumba 0.3 | 70.1% ± 5.0 | 68.9% ± 3.8 | +1.1 ± 6.0 |
| kid.test.NightFox .2 | 55.3% ± 2.0 | 54.7% ± 1.1 | +0.7 ± 1.4 |
| stelo.Lifestealer 1.0 | 77.8% ± 3.9 | 75.3% ± 1.7 | +2.5 ± 3.7 |
| uji.Antique 1.0 | 59.7% ± 2.7 | 57.1% ± 4.3 | +2.6 ± 6.4 |
| matt.advanced.Katana 1.0 | 74.4% ± 3.4 | 72.9% ± 5.0 | +1.5 ± 6.9 |
| qohnil.blot.BlotBot 3.61 | 62.1% ± 3.4 | 61.9% ± 3.6 | +0.2 ± 5.8 |
| ahr.ice.Ice 1.0.2 | 68.8% ± 3.4 | 67.6% ± 4.3 | +1.2 ± 4.5 |
| stelo.PianistNano 1.2 | 75.0% ± 3.2 | 76.2% ± 1.3 | -1.2 ± 4.1 |

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 400 over 4 battles (100.0 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 87.0 | 80 / 140 | 2.17 | 17.5% | 13822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.5% | 80 |
| kid.test.NightFox .2 | 2.3 | 14.5% | 20 |
| uji.Antique 1.0 | 3.0 | 13.2% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.8% | 6 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.4% | 1 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.9% | 0 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 3 |
| stelo.Lifestealer 1.0 | 8.8 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.7 | 22 / 35 | 3582 |
| 2 | 1 | 67.2 | 88.3 | 22 / 35 | 3367 |
| 3 | 1 | 66.5 | 87.6 | 18 / 35 | 3581 |
| 4 | 1 | 65.7 | 86.3 | 18 / 35 | 3292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 44 | 80% |
| uji.Antique 1.0 | 34 | 74% |
| qohnil.blot.BlotBot 3.61 | 8 | 63% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 64 of 140 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 18 | 28% | 46 |
| kid.test.NightFox .2 | 16 | 25% | 37 |
| qohnil.blot.BlotBot 3.61 | 10 | 16% | 19 |
| pfvicm.Sobieski 7.2.3b | 6 | 9% | 10 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 11 |
| matt.advanced.Katana 1.0 | 3 | 5% | 5 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 1 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 91218 melee ticks, 24376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 77 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 30411 sent, 27446 reached their opponent, 4299 virtual hits (15.7% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 417 over 4 battles (104.3 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.3 | 66 / 140 | 2.14 | 18.5% | 17767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 18.5% | 66 |
| deewiant.Anomaly 0.2 | 2.3 | 15.4% | 33 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.8% | 27 |
| myl.micro.Troodon 1.10 | 4.3 | 11.5% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 5 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.0% | 0 |
| jangs.ns51 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 83.8 | 11 / 35 | 4126 |
| 2 | 1 | 68.7 | 85.7 | 20 / 35 | 4519 |
| 3 | 1 | 70.3 | 94.0 | 20 / 35 | 4738 |
| 4 | 1 | 68.1 | 85.7 | 15 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 25 | 40% |
| jok.PheonixM 0.1.2 | 15 | 80% |
| myl.micro.Troodon 1.10 | 8 | 88% |
| DBall.Anarchy 0.1 | 3 | 67% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 79 of 140 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 32 | 41% | 64 |
| zyx.mega.YersiniaPestis 3.1 | 21 | 27% | 33 |
| jok.PheonixM 0.1.2 | 9 | 11% | 17 |
| myl.micro.Troodon 1.10 | 7 | 9% | 16 |
| DBall.Anarchy 0.1 | 4 | 5% | 6 |
| ph.melee.ArcherME 0.3 | 2 | 3% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 119726 melee ticks, 33290 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 34 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 38288 sent, 35254 reached their opponent, 6126 virtual hits (17.4% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.5% ± 2.2 | 67.4% ± 2.0 | +1.1 ± 2.4 |
| Survival | 87.3% ± 7.2 | 84.4% ± 4.6 | +2.9 ± 9.0 |
| Rounds won | 47.1% ± 19.8 | 44.3% ± 14.1 | +2.9 ± 8.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 54.6% ± 7.4 | 53.6% ± 5.9 | +1.1 ± 3.0 |
| jangs.ns51 1.0 | 83.9% ± 2.8 | 80.9% ± 3.0 | +3.0 ± 1.4 |
| zyx.mega.YersiniaPestis 3.1 | 55.6% ± 3.2 | 53.9% ± 2.1 | +1.6 ± 4.6 |
| DBall.Anarchy 0.1 | 73.1% ± 3.4 | 75.9% ± 2.3 | -2.8 ± 5.4 |
| jok.PheonixM 0.1.2 | 63.7% ± 5.5 | 61.2% ± 4.4 | +2.5 ± 6.9 |
| ph.melee.ArcherME 0.3 | 69.9% ± 3.6 | 67.5% ± 2.2 | +2.3 ± 2.5 |
| myl.micro.Troodon 1.10 | 61.7% ± 2.9 | 58.8% ± 6.1 | +2.9 ± 8.7 |
| fullsail.TimbotNoPrediction 1.0 | 75.4% ± 4.6 | 74.7% ± 3.5 | +0.7 ± 2.1 |
| ap.Frederick 1.1 | 78.8% ± 0.4 | 80.3% ± 2.8 | -1.5 ± 2.7 |

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 396 over 4 battles (99.0 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.4 | 62 / 140 | 2.40 | 17.6% | 16308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.6% | 62 |
| deewiant.Anomaly 0.2 | 2.5 | 15.3% | 36 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 30 |
| myl.micro.Troodon 1.10 | 4.0 | 12.4% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.6% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.3% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.3 | 11 / 35 | 3728 |
| 2 | 1 | 68.8 | 87.9 | 17 / 35 | 4414 |
| 3 | 1 | 67.0 | 83.2 | 18 / 35 | 3853 |
| 4 | 1 | 67.9 | 85.4 | 16 / 35 | 4313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 68% |
| zyx.mega.YersiniaPestis 3.1 | 25 | 56% |
| jok.PheonixM 0.1.2 | 12 | 92% |
| myl.micro.Troodon 1.10 | 9 | 67% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 82 of 140 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 30 | 37% | 48 |
| deewiant.Anomaly 0.2 | 26 | 32% | 51 |
| myl.micro.Troodon 1.10 | 10 | 12% | 15 |
| jok.PheonixM 0.1.2 | 8 | 10% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 111006 melee ticks, 33815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 38 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 36890 sent, 33798 reached their opponent, 5699 virtual hits (16.9% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 4 battles (108.8 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.2 | 23 / 140 | 3.41 | 14.0% | 13389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.5 | 14.0% | 23 |
| catcat20.Matcha 0.006 | 2.0 | 14.5% | 45 |
| darkcanuck.B26354 1.06 | 3.3 | 13.2% | 29 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.8% | 12 |
| oog.melee.Capulet 1.2 | 4.5 | 12.1% | 15 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.7% | 4 |
| tripphippy.Alice 1.1 | 8.3 | 6.6% | 1 |
| ntc.Opposite 1.5 | 8.3 | 7.5% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 78.7 | 7 / 35 | 3480 |
| 2 | 1 | 61.9 | 73.3 | 5 / 35 | 3622 |
| 3 | 1 | 60.8 | 71.1 | 7 / 35 | 3355 |
| 4 | 3 | 59.0 | 69.5 | 4 / 35 | 2932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 23 | 26% |
| darkcanuck.B26354 1.06 | 12 | 33% |
| oog.melee.Capulet 1.2 | 11 | 45% |
| stelo.PastFuture 2.3.2 | 8 | 75% |
| intruder.PrairieWolf 2.61 | 6 | 17% |
| tripphippy.Alice 1.1 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 121 of 140 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 36 | 30% | 42 |
| darkcanuck.B26354 1.06 | 22 | 18% | 25 |
| stelo.PastFuture 2.3.2 | 15 | 12% | 19 |
| oog.melee.Capulet 1.2 | 12 | 10% | 19 |
| intruder.PrairieWolf 2.61 | 12 | 10% | 13 |
| ntc.Opposite 1.5 | 7 | 6% | 7 |
| tripphippy.Alice 1.1 | 6 | 5% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 5% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 106707 melee ticks, 19295 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 42 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 35425 sent, 32350 reached their opponent, 5704 virtual hits (17.6% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 61.2% ± 2.8 | 62.7% ± 1.4 | -1.6 ± 2.3 |
| Survival | 73.2% ± 6.4 | 77.5% ± 6.0 | -4.4 ± 8.2 |
| Rounds won | 16.4% ± 6.8 | 21.4% ± 5.9 | -5.0 ± 2.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53.6% ± 3.4 | 54.1% ± 2.3 | -0.5 ± 3.1 |
| darkcanuck.B26354 1.06 | 51.5% ± 3.5 | 53.0% ± 3.1 | -1.5 ± 2.1 |
| ntc.Opposite 1.5 | 65.1% ± 6.3 | 68.0% ± 3.1 | -2.9 ± 5.5 |
| fowl3628800.LightningBolt 2.6.0 | 64.6% ± 5.3 | 64.4% ± 3.6 | +0.2 ± 5.7 |
| GarmBox.Anger 1.0 | 85.7% ± 2.3 | 85.9% ± 1.8 | -0.1 ± 2.2 |
| intruder.PrairieWolf 2.61 | 60.4% ± 4.8 | 65.1% ± 5.2 | -4.7 ± 9.3 |
| catcat20.Matcha 0.006 | 49.3% ± 4.8 | 52.0% ± 4.5 | -2.7 ± 2.2 |
| tripphippy.Alice 1.1 | 68.0% ± 1.6 | 68.3% ± 6.1 | -0.3 ± 6.2 |
| stelo.PastFuture 2.3.2 | 52.3% ± 1.8 | 54.0% ± 3.8 | -1.7 ± 5.2 |

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 531 over 4 battles (132.8 per battle, most in one battle 214). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.5 | 30 / 140 | 3.02 | 14.9% | 13705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 14.9% | 30 |
| catcat20.Matcha 0.006 | 2.8 | 13.8% | 31 |
| darkcanuck.B26354 1.06 | 3.5 | 13.2% | 27 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.7% | 14 |
| oog.melee.Capulet 1.2 | 3.8 | 12.7% | 27 |
| intruder.PrairieWolf 2.61 | 7.0 | 8.1% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 8.3% | 7 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 0 |
| ntc.Opposite 1.5 | 8.0 | 7.0% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 76.5 | 9 / 35 | 3585 |
| 2 | 1 | 62.8 | 80.0 | 7 / 35 | 3153 |
| 3 | 1 | 63.7 | 81.0 | 8 / 35 | 3447 |
| 4 | 2 | 61.6 | 72.7 | 6 / 35 | 3520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 16 | 25% |
| catcat20.Matcha 0.006 | 14 | 43% |
| oog.melee.Capulet 1.2 | 14 | 29% |
| stelo.PastFuture 2.3.2 | 9 | 44% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 86% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| tripphippy.Alice 1.1 | 3 | 100% |

Hadur died in 115 of 140 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 24 | 21% | 30 |
| stelo.PastFuture 2.3.2 | 23 | 20% | 28 |
| oog.melee.Capulet 1.2 | 20 | 17% | 23 |
| darkcanuck.B26354 1.06 | 19 | 17% | 27 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 12% | 19 |
| intruder.PrairieWolf 2.61 | 5 | 4% | 7 |
| tripphippy.Alice 1.1 | 4 | 3% | 5 |
| ntc.Opposite 1.5 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 111273 melee ticks, 21230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 49 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 36305 sent, 33245 reached their opponent, 5638 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 402 over 4 battles (100.5 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.4 | 38 / 140 | 3.12 | 14.7% | 12431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.5% | 57 |
| hadur2.Hadur 3.17.1bb | 2.3 | 14.7% | 38 |
| gh.mini.Griezel 0.2 | 2.5 | 13.8% | 32 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.2% | 8 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.2% | 5 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.8% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 0 |
| fm.mammillarias 1.3 | 8.5 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 80.3 | 13 / 35 | 3513 |
| 2 | 2 | 63.9 | 80.0 | 11 / 35 | 3237 |
| 3 | 3 | 62.0 | 75.6 | 9 / 35 | 2868 |
| 4 | 3 | 59.5 | 69.8 | 5 / 35 | 2813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 31 | 45% |
| gh.mini.Griezel 0.2 | 20 | 50% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| d414.nano.Quantum 1.0.0 | 5 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 106 of 140 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 37 | 35% | 52 |
| gh.mini.Griezel 0.2 | 26 | 25% | 35 |
| d414.nano.Quantum 1.0.0 | 14 | 13% | 19 |
| spinnercat.micro.Tyger 0.1 | 11 | 10% | 16 |
| gh.nano.Grofvuil 0.2 | 7 | 7% | 9 |
| timmit.nano.TimDog 0.33 | 3 | 3% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 2% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 105048 melee ticks, 18650 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 33 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 34607 sent, 31479 reached their opponent, 5263 virtual hits (16.7% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.5% ± 3.6 | 62.1% ± 1.9 | +0.4 ± 3.2 |
| Survival | 76.4% ± 7.8 | 75.6% ± 4.3 | +0.9 ± 5.7 |
| Rounds won | 27.1% ± 15.5 | 20.7% ± 9.4 | +6.4 ± 15.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 51.6% ± 4.1 | 51.3% ± 2.0 | +0.3 ± 3.1 |
| Gecko.ultimateGeckoBot 1.0 | 74.9% ± 5.2 | 73.7% ± 6.1 | +1.2 ± 5.6 |
| spinnercat.micro.Tyger 0.1 | 56.9% ± 5.2 | 55.1% ± 4.6 | +1.8 ± 3.1 |
| gh.nano.Grofvuil 0.2 | 62.6% ± 6.1 | 61.8% ± 4.4 | +0.8 ± 5.5 |
| tlp.ThreeLeggedPig 1 | 74.0% ± 5.9 | 76.7% ± 3.0 | -2.7 ± 8.7 |
| abc.Shadow 3.84i | 45.8% ± 7.6 | 45.2% ± 1.6 | +0.6 ± 6.3 |
| fm.mammillarias 1.3 | 72.1% ± 4.8 | 71.9% ± 2.8 | +0.2 ± 6.0 |
| timmit.nano.TimDog 0.33 | 67.7% ± 2.6 | 67.7% ± 2.8 | -0.0 ± 1.7 |
| d414.nano.Quantum 1.0.0 | 56.9% ± 5.9 | 55.6% ± 4.9 | +1.3 ± 3.3 |

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 374 over 4 battles (93.5 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.6 | 29 / 140 | 3.20 | 14.4% | 12691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 61 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.4% | 29 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 31 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.5% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.8% | 3 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.0% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 3 |
| fm.mammillarias 1.3 | 8.3 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 78.1 | 7 / 35 | 3336 |
| 2 | 2 | 63.3 | 77.5 | 10 / 35 | 3210 |
| 3 | 3 | 60.5 | 72.4 | 5 / 35 | 2935 |
| 4 | 2 | 62.0 | 74.3 | 7 / 35 | 3210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 24 | 38% |
| gh.mini.Griezel 0.2 | 17 | 41% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| spinnercat.micro.Tyger 0.1 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 115 of 140 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 38 | 33% | 46 |
| gh.mini.Griezel 0.2 | 32 | 28% | 39 |
| spinnercat.micro.Tyger 0.1 | 13 | 11% | 18 |
| d414.nano.Quantum 1.0.0 | 13 | 11% | 16 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 7 |
| gh.nano.Grofvuil 0.2 | 5 | 4% | 9 |
| fm.mammillarias 1.3 | 3 | 3% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 100740 melee ticks, 20329 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 47 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 33973 sent, 30748 reached their opponent, 5261 virtual hits (17.1% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 4 battles (94.8 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 84.6 | 61 / 140 | 2.39 | 16.9% | 16125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 16.9% | 61 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.6% | 46 |
| apc.botM 3.0 | 3.0 | 12.0% | 14 |
| vjik.UnViolation 1.1 | 4.0 | 10.6% | 11 |
| lxx.ConceptA 0.8 | 5.5 | 9.7% | 2 |
| bayen.UbaMicro 1.4 | 5.8 | 9.2% | 1 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.9% | 2 |
| conscience.Electron 1.3g | 8.8 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.3 | 19 / 35 | 4436 |
| 2 | 2 | 63.1 | 80.3 | 8 / 35 | 3726 |
| 3 | 1 | 67.3 | 87.9 | 22 / 35 | 4237 |
| 4 | 1 | 64.2 | 82.9 | 12 / 35 | 3726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 47% |
| apc.botM 3.0 | 26 | 69% |
| vjik.UnViolation 1.1 | 10 | 60% |
| lxx.ConceptA 0.8 | 6 | 83% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| yk.JahMicro 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 1 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 86 of 140 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 32 | 37% | 52 |
| lxx.ConceptA 0.8 | 13 | 15% | 18 |
| apc.botM 3.0 | 10 | 12% | 25 |
| vjik.UnViolation 1.1 | 10 | 12% | 20 |
| bayen.UbaMicro 1.4 | 10 | 12% | 14 |
| conscience.Electron 1.3g | 2 | 2% | 4 |
| yk.JahMicro 1.0 | 2 | 2% | 3 |
| panzer.Panzer 0.2 | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 86022 melee ticks, 33543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 33 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 29703 sent, 26679 reached their opponent, 5142 virtual hits (19.3% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.5% ± 3.5 | 66.9% ± 1.2 | -1.4 ± 2.5 |
| Survival | 84.6% ± 5.8 | 88.6% ± 2.4 | -4.0 ± 6.6 |
| Rounds won | 43.6% ± 29.1 | 51.4% ± 19.3 | -7.9 ± 13.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 52.1% ± 7.1 | 54.7% ± 3.3 | -2.6 ± 5.0 |
| apc.botM 3.0 | 58.3% ± 3.3 | 59.0% ± 2.3 | -0.6 ± 5.1 |
| yk.JahMicro 1.0 | 71.2% ± 3.8 | 71.7% ± 5.2 | -0.5 ± 6.7 |
| bayen.UbaMicro 1.4 | 64.6% ± 4.8 | 67.3% ± 4.9 | -2.7 ± 5.3 |
| vjik.UnViolation 1.1 | 61.4% ± 3.9 | 65.0% ± 3.0 | -3.6 ± 6.6 |
| panzer.Panzer 0.2 | 69.3% ± 2.7 | 70.7% ± 5.1 | -1.4 ± 6.4 |
| conscience.Electron 1.3g | 72.7% ± 4.5 | 74.1% ± 4.4 | -1.5 ± 7.0 |
| lxx.ConceptA 0.8 | 63.4% ± 4.5 | 62.6% ± 1.6 | +0.8 ± 3.0 |
| donjezza.Jezza 1.0 | 76.4% ± 6.2 | 77.3% ± 6.1 | -0.9 ± 9.0 |

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 479 over 4 battles (119.8 per battle, most in one battle 209). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 88.6 | 72 / 140 | 2.03 | 17.8% | 16770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.8% | 72 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 32 |
| apc.botM 3.0 | 3.0 | 12.4% | 17 |
| lxx.ConceptA 0.8 | 4.3 | 10.6% | 5 |
| vjik.UnViolation 1.1 | 5.3 | 9.6% | 3 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 3 |
| panzer.Panzer 0.2 | 7.0 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.5 | 7.0% | 6 |
| conscience.Electron 1.3g | 8.8 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 89.8 | 20 / 35 | 4324 |
| 2 | 1 | 66.6 | 89.8 | 15 / 35 | 4046 |
| 3 | 1 | 67.4 | 87.6 | 23 / 35 | 4213 |
| 4 | 1 | 66.0 | 87.0 | 14 / 35 | 4187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 51% |
| apc.botM 3.0 | 30 | 63% |
| vjik.UnViolation 1.1 | 11 | 91% |
| lxx.ConceptA 0.8 | 10 | 80% |
| yk.JahMicro 1.0 | 9 | 67% |
| bayen.UbaMicro 1.4 | 3 | 33% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 1 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 73 of 140 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 25 | 34% | 50 |
| apc.botM 3.0 | 14 | 19% | 33 |
| lxx.ConceptA 0.8 | 13 | 18% | 18 |
| bayen.UbaMicro 1.4 | 6 | 8% | 7 |
| yk.JahMicro 1.0 | 5 | 7% | 8 |
| vjik.UnViolation 1.1 | 3 | 4% | 14 |
| panzer.Panzer 0.2 | 2 | 3% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
| conscience.Electron 1.3g | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 89020 melee ticks, 36844 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 50 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 29658 sent, 26669 reached their opponent, 5102 virtual hits (19.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 382 over 4 battles (95.5 per battle, most in one battle 101). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.4 | 64 / 140 | 2.49 | 17.4% | 16661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.4% | 64 |
| maribo.Quester 0.3 | 1.8 | 16.7% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.1% | 9 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 11 |
| labg.Cataclysm 2.05 | 4.8 | 11.3% | 18 |
| baal.nano.N 1.42 | 6.0 | 9.2% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 9.0% | 4 |
| sanja.First 0.1 | 8.5 | 5.3% | 1 |
| zyx.micro.Ant 1.1 | 8.8 | 4.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 15 / 35 | 4303 |
| 2 | 1 | 68.1 | 86.7 | 19 / 35 | 4223 |
| 3 | 2 | 65.0 | 78.4 | 12 / 35 | 3972 |
| 4 | 1 | 67.6 | 84.1 | 18 / 35 | 4163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 38 | 82% |
| gre.svman4.Leonidas 1.3.2 | 16 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 85% |
| labg.Cataclysm 2.05 | 9 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 82 of 140 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 39% | 63 |
| labg.Cataclysm 2.05 | 11 | 13% | 14 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 13% | 12 |
| gre.svman4.Leonidas 1.3.2 | 10 | 12% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 11% | 21 |
| baal.nano.N 1.42 | 4 | 5% | 10 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 116353 melee ticks, 26269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 50 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 37729 sent, 34607 reached their opponent, 5476 virtual hits (15.8% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.1% ± 2.2 | 67.6% ± 2.0 | -0.5 ± 0.6 |
| Survival | 83.4% ± 5.6 | 85.6% ± 7.0 | -2.2 ± 1.8 |
| Rounds won | 45.7% ± 14.4 | 47.1% ± 10.8 | -1.4 ± 5.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| sanja.First 0.1 | 76.8% ± 3.8 | 79.6% ± 3.4 | -2.7 ± 1.3 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59.0% ± 3.6 | 58.2% ± 4.3 | +0.8 ± 3.1 |
| zyx.micro.Ant 1.1 | 79.3% ± 5.7 | 76.3% ± 1.2 | +3.0 ± 6.5 |
| labg.Cataclysm 2.05 | 60.7% ± 5.0 | 63.2% ± 3.5 | -2.5 ± 3.6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 84.1% ± 4.3 | 82.9% ± 4.8 | +1.2 ± 5.7 |
| kinsen.melee.Angsaichmophobia 1.8c | 65.9% ± 2.0 | 66.7% ± 2.7 | -0.8 ± 4.1 |
| maribo.Quester 0.3 | 51.1% ± 2.4 | 52.9% ± 3.4 | -1.8 ± 2.6 |
| gre.svman4.Leonidas 1.3.2 | 61.2% ± 3.4 | 62.1% ± 3.8 | -0.9 ± 3.4 |
| baal.nano.N 1.42 | 65.5% ± 3.7 | 66.5% ± 4.2 | -1.0 ± 4.9 |

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 515 over 4 battles (128.8 per battle, most in one battle 216). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.6 | 66 / 140 | 2.29 | 17.9% | 17150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 66 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 8 |
| labg.Cataclysm 2.05 | 5.0 | 10.4% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 9.0% | 2 |
| baal.nano.N 1.42 | 6.5 | 9.0% | 0 |
| zyx.micro.Ant 1.1 | 8.0 | 5.6% | 0 |
| sanja.First 0.1 | 9.3 | 4.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 15 / 35 | 4327 |
| 2 | 1 | 68.8 | 90.2 | 18 / 35 | 4456 |
| 3 | 1 | 65.9 | 79.7 | 14 / 35 | 4002 |
| 4 | 1 | 68.2 | 87.0 | 19 / 35 | 4365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 38 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 65% |
| gre.svman4.Leonidas 1.3.2 | 14 | 86% |
| labg.Cataclysm 2.05 | 10 | 50% |
| baal.nano.N 1.42 | 3 | 100% |

Hadur died in 79 of 140 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 37% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 19% | 31 |
| gre.svman4.Leonidas 1.3.2 | 15 | 19% | 21 |
| labg.Cataclysm 2.05 | 8 | 10% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 6 |
| baal.nano.N 1.42 | 2 | 3% | 8 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 115177 melee ticks, 29812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 56 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 38274 sent, 35225 reached their opponent, 5632 virtual hits (16.0% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 4 battles (94.3 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.2 | 49 / 140 | 2.15 | 17.4% | 17425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.4% | 49 |
| kid.Gladiator .7.2 | 2.0 | 16.6% | 32 |
| stelo.Spread 0.9 | 2.8 | 15.7% | 38 |
| jcs.Seth 1.8 | 4.0 | 12.0% | 14 |
| tcf.Reach 3 | 5.0 | 10.5% | 6 |
| cli.Dancer 1.1 | 6.0 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 12 / 35 | 4353 |
| 2 | 1 | 69.1 | 91.4 | 16 / 35 | 4641 |
| 3 | 2 | 66.5 | 85.1 | 9 / 35 | 4130 |
| 4 | 1 | 67.4 | 86.7 | 12 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 42 | 55% |
| kid.Gladiator .7.2 | 34 | 35% |
| jcs.Seth 1.8 | 13 | 46% |
| tcf.Reach 3 | 5 | 40% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 95 of 140 rounds, at a mean tick of 1112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 40 | 42% | 52 |
| stelo.Spread 0.9 | 24 | 25% | 47 |
| jcs.Seth 1.8 | 11 | 12% | 17 |
| tcf.Reach 3 | 11 | 12% | 14 |
| ratosh.Wesco 1.4 | 3 | 3% | 3 |
| sample.VelociRobot 1.0 | 2 | 2% | 2 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 120101 melee ticks, 32349 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 25 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 36703 sent, 33805 reached their opponent, 5966 virtual hits (17.6% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.5% ± 1.7 | 66.2% ± 2.0 | +1.4 ± 2.7 |
| Survival | 87.2% ± 4.6 | 83.7% ± 5.0 | +3.5 ± 6.1 |
| Rounds won | 35.0% ± 13.1 | 30.7% ± 11.4 | +4.3 ± 20.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.Spread 0.9 | 52.5% ± 3.8 | 50.6% ± 3.6 | +1.9 ± 3.4 |
| tcf.Reach 3 | 62.3% ± 1.8 | 60.4% ± 2.8 | +1.9 ± 3.3 |
| ratosh.Wesco 1.4 | 70.5% ± 1.3 | 69.7% ± 4.8 | +0.8 ± 3.7 |
| amk.Punbot.Punbot 0.01 | 77.6% ± 3.9 | 75.7% ± 3.0 | +1.9 ± 6.6 |
| kid.Gladiator .7.2 | 51.1% ± 3.3 | 50.4% ± 3.6 | +0.7 ± 6.3 |
| sample.RamFire 1.0 | 86.4% ± 2.7 | 83.7% ± 2.1 | +2.7 ± 3.5 |
| jcs.Seth 1.8 | 59.2% ± 2.8 | 59.5% ± 3.0 | -0.3 ± 3.9 |
| sample.VelociRobot 1.0 | 82.7% ± 2.4 | 82.2% ± 1.2 | +0.5 ± 2.9 |
| cli.Dancer 1.1 | 65.5% ± 2.8 | 63.4% ± 2.9 | +2.1 ± 3.6 |

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 347 over 4 battles (86.8 per battle, most in one battle 92). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.7 | 43 / 140 | 2.46 | 16.6% | 16582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.8 | 16.6% | 43 |
| kid.Gladiator .7.2 | 2.0 | 16.3% | 33 |
| stelo.Spread 0.9 | 2.3 | 16.2% | 47 |
| jcs.Seth 1.8 | 4.0 | 11.3% | 10 |
| tcf.Reach 3 | 5.0 | 10.8% | 5 |
| cli.Dancer 1.1 | 6.0 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 79.0 | 8 / 35 | 3765 |
| 2 | 1 | 66.4 | 84.8 | 11 / 35 | 4282 |
| 3 | 1 | 67.4 | 86.0 | 14 / 35 | 4379 |
| 4 | 2 | 66.5 | 85.1 | 10 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 37 | 46% |
| kid.Gladiator .7.2 | 36 | 47% |
| jcs.Seth 1.8 | 10 | 50% |
| tcf.Reach 3 | 5 | 60% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 101 of 140 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 40 | 40% | 52 |
| stelo.Spread 0.9 | 35 | 35% | 50 |
| jcs.Seth 1.8 | 9 | 9% | 15 |
| tcf.Reach 3 | 7 | 7% | 14 |
| cli.Dancer 1.1 | 2 | 2% | 3 |
| sample.VelociRobot 1.0 | 2 | 2% | 2 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 119508 melee ticks, 35186 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 33 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 36610 sent, 33583 reached their opponent, 5816 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 4 battles (94.3 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 77.8 | 16 / 140 | 3.00 | 14.4% | 12513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 106 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.4% | 16 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.7% | 11 |
| rz.HawkOnFire 0.1 | 4.3 | 12.1% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.1% | 5 |
| wit.Chuliath 1.0 | 6.8 | 6.6% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 73.7 | 4 / 35 | 2836 |
| 2 | 2 | 61.6 | 77.5 | 1 / 35 | 3147 |
| 3 | 2 | 64.4 | 81.0 | 8 / 35 | 3336 |
| 4 | 2 | 62.8 | 79.0 | 3 / 35 | 3194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 56 | 18% |
| gh.mini.Gruwel 0.9 | 8 | 25% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 67% |
| rz.HawkOnFire 0.1 | 2 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 73 | 57% | 82 |
| gh.mini.Gruwel 0.9 | 20 | 16% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 10% | 16 |
| rz.HawkOnFire 0.1 | 13 | 10% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 2% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 97748 melee ticks, 26761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 45 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 30761 sent, 27679 reached their opponent, 4600 virtual hits (16.6% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.4% ± 2.5 | 62.8% ± 2.1 | -0.4 ± 1.4 |
| Survival | 77.8% ± 4.9 | 79.3% ± 5.7 | -1.5 ± 3.6 |
| Rounds won | 11.4% ± 13.4 | 12.1% ± 8.6 | -0.7 ± 15.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.MyAgileRobot 0.2 | 74.8% ± 4.8 | 75.3% ± 3.4 | -0.4 ± 5.6 |
| myl.nano.KomoriNinja 1.1 | 69.3% ± 3.2 | 70.6% ± 1.8 | -1.3 ± 3.0 |
| rz.HawkOnFire 0.1 | 54.2% ± 3.4 | 55.5% ± 3.7 | -1.4 ± 2.2 |
| cz.libors.Ogi v1 | 41.5% ± 2.9 | 42.3% ± 3.2 | -0.8 ± 3.7 |
| wit.Chuliath 1.0 | 68.6% ± 3.3 | 66.5% ± 4.1 | +2.1 ± 5.4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 70.8% ± 7.2 | 69.1% ± 5.1 | +1.7 ± 4.5 |
| dmh.robocode.robot.BlackDeath 9.2 | 54.3% ± 1.1 | 56.8% ± 3.2 | -2.5 ± 3.8 |
| dans.Cinnamon 1.2 | 74.9% ± 2.5 | 75.8% ± 1.8 | -1.0 ± 0.7 |
| gh.mini.Gruwel 0.9 | 53.1% ± 4.3 | 53.5% ± 3.4 | -0.4 ± 2.8 |

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 409 over 4 battles (102.3 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 79.3 | 17 / 140 | 2.86 | 14.7% | 12549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 107 |
| hadur2.Hadur 3.17.1aa | 2.0 | 14.7% | 17 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.8% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.1% | 4 |
| wit.Chuliath 1.0 | 6.3 | 7.4% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.6% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 6.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 76.5 | 3 / 35 | 2952 |
| 2 | 2 | 61.4 | 75.9 | 3 / 35 | 2934 |
| 3 | 2 | 64.0 | 82.2 | 4 / 35 | 3378 |
| 4 | 2 | 64.0 | 82.5 | 7 / 35 | 3285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 56 | 9% |
| gh.mini.Gruwel 0.9 | 12 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |
| rz.HawkOnFire 0.1 | 3 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 77 | 61% | 82 |
| gh.mini.Gruwel 0.9 | 14 | 11% | 20 |
| rz.HawkOnFire 0.1 | 14 | 11% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 8% | 12 |
| stelo.MyAgileRobot 0.2 | 4 | 3% | 4 |
| wit.Chuliath 1.0 | 2 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 2% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 96913 melee ticks, 32051 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 33 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 31083 sent, 27981 reached their opponent, 4601 virtual hits (16.4% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 415 over 4 battles (103.8 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.5 | 101 / 140 | 1.49 | 20.4% | 19503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.4% | 101 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 11 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 6 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 11 |
| mz.Cork 0.1 | 4.8 | 10.7% | 5 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.8% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.4 | 20 / 35 | 4661 |
| 2 | 1 | 71.2 | 96.2 | 28 / 35 | 4848 |
| 3 | 1 | 70.4 | 94.0 | 24 / 35 | 4717 |
| 4 | 1 | 71.5 | 96.5 | 29 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 29 | 90% |
| bvh.micro.Freya 0.3 | 26 | 73% |
| mz.Cork 0.1 | 24 | 88% |
| alpha.RainingFire 1.0 | 19 | 89% |
| bvh.mini.Fenrir 0.39 | 9 | 89% |
| m3thos.Eva02 0.7.1 | 9 | 78% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 43 of 140 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 10 | 23% | 26 |
| alpha.RainingFire 1.0 | 10 | 23% | 24 |
| mz.Cork 0.1 | 6 | 14% | 26 |
| bzdp.Pansy 2.1 | 4 | 9% | 23 |
| m3thos.Eva02 0.7.1 | 4 | 9% | 19 |
| bvh.mini.Fenrir 0.39 | 3 | 7% | 15 |
| dl.BetterWalls 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 100650 melee ticks, 29704 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 57 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 35200 sent, 32246 reached their opponent, 7162 virtual hits (22.2% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.6% ± 1.5 | 68.9% ± 1.0 | +1.8 ± 1.9 |
| Survival | 94.5% ± 3.7 | 89.6% ± 2.9 | +4.9 ± 6.0 |
| Rounds won | 72.1% ± 18.7 | 65.7% ± 9.1 | +6.4 ± 15.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| squidM.TentalceMeleeNano 1.1 | 77.8% ± 3.1 | 76.8% ± 2.9 | +1.0 ± 5.0 |
| bvh.mini.Fenrir 0.39 | 68.4% ± 2.6 | 65.6% ± 2.1 | +2.9 ± 3.4 |
| bzdp.Pansy 2.1 | 63.1% ± 4.5 | 61.3% ± 2.5 | +1.8 ± 4.3 |
| mz.Cork 0.1 | 65.8% ± 4.9 | 63.5% ± 3.0 | +2.3 ± 6.2 |
| bvh.micro.Freya 0.3 | 65.0% ± 1.8 | 65.7% ± 2.7 | -0.7 ± 3.8 |
| m3thos.Eva02 0.7.1 | 68.0% ± 3.4 | 65.1% ± 2.3 | +3.0 ± 4.1 |
| alpha.RainingFire 1.0 | 62.5% ± 4.4 | 61.3% ± 2.9 | +1.2 ± 7.3 |
| dl.BetterWalls 1.0 | 80.3% ± 3.4 | 77.8% ± 5.8 | +2.5 ± 9.2 |
| sample.MyFirstRobot 1.0 | 84.5% ± 0.9 | 82.7% ± 3.9 | +1.8 ± 3.1 |

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 409 over 4 battles (102.3 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.6 | 92 / 140 | 1.94 | 19.1% | 18239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 92 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.1% | 8 |
| mz.Cork 0.1 | 5.0 | 11.0% | 10 |
| bvh.mini.Fenrir 0.39 | 5.3 | 10.1% | 2 |
| bvh.micro.Freya 0.3 | 5.8 | 10.0% | 9 |
| m3thos.Eva02 0.7.1 | 5.8 | 10.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 92.1 | 22 / 35 | 4680 |
| 2 | 1 | 68.4 | 88.6 | 22 / 35 | 4464 |
| 3 | 1 | 68.3 | 87.9 | 22 / 35 | 4402 |
| 4 | 1 | 69.4 | 89.8 | 26 / 35 | 4693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 29 | 93% |
| alpha.RainingFire 1.0 | 21 | 76% |
| mz.Cork 0.1 | 18 | 89% |
| m3thos.Eva02 0.7.1 | 12 | 83% |
| bvh.micro.Freya 0.3 | 12 | 75% |
| bvh.mini.Fenrir 0.39 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 52 of 140 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 21% | 28 |
| bzdp.Pansy 2.1 | 9 | 17% | 31 |
| mz.Cork 0.1 | 8 | 15% | 27 |
| bvh.mini.Fenrir 0.39 | 7 | 13% | 13 |
| bvh.micro.Freya 0.3 | 6 | 12% | 18 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 14 |
| dl.BetterWalls 1.0 | 3 | 6% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 101607 melee ticks, 26748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 41 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 35200 sent, 32236 reached their opponent, 7133 virtual hits (22.1% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 423 over 4 battles (105.8 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.6 | 103 / 140 | 2.30 | 18.2% | 19914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.2% | 103 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.7% | 6 |
| germ.TheMind .2 | 3.3 | 10.6% | 9 |
| EBBU.Sim2 1.02 | 4.8 | 9.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 5.5 | 9.0% | 1 |
| agrach.Dalek 1.0 | 6.5 | 8.4% | 6 |
| lmk.ACPFinal 0.1 | 6.8 | 8.9% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.6% | 3 |
| mb.Beast 0.1 | 8.5 | 8.0% | 4 |
| skm.Ryubot 1.0 | 8.8 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.3 | 25 / 35 | 4980 |
| 2 | 1 | 66.5 | 83.2 | 26 / 35 | 5031 |
| 3 | 1 | 69.8 | 95.6 | 30 / 35 | 5298 |
| 4 | 1 | 63.9 | 76.2 | 22 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 16 | 94% |
| skm.Ryubot 1.0 | 15 | 100% |
| EBBU.Sim2 1.02 | 14 | 100% |
| stelo.UntouchableNano 1.3 | 13 | 100% |
| agrach.Dalek 1.0 | 13 | 92% |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 11 | 100% |
| mb.Beast 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 43 of 140 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 33% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 19% | 19 |
| mb.Beast 0.1 | 5 | 12% | 18 |
| lmk.ACPFinal 0.1 | 4 | 9% | 19 |
| agrach.Dalek 1.0 | 2 | 5% | 18 |
| EBBU.Sim2 1.02 | 2 | 5% | 15 |
| stelo.UntouchableNano 1.3 | 2 | 5% | 15 |
| germ.TheMind .2 | 2 | 5% | 14 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 65638 melee ticks, 16250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 57 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 22436 sent, 19694 reached their opponent, 6204 virtual hits (31.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.8% ± 3.8 | 67.1% ± 2.5 | -0.3 ± 5.5 |
| Survival | 85.6% ± 12.9 | 86.7% ± 7.3 | -1.2 ± 17.9 |
| Rounds won | 73.6% ± 15.0 | 70.0% ± 13.6 | +3.6 ± 27.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 65.2% ± 2.5 | 64.5% ± 3.9 | +0.7 ± 4.6 |
| germ.TheMind .2 | 63.1% ± 4.9 | 65.7% ± 1.5 | -2.6 ± 5.1 |
| lmk.ACPFinal 0.1 | 67.2% ± 2.1 | 69.4% ± 5.5 | -2.1 ± 7.0 |
| mb.Beast 0.1 | 69.4% ± 6.6 | 71.0% ± 7.6 | -1.6 ± 12.5 |
| agrach.Dalek 1.0 | 68.4% ± 8.5 | 66.2% ± 2.0 | +2.3 ± 6.7 |
| stelo.UntouchableNano 1.3 | 67.9% ± 5.7 | 66.8% ± 5.5 | +1.0 ± 8.5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 63.1% ± 3.1 | 63.6% ± 2.3 | -0.5 ± 2.9 |
| skm.Ryubot 1.0 | 70.1% ± 3.8 | 70.1% ± 2.4 | -0.0 ± 6.1 |
| mn.nano.perceptual.Impact 1.3.0 | 66.8% ± 8.1 | 66.9% ± 3.4 | -0.1 ± 10.8 |

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 379 over 4 battles (94.8 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.7 | 98 / 140 | 2.19 | 18.4% | 20018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 98 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.6% | 6 |
| EBBU.Sim2 1.02 | 3.5 | 10.1% | 9 |
| germ.TheMind .2 | 4.8 | 9.6% | 4 |
| agrach.Dalek 1.0 | 5.5 | 9.4% | 7 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.2% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 9.1% | 0 |
| lmk.ACPFinal 0.1 | 7.5 | 8.2% | 3 |
| skm.Ryubot 1.0 | 9.0 | 7.8% | 1 |
| mb.Beast 0.1 | 9.0 | 7.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.8 | 26 / 35 | 5339 |
| 2 | 1 | 65.4 | 82.2 | 22 / 35 | 4824 |
| 3 | 1 | 66.1 | 83.5 | 22 / 35 | 4962 |
| 4 | 1 | 68.4 | 91.4 | 28 / 35 | 4893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 18 | 83% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| agrach.Dalek 1.0 | 17 | 88% |
| germ.TheMind .2 | 15 | 100% |
| skm.Ryubot 1.0 | 14 | 100% |
| EBBU.Sim2 1.02 | 9 | 78% |
| mb.Beast 0.1 | 7 | 100% |
| lmk.ACPFinal 0.1 | 6 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 46 of 140 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 17% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 15% | 14 |
| agrach.Dalek 1.0 | 6 | 13% | 30 |
| EBBU.Sim2 1.02 | 6 | 13% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 9% | 21 |
| mb.Beast 0.1 | 4 | 9% | 9 |
| germ.TheMind .2 | 3 | 7% | 12 |
| lmk.ACPFinal 0.1 | 3 | 7% | 9 |
| skm.Ryubot 1.0 | 1 | 2% | 10 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 68355 melee ticks, 17496 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 24 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 23145 sent, 20329 reached their opponent, 6216 virtual hits (30.6% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 4 battles (104.8 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.3 | 65 / 140 | 2.32 | 17.1% | 15805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 17.1% | 65 |
| justin.Mallais 14.0 | 1.8 | 15.8% | 40 |
| bvh.mini.Freya 0.55 | 3.3 | 12.6% | 8 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.0% | 14 |
| cs.Wren 1.0 | 5.3 | 10.8% | 8 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.2% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.9% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 7.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.2% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 79.0 | 11 / 35 | 3605 |
| 2 | 1 | 65.9 | 85.4 | 16 / 35 | 3707 |
| 3 | 1 | 67.5 | 88.3 | 18 / 35 | 4116 |
| 4 | 1 | 68.2 | 88.6 | 20 / 35 | 4377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 56% |
| cs.Wren 1.0 | 16 | 88% |
| bts.mega.Gnarly 1.4 | 14 | 50% |
| bvh.mini.Freya 0.55 | 12 | 83% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |

Hadur died in 80 of 140 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 27 | 34% | 57 |
| cs.Wren 1.0 | 15 | 19% | 25 |
| bts.mega.Gnarly 1.4 | 12 | 15% | 18 |
| bvh.mini.Freya 0.55 | 12 | 15% | 18 |
| kdf.KoulDestroyer 1.0 | 8 | 10% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 137 rounds): 93815 melee ticks, 24209 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (137 rounds): longest scan gap while four or more were alive 30 ticks (137 rounds over 8); rounds whose longest gap at any count was over 8: 137; robots dropped as dead without a death event: 0.

Targeting waves (137 rounds): 31798 sent, 28633 reached their opponent, 6570 virtual hits (22.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.4% ± 3.0 | 65.6% ± 1.9 | +0.7 ± 2.5 |
| Survival | 85.3% ± 7.0 | 82.3% ± 5.6 | +3.0 ± 6.6 |
| Rounds won | 46.4% ± 17.6 | 40.0% ± 15.3 | +6.4 ± 14.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| kdf.KoulDestroyer 1.0 | 65.0% ± 3.7 | 63.4% ± 3.7 | +1.5 ± 3.8 |
| justin.Mallais 14.0 | 52.0% ± 3.7 | 50.0% ± 3.1 | +2.0 ± 2.6 |
| cs.Wren 1.0 | 61.2% ± 6.4 | 61.7% ± 3.0 | -0.5 ± 4.6 |
| bzdp.BoxCar 2.0 | 83.8% ± 2.2 | 82.3% ± 3.4 | +1.5 ± 4.9 |
| matt.UnderDark3 2.4.34 | 80.2% ± 3.7 | 80.3% ± 1.3 | -0.1 ± 5.0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 70.8% ± 2.3 | 75.2% ± 5.3 | -4.5 ± 6.8 |
| davidalves.net.DuelistNanoMelee 1.01 | 65.8% ± 3.1 | 64.1% ± 6.8 | +1.7 ± 3.9 |
| bts.mega.Gnarly 1.4 | 60.9% ± 4.5 | 57.7% ± 3.7 | +3.2 ± 5.4 |
| bvh.mini.Freya 0.55 | 57.7% ± 6.4 | 55.9% ± 3.2 | +1.8 ± 5.9 |

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 387 over 4 battles (96.8 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.3 | 56 / 140 | 2.59 | 16.5% | 15815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.5% | 48 |
| hadur2.Hadur 3.17.1aa | 1.5 | 16.5% | 56 |
| bvh.mini.Freya 0.55 | 3.3 | 13.0% | 12 |
| bts.mega.Gnarly 1.4 | 4.0 | 12.1% | 15 |
| cs.Wren 1.0 | 5.5 | 10.2% | 3 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.5% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.3 | 9.3% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.4% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 78.4 | 10 / 35 | 3687 |
| 2 | 2 | 66.9 | 87.0 | 15 / 35 | 4009 |
| 3 | 1 | 66.0 | 81.6 | 18 / 35 | 3998 |
| 4 | 1 | 65.7 | 82.2 | 13 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 38 | 61% |
| bts.mega.Gnarly 1.4 | 16 | 69% |
| bvh.mini.Freya 0.55 | 12 | 67% |
| cs.Wren 1.0 | 8 | 88% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |

Hadur died in 88 of 140 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 31 | 35% | 54 |
| bts.mega.Gnarly 1.4 | 20 | 23% | 31 |
| bvh.mini.Freya 0.55 | 10 | 11% | 17 |
| kdf.KoulDestroyer 1.0 | 10 | 11% | 13 |
| cs.Wren 1.0 | 6 | 7% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 5 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 93797 melee ticks, 19935 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 56 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 31045 sent, 27892 reached their opponent, 6579 virtual hits (23.6% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 418 over 4 battles (104.5 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.6 | 40 / 140 | 2.74 | 16.1% | 16543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.5 | 15.9% | 24 |
| hadur2.Hadur 3.17.1bb | 1.5 | 16.1% | 40 |
| az.Ololobot 0.2.4 | 3.0 | 14.2% | 44 |
| catcat20.Lambda 0.024 | 4.0 | 12.9% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.4% | 1 |
| gimp.GimpBot 0.1 | 6.0 | 8.2% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.2% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 76.2 | 5 / 35 | 3887 |
| 2 | 1 | 66.5 | 86.0 | 15 / 35 | 4233 |
| 3 | 2 | 64.7 | 81.9 | 8 / 35 | 4172 |
| 4 | 1 | 64.7 | 78.4 | 12 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 26 | 27% |
| bvh.fry.Freya 0.82 | 24 | 71% |
| catcat20.Lambda 0.024 | 19 | 47% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| gimp.GimpBot 0.1 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |

Hadur died in 105 of 140 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 35 | 33% | 47 |
| az.Ololobot 0.2.4 | 30 | 29% | 37 |
| catcat20.Lambda 0.024 | 22 | 21% | 31 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 4% | 6 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 4 |
| gimp.GimpBot 0.1 | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 118049 melee ticks, 27054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 71 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 37142 sent, 34084 reached their opponent, 6403 virtual hits (18.8% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.6% ± 2.5 | 66.6% ± 2.4 | -2.0 ± 4.0 |
| Survival | 80.6% ± 6.8 | 85.8% ± 6.0 | -5.2 ± 11.4 |
| Rounds won | 28.6% ± 20.0 | 47.9% ± 21.4 | -19.3 ± 36.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gimp.GimpBot 0.1 | 66.1% ± 3.6 | 69.1% ± 4.7 | -3.0 ± 4.6 |
| catcat20.Lambda 0.024 | 55.5% ± 4.1 | 57.7% ± 5.5 | -2.2 ± 9.4 |
| bvh.fry.Freya 0.82 | 50.2% ± 4.3 | 54.2% ± 3.2 | -4.0 ± 6.1 |
| apollokidd.ApolloKidd 0.9 | 69.0% ± 3.7 | 69.8% ± 1.6 | -0.8 ± 2.4 |
| winamp32.micro.MicroMacro 1.0 | 65.6% ± 2.1 | 67.8% ± 2.5 | -2.2 ± 4.4 |
| stelo.SoRobotNanoMelee 1.2 | 69.0% ± 4.3 | 70.1% ± 4.1 | -1.1 ± 7.7 |
| dcs.Eater_of_Worlds 1.1.3-A | 78.5% ± 4.1 | 77.8% ± 4.3 | +0.7 ± 3.2 |
| az.Ololobot 0.2.4 | 53.2% ± 2.1 | 57.5% ± 4.6 | -4.3 ± 5.4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 74.7% ± 2.7 | 75.7% ± 1.6 | -1.0 ± 2.2 |

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 534 over 4 battles (133.5 per battle, most in one battle 224). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.8 | 67 / 140 | 2.28 | 17.5% | 17527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.5% | 67 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 11 |
| az.Ololobot 0.2.4 | 3.5 | 12.9% | 32 |
| catcat20.Lambda 0.024 | 3.5 | 12.9% | 24 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 7.6% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.5% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.6% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.8 | 17 / 35 | 4245 |
| 2 | 1 | 64.7 | 81.0 | 10 / 35 | 4190 |
| 3 | 1 | 67.4 | 87.9 | 20 / 35 | 4482 |
| 4 | 1 | 68.2 | 89.5 | 20 / 35 | 4610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 30 | 57% |
| catcat20.Lambda 0.024 | 27 | 70% |
| bvh.fry.Freya 0.82 | 26 | 92% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 78 of 140 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 23 | 29% | 44 |
| bvh.fry.Freya 0.82 | 20 | 26% | 41 |
| catcat20.Lambda 0.024 | 20 | 26% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 5% | 6 |
| apollokidd.ApolloKidd 0.9 | 3 | 4% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| gimp.GimpBot 0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 112834 melee ticks, 37786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 51 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 1.

Targeting waves (140 rounds): 36240 sent, 33113 reached their opponent, 6300 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 4 battles (101.8 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.9 | 75 / 140 | 2.09 | 18.5% | 17928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.5% | 75 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 29 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.4% | 12 |
| Polkwane.SmashMelee 1.0 | 4.5 | 11.0% | 9 |
| mz.AntiGrav 1.0 | 4.5 | 11.1% | 6 |
| stelo.Randomness 1.0 | 5.8 | 10.2% | 7 |
| alpha.BlackIce 1.0 | 7.0 | 8.3% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.1% | 0 |
| sample.Corners 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.5 | 17 / 35 | 4304 |
| 2 | 1 | 68.2 | 87.0 | 18 / 35 | 4426 |
| 3 | 1 | 68.2 | 87.9 | 17 / 35 | 4550 |
| 4 | 1 | 69.2 | 87.0 | 23 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 65% |
| kano.gamma.KanoGamma 1.8 | 23 | 83% |
| mz.AntiGrav 1.0 | 18 | 100% |
| Polkwane.SmashMelee 1.0 | 10 | 60% |
| stelo.Randomness 1.0 | 9 | 56% |
| alpha.BlackIce 1.0 | 5 | 60% |

Hadur died in 69 of 140 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 23 | 33% | 36 |
| Polkwane.SmashMelee 1.0 | 13 | 19% | 19 |
| kano.gamma.KanoGamma 1.8 | 11 | 16% | 33 |
| stelo.Randomness 1.0 | 8 | 12% | 18 |
| alpha.BlackIce 1.0 | 5 | 7% | 8 |
| mz.AntiGrav 1.0 | 3 | 4% | 18 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 5 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 103540 melee ticks, 27402 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 58 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 34826 sent, 31700 reached their opponent, 6931 virtual hits (21.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.5% ± 0.8 | 68.0% ± 2.1 | +0.4 ± 1.6 |
| Survival | 87.9% ± 1.9 | 86.7% ± 6.0 | +1.2 ± 6.6 |
| Rounds won | 53.6% ± 13.1 | 53.6% ± 14.1 | +0.0 ± 7.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| amk.superstrike.SuperStrike 0.3 | 75.2% ± 4.1 | 74.4% ± 6.2 | +0.8 ± 5.8 |
| alpha.BlackIce 1.0 | 69.1% ± 3.6 | 66.5% ± 2.1 | +2.6 ± 4.5 |
| kano.gamma.KanoGamma 1.8 | 60.0% ± 3.9 | 58.4% ± 5.0 | +1.7 ± 5.7 |
| Polkwane.SmashMelee 1.0 | 62.8% ± 1.6 | 63.7% ± 2.5 | -0.9 ± 1.7 |
| kawigi.mini.Coriantumr 1.1 | 55.4% ± 1.7 | 55.4% ± 3.9 | -0.0 ± 4.5 |
| testantiswapgun.AntiSwap 1.0 | 81.9% ± 2.4 | 81.6% ± 4.8 | +0.3 ± 6.9 |
| stelo.Randomness 1.0 | 64.4% ± 1.9 | 67.7% ± 2.5 | -3.3 ± 2.4 |
| sample.Corners 1.0 | 84.7% ± 1.1 | 82.9% ± 5.8 | +1.8 ± 4.7 |
| mz.AntiGrav 1.0 | 62.6% ± 2.2 | 61.7% ± 3.5 | +1.0 ± 2.0 |

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 372 over 4 battles (93.0 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.7 | 75 / 140 | 2.20 | 18.3% | 17731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.3% | 75 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 30 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 18 |
| mz.AntiGrav 1.0 | 4.0 | 11.4% | 5 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.4% | 5 |
| alpha.BlackIce 1.0 | 6.5 | 9.2% | 1 |
| stelo.Randomness 1.0 | 6.8 | 8.7% | 6 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.4% | 0 |
| sample.Corners 1.0 | 9.5 | 3.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 17 / 35 | 4599 |
| 2 | 1 | 66.3 | 82.2 | 16 / 35 | 4123 |
| 3 | 1 | 68.3 | 88.6 | 19 / 35 | 4301 |
| 4 | 1 | 69.5 | 90.8 | 23 / 35 | 4708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 65% |
| kano.gamma.KanoGamma 1.8 | 26 | 81% |
| mz.AntiGrav 1.0 | 15 | 87% |
| Polkwane.SmashMelee 1.0 | 8 | 88% |
| stelo.Randomness 1.0 | 4 | 50% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 69 of 140 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 35% | 46 |
| kano.gamma.KanoGamma 1.8 | 14 | 20% | 28 |
| mz.AntiGrav 1.0 | 10 | 14% | 22 |
| stelo.Randomness 1.0 | 7 | 10% | 14 |
| Polkwane.SmashMelee 1.0 | 5 | 7% | 11 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 6 |
| alpha.BlackIce 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 100019 melee ticks, 25664 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 74 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 33837 sent, 30780 reached their opponent, 6845 virtual hits (22.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 418 over 4 battles (104.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.4 | 59 / 140 | 2.41 | 16.7% | 14768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 16.7% | 59 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 51 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 9 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.2% | 8 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 6.1% | 1 |
| jsal.Jsalbot 1.0 | 8.8 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 81.3 | 11 / 35 | 3480 |
| 2 | 1 | 67.8 | 89.2 | 17 / 35 | 4050 |
| 3 | 1 | 65.4 | 82.2 | 14 / 35 | 3572 |
| 4 | 1 | 66.3 | 84.8 | 17 / 35 | 3666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 50 | 44% |
| lessonz.robocode.Oz 0.5.0 | 20 | 85% |
| ary.Swarm 1.1 | 8 | 75% |
| simonton.nano.MeleeSeed 1.8 | 7 | 86% |
| shrub.Silver v048 | 6 | 83% |
| stelo.Mirror 1.1 | 3 | 67% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 85 of 140 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 43 | 51% | 62 |
| ary.Swarm 1.1 | 14 | 16% | 23 |
| lessonz.robocode.Oz 0.5.0 | 10 | 12% | 19 |
| simonton.nano.MeleeSeed 1.8 | 10 | 12% | 17 |
| shrub.Silver v048 | 3 | 4% | 10 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 104480 melee ticks, 30813 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 51 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 35012 sent, 31953 reached their opponent, 5481 virtual hits (17.2% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.1% ± 2.1 | 66.9% ± 1.9 | -0.9 ± 2.1 |
| Survival | 84.4% ± 5.6 | 86.6% ± 3.2 | -2.2 ± 3.0 |
| Rounds won | 42.1% ± 13.1 | 47.9% ± 25.0 | -5.7 ± 21.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| acogdev.alpha 0.2 | 86.6% ± 2.8 | 87.1% ± 1.0 | -0.5 ± 2.1 |
| stelo.Mirror 1.1 | 73.5% ± 3.0 | 74.7% ± 1.3 | -1.2 ± 3.9 |
| eem.EvBotNG v12.8 | 50.7% ± 5.1 | 53.2% ± 4.9 | -2.4 ± 4.6 |
| shrub.Silver v048 | 65.2% ± 3.3 | 66.2% ± 2.6 | -1.0 ± 4.9 |
| jsal.Jsalbot 1.0 | 76.3% ± 3.5 | 75.5% ± 3.8 | +0.7 ± 5.5 |
| ary.Swarm 1.1 | 56.7% ± 4.6 | 57.2% ± 1.6 | -0.4 ± 3.9 |
| lessonz.robocode.Oz 0.5.0 | 57.2% ± 2.8 | 56.5% ± 3.9 | +0.7 ± 3.8 |
| simonton.nano.MeleeSeed 1.8 | 60.0% ± 3.8 | 62.3% ± 3.2 | -2.3 ± 1.5 |
| zyx.nano.Ant 1.1 | 68.5% ± 1.0 | 69.7% ± 2.7 | -1.2 ± 2.3 |

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 402 over 4 battles (100.5 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.6 | 67 / 140 | 2.21 | 17.4% | 14925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.4% | 67 |
| eem.EvBotNG v12.8 | 1.8 | 15.3% | 46 |
| ary.Swarm 1.1 | 3.5 | 13.0% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.4% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 4 |
| shrub.Silver v048 | 6.3 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.6% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 84.4 | 14 / 35 | 3719 |
| 2 | 1 | 66.9 | 88.6 | 14 / 35 | 3543 |
| 3 | 1 | 66.0 | 85.4 | 14 / 35 | 3622 |
| 4 | 1 | 68.6 | 87.9 | 25 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 47 | 49% |
| ary.Swarm 1.1 | 22 | 91% |
| lessonz.robocode.Oz 0.5.0 | 20 | 70% |
| simonton.nano.MeleeSeed 1.8 | 5 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 77 of 140 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 38 | 49% | 64 |
| lessonz.robocode.Oz 0.5.0 | 16 | 21% | 23 |
| ary.Swarm 1.1 | 7 | 9% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5 | 6% | 14 |
| stelo.Mirror 1.1 | 4 | 5% | 4 |
| shrub.Silver v048 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 106579 melee ticks, 30847 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 73 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 35625 sent, 32584 reached their opponent, 5498 virtual hits (16.9% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 393 over 4 battles (98.3 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 82 / 140 | 1.95 | 19.0% | 20248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 82 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 32 |
| ara.Shera 0.88 | 3.3 | 13.6% | 16 |
| maribo.mini.MiniQuester 0.1 | 3.8 | 12.9% | 7 |
| amz.NanoClone 1.41 | 5.3 | 8.6% | 1 |
| dsw.StaticD 1.0 | 6.0 | 7.7% | 2 |
| maribo.IotaCT 1.1 | 7.5 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.8 | 20 / 35 | 5124 |
| 2 | 1 | 68.6 | 87.6 | 19 / 35 | 5031 |
| 3 | 1 | 68.1 | 87.0 | 18 / 35 | 4767 |
| 4 | 1 | 70.4 | 93.3 | 25 / 35 | 5326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 84% |
| ara.Shera 0.88 | 19 | 58% |
| maribo.mini.MiniQuester 0.1 | 15 | 80% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 62 of 140 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 20 | 32% | 32 |
| wompi.Wallaby 5.1 | 19 | 31% | 63 |
| maribo.mini.MiniQuester 0.1 | 12 | 19% | 29 |
| amz.NanoClone 1.41 | 5 | 8% | 6 |
| dsw.StaticD 1.0 | 2 | 3% | 8 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 111405 melee ticks, 31179 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 33 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 35847 sent, 32879 reached their opponent, 6877 virtual hits (20.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 69.1% ± 1.6 | 68.1% ± 3.0 | +1.0 ± 2.5 |
| Survival | 89.4% ± 4.6 | 87.3% ± 5.8 | +2.1 ± 4.1 |
| Rounds won | 58.6% ± 14.1 | 56.4% ± 27.4 | +2.1 ± 18.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| dsw.StaticD 1.0 | 71.2% ± 4.3 | 71.5% ± 7.0 | -0.3 ± 6.4 |
| maribo.IotaCT 1.1 | 75.0% ± 3.6 | 74.3% ± 0.9 | +0.7 ± 4.0 |
| stelo.MirrorMicro 1.0 | 77.3% ± 2.9 | 75.8% ± 8.3 | +1.5 ± 9.1 |
| mme.NikeEnhanced 2.0 | 78.6% ± 2.4 | 76.5% ± 1.8 | +2.1 ± 3.8 |
| ara.Shera 0.88 | 58.2% ± 4.0 | 58.2% ± 6.0 | -0.0 ± 5.2 |
| wompi.Wallaby 5.1 | 54.1% ± 2.4 | 53.5% ± 4.1 | +0.6 ± 3.3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 79.0% ± 3.3 | 78.9% ± 3.5 | +0.1 ± 5.0 |
| maribo.mini.MiniQuester 0.1 | 59.6% ± 5.5 | 56.8% ± 3.6 | +2.8 ± 3.5 |
| amz.NanoClone 1.41 | 68.8% ± 1.7 | 67.7% ± 1.6 | +1.1 ± 2.1 |

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 488 over 4 battles (122.0 per battle, most in one battle 214). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.3 | 79 / 140 | 2.14 | 18.3% | 19013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.3% | 79 |
| wompi.Wallaby 5.1 | 2.0 | 15.9% | 28 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.9% | 12 |
| ara.Shera 0.88 | 3.8 | 13.1% | 15 |
| amz.NanoClone 1.41 | 5.3 | 8.7% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.3% | 4 |
| maribo.IotaCT 1.1 | 6.8 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.1 | 14 / 35 | 4381 |
| 2 | 1 | 67.2 | 85.4 | 17 / 35 | 4588 |
| 3 | 1 | 68.3 | 87.3 | 20 / 35 | 4877 |
| 4 | 1 | 70.7 | 92.4 | 28 / 35 | 5167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 54 | 81% |
| maribo.mini.MiniQuester 0.1 | 24 | 83% |
| ara.Shera 0.88 | 15 | 60% |
| dsw.StaticD 1.0 | 4 | 75% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 67 of 140 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 21 | 31% | 66 |
| ara.Shera 0.88 | 18 | 27% | 26 |
| maribo.mini.MiniQuester 0.1 | 16 | 24% | 35 |
| maribo.IotaCT 1.1 | 3 | 4% | 5 |
| dsw.StaticD 1.0 | 2 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 108642 melee ticks, 31978 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 31 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 35378 sent, 32407 reached their opponent, 6810 virtual hits (21.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 4 battles (101.8 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.2 | 19 / 140 | 3.05 | 14.5% | 12964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 89 |
| hadur2.Hadur 3.17.1bb | 2.3 | 14.5% | 19 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 12.0% | 3 |
| dummy.micro.Sparrow 2.5 | 5.0 | 11.0% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.2% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 81.9 | 10 / 35 | 3405 |
| 2 | 3 | 61.1 | 70.2 | 2 / 35 | 3109 |
| 3 | 2 | 64.6 | 82.2 | 3 / 35 | 3503 |
| 4 | 2 | 62.4 | 74.6 | 4 / 35 | 2947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 49 | 14% |
| brainfade.melee.Dusk 0.44 | 9 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| dummy.micro.Sparrow 2.5 | 4 | 0% |
| mz.NanoGod 2.02 | 2 | 50% |
| cvt.Firsty 1.0 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 56% | 77 |
| brainfade.melee.Dusk 0.44 | 20 | 16% | 23 |
| dummy.micro.Sparrow 2.5 | 12 | 10% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 8% | 15 |
| mz.NanoGod 2.02 | 5 | 4% | 7 |
| Krabb.akim2.Akim2 1.1b | 2 | 2% | 3 |
| jab.DiamondStealer 5 | 2 | 2% | 2 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 136 rounds): 102037 melee ticks, 28823 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 24 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 33486 sent, 30409 reached their opponent, 5437 virtual hits (17.9% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.5% ± 3.3 | 63.9% ± 1.5 | -0.4 ± 4.0 |
| Survival | 77.2% ± 9.4 | 78.0% ± 5.0 | -0.8 ± 11.5 |
| Rounds won | 13.6% ± 16.3 | 8.6% ± 3.7 | +5.0 ± 14.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cvt.Firsty 1.0 | 76.8% ± 2.4 | 79.7% ± 2.3 | -2.9 ± 3.7 |
| Krabb.akim2.Akim2 1.1b | 61.1% ± 0.4 | 58.9% ± 3.6 | +2.2 ± 4.0 |
| jk.melee.Neuromancer 7.12 | 41.4% ± 5.1 | 40.3% ± 1.5 | +1.1 ± 5.4 |
| sample.SittingDuck 1.0 | 95.5% ± 2.8 | 96.3% ± 2.3 | -0.9 ± 2.8 |
| dummy.micro.Sparrow 2.5 | 56.9% ± 8.1 | 56.7% ± 2.4 | +0.2 ± 7.9 |
| wcsv.melee.EngineerMelee 0.1 | 54.6% ± 4.6 | 56.0% ± 2.4 | -1.4 ± 6.3 |
| mz.NanoGod 2.02 | 65.3% ± 3.4 | 65.4% ± 3.5 | -0.1 ± 6.6 |
| brainfade.melee.Dusk 0.44 | 53.4% ± 4.5 | 54.9% ± 1.3 | -1.5 ± 4.5 |
| jab.DiamondStealer 5 | 66.2% ± 5.3 | 66.3% ± 3.0 | -0.2 ± 4.5 |

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 417 over 4 battles (104.3 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.0 | 12 / 140 | 2.98 | 14.5% | 13221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 107 |
| hadur2.Hadur 3.17.1aa | 2.0 | 14.5% | 12 |
| brainfade.melee.Dusk 0.44 | 3.5 | 11.9% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.4% | 5 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.1% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 74.3 | 4 / 35 | 3171 |
| 2 | 2 | 63.4 | 76.8 | 3 / 35 | 3279 |
| 3 | 2 | 64.6 | 79.4 | 3 / 35 | 3478 |
| 4 | 2 | 64.7 | 81.6 | 2 / 35 | 3293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 7% |
| brainfade.melee.Dusk 0.44 | 8 | 38% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 132 of 140 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 59% | 82 |
| brainfade.melee.Dusk 0.44 | 22 | 17% | 25 |
| dummy.micro.Sparrow 2.5 | 13 | 10% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 6% | 9 |
| mz.NanoGod 2.02 | 5 | 4% | 5 |
| Krabb.akim2.Akim2 1.1b | 1 | 1% | 2 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 105684 melee ticks, 29934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 26 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 34207 sent, 31150 reached their opponent, 5576 virtual hits (17.9% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 380 over 4 battles (95.0 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.4 | 75 / 140 | 1.96 | 19.0% | 19469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.0% | 75 |
| stelo.Liblix 0.3.1 | 2.3 | 15.7% | 41 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.6% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 10.4% | 2 |
| jwirde.Gort 2.0 | 5.0 | 9.9% | 4 |
| wompi.Quokka 1.6 | 6.5 | 8.0% | 3 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.5% | 1 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.8 | 19 / 35 | 4593 |
| 2 | 1 | 67.8 | 86.7 | 15 / 35 | 4729 |
| 3 | 1 | 69.2 | 88.3 | 20 / 35 | 4991 |
| 4 | 1 | 70.2 | 91.7 | 21 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 53 | 49% |
| tzu.TheArtOfWar 1.2 | 38 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 75% |
| jwirde.Gort 2.0 | 7 | 100% |
| wompi.Quokka 1.6 | 3 | 33% |
| disan.Chair 2.2.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 70 of 140 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 49% | 64 |
| tzu.TheArtOfWar 1.2 | 13 | 19% | 40 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 8 |
| jwirde.Gort 2.0 | 4 | 6% | 15 |
| wompi.Quokka 1.6 | 3 | 4% | 3 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 3 |
| amk.jointstrike.JointStrike 0.2 | 3 | 4% | 3 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 105912 melee ticks, 34179 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 40 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 37182 sent, 34183 reached their opponent, 7525 virtual hits (22.0% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 69.0% ± 1.6 | 69.9% ± 1.3 | -0.9 ± 2.4 |
| Survival | 89.4% ± 3.7 | 90.6% ± 2.4 | -1.3 ± 5.2 |
| Rounds won | 53.6% ± 12.0 | 62.1% ± 17.6 | -8.6 ± 24.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| sample.Crazy 1.0 | 81.4% ± 2.3 | 80.1% ± 2.7 | +1.2 ± 2.3 |
| jwirde.Gort 2.0 | 65.8% ± 2.6 | 67.4% ± 3.6 | -1.6 ± 5.7 |
| stf.PanzerGeneral 0.1 | 71.8% ± 1.2 | 75.3% ± 1.9 | -3.5 ± 2.8 |
| stelo.Liblix 0.3.1 | 54.7% ± 2.5 | 55.3% ± 2.1 | -0.6 ± 4.4 |
| tzu.TheArtOfWar 1.2 | 58.2% ± 3.0 | 57.8% ± 4.8 | +0.4 ± 6.4 |
| amk.jointstrike.JointStrike 0.2 | 81.7% ± 3.8 | 82.9% ± 2.1 | -1.2 ± 5.6 |
| wompi.Quokka 1.6 | 70.6% ± 6.4 | 71.3% ± 2.8 | -0.8 ± 7.7 |
| disan.Chair 2.2.0 | 72.2% ± 3.9 | 71.6% ± 1.7 | +0.6 ± 5.3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 64.5% ± 2.1 | 67.7% ± 2.4 | -3.1 ± 1.4 |

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 373 over 4 battles (93.3 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.6 | 87 / 140 | 1.84 | 19.7% | 20356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 87 |
| stelo.Liblix 0.3.1 | 2.3 | 15.9% | 39 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 11 |
| jwirde.Gort 2.0 | 4.5 | 9.5% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.4% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.8% | 0 |
| wompi.Quokka 1.6 | 6.5 | 7.9% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 19 / 35 | 4919 |
| 2 | 1 | 70.3 | 90.2 | 24 / 35 | 5142 |
| 3 | 1 | 70.9 | 92.7 | 26 / 35 | 5286 |
| 4 | 1 | 69.1 | 89.2 | 18 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 52 | 63% |
| tzu.TheArtOfWar 1.2 | 40 | 88% |
| jwirde.Gort 2.0 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| wompi.Quokka 1.6 | 5 | 80% |
| disan.Chair 2.2.0 | 3 | 100% |

Hadur died in 57 of 140 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 27 | 47% | 64 |
| tzu.TheArtOfWar 1.2 | 13 | 23% | 43 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 14% | 11 |
| jwirde.Gort 2.0 | 3 | 5% | 14 |
| disan.Chair 2.2.0 | 1 | 2% | 3 |
| wompi.Quokka 1.6 | 1 | 2% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 108809 melee ticks, 30633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 48 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 37467 sent, 34521 reached their opponent, 7696 virtual hits (22.3% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 4 battles (115.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 55 / 140 | 2.26 | 18.4% | 19446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 55 |
| jje.BagPuss 1.2 | 2.5 | 12.4% | 10 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.8% | 60 |
| myl.nano.Graviton 1.10 | 4.3 | 10.6% | 2 |
| sul.Lunar 1.1 | 4.5 | 10.4% | 7 |
| fm.claire 1.7 | 6.5 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.2% | 1 |
| hvilela.HVilela 0.9 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 5 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 14 / 35 | 5072 |
| 2 | 1 | 68.3 | 87.6 | 15 / 35 | 4845 |
| 3 | 1 | 67.6 | 85.7 | 15 / 35 | 4794 |
| 4 | 1 | 67.0 | 85.7 | 11 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 61 | 41% |
| jje.BagPuss 1.2 | 12 | 67% |
| sul.Lunar 1.1 | 12 | 67% |
| myl.nano.Graviton 1.10 | 7 | 86% |
| fm.claire 1.7 | 4 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 89 of 140 rounds, at a mean tick of 1551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 38 | 43% | 0 |
| jje.BagPuss 1.2 | 17 | 19% | 43 |
| myl.nano.Graviton 1.10 | 9 | 10% | 31 |
| sul.Lunar 1.1 | 9 | 10% | 28 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 10 |
| fm.claire 1.7 | 3 | 3% | 13 |
| abud.ThirdRobo 1.0 | 2 | 2% | 6 |
| wit.Deep7 2.0 | 2 | 2% | 4 |
| hvilela.HVilela 0.9 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 139 rounds): 133840 melee ticks, 68269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (139 rounds): longest scan gap while four or more were alive 56 ticks (139 rounds over 8); rounds whose longest gap at any count was over 8: 139; robots dropped as dead without a death event: 0.

Targeting waves (139 rounds): 41822 sent, 38769 reached their opponent, 6242 virtual hits (16.1% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.7% ± 0.8 | 67.3% ± 2.4 | +0.3 ± 3.2 |
| Survival | 86.0% ± 1.7 | 84.2% ± 8.3 | +1.8 ± 9.7 |
| Rounds won | 39.3% ± 8.6 | 39.3% ± 10.7 | -0.0 ± 18.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 59.1% ± 3.6 | 59.0% ± 3.5 | +0.1 ± 6.3 |
| jje.BagPuss 1.2 | 59.9% ± 3.4 | 60.4% ± 5.5 | -0.6 ± 2.3 |
| sul.Lunar 1.1 | 63.9% ± 3.9 | 62.6% ± 5.4 | +1.2 ± 4.8 |
| myl.nano.Graviton 1.10 | 63.4% ± 1.1 | 63.8% ± 3.3 | -0.5 ± 3.4 |
| wit.Deep7 2.0 | 75.9% ± 2.2 | 75.8% ± 4.0 | +0.1 ± 5.7 |
| fm.claire 1.7 | 68.4% ± 2.9 | 66.1% ± 2.8 | +2.2 ± 5.2 |
| pez.mini.ChironexFleckeri 0.5 | 69.3% ± 2.5 | 69.7% ± 2.8 | -0.3 ± 5.1 |
| abud.ThirdRobo 1.0 | 79.7% ± 2.9 | 80.2% ± 6.7 | -0.5 ± 7.2 |
| hvilela.HVilela 0.9 | 69.5% ± 3.1 | 68.2% ± 3.3 | +1.3 ± 6.4 |

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 540 over 4 battles (135.0 per battle, most in one battle 216). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.2 | 55 / 140 | 2.42 | 18.2% | 19859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 55 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.7% | 60 |
| jje.BagPuss 1.2 | 3.0 | 11.9% | 9 |
| sul.Lunar 1.1 | 4.3 | 10.9% | 10 |
| myl.nano.Graviton 1.10 | 4.5 | 10.3% | 3 |
| fm.claire 1.7 | 6.0 | 9.3% | 3 |
| hvilela.HVilela 0.9 | 7.0 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 8.0 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.3 | 5.9% | 0 |
| abud.ThirdRobo 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.6 | 12 / 35 | 4883 |
| 2 | 1 | 65.9 | 78.4 | 14 / 35 | 4996 |
| 3 | 1 | 66.5 | 81.3 | 12 / 35 | 4679 |
| 4 | 1 | 69.2 | 89.5 | 17 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 57 | 42% |
| sul.Lunar 1.1 | 14 | 64% |
| myl.nano.Graviton 1.10 | 9 | 89% |
| jje.BagPuss 1.2 | 9 | 89% |
| fm.claire 1.7 | 4 | 25% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 90 of 140 rounds, at a mean tick of 1579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 35 | 39% | 0 |
| jje.BagPuss 1.2 | 12 | 13% | 40 |
| sul.Lunar 1.1 | 12 | 13% | 28 |
| fm.claire 1.7 | 9 | 10% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 8% | 14 |
| myl.nano.Graviton 1.10 | 5 | 6% | 24 |
| hvilela.HVilela 0.9 | 5 | 6% | 8 |
| wit.Deep7 2.0 | 0 | 0% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 138 rounds): 144700 melee ticks, 64229 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (138 rounds): longest scan gap while four or more were alive 32 ticks (138 rounds over 8); rounds whose longest gap at any count was over 8: 138; robots dropped as dead without a death event: 0.

Targeting waves (138 rounds): 44108 sent, 41037 reached their opponent, 6720 virtual hits (16.4% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 4 battles (107.8 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.0 | 36 / 140 | 2.71 | 15.5% | 14586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.0% | 44 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 47 |
| hadur2.Hadur 3.17.1bb | 2.8 | 15.5% | 36 |
| cx.Princess 1.0 | 4.8 | 10.3% | 7 |
| mz.MicroSheep 1.0 | 4.8 | 10.3% | 3 |
| sadoner.killer 0.2 | 5.5 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.5% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 80.3 | 8 / 35 | 3459 |
| 2 | 2 | 65.8 | 84.1 | 13 / 35 | 3716 |
| 3 | 3 | 64.6 | 79.0 | 8 / 35 | 3851 |
| 4 | 3 | 63.7 | 80.3 | 7 / 35 | 3560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 45 | 58% |
| rsalesc.melee.Medina 0.4.5 | 22 | 9% |
| cx.Princess 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 3 | 33% |
| mz.MicroSheep 1.0 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 108 of 140 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 43% | 70 |
| rsalesc.melee.Medina 0.4.5 | 40 | 37% | 45 |
| arthord.NanoSatanMelee Beta | 7 | 6% | 8 |
| cx.Princess 1.0 | 4 | 4% | 6 |
| mz.MicroSheep 1.0 | 4 | 4% | 4 |
| jeremyreeder.collective.Prophet 5 | 2 | 2% | 3 |
| sadoner.killer 0.2 | 1 | 1% | 3 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 100907 melee ticks, 25940 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 38 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 30079 sent, 27134 reached their opponent, 4468 virtual hits (16.5% of those reached).

## Paired A/B: hadur2.Hadur 3.17.1bb vs hadur2.Hadur 3.17.1aa

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 4 of 4, baseline 4 of 4, 4 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.4% ± 1.6 | 63.6% ± 1.7 | +0.8 ± 3.1 |
| Survival | 81.0% ± 3.5 | 79.3% ± 5.4 | +1.7 ± 7.3 |
| Rounds won | 25.7% ± 12.3 | 17.9% ± 15.0 | +7.9 ± 21.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jeremyreeder.collective.Prophet 5 | 72.8% ± 4.8 | 71.6% ± 3.7 | +1.3 ± 7.9 |
| cx.Princess 1.0 | 60.2% ± 2.5 | 60.3% ± 3.8 | -0.1 ± 2.4 |
| mz.MicroSheep 1.0 | 60.1% ± 2.5 | 59.2% ± 1.2 | +0.9 ± 2.7 |
| kc.mini.Mirage 0.2 | 47.7% ± 1.8 | 45.8% ± 3.9 | +1.9 ± 4.5 |
| sadoner.killer 0.2 | 63.1% ± 3.6 | 61.8% ± 5.0 | +1.3 ± 7.6 |
| mbro.Detektor3 0.1.1 | 83.2% ± 1.0 | 83.8% ± 2.2 | -0.5 ± 3.2 |
| kurios.DOSexe .9a | 77.1% ± 3.1 | 76.3% ± 1.4 | +0.8 ± 2.9 |
| rsalesc.melee.Medina 0.4.5 | 47.9% ± 3.1 | 46.2% ± 2.5 | +1.7 ± 3.2 |
| arthord.NanoSatanMelee Beta | 67.6% ± 5.0 | 67.8% ± 2.4 | -0.2 ± 5.5 |

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

Skipped turns: 387 over 4 battles (96.8 per battle, most in one battle 105). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.3 | 25 / 140 | 2.86 | 14.9% | 14246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.4% | 58 |
| kc.mini.Mirage 0.2 | 1.5 | 17.7% | 47 |
| hadur2.Hadur 3.17.1aa | 3.0 | 14.9% | 25 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 1 |
| cx.Princess 1.0 | 5.0 | 9.9% | 7 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.0 | 81.9 | 7 / 35 | 3619 |
| 2 | 3 | 63.0 | 76.5 | 6 / 35 | 3615 |
| 3 | 3 | 62.5 | 76.2 | 2 / 35 | 3423 |
| 4 | 3 | 65.0 | 82.5 | 10 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 39 | 51% |
| rsalesc.melee.Medina 0.4.5 | 20 | 10% |
| cx.Princess 1.0 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| mz.MicroSheep 1.0 | 1 | 100% |

Hadur died in 119 of 140 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 52 | 44% | 70 |
| rsalesc.melee.Medina 0.4.5 | 34 | 29% | 36 |
| cx.Princess 1.0 | 8 | 7% | 10 |
| mz.MicroSheep 1.0 | 7 | 6% | 9 |
| sadoner.killer 0.2 | 6 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| arthord.NanoSatanMelee Beta | 2 | 2% | 2 |
| jeremyreeder.collective.Prophet 5 | 2 | 2% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 140 rounds): 102092 melee ticks, 24659 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (140 rounds): longest scan gap while four or more were alive 31 ticks (140 rounds over 8); rounds whose longest gap at any count was over 8: 140; robots dropped as dead without a death event: 0.

Targeting waves (140 rounds): 31129 sent, 27904 reached their opponent, 4486 virtual hits (16.1% of those reached).

