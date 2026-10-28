# Team bench

hadur2.HadurTeam 3.18.1bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2140 over 240 battles (8.9 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 240 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 53.0% | 60/160 | 37.5% | 0 | 121 | 0 | 105/37896 | 0/3009 | 0 |
| rz.GlowingHawks 0.2 | 16 | 75.2% | 129/160 | 80.6% | 0 | 134 | 0 | 76/43745 | 0/4026 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 73.2% | 134/160 | 83.8% | 0 | 131 | 0 | 58/41493 | 0/3987 | 0 |
| rz.HOFSwarm 1.1 | 16 | 64.4% | 113/160 | 70.6% | 0 | 166 | 0 | 75/38368 | 0/3545 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 76.2% | 127/160 | 79.4% | 0 | 94 | 0 | 100/40984 | 0/4116 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 75.1% | 128/160 | 80.0% | 0 | 132 | 0 | 89/48074 | 0/3363 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 16 | 70.3% | 122/160 | 76.3% | 0 | 133 | 0 | 53/36880 | 0/3890 | 0 |
| tmnr.TMNR 1.01 | 16 | 75.9% | 145/160 | 90.6% | 0 | 254 | 0 | 81/36712 | 0/4040 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 78.9% | 149/160 | 93.1% | 0 | 202 | 0 | 68/36604 | 0/4184 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 73.8% | 135/160 | 84.4% | 0 | 151 | 0 | 220/40041 | 0/3910 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 78.7% | 148/160 | 92.5% | 0 | 100 | 0 | 116/48246 | 0/4086 | 0 |
| radnor.RadnorMedSchool 1.0 | 16 | 88.7% | 158/160 | 98.8% | 0 | 111 | 0 | 448/34517 | 0/4538 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 81.9% | 149/160 | 93.1% | 0 | 193 | 0 | 347/42591 | 0/4222 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 77.5% | 142/160 | 88.8% | 0 | 103 | 0 | 135/39136 | 0/4134 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 80.6% | 151/160 | 94.4% | 0 | 115 | 0 | 425/38723 | 0/4248 | 0 |
| **All** | 240 | 74.9% | 1990/2400 | 82.9% | 0 | 2140 | 0 | 2396/604010 | 0/59298 | 0 |

Members' team records (sums): teammate hits 14344, teammate bullet hits 66477, teammate collisions 488, shots held for the fire lane 44319, reports merged 29584644, drives fenced 53422.
Engine's count of our bullets that hit one of our own members: 17585.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 30.5% |
| rz.GlowingHawks 0.2 | 160 | 32.0% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.0% |
| rz.HOFSwarm 1.1 | 160 | 33.0% |
| davidalves.PhoenixTeam 0.54 | 160 | 30.2% |
| kid.team.OmegaSquad .0.2 | 160 | 36.2% |
| cx.mini.DemoniacNimrods 0.50 | 160 | 30.4% |
| tmnr.TMNR 1.01 | 160 | 30.8% |
| myl.micro.TroodonPack 1.10 | 160 | 30.0% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 31.0% |
| bvh.team.Valkiries 1.0 | 160 | 30.0% |
| radnor.RadnorMedSchool 1.0 | 160 | 33.0% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.3% |
| kawigi.sbf.TidalWave 0.8 | 160 | 31.8% |
| gh.nano.GrofGroup 1.1 | 160 | 30.8% |
| **All** | 2400 | 31.3% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip

## Paired A/B: hadur2.HadurTeam 3.18.1bb vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 53.0% ± 4.3 | 54.5% ± 4.0 | -1.5 ± 5.8 |
| rz.GlowingHawks 0.2 | 75.2% ± 2.1 | 75.9% ± 2.7 | -0.7 ± 2.9 |
| kawigi.micro.ArmyOfShiz 1.1 | 73.2% ± 3.0 | 70.1% ± 3.6 | +3.1 ± 4.8 |
| rz.HOFSwarm 1.1 | 64.4% ± 4.0 | 64.2% ± 2.7 | +0.2 ± 3.9 |
| davidalves.PhoenixTeam 0.54 | 76.2% ± 1.8 | 75.7% ± 2.7 | +0.5 ± 3.3 |
| kid.team.OmegaSquad .0.2 | 75.1% ± 2.0 | 75.3% ± 3.1 | -0.2 ± 4.0 |
| cx.mini.DemoniacNimrods 0.50 | 70.3% ± 3.0 | 71.8% ± 2.4 | -1.6 ± 3.7 |
| tmnr.TMNR 1.01 | 75.9% ± 2.2 | 76.9% ± 2.2 | -1.1 ± 3.4 |
| myl.micro.TroodonPack 1.10 | 78.9% ± 2.0 | 79.2% ± 2.0 | -0.4 ± 2.8 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 73.8% ± 2.7 | 75.8% ± 2.6 | -2.0 ± 3.9 |
| bvh.team.Valkiries 1.0 | 78.7% ± 1.8 | 77.7% ± 3.4 | +1.0 ± 3.6 |
| radnor.RadnorMedSchool 1.0 | 88.7% ± 0.7 | 88.5% ± 1.1 | +0.2 ± 1.3 |
| gh.mini.GrubbmGroup 0.4 | 81.9% ± 1.7 | 84.2% ± 2.1 | -2.4 ± 1.6 |
| kawigi.sbf.TidalWave 0.8 | 77.5% ± 2.5 | 79.3% ± 2.1 | -1.8 ± 3.4 |
| gh.nano.GrofGroup 1.1 | 80.6% ± 2.4 | 81.0% ± 1.4 | -0.3 ± 2.8 |
| **All** | 74.9% ± 1.2 | 75.3% ± 1.2 | -0.5 ± 0.8 |

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
| Rounds won | 82.9% ± 2.3 | 84.1% ± 2.4 | -1.2 ± 2.0 |
| Survival | 82.9% ± 2.3 | 84.1% ± 2.4 | -1.2 ± 2.0 |
| In-lane shots | 0.4% ± 0.0 | 0.4% ± 0.0 | -0.0 ± 0.0 |
| Focus fire | 31.3% ± 0.3 | 31.3% ± 0.3 | +0.0 ± 0.3 |
| Bullets on own members | 73.27 ± 1.87 | 74.48 ± 2.05 | -1.2 ± 2.3 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 2122 over 240 battles (8.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 240 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 54.5% | 59/160 | 36.9% | 0 | 124 | 0 | 100/38338 | 0/3080 | 0 |
| rz.GlowingHawks 0.2 | 16 | 75.9% | 138/160 | 86.3% | 0 | 132 | 0 | 63/43262 | 0/4051 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 70.1% | 132/160 | 82.5% | 0 | 123 | 0 | 56/39576 | 0/3826 | 0 |
| rz.HOFSwarm 1.1 | 16 | 64.2% | 107/160 | 66.9% | 0 | 154 | 0 | 74/38621 | 0/3546 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 75.7% | 130/160 | 81.3% | 0 | 110 | 0 | 105/42426 | 0/4093 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 75.3% | 134/160 | 83.8% | 0 | 163 | 0 | 88/47577 | 0/3365 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 16 | 71.8% | 125/160 | 78.1% | 0 | 132 | 0 | 46/37869 | 0/3957 | 0 |
| tmnr.TMNR 1.01 | 16 | 76.9% | 154/160 | 96.3% | 0 | 191 | 0 | 95/37828 | 0/4094 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 79.2% | 150/160 | 93.8% | 0 | 184 | 0 | 78/36594 | 0/4201 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 75.8% | 143/160 | 89.4% | 0 | 172 | 0 | 217/41360 | 0/4007 | 0 |
| bvh.team.Valkiries 1.0 | 16 | 77.7% | 141/160 | 88.1% | 0 | 125 | 0 | 126/47045 | 0/4034 | 0 |
| radnor.RadnorMedSchool 1.0 | 16 | 88.5% | 159/160 | 99.4% | 0 | 117 | 0 | 447/35197 | 0/4548 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 84.2% | 156/160 | 97.5% | 0 | 171 | 0 | 368/41973 | 0/4341 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 79.3% | 139/160 | 86.9% | 0 | 95 | 0 | 155/38986 | 0/4197 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 81.0% | 152/160 | 95.0% | 0 | 129 | 0 | 410/40166 | 0/4253 | 0 |
| **All** | 240 | 75.3% | 2019/2400 | 84.1% | 0 | 2122 | 0 | 2428/606818 | 0/59593 | 0 |

Members' team records (sums): teammate hits 14659, teammate bullet hits 66214, teammate collisions 742, shots held for the fire lane 44884, reports merged 29708972, drives fenced 46706.
Engine's count of our bullets that hit one of our own members: 17876.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.4% |
| rz.GlowingHawks 0.2 | 160 | 31.4% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.4% |
| rz.HOFSwarm 1.1 | 160 | 32.0% |
| davidalves.PhoenixTeam 0.54 | 160 | 30.1% |
| kid.team.OmegaSquad .0.2 | 160 | 37.0% |
| cx.mini.DemoniacNimrods 0.50 | 160 | 29.7% |
| tmnr.TMNR 1.01 | 160 | 31.5% |
| myl.micro.TroodonPack 1.10 | 160 | 30.0% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 29.8% |
| bvh.team.Valkiries 1.0 | 160 | 30.2% |
| radnor.RadnorMedSchool 1.0 | 160 | 32.8% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.5% |
| kawigi.sbf.TidalWave 0.8 | 160 | 32.3% |
| gh.nano.GrofGroup 1.1 | 160 | 30.6% |
| **All** | 2400 | 31.3% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip
