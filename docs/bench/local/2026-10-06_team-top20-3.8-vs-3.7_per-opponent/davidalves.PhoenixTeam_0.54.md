# davidalves.PhoenixTeam 0.54 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 51.7% | 4/10 | 40.0% | 0 | 11 | 0 | 0/2902 | 0/198 | 14.1% | +37.5 |
| 2 | 56.9% | 6/10 | 60.0% | 0 | 15 | 0 | 1/2860 | 0/213 | 18.5% | +38.4 |
| 3 | 67.9% | 7/10 | 70.0% | 0 | 5 | 0 | 3/2812 | 0/244 | 19.2% | +48.8 |
| 4 | 67.9% | 8/10 | 80.0% | 0 | 6 | 0 | 1/3019 | 0/247 | 16.2% | +51.6 |
| 5 | 51.7% | 4/10 | 40.0% | 0 | 9 | 0 | 2/2572 | 0/198 | 19.7% | +32.0 |
| 6 | 58.4% | 5/10 | 50.0% | 0 | 6 | 0 | 1/2698 | 0/222 | 17.9% | +40.5 |
| 7 | 56.6% | 4/10 | 40.0% | 0 | 14 | 0 | 1/2901 | 0/219 | 20.0% | +36.6 |
| 8 | 58.5% | 6/10 | 60.0% | 0 | 10 | 0 | 2/2914 | 0/219 | 18.7% | +39.8 |
| 9 | 53.1% | 4/10 | 40.0% | 0 | 9 | 0 | 3/2681 | 0/205 | 25.2% | +27.9 |
| 10 | 53.7% | 4/10 | 40.0% | 0 | 7 | 0 | 1/2831 | 0/208 | 13.7% | +40.0 |

Mean score share 57.6% ± 4.3, baseline 18.3% ± 2.3, paired diff +39.3 ± 5.0.

Skipped turns: 92 over 10 battles (9.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1235 over 10 battles (123.5 per battle, most in one battle 548).

## Team records (T), summed over the seeds

- Teammate hits: 263
- Teammate bullet hits: 2098
- Teammate collisions: 8
- Shots held for the fire lane: 10540
- Reports merged: 1670773
- Engine's count of our bullets that hit one of our own members: 285
- Drives fenced: 2327

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 45 | 568 | 5 | 1984 | 372401 | 614 |
| member-1 | 63 | 418 | 0 | 2172 | 326308 | 357 |
| member-2 | 53 | 369 | 1 | 2169 | 334532 | 539 |
| member-3 | 55 | 356 | 1 | 2123 | 317606 | 404 |
| member-4 | 47 | 387 | 1 | 2092 | 319926 | 413 |
