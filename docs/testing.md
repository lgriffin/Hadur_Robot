# Testing Hadur 2

Hadur 2 is tested in layers, from rules that hold on every build to battles in the real
engine. Every requirement in [requirements.md](requirements.md) is traced to at least one
test, and the build fails if one is not. The hexagonal core (see
[architecture.md](architecture.md)) is what makes this possible: the brain sees only
plain values, so it can be replayed, fuzzed and fault-injected without Robocode.

## Running the tests

Java 17 or later and Maven 3.9.

```sh
mvn -B verify                                   # every module: tests, rules, traceability, jars
mvn -B -pl hadur-core test                      # the core only
mvn -B -pl hadur-core test -Dtest=ReplayTest    # one class
```

`mvn -B verify` is the whole check. It is what the `build` workflow runs on every push
and pull request, and what the release workflow runs before it publishes a jar. When
GitHub Actions is not running jobs, run it locally before merging: 2.2 was built and
checked that way.

Surefire runs classes named `*Test`, `*Tests` and `*Properties`. jqwik keeps its
database in `target/.jqwik-database` and reports only failures.

## The layers

| Layer | Where | Covers |
|---|---|---|
| Architecture | `arch/ArchitectureTest` (ArchUnit) | CORE-1 no Robocode in the core; RES-6 no randomness, threads, reflection, I/O or clock; no mutable statics; the package dependency rules in [architecture.md](architecture.md); the policy and adapt packages cannot see the engine's inputs (DIAL-2) |
| Properties | `*Properties` (jqwik) | physics equals the engine's, bit for bit; the replay and profile codecs round-trip; WAVE-1/2 the ledger recovers the exact shot power under any mix of events; lineage keys, seeds and seed trust; the distance controller's bounds; MOVE-1 bullet shadows equal a brute-force collision check; SHIELD-2 the aim jitter stays within its band |
| Unit | per package (`ledger`, `memory`, `adapt`, `policy`, `gun`, `move`, `shield`, `melee`, `model`), plus `GuardTest`, `RoundStatsTest`, `RadarReacquireTest`, `FaithfulPortTest` | each requirement's rules and edge cases; RES-1 safe orders on a fault; RES-2 bounded growth; RES-5 counters in the round record |
| Release | `release/ReleaseTargetTest` | REL-1: every shipped class loads on Java 11 |
| Replay | `replay/ReplayTest` | CORE-2: battles recorded from the real robot in the real engine, one per reference opponent, replay to the same orders bit for bit |
| Behaviour | `features/*.feature` (Cucumber), steps in `steps/` | one feature per EARS group (core, waves, resilience, memory, adapt, aggressive, unhittable, shield, melee); each scenario is tagged `@<ID>` |
| Traceability | `trace/RequirementsTraceabilityTest` | the requirements file and the tests stay in step (below) |
| Adapter | `hadur-robot`: `FileProfileStoreTest` | the data-directory store, with a plain file stream in place of Robocode's: MEM-3 saves do not leak the write quota and round-trip through the library; RES-3 a write killed at any byte leaves a loadable profile |
| Bench | `hadur-bench`: `WaveMatcherTest`, `TelemetryReportTest`, and the bench itself | matching inferred waves to the engine's bullets; reading Hadur's records into the report; then whole battles (below) |

Test paths above are under `hadur-core/src/test/java/hadur2/core/` unless a module is
named.

## Traceability

`RequirementsTraceabilityTest` reads the requirements table in `docs/requirements.md` and
every test source in the three modules. It fails when:

- a requirement whose stage is at or before the build's stage is named by no test. The
  duel plan's S0–S7 are compared with `hadur.stage` (a root pom property, now `S7`) and the
  melee extension's M0–M6 with `hadur.melee.stage`;
- a tag names an ID that is not a requirement, so IDs cannot drift;
- a jqwik `*Properties` class tags with JUnit's `@Tag`, which would make jqwik skip it.

A JUnit or jqwik test names a requirement with `@Tag("MEM-3")`; a Cucumber scenario with
`@MEM-3`. The test writes the coverage table, each requirement with the tests that name
it, to `hadur-core/target/requirements-coverage.md`, and the `build` workflow adds it to
the run's summary.

All 41 requirements are covered. At release 2.2 the build runs 397 tests: 380 in the
core, 5 in the robot and 12 in the bench.

## Replay fixtures

The fixtures in `hadur-core/src/test/resources/replay/` are gzipped transcripts of real
battles, three rounds against each reference opponent: every `BotInput` the recorder
robot received and the `BotOrders` it issued. `ReplayTest` feeds each one through a fresh
core and requires the same orders. They pin behaviour, so:

- a change that is **not** meant to alter play must leave them passing;
- a change that **is** meant to alter play must re-record them (the command is in
  [hadur-bench/README.md](../hadur-bench/README.md#replay-fixtures)) and say so in its
  pull request.

The tick time (`TickTime`) is recorded like any other event, so the tick budget replays
too. The profile fixtures in `profiles/` (`v1.hp`, `v2.hp`) keep old profile formats
loadable.

## The duel is pinned

The melee extension may not change the duel. Two checks hold it to that on every build:
the replay fixtures (the duel's orders, tick for tick) and `DuelIdentityTest`, which pins a
hash of every source file in the duel's packages as of M0. A stage meant to change the duel
re-pins the snapshot with `-Dhadur.duel.snapshot=write` and says so in its pull request.

## The bench

Unit and replay tests say the code does what it was written to do; the bench says whether
that wins. Every stage was gated on it: 35 rounds × 5 seeds against the reference set
(Shadow 3.83c and five sample bots), cold and warm, with the score share given as a mean
and a 95% interval. The reports are in [bench/](bench/), and
[strategy-evolution.md](strategy-evolution.md) reads them stage by stage. The bench is
not part of `mvn verify`: it needs the opponents' jars and takes minutes per opponent.

The melee stages are gated on `hadur-bench/melee-gates.txt`, a suite that runs the duel's
reference bench and the melee benches (sentry safety, the sample challenge, the reference
field) in one command. Melee reports give Hadur's APS and survival the MeleeRumble way,
pairwise against each other robot, and read the per-round places, the rounds that ended
as a duel and the sentry hits from the engine's snapshots.

The bench also checks things no unit test can, against the engine's own record of each
battle (`truth.log.gz`): which of Hadur's inferred waves were real shots (WAVE-1/2), and
whether every enemy bullet ours destroyed fell inside a shadow Hadur computed (MOVE-1).

## What is not tested

- **The adapter has no unit tests of its own** beyond the profile store. It is covered
  end to end: the replay fixtures are recorded through it in the real engine, and the
  bench runs it.
- **No mutation testing.** The plan named PIT; it was not set up.
- **Rumble conditions.** The bench runs one host with a 3 ms allowance assumed; rumble
  clients differ (see [followup.md](../followup.md), S6).
