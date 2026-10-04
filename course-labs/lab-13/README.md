# Lab 13: time and resilience

Changed from lab 12:

- `hadurling.core.policy.TickBudget`: a computation level from 0 to 3. A tick that used more
  than 70% of the allowance (a guessed 3 ms) sheds one level for the next tick only; a skipped
  turn sheds one for the rest of the round. Level 1: the gun asks the tree for half as many
  neighbours. Level 2: the surfer stops predicting. Level 3: the gun aims head-on.
- Two new events, `Event.TickTime(nanos)` and `Event.SkippedTurn`, because the core may not read
  a clock. `Hadurling` times each call into the guard with `System.nanoTime()` and reports it
  with the next tick's events, and turns `onSkippedTurn` into an event. `LineCodec` writes them
  as `T:nanos` and `K`, so a replay of a slow battle sheds the same work.
- `Core` follows the budget; `GuessFactorGun.aim` gained a neighbour limit.
- **The slide in miniature.** Labs 10 to 12 made room for a save by listing the store and asking
  every file's size on every save. `ProfileLibrary` now lists the store once per battle into an
  index of sizes and ages, and keeps the index current as it saves and evicts. If a store call
  fails it drops the index and lists again.
  - `ProfileLibraryScaleTest` counts listings (`MemoryProfileStore.listings()`) as the store grows
    to hundreds of profiles. `FileProfileStoreScaleTest` does the same on real files.
  - `ProfileLibraryProperties` has a model-based property: the indexed library forgets exactly
    what the lab 10 algorithm (copied into the test) forgot, for any run of saves and any quota.
  - `hadurling-robot/src/test/java/hadurling/SlideDemo.java` is not a test. Run by hand, it saves
    1500 profiles with both methods and prints the time per hundred saves. In the authoring
    sandbox the list-every-time column grew from 70 ms to 575 ms per hundred saves while the
    indexed column stayed between 10 and 30 ms.
- Requirements `HL-36` to `HL-41`; `HL-39` is tagged on the "no clock" ArchUnit rule.
- The replay fixture is unchanged: the scripted duel carries no timing events, so the budget
  stays at level 0.

To run the demo:

```sh
mvn -B -q test-compile dependency:build-classpath -pl hadurling-robot -am -Dmdep.outputFile=target/cp.txt
cd hadurling-robot
java -cp target/classes:target/test-classes:$(cat target/cp.txt) hadurling.SlideDemo 1500
```

This is the last lab; the capstone starts from here.
