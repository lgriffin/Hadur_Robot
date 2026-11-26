# Team bench

hadur117.HadurTeam 3.24p5 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 262 over 12 battles (21.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 12 | 59.3% | 57/144 | 39.6% | 0 | 262 | 0 | 67/32138 | 0/3051 | 0 |
| **All** | 12 | 59.3% | 57/144 | 39.6% | 0 | 262 | 0 | 67/32138 | 0/3051 | 0 |

Members' team records (sums): teammate hits 232, teammate bullet hits 3463, teammate collisions 0, shots held for the fire lane 2026, reports merged 1695258, drives fenced 44.
Engine's count of our bullets that hit one of our own members: 316.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 144 | 32.5% |
| **All** | 144 | 32.5% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p5 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 59.3% ± 3.2 | 56.6% ± 2.5 | +2.7 ± 4.6 |
| **All** | 59.3% ± 3.2 | 56.6% ± 2.5 | +2.7 ± 4.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 12 of 12 | 12 of 12 | 12 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 39.6% ± 7.9 | 31.3% ± 7.2 | +8.3 ± 8.1 |
| Survival | 39.6% ± 7.9 | 31.3% ± 7.2 | +8.3 ± 8.1 |
| In-lane shots | 0.2% ± 0.1 | 0.1% ± 0.0 | +0.1 ± 0.1 |
| Focus fire | 32.5% ± 1.6 | 31.8% ± 1.1 | +0.7 ± 2.5 |
| Bullets on own members | 26.33 ± 4.94 | 27.25 ± 4.90 | -0.9 ± 5.5 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 260 over 12 battles (21.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 12 | 56.6% | 45/144 | 31.3% | 0 | 260 | 0 | 51/37887 | 0/2923 | 0 |
| **All** | 12 | 56.6% | 45/144 | 31.3% | 0 | 260 | 0 | 51/37887 | 0/2923 | 0 |

Members' team records (sums): teammate hits 263, teammate bullet hits 3798, teammate collisions 0, shots held for the fire lane 2800, reports merged 1933649, drives fenced 10.
Engine's count of our bullets that hit one of our own members: 327.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 144 | 31.8% |
| **All** | 144 | 31.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc
