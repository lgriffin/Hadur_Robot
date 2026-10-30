# JayLexi 0.3 arms (cloud, 2026-10-29/30)

The target is the gap to FoilistMC found in [live-kitlab-0.2.md](live-kitlab-0.2.md). JayLexi takes
23% more damage than FoilistMC from weak bots, most of it from guns that learn. FoilistMC also keeps
getting harder to hit as a battle goes on, where JayLexi levels off.

Every arm is the shipped 0.2 source with one change (`hadur-bench/kitlab/arms/JayLexi-k3*.java`).
Each is read paired against a 0.2 control run in the same session, and the ± is the standard error
of the per-opponent paired difference. On `gap-field` (64 bots, 4 seeds) each arm is one 256-battle
run. The A/A check, 0.2 at 4 seeds against 0.2 at 2 seeds, read -0.08.

## Round 1 (gap-field)

| Arm | Change | Bytes | All 64 |
|---|---|---|---|
| k3N | danger × (1 + random/2), so near-equal choices vary | 1,495 | -0.13 ± 0.21 |
| k3S | linear-aim seed: +.01/(\|i-41\|+1) beside the head-on one | 1,501 | +0.16 ± 0.19 |
| k3F20 | flattener: log our own GF on every enemy wave, depth 20 | 1,501 | **-1.49 ± 0.35** |
| k3F60 | the same, depth 60 | 1,501 | -0.30 ± 0.27 |

The flattener loses: most weak bots aim simply, and flattening makes JayLexi easier for them to hit.

## Round 2 (gap-field): surf memory

0.2 rolls each hit into its surf bins at depth 0.85, so one hit almost replaces the profile.

| Arm | Depth | weak-nano | weak | easy | All 64 |
|---|---|---|---|---|---|
| k3D2 | 2 | +0.34 ± 0.28 | +0.56 ± 0.32 | -1.42 ± 0.75 | -0.02 ± 0.26 |
| k3D5 | 5 | +0.27 ± 0.38 | +0.45 ± 0.22 | -0.69 ± 0.57 | +0.10 ± 0.22 |
| k3D15 | 15 | +0.33 ± 0.34 | +0.42 ± 0.23 | -0.45 ± 0.54 | +0.17 ± 0.21 |

A longer memory helps against the weak field and hurts against the easy group, whose guns learn.

## Round 3: the division samples

| Arm | gap-field | mini-field (48) | mini2-field (48) | Mean of the two samples |
|---|---|---|---|---|
| k3D15 | +0.17 ± 0.21 | -0.33 ± 0.27 | +0.31 ± 0.36 | -0.01 |
| k3SD15 (seed + depth 15) | +0.19 ± 0.25 | -0.33 ± 0.31 | -0.24 ± 0.39 | -0.29 |

No arm holds up on the division. Tuning the present surf does not close the gap.

## What FoilistMC does differently

FoilistMC 1.0 ships its source (RWPCL, 1,499 bytes). Its movement is CunobelinDC's:

- It keeps **every hit** as a scan: lateral velocity, its rolling average, advancing velocity,
  distance and wall distances ahead and behind. Nothing is forgotten.
- It rates each option's danger as a **kernel sum over all those hits**, each hit weighted by how
  close its situation is to the present one (a k-NN surf).
- It sums over all waves in flight, the n-th wave weighted 1/n², and divides by the squared distance
  to the enemy.

JayLexi's surf is a small segmented table (distance × our lateral speed) that forgets fast. That
fits the read: FoilistMC keeps learning through a battle and JayLexi plateaus, at Komarious's level,
which uses a table too. The lever for 0.3 is the surf model, not its settings. A k-NN surf over
logged hits, in the bytes the present surf table and its logging take.
