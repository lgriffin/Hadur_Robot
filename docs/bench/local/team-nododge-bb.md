# Team bench

hadur117.HadurTeam 3.20bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 865 over 72 battles (12.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 72 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 45.9% | 192/288 | 66.7% | 0 | 511 | 0 | 874/39915 | 0/4318 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 77.0% | 287/288 | 99.7% | 0 | 233 | 0 | 1675/31044 | 0/7498 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 24 | 87.9% | 285/288 | 99.0% | 0 | 121 | 0 | 1036/54452 | 0/8196 | 0 |
| **All** | 72 | 70.2% | 764/864 | 88.4% | 0 | 865 | 0 | 3585/125411 | 0/20012 | 0 |

Members' team records (sums): teammate hits 2164, teammate bullet hits 9721, teammate collisions 48, shots held for the fire lane 9489, reports merged 5518209, drives fenced 4851.
Engine's count of our bullets that hit one of our own members: 3933.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.5% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.8% |
| pedersen.ImWithStupidTeam 1.3 | 288 | 34.1% |
| **All** | 864 | 33.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.20bb vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 45.9% ± 2.0 | 45.1% ± 2.3 | +0.8 ± 3.0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 77.0% ± 1.3 | 77.1% ± 0.9 | -0.1 ± 1.7 |
| pedersen.ImWithStupidTeam 1.3 | 87.9% ± 1.2 | 87.1% ± 1.5 | +0.7 ± 1.8 |
| **All** | 70.2% ± 4.3 | 69.7% ± 4.3 | +0.5 ± 1.2 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 of 24 | 24 of 24 | 24 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 of 24 | 24 of 24 | 24 |
| pedersen.ImWithStupidTeam 1.3 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 88.4% ± 4.0 | 88.1% ± 4.2 | +0.3 ± 2.8 |
| Survival | 88.4% ± 4.0 | 88.1% ± 4.2 | +0.3 ± 2.8 |
| In-lane shots | 3.2% ± 0.4 | 3.1% ± 0.4 | +0.0 ± 0.2 |
| Focus fire | 33.8% ± 0.4 | 34.0% ± 0.4 | -0.1 ± 0.5 |
| Bullets on own members | 54.63 ± 5.21 | 54.44 ± 5.07 | +0.2 ± 3.6 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 753 over 72 battles (10.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 72 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 45.1% | 189/288 | 65.6% | 0 | 419 | 0 | 941/40247 | 0/4249 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 77.1% | 288/288 | 100.0% | 0 | 227 | 0 | 1595/31215 | 0/7523 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 24 | 87.1% | 284/288 | 98.6% | 0 | 107 | 0 | 1024/53420 | 0/8114 | 0 |
| **All** | 72 | 69.7% | 761/864 | 88.1% | 0 | 753 | 0 | 3560/124882 | 0/19886 | 0 |

Members' team records (sums): teammate hits 2095, teammate bullet hits 9448, teammate collisions 34, shots held for the fire lane 9509, reports merged 5472608, drives fenced 4520.
Engine's count of our bullets that hit one of our own members: 3920.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.4% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.7% |
| pedersen.ImWithStupidTeam 1.3 | 288 | 34.8% |
| **All** | 864 | 34.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt
