# The hexagon

Check the ideas behind ports, adapters and the guard.

```quiz
title: The hexagon
---
question: Which module may import robocode.*?
type: multiple-choice
options:
  - hadur-core
  - hadur-robot, the adapter
  - Both modules
  - Neither, they use reflection
correct: 1
---
question: What is a port in Hadur's design?
type: multiple-choice
options:
  - A TCP socket the robot listens on
  - An interface the core owns and the outside world implements
  - A Maven module
  - A class that extends AdvancedRobot
correct: 1
---
question: Telemetry has a single method. What does that let a test do?
type: multiple-choice
options:
  - Pass a lambda such as telemetry::add as the implementation
  - Skip compiling the core
  - Run the engine faster
  - Avoid writing any assertions
correct: 0
---
question: Why does Guard catch Throwable rather than Exception?
type: multiple-choice
options:
  - Throwable is faster to catch
  - Exception cannot be caught in Java 11
  - Errors such as StackOverflowError must not stop the robot either
  - The engine only throws Throwable
correct: 2
---
question: What does the guard return when the core throws?
type: multiple-choice
options:
  - null
  - The orders from the previous tick
  - It rethrows to the engine
  - Safe orders: orbit, keep the radar on the enemy and hold fire
correct: 3
---
question: Guard's constructor takes a Function<BotInput, BotOrders> and not a HadurCore. What does that allow?
type: multiple-choice
options:
  - A test can pass a lambda that throws, without building a real core
  - The guard can modify the core's private fields
  - The core can be replaced while the battle runs
  - The guard no longer needs Telemetry
correct: 0
---
question: Which of these did the hexagon NOT make possible?
type: multiple-choice
options:
  - Replaying a recorded battle with no engine
  - Killing a profile write halfway in a test
  - Making Robocode itself run faster
  - Generating random BotInputs for property tests
correct: 2
---
question: Which direction does the dependency arrow point?
type: multiple-choice
options:
  - hadur-core depends on hadur-robot
  - hadur-robot depends on hadur-core
  - Both depend on each other
  - Both depend on robocode.api only
correct: 1
```
