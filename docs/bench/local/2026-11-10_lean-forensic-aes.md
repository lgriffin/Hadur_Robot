# AES by round: first ratings against the real bullet

arm c: records 84835, real 83070, matched 82959 of 102613 bullets
arm le: records 87749, real 83411, matched 83309 of 102730 bullets
arm nt: records 90162, real 87831, matched 87709 of 107943 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2182 | 0.103 | 0.094 | 0.100 | 0.003 | 0.436 | 0.421 | 0.440 | 0.599 | 0.565 |
| le |  0- 0 | 2335 | 0.125 | 0.103 | 0.119 | 0.006 | 0.453 | 0.431 | 0.455 | 0.667 | 0.567 |
| nt |  0- 0 | 2205 | 0.091 | 0.083 | 0.089 | 0.001 | 0.461 | 0.435 | 0.446 | 0.488 | 0.500 |
| c |  1- 2 | 4864 | 0.099 | 0.087 | 0.097 | 0.002 | 0.425 | 0.417 | 0.419 | 0.518 | 0.517 |
| le |  1- 2 | 4789 | 0.095 | 0.089 | 0.093 | 0.002 | 0.415 | 0.399 | 0.415 | 0.537 | 0.551 |
| nt |  1- 2 | 4917 | 0.100 | 0.083 | 0.098 | 0.003 | 0.419 | 0.409 | 0.420 | 0.508 | 0.503 |
| c |  3- 6 | 9418 | 0.100 | 0.082 | 0.098 | 0.002 | 0.429 | 0.428 | 0.426 | 0.567 | 0.489 |
| le |  3- 6 | 9048 | 0.094 | 0.088 | 0.091 | 0.003 | 0.440 | 0.422 | 0.440 | 0.540 | 0.545 |
| nt |  3- 6 | 9466 | 0.093 | 0.086 | 0.090 | 0.003 | 0.419 | 0.415 | 0.422 | 0.512 | 0.534 |
| c |  7-14 | 18910 | 0.097 | 0.080 | 0.094 | 0.002 | 0.425 | 0.413 | 0.416 | 0.557 | 0.506 |
| le |  7-14 | 18988 | 0.095 | 0.085 | 0.092 | 0.003 | 0.436 | 0.432 | 0.436 | 0.529 | 0.533 |
| nt |  7-14 | 21167 | 0.097 | 0.088 | 0.095 | 0.002 | 0.437 | 0.431 | 0.428 | 0.481 | 0.479 |
| c | 15-34 | 47585 | 0.100 | 0.085 | 0.097 | 0.003 | 0.435 | 0.435 | 0.425 | 0.549 | 0.499 |
| le | 15-34 | 48149 | 0.097 | 0.088 | 0.095 | 0.002 | 0.425 | 0.419 | 0.425 | 0.513 | 0.520 |
| nt | 15-34 | 49954 | 0.100 | 0.088 | 0.097 | 0.003 | 0.433 | 0.429 | 0.425 | 0.519 | 0.499 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 82959 | 0.099 | 0.084 | 0.097 | 0.432 | 0.428 | 0.552 | 0.503 |
| le | 83309 | 0.097 | 0.088 | 0.094 | 0.429 | 0.421 | 0.525 | 0.529 |
| nt | 87709 | 0.098 | 0.087 | 0.096 | 0.433 | 0.427 | 0.507 | 0.498 |

## Per opponent: hit share of the chosen option at the first rating, le minus c (seeds both fought)

