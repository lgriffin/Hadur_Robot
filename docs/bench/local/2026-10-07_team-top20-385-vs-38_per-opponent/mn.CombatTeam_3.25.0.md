# mn.CombatTeam 3.25.0 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 18.7% | 1/35 | 2.9% | 0 | 7 | 0 | 3/6410 | 0/327 | 16.8% | +1.9 |
| 2 | 20.0% | 0/35 | 0.0% | 0 | 10 | 0 | 2/6792 | 0/340 | 19.1% | +0.9 |
| 3 | 20.2% | 0/35 | 0.0% | 0 | 9 | 0 | 8/6642 | 0/348 | 17.4% | +2.8 |
| 4 | 19.8% | 2/35 | 5.7% | 0 | 4 | 0 | 6/6978 | 0/342 | 17.7% | +2.1 |
| 5 | 17.6% | 0/35 | 0.0% | 0 | 0 | 0 | 4/6667 | 0/311 | 18.7% | -1.1 |
| 6 | 12.9% | 0/35 | 0.0% | 0 | 1 | 0 | 3/6234 | 0/257 | 20.0% | -7.1 |
| 7 | 15.8% | 0/35 | 0.0% | 0 | 4 | 0 | 4/6277 | 0/291 | 13.3% | +2.5 |
| 8 | 18.5% | 1/35 | 2.9% | 0 | 5 | 0 | 3/6664 | 0/324 | 19.6% | -1.1 |
| 9 | 18.0% | 0/35 | 0.0% | 0 | 4 | 0 | 6/6736 | 0/321 | 19.1% | -1.2 |
| 10 | 18.2% | 1/35 | 2.9% | 0 | 10 | 0 | 3/6748 | 0/321 | 18.9% | -0.7 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 18.0% ± 1.6, baseline 18.1% ± 1.4, paired diff -0.1 ± 2.1.

Skipped turns: 54 over 10 battles (5.4 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 591 over 10 battles (59.1 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 38.3%.

## Team records (T), summed over the seeds

- Teammate hits: 383
- Teammate bullet hits: 2475
- Teammate collisions: 0
- Shots held for the fire lane: 27919
- Reports merged: 3872081
- Engine's count of our bullets that hit one of our own members: 484
- Drives fenced: 294

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 59 | 592 | 0 | 5467 | 863439 | 96 |
| member-1 | 83 | 497 | 0 | 5673 | 762398 | 27 |
| member-2 | 88 | 488 | 0 | 5787 | 763424 | 58 |
| member-3 | 76 | 453 | 0 | 5602 | 744901 | 108 |
| member-4 | 77 | 445 | 0 | 5390 | 737919 | 5 |
