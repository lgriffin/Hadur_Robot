# Sepia

`hadur117.Sepia` is an experimental 1v1 robot built on Hadur's kernel to explore one idea: a robot that
uses its gun as armour. It fixes a landing for every enemy shot as soon as the shot is seen, and fires
0.1 "ink" bullets across the lines of fire that lead to that landing, so the enemy's bullets are shot
down before they arrive. The design, the model behind it and its staged plan are in
[sepia-design.md](sepia-design.md); this page is what is built. Requirements:
[requirements/sepia.md](requirements/sepia.md). Sepia is not entered in any rumble.

Sepia lives in its own module ([sepia/](../sepia/)) and its own jar. It reads Hadur's kernel (the wave
model, the movement predictor, the energy ledger and the bullet-shadow geometry) and changes no file of
Hadur's, so Hadur's 1v1, team and melee play are exactly as they were (SEPIA-1).

## Why ink needs its own movement

Robocode destroys two bullets whose paths cross on the same turn. An enemy bullet flies along a ray from
where it was fired, so a bullet of ours stops every enemy bullet aimed at a bearing it crosses inside the
ring the enemy's wave sweeps that turn. A 0.1 bullet fired head-on runs along those rays and crosses
almost none of them: it shades about 7% of a still robot. Fired from one side it crosses them at an
angle, and the shade grows by about 3 points of the body for every degree between where the shot leaves
and where the body lands.

So the shade depends on the path. A wave surfer keeps its landing open as long as it can, which is good
against the enemy's gun and bad for ink: a bullet can only shade a landing that is already decided when
it leaves the barrel. Sepia decides each landing when the shot is seen, leaves from where it stood, and
inks the landing from the spot it is leaving.

## How it plays

Each tick runs in this order ([SepiaBrain](../sepia/src/main/java/hadur117/sepia/SepiaBrain.java)):

1. **Read shots.** The kernel's `EnergyLedger` turns an enemy energy drop it cannot otherwise explain into a
   shot fired the tick before, and the kernel's `Wave` holds its geometry.
2. **Fix a landing** ([Gait](../sepia/src/main/java/hadur117/sepia/Gait.java)). Each option is played forward
   with the kernel's `MovementPredictor`, walls included, from where the path already committed to earlier
   waves ends, until the new wave has passed the body. Each ends in a hit set: the bearings from the
   wave's source that would meet the body there. The least exposed option is fixed and the path holds it
   until the wave has passed (JET-1, JET-3).
3. **Exposure** (JET-2). The wave's damage, times the chance its bullet is on the part of that hit set left
   unshaded, counting both our bullets already in the air and the next ink the planner could lay
   from where the option puts Sepia when the gun is next cool.
4. **Ink** ([InkPlanner](../sepia/src/main/java/hadur117/sepia/InkPlanner.java)). For each wave, at the
   middle and near both edges of its hit set, the planner solves for the turn on which a 0.1 bullet can be
   where that bearing's bullet is, and aims there: a handful of candidates a wave, at most 64 a shot
   (INK-3). Each is scored with the kernel's `BulletShadows` over every wave in flight, each newly shaded
   bearing weighed by the aim belief, counting only meetings up to the turn the wave reaches the body
   (INK-5). The gun turns toward the planned aim during the reload and fires on the cool tick if the aim,
   rescored from where Sepia actually stands, still adds 5% or more of shade (INK-1).
5. **Ink or punch** (STRIKE-1, STRIKE-3). Each shot is ink or a punch, by what it is worth per tick of
   reload: the ink by the damage and energy return of the bullets it is expected to stop, the punch by
   its hit rate times its damage and return, less its power. With no wave in the air, or an enemy too
   weak to fire again while Sepia leads, it punches. The punch is a plain segmented guess-factor gun
   ([PunchGun](../sepia/src/main/java/hadur117/sepia/PunchGun.java)), a stand-in until Hadur's gun is
   shared through the kernel.

Where the enemy aims comes from [AimBelief](../sepia/src/main/java/hadur117/sepia/AimBelief.java): a
guess-factor belief that starts from head-on and linear peaks over an even floor, and learns every bullet
whose heading Sepia sees, those that hit it and those its ink meets (SEPIA-4). Ink reveals bullets that
never hit, so the belief fills faster than a surfer's.

## Two gaits

| Gait | Options per shot | Let-go |
|---|---|---|
| Jet cycle (`JET`, the default) | carry on, turn back, brake and hold | none: a landing is held once fixed, unless the path would strike a wall or come within 100 px of the enemy (JET-6) |
| Ink surf (`SURF`) | the jet cycle's three, and both directions at half speed | when a later shot is read, a fixed landing not yet reached is let go for one under half as exposed (SURF-3) |
| Joint surf (`JOINT`) | the ink surf's five | the ink surf's, and each new landing is fixed together with the latest one still in flight, as the pair with the least summed exposure (SURF-5) |

