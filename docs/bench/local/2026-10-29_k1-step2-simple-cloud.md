# Gun oracle: every model scored on the same bullets

Data: `k1s.npz`, 27551 enemy bullets matched to the wave the surf rated, 50 opponents. Means per opponent, each opponent weighted equally. **bits**: log2 of the model's density at the bullet's guess factor over the uniform's, after a 5% uniform mix (higher is better). **safe**: the share of bullets from the third of the wave the model rated least dangerous, the third the surf drives into (lower is better; 0.333 knows nothing). **calibrated**: bits after the further uniform mix (in brackets) that scores best, which takes out overconfidence, so models compare on what they know. **rank**: the share of the wave the model rated safer than where the bullet went (0.5 knows nothing, higher is better); safe and rank read only the model's ranking, which is what the surf acts on. **coverage**: the share of bullets on which the model had a surface (a view off or empty has none).

| Model | bits | calibrated | safe | rank | coverage |
|---|---|---|---|---|---|
| uniform | +0.000 | +0.000 (0.00) | 0.333 | 0.500 | 100% |
| view:simple | +1.456 | +1.457 (0.05) | 0.026 | 0.867 | 93% |
| view:normal | +0.995 | +1.018 (0.10) | 0.024 | 0.824 | 20% |
| view:recent1 | -0.201 | +0.374 (0.50) | 0.120 | 0.704 | 26% |
| view:recent2 | +0.643 | +0.792 (0.20) | 0.040 | 0.797 | 26% |
| view:recent3 | +0.747 | +0.878 (0.20) | 0.044 | 0.804 | 26% |
| view:recent4 | +0.937 | +0.971 (0.10) | 0.037 | 0.813 | 26% |
| view:recent5 | +0.978 | +0.998 (0.10) | 0.037 | 0.812 | 26% |
| view:recent6 | +0.993 | +1.001 (0.05) | 0.034 | 0.809 | 26% |
| view:lightFlattener | -0.331 | -0.029 (0.70) | 0.303 | 0.503 | 6% |
| view:flattener | - | - | - | - | 0% |
| view:flattener2 | - | - | - | - | 0% |
| blend (shipped) | +1.474 | +1.474 (0.00) | 0.025 | 0.867 | 93% |
| aim:headon | +0.266 | +0.729 (0.30) | 0.229 | 0.701 | 100% |
| aim:linear | -0.649 | +0.293 (0.50) | 0.026 | 0.720 | 100% |
| aim:circular | -0.553 | +0.314 (0.50) | 0.036 | 0.719 | 100% |
| blend (rolling, K1) | +1.489 | +1.489 (0.00) | 0.026 | 0.869 | 93% |
| hindsight: best fixed mix per opponent | +1.543 | +1.543 (0.00) | 0.024 | 0.874 | 93% |
| blend (rolling, views + aims, K1) | +1.621 | +1.621 (0.00) | 0.024 | 0.895 | 100% |
| visits (k-NN, K1) | -1.547 | -0.249 (0.70) | 0.551 | 0.340 | 99% |
| blend + 25% visits | +1.222 | +1.222 (0.00) | 0.046 | 0.851 | 93% |

Bullets outside the classic escape angle (|gf| > 1, scored where they were fired, normalised over [-1, 1]): 2.9%.

## Gate: the oracle is the surf, offline

| Check | On | Result |
|---|---|---|
| Views' score rebuilt from the neighbours over each option's plan interval equals the AES record's (within 0.1%), options no shadow touched | 52942 options | 99.97% |
| With the rebuilt scores, the surf's rule picks the option it took (waves with every option rebuilt) | 8638 of 27551 waves | 99.99% |

## By census class

| Class | Bots | blend bits | blend safe | rolling bits | rolling safe | best simple aim bits |
|---|---|---|---|---|---|---|
| head-on+learning-circular-prone | 1 | +1.738 | 0.000 | +1.738 | 0.000 | +1.760 |
| head-on+learning-flat | 2 | +0.770 | 0.003 | +0.768 | 0.003 | +2.062 |
| head-on+learning-stat-prone | 3 | +0.724 | 0.137 | +0.766 | 0.136 | +0.661 |
| head-on-flat | 5 | +2.394 | 0.003 | +2.433 | 0.003 | +2.592 |
| head-on-head-on-prone | 3 | +1.656 | 0.073 | +1.656 | 0.073 | +2.162 |
| head-on-stat-prone | 10 | +2.008 | 0.004 | +2.014 | 0.004 | +2.373 |
| head-on-wall-runner | 1 | +nan | nan | +nan | nan | +3.172 |
| linear+learning-circular-prone | 1 | +0.697 | 0.007 | +0.697 | 0.007 | +1.902 |
| linear+learning-flat | 1 | +1.451 | 0.001 | +1.458 | 0.001 | +1.877 |
| linear+learning-linear-prone | 1 | +1.457 | 0.006 | +1.436 | 0.006 | +1.934 |
| linear+learning-stat-prone | 3 | +1.023 | 0.022 | +1.013 | 0.022 | +1.671 |
| linear-flat | 4 | +1.275 | 0.017 | +1.277 | 0.015 | +2.132 |
| linear-stat-prone | 4 | +1.449 | 0.000 | +1.446 | 0.000 | +2.258 |
| mixed-flat | 5 | +0.923 | 0.043 | +0.985 | 0.046 | +1.051 |
| mixed-stat-prone | 6 | +0.776 | 0.044 | +0.784 | 0.048 | +0.930 |
