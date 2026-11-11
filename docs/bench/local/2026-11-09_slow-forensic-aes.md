# AES by round: first ratings against the real bullet

arm c: records 87822, real 85784, matched 85682 of 106098 bullets
arm sl: records 82913, real 81201, matched 81083 of 100567 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2178 | 0.102 | 0.096 | 0.099 | 0.003 | 0.470 | 0.464 | 0.472 | 0.585 | 0.607 |
| sl |  0- 0 | 2362 | 0.110 | 0.090 | 0.108 | 0.002 | 0.338 | 0.335 | 0.335 | 0.656 | 0.524 |
| c |  1- 2 | 4475 | 0.089 | 0.083 | 0.088 | 0.001 | 0.412 | 0.404 | 0.408 | 0.503 | 0.493 |
| sl |  1- 2 | 4558 | 0.094 | 0.084 | 0.092 | 0.002 | 0.277 | 0.269 | 0.273 | 0.535 | 0.511 |
| c |  3- 6 | 9156 | 0.091 | 0.079 | 0.089 | 0.002 | 0.440 | 0.431 | 0.436 | 0.523 | 0.498 |
| sl |  3- 6 | 10439 | 0.096 | 0.080 | 0.094 | 0.002 | 0.276 | 0.265 | 0.270 | 0.524 | 0.474 |
| c |  7-14 | 19718 | 0.102 | 0.087 | 0.099 | 0.003 | 0.430 | 0.420 | 0.419 | 0.509 | 0.475 |
| sl |  7-14 | 19105 | 0.098 | 0.082 | 0.096 | 0.002 | 0.287 | 0.278 | 0.277 | 0.532 | 0.490 |
| c | 15-34 | 50155 | 0.103 | 0.087 | 0.100 | 0.002 | 0.427 | 0.421 | 0.420 | 0.524 | 0.475 |
| sl | 15-34 | 44619 | 0.096 | 0.082 | 0.094 | 0.002 | 0.284 | 0.282 | 0.273 | 0.556 | 0.507 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 85682 | 0.100 | 0.086 | 0.098 | 0.429 | 0.422 | 0.521 | 0.482 |
| sl | 81083 | 0.097 | 0.082 | 0.095 | 0.285 | 0.280 | 0.548 | 0.499 |

## Per opponent: hit share of the chosen option at the first rating, sl minus c (seeds both fought)

| opponent | seeds | waves | c | sl | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 14841 | 0.150 | 0.145 | -0.006 |
| abc.Shadow_3.83c | 2 | 3895 | 0.099 | 0.106 | +0.007 |
| ags.Glacier_0.3.2 | 2 | 3545 | 0.124 | 0.113 | -0.011 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1320 | 0.022 | 0.012 | -0.010 |
| bvh.mini.Wodan_0.50 | 2 | 2043 | 0.092 | 0.083 | -0.009 |
| catcat20.helios.Helios_1.5 | 2 | 3031 | 0.094 | 0.100 | +0.006 |
| cw.megas.Gridd_0.4 | 2 | 1714 | 0.083 | 0.088 | +0.005 |
| cx.BlestPain_1.41 | 2 | 2114 | 0.064 | 0.079 | +0.016 |
| demetrix.ForceMajeure_0.75 | 2 | 2534 | 0.114 | 0.111 | -0.003 |
| divineomega.PatrollerBot_1.0 | 2 | 1326 | 0.049 | 0.033 | -0.016 |
| dummy.micro.HummingBird_2.14 | 2 | 1286 | 0.062 | 0.071 | +0.008 |
| dz.OthoMini_0.15 | 2 | 1787 | 0.071 | 0.062 | -0.008 |
| gh.GresSuffurd_0.4.13 | 2 | 5207 | 0.113 | 0.115 | +0.001 |
| jgap.JGAP6139_1.0 | 2 | 1242 | 0.034 | 0.039 | +0.005 |
| kc.nano.Splinter_1.2 | 2 | 1594 | 0.060 | 0.059 | -0.002 |
| kvk.HebusLeTroll_0.41 | 2 | 1852 | 0.076 | 0.064 | -0.012 |
| lechu.Ala_0.0.4 | 2 | 2644 | 0.109 | 0.108 | -0.000 |
| mn.Combat_3.25.0 | 2 | 7228 | 0.115 | 0.108 | -0.007 |
| mue.Hyperion_0.8 | 2 | 1610 | 0.138 | 0.111 | -0.027 |
| non.mega.NoName_0.0 | 2 | 1235 | 0.072 | 0.075 | +0.003 |
| ntc.Swim_0.9 | 2 | 3254 | 0.078 | 0.081 | +0.003 |
| robar.micro.Topaz_0.25 | 2 | 1943 | 0.076 | 0.092 | +0.016 |
| sgp.ShiningBeetle_1.1 | 2 | 1263 | 0.054 | 0.055 | +0.001 |
| sheldor.micro.Continuation_1.1 | 2 | 4687 | 0.097 | 0.102 | +0.005 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3242 | 0.039 | 0.053 | +0.014 |
| stelo.MatchupMini_1.1 | 2 | 2658 | 0.087 | 0.089 | +0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 4064 | 0.099 | 0.102 | +0.003 |
| ultra.Defender_1.2 | 2 | 2523 | 0.089 | 0.088 | -0.001 |

mean diff -0.0006 +- 0.0036 (95%), fewer hits on 13 of 28 opponents

## Per opponent: real hit share, sl minus c (seeds both fought)

| opponent | seeds | waves | c | sl | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 14537 | 0.114 | 0.110 | -0.005 |
| abc.Shadow_3.83c | 2 | 3830 | 0.089 | 0.093 | +0.004 |
| ags.Glacier_0.3.2 | 2 | 3508 | 0.101 | 0.102 | +0.002 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1308 | 0.023 | 0.012 | -0.011 |
| bvh.mini.Wodan_0.50 | 2 | 2008 | 0.078 | 0.077 | -0.000 |
| catcat20.helios.Helios_1.5 | 2 | 3005 | 0.082 | 0.084 | +0.002 |
| cw.megas.Gridd_0.4 | 2 | 1692 | 0.089 | 0.077 | -0.012 |
| cx.BlestPain_1.41 | 2 | 2078 | 0.060 | 0.073 | +0.013 |
| demetrix.ForceMajeure_0.75 | 2 | 2507 | 0.095 | 0.095 | +0.000 |
| divineomega.PatrollerBot_1.0 | 2 | 1308 | 0.044 | 0.041 | -0.003 |
| dummy.micro.HummingBird_2.14 | 2 | 1273 | 0.067 | 0.071 | +0.004 |
| dz.OthoMini_0.15 | 2 | 1749 | 0.068 | 0.066 | -0.002 |
| gh.GresSuffurd_0.4.13 | 2 | 5136 | 0.091 | 0.088 | -0.003 |
| jgap.JGAP6139_1.0 | 2 | 1227 | 0.046 | 0.035 | -0.011 |
| kc.nano.Splinter_1.2 | 2 | 1593 | 0.062 | 0.059 | -0.002 |
| kvk.HebusLeTroll_0.41 | 2 | 1815 | 0.067 | 0.059 | -0.009 |
| lechu.Ala_0.0.4 | 2 | 2640 | 0.102 | 0.093 | -0.009 |
| mn.Combat_3.25.0 | 2 | 7093 | 0.097 | 0.091 | -0.006 |
| mue.Hyperion_0.8 | 2 | 1579 | 0.107 | 0.086 | -0.021 |
| non.mega.NoName_0.0 | 2 | 1223 | 0.054 | 0.065 | +0.011 |
| ntc.Swim_0.9 | 2 | 3193 | 0.075 | 0.065 | -0.010 |
| robar.micro.Topaz_0.25 | 2 | 1916 | 0.078 | 0.080 | +0.002 |
| sgp.ShiningBeetle_1.1 | 2 | 1245 | 0.057 | 0.053 | -0.005 |
| sheldor.micro.Continuation_1.1 | 2 | 4548 | 0.093 | 0.090 | -0.004 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3210 | 0.036 | 0.046 | +0.009 |
| stelo.MatchupMini_1.1 | 2 | 2590 | 0.077 | 0.080 | +0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 4049 | 0.093 | 0.089 | -0.005 |
| ultra.Defender_1.2 | 2 | 2511 | 0.072 | 0.075 | +0.003 |

mean diff -0.0023 +- 0.0028 (95%), fewer hits on 17 of 28 opponents
