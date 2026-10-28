# JayLexi and Eveimear: the MiniRumble and MicroRumble 1v1 entries

Leigh, 2026-10-28: "let's build these two and see the reference zip", with his design plan
"JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan"
(https://claude.ai/artifact/C2YjT4PxhV2AX4WQdE9aWX) and `kitlab.zip` (the J1, E1, E2 and E2b
drafts, API stubs, a codesize counter and RoboRunner scripts). This page records what was built
from them, how the cloud box measured it, and what stands between each bot and the plan's
submission gate. The requirements are JAYLEXI-1 to JAYLEXI-10 and EVEIMEAR-1 to EVEIMEAR-12 in
[requirements.md](requirements.md); the plan's K, J and E statements map onto them there.

Both are separate robots in their own modules (`jaylexi/`, `eveimear/`). Nothing of Hadur, Saor,
TwinSaor, Deise or Sanaro changes; Hadur's 1v1 build is untouched. Nothing has been submitted or
uploaded: the participants line and the wiki account are Leigh's (plan, S0 and S6).

## 1. The targets

| Rumble | Limit | Top 5 bar (28 Oct) | Plan's bench gate | Reference bot on the bench | Its live APS |
|---|---|---|---|---|---|
| MiniRumble (669 bots) | 1,499 bytes | 87.40 (WeeksOnEnd) | 87.7 | voidious.mini.Komarious 1.88 | 87.54 (4th) |
| MicroRumble (515 bots) | 749 bytes | 85.03 (HedgehogGF) | 85.3 | sheldor.micro.Epeeist 3.7 | 85.06 (4th) |

## 2. The bench

The plan's bench is the whole division under RoboRunner on the PC. The cloud box has 4 cores, so
it runs a sample that stands for the division instead, through the repo's own bench
(`hadur-bench`, Robocode 1.11.1, unseeded like the rumble client, 35 rounds, 800 x 600):

- **The sample** (`tools/kitlab_fields.py`, `kitlab/mini-field.txt`, `kitlab/micro-field.txt`):
  the division's top 12 by name, weight 1 each, then one bot drawn from each of 36 even rank bands
  of the rest, weight (size - 12) / 36 each (18.25 in mini, 13.97 in micro). The weighted mean of
  the live APS of the 48 bots is 50.03 (mini) and 50.14 (micro), where the whole division's is 50.
- **The read** (`tools/kitlab_read.py`): the weighted mean score share is the raw estimate of APS.
  Run raw, the references read 88.66 for Komarious (live 87.54) and 83.99 for Épéeist (live 85.06):
  the sample's draw is worth about 1 APS either way. So every build is read **paired**: the
  reference's live APS plus the weighted mean of (ours - reference) per opponent, each on the same
  48 bots at 2 battles each. Its interval is about ±0.5.
- **The jars** come from the rumble's participants list; the GitHub raw links (sheldor's bots) are
  refused from the cloud and come from robocode-archive.strangeautomata.com instead.
- `kitlab/run.sh`, `kitlab/queue.sh`, `kitlab/after.sh` and `kitlab/build_arm.sh` run a build on
  a field, chain runs, and build an arm from a source file (`tools/kitlab_codesize.py`, Leigh's
  kitlab counter, prints its size). The arms' sources are in `hadur-bench/kitlab/arms/` (0.1 is
  the first commit of each module); every read, with the module builds' per-opponent tables, is in
  [bench/kitlab-2026-10-28.md](bench/kitlab-2026-10-28.md).

## 3. JayLexi (MiniRumble)

