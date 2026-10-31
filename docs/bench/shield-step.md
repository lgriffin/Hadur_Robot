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
