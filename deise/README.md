# Deise

`hadur117.mini.Deise` is Hadur's MiniMelee robot, built to take MiniMelee 1st from
kc.mini.Mirage 0.2: Saor's graded Markov gun, learning every robot it scans, over a least-risk
movement that holds the corners while the field is crowded. The design, the Mirage analysis and
the stages are in [docs/deise.md](../docs/deise.md); the requirements are DEISE-1 to DEISE-15 in
[docs/requirements.md](../docs/requirements.md).

## Status

0.2 is MiniMelee sized: one class, 1,490 bytes of 1,499, the core flattened by hand and held to it
order for order (DEISE-16). Card `pc-deise-e01` measures the design on the live-shaped MiniMelee
census against Mirage and Saor. 0.1 went out unfitted at 2,303 bytes by mistake and is not listed.

Releases are tagged `deise-v<version>` by `.github/workflows/release-deise.yml`, with notes in
`docs/releases/deise-v<version>.md`.

## Build

    mvn -pl deise -am verify

The shipped jar is `deise/target/hadur117.mini.Deise_<version>.jar` (one class, through ProGuard);
`DeiseJarIT` prints its codesize. The bench adapter's jar is `hadur117.mini.DeiseLab_<version>.jar`.
