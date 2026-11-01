# Team bench

hadur117.HadurTeam 3.20xc against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 980 over 96 battles (10.2 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 34.3% | 17/240 | 7.1% | 0 | 246 | 0 | 166/48594 | 0/3178 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 61.5% | 98/240 | 40.8% | 0 | 250 | 0 | 157/65197 | 0/5163 | 0 |
| cb.fire.FirestarterTeam 2.0 | 24 | 52.7% | 51/240 | 21.3% | 0 | 184 | 0 | 66/60989 | 0/4582 | 0 |
| ustimaw.NightmareTeam 3.3 | 24 | 48.4% | 171/240 | 71.3% | 0 | 300 | 0 | 615/34414 | 0/3815 | 0 |
| **All** | 96 | 49.2% | 337/960 | 35.1% | 0 | 980 | 0 | 1004/209194 | 0/16738 | 0 |

Members' team records (sums): teammate hits 2913, teammate bullet hits 17381, teammate collisions 124, shots held for the fire lane 15939, reports merged 9910891, drives fenced 9811.
Engine's count of our bullets that hit one of our own members: 3491.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 240 | 33.8% |
| mn.CombatTeam 3.25.0 | 240 | 28.9% |
| cb.fire.FirestarterTeam 2.0 | 240 | 31.3% |
| ustimaw.NightmareTeam 3.3 | 240 | 33.3% |
| **All** | 960 | 31.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.20xc vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 34.3% ± 2.5 | 30.3% ± 1.9 | +3.9 ± 2.4 |
| mn.CombatTeam 3.25.0 | 61.5% ± 3.0 | 59.3% ± 2.3 | +2.3 ± 3.6 |
| cb.fire.FirestarterTeam 2.0 | 52.7% ± 2.5 | 50.6% ± 1.7 | +2.1 ± 2.6 |
| ustimaw.NightmareTeam 3.3 | 48.4% ± 2.4 | 44.5% ± 2.7 | +3.9 ± 4.1 |
| **All** | 49.2% ± 2.4 | 46.2% ± 2.4 | +3.0 ± 1.6 |

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
| Rounds won | 35.1% ± 5.6 | 35.5% ± 5.4 | -0.4 ± 3.7 |
| Survival | 35.1% ± 5.6 | 35.5% ± 5.4 | -0.4 ± 3.7 |
| In-lane shots | 0.6% ± 0.1 | 0.7% ± 0.2 | -0.0 ± 0.1 |
| Focus fire | 31.8% ± 0.6 | 31.7% ± 0.5 | +0.1 ± 0.5 |
| Bullets on own members | 36.36 ± 2.90 | 36.75 ± 2.58 | -0.4 ± 2.6 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1153 over 96 battles (12.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 96 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 24 | 30.3% | 11/240 | 4.6% | 0 | 320 | 0 | 220/56919 | 0/2955 | 0 |
| mn.CombatTeam 3.25.0 | 24 | 59.3% | 111/240 | 46.3% | 0 | 335 | 0 | 144/73977 | 0/5138 | 0 |
| cb.fire.FirestarterTeam 2.0 | 24 | 50.6% | 56/240 | 23.3% | 0 | 210 | 0 | 70/69717 | 0/4547 | 0 |
| ustimaw.NightmareTeam 3.3 | 24 | 44.5% | 163/240 | 67.9% | 0 | 288 | 0 | 711/36886 | 0/3559 | 0 |
| **All** | 96 | 46.2% | 341/960 | 35.5% | 0 | 1153 | 0 | 1145/237499 | 0/16199 | 0 |

Members' team records (sums): teammate hits 3058, teammate bullet hits 18946, teammate collisions 75, shots held for the fire lane 18087, reports merged 10488409, drives fenced 7799.
Engine's count of our bullets that hit one of our own members: 3528.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 240 | 33.3% |
| mn.CombatTeam 3.25.0 | 240 | 29.3% |
| cb.fire.FirestarterTeam 2.0 | 240 | 30.9% |
| ustimaw.NightmareTeam 3.3 | 240 | 33.2% |
| **All** | 960 | 31.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc
