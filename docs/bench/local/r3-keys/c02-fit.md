# SKEY-3: per-opponent surf-key fit

Data: `c02.npz`, 12 opponents, 39547 bullets, 2821 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **11 of 12 shipped**. Mean of the worse fold over all opponents: +0.4409 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| Grystrion.RandomTrackerNOREV 1.0 | 40 | -1.6317 | -0.1631 | +1.4003 | +1.1967 | 2.8 | 1 0.841 2.38 0.354 0.707 1 2 0.595 1.41 | yes |
| stelo.MirrorMicro 1.1 | 31 | -1.7016 | -0.3571 | +0.9907 | +1.1064 | 2.8 | 2.83 0.707 0.707 0.5 0.42 0.5 0.707 1.19 0.42 | yes |
| vft.Valkyrie 1.0 | 115 | -0.9392 | -0.0985 | +0.8025 | +0.7161 | 2.8 | 0.42 0.297 1 0.841 1 0.841 1 0.297 2 | yes |
| slugzilla.SNGPattern 1.0 | 133 | -0.5935 | 0.1001 | +0.6727 | +0.6229 | 2.8 | 0.707 0.841 0.177 2 1.19 0.841 2 0.707 1.41 | yes |
| alk.lap.LoudAndProud 2.23 | 182 | -0.2731 | 0.3546 | +0.5302 | +0.6077 | 2.8 | 2 0.707 1.19 1 0.42 1.41 2 2 1.41 | yes |
| apc.botM 3.0 | 240 | -0.0241 | 0.4362 | +0.3409 | +0.2845 | 2 | 0.707 0.841 0.354 1 0.5 0.707 0.125 0.177 8 | yes |
| cw.megas.GhostShell GT | 306 | -0.1496 | 0.1822 | +0.2455 | +0.3477 | 2.8 | 2.83 1.41 0.595 1 0.5 0.5 2.83 0.354 0.707 | yes |
| nz.jdc.nano.AralT 1.1 | 173 | -0.1015 | 0.1909 | +0.2849 | +0.2067 | 2.8 | 0.42 2 2 1 1.68 1 0.595 1.41 1.19 | yes |
| eem.EvBot v4.6.4 | 401 | 0.0953 | 0.3302 | +0.1957 | +0.2402 | 2.8 | 2 1.41 0.5 1.19 1 1.19 2 1.19 1 | yes |
| gadsky.Gadsky 1.01 | 389 | 0.1655 | 0.3945 | +0.1668 | +0.2335 | 2.8 | 5.66 1.68 2.38 1 2 0.354 1.19 0.595 1 | yes |
| dam.MogBot 2.9 | 515 | 0.1335 | 0.2750 | +0.1374 | +0.1179 | 2.8 | 1.41 2 1 1 2 0.707 1.19 0.5 1.41 | yes |
| sos.SOS 1.0 | 296 | 0.4228 | 0.5014 | +0.0306 | +0.0172 | 1 | 2 2.38 0.841 1 1 0.5 1.19 0.5 1.19 |  |
