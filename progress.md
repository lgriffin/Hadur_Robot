# Queue pc-deise-e10: progress

Updated 2026-10-31 17:03:31 PC time (17:03 UTC), runner pid 65080.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 18 min
- `live-PL400` done, exit 0 in 19 min
- `live-PN` running
- `live-PNS` pending
- `live-PNS6` pending
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 18 min, 937 battles/h, about 0 min left (ends ~16:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PL400

**276 of 276 battles** (100%), 0 failed. Running 19 min, 884 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.3, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PN

**120 of 276 battles** (43%), 0 failed. Running 9 min, 841 battles/h, about 11 min left (ends ~17:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.3 overall, first 100 0.3, last 100 0.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 120 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.3 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 156 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:18:06 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
16:18:06 start prep
16:18:09 progress pushed to origin claude/pc-deise-e10-progress (every 15 min)
16:18:33 prep exit=0 in 26 s
16:18:33 start live-D
16:18:33 watching live-D: 3 stop rule(s)
16:19:07 progress live-D: 6/276 (2%) battles, 630/h, ETA 26 min, 0 failed, skips 0.0/battle (last 100)
16:36:14 live-D exit=0 in 1060 s
16:36:14 start live-PL400
16:36:14 watching live-PL400: 3 stop rule(s)
16:49:24 progress live-PL400: 174/276 (63%) battles, 793/h, ETA 8 min, 0 failed, skips 0.2/battle (last 100)
16:54:57 live-PL400 exit=0 in 1123 s
16:54:57 start live-PN
16:54:57 watching live-PN: 3 stop rule(s)
```
