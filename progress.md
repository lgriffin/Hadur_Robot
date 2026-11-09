# Queue pc-field-prior: progress

Updated 2026-11-09 12:52:36 PC time (12:52 UTC), runner pid 22896.

- `prep` done, exit 0 in 2 min
- `pilot` failed, exit 2 in 0 min
- `screen` skipped
- `gate` skipped
- `pr` skipped

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

### Queue log (last lines)

```
07:52:29 watching pilot: 4 stop rule(s)
07:53:16 progress pilot: 40/1434 (3%) battles, 3101/h, ETA 27 min, 0 failed, skips 43.7/battle (last 100), aa -0.05, pf -0.02
08:23:36 progress pilot: 1432/1434 (100%) battles, 2742/h, ETA 0 min, 0 failed, skips 37.1/battle (last 100), aa +0.01, pf -0.09
08:27:50 pilot exit=2 in 2121 s
08:27:52 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/718
08:27:52 skip screen (after pilot, which has not finished exit=0)
08:27:52 skip gate (after screen, which has not finished exit=0)
08:27:52 skip pr (after gate, which has not finished exit=0)
08:27:52 ALLDONE
12:52:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:52:25 skip prep (already exit=0)
12:52:25 start pilot
12:52:25 watching pilot: 4 stop rule(s)
12:52:27 progress pushed to origin claude/pc-field-prior-progress (every 15 min)
12:52:36 pilot exit=2 in 10 s
```
