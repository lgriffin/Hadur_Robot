# Queue pc-team-aim: progress

Updated 2026-11-03 15:33:32 PC time (15:33 UTC), runner pid 1904.

- `aiprep` done, exit 0 in 2 min
- `aibb1` done, exit 0 in 6 min
- `aiam1` done, exit 0 in 6 min
- `aipilot` failed, exit 3 in 0 min
- `aibb` skipped
- `aiam` skipped
- `aiscr` skipped
- `aipick` skipped
- `aigate` skipped
- `aigbb` skipped
- `aisum` skipped
- `aipr` skipped

### aibb1

**78 of 78 battles** (100%), 0 failed. Running 6 min, 829 battles/h, about 0 min left (ends ~15:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.5 overall, first 78 18.5, last 78 18.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 78 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 78 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### aiam1

**78 of 78 battles** (100%), 0 failed. Running 6 min, 828 battles/h, about 0 min left (ends ~15:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 78 18.3, last 78 18.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 78 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 78 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:27:47 aibb1 exit=0 in 338 s
15:27:47 start aiam1
15:27:47 watching aiam1: 3 stop rule(s)
15:33:26 aiam1 exit=0 in 339 s
15:33:26 start aipilot
15:33:32 aipilot exit=3 in 6 s
15:33:32 skip aibb (after aipilot, which has not finished exit=0)
15:33:32 skip aiam (after aibb, which has not finished exit=0)
15:33:32 skip aiscr (after aiam, which has not finished exit=0)
15:33:32 skip aipick (after aiscr, which has not finished exit=0)
15:33:32 skip aigate (after aipick, which has not finished exit=0)
15:33:32 skip aigbb (after aigate, which has not finished exit=0)
15:33:32 skip aisum (after aigbb, which has not finished exit=0)
15:33:32 skip aipr (after aisum, which has not finished exit=0)
15:33:32 ALLDONE
```
