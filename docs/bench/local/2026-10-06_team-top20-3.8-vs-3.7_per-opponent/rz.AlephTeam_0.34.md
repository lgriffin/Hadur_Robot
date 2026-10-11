# rz.AlephTeam 0.34 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 28.9% | 1/10 | 10.0% | 0 | 3 | 0 | 1/2058 | 0/132 | 6.9% | +21.9 |
| 2 | 35.6% | 2/10 | 20.0% | 0 | 10 | 0 | 0/2174 | 0/152 | 13.4% | +22.3 |
| 3 | 23.9% | 0/10 | 0.0% | 0 | 2 | 0 | 3/1969 | 0/117 | 6.6% | +17.3 |
| 4 | 21.6% | 0/10 | 0.0% | 0 | 5 | 0 | 2/1863 | 0/109 | 10.7% | +10.9 |
| 5 | 25.7% | 0/10 | 0.0% | 0 | 8 | 0 | 0/2045 | 0/122 | 8.8% | +17.0 |
| 6 | 33.5% | 0/10 | 0.0% | 0 | 8 | 0 | 2/2220 | 0/149 | 6.4% | +27.1 |
| 7 | 27.6% | 1/10 | 10.0% | 0 | 6 | 0 | 4/2031 | 0/128 | 7.8% | +19.8 |
| 8 | 31.4% | 1/10 | 10.0% | 0 | 9 | 0 | 2/2144 | 0/142 | 7.4% | +24.0 |
| 9 | 28.3% | 2/10 | 20.0% | 0 | 8 | 0 | 1/2201 | 0/129 | 8.3% | +20.1 |
| 10 | 21.3% | 1/10 | 10.0% | 0 | 3 | 0 | 2/1936 | 0/105 | 6.6% | +14.7 |

Mean score share 27.8% ± 3.4, baseline 8.3% ± 1.6, paired diff +19.5 ± 3.4.

Skipped turns: 62 over 10 battles (6.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 941 over 10 battles (94.1 per battle, most in one battle 298).

## Team records (T), summed over the seeds

- Teammate hits: 125
- Teammate bullet hits: 1129
- Teammate collisions: 0
- Shots held for the fire lane: 8843
- Reports merged: 1195816
- Engine's count of our bullets that hit one of our own members: 152
- Drives fenced: 758

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 21 | 291 | 0 | 1787 | 269585 | 240 |
| member-1 | 26 | 184 | 0 | 1743 | 229318 | 22 |
| member-2 | 23 | 230 | 0 | 1691 | 230250 | 108 |
| member-3 | 27 | 204 | 0 | 1847 | 234300 | 288 |
| member-4 | 28 | 220 | 0 | 1775 | 232363 | 100 |
