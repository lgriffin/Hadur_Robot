# Team bench

hadur117.HadurTeam 3.23fit against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1092 over 192 battles (5.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 192 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 86.2% | 283/288 | 98.3% | 0 | 161 | 0 | 162/65452 | 0/8260 | 0 |
| gh.nano.GrofGroup 1.1 | 24 | 89.2% | 288/288 | 100.0% | 0 | 90 | 0 | 1129/60169 | 0/8403 | 0 |
| radnor.RadnorMedSchool 1.0 | 24 | 93.1% | 288/288 | 100.0% | 0 | 235 | 0 | 884/51161 | 0/8538 | 0 |
| rz.HOFSwarm 1.1 | 24 | 87.7% | 280/288 | 97.2% | 0 | 141 | 0 | 176/65786 | 0/8356 | 0 |
| tmnr.TMNR 1.01 | 24 | 87.1% | 286/288 | 99.3% | 0 | 137 | 0 | 247/60972 | 0/8291 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 60.8% | 262/288 | 91.0% | 0 | 177 | 0 | 1575/28522 | 0/5828 | 0 |
| myl.micro.TroodonPack 1.10 | 24 | 91.2% | 288/288 | 100.0% | 0 | 82 | 0 | 227/51401 | 0/8501 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 24 | 94.0% | 288/288 | 100.0% | 0 | 69 | 0 | 412/35423 | 0/8595 | 0 |
| **All** | 192 | 86.2% | 2263/2304 | 98.2% | 0 | 1092 | 0 | 4812/418886 | 0/64772 | 0 |

Members' team records (sums): teammate hits 5984, teammate bullet hits 53988, teammate collisions 0, shots held for the fire lane 42658, reports merged 24340356, drives fenced 251.
Engine's count of our bullets that hit one of our own members: 7639.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.5% |
| gh.nano.GrofGroup 1.1 | 288 | 32.2% |
| radnor.RadnorMedSchool 1.0 | 288 | 33.7% |
| rz.HOFSwarm 1.1 | 288 | 34.0% |
| tmnr.TMNR 1.01 | 288 | 33.3% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.9% |
| myl.micro.TroodonPack 1.10 | 288 | 30.9% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 288 | 33.7% |
| **All** | 2304 | 33.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.23fit vs hadur117.HadurTeam 3.23aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 86.2% ± 0.9 | 84.2% ± 1.4 | +2.0 ± 1.9 |
| gh.nano.GrofGroup 1.1 | 89.2% ± 0.9 | 85.0% ± 1.1 | +4.1 ± 1.3 |
| radnor.RadnorMedSchool 1.0 | 93.1% ± 0.3 | 92.5% ± 0.4 | +0.6 ± 0.5 |
| rz.HOFSwarm 1.1 | 87.7% ± 1.0 | 84.8% ± 1.3 | +2.9 ± 1.9 |
| tmnr.TMNR 1.01 | 87.1% ± 0.9 | 86.9% ± 0.9 | +0.3 ± 1.3 |
| ags.polylunar.Polylunar 1.6 | 60.8% ± 1.7 | 60.3% ± 1.6 | +0.5 ± 2.1 |
| myl.micro.TroodonPack 1.10 | 91.2% ± 0.4 | 89.6% ± 0.6 | +1.7 ± 0.9 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 94.0% ± 0.3 | 92.4% ± 0.4 | +1.6 ± 0.4 |
| **All** | 86.2% ± 1.5 | 84.4% ± 1.4 | +1.7 ± 0.5 |

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
| Rounds won | 98.2% ± 0.7 | 97.6% ± 0.7 | +0.7 ± 0.8 |
| Survival | 98.2% ± 0.7 | 97.6% ± 0.7 | +0.7 ± 0.8 |
| In-lane shots | 1.5% ± 0.2 | 1.4% ± 0.2 | +0.0 ± 0.1 |
| Focus fire | 33.0% ± 0.2 | 33.1% ± 0.2 | -0.1 ± 0.3 |
| Bullets on own members | 39.79 ± 1.69 | 40.54 ± 1.68 | -0.8 ± 1.4 |

## Team bench

hadur117.HadurTeam 3.23aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 1109 over 192 battles (5.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 192 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 24 | 84.2% | 277/288 | 96.2% | 0 | 159 | 0 | 148/67187 | 0/8148 | 0 |
| gh.nano.GrofGroup 1.1 | 24 | 85.0% | 285/288 | 99.0% | 0 | 104 | 0 | 1145/65551 | 0/8216 | 0 |
| radnor.RadnorMedSchool 1.0 | 24 | 92.5% | 288/288 | 100.0% | 0 | 210 | 0 | 928/52437 | 0/8510 | 0 |
| rz.HOFSwarm 1.1 | 24 | 84.8% | 280/288 | 97.2% | 0 | 187 | 0 | 163/66710 | 0/8156 | 0 |
| tmnr.TMNR 1.01 | 24 | 86.9% | 284/288 | 98.6% | 0 | 116 | 0 | 220/60850 | 0/8301 | 0 |
| ags.polylunar.Polylunar 1.6 | 24 | 60.3% | 259/288 | 89.9% | 0 | 198 | 0 | 1603/28784 | 0/5775 | 0 |
| myl.micro.TroodonPack 1.10 | 24 | 89.6% | 287/288 | 99.7% | 0 | 82 | 0 | 231/52621 | 0/8422 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 24 | 92.4% | 288/288 | 100.0% | 0 | 53 | 0 | 451/37031 | 0/8583 | 0 |
| **All** | 192 | 84.4% | 2248/2304 | 97.6% | 0 | 1109 | 0 | 4889/431171 | 0/64111 | 0 |

Members' team records (sums): teammate hits 6181, teammate bullet hits 54539, teammate collisions 6, shots held for the fire lane 42938, reports merged 24736617, drives fenced 255.
Engine's count of our bullets that hit one of our own members: 7784.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| kawigi.micro.ArmyOfShiz 1.1 | 288 | 33.6% |
| gh.nano.GrofGroup 1.1 | 288 | 32.1% |
| radnor.RadnorMedSchool 1.0 | 288 | 33.9% |
| rz.HOFSwarm 1.1 | 288 | 33.8% |
| tmnr.TMNR 1.01 | 288 | 33.4% |
| ags.polylunar.Polylunar 1.6 | 288 | 32.5% |
| myl.micro.TroodonPack 1.10 | 288 | 31.6% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 288 | 33.8% |
| **All** | 2304 | 33.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
