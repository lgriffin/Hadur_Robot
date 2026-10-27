# Team bench

hadur2.HadurTeam 3.17.1mt against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 743 over 84 battles (8.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 84 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 33.3% | 6/120 | 5.0% | 0 | 54 | 0 | 71/23841 | 0/1558 | 0 |
| abc.ShadowTeam 3.83 | 12 | 53.5% | 43/120 | 35.8% | 0 | 109 | 0 | 68/28449 | 0/2286 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 59.6% | 70/120 | 58.3% | 0 | 87 | 0 | 121/28595 | 25/2518 | 0 |
| gh.mini.GrubbmGroup 0.4 | 12 | 81.1% | 115/120 | 95.8% | 0 | 156 | 0 | 233/31845 | 0/3145 | 0 |
| gh.nano.GrofGroup 1.1 | 12 | 80.2% | 112/120 | 93.3% | 0 | 97 | 0 | 297/30069 | 0/3174 | 0 |
| jab.Enjambre 3 | 12 | 87.3% | 120/120 | 100.0% | 0 | 79 | 0 | 483/24707 | 0/3435 | 0 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 | 91.5% | 120/120 | 100.0% | 0 | 161 | 0 | 120/29326 | 0/3506 | 0 |
| **All** | 84 | 69.5% | 586/840 | 69.8% | 0 | 743 | 0 | 1393/196832 | 25/19622 | 0 |

Members' team records (sums): teammate hits 4716, teammate bullet hits 22432, teammate collisions 201, shots held for the fire lane 19228, reports merged 9695270, drives fenced 16212.
Engine's count of our bullets that hit one of our own members: 5932.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 34.1% |
| abc.ShadowTeam 3.83 | 120 | 31.7% |
| florent.XSeries.Xmen 0.9 | 120 | 30.3% |
| gh.mini.GrubbmGroup 0.4 | 120 | 29.6% |
| gh.nano.GrofGroup 1.1 | 120 | 30.1% |
| jab.Enjambre 3 | 120 | 25.1% |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 120 | 33.3% |
| **All** | 840 | 30.6% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc

## Paired A/B: hadur2.HadurTeam 3.17.1mt vs hadur2.HadurTeam 3.17.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 33.3% ± 4.6 | 33.6% ± 2.2 | -0.3 ± 5.2 |
| abc.ShadowTeam 3.83 | 53.5% ± 4.2 | 52.1% ± 5.1 | +1.4 ± 7.8 |
| florent.XSeries.Xmen 0.9 | 59.6% ± 4.3 | 57.8% ± 3.6 | +1.8 ± 6.0 |
| gh.mini.GrubbmGroup 0.4 | 81.1% ± 2.1 | 83.2% ± 3.1 | -2.1 ± 3.7 |
| gh.nano.GrofGroup 1.1 | 80.2% ± 2.0 | 78.1% ± 3.4 | +2.1 ± 2.5 |
| jab.Enjambre 3 | 87.3% ± 1.7 | 87.2% ± 1.5 | +0.1 ± 2.3 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 91.5% ± 0.7 | 92.0% ± 1.1 | -0.5 ± 0.8 |
| **All** | 69.5% ± 4.4 | 69.1% ± 4.5 | +0.3 ± 1.5 |

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
| Rounds won | 69.8% ± 7.9 | 70.2% ± 7.9 | -0.5 ± 3.2 |
| Survival | 69.8% ± 7.9 | 70.2% ± 7.9 | -0.5 ± 3.2 |
| In-lane shots | 0.7% ± 0.1 | 0.8% ± 0.1 | -0.1 ± 0.1 |
| Focus fire | 30.6% ± 0.7 | 30.5% ± 0.6 | +0.1 ± 0.5 |
| Bullets on own members | 70.62 ± 5.40 | 69.54 ± 5.25 | +1.1 ± 3.7 |

## Team bench

hadur2.HadurTeam 3.17.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 708 over 84 battles (8.4 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 84 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 33.6% | 5/120 | 4.2% | 0 | 73 | 0 | 80/24042 | 0/1558 | 0 |
| abc.ShadowTeam 3.83 | 12 | 52.1% | 45/120 | 37.5% | 0 | 104 | 0 | 60/28464 | 0/2233 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 57.8% | 77/120 | 64.2% | 0 | 97 | 0 | 99/27626 | 0/2428 | 0 |
| gh.mini.GrubbmGroup 0.4 | 12 | 83.2% | 113/120 | 94.2% | 0 | 138 | 0 | 267/32799 | 0/3214 | 0 |
| gh.nano.GrofGroup 1.1 | 12 | 78.1% | 110/120 | 91.7% | 0 | 78 | 0 | 308/28815 | 0/3069 | 0 |
| jab.Enjambre 3 | 12 | 87.2% | 120/120 | 100.0% | 0 | 74 | 0 | 531/24278 | 0/3442 | 0 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 | 92.0% | 120/120 | 100.0% | 0 | 144 | 0 | 159/29598 | 0/3506 | 0 |
| **All** | 84 | 69.1% | 590/840 | 70.2% | 0 | 708 | 0 | 1504/195622 | 0/19450 | 0 |

Members' team records (sums): teammate hits 4771, teammate bullet hits 21870, teammate collisions 371, shots held for the fire lane 14668, reports merged 9537157, drives fenced 16379.
Engine's count of our bullets that hit one of our own members: 5841.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 33.1% |
| abc.ShadowTeam 3.83 | 120 | 30.8% |
| florent.XSeries.Xmen 0.9 | 120 | 31.0% |
| gh.mini.GrubbmGroup 0.4 | 120 | 29.5% |
| gh.nano.GrofGroup 1.1 | 120 | 30.9% |
| jab.Enjambre 3 | 120 | 25.7% |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 120 | 32.9% |
| **All** | 840 | 30.5% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc
