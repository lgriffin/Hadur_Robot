# AES by round: first ratings against the real bullet

arm c: records 85777, real 82978, matched 82882 of 104598 bullets
arm ho: records 88888, real 86406, matched 86295 of 107548 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2479 | 0.107 | 0.090 | 0.106 | 0.002 | 0.471 | 0.466 | 0.474 | 0.550 | 0.507 |
| ho |  0- 0 | 2366 | 0.098 | 0.091 | 0.096 | 0.002 | 0.341 | 0.332 | 0.348 | 0.526 | 0.561 |
| c |  1- 2 | 5112 | 0.099 | 0.090 | 0.095 | 0.004 | 0.415 | 0.414 | 0.417 | 0.465 | 0.444 |
| ho |  1- 2 | 4849 | 0.095 | 0.084 | 0.093 | 0.002 | 0.328 | 0.319 | 0.322 | 0.536 | 0.504 |
| c |  3- 6 | 9957 | 0.100 | 0.085 | 0.098 | 0.003 | 0.407 | 0.402 | 0.405 | 0.534 | 0.491 |
| ho |  3- 6 | 9894 | 0.101 | 0.084 | 0.099 | 0.001 | 0.308 | 0.295 | 0.297 | 0.525 | 0.470 |
| c |  7-14 | 18233 | 0.098 | 0.084 | 0.095 | 0.003 | 0.437 | 0.426 | 0.428 | 0.553 | 0.505 |
| ho |  7-14 | 19880 | 0.103 | 0.084 | 0.100 | 0.002 | 0.322 | 0.308 | 0.311 | 0.522 | 0.451 |
| c | 15-34 | 47101 | 0.102 | 0.085 | 0.099 | 0.002 | 0.433 | 0.428 | 0.422 | 0.534 | 0.488 |
| ho | 15-34 | 49306 | 0.102 | 0.087 | 0.099 | 0.003 | 0.322 | 0.320 | 0.309 | 0.532 | 0.494 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 82882 | 0.101 | 0.085 | 0.098 | 0.431 | 0.425 | 0.535 | 0.490 |
| ho | 86295 | 0.102 | 0.086 | 0.099 | 0.321 | 0.315 | 0.529 | 0.484 |

## Per opponent: hit share of the chosen option at the first rating, ho minus c (seeds both fought)

| opponent | seeds | waves | c | ho | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 13369 | 0.146 | 0.143 | -0.002 |
| abc.Shadow_3.83c | 2 | 3945 | 0.112 | 0.110 | -0.002 |
| ags.Glacier_0.3.2 | 2 | 3448 | 0.122 | 0.129 | +0.007 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1309 | 0.015 | 0.020 | +0.005 |
| bvh.mini.Wodan_0.50 | 2 | 1736 | 0.089 | 0.098 | +0.009 |
| catcat20.helios.Helios_1.5 | 2 | 3848 | 0.103 | 0.095 | -0.008 |
| cw.megas.Gridd_0.4 | 2 | 1773 | 0.085 | 0.078 | -0.007 |
| cx.BlestPain_1.41 | 2 | 2116 | 0.073 | 0.068 | -0.005 |
| demetrix.ForceMajeure_0.75 | 2 | 3699 | 0.112 | 0.099 | -0.013 |
| divineomega.PatrollerBot_1.0 | 2 | 1332 | 0.037 | 0.057 | +0.020 |
| dummy.micro.HummingBird_2.14 | 2 | 1242 | 0.060 | 0.073 | +0.013 |
| dz.OthoMini_0.15 | 2 | 1713 | 0.078 | 0.070 | -0.007 |
| gh.GresSuffurd_0.4.13 | 2 | 4407 | 0.114 | 0.123 | +0.009 |
| jgap.JGAP6139_1.0 | 2 | 1210 | 0.041 | 0.035 | -0.007 |
| kc.nano.Splinter_1.2 | 2 | 1631 | 0.061 | 0.066 | +0.006 |
| kvk.HebusLeTroll_0.41 | 2 | 1797 | 0.063 | 0.065 | +0.002 |
| lechu.Ala_0.0.4 | 2 | 2589 | 0.112 | 0.112 | +0.000 |
| mn.Combat_3.25.0 | 2 | 6905 | 0.108 | 0.115 | +0.006 |
| mue.Hyperion_0.8 | 2 | 1070 | 0.115 | 0.124 | +0.009 |
| non.mega.NoName_0.0 | 2 | 1252 | 0.067 | 0.072 | +0.005 |
| ntc.Swim_0.9 | 2 | 3105 | 0.076 | 0.083 | +0.007 |
| robar.micro.Topaz_0.25 | 2 | 1756 | 0.109 | 0.089 | -0.021 |
| sgp.ShiningBeetle_1.1 | 2 | 1326 | 0.060 | 0.061 | +0.001 |
| sheldor.micro.Continuation_1.1 | 2 | 4677 | 0.102 | 0.100 | -0.002 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 2842 | 0.054 | 0.055 | +0.001 |
| stelo.MatchupMini_1.1 | 2 | 2721 | 0.090 | 0.085 | -0.005 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3715 | 0.105 | 0.109 | +0.004 |
| ultra.Defender_1.2 | 2 | 2349 | 0.084 | 0.079 | -0.005 |

mean diff +0.0007 +- 0.0032 (95%), fewer hits on 12 of 28 opponents

## Per opponent: real hit share, ho minus c (seeds both fought)

| opponent | seeds | waves | c | ho | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 13099 | 0.110 | 0.113 | +0.002 |
| abc.Shadow_3.83c | 2 | 3897 | 0.092 | 0.093 | +0.001 |
| ags.Glacier_0.3.2 | 2 | 3405 | 0.103 | 0.107 | +0.004 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1295 | 0.019 | 0.017 | -0.002 |
| bvh.mini.Wodan_0.50 | 2 | 1698 | 0.077 | 0.089 | +0.012 |
| catcat20.helios.Helios_1.5 | 2 | 3813 | 0.090 | 0.071 | -0.019 |
| cw.megas.Gridd_0.4 | 2 | 1744 | 0.087 | 0.080 | -0.007 |
| cx.BlestPain_1.41 | 2 | 2087 | 0.072 | 0.061 | -0.011 |
| demetrix.ForceMajeure_0.75 | 2 | 3661 | 0.103 | 0.094 | -0.009 |
| divineomega.PatrollerBot_1.0 | 2 | 1299 | 0.044 | 0.050 | +0.006 |
| dummy.micro.HummingBird_2.14 | 2 | 1230 | 0.066 | 0.065 | -0.000 |
| dz.OthoMini_0.15 | 2 | 1689 | 0.072 | 0.066 | -0.005 |
| gh.GresSuffurd_0.4.13 | 2 | 4334 | 0.087 | 0.093 | +0.006 |
| jgap.JGAP6139_1.0 | 2 | 1199 | 0.045 | 0.034 | -0.011 |
| kc.nano.Splinter_1.2 | 2 | 1631 | 0.053 | 0.064 | +0.011 |
| kvk.HebusLeTroll_0.41 | 2 | 1771 | 0.072 | 0.057 | -0.015 |
| lechu.Ala_0.0.4 | 2 | 2584 | 0.103 | 0.101 | -0.002 |
| mn.Combat_3.25.0 | 2 | 6786 | 0.086 | 0.093 | +0.008 |
| mue.Hyperion_0.8 | 2 | 1060 | 0.083 | 0.107 | +0.024 |
| non.mega.NoName_0.0 | 2 | 1238 | 0.064 | 0.072 | +0.008 |
| ntc.Swim_0.9 | 2 | 3038 | 0.063 | 0.075 | +0.012 |
| robar.micro.Topaz_0.25 | 2 | 1728 | 0.086 | 0.077 | -0.008 |
| sgp.ShiningBeetle_1.1 | 2 | 1310 | 0.056 | 0.055 | -0.001 |
| sheldor.micro.Continuation_1.1 | 2 | 4567 | 0.088 | 0.086 | -0.002 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 2818 | 0.048 | 0.051 | +0.003 |
| stelo.MatchupMini_1.1 | 2 | 2672 | 0.084 | 0.082 | -0.002 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3703 | 0.096 | 0.086 | -0.010 |
| ultra.Defender_1.2 | 2 | 2335 | 0.069 | 0.070 | +0.001 |

mean diff -0.0003 +- 0.0035 (95%), fewer hits on 15 of 28 opponents
