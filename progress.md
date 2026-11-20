# Queue pc-rc-confirm: progress

Updated 2026-11-20 14:22:42 PC time (14:22 UTC), runner pid 48084.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### field

**1700 of 7158 battles** (24%), 0 failed, 521 read back from an earlier run. Running 1.8 h, 700 battles/h, about 7.8 h left (ends ~22:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 43.8 overall, first 100 47.4, last 100 52.8; engine disables 544.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 567 | 0 | 93.14 | -0.59 (502 robots) | ±0.32 | -1.08 .. -0.11 | 51.1 |
| c | 567 | 0 | 93.75 | - | - | - | 45.1 |
| aa | 566 | 0 | 93.70 | -0.04 (504 robots) | ±0.30 | -0.50 .. +0.42 | 46.3 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c -0.04 pts over 504 robots; 1% band ±0.49 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1700 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 45.9 a battle over the last 200 (first 200: 42.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.04 pts over 504 robots, stop band ±0.57 |

Stopping now would leave 5458 battles unrun (about 7.8 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 13 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.23bb.jar was built 13 h before this step started: check it is not stale

### Queue log (last lines)

```
08:42:41 progress field: 308/7158 (4%) battles, 0 failed, rel +0.09, aa +0.05
09:01:54 STOP field by rule skips 60 over 200: 61.4 a battle over the last 200 (first 200: 59.2); 521 battles fought and kept, 6637 battles left unrun (about 10.5 h)
09:01:55 field exit=75 in 1213 s (halted, skips 60 over 200)
09:01:57 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/953
09:01:57 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
12:35:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
12:35:39 skip prep (already exit=0)
12:35:39 skip livematch (already exit=0)
12:35:39 start field
12:35:39 watching field: 5 stop rule(s)
12:35:42 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
12:36:39 progress field: 521/7158 (7%) battles, 0 failed, rel -0.23, aa -0.22
13:06:58 progress field: 829/7158 (12%) battles, 616/h, ETA 10.3 h, 0 failed, skips 42.7/battle (last 100), rel -0.36, aa -0.25
13:37:14 progress field: 1175/7158 (16%) battles, 692/h, ETA 8.6 h, 0 failed, skips 43.0/battle (last 100), rel -0.63, aa -0.21
14:07:33 progress field: 1530/7158 (21%) battles, 706/h, ETA 8.0 h, 0 failed, skips 40.8/battle (last 100), rel -0.61, aa -0.08
```
