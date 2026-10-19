# pc-midrange read: the pressure gate never opened

Queue `hadur-bench/plans/pc-midrange.queue` (docs/plan-midrange.md stage 1), run on the PC
2026-10-19, reports in PR #210 (`docs/bench/local/2026-10-19_pc-midrange-*`). Each step pairs a
candidate against 3.13hjsw on the 149 random movers with guess-factor guns
(`hadur-bench/flat-gf-mid.txt`), 35 rounds x 8 seeds (1011-1018); the guard is the census top 50 at
4 seeds. "All pairs" is the paired score-share difference over every kept pair, 95% interval.

| Step | Candidate | All pairs (pp) | Trusted pairs | Dealt / taken per round (cand, base) | Class gate +2.0 |
|---|---|---|---|---|---|
| pw | 3.13hjswpw (POW-12 pressure power) | -0.0 ± 0.3 | -0.1 ± 0.4 | 44.6 / 24.7, 44.8 / 24.7 | no |
| f8 | 3.13hjswf8 (flattener 8%) | +0.5 ± 0.3 | +0.5 ± 0.4 | 44.7 / 24.2, 44.7 / 24.5 | no |
| pwf8 | both | +0.3 ± 0.3 | +0.1 ± 0.4 | 44.5 / 24.2, 44.9 / 24.5 | no |
| guard | pwf8 vs the top 50 | +0.0 ± 1.2 | +0.1 ± 1.5 | | passes (no worse than -0.5) |
| pd | 3.13hjswpd (power-down only) | -0.3 ± 0.3 | -0.3 ± 0.4 | 44.7 / 24.7, 44.8 / 24.5 | no |

## Why pw is exactly zero

The candidate's firing is the baseline's: damage dealt per round 44.6 against 44.8, full-power
shots 1478 against 1513, hit rates 15.2% against 15.2%. A rule that raises the base power from
1.95 to 2.5 and skips the power-down would move dealt per round by 20% or more if it fired. It did
not fire.

`PowerPolicy.pressure` reads the two 100-shot rolling windows and tests
`ours.center() - ours.margin() >= 0.12` and `theirs.center() + theirs.margin() <= 0.09`. Over 100
outcomes the Agresti-Coull margin is about 7 points on our side and 5 on theirs, so the gate needs a
window with at least 21 hits of 100 for us and at most 3 of 100 for them, at the same time:

| Our hits / 100 | centre - margin | Their hits / 100 | centre + margin |
|---|---|---|---|
| 15 (the class mean) | 0.092 | 7 (the class mean) | 0.141 |
| 18 | 0.117 | 4 | 0.103 |
| 21 | 0.141 | 3 | 0.089 |

The plan set the 12% and 9% thresholds from the per-battle central rates (15% and 7%) and kept
POW-2's margin form; POW-2 never fires on this class for the same reason (plan, "Findings"). The
plan's error, not the implementation's: the code does what the plan said.

So stage 1 has not tested its hypothesis (that firepower is the midrange lever); it has tested a
switch that was off. `pd` is the same dead gate, and its -0.3 ± 0.3 is the seed noise of a null
switch. The flattener at 8% is +0.5 ± 0.3, the third reading with this sign (cloud +0.58 ± 0.59,
PC hjf8 on the 400-bot screen +0.13 ± 0.16): real but a tenth of the class gate, about +0.06 APS on
the field. Not a lever on its own; it rides whatever passes next.

## Next: test the power itself, then a gate that opens

Two ablations on the 1v1 branch, both duel-only and off by default, queue `pc-midrange-2`:

- `pwall` (suffix pa): pressure power with no gate at all in a duel (base 2.5 beyond 150 px, no
  power-down, the lead regime still wins). Bounds the value of the power change on the 149: if
  this does not clear +2.0 points, no gate can, and firepower is not the midrange lever.
- `pwc` (suffix pz): the gate on the window centres, `ours.center() >= 0.12 && theirs.center() <=
  0.09`, each window holding at least 30 outcomes. Opens on about the class mean (15% against 7%)
  and closes against a gun that hits us 10% or more.

Both on the 149 at 8 fresh seeds (1041-1048) against 3.13hjsw, then the guard on `pwall`, the larger
change (queue `hadur-bench/plans/pc-midrange-2.queue`, built from du09qh 37e3f10b). Class
gate +2.0 points as before.
