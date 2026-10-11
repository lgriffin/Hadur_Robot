# Events and the tick

Check that you can follow one tick of a Robocode robot.

```quiz
title: Events and the tick
---
question: What does a call to execute() do?
type: multiple-choice
options:
  - Ends your turn, so the engine carries out the queued orders for one tick
  - Fires the gun at full power
  - Starts a new round
  - Calls onScannedRobot for every robot on the field
correct: 0
---
question: A robot calls setAhead(100) and nothing else. When does it start to move?
type: multiple-choice
options:
  - At once, before the next line runs
  - Never, setAhead only asks for a number
  - When execute() runs and the engine processes the queued order
  - Only after onScannedRobot fires
correct: 2
---
question: In Robocode, what direction is heading 0, and which way do angles grow?
type: multiple-choice
options:
  - East, anticlockwise
  - North, clockwise
  - North, anticlockwise
  - East, clockwise
correct: 1
---
question: Why does Hadur keep its brain in static fields?
type: multiple-choice
options:
  - Static fields run faster than instance fields
  - Robocode only allows static fields in a robot
  - The engine creates a new robot object each round, and a static field survives that
  - Static fields are shared with the other robot, so Hadur can see its enemy's state
correct: 2
---
question: An enemy is scanned with bearing 0.5 radians while your heading is 1.0 radians. What is the enemy's absolute direction?
type: multiple-choice
options:
  - 0.5 radians
  - 1.5 radians
  - 0.5 degrees
  - 1.0 radians
correct: 1
---
question: In Hadur, what does onScannedRobot do?
type: multiple-choice
options:
  - It aims the gun and fires
  - It works out the enemy's wave and moves the robot
  - It saves the opponent's profile to disk
  - It turns the scan into a BotEvent.Scan value and queues it
correct: 3
---
question: Which class in Hadur is allowed to import robocode.*?
type: multiple-choice
options:
  - hadur2.core.HadurCore
  - hadur2.Hadur, the adapter
  - hadur2.core.Guard
  - hadur2.core.physics.Angles
correct: 1
```
