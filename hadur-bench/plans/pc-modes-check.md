# The `pc-modes-check` card (BENCH-246)

The bench shall carry the `pc-modes-check` card, the release check of MOVE-43 outside the duel: melee builds aa (master), bb (its copy) and so (`build-ablation.sh shoff`, master with `KEEP_SHADOWS` off), each alone on the 46 fields of `melee-census-317.txt` at 4 seeds from 40000, read by `melee_s0.py screen` with so against the mean of aa and bb; team builds bb and so against aa on `team-census46.txt` at 8 seeds from 7400; halting on 20 failed battles or no battle in 30 minutes; then a results PR.

Stage or check: T7
