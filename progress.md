# Queue pc-team-portfolio: progress

Updated 2026-11-11 20:01:23 PC time (20:01 UTC), runner pid 48912.

- `tpprep` done, exit 0 in 6 min
- `tpbb` running
- `tpqt` pending
- `tpga` pending
- `tpho` pending
- `tpli` pending
- `tpnd` pending
- `tpnc` pending
- `tpnk` pending
- `tpnh` pending
- `tpnp` pending
- `tppick` pending
- `tpcprep` pending
- `tpcbb` pending
- `tpcfx` pending
- `tpgate` pending
- `tppr` pending

### tpbb

**78 of 552 battles** (14%), 0 failed. Running 9 min, 529 battles/h, about 54 min left (ends ~20:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.3 overall, first 78 20.3, last 78 20.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 78 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 78 of 200 battles to read |

Stopping now would leave 474 battles unrun (about 54 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:46:16 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:46:16 start tpprep
19:46:19 progress pushed to origin claude/pc-team-portfolio-progress (every 15 min)
19:52:32 tpprep exit=0 in 375 s
19:52:32 start tpbb
19:52:32 watching tpbb: 3 stop rule(s)
19:53:19 progress tpbb: 0/552 (0%) battles, 0 failed
```
