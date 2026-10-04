# Values and the tick

Check the ideas behind BotInput, BotEvent and BotOrders.

```quiz
title: Values and the tick
---
question: What does making all fields final and having no setters give a value class?
type: multiple-choice
options:
  - It becomes faster to construct
  - Once built it cannot change, so it is safe to record and share
  - It can be extended by subclasses
  - It no longer needs a constructor
correct: 1
---
question: BotInput copies its event list with List.copyOf. Why?
type: multiple-choice
options:
  - The caller may reuse and clear its list, and the input must not change when it does
  - Lists cannot be stored in fields otherwise
  - List.copyOf sorts the events
  - It converts the list to an array
correct: 0
---
question: In BotOrders, what does a NaN bodyTurn mean?
type: multiple-choice
options:
  - Turn the body as far as possible
  - The core has failed
  - Do not turn at all
  - Leave the previous turn setting as it was
correct: 3
---
question: Why does BotOrders.equals use Double.compare instead of ==?
type: multiple-choice
options:
  - == does not compile for doubles
  - Double.compare treats NaN as equal to NaN, so two "no order" fields match
  - Double.compare is the only way to compare negative numbers
  - It makes hashCode unnecessary
correct: 1
---
question: Why are the BotEvent classes final classes rather than Java records?
type: multiple-choice
options:
  - Records cannot hold doubles
  - Records are slower
  - The robot targets Java 11, and records need a newer Java
  - Records cannot implement interfaces
correct: 2
---
question: The BotEvent hierarchy is closed by convention. What does LineCodec do with an event type it does not know?
type: multiple-choice
options:
  - Ignores it
  - Throws an IllegalArgumentException
  - Writes it as a Scan
  - Returns null
correct: 1
---
question: What does a firePower of 0 in BotOrders mean?
type: multiple-choice
options:
  - Fire at the minimum power
  - Fire at full power
  - Hold fire
  - Leave the previous power
correct: 2
```
