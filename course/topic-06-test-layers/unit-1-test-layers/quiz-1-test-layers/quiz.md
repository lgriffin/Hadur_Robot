# Test layers

Check what each layer of Hadur's tests is for.

```quiz
title: Testing in layers
---
question: Which layer finds a change in play that was not meant to change play?
type: multiple-choice
options:
  - Architecture
  - Release
  - Replay
  - Adapter
correct: 2
---
question: Which layer fails when a core class depends on a package it should not?
type: multiple-choice
options:
  - Architecture, with ArchUnit
  - Behaviour, with Cucumber
  - Bench
  - Replay
correct: 0
---
question: A property test differs from an example test because it...
type: multiple-choice
options:
  - never fails
  - runs in the real Robocode engine
  - states a rule and checks it against many generated inputs
  - checks only one input but more carefully
correct: 2
---
question: What is a round-trip property?
type: multiple-choice
options:
  - Encoding then decoding a value gives back an equal value
  - Running a battle for the full number of rounds
  - Calling a method twice and timing it
  - Sending a value to the engine and back
correct: 0
---
question: Why does the anyDouble generator list NaN, infinities and negative zero explicitly?
type: multiple-choice
options:
  - Random doubles would almost never produce those awkward values
  - jqwik cannot generate other doubles
  - They are the only values the engine uses
  - They make the test run faster
correct: 0
---
question: What does BulletShadowsProperties use as its oracle?
type: multiple-choice
options:
  - The Robocode engine
  - A saved recording
  - A brute-force check that flies the bullets turn by turn
  - A hand-written list of answers
correct: 2
---
question: In ReplayTest, what must be true for every tick of a recorded battle?
type: multiple-choice
options:
  - The replayed orders equal the orders the live robot issued
  - The core runs in under 3 ms
  - The robot wins the round
  - The telemetry is empty
correct: 0
---
question: In the line codec, what keeps old recordings readable after a format grows?
type: multiple-choice
options:
  - Old recordings are deleted
  - New fields are only ever appended as optional ones, and a missing field has a default
  - The decoder guesses
  - Each recording carries a copy of the decoder
correct: 1
```
