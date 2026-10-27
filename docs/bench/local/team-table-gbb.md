# Team bench

hadur2.HadurTeam 3.17.1bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 32 battles (8.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 | 59.0% | 102/160 | 63.7% | 0 | 147 | 0 | 152/36832 | 0/3286 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.3% | 149/160 | 93.1% | 0 | 125 | 0 | 427/38792 | 0/4225 | 0 |
| **All** | 32 | 69.7% | 251/320 | 78.4% | 0 | 272 | 0 | 579/75624 | 0/7511 | 0 |

Members' team records (sums): teammate hits 1760, teammate bullet hits 9061, teammate collisions 44, shots held for the fire lane 5083, reports merged 3627902, drives fenced 4466.
Engine's count of our bullets that hit one of our own members: 2175.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| florent.XSeries.Xmen 0.9 | 160 | 30.8% |
| gh.nano.GrofGroup 1.1 | 160 | 30.5% |
| **All** | 320 | 30.6% |

Data files written (any battle): hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.17.1bb vs hadur2.HadurTeam 3.17.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 59.0% ± 3.7 | 56.4% ± 3.2 | +2.6 ± 4.1 |
| gh.nano.GrofGroup 1.1 | 80.3% ± 1.8 | 80.1% ± 2.5 | +0.2 ± 3.5 |
| **All** | 69.7% ± 4.4 | 68.3% ± 4.7 | +1.4 ± 2.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 78.4% ± 7.2 | 72.2% ± 9.3 | +6.3 ± 6.4 |
| Survival | 78.4% ± 7.2 | 72.2% ± 9.3 | +6.3 ± 6.4 |
| In-lane shots | 0.8% ± 0.1 | 0.7% ± 0.1 | +0.1 ± 0.1 |
| Focus fire | 30.6% ± 0.6 | 31.1% ± 0.7 | -0.5 ± 0.9 |
| Bullets on own members | 67.97 ± 4.92 | 63.19 ± 7.07 | +4.8 ± 5.8 |

## Team bench

hadur2.HadurTeam 3.17.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 257 over 32 battles (8.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.XSeries.Xmen 0.9 | 16 | 56.4% | 82/160 | 51.2% | 0 | 135 | 0 | 148/36362 | 0/3203 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.1% | 149/160 | 93.1% | 0 | 122 | 0 | 357/39083 | 0/4222 | 0 |
| **All** | 32 | 68.3% | 231/320 | 72.2% | 0 | 257 | 0 | 505/75445 | 0/7425 | 0 |

Members' team records (sums): teammate hits 1652, teammate bullet hits 9022, teammate collisions 14, shots held for the fire lane 4895, reports merged 3609227, drives fenced 5097.
Engine's count of our bullets that hit one of our own members: 2022.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| florent.XSeries.Xmen 0.9 | 160 | 30.8% |
| gh.nano.GrofGroup 1.1 | 160 | 31.4% |
| **All** | 320 | 31.1% |

Data files written (any battle): hadur2\Hadur.data\health.hc
