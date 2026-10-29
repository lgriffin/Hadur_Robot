# Team bench

hadur117.HadurTeam 3.19dg against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=4536291. Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 36 battles (7.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 36 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 | 31.1% | 1/40 | 2.5% | 0 | 60 | 0 | 35/8015 | 0/487 | 0 |
| mn.CombatTeam 3.25.0 | 4 | 58.3% | 16/40 | 40.0% | 0 | 25 | 0 | 15/10700 | 0/821 | 0 |
| cb.fire.FirestarterTeam 2.0 | 4 | 48.9% | 9/40 | 22.5% | 0 | 19 | 0 | 8/9254 | 0/714 | 0 |
| abc.ShadowTeam 3.83 | 4 | 55.6% | 17/40 | 42.5% | 0 | 29 | 0 | 29/10406 | 0/785 | 0 |
| rz.AlephTeam 0.34 | 4 | 55.0% | 12/40 | 30.0% | 0 | 28 | 0 | 30/9964 | 0/800 | 0 |
| ustimaw.NightmareTeam 3.3 | 4 | 45.8% | 29/40 | 72.5% | 0 | 21 | 0 | 125/5532 | 0/594 | 0 |
| florent.XSeries.Xmen 0.9 | 4 | 57.3% | 19/40 | 47.5% | 0 | 42 | 0 | 43/8972 | 0/810 | 0 |
| ags.polylunar.Polylunar 1.6 | 4 | 58.6% | 36/40 | 90.0% | 0 | 16 | 0 | 240/4451 | 0/777 | 0 |
| rz.HOFSwarm 1.1 | 4 | 78.4% | 38/40 | 95.0% | 0 | 18 | 0 | 19/10396 | 0/1043 | 0 |
| **All** | 36 | 54.3% | 177/360 | 49.2% | 0 | 258 | 0 | 544/77690 | 0/6831 | 0 |

Members' team records (sums): teammate hits 1377, teammate bullet hits 6941, teammate collisions 34, shots held for the fire lane 6005, reports merged 3661848, drives fenced 3437.
Engine's count of our bullets that hit one of our own members: 1709.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 40 | 33.6% |
| mn.CombatTeam 3.25.0 | 40 | 29.9% |
| cb.fire.FirestarterTeam 2.0 | 40 | 34.5% |
| abc.ShadowTeam 3.83 | 40 | 30.3% |
| rz.AlephTeam 0.34 | 40 | 30.5% |
| ustimaw.NightmareTeam 3.3 | 40 | 33.2% |
| florent.XSeries.Xmen 0.9 | 40 | 31.2% |
| ags.polylunar.Polylunar 1.6 | 40 | 31.9% |
| rz.HOFSwarm 1.1 | 40 | 32.3% |
| **All** | 360 | 31.9% |

Data files written (any battle): abc/Shadow.data/Shadow.properties, hadur117/Hadur.data/health.hc

## Paired A/B: hadur117.HadurTeam 3.19dg vs hadur117.HadurTeam 3.19aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 31.1% ± 5.8 | 29.9% ± 8.0 | +1.2 ± 7.8 |
| mn.CombatTeam 3.25.0 | 58.3% ± 2.0 | 59.4% ± 10.3 | -1.1 ± 8.7 |
| cb.fire.FirestarterTeam 2.0 | 48.9% ± 2.9 | 49.7% ± 10.3 | -0.8 ± 10.8 |
| abc.ShadowTeam 3.83 | 55.6% ± 19.2 | 51.5% ± 15.1 | +4.0 ± 28.9 |
| rz.AlephTeam 0.34 | 55.0% ± 7.6 | 54.0% ± 15.3 | +1.0 ± 21.0 |
| ustimaw.NightmareTeam 3.3 | 45.8% ± 3.6 | 54.9% ± 3.7 | -9.2 ± 2.0 |
| florent.XSeries.Xmen 0.9 | 57.3% ± 10.2 | 62.1% ± 6.6 | -4.7 ± 12.9 |
| ags.polylunar.Polylunar 1.6 | 58.6% ± 2.9 | 55.3% ± 8.7 | +3.3 ± 6.5 |
| rz.HOFSwarm 1.1 | 78.4% ± 7.1 | 69.9% ± 11.3 | +8.5 ± 15.6 |
| **All** | 54.3% ± 4.4 | 54.1% ± 4.0 | +0.2 ± 3.2 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 of 4 | 4 of 4 | 4 |
| mn.CombatTeam 3.25.0 | 4 of 4 | 4 of 4 | 4 |
| cb.fire.FirestarterTeam 2.0 | 4 of 4 | 4 of 4 | 4 |
| abc.ShadowTeam 3.83 | 4 of 4 | 4 of 4 | 4 |
| rz.AlephTeam 0.34 | 4 of 4 | 4 of 4 | 4 |
| ustimaw.NightmareTeam 3.3 | 4 of 4 | 4 of 4 | 4 |
| florent.XSeries.Xmen 0.9 | 4 of 4 | 4 of 4 | 4 |
| ags.polylunar.Polylunar 1.6 | 4 of 4 | 4 of 4 | 4 |
| rz.HOFSwarm 1.1 | 4 of 4 | 4 of 4 | 4 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 49.2% ± 11.0 | 48.3% ± 11.2 | +0.8 ± 7.2 |
| Survival | 49.2% ± 11.0 | 48.3% ± 11.2 | +0.8 ± 7.2 |
| In-lane shots | 1.1% ± 0.6 | 0.9% ± 0.5 | +0.2 ± 0.2 |
| Focus fire | 31.9% ± 0.7 | 31.6% ± 0.9 | +0.3 ± 1.1 |
| Bullets on own members | 47.47 ± 5.58 | 50.17 ± 4.40 | -2.7 ± 5.9 |

## Team bench

hadur117.HadurTeam 3.19aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 181 over 36 battles (5.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 36 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 4 | 29.9% | 2/40 | 5.0% | 0 | 36 | 0 | 33/7489 | 0/468 | 0 |
| mn.CombatTeam 3.25.0 | 4 | 59.4% | 15/40 | 37.5% | 0 | 8 | 0 | 17/10643 | 0/844 | 0 |
| cb.fire.FirestarterTeam 2.0 | 4 | 49.7% | 4/40 | 10.0% | 0 | 15 | 0 | 14/9631 | 0/730 | 0 |
| abc.ShadowTeam 3.83 | 4 | 51.5% | 12/40 | 30.0% | 0 | 25 | 0 | 18/9499 | 0/739 | 0 |
| rz.AlephTeam 0.34 | 4 | 54.0% | 14/40 | 35.0% | 0 | 23 | 0 | 11/9481 | 0/779 | 0 |
| ustimaw.NightmareTeam 3.3 | 4 | 54.9% | 34/40 | 85.0% | 0 | 19 | 0 | 107/6071 | 0/722 | 0 |
| florent.XSeries.Xmen 0.9 | 4 | 62.1% | 26/40 | 65.0% | 0 | 23 | 0 | 38/9454 | 0/866 | 0 |
| ags.polylunar.Polylunar 1.6 | 4 | 55.3% | 33/40 | 82.5% | 0 | 8 | 0 | 184/4246 | 0/735 | 0 |
| rz.HOFSwarm 1.1 | 4 | 69.9% | 34/40 | 85.0% | 0 | 24 | 0 | 14/9897 | 0/949 | 0 |
| **All** | 36 | 54.1% | 174/360 | 48.3% | 0 | 181 | 0 | 436/76411 | 0/6832 | 0 |

Members' team records (sums): teammate hits 1493, teammate bullet hits 6330, teammate collisions 110, shots held for the fire lane 5623, reports merged 3585272, drives fenced 3104.
Engine's count of our bullets that hit one of our own members: 1806.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 40 | 34.4% |
| mn.CombatTeam 3.25.0 | 40 | 30.5% |
| cb.fire.FirestarterTeam 2.0 | 40 | 29.5% |
| abc.ShadowTeam 3.83 | 40 | 29.8% |
| rz.AlephTeam 0.34 | 40 | 33.7% |
| ustimaw.NightmareTeam 3.3 | 40 | 33.3% |
| florent.XSeries.Xmen 0.9 | 40 | 31.0% |
| ags.polylunar.Polylunar 1.6 | 40 | 31.2% |
| rz.HOFSwarm 1.1 | 40 | 31.2% |
| **All** | 360 | 31.6% |

Data files written (any battle): hadur117/Hadur.data/health.hc
