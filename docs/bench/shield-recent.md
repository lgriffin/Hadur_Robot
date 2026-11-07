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

## SHIELD-24

`ShieldDesign` gains `recent` (off in SHIPPED, not in `all`): the modal offsets keep `RECENT_ERRORS` = 20 errors
instead of 500, and `bestPredictor` counts exact matches over the last 20 learned bullets instead of the battle's
totals. With the switch off the robot plays bit for bit. Ablation `srecent` (suffix sj).

## Cloud read

(filled in below as the runs finish)
