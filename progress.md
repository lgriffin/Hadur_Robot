# Queue pc-team-path2: progress

Updated 2026-10-29 14:21:24 PC time (14:21 UTC), runner pid 31840.

- `tqprep` done, exit 0 in 2 min
- `tqbb` running
- `tqmp` pending
- `tqsum` pending
- `tqpr` pending

### tqbb

**251 of 1472 battles** (17%), 0 failed. Running 29 min, 526 battles/h, about 2.3 h left (ends ~16:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.6 overall, first 100 7.8, last 100 12.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 251 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.3 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 1221 battles unrun (about 2.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:51:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
13:51:10 start tqprep
13:51:12 progress pushed to origin claude/pc-team-path2-progress (every 15 min)
13:52:48 tqprep exit=0 in 97 s
13:52:48 start tqbb
13:52:48 watching tqbb: 3 stop rule(s)
13:53:11 progress tqbb: 0/1472 (0%) battles, 0 failed
```
