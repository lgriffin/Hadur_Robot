# Queue pc-team-dodge: progress

Updated 2026-10-29 21:46:35 PC time (21:46 UTC), runner pid 64500.

- `tdprep` done, exit 0 in 2 min
- `tdbb` done, exit 0 in 1.2 h
- `tddg` done, exit 0 in 1.2 h
- `tdglob` done, exit 0 in 0 min
- `tdpick` done, exit 0 in 1 min
- `tdgate` running
- `tdgbb` pending
- `tdsum` pending
- `tdpr` pending

### tdbb

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 899 battles/h, about 0 min left (ends ~20:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 9.2, last 100 7.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 7.6 a battle over the last 100 (first 100: 9.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tddg

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 897 battles/h, about 0 min left (ends ~21:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.2 overall, first 100 13.3, last 100 5.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 5.3 a battle over the last 100 (first 100: 13.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tdgate

**12 battles**, 0 failed. Running 1 min, 578 battles/h. Last battle 0 min ago.
Skipped turns a battle: 6.1 overall, first 12 6.1, last 12 6.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 12 of 100 battles to read |

### Queue log (last lines)

```
19:17:13 progress tdbb: 0/1104 (0%) battles, 0 failed
19:47:30 progress tdbb: 368/1104 (33%) battles, 721/h, ETA 1.0 h, 0 failed, skips 12.6/battle (last 100)
20:17:47 progress tdbb: 850/1104 (77%) battles, 837/h, ETA 18 min, 0 failed, skips 10.7/battle (last 100)
20:30:36 tdbb exit=0 in 4423 s
20:30:36 start tddg
20:30:36 watching tddg: 3 stop rule(s)
20:48:04 progress tddg: 157/1104 (14%) battles, 539/h, ETA 1.8 h, 0 failed, skips 13.0/battle (last 100)
21:18:21 progress tddg: 600/1104 (54%) battles, 754/h, ETA 40 min, 0 failed, skips 8.1/battle (last 100)
21:44:27 tddg exit=0 in 4431 s
21:44:27 start tdglob
21:44:28 tdglob exit=0 in 0 s
21:44:28 start tdpick
21:45:21 tdpick exit=0 in 52 s
21:45:21 start tdgate
21:45:21 watching tdgate: 3 stop rule(s)
```
