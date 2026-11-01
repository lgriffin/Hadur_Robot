# Queue pc-surf-key: progress

Updated 2026-11-01 14:30:05 PC time (14:30 UTC), runner pid 71784.

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

**1336 of 2376 battles** (56%), 0 failed. Running 31 min, 2548 battles/h, about 24 min left (ends ~14:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.4 overall, first 100 19.2, last 100 17.0; engine disables 4.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 334 | 0 | 83.51 | - | - | - | 16.9 |
| aa | 332 | 0 | 83.39 | -0.02 (180 robots) | ±0.08 | -0.15 .. +0.11 | 17.5 |
| kl | 334 | 0 | 83.76 | +0.06 (180 robots) | ±0.07 | -0.05 .. +0.17 | 17.6 |
| klbb | 336 | 0 | 83.52 | +0.01 (180 robots) | ±0.06 | -0.08 .. +0.11 | 17.4 |

APS = mean difference over the robots read x 198 panel robots / 1217 pairings.
A/A: aa - c -0.12 pts over 180 robots; 1% band ±0.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1336 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 17.2 a battle over the last 200 (first 200: 18.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1040 battles unrun (about 24 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
14:30:05 progress confirm: 1336/2376 (56%) battles, 2548/h, ETA 24 min, 0 failed, skips 17.0/battle (last 100), aa -0.02, kl +0.06, klbb +0.01
```
