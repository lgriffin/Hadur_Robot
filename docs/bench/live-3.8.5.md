# 3.8.5 live, 1v1 (2026-10-06 20:26 UTC)

Pages saved by Leigh at 20:26 UTC, battles 19:22 to 20:26 UTC: `data/rumble/pages/2026-10-06T2026Z_*`,
parsed to `data/rumble/parsed/2026-10-06T2026Z_*`.

**3.8.5 is 24th with 84.79 APS** over 1,206 pairings and 1,754 battles, survival 92.04.
That is up from 3.8's 84.58 (29th) and still below 3.4's 85.90 (20th) and 3.7's 85.67 (21st).
Ranks 1 and 2 are unchanged: Nullstride 2.3.3 (95.06) and BeepBoop 2.0 (95.02).

## By rank band (current ranks), change per pairing with a 95% interval

Each pairing is one battle for 835 of them and two or three for most of the rest, so
single pairings are noisy and only the band means carry weight. "APS contribution" is the
band's sum divided by 1,215 pairings.

| Ranks | Pairings | 3.8.5 minus 3.8 | 3.8.5 minus 3.4 | 3.8 minus 3.4 | 3.8.5 minus 3.4, survival | APS contribution, 3.8.5 minus 3.4 |
|---|---|---|---|---|---|---|
| 1-10 | 10 | -0.19 ± 5.66 | +4.96 ± 7.30 | +4.68 ± 6.97 | +12.70 | +0.04 |
| 11-20 | 10 | +1.32 ± 3.27 | +1.84 ± 5.43 | +0.52 ± 4.62 | +6.33 | +0.02 |
| 21-50 | 28 | +2.54 ± 3.03 | -1.00 ± 2.58 | -3.54 ± 2.98 | -0.07 | -0.02 |
| 51-150 | 100 | -0.31 ± 1.20 | -1.99 ± 1.38 | -1.68 ± 1.34 | -3.03 | -0.16 |
| 151-400 | 248 | -0.37 ± 0.80 | -1.00 ± 0.95 | -0.66 ± 0.82 | -2.13 | -0.20 |
| 401+ | 810 | **+0.36 ± 0.25** | **-1.13 ± 0.33** | -1.50 ± 0.32 | -1.98 | **-0.76** |
| All | | +0.21 APS | -1.10 APS | -1.31 APS | | |

## Read

- **The matchup gate worked where it was aimed, but it is small.** 3.8.5 gained +0.36 per pairing
  over 3.8 against the bots ranked 401st and below. That is about 0.24 APS, roughly a fifth of the
  leak. The top 10 held. The PC bench agrees that 3.8.5 is level with 3.8 (PR #119).
- **Most of the leak remains, and it is a survival loss against weak bots.** Against 3.4, 3.8.5
  still loses 1.13 per pairing below rank 400, with survival 2 points lower. The loss is largest
  where 3.4 dominated: -2.1 per pairing where 3.4 scored 97 or more.
- **Inferred, not tested: the rest may predate 3.8.** 3.7 was already 0.23 below 3.4 live, and its
  per-opponent page was never saved. Of the 1,185 pairings below rank 20, 99 lost more than 5 points
  to 3.4 in both 3.8 and 3.8.5. They include bots that ram or mirror (WaveRammer, TopGun, Ice,
  Drum, DemonicRage), the kind 3.5's RAM-2 and MIR-1 changed play against. Both reads share 3.4's
  score, so part of that list is 3.4's luck.

## Next

A release bisect on the live losers: `hadur-bench/live-losers-385.txt` (the worst 40 of those 99),
3.4 against 3.5.1, 3.7, 3.8 and 3.8.5 on engine 1.11.1. Together with tonight's 3.8 against 3.4 run
on the leak set, this shows which release the survival loss came in with.
