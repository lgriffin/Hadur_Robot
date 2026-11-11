# Queue pc-team-portfolio: progress

Updated 2026-11-11 21:47:07 PC time (21:47 UTC), runner pid 48912.

- `tpprep` done, exit 0 in 6 min
- `tpbb` done, exit 0 in 38 min
- `tpqt` done, exit 0 in 37 min
- `tpga` done, exit 0 in 37 min
- `tpho` running
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

**504 battles**, 0 failed. Running 37 min, 822 battles/h. Last battle 0 min ago.
Skipped turns a battle: 17.2 overall, first 100 19.4, last 100 15.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 504 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.0 a battle over the last 200 (first 200: 18.6) |

### tpga

**516 battles**, 0 failed. Running 37 min, 828 battles/h. Last battle 0 min ago.
Skipped turns a battle: 17.4 overall, first 100 20.3, last 100 15.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 516 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.6 a battle over the last 200 (first 200: 19.4) |

### tpho

**12 battles**, 0 failed. Running 3 min, 255 battles/h. Last battle 0 min ago.
Skipped turns a battle: 10.0 overall, first 12 10.0, last 12 10.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 12 of 200 battles to read |

### Queue log (last lines)

```
19:52:32 start tpbb
19:52:32 watching tpbb: 3 stop rule(s)
19:53:19 progress tpbb: 0/552 (0%) battles, 0 failed
20:23:32 progress tpbb: 389/552 (70%) battles, 753/h, ETA 13 min, 0 failed, skips 13.9/battle (last 100)
20:30:09 tpbb exit=0 in 2256 s
20:30:09 start tpqt
20:30:09 watching tpqt: 3 stop rule(s)
20:53:45 progress tpqt: 294 battles, 747/h, 0 failed, skips 16.9/battle (last 100)
21:06:55 tpqt exit=0 in 2206 s
21:06:55 start tpga
21:06:55 watching tpga: 3 stop rule(s)
21:23:57 progress tpga: 188 battles, 662/h, 0 failed, skips 18.3/battle (last 100)
21:44:18 tpga exit=0 in 2242 s
21:44:18 start tpho
21:44:18 watching tpho: 3 stop rule(s)
```
