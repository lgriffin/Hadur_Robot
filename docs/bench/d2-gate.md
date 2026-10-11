# D2 gate: shield openers caught, the last shot kept

The D2 build (`hadur2.Hadur 3.8.2`) against the D1 build (`hadur2.Hadur 3.8.1`), paired by
seed (BENCH-2): 20 battles against DrussGT 3.1.16, 35 rounds each, cold. Run on 6 October
2026 in the Claude Code container (4 cores, Java 21), one bench at a time. The raw report is
[d2-gate-report.md](d2-gate-report.md).

**Verdict: the DrussGT part of the gate passes; the top-10 and weak sets are not run here.**

| Gate (docs/druss-route-plan.md, "How a gate is run" and "What a pass means") | Result |
|---|---|
| DrussGT: score not below the previous stage by more than the interval | **47.6% ± 2.7 against 46.6% ± 2.6, paired difference +1.0 ± 3.8 points** (20 pairs). The difference is positive and its interval spans zero, so D2 is level with D1 and not below it. Rounds won 339 of 700 against 330 |
| Top 10 and weak set | Not measured for D2 alone. They are measured once for the whole D2 to D4 stack (the stack gate), which is pending |
| Faults | 0 |

D2 is two small rules, so level is the expected outcome: the plan says the gain from SHIELD-4
is "not yet established" and that D2 is not worth more than the interval. What the gate
rules out is a loss.

## Caveats

- **The stage jars were built on the D1 base**, before D5 (the shield list) and T1 (the team
  plan) merged. DrussGT is not on D5's shield list, so shield mode would not have run against
  it in any case, and T1 acts only on a team. The D2 code is unchanged by the rebase onto
  master, but the jar benched is not the one now on the branch.
- **Slow ticks and skipped turns are host noise, not a D2 effect.** Skipped turns 420 against
  404, slow ticks 19,446 against 51,948 and different `robocode.cpu.constant` values between
  this run and d1-gate.md all show the host's load differs from run to run; the pairing cancels
  what both robots share.

## Evidence for SHIELD-3 and SHIELD-4

The report has no column that records the shielder latch itself (it is a profile flag, and the
stored-profile table does not print it), and no counter for shots fired at a latched
shielder. Only indirect figures exist, and they do not show an effect:

| | D2 (3.8.2) | D1 (3.8.1) |
|---|---|---|
| Our shots shot down | 22,602 of 182,382 (12.4%) | 22,434 of 183,161 (12.2%) |
| Jittered shots (SHIELD-2) | 180,149 (98.8%) | 181,434 (99.1%) |
| Full-power (3.0) shots | 39 | 12 |
| Our hit rate | 7.2% ± 0.2 | 7.2% ± 0.2 |
| Their hit rate | 10.0% ± 0.4 | 10.1% ± 0.3 |

- DrussGT is not a still shielder, so SHIELD-3's trigger (an enemy that has not moved since the
  round began) is not expected to fire against it; nothing in the report says whether it did.
  The shot-down share and the jitter share are the same within noise, which fits a flag that
  stayed off.
- The 27 extra full-power shots could be SHIELD-4 or the END-3 and POW rules reacting to a
  different energy trajectory; the report cannot tell which. They are 0.02% of the shots.
- The positive paired difference therefore cannot be credited to SHIELD-3 or SHIELD-4 from
  this bench. Shield mode itself was gated separately (d5-gate.md).

## END-4 evidence

The last-shot rule shows up in the aggression table, where finish ticks (spent closing on a
weak enemy) rise from 21,673 to 25,897, ram ticks from 1,481 to 2,124 and the round length
from 3,037 to 3,049 ticks. Same-tick double deaths are not counted by the report, so the
effect END-4 was built for (13 of 350 baseline rounds, 4 under D1) is not measured here. The
engine check behind the rule is in [strategy-evolution.md](../strategy-evolution.md#d2).
