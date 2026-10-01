# Hadur 3.4 against the top 19

Hadur 3.4 entered the top 20 of the 1v1 RoboRumble on 2026-10-01. This report reads the
complete LiteRumble BotDetails page saved that evening and compares Hadur with the 19 robots
ranked above it: head to head, by overall profile, and by where each side earns its points.

**Source:** `data/rumble/pages/2026-10-01T2020Z_roborumble_botdetails_hadur2.Hadur_3.4.mht`
(saved 2026-10-01 20:20 UTC; battles 09:04 to 16:04 UTC), parsed to
`data/rumble/parsed/2026-10-01T2020Z_roborumble_botdetails_hadur2.Hadur_3.4.csv`. The page
lists every pairing with Hadur's score against that opponent and the opponent's own overall
APS and survival, which is what the ranks below are derived from. The band and hour report
from the same page is [bench/live-details-3.4.md](bench/live-details-3.4.md).
[data/learnings.md](../data/learnings.md) L-29 to L-31 record the findings, and
`data/rumble/parsed/2026-10-01_hadur-3.4_vs_top19.tsv` adds the bench share against each of
the top 19 next to its live score (live tracks the bench at r = 0.96, L-30).

## Summary

- **Rank 20 of 1,216**, APS 85.90 ± 0.20, PWIN 99.26, ANPP 89.03, survival 93.92%, all 1,215
  pairings filled from 1,628 battles. 19 opponents on the page have an overall APS above
  85.90; the next below is davidalves.Phoenix 1.02 at 85.77.
- **Ireland's top robot.** The page carries a country flag for every opponent. Eleven other
  robots fly the Irish flag; the best of them, jam.RaikoMX 0.32, has 82.24 APS (rank 57).
- **Against the top 19 Hadur wins 10 of 19 pairings**, with a mean score of 47.7% ± 7.7. It
  beats Saguaro, Raven, XanderCat, Tomcat, GresSuffurd, WaveSerpent, Nene, WhiteFang,
  Neuromancer and Dookious, and loses to BeepBoop, Nullstride, DrussGT, ScalarR, Diamond,
  Firestarter, Knight, Gilgalad and Wavelet.
- **Against the strong, Hadur beats expectation; against the weak, it falls short of it.**
  Its KNN performance index (PBI: actual minus the score robots of its strength usually get)
  averages +5.1 against the top 100 and −1.7 against the 716 robots ranked below 500. That
  deficit alone costs about 1.0 APS overall, twice the 0.51 APS between Hadur and 19th place.
- **The weak-bot deficit is dropped rounds, not small margins.** Where Hadur wins every round
  of a weak pairing its PBI is −0.1, i.e. on par. The deficit comes from the 368 weak pairings
  in which it loses at least one round (1.4 rounds of 35 on average).
- **No live slide.** 3.0 and 3.1 lost 5 to 8 APS within hours of entering. 3.4's last 400
  pairings average 86.3 APS against 84.7 for its first 400; every hour from 12:00 to 15:00
  UTC sits between 86.0 and 86.9.

## Where Hadur stands

| | Hadur 3.4 | Top 19 (mean ± 95% CI) | Top 19 range |
|---|---|---|---|
| APS | 85.90 | 88.87 ± 1.25 | 86.41 (Dookious) to 95.02 (BeepBoop) |
| Survival | 93.92 | 95.38 ± 0.94 | 92.43 (Nene) to 99.20 (BeepBoop) |

Five of the top 19 survive less than Hadur does: GresSuffurd, WaveSerpent, Nene, WhiteFang
and Dookious. Across the top 100, APS follows survival closely (APS ≈ 0.72 + 0.919 × survival,
r = 0.95, residual SD 1.17). At its survival that line predicts 87.0 APS for Hadur, and it
scores 85.9: a residual of −1.1, lower than 83 of the top 100. Hadur is 17th by survival
and 20th by APS, and its APS is low for its survival, which points the same way as the PBI
split below: the rounds it wins are fine, but it hands a few rounds away to robots it should
beat.

**Rank margin.** The page's APS interval is ± 0.20. Rank 19 (Dookious, 86.41) is 0.51 above
it; rank 21 (Phoenix, 85.77) is 0.13 below, inside that interval, so 20th is held but not
safe from a few bad pairings. Rank 10 (Knight, 87.71) is 1.81 APS away.

## Head to head

One to three battles per pairing (24 in all), so each row on its own is noisy: a one-battle
pairing has a ± 7.84 interval on the page. The aggregate is the more reliable read.

| Rank | Opponent | Their APS | Hadur's score | Hadur's survival | PBI |
|---|---|---|---|---|---|
| 1 | kc.mega.BeepBoop 2.0 | 95.02 | 16.5 | 0.0 | −3.8 |
| 2 | jd.Nullstride 2.3.0 | 94.25 | 17.1 | 0.0 | −2.4 |
| 3 | jk.mega.DrussGT 3.1.16 | 92.60 | 38.3 | 25.7 | +5.0 |
| 4 | oog.mega.saguaro.Saguaro 1.0 | 91.87 | **70.6** | 82.9 | +23.3 |
| 5 | aaa.r.ScalarR 0.005h.053-noshield | 91.26 | 30.9 | 20.0 | +0.4 |
| 6 | voidious.Diamond 1.8.22 | 90.17 | 33.3 | 28.6 | −3.2 |
| 7 | cb.fire.Firestarter 2.0f | 88.13 | 34.8 | 14.3 | −9.0 |
| 8 | dsekercioglu.mega.Raven 3.56j8 | 87.74 | **59.6** | 74.3 | +11.4 |
| 9 | xander.cat.XanderCat 12.9 | 87.74 | **59.2** | 65.7 | +11.0 |
| 10 | rsalesc.mega.Knight 0.6.28 | 87.71 | 46.4 | 37.1 | +4.6 |
| 11 | lxx.Tomcat 3.68 | 87.70 | **59.3** | 71.4 | +14.0 |
| 12 | aw.Gilgalad 1.99.5c | 87.64 | 42.2 | 48.6 | −3.7 |
| 13 | pc.Wavelet 1.5 | 87.07 | 30.7 | 11.4 | −16.0 |
| 14 | gh.GresSuffurd 0.4.13 | 86.68 | **65.4** | 77.1 | +16.2 |
| 15 | kc.serpent.WaveSerpent 2.11 | 86.68 | **55.5** | 71.4 | +7.6 |
| 16 | cs.Nene 1.0.5 | 86.63 | **55.8** | 72.4 | +4.1 |
| 17 | dsekercioglu.mega.WhiteFang 2.8.1 | 86.63 | **73.5** | 88.6 | +22.1 |
| 18 | jk.melee.Neuromancer 7.12 | 86.59 | **51.6** | 42.9 | +0.1 |
| 19 | voidious.Dookious 1.573c | 86.41 | **65.1** | 82.9 | +16.6 |

Mean score 47.7 ± 7.7, mean survival 48.2 ± 13.6, mean PBI +5.2 ± 4.8. The top two are out of
reach (no round survived in either). Of the seven others Hadur loses to, Wavelet (−16.0)
and Firestarter (−9.0) fall furthest below expectation; the rest are within 4 points of it. Saguaro's 70.6 is the bullet-shielding counter at work
(SHIELD-1, SHIELD-2; [bullet-shielding.md](bullet-shielding.md)).

## Where the points are

Every pairing counts the same in APS, so the tiers with the most robots weigh the most.
"Points lost" is (100 − Hadur's score) summed over the tier and divided by all 1,215 pairings:
the APS that tier takes from a perfect 100. "PBI share" is the tier's PBI on the same scale:
what Hadur gains (+) or loses (−) there against a robot of its strength.

| Opponent rank | Pairings | Hadur's score | Survival | Mean PBI (± 95%) | Points lost | PBI share |
|---|---|---|---|---|---|---|
| 1-19 | 19 | 47.7 | 48.2 | +5.2 ± 4.8 | 0.82 | +0.08 |
| 21-50 | 30 | 63.9 | 76.4 | +5.3 | 0.89 | +0.13 |
| 51-100 | 50 | 69.6 | 83.6 | +5.0 | 1.25 | +0.21 |
| 101-250 | 150 | 75.8 | 89.0 | +0.8 | 2.99 | +0.10 |
| 251-500 | 250 | 80.8 | 92.9 | −0.6 | 3.95 | −0.13 |
| 501-1216 | 716 | 92.9 | 98.0 | −1.7 ± 0.25 | 4.21 | −1.02 |

Read down the PBI column: against the top 100 Hadur scores about 5 points more than robots
of its strength do (99 pairings), and against the bottom 716 about 1.7 less. The bottom tier is where the
next ranks are: lifting every negative weak-tier PBI to zero is worth 1.26 APS, which would
put 3.4 at about 87.2, rank 13. The ten pairings furthest below expectation are almost
all weak, simple robots, several of them rammers by their names (vort.Chaser −22.4,
bbo.RamboT −18.4, stelo.MirrorNano −17.8, zyx.nano.RedBull −16.4, PSW.Relentless −14.6,
mahrgell.mahrram −14.2); pc.Wavelet is the one top-20 robot among them. Whether these share a
cause (RAM-1's rammer response, or a round lost to a wall or an early collision) is a question
for the bench, not something this page can show.

## How 3.4 compares with 3.0 and 3.1

The same opponents, paired by name across the saved pages (2026-09-28 for 3.0, 2026-09-30 for
3.1). Mean difference in Hadur's score, ± 95% interval.

| Opponent rank (today) | vs 3.0 (507 common) | vs 3.1 (512 common) |
|---|---|---|
| All | +4.7 ± 0.7 | +4.0 ± 0.5 |
| 1-19 | −1.0 ± 7.1 (8) | +2.7 ± 3.3 (10) |
| 21-50 | +5.0 ± 3.5 | +1.8 ± 3.9 |
| 51-100 | +0.7 ± 5.2 | +3.5 ± 1.8 |
| 101-250 | +4.8 ± 2.2 | +5.4 ± 1.7 |
| 251-500 | +3.8 ± 1.6 | +4.2 ± 1.3 |
| 501-1216 | +5.3 ± 0.9 | +3.9 ± 0.6 |

| Release | Pairings | APS | Survival | PWIN | Rank |
|---|---|---|---|---|---|
| 3.0 (2026-09-28) | 507 | 81.57 | 82.58 | 98.42 | 64th |
| 3.1 (2026-09-30) | 512 | 81.46 | 82.99 | 98.44 | 65th (16th in its first hour) |
| 3.4 (2026-10-01) | 1,215 | 85.90 | 93.92 | 99.26 | 20th |

The gain is broad, and it is mostly survival: 82.6% to 93.9% of rounds. That is the live
slide going away. [data/learnings.md](../data/learnings.md) (L-01) estimated that without the
slide 3.0 would sit near 85.9 APS, about rank 21; 3.4 lands on 85.90. 3.4 changed none of the
fighting code (see [releases/v3.4.md](releases/v3.4.md)); between 3.1 and 3.4 the fixes were
rumble-safe memory, duress mode and a data directory that stays cheap with hundreds of
profiles (R5, R7, R8), plus R6's movement.

## Method

- Ranks come from the "Opponent APS" column: an opponent outranks Hadur if its overall APS is
  above 85.90. This is the live ranking as of the page's save, not the 2026-09-30 rankings
  snapshot.
- Means carry a normal 95% interval (1.96 × standard error) over pairings. Pairing scores are
  bounded and skewed, so the intervals on the small top tiers are rough.
- PBI is LiteRumble's KNNPBI column, taken as given.
- The regression is ordinary least squares of overall APS on overall survival over the 100
  highest-ranked opponents.
- Flags were read from the image name in each row's flag cell (`flags/IRL.gif`).
