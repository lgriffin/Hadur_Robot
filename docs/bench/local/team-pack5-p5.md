# Team bench

hadur117.HadurTeam 3.24p5 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1215 over 48 battles (25.3 per battle, most in one battle 75). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 | 60.5% | 233/576 | 40.5% | 0 | 1215 | 0 | 272/125013 | 0/12424 | 0 |
| **All** | 48 | 60.5% | 233/576 | 40.5% | 0 | 1215 | 0 | 272/125013 | 0/12424 | 0 |

Members' team records (sums): teammate hits 803, teammate bullet hits 12925, teammate collisions 6, shots held for the fire lane 7524, reports merged 6636867, drives fenced 139.
Engine's count of our bullets that hit one of our own members: 1112.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 576 | 32.9% |
| **All** | 576 | 32.9% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p5 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 60.5% ± 1.6 | 54.5% ± 1.5 | +6.0 ± 2.1 |
| **All** | 60.5% ± 1.6 | 54.5% ± 1.5 | +6.0 ± 2.1 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 40.5% ± 4.2 | 26.0% ± 2.8 | +14.4 ± 4.6 |
| Survival | 40.5% ± 4.2 | 26.0% ± 2.8 | +14.4 ± 4.6 |
| In-lane shots | 0.2% ± 0.0 | 0.1% ± 0.0 | +0.1 ± 0.0 |
| Focus fire | 32.9% ± 0.6 | 32.0% ± 0.5 | +0.9 ± 0.7 |
| Bullets on own members | 23.17 ± 1.87 | 29.63 ± 1.91 | -6.5 ± 2.7 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1263 over 48 battles (26.3 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 | 54.5% | 150/576 | 26.0% | 0 | 1263 | 0 | 189/151011 | 0/11324 | 0 |
| **All** | 48 | 54.5% | 150/576 | 26.0% | 0 | 1263 | 0 | 189/151011 | 0/11324 | 0 |

Members' team records (sums): teammate hits 1159, teammate bullet hits 15624, teammate collisions 0, shots held for the fire lane 10833, reports merged 7639413, drives fenced 40.
Engine's count of our bullets that hit one of our own members: 1422.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 576 | 32.0% |
| **All** | 576 | 32.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc
