# Queue pc-portfolio: progress

Updated 2026-11-11 18:46:09 PC time (18:46 UTC), runner pid 55532.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**503 of 540 battles** (93%), 0 failed. Running 7 min, 4041 battles/h, about 1 min left (ends ~18:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.5 overall, first 100 31.1, last 100 31.1; engine disables 27.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 167 | 0 | 91.24 | - | - | - | 31.3 |
| aa | 170 | 0 | 91.31 | +0.00 (30 robots) | ±0.02 | -0.03 .. +0.03 | 31.1 |
| xr | 166 | 0 | 90.91 | -0.01 (30 robots) | ±0.02 | -0.04 .. +0.03 | 32.1 |

APS = mean difference over the robots read x 30 panel robots / 1217 pairings.
A/A: aa - c +0.08 pts over 30 robots; 1% band ±0.90 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 503 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 31.2 a battle over the last 200 (first 200: 31.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 37 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:37:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:37:02 start prep
18:37:05 progress pushed to origin claude/pc-portfolio-progress (every 15 min)
18:38:41 prep exit=0 in 99 s
18:38:41 start pilot
18:38:41 watching pilot: 4 stop rule(s)
18:39:04 progress pilot: 14/540 (3%) battles, 2266/h, ETA 14 min, 0 failed, skips 36.7/battle (last 100), aa +0.01
```
