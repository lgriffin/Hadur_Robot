# Team bench

hadur117.HadurTeam 3.19mk against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 48 battles (7.7 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 | 53.3% | 34/160 | 21.3% | 0 | 112 | 0 | 58/41612 | 0/3071 | 0 |
| rz.HOFSwarm 1.1 | 16 | 72.3% | 130/160 | 81.3% | 0 | 161 | 0 | 81/41506 | 0/3888 | 0 |
| amz.TeamDeathTeam 1 | 16 | 80.4% | 160/160 | 100.0% | 0 | 97 | 0 | 806/16306 | 0/4371 | 0 |
| **All** | 48 | 68.7% | 324/480 | 67.5% | 0 | 370 | 0 | 945/99424 | 0/11330 | 0 |

Members' team records (sums): teammate hits 2158, teammate bullet hits 8267, teammate collisions 71, shots held for the fire lane 7705, reports merged 4760483, drives fenced 5385.
Engine's count of our bullets that hit one of our own members: 2957.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 160 | 30.8% |
| rz.HOFSwarm 1.1 | 160 | 32.4% |
| amz.TeamDeathTeam 1 | 160 | 35.4% |
| **All** | 480 | 32.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.19mk vs hadur117.HadurTeam 3.19aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 53.3% ± 3.4 | 51.4% ± 2.6 | +2.0 ± 3.3 |
| rz.HOFSwarm 1.1 | 72.3% ± 2.6 | 65.7% ± 4.0 | +6.6 ± 5.6 |
| amz.TeamDeathTeam 1 | 80.4% ± 1.4 | 77.1% ± 1.8 | +3.3 ± 2.4 |
| **All** | 68.7% ± 3.6 | 64.7% ± 3.5 | +4.0 ± 2.2 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| amz.TeamDeathTeam 1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 67.5% ± 10.3 | 63.8% ± 9.9 | +3.8 ± 5.0 |
| Survival | 67.5% ± 10.3 | 63.8% ± 9.9 | +3.8 ± 5.0 |
| In-lane shots | 1.8% ± 0.7 | 1.6% ± 0.6 | +0.1 ± 0.3 |
| Focus fire | 32.8% ± 0.8 | 32.3% ± 0.7 | +0.5 ± 0.8 |
| Bullets on own members | 61.60 ± 4.35 | 48.63 ± 3.91 | +13.0 ± 4.5 |

## Team bench

hadur117.HadurTeam 3.19aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 357 over 48 battles (7.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 | 51.4% | 37/160 | 23.1% | 0 | 95 | 0 | 59/39431 | 0/2971 | 0 |
| rz.HOFSwarm 1.1 | 16 | 65.7% | 109/160 | 68.1% | 0 | 152 | 0 | 66/39656 | 0/3627 | 0 |
| amz.TeamDeathTeam 1 | 16 | 77.1% | 160/160 | 100.0% | 0 | 110 | 0 | 742/16374 | 0/4289 | 0 |
| **All** | 48 | 64.7% | 306/480 | 63.7% | 0 | 357 | 0 | 867/95461 | 0/10887 | 0 |

Members' team records (sums): teammate hits 1609, teammate bullet hits 7781, teammate collisions 93, shots held for the fire lane 7453, reports merged 4593828, drives fenced 5043.
Engine's count of our bullets that hit one of our own members: 2334.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 160 | 30.9% |
| rz.HOFSwarm 1.1 | 160 | 31.6% |
| amz.TeamDeathTeam 1 | 160 | 34.4% |
| **All** | 480 | 32.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc
