# Queue pc-team-concord: progress

Updated 2026-10-31 09:59:35 PC time (09:59 UTC), runner pid 21584.

- `ccprep` done, exit 0 in 2 min
- `ccbb` done, exit 0 in 1.1 h
- `cccn` running
- `ccglob` pending
- `ccpick` pending
- `ccgate` pending
- `ccgbb` pending
- `ccsum` pending
- `ccpr` pending

### ccbb

**1104 of 1104 battles** (100%), 0 failed. Running 1.1 h, 978 battles/h, about 0 min left (ends ~09:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.6 overall, first 100 10.0, last 100 3.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 3.9 a battle over the last 100 (first 100: 10.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### cccn

**473 of 1104 battles** (43%), 0 failed. Running 36 min, 781 battles/h, about 48 min left (ends ~10:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.9 overall, first 100 11.3, last 100 11.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 473 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 11.5 a battle over the last 100 (first 100: 11.3) |

Stopping now would leave 631 battles unrun (about 48 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:13:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:13:41 start ccprep
08:13:44 progress pushed to origin claude/pc-team-concord-progress (every 15 min)
08:15:31 ccprep exit=0 in 109 s
08:15:31 start ccbb
08:15:31 watching ccbb: 3 stop rule(s)
08:15:42 progress ccbb: 0/1104 (0%) battles, 0 failed
08:45:58 progress ccbb: 398/1104 (36%) battles, 784/h, ETA 54 min, 0 failed, skips 11.2/battle (last 100)
09:16:14 progress ccbb: 950/1104 (86%) battles, 939/h, ETA 10 min, 0 failed, skips 6.3/battle (last 100)
09:23:15 ccbb exit=0 in 4063 s
09:23:15 start cccn
09:23:15 watching cccn: 3 stop rule(s)
09:46:28 progress cccn: 274/1104 (25%) battles, 708/h, ETA 1.2 h, 0 failed, skips 10.7/battle (last 100)
```
