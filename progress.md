# Queue pc-deise-pt1: progress

Updated 2026-11-01 05:25:27 PC time (05:25 UTC), runner pid 15224.

- `prep` done, exit 0 in 0 min
- `live-TEACH` done, exit 0 in 23 min
- `build` done, exit 0 in 0 min
- `live-D` running
- `live-PT0` pending
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

**102 of 276 battles** (37%), 0 failed. Running 7 min, 920 battles/h, about 11 min left (ends ~05:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 102 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 174 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:22:36 STOP live-TEACH by rule skips 40 over 100: 64.7 a battle over the last 100 (first 100: 62.7); 108 battles fought and kept, 168 battles left unrun (about 14 min)
22:22:36 live-TEACH exit=75 in 529 s (halted, skips 40 over 100)
22:22:38 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/522
22:22:38 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
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
```
