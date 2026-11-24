# Team bench

hadur117.HadurTeam 3.24p4 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 498 over 32 battles (15.6 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 8 | 56.6% | 81/96 | 84.4% | 0 | 224 | 0 | 291/12698 | 0/1781 | 0 |
| ags.polylunar.Polylunar 1.6 | 8 | 64.4% | 93/96 | 96.9% | 0 | 103 | 0 | 566/9758 | 0/2033 | 0 |
| amz.TeamDeathTeam 1 | 8 | 85.5% | 96/96 | 100.0% | 0 | 123 | 0 | 425/6671 | 0/2716 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 8 | 80.7% | 96/96 | 100.0% | 0 | 48 | 0 | 469/8423 | 0/2606 | 0 |
| **All** | 32 | 71.8% | 366/384 | 95.3% | 0 | 498 | 0 | 1751/37550 | 0/9136 | 0 |

Members' team records (sums): teammate hits 634, teammate bullet hits 1790, teammate collisions 10, shots held for the fire lane 5240, reports merged 1997997, drives fenced 422.
Engine's count of our bullets that hit one of our own members: 841.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 96 | 33.2% |
| ags.polylunar.Polylunar 1.6 | 96 | 33.1% |
| amz.TeamDeathTeam 1 | 96 | 35.4% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 96 | 34.7% |
| **All** | 384 | 34.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p4 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 56.6% ± 2.8 | 57.7% ± 2.6 | -1.1 ± 5.1 |
| ags.polylunar.Polylunar 1.6 | 64.4% ± 3.1 | 63.9% ± 3.2 | +0.5 ± 4.5 |
| amz.TeamDeathTeam 1 | 85.5% ± 1.1 | 83.9% ± 1.7 | +1.5 ± 1.5 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 80.7% ± 1.4 | 80.7% ± 1.2 | -0.0 ± 2.3 |
| **All** | 71.8% ± 4.4 | 71.6% ± 4.2 | +0.3 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 8 of 8 | 8 of 8 | 8 |
| ags.polylunar.Polylunar 1.6 | 8 of 8 | 8 of 8 | 8 |
| amz.TeamDeathTeam 1 | 8 of 8 | 8 of 8 | 8 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 8 of 8 | 8 of 8 | 8 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 95.3% ± 2.8 | 94.5% ± 2.8 | +0.8 ± 2.8 |
| Survival | 95.3% ± 2.8 | 94.5% ± 2.8 | +0.8 ± 2.8 |
| In-lane shots | 5.0% ± 0.7 | 5.6% ± 0.8 | -0.5 ± 0.5 |
| Focus fire | 34.1% ± 0.7 | 33.9% ± 0.6 | +0.2 ± 0.6 |
| Bullets on own members | 26.28 ± 2.58 | 27.88 ± 2.90 | -1.6 ± 2.5 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 467 over 32 battles (14.6 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 8 | 57.7% | 83/96 | 86.5% | 0 | 206 | 0 | 308/12387 | 0/1815 | 0 |
| ags.polylunar.Polylunar 1.6 | 8 | 63.9% | 89/96 | 92.7% | 0 | 81 | 0 | 562/9707 | 0/2047 | 0 |
| amz.TeamDeathTeam 1 | 8 | 83.9% | 96/96 | 100.0% | 0 | 138 | 0 | 526/6855 | 0/2723 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 8 | 80.7% | 95/96 | 99.0% | 0 | 42 | 0 | 518/8336 | 0/2648 | 0 |
| **All** | 32 | 71.6% | 363/384 | 94.5% | 0 | 467 | 0 | 1914/37285 | 0/9233 | 0 |

Members' team records (sums): teammate hits 571, teammate bullet hits 1884, teammate collisions 0, shots held for the fire lane 5150, reports merged 2024951, drives fenced 333.
Engine's count of our bullets that hit one of our own members: 892.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 96 | 33.0% |
| ags.polylunar.Polylunar 1.6 | 96 | 33.2% |
| amz.TeamDeathTeam 1 | 96 | 34.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 96 | 34.9% |
| **All** | 384 | 33.9% |

Data files written (any battle): hadur117\Hadur.data\health.hc
