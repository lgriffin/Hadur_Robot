# tmnr.TMNR 1.01 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 50.8% | 7/10 | 70.0% | 0 | 8 | 0 | 2/2126 | 0/195 | 23.3% | +27.5 |
| 2 | 51.6% | 8/10 | 80.0% | 0 | 13 | 0 | 0/2115 | 0/191 | 25.8% | +25.7 |
| 3 | 48.2% | 7/10 | 70.0% | 0 | 9 | 0 | 2/1927 | 0/186 | 25.9% | +22.3 |
| 4 | 51.0% | 9/10 | 90.0% | 0 | 9 | 0 | 1/2024 | 0/191 | 21.0% | +30.0 |
| 5 | 48.7% | 6/10 | 60.0% | 0 | 7 | 0 | 3/1908 | 0/189 | 31.2% | +17.6 |
| 6 | 48.6% | 6/10 | 60.0% | 0 | 11 | 0 | 0/2018 | 0/189 | 31.1% | +17.4 |
| 7 | 37.2% | 3/10 | 30.0% | 0 | 8 | 0 | 2/1997 | 0/159 | 16.9% | +20.3 |
| 8 | 52.8% | 9/10 | 90.0% | 0 | 13 | 0 | 3/2186 | 0/199 | 24.9% | +27.9 |
| 9 | 50.5% | 8/10 | 80.0% | 0 | 16 | 0 | 3/2056 | 0/192 | 19.2% | +31.2 |
| 10 | 57.2% | 10/10 | 100.0% | 0 | 15 | 0 | 3/2122 | 0/209 | 25.0% | +32.2 |

Mean score share 49.7% ± 3.7, baseline 24.4% ± 3.3, paired diff +25.2 ± 3.9.

Skipped turns: 109 over 10 battles (10.9 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 714 over 10 battles (71.4 per battle, most in one battle 274).

## Team records (T), summed over the seeds

- Teammate hits: 162
- Teammate bullet hits: 1247
- Teammate collisions: 8
- Shots held for the fire lane: 8697
- Reports merged: 1241517
- Engine's count of our bullets that hit one of our own members: 187
- Drives fenced: 1038

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 40 | 335 | 1 | 1715 | 274140 | 397 |
| member-1 | 44 | 217 | 1 | 1765 | 240610 | 91 |
| member-2 | 22 | 225 | 2 | 1732 | 239408 | 124 |
| member-3 | 26 | 235 | 2 | 1771 | 244149 | 219 |
| member-4 | 30 | 235 | 2 | 1714 | 243210 | 207 |