| opponent | seeds | waves | c | le | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12651 | 0.147 | 0.147 | +0.000 |
| abc.Shadow_3.83c | 2 | 3641 | 0.105 | 0.097 | -0.007 |
| ags.Glacier_0.3.2 | 2 | 3585 | 0.119 | 0.108 | -0.011 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1319 | 0.016 | 0.013 | -0.003 |
| bvh.mini.Wodan_0.50 | 2 | 2063 | 0.091 | 0.081 | -0.010 |
| catcat20.helios.Helios_1.5 | 2 | 2721 | 0.090 | 0.094 | +0.004 |
| cw.megas.Gridd_0.4 | 2 | 1741 | 0.091 | 0.082 | -0.008 |
| cx.BlestPain_1.41 | 2 | 2199 | 0.069 | 0.078 | +0.010 |
| demetrix.ForceMajeure_0.75 | 2 | 3186 | 0.118 | 0.108 | -0.011 |
| divineomega.PatrollerBot_1.0 | 2 | 1292 | 0.050 | 0.051 | +0.001 |
| dummy.micro.HummingBird_2.14 | 2 | 1230 | 0.068 | 0.065 | -0.003 |
| dz.OthoMini_0.15 | 2 | 1774 | 0.060 | 0.078 | +0.018 |
| gh.GresSuffurd_0.4.13 | 2 | 4288 | 0.116 | 0.113 | -0.003 |
| jgap.JGAP6139_1.0 | 2 | 1167 | 0.043 | 0.041 | -0.002 |
| kc.nano.Splinter_1.2 | 2 | 1627 | 0.072 | 0.068 | -0.004 |
| kvk.HebusLeTroll_0.41 | 2 | 1721 | 0.085 | 0.057 | -0.028 |
| lechu.Ala_0.0.4 | 2 | 2617 | 0.109 | 0.107 | -0.001 |
| mn.Combat_3.25.0 | 2 | 7257 | 0.110 | 0.109 | -0.000 |
| mue.Hyperion_0.8 | 2 | 1913 | 0.135 | 0.108 | -0.026 |
| non.mega.NoName_0.0 | 2 | 1373 | 0.070 | 0.075 | +0.005 |
| ntc.Swim_0.9 | 2 | 3161 | 0.080 | 0.079 | -0.001 |
| robar.micro.Topaz_0.25 | 2 | 1730 | 0.089 | 0.089 | -0.001 |
| sgp.ShiningBeetle_1.1 | 2 | 1145 | 0.044 | 0.046 | +0.003 |
| sheldor.micro.Continuation_1.1 | 2 | 4667 | 0.096 | 0.099 | +0.003 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3876 | 0.060 | 0.045 | -0.015 |
| stelo.MatchupMini_1.1 | 2 | 2750 | 0.077 | 0.080 | +0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3527 | 0.104 | 0.099 | -0.005 |
| ultra.Defender_1.2 | 2 | 2738 | 0.077 | 0.070 | -0.007 |

mean diff -0.0036 +- 0.0035 (95%), fewer hits on 19 of 28 opponents

## Per opponent: real hit share, le minus c (seeds both fought)

