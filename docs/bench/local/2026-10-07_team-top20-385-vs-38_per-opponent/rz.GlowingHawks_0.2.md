# rz.GlowingHawks 0.2 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.3% | 22/35 | 62.9% | 0 | 6 | 0 | 5/10407 | 0/712 | 52.7% | +2.6 |
| 2 | 54.3% | 19/35 | 54.3% | 0 | 5 | 0 | 3/10333 | 0/711 | 56.0% | -1.6 |
| 3 | 50.2% | 17/35 | 48.6% | 0 | 5 | 0 | 7/9943 | 0/663 | 51.0% | -0.8 |
| 4 | 48.6% | 15/35 | 42.9% | 0 | 6 | 0 | 4/9532 | 0/644 | 50.8% | -2.3 |
| 5 | 52.7% | 19/35 | 54.3% | 0 | 9 | 0 | 6/10126 | 0/687 | 51.5% | +1.2 |
| 6 | 57.3% | 24/35 | 68.6% | 0 | 7 | 0 | 8/10228 | 0/731 | 56.0% | +1.3 |
| 7 | 52.7% | 16/35 | 45.7% | 0 | 8 | 0 | 5/10005 | 0/691 | 60.1% | -7.4 |
| 8 | 50.1% | 16/35 | 45.7% | 0 | 5 | 0 | 11/10012 | 0/661 | 51.0% | -0.9 |
| 9 | 52.9% | 15/35 | 42.9% | 0 | 8 | 0 | 8/10498 | 0/693 | 54.0% | -1.1 |
| 10 | 52.0% | 19/35 | 54.3% | 0 | 6 | 0 | 5/10379 | 0/677 | 50.3% | +1.7 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 52.6% ± 1.9, baseline 53.3% ± 2.3, paired diff -0.7 ± 2.0.

Skipped turns: 65 over 10 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 234 over 10 battles (23.4 per battle, most in one battle 234).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 32.5%.

## Team records (T), summed over the seeds

- Teammate hits: 834
- Teammate bullet hits: 5834
- Teammate collisions: 26
- Shots held for the fire lane: 42322
- Reports merged: 6175749
- Engine's count of our bullets that hit one of our own members: 933
- Drives fenced: 3352

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 154 | 1471 | 5 | 7563 | 1358280 | 578 |
| member-1 | 158 | 1100 | 3 | 8618 | 1197409 | 527 |
| member-2 | 184 | 1060 | 4 | 8859 | 1208740 | 503 |
| member-3 | 181 | 1146 | 7 | 8842 | 1214616 | 790 |
| member-4 | 157 | 1057 | 7 | 8440 | 1196704 | 954 |
