# Queue pc-1to1: progress

Updated 2026-10-29 03:14:14 PC time (03:14 UTC), runner pid 61632.

- `prep` done, exit 0 in 4 min
- `shield` running
- `learn` pending
- `gate` pending
- `pr` pending

### shield

**772 of 3720 battles** (21%), 0 failed. Running 11 min, 4069 battles/h, about 43 min left (ends ~03:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.0 overall, first 100 13.3, last 100 13.0; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 155 | 0 | 90.41 | - | - | - | 12.8 |
| aa | 153 | 0 | 90.77 | +0.02 (95 robots) | ±0.05 | -0.05 .. +0.10 | 12.9 |
| s4 | 157 | 0 | 87.25 | -0.35 (95 robots) | ±0.15 | -0.57 .. -0.13 | 12.6 |
| sv | 154 | 0 | 88.63 | -0.18 (95 robots) | ±0.15 | -0.41 .. +0.05 | 13.5 |
| sy | 153 | 0 | 90.73 | +0.03 (94 robots) | ±0.07 | -0.07 .. +0.14 | 13.4 |

APS = mean difference over the robots read x 124 panel robots / 1217 pairings.
A/A: aa - c +0.23 pts over 95 robots; 1% band ±0.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 772 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.8 a battle over the last 200 (first 200: 12.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.23 pts over 95 robots, stop band ±1.10 |

Stopping now would leave 2948 battles unrun (about 43 min); every battle already fought is kept and a rerun resumes from it.

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
