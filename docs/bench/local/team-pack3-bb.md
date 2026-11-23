# Team bench

hadur117.HadurTeam 3.24bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3326 over 96 battles (34.6 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 24 | 78.5% | 264/288 | 91.7% | 0 | 846 | 0 | 150/57637 | 0/7856 | 0 |
| davidalves.PhoenixTeam 0.54 | 24 | 83.0% | 262/288 | 91.0% | 0 | 694 | 0 | 213/69925 | 0/8124 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 85.6% | 286/288 | 99.3% | 0 | 689 | 0 | 162/65785 | 0/8182 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 59.9% | 103/288 | 35.8% | 0 | 1097 | 0 | 207/76947 | 0/6090 | 0 |
| **All** | 96 | 76.8% | 915/1152 | 79.4% | 0 | 3326 | 0 | 732/270294 | 0/30252 | 0 |

Members' team records (sums): teammate hits 2354, teammate bullet hits 34123, teammate collisions 0, shots held for the fire lane 21174, reports merged 14650128, drives fenced 142.
Engine's count of our bullets that hit one of our own members: 2893.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 288 | 34.0% |
| davidalves.PhoenixTeam 0.54 | 288 | 33.5% |
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.6% |
| mn.CombatTeam 3.25.0 | 288 | 30.9% |
| **All** | 1152 | 33.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24bb vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 78.5% ± 1.6 | 78.7% ± 1.5 | -0.2 ± 2.0 |
| davidalves.PhoenixTeam 0.54 | 83.0% ± 1.2 | 82.8% ± 1.5 | +0.3 ± 2.1 |
| kawigi.micro.ArmyOfShiz 1.1 | 85.6% ± 1.1 | 85.7% ± 1.2 | -0.1 ± 1.2 |
| mn.CombatTeam 3.25.0 | 59.9% ± 2.5 | 61.1% ± 2.2 | -1.2 ± 3.4 |
| **All** | 76.8% ± 2.2 | 77.0% ± 2.1 | -0.3 ± 1.1 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 24 of 24 | 24 of 24 | 24 |
| davidalves.PhoenixTeam 0.54 | 24 of 24 | 24 of 24 | 24 |
| kawigi.micro.ArmyOfShiz 1.1 | 24 of 24 | 24 of 24 | 24 |
| mn.CombatTeam 3.25.0 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 79.4% ± 5.5 | 79.9% ± 5.3 | -0.5 ± 2.4 |
| Survival | 79.4% ± 5.5 | 79.9% ± 5.3 | -0.5 ± 2.4 |
| In-lane shots | 0.3% ± 0.0 | 0.3% ± 0.0 | -0.0 ± 0.0 |
| Focus fire | 33.0% ± 0.4 | 32.8% ± 0.4 | +0.2 ± 0.5 |
| Bullets on own members | 30.14 ± 1.53 | 30.65 ± 1.78 | -0.5 ± 1.9 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 3338 over 96 battles (34.8 per battle, most in one battle 67). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 24 | 78.7% | 269/288 | 93.4% | 0 | 814 | 0 | 180/57497 | 0/7848 | 0 |
| davidalves.PhoenixTeam 0.54 | 24 | 82.8% | 258/288 | 89.6% | 0 | 633 | 0 | 235/71231 | 0/8081 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 85.7% | 286/288 | 99.3% | 0 | 722 | 0 | 151/66496 | 0/8176 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 61.1% | 108/288 | 37.5% | 0 | 1169 | 0 | 185/78184 | 0/6211 | 0 |
| **All** | 96 | 77.0% | 921/1152 | 79.9% | 0 | 3338 | 0 | 751/273408 | 0/30316 | 0 |

Members' team records (sums): teammate hits 2375, teammate bullet hits 35089, teammate collisions 2, shots held for the fire lane 21397, reports merged 14708363, drives fenced 108.
Engine's count of our bullets that hit one of our own members: 2942.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 288 | 34.2% |
| davidalves.PhoenixTeam 0.54 | 288 | 33.2% |
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.0% |
| mn.CombatTeam 3.25.0 | 288 | 31.0% |
| **All** | 1152 | 32.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc
