# 1v1: a shield that follows a moving aim (SHIELD-24, 2026-11-07)

## Why

The shield audit of 2026-11-07 (project folder, `hadur/1v1/shield-audit-2026-11-07.md`) compared BeepBoop 2.0's
shield list (297 names, from the source in its jar) with ours (281). Every robot on its list that is in the rumble
was measured with our shield forced on in pc-shield-still (PR #510); 58 are shielded by BeepBoop and not by us, and
on the 14 of them where BeepBoop leads by 5 points or more our shield lost with the shield on. A cloud read of the
seven biggest (seed 9801, 35 rounds, shield forced on with the still plan, `sstill,slistadd`) with the `SB` and `SR`
records on:

| Robot | master | shield on | What the records say |
|---|---:|---:|---|
| cx.Princess 1.0 | 82.0 | 62.1 | rounds 0-2 all 44 bullets intercepted; round 3 Princess's learned aim moves, 4 hits a round with no predictor exact; the 150-damage battle exit ends the mode in round 5 and the surf plays the other 30 rounds |
| pez.rumble.CassiusClay 2rho.02no | 69.3 | 60.8 | shield on all battle; 97% of its 0.1-power bullets intercepted; 7 a round were predicted exactly yet never shot at; a 0.1-power war is an energy race and the leak loses it |
| axeBots.Musashi 2.18 | 78.1 | 98.1 | shield holds, 4 hits in 35 rounds |
| rz.GlowBlow 2.31 | 72.5 | 79.5 | |
| cx.mini.BlackSwans 0.60 | 74.7 | 67.1 | |
| cx.CigaretBH 1.03 | 82.3 | 74.6 | |
| stelo.MatchupMicro 1.2 | 87.0 | 69.8 | |

Two more arms against Princess and CassiusClay on the same seed: the step-aside plan without still (`slistadd`, mt)
and the same with no damage exit (`slistadd,sdmgoff`, s0):

| Robot | master | mt | s0 |
|---|---:|---:|---:|
| Princess | 81.1 | 71.3 | 86.2 |
| CassiusClay | 59.1 | - | 60.6 |

Allowed to stay, the shield re-learns Princess's moved aim and beats master. So the loss is the speed of
re-learning, not the predictors: SHIELD-10's offset is the most frequent error among the last 500 bullets, and after
three exact rounds that mode stays on the old aim for as long again. BeepBoop's shielder (`kc/mega/shield/Shielder.java`)
scores its offset over its last 20 bullets and picks its predictor the same way.

## SHIELD-24 (tried and removed)

Two cuts of a `recent` switch on `ShieldDesign`, both off by default, ablation `srecent` (suffix sj):

1. The modal offsets keep the last 20 errors instead of 500, and `bestPredictor` counts exact matches over the
   last 20 learned bullets instead of the battle's totals.
2. The offsets from the last 20 errors, a head-on error counting two recurrences over its own (BeepBoop's
   zero bonus), predictor choice on the battle's totals as before.

## Cloud read (seeds 9901-9902, 35 rounds, parallel 3; `c` master, `sz` = `sstill,slistadd`, `sj`/`rz` = the same
with cut 1 / cut 2, `sw`/`rw` = cut 1 / cut 2 with the step-aside plan)

| Robot | c | sz | sj (cut 1) | rz (cut 2) | sw | rw |
|---|---:|---:|---:|---:|---:|---:|
| axeBots.Musashi 2.18 | 71.7 | 97.7 | 92.9 | 98.1 | 87.4 | 91.5 |
| cx.Princess 1.0 | 63.7 | 74.3 | 77.6 | 71.5 | 72.6 | 65.4 |
| pez.rumble.CassiusClay 2rho.02no | 58.6 | 63.9 | 51.1 | 65.6 | 57.4 | 61.3 |
| cx.mini.BlackSwans 0.60 | 72.6 | 69.3 | 65.8 | 65.8 | 65.5 | 66.7 |
| rz.GlowBlow 2.31 | 80.2 | 73.3 | 77.7 | 71.4 | 74.0 | 76.0 |
| cx.CigaretBH 1.03 | 77.6 | 72.7 | 65.6 | 72.9 | 67.8 | 68.0 |
| stelo.MatchupMicro 1.2 | 88.0 | 71.6 | 73.7 | 68.8 | 76.6 | 76.3 |
| mean | 73.2 | 74.6 | 72.0 | 73.4 | 71.6 | 72.1 |

Cut 1 flipped to a stale predictor at a round start against Princess (seed 1 round 2: six power-3 hits, no shot)
and hurt CassiusClay by 13. Cut 2 is within noise of `sz` on every robot (mean -1.2) and worse on Princess, the
robot it was built for. The `SR` records show why: against Princess seed 1 the three arms are identical (94 shots,
88 intercepts, exit at 150 damage in round 4); the binding constraint is SHIELD-11's battle exit, not how fast the
offset re-learns. The switch is removed (no dead experiment code); this doc keeps the read.

## What the read does say

The list add with the still plan (`sz`) against master, both seeds: Musashi +26, Princess +11 (and on seed 9801 above, +5 with no damage exit
against -19 with it), CassiusClay +5; GlowBlow -7, BlackSwans -3, CigaretBH -5, MatchupMicro -16. The three winners
are the candidates for `shield-still:` lines (Princess also `shield-exit0:`), to be confirmed on fresh seeds and then
on the PC on fresh seeds by the usual card gate (gains summed over the robots fought and read as APS over the
1,217-robot field, as every per-robot card does). pc-shield-still (PR #510, 2026-10-31) measured Musashi,
Princess and CassiusClay with the still shield on and did not pick them; the cloud and the PC have disagreed on
shield robots before, so the PC read decides.

## Confirm on fresh seeds (9911-9914; `la` = names + `shield-still:`, `lb` = `la` + `shield-exit0:` for Princess)

| Robot | c | la | lb |
|---|---:|---:|---:|
| axeBots.Musashi 2.18 | 76.0 | 95.8 | 96.9 |
| cx.Princess 1.0 | 73.6 | 72.3 | 75.7 |
| pez.rumble.CassiusClay 2rho.02no | 63.9 | 58.3 | 59.5 |

Musashi holds on every seed (+20); Princess is -1 without the exit off and +2 with it, both inside noise; CassiusClay loses on fresh
seeds, as pc-shield-still said. Card `pc-shield-audit` (BENCH-209, plans/pc-shield-audit.queue) takes Musashi and
Princess (with exit off) to the PC on 12 fresh seeds against master and its A/A copy; CassiusClay stays off the list.
