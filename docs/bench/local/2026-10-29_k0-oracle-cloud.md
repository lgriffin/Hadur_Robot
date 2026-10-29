# Gun oracle (K0): every model scored on the same bullets

Data: `k0.npz`, 46719 enemy bullets matched to the wave the surf rated, 48 opponents. Means per opponent, each opponent weighted equally. **bits**: log2 of the model's density at the bullet's guess factor over the uniform's, after a 5% uniform mix (higher is better). **safe**: the share of bullets from the third of the wave the model rated least dangerous, the third the surf drives into (lower is better; 0.333 knows nothing). **coverage**: the share of bullets on which the model had a surface (a view off or empty has none).

| Model | bits | safe | coverage |
|---|---|---|---|
| uniform | +0.000 | 0.333 | 100% |
| view:simple | +0.053 | 0.091 | 99% |
| view:normal | +0.098 | 0.087 | 98% |
| view:recent1 | -1.356 | 0.140 | 98% |
| view:recent2 | -1.175 | 0.121 | 98% |
| view:recent3 | -1.112 | 0.117 | 98% |
| view:recent4 | -0.035 | 0.095 | 98% |
| view:recent5 | +0.008 | 0.098 | 98% |
| view:recent6 | +0.017 | 0.101 | 98% |
| view:lightFlattener | +0.153 | 0.119 | 88% |
| view:flattener | - | - | 0% |
| view:flattener2 | - | - | 0% |
| blend (shipped) | +0.288 | 0.081 | 99% |
| aim:headon | -1.163 | 0.165 | 100% |
| aim:linear | -1.280 | 0.080 | 100% |
| aim:circular | -1.195 | 0.083 | 100% |

Bullets outside the classic escape angle (|gf| > 1, scored where they were fired, normalised over [-1, 1]): 0.6%.

## Gate: the oracle is the surf, offline

| Check | On | Result |
|---|---|---|
| Views' score rebuilt from the neighbours over each option's plan interval equals the AES record's (within 0.1%), options no shadow touched | 85699 options | 99.99% |
| With the rebuilt scores, the surf's rule picks the option it took (waves with every option rebuilt) | 10794 of 46719 waves | 99.99% |

## By census class

| Class | Bots | blend bits | blend safe | best simple aim bits |
|---|---|---|---|---|
| learning-flat | 47 | +0.286 | 0.082 | -0.830 |
| unclassed | 1 | +0.367 | 0.075 | -0.829 |
