# The energy ledger

Check how the ledger decides which energy drops are shots.

```quiz
title: The energy ledger
---
question: An enemy bullet hits us. What happens to the enemy's energy?
type: multiple-choice
options:
  - Nothing
  - It loses the bullet's power
  - It gains 3 times the bullet's power
  - It gains the bullet's damage
correct: 2
---
question: In what order does the ledger correct a raw energy drop?
type: multiple-choice
options:
  - Subtract our damage, add back their refund, subtract collision damage, then subtract wall damage
  - Subtract wall damage first, then everything else
  - Add our damage, subtract their refund, then subtract collision damage
  - Subtract their refund, then add our damage and wall damage
correct: 0
---
question: Which corrected drops become firing waves (WAVE-2)?
type: multiple-choice
options:
  - Any drop above 0
  - Drops in [0, 3.0]
  - Drops in [1.0, 3.0]
  - Drops in [0.1, 3.0]
correct: 3
---
question: Why does isShot widen its bounds by 1e-6?
type: multiple-choice
options:
  - To allow shots of power 3.1
  - A 0.1 shot can read as 0.09999999999999998 in a double
  - To make wall hits look like shots
  - To speed up the comparison
correct: 1
---
question: There is no event for a wall hit. How does the ledger find one?
type: multiple-choice
options:
  - The engine sends a hit-wall event to the enemy only
  - The enemy's energy rises
  - The enemy's heading changes by 90 degrees
  - The enemy stops dead next to a wall when it could not have braked in time
correct: 3
---
question: What does the `uncertain` flag on a Reading mean (WAVE-3)?
type: multiple-choice
options:
  - The scan was missed
  - A wall hit and a shot-sized remainder share one interval, so the split is a guess
  - The enemy fired two bullets
  - The enemy is a sentry
correct: 1
---
question: What may the ledger package depend on, according to ArchitectureTest.ledgerIsLeaf?
type: multiple-choice
options:
  - Only physics and java
  - The gun and the movement
  - Everything in the core
  - Only the model package
correct: 0
---
question: What does the property recoversTheShotUnderAnyMixOfEffects require?
type: multiple-choice
options:
  - The ledger is faster than 1.20
  - No wave is ever created
  - The ledger recovers the exact bullet power under any mix of hits and refunds
  - The enemy's energy never falls
correct: 2
```
