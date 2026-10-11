# rz.HOFSwarm 1.1 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.8% | 25/35 | 71.4% | 0 | 6 | 0 | 2/9077 | 0/718 | 19.0% | +35.8 |
| 2 | 50.7% | 19/35 | 54.3% | 0 | 7 | 0 | 8/8909 | 0/682 | 13.3% | +37.4 |
| 3 | 50.8% | 18/35 | 51.4% | 0 | 6 | 0 | 7/9408 | 0/684 | 15.6% | +35.2 |
| 4 | 53.4% | 18/35 | 51.4% | 0 | 5 | 0 | 2/9513 | 0/713 | 15.2% | +38.2 |
| 5 | 55.6% | 23/35 | 65.7% | 0 | 7 | 0 | 5/9335 | 0/734 | 17.8% | +37.8 |
| 6 | 52.4% | 21/35 | 60.0% | 0 | 9 | 0 | 6/9052 | 0/694 | 14.7% | +37.7 |
| 7 | 54.5% | 21/35 | 60.0% | 0 | 7 | 0 | 6/8999 | 0/719 | 16.0% | +38.5 |
| 8 | 55.5% | 20/35 | 57.1% | 0 | 9 | 0 | 5/9310 | 0/739 | 15.5% | +40.0 |
| 9 | 54.8% | 21/35 | 60.0% | 0 | 7 | 0 | 7/9441 | 0/725 | 16.2% | +38.6 |
| 10 | 45.9% | 16/35 | 45.7% | 0 | 7 | 0 | 1/8441 | 0/632 | 13.1% | +32.8 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 52.8% ± 2.2, baseline 15.6% ± 1.3, paired diff +37.2 ± 1.5.

Skipped turns: 70 over 10 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 146 over 10 battles (14.6 per battle, most in one battle 146).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 34.3%.

## Team records (T), summed over the seeds

- Teammate hits: 767
- Teammate bullet hits: 5748
- Teammate collisions: 38
- Shots held for the fire lane: 39437
- Reports merged: 5676796
- Engine's count of our bullets that hit one of our own members: 882
- Drives fenced: 3442

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 135 | 1420 | 11 | 7157 | 1259461 | 922 |
| member-1 | 161 | 1093 | 9 | 7975 | 1098459 | 634 |
| member-2 | 157 | 1037 | 7 | 8165 | 1105744 | 714 |
| member-3 | 150 | 1128 | 5 | 8038 | 1107117 | 520 |
| member-4 | 164 | 1070 | 6 | 8102 | 1106015 | 652 |
