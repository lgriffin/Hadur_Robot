# Saor

`hadur117.micro.Saor` is Hadur's MicroMelee robot: 723 bytes, corner oscillation and a
per-opponent Markov gun that grades its trust in thin patterns. The design, the tests and the bench are in
[docs/saor.md](../docs/saor.md). The plan to reach 1st is
[docs/plan-saor-first.md](../docs/plan-saor-first.md).

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles, so Saor shows up in
every melee table it is small enough for. MicroMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
| 0.3 | 2026-10-30 21:50 (API) | **MicroMelee** | **1st of 158** | **69.73** | 594 | Saor, 2nd kc.micro.Figment 1.0 69.28 | -0.45 (leads) |
| 0.3 | 2026-10-30 21:50 (API) | MiniMelee | 3rd of 206 | 69.09 | 785 | kc.mini.Mirage 0.2, 71.15 | +2.06 |
| 0.3 | 2026-10-30 21:50 (API) | MeleeRumble | 19th of 418 | 65.54 | 1,741 | aaa.r.ScalarR 0.005g.047, 72.72 | +7.18 |
|---|---|---|---|---|---|---|---|
| 0.3 | 2026-10-27 23:45 | **MicroMelee** | **1st of 157** | **69.80 ± 0.43** | 415 | Saor, 2nd kc.micro.Figment 1.0 69.36 | -0.44 (leads) |
| 0.3 | 2026-10-27 23:45 | MiniMelee | 3rd of 205 | 69.20 ± 0.38 | 534 | kc.mini.Mirage 0.2, 71.20 | +2.00 |
| 0.3 | 2026-10-27 23:45 | MeleeRumble | 19th of 417 | 65.68 ± 0.26 | 1,167 | aaa.r.ScalarR 0.005g.047, 72.75 | +7.07 |
| 0.2 | 2026-10-27 15:40 | MicroMelee | **1st of 157** | **69.42 ± 0.39** | 497 | Saor, 2nd kc.micro.Figment 1.0 69.36 | -0.06 (leads) |
| 0.2 | 2026-10-27 15:40 | MiniMelee | 2nd of 204 | 68.79 ± 0.34 | 644 | kc.mini.Mirage 0.2, 71.30 | +2.51 |
| 0.2 | 2026-10-27 16:00 | MeleeRumble | 19th of 416 | - | - | - | - |
| 0.1 | 2026-10-25 23:32 | MicroMelee | 3rd of 157 | 68.08 ± 0.37 | 533 | kc.micro.Figment 1.0, 69.37 | +1.29 |
| 0.1 | 2026-10-25 23:32 | MiniMelee | 5th of 204 | 67.36 ± 0.32 | 728 | kc.mini.Mirage 0.2, 71.31 | +3.95 |
| 0.1 | 2026-10-25 23:45 | MeleeRumble | 31st of 416 | 63.70 ± 0.22 | 1,460 | aaa.r.ScalarR 0.005g.047, 72.78 | +9.08 |

**Saor 0.3 is 1st in MicroMelee** on a full first pass (156 of 156 pairings): 69.80 against
Figment's 69.36, a 0.44 lead, about one of its ±0.43, and it wins more pairings than any other
robot (PWIN 100.00). It gained +0.38 over 0.2, as the bench projected (69.6 to 69.7 from stage
5b's LAU), and survival rose from 35.9% to 41.1%. In MiniMelee it is 3rd at 69.20, behind
Mirage and Deise 0.2, and +0.41 up on 0.2's 68.79. It stays 19th in the full MeleeRumble.

Saor 0.2 was 1st in MicroMelee on its first pass: 69.42 against Figment's 69.36, a 0.06
lead inside its ±0.39, so it is a tie on the numbers and the lead can still change hands. It
gained +1.34 over 0.1 and took 2nd in MiniMelee too, ahead of Figment and Wallaby, and
climbed from 31st to 19th in the full MeleeRumble. Survival
rose from 29.6% to 35.9%. The live-shaped census called it: 0.2 (stage 4's S2) read 69.83
against Figment's 69.79 in the same run (PR #329), +0.04 against +0.06 live. Stage 5a's LA
(learning on every scan) adds +0.45 ± 0.29 on the MicroMelee census (PR #347); stage 5b
(`pc-saor-s05`, PR #360) checked it with Figment seated: LAU (LA without the end-game power cap)
reads +0.26 ± 0.26 over 0.2 there and +0.49 ± 0.33 on the MicroMelee census, and ships as 0.3.

Bench census before 0.1's release: 66.45 ± 0.24 (PR #284). That live score is 1.6 higher,
because the MicroMelee census is not run the way the live rumble is; the live-shaped census
(SAOR-16) is. The pages are archived in `data/rumble/pages/` under 2026-10-25T23* (0.1) and
2026-10-27T1540Z* (0.2) and 2026-10-27T2345Z* (0.3).

## Releases

Saor has its own tags, `saor-v<version>`, made by `.github/workflows/release-saor.yml`. The
notes are in `docs/releases/saor-v<version>.md`.

The Irish flag on the rumble pages comes from one line, `hadur117,IRL`, on the robowiki page
[RoboRumble/Country Flags](https://robowiki.net/wiki/RoboRumble/Country_Flags). Flags go by
package, so Hadur's `hadur2,IRL` did not cover Saor's `hadur117`. Leigh adds it (2026-10-27); from 3.19 Hadur is in `hadur117` too (NAME-1).

- [saor-v0.3](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.3), 2026-10-27:
  learning on every scan of the target and no end-game power cap, 723 bytes. The participants
  line is
  `hadur117.micro.Saor 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.3/hadur117.micro.Saor_0.3.jar`.
- [saor-v0.2](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.2), 2026-10-27:
  the graded vote, no ram leg, learning below 0.9 gun heat. On the live-shaped census it reads
  69.83 against Figment's 69.79 in the same run, +1.55 over 0.1. The participants line is
  `hadur117.micro.Saor 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.2/hadur117.micro.Saor_0.2.jar`.
- [saor-v0.1](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.1), 2026-10-25.
  The MeleeRumble participants line is
  `hadur117.micro.Saor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.1/hadur117.micro.Saor_0.1.jar`.
