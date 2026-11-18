# Queue pc-team-closerr: progress

Updated 2026-11-18 18:20:29 PC time (18:20 UTC), runner pid 85476.

- `tcprep` done, exit 0 in 2 min
- `tcpcr` done, exit 0 in 41 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb` running
- `tccr` pending
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

**724 of 1104 battles** (66%), 0 failed. Running 2.0 h, 353 battles/h, about 1.1 h left (ends ~19:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.7 overall, first 100 18.0, last 100 3.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 724 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.0 a battle over the last 200 (first 200: 15.3) |

Stopping now would leave 380 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:34:02 progress pushed to origin claude/pc-team-closerr-progress (every 15 min)
15:36:10 tcprep exit=0 in 130 s
15:36:10 start tcpcr
15:36:10 watching tcpcr: 3 stop rule(s)
15:37:02 progress tcpcr: 0/276 (0%) battles, 0 failed
16:07:16 progress tcpcr: 189/276 (68%) battles, 365/h, ETA 14 min, 0 failed, skips 5.5/battle (last 100)
16:17:33 tcpcr exit=0 in 2482 s
16:17:33 start tcpilot
16:17:34 tcpilot exit=0 in 0 s
16:17:34 start tcbb
16:17:34 watching tcbb: 3 stop rule(s)
16:37:31 progress tcbb: 87/1104 (8%) battles, 261/h, ETA 3.9 h, 0 failed, skips 17.6/battle (last 100)
17:07:47 progress tcbb: 289/1104 (26%) battles, 345/h, ETA 2.4 h, 0 failed, skips 6.4/battle (last 100)
17:38:05 progress tcbb: 497/1104 (45%) battles, 370/h, ETA 1.6 h, 0 failed, skips 7.9/battle (last 100)
18:08:22 progress tcbb: 684/1104 (62%) battles, 370/h, ETA 1.1 h, 0 failed, skips 4.0/battle (last 100)
```
