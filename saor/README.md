# Saor

`hadur117.micro.Saor` is Hadur's MicroMelee robot: 748 bytes, corner oscillation and a
per-opponent Markov gun that grades its trust in thin patterns. The design, the tests and the bench are in
[docs/saor.md](../docs/saor.md). The plan to reach 1st is
[docs/plan-saor-first.md](../docs/plan-saor-first.md).

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles, so Saor shows up in
every melee table it is small enough for. MicroMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.2 | 2026-10-27 15:40 | **MicroMelee** | **1st of 157** | **69.42 ± 0.39** | 497 | Saor, 2nd kc.micro.Figment 1.0 69.36 | -0.06 (leads) |
| 0.2 | 2026-10-27 15:40 | MiniMelee | 2nd of 204 | 68.79 ± 0.34 | 644 | kc.mini.Mirage 0.2, 71.30 | +2.51 |
| 0.2 | 2026-10-27 16:00 | MeleeRumble | 19th of 416 | - | - | - | - |
| 0.1 | 2026-10-25 23:32 | MicroMelee | 3rd of 157 | 68.08 ± 0.37 | 533 | kc.micro.Figment 1.0, 69.37 | +1.29 |
| 0.1 | 2026-10-25 23:32 | MiniMelee | 5th of 204 | 67.36 ± 0.32 | 728 | kc.mini.Mirage 0.2, 71.31 | +3.95 |
| 0.1 | 2026-10-25 23:45 | MeleeRumble | 31st of 416 | 63.70 ± 0.22 | 1,460 | aaa.r.ScalarR 0.005g.047, 72.78 | +9.08 |

**Saor 0.2 is 1st in MicroMelee** on its first pass: 69.42 against Figment's 69.36, a 0.06
lead inside its ±0.39, so it is a tie on the numbers and the lead can still change hands. It
gained +1.34 over 0.1 and took 2nd in MiniMelee too, ahead of Figment and Wallaby, and
climbed from 31st to 19th in the full MeleeRumble. Survival
rose from 29.6% to 35.9%. The live-shaped census called it: 0.2 (stage 4's S2) read 69.83
against Figment's 69.79 in the same run (PR #329), +0.04 against +0.06 live. Stage 5a's LA
(learning on every scan) adds +0.45 ± 0.29 on the MicroMelee census (PR #347); stage 5b
(`pc-saor-s05`) checks it with Figment seated before a 0.3, to turn the tie into a clear lead.

Bench census before 0.1's release: 66.45 ± 0.24 (PR #284). That live score is 1.6 higher,
because the MicroMelee census is not run the way the live rumble is; the live-shaped census
(SAOR-16) is. The pages are archived in `data/rumble/pages/` under 2026-10-25T23* (0.1) and
2026-10-27T1540Z* (0.2).

## Releases

Saor has its own tags, `saor-v<version>`, made by `.github/workflows/release-saor.yml`. The
notes are in `docs/releases/saor-v<version>.md`.

The Irish flag on the rumble pages comes from one line, `hadur117,IRL`, on the robowiki page
[RoboRumble/Country Flags](https://robowiki.net/wiki/RoboRumble/Country_Flags). Flags go by
package, so Hadur's `hadur2,IRL` did not cover Saor's `hadur117`. Leigh adds it (2026-10-27); from 3.19 Hadur is in `hadur117` too (NAME-1).

- [saor-v0.2](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.2), 2026-10-27:
  the graded vote, no ram leg, learning below 0.9 gun heat. On the live-shaped census it reads
  69.83 against Figment's 69.79 in the same run, +1.55 over 0.1. The participants line is
  `hadur117.micro.Saor 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.2/hadur117.micro.Saor_0.2.jar`.
- [saor-v0.1](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.1), 2026-10-25.
  The MeleeRumble participants line is
  `hadur117.micro.Saor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.1/hadur117.micro.Saor_0.1.jar`.
