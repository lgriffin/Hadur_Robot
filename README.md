# Hadur 2

**Hadur** (the Hungarian god of war) is a [Robocode](https://robocode.sourceforge.io/) robot:
a 1v1 duelist that remembers each opponent across battles, with a melee brain for
free-for-alls, and a core that has no idea it is inside Robocode.

**Release 3.0** is the Hadur 2 duelist of stages S0 to S6 with the melee brain rebuilt by
the Melee Extension Plan (M0 to M6). It is built for both the RoboRumble (1v1) and the
MeleeRumble as `hadur2.Hadur 3.0`. See the [release notes](docs/releases/v3.0.md) and
[how to enter it](docs/rumble-submission.md).

## What it does

One on one (the duel):

- **Sees the enemy's shots as they really are.** An energy ledger takes our hits, their
  refunds, wall and collision damage out of each energy drop, so only real shots become
  waves (WAVE-1, WAVE-2). Against Shadow 3.83c, 99.8% of the shots a scan can see become
  waves.
- **Surfs those waves and aims with KNN guns.** Guess-factor danger views, and a main and
  an anti-surfer gun chosen by virtual-gun ratings, as in Hadur 1.20.
- **Makes itself harder to hit.** Its own bullets in flight shadow the enemy's waves: the
  angles where an enemy bullet would be shot down are scored as safe (MOVE-1). When a
  known opponent hits it more than its profile says, the movement changes flavour (MOVE-2).
- **Remembers every opponent.** A profile per opponent (hit rates, gun and movement tiers,
  gun and surf samples) is folded in at each round's end and saved within Robocode's data
  quota, crash-safe (MEM-1..5, RES-3).
- **Recognises and adapts.** From the profile it picks its opening gun, surf prior and
  flattener, and replays stored samples at reduced weight; live evidence overrules the
  profile when they disagree (ADAPT-1..3, RES-4).
- **Presses when ahead.** A distance controller comes in while Hadur clearly out-hits the
  enemy, fires full power at guns that cannot hit it, and closes in to finish or ram a
  beaten enemy (DIST-1, POW-1, POW-2, END-1, END-2).
- **Beats bullet shielding.** An enemy that shoots our bullets down is recognised, and our
  aim is jittered so its shield shots miss (SHIELD-1, SHIELD-2).
- **Stays within its time.** A tick budget sheds work, a level at a time, after a slow tick
  or a skipped turn (TIME-1, TIME-2).

Every policy input carries a margin of error, and each policy keeps its conservative
setting until the evidence is certain enough (DIAL-1).

In melee (two or more opponents, no sentry on the field): a gate that falls back to the
duel on a sentry or a fault (GATE-1..5); a radar that keeps spinning with four or more
alive (MRADAR-1, MRADAR-2); minimum-risk movement with virtual bullets from every recorded
shot, clear of other robots' fights (MMOVE-1..5); a learning field gun that aims at every
opponent at once, with an energy table and exact kill shots (MGUN-1..5); and a melee
profile per opponent. When one opponent is left, its 1v1 profile and its shots in flight
go to the duel (MMEM-1, MMEM-2).

## Results

Cold benches (no stored profile), 35 rounds × 5 seeds, mean ± 95% interval:

| Against | 1.20 (S0) | 2.2 (S6) |
|---|---|---|
| Shadow 3.83c, score share | 40.8% ± 8.3 | 57.4% ± 5.0 |
| Shadow 3.83c, rounds won | 82 / 175 | 125 / 175 |
| Five sample bots, rounds won | 872 / 875 | 875 / 875 |

Sources: [S0](docs/bench/s0-baseline-1.20-cold.md) and [S6](docs/bench/s6-2.1-cold.md)
bench reports. 3.0 duels exactly as 2.2 does (the duel's sources are pinned).

| Melee, cold, 1000x1000 | 2.2 | 3.0 (M6) |
|---|---|---|
| Reference field (9 established melee bots), APS | 37.9 | 52.7 to 54.6 |
| Challenge field (9 sample bots), firsts of 100 | 33 | 72 |

Source: the [M6 report](docs/bench/m6-gates.md). [The strategy evolution](docs/strategy-evolution.md)
has every stage's figures.

## Open work

Follow-ups are tracked as [GitHub issues](https://github.com/lgriffin/Hadur_Robot/issues);
[followup.md](followup.md) keeps the notes behind them, stage by stage.

## The plan

Hadur 2 was rebuilt in stages from the "Hadur 2: a duelist that remembers" plan. Every
stage was gated by the bench, and every requirement in
[docs/requirements.md](docs/requirements.md) is written in EARS form and traced to the
tests that prove it.

| Stage | What | State |
|---|---|---|
| S0 | Headless bench and 1.20 baseline | done ([baseline](docs/bench/s0-baseline-1.20-cold.md)) |
| S1 | Hexagonal extraction: core, adapter, guard, replay | done ([bench](docs/bench/s1-2.0-cold.md)) |
| S2 | Energy ledger, radar reacquire | done ([bench](docs/bench/s2-2.0-cold.md)) |
| S3 | Opponent memory | done ([cold](docs/bench/s3-2.1-cold.md), [warm](docs/bench/s3-2.1-warm.md)) |
| S4 | Recognise and adapt | done ([cold](docs/bench/s4-2.1-cold.md), [warm](docs/bench/s4-2.1-warm.md)) |
| S5 | Aggressive: distance controller, full-power shots, finishing and ramming | done ([cold](docs/bench/s5-2.1-cold.md), [warm](docs/bench/s5-2.1-warm.md)) |
| S6 | Unhittable: bullet shadows, go-to surfing, movement flavours, the tick budget | done ([cold](docs/bench/s6-2.1-cold.md), [warm](docs/bench/s6-2.1-warm.md)) |
| S7 | Rewrite the docs to match the code; release 2.2 | done; melee kept (below) |
| 2.1 | Melee brain in the core (MELEE-1..8), Java 11 target (REL-1) | released ([samples](docs/bench/melee-2.1-samples.md), [classic](docs/bench/melee-2.1-classic.md), [strong](docs/bench/melee-2.1-strong.md)) |
| Shield | Bullet-shielding counter (SHIELD-1, SHIELD-2) | done ([Saguaro](docs/bench/shield-counter-saguaro.md), [notes](docs/bullet-shielding.md)) |
| M0-M6 | Melee Extension Plan: fail-closed gate, sensing, minimum risk, field gun, melee memory, tuning; release 3.0 | done, final APS gate not met ([M6 report](docs/bench/m6-gates.md)) |
| R0-R3 | Rumble climb: bench tooling, client reliability, full share vs weak bots, anti-surfer gun | merged, not yet released |
| R3.5-R6 | Rumble climb: release, stop the lost live rounds, rumble-safe memory, movement precision | planned ([plan](docs/rumble-climb-r4-r6-plan.md)) |

The plan's S7 was "cut melee". Release 2.1 had already put melee in the core for the
MeleeRumble, and it costs the duel nothing (it runs only while two or more opponents are
alive), so S7 keeps it. Open items are in [followup.md](followup.md).

## Layout

```
hadur-core/    the brain: physics, waves, KNN, guns, movement, memory, policies, melee.
               Plain Java, no Robocode.
hadur-robot/   the Robocode adapter (hadur2.Hadur): events in, orders out, profile files.
hadur-bench/   headless battles, the bench report, and the replay recorder.
docs/          requirements, architecture, testing, strategy, bench reports, release notes,
               rumble entry.
repo/          the vendored Robocode 1.9.3.0 API jar.
```

See [docs/architecture.md](docs/architecture.md) for how the pieces fit,
[docs/testing.md](docs/testing.md) for how they are tested, and
[docs/strategy-evolution.md](docs/strategy-evolution.md) for how the strategy evolved
stage by stage.

## Build and test

Java 17 or later, Maven 3.9. The robot itself is compiled for Java 11 so every RoboRumble
client can load it (REL-1).

```sh
mvn verify                  # all modules: tests, traceability, robot jar
```

The robot jar is `hadur-robot/target/hadur2.Hadur_3.0.jar`; drop it into a Robocode
`robots/` directory. The core is bundled inside it. Pushing a `v*` tag runs the release
workflow: it builds, checks that the jar matches the tag, and publishes a GitHub release
with `docs/releases/<tag>.md` as its notes. GitHub Actions was not running jobs when 2.2
and 3.0 shipped, so both were built locally and have no tag or GitHub release yet.

The tests are layered: ArchUnit rules, jqwik properties, unit tests, replay of recorded
battles, Cucumber scenarios per EARS group, and a traceability test that fails the build
if any requirement has no test. [docs/testing.md](docs/testing.md) describes each layer,
how to run them, and how to re-record the replay fixtures.

## Documentation

Every class in the core and the adapter carries Javadoc that explains how it works, why,
and which EARS requirements it implements, with the IDs cited next to the code that
meets them. `mvn verify` runs doclint over all of it, the melee and posture packages
included (a broken link or a wrong `@param` fails the build).

`site/build.sh` builds the docs site into `target/site-pages`: the Javadoc, a requirement
map that lists for every EARS ID the classes that cite it and the tests tagged with it,
and the design docs. `site/build.sh --publish` pushes it to the `gh-pages` branch, which
GitHub Pages serves at https://lgriffin.github.io/Hadur_Robot/ once Pages is set to deploy
from that branch. The `pages` workflow republishes on every push to master while Actions
runs.

## Bench

```sh
mvn package -DskipTests
cd hadur-bench
mvn exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
```

`--mode warm` keeps Hadur's profiles across consecutive battles and reports the learning
curve. For a 10-robot melee, as in the MeleeRumble:

```sh
mvn exec:java -Dexec.args="--set melee-samples.txt --melee true --field 1000x1000 --seeds 3"
```

Details in [hadur-bench/README.md](hadur-bench/README.md). Put third-party opponents such
as `abc.Shadow_3.83c.jar` in `hadur-bench/opponents/` (not committed).

## Telemetry

Hadur prints line records to its console, which the bench collects. Fields are only ever
appended, so older readers keep working.

- `V,1`: format version, once per battle.
- `B,round,tick,battle,name,key,profileFound,tiers,gunSeed,surfSeed,computationLevel`: the
  opponent, on first scan, and what its profile said (MEM-1, ADAPT-1..3).
- `P,round,tick,policy,value,margin,setting`: a policy decision, with the estimate and
  margin behind it (DIAL-1). The policies are `opening-gun`, `surf-prior`, `gun-seed`,
  `surf-seed`, `distance`, `power`, `endgame`, `move-flavour` and `budget`.
- `EW,round,tick,waveId,fireTick,rawDrop,correctedDrop,power,distance`: each enemy wave the
  energy ledger infers. `rawDrop` is what 1.20 would have used.
- `R,round,tick,result,...`: once per round, 33 fields: the energies, both hit rates with
  their margins, and every counter the core keeps (RES-5). The field list is in
  [RoundStats](hadur-core/src/main/java/hadur2/core/RoundStats.java).
- `MEM,round,tick,what,note`: a profile that failed to load, fold or save (MEM-3, MEM-4).
- `FAULT,round,tick,exception`: the first time in a round the guard has to cover for the core.

## History

Hadur 1.x (up to 1.20) was a dual-mode duel and melee robot, evolved release by release by
feel. Hadur 2 started as a pure duelist rebuilt around a measured bench; release 2.1 ported
the 1.x melee work (from the `claude/project-thread-3j7vn4` branch) into the core's `melee`
package for the MeleeRumble. The 1.x feature files are kept in
[docs/legacy-features](docs/legacy-features).
