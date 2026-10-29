# Queue pc-team-path2: progress

Updated 2026-10-29 15:37:02 PC time (15:37 UTC), runner pid 31840.

- `tqprep` done, exit 0 in 2 min
- `tqbb` running
- `tqmp` pending
- `tqsum` pending
- `tqpr` pending

### tqbb

**1328 of 1472 battles** (90%), 0 failed. Running 1.7 h, 764 battles/h, about 11 min left (ends ~15:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.3 overall, first 100 7.8, last 100 11.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1328 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 11.1 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 144 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:51:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
13:51:10 start tqprep
13:51:12 progress pushed to origin claude/pc-team-path2-progress (every 15 min)
13:52:48 tqprep exit=0 in 97 s
13:52:48 start tqbb
13:52:48 watching tqbb: 3 stop rule(s)
13:53:11 progress tqbb: 0/1472 (0%) battles, 0 failed
14:23:25 progress tqbb: 275/1472 (19%) battles, 539/h, ETA 2.2 h, 0 failed, skips 12.1/battle (last 100)
14:53:40 progress tqbb: 657/1472 (45%) battles, 648/h, ETA 1.3 h, 0 failed, skips 8.4/battle (last 100)
15:23:55 progress tqbb: 1096/1472 (74%) battles, 722/h, ETA 31 min, 0 failed, skips 9.8/battle (last 100)
```
