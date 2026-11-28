# Requirements

Hadur's requirements, written in EARS and traced to the tests that prove them. One file per area; `RequirementsTraceabilityTest` reads them all and fails the build when an active requirement has no test, a tag names no requirement, or an ID is reused.

| Area | Requirements | Families |
|---|---|---|
| [Core, architecture and resilience](core.md) | 92 | ADAPT CORE DIAL GATE LINK MEM NAME PHYS RADAR REL RES ROLE SHELF STRAND TIME WAVE WEAVE WORLD |
| [1v1](duel.md) | 116 | AES DIST DODGE END GUN MATCH MIR MOVE ORACLE POISON POW RAM SHIELD SKEY |
| [Melee](melee.md) | 36 | MELEE MEND MGUN MMEM MMOVE MRADAR MSENSE |
| [Team](team.md) | 28 | TMODE |
| [Bench](bench.md) | 187 | BENCH |
| [Saor (MicroMelee)](saor.md) | 15 | SAOR |
| [TwinSaor (Twin Duel)](twinsaor.md) | 14 | TWIN |
| [Deise (MiniMelee)](deise.md) | 17 | DEISE |
| [Sanaro (NanoMelee)](sanaro.md) | 14 | SANARO |
| [Sanara (NanoRumble)](sanara.md) | 3 | SANARA |
| [JayLexi (MiniRumble)](jaylexi.md) | 18 | JAYLEXI |
| [Eveimear (MicroRumble)](eveimear.md) | 13 | EVEIMEAR |
| [Retired](retired.md) | 177 | |

550 active requirements, 177 retired.

## Writing a requirement

Each row is `| ID | Pattern | Requirement | Stage |`. The pattern is one of EARS's:

| Pattern | Form |
|---|---|
| Ubiquitous | The <system> shall <response>. |
| Event | When <trigger>, the <system> shall <response>. |
| State | While <state>, the <system> shall <response>. |
| Unwanted | If <condition>, then the <system> shall <response>. |
| Optional | Where <feature>, the <system> shall <response>. |
| Complex | A combination of the keywords above. |

Stage records the plan stage or release a requirement came from; it no longer gates the check.

- Name the requirement in a test: `@Tag("MOVE-43")` on a JUnit or jqwik test, `@MOVE-43` on a Cucumber scenario, or `# @Tag("BENCH-156")` above a bench tool's Python test.
- Take the next free number of the family; never reuse one, retired or not.
- A bench card's row says only that the bench carries the card; its full specification goes in `hadur-bench/plans/<card>.md`. When the card has run and its results PR has merged, move its row to [retired.md](retired.md) with the outcome.
- The readings and stage notes that used to sit between the tables are archived in [requirement notes](../archive/requirements-notes.md).
