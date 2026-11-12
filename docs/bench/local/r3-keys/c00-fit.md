# SKEY-3: per-opponent surf-key fit

Data: `c00.npz`, 12 opponents, 53563 bullets, 4337 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **12 of 12 shipped**. Mean of the worse fold over all opponents: +0.2299 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| cx.mini.Cigaret 1.31 | 244 | -0.4680 | 0.1718 | +0.6603 | +0.5363 | 2.8 | 1.41 1 1.19 0.707 0.841 1 0.841 2 0.841 | yes |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 289 | -0.2038 | 0.1928 | +0.3819 | +0.3641 | 2.8 | 2.83 0.841 2.83 1.41 1 0.841 0.841 1.41 1 | yes |
| cx.BlestPain 1.41 | 292 | 0.1542 | 0.4982 | +0.3384 | +0.3047 | 2.8 | 4 1.19 1.68 0.5 0.595 1.41 0.5 0.5 0.5 | yes |
| tm.Yuugao 1.0 | 347 | -0.0947 | 0.2336 | +0.3010 | +0.3295 | 2.8 | 2 2 0.707 1.41 0.5 0.5 1.19 1.41 1 | yes |
| cw.megas.Gridd 0.4 | 316 | -0.0851 | 0.2209 | +0.2624 | +0.2945 | 2.8 | 1.68 1.41 0.595 0.841 1.41 0.707 1.41 1.41 1.19 | yes |
| ary.nano.ColorNanoP 1.1 | 188 | 0.0950 | 0.3748 | +0.1868 | +0.3007 | 2.8 | 0.595 2.38 1.68 0.42 1.41 0.707 0.25 1 1.19 | yes |
| demetrix.ForceMajeure 0.75 | 574 | 0.0395 | 0.2273 | +0.1851 | +0.1684 | 2.8 | 5.66 2 0.707 1.41 0.25 0.707 1.41 0.177 0.841 | yes |
| ds.Versatile RB1.0.1 | 538 | -0.0037 | 0.2101 | +0.2148 | +0.1546 | 2.8 | 1 2 2.38 1.41 0.707 0.595 0.42 0.297 1 | yes |
| oog.micro.Maui 1.2 | 348 | 0.1014 | 0.2783 | +0.1534 | +0.1594 | 2.8 | 5.66 2 1.68 0.707 0.5 0.25 1.41 1.41 1.19 | yes |
| nat.Samekh 0.4 | 537 | 0.1513 | 0.3461 | +0.1773 | +0.1443 | 2.8 | 4 1 0.125 0.5 0.707 1.19 1.19 0.595 0.841 | yes |
| axeBots.Okami 1.04 | 494 | 0.1957 | 0.3495 | +0.1305 | +0.1258 | 2.8 | 2.83 1.41 0.841 1.19 0.5 0.841 1.19 0.297 1 | yes |
| krzysiek.robbo2.Robbo 1.0.0 | 170 | 0.4997 | 0.6261 | +0.0566 | +0.0884 | 1.4 | 1.41 2 0.841 1.19 1 1 0.841 0.25 1 | yes |
