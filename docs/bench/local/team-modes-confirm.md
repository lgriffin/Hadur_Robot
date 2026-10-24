# Team bench

hadur2.HadurTeam 3.15mt against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9312 over 156 battles (59.7 per battle, most in one battle 347). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 156 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 18.6% | 2/120 | 1.7% | 0 | 1534 | 0 | 14/17543 | 0/1121 | 0 |
| rz.AlephTeam 0.34 | 12 | 38.0% | 21/120 | 17.5% | 0 | 112 | 0 | 14/22413 | 0/1803 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 48.2% | 61/120 | 50.8% | 0 | 108 | 0 | 14/22359 | 0/2149 | 0 |
| rz.GlowingHawks 0.2 | 12 | 68.9% | 84/120 | 70.0% | 0 | 99 | 0 | 11/29564 | 0/2835 | 0 |
| rz.HOFSwarm 1.1 | 12 | 59.3% | 66/120 | 55.0% | 0 | 3616 | 0 | 17/25501 | 0/2566 | 0 |
| myl.micro.TroodonPack 1.10 | 12 | 75.0% | 115/120 | 95.8% | 0 | 2235 | 0 | 15/23699 | 0/3056 | 0 |
| jab.DiamondStealers 5 | 12 | 76.3% | 116/120 | 96.7% | 0 | 763 | 0 | 17/19086 | 0/3152 | 0 |
| amz.TeamDeathTeam 1 | 12 | 59.9% | 111/120 | 92.5% | 0 | 117 | 0 | 17/8428 | 0/2640 | 0 |
| jab.Enjambre 3 | 12 | 78.4% | 120/120 | 100.0% | 0 | 80 | 0 | 29/19559 | 0/3215 | 0 |
| sgp.DrunkenTeam 1.12 | 12 | 82.8% | 120/120 | 100.0% | 0 | 80 | 0 | 17/17971 | 0/3313 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 12 | 88.6% | 120/120 | 100.0% | 0 | 392 | 0 | 13/17313 | 0/3489 | 0 |
| lxx.ConceptATeam 0.8 | 12 | 85.4% | 120/120 | 100.0% | 0 | 90 | 0 | 12/13688 | 0/3313 | 0 |
| sp.Minis.GeneBotUpgrade 1.1 | 12 | 89.1% | 120/120 | 100.0% | 0 | 86 | 0 | 23/19295 | 0/3467 | 0 |
| **All** | 156 | 66.8% | 1176/1560 | 75.4% | 0 | 9312 | 0 | 213/256419 | 0/36119 | 0 |

Members' team records (sums): teammate hits 2808, teammate bullet hits 18261, teammate collisions 188, shots held for the fire lane 112641, reports merged 17510452, drives fenced 19043.
Engine's count of our bullets that hit one of our own members: 3375.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 34.5% |
| rz.AlephTeam 0.34 | 120 | 34.4% |
| florent.XSeries.Xmen 0.9 | 120 | 33.4% |
| rz.GlowingHawks 0.2 | 120 | 32.3% |
| rz.HOFSwarm 1.1 | 120 | 34.3% |
| myl.micro.TroodonPack 1.10 | 120 | 31.2% |
| jab.DiamondStealers 5 | 120 | 32.1% |
| amz.TeamDeathTeam 1 | 120 | 36.5% |
| jab.Enjambre 3 | 120 | 24.7% |
| sgp.DrunkenTeam 1.12 | 120 | 34.4% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 120 | 34.0% |
| lxx.ConceptATeam 0.8 | 120 | 32.7% |
| sp.Minis.GeneBotUpgrade 1.1 | 120 | 37.1% |
| **All** | 1560 | 33.2% |

Data files written (any battle): hadur2\Hadur.data\health.hc, lxx\ConceptA.data\ConceptA.properties

