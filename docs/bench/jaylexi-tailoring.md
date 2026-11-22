# JayLexi: per-robot tailoring on the MiniRumble gap robots (2026-11-16)

These are cloud runs on the 4-core box, all at 35 rounds with 3 workers. Each run is read per robot from its battle
results and pooled by `data/tools/multiarm.py`. The reports are in `docs/bench/local/2026-11-16_jaylexi-*.md`. c is
JayLexi 0.7 as merged (#780) and aa is its A/A rebuild.

## 1. Gap census (seeds 47000, 3 seeds)

`hadur-bench/kitlab/mini-gap-field.txt` holds the 191 robots where JayLexi 0.6 scored 2 or more points below FoilistMC
1.0 or CunobelinDC 1.2 on the live pages of 2026-11-06. Each live pairing there is a single battle.

| Arm | vs 0.7 |
|---|---:|
| FoilistMC 1.0 | +2.89 ± 0.58 |
| aa | -0.15 ± 0.34 |

The gap is real. It comes to about 1 APS (2.9 points on 191 of 669 pairings).

Nearly all of it is damage taken, not damage dealt. On most of these robots the two deal the same bullet damage, while
FoilistMC takes less and survives more. The groups:

- Rammers (25 robots on which our bullet damage is over 80 a round) carry a fifth of the gap. Examples: NanoDeath
  (survival 81% against 99%), Kowari, Fusion, FollowFire, nanoPri.
- Learning and pattern-matching guns carry most of the rest. Examples: Carpet +20, EpeeistDC +20, Freya, Paladin.
- BulletCatcher is the only gun gap: +17, with FoilistMC dealing 65 a round against our 47, even with 0.6's aim jitter.

## 2. Per-robot orbit angle (0 code bytes)

JayLexi's orbit angle sits in a string (ORB) at each robot's name-hash row, so a per-robot angle costs no bytes.

- **Screen** (seeds 47000, 3 seeds, paired with the census c). Every robot was set to 0.75, 0.95 or 1.35 rad, against
  0.7's 1.15. No single angle wins overall: 1.35 -0.04, 0.95 -0.22, 0.75 -0.63. On its best angle, 37 robots read +4 or
  more.
- **Lock** (12 fresh seeds from 48000, each robot on its own pick). 4 robots hold:

| Robot | Orbit | vs 0.7 |
|---|---:|---:|
| suh.nano.RammingC 1.00 | 0.75 | +3.5 ± 1.5 |
| ry.LightningBug 1.0 | 0.95 | +4.3 ± 2.3 |
| blir.nano.Bruce R1.0.0 | 0.95 | +3.5 ± 1.6 |
| stelo.MirrorMicro 1.1 | 1.35 | +5.4 ± 4.4 |

The other 33 picks were noise: the three lock groups read +0.25, +0.20 and +0.82. The 4 lines add about +0.025 APS.

## 3. BulletCatcher gun jitter (0 bytes)

The jitter scale is read from the orbit char: `(int) orbit >> 2`, so 2 pi more gives one step. More steps lose (12 fresh
seeds from 48000):

| Orbit char | Jitter | vs 0.7 |
|---|---|---:|
| +4 pi | ±0.375 rad | -11.7 ± 3.4 |
| +6 pi | ±0.625 rad | -21.1 ± 5.2 |
| +8 pi | ±0.75 rad | -20.0 ± 3.9 |

0.7's ±0.125 stays.

## 4. Byte levers, tested over the limit first (4 seeds from 49000)

| Lever | Panel | Bytes | vs 0.7 |
|---|---|---:|---:|
| R1: orbit 0.4 rad further out inside 200 px | 25 rammers | 1,516 | +0.92 ± 0.66 |
| R3: drive straight away inside 150 px | 25 rammers | 1,512 | -3.13 |
| L1: danger choice with ±30% noise | 30 learning guns | 1,507 | +0.39 ± 0.95 |
| L2: orbit ±0.3 rad at random each scan | 30 learning guns | 1,515 | +0.25 ± 1.1 |

R3 is dead. L1 and L2 are flat, so a less predictable path does not close the learning-gun gap. R1 went on to the whole
mini field (`kitlab/mini-wide3-field.txt`, 112 robots):

| Run | R1 | R1b (0.3 inside 300 px) | R1c (0.55 inside 200 px) | A/A |
|---|---:|---:|---:|---:|
| seeds 50000, 3 seeds | +0.35 ± 0.44 | +0.08 ± 0.41 | | -0.28 ± 0.38 |
| seeds 51000, 4 seeds | +0.29 ± 0.32 | | -0.03 ± 0.32 | +0.16 ± 0.33 |

## 5. Bytes: a distance slot in the orbit table

R1 as an `if` costs 21 B, and 0.7 has 1 B to spare. The fix is to read ORB at the robot's AIM row (stride 47) plus
`(int) (distance / 50)` instead of at `row / BINS`. Dropping the division pays for the add, and `band`, the raw
distance / 50 bucket the gun and power already use, is now set on that line. The result is 24 orbit slots per robot,
one per 50 px, at **1,495 B**, the same as 0.7, so any robot can have its own orbit by range for 0 bytes.

## 6. Confirm: retreat-close for every robot does not hold

Built that way with R1 for every robot plus the 4 orbit lines (arm T), against 0.7 on `mini-wide3` (seeds 52000, 4
seeds):

| Arm | vs 0.7 |
|---|---:|
| T | -0.12 ± 0.35 |
| aa | +0.32 ± 0.30 |

Over the three sets, R1 for every robot reads about +0.16 with its low end below 0, so it is not a field-wide rule.

## 7. Per-robot retreat-close (12 fresh seeds from 53000)

The 8 rammers whose R1 read +2.4 or more on the rammer screen:

| Robot | R1 vs 0.7 |
|---|---:|
| blir.nano.Bruce R1.0.0 | +3.3 ± 0.9 |
| stelo.Lifestealer 1.0 | +3.1 ± 1.1 |
| pmc.SniperBot 1.0 | +2.4 ± 1.3 |
| suh.nano.RammingC 1.00 | +1.4 ± 2.0 |
| step.nanoPri 1.0 | +1.3 ± 1.8 |
| mn.nano.perceptual.Impact 1.3.0 | +0.7 ± 2.3 |
| sheldor.nano.SabreuseNano 1.1 | -0.2 ± 2.8 |
| maribo.FollowFire 1.11 | -0.6 ± 1.7 |

Bruce and Lifestealer clear the 3-point bar. Bruce's orbit-0.95 line (+3.5) and its R1 line (+3.3) were never measured
together. 0.8 takes R1 for Bruce, which has the tighter interval.

## JayLexi 0.8

0.8 is 0.7 with these lines, all at 1,495 B:

| Robot | Orbit | Locked read |
|---|---|---:|
| RammingC | 0.75 | +3.5 ± 1.5 |
| LightningBug | 0.95 | +4.3 ± 2.3 |
| MirrorMicro | 1.35 | +5.4 ± 4.4 |
| Bruce | 1.15, 0.75 under 200 px | +3.3 ± 0.9 |
| Lifestealer | 1.15, 0.75 under 200 px | +3.1 ± 1.1 |

That comes to about +0.03 APS. The readable reference keeps one orbit char a robot plus a NEAR char (40 for Bruce and
Lifestealer). A replay test checks that every slot of the shipped table follows that rule (JAYLEXI-21). Nothing is
released.

## 8. Movement screens on 0.8 (2026-11-18 and 19)

All on `mini-wide3` (112 robots), 3 seeds a set, each set fresh, against 0.8 (c). The reports are in
`docs/bench/local/2026-11-18_jaylexi-n1.md` to `n4.md`.

| Set (seeds) | A/A | Arm | Change | Bytes | vs 0.8 |
|---|---:|---|---|---:|---:|
| n1 (54000) | -0.13 | D3 | surf log depth 0.85 to 3 | 1,495 | +0.37 ± 0.35 |
| | | D10, D30 | depth 10, 30 | 1,495 | -0.22, -0.74 |
| | | P2 | danger over distance squared, not to the 4th | 1,495 | -0.03 |
| | | WH | drop waves that are wall hits or rams | 1,559 | +0.10 |
| n2 (55000) | +0.22 | D2, D3, D5 | depth 2, 3, 5 | 1,495 | -0.22, -0.02, -0.23 |
| | | K4, Kq | surf kernel 4 times narrower, 4 times wider | 1,495 | -0.42, -0.03 |
| | | W3 | third wave at a ninth | over | +0.16 |
| n3 (56000) | -0.16 | DC1 | orbit += (distance - 450) / 1000 | 1,511 | +0.30 ± 0.40 |
| | | DC2 | the same over 500 | 1,511 | -0.20 |
| | | FL20, FL5 | flattener: log missed waves too, depth 20, 5 | 1,512 | -0.17, -0.85 |
| n4 (57000) | -0.06 | TI2 | danger prediction counted from tick 2, not 3 | 1,495 | +0.50 ± 0.44 |
| | | ST160, ST120 | wall stick 160, 120 (from 140) | 1,495 | +0.40, -0.24 |
| | | DC1 | (repeat) | 1,511 | +0.20 ± 0.39 |
| | | DC3 | distance control centred on 350 | 1,511 | +0.15 |
| | | TI4 | counted from 4 | 1,495 | -0.33 |

The surf's own settings (depth, kernel, a third wave, a flattener) are dead: D3 did not repeat. Lock, 12 fresh seeds
(6 from 58000, 6 from 59000), report `docs/bench/local/2026-11-19_jaylexi-lock12.md`:

| Arm | Seeds 58000 | Seeds 59000 | 12 seeds |
|---|---:|---:|---:|
| TI2 | +0.32 ± 0.25 | +0.26 ± 0.36 | **+0.29 ± 0.23** |
| DC1 | +0.31 ± 0.27 | +0.02 ± 0.29 | +0.16 ± 0.22 |
| DST (TI2 + ST160 + DC1) | +0.28 ± 0.33 | +0.01 ± 0.39 | +0.15 ± 0.25 |
| ST160 | +0.19 ± 0.28 | | |
| aa | -0.28 ± 0.25 | -0.18 ± 0.29 | -0.23 ± 0.18 |

TI2 holds on all three sets (15 seeds), with its 12-seed low end above 0, and costs no bytes. DC1 and ST160 do not hold
and are not shipped.

Why it should help: the prediction walks our path one tick at a time until the wave reaches us and reads the danger
at that spot. The start tick sets how far the wave is taken to have come already. From 3, the wave is a tick further
along than from 2, so the scored spot is a tick short of where we will be. That is our reading of the result, not a
measured timing trace; TI4 (a tick earlier still) losing -0.33 fits it.

Around 0.9 (seeds 61000, 3 seeds, against 0.9, A/A +0.13 ± 0.42; `docs/bench/local/2026-11-19_jaylexi-n7.md`): counting
from tick 1 reads -0.06, so tick 2 is the peak (1 -0.06, 2 +0.29, 3 0, 4 -0.33 against 0.8). The second wave at a half
reads +0.11 and at a third +0.26 ± 0.44, but the third reads +0.04 ± 0.27 on 6 fresh seeds from 62000
(`2026-11-19_jaylexi-n8.md`): flat, not shipped.

## JayLexi 0.9

0.9 is 0.8 with TI2 (JAYLEXI-22), at 1,495 B. The readable reference holds the start tick in a field, and a replay test
shows that 0.8's tick 3 gives other orders. Nothing is released.

## 9. More constants on 0.9 (seeds 65000, 3 seeds, A/A -0.09)

`docs/bench/local/2026-11-19_jaylexi-n9.md`. All 1,495 B, all flat: danger over distance cubed +0.20 ± 0.46, to the 5th
+0.07; the aim prior at twice its weight +0.12, at half -0.00; wall smoothing step 0.03 +0.07, 0.08 -0.20. With n1 to
n8, the 0-byte constants of the surf are tuned out: only the prediction's start tick (0.9) moved the score.

## JayLexi 1.0

1.0 is 0.9 with SB1 (JAYLEXI-23), at 1,486 B: the surf stats keep one distance band instead of 0.9's four (under 150,
350 and 550 px). The readable reference keeps the four in a switch, and a replay test shows they give other orders.

## 10. Coarser surf stats on 0.9 (2026-11-20, seeds 73000 to 95000)

Each segment of the surf stats was dropped in turn (n12, n12b; 3 seeds each). Walls (SW0 -0.77, -0.68) and our lateral
speed (SL1 -0.72, -0.33) carry their weight; the distance bands do not (SB1 +0.01, +0.33). Re-using the freed slot
for other keys read flat or worse: our advancing speed SV -0.02, enemy energy SE -0.29, finer close bands SD +0.37 then
+0.01, and SD2 to SD5 failed (SD2's 12-seed lock +0.03 ± 0.24).

SB1 alone:

| Read | Seeds | SB1 against 0.9 |
|---|---|---|
| n16 (L) | 3 from 83000 | +0.38 |
| lock (L) | 12 from 84000 | +0.23 ± 0.20, low end +0.03: passes |
| sb1x (A) | 6 from 85000 | +0.18 ± 0.30 |
| bxc (C) | 6 from 88000 | +0.20 ± 0.29 |
| bxo | 4 from 90000 | -0.01 |
| sbsd head to head (L) | 12 from 93000 | +0.56 ± 0.24 |
| sb1y | 6 from 95000 | +0.04 |

Small but the same sign on almost every read: about +0.2 pooled. The reading: four bands split about 30 waves a round
four ways, so each band's stats stay thin for most of a battle; where an enemy's aim does change with distance, the
walls and lateral speed segments already carry most of it. pc-jaylexi-10 (BENCH-266) checks it on all 668 MiniRumble
robots against 0.9 before any release.

## JayLexi 1.1

1.1 is 1.0 with three changes, at 1,447 B. Box A rewrote 43 bytes of 1.0 with identical play (the replay tests compare
orders bit for bit), for example surf stats in spare gun rows and a Wave constructor. The fire gate is JAYLEXI-24, and
two per-robot lines go in the free strings. The readable reference holds the gate behind a switch, and a replay test
shows 1.0's flat gate gives other orders.

## 11. Movement and gun on 1.0 (2026-11-20, seeds 96000 to 107999)

Two gap runs against FoilistMC (C 97000, D 96000; 6 seeds each) put the 1.0 gap at -0.8 to -0.9 APS. It was mostly
damage taken: chargers hit us under 150 px after 40+ ticks without a reversal, and learning guns hit us 20 to 40% more
at every range.

Movement levers, all level or worse:
- forced reversals at any range (FR15 -15.7, FR20 -9.1, FR30 -7.6), soft (SP20 -0.14, SP40 0.00), close-only (FC10 -1.72,
  FC15 -1.10, FC20 -0.59) and on enemy fire (RF8 -8.82, RF15 -4.96);
- a light flattener (F1 +0.09, F2 +0.04, F3 -0.17);
- danger averaged over our body width: K3 led on 3 seeds (+0.39), then read +0.06 ± 0.20 over 12; the 1,499 B form T4
  failed its 12-seed lock (-0.04 ± 0.26).

Gun: a truth-logged gap run found no missing segment. It found a 3 degree fire gate and a power gap.
- Tighter gates lose: 600/d -0.59, min(3, 860/d) -0.07.
- Looser gates up close pay: 1200/d (F12) +0.66 ± 0.34 on 6 seeds, then +0.35 ± 0.26 (low end +0.09) on a 12-seed lock.
  The gain is +3 to +4 points on chargers (xbots, UbaRamLT, FollowFire, Mjolnir, Leopard); learning guns give a little back.
- Power 3 / 2.5 / 2 read +0.05 on its 12-seed lock: dead.

Per-robot lines (0 code bytes):
- Leopard 0.75 rad inside 200 px: +4.39 ± 1.68 on 12 seeds.
- uCatcher aim jitter: +0.93 ± 0.53 on 24 seeds.
- BasicBulletShielder and RingDing jitter were level.

pc-jaylexi-11 (BENCH-268) never ran. pc-jaylexi-12 (BENCH-269) replaces it and checks 1.1 and 1.2 against 1.0 together.

## JayLexi 1.2

1.2 is 1.1 with five per-robot lines, at 1,451 B. POWER is now one row per robot, read at POWER.charAt(row + band) like
AIM and ORB, which costs 4 bytes. FoilistMC and CunobelinDC get power 1 from 500 px (JAYLEXI-25). Mark8,
CannonfodderMicro and Charo get orbit 1.35 rad in every slot. Every other robot's tables are 1.1's. The readable
reference holds the power rows behind a switch, and a replay test against FoilistMC's row shows 1.1's power gives other
orders.

## 12. Gate locks, energy and lines on 1.1 (2026-11-21, seeds 100300 to 113999)

Gate head to head on 1.1, 12 fresh seeds each (boxes A, B, C, D):
- 1.1 held against 1.0 on three fresh locks: +0.36 ± 0.26, +0.31 ± 0.29 and +0.27 ± 0.25 (GM, its twin on 1.0), every
  low end above 0.
- No other gate beat 1.1: max(3, 860/d) -0.00 ± 0.18, max(3, 1200/d) +0.01 ± 0.16, 10 degrees flat +0.11 ± 0.30,
  30 degrees under 300 px -0.04 ± 0.20, under 200 px -0.18 ± 0.20. The gain is close range, and 1.1 already has it.
- The wider gate cuts damage taken, not hit count: shots per round barely move and hits stay flat. Bullet-on-bullet
  collisions do not explain it (2.31 and 2.35 a round).

Learning guns (box C, truth logs, 65 robots, 6 seeds from 108000):
- They do not hit JayLexi more often per shot than FoilistMC: 0.072 against 0.070. No split shows a real difference
  (distance, corners, surfed or second wave, ticks since reversal, round).
- The gap is the energy race against ten strong learners. Past 500 px, where about 90% of our shots go, we fire 1.47 and
  FoilistMC 0.97, so we die 50 to 200 ticks sooner.
- Power 1 past 600 or 500 px as a field rule loses (-0.51, -0.90): +0.7 on the ten, -0.6 to -1.0 on the rest. Cut only
  while the enemy has more energy, it is level (-0.08, -0.12): too late. As a ten-robot line it is level (+0.18 ± 1.24).
- Per robot, it holds on CunobelinDC (+2.64 ± 2.02, 48 seeds) and FoilistMC (+6.62 ± 2.21, 24 fresh seeds).

Lines through the tables, by gap rank against FoilistMC:
- Top 15 plus Needle, WaveShark, Freya and CopyKat (box G): Charo orbit 1.35, +3.4 ± 1.7 over 24 seeds. Continuation
  and Apollon failed.
- Ranks 16 to 35 (box D): Mark8 +1.41 ± 0.76 and CannonfodderMicro +1.19 ± 0.47 (orbit 1.35, 24 seeds each). Orbit 1.35
  on all 18 diagnosed robots averaged +0.01: closing in is not a general fix.
- Ranks 36 to 55 (box B): none held. Past rank 35 the gap is under a point a robot, so the tranches stop there.
- The MiniRumble top ten (box C): only FoilistMC's power line held. Orbit -0.20 and +0.20 past 450 px both failed.

Whole-field cloud lock of 1.2 against 1.1 and an A/A copy (12 seeds from 112300): -0.05 ± 0.21 and -0.02 ± 0.17. The
107 robots without a line move no more than the A/A does, as they should. The line robots read +6.62 (FoilistMC),
+1.41 (CunobelinDC), +0.90 (Mark8) and +0.59 (CannonfodderMicro), and Charo -1.16, so Charo pools to about +1.9 over
36 seeds. The lines come to about +0.07 APS on the field.

Also closed on 1.1: orbit 0.95 or 1.35 by distance band at 200 to 500 px (level), and a deeper surf hit memory (depth 3
+0.23, depth 10 -0.11 on 3 seeds; linear aimers level). Linear aimers do hit JayLexi more than FoilistMC from round 5
on (3.7% against 2.6%), and the data points at reach: the surf picks only full speed back or forward.

## 13. JayLexi 1.3: hits that were never logged (2026-11-22, seeds 115000 to 115032)

Twelve movement-mechanic prototypes on 1.2 failed overnight: wall rocking, a speed dip, mid-flight reversals, seven
surf options, leaning in, four danger-estimate tweaks, destination surfing, a timed reversal plan and wave-only
turn-backs. FoilistMC's movement on JayLexi's gun (the FmJg hybrid) still beat 1.2 by +1.2 to +2.4. Its turn-backs
landed on spots that were hit less in every reversal class.

Reading what the surf learns from found the cause. 1.2 drops an enemy wave about the tick its bullet reaches it, before
onHitByBullet runs. On 6 robots (1 seed, 35 rounds) an instrumented 1.2 matched only 93 of 376 hits on it to a live
wave (25%), and the rest were never logged. Logging on the live waves plus the ones just dropped matched 730 of 746
(98%).

| Arm (cloud) | Bytes | 24 hybrid-gain robots, 3 seeds: vs 1.2 / enemy hit % | 145 robots, 3 seeds: vs 1.2 |
|---|---:|---|---|
| 1.2 | 1,451 | - / 7.16 | - (A/A +0.05 ± 0.12) |
| wd: log on live + the last six dropped waves | 1,689 | +1.50 / 6.61 | +1.52 ± 0.27 |
| **wdt = 1.3: log on live + the one dropped last** | **1,486** | | **+1.10 ± 0.11** |
| k: wd + a hit memory weighted by situation | 2,102 | +3.11 ± 1.22 / 6.02 | +2.29 ± 0.18 |
| km: k cut to 3 features | 1,725 | | +1.62 ± 0.04 |

1.3 ships wdt, at 1,486 B. The dropped-wave slot is cleared each round and is null until
that round's first drop, when the search stops there, so a round never logs on the last round's wave. The hit
memory (k) is the next step (1.4), once it fits the byte limit; its idea is dynamic-clustering surfing (RoboWiki), with
FoilistMC 1.0 and CunobelinDC 1.2 as the reference, written as JayLexi's own code. The PC confirm is `pc-jaylexi-13`
(BENCH-274).

## Where this leaves JayLexi

- The gap to FoilistMC on its gap robots is real, about 1 APS, and it is movement: damage taken.
- Per-robot tailoring through the free strings closes very little of it: 5 lines, about +0.03 APS. The rest of the
  gap is spread thin. Most robots show 3 to 10 points, and on 12 fresh seeds those fall back to noise.
- A field-wide movement fix does exist: the prediction count in 0.9, +0.29 on 12 seeds.
- None of the levers tested close the gap against learning guns: orbit angle, path noise and gun jitter. The leader's
  lead there is in how its surf is built (docs/bench/jaylexi-own-movement.md).
