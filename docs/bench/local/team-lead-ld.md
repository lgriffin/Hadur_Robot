# Team bench

hadur117.HadurTeam 3.20ld against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1616 over 144 battles (11.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 144 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 47.2% | 115/160 | 71.9% | 0 | 219 | 0 | 429/22676 | 0/2483 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 80.5% | 154/160 | 96.3% | 0 | 187 | 0 | 97/33784 | 0/4207 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 73.7% | 140/160 | 87.5% | 0 | 203 | 0 | 179/36500 | 0/3883 | 0 |
| jab.Enjambre 3 | 16 | 82.9% | 160/160 | 100.0% | 0 | 126 | 0 | 620/29321 | 0/4370 | 0 |
| vuen.Bakery 2.51 | 16 | 92.6% | 159/160 | 99.4% | 0 | 160 | 0 | 108/39336 | 0/4664 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 84.3% | 157/160 | 98.1% | 0 | 132 | 0 | 489/26009 | 0/4318 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 16 | 91.0% | 160/160 | 100.0% | 0 | 138 | 0 | 238/26384 | 0/4646 | 0 |
| ntc.slippery.Slippery 1.0 | 16 | 96.8% | 160/160 | 100.0% | 0 | 258 | 0 | 232/28504 | 0/4782 | 0 |
| bugger.BuggerHive 1.0 | 16 | 93.3% | 160/160 | 100.0% | 0 | 193 | 0 | 274/31262 | 0/4672 | 0 |
| **All** | 144 | 82.5% | 1365/1440 | 94.8% | 0 | 1616 | 0 | 2666/273776 | 0/38025 | 0 |

Members' team records (sums): teammate hits 5253, teammate bullet hits 28291, teammate collisions 277, shots held for the fire lane 21357, reports merged 13644443, drives fenced 31195.
Engine's count of our bullets that hit one of our own members: 8345.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 160 | 35.7% |
| myl.micro.TroodonPack 1.10 | 160 | 38.2% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 37.5% |
| jab.Enjambre 3 | 160 | 26.6% |
| vuen.Bakery 2.51 | 160 | 35.8% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 38.8% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 160 | 37.1% |
| ntc.slippery.Slippery 1.0 | 160 | 37.9% |
| bugger.BuggerHive 1.0 | 160 | 36.7% |
| **All** | 1440 | 36.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.20ld vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 47.2% ± 2.9 | 49.3% ± 2.8 | -2.0 ± 4.7 |
| myl.micro.TroodonPack 1.10 | 80.5% ± 2.4 | 85.8% ± 1.2 | -5.3 ± 2.5 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 73.7% ± 2.6 | 76.6% ± 2.2 | -2.9 ± 3.4 |
| jab.Enjambre 3 | 82.9% ± 1.7 | 87.5% ± 0.9 | -4.6 ± 2.1 |
| vuen.Bakery 2.51 | 92.6% ± 1.4 | 93.9% ± 0.5 | -1.2 ± 1.4 |
| pedersen.ImWithDroidTeam 1.3 | 84.3% ± 2.2 | 85.4% ± 1.9 | -1.0 ± 2.5 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 91.0% ± 0.8 | 92.5% ± 0.5 | -1.4 ± 0.8 |
| ntc.slippery.Slippery 1.0 | 96.8% ± 0.2 | 96.2% ± 0.4 | +0.5 ± 0.4 |
| bugger.BuggerHive 1.0 | 93.3% ± 0.8 | 95.1% ± 0.8 | -1.8 ± 1.2 |
| **All** | 82.5% ± 2.4 | 84.7% ± 2.3 | -2.2 ± 0.8 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 of 16 | 16 of 16 | 16 |
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 of 16 | 16 of 16 | 16 |
| jab.Enjambre 3 | 16 of 16 | 16 of 16 | 16 |
| vuen.Bakery 2.51 | 16 of 16 | 16 of 16 | 16 |
| pedersen.ImWithDroidTeam 1.3 | 16 of 16 | 16 of 16 | 16 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 16 of 16 | 16 of 16 | 16 |
| ntc.slippery.Slippery 1.0 | 16 of 16 | 16 of 16 | 16 |
| bugger.BuggerHive 1.0 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 94.8% ± 1.8 | 95.4% ± 1.7 | -0.6 ± 1.5 |
| Survival | 94.8% ± 1.8 | 95.4% ± 1.7 | -0.6 ± 1.5 |
| In-lane shots | 1.1% ± 0.1 | 1.0% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 36.0% ± 0.6 | 31.3% ± 0.5 | +4.8 ± 0.5 |
| Bullets on own members | 57.95 ± 2.80 | 65.83 ± 3.68 | -7.9 ± 3.1 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1610 over 144 battles (11.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 144 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 49.3% | 117/160 | 73.1% | 0 | 202 | 0 | 436/23172 | 0/2599 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 85.8% | 159/160 | 99.4% | 0 | 194 | 0 | 78/37715 | 0/4476 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 76.6% | 141/160 | 88.1% | 0 | 169 | 0 | 194/41167 | 0/4047 | 0 |
| jab.Enjambre 3 | 16 | 87.5% | 160/160 | 100.0% | 0 | 104 | 0 | 788/34037 | 0/4595 | 0 |
| vuen.Bakery 2.51 | 16 | 93.9% | 160/160 | 100.0% | 0 | 166 | 0 | 110/43163 | 0/4709 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 85.4% | 157/160 | 98.1% | 0 | 145 | 0 | 587/30842 | 0/4411 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 16 | 92.5% | 160/160 | 100.0% | 0 | 143 | 0 | 200/27991 | 0/4720 | 0 |
| ntc.slippery.Slippery 1.0 | 16 | 96.2% | 160/160 | 100.0% | 0 | 341 | 0 | 231/27411 | 0/4764 | 0 |
| bugger.BuggerHive 1.0 | 16 | 95.1% | 160/160 | 100.0% | 0 | 146 | 0 | 259/40376 | 0/4745 | 0 |
| **All** | 144 | 84.7% | 1374/1440 | 95.4% | 0 | 1610 | 0 | 2883/305874 | 0/39066 | 0 |

Members' team records (sums): teammate hits 6636, teammate bullet hits 34398, teammate collisions 1069, shots held for the fire lane 25246, reports merged 15489575, drives fenced 110959.
Engine's count of our bullets that hit one of our own members: 9479.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 160 | 33.3% |
| myl.micro.TroodonPack 1.10 | 160 | 29.8% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 31.2% |
| jab.Enjambre 3 | 160 | 25.4% |
| vuen.Bakery 2.51 | 160 | 31.1% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 30.3% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 160 | 33.5% |
| ntc.slippery.Slippery 1.0 | 160 | 34.9% |
| bugger.BuggerHive 1.0 | 160 | 31.7% |
| **All** | 1440 | 31.3% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt
