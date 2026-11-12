# SKEY-3: per-opponent surf-key fit

Data: `c06.npz`, 12 opponents, 25611 bullets, 1536 hits. Model: the normal hit view (k <= 20, n/5), the surf's kernel; bits a bullet over uniform, 5% uniform mixed in.

Ship rule: both held-out folds gain >= 0.020 bits a bullet and >= 30 hits: **11 of 12 shipped**. Mean of the worse fold over all opponents: +0.4584 bits.

| opponent | hits | default bits | fitted (all) | fold A gain | fold B gain | width | multipliers | ships |
|---|---:|---:|---:|---:|---:|---:|---|---|
| bumblebee.Bumblebee 1.0 | 64 | -0.7092 | 0.3130 | +0.8795 | +0.9914 | 2.8 | 1.68 0.354 2 0.841 0.707 0.707 0.595 0.707 1.41 | yes |
| sgp.MadHatter 4.13 | 76 | -0.9583 | -0.0131 | +0.8178 | +0.8572 | 2.8 | 2.83 2.38 0.841 0.5 5.66 1 0.42 0.25 2.38 | yes |
| zch.David 0.21 | 21 | -1.0288 | -0.0709 | +0.5991 | +1.0106 | 2.8 | 4 1 0.354 0.707 1.68 1 1 0.5 2.38 |  |
| matt.advanced.Katana 1.0 | 112 | -0.6845 | -0.0587 | +0.5495 | +0.5640 | 2.8 | 0.5 0.595 1.68 0.707 1 0.354 0.5 0.5 2 | yes |
| winamp32.micro.MicroMacro 1.0 | 123 | -0.5049 | 0.1248 | +0.6459 | +0.5444 | 2.8 | 1 1.19 0.707 0.42 0.21 0.354 1 0.354 2.38 | yes |
| tvv.nano.Polaris 1.2 | 68 | -0.3798 | 0.2581 | +0.5251 | +0.6592 | 2.8 | 1.41 4 2 1.41 0.5 0.25 1.41 1.41 0.5 | yes |
| pi.Dark 10 | 180 | -0.4200 | 0.1776 | +0.6887 | +0.4549 | 2.8 | 2 1 2 2 0.42 0.5 0.5 1 0.707 | yes |
| supersample.SuperTracker 1.0 | 50 | 1.1844 | 1.6184 | +0.3060 | +0.3534 | 0.7 | 2 2.83 2.83 0.42 0.125 0.707 0.354 0.125 0.297 | yes |
| labg.Cataclysm 2.05 | 297 | 0.0066 | 0.3252 | +0.2888 | +0.2996 | 2.8 | 1.68 2 2.83 2 1.19 1 0.841 1 1 | yes |
| mbro.Detektor3 0.1.1 | 91 | 1.2432 | 1.9005 | +0.2194 | +0.3914 | 0.5 | 1.41 4 0.177 1 1.41 0.42 0.5 0.25 0.21 | yes |
| jp.Perpy 16.0 | 406 | -0.1911 | 0.0632 | +0.2679 | +0.2032 | 2.8 | 2 2 1.19 1 1 1 1 0.707 1.41 | yes |
| jt.SpearmintCT Alpha | 48 | 0.4515 | 1.0091 | +0.1137 | +0.7119 | 2 | 2 1.19 2 2 0.5 0.841 1 0.707 1 | yes |
