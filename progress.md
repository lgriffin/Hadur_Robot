# Queue pc-locks: progress

Updated 2026-11-24 22:02:43 PC time (22:02 UTC), runner pid 88640.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 18 min
- `lock-sb` failed, exit 1 in 0 min
- `lock-rp` skipped
- `lock-qw` skipped
- `lock-fq` skipped
- `lock-kb` skipped
- `gate` skipped
- `pr` skipped

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 907 battles/h, about 0 min left (ends ~21:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.6 overall, first 100 5.1, last 100 5.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.78 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.80 | +0.38 (31 robots) | ±0.06 | +0.28 .. +0.48 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 220 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 207 h before this step started: check it is not stale

### lock

**1344 of 1344 battles** (100%), 0 failed. Running 18 min, 4393 battles/h, about 0 min left (ends ~22:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.3 overall, first 100 13.4, last 100 11.9; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 672 | 0 | 90.36 | - | - | - | 12.3 |
| aa | 672 | 0 | 90.40 | +0.00 (28 robots) | ±0.00 | -0.01 .. +0.01 | 12.3 |

APS = mean difference over the robots read x 28 panel robots / 1217 pairings.
A/A: aa - c +0.05 pts over 28 robots; 1% band ±0.45 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1344 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.5 a battle over the last 24 (first 24: 16.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-sb

**0 of 24 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sb | 0 | 0 | - | - | - | - | - |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 0 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 24 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:44:13 livematch exit=0 in 491 s
21:44:13 start lock
21:44:13 watching lock: 4 stop rule(s)
22:02:35 lock exit=0 in 1101 s
22:02:35 start lock-sb
22:02:35 watching lock-sb: 3 stop rule(s)
22:02:38 lock-sb exit=1 in 2 s
22:02:43 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/1046
22:02:43 skip lock-rp (after lock-sb, which has not finished exit=0)
22:02:43 skip lock-qw (after lock-rp, which has not finished exit=0)
22:02:43 skip lock-fq (after lock-qw, which has not finished exit=0)
22:02:43 skip lock-kb (after lock-fq, which has not finished exit=0)
22:02:43 skip gate (after lock-kb, which has not finished exit=0)
22:02:43 skip pr (after gate, which has not finished exit=0)
22:02:43 ALLDONE
```
