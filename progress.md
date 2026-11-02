# Queue pc-full-off: progress

Updated 2026-11-02 23:53:03 PC time (23:53 UTC), runner pid 41640.

- `prep` done, exit 0 in 1 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### screen

**888 of 1503 battles** (59%), 0 failed. Running 14 min, 3805 battles/h, about 10 min left (ends ~00:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.6 overall, first 100 31.9, last 100 31.1; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 295 | 0 | 90.34 | - | - | - | 31.9 |
| aa | 297 | 0 | 90.12 | -0.03 (153 robots) | ±0.05 | -0.10 .. +0.04 | 31.8 |
| fp | 296 | 0 | 89.63 | -0.08 (153 robots) | ±0.05 | -0.16 .. -0.00 | 31.3 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c -0.22 pts over 153 robots; 1% band ±0.68 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 888 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 31.5 a battle over the last 200 (first 200: 32.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 615 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:37:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
23:37:51 start prep
23:37:53 progress pushed to origin claude/pc-full-off-progress (every 15 min)
23:39:02 prep exit=0 in 71 s
23:39:02 start screen
23:39:02 watching screen: 4 stop rule(s)
23:39:52 progress screen: 39/1503 (3%) battles, 2846/h, ETA 31 min, 0 failed, skips 32.8/battle (last 100), aa -0.21, fp -0.11
```
