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

## The bots above us

Leigh saved the LiteRumble compare pages of Tomcat 3.68 (10th), Knight 0.6.28 (11th) and Raven
3.56j8 (8th) against Hadur 3.9, saved 2026-10-07 20:46 UTC (`data/rumble/pages/2026-10-07T2046Z_*`,
parsed by `data/tools/parse_rumble_page.py`). Each covers the 1,214 opponents both bots share.
Their own pairings rest on tens of thousands of battles, so the noise is Hadur's.

| Ranks | Pairings | Tomcat minus Hadur | Knight minus Hadur | Raven minus Hadur |
|---|---|---|---|---|
| 1-20 | 18 | -4.52 ± 3.09 | -0.01 ± 3.66 | -6.71 ± 3.41 |
| 21-50 | 30 | -0.79 ± 1.93 | +1.37 ± 2.17 | -3.45 ± 2.34 |
| 51-150 | 100 | -1.08 ± 1.39 | -1.39 ± 1.31 | -3.29 ± 1.36 |
| 151-400 | 250 | +0.07 ± 0.73 | -0.22 ± 0.79 | -0.27 ± 0.80 |
| 401-700 | 300 | **+1.17 ± 0.43** | **+1.32 ± 0.45** | **+2.12 ± 0.45** |
| 701+ | 516 | **+1.03 ± 0.21** | **+0.87 ± 0.19** | **+1.41 ± 0.22** |
| All | | +0.57 APS | +0.57 APS | +0.61 APS |

- **The whole gap is below rank 400.** All three score about a point a pairing more than Hadur
  against the 816 bots ranked 401st and below (0.7 to 1.1 APS), and match or trail it above
  that. Hadur already outscores Raven and Tomcat against the top 150.
- **It is points given away in rounds Hadur wins.** Below rank 700 their survival is only 0.3
  to 0.4 above Hadur's (99.4), yet they score about a point more: weak bots hit Hadur more
  often, or for longer, than they hit the top 10. From 401 to 700 their survival is also 1.2 to
  1.4 higher, so there part of it is rounds.
- **The score-leak group is mostly the opponents' doing.** Against the 32 bots of
  `score-leak-39.txt`, Tomcat scores 77.0 and Hadur 77.6; Knight and Raven score 82. Fixing it is
  worth about 0.1 APS, not the 0.2 to 0.4 estimated above.
- **The lost-rounds group is real but small.** The three score 5 to 7 more than Hadur there,
  0.13 to 0.18 APS.

So the plan changes: the first target is the weak tail, how often a weak bot hits Hadur in a
round Hadur wins, not the close-range group. `hadur-bench/tail-39.txt` is a random 40 of
the 401+ bots (the three bots outscore Hadur by 1.58 on that draw live). The bench needs to
run a reference bot (Knight) against it to show where Knight keeps the points; that and a
score breakdown (bullet, ram and bonus points for each side) are the harness changes in
issue #136.

### Against rank 1

The compare page of Nullstride 2.3.3 (1st) against Hadur 3.9, saved 20:58 UTC, shows a different
shape. Nullstride is 7.85 APS ahead over the 1,214 shared opponents, and the gap grows toward the
middle of the table, not the tail:

| Ranks | Pairings | Nullstride | Hadur | Difference | APS contribution |
|---|---|---|---|---|---|
| 1-20 | 18 | 75.4 | 52.2 | +23.25 ± 4.12 | +0.34 |
| 21-50 | 30 | 86.4 | 63.5 | +22.87 ± 3.99 | +0.57 |
| 51-150 | 100 | 89.7 | 72.1 | +17.58 ± 1.83 | +1.45 |
| 151-400 | 250 | 92.8 | 80.4 | +12.36 ± 0.94 | **+2.55** |
| 401-700 | 300 | 95.3 | 87.5 | +7.81 ± 0.71 | +1.93 |
| 701+ | 516 | 98.3 | 95.9 | +2.39 ± 0.26 | +1.02 |

Most of it is survival: Nullstride wins 98.7% of rounds against ranks 151-400 to Hadur's 92.6%, and
97.6% against 51-150 to 85.6%. The top 20 are worth only 0.34 of the 7.85. On the bench sets it
scores 90 against the score-leak and lost-rounds bots (Hadur 78 and 74) and 97.1 on the tail
(Hadur 92.8), so the close-range bots that cost the 10th-place group as much as Hadur do not
cost Nullstride.

## What the overnight runs found

Two PC runs answered the open questions: issue #138 (`docs/bench/local/2026-10-07_overnight-39-findings.md`)
and the mid-table side track, issue #140 (`docs/bench/local/2026-10-07_nullstride-mid-results.md`). All
figures are opponent-clustered 95% intervals in points of score share, 8 seeds a bot.

| Run | Compare | Result | Reading |
|---|---|---|---|
| tail-knight | Knight 0.6.28 vs 3.9, 39 tail bots | **+1.20** [+0.55, +1.85] | The bench sees the gap to the bots above us |
| tail | 3.9 vs 3.4, same 39 | +0.16 [-0.34, +0.66] | Level |
| leak-score | 3.9 vs 3.4, 32 rammers | **+5.71** [+3.51, +7.92] | The ram fix works; 85% of what they still score is bullets |
| lost-rounds | 3.9 vs 3.4, 32 bots | +1.70 [+0.15, +3.25] | Survival still under 95% on 18 of 32 |
| calib-warm, calib-cpu | 3.9 vs 3.8.5, leak-38 | +0.28 to +0.60, not resolved | Neither condition reproduces the live +2.1 |
| mid-shieldall-list | 3.9sa vs 3.9, 30 mid bots on DrussGT's list | **+8.05** [+4.06, +12.04] | Shielding pays on list bots; 22 up, 5 significantly down |
| mid-shieldall | 3.9sa vs 3.9, 40 mid bots off the list | -1.24 [-3.46, +0.98] | Do not shield everyone |
| mid-null, mid-null-list | Nullstride vs 3.9, off and on the list | +10.95 and +17.84 | Nullstride is hit 52% and 80% less |

- **The tail gap is movement against simple guns.** Per battle Knight takes 295 bullet damage to
  Hadur's 344 and deals the same (2407 against 2424), with rounds no shorter. Seven tail bots are
  significant for Knight: Sanguijuela, Ihivatar, Fusion, claire, MilkyWay, Trinity, CannonfodderNano.
- **The mid-table gap is not being hit, and on DrussGT's list most of it is shielding.** With shield
  mode on, Hadur's bullet damage taken on the list bots halves (866 to 428), closing about 45% of
  Nullstride's lead there. Off the list shielding costs, so entries go on one bot at a time.
- **The bench still cannot see a field-wide change** (calib). A change that by construction only
  touches named bots, such as a shield-list entry, is what the bench can gate.

Sizing, inferred: 18 of the 30 measured list bots clear the D5 rule (interval above 0), worth +9.0
a pairing averaged over all 30. The runnable list holds 139 bots off D5 in ranks 51-400 and 91 in
401-700. At that rate the 30 already measured are worth about +0.2 APS, the other 109 mid bots
+0.6 to +0.8, and the 91 from 401-700, where Hadur already scores 87, perhaps +0.2. Allowing for
the winner's curse of picking on 8 seeds, the list alone is +0.6 to +1.1 APS, against 0.56 to 10th.

## Next

3.10 in two stages:

1. **The shield sweep** (`hadur-bench/plans/shield-sweep.queue`): 3.9sa against 3.9, 8 seeds, on the
   109 unmeasured list bots of ranks 51-400 (`shield-sweep-mid.txt`) and the 91 of ranks 401-700
   (`shield-sweep-low.txt`). Each bot that clears the D5 rule goes on `ShieldListData` with its exact
   version, with the 18 already measured. Off-list bots cannot be affected, so the guard sets hold
   by construction; the gate is the list bots themselves, rerun with the new list.
2. **Movement against simple guns**: bullet damage taken on `tail-39.txt` toward Knight's, with the
   top 20 and leak sets held level.

Then a live pass, with the Tomcat, Knight, Raven and Nullstride compare pages saved again.

The sweep ran on 2026-10-08 (`docs/bench/local/2026-10-08_shield-sweep.md`): 64 robots cleared the
rule and 1 more was open with a mean over 9, so 3.10 adds 83 robots with the #140 run's 18. The
confirmation gate is `hadur-bench/plans/candidate-310.queue`.

### Before: the plan for the #138 run

`hadur-bench/plans/overnight-39.queue` (issue for the overnight run):

1. `score-leak-39.txt` (32 bots), 3.9 against 3.4, 8 seeds: does the bench see the leak, and do the
   points go as bullet damage or ram damage?
2. `lost-rounds-39.txt` (32 bots), 3.9 against 3.4, 8 seeds: which lost rounds are real.
3. `leak-38.txt`, 3.9 against 3.8.5, warm (`--cold-warm`) and at a slower CPU constant (1000000):
   which condition makes the bench see the +2 it missed.
4. `tail-39.txt` (40 bots ranked 401+), 3.9 against 3.4, 8 seeds: Hadur's damage taken and round
   length on the weak tail, the baseline for the reference-bot run once the harness can do it.
