# Queue pc-team-dodge2: progress

Updated 2026-10-30 10:09:55 PC time (10:09 UTC), runner pid 85768.

- `d2prep` done, exit 0 in 3 min
- `d2bb` done, exit 0 in 1.6 h
- `d2dg` done, exit 0 in 1.6 h
- `d2df` done, exit 0 in 1.6 h
- `d2sdg` done, exit 0 in 0 min
- `d2sdf` done, exit 0 in 0 min
- `d2pr` done, exit 0 in 0 min

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

**1472 of 1472 battles** (100%), 0 failed. Running 1.6 h, 902 battles/h, about 0 min left (ends ~10:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.0 overall, first 100 10.1, last 100 4.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.3 a battle over the last 100 (first 100: 10.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:20:57 progress d2dg: 1254/1472 (85%) battles, 871/h, ETA 15 min, 0 failed, skips 6.4/battle (last 100)
08:31:52 d2dg exit=0 in 5840 s
08:31:52 start d2df
08:31:52 watching d2df: 3 stop rule(s)
08:51:11 progress d2df: 181/1472 (12%) battles, 562/h, ETA 2.3 h, 0 failed, skips 10.6/battle (last 100)
09:21:25 progress d2df: 609/1472 (41%) battles, 737/h, ETA 1.2 h, 0 failed, skips 10.0/battle (last 100)
09:51:40 progress d2df: 1106/1472 (75%) battles, 832/h, ETA 26 min, 0 failed, skips 8.5/battle (last 100)
10:09:47 d2df exit=0 in 5875 s
10:09:47 start d2sdg
10:09:47 d2sdg exit=0 in 0 s
10:09:47 start d2sdf
10:09:47 d2sdf exit=0 in 0 s
10:09:47 start d2pr
10:09:55 d2pr exit=0 in 7 s
10:09:55 ALLDONE
```
