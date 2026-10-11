# florent.XSeries.Xmen 0.9 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 30.1% | 2/10 | 20.0% | 0 | 7 | 0 | 5/2251 | 0/135 | 25.6% | +4.4 |
| 2 | 30.4% | 4/10 | 40.0% | 0 | 3 | 0 | 2/2072 | 0/133 | 18.9% | +11.5 |
| 3 | 45.5% | 6/10 | 60.0% | 0 | 8 | 0 | 1/2181 | 0/179 | 15.6% | +29.9 |
| 4 | 42.5% | 6/10 | 60.0% | 0 | 7 | 0 | 0/2326 | 0/169 | 19.5% | +23.0 |
| 5 | 41.1% | 6/10 | 60.0% | 0 | 6 | 0 | 0/2332 | 0/165 | 14.9% | +26.2 |
| 6 | 38.5% | 4/10 | 40.0% | 0 | 7 | 0 | 2/2204 | 0/160 | 17.6% | +20.9 |
| 7 | failed | | | | | | | | 21.2% | - |
| 8 | 42.3% | 5/10 | 50.0% | 0 | 6 | 0 | 2/2245 | 0/171 | 19.9% | +22.4 |
| 9 | 31.1% | 5/10 | 50.0% | 0 | 6 | 0 | 2/2215 | 0/133 | 15.6% | +15.5 |
| 10 | 35.1% | 4/10 | 40.0% | 0 | 6 | 0 | 2/2175 | 0/148 | 24.0% | +11.0 |

Mean score share 37.4% ± 4.5, baseline 19.3% ± 2.6, paired diff +18.3 ± 6.3.

Skipped turns: 56 over 9 battles (6.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 108 over 9 battles (12.0 per battle, most in one battle 108).

## Team records (T), summed over the seeds

- Teammate hits: 124
- Teammate bullet hits: 1503
- Teammate collisions: 28
- Shots held for the fire lane: 7388
- Reports merged: 1059879
- Engine's count of our bullets that hit one of our own members: 148
- Drives fenced: 476

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 21 | 402 | 0 | 1463 | 241597 | 91 |
| member-1 | 33 | 266 | 13 | 1503 | 206364 | 105 |
| member-2 | 24 | 269 | 12 | 1504 | 201254 | 54 |
| member-3 | 30 | 303 | 2 | 1509 | 209408 | 142 |
| member-4 | 16 | 263 | 1 | 1409 | 201256 | 84 |
