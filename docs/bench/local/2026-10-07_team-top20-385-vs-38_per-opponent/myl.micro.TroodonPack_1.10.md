# myl.micro.TroodonPack 1.10 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.5% | 31/35 | 88.6% | 0 | 15 | 0 | 4/7891 | 0/805 | 68.0% | -4.5 |
| 2 | 63.6% | 30/35 | 85.7% | 0 | 16 | 0 | 4/7979 | 0/806 | 64.6% | -1.0 |
| 3 | 68.3% | 34/35 | 97.1% | 0 | 7 | 0 | 1/7952 | 0/858 | 61.7% | +6.7 |
| 4 | 64.6% | 32/35 | 91.4% | 0 | 12 | 0 | 7/8354 | 0/813 | 61.9% | +2.7 |
| 5 | 68.5% | 33/35 | 94.3% | 0 | 10 | 0 | 3/7657 | 0/851 | 62.7% | +5.8 |
| 6 | 57.6% | 30/35 | 85.7% | 0 | 10 | 0 | 5/7633 | 0/733 | 69.0% | -11.4 |
| 7 | 64.1% | 33/35 | 94.3% | 0 | 9 | 0 | 5/7977 | 0/811 | 64.1% | +0.0 |
| 8 | 68.5% | 31/35 | 88.6% | 0 | 5 | 0 | 7/7993 | 0/855 | 62.5% | +6.0 |
| 9 | 60.6% | 30/35 | 85.7% | 0 | 10 | 0 | 5/7839 | 0/768 | 67.3% | -6.7 |
| 10 | 61.6% | 29/35 | 82.9% | 0 | 12 | 0 | 2/7860 | 0/781 | 60.7% | +0.9 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 64.1% ± 2.6, baseline 64.2% ± 2.1, paired diff -0.1 ± 4.2.

Skipped turns: 106 over 10 battles (10.6 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 174 over 10 battles (17.4 per battle, most in one battle 174).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 31.9%.

## Team records (T), summed over the seeds

- Teammate hits: 578
- Teammate bullet hits: 4769
- Teammate collisions: 94
- Shots held for the fire lane: 33046
- Reports merged: 4926197
- Engine's count of our bullets that hit one of our own members: 651
- Drives fenced: 4043

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 95 | 1184 | 27 | 6196 | 1069715 | 893 |
| member-1 | 120 | 908 | 16 | 6801 | 965688 | 687 |
| member-2 | 132 | 888 | 24 | 6471 | 965323 | 736 |
| member-3 | 113 | 845 | 4 | 6700 | 950817 | 681 |
| member-4 | 118 | 944 | 23 | 6878 | 974654 | 1046 |
