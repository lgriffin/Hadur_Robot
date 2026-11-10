# AES by round: first ratings against the real bullet

arm c: records 89492, real 87072, matched 86966 of 107186 bullets
arm kn: records 86793, real 85528, matched 85415 of 105338 bullets
arm kw: records 87542, real 84570, matched 84478 of 104781 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2380 | 0.111 | 0.091 | 0.109 | 0.002 | 0.453 | 0.457 | 0.456 | 0.619 | 0.514 |
| kn |  0- 0 | 2326 | 0.096 | 0.089 | 0.092 | 0.004 | 0.480 | 0.470 | 0.475 | 0.516 | 0.488 |
| kw |  0- 0 | 2277 | 0.097 | 0.092 | 0.094 | 0.003 | 0.472 | 0.454 | 0.473 | 0.518 | 0.517 |
| c |  1- 2 | 4359 | 0.097 | 0.089 | 0.092 | 0.006 | 0.424 | 0.412 | 0.426 | 0.561 | 0.558 |
| kn |  1- 2 | 4897 | 0.101 | 0.091 | 0.099 | 0.003 | 0.400 | 0.394 | 0.402 | 0.570 | 0.527 |
| kw |  1- 2 | 4453 | 0.097 | 0.090 | 0.094 | 0.002 | 0.422 | 0.429 | 0.408 | 0.576 | 0.567 |
| c |  3- 6 | 9680 | 0.102 | 0.086 | 0.099 | 0.002 | 0.413 | 0.407 | 0.412 | 0.540 | 0.511 |
| kn |  3- 6 | 9286 | 0.094 | 0.080 | 0.092 | 0.002 | 0.429 | 0.417 | 0.420 | 0.551 | 0.480 |
| kw |  3- 6 | 9211 | 0.093 | 0.084 | 0.092 | 0.002 | 0.443 | 0.430 | 0.428 | 0.506 | 0.486 |
| c |  7-14 | 20874 | 0.105 | 0.087 | 0.102 | 0.003 | 0.419 | 0.409 | 0.408 | 0.541 | 0.477 |
| kn |  7-14 | 19995 | 0.099 | 0.086 | 0.097 | 0.002 | 0.436 | 0.427 | 0.430 | 0.519 | 0.496 |
| kw |  7-14 | 20052 | 0.101 | 0.084 | 0.098 | 0.003 | 0.426 | 0.428 | 0.414 | 0.522 | 0.470 |
| c | 15-34 | 49673 | 0.103 | 0.086 | 0.101 | 0.002 | 0.428 | 0.422 | 0.418 | 0.530 | 0.479 |
| kn | 15-34 | 48911 | 0.102 | 0.088 | 0.100 | 0.002 | 0.431 | 0.424 | 0.426 | 0.542 | 0.515 |
| kw | 15-34 | 48485 | 0.105 | 0.089 | 0.102 | 0.003 | 0.423 | 0.420 | 0.411 | 0.566 | 0.507 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 86966 | 0.103 | 0.086 | 0.101 | 0.425 | 0.418 | 0.538 | 0.487 |
| kn | 85415 | 0.101 | 0.087 | 0.098 | 0.432 | 0.424 | 0.539 | 0.507 |
| kw | 84478 | 0.102 | 0.087 | 0.100 | 0.427 | 0.424 | 0.548 | 0.499 |

## Per opponent: hit share of the chosen option at the first rating, kn minus c (seeds both fought)

| opponent | seeds | waves | c | kn | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 16797 | 0.142 | 0.136 | -0.006 |
| abc.Shadow_3.83c | 2 | 3687 | 0.104 | 0.106 | +0.002 |
| ags.Glacier_0.3.2 | 2 | 3980 | 0.119 | 0.114 | -0.005 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1242 | 0.011 | 0.020 | +0.008 |
| bvh.mini.Wodan_0.50 | 2 | 1971 | 0.093 | 0.090 | -0.003 |
| catcat20.helios.Helios_1.5 | 2 | 2966 | 0.102 | 0.107 | +0.005 |
| cw.megas.Gridd_0.4 | 2 | 1812 | 0.104 | 0.091 | -0.013 |
| cx.BlestPain_1.41 | 2 | 2127 | 0.076 | 0.070 | -0.005 |
| demetrix.ForceMajeure_0.75 | 2 | 2958 | 0.114 | 0.108 | -0.006 |
| divineomega.PatrollerBot_1.0 | 2 | 1268 | 0.047 | 0.056 | +0.009 |
| dummy.micro.HummingBird_2.14 | 2 | 1233 | 0.068 | 0.072 | +0.004 |
| dz.OthoMini_0.15 | 2 | 1666 | 0.070 | 0.084 | +0.014 |
| gh.GresSuffurd_0.4.13 | 2 | 4843 | 0.113 | 0.119 | +0.006 |
| jgap.JGAP6139_1.0 | 2 | 1103 | 0.043 | 0.036 | -0.007 |
| kc.nano.Splinter_1.2 | 2 | 1623 | 0.064 | 0.074 | +0.010 |
| kvk.HebusLeTroll_0.41 | 2 | 1761 | 0.073 | 0.063 | -0.010 |
| lechu.Ala_0.0.4 | 2 | 2847 | 0.105 | 0.114 | +0.009 |
| mn.Combat_3.25.0 | 2 | 6679 | 0.115 | 0.101 | -0.014 |
| mue.Hyperion_0.8 | 2 | 1964 | 0.130 | 0.123 | -0.007 |
| non.mega.NoName_0.0 | 2 | 1342 | 0.071 | 0.069 | -0.001 |
| ntc.Swim_0.9 | 2 | 2975 | 0.089 | 0.091 | +0.002 |
| robar.micro.Topaz_0.25 | 2 | 1843 | 0.084 | 0.092 | +0.008 |
| sgp.ShiningBeetle_1.1 | 2 | 1273 | 0.056 | 0.058 | +0.002 |
| sheldor.micro.Continuation_1.1 | 2 | 4676 | 0.109 | 0.110 | +0.001 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 4012 | 0.055 | 0.050 | -0.004 |
| stelo.MatchupMini_1.1 | 2 | 2869 | 0.090 | 0.094 | +0.004 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3497 | 0.106 | 0.104 | -0.002 |
| ultra.Defender_1.2 | 2 | 1952 | 0.101 | 0.093 | -0.008 |

mean diff -0.0003 +- 0.0027 (95%), fewer hits on 14 of 28 opponents

## Per opponent: real hit share, kn minus c (seeds both fought)

