# Deise

`hadur117.mini.Deise` is Hadur's MiniMelee robot, built to take MiniMelee 1st from
kc.mini.Mirage 0.2: Saor's graded Markov gun, learning every robot it scans, over a least-risk
movement that holds the corners while the field is crowded. The design, the Mirage analysis and
the stages are in [docs/deise.md](../docs/deise.md); the requirements are DEISE-1 to DEISE-15 in
[docs/requirements.md](../docs/requirements.md).

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles. MiniMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.2 | 2026-10-27 23:45 | **MiniMelee** | **2nd of 205** | **69.68 ± 0.39** | 533 | kc.mini.Mirage 0.2, 71.20 | +1.52 |
| 0.2 | 2026-10-27 23:45 | MeleeRumble | 16th of 417 | 66.44 ± 0.26 | 1,121 | aaa.r.ScalarR 0.005g.047, 72.75 | +6.31 |

**Deise 0.2 is 2nd in MiniMelee** on a full first pass (204 of 204 pairings), 1.52 behind
Mirage and ahead of Saor 0.3, Figment and Wallaby. Its survival is 42.4% against Mirage's
55.5%, and that is the gap: Mirage is its worst pairing (47.5), then Saor (50.3). In the full
MeleeRumble it is 16th, three places above Saor. The live-shaped MiniMelee census
(`pc-deise-e01`, PR #371) projected 69.46 for it, 0.22 under the live score, so the bench
transfers. On that census the seen-shot waves (arm W) add +0.48 ± 0.25, and the rest of the
stage E0 arms are within noise; the waves do not fit in the 9 bytes left, so stage E1 measures
what can pay for them. The pages are archived in `data/rumble/pages/` under 2026-10-27T2345Z*.

0.2 is MiniMelee sized: one class, 1,490 bytes of 1,499, the core flattened by hand and held to it
order for order (DEISE-16). 0.1 went out unfitted at 2,303 bytes by mistake and is not listed.

Releases are tagged `deise-v<version>` by `.github/workflows/release-deise.yml`, with notes in
`docs/releases/deise-v<version>.md`.

## Build

    mvn -pl deise -am verify

The shipped jar is `deise/target/hadur117.mini.Deise_<version>.jar` (one class, through ProGuard);
`DeiseJarIT` prints its codesize. The bench adapter's jar is `hadur117.mini.DeiseLab_<version>.jar`.
