# Queue pc-mimic-on: progress

Updated 2026-11-02 23:08:35 PC time (23:08 UTC), runner pid 43796.

- `prep` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**532 of 672 battles** (79%), 0 failed. Running 29 min, 1104 battles/h, about 8 min left (ends ~23:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.5 overall, first 100 30.2, last 100 32.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 177 | 0 | 61.06 | - | - | - | 30.3 |
| aa | 175 | 0 | 61.13 | +0.00 (28 robots) | ±0.02 | -0.03 .. +0.04 | 28.7 |
| mq | 180 | 0 | 62.31 | +0.03 (28 robots) | ±0.04 | -0.03 .. +0.09 | 32.6 |

APS = mean difference over the robots read x 28 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 28 robots; 1% band ±0.88 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 532 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 32.0 a battle over the last 200 (first 200: 30.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 140 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:38:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:38:18 start prep
22:38:21 progress pushed to origin claude/pc-mimic-on-progress (every 15 min)
22:39:40 prep exit=0 in 81 s
22:39:40 start confirm
22:39:40 watching confirm: 4 stop rule(s)
22:40:20 progress confirm: 8/672 (1%) battles, 714/h, ETA 56 min, 0 failed, skips 31.4/battle (last 100), aa -0.14
```
