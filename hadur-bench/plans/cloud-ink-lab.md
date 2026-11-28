# The `cloud-ink-lab` card (BENCH-295)

The bench shall carry the `cloud-ink-lab` card, the first test of [docs/sepia-design.md](../../docs/sepia-design.md) in the engine and the one that can end the project. It cannot run until stage Q0 has built the silent Sepia it names, so it has no queue yet; this file is its specification, and `data/tools/test_ink_model.py` holds the file to its arms, gates and stop rule.

Arms, each a silent build (no punch) on the cloud at 35 rounds and 12 seeds from 305, as the movement lab runs (BENCH-280): `sp`, silent Sepia with its jet cycle and its ink; `sj`, the same robot with the ink off (jet only); and `si`, silent Hadur from master. Opponents: the six lab shooters (lab.HeadOn, lab.Linear, lab.Circular, lab.GFHist, lab.Knn, lab.PatternMatch) and DrussGT, BeepBoop and Diamond, truth log on.

Read with `ink_read.py` (stage Q0), which joins every enemy bullet in the truth log to its wave and to the robot's actual path: the bullets that would have hit, the share of those a Sepia bullet met first (cover), the hit-set width, inks per wave and the turn-back entropy; and with `data/tools/move_lab.py` for true hit rates and damage a round, paired by seed.

Gates:

1. Cover: `sp` shades 35% or more of the bullets that would have hit, over the nine opponents. The cloud model gives 48%.
2. Damage with ink: against lab.Knn and lab.PatternMatch, `sp` takes at least 25% less damage a round than `si`.
3. Damage without ink: against lab.GFHist and lab.Knn, `sj` takes no more than 1.5 times the damage a round `si` takes. This is the number the APS estimate turns on (`data/tools/sepia_aps.py`, BENCH-294): the lab hit silent Hadur with 9.3% of GFHist's bullets and 13.3% of Knn's, and the cloud model puts the same kinds of gun at 9% to 13% and 16% to 20% on the jet cycle.
4. Simple guns: against lab.HeadOn, lab.Linear and lab.Circular, `sj` takes no more than `si` plus 2 damage a round.

Stop: cover under 25% after 4 seeds, or any shooter doing more to `sp` than to `si` beyond its 95% interval. The project then stops at Q0 and Hadur keeps the hub work of stages H0 and H1. A miss on gate 3 alone does not stop the card: it sends the jet cycle back for a wider choice of landings before any gun is built.

Results open on `claude/cloud-ink-lab-results`.

Stage or check: Q0
