# Queue pc-shelf: progress

Updated 2026-11-04 11:31:13 PC time (11:31 UTC), runner pid 19656.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` done, exit 0 in 19 min
- `pilot-u` failed, exit 1 in 31 min
- `screen-u` skipped
- `pick` skipped
- `build` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### Queue log (last lines)

```
08:53:17 watching pilot-u: 4 stop rule(s)
09:05:48 progress pilot-u: 483/1062 (45%) battles, 2317/h, ETA 15 min, 0 failed, skips 34.6/battle (last 100), aa -0.02, mt -0.64, wl -5.85, hl -0.00, gl -0.06
09:24:24 pilot-u exit=1 in 1867 s
09:24:26 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/630
09:24:26 skip screen-u (after pilot-u, which has not finished exit=0)
09:24:26 skip pick (after screen-u, which has not finished exit=0)
09:24:26 skip build (after pick, which has not finished exit=0)
09:24:26 skip confirm (after build, which has not finished exit=0)
09:24:26 skip gate (after confirm, which has not finished exit=0)
09:24:26 skip pr (after gate, which has not finished exit=0)
09:24:26 ALLDONE
11:31:13 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
11:31:13 skip prep (already exit=0)
11:31:13 skip pilot-s (already exit=0)
11:31:13 skip screen-s (already exit=0)
```
