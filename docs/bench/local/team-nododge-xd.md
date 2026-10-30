# Team bench

hadur117.HadurTeam 3.20xd against each team in turn, 12 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 744 over 72 battles (10.3 per battle, most in one battle 93). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 72 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 47.8% | 195/288 | 67.7% | 0 | 371 | 0 | 741/39835 | 0/4534 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 80.4% | 288/288 | 100.0% | 0 | 203 | 0 | 1482/31834 | 0/7808 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 24 | 88.2% | 285/288 | 99.0% | 0 | 170 | 0 | 1093/54342 | 0/8193 | 0 |
| **All** | 72 | 72.1% | 768/864 | 88.9% | 0 | 744 | 0 | 3316/126011 | 0/20535 | 0 |

Members' team records (sums): teammate hits 2245, teammate bullet hits 9856, teammate collisions 114, shots held for the fire lane 9479, reports merged 5582816, drives fenced 5219.
Engine's count of our bullets that hit one of our own members: 4153.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 34.4% |
| pedersen.ImWithStupidTeam 1.3 | 288 | 34.0% |
| **All** | 864 | 33.7% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt

## Paired A/B: hadur117.HadurTeam 3.20xd vs hadur117.HadurTeam 3.20aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 47.8% ± 2.4 | 43.5% ± 1.9 | +4.3 ± 2.8 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 80.4% ± 1.1 | 77.3% ± 1.0 | +3.1 ± 1.1 |
| pedersen.ImWithStupidTeam 1.3 | 88.2% ± 0.8 | 87.9% ± 0.9 | +0.3 ± 1.0 |
| **All** | 72.1% ± 4.2 | 69.5% ± 4.5 | +2.6 ± 1.1 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 of 24 | 24 of 24 | 24 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 of 24 | 24 of 24 | 24 |
| pedersen.ImWithStupidTeam 1.3 | 24 of 24 | 24 of 24 | 24 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 88.9% ± 3.9 | 86.5% ± 4.8 | +2.4 ± 2.7 |
| Survival | 88.9% ± 3.9 | 86.5% ± 4.8 | +2.4 ± 2.7 |
| In-lane shots | 2.9% ± 0.3 | 3.1% ± 0.4 | -0.2 ± 0.2 |
| Focus fire | 33.7% ± 0.4 | 33.8% ± 0.5 | -0.1 ± 0.5 |
| Bullets on own members | 57.68 ± 4.91 | 55.46 ± 5.27 | +2.2 ± 3.5 |

## Team bench

hadur117.HadurTeam 3.20aa against each team in turn, 12 rounds a battle, 1200x1200.

Skipped turns: 986 over 72 battles (13.7 per battle, most in one battle 76). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 72 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| ustimaw.NightmareTeam 3.3 | 24 | 43.5% | 172/288 | 59.7% | 0 | 511 | 0 | 914/40132 | 0/4097 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 24 | 77.3% | 288/288 | 100.0% | 0 | 242 | 0 | 1590/31093 | 0/7549 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 24 | 87.9% | 287/288 | 99.7% | 0 | 233 | 0 | 997/57742 | 0/8229 | 0 |
| **All** | 72 | 69.5% | 747/864 | 86.5% | 0 | 986 | 0 | 3501/128967 | 0/19875 | 0 |

Members' team records (sums): teammate hits 2215, teammate bullet hits 10734, teammate collisions 42, shots held for the fire lane 9489, reports merged 5629754, drives fenced 7938.
Engine's count of our bullets that hit one of our own members: 3993.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| ustimaw.NightmareTeam 3.3 | 288 | 32.1% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 288 | 35.4% |
| pedersen.ImWithStupidTeam 1.3 | 288 | 33.9% |
| **All** | 864 | 33.8% |

Data files written (any battle): hadur117\Hadur.data\health.hc, pedersen\ImWithStupid.data\debug.txt
