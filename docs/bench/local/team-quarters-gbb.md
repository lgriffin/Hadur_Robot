# Team bench

hadur117.HadurTeam 3.21bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1510736. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 16 battles (20.1 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 49.3% | 137/192 | 71.4% | 0 | 321 | 0 | 538/27936 | 0/3119 | 0 |
| **All** | 16 | 49.3% | 137/192 | 71.4% | 0 | 321 | 0 | 538/27936 | 0/3119 | 0 |

Members' team records (sums): teammate hits 319, teammate bullet hits 1140, teammate collisions 2, shots held for the fire lane 2177, reports merged 1005801, drives fenced 318.
Engine's count of our bullets that hit one of our own members: 508.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 192 | 32.8% |
| **All** | 192 | 32.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.21bb vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 49.3% ± 2.1 | 47.9% ± 2.1 | +1.4 ± 2.7 |
| **All** | 49.3% ± 2.1 | 47.9% ± 2.1 | +1.4 ± 2.7 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 71.4% ± 7.4 | 68.2% ± 7.3 | +3.1 ± 8.6 |
| Survival | 71.4% ± 7.4 | 68.2% ± 7.3 | +3.1 ± 8.6 |
| In-lane shots | 1.9% ± 0.2 | 2.0% ± 0.3 | -0.1 ± 0.3 |
| Focus fire | 32.8% ± 0.8 | 32.6% ± 0.6 | +0.3 ± 0.8 |
| Bullets on own members | 31.75 ± 3.97 | 30.94 ± 3.17 | +0.8 ± 4.0 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 324 over 16 battles (20.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 16 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 47.9% | 131/192 | 68.2% | 0 | 324 | 0 | 542/27069 | 0/3027 | 0 |
| **All** | 16 | 47.9% | 131/192 | 68.2% | 0 | 324 | 0 | 542/27069 | 0/3027 | 0 |

Members' team records (sums): teammate hits 310, teammate bullet hits 1100, teammate collisions 6, shots held for the fire lane 2103, reports merged 966900, drives fenced 378.
Engine's count of our bullets that hit one of our own members: 495.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 192 | 32.6% |
| **All** | 192 | 32.6% |

Data files written (any battle): hadur117\Hadur.data\health.hc
