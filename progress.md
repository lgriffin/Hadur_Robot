# Queue pc-shield-still: progress

Updated 2026-10-31 18:58:07 PC time (18:58 UTC), runner pid 47492.

- `prep` done, exit 0 in 2 min
- `still` done, exit 0 in 24 min
- `add` running
- `gate` pending
- `pr` pending

### still

**1638 of 1638 battles** (100%), 0 failed, 562 read back from an earlier run. Running 24 min, 2653 battles/h, about 0 min left (ends ~18:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.3 overall, first 100 15.7, last 100 17.3; engine disables 97.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 546 | 0 | 94.43 | - | - | - | 20.9 |
| aa | 546 | 0 | 94.47 | +0.01 (273 robots) | ±0.12 | -0.18 .. +0.20 | 20.3 |
| sz | 546 | 0 | 94.86 | +0.09 (273 robots) | ±0.12 | -0.10 .. +0.28 | 18.4 |

APS = mean difference over the robots read x 273 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 273 robots; 1% band ±0.50 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1638 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 17.2 a battle over the last 200 (first 200: 19.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 273 robots, stop band ±0.58 |
| `futility sz below 0.05 after 30%` | finish | ok | sz +0.09, best case +0.28 APS vs bar +0.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### add

**487 of 576 battles** (85%), 0 failed. Running 6 min, 4878 battles/h, about 1 min left (ends ~18:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.0 overall, first 100 12.9, last 100 12.4; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 163 | 0 | 89.91 | - | - | - | 13.3 |
| aa | 163 | 0 | 89.79 | -0.01 (63 robots) | ±0.03 | -0.05 .. +0.04 | 12.3 |
| szmt | 161 | 0 | 89.83 | -0.00 (63 robots) | ±0.08 | -0.12 .. +0.12 | 13.3 |

APS = mean difference over the robots read x 64 panel robots / 1217 pairings.
A/A: aa - c -0.12 pts over 63 robots; 1% band ±0.91 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 487 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.4 a battle over the last 200 (first 200: 13.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.12 pts over 63 robots, stop band ±1.06 |

Stopping now would leave 89 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
18:52:07 still exit=0 in 1460 s
18:52:07 start add
18:52:07 watching add: 5 stop rule(s), shown only
```
