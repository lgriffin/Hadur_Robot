# Team bench

hadur2.HadurTeam 3.15rm against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=4548574. Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v153, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 12 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| amz.TeamDeathTeam 1 | 4 | 59.9% | 36/40 | 90.0% | 0 | 5 | 0 | 6/2935 | 0/878 | 0 |
| jab.Enjambre 3 | 4 | 75.2% | 40/40 | 100.0% | 0 | 7 | 0 | 13/6396 | 0/1041 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 4 | 63.3% | 39/40 | 97.5% | 0 | 9 | 0 | 4/3369 | 0/906 | 0 |
| **All** | 12 | 66.1% | 115/120 | 95.8% | 0 | 21 | 0 | 23/12700 | 0/2825 | 0 |

Members' team records (sums): teammate hits 144, teammate bullet hits 675, teammate collisions 16, shots held for the fire lane 6025, reports merged 839808, drives fenced 2106.
Engine's count of our bullets that hit one of our own members: 200.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| amz.TeamDeathTeam 1 | 40 | 37.5% |
| jab.Enjambre 3 | 40 | 24.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 40 | 34.5% |
| **All** | 120 | 32.2% |

Data files written (any battle): hadur2/Hadur.data/health.hc

## Paired A/B: hadur2.HadurTeam 3.15rm vs hadur2.HadurTeam 3.15aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| amz.TeamDeathTeam 1 | 59.9% ± 9.2 | 40.0% ± 6.9 | +19.9 ± 13.9 |
| jab.Enjambre 3 | 75.2% ± 6.4 | 57.8% ± 10.5 | +17.4 ± 6.2 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 63.3% ± 1.8 | 53.5% ± 6.4 | +9.8 ± 6.3 |
| **All** | 66.1% ± 5.0 | 50.4% ± 5.8 | +15.7 ± 4.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| amz.TeamDeathTeam 1 | 4 of 4 | 4 of 4 | 4 |
| jab.Enjambre 3 | 4 of 4 | 4 of 4 | 4 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 4 of 4 | 4 of 4 | 4 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 95.8% ± 4.2 | 70.0% ± 13.8 | +25.8 ± 10.7 |
| Survival | 95.8% ± 4.2 | 70.0% ± 13.8 | +25.8 ± 10.7 |
| In-lane shots | 0.2% ± 0.1 | 0.1% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 32.2% ± 3.9 | 32.5% ± 3.4 | -0.2 ± 2.3 |
| Bullets on own members | 16.67 ± 4.44 | 17.42 ± 3.43 | -0.8 ± 5.1 |

## Team bench

hadur2.HadurTeam 3.15aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 36 over 12 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 12 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| amz.TeamDeathTeam 1 | 4 | 40.0% | 19/40 | 47.5% | 0 | 6 | 0 | 4/2303 | 0/626 | 0 |
| jab.Enjambre 3 | 4 | 57.8% | 36/40 | 90.0% | 0 | 14 | 0 | 4/5741 | 0/788 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 4 | 53.5% | 29/40 | 72.5% | 0 | 16 | 0 | 5/3209 | 0/787 | 0 |
| **All** | 12 | 50.4% | 84/120 | 70.0% | 0 | 36 | 0 | 13/11253 | 0/2201 | 0 |

Members' team records (sums): teammate hits 150, teammate bullet hits 386, teammate collisions 26, shots held for the fire lane 6833, reports merged 730887, drives fenced 591.
Engine's count of our bullets that hit one of our own members: 209.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| amz.TeamDeathTeam 1 | 40 | 34.6% |
| jab.Enjambre 3 | 40 | 26.0% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 40 | 36.8% |
| **All** | 120 | 32.5% |

Data files written (any battle): hadur2/Hadur.data/health.hc
