# Queue pc-sanaro-n07: progress

Updated 2026-11-01 11:27:23 PC time (11:27 UTC), runner pid 68380.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 12 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-HS` done, exit 0 in 30 min
- `live-HL` running
- `live-HC` pending
- `read-live` pending
- `pr` pending

### live-HS

**430 of 430 battles** (100%), 0 failed. Running 30 min, 849 battles/h, about 0 min left (ends ~11:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HL

**200 of 430 battles** (47%), 0 failed. Running 15 min, 802 battles/h, about 17 min left (ends ~11:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 230 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:04:05 progress live-HS: 220/430 (51%) battles, 668/h, ETA 19 min, 0 failed, skips 0.0/battle (last 100)
10:42:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:42:02 skip prep (already exit=0)
10:42:02 skip teach (already exit=0)
10:42:02 skip distill-report (already exit=0)
10:42:02 skip arms (already exit=0)
10:42:02 skip live-S2 (already exit=0)
10:42:02 start live-HS
10:42:02 watching live-HS: 3 stop rule(s)
10:42:04 progress pushed to origin claude/pc-sanaro-n07-progress (every 15 min)
10:43:03 progress live-HS: 10/430 (2%) battles, 596/h, ETA 42 min, 0 failed, skips 0.0/battle (last 100)
11:12:26 live-HS exit=0 in 1823 s
11:12:26 start live-HL
11:12:26 watching live-HL: 3 stop rule(s)
11:13:17 progress live-HL: 10/430 (2%) battles, 700/h, ETA 36 min, 0 failed, skips 0.0/battle (last 100)
```
