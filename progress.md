# Queue pc-team-guard: progress

Updated 2026-11-12 13:19:05 PC time (13:19 UTC), runner pid 65320.

- `tgprep` done, exit 0 in 3 min
- `tgpmv` done, exit 0 in 22 min
- `tgpla` running
- `tgpilot` pending
- `tgbb` pending
- `tgmv` pending
- `tgla` pending
- `tggate` pending
- `tgpr` pending

### tgpmv

**270 of 138 battles** (196%), 0 failed. Running 22 min, 731 battles/h, about -11 min left (ends ~13:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 2.2 overall, first 100 0.5, last 100 5.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 2.8 a battle over the last 200 (first 200: 2.4) |

Stopping now would leave -132 battles unrun (about -11 min); every battle already fought is kept and a rerun resumes from it.

### tgpla

**29 of 138 battles** (21%), 0 failed. Running 5 min, 332 battles/h, about 20 min left (ends ~13:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 29 0.1, last 29 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 29 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 29 of 200 battles to read |

Stopping now would leave 109 battles unrun (about 20 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:48:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:48:51 start tgprep
12:48:53 progress pushed to origin claude/pc-team-guard-progress (every 15 min)
12:51:41 tgprep exit=0 in 170 s
12:51:41 start tgpmv
12:51:41 watching tgpmv: 3 stop rule(s)
12:51:53 progress tgpmv: 0/138 (0%) battles, 0 failed
13:13:50 tgpmv exit=0 in 1329 s
13:13:50 start tgpla
13:13:50 watching tgpla: 3 stop rule(s)
```
