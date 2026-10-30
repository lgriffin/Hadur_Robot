# Team bench

hadur117.HadurTeam 3.20bb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1544 over 144 battles (10.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 144 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 46.4% | 102/160 | 63.7% | 0 | 194 | 0 | 415/22250 | 0/2450 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 84.8% | 159/160 | 99.4% | 0 | 191 | 0 | 82/38217 | 0/4426 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 78.2% | 147/160 | 91.9% | 0 | 170 | 0 | 230/42145 | 0/4115 | 0 |
| jab.Enjambre 3 | 16 | 86.9% | 160/160 | 100.0% | 0 | 85 | 0 | 802/31777 | 0/4556 | 0 |
| vuen.Bakery 2.51 | 16 | 94.0% | 159/160 | 99.4% | 0 | 176 | 0 | 118/43760 | 0/4709 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 85.6% | 155/160 | 96.9% | 0 | 137 | 0 | 582/31132 | 0/4432 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 16 | 92.0% | 160/160 | 100.0% | 0 | 151 | 0 | 195/27679 | 0/4722 | 0 |
| ntc.slippery.Slippery 1.0 | 16 | 96.2% | 160/160 | 100.0% | 0 | 308 | 0 | 196/27002 | 0/4780 | 0 |
| bugger.BuggerHive 1.0 | 16 | 94.6% | 160/160 | 100.0% | 0 | 132 | 0 | 261/41689 | 0/4725 | 0 |
| **All** | 144 | 84.3% | 1362/1440 | 94.6% | 0 | 1544 | 0 | 2881/305651 | 0/38915 | 0 |

Members' team records (sums): teammate hits 6549, teammate bullet hits 34827, teammate collisions 837, shots held for the fire lane 25106, reports merged 15508741, drives fenced 112357.
Engine's count of our bullets that hit one of our own members: 9511.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 160 | 32.8% |
| myl.micro.TroodonPack 1.10 | 160 | 29.5% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 29.8% |
| jab.Enjambre 3 | 160 | 25.7% |
| vuen.Bakery 2.51 | 160 | 30.9% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 31.0% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 160 | 33.0% |
| ntc.slippery.Slippery 1.0 | 160 | 34.9% |
| bugger.BuggerHive 1.0 | 160 | 31.9% |
| **All** | 1440 | 31.1% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.20bb vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 46.4% ± 3.1 | 46.5% ± 3.1 | -0.1 ± 4.6 |
| myl.micro.TroodonPack 1.10 | 84.8% ± 1.6 | 85.0% ± 1.7 | -0.3 ± 2.7 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 78.2% ± 1.8 | 78.1% ± 1.3 | +0.1 ± 2.5 |
| jab.Enjambre 3 | 86.9% ± 1.3 | 86.9% ± 1.0 | +0.1 ± 1.5 |
| vuen.Bakery 2.51 | 94.0% ± 0.6 | 93.4% ± 0.4 | +0.6 ± 0.8 |
| pedersen.ImWithDroidTeam 1.3 | 85.6% ± 2.0 | 85.9% ± 2.1 | -0.2 ± 2.3 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 92.0% ± 0.7 | 91.7% ± 1.0 | +0.3 ± 1.4 |
| ntc.slippery.Slippery 1.0 | 96.2% ± 0.3 | 96.0% ± 0.4 | +0.2 ± 0.5 |
| bugger.BuggerHive 1.0 | 94.6% ± 0.9 | 95.2% ± 0.5 | -0.6 ± 1.1 |
| **All** | 84.3% ± 2.4 | 84.3% ± 2.4 | +0.0 ± 0.7 |

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
| Rounds won | 94.6% ± 2.1 | 94.9% ± 2.0 | -0.3 ± 1.5 |
| Survival | 94.6% ± 2.1 | 94.9% ± 2.0 | -0.3 ± 1.5 |
| In-lane shots | 1.0% ± 0.1 | 1.0% ± 0.1 | +0.0 ± 0.1 |
| Focus fire | 31.1% ± 0.5 | 31.0% ± 0.5 | +0.0 ± 0.3 |
| Bullets on own members | 66.05 ± 3.70 | 66.26 ± 3.68 | -0.2 ± 2.9 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1575 over 144 battles (10.9 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 144 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 16 | 46.5% | 107/160 | 66.9% | 0 | 192 | 0 | 414/22255 | 0/2448 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 85.0% | 159/160 | 99.4% | 0 | 176 | 0 | 78/36928 | 0/4411 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 78.1% | 142/160 | 88.8% | 0 | 194 | 0 | 215/42095 | 0/4108 | 0 |
| jab.Enjambre 3 | 16 | 86.9% | 160/160 | 100.0% | 0 | 96 | 0 | 761/33346 | 0/4585 | 0 |
| vuen.Bakery 2.51 | 16 | 93.4% | 160/160 | 100.0% | 0 | 176 | 0 | 111/43198 | 0/4721 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 16 | 85.9% | 158/160 | 98.8% | 0 | 156 | 0 | 595/30264 | 0/4445 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 16 | 91.7% | 160/160 | 100.0% | 0 | 127 | 0 | 198/27161 | 0/4696 | 0 |
| ntc.slippery.Slippery 1.0 | 16 | 96.0% | 160/160 | 100.0% | 0 | 335 | 0 | 205/27614 | 0/4778 | 0 |
| bugger.BuggerHive 1.0 | 16 | 95.2% | 160/160 | 100.0% | 0 | 123 | 0 | 255/41608 | 0/4733 | 0 |
| **All** | 144 | 84.3% | 1366/1440 | 94.9% | 0 | 1575 | 0 | 2832/304469 | 0/38925 | 0 |

Members' team records (sums): teammate hits 6593, teammate bullet hits 34356, teammate collisions 1023, shots held for the fire lane 25201, reports merged 15446256, drives fenced 115548.
Engine's count of our bullets that hit one of our own members: 9541.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 160 | 32.8% |
| myl.micro.TroodonPack 1.10 | 160 | 29.7% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 30.3% |
| jab.Enjambre 3 | 160 | 25.2% |
| vuen.Bakery 2.51 | 160 | 31.1% |
| pedersen.ImWithDroidTeam 1.3 | 160 | 30.9% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 160 | 33.0% |
| ntc.slippery.Slippery 1.0 | 160 | 34.7% |
| bugger.BuggerHive 1.0 | 160 | 31.6% |
| **All** | 1440 | 31.0% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt
