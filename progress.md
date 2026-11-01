# Queue pc-team-noconcord: progress

Updated 2026-11-01 08:41:00 PC time (08:41 UTC), runner pid 86380.

- `ncprep` done, exit 0 in 2 min
- `ncbb` done, exit 0 in 18 min
- `ncxc` interrupted, exit 130 in 6 min
- `ncsum` pending
- `ncpr` pending

### ncbb

**192 of 192 battles** (100%), 0 failed. Running 19 min, 622 battles/h, about 0 min left (ends ~08:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.6 overall, first 100 13.8, last 100 11.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 11.5 a battle over the last 100 (first 100: 13.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ncxc

**56 of 192 battles** (29%), 0 failed. Running 6 min, 521 battles/h, about 16 min left (ends ~08:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 56 11.8, last 56 11.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 56 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 56 of 100 battles to read |

Stopping now would leave 136 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:14:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:14:18 start ncprep
08:14:20 progress pushed to origin claude/pc-team-noconcord-progress (every 15 min)
08:16:02 ncprep exit=0 in 104 s
08:16:02 start ncbb
08:16:02 watching ncbb: 3 stop rule(s)
08:16:19 progress ncbb: 0/192 (0%) battles, 0 failed
08:34:33 ncbb exit=0 in 1110 s
08:34:33 start ncxc
08:34:33 watching ncxc: 3 stop rule(s)
08:41:00 ncxc exit=130 in 386 s (stopped)
08:41:00 stopped; rerun to resume from the interrupted steps
```
