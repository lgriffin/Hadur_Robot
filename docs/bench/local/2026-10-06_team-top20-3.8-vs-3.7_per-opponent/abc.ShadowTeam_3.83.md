# abc.ShadowTeam 3.83 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 27.6% | 0/10 | 0.0% | 0 | 4 | 0 | 1/2305 | 0/127 | 10.7% | +16.8 |
| 2 | 31.2% | 2/10 | 20.0% | 0 | 4 | 0 | 0/2394 | 0/138 | 9.4% | +21.8 |
| 3 | 20.3% | 1/10 | 10.0% | 0 | 5 | 0 | 2/1947 | 0/102 | 13.3% | +7.1 |
| 4 | 20.1% | 0/10 | 0.0% | 0 | 4 | 0 | 0/2102 | 0/101 | 11.2% | +8.9 |
| 5 | 27.6% | 2/10 | 20.0% | 0 | 6 | 0 | 2/2055 | 0/125 | 9.4% | +18.2 |
| 6 | 20.2% | 0/10 | 0.0% | 0 | 5 | 0 | 1/1925 | 0/105 | 4.7% | +15.6 |
| 7 | 20.1% | 0/10 | 0.0% | 0 | 2 | 0 | 1/2202 | 0/98 | 6.8% | +13.3 |
| 8 | 16.2% | 0/10 | 0.0% | 0 | 5 | 0 | 2/1947 | 0/86 | 8.1% | +8.1 |
| 9 | 21.2% | 1/10 | 10.0% | 0 | 3 | 0 | 1/1967 | 0/101 | 8.4% | +12.7 |
| 10 | 21.9% | 0/10 | 0.0% | 0 | 3 | 0 | 3/2129 | 0/107 | 8.2% | +13.7 |

Mean score share 22.6% ± 3.3, baseline 9.0% ± 1.7, paired diff +13.6 ± 3.4.

Skipped turns: 41 over 10 battles (4.1 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 351 over 10 battles (35.1 per battle, most in one battle 177).

## Team records (T), summed over the seeds

- Teammate hits: 149
- Teammate bullet hits: 1207
- Teammate collisions: 0
- Shots held for the fire lane: 9080
- Reports merged: 1208222
- Engine's count of our bullets that hit one of our own members: 171
- Drives fenced: 51

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 25 | 299 | 0 | 1840 | 271705 | 19 |
| member-1 | 36 | 212 | 0 | 1758 | 229530 | 5 |
| member-2 | 26 | 241 | 0 | 1803 | 237810 | 14 |
| member-3 | 38 | 249 | 0 | 1888 | 238792 | 1 |
| member-4 | 24 | 206 | 0 | 1791 | 230385 | 12 |
