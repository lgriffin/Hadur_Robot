# Queue pc-r31: progress

Updated 2026-11-14 09:02:03 PC time (09:02 UTC), runner pid 59168.

- `prep` done, exit 0 in 6 min
- `screen` running
- `pick` skipped
- `lock` skipped
- `gate` skipped
- `pr` skipped

### screen

**1134 of 1860 battles** (61%), 0 failed. Running 39 min, 1728 battles/h, about 25 min left (ends ~09:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.9 overall, first 100 10.0, last 100 11.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 113 | 0 | 70.75 | - | - | - | 11.5 |
| aa | 113 | 0 | 70.40 | -0.01 (30 robots) | ±0.03 | -0.05 .. +0.04 | 11.4 |
| mtzl | 111 | 0 | 68.48 | -0.05 (30 robots) | ±0.05 | -0.13 .. +0.02 | 12.0 |
| fq | 112 | 0 | 72.18 | +0.04 (30 robots) | ±0.03 | -0.01 .. +0.09 | 11.6 |
| gl | 117 | 0 | 71.07 | +0.01 (30 robots) | ±0.03 | -0.03 .. +0.06 | 11.8 |
| mq | 113 | 0 | 70.66 | +0.00 (30 robots) | ±0.02 | -0.03 .. +0.04 | 12.1 |
| x5 | 114 | 0 | 71.45 | +0.02 (30 robots) | ±0.02 | -0.01 .. +0.06 | 11.7 |
| wl | 113 | 0 | 22.80 | -1.22 (30 robots) | ±0.19 | -1.51 .. -0.92 | 4.2 |
| hl | 115 | 0 | 70.73 | +0.01 (30 robots) | ±0.02 | -0.03 .. +0.05 | 11.3 |
| rp | 113 | 0 | 70.94 | +0.01 (30 robots) | ±0.03 | -0.03 .. +0.05 | 11.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -0.35 pts over 30 robots; 1% band ±1.10 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1134 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 11.4 a battle over the last 200 (first 200: 10.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.35 pts over 30 robots, stop band ±1.75 (observed spread) |

Stopping now would leave 726 battles unrun (about 25 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:12:25 prep exit=1 in 368 s
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
```
