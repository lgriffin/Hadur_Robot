# Queue pc-still-field: progress

Updated 2026-11-10 23:51:22 PC time (23:51 UTC), runner pid 68400.

- `prep` done, exit 0 in 2 min
- `confirm` done, exit 0 in 4 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**216 of 216 battles** (100%), 0 failed. Running 4 min, 3228 battles/h, about 0 min left (ends ~23:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.4 overall, first 100 29.1, last 100 27.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 83.51 | - | - | - | 28.4 |
| aa | 72 | 0 | 82.44 | -0.01 (6 robots) | ±0.00 | -0.01 .. +0.00 | 28.9 |
| mz | 72 | 0 | 85.18 | +0.01 (6 robots) | ±0.01 | -0.00 .. +0.03 | 27.7 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.
A/A: aa - c -1.07 pts over 6 robots; 1% band ±1.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 216 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 28.1 a battle over the last 200 (first 200: 28.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:45:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
23:45:41 start prep
23:45:44 progress pushed to origin claude/pc-still-field-progress (every 15 min)
23:47:14 prep exit=0 in 93 s
23:47:14 start confirm
23:47:14 watching confirm: 4 stop rule(s)
23:47:43 progress confirm: 24/216 (11%) battles, 3059/h, ETA 4 min, 0 failed, skips 30.7/battle (last 100), aa -0.00, mz -0.00
23:51:15 confirm exit=0 in 240 s
23:51:15 start gate
23:51:16 gate exit=0 in 0 s
23:51:16 start pr
23:51:22 pr exit=0 in 5 s
23:51:22 ALLDONE
```
