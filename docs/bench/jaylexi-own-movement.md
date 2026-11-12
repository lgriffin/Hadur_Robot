# JayLexi: which pieces of the MiniRumble leader's movement pay, in our own code (2026-11-12)

Three cloud cards on the 4-core box, all on `kitlab/mini-wide3-field.txt` (112 robots), 35 rounds, 3 workers, read by
`data/tools/multiarm.py` against JayLexi 0.6 (c) with an A/A rebuild (aa). Reports in `docs/bench/local/`.

## 1. Ablation: what carries FoilistMC's movement lead (cloud-jaylexi-fmab, 3 seeds from 41000)

FM is FoilistMC 1.0's movement with JayLexi 0.6's gun (cloud-jaylexi-foil2, `docs/bench/jaylexi-foil.md`). Each F arm is
FM with one movement piece turned back toward 0.6 or off. A/A -0.03 ± 0.27.

| Arm | Change from FM | vs 0.6 |
|---|---|---:|
| FM | none | +0.92 ± 0.78 |
| Fa | no rolling-average lateral speed feature | +0.84 ± 0.86 |
| Fd | danger over distance⁴ (0.6) instead of distance² | +0.67 ± 0.83 |
| Fo | orbit 1.99 rad off the enemy bearing (0.6's 1.15 off the wave) instead of 2.2 | +0.46 ± 0.99 |
| Fw | no wall-ray features in the logged hits | +0.32 ± 0.73 |
| Fn | no stand-in wave while no enemy wave is in flight | +0.06 ± 0.98 |

Without its stand-in wave FoilistMC has no idle movement rule at all (both dangers read 0 and it orbits one fixed way),
so Fn measures "some idle rule against none", not the stand-in wave against 0.6's flee-straight. In FM the advancing
velocity feature is always 0 (its source variable is set only in FoilistMC's own gun, which FM replaces).

## 2. The pieces on 0.6's table surf (cloud-jaylexi-own, 3 seeds from 42000)

Own code on 0.6 (ProGuard sizes). A/A +0.05 ± 0.29.

| Arm | Change from 0.6 | Bytes | vs 0.6 |
|---|---|---:|---:|
| Jw | surf stats also segmented by walls along our orbit: 0 to 3 clear fractions (0.18, 0.36, 0.64 rad), seen from the enemy | 1,585 | +0.53 ± 0.55 |
| Jo | orbit 0.21 rad further from the enemy on every orbit row | 1,498 | -0.20 ± 0.46 |
| Jx | Jw + Jn + Jo | 1,604 | -0.38 ± 0.71 |
| Jn | surf a stand-in wave (fastest bullet) while no enemy wave is in flight, instead of fleeing straight | 1,509 | -0.64 ± 0.73 |

## 3. The pieces on our own k-NN surf (cloud-jaylexi-knn2, 3 seeds from 43000)

KA is the k-NN surf of BENCH-204 on 0.6 (0.6's bins and field prior plus a kernel over every logged hit on lateral
speed, advancing speed and distance). javac sizes. A/A -0.11 ± 0.30.

| Arm | Change | Bytes | vs 0.6 |
|---|---|---:|---:|
| KA | reference (BENCH-204 read -0.39) | 1,745 | -0.50 ± 0.56 |
| KW | KA + two wall features: orbit points 0.2 to 1 rad ahead of and behind us, seen from the enemy, still in the field | 1,880 | -0.12 ± 0.56 |
| KWN | KW + stand-in wave | 1,895 | -0.56 ± 0.75 |
| KWNO | KWN + orbit 0.21 rad further out | 1,899 | -0.73 ± 0.62 |

## Reading

- Walls are the piece that transfers: +0.53 on the table surf, and +0.38 on the k-NN surf (KW over KA).
- The stand-in wave and the wider orbit lose on both of our surfs; they are dead. 0.6's flee-straight idle rule stays.
- Our k-NN surf still trails 0.6's table surf even with walls, so the table surf stays and takes the walls segment.

## 4. Walls rerun (cloud-jaylexi-walls, 6 fresh seeds from 44000)

A/A +0.10 ± 0.18 (2,688 battles).

| Arm | Change from 0.6 | Bytes | vs 0.6 |
|---|---|---:|---:|
| Jw | walls segment, as in section 2 | 1,585 | +0.29 ± 0.42 |
| Jw2 | Jw + one bit: the field is clear 0.36 rad behind us along the orbit | 1,619 | -0.20 ± 0.41 |

Jw holds up at about half its first read: +0.29 on 6 fresh seeds after +0.53 on 3, about +0.37 over the 9 seeds
together, low end just above 0. Jw2 does not add to it.

## Where this leaves JayLexi

- FoilistMC's lead does not come apart into pieces we can transplant. Of its five differences from 0.6, only the wall
  features carry over to our own surfs, worth about +0.3 on 0.6.
- Jw (`hadur-bench/kitlab/arms/JayLexi-Jw.java`) is the one candidate kept; it is 86 bytes over the 1,499 limit. The
  other arms are removed (no dead experiment code) and their cards are summarised here.
- The rest of the lead sits in how FoilistMC's surf is built as a whole (its kernel and how it weighs old hits),
  which our k-NN surf does not match.
