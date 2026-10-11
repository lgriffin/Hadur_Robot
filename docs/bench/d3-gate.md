# D3 gate: light bullets get their own aim

The D3 build (`hadur2.Hadur 3.8.3`) against the D2 build (`hadur2.Hadur 3.8.2`), paired by
seed (BENCH-2): 20 battles against DrussGT 3.1.16, 35 rounds each, cold. Run on 6 October
2026 in the Claude Code container (4 cores, Java 21), one bench at a time. The raw report is
[d3-gate-report.md](d3-gate-report.md). The plan asks for 40 battles; this is 20.

**Verdict: the score half of the gate passes and the stage's own measure is not met. D3 did
not raise Hadur's light-bullet hit rate: 7.6% against 7.6% for D2, where the plan's level is
9.3%.**

| Gate (docs/druss-route-plan.md, "What a pass means") | Result |
|---|---|
| Score not below the previous stage by more than the interval | **45.8% ± 2.5 against 45.3% ± 2.7, paired difference +0.5 ± 4.2 points** (20 pairs). Level with D2, not below it. Rounds won 320 of 700 against 315 |
| Own measure: Hadur's light-bullet (power under 0.2) hit rate reaches the plan's level | **Not met. 7.63% ± 0.18 (D3) against 7.60% ± 0.13 (D2); paired difference +0.03 ± 0.21 points.** The plan's probe reached 9.3% ± 0.2 from a base of 7.9% |
| Top 10 and weak set | Not measured for D3 alone; they are measured once for the whole D2 to D4 stack (the stack gate), which is pending |
| Faults | 0 |

## Light-bullet hit rate

Computed from the `R` records in each battle's `hadur.log` (POW-11: the last twelve fields
are this round's shots and hits in the three power classes, ours then theirs). Counts are
summed over each battle's rounds, a rate is taken per battle, and the table gives the mean
over the 20 battles with a 95% t interval (19 degrees of freedom). The pooled column is hits
over shots across all 20 battles.

| Class | D3 (3.8.3) | D2 (3.8.2) | Pooled D3 / D2 |
|---|---|---|---|
| Ours, light (under 0.2) | **7.63% ± 0.18** | **7.60% ± 0.13** | 12,042 of 158,269 (7.61%) / 12,041 of 158,421 (7.60%) |
| Ours, 0.2 to 1.2 | 6.81% ± 1.18 | 5.64% ± 1.45 | 155 of 2,291 / 128 of 1,966 (few shots) |
| Ours, over 1.2 | 7.04% ± 0.37 | 6.88% ± 0.37 | 1,345 of 19,158 / 1,302 of 18,999 |
| Ours, all | 7.54% ± 0.17 | 7.50% ± 0.13 | |
| DrussGT, light | 10.25% ± 0.20 | 10.27% ± 0.21 | 16,615 of 162,209 / 16,635 of 161,947 |
| DrussGT, 0.2 to 1.2 | 9.31% ± 0.80 | 8.91% ± 0.87 | 417 of 4,600 / 381 of 4,334 |
| DrussGT, over 1.2 | 7.63% ± 0.46 | 7.38% ± 0.39 | 1,017 of 13,303 / 977 of 13,233 |

- Light bullets are 88% of Hadur's shots under both builds (about 7,900 per battle), so the
  class is well measured: the paired light-class difference is +0.03 ± 0.21 points.
- DrussGT's light bullets hit 10.25%, matching the plan's 10.2% for the lead-aware rule, and
  its rate did not move. The gap D3 was meant to close (7.6% against 10.2%) is unchanged.
- The plan's 7.9% base and 9.3% probe level are not directly comparable to these figures:
  they come from the 4 and 5 October probes with a different harness, and the bench's own
  7.6% for D2 is the like-for-like base. Even against the plan's 7.9% base, 7.63% is no
  rise.

## Reading

- D3's gun competes for light bullets only where the sampled gun rates highest beyond the
  margin of error (GUN-5). The probe fired it unconditionally. The result is what a gate that
  never selects the new gun would show, but the `R` records do not say how often the sampled
  gun was chosen, so this bench cannot separate "never chosen" from "chosen and no better".
  The stage's own rating has to be read from a run that logs the chosen gun per class.
- The score is level, as the probe's +0.7 ± 4.0 suggested it would be; the model's 3 points
  are neither confirmed nor ruled out by 20 battles (interval ±4.2).

## Caveats

- **Round coverage.** Some battles have 32 to 34 `R` records of 35 rounds (the report's
  per-round means share this); the counts above cover the rounds that wrote one.
- **The stage jars were built before D5 and T1 merged.** DrussGT is not on D5's shield list
  and T1 acts only on a team, so the D3 code benched is the code now on the branch for this
  opponent.
- **Host noise.** Skipped turns 399 against 464 and slow ticks 87,031 are host effects, not
  a D3 effect; the pairing cancels what both robots share.
- **Reported hit rates differ from the table above.** The report's "our hit rate" (7.1% and
  7.0%) is a per-round mean over all classes; the table is per-battle, per-bullet.
