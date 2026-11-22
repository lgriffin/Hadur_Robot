# The `pc-shards` card (BENCH-252)

The bench shall carry the `pc-shards` card: c (master), its A/A copy aa and seven lever arms (fq, x5, hl, dg, gl, mq, mtzl; each the lever's line on every robot of `panel-shards.txt` via `plans/shards-add.txt`: the 15 Nov field shards A-D, G, M and L and shard F's three cloud locks, broken-1.11.2 robots dropped); a `livematch` step first (BENCH-245); a screen of 6 seeds from 42000 at `--cpu-constant live`; a pick of each robot's best lever at a 3-point margin (`mode_table.py`), rebuilt per arm with only its picks (`tools/lock_prep.py`); a lock of 12 fresh seeds from 42100; a gate that keeps a robot's line only where its 95% low end is above 0 (`mode_table.py --margin 0` on the restricted rows); stop rules (screen: aa after 20%, 30 failed battles, an arm scoring nothing in 8, 60+ skipped turns a battle over the last 200, no battle in 30 minutes; lock: the same with a 24-battle skips window); results on claude/pc-shards-results.

Stage or check: T7