| opponent | seeds | waves | c | kn | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 16449 | 0.109 | 0.106 | -0.003 |
| abc.Shadow_3.83c | 2 | 3627 | 0.098 | 0.092 | -0.006 |
| ags.Glacier_0.3.2 | 2 | 3938 | 0.092 | 0.098 | +0.006 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1233 | 0.015 | 0.021 | +0.006 |
| bvh.mini.Wodan_0.50 | 2 | 1938 | 0.083 | 0.087 | +0.005 |
| catcat20.helios.Helios_1.5 | 2 | 2948 | 0.084 | 0.088 | +0.004 |
| cw.megas.Gridd_0.4 | 2 | 1769 | 0.098 | 0.095 | -0.003 |
| cx.BlestPain_1.41 | 2 | 2091 | 0.067 | 0.065 | -0.003 |
| demetrix.ForceMajeure_0.75 | 2 | 2920 | 0.098 | 0.101 | +0.002 |
| divineomega.PatrollerBot_1.0 | 2 | 1251 | 0.043 | 0.048 | +0.005 |
| dummy.micro.HummingBird_2.14 | 2 | 1219 | 0.075 | 0.072 | -0.003 |
| dz.OthoMini_0.15 | 2 | 1642 | 0.062 | 0.075 | +0.013 |
| gh.GresSuffurd_0.4.13 | 2 | 4772 | 0.089 | 0.096 | +0.007 |
| jgap.JGAP6139_1.0 | 2 | 1090 | 0.038 | 0.038 | +0.001 |
| kc.nano.Splinter_1.2 | 2 | 1622 | 0.063 | 0.068 | +0.005 |
| kvk.HebusLeTroll_0.41 | 2 | 1741 | 0.066 | 0.066 | +0.000 |
| lechu.Ala_0.0.4 | 2 | 2837 | 0.099 | 0.105 | +0.006 |
| mn.Combat_3.25.0 | 2 | 6565 | 0.088 | 0.088 | -0.001 |
| mue.Hyperion_0.8 | 2 | 1927 | 0.099 | 0.106 | +0.007 |
| non.mega.NoName_0.0 | 2 | 1319 | 0.058 | 0.067 | +0.009 |
| ntc.Swim_0.9 | 2 | 2924 | 0.074 | 0.074 | +0.001 |
| robar.micro.Topaz_0.25 | 2 | 1820 | 0.081 | 0.090 | +0.009 |
| sgp.ShiningBeetle_1.1 | 2 | 1261 | 0.059 | 0.056 | -0.003 |
| sheldor.micro.Continuation_1.1 | 2 | 4552 | 0.092 | 0.093 | +0.002 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3978 | 0.053 | 0.048 | -0.005 |
| stelo.MatchupMini_1.1 | 2 | 2812 | 0.087 | 0.084 | -0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3487 | 0.098 | 0.102 | +0.004 |
| ultra.Defender_1.2 | 2 | 1947 | 0.079 | 0.085 | +0.006 |

mean diff +0.0024 +- 0.0018 (95%), fewer hits on 9 of 28 opponents

## Per opponent: hit share of the chosen option at the first rating, kw minus c (seeds both fought)

| opponent | seeds | waves | c | kw | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 16797 | 0.142 | 0.147 | +0.005 |
| abc.Shadow_3.83c | 2 | 3687 | 0.104 | 0.107 | +0.003 |
| ags.Glacier_0.3.2 | 2 | 3980 | 0.119 | 0.111 | -0.008 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1242 | 0.011 | 0.009 | -0.002 |
| bvh.mini.Wodan_0.50 | 2 | 1971 | 0.093 | 0.088 | -0.005 |
| catcat20.helios.Helios_1.5 | 2 | 2966 | 0.102 | 0.114 | +0.011 |
| cw.megas.Gridd_0.4 | 2 | 1812 | 0.104 | 0.093 | -0.011 |
| cx.BlestPain_1.41 | 2 | 2127 | 0.076 | 0.077 | +0.001 |
| demetrix.ForceMajeure_0.75 | 2 | 2958 | 0.114 | 0.098 | -0.016 |
| divineomega.PatrollerBot_1.0 | 2 | 1268 | 0.047 | 0.034 | -0.013 |
| dummy.micro.HummingBird_2.14 | 2 | 1233 | 0.068 | 0.067 | -0.001 |
| dz.OthoMini_0.15 | 2 | 1666 | 0.070 | 0.073 | +0.003 |
| gh.GresSuffurd_0.4.13 | 2 | 4843 | 0.113 | 0.119 | +0.007 |
| jgap.JGAP6139_1.0 | 2 | 1103 | 0.043 | 0.052 | +0.009 |
| kc.nano.Splinter_1.2 | 2 | 1623 | 0.064 | 0.064 | -0.000 |
| kvk.HebusLeTroll_0.41 | 2 | 1761 | 0.073 | 0.071 | -0.002 |
| lechu.Ala_0.0.4 | 2 | 2847 | 0.105 | 0.114 | +0.009 |
| mn.Combat_3.25.0 | 2 | 6679 | 0.115 | 0.114 | -0.001 |
| mue.Hyperion_0.8 | 2 | 1964 | 0.130 | 0.131 | +0.001 |
| non.mega.NoName_0.0 | 2 | 1342 | 0.071 | 0.087 | +0.016 |
| ntc.Swim_0.9 | 2 | 2975 | 0.089 | 0.081 | -0.008 |
| robar.micro.Topaz_0.25 | 2 | 1843 | 0.084 | 0.104 | +0.020 |
| sgp.ShiningBeetle_1.1 | 2 | 1273 | 0.056 | 0.050 | -0.006 |
| sheldor.micro.Continuation_1.1 | 2 | 4676 | 0.109 | 0.097 | -0.013 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 4012 | 0.055 | 0.051 | -0.003 |
| stelo.MatchupMini_1.1 | 2 | 2869 | 0.090 | 0.087 | -0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3497 | 0.106 | 0.110 | +0.004 |
| ultra.Defender_1.2 | 2 | 1952 | 0.101 | 0.087 | -0.014 |

