# Deise

`hadur117.mini.Deise` is Hadur's MiniMelee robot, built to take MiniMelee 1st from
kc.mini.Mirage 0.2: Saor's graded Markov gun, learning every robot it scans, over a least-risk
movement that holds the corners while the field is crowded. The design, the Mirage analysis and
the stages are in [docs/deise.md](../docs/deise.md); the requirements are DEISE-1 to DEISE-15 in
[docs/requirements.md](../docs/requirements.md).

## Status

Stage E0: the design is built and tested, at about 2,300 bytes against MiniMelee's 1,499.
Card `pc-deise-e01` measures it on the live-shaped MiniMelee census against Mirage and Saor
before it is fitted (stage E2). Not released.

## Build

    mvn -pl deise -am verify

The jar is `deise/target/hadur117.mini.Deise_<version>.jar`; `DeiseJarIT` prints its codesize.
