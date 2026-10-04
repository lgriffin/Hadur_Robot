# Lab 06: testing in layers

Changed from lab 05:

- `hadurling.core.replay.LineCodec` writes an `Input` or `Orders` as one text line and reads it
  back, rejecting anything malformed. `Replay` feeds a transcript through a fresh core.
- `LineCodecProperties`: jqwik round-trip properties with custom arbitraries (NaN, infinities,
  negative zero, names full of separators).
- `src/test/resources/replay/scripted-duel.txt` is a committed two-round transcript;
  `ReplayTest` replays it and requires the recorded orders. `ScriptedBattle` regenerates it.
- In the robot module, `Hadurling` gained two empty hooks (`roundStarted`, `ticked`) and
  `HadurlingRecorder` uses them to write a transcript from a real battle.
- `mvn verify` still checks the lab 05 architecture rules, which now cover `replay` too.

Lab 07 starts here.
