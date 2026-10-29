# Queue pc-deise-e06: progress

Updated 2026-10-29 23:05:44 PC time (23:05 UTC), runner pid 55780.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-FA` done, exit 0 in 17 min
- `live-FAP` running
- `live-FAW` pending
- `live-FAPW` pending
- `live-PW` pending
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 985 battles/h, about 0 min left (ends ~22:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FA

**276 of 276 battles** (100%), 0 failed. Running 17 min, 963 battles/h, about 0 min left (ends ~22:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FAP

**150 of 276 battles** (54%), 0 failed. Running 11 min, 822 battles/h, about 9 min left (ends ~23:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.2, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 150 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 126 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:20:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:20:24 start prep
22:20:27 progress pushed to origin claude/pc-deise-e06-progress (every 15 min)
22:20:48 prep exit=0 in 23 s
22:20:48 start live-D
22:20:48 watching live-D: 3 stop rule(s)
22:21:24 progress live-D: 6/276 (2%) battles, 594/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100)
22:37:36 live-D exit=0 in 1008 s
22:37:36 start live-FA
22:37:36 watching live-FA: 3 stop rule(s)
22:51:38 progress live-FA: 222/276 (80%) battles, 949/h, ETA 3 min, 0 failed, skips 0.0/battle (last 100)
22:54:48 live-FA exit=0 in 1031 s
22:54:48 start live-FAP
22:54:48 watching live-FAP: 3 stop rule(s)
```
