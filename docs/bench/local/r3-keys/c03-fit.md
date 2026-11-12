# SKEY-3: per-opponent surf-key fit

Data: `c03.npz`, 12 opponents, 26621 bullets, 1725 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **9 of 12 shipped**. Mean of the worse fold over all opponents: +0.3079 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| nosteel.Welby 0.0.3 | 60 | -0.1031 | 0.7250 | +0.7170 | +0.7724 | 2 | 4 1.68 2.38 1 0.297 1.19 0.595 0.354 0.25 | yes |
| ntc.Lasers.Lasers 0.9 | 126 | -0.5781 | 0.1517 | +0.7216 | +0.6242 | 2.8 | 3.36 0.707 0.841 1 0.707 2 2 0.707 1.19 | yes |
| dft.Krazy 1.5 | 153 | -0.6452 | 0.0465 | +0.7099 | +0.5775 | 2.8 | 0.841 1.41 1.41 1 0.595 2 2 1.19 1.19 | yes |
| dk.stable.Gorgatron 1.1 | 109 | -0.5124 | 0.2056 | +0.7277 | +0.5694 | 2.8 | 0.595 1.68 2.83 0.841 0.42 0.5 1.19 0.841 1.41 | yes |
| maribo.IotaCT 1.0 | 66 | 0.1000 | 0.6418 | +0.5507 | +0.4261 | 2.8 | 0.707 2.38 2 0.42 0.707 1.19 2 1 0.841 | yes |
| kinsen.nano.Senticous 1.0 | 265 | -0.5737 | -0.0889 | +0.4320 | +0.4225 | 2.8 | 1.41 0.42 1.41 1 1.19 0.5 1 1.41 0.841 | yes |
| davidalves.net.DuelistMicro 1.22 | 234 | 0.0557 | 0.4752 | +0.4594 | +0.3067 | 2.8 | 4.76 2 3.36 0.595 0.297 0.5 1 1 0.595 | yes |
| oog.nano.MagicD2 2.4 | 100 | 0.2482 | 0.6169 | +0.2434 | +0.3805 | 2 | 2 1.68 2.38 0.42 0.841 1 1.41 1.19 0.841 | yes |
| alpha.RainingFire 1.0 | 473 | 0.0174 | 0.2537 | +0.1946 | +0.2397 | 2.8 | 4.76 0.42 0.5 1.68 0.25 1 1.41 0.177 0.42 | yes |
| squidM.SquidmanNano 1.0 | 27 | 0.4758 | 0.7843 | -0.0711 | +0.0377 | 2 | 0.42 1.19 1.41 0.354 0.42 0.354 0.707 0.42 2.83 |  |
| kneels.ToNoone 0.2 | 48 | 1.6880 | 2.0063 | -0.1329 | -0.0847 | 1 | 4 1 0.25 0.42 0.707 2.38 1 0.841 1 |  |
| fw.Number1 1.0b | 64 | 0.1881 | 0.4127 | -0.1822 | +0.4224 | 1 | 0.42 0.125 0.5 2.38 0.21 0.125 1 2 0.841 |  |
