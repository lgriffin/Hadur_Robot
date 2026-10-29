# Queue pc-team-path: progress

Updated 2026-10-29 08:05:35 PC time (08:05 UTC), runner pid 79320.

- `tpprep` done, exit 0 in 2 min
- `tpbb` done, exit 0 in 52 min
- `tpmp` done, exit 0 in 53 min
- `tptn` done, exit 0 in 2 min
- `tptnbb` running
- `tppick` pending
- `tpgate` pending
- `tpgbb` pending
- `tpsum` pending
- `tppr` pending

### tpbb

**920 of 920 battles** (100%), 0 failed. Running 52 min, 1067 battles/h, about 0 min left (ends ~07:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.0 overall, first 100 7.8, last 100 4.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 920 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.4 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tpmp

**920 of 920 battles** (100%), 0 failed. Running 53 min, 1032 battles/h, about 0 min left (ends ~08:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.2 overall, first 100 8.1, last 100 4.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 920 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.9 a battle over the last 100 (first 100: 8.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tptn

**32 of 32 battles** (100%), 0 failed. Running 2 min, 1126 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 32 11.8, last 32 11.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 32 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tptnbb

**12 of 32 battles** (38%), 0 failed. Running 1 min, 933 battles/h, about 1 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 12 13.1, last 12 13.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 12 of 100 battles to read |

Stopping now would leave 20 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:17:52 start tpbb
06:17:52 watching tpbb: 3 stop rule(s)
06:18:44 progress tpbb: 0/920 (0%) battles, 0 failed
06:48:58 progress tpbb: 470/920 (51%) battles, 907/h, ETA 30 min, 0 failed, skips 8.2/battle (last 100)
07:09:37 tpbb exit=0 in 3104 s
07:09:37 start tpmp
07:09:37 watching tpmp: 3 stop rule(s)
07:19:12 progress tpmp: 96/920 (10%) battles, 601/h, ETA 1.4 h, 0 failed, skips 7.9/battle (last 100)
07:49:27 progress tpmp: 618/920 (67%) battles, 931/h, ETA 19 min, 0 failed, skips 7.0/battle (last 100)
08:03:07 tpmp exit=0 in 3209 s
08:03:07 start tptn
08:03:07 watching tptn: 3 stop rule(s)
08:04:49 tptn exit=0 in 102 s
08:04:49 start tptnbb
08:04:49 watching tptnbb: 3 stop rule(s)
```
