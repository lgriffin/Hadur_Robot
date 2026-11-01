# Queue pc-team-concord2: progress

Updated 2026-11-01 00:56:52 PC time (00:56 UTC), runner pid 21196.

- `c2prep` done, exit 0 in 2 min
- `c2bb` running
- `c2on` pending
- `c2sum` pending
- `c2pr` pending

### c2bb

**591 of 1472 battles** (40%), 0 failed. Running 44 min, 814 battles/h, about 1.1 h left (ends ~02:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.9 overall, first 100 9.5, last 100 9.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 591 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 9.6 a battle over the last 100 (first 100: 9.5) |

Stopping now would leave 881 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:11:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:11:31 start c2prep
00:11:34 progress pushed to origin claude/pc-team-concord2-progress (every 15 min)
00:13:18 c2prep exit=0 in 106 s
00:13:18 start c2bb
00:13:18 watching c2bb: 3 stop rule(s)
00:13:32 progress c2bb: 0/1472 (0%) battles, 0 failed
00:43:46 progress c2bb: 381/1472 (26%) battles, 750/h, ETA 1.5 h, 0 failed, skips 8.5/battle (last 100)
```
