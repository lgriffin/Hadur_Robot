# mn.CombatTeam 3.25.0 (team) vs hadur2.HadurTeam 3.8.5 [team-top20-385-vs-37]

35 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 20.2% | 0/35 | 0.0% | 0 | 7 | 0 | 4/6834 | 0/351 | 8.1% | +12.1 |
| 2 | 16.9% | 1/35 | 2.9% | 0 | 11 | 0 | 8/6756 | 0/308 | 7.1% | +9.8 |
| 3 | 21.4% | 3/35 | 8.6% | 0 | 8 | 0 | 6/7045 | 0/356 | 7.2% | +14.3 |
| 4 | 15.8% | 1/35 | 2.9% | 0 | 6 | 0 | 8/6464 | 0/293 | 6.2% | +9.6 |
| 5 | 18.2% | 1/35 | 2.9% | 0 | 9 | 0 | 4/6599 | 0/320 | 8.4% | +9.9 |
| 6 | 13.7% | 0/35 | 0.0% | 0 | 2 | 0 | 5/6260 | 0/269 | 8.5% | +5.3 |
| 7 | 20.7% | 0/35 | 0.0% | 0 | 5 | 0 | 2/7228 | 0/352 | 8.4% | +12.3 |
| 8 | 19.7% | 2/35 | 5.7% | 0 | 10 | 0 | 5/7064 | 0/336 | 7.4% | +12.3 |
| 9 | 18.5% | 2/35 | 5.7% | 0 | 4 | 0 | 5/6794 | 0/324 | 7.5% | +11.0 |
| 10 | 17.5% | 0/35 | 0.0% | 0 | 6 | 0 | 6/6508 | 0/312 | 10.7% | +6.8 |

Battles used: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean score share 18.3% ± 1.7, baseline 7.9% ± 0.9, paired diff +10.3 ± 1.9.

Skipped turns: 68 over 10 battles (6.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 799 over 10 battles (79.9 per battle, most in one battle 298).

Focus fire (share of our bullet damage on the round's most-hit enemy, mean over 350 rounds): 37.8%.

## Team records (T), summed over the seeds

- Teammate hits: 455
- Teammate bullet hits: 2848
- Teammate collisions: 2
- Shots held for the fire lane: 28599
- Reports merged: 3924933
- Engine's count of our bullets that hit one of our own members: 555
- Drives fenced: 549

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 100 | 725 | 1 | 5678 | 878164 | 193 |
| member-1 | 87 | 523 | 1 | 5780 | 767333 | 185 |
| member-2 | 97 | 494 | 0 | 5687 | 751496 | 23 |
| member-3 | 77 | 538 | 0 | 5676 | 765983 | 57 |
| member-4 | 94 | 568 | 0 | 5778 | 761957 | 91 |
