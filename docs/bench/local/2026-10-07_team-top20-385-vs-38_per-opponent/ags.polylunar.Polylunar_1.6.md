# ags.polylunar.Polylunar 1.6 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 17.1% | 1/35 | 2.9% | 0 | 5 | 0 | 4/1935 | 0/250 | 18.2% | -1.0 |
| 2 | 16.8% | 2/35 | 5.7% | 0 | 3 | 0 | 5/1869 | 0/244 | 19.2% | -2.3 |
| 3 | 21.2% | 2/35 | 5.7% | 0 | 6 | 0 | 3/2031 | 0/296 | 15.9% | +5.3 |
| 4 | 16.3% | 1/35 | 2.9% | 0 | 4 | 0 | 7/1947 | 0/246 | 16.2% | +0.1 |
| 5 | 18.6% | 2/35 | 5.7% | 0 | 5 | 0 | 1/1895 | 0/270 | 16.5% | +2.0 |
| 6 | 17.2% | 0/35 | 0.0% | 0 | 2 | 0 | 6/1903 | 0/252 | 17.7% | -0.5 |
| 7 | 16.4% | 0/35 | 0.0% | 0 | 2 | 0 | 4/1845 | 0/240 | 16.2% | +0.3 |
| 8 | 19.2% | 3/35 | 8.6% | 0 | 6 | 0 | 11/1962 | 0/272 | 18.9% | +0.3 |
| 9 | 16.5% | 1/35 | 2.9% | 0 | 4 | 0 | 3/1849 | 0/244 | 15.9% | +0.6 |
| 10 | 17.8% | 0/35 | 0.0% | 0 | 5 | 0 | 5/1909 | 0/261 | 17.5% | +0.3 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 17.7% ± 1.1, baseline 17.2% ± 0.9, paired diff +0.5 ± 1.5.

Skipped turns: 42 over 10 battles (4.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 340 over 10 battles (34.0 per battle, most in one battle 256).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.7%.

## Team records (T), summed over the seeds

- Teammate hits: 163
- Teammate bullet hits: 338
- Teammate collisions: 12
- Shots held for the fire lane: 13105
- Reports merged: 1312023
- Engine's count of our bullets that hit one of our own members: 471
- Drives fenced: 857

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 27 | 68 | 1 | 2805 | 275920 | 145 |
| member-1 | 37 | 69 | 1 | 2587 | 262530 | 107 |
| member-2 | 43 | 73 | 5 | 2654 | 266814 | 182 |
| member-3 | 26 | 66 | 3 | 2533 | 255686 | 271 |
| member-4 | 30 | 62 | 2 | 2526 | 251073 | 152 |
