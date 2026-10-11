# Time and resilience

Check the ideas behind the tick budget, duress and the memory index.

```quiz
title: Time and resilience
---
question: Why does the adapter, not the core, call System.nanoTime?
type: multiple-choice
options:
  - nanoTime is not available in the core's Java version
  - The core is too slow to time itself
  - Robocode forbids nanoTime in robots
  - The core may not read a clock (RES-6), so replays see the same times
correct: 3
---
question: Under TIME-1, what happens after a tick that used more than 70% of the allowance?
type: multiple-choice
options:
  - The robot stops for a tick
  - The next tick sheds one computation level
  - The round ends
  - Nothing, it is only logged
correct: 1
---
question: What does a skipped turn do to the computation level (TIME-2)?
type: multiple-choice
options:
  - Drops it for one tick
  - Resets it to 0
  - Doubles k
  - Drops it one level for the rest of the round
correct: 3
---
question: What does level 3 shed, on top of levels 1 and 2?
type: multiple-choice
options:
  - The radar
  - Scoring of the virtual guns
  - The movement entirely
  - The profile save
correct: 1
---
question: After how many skipped turns in a round does duress mode start (RES-9)?
type: multiple-choice
options:
  - Three
  - One
  - Ten
  - Thirty
correct: 0
---
question: In the 300-battle session, where did the added skipped turns sit?
type: multiple-choice
options:
  - On the first scan of each battle
  - Spread evenly through rounds
  - One tick after a round ended, at the profile save
  - Only in round 0
correct: 2
---
question: What did the control robot in the session bench show?
type: multiple-choice
options:
  - Hadur was faster than the control
  - The control was disabled by the engine
  - The growth was in Hadur, not the host or the engine
  - Heap use was growing
correct: 2
---
question: What does MEM-11 change?
type: multiple-choice
options:
  - The data directory is listed once per battle into an index
  - Profiles are written twice
  - Profiles are compressed
  - Profiles are read in parallel
correct: 0
```
