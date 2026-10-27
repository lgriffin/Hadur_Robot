# TwinSaor

`hadur117.twin.TwinSaor` is a Twin Duel team built on Saor. Twin Duel is 2v2 on an 800 x 800
field, under 2,000 bytes for the team jar. TwinSaor is one class, `hadur117.twin.SaorTwin`, listed
twice. It keeps Saor's Markov gun, shares every scan between the twins, focuses fire on the
enemy with the least energy, and puts its twins 90 degrees apart around the target. Design,
the LunarTwins analysis, the build and the bench card are in [docs/twinsaor.md](../docs/twinsaor.md).

    mvn -pl twinsaor verify      # tests, the team jar, the 1,999-byte gate

| Version | Date (UTC) | Where | Result |
|---|---|---|---|
| 0.1 | 2026-10-27 | cloud, vs LunarTwins 1.4a (Twin Duel 1st), 20 x 35 rounds | 58.2% score share, 83.1% rounds won |

Releases are tagged `twinsaor-v<version>` by `.github/workflows/release-twinsaor.yml`, with notes
in `docs/releases/twinsaor-v<version>.md`.
