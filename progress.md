# Queue pc-deise-e10: progress

Updated 2026-10-31 17:48:54 PC time (17:48 UTC), runner pid 65080.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 18 min
- `live-PL400` done, exit 0 in 19 min
- `live-PN` done, exit 0 in 19 min
- `live-PNS` done, exit 0 in 19 min
- `live-PNS6` running
- `live-MIR` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 18 min, 937 battles/h, about 0 min left (ends ~16:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PL400

**276 of 276 battles** (100%), 0 failed. Running 19 min, 884 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.3, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PN

**276 of 276 battles** (100%), 0 failed. Running 19 min, 853 battles/h, about 0 min left (ends ~17:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.3, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PNS

**276 of 276 battles** (100%), 0 failed. Running 19 min, 860 battles/h, about 0 min left (ends ~17:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.1, last 100 0.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.4 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PNS6

**186 of 276 battles** (67%), 0 failed. Running 15 min, 730 battles/h, about 7 min left (ends ~17:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.6 overall, first 100 1.1, last 100 2.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 186 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 2.0 a battle over the last 100 (first 100: 1.1) |

Stopping now would leave 90 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:19:07 progress live-D: 6/276 (2%) battles, 630/h, ETA 26 min, 0 failed, skips 0.0/battle (last 100)
16:36:14 live-D exit=0 in 1060 s
16:36:14 start live-PL400
16:36:14 watching live-PL400: 3 stop rule(s)
16:49:24 progress live-PL400: 174/276 (63%) battles, 793/h, ETA 8 min, 0 failed, skips 0.2/battle (last 100)
16:54:57 live-PL400 exit=0 in 1123 s
16:54:57 start live-PN
16:54:57 watching live-PN: 3 stop rule(s)
17:14:22 live-PN exit=0 in 1165 s
17:14:22 start live-PNS
17:14:22 watching live-PNS: 3 stop rule(s)
17:19:39 progress live-PNS: 72/276 (26%) battles, 818/h, ETA 15 min, 0 failed, skips 0.1/battle (last 100)
17:33:37 live-PNS exit=0 in 1154 s
17:33:37 start live-PNS6
17:33:37 watching live-PNS6: 3 stop rule(s)
```
