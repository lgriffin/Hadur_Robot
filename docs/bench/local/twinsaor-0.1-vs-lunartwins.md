# Team bench

hadur117.twin.TwinSaor 0.1 against each team in turn, 35 rounds a battle, 800x800.

robocode.cpu.constant=3753947. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v165, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 20 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 20 | 58.2% | 582/700 | 83.1% | 0 | 5 | 0 | 870/25798 | 0/0 | 0 |
| **All** | 20 | 58.2% | 582/700 | 83.1% | 0 | 5 | 0 | 870/25798 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 467.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ags.lunartwins.LunarTwins 1.4a | 700 | 64.3% |
| **All** | 700 | 64.3% |

Data files written (any battle): none
