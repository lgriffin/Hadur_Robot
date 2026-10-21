# pc-midrange-3 read: the six surf-audit switches, none a lever on its own

Queue `hadur-bench/plans/pc-midrange-3.queue` (docs/plan-midrange.md stage 2, audit
`2026-10-19_surf-audit-diamond.md`), run on the PC 2026-10-19, reports in PR #214
(`docs/bench/local/2026-10-19_pc-midrange3-*`). Each switch alone on the 149 random movers with
guess-factor guns, 35 rounds x 4 seeds (1061-1064), paired against 3.14hjsw (a duel identical to
3.13hjsw). "All pairs" is the paired score-share difference, 95% interval; survival and
bullet-damage shares from the paired-intervals table.

| Step | Switch | Kind | Score (pp) | Survival (pp) | Bullet damage (pp) | Trusted pairs |
|---|---|---|---|---|---|---|
| d6 | hold650, no DIST-1 walk-in | Hadur's own | +0.1 ± 0.5 | -0.0 ± 0.6 | +0.1 ± 0.4 | +0.1 ± 0.5 |
| df | dfac, distancing to the enemy's position | Diamond fidelity | -0.3 ± 0.5 | -0.2 ± 0.6 | -0.4 ± 0.4 | -0.2 ± 0.6 |
| bh | bhb, intercepted bullets logged | Diamond fidelity | -0.0 ± 0.5 | -0.5 ± 0.6 | +0.4 ± 0.4 | +0.0 ± 0.5 |
| hc | hitclr, danger caches cleared on a hit | Diamond fidelity | +0.4 ± 0.5 | +0.6 ± 0.6 | +0.3 ± 0.4 | +0.4 ± 0.5 |
| pk | pkern, point danger kernel | Hadur's own (MOVE-4 off) | +0.5 ± 0.5 | +0.7 ± 0.6 | +0.2 ± 0.4 | +0.2 ± 0.5 |
| w2 | keep2, second wave kept after a skip | Hadur's own (TIME-2 softened) | +0.4 ± 0.5 | +0.6 ± 0.6 | +0.2 ± 0.4 | +0.5 ± 0.5 |

## Verdict

- No switch comes near the +2.0 class gate; the largest is a quarter of it. The surf audit's
  differences are real but small: Hadur's port of Diamond's surf loses on this class by about
  as much with each of them switched as without.
- `d6` is the surprise: holding 650 px instead of walking in to 454 changes nothing (+0.1), so
  the distance is not where the class is lost, and DIST-1 stays as it is.
- `df` and `bh`, Diamond's own behaviour, do not help (one slightly negative, one zero), so the
  port's departures there cost nothing. They stay off.
- `hc`, `pk` and `w2` are each +0.4 to +0.5 with intervals of about -0.1 to +1.0: the same sign
  three times, and three different mechanisms (fresher ratings, a sharper kernel, two waves
  after a skip) that should add. Stacked they could be +1.0 to +1.5 points on the class
  (+0.12 to +0.18 APS on the field), still short of the gate but, with the 8% flattener's +0.5,
  a stack worth confirming once at 8 seeds rather than three times at 4.

## Next: one stacked confirm, queue `pc-midrange-4`

`hcpkw2` (3.14hjswhcpkw2) and `hcpkw2f8` (3.14hjswhcpkw2f8) on the 149 at 8 fresh seeds
(1071-1078) against 3.14hjsw, then the top-50 guard on `hcpkw2`. Keep rule: the stack goes to the
census if its mean is at least +1.0 with the interval above 0 and the guard is no worse than
-0.5; the census gate is the usual +0.3 APS over 3.14 with no band below -0.05. If the stack
reads under +1.0, stage 2 closes with the surf port confirmed as faithful enough, and the
midrange class's loss is not in the surf's details but in what Diamond's gun does that Hadur's
does not (stage 3: dealt 5.7 against 6.1 per 100 ticks with a higher hit rate, so Diamond's
shots are worth more per hit at the same power rule).
