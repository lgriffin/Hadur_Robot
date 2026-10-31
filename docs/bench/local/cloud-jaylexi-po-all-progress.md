# Queue cloud-jaylexi-po-all: progress

Updated 2026-10-31 19:13:21 PC time (19:13 UTC), runner pid 320.

- `prep` done, exit 0 in 2 min
- `harvest` done, exit 0 in 1.5 h
- `build` done, exit 0 in 18 min
- `G2` done, exit 0 in 26 min
- `P112` done, exit 0 in 25 min
- `PALL` done, exit 0 in 25 min
- `read` done, exit 0 in 0 min

### G2

**672 of 672 battles** (100%), 0 failed. Running 26 min, 1534 battles/h, about 0 min left (ends ~18:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.3 overall, first 100 0.3, last 100 0.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.2 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### P112

**672 of 672 battles** (100%), 0 failed. Running 25 min, 1607 battles/h, about 0 min left (ends ~18:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.2, last 100 0.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.3 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### PALL

**672 of 672 battles** (100%), 0 failed. Running 25 min, 1624 battles/h, about 0 min left (ends ~19:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.2, last 100 0.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.2 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:57:08 start G2
17:57:08 watching G2: 3 stop rule(s)
17:58:08 progress G2: 5/672 (1%) battles, 300/h, ETA 2.2 h, 0 failed, skips 0.0/battle (last 100)
18:23:26 G2 exit=0 in 1577 s
18:23:26 start P112
18:23:26 watching P112: 3 stop rule(s)
18:28:10 progress P112: 63/672 (9%) battles, 798/h, ETA 46 min, 0 failed, skips 0.2/battle (last 100)
18:48:31 P112 exit=0 in 1505 s
18:48:31 start PALL
18:48:31 watching PALL: 3 stop rule(s)
18:58:11 progress PALL: 189/672 (28%) battles, 1173/h, ETA 25 min, 0 failed, skips 0.2/battle (last 100)
19:13:21 PALL exit=0 in 1489 s
19:13:21 start read
19:13:21 read exit=0 in 0 s
19:13:21 ALLDONE
```
