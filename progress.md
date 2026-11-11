# Queue pc-team-portfolio: progress

Updated 2026-11-11 20:31:35 PC time (20:31 UTC), runner pid 48912.

- `tpprep` done, exit 0 in 6 min
- `tpbb` done, exit 0 in 38 min
- `tpqt` running
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

**540 of 552 battles** (98%), 0 failed. Running 38 min, 861 battles/h, about 1 min left (ends ~20:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.1 overall, first 100 20.2, last 100 16.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 540 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.6 a battle over the last 200 (first 200: 19.6) |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tpqt

**0 battles**, 0 failed. Running 1 min. Last battle 1 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

### Queue log (last lines)

```
19:46:16 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:46:16 start tpprep
19:46:19 progress pushed to origin claude/pc-team-portfolio-progress (every 15 min)
19:52:32 tpprep exit=0 in 375 s
19:52:32 start tpbb
19:52:32 watching tpbb: 3 stop rule(s)
19:53:19 progress tpbb: 0/552 (0%) battles, 0 failed
20:23:32 progress tpbb: 389/552 (70%) battles, 753/h, ETA 13 min, 0 failed, skips 13.9/battle (last 100)
20:30:09 tpbb exit=0 in 2256 s
20:30:09 start tpqt
20:30:09 watching tpqt: 3 stop rule(s)
```
