# 3.12 live (2026-10-11 17:59 UTC): 9th, the first top-10 place

Pages saved by Leigh at 17:59 UTC: Hadur 3.12's BotDetails page and the 1v1 rankings, archived in
`data/rumble/pages/2026-10-11T1759Z_*` and parsed to `data/rumble/parsed/2026-10-11T1759Z_*`.
All 1,217 pairings are in, 1,949 battles (1.6 a pairing; 790 pairings still have one battle). The
PC's four workers ran 1,624 of them, watched by `live_client.py` (PR #186,
`data/live/2026-10-11_3.12/report.md`).

| Release | APS | Rank | Battles |
|---|---|---|---|
| 3.12 | **87.72** ± 0.20 | **9th** | 1,949 |
| 3.11 | 87.56 ± 0.13 | 13th | 4,306 |
| 3.10, second pass | 87.33 | 13th | |

| Rank | Robot | APS |
|---|---|---|
| 7 | Firestarter 2.0f | 88.10 |
| 8 | Raven 3.56j8 | 87.72 |
| **9** | **Hadur 3.12** | **87.72** |
| 10 | XanderCat 12.9 | 87.71 |
| 11 | Knight 0.6.28 | 87.68 |
| 12 | Tomcat 3.68 | 87.66 |
| 13 | Gilgalad 1.99.5c | 87.62 |

## 1. Where the +0.15 came from

Per opponent, 3.12's page minus 3.11's (1,216 opponents on both), as APS (sum over the band
divided by 1,217):

| Opponents | All | Without the three mirror bots |
|---|---|---|
| Ranks 1-50 | -0.015 | -0.015 |
| 51-200 | +0.025 | +0.025 |
| 201-400 | -0.002 | -0.027 |
| 401-700 | +0.135 | +0.093 |
| 701+ | +0.012 | -0.007 |
| **Total** | **+0.154** | +0.069 |

- **The fix shows exactly where the bench said.** MirrorMicro 42.5 to 92.7, NaN 62.5 to 93.2,
  Mimic 70.6 to 93.0: +0.085 APS from three pairings, against the bench's estimate of about
  +0.05 for the whole volatile set.
- **The rest, +0.07, is noise.** Most of it is ranks 401 to 700, and 3.12's page has 1.6
  battles a pairing against 3.11's 3.5; a reading's noise floor is about ±0.14 APS.

## 2. 9th is real but not settled

Ranks 8 to 13 sit inside 0.10 APS, half the page's ±0.20. As the second battles come in, 3.12
can land anywhere from about 7th to 14th; the mirror-bot gain (+0.09) is the part that stays,
since those pairings no longer swing.

## 3. Stored shield verdicts on the live client

The watch joined 969 battles to Hadur's own end-of-battle record. Battles ending with a stored
verdict scored 82.5% against 87.8% without, but that is the opponent mix: verdicts sit on
stronger bots. Within the same opponent (90 opponents with both kinds) the difference is
-0.8 ± 1.1 points, level, which matches p312d's bench finding that ignoring the verdict gains
nothing.

## 4. What it leaves

The gap to the pack is still the weak tail: against Tomcat, Knight and Raven, Hadur is behind
from rank 401 down (hit more by simple guns), ahead in ranks 51 to 200. Four whole-field ideas
for that gap (distance, never closing in, a stricter detector, ignoring stored verdicts) were
level or worse on the bench, so the next 1v1 stage needs a different lever.
