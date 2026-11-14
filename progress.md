# Queue pc-r31: progress

Updated 2026-11-14 08:31:45 PC time (08:31 UTC), runner pid 59168.

- `prep` done, exit 0 in 6 min
- `screen` running
- `pick` skipped
- `lock` skipped
- `gate` skipped
- `pr` skipped

### screen

**262 of 1860 battles** (14%), 0 failed. Running 9 min, 1738 battles/h, about 55 min left (ends ~09:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.1 overall, first 100 10.0, last 100 12.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 29 | 0 | 73.85 | - | - | - | 11.9 |
| aa | 23 | 0 | 69.19 | -0.07 (15 robots) | ±0.11 | -0.24 .. +0.10 | 11.3 |
| mtzl | 23 | 0 | 68.99 | -0.06 (13 robots) | ±0.07 | -0.17 .. +0.06 | 12.3 |
| fq | 26 | 0 | 70.15 | -0.02 (13 robots) | ±0.07 | -0.13 .. +0.08 | 12.1 |
| gl | 25 | 0 | 72.34 | +0.05 (13 robots) | ±0.07 | -0.05 .. +0.16 | 11.4 |
| mq | 27 | 0 | 69.77 | -0.01 (13 robots) | ±0.06 | -0.10 .. +0.08 | 11.9 |
| x5 | 28 | 0 | 72.59 | +0.03 (15 robots) | ±0.05 | -0.05 .. +0.10 | 12.2 |
| wl | 27 | 0 | 21.88 | -1.13 (14 robots) | ±0.32 | -1.63 .. -0.64 | 4.1 |
| hl | 25 | 0 | 69.37 | -0.02 (14 robots) | ±0.07 | -0.12 .. +0.08 | 11.4 |
| rp | 29 | 0 | 70.70 | +0.02 (15 robots) | ±0.08 | -0.11 .. +0.15 | 12.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -2.71 pts over 15 robots; 1% band ±2.44 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 262 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 11.3 a battle over the last 200 (first 200: 10.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 14%) |

Stopping now would leave 1598 battles unrun (about 55 min); every battle already fought is kept and a rerun resumes from it.

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
