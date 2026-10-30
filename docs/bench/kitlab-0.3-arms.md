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

### Round 6: the "cheap" cuts are not cheap

| Arm | Change from k3KEg | Bytes | gap-field | mini | mini2 | Division mean |
|---|---|---|---|---|---|---|
| k3N1 | no bullet-hit-bullet log, no energy update on our hits, power without the energy/15 cap, no head-on prior | 1,560 | -1.24 ± 0.30 | -1.31 | -1.96 | -1.64 |
| k3N2 | the same, prior kept | 1,572 | -1.27 ± 0.36 | -1.03 | -1.37 | -1.20 |

- The head-on prior is worth about 0.4. It breaks the tie between the two options before the first
  hit.
- Most of the loss is elsewhere: in the energy update on our own hits, the bullet-hit-bullet log or
  the power cap.
  - Without the energy update, the enemy's energy reads high after we hit it, so a real shot on the
    same tick goes unseen. That is the likeliest cause.
- So k3X's -2.14 was these cuts together, not the single-feature k-NN alone.
- Every part of 0.2 is earning its bytes. k3KE fits only through a play-preserving re-golf, or by
  giving up something already priced at -0.16 or worse.

### Round 7: the bullet-hit-bullet log alone

| Arm | Change from k3KEg | Bytes | gap-field | mini | mini2 | Division mean |
|---|---|---|---|---|---|---|
| k3x1 | no bullet-hit-bullet log | 1,616 | -0.74 ± 0.26 | -0.60 | -1.41 | **-1.01** |
| k3T | not k-NN: 0.2's surf table with the three features as its segments, rolling depth 20 | 1,514 | -0.09 ± 0.26 | -0.80 | -0.37 | -0.58 |

- The bullet-hit-bullet log is the most valuable thing the k-NN surf has: dropping it alone costs
  about 1.5 against k3KE, as much as all of k3N1's cuts together. Each bullet we shoot down is a
  sample of the enemy's aim that a hit would only give us at a cost, and the k-NN surf feeds on
  samples. The losses are against the even and strong bots, which shoot the most bullets down.
- k3T asked whether the features alone carry the gain, in a table that would be cheaper than the
  k-NN loop. They do not: the table loses 0.58, most of it to the even and strong bots. The gain is
  the k-NN's, keeping every hit and weighing it by likeness.
- That corrects round 6: the energy update was not the likeliest cause. The bullet-hit-bullet log
  was.
- The log stays. The shipped re-golf (1,641 to 1,598 B, same play bit for bit) is short by 102
  bytes, so round 8 benches two bundles of small play changes that fit with the log kept.

### Round 8: small play changes that fit, and the one that broke them

The shipped re-golf of k3KE keeps its play bit for bit and is 1,598 B. These play changes each save
bytes (measured on the shipped build):

| Key | Change | Bytes saved |
|---|---|---|
| radar | the radar lock trick (reverse the remaining radar turn on each scan) | 7 |
| sgn | no 1e-9 before Math.signum, for both the surf's and the gun's direction | 8 |
| gsgn | the same for the gun's direction only | 4 |
| keep | a wave that hit us is not dropped at once; it passes on its own a tick later | 13 |
| hbb | no energy update when the enemy hits us | 15 |
| capfin | power 3 inside 150 px, else 2, with no energy/15 cap and no finishing cap | 25 |
| decel | the surf's prediction brakes at 1 a tick, not 2 | 19 |
| gdist | no distance segment in the gun | 10 |
| tr | our gun waves start at the gun, not 1.5 ticks behind it | 9 |
| p3b | power 2 always (with capfin) | 16 |

| Arm | Changes | Bytes | gap-field | mini | mini2 | Division mean |
|---|---|---|---|---|---|---|
| k3gC | radar, sgn, keep, hbb, capfin, decel, gdist, tr | 1,492 | -4.21 ± 1.57 | -3.55 | -6.19 | -4.87 |
| k3gE | radar, sgn, keep, hbb, capfin, gdist, tr, p3b | 1,495 | -3.99 ± 1.54 | -4.15 | -6.26 | -5.20 |

