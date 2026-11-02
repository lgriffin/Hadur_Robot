# Queue pc-team-angles: progress

Updated 2026-11-02 13:22:54 PC time (13:22 UTC), runner pid 44560.

- `anprep` done, exit 0 in 3 min
- `anbb` running
- `anhv` pending
- `anwy` pending
- `anmd` pending
- `anglob` pending
- `anpick` pending
- `angate` pending
- `angbb` pending
- `ansum` pending
- `anpr` pending

### anbb

**608 of 720 battles** (84%), 0 failed. Running 15 min, 2414 battles/h, about 3 min left (ends ~13:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 100 18.5, last 100 9.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 608 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 9.1 a battle over the last 100 (first 100: 18.5) |

Stopping now would leave 112 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:50:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
09:50:55 skip anprep (already exit=0)
09:50:55 start anbb
09:50:55 watching anbb: 3 stop rule(s)
09:50:57 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
09:51:55 progress anbb: 191/720 (27%) battles, 11372/h, ETA 3 min, 0 failed, skips 19.7/battle (last 100)
10:10:03 STOP anbb by rule fails 20: 24 failed of 362; 362 battles fought and kept, 358 battles left unrun (about 19 min)
10:10:04 anbb exit=75 in 1148 s (halted, fails 20)
10:10:04 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
13:07:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
13:07:48 skip anprep (already exit=0)
13:07:48 start anbb
13:07:48 watching anbb: 3 stop rule(s)
13:07:50 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
13:08:48 progress anbb: 342/720 (48%) battles, 20349/h, ETA 1 min, 0 failed, skips 20.1/battle (last 100)
```
