# Queue pc-deise-e04: progress

Updated 2026-10-29 05:39:39 PC time (05:39 UTC), runner pid 48840.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-FIT3F` running
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 992 battles/h, about 0 min left (ends ~05:26 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FIT3F

**192 of 276 battles** (70%), 0 failed. Running 13 min, 864 battles/h, about 6 min left (ends ~05:45 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 84 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:09:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
05:09:25 start prep
05:09:27 progress pushed to origin claude/pc-deise-e04-progress (every 15 min)
05:09:37 prep exit=0 in 11 s
05:09:37 start live-D
05:09:37 watching live-D: 3 stop rule(s)
05:10:25 progress live-D: 15/276 (5%) battles, 1115/h, ETA 14 min, 0 failed
05:26:18 live-D exit=0 in 1001 s
05:26:18 start live-FIT3F
05:26:19 watching live-FIT3F: 3 stop rule(s)
```
