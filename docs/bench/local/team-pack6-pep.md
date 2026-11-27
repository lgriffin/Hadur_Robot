# Team bench

hadur117.HadurTeam 3.25.1p6 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 346 over 12 battles (28.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 43.7% | 24/144 | 16.7% | 0 | 346 | 0 | 121/28826 | 0/2335 | 0 |
| **All** | 12 | 43.7% | 24/144 | 16.7% | 0 | 346 | 0 | 121/28826 | 0/2335 | 0 |

Members' team records (sums): teammate hits 200, teammate bullet hits 2786, teammate collisions 0, shots held for the fire lane 2782, reports merged 1571161, drives fenced 26.
Engine's count of our bullets that hit one of our own members: 248.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 144 | 34.3% |
| **All** | 144 | 34.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.25.1p6 vs hadur117.HadurTeam 3.25.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 43.7% ± 2.9 | 45.6% ± 3.9 | -1.8 ± 2.8 |
| **All** | 43.7% ± 2.9 | 45.6% ± 3.9 | -1.8 ± 2.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 of 12 | 12 of 12 | 12 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 16.7% ± 6.4 | 16.0% ± 7.3 | +0.7 ± 6.6 |
| Survival | 16.7% ± 6.4 | 16.0% ± 7.3 | +0.7 ± 6.6 |
| In-lane shots | 0.4% ± 0.1 | 0.4% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 34.3% ± 1.1 | 33.3% ± 1.4 | +1.0 ± 2.0 |
| Bullets on own members | 20.67 ± 4.13 | 25.83 ± 3.81 | -5.2 ± 6.4 |

## Team bench

hadur117.HadurTeam 3.25.1aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 376 over 12 battles (31.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 45.6% | 23/144 | 16.0% | 0 | 376 | 0 | 128/32305 | 0/2419 | 0 |
| **All** | 12 | 45.6% | 23/144 | 16.0% | 0 | 376 | 0 | 128/32305 | 0/2419 | 0 |

Members' team records (sums): teammate hits 254, teammate bullet hits 3297, teammate collisions 0, shots held for the fire lane 2885, reports merged 1705704, drives fenced 30.
Engine's count of our bullets that hit one of our own members: 310.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 144 | 33.3% |
| **All** | 144 | 33.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc
