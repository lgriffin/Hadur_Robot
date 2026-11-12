# SKEY-3: per-opponent surf-key fit

Data: `c08.npz`, 12 opponents, 17381 bullets, 1201 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **8 of 12 shipped**. Mean of the worse fold over all opponents: +0.5246 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| amk.Punbot.Punbot 0.01 | 12 | -1.2198 | 0.2038 | +1.2045 | +1.3630 | 2.8 | 0.707 1.68 1.41 0.297 0.707 2 1 0.42 1 |  |
| dhn.Immortal 1.0 | 46 | -1.7236 | -0.4863 | +1.0804 | +0.9332 | 2.8 | 0.595 0.841 0.841 1 0.25 1 1.68 0.595 1.41 | yes |
| robar.nano.Scytodes 0.3 | 91 | -0.8131 | 0.1452 | +0.7405 | +0.9603 | 2.8 | 1.68 0.707 1.68 1.41 1 0.5 0.707 1 2.83 | yes |
| dz.OthoMicro 0.12 | 208 | -0.5096 | 0.1543 | +0.6158 | +0.5974 | 2.8 | 3.36 0.5 0.5 0.5 0.841 0.5 2 2 2 | yes |
| geep.mini.GPBotB 1.1 | 232 | -1.0151 | -0.4232 | +0.5676 | +0.5634 | 2.8 | 1 1 2 1 1 0.841 1 1 1 | yes |
| jsal.Jsalbot 1.0 | 138 | -0.7953 | -0.1724 | +0.4996 | +0.5251 | 2.8 | 0.707 1.19 1.41 0.707 0.42 1.68 0.707 0.125 4 | yes |
| qualidafial.MajorDick 1.0.1 | 10 | 1.6403 | 2.1540 | +0.4830 | +0.5244 | 0.5 | 2 8 1 0.595 0.5 2 1 1 2 |  |
| axeBots.HataMoto 3.09 | 218 | -0.4043 | 0.1187 | +0.5260 | +0.4581 | 2.8 | 2 1 1.41 0.354 0.841 0.5 0.5 1 1 | yes |
| strider.Mer 1.1.0 | 158 | -0.5637 | -0.0609 | +0.5346 | +0.3582 | 2.8 | 1.19 0.707 1 0.595 0.5 0.42 0.42 1 1.19 | yes |
| ola.Puffin 1.0 | 63 | -0.6898 | -0.1965 | +0.2799 | +0.3308 | 2.8 | 2 2.38 2.38 0.595 1.19 0.177 0.5 0.707 0.595 | yes |
| daemons.DizzyA 1.0 | 17 | 0.4808 | 0.6241 | +0.1353 | +0.0947 | 0.5 | 1 1 2.83 1 1.41 1 1 1 1 |  |
| dvogon.GangBang 1.0 | 8 | 0.3495 | 0.6274 | +0.0832 | +0.1610 | 1.4 | 1 0.5 0.5 1 0.5 1 1 1.41 2 |  |
