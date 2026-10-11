# Lab 10: memory, profiles that survive

Changed from lab 09:

- `hadurling.core.memory.Profile`: what Hadurling knows about one opponent (rounds, their
  hit rate on us, our virtual hit rate on them, and up to 100 samples that seed the gun).
- `hadurling.core.memory.ProfileCodec`: a hand-written binary format. Magic `HP`, a version
  byte, the payload length, the payload and a `CRC32` of everything before it. Version 2
  added `ourShots`, `ourHits` and the seed; version 1 files still load, with those at their
  defaults. `decode` throws the checked `ProfileFormatException` for any bad input and
  nothing else.
- `hadurling.core.memory.LineageKey`: one key and one safe file name for every version of a
  robot.
- `hadurling.core.memory.ProfileLibrary`: load and save. A save writes `<file>.tmp`, then the
  profile, then deletes the copy, so a robot killed at any byte leaves the old or the new
  profile. It never throws; failures are counted. Before a save it makes room by forgetting
  the least recently written profiles. (It lists the store on every save; Lab 13 shows why
  that matters.)
- `hadurling.core.port.ProfileStore` and `MemoryProfileStore` (a quota like Robocode's, and
  `crashOnWrite(nth, keepBytes)` to cut a write short).
- `hadurling.FileProfileStore` in the robot module: the store on Robocode's data directory,
  written through `RobocodeFileOutputStream`. `Hadurling` keeps a static library, passes it
  to each round's `Core` and saves in `onRoundEnded`.
- `Core(ProfileLibrary)`: loads the opponent's profile at the first scan and seeds the gun
  (`GuessFactorGun.seed` and `learned`); `roundEnded()` saves. `new Core()` still works and
  remembers nothing.
- Requirements `HL-17` to `HL-24`. Properties: `ProfileCodecProperties` (round trip, every
  cut-short file, every flipped bit, any bytes at all, loading version 1) and
  `ProfileLibraryProperties` (a save killed at any byte of either write).
- `ArchitectureTest`: the "no I/O" rule was too blunt for a codec that writes bytes into a
  byte array, so it now bans files, channels and networking, not all of `java.io`. New rules:
  `memory` depends only on itself and `port`; `port` depends on nothing of Hadurling's; only
  the core uses either.
- Play does not change without a library, so the replay fixture is unchanged.

Lab 11 starts here.
