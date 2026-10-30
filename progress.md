# Queue pc-team-dodge2: progress

Updated 2026-10-30 06:32:06 PC time (06:32 UTC), runner pid 85768.

- `d2prep` done, exit 0 in 3 min
- `d2bb` running
- `d2dg` pending
- `d2df` pending
- `d2sdg` pending
- `d2sdf` pending
- `d2pr` pending

### d2bb

**1022 of 1472 battles** (69%), 0 failed. Running 1.2 h, 840 battles/h, about 32 min left (ends ~07:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.7 overall, first 100 7.8, last 100 6.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1022 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 6.3 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 450 battles unrun (about 32 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:16:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
05:16:29 start d2prep
05:16:33 progress pushed to origin claude/pc-team-dodge2-progress (every 15 min)
05:19:06 d2prep exit=0 in 156 s
05:19:06 start d2bb
05:19:06 watching d2bb: 3 stop rule(s)
05:19:31 progress d2bb: 0/1472 (0%) battles, 0 failed
05:49:46 progress d2bb: 350/1472 (24%) battles, 685/h, ETA 1.6 h, 0 failed, skips 9.6/battle (last 100)
06:20:01 progress d2bb: 814/1472 (55%) battles, 802/h, ETA 49 min, 0 failed, skips 8.3/battle (last 100)
```
