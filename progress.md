# Queue pc-1to1: progress

Updated 2026-10-29 03:44:21 PC time (03:44 UTC), runner pid 61632.

- `prep` done, exit 0 in 4 min
- `shield` running
- `learn` pending
- `gate` pending
- `pr` pending

### shield

**3036 of 3720 battles** (82%), 0 failed. Running 42 min, 4510 battles/h, about 9 min left (ends ~03:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 100 13.3, last 100 13.5; engine disables 7.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 607 | 0 | 90.37 | - | - | - | 13.0 |
| aa | 606 | 0 | 90.60 | +0.02 (124 robots) | ±0.03 | -0.03 .. +0.07 | 13.0 |
| s4 | 609 | 0 | 86.88 | -0.37 (124 robots) | ±0.12 | -0.54 .. -0.19 | 12.8 |
| sv | 608 | 0 | 88.50 | -0.20 (124 robots) | ±0.13 | -0.41 .. +0.00 | 13.3 |
| sy | 606 | 0 | 90.38 | -0.01 (124 robots) | ±0.04 | -0.07 .. +0.05 | 13.5 |

APS = mean difference over the robots read x 124 panel robots / 1217 pairings.
A/A: aa - c +0.23 pts over 124 robots; 1% band ±0.47 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3036 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 13.2 a battle over the last 200 (first 200: 12.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.23 pts over 124 robots, stop band ±0.55 |

Stopping now would leave 684 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:59:04 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
02:59:04 start prep
02:59:07 progress pushed to origin claude/pc-1to1-progress (every 15 min)
03:02:50 prep exit=0 in 225 s
03:02:50 start shield
03:02:50 watching shield: 5 stop rule(s)
03:03:06 progress shield: 8/3720 (0%) battles, 1782/h, ETA 2.1 h, 0 failed, skips 15.8/battle (last 100)
03:33:19 progress shield: 2198/3720 (59%) battles, 4350/h, ETA 21 min, 0 failed, skips 13.5/battle (last 100), aa -0.01, s4 -0.36, sv -0.18, sy -0.01
```
