# rz.AlephTeam 0.34 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 22.4% | 2/35 | 5.7% | 0 | 10 | 0 | 2/6585 | 0/389 | 8.5% | +13.9 |
| 2 | 26.8% | 1/35 | 2.9% | 0 | 10 | 0 | 2/6987 | 0/436 | 9.7% | +17.0 |
| 3 | 28.9% | 3/35 | 8.6% | 0 | 8 | 0 | 6/7253 | 0/462 | 11.0% | +18.0 |
| 4 | 26.6% | 1/35 | 2.9% | 0 | 10 | 0 | 6/6972 | 0/437 | 9.1% | +17.5 |
| 5 | 26.7% | 3/35 | 8.6% | 0 | 6 | 0 | 4/6933 | 0/436 | 9.9% | +16.8 |
| 6 | 24.9% | 3/35 | 8.6% | 0 | 9 | 0 | 3/6915 | 0/417 | 9.4% | +15.5 |
| 7 | 28.6% | 5/35 | 14.3% | 0 | 5 | 0 | 4/7219 | 0/458 | 9.4% | +19.2 |
| 8 | 27.0% | 5/35 | 14.3% | 0 | 7 | 0 | 7/7195 | 0/437 | 9.0% | +18.0 |
| 9 | 20.0% | 4/35 | 11.4% | 0 | 9 | 0 | 7/6685 | 0/349 | 9.9% | +10.1 |
| 10 | 27.7% | 4/35 | 11.4% | 0 | 11 | 0 | 1/7237 | 0/447 | 7.9% | +19.8 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 26.0% ± 2.0, baseline 9.4% ± 0.6, paired diff +16.6 ± 2.0.

Skipped turns: 85 over 10 battles (8.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 549 over 10 battles (54.9 per battle, most in one battle 263).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 35.5%.

## Team records (T), summed over the seeds

- Teammate hits: 490
- Teammate bullet hits: 3568
- Teammate collisions: 2
- Shots held for the fire lane: 31325
- Reports merged: 4097796
- Engine's count of our bullets that hit one of our own members: 607
- Drives fenced: 465

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 89 | 908 | 1 | 6320 | 919162 | 132 |
| member-1 | 101 | 674 | 0 | 6218 | 801607 | 71 |
| member-2 | 94 | 664 | 0 | 6129 | 783233 | 77 |
| member-3 | 104 | 630 | 0 | 6397 | 796230 | 42 |
| member-4 | 102 | 692 | 1 | 6261 | 797564 | 143 |
