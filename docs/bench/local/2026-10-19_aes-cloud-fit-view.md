# AES refit: aes-cloud.npz

Groups: view (11), 44238 waves, 41 opponents, CMA-ES 2000 evaluations per half, seed 1.

## Parity

Re-blend at today's weights picks the option the surf took on **100.00%** of waves (gate: 99%; below it the record or the re-blend is wrong and nothing below counts).

## Held-out result

Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); avoidable = the picked option was hit and another would have missed.

| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |
|---|---|---|---|---|---|---|---|---|
| half A | 0.7615 | 0.6734 | 22 | 0.6293 | 0.6065 | 0.6221 | 0.5993 | -0.0228 (-0.0445..-0.0003) |
| half B | 0.6293 | 0.5790 | 19 | 0.7615 | 0.7454 | 0.7566 | 0.7405 | -0.0160 (-0.0631..+0.0211) |

Avoidable damage cut on held-out bots: half A fit 3.7%, half B fit 2.1%.

**Kill 1: FAILS, close AES.** (Stops if either half cuts avoidable damage by under 15% or its interval reaches 0.)

## Fitted parameters

| Parameter | Today | Fit on A | Fit on B | Same direction |
|---|---|---|---|---|
| m_normal | 0.000 | 0.399 | 1.417 | yes |
| m_recent1 | 0.000 | 1.132 | -0.802 | no |
| m_recent2 | 0.000 | 1.403 | 0.310 | yes |
| m_recent3 | 0.000 | -1.070 | 0.547 | no |
| m_recent4 | 0.000 | -1.184 | 1.707 | no |
| m_recent5 | 0.000 | -0.598 | 0.558 | no |
| m_recent6 | 0.000 | 1.110 | -0.438 | no |
| m_lightFlattener | 0.000 | -0.930 | -1.903 | yes |
| m_flattener | 0.000 | -0.281 | -2.643 | yes |
| m_flattener2 | 0.000 | -1.320 | 0.554 | no |
| log_alpha | 0.000 | -2.247 | -1.415 | yes |
| beta | 1.000 | 2.966 | 1.147 | yes |
| gamma | 1.000 | 0.000 | 0.667 | yes |
| log_B_minus_1 | 0.405 | -3.000 | -0.246 | yes |
| log_nu | 0.000 | -2.498 | -1.884 | yes |
| logit_u | 0.000 | 1.339 | -0.179 | no |

Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) (today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).

## Fit on all opponents (for MOVE-22)

Objective today 0.6906, fitted 0.6343 (in sample).

| Parameter | Value |
|---|---|
| m_normal | 1.5682 |
| m_recent1 | 1.3050 |
| m_recent2 | -1.2053 |
| m_recent3 | 0.3244 |
| m_recent4 | 0.0935 |
| m_recent5 | -0.0408 |
| m_recent6 | -1.1282 |
| m_lightFlattener | -0.5751 |
| m_flattener | -0.5902 |
| m_flattener2 | -0.5431 |
| log_alpha | -3.0338 |
| beta | 2.4906 |
| gamma | 0.0000 |
| log_B_minus_1 | -0.6403 |
| log_nu | 0.0421 |
| logit_u | 0.3643 |
