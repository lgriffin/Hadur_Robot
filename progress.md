# Queue pc-deise-e05: progress

Updated 2026-10-29 11:52:50 PC time (11:52 UTC), runner pid 42820.

- `prep` done, exit 0 in 0 min
- `live-D` running
- `live-AIM2` pending
- `live-P2` pending
- `live-W10` pending
- `live-W50` pending
- `live-REACH` pending
- `live-R72` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**243 of 276 battles** (88%), 0 failed. Running 15 min, 988 battles/h, about 2 min left (ends ~11:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 243 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 33 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:37:43 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
11:37:43 start prep
11:37:46 progress pushed to origin claude/pc-deise-e05-progress (every 15 min)
11:38:05 prep exit=0 in 21 s
11:38:05 start live-D
11:38:05 watching live-D: 3 stop rule(s)
11:38:43 progress live-D: 6/276 (2%) battles, 563/h, ETA 29 min, 0 failed, skips 0.0/battle (last 100)
```
