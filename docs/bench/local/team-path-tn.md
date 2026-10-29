# Team bench

hadur117.HadurTeam 3.19tn against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 16 battles (12.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 82.3% | 155/160 | 96.9% | 0 | 200 | 0 | 106/36757 | 0/4359 | 0 |
| **All** | 16 | 82.3% | 155/160 | 96.9% | 0 | 200 | 0 | 106/36757 | 0/4359 | 0 |

Members' team records (sums): teammate hits 1093, teammate bullet hits 3712, teammate collisions 32, shots held for the fire lane 2919, reports merged 1865127, drives fenced 3609.
Engine's count of our bullets that hit one of our own members: 1413.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.3% |
| **All** | 160 | 29.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.19tn vs hadur117.HadurTeam 3.19aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 82.3% ± 1.6 | 82.5% ± 1.7 | -0.1 ± 2.6 |
| **All** | 82.3% ± 1.6 | 82.5% ± 1.7 | -0.1 ± 2.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 96.9% ± 2.6 | 96.9% ± 3.2 | +0.0 ± 4.8 |
| Survival | 96.9% ± 2.6 | 96.9% ± 3.2 | +0.0 ± 4.8 |
| In-lane shots | 0.3% ± 0.0 | 0.2% ± 0.0 | +0.0 ± 0.1 |
| Focus fire | 29.3% ± 0.8 | 29.6% ± 0.7 | -0.3 ± 0.9 |
| Bullets on own members | 88.31 ± 6.48 | 72.94 ± 7.01 | +15.4 ± 10.2 |

## Team bench

hadur117.HadurTeam 3.19aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 177 over 16 battles (11.1 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 82.5% | 155/160 | 96.9% | 0 | 177 | 0 | 87/36613 | 0/4353 | 0 |
| **All** | 16 | 82.5% | 155/160 | 96.9% | 0 | 177 | 0 | 87/36613 | 0/4353 | 0 |

Members' team records (sums): teammate hits 892, teammate bullet hits 3472, teammate collisions 41, shots held for the fire lane 2922, reports merged 1871843, drives fenced 2721.
Engine's count of our bullets that hit one of our own members: 1167.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.6% |
| **All** | 160 | 29.6% |

Data files written (any battle): hadur117\Hadur.data\health.hc
