# The 1:1 map: every opponent's class against the live pages of Hadur and six rivals (2026-10-28)

Leigh (2026-10-28 22:52): "A 1:1 mapping and classification keeps being ignored. Micro changes are not
shifting us positively." This is the map, built from what the repo holds: the 2026-10-18 census classes
(`2026-10-18_census-classes.tsv`, the opponent's gun class and movement class) joined to Hadur 3.17 and
3.18.1 pooled by battles (3,618 battles, same code, 91.08 pooled against 91.34 on the page) and the
rivals' BotDetails pages (Saguaro, ScalarR, JKHydra, Ogi of 2026-10-25; BeepBoop, DrussGT, Nullstride,
Diamond of 2026-10-15), with Hadur's table mode (`ShieldListData`, `ShieldTableData`) and both rivals'
shield lists. One row per opponent in `2026-10-28_one-to-one-map.tsv`. The plan it feeds is the Claude Doc
"Hadur: the 1:1 map, tonight's card, and the road to 1v1 king".

Lead = the rival's live score minus Hadur's, summed over the class / 1,219 pairings (APS). Ceiling = the
best of the six rivals on each robot, summed the same way.

| Gun class | Movement class | Bots | Hadur live | BeepBoop lead | DrussGT lead | Saguaro lead | Best-rival ceiling |
|---|---|---:|---:|---:|---:|---:|---:|
| learning | flat | 431 | 84.5 | +2.11 | +0.61 | +0.03 | +2.79 |
| learning | stat-prone | 178 | 94.3 | +0.34 | +0.19 | +0.22 | +0.52 |
| linear | rammer | 19 | 75.8 | +0.22 | +0.10 | +0.11 | +0.25 |
| mixed | rammer | 28 | 85.3 | +0.19 | +0.11 | +0.08 | +0.22 |
| mixed | flat | 48 | 92.7 | +0.14 | +0.07 | +0.05 | +0.17 |
| learning | oscillator | 30 | 88.6 | +0.11 | +0.03 | +0.02 | +0.16 |
| mixed | stat-prone | 49 | 95.5 | +0.10 | +0.05 | +0.04 | +0.12 |
| the other 436 | | 436 | 96.8 | +0.61 | +0.29 | +0.14 | +0.82 |
| All | | 1,219 | 91.1 | +3.82 | +1.45 | +0.69 | +5.05 |

- **Inside the 431, the gap is damage taken.** On the census rows of the class Hadur's share correlates
  -0.88 with bullet damage taken a round, -0.72 with the enemy's hit rate, +0.01 with Hadur's own hit rate.
- **225 of the 431 are on no shield list** (ours, DrussGT's, Nullstride's) and Hadur surfs them: Hadur 79.4
  live, BeepBoop +9.0 a robot (+1.66 APS), ScalarR +5.8, Diamond +3.9, DrussGT +3.7, Saguaro -1.8.
- **Saguaro's lead is three table groups**: the 129 robots DrussGT or Nullstride shield and Hadur surfs
  (Hadur 90.4, Saguaro +0.46), the 87 rammers (88.0, +0.23), the 82 stat-prone learning-gun robots played
  normally (93.7, +0.10): 293 robots, Saguaro +0.78, best rival +1.49.

The card `plans/pc-1to1.queue` (BENCH-133) runs the tournament on the first and third groups
(`panel-1to1-shield.txt`, 124 robots with the rammers out; `panel-1to1-learn.txt`, 103 learning- or
mixed-gun robots on stat-prone or oscillating movement, played normally, under 97 live). RAM-5 covers the
rammers (PR #394).

Reproduce: the sheet is a join in Python over the files above (names matched with and without version,
as `ShieldList` does); the per-class sums are over the sheet's `gap_to_best` and rival columns.
