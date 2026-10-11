# bvh.team.Valkiries 1.0 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.4% | 25/35 | 71.4% | 0 | 8 | 0 | 4/10415 | 0/730 | 56.9% | +0.5 |
| 2 | 58.2% | 28/35 | 80.0% | 0 | 12 | 0 | 10/10714 | 0/729 | 59.4% | -1.2 |
| 3 | 59.7% | 31/35 | 88.6% | 0 | 8 | 0 | 12/10438 | 0/742 | 63.3% | -3.6 |
| 4 | 63.8% | 32/35 | 91.4% | 0 | 7 | 0 | 4/10846 | 0/792 | 63.0% | +0.8 |
| 5 | 58.3% | 25/35 | 71.4% | 0 | 8 | 0 | 6/10804 | 0/736 | 59.9% | -1.6 |
| 6 | 58.7% | 27/35 | 77.1% | 0 | 7 | 0 | 15/10630 | 0/738 | 58.4% | +0.3 |
| 7 | 59.0% | 25/35 | 71.4% | 0 | 5 | 0 | 5/10705 | 0/745 | 61.5% | -2.5 |
| 8 | 59.9% | 26/35 | 74.3% | 0 | 8 | 0 | 9/11259 | 0/753 | 54.3% | +5.6 |
| 9 | 61.7% | 25/35 | 71.4% | 0 | 9 | 0 | 9/10213 | 0/769 | 64.5% | -2.9 |
| 10 | 54.3% | 24/35 | 68.6% | 0 | 6 | 0 | 5/9979 | 0/695 | 58.4% | -4.1 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 59.1% ± 1.8, baseline 60.0% ± 2.3, paired diff -0.9 ± 2.0.

Skipped turns: 78 over 10 battles (7.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 32.5%.

## Team records (T), summed over the seeds

- Teammate hits: 942
- Teammate bullet hits: 7626
- Teammate collisions: 82
- Shots held for the fire lane: 42567
- Reports merged: 6073106
- Engine's count of our bullets that hit one of our own members: 1001
- Drives fenced: 5105

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 143 | 2043 | 12 | 7752 | 1369501 | 1623 |
| member-1 | 215 | 1412 | 30 | 8725 | 1170990 | 1120 |
| member-2 | 206 | 1348 | 9 | 8665 | 1174939 | 756 |
| member-3 | 182 | 1411 | 9 | 8667 | 1170360 | 870 |
| member-4 | 196 | 1412 | 22 | 8758 | 1187316 | 736 |
