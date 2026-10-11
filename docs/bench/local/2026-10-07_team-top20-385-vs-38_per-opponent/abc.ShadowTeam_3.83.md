# abc.ShadowTeam 3.83 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 19.0% | 1/35 | 2.9% | 0 | 8 | 0 | 4/7129 | 0/336 | 21.6% | -2.7 |
| 2 | 24.5% | 1/35 | 2.9% | 0 | 6 | 0 | 3/7651 | 0/412 | 20.7% | +3.9 |
| 3 | 24.1% | 5/35 | 14.3% | 0 | 6 | 0 | 7/7719 | 0/395 | 23.9% | +0.2 |
| 4 | 20.0% | 2/35 | 5.7% | 0 | 6 | 0 | 8/6921 | 0/355 | 19.5% | +0.5 |
| 5 | 17.7% | 0/35 | 0.0% | 0 | 4 | 0 | 10/7000 | 0/317 | 21.8% | -4.1 |
| 6 | 25.7% | 4/35 | 11.4% | 0 | 9 | 0 | 8/7735 | 0/412 | 23.3% | +2.4 |
| 7 | 25.8% | 6/35 | 17.1% | 0 | 6 | 0 | 12/7737 | 0/408 | 19.3% | +6.5 |
| 8 | 22.8% | 4/35 | 11.4% | 0 | 8 | 0 | 5/7452 | 0/382 | 22.5% | +0.4 |
| 9 | 27.2% | 5/35 | 14.3% | 0 | 5 | 0 | 4/7545 | 0/432 | 23.6% | +3.7 |
| 10 | 18.4% | 1/35 | 2.9% | 0 | 5 | 0 | 5/7012 | 0/328 | 21.3% | -2.9 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 22.5% ± 2.5, baseline 21.8% ± 1.1, paired diff +0.8 ± 2.4.

Skipped turns: 63 over 10 battles (6.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 639 over 10 battles (63.9 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 34.3%.

## Team records (T), summed over the seeds

- Teammate hits: 463
- Teammate bullet hits: 4353
- Teammate collisions: 18
- Shots held for the fire lane: 30115
- Reports merged: 4115655
- Engine's count of our bullets that hit one of our own members: 548
- Drives fenced: 694

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 84 | 1090 | 2 | 6008 | 930574 | 174 |
| member-1 | 90 | 789 | 1 | 6075 | 787309 | 125 |
| member-2 | 103 | 836 | 6 | 5919 | 792256 | 151 |
| member-3 | 102 | 833 | 9 | 6146 | 811561 | 195 |
| member-4 | 84 | 805 | 0 | 5967 | 793955 | 49 |
