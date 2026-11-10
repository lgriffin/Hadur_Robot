# Queue pc-learn-trace: progress

Updated 2026-11-10 15:54:33 PC time (15:54 UTC), runner pid 19896.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**279 of 2388 battles** (12%), 0 failed. Running 15 min, 1136 battles/h, about 1.9 h left (ends ~17:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.8 overall, first 100 56.4, last 100 84.4; engine disables 56.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 142 | 0 | 93.37 | - | - | - | 54.7 |
| bb | 137 | 0 | 94.77 | +1.44 (136 robots) | ±1.21 | -0.42 .. +3.29 | 64.9 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 279 |
| `skips 60 over 200 arms c` | halt | waiting | 142 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2109 battles unrun (about 1.9 h); every battle already fought is kept and a rerun resumes from it.

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
```
