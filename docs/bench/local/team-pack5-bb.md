# Team bench

hadur117.HadurTeam 3.24bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1349 over 48 battles (28.1 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 | 53.9% | 131/576 | 22.7% | 0 | 1349 | 0 | 174/151158 | 0/11259 | 0 |
| **All** | 48 | 53.9% | 131/576 | 22.7% | 0 | 1349 | 0 | 174/151158 | 0/11259 | 0 |

Members' team records (sums): teammate hits 1043, teammate bullet hits 14978, teammate collisions 0, shots held for the fire lane 10635, reports merged 7453953, drives fenced 14.
Engine's count of our bullets that hit one of our own members: 1285.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 576 | 31.7% |
| **All** | 576 | 31.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24bb vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 53.9% ± 1.6 | 54.8% ± 1.8 | -0.9 ± 2.7 |
| **All** | 53.9% ± 1.6 | 54.8% ± 1.8 | -0.9 ± 2.7 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 22.7% ± 3.3 | 28.0% ± 3.8 | -5.2 ± 5.4 |
| Survival | 22.7% ± 3.3 | 28.0% ± 3.8 | -5.2 ± 5.4 |
| In-lane shots | 0.1% ± 0.0 | 0.2% ± 0.0 | -0.0 ± 0.0 |
| Focus fire | 31.7% ± 0.5 | 32.1% ± 0.6 | -0.4 ± 0.8 |
| Bullets on own members | 26.77 ± 1.94 | 25.73 ± 1.52 | +1.0 ± 2.5 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1285 over 48 battles (26.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 48 | 54.8% | 161/576 | 28.0% | 0 | 1285 | 0 | 230/148968 | 0/11375 | 0 |
| **All** | 48 | 54.8% | 161/576 | 28.0% | 0 | 1285 | 0 | 230/148968 | 0/11375 | 0 |

Members' team records (sums): teammate hits 988, teammate bullet hits 15157, teammate collisions 0, shots held for the fire lane 10567, reports merged 7454975, drives fenced 54.
Engine's count of our bullets that hit one of our own members: 1235.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 576 | 32.1% |
| **All** | 576 | 32.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
