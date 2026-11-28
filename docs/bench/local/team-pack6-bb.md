# Team bench

hadur117.HadurTeam 3.25.1bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1504 over 48 battles (31.3 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 45.4% | 76/576 | 13.2% | 0 | 1504 | 0 | 540/133159 | 0/9717 | 0 |
| **All** | 48 | 45.4% | 76/576 | 13.2% | 0 | 1504 | 0 | 540/133159 | 0/9717 | 0 |

Members' team records (sums): teammate hits 1010, teammate bullet hits 13998, teammate collisions 0, shots held for the fire lane 11818, reports merged 6987533, drives fenced 128.
Engine's count of our bullets that hit one of our own members: 1224.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 576 | 33.1% |
| **All** | 576 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.25.1bb vs hadur117.HadurTeam 3.25.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 45.4% ± 2.1 | 44.0% ± 1.8 | +1.4 ± 2.6 |
| **All** | 45.4% ± 2.1 | 44.0% ± 1.8 | +1.4 ± 2.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 13.2% ± 3.3 | 12.8% ± 2.7 | +0.3 ± 3.9 |
| Survival | 13.2% ± 3.3 | 12.8% ± 2.7 | +0.3 ± 3.9 |
| In-lane shots | 0.4% ± 0.0 | 0.4% ± 0.0 | +0.0 ± 0.1 |
| Focus fire | 33.1% ± 0.7 | 33.7% ± 0.5 | -0.6 ± 0.7 |
| Bullets on own members | 25.50 ± 1.82 | 23.04 ± 1.69 | +2.5 ± 2.3 |

## Team bench

hadur117.HadurTeam 3.25.1aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1542 over 48 battles (32.1 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 44.0% | 74/576 | 12.8% | 0 | 1542 | 0 | 486/130790 | 0/9432 | 0 |
| **All** | 48 | 44.0% | 74/576 | 12.8% | 0 | 1542 | 0 | 486/130790 | 0/9432 | 0 |

Members' team records (sums): teammate hits 914, teammate bullet hits 13390, teammate collisions 0, shots held for the fire lane 11336, reports merged 6845210, drives fenced 99.
Engine's count of our bullets that hit one of our own members: 1106.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 576 | 33.7% |
| **All** | 576 | 33.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc
