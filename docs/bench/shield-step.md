# 1v1: the shield's own step aside (2026-10-31)

Leigh 2026-10-31: claw every APS BeepBoop holds over us, and run what we need in the cloud to find it. BeepBoop
leads us by +0.35 APS on the robots we both shield and by +0.32 on the 64 robots it shields and we surf
(write-up "Hadur vs BeepBoop: where the 3.16 goes", Claude Doc).

## What leaks

A cloud read of the 9 robots BeepBoop shields and we don't (seeds 6200-6201, 35 rounds) ran Hadur with the
shield forced on (`shield-all`). The shield meets about 97% of the bullets it plans for, and the rest leak at
about one a round, which reaches SHIELD-11's 150-damage exit. The truth log says most leaks were exactly
head-on bullets from a still enemy, yet the `SB` records said no predictor matched them.

A local debug build added two telemetry records: `SW` (each enemy wave's scan ticks, positions and five base
headings) and `SD` (each hit's exact heading and its matched wave). Against Hydrogen, Toa, Pytko and Princess,
one battle each:

| Robot | Leaks | Error of the bases |
|---|---:|---|
| Hydrogen | 16 | every base off by the same +-0.00017 to 0.00048 rad, alternating sign: 0.1 px at the range |
| Toa | 16 | about half the same signature; the rest +-0.00004 rad |
| Pytko | 17 | some the same; the rest 0.007 rad and more (a moving aim) |
| Princess | 10 | 0.01 to 0.1 rad (a moving aim) |

0.1 px is `ShieldMode.WIGGLE`, the step aside a shield shot takes so that its bullet crosses the enemy's
(SHIELD-5). The plan steps on the tick before it fires and steps back after. An enemy that aims a few ticks
before it fires sees us mid-step, so its bullet is head-on to a point 0.1 px off where we stand, which no
predictor holds; the side alternates, so the learned offsets cannot follow it either. The existing guard keeps
the step off the 3 ticks before the enemy's gun is cool; widening it to 7 (`g6`) did nothing (74.6 vs 75.4).

## SHIELD-20: plan from where we stand first

BeepBoop's shielder scores plans on shadow and prefers no wiggle. SHIELD-20 (`ShieldDesign.still`,
build-ablation `sstill`, suffix sz) tries every plan without the step first and steps only when none casts a
shadow; a bullet dead on our centre casts none from where we stand, so those still take the step.

Cloud reads (35 rounds, 4-core box):

| Read | Arm | Score share |
|---|---|---:|
| 9 BeepBoop-only shield robots x 2 seeds, shield forced on | 3.20 surf | 77.6 |
| | shield as now | 75.4 |
| | wider guard (g6) | 74.6 |
| | **still** | **83.9** |
| | BeepBoop 2.0 | 92.9 |
| 36 shield-listed robots x 2 seeds (seeds 6300-6301), paired with master | sz - master | +2.56 +- 2.22 points a robot |
| | 20 with BeepBoop's biggest leads | +3.66 +- 3.72 |
| | 16 at random | +1.20 +- 1.74 |

Per robot on the 9: Pytko 72.5 -> 98.7, Toa 80.5 -> 96.0, Warlord 83.8 -> 96.9, Hydrogen 70.2 -> 84.5;
Princess and CassiusClay did not move (moving aims, and CassiusClay's 0.1-power spam). On the 36: Firebird
+29.7, Pytko +12.4, Toa +12.7, Cyprus +9.7; RainbowBot -9.9, Blade -5.6, Coriantumr -5.5, NDH.GuessFactor -5.1.

If the random 16 are typical of the 273 listed robots, sz is worth about +0.27 APS (the band is wide: 0 to
+0.6), and cloud per-robot gains have shrunk two to three times on the PC before (pc-shield-exit).

## PC card

`plans/pc-shield-still.queue` (BENCH-152, about 1.7 h, Leigh starts it): sz on the 273 listed robots
(`panel-shield-listed-320.txt`) x 2 fresh seeds, then SHIELD-20 with BeepBoop's 64 extra robots on the list
(`panel-beep-shield-only.txt`, `plans/beep-shield-add.txt`) x 3 fresh seeds, each beside c and aa, gated at
+0.05 APS with a per-robot pick of the 64.

## PC result (pc-shield-still, PR #510, 2026-10-31)

Halted once by its A/A rule at the band edge (#505), resumed without stop rules on Leigh's call.

| Arm | APS vs pooled c and aa | Gate | Verdict |
|---|---:|---:|---|
| sz, 273 listed robots | +0.09 +- 0.12 | +0.05, low end above 0 | FAIL |
| szmt, BeepBoop's 64 added | +0.01 +- 0.08 | +0.05, low end above 0 | FAIL |

By robot it splits: 31 listed robots gain over 5 points (+0.24 APS in sample: Pytko +21, Firebird +17, Lucid +15,
Toa +15, all four also up in the cloud on other seeds), 23 lose over 5 (-0.16: LigMA -20, Blade -12, AHEB -11). The
szmt pick locks 9 of BeepBoop's 64 at a 5-point margin (+0.09 APS in sample, Hydrogen +21).

## SHIELD-21: still plans per opponent

A `shield-still:` line on the shield list turns SHIELD-20 on for that robot only (build-ablation `szlist`, suffix
zl). `plans/pc-shield-still2.queue` (BENCH-158, about 12 min) re-measures the 40 picks
(`plans/shield-still-picks.txt`, the 9 added to the list from `plans/shield-still-add-picks.txt`) at 4 fresh seeds,
gated at +0.05 APS, with a 5-point per-robot pick for the lines to ship.

## PC confirm (pc-shield-still2, PR #515, 2026-10-31)

40 picks x c / aa / mtzl x 4 fresh seeds (480 battles, 9 min). mtzl - pooled c and aa: **+0.17 +- 0.07 APS** over
the 40 (bar +0.05); +5.19 +- 2.16 points a robot against c, +4.6 against aa. The gate reads FAIL only because its
A/A drifted outside the band (aa - c +1.15 +- 1.03 points, band +-0.92), a quarter of the effect. The 5-point pick
locks 17 robots (+11.3 points where locked, +0.16 APS in sample): Lucid +22.6, Pytko +17.0, Numbat +16.2, Hydrogen
+13.9, Bandit2002 +13.3, UnfoolableNano +12.9, Toa +12.5, Warlord +12.2, Bones +11.6, Predator +10.6, GeomancyBS
+8.6, Pequod +7.9, Shiva +7.5, Fenrir +7.5, Spark +7.3, Hyperion +5.4, Carpet +5.1. Losers among the 40: Holden -8.2,
RSK1 -7.7, Lindada -6.0, GloomyDark -5.4 (they keep the step).

Shipped on master for the next census: the 17 as `shield-still:` lines (`ShieldTableData.stills()`), and the 7 of
them from BeepBoop's list (Spark, Predator, Bandit2002, Warlord, UnfoolableNano, Hydrogen, Numbat) on the shield list.
