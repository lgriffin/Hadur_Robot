# 3.17 live, first pass (2026-10-25 22:57 UTC)

LiteRumble pages archived as `data/rumble/pages/2026-10-25T2257Z_*` (1v1), `2026-10-25T2216Z_*` (team) and
`2026-10-25T2305Z_*` (Saguaro, ScalarR, JKHydra and Ogi BotDetails), parsed under `data/rumble/parsed/`.
1v1 3.17 is 7th at **90.91 ± 0.19** over 1,219 pairings and 2,253 battles, Hadur's best score ever.
HadurTeam 3.17 is 4th of 48 at **79.39 ± 1.00** over 69 battles (published as 3.17.1).

## 1v1: what changed against 3.16, by opponent group

Compared with 3.16's first-pass page (2026-10-24 17:42, 89.49), so both are first passes; against 3.16's
settled 89.25 the gain reads +1.66. Groups are the opponents whose table entry is new in 3.17 (`git diff v3.16 v3.17` of ShieldListData and
ShieldTableData). Contribution to APS = sum of (3.17 - 3.16) over the group / 1,221 pairings, ± 95%.

| Group | Bots | Points a bot | APS | Bench (verify gates) |
|---|---|---|---|---|
| New shield entries (list adds, opening drives, shipped aims) | 231 | +3.35 | **+0.64 ± 0.20** | +0.31 (part 2) + part 3's share of +0.11 |
| New stop-and-go entries (WavePoison / WavePoisonShift) | 73 | +11.41 | **+0.68 ± 0.13** | +0.61 (table v2) + part 3's share of +0.11 |
| Everything else | 915 | +0.14 | +0.10 ± 0.16 | 0 (code unchanged) |
| All | 1,219 | | **+1.42** | +1.03 |

- **The bench-to-live assertion holds, and better than predicted.** Both new table groups gained live at
  least what their gates measured. The prediction (89.8 to 90.6) assumed table v1's 75% transfer; 3.17's
  transfer is above 100%: +1.32 live on the table bots against +1.03 benched.
- The 915 unchanged bots moved +0.10, inside pass noise.

## 1v1: where the 0.82 to 3rd sits

Saguaro (3rd, 91.73) minus Hadur 3.17 is +0.84 over the common opponents. Split by the mode Saguaro's
own table locks for the opponent, and by what Hadur does against it:

| Hadur against it | Saguaro mode | Bots | Saguaro lead (APS) | Points a bot |
|---|---|---|---|---|
| normal | shotDodger (simple guns) | 423 | **+0.57** | +1.7 |
| normal | bulletShield / movingBulletShield | 69 | **+0.38** | +6.7 |
| normal | perfectPrediction | 37 | +0.15 | +5.0 |
| shield | movingBulletShield / bulletShield | 231 | +0.20 | +0.9 |
| normal | wavePoisonShift / antiBasicSurfer | 69 | +0.18 | +3.1 |
| stop-and-go | wavePoison / Shift | 69 | +0.06 | +1.0 |
| any | scoreMax (Hadur leads) | 252 | **-0.57** | -2.8 |

Saguaro leads by 5+ points on 182 bots (+1.60 APS) and trails on 503 (-1.54). By Hadur's own score it
leads on the 80-97 band (589 bots, +0.94) and trails where Hadur already scores 97+ (-0.26).

4th to 6th are close behind Hadur, not ahead of it on the same bots: ScalarR +0.34 (all of it on bots Hadur
fights in normal mode, +2.65, against -2.06 on Hadur's shield bots), JKHydra +0.04 and Ogi +0.04. 3rd
place has to come from Saguaro's groups above while keeping the shield and stop-and-go leads.

## Team

HadurTeam 3.17 (3.17.1) is 4th at 79.39, +7.3 over 3.16's 72.13 on 69 battles (bench step C predicted
+2.9; one early pass, ±1.00). 5th ShadowTeam 79.17, 6th NightmareTeam 77.11, 3rd CombatTeam 81.85.