mean diff -0.0007 +- 0.0033 (95%), fewer hits on 16 of 28 opponents

## Per opponent: real hit share, kw minus c (seeds both fought)

| opponent | seeds | waves | c | kw | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 16449 | 0.109 | 0.116 | +0.007 |
| abc.Shadow_3.83c | 2 | 3627 | 0.098 | 0.092 | -0.005 |
| ags.Glacier_0.3.2 | 2 | 3938 | 0.092 | 0.101 | +0.008 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1233 | 0.015 | 0.010 | -0.005 |
| bvh.mini.Wodan_0.50 | 2 | 1938 | 0.083 | 0.090 | +0.008 |
| catcat20.helios.Helios_1.5 | 2 | 2948 | 0.084 | 0.095 | +0.011 |
| cw.megas.Gridd_0.4 | 2 | 1769 | 0.098 | 0.094 | -0.003 |
| cx.BlestPain_1.41 | 2 | 2091 | 0.067 | 0.062 | -0.006 |
| demetrix.ForceMajeure_0.75 | 2 | 2920 | 0.098 | 0.098 | -0.001 |
| divineomega.PatrollerBot_1.0 | 2 | 1251 | 0.043 | 0.037 | -0.006 |
| dummy.micro.HummingBird_2.14 | 2 | 1219 | 0.075 | 0.057 | -0.018 |
| dz.OthoMini_0.15 | 2 | 1642 | 0.062 | 0.064 | +0.002 |
| gh.GresSuffurd_0.4.13 | 2 | 4772 | 0.089 | 0.094 | +0.005 |
| jgap.JGAP6139_1.0 | 2 | 1090 | 0.038 | 0.045 | +0.008 |
| kc.nano.Splinter_1.2 | 2 | 1622 | 0.063 | 0.059 | -0.004 |
| kvk.HebusLeTroll_0.41 | 2 | 1741 | 0.066 | 0.069 | +0.003 |
| lechu.Ala_0.0.4 | 2 | 2837 | 0.099 | 0.102 | +0.003 |
| mn.Combat_3.25.0 | 2 | 6565 | 0.088 | 0.096 | +0.008 |
| mue.Hyperion_0.8 | 2 | 1927 | 0.099 | 0.103 | +0.003 |
| non.mega.NoName_0.0 | 2 | 1319 | 0.058 | 0.067 | +0.009 |
| ntc.Swim_0.9 | 2 | 2924 | 0.074 | 0.073 | -0.001 |
| robar.micro.Topaz_0.25 | 2 | 1820 | 0.081 | 0.088 | +0.007 |
| sgp.ShiningBeetle_1.1 | 2 | 1261 | 0.059 | 0.059 | +0.001 |
| sheldor.micro.Continuation_1.1 | 2 | 4552 | 0.092 | 0.084 | -0.008 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3978 | 0.053 | 0.048 | -0.005 |
| stelo.MatchupMini_1.1 | 2 | 2812 | 0.087 | 0.078 | -0.009 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3487 | 0.098 | 0.092 | -0.006 |
| ultra.Defender_1.2 | 2 | 1947 | 0.079 | 0.073 | -0.006 |

mean diff -0.0000 +- 0.0026 (95%), fewer hits on 14 of 28 opponents
