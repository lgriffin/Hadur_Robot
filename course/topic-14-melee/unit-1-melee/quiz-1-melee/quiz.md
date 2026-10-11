# Melee

Check the ideas behind the posture gate and the melee brain.

```quiz
title: Melee
---
question: When does PostureGate.evaluate return MELEE?
type: multiple-choice
options:
  - Whenever one opponent is alive
  - Whenever a sentry is scanned
  - Two or more opponents, no sentry alive and no veto this round
  - Only in the last round
correct: 2
---
question: What does "fail closed" mean for the gate?
type: multiple-choice
options:
  - Any doubt gives the safe duel; melee needs every condition
  - Melee is the default
  - The robot stops when it is unsure
  - Faults are ignored
correct: 0
---
question: If the melee code throws, what does HadurCore do?
type: multiple-choice
options:
  - Rethrows to the engine
  - Retries the melee code
  - Disables the robot
  - Records the fault, vetoes melee for the round and gives that tick to the duel
correct: 3
---
question: What does DuelIdentityTest hash?
type: multiple-choice
options:
  - The compiled class files
  - The source files of the duel's packages
  - The robot's jar
  - The bench report
correct: 1
---
question: How many candidate points does MinimumRiskMovement score each tick?
type: multiple-choice
options:
  - 8
  - 32
  - 1,000
  - 160 (32 angles by 5 rings)
correct: 3
---
question: Which part of the M6 weight sweep mattered most?
type: multiple-choice
options:
  - The centre pull
  - The virtual-bullet term: without it APS fell about 3 points
  - The ring size
  - The wall weight
correct: 1
---
question: Where does the field gun aim?
type: multiple-choice
options:
  - At the angle where the summed weight of all opponents' firing solutions peaks
  - At the nearest opponent's current position
  - At the strongest opponent
  - At the centre of the field
correct: 0
---
question: What did the report say about the plan's melee gate of reference APS 60?
type: multiple-choice
options:
  - Met at 60.1
  - Met at 72
  - Not met: the 3.0 builds scored 52.7 to 54.6
  - Not measured
correct: 2
---
question: Since 3.6 the role resolver's latch replaces the gate's per-tick re-read. What does the latch guarantee?
type: multiple-choice
options:
  - Melee is chosen whenever two opponents are visible
  - Once a lower role has driven in a round, no higher role drives again that round
  - The role is fixed for the whole battle at tick 0
  - A sentry can never be scanned twice
correct: 1
---
question: What fixes a battle's charter (Duel, Melee or Team)?
type: multiple-choice
options:
  - The engine's facts before the first tick
  - How many robots the radar has seen after ten ticks
  - The opponent's saved profile
  - A setting in the robot's properties file
correct: 0
```
