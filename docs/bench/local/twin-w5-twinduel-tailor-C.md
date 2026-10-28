# Team bench

hadur117.twin.TwinSaor 0.1C against each team in turn, 35 rounds a battle, 800x800.

robocode.cpu.constant=4039237. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 61 over 192 battles (0.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 8 | 56.5% | 219/280 | 78.2% | 0 | 0 | 0 | 322/10128 | 0/0 | 0 |
| voidious.twin.LuminariousDuo 1.13 | 8 | 50.4% | 85/280 | 30.4% | 0 | 6 | 0 | 283/20649 | 0/0 | 0 |
| jk.team.NightAndDay 1.6 | 8 | 41.3% | 45/280 | 16.1% | 0 | 2 | 0 | 165/16379 | 0/0 | 0 |
| kc.twins.GeminiTeam 2.1 | 8 | 40.0% | 39/280 | 13.9% | 0 | 0 | 0 | 122/17016 | 0/0 | 0 |
| kawigi.twin.MarioBros 1.0 | 8 | 49.4% | 115/280 | 41.1% | 0 | 4 | 0 | 132/21560 | 0/0 | 0 |
| wompi.TassieDevils 1.8 | 8 | 62.0% | 242/280 | 86.4% | 0 | 1 | 0 | 238/17344 | 0/0 | 0 |
| wiki.twin.KomariousTeam 1.0 | 8 | 54.9% | 107/280 | 38.2% | 0 | 8 | 0 | 377/16652 | 0/0 | 0 |
| kawigi.micro.ShizPair 1.1c | 8 | 64.5% | 204/280 | 72.9% | 0 | 5 | 0 | 345/15073 | 0/0 | 0 |
| gh.GruwelTwins 0.1 | 8 | 71.0% | 254/280 | 90.7% | 0 | 0 | 0 | 260/17903 | 0/0 | 0 |
| bvh.two.Valkiries 0.44tmk3b | 8 | 57.0% | 178/280 | 63.6% | 0 | 0 | 0 | 128/23196 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 8 | 52.3% | 185/280 | 66.1% | 0 | 6 | 0 | 385/6598 | 0/0 | 0 |
| davidalves.twin.YinYang 1.2 | 8 | 57.8% | 129/280 | 46.1% | 0 | 7 | 0 | 251/15735 | 0/0 | 0 |
| kinsen.twin.SelcouthTeam 1.1 | 8 | 65.8% | 242/280 | 86.4% | 0 | 2 | 0 | 394/16836 | 0/0 | 0 |
| gh.twin.GrauwuarG 0.41 | 8 | 59.6% | 141/280 | 50.4% | 0 | 2 | 0 | 399/14779 | 0/0 | 0 |
| dsekercioglu.LordMantis 1.0repackaged | 8 | 67.1% | 247/280 | 88.2% | 0 | 0 | 0 | 511/10301 | 0/0 | 0 |
| bvh.two.Ravens 0.2 | 8 | 72.4% | 267/280 | 95.4% | 0 | 2 | 0 | 414/15755 | 0/0 | 0 |
| wcsv.Coyote.CoyotePair .1 | 8 | 48.7% | 80/280 | 28.6% | 0 | 1 | 0 | 130/19281 | 0/0 | 0 |
| EH.twin.OlympusTwins 1.1 | 8 | 75.2% | 275/280 | 98.2% | 0 | 4 | 0 | 492/14193 | 0/0 | 0 |
| krillr.mini.JointStrikeForce 2.0c | 8 | 56.8% | 151/280 | 53.9% | 0 | 3 | 0 | 161/16504 | 0/0 | 0 |
| wiki.twin.InevitableTeam 0.1 | 8 | 51.1% | 83/280 | 29.6% | 0 | 2 | 0 | 247/17953 | 0/0 | 0 |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 8 | 63.5% | 238/280 | 85.0% | 0 | 0 | 0 | 321/8307 | 0/0 | 0 |
| whind.TwintelligenceTeam 1.0 | 8 | 76.4% | 273/280 | 97.5% | 0 | 2 | 0 | 669/8848 | 0/0 | 0 |
| chase.twin.SurroundingTeam 1.0 | 8 | 80.3% | 272/280 | 97.1% | 0 | 2 | 0 | 702/8659 | 0/0 | 0 |
| jeremyreeder.collective.TwoProphets 5 | 8 | 81.3% | 279/280 | 99.6% | 0 | 2 | 0 | 231/9957 | 0/0 | 0 |
| **All** | 192 | 60.6% | 4350/6720 | 64.7% | 0 | 61 | 0 | 7679/359606 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 10707.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 280 | 64.9% |
| voidious.twin.LuminariousDuo 1.13 | 280 | 66.8% |
| jk.team.NightAndDay 1.6 | 280 | 70.4% |
| kc.twins.GeminiTeam 2.1 | 280 | 71.8% |
| kawigi.twin.MarioBros 1.0 | 280 | 67.1% |
| wompi.TassieDevils 1.8 | 280 | 68.5% |
| wiki.twin.KomariousTeam 1.0 | 277 | 67.5% |
| kawigi.micro.ShizPair 1.1c | 280 | 70.8% |
| gh.GruwelTwins 0.1 | 280 | 68.3% |
| bvh.two.Valkiries 0.44tmk3b | 279 | 70.0% |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 280 | 62.9% |
| davidalves.twin.YinYang 1.2 | 280 | 68.2% |
| kinsen.twin.SelcouthTeam 1.1 | 279 | 68.0% |
| gh.twin.GrauwuarG 0.41 | 280 | 68.5% |
| dsekercioglu.LordMantis 1.0repackaged | 280 | 63.8% |
| bvh.two.Ravens 0.2 | 280 | 68.5% |
| wcsv.Coyote.CoyotePair .1 | 280 | 66.2% |
| EH.twin.OlympusTwins 1.1 | 280 | 68.8% |
| krillr.mini.JointStrikeForce 2.0c | 280 | 67.3% |
| wiki.twin.InevitableTeam 0.1 | 280 | 66.5% |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 280 | 65.6% |
| whind.TwintelligenceTeam 1.0 | 280 | 67.6% |
| chase.twin.SurroundingTeam 1.0 | 280 | 66.3% |
| jeremyreeder.collective.TwoProphets 5 | 280 | 69.2% |
| **All** | 6715 | 67.7% |

Data files written (any battle): none
