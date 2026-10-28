# Team bench

hadur2.HadurTeam 3.18.1hr20 against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=4142019. Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 561 over 132 battles (4.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 132 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 6 | 28.5% | 2/60 | 3.3% | 0 | 29 | 0 | 44/10722 | 0/682 | 0 |
| mn.CombatTeam 3.25.0 | 6 | 55.7% | 20/60 | 33.3% | 0 | 32 | 0 | 51/14400 | 0/1200 | 0 |
| cb.fire.FirestarterTeam 2.0 | 6 | 50.6% | 12/60 | 20.0% | 0 | 26 | 0 | 11/13538 | 0/1111 | 0 |
| abc.ShadowTeam 3.83 | 6 | 54.2% | 22/60 | 36.7% | 0 | 29 | 0 | 44/13826 | 0/1154 | 0 |
| rz.AlephTeam 0.34 | 6 | 46.4% | 10/60 | 16.7% | 0 | 34 | 0 | 41/12695 | 0/1043 | 0 |
| ustimaw.NightmareTeam 3.3 | 6 | 45.8% | 41/60 | 68.3% | 0 | 24 | 0 | 162/8139 | 0/908 | 0 |
| florent.XSeries.Xmen 0.9 | 6 | 57.7% | 34/60 | 56.7% | 0 | 44 | 0 | 85/13540 | 0/1218 | 0 |
| ags.polylunar.Polylunar 1.6 | 6 | 53.3% | 45/60 | 75.0% | 0 | 11 | 0 | 274/6258 | 0/1070 | 0 |
| rz.GlowingHawks 0.2 | 6 | 70.2% | 42/60 | 70.0% | 0 | 19 | 0 | 34/15425 | 0/1431 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 6 | 68.0% | 49/60 | 81.7% | 0 | 32 | 0 | 26/14917 | 0/1399 | 0 |
| rz.HOFSwarm 1.1 | 6 | 63.7% | 35/60 | 58.3% | 0 | 30 | 0 | 31/14595 | 0/1327 | 0 |
| davidalves.PhoenixTeam 0.54 | 6 | 74.8% | 48/60 | 80.0% | 0 | 31 | 0 | 44/15834 | 0/1524 | 0 |
| kid.team.OmegaSquad .0.2 | 6 | 65.3% | 35/60 | 58.3% | 0 | 15 | 0 | 28/16928 | 0/1141 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 6 | 72.2% | 48/60 | 80.0% | 0 | 21 | 0 | 18/13570 | 0/1493 | 0 |
| tmnr.TMNR 1.01 | 6 | 80.8% | 59/60 | 98.3% | 0 | 37 | 0 | 22/14290 | 0/1601 | 0 |
| myl.micro.TroodonPack 1.10 | 6 | 84.7% | 60/60 | 100.0% | 0 | 17 | 0 | 44/13717 | 0/1669 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 6 | 74.6% | 51/60 | 85.0% | 0 | 23 | 0 | 89/15144 | 0/1469 | 0 |
| bvh.team.Valkiries 1.0 | 6 | 72.6% | 51/60 | 85.0% | 0 | 28 | 0 | 78/17496 | 0/1424 | 0 |
| radnor.RadnorMedSchool 1.0 | 6 | 87.8% | 60/60 | 100.0% | 0 | 16 | 0 | 184/13255 | 0/1696 | 0 |
| gh.mini.GrubbmGroup 0.4 | 6 | 82.5% | 57/60 | 95.0% | 0 | 27 | 0 | 143/15331 | 0/1617 | 0 |
| kawigi.sbf.TidalWave 0.8 | 6 | 74.5% | 53/60 | 88.3% | 0 | 21 | 0 | 80/14689 | 0/1492 | 0 |
| gh.nano.GrofGroup 1.1 | 6 | 83.3% | 59/60 | 98.3% | 0 | 15 | 0 | 171/14659 | 0/1646 | 0 |
| **All** | 132 | 65.8% | 893/1320 | 67.7% | 0 | 561 | 0 | 1704/302968 | 0/29315 | 0 |

Members' team records (sums): teammate hits 8039, teammate bullet hits 30772, teammate collisions 172, shots held for the fire lane 22274, reports merged 14635470, drives fenced 21932.
Engine's count of our bullets that hit one of our own members: 9654.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 60 | 36.0% |
| mn.CombatTeam 3.25.0 | 60 | 30.8% |
| cb.fire.FirestarterTeam 2.0 | 60 | 32.3% |
| abc.ShadowTeam 3.83 | 60 | 30.7% |
| rz.AlephTeam 0.34 | 60 | 31.9% |
| ustimaw.NightmareTeam 3.3 | 60 | 33.7% |
| florent.XSeries.Xmen 0.9 | 60 | 29.5% |
| ags.polylunar.Polylunar 1.6 | 60 | 32.4% |
| rz.GlowingHawks 0.2 | 60 | 31.0% |
| kawigi.micro.ArmyOfShiz 1.1 | 60 | 30.7% |
| rz.HOFSwarm 1.1 | 60 | 32.4% |
| davidalves.PhoenixTeam 0.54 | 60 | 31.0% |
| kid.team.OmegaSquad .0.2 | 60 | 37.0% |
| cx.mini.DemoniacNimrods 0.50 | 60 | 31.0% |
| tmnr.TMNR 1.01 | 60 | 30.2% |
| myl.micro.TroodonPack 1.10 | 60 | 28.7% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 60 | 29.6% |
| bvh.team.Valkiries 1.0 | 60 | 29.1% |
| radnor.RadnorMedSchool 1.0 | 60 | 32.4% |
| gh.mini.GrubbmGroup 0.4 | 60 | 29.3% |
| kawigi.sbf.TidalWave 0.8 | 60 | 31.5% |
| gh.nano.GrofGroup 1.1 | 60 | 31.2% |
| **All** | 1320 | 31.5% |

Data files written (any battle): abc/Shadow.data/Shadow.properties, hadur2/Hadur.data/health.hc, kawigi/sbf/FloodHT.data/enemies.zip

## Paired A/B: hadur2.HadurTeam 3.18.1hr20 vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 28.5% ± 5.6 | 34.7% ± 6.6 | -6.2 ± 11.3 |
| mn.CombatTeam 3.25.0 | 55.7% ± 6.0 | 61.3% ± 4.5 | -5.6 ± 9.8 |
| cb.fire.FirestarterTeam 2.0 | 50.6% ± 7.0 | 46.9% ± 5.5 | +3.7 ± 8.3 |
| abc.ShadowTeam 3.83 | 54.2% ± 7.6 | 52.0% ± 6.3 | +2.1 ± 11.0 |
| rz.AlephTeam 0.34 | 46.4% ± 2.3 | 52.4% ± 7.7 | -6.0 ± 7.3 |
| ustimaw.NightmareTeam 3.3 | 45.8% ± 5.2 | 50.7% ± 8.5 | -4.9 ± 11.9 |
| florent.XSeries.Xmen 0.9 | 57.7% ± 5.0 | 60.8% ± 8.2 | -3.1 ± 8.5 |
| ags.polylunar.Polylunar 1.6 | 53.3% ± 4.9 | 54.5% ± 6.1 | -1.2 ± 4.1 |
| rz.GlowingHawks 0.2 | 70.2% ± 7.2 | 79.0% ± 2.0 | -8.8 ± 7.6 |
| kawigi.micro.ArmyOfShiz 1.1 | 68.0% ± 6.5 | 69.2% ± 6.3 | -1.2 ± 10.2 |
| rz.HOFSwarm 1.1 | 63.7% ± 9.3 | 66.3% ± 6.0 | -2.6 ± 9.5 |
| davidalves.PhoenixTeam 0.54 | 74.8% ± 4.1 | 74.5% ± 5.2 | +0.3 ± 3.1 |
| kid.team.OmegaSquad .0.2 | 65.3% ± 7.2 | 74.0% ± 5.2 | -8.7 ± 8.5 |
| cx.mini.DemoniacNimrods 0.50 | 72.2% ± 5.2 | 67.7% ± 5.2 | +4.5 ± 5.0 |
| tmnr.TMNR 1.01 | 80.8% ± 2.6 | 76.0% ± 6.4 | +4.8 ± 6.9 |
| myl.micro.TroodonPack 1.10 | 84.7% ± 2.2 | 81.0% ± 4.0 | +3.7 ± 2.6 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 74.6% ± 6.8 | 75.8% ± 3.3 | -1.2 ± 6.8 |
| bvh.team.Valkiries 1.0 | 72.6% ± 5.0 | 79.8% ± 4.1 | -7.3 ± 6.2 |
| radnor.RadnorMedSchool 1.0 | 87.8% ± 3.0 | 89.6% ± 2.0 | -1.8 ± 3.6 |
| gh.mini.GrubbmGroup 0.4 | 82.5% ± 3.3 | 82.0% ± 3.9 | +0.5 ± 3.5 |
| kawigi.sbf.TidalWave 0.8 | 74.5% ± 3.4 | 79.9% ± 3.8 | -5.4 ± 4.7 |
| gh.nano.GrofGroup 1.1 | 83.3% ± 2.3 | 82.5% ± 2.5 | +0.8 ± 4.3 |
| **All** | 65.8% ± 2.7 | 67.8% ± 2.5 | -2.0 ± 1.3 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| cz.libors.OgiTeam v1 | 6 of 6 | 6 of 6 | 6 |
| mn.CombatTeam 3.25.0 | 6 of 6 | 6 of 6 | 6 |
| cb.fire.FirestarterTeam 2.0 | 6 of 6 | 6 of 6 | 6 |
| abc.ShadowTeam 3.83 | 6 of 6 | 6 of 6 | 6 |
| rz.AlephTeam 0.34 | 6 of 6 | 6 of 6 | 6 |
| ustimaw.NightmareTeam 3.3 | 6 of 6 | 6 of 6 | 6 |
| florent.XSeries.Xmen 0.9 | 6 of 6 | 6 of 6 | 6 |
| ags.polylunar.Polylunar 1.6 | 6 of 6 | 6 of 6 | 6 |
| rz.GlowingHawks 0.2 | 6 of 6 | 6 of 6 | 6 |
| kawigi.micro.ArmyOfShiz 1.1 | 6 of 6 | 6 of 6 | 6 |
| rz.HOFSwarm 1.1 | 6 of 6 | 6 of 6 | 6 |
| davidalves.PhoenixTeam 0.54 | 6 of 6 | 6 of 6 | 6 |
| kid.team.OmegaSquad .0.2 | 6 of 6 | 6 of 6 | 6 |
| cx.mini.DemoniacNimrods 0.50 | 6 of 6 | 6 of 6 | 6 |
| tmnr.TMNR 1.01 | 6 of 6 | 6 of 6 | 6 |
| myl.micro.TroodonPack 1.10 | 6 of 6 | 6 of 6 | 6 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 6 of 6 | 6 of 6 | 6 |
| bvh.team.Valkiries 1.0 | 6 of 6 | 6 of 6 | 6 |
| radnor.RadnorMedSchool 1.0 | 6 of 6 | 6 of 6 | 6 |
| gh.mini.GrubbmGroup 0.4 | 6 of 6 | 6 of 6 | 6 |
| kawigi.sbf.TidalWave 0.8 | 6 of 6 | 6 of 6 | 6 |
| gh.nano.GrofGroup 1.1 | 6 of 6 | 6 of 6 | 6 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 67.7% ± 5.2 | 70.8% ± 5.0 | -3.2 ± 2.8 |
| Survival | 67.7% ± 5.2 | 70.8% ± 5.0 | -3.2 ± 2.8 |
| In-lane shots | 0.7% ± 0.2 | 0.6% ± 0.2 | +0.1 ± 0.1 |
| Focus fire | 31.5% ± 0.4 | 31.4% ± 0.4 | +0.1 ± 0.4 |
| Bullets on own members | 73.14 ± 3.81 | 67.26 ± 3.39 | +5.9 ± 3.1 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 594 over 132 battles (4.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 132 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam v1 | 6 | 34.7% | 5/60 | 8.3% | 0 | 25 | 0 | 40/12072 | 0/799 | 0 |
| mn.CombatTeam 3.25.0 | 6 | 61.3% | 23/60 | 38.3% | 0 | 37 | 0 | 47/16028 | 0/1286 | 0 |
| cb.fire.FirestarterTeam 2.0 | 6 | 46.9% | 10/60 | 16.7% | 0 | 77 | 0 | 14/13244 | 0/1046 | 0 |
| abc.ShadowTeam 3.83 | 6 | 52.0% | 21/60 | 35.0% | 0 | 31 | 0 | 37/13750 | 0/1111 | 0 |
| rz.AlephTeam 0.34 | 6 | 52.4% | 16/60 | 26.7% | 0 | 22 | 0 | 17/14172 | 0/1146 | 0 |
| ustimaw.NightmareTeam 3.3 | 6 | 50.7% | 45/60 | 75.0% | 0 | 23 | 0 | 157/8262 | 0/1005 | 0 |
| florent.XSeries.Xmen 0.9 | 6 | 60.8% | 39/60 | 65.0% | 0 | 23 | 0 | 59/13898 | 0/1266 | 0 |
| ags.polylunar.Polylunar 1.6 | 6 | 54.5% | 49/60 | 81.7% | 0 | 8 | 0 | 260/6127 | 0/1084 | 0 |
| rz.GlowingHawks 0.2 | 6 | 79.0% | 53/60 | 88.3% | 0 | 39 | 0 | 46/16820 | 0/1586 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 6 | 69.2% | 46/60 | 76.7% | 0 | 28 | 0 | 25/15226 | 0/1427 | 0 |
| rz.HOFSwarm 1.1 | 6 | 66.3% | 41/60 | 68.3% | 0 | 28 | 0 | 27/14543 | 0/1363 | 0 |
| davidalves.PhoenixTeam 0.54 | 6 | 74.5% | 45/60 | 75.0% | 0 | 32 | 0 | 20/15305 | 0/1525 | 0 |
| kid.team.OmegaSquad .0.2 | 6 | 74.0% | 48/60 | 80.0% | 0 | 15 | 0 | 22/17683 | 0/1241 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 6 | 67.7% | 40/60 | 66.7% | 0 | 28 | 0 | 26/14095 | 0/1424 | 0 |
| tmnr.TMNR 1.01 | 6 | 76.0% | 56/60 | 93.3% | 0 | 26 | 0 | 31/13478 | 0/1521 | 0 |
| myl.micro.TroodonPack 1.10 | 6 | 81.0% | 60/60 | 100.0% | 0 | 20 | 0 | 35/13257 | 0/1594 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 6 | 75.8% | 51/60 | 85.0% | 0 | 28 | 0 | 90/15954 | 0/1506 | 0 |
| bvh.team.Valkiries 1.0 | 6 | 79.8% | 55/60 | 91.7% | 0 | 26 | 0 | 57/17749 | 0/1561 | 0 |
| radnor.RadnorMedSchool 1.0 | 6 | 89.6% | 60/60 | 100.0% | 0 | 21 | 0 | 155/12703 | 0/1713 | 0 |
| gh.mini.GrubbmGroup 0.4 | 6 | 82.0% | 58/60 | 96.7% | 0 | 20 | 0 | 126/16066 | 0/1591 | 0 |
| kawigi.sbf.TidalWave 0.8 | 6 | 79.9% | 57/60 | 95.0% | 0 | 16 | 0 | 51/15320 | 0/1581 | 0 |
| gh.nano.GrofGroup 1.1 | 6 | 82.5% | 57/60 | 95.0% | 0 | 21 | 0 | 158/14436 | 0/1630 | 0 |
| **All** | 132 | 67.8% | 935/1320 | 70.8% | 0 | 594 | 0 | 1500/310188 | 0/30006 | 0 |

Members' team records (sums): teammate hits 7170, teammate bullet hits 31287, teammate collisions 461, shots held for the fire lane 22695, reports merged 15070667, drives fenced 20482.
Engine's count of our bullets that hit one of our own members: 8878.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| cz.libors.OgiTeam v1 | 60 | 32.3% |
| mn.CombatTeam 3.25.0 | 60 | 28.8% |
| cb.fire.FirestarterTeam 2.0 | 60 | 32.5% |
| abc.ShadowTeam 3.83 | 60 | 31.6% |
| rz.AlephTeam 0.34 | 60 | 31.6% |
| ustimaw.NightmareTeam 3.3 | 60 | 33.4% |
| florent.XSeries.Xmen 0.9 | 60 | 32.0% |
| ags.polylunar.Polylunar 1.6 | 60 | 32.2% |
| rz.GlowingHawks 0.2 | 60 | 32.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 60 | 31.9% |
| rz.HOFSwarm 1.1 | 60 | 31.5% |
| davidalves.PhoenixTeam 0.54 | 60 | 30.4% |
| kid.team.OmegaSquad .0.2 | 60 | 36.3% |
| cx.mini.DemoniacNimrods 0.50 | 60 | 30.5% |
| tmnr.TMNR 1.01 | 60 | 30.7% |
| myl.micro.TroodonPack 1.10 | 60 | 28.8% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 60 | 28.9% |
| bvh.team.Valkiries 1.0 | 60 | 29.6% |
| radnor.RadnorMedSchool 1.0 | 60 | 33.3% |
| gh.mini.GrubbmGroup 0.4 | 60 | 29.7% |
| kawigi.sbf.TidalWave 0.8 | 60 | 31.5% |
| gh.nano.GrofGroup 1.1 | 60 | 31.4% |
| **All** | 1320 | 31.4% |

Data files written (any battle): hadur2/Hadur.data/health.hc, kawigi/sbf/FloodHT.data/enemies.zip
