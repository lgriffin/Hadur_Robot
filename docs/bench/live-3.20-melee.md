# Hadur 3.20 live: melee (2026-10-30 21:20 GMT)

Pages saved 2026-10-30 21:20 GMT: `data/rumble/pages/2026-10-30T2120Z_meleerumble_*`, parsed in
`data/rumble/parsed/2026-10-30T2120Z_meleerumble_*`. 3.20 plays melee exactly as 3.19 and 3.18.1 did
apart from power 3 out to 300 px (3.19, +0.14 ± 0.17 on the bench).

## Standing

| Rank | Robot | APS | ± | Survival | Battles |
|---:|---|---:|---:|---:|---:|
| 1 | aaa.r.ScalarR 0.005g.047 | 72.72 | 0.03 | 82.7 | 81,640 |
| 5 | voidious.Diamond 1.8.28 | 70.09 | 0.03 | 68.5 | 211,729 |
| 9 | ags.Glacier 0.2.11 | 68.84 | 0.04 | 44.7 | 13,743 |
| 10 | kc.mini.Mirage 0.2 | 68.22 | 0.04 | 52.6 | 13,674 |
| 13 | rz.Aleph 0.34 | 67.86 | 0.03 | 47.2 | 211,616 |
| **14** | **hadur117.Hadur 3.20** | **67.77** | **0.18** | **46.1** | **6,029** |
| 15 | hadur117.mini.Deise 0.4 | 67.62 | 0.24 | 52.2 | 1,567 |

Gap to 10th 0.45, to 9th 1.07, to 5th 2.32. The melee rank history: 3.15 17th 66.30; 3.17 16th 66.40
(10-25); 3.18.1 13th 67.92 (10-28); 3.19 14th 67.75 (10-29); 3.20 14th 67.77. The +1.45 over 3.17 on
the 414 robots both met is all 3.18's (MGUN-7 K=24, MEND-3, MGUN-13); nothing shipped for melee since.

## Where the points are, by opponent rank

Per-opponent means from the BotDetails page. KNNPBI is LiteRumble's comparison with the robots
ranked near Hadur: positive means Hadur takes more from that opponent than its neighbours do.

| Opponent rank | n | Hadur APS | Hadur survival | KNNPBI | Battles each | vs 3.17 APS | vs 3.17 survival |
|---|---:|---:|---:|---:|---:|---:|---:|
| 1-10 | 10 | 46.1 | 23.0 | +0.24 | 14.9 | +1.69 | +0.2 |
| 11-20 | 9 | 50.5 | 36.4 | **-0.45** | 11.3 | +2.04 | +9.2 |
| 21-50 | 30 | 54.5 | 37.4 | -0.11 | 15.8 | +1.49 | -1.8 |
| 51-100 | 50 | 57.9 | 41.5 | **-0.48** | 14.5 | +1.49 | +1.2 |
| 101-200 | 100 | 64.2 | 47.0 | +0.31 | 13.8 | +1.82 | +2.6 |
| 201-300 | 100 | 70.8 | 48.1 | +0.45 | 14.5 | +1.20 | +1.8 |
| 301-418 | 118 | 78.9 | 50.4 | +0.50 | 14.8 | +1.25 | +2.1 |

- Against the 89 robots ranked 11 to 100, Hadur takes less than the robots ranked around it; against
  the 318 weaker ones it takes more. The top 10 are level. Survival against ranks 11 to 100 is 36 to
  41%; the robots at 9th and 10th survive 45 to 53% overall.
- Deise 0.4, a 1,499-byte minibot, is one place behind at 67.62 with survival 52.2 against Hadur's
  46.1: it dies less and scores less. Hadur's gun is ahead; its crowd survival is behind.
- Worst single pairings among ranks 1-60 by KNNPBI: Saor 0.3 -4.85 (8 battles), Sprout -3.84 (33),
  Gruwel -2.77 (8), Alpha -2.66 (10), StoneGhost -2.14 (22), Wrekt -1.74 (29), SandboxDT -1.67 (41).
  These are mid-field minimum-risk movers and old-style guns, not the top 10.

## What this says for the plan

The melee surfer (MMOVE-15) is on master and census-passed at +0.99 ± 0.19 with others outlived +3.0
and two-left deaths -2.2 (PR #462): it moves exactly the survival this page says is short. It is not
live. It ships with the next minor, which waits until 1v1 and team have a gain ready too (Leigh's rule,
2026-10-30). The ScalarR switches on top were screened by pc-melee-scal (BENCH-146, PR #484):
none passed, so the surfer stays as built. The read to make after 3.21's first pass is this table again, against
3.20 on the same opponents, with ranks 11 to 100 as the line that has to move.
