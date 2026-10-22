# Stage 2 pooled (both halves): main effects by segment, in APS

Worked out from `hadur-bench/work/top5-s2-half1/arms.tsv` and `top5-s2-half2/arms.tsv` (1,212 census opponents, one battle each per arm),
with segments from `hadur-bench/plans/top5-segments.tsv`. For each opponent, a factor's effect is the mean score share of the 8
design points with it high minus the 8 with it low (c is the all-low point; aa, the A/A copy, is left out). Intervals are 95%
(1.96 SE across opponents). The whole-field column matches multiarm.py's pooled main effects to within 0.01.
APS contribution = segment effect x the segment's share of the census (the pooled panel is the whole census, so the five sum
to the whole-field effect).

Opponents 1212: A 87 (7.2%), B 719 (59.3%), C 88 (7.3%), D 294 (24.3%), E 24 (2.0%)

| Factor | Whole field | A | B | C | D | E |
|---|---:|---:|---:|---:|---:|---:|
| hj | +0.09 ± 0.10 | +1.39 ± 0.45 | +0.04 ± 0.08 | +0.35 ± 0.51 | -0.22 ± 0.25 | -0.05 ± 1.06 |
| sw | +0.19 ± 0.09 | -0.04 ± 0.19 | +0.22 ± 0.10 | +0.45 ± 0.47 | +0.13 ± 0.22 | -0.03 ± 0.66 |
| S | +0.05 ± 0.08 | +0.01 ± 0.20 | +0.01 ± 0.07 | +0.40 ± 0.54 | -0.01 ± 0.22 | +1.15 ± 1.02 |
| G | -0.04 ± 0.12 | -0.71 ± 0.28 | -0.10 ± 0.08 | +1.02 ± 0.68 | -0.17 ± 0.32 | +1.94 ± 1.84 |
| R | -0.09 ± 0.11 | -2.91 ± 0.95 | +0.13 ± 0.08 | +0.55 ± 0.50 | +0.01 ± 0.21 | +0.28 ± 1.09 |
| F | +0.11 ± 0.10 | +0.05 ± 0.24 | +0.12 ± 0.08 | +0.80 ± 0.51 | -0.04 ± 0.27 | -0.40 ± 1.83 |
| N | +0.04 ± 0.08 | -0.04 ± 0.23 | +0.09 ± 0.08 | -0.06 ± 0.42 | -0.02 ± 0.22 | +0.19 ± 1.00 |
| T | -0.02 ± 0.09 | +0.09 ± 0.23 | -0.00 ± 0.08 | -0.46 ± 0.50 | +0.05 ± 0.24 | -0.09 ± 0.72 |

APS contribution (segment effect x segment share of the census; the five sum to the whole-field effect):

| Factor | A | B | C | D | E | Sum |
|---|---:|---:|---:|---:|---:|---:|
| hj | +0.100 ± 0.032 | +0.024 ± 0.050 | +0.025 ± 0.037 | -0.055 ± 0.060 | -0.001 ± 0.021 | +0.094 |
| sw | -0.003 ± 0.014 | +0.131 ± 0.060 | +0.033 ± 0.034 | +0.033 ± 0.054 | -0.001 ± 0.013 | +0.193 |
| S | +0.001 ± 0.015 | +0.004 ± 0.044 | +0.029 ± 0.039 | -0.003 ± 0.053 | +0.023 ± 0.020 | +0.054 |
| G | -0.051 ± 0.020 | -0.060 ± 0.049 | +0.074 ± 0.050 | -0.041 ± 0.078 | +0.038 ± 0.037 | -0.039 |
| R | -0.209 ± 0.069 | +0.076 ± 0.045 | +0.040 ± 0.036 | +0.001 ± 0.051 | +0.005 ± 0.021 | -0.087 |
| F | +0.003 ± 0.017 | +0.069 ± 0.047 | +0.058 ± 0.037 | -0.010 ± 0.064 | -0.008 ± 0.036 | +0.113 |
| N | -0.003 ± 0.016 | +0.051 ± 0.045 | -0.004 ± 0.031 | -0.004 ± 0.053 | +0.004 ± 0.020 | +0.044 |
| T | +0.007 ± 0.017 | -0.003 ± 0.047 | -0.033 ± 0.036 | +0.012 ± 0.059 | -0.002 ± 0.014 | -0.020 |
