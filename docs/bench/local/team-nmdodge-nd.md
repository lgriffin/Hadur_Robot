# Team bench

hadur117.HadurTeam 3.24nd against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1205 over 48 battles (25.1 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 | 57.6% | 496/576 | 86.1% | 0 | 1205 | 0 | 1691/73921 | 0/10855 | 0 |
| **All** | 48 | 57.6% | 496/576 | 86.1% | 0 | 1205 | 0 | 1691/73921 | 0/10855 | 0 |

Members' team records (sums): teammate hits 696, teammate bullet hits 3901, teammate collisions 10, shots held for the fire lane 7520, reports merged 3258916, drives fenced 874.
Engine's count of our bullets that hit one of our own members: 866.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 576 | 33.0% |
| **All** | 576 | 33.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24nd vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 57.6% ± 1.2 | 54.5% ± 1.4 | +3.1 ± 1.9 |
| **All** | 57.6% ± 1.2 | 54.5% ± 1.4 | +3.1 ± 1.9 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 86.1% ± 2.7 | 76.7% ± 3.3 | +9.4 ± 4.6 |
| Survival | 86.1% ± 2.7 | 76.7% ± 3.3 | +9.4 ± 4.6 |
| In-lane shots | 2.3% ± 0.1 | 1.9% ± 0.1 | +0.4 ± 0.2 |
| Focus fire | 33.0% ± 0.4 | 33.3% ± 0.4 | -0.3 ± 0.6 |
| Bullets on own members | 18.04 ± 1.43 | 19.29 ± 1.06 | -1.3 ± 1.8 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 382 over 48 battles (8.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 | 54.5% | 442/576 | 76.7% | 0 | 382 | 0 | 1495/78832 | 0/10396 | 0 |
| **All** | 48 | 54.5% | 442/576 | 76.7% | 0 | 382 | 0 | 1495/78832 | 0/10396 | 0 |

Members' team records (sums): teammate hits 729, teammate bullet hits 4209, teammate collisions 28, shots held for the fire lane 7078, reports merged 3343278, drives fenced 775.
Engine's count of our bullets that hit one of our own members: 926.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 576 | 33.3% |
| **All** | 576 | 33.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc
