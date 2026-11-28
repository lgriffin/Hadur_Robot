# Team bench

hadur117.HadurTeam 3.25.1p6 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1400 over 48 battles (29.2 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 45.4% | 114/576 | 19.8% | 0 | 1400 | 0 | 583/119012 | 0/9625 | 0 |
| **All** | 48 | 45.4% | 114/576 | 19.8% | 0 | 1400 | 0 | 583/119012 | 0/9625 | 0 |

Members' team records (sums): teammate hits 864, teammate bullet hits 11279, teammate collisions 0, shots held for the fire lane 11408, reports merged 6422774, drives fenced 160.
Engine's count of our bullets that hit one of our own members: 1065.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 576 | 34.2% |
| **All** | 576 | 34.2% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.25.1p6 vs hadur117.HadurTeam 3.25.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 45.4% ± 1.8 | 43.9% ± 1.6 | +1.5 ± 2.7 |
| **All** | 45.4% ± 1.8 | 43.9% ± 1.6 | +1.5 ± 2.7 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 19.8% ± 3.3 | 11.5% ± 2.7 | +8.3 ± 4.2 |
| Survival | 19.8% ± 3.3 | 11.5% ± 2.7 | +8.3 ± 4.2 |
| In-lane shots | 0.5% ± 0.0 | 0.4% ± 0.0 | +0.1 ± 0.1 |
| Focus fire | 34.2% ± 0.8 | 33.6% ± 0.6 | +0.6 ± 1.0 |
| Bullets on own members | 22.19 ± 1.45 | 24.31 ± 1.88 | -2.1 ± 2.4 |

## Team bench

hadur117.HadurTeam 3.25.1aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1648 over 48 battles (34.3 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 43.9% | 66/576 | 11.5% | 0 | 1648 | 0 | 479/129179 | 0/9455 | 0 |
| **All** | 48 | 43.9% | 66/576 | 11.5% | 0 | 1648 | 0 | 479/129179 | 0/9455 | 0 |

Members' team records (sums): teammate hits 954, teammate bullet hits 12756, teammate collisions 0, shots held for the fire lane 11504, reports merged 6805427, drives fenced 151.
Engine's count of our bullets that hit one of our own members: 1167.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 576 | 33.6% |
| **All** | 576 | 33.6% |

Data files written (any battle): hadur117\Hadur.data\health.hc
