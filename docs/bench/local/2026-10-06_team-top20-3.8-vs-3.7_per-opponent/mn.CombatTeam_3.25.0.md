# mn.CombatTeam 3.25.0 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 22.0% | 0/10 | 0.0% | 0 | 3 | 0 | 2/2148 | 0/104 | 10.0% | +11.9 |
| 2 | 13.8% | 0/10 | 0.0% | 0 | 6 | 0 | 1/1954 | 0/75 | 14.4% | -0.6 |
| 3 | 25.3% | 0/10 | 0.0% | 0 | 2 | 0 | 1/2016 | 0/115 | 6.5% | +18.8 |
| 4 | 27.9% | 0/10 | 0.0% | 0 | 7 | 0 | 1/2293 | 0/125 | 10.3% | +17.7 |
| 5 | 22.4% | 0/10 | 0.0% | 0 | 0 | 0 | 2/1913 | 0/108 | 7.7% | +14.7 |
| 6 | 27.7% | 2/10 | 20.0% | 0 | 5 | 0 | 1/2221 | 0/124 | 7.1% | +20.6 |
| 7 | 26.3% | 0/10 | 0.0% | 0 | 5 | 0 | 1/1945 | 0/122 | 11.9% | +14.5 |
| 8 | 22.0% | 1/10 | 10.0% | 0 | 4 | 0 | 2/1995 | 0/106 | 10.0% | +12.0 |
| 9 | 22.1% | 0/10 | 0.0% | 0 | 2 | 0 | 1/2019 | 0/105 | 4.9% | +17.2 |
| 10 | 21.8% | 0/10 | 0.0% | 0 | 4 | 0 | 2/2111 | 0/100 | 5.7% | +16.1 |

Mean score share 23.1% ± 2.9, baseline 8.8% ± 2.1, paired diff +14.3 ± 4.2.

Skipped turns: 38 over 10 battles (3.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1288 over 10 battles (128.8 per battle, most in one battle 428).

## Team records (T), summed over the seeds

- Teammate hits: 115
- Teammate bullet hits: 719
- Teammate collisions: 2
- Shots held for the fire lane: 8507
- Reports merged: 1190826
- Engine's count of our bullets that hit one of our own members: 140
- Drives fenced: 306

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 18 | 195 | 1 | 1610 | 267218 | 158 |
| member-1 | 18 | 115 | 1 | 1693 | 226547 | 101 |
| member-2 | 29 | 137 | 0 | 1786 | 234194 | 5 |
| member-3 | 25 | 133 | 0 | 1692 | 227508 | 12 |
| member-4 | 25 | 139 | 0 | 1726 | 235359 | 30 |
