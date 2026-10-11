# Team bench

rz.HOFSwarm 1.1 against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 78 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| apvteam.MambaTeam 0.7.5 | 6 | 77.2% | 57/60 | 95.0% | 0 | 0 | 0 | 469/12040 | 0/0 | 0 |
| kawigi.sbf.TidalWave 0.8 | 6 | 72.2% | 55/60 | 91.7% | 0 | 0 | 0 | 292/13894 | 0/0 | 0 |
| gh.nano.GrofGroup 1.1 | 6 | 53.5% | 31/60 | 51.7% | 0 | 0 | 0 | 441/14620 | 0/0 | 0 |
| jab.DiamondStealers 5 | 6 | 83.5% | 59/60 | 98.3% | 0 | 0 | 0 | 372/9307 | 0/0 | 0 |
| ethdsy.MalackaTeam 1.2 | 6 | 66.6% | 35/60 | 58.3% | 0 | 0 | 0 | 602/15268 | 0/0 | 0 |
| amz.TeamDeathTeam 1 | 6 | 74.1% | 60/60 | 100.0% | 0 | 0 | 0 | 800/5423 | 0/0 | 0 |
| jab.Enjambre 3 | 6 | 84.4% | 60/60 | 100.0% | 0 | 0 | 0 | 531/9234 | 0/0 | 0 |
| vuen.Bakery 2.51 | 6 | 77.4% | 44/60 | 73.3% | 0 | 0 | 0 | 570/22107 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 6 | 70.4% | 57/60 | 95.0% | 0 | 0 | 0 | 656/7396 | 0/0 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 6 | 80.5% | 58/60 | 96.7% | 0 | 0 | 0 | 528/10118 | 0/0 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 6 | 80.5% | 57/60 | 95.0% | 0 | 0 | 0 | 494/10441 | 0/0 | 0 |
| mskwik.BumblingIdiots 1.0 | 6 | 70.5% | 46/60 | 76.7% | 0 | 0 | 0 | 442/15926 | 0/0 | 0 |
| sgp.DrunkenTeam 1.12 | 6 | 90.4% | 60/60 | 100.0% | 0 | 0 | 0 | 398/8439 | 0/0 | 0 |
| **All** | 78 | 75.5% | 679/780 | 87.1% | 0 | 0 | 0 | 6595/154213 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 4590.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| apvteam.MambaTeam 0.7.5 | 60 | 32.6% |
| kawigi.sbf.TidalWave 0.8 | 60 | 35.9% |
| gh.nano.GrofGroup 1.1 | 60 | 30.7% |
| jab.DiamondStealers 5 | 60 | 33.3% |
| ethdsy.MalackaTeam 1.2 | 60 | 31.3% |
| amz.TeamDeathTeam 1 | 60 | 34.5% |
| jab.Enjambre 3 | 60 | 25.4% |
| vuen.Bakery 2.51 | 60 | 31.6% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 60 | 36.0% |
| pedersen.ImWithStupidTeam 1.3 | 60 | 35.0% |
| pedersen.ImWithDroidTeam 1.3 | 60 | 30.7% |
| mskwik.BumblingIdiots 1.0 | 60 | 34.4% |
| sgp.DrunkenTeam 1.12 | 60 | 34.3% |
| **All** | 780 | 32.7% |

Data files written (any battle): kawigi\sbf\FloodHT.data\enemies.zip, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt
