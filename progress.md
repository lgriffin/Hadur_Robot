# Queue pc-mirror: progress

Updated 2026-11-05 03:24:40 PC time (03:24 UTC), runner pid 42956.

- `prep` done, exit 0 in 1 min
- `pilot` halted, exit 75 in 23 min, HALTED by skips 150 over 200: 156.8 a battle over the last 200 (first 200: 75.3)
- `mirror` pending
- `read` pending
- `pr` pending

### pilot

**784 of 1820 battles** (43%), 0 failed. Running 23 min, 2024 battles/h, about 31 min left (ends ~03:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 104.2 overall, first 100 54.6, last 100 153.4; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 157 | 0 | 76.03 | - | - | - | 30.0 |
| aa | 158 | 0 | 75.99 | -0.01 (79 robots) | ±0.07 | -0.12 .. +0.10 | 31.9 |
| bb | 156 | 0 | 86.89 | +0.79 (78 robots) | ±0.12 | +0.61 .. +0.98 | 143.8 |
| sg | 156 | 0 | 72.63 | -0.25 (78 robots) | ±0.29 | -0.70 .. +0.19 | 178.6 |
| ns | 157 | 0 | 86.82 | +0.81 (79 robots) | ±0.12 | +0.62 .. +1.00 | 138.0 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.17 pts over 79 robots; 1% band ±0.93 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 784 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 150 over 200` | halt | TRIPPED | 156.8 a battle over the last 200 (first 200: 75.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1036 battles unrun (about 31 min); every battle already fought is kept and a rerun resumes from it.

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
03:24:40 STOP pilot by rule skips 150 over 200: 156.8 a battle over the last 200 (first 200: 75.3); 784 battles fought and kept, 1036 battles left unrun (about 31 min)
03:24:40 pilot exit=75 in 1394 s (halted, skips 150 over 200)
```
