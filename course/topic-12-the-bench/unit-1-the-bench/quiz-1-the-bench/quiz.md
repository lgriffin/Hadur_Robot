# The bench

Check the ideas behind the bench and its statistics.

```quiz
title: The bench
---
question: Why did S0 make score share the headline metric instead of rounds won?
type: multiple-choice
options:
  - Rounds won cannot be counted
  - Score share is easier to compute
  - Shadow never loses a round
  - Hadur won about half its rounds against Shadow but took only 40.8% of the score
correct: 3
---
question: With 5 seeds, why does Stats.of use t = 2.776 and not 1.96?
type: multiple-choice
options:
  - Because 5 is odd
  - With few samples Student's t is wider than the normal value
  - Because the seeds are paired
  - Because the shares are percentages
correct: 1
---
question: S0 scored 40.8% ± 8.3 and S1 scored 46.2% ± 6.4 against Shadow. What follows?
type: multiple-choice
options:
  - The intervals overlap, so the change is within the noise
  - S1 is certainly better
  - S0 is certainly better
  - The bench is broken
correct: 0
---
question: What does a paired diff cancel?
type: multiple-choice
options:
  - Differences between the jars
  - The engine version
  - Noise common to both jars on the same seed
  - The number of rounds
correct: 2
---
question: Why does the bench run one child JVM per battle with -DRANDOMSEED?
type: multiple-choice
options:
  - To use all four cores
  - Because Robocode allows one battle per process
  - Each battle is repeatable and isolated, and a stuck one can be killed
  - To avoid writing logs
correct: 2
---
question: What did L-02 find for the 20 top-50 opponents that were benched and fought live?
type: multiple-choice
options:
  - Live APS tracked bench share with a correlation of 0.84
  - The bench was always 10 points too high
  - There was no relationship
  - Live APS was always lower
correct: 0
---
question: What did the session bench do that earlier benches did not?
type: multiple-choice
options:
  - It used a faster CPU constant
  - It wiped the data directory every battle
  - It fought only one opponent
  - It ran 300 battles in one engine process, as a rumble client does
correct: 3
---
question: S6's gate had a half it did not meet (zero skipped turns). What did the report do?
type: multiple-choice
options:
  - Left the figure out
  - Said so, gave the numbers, and named the next thing to try
  - Rounded it down
  - Re-ran until it passed
correct: 1
```
