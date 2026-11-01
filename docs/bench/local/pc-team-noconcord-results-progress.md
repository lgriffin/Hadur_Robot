# Queue pc-team-noconcord: progress

Updated 2026-11-01 09:01:41 PC time (09:01 UTC), runner pid 44600.

- `ncprep` done, exit 0 in 2 min
- `ncbb` done, exit 0 in 18 min
- `ncxc` running
- `ncsum` pending
- `ncpr` pending

### ncxc

**190 of 192 battles** (99%), 0 failed. Running 12 min, 943 battles/h, about 0 min left (ends ~09:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.1 overall, first 100 11.6, last 100 10.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 190 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 10.5 a battle over the last 100 (first 100: 11.6) |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:16:02 start ncbb
08:16:02 watching ncbb: 3 stop rule(s)
08:16:19 progress ncbb: 0/192 (0%) battles, 0 failed
08:34:33 ncbb exit=0 in 1110 s
08:34:33 start ncxc
08:34:33 watching ncxc: 3 stop rule(s)
08:41:00 ncxc exit=130 in 386 s (stopped)
08:41:00 stopped; rerun to resume from the interrupted steps
08:49:36 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:49:36 skip ncprep (already exit=0)
08:49:36 skip ncbb (already exit=0)
08:49:36 start ncxc
08:49:36 watching ncxc: 3 stop rule(s)
08:49:38 progress pushed to origin claude/pc-team-noconcord-progress (every 15 min)
08:50:36 progress ncxc: 56/192 (29%) battles, 3333/h, ETA 2 min, 0 failed, skips 11.8/battle (last 100)
```
