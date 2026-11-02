# Queue pc-mimic: progress

Updated 2026-11-02 16:43:49 PC time (16:43 UTC), runner pid 8864.

- `prep` done, exit 0 in 1 min
- `screen` done, exit 0 in 41 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### screen

**2019 of 1989 battles** (102%), 0 failed, 526 read back from an earlier run. Running 41 min, 2246 battles/h, about -1 min left (ends ~16:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.0 overall, first 100 41.3, last 100 35.7; engine disables 24.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 673 | 10 | 84.55 | - | - | - | 34.8 |
| aa | 673 | 10 | 84.41 | -0.03 (221 robots) | ±0.06 | -0.12 .. +0.07 | 34.0 |
| mm | 673 | 10 | 84.33 | -0.03 (221 robots) | ±0.06 | -0.12 .. +0.07 | 35.4 |

APS = mean difference over the robots read x 221 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 221 robots; 1% band ±0.45 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2019 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 34.9 a battle over the last 200 (first 200: 38.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave -30 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:29:52 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/570
09:29:52 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
16:02:59 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
16:02:59 skip prep (already exit=0)
16:02:59 start screen
16:02:59 watching screen: 4 stop rule(s)
16:03:01 progress pushed to origin claude/pc-mimic-progress (every 15 min)
16:04:02 progress screen: 559/1989 (28%) battles, 1961/h, ETA 44 min, 0 failed, skips 38.2/battle (last 100), aa +0.03, mm -0.09
16:34:21 progress screen: 1697/1989 (85%) battles, 2244/h, ETA 8 min, 0 failed, skips 35.9/battle (last 100), aa -0.03, mm -0.03
16:43:39 screen exit=0 in 2440 s
16:43:39 start gate
16:43:40 gate exit=0 in 0 s
16:43:40 start pr
16:43:49 pr exit=0 in 9 s
16:43:49 ALLDONE
```
