# Team bench

hadur117.HadurTeam 3.23fit against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=3387107. Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v470, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 85 over 18 battles (4.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 18 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 86.8% | 30/30 | 100.0% | 0 | 24 | 0 | 15/6588 | 0/863 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 90.2% | 30/30 | 100.0% | 0 | 16 | 0 | 123/6218 | 0/888 | 0 |
| radnor.RadnorMedSchool 1.0 | 3 | 93.2% | 30/30 | 100.0% | 0 | 12 | 0 | 100/5342 | 0/893 | 0 |
| rz.HOFSwarm 1.1 | 3 | 88.5% | 30/30 | 100.0% | 0 | 14 | 0 | 14/6923 | 0/880 | 0 |
| tmnr.TMNR 1.01 | 3 | 88.2% | 30/30 | 100.0% | 0 | 14 | 0 | 34/6247 | 0/876 | 0 |
| ags.polylunar.Polylunar 1.6 | 3 | 62.1% | 27/30 | 90.0% | 0 | 5 | 0 | 181/3206 | 0/620 | 0 |
| **All** | 18 | 84.8% | 177/180 | 98.3% | 0 | 85 | 0 | 467/34524 | 0/5020 | 0 |

Members' team records (sums): teammate hits 506, teammate bullet hits 4604, teammate collisions 0, shots held for the fire lane 3397, reports merged 1984143, drives fenced 12.
Engine's count of our bullets that hit one of our own members: 646.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 31.9% |
| gh.nano.GrofGroup 1.1 | 30 | 32.5% |
| radnor.RadnorMedSchool 1.0 | 30 | 34.1% |
| rz.HOFSwarm 1.1 | 30 | 35.1% |
| tmnr.TMNR 1.01 | 30 | 33.6% |
| ags.polylunar.Polylunar 1.6 | 30 | 32.3% |
| **All** | 180 | 33.2% |

Data files written (any battle): hadur117/Hadur.data/health.hc

## Paired A/B: hadur117.HadurTeam 3.23fit vs hadur117.HadurTeam 3.23aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 86.8% ± 10.7 | 83.7% ± 7.3 | +3.0 ± 12.9 |
| gh.nano.GrofGroup 1.1 | 90.2% ± 1.6 | 86.9% ± 1.9 | +3.3 ± 3.1 |
| radnor.RadnorMedSchool 1.0 | 93.2% ± 3.1 | 92.8% ± 3.1 | +0.4 ± 5.9 |
| rz.HOFSwarm 1.1 | 88.5% ± 3.5 | 83.0% ± 14.1 | +5.5 ± 11.5 |
| tmnr.TMNR 1.01 | 88.2% ± 3.0 | 86.0% ± 2.6 | +2.2 ± 5.5 |
| ags.polylunar.Polylunar 1.6 | 62.1% ± 10.0 | 60.9% ± 9.8 | +1.2 ± 19.3 |
| **All** | 84.8% ± 5.4 | 82.2% ± 5.3 | +2.6 ± 2.1 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 3 of 3 | 3 of 3 | 3 |
| gh.nano.GrofGroup 1.1 | 3 of 3 | 3 of 3 | 3 |
| radnor.RadnorMedSchool 1.0 | 3 of 3 | 3 of 3 | 3 |
| rz.HOFSwarm 1.1 | 3 of 3 | 3 of 3 | 3 |
| tmnr.TMNR 1.01 | 3 of 3 | 3 of 3 | 3 |
| ags.polylunar.Polylunar 1.6 | 3 of 3 | 3 of 3 | 3 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 98.3% ± 2.6 | 95.6% ± 4.3 | +2.8 ± 4.4 |
| Survival | 98.3% ± 2.6 | 95.6% ± 4.3 | +2.8 ± 4.4 |
| In-lane shots | 1.7% ± 1.0 | 1.6% ± 0.9 | +0.2 ± 0.2 |
| Focus fire | 33.2% ± 0.9 | 33.7% ± 0.9 | -0.5 ± 1.3 |
| Bullets on own members | 35.89 ± 4.79 | 35.44 ± 3.23 | +0.4 ± 4.9 |

## Team bench

hadur117.HadurTeam 3.23aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 74 over 18 battles (4.1 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 18 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 83.7% | 29/30 | 96.7% | 0 | 14 | 0 | 18/6997 | 0/840 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 86.9% | 30/30 | 100.0% | 0 | 11 | 0 | 118/6527 | 0/863 | 0 |
| radnor.RadnorMedSchool 1.0 | 3 | 92.8% | 30/30 | 100.0% | 0 | 11 | 0 | 104/5480 | 0/893 | 0 |
| rz.HOFSwarm 1.1 | 3 | 83.0% | 27/30 | 90.0% | 0 | 17 | 0 | 15/7137 | 0/837 | 0 |
| tmnr.TMNR 1.01 | 3 | 86.0% | 30/30 | 100.0% | 0 | 10 | 0 | 24/6470 | 0/864 | 0 |
| ags.polylunar.Polylunar 1.6 | 3 | 60.9% | 26/30 | 86.7% | 0 | 11 | 0 | 156/3115 | 0/617 | 0 |
| **All** | 18 | 82.2% | 172/180 | 95.6% | 0 | 74 | 0 | 435/35726 | 0/4914 | 0 |

Members' team records (sums): teammate hits 512, teammate bullet hits 4618, teammate collisions 0, shots held for the fire lane 3533, reports merged 2008864, drives fenced 39.
Engine's count of our bullets that hit one of our own members: 638.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 34.2% |
| gh.nano.GrofGroup 1.1 | 30 | 33.0% |
| radnor.RadnorMedSchool 1.0 | 30 | 33.8% |
| rz.HOFSwarm 1.1 | 30 | 33.7% |
| tmnr.TMNR 1.01 | 30 | 34.0% |
| ags.polylunar.Polylunar 1.6 | 30 | 33.5% |
| **All** | 180 | 33.7% |

Data files written (any battle): hadur117/Hadur.data/health.hc
