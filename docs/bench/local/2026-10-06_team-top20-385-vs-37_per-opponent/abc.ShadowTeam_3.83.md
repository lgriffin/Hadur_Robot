# abc.ShadowTeam 3.83 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 19.8% | 3/35 | 8.6% | 0 | 5 | 0 | 5/7425 | 0/343 | 9.8% | +10.0 |
| 2 | 22.3% | 4/35 | 11.4% | 0 | 6 | 0 | 3/7672 | 0/379 | 7.7% | +14.7 |
| 3 | 27.4% | 4/35 | 11.4% | 0 | 2 | 0 | 4/7657 | 0/434 | 8.4% | +19.1 |
| 4 | 19.8% | 2/35 | 5.7% | 0 | 5 | 0 | 7/7433 | 0/342 | 7.7% | +12.1 |
| 5 | 20.1% | 4/35 | 11.4% | 0 | 8 | 0 | 4/7293 | 0/343 | 11.4% | +8.7 |
| 6 | 22.6% | 3/35 | 8.6% | 0 | 8 | 0 | 3/7337 | 0/379 | 7.3% | +15.3 |
| 7 | 23.6% | 3/35 | 8.6% | 0 | 7 | 0 | 5/7422 | 0/387 | 7.3% | +16.3 |
| 8 | 23.4% | 4/35 | 11.4% | 0 | 9 | 0 | 6/7676 | 0/385 | 8.2% | +15.2 |
| 9 | 24.4% | 2/35 | 5.7% | 0 | 4 | 0 | 5/7745 | 0/404 | 6.6% | +17.9 |
| 10 | 26.8% | 6/35 | 17.1% | 0 | 7 | 0 | 3/8032 | 0/420 | 7.1% | +19.7 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 23.0% ± 1.9, baseline 8.1% ± 1.0, paired diff +14.9 ± 2.6.

Skipped turns: 61 over 10 battles (6.1 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 893 over 10 battles (89.3 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.6%.

## Team records (T), summed over the seeds

- Teammate hits: 442
- Teammate bullet hits: 4308
- Teammate collisions: 3
- Shots held for the fire lane: 31088
- Reports merged: 4240348
- Engine's count of our bullets that hit one of our own members: 515
- Drives fenced: 298

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 99 | 1127 | 1 | 6170 | 952692 | 92 |
| member-1 | 94 | 804 | 1 | 6308 | 832169 | 38 |
| member-2 | 86 | 804 | 1 | 6208 | 816945 | 54 |
| member-3 | 78 | 819 | 0 | 6156 | 823528 | 59 |
| member-4 | 85 | 754 | 0 | 6246 | 815014 | 55 |
