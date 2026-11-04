# Queue pc-shelf: progress

Updated 2026-11-04 08:49:36 PC time (08:49 UTC), runner pid 41756.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` running
- `pilot-u` pending
- `screen-u` pending
- `pick` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### screen-s

**1008 of 1155 battles** (87%), 0 failed, 231 read back from an earlier run. Running 15 min, 3070 battles/h, about 3 min left (ends ~08:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.4 overall, first 100 31.0, last 100 28.7; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 144 | 0 | 88.75 | - | - | - | 29.7 |
| aa | 144 | 0 | 87.79 | -0.03 (33 robots) | ±0.05 | -0.10 .. +0.04 | 29.8 |
| md | 143 | 0 | 79.50 | -0.24 (33 robots) | ±0.07 | -0.34 .. -0.13 | 29.8 |
| zl | 143 | 0 | 89.34 | +0.03 (33 robots) | ±0.04 | -0.04 .. +0.10 | 28.5 |
| x0 | 145 | 0 | 88.37 | +0.00 (33 robots) | ±0.05 | -0.07 .. +0.07 | 28.9 |
| x4 | 143 | 0 | 87.89 | -0.01 (33 robots) | ±0.04 | -0.08 .. +0.06 | 28.2 |
| mv | 146 | 0 | 87.97 | -0.01 (33 robots) | ±0.08 | -0.13 .. +0.12 | 30.2 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.97 pts over 33 robots; 1% band ±0.97 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1008 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 29.0 a battle over the last 200 (first 200: 30.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.97 pts over 33 robots, stop band ±2.55 (observed spread) |

Stopping now would leave 147 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:19:18 progress pilot-s: 0/231 (0%) battles, 0 failed
23:24:17 pilot-s exit=0 in 309 s
23:24:17 start screen-s
23:24:17 watching screen-s: 5 stop rule(s)
23:24:22 STOP screen-s by rule aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36; 231 battles fought and kept, 924 battles left unrun
23:24:22 screen-s exit=75 in 5 s (halted, aa after 20%)
23:24:24 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/623
23:24:24 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:34:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:34:25 skip prep (already exit=0)
08:34:25 skip pilot-s (already exit=0)
08:34:25 start screen-s
08:34:25 watching screen-s: 5 stop rule(s)
08:34:27 progress pushed to origin claude/pc-shelf-progress (every 15 min)
08:35:27 progress screen-s: 275/1155 (24%) battles, 2618/h, ETA 20 min, 0 failed, skips 33.3/battle (last 100), aa +0.08, md -0.25, zl +0.06, x0 +0.03, x4 -0.01, mv +0.01
```
