# Team bench

hadur117.HadurTeam 3.24bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6219 over 120 battles (51.8 per battle, most in one battle 98). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 37.3% | 26/288 | 9.0% | 0 | 946 | 0 | 246/63152 | 0/4081 | 0 |
| abc.ShadowTeam 3.83 | 24 | 59.4% | 142/288 | 49.3% | 0 | 1602 | 0 | 216/90746 | 0/6173 | 0 |
| rz.AlephTeam 0.34 | 24 | 57.8% | 103/288 | 35.8% | 0 | 1507 | 0 | 170/87582 | 0/6139 | 0 |
| florent.XSeries.Xmen 0.9 | 24 | 65.0% | 203/288 | 70.5% | 0 | 1095 | 0 | 461/79534 | 41/6637 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 24 | 74.3% | 233/288 | 80.9% | 0 | 1069 | 0 | 145/70013 | 0/7546 | 0 |
| **All** | 120 | 58.7% | 707/1440 | 49.1% | 0 | 6219 | 0 | 1238/391027 | 41/30576 | 0 |

Members' team records (sums): teammate hits 2970, teammate bullet hits 46644, teammate collisions 0, shots held for the fire lane 31086, reports merged 19163530, drives fenced 97.
Engine's count of our bullets that hit one of our own members: 3594.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 288 | 33.2% |
| abc.ShadowTeam 3.83 | 288 | 30.4% |
| rz.AlephTeam 0.34 | 288 | 31.3% |
| florent.XSeries.Xmen 0.9 | 288 | 32.0% |
| cx.mini.DemoniacNimrods 0.50 | 288 | 32.6% |
| **All** | 1440 | 31.9% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24bb vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 37.3% ± 2.4 | 34.1% ± 2.8 | +3.1 ± 3.0 |
| abc.ShadowTeam 3.83 | 59.4% ± 2.8 | 59.9% ± 2.7 | -0.5 ± 3.7 |
| rz.AlephTeam 0.34 | 57.8% ± 2.0 | 57.3% ± 2.0 | +0.5 ± 2.8 |
| florent.XSeries.Xmen 0.9 | 65.0% ± 1.9 | 63.8% ± 2.1 | +1.2 ± 2.6 |
| cx.mini.DemoniacNimrods 0.50 | 74.3% ± 1.3 | 73.6% ± 1.9 | +0.7 ± 2.0 |
| **All** | 58.7% ± 2.4 | 57.7% ± 2.6 | +1.0 ± 1.2 |

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
| Rounds won | 49.1% ± 5.1 | 47.3% ± 5.3 | +1.8 ± 2.8 |
| Survival | 49.1% ± 5.1 | 47.3% ± 5.3 | +1.8 ± 2.8 |
| In-lane shots | 0.3% ± 0.0 | 0.3% ± 0.0 | +0.0 ± 0.0 |
| Focus fire | 31.9% ± 0.4 | 32.1% ± 0.4 | -0.2 ± 0.4 |
| Bullets on own members | 29.95 ± 1.44 | 28.69 ± 1.64 | +1.3 ± 1.6 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 5973 over 120 battles (49.8 per battle, most in one battle 85). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 34.1% | 17/288 | 5.9% | 0 | 937 | 0 | 240/61458 | 0/3808 | 0 |
| abc.ShadowTeam 3.83 | 24 | 59.9% | 136/288 | 47.2% | 0 | 1518 | 0 | 203/91329 | 0/6230 | 0 |
| rz.AlephTeam 0.34 | 24 | 57.3% | 94/288 | 32.6% | 0 | 1581 | 0 | 191/88565 | 0/6122 | 0 |
| florent.XSeries.Xmen 0.9 | 24 | 63.8% | 200/288 | 69.4% | 0 | 973 | 0 | 393/77528 | 21/6531 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 24 | 73.6% | 234/288 | 81.3% | 0 | 964 | 0 | 145/70499 | 0/7468 | 0 |
| **All** | 120 | 57.7% | 681/1440 | 47.3% | 0 | 5973 | 0 | 1172/389379 | 21/30159 | 0 |

Members' team records (sums): teammate hits 2850, teammate bullet hits 46703, teammate collisions 0, shots held for the fire lane 30134, reports merged 18963322, drives fenced 122.
Engine's count of our bullets that hit one of our own members: 3443.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 288 | 33.5% |
| abc.ShadowTeam 3.83 | 288 | 30.3% |
| rz.AlephTeam 0.34 | 288 | 31.1% |
| florent.XSeries.Xmen 0.9 | 288 | 32.2% |
| cx.mini.DemoniacNimrods 0.50 | 288 | 33.3% |
| **All** | 1440 | 32.1% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
