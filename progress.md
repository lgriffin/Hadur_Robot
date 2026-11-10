# Queue pc-learn-trace: progress

Updated 2026-11-10 19:52:56 PC time (19:52 UTC), runner pid 19728.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**2387 of 2388 battles** (100%), 1 failed, 2386 read back from an earlier run. Running 15 min, 4 battles/h, about 15 min left (ends ~20:08 PC time). Last battle 8 min ago.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1194 | 0 | 92.84 | - | - | - | 53.3 |
| bb | 1193 | 5 | 94.74 | +1.87 (1188 robots) | ±0.34 | +1.35 .. +2.39 | 37.7 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 1 failed of 2387 |
| `skips 60 over 200 arms c` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 8 min ago |

Stopping now would leave 1 battles unrun (about 15 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 846 h before this step started: check it is not stale

### Queue log (last lines)

```
16:41:00 progress trace: 1057/2388 (44%) battles, 954/h, ETA 1.4 h, 2 failed, skips 37.9/battle (last 100), bb +2.03
17:11:17 progress trace: 1520/2388 (64%) battles, 914/h, ETA 57 min, 2 failed, skips 51.4/battle (last 100), bb +1.87
17:41:36 progress trace: 1960/2388 (82%) battles, 876/h, ETA 29 min, 4 failed, skips 38.4/battle (last 100), bb +1.84
18:11:54 progress trace: 2349/2388 (98%) battles, 772/h, ETA 3 min, 4 failed, skips 53.1/battle (last 100), bb +1.89
18:42:11 progress trace: 2387/2388 (100%) battles, 60/h, ETA 1 min, 5 failed, skips 49.2/battle (last 100), bb +1.87
19:03:23 STOP trace by rule stall 30m: last battle 30 min ago; 2387 battles fought and kept, 1 battles left unrun (about 0 min)
19:03:23 trace exit=75 in 12214 s (halted, stall 30m)
19:03:26 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/738
19:03:26 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
19:37:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:37:48 skip prep (already exit=0)
19:37:48 start trace
19:37:48 watching trace: 3 stop rule(s)
19:37:50 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
19:38:49 progress trace: 2387/2388 (100%) battles, 0 failed, bb +1.87
```
