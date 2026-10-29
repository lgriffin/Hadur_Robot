# Gun oracle: every model scored on the same bullets

Data: `k2.npz`, 46719 enemy bullets matched to the wave the surf rated, 48 opponents. Means per opponent, each opponent weighted equally. **bits**: log2 of the model's density at the bullet's guess factor over the uniform's, after a 5% uniform mix (higher is better). **safe**: the share of bullets from the third of the wave the model rated least dangerous, the third the surf drives into (lower is better; 0.333 knows nothing). **calibrated**: bits after the further uniform mix (in brackets) that scores best, which takes out overconfidence, so models compare on what they know. **rank**: the share of the wave the model rated safer than where the bullet went (0.5 knows nothing, higher is better); safe and rank read only the model's ranking, which is what the surf acts on. **coverage**: the share of bullets on which the model had a surface (a view off or empty has none).

| Model | bits | calibrated | safe | rank | coverage |
|---|---|---|---|---|---|
| uniform | +0.000 | +0.000 (0.00) | 0.333 | 0.500 | 100% |
| view:simple | +0.053 | +0.241 (0.30) | 0.091 | 0.683 | 99% |
| view:normal | +0.098 | +0.253 (0.30) | 0.087 | 0.688 | 98% |
| view:recent1 | -1.356 | +0.027 (0.70) | 0.140 | 0.636 | 98% |
| view:recent2 | -1.175 | +0.076 (0.70) | 0.121 | 0.655 | 98% |
| view:recent3 | -1.112 | +0.088 (0.70) | 0.117 | 0.661 | 98% |
| view:recent4 | -0.035 | +0.219 (0.50) | 0.095 | 0.679 | 98% |
| view:recent5 | +0.008 | +0.219 (0.50) | 0.098 | 0.677 | 98% |
| view:recent6 | +0.017 | +0.213 (0.50) | 0.101 | 0.672 | 98% |
| view:lightFlattener | +0.153 | +0.168 (0.20) | 0.119 | 0.638 | 88% |
| view:flattener | - | - | - | - | 0% |
| view:flattener2 | - | - | - | - | 0% |
| blend (shipped) | +0.288 | +0.319 (0.20) | 0.081 | 0.695 | 99% |
| aim:headon | -1.163 | +0.056 (0.70) | 0.165 | 0.632 | 100% |
| aim:linear | -1.280 | +0.058 (0.70) | 0.080 | 0.670 | 100% |
| aim:circular | -1.195 | +0.070 (0.70) | 0.083 | 0.673 | 100% |
| blend (rolling, K1) | +0.320 | +0.342 (0.10) | 0.080 | 0.696 | 99% |
| hindsight: best fixed mix per opponent | +0.373 | +0.387 (0.10) | 0.075 | 0.706 | 99% |
| blend (rolling, views + aims, K1) | +0.374 | +0.386 (0.10) | 0.077 | 0.701 | 100% |
| visits (k-NN, K1) | +0.106 | +0.138 (0.30) | 0.131 | 0.631 | 100% |
| blend + 25% visits | +0.336 | +0.340 (0.05) | 0.081 | 0.694 | 99% |

Bullets outside the classic escape angle (|gf| > 1, scored where they were fired, normalised over [-1, 1]): 0.6%.

## Gate: the oracle is the surf, offline

| Check | On | Result |
|---|---|---|
| Views' score rebuilt from the neighbours over each option's plan interval equals the AES record's (within 0.1%), options no shadow touched | 85699 options | 99.99% |
| With the rebuilt scores, the surf's rule picks the option it took (waves with every option rebuilt) | 10794 of 46719 waves | 99.99% |

## By census class

| Class | Bots | blend bits | blend safe | rolling bits | rolling safe | best simple aim bits |
|---|---|---|---|---|---|---|
| learning-flat | 48 | +0.288 | 0.081 | +0.320 | 0.080 | -0.830 |
