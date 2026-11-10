# AES by round: first ratings against the real bullet

arm c: records 86111, real 84693, matched 84590 of 104558 bullets
arm mm: records 86409, real 84714, matched 84620 of 104731 bullets

| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2320 | 0.103 | 0.091 | 0.100 | 0.003 | 0.463 | 0.456 | 0.460 | 0.624 | 0.600 |
| mm |  0- 0 | 2523 | 0.109 | 0.091 | 0.106 | 0.003 | 0.484 | 0.455 | 0.482 | 0.556 | 0.500 |
| c |  1- 2 | 4794 | 0.099 | 0.087 | 0.098 | 0.001 | 0.411 | 0.390 | 0.402 | 0.554 | 0.508 |
| mm |  1- 2 | 4857 | 0.099 | 0.089 | 0.097 | 0.003 | 0.423 | 0.417 | 0.417 | 0.568 | 0.528 |
| c |  3- 6 | 9859 | 0.100 | 0.084 | 0.098 | 0.002 | 0.422 | 0.407 | 0.415 | 0.515 | 0.477 |
| mm |  3- 6 | 9732 | 0.100 | 0.088 | 0.098 | 0.002 | 0.417 | 0.408 | 0.415 | 0.558 | 0.510 |
| c |  7-14 | 18649 | 0.098 | 0.083 | 0.096 | 0.002 | 0.435 | 0.427 | 0.427 | 0.561 | 0.513 |
| mm |  7-14 | 18965 | 0.100 | 0.087 | 0.097 | 0.003 | 0.434 | 0.441 | 0.425 | 0.569 | 0.536 |
| c | 15-34 | 48968 | 0.100 | 0.085 | 0.097 | 0.003 | 0.432 | 0.426 | 0.426 | 0.546 | 0.499 |
| mm | 15-34 | 48543 | 0.101 | 0.088 | 0.098 | 0.002 | 0.432 | 0.438 | 0.421 | 0.544 | 0.506 |

| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |
|---|---|---|---|---|---|---|---|---|
| c | 84590 | 0.100 | 0.085 | 0.097 | 0.431 | 0.423 | 0.548 | 0.503 |
| mm | 84620 | 0.101 | 0.088 | 0.098 | 0.432 | 0.435 | 0.553 | 0.515 |

## Per opponent: hit share of the chosen option at the first rating, mm minus c (seeds both fought)

| opponent | seeds | waves | c | mm | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12276 | 0.151 | 0.145 | -0.006 |
| abc.Shadow_3.83c | 2 | 3700 | 0.107 | 0.105 | -0.001 |
| ags.Glacier_0.3.2 | 2 | 3890 | 0.108 | 0.118 | +0.010 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1384 | 0.014 | 0.019 | +0.004 |
| bvh.mini.Wodan_0.50 | 2 | 1967 | 0.096 | 0.093 | -0.004 |
| catcat20.helios.Helios_1.5 | 2 | 2927 | 0.102 | 0.101 | -0.001 |
| cw.megas.Gridd_0.4 | 2 | 1713 | 0.083 | 0.094 | +0.011 |
| cx.BlestPain_1.41 | 2 | 2270 | 0.069 | 0.072 | +0.003 |
| demetrix.ForceMajeure_0.75 | 2 | 3274 | 0.108 | 0.108 | -0.000 |
| divineomega.PatrollerBot_1.0 | 2 | 1348 | 0.036 | 0.051 | +0.015 |
| dummy.micro.HummingBird_2.14 | 2 | 1211 | 0.074 | 0.059 | -0.015 |
| dz.OthoMini_0.15 | 2 | 1836 | 0.069 | 0.061 | -0.007 |
| gh.GresSuffurd_0.4.13 | 2 | 4572 | 0.116 | 0.123 | +0.008 |
| jgap.JGAP6139_1.0 | 2 | 1203 | 0.044 | 0.047 | +0.003 |
| kc.nano.Splinter_1.2 | 2 | 1634 | 0.067 | 0.066 | -0.001 |
| kvk.HebusLeTroll_0.41 | 2 | 1780 | 0.072 | 0.072 | -0.001 |
| lechu.Ala_0.0.4 | 2 | 2452 | 0.106 | 0.108 | +0.002 |
| mn.Combat_3.25.0 | 2 | 7432 | 0.115 | 0.110 | -0.004 |
| mue.Hyperion_0.8 | 2 | 1895 | 0.116 | 0.111 | -0.005 |
| non.mega.NoName_0.0 | 2 | 1322 | 0.073 | 0.065 | -0.009 |
| ntc.Swim_0.9 | 2 | 3305 | 0.080 | 0.095 | +0.015 |
| robar.micro.Topaz_0.25 | 2 | 1709 | 0.092 | 0.085 | -0.007 |
| sgp.ShiningBeetle_1.1 | 2 | 1320 | 0.055 | 0.086 | +0.030 |
| sheldor.micro.Continuation_1.1 | 2 | 4593 | 0.099 | 0.104 | +0.005 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 4344 | 0.058 | 0.057 | -0.001 |
| stelo.MatchupMini_1.1 | 2 | 2830 | 0.090 | 0.085 | -0.005 |
| suh.mega.WaveSurferPG_1.06 | 2 | 4129 | 0.105 | 0.109 | +0.004 |
| ultra.Defender_1.2 | 2 | 2274 | 0.091 | 0.075 | -0.016 |

mean diff +0.0010 +- 0.0036 (95%), fewer hits on 16 of 28 opponents

## Per opponent: real hit share, mm minus c (seeds both fought)

| opponent | seeds | waves | c | mm | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 12037 | 0.112 | 0.118 | +0.006 |
| abc.Shadow_3.83c | 2 | 3646 | 0.089 | 0.098 | +0.008 |
| ags.Glacier_0.3.2 | 2 | 3843 | 0.093 | 0.102 | +0.010 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1370 | 0.020 | 0.020 | -0.000 |
| bvh.mini.Wodan_0.50 | 2 | 1927 | 0.077 | 0.090 | +0.013 |
| catcat20.helios.Helios_1.5 | 2 | 2906 | 0.080 | 0.083 | +0.003 |
| cw.megas.Gridd_0.4 | 2 | 1676 | 0.089 | 0.084 | -0.004 |
| cx.BlestPain_1.41 | 2 | 2248 | 0.065 | 0.062 | -0.004 |
| demetrix.ForceMajeure_0.75 | 2 | 3233 | 0.105 | 0.102 | -0.003 |
| divineomega.PatrollerBot_1.0 | 2 | 1340 | 0.049 | 0.049 | +0.000 |
| dummy.micro.HummingBird_2.14 | 2 | 1196 | 0.073 | 0.050 | -0.023 |
| dz.OthoMini_0.15 | 2 | 1812 | 0.071 | 0.065 | -0.006 |
| gh.GresSuffurd_0.4.13 | 2 | 4493 | 0.094 | 0.096 | +0.002 |
| jgap.JGAP6139_1.0 | 2 | 1186 | 0.041 | 0.047 | +0.005 |
| kc.nano.Splinter_1.2 | 2 | 1633 | 0.062 | 0.073 | +0.010 |
| kvk.HebusLeTroll_0.41 | 2 | 1760 | 0.070 | 0.067 | -0.003 |
| lechu.Ala_0.0.4 | 2 | 2442 | 0.103 | 0.099 | -0.003 |
| mn.Combat_3.25.0 | 2 | 7305 | 0.095 | 0.090 | -0.006 |
| mue.Hyperion_0.8 | 2 | 1871 | 0.098 | 0.095 | -0.003 |
| non.mega.NoName_0.0 | 2 | 1309 | 0.068 | 0.070 | +0.002 |
| ntc.Swim_0.9 | 2 | 3221 | 0.069 | 0.083 | +0.014 |
| robar.micro.Topaz_0.25 | 2 | 1677 | 0.083 | 0.091 | +0.008 |
| sgp.ShiningBeetle_1.1 | 2 | 1307 | 0.053 | 0.075 | +0.022 |
| sheldor.micro.Continuation_1.1 | 2 | 4478 | 0.089 | 0.092 | +0.003 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 4312 | 0.053 | 0.052 | -0.000 |
| stelo.MatchupMini_1.1 | 2 | 2760 | 0.079 | 0.080 | +0.001 |
| suh.mega.WaveSurferPG_1.06 | 2 | 4119 | 0.095 | 0.089 | -0.007 |
| ultra.Defender_1.2 | 2 | 2265 | 0.066 | 0.071 | +0.005 |

mean diff +0.0018 +- 0.0031 (95%), fewer hits on 12 of 28 opponents
