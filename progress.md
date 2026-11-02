# Queue pc-team-angles: progress

Updated 2026-11-02 10:10:04 PC time (10:10 UTC), runner pid 40024.

- `anprep` done, exit 0 in 3 min
- `anbb` halted, exit 75 in 19 min, HALTED by fails 20: 24 failed of 362
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

**362 of 720 battles** (50%), 24 failed. Running 19 min, 1134 battles/h, about 19 min left (ends ~10:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.5 overall, first 100 18.4, last 100 20.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | TRIPPED | 24 failed of 362 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 20.7 a battle over the last 100 (first 100: 18.4) |

Stopping now would leave 358 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:47:49 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
07:50:34 anprep exit=0 in 167 s
07:50:34 start anbb
07:50:34 watching anbb: 3 stop rule(s)
07:50:48 progress anbb: 0/736 (0%) battles, 0 failed
08:16:09 anbb exit=130 in 1534 s (stopped)
08:16:09 stopped; rerun to resume from the interrupted steps
09:50:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
09:50:55 skip anprep (already exit=0)
09:50:55 start anbb
09:50:55 watching anbb: 3 stop rule(s)
09:50:57 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
09:51:55 progress anbb: 191/720 (27%) battles, 11372/h, ETA 3 min, 0 failed, skips 19.7/battle (last 100)
10:10:03 STOP anbb by rule fails 20: 24 failed of 362; 362 battles fought and kept, 358 battles left unrun (about 19 min)
10:10:04 anbb exit=75 in 1148 s (halted, fails 20)
```
