# Queue pc-jaylexi-po: progress

Updated 2026-10-31 13:50:52 PC time (13:50 UTC), runner pid 71116.

- `prep` done, exit 0 in 0 min
- `harvest` done, exit 0 in 2 min
- `build` done, exit 0 in 2 min
- `G` done, exit 0 in 3 min
- `PO300` done, exit 0 in 3 min
- `PO2000` done, exit 0 in 3 min
- `read` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**672 of 672 battles** (100%), 0 failed. Running 3 min, 12376 battles/h, about 0 min left (ends ~13:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:40:54 start G
13:40:54 watching G: 3 stop rule(s)
13:41:11 progress G: 0/672 (0%) battles, 0 failed
13:44:09 G exit=0 in 195 s
13:44:09 start PO300
13:44:09 watching PO300: 3 stop rule(s)
13:47:25 PO300 exit=0 in 195 s
13:47:25 start PO2000
13:47:25 watching PO2000: 3 stop rule(s)
13:50:40 PO2000 exit=0 in 195 s
13:50:40 start read
13:50:47 read exit=0 in 6 s
13:50:47 start pr
13:50:52 pr exit=0 in 5 s
13:50:52 ALLDONE
```
