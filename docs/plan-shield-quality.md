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

## SHIELD-16 (`prior`, ablation `sprior`, suffix `sq`)

Adds the fifth base with Saguaro's origin. Off by default; not in `all`.

Probe, same seeds, shield on (3.15 vs 3.15 with SHIELD-16, built as 3.15sp before the suffix became `sq`; each against its own shield-off battles):

| Opponent | 3.15 shield on | SHIELD-16 shield on | Rounds in shield mode (of 105) |
|---|---:|---:|---|
| exauge.GateKeeper 1.1.121g | 76.8% | 96.7% | 6 to 105 |
| slugzilla.ButtHead 2.0 | 67.5% | 94.6% | 6 to 105 |
| oog.micro.SavantMicro 1.1 | 71.0% | 83.6% | 8 to 87 |
| rz.GlowBlow 2.31 | 80.2% | 76.8% | 48 to 33 |

Multi-arm run on the other 25 of the 28 off-list bots (arms `sa` = shield on every opponent, `sasp` (now `sasq`) =
the same with SHIELD-16; 3 seeds from 1900; 150 battles, none failed;
`docs/bench/local/2026-10-23_shield16-prior25-arms.tsv`): **sasp − sa = +11.7 ± 1.8 points a bot**;
19 of 25 gain 6 to 25 points, 6 are level within about 6 points (ChumbaMini, ThnikkaBot, both
LittleBlackBooks, Maui, Nemo, the last four of which already did well with the plain shield).
Against Hadur 3.15's live scores (normal mode) these 25 bots gain about +174 points, about
+0.14 APS, bench against live, before any table pick.

## Next

1. PC stage 1: SHIELD-16 on all 300 Saguaro shield bots (173 listed, 127 not), arms c, aa, sa,
   sasq, 4 seeds, to check it costs nothing on the listed bots before it joins the shield used to
   train the table.
2. A shipped per-opponent shield aim of our own, read from stage 1's records, and Saguaro's
   opening reposition.

## PC run order, night of 2026-10-23 (all 12 workers, one queue at a time)

| # | Card | Command on the PC (in `hadur-bench`) | Battles | Time | Opens |
|---|------|------|---------|------|-------|
| 1 | Stage 1 shield check | `.\queue.ps1 run pc-shield-s1` (running since 18:06 UTC) | 3,096 | ~1.2 h | `claude/pc-shield-s1-results` |
| 2 | Team stage 2 (team thread) | the team thread's card (its own PR) | team | ~2 h | its results PR |
| 3 | Stages 3 + 4: table v1 | `git checkout master; git pull; .\queue.ps1 run pc-table-v1` | ~19,500 | ~9-10 h | `claude/pc-table-v1-results` |

`pc-table-v1` (BENCH-99) chains, with no decision between steps: `panel` (census robots off the
shield list and outside Saguaro's 126, ~886) → `screen` (c, aa, sasq x 4 seeds, ~10,600 battles,
~4.5 h) → `pick` (lock sasq at +5 points, interval above 0) → `confirm` (the screen's and stage 1's
locked robots, 8 fresh seeds, ~1-1.5 h) → `final` (locked at +3 in the confirm and in a first pick)
→ `candidate` (t1 = 3.15 + SHIELD-16, the aim every final robot won with, + the final robots on the
shield list, `build-ablation.sh sprior,slistadd`; the census carries SHIELD-16's cost on the listed robots)
→ `census`
(census-312 x c, aa, t1 x 2 seeds, ~7,300 battles, ~3-4 h) → `gate` (+0.5 APS census-weighted, lower
end above +0.3, A/A inside its band, 95% of the census read; the verdict is written either way) → `pr`.

Watching it: `.\queue.ps1 status pc-table-v1`. A stop (`.\queue.ps1 stop pc-table-v1`) and a re-run
resume where they left off; no finished battle is fought again.

On PASS: t1 becomes 3.16's 1v1 (ShieldListData plus SHIELD-16 on), released after Leigh's call with
the live-noise warning (one pass is ±0.4 APS). On FAIL: the screen and confirm picks still stand as
the table's shield entries; the gap is read by band before any more PC hours. Stages 2 (shipped
per-opponent aim and opening reposition), 5 (simple-aim dodge) and 6 (stop-and-go) are builds still
to write; they get their own cards after this run.
