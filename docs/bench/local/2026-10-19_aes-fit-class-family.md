# AES refit: aes.npz

Groups: family (5), 915214 waves, 372 opponents, CMA-ES 3000 evaluations per half, seed 1.

## Parity

Re-blend at today's weights picks the option the surf took on **100.00%** of waves (gate: 99%; below it the record or the re-blend is wrong and nothing below counts).

## Held-out result

Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); avoidable = the picked option was hit and another would have missed.

| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |
|---|---|---|---|---|---|---|---|---|
| half A | 0.7019 | 0.6616 | 185 | 0.7151 | 0.6727 | 0.6979 | 0.6556 | -0.0423 (-0.0509..-0.0334) |
| half B | 0.7151 | 0.6686 | 187 | 0.7019 | 0.6693 | 0.6875 | 0.6550 | -0.0325 (-0.0421..-0.0233) |

Avoidable damage cut on held-out bots: half A fit 6.1%, half B fit 4.7%.

**Kill 1: FAILS, close AES.** (Stops if either half cuts avoidable damage by under 15% or its interval reaches 0.)

## Fitted parameters

| Parameter | Today | Fit on A | Fit on B | Same direction |
|---|---|---|---|---|
| m_normal | 0.000 | 0.224 | 0.762 | yes |
| m_recent | 0.000 | -0.885 | 0.431 | no |
| m_light | 0.000 | -1.682 | -1.876 | yes |
| m_flattener | 0.000 | -2.172 | -0.870 | yes |
| log_alpha | 0.000 | -4.872 | -5.000 | yes |
| beta | 1.000 | 4.000 | 3.521 | yes |
| gamma | 1.000 | 0.000 | 0.000 | yes |
| log_B_minus_1 | 0.405 | -3.000 | 0.038 | yes |
| log_nu | 0.000 | -3.998 | -1.142 | yes |
| logit_u | 0.000 | 2.767 | -1.257 | no |

Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) (today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).

## Fit on all opponents (for MOVE-22)

Objective today 0.7084, fitted 0.6677 (in sample).

| Parameter | Value |
|---|---|
| m_normal | 0.4022 |
| m_recent | -0.5942 |
| m_light | -4.4991 |
| m_flattener | -1.7857 |
| log_alpha | -5.0000 |
| beta | 4.0000 |
| gamma | 0.0000 |
| log_B_minus_1 | -0.5848 |
| log_nu | -1.6212 |
| logit_u | -2.5602 |
