# davidalves.PhoenixTeam 0.54 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.1% | 15/35 | 42.9% | 0 | 15 | 0 | 3/9357 | 0/730 | 52.3% | +1.9 |
| 2 | 64.3% | 22/35 | 62.9% | 0 | 3 | 0 | 9/9975 | 0/832 | 59.2% | +5.1 |
| 3 | 52.1% | 15/35 | 42.9% | 0 | 7 | 0 | 6/9500 | 0/706 | 53.5% | -1.4 |
| 4 | 57.4% | 18/35 | 51.4% | 0 | 7 | 0 | 10/9407 | 0/752 | 55.9% | +1.5 |
| 5 | 56.6% | 18/35 | 51.4% | 0 | 7 | 0 | 6/9323 | 0/740 | 58.2% | -1.6 |
| 6 | 62.5% | 23/35 | 65.7% | 0 | 10 | 0 | 8/10059 | 0/816 | 54.0% | +8.5 |
| 7 | 55.3% | 18/35 | 51.4% | 0 | 6 | 0 | 9/9762 | 0/729 | 56.5% | -1.1 |
| 8 | 55.8% | 17/35 | 48.6% | 0 | 7 | 0 | 4/9628 | 0/737 | 55.0% | +0.7 |
| 9 | 53.3% | 15/35 | 42.9% | 0 | 9 | 0 | 5/9710 | 0/727 | 54.8% | -1.5 |
| 10 | 48.6% | 10/35 | 28.6% | 0 | 6 | 0 | 2/9019 | 0/671 | 52.9% | -4.3 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 56.0% ± 3.3, baseline 55.2% ± 1.6, paired diff +0.8 ± 2.7.

Skipped turns: 77 over 10 battles (7.7 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 104 over 10 battles (10.4 per battle, most in one battle 104).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 33.1%.

## Team records (T), summed over the seeds

- Teammate hits: 851
- Teammate bullet hits: 6847
- Teammate collisions: 65
- Shots held for the fire lane: 37164
- Reports merged: 5691081
- Engine's count of our bullets that hit one of our own members: 941
- Drives fenced: 5571

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 138 | 1709 | 10 | 7079 | 1259470 | 1324 |
| member-1 | 184 | 1263 | 21 | 7363 | 1097429 | 1087 |
| member-2 | 184 | 1284 | 11 | 7535 | 1101579 | 1209 |
| member-3 | 170 | 1286 | 15 | 7583 | 1118192 | 872 |
| member-4 | 175 | 1305 | 8 | 7604 | 1114411 | 1079 |
