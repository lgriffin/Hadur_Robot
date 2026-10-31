# Team bench

hadur117.HadurTeam 3.20bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 730 over 80 battles (9.1 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 80 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 55.0% | 71/160 | 44.4% | 0 | 180 | 0 | 92/39550 | 0/3089 | 0 |
| rz.GlowingHawks 0.2 | 16 | 78.8% | 141/160 | 88.1% | 0 | 137 | 0 | 91/43935 | 0/4183 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 78.1% | 149/160 | 93.1% | 0 | 150 | 0 | 56/41993 | 0/4171 | 0 |
| rz.HOFSwarm 1.1 | 16 | 75.6% | 141/160 | 88.1% | 0 | 167 | 0 | 91/41350 | 0/4041 | 0 |
| amz.TeamDeathTeam 1 | 16 | 82.2% | 160/160 | 100.0% | 0 | 96 | 0 | 819/16432 | 0/4420 | 0 |
| **All** | 80 | 73.9% | 662/800 | 82.8% | 0 | 730 | 0 | 1149/183260 | 0/19904 | 0 |

Members' team records (sums): teammate hits 3573, teammate bullet hits 17794, teammate collisions 160, shots held for the fire lane 14547, reports merged 9025229, drives fenced 15487.
Engine's count of our bullets that hit one of our own members: 4849.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 30.5% |
| rz.GlowingHawks 0.2 | 160 | 32.2% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 30.9% |
| rz.HOFSwarm 1.1 | 160 | 32.5% |
| amz.TeamDeathTeam 1 | 160 | 35.7% |
| **All** | 800 | 32.4% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.20bb vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 55.0% ± 2.5 | 54.7% ± 3.2 | +0.2 ± 3.6 |
| rz.GlowingHawks 0.2 | 78.8% ± 1.6 | 76.3% ± 3.2 | +2.5 ± 3.4 |
| kawigi.micro.ArmyOfShiz 1.1 | 78.1% ± 1.9 | 77.2% ± 2.7 | +0.9 ± 3.0 |
| rz.HOFSwarm 1.1 | 75.6% ± 3.1 | 73.9% ± 2.9 | +1.6 ± 4.8 |
| amz.TeamDeathTeam 1 | 82.2% ± 1.0 | 80.9% ± 1.3 | +1.3 ± 1.1 |
| **All** | 73.9% ± 2.3 | 72.6% ± 2.4 | +1.3 ± 1.4 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 of 16 | 16 of 16 | 16 |
| rz.GlowingHawks 0.2 | 16 of 16 | 16 of 16 | 16 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| amz.TeamDeathTeam 1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 82.7% ± 4.9 | 80.4% ± 5.1 | +2.4 ± 3.1 |
| Survival | 82.7% ± 4.9 | 80.4% ± 5.1 | +2.4 ± 3.1 |
| In-lane shots | 1.2% ± 0.4 | 1.2% ± 0.4 | -0.0 ± 0.1 |
| Focus fire | 32.4% ± 0.5 | 32.0% ± 0.5 | +0.3 ± 0.5 |
| Bullets on own members | 60.61 ± 3.70 | 60.86 ± 3.59 | -0.3 ± 4.8 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 760 over 80 battles (9.5 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 80 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 54.7% | 68/160 | 42.5% | 0 | 188 | 0 | 79/40061 | 0/3094 | 0 |
| rz.GlowingHawks 0.2 | 16 | 76.3% | 133/160 | 83.1% | 0 | 173 | 0 | 99/44892 | 0/4069 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 77.2% | 148/160 | 92.5% | 0 | 145 | 0 | 61/41887 | 0/4117 | 0 |
| rz.HOFSwarm 1.1 | 16 | 73.9% | 134/160 | 83.8% | 0 | 158 | 0 | 91/41894 | 0/3964 | 0 |
| amz.TeamDeathTeam 1 | 16 | 80.9% | 160/160 | 100.0% | 0 | 96 | 0 | 832/16267 | 0/4360 | 0 |
| **All** | 80 | 72.6% | 643/800 | 80.4% | 0 | 760 | 0 | 1162/185001 | 0/19604 | 0 |

Members' team records (sums): teammate hits 3623, teammate bullet hits 18358, teammate collisions 171, shots held for the fire lane 14584, reports merged 9123352, drives fenced 14214.
Engine's count of our bullets that hit one of our own members: 4869.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.0% |
| rz.GlowingHawks 0.2 | 160 | 31.7% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 30.7% |
| rz.HOFSwarm 1.1 | 160 | 32.0% |
| amz.TeamDeathTeam 1 | 160 | 34.8% |
| **All** | 800 | 32.0% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
