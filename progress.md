# Queue pc-learn-trace: progress

Updated 2026-11-10 18:10:53 PC time (18:10 UTC), runner pid 19896.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**2338 of 2388 battles** (98%), 4 failed. Running 2.5 h, 772 battles/h, about 4 min left (ends ~18:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 45.2 overall, first 100 56.4, last 100 53.5; engine disables 452.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1170 | 0 | 92.81 | - | - | - | 53.4 |
| bb | 1168 | 4 | 94.77 | +1.92 (1162 robots) | ±0.34 | +1.40 .. +2.44 | 36.9 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 4 failed of 2338 |
| `skips 60 over 200 arms c` | halt | ok | 58.2 a battle over the last 200 (first 200: 56.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 50 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 842 h before this step started: check it is not stale

### Queue log (last lines)

```
15:39:26 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
15:39:26 start prep
15:39:29 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
15:39:49 prep exit=0 in 22 s
15:39:49 start trace
15:39:49 watching trace: 3 stop rule(s)
15:40:26 progress trace: 0/2388 (0%) battles, 0 failed
16:10:42 progress trace: 576/2388 (24%) battles, 1136/h, ETA 1.6 h, 0 failed, skips 42.5/battle (last 100), bb +1.52
16:41:00 progress trace: 1057/2388 (44%) battles, 954/h, ETA 1.4 h, 2 failed, skips 37.9/battle (last 100), bb +2.03
17:11:17 progress trace: 1520/2388 (64%) battles, 914/h, ETA 57 min, 2 failed, skips 51.4/battle (last 100), bb +1.87
17:41:36 progress trace: 1960/2388 (82%) battles, 876/h, ETA 29 min, 4 failed, skips 38.4/battle (last 100), bb +1.84
```
