# Queue pc-team-clear: progress

Updated 2026-11-03 02:21:40 PC time (02:21 UTC), runner pid 37376.

- `clprep` done, exit 0 in 2 min
- `clbb` done, exit 0 in 1.1 h
- `clcl` done, exit 0 in 1.1 h
- `clff` done, exit 0 in 0 min
- `clsum` done, exit 0 in 0 min
- `clpr` done, exit 0 in 0 min

### clbb

**1080 of 1080 battles** (100%), 0 failed. Running 1.1 h, 964 battles/h, about 0 min left (ends ~01:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.9 overall, first 100 17.4, last 100 8.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.5 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### clcl

**1080 of 1080 battles** (100%), 0 failed. Running 1.1 h, 952 battles/h, about 0 min left (ends ~02:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.5 overall, first 100 18.3, last 100 8.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.6 a battle over the last 100 (first 100: 18.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:36:45 progress clbb: 397/1080 (37%) battles, 780/h, ETA 53 min, 0 failed, skips 20.3/battle (last 100)
01:06:57 progress clbb: 911/1080 (84%) battles, 900/h, ETA 11 min, 0 failed, skips 12.6/battle (last 100)
01:13:25 clbb exit=0 in 4032 s
01:13:25 start clcl
01:13:25 watching clcl: 3 stop rule(s)
01:37:10 progress clcl: 275/1080 (25%) battles, 695/h, ETA 1.2 h, 0 failed, skips 18.8/battle (last 100)
02:07:21 progress clcl: 723/1080 (67%) battles, 804/h, ETA 27 min, 0 failed, skips 16.3/battle (last 100)
02:21:29 clcl exit=0 in 4084 s
02:21:29 start clff
02:21:34 clff exit=0 in 4 s
02:21:34 start clsum
02:21:34 clsum exit=0 in 0 s
02:21:34 start clpr
02:21:40 clpr exit=0 in 6 s
02:21:40 ALLDONE
```
