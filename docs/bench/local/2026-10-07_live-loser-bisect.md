# Release bisect on the live losers (#117, 2026-10-06 overnight)

Question from the #117 comment of 2026-10-06 20:54Z: 3.4 scores better than 3.5.1 to 3.8.5 against the
40 bots that Hadur 3.8 and 3.8.5 both lost more than five points to, live, against 3.4 (`hadur-bench/live-losers-385.txt`).
Which release step carries the loss, and is it CPU cost?

Conditions (all runs): 1v1, 35 rounds, 800x600, Robocode 1.11.1, paired by seed, parallel 12, child heap 2G,
RoboRumble workers stopped, `Windows 11, Threadripper PRO 9965WX`. Live-loser runs use 8 seeds per opponent;
the leak-set run uses 16. CPU constant 1488498 (the owner's rumble value) except R4 and R5, which use 400000.
`zen.Ronin 1.0.0` failed to finish in every live-loser run (8 of 320 battles per side, same opponent each time), so
those runs cover 39 opponents, not 40. Raw rows: `data/bench/2026-10-06_hadur-<run>-local_cold.tsv`
(catalog rows added). Analysis: `data/tools/analyse.py --margin 1.0`, differences in score-share points,
candidate minus baseline, per-battle 95% interval and opponent-clustered 95% interval.

## Results

| Run | Candidate minus baseline | Set | Per battle | Opponent-clustered | Holm-significant opponents | Skipped turns per battle (cand / base) |
|---|---|---|---|---|---|---|
| gap 1 | 3.8 minus 3.4 | leak set, 16 seeds, 32 opponents | +0.66 ± 0.45 | +0.66 ± 1.36 [-0.71, +2.02] | 7 (3 up by 11 to 12 points, 4 down by 1 to 3) | 11.3 / 11.7 |
| R1 | 3.7 minus 3.5.1 | live losers | -0.35 ± 0.91 | -0.35 ± 0.83 [-1.18, +0.47] | 0 | 10.5 / 11.3 |
| R2 | 3.8.5 minus 3.7 | live losers | -0.79 ± 0.85 | -0.79 ± 0.95 [-1.73, +0.16] | 0 | 11.5 / 10.4 |
| R3 | 3.5.1 minus 3.4 | live losers | -6.37 ± 1.22 | -6.37 ± 3.02 [-9.39, -3.36] | 14 of 39, all down | 10.9 / 11.0 |
| R4 | 3.7 minus 3.5.1, CPU 400000 | live losers | +0.70 ± 0.58 | +0.70 ± 0.44 [+0.25, +1.14] | 0 | 112.3 / 112.4 |
| R5 | 3.8.5 minus 3.4, CPU 400000 | live losers | +2.15 ± 0.78 | +2.15 ± 1.44 [+0.71, +3.59] | 3 (Colossus2 and Dreadnaught down about 10, AlphaDragon up 7) | 143.0 / 113.5 |
| R6 | 3.8.5 minus 3.4 | live losers | -6.74 ± 1.10 | -6.74 ± 2.70 [-9.43, -4.04] | 11 of 39, all down | 11.3 / 11.0 |

Mean score share in R6 is 74.7% for 3.8.5 and 81.4% for 3.4; in R3 the two builds are 3.5.1 and 3.4.

Opponents down in both R3 and R6 after Holm: Silver v048 (-21.6, -19.9), Dreadnaught (-12.8, -13.3),
Colossus2 (-13.0, -13.5), Predator (-23.6, -24.6), WaveRammer (-27.8, -26.2), Oranges (-12.7, -16.0),
Tyr (-8.8, -8.2), TopGun (-27.4, -25.3), Ice (-20.0, -21.1), UnViolation (-7.4, -8.2), IotaCT (-7.9, -8.0).
Three more (Gorgatron, Drum, Eater_of_Worlds_Mini) are down in R3 and pointing the same way in R6 without
passing Holm.

## Reading, by the #117 rules

- **The loss sits in the 3.4 to 3.5.1 step.** R3 is down 6.4 points with 14 opponents resolved down; R1 (3.5.1 to 3.7)
  is level (interval [-1.18, +0.47]) and R2 (3.7 to 3.8.5) is not resolved down: -0.79 with the interval touching
  zero, and short of the rule's "below zero by at least a point". The three steps sum to about -7.5, against R6's
  directly measured -6.74, which is within the intervals. 3.8 is not in the bisect on this set (it is in the leak-set run).
- **It is not CPU cost in the sense of the rule.** The rule says R4/R5 down while R1/R6 level means CPU cost. Here R6 is
  down at the normal constant, and R4/R5 are level or up. The loss is present when the machine has headroom, with
  about 11 skipped turns per battle on both sides.
- **The tight runs are a load test, not a second measurement.** At CPU constant 400000 every battle spent most ticks in duress
  (about 14,000 per battle) and skipped 112 to 143 turns, and every build falls to about 28 to 32% score share
  (R6 at normal load: 74.7 and 81.4; R5 tight: 31.9 for 3.8.5 and 29.7 for 3.4). The R5 sign flip (+2.15) is therefore a
  floor effect and says only that the gap closes when both robots are starved. It does not say 3.4 was slower or
  faster per turn. 3.8.5 skipped 30 more turns per battle than 3.4 in R5 (143.0 against 113.5), so it does cost more
  per turn under starvation, but R1/R4 show no such difference between 3.7 and 3.5.1 (112.3 against 112.4).
- **Trust.** Duress ticks at the normal constant were nonzero in 2 to 10 percent of battles. Dropping pairs where either
  side had duress changes no result: R3 -6.13 ± 1.26, R6 -6.64 ± 1.13, R2 -1.01 ± 0.89 (n=284), gap 1 +0.71 ± 0.52.
  R2 sits on the "down by about a point" line either way and is not resolved. Skipped turns are level between the
  builds in every normal-constant run (within 1.2 per battle), so the 3.4 versus later gap is not a skipped-turn effect.
  3.4 spent 45 duress ticks per battle against 30 for 3.8 on the leak set, 13.5 against 20.0 (3.5.1) in R3: duress is small
  and does not follow the direction of the score gap.
- **Leak set.** 3.8 against 3.4 is not down: +0.66 per battle (lower bound +0.20), clustered interval spans zero, and TOST
  says 3.8 is no more than a point worse than 3.4 (clustered p=0.009) but not equivalent. Seven opponents resolve:
  Leopard, Bully and HumblePieLite up 11 to 12 points for 3.8; NanoStep (-2.9), gpBot_0 (-3.0) and Puffin (-1.1) down.
  The live-loser set therefore shows a loss to 3.4 that the leak set does not.

## What is not resolved

- Eight seeds per opponent resolve only large per-opponent differences. Per-opponent intervals are 4 to 10 points wide in R1 and R2.
- The live-loser set was chosen because 3.8 and 3.8.5 scored under 3.4 live, with one to three live battles per pairing, so
  part of the set is selected on 3.4's luck. That makes R3 and R6 likely to overstate a true gap on the 40 chosen opponents,
  and it is not an estimate for all opponents. The leak-set result (+0.66) is the unselected side of the same comparison.
- This says which step carries the loss on these opponents. It does not say which change inside 3.5.1 did it. No evolution decision is made here.
- zen.Ronin failed in every run, so its matchup is unmeasured.
