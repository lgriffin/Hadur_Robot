# Queue pc-field-prior: progress

Updated 2026-11-09 12:55:14 PC time (12:55 UTC), runner pid 41064.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 0 min
- `screen` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**1434 of 1434 battles** (100%), 0 failed, 1434 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 478 | 0 | 92.01 | - | - | - | 38.1 |
| aa | 478 | 0 | 92.02 | +0.00 (239 robots) | ±0.07 | -0.11 .. +0.12 | 39.8 |
| pf | 478 | 0 | 91.51 | -0.10 (239 robots) | ±0.07 | -0.21 .. +0.01 | 39.1 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 239 robots; 1% band ±0.53 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1434 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

### screen

**1434 of 7164 battles** (20%), 0 failed, 1434 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 478 | 0 | 92.01 | - | - | - | 38.1 |
| aa | 478 | 0 | 92.02 | +0.01 (239 robots) | ±0.37 | -0.57 .. +0.58 | 39.8 |
| pf | 478 | 0 | 91.51 | -0.50 (239 robots) | ±0.35 | -1.03 .. +0.04 | 39.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 239 robots; 1% band ±0.53 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1434 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5730 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:52:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:52:57 start prep
12:52:59 progress pushed to origin claude/pc-field-prior-progress (every 15 min)
12:54:58 prep exit=0 in 120 s
12:54:58 start pilot
12:54:58 watching pilot: 4 stop rule(s)
12:55:07 pilot exit=0 in 8 s
12:55:07 start screen
12:55:07 watching screen: 4 stop rule(s)
12:55:07 screen exit=0 in 0 s
12:55:07 start gate
12:55:07 gate exit=0 in 0 s
12:55:07 start pr
12:55:14 pr exit=0 in 6 s
12:55:14 ALLDONE
```
