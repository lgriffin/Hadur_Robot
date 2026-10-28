# Team bench

hadur2.HadurTeam 3.18.1ka against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2068 over 240 battles (8.6 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 240 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 47.1% | 56/160 | 35.0% | 0 | 137 | 0 | 55/36796 | 0/2697 | 0 |
| rz.GlowingHawks 0.2 | 16 | 74.5% | 124/160 | 77.5% | 0 | 121 | 0 | 82/42834 | 0/4002 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 71.9% | 131/160 | 81.9% | 0 | 112 | 0 | 54/41205 | 0/3921 | 0 |
| rz.HOFSwarm 1.1 | 16 | 64.5% | 104/160 | 65.0% | 0 | 132 | 0 | 69/38429 | 0/3570 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 74.0% | 126/160 | 78.8% | 0 | 108 | 0 | 75/41868 | 0/4012 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 68.8% | 117/160 | 73.1% | 0 | 141 | 0 | 55/49730 | 0/3079 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 16 | 70.0% | 120/160 | 75.0% | 0 | 119 | 0 | 57/36065 | 0/3876 | 0 |
| tmnr.TMNR 1.01 | 16 | 76.0% | 145/160 | 90.6% | 0 | 212 | 0 | 94/36386 | 0/4066 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 82.0% | 156/160 | 97.5% | 0 | 209 | 0 | 84/37223 | 0/4325 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 78.5% | 147/160 | 91.9% | 0 | 171 | 0 | 248/40979 | 0/4127 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 77.1% | 147/160 | 91.9% | 0 | 114 | 0 | 148/47908 | 0/4008 | 0 |
| radnor.RadnorMedSchool 1.0 | 16 | 90.2% | 160/160 | 100.0% | 0 | 103 | 0 | 430/34220 | 0/4601 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 82.0% | 150/160 | 93.8% | 0 | 186 | 0 | 340/43586 | 0/4260 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 78.3% | 136/160 | 85.0% | 0 | 91 | 0 | 162/39096 | 0/4177 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 81.3% | 154/160 | 96.3% | 0 | 112 | 0 | 405/38360 | 0/4271 | 0 |
| **All** | 240 | 74.4% | 1973/2400 | 82.2% | 0 | 2068 | 0 | 2358/604685 | 0/58992 | 0 |

Members' team records (sums): teammate hits 13687, teammate bullet hits 65641, teammate collisions 419, shots held for the fire lane 45382, reports merged 29594702, drives fenced 50446.
Engine's count of our bullets that hit one of our own members: 16989.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.5% |
| rz.GlowingHawks 0.2 | 160 | 31.6% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.1% |
| rz.HOFSwarm 1.1 | 160 | 31.5% |
| davidalves.PhoenixTeam 0.54 | 160 | 30.4% |
| kid.team.OmegaSquad .0.2 | 160 | 36.6% |
| cx.mini.DemoniacNimrods 0.50 | 160 | 31.4% |
| tmnr.TMNR 1.01 | 160 | 31.4% |
| myl.micro.TroodonPack 1.10 | 160 | 29.8% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 30.3% |
| bvh.team.Valkiries 1.0 | 160 | 30.7% |
| radnor.RadnorMedSchool 1.0 | 160 | 33.3% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.4% |
| kawigi.sbf.TidalWave 0.8 | 160 | 32.3% |
| gh.nano.GrofGroup 1.1 | 160 | 31.0% |
| **All** | 2400 | 31.5% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip

## Paired A/B: hadur2.HadurTeam 3.18.1ka vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 47.1% ± 3.5 | 53.0% ± 3.0 | -6.0 ± 3.6 |
| rz.GlowingHawks 0.2 | 74.5% ± 2.7 | 75.0% ± 3.3 | -0.5 ± 4.2 |
| kawigi.micro.ArmyOfShiz 1.1 | 71.9% ± 3.0 | 71.1% ± 2.6 | +0.8 ± 3.4 |
| rz.HOFSwarm 1.1 | 64.5% ± 4.7 | 61.4% ± 3.8 | +3.1 ± 6.8 |
| davidalves.PhoenixTeam 0.54 | 74.0% ± 2.8 | 77.0% ± 2.0 | -3.0 ± 3.6 |
| kid.team.OmegaSquad .0.2 | 68.8% ± 2.7 | 74.7% ± 2.2 | -5.9 ± 3.0 |
| cx.mini.DemoniacNimrods 0.50 | 70.0% ± 3.3 | 70.3% ± 2.9 | -0.3 ± 3.3 |
| tmnr.TMNR 1.01 | 76.0% ± 2.8 | 77.2% ± 2.3 | -1.2 ± 3.7 |
| myl.micro.TroodonPack 1.10 | 82.0% ± 2.0 | 78.6% ± 2.2 | +3.4 ± 2.8 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 78.5% ± 2.2 | 77.7% ± 2.0 | +0.8 ± 2.8 |
| bvh.team.Valkiries 1.0 | 77.1% ± 2.2 | 77.5% ± 2.4 | -0.4 ± 2.9 |
| radnor.RadnorMedSchool 1.0 | 90.2% ± 1.0 | 89.1% ± 1.1 | +1.1 ± 1.1 |
| gh.mini.GrubbmGroup 0.4 | 82.0% ± 1.9 | 81.1% ± 2.2 | +0.9 ± 2.2 |
| kawigi.sbf.TidalWave 0.8 | 78.3% ± 1.7 | 79.1% ± 2.5 | -0.8 ± 2.7 |
| gh.nano.GrofGroup 1.1 | 81.3% ± 2.7 | 77.6% ± 1.9 | +3.7 ± 2.7 |
| **All** | 74.4% ± 1.4 | 74.7% ± 1.2 | -0.3 ± 0.9 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 of 16 | 16 of 16 | 16 |
| rz.GlowingHawks 0.2 | 16 of 16 | 16 of 16 | 16 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| davidalves.PhoenixTeam 0.54 | 16 of 16 | 16 of 16 | 16 |
| kid.team.OmegaSquad .0.2 | 16 of 16 | 16 of 16 | 16 |
| cx.mini.DemoniacNimrods 0.50 | 16 of 16 | 16 of 16 | 16 |
| tmnr.TMNR 1.01 | 16 of 16 | 16 of 16 | 16 |
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 of 16 | 16 of 16 | 16 |
| bvh.team.Valkiries 1.0 | 16 of 16 | 16 of 16 | 16 |
| radnor.RadnorMedSchool 1.0 | 16 of 16 | 16 of 16 | 16 |
| gh.mini.GrubbmGroup 0.4 | 16 of 16 | 16 of 16 | 16 |
| kawigi.sbf.TidalWave 0.8 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 82.2% ± 2.4 | 82.6% ± 2.3 | -0.4 ± 1.8 |
| Survival | 82.2% ± 2.4 | 82.6% ± 2.3 | -0.4 ± 1.8 |
| In-lane shots | 0.4% ± 0.0 | 0.4% ± 0.0 | +0.0 ± 0.0 |
| Focus fire | 31.5% ± 0.3 | 31.2% ± 0.3 | +0.3 ± 0.3 |
| Bullets on own members | 70.79 ± 2.08 | 73.91 ± 2.07 | -3.1 ± 2.3 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 2088 over 240 battles (8.7 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 240 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 53.0% | 59/160 | 36.9% | 0 | 121 | 0 | 81/38318 | 0/3020 | 0 |
| rz.GlowingHawks 0.2 | 16 | 75.0% | 129/160 | 80.6% | 0 | 127 | 0 | 64/43750 | 0/4027 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 71.1% | 129/160 | 80.6% | 0 | 131 | 0 | 53/40367 | 0/3865 | 0 |
| rz.HOFSwarm 1.1 | 16 | 61.4% | 100/160 | 62.5% | 0 | 170 | 0 | 72/38378 | 0/3406 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 77.0% | 130/160 | 81.3% | 0 | 103 | 0 | 84/41095 | 0/4150 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 74.7% | 130/160 | 81.3% | 0 | 143 | 0 | 79/47270 | 0/3336 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 16 | 70.3% | 125/160 | 78.1% | 0 | 118 | 0 | 36/37607 | 0/3892 | 0 |
| tmnr.TMNR 1.01 | 16 | 77.2% | 147/160 | 91.9% | 0 | 214 | 0 | 106/37085 | 0/4116 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 78.6% | 152/160 | 95.0% | 0 | 202 | 0 | 77/35913 | 0/4195 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 77.7% | 143/160 | 89.4% | 0 | 139 | 0 | 223/41097 | 0/4106 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 77.5% | 143/160 | 89.4% | 0 | 119 | 0 | 112/46793 | 0/4043 | 0 |
| radnor.RadnorMedSchool 1.0 | 16 | 89.1% | 160/160 | 100.0% | 0 | 105 | 0 | 404/35056 | 0/4559 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 81.1% | 149/160 | 93.1% | 0 | 174 | 0 | 366/41109 | 0/4173 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 79.1% | 138/160 | 86.3% | 0 | 100 | 0 | 179/39443 | 0/4211 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 77.6% | 148/160 | 92.5% | 0 | 122 | 0 | 412/39313 | 0/4082 | 0 |
| **All** | 240 | 74.7% | 1982/2400 | 82.6% | 0 | 2088 | 0 | 2348/602594 | 0/59181 | 0 |

Members' team records (sums): teammate hits 14405, teammate bullet hits 65229, teammate collisions 574, shots held for the fire lane 44357, reports merged 29526044, drives fenced 49514.
Engine's count of our bullets that hit one of our own members: 17738.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 30.7% |
| rz.GlowingHawks 0.2 | 160 | 31.4% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 30.9% |
| rz.HOFSwarm 1.1 | 160 | 31.2% |
| davidalves.PhoenixTeam 0.54 | 160 | 30.2% |
| kid.team.OmegaSquad .0.2 | 160 | 36.4% |
| cx.mini.DemoniacNimrods 0.50 | 160 | 30.5% |
| tmnr.TMNR 1.01 | 160 | 31.8% |
| myl.micro.TroodonPack 1.10 | 160 | 29.9% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 30.2% |
| bvh.team.Valkiries 1.0 | 160 | 30.2% |
| radnor.RadnorMedSchool 1.0 | 160 | 32.7% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.6% |
| kawigi.sbf.TidalWave 0.8 | 160 | 31.9% |
| gh.nano.GrofGroup 1.1 | 160 | 30.2% |
| **All** | 2400 | 31.2% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip
