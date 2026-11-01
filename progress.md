# Queue pc-sanaro-n07: progress

Updated 2026-11-01 03:49:45 PC time (03:49 UTC), runner pid 69368.

- `prep` done, exit 0 in 0 min
- `teach` halted, exit 75 in 10 min, HALTED by skips 60 over 100: 82.9 a battle over the last 100 (first 100: 75.1)
- `distill-report` pending
- `arms` pending
- `live-S2` pending
- `live-HS` pending
- `live-HL` pending
- `live-HC` pending
- `read-live` pending
- `pr` pending

### teach

**111 of 129 battles** (86%), 0 failed. Running 10 min, 684 battles/h, about 2 min left (ends ~03:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 77.4 overall, first 100 75.1, last 100 82.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 111 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 100` | halt | TRIPPED | 82.9 a battle over the last 100 (first 100: 75.1) |

Stopping now would leave 18 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
03:39:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
03:39:39 start prep
03:39:41 progress pushed to origin claude/pc-sanaro-n07-progress (every 15 min)
03:40:01 prep exit=0 in 21 s
03:40:01 start teach
03:40:01 watching teach: 3 stop rule(s)
03:40:40 progress teach: 3/129 (2%) battles, 275/h, ETA 28 min, 0 failed, skips 17.7/battle (last 100)
03:49:44 STOP teach by rule skips 60 over 100: 82.9 a battle over the last 100 (first 100: 75.1); 111 battles fought and kept, 18 battles left unrun (about 2 min)
03:49:45 teach exit=75 in 583 s (halted, skips 60 over 100)
```
