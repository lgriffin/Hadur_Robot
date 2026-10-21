# pc-midrange-2 read: firepower is not the midrange lever

Queue `hadur-bench/plans/pc-midrange-2.queue`, run on the PC 2026-10-19, reports in PR #211
(`docs/bench/local/2026-10-19_pc-midrange2-*`). Same set and base as the first queue
(docs/bench/local/2026-10-19_pc-midrange-read.md): the 149 random movers with guess-factor guns,
35 rounds x 8 seeds (1041-1048), each candidate paired against 3.13hjsw; guard = census top 50 at
4 seeds. "All pairs" is the paired score-share difference over every kept pair, 95% interval.

| Step | Candidate | Score (pp) | Survival (pp) | Bullet-damage share (pp) | Trusted pairs |
|---|---|---|---|---|---|
| pa | 3.13hjswpa, POW-12 with no rate gate | **-2.2 ± 0.4** | -7.5 ± 0.5 | +2.5 ± 0.3 | -2.2 ± 0.4 |
| pz | 3.13hjswpz, POW-12 gated on the window centres | **-0.6 ± 0.3** | -1.7 ± 0.4 | +0.5 ± 0.3 | -0.5 ± 0.4 |
| guard | pa vs the top 50 | -2.3 ± 1.1 | -7.7 ± 1.7 | +2.8 ± 0.9 | -1.1 ± 1.5 |

Neither clears the class gate (+2.0); the ungated form fails the guard too (-0.5). The gated form
loses less only because it fires less (full-power shots 1320 against the base's 1493, round length
608 against 623: the gate is open part of the time).

## What the power change did, per round on the 149 (candidate, base)

| | pa | base |
|---|---|---|
| damage dealt / taken per round | 45.9 / 22.4 | 44.8 / 24.4 |
| our hit rate | 13.4% | 15.3% |
| round length (ticks) | 558 | 621 |
| rounds won of 280 | 227 | 248 |
| survival share | 81.1% | 88.7% |
| bullet-damage share | 66.8% | 64.3% |

Base power 2.5 with no power-down buys 2.5% more damage a round and costs 1.9 points of hit rate
(bullet speed 12.5 against 14.15, slower bullets are easier to dodge even for a random mover), 7.5
points of survival and 21 rounds in 280: we fire ourselves to death. The energy spent per shot
rises 28%, the damage per shot 28%, and the hit rate falls 12%, so the exchange is level on damage
and the energy drain decides the rounds we would otherwise have survived. Diamond's cubic power-down
is doing exactly what it is for.

So the hypothesis of stage 1 (the midrange class is lost on firepower: plan "Cause read") is
wrong. Hadur's 1.54 average power against the class is not a leak; the dealt-per-tick gap to
Diamond and ScalarR (5.7 against 6.1 and 7.3 per 100 ticks, plan table) has to be hits, not
power, and the taken gap (3.2 against 2.7 and 2.1) is the surf. Stage 1 closes with POW-12 off
in every form; the switches and ablations stay on the 1v1 branch for the record and can be removed.

## What is left for the midrange

- Stage 2 (plan): the surf's fidelity to Diamond on the 184 unlisted midrange bots. Taken per 100
  ticks is where Hadur trails every top bot (3.2 against 2.7, 2.8, 2.1), and the Road-to-top-3
  stage 0 found the same lever (surf option choice) on the top 50. Cloud work: a diff of the
  danger views, distancing and walk-in against Diamond 1.8.22, hit-rate normalisation first.
- Stage 3 (plan): the main gun's hit rate on random movers (15.2% here against the segmented
  offline gun's 13.2%), a measurement by distance band before any switch.
- The flattener at 8% (+0.5 ± 0.3 on the class, three readings with this sign) rides whichever
  passes next; alone it is +0.06 APS.
