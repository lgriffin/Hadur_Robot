# Queue pc-deise-e09: progress

Updated 2026-10-31 12:04:40 PC time (12:04 UTC), runner pid 20700.

- `prep` done, exit 0 in 1 min
- `live-D` done, exit 0 in 17 min
- `live-SAME` done, exit 0 in 17 min
- `live-PL400` running
- `live-WARM4` pending
- `live-WARM16` pending
- `live-NARROW` pending
- `live-WSTOP` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 955 battles/h, about 0 min left (ends ~11:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SAME

**276 of 276 battles** (100%), 0 failed. Running 17 min, 951 battles/h, about 0 min left (ends ~11:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PL400

**130 of 276 battles** (47%), 0 failed. Running 10 min, 774 battles/h, about 11 min left (ends ~12:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.2, last 100 0.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.2 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 146 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:19:19 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
11:19:19 start prep
11:19:21 progress pushed to origin claude/pc-deise-e09-progress (every 15 min)
11:19:51 prep exit=0 in 32 s
11:19:51 start live-D
11:19:51 watching live-D: 3 stop rule(s)
11:20:19 progress live-D: 1/276 (0%) battles, 127/h, ETA 2.2 h, 0 failed, skips 0.0/battle (last 100)
11:37:12 live-D exit=0 in 1040 s
11:37:12 start live-SAME
11:37:12 watching live-SAME: 3 stop rule(s)
11:50:34 progress live-SAME: 198/276 (72%) battles, 889/h, ETA 5 min, 0 failed, skips 0.0/battle (last 100)
11:54:36 live-SAME exit=0 in 1044 s
11:54:36 start live-PL400
11:54:36 watching live-PL400: 3 stop rule(s)
```
