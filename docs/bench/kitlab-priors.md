# Strategy in the constant pool (codesize bots, 2026-10-30/31)

Leigh asked on 2026-10-30 at 23:45 GMT for bytecode and constant-pool tricks in the codesize bots
(Deise, JayLexi, Eveimear, then Sanaro), and at 23:56 GMT for a design that can carry the more
complicated movement and targeting Hadur and its rivals use, hard-coded where needed: "This is our
pathway to first."

**The fact everything rests on:** Robocode's codesize 1.3.1 adds up the `Code` attribute length of
every method. The constant pool is not counted, so strings, numbers and names cost nothing. A
string table costs only its read, `TABLE.charAt(i)`, which is about 6 to 8 bytes.

**Result so far:**

- **Lookup golfs work.** JayLexi 0.2 drops from 1,485 B to 1,473 B under javac, and to 1,459 B
  under ecj plus ProGuard. It keeps the same orders bit for bit (JayLexiReplayTest).
- **Priors learned for the whole field do not pay.** A gun prior loses 1.2 APS. A danger profile
  of where the field aims is flat. A pattern library baked into Eveimear's gun lowers its offline
  hit rate.
- **Per-opponent rows pay.** Each row holds where that opponent's bullets go, keyed by its name
  hash. On the PC (`pc-jaylexi-po`, PR #500: 112 bots x 6 seeds, rows learned from separate
  battles) PO300 reads **+0.77 +- 0.14** and PO2000 **+0.88 +- 0.15** over G, the 0.2 control.
  Those are the bots the rows were learned on. Live, the other 557 bots of the division would get
  the field's row, so card `pc-jaylexi-po-all` learns a row for all 669 and reads the 112-bot and
  669-bot tables on a fresh sample (`kitlab/mini-wide2-field.txt`). The 669-row table builds to
  1,493 B. **Cloud result** (`docs/bench/local/jaylexi-po-all.md`, fresh sample mini-wide2, 672
  battles an arm): the 112-row table reads **-0.10 +- 0.15** (most of these bots have no row),
  and the 669-row table **+0.44 +- 0.16** over G. Rows pay only for bots they were learned on, so
  a release needs the whole division's table.

## Where the bytes are

| Bot (class, limit) | Shipped | Largest methods |
|---|---:|---|
| Deise 0.4 (MiniMelee, 1,499) | 1,499 | onScannedRobot 975, run 424 |
| JayLexi 0.2 (MiniRumble, 1,499) | 1,485 | onScannedRobot 669, danger 220, Wave.test 85 |
| Eveimear 0.1 (MicroRumble, 749) | 722 | onScannedRobot 487, Wave.test 93 |
| Sanaro 0.2 (NanoMelee, 249) | 249 | onScannedRobot 219 |

The figures come from `hadur-bench/tools/codesize_methods.py`, which gives the same totals as
codesize. Sanaro already keeps its power policy in a 16,384-char string. ecj plus ProGuard save
nothing on Sanaro.

## Lookup golfs (JayLexi)

Three pieces of segment maths become string reads. Each gives exactly the same value over its
whole input range.

| Was | Now | Range checked |
|---|---|---|
| `(int) Math.min((distance + 50) / 200, 3)` | `BAND.charAt((int) (distance / 50))` | distance 0 to 1,200 (the field's diagonal is 1,000) |
| `(int) (1.4427 * Math.log(lateral + 1.5))` | `LOG2.charAt((int) lateral)` | lateral speed 0 to 8 (an integer) |
| `(int) Math.max(0, Math.min(46, x))` | `CLAMP.charAt((int) x + 160)` | x from -153 to 199: pi / asin(8 / 20) x 23 either side of 23 |

The replay test caught the first CLAMP. It assumed bullet speeds of 11 and up, but JayLexi's own
weak shots are faster than that. The fixed table is in `jaylexi/` (12 B saved). The arm builder
`hadur-bench/kitlab/build_arm_pg.sh` (ecj plus ProGuard) saves 14 B more.

## Local slots (Deise)

Only local variable slots 0 to 3 have one-byte loads and stores (`dload_1`, `aload_3`). Every
other slot costs two bytes per access. `codesize_methods.py` together with `javap -c` shows which
locals each method touches most.

Deise's risk ring (`run`) reads the loop element (14 times), the risk sum (11) and the loop index
(6) from slots 26 to 28. The source now declares those three before anything else in `run`, so
javac and ProGuard place them in slots 1 to 4. The two `for (double[] x : arr)` loops become
indexed loops over the arrays' fixed lengths (17 and 64), which drops the hidden array-copy and
length locals. The robot-weight loop in `onScannedRobot` gets the same change.

**Result:** Deise goes from 1,499 B to 1,452 B: `run` drops from 424 to 385 B, `onScannedRobot`
from 975 to 967 B. The orders are unchanged: `DeiseEquivalenceTest` (DEISE-16) and `DeiseJarIT`
pass (PR #491). That leaves 47 B for aim, which the Deise thread names as the gap to Mirage (8%
less bullet damage a round).

In `onScannedRobot`, slots 2 and 3 are already the method's busiest locals, so reordering there
gains nothing.

## Learned tables

`tools/kitlab_priors.py` reads bench truth logs and learns two things:

- **Aim:** where each enemy bullet was aimed, in JayLexi's own surf wave and segments.
- **Movement:** where the enemy was when each of our gun waves reached it, in the gun's 480
  segments.

`tools/kitlab_prior_arm.py` writes them into arm templates as string literals. It uses
three-digit octal escapes and reads every table back before writing it. `tools/kitlab_prior_eval.py`
replays the GF gun offline from zero or from a prior, on bots held out of the training half.

**Harvest:** JayLexi 0.2 on `kitlab/mini-wide-field.txt` (112 bots, 3 seeds, truth log on).

**Offline replay** (held-out half, all waves fire):

| Gun start | Hit rate rounds 1-3 | Rounds 1-35 |
|---|---:|---:|
| empty (0.2) | 36.66% | 40.88% |
| first-shot table (the peak bin, used until a segment has a visit) | 36.89% | 40.92% |
| whole profile, 30 waves' weight | 38.11% | 41.64% |

**Bench** (`kitlab/mini-field.txt`, 48 bots x 4 seeds, paired against 0.2). The priors were learned
without the test bots. The per-opponent rows come from separate battles against the same bots,
which is how they would be used live.

| Arm | B | vs 0.2 | Dealt / taken a round |
|---|---:|---:|---|
| 0.2 (reference) | 1,485 | | 55.8 / 18.9 |
| G: 0.2 golfed, same play (A/A) | 1,459 | -0.41 ± 0.27 | 55.6 / 19.2 |
| PA: field aim profile in place of the head-on term, first-shot gun table | 1,468 | -0.07 ± 0.29 | 55.6 / 18.9 |
| PF30: whole gun profile prior (22,560 chars) | 1,497 | **-1.23 ± 0.29** | 53.8 / 19.2 |
| PO300: PA plus per-opponent aim rows, peak 0.03 | 1,493 | +0.31 ± 0.27 | 55.4 / 18.7 |
| PO2000: the same, peak 0.2 | 1,493 | +0.37 ± 0.30 | 54.8 / 19.5 |

- **The gun prior's offline gain does not survive the bench.** It hits more in replay but deals
  2 a round less in battle. Replay treats the enemy's movement as fixed. Surfers, and many mid-table
  minis, learn our aim, and a shared starting aim is the easiest one to learn.
- **The field aim profile changes nothing.** The head-on term it replaces was already a good guess
  for an opponent nothing is known about.
- **Per-opponent rows are the one arm above the A/A on both weights.** They are not proven at this
  sample size. Card `pc-jaylexi-po` reads them on 112 bots at 6 seeds.
- **These cloud rows were learned one scan off.** The extractor took each shot's wave bearing,
  distance and our lateral speed from the scan just before the shot. JayLexi takes them from the
  scan before that (review on PR #483). The extractor is fixed. The card learns its rows with the
  fixed code, so it also reads the corrected rows.

## Eveimear

The surfer from PR #481 (s10, 743 B) lost to 0.1 because its 90-byte string pattern-matching gun
deals 4 less a round than the GF gun.

Tried here: starting the matcher's history with other robots' recorded lateral speeds (a movement
library in the constant pool, 0 B) instead of 120 blanks. The replay used s10's own battles on
`kitlab/micro2-field.txt`, training on half the bots and testing on the other half.

| Library | Hit rate |
|---|---:|
| none | 33.49% |
| 5,000 chars | 32.87% |
| 20,000 chars | 32.66% |

Other robots' patterns mislead the matcher more than they help it, so the library is dropped. The
GF gun needs 100 to 180 B that string reads cannot free.

## Where this goes

1. **Per-opponent parameter rows**, if `pc-jaylexi-po` holds. This is Hadur's mode table in a
   string: a name-hash lookup (about 20 B, already paid in PO) picks a row of per-opponent choices,
   such as orbit angle, power or a surf mode. Each choice is trained on the PC by arm and opponent.
   Live use needs a harvest of the whole division (671 bots, about 31,500 chars of rows).
2. **Lookup golfs in every bot**, priced with `codesize_methods.py`. The freed bytes go to the
   features the arms have already priced, such as JayLexi's k-NN surf (+0.25, about 100 B short).
3. **Sanaro:** have its one table read decide more, for example power plus a fire-or-hold bit or a
   target switch, in place of separate code.
4. **Not worth pursuing:** field-wide gun priors, pattern libraries, and full policy tables that
   replace the learning. In all three the enemy adapts, which a table cannot follow.

## Files

- `hadur-bench/tools/codesize_methods.py`: bytes per method
- `hadur-bench/tools/kitlab_priors.py`, `kitlab_prior_eval.py`, `kitlab_prior_arm.py`,
  `kitlab_pm_eval.py`, `test_kitlab_priors.py`
- `hadur-bench/kitlab/build_arm_pg.sh`: an arm built with ecj plus ProGuard
- `hadur-bench/kitlab/arms/JayLexi-P.tmpl`, `JayLexi-PF.tmpl`, `JayLexi-PO.tmpl`, `JayLexi-G.java`,
  `JayLexi-PA.java`, `JayLexi-PF30.java`. The PO arms are generated from the template by the card.
- `hadur-bench/plans/pc-jaylexi-po.queue`
