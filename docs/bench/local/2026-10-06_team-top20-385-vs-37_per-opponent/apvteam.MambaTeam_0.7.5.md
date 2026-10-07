# apvteam.MambaTeam 0.7.5 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.6% | 24/35 | 68.6% | 0 | 7 | 0 | 2/7346 | 0/711 | 18.7% | +36.0 |
| 2 | 48.8% | 26/35 | 74.3% | 0 | 4 | 0 | 8/7398 | 0/646 | 17.3% | +31.6 |
| 3 | 52.6% | 26/35 | 74.3% | 0 | 5 | 0 | 6/7424 | 0/696 | 19.9% | +32.7 |
| 4 | 54.1% | 25/35 | 71.4% | 0 | 8 | 0 | 1/7573 | 0/713 | 22.6% | +31.5 |
| 5 | 56.0% | 26/35 | 74.3% | 0 | 4 | 0 | 4/7446 | 0/723 | 22.2% | +33.7 |
| 6 | 51.5% | 24/35 | 68.6% | 0 | 6 | 0 | 3/7351 | 0/680 | 20.9% | +30.6 |
| 7 | 56.4% | 27/35 | 77.1% | 0 | 5 | 0 | 9/7823 | 0/733 | 17.5% | +38.9 |
| 8 | 53.1% | 25/35 | 71.4% | 0 | 9 | 0 | 3/7922 | 0/707 | 23.3% | +29.8 |
| 9 | 42.6% | 19/35 | 54.3% | 0 | 8 | 0 | 6/7092 | 0/584 | 21.5% | +21.1 |
| 10 | 52.0% | 24/35 | 68.6% | 0 | 3 | 0 | 8/7540 | 0/693 | 25.5% | +26.5 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 52.2% ± 2.9, baseline 20.9% ± 1.9, paired diff +31.2 ± 3.5.

Skipped turns: 59 over 10 battles (5.9 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 32.0%.

## Team records (T), summed over the seeds

- Teammate hits: 838
- Teammate bullet hits: 6187
- Teammate collisions: 19
- Shots held for the fire lane: 39669
- Reports merged: 4800474
- Engine's count of our bullets that hit one of our own members: 972
- Drives fenced: 3370

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 172 | 1586 | 1 | 8603 | 1068933 | 733 |
| member-1 | 162 | 1123 | 4 | 7719 | 923435 | 625 |
| member-2 | 189 | 1188 | 5 | 7810 | 934609 | 707 |
| member-3 | 156 | 1150 | 4 | 7682 | 932271 | 644 |
| member-4 | 159 | 1140 | 5 | 7855 | 941226 | 661 |
