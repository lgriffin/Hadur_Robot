# 3.11 live (2026-10-11 02:23 UTC): 13th, 0.12 under 10th

Pages saved by Leigh at 02:23 UTC: Hadur 3.11's BotDetails page and the 1v1 rankings, archived
in `data/rumble/pages/2026-10-11T0223Z_*` and parsed to `data/rumble/parsed/2026-10-11T0223Z_*`.
All 1,216 pairings are in, 4,224 battles (3.5 a pairing; only 51 pairings still have one battle).
The first battle was at 14:59 UTC on 2026-10-10. Leigh's chart of the late slide:
https://claude.ai/artifact/XYCmFu9uZp5gFvxt6Sh1i2.

| Release | APS | Rank | Battles |
|---|---|---|---|
| 3.11 | **87.56** | **13th** | 4,224 |
| 3.10, second pass | 87.33 | 13th | |
| 3.9 | 87.15 | 13th | 1,885 |

The top of the table, 3.10's second-pass page against this one:

| Robot | 2026-10-08 17:34 | 2026-10-11 02:23 |
|---|---|---|
| Firestarter 2.0f | 88.12 (7th) | 88.10 (7th) |
| Raven 3.56j8 | 87.75 | 87.72 |
| XanderCat 12.9 | 87.73 | 87.71 |
| Knight 0.6.28 | 87.70 | 87.68 (10th) |
| Tomcat 3.68 | 87.70 (10th) | 87.64 |
| Gilgalad 1.99.5c | 87.63 | 87.62 |
| Hadur | 87.33 (3.10) | 87.56 (3.11, 13th) |

## 1. The slide at the end is the noise floor

Ranks 8 to 13 sit inside 0.16 APS (87.72 to 87.56). The census plan puts the noise floor of a
reading at about ±0.14 APS, so the order inside that pack is a coin toss on any given read.

Two things move a reading before the pass settles:

- **Which bots are in.** Hadur's per-pairing scores have a spread of 11.4 points. With 1,000 of
  1,216 pairings in, the mean of whichever thousand have arrived differs from the full mean by
  ±0.15 (one standard error, finite population). 7th or 8th at about 1,000 pairings needs
  87.75, which is 0.19 above the final figure: about one standard error.
- **Thin pairings filling in.** Leigh's chart shows the last stretch from 87.70 (10th, 2,764
  battles, 1,207 pairings) to 87.56 (4,306 battles). The nine late pairings cost 0.02. The rest
  came from second and third battles on pairings that had one or two: Mimic, MatchupMini and
  Wintermute each dropped 9 to 26 points.

`live_passes.py collapses` finds no collapsed single battles on this page (0 of 50 single-battle
pairings, against 16 on 3.9's first pass), so unlike 3.10's first pass, no client pulled it down.

## 2. Against 3.10 by band

Same opponents (1,215), 3.11 minus 3.10's second pass, against what the bench predicted
(census-312 G4, nd minus 3.10).

| Band (ranks) | Pairings | 3.11 | 3.10 | Per pairing | APS live | APS bench |
|---|---:|---:|---:|---:|---:|---:|
| 1 (1-10) | 10 | 46.13 | 48.23 | -2.10 | -0.017 | +0.018 |
| 2 (11-50) | 38 | 62.26 | 61.18 | +1.09 | +0.034 | -0.001 |
| 3 (51-200) | 150 | 77.09 | 77.19 | -0.10 | -0.012 | +0.117 |
| 4 (201-400) | 200 | 81.69 | 80.85 | +0.84 | +0.139 | +0.108 |
| 5 (401-700) | 300 | 87.21 | 87.21 | +0.01 | +0.002 | +0.264 |
| 6 (701+) | 517 | 95.78 | 95.54 | +0.24 | +0.101 | +0.211 |
| All | 1,215 | | | +0.25 | **+0.25** | **+0.73** |

3.11 gained a third of what the bench measured. That is the outcome the census warned of: the
bench lost 0.7 APS to round-0 warm-up duress because the PC skipped turns in 61% of its battles
under bench load, and live clients skip far fewer, so removing duress returns less there. Band 4
gained as forecast; bands 3 and 5, where the bench put 0.38 of the gain, are flat.

## 3. Three volatile pairings worth half the gap to 10th

| Opponent | Band | 3.11 | 3.10 | Battles (3.11 / 3.10) | Bench share (nd, 4 seeds) |
|---|---|---:|---:|---|---:|
| stelo.MirrorMicro 1.1 | 5 | 42.5 | 85.2 | 7 / 4 | 92% |
| non.mega.NaN 0.1 | 4 | 62.5 | 91.3 | 9 / 3 | 91% |
| mn.micro.perceptual.Mimic 1.0.0 | 6 | 70.6 | 94.5 | 5 / 3 | 94% |

Together they cost 0.08 APS against 3.10, two thirds of the 0.12 to 10th. None of them is new:
across the eight saved BotDetails pages they range from 42 to 92 (MirrorMicro), 27 to 92 (NaN)
and 70 to 95 (Mimic). The bench usually scores them at 91 to 94, but not always: some bench
builds read MirrorMicro at 62% ± 45 and 79% ± 41, an interval that wide meaning a few battles
near zero among many near 95. So these look like all-or-nothing pairings (by their names, MirrorMicro and
Mimic copy their opponent's movement), where one bad battle swings the pairing by 20 to 40 points. This is
a lead to test, not a finding: reading the bad battles round by round would say what goes wrong.

## 4. What it means

- 3.11 is the best 1v1 reading Hadur has had (87.56, against 87.33 and 87.15), and it sits with
  Raven, XanderCat, Knight, Tomcat and Gilgalad inside the noise floor. More battles will move
  it inside that pack, not out of it.
- 10th needs a real gain of about 0.3 APS, as the plan's release gate already says. The bench
  gap to Tomcat from M5 is ranks 401+ (-0.65 APS on the bench, bullets taken from simple guns).
- The volatile pairings in section 3 are the cheaper first look: if one cause sits behind the
  bad battles, a fix is small and worth up to 0.08 APS.
