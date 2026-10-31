# Queue pc-deise-pt1: progress

Updated 2026-10-31 22:22:36 PC time (22:22 UTC), runner pid 58760.

- `prep` done, exit 0 in 0 min
- `live-TEACH` halted, exit 75 in 9 min, HALTED by skips 40 over 100: 64.7 a battle over the last 100 (first 100: 62.7)
- `build` pending
- `live-D` pending
- `live-PT0` pending
- `live-PTS` pending
- `live-PTB` pending
- `read` pending
- `pr` pending

### live-TEACH

**108 of 276 battles** (39%), 0 failed. Running 9 min, 735 battles/h, about 14 min left (ends ~22:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 63.1 overall, first 100 62.7, last 100 64.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 108 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | TRIPPED | 64.7 a battle over the last 100 (first 100: 62.7) |

Stopping now would leave 168 battles unrun (about 14 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:13:30 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:13:30 start prep
22:13:32 progress pushed to origin claude/pc-deise-pt1-progress (every 15 min)
22:13:47 prep exit=0 in 16 s
22:13:47 start live-TEACH
22:13:47 watching live-TEACH: 3 stop rule(s)
22:14:31 progress live-TEACH: 0/276 (0%) battles, 0 failed
22:22:36 STOP live-TEACH by rule skips 40 over 100: 64.7 a battle over the last 100 (first 100: 62.7); 108 battles fought and kept, 168 battles left unrun (about 14 min)
22:22:36 live-TEACH exit=75 in 529 s (halted, skips 40 over 100)
```