| opponent | seeds | waves | c | le | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12403 | 0.115 | 0.116 | +0.001 |
| abc.Shadow_3.83c | 2 | 3581 | 0.096 | 0.095 | -0.001 |
| ags.Glacier_0.3.2 | 2 | 3545 | 0.099 | 0.099 | -0.000 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1306 | 0.014 | 0.017 | +0.003 |
| bvh.mini.Wodan_0.50 | 2 | 2016 | 0.087 | 0.077 | -0.010 |
| catcat20.helios.Helios_1.5 | 2 | 2697 | 0.083 | 0.082 | -0.001 |
| cw.megas.Gridd_0.4 | 2 | 1718 | 0.088 | 0.092 | +0.003 |
| cx.BlestPain_1.41 | 2 | 2170 | 0.066 | 0.078 | +0.012 |
| demetrix.ForceMajeure_0.75 | 2 | 3141 | 0.096 | 0.102 | +0.005 |
| divineomega.PatrollerBot_1.0 | 2 | 1274 | 0.034 | 0.054 | +0.020 |
| dummy.micro.HummingBird_2.14 | 2 | 1217 | 0.076 | 0.081 | +0.005 |
| dz.OthoMini_0.15 | 2 | 1745 | 0.057 | 0.078 | +0.021 |
| gh.GresSuffurd_0.4.13 | 2 | 4229 | 0.093 | 0.094 | +0.001 |
| jgap.JGAP6139_1.0 | 2 | 1146 | 0.046 | 0.037 | -0.010 |
| kc.nano.Splinter_1.2 | 2 | 1627 | 0.069 | 0.078 | +0.009 |
| kvk.HebusLeTroll_0.41 | 2 | 1700 | 0.062 | 0.064 | +0.002 |
| lechu.Ala_0.0.4 | 2 | 2601 | 0.100 | 0.104 | +0.004 |
| mn.Combat_3.25.0 | 2 | 7120 | 0.091 | 0.093 | +0.002 |
| mue.Hyperion_0.8 | 2 | 1889 | 0.097 | 0.105 | +0.008 |
| non.mega.NoName_0.0 | 2 | 1356 | 0.066 | 0.076 | +0.011 |
| ntc.Swim_0.9 | 2 | 3085 | 0.071 | 0.076 | +0.004 |
| robar.micro.Topaz_0.25 | 2 | 1709 | 0.078 | 0.076 | -0.002 |
| sgp.ShiningBeetle_1.1 | 2 | 1127 | 0.040 | 0.047 | +0.008 |
| sheldor.micro.Continuation_1.1 | 2 | 4541 | 0.085 | 0.094 | +0.009 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3850 | 0.049 | 0.047 | -0.002 |
| stelo.MatchupMini_1.1 | 2 | 2679 | 0.078 | 0.084 | +0.005 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3515 | 0.082 | 0.102 | +0.020 |
| ultra.Defender_1.2 | 2 | 2728 | 0.071 | 0.064 | -0.007 |

mean diff +0.0043 +- 0.0029 (95%), fewer hits on 8 of 28 opponents

## Per opponent: hit share of the chosen option at the first rating, nt minus c (seeds both fought)

| opponent | seeds | waves | c | nt | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12651 | 0.147 | 0.145 | -0.002 |
| abc.Shadow_3.83c | 2 | 3641 | 0.105 | 0.096 | -0.009 |
| ags.Glacier_0.3.2 | 2 | 3585 | 0.119 | 0.107 | -0.012 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1319 | 0.016 | 0.012 | -0.004 |
| bvh.mini.Wodan_0.50 | 2 | 2063 | 0.091 | 0.088 | -0.003 |
| catcat20.helios.Helios_1.5 | 2 | 2721 | 0.090 | 0.105 | +0.015 |
| cw.megas.Gridd_0.4 | 2 | 1741 | 0.091 | 0.092 | +0.001 |
| cx.BlestPain_1.41 | 2 | 2199 | 0.069 | 0.071 | +0.003 |
| demetrix.ForceMajeure_0.75 | 2 | 3186 | 0.118 | 0.099 | -0.019 |
| divineomega.PatrollerBot_1.0 | 2 | 1292 | 0.050 | 0.042 | -0.008 |
| dummy.micro.HummingBird_2.14 | 2 | 1230 | 0.068 | 0.075 | +0.007 |
| dz.OthoMini_0.15 | 2 | 1774 | 0.060 | 0.069 | +0.009 |
| gh.GresSuffurd_0.4.13 | 2 | 4288 | 0.116 | 0.111 | -0.005 |
| jgap.JGAP6139_1.0 | 2 | 1167 | 0.043 | 0.052 | +0.009 |
| kc.nano.Splinter_1.2 | 2 | 1627 | 0.072 | 0.051 | -0.021 |
| kvk.HebusLeTroll_0.41 | 2 | 1721 | 0.085 | 0.063 | -0.022 |
| lechu.Ala_0.0.4 | 2 | 2617 | 0.109 | 0.109 | +0.000 |
| mn.Combat_3.25.0 | 2 | 7257 | 0.110 | 0.119 | +0.010 |
| mue.Hyperion_0.8 | 2 | 1913 | 0.135 | 0.116 | -0.019 |
| non.mega.NoName_0.0 | 2 | 1373 | 0.070 | 0.075 | +0.006 |
| ntc.Swim_0.9 | 2 | 3161 | 0.080 | 0.068 | -0.012 |
| robar.micro.Topaz_0.25 | 2 | 1730 | 0.089 | 0.090 | +0.001 |
| sgp.ShiningBeetle_1.1 | 2 | 1145 | 0.044 | 0.052 | +0.008 |
| sheldor.micro.Continuation_1.1 | 2 | 4667 | 0.096 | 0.097 | +0.001 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3876 | 0.060 | 0.053 | -0.007 |
| stelo.MatchupMini_1.1 | 2 | 2750 | 0.077 | 0.083 | +0.007 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3527 | 0.104 | 0.099 | -0.005 |
| ultra.Defender_1.2 | 2 | 2738 | 0.077 | 0.084 | +0.007 |

