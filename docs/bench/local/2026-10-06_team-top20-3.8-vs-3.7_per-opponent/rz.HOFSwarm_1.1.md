# rz.HOFSwarm 1.1 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 45.3% | 4/10 | 40.0% | 0 | 10 | 0 | 1/2530 | 0/181 | 19.2% | +26.1 |
| 2 | 55.3% | 5/10 | 50.0% | 0 | 5 | 0 | 2/2875 | 0/211 | 11.8% | +43.5 |
| 3 | 39.8% | 3/10 | 30.0% | 0 | 9 | 0 | 2/2693 | 0/164 | 16.0% | +23.8 |
| 4 | 44.9% | 3/10 | 30.0% | 0 | 5 | 0 | 4/2763 | 0/182 | 16.3% | +28.6 |
| 5 | 54.2% | 5/10 | 50.0% | 0 | 13 | 0 | 3/2606 | 0/206 | 11.2% | +43.1 |
| 6 | 51.7% | 6/10 | 60.0% | 0 | 8 | 0 | 0/2623 | 0/196 | 10.1% | +41.6 |
| 7 | 47.0% | 6/10 | 60.0% | 0 | 3 | 0 | 4/2645 | 0/186 | 12.4% | +34.6 |
| 8 | 52.2% | 6/10 | 60.0% | 0 | 10 | 0 | 1/2780 | 0/197 | 13.0% | +39.2 |
| 9 | 43.0% | 5/10 | 50.0% | 0 | 5 | 0 | 2/2705 | 0/171 | 15.9% | +27.1 |
| 10 | 48.0% | 5/10 | 50.0% | 0 | 8 | 0 | 1/2433 | 0/186 | 12.6% | +35.4 |

Mean score share 48.1% ± 3.6, baseline 13.8% ± 2.0, paired diff +34.3 ± 5.3.

Skipped turns: 76 over 10 battles (7.6 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1085 over 10 battles (108.5 per battle, most in one battle 505).

## Team records (T), summed over the seeds

- Teammate hits: 229
- Teammate bullet hits: 1670
- Teammate collisions: 9
- Shots held for the fire lane: 11083
- Reports merged: 1625202
- Engine's count of our bullets that hit one of our own members: 256
- Drives fenced: 652

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 44 | 392 | 2 | 2222 | 361860 | 131 |
| member-1 | 54 | 297 | 3 | 2205 | 312548 | 150 |
| member-2 | 46 | 344 | 2 | 2294 | 328852 | 215 |
| member-3 | 53 | 325 | 1 | 2208 | 313836 | 80 |
| member-4 | 32 | 312 | 1 | 2154 | 308106 | 76 |
