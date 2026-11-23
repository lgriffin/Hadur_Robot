# Team bench

hadur117.HadurTeam 3.24p3 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2806 over 96 battles (29.2 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 24 | 81.7% | 271/288 | 94.1% | 0 | 629 | 0 | 260/50403 | 0/8080 | 0 |
| davidalves.PhoenixTeam 0.54 | 24 | 84.0% | 277/288 | 96.2% | 0 | 413 | 0 | 253/56599 | 0/8213 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 89.5% | 287/288 | 99.7% | 0 | 454 | 0 | 192/54182 | 0/8450 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 60.1% | 121/288 | 42.0% | 0 | 1310 | 0 | 188/87425 | 0/6290 | 0 |
| **All** | 96 | 78.8% | 956/1152 | 83.0% | 0 | 2806 | 0 | 893/248609 | 0/31033 | 0 |

Members' team records (sums): teammate hits 2021, teammate bullet hits 30451, teammate collisions 8, shots held for the fire lane 18202, reports merged 13427752, drives fenced 183.
Engine's count of our bullets that hit one of our own members: 2588.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 288 | 34.2% |
| davidalves.PhoenixTeam 0.54 | 288 | 34.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 34.7% |
| mn.CombatTeam 3.25.0 | 288 | 30.6% |
| **All** | 1152 | 33.4% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p3 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 81.7% ± 1.0 | 78.5% ± 1.8 | +3.3 ± 1.9 |
| davidalves.PhoenixTeam 0.54 | 84.0% ± 1.3 | 82.9% ± 1.4 | +1.1 ± 2.3 |
| kawigi.micro.ArmyOfShiz 1.1 | 89.5% ± 0.6 | 86.9% ± 1.0 | +2.6 ± 1.2 |
| mn.CombatTeam 3.25.0 | 60.1% ± 2.1 | 59.6% ± 3.3 | +0.5 ± 4.5 |
| **All** | 78.8% ± 2.4 | 77.0% ± 2.3 | +1.9 ± 1.3 |

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
| Rounds won | 83.0% ± 5.1 | 80.0% ± 5.7 | +3.0 ± 2.6 |
| Survival | 83.0% ± 5.1 | 80.0% ± 5.7 | +3.0 ± 2.6 |
| In-lane shots | 0.4% ± 0.0 | 0.3% ± 0.0 | +0.1 ± 0.1 |
| Focus fire | 33.4% ± 0.5 | 33.1% ± 0.4 | +0.3 ± 0.5 |
| Bullets on own members | 26.96 ± 1.47 | 30.98 ± 1.88 | -4.0 ± 2.3 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 3409 over 96 battles (35.5 per battle, most in one battle 62). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 24 | 78.5% | 269/288 | 93.4% | 0 | 906 | 0 | 193/57381 | 0/7834 | 0 |
| davidalves.PhoenixTeam 0.54 | 24 | 82.9% | 268/288 | 93.1% | 0 | 681 | 0 | 203/69505 | 0/8082 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 86.9% | 287/288 | 99.7% | 0 | 728 | 0 | 134/66912 | 0/8264 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 59.6% | 98/288 | 34.0% | 0 | 1094 | 0 | 215/76606 | 0/6075 | 0 |
| **All** | 96 | 77.0% | 922/1152 | 80.0% | 0 | 3409 | 0 | 745/270404 | 0/30255 | 0 |

Members' team records (sums): teammate hits 2345, teammate bullet hits 34047, teammate collisions 0, shots held for the fire lane 21271, reports merged 14631541, drives fenced 115.
Engine's count of our bullets that hit one of our own members: 2974.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 288 | 34.9% |
| davidalves.PhoenixTeam 0.54 | 288 | 32.8% |
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.7% |
| mn.CombatTeam 3.25.0 | 288 | 30.9% |
| **All** | 1152 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
