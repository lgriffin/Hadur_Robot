# Team bench

hadur117.HadurTeam 3.21bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1536174. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 713 over 39 battles (18.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 39 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 3 | 83.7% | 29/30 | 96.7% | 0 | 44 | 0 | 11/9553 | 0/834 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 80.1% | 29/30 | 96.7% | 0 | 49 | 0 | 9/8578 | 0/811 | 0 |
| rz.HOFSwarm 1.1 | 3 | 84.1% | 29/30 | 96.7% | 0 | 49 | 0 | 11/8784 | 0/842 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 80.9% | 29/30 | 96.7% | 0 | 37 | 0 | 22/8997 | 0/824 | 0 |
| kid.team.OmegaSquad .0.2 | 3 | 75.6% | 28/30 | 93.3% | 0 | 67 | 0 | 24/10255 | 0/642 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 3 | 68.9% | 24/30 | 80.0% | 0 | 56 | 0 | 6/8138 | 0/736 | 0 |
| tmnr.TMNR 1.01 | 3 | 86.9% | 30/30 | 100.0% | 0 | 76 | 0 | 25/8071 | 0/860 | 0 |
| myl.micro.TroodonPack 1.10 | 3 | 87.8% | 30/30 | 100.0% | 0 | 77 | 0 | 24/7810 | 0/866 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 3 | 81.4% | 29/30 | 96.7% | 0 | 59 | 0 | 57/9052 | 0/821 | 0 |
| bvh.team.Valkiries 1.0 | 3 | 83.5% | 30/30 | 100.0% | 0 | 45 | 0 | 38/10342 | 0/821 | 0 |
| gh.mini.GrubbmGroup 0.4 | 3 | 85.9% | 29/30 | 96.7% | 0 | 78 | 0 | 84/9309 | 0/844 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 77.3% | 28/30 | 93.3% | 0 | 42 | 0 | 83/8222 | 0/778 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 85.0% | 30/30 | 100.0% | 0 | 34 | 0 | 78/8615 | 0/856 | 0 |
| **All** | 39 | 81.6% | 374/390 | 95.9% | 0 | 713 | 0 | 472/115726 | 0/10535 | 0 |

Members' team records (sums): teammate hits 2452, teammate bullet hits 14141, teammate collisions 185, shots held for the fire lane 8937, reports merged 5524830, drives fenced 12565.
Engine's count of our bullets that hit one of our own members: 3046.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 30 | 33.7% |
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 32.4% |
| rz.HOFSwarm 1.1 | 30 | 33.9% |
| davidalves.PhoenixTeam 0.54 | 30 | 30.8% |
| kid.team.OmegaSquad .0.2 | 30 | 38.2% |
| cx.mini.DemoniacNimrods 0.50 | 30 | 32.0% |
| tmnr.TMNR 1.01 | 30 | 32.4% |
| myl.micro.TroodonPack 1.10 | 30 | 29.2% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 30 | 30.6% |
| bvh.team.Valkiries 1.0 | 30 | 31.2% |
| gh.mini.GrubbmGroup 0.4 | 30 | 28.0% |
| apvteam.MambaTeam 0.7.5 | 30 | 32.0% |
| gh.nano.GrofGroup 1.1 | 30 | 31.2% |
| **All** | 390 | 32.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.21bb vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| rz.GlowingHawks 0.2 | 83.7% ± 2.2 | 83.8% ± 1.9 | -0.1 ± 3.8 |
| kawigi.micro.ArmyOfShiz 1.1 | 80.1% ± 8.2 | 84.0% ± 6.5 | -3.9 ± 6.1 |
| rz.HOFSwarm 1.1 | 84.1% ± 9.2 | 79.5% ± 7.9 | +4.6 ± 11.1 |
| davidalves.PhoenixTeam 0.54 | 80.9% ± 13.8 | 79.3% ± 6.9 | +1.6 ± 8.0 |
| kid.team.OmegaSquad .0.2 | 75.6% ± 12.3 | 73.4% ± 14.7 | +2.2 ± 22.5 |
| cx.mini.DemoniacNimrods 0.50 | 68.9% ± 5.9 | 74.8% ± 6.3 | -5.9 ± 6.6 |
| tmnr.TMNR 1.01 | 86.9% ± 6.0 | 82.3% ± 2.0 | +4.5 ± 6.0 |
| myl.micro.TroodonPack 1.10 | 87.8% ± 5.0 | 89.1% ± 5.0 | -1.3 ± 7.6 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 81.4% ± 10.2 | 80.4% ± 7.0 | +1.1 ± 4.5 |
| bvh.team.Valkiries 1.0 | 83.5% ± 2.9 | 78.8% ± 9.6 | +4.6 ± 9.3 |
| gh.mini.GrubbmGroup 0.4 | 85.9% ± 7.8 | 88.1% ± 5.0 | -2.2 ± 10.6 |
| apvteam.MambaTeam 0.7.5 | 77.3% ± 4.6 | 81.1% ± 7.5 | -3.8 ± 9.2 |
| gh.nano.GrofGroup 1.1 | 85.0% ± 5.1 | 81.4% ± 8.7 | +3.6 ± 5.6 |
| **All** | 81.6% ± 1.9 | 81.2% ± 1.6 | +0.4 ± 1.5 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| rz.GlowingHawks 0.2 | 3 of 3 | 3 of 3 | 3 |
| kawigi.micro.ArmyOfShiz 1.1 | 3 of 3 | 3 of 3 | 3 |
| rz.HOFSwarm 1.1 | 3 of 3 | 3 of 3 | 3 |
| davidalves.PhoenixTeam 0.54 | 3 of 3 | 3 of 3 | 3 |
| kid.team.OmegaSquad .0.2 | 3 of 3 | 3 of 3 | 3 |
| cx.mini.DemoniacNimrods 0.50 | 3 of 3 | 3 of 3 | 3 |
| tmnr.TMNR 1.01 | 3 of 3 | 3 of 3 | 3 |
| myl.micro.TroodonPack 1.10 | 3 of 3 | 3 of 3 | 3 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 3 of 3 | 3 of 3 | 3 |
| bvh.team.Valkiries 1.0 | 3 of 3 | 3 of 3 | 3 |
| gh.mini.GrubbmGroup 0.4 | 3 of 3 | 3 of 3 | 3 |
| apvteam.MambaTeam 0.7.5 | 3 of 3 | 3 of 3 | 3 |
| gh.nano.GrofGroup 1.1 | 3 of 3 | 3 of 3 | 3 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 95.9% ± 2.4 | 95.4% ± 2.3 | +0.5 ± 2.7 |
| Survival | 95.9% ± 2.4 | 95.4% ± 2.3 | +0.5 ± 2.7 |
| In-lane shots | 0.4% ± 0.1 | 0.4% ± 0.1 | -0.0 ± 0.1 |
| Focus fire | 32.0% ± 0.9 | 32.1% ± 0.8 | -0.1 ± 0.7 |
| Bullets on own members | 78.10 ± 4.48 | 79.38 ± 4.36 | -1.3 ± 6.0 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 731 over 39 battles (18.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 39 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 3 | 83.8% | 30/30 | 100.0% | 0 | 76 | 0 | 20/9436 | 0/843 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 84.0% | 28/30 | 93.3% | 0 | 42 | 0 | 7/8248 | 0/839 | 0 |
| rz.HOFSwarm 1.1 | 3 | 79.5% | 28/30 | 93.3% | 0 | 57 | 0 | 9/8904 | 0/808 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 79.3% | 27/30 | 90.0% | 0 | 48 | 0 | 23/9110 | 0/814 | 0 |
| kid.team.OmegaSquad .0.2 | 3 | 73.4% | 26/30 | 86.7% | 0 | 52 | 0 | 17/10719 | 0/631 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 3 | 74.8% | 27/30 | 90.0% | 0 | 51 | 0 | 19/8569 | 0/779 | 0 |
| tmnr.TMNR 1.01 | 3 | 82.3% | 30/30 | 100.0% | 0 | 78 | 0 | 14/8152 | 0/828 | 0 |
| myl.micro.TroodonPack 1.10 | 3 | 89.1% | 30/30 | 100.0% | 0 | 63 | 0 | 18/7385 | 0/875 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 3 | 80.4% | 29/30 | 96.7% | 0 | 77 | 0 | 64/8915 | 0/809 | 0 |
| bvh.team.Valkiries 1.0 | 3 | 78.8% | 29/30 | 96.7% | 0 | 50 | 0 | 25/9841 | 0/776 | 0 |
| gh.mini.GrubbmGroup 0.4 | 3 | 88.1% | 30/30 | 100.0% | 0 | 80 | 0 | 87/8559 | 0/857 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 81.1% | 29/30 | 96.7% | 0 | 31 | 0 | 92/8446 | 0/819 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 81.4% | 29/30 | 96.7% | 0 | 26 | 0 | 116/8848 | 0/815 | 0 |
| **All** | 39 | 81.2% | 372/390 | 95.4% | 0 | 731 | 0 | 511/115132 | 0/10493 | 0 |

Members' team records (sums): teammate hits 2452, teammate bullet hits 14093, teammate collisions 108, shots held for the fire lane 8810, reports merged 5541501, drives fenced 10663.
Engine's count of our bullets that hit one of our own members: 3096.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 30 | 33.3% |
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 32.8% |
| rz.HOFSwarm 1.1 | 30 | 31.7% |
| davidalves.PhoenixTeam 0.54 | 30 | 29.9% |
| kid.team.OmegaSquad .0.2 | 30 | 37.7% |
| cx.mini.DemoniacNimrods 0.50 | 30 | 31.3% |
| tmnr.TMNR 1.01 | 30 | 33.9% |
| myl.micro.TroodonPack 1.10 | 30 | 29.6% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 30 | 30.9% |
| bvh.team.Valkiries 1.0 | 30 | 32.6% |
| gh.mini.GrubbmGroup 0.4 | 30 | 30.0% |
| apvteam.MambaTeam 0.7.5 | 30 | 33.6% |
| gh.nano.GrofGroup 1.1 | 30 | 30.4% |
| **All** | 390 | 32.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc
