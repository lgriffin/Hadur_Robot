# Lab 08: waves, guess factors and nearest neighbours

Changed from lab 07:

- `hadurling.core.model.Wave`: a bullet as an expanding circle, with `guessFactor` and its
  inverse `firingAngle`. One class serves our gun and the enemy's shots.
- `hadurling.core.knn.KdTree<T>`: a small k-d tree (`add`, `nearest`) that depends on nothing
  else of Hadurling's. `KdTreeProperties` checks it against a brute-force search with jqwik.
- `hadurling.core.gun.GuessFactorGun`: every shot becomes a wave; when it reaches the enemy
  the guess factor goes in the tree; to aim, the gun asks for the nearest past situations and
  fires at their densest guess factor. Until it has five samples it aims head-on, like
  `HeadOnGun`, which it keeps as its fallback.
- `hadurling.core.move.Surfer`: remembers the guess factors at which enemy bullets hit us and,
  while a wave is coming, picks the safer of clockwise and anticlockwise. `Orbit` gained
  `direction()` and `face(int)`.
- `Core` spots enemy shots by an energy drop between 0.1 and 3.0 (naive on purpose: lab 09
  replaces it), keeps the gun and the surfer, and leaves the orbit's direction alone for 20
  ticks after a wall hit.
- `physics.Angles` gained `projectX` and `projectY`.
- Requirements `HL-9` to `HL-13` in `docs/requirements.md`, tagged in the tests.
- `ArchitectureTest`: `knn` depends on nothing of Hadurling's, and only the gun uses it.
- **Play changed on purpose, so the replay fixture was regenerated.** `ScriptedBattle` now
  scripts enemy energy drops and one hit by our bullet, and `scripted-duel.txt` was made again
  with:

  ```sh
  mvn -B test-compile
  java -cp hadurling-core/target/classes:hadurling-core/target/test-classes \
    hadurling.core.replay.ScriptedBattle hadurling-core/src/test/resources/replay/scripted-duel.txt
  ```

Lab 09 starts here.
