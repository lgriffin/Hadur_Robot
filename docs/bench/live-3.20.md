# Hadur 3.20 live: 1v1 first pass (2026-10-30)

`hadur117.Hadur 3.20` was released on 2026-10-30 at 16:25 GMT. Its 1v1 first pass came almost all from one
cloud client (4 cores, one 1v1 client, the JVM restarted hourly between uploads), run from 16:37 to 21:41
GMT on Leigh's go. No PC client uploaded. The client was stopped on Leigh's word at 21:41 GMT.

Pages saved 2026-10-30 21:41 UTC: `data/rumble/pages/2026-10-30T2141Z_*.mht`, parsed in
`data/rumble/parsed/2026-10-30T2141Z_*`. Every family entry's standing, read from the LiteRumble API at
21:50 UTC, is in `data/rumble/parsed/2026-10-30T2150Z_family_standings.tsv`.

## Standing

| Rank | Robot | APS | ± | Pairings | Battles |
|---:|---|---:|---:|---:|---:|
| 1 | kc.mega.BeepBoop 2.0 | 94.98 | 0.03 | 1,221 | 30,550 |
| 2 | jk.mega.DrussGT 3.1.16 | 92.56 | 0.05 | 1,221 | 15,217 |
| **3** | **hadur117.Hadur 3.20** | **91.82** | **0.22** | **1,221** | **1,403** |
| 4 | oog.mega.saguaro.Saguaro 1.0 | 91.76 | 0.04 | 1,221 | 31,007 |
| 5 | aaa.r.ScalarR 0.005h.053-noshield | 91.24 | 0.04 | 1,221 | 30,511 |
| 6 | jkong.JKHydra 1.4 | 90.74 | 0.10 | 1,221 | 5,384 |

**3rd, the goal, and Hadur's best score ever.** PWIN 99.18% (10 pairings lost), survival 96.90%, vote 12.05
(2nd to BeepBoop's 35.32). The lead over Saguaro is 0.06, well inside one error bar, so 3rd is held but
not safe: a second pass could swap the two. DrussGT, 2nd, is 0.74 ahead.

Team and melee (API, 21:50 UTC): HadurTeam 3.20 is 3rd of 48 at 81.51 (45 of 47 pairings; CombatTeam 2nd
81.65, FirestarterTeam 4th 81.47). Melee 3.20 is 14th of 418 at 67.76, level with 3.19 (melee play is
unchanged).

## Against 3.19, same opponents

On the 1,220 opponents both passes met (`live_passes.py drift`): **+0.24 ± 0.23 APS**. The 3.20 census
projected +0.47 ± 0.24 (PR #454). Live carried about half of it, and the two reads overlap.

| Group (gap-to-2nd labels) | Robots | 3.20 - 3.19 (APS) | 95% |
|---|---:|---:|---:|
| Simple guns | 383 | **+0.144** | ±0.062 |
| Rivals shield, we surf | 136 | **+0.123** | ±0.075 |
| Other scoreMax | 173 | +0.065 | ±0.064 |
| Wave-poison, we surf | 48 | +0.034 | ±0.037 |
| Rammers | 36 | +0.022 | ±0.024 |
| Anti-basic-surfer | 27 | -0.011 | ±0.029 |
| Strong learners (opp APS 70+) | 68 | -0.035 | ±0.078 |
| We shield | 273 | -0.049 | ±0.154 |
| Stop-and-go (ours) | 73 | -0.054 | ±0.087 |
| Unlabelled | 3 | +0.007 | ±0.026 |

- **MOVE-29 carried where it was aimed.** The aim members were built for the simple guns (pc-sg-aim
  +0.13 ± 0.07 on 434 robots). Live, they gained +0.14 ± 0.06 there, and +0.12 on the surfers the rivals
  shield. These were the two groups where Saguaro led 3.19 (by +0.45 and +0.46).
- **The groups MOVE-29 does not touch are level.** Stop-and-go and the shield list are driven by the mode
  table, which did not change, and both read zero within noise.
- **Collapses.** 9 single-battle pairings scored 12 or more under 3.19 (3.19's pass had 13). The largest
  is PulsarMax, 82.5 to 33.3 at 18:41 GMT. That is three minutes after the client JVM was restarted out of
  a spell of stuck robot threads at 400% CPU, so it may be the client and not the code; one battle cannot
  say. Hourly restarts were added at that point. The other eight are 12 to 23 points, between 17:14 and
  19:48 GMT.

## Gap to 2nd by group

3.20's pairings against Saguaro's and DrussGT's pages of 2026-10-28 (APS, positive = the rival leads).
Both rivals' pages hold 15,000+ battles and do not move between passes.

| Group | Robots | Saguaro lead | DrussGT lead |
|---|---:|---:|---:|
| Rivals shield, we surf | 136 | +0.333 | +0.211 |
| Simple guns | 383 | +0.308 | +0.182 |
| Strong learners | 68 | -0.500 | **+0.318** |
| Other scoreMax | 173 | -0.304 | **+0.224** |
| Wave-poison, we surf | 48 | +0.037 | +0.054 |
| Anti-basic-surfer | 27 | +0.052 | +0.086 |
| Rammers | 36 | +0.023 | -0.045 |
| We shield | 273 | +0.014 | -0.002 |
| Stop-and-go (ours) | 73 | +0.010 | -0.301 |
| All | 1,220 | -0.05 | +0.73 |

- **2nd needs +0.74.** DrussGT leads on four groups worth +0.94 together. Hadur pays back 0.35 on
  stop-and-go and rammers. The four are the strong learners, the other scoreMax robots, the surfers
  DrussGT shields and the simple guns. That is the surf's danger model against learning guns (the K-road)
  plus the remaining simple-gun dodge, not table entries.
- **The largest single DrussGT leads.** CassiusClay (55 vs 88), PulsarMax (33 vs 66, a collapse), Pytko
  (71 vs 96), Dookious (46 vs 68), MatchupWS (72 vs 94), Durandal (63 vs 84), PrairieWolf (71 vs 92),
  AHEB (74 vs 93), Neutrino (77 vs 95), SavantMicro (79 vs 97) and Pris (49 vs 67).

## PWIN: the 10 pairings lost

All ten are single battles: BeepBoop 25.7, ScalarR 29.3, PulsarMax 33.3 (the collapse above), JKHydra
41.2, Ogi 43.4, Wavelet 45.9, Dookious 46.2, Gilgalad 48.8, Firestarter 49.3 and Pris 49.4. 3.19 won
Wavelet, Firestarter and Pris at 52 to 54, and six more pairings sit at 50 to 56 (WaveSerpent, DrussGT,
Diamond, Tomcat, GresSuffurd, CassiusClay). About half the losses are coin flips, so PWIN moves ±0.3
between passes.
