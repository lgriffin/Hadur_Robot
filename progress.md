# Queue pc-melee-surf: progress

Updated 2026-10-30 16:53:59 PC time (16:53 UTC), runner pid 30060.

- `msprep` done, exit 0 in 5 min
- `msaa` done, exit 0 in 27 min
- `msbb` done, exit 0 in 25 min
- `msms` running
- `msread` pending
- `mspr` pending

### msaa

**276 of 276 battles** (100%), 0 failed. Running 27 min, 602 battles/h, about 0 min left (ends ~16:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 86.9 overall, first 100 98.4, last 100 73.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### msbb

**276 of 276 battles** (100%), 0 failed. Running 25 min, 670 battles/h, about 0 min left (ends ~16:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 79.9 overall, first 100 66.2, last 100 93.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### msms

**192 of 276 battles** (70%), 0 failed. Running 19 min, 616 battles/h, about 8 min left (ends ~17:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 55.3 overall, first 100 47.1, last 100 62.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 84 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:38:23 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:38:24 start msprep
15:38:28 progress pushed to origin claude/pc-melee-surf-progress (every 15 min)
15:43:04 msprep exit=0 in 280 s
15:43:05 start msaa
15:43:05 watching msaa: 2 stop rule(s)
15:43:25 progress msaa: 0/276 (0%) battles, 0 failed
16:10:34 msaa exit=0 in 1649 s
16:10:34 start msbb
16:10:34 watching msbb: 2 stop rule(s)
16:13:40 progress msbb: 30/276 (11%) battles, 581/h, ETA 25 min, 0 failed, skips 71.6/battle (last 100)
16:35:17 msbb exit=0 in 1482 s
16:35:17 start msms
16:35:17 watching msms: 2 stop rule(s)
16:43:54 progress msms: 96/276 (35%) battles, 668/h, ETA 16 min, 0 failed, skips 48.3/battle (last 100)
```
