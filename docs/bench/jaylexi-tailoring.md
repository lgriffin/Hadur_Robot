# JayLexi: per-robot tailoring on the MiniRumble gap robots (2026-11-16)

These are cloud runs on the 4-core box, all at 35 rounds with 3 workers. Each run is read per robot from its battle
results and pooled by `data/tools/multiarm.py`. The reports are in `docs/bench/local/2026-11-16_jaylexi-*.md`. c is
JayLexi 0.7 as merged (#780) and aa is its A/A rebuild.

## 1. Gap census (seeds 47000, 3 seeds)

`hadur-bench/kitlab/mini-gap-field.txt` holds the 191 robots where JayLexi 0.6 scored 2 or more points below FoilistMC
1.0 or CunobelinDC 1.2 on the live pages of 2026-11-06. Each live pairing there is a single battle.

| Arm | vs 0.7 |
|---|---:|
| FoilistMC 1.0 | +2.89 ± 0.58 |
| aa | -0.15 ± 0.34 |

The gap is real. It comes to about 1 APS (2.9 points on 191 of 669 pairings).

Nearly all of it is damage taken, not damage dealt. On most of these robots the two deal the same bullet damage, while
FoilistMC takes less and survives more. The groups:

- Rammers (25 robots on which our bullet damage is over 80 a round) carry a fifth of the gap. Examples: NanoDeath
  (survival 81% against 99%), Kowari, Fusion, FollowFire, nanoPri.
- Learning and pattern-matching guns carry most of the rest. Examples: Carpet +20, EpeeistDC +20, Freya, Paladin.
- BulletCatcher is the only gun gap: +17, with FoilistMC dealing 65 a round against our 47, even with 0.6's aim jitter.

## 2. Per-robot orbit angle (0 code bytes)

JayLexi's orbit angle sits in a string (ORB) at each robot's name-hash row, so a per-robot angle costs no bytes.

- **Screen** (seeds 47000, 3 seeds, paired with the census c). Every robot was set to 0.75, 0.95 or 1.35 rad, against
  0.7's 1.15. No single angle wins overall: 1.35 -0.04, 0.95 -0.22, 0.75 -0.63. On its best angle, 37 robots read +4 or
  more.
- **Lock** (12 fresh seeds from 48000, each robot on its own pick). 4 robots hold:

| Robot | Orbit | vs 0.7 |
|---|---:|---:|
| suh.nano.RammingC 1.00 | 0.75 | +3.5 ± 1.5 |
| ry.LightningBug 1.0 | 0.95 | +4.3 ± 2.3 |
| blir.nano.Bruce R1.0.0 | 0.95 | +3.5 ± 1.6 |
| stelo.MirrorMicro 1.1 | 1.35 | +5.4 ± 4.4 |

The other 33 picks were noise: the three lock groups read +0.25, +0.20 and +0.82. The 4 lines add about +0.025 APS.

## 3. BulletCatcher gun jitter (0 bytes)

The jitter scale is read from the orbit char: `(int) orbit >> 2`, so 2 pi more gives one step. More steps lose (12 fresh
seeds from 48000):

| Orbit char | Jitter | vs 0.7 |
|---|---|---:|
| +4 pi | ±0.375 rad | -11.7 ± 3.4 |
| +6 pi | ±0.625 rad | -21.1 ± 5.2 |
| +8 pi | ±0.75 rad | -20.0 ± 3.9 |

0.7's ±0.125 stays.

## 4. Byte levers, tested over the limit first (4 seeds from 49000)

| Lever | Panel | Bytes | vs 0.7 |
|---|---|---:|---:|
| R1: orbit 0.4 rad further out inside 200 px | 25 rammers | 1,516 | +0.92 ± 0.66 |
| R3: drive straight away inside 150 px | 25 rammers | 1,512 | -3.13 |
| L1: danger choice with ±30% noise | 30 learning guns | 1,507 | +0.39 ± 0.95 |
| L2: orbit ±0.3 rad at random each scan | 30 learning guns | 1,515 | +0.25 ± 1.1 |

R3 is dead. L1 and L2 are flat, so a less predictable path does not close the learning-gun gap. R1 went on to the whole
mini field (`kitlab/mini-wide3-field.txt`, 112 robots):

| Run | R1 | R1b (0.3 inside 300 px) | R1c (0.55 inside 200 px) | A/A |
|---|---:|---:|---:|---:|
| seeds 50000, 3 seeds | +0.35 ± 0.44 | +0.08 ± 0.41 | | -0.28 ± 0.38 |
| seeds 51000, 4 seeds | +0.29 ± 0.32 | | -0.03 ± 0.32 | +0.16 ± 0.33 |

## 5. Bytes: a distance slot in the orbit table

R1 as an `if` costs 21 B, and 0.7 has 1 B to spare. The fix is to read ORB at the robot's AIM row (stride 47) plus
`(int) (distance / 50)` instead of at `row / BINS`. Dropping the division pays for the add, and `band`, the raw
distance / 50 bucket the gun and power already use, is now set on that line. The result is 24 orbit slots per robot,
one per 50 px, at **1,495 B**, the same as 0.7, so any robot can have its own orbit by range for 0 bytes.

## 6. Confirm: retreat-close for every robot does not hold

Built that way with R1 for every robot plus the 4 orbit lines (arm T), against 0.7 on `mini-wide3` (seeds 52000, 4
seeds):

| Arm | vs 0.7 |
|---|---:|
| T | -0.12 ± 0.35 |
| aa | +0.32 ± 0.30 |

Over the three sets, R1 for every robot reads about +0.16 with its low end below 0, so it is not a field-wide rule.

## 7. Per-robot retreat-close (12 fresh seeds from 53000)

The 8 rammers whose R1 read +2.4 or more on the rammer screen:

| Robot | R1 vs 0.7 |
|---|---:|
| blir.nano.Bruce R1.0.0 | +3.3 ± 0.9 |
| stelo.Lifestealer 1.0 | +3.1 ± 1.1 |
| pmc.SniperBot 1.0 | +2.4 ± 1.3 |
| suh.nano.RammingC 1.00 | +1.4 ± 2.0 |
| step.nanoPri 1.0 | +1.3 ± 1.8 |
| mn.nano.perceptual.Impact 1.3.0 | +0.7 ± 2.3 |
| sheldor.nano.SabreuseNano 1.1 | -0.2 ± 2.8 |
| maribo.FollowFire 1.11 | -0.6 ± 1.7 |

Bruce and Lifestealer clear the 3-point bar. Bruce's orbit-0.95 line (+3.5) and its R1 line (+3.3) were never measured
together. 0.8 takes R1 for Bruce, which has the tighter interval.

## JayLexi 0.8

0.8 is 0.7 with these lines, all at 1,495 B:

| Robot | Orbit | Locked read |
|---|---|---:|
| RammingC | 0.75 | +3.5 ± 1.5 |
| LightningBug | 0.95 | +4.3 ± 2.3 |
| MirrorMicro | 1.35 | +5.4 ± 4.4 |
| Bruce | 1.15, 0.75 under 200 px | +3.3 ± 0.9 |
| Lifestealer | 1.15, 0.75 under 200 px | +3.1 ± 1.1 |

That comes to about +0.03 APS. The readable reference keeps one orbit char a robot plus a NEAR char (40 for Bruce and
Lifestealer). A replay test checks that every slot of the shipped table follows that rule (JAYLEXI-21). Nothing is
released.

## Where this leaves JayLexi

- The gap to FoilistMC on its gap robots is real, about 1 APS, and it is movement: damage taken.
- Per-robot tailoring through the free strings closes very little of it: 5 lines, about +0.03 APS. The rest of the
  gap is spread thin. Most robots show 3 to 10 points, and on 12 fresh seeds those fall back to noise.
- None of the levers tested close the gap against learning guns: orbit angle, path noise and gun jitter. The leader's
  lead there is in how its surf is built (docs/bench/jaylexi-own-movement.md).
