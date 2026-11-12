# Queue pc-team-portfolio: progress

Updated 2026-11-12 00:18:13 PC time (00:18 UTC), runner pid 48912.

- `tpprep` done, exit 0 in 6 min
- `tpbb` done, exit 0 in 38 min
- `tpqt` done, exit 0 in 37 min
- `tpga` done, exit 0 in 37 min
- `tpho` done, exit 0 in 36 min
- `tpli` done, exit 0 in 36 min
- `tpnd` done, exit 0 in 36 min
- `tpnc` done, exit 0 in 32 min
- `tpnk` running
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

**504 battles**, 0 failed. Running 36 min, 846 battles/h. Last battle 0 min ago.
Skipped turns a battle: 16.8 overall, first 100 18.8, last 100 15.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 504 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.4 a battle over the last 200 (first 200: 18.6) |

### tpnd

**492 battles**, 0 failed. Running 36 min, 821 battles/h. Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 17.9, last 100 15.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 492 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.5 a battle over the last 200 (first 200: 18.1) |

### tpnc

**468 battles**, 0 failed. Running 32 min, 866 battles/h. Last battle 0 min ago.
Skipped turns a battle: 17.3 overall, first 100 20.0, last 100 15.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 468 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.9 a battle over the last 200 (first 200: 19.3) |

### tpnk

**138 battles**, 0 failed. Running 14 min, 591 battles/h. Last battle 0 min ago.
Skipped turns a battle: 19.9 overall, first 100 21.4, last 100 19.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 138 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 138 of 200 battles to read |

### Queue log (last lines)

```
22:20:05 start tpli
22:20:05 watching tpli: 3 stop rule(s)
22:24:24 progress tpli: 19 battles, 264/h, 0 failed, skips 14.8/battle (last 100)
22:54:37 progress tpli: 489 battles, 850/h, 0 failed, skips 16.6/battle (last 100)
22:55:50 tpli exit=0 in 2144 s
22:55:50 start tpnd
22:55:50 watching tpnd: 3 stop rule(s)
23:24:50 progress tpnd: 351 battles, 726/h, 0 failed, skips 14.4/battle (last 100)
23:31:47 tpnd exit=0 in 2157 s
23:31:47 start tpnc
23:31:47 watching tpnc: 3 stop rule(s)
23:55:04 progress tpnc: 300 battles, 773/h, 0 failed, skips 15.0/battle (last 100)
00:04:12 tpnc exit=0 in 1944 s
00:04:12 start tpnk
00:04:12 watching tpnk: 3 stop rule(s)
```
