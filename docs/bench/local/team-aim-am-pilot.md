# Team bench

hadur117.HadurTeam 3.21am against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1494875. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 736 over 39 battles (18.9 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 39 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 3 | 79.4% | 27/30 | 90.0% | 0 | 77 | 0 | 22/9552 | 0/815 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 78.8% | 30/30 | 100.0% | 0 | 49 | 0 | 12/9030 | 0/799 | 0 |
| rz.HOFSwarm 1.1 | 3 | 81.0% | 29/30 | 96.7% | 0 | 56 | 0 | 22/8958 | 0/823 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 76.0% | 25/30 | 83.3% | 0 | 45 | 0 | 19/8842 | 0/782 | 0 |
| kid.team.OmegaSquad .0.2 | 3 | 71.8% | 23/30 | 76.7% | 0 | 64 | 0 | 29/10203 | 0/619 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 3 | 73.2% | 27/30 | 90.0% | 0 | 56 | 0 | 14/8088 | 0/768 | 0 |
| tmnr.TMNR 1.01 | 3 | 81.0% | 30/30 | 100.0% | 0 | 69 | 0 | 15/8242 | 0/814 | 0 |
| myl.micro.TroodonPack 1.10 | 3 | 86.9% | 30/30 | 100.0% | 0 | 71 | 0 | 25/7601 | 0/854 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 3 | 79.2% | 28/30 | 93.3% | 0 | 58 | 0 | 48/9132 | 0/795 | 0 |
| bvh.team.Valkiries 1.0 | 3 | 83.9% | 30/30 | 100.0% | 0 | 39 | 0 | 32/10011 | 0/823 | 0 |
| gh.mini.GrubbmGroup 0.4 | 3 | 83.0% | 28/30 | 93.3% | 0 | 59 | 0 | 113/9323 | 0/813 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 79.6% | 29/30 | 96.7% | 0 | 49 | 0 | 103/8654 | 0/809 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 78.7% | 28/30 | 93.3% | 0 | 44 | 0 | 112/8671 | 0/796 | 0 |
| **All** | 39 | 79.4% | 364/390 | 93.3% | 0 | 736 | 0 | 566/116307 | 0/10310 | 0 |

Members' team records (sums): teammate hits 2296, teammate bullet hits 14220, teammate collisions 142, shots held for the fire lane 8808, reports merged 5541546, drives fenced 12087.
Engine's count of our bullets that hit one of our own members: 2865.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 30 | 32.5% |
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 31.0% |
| rz.HOFSwarm 1.1 | 30 | 31.3% |
| davidalves.PhoenixTeam 0.54 | 30 | 30.9% |
| kid.team.OmegaSquad .0.2 | 30 | 36.7% |
| cx.mini.DemoniacNimrods 0.50 | 30 | 31.5% |
| tmnr.TMNR 1.01 | 30 | 34.0% |
| myl.micro.TroodonPack 1.10 | 30 | 29.6% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 30 | 29.9% |
| bvh.team.Valkiries 1.0 | 30 | 33.4% |
| gh.mini.GrubbmGroup 0.4 | 30 | 27.7% |
| apvteam.MambaTeam 0.7.5 | 30 | 30.9% |
| gh.nano.GrofGroup 1.1 | 30 | 30.1% |
| **All** | 390 | 31.5% |

Data files written (any battle): hadur117\Hadur.data\health.hc

## Paired A/B: hadur117.HadurTeam 3.21am vs hadur117.HadurTeam 3.21aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| rz.GlowingHawks 0.2 | 79.4% ± 7.5 | 84.1% ± 3.0 | -4.7 ± 5.9 |
| kawigi.micro.ArmyOfShiz 1.1 | 78.8% ± 0.9 | 81.6% ± 5.4 | -2.8 ± 5.8 |
| rz.HOFSwarm 1.1 | 81.0% ± 4.4 | 76.9% ± 15.7 | +4.0 ± 16.4 |
| davidalves.PhoenixTeam 0.54 | 76.0% ± 17.8 | 80.7% ± 10.4 | -4.7 ± 14.4 |
| kid.team.OmegaSquad .0.2 | 71.8% ± 13.6 | 76.4% ± 9.7 | -4.6 ± 21.8 |
| cx.mini.DemoniacNimrods 0.50 | 73.2% ± 6.2 | 68.9% ± 3.2 | +4.3 ± 4.6 |
| tmnr.TMNR 1.01 | 81.0% ± 8.3 | 85.4% ± 3.6 | -4.5 ± 11.9 |
| myl.micro.TroodonPack 1.10 | 86.9% ± 9.2 | 88.5% ± 6.8 | -1.6 ± 10.0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 79.2% ± 15.1 | 81.0% ± 12.5 | -1.7 ± 3.5 |
| bvh.team.Valkiries 1.0 | 83.9% ± 6.1 | 85.0% ± 6.8 | -1.1 ± 6.4 |
| gh.mini.GrubbmGroup 0.4 | 83.0% ± 7.4 | 88.0% ± 4.6 | -5.0 ± 5.7 |
| apvteam.MambaTeam 0.7.5 | 79.6% ± 3.2 | 71.2% ± 25.1 | +8.4 ± 28.3 |
| gh.nano.GrofGroup 1.1 | 78.7% ± 2.1 | 84.0% ± 6.9 | -5.3 ± 9.0 |
| **All** | 79.4% ± 1.6 | 80.9% ± 2.2 | -1.5 ± 2.0 |

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
| Rounds won | 93.3% ± 3.2 | 94.4% ± 2.9 | -1.0 ± 3.0 |
| Survival | 93.3% ± 3.2 | 94.4% ± 2.9 | -1.0 ± 3.0 |
| In-lane shots | 0.5% ± 0.1 | 0.4% ± 0.1 | +0.1 ± 0.1 |
| Focus fire | 31.5% ± 0.9 | 31.4% ± 0.7 | +0.1 ± 0.7 |
| Bullets on own members | 73.46 ± 5.04 | 79.95 ± 4.87 | -6.5 ± 6.2 |

## Team bench

hadur117.HadurTeam 3.21aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 694 over 39 battles (17.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 39 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 3 | 84.1% | 30/30 | 100.0% | 0 | 53 | 0 | 11/9433 | 0/845 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 3 | 81.6% | 30/30 | 100.0% | 0 | 42 | 0 | 12/8473 | 0/828 | 0 |
| rz.HOFSwarm 1.1 | 3 | 76.9% | 27/30 | 90.0% | 0 | 45 | 0 | 17/9046 | 0/785 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 80.7% | 27/30 | 90.0% | 0 | 43 | 0 | 11/9316 | 0/827 | 0 |
| kid.team.OmegaSquad .0.2 | 3 | 76.4% | 25/30 | 83.3% | 0 | 41 | 0 | 12/10603 | 0/650 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 3 | 68.9% | 25/30 | 83.3% | 0 | 55 | 0 | 13/8185 | 0/732 | 0 |
| tmnr.TMNR 1.01 | 3 | 85.4% | 30/30 | 100.0% | 0 | 68 | 0 | 17/8138 | 0/851 | 0 |
| myl.micro.TroodonPack 1.10 | 3 | 88.5% | 30/30 | 100.0% | 0 | 69 | 0 | 22/7431 | 0/858 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 3 | 81.0% | 28/30 | 93.3% | 0 | 75 | 0 | 70/9374 | 0/812 | 0 |
| bvh.team.Valkiries 1.0 | 3 | 85.0% | 30/30 | 100.0% | 0 | 49 | 0 | 17/10401 | 0/833 | 0 |
| gh.mini.GrubbmGroup 0.4 | 3 | 88.0% | 30/30 | 100.0% | 0 | 76 | 0 | 68/9274 | 0/864 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 71.2% | 26/30 | 86.7% | 0 | 41 | 0 | 87/8072 | 0/734 | 0 |
| gh.nano.GrofGroup 1.1 | 3 | 84.0% | 30/30 | 100.0% | 0 | 37 | 0 | 96/8737 | 0/841 | 0 |
| **All** | 39 | 80.9% | 368/390 | 94.4% | 0 | 694 | 0 | 453/116483 | 0/10460 | 0 |

Members' team records (sums): teammate hits 2557, teammate bullet hits 14521, teammate collisions 236, shots held for the fire lane 9181, reports merged 5607514, drives fenced 13700.
Engine's count of our bullets that hit one of our own members: 3118.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 30 | 31.5% |
| kawigi.micro.ArmyOfShiz 1.1 | 30 | 29.7% |
| rz.HOFSwarm 1.1 | 30 | 32.6% |
| davidalves.PhoenixTeam 0.54 | 30 | 31.0% |
| kid.team.OmegaSquad .0.2 | 30 | 36.8% |
| cx.mini.DemoniacNimrods 0.50 | 30 | 31.6% |
| tmnr.TMNR 1.01 | 30 | 32.3% |
| myl.micro.TroodonPack 1.10 | 30 | 29.9% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 30 | 29.6% |
| bvh.team.Valkiries 1.0 | 30 | 31.7% |
| gh.mini.GrubbmGroup 0.4 | 30 | 28.2% |
| apvteam.MambaTeam 0.7.5 | 30 | 32.3% |
| gh.nano.GrofGroup 1.1 | 30 | 30.6% |
| **All** | 390 | 31.4% |

Data files written (any battle): hadur117\Hadur.data\health.hc