- Both collapsed, -17 to -22 against the even and strong bots, so one change had to be broken.
- Each change alone against Cotillion and Foilist (2 battles each, against about 31 to 39% for k3KE):
  only **sgn** collapses, 8% against Cotillion. With no wave in flight JayLexi drives straight away,
  so its lateral speed is exactly 0 and every wave the enemy fires then has direction 0. Every
  guess factor on such a wave is 0, so every hit lands at 0 and both surf options look the same.
  The epsilon is there for that reason; it stays on the surf's direction.
- The other changes are within the noise of two battles there.

| Arm | Changes | Bytes | gap-field | mini | mini2 | Division mean |
|---|---|---|---|---|---|---|
| k3gF | radar, gsgn, keep, hbb, capfin, decel, gdist, tr | 1,496 | -4.32 ± 1.61 | -3.55 | -6.20 | -4.88 |
| k3gG | radar, keep, hbb, capfin, decel, gdist, tr, p3b | 1,484 | -1.86 ± 0.45 | -2.55 | -2.22 | **-2.39** |

- The gun's epsilon matters as much as the surf's: k3gF, with only the gun's taken out, collapses
  like k3gC. An enemy that stops dead (lateral speed exactly 0) gives gun waves direction 0, so the
  gun aims head-on at it and logs every pass in the middle bin.
- With both epsilons kept, k3gG still loses 2.39 against 0.2, about 2.9 against k3KE. So more than
  one of the other changes costs real APS, and two battles a bot were too few to see which.
- **Bundles hide which change is bad.** Each change has to be priced on its own on all three
  fields, like the cuts in rounds 5 to 7.
- The shipped re-golf at 1,598 B is kept as `kitlab/arms/JayLexi-k3KEs.java`.

### Round 9: each play change on its own, and k3KE run again

Each arm is the shipped k-NN build (k3KEs, 1,598 B, the same play as k3KE bit for bit) with one
change. Division mean and gap-field are against 0.2, as in every round.

| Arm | Change | Bytes saved | gap-field | mini | mini2 | Division mean | vs k3KEs |
|---|---|---|---|---|---|---|---|
| **k3KEs** | **none: k3KE run again** | 0 | +0.69 ± 0.24 | +0.14 | +0.36 | **+0.25** | |
| k3sgdist | no distance segment in the gun | 10 | +0.65 ± 0.27 | +0.24 | +0.54 | +0.39 | +0.14 |
| k3shbb | no energy update when the enemy hits us | 15 | +0.51 ± 0.23 | +0.08 | +0.55 | +0.32 | +0.07 |
| k3skeep | a wave that hit us passes on its own a tick later | 13 | +0.88 ± 0.29 | +0.05 | +0.38 | +0.21 | -0.04 |
| k3scap | no energy/15 power cap | 11 | +0.45 ± 0.29 | +0.11 | +0.30 | +0.20 | -0.05 |
| k3str | gun waves start at the gun | 9 | +0.45 ± 0.31 | -0.36 | +0.76 | +0.20 | -0.05 |
| k3sfin | no finishing power cap | 14 | +0.77 ± 0.23 | +0.03 | +0.15 | +0.09 | -0.16 |
| k3sdecel | the prediction brakes at 1 a tick | 19 | +0.21 ± 0.23 | -0.43 | +0.29 | -0.07 | -0.32 |
| k3sradar | the radar lock trick | 7 | +0.37 ± 0.26 | -0.19 | -0.44 | -0.31 | -0.56 |

- **k3KE's +0.52 read high.** The same play run again gives +0.25. It was the best of about twenty
  arms, so some of its lead was luck. The two runs together put the k-NN surf at about +0.4 on the
  division samples. The gap-field (+0.69) held in both runs.
- Five changes cost nothing measurable (gdist, hbb, keep, cap, tr): 58 bytes, 1,598 to 1,540.
  - The rest cost: the finishing cap 0.16 (14 B), braking 0.32 (19 B), the radar trick 0.56 (7 B).
    Even all three would leave the build at 1,507 B, still 11 over, at a cost of about 1.0, more than
    the k-NN surf is worth.
- So the k-NN surf does not fit in a Mini with its gain intact. The changes that come free reach
  1,540 B, 44 over the 1,496 target. No other cut priced in rounds 5 to 9 is free.
