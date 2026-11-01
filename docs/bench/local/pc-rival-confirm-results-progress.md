# Queue pc-rival-confirm: progress

Updated 2026-11-01 08:48:48 PC time (08:48 UTC), runner pid 61148.

- `prep` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**411 of 432 battles** (95%), 0 failed. Running 6 min, 4283 battles/h, about 0 min left (ends ~08:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.1 overall, first 100 12.4, last 100 12.1; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 137 | 0 | 86.76 | - | - | - | 12.9 |
| aa | 135 | 0 | 85.46 | -0.02 (18 robots) | ±0.02 | -0.04 .. +0.00 | 12.2 |
| rp | 139 | 0 | 91.78 | +0.08 (18 robots) | ±0.03 | +0.04 .. +0.13 | 11.4 |

APS = mean difference over the robots read x 18 panel robots / 1217 pairings.
A/A: aa - c -1.30 pts over 18 robots; 1% band ±1.00 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 411 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.2 a battle over the last 200 (first 200: 12.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 21 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:41:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:41:42 start prep
08:41:44 progress pushed to origin claude/pc-rival-confirm-progress (every 15 min)
08:43:02 prep exit=0 in 80 s
08:43:02 start confirm
08:43:02 watching confirm: 4 stop rule(s)
08:43:44 progress confirm: 48/432 (11%) battles, 4187/h, ETA 6 min, 0 failed, skips 12.0/battle (last 100), aa -0.02, rp +0.10
```