## Paired A/B: hadur2.HadurTeam 3.15mt vs hadur2.HadurTeam 3.15aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 18.6% ± 3.5 | 17.8% ± 2.8 | +0.8 ± 4.5 |
| rz.AlephTeam 0.34 | 38.0% ± 2.6 | 40.4% ± 3.2 | -2.4 ± 4.6 |
| florent.XSeries.Xmen 0.9 | 48.2% ± 3.2 | 47.6% ± 3.5 | +0.6 ± 4.0 |
| rz.GlowingHawks 0.2 | 68.9% ± 3.6 | 67.2% ± 2.5 | +1.7 ± 3.7 |
| rz.HOFSwarm 1.1 | 59.3% ± 4.2 | 59.5% ± 4.8 | -0.2 ± 4.8 |
| myl.micro.TroodonPack 1.10 | 75.0% ± 2.1 | 69.4% ± 5.3 | +5.5 ± 6.9 |
| jab.DiamondStealers 5 | 76.3% ± 3.0 | 73.3% ± 3.2 | +3.0 ± 5.5 |
| amz.TeamDeathTeam 1 | 59.9% ± 1.9 | 59.6% ± 1.9 | +0.4 ± 3.2 |
| jab.Enjambre 3 | 78.4% ± 1.4 | 79.0% ± 1.4 | -0.6 ± 2.2 |
| sgp.DrunkenTeam 1.12 | 82.8% ± 1.6 | 81.3% ± 2.3 | +1.5 ± 2.7 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 88.6% ± 1.0 | 84.2% ± 1.9 | +4.4 ± 2.1 |
| lxx.ConceptATeam 0.8 | 85.4% ± 1.7 | 86.2% ± 1.4 | -0.8 ± 2.6 |
| sp.Minis.GeneBotUpgrade 1.1 | 89.1% ± 1.5 | 89.9% ± 1.8 | -0.8 ± 2.2 |
| **All** | 66.8% ± 3.3 | 65.8% ± 3.2 | +1.0 ± 1.0 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 of 12 | 12 of 12 | 12 |
| rz.AlephTeam 0.34 | 12 of 12 | 12 of 12 | 12 |
| florent.XSeries.Xmen 0.9 | 12 of 12 | 12 of 12 | 12 |
| rz.GlowingHawks 0.2 | 12 of 12 | 12 of 12 | 12 |
| rz.HOFSwarm 1.1 | 12 of 12 | 12 of 12 | 12 |
| myl.micro.TroodonPack 1.10 | 12 of 12 | 12 of 12 | 12 |
| jab.DiamondStealers 5 | 12 of 12 | 12 of 12 | 12 |
| amz.TeamDeathTeam 1 | 12 of 12 | 12 of 12 | 12 |
| jab.Enjambre 3 | 12 of 12 | 12 of 12 | 12 |
| sgp.DrunkenTeam 1.12 | 12 of 12 | 12 of 12 | 12 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 12 of 12 | 12 of 12 | 12 |
| lxx.ConceptATeam 0.8 | 12 of 12 | 12 of 12 | 12 |
| sp.Minis.GeneBotUpgrade 1.1 | 12 of 12 | 12 of 12 | 12 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 75.4% ± 5.4 | 74.6% ± 5.3 | +0.8 ± 1.8 |
| Survival | 75.4% ± 5.4 | 74.6% ± 5.3 | +0.8 ± 1.8 |
| In-lane shots | 0.1% ± 0.0 | 0.1% ± 0.0 | +0.0 ± 0.0 |
| Focus fire | 33.2% ± 0.6 | 33.0% ± 0.6 | +0.2 ± 0.4 |
| Bullets on own members | 21.63 ± 1.14 | 21.44 ± 0.94 | +0.2 ± 1.2 |

## Team bench

hadur2.HadurTeam 3.15aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1274 over 156 battles (8.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 156 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 12 | 17.8% | 3/120 | 2.5% | 0 | 23 | 0 | 17/17183 | 0/987 | 0 |
| rz.AlephTeam 0.34 | 12 | 40.4% | 20/120 | 16.7% | 0 | 108 | 0 | 13/22955 | 0/1894 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 47.6% | 57/120 | 47.5% | 0 | 89 | 0 | 18/22521 | 0/2124 | 0 |
| rz.GlowingHawks 0.2 | 12 | 67.2% | 88/120 | 73.3% | 0 | 101 | 0 | 23/30647 | 0/2762 | 0 |
| rz.HOFSwarm 1.1 | 12 | 59.5% | 69/120 | 57.5% | 0 | 109 | 0 | 10/26885 | 0/2536 | 0 |
| myl.micro.TroodonPack 1.10 | 12 | 69.4% | 108/120 | 90.0% | 0 | 151 | 0 | 3/22275 | 0/2841 | 0 |
| jab.DiamondStealers 5 | 12 | 73.3% | 114/120 | 95.0% | 0 | 124 | 0 | 13/18956 | 0/3026 | 0 |
| amz.TeamDeathTeam 1 | 12 | 59.6% | 108/120 | 90.0% | 0 | 119 | 0 | 11/8373 | 0/2627 | 0 |
| jab.Enjambre 3 | 12 | 79.0% | 120/120 | 100.0% | 0 | 78 | 0 | 21/19509 | 0/3245 | 0 |
| sgp.DrunkenTeam 1.12 | 12 | 81.3% | 119/120 | 99.2% | 0 | 79 | 0 | 21/18070 | 0/3266 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 12 | 84.2% | 119/120 | 99.2% | 0 | 113 | 0 | 13/17929 | 0/3389 | 0 |
| lxx.ConceptATeam 0.8 | 12 | 86.2% | 120/120 | 100.0% | 0 | 86 | 0 | 18/13787 | 0/3323 | 0 |
| sp.Minis.GeneBotUpgrade 1.1 | 12 | 89.9% | 119/120 | 99.2% | 0 | 94 | 0 | 13/19216 | 0/3494 | 0 |
| **All** | 156 | 65.8% | 1164/1560 | 74.6% | 0 | 1274 | 0 | 194/258306 | 0/35514 | 0 |

Members' team records (sums): teammate hits 2790, teammate bullet hits 18217, teammate collisions 230, shots held for the fire lane 110975, reports merged 17577668, drives fenced 21954.
Engine's count of our bullets that hit one of our own members: 3345.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 120 | 36.3% |
| rz.AlephTeam 0.34 | 120 | 33.8% |
| florent.XSeries.Xmen 0.9 | 120 | 33.4% |
| rz.GlowingHawks 0.2 | 120 | 32.5% |
| rz.HOFSwarm 1.1 | 120 | 33.3% |
| myl.micro.TroodonPack 1.10 | 120 | 31.3% |
| jab.DiamondStealers 5 | 120 | 32.0% |
| amz.TeamDeathTeam 1 | 120 | 36.2% |
| jab.Enjambre 3 | 120 | 24.4% |
| sgp.DrunkenTeam 1.12 | 120 | 33.6% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 120 | 32.3% |
| lxx.ConceptATeam 0.8 | 120 | 33.2% |
| sp.Minis.GeneBotUpgrade 1.1 | 120 | 37.3% |
| **All** | 1560 | 33.0% |

Data files written (any battle): hadur2\Hadur.data\health.hc, lxx\ConceptA.data\ConceptA.properties
