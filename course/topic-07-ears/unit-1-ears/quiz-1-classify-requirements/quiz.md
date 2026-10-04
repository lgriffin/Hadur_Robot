# Classify the requirement

Each question quotes a real row from Hadur's docs/requirements.md. Pick its EARS pattern from the keyword that opens the sentence.

```quiz
title: Classify requirements by EARS pattern
---
question: Which EARS pattern is requirement CORE-2? It reads, The core shall produce identical BotOrders for identical BotInput sequences and identical profile state.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 0
---
question: Which EARS pattern is requirement MEM-2? It reads, When a round ends, the core shall fold that round's gun, movement and outcome statistics into the opponent profile.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 1
---
question: Which EARS pattern is requirement END-2? It reads, While enemy energy is 0, movement shall drive directly at the enemy.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 2
---
question: Which EARS pattern is requirement MEM-4? It reads, If a profile fails to load or fails its checksum, then the core shall proceed with an empty profile and record the failure.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 3
---
question: Which EARS pattern is requirement POW-1? It reads, Where the profile's gun tier is T0 and enemy energy exceeds 12, the gun shall fire power 3.0.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 4
---
question: Which EARS pattern is requirement TIME-2? It reads, When a skipped-turn event is received, the core shall drop one computation level for the remainder of the round and record it.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 1
---
question: Which EARS pattern is requirement GATE-4? It reads, If the melee subsystems throw, then the core shall record the fault and use the duel subsystems for the rest of the round.
type: multiple-choice
options:
  - Ubiquitous
  - Event-driven
  - State-driven
  - Unwanted behaviour
  - Optional feature
correct: 3
---
question: What does Hadur's traceability test do when a test is tagged with an ID that is not in the requirements table?
type: multiple-choice
options:
  - Ignores it
  - Fails the build, so IDs cannot drift
  - Adds the ID to the table
  - Deletes the test
correct: 1
```
