# Saor

`hadur117.micro.Saor` is a MicroMelee robot: a melee robot under the MicroMelee's 750-byte codesize
limit. **Saor 0.3 is 1st of 158 in the MicroMelee** (69.51 ± 0.27 APS, 2026-11-02), 0.24 ahead of
kc.micro.Figment 1.0. The design, the tests and the bench are in [docs/saor.md](../docs/saor.md);
the requirements are in [docs/requirements/saor.md](../docs/requirements/saor.md).

## Credit

Saor is built on **Figment 1.0 by Kevin Clark (Kev)**, `kc.micro.Figment`, whose source ships in its
jar (no licence is stated in it). The corner oscillation (MeleeSeed's movement, by Simonton, as
Figment's own header says), the Markov state packing, the play-it-forward playout, the 1,024-bin
vote and the power rule are Figment's design, and Saor's class restates them line for line: about
90 of its 103 lines follow Figment's. Saor's own parts are the circular cold start, sampling any
seen row, the graded vote on thin patterns and learning on every scan; those are where its lead
over Figment comes from ([docs/saor.md](../docs/saor.md)). The 0.1 to 0.3 releases went out without
this credit in their READMEs and jars; the README and the jar description now carry it. An attempt
to replace the Figment parts with original designs (0.4) was stopped: no all-original Saor fitted
in 749 bytes ([docs/bench/saor-0.4-own-parts.md](../docs/bench/saor-0.4-own-parts.md)).

## How it works

Saor is 723 bytes.

- **Movement:** corner oscillation, as in Figment and MeleeSeed.
- **Gun:** a per-opponent Markov model of each robot's movement. It plays each candidate path
  forward from the current state and votes over 1,024 bearing bins, grading its trust in patterns
  it has seen only a few times. It starts cold with a circular guess, samples any seen row, and
  learns on every scan of its target.

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles, so Saor shows up in
every melee table it is small enough for. MicroMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.3 | 2026-11-02 16:00 | **MicroMelee** | **1st of 158** | **69.51 ± 0.27** | | Saor, 2nd kc.micro.Figment 1.0 | -0.24 (leads) |
| 0.3 | 2026-10-30 21:50 (API) | **MicroMelee** | **1st of 158** | **69.73** | 594 | Saor, 2nd kc.micro.Figment 1.0 69.28 | -0.45 (leads) |
| 0.3 | 2026-10-30 21:50 (API) | MiniMelee | 3rd of 206 | 69.09 | 785 | kc.mini.Mirage 0.2, 71.15 | +2.06 |
| 0.3 | 2026-10-30 21:50 (API) | MeleeRumble | 19th of 418 | 65.54 | 1,741 | aaa.r.ScalarR 0.005g.047, 72.72 | +7.18 |
| 0.3 | 2026-10-27 23:45 | **MicroMelee** | **1st of 157** | **69.80 ± 0.43** | 415 | Saor, 2nd kc.micro.Figment 1.0 69.36 | -0.44 (leads) |
| 0.3 | 2026-10-27 23:45 | MiniMelee | 3rd of 205 | 69.20 ± 0.38 | 534 | kc.mini.Mirage 0.2, 71.20 | +2.00 |
| 0.3 | 2026-10-27 23:45 | MeleeRumble | 19th of 417 | 65.68 ± 0.26 | 1,167 | aaa.r.ScalarR 0.005g.047, 72.75 | +7.07 |
| 0.2 | 2026-10-27 15:40 | MicroMelee | **1st of 157** | **69.42 ± 0.39** | 497 | Saor, 2nd kc.micro.Figment 1.0 69.36 | -0.06 (leads) |
| 0.2 | 2026-10-27 15:40 | MiniMelee | 2nd of 204 | 68.79 ± 0.34 | 644 | kc.mini.Mirage 0.2, 71.30 | +2.51 |
| 0.2 | 2026-10-27 16:00 | MeleeRumble | 19th of 416 | - | - | - | - |
| 0.1 | 2026-10-25 23:32 | MicroMelee | 3rd of 157 | 68.08 ± 0.37 | 533 | kc.micro.Figment 1.0, 69.37 | +1.29 |
| 0.1 | 2026-10-25 23:32 | MiniMelee | 5th of 204 | 67.36 ± 0.32 | 728 | kc.mini.Mirage 0.2, 71.31 | +3.95 |
| 0.1 | 2026-10-25 23:45 | MeleeRumble | 31st of 416 | 63.70 ± 0.22 | 1,460 | aaa.r.ScalarR 0.005g.047, 72.78 | +9.08 |

Saor 0.3 took 1st in MicroMelee on its full first pass (156 of 156 pairings): 69.80 against
Figment's 69.36, winning more pairings than any other robot (PWIN 100.00), and has held it since.
It gained +0.38 over 0.2, as the bench projected, and survival rose from 35.9% to 41.1%. In
MiniMelee it is 3rd, behind Mirage and Deise; it is 19th in the full MeleeRumble.

Saor 0.2 was already 1st in MicroMelee on its first pass, by 0.06 (a tie within the noise), +1.34
over 0.1, and climbed from 31st to 19th in the MeleeRumble as survival rose from 29.6% to 35.9%.
The bench census shaped like the live rumble (SAOR-16) predicted 0.2 to within 0.02 of live.
The saved pages are in `data/rumble/pages/` under 2026-10-25T23* (0.1), 2026-10-27T1540Z* (0.2)
and 2026-10-27T2345Z* (0.3).

## Release history

Released versions are tagged `saor-v<version>` by `.github/workflows/release-saor.yml`, with notes
in `docs/releases/saor-v<version>.md`.

| Version | Released | Size | What changed | Bench |
|---|---|---|---|---|
| [**0.3**](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.3) | 2026-10-27 | 723 B | Learns on every scan of its target; no end-game power cap. | +0.49 ± 0.33 APS on the MicroMelee census |
| [**0.2**](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.2) | 2026-10-27 | | The graded vote, no ram leg, learning below 0.9 gun heat. | 69.83 against Figment's 69.79 in the same run, +1.55 over 0.1 |
| [**0.1**](https://github.com/lgriffin/Hadur_Robot/releases/tag/saor-v0.1) | 2026-10-25 | | First release. | 66.45 ± 0.24 on the MicroMelee census |

The MeleeRumble participants line for the current release is
`hadur117.micro.Saor 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.3/hadur117.micro.Saor_0.3.jar`.

The Irish flag on the rumble pages comes from one line, `hadur117,IRL`, on the robowiki page
[RoboRumble/Country Flags](https://robowiki.net/wiki/RoboRumble/Country_Flags). Flags go by
package; from 3.19 Hadur is in `hadur117` too (NAME-1).

## Build

    mvn -pl saor verify

The jar is `saor/target/hadur117.micro.Saor_<version>.jar`; `SaorJarIT` checks its codesize. The
bench adapter, `SaorLab`, is the same robot plus paint and a per-round log line, and is not for the
rumble.
