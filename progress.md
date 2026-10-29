# Queue pc-team-dodge: progress

Updated 2026-10-29 19:45:29 PC time (19:45 UTC), runner pid 64500.

- `tdprep` done, exit 0 in 2 min
- `tdbb` running
- `tddg` pending
- `tdglob` pending
- `tdpick` pending
- `tdgate` pending
- `tdgbb` pending
- `tdsum` pending
- `tdpr` pending

### tdbb

**334 of 1104 battles** (30%), 0 failed. Running 29 min, 701 battles/h, about 1.1 h left (ends ~20:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.0 overall, first 100 9.2, last 100 11.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 334 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 11.4 a battle over the last 100 (first 100: 9.2) |

Stopping now would leave 770 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:15:11 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
19:15:11 start tdprep
19:15:14 progress pushed to origin claude/pc-team-dodge-progress (every 15 min)
19:16:53 tdprep exit=0 in 101 s
19:16:53 start tdbb
19:16:53 watching tdbb: 3 stop rule(s)
19:17:13 progress tdbb: 0/1104 (0%) battles, 0 failed
```
