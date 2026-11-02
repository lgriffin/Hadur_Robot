# Team bench

hadur117.HadurTeam 3.21mk against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 48 battles (11.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 | 73.0% | 133/160 | 83.1% | 0 | 229 | 0 | 48/38092 | 0/4007 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 81.9% | 156/160 | 97.5% | 0 | 146 | 0 | 175/54609 | 0/4301 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 84.5% | 155/160 | 96.9% | 0 | 164 | 0 | 614/31144 | 0/4382 | 0 |
| **All** | 48 | 79.8% | 444/480 | 92.5% | 0 | 539 | 0 | 837/123845 | 0/12690 | 0 |

Members' team records (sums): teammate hits 2329, teammate bullet hits 14678, teammate collisions 130, shots held for the fire lane 8242, reports merged 5852378, drives fenced 10756.
Engine's count of our bullets that hit one of our own members: 3064.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 160 | 30.6% |
| bvh.team.Valkiries 1.0 | 160 | 32.0% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 31.1% |
| **All** | 480 | 31.2% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.21mk vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 73.0% ± 2.2 | 70.6% ± 2.4 | +2.4 ± 3.5 |
| bvh.team.Valkiries 1.0 | 81.9% ± 1.8 | 83.5% ± 1.8 | -1.6 ± 2.0 |
| pedersen.ImWithDroidTeam 1.3 | 84.5% ± 1.5 | 86.4% ± 1.9 | -2.0 ± 2.0 |
| **All** | 79.8% ± 1.7 | 80.2% ± 2.3 | -0.4 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 of 16 | 16 of 16 | 16 |
| bvh.team.Valkiries 1.0 | 16 of 16 | 16 of 16 | 16 |
| pedersen.ImWithDroidTeam 1.3 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 92.5% ± 2.6 | 91.9% ± 3.6 | +0.6 ± 2.8 |
| Survival | 92.5% ± 2.6 | 91.9% ± 3.6 | +0.6 ± 2.8 |
| In-lane shots | 0.8% ± 0.2 | 0.8% ± 0.3 | -0.0 ± 0.1 |
| Focus fire | 31.2% ± 0.5 | 31.2% ± 0.5 | +0.1 ± 0.6 |
| Bullets on own members | 63.83 ± 4.68 | 66.96 ± 4.99 | -3.1 ± 4.3 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 478 over 48 battles (10.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 | 70.6% | 126/160 | 78.8% | 0 | 182 | 0 | 58/44702 | 0/4010 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 83.5% | 155/160 | 96.9% | 0 | 145 | 0 | 155/54542 | 0/4396 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 86.4% | 160/160 | 100.0% | 0 | 151 | 0 | 745/35648 | 0/4525 | 0 |
| **All** | 48 | 80.2% | 441/480 | 91.9% | 0 | 478 | 0 | 958/134892 | 0/12931 | 0 |

Members' team records (sums): teammate hits 2481, teammate bullet hits 16516, teammate collisions 175, shots held for the fire lane 8940, reports merged 6343182, drives fenced 15050.
Engine's count of our bullets that hit one of our own members: 3214.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 160 | 30.3% |
| bvh.team.Valkiries 1.0 | 160 | 31.5% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 31.7% |
| **All** | 480 | 31.2% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt
