# Queue pc-rival-near: progress

Updated 2026-11-01 10:41:48 PC time (10:41 UTC), runner pid 36272.

- `prep` done, exit 0 in 1 min
- `confirm` done, exit 0 in 11 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**672 of 672 battles** (100%), 0 failed. Running 11 min, 3708 battles/h, about 0 min left (ends ~10:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.9 overall, first 100 12.1, last 100 11.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 224 | 0 | 86.46 | - | - | - | 12.1 |
| aa | 224 | 0 | 86.95 | +0.01 (28 robots) | ±0.02 | -0.02 .. +0.05 | 12.2 |
| rp | 224 | 0 | 88.57 | +0.04 (28 robots) | ±0.04 | -0.02 .. +0.11 | 11.4 |

APS = mean difference over the robots read x 28 panel robots / 1217 pairings.
A/A: aa - c +0.50 pts over 28 robots; 1% band ±0.78 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 672 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 11.6 a battle over the last 200 (first 200: 12.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:27:54 ALLDONE
10:28:01 progress pushed to origin claude/pc-rival-near-progress (every 15 min)
10:29:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:29:34 start prep
10:29:36 progress pushed to origin claude/pc-rival-near-progress (every 15 min)
10:30:48 prep exit=0 in 74 s
10:30:48 start confirm
10:30:49 watching confirm: 4 stop rule(s)
10:31:35 progress confirm: 38/672 (6%) battles, 2951/h, ETA 13 min, 0 failed, skips 12.6/battle (last 100), aa +0.03, rp +0.05
10:41:41 confirm exit=0 in 652 s
10:41:41 start gate
10:41:42 gate exit=0 in 0 s
10:41:42 start pr
10:41:48 pr exit=0 in 5 s
10:41:48 ALLDONE
```
