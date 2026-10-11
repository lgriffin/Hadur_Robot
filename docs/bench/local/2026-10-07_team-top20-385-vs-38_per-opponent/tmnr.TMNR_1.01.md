# tmnr.TMNR 1.01 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-38]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 50.3% | 26/35 | 74.3% | 0 | 17 | 0 | 5/7595 | 0/677 | 48.5% | +1.8 |
| 2 | 51.2% | 27/35 | 77.1% | 0 | 17 | 0 | 6/7401 | 0/684 | 52.0% | -0.8 |
| 3 | 51.9% | 25/35 | 71.4% | 0 | 25 | 0 | 7/7529 | 0/699 | 54.8% | -2.8 |
| 4 | 54.8% | 27/35 | 77.1% | 0 | 20 | 0 | 5/7489 | 0/715 | 54.7% | +0.2 |
| 5 | 52.7% | 22/35 | 62.9% | 0 | 25 | 0 | 7/7676 | 0/710 | 52.5% | +0.2 |
| 6 | 52.9% | 25/35 | 71.4% | 0 | 12 | 0 | 4/7545 | 0/707 | 51.7% | +1.2 |
| 7 | 46.0% | 23/35 | 65.7% | 0 | 12 | 0 | 6/7177 | 0/633 | 54.9% | -8.9 |
| 8 | 54.0% | 29/35 | 82.9% | 0 | 12 | 0 | 5/7520 | 0/717 | 52.1% | +1.9 |
| 9 | 58.5% | 30/35 | 85.7% | 0 | 13 | 0 | 3/7322 | 0/752 | 46.6% | +11.9 |
| 10 | 48.3% | 28/35 | 80.0% | 0 | 20 | 0 | 5/7391 | 0/651 | 57.5% | -9.2 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 52.1% ± 2.5, baseline 52.5% ± 2.3, paired diff -0.5 ± 4.3.

Skipped turns: 173 over 10 battles (17.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 562 over 10 battles (56.2 per battle, most in one battle 216).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 34.3%.

## Team records (T), summed over the seeds

- Teammate hits: 590
- Teammate bullet hits: 4817
- Teammate collisions: 20
- Shots held for the fire lane: 31570
- Reports merged: 4492968
- Engine's count of our bullets that hit one of our own members: 679
- Drives fenced: 2349

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 114 | 1207 | 5 | 6219 | 998814 | 535 |
| member-1 | 118 | 869 | 3 | 6329 | 860867 | 454 |
| member-2 | 114 | 892 | 3 | 6292 | 870905 | 388 |
| member-3 | 133 | 922 | 6 | 6430 | 877552 | 384 |
| member-4 | 111 | 927 | 3 | 6300 | 884830 | 588 |
