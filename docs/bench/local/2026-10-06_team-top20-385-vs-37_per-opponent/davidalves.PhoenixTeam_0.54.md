# davidalves.PhoenixTeam 0.54 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.1% | 17/35 | 48.6% | 0 | 8 | 0 | 9/9700 | 0/728 | 21.3% | +32.8 |
| 2 | 52.1% | 15/35 | 42.9% | 0 | 6 | 0 | 11/9594 | 0/706 | 21.7% | +30.5 |
| 3 | 50.0% | 16/35 | 45.7% | 0 | 3 | 0 | 5/9156 | 0/678 | 24.0% | +26.0 |
| 4 | 59.9% | 17/35 | 48.6% | 0 | 7 | 0 | 5/9474 | 0/791 | 22.6% | +37.3 |
| 5 | 62.6% | 23/35 | 65.7% | 0 | 6 | 0 | 6/10004 | 0/815 | 17.2% | +45.4 |
| 6 | 58.5% | 19/35 | 54.3% | 0 | 8 | 0 | 5/9728 | 0/771 | 23.3% | +35.2 |
| 7 | 54.6% | 17/35 | 48.6% | 0 | 9 | 0 | 6/9181 | 0/736 | 20.8% | +33.8 |
| 8 | 57.7% | 16/35 | 45.7% | 0 | 7 | 0 | 9/9605 | 0/759 | 24.1% | +33.7 |
| 9 | 58.0% | 19/35 | 54.3% | 0 | 10 | 0 | 5/9779 | 0/766 | 19.7% | +38.3 |
| 10 | 55.8% | 16/35 | 45.7% | 0 | 6 | 0 | 8/9720 | 0/747 | 22.1% | +33.7 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 56.3% ± 2.7, baseline 21.7% ± 1.5, paired diff +34.7 ± 3.6.

Skipped turns: 70 over 10 battles (7.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 298 over 10 battles (29.8 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 32.6%.

## Team records (T), summed over the seeds

- Teammate hits: 898
- Teammate bullet hits: 6844
- Teammate collisions: 50
- Shots held for the fire lane: 37790
- Reports merged: 5747781
- Engine's count of our bullets that hit one of our own members: 992
- Drives fenced: 4373

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 144 | 1784 | 10 | 6831 | 1275389 | 836 |
| member-1 | 198 | 1274 | 3 | 7743 | 1122202 | 944 |
| member-2 | 187 | 1294 | 3 | 7833 | 1124528 | 928 |
| member-3 | 189 | 1271 | 19 | 7652 | 1122779 | 913 |
| member-4 | 180 | 1221 | 15 | 7731 | 1102883 | 752 |
