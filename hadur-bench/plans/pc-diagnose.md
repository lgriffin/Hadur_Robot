# The `pc-diagnose` card (BENCH-240)

The bench shall carry the `pc-diagnose` card, the field diagnosis: with no battles, `data/tools/diagnose_field.py` reads the truth logs pc-learn-trace (BENCH-221) left in `work/learn-trace-324 (pc-learn-trace run 2, on 3.24)` (master and BeepBoop against the same robots at the same seed) and writes, per robot, both arms' bullet power, stand-still share, distance, wall share, round length, the opponent's hit rate, damage taken and dealt and score share, with one or more diagnoses (SHIELD, SHQ, CAP, HARD, MOVE, DIST, WALL, GUN) naming the line type that fits; robots BeepBoop does not lead by 2+ points in that run stay out of the classes; then a results PR.

Stage or check: T7
