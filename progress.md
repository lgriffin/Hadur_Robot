# Queue pc-team-concord2: progress

Updated 2026-11-01 01:57:19 PC time (01:57 UTC), runner pid 21196.

- `c2prep` done, exit 0 in 2 min
- `c2bb` done, exit 0 in 1.5 h
- `c2on` running
- `c2sum` pending
- `c2pr` pending

### c2bb

**1472 of 1472 battles** (100%), 0 failed. Running 1.5 h, 983 battles/h, about 0 min left (ends ~01:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.2 overall, first 100 9.5, last 100 4.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.5 a battle over the last 100 (first 100: 9.5) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### c2on

**118 of 1472 battles** (8%), 0 failed. Running 14 min, 499 battles/h, about 2.7 h left (ends ~04:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.4 overall, first 100 11.6, last 100 10.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 118 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 10.8 a battle over the last 100 (first 100: 11.6) |

Stopping now would leave 1354 battles unrun (about 2.7 h); every battle already fought is kept and a rerun resumes from it.

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
01:14:00 progress c2bb: 898/1472 (61%) battles, 888/h, ETA 39 min, 0 failed, skips 6.7/battle (last 100)
01:43:08 c2bb exit=0 in 5390 s
01:43:08 start c2on
01:43:08 watching c2on: 3 stop rule(s)
01:44:14 progress c2on: 0/1472 (0%) battles, 0 failed
```