The J1 draft is a projected-point surfer over a `[9][31]` danger table; on the first smoke battle
it scored 18% against Komarious. 0.1 was rebuilt from the plan's J2/J3 direction as a true surfer
with precise prediction (Apollon's mini prediction as Komarious carries it), danger as the bin over
the distance to the fourth, one wave class for gun and surfing, and the plan's GF gun segmented on
velocity history, lateral speed, walls ahead and distance (Komarious's segments, which the plan
names as the strongest documented mini gun).

| Arm | What changed | Bytes | Paired estimate | Against the arm before |
|---|---|---|---|---|
| 0.1 | precise prediction, back / stop / forward, surf stats by our lateral speed | 1,491 | 82.85 ± 0.58 | |
| b | no stop option; flee straight away when no wave is in flight; surf stats by distance too | 1,475 | 84.91 ± 0.42 | +2.06 |
| c | b with a radar lock of twice the turn to the enemy, a hit's wave dropped once logged, 140 px stick | 1,497 | (12 bots only) | +2.38 ± 1.31 on b's 12 worst |
| e | c without the stop code; bullet-hit-bullet logging | 1,494 | **86.61 ± 0.55** | +1.72 ± 0.46 over b |
| f | e with the surf direction allowed to be 0 | 1,494 | broken | a zero direction never ends the wall smoothing loop; the robot is stopped |
| g | e with the gun's lateral direction held through the enemy's stops | 1,498 | 86.59 ± 0.50 | -0.03 ± 0.38 over e |

What the arms say:

- **The stop option costs.** The plan's J1 has back, stop and forward; taking stop out was most of
  b's +2.06. Its prediction (braking along the current heading) is crude at this size, and a
  surfer that stops on the wave reads as a sitter to simple guns: 0.1 took 950 damage from
  amc.ROBv300 where Komarious takes 160.
- **Rammers.** 0.1 orbited perpendicular when no wave was in flight, so rammers that rarely fire
  (RammingC, Sunderer, Tirunculus) drove into it: -21, -13 and -18 against Komarious. Fleeing
  straight away until a wave appears (b) took those back.
- **The radar.** The nano radar (turn back by what was left) costs scans; the twice-the-turn lock
  keeps a scan every tick, which the surf wave's source and angle depend on (c).
- **e is in the module.** g's gun change is level with it and costs 4 bytes, so it stays out.
  The wall smoothing loop turns by the orbit direction, which is the sign of the difference of two
  dangers: f showed what an exact tie would do (the robot is stopped for the round). In the module
  the loop's step takes only the direction's sign (`Math.copySign(0.05, dir)`, 2 bytes, 1,496 in
  all), so a tie still turns; for directions of 1 and -1 it moves exactly as e did, so e's read
  stands.
- **The gun is level with Komarious's**: bullet damage dealt is within a few percent of its on
  almost every opponent. The gap left is movement against learning micros (Jen, Gladius, Blur,
  Intensive, Nexus6) and the top minis.

## 4. Eveimear (MicroRumble)

0.1 is the plan's E1.1: stop-and-go stepping (3 + (int) (drop x 1.999999)) << 3 px per shot along
a 160 px stick-smoothed orbit that leans away, a switch to random orbit for good after 40 + 23 per
round, an anti-ram term (power 3, step every tick, retreat under 100 px), energy corrections for
both sides' hits, and a GF gun of 25 bins on Condition waves segmented on velocity history, lateral
speed and distance, power 2.

| Arm | What changed | Bytes | Paired estimate | Against the arm before |
|---|---|---|---|---|
| 0.1 | the plan's E1.1, reverse on hit, threshold on real damage | 732 | 81.57 ± 0.40 | |
| b | threshold in Épéeist's unit: the energy their hits win back (3 x power) | 729 | 82.64 ± 0.50 | +1.08 ± 0.47 |
| c | b without the reverse on hit | 722 | **84.28 ± 0.46** | +1.65 ± 0.41 |
| e | c with the gun's lateral direction held through the enemy's stops | 730 | 84.02 ± 0.39 | -0.26 ± 0.47 |

What the arms say:

- **Stop-and-go has to last.** Counting real damage (4 x power + 2 x (power - 1)) reaches the
  threshold in about three hits, so 0.1 went random early against simple guns that stop-and-go
  beats outright: ScheroBot, Ambassador and SuperBoxBot took 1,100 to 1,600 damage off it where
  Épéeist loses 270 to 590.
- **Reversing on a hit (the plan's E3) loses 1.65.** A step that reverses after a hit walks back
  into the line a linear or circular gun has just learnt. c is in the module.
- **The gap left is the gun against the top micros**: Claudius, WaveShark and Ant take 20 to 30%
  less bullet damage from Eveimear than from Épéeist, whose gun adds a 5-probe wall score and a
  power table by both energies. Those do not fit in the 27 bytes left without cuts elsewhere.

## 5. Where each stands

| Bot | Build in the module | Bytes | Paired estimate | Top 5 bar | Plan's gate |
|---|---|---|---|---|---|
| JayLexi | e, ORBIT 1.15 | 1,496 of 1,499 | 87.05 ± 0.45 | 87.40 | 87.7 |
| Eveimear | c | 722 of 749 | 84.28 ± 0.46 | 85.03 | 85.3 |

The evening settings sweep (in [bench/kitlab-2026-10-28.md](bench/kitlab-2026-10-28.md)) moved
JayLexi's orbit from 1.25 to 1.15 rad off the wave (+0.43 ± 0.41 on 4 seeds); no Eveimear setting
beat c's. Leigh released both as 0.1 on 28 Oct (tags jaylexi-v0.1 and eveimear-v0.1), below the
plan's gate, so the live first pass shows which opponents cost points.

Neither meets the plan's submission gate yet. Next, in the order the arms point:

1. JayLexi: movement against the learning micros. The plan's J3 hit-list danger is the named
   lever; it needs bytes the gun or the surf segmentation would have to give.
2. Eveimear: the gun. Épéeist's wall score is the measured difference; it needs about 60 bytes, so
   it comes with a trim (Épéeist integrates the enemy's motion in the wave instead of keeping
   positions, which frees some).
3. The plan's full-field PC bench (S1 calibration on all 669 and 515 bots) before any submission,
   as a card with stop rules (docs/bench/watch.md); not written here, since the cloud sample
   answers the arm questions and the gate is not met yet.
