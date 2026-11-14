# Queue pc-shadow: progress

Updated 2026-11-14 01:26:34 PC time (01:26 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**2917 of 7158 battles** (41%), 0 failed, 206 read back from an earlier run. Running 3.8 h, 634 battles/h, about 6.7 h left (ends ~08:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.2 overall, first 100 62.0, last 100 77.3; engine disables 1649.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 972 | 0 | 92.98 | - | - | - | 64.0 |
| aa | 972 | 0 | 93.01 | +0.04 (785 robots) | ±0.23 | -0.31 .. +0.38 | 59.4 |
| kp | 973 | 0 | 93.17 | +0.14 (783 robots) | ±0.21 | -0.18 .. +0.46 | 62.8 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 785 robots; 1% band ±0.37 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2917 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 68.2 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 785 robots, stop band ±0.44 |

Stopping now would leave 4241 battles unrun (about 6.7 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:14:04 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/808
21:14:04 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
21:37:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
21:37:12 skip prep (already exit=0)
21:37:12 start field
21:37:12 watching field: 5 stop rule(s)
21:37:14 progress pushed to origin claude/pc-shadow-progress (every 15 min)
21:38:12 progress field: 206/7158 (3%) battles, 0 failed, aa +0.45, kp +0.68
22:08:32 progress field: 663/7158 (9%) battles, 886/h, ETA 7.3 h, 0 failed, skips 63.5/battle (last 100), aa -0.07, kp +0.28
22:38:49 progress field: 1061/7158 (15%) battles, 796/h, ETA 7.7 h, 0 failed, skips 66.2/battle (last 100), aa -0.06, kp +0.06
23:09:05 progress field: 1405/7158 (20%) battles, 688/h, ETA 8.4 h, 0 failed, skips 62.4/battle (last 100), aa +0.10, kp +0.08
23:39:22 progress field: 1748/7158 (24%) battles, 684/h, ETA 7.9 h, 0 failed, skips 59.5/battle (last 100), aa +0.08, kp +0.10
00:09:51 progress field: 2101/7158 (29%) battles, 690/h, ETA 7.3 h, 0 failed, skips 62.5/battle (last 100), aa +0.10, kp +0.12
00:40:02 progress field: 2436/7158 (34%) battles, 666/h, ETA 7.1 h, 0 failed, skips 63.2/battle (last 100), aa +0.08, kp +0.12
01:10:18 progress field: 2746/7158 (38%) battles, 620/h, ETA 7.1 h, 0 failed, skips 52.4/battle (last 100), aa +0.03, kp +0.14
```
