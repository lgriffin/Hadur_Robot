# Queue pc-jaylexi-po: progress

Updated 2026-10-31 13:50:16 PC time (13:50 UTC), runner pid 71116.

- `prep` done, exit 0 in 0 min
- `harvest` done, exit 0 in 2 min
- `build` done, exit 0 in 2 min
- `G` done, exit 0 in 3 min
- `PO300` done, exit 0 in 3 min
- `PO2000` running
- `read` skipped
- `pr` skipped

### G

**672 of 672 battles** (100%), 0 failed. Running 3 min, 12402 battles/h, about 0 min left (ends ~13:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### PO300

**672 of 672 battles** (100%), 0 failed. Running 3 min, 12383 battles/h, about 0 min left (ends ~13:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### PO2000

**602 of 672 battles** (90%), 0 failed. Running 3 min, 12634 battles/h, about 0 min left (ends ~13:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 602 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 70 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:39:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
13:39:10 skip prep (already exit=0)
13:39:10 skip harvest (already exit=0)
13:39:10 start build
13:39:12 progress pushed to origin claude/pc-jaylexi-po-progress (every 15 min)
13:40:54 build exit=0 in 104 s
13:40:54 start G
13:40:54 watching G: 3 stop rule(s)
13:41:11 progress G: 0/672 (0%) battles, 0 failed
13:44:09 G exit=0 in 195 s
13:44:09 start PO300
13:44:09 watching PO300: 3 stop rule(s)
13:47:25 PO300 exit=0 in 195 s
13:47:25 start PO2000
13:47:25 watching PO2000: 3 stop rule(s)
```
