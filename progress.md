# Queue pc-rc-confirm: progress

Updated 2026-11-20 08:56:49 PC time (08:56 UTC), runner pid 81432.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### field

**472 of 7158 battles** (7%), 0 failed, 308 read back from an earlier run. Running 15 min, 650 battles/h, about 10.3 h left (ends ~19:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.5 overall, first 100 62.2, last 100 65.9; engine disables 129.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 157 | 0 | 93.78 | -0.22 (147 robots) | ±0.57 | -1.09 .. +0.65 | 60.7 |
| c | 156 | 0 | 94.10 | - | - | - | 56.4 |
| aa | 159 | 0 | 94.00 | -0.19 (149 robots) | ±0.51 | -0.97 .. +0.60 | 51.7 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c -0.19 pts over 149 robots; 1% band ±0.94 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 472 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 164 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 7%) |

Stopping now would leave 6686 battles unrun (about 10.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:02:11 livematch exit=0 in 8 s
00:02:11 start field
00:02:11 watching field: 5 stop rule(s)
00:02:23 progress field: 0/7158 (0%) battles, 0 failed
00:27:39 STOP field by rule skips 60 over 200: 60.6 a battle over the last 200 (first 200: 46.1); 308 battles fought and kept, 6850 battles left unrun (about 9.4 h)
00:27:40 field exit=75 in 1529 s (halted, skips 60 over 200)
00:27:43 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/947
00:27:43 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:41:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:41:41 skip prep (already exit=0)
08:41:41 skip livematch (already exit=0)
08:41:41 start field
08:41:41 watching field: 5 stop rule(s)
08:41:43 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
08:42:41 progress field: 308/7158 (4%) battles, 0 failed, rel +0.09, aa +0.05
```
