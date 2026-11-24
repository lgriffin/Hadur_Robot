# Team bench

hadur117.HadurTeam 3.24bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1467 over 96 battles (15.3 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 58.0% | 255/288 | 88.5% | 0 | 653 | 0 | 835/37637 | 0/5459 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 64.1% | 273/288 | 94.8% | 0 | 314 | 0 | 1687/28555 | 0/6116 | 0 |
| amz.TeamDeathTeam 1 | 24 | 84.4% | 288/288 | 100.0% | 0 | 386 | 0 | 1644/20555 | 0/8189 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 80.8% | 288/288 | 100.0% | 0 | 114 | 0 | 1614/24384 | 0/7891 | 0 |
| **All** | 96 | 71.8% | 1104/1152 | 95.8% | 0 | 1467 | 0 | 5780/111131 | 0/27655 | 0 |

Members' team records (sums): teammate hits 1716, teammate bullet hits 5542, teammate collisions 0, shots held for the fire lane 15685, reports merged 5997565, drives fenced 823.
Engine's count of our bullets that hit one of our own members: 2585.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.8% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.9% |
| amz.TeamDeathTeam 1 | 288 | 34.9% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 35.6% |
| **All** | 1152 | 34.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24bb vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 58.0% ± 1.7 | 58.1% ± 1.6 | -0.2 ± 2.2 |
| ags.polylunar.Polylunar 1.6 | 64.1% ± 1.7 | 64.6% ± 1.9 | -0.6 ± 2.3 |
| amz.TeamDeathTeam 1 | 84.4% ± 0.6 | 84.2% ± 0.8 | +0.1 ± 0.9 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 80.8% ± 0.9 | 80.6% ± 1.2 | +0.2 ± 1.3 |
| **All** | 71.8% ± 2.3 | 71.9% ± 2.3 | -0.1 ± 0.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 of 24 | 24 of 24 | 24 |
| ags.polylunar.Polylunar 1.6 | 24 of 24 | 24 of 24 | 24 |
| amz.TeamDeathTeam 1 | 24 of 24 | 24 of 24 | 24 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 95.8% ± 1.4 | 95.7% ± 1.5 | +0.2 ± 1.5 |
| Survival | 95.8% ± 1.4 | 95.7% ± 1.5 | +0.2 ± 1.5 |
| In-lane shots | 5.7% ± 0.5 | 5.8% ± 0.4 | -0.1 ± 0.3 |
| Focus fire | 34.0% ± 0.4 | 33.8% ± 0.4 | +0.2 ± 0.4 |
| Bullets on own members | 26.93 ± 1.51 | 27.01 ± 1.60 | -0.1 ± 1.6 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1404 over 96 battles (14.6 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 58.1% | 254/288 | 88.2% | 0 | 587 | 0 | 925/37287 | 0/5470 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 64.6% | 272/288 | 94.4% | 0 | 279 | 0 | 1751/28487 | 0/6198 | 0 |
| amz.TeamDeathTeam 1 | 24 | 84.2% | 288/288 | 100.0% | 0 | 416 | 0 | 1545/20886 | 0/8131 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 80.6% | 288/288 | 100.0% | 0 | 122 | 0 | 1721/24249 | 0/7888 | 0 |
| **All** | 96 | 71.9% | 1102/1152 | 95.7% | 0 | 1404 | 0 | 5942/110909 | 0/27687 | 0 |

Members' team records (sums): teammate hits 1707, teammate bullet hits 5294, teammate collisions 14, shots held for the fire lane 15789, reports merged 5968023, drives fenced 850.
Engine's count of our bullets that hit one of our own members: 2593.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.8% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.6% |
| amz.TeamDeathTeam 1 | 288 | 34.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 35.2% |
| **All** | 1152 | 33.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc
