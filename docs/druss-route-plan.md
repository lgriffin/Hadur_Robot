# Hadur vs DrussGT 3.1.16: anatomy, counters and plan

Oct 5, 2026 · Leigh Griffin · working notes, not a release plan

Hadur 3.5.1 takes 37.5% ± 3.5 of the score from DrussGT 3.1.16, and what separates them is bullet power: both guns hit below break-even, and Hadur's shooting costs it 11.8 more energy lead a round than DrussGT's does. A probe build with a lead-aware power rule scored 50.7% ± 3.4 on the same seeds. In the rumble that step is worth 0.01 APS; the table gap is 5.95 APS, and Hadur 3.4 dropped 5.2 APS points against the 357 opponents on DrussGT's shield list.

- **First, lead-aware fire control (D1).** The probe measured +13 points against DrussGT with the rule on from the first shot. As specified, waiting for evidence, expect about +12 in a cold battle. Whether it carries to the other strong surfers is its gate.
- **Then make each bullet count twice (D3, D4).** Better aim for 0.1 bullets and aim that values shadows. Adding the energy model's gains to the bench figure gives about 54%, then 55% to 60%. The first D3 probe raised the hit rate but has not yet moved the score.
- **Three small rules on the way (D1, D2).** Catch shield openers on the first bullet, keep the last shot, and let duress end when the skipped turns stop.
- **Decided 2026-10-05: a shield list (D5), and APS is the objective.** It is the only item here that could be worth whole APS points: 1.7 if those 357 pairings rose from 82% to 88%, and 2.9 at 92%. Neither level is measured, so the list is built from the bench, not from DrussGT's names alone (`hadur-bench/shield-list.txt`, `shield-panel.txt`).

## Where the gap is

### Head to head

On the bench Hadur wins 86 of 350 rounds outright against DrussGT, while dealing slightly more bullet damage than it takes. The gap is energy management first: with bullets of power 1.7 and above the two guns are level. The figures are a cold bench run for this plan: 10 battles of 35 rounds, Robocode 1.9.5.6, with every bullet's fate read from the engine's truth log.

| Per round, mean of 350 rounds | Hadur 3.5.1 | DrussGT 3.1.16 |
| --- | --- | --- |
| Rounds won outright | 86 | 251 |
| Shots fired | 237 | 238 |
| Energy spent on bullets | 88.1 | 76.4 |
| Energy refunded by hits | 19.2 | 19.9 |
| Bullet damage dealt | 29.3 | 28.8 |
| Net effect of own shooting on own energy lead | −39.6 | −27.8 |
| Hit rate, all shots | 7.47% ± 0.18 | 9.69% ± 0.20 |
| Hit rate, power 1.7 to 2.2 | 7.08% ± 0.53 | 7.05% ± 0.68 |
| Hit rate, power 0.1 to 0.2 | 7.50% ± 0.21 | 9.91% ± 0.23 |
| Bullets destroyed by an enemy bullet | 12.3% | 12.2% |

- **Both guns are below break-even.** A bullet pays for itself only above a 12.5% hit rate at power 1.95, and 14.3% at power 1 or less. At 7% to 10%, every shot from either robot costs its owner more energy than it takes from the target. A 1.95 bullet costs its shooter 0.85 of lead on average, a 0.15 bullet 0.05.
- **Damage is level, so survival decides.** Each side scores about 29 damage a round. The round's winner adds 60. DrussGT wins 72% of rounds and Hadur 25%. The other 13 rounds ended with both robots dying on the same turn, which pays neither.
- **Hadur's shooting costs it 11.8 more lead a round than DrussGT's, which is the whole deficit.** The mean energy lead is +0.1 at tick 200, −8.6 at tick 600 and −11.3 at tick 1,000, then flat to the end.
- **The overspend sits in ticks 200 to 800.** There Hadur's mean bullet power is 1.53, 0.82 and 0.39 in successive 200-tick windows, against DrussGT's 1.11, 0.36 and 0.18. Hadur spends 43.5 energy in that stretch, DrussGT 27.0.
- **The lead at tick 600 is the round.** Ahead at tick 600, Hadur wins 62% (114 rounds). Behind, it wins 6% (236 rounds).
- **The guns are equal with heavy bullets.** Below power 1.7 DrussGT hits 1.5 to 2.8 points more. For the lightest bullets, under 0.2, it is 9.9% against 7.5%, and those are 72% of Hadur's shots.

&#91;embedded content: Bench run for this plan · mean of 350 rounds (10 battles), Hadur 3.5.1 v DrussGT 3.1.16; finished rounds carry their final energy\]

The opening is a fair lottery at power 1.95. The long tail after tick 1,000 is level: both robots lose about 1.1 energy per 100 ticks. Hadur loses the rounds in between, where it goes on paying for heavy bullets after DrussGT has stopped.

### In the rumble table

Hadur sits 5.95 APS and 13 places below DrussGT, and almost none of that is the DrussGT pairing itself.

| Live rumble, 4 October 2026 | Hadur 3.5.1 | DrussGT 3.1.16 |
| --- | --- | --- |
| Rank of 1,216 | 16 | 3 |
| APS | 86.65 | 92.60 |
| Survival | 94.36% | 98.03% |
| Pairings not won | 11 of 1,119 | 3 of 1,215 |

