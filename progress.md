# Queue pc-sanaro-n06: progress

Updated 2026-10-31 19:15:54 PC time (19:15 UTC), runner pid 58568.

- `prep` done, exit 0 in 0 min
- `teach` running
- `distill-report` pending
- `arms` pending
- `live-S2` pending
- `live-HT` pending
- `live-HD` pending
- `live-HS` pending
- `read-live` pending
- `pr` pending

### teach

**130 of 130 battles** (100%), 0 failed. Running 15 min, 522 battles/h, about 0 min left (ends ~19:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.7 overall, first 100 33.9, last 100 32.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 32.4 a battle over the last 100 (first 100: 33.9) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:00:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
19:00:48 start prep
19:00:50 progress pushed to origin claude/pc-sanaro-n06-progress (every 15 min)
19:00:56 prep exit=0 in 8 s
19:00:56 start teach
19:00:56 watching teach: 3 stop rule(s)
19:01:48 progress teach: 0/130 (0%) battles, 0 failed
```
