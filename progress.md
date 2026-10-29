# Queue pc-k0-oracle: progress

Updated 2026-10-29 05:09:19 PC time (05:09 UTC), runner pid 50308.

- `prep` done, exit 0 in 1 min
- `record` done, exit 0 in 35 min
- `join` done, exit 0 in 3 min
- `score` done, exit 0 in 1 min
- `pr` done, exit 0 in 0 min

### record

**864 of 864 battles** (100%), 0 failed. Running 35 min, 1467 battles/h, about 0 min left (ends ~05:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.0 overall, first 100 23.4, last 100 30.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 864 |
| `skips 40 over 200` | halt | ok | 28.4 a battle over the last 200 (first 200: 22.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:29:53 start prep
04:29:55 progress pushed to origin claude/pc-k0-oracle-progress (every 15 min)
04:30:37 prep exit=0 in 43 s
04:30:37 start record
04:30:37 watching record: 3 stop rule(s)
04:30:53 progress record: 0/864 (0%) battles, 0 failed
05:01:09 progress record: 722/864 (84%) battles, 1418/h, ETA 6 min, 0 failed, skips 29.9/battle (last 100)
05:05:56 record exit=0 in 2119 s
05:05:56 start join
05:08:38 join exit=0 in 161 s
05:08:38 start score
05:09:13 score exit=0 in 35 s
05:09:13 start pr
05:09:19 pr exit=0 in 5 s
05:09:19 ALLDONE
```
