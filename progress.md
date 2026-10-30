# Queue pc-sanaro-n05: progress

Updated 2026-10-30 21:38:30 PC time (21:38 UTC), runner pid 46788.

- `prep` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-LQ` running
- `live-LL` pending
- `live-LR` pending
- `live-L18` pending
- `live-SC` pending
- `read-live` pending
- `pr` pending

### live-S2

**430 of 430 battles** (100%), 0 failed. Running 30 min, 863 battles/h, about 0 min left (ends ~21:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-LQ

**200 of 430 battles** (47%), 0 failed. Running 15 min, 792 battles/h, about 17 min left (ends ~21:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 230 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:53:06 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
20:53:06 start prep
20:53:09 progress pushed to origin claude/pc-sanaro-n05-progress (every 15 min)
20:53:27 prep exit=0 in 21 s
20:53:27 start live-S2
20:53:27 watching live-S2: 3 stop rule(s)
20:54:07 progress live-S2: 4/430 (1%) battles, 365/h, ETA 1.2 h, 0 failed, skips 0.0/battle (last 100)
21:23:21 live-S2 exit=0 in 1793 s
21:23:21 start live-LQ
21:23:21 watching live-LQ: 3 stop rule(s)
21:24:23 progress live-LQ: 8/430 (2%) battles, 467/h, ETA 54 min, 0 failed, skips 0.0/battle (last 100)
```
