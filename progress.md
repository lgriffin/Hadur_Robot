# Queue pc-learn-trace: progress

Updated 2026-11-23 02:48:02 PC time (02:48 UTC), runner pid 44500.

- `prep` done, exit 0 in 0 min
- `trace` running
- `read` pending
- `pr` pending

### trace

**2218 of 2416 battles** (92%), 4 failed. Running 2.5 h, 760 battles/h, about 16 min left (ends ~03:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 100 14.9, last 100 10.1; engine disables 179.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1110 | 0 | 93.46 | - | - | - | 25.5 |
| bb | 1108 | 4 | 95.01 | +1.44 (1102 robots) | ±0.32 | +0.96 .. +1.93 | 1.1 |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 4 failed of 2218 |
| `skips 60 over 200 arms c` | halt | ok | 23.7 a battle over the last 200 (first 200: 26.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 198 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 162 h before this step started: check it is not stale

### Queue log (last lines)

```
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
01:18:04 progress trace: 1031/2416 (43%) battles, 916/h, ETA 1.5 h, 0 failed, skips 13.2/battle (last 100), bb +1.22
01:48:23 progress trace: 1452/2416 (60%) battles, 836/h, ETA 1.2 h, 0 failed, skips 14.5/battle (last 100), bb +1.30
02:18:42 progress trace: 1847/2416 (76%) battles, 776/h, ETA 44 min, 3 failed, skips 12.2/battle (last 100), bb +1.42
```
