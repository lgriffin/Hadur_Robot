# RoboRumble 1v1 RatingDetails — hadur2.Hadur 3.0 (2026-09-28)

Snapshot from Leigh's saved `BotDetails` page, 507 of ~1,216 pairings fought so far.

- **APS** 81.57 ± 0.35, **PWIN** 98.42, **ANPP** 84.62, **Vote** 0.89, **Survival** 82.58
- **Pairings** 507, **Battles** 517, latest battle 2026-09-28 14:10:19 UTC
- **Flag**: shows `NONE.gif` / "Unknown" — confirms the missing-flag issue; fix is adding `hadur2,IRL` to the robowiki `RoboRumble/Country_Flags` page.

## Reading this against the R-plan

Real APS (81.57) is higher than R0's rough estimate for rank 64 (~79–80), so the ladder in the plan
should shift up once re-derived from live rank 10/20/30/50 APS (still needed from Leigh).

Confirms the plan's central argument: **negative PBI against weak/mid-table bots outweighs the top-10
gap.** Of the 507 pairings, 151 have PBI < -5 and 84 have PBI < -10 (mostly nano/mini/micro bots, 1
battle each, so individually noisy at ±7.84 APS CI, but consistent as a population). Banding by
opponent APS:

| Opponent APS band | n | our mean APS | mean PBI | negative-PBI cost (per whole set) |
|---|---|---|---|---|
| 0–40 (weak) | 156 | 90.71 | -5.19 | -1.75 |
| 40–50 | 103 | 85.03 | -4.36 | -1.18 |
| 50–60 | 90 | 81.90 | +0.54 | -0.49 |
| 60–70 | 86 | 75.52 | +4.84 | -0.28 |
| 70–80 | 40 | 68.36 | +8.47 | -0.05 |
| 80–101 (strong) | 32 | 57.74 | +14.93 | 0 |

Negative PBI rows are concentrated against weak opponents (APS<50), exactly where R2 targets full
share. Confirmed strong-opponent losses (BeepBoop 26.28, ScalarR 27.36, Firestarter 42.41, XanderCat
44.57) match the bench numbers directionally.

Worst single PBI rows (single-battle, high noise, but the pattern — losing heavily to bots with opponent
APS 30–55 — recurs across dozens of rows): kawigi.sbf.Barracuda -26.64, nexus.Two -25.75, zzx.Gron
-22.02, jep.nano.Hawkwing -20.74, racso.Crono -19.40, caimano.Furia_Ceca -19.26, and 78 more below -10.

Raw parsed rows: [`data/rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv`](../../data/rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv);
the saved page itself is in [`data/rumble/pages/`](../../data/rumble/pages/).
