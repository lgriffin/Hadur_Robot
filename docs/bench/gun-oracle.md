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

## K1 step 1: the rolling blend

The first K1 member re-weights the eleven views by how well each has predicted this opponent's bullets
so far: a view's score is a decaying mean of log2 of its density at each bullet's guess factor over the
uniform's, its weight 2^(power x score) (exponential weights, the log form of BeepBoop's rolling score),
and the model is the weighted mix of the views' normalised surfaces (ORACLE-3). It learns only what the
robot could learn: bullets that hit Hadur (9% of them, from the HF records), once they have arrived.

Cloud read, 36 robots ([2026-10-29_k1-rolling-cloud.md](local/2026-10-29_k1-rolling-cloud.md), per robot
[k1-rolling-cloud-per-robot.tsv](local/k1-rolling-cloud-per-robot.tsv)):

| Model | bits | safe |
|---|---|---|
| shipped blend | +0.288 | 0.081 |
| rolling blend, decay 0.8, power 2 (learns from hits) | +0.320 | 0.080 |
| the same rule learning from every bullet (not playable) | +0.346 | 0.077 |
| ceiling: each robot's best fixed mix, in hindsight | +0.355 | 0.075 |

What it says:

1. **It passes the bits gate, barely.** +0.032 bits over the shipped blend, worse by more than 0.02
   bits on 2 of 36 robots, tuned on the same robots. The safe third moves from 8.1% to 8.0% of bullets:
   on the measure the surf drives by, it is level.
2. **Re-weighting these views is nearly spent.** Even knowing the whole battle in advance, the best
   fixed mix per robot is +0.355 bits, 0.07 over the shipped blend. The weights are not where the
   king's gap is; the views are. The shipped scan-weight average is already most of the way to the best
   any weighting of them can do.
3. **The robot sees too few bullets to learn fast.** The same rule learning from every bullet gets
   +0.346; from hits alone, +0.320. 91% of the bullets on this class miss and are never seen.

So step 1 does not earn a Java port or a PC card on its own. The ORACLE-3 columns stay: every later
member needs the battle order and the hit marks.

## Next

- **K1 step 2, new members.** The room is in the members, not the weights. The ones worth scoring
  first model the enemy's gun from what Hadur does know, its own movement: a k-NN over Hadur's past
  guess factors at each wave's passing (every wave, not only hits), on the features learning guns
  segment on (lateral velocity, acceleration, distance to wall ahead, time since direction change,
  bullet flight time), in a few weightings. That needs the wave's features from the truth log in
  `join` (Hadur's state at fire time and its guess factor when the wave passes). Gate as the doc sets
  it: better bits than the shipped blend on learning-flat, no class worse; the rolling blend then mixes
  the new members with the views.
- **PC**: `oracle.npz` from pc-k0-oracle (PR #410) predates ORACLE-3, so the PC data needs a re-join
  (minutes, no battles) before it can score K1. That goes on one card with step 2, if the battle
  directories are still on the PC.

Nothing here ships: no release, no table line, and 1v1 behaviour is unchanged with the switches off.
