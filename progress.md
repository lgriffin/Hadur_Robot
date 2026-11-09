# Queue pc-field-prior: progress

Updated 2026-11-09 08:05:27 PC time (08:05 UTC), runner pid 17076.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `screen` pending
- `gate` pending
- `pr` pending

### pilot

**683 of 1434 battles** (48%), 0 failed. Running 13 min, 3162 battles/h, about 14 min left (ends ~08:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.8 overall, first 100 41.6, last 100 38.8; engine disables 24.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 229 | 0 | 91.80 | - | - | - | 38.2 |
| aa | 226 | 0 | 92.27 | +0.05 (174 robots) | ±0.11 | -0.12 .. +0.23 | 39.2 |
| pf | 228 | 0 | 91.04 | -0.15 (174 robots) | ±0.12 | -0.34 .. +0.03 | 39.1 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c +0.27 pts over 174 robots; 1% band ±0.78 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 683 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 40.5 a battle over the last 200 (first 200: 40.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 751 battles unrun (about 14 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:50:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
07:50:14 start prep
07:50:17 progress pushed to origin claude/pc-field-prior-progress (every 15 min)
07:52:29 prep exit=0 in 134 s
07:52:29 start pilot
07:52:29 watching pilot: 4 stop rule(s)
07:53:16 progress pilot: 40/1434 (3%) battles, 3101/h, ETA 27 min, 0 failed, skips 43.7/battle (last 100), aa -0.05, pf -0.02
```
