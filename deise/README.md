# Deise

`hadur117.mini.Deise` is a MiniMelee robot: a melee robot under the MiniMelee's 1,500-byte codesize
limit. **Deise 0.5 is 1st of 206 in the MiniMelee** (71.18 ± 0.22 APS, 2026-11-02), just ahead of
kc.mini.Mirage 0.2, and 11th of 418 in the full MeleeRumble. The design, the analysis of Mirage and
each stage are in [docs/deise.md](../docs/deise.md); the requirements are DEISE-1 to DEISE-17 in
[docs/requirements/deise.md](../docs/requirements/deise.md).

## Credit

Deise's gun is Saor's, and Saor's gun is **Figment 1.0 by Kevin Clark (Kev)**, `kc.micro.Figment`:
the Markov state packing, the play-it-forward playout and the bin vote are Figment's design (no
licence is stated in its jar; see [saor/README.md](../saor/README.md)). The step off a seen shot's
line follows two lines of **Mirage 0.2 by Kev**, `kc.mini.Mirage` (RWPCL). The least-risk
movement, the likely-shooter weight, the wave log and the target rule (DEISE-17) are Deise's own.

## How it works

Deise is one class of 1,499 bytes, built through ProGuard.

- **Gun:** Saor's graded Markov gun, learning every robot it scans. It plays 400 playouts, each
  voting over half the target's width.
- **Target:** per opponent and across rounds it keeps its shots and hits, and targets the robot
  with the least distance times the square root of shots over hits (with a prior), so it shoots
  the robot it hits best for its distance.
- **Movement:** least-risk. It logs the shots it sees fired as waves and steps off their lines, and
  at every scan it tests whether each opponent is likely aiming at it: a likely shooter pushes it
  away twice as hard as one aiming elsewhere.

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles. MiniMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.5 | 2026-11-02 16:00 | **MiniMelee** | **1st of 206** | **71.18 ± 0.22** | | Deise; 2nd kc.mini.Mirage 0.2 | leads by 0.04 |
| 0.5 | 2026-11-01 09:06 | **MiniMelee** | **1st of 206** | **71.28 ± 0.28** | 851 | Deise; 2nd kc.mini.Mirage 0.2, 71.16 | leads by 0.12 |
| 0.5 | 2026-11-01 09:06 (API) | MeleeRumble | 11th of 418 | 68.09 ± 0.19 | 1,687 | aaa.r.ScalarR 0.005g.047, 72.71 | +4.62 |
| 0.5 | 2026-11-01 04:22 | **MiniMelee** | **1st of 206** | **71.35 ± 0.32** | 675 | Deise; 2nd kc.mini.Mirage 0.2, 71.15 | leads by 0.20 |
| 0.4 | 2026-10-30 21:50 (API) | **MiniMelee** | **2nd of 206** | **70.57** | 726 | kc.mini.Mirage 0.2, 71.15 | +0.58 |
| 0.4 | 2026-10-30 21:50 (API) | MeleeRumble | 15th of 418 | 67.60 | 1,585 | aaa.r.ScalarR 0.005g.047, 72.72 | +5.12 |
| 0.4 | 2026-10-30 14:02 | **MiniMelee** | **2nd of 206** | **70.54 ± 0.36** | 559 | kc.mini.Mirage 0.2, 71.15 | +0.61 |
| 0.3 | 2026-10-28 23:22 | MiniMelee | 2nd of 206 | 69.81 ± 0.33 | 641 | kc.mini.Mirage 0.2, 71.19 | +1.38 |
| 0.3 | 2026-10-28 23:35 | MeleeRumble | 15th of 418 | 66.59 | 1,282 | aaa.r.ScalarR 0.005g.047, 72.71 | +6.12 |
| 0.2 | 2026-10-27 23:45 | MiniMelee | 2nd of 205 | 69.68 ± 0.39 | 533 | kc.mini.Mirage 0.2, 71.20 | +1.52 |
| 0.2 | 2026-10-27 23:45 | MeleeRumble | 16th of 417 | 66.44 ± 0.26 | 1,121 | aaa.r.ScalarR 0.005g.047, 72.75 | +6.31 |

Deise 0.5 took 1st in MiniMelee on its first pass (205 of 205 pairings, 675 battles): 71.35 ± 0.32
against Mirage's 71.15, and 71.28 ± 0.28 over 851 battles later that morning. It gained +0.71 over
0.4 while surviving less (51.5% against 0.4's 54.7%; Mirage 55.6%), so the gain is damage dealt. In
the full MeleeRumble it is 11th (68.09), above Hadur 3.20 (15th, 67.72).

Each earlier version narrowed the gap to Mirage: 0.2 was 1.52 behind, 0.3 1.38 and 0.4 0.61. 0.3's
seen-shot waves and 0.4's likely-shooter weight lifted survival from 42.4% to 45.8% and then to
54.7%, level with Mirage, which left damage as the remaining gap for 0.5 to close. Each pairing has
only about three battles, so single pairings are too noisy to read. The saved pages are in
`data/rumble/pages/` under 2026-10-27T2345Z*, 2026-10-28T2322Z*, 2026-10-30T1402Z* and 2026-11-01T0906Z*.

## Release history

Released versions are tagged `deise-v<version>` by `.github/workflows/release-deise.yml`, with
notes in `docs/releases/deise-v<version>.md`. Bench gains are in APS over the previous version.

| Version | Released | Size | What changed | Bench |
|---|---|---|---|---|
| **0.5** | 2026-11-01 | 1,499 B | Learned targeting (shoots whom it hits best for its distance); 400 playouts voting over half the target's width. | targeting +0.45 ± 0.40, gun +0.13 ± 0.21 |
| **0.4** | 2026-10-30 | 1,499 B | The likely-shooter weight scales each opponent's push as well as its waves; every push is stronger against the waves; no field cap on power. | +0.39 ± 0.22 |
| **0.3** | 2026-10-28 | 1,494 B | Seen-shot waves fitted into one class, with 200 playouts; the across term, hold, corners, kill cap and hit correction dropped to make room. | +1.33 over Saor 0.3 |
| **0.2** | 2026-10-27 | 1,490 B | First MiniMelee-sized build: one class, the core flattened by hand and held to it order for order (DEISE-16). | 69.46 projected, 69.68 live |
| 0.1 | 2026-10-27 | 2,303 B | Went out over the size limit by mistake; superseded the same day by 0.2. | |

## Build

    mvn -pl deise -am verify

The jar is `deise/target/hadur117.mini.Deise_<version>.jar` (one class, through ProGuard);
`DeiseJarIT` prints its codesize. The bench adapter's jar is `hadur117.mini.DeiseLab_<version>.jar`.
