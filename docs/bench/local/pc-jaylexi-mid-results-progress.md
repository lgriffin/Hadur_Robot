# Queue pc-jaylexi-mid: progress

Updated 2026-11-03 18:16:57 PC time (18:16 UTC), runner pid 18456.

- `prep` done, exit 0 in 0 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**3177 of 3200 battles** (99%), 0 failed. Running 12 min, 16000 battles/h, about 0 min left (ends ~18:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 794 | 0 | 88.97 | - | - | - | 0.0 |
| aa | 795 | 0 | 88.97 | +0.00 (80 robots) | ±0.12 | -0.18 .. +0.19 | 0.0 |
| p1 | 795 | 0 | 88.89 | -0.08 (80 robots) | ±0.22 | -0.42 .. +0.26 | 0.0 |
| p4 | 793 | 0 | 88.77 | -0.20 (80 robots) | ±0.26 | -0.60 .. +0.20 | 0.0 |
A/A: aa - c +0.00 pts over 80 robots; 1% band ±0.41 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3177 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.00 pts over 80 robots, stop band ±0.48 |
| `futility p1,p4 below 0 after 20%` | finish | ok | p1 -0.08, best case +0.26; p4 -0.20, best case +0.20 pts vs bar +0.00 |

Stopping now would leave 23 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:04:52 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:04:52 start prep
18:04:55 progress pushed to origin claude/pc-jaylexi-mid-progress (every 15 min)
18:05:01 prep exit=0 in 8 s
18:05:01 start confirm
18:05:01 watching confirm: 6 stop rule(s)
18:05:53 progress confirm: 192/3200 (6%) battles, 13444/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100), aa -0.16, p1 +0.08, p4 -0.52
```
