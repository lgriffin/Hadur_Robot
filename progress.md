# Queue pc-deise-e07: progress

Updated 2026-10-30 17:35:28 PC time (17:35 UTC), runner pid 69032.

- `prep` done, exit 0 in 0 min
- `live-D` running
- `live-P3` pending
- `live-P075` pending
- `live-SHARP` pending
- `live-WV2` pending
- `live-CONS` pending
- `live-SCAL` pending
- `live-RS` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**228 of 276 battles** (83%), 0 failed. Running 15 min, 933 battles/h, about 3 min left (ends ~17:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 228 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 48 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:20:20 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
17:20:20 start prep
17:20:26 progress pushed to origin claude/pc-deise-e07-progress (every 15 min)
17:20:49 prep exit=0 in 28 s
17:20:49 start live-D
17:20:49 watching live-D: 3 stop rule(s)
17:21:21 progress live-D: 6/276 (2%) battles, 668/h, ETA 24 min, 0 failed, skips 0.0/battle (last 100)
```