mean diff -0.0023 +- 0.0037 (95%), fewer hits on 14 of 28 opponents

## Per opponent: real hit share, nt minus c (seeds both fought)

| opponent | seeds | waves | c | nt | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12403 | 0.115 | 0.113 | -0.002 |
| abc.Shadow_3.83c | 2 | 3581 | 0.096 | 0.093 | -0.003 |
| ags.Glacier_0.3.2 | 2 | 3545 | 0.099 | 0.104 | +0.005 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1306 | 0.014 | 0.019 | +0.005 |
| bvh.mini.Wodan_0.50 | 2 | 2016 | 0.087 | 0.084 | -0.003 |
| catcat20.helios.Helios_1.5 | 2 | 2697 | 0.083 | 0.089 | +0.006 |
| cw.megas.Gridd_0.4 | 2 | 1718 | 0.088 | 0.082 | -0.006 |
| cx.BlestPain_1.41 | 2 | 2170 | 0.066 | 0.066 | +0.000 |
| demetrix.ForceMajeure_0.75 | 2 | 3141 | 0.096 | 0.098 | +0.001 |
| divineomega.PatrollerBot_1.0 | 2 | 1274 | 0.034 | 0.044 | +0.011 |
| dummy.micro.HummingBird_2.14 | 2 | 1217 | 0.076 | 0.074 | -0.002 |
| dz.OthoMini_0.15 | 2 | 1745 | 0.057 | 0.063 | +0.006 |
| gh.GresSuffurd_0.4.13 | 2 | 4229 | 0.093 | 0.085 | -0.008 |
| jgap.JGAP6139_1.0 | 2 | 1146 | 0.046 | 0.056 | +0.009 |
| kc.nano.Splinter_1.2 | 2 | 1627 | 0.069 | 0.063 | -0.006 |
| kvk.HebusLeTroll_0.41 | 2 | 1700 | 0.062 | 0.070 | +0.008 |
| lechu.Ala_0.0.4 | 2 | 2601 | 0.100 | 0.107 | +0.007 |
| mn.Combat_3.25.0 | 2 | 7120 | 0.091 | 0.103 | +0.012 |
| mue.Hyperion_0.8 | 2 | 1889 | 0.097 | 0.103 | +0.006 |
| non.mega.NoName_0.0 | 2 | 1356 | 0.066 | 0.066 | +0.000 |
| ntc.Swim_0.9 | 2 | 3085 | 0.071 | 0.067 | -0.004 |
| robar.micro.Topaz_0.25 | 2 | 1709 | 0.078 | 0.090 | +0.012 |
| sgp.ShiningBeetle_1.1 | 2 | 1127 | 0.040 | 0.057 | +0.017 |
| sheldor.micro.Continuation_1.1 | 2 | 4541 | 0.085 | 0.087 | +0.002 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3850 | 0.049 | 0.047 | -0.002 |
| stelo.MatchupMini_1.1 | 2 | 2679 | 0.078 | 0.078 | -0.001 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3515 | 0.082 | 0.090 | +0.008 |
| ultra.Defender_1.2 | 2 | 2728 | 0.071 | 0.082 | +0.011 |

mean diff +0.0032 +- 0.0024 (95%), fewer hits on 10 of 28 opponents
