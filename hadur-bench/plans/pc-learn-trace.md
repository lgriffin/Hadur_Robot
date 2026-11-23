# The `pc-learn-trace` card (BENCH-221)

The bench shall carry the `pc-learn-trace` card: master (c) and BeepBoop 2.0 itself (bb, `opponents/kc.mega.BeepBoop_2.0.jar`) each fight every robot of census-312.txt at one fresh seed (run 1: 11800 on 10 Nov; run 2: 11900 on 3.24, work/learn-trace-324, `--fresh`, the live turn time, the read adding `diagnose_field.py`), 35 rounds, truth logs on, 12 workers; the read pairs the two on each opponent (`data/tools/learn_trace.py --base c --other bb --set census-312.txt`: real hit rate by round and by rank band, bullets aimed a round, damage a round) beside the field read (`multiarm.py --census`); stopping on 30 failed battles, 60+ skipped turns a battle over the last 200 on c, or no battle in 30 minutes, with no dead-arm rule (bb scoring nothing is a finding); then a results PR. Nothing ships from it; it names the per-opponent candidates.

Stage or check: T7
