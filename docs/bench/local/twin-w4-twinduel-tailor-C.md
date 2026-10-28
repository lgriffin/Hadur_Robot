# Team bench

hadur117.twin.TwinSaor 0.1C against each team in turn, 35 rounds a battle, 800x800.

robocode.cpu.constant=4264000. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 48 over 192 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 8 | 58.5% | 237/280 | 84.6% | 0 | 1 | 0 | 324/10576 | 0/0 | 0 |
| voidious.twin.LuminariousDuo 1.13 | 8 | 51.3% | 86/280 | 30.7% | 0 | 7 | 0 | 276/20299 | 0/0 | 0 |
| jk.team.NightAndDay 1.6 | 8 | 40.9% | 46/280 | 16.4% | 0 | 4 | 0 | 122/16230 | 0/0 | 0 |
| kc.twins.GeminiTeam 2.1 | 8 | 40.9% | 57/280 | 20.4% | 0 | 7 | 0 | 129/16975 | 0/0 | 0 |
| kawigi.twin.MarioBros 1.0 | 8 | 45.1% | 80/280 | 28.6% | 0 | 2 | 0 | 111/21273 | 0/0 | 0 |
| wompi.TassieDevils 1.8 | 8 | 62.6% | 246/280 | 87.9% | 0 | 0 | 0 | 205/16967 | 0/0 | 0 |
| wiki.twin.KomariousTeam 1.0 | 8 | 55.0% | 104/280 | 37.1% | 0 | 2 | 0 | 384/17002 | 0/0 | 0 |
| kawigi.micro.ShizPair 1.1c | 8 | 67.0% | 220/280 | 78.6% | 0 | 1 | 0 | 411/15119 | 0/0 | 0 |
| gh.GruwelTwins 0.1 | 8 | 71.6% | 260/280 | 92.9% | 0 | 4 | 0 | 297/17994 | 0/0 | 0 |
| bvh.two.Valkiries 0.44tmk3b | 8 | 55.6% | 163/280 | 58.2% | 0 | 0 | 0 | 123/23468 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 8 | 52.2% | 177/280 | 63.2% | 0 | 3 | 0 | 413/6496 | 0/0 | 0 |
| davidalves.twin.YinYang 1.2 | 8 | 56.6% | 122/280 | 43.6% | 0 | 1 | 0 | 250/15936 | 0/0 | 0 |
| kinsen.twin.SelcouthTeam 1.1 | 8 | 66.1% | 243/280 | 86.8% | 0 | 1 | 0 | 426/16763 | 0/0 | 0 |
| gh.twin.GrauwuarG 0.41 | 8 | 60.4% | 150/280 | 53.6% | 0 | 0 | 0 | 391/14942 | 0/0 | 0 |
| dsekercioglu.LordMantis 1.0repackaged | 8 | 66.9% | 244/280 | 87.1% | 0 | 0 | 0 | 512/10018 | 0/0 | 0 |
| bvh.two.Ravens 0.2 | 8 | 71.8% | 264/280 | 94.3% | 0 | 2 | 0 | 404/15925 | 0/0 | 0 |
| wcsv.Coyote.CoyotePair .1 | 8 | 46.0% | 55/280 | 19.6% | 0 | 3 | 0 | 125/19083 | 0/0 | 0 |
| EH.twin.OlympusTwins 1.1 | 8 | 74.7% | 271/280 | 96.8% | 0 | 1 | 0 | 480/13995 | 0/0 | 0 |
| krillr.mini.JointStrikeForce 2.0c | 8 | 56.6% | 141/280 | 50.4% | 0 | 2 | 0 | 149/16246 | 0/0 | 0 |
| wiki.twin.InevitableTeam 0.1 | 8 | 52.0% | 89/280 | 31.8% | 0 | 4 | 0 | 258/17686 | 0/0 | 0 |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 8 | 61.9% | 230/280 | 82.1% | 0 | 1 | 0 | 297/8297 | 0/0 | 0 |
| whind.TwintelligenceTeam 1.0 | 8 | 77.2% | 273/280 | 97.5% | 0 | 1 | 0 | 713/9006 | 0/0 | 0 |
| chase.twin.SurroundingTeam 1.0 | 8 | 80.9% | 274/280 | 97.9% | 0 | 0 | 0 | 692/8534 | 0/0 | 0 |
| jeremyreeder.collective.TwoProphets 5 | 8 | 81.4% | 279/280 | 99.6% | 0 | 1 | 0 | 262/10142 | 0/0 | 0 |
| **All** | 192 | 60.5% | 4311/6720 | 64.2% | 0 | 48 | 0 | 7754/358972 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 10663.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 280 | 63.2% |
| voidious.twin.LuminariousDuo 1.13 | 280 | 66.2% |
| jk.team.NightAndDay 1.6 | 279 | 69.5% |
| kc.twins.GeminiTeam 2.1 | 280 | 73.5% |
| kawigi.twin.MarioBros 1.0 | 280 | 67.4% |
| wompi.TassieDevils 1.8 | 279 | 68.1% |
| wiki.twin.KomariousTeam 1.0 | 279 | 66.9% |
| kawigi.micro.ShizPair 1.1c | 280 | 69.8% |
| gh.GruwelTwins 0.1 | 280 | 68.5% |
| bvh.two.Valkiries 0.44tmk3b | 280 | 70.3% |
| mn.nano.perceptual.ImpactTwins 1.3.0 | 280 | 62.8% |
| davidalves.twin.YinYang 1.2 | 280 | 67.4% |
| kinsen.twin.SelcouthTeam 1.1 | 278 | 68.0% |
| gh.twin.GrauwuarG 0.41 | 278 | 68.2% |
| dsekercioglu.LordMantis 1.0repackaged | 280 | 64.1% |
| bvh.two.Ravens 0.2 | 280 | 68.5% |
| wcsv.Coyote.CoyotePair .1 | 280 | 66.9% |
| EH.twin.OlympusTwins 1.1 | 280 | 69.5% |
| krillr.mini.JointStrikeForce 2.0c | 280 | 67.9% |
| wiki.twin.InevitableTeam 0.1 | 280 | 65.7% |
| jeremyreeder.collective.DuoLedByDroid 1.0fix | 280 | 66.3% |
| whind.TwintelligenceTeam 1.0 | 280 | 68.6% |
| chase.twin.SurroundingTeam 1.0 | 280 | 66.7% |
| jeremyreeder.collective.TwoProphets 5 | 280 | 69.3% |
| **All** | 6713 | 67.6% |

Data files written (any battle): none
