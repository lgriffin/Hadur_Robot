# SKEY-3: per-opponent surf-key fit

Data: `c07.npz`, 12 opponents, 23359 bullets, 1473 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **7 of 12 shipped**. Mean of the worse fold over all opponents: +0.2580 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| sp.AstherNano 1.0 | 90 | -1.3540 | -0.2281 | +1.2670 | +0.7979 | 2.8 | 0.25 0.707 0.25 1 2 2.38 0.125 0.25 2 | yes |
| jp.SineWall 1.0 | 55 | -0.5092 | 0.3091 | +0.5551 | +0.8264 | 2.8 | 0.354 1.19 0.5 1.19 1 1 1.68 0.841 0.177 | yes |
| divineomega.PatrollerBot 1.0 | 129 | -0.0981 | 0.5187 | +0.5312 | +0.6053 | 2.8 | 4 0.595 0.25 0.707 0.595 1 0.595 1 0.595 | yes |
| gjr.Cephalosporin 0.2 | 181 | -0.3756 | 0.1678 | +0.5282 | +0.4251 | 2.8 | 0.595 0.297 3.36 1.41 0.125 2 0.5 0.21 4 | yes |
| mld.jdc.nano.LittleBlackBook 1.0 | 124 | -0.6866 | -0.1031 | +0.5485 | +0.4057 | 2.8 | 0.595 1.41 0.25 2 1 1.68 0.25 0.42 1 | yes |
| ntc.Swim 0.9 | 512 | -0.2653 | 0.0114 | +0.2280 | +0.2986 | 2.8 | 2.83 0.5 0.707 0.25 0.25 2 2.38 0.707 1 | yes |
| pulsar.Nanis 0.3 | 131 | 0.1441 | 0.4645 | +0.2277 | +0.3211 | 2.8 | 0.25 0.354 2 0.25 1 1 0.841 1 1 | yes |
| blr.Chicken001 0.1 | 25 | 1.1423 | 1.5990 | +0.4984 | +0.2066 | 0.5 | 4.76 2.38 1.19 2 0.25 1 1 1 1.19 |  |
| jeremyreeder.Vincent 2011.12.09 | 13 | 0.9728 | 1.1471 | +0.2093 | +0.0741 | 1.4 | 0.297 2.38 2 0.42 1.41 1 0.707 0.5 0.5 |  |
| velas.Alpha 1.0 | 51 | 0.2495 | 0.6798 | -0.0192 | +0.2455 | 1 | 0.25 2 0.42 0.5 2 2 4 0.5 2 |  |
| rdm.WallRider 0.5c | 56 | 0.5720 | 1.0734 | -0.0630 | +0.4273 | 2 | 2 0.841 1 0.5 1 1 1.19 0.707 0.5 |  |
| supersample.SuperCorners 1.0 | 106 | 0.6659 | 0.8037 | -0.0096 | -0.2732 | 1 | 0.841 0.841 0.21 0.125 0.5 1 0.5 0.707 2 |  |
