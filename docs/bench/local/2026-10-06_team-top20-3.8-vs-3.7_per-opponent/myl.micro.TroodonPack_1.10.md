# myl.micro.TroodonPack 1.10 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 52.9% | 8/10 | 80.0% | 0 | 18 | 0 | 3/2079 | 0/198 | 31.7% | +21.2 |
| 2 | 55.3% | 9/10 | 90.0% | 0 | 8 | 0 | 0/1992 | 0/201 | 31.5% | +23.8 |
| 3 | 56.2% | 8/10 | 80.0% | 0 | 15 | 0 | 1/2183 | 0/209 | 16.7% | +39.5 |
| 4 | 65.5% | 9/10 | 90.0% | 0 | 10 | 0 | 1/2390 | 0/239 | 38.4% | +27.1 |
| 5 | 62.4% | 8/10 | 80.0% | 0 | 13 | 0 | 1/2195 | 0/229 | 26.3% | +36.1 |
| 6 | 57.9% | 9/10 | 90.0% | 0 | 13 | 0 | 0/2282 | 0/210 | 22.5% | +35.5 |
| 7 | 51.8% | 6/10 | 60.0% | 0 | 6 | 0 | 1/2150 | 0/198 | 33.8% | +18.0 |
| 8 | 69.2% | 9/10 | 90.0% | 0 | 7 | 0 | 1/2249 | 0/245 | 36.3% | +32.8 |
| 9 | 62.0% | 8/10 | 80.0% | 0 | 13 | 0 | 1/2201 | 0/228 | 31.5% | +30.4 |
| 10 | 58.7% | 7/10 | 70.0% | 0 | 13 | 0 | 5/2180 | 0/222 | 24.8% | +34.0 |

Mean score share 59.2% ± 4.0, baseline 29.3% ± 4.8, paired diff +29.8 ± 5.1.

Skipped turns: 116 over 10 battles (11.6 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 230 over 10 battles (23.0 per battle, most in one battle 102).

## Team records (T), summed over the seeds

- Teammate hits: 176
- Teammate bullet hits: 1316
- Teammate collisions: 7
- Shots held for the fire lane: 8996
- Reports merged: 1370030
- Engine's count of our bullets that hit one of our own members: 200
- Drives fenced: 1606

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 23 | 331 | 2 | 1693 | 298004 | 359 |
| member-1 | 41 | 226 | 0 | 1821 | 269174 | 254 |
| member-2 | 38 | 271 | 2 | 1854 | 272094 | 479 |
| member-3 | 35 | 219 | 2 | 1819 | 264965 | 169 |
| member-4 | 39 | 269 | 1 | 1809 | 265793 | 345 |
