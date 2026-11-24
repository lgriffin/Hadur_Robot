# Queue pc-team-nmdodge: progress

Updated 2026-11-23 16:09:57 PC time (16:09 UTC), runner pid 67136.

- `tnprep` done, exit 0 in 2 min
- `tnbb` done, exit 0 in 5 min
- `tnnd` running
- `tngate` skipped
- `tnpr` skipped

### tnbb

**96 of 48 battles** (200%), 0 failed. Running 5 min, 1092 battles/h, about -3 min left (ends ~16:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.8 overall, first 96 7.8, last 96 7.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave -48 battles unrun (about -3 min); every battle already fought is kept and a rerun resumes from it.

### tnnd

**86 of 48 battles** (179%), 0 failed. Running 6 min, 923 battles/h, about -2 min left (ends ~16:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.5 overall, first 86 17.5, last 86 17.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 86 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 86 of 200 battles to read |

Stopping now would leave -38 battles unrun (about -2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:38:11 skip tnbb (after tnprep, which has not finished exit=0)
12:38:11 skip tnnd (after tnbb, which has not finished exit=0)
12:38:11 skip tngate (after tnnd, which has not finished exit=0)
12:38:11 skip tnpr (after tngate, which has not finished exit=0)
12:38:11 ALLDONE
15:56:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
15:56:50 start tnprep
15:56:52 progress pushed to origin claude/pc-team-nmdodge-progress (every 15 min)
15:59:05 tnprep exit=0 in 135 s
15:59:05 start tnbb
15:59:05 watching tnbb: 3 stop rule(s)
15:59:52 progress tnbb: 12/48 (25%) battles, 933/h, ETA 2 min, 0 failed, skips 4.9/battle (last 100)
16:04:22 tnbb exit=0 in 316 s
16:04:22 start tnnd
16:04:22 watching tnnd: 3 stop rule(s)
```
