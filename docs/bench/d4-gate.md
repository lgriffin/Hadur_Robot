# D4 gate: bullets are armour

The D4 build (`hadur2.Hadur 3.8.4`) against the D3 build (`hadur2.Hadur 3.8.3`), paired by
seed (BENCH-2): 20 battles against DrussGT 3.1.16, 35 rounds each, cold. Run on 6 October
2026 in the Claude Code container (4 cores, Java 21), one bench at a time. The raw report is
[d4-gate-report.md](d4-gate-report.md). The plan asks for 40 battles; this is 20.

**Verdict: the score half of the gate passes. D4's own measure moved in the right direction
but did not reach the plan's level: DrussGT hit 9.9% against 10.2%, where the plan looks for
a point lower. The top-10 and weak sets were measured for the whole stack instead
([stack-gate.md](stack-gate.md)), and the stack is ahead on the top 10.**

| Gate (docs/druss-route-plan.md, "What a pass means") | Result |
|---|---|
| Score not below the previous stage by more than the interval | **47.3% ± 2.6 against 46.1% ± 2.5, paired difference +1.2 ± 4.3 points** (20 pairs). Rounds won 330 of 700 against 321 |
| Own measure: DrussGT's hit rate about one point lower | **Partly met. 9.9% ± 0.2 against 10.2% ± 0.2**, 0.3 points lower |
| Our hit rate | 7.5% ± 0.2 against 7.2% ± 0.2 |
| Top 10 and weak set | Measured once for the D2 to D4 stack against D1: top 10 **+3.5 ± 3.2**, weak set **-0.1 ± 0.6** ([stack-gate.md](stack-gate.md)) |
| Faults | 0 |

## Reading

- Shadow-aware aim (MOVE-8, GUN-6) takes DrussGT's hit rate down by 0.3 points while our
  own rises by 0.3, so it does not trade hits for shadows. In the plan's model a point off
  DrussGT's rate is worth about 5 points of score; 0.3 points is worth about 1.5, which is
  what the +1.2 shows, inside its interval.
- Bullets shot down: 12.6% of ours against 12.5%. Intercepts in a computed shadow stay at
  100%, so the shadow geometry is unchanged.

## Cost

- **CPU.** Slow ticks (over 70% of the 3 ms allowance) rose from 2,822 to 27,900 and skipped
  turns from 564 to 616 over 700 rounds. Scoring every candidate angle against the published
  intervals is the cost. Turn p95 is 2.79 ms against 2.75 ms, and the TIME-1 shedding keeps
  skips near the D3 level. On the top-10 stack run skipped turns were level (746 against
  737 over 30 battles), so the rumble cost is small, but this is the first thing to watch
  on the live ladder.

## Caveats

- **The stage jars were built before D5 and T1 merged**, as for D3 ([d3-gate.md](d3-gate.md)).
- **Twenty battles, not forty.** The interval is ±4.3; the stack gate is what decided the
  merge.
