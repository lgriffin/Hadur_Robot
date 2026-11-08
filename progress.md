# Queue pc-team-close: progress

Updated 2026-11-08 04:06:40 PC time (04:06 UTC), runner pid 24944.

- `tcprep` done, exit 0 in 2 min
- `tcbb1` done, exit 0 in 27 min
- `tctc1` done, exit 0 in 27 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb2` done, exit 0 in 52 min
- `tctc2` done, exit 0 in 52 min
- `tcgate` done, exit 0 in 0 min
- `tcpr` done, exit 0 in 0 min

### tcbb1

**360 of 368 battles** (98%), 0 failed. Running 27 min, 793 battles/h, about 1 min left (ends ~01:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 20.4, last 100 15.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.4 a battle over the last 200 (first 200: 20.0) |

Stopping now would leave 8 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tctc1

**360 of 368 battles** (98%), 0 failed. Running 27 min, 792 battles/h, about 1 min left (ends ~02:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 19.9, last 100 16.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.6 a battle over the last 200 (first 200: 19.8) |

Stopping now would leave 8 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tcbb2

**1080 of 1104 battles** (98%), 0 failed. Running 52 min, 1237 battles/h, about 1 min left (ends ~03:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 20.2, last 100 10.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.5 a battle over the last 200 (first 200: 22.4) |

Stopping now would leave 24 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tctc2

**1080 of 1104 battles** (98%), 0 failed. Running 52 min, 1243 battles/h, about 1 min left (ends ~04:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 20.2, last 100 10.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.3 a battle over the last 200 (first 200: 21.9) |

Stopping now would leave 24 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:22:02 start tcbb2
02:22:02 watching tcbb2: 3 stop rule(s)
02:28:14 progress tcbb2: 60/1104 (5%) battles, 580/h, ETA 1.8 h, 0 failed, skips 18.9/battle (last 100)
02:58:29 progress tcbb2: 689/1104 (62%) battles, 1134/h, ETA 22 min, 0 failed, skips 15.8/battle (last 100)
03:14:26 tcbb2 exit=0 in 3144 s
03:14:26 start tctc2
03:14:26 watching tctc2: 3 stop rule(s)
03:28:45 progress tctc2: 198/1104 (18%) battles, 830/h, ETA 1.1 h, 0 failed, skips 23.6/battle (last 100)
03:59:00 progress tctc2: 824/1104 (75%) battles, 1110/h, ETA 15 min, 0 failed, skips 19.2/battle (last 100)
04:06:34 tctc2 exit=0 in 3128 s
04:06:34 start tcgate
04:06:35 tcgate exit=0 in 0 s
04:06:35 start tcpr
04:06:40 tcpr exit=0 in 5 s
04:06:40 ALLDONE
```
