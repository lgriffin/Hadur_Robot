# Physics

Check the ideas behind Hadur's Angles and Rules classes.

```quiz
title: Physics as pure functions
---
question: What range does normalRelativeAngle return?
type: multiple-choice
options:
  - 0 up to 2 pi
  - -pi up to pi
  - -2 pi up to 2 pi
  - 0 up to pi
correct: 1
---
question: In Java, what is -1.0 % 3.0?
type: multiple-choice
options:
  - 2.0
  - 1.0
  - -1.0
  - NaN
correct: 2
---
question: What is the speed of a bullet fired at power 3.0?
type: multiple-choice
options:
  - 8 px/tick
  - 11 px/tick
  - 17 px/tick
  - 20 px/tick
correct: 1
---
question: What formula gives the maximum escape angle for a bullet of speed v?
type: multiple-choice
options:
  - asin(8 / v)
  - sin(v / 8)
  - 8 / v
  - atan(v * 8)
correct: 0
---
question: How much energy does a power-3.0 bullet take from the robot it hits?
type: multiple-choice
options:
  - 3
  - 9
  - 12
  - 16
correct: 3
---
question: Why do tests often compare doubles with a tolerance, as in assertEquals(782, x, 1e-9)?
type: multiple-choice
options:
  - Doubles cannot hold whole numbers
  - Floating point arithmetic rounds, so a computed result may differ in the last bits
  - JUnit refuses to compare doubles without one
  - It makes the test run faster
correct: 1
---
question: Hadur's PhysicsMatchesEngineProperties compares its own Angles with the engine's using no tolerance. Why?
type: multiple-choice
options:
  - The copy is meant to be identical to the engine's, bit for bit, so replays and tests stay exact
  - jqwik cannot take a tolerance
  - The engine's answers are always whole numbers
  - Angles are stored as integers
correct: 0
---
question: What does a jqwik @Property do that a plain @Test does not?
type: multiple-choice
options:
  - It runs only once, but faster
  - It checks the code compiles for Java 11
  - It runs the check on many generated inputs and shrinks a failing one to a small case
  - It records the battle for replay
correct: 2
```
