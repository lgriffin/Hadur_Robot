# AES by round: first ratings against the real bullet

arm c: records 84321, real 82464, matched 82364 of 103522 bullets
arm cm: records 87017, real 85290, matched 85216 of 106013 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2357 | 0.098 | 0.090 | 0.098 | 0.000 | 0.429 | 0.405 | 0.427 | 0.522 | 0.527 |
| cm |  0- 0 | 2077 | 0.099 | 0.084 | 0.097 | 0.002 | 0.465 | 0.444 | 0.474 | 0.651 | 0.523 |
| c |  1- 2 | 4385 | 0.095 | 0.083 | 0.093 | 0.002 | 0.441 | 0.433 | 0.443 | 0.510 | 0.479 |
| cm |  1- 2 | 4931 | 0.103 | 0.087 | 0.099 | 0.004 | 0.441 | 0.420 | 0.443 | 0.583 | 0.508 |
| c |  3- 6 | 9483 | 0.103 | 0.086 | 0.100 | 0.003 | 0.423 | 0.414 | 0.417 | 0.592 | 0.509 |
| cm |  3- 6 | 9402 | 0.108 | 0.090 | 0.104 | 0.004 | 0.445 | 0.430 | 0.439 | 0.563 | 0.523 |
| c |  7-14 | 18436 | 0.097 | 0.082 | 0.094 | 0.003 | 0.434 | 0.424 | 0.430 | 0.533 | 0.502 |
| cm |  7-14 | 19803 | 0.110 | 0.096 | 0.106 | 0.004 | 0.440 | 0.435 | 0.431 | 0.597 | 0.561 |
| c | 15-34 | 47703 | 0.102 | 0.086 | 0.100 | 0.003 | 0.433 | 0.429 | 0.424 | 0.525 | 0.484 |
| cm | 15-34 | 49003 | 0.112 | 0.093 | 0.108 | 0.004 | 0.444 | 0.442 | 0.437 | 0.588 | 0.522 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 82364 | 0.101 | 0.085 | 0.098 | 0.433 | 0.426 | 0.534 | 0.492 |
| cm | 85216 | 0.110 | 0.093 | 0.106 | 0.444 | 0.438 | 0.588 | 0.530 |

## Per opponent: hit share of the chosen option at the first rating, cm minus c (seeds both fought)

| opponent | seeds | waves | c | cm | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 14326 | 0.147 | 0.166 | +0.019 |
| abc.Shadow_3.83c | 2 | 3619 | 0.113 | 0.121 | +0.008 |
| ags.Glacier_0.3.2 | 2 | 2486 | 0.114 | 0.137 | +0.023 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1305 | 0.009 | 0.013 | +0.004 |
| bvh.mini.Wodan_0.50 | 2 | 2216 | 0.084 | 0.110 | +0.026 |
| catcat20.helios.Helios_1.5 | 2 | 2933 | 0.096 | 0.110 | +0.015 |
| cw.megas.Gridd_0.4 | 2 | 1725 | 0.089 | 0.097 | +0.008 |
| cx.BlestPain_1.41 | 2 | 2152 | 0.075 | 0.077 | +0.002 |
| demetrix.ForceMajeure_0.75 | 2 | 2979 | 0.104 | 0.115 | +0.011 |
| divineomega.PatrollerBot_1.0 | 2 | 1341 | 0.047 | 0.046 | -0.001 |
| dummy.micro.HummingBird_2.14 | 2 | 1236 | 0.074 | 0.074 | +0.001 |
| dz.OthoMini_0.15 | 2 | 1853 | 0.059 | 0.067 | +0.008 |
| gh.GresSuffurd_0.4.13 | 2 | 4428 | 0.114 | 0.129 | +0.015 |
| jgap.JGAP6139_1.0 | 2 | 1129 | 0.047 | 0.041 | -0.006 |
| kc.nano.Splinter_1.2 | 2 | 1487 | 0.072 | 0.074 | +0.002 |
| kvk.HebusLeTroll_0.41 | 2 | 1716 | 0.053 | 0.093 | +0.039 |
| lechu.Ala_0.0.4 | 2 | 2597 | 0.117 | 0.122 | +0.005 |
| mn.Combat_3.25.0 | 2 | 6959 | 0.117 | 0.129 | +0.012 |
| mue.Hyperion_0.8 | 2 | 1321 | 0.144 | 0.144 | +0.000 |
| non.mega.NoName_0.0 | 2 | 1259 | 0.079 | 0.068 | -0.010 |
| ntc.Swim_0.9 | 2 | 3382 | 0.079 | 0.085 | +0.006 |
| robar.micro.Topaz_0.25 | 2 | 1711 | 0.089 | 0.107 | +0.018 |
| sgp.ShiningBeetle_1.1 | 2 | 1367 | 0.050 | 0.063 | +0.013 |
| sheldor.micro.Continuation_1.1 | 2 | 4243 | 0.099 | 0.107 | +0.008 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3820 | 0.054 | 0.048 | -0.006 |
| stelo.MatchupMini_1.1 | 2 | 2802 | 0.080 | 0.094 | +0.014 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3558 | 0.108 | 0.106 | -0.003 |
| ultra.Defender_1.2 | 2 | 2414 | 0.099 | 0.081 | -0.019 |

mean diff +0.0075 +- 0.0044 (95%), fewer hits on 6 of 28 opponents

## Per opponent: real hit share, cm minus c (seeds both fought)

| opponent | seeds | waves | c | cm | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 14027 | 0.112 | 0.125 | +0.013 |
| abc.Shadow_3.83c | 2 | 3570 | 0.097 | 0.098 | +0.002 |
| ags.Glacier_0.3.2 | 2 | 2459 | 0.102 | 0.116 | +0.013 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1290 | 0.013 | 0.016 | +0.003 |
| bvh.mini.Wodan_0.50 | 2 | 2186 | 0.076 | 0.097 | +0.021 |
| catcat20.helios.Helios_1.5 | 2 | 2904 | 0.085 | 0.093 | +0.008 |
| cw.megas.Gridd_0.4 | 2 | 1701 | 0.087 | 0.090 | +0.003 |
| cx.BlestPain_1.41 | 2 | 2132 | 0.068 | 0.071 | +0.003 |
| demetrix.ForceMajeure_0.75 | 2 | 2933 | 0.091 | 0.102 | +0.011 |
| divineomega.PatrollerBot_1.0 | 2 | 1316 | 0.049 | 0.042 | -0.006 |
| dummy.micro.HummingBird_2.14 | 2 | 1221 | 0.074 | 0.070 | -0.003 |
| dz.OthoMini_0.15 | 2 | 1832 | 0.063 | 0.066 | +0.003 |
| gh.GresSuffurd_0.4.13 | 2 | 4370 | 0.091 | 0.096 | +0.005 |
| jgap.JGAP6139_1.0 | 2 | 1115 | 0.042 | 0.038 | -0.005 |
| kc.nano.Splinter_1.2 | 2 | 1486 | 0.067 | 0.073 | +0.006 |
| kvk.HebusLeTroll_0.41 | 2 | 1685 | 0.066 | 0.085 | +0.018 |
| lechu.Ala_0.0.4 | 2 | 2585 | 0.101 | 0.110 | +0.009 |
| mn.Combat_3.25.0 | 2 | 6856 | 0.095 | 0.107 | +0.012 |
| mue.Hyperion_0.8 | 2 | 1306 | 0.090 | 0.107 | +0.018 |
| non.mega.NoName_0.0 | 2 | 1248 | 0.062 | 0.060 | -0.002 |
| ntc.Swim_0.9 | 2 | 3316 | 0.070 | 0.079 | +0.009 |
| robar.micro.Topaz_0.25 | 2 | 1691 | 0.087 | 0.088 | +0.001 |
| sgp.ShiningBeetle_1.1 | 2 | 1354 | 0.048 | 0.059 | +0.011 |
| sheldor.micro.Continuation_1.1 | 2 | 4121 | 0.086 | 0.098 | +0.012 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3778 | 0.045 | 0.047 | +0.003 |
| stelo.MatchupMini_1.1 | 2 | 2737 | 0.081 | 0.085 | +0.004 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3551 | 0.095 | 0.092 | -0.003 |
| ultra.Defender_1.2 | 2 | 2403 | 0.076 | 0.067 | -0.009 |

mean diff +0.0057 +- 0.0028 (95%), fewer hits on 6 of 28 opponents
