# Team bench

hadur2.HadurTeam 3.18.1kb against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1691 over 176 battles (9.6 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 176 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 43.3% | 46/160 | 28.7% | 0 | 126 | 0 | 74/35455 | 0/2512 | 0 |
| rz.GlowingHawks 0.2 | 16 | 72.4% | 128/160 | 80.0% | 0 | 130 | 0 | 65/43908 | 0/3841 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 70.2% | 131/160 | 81.9% | 0 | 137 | 0 | 65/39995 | 0/3813 | 0 |
| rz.HOFSwarm 1.1 | 16 | 62.3% | 107/160 | 66.9% | 0 | 170 | 0 | 59/37950 | 0/3439 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 69.4% | 112/160 | 70.0% | 0 | 131 | 0 | 68/41781 | 0/3774 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 75.2% | 135/160 | 84.4% | 0 | 151 | 0 | 63/49136 | 0/3345 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 82.3% | 156/160 | 97.5% | 0 | 199 | 0 | 83/37444 | 0/4338 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 70.1% | 136/160 | 85.0% | 0 | 209 | 0 | 182/39739 | 0/3682 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 78.0% | 146/160 | 91.3% | 0 | 196 | 0 | 290/42475 | 0/4020 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 78.4% | 143/160 | 89.4% | 0 | 103 | 0 | 90/39470 | 0/4151 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 75.3% | 145/160 | 90.6% | 0 | 139 | 0 | 345/38482 | 0/3954 | 0 |
| **All** | 176 | 70.6% | 1385/1760 | 78.7% | 0 | 1691 | 0 | 1384/445835 | 0/40869 | 0 |

Members' team records (sums): teammate hits 9600, teammate bullet hits 46628, teammate collisions 414, shots held for the fire lane 35851, reports merged 21749247, drives fenced 31116.
Engine's count of our bullets that hit one of our own members: 11731.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.7% |
| rz.GlowingHawks 0.2 | 160 | 32.9% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 30.8% |
| rz.HOFSwarm 1.1 | 160 | 31.5% |
| davidalves.PhoenixTeam 0.54 | 160 | 30.7% |
| kid.team.OmegaSquad .0.2 | 160 | 36.0% |
| myl.micro.TroodonPack 1.10 | 160 | 29.8% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 31.1% |
| gh.mini.GrubbmGroup 0.4 | 160 | 30.3% |
| kawigi.sbf.TidalWave 0.8 | 160 | 31.7% |
| gh.nano.GrofGroup 1.1 | 160 | 32.0% |
| **All** | 1760 | 31.7% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip

## Paired A/B: hadur2.HadurTeam 3.18.1kb vs hadur2.HadurTeam 3.18.1aa

Each row pairs the candidate's and the baseline's battle against the same team at the same seed (BENCH-2). Score shares are mean ± 95% interval over seeds; positive is better for the candidate.

| Opponent team | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 43.3% ± 3.7 | 51.9% ± 4.4 | -8.6 ± 5.2 |
| rz.GlowingHawks 0.2 | 72.4% ± 2.4 | 75.7% ± 2.1 | -3.3 ± 2.7 |
| kawigi.micro.ArmyOfShiz 1.1 | 70.2% ± 2.4 | 68.4% ± 3.9 | +1.8 ± 4.6 |
| rz.HOFSwarm 1.1 | 62.3% ± 3.4 | 64.0% ± 3.7 | -1.7 ± 4.9 |
| davidalves.PhoenixTeam 0.54 | 69.4% ± 2.1 | 74.8% ± 2.9 | -5.4 ± 3.7 |
| kid.team.OmegaSquad .0.2 | 75.2% ± 2.7 | 73.7% ± 2.8 | +1.5 ± 4.5 |
| myl.micro.TroodonPack 1.10 | 82.3% ± 2.0 | 81.1% ± 2.2 | +1.2 ± 2.8 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 70.1% ± 3.0 | 74.9% ± 2.6 | -4.9 ± 3.9 |
| gh.mini.GrubbmGroup 0.4 | 78.0% ± 2.1 | 81.6% ± 2.4 | -3.6 ± 2.8 |
| kawigi.sbf.TidalWave 0.8 | 78.4% ± 2.4 | 79.9% ± 2.2 | -1.5 ± 2.9 |
| gh.nano.GrofGroup 1.1 | 75.3% ± 2.1 | 79.9% ± 2.1 | -4.6 ± 2.5 |
| **All** | 70.6% ± 1.7 | 73.3% ± 1.5 | -2.6 ± 1.1 |

Battles used per opponent (a failed battle drops its seed from the pairing):

| Opponent team | Candidate | Baseline | Paired seeds |
|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 of 16 | 16 of 16 | 16 |
| rz.GlowingHawks 0.2 | 16 of 16 | 16 of 16 | 16 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 of 16 | 16 of 16 | 16 |
| rz.HOFSwarm 1.1 | 16 of 16 | 16 of 16 | 16 |
| davidalves.PhoenixTeam 0.54 | 16 of 16 | 16 of 16 | 16 |
| kid.team.OmegaSquad .0.2 | 16 of 16 | 16 of 16 | 16 |
| myl.micro.TroodonPack 1.10 | 16 of 16 | 16 of 16 | 16 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 of 16 | 16 of 16 | 16 |
| gh.mini.GrubbmGroup 0.4 | 16 of 16 | 16 of 16 | 16 |
| kawigi.sbf.TidalWave 0.8 | 16 of 16 | 16 of 16 | 16 |
| gh.nano.GrofGroup 1.1 | 16 of 16 | 16 of 16 | 16 |

Pooled over every opponent's pairs, the other measures (mean ± 95% interval, candidate minus baseline; shares in points, counts per battle):

| Measure | Candidate | Baseline | Paired diff |
|---|---|---|---|
| Rounds won | 78.7% ± 3.1 | 81.3% ± 3.0 | -2.6 ± 2.5 |
| Survival | 78.7% ± 3.1 | 81.3% ± 3.0 | -2.6 ± 2.5 |
| In-lane shots | 0.3% ± 0.0 | 0.4% ± 0.0 | -0.1 ± 0.0 |
| Focus fire | 31.7% ± 0.3 | 31.4% ± 0.4 | +0.3 ± 0.4 |
| Bullets on own members | 66.65 ± 2.26 | 71.78 ± 2.41 | -5.1 ± 2.7 |

## Team bench

hadur2.HadurTeam 3.18.1aa against each team in turn, 10 rounds a battle, 1200x1200.

Skipped turns: 1577 over 176 battles (9.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 176 battles (0.0 per battle, most in one battle 0).

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.ShadowTeam 3.83 | 16 | 51.9% | 58/160 | 36.3% | 0 | 121 | 0 | 86/37958 | 0/2958 | 0 |
| rz.GlowingHawks 0.2 | 16 | 75.7% | 134/160 | 83.8% | 0 | 136 | 0 | 79/43234 | 0/4042 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 16 | 68.4% | 120/160 | 75.0% | 0 | 136 | 0 | 59/39834 | 0/3759 | 0 |
| rz.HOFSwarm 1.1 | 16 | 64.0% | 112/160 | 70.0% | 0 | 154 | 0 | 73/38776 | 0/3525 | 0 |
| davidalves.PhoenixTeam 0.54 | 16 | 74.8% | 128/160 | 80.0% | 0 | 119 | 0 | 87/41753 | 0/4045 | 0 |
| kid.team.OmegaSquad .0.2 | 16 | 73.7% | 128/160 | 80.0% | 0 | 129 | 0 | 104/47085 | 0/3307 | 0 |
| myl.micro.TroodonPack 1.10 | 16 | 81.1% | 155/160 | 96.9% | 0 | 218 | 0 | 95/36788 | 0/4266 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 16 | 74.9% | 147/160 | 91.9% | 0 | 155 | 0 | 192/41167 | 0/3944 | 0 |
| gh.mini.GrubbmGroup 0.4 | 16 | 81.6% | 150/160 | 93.8% | 0 | 185 | 0 | 334/42147 | 0/4211 | 0 |
| kawigi.sbf.TidalWave 0.8 | 16 | 79.9% | 146/160 | 91.3% | 0 | 111 | 0 | 180/39587 | 0/4223 | 0 |
| gh.nano.GrofGroup 1.1 | 16 | 79.9% | 152/160 | 95.0% | 0 | 113 | 0 | 368/39597 | 0/4196 | 0 |
| **All** | 176 | 73.3% | 1430/1760 | 81.3% | 0 | 1577 | 0 | 1657/447926 | 0/42476 | 0 |

Members' team records (sums): teammate hits 10491, teammate bullet hits 48670, teammate collisions 358, shots held for the fire lane 32207, reports merged 21778286, drives fenced 38107.
Engine's count of our bullets that hit one of our own members: 12634.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| abc.ShadowTeam 3.83 | 160 | 31.5% |
| rz.GlowingHawks 0.2 | 160 | 31.7% |
| kawigi.micro.ArmyOfShiz 1.1 | 160 | 31.8% |
| rz.HOFSwarm 1.1 | 160 | 31.6% |
| davidalves.PhoenixTeam 0.54 | 160 | 29.9% |
| kid.team.OmegaSquad .0.2 | 160 | 36.3% |
| myl.micro.TroodonPack 1.10 | 160 | 30.2% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 160 | 30.2% |
| gh.mini.GrubbmGroup 0.4 | 160 | 29.4% |
| kawigi.sbf.TidalWave 0.8 | 160 | 32.0% |
| gh.nano.GrofGroup 1.1 | 160 | 30.4% |
| **All** | 1760 | 31.4% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, hadur2\Hadur.data\health.hc, kawigi\sbf\FloodHT.data\enemies.zip
