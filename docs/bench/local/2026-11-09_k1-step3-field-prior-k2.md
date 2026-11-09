# The field prior on the oracle's bullets

Data: `k2.npz`, 46719 bullets, 48 opponents; each opponent scored against the table fitted on the others. Columns as `score`'s.

| Model | bits | calibrated | safe | rank |
|---|---|---|---|---|
| blend (rolling, views + aims, K1) | +0.374 | +0.386 (0.10) | 0.077 | 0.701 |
| field prior alone (each opponent left out) | +0.359 | +0.359 (0.00) | 0.070 | 0.697 |
| blend (rolling, views + aims + field prior, K1 step 3) | +0.440 | +0.440 (0.00) | 0.068 | 0.712 |

## By round

| Rounds | bullets | rolling bits | rolling safe | with prior bits | with prior safe |
|---|---|---|---|---|---|
| 0-0 | 1291 | +0.028 | 0.082 | +0.362 | 0.076 |
| 1-2 | 2396 | +0.068 | 0.092 | +0.376 | 0.061 |
| 3-6 | 5233 | +0.295 | 0.086 | +0.410 | 0.076 |
| 7-14 | 10613 | +0.405 | 0.084 | +0.444 | 0.073 |
| 15-34 | 27186 | +0.435 | 0.073 | +0.458 | 0.067 |

Opponents the prior improves (bits): 32 of 36.

Table written to `hadur-core/src/main/java/hadur117/core/move/FieldPriorData.java` from every opponent's bullets.
