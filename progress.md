# Queue pc-team-concord2: progress

Updated 2026-11-01 03:15:46 PC time (03:15 UTC), runner pid 21196.

- `c2prep` done, exit 0 in 2 min
- `c2bb` done, exit 0 in 1.5 h
- `c2on` done, exit 0 in 1.5 h
- `c2sum` done, exit 0 in 0 min
- `c2pr` done, exit 0 in 0 min

### c2bb

**1472 of 1472 battles** (100%), 0 failed. Running 1.5 h, 983 battles/h, about 0 min left (ends ~01:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.2 overall, first 100 9.5, last 100 4.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.5 a battle over the last 100 (first 100: 9.5) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### c2on

**1472 of 1472 battles** (100%), 0 failed. Running 1.5 h, 955 battles/h, about 0 min left (ends ~03:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.7 overall, first 100 11.6, last 100 4.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1472 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.5 a battle over the last 100 (first 100: 11.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:43:46 progress c2bb: 381/1472 (26%) battles, 750/h, ETA 1.5 h, 0 failed, skips 8.5/battle (last 100)
01:14:00 progress c2bb: 898/1472 (61%) battles, 888/h, ETA 39 min, 0 failed, skips 6.7/battle (last 100)
01:43:08 c2bb exit=0 in 5390 s
01:43:08 start c2on
01:43:08 watching c2on: 3 stop rule(s)
01:44:14 progress c2on: 0/1472 (0%) battles, 0 failed
02:14:27 progress c2on: 369/1472 (25%) battles, 707/h, ETA 1.6 h, 0 failed, skips 9.2/battle (last 100)
02:44:41 progress c2on: 862/1472 (59%) battles, 840/h, ETA 44 min, 0 failed, skips 6.6/battle (last 100)
03:14:55 progress c2on: 1446/1472 (98%) battles, 945/h, ETA 2 min, 0 failed, skips 3.8/battle (last 100)
03:15:39 c2on exit=0 in 5551 s
03:15:39 start c2sum
03:15:40 c2sum exit=0 in 0 s
03:15:40 start c2pr
03:15:46 c2pr exit=0 in 6 s
03:15:46 ALLDONE
```
