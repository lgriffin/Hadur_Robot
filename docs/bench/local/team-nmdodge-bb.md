# Team bench

hadur117.HadurTeam 3.24bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 371 over 48 battles (7.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 | 53.6% | 434/576 | 75.3% | 0 | 371 | 0 | 1508/78405 | 0/10242 | 0 |
| **All** | 48 | 53.6% | 434/576 | 75.3% | 0 | 371 | 0 | 1508/78405 | 0/10242 | 0 |

Members' team records (sums): teammate hits 775, teammate bullet hits 4057, teammate collisions 96, shots held for the fire lane 7154, reports merged 3306229, drives fenced 782.
Engine's count of our bullets that hit one of our own members: 956.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 576 | 33.4% |
| **All** | 576 | 33.4% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24bb vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 53.6% ± 1.3 | 52.3% ± 1.4 | +1.3 ± 2.0 |
| **All** | 53.6% ± 1.3 | 52.3% ± 1.4 | +1.3 ± 2.0 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 of 48 | 48 of 48 | 48 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 75.3% ± 3.5 | 73.4% ± 3.2 | +1.9 ± 4.6 |
| Survival | 75.3% ± 3.5 | 73.4% ± 3.2 | +1.9 ± 4.6 |
| In-lane shots | 1.9% ± 0.1 | 1.9% ± 0.1 | +0.0 ± 0.2 |
| Focus fire | 33.4% ± 0.4 | 33.1% ± 0.4 | +0.3 ± 0.5 |
| Bullets on own members | 19.92 ± 1.36 | 20.02 ± 1.29 | -0.1 ± 1.8 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 374 over 48 battles (7.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 48 | 52.3% | 423/576 | 73.4% | 0 | 374 | 0 | 1478/77717 | 0/9965 | 0 |
| **All** | 48 | 52.3% | 423/576 | 73.4% | 0 | 374 | 0 | 1478/77717 | 0/9965 | 0 |

Members' team records (sums): teammate hits 771, teammate bullet hits 3885, teammate collisions 18, shots held for the fire lane 6861, reports merged 3254736, drives fenced 698.
Engine's count of our bullets that hit one of our own members: 961.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 576 | 33.1% |
| **All** | 576 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
