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

## Round 4: a k-NN surf (2026-10-30, overnight)

`k3K` replaces the surf table with FoilistMC-style surfing:

- Each enemy wave records our lateral speed, our advancing speed / 2 and the distance / 100 at fire
  time.
- A bullet that hits us (or hits one of ours) keeps that wave and its guess factor in a list for
  the rest of the battle.
- An option's danger is the sum over the kept hits of
  `weight / ((1 + f²) × (0.02 + (gf − hit gf)²))`, where f is the L1 distance between the
  features, plus a small head-on prior, over the enemy distance to the fourth power, as in 0.2.

The "division mean" column is the mean of the two 48-bot samples, each paired against 0.2 run in the
same session (± about 0.3 each).

| Arm | Recency weight | Bytes | gap-field | mini-field | mini2-field | Division mean |
|---|---|---|---|---|---|---|
| k3K | none | 1,630 | +0.76 ± 0.30 | -0.34 | +0.51 | +0.09 |
| k3KL | 20, 21, 22 … (linear) | 1,641 | **+1.04 ± 0.26** | +0.40 | +0.39 | +0.39 |
| **k3KE** | 1.05 per hit (exponential) | 1,641 | +0.69 ± 0.30 | +0.27 | +0.77 | **+0.52** |
| k3KE2 | 1.1 per hit | 1,641 | +0.56 ± 0.20 | -0.08 | +0.29 | +0.11 |

- **The k-NN surf works.** k3KE takes 1.2 less damage a round on the gap sample.
- Without recency it loses to strong and even bots: -9.4 and -4.0 a bot on mini-field. Their guns
  adapt, and an old hit then misleads.
- k3KE is the best on the division. It still gives up a few points to the top 12, but each of them
  weighs only 1 in 670.

### Fitting it in 1,499 bytes

k3KE is **145 bytes over** what 0.2 leaves spare. Storing hits as the waves themselves, instead of
copied arrays, saved 15 (`k3KEg`, 1,626). Three further cuts were measured on top of it:

| Cut | Bytes saved | Read |
|---|---|---|
| no head-on prior | 12 | (in c123) |
| no advancing feature | 40 | (in c123) |
| no walls segment in the gun (`k3c3`, 1,562) | 64 | division +0.01, gap +0.44 |
| all three (`k3c123`, 1,510) | 116 | division **-0.45**, gap +0.28 |

The gun's wall segment is worth more than the bytes it costs, and so is the advancing feature. The
bytes for the k-NN surf have to come from elsewhere: a tighter wave and hit layout, the prediction
loop, the radar and the power rule.

### Round 5: pricing the cuts that fit

| Arm | Change from k3KEg | Bytes | gap-field | mini | mini2 | Division mean |
|---|---|---|---|---|---|---|
| k3x2 | no advancing feature | 1,586 | +0.66 ± 0.27 | -0.02 | -0.29 | -0.16 |
| k3X | lateral speed as the only feature, nearest wave only, no bullet-hit-bullet log, power without the energy/15 cap, no prior | **1,493** | -1.12 ± 0.33 | -1.53 | -2.75 | **-2.14** |

- The k-NN surf is only as good as its features. Dropping the advancing speed alone costs about 0.7
  of k3KE's +0.52.
- Cutting everything that fits in the budget loses badly.
- Fitting k3KE needs a full re-golf of the whole robot that keeps its play, not cuts.
