# K1 step 1 on the cloud data: the rolling blend (2026-10-29)

The 48-robot cloud read of K0 (`hadur-bench/k0-cloud.txt`, 3.19 `aesrec,oracle`, 1 seed, 35 rounds),
re-joined with ORACLE-3's columns (battle, fire time, whether the bullet hit Hadur). 46,719 bullets on 36
robots Hadur surfs; 4,248 of them (9.1%) hit Hadur and are the only ones a view can learn from in battle
(4,574 HF records in the surfed battles, 93% matched to a joined wave; the rest hit on waves the surf did not
rate, or have no wave). The rolling blend learns from a hit at its HF tick. Write-up: [gun-oracle.md](../gun-oracle.md#k1-step-1-the-rolling-blend).

## Tuning (decay a seen bullet, power on the score), 36 robots

Each line is the rolling blend against the shipped blend (normalised to densities, which scores the same
+0.288). "worse" counts robots more than 0.02 bits below the shipped blend. "x shipped" multiplies the rolling
weights into the shipped weights (view weight x scan weight) instead of replacing them.

```
shipped weights, normalised  bits +0.288 (-0.000, worse 0/36) safe 0.082 (+0.0002)
d=0.70 k=1                   bits +0.299 (+0.011, worse 5/36) safe 0.081 (-0.0003)
d=0.70 k=1 x shipped         bits +0.314 (+0.026, worse 0/36) safe 0.081 (-0.0002)
d=0.70 k=2                   bits +0.316 (+0.028, worse 2/36) safe 0.080 (-0.0010)
d=0.70 k=2 x shipped         bits +0.314 (+0.026, worse 2/36) safe 0.082 (+0.0004)
d=0.70 k=4                   bits +0.302 (+0.014, worse 8/36) safe 0.082 (+0.0004)
d=0.70 k=4 x shipped         bits +0.299 (+0.011, worse 7/36) safe 0.084 (+0.0026)
d=0.80 k=1                   bits +0.298 (+0.010, worse 5/36) safe 0.081 (-0.0008)
d=0.80 k=1 x shipped         bits +0.313 (+0.025, worse 0/36) safe 0.081 (-0.0004)
d=0.80 k=2                   bits +0.320 (+0.032, worse 2/36) safe 0.080 (-0.0016)
d=0.80 k=2 x shipped         bits +0.314 (+0.026, worse 2/36) safe 0.081 (-0.0001)
d=0.80 k=4                   bits +0.315 (+0.027, worse 4/36) safe 0.081 (-0.0004)
d=0.80 k=4 x shipped         bits +0.301 (+0.013, worse 6/36) safe 0.085 (+0.0033)
d=0.90 k=1                   bits +0.292 (+0.004, worse 5/36) safe 0.081 (-0.0004)
d=0.90 k=1 x shipped         bits +0.308 (+0.020, worse 0/36) safe 0.081 (-0.0006)
d=0.90 k=2                   bits +0.317 (+0.029, worse 1/36) safe 0.079 (-0.0026)
d=0.90 k=2 x shipped         bits +0.310 (+0.022, worse 3/36) safe 0.082 (+0.0011)
d=0.90 k=4                   bits +0.318 (+0.030, worse 4/36) safe 0.081 (-0.0006)
d=0.90 k=4 x shipped         bits +0.298 (+0.010, worse 8/36) safe 0.085 (+0.0038)
d=0.95 k=1                   bits +0.283 (-0.005, worse 6/36) safe 0.081 (-0.0001)
d=0.95 k=1 x shipped         bits +0.303 (+0.015, worse 0/36) safe 0.081 (-0.0006)
d=0.95 k=2                   bits +0.306 (+0.018, worse 3/36) safe 0.080 (-0.0017)
d=0.95 k=2 x shipped         bits +0.305 (+0.017, worse 5/36) safe 0.083 (+0.0021)
d=0.95 k=4                   bits +0.313 (+0.025, worse 4/36) safe 0.080 (-0.0012)
d=0.95 k=4 x shipped         bits +0.293 (+0.005, worse 11/36) safe 0.086 (+0.0051)
all bullets d=0.95 k=4       bits +0.346 (+0.058, worse 0/36) safe 0.077 (-0.0043)
```

The pick is decay 0.8, power 2 (best bits, the middle of a flat patch). It was tuned on the same 36 robots
it is scored on, so +0.032 is if anything optimistic. The last line learns from every bullet, misses
included, which the robot cannot see: it is what the same rule would give with full information.

## The report at the pick

Data: `k1.npz`, 46719 enemy bullets matched to the wave the surf rated, 48 opponents. Means per opponent, each opponent weighted equally. **bits**: log2 of the model's density at the bullet's guess factor over the uniform's, after a 5% uniform mix (higher is better). **safe**: the share of bullets from the third of the wave the model rated least dangerous, the third the surf drives into (lower is better; 0.333 knows nothing). **coverage**: the share of bullets on which the model had a surface (a view off or empty has none).

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
| blend (rolling, K1) | +0.320 | 0.080 | 99% |
| hindsight: best fixed mix per opponent | +0.373 | 0.075 | 99% |

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
