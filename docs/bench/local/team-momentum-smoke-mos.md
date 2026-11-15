# Team bench

hadur117.HadurTeam 3.22mos against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=3052953. Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v470, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 44 over 16 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.CombatTeam 3.25.0 | 2 | 59.1% | 8/20 | 40.0% | 0 | 8 | 0 | 20/4925 | 0/413 | 0 |
| rz.AlephTeam 0.34 | 2 | 51.4% | 4/20 | 20.0% | 0 | 10 | 0 | 12/5282 | 0/386 | 0 |
| ustimaw.NightmareTeam 3.3 | 2 | 53.1% | 15/20 | 75.0% | 0 | 2 | 0 | 42/2969 | 0/354 | 0 |
| florent.XSeries.Xmen 0.9 | 2 | 68.7% | 13/20 | 65.0% | 0 | 5 | 0 | 38/5300 | 0/484 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 2 | 79.6% | 19/20 | 95.0% | 0 | 1 | 0 | 11/4806 | 0/540 | 0 |
| rz.HOFSwarm 1.1 | 2 | 82.1% | 19/20 | 95.0% | 0 | 8 | 0 | 9/5043 | 0/553 | 0 |
| davidalves.PhoenixTeam 0.54 | 2 | 83.4% | 18/20 | 90.0% | 0 | 5 | 0 | 5/5083 | 0/571 | 0 |
| gh.nano.GrofGroup 1.1 | 2 | 85.1% | 19/20 | 95.0% | 0 | 5 | 0 | 87/4876 | 0/574 | 0 |
| **All** | 16 | 70.3% | 115/160 | 71.9% | 0 | 44 | 0 | 224/38284 | 0/3875 | 0 |

Members' team records (sums): teammate hits 756, teammate bullet hits 4954, teammate collisions 0, shots held for the fire lane 2985, reports merged 1950390, drives fenced 28.
Engine's count of our bullets that hit one of our own members: 862.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| mn.CombatTeam 3.25.0 | 20 | 29.7% |
| rz.AlephTeam 0.34 | 20 | 30.6% |
| ustimaw.NightmareTeam 3.3 | 20 | 31.6% |
| florent.XSeries.Xmen 0.9 | 20 | 31.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 20 | 33.8% |
| rz.HOFSwarm 1.1 | 20 | 32.6% |
| davidalves.PhoenixTeam 0.54 | 20 | 32.2% |
| gh.nano.GrofGroup 1.1 | 20 | 30.9% |
| **All** | 160 | 31.6% |

Data files written (any battle): hadur117/Hadur.data/health.hc

