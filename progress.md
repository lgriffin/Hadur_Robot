# Queue pc-deise-e09: progress

Updated 2026-10-31 11:34:27 PC time (11:34 UTC), runner pid 20700.

- `prep` done, exit 0 in 1 min
- `live-D` running
- `live-SAME` pending
- `live-PL400` pending
- `live-WARM4` pending
- `live-WARM16` pending
- `live-NARROW` pending
- `live-WSTOP` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**228 of 276 battles** (83%), 0 failed. Running 15 min, 938 battles/h, about 3 min left (ends ~11:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 228 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 48 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:19:19 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
11:19:19 start prep
11:19:21 progress pushed to origin claude/pc-deise-e09-progress (every 15 min)
11:19:51 prep exit=0 in 32 s
11:19:51 start live-D
11:19:51 watching live-D: 3 stop rule(s)
11:20:19 progress live-D: 1/276 (0%) battles, 127/h, ETA 2.2 h, 0 failed, skips 0.0/battle (last 100)
```
