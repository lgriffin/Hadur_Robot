# rz.GlowingHawks 0.2 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.2% | 7/10 | 70.0% | 0 | 5 | 0 | 2/3132 | 0/210 | 21.8% | +35.4 |
| 2 | 60.1% | 7/10 | 70.0% | 0 | 7 | 0 | 0/3054 | 0/216 | 16.1% | +44.0 |
| 3 | 59.3% | 8/10 | 80.0% | 0 | 9 | 0 | 1/3032 | 0/213 | 12.1% | +47.2 |
| 4 | 53.3% | 5/10 | 50.0% | 0 | 10 | 0 | 4/3212 | 0/199 | 20.2% | +33.1 |
| 5 | 49.1% | 5/10 | 50.0% | 0 | 9 | 0 | 3/2967 | 0/186 | 19.0% | +30.1 |
| 6 | 50.8% | 5/10 | 50.0% | 0 | 7 | 0 | 2/2975 | 0/189 | 18.0% | +32.9 |
| 7 | 59.9% | 8/10 | 80.0% | 0 | 11 | 0 | 1/3038 | 0/219 | 20.4% | +39.5 |
| 8 | 44.7% | 5/10 | 50.0% | 0 | 9 | 0 | 2/2716 | 0/169 | 22.7% | +22.1 |
| 9 | 49.5% | 3/10 | 30.0% | 0 | 2 | 0 | 3/2921 | 0/193 | 15.7% | +33.8 |
| 10 | 42.8% | 3/10 | 30.0% | 0 | 5 | 0 | 4/3062 | 0/170 | 18.6% | +24.2 |

Mean score share 52.7% ± 4.5, baseline 18.5% ± 2.3, paired diff +34.2 ± 5.7.

Skipped turns: 74 over 10 battles (7.4 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 596 over 10 battles (59.6 per battle, most in one battle 596).

## Team records (T), summed over the seeds

- Teammate hits: 243
- Teammate bullet hits: 1862
- Teammate collisions: 14
- Shots held for the fire lane: 11954
- Reports merged: 1819625
- Engine's count of our bullets that hit one of our own members: 276
- Drives fenced: 1019

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 43 | 445 | 3 | 2174 | 401505 | 258 |
| member-1 | 54 | 371 | 4 | 2484 | 354705 | 263 |
| member-2 | 56 | 356 | 0 | 2517 | 355079 | 104 |
| member-3 | 48 | 336 | 5 | 2330 | 349146 | 218 |
| member-4 | 42 | 354 | 2 | 2449 | 359190 | 176 |
