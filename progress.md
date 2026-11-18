# Queue pc-team-closerr: progress

Updated 2026-11-18 20:36:43 PC time (20:36 UTC), runner pid 85476.

- `tcprep` done, exit 0 in 2 min
- `tcpcr` done, exit 0 in 41 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb` done, exit 0 in 2.8 h
- `tccr` running
- `tcgate` pending
- `tcpr` pending

### tcpcr

**270 of 276 battles** (98%), 0 failed. Running 41 min, 392 battles/h, about 1 min left (ends ~16:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.9 overall, first 100 4.4, last 100 8.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.8 a battle over the last 200 (first 200: 5.2) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tcbb

**1080 of 1104 battles** (98%), 0 failed. Running 2.8 h, 384 battles/h, about 4 min left (ends ~19:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.3 overall, first 100 18.0, last 100 2.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.7 a battle over the last 200 (first 200: 15.3) |

Stopping now would leave 24 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### tccr

**550 of 1104 battles** (50%), 0 failed. Running 1.5 h, 364 battles/h, about 1.5 h left (ends ~22:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.5 overall, first 100 34.0, last 100 11.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 550 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 13.1 a battle over the last 200 (first 200: 28.5) |

Stopping now would leave 554 battles unrun (about 1.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:17:33 start tcpilot
16:17:34 tcpilot exit=0 in 0 s
16:17:34 start tcbb
16:17:34 watching tcbb: 3 stop rule(s)
16:37:31 progress tcbb: 87/1104 (8%) battles, 261/h, ETA 3.9 h, 0 failed, skips 17.6/battle (last 100)
17:07:47 progress tcbb: 289/1104 (26%) battles, 345/h, ETA 2.4 h, 0 failed, skips 6.4/battle (last 100)
17:38:05 progress tcbb: 497/1104 (45%) battles, 370/h, ETA 1.6 h, 0 failed, skips 7.9/battle (last 100)
18:08:22 progress tcbb: 684/1104 (62%) battles, 370/h, ETA 1.1 h, 0 failed, skips 4.0/battle (last 100)
18:38:40 progress tcbb: 862/1104 (78%) battles, 367/h, ETA 40 min, 0 failed, skips 5.0/battle (last 100)
19:06:06 tcbb exit=0 in 10112 s
19:06:06 start tccr
19:06:06 watching tccr: 3 stop rule(s)
19:08:57 progress tccr: 0/1104 (0%) battles, 0 failed
19:39:13 progress tccr: 150/1104 (14%) battles, 272/h, ETA 3.5 h, 0 failed, skips 30.1/battle (last 100)
20:09:29 progress tccr: 359/1104 (33%) battles, 340/h, ETA 2.2 h, 0 failed, skips 17.7/battle (last 100)
```
