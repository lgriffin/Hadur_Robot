# Bullet shielding

Found in the RoboRumble top-10 bench (docs/bench/roborumble-top10.md): Hadur 2.0 scored
1.7% against oog.mega.saguaro.Saguaro 1.0 and hit 0.5% of its shots while Saguaro sat
still. This note records how Saguaro does it, how Hadur now beats it (SHIELD-1, SHIELD-2),
and which opponents a shield of Hadur's own could beat.

## How Saguaro shields

Read from the decompiled 1.0 jar (`oog.mega.saguaro.mode.shield.BulletShieldMode`).

- **It starts every new opponent in shield mode** and keeps it while it scores; a mode
  selector moves to other modes (score-max, shot dodger, wave poison, perfect prediction)
  when it doesn't. Against Hadur 2.0 it never needed to.
- **It sits still.** Against a target that doesn't move, every gun collapses to firing
  head-on at where the target was on the previous tick: a guess-factor or KNN gun has only
  ever seen it at guess factor 0.
- **It predicts our bullet's heading from twelve candidates**: head-on from our previous
  tick's position, that plus our body turn, head-on from our firing position, head-on from
  our projected position, and each of those four plus a learned mean offset and plus a
  learned offset times our lateral direction. It scores the candidates by how many of our
  bullets they predicted to within 1e-5 rad and uses the best.
- **It meets the bullet mid-air.** For each of our waves it searches fire time and power
  for a bullet whose path crosses ours inside one tick's travel ("precise shadow"), turns
  its body parallel to us, nudges 0.1 px so the two paths are not collinear, and fires the
  weakest power that works, never more than ours. Bullet-on-bullet costs us our power and
  it only its own, so we drain ourselves (rounds ran to 2,400 turns).
- **It fires to kill only in the slack**: a 0.1 finisher once we are disabled, and
  "aggressive" shots when its gun would still be cool for the next shield.

## The counter (SHIELD-1, SHIELD-2)

The shield depends on knowing our heading to within about 1e-5 rad. `hadur2.core.shield`:

- `ShieldDetector` (SHIELD-1) keeps the fate of our last 20 duel bullets. Four or more shot
  down, and at least a quarter of them, marks the enemy as a shielder for the battle.
  Accidental bullet collisions are a few percent.
- `AimJitter` (SHIELD-2) then offsets each shot by 15% to 50% of the target's angular
  half-width, on the golden-ratio sequence: always on a still target's body, never on the
  head-on line, with no mean offset to learn, and deterministic (RES-6, CORE-2). The offset
  holds until the shot goes out so the gun can settle on it.

Bench, 5 seeds x 35 rounds (docs/bench/shield-counter-saguaro.md): score share
**1.7% to 68.8%**, rounds won 0 to 142 of 175, our hit rate 0.5% to 19.4%. Saguaro still
shot down 7.3% of our bullets, mostly in round 0 before the detector fires, and it leaves
shield mode after a few rounds.

## Could Hadur shield?

Only against opponents whose aim at a still target is exact. `hadur-bench/probe` benches a
robot that sits still and measures each opponent's heading against head-on bearings from
the shooter's positions on the firing tick and the two before it (10 rounds, 1 seed):

| Opponent | Shots | Exactly head-on (< 3e-4 rad) | Within 0.003 rad |
|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 75 | 100% (from two ticks back) | 100% |
| xander.cat.XanderCat 12.9 | 220 | 99.5% | 99.5% |
| oog.mega.saguaro.Saguaro 1.0 | 114 | 77.2% | 100% |
| abc.Shadow 3.83c | 192 | 52.6% | 53.1% |
| voidious.Diamond 1.8.22 | 205 | 15.1% | 25.9% |
| aaa.r.ScalarR 0.005h.053-noshield | 90 | 14.4% | 77.8% |
| kc.mega.BeepBoop 2.0 | 110 | 9.1% | 51.8% |
| jk.mega.DrussGT 3.1.16 | 488 | 3.9% | 100% |
| rsalesc.mega.Knight 0.6.28 | 115 | 2.6% | 40.9% |
| lxx.Tomcat 3.68 | 196 | 2.0% | 8.7% |
| cb.fire.Firestarter 2.0f | 213 | 0.5% | 16.0% |
| sample.Tracker | 89 | 100% | 100% |
| sample.Walls | 65 | 96.9% | 100% |

DrussGT's shots all land within 0.003 rad but almost none exactly: it already jitters, as
Hadur now does.

### The prototype, and why it was not shipped

A full shield mode was built and benched (commit c6d4d7a, reverted in the next commit; the
code is in history). It sat still, predicted each enemy bullet from twelve head-on
predictors like Saguaro's (four bases, each plain, plus a learned offset, and plus a learned
offset times our lateral direction), fired the widest-shadow bullet no stronger than the
enemy's, and stepped 0.1 px aside on the tick before firing. It turned itself off for the
battle after three hits that outnumbered its interceptions, three unpredicted hits, two
rams or a lost round.

It intercepted sample.Walls reliably. Against the bots the probe marked as shieldable it did
not hold up, over 3-round trial battles:

- **XanderCat and Saguaro change their aim once their bullets are shot down.** The first
  shot is exactly head-on and is intercepted; the next ones carry a small offset that flips
  with the way we last moved (our 0.1 px step), which the directional predictor learned,
  and then XanderCat moved to stronger, differently aimed shots. Both turned the shield off
  within round 0.
- **Shadow and Raven are not exact against a robot that steps aside**, although they were
  against the probe, which never moves: their aim follows the step.
- Every trial against a strong bot costs round 0 sitting still, which is where most of
  Hadur's round-0 losses in those trials came from.

So shielding pays only against simple head-on bots, which Hadur already beats. The counter
is what matters for the rumble: it beats Saguaro, and it will beat any other shielder that
relies on exact head-on prediction.
