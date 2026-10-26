# Team bench

mn.CombatTeam 3.25.0 against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=2702082 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 95 over 84 battles (1.1 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowingHawks 0.2 | 6 | 78.5% | 58/60 | 96.7% | 0 | 5 | 0 | 301/14833 | 0/0 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 6 | 82.2% | 58/60 | 96.7% | 0 | 0 | 0 | 264/14878 | 0/0 | 0 |
| rz.HOFSwarm 1.1 | 6 | 75.3% | 57/60 | 95.0% | 0 | 27 | 0 | 330/15965 | 0/0 | 0 |
| davidalves.PhoenixTeam 0.54 | 6 | 82.5% | 59/60 | 98.3% | 0 | 0 | 0 | 245/14922 | 0/0 | 0 |
| kid.team.OmegaSquad .0.2 | 6 | 82.8% | 58/60 | 96.7% | 0 | 9 | 0 | 174/17882 | 0/0 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 6 | 79.4% | 56/60 | 93.3% | 0 | 4 | 0 | 272/13816 | 0/0 | 0 |
| tmnr.TMNR 1.01 | 6 | 86.3% | 60/60 | 100.0% | 0 | 0 | 0 | 344/13438 | 0/0 | 0 |
| myl.micro.TroodonPack 1.10 | 6 | 87.3% | 60/60 | 100.0% | 0 | 6 | 0 | 424/12727 | 0/0 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 6 | 82.4% | 59/60 | 98.3% | 0 | 16 | 0 | 732/14653 | 0/0 | 0 |
| bvh.team.Valkiries 1.0 | 6 | 81.3% | 60/60 | 100.0% | 0 | 0 | 0 | 265/13447 | 0/0 | 0 |
| gh.mini.GrubbmGroup 0.4 | 6 | 84.3% | 60/60 | 100.0% | 0 | 12 | 0 | 372/15822 | 0/0 | 0 |
| apvteam.MambaTeam 0.7.5 | 6 | 79.2% | 60/60 | 100.0% | 0 | 8 | 0 | 401/15047 | 0/0 | 0 |
| kawigi.sbf.TidalWave 0.8 | 6 | 85.3% | 60/60 | 100.0% | 0 | 2 | 0 | 137/11188 | 0/0 | 0 |
| gh.nano.GrofGroup 1.1 | 6 | 86.2% | 60/60 | 100.0% | 0 | 6 | 0 | 322/13914 | 0/0 | 0 |
| **All** | 84 | 82.4% | 825/840 | 98.2% | 0 | 95 | 0 | 4583/202532 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 1604.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| rz.GlowingHawks 0.2 | 60 | 35.1% |
| kawigi.micro.ArmyOfShiz 1.1 | 60 | 34.7% |
| rz.HOFSwarm 1.1 | 60 | 33.0% |
| davidalves.PhoenixTeam 0.54 | 60 | 32.7% |
| kid.team.OmegaSquad .0.2 | 60 | 40.3% |
| cx.mini.DemoniacNimrods 0.50 | 60 | 32.4% |
| tmnr.TMNR 1.01 | 60 | 32.0% |
| myl.micro.TroodonPack 1.10 | 60 | 31.7% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 60 | 30.6% |
| bvh.team.Valkiries 1.0 | 60 | 33.9% |
| gh.mini.GrubbmGroup 0.4 | 60 | 31.7% |
| apvteam.MambaTeam 0.7.5 | 60 | 29.9% |
| kawigi.sbf.TidalWave 0.8 | 60 | 35.5% |
| gh.nano.GrofGroup 1.1 | 60 | 32.2% |
| **All** | 840 | 33.3% |

Data files written (any battle): kawigi\sbf\FloodHT.data\enemies.zip
