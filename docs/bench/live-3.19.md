# Hadur 3.19 live: 1v1 first pass (2026-10-29)

`hadur117.Hadur 3.19` was released on 2026-10-28 at 21:03 GMT. It is a new participant: the hadur117
package starts with no stored opponent profiles. Almost all of its first pass came from one cloud client
(4 cores, one 1v1 client, restarted hourly between uploads). The client ran from 21:15 to 21:30 GMT and
from 22:51 to 07:30 GMT, then until 09:00 GMT Hadur-only to fill the last pairings. No PC client
uploaded.

Pages saved 2026-10-29 08:57 UTC: `data/rumble/pages/2026-10-29T0857Z_*.mht`, parsed in
`data/rumble/parsed/2026-10-29T0857Z_*`.

## Standing

| Rank | Robot | APS | ± | Pairings | Battles |
|---:|---|---:|---:|---:|---:|
| 1 | kc.mega.BeepBoop 2.0 | 94.98 | 0.03 | 1,221 | 30,548 |
| 2 | jk.mega.DrussGT 3.1.16 | 92.56 | 0.05 | 1,221 | 15,215 |
| 3 | oog.mega.saguaro.Saguaro 1.0 | 91.76 | 0.04 | 1,221 | 31,007 |
| **4** | **hadur117.Hadur 3.19** | **91.58** | **0.20** | **1,221** | **1,643** |
| 5 | aaa.r.ScalarR 0.005h.053-noshield | 91.24 | 0.04 | 1,221 | 30,511 |
| 6 | jkong.JKHydra 1.4 | 90.75 | 0.10 | 1,221 | 5,374 |

4th, its best score ever, 0.18 behind Saguaro for 3rd. That gap is inside one error bar. PWIN 99.26%,
survival 96.85%.

Melee (read 09:00 UTC): 14th of 418 at 67.75 ± 0.27 (411 of 417 pairings), against 3.18.1's 13th at
67.92. That is level within noise. The melee change, power 3 out to 300 px, was screened at
+0.14 ± 0.17 (pc-melee-wide, PR #402).

## Against 3.18.1, same opponents

3.18.1's final first pass (`2026-10-28T0642Z`, cloud client only, 91.34) against 3.19's, on the 1,219
opponents both met: **+0.27 ± 0.23 APS**. The bench projected +0.13.

| Group (gap-to-2nd labels) | Robots | 3.19 - 3.18.1 (APS) | 95% |
|---|---:|---:|---:|
| Perfect prediction / rammers | 36 | **+0.115** | ±0.045 |
| Strong learners (opp APS 70+) | 68 | +0.062 | ±0.074 |
| Stop-and-go (ours) | 73 | +0.047 | ±0.057 |
| We shield | 273 | +0.025 | ±0.159 |
| Anti-basic-surfer | 27 | +0.014 | ±0.022 |
| Wave-poison, we surf | 48 | +0.008 | ±0.035 |
| Simple guns | 383 | +0.006 | ±0.069 |
| Other scoreMax | 173 | -0.001 | ±0.074 |
| Rivals shield, we surf | 136 | -0.021 | ±0.062 |

- **RAM-5 carries live at full size.** The rammer group gains +0.115 ± 0.045. The PC gate read +0.11 ± 0.04
  (pc-1v1-ram, PR #394). It is the only group clear of noise.
- **The re-pick holds.** Wolverine 94.0 -> 98.8, Hikari 81.4 -> 97.8, Melody 92.5 -> 98.4: +0.02 APS,
  as benched (PR #384).
- Every other group is level within noise. The rest of the +0.27 is first-pass noise: one or two battles
  a pairing.

## Gap to 3rd and 2nd by group

3.19's pairings against Saguaro's and DrussGT's pages of 2026-10-28 (APS, positive = the rival leads):

| Group | Robots | Saguaro lead | DrussGT lead |
|---|---:|---:|---:|
| Rivals shield, we surf | 136 | +0.455 | +0.334 |
| Simple guns | 383 | +0.452 | +0.325 |
| Wave-poison, we surf | 48 | +0.071 | +0.088 |
| Rammers | 36 | +0.045 | -0.024 |
| Anti-basic-surfer | 27 | +0.041 | +0.074 |
| Stop-and-go (ours) | 73 | -0.044 | -0.355 |
| We shield | 273 | -0.035 | -0.051 |
| Other scoreMax | 173 | -0.239 | +0.289 |
| Strong learners | 68 | -0.534 | +0.283 |
| All | 1,217 | +0.21 | +0.96 |

- **Rammers are closed.** RAM-5 took the group from Saguaro +0.16 to +0.05, and Hadur now leads DrussGT there.
- **3rd is in two groups.** Saguaro's lead is the surfers it shields against (+0.46) and the simple guns
  (+0.45). Hadur pays it back on learners and scoreMax robots (-0.77). The largest single leads are Pytko
  (62 vs 95), Hydrogen (67 vs 98), WaveSurferPG (67 vs 95), BaronTrozo (74 vs 98), Princess, Yuugao
  and Samekh (59 vs 82).
- **2nd needs the core.** DrussGT leads by +0.96, spread over surfed shielders, simple guns, scoreMax and
  learners. That is movement and danger-model quality, the road-to-king work (K1), not per-opponent
  tailoring. pc-1to1 (PR #409) found the table route nearly spent: 11 locks, +0.08 APS in sample.
