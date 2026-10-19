# Plan: the midrange loss (ranks 51-400) in the 1v1 census

2026-10-19. A deep read of the PC census of 2026-10-18 (`pc-1018-stack`: 3.13hjsw against the 3.13
release, all 1,212 robots, 4 seeds, with `census_classify`'s movement and gun class for every
opponent) against the live BotDetails pages of 3.13 and the six robots above it (2026-10-15), and
against the earlier censuses of Diamond, ScalarR and Nullstride as subjects. Tables come from
`data/tools/midrange_gap.py`; the commands are at the end.

## The finding in one paragraph

Ranks 51-400 hold **1.45 APS** of the 3.04 to DrussGT. Half of the midrange is shield-listed and
level; the loss is on the **184 unlisted robots (+0.90 APS to DrussGT)**, and inside those on
**149 random movers with guess-factor guns** ("flat x learning": no simple or learning offline gun
hits their movement 22%, their shots match no simple aim): **+0.74 APS to DrussGT, +0.74 to
Diamond and ScalarR, +1.2 to Nullstride.** Hadur scores 76.8 on them where DrussGT, Diamond and
ScalarR score 82-84 and Nullstride 87. The gap is uniform (the median robot is 5.6 damage a round
worse than the peers' mean; the worst 30% hold 52%), so there is no short list to fix robot by
robot. On the bench, from round 3 on, Hadur **deals 5.7 and takes 3.2 bullet damage per 100 ticks**
against them; Diamond 6.1 and 2.7, ScalarR 7.3 and 2.8, Nullstride 6.8 and 2.1. Both halves of the
exchange are short, and neither side learns during the battle: Hadur's damage taken is flat at
25 a round from round 3 to round 34 and so is theirs. Hadur fires these robots at an average
bullet power of **1.5** (the 1.20-era cubic power-down, because it is below 63 energy most of the
battle), while hitting them 15% to their 7%. The 432 flat x learning robots across the whole field
show the same shape and are worth 2.9 times as much: +1 point on each is +0.35 APS.

## Where the 1.45 lives

Live APS that each robot above Hadur gains over it, by the opponent's rank (sum of the
per-opponent difference over Hadur's 1,217 pairings):

| Ranks | Opponents | Hadur | DrussGT | to DrussGT | to BeepBoop/Nullstride/DrussGT mean | to Diamond/ScalarR mean |
|---|---|---|---|---|---|---|
| 1-10 | 9 | 46.7 | 49.2 | +0.02 | +0.12 | +0.05 |
| 11-50 | 40 | 66.4 | 72.3 | +0.20 | +0.43 | +0.13 |
| **51-200** | 150 | 81.2 | 86.2 | **+0.62** | +0.93 | -0.19 |
| **201-400** | 200 | 85.4 | 90.5 | **+0.83** | +1.11 | -0.03 |
| 401-700 | 300 | 89.2 | 92.6 | +0.84 | +1.24 | +0.53 |
| 701+ | 518 | 96.2 | 97.4 | +0.53 | +0.75 | +0.69 |

Diamond and ScalarR do not shield, so against the shield-listed half of the midrange they lose
1.2 APS to Hadur, which hides what they gain elsewhere. By shield group, ranks 51-400:

| Group | Opponents | Hadur | to DrussGT | to Diamond | to ScalarR | to Nullstride |
|---|---|---|---|---|---|---|
| On Hadur's list | 131 | 92.9 | +0.30 | -1.21 | -1.20 | +0.42 |
| On Nullstride's list only | 35 | 79.6 | +0.26 | +0.07 | +0.08 | +0.33 |
| **On neither** | 184 | 77.7 | **+0.90** | **+0.80** | **+1.03** | **+1.55** |

So the midrange loss is not the shield (that is level with DrussGT and ahead of Diamond). It is the
unlisted robots, where every robot above Hadur, shielding or not, is 0.8 to 1.5 APS ahead.

## Who the unlisted midrange robots are

The 184 by `census_classify`'s classes (movement x gun), with the bench exchange of 3.13 against
them (the census baseline, 4 seeds):

| Class | Opponents | Hadur live | DrussGT | Diamond | ScalarR | to DrussGT | to Dia/Scal | Taken/rd | Their hit |
|---|---|---|---|---|---|---|---|---|---|
| **flat x learning** | **149** | 76.8 | 82.8 | 82.1 | 83.6 | **+0.74** | **+0.74** | 24.4 | 7.2% |
| flat x mixed | 11 | 85.4 | 92.0 | 91.3 | 90.9 | +0.06 | +0.05 | 15.8 | 6.1% |
| oscillator x learning | 6 | 77.9 | 84.5 | 82.0 | 83.9 | +0.03 | +0.03 | 24.2 | 7.9% |
| rammer x linear | 5 | 71.9 | 77.8 | 81.6 | 86.8 | +0.02 | +0.05 | 62.3 | 50% |
| stat-prone x learning | 7 | 85.8 | 89.6 | 86.3 | 87.7 | +0.02 | +0.01 | 21.2 | 8.6% |
| the other 6 classes | 6 | | | | | +0.03 | +0.03 | | |

"Flat" means none of the five offline guns (head-on, linear, circular, guess-factor, segmented
guess-factor, each aimed from Hadur's true position) hits the robot's movement 22% of the time: a
well-randomised mover or a surfer. "Learning" means 60%+ of its shots match no simple aim. In the
midrange these are mostly minis and micros with a plain guess-factor gun and a random or
oscillating drive, such as Cotillion, SavantMicro, BlackSwans, Pantheist, CloudBot, Bakko,
MatchupWS, Speusippus, RainbowBot, FlowerBot, Yoda, Chord and BlackWidow. The first 149 of
`hadur-bench/flat-gf-mid.txt` are this class in rank order; `flat-gf-all.txt` is the same class
over the whole field (432 robots, 81.2% bench share, +1.68 APS to Nullstride).

The live pages (one pass, 1 to 4 battles each) and the bench agree on these robots: live 76.8 and
bench 76.9 on the 149, correlation 0.90 over the midrange. The bench sees what the rumble sees.

## What the exchange looks like against the 149

Per-tick rates from round 3 on, from each subject's census rounds against the same 149 robots
(`midrange_gap.py rates`), and damage taken a round by round bucket:

| Subject | Ticks/round | Dealt/100t | Taken/100t | r0 | r1-2 | r3-9 | r10-19 | r20-34 |
|---|---|---|---|---|---|---|---|---|
| Hadur 3.13 | 775 | 5.70 | 3.21 | 29.5 | 26.8 | 25.6 | 24.7 | 24.7 |
| Diamond 1.8.22 | 762 | 6.14 | 2.72 | 22.2 | 22.9 | 21.7 | 20.7 | 20.2 |
| ScalarR (no shield) | 716 | 7.26 | 2.76 | 25.1 | 23.1 | 21.1 | 20.0 | 19.0 |
| Nullstride 2.3.3 | 746 | 6.78 | 2.06 | 14.7 | 16.8 | 16.4 | 15.4 | 14.8 |

- **Both halves are short.** Hadur deals 7% less per tick than Diamond and 21% less than ScalarR,
  and takes 18% more than Diamond and ScalarR, 56% more than Nullstride. Rounds are also the
  longest, so per round the gap is wider (24.7 taken against 19-20).
- **Nobody learns much.** Every subject's damage taken is nearly flat from round 3. These guns are
  stationary guess-factor histograms; the surf has nothing to adapt to after the first rounds, and
  Hadur's surf, which is Diamond's eleven views with Diamond's weights, is simply hit more where
  it stands. The earlier hit forensics (stage 0 of plan-top3) already said the danger model knew
  the angle and the three full-commitment options did not reach a safer one.
- **Skipped turns are a small part.** Rounds with a skipped turn take 29.0 against 24.6 without,
  but they are 13% of rounds: about 0.6 damage a round of the 24.7.
- **Bullet power is low.** Against the 149, 3.13's bullets average power 1.54 (quartiles 1.29 to
  1.76; only 16% of shots at full power), against 2.7 on ranks 401+. The duel power rule is
  1.20's: 1.95 beyond 150 px, cut to 1.95 times the cube of our energy over 63 whenever we are
  below 63 (which, taking 25 a round, is most of the battle). POW-2 (full power when our rate is
  over 20% and theirs under 10%) never fires: Hadur hits them 15%. A power-1.5 bullet does 7
  damage for 1.5 energy; power 2.5 does 13 for 2.5, more damage per energy spent (Robocode's
  damage curve is convex), it ends the round sooner, and a random mover does not dodge a slower
  bullet any better. ScalarR's dealt rate, 27% above Hadur's, is the rate of a gun that keeps its
  power up against a robot it out-hits.

## What the data rules out

- **A per-robot switch table.** Choosing, robot by robot, between the stack and 3.13 on two of
  the census seeds and scoring that choice on the other two gives +0.18 APS against +0.20 for the
  stack everywhere (`midrange_gap.py split`, all six halvings). Per-robot differences in a
  4-seed run are seed noise (the median robot's seed-to-seed spread, 2.4 points, equals the spread
  between robots). Per-robot lists work for the shield, where the effect is all-or-nothing; for
  movement and power the per-robot form is a class list to screen on and an in-battle gate that
  reads the opponent (the hit-rate margins DIAL-1 already keeps per opponent and stores in the
  profile).
- **The movement switches tried so far.** On the 149, from the 400-robot screens and PC runs that
  cover 49-73 of them: stop-and-start +0.2 to +0.3 points, flattener at 8% (hjf8) +0.58 +/- 0.59
  (PC, 8 seeds, 49 robots), at 5.9% +0.21 +/- 0.66, regime switch -0.02, replicator -0.16, gun
  split -0.12, gun gate -0.17, the stack itself 0.0. Nothing moves this class by the 5 points it
  needs; hjf8 is the one with a consistent sign.
- **Learning speed, detection and distance.** Damage taken is flat from round 3 (not learning);
  hits with no wave are under 1% (plan-top3 stage 0); the 3.12 distance ablations (`f5`, `aw`,
  `ne`) were level on the whole field, and a longer range cuts our 15% hit rate as much as their
  7%.

## The plan

Every candidate is a duel-only switch, off by default, with tests; melee and team code and
fixtures stay untouched (Leigh's isolation rule). The gate on the class set is **+2.0 points a
robot with the interval above zero** (that is +0.24 APS on the 149 and about +0.7 on all 432 of
the class if it carries), the guard sets no worse than -0.5, and then the usual whole-field
census at +0.3 APS, no band below -0.05.

### Stage 1: pressure power (POW-12) and the flattener threshold, on the PC

**Result (2026-10-19, closed, see `docs/bench/local/2026-10-19_pc-midrange-read.md` and
`2026-10-19_pc-midrange-2-read.md`): the hypothesis is wrong.** The margin gate never opened
(0.0 ± 0.3); the power change with no gate is -2.2 ± 0.4 points on the 149 and -2.3 ± 1.1 on the
top 50 (2.5% more damage a round, 1.9 points less hit rate from the slower bullet, 7.5 points less
survival from the energy spent); gated on the centres -0.6 ± 0.3. The flattener at 8% is
+0.5 ± 0.3. Hadur's 1.54 average power against the class is not a leak; the dealt gap is hits and
the taken gap is the surf, so stages 2 and 3 carry the midrange. POW-12 stays off in every form.


**POW-12, "pressure power"** (built on the 1v1 branch at 8f325cdb as a `GunController.Stakes`
level, `PRESSURE`, that sets the gun's base power, not a `PowerPolicy` `Reason`; switch
`PowerDesign.PRESSURE`, off by default; ablation `pressure`, suffix `pw`):
while this battle's rolling estimates say our hit rate less its margin is at least 12% and their
hit rate plus its margin is at most 9% (the DIAL-1 estimates POW-2 and POW-4 already read), and
our energy is above `MIN_OUR_ENERGY`, the 1v1 gun power skips the cubic power-down and uses a
base power of 2.5 beyond 150 px (2.95 inside stays). Everything downstream is unchanged: POW-1
to POW-4 may still raise it to 3.0, POW-5's T3 cap, the quarter-of-their-energy kill cap, END-3,
END-4, RAM-1, SHIELD-4 and the lead-aware regime (POW-7 to POW-9) all apply in their present
order. The gate also requires the lead regime to be off: when both hold at once (its 12.5% bound
is on the central estimates, the pressure gate on the margins, so they can overlap) the pressure
rule yields, so the lead regime's power is never changed. A weaker form, **`pdown`** (suffix
`pd`, `PowerDesign.PRESSURE_BASE_ONLY_POWERDOWN`, built alone, never with `pressure`): the
power-down skipped under the same gate, base power 1.95 kept.
Expected on the 149: dealt per tick up 20-35%, rounds 10-15% shorter, taken per round down with
them: +2 to +4 points a robot if the energy holds, which the gate's margins are there to ensure.
Risk: an energy war against a gun that starts hitting us later; the gate drops the rule as soon
as their rate climbs, and the guard set (the top 50) checks it.

**MOVE-5 flattener at 8%** (`flt8`, exists): the one movement switch with a consistent sign on
this class. Screened alone and stacked with POW-12.

The queue is `hadur-bench/plans/pc-midrange.queue`: prep builds 3.13hjsw (the stack the census
measured) and the candidates from the 1v1 branch (`claude/project-thread-du09qh`, where the
`pressure`, `pdown` ablation codes are in `build-ablation.sh` since 8f325cdb), then on
`hadur-bench/flat-gf-mid.txt` (the 149) at 8 fresh seeds (1011-1018), each paired against
3.13hjsw: `pw`, `f8`, `pwf8` (about 3 hours each at the census's rate), then `guard` (the census top 50,
`hadur-bench/guard-top50.txt`, 4 seeds, on `pwf8`), then `pd`. Read each with
`data/tools/screen_paired.py ROWS ROUNDS --candidate ... --baseline "hadur2.Hadur 3.13hjsw" --set
hadur-bench/flat-gf-mid.txt`; the "All" row is the mean over the 149 in points. If the stack is
dropped in favour of 3.13, the queue's `BASE` line and the candidate builds change and nothing
else. A candidate that clears the class gate and the guard goes to the whole-field census (the
commented `census` step, 13 hours), paired against the 3.13 release as `pc-1018-stack` was.

Implementation (done on the 1v1 branch, commit 8f325cdb, tests green): `Stakes.PRESSURE` and
`PRESSURE_DOWN` in `GunController`, the switches in `PowerDesign` (off by default), the
`pressure` and `pdown` lines in `build-ablation.sh`, unit tests for the gate (on, off at the
margins, off while the lead regime holds, off under the energy floor of 12), and EARS lines
POW-12 in `docs/requirements.md`.

### Stage 2: the surf's fidelity to Diamond, in the cloud

**Result (2026-10-19, see `docs/bench/local/2026-10-19_surf-audit-diamond.md` and
`2026-10-19_pc-midrange-3-read.md`):** the port is structurally faithful; six differences
were switched and screened on the 149 (PR #214): hold650 +0.1, dfac -0.3, bhb 0.0, hitclr +0.4,
pkern +0.5, keep2 +0.4 (each ± 0.5). None near the +2.0 gate. Forensics: 57% of the damage taken
on the class had another option that would have dodged it, so the loss is option ranking on
angles already rated. One stacked confirm (hitclr + pkern + keep2, with and without the 8%
flattener) runs as `pc-midrange-4`; keep rule +1.0 on the class, then guard and census.


Hadur takes 18% more per tick than Diamond against these robots with Diamond's own danger views
and weights, so the port differs from the original somewhere that matters against a stationary
guess-factor gun. Diamond 1.8.22's source ships in its jar (used for `docs/top3-movement-study.md`).
A side-by-side audit of `SurfMover`/`MoveController` against `DiamondMove`, one item at a time,
each difference becoming a switch screened on `flat-gf-mid.txt` in the cloud (4 seeds, paired
against the stack):

1. The desired distance and the attack-angle curve (Hadur's DIST-1 walk-in to 400-450 px is
   Hadur's own; Diamond holds its distance with a different retreat angle).
2. The hit-rate normalisation that switches views on (`TYPICAL_ESCAPE_RANGE`, the 0.1/width
   weighting) against Diamond's, since it decides when the 600-weight recent views and the
   550-weight flatteners take over the danger average.
3. The precise-intersection danger kernel and the no-data fallback.
4. The second wave's weight and the wall stick.
5. Where the 1.07 skipped turns a round come from against this class (issue #169), since the
   skip rounds take 4.4 more.

The first two are the likeliest: the stop-and-start and flattener results say the option set and
the view mix both matter a little on this class, and the walk-in is the one movement policy
Hadur added on top of the port.

### Stage 3: the gun against random movers (if stage 1 leaves dealt short)

After POW-12, if Hadur's dealt rate on the class is still under ScalarR's, the main gun's kernel
width and k against flat movers: the offline guess-factor gun hits these movers 11.2% and
Hadur's 15.2%, so the gun is already better than a plain histogram, and this stage is a
measurement first (hit rate by distance band against the 149, against the segmented offline gun's
13.2%), not a switch.

## What to expect

| Lever | Scope | Expected | Gate | Result |
|---|---|---|---|---|
| POW-12 pressure power | 149, then the 432 of the class | +0.3 to +0.6 APS | class +2.0, guard, census +0.3 | **failed: -2.2 ± 0.4 pts ungated, -0.6 ± 0.3 gated** |
| flattener 8% | the same | +0.05 to +0.1 | with POW-12 | +0.5 ± 0.3 pts, rides the next pass |
| surf fidelity (stage 2) | the 184 unlisted midrange and below | +0.3 to +0.8 | per switch | six switches ≤ +0.5 each; stack hc+pk+w2 confirming |

Together they are the midrange's 0.9 APS to DrussGT if all of it comes in, which is the largest
single block left on the road to top 3.

## Reproducing the tables

```
P=data/rumble/parsed/2026-10-15T1100Z_roborumble_botdetails_
python3 data/tools/midrange_gap.py gap docs/bench/local/2026-10-18_census-classes.tsv \
  data/rumble/parsed/2026-10-15T0556Z_roborumble_botdetails_hadur2.Hadur_3.13.csv \
  ${P}jk.mega.DrussGT_3.1.16.csv ${P}voidious.Diamond_1.8.22.csv \
  ${P}aaa.r.ScalarR_0.005h.053-noshield.csv ${P}jd.Nullstride_2.3.3.csv \
  --rankings data/rumble/parsed/2026-10-15T0556Z_roborumble_rankings.tsv \
  --list hadur-bench/shield-313.txt --other-list hadur-bench/shield-nullstride.txt
B=data/bench
python3 data/tools/midrange_gap.py rates hadur-bench/flat-gf-mid.txt \
  "Hadur 3.13=$B/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv@hadur2.Hadur 3.13" \
  Diamond=$B/2026-10-12_hadur-plan90-census-diamond-local_cold.tsv \
  ScalarR=$B/2026-10-12_hadur-plan90-census-scalarr-local_cold.tsv \
  Nullstride=$B/2026-10-09_hadur-census-311-nullstride-local_cold.tsv
python3 data/tools/midrange_gap.py split $B/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv \
  --candidate "hadur2.Hadur 3.13hjsw" --baseline "hadur2.Hadur 3.13"
python3 data/tools/midrange_gap.py set docs/bench/local/2026-10-18_census-classes.tsv \
  hadur-bench/census-312.txt --move flat --gun learning --lo 51 --hi 400 \
  --exclude hadur-bench/shield-313.txt hadur-bench/shield-nullstride.txt --out hadur-bench/flat-gf-mid.txt
```

The census files and the peers' pages are on the 1v1 branch (`claude/project-thread-du09qh`,
`docs/bench/local/2026-10-18_census-classes.tsv`, `data/bench/2026-10-18_hadur-pc-1018-stack-census-*`,
`data/rumble/parsed/2026-10-15T1100Z_*`); the bullet-power figure is `bulletDamage / (shotsFired x
ourHitRate)` per census row, solved for the power. The 3.13 bullet-power and round-bucket figures
use the census's 3.13 baseline rows; the per-switch class readings parse the paired A/B sections of
the PC and cloud screen reports (`docs/bench/local/2026-10-1[6-9]_*.md` on that branch and on
`claude/project-thread-uq4kv9`, `claude/project-thread-9lx52t`).
