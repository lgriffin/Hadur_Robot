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

## 6. Hadur as the teacher: Eveimear's mode table (pc-eveimear-h1)

Leigh 2026-10-31: the string tricks shrink nothing (a `charAt` is about 15 bytes), but they let a
small robot carry any policy that fits an index it already pays for, and in 1v1 the cheapest index
is the opponent's name. `MODES.charAt(e.getName().hashCode() >>> SHIFT & MASK)` is one 17-byte lookup
that returns, from the first scan, what Hadur knows about that robot (BENCH-156, `tools/distill.py
hash`). Hadur's census (`data/bench/*_cold.tsv`, 34,065 cold battles) covers 514 of the 515
MicroRumble robots with each gun's hit rate on Hadur; `tools/distill.py tiers` turns that into one
char a robot: 0 a gun stop-and-go beats (317 robots), 1 a gun worth moving at random against from
round 1 (173, hit rate 0.05 or more), 2 a rammer (24, 0.25 or more). The 515 names fit 16,384 cells
with no two robots of different chars on one cell (shift 18), under the 65,535-byte constant limit.

Eveimear 0.1 finds the strong guns itself: stop-and-go until their hits have won back 40 + 23 energy
a round (EVEIMEAR-3). That is energy paid against exactly the robots it loses to. 0.1's live
pairings, split by the table before any battle was run:

| Table says | Robots | Eveimear 0.1 APS | Survival |
|---|---|---|---|
| 0, stop-and-go | 317 | 89.95 | 95.2 |
| 1, random from round 1 | 173 | 72.68 | 81.7 |
| 2, rammer | 24 | 71.58 | 98.0 |

Three arms in `kitlab/arms`, each built by the card's prep from the teacher data in the repo, so no
table is committed: HM (714 B) plays the table instead of the detection and drops the won counter;
HP (749 B, the limit) keeps the detection and takes the lower of the two modes, so a gun the table
missed is still found, with no shift (four shared cells take the cautious reading, which saves 3
bytes); HM7 moves the random line to 0.07 (69 robots). Against a rammer the table's -2 makes
Eveimear move every tick and reverse twice as often, 0.1's anti-ram term unchanged.
`plans/pc-eveimear-h1.queue` reads the three against 0.1 on `kitlab/micro-field.txt` (48 bots x 6
seeds, about an hour). The cloud could not run battles for this card: no Robocode engine or
opponent jar reaches it, so the PC read is the first.

What the same lookup can carry next, at a few bytes each once a mode char is in hand: a power row
by opponent, the orbit distance, head-on against the robots Hadur rates M0, aim jitter against the
shielders Hadur has flagged, and, for the mini, GuessFactor bins seeded by opponent class so the gun
does not spend the first rounds learning what Hadur already knows. The nano gets one bit of it.

## 7. pc-eveimear-h1 results, and Eveimear as its own teacher (pc-eveimear-h2)

pc-eveimear-h1 (PR #516) failed every arm against 0.1 on 48 bots x 6 seeds: HM -4.78 ± 0.30, HP
-0.93 ± 0.30, HM7 -5.40 ± 0.27. Leigh's per-opponent read (`kitlab_read.py --pairs`) put the loss
on a few robots, and the table's own modes explain all of it:

| Robots | Hit rate on Hadur | Table | HM | HP |
|---|---|---|---|---|
| Ant, SleepingGoat, RaikoMicro, GFMicro, Thorn, UnfoolableNano, MirrorPM | 0.008-0.049 | 0, stop-and-go | -13 to -52 | about 0 |
| HedgehogGF, WaveShark, EpeeistDC | 0.058-0.069 | 1, random | +7.2, +5.5, +2.9 | |
| NanoSatanMelee, Capulet | 0.056, 0.080 | 1, random | -11.6, -7.1 | -13.9, -8.2 |

Every large loss is a robot the table called a weak gun. Hit rate on Hadur, a top surfer, measures
how good a gun is, not whether it beats stop-and-go: Thorn hits Hadur 1.6% of the time and is
lethal to a robot that stops. HM had no detection to fall back on and stopped for 35 rounds; HP
kept 0.1's detection and recovered those robots. The table's random calls were right (HM7, which
moved HedgehogGF, WaveShark and EpeeistDC back to stop-and-go, lost 39, 21 and 30 on them), and a
third case wants neither: NanoSatanMelee was +2.4 under HM7, which never switched.

So the modes are three, 0 random from the first hit, 1 0.1's detection, 2 never switch, and the
teacher is Eveimear. `plans/pc-eveimear-h2.queue` plays three arms on every MicroRumble robot (E01,
RN, NV; `kitlab/micro-all-field.txt`, 515 robots x 4 battles), `tools/distill.py oracle` keeps
0.1's mode for a robot unless RN or NV beat it by 2 SE and 2 APS battle by battle, and arm HB
carries the result as a bias on 0.1's threshold inside `onHitByBullet`: `won > 40 + 23 * round +
(MODES.charAt(e.getName().hashCode() >>> SHIFT & MASK) - 1) * 1000`, -1000 trips on the first hit,
+1000 never. A robot the oracle left alone plays 0.1 exactly, so HB cannot lose where the data is
thin. 745-748 bytes by the key's constants. The oracle's own gain is in sample and an upper bound;
the card reads HB against E01 on four fresh battles a robot over the whole division.
