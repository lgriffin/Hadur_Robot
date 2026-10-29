# The enemy-gun oracle (K0 of the road to king)

2026-10-29. Leigh's doc "Hadur: the 1:1 map, tonight's card, and the road to 1v1 king" (2026-10-28) puts
the king's lead in one class: learning guns on flat movers, 431 robots, Hadur 84.5 live, BeepBoop +2.11
APS of its +3.82 lead. Inside that class the score follows damage taken (-0.88) and not Hadur's own hit
rate (+0.01), and no table mode applies. The road is a better model of the enemy's gun, built and scored
offline against bullets already recorded, then shipped per opponent (K0 oracle, K1 members, K2 budget, K3
per-opponent weights, K4 after). This page is K0: the harness and its first read.

## What K0 is

A model of the enemy's gun is a surface over a wave's guess factors: where it thinks the bullet is. The
oracle asks each model, for every real enemy bullet, how much density it put where the bullet actually
went. The bullet's heading is a fact in the truth log, so this needs no simulation, and a model costs
seconds to score on tens of thousands of bullets instead of a night of battles that read inside ±0.3.

Two scores, each opponent weighted equally:

- **bits**: log2 of the model's density at the bullet's guess factor over the uniform's (after a 5%
  uniform mix, so no bullet scores minus infinity). 0 knows nothing; higher is better. This is the
  model's predictive skill.
- **safe**: the share of bullets that came from the third of the wave the model rated least dangerous.
  That third is where the surf drives, so this is the share of bullets the model walks Hadur into. 0.333
  knows nothing; lower is better.

## How it is built

- **ORACLE-1** (`OracleRecord`, `MoveController.oracleNeighbours`, `MoveDesign.ORACLE_RECORD`, ablation
  `oracle`, suffix or). At each wave's first three-option rating (the AES-1 point) the duel prints one
  `ORC` line: the wave's geometry and, for each of the eleven danger views, whether it is on, its weight
  and every neighbour it finds (guess factor and scan weight). The neighbours are searched in the
  forensics cache slot and the slot is emptied after, so the surf's own cache and its choice are
  untouched (`OracleRecordTest`); the switch is off in every shipped jar. Recording the neighbours, not a
  surface, means any kernel rebuilds offline, the surf's own included.
- **ORACLE-2** (`data/tools/gun_oracle.py`). `join` matches each record on a real wave to its bullet (one
  tick after the fire time, at the same power, as `aes_rank.py` does), converts the heading to the
  wave's guess factor, rebuilds each view's surface with the surf's kernel (`kernelMass` over a robot's
  width) and reads the head-on, linear and circular aims from the truth log. `score` rates every model.
  Tests: `hadur-bench/tools/test_gun_oracle.py`, in CI.
- **The gate.** Built `aesrec,oracle`, the same battles carry the AES record of each option's terms. The
  oracle rebuilds the views' score over each option's plan interval from the neighbours and compares it
  with what the surf logged, then re-runs the surf's pick with the rebuilt scores.

One change from Leigh's doc: it planned to start from the 2026-10-18 census logs (2,424 battles, truth
log on). Those logs hold the bullets but not the views' state at each wave, and the core cannot be
replayed from a truth log, so the data set is re-recorded with the probe on. That is the `pc-k0-oracle`
card below (about 2.5 PC hours).

## The cloud read (2026-10-29)

48 of the 432 (every 9th of `aes-flat-learning.txt`, `hadur-bench/k0-cloud.txt`), 3.19 `aesrec,oracle`,
1 seed, 35 rounds: 46,719 of 77,170 enemy bullets matched to a surfed wave. 12 of the 48 left no record:
Hadur shields them, stop-and-goes or rams them, so no three-option surf ran; the oracle covers the robots
Hadur surfs, which are the ones the king's gap is in. Full report:
[2026-10-29_k0-oracle-cloud.md](local/2026-10-29_k0-oracle-cloud.md), per robot
[k0-oracle-cloud-per-robot.tsv](local/k0-oracle-cloud-per-robot.tsv).

**Gate: passed.** The views' score rebuilt offline equals the surf's to 0.1% on 99.99% of 85,699
options no shadow touched, and with the rebuilt scores the surf's rule picks the option it took on
99.99% of 10,794 waves where every option could be rebuilt (the rest have one of our bullets' shadows
on an option, which the record does not carry). The oracle is the surf, offline.

**Baselines** (36 robots with bullets):

| Model | bits | safe |
|---|---|---|
| uniform | 0.000 | 0.333 |
| shipped blend | **+0.288** | **0.081** |
| best single view (lightFlattener) | +0.153 | 0.119 |
| normal view | +0.098 | 0.087 |
| simple view | +0.053 | 0.091 |
| recent views 1-3 (k-NN on the latest few hits) | -1.1 to -1.4 | 0.12-0.14 |
| circular / linear / head-on aim | -1.2 / -1.3 / -1.2 | 0.08 / 0.08 / 0.17 |

What the baselines say:

1. **The blend knows little about these guns.** +0.29 bits a bullet is a weak predictor: the bullet's
   guess factor gets 1.2 times the uniform's density on average. Per robot it runs from -0.47 to +1.81
   (median +0.30). That matches the doc's arithmetic that the surf is only a little better than random on
   the class, and it is the room K1 has.
2. **But it rarely walks into the bullet.** Only 8% of bullets came from the third the blend called
   safest, against 33% by chance. The surf's losses on this class are bullets in the middle third,
   where the blend's ranking is close to flat; a sharper model moves those.
3. **The recent views are confidently wrong.** Alone they score -1.1 to -1.4 bits: a few recent hits,
   a narrow kernel, density put where the bullet is not. The blend survives them because the
   scan-weight average dilutes them. A blend that weights each member by how well it predicts (BeepBoop's
   rolling score, K1) would cut them down where they are wrong and lift them where they are right.
4. **Simple aims do not predict these guns** (-0.8 bits for the best of three per robot), as their class
   says (learning: 60%+ of shots match no simple aim). They stay as members for the robots that mix in
   simple aims, not as a fix.

## Next

- **pc-k0-oracle** (`hadur-bench/plans/pc-k0-oracle.queue`, BENCH-134), Leigh starts it: the 432 at 2 seeds,
  truth log on, about 2.5 h, after pc-1to1. Its `oracle.npz` stays on the PC (about 1.5-2 GB) as K1's data
  set; the results PR carries the report and the per-robot sheet. Stops on 30 failed battles, 40+ skipped
  turns a battle over the last 200, or no battle in 30 minutes.
- **K1 members**, cloud, against the cloud data now and the PC data when it lands: the accuracy-weighted
  blend of the eleven views (rolling 0.98, cubed), visit-count buffers over a few segmentations, and k-NN
  on other feature sets, each needing the wave's features from the truth log (the next addition to
  `join`). Gate as the doc sets it: better bits than the shipped blend on learning-flat, no class worse.

Nothing here ships: no release, no table line, and 1v1 behaviour is unchanged with the switches off.
