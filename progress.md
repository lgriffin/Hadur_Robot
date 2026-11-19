# Queue pc-rc-confirm: progress

Updated 2026-11-19 23:19:08 PC time (23:19 UTC), runner pid 93240.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` failed, exit 1 in 0 min
- `ret` skipped
- `gate112` skipped
- `gate` skipped
- `pr` skipped

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.94 | - | - | - | 9.8 |
| bb | 62 | 0 | 84.62 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 102 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 89 h before this step started: check it is not stale

### field

**0 of 7158 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 0 | 0 | - | - | - | - | - |
| c | 0 | 0 | - | - | - | - | - |
| aa | 0 | 0 | - | - | - | - | - |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 0 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 0%) |

Stopping now would leave 7158 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:17:19 start prep
23:17:21 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
23:18:55 prep exit=0 in 96 s
23:18:55 start livematch
23:18:55 watching livematch: 3 stop rule(s)
23:19:03 livematch exit=0 in 7 s
23:19:03 start field
23:19:03 watching field: 5 stop rule(s)
23:19:06 field exit=1 in 2 s
23:19:08 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/945
23:19:08 skip ret (after field, which has not finished exit=0)
23:19:08 skip gate112 (after ret, which has not finished exit=0)
23:19:08 skip gate (after gate112, which has not finished exit=0)
23:19:08 skip pr (after gate, which has not finished exit=0)
23:19:08 ALLDONE
```
