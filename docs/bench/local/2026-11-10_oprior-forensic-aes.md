# AES by round: first ratings against the real bullet

arm c: records 86360, real 84619, matched 84537 of 105243 bullets
arm op: records 82106, real 80395, matched 80336 of 100229 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2363 | 0.095 | 0.083 | 0.094 | 0.001 | 0.469 | 0.447 | 0.463 | 0.468 | 0.469 |
| op |  0- 0 | 2327 | 0.103 | 0.082 | 0.101 | 0.002 | 0.445 | 0.433 | 0.438 | 0.541 | 0.446 |
| c |  1- 2 | 4956 | 0.092 | 0.081 | 0.090 | 0.002 | 0.433 | 0.402 | 0.431 | 0.446 | 0.420 |
| op |  1- 2 | 4739 | 0.095 | 0.078 | 0.091 | 0.004 | 0.434 | 0.420 | 0.432 | 0.528 | 0.462 |
| c |  3- 6 | 9713 | 0.096 | 0.085 | 0.094 | 0.002 | 0.425 | 0.412 | 0.427 | 0.524 | 0.507 |
| op |  3- 6 | 10289 | 0.097 | 0.083 | 0.095 | 0.002 | 0.411 | 0.398 | 0.404 | 0.460 | 0.463 |
| c |  7-14 | 19243 | 0.099 | 0.087 | 0.097 | 0.003 | 0.419 | 0.411 | 0.409 | 0.565 | 0.515 |
| op |  7-14 | 18886 | 0.095 | 0.081 | 0.093 | 0.002 | 0.423 | 0.413 | 0.418 | 0.547 | 0.493 |
| c | 15-34 | 48262 | 0.098 | 0.084 | 0.095 | 0.003 | 0.437 | 0.434 | 0.427 | 0.534 | 0.488 |
| op | 15-34 | 44095 | 0.100 | 0.084 | 0.098 | 0.003 | 0.425 | 0.415 | 0.418 | 0.572 | 0.519 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 84537 | 0.097 | 0.084 | 0.095 | 0.432 | 0.425 | 0.533 | 0.492 |
| op | 80336 | 0.098 | 0.083 | 0.096 | 0.424 | 0.413 | 0.548 | 0.500 |

## Per opponent: hit share of the chosen option at the first rating, op minus c (seeds both fought)

| opponent | seeds | waves | c | op | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 13541 | 0.139 | 0.145 | +0.005 |
| abc.Shadow_3.83c | 2 | 3974 | 0.109 | 0.121 | +0.013 |
| ags.Glacier_0.3.2 | 2 | 3609 | 0.126 | 0.123 | -0.003 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1318 | 0.008 | 0.016 | +0.007 |
| bvh.mini.Wodan_0.50 | 2 | 2116 | 0.090 | 0.105 | +0.016 |
| catcat20.helios.Helios_1.5 | 2 | 2919 | 0.090 | 0.103 | +0.013 |
| cw.megas.Gridd_0.4 | 2 | 1875 | 0.077 | 0.091 | +0.013 |
| cx.BlestPain_1.41 | 2 | 2055 | 0.072 | 0.075 | +0.003 |
| demetrix.ForceMajeure_0.75 | 2 | 2742 | 0.109 | 0.100 | -0.009 |
| divineomega.PatrollerBot_1.0 | 2 | 1383 | 0.035 | 0.040 | +0.004 |
| dummy.micro.HummingBird_2.14 | 2 | 1298 | 0.074 | 0.060 | -0.013 |
| dz.OthoMini_0.15 | 2 | 1754 | 0.067 | 0.067 | -0.000 |
| gh.GresSuffurd_0.4.13 | 2 | 4870 | 0.111 | 0.114 | +0.003 |
| jgap.JGAP6139_1.0 | 2 | 1168 | 0.043 | 0.043 | +0.000 |
| kc.nano.Splinter_1.2 | 2 | 1509 | 0.070 | 0.048 | -0.021 |
| kvk.HebusLeTroll_0.41 | 2 | 1781 | 0.060 | 0.069 | +0.009 |
| lechu.Ala_0.0.4 | 2 | 2698 | 0.110 | 0.109 | -0.001 |
| mn.Combat_3.25.0 | 2 | 7363 | 0.113 | 0.118 | +0.005 |
| mue.Hyperion_0.8 | 2 | 1620 | 0.115 | 0.134 | +0.019 |
| non.mega.NoName_0.0 | 2 | 1451 | 0.068 | 0.060 | -0.008 |
| ntc.Swim_0.9 | 2 | 3373 | 0.068 | 0.063 | -0.005 |
| robar.micro.Topaz_0.25 | 2 | 1884 | 0.093 | 0.074 | -0.020 |
| sgp.ShiningBeetle_1.1 | 2 | 1127 | 0.060 | 0.055 | -0.006 |
| sheldor.micro.Continuation_1.1 | 2 | 4376 | 0.098 | 0.103 | +0.005 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3864 | 0.054 | 0.047 | -0.007 |
| stelo.MatchupMini_1.1 | 2 | 2818 | 0.095 | 0.079 | -0.016 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3225 | 0.100 | 0.124 | +0.024 |
| ultra.Defender_1.2 | 2 | 2826 | 0.084 | 0.082 | -0.002 |

mean diff +0.0010 +- 0.0042 (95%), fewer hits on 13 of 28 opponents

## Per opponent: real hit share, op minus c (seeds both fought)

| opponent | seeds | waves | c | op | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 13253 | 0.112 | 0.105 | -0.007 |
| abc.Shadow_3.83c | 2 | 3917 | 0.096 | 0.102 | +0.006 |
| ags.Glacier_0.3.2 | 2 | 3559 | 0.105 | 0.103 | -0.002 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1310 | 0.009 | 0.018 | +0.009 |
| bvh.mini.Wodan_0.50 | 2 | 2065 | 0.073 | 0.090 | +0.016 |
| catcat20.helios.Helios_1.5 | 2 | 2885 | 0.083 | 0.089 | +0.006 |
| cw.megas.Gridd_0.4 | 2 | 1850 | 0.082 | 0.077 | -0.005 |
| cx.BlestPain_1.41 | 2 | 2028 | 0.063 | 0.072 | +0.009 |
| demetrix.ForceMajeure_0.75 | 2 | 2726 | 0.097 | 0.091 | -0.006 |
| divineomega.PatrollerBot_1.0 | 2 | 1360 | 0.032 | 0.037 | +0.005 |
| dummy.micro.HummingBird_2.14 | 2 | 1282 | 0.073 | 0.056 | -0.016 |
| dz.OthoMini_0.15 | 2 | 1730 | 0.061 | 0.062 | +0.002 |
| gh.GresSuffurd_0.4.13 | 2 | 4799 | 0.089 | 0.099 | +0.010 |
| jgap.JGAP6139_1.0 | 2 | 1145 | 0.051 | 0.039 | -0.012 |
| kc.nano.Splinter_1.2 | 2 | 1509 | 0.061 | 0.045 | -0.016 |
| kvk.HebusLeTroll_0.41 | 2 | 1760 | 0.053 | 0.068 | +0.015 |
| lechu.Ala_0.0.4 | 2 | 2692 | 0.102 | 0.104 | +0.001 |
| mn.Combat_3.25.0 | 2 | 7238 | 0.092 | 0.094 | +0.003 |
| mue.Hyperion_0.8 | 2 | 1601 | 0.103 | 0.105 | +0.002 |
| non.mega.NoName_0.0 | 2 | 1435 | 0.064 | 0.053 | -0.011 |
| ntc.Swim_0.9 | 2 | 3312 | 0.066 | 0.052 | -0.014 |
| robar.micro.Topaz_0.25 | 2 | 1864 | 0.084 | 0.077 | -0.007 |
| sgp.ShiningBeetle_1.1 | 2 | 1108 | 0.059 | 0.051 | -0.007 |
| sheldor.micro.Continuation_1.1 | 2 | 4257 | 0.090 | 0.088 | -0.003 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3839 | 0.055 | 0.045 | -0.010 |
| stelo.MatchupMini_1.1 | 2 | 2749 | 0.080 | 0.078 | -0.002 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3216 | 0.090 | 0.102 | +0.012 |
| ultra.Defender_1.2 | 2 | 2811 | 0.071 | 0.060 | -0.011 |

mean diff -0.0012 +- 0.0035 (95%), fewer hits on 15 of 28 opponents