- **One pairing moves APS by less than 0.1.** Taking the DrussGT pairing from 37.5% to 50% adds 0.01 APS. The head-to-head matters for what it teaches about every other strong surfer.
- **Ranks 8 to 15 are within 1.1 APS of Hadur.** Then come Firestarter at +1.5, Diamond at +3.5 and DrussGT at +5.95.
- **The top 19 held 0.8 of the 14.1 APS points Hadur 3.4 dropped** on the page saved on 1 October. A perfect score against all of them would still leave Hadur below Firestarter.
- **DrussGT's shield list names 357 opponents, and Hadur 3.4 dropped 5.2 APS points against exactly those.** `ShieldTargets.java` lists the robots that DrussGT's pure shielder, EnergyDome 1.8, outscored DrussGT 3.1.12 against. Hadur averaged 82.3% against them. They are mid-table robots with a mean APS of 58, and they include Phoenix, Ascendant, Hydra and Firebird.

## How DrussGT is built

DrussGT 3.1.16 is a go-to wave surfer with a KNN gun and a bullet-shielding opener, in about 6,900 lines of Java across 23 source files. The jar ships its source, so this plan reads the code that fights and checks it against Skilgannon's own notes on the RoboWiki.

&#91;embedded content: DrussGT 3.1.16 · three subsystems and three helpers, read from the jar's source\]

Movement owns the tick: it detects the wave, plans the drive and tells the gun where DrussGT will be. Nothing is saved between battles. The next three sections take the parts in turn; in them, "we" and "our" mean DrussGT's opponent.

## DrussGT's movement

DrussGT drives to a chosen point for each wave, and its danger map is a short memory of where it was last hit. Everything below is read from `DrussMoveGT.java`, `BufferManager.java`, `EnemyWave.java`, `MovePredictor.java` and `EnemyMoves.java` in the 3.1.16 jar.

### Seeing the shot

- **Energy drop, gated by gun heat.** A drop of 0.1 to 3.0 becomes a wave only while DrussGT's own estimate of the enemy's gun heat is zero. It corrects enemy energy for its own bullet hits, our hit refund and rams (0.6). The wave is dated two ticks back and fired from the enemy's previous position.
- **Gun-heat waves.** When the enemy's gun is about to cool, DrussGT plants an imaginary wave from the enemy's next position and surfs it for two ticks, until the real drop confirms or cancels it. Its power comes from a small KNN (up to 20 neighbours) on own energy, enemy energy and distance, trained on every shot the enemy has fired.
- **Three waves.** The nearest wave gets precise intersection, the second an approximate one, and the third is only planned along the best path so the gun knows where DrussGT will end up.

### Remembering hits

The stats are visit-count buffers over 171 bins. The bins span guess factors of about ±1.11, because factors are scaled by 0.9 so the whole robot fits inside the range.

| Buffer family | Count | Learns from | Segments on |
| --- | --- | --- | --- |
| Unsegmented | 1 | Hits, bullet collisions | Nothing; starts with one head-on hit preloaded |
| Simple | 30 | Hits, bullet collisions | Lateral velocity, advancing velocity, bullet flight time |
| Anti-pattern-matcher | 30 | Hits, bullet collisions | Adds time since direction change, acceleration, time since velocity change, distance over the last 10 ticks |
| Main | 69 | Hits, bullet collisions | Up to six of the nine attributes, including forward and reverse wall room |
| Flattener | 50 | Every wave that passes | Mixed, weighted to walls and timing |
| Tick flattener | 30 | A virtual wave every tick | Mixed |
| Anti-bullet-shadow | 30 | Where its own bullets would have shadowed the enemy | Logged, but its weight is commented out in 3.1.16 |

- **Each cell remembers two or three hits.** A cell is a ring of the last 2 or 3 hit bins (7 for the unsegmented buffer). Rolling depth falls from 3 to 0.1 as a buffer gets finer, so in a fine buffer the newest hit outweighs the one before it by about ten to one.
- **A hit is any bullet whose angle it learns.** `HitByBullet` and `BulletHitBullet` both log the enemy bullet's guess factor into all 130 hit buffers at once.
- **The profile.** For each wave the matching cell of every buffer adds its remembered bins. The sum is normalised to a peak of 1 and smoothed with the kernel 1 / (1 + (bins / 10)²), about one robot width at 500 px.
- **The flattener is conditional.** It switches on while the enemy's distance-weighted hit rate is above 9% after round 1, or above 8% after round 4, and can switch off again until round 15. While on, the profile is 0.5 hits + 0.35 flattener + 0.075 tick flattener.
- **Bullet shadows.** Each of its own bullets is played forward against every wave. Shadowed bins are scaled toward zero in three passes (weights 1, 0.5, 0.5), the method BeepBoop documented, and restored if that bullet dies in a collision.

### Choosing where to drive

1. **Predict the enemy.** A single nearest neighbour from a kd-tree of the enemy's past states is played forward, tick by tick. The orbit centre and the distance term both use that predicted path.
2. **Generate candidates.** It simulates both orbit directions for up to 90 ticks with wall smoothing (160 px stick), keeping points at least 7 px apart. The orbit retreats whenever the enemy is nearer than 650 px, by up to about 40° at 200 px.
3. **Score the first wave.** Each candidate is simulated as a drive-to-point with Robocode's own acceleration rules. Its danger is the mean profile over the bins the robot would cover, times the angular width.
4. **Add the second wave.** Candidates are tried in order of first-wave danger. A cheap lower bound from up to 41 sample points prunes any that cannot beat the best total.
5. **Weight.** Danger is multiplied by the bullet's damage and by (100 − ticks to arrival)², and divided by the distance to the enemy less 34 px.
6. **Commit.** The chosen point stands until a hit, a new wave, a shadow change, or the enemy straying more than 10% of the distance from its predicted path. If DrussGT would arrive early, it keeps moving at speed for as long as it can still get back in time.

With no wave in the air it orbits at about 400 px and closes in from anywhere beyond that.

### What this means for an opponent

