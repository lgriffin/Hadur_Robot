# Team bench

hadur117.HadurTeam 3.19bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 16 battles (12.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 82.8% | 158/160 | 98.8% | 0 | 197 | 0 | 75/35767 | 0/4362 | 0 |
| **All** | 16 | 82.8% | 158/160 | 98.8% | 0 | 197 | 0 | 75/35767 | 0/4362 | 0 |

Members' team records (sums): teammate hits 850, teammate bullet hits 3369, teammate collisions 22, shots held for the fire lane 2855, reports merged 1832282, drives fenced 2603.
Engine's count of our bullets that hit one of our own members: 1175.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 30.1% |
| **All** | 160 | 30.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.19bb vs hadur117.HadurTeam 3.19aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 82.8% ± 1.9 | 81.5% ± 1.9 | +1.3 ± 2.3 |
| **All** | 82.8% ± 1.9 | 81.5% ± 1.9 | +1.3 ± 2.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 98.8% ± 1.8 | 98.1% ± 2.1 | +0.6 ± 3.1 |
| Survival | 98.8% ± 1.8 | 98.1% ± 2.1 | +0.6 ± 3.1 |
| In-lane shots | 0.2% ± 0.0 | 0.3% ± 0.1 | -0.1 ± 0.1 |
| Focus fire | 30.1% ± 1.2 | 29.7% ± 0.9 | +0.4 ± 1.4 |
| Bullets on own members | 73.44 ± 6.78 | 75.50 ± 6.68 | -2.1 ± 8.7 |

## Team bench

hadur117.HadurTeam 3.19aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 175 over 16 battles (10.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 81.5% | 157/160 | 98.1% | 0 | 175 | 0 | 97/36569 | 0/4285 | 0 |
| **All** | 16 | 81.5% | 157/160 | 98.1% | 0 | 175 | 0 | 97/36569 | 0/4285 | 0 |

Members' team records (sums): teammate hits 900, teammate bullet hits 3422, teammate collisions 43, shots held for the fire lane 3015, reports merged 1857800, drives fenced 2699.
Engine's count of our bullets that hit one of our own members: 1208.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.7% |
| **All** | 160 | 29.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc
