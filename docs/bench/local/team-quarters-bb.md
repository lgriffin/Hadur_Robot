# Team bench

hadur117.HadurTeam 3.21bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1503767. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2199 over 120 battles (18.3 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 49.7% | 210/288 | 72.9% | 0 | 525 | 0 | 744/41420 | 0/4741 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 59.5% | 261/288 | 90.6% | 0 | 750 | 0 | 1771/34044 | 0/5727 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 79.5% | 288/288 | 100.0% | 0 | 357 | 0 | 1710/32395 | 0/7781 | 0 |
| amz.TeamDeathTeam 1 | 24 | 82.9% | 288/288 | 100.0% | 0 | 295 | 0 | 1405/29494 | 0/8058 | 0 |
| jab.Enjambre 3 | 24 | 88.6% | 288/288 | 100.0% | 0 | 272 | 0 | 1366/60022 | 0/8396 | 0 |
| **All** | 120 | 72.0% | 1335/1440 | 92.7% | 0 | 2199 | 0 | 6996/197375 | 0/34703 | 0 |

Members' team records (sums): teammate hits 5000, teammate bullet hits 12201, teammate collisions 161, shots held for the fire lane 20181, reports merged 8681022, drives fenced 15437.
Engine's count of our bullets that hit one of our own members: 8508.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.9% |
| ags.polylunar.Polylunar 1.6 | 288 | 33.0% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.3% |
| amz.TeamDeathTeam 1 | 288 | 34.6% |
| jab.Enjambre 3 | 288 | 25.8% |
| **All** | 1440 | 32.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.21bb vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 49.7% ± 2.0 | 48.1% ± 1.8 | +1.6 ± 2.6 |
| ags.polylunar.Polylunar 1.6 | 59.5% ± 1.8 | 59.1% ± 1.3 | +0.4 ± 2.3 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 79.5% ± 1.1 | 79.5% ± 1.1 | -0.0 ± 1.2 |
| amz.TeamDeathTeam 1 | 82.9% ± 0.9 | 81.7% ± 0.8 | +1.2 ± 1.3 |
| jab.Enjambre 3 | 88.6% ± 0.9 | 88.4% ± 0.6 | +0.1 ± 1.1 |
| **All** | 72.0% ± 2.8 | 71.4% ± 2.8 | +0.7 ± 0.8 |

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
| Rounds won | 92.7% ± 2.3 | 91.5% ± 2.5 | +1.2 ± 1.6 |
| Survival | 92.7% ± 2.3 | 91.5% ± 2.5 | +1.2 ± 1.6 |
| In-lane shots | 3.9% ± 0.3 | 3.9% ± 0.3 | -0.1 ± 0.2 |
| Focus fire | 32.1% ± 0.6 | 32.1% ± 0.7 | +0.0 ± 0.3 |
| Bullets on own members | 70.90 ± 5.33 | 69.80 ± 5.58 | +1.1 ± 3.1 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 2142 over 120 battles (17.9 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 120 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 48.1% | 201/288 | 69.8% | 0 | 531 | 0 | 858/40572 | 0/4573 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 59.1% | 252/288 | 87.5% | 0 | 682 | 0 | 1691/33653 | 0/5683 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 79.5% | 288/288 | 100.0% | 0 | 351 | 0 | 1555/32226 | 0/7776 | 0 |
| amz.TeamDeathTeam 1 | 24 | 81.7% | 288/288 | 100.0% | 0 | 300 | 0 | 1587/29263 | 0/7956 | 0 |
| jab.Enjambre 3 | 24 | 88.4% | 288/288 | 100.0% | 0 | 278 | 0 | 1370/60049 | 0/8370 | 0 |
| **All** | 120 | 71.4% | 1317/1440 | 91.5% | 0 | 2142 | 0 | 7061/195763 | 0/34358 | 0 |

Members' team records (sums): teammate hits 5088, teammate bullet hits 12477, teammate collisions 313, shots held for the fire lane 20108, reports merged 8658332, drives fenced 15011.
Engine's count of our bullets that hit one of our own members: 8376.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.9% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.6% |
| amz.TeamDeathTeam 1 | 288 | 34.7% |
| jab.Enjambre 3 | 288 | 25.6% |
| **All** | 1440 | 32.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
