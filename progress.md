# Queue pc-team-momentum: progress

Updated 2026-11-15 10:15:31 PC time (10:15 UTC), runner pid 55920.

- `tmprep` done, exit 0 in 3 min
- `tmpmo` done, exit 0 in 37 min
- `tmpmod` done, exit 0 in 38 min
- `tmpilot` done, exit 0 in 0 min
- `tmbb` running
- `tmmo` pending
- `tmmod` pending
- `tmgate` pending
- `tmpr` pending

### tmpmo

**270 of 276 battles** (98%), 0 failed. Running 37 min, 436 battles/h, about 1 min left (ends ~08:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.1 overall, first 100 11.9, last 100 4.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.9 a battle over the last 200 (first 200: 8.2) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tmpmod

**270 of 276 battles** (98%), 0 failed. Running 39 min, 421 battles/h, about 1 min left (ends ~09:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.5 overall, first 100 12.7, last 100 4.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.0 a battle over the last 200 (first 200: 8.7) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tmbb

**247 of 1104 battles** (22%), 0 failed. Running 42 min, 350 battles/h, about 2.5 h left (ends ~12:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 100 16.4, last 100 9.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 247 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 13.0 a battle over the last 200 (first 200: 14.8) |

Stopping now would leave 857 battles unrun (about 2.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:17:26 tmprep exit=0 in 162 s
08:17:26 start tmpmo
08:17:26 watching tmpmo: 3 stop rule(s)
08:17:44 progress tmpmo: 0/276 (0%) battles, 0 failed
08:47:56 progress tmpmo: 215/276 (78%) battles, 423/h, ETA 9 min, 0 failed, skips 3.8/battle (last 100)
08:54:38 tmpmo exit=0 in 2231 s
08:54:38 start tmpmod
08:54:38 watching tmpmod: 3 stop rule(s)
09:18:08 progress tmpmod: 162/276 (59%) battles, 414/h, ETA 17 min, 0 failed, skips 6.1/battle (last 100)
09:33:08 tmpmod exit=0 in 2310 s
09:33:08 start tmpilot
09:33:09 tmpilot exit=0 in 0 s
09:33:09 start tmbb
09:33:09 watching tmbb: 3 stop rule(s)
09:48:20 progress tmbb: 66/1104 (6%) battles, 261/h, ETA 4.0 h, 0 failed, skips 13.9/battle (last 100)
```
