# Queue pc-deise-e10: progress

Updated 2026-10-31 16:33:15 PC time (16:33 UTC), runner pid 65080.

- `prep` done, exit 0 in 0 min
- `live-D` running
- `live-PL400` pending
- `live-PN` pending
- `live-PNS` pending
- `live-PNS6` pending
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**222 of 276 battles** (80%), 0 failed. Running 15 min, 906 battles/h, about 4 min left (ends ~16:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 222 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 54 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:18:06 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
16:18:06 start prep
16:18:09 progress pushed to origin claude/pc-deise-e10-progress (every 15 min)
16:18:33 prep exit=0 in 26 s
16:18:33 start live-D
16:18:33 watching live-D: 3 stop rule(s)
16:19:07 progress live-D: 6/276 (2%) battles, 630/h, ETA 26 min, 0 failed, skips 0.0/battle (last 100)
```
