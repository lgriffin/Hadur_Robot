# Queue pc-learn-trace: progress

Updated 2026-11-23 03:55:37 PC time (03:55 UTC), runner pid 44500.

- `prep` done, exit 0 in 0 min
- `trace` done, exit 0 in 3.4 h
- `read` running
- `pr` pending

### trace

**2416 of 2416 battles** (100%), 8 failed. Running 3.4 h, 14 battles/h, about 0 min left (ends ~03:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.2 overall, first 100 14.9, last 100 11.8; engine disables 189.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1208 | 0 | 93.54 | - | - | - | 25.2 |
| bb | 1208 | 8 | 95.02 | +1.45 (1200 robots) | ±0.30 | +0.99 .. +1.91 | 1.1 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 8 failed of 2416 |
| `skips 60 over 200 arms c` | halt | ok | 20.7 a battle over the last 200 (first 200: 26.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 162 h before this step started: check it is not stale

### Queue log (last lines)

```
00:16:26 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
00:16:26 start prep
00:16:29 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
00:16:37 prep exit=0 in 10 s
00:16:37 start trace
00:16:37 watching trace: 3 stop rule(s)
00:17:26 progress trace: 5/2416 (0%) battles, 364/h, ETA 6.6 h, 0 failed, skips 10.0/battle (last 100)
00:47:46 progress trace: 569/2416 (24%) battles, 1114/h, ETA 1.7 h, 0 failed, skips 14.3/battle (last 100), bb +1.25
01:18:04 progress trace: 1031/2416 (43%) battles, 916/h, ETA 1.5 h, 0 failed, skips 13.2/battle (last 100), bb +1.22
01:48:23 progress trace: 1452/2416 (60%) battles, 836/h, ETA 1.2 h, 0 failed, skips 14.5/battle (last 100), bb +1.30
02:18:42 progress trace: 1847/2416 (76%) battles, 776/h, ETA 44 min, 3 failed, skips 12.2/battle (last 100), bb +1.42
02:49:03 progress trace: 2231/2416 (92%) battles, 760/h, ETA 15 min, 4 failed, skips 11.1/battle (last 100), bb +1.44
03:19:20 progress trace: 2413/2416 (100%) battles, 362/h, ETA 0 min, 6 failed, skips 11.9/battle (last 100), bb +1.45
03:42:28 trace exit=0 in 12351 s
03:42:28 start read
```
