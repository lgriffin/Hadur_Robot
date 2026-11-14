# Queue pc-r31: progress

Updated 2026-11-14 09:32:22 PC time (09:32 UTC), runner pid 59168.

- `prep` done, exit 0 in 6 min
- `screen` running
- `pick` skipped
- `lock` skipped
- `gate` skipped
- `pr` skipped

### screen

**1716 of 1860 battles** (92%), 0 failed. Running 1.2 h, 1156 battles/h, about 7 min left (ends ~09:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.5 overall, first 100 10.0, last 100 8.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 171 | 0 | 69.93 | - | - | - | 11.0 |
| aa | 173 | 0 | 69.97 | +0.00 (31 robots) | ±0.02 | -0.03 .. +0.04 | 11.0 |
| mtzl | 171 | 0 | 68.34 | -0.04 (31 robots) | ±0.05 | -0.11 .. +0.03 | 11.7 |
| fq | 171 | 0 | 71.30 | +0.03 (31 robots) | ±0.02 | -0.00 .. +0.07 | 11.3 |
| gl | 171 | 0 | 71.44 | +0.04 (31 robots) | ±0.03 | -0.01 .. +0.09 | 11.3 |
| mq | 168 | 0 | 70.18 | +0.01 (31 robots) | ±0.02 | -0.03 .. +0.04 | 11.7 |
| x5 | 171 | 0 | 70.98 | +0.03 (31 robots) | ±0.03 | -0.01 .. +0.06 | 11.3 |
| wl | 177 | 0 | 21.65 | -1.23 (31 robots) | ±0.18 | -1.50 .. -0.96 | 3.9 |
| hl | 171 | 0 | 70.48 | +0.01 (31 robots) | ±0.02 | -0.02 .. +0.04 | 11.0 |
| rp | 172 | 0 | 70.16 | +0.01 (31 robots) | ±0.03 | -0.03 .. +0.05 | 11.4 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 31 robots; 1% band ±0.89 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1716 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 8.7 a battle over the last 200 (first 200: 10.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 31 robots, stop band ±1.39 (observed spread) |

Stopping now would leave 144 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:12:25 skip screen (after prep, which has not finished exit=0)
08:12:25 skip pick (after screen, which has not finished exit=0)
08:12:25 skip lock (after pick, which has not finished exit=0)
08:12:25 skip gate (after lock, which has not finished exit=0)
08:12:25 skip pr (after gate, which has not finished exit=0)
08:12:25 ALLDONE
08:16:37 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:16:37 start prep
08:16:39 progress pushed to origin claude/pc-r31-progress (every 15 min)
08:22:42 prep exit=0 in 364 s
08:22:42 start screen
08:22:42 watching screen: 5 stop rule(s)
08:23:41 progress screen: 22/1860 (1%) battles, 1357/h, ETA 1.4 h, 0 failed, skips 9.7/battle (last 100), gl -0.24, mq -0.02, x5 -0.25
08:53:58 progress screen: 894/1860 (48%) battles, 1726/h, ETA 34 min, 0 failed, skips 11.7/battle (last 100), aa -0.02, mtzl -0.05, fq +0.04, gl +0.01, mq +0.01, x5 +0.04, wl -1.21, hl +0.02, rp +0.02
09:24:17 progress screen: 1534/1860 (82%) battles, 1258/h, ETA 16 min, 0 failed, skips 8.1/battle (last 100), aa +0.00, mtzl -0.04, fq +0.03, gl +0.04, mq +0.01, x5 +0.02, wl -1.23, hl +0.01, rp +0.00
```
