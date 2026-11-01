# Queue pc-surf-key: progress

Updated 2026-11-01 13:59:41 PC time (13:59 UTC), runner pid 71784.

- `prep` done, exit 0 in 1 min
- `record` done, exit 0 in 19 min
- `fit` done, exit 0 in 1.4 h
- `confirm` running
- `gate` pending
- `pr` pending

### record

**792 of 792 battles** (100%), 0 failed. Running 19 min, 2512 battles/h, about 0 min left (ends ~12:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 18.6, last 100 17.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 792 |
| `skips 40 over 200` | halt | ok | 18.9 a battle over the last 200 (first 200: 18.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**37 of 2376 battles** (2%), 0 failed. Running 1 min, 2592 battles/h, about 54 min left (ends ~14:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.2 overall, first 37 22.2, last 37 22.2; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 10 | 0 | 86.22 | - | - | - | 17.4 |
| aa | 9 | 0 | 89.95 | +0.15 (6 robots) | ±0.13 | -0.06 .. +0.35 | 17.1 |
| kl | 10 | 0 | 88.22 | -0.38 (6 robots) | ±0.44 | -1.05 .. +0.30 | 34.6 |
| klbb | 8 | 0 | 88.16 | -0.20 (5 robots) | ±0.37 | -0.76 .. +0.37 | 18.6 |

APS = mean difference over the robots read x 198 panel robots / 1217 pairings.
A/A: aa - c +0.90 pts over 6 robots; 1% band ±4.77 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 37 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | waiting | 37 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2339 battles unrun (about 54 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:28:02 progress pushed to origin claude/pc-surf-key-progress (every 15 min)
10:29:02 prep exit=130 in 68 s (stopped)
12:13:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
12:13:57 start prep
12:13:59 progress pushed to origin claude/pc-surf-key-progress (every 15 min)
12:15:17 prep exit=0 in 79 s
12:15:17 start record
12:15:17 watching record: 3 stop rule(s)
12:15:58 progress record: 10/792 (1%) battles, 872/h, ETA 54 min, 0 failed, skips 16.4/battle (last 100)
12:34:12 record exit=0 in 1134 s
12:34:12 start fit
13:58:50 fit exit=0 in 5077 s
13:58:50 start confirm
13:58:50 watching confirm: 4 stop rule(s)
13:59:41 progress confirm: 37/2376 (2%) battles, 2592/h, ETA 54 min, 0 failed, skips 22.2/battle (last 100), aa +0.15, kl -0.38, klbb -0.20
```
