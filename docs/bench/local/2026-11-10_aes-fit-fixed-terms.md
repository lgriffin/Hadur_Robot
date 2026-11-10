# AES refit: c3.npz

Groups: family (5), 588855 waves, 28 opponents, CMA-ES 2000 evaluations per half, seed 1.

## Parity

Re-blend at today's weights picks the option the surf took on **100.00%** of waves (gate: 99%; below it the record or the re-blend is wrong and nothing below counts).

## Held-out result

Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); avoidable = the picked option was hit and another would have missed.

| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |
|---|---|---|---|---|---|---|---|---|
| half A | 0.6352 | 0.6078 | 14 | 0.6455 | 0.6306 | 0.6338 | 0.6189 | -0.0149 (-0.0282..-0.0019) |
| half B | 0.6455 | 0.6289 | 14 | 0.6352 | 0.6099 | 0.6167 | 0.5914 | -0.0253 (-0.0343..-0.0164) |

Avoidable damage cut on held-out bots: half A fit 2.3%, half B fit 4.1%.

**Kill 1: FAILS, close AES.** (Stops if either half cuts avoidable damage by under 15% or its interval reaches 0.)

## Fitted parameters

| Parameter | Today | Fit on A | Fit on B | Same direction |
|---|---|---|---|---|
| m_normal | 0.000 | -5.000 | -1.772 | yes |
| m_recent | 0.000 | -0.633 | 2.761 | no |
| m_light | 0.000 | -1.859 | 2.461 | no |
| m_flattener | 0.000 | 0.146 | 1.941 | yes |
| log_alpha | 0.000 | -5.000 | -5.000 | yes |
| beta | 1.000 | 2.715 | 0.496 | no |
| gamma | 1.000 | 0.000 | 0.000 | yes |
| log_B_minus_1 | 0.405 | -3.000 | -2.227 | yes |
| log_nu | 0.000 | 0.631 | -1.014 | no |
| logit_u | 0.000 | -1.657 | -2.164 | yes |

Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) (today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).

## Fit on all opponents (for MOVE-22)

Objective today 0.6404, fitted 0.6186 (in sample).

| Parameter | Value |
|---|---|
| m_normal | -1.6605 |
| m_recent | -3.2138 |
| m_light | -3.8802 |
| m_flattener | 0.9264 |
| log_alpha | -4.9949 |
| beta | 3.4411 |
| gamma | 0.0000 |
| log_B_minus_1 | -2.0156 |
| log_nu | -5.0000 |
| logit_u | -0.8755 |
