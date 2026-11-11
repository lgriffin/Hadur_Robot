# Queue pc-team-portfolio: progress

Updated 2026-11-11 22:47:34 PC time (22:47 UTC), runner pid 48912.

- `tpprep` done, exit 0 in 6 min
- `tpbb` done, exit 0 in 38 min
- `tpqt` done, exit 0 in 37 min
- `tpga` done, exit 0 in 37 min
- `tpho` done, exit 0 in 36 min
- `tpli` running
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

**504 battles**, 0 failed. Running 36 min, 845 battles/h. Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 18.6, last 100 16.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 504 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.9 a battle over the last 200 (first 200: 17.9) |

### tpli

**340 battles**, 0 failed. Running 27 min, 742 battles/h. Last battle 0 min ago.
Skipped turns a battle: 17.3 overall, first 100 18.8, last 100 15.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 340 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.9 a battle over the last 200 (first 200: 18.6) |

### Queue log (last lines)

```
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
21:54:10 progress tpho: 96 battles, 583/h, 0 failed, skips 18.7/battle (last 100)
22:20:05 tpho exit=0 in 2147 s
22:20:05 start tpli
22:20:05 watching tpli: 3 stop rule(s)
22:24:24 progress tpli: 19 battles, 264/h, 0 failed, skips 14.8/battle (last 100)
```
