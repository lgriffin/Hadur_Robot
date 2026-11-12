# SKEY-3: per-opponent surf-key fit

Data: `c05.npz`, 12 opponents, 22074 bullets, 1749 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **7 of 12 shipped**. Mean of the worse fold over all opponents: +0.2442 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| cf.OldMan.OldManXP 0.1 | 78 | -1.2182 | 0.0414 | +1.1292 | +1.1172 | 2.8 | 4 0.841 0.5 1.19 0.707 0.595 2 2 4 | yes |
| mld.LittleBlackBook 1.69e | 100 | -0.8678 | -0.1114 | +0.6235 | +0.7382 | 2.8 | 0.354 0.707 0.841 1 0.5 0.177 1.19 0.42 0.841 | yes |
| non.mega.NoName 0.0 | 171 | -0.5096 | 0.1138 | +0.5283 | +0.5712 | 2.8 | 4 1.41 0.707 1.41 0.707 0.5 0.595 0.595 0.841 | yes |
| mld.Infinity 2.2 | 62 | 0.1583 | 0.9018 | +0.7227 | +0.4058 | 2 | 8 0.5 1.19 0.354 1 0.125 0.42 1 1.41 | yes |
| jeremyreeder.Bully 1 | 9 | 1.3691 | 1.8263 | +0.2770 | +0.4006 | 0.5 | 1 1 1 1 1 1 1 2 1 |  |
| cw.megas.Polar 3.2 | 320 | -0.1004 | 0.2004 | +0.2962 | +0.2658 | 2.8 | 0.841 2 0.42 1.19 1 1.41 0.841 0.707 0.841 | yes |
| apollokidd.ApolloKidd 0.9 | 56 | 0.7878 | 1.0332 | +0.2060 | +0.0817 | 1 | 2.38 1.41 2.38 0.354 1.68 0.841 0.354 0.25 2.83 | yes |
| ajs.Solveit 1.3 | 444 | 0.1800 | 0.2594 | +0.0887 | +0.0374 | 2 | 0.707 1.41 1.41 0.841 0.841 0.5 2.83 1 2 | yes |
| dft.Calliope 5.6 | 272 | 0.3669 | 0.4382 | +0.0634 | -0.0161 | 1.4 | 0.841 2.83 0.42 0.707 1.68 1 2 1 1.41 |  |
| amc.ROBv301 1.1 | 58 | 0.5223 | 1.3575 | +0.4873 | -0.0255 | 0.5 | 4.76 0.841 1.41 0.21 1.68 0.297 4 0.841 0.707 |  |
| sanyi.mikrobi.Roberto 1.0 | 157 | 0.4598 | 0.5459 | +0.0909 | -0.1272 | 0.7 | 0.595 0.5 0.841 0.354 0.5 0.354 0.354 1 1.19 |  |
| bbo.RamboT 0.3 | 22 | 0.8165 | 0.9719 | -0.2379 | -0.0057 | 1.4 | 0.841 0.5 1.41 0.42 1 1 1 0.841 1 |  |
