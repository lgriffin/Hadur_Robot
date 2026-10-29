# JayLexi 0.2: the first live pass, and the gap to 1st

Released 2026-10-29 17:15 UTC (tag `jaylexi-v0.2`). A cloud client ran JayLexi's pairings first from
18:45 UTC and was halted at 20:12 UTC on Leigh's word. The pages were saved at 20:10 UTC and are in
`data/rumble/pages/` under `2026-10-29T2010Z_*`. The per-opponent rows for 0.1 (retired), FoilistMC
and Komarious come from the LiteRumble API (`BotDetails?api=true`), read at 20:20 UTC after the
client had stopped, and are saved in `data/rumble/parsed/2026-10-29T2020Z_*.json`. The table and the
groups use those rows (JayLexi 0.2 at 788 battles, 87.43); the saved rankings page caught it a few
battles earlier (783 battles, 87.42). `python3 data/tools/kitlab_live_gap.py` with the JayLexi 0.2,
FoilistMC, JayLexi 0.1 and Komarious files, in that order, prints the groups below.

| Bot | Rank | APS | Survival | Pairings | Battles |
|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 1st | 88.99 | 95.43 | 670 | 22,121 |
| jk.mini.CunobelinDC 1.2 | 2nd | 88.77 | 94.85 | 670 | 44,638 |
| sheldor.mini.Foilist 1.3.1 | 3rd | 88.48 | 95.07 | 670 | 22,297 |
| voidious.mini.Komarious 1.88 | 4th | 87.43 | 94.25 | 670 | 41,879 |
| **hadur117.mini.JayLexi 0.2** | **5th of 671** | **87.43 ± 0.29** | 94.21 | 670 | 788 |
| simonton.mini.WeeksOnEnd 1.10.4 | 6th | 87.33 | 93.60 | 670 | 48,638 |
| JayLexi 0.1 (retired) | was 6th | 86.93 | 93.80 | 670 | 943 |

- **0.2 is 5th, level with Komarious on two decimals.** It passed WeeksOnEnd. On the 668 opponents
  all four bots share, 0.2 is +0.47 over 0.1 (87.53 against 87.06). The bench said about +0.3, so
  second-wave surfing carried and then some.
- **The gap to 1st is 1.57** (FoilistMC 88.99). On the shared opponents it is 1.57 as well (87.53
  against 89.10). The gap to 2nd is 1.34, to 3rd 1.05, to 4th 0.00.
- Each pairing is mostly one battle (565 of 668), so single rows are noisy (about ±7). The groups
  below average hundreds of rows and are what to trust; the standard error on the biggest group is
  about 0.3.

## Where the 1.57 goes

The opponents split by how well FoilistMC survives against them. "Share" is the group's part of the
APS gap (its mean difference times its part of the field).

| Opponents (FoilistMC survival) | n | 0.2 − FoilistMC | share | survival 0.2 − FoilistMC | 0.2 − 0.1 | 0.2 − Komarious |
|---|---|---|---|---|---|---|
| Crushed (97% and up) | 477 | -1.53 | **-1.09** | -0.6 | +0.35 | +0.24 |
| Easy (90 to 97%) | 80 | -3.25 | **-0.39** | -3.7 | -0.22 | -0.79 |
| Even (75 to 90%) | 80 | -0.04 | -0.01 | -0.8 | +1.59 | -0.63 |
| Strong (under 75%) | 31 | -1.79 | -0.08 | -4.9 | +1.08 | -0.82 |

- **Seven tenths of the gap (1.09 of 1.57) is the weak field**, the 477 bots FoilistMC beats almost
  every round. JayLexi scores 93.78 there against FoilistMC's 95.30, while Komarious scores 93.53. So
  this is not a JayLexi fault Komarious avoids: FoilistMC farms the weak field better than both.
  - About half of it is **lost rounds**. JayLexi survives 99.08% of rounds against them, FoilistMC
    99.68%. Each lost round against a weak bot costs most of that round's score.
  - The other half is **damage taken in rounds JayLexi wins**. On the 385 weak bots JayLexi never
    lost a round to, it is still 0.79 short of FoilistMC (and 0.62 over Komarious).
  - **Nanobots are the worst of it**: 96 of them, 2.34 short each. Nanos fire head-on, linear or
    simple circular aim, and many ram. A surfer that has seen no hits yet dodges them by luck.
- **A quarter (0.39) is the easy group**, 80 bots where FoilistMC survives 90 to 97%. Here JayLexi
  loses on survival (3.7 points less), and it is 0.79 under Komarious too. 0.2 gained nothing here
  over 0.1 (-0.22).
- **Even and strong opponents are not where 1st is lost** (0.09 between them). Second-wave surfing
  is what closed them: +1.59 and +1.08 over 0.1.

Rows to read with care (one battle each, mostly): BulletCatcher 21.9 (FoilistMC 84.2; a bullet
shielder, JayLexi has no answer to it), MirrorMicro 66.8 (86.2; a mirror mover), HedgehogGF 46.5
(65.8), Épéeist 46.2 (63.5, two battles), ChocolateBar 51.6 (67.7, four battles), VirginSteele 75.1
(92.3), LigMA 76.0 (91.1).

## What 1st needs

The gap is in the weak field, not against the strong bots, so 0.3 should be judged on bots that
use simple aim:

- **Simple-gun dodging before the surf has data.** Seed the danger with where head-on and linear aim
  would hit, so the first waves are dodged by design and not by chance. This is the same lever Hadur
  1v1 has on its list (simple-gun movement).
- **Fewer lost rounds to rammers and close-range bots**: keep distance on a bot that closes, and
  stop firing power 3 when energy is low against them.
- **Bullet shielding and mirror movers** are single rows, worth about a tenth of APS together
  (BulletCatcher alone is 0.09).
- The bench sample already weights the weak field as the rumble does (71% of its weight), but that
  weight sits on only 26 bots, 7 of them nanos. A 0.3 arm aimed at simple guns should also run on a
  nano-heavy draw, so a gain there is not lost in the noise of a few rows.

Bytes: 0.2 is 1,485 of 1,499 with 3 to keep spare, so 11 bytes are free. Any of the above needs
golfing elsewhere first.
