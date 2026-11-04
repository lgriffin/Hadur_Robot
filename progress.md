# Queue pc-melee-far: progress

Updated 2026-11-04 17:02:18 PC time (17:02 UTC), runner pid 36348.

- `mfprep` done, exit 0 in 2 min
- `mfpilot` done, exit 0 in 1.1 h
- `mfcheck` done, exit 0 in 0 min
- `mfaa` running
- `mfbb` pending
- `mfy3` pending
- `mfy5` pending
- `mfread` pending
- `mfpr` pending

### mfpilot

**184 of 184 battles** (100%), 0 failed. Running 1.1 h, 169 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.1 overall, first 100 24.1, last 100 23.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mfaa

**46 of 276 battles** (17%), 0 failed. Running 8 min, 352 battles/h, about 39 min left (ends ~17:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.9 overall, first 46 27.9, last 46 27.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 46 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 230 battles unrun (about 39 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:46:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
15:46:53 start mfprep
15:46:56 progress pushed to origin claude/pc-melee-far-progress (every 15 min)
15:49:07 mfprep exit=0 in 133 s
15:49:07 start mfpilot
15:49:07 watching mfpilot: 2 stop rule(s)
15:49:55 progress mfpilot: 0/184 (0%) battles, 0 failed
16:20:04 progress mfpilot: 83/184 (45%) battles, 161/h, ETA 38 min, 0 failed, skips 24.7/battle (last 100)
16:50:13 progress mfpilot: 170/184 (92%) battles, 167/h, ETA 5 min, 0 failed, skips 24.4/battle (last 100)
16:54:26 mfpilot exit=0 in 3919 s
16:54:26 start mfcheck
16:54:28 mfcheck exit=0 in 1 s
16:54:28 start mfaa
16:54:28 watching mfaa: 2 stop rule(s)
```
