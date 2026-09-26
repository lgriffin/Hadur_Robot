# Hadur 2

**Hadur** (the Hungarian god of war) is a [Robocode](https://robocode.sourceforge.io/) robot:
wave surfing and KNN guns with an anti-surfer array one on one, minimum-risk movement and a
circular gun in melee, and a core that has no idea it is inside Robocode.

**Release 2.1** is the MeleeRumble entry: the Hadur 2 duelist (S0 to S2) with the 1.x melee
brain folded into the core. See [the release](https://github.com/lgriffin/Hadur_Robot/releases/tag/v2.1)
and [how to enter it](docs/meleerumble-submission.md).

Hadur 2 is being rebuilt in stages (S0 to S7) from the "Hadur 2: a duelist that remembers"
plan. Every stage is gated by the bench, and every requirement in
[docs/requirements.md](docs/requirements.md) is written in EARS form and traced to the tests
that prove it.

| Stage | What | State |
|---|---|---|
| S0 | Headless bench and 1.20 baseline | done ([baseline](docs/bench/s0-baseline-1.20-cold.md)) |
| S1 | Hexagonal extraction: core, adapter, guard, replay | done ([bench](docs/bench/s1-2.0-cold.md)) |
| S2 | Energy ledger, radar reacquire | done ([bench](docs/bench/s2-2.0-cold.md)) |
| S3 | Opponent memory | |
| S4 | Recognise and adapt | |
| S5 | Aggressive | |
| S6 | Unhittable, plus the tick budget | |
| S7 | Cut melee, rewrite the docs | |
| 2.1 | Melee brain in the core (MELEE-1..8), Java 11 target (REL-1) | released ([samples](docs/bench/melee-2.1-samples.md), [classic](docs/bench/melee-2.1-classic.md), [strong](docs/bench/melee-2.1-strong.md)) |

## Layout

```
hadur-core/    the brain: physics, waves, KNN, guns, movement, melee. Plain Java, no Robocode.
hadur-robot/   the Robocode adapter (hadur2.Hadur): events in, orders out.
hadur-bench/   headless battles, the bench report, and the replay recorder.
docs/          requirements, architecture, bench reports.
repo/          the vendored Robocode 1.9.3.0 API jar.
```

See [docs/architecture.md](docs/architecture.md) for how the pieces fit, and [docs/strategy-evolution.md](docs/strategy-evolution.md) for how the strategy has evolved stage by stage.

## Build and test

Java 17 or later, Maven 3.9. The robot itself is compiled for Java 11 so every RoboRumble
client can load it (REL-1).

```sh
mvn verify                  # all modules: tests, traceability, robot jar
```

The robot jar is `hadur-robot/target/hadur2.Hadur_2.1.jar`; drop it into a Robocode
`robots/` directory. The core is bundled inside it.

hadur-core's tests are layered:

| Layer | Where | Covers |
|---|---|---|
| Architecture | `arch/ArchitectureTest` (ArchUnit) | CORE-1 no Robocode in the core; RES-6 no randomness, threads, reflection, I/O or clock; no mutable statics |
| Properties | `*Properties` (jqwik) | the core's angle and rule helpers equal the engine's, bit for bit; the replay codec round-trips; WAVE-1/2 the ledger recovers the exact shot power under any mix of hits, refunds, collisions and wall damage, and never turns an explained drop into a wave |
| Unit | `GuardTest`, `RoundStatsTest`, `ResourceBoundsTest`, `ledger/EnergyLedgerTest`, `RadarReacquireTest` | RES-1 safe orders on a fault; RES-5 counters in the round record; RES-2 bounded growth; WAVE-1/2 each correction and the [0.1, 3.0] bounds; RADAR-1 the sweep after a missed scan |
| Replay | `replay/ReplayTest` | CORE-2: real recorded battles against every reference opponent replay to the live robot's exact orders |
| Behaviour | `features/*.feature` (Cucumber) | one feature per EARS group; each scenario is tagged `@<ID>` |
| Traceability | `trace/RequirementsTraceabilityTest` | fails if any requirement due by `hadur.stage` has no test, a tag names no requirement, or a jqwik test uses JUnit's `@Tag` (jqwik would skip it); writes `target/requirements-coverage.md` |

## Bench

```sh
mvn package -DskipTests
cd hadur-bench
mvn exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
```

For a 10-robot melee, as in the MeleeRumble:

```sh
mvn exec:java -Dexec.args="--set melee-samples.txt --melee true --field 1000x1000 --seeds 3"
```

Details in [hadur-bench/README.md](hadur-bench/README.md). Put third-party opponents such
as `abc.Shadow_3.83c.jar` in `hadur-bench/opponents/` (not committed).

## Telemetry

Hadur prints line records to its console, which the bench collects:

- `V,1`: format version, once per battle.
- `B,round,tick,...,name,...`: the opponent, on first scan.
- `R,round,tick,result,ourEnergy,enemyEnergy,ourHitRate,ourMargin,theirHitRate,theirMargin,phantomWaves,skippedTurns,faults,computationLevel,radarReacquired,hiddenShots`: once per round. Fields are only ever appended.
- `FAULT,round,tick,exception`: the first time in a round the guard has to cover for the core.
- `EW,round,tick,waveId,fireTick,rawDrop,correctedDrop,power,distance`: each enemy wave the energy ledger infers (S2). `rawDrop` is what 1.20 would have used; `correctedDrop` is after taking out our hits, their refunds, collisions and wall damage.

## History

Hadur 1.x (up to 1.20) was a dual-mode duel and melee robot. Hadur 2 started as a pure
duelist; for the MeleeRumble, release 2.1 ported the 1.x melee work (from the
`claude/project-thread-3j7vn4` branch) into the core's `melee` package. The old feature
files are kept in [docs/legacy-features](docs/legacy-features).
