# Queue pc-hj-field: progress

Updated 2026-11-08 13:23:15 PC time (13:23 UTC), runner pid 60408.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `field` pending
- `gate` pending
- `pr` pending

### pilot

**1550 of 2151 battles** (72%), 0 failed. Running 29 min, 3234 battles/h, about 11 min left (ends ~13:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.1 overall, first 100 34.5, last 100 33.3; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 517 | 0 | 92.98 | - | - | - | 34.0 |
| aa | 518 | 0 | 92.79 | -0.04 (233 robots) | ±0.07 | -0.14 .. +0.07 | 34.2 |
| hj | 515 | 0 | 92.85 | -0.01 (233 robots) | ±0.06 | -0.10 .. +0.09 | 34.1 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c -0.19 pts over 233 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1550 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 32.7 a battle over the last 200 (first 200: 34.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 601 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:52:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:52:50 start prep
12:52:52 progress pushed to origin claude/pc-hj-field-progress (every 15 min)
12:54:30 prep exit=0 in 99 s
12:54:30 start pilot
12:54:30 watching pilot: 4 stop rule(s)
12:54:51 progress pilot: 10/2151 (0%) battles, 1698/h, ETA 1.3 h, 0 failed, skips 33.9/battle (last 100)
```
