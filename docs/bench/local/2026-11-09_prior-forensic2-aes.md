# AES by round: first ratings against the real bullet

arm c: records 86799, real 85591, matched 85504 of 106002 bullets
arm pe: records 86084, real 84017, matched 83930 of 103260 bullets

| arm | rounds | waves | hit chosen | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave |
|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2010 | 0.100 | 0.095 | 0.005 | 0.454 | 0.440 | 0.470 | 0.601 |
| pe |  0- 0 | 2228 | 0.114 | 0.110 | 0.004 | 0.475 | 0.449 | 0.475 | 0.606 |
| c |  1- 2 | 5080 | 0.096 | 0.094 | 0.002 | 0.445 | 0.422 | 0.442 | 0.474 |
| pe |  1- 2 | 5227 | 0.108 | 0.106 | 0.002 | 0.414 | 0.402 | 0.408 | 0.541 |
| c |  3- 6 | 10305 | 0.101 | 0.098 | 0.002 | 0.417 | 0.409 | 0.411 | 0.515 |
| pe |  3- 6 | 9734 | 0.097 | 0.095 | 0.002 | 0.426 | 0.412 | 0.421 | 0.529 |
| c |  7-14 | 19322 | 0.097 | 0.095 | 0.002 | 0.432 | 0.422 | 0.425 | 0.515 |
| pe |  7-14 | 19170 | 0.101 | 0.099 | 0.002 | 0.418 | 0.414 | 0.413 | 0.551 |
| c | 15-34 | 48787 | 0.102 | 0.100 | 0.002 | 0.433 | 0.428 | 0.425 | 0.535 |
| pe | 15-34 | 47571 | 0.101 | 0.098 | 0.003 | 0.433 | 0.428 | 0.427 | 0.558 |

| arm | waves | hit chosen | avoidable | blend ranks hit top | views-only top | dmg/wave |
|---|---|---|---|---|---|---|
| c | 85504 | 0.100 | 0.098 | 0.432 | 0.424 | 0.526 |
| pe | 83930 | 0.101 | 0.099 | 0.428 | 0.422 | 0.553 |

## Per opponent: hit share of the chosen option, pe minus c (seeds both fought)

| opponent | seeds | waves | c | pe | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 15291 | 0.145 | 0.149 | +0.004 |
| abc.Shadow_3.83c | 2 | 3902 | 0.111 | 0.107 | -0.004 |
| ags.Glacier_0.3.2 | 2 | 3521 | 0.121 | 0.109 | -0.012 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1298 | 0.014 | 0.012 | -0.002 |
| bvh.mini.Wodan_0.50 | 2 | 1989 | 0.080 | 0.096 | +0.016 |
| catcat20.helios.Helios_1.5 | 2 | 2549 | 0.093 | 0.103 | +0.010 |
| cw.megas.Gridd_0.4 | 2 | 1721 | 0.089 | 0.082 | -0.007 |
| cx.BlestPain_1.41 | 2 | 2107 | 0.077 | 0.079 | +0.002 |
| demetrix.ForceMajeure_0.75 | 2 | 2934 | 0.104 | 0.111 | +0.008 |
| divineomega.PatrollerBot_1.0 | 2 | 1193 | 0.041 | 0.048 | +0.007 |
| dummy.micro.HummingBird_2.14 | 2 | 1176 | 0.064 | 0.081 | +0.017 |
| dz.OthoMini_0.15 | 2 | 1835 | 0.065 | 0.075 | +0.009 |
| gh.GresSuffurd_0.4.13 | 2 | 5137 | 0.116 | 0.121 | +0.005 |
| jgap.JGAP6139_1.0 | 2 | 1136 | 0.051 | 0.038 | -0.013 |
| kc.nano.Splinter_1.2 | 2 | 1684 | 0.072 | 0.061 | -0.011 |
| kvk.HebusLeTroll_0.41 | 2 | 1733 | 0.059 | 0.070 | +0.011 |
| lechu.Ala_0.0.4 | 2 | 2725 | 0.111 | 0.100 | -0.011 |
| mn.Combat_3.25.0 | 2 | 6894 | 0.106 | 0.114 | +0.008 |
| mue.Hyperion_0.8 | 2 | 1672 | 0.132 | 0.120 | -0.012 |
| non.mega.NoName_0.0 | 2 | 1302 | 0.071 | 0.078 | +0.007 |
| ntc.Swim_0.9 | 2 | 3162 | 0.082 | 0.088 | +0.006 |
| robar.micro.Topaz_0.25 | 2 | 1813 | 0.091 | 0.090 | -0.001 |
| sgp.ShiningBeetle_1.1 | 2 | 1267 | 0.042 | 0.055 | +0.013 |
| sheldor.micro.Continuation_1.1 | 2 | 4619 | 0.105 | 0.100 | -0.005 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3427 | 0.048 | 0.043 | -0.005 |
| stelo.MatchupMini_1.1 | 2 | 2555 | 0.086 | 0.093 | +0.007 |
| suh.mega.WaveSurferPG_1.06 | 2 | 4218 | 0.103 | 0.112 | +0.009 |
| ultra.Defender_1.2 | 2 | 2644 | 0.087 | 0.084 | -0.003 |

mean diff +0.0019 +- 0.0033 (95%), fewer hits on 12 of 28 opponents
