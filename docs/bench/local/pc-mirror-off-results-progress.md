# Queue pc-mirror-off: progress

Updated 2026-11-11 10:23:52 PC time (10:23 UTC), runner pid 16704.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**108 of 108 battles** (100%), 0 failed. Running 1 min, 6754 battles/h, about 0 min left (ends ~10:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.6 overall, first 100 33.9, last 100 33.0; engine disables 3.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 36 | 0 | 93.20 | - | - | - | 31.6 |
| aa | 36 | 0 | 92.73 | -0.00 (3 robots) | ±0.00 | -0.00 .. +0.00 | 34.7 |
| mo | 36 | 0 | 99.21 | +0.02 (3 robots) | ±0.01 | -0.00 .. +0.03 | 34.7 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.
A/A: aa - c -0.47 pts over 3 robots; 1% band ±1.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 108 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 108 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:20:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:20:50 start prep
10:20:53 progress pushed to origin claude/pc-mirror-off-progress (every 15 min)
10:22:54 prep exit=0 in 124 s
10:22:54 start confirm
10:22:54 watching confirm: 4 stop rule(s)
10:23:52 progress confirm: 108/108 (100%) battles, 6754/h, ETA 0 min, 0 failed, skips 33.0/battle (last 100), aa -0.00, mo +0.02
```
