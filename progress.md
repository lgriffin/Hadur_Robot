# Queue pc-team-angles: progress

Updated 2026-11-02 08:02:55 PC time (08:02 UTC), runner pid 15852.

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

**80 of 736 battles** (11%), 0 failed. Running 12 min, 389 battles/h, about 1.7 h left (ends ~09:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.6 overall, first 80 17.6, last 80 17.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 80 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 80 of 100 battles to read |

Stopping now would leave 656 battles unrun (about 1.7 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:47:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
07:47:47 start anprep
07:47:49 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
07:50:34 anprep exit=0 in 167 s
07:50:34 start anbb
07:50:34 watching anbb: 3 stop rule(s)
07:50:48 progress anbb: 0/736 (0%) battles, 0 failed
```
