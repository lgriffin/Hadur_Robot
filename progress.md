# Queue pc-r31: progress

Updated 2026-11-14 08:46:54 PC time (08:46 UTC), runner pid 59168.

- `prep` done, exit 0 in 6 min
- `screen` running
- `pick` skipped
- `lock` skipped
- `gate` skipped
- `pr` skipped

### screen

**688 of 1860 battles** (37%), 0 failed. Running 24 min, 1706 battles/h, about 41 min left (ends ~09:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.5 overall, first 100 10.0, last 100 9.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 67 | 0 | 70.54 | - | - | - | 11.0 |
| aa | 70 | 0 | 69.43 | -0.03 (30 robots) | ±0.06 | -0.12 .. +0.06 | 10.6 |
| mtzl | 69 | 0 | 69.52 | -0.03 (29 robots) | ±0.07 | -0.13 .. +0.08 | 11.8 |
| fq | 68 | 0 | 71.65 | +0.04 (30 robots) | ±0.05 | -0.03 .. +0.12 | 11.3 |
| gl | 68 | 0 | 70.38 | +0.01 (30 robots) | ±0.04 | -0.05 .. +0.08 | 11.4 |
| mq | 67 | 0 | 70.50 | +0.02 (29 robots) | ±0.03 | -0.03 .. +0.06 | 11.7 |
| x5 | 71 | 0 | 72.16 | +0.06 (30 robots) | ±0.05 | -0.02 .. +0.14 | 11.5 |
| wl | 68 | 0 | 21.84 | -1.23 (30 robots) | ±0.19 | -1.52 .. -0.93 | 4.0 |
| hl | 71 | 0 | 71.27 | +0.03 (30 robots) | ±0.04 | -0.03 .. +0.10 | 10.9 |
| rp | 69 | 0 | 70.85 | +0.02 (30 robots) | ±0.03 | -0.03 .. +0.08 | 11.2 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -1.11 pts over 30 robots; 1% band ±1.41 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 688 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 9.8 a battle over the last 200 (first 200: 10.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -1.11 pts over 30 robots, stop band ±3.46 (observed spread) |

Stopping now would leave 1172 battles unrun (about 41 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:06:20 progress pushed to origin claude/pc-r31-progress (every 15 min)
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
```
