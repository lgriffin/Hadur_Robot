# 3.9 live (2026-10-07 20:28 UTC)

Pages saved by Leigh at 20:28 UTC: the 1v1 rankings and Hadur 3.9's BotDetails page, and the
melee and team rankings, in `data/rumble/pages/2026-10-07T2028Z_*`, parsed to
`data/rumble/parsed/2026-10-07T2028Z_*`. The 1v1 pass is complete: 1,215 of 1,215 pairings,
1,885 battles, the latest at 20:27 UTC.

| Rumble | 3.9 | Rank | Before |
|---|---|---|---|
| 1v1 | **87.15 APS** (± 0.19), survival 95.04 | **13th** | 3.8.5 84.79, 24th; 3.4 85.90, 20th |
| Melee | 65.07 APS | 19th | 3.8 16th; 3.7 65.25, 18th |
| Team | 63.97 APS | 12th | 3.8 12th |

3.9 is Hadur's best 1v1 score. 10th is Tomcat 3.68 at 87.71, **0.56 above**, and the five bots from
8th to 12th sit within 0.11 of each other (Raven 87.75, XanderCat 87.74, Tomcat 87.71, Knight 87.70,
Gilgalad 87.64). Wavelet is 14th at 87.06, 0.09 below. Melee and team play did not change in 3.9.

## 1v1 by rank band, change per pairing with a 95% interval

Most pairings are one battle (693) or two (396). "APS contribution" is the band's sum over 1,215.

| Ranks | Pairings | 3.9 minus 3.8.5 | Survival | Contribution | 3.9 minus 3.4 | Contribution |
|---|---|---|---|---|---|---|
| 1-10 | 10 | -0.37 ± 6.42 | -2.1 | -0.00 | +4.13 ± 5.79 | +0.03 |
| 11-20 | 9 | -0.56 ± 3.43 | +0.2 | -0.00 | +1.56 ± 5.52 | +0.01 |
| 21-50 | 29 | +0.19 ± 2.17 | +0.3 | +0.00 | -0.58 ± 2.49 | -0.01 |
| 51-150 | 100 | **+2.43 ± 1.31** | +3.3 | +0.20 | +0.44 ± 1.43 | +0.04 |
| 151-400 | 248 | **+2.89 ± 0.73** | +3.7 | +0.59 | **+1.90 ± 0.82** | +0.39 |
| 401-700 | 297 | **+2.39 ± 0.59** | +3.1 | +0.59 | **+1.40 ± 0.51** | +0.35 |
| 701+ | 513 | **+2.24 ± 0.30** | +2.8 | +0.95 | **+1.06 ± 0.30** | +0.45 |
| All | | **+2.32 APS** | | | **+1.25 APS** | |

## Read

- **RAM-2 was costing about 2 points on most of the field, not only on the live losers.** The gain
  over 3.8.5 is even, +2.2 to +2.9 per pairing in every band from 51st down, and it is survival
  (+3). The gate's estimate was +0.2 to +0.4 APS, from the 40 live losers alone; the field gave
  six times that. The top 50 did not move, as the gates said.
- **3.9 is now better than 3.4 below rank 150** (+1.1 to +1.9 per pairing), so the DrussGT route's
  gains and the architecture work are no longer hidden by a leak.
- **The bench missed it.** On the 32 bots of `leak-38.txt`, live says 3.9 minus 3.8.5 is
  **+2.14 ± 1.04**; the PC gate on the same bots, 16 seeds, read level (-0.02, TOST passed). The
  3.8 leak was missed the same way (A1, A2). Something in live play that the bench does not have
  makes RAM-2 confirm and run on ordinary bots. Not yet known what.

## Where the remaining points are

Single live pairings are noisy, so the targets below use two independent passes, 3.4's and 3.9's,
measured as distance from Hadur's own trend (the median score of the 51 bots around that rank).
The two passes agree with correlation 0.64: about two thirds of a pairing's spread is the
opponent, a third is luck. Shrunk by that, the persistent shortfall below Hadur's own trend is
**about 1.8 APS**, all of it below rank 20.

| Group (ranks 151+, both passes under trend) | Bots | 3.9 mean | Worth |
|---|---|---|---|
| **Score leak**: 3.9 wins 95%+ of rounds, scores under 85 | 45 | 79.4 | 0.39 APS to reach 90 on each |
| **Lost rounds**: 3.9 loses more than 5% of rounds | 64 | 75.5 (survival 89) | 0.42 APS to reach trend |
| Ranks 21-150, for comparison | 129 | 70.1 | 0.21 APS per +2 points each |

The score-leak bots are nano and micro rammers and close-range fighters (FollowFire, SledgeHammer,
Sabreur, Machete, RammingC, RamRod, PureAggression, UbaRamLT, Tirunculus and others): Hadur wins
the rounds and they take a fifth of the score with bullets and rams. Neither arm of RAM-3 fixes it:
against these 45, 3.4 (always fight) averaged 73, 3.8.5 (always escape) 77 and 3.9 79, while
Hadur averages 93 against the bots whose rounds it wins. (3.4's figure is low partly because the
group was picked on 3.4's pass too.) The lost-round
bots are a mix of rammers (GrubbmThree, MaxRisk, WaveRammer) and simple-gun bots that hit Hadur
more than they should (NanoDeath, Neutrino, Breeze, RandomPattern).

Inferred, not measured: the 0.56 to 10th is there in these two groups without touching the top 50.

## Next

`hadur-bench/plans/overnight-39.queue` (issue for the overnight run):

1. `score-leak-39.txt` (32 bots), 3.9 against 3.4, 8 seeds: does the bench see the leak, and do the
   points go as bullet damage or ram damage?
2. `lost-rounds-39.txt` (32 bots), 3.9 against 3.4, 8 seeds: which lost rounds are real.
3. `leak-38.txt`, 3.9 against 3.8.5, warm (`--cold-warm`) and at a slower CPU constant (1000000):
   which condition makes the bench see the +2 it missed.
