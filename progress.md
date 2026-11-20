# Queue pc-rc-confirm: progress

Updated 2026-11-20 09:01:55 PC time (09:01 UTC), runner pid 81432.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` halted, exit 75 in 20 min, HALTED by skips 60 over 200: 61.4 a battle over the last 200 (first 200: 59.2)
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### field

**521 of 7158 battles** (7%), 0 failed, 308 read back from an earlier run. Running 20 min, 632 battles/h, about 10.5 h left (ends ~19:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 60.2 overall, first 100 62.2, last 100 57.1; engine disables 159.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 176 | 0 | 93.77 | -0.23 (162 robots) | ±0.54 | -1.05 .. +0.59 | 59.4 |
| c | 173 | 0 | 94.03 | - | - | - | 56.3 |
| aa | 172 | 0 | 93.65 | -0.22 (163 robots) | ±0.51 | -1.00 .. +0.57 | 51.8 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c -0.22 pts over 163 robots; 1% band ±0.90 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 521 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | TRIPPED | 61.4 a battle over the last 200 (first 200: 59.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 7%) |

Stopping now would leave 6637 battles unrun (about 10.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
09:01:54 STOP field by rule skips 60 over 200: 61.4 a battle over the last 200 (first 200: 59.2); 521 battles fought and kept, 6637 battles left unrun (about 10.5 h)
09:01:55 field exit=75 in 1213 s (halted, skips 60 over 200)
```
