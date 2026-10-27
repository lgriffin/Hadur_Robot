# Team bench

hadur2.HadurTeam 3.17.1mk against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 32 battles (8.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 | 58.7% | 97/160 | 60.6% | 0 | 133 | 0 | 165/36216 | 0/3277 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.3% | 154/160 | 96.3% | 0 | 131 | 0 | 376/39311 | 0/4219 | 0 |
| **All** | 32 | 69.5% | 251/320 | 78.4% | 0 | 264 | 0 | 541/75527 | 0/7496 | 0 |

Members' team records (sums): teammate hits 1385, teammate bullet hits 9203, teammate collisions 10, shots held for the fire lane 9921, reports merged 3647406, drives fenced 4376.
Engine's count of our bullets that hit one of our own members: 1774.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| florent.XSeries.Xmen 0.9 | 160 | 31.5% |
| gh.nano.GrofGroup 1.1 | 160 | 30.4% |
| **All** | 320 | 31.0% |

Data files written (any battle): hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.17.1mk vs hadur2.HadurTeam 3.17.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 58.7% ± 3.0 | 59.9% ± 2.5 | -1.2 ± 4.3 |
| gh.nano.GrofGroup 1.1 | 80.3% ± 1.5 | 80.9% ± 2.4 | -0.6 ± 2.8 |
| **All** | 69.5% ± 4.3 | 70.4% ± 4.2 | -0.9 ± 2.4 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 78.4% ± 7.8 | 78.1% ± 7.0 | +0.3 ± 6.0 |
| Survival | 78.4% ± 7.8 | 78.1% ± 7.0 | +0.3 ± 6.0 |
| In-lane shots | 0.7% ± 0.1 | 0.7% ± 0.1 | -0.0 ± 0.1 |
| Focus fire | 31.0% ± 0.5 | 30.6% ± 0.5 | +0.4 ± 0.7 |
| Bullets on own members | 55.44 ± 4.34 | 64.78 ± 5.70 | -9.3 ± 4.4 |

## Team bench

hadur2.HadurTeam 3.17.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 254 over 32 battles (7.9 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 | 59.9% | 101/160 | 63.1% | 0 | 136 | 0 | 175/37855 | 0/3338 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.9% | 149/160 | 93.1% | 0 | 118 | 0 | 389/38878 | 0/4244 | 0 |
| **All** | 32 | 70.4% | 250/320 | 78.1% | 0 | 254 | 0 | 564/76733 | 0/7582 | 0 |

Members' team records (sums): teammate hits 1712, teammate bullet hits 9517, teammate collisions 23, shots held for the fire lane 5079, reports merged 3672639, drives fenced 5336.
Engine's count of our bullets that hit one of our own members: 2073.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| florent.XSeries.Xmen 0.9 | 160 | 30.9% |
| gh.nano.GrofGroup 1.1 | 160 | 30.3% |
| **All** | 320 | 30.6% |

Data files written (any battle): hadur2\Hadur.data\health.hc
