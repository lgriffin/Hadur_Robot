# Queue pc-team-path2: progress

Updated 2026-10-29 17:39:01 PC time (17:39 UTC), runner pid 31840.

- `tqprep` done, exit 0 in 2 min
- `tqbb` done, exit 0 in 1.9 h
- `tqmp` running
- `tqsum` pending
- `tqpr` pending

### tqbb

**1472 of 1472 battles** (100%), 0 failed. Running 1.9 h, 786 battles/h, about 0 min left (ends ~15:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.8 overall, first 100 7.8, last 100 4.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.7 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tqmp

**1443 of 1472 battles** (98%), 0 failed. Running 1.9 h, 761 battles/h, about 2 min left (ends ~17:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.3 overall, first 100 8.1, last 100 5.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1443 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 5.0 a battle over the last 100 (first 100: 8.1) |

Stopping now would leave 29 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:51:12 progress pushed to origin claude/pc-team-path2-progress (every 15 min)
13:52:48 tqprep exit=0 in 97 s
13:52:48 start tqbb
13:52:48 watching tqbb: 3 stop rule(s)
13:53:11 progress tqbb: 0/1472 (0%) battles, 0 failed
14:23:25 progress tqbb: 275/1472 (19%) battles, 539/h, ETA 2.2 h, 0 failed, skips 12.1/battle (last 100)
14:53:40 progress tqbb: 657/1472 (45%) battles, 648/h, ETA 1.3 h, 0 failed, skips 8.4/battle (last 100)
15:23:55 progress tqbb: 1096/1472 (74%) battles, 722/h, ETA 31 min, 0 failed, skips 9.8/battle (last 100)
15:45:12 tqbb exit=0 in 6744 s
15:45:12 start tqmp
15:45:12 watching tqmp: 3 stop rule(s)
15:54:10 progress tqmp: 48/1472 (3%) battles, 321/h, ETA 4.4 h, 0 failed, skips 7.8/battle (last 100)
16:24:24 progress tqmp: 367/1472 (25%) battles, 562/h, ETA 2.0 h, 0 failed, skips 9.2/battle (last 100)
16:54:39 progress tqmp: 745/1472 (51%) battles, 644/h, ETA 1.1 h, 0 failed, skips 7.2/battle (last 100)
17:24:54 progress tqmp: 1218/1472 (83%) battles, 733/h, ETA 21 min, 0 failed, skips 7.1/battle (last 100)
```