- **It is deterministic.** There is no random call in the movement. Given the same hits it makes the same choice.
- **Its inputs are visible to us.** Every attribute it segments on is its own state relative to our firing position, and every logged hit is one of our bullets. An opponent can rebuild its danger map exactly.
- **It only reacts to bullets that connect.** Unless the flattener is on, a guess factor it visited without being hit stays safe in its map. Against Hadur 3.5.1 the flattener was on at the start of 91 of 340 bench rounds (27%): DrussGT's distance-weighted figure for Hadur's hit rate ended each battle at 7.2% to 7.8%, just under the 8% switch.

## DrussGT's gun

DrussGT fires the best of three virtual guns, and against Hadur its two learning guns score only about 8% above its own random gun. The detail is from `DrussGunDC.java` and `PreciseMinMaxGFs.java`.

### Three guns on one set of waves

| Gun | Trained on | Neighbours | Weighting |
| --- | --- | --- | --- |
| DC (main) | Every wave, one per tick | min(√n, 100), Manhattan distance | Each neighbour counts 1 |
| DC-AS (anti-surfer) | Only waves that carried a real bullet which was still alive when it passed | min(√n, 100), Manhattan distance | Gaussian in feature distance, scaled to the 12 farthest of those neighbours |
| Random | Nothing | None | Uniform over the precise escape range |

- **What a sample holds.** Each wave stores the range of angles that would have hit, from precise intersection with the enemy's 36 px box. The range is normalised by the precise escape angle on each side, found by simulating three escape paths each way.
- **How it aims.** Each neighbour contributes its interval. The gun fires at the midpoint of the deepest overlap, from the position DrussGT will occupy next tick.
- **How it picks a gun.** Rounds 0 and 1 always use DC. After that DC stays unless another gun leads it by 25% before round 7, 11% before round 15, or at all later. Then DC-AS is used if it beats random, otherwise random.
- **How it scores them.** Only real-bullet waves whose bullet survived count. A gun scores when its angle fell inside the hit range; the random gun scores the range's share of the escape angle.
- **The trees never forget.** The kd-trees have no size cap, so the main tree grows by one point per tick for the whole battle.

### What the guns look at

The two learning guns share 13 features and differ only in weights. The figures are the hand weight times the genetically tuned weight, so they compare directly.

| Feature | DC | DC-AS |
| --- | --- | --- |
| Lateral speed | 6.1 | 4.2 |
| Forward wall room (precise escape angle) | 5.3 | 3.9 |
| Distance | 4.8 | 1.5 |
| Advancing velocity | 2.9 | 0.9 |
| Time since deceleration, over flight time | 2.7 | 1.5 |
| Reverse wall room | 2.5 | 1.5 |
| Mirror offset: where DrussGT itself plans to be | 2.5 | 5.2 |
| Distance covered in the last 10 ticks | 2.1 | 2.2 |
| Time into the round, over flight time | 2.0 | 1.2 |
| Current guess factor on the last wave | 1.9 | 1.6 |
| Acceleration state (braking, steady, speeding up) | 1.6 | 13.5 |
| Time since direction change, over flight time | 1.5 | 10.3 |
| Age of the sample (bullets fired so far) | 0.5 to 0.9 | 4.0 at 100 shots, 8.0 at 1,000, 12.1 at 4,000 |

- **The main gun is a movement profiler.** It keys on speed, walls and distance and learns from every tick.
- **The anti-surfer gun keys on what a surfer does under fire.** Acceleration state and time since the last direction change carry most of its weight, and the age axis makes early samples fade fast.

### How it fares against Hadur

| Bench measure (10 battles, end of battle) | Value |
| --- | --- |
| DC score over random score | 1.08 (range 1.05 to 1.13) |
| DC-AS score over random score | 1.08 |
| Gun in use at round start | DC 61%, DC-AS 38%, random 1% |
| DrussGT's own hit rate figure | 9.3% to 10.2% |

Hadur's movement already holds DrussGT's guns close to the floor a random gun sets. Against the released build, movement work can remove at most the last 8% of its hits.

## DrussGT's bullet power, opening shield and speed

DrussGT's power rule follows the enemy's bullet power down and never stops firing, and it opens every battle against a stranger by standing still to shoot bullets down. Both are fixed rules an opponent can plan around.

### Bullet power

1. **Base.** 1.95, or 2.95 when its own hit rate is above 33% or the enemy is within 150 px. Inside 150 px the caps below are skipped.
2. **Energy cap.** (own energy − 20 + half the energy lead, the lead clamped to −10..30) / 25. At even energy that is 1.95 down to about 59 energy, 1.15 to about 46, and 0.15 below 25.
3. **Kill cap.** A quarter of the energy the enemy is expected to have when the bullet lands, assuming the enemy keeps firing at its predicted power.
4. **Undercut.** While its own hit rate is below 12.5%, it also caps at the enemy's predicted bullet power minus 0.1.
5. **Floor and rounding.** Never below 0.15. The result snaps to the nearest of 0.15, 0.25, 0.35, 0.45, 0.65, 0.85, 0.95, 1.15, 1.95 or 2.95, values chosen to trip a rounding bug in BasicSurfer-derived wave detection.
6. **It always fires.** Whenever the gun is cool and it has more energy than the bullet costs, it shoots.

The 12.5% in rule 4 is the break-even hit rate for a 1.95 bullet: below it, firing loses more energy than it takes from the enemy. DrussGT's answer is to fire small. Against Hadur 81% of its shots were 0.15.

### The opening shield

- **Every battle starts in shield mode.** `EnergyDomeWorker` holds DrussGT still, predicts our bullet's heading from four head-on variants (each plain, with a learned offset, and with a direction-signed offset), and fires a lighter bullet to meet ours: 0.5 to 1.7 against Hadur's 1.95. A prediction counts only within 0.001 rad.
- **It gives up on damage.** For a robot not on its list it leaves once it has taken about 21 damage. For the 357 names on the list in `ShieldTargets.java` the limit is about 370. Hadur is not on the list.
- **It also gives up early** after round 0 if its best predictor scores under 0.6, if the enemy can outlast it, if a rammer closes in, or about 120 ticks after the enemy stops firing.
- **While shielding, the gun is not called.** Its aim learns nothing in that phase, though its movement still records our path.
- **On the bench it lasts 91 to 163 ticks of round 0** and costs DrussGT 35 to 39 energy. Hadur ended that phase 36 to 44 energy ahead in all ten battles, and still won only five of those ten rounds outright.

### Speed and robustness

- **Trig by polynomial.** `FastTrig` replaces sin, cos, atan and asin with multiply-add approximations.
- **Cheap stats.** Bins are floats, cells are allocated on first use, and slice indexes are computed once per wave and shared by all buffers.
- **Pruned search.** Second-wave prediction runs only for candidates that can still win.
- **Contained faults.** Each subsystem call is wrapped, and an exception is written to a data file instead of killing the round.
- **No memory between battles.** The data directory is used only for error dumps.
- **800 x 600 only.** Wall smoothing and the precise escape angle hard-code the field size.
- **A guard against renaming.** The KNN aim only runs if the robot's class name has a `g` after its first `e`, as in `mega`. A renamed copy quietly falls back to a linear lead.

## Where it can be countered

DrussGT's bullet-power rule is the one weakness measured on the bench, and it is worth 13 points. Two more levers are projected by the energy model described in the next section, and two small ones cover a few rounds in a hundred. Levers 1 to 5 become decisions 1 to 5 further down, and lever 6 is decision 8.

| Lever | What in DrussGT allows it | Evidence | Worth against DrussGT |
| --- | --- | --- | --- |
| **1. Freeze a lead, gamble a deficit** | Rule 4 of its bullet power. Below a 12.5% hit rate it fires at most our predicted power less 0.1, with a floor of 0.15. Behind, it cannot raise the stakes. Ahead, it follows our power up only as far as its own energy cap allows. | Probe build: 50.7% ± 3.4 against 37.5% ± 3.5 on the same ten seeds, +13.2 ± 4.2 paired. Rounds won outright went from 86 to 188 of 350. | +13 points, measured |
| **2. Make our bullets shield more** | Its guns score only about 1.08 times its own random gun, so every bullet of ours that crosses one of its waves takes away hits it cannot spare. | Collisions already remove 12.2% of its bullets. With Hadur holding fire, its hit rate at 400 to 500 px was 14.3% against 9.7%. With a random gun, the share of its bullets destroyed fell to 9.9% and its hit rate rose 0.8 points. | About 5 points per point of its hit rate, modelled |
| **3. Hit it with light bullets** | Its danger map learns only from bullets that hit or collide and keeps two or three per cell, so it steps off whatever a learning gun did last. | Hadur's 0.1 bullets land 7.5% to 7.9%. The random-gun probe's landed 8.6% ± 0.3, and DrussGT's own light bullets land 9.9% to 10.7% on Hadur. | About 2 points per point of light-bullet hit rate, modelled |
| **4. Bank the opening shield** | Shield mode holds it still in round 0 until it has taken about 21 damage. | Hadur led by 36 to 44 energy after about 90 to 160 ticks in ten of ten battles and won five of those rounds outright. The two lead-aware builds won 19 of 20. | 0.6 points on the released build; already inside the probe's 50.7% |
| **5. Win the stalemates** | It cannot fire with less than 0.15 energy, and Hadur keeps firing until it is below that too. | 13 of 350 baseline rounds ended in a double kill, which pays no survival score. | Up to 1 point on the released build, 0.3 under the lead-aware rule |
| **6. Predict its dodge** | The movement has no random call, every input is visible to the opponent, and the buffer definitions are in the jar. | Not tested. | Unknown; a research item |

Lever 1 has a precedent. Diamond 1.6.17, whose whole release note is "Bullet power tweaks.", scored 52.36% over 500 battles against DrussGT 2.4.4 in November 2011.

Four things that look like levers are not:

- **Distance.** DrussGT's hit rate is about 1.3 times Hadur's in every 100 px band from 300 to 600 px, so no range favours Hadur.
- **Copying its power rule.** In the model, Hadur running DrussGT's own energy cap scores about 38%, because DrussGT undercuts whatever power it sees.
- **Holding fire, or firing only 0.1.** These scored 24.6% and 29.9% on the bench.
- **A random gun.** It hit more often and still scored 34.2%, because it shielded less.

## What the bench probes showed

Six builds of Hadur 3.5.1 met DrussGT on the same seeds, and only the lead-aware power rule beat the released robot: +13.2 ± 4.2 points, paired by seed.

&#91;embedded content: Bench run for this plan · 40 battles of 35 rounds across six builds of Hadur 3.5.1, Robocode 1.9.5.6; diamonds from the energy model\]

Sampled aim adds 0.7 ± 4.0 to the rule's score, which ten battles cannot tell from zero. The table shows what each build changed and what that did to the two guns. A light bullet is one of power under 0.2.

