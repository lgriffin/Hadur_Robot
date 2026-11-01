# Queue pc-shield-power: progress

Updated 2026-11-01 16:09:26 PC time (16:09 UTC), runner pid 69948.

- `prep` done, exit 0 in 2 min
- `screen` running
- `gate` pending
- `pr` pending

### screen

**653 of 4496 battles** (15%), 0 failed. Running 13 min, 2926 battles/h, about 1.3 h left (ends ~17:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.8 overall, first 100 17.9, last 100 14.8; engine disables 25.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 160 | 0 | 95.26 | - | - | - | 16.0 |
| aa | 165 | 0 | 95.65 | +0.07 (130 robots) | ±0.19 | -0.23 .. +0.36 | 16.8 |
| sc | 162 | 0 | 95.52 | +0.04 (130 robots) | ±0.17 | -0.22 .. +0.30 | 17.2 |
| sr | 166 | 0 | 95.59 | +0.04 (129 robots) | ±0.15 | -0.18 .. +0.26 | 13.3 |

APS = mean difference over the robots read x 281 panel robots / 1217 pairings.
A/A: aa - c +0.29 pts over 130 robots; 1% band ±0.93 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 653 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.5 a battle over the last 200 (first 200: 17.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 15%) |

Stopping now would leave 3843 battles unrun (about 1.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:54:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:54:14 start prep
15:54:17 progress pushed to origin claude/pc-shield-power-progress (every 15 min)
15:56:03 prep exit=0 in 108 s
15:56:03 start screen
15:56:03 watching screen: 5 stop rule(s)
15:56:16 progress screen: 0/4496 (0%) battles, 0 failed
```
