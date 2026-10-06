# bvh.team.Valkiries 1.0 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 46.3% | 3/10 | 30.0% | 0 | 5 | 0 | 2/2949 | 0/180 | 23.6% | +22.7 |
| 2 | 58.9% | 6/10 | 60.0% | 0 | 6 | 0 | 1/3115 | 0/216 | 14.3% | +44.6 |
| 3 | 65.1% | 8/10 | 80.0% | 0 | 9 | 0 | 3/3234 | 0/231 | 15.1% | +50.0 |
| 4 | 54.1% | 5/10 | 50.0% | 0 | 6 | 0 | 1/2848 | 0/197 | 22.8% | +31.2 |
| 5 | 53.1% | 7/10 | 70.0% | 0 | 10 | 0 | 0/3026 | 0/195 | 21.7% | +31.5 |
| 6 | 61.7% | 8/10 | 80.0% | 0 | 7 | 0 | 0/2678 | 0/219 | 22.2% | +39.5 |
| 7 | 61.1% | 8/10 | 80.0% | 0 | 7 | 0 | 1/3261 | 0/220 | 21.0% | +40.1 |
| 8 | 58.9% | 7/10 | 70.0% | 0 | 8 | 0 | 3/3216 | 0/214 | 17.2% | +41.7 |
| 9 | 61.7% | 8/10 | 80.0% | 0 | 4 | 0 | 0/3080 | 0/224 | 25.7% | +36.0 |
| 10 | 56.3% | 8/10 | 80.0% | 0 | 10 | 0 | 2/3048 | 0/199 | 24.7% | +31.6 |

Mean score share 57.7% ± 3.9, baseline 20.8% ± 2.8, paired diff +36.9 ± 5.7.

Skipped turns: 72 over 10 battles (7.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 153 over 10 battles (15.3 per battle, most in one battle 153).

## Team records (T), summed over the seeds

- Teammate hits: 261
- Teammate bullet hits: 2378
- Teammate collisions: 21
- Shots held for the fire lane: 11392
- Reports merged: 1711298
- Engine's count of our bullets that hit one of our own members: 283
- Drives fenced: 2081

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 39 | 651 | 10 | 2105 | 385807 | 611 |
| member-1 | 43 | 469 | 3 | 2400 | 336051 | 308 |
| member-2 | 68 | 438 | 3 | 2339 | 334241 | 351 |
| member-3 | 48 | 426 | 5 | 2219 | 321755 | 362 |
| member-4 | 63 | 394 | 0 | 2329 | 333444 | 449 |
