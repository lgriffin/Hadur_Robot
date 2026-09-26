# Hadur 2

**Hadur** (the Hungarian god of war) is a 1v1 [Robocode](https://robocode.sourceforge.io/) robot:
wave surfing, KNN guns with an anti-surfer array, and a core that has no idea it is inside Robocode.

Hadur 2 is being rebuilt in stages (S0 to S7) from the "Hadur 2: a duelist that remembers"
plan. Every stage is gated by the bench, and every requirement in
[docs/requirements.md](docs/requirements.md) is written in EARS form and traced to the tests
that prove it.

| Stage | What | State |
|---|---|---|
| S0 | Headless bench and 1.20 baseline | done ([baseline](docs/bench/s0-baseline-1.20-cold.md)) |
| S1 | Hexagonal extraction: core, adapter, guard, replay | this branch ([bench](docs/bench/s1-2.0-cold.md)) |
| S2 | Energy ledger | |
| S3 | Opponent memory | |
| S4 | Recognise and adapt | |
| S5 | Aggressive | |
| S6 | Unhittable, plus the tick budget | |
| S7 | Cut melee, rewrite the docs | |

## Layout

```
hadur-core/    the brain: physics, waves, KNN, guns, movement. Plain Java, no Robocode.
hadur-robot/   the Robocode adapter (hadur2.Hadur): events in, orders out.
hadur-bench/   headless battles, the bench report, and the replay recorder.
docs/          requirements, architecture, bench reports.
repo/          the vendored Robocode 1.9.3.0 API jar.
```

See [docs/architecture.md](docs/architecture.md) for how the pieces fit.

## Build and test

Java 17 or later, Maven 3.9.

```sh
mvn verify                  # all modules: tests, traceability, robot jar
```

The robot jar is `hadur-robot/target/hadur2.Hadur_2.0.jar`; drop it into a Robocode
`robots/` directory. The core is bundled inside it.

hadur-core's tests are layered:

| Layer | Where | Covers |
|---|---|---|
| Architecture | `arch/ArchitectureTest` (ArchUnit) | CORE-1 no Robocode in the core; RES-6 no randomness, threads, reflection, I/O or clock; no mutable statics |
| Properties | `*Properties` (jqwik) | the core's angle and rule helpers equal the engine's, bit for bit; the replay codec round-trips |
| Unit | `GuardTest`, `RoundStatsTest`, `ResourceBoundsTest` | RES-1 safe orders on a fault; RES-5 counters in the round record; RES-2 bounded growth |
| Replay | `replay/ReplayTest` | CORE-2: real recorded battles against every reference opponent replay to the live robot's exact orders |
| Behaviour | `features/*.feature` (Cucumber) | one feature per EARS group; each scenario is tagged `@<ID>` |
| Traceability | `trace/RequirementsTraceabilityTest` | fails if any requirement due by `hadur.stage` has no test, or a tag names no requirement; writes `target/requirements-coverage.md` |

## Bench

```sh
mvn package -DskipTests
cd hadur-bench
mvn exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
```

Details in [hadur-bench/README.md](hadur-bench/README.md). Put third-party opponents such
as `abc.Shadow_3.83c.jar` in `hadur-bench/opponents/` (not committed).

## Telemetry

Hadur prints line records to its console, which the bench collects:

- `V,1`: format version, once per battle.
- `B,round,tick,...,name,...`: the opponent, on first scan.
- `R,round,tick,result,ourEnergy,enemyEnergy,ourHitRate,ourMargin,theirHitRate,theirMargin,phantomWaves,skippedTurns,faults,computationLevel`: once per round.
- `FAULT,round,tick,exception`: the first time in a round the guard has to cover for the core.

## History

Hadur 1.x (up to 1.20) was a dual-mode duel and melee robot. Its melee work is parked on
the `claude/project-thread-3j7vn4` branch for a possible separate melee robot; its old
feature files are kept in [docs/legacy-features](docs/legacy-features).
