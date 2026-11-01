# Queue pc-rival-picks: progress

Updated 2026-11-01 04:33:21 PC time (04:33 UTC), runner pid 68568.

- `prep` done, exit 0 in 5 min
- `screen-add` running
- `screen-exec` pending
- `screen-stopgo` pending
- `gate` pending
- `pr` pending

### screen-add

**694 of 888 battles** (78%), 0 failed. Running 10 min, 4016 battles/h, about 3 min left (ends ~04:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.6 overall, first 100 13.6, last 100 13.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 173 | 0 | 85.13 | - | - | - | 13.3 |
| aa | 174 | 0 | 84.99 | -0.01 (73 robots) | ±0.04 | -0.07 .. +0.05 | 13.3 |
| mt | 172 | 0 | 82.71 | -0.14 (73 robots) | ±0.08 | -0.26 .. -0.03 | 14.0 |
| mtzl | 175 | 0 | 83.25 | -0.11 (73 robots) | ±0.10 | -0.27 .. +0.05 | 13.7 |

APS = mean difference over the robots read x 74 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 73 robots; 1% band ±0.89 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 694 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 13.8 a battle over the last 200 (first 200: 13.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 194 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:18:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
04:18:10 start prep
04:18:13 progress pushed to origin claude/pc-rival-picks-progress (every 15 min)
04:22:59 prep exit=0 in 288 s
04:22:59 start screen-add
04:22:59 watching screen-add: 4 stop rule(s)
04:23:13 progress screen-add: 7/888 (1%) battles, 1789/h, ETA 30 min, 0 failed, skips 15.1/battle (last 100)
```