| Build | What it changes | Rounds won outright | Hadur hit rate, all and light | DrussGT hit rate | Ticks per round |
| --- | --- | --- | --- | --- | --- |
| 3.5.1 as released | Nothing | 86 of 350 | 7.5% and 7.5% | 9.7% | 2,907 |
| Lead-aware power | Power 0.1 when level or ahead, 1.95 when more than 3 behind, 1.95 while both robots are above 60 energy, 3.0 at a still target | 188 of 350 | 7.8% and 7.9% | 9.9% | 3,296 |
| Lead-aware power, sampled aim | The same rule, aiming at one sampled neighbour instead of the density peak | 191 of 350 | 9.1% and 9.3% | 9.9% | 3,234 |
| Random gun | Uniform aim over the precise escape range, with the released power rule | 36 of 175 | 8.3% and 8.6% | 10.5% | 2,931 |
| All chaff | Power 0.1 on every shot, 3.0 at a still target | 29 of 105 | 7.7% and 7.7% | 10.7% | 7,309 |
| Hold fire | Shoots only at a still or disabled target | 41 of 70 | Almost no shots | 15.9% | 3,808 |

- **The lead at tick 400 decides the round.** Under the lead-aware rule Hadur won 89% of the rounds it led at tick 400 and 18% of the others.
- **DrussGT follows the power down.** Under the rule 91% of its shots were 0.15, its floor.
- **Winning rounds is not scoring.** Holding fire won 59% of rounds while DrussGT dealt 81 damage a round to Hadur's 1. All chaff lost the damage race 22 to 43.
- **Holding fire also lets DrussGT in.** Its shots came from a mean of 393 px, against about 500 px in every other run.
- **Sampled aim raises Hadur's hit rate without raising DrussGT's.** Light bullets go from 7.9% to 9.3%, where the random gun lifts both sides. It has two side effects: collisions fall by a point on each side, and DrussGT's flattener is on at the start of 317 of 340 rounds, against 180 under the plain rule and 91 for the released build.

### The energy model

The diamonds in the chart come from a model of the energy duel alone. It plays Robocode's energy rules tick by tick, with DrussGT's power rule as written in the jar and a copy of its enemy-power predictor, and reduces aim and movement to hit rates by bullet power. The sensitivity and grid runs give DrussGT perfect knowledge of Hadur's power in place of the predictor.

- **It matches the bench where it can be checked.** Given each run's hit rates it lands within a point of the bench mean for the three builds it was run for. For the released build it is also within 5% on round length and damage and returns the double-kill rate, though it puts the lead at tick 1,000 two points lower than the bench.
- **It depends on those hit rates.** DrussGT's light bullets hit 9.9% against the released build, 10.2% under the lead-aware rule and 10.7% against all chaff. Fed the released build's rates, the model overstates all chaff by about 9 points.
- **What a hit-rate point is worth.** Under the lead-aware rule, one more point on Hadur's light-bullet hit rate adds about 2 points of score. One point off DrussGT's hit rate at every power adds about 5.
- **The rule sits on a plateau.** With the gap anywhere from 3 behind to 3 ahead and the opening exchange ending anywhere from 60 to 100 energy, every variant scored 49% to 52%. A lighter gamble costs about 2 points; spending a surplus lead on damage changes nothing measurable.

## Design decisions for Hadur

Nine decisions follow, in order of evidence: one measured, two modelled, three small rules, one that is yours to make, one research item and a list of what to leave alone. Requirement IDs refer to the drafts further down.

### 1. Fire control becomes lead-aware (D1)

- **Decision.** Where both guns are below break-even, fire power 0.1 unless more than 3 energy behind, and the default 1.95 when further behind than that. Keep the opening exchange at 1.95 while both robots are above 60 energy (POW-7 to POW-9).
- **Why.** This is the probe that scored 50.7% ± 3.4. DrussGT's undercut freezes a lead for us and matches our stakes when we trail. The probe ran the rule from the first shot and also fired 3.0 at a still target, which this plan places in D2.
- **What it replaces.** The cubic power-down below 63 energy in `GunController.calculate1v1BulletPower`, in this regime only. POW-1 to POW-5 and END-3 stay.
- **What it needs.** Battle-long hit rates for both robots (POW-6). The 100-outcome window cannot show that DrussGT's 10% is below 12.5%, because its margin is about 6 points. With battle-long counts the test passed after one to four rounds in these ten battles, three on average, so a cold battle should score about 49%.
- **What to carry over.** DrussGT saves nothing between battles and Hadur does. The profile can record the verdict so the rule applies from the first shot of the next battle (ADAPT-5).
- **What not to build yet.** An optimiser. In the model, moving the opening threshold between 60 and 100 energy or the gap between 3 behind and 3 ahead leaves the score between 49% and 52%, and spending a surplus lead on damage adds nothing measurable.

### 2. Bullets are armour (D1 and D4)

- **Decision.** Never withhold a shot Hadur can pay for (POW-10, with END-4 the one exception), and choose each firing angle for what it blocks as well as what it hits (MOVE-8, GUN-6).
- **Why.** With Hadur holding fire, DrussGT's hit rate at 400 to 500 px rose from 9.7% to 14.3%. With a random gun Hadur hit 0.8 points more, DrussGT hit 0.8 points more as well, and the score did not rise.
- **How.** Movement publishes the guess-factor interval its plan will occupy on each enemy wave. The gun scores its candidate angles by hit value plus the shadow they cast on those intervals. BeepBoop does this: its author reports that about 40% of its shots against strong opponents leave the most likely angle to make a shadow.
- **Gate on DrussGT's hit rate, not ours.** One point off it is worth about 5 points of score in the model.

### 3. Light bullets get their own aim (D3)

