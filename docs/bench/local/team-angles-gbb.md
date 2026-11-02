# Team bench

hadur117.HadurTeam 3.21bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 48 battles (10.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 | 72.1% | 138/160 | 86.3% | 0 | 190 | 0 | 64/44906 | 0/4071 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 82.6% | 158/160 | 98.8% | 0 | 142 | 0 | 128/54004 | 0/4336 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 85.0% | 159/160 | 99.4% | 0 | 157 | 0 | 727/34998 | 0/4457 | 0 |
| **All** | 48 | 79.9% | 455/480 | 94.8% | 0 | 489 | 0 | 919/133908 | 0/12864 | 0 |

Members' team records (sums): teammate hits 2412, teammate bullet hits 16244, teammate collisions 138, shots held for the fire lane 8912, reports merged 6279406, drives fenced 12842.
Engine's count of our bullets that hit one of our own members: 3211.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 160 | 31.2% |
| bvh.team.Valkiries 1.0 | 160 | 32.0% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 31.6% |
| **All** | 480 | 31.6% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.21bb vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 72.1% ± 1.9 | 68.8% ± 2.6 | +3.4 ± 3.4 |
| bvh.team.Valkiries 1.0 | 82.6% ± 1.3 | 83.3% ± 1.3 | -0.7 ± 1.6 |
| pedersen.ImWithDroidTeam 1.3 | 85.0% ± 1.7 | 87.2% ± 1.2 | -2.2 ± 1.9 |
| **All** | 79.9% ± 1.9 | 79.8% ± 2.5 | +0.1 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 of 16 | 16 of 16 | 16 |
| bvh.team.Valkiries 1.0 | 16 of 16 | 16 of 16 | 16 |
| pedersen.ImWithDroidTeam 1.3 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 94.8% ± 2.6 | 92.9% ± 3.5 | +1.9 ± 3.6 |
| Survival | 94.8% ± 2.6 | 92.9% ± 3.5 | +1.9 ± 3.6 |
| In-lane shots | 0.8% ± 0.3 | 0.9% ± 0.3 | -0.0 ± 0.1 |
| Focus fire | 31.6% ± 0.5 | 31.3% ± 0.5 | +0.3 ± 0.8 |
| Bullets on own members | 66.90 ± 4.45 | 68.15 ± 5.67 | -1.3 ± 5.1 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 472 over 48 battles (9.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 48 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 16 | 68.8% | 129/160 | 80.6% | 0 | 198 | 0 | 53/43942 | 0/3917 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 83.3% | 159/160 | 99.4% | 0 | 134 | 0 | 154/54515 | 0/4374 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 87.2% | 158/160 | 98.8% | 0 | 140 | 0 | 753/34894 | 0/4557 | 0 |
| **All** | 48 | 79.8% | 446/480 | 92.9% | 0 | 472 | 0 | 960/133351 | 0/12848 | 0 |

Members' team records (sums): teammate hits 2525, teammate bullet hits 16150, teammate collisions 190, shots held for the fire lane 8803, reports merged 6186712, drives fenced 13990.
Engine's count of our bullets that hit one of our own members: 3271.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cx.mini.DemoniacNimrods 0.50 | 160 | 30.1% |
| bvh.team.Valkiries 1.0 | 160 | 32.1% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 31.9% |
| **All** | 480 | 31.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt
