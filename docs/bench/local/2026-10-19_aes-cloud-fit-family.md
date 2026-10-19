# AES refit: aes-cloud.npz

Groups: family (5), 44238 waves, 41 opponents, CMA-ES 2000 evaluations per half, seed 1.

## Parity

Re-blend at today's weights picks the option the surf took on **100.00%** of waves (gate: 99%; below it the record or the re-blend is wrong and nothing below counts).

## Held-out result

Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); avoidable = the picked option was hit and another would have missed.

| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |
|---|---|---|---|---|---|---|---|---|
| half A | 0.7615 | 0.7063 | 22 | 0.6293 | 0.6215 | 0.6221 | 0.6142 | -0.0079 (-0.0415..+0.0305) |
| half B | 0.6293 | 0.5819 | 19 | 0.7615 | 0.7218 | 0.7566 | 0.7169 | -0.0397 (-0.1266..+0.0222) |

Avoidable damage cut on held-out bots: half A fit 1.3%, half B fit 5.2%.

**Kill 1: FAILS, close AES.** (Stops if either half cuts avoidable damage by under 15% or its interval reaches 0.)

## Fitted parameters

| Parameter | Today | Fit on A | Fit on B | Same direction |
|---|---|---|---|---|
| m_normal | 0.000 | -5.000 | 3.459 | no |
| m_recent | 0.000 | 1.118 | 1.954 | yes |
| m_light | 0.000 | -5.000 | -1.999 | yes |
| m_flattener | 0.000 | -2.476 | 1.010 | no |
| log_alpha | 0.000 | -3.135 | -5.000 | yes |
| beta | 1.000 | 1.506 | 4.000 | yes |
| gamma | 1.000 | 0.000 | 0.000 | yes |
| log_B_minus_1 | 0.405 | -1.745 | 2.000 | no |
| log_nu | 0.000 | 3.000 | -1.725 | no |
| logit_u | 0.000 | -4.000 | 1.076 | no |

Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) (today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).

## Fit on all opponents (for MOVE-22)

Objective today 0.6906, fitted 0.6381 (in sample).

| Parameter | Value |
|---|---|
| m_normal | 5.0000 |
| m_recent | 1.4358 |
| m_light | 3.4967 |
| m_flattener | 2.8452 |
| log_alpha | -5.0000 |
| beta | 0.0000 |
| gamma | 0.0000 |
| log_B_minus_1 | -3.0000 |
| log_nu | -5.0000 |
| logit_u | 3.1143 |
