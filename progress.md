# Queue pc-deise-e06: progress

Updated 2026-10-29 22:35:31 PC time (22:35 UTC), runner pid 55780.

- `prep` done, exit 0 in 0 min
- `live-D` running
- `live-FA` pending
- `live-FAP` pending
- `live-FAW` pending
- `live-FAPW` pending
- `live-PW` pending
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**240 of 276 battles** (87%), 0 failed. Running 15 min, 978 battles/h, about 2 min left (ends ~22:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 36 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:20:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:20:24 start prep
22:20:27 progress pushed to origin claude/pc-deise-e06-progress (every 15 min)
22:20:48 prep exit=0 in 23 s
22:20:48 start live-D
22:20:48 watching live-D: 3 stop rule(s)
22:21:24 progress live-D: 6/276 (2%) battles, 594/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100)
```
