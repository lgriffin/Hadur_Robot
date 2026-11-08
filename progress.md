# Queue pc-melee-three: progress

Updated 2026-11-08 18:18:43 PC time (18:18 UTC), runner pid 19668.

- `m3prep` done, exit 0 in 3 min
- `m3pilot` running
- `m3check` pending
- `m3aa` pending
- `m3bb` pending
- `m3th` pending
- `m3ts` pending
- `m3read` pending
- `m3pr` pending

### m3pilot

**156 of 184 battles** (85%), 0 failed. Running 57 min, 164 battles/h, about 10 min left (ends ~18:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.7 overall, first 100 23.7, last 100 25.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 156 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 28 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:18:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
17:18:25 start m3prep
17:18:28 progress pushed to origin claude/pc-melee-three-progress (every 15 min)
17:21:49 m3prep exit=0 in 204 s
17:21:49 start m3pilot
17:21:49 watching m3pilot: 2 stop rule(s)
17:22:27 progress m3pilot: 0/184 (0%) battles, 0 failed
17:52:36 progress m3pilot: 83/184 (45%) battles, 162/h, ETA 37 min, 0 failed, skips 24.3/battle (last 100)
```
