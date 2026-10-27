# Team bench

hadur2.HadurTeam 3.17.1bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 760 over 84 battles (9.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 84 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 31.2% | 7/120 | 5.8% | 0 | 57 | 0 | 75/23782 | 0/1469 | 0 |
| abc.ShadowTeam 3.83 | 12 | 52.9% | 46/120 | 38.3% | 0 | 108 | 0 | 62/28292 | 0/2261 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 57.5% | 58/120 | 48.3% | 0 | 104 | 0 | 119/27276 | 22/2466 | 0 |
| gh.mini.GrubbmGroup 0.4 | 12 | 82.7% | 113/120 | 94.2% | 0 | 142 | 0 | 281/32542 | 0/3214 | 0 |
| gh.nano.GrofGroup 1.1 | 12 | 79.2% | 112/120 | 93.3% | 0 | 106 | 0 | 293/29204 | 0/3130 | 0 |
| jab.Enjambre 3 | 12 | 87.7% | 120/120 | 100.0% | 0 | 83 | 0 | 495/24549 | 0/3462 | 0 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 | 90.9% | 119/120 | 99.2% | 0 | 160 | 0 | 169/30066 | 0/3478 | 0 |
| **All** | 84 | 68.9% | 575/840 | 68.5% | 0 | 760 | 0 | 1494/195711 | 22/19480 | 0 |

Members' team records (sums): teammate hits 4775, teammate bullet hits 22078, teammate collisions 311, shots held for the fire lane 15206, reports merged 9648866, drives fenced 16695.
Engine's count of our bullets that hit one of our own members: 6069.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 33.3% |
| abc.ShadowTeam 3.83 | 120 | 31.3% |
| florent.XSeries.Xmen 0.9 | 120 | 31.0% |
| gh.mini.GrubbmGroup 0.4 | 120 | 29.3% |
| gh.nano.GrofGroup 1.1 | 120 | 30.9% |
| jab.Enjambre 3 | 120 | 25.2% |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 120 | 33.8% |
| **All** | 840 | 30.7% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.17.1bb vs hadur2.HadurTeam 3.17.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 31.2% ± 3.3 | 32.6% ± 3.9 | -1.4 ± 6.7 |
| abc.ShadowTeam 3.83 | 52.9% ± 4.0 | 49.4% ± 4.1 | +3.5 ± 4.7 |
| florent.XSeries.Xmen 0.9 | 57.5% ± 3.2 | 58.9% ± 2.6 | -1.4 ± 3.8 |
| gh.mini.GrubbmGroup 0.4 | 82.7% ± 1.5 | 81.4% ± 2.6 | +1.4 ± 2.7 |
| gh.nano.GrofGroup 1.1 | 79.2% ± 2.7 | 79.6% ± 4.1 | -0.4 ± 2.7 |
| jab.Enjambre 3 | 87.7% ± 1.4 | 87.9% ± 1.4 | -0.2 ± 2.3 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 90.9% ± 0.9 | 92.0% ± 0.9 | -1.1 ± 1.4 |
| **All** | 68.9% ± 4.6 | 68.8% ± 4.6 | +0.1 ± 1.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 of 12 | 12 of 12 | 12 |
| abc.ShadowTeam 3.83 | 12 of 12 | 12 of 12 | 12 |
| florent.XSeries.Xmen 0.9 | 12 of 12 | 12 of 12 | 12 |
| gh.mini.GrubbmGroup 0.4 | 12 of 12 | 12 of 12 | 12 |
| gh.nano.GrofGroup 1.1 | 12 of 12 | 12 of 12 | 12 |
| jab.Enjambre 3 | 12 of 12 | 12 of 12 | 12 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 of 12 | 12 of 12 | 12 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 68.5% ± 7.8 | 68.9% ± 8.0 | -0.5 ± 2.7 |
| Survival | 68.5% ± 7.8 | 68.9% ± 8.0 | -0.5 ± 2.7 |
| In-lane shots | 0.8% ± 0.1 | 0.7% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 30.7% ± 0.7 | 30.8% ± 0.8 | -0.1 ± 0.5 |
| Bullets on own members | 72.25 ± 5.05 | 69.99 ± 5.26 | +2.3 ± 3.6 |

## Team bench

hadur2.HadurTeam 3.17.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 733 over 84 battles (8.7 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 84 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 32.6% | 7/120 | 5.8% | 0 | 59 | 0 | 94/23503 | 0/1524 | 0 |
| abc.ShadowTeam 3.83 | 12 | 49.4% | 36/120 | 30.0% | 0 | 100 | 0 | 57/28125 | 0/2137 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 58.9% | 68/120 | 56.7% | 0 | 94 | 0 | 123/27599 | 25/2485 | 0 |
| gh.mini.GrubbmGroup 0.4 | 12 | 81.4% | 114/120 | 95.0% | 0 | 144 | 0 | 223/31954 | 0/3162 | 0 |
| gh.nano.GrofGroup 1.1 | 12 | 79.6% | 114/120 | 95.0% | 0 | 101 | 0 | 290/29390 | 0/3141 | 0 |
| jab.Enjambre 3 | 12 | 87.9% | 120/120 | 100.0% | 0 | 76 | 0 | 472/24512 | 0/3465 | 0 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 | 92.0% | 120/120 | 100.0% | 0 | 159 | 0 | 156/28289 | 0/3511 | 0 |
| **All** | 84 | 68.8% | 579/840 | 68.9% | 0 | 733 | 0 | 1415/193372 | 25/19425 | 0 |

Members' team records (sums): teammate hits 4759, teammate bullet hits 21420, teammate collisions 138, shots held for the fire lane 14619, reports merged 9457909, drives fenced 17152.
Engine's count of our bullets that hit one of our own members: 5879.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 35.3% |
| abc.ShadowTeam 3.83 | 120 | 31.1% |
| florent.XSeries.Xmen 0.9 | 120 | 30.5% |
| gh.mini.GrubbmGroup 0.4 | 120 | 29.5% |
| gh.nano.GrofGroup 1.1 | 120 | 30.6% |
| jab.Enjambre 3 | 120 | 25.3% |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 120 | 33.4% |
| **All** | 840 | 30.8% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc
