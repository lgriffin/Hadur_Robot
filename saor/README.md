# Saor

`hadur117.micro.Saor` is Hadur's MicroMelee robot: 749 bytes, corner oscillation and a
per-opponent Markov gun. The design, the tests and the bench are in
[docs/saor.md](../docs/saor.md). The plan to reach 1st is
[docs/plan-saor-first.md](../docs/plan-saor-first.md).

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles, so Saor shows up in
every melee table it is small enough for. MicroMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.1 | 2026-10-25 23:32 | **MicroMelee** | **3rd of 157** | **68.08 ± 0.37** | 533 | kc.micro.Figment 1.0, 69.37 | +1.29 |
| 0.1 | 2026-10-25 23:32 | MiniMelee | 5th of 204 | 67.36 ± 0.32 | 728 | kc.mini.Mirage 0.2, 71.31 | +3.95 |
| 0.1 | 2026-10-25 23:45 | MeleeRumble | 31st of 416 | 63.70 ± 0.22 | 1,460 | aaa.r.ScalarR 0.005g.047, 72.78 | +9.08 |

Bench census before release: 66.45 ± 0.24 (PR #284). The live score is 1.6 higher, because
the bench census is not run the way the live rumble is (see the plan). The pages are archived
in `data/rumble/pages/` under 2026-10-25T23*.

## Releases

Saor has its own tags, `saor-v<version>`, made by `.github/workflows/release-saor.yml`. The
notes are in `docs/releases/saor-v<version>.md`.

- [saor-v0.1](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.1), 2026-10-25.
  The MeleeRumble participants line is
  `hadur117.micro.Saor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.1/hadur117.micro.Saor_0.1.jar`.
