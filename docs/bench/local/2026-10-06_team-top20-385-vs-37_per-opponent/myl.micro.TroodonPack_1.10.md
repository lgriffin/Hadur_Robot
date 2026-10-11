# myl.micro.TroodonPack 1.10 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.9% | 30/35 | 85.7% | 0 | 14 | 0 | 11/8098 | 0/796 | 32.1% | +30.8 |
| 2 | 58.8% | 29/35 | 82.9% | 0 | 9 | 0 | 5/7666 | 0/758 | 29.9% | +28.9 |
| 3 | 65.8% | 32/35 | 91.4% | 0 | 11 | 0 | 3/8243 | 0/835 | 28.4% | +37.4 |
| 4 | 64.3% | 32/35 | 91.4% | 0 | 16 | 0 | 4/8223 | 0/810 | 31.5% | +32.9 |
| 5 | 58.7% | 30/35 | 85.7% | 0 | 11 | 0 | 3/7549 | 0/749 | 28.7% | +30.0 |
| 6 | 65.3% | 33/35 | 94.3% | 0 | 15 | 0 | 2/8016 | 0/824 | 23.1% | +42.2 |
| 7 | 63.7% | 35/35 | 100.0% | 0 | 16 | 0 | 3/8108 | 0/799 | 31.0% | +32.7 |
| 8 | 58.7% | 26/35 | 74.3% | 0 | 9 | 0 | 5/8088 | 0/759 | 29.8% | +29.0 |
| 9 | 65.4% | 32/35 | 91.4% | 0 | 12 | 0 | 6/7914 | 0/826 | 31.0% | +34.4 |
| 10 | 63.2% | 33/35 | 94.3% | 0 | 13 | 0 | 8/8080 | 0/794 | 27.2% | +36.0 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 62.7% ± 2.0, baseline 29.3% ± 1.9, paired diff +33.4 ± 3.0.

Skipped turns: 126 over 10 battles (12.6 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 994 over 10 battles (99.4 per battle, most in one battle 596).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 31.5%.

## Team records (T), summed over the seeds

- Teammate hits: 621
- Teammate bullet hits: 4701
- Teammate collisions: 46
- Shots held for the fire lane: 33352
- Reports merged: 5001206
- Engine's count of our bullets that hit one of our own members: 715
- Drives fenced: 4815

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 96 | 1075 | 16 | 6070 | 1092259 | 1456 |
| member-1 | 149 | 882 | 8 | 6971 | 981599 | 847 |
| member-2 | 124 | 924 | 10 | 6891 | 980569 | 900 |
| member-3 | 125 | 910 | 9 | 6774 | 970891 | 845 |
| member-4 | 127 | 910 | 3 | 6646 | 975888 | 767 |
