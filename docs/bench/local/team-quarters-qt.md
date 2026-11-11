# Team bench

hadur117.HadurTeam 3.21qt against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1510090. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2212 over 120 battles (18.4 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 53.0% | 220/288 | 76.4% | 0 | 533 | 0 | 740/43942 | 0/5022 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 58.5% | 252/288 | 87.5% | 0 | 728 | 0 | 1596/33704 | 0/5628 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 80.2% | 288/288 | 100.0% | 0 | 330 | 0 | 1388/32845 | 0/7795 | 0 |
| amz.TeamDeathTeam 1 | 24 | 82.3% | 288/288 | 100.0% | 0 | 326 | 0 | 1363/30255 | 0/8006 | 0 |
| jab.Enjambre 3 | 24 | 89.2% | 288/288 | 100.0% | 0 | 295 | 0 | 1287/60873 | 0/8416 | 0 |
| **All** | 120 | 72.7% | 1336/1440 | 92.8% | 0 | 2212 | 0 | 6374/201619 | 0/34867 | 0 |

Members' team records (sums): teammate hits 5377, teammate bullet hits 13083, teammate collisions 456, shots held for the fire lane 20640, reports merged 8896980, drives fenced 17049.
Engine's count of our bullets that hit one of our own members: 8806.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.7% |
| ags.polylunar.Polylunar 1.6 | 288 | 33.1% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.5% |
| amz.TeamDeathTeam 1 | 288 | 35.1% |
| jab.Enjambre 3 | 288 | 25.9% |
| **All** | 1440 | 32.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.21qt vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 53.0% ± 1.9 | 48.2% ± 2.4 | +4.8 ± 2.9 |
| ags.polylunar.Polylunar 1.6 | 58.5% ± 1.4 | 59.5% ± 1.7 | -1.0 ± 1.7 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 80.2% ± 0.8 | 79.9% ± 0.8 | +0.4 ± 1.1 |
| amz.TeamDeathTeam 1 | 82.3% ± 1.1 | 82.8% ± 1.0 | -0.5 ± 1.5 |
| jab.Enjambre 3 | 89.2% ± 0.4 | 88.8% ± 0.9 | +0.5 ± 1.1 |
| **All** | 72.7% ± 2.6 | 71.8% ± 2.9 | +0.8 ± 0.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 of 24 | 24 of 24 | 24 |
| ags.polylunar.Polylunar 1.6 | 24 of 24 | 24 of 24 | 24 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 of 24 | 24 of 24 | 24 |
| amz.TeamDeathTeam 1 | 24 of 24 | 24 of 24 | 24 |
| jab.Enjambre 3 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 92.8% ± 2.2 | 91.9% ± 2.6 | +0.8 ± 1.9 |
| Survival | 92.8% ± 2.2 | 91.9% ± 2.6 | +0.8 ± 1.9 |
| In-lane shots | 3.5% ± 0.3 | 3.8% ± 0.3 | -0.3 ± 0.2 |
| Focus fire | 32.3% ± 0.6 | 32.3% ± 0.7 | -0.0 ± 0.4 |
| Bullets on own members | 73.38 ± 5.31 | 71.35 ± 5.69 | +2.0 ± 3.1 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 2342 over 120 battles (19.5 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 48.2% | 202/288 | 70.1% | 0 | 558 | 0 | 760/40786 | 0/4588 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 59.5% | 258/288 | 89.6% | 0 | 828 | 0 | 1698/33668 | 0/5730 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 79.9% | 288/288 | 100.0% | 0 | 333 | 0 | 1518/31975 | 0/7833 | 0 |
| amz.TeamDeathTeam 1 | 24 | 82.8% | 288/288 | 100.0% | 0 | 308 | 0 | 1449/29608 | 0/8069 | 0 |
| jab.Enjambre 3 | 24 | 88.8% | 288/288 | 100.0% | 0 | 315 | 0 | 1377/61179 | 0/8370 | 0 |
| **All** | 120 | 71.8% | 1324/1440 | 91.9% | 0 | 2342 | 0 | 6802/197216 | 0/34590 | 0 |

Members' team records (sums): teammate hits 5086, teammate bullet hits 12490, teammate collisions 305, shots held for the fire lane 19783, reports merged 8682842, drives fenced 16287.
Engine's count of our bullets that hit one of our own members: 8562.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.9% |
| ags.polylunar.Polylunar 1.6 | 288 | 33.3% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 35.0% |
| amz.TeamDeathTeam 1 | 288 | 34.6% |
| jab.Enjambre 3 | 288 | 25.7% |
| **All** | 1440 | 32.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc
