# Queue pc-rival-near: progress

Updated 2026-11-01 10:40:43 PC time (10:40 UTC), runner pid 36272.

- `prep` done, exit 0 in 1 min
- `confirm` running
- `gate` skipped
- `pr` skipped

### confirm

**631 of 672 battles** (94%), 0 failed. Running 10 min, 3825 battles/h, about 1 min left (ends ~10:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.0 overall, first 100 12.1, last 100 12.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 211 | 0 | 86.29 | - | - | - | 12.2 |
| aa | 210 | 0 | 87.05 | +0.02 (28 robots) | ±0.02 | -0.02 .. +0.05 | 12.3 |
| rp | 210 | 0 | 88.62 | +0.04 (28 robots) | ±0.04 | -0.02 .. +0.11 | 11.5 |

APS = mean difference over the robots read x 28 panel robots / 1217 pairings.
A/A: aa - c +0.76 pts over 28 robots; 1% band ±0.80 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 631 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 11.8 a battle over the last 200 (first 200: 12.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 41 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:27:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:27:53 start prep
10:27:54 prep exit=128 in 0 s
10:27:54 skip confirm (after prep, which has not finished exit=0)
10:27:54 skip gate (after confirm, which has not finished exit=0)
10:27:54 skip pr (after gate, which has not finished exit=0)
10:27:54 ALLDONE
10:28:01 progress pushed to origin claude/pc-rival-near-progress (every 15 min)
10:29:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:29:34 start prep
10:29:36 progress pushed to origin claude/pc-rival-near-progress (every 15 min)
10:30:48 prep exit=0 in 74 s
10:30:48 start confirm
10:30:49 watching confirm: 4 stop rule(s)
10:31:35 progress confirm: 38/672 (6%) battles, 2951/h, ETA 13 min, 0 failed, skips 12.6/battle (last 100), aa +0.03, rp +0.05
```
