# Team bench

cb.fire.FirestarterTeam 2.0 against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=2702082 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 63 over 84 battles (0.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 6 | 82.1% | 60/60 | 100.0% | 0 | 25 | 0 | 342/11296 | 0/0 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 6 | 83.8% | 59/60 | 98.3% | 0 | 1 | 0 | 250/12261 | 0/0 | 0 |
| rz.HOFSwarm 1.1 | 6 | 82.0% | 59/60 | 98.3% | 0 | 1 | 0 | 277/13527 | 0/0 | 0 |
| davidalves.PhoenixTeam 0.54 | 6 | 79.1% | 56/60 | 93.3% | 0 | 1 | 0 | 271/14420 | 0/0 | 0 |
| kid.team.OmegaSquad .0.2 | 6 | 79.5% | 58/60 | 96.7% | 0 | 0 | 0 | 237/16649 | 0/0 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 6 | 66.2% | 52/60 | 86.7% | 0 | 1 | 0 | 216/11026 | 0/0 | 0 |
| tmnr.TMNR 1.01 | 6 | 83.3% | 60/60 | 100.0% | 0 | 16 | 0 | 260/12227 | 0/0 | 0 |
| myl.micro.TroodonPack 1.10 | 6 | 90.4% | 60/60 | 100.0% | 0 | 0 | 0 | 274/9248 | 0/0 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 6 | 84.6% | 60/60 | 100.0% | 0 | 0 | 0 | 506/11616 | 0/0 | 0 |
| bvh.team.Valkiries 1.0 | 6 | 82.0% | 60/60 | 100.0% | 0 | 1 | 0 | 257/12224 | 0/0 | 0 |
| gh.mini.GrubbmGroup 0.4 | 6 | 88.7% | 60/60 | 100.0% | 0 | 0 | 0 | 324/10628 | 0/0 | 0 |
| apvteam.MambaTeam 0.7.5 | 6 | 82.0% | 60/60 | 100.0% | 0 | 0 | 0 | 373/10433 | 0/0 | 0 |
| kawigi.sbf.TidalWave 0.8 | 6 | 83.6% | 60/60 | 100.0% | 0 | 17 | 0 | 187/9980 | 0/0 | 0 |
| gh.nano.GrofGroup 1.1 | 6 | 90.5% | 60/60 | 100.0% | 0 | 0 | 0 | 295/9149 | 0/0 | 0 |
| **All** | 84 | 82.7% | 824/840 | 98.1% | 0 | 63 | 0 | 4069/164684 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 679.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 60 | 36.2% |
| kawigi.micro.ArmyOfShiz 1.1 | 60 | 34.7% |
| rz.HOFSwarm 1.1 | 60 | 34.1% |
| davidalves.PhoenixTeam 0.54 | 60 | 30.9% |
| kid.team.OmegaSquad .0.2 | 60 | 38.3% |
| cx.mini.DemoniacNimrods 0.50 | 60 | 35.0% |
| tmnr.TMNR 1.01 | 60 | 32.4% |
| myl.micro.TroodonPack 1.10 | 60 | 32.0% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 60 | 32.7% |
| bvh.team.Valkiries 1.0 | 60 | 34.0% |
| gh.mini.GrubbmGroup 0.4 | 60 | 31.8% |
| apvteam.MambaTeam 0.7.5 | 60 | 33.3% |
| kawigi.sbf.TidalWave 0.8 | 60 | 35.4% |
| gh.nano.GrofGroup 1.1 | 60 | 33.1% |
| **All** | 840 | 33.8% |

Data files written (any battle): kawigi\sbf\FloodHT.data\enemies.zip
