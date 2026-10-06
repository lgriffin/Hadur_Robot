# apvteam.MambaTeam 0.7.5 (team) vs hadur2.HadurTeam 3.8 [team-top20-3.8-vs-3.7]

10 rounds a battle, 10 seeds, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.1% | 9/10 | 90.0% | 0 | 2 | 0 | 1/2438 | 0/236 | 23.5% | +41.7 |
| 2 | 56.2% | 9/10 | 90.0% | 0 | 6 | 0 | 0/2136 | 0/209 | 27.8% | +28.4 |
| 3 | 52.8% | 7/10 | 70.0% | 0 | 4 | 0 | 1/2220 | 0/201 | 13.9% | +38.9 |
| 4 | 50.0% | 6/10 | 60.0% | 0 | 10 | 0 | 2/2066 | 0/194 | 20.8% | +29.2 |
| 5 | 53.8% | 7/10 | 70.0% | 0 | 6 | 0 | 0/1985 | 0/201 | 29.8% | +24.0 |
| 6 | 63.0% | 8/10 | 80.0% | 0 | 4 | 0 | 1/2132 | 0/227 | 21.9% | +41.1 |
| 7 | 58.1% | 7/10 | 70.0% | 0 | 5 | 0 | 0/2371 | 0/221 | 20.2% | +37.9 |
| 8 | 53.9% | 5/10 | 50.0% | 0 | 3 | 0 | 3/2080 | 0/207 | 19.4% | +34.4 |
| 9 | 69.4% | 8/10 | 80.0% | 0 | 4 | 0 | 1/2263 | 0/250 | 21.0% | +48.3 |
| 10 | 60.4% | 7/10 | 70.0% | 0 | 8 | 0 | 2/2392 | 0/225 | 29.5% | +30.9 |

Mean score share 58.3% ± 4.4, baseline 22.8% ± 3.6, paired diff +35.5 ± 5.3.

Skipped turns: 52 over 10 battles (5.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 267 over 10 battles (26.7 per battle, most in one battle 267).

## Team records (T), summed over the seeds

- Teammate hits: 267
- Teammate bullet hits: 2136
- Teammate collisions: 6
- Shots held for the fire lane: 11272
- Reports merged: 1452471
- Engine's count of our bullets that hit one of our own members: 307
- Drives fenced: 2027

Members:

| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held | Reports merged | Drives fenced |
|---|---|---|---|---|---|---|
| member-0 | 64 | 520 | 2 | 2269 | 318694 | 353 |
| member-1 | 52 | 389 | 0 | 2212 | 279652 | 361 |
| member-2 | 51 | 415 | 0 | 2195 | 281052 | 501 |
| member-3 | 44 | 381 | 2 | 2332 | 285420 | 398 |
| member-4 | 56 | 431 | 2 | 2264 | 287653 | 414 |
