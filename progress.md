# Queue pc-deise-pt1: progress

Updated 2026-11-01 05:40:34 PC time (05:40 UTC), runner pid 15224.

- `prep` done, exit 0 in 0 min
- `live-TEACH` done, exit 0 in 23 min
- `build` done, exit 0 in 0 min
- `live-D` done, exit 0 in 19 min
- `live-PT0` running
- `live-PTS` pending
- `live-PTB` pending
- `read` pending
- `pr` pending

### live-TEACH

**276 of 276 battles** (100%), 0 failed. Running 23 min, 712 battles/h, about 0 min left (ends ~05:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 71.3 overall, first 100 61.8, last 100 82.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 82.0 a battle over the last 100 (first 100: 61.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-D

**276 of 276 battles** (100%), 0 failed. Running 19 min, 852 battles/h, about 0 min left (ends ~05:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.1, last 100 0.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.2 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PT0

**30 of 276 battles** (11%), 0 failed. Running 2 min, 770 battles/h, about 19 min left (ends ~05:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 30 0.1, last 30 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 30 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 30 of 100 battles to read |

Stopping now would leave 246 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:55:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
04:55:14 skip prep (already exit=0)
04:55:14 start live-TEACH
04:55:14 watching live-TEACH: 3 stop rule(s)
04:55:16 progress pushed to origin claude/pc-deise-pt1-progress (every 15 min)
04:56:14 progress live-TEACH: 6/276 (2%) battles, 357/h, ETA 45 min, 0 failed, skips 58.8/battle (last 100)
05:18:29 live-TEACH exit=0 in 1395 s
05:18:29 start build
05:18:48 build exit=0 in 19 s
05:18:48 start live-D
05:18:48 watching live-D: 3 stop rule(s)
05:26:28 progress live-D: 114/276 (41%) battles, 893/h, ETA 11 min, 0 failed, skips 0.2/battle (last 100)
05:38:14 live-D exit=0 in 1166 s
05:38:14 start live-PT0
05:38:14 watching live-PT0: 3 stop rule(s)
```
