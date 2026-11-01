# Team bench

hadur117.HadurTeam 3.20bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1201 over 96 battles (12.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 30.0% | 20/240 | 8.3% | 0 | 342 | 0 | 224/56106 | 0/2928 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 59.1% | 102/240 | 42.5% | 0 | 296 | 0 | 148/74567 | 0/5134 | 0 |
| cb.fire.FirestarterTeam 2.0 | 24 | 49.4% | 48/240 | 20.0% | 0 | 241 | 0 | 97/69404 | 0/4458 | 0 |
| ustimaw.NightmareTeam 3.3 | 24 | 45.6% | 166/240 | 69.2% | 0 | 322 | 0 | 687/36414 | 0/3643 | 0 |
| **All** | 96 | 46.0% | 336/960 | 35.0% | 0 | 1201 | 0 | 1156/236491 | 0/16163 | 0 |

Members' team records (sums): teammate hits 3034, teammate bullet hits 19534, teammate collisions 101, shots held for the fire lane 18250, reports merged 10545784, drives fenced 9785.
Engine's count of our bullets that hit one of our own members: 3668.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 240 | 33.9% |
| mn.CombatTeam 3.25.0 | 240 | 29.1% |
| cb.fire.FirestarterTeam 2.0 | 240 | 31.1% |
| ustimaw.NightmareTeam 3.3 | 240 | 32.9% |
| **All** | 960 | 31.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.20bb vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 30.0% ± 2.6 | 30.7% ± 2.9 | -0.7 ± 3.5 |
| mn.CombatTeam 3.25.0 | 59.1% ± 2.2 | 59.8% ± 2.0 | -0.7 ± 2.7 |
| cb.fire.FirestarterTeam 2.0 | 49.4% ± 2.7 | 48.5% ± 2.3 | +0.8 ± 4.1 |
| ustimaw.NightmareTeam 3.3 | 45.6% ± 1.8 | 42.6% ± 2.2 | +3.0 ± 2.7 |
| **All** | 46.0% ± 2.4 | 45.4% ± 2.4 | +0.6 ± 1.6 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 of 24 | 24 of 24 | 24 |
| mn.CombatTeam 3.25.0 | 24 of 24 | 24 of 24 | 24 |
| cb.fire.FirestarterTeam 2.0 | 24 of 24 | 24 of 24 | 24 |
| ustimaw.NightmareTeam 3.3 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 35.0% ± 5.3 | 34.4% ± 5.2 | +0.6 ± 3.9 |
| Survival | 35.0% ± 5.3 | 34.4% ± 5.2 | +0.6 ± 3.9 |
| In-lane shots | 0.7% ± 0.2 | 0.6% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 31.8% ± 0.6 | 31.6% ± 0.5 | +0.2 ± 0.6 |
| Bullets on own members | 38.21 ± 2.93 | 37.00 ± 2.90 | +1.2 ± 2.6 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1226 over 96 battles (12.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 30.7% | 19/240 | 7.9% | 0 | 371 | 0 | 206/57338 | 0/2978 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 59.8% | 106/240 | 44.2% | 0 | 326 | 0 | 157/75103 | 0/5190 | 0 |
| cb.fire.FirestarterTeam 2.0 | 24 | 48.5% | 49/240 | 20.4% | 0 | 240 | 0 | 77/67122 | 0/4395 | 0 |
| ustimaw.NightmareTeam 3.3 | 24 | 42.6% | 156/240 | 65.0% | 0 | 289 | 0 | 636/36096 | 0/3383 | 0 |
| **All** | 96 | 45.4% | 330/960 | 34.4% | 0 | 1226 | 0 | 1076/235659 | 0/15946 | 0 |

Members' team records (sums): teammate hits 2999, teammate bullet hits 19441, teammate collisions 84, shots held for the fire lane 17807, reports merged 10515623, drives fenced 7720.
Engine's count of our bullets that hit one of our own members: 3552.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 240 | 33.3% |
| mn.CombatTeam 3.25.0 | 240 | 29.1% |
| cb.fire.FirestarterTeam 2.0 | 240 | 30.9% |
| ustimaw.NightmareTeam 3.3 | 240 | 33.0% |
| **All** | 960 | 31.6% |

Data files written (any battle): hadur117\Hadur.data\health.hc
