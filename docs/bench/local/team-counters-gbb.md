# Team bench

hadur2.HadurTeam 3.18.1bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 335 over 32 battles (10.5 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 79.4% | 154/160 | 96.3% | 0 | 207 | 0 | 72/35814 | 0/4200 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.0% | 155/160 | 96.9% | 0 | 128 | 0 | 357/39059 | 0/4195 | 0 |
| **All** | 32 | 79.7% | 309/320 | 96.6% | 0 | 335 | 0 | 429/74873 | 0/8395 | 0 |

Members' team records (sums): teammate hits 1734, teammate bullet hits 8108, teammate collisions 38, shots held for the fire lane 5260, reports merged 3683620, drives fenced 5717.
Engine's count of our bullets that hit one of our own members: 2214.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 30.2% |
| gh.nano.GrofGroup 1.1 | 160 | 30.4% |
| **All** | 320 | 30.3% |

Data files written (any battle): hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.18.1bb vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 79.4% ± 1.8 | 78.9% ± 1.8 | +0.5 ± 2.6 |
| gh.nano.GrofGroup 1.1 | 80.0% ± 2.2 | 79.7% ± 1.7 | +0.2 ± 2.9 |
| **All** | 79.7% ± 1.3 | 79.3% ± 1.2 | +0.3 ± 1.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 96.6% ± 2.0 | 94.1% ± 2.9 | +2.5 ± 3.4 |
| Survival | 96.6% ± 2.0 | 94.1% ± 2.9 | +2.5 ± 3.4 |
| In-lane shots | 0.6% ± 0.1 | 0.6% ± 0.2 | -0.0 ± 0.1 |
| Focus fire | 30.3% ± 0.5 | 30.3% ± 0.4 | +0.0 ± 0.7 |
| Bullets on own members | 69.19 ± 5.44 | 72.63 ± 4.50 | -3.4 ± 7.3 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 324 over 32 battles (10.1 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 78.9% | 149/160 | 93.1% | 0 | 209 | 0 | 64/37332 | 0/4186 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 79.7% | 152/160 | 95.0% | 0 | 115 | 0 | 397/39448 | 0/4191 | 0 |
| **All** | 32 | 79.3% | 301/320 | 94.1% | 0 | 324 | 0 | 461/76780 | 0/8377 | 0 |

Members' team records (sums): teammate hits 1841, teammate bullet hits 8501, teammate collisions 38, shots held for the fire lane 5629, reports merged 3785668, drives fenced 6504.
Engine's count of our bullets that hit one of our own members: 2324.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.7% |
| gh.nano.GrofGroup 1.1 | 160 | 30.8% |
| **All** | 320 | 30.3% |

Data files written (any battle): hadur2\Hadur.data\health.hc
