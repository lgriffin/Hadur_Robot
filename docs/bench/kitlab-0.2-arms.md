# JayLexi and Eveimear 0.2: the first three rounds of arms (29 Oct)

These arms come from the live read in [live-kitlab-0.1.md](live-kitlab-0.1.md). Each one runs on
two 48-bot samples, `kitlab/<rumble>-field.txt` (seed 1) and `kitlab/<rumble>2-field.txt`
(seed 2, drawn on 29 Oct). Each sample is paired against its reference (Komarious 1.88 at 87.54
and 87.45, Épéeist 3.7 at 85.06 and 84.99). Battles are 2 seeds unless marked, and every
interval is about ±0.45 per sample.

Read on both samples together, the 0.1 builds come out at 86.93 (live 86.95) and 83.62 (live
83.36). Sample 1 alone had read Eveimear at 84.28, so a second sample is worth keeping.

| Bot | Arm | Change | Sample 1 | Sample 2 | Mean | Against 0.1 |
|---|---|---|---|---|---|---|
| JayLexi | 0.1 | orbit 1.15 | 87.05 (4 seeds) | 86.81 | 86.93 | |
| JayLexi | Ja | power by own energy, Komarious-style | 85.12 | 85.31 | 85.22 | -1.71 |
| JayLexi | Jb | danger over the nearer of the enemy and the wave | 86.56 | 87.11 | 86.84 | -0.09 |
| JayLexi | Jc | gun segment for the wall behind the enemy | 86.09 | 86.37 | 86.23 | -0.70 |
| JayLexi | Jac | Ja and Jc | 85.55 | 87.06 | 86.31 | -0.62 |
| JayLexi | Jp200 | power 3 inside 200 px | 86.68 | 86.60 | 86.64 | -0.29 |
| JayLexi | Jp22 | power 2.2 beyond 150 px | 86.27 | 86.01 | 86.14 | -0.79 |
| JayLexi | Jp25 | power 2.5 beyond 150 px | 86.04 | 86.63 | 86.34 | -0.59 |
| JayLexi | Jd1 | orbit 1.0 + distance / 2000 | 86.07 | 86.95 | 86.51 | -0.42 |
| JayLexi | Jd2 | orbit 0.95 + distance / 1500 | 86.63 | 86.93 | 86.78 | -0.15 |
| Eveimear | 0.1 | | 84.28 | 82.96 | 83.62 | |
| Eveimear | Ea | radar lock (twice the turn) | 83.34 | 82.79 | 83.07 | -0.55 |
| Eveimear | Eb | random reversal by enemy bullet speed over distance | 84.69 | 82.85 | 83.77 | +0.15 |
| Eveimear | Eb (4 seeds) | same, re-read | 83.91 | 83.11 | 83.51 | -0.11 |
| Eveimear | Eab | Ea and Eb | 84.22 | 83.68 | 83.95 | +0.33 |
| Eveimear | Eab (4 seeds) | same, re-read | 84.20 | 83.11 | 83.66 | +0.04 |
| Eveimear | Ec | gun segment for the wall ahead of the enemy (+74 bytes) | 83.71 | 83.95 | 83.83 | +0.21 |
| Eveimear | Eg1 | gun lateral speed in 3 bands | 83.63 | 82.27 | 82.95 | -0.67 |
| Eveimear | Eg2 | gun distance in 256 px bands | 83.03 | 82.86 | 82.95 | -0.67 |
| Eveimear | Eg12 | Eg1 and Eg2 | 83.37 | 82.25 | 82.81 | -0.81 |

No arm beats 0.1 by more than the noise. JayLexi's power rule, orbit, danger and gun segments sit
at their best values already, and so do Eveimear's gun segments and movement settings. The 0.1
builds are a local optimum for changes this small. What the live read asks for (survival against
learning guns for JayLexi, and against even and strong bots for Eveimear) needs bigger changes,
which cost bytes and have to be traded for.

## Round 4: JayLexi surfs the second wave (29 Oct, afternoon)

Reading an arm against 0.1's own runs on the same sample (4 seeds each) is tighter (about ±0.3)
than reading both against the reference. 0.1 re-read on 4 seeds on sample 2 at 87.50, against
86.81 on 2 seeds, which shows how far one 2-seed read can drift.

| Arm | Change | Bytes | Against 0.1, sample 1 | Against 0.1, sample 2 |
|---|---|---|---|---|
| J2w | the second wave in flight adds a quarter of its danger | 1,537 | +0.17 ± 0.33 | +0.55 ± 0.35 |
| J2l | predict on from the first wave into the second (a fifth) | 1,538 | -0.08 ± 0.27 | -0.62 ± 0.51 |
| Jnw | gun without the wall segment | 1,454 | about -1.3 | |
| Jnb | no bullet-hit-bullet logging | 1,470 | about -1.7 | |
| J2w C1 | J2w, surf stats without the distance segment (-17 B) | 1,520 | -0.20 | -0.47 |
| J2w C3 | J2w, gun history by ticks / 10 (-10 B) | 1,527 | -0.55 | -0.08 |
| J2w C5 | J2w, no energy cap on power (-11 B) | 1,526 | -0.49 | -0.22 |
| J2w C2 | J2w, gun lateral speed / 3 (-9 B) | 1,528 | -0.39 | -0.51 |
| J2w C4 | J2w, no kill cap on power (-8 B) | 1,529 | -0.57 | -0.33 |
| J02 | J2w with C1, C3 and C5 (fits, 1,496 B) | 1,496 | -0.05 ± 0.29 | -0.04 ± 0.34 |

Surfing the second wave is worth about +0.36, but every cut that pays for its 41 bytes gives the
gain back. Only a rewrite that saves bytes without changing behaviour can bank it.

## Round 5: the second wave, fitted (29 Oct, evening)

J2w's play rewritten in 1,485 bytes without changing a single order: the prediction made static
(the robot reached through a static field), the wall segment counted as an int product instead of
nested conditions, a `wave(k)` helper for the list reads, Wave.log taking the bin rather than the
point, `test()` without a negation, and fewer locals. `JayLexiReplayTest` drives the shipped code and
the readable J2w (kept in the tests as `hadur117.mini.ref.JayLexi`) through seeded scripts of scans,
hits, collisions and shots, and every order matches bit for bit (5 seeds x 10 rounds x 2,000 ticks
by hand; 3 x 6 x 1,500 in the build). Changing the second wave's quarter to a third fails it at the
first tick that has two waves, so it does tell builds apart. Battles on the bench are not
repeatable even with a fixed seed (the same jar matched itself in only 264 of 840 rounds), so the
proof is the replay, not a battle.

The fitted build (J2g) was benched on 4 more seeds per sample. Since it plays as J2w, the two
4-seed runs pool to 8 seeds:

| Build | Bytes | Sample 1 against 0.1 | Sample 2 against 0.1 |
|---|---|---|---|
| J2w (4 seeds) | 1,537 | +0.17 ± 0.33 | +0.55 ± 0.35 |
| J2g (4 more seeds) | 1,485 | +0.06 ± 0.21 | +0.41 ± 0.34 |
| Pooled (8 seeds) | | +0.11 | +0.48 |

About +0.3 across both samples, which on 0.1's live 86.95 projects about 87.25, still short of
WeeksOnEnd's 87.35 for 5th. 11 bytes are spare for the next change.

