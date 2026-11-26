# Sepia 0.0.1: first look at the lab arms (smoke, 25 November 2026)

A smoke run of Sepia's three silent arms against the movement lab's six shooters, to check that the
ink planner and the two gaits work in the engine. **It is not a measurement**: one seed of 35 rounds
an arm and shooter, on a 4-core cloud box, with a Maven build running beside part of it. The
`cloud-ink-lab` card (12 seeds, silent Hadur as the reference, cover read from truth logs) is the test.

Arms ([sepia.md](../../sepia.md), "Arms"): `sp` the jet cycle with ink only, `sj` the jet cycle with
the ink off, `ss` the ink surf with ink only. None punches. Engine 1.12.0, `--rounds 35 --seeds 1`.

Read from Sepia's own INK records (INK-6), one per enemy wave. **Hit** is the share of enemy waves whose
bullet hit Sepia. **Shaded** is the share of the landing's hit set our ink shaded when the wave reached
the body, as Sepia planned it; it is not cover measured from the truth log (`ink_read.py`, not built).
**Met** is the share of bullets that either hit Sepia or met its ink that met its ink; it counts bullets
that would have missed too.

| Shooter | Hit: `sj` | Hit: `sp` | Hit: `ss` | Shaded: `sp` / `ss` | Inks a wave: `sp` / `ss` | Met: `sp` / `ss` |
|---|---|---|---|---|---|---|
| lab.HeadOn | 0.9% | 0.6% | 1.7% | 0.34 / 0.35 | 1.32 / 1.48 | 0.56 / 0.51 |
| lab.Linear | 7.4% | 3.7% | 4.6% | 0.32 / 0.33 | 1.47 / 1.47 | 0.65 / 0.62 |
| lab.Circular | 6.6% | 4.8% | 3.6% | 0.30 / 0.35 | 1.37 / 1.49 | 0.59 / 0.65 |
| lab.GFHist | 23.2% | 12.0% | 8.5% | 0.29 / 0.33 | 1.39 / 1.48 | 0.51 / 0.58 |
| lab.Knn | 25.3% | 10.0% | 8.0% | 0.30 / 0.32 | 1.49 / 1.51 | 0.60 / 0.62 |
| lab.PatternMatch | 26.7% | 9.8% | 10.7% | 0.33 / 0.32 | 1.51 / 1.46 | 0.58 / 0.56 |

Mean score share: `sj` 33.4%, `sp` 54.6%, `ss` 58.1%. Skipped turns: 0.2, 2.7 and 2.7 a battle.

What it suggests, to be checked on the card:

- **The ink does a lot.** Against the three learning guns, inking cut the waves that hit from 23-27% to
  8-12%. Planned shade sits at 29% to 35% of the hit set on every shooter, under the cloud model's 48%.
- **The jet cycle alone is very readable.** With the ink off, GFHist, Knn and PatternMatch hit 23% to 27%
  of their waves. The lab's first read had GFHist and Knn hitting silent Hadur with 9.3% and 13.3% of their
  bullets (a different count, bullets fired, not waves): the jet cycle looks about twice as hittable, past
  the card's gate 3 (no more than 1.5 times silent Hadur's damage). This is the risk the APS estimate
  turned on.
- **The ink surf with ink is the better of the two** against the learning guns (8.0% to 10.7%), near what
  silent Hadur takes, which is the case for giving the ink surf to Hadur behind a switch.
- The planner costs time: about 2.7 skipped turns a battle with ink on, against 0.2 without.

Raw output (battles, INK records) stayed on the box; rerun with `hadur-bench/tools/sepia_arms.sh sp,sj,ss` and
the lab panel.
