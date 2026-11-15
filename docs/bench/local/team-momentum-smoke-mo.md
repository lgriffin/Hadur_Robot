# Team bench

hadur117.HadurTeam 3.22mo against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=3293219. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v470, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 119 over 16 battles (7.4 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.CombatTeam 3.25.0 | 2 | 53.8% | 5/20 | 25.0% | 0 | 50 | 0 | 25/4739 | 0/386 | 0 |
| rz.AlephTeam 0.34 | 2 | 60.2% | 7/20 | 35.0% | 0 | 14 | 0 | 13/6510 | 0/447 | 0 |
| ustimaw.NightmareTeam 3.3 | 2 | 53.3% | 15/20 | 75.0% | 0 | 6 | 0 | 57/2887 | 0/351 | 0 |
| florent.XSeries.Xmen 0.9 | 2 | 62.9% | 14/20 | 70.0% | 0 | 9 | 0 | 36/4963 | 0/444 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 2 | 81.9% | 20/20 | 100.0% | 0 | 10 | 0 | 18/4753 | 0/553 | 0 |
| rz.HOFSwarm 1.1 | 2 | 83.4% | 19/20 | 95.0% | 0 | 10 | 0 | 13/5040 | 0/557 | 0 |
| davidalves.PhoenixTeam 0.54 | 2 | 82.9% | 19/20 | 95.0% | 0 | 14 | 0 | 11/4452 | 0/553 | 0 |
| gh.nano.GrofGroup 1.1 | 2 | 85.5% | 19/20 | 95.0% | 0 | 6 | 0 | 79/4342 | 0/561 | 0 |
| **All** | 16 | 70.5% | 118/160 | 73.8% | 0 | 119 | 0 | 252/37686 | 0/3852 | 0 |

Members' team records (sums): teammate hits 503, teammate bullet hits 4826, teammate collisions 0, shots held for the fire lane 3004, reports merged 1921475, drives fenced 38.
Engine's count of our bullets that hit one of our own members: 597.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| mn.CombatTeam 3.25.0 | 20 | 30.8% |
| rz.AlephTeam 0.34 | 20 | 29.2% |
| ustimaw.NightmareTeam 3.3 | 20 | 34.2% |
| florent.XSeries.Xmen 0.9 | 20 | 35.2% |
| kawigi.micro.ArmyOfShiz 1.1 | 20 | 33.8% |
| rz.HOFSwarm 1.1 | 20 | 33.1% |
| davidalves.PhoenixTeam 0.54 | 20 | 31.6% |
| gh.nano.GrofGroup 1.1 | 20 | 31.5% |
| **All** | 160 | 32.4% |

Data files written (any battle): hadur117/Hadur.data/health.hc

## Paired A/B: hadur117.HadurTeam 3.22mo vs hadur117.HadurTeam 3.22aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| mn.CombatTeam 3.25.0 | 53.8% ± 6.2 | 62.4% ± 75.4 | -8.7 ± 81.6 |
| rz.AlephTeam 0.34 | 60.2% ± 9.9 | 58.7% ± 77.7 | +1.5 ± 67.8 |
| ustimaw.NightmareTeam 3.3 | 53.3% ± 0.1 | 50.5% ± 40.9 | +2.8 ± 41.0 |
| florent.XSeries.Xmen 0.9 | 62.9% ± 25.8 | 64.6% ± 102.6 | -1.7 ± 76.9 |
| kawigi.micro.ArmyOfShiz 1.1 | 81.9% ± 1.1 | 84.6% ± 0.1 | -2.6 ± 1.3 |
| rz.HOFSwarm 1.1 | 83.4% ± 30.0 | 81.9% ± 26.7 | +1.5 ± 56.7 |
| davidalves.PhoenixTeam 0.54 | 82.9% ± 37.0 | 80.6% ± 22.7 | +2.3 ± 14.3 |
| gh.nano.GrofGroup 1.1 | 85.5% ± 3.4 | 87.8% ± 6.7 | -2.2 ± 3.4 |
| **All** | 70.5% ± 7.4 | 71.4% ± 7.6 | -0.9 ± 3.0 |

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
| Rounds won | 73.8% ± 15.2 | 75.0% ± 14.9 | -1.3 ± 5.8 |
| Survival | 73.8% ± 15.2 | 75.0% ± 14.9 | -1.3 ± 5.8 |
| In-lane shots | 0.8% ± 0.4 | 0.7% ± 0.4 | +0.1 ± 0.1 |
| Focus fire | 32.4% ± 1.1 | 32.6% ± 0.8 | -0.1 ± 1.3 |
| Bullets on own members | 37.31 ± 6.99 | 50.88 ± 7.35 | -13.6 ± 5.7 |

## Team bench

hadur117.HadurTeam 3.22aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 67 over 16 battles (4.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.CombatTeam 3.25.0 | 2 | 62.4% | 8/20 | 40.0% | 0 | 18 | 0 | 22/4656 | 0/439 | 0 |
| rz.AlephTeam 0.34 | 2 | 58.7% | 6/20 | 30.0% | 0 | 12 | 0 | 11/5638 | 0/435 | 0 |
| ustimaw.NightmareTeam 3.3 | 2 | 50.5% | 15/20 | 75.0% | 0 | 4 | 0 | 49/2966 | 0/326 | 0 |
| florent.XSeries.Xmen 0.9 | 2 | 64.6% | 13/20 | 65.0% | 0 | 9 | 0 | 35/4970 | 0/457 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 2 | 84.6% | 19/20 | 95.0% | 0 | 9 | 0 | 10/5379 | 0/572 | 0 |
| rz.HOFSwarm 1.1 | 2 | 81.9% | 19/20 | 95.0% | 0 | 9 | 0 | 13/5014 | 0/553 | 0 |
| davidalves.PhoenixTeam 0.54 | 2 | 80.6% | 20/20 | 100.0% | 0 | 3 | 0 | 13/4606 | 0/546 | 0 |
| gh.nano.GrofGroup 1.1 | 2 | 87.8% | 20/20 | 100.0% | 0 | 3 | 0 | 80/4187 | 0/579 | 0 |
| **All** | 16 | 71.4% | 120/160 | 75.0% | 0 | 67 | 0 | 233/37416 | 0/3907 | 0 |

Members' team records (sums): teammate hits 713, teammate bullet hits 4489, teammate collisions 0, shots held for the fire lane 3105, reports merged 1911976, drives fenced 25.
Engine's count of our bullets that hit one of our own members: 814.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| mn.CombatTeam 3.25.0 | 20 | 32.4% |
| rz.AlephTeam 0.34 | 20 | 32.4% |
| ustimaw.NightmareTeam 3.3 | 20 | 33.4% |
| florent.XSeries.Xmen 0.9 | 20 | 32.4% |
| kawigi.micro.ArmyOfShiz 1.1 | 20 | 33.4% |
| rz.HOFSwarm 1.1 | 20 | 32.2% |
| davidalves.PhoenixTeam 0.54 | 20 | 31.6% |
| gh.nano.GrofGroup 1.1 | 20 | 32.8% |
| **All** | 160 | 32.6% |

Data files written (any battle): hadur117/Hadur.data/health.hc
