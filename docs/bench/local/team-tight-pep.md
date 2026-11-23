# Team bench

hadur117.HadurTeam 3.24tp against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 746 over 20 battles (37.3 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 20 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 | 41.2% | 4/48 | 8.3% | 0 | 167 | 0 | 48/11040 | 0/752 | 0 |
| abc.ShadowTeam 3.83 | 4 | 74.2% | 36/48 | 75.0% | 0 | 145 | 0 | 37/13354 | 0/1245 | 0 |
| rz.AlephTeam 0.34 | 4 | 62.9% | 24/48 | 50.0% | 0 | 174 | 0 | 36/13136 | 0/1097 | 0 |
| florent.XSeries.Xmen 0.9 | 4 | 69.9% | 38/48 | 79.2% | 0 | 132 | 0 | 96/12221 | 0/1178 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 4 | 80.2% | 45/48 | 93.8% | 0 | 128 | 0 | 44/9929 | 0/1326 | 0 |
| **All** | 20 | 65.7% | 147/240 | 61.3% | 0 | 746 | 0 | 261/59680 | 0/5598 | 0 |

Members' team records (sums): teammate hits 398, teammate bullet hits 7380, teammate collisions 0, shots held for the fire lane 4319, reports merged 3066786, drives fenced 55.
Engine's count of our bullets that hit one of our own members: 510.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 34.6% |
| abc.ShadowTeam 3.83 | 48 | 31.3% |
| rz.AlephTeam 0.34 | 48 | 32.6% |
| florent.XSeries.Xmen 0.9 | 48 | 31.8% |
| cx.mini.DemoniacNimrods 0.50 | 48 | 33.5% |
| **All** | 240 | 32.8% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24tp vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 41.2% ± 7.3 | 32.5% ± 5.2 | +8.7 ± 10.6 |
| abc.ShadowTeam 3.83 | 74.2% ± 9.4 | 57.5% ± 11.5 | +16.7 ± 19.8 |
| rz.AlephTeam 0.34 | 62.9% ± 4.8 | 58.0% ± 12.2 | +4.9 ± 13.7 |
| florent.XSeries.Xmen 0.9 | 69.9% ± 4.7 | 62.8% ± 2.9 | +7.0 ± 3.2 |
| cx.mini.DemoniacNimrods 0.50 | 80.2% ± 1.3 | 75.7% ± 4.7 | +4.5 ± 3.8 |
| **All** | 65.7% ± 6.7 | 57.3% ± 7.1 | +8.4 ± 3.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 of 4 | 4 of 4 | 4 |
| abc.ShadowTeam 3.83 | 4 of 4 | 4 of 4 | 4 |
| rz.AlephTeam 0.34 | 4 of 4 | 4 of 4 | 4 |
| florent.XSeries.Xmen 0.9 | 4 of 4 | 4 of 4 | 4 |
| cx.mini.DemoniacNimrods 0.50 | 4 of 4 | 4 of 4 | 4 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 61.3% ± 15.1 | 48.3% ± 15.3 | +12.9 ± 10.1 |
| Survival | 61.3% ± 15.1 | 48.3% ± 15.3 | +12.9 ± 10.1 |
| In-lane shots | 0.4% ± 0.1 | 0.3% ± 0.1 | +0.2 ± 0.1 |
| Focus fire | 32.8% ± 0.9 | 33.0% ± 1.3 | -0.2 ± 1.0 |
| Bullets on own members | 25.50 ± 3.48 | 31.15 ± 4.51 | -5.7 ± 5.2 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1049 over 20 battles (52.5 per battle, most in one battle 82). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 20 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 | 32.5% | 4/48 | 8.3% | 0 | 189 | 0 | 34/10071 | 0/612 | 0 |
| abc.ShadowTeam 3.83 | 4 | 57.5% | 18/48 | 37.5% | 0 | 276 | 0 | 44/16229 | 0/1011 | 0 |
| rz.AlephTeam 0.34 | 4 | 58.0% | 17/48 | 35.4% | 0 | 276 | 0 | 26/14268 | 0/1028 | 0 |
| florent.XSeries.Xmen 0.9 | 4 | 62.8% | 32/48 | 66.7% | 0 | 164 | 0 | 63/13196 | 0/1075 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 4 | 75.7% | 45/48 | 93.8% | 0 | 144 | 0 | 21/11906 | 0/1266 | 0 |
| **All** | 20 | 57.3% | 116/240 | 48.3% | 0 | 1049 | 0 | 188/65670 | 0/4992 | 0 |

Members' team records (sums): teammate hits 511, teammate bullet hits 8116, teammate collisions 0, shots held for the fire lane 5106, reports merged 3158953, drives fenced 10.
Engine's count of our bullets that hit one of our own members: 623.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 48 | 36.5% |
| abc.ShadowTeam 3.83 | 48 | 30.6% |
| rz.AlephTeam 0.34 | 48 | 32.1% |
| florent.XSeries.Xmen 0.9 | 48 | 32.9% |
| cx.mini.DemoniacNimrods 0.50 | 48 | 32.9% |
| **All** | 240 | 33.0% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
