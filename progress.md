# Queue pc-jaylexi-po: progress

Updated 2026-10-31 10:57:32 PC time (10:57 UTC), runner pid 67792.

- `prep` done, exit 0 in 0 min
- `harvest` done, exit 0 in 2 min
- `build` failed, exit 1 in 2 min
- `G` skipped
- `PO300` skipped
- `PO2000` skipped
- `read` skipped
- `pr` skipped

### harvest

**336 of 336 battles** (100%), 0 failed. Running 2 min, 9798 battles/h, about 0 min left (ends ~10:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 336 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:53:05 start prep
10:53:08 progress pushed to origin claude/pc-jaylexi-po-progress (every 15 min)
10:53:14 prep exit=0 in 8 s
10:53:14 start harvest
10:53:14 watching harvest: 3 stop rule(s)
10:54:05 progress harvest: 84/336 (25%) battles, 5880/h, ETA 3 min, 0 failed, skips 0.0/battle (last 100)
10:55:17 harvest exit=0 in 123 s
10:55:17 start build
10:57:32 build exit=1 in 134 s
10:57:32 skip G (after build, which has not finished exit=0)
10:57:32 skip PO300 (after G, which has not finished exit=0)
10:57:32 skip PO2000 (after PO300, which has not finished exit=0)
10:57:32 skip read (after PO2000, which has not finished exit=0)
10:57:32 skip pr (after read, which has not finished exit=0)
10:57:32 ALLDONE
```
