# 3.16 live, first pass (2026-10-24 17:42 UTC)

LiteRumble pages archived as `data/rumble/pages/2026-10-24T1742Z_*` (parsed under `data/rumble/parsed/`).
3.16 is 8th at 89.49 ± 0.20 over 1,219 pairings and 1,720 battles (1.4 a pairing). Nullstride has left the
rankings; jkong.JKHydra 1.4 is new at 5th with 90.99. Top 5 now needs +1.50 APS, 4th (ScalarR 91.27) +1.78.

## What changed, by opponent group (contribution to APS, ± 95%)

| Compare | All | Table v1's 48 new shield bots | Never shielded (970) |
|---|---|---|---|
| 3.15 - 3.13 (both 10-23 pages) | -0.15 ± 0.22 | (not listed in either) | -0.02 ± 0.16 |
| 3.16 - 3.15 | +0.18 ± 0.27 | **+0.37 ± 0.09** (+9.5 points a bot) | -0.19 ± 0.16 |

- **The per-opponent table works live.** The 48 bots table v1 added gain +9.5 points each, +0.37 APS, close to
  the bench's prediction for them.
- **The never-shielded drop is pass noise, not a cost.** Hadur's 1v1 code against those 970 bots is the same in
  3.15 and 3.16, yet they read -0.19. Between 3.13 and 3.15, where the global duel switches (SHIELD-14,
  MOVE-24) did change, the same bots read -0.02 ± 0.16. Reverting those switches is not supported.
- One pass at 1.4 battles a pairing is noisy (single pairings swing 10-20 points); expect 3.16 to settle near
  89.6-89.7 as battles accrue.

## Where the remaining points are

Matching the second-best of Saguaro, ScalarR, Ogi and Diamond on each opponent where two of them lead
Hadur 3.16 by 5+ points is worth +2.78 APS over 346 opponents; 211 of them (+1.72) are flat movers with
learning guns. Saguaro's lead over 3.16 is +2.31, and Saguaro's whole lead is per-opponent tailoring
(rivals-source-read.md). Split by the mode Saguaro locks:

| Saguaro's bots | Bots | Saguaro lead over 3.16 |
|---|---|---|
| Its 300 shield bots, Hadur also shields (Hadur 92.5, Saguaro 95.9) | 204 | +0.58 |
| Its shield bots Hadur does not shield (Hadur 83.1, Saguaro 91.5) | 95 | +0.66 |
| Everything else (ShotDodger 429, WavePoison/Shift 148, PerfectPrediction 39, ...; ScoreMax 252 is -0.55) | 918 | +1.05 |

Top 5 is reachable only by tailoring more of the field: a better shield on the 300 (pc-shield-s2), plus the
two mode families Hadur lacks, simple-aim dodging (ShotDodger) and stop-and-go against surfers (WavePoison).
