# TwinSaor

`hadur117.twin.TwinSaor` is a Twin Duel team built on Saor. Twin Duel is 2v2 on an 800 x 800
field, under 2,000 bytes for the team jar. TwinSaor is one class, `hadur117.twin.SaorTwin`, listed
twice. It keeps Saor's Markov gun, shares every scan between the twins, focuses fire on the
enemy with the least energy, and puts its twins 90 degrees apart around the target. Design,
the LunarTwins analysis, the build and the bench card are in [docs/twinsaor.md](../docs/twinsaor.md).

    mvn -pl twinsaor verify      # tests, the team jar, the 1,999-byte gate

## Standing

| Version | Date (UTC) | Rumble | Rank | APS | Survival | Battles | 1st | Gap to 1st / 5th |
|---|---|---|---|---|---|---|---|---|
| 0.2 | 2026-10-28 16:58 | **Twin Duel** | **1st of 28** | **69.95 ± 1.10** | 75.98 | 51 | TwinSaor 0.2 (2nd LunarTwins 1.4a, 69.29) | +0.66 over 2nd |
| 0.1 | 2026-10-27 18:46 | **Twin Duel** | **7th of 28** | **64.28 ± 1.16** | 67.21 | 51 | ags.lunartwins.LunarTwins 1.4a, 69.48 | +5.20 / +3.72 (MarioBros 68.00) |

0.2 entered with `hadur117.twin.TwinSaor 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/twinsaor-v0.2/hadur117.twin.TwinSaor_0.2.jar`
and read 1st on its first pass (all 27 pairings, PWIN 88.89), +5.67 over 0.1, close to the bench's
+5.9. The lead over LunarTwins (+0.66) is inside the ±1.10 interval, so first place is not settled.
The pages are archived in `data/rumble/pages/` under 2026-10-28T1658Z*.

0.1 entered with `hadur117.twin.TwinSaor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/twinsaor-v0.1/hadur117.twin.TwinSaor_0.1.jar`
and read 7th on its first pass (PWIN 81.48). The pages are archived in `data/rumble/pages/`
under 2026-10-27T1846Z*.

Against the key teams (first pass, 1 to 4 battles a pairing, ±5 to 8 each):

| Opponent | Its rank (0.1 pass) | 0.1 APS | 0.1 survival | 0.2 APS | 0.2 survival |
|---|---|---|---|---|---|
| LunarTwins 1.4a | 1st | 55.31 | 76.0 | 60.41 | 84.0 |
| NightAndDay 1.6 | 2nd | 37.86 | 10.7 | 48.46 | 40.9 |
| LuminariousDuo 1.13 | 3rd | 49.65 | 27.3 | 63.45 | 66.7 |
| GeminiTeam 2.1 | 4th | 37.83 | 10.7 | 44.51 | 20.0 |
| MarioBros 1.0 | 5th | 45.73 | 35.3 | 39.63 | 12.0 |
| TassieDevils 1.8 | 6th | 63.57 | 89.3 | 66.00 | 92.0 |
| CoyotePair .1 | - (51.08) | 46.07 | 21.0 | 50.88 | 32.4 |

0.2 still loses to MarioBros, GeminiTeam and NightAndDay (1 to 3 battles each).

Where the APS goes: lifting the four strong teams (NightAndDay, GeminiTeam, MarioBros,
LuminariousDuo) to 55 is worth about 1.8 APS. They win by survival, so TwinSaor loses whole
rounds. About 1.5 more is in the weaker teams that tie it or beat it: CoyotePair, InevitableTeam
50.05, ImpactTwins 52.42, KomariousTeam 53.73, YinYang 54.78, JointStrikeForce 55.54. The
sitting ducks (97 to 100) and the easy teams (76 to 81) are near their ceiling.

Before release, on the bench:

| Version | Date (UTC) | Where | Result |
|---|---|---|---|
| 0.2 | 2026-10-28 | cloud, vs 0.1 on 24 teams, 8 fresh seeds (W5) | +6.66 ± 1.33 share points, about +5.9 APS on the field |
| 0.1 | 2026-10-27 | cloud, vs LunarTwins 1.4a, 20 x 35 rounds | 58.2% score share, 83.1% rounds won |

Releases are tagged `twinsaor-v<version>` by `.github/workflows/release-twinsaor.yml`, with notes
in `docs/releases/twinsaor-v<version>.md`.
