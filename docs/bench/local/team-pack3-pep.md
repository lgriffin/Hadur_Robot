# Team bench

hadur117.HadurTeam 3.24p3 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 992 over 32 battles (31.0 per battle, most in one battle 66). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 8 | 83.5% | 92/96 | 95.8% | 0 | 204 | 0 | 100/16019 | 0/2745 | 0 |
| davidalves.PhoenixTeam 0.54 | 8 | 82.7% | 90/96 | 93.8% | 0 | 190 | 0 | 61/18741 | 0/2702 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 8 | 90.1% | 96/96 | 100.0% | 0 | 193 | 0 | 60/17333 | 0/2825 | 0 |
| mn.CombatTeam 3.25.0 | 8 | 59.8% | 43/96 | 44.8% | 0 | 405 | 0 | 57/27739 | 0/2072 | 0 |
| **All** | 32 | 79.0% | 321/384 | 83.6% | 0 | 992 | 0 | 278/79832 | 0/10344 | 0 |

Members' team records (sums): teammate hits 656, teammate bullet hits 9971, teammate collisions 4, shots held for the fire lane 6042, reports merged 4366358, drives fenced 62.
Engine's count of our bullets that hit one of our own members: 838.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 96 | 35.7% |
| davidalves.PhoenixTeam 0.54 | 96 | 33.8% |
| kawigi.micro.ArmyOfShiz 1.1 | 96 | 35.9% |
| mn.CombatTeam 3.25.0 | 96 | 31.9% |
| **All** | 384 | 34.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p3 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 83.5% ± 1.9 | 80.2% ± 3.1 | +3.3 ± 3.9 |
| davidalves.PhoenixTeam 0.54 | 82.7% ± 4.1 | 81.5% ± 3.8 | +1.2 ± 3.5 |
| kawigi.micro.ArmyOfShiz 1.1 | 90.1% ± 0.8 | 85.3% ± 1.6 | +4.8 ± 2.0 |
| mn.CombatTeam 3.25.0 | 59.8% ± 3.0 | 56.1% ± 4.0 | +3.7 ± 4.1 |
| **All** | 79.0% ± 4.3 | 75.8% ± 4.4 | +3.2 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 8 of 8 | 8 of 8 | 8 |
| davidalves.PhoenixTeam 0.54 | 8 of 8 | 8 of 8 | 8 |
| kawigi.micro.ArmyOfShiz 1.1 | 8 of 8 | 8 of 8 | 8 |
| mn.CombatTeam 3.25.0 | 8 of 8 | 8 of 8 | 8 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 83.6% ± 8.6 | 76.6% ± 11.8 | +7.0 ± 4.3 |
| Survival | 83.6% ± 8.6 | 76.6% ± 11.8 | +7.0 ± 4.3 |
| In-lane shots | 0.4% ± 0.1 | 0.3% ± 0.0 | +0.1 ± 0.1 |
| Focus fire | 34.3% ± 0.8 | 32.7% ± 0.8 | +1.6 ± 0.9 |
| Bullets on own members | 26.19 ± 2.41 | 33.00 ± 3.81 | -6.8 ± 4.5 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1094 over 32 battles (34.2 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 8 | 80.2% | 91/96 | 94.8% | 0 | 258 | 0 | 56/18836 | 0/2647 | 0 |
| davidalves.PhoenixTeam 0.54 | 8 | 81.5% | 85/96 | 88.5% | 0 | 243 | 0 | 72/23342 | 0/2667 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 8 | 85.3% | 95/96 | 99.0% | 0 | 291 | 0 | 47/22737 | 0/2729 | 0 |
| mn.CombatTeam 3.25.0 | 8 | 56.1% | 23/96 | 24.0% | 0 | 302 | 0 | 65/26876 | 0/1933 | 0 |
| **All** | 32 | 75.8% | 294/384 | 76.6% | 0 | 1094 | 0 | 240/91791 | 0/9976 | 0 |

Members' team records (sums): teammate hits 856, teammate bullet hits 11640, teammate collisions 0, shots held for the fire lane 7181, reports merged 4895397, drives fenced 38.
Engine's count of our bullets that hit one of our own members: 1056.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 96 | 34.2% |
| davidalves.PhoenixTeam 0.54 | 96 | 33.9% |
| kawigi.micro.ArmyOfShiz 1.1 | 96 | 32.4% |
| mn.CombatTeam 3.25.0 | 96 | 30.4% |
| **All** | 384 | 32.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc
