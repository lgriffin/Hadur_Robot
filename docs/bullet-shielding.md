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
robot that sits still and measures each opponent's heading against the head-on bearing
(10 rounds, 1 seed):

| Opponent | Shots | Exactly head-on (< 3e-4 rad) | Within 0.003 rad |
|---|---|---|---|
| xander.cat.XanderCat 12.9 | 220 | 99.5% | 99.5% |
| oog.mega.saguaro.Saguaro 1.0 | 114 | 77.2% | 100% |
| abc.Shadow 3.83c | 192 | 52.6% | 53.1% |
| aaa.r.ScalarR 0.005h.053-noshield | 90 | 14.4% | 76.7% |
| voidious.Diamond 1.8.22 | 205 | 9.8% | 21.5% |
| kc.mega.BeepBoop 2.0 | 110 | 8.2% | 48.2% |
| jk.mega.DrussGT 3.1.16 | 488 | 3.9% | 100% |
| lxx.Tomcat 3.68 | 196 | 1.0% | 2.6% |
| cb.fire.Firestarter 2.0f | 213 | 0.5% | 13.6% |
| dsekercioglu.mega.Raven 3.56j8 | 75 | 2.7% | 2.7% |
| rsalesc.mega.Knight 0.6.28 | 115 | 1.7% | 31.3% |
| sample.Tracker | 89 | 100% | 100% |
| sample.Walls | 65 | 96.9% | 100% |

DrussGT's shots all land within 0.003 rad but almost none exactly: it already jitters, as
Hadur now does. Most of the top ten do the same or aim elsewhere entirely. A shield could
pay only against XanderCat, Shadow and Saguaro, and sitting still is fatal against
everyone else, so it would have to be chosen per opponent from measured results.