- **Decision.** Treat aim at power under 0.2 as its own problem, with its own virtual-gun ratings (GUN-5) and its own gate.
- **Why.** Under the lead-aware rule 90% of Hadur's shots are 0.1 bullets. They land 7.9%, against 10.2% for DrussGT's light bullets; heavy bullets are level at 7.0%.
- **First candidate, already probed.** Aiming at one sampled neighbour instead of the density peak raised the light-bullet hit rate from 7.9% to 9.3% ± 0.2 and left DrussGT's hit rate at 9.9%. Ten battles cannot yet show it in the score: 51.4% ± 3.0 against 50.7% ± 3.4. It also switches DrussGT's flattener on for 93% of round starts.
- **Other candidates.** Down-weight angles near our own recent hits and collisions, as BeepBoop's anti-surfer gun does with its did-hit feature. Train a view on 25-tick flight times only.
- **The trap.** A uniform random gun also hits more, 8.6%, but collides less and lets DrussGT hit 0.8 points more. The gate counts both sides.

### 4. Shield openers are caught on the first bullet (D2)

- **Decision.** Latch the shielder flag on the first of our bullets destroyed by an enemy that has not moved since the round began (SHIELD-3), and fire 3.0 at a still shielder once SHIELD-2's aim jitter is on (SHIELD-4).
- **Why.** SHIELD-1 waits for four destroyed bullets in the last 20. DrussGT's shield bullets scale with ours, 0.5 to 1.7 against 1.95 and 1.0 to 2.7 against 3.0, so a heavier shot makes its shield dearer. The lead at its first move was 44 to 52 energy in the lead-aware build against 36 to 44 for the released robot, but only 37 to 46 in the sampled-aim build under the same rule, so the gain is not yet established.
- **What to carry over.** The flag, in the profile, so battle two starts with it.

### 5. The last shot is kept (D2)

- **Decision.** Once the enemy can no longer fire, stop firing before Hadur's energy falls to within 0.3 of the enemy's (END-4).
- **Why.** DrussGT cannot fire with less than 0.15 energy. Thirteen of 350 baseline rounds ended with both robots dying on the same turn, so neither scored survival. In the one traced tick by tick, neither could fire and the inactivity penalty took both. Under the lead-aware rule only 4 of 350 rounds ended that way.
- **Check first.** Confirm with a two-robot test that the robot with more energy survives the penalty on the rumble's Robocode version.

### 6. Duress ends when the skips stop (D1)

- **Decision.** Let duress end. After 300 ticks without a skipped turn, return to normal play (RES-12, which retires RES-9).
- **Why.** RES-9 holds duress to the end of the round, and every decision above lengthens rounds. Its trigger was met in 1 of 350 baseline rounds, 2 of 350 lead-aware rounds and 6 of 105 all-chaff rounds, and Hadur lost 7 of the 11 such rounds across all runs.
- **The case that shows it.** One lead-aware round 0 was lost from 52 energy ahead. Two start-up skips at ticks 8 and 34 and a third at tick 142 put Hadur in duress for the rest of the round. At tick 440, 300 ticks after the last skip, it was still 25 energy ahead.

### 7. A shield list: agreed (D5)

This is the only decision here that could move APS by whole points. Leigh agreed to it on 2026-10-05 with APS as the objective; the stages below are ranked by expected APS, D5 first.

- **The size.** Hadur 3.4 averaged 82.3% against the 357 robots on DrussGT's list. Lifting that average to 88% is worth 1.7 APS, and to 92%, 2.9. Neither level is measured for Hadur.
- **What it did for others.** DrussGT gained 0.72 APS when shielding arrived in 2.9.0 and 1.0 more across its five shield releases, 3.1.10 to 3.1.14. ScalarR went from 91.41 to 93.1 the day its shield shipped and fell from 94.45 to 91.55 when it was removed. BeepBoop went from 91.61 to 94.23 in the release that added its list, and Xor puts that list's worth at 2 to 3 APS.
- **Why Hadur's prototype was dropped.** It was trialled against XanderCat, Saguaro, Shadow and Raven, none of the four stayed shieldable, and the note concluded that shielding pays only against simple head-on robots. None of the four is on DrussGT's list, and the 357 that are include robots as strong as Phoenix.
- **The case against.** Skilgannon wrote of his own list: "feel a bit dirty with this one, but BeepBoop is doing it so duty calls." ScalarR's ranked entry is its `-noshield` build. DrussGT's licence asks for open source, credit, and no competition use outside the RoboRumble.
- **Agreed route.** Revive the prototype from commit c6d4d7a behind a list of Hadur's own. DrussGT's 357 names are the candidates; a name goes on only when shield mode beats normal mode on the bench (BENCH-11, SHIELD-5, SHIELD-6).

### 8. Predicting its dodge: research only (D6)

- **The idea.** DrussGT's movement has no random call, and its danger map is built from our own bullets with buffer definitions that are in the jar. A replica would tell the gun where DrussGT will not be.
- **Why it waits.** It is the largest build here, it breaks with the next DrussGT release, and it is aimed at one opponent, where at most 0.05 APS is left to gain.
- **The gate before any robot code.** Replay the truth logs offline. Build nothing unless the replica finds DrussGT's guess factor on at least 25% of waves, three times the gun's hit rate.

### 9. What stays as it is

- **Movement against DrussGT's guns.** They score about 1.08 times its random gun. At most 0.7 of a hit-rate point is left there, and decision 2 works on the same figure from the gun's side.
- **Distance.** No range band favours Hadur, and DrussGT hits almost twice as often inside 300 px.
- **Speed.** Hadur skipped 9 turns per battle here; DrussGT's FastTrig and float stats solve a problem Hadur does not have at this scale.
- **DrussGT's stats and go-to surfing.** Nothing measured here says Hadur's KNN true surfing is the weaker design.

## Stages and gates

Seven stages follow from the decisions, and only D1's gain is measured: every later figure is a projection to be tested at its gate.

&#91;embedded content: Stages D0 to D6 · five in sequence, two independent; one gate each\]

D0 to D4 build on each other and release in that order. D5 and D6 are independent of them.

- **What D0 is.** Bench work only: the report and the energy model that the later gates read (BENCH-9, BENCH-10).
- **How a gate is run.** A paired bench against the previous stage on the same seeds (BENCH-2): 20 battles of 35 rounds against DrussGT, then the top-10 set and the weak set. Twenty battles resolve a paired difference to about ±2.7 points, so D3 and D4 need 40.
- **What a pass means.** The stage's own measure reaches the level in the picture, and its score is not below the previous stage's by more than the interval.
- **D1's gate is cold.** The probe ran the rule from the first shot. POW-7 waits for evidence, which took one to four rounds here, so the gate is 8 points over 3.5.1 rather than the probe's 13.
- **What D3 already has.** The sampled-aim probe meets the hit-rate half of D3's gate. Its score gain is +0.7 ± 4.0, so the model's 3 points are neither confirmed nor ruled out.
- **If D1 fails on the top-10 set.** Narrow POW-7 to opponents whose bullet power is seen to follow ours down, which is the behaviour the rule exploits.
- **Where the model figures come from.** The model's gain is added to the bench's 50.7%: 3 points with Hadur's light-bullet hit rate at 9.8%, and 9 with DrussGT's hit rate a point lower as well.

## Order of work, by expected APS

1. **D5, the shield list, first.** Worth 1.7 to 2.9 APS if the 357 pairings rise to 88-92%; every other stage is worth 0.01 to 0.05 APS in the rumble. It starts with the bench panel (`hadur-bench/shield-panel.txt`, 46 robots) to decide which names stay on the list.
2. **Architecture stages A0-A2 and release 3.6 come before any code stage here** (`docs/architecture.md`, `docs/course-plan.md`). The route in this plan starts from 3.6.
3. **D1** (lead-aware power) gates on the top-10 and weak sets, then D2, D3, D4. **D6** stays research.

This PR changes no robot or bench Java. It adds notes, analysis tools and data only.

## Draft requirements

Requirement IDs below are proposals. PR #83 already uses BENCH-9, BENCH-10, POW-6, RES-12 and GUN-6 for other requirements, so they are renumbered as the work is implemented. D1 renumbered POW-6 to **POW-11** and RES-12 to **RES-14**; the tables and notes below keep the plan's original numbers, and `docs/requirements.md` (section "The DrussGT route (D1 to D6)") is where each requirement is defined once it is built.

These continue the IDs in `docs/requirements.md`, in EARS form. The thresholds are the probe's values and should be re-fitted at each gate.

| ID | Pattern | Requirement | Stage |
| --- | --- | --- | --- |
| BENCH-9 | Ubiquitous | The bench report shall give per opponent the rounds won outright, lost and ended in a double kill, the mean energy lead at ticks 400 and 600, and both robots' hit rate and share of bullets destroyed by bullet power class. | D0 |
| BENCH-10 | Event | When an energy-model run is requested, the bench shall replay the measured hit rates through the model and report the modelled score share beside the measured one. | D0 |
| POW-6 | Ubiquitous | The core shall keep battle-long hit rates for both robots in three bullet power classes (under 0.2, 0.2 to 1.2, above 1.2) and over all their bullets, each with its margin of error. | D1 |
| POW-7 | State | While both robots' battle-long hit rates over all their bullets are below 12.5% by more than their margins, and our energy is no more than 3 below the enemy's, the gun shall fire power 0.1. | D1 |
| POW-8 | State | While POW-7's hit-rate condition holds, our energy is more than 3 below the enemy's and our energy exceeds 10, the gun shall fire its default power. | D1 |
| POW-9 | State | While both robots' energy exceeds 60, the gun shall fire its default power whatever POW-7 would choose. | D1 |
| POW-10 | Ubiquitous | The gun shall fire every duel shot that our energy can pay for, lowering the power where a rule saves energy, except where END-4 holds the shot. | D1 |
| ADAPT-5 | Event | When a profile that records POW-7's hit-rate condition as met loads, the core shall apply POW-7 to POW-9 from the first shot, until this battle's rates contradict it by more than their margins. | D1 |
| RES-12 | Unwanted | If the engine has skipped three turns in a round, then the core shall run at the duress level RES-9 defines until 300 ticks have passed without a skipped turn. | D1 |
| SHIELD-3 | Event | When one of our bullets is destroyed by a bullet from an enemy that has not moved since the round began, the core shall treat the enemy as a bullet shielder from the next shot. | D2 |
| SHIELD-4 | State | While the enemy is treated as a bullet shielder and has not moved in the last 10 ticks, the gun shall fire power 3.0, capped by END-3. | D2 |
| END-4 | State | While the enemy's energy is below the smallest bullet power it has fired this battle, the gun shall not fire a shot that would leave our energy less than 0.3 above the enemy's. | D2 |
| GUN-5 | Ubiquitous | The gun shall rate its virtual guns separately for bullets of power under 0.2, and fire the gun rated highest for the power class of the shot. | D3 |
| MOVE-8 | Ubiquitous | Movement shall publish, for each enemy wave in the air, the guess-factor interval its current plan occupies when that wave arrives. | D4 |
| GUN-6 | Ubiquitous | The gun shall choose each firing angle from its candidates by the expected damage of a hit plus the expected damage avoided by the bullet's shadows on the intervals MOVE-8 publishes. | D4 |
| BENCH-11 | Event | When a candidate list is given, the bench shall run each named opponent with shield mode on and off over the same seeds and report the paired difference. | D5 |
| SHIELD-5 | Optional | Where the opponent is on the shield list, the core shall open each round in shield mode. | D5 |
| SHIELD-6 | Unwanted | If the enemy's bullet damage in a battle exceeds the amount that would hold our score share below 85%, then the core shall leave shield mode for the rest of that battle. | D5 |

Break-even is the hit rate at which a bullet returns its cost in damage and refund: 14.3% at power 1 and below, 12.5% at 1.95. POW-7 uses the lower figure for every bullet, and POW-1 to POW-4 and RAM-1 take precedence over it where they apply. RES-12 retires RES-9, whose duress lasts to the end of the round; the duress level itself is unchanged, and the 300 ticks count from a skipped turn, not from the round clock (DIAL-2). BENCH-8, RES-11 and MOVE-6 are left out because earlier plans in the repository reserve them.

## Risks and open questions

The largest risk is that the 13 points depend on a rule DrussGT's author already wants to replace.

- **DrussGT can change its rule.** Skilgannon wrote on 14 May 2026: "right now I have a very dumb bullet power selection which I'm 100% convinced costs me a lot against BeepBoop." POW-7 keys on measured hit rates, not on DrussGT, so the rule stays sound if the undercut goes; the 13 points would not.
- **Only DrussGT was benched.** DrussGT's own expected-score experiment, a 3.3 line it later dropped, raised its survival from 97.93% to about 98.5% and lowered its APS from 91.55 to between 90.76 and 91.22. A power rule that favours survival can lose score against the field, so D1 is gated on the top-10 and weak sets as well.
- **Battles are noisy.** One 35-round battle has a standard deviation of about 5 points. Ten battles give ±3.5, and telling two builds 3 points apart takes about 40 battles each.
- **Rounds get longer.** They run 2,907 ticks today, 3,296 under the lead-aware rule and 7,309 with all chaff. Longer rounds cost rumble clients time and expose RES-9, which decision 6 addresses.
- **Hit rates move with the regime.** DrussGT's light bullets hit 9.9% in the baseline, 10.2% under the lead-aware rule and 10.7% with all chaff. The model matches each run only when given that run's rates, so the figures for D3 and D4 are sensitivities, not forecasts. A better gun also wakes DrussGT's flattener: it was on at 93% of round starts in the sampled-aim run, against 27% for the released build.
- **The bench host was small.** Two cores, about 9 skipped turns per battle, and analysis jobs sharing the machine during some runs.

Open questions:

- [ ] Is Hadur's light-bullet deficit specific to DrussGT? Measure hit rate by power class on the top-10 set before D3.
- [ ] Does the engine's inactivity penalty work as decision 5 assumes on the rumble's Robocode version? A two-robot test settles it.
- [ ] How does the lead-aware rule fare against the other top-ten surfers, whose power rules were not read for this plan?
- [ ] Nothing here addresses BeepBoop or Nullstride, against which Hadur 3.4 survived no round.
- [x] Do you want a shield list at all (decision 7)? Yes, 2026-10-05.

## Sources

Everything was read on 4 and 5 October 2026. Wiki quotes came through a page-fetching tool, so check the wording on the page before reusing one.

**Code and data**

- `jk.mega.DrussGT_3.1.16.jar`, the jar attached to this conversation. Its 23 `.java` files are the reference for every DrussGT rule quoted here.
- [lgriffin/Hadur\_Robot](https://github.com/lgriffin/Hadur_Robot) at commit 11e7c68 (robot 3.5.1): the core source, `docs/requirements.md`, `docs/top20-analysis.md`, `docs/bullet-shielding.md`, `docs/bench/rumble-3.2-top10.md`, `data/learnings.md` and the saved rumble page `data/rumble/parsed/2026-10-01T2020Z_roborumble_botdetails_hadur2.Hadur_3.4.csv`.
- [Robocode 1.9.5.6](https://github.com/robo-code/robocode/releases/tag/VER_1_9_5_6), the engine the bench ran on.
- `hadur-drussgt-bench-kit.zip`, sent with this plan: the probe-build script, the analysis scripts, the energy model and the result files behind every bench figure here.

**Rumble**

- [LiteRumble 1v1 rankings](https://rumble.robowiki.net/Rankings?game=roborumble): 1,216 robots, read 4 October 2026.

**RoboWiki**

- DrussGT: [main page](https://robowiki.net/wiki/DrussGT), [Understanding DrussGT](https://robowiki.net/wiki/DrussGT/Understanding_DrussGT) (written for 3.1.4), [version history](https://robowiki.net/wiki/DrussGT/Version_History) (no entry for 3.1.16) and [talk](https://robowiki.net/wiki/Talk:DrussGT).
- BeepBoop: [Understanding BeepBoop](https://robowiki.net/wiki/BeepBoop/Understanding_BeepBoop), its [talk page](https://robowiki.net/wiki/Talk:BeepBoop/Understanding_BeepBoop), [version history](https://robowiki.net/wiki/BeepBoop/Version_History) and [Talk:BeepBoop](https://robowiki.net/wiki/Talk:BeepBoop).
- Other robots: [ScalarR version history](https://robowiki.net/wiki/ScalarR/Version_History), [Talk:Saguaro](https://robowiki.net/wiki/Talk:Saguaro), [Diamond version history](https://robowiki.net/wiki/Diamond/Version_History), [Talk:Diamond](https://robowiki.net/wiki/Talk:Diamond) and [XanderCat](https://robowiki.net/wiki/XanderCat).
- Techniques: [EnergyDome](https://robowiki.net/wiki/EnergyDome), [Bullet Shielding](https://robowiki.net/wiki/Bullet_Shielding) and [Bullet Shadow/Correct](https://robowiki.net/wiki/Bullet_Shadow/Correct).

**Not available**

- DrussGT's per-opponent rumble table could not be fetched, so its head-to-head scores against other robots are not in this plan.
- Only DrussGT was benched. No other opponent's jar was to hand in this session.
