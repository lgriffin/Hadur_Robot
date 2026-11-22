# The `pc-gl-lines` card (BENCH-250)

The bench shall carry the `pc-gl-lines` card: c (master), its A/A copy aa and gl (`build-ablation.sh gslist` with `plans/gl-lines-add.txt`, the gun-stack line on each robot of `panel-gl-lines.txt`, the robots whose gl line locked on the cloud on 12 fresh seeds at the live turn time); a `livematch` step first (BENCH-245); a lock of 12 fresh seeds from 25500 at `--cpu-constant live`; a gate that keeps a robot's line only where its 95% low end is above 0 (`mode_table.py --margin 0`); stop rules (30 failed battles, an arm scoring nothing in 8, 60+ skipped turns a battle over the last 24, no battle in 30 minutes; the panel is under 10 robots, so aa is read in the gate, not by the watcher); results on claude/pc-gl-lines-results.

Stage or check: T7
