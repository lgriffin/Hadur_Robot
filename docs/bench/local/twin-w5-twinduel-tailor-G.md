# Team bench

hadur117.twin.TwinSaor 0.2G against each team in turn, 35 rounds a battle, 800x800.

robocode.cpu.constant=3862887. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 192 battles (0.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 8 | 57.8% | 225/280 | 80.4% | 0 | 2 | 0 | 363/10315 | 0/0 | 0 |
| voidious.twin.LuminariousDuo 1.13 | 8 | 66.9% | 208/280 | 74.3% | 0 | 9 | 0 | 265/21721 | 0/0 | 0 |
| jk.team.NightAndDay 1.6 | 8 | 47.4% | 111/280 | 39.6% | 0 | 4 | 0 | 170/19998 | 0/0 | 0 |
| kc.twins.GeminiTeam 2.1 | 8 | 45.3% | 87/280 | 31.1% | 0 | 4 | 0 | 108/17839 | 0/0 | 0 |
| kawigi.twin.MarioBros 1.0 | 8 | 46.6% | 96/280 | 34.3% | 0 | 9 | 0 | 120/21427 | 0/0 | 0 |
| wompi.TassieDevils 1.8 | 8 | 63.6% | 251/280 | 89.6% | 0 | 4 | 0 | 188/17142 | 0/0 | 0 |
| wiki.twin.KomariousTeam 1.0 | 8 | 61.2% | 150/280 | 53.6% | 0 | 7 | 0 | 363/17856 | 0/0 | 0 |
| kawigi.micro.ShizPair 1.1c | 8 | 78.7% | 270/280 | 96.4% | 0 | 0 | 0 | 271/16394 | 0/0 | 0 |
| gh.GruwelTwins 0.1 | 8 | 77.1% | 258/280 | 92.1% | 0 | 8 | 0 | 241/17661 | 0/0 | 0 |
| bvh.two.Valkiries 0.44tmk3b | 8 | 58.7% | 191/280 | 68.2% | 0 | 6 | 0 | 130/23918 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 8 | 55.6% | 201/280 | 71.8% | 0 | 4 | 0 | 527/6716 | 0/0 | 0 |
| davidalves.twin.YinYang 1.2 | 8 | 61.6% | 161/280 | 57.5% | 0 | 5 | 0 | 232/16802 | 0/0 | 0 |
| kinsen.twin.SelcouthTeam 1.1 | 8 | 82.1% | 268/280 | 95.7% | 0 | 4 | 0 | 438/14406 | 0/0 | 0 |
| gh.twin.GrauwuarG 0.41 | 8 | 63.8% | 184/280 | 65.7% | 0 | 4 | 0 | 440/15440 | 0/0 | 0 |
| dsekercioglu.LordMantis 1.0repackaged | 8 | 66.7% | 237/280 | 84.6% | 0 | 3 | 0 | 548/9720 | 0/0 | 0 |
| bvh.two.Ravens 0.2 | 8 | 76.6% | 271/280 | 96.8% | 0 | 12 | 0 | 390/15560 | 0/0 | 0 |
| wcsv.Coyote.CoyotePair .1 | 8 | 55.5% | 126/280 | 45.0% | 0 | 4 | 0 | 120/18544 | 0/0 | 0 |
| EH.twin.OlympusTwins 1.1 | 8 | 79.1% | 275/280 | 98.2% | 0 | 4 | 0 | 483/14242 | 0/0 | 0 |
| krillr.mini.JointStrikeForce 2.0c | 8 | 79.4% | 264/280 | 94.3% | 0 | 8 | 0 | 154/16176 | 0/0 | 0 |
| wiki.twin.InevitableTeam 0.1 | 8 | 68.8% | 190/280 | 67.9% | 0 | 8 | 0 | 313/15958 | 0/0 | 0 |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 8 | 62.7% | 229/280 | 81.8% | 0 | 7 | 0 | 265/8268 | 0/0 | 0 |
| whind.TwintelligenceTeam 1.0 | 8 | 86.6% | 276/280 | 98.6% | 0 | 2 | 0 | 570/7696 | 0/0 | 0 |
| chase.twin.SurroundingTeam 1.0 | 8 | 89.3% | 275/280 | 98.2% | 0 | 9 | 0 | 742/8105 | 0/0 | 0 |
| jeremyreeder.collective.TwoProphets 5 | 8 | 84.0% | 276/280 | 98.6% | 0 | 5 | 0 | 240/10029 | 0/0 | 0 |
| **All** | 192 | 67.3% | 5080/6720 | 75.6% | 0 | 132 | 0 | 7681/361933 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 8155.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 280 | 64.5% |
| voidious.twin.LuminariousDuo 1.13 | 280 | 67.7% |
| jk.team.NightAndDay 1.6 | 280 | 71.0% |
| kc.twins.GeminiTeam 2.1 | 279 | 71.1% |
| kawigi.twin.MarioBros 1.0 | 280 | 67.7% |
| wompi.TassieDevils 1.8 | 280 | 67.0% |
| wiki.twin.KomariousTeam 1.0 | 280 | 67.0% |
| kawigi.micro.ShizPair 1.1c | 280 | 68.0% |
| gh.GruwelTwins 0.1 | 279 | 68.0% |
| bvh.two.Valkiries 0.44tmk3b | 280 | 70.3% |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 280 | 64.6% |
| davidalves.twin.YinYang 1.2 | 280 | 67.7% |
| kinsen.twin.SelcouthTeam 1.1 | 280 | 67.2% |
| gh.twin.GrauwuarG 0.41 | 280 | 66.8% |
| dsekercioglu.LordMantis 1.0repackaged | 280 | 64.3% |
| bvh.two.Ravens 0.2 | 280 | 68.2% |
| wcsv.Coyote.CoyotePair .1 | 280 | 64.9% |
| EH.twin.OlympusTwins 1.1 | 280 | 68.6% |
| krillr.mini.JointStrikeForce 2.0c | 280 | 67.5% |
| wiki.twin.InevitableTeam 0.1 | 280 | 65.0% |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 280 | 66.3% |
| whind.TwintelligenceTeam 1.0 | 280 | 66.9% |
| chase.twin.SurroundingTeam 1.0 | 280 | 65.6% |
| jeremyreeder.collective.TwoProphets 5 | 280 | 67.2% |
| **All** | 6718 | 67.2% |

Data files written (any battle): none
