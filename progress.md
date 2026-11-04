# Queue pc-team-dgun: progress

Updated 2026-11-04 20:35:55 PC time (20:35 UTC), runner pid 49532.

- `dgprep` done, exit 0 in 2 min
- `dgbb1` done, exit 0 in 17 min
- `dgdg1` done, exit 0 in 19 min
- `dgpilot` failed, exit 1 in 0 min
- `dgbb` skipped
- `dgdg` skipped
- `dgscr` skipped
- `dgpr` skipped

### dgbb1

**282 of 276 battles** (102%), 12 failed. Running 17 min, 974 battles/h, about -0 min left (ends ~20:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.3 overall, first 100 19.1, last 100 16.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 12 failed of 282 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 16.0 a battle over the last 100 (first 100: 19.1) |

Stopping now would leave -6 battles unrun (about -0 min); every battle already fought is kept and a rerun resumes from it.

### dgdg1

**282 of 276 battles** (102%), 12 failed. Running 19 min, 883 battles/h, about -0 min left (ends ~20:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.7 overall, first 100 32.1, last 100 35.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 12 failed of 282 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 35.9 a battle over the last 100 (first 100: 32.1) |

Stopping now would leave -6 battles unrun (about -0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:59:23 start dgbb1
19:59:23 watching dgbb1: 3 stop rule(s)
20:00:14 progress dgbb1: 0/276 (0%) battles, 0 failed
20:16:45 dgbb1 exit=0 in 1041 s
20:16:45 start dgdg1
20:16:45 watching dgdg1: 3 stop rule(s)
20:30:28 progress dgdg1: 188/276 (68%) battles, 822/h, ETA 6 min, 12 failed, skips 26.3/battle (last 100)
20:35:54 dgdg1 exit=0 in 1149 s
20:35:55 start dgpilot
20:35:55 dgpilot exit=1 in 0 s
20:35:55 skip dgbb (after dgpilot, which has not finished exit=0)
20:35:55 skip dgdg (after dgbb, which has not finished exit=0)
20:35:55 skip dgscr (after dgdg, which has not finished exit=0)
20:35:55 skip dgpr (after dgscr, which has not finished exit=0)
20:35:55 ALLDONE
```
