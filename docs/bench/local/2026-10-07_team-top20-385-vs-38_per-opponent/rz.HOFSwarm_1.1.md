# rz.HOFSwarm 1.1 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 52.2% | 20/35 | 57.1% | 0 | 12 | 0 | 2/9211 | 0/696 | 53.7% | -1.5 |
| 2 | 54.4% | 21/35 | 60.0% | 0 | 11 | 0 | 5/8971 | 0/725 | 51.7% | +2.7 |
| 3 | 52.6% | 20/35 | 57.1% | 0 | 10 | 0 | 8/8977 | 0/696 | 56.2% | -3.6 |
| 4 | 50.1% | 19/35 | 54.3% | 0 | 18 | 0 | 6/8910 | 0/674 | 48.2% | +1.8 |
| 5 | 54.5% | 22/35 | 62.9% | 0 | 11 | 0 | 2/9219 | 0/720 | 47.8% | +6.7 |
| 6 | 51.3% | 18/35 | 51.4% | 0 | 13 | 0 | 5/9198 | 0/698 | 54.0% | -2.7 |
| 7 | 51.1% | 19/35 | 54.3% | 0 | 11 | 0 | 5/9271 | 0/684 | 57.4% | -6.3 |
| 8 | 50.2% | 20/35 | 57.1% | 0 | 8 | 0 | 2/8628 | 0/673 | 47.2% | +2.9 |
| 9 | 53.8% | 24/35 | 68.6% | 0 | 6 | 0 | 7/9277 | 0/705 | 55.1% | -1.4 |
| 10 | 50.7% | 22/35 | 62.9% | 0 | 6 | 0 | 6/9188 | 0/674 | 58.8% | -8.2 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 52.1% ± 1.2, baseline 53.0% ± 3.0, paired diff -0.9 ± 3.3.

Skipped turns: 106 over 10 battles (10.6 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 731 over 10 battles (73.1 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.9%.

## Team records (T), summed over the seeds

- Teammate hits: 684
- Teammate bullet hits: 5573
- Teammate collisions: 50
- Shots held for the fire lane: 38219
- Reports merged: 5559578
- Engine's count of our bullets that hit one of our own members: 786
- Drives fenced: 2743

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 125 | 1413 | 6 | 7247 | 1227963 | 776 |
| member-1 | 152 | 977 | 7 | 7721 | 1076893 | 409 |
| member-2 | 155 | 1020 | 7 | 7764 | 1076852 | 356 |
| member-3 | 121 | 1086 | 12 | 7629 | 1081391 | 648 |
| member-4 | 131 | 1077 | 18 | 7858 | 1096479 | 554 |
