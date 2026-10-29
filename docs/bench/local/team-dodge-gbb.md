# Team bench

hadur117.HadurTeam 3.19bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 48 battles (9.0 per battle, most in one battle 68). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 | 50.7% | 35/160 | 21.9% | 0 | 119 | 0 | 54/37765 | 0/2974 | 0 |
| rz.HOFSwarm 1.1 | 16 | 66.9% | 113/160 | 70.6% | 0 | 207 | 0 | 78/39539 | 0/3688 | 0 |
| amz.TeamDeathTeam 1 | 16 | 76.3% | 160/160 | 100.0% | 0 | 105 | 0 | 764/16097 | 0/4242 | 0 |
| **All** | 48 | 64.7% | 308/480 | 64.2% | 0 | 431 | 0 | 896/93401 | 0/10904 | 0 |

Members' team records (sums): teammate hits 1570, teammate bullet hits 7268, teammate collisions 116, shots held for the fire lane 7547, reports merged 4603821, drives fenced 4406.
Engine's count of our bullets that hit one of our own members: 2319.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 160 | 31.8% |
| rz.HOFSwarm 1.1 | 160 | 30.9% |
| amz.TeamDeathTeam 1 | 160 | 34.5% |
| **All** | 480 | 32.4% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.19bb vs hadur117.HadurTeam 3.19aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 50.7% ± 2.3 | 49.7% ± 3.4 | +1.0 ± 4.4 |
| rz.HOFSwarm 1.1 | 66.9% ± 3.5 | 66.2% ± 4.0 | +0.7 ± 6.3 |
| amz.TeamDeathTeam 1 | 76.3% ± 1.7 | 76.5% ± 1.3 | -0.1 ± 2.0 |
| **All** | 64.7% ± 3.4 | 64.1% ± 3.6 | +0.5 ± 2.4 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| amz.TeamDeathTeam 1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 64.2% ± 9.9 | 61.9% ± 10.4 | +2.3 ± 4.3 |
| Survival | 64.2% ± 9.9 | 61.9% ± 10.4 | +2.3 ± 4.3 |
| In-lane shots | 1.7% ± 0.7 | 1.4% ± 0.5 | +0.3 ± 0.2 |
| Focus fire | 32.4% ± 0.6 | 32.8% ± 0.6 | -0.4 ± 0.7 |
| Bullets on own members | 48.31 ± 4.12 | 44.06 ± 4.05 | +4.3 ± 4.6 |

## Team bench

hadur117.HadurTeam 3.19aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 415 over 48 battles (8.6 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 16 | 49.7% | 27/160 | 16.9% | 0 | 109 | 0 | 41/38866 | 0/2929 | 0 |
| rz.HOFSwarm 1.1 | 16 | 66.2% | 111/160 | 69.4% | 0 | 139 | 0 | 72/39393 | 0/3657 | 0 |
| amz.TeamDeathTeam 1 | 16 | 76.5% | 159/160 | 99.4% | 0 | 167 | 0 | 629/16109 | 0/4224 | 0 |
| **All** | 48 | 64.1% | 297/480 | 61.9% | 0 | 415 | 0 | 742/94368 | 0/10810 | 0 |

Members' team records (sums): teammate hits 1497, teammate bullet hits 7160, teammate collisions 63, shots held for the fire lane 7501, reports merged 4560751, drives fenced 4766.
Engine's count of our bullets that hit one of our own members: 2115.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cb.fire.FirestarterTeam 2.0 | 160 | 31.6% |
| rz.HOFSwarm 1.1 | 160 | 32.4% |
| amz.TeamDeathTeam 1 | 160 | 34.3% |
| **All** | 480 | 32.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc
