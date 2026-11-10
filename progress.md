# Queue pc-learn-trace: progress

Updated 2026-11-10 16:09:41 PC time (16:09 UTC), runner pid 19896.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**557 of 2388 battles** (23%), 0 failed. Running 30 min, 1119 battles/h, about 1.6 h left (ends ~17:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 49.5 overall, first 100 56.4, last 100 47.2; engine disables 115.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 280 | 0 | 93.11 | - | - | - | 56.3 |
| bb | 277 | 0 | 94.44 | +1.32 (276 robots) | ±0.80 | +0.10 .. +2.54 | 42.6 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 557 |
| `skips 60 over 200 arms c` | halt | ok | 56.8 a battle over the last 200 (first 200: 56.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1831 battles unrun (about 1.6 h); every battle already fought is kept and a rerun resumes from it.

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
