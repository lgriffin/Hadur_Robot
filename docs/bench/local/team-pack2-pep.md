# Team bench

hadur117.HadurTeam 3.24p2 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 16 battles (24.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 4 | 70.5% | 39/48 | 81.3% | 0 | 133 | 0 | 47/11161 | 0/1177 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 4 | 78.7% | 40/48 | 83.3% | 0 | 117 | 0 | 50/8747 | 0/1314 | 0 |
| davidalves.PhoenixTeam 0.54 | 4 | 84.2% | 46/48 | 95.8% | 0 | 60 | 0 | 37/9237 | 0/1376 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 4 | 89.0% | 48/48 | 100.0% | 0 | 74 | 0 | 17/8881 | 0/1409 | 0 |
| **All** | 16 | 80.6% | 173/192 | 90.1% | 0 | 384 | 0 | 151/38026 | 0/5276 | 0 |

Members' team records (sums): teammate hits 274, teammate bullet hits 4466, teammate collisions 0, shots held for the fire lane 2752, reports merged 2094265, drives fenced 34.
Engine's count of our bullets that hit one of our own members: 344.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 48 | 31.7% |
| cx.mini.DemoniacNimrods 0.50 | 48 | 34.5% |
| davidalves.PhoenixTeam 0.54 | 48 | 32.9% |
| kawigi.micro.ArmyOfShiz 1.1 | 48 | 34.7% |
| **All** | 192 | 33.4% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p2 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 70.5% ± 1.7 | 73.1% ± 9.5 | -2.6 ± 9.2 |
| cx.mini.DemoniacNimrods 0.50 | 78.7% ± 4.4 | 82.3% ± 4.8 | -3.6 ± 1.6 |
| davidalves.PhoenixTeam 0.54 | 84.2% ± 2.7 | 83.1% ± 4.3 | +1.1 ± 4.0 |
| kawigi.micro.ArmyOfShiz 1.1 | 89.0% ± 1.9 | 85.6% ± 2.9 | +3.4 ± 4.3 |
| **All** | 80.6% ± 3.9 | 81.0% ± 3.2 | -0.5 ± 2.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 4 of 4 | 4 of 4 | 4 |
| cx.mini.DemoniacNimrods 0.50 | 4 of 4 | 4 of 4 | 4 |
| davidalves.PhoenixTeam 0.54 | 4 of 4 | 4 of 4 | 4 |
| kawigi.micro.ArmyOfShiz 1.1 | 4 of 4 | 4 of 4 | 4 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 90.1% ± 5.2 | 91.1% ± 7.5 | -1.0 ± 7.0 |
| Survival | 90.1% ± 5.2 | 91.1% ± 7.5 | -1.0 ± 7.0 |
| In-lane shots | 0.4% ± 0.1 | 0.3% ± 0.1 | +0.1 ± 0.1 |
| Focus fire | 33.4% ± 1.0 | 33.3% ± 1.4 | +0.2 ± 1.5 |
| Bullets on own members | 21.50 ± 2.97 | 32.06 ± 4.21 | -10.6 ± 4.3 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 438 over 16 battles (27.4 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 4 | 73.1% | 34/48 | 70.8% | 0 | 137 | 0 | 40/13539 | 0/1247 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 4 | 82.3% | 48/48 | 100.0% | 0 | 138 | 0 | 40/9257 | 0/1364 | 0 |
| davidalves.PhoenixTeam 0.54 | 4 | 83.1% | 45/48 | 93.8% | 0 | 71 | 0 | 32/10946 | 0/1350 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 4 | 85.6% | 48/48 | 100.0% | 0 | 92 | 0 | 21/10933 | 0/1367 | 0 |
| **All** | 16 | 81.0% | 175/192 | 91.1% | 0 | 438 | 0 | 133/44675 | 0/5328 | 0 |

Members' team records (sums): teammate hits 419, teammate bullet hits 5759, teammate collisions 0, shots held for the fire lane 3715, reports merged 2440789, drives fenced 27.
Engine's count of our bullets that hit one of our own members: 513.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 48 | 30.9% |
| cx.mini.DemoniacNimrods 0.50 | 48 | 35.0% |
| davidalves.PhoenixTeam 0.54 | 48 | 33.8% |
| kawigi.micro.ArmyOfShiz 1.1 | 48 | 33.4% |
| **All** | 192 | 33.3% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
