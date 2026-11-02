# Queue pc-team-mirror: progress

Updated 2026-11-02 00:19:20 PC time (00:19 UTC), runner pid 5104.

- `mrprep` done, exit 0 in 1 min
- `mrogi` running
- `mrhad` pending
- `mrread` pending
- `mrpr` pending

### mrogi

**519 of 540 battles** (96%), 24 failed. Running 30 min, 1031 battles/h, about 1 min left (ends ~00:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.5 overall, first 100 1.3, last 100 1.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | TRIPPED | 24 failed of 519 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 1.5 a battle over the last 200 (first 200: 1.3) |

Stopping now would leave 21 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:10:42 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
23:11:26 mrprep exit=0 in 45 s
23:11:26 start mrogi
23:11:26 watching mrogi: 3 stop rule(s)
23:11:40 progress mrogi: 0/540 (0%) battles, 0 failed
23:39:52 STOP mrogi by rule fails 20: 24 failed of 267; 267 battles fought and kept, 273 battles left unrun (about 29 min)
23:39:52 mrogi exit=75 in 1706 s (halted, fails 20)
23:39:52 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
23:49:07 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
23:49:07 skip mrprep (already exit=0)
23:49:07 start mrogi
23:49:07 watching mrogi: 3 stop rule(s), shown only
23:49:09 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
23:50:08 progress mrogi: 243/540 (45%) battles, 14456/h, ETA 1 min, 3 failed, skips 1.4/battle (last 100)
23:51:08 stop rule fails 20 would trip on mrogi (24 failed of 267); not acted on
```
