# Queue pc-team-guard: progress

Updated 2026-11-12 13:03:58 PC time (13:03 UTC), runner pid 65320.

- `tgprep` done, exit 0 in 3 min
- `tgpmv` running
- `tgpla` pending
- `tgpilot` pending
- `tgbb` pending
- `tgmv` pending
- `tgla` pending
- `tggate` pending
- `tgpr` pending

### tgpmv

**120 of 138 battles** (87%), 0 failed. Running 12 min, 587 battles/h, about 2 min left (ends ~13:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.5 overall, first 100 0.5, last 100 0.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 120 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 120 of 200 battles to read |

Stopping now would leave 18 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:48:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:48:51 start tgprep
12:48:53 progress pushed to origin claude/pc-team-guard-progress (every 15 min)
12:51:41 tgprep exit=0 in 170 s
12:51:41 start tgpmv
12:51:41 watching tgpmv: 3 stop rule(s)
12:51:53 progress tgpmv: 0/138 (0%) battles, 0 failed
```
