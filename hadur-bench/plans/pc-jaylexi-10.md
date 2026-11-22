# The `pc-jaylexi-10` card (BENCH-266)

The bench shall carry the `pc-jaylexi-10` card: after `mvn verify` in jaylexi, c (JayLexi 0.9's source, read from master at commit 70a0008f8 and checked by grep for its distance bands), its A/A rebuild aa, n (the shipped 1.0, JAYLEXI-23) and r6 (the released 0.6), built with ProGuard as a release ships; run them after the BENCH-245 live-match step at `--cpu-constant live` on `kitlab/mini-pw-field.txt` (668 MiniRumble robots), 6 seeds from 61000, shuffled; halt on 30 failed battles, an arm scoring nothing in 8, 60+ skipped turns a battle over the last 200, no battle in 30 minutes or an A/A outside its band after 20%, finish early when n is below -0.5 points at 20%; read with multiarm.py (gate: n against c and aa pooled, 95% low end above 0) and open its results PR.

Stage or check: T7
