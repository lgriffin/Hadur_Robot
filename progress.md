# Queue pc-hj-field: progress

Updated 2026-11-08 13:08:03 PC time (13:08 UTC), runner pid 60408.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `field` pending
- `gate` pending
- `pr` pending

### pilot

**774 of 2151 battles** (36%), 0 failed. Running 14 min, 3428 battles/h, about 24 min left (ends ~13:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.1 overall, first 100 34.5, last 100 35.6; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 256 | 0 | 93.21 | - | - | - | 34.0 |
| aa | 258 | 0 | 93.17 | +0.01 (171 robots) | ±0.09 | -0.13 .. +0.16 | 33.8 |
| hj | 260 | 0 | 93.13 | -0.02 (171 robots) | ±0.08 | -0.14 .. +0.10 | 34.5 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 171 robots; 1% band ±0.73 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 774 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 34.1 a battle over the last 200 (first 200: 34.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1377 battles unrun (about 24 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:52:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:52:50 start prep
12:52:52 progress pushed to origin claude/pc-hj-field-progress (every 15 min)
12:54:30 prep exit=0 in 99 s
12:54:30 start pilot
12:54:30 watching pilot: 4 stop rule(s)
12:54:51 progress pilot: 10/2151 (0%) battles, 1698/h, ETA 1.3 h, 0 failed, skips 33.9/battle (last 100)
```
