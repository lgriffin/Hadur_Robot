# Queue pc-team-dodge2: progress

Updated 2026-10-30 09:18:24 PC time (09:18 UTC), runner pid 85768.

- `d2prep` done, exit 0 in 3 min
- `d2bb` done, exit 0 in 1.6 h
- `d2dg` done, exit 0 in 1.6 h
- `d2df` running
- `d2sdg` pending
- `d2sdf` pending
- `d2pr` pending

### d2bb

**1472 of 1472 battles** (100%), 0 failed. Running 1.6 h, 926 battles/h, about 0 min left (ends ~06:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.3 overall, first 100 7.8, last 100 4.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.2 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### d2dg

**1472 of 1472 battles** (100%), 0 failed. Running 1.6 h, 907 battles/h, about 0 min left (ends ~08:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.8 overall, first 100 9.3, last 100 4.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.9 a battle over the last 100 (first 100: 9.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### d2df

**562 of 1472 battles** (38%), 0 failed. Running 47 min, 725 battles/h, about 1.3 h left (ends ~10:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.8 overall, first 100 10.1, last 100 12.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 562 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.6 a battle over the last 100 (first 100: 10.1) |

Stopping now would leave 910 battles unrun (about 1.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:19:06 watching d2bb: 3 stop rule(s)
05:19:31 progress d2bb: 0/1472 (0%) battles, 0 failed
05:49:46 progress d2bb: 350/1472 (24%) battles, 685/h, ETA 1.6 h, 0 failed, skips 9.6/battle (last 100)
06:20:01 progress d2bb: 814/1472 (55%) battles, 802/h, ETA 49 min, 0 failed, skips 8.3/battle (last 100)
06:50:14 progress d2bb: 1359/1472 (92%) battles, 895/h, ETA 8 min, 0 failed, skips 10.5/battle (last 100)
06:54:31 d2bb exit=0 in 5725 s
06:54:31 start d2dg
06:54:31 watching d2dg: 3 stop rule(s)
07:20:28 progress d2dg: 273/1472 (19%) battles, 631/h, ETA 1.9 h, 0 failed, skips 12.8/battle (last 100)
07:50:42 progress d2dg: 707/1472 (48%) battles, 755/h, ETA 1.0 h, 0 failed, skips 8.8/battle (last 100)
08:20:57 progress d2dg: 1254/1472 (85%) battles, 871/h, ETA 15 min, 0 failed, skips 6.4/battle (last 100)
08:31:52 d2dg exit=0 in 5840 s
08:31:52 start d2df
08:31:52 watching d2df: 3 stop rule(s)
08:51:11 progress d2df: 181/1472 (12%) battles, 562/h, ETA 2.3 h, 0 failed, skips 10.6/battle (last 100)
```
