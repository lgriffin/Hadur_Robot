# Team bench

hadur117.HadurTeam 3.23bb against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1251 over 192 battles (6.5 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 192 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 84.4% | 283/288 | 98.3% | 0 | 160 | 0 | 152/67207 | 0/8188 | 0 |
| gh.nano.GrofGroup 1.1 | 24 | 85.5% | 283/288 | 98.3% | 0 | 92 | 0 | 1233/65355 | 0/8241 | 0 |
| radnor.RadnorMedSchool 1.0 | 24 | 92.8% | 288/288 | 100.0% | 0 | 234 | 0 | 947/51905 | 0/8582 | 0 |
| rz.HOFSwarm 1.1 | 24 | 84.4% | 276/288 | 95.8% | 0 | 223 | 0 | 201/67498 | 0/8140 | 0 |
| tmnr.TMNR 1.01 | 24 | 87.1% | 287/288 | 99.7% | 0 | 112 | 0 | 241/62102 | 0/8337 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 58.5% | 254/288 | 88.2% | 0 | 292 | 0 | 1637/28867 | 0/5596 | 0 |
| myl.micro.TroodonPack 1.10 | 24 | 89.5% | 288/288 | 100.0% | 0 | 81 | 0 | 232/53070 | 0/8454 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 24 | 92.1% | 288/288 | 100.0% | 0 | 57 | 0 | 462/36856 | 0/8536 | 0 |
| **All** | 192 | 84.3% | 2247/2304 | 97.5% | 0 | 1251 | 0 | 5105/432860 | 0/64074 | 0 |

Members' team records (sums): teammate hits 6097, teammate bullet hits 55477, teammate collisions 4, shots held for the fire lane 42587, reports merged 24783697, drives fenced 291.
Engine's count of our bullets that hit one of our own members: 7814.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.5% |
| gh.nano.GrofGroup 1.1 | 288 | 32.0% |
| radnor.RadnorMedSchool 1.0 | 288 | 33.6% |
| rz.HOFSwarm 1.1 | 288 | 33.5% |
| tmnr.TMNR 1.01 | 288 | 33.6% |
| ags.polylunar.Polylunar 1.6 | 288 | 33.0% |
| myl.micro.TroodonPack 1.10 | 288 | 31.1% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 288 | 34.0% |
| **All** | 2304 | 33.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.23bb vs hadur117.HadurTeam 3.23aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 84.4% ± 1.1 | 84.1% ± 1.3 | +0.3 ± 1.8 |
| gh.nano.GrofGroup 1.1 | 85.5% ± 0.9 | 85.5% ± 1.2 | +0.0 ± 1.6 |
| radnor.RadnorMedSchool 1.0 | 92.8% ± 0.3 | 92.5% ± 0.5 | +0.4 ± 0.6 |
| rz.HOFSwarm 1.1 | 84.4% ± 1.1 | 86.2% ± 1.0 | -1.8 ± 1.5 |
| tmnr.TMNR 1.01 | 87.1% ± 0.9 | 86.6% ± 0.8 | +0.5 ± 1.3 |
| ags.polylunar.Polylunar 1.6 | 58.5% ± 1.5 | 59.9% ± 1.7 | -1.4 ± 2.6 |
| myl.micro.TroodonPack 1.10 | 89.5% ± 0.7 | 89.6% ± 0.8 | -0.1 ± 0.8 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 92.1% ± 0.5 | 92.2% ± 0.4 | -0.0 ± 0.6 |
| **All** | 84.3% ± 1.5 | 84.6% ± 1.4 | -0.3 ± 0.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 24 of 24 | 24 of 24 | 24 |
| gh.nano.GrofGroup 1.1 | 24 of 24 | 24 of 24 | 24 |
| radnor.RadnorMedSchool 1.0 | 24 of 24 | 24 of 24 | 24 |
| rz.HOFSwarm 1.1 | 24 of 24 | 24 of 24 | 24 |
| tmnr.TMNR 1.01 | 24 of 24 | 24 of 24 | 24 |
| ags.polylunar.Polylunar 1.6 | 24 of 24 | 24 of 24 | 24 |
| myl.micro.TroodonPack 1.10 | 24 of 24 | 24 of 24 | 24 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 97.5% ± 0.8 | 97.7% ± 0.7 | -0.2 ± 0.8 |
| Survival | 97.5% ± 0.8 | 97.7% ± 0.7 | -0.2 ± 0.8 |
| In-lane shots | 1.5% ± 0.2 | 1.5% ± 0.3 | -0.0 ± 0.1 |
| Focus fire | 33.0% ± 0.2 | 33.1% ± 0.2 | -0.0 ± 0.3 |
| Bullets on own members | 40.70 ± 1.76 | 40.18 ± 1.55 | +0.5 ± 1.5 |

## Team bench

hadur117.HadurTeam 3.23aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1089 over 192 battles (5.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 192 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 84.1% | 277/288 | 96.2% | 0 | 141 | 0 | 209/68411 | 0/8163 | 0 |
| gh.nano.GrofGroup 1.1 | 24 | 85.5% | 284/288 | 98.6% | 0 | 89 | 0 | 1237/65420 | 0/8207 | 0 |
| radnor.RadnorMedSchool 1.0 | 24 | 92.5% | 288/288 | 100.0% | 0 | 242 | 0 | 910/52003 | 0/8553 | 0 |
| rz.HOFSwarm 1.1 | 24 | 86.2% | 282/288 | 97.9% | 0 | 150 | 0 | 173/66677 | 0/8271 | 0 |
| tmnr.TMNR 1.01 | 24 | 86.6% | 287/288 | 99.7% | 0 | 120 | 0 | 220/60472 | 0/8281 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 59.9% | 257/288 | 89.2% | 0 | 207 | 0 | 1692/28351 | 0/5738 | 0 |
| myl.micro.TroodonPack 1.10 | 24 | 89.6% | 288/288 | 100.0% | 0 | 90 | 0 | 207/53995 | 0/8454 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 24 | 92.2% | 288/288 | 100.0% | 0 | 50 | 0 | 429/36972 | 0/8558 | 0 |
| **All** | 192 | 84.6% | 2251/2304 | 97.7% | 0 | 1089 | 0 | 5077/432301 | 0/64225 | 0 |

Members' team records (sums): teammate hits 6054, teammate bullet hits 55254, teammate collisions 86, shots held for the fire lane 43434, reports merged 24842312, drives fenced 353.
Engine's count of our bullets that hit one of our own members: 7715.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.5% |
| gh.nano.GrofGroup 1.1 | 288 | 32.3% |
| radnor.RadnorMedSchool 1.0 | 288 | 34.0% |
| rz.HOFSwarm 1.1 | 288 | 33.7% |
| tmnr.TMNR 1.01 | 288 | 33.8% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.9% |
| myl.micro.TroodonPack 1.10 | 288 | 30.7% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 288 | 33.7% |
| **All** | 2304 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
