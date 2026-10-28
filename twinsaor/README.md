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
| 0.1 | 2026-10-27 18:46 | **Twin Duel** | **7th of 28** | **64.28 ± 1.16** | 67.21 | 51 | ags.lunartwins.LunarTwins 1.4a, 69.48 | +5.20 / +3.72 (MarioBros 68.00) |

0.1 entered with `hadur117.twin.TwinSaor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/twinsaor-v0.1/hadur117.twin.TwinSaor_0.1.jar`
and read 7th on its first pass (PWIN 81.48). The pages are archived in `data/rumble/pages/`
under 2026-10-27T1846Z*.

Against the key teams (first pass, 1 to 4 battles a pairing, ±5 to 8 each):

| Opponent | Its rank | TwinSaor APS | TwinSaor survival |
|---|---|---|---|
| LunarTwins 1.4a | 1st | 55.31 | 76.0 |
| NightAndDay 1.6 | 2nd | 37.86 | 10.7 |
| LuminariousDuo 1.13 | 3rd | 49.65 | 27.3 |
| GeminiTeam 2.1 | 4th | 37.83 | 10.7 |
| MarioBros 1.0 | 5th | 45.73 | 35.3 |
| TassieDevils 1.8 | 6th | 63.57 | 89.3 |
| CoyotePair .1 | - (51.08) | 46.07 | 21.0 |

Where the APS goes: lifting the four strong teams (NightAndDay, GeminiTeam, MarioBros,
LuminariousDuo) to 55 is worth about 1.8 APS. They win by survival, so TwinSaor loses whole
rounds. About 1.5 more is in the weaker teams that tie it or beat it: CoyotePair, InevitableTeam
50.05, ImpactTwins 52.42, KomariousTeam 53.73, YinYang 54.78, JointStrikeForce 55.54. The
sitting ducks (97 to 100) and the easy teams (76 to 81) are near their ceiling.

Before release, in the cloud:

| Version | Date (UTC) | Where | Result |
|---|---|---|---|
| 0.1 | 2026-10-27 | cloud, vs LunarTwins 1.4a, 20 x 35 rounds | 58.2% score share, 83.1% rounds won |

Releases are tagged `twinsaor-v<version>` by `.github/workflows/release-twinsaor.yml`, with notes
in `docs/releases/twinsaor-v<version>.md`.
