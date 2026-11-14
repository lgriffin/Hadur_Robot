# Queue pc-livematch: progress

Updated 2026-11-14 12:18:25 PC time (12:18 UTC), runner pid 59328.

- `prep` done, exit 0 in 0 min
- `live` done, exit 0 in 8 min
- `old` running
- `read` pending
- `pr` pending

### live

**124 of 124 battles** (100%), 0 failed. Running 8 min, 884 battles/h, about 0 min left (ends ~12:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.4 overall, first 100 5.2, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 73.06 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.74 | +0.30 (31 robots) | ±0.07 | +0.20 .. +0.40 | 0.5 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 935 h before this step started: check it is not stale

### old

**123 of 124 battles** (99%), 0 failed. Running 7 min, 998 battles/h, about 0 min left (ends ~12:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 173.5 overall, first 100 61.0, last 100 208.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 61 | 0 | 73.55 | - | - | - | 31.4 |
| bb | 62 | 0 | 81.19 | +0.19 (31 robots) | ±0.06 | +0.10 .. +0.28 | 313.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 123 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 935 h before this step started: check it is not stale

### Queue log (last lines)

```
12:02:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:02:18 start prep
12:02:20 progress pushed to origin claude/pc-livematch-progress (every 15 min)
12:02:36 prep exit=0 in 18 s
12:02:36 start live
12:02:36 watching live: 3 stop rule(s)
12:03:18 progress live: 18/124 (15%) battles, 1568/h, ETA 4 min, 0 failed, skips 6.2/battle (last 100), bb +0.16
12:11:01 live exit=0 in 504 s
12:11:01 start old
12:11:01 watching old: 3 stop rule(s)
```
