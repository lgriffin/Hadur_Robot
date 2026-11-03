# Queue pc-team-momentum: progress

Updated 2026-11-03 03:52:22 PC time (03:52 UTC), runner pid 43904.

- `mtprep` done, exit 0 in 2 min
- `mtbb` done, exit 0 in 1.1 h
- `mtmo` running
- `mtff` pending
- `mtsum` pending
- `mtpr` pending

### mtbb

**1080 of 1080 battles** (100%), 0 failed. Running 1.1 h, 963 battles/h, about 0 min left (ends ~03:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.1 overall, first 100 17.4, last 100 8.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.9 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mtmo

**247 of 1080 battles** (23%), 0 failed. Running 22 min, 684 battles/h, about 1.2 h left (ends ~05:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.1 overall, first 100 17.6, last 100 20.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 247 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 20.3 a battle over the last 100 (first 100: 17.6) |

Stopping now would leave 833 battles unrun (about 1.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:21:43 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
02:21:43 start mtprep
02:21:46 progress pushed to origin claude/pc-team-momentum-progress (every 15 min)
02:23:24 mtprep exit=0 in 100 s
02:23:24 start mtbb
02:23:24 watching mtbb: 3 stop rule(s)
02:23:44 progress mtbb: 0/1080 (0%) battles, 0 failed
02:53:57 progress mtbb: 399/1080 (37%) battles, 784/h, ETA 52 min, 0 failed, skips 21.6/battle (last 100)
03:24:10 progress mtbb: 910/1080 (84%) battles, 899/h, ETA 11 min, 0 failed, skips 12.4/battle (last 100)
03:30:43 mtbb exit=0 in 4038 s
03:30:43 start mtmo
03:30:43 watching mtmo: 3 stop rule(s)
```
