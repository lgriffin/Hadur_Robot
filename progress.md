# Queue pc-team-path: progress

Updated 2026-10-29 07:01:04 PC time (07:01 UTC), runner pid 79320.

- `tpprep` done, exit 0 in 2 min
- `tpbb` running
- `tpmp` pending
- `tptn` pending
- `tptnbb` pending
- `tppick` pending
- `tpgate` pending
- `tpgbb` pending
- `tpsum` pending
- `tppr` pending

### tpbb

**720 of 920 battles** (78%), 0 failed. Running 43 min, 1000 battles/h, about 12 min left (ends ~07:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.5 overall, first 100 7.8, last 100 8.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 720 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.1 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 200 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:15:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
06:15:42 start tpprep
06:15:45 progress pushed to origin claude/pc-team-path-progress (every 15 min)
06:17:52 tpprep exit=0 in 129 s
06:17:52 start tpbb
06:17:52 watching tpbb: 3 stop rule(s)
06:18:44 progress tpbb: 0/920 (0%) battles, 0 failed
06:48:58 progress tpbb: 470/920 (51%) battles, 907/h, ETA 30 min, 0 failed, skips 8.2/battle (last 100)
```
