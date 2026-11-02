# Queue pc-team-angles: progress

Updated 2026-11-02 08:16:09 PC time (08:16 UTC), runner pid 15852.

- `anprep` done, exit 0 in 3 min
- `anbb` interrupted, exit 130 in 26 min
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

**191 of 736 battles** (26%), 0 failed. Running 26 min, 448 battles/h, about 1.2 h left (ends ~09:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.0 overall, first 100 18.9, last 100 19.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 191 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 19.7 a battle over the last 100 (first 100: 18.9) |

Stopping now would leave 545 battles unrun (about 1.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:47:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
07:47:47 start anprep
07:47:49 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
07:50:34 anprep exit=0 in 167 s
07:50:34 start anbb
07:50:34 watching anbb: 3 stop rule(s)
07:50:48 progress anbb: 0/736 (0%) battles, 0 failed
08:16:09 anbb exit=130 in 1534 s (stopped)
08:16:09 stopped; rerun to resume from the interrupted steps
```
