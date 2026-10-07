# bvh.team.Valkiries 1.0 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.1% | 23/35 | 65.7% | 0 | 11 | 0 | 7/10407 | 0/746 | 17.6% | +41.5 |
| 2 | 53.0% | 20/35 | 57.1% | 0 | 6 | 0 | 3/9874 | 0/685 | 17.1% | +35.9 |
| 3 | 53.0% | 19/35 | 54.3% | 0 | 6 | 0 | 6/10190 | 0/686 | 19.2% | +33.8 |
| 4 | 61.1% | 26/35 | 74.3% | 0 | 8 | 0 | 5/10386 | 0/759 | 19.3% | +41.7 |
| 5 | 55.7% | 23/35 | 65.7% | 0 | 8 | 0 | 8/10175 | 0/710 | 20.1% | +35.7 |
| 6 | 65.0% | 30/35 | 85.7% | 0 | 3 | 0 | 10/11114 | 0/806 | 19.1% | +45.9 |
| 7 | 55.5% | 27/35 | 77.1% | 0 | 12 | 0 | 3/10458 | 0/704 | 17.0% | +38.5 |
| 8 | 58.1% | 27/35 | 77.1% | 0 | 6 | 0 | 13/10313 | 0/728 | 19.1% | +39.0 |
| 9 | 62.8% | 29/35 | 82.9% | 0 | 3 | 0 | 9/10795 | 0/784 | 22.6% | +40.2 |
| 10 | 60.3% | 23/35 | 65.7% | 0 | 5 | 0 | 6/11019 | 0/765 | 16.8% | +43.5 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 58.4% ± 2.9, baseline 18.8% ± 1.3, paired diff +39.6 ± 2.7.

Skipped turns: 68 over 10 battles (6.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.5%.

## Team records (T), summed over the seeds

- Teammate hits: 936
- Teammate bullet hits: 7752
- Teammate collisions: 55
- Shots held for the fire lane: 42641
- Reports merged: 6044019
- Engine's count of our bullets that hit one of our own members: 986
- Drives fenced: 6142

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 155 | 2152 | 19 | 7853 | 1362388 | 1634 |
| member-1 | 172 | 1362 | 11 | 8637 | 1168141 | 1167 |
| member-2 | 197 | 1450 | 4 | 8980 | 1189270 | 1255 |
| member-3 | 209 | 1398 | 12 | 8496 | 1157942 | 987 |
| member-4 | 203 | 1390 | 9 | 8675 | 1166278 | 1099 |
