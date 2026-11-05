# Queue pc-mirror: progress

Updated 2026-11-05 03:15:34 PC time (03:15 UTC), runner pid 42956.

- `prep` done, exit 0 in 1 min
- `pilot` running
- `mirror` pending
- `read` pending
- `pr` pending

### pilot

**501 of 1820 battles** (28%), 0 failed. Running 14 min, 2127 battles/h, about 37 min left (ends ~03:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 83.4 overall, first 100 54.6, last 100 97.9; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 99 | 0 | 76.77 | - | - | - | 30.4 |
| aa | 99 | 0 | 76.16 | -0.05 (64 robots) | ±0.08 | -0.18 .. +0.08 | 32.7 |
| bb | 102 | 0 | 87.12 | +0.82 (64 robots) | ±0.15 | +0.60 .. +1.05 | 106.9 |
| sg | 102 | 0 | 74.38 | -0.16 (64 robots) | ±0.28 | -0.59 .. +0.27 | 174.9 |
| ns | 99 | 0 | 87.45 | +0.84 (63 robots) | ±0.15 | +0.61 .. +1.06 | 69.0 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.61 pts over 64 robots; 1% band ±1.17 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 501 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 150 over 200` | halt | ok | 84.9 a battle over the last 200 (first 200: 75.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1319 battles unrun (about 37 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 709 h before this step started: check it is not stale

> warning: arm sg's jar opponents/oog.mega.saguaro.Saguaro_1.0.jar was built 709 h before this step started: check it is not stale

> warning: arm ns's jar opponents/jd.Nullstride_2.3.3.jar was built 677 h before this step started: check it is not stale

### Queue log (last lines)

```
03:00:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
03:00:24 start prep
03:00:27 progress pushed to origin claude/pc-mirror-progress (every 15 min)
03:01:26 prep exit=0 in 61 s
03:01:26 start pilot
03:01:26 watching pilot: 4 stop rule(s)
03:02:25 progress pilot: 39/1820 (2%) battles, 2361/h, ETA 45 min, 0 failed, skips 39.8/battle (last 100), aa +0.13, bb +0.39, sg +0.32, ns +0.58
```