Both orbit the wave's source with the kernel's wall smoothing, turn away below 450 px and never close
range (JET-5). Behind a wave in flight a new wave's own stretch is only the end of its flight, so a
landing chosen one wave at a time is mostly set by the choice before it; the joint surf gives the new
wave the whole flight's reach. The movement is deterministic: Sepia takes the least exposed option every time. The
design's turn-back lottery against learning guns waits for Recognition, which is not built yet.

## Records

Every enemy wave writes one line to the robot's console when it is done (INK-6):

    INK round=3 fired=412 power=1.95 option=back width=52.1 shaded=0.612 inks=2 met=1 hit=0

`width` is the hit set in px at the landing, `shaded` the share of it our bullets shaded when the wave
reached the body, `inks` the ink shots that added shade, `met` and `hit` what became of its bullet. Each
round ends with a `SEPIA` line counting inks, punches and revealed bullets.

## Cover from truth logs

[data/tools/ink_read.py](../data/tools/ink_read.py) measures cover from the bench's truth logs, not from
Sepia's own records. It follows every enemy bullet turn by turn and sorts each one that vanishes before
the round ends into hit, met by one of our bullets, or other. It then flies each met bullet on along its
line against Sepia's actual path, to see whether it would have hit. **Cover** is the share of the bullets
that would have hit that our bullets met first.

    python3 data/tools/ink_read.py hadur-bench/work/<run> [--arm sp --arm ss] [--md out.md]

The engine moves bullets one at a time and checks each against the others' lines as they stand, so the
bullet moved first meets the other's line from the turn before. The read counts a meeting when either
bullet's new segment crosses the other's new or previous one. With that rule its count of bullets met
equals the count in Sepia's INK records, battle by battle. The same order of play is what the kernel's
`BulletShadows` counts as a possible shadow, at half weight (INK-5).

Planned shade and cover answer different questions. Planned shade is the share of a landing's bearings
the ink covers. Cover is weighted by where the bullets really go, so against a learning gun that aims
where the ink was planned, cover runs above planned shade.

## Arms

Two constants in [Sepia.java](../sepia/src/main/java/hadur117/Sepia.java) pick the build. The shipped jar is
the jet cycle with ink and punch. [hadur-bench/tools/sepia_arms.sh](../hadur-bench/tools/sepia_arms.sh)
builds the lab arms, each named `hadur117.Sepia <release><label>`, and prints the lines of an `--arms`
file:

| Label | Gait | Gun | Use |
|---|---|---|---|
| `sp` | jet cycle | ink only | the `cloud-ink-lab` card's silent robot with its ink |
| `sj` | jet cycle | none | the same with the ink off: how often the gait alone is hit |
| `ss` | ink surf | ink only | the ink surf, silent, with its ink |
| `sn` | ink surf | none | the ink surf with the ink off |
| `sx` | joint surf | ink only | the joint surf, silent, with its ink |
| `sf` | jet cycle | ink or punch | the shipped build |

```sh
mvn -pl sepia -am install -DskipTests       # repo root: the kernel and the shipped jar
cd hadur-bench
bash tools/sepia_arms.sh sp,sj,ss > sepia.arms
mvn exec:java -Dexec.args="--arms sepia.arms --set lab-panel.txt --rounds 35 --seeds 12"
```

## First look

A one-seed smoke of `sp`, `sj` and `ss` against the lab's six shooters
([bench/local/2026-11-25_sepia-q0-smoke.md](bench/local/2026-11-25_sepia-q0-smoke.md)) is not a
measurement, but it points the same way as the design's estimate. With ink, the waves of the three learning
guns that hit fell from 23-27% to 8-12%, and the planned shade was 29% to 35% of each landing. With the ink
off the jet cycle is very readable, about twice as hittable as silent Hadur in the lab's first read. The ink
surf with ink did best against the learners.

## The joint surf

A 12-seed lab card (seeds 174000 to 174011, 35 rounds, the six lab shooters) put silent Hadur (`si`)
beside the ink surf (`ss`) and the joint surf (`sx`). Mean score share: `si` 62.3%, `ss` 59.0%, `sx`
68.3%. Against the three learning guns the joint surf was hit less often than silent Hadur (GFHist 7.6%
against 9.3%, Knn 8.5% against 10.7%, PatternMatch 7.4% against 10.6%), with the ink meeting 56% to 58%
of the bullets that would have hit. The simple guns still hit Sepia more than Hadur (Circular 1.6%
against 0.3%, Linear 0.7% against 0.2%). Two other changes tried on the way came out level: nine
landing speeds in place of five, with the aim belief leaning on Sepia's own past landings, and a random
draw among the near-best landings. Neither is kept.

## Not built yet

These parts of the design are later stages: Recognition (EXACT, SIMPLE, LEARNER verdicts) and the
lottery it gates, the hover and exact intercept against head-on guns, the atlas and the per-opponent
shelf, the hub promotions that would let Sepia use Hadur's surf and guns through the kernel, and the
ink surf as a switch inside Hadur.
