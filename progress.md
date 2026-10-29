# Queue pc-jaylexi-w1: progress

Updated 2026-10-29 22:00:31 PC time (22:00 UTC), runner pid 67776.

- `prep` done, exit 0 in 0 min
- `w1-J01` done, exit 0 in 3 min
- `w1-J02` done, exit 0 in 3 min
- `w1-KOM` done, exit 0 in 3 min
- `read` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### w1-KOM

**666 of 672 battles** (99%), 0 failed. Running 3 min, 12663 battles/h, about 0 min left (ends ~22:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 666 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 6 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:55:59 ALLDONE
21:56:59 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
21:56:59 skip prep (already exit=0)
21:56:59 skip w1-J01 (already exit=0)
21:56:59 skip w1-J02 (already exit=0)
21:56:59 start w1-KOM
21:56:59 watching w1-KOM: 3 stop rule(s)
21:57:02 progress pushed to origin claude/pc-jaylexi-w1-progress (every 15 min)
21:57:59 progress w1-KOM: 108/672 (16%) battles, 6420/h, ETA 5 min, 0 failed, skips 0.0/battle (last 100)
22:00:08 w1-KOM exit=0 in 189 s
22:00:08 start read
22:00:26 read exit=0 in 18 s
22:00:26 start pr
22:00:31 pr exit=0 in 5 s
22:00:31 ALLDONE
```
