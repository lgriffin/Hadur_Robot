# Queue pc-melee-far: progress

Updated 2026-11-04 16:32:08 PC time (16:32 UTC), runner pid 36348.

- `mfprep` done, exit 0 in 2 min
- `mfpilot` running
- `mfcheck` pending
- `mfaa` pending
- `mfbb` pending
- `mfy3` pending
- `mfy5` pending
- `mfread` pending
- `mfpr` pending

### mfpilot

**108 of 184 battles** (59%), 0 failed. Running 43 min, 151 battles/h, about 30 min left (ends ~17:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.1 overall, first 100 24.1, last 100 24.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 108 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 76 battles unrun (about 30 min); every battle already fought is kept and a rerun resumes from it.

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
```
