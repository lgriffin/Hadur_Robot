# Stage 2 pooled (both halves): main effects by segment, in APS

Worked out from `hadur-bench/work/top5-s2-half1/arms.tsv` and `top5-s2-half2/arms.tsv` (1,212 census opponents, one battle each per arm),
with segments from `hadur-bench/plans/top5-segments.tsv`. For each opponent, a factor's effect is the mean score share of the 8
design points with it high minus the 8 with it low (c is the all-low point; aa, the A/A copy, is left out). Intervals are 95%
(1.96 SE across opponents). The whole-field column matches multiarm.py's pooled main effects to within 0.01.
APS contribution = segment effect x the segment's share of the census (the pooled panel is the whole census, so the five sum
to the whole-field effect).

