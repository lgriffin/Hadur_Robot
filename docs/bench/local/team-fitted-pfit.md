# Team bench

hadur117.HadurTeam 3.23fit against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 765 over 32 battles (23.9 per battle, most in one battle 78). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 4 | 86.2% | 48/48 | 100.0% | 0 | 140 | 0 | 23/10647 | 0/1376 | 0 |
| gh.nano.GrofGroup 1.1 | 4 | 88.6% | 48/48 | 100.0% | 0 | 280 | 0 | 195/10041 | 0/1388 | 0 |
| radnor.RadnorMedSchool 1.0 | 4 | 93.5% | 48/48 | 100.0% | 0 | 260 | 0 | 143/8502 | 0/1430 | 0 |
| rz.HOFSwarm 1.1 | 4 | 88.8% | 47/48 | 97.9% | 0 | 19 | 0 | 26/10199 | 0/1406 | 0 |
| tmnr.TMNR 1.01 | 4 | 87.6% | 48/48 | 100.0% | 0 | 18 | 0 | 35/10267 | 0/1391 | 0 |
| ags.polylunar.Polylunar 1.6 | 4 | 60.4% | 44/48 | 91.7% | 0 | 29 | 0 | 245/4705 | 0/962 | 0 |
| myl.micro.TroodonPack 1.10 | 4 | 91.4% | 48/48 | 100.0% | 0 | 9 | 0 | 36/8671 | 0/1424 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 4 | 93.9% | 48/48 | 100.0% | 0 | 10 | 0 | 82/6070 | 0/1418 | 0 |
| **All** | 32 | 86.3% | 379/384 | 98.7% | 0 | 765 | 0 | 785/69102 | 0/10795 | 0 |

Members' team records (sums): teammate hits 1038, teammate bullet hits 8924, teammate collisions 0, shots held for the fire lane 7242, reports merged 4025147, drives fenced 49.
Engine's count of our bullets that hit one of our own members: 1345.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 48 | 32.9% |
| gh.nano.GrofGroup 1.1 | 48 | 32.3% |
| radnor.RadnorMedSchool 1.0 | 48 | 34.0% |
| rz.HOFSwarm 1.1 | 48 | 33.7% |
| tmnr.TMNR 1.01 | 48 | 33.5% |
| ags.polylunar.Polylunar 1.6 | 48 | 32.3% |
| myl.micro.TroodonPack 1.10 | 48 | 30.7% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 48 | 34.6% |
| **All** | 384 | 33.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.23fit vs hadur117.HadurTeam 3.23aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 86.2% ± 3.9 | 83.5% ± 3.2 | +2.6 ± 3.3 |
| gh.nano.GrofGroup 1.1 | 88.6% ± 3.3 | 85.9% ± 1.0 | +2.7 ± 3.1 |
| radnor.RadnorMedSchool 1.0 | 93.5% ± 0.8 | 92.4% ± 1.5 | +1.1 ± 1.5 |
| rz.HOFSwarm 1.1 | 88.8% ± 3.7 | 83.0% ± 5.3 | +5.9 ± 6.4 |
| tmnr.TMNR 1.01 | 87.6% ± 5.2 | 87.4% ± 1.8 | +0.2 ± 5.9 |
| ags.polylunar.Polylunar 1.6 | 60.4% ± 1.5 | 61.5% ± 3.1 | -1.1 ± 3.4 |
| myl.micro.TroodonPack 1.10 | 91.4% ± 1.3 | 89.6% ± 2.5 | +1.8 ± 1.4 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 93.9% ± 1.3 | 91.7% ± 1.1 | +2.2 ± 1.9 |
| **All** | 86.3% ± 3.8 | 84.4% ± 3.4 | +1.9 ± 1.0 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 4 of 4 | 4 of 4 | 4 |
| gh.nano.GrofGroup 1.1 | 4 of 4 | 4 of 4 | 4 |
| radnor.RadnorMedSchool 1.0 | 4 of 4 | 4 of 4 | 4 |
| rz.HOFSwarm 1.1 | 4 of 4 | 4 of 4 | 4 |
| tmnr.TMNR 1.01 | 4 of 4 | 4 of 4 | 4 |
| ags.polylunar.Polylunar 1.6 | 4 of 4 | 4 of 4 | 4 |
| myl.micro.TroodonPack 1.10 | 4 of 4 | 4 of 4 | 4 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 4 of 4 | 4 of 4 | 4 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 98.7% ± 1.3 | 97.4% ± 1.6 | +1.3 ± 1.7 |
| Survival | 98.7% ± 1.3 | 97.4% ± 1.6 | +1.3 ± 1.7 |
| In-lane shots | 1.4% ± 0.6 | 1.5% ± 0.7 | -0.1 ± 0.2 |
| Focus fire | 33.0% ± 0.6 | 33.1% ± 0.6 | -0.1 ± 0.5 |
| Bullets on own members | 42.03 ± 4.39 | 42.31 ± 5.09 | -0.3 ± 4.8 |

## Team bench

hadur117.HadurTeam 3.23aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 194 over 32 battles (6.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 32 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 4 | 83.5% | 45/48 | 93.8% | 0 | 39 | 0 | 38/11656 | 0/1347 | 0 |
| gh.nano.GrofGroup 1.1 | 4 | 85.9% | 48/48 | 100.0% | 0 | 7 | 0 | 211/11058 | 0/1377 | 0 |
| radnor.RadnorMedSchool 1.0 | 4 | 92.4% | 48/48 | 100.0% | 0 | 46 | 0 | 146/8566 | 0/1419 | 0 |
| rz.HOFSwarm 1.1 | 4 | 83.0% | 44/48 | 91.7% | 0 | 28 | 0 | 24/11546 | 0/1332 | 0 |
| tmnr.TMNR 1.01 | 4 | 87.4% | 48/48 | 100.0% | 0 | 23 | 0 | 30/10516 | 0/1394 | 0 |
| ags.polylunar.Polylunar 1.6 | 4 | 61.5% | 45/48 | 93.8% | 0 | 32 | 0 | 296/4737 | 0/980 | 0 |
| myl.micro.TroodonPack 1.10 | 4 | 89.6% | 48/48 | 100.0% | 0 | 10 | 0 | 40/8925 | 0/1406 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 4 | 91.7% | 48/48 | 100.0% | 0 | 9 | 0 | 66/6273 | 0/1426 | 0 |
| **All** | 32 | 84.4% | 374/384 | 97.4% | 0 | 194 | 0 | 851/73277 | 0/10681 | 0 |

Members' team records (sums): teammate hits 1086, teammate bullet hits 9490, teammate collisions 0, shots held for the fire lane 7240, reports merged 4164979, drives fenced 44.
Engine's count of our bullets that hit one of our own members: 1354.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 48 | 33.7% |
| gh.nano.GrofGroup 1.1 | 48 | 32.5% |
| radnor.RadnorMedSchool 1.0 | 48 | 33.9% |
| rz.HOFSwarm 1.1 | 48 | 33.2% |
| tmnr.TMNR 1.01 | 48 | 33.5% |
| ags.polylunar.Polylunar 1.6 | 48 | 32.6% |
| myl.micro.TroodonPack 1.10 | 48 | 31.2% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 48 | 34.6% |
| **All** | 384 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
