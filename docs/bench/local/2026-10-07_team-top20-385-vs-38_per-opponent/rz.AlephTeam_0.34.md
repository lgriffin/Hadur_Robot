# rz.AlephTeam 0.34 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 27.7% | 3/35 | 8.6% | 0 | 5 | 0 | 2/6986 | 0/451 | 26.3% | +1.4 |
| 2 | 19.2% | 0/35 | 0.0% | 0 | 9 | 0 | 6/6455 | 0/351 | 30.3% | -11.1 |
| 3 | 25.5% | 0/35 | 0.0% | 0 | 6 | 0 | 3/6871 | 0/433 | 28.8% | -3.3 |
| 4 | 25.6% | 3/35 | 8.6% | 0 | 7 | 0 | 3/7198 | 0/428 | 27.5% | -1.9 |
| 5 | 25.9% | 0/35 | 0.0% | 0 | 7 | 0 | 9/7179 | 0/428 | 23.5% | +2.4 |
| 6 | 28.0% | 4/35 | 11.4% | 0 | 9 | 0 | 2/7106 | 0/456 | 27.0% | +1.0 |
| 7 | 27.4% | 2/35 | 5.7% | 0 | 7 | 0 | 4/7324 | 0/446 | 24.8% | +2.6 |
| 8 | 25.1% | 3/35 | 8.6% | 0 | 12 | 0 | 7/7024 | 0/412 | 27.3% | -2.2 |
| 9 | 23.1% | 0/35 | 0.0% | 0 | 9 | 0 | 2/6858 | 0/397 | 27.3% | -4.2 |
| 10 | 21.8% | 0/35 | 0.0% | 0 | 3 | 0 | 4/6445 | 0/383 | 24.4% | -2.6 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 24.9% ± 2.0, baseline 26.7% ± 1.5, paired diff -1.8 ± 2.9.

Skipped turns: 74 over 10 battles (7.4 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 715 over 10 battles (71.5 per battle, most in one battle 406).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 34.6%.

## Team records (T), summed over the seeds

- Teammate hits: 524
- Teammate bullet hits: 3537
- Teammate collisions: 2
- Shots held for the fire lane: 31313
- Reports merged: 4080606
- Engine's count of our bullets that hit one of our own members: 633
- Drives fenced: 933

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 100 | 907 | 1 | 6132 | 915624 | 268 |
| member-1 | 122 | 684 | 1 | 6372 | 799692 | 154 |
| member-2 | 92 | 663 | 0 | 6158 | 779681 | 67 |
| member-3 | 116 | 645 | 0 | 6409 | 800303 | 315 |
| member-4 | 94 | 638 | 0 | 6242 | 785306 | 129 |