## Paired A/B: hadur117.HadurTeam 3.22mos vs hadur117.HadurTeam 3.22bb

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| mn.CombatTeam 3.25.0 | 59.1% ± 108.7 | 57.6% ± 89.7 | +1.5 ± 198.4 |
| rz.AlephTeam 0.34 | 51.4% ± 14.7 | 57.8% ± 64.4 | -6.5 ± 49.7 |
| ustimaw.NightmareTeam 3.3 | 53.1% ± 7.0 | 50.4% ± 57.7 | +2.7 ± 64.7 |
| florent.XSeries.Xmen 0.9 | 68.7% ± 8.3 | 66.7% ± 12.8 | +1.9 ± 4.5 |
| kawigi.micro.ArmyOfShiz 1.1 | 79.6% ± 26.5 | 81.0% ± 21.1 | -1.4 ± 5.4 |
| rz.HOFSwarm 1.1 | 82.1% ± 21.5 | 83.8% ± 11.8 | -1.7 ± 9.7 |
| davidalves.PhoenixTeam 0.54 | 83.4% ± 11.9 | 83.3% ± 11.1 | +0.0 ± 22.9 |
| gh.nano.GrofGroup 1.1 | 85.1% ± 14.8 | 84.5% ± 2.9 | +0.6 ± 17.7 |
| **All** | 70.3% ± 7.5 | 70.6% ± 7.5 | -0.4 ± 3.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| mn.CombatTeam 3.25.0 | 2 of 2 | 2 of 2 | 2 |
| rz.AlephTeam 0.34 | 2 of 2 | 2 of 2 | 2 |
| ustimaw.NightmareTeam 3.3 | 2 of 2 | 2 of 2 | 2 |
| florent.XSeries.Xmen 0.9 | 2 of 2 | 2 of 2 | 2 |
| kawigi.micro.ArmyOfShiz 1.1 | 2 of 2 | 2 of 2 | 2 |
| rz.HOFSwarm 1.1 | 2 of 2 | 2 of 2 | 2 |
| davidalves.PhoenixTeam 0.54 | 2 of 2 | 2 of 2 | 2 |
| gh.nano.GrofGroup 1.1 | 2 of 2 | 2 of 2 | 2 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 71.9% ± 15.1 | 71.9% ± 14.2 | -0.0 ± 6.5 |
| Survival | 71.9% ± 15.1 | 71.9% ± 14.2 | -0.0 ± 6.5 |
| In-lane shots | 0.6% ± 0.4 | 0.6% ± 0.3 | +0.0 ± 0.2 |
| Focus fire | 31.6% ± 1.0 | 32.9% ± 1.0 | -1.3 ± 1.3 |
| Bullets on own members | 53.88 ± 10.41 | 48.81 ± 7.38 | +5.1 ± 6.5 |

## Team bench

hadur117.HadurTeam 3.22bb against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 58 over 16 battles (3.6 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.CombatTeam 3.25.0 | 2 | 57.6% | 6/20 | 30.0% | 0 | 9 | 0 | 10/4765 | 0/411 | 0 |
| rz.AlephTeam 0.34 | 2 | 57.8% | 7/20 | 35.0% | 0 | 10 | 0 | 14/5948 | 0/431 | 0 |
| ustimaw.NightmareTeam 3.3 | 2 | 50.4% | 15/20 | 75.0% | 0 | 6 | 0 | 45/2834 | 0/331 | 0 |
| florent.XSeries.Xmen 0.9 | 2 | 66.7% | 13/20 | 65.0% | 0 | 5 | 0 | 33/5578 | 0/479 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 2 | 81.0% | 18/20 | 90.0% | 0 | 3 | 0 | 12/5098 | 0/548 | 0 |
| rz.HOFSwarm 1.1 | 2 | 83.8% | 19/20 | 95.0% | 0 | 10 | 0 | 11/4444 | 0/559 | 0 |
| davidalves.PhoenixTeam 0.54 | 2 | 83.3% | 18/20 | 90.0% | 0 | 6 | 0 | 13/4399 | 0/563 | 0 |
| gh.nano.GrofGroup 1.1 | 2 | 84.5% | 19/20 | 95.0% | 0 | 9 | 0 | 71/4803 | 0/565 | 0 |
| **All** | 16 | 70.6% | 115/160 | 71.9% | 0 | 58 | 0 | 209/37869 | 0/3887 | 0 |

Members' team records (sums): teammate hits 678, teammate bullet hits 4716, teammate collisions 0, shots held for the fire lane 2967, reports merged 1917038, drives fenced 52.
Engine's count of our bullets that hit one of our own members: 781.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| mn.CombatTeam 3.25.0 | 20 | 32.5% |
| rz.AlephTeam 0.34 | 20 | 31.3% |
| ustimaw.NightmareTeam 3.3 | 20 | 31.1% |
| florent.XSeries.Xmen 0.9 | 20 | 33.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 20 | 33.5% |
| rz.HOFSwarm 1.1 | 20 | 35.1% |
| davidalves.PhoenixTeam 0.54 | 20 | 34.0% |
| gh.nano.GrofGroup 1.1 | 20 | 32.3% |
| **All** | 160 | 32.9% |

Data files written (any battle): hadur117/Hadur.data/health.hc
