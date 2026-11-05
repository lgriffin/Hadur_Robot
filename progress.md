# Queue pc-mirror: progress

Updated 2026-11-05 08:47:28 PC time (08:47 UTC), runner pid 55080.

- `prep` done, exit 0 in 1 min
- `pilot` running
- `mirror` pending
- `read` pending
- `pr` pending

### pilot

**1673 of 1820 battles** (92%), 0 failed, 784 read back from an earlier run. Running 30 min, 1774 battles/h, about 5 min left (ends ~08:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 112.8 overall, first 100 126.8, last 100 86.7; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 334 | 0 | 75.63 | - | - | - | 30.1 |
| aa | 334 | 0 | 75.28 | -0.03 (91 robots) | ±0.05 | -0.10 .. +0.05 | 30.9 |
| bb | 333 | 0 | 86.13 | +0.80 (91 robots) | ±0.10 | +0.64 .. +0.96 | 164.7 |
| sg | 337 | 0 | 71.95 | -0.26 (91 robots) | ±0.25 | -0.64 .. +0.12 | 178.2 |
| ns | 335 | 0 | 86.79 | +0.85 (91 robots) | ±0.11 | +0.68 .. +1.02 | 139.5 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.35 pts over 91 robots; 1% band ±0.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1673 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200 arms c aa` | halt | ok | 28.6 a battle over the last 200 (first 200: 31.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 147 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 715 h before this step started: check it is not stale

> warning: arm sg's jar opponents/oog.mega.saguaro.Saguaro_1.0.jar was built 715 h before this step started: check it is not stale

> warning: arm ns's jar opponents/jd.Nullstride_2.3.3.jar was built 682 h before this step started: check it is not stale

### Queue log (last lines)

```
03:00:27 progress pushed to origin claude/pc-mirror-progress (every 15 min)
03:01:26 prep exit=0 in 61 s
03:01:26 start pilot
03:01:26 watching pilot: 4 stop rule(s)
03:02:25 progress pilot: 39/1820 (2%) battles, 2361/h, ETA 45 min, 0 failed, skips 39.8/battle (last 100), aa +0.13, bb +0.39, sg +0.32, ns +0.58
03:24:40 STOP pilot by rule skips 150 over 200: 156.8 a battle over the last 200 (first 200: 75.3); 784 battles fought and kept, 1036 battles left unrun (about 31 min)
03:24:40 pilot exit=75 in 1394 s (halted, skips 150 over 200)
03:24:42 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/657
03:24:42 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:17:07 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:17:07 skip prep (already exit=0)
08:17:07 start pilot
08:17:07 watching pilot: 4 stop rule(s)
08:17:09 progress pushed to origin claude/pc-mirror-progress (every 15 min)
08:18:07 progress pilot: 802/1820 (44%) battles, 1071/h, ETA 57 min, 0 failed, skips 73.1/battle (last 100), aa -0.01, bb +0.79, sg -0.24, ns +0.81
```
