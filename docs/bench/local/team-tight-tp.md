# Team bench

hadur117.HadurTeam 3.24tp against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4707 over 120 battles (39.2 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 43.5% | 41/288 | 14.2% | 0 | 937 | 0 | 245/64285 | 0/4647 | 0 |
| abc.ShadowTeam 3.83 | 24 | 69.4% | 197/288 | 68.4% | 0 | 1034 | 0 | 264/79276 | 0/7073 | 0 |
| rz.AlephTeam 0.34 | 24 | 65.0% | 155/288 | 53.8% | 0 | 1061 | 0 | 182/76146 | 0/6775 | 0 |
| florent.XSeries.Xmen 0.9 | 24 | 73.2% | 243/288 | 84.4% | 0 | 786 | 0 | 633/71092 | 20/7333 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 24 | 77.9% | 261/288 | 90.6% | 0 | 889 | 0 | 131/57177 | 0/7786 | 0 |
| **All** | 120 | 65.8% | 897/1440 | 62.3% | 0 | 4707 | 0 | 1455/347976 | 20/33614 | 0 |

Members' team records (sums): teammate hits 2525, teammate bullet hits 41313, teammate collisions 150, shots held for the fire lane 24832, reports merged 17706388, drives fenced 278.
Engine's count of our bullets that hit one of our own members: 3214.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 288 | 33.6% |
| abc.ShadowTeam 3.83 | 288 | 31.5% |
| rz.AlephTeam 0.34 | 288 | 31.9% |
| florent.XSeries.Xmen 0.9 | 288 | 32.2% |
| cx.mini.DemoniacNimrods 0.50 | 288 | 33.8% |
| **All** | 1440 | 32.6% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24tp vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 43.5% ± 2.1 | 37.3% ± 2.3 | +6.2 ± 3.7 |
| abc.ShadowTeam 3.83 | 69.4% ± 2.0 | 59.4% ± 2.8 | +10.0 ± 3.8 |
| rz.AlephTeam 0.34 | 65.0% ± 1.9 | 55.6% ± 2.8 | +9.4 ± 3.8 |
| florent.XSeries.Xmen 0.9 | 73.2% ± 1.7 | 64.3% ± 2.3 | +8.9 ± 2.7 |
| cx.mini.DemoniacNimrods 0.50 | 77.9% ± 1.4 | 74.6% ± 2.2 | +3.2 ± 2.5 |
| **All** | 65.8% ± 2.3 | 58.2% ± 2.5 | +7.5 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 of 24 | 24 of 24 | 24 |
| abc.ShadowTeam 3.83 | 24 of 24 | 24 of 24 | 24 |
| rz.AlephTeam 0.34 | 24 of 24 | 24 of 24 | 24 |
| florent.XSeries.Xmen 0.9 | 24 of 24 | 24 of 24 | 24 |
| cx.mini.DemoniacNimrods 0.50 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 62.3% ± 5.3 | 49.0% ± 5.4 | +13.3 ± 3.2 |
| Survival | 62.3% ± 5.3 | 49.0% ± 5.4 | +13.3 ± 3.2 |
| In-lane shots | 0.4% ± 0.1 | 0.3% ± 0.0 | +0.1 ± 0.0 |
| Focus fire | 32.6% ± 0.3 | 32.1% ± 0.4 | +0.5 ± 0.4 |
| Bullets on own members | 26.78 ± 1.39 | 28.89 ± 1.37 | -2.1 ± 1.7 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 6521 over 120 battles (54.3 per battle, most in one battle 96). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 37.3% | 27/288 | 9.4% | 0 | 1015 | 0 | 257/62096 | 0/4090 | 0 |
| abc.ShadowTeam 3.83 | 24 | 59.4% | 139/288 | 48.3% | 0 | 1633 | 0 | 195/89020 | 0/6180 | 0 |
| rz.AlephTeam 0.34 | 24 | 55.6% | 95/288 | 33.0% | 0 | 1663 | 0 | 191/86110 | 0/5945 | 0 |
| florent.XSeries.Xmen 0.9 | 24 | 64.3% | 201/288 | 69.8% | 0 | 1104 | 0 | 505/79013 | 24/6568 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 24 | 74.6% | 243/288 | 84.4% | 0 | 1106 | 0 | 142/69489 | 0/7554 | 0 |
| **All** | 120 | 58.2% | 705/1440 | 49.0% | 0 | 6521 | 0 | 1290/385728 | 24/30337 | 0 |

Members' team records (sums): teammate hits 2870, teammate bullet hits 45960, teammate collisions 0, shots held for the fire lane 30150, reports merged 18880800, drives fenced 116.
Engine's count of our bullets that hit one of our own members: 3467.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 288 | 33.0% |
| abc.ShadowTeam 3.83 | 288 | 30.8% |
| rz.AlephTeam 0.34 | 288 | 31.5% |
| florent.XSeries.Xmen 0.9 | 288 | 32.1% |
| cx.mini.DemoniacNimrods 0.50 | 288 | 33.0% |
| **All** | 1440 | 32.1% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
