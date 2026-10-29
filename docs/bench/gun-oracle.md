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
robot could learn: bullets that hit Hadur (9% of them, from the HF records), from the tick they hit.

Cloud read, 36 robots ([2026-10-29_k1-rolling-cloud.md](local/2026-10-29_k1-rolling-cloud.md), per robot
[k1-rolling-cloud-per-robot.tsv](local/k1-rolling-cloud-per-robot.tsv)):

| Model | bits | safe |
|---|---|---|
| shipped blend | +0.288 | 0.081 |
| rolling blend, decay 0.8, power 2 (learns from hits) | +0.320 | 0.080 |
| the same rule learning from every bullet (not playable) | +0.346 | 0.077 |
| each robot's best fixed mix, fitted in hindsight | +0.373 | 0.075 |
| each robot's best mix per round, fitted in hindsight (overfits: ~35 bullets a round, 11 weights) | +0.492 | 0.066 |

What it says:

1. **It passes the bits gate, barely.** +0.032 bits over the shipped blend, worse by more than 0.02
   bits on 2 of 36 robots, tuned on the same robots. The safe third moves from 8.1% to 8.0% of bullets:
   on the measure the surf drives by, it is level.
2. **No fixed weighting is worth much.** Knowing the whole battle in advance, the best fixed mix per
   robot is +0.373 bits, 0.085 over the shipped blend: the shipped scan-weight average is already most
   of the way to the best single weighting of these views. Weights that change during the battle can
   do better in principle (fitting each round in hindsight gives +0.49, though 11 weights on about 35
   bullets a round flatters it), so this is not a bound on adaptive weighting.
3. **What holds the robot back is how little it sees.** The same rule learning from every bullet gets
   +0.346; from hits alone, +0.320. 91% of the bullets on this class miss and are never seen, so any
   rule that learns from the enemy's bullets learns slowly. A member that learns from something the
   robot sees on every wave (where it was when each wave passed) does not have that limit.

So step 1 does not earn a Java port or a PC card on its own. The ORACLE-3 columns stay: every later
member needs the battle order and the hit marks.

## Two fixes to the measure

- **Calibrated bits.** Bits reward confidence as well as knowledge: mixing the shipped blend with 20%
  uniform alone takes it from +0.288 to +0.319, which is most of step 1's +0.032. Each model is now also
  reported at its best further uniform mix ("calibrated"), so models compare on what they know.
- **Rank.** The surf acts on the views' ranking of its options, not on their scale. `rank` is the share
  of the wave a model rated safer than where the bullet went (0.5 knows nothing). On the step 1 models
  it moved 0.695 to 0.696: step 1 changed the scale, not the ranking.

## K1 step 2: new members (ORACLE-4)

`join` now keeps every enemy bullet of the truth log as a wave with Hadur's state when the enemy aimed
(lateral and advancing velocity, acceleration, ticks since reversing and since slowing, distance, wall
room ahead and behind, flight time) and where Hadur was when the wave passed. Two kinds of member were
scored, on the 36 learning-flat robots and on 50 simple-gun robots (every 7th of the census's head-on,
linear, mixed, linear+learning and head-on+learning guns, rammers and sitters out;
`hadur-bench/k1-simple-cloud.txt`, 3.19 `aesrec,oracle`, 1 seed, 35 rounds).

| Model | learning-flat cal. bits | safe | rank | simple-gun cal. bits | safe | rank |
|---|---|---|---|---|---|---|
| shipped blend | +0.319 | 0.081 | 0.695 | +1.474 | 0.025 | 0.867 |
| rolling blend (step 1) | +0.342 | 0.080 | 0.696 | +1.489 | 0.026 | 0.869 |
| visits: k-NN over where Hadur went | +0.138 | 0.131 | 0.631 | -0.249 | 0.551 | 0.340 |
| blend + 25% visits | +0.340 | 0.081 | 0.694 | +1.222 | 0.046 | 0.851 |
| **rolling over the views and the three simple aims** | **+0.386** | **0.077** | **0.701** | **+1.621** | 0.024 | **0.895** |
| hindsight: best fixed mix of the views | +0.387 | 0.075 | 0.706 | +1.543 | 0.024 | 0.874 |

