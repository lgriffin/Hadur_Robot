# Team bench

hadur2.HadurTeam 3.18.1kc against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1203 over 128 battles (9.4 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 128 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 16 | 74.0% | 133/160 | 83.1% | 0 | 130 | 0 | 57/42603 | 0/3925 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 70.1% | 128/160 | 80.0% | 0 | 133 | 0 | 62/39312 | 0/3844 | 0 |
| rz.HOFSwarm 1.1 | 16 | 63.9% | 109/160 | 68.1% | 0 | 129 | 0 | 47/38944 | 0/3538 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 78.9% | 154/160 | 96.3% | 0 | 217 | 0 | 80/36660 | 0/4196 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 70.8% | 132/160 | 82.5% | 0 | 166 | 0 | 177/40652 | 0/3746 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 77.9% | 143/160 | 89.4% | 0 | 188 | 0 | 296/41852 | 0/4049 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 78.1% | 145/160 | 90.6% | 0 | 103 | 0 | 96/40347 | 0/4138 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 78.1% | 153/160 | 95.6% | 0 | 137 | 0 | 329/39025 | 0/4082 | 0 |
| **All** | 128 | 74.0% | 1097/1280 | 85.7% | 0 | 1203 | 0 | 1144/319395 | 0/31518 | 0 |

Members' team records (sums): teammate hits 6779, teammate bullet hits 33556, teammate collisions 340, shots held for the fire lane 26506, reports merged 15802569, drives fenced 22077.
Engine's count of our bullets that hit one of our own members: 8542.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 160 | 32.4% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 32.0% |
| rz.HOFSwarm 1.1 | 160 | 33.0% |
| myl.micro.TroodonPack 1.10 | 160 | 29.7% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 30.6% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.8% |
| kawigi.sbf.TidalWave 0.8 | 160 | 33.3% |
| gh.nano.GrofGroup 1.1 | 160 | 30.8% |
| **All** | 1280 | 31.4% |

Data files written (any battle): hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip

## Paired A/B: hadur2.HadurTeam 3.18.1kc vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| rz.GlowingHawks 0.2 | 74.0% ± 3.3 | 75.8% ± 1.5 | -1.8 ± 2.9 |
| kawigi.micro.ArmyOfShiz 1.1 | 70.1% ± 2.7 | 71.5% ± 3.1 | -1.3 ± 4.4 |
| rz.HOFSwarm 1.1 | 63.9% ± 3.7 | 64.2% ± 4.2 | -0.3 ± 5.4 |
| myl.micro.TroodonPack 1.10 | 78.9% ± 2.4 | 79.4% ± 2.7 | -0.6 ± 2.9 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 70.8% ± 3.2 | 76.5% ± 2.7 | -5.7 ± 4.9 |
| gh.mini.GrubbmGroup 0.4 | 77.9% ± 2.2 | 82.7% ± 2.2 | -4.7 ± 3.4 |
| kawigi.sbf.TidalWave 0.8 | 78.1% ± 2.5 | 78.5% ± 2.1 | -0.5 ± 3.2 |
| gh.nano.GrofGroup 1.1 | 78.1% ± 1.7 | 79.3% ± 1.9 | -1.2 ± 2.8 |
| **All** | 74.0% ± 1.2 | 76.0% ± 1.3 | -2.0 ± 1.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| rz.GlowingHawks 0.2 | 16 of 16 | 16 of 16 | 16 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 of 16 | 16 of 16 | 16 |
| gh.mini.GrubbmGroup 0.4 | 16 of 16 | 16 of 16 | 16 |
| kawigi.sbf.TidalWave 0.8 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 85.7% ± 2.4 | 87.3% ± 2.5 | -1.6 ± 2.6 |
| Survival | 85.7% ± 2.4 | 87.3% ± 2.5 | -1.6 ± 2.6 |
| In-lane shots | 0.4% ± 0.1 | 0.4% ± 0.1 | -0.1 ± 0.0 |
| Focus fire | 31.4% ± 0.4 | 30.9% ± 0.3 | +0.5 ± 0.4 |
| Bullets on own members | 66.73 ± 2.51 | 74.62 ± 2.56 | -7.9 ± 2.9 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1267 over 128 battles (9.9 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 128 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 16 | 75.8% | 137/160 | 85.6% | 0 | 140 | 0 | 76/44424 | 0/4050 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 71.5% | 130/160 | 81.3% | 0 | 140 | 0 | 35/40261 | 0/3894 | 0 |
| rz.HOFSwarm 1.1 | 16 | 64.2% | 105/160 | 65.6% | 0 | 146 | 0 | 81/38799 | 0/3553 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 79.4% | 156/160 | 97.5% | 0 | 239 | 0 | 93/35874 | 0/4189 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 76.5% | 140/160 | 87.5% | 0 | 190 | 0 | 195/40082 | 0/4036 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 82.7% | 152/160 | 95.0% | 0 | 182 | 0 | 356/42550 | 0/4280 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 78.5% | 142/160 | 88.8% | 0 | 116 | 0 | 125/39254 | 0/4177 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 79.3% | 155/160 | 96.9% | 0 | 114 | 0 | 376/39220 | 0/4174 | 0 |
| **All** | 128 | 76.0% | 1117/1280 | 87.3% | 0 | 1267 | 0 | 1337/320464 | 0/32353 | 0 |

Members' team records (sums): teammate hits 7720, teammate bullet hits 34803, teammate collisions 276, shots held for the fire lane 24691, reports merged 15897987, drives fenced 27234.
Engine's count of our bullets that hit one of our own members: 9551.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 160 | 32.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 30.8% |
| rz.HOFSwarm 1.1 | 160 | 32.5% |
| myl.micro.TroodonPack 1.10 | 160 | 29.8% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 31.0% |
| gh.mini.GrubbmGroup 0.4 | 160 | 28.9% |
| kawigi.sbf.TidalWave 0.8 | 160 | 32.1% |
| gh.nano.GrofGroup 1.1 | 160 | 30.3% |
| **All** | 1280 | 30.9% |

Data files written (any battle): hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip
