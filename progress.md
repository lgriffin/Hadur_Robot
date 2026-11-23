# Queue pc-learn-trace: progress

Updated 2026-11-23 01:17:03 PC time (01:17 UTC), runner pid 44500.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**1017 of 2416 battles** (42%), 0 failed. Running 1.0 h, 926 battles/h, about 1.5 h left (ends ~02:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.6 overall, first 100 14.9, last 100 13.5; engine disables 91.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 510 | 0 | 93.72 | - | - | - | 26.1 |
| bb | 507 | 0 | 94.92 | +1.18 (505 robots) | ±0.46 | +0.48 .. +1.88 | 1.0 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1017 |
| `skips 60 over 200 arms c` | halt | ok | 25.4 a battle over the last 200 (first 200: 26.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1399 battles unrun (about 1.5 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 162 h before this step started: check it is not stale

### Queue log (last lines)

```
00:13:46 start prep
00:13:48 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
00:14:01 prep exit=1 in 15 s
00:14:01 skip trace (after prep, which has not finished exit=0)
00:14:01 skip read (after trace, which has not finished exit=0)
00:14:01 skip pr (after read, which has not finished exit=0)
00:14:01 ALLDONE
00:16:26 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
00:16:26 start prep
00:16:29 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
00:16:37 prep exit=0 in 10 s
00:16:37 start trace
00:16:37 watching trace: 3 stop rule(s)
00:17:26 progress trace: 5/2416 (0%) battles, 364/h, ETA 6.6 h, 0 failed, skips 10.0/battle (last 100)
00:47:46 progress trace: 569/2416 (24%) battles, 1114/h, ETA 1.7 h, 0 failed, skips 14.3/battle (last 100), bb +1.25
```
