# SKEY-3: per-opponent surf-key fit

Data: `c04.npz`, 12 opponents, 33129 bullets, 2416 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **11 of 12 shipped**. Mean of the worse fold over all opponents: +0.3076 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| dummy.micro.HummingBird 2.14 | 169 | -0.9491 | -0.2849 | +0.6092 | +0.5873 | 2.8 | 1 1 1.19 1 1 0.841 1 0.354 1 | yes |
| md.Pasta 1.1 | 160 | -0.5017 | 0.0809 | +0.5891 | +0.5456 | 2.8 | 1 1 1 1 1 1 1 1 1 | yes |
| stuff.Vlad 0.1 | 191 | -0.6161 | -0.1059 | +0.4506 | +0.5049 | 2.8 | 2.83 1 0.5 0.841 0.595 0.595 0.5 0.42 2.83 | yes |
| dcs.Eater_of_Worlds 1.1.3-A | 62 | -0.4076 | 0.2770 | +0.6930 | +0.4276 | 2.8 | 0.177 8 0.5 0.5 1.41 1.19 2.83 0.42 0.25 | yes |
| adt.Ar2 1.0 | 67 | -0.1301 | 0.4071 | +0.3437 | +0.4007 | 2.8 | 0.25 1.19 2 2 0.841 0.841 2.83 1.68 1.41 | yes |
| zyx.nano.RedBull 1.0 | 11 | 0.9460 | 1.2900 | +0.3470 | +0.3041 | 0.5 | 1 1.19 1 1 1 1 1 1 1 |  |
| josago.Jorgito 0.16 | 318 | -0.0855 | 0.2008 | +0.2565 | +0.2713 | 2.8 | 0.21 2.38 0.707 1 0.177 2 0.125 1.19 0.841 | yes |
| lj.Dapps 0.2 | 421 | -0.0493 | 0.1853 | +0.2126 | +0.2229 | 2.8 | 4 2.83 4 1.41 1.19 0.707 1 0.5 1 | yes |
| lrem.micro.MoggFanatic 0.2 | 76 | 0.5883 | 0.8574 | +0.1761 | +0.2828 | 1.4 | 2 4 2 1.41 2.83 0.42 0.707 0.297 2 | yes |
| gf.Centaur.Centaur 0.6.7 | 601 | 0.0034 | 0.1641 | +0.1409 | +0.1343 | 2.8 | 2 1.19 0.177 1.19 1.19 1 2 0.707 1.41 | yes |
| suh.nano.CornerRL 1.00 | 165 | 0.7034 | 0.8799 | +0.1680 | +0.1316 | 2 | 0.25 2.38 0.841 2 0.841 1.19 0.595 1.41 1.41 | yes |
| tkt.RedShift 1.1.CS.0 | 175 | 0.2280 | 0.4256 | +0.2149 | +0.1213 | 1.4 | 4 1.19 0.595 0.21 0.25 0.25 1.19 1.41 2.38 | yes |
