# Queue pc-team-aim: progress

Updated 2026-11-03 15:32:28 PC time (15:32 UTC), runner pid 1904.

- `aiprep` done, exit 0 in 2 min
- `aibb1` done, exit 0 in 6 min
- `aiam1` running
- `aipilot` pending
- `aibb` pending
- `aiam` pending
- `aiscr` pending
- `aipick` pending
- `aigate` pending
- `aigbb` pending
- `aisum` pending
- `aipr` pending

### aibb1

**78 of 78 battles** (100%), 0 failed. Running 6 min, 829 battles/h, about 0 min left (ends ~15:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.5 overall, first 78 18.5, last 78 18.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 78 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 78 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### aiam1

**65 of 78 battles** (83%), 0 failed. Running 5 min, 833 battles/h, about 1 min left (ends ~15:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.6 overall, first 65 18.6, last 65 18.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 65 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 65 of 100 battles to read |

Stopping now would leave 13 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:20:22 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
15:20:22 start aiprep
15:20:25 progress pushed to origin claude/pc-team-aim-progress (every 15 min)
15:22:08 aiprep exit=0 in 105 s
15:22:08 start aibb1
15:22:08 watching aibb1: 3 stop rule(s)
15:22:23 progress aibb1: 0/78 (0%) battles, 0 failed
15:27:47 aibb1 exit=0 in 338 s
15:27:47 start aiam1
15:27:47 watching aiam1: 3 stop rule(s)
```
