# Queue pc-1to1: progress

Updated 2026-10-29 03:29:18 PC time (03:29 UTC), runner pid 61632.

- `prep` done, exit 0 in 4 min
- `shield` running
- `learn` pending
- `gate` pending
- `pr` pending

### shield

**1882 of 3720 battles** (51%), 0 failed. Running 26 min, 4267 battles/h, about 26 min left (ends ~03:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 100 13.3, last 100 13.1; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 378 | 0 | 90.69 | - | - | - | 12.9 |
| aa | 377 | 0 | 90.68 | -0.00 (122 robots) | ±0.05 | -0.07 .. +0.07 | 13.1 |
| s4 | 376 | 0 | 87.27 | -0.35 (122 robots) | ±0.12 | -0.54 .. -0.16 | 12.8 |
| sv | 376 | 0 | 88.83 | -0.19 (122 robots) | ±0.13 | -0.39 .. +0.01 | 13.1 |
| sy | 375 | 0 | 90.85 | +0.02 (122 robots) | ±0.05 | -0.06 .. +0.10 | 13.5 |

APS = mean difference over the robots read x 124 panel robots / 1217 pairings.
A/A: aa - c -0.01 pts over 122 robots; 1% band ±0.60 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1882 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 13.0 a battle over the last 200 (first 200: 12.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.01 pts over 122 robots, stop band ±0.70 |

Stopping now would leave 1838 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:59:04 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
02:59:04 start prep
02:59:07 progress pushed to origin claude/pc-1to1-progress (every 15 min)
03:02:50 prep exit=0 in 225 s
03:02:50 start shield
03:02:50 watching shield: 5 stop rule(s)
03:03:06 progress shield: 8/3720 (0%) battles, 1782/h, ETA 2.1 h, 0 failed, skips 15.8/battle (last 100)
```
