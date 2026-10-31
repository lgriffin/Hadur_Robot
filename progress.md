# Queue pc-shield-still: progress

Updated 2026-10-31 18:42:59 PC time (18:42 UTC), runner pid 47492.

- `prep` done, exit 0 in 2 min
- `still` running
- `add` pending
- `gate` pending
- `pr` pending

### still

**1288 of 1638 battles** (79%), 0 failed, 562 read back from an earlier run. Running 15 min, 2867 battles/h, about 7 min left (ends ~18:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.7 overall, first 100 15.7, last 100 23.5; engine disables 57.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 431 | 0 | 94.32 | - | - | - | 20.8 |
| aa | 428 | 0 | 94.39 | +0.01 (260 robots) | ±0.16 | -0.22 .. +0.25 | 19.6 |
| sz | 429 | 0 | 94.82 | +0.10 (260 robots) | ±0.14 | -0.12 .. +0.32 | 17.7 |

APS = mean difference over the robots read x 273 panel robots / 1217 pairings.
A/A: aa - c +0.06 pts over 260 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1288 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 21.8 a battle over the last 200 (first 200: 19.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.06 pts over 260 robots, stop band ±0.66 |
| `futility sz below 0.05 after 30%` | finish | ok | sz +0.10, best case +0.32 APS vs bar +0.05 |

Stopping now would leave 350 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:48:24 progress pushed to origin claude/pc-shield-still-progress (every 15 min)
15:50:38 prep exit=0 in 137 s
15:50:38 start still
15:50:38 watching still: 6 stop rule(s)
15:51:23 progress still: 28/1638 (2%) battles, 2271/h, ETA 43 min, 0 failed, skips 16.2/battle (last 100), aa +0.00, sz -0.87
16:02:32 STOP still by rule aa after 20%: aa - c +1.00 pts over 150 robots, stop band ±1.00; 562 battles fought and kept, 1076 battles left unrun (about 23 min)
16:02:32 still exit=75 in 713 s (halted, aa after 20%)
16:02:35 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/505
16:02:35 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
18:27:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
18:27:47 skip prep (already exit=0)
18:27:47 start still
18:27:47 watching still: 6 stop rule(s), shown only
18:27:49 progress pushed to origin claude/pc-shield-still-progress (every 15 min)
18:28:47 progress still: 592/1638 (36%) battles, 1784/h, ETA 35 min, 0 failed, skips 17.2/battle (last 100), aa +0.18, sz +0.07
```
