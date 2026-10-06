# radnor.RadnorMedSchool 1.0 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.4% | 8/10 | 80.0% | 0 | 6 | 0 | 2/2400 | 0/220 | 36.7% | +25.7 |
| 2 | 54.9% | 6/10 | 60.0% | 0 | 5 | 0 | 4/2191 | 0/196 | 28.4% | +26.5 |
| 3 | 64.4% | 9/10 | 90.0% | 0 | 6 | 0 | 3/2472 | 0/227 | 26.8% | +37.6 |
| 4 | 62.0% | 8/10 | 80.0% | 0 | 3 | 0 | 3/2496 | 0/217 | 36.9% | +25.1 |
| 5 | 71.0% | 9/10 | 90.0% | 0 | 6 | 0 | 0/2585 | 0/248 | 31.3% | +39.7 |
| 6 | 59.7% | 7/10 | 70.0% | 0 | 5 | 0 | 2/2381 | 0/209 | 36.0% | +23.7 |
| 7 | 56.9% | 6/10 | 60.0% | 0 | 7 | 0 | 1/2388 | 0/205 | 35.4% | +21.5 |
| 8 | 63.1% | 8/10 | 80.0% | 0 | 6 | 0 | 0/2461 | 0/221 | 37.8% | +25.3 |
| 9 | 65.5% | 9/10 | 90.0% | 0 | 4 | 0 | 0/2569 | 0/228 | 24.8% | +40.7 |
| 10 | 64.2% | 8/10 | 80.0% | 0 | 6 | 0 | 2/2389 | 0/223 | 32.7% | +31.5 |

Mean score share 62.4% ± 3.2, baseline 32.7% ± 3.3, paired diff +29.7 ± 5.1.

Skipped turns: 54 over 10 battles (5.4 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

## Team records (T), summed over the seeds

- Teammate hits: 303
- Teammate bullet hits: 1638
- Teammate collisions: 2
- Shots held for the fire lane: 14335
- Reports merged: 1698854
- Engine's count of our bullets that hit one of our own members: 352
- Drives fenced: 837

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 59 | 374 | 0 | 3121 | 373898 | 231 |
| member-1 | 57 | 320 | 0 | 2866 | 331654 | 147 |
| member-2 | 49 | 328 | 1 | 2777 | 334793 | 164 |
| member-3 | 65 | 337 | 1 | 2883 | 337093 | 201 |
| member-4 | 73 | 279 | 0 | 2688 | 321416 | 94 |
