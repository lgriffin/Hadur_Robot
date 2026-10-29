# Queue pc-team-path: progress

Updated 2026-10-29 07:31:18 PC time (07:31 UTC), runner pid 79320.

- `tpprep` done, exit 0 in 2 min
- `tpbb` done, exit 0 in 52 min
- `tpmp` running
- `tptn` pending
- `tptnbb` pending
- `tppick` pending
- `tpgate` pending
- `tpgbb` pending
- `tpsum` pending
- `tppr` pending

### tpbb

**920 of 920 battles** (100%), 0 failed. Running 52 min, 1067 battles/h, about 0 min left (ends ~07:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.0 overall, first 100 7.8, last 100 4.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 920 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.4 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tpmp

**288 of 920 battles** (31%), 0 failed. Running 22 min, 797 battles/h, about 48 min left (ends ~08:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.0 overall, first 100 8.1, last 100 8.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 288 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.9 a battle over the last 100 (first 100: 8.1) |

Stopping now would leave 632 battles unrun (about 48 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:15:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
06:15:42 start tpprep
06:15:45 progress pushed to origin claude/pc-team-path-progress (every 15 min)
06:17:52 tpprep exit=0 in 129 s
06:17:52 start tpbb
06:17:52 watching tpbb: 3 stop rule(s)
06:18:44 progress tpbb: 0/920 (0%) battles, 0 failed
06:48:58 progress tpbb: 470/920 (51%) battles, 907/h, ETA 30 min, 0 failed, skips 8.2/battle (last 100)
07:09:37 tpbb exit=0 in 3104 s
07:09:37 start tpmp
07:09:37 watching tpmp: 3 stop rule(s)
07:19:12 progress tpmp: 96/920 (10%) battles, 601/h, ETA 1.4 h, 0 failed, skips 7.9/battle (last 100)
```
