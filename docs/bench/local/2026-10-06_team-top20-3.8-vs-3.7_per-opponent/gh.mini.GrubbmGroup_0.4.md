# gh.mini.GrubbmGroup 0.4 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.0% | 10/10 | 100.0% | 0 | 6 | 0 | 1/2940 | 0/238 | 23.5% | +44.5 |
| 2 | 51.1% | 6/10 | 60.0% | 0 | 12 | 0 | 2/2703 | 0/186 | 12.4% | +38.7 |
| 3 | 59.2% | 6/10 | 60.0% | 0 | 9 | 0 | 2/2864 | 0/213 | 13.5% | +45.8 |
| 4 | 42.1% | 5/10 | 50.0% | 0 | 7 | 0 | 1/2662 | 0/154 | 17.3% | +24.8 |
| 5 | 46.1% | 5/10 | 50.0% | 0 | 9 | 0 | 0/2572 | 0/170 | 15.6% | +30.5 |
| 6 | 56.1% | 8/10 | 80.0% | 0 | 14 | 0 | 0/2949 | 0/202 | 12.2% | +43.9 |
| 7 | 52.3% | 5/10 | 50.0% | 0 | 4 | 0 | 1/2882 | 0/191 | 13.7% | +38.6 |
| 8 | 64.1% | 7/10 | 70.0% | 0 | 11 | 0 | 3/3068 | 0/230 | 10.6% | +53.5 |
| 9 | 40.2% | 5/10 | 50.0% | 0 | 6 | 0 | 2/2661 | 0/149 | 18.9% | +21.3 |
| 10 | 56.0% | 7/10 | 70.0% | 0 | 14 | 0 | 0/2992 | 0/199 | 16.6% | +39.4 |

Mean score share 53.5% ± 6.5, baseline 15.4% ± 2.8, paired diff +38.1 ± 7.1.

Skipped turns: 92 over 10 battles (9.2 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1161 over 10 battles (116.1 per battle, most in one battle 515).

## Team records (T), summed over the seeds

- Teammate hits: 303
- Teammate bullet hits: 2300
- Teammate collisions: 57
- Shots held for the fire lane: 14574
- Reports merged: 1772132
- Engine's count of our bullets that hit one of our own members: 334
- Drives fenced: 1012

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 72 | 556 | 28 | 3133 | 398658 | 365 |
| member-1 | 58 | 414 | 27 | 2698 | 325741 | 94 |
| member-2 | 47 | 419 | 0 | 2817 | 336444 | 121 |
| member-3 | 75 | 474 | 1 | 3045 | 362127 | 202 |
| member-4 | 51 | 437 | 1 | 2881 | 349162 | 230 |
