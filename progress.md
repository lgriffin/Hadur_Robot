# Queue pc-melee-strong: progress

Updated 2026-11-04 00:39:11 PC time (00:39 UTC), runner pid 51528.

- `msprep` done, exit 0 in 3 min
- `mspilot` done, exit 0 in 1.2 h
- `mscheck` failed, exit 1 in 0 min
- `msaa` skipped
- `msbb` skipped
- `msk1` skipped
- `msk2` skipped
- `msread` skipped
- `mspr` skipped

### mspilot

**184 of 184 battles** (100%), 0 failed. Running 1.2 h, 153 battles/h, about 0 min left (ends ~00:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.2 overall, first 100 24.9, last 100 23.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:27:02 start mspilot
23:27:02 watching mspilot: 2 stop rule(s)
23:27:32 progress mspilot: 0/184 (0%) battles, 0 failed
23:57:39 progress mspilot: 80/184 (43%) battles, 157/h, ETA 40 min, 0 failed, skips 25.7/battle (last 100)
00:27:48 progress mspilot: 152/184 (83%) battles, 150/h, ETA 13 min, 0 failed, skips 25.1/battle (last 100)
00:39:05 mspilot exit=0 in 4322 s
00:39:05 start mscheck
00:39:11 mscheck exit=1 in 5 s
00:39:11 skip msaa (after mscheck, which has not finished exit=0)
00:39:11 skip msbb (after msaa, which has not finished exit=0)
00:39:11 skip msk1 (after msbb, which has not finished exit=0)
00:39:11 skip msk2 (after msk1, which has not finished exit=0)
00:39:11 skip msread (after msk2, which has not finished exit=0)
00:39:11 skip mspr (after msread, which has not finished exit=0)
00:39:11 ALLDONE
```
