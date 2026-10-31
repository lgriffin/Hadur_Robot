# Queue pc-deise-e08: progress

Updated 2026-10-31 04:27:10 PC time (04:27 UTC), runner pid 42972.

- `prep` done, exit 0 in 0 min
- `live-D` running
- `live-H500` pending
- `live-H650` pending
- `live-H900` pending
- `live-HS650` pending
- `live-SR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**228 of 276 battles** (83%), 0 failed. Running 15 min, 929 battles/h, about 3 min left (ends ~04:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 228 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 48 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:12:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
04:12:02 start prep
04:12:04 progress pushed to origin claude/pc-deise-e08-progress (every 15 min)
04:12:26 prep exit=0 in 23 s
04:12:26 start live-D
04:12:26 watching live-D: 3 stop rule(s)
04:13:02 progress live-D: 6/276 (2%) battles, 594/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100)
```
