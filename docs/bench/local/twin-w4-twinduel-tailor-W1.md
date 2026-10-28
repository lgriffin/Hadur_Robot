# Team bench

hadur117.twin.TwinSaor 0.1W1 against each team in turn, 35 rounds a battle, 800x800.

robocode.cpu.constant=4516525. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 67 over 192 battles (0.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 8 | 59.7% | 231/280 | 82.5% | 0 | 4 | 0 | 394/10007 | 0/0 | 0 |
| voidious.twin.LuminariousDuo 1.13 | 8 | 63.5% | 184/280 | 65.7% | 0 | 1 | 0 | 242/21528 | 0/0 | 0 |
| jk.team.NightAndDay 1.6 | 8 | 45.8% | 75/280 | 26.8% | 0 | 5 | 0 | 127/16664 | 0/0 | 0 |
| kc.twins.GeminiTeam 2.1 | 8 | 44.2% | 75/280 | 26.8% | 0 | 2 | 0 | 110/18265 | 0/0 | 0 |
| kawigi.twin.MarioBros 1.0 | 8 | 49.8% | 119/280 | 42.5% | 0 | 2 | 0 | 102/22102 | 0/0 | 0 |
| wompi.TassieDevils 1.8 | 8 | 65.7% | 255/280 | 91.1% | 0 | 2 | 0 | 226/16861 | 0/0 | 0 |
| wiki.twin.KomariousTeam 1.0 | 8 | 61.5% | 153/280 | 54.6% | 0 | 11 | 0 | 397/17632 | 0/0 | 0 |
| kawigi.micro.ShizPair 1.1c | 8 | 66.0% | 213/280 | 76.1% | 0 | 4 | 0 | 206/16065 | 0/0 | 0 |
| gh.GruwelTwins 0.1 | 8 | 76.3% | 256/280 | 91.4% | 0 | 0 | 0 | 231/17974 | 0/0 | 0 |
| bvh.two.Valkiries 0.44tmk3b | 8 | 57.6% | 180/280 | 64.3% | 0 | 3 | 0 | 150/23594 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 8 | 52.4% | 180/280 | 64.3% | 0 | 0 | 0 | 395/7022 | 0/0 | 0 |
| davidalves.twin.YinYang 1.2 | 8 | 59.0% | 138/280 | 49.3% | 0 | 4 | 0 | 206/16187 | 0/0 | 0 |
| kinsen.twin.SelcouthTeam 1.1 | 8 | 71.2% | 256/280 | 91.4% | 0 | 2 | 0 | 329/16326 | 0/0 | 0 |
| gh.twin.GrauwuarG 0.41 | 8 | 63.7% | 184/280 | 65.7% | 0 | 2 | 0 | 460/15526 | 0/0 | 0 |
| dsekercioglu.LordMantis 1.0repackaged | 8 | 64.5% | 239/280 | 85.4% | 0 | 4 | 0 | 603/10484 | 0/0 | 0 |
| bvh.two.Ravens 0.2 | 8 | 75.9% | 269/280 | 96.1% | 0 | 2 | 0 | 407/15876 | 0/0 | 0 |
| wcsv.Coyote.CoyotePair .1 | 8 | 55.8% | 126/280 | 45.0% | 0 | 4 | 0 | 112/19550 | 0/0 | 0 |
| EH.twin.OlympusTwins 1.1 | 8 | 80.2% | 273/280 | 97.5% | 0 | 5 | 0 | 479/13754 | 0/0 | 0 |
| krillr.mini.JointStrikeForce 2.0c | 8 | 56.0% | 145/280 | 51.8% | 0 | 2 | 0 | 103/17464 | 0/0 | 0 |
| wiki.twin.InevitableTeam 0.1 | 8 | 57.9% | 133/280 | 47.5% | 0 | 1 | 0 | 237/17995 | 0/0 | 0 |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 8 | 63.9% | 238/280 | 85.0% | 0 | 3 | 0 | 274/8272 | 0/0 | 0 |
| whind.TwintelligenceTeam 1.0 | 8 | 80.7% | 276/280 | 98.6% | 0 | 2 | 0 | 680/8566 | 0/0 | 0 |
| chase.twin.SurroundingTeam 1.0 | 8 | 88.8% | 275/280 | 98.2% | 0 | 0 | 0 | 752/7948 | 0/0 | 0 |
| jeremyreeder.collective.TwoProphets 5 | 8 | 84.5% | 275/280 | 98.2% | 0 | 2 | 0 | 207/10066 | 0/0 | 0 |
| **All** | 192 | 64.4% | 4748/6720 | 70.7% | 0 | 67 | 0 | 7429/365728 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 7975.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 280 | 63.8% |
| voidious.twin.LuminariousDuo 1.13 | 280 | 67.5% |
| jk.team.NightAndDay 1.6 | 280 | 70.6% |
| kc.twins.GeminiTeam 2.1 | 280 | 70.7% |
| kawigi.twin.MarioBros 1.0 | 280 | 65.7% |
| wompi.TassieDevils 1.8 | 280 | 67.3% |
| wiki.twin.KomariousTeam 1.0 | 276 | 67.0% |
| kawigi.micro.ShizPair 1.1c | 279 | 69.3% |
| gh.GruwelTwins 0.1 | 279 | 67.4% |
| bvh.two.Valkiries 0.44tmk3b | 279 | 71.5% |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 280 | 64.0% |
| davidalves.twin.YinYang 1.2 | 279 | 67.9% |
| kinsen.twin.SelcouthTeam 1.1 | 280 | 68.5% |
| gh.twin.GrauwuarG 0.41 | 279 | 67.3% |
| dsekercioglu.LordMantis 1.0repackaged | 280 | 63.7% |
| bvh.two.Ravens 0.2 | 280 | 67.6% |
| wcsv.Coyote.CoyotePair .1 | 280 | 66.5% |
| EH.twin.OlympusTwins 1.1 | 280 | 68.4% |
| krillr.mini.JointStrikeForce 2.0c | 280 | 68.0% |
| wiki.twin.InevitableTeam 0.1 | 280 | 66.1% |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 280 | 66.4% |
| whind.TwintelligenceTeam 1.0 | 280 | 67.3% |
| chase.twin.SurroundingTeam 1.0 | 280 | 65.9% |
| jeremyreeder.collective.TwoProphets 5 | 280 | 67.2% |
| **All** | 6711 | 67.3% |

Data files written (any battle): none
