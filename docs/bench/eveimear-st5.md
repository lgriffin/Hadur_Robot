# Eveimear 0.5 with its mode table relearned (cloud-eveimear-st5, BENCH-202)

Run on the cloud box 2026-11-06 04:30 to 07:34 GMT: M1, M9 and M0 (0.5 with every mode cell 1, 9 or 0) on all 515
MicroRumble robots x 2 seeds, then the test, 2,016 battles on micro-wide2 x 6 seeds from 37000. 0 failed. Card, arms
file and `tools/eveimear_fill.py` removed after the read (no dead experiment code); the card text is in git history
at PR #679.

**ST5 fails: -0.11 +- 0.35 points against 0.5.** The oracle moved 168 of 515 robots off Cotillion's switch (73 to
random from the first hit, 95 to stop-and-go held), and the build fights the same as 0.5 on fresh seeds. No band
moves past the A/A's own spread (ST5 -1.11 and aa -0.63 in the top 30, on 15 robots). The A/A is clean (-0.09 +- 0.31).

So a relearn on 0.5's body recovers nothing measurable on this panel (within +- 0.35). 0.5 keeps it. Eveimear is 1st in
MicroRumble, and the remaining small-bot effort goes to JayLexi's movement (`cloud-jaylexi-foil2`, BENCH-203).

## Read (multiarm.py)

A/A: aa - c = -0.09 ± 0.31 points over 112 opponents; 1% band ± 0.45, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| ST5 | 112 | 83.16 | -0.11 ± 0.35 | - | 0.5 | 0.01 | 100% | 6.8 | 672 of 672 |
| aa | 112 | 83.23 | -0.09 ± 0.31 | - | 0.5 | 0.01 | 100% | 10.0 | 672 of 672 |
| c | 112 | 83.32 | ref | - | 0.5 | 0.01 | 100% | 7.7 | 672 of 672 |

## Picks (of 515)

| Mode | Robots |
|---|---:|
| 1 (Cotillion switch, default) | 347 |
| 9 (stop-and-go held) | 95 |
| 0 (random from the first hit) | 73 |
