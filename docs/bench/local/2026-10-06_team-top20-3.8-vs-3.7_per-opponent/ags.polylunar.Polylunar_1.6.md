# ags.polylunar.Polylunar 1.6 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 16.6% | 0/10 | 0.0% | 0 | 1 | 0 | 3/572 | 0/70 | 24.5% | -7.9 |
| 2 | 14.3% | 0/10 | 0.0% | 0 | 0 | 0 | 1/490 | 0/65 | 36.1% | -21.8 |
| 3 | 15.3% | 0/10 | 0.0% | 0 | 2 | 0 | 0/522 | 0/66 | 29.8% | -14.5 |
| 4 | 17.9% | 0/10 | 0.0% | 0 | 3 | 0 | 0/525 | 0/71 | 25.8% | -8.0 |
| 5 | 18.3% | 1/10 | 10.0% | 0 | 2 | 0 | 2/603 | 0/74 | 21.7% | -3.4 |
| 6 | 17.5% | 1/10 | 10.0% | 0 | 2 | 0 | 0/561 | 0/72 | 20.8% | -3.4 |
| 7 | 20.9% | 1/10 | 10.0% | 0 | 5 | 0 | 1/604 | 0/82 | 24.4% | -3.5 |
| 8 | 20.3% | 1/10 | 10.0% | 0 | 3 | 0 | 1/578 | 0/86 | 29.6% | -9.3 |
| 9 | 18.0% | 0/10 | 0.0% | 0 | 0 | 0 | 0/562 | 0/78 | 27.0% | -9.0 |
| 10 | 18.1% | 0/10 | 0.0% | 0 | 1 | 0 | 1/541 | 0/77 | 26.3% | -8.3 |

Mean score share 17.7% ± 1.4, baseline 26.6% ± 3.2, paired diff -8.9 ± 4.1.

Skipped turns: 19 over 10 battles (1.9 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 422 over 10 battles (42.2 per battle, most in one battle 237).

## Team records (T), summed over the seeds

- Teammate hits: 46
- Teammate bullet hits: 88
- Teammate collisions: 2
- Shots held for the fire lane: 3707
- Reports merged: 382034
- Engine's count of our bullets that hit one of our own members: 127
- Drives fenced: 79

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 5 | 23 | 1 | 919 | 83722 | 18 |
| member-1 | 12 | 18 | 0 | 685 | 75682 | 12 |
| member-2 | 11 | 16 | 0 | 727 | 74528 | 32 |
| member-3 | 10 | 15 | 0 | 701 | 72918 | 6 |
| member-4 | 8 | 16 | 1 | 675 | 75184 | 11 |
