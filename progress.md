# Queue pc-team-concord2: progress

Updated 2026-11-01 00:26:38 PC time (00:26 UTC), runner pid 21196.

- `c2prep` done, exit 0 in 2 min
- `c2bb` running
- `c2on` pending
- `c2sum` pending
- `c2pr` pending

### c2bb

**118 of 1472 battles** (8%), 0 failed. Running 13 min, 531 battles/h, about 2.6 h left (ends ~02:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.7 overall, first 100 9.5, last 100 9.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 118 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 9.8 a battle over the last 100 (first 100: 9.5) |

Stopping now would leave 1354 battles unrun (about 2.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:11:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:11:31 start c2prep
00:11:34 progress pushed to origin claude/pc-team-concord2-progress (every 15 min)
00:13:18 c2prep exit=0 in 106 s
00:13:18 start c2bb
00:13:18 watching c2bb: 3 stop rule(s)
00:13:32 progress c2bb: 0/1472 (0%) battles, 0 failed
```
