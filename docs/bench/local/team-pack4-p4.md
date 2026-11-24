# Team bench

hadur117.HadurTeam 3.24p4 against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1415 over 96 battles (14.7 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 57.2% | 248/288 | 86.1% | 0 | 687 | 0 | 776/37017 | 0/5382 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 67.0% | 277/288 | 96.2% | 0 | 245 | 0 | 1690/29005 | 0/6426 | 0 |
| amz.TeamDeathTeam 1 | 24 | 85.4% | 288/288 | 100.0% | 0 | 395 | 0 | 1276/20123 | 0/8142 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 81.4% | 288/288 | 100.0% | 0 | 88 | 0 | 1298/24868 | 0/7883 | 0 |
| **All** | 96 | 72.7% | 1101/1152 | 95.6% | 0 | 1415 | 0 | 5040/111013 | 0/27833 | 0 |

Members' team records (sums): teammate hits 1895, teammate bullet hits 5550, teammate collisions 85, shots held for the fire lane 15745, reports merged 6038302, drives fenced 1558.
Engine's count of our bullets that hit one of our own members: 2628.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.6% |
| ags.polylunar.Polylunar 1.6 | 288 | 33.1% |
| amz.TeamDeathTeam 1 | 288 | 34.6% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 35.4% |
| **All** | 1152 | 33.9% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.24p4 vs hadur117.HadurTeam 3.24aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 57.2% ± 1.7 | 55.8% ± 1.8 | +1.4 ± 2.7 |
| ags.polylunar.Polylunar 1.6 | 67.0% ± 1.8 | 65.4% ± 2.0 | +1.6 ± 2.6 |
| amz.TeamDeathTeam 1 | 85.4% ± 0.9 | 84.0% ± 0.8 | +1.4 ± 1.2 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 81.4% ± 1.0 | 80.5% ± 0.9 | +0.9 ± 1.6 |
| **All** | 72.7% ± 2.4 | 71.4% ± 2.4 | +1.3 ± 1.0 |

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
| Rounds won | 95.6% ± 1.7 | 95.2% ± 1.8 | +0.3 ± 1.6 |
| Survival | 95.6% ± 1.7 | 95.2% ± 1.8 | +0.3 ± 1.6 |
| In-lane shots | 4.9% ± 0.4 | 5.5% ± 0.4 | -0.7 ± 0.3 |
| Focus fire | 33.9% ± 0.4 | 34.1% ± 0.4 | -0.2 ± 0.4 |
| Bullets on own members | 27.38 ± 1.64 | 25.97 ± 1.41 | +1.4 ± 1.4 |

## Team bench

hadur117.HadurTeam 3.24aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1412 over 96 battles (14.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 55.8% | 242/288 | 84.0% | 0 | 575 | 0 | 865/37030 | 0/5257 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 65.4% | 279/288 | 96.9% | 0 | 252 | 0 | 1599/28837 | 0/6232 | 0 |
| amz.TeamDeathTeam 1 | 24 | 84.0% | 288/288 | 100.0% | 0 | 437 | 0 | 1525/20943 | 0/8190 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 80.5% | 288/288 | 100.0% | 0 | 148 | 0 | 1695/24353 | 0/7874 | 0 |
| **All** | 96 | 71.4% | 1097/1152 | 95.2% | 0 | 1412 | 0 | 5684/111163 | 0/27553 | 0 |

Members' team records (sums): teammate hits 1569, teammate bullet hits 5751, teammate collisions 6, shots held for the fire lane 15695, reports merged 5998558, drives fenced 813.
Engine's count of our bullets that hit one of our own members: 2493.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.8% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.7% |
| amz.TeamDeathTeam 1 | 288 | 34.4% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 36.6% |
| **All** | 1152 | 34.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
