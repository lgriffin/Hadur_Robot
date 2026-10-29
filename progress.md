# Queue pc-team-dodge: progress

Updated 2026-10-29 20:30:53 PC time (20:30 UTC), runner pid 64500.

- `tdprep` done, exit 0 in 2 min
- `tdbb` done, exit 0 in 1.2 h
- `tddg` running
- `tdglob` pending
- `tdpick` pending
- `tdgate` pending
- `tdgbb` pending
- `tdsum` pending
- `tdpr` pending

### tdbb

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 899 battles/h, about 0 min left (ends ~20:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 9.2, last 100 7.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 7.6 a battle over the last 100 (first 100: 9.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tddg

**0 of 1104 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:15:11 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
19:15:11 start tdprep
19:15:14 progress pushed to origin claude/pc-team-dodge-progress (every 15 min)
19:16:53 tdprep exit=0 in 101 s
19:16:53 start tdbb
19:16:53 watching tdbb: 3 stop rule(s)
19:17:13 progress tdbb: 0/1104 (0%) battles, 0 failed
19:47:30 progress tdbb: 368/1104 (33%) battles, 721/h, ETA 1.0 h, 0 failed, skips 12.6/battle (last 100)
20:17:47 progress tdbb: 850/1104 (77%) battles, 837/h, ETA 18 min, 0 failed, skips 10.7/battle (last 100)
20:30:36 tdbb exit=0 in 4423 s
20:30:36 start tddg
20:30:36 watching tddg: 3 stop rule(s)
```
