# Queue pc-team-path2: progress

Updated 2026-10-29 17:39:55 PC time (17:39 UTC), runner pid 31840.

- `tqprep` done, exit 0 in 2 min
- `tqbb` done, exit 0 in 1.9 h
- `tqmp` done, exit 0 in 1.9 h
- `tqsum` done, exit 0 in 0 min
- `tqpr` done, exit 0 in 0 min

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

**1472 of 1472 battles** (100%), 0 failed. Running 1.9 h, 771 battles/h, about 0 min left (ends ~17:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.2 overall, first 100 8.1, last 100 4.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.8 a battle over the last 100 (first 100: 8.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:53:40 progress tqbb: 657/1472 (45%) battles, 648/h, ETA 1.3 h, 0 failed, skips 8.4/battle (last 100)
15:23:55 progress tqbb: 1096/1472 (74%) battles, 722/h, ETA 31 min, 0 failed, skips 9.8/battle (last 100)
15:45:12 tqbb exit=0 in 6744 s
15:45:12 start tqmp
15:45:12 watching tqmp: 3 stop rule(s)
15:54:10 progress tqmp: 48/1472 (3%) battles, 321/h, ETA 4.4 h, 0 failed, skips 7.8/battle (last 100)
16:24:24 progress tqmp: 367/1472 (25%) battles, 562/h, ETA 2.0 h, 0 failed, skips 9.2/battle (last 100)
16:54:39 progress tqmp: 745/1472 (51%) battles, 644/h, ETA 1.1 h, 0 failed, skips 7.2/battle (last 100)
17:24:54 progress tqmp: 1218/1472 (83%) battles, 733/h, ETA 21 min, 0 failed, skips 7.1/battle (last 100)
17:39:48 tqmp exit=0 in 6875 s
17:39:48 start tqsum
17:39:48 tqsum exit=0 in 0 s
17:39:48 start tqpr
17:39:55 tqpr exit=0 in 6 s
17:39:55 ALLDONE
```
