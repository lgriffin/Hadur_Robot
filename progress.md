# Queue pc-learn-trace: progress

Updated 2026-11-10 20:44:48 PC time (20:44 UTC), runner pid 37852.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**2387 of 2386 battles** (100%), 1 failed, 2386 read back from an earlier run. Running 30 min, 2 battles/h, about -30 min left (ends ~20:14 PC time). Last battle 24 min ago.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1194 | 0 | 92.84 | - | - | - | 53.3 |
| bb | 1193 | 5 | 94.74 | +1.87 (1188 robots) | ±0.34 | +1.35 .. +2.39 | 37.7 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 1 failed of 2387 |
| `skips 60 over 200 arms c` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 24 min ago |

Stopping now would leave -1 battles unrun (about -30 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 847 h before this step started: check it is not stale

### Queue log (last lines)

```
19:37:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:37:48 skip prep (already exit=0)
19:37:48 start trace
19:37:48 watching trace: 3 stop rule(s)
19:37:50 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
19:38:49 progress trace: 2387/2388 (100%) battles, 0 failed, bb +1.87
20:09:05 progress trace: 2387/2388 (100%) battles, 2/h, ETA 30 min, 1 failed, bb +1.87
20:14:18 trace exit=130 in 2190 s (stopped)
20:14:18 stopped; rerun to resume from the interrupted steps
20:14:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
20:14:31 skip prep (already exit=0)
20:14:31 start trace
20:14:31 watching trace: 3 stop rule(s)
20:14:33 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
20:15:31 progress trace: 2387/2386 (100%) battles, 0 failed, bb +1.87
```