Reports: [learning-flat](local/2026-10-29_k1-step2-learning-flat-cloud.md),
[simple guns](local/2026-10-29_k1-step2-simple-cloud.md) (per robot: the matching `.tsv`), and the
simple-gun battles ([2026-10-29_k1-simple-cloud-battles.md](local/2026-10-29_k1-simple-cloud-battles.md)).

1. **The visit member does not help.** A k-NN over where Hadur went, the way a learning gun
   learns, ranks worse than the views on both classes and adds nothing in the blend. The enemy guns do
   not aim where Hadur has been on these features; or not in a way this member reproduces.
2. **The simple aims do, as members.** Head-on, linear and circular aims from the enemy's position at
   Hadur's state a tick before it fired, each one more member of the rolling blend (standing weight 0.3
   of a view's, learning from hits like the views), give the first change in ranking: on learning-flat
   bullets from the safest third fall from 8.1% to 7.7%, rank 0.695 to 0.701, calibrated bits +0.067,
   and no robot worse in bits (0 of 36). It matches the best fixed view weighting in hindsight, which
   the robot cannot have. Learning guns that fire some simple shots, or aim close to a simple aim
   early, are the likely source.
3. **Simple guns: dodging is not the gap.** Hadur takes 2.6% of these bullets, 2.4% come from the
   third it drives into, and 47 of 50 battles are near-perfect survival; the members raise bits
   (+0.15) and rank, but 16 of 43 robots score lower in bits and safe does not move. Saguaro's +0.45 on
   this group is more likely kill speed or damage dealt than the danger model.

So the candidate for a battle test is the aims as danger members. It is cheap in the robot: three
predictions a wave and three more scores in the rolling blend.

## K1 step 2 in the robot: the cloud bench (MOVE-29)

The aim members are ported into the duel surf behind `MoveDesign.AIM_MEMBERS` (off in shipped jars;
ablation `aimmem`, suffix km): danger where the views have data is the weighted mean of the views'
score and a kernel on each simple aim, with prior 0.1 an aim and rolling weights learned from hits.
Cloud bench 2026-10-29 (`hadur-bench/k1-aim-cloud.txt`, the 36 surfed learning-gun robots of the
oracle's cloud sample; 2 seeds from 4300, 35 rounds, 3.19aa control vs 3.19km; report
`docs/bench/local/2026-10-29_k1aim.md`):

| Arm | Battles | Score share | Damage taken a battle | Skips a battle |
|---|---:|---:|---:|---:|
| aa (3.19) | 72 | 78.64% | 708 | 5.4 |
| km (aim members) | 72 | 78.67% | +13 ± 19 | 6.4 |

Paired difference +0.03 ± 0.64 pp (one standard error) over 72 pairs: flat at this resolution.
Robot spread is wide in both directions (abc.Shadow +16, ags.Glacier +7, rz.GlowBlowAPM -8,
cw.megas.Gridd -7), as two seeds give. The offline gain was small too (calibrated +0.07 bits,
rank +0.006), so the battle effect, if any, is below what a cloud bench can see. No skip or fault cost.

Known defect (Qodo, PR #421): a hit near GF ±1 undercounts an aim whose kernel runs past the escape
angle (up to 1 bit); the fix is to divide by the kernel's share inside the reachable range.

## Next

- **Aim members**: fix the edge undercount, then measure on the PC only as an arm folded into a
  card that runs anyway (the 432 at 2 seeds resolves about ±0.15); Leigh decides.
- **PC re-join**: `oracle.npz` from pc-k0-oracle (PR #410) predates ORACLE-3 and ORACLE-4; a re-join
  (minutes, no battles) scores every K1 model on the 432, and fits on the same card.

Nothing here ships: no release, no table line, and 1v1 behaviour is unchanged with the switches off.
