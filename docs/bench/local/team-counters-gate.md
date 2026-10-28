# Team bench

hadur2.HadurTeam 3.18.1mk against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 315 over 32 battles (9.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 82.9% | 158/160 | 98.8% | 0 | 207 | 0 | 89/36589 | 0/4371 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 81.8% | 155/160 | 96.9% | 0 | 108 | 0 | 415/39406 | 0/4286 | 0 |
| **All** | 32 | 82.3% | 313/320 | 97.8% | 0 | 315 | 0 | 504/75995 | 0/8657 | 0 |

Members' team records (sums): teammate hits 1936, teammate bullet hits 8815, teammate collisions 143, shots held for the fire lane 5712, reports merged 3817404, drives fenced 7308.
Engine's count of our bullets that hit one of our own members: 2530.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.3% |
| gh.nano.GrofGroup 1.1 | 160 | 30.6% |
| **All** | 320 | 29.9% |

Data files written (any battle): hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.18.1mk vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 82.9% ± 2.0 | 78.0% ± 2.6 | +4.9 ± 3.6 |
| gh.nano.GrofGroup 1.1 | 81.8% ± 1.5 | 79.2% ± 2.0 | +2.6 ± 2.6 |
| **All** | 82.3% ± 1.2 | 78.6% ± 1.6 | +3.7 ± 2.2 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 97.8% ± 1.5 | 94.4% ± 2.6 | +3.4 ± 3.1 |
| Survival | 97.8% ± 1.5 | 94.4% ± 2.6 | +3.4 ± 3.1 |
| In-lane shots | 0.6% ± 0.2 | 0.6% ± 0.2 | +0.1 ± 0.1 |
| Focus fire | 29.9% ± 0.6 | 30.2% ± 0.6 | -0.3 ± 0.8 |
| Bullets on own members | 79.06 ± 4.48 | 74.81 ± 4.28 | +4.3 ± 5.8 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 329 over 32 battles (10.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| myl.micro.TroodonPack 1.10 | 16 | 78.0% | 149/160 | 93.1% | 0 | 201 | 0 | 67/35732 | 0/4141 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 79.2% | 153/160 | 95.6% | 0 | 128 | 0 | 391/39856 | 0/4159 | 0 |
| **All** | 32 | 78.6% | 302/320 | 94.4% | 0 | 329 | 0 | 458/75588 | 0/8300 | 0 |

Members' team records (sums): teammate hits 1833, teammate bullet hits 8462, teammate collisions 24, shots held for the fire lane 5414, reports merged 3728071, drives fenced 5037.
Engine's count of our bullets that hit one of our own members: 2394.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| myl.micro.TroodonPack 1.10 | 160 | 29.8% |
| gh.nano.GrofGroup 1.1 | 160 | 30.6% |
| **All** | 320 | 30.2% |

Data files written (any battle): hadur2\Hadur.data\health.hc
