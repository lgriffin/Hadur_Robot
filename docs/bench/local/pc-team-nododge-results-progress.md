# Queue pc-team-nododge: progress

Updated 2026-10-30 17:18:25 PC time (17:18 UTC), runner pid 78140.

- `ndprep` done, exit 0 in 2 min
- `ndbb` done, exit 0 in 8 min
- `ndxd` running
- `ndsum` pending
- `ndpr` pending

### ndbb

**144 of 144 battles** (100%), 0 failed. Running 8 min, 1072 battles/h, about 0 min left (ends ~17:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 14.1, last 100 7.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 144 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 7.5 a battle over the last 100 (first 100: 14.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ndxd

**135 of 144 battles** (94%), 0 failed. Running 7 min, 1124 battles/h, about 0 min left (ends ~17:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.5 overall, first 100 13.5, last 100 10.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 135 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 10.8 a battle over the last 100 (first 100: 13.5) |

Stopping now would leave 9 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:01:16 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
17:01:16 start ndprep
17:01:19 progress pushed to origin claude/pc-team-nododge-progress (every 15 min)
17:03:09 ndprep exit=0 in 112 s
17:03:09 start ndbb
17:03:09 watching ndbb: 3 stop rule(s)
17:03:17 progress ndbb: 0/144 (0%) battles, 0 failed
17:11:13 ndbb exit=0 in 483 s
17:11:13 start ndxd
17:11:13 watching ndxd: 3 stop rule(s)
```
