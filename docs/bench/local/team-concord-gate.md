# Team bench

hadur117.HadurTeam 3.20mk against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 881 over 80 battles (11.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 80 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 59.1% | 89/160 | 55.6% | 0 | 247 | 0 | 124/47586 | 0/3389 | 0 |
| rz.GlowingHawks 0.2 | 16 | 82.5% | 156/160 | 97.5% | 0 | 213 | 0 | 90/51087 | 0/4445 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 81.0% | 156/160 | 97.5% | 0 | 149 | 0 | 52/47709 | 0/4374 | 0 |
| rz.HOFSwarm 1.1 | 16 | 81.2% | 153/160 | 95.6% | 0 | 178 | 0 | 71/48137 | 0/4363 | 0 |
| amz.TeamDeathTeam 1 | 16 | 82.5% | 160/160 | 100.0% | 0 | 94 | 0 | 807/17136 | 0/4484 | 0 |
| **All** | 80 | 77.3% | 714/800 | 89.3% | 0 | 881 | 0 | 1144/211655 | 0/21055 | 0 |

Members' team records (sums): teammate hits 4594, teammate bullet hits 22794, teammate collisions 163, shots held for the fire lane 17125, reports merged 10098171, drives fenced 18974.
Engine's count of our bullets that hit one of our own members: 6070.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 30.3% |
| rz.GlowingHawks 0.2 | 160 | 32.2% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.1% |
| rz.HOFSwarm 1.1 | 160 | 32.8% |
| amz.TeamDeathTeam 1 | 160 | 36.0% |
| **All** | 800 | 32.5% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.20mk vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 59.1% ± 4.5 | 56.4% ± 4.2 | +2.7 ± 7.2 |
| rz.GlowingHawks 0.2 | 82.5% ± 1.5 | 77.2% ± 2.2 | +5.3 ± 2.6 |
| kawigi.micro.ArmyOfShiz 1.1 | 81.0% ± 1.2 | 77.3% ± 2.2 | +3.7 ± 2.0 |
| rz.HOFSwarm 1.1 | 81.2% ± 1.7 | 75.6% ± 2.8 | +5.6 ± 3.6 |
| amz.TeamDeathTeam 1 | 82.5% ± 1.2 | 80.5% ± 0.8 | +2.0 ± 1.4 |
| **All** | 77.3% ± 2.3 | 73.4% ± 2.2 | +3.9 ± 1.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 of 16 | 16 of 16 | 16 |
| rz.GlowingHawks 0.2 | 16 of 16 | 16 of 16 | 16 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| amz.TeamDeathTeam 1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 89.2% ± 4.3 | 81.9% ± 5.0 | +7.4 ± 3.3 |
| Survival | 89.2% ± 4.3 | 81.9% ± 5.0 | +7.4 ± 3.3 |
| In-lane shots | 1.1% ± 0.4 | 1.2% ± 0.5 | -0.1 ± 0.1 |
| Focus fire | 32.5% ± 0.6 | 32.5% ± 0.5 | -0.0 ± 0.6 |
| Bullets on own members | 75.88 ± 3.95 | 62.23 ± 3.32 | +13.7 ± 4.6 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 718 over 80 battles (9.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 80 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 56.4% | 69/160 | 43.1% | 0 | 175 | 0 | 77/39762 | 0/3181 | 0 |
| rz.GlowingHawks 0.2 | 16 | 77.2% | 136/160 | 85.0% | 0 | 172 | 0 | 75/44057 | 0/4114 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 77.3% | 149/160 | 93.1% | 0 | 136 | 0 | 64/40930 | 0/4106 | 0 |
| rz.HOFSwarm 1.1 | 16 | 75.6% | 141/160 | 88.1% | 0 | 147 | 0 | 98/41815 | 0/4031 | 0 |
| amz.TeamDeathTeam 1 | 16 | 80.5% | 160/160 | 100.0% | 0 | 88 | 0 | 857/16552 | 0/4383 | 0 |
| **All** | 80 | 73.4% | 655/800 | 81.9% | 0 | 718 | 0 | 1171/183116 | 0/19815 | 0 |

Members' team records (sums): teammate hits 3746, teammate bullet hits 17853, teammate collisions 155, shots held for the fire lane 14238, reports merged 9015663, drives fenced 14917.
Engine's count of our bullets that hit one of our own members: 4978.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.2% |
| rz.GlowingHawks 0.2 | 160 | 31.8% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.6% |
| rz.HOFSwarm 1.1 | 160 | 33.0% |
| amz.TeamDeathTeam 1 | 160 | 35.1% |
| **All** | 800 | 32.5% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur117\Hadur.data\health.hc
