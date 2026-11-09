# AES by round: first ratings against the real bullet

arm c: records 85772, real 83352, matched 83296 of 102758 bullets
arm pf: records 87919, real 85052, matched 84968 of 105624 bullets

| arm | rounds | waves | hit chosen | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave |
|---|---|---|---|---|---|---|---|---|---|
| c |  0- 0 | 2234 | 0.111 | 0.108 | 0.003 | 0.448 | 0.434 | 0.437 | 0.656 |
| pf |  0- 0 | 2179 | 0.095 | 0.091 | 0.004 | 0.501 | 0.490 | 0.503 | 0.520 |
| c |  1- 2 | 4498 | 0.100 | 0.096 | 0.003 | 0.420 | 0.401 | 0.412 | 0.612 |
| pf |  1- 2 | 4636 | 0.103 | 0.099 | 0.004 | 0.406 | 0.407 | 0.398 | 0.569 |
| c |  3- 6 | 9256 | 0.091 | 0.088 | 0.002 | 0.432 | 0.419 | 0.425 | 0.534 |
| pf |  3- 6 | 9440 | 0.097 | 0.094 | 0.002 | 0.425 | 0.436 | 0.412 | 0.542 |
| c |  7-14 | 19376 | 0.098 | 0.095 | 0.002 | 0.433 | 0.426 | 0.428 | 0.504 |
| pf |  7-14 | 19220 | 0.105 | 0.102 | 0.003 | 0.415 | 0.428 | 0.406 | 0.553 |
| c | 15-34 | 47932 | 0.101 | 0.099 | 0.002 | 0.428 | 0.425 | 0.420 | 0.547 |
| pf | 15-34 | 49493 | 0.108 | 0.105 | 0.003 | 0.421 | 0.453 | 0.409 | 0.550 |

| arm | waves | hit chosen | avoidable | blend ranks hit top | views-only top | dmg/wave |
|---|---|---|---|---|---|---|
| c | 83296 | 0.099 | 0.097 | 0.430 | 0.424 | 0.542 |
| pf | 84968 | 0.105 | 0.102 | 0.421 | 0.444 | 0.550 |

## Per opponent: hit share of the chosen option, pf minus c (seeds both fought)

| opponent | seeds | waves | c | pf | diff |
|---|---|---|---|---|---|
| aaa.r.ScalarR_0.005h.053_noshield | 2 | 13788 | 0.147 | 0.160 | +0.013 |
| abc.Shadow_3.83c | 2 | 3871 | 0.114 | 0.115 | +0.000 |
| ags.Glacier_0.3.2 | 2 | 3557 | 0.116 | 0.133 | +0.017 |
| ar.QuantumChromodynamics_1.2.1 | 2 | 1319 | 0.011 | 0.032 | +0.020 |
| bvh.mini.Wodan_0.50 | 2 | 2093 | 0.086 | 0.104 | +0.017 |
| catcat20.helios.Helios_1.5 | 2 | 3015 | 0.103 | 0.111 | +0.007 |
| cw.megas.Gridd_0.4 | 2 | 1865 | 0.078 | 0.073 | -0.005 |
| cx.BlestPain_1.41 | 2 | 2193 | 0.081 | 0.089 | +0.008 |
| demetrix.ForceMajeure_0.75 | 2 | 2597 | 0.099 | 0.099 | +0.000 |
| divineomega.PatrollerBot_1.0 | 2 | 1323 | 0.042 | 0.036 | -0.006 |
| dummy.micro.HummingBird_2.14 | 2 | 1179 | 0.060 | 0.073 | +0.012 |
| dz.OthoMini_0.15 | 2 | 1643 | 0.063 | 0.065 | +0.002 |
| gh.GresSuffurd_0.4.13 | 2 | 4602 | 0.114 | 0.125 | +0.011 |
| jgap.JGAP6139_1.0 | 2 | 1152 | 0.034 | 0.042 | +0.008 |
| kc.nano.Splinter_1.2 | 2 | 1618 | 0.067 | 0.071 | +0.004 |
| kvk.HebusLeTroll_0.41 | 2 | 1751 | 0.081 | 0.072 | -0.009 |
| lechu.Ala_0.0.4 | 2 | 2475 | 0.106 | 0.103 | -0.003 |
| mn.Combat_3.25.0 | 2 | 7567 | 0.112 | 0.121 | +0.009 |
| mue.Hyperion_0.8 | 2 | 1692 | 0.119 | 0.136 | +0.017 |
| non.mega.NoName_0.0 | 2 | 1276 | 0.070 | 0.063 | -0.007 |
| ntc.Swim_0.9 | 2 | 3260 | 0.075 | 0.083 | +0.008 |
| robar.micro.Topaz_0.25 | 2 | 1947 | 0.081 | 0.086 | +0.004 |
| sgp.ShiningBeetle_1.1 | 2 | 1280 | 0.052 | 0.043 | -0.009 |
| sheldor.micro.Continuation_1.1 | 2 | 3795 | 0.107 | 0.100 | -0.007 |
| sheldor.micro.PointInLineRRAL_1.0 | 2 | 3745 | 0.058 | 0.046 | -0.012 |
| stelo.MatchupMini_1.1 | 2 | 2806 | 0.082 | 0.079 | -0.003 |
| suh.mega.WaveSurferPG_1.06 | 2 | 3713 | 0.102 | 0.116 | +0.014 |
| ultra.Defender_1.2 | 2 | 2174 | 0.075 | 0.091 | +0.015 |

mean diff +0.0045 +- 0.0035 (95%), fewer hits on 9 of 28 opponents
