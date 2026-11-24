# Queue pc-team-pack4: progress

Updated 2026-11-24 10:38:00 PC time (10:38 UTC), runner pid 53788.

- `tkprep` done, exit 0 in 2 min
- `tkpp4` done, exit 0 in 3 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 9 min
- `tkp4` running
- `tkgate` pending
- `tkpr` pending

### tkpp4

**64 of 64 battles** (100%), 0 failed. Running 3 min, 1142 battles/h, about 0 min left (ends ~10:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.1 overall, first 64 15.1, last 64 15.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 64 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 64 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkbb

**192 of 192 battles** (100%), 0 failed. Running 9 min, 1260 battles/h, about 0 min left (ends ~10:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 100 18.9, last 100 10.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 192 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkp4

**0 of 192 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 192 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:22:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
10:22:53 start tkprep
10:22:56 progress pushed to origin claude/pc-team-pack4-progress (every 15 min)
10:25:08 tkprep exit=0 in 134 s
10:25:08 start tkpp4
10:25:08 watching tkpp4: 3 stop rule(s)
10:25:54 progress tkpp4: 3/64 (5%) battles, 233/h, ETA 16 min, 0 failed, skips 14.3/battle (last 100)
10:28:30 tkpp4 exit=0 in 201 s
10:28:30 start tkpilot
10:28:30 tkpilot exit=0 in 0 s
10:28:30 start tkbb
10:28:30 watching tkbb: 3 stop rule(s)
10:37:39 tkbb exit=0 in 548 s
10:37:39 start tkp4
10:37:39 watching tkp4: 3 stop rule(s)
```
