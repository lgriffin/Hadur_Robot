# Queue pc-locks: progress

Updated 2026-11-23 00:13:41 PC time (00:13 UTC), runner pid 44364.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 7 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 174 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 161 h before this step started: check it is not stale

### lock

**900 of 900 battles** (100%), 0 failed. Running 7 min, 7909 battles/h, about 0 min left (ends ~00:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.9 overall, first 100 16.1, last 100 14.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 300 | 0 | 88.86 | - | - | - | 14.8 |
| aa | 300 | 0 | 88.73 | -0.00 (25 robots) | ±0.00 | -0.01 .. +0.00 | 14.8 |
| rln | 300 | 0 | 90.77 | +0.04 (25 robots) | ±0.01 | +0.03 .. +0.05 | 15.1 |

APS = mean difference over the robots read x 25 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 25 robots; 1% band ±0.67 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 900 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.5 a battle over the last 24 (first 24: 19.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:05:02 start prep
00:05:04 progress pushed to origin claude/pc-locks-progress (every 15 min)
00:06:36 prep exit=0 in 93 s
00:06:36 start livematch
00:06:36 watching livematch: 3 stop rule(s)
00:06:44 livematch exit=0 in 8 s
00:06:44 start lock
00:06:44 watching lock: 4 stop rule(s)
00:07:03 progress lock: 20/900 (2%) battles, 3753/h, ETA 14 min, 0 failed, skips 19.8/battle (last 100), aa -0.03, rln +0.06
00:13:34 lock exit=0 in 409 s
00:13:34 start gate
00:13:35 gate exit=0 in 0 s
00:13:35 start pr
00:13:41 pr exit=0 in 6 s
00:13:41 ALLDONE
```
