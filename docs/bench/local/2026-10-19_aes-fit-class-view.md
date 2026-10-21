# AES refit: aes.npz

Groups: view (11), 915214 waves, 372 opponents, CMA-ES 3000 evaluations per half, seed 1.

## Parity

Re-blend at today's weights picks the option the surf took on **100.00%** of waves (gate: 99%; below it the record or the re-blend is wrong and nothing below counts).

## Held-out result

Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); avoidable = the picked option was hit and another would have missed.

| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |
|---|---|---|---|---|---|---|---|---|
| half A | 0.7019 | 0.6538 | 185 | 0.7151 | 0.6688 | 0.6979 | 0.6516 | -0.0463 (-0.0548..-0.0375) |
| half B | 0.7151 | 0.6622 | 187 | 0.7019 | 0.6616 | 0.6875 | 0.6472 | -0.0403 (-0.0490..-0.0315) |

Avoidable damage cut on held-out bots: half A fit 6.6%, half B fit 5.9%.

**Kill 1: FAILS, close AES.** (Stops if either half cuts avoidable damage by under 15% or its interval reaches 0.)

## Fitted parameters

| Parameter | Today | Fit on A | Fit on B | Same direction |
|---|---|---|---|---|
| m_normal | 0.000 | 0.394 | 0.348 | yes |
| m_recent1 | 0.000 | 0.501 | 0.915 | yes |
| m_recent2 | 0.000 | -2.876 | -1.394 | yes |
| m_recent3 | 0.000 | -1.215 | -0.448 | yes |
| m_recent4 | 0.000 | -4.589 | -0.671 | yes |
| m_recent5 | 0.000 | -0.074 | -0.401 | yes |
| m_recent6 | 0.000 | 0.763 | 0.804 | yes |
| m_lightFlattener | 0.000 | -1.619 | -3.693 | yes |
| m_flattener | 0.000 | -1.083 | -0.841 | yes |
| m_flattener2 | 0.000 | -2.019 | -1.551 | yes |
| log_alpha | 0.000 | -5.000 | -3.102 | yes |
| beta | 1.000 | 4.000 | 1.895 | yes |
| gamma | 1.000 | 0.000 | 0.000 | yes |
| log_B_minus_1 | 0.405 | -1.393 | -0.468 | yes |
| log_nu | 0.000 | 0.674 | -1.483 | no |
| logit_u | 0.000 | -1.959 | -1.093 | yes |

Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) (today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).

## Fit on all opponents (for MOVE-22)

Objective today 0.7084, fitted 0.6607 (in sample).

| Parameter | Value |
|---|---|
| m_normal | 0.5064 |
| m_recent1 | 0.8010 |
| m_recent2 | -2.0117 |
| m_recent3 | -0.4223 |
| m_recent4 | -1.0225 |
| m_recent5 | 0.3580 |
| m_recent6 | 0.9772 |
| m_lightFlattener | -1.2509 |
| m_flattener | -0.6252 |
| m_flattener2 | -2.3651 |
| log_alpha | -2.6998 |
| beta | 4.0000 |
| gamma | 0.4470 |
| log_B_minus_1 | -1.0595 |
| log_nu | 1.8220 |
| logit_u | 0.9739 |
