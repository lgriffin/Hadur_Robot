# gh.mini.GrubbmGroup 0.4 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 56.8% | 25/35 | 71.4% | 0 | 10 | 0 | 7/9854 | 0/710 | 14.1% | +42.6 |
| 2 | 56.9% | 27/35 | 77.1% | 0 | 12 | 0 | 6/9937 | 0/713 | 16.7% | +40.2 |
| 3 | 55.4% | 25/35 | 71.4% | 0 | 7 | 0 | 9/9985 | 0/700 | 18.1% | +37.3 |
| 4 | 55.1% | 24/35 | 68.6% | 0 | 10 | 0 | 5/10016 | 0/689 | 18.4% | +36.8 |
| 5 | 58.3% | 24/35 | 68.6% | 0 | 12 | 0 | 5/9272 | 0/730 | 15.0% | +43.2 |
| 6 | 61.1% | 26/35 | 74.3% | 0 | 10 | 0 | 12/10071 | 0/765 | 18.0% | +43.1 |
| 7 | 49.7% | 20/35 | 57.1% | 0 | 11 | 0 | 10/9531 | 0/631 | 14.5% | +35.2 |
| 8 | 51.2% | 23/35 | 65.7% | 0 | 9 | 0 | 9/9649 | 0/645 | 14.2% | +37.0 |
| 9 | 48.2% | 21/35 | 60.0% | 0 | 12 | 0 | 9/9629 | 0/616 | 15.0% | +33.2 |
| 10 | 56.6% | 22/35 | 62.9% | 0 | 14 | 0 | 10/9689 | 0/716 | 17.5% | +39.1 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 54.9% ± 2.9, baseline 16.1% ± 1.2, paired diff +38.8 ± 2.5.

Skipped turns: 107 over 10 battles (10.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 220 over 10 battles (22.0 per battle, most in one battle 220).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 28.9%.

## Team records (T), summed over the seeds

- Teammate hits: 1109
- Teammate bullet hits: 7782
- Teammate collisions: 23
- Shots held for the fire lane: 51858
- Reports merged: 6212566
- Engine's count of our bullets that hit one of our own members: 1241
- Drives fenced: 3217

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 245 | 1931 | 6 | 11188 | 1388415 | 704 |
| member-1 | 213 | 1383 | 3 | 10005 | 1186765 | 526 |
| member-2 | 222 | 1507 | 2 | 10330 | 1225054 | 532 |
| member-3 | 208 | 1425 | 8 | 9896 | 1178515 | 702 |
| member-4 | 221 | 1536 | 4 | 10439 | 1233817 | 753 |
