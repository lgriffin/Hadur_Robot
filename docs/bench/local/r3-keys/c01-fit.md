# SKEY-3: per-opponent surf-key fit

Data: `c01.npz`, 12 opponents, 47177 bullets, 3632 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **11 of 12 shipped**. Mean of the worse fold over all opponents: +0.3119 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| tobe.calypso.Calypso 4.1 | 140 | -1.2863 | -0.3259 | +0.9435 | +0.8421 | 2.8 | 2 1.19 0.841 2.38 0.297 1.41 2.38 1 0.595 | yes |
| tango.Recrimpo 2.51 | 138 | -0.7403 | -0.0024 | +0.5395 | +0.7407 | 2.8 | 8 0.595 1.68 2.83 0.595 0.707 0.595 0.5 0.42 | yes |
| cbot.cbot.CBot 0.8 | 202 | -0.4278 | 0.1726 | +0.5226 | +0.6309 | 2.8 | 0.841 1 0.177 0.841 1.41 1.19 0.42 0.42 0.5 | yes |
| doka.Test 1.0 | 248 | -0.3281 | 0.1055 | +0.3990 | +0.3808 | 2.8 | 1.68 0.841 0.5 0.595 0.595 1.19 1.41 1 2.83 | yes |
| pedersen.Ugluk 1.0 | 320 | -0.3530 | 0.0698 | +0.3689 | +0.4422 | 2.8 | 0.595 1.41 1 2 0.841 1 1.19 1 1 | yes |
| robar.nano.Assertive 0.3 | 255 | -0.0551 | 0.2487 | +0.2995 | +0.2933 | 2.8 | 4 1.41 2.83 0.707 0.5 0.841 1.19 1 0.297 | yes |
| infovk.s_schwarzm16.silverbird 1.0 | 466 | -0.2581 | 0.0405 | +0.2805 | +0.2961 | 2.8 | 1.19 2 0.5 0.707 1 1 0.5 0.841 1 | yes |
| rdt.Wraith.Wraith 0.3 | 345 | 0.0387 | 0.3175 | +0.3094 | +0.2222 | 2.8 | 2 1.41 1.68 0.42 0.707 1 1 0.707 1 | yes |
| sadoner.killer 0.2 | 205 | 0.1693 | 0.4339 | +0.2966 | +0.1684 | 2 | 2.38 0.354 1.19 0.5 0.354 0.841 0.595 0.125 8 | yes |
| nz.jdc.nano.NeophytePRAL 1.4 | 368 | 0.2107 | 0.3451 | +0.1288 | +0.1002 | 2 | 2.38 2 1.41 0.5 0.595 0.297 0.841 2.83 1 | yes |
| mue.Ascendant 1.2.27 | 593 | 0.1480 | 0.2751 | +0.0874 | +0.1171 | 2.8 | 1 1 0.42 0.707 0.354 1.19 2 0.841 1 | yes |
| ms.Ares 0.19 | 352 | 0.1916 | 0.2987 | +0.0090 | -0.0625 | 1.4 | 4 1 0.707 0.595 1 0.595 1.19 1 1 |  |
