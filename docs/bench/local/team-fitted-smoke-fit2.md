# Team bench

hadur117.HadurTeam 3.23fit against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=3485088. Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v470, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 3 | 90.4% | 30/30 | 100.0% | 0 | 12 | 0 | 19/5474 | 0/887 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 3 | 93.9% | 30/30 | 100.0% | 0 | 3 | 0 | 61/3796 | 0/900 | 0 |
| **All** | 6 | 92.2% | 60/60 | 100.0% | 0 | 15 | 0 | 80/9270 | 0/1787 | 0 |

Members' team records (sums): teammate hits 109, teammate bullet hits 1091, teammate collisions 0, shots held for the fire lane 982, reports merged 565322, drives fenced 1.
Engine's count of our bullets that hit one of our own members: 148.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 30 | 31.8% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 30 | 34.5% |
| **All** | 60 | 33.2% |

Data files written (any battle): hadur117/Hadur.data/health.hc

## Paired A/B: hadur117.HadurTeam 3.23fit vs hadur117.HadurTeam 3.23aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 90.4% ± 5.5 | 87.3% ± 10.4 | +3.1 ± 5.1 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 93.9% ± 2.5 | 93.1% ± 2.3 | +0.8 ± 4.7 |
| **All** | 92.2% ± 2.6 | 90.2% ± 4.4 | +1.9 ± 2.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 3 of 3 | 3 of 3 | 3 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 3 of 3 | 3 of 3 | 3 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| Survival | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| In-lane shots | 1.0% ± 0.8 | 0.9% ± 0.8 | +0.1 ± 0.6 |
| Focus fire | 33.2% ± 1.8 | 32.4% ± 1.6 | +0.8 ± 0.7 |
| Bullets on own members | 24.67 ± 6.46 | 23.33 ± 4.49 | +1.3 ± 8.0 |

## Team bench

hadur117.HadurTeam 3.23aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 3 | 87.3% | 30/30 | 100.0% | 0 | 10 | 0 | 20/5767 | 0/859 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 3 | 93.1% | 30/30 | 100.0% | 0 | 4 | 0 | 60/3971 | 0/896 | 0 |
| **All** | 6 | 90.2% | 60/60 | 100.0% | 0 | 14 | 0 | 80/9738 | 0/1755 | 0 |

Members' team records (sums): teammate hits 110, teammate bullet hits 1103, teammate collisions 0, shots held for the fire lane 1051, reports merged 583247, drives fenced 2.
Engine's count of our bullets that hit one of our own members: 140.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 30 | 31.1% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 30 | 33.7% |
| **All** | 60 | 32.4% |

Data files written (any battle): hadur117/Hadur.data/health.hc
