# Queue pc-jaylexi-w1: progress

Updated 2026-10-29 18:55:59 PC time (18:55 UTC), runner pid 20984.

- `prep` done, exit 0 in 0 min
- `w1-J01` done, exit 0 in 3 min
- `w1-J02` done, exit 0 in 3 min
- `w1-KOM` failed, exit 1 in 3 min
- `read` skipped
- `pr` skipped

### w1-J01

**672 of 672 battles** (100%), 0 failed. Running 3 min, 12188 battles/h, about 0 min left (ends ~18:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### w1-J02

**672 of 672 battles** (100%), 0 failed. Running 3 min, 12368 battles/h, about 0 min left (ends ~18:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### w1-KOM

**672 of 672 battles** (100%), 6 failed. Running 3 min, 12991 battles/h, about 0 min left (ends ~18:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 6 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:46:16 start w1-J01
18:46:16 watching w1-J01: 3 stop rule(s)
18:46:17 progress pushed to origin claude/pc-jaylexi-w1-progress (every 15 min)
18:47:15 progress w1-J01: 114/672 (17%) battles, 7011/h, ETA 5 min, 0 failed, skips 0.0/battle (last 100)
18:49:35 w1-J01 exit=0 in 198 s
18:49:35 start w1-J02
18:49:35 watching w1-J02: 3 stop rule(s)
18:52:51 w1-J02 exit=0 in 195 s
18:52:51 start w1-KOM
18:52:51 watching w1-KOM: 3 stop rule(s)
18:55:57 w1-KOM exit=1 in 186 s
18:55:59 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/433
18:55:59 skip read (after w1-KOM, which has not finished exit=0)
18:55:59 skip pr (after read, which has not finished exit=0)
18:55:59 ALLDONE
```
