# Waves and guns

Check the ideas behind waves, guess factors, the KD-tree and the surf.

```quiz
title: Waves and guns
---
question: How fast does a bullet of power 3 travel?
type: multiple-choice
options:
  - 8 px/tick
  - 11 px/tick
  - 14 px/tick
  - 17 px/tick
correct: 1
---
question: What is the maximum escape angle of a wave whose bullet speed is v, for a robot with top speed 8?
type: multiple-choice
options:
  - atan(v / 8)
  - acos(8 / v)
  - 8 / v degrees
  - asin(8 / v)
correct: 3
---
question: A guess factor of +1 means the target ended up
type: multiple-choice
options:
  - on the head-on line
  - at the full escape angle, in the direction it was already orbiting
  - at the full escape angle, against the direction it was orbiting
  - at the nearest wall
correct: 1
---
question: Why does a KD-tree search often skip a whole subtree?
type: multiple-choice
options:
  - The subtree's bounding box is farther away than the k-th best distance found so far
  - The subtree is empty most of the time
  - The subtree was evicted by the FIFO limit
  - The search order is random
correct: 0
---
question: Which structure keeps the k best candidates so that the worst one is always at hand?
type: multiple-choice
options:
  - A min-heap on distance
  - A sorted linked list rebuilt on every query
  - A max-heap on distance
  - A HashMap from distance to value
correct: 2
---
question: Hadur's main gun stores a displacement vector rather than a guess factor. What does that let it do that a guess factor cannot?
type: multiple-choice
options:
  - Fire faster
  - Avoid using nearest neighbours
  - Drop a projected point that lies outside the field
  - Ignore the enemy's speed
correct: 2
---
question: How does the surf count a "possible" bullet shadow compared with a "certain" one?
type: multiple-choice
options:
  - As half a shadow
  - The same
  - It ignores it
  - As a double shadow
correct: 0
---
question: How did Hadur check that its shadow geometry matched the engine?
type: multiple-choice
options:
  - By reading the engine source once
  - By watching a few battles
  - By copying the engine's code
  - A jqwik property against a brute-force bullet flight, and the bench's check on destroyed bullets
correct: 3
```
