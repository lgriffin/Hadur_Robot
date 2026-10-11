# apvteam.MambaTeam 0.7.5 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 49.7% | 22/35 | 62.9% | 0 | 6 | 0 | 8/7292 | 0/666 | 54.9% | -5.2 |
| 2 | 46.4% | 23/35 | 65.7% | 0 | 4 | 0 | 7/7153 | 0/629 | 50.8% | -4.4 |
| 3 | 50.7% | 24/35 | 68.6% | 0 | 6 | 0 | 8/7499 | 0/670 | 56.4% | -5.7 |
| 4 | 55.1% | 27/35 | 77.1% | 0 | 8 | 0 | 8/7653 | 0/718 | 48.6% | +6.6 |
| 5 | 53.4% | 27/35 | 77.1% | 0 | 4 | 0 | 3/7878 | 0/703 | 50.7% | +2.7 |
| 6 | 55.0% | 29/35 | 82.9% | 0 | 5 | 0 | 6/7683 | 0/715 | 50.6% | +4.4 |
| 7 | 55.4% | 28/35 | 80.0% | 0 | 4 | 0 | 6/7803 | 0/724 | 55.4% | -0.1 |
| 8 | 53.7% | 26/35 | 74.3% | 0 | 6 | 0 | 8/7699 | 0/703 | 52.1% | +1.5 |
| 9 | 50.8% | 23/35 | 65.7% | 0 | 7 | 0 | 3/6958 | 0/675 | 51.2% | -0.4 |
| 10 | 45.1% | 21/35 | 60.0% | 0 | 7 | 0 | 4/7032 | 0/609 | 50.9% | -5.9 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 51.5% ± 2.6, baseline 52.2% ± 1.8, paired diff -0.6 ± 3.2.

Skipped turns: 57 over 10 battles (5.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 31.6%.

## Team records (T), summed over the seeds

- Teammate hits: 804
- Teammate bullet hits: 6543
- Teammate collisions: 87
- Shots held for the fire lane: 39567
- Reports merged: 4858679
- Engine's count of our bullets that hit one of our own members: 930
- Drives fenced: 4814

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 166 | 1686 | 11 | 8376 | 1076499 | 1259 |
| member-1 | 146 | 1191 | 1 | 7695 | 934629 | 763 |
| member-2 | 164 | 1251 | 40 | 7830 | 956763 | 1037 |
| member-3 | 168 | 1207 | 3 | 7999 | 954518 | 890 |
| member-4 | 160 | 1208 | 32 | 7667 | 936270 | 865 |
