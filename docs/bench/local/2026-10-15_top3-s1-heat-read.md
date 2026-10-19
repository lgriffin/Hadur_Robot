# Top 3 stage 1: the gun-heat wave on the 400-bot screen

2026-10-15. 3.13 with MOVE-11 switched on (`bisect/hadur2.Hadur_3.13hw.jar`, the `heat` ablation;
the build also carries MOVE-9/10's HF records) on `hadur-bench/screen-311.txt`, seeds 201-202, cloud
(parallel 3, CPU constant 4138771). It pairs with `top3-s0-hf2` (3.13 plus HF, same seeds and
machine). Run report: `2026-10-15_top3-s1-heat.md`. Read with `export_battles.py` on both work dirs,
then `screen_paired.py --candidate 3.13hw --baseline 3.13`.

| Band | Opponents | Mean difference (95%) | APS it adds (95%) |
|---|---|---|---|
| 1 | 3 | -2.69 (-9.69 to +4.32) | -0.020 (-0.073 to +0.032) |
| 2 | 13 | -0.05 (-1.78 to +1.68) | -0.002 (-0.058 to +0.054) |
| 3 | 49 | -0.02 (-1.10 to +1.07) | -0.002 (-0.135 to +0.131) |
| 4 | 66 | +0.10 (-1.04 to +1.24) | +0.017 (-0.171 to +0.205) |
| 5 | 99 | +0.57 (-0.05 to +1.20) | +0.142 (-0.013 to +0.297) |
| 6 | 170 | +0.23 (-0.01 to +0.46) | +0.097 (-0.003 to +0.197) |
| All | 400 | | **+0.23 (-0.07 to +0.54)** |

Damage taken over all 400 fell from 12.25 to 11.87 a round; skipped turns 0.17 to 0.14 a round.
One battle pair dropped (a security denial).

## Verdict

Promising, not yet proven: the gain sits in bands 5 and 6 (ranks 401+), where the plan put most of
the movement gap, and the interval still crosses zero at 2 seeds. Next: the PC queue `top3-s1`
(8 fresh seeds, paired against 3.13 in the same run).

## A by-product: the dodge record

The heat build carries MOVE-10's fixed option flags (each wave's first options), so this run also
answers the option question. From the 302 unlisted robots, of 12.8 a round taken:

| Plan: on | off | none | Another option would have dodged | No option would have |
|---|---|---|---|---|
| 10.2 | 1.1 | 1.5 | **6.1** | 0.6 |

When the surf first rated the wave, the bullet was already in flight. For 6.1 of the 12.8 a round,
the option taken then would be hit and one of the two it passed over would have missed. Only 0.6 had no escape.
So most of the damage is a ranking failure among the three options, not a lack of reach: the danger
model rated the option that was hit as the cheapest. That is where the next levers aim (the masters'
sharper kernel and later flattener, replicator weights for the views, `docs/top3-movement-study.md`).
The rest (6.1 a round) carries no dodge reading: the first option taken would have missed
the bullet and a later change of mind walked into it, or the wave was never rated with the three
options.
