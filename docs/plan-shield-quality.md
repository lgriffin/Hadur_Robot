# Shield quality: SHIELD-16, Saguaro's body-turn aim base (2026-10-23)

Stage 1 of the 1v1 per-opponent table plan (Claude Doc "Plan: the 1v1 per-opponent table",
https://claude.ai/artifact/JCvvLxWV5gjrzL5aCSPech; docs/plan-mode-table.md). Leigh chose "better
shield first" on 2026-10-23.

## Finding

Mode table M1 (PR #228) locked only 9 to 13 of the 126 bots Saguaro 1.0 shields and Hadur does not,
though Saguaro leads Hadur 3.15 by 9.6 points a bot there live (about +0.99 APS). Hadur's shield is
already a close port of Saguaro's `BulletShieldMode`: the same twelve aim predictors (four head-on
bases, each plain, plus a learned offset, plus a learned offset times lateral direction), the same
0.1 px step on the tick before firing, and the same intercept geometry (`ShieldGeometry.solve` and
Saguaro's `computePreciseShadow` are the same calculation).

A cloud shield probe (BENCH-11, 3.15, 3 seeds from 1900, 35 rounds) on the six widest gaps showed
two kinds of bot. On Cotillion (+26.8 points shield on against off) and Kakera (+15.4) the shield
works. On SavantMicro, GateKeeper, ButtHead and GlowBlow no predictor matched any enemy bullet
(`SB` records: `missed`, `predicted` 0), so the shield left within about two rounds on the SHIELD-11
damage budget.

Saguaro ships each opponent's best shield aim (9 bytes: option index and angle offset). For
SavantMicro (option 5), GateKeeper (9) and ButtHead (1) the option's base is index 1: head-on from
where the shooter stood on the tick BEFORE it fired, turned by its body turn on the firing tick.
Hadur's SHIELD-12 body-turn base starts from the firing point instead, so it misses a gun that turns
with the body while the robot moves. Saguaro uses this base for 30 of its shield bots, 28 of them
off Hadur's list (live gap +0.27 APS).

## SHIELD-16 (`prior`, ablation `sprior`, suffix `sp`)

Adds the fifth base with Saguaro's origin. Off by default; not in `all`.

Probe, same seeds, shield on (3.15 vs 3.15sp; each against its own shield-off battles):

| Opponent | 3.15 shield on | 3.15sp shield on | Rounds in shield mode (of 105) |
|---|---:|---:|---|
| exauge.GateKeeper 1.1.121g | 76.8% | 96.7% | 6 to 105 |
| slugzilla.ButtHead 2.0 | 67.5% | 94.6% | 6 to 105 |
| oog.micro.SavantMicro 1.1 | 71.0% | 83.6% | 8 to 87 |
| rz.GlowBlow 2.31 | 80.2% | 76.8% | 48 to 33 |

Multi-arm run on the other 25 of the 28 off-list bots (arms `sa` = shield on every opponent, `sasp` =
the same with SHIELD-16; 3 seeds from 1900; 150 battles, none failed;
`docs/bench/local/2026-10-23_shield16-prior25-arms.tsv`): **sasp − sa = +11.7 ± 1.8 points a bot**;
19 of 25 gain 6 to 25 points, 6 are level within about 6 points (ChumbaMini, ThnikkaBot, both
LittleBlackBooks, Maui, Nemo, the last four of which already did well with the plain shield).
Against Hadur 3.15's live scores (normal mode) these 25 bots gain about +174 points, about
+0.14 APS, bench against live, before any table pick.

## Next

1. PC stage 1: SHIELD-16 on all 300 Saguaro shield bots (173 listed, 127 not), arms c, aa, sa,
   sasp, 4 seeds, to check it costs nothing on the listed bots before it joins the shield used to
   train the table.
2. A shipped per-opponent shield aim of our own, read from stage 1's records, and Saguaro's
   opening reposition.
