# tmnr.TMNR 1.01 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.5% | 30/35 | 85.7% | 0 | 16 | 0 | 2/7342 | 0/750 | 17.6% | +39.9 |
| 2 | 51.8% | 27/35 | 77.1% | 0 | 24 | 0 | 5/7339 | 0/693 | 23.7% | +28.1 |
| 3 | 57.7% | 31/35 | 88.6% | 0 | 15 | 0 | 2/7810 | 0/748 | 27.8% | +29.9 |
| 4 | 55.1% | 28/35 | 80.0% | 0 | 10 | 0 | 3/7302 | 0/725 | 24.5% | +30.6 |
| 5 | 53.6% | 29/35 | 82.9% | 0 | 12 | 0 | 3/7639 | 0/706 | 24.6% | +29.0 |
| 6 | 48.5% | 28/35 | 80.0% | 0 | 20 | 0 | 7/7164 | 0/653 | 24.8% | +23.7 |
| 7 | 61.0% | 29/35 | 82.9% | 0 | 21 | 0 | 9/7714 | 0/782 | 24.6% | +36.4 |
| 8 | 55.7% | 27/35 | 77.1% | 0 | 22 | 0 | 1/7389 | 0/738 | 21.9% | +33.8 |
| 9 | 57.5% | 27/35 | 77.1% | 0 | 14 | 0 | 8/7620 | 0/744 | 27.3% | +30.2 |
| 10 | 50.0% | 26/35 | 74.3% | 0 | 13 | 0 | 5/7344 | 0/674 | 26.2% | +23.8 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 54.8% ± 2.8, baseline 24.3% ± 2.1, paired diff +30.5 ± 3.6.

Skipped turns: 167 over 10 battles (16.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 984 over 10 battles (98.4 per battle, most in one battle 490).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.2%.

## Team records (T), summed over the seeds

- Teammate hits: 624
- Teammate bullet hits: 4657
- Teammate collisions: 24
- Shots held for the fire lane: 32913
- Reports merged: 4559984
- Engine's count of our bullets that hit one of our own members: 710
- Drives fenced: 2574

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 117 | 1174 | 11 | 6428 | 1014427 | 673 |
| member-1 | 142 | 844 | 4 | 6637 | 883731 | 354 |
| member-2 | 117 | 900 | 1 | 6698 | 889907 | 526 |
| member-3 | 114 | 867 | 3 | 6564 | 884371 | 463 |
| member-4 | 134 | 872 | 5 | 6586 | 887548 | 558 |
