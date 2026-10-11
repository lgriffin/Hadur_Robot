# Deciding under uncertainty

Check the ideas behind margins, tiers and the power policy.

```quiz
title: Deciding under uncertainty
---
question: Why does Estimate use the Agresti-Coull margin and not the plain Wald margin?
type: multiple-choice
options:
  - It is cheaper to compute
  - It gives narrower intervals
  - It needs no square root
  - It stays wide for rates near 0 or 1 over few samples
correct: 3
---
question: A profile tier is named only when its estimate's margin is at most
type: multiple-choice
options:
  - 1 point
  - 3 points
  - 5 points
  - 10 points
correct: 1
---
question: Why does Estimate.of test `!(n > 0)` rather than `n <= 0`?
type: multiple-choice
options:
  - It is faster
  - It allows negative counts
  - It avoids a division
  - The first form also rejects NaN
correct: 3
---
question: POW-2 fires full power when
type: multiple-choice
options:
  - our rate is above 20% and theirs below 10%, however few shots
  - our rate's lower bound is above 20% and their rate's upper bound is below 10%
  - either rate is known
  - the enemy has under 12 energy
correct: 1
---
question: How does SeedTrust fade a seed that disagrees with the live data?
type: multiple-choice
options:
  - A twentieth of its starting weight per diverging wave, to zero by the twentieth
  - It deletes the seed at the first disagreement
  - It halves the weight each round
  - It never changes the weight
correct: 0
---
question: What was wrong with the first cut of POW-4's margin (0.05)?
type: multiple-choice
options:
  - It fired too often
  - It used the wrong interval
  - A real 100-outcome window cannot reach it where full power wins, so the rule could never fire
  - It ignored our energy
correct: 2
---
question: What does DIAL-2 forbid?
type: multiple-choice
options:
  - Using hit rates
  - Using more than one tier
  - Decisions that depend on elapsed time alone
  - Saving profiles
correct: 2
---
question: What does an UNKNOWN tier select?
type: multiple-choice
options:
  - 1.20's conservative defaults
  - The most aggressive setting
  - No gun at all
  - The previous battle's setting
correct: 0
```
