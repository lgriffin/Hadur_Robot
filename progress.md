# Queue pc-shield-still: progress

Updated 2026-10-31 16:02:32 PC time (16:02 UTC), runner pid 58600.

- `prep` done, exit 0 in 2 min
- `still` halted, exit 75 in 12 min, HALTED by aa after 20%: aa - c +1.00 pts over 150 robots, stop band ±1.00
- `add` pending
- `gate` pending
- `pr` pending

### still

**562 of 1638 battles** (34%), 0 failed. Running 12 min, 2834 battles/h, about 23 min left (ends ~16:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.0 overall, first 100 17.7, last 100 21.3; engine disables 34.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 189 | 0 | 93.98 | - | - | - | 21.4 |
| aa | 186 | 0 | 95.03 | +0.22 (150 robots) | ±0.21 | -0.10 .. +0.54 | 18.0 |
| sz | 187 | 0 | 94.90 | +0.08 (149 robots) | ±0.21 | -0.24 .. +0.40 | 17.5 |

APS = mean difference over the robots read x 273 panel robots / 1217 pairings.
A/A: aa - c +1.00 pts over 150 robots; 1% band ±0.86 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 562 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 19.7 a battle over the last 200 (first 200: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | TRIPPED | aa - c +1.00 pts over 150 robots, stop band ±1.00 |
| `futility sz below 0.05 after 30%` | finish | ok | sz +0.08, best case +0.40 APS vs bar +0.05 |

Stopping now would leave 1076 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:48:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:48:21 start prep
15:48:24 progress pushed to origin claude/pc-shield-still-progress (every 15 min)
15:50:38 prep exit=0 in 137 s
15:50:38 start still
15:50:38 watching still: 6 stop rule(s)
15:51:23 progress still: 28/1638 (2%) battles, 2271/h, ETA 43 min, 0 failed, skips 16.2/battle (last 100), aa +0.00, sz -0.87
16:02:32 STOP still by rule aa after 20%: aa - c +1.00 pts over 150 robots, stop band ±1.00; 562 battles fought and kept, 1076 battles left unrun (about 23 min)
16:02:32 still exit=75 in 713 s (halted, aa after 20%)
```
