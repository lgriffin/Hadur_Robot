# Robocode 1.11.2 check (2026-11-01)

Robocode 1.11.2 came out on 31 October 2026. Since 1 November the RoboRumble server refuses
1.11.1 clients ("CLIENT NOT SUPPORTED. Use one of: ['1.11.2', '1.12.0']"), so every live
battle is now fought on 1.11.2 or later. This note checks what the release changes for us.

## What 1.11.2 changes

- **Sandbox (GHSA-h2ch-39mm-r68h).** Robot classes are verified when they load, on every Java
  version: no sockets, processes, reflection on other classes, `setAccessible`, deserializing
  foreign classes, reading files outside the robot's own package and data directories,
  `getResourceAsStream` outside the class path, more than 5 threads (now checked every turn),
  virtual threads, or Robocode's own libraries. `RobocodeFileOutputStream` checks the file is
  in the data directory; deletes and `mkdir` only there.
- **Bug fixes.** Robots in a jar nested inside a jar (a team jar) load on Java 9+.
  `Math.random()` in robots now draws from Robocode's generator, so `RANDOMSEED` battles are
  deterministic. A robot that skips too many turns is stopped cleanly again (since 1.10.1 it
  hung for seconds, "Unable to stop thread").

## What it means for us

- **Code.** No shipped bot uses reflection, threads, sockets, processes, serialization,
  resources or Robocode internals. Hadur writes only through `RobocodeFileOutputStream` in its
  data directory and reads and deletes only there; MEM-15's `store.hx` (PR #563) lives there
  too. `HadurRecorder` writes outside the data directory, but it is bench-only, runs with
  security off and is not in the competition jar.
- **Math.random.** Deise, Saor, TwinSaor and Eveimear call it. Live clients pass no
  `RANDOMSEED`, so nothing changes live; seeded bench battles of those bots become repeatable.
- **Team jars.** HadurTeam and TwinSaor ship their classes flat in one jar, so the nested-jar
  fix does not touch them.
- **Codesize.** Unchanged by this release.

## Battles on 1.11.2 (cloud, 4 cores, Java 21, security manager on)

Released jars from the project's releases folder, short smoke runs; no sandbox rejections or
security errors in any log.

| Bot | Mode | Result |
|---|---|---|
| Hadur 3.21 | 1v1 warm, 2 battles x 4 opponents | profiles saved and reloaded, 0 memory failures |
| Hadur 3.21 + PR #563 | 1v1 warm, 3 battles x 4 | `store.hx` written and read back, 0 memory failures |
| Hadur 3.21 | melee, samples | 1st in every battle |
| Deise 0.5, Saor 0.3, Sanaro 0.3 | melee, samples | 1st in every battle |
| JayLexi 0.3, Eveimear 0.2 | 1v1 cold | ran clean |
| HadurTeam 3.21 | team vs MyFirstTeam, ShadowTeam | 0 faults |
| TwinSaor 0.2 | 800x800 vs MyFirstTeam, ShadowTeam | 0 faults |

A/A, Hadur 3.21 melee vs the samples, 4 battles x 10 rounds per pass, sequential, CPU
constant pinned, passes interleaved:

| Engine | Pass 1 | Pass 2 | Mean APS |
|---|---|---|---|
| 1.11.1 | 10.3 skipped turns a battle | 7.5 | 78.0 |
| 1.11.2 | 13.5 | 12.8 | 78.0 |

Score is unchanged; skipped turns rose by about 4 a battle, in runs of 5 to 8 turns rather than
1 to 4. Small sample; worth watching on the PC, where it is measured on the engine live now uses.

## Bench

The bench default moves to 1.11.2 (BENCH-79) and reports flag any engine other than 1.11.2 or
1.12.0, so a 1.11.1 run is now marked as not what the ladder measures. Old cards in
`hadur-bench/plans/` that pin `--engine 1.11.1` or `-Drobocode.version=1.11.1` are left as the
record of what they ran; new cards should drop the pin or name 1.11.2.
