# Hadur 2 requirements

EARS requirements from the Hadur 2 technical direction. This file is the source of truth: every feature file and unit test names the IDs it covers, and IDs never change meaning.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| CORE-1 | Ubiquitous | The core shall not import any class from `robocode.*`. | S1 |
| CORE-2 | Ubiquitous | The core shall produce identical `BotOrders` for identical `BotInput` sequences and identical profile state. | S1 |
| MEM-1 | Event | When the first scan of a battle names an opponent, the core shall load the profile for that opponent's lineage key before producing orders for that tick. | S3 |
| MEM-2 | Event | When a round ends, the core shall fold that round's gun, movement and outcome statistics into the opponent profile. | S3 |
| MEM-3 | Event | When a battle ends, the store shall persist the profile atomically within the data quota. | S3 |
| MEM-4 | Unwanted | If a profile fails to load or fails its checksum, then the core shall proceed with an empty profile and record the failure. | S3 |
| MEM-5 | State | While the store is above 90% of quota, the store shall evict gun and surf seeds from the least-recently-fought profiles before writing. | S3 |
| ADAPT-1 | State | While the loaded profile's movement tier is M2 or M3, the gun shall use the anti-surfer aim from the first firing wave. | S4 |
| ADAPT-2 | State | While the loaded profile's gun tier is T3, movement shall enable the flattener views from the first surfable wave. | S4 |
| ADAPT-3 | Ubiquitous | The core shall weight seeded samples lower than samples observed in the current battle. | S4 |
| WAVE-1 | Event | When an enemy energy drop is observed, the core shall subtract damage dealt by our bullets, enemy wall damage and enemy hit refunds before classifying it as a fired bullet. | S2 |
| WAVE-2 | Unwanted | If a corrected energy drop is outside [0.1, 3.0], then the core shall not create a firing wave. | S2 |
| RADAR-1 | Unwanted | If no scan of the enemy arrived on the previous tick, then the core shall turn the radar toward the enemy's last known bearing until it scans the enemy again. | S2 |
| MOVE-1 | Ubiquitous | Movement shall exclude bullet-shadowed guess-factor intervals from a wave's danger score. | S6 |
| DIST-1 | State | While our rolling hit rate exceeds the enemy's by 5 points or more, the distance policy shall reduce the target distance by 25 px per wave, not below 400 px. | S5 |
| POW-1 | Optional | Where the profile's gun tier is T0 and enemy energy exceeds 12, the gun shall fire power 3.0. | S5 |
| POW-2 | State | While our rolling hit rate exceeds 20% and the enemy's is below 10%, each by more than its margin of error, the gun shall fire power 3.0, capped at a quarter of the enemy's energy. | S5 |
| MOVE-2 | State | While the enemy's rolling hit rate on us exceeds its profile baseline by more than the margin of error, movement shall change flavour (flattener weight, surf mode, distance band) at the next surfable wave. | S6 |
| DIAL-1 | Ubiquitous | Every policy input shall carry a value and a margin of error, and each policy shall select its conservative setting while the margin exceeds the policy's threshold. | S4 |
| DIAL-2 | Ubiquitous | The core shall not condition any policy on elapsed ticks or round number alone. | S4 |
| END-1 | State | While enemy energy is below 16 and our energy exceeds 40 and the enemy gun heat exceeds ours, the distance policy shall set the target distance to 150 px. | S5 |
| END-2 | State | While enemy energy is 0, movement shall drive directly at the enemy. | S5 |
| TIME-1 | Unwanted | If the previous tick exceeded 70% of the tick allowance, then the core shall reduce its computation level for the next tick. | S6 |
| TIME-2 | Event | When a skipped-turn event is received, the core shall drop one computation level for the remainder of the round and record it. | S6 |
| MELEE-2 | Event | When the number of enemies alive as the core counts them (WORLD-8) falls from two or more to one, the core shall discard its duel tracking and restore full speed before handling that tick's scans. | S2 |
| MELEE-7 | Unwanted | If the melee target's last scan is more than 5 ticks old, then the core shall not fire at it. | S2 |
| GATE-2 | Unwanted | If fewer than two enemies are alive as the core counts them (WORLD-8), then the core shall drive the robot with the duel subsystems from that same tick. | M1 |
| GATE-3 | Unwanted | If a scanned robot reports that it is a sentry, then the core shall use the duel subsystems for the rest of the round and shall treat the sentry border as a wall. | M1 |
| GATE-4 | Unwanted | If the melee subsystems throw, then the core shall record the fault and use the duel subsystems for the rest of the round. | M1 |
| GATE-5 | Ubiquitous | The core shall never target, count or profile a sentry robot as an opponent. | M1 |
| MRADAR-1 | State | While in melee with four or more opponents alive, the radar shall complete a full sweep at least every 8 ticks. | M2 |
| MRADAR-2 | State | While in melee with two or three opponents alive, the radar shall turn toward the opponent scanned longest ago. | M2 |
| MSENSE-1 | Event | When an opponent's death is reported, the core shall drop it from the melee movement's risk and from targeting within the same tick. | M2 |
| MSENSE-2 | Event | When an opponent's energy drops by between 0.1 and 3.0 that the core cannot explain as damage, the core shall record a shot from it at the power of the drop. | M2 |
| MMOVE-1 | State | While in melee, movement shall choose its destination by minimum risk over at least 120 candidate points each decision. | M3 |
| MMOVE-2 | State | While in melee, movement shall weight any point where it would be an opponent's closest robot at least twice the base risk. | M3 |
| MMOVE-3 | Event | When an opponent's shot is recorded, movement shall simulate a head-on and a linear bullet from it and include both in the risk until they pass. | M3 |
| MMOVE-4 | State | While in melee with two opponents alive, movement shall shrink its candidate ring and increase its lateral preference. | M3 |
| MMOVE-5 | State | While two opponents within 300 px of each other, and further from us than from each other, are both losing energy to others, movement shall keep clear of their fight and stay within reach of the weaker one. | M6 |
| MGUN-1 | State | While in melee, the gun shall compute firing solutions for every opponent scanned within the last 8 ticks and fire at the angle of highest combined hit probability. | M4 |
| MGUN-2 | Event | When an opponent's energy is at most 16, the gun shall double that opponent's weight and fire the power that exactly kills it. | M4 |
| MGUN-3 | State | While in melee, the gun shall choose bullet power by distance, own energy and target energy per the energy table, and shall not fire while its own energy is below 1.0. | M4 |
| MGUN-4 | State | While in melee, the core shall emit a targeting wave at every opponent on every gun-heat cycle. | M4 |
| MGUN-5 | Ubiquitous | The melee strategy's posture shall not lower the gun's bullet power or hold its fire. | M6 |
| MMEM-1 | Event | When a round of a Melee-charter battle ends, the store shall persist each opponent's melee profile block alongside its 1v1 profile. | M5 |
| MMEM-2 | Event | When the number of enemies alive as the core counts them (WORLD-8) falls to one, the core shall hand the survivor's profile and the waves in flight to the duel subsystems. | M5 |
| REL-1 | Ubiquitous | The robot jar shall contain only class files that a Java 11 runtime can load, so that every RoboRumble client can run it. | S2 |
| SHIELD-1 | State | While at least 4 of our last 20 resolved duel bullets, and at least a quarter of them, were destroyed by enemy bullets, the core shall treat the enemy as a bullet shielder for the rest of the battle. | S2 |
| SHIELD-2 | State | While the enemy is treated as a bullet shielder, the gun shall offset each shot's aim by between 15% and 50% of the target's angular half-width, varying the offset deterministically from shot to shot and holding it from aiming until the shot is fired. | S2 |
| RES-1 | Unwanted | If the core throws on any tick, then the adapter shall issue the safe order set for that tick and record the fault. | S1 |
| RES-2 | Ubiquitous | The core shall bound every data structure that grows during a battle. | S1 |
| RES-3 | Ubiquitous | The store shall write a profile to a temporary file before replacing it, and remove the temporary file only once the profile is complete, so that an interrupted write leaves the previous profile, or the complete new one, loadable. | S3 |
| RES-4 | Unwanted | If the live hit-rate estimate diverges from the profile's by more than the margin of error, then the core shall decay the seed weight to zero within 20 waves. | S4 |
| RES-5 | Ubiquitous | Every degradation and fault counter shall be included in the round statistics and the bench report. | S1 |
| RES-6 | Ubiquitous | The core shall contain no use of unseeded randomness, threads, reflection, or file I/O. | S1 |
| BENCH-1 | Ubiquitous | The bench report shall give an APS estimate as the stratum-weighted mean of score share over the rumble-sample set with a 95% interval. | R0 |
| BENCH-2 | Event | When two robot jars are given, the bench shall run each seed with both and report the paired difference with its 95% interval. | R0 |
| BENCH-3 | Ubiquitous | The bench shall report per opponent our hit rate, their hit rate, skipped turns, faults, round length and damage per round for both jars. | R0 |
| TIME-3 | Event | When the engine skips a turn for the first time in a battle, the core shall learn the tick allowance from the tick that caused it and use that allowance, not the adapter's guess, for the rest of the battle. | R1 |
| TIME-4 | Ubiquitous | The core shall cap the bytes written at a round's end and shall write seeds only at battle end or on every tenth surviving round. | R1 |
| TIME-5 | Ubiquitous | The adapter shall run one warm-up tick for each role of the charter through a discarded core before the first round, so that class loading and JIT warm-up do not cost the first real tick a role drives. | R1 |
| MEM-6 | Ubiquitous | The store shall keep statistics loadable at quota by evicting seeds from every profile before any statistics are skipped. | R1 |
| MEM-7 | Ubiquitous | The profile codec shall be able to write a profile in the format a previous release can read. | R1 |
| DIAL-3 | Unwanted | If a margin used in a policy comparison is not a finite number, then the policy shall take its conservative branch rather than treat the comparison as settled. | R1 |
| POW-3 | State | While the profile rates their gun T1, they are within 450 px and their energy exceeds 12, the gun shall fire power 3.0. | R2 |
| POW-4 | State | While no full-power rule applies and both our and their rolling hit rates are known within 5 points, the gun shall fire whichever of its own power or 3.0 gives the higher expected value (hit rate times bullet damage, less the power spent), never below its own choice. | R2 |
| END-3 | Event | When the enemy's energy is at most a power-3 bullet's damage, the gun shall fire the least power that still kills on a hit, whatever power the gun or another rule chose. | R2 |
| RAM-1 | State | While the enemy's own speed toward us is 6 px/tick or more for ten scans running, within 250 px, the core shall fire up to power 3.0, capped and gated as the other full-power rules are, and reverse the no-wave orbit's chosen side. | R2 |
| WAVE-3 | Unwanted | If a shot is found on the same interval as an inferred wall hit, then the movement wave it becomes shall be marked uncertain and surfed at half weight. | R2 |
| GUN-1 | State | While a virtual gun's rating is beyond the margin of error of every other gun's, the gun shall switch to it; each shot shall decay every virtual gun's rating with a 100-shot half-life. | R3 |
| GUN-2 | Ubiquitous | The anti-surfer gun's features shall include ticks since the target's last velocity reversal, its 20-tick displacement and its orbit-direction changes over the last 40 ticks. | R3 |
| GUN-3 | Ubiquitous | The anti-surfer gun shall aim with the target's precise escape angle and a kernel no narrower than the target's angular half-width. | R3 |
| GUN-4 | State | While the live movement tier is M2 or M3, or the live gun verdict already names a switch, the gun shall rate a third gun trained on virtual and real waves and fire it when it rates highest. | R3 |
| POW-5 | State | While the enemy's gun tier is T3 and their distance exceeds 500 px, the gun shall fire no more than 1.7 unless a full-power rule applies. | R3 |
| BENCH-4 | Event | When a client-conditions file is given, the bench shall run each listed condition (shared or prefilled data directory, CPU constant, background load, engine version, JVM) as its own pass and report survival and skipped turns per opponent and per condition. | R4 |
| BENCH-5 | Event | When a saved LiteRumble BotDetails page is given, the bench shall report APS and survival by opponent-APS band and by UTC hour, a before/after split at a given time, and live minus bench share for every opponent in a given bench report. | R4 |
| RES-7 | Unwanted | If the core has faulted on three ticks of a round off a team (WEAVE-5), then the guard's safe orders shall also fire power 1.0 at the enemy's last scanned bearing whenever the gun is cool. | R4 |
| RES-8 | Event | When a battle ends, the adapter shall write a battle-health record of at most 64 bytes with rounds, rounds survived, faults, skipped turns, memory failures and the learned tick allowance. | R4 |
| MEM-8 | Ubiquitous | The store shall keep seeds only for at most five opponents met at least twice with a recorded score share under 60%, and shall keep every other profile as statistics of at most 1 KB. | R5 |
| MEM-9 | Ubiquitous | The store shall keep its files under a subdirectory named for the profile-format version and shall not read or write another version's subdirectory except to carry tiers forward once. | R5 |
| MEM-10 | Ubiquitous | The adapter shall do at most one profile read and two profile writes per battle, each at most 2 KB, apart from MEM-8's seeded profiles. | R5 |
| ADAPT-4 | Event | When a profile with a known gun tier and no seeds loads, the core shall apply the opening book's choices from the first tick without replaying samples. | R5 |
| BENCH-6 | Event | When a session file is given, the bench shall run its battles in order through one engine process under the file's heap cap, keeping the data directory, and shall report per battle its survival share, score share, skipped turns, faults, engine disables, heap after collection, longest pause and loaded classes. | R7 |
| BENCH-7 | Event | When a session file names a control robot, the bench shall run the same session with the control robot and report the two side by side by blocks of 25 battles. | R7 |
| RES-10 | Ubiquitous | The robot shall leave no reference to its classes in the process after a battle, so that the number of classes loaded in one JVM stays flat across a session of battles. | R7 |
| MOVE-3 | Ubiquitous | Movement shall score a wave's danger only over the part of the intersection not in a certain bullet shadow, at half weight inside a possible shadow. | R6 |
| MOVE-4 | Ubiquitous | Movement shall score a wave's danger as the danger density integrated over the firing angles of the precise intersection. | R6 |
| MOVE-5 | State | While the enemy's normalised hit rate less its margin exceeds 4.5%, movement shall enable the flattener views. | R6 |
| MOVE-7 | Event | When a wave in flight is removed or reordered, movement shall discard the neighbour cache of every wave whose surf index changed. | R6 |
| PHYS-1 | Ubiquitous | The movement predictor shall stop a predicted robot at a wall as the engine does. | R6 |
| WAVE-4 | Event | When a movement wave's bullet power is updated, its wall distances shall be recomputed. | R6 |
| MEM-11 | Ubiquitous | The adapter shall list the data directory at most once per battle and answer every later name, size and age question from an index it keeps current. | R8 |
| MEM-12 | Ubiquitous | The library shall read a stored profile to look for seeds only when its file is larger than 1 KB. | R8 |
| MEM-13 | Unwanted | If a save would take the store past 90% of its quota after every other seed is gone, then the library shall delete the least recently written profiles until it fits, and write. | R8 |
| RAM-2 | State | Once charges (the enemy's own speed toward us 6 px/tick or more for four scans running) have come within 120 px, with both robots above 20 energy, in two different rounds, for the rest of the battle, while the enemy has closed for two scans running within 500 px and until it is more than 650 px away, movement shall drive the heading that keeps a pursuing enemy furthest away over the next 20 ticks, and the core shall fire as RAM-1 does. | R9 |
| MIR-1 | State | While the enemy has stayed within 30 px (running average) of the reflection through the field's centre of our own position of up to 8 ticks before for 120 scans running with both robots above 10 energy (30 once confirmed this battle), and until that error exceeds 80 px, movement shall follow a path planned at least 110 ticks ahead and the gun shall aim at the reflection of where that path has us when the bullet arrives. | R9 |

Stage is where the requirement is first implemented: S0–S7 in the Hadur 2 stage plan, M0–M6
in the melee extension plan ("Hadur 2 — Melee Extension Plan", 27 Sep 2026).

RES-3 was reworded in S3 without changing its intent. It first said "rename", but Robocode's
sandbox punishes a robot that renames a file (writes must go through
`RobocodeFileOutputStream`). The store therefore copies instead: temporary file, then the
profile, then delete the temporary file; a load takes the profile if its checksum holds,
else the temporary copy.

Opponent memory (MEM-1 to MEM-5) is for duels. A battle that starts with two or more
opponents neither loads nor saves profiles.

The MELEE group is outside the original 1v1 plan. It was added for release 2.1, which enters
the MeleeRumble, alongside S2; the melee code is the 1.x melee work ported into the core.

The SHIELD group answers bullet shielding, found in the RoboRumble top-10 bench
(oog.mega.saguaro.Saguaro 1.0 sits still and shoots Hadur's bullets down). It is outside
the original plan and was added alongside S2 and S3; see docs/bullet-shielding.md.

The ADAPT and DIAL groups and RES-4 were implemented in S4 with these readings:

- **Tiers read estimates.** The gun tier reads their *normalised* hit rate on us (each hit
  weighted by Hadur's angular width from where it was fired, the surf's own measure), and a
  tier is named only while its 95% margin of error is at most 3 points; otherwise it is
  unknown and the opening is 1.20's (DIAL-1). The artifact's gun-tier bounds (4, 9, 14%)
  were set before any measurement; the S4 bench put head-on sample bots under 2% and Shadow
  at 8-9%, so the bounds are 2, 4.5 and 7%.
- **ADAPT-2** turns the flattener views on regardless of their thresholds. Any known gun
  tier also lets the surf's thresholds read the profile's hit rate while it is more certain
  than the live one, so the other danger views start where the last battle left them.
- **RES-4** judges divergence only once the live estimate's margin is at most 5 points: a
  weighted hit is not a coin flip, and a single early hit otherwise "disproved" a profile
  built from 2,000 waves. After that, the seed's weight falls by a twentieth a wave. A
  divergence also returns the opening's gun choice and surf prior to live data.
- **DIAL-1** covers S4's policies (the opening gun, the surf prior, the flattener, the seed
  trust) and the danger views' thresholds, which already padded the hit rate by its margin
  in 1.20. The S5 and S6 policies take the same form (below).
- **DIAL-2** is enforced structurally: the adapt package cannot see `BotInput` or
  `BotEvent`, and the seed trust counts waves.


The S5 group (DIST-1, POW-1, POW-2, END-1, END-2) was implemented with these readings:

- **Rolling hit rates** are the last 100 resolved shots on each side: our bullets that hit,
  missed or were shot down, and their firing waves that broke on us, hit or not. A window,
  not the battle's total, because the rate moves with the distance the policy picks. Each
  wave's own outcome goes in, in the order the waves break. Both windows and the distance
  controller start again when a different robot becomes the duel opponent (a melee's
  survivor), and carry across rounds against the same one.
- **DIST-1 steps once per enemy wave** that breaks. Coming in is the aggressive setting, so
  under DIAL-1 the lead must be certain: the gap between the two estimates' Agresti-Coull
  centres, less the gap's 95% margin, must still be 5 points or more. (A first version that
  took any certain lead let one cold battle against Shadow, where the rates are equal, walk
  in to 175 px on noise.) The reverse (they out-hit us by 5
  points) takes the target back out 25 px a wave, with no certainty needed, since further is
  the conservative side.
- **DIST-1's floor was changed from 150 to 400 px in S5**, from the bench (the same kind of
  rewording as RES-3's: the controller means what it did, only the bound moved). At 150 px
  the sample bots' head-on and linear guns hit Hadur often enough to take 0.4 to 2 points
  of score share off it; at 300 a little was still lost; at 400 every sample bot's share
  was at its S4 level and rounds still ended sooner. END-1 still closes to 150 to finish.
- **The range is [400, 650] px.** The artifact capped it at 550, but a stranger starts at
  1.20's 650 so that Hadur 2 against an unknown bot starts no worse than 1.20. The opening
  book starts a known gun tier closer: T0 at 400, T1 450, T2 500, T3 550.
- **POW-2** is the artifact's live rule ("our hit rate above ~20% and theirs below ~10%"),
  added as its own requirement. Both POW rules keep the gun's own power while our energy is
  12 or less, so a full-power miss cannot leave Hadur disabled, and neither goes below the
  gun's own choice.
- **END-1 reads the enemy's gun heat** from its shots as the ledger finds them: 3.0 at the
  round's start, 1 + power / 5 at each shot, cooling at the battle's rate. A shot we never
  saw leaves the estimate low, which only makes END-1 less eager. Our own heat includes a
  shot fired on the same tick, so a gun that has just fired never counts as the cooler one.
- **END-2** takes over from the surf entirely: nothing to dodge from a disabled robot.
- **DIAL-2** is enforced as in S4: the policy package cannot see `BotInput` or `BotEvent`.


The S6 group (MOVE-1, MOVE-2, TIME-1, TIME-2) was implemented with these readings:

- **MOVE-1's shadows are bearings from the wave's source**, not guess factors. The surf
  scores bearings anyway, and a bearing interval needs no guess about the enemy's escape
  angle. A shadow is every firing angle whose bullet meets one of ours on a turn both are
  in flight, computed segment by segment as the engine moves bullets (straight lines, all
  bullets before any robot).
- **The engine moves bullets one at a time in a random order each turn**, so a pair can
  also meet when one bullet's move crosses the other's previous segment. Angles that meet
  in every order are the certain shadow; angles that meet in only one order are possible.
  A wave keeps `1 - (certain + possible / 2)` of the danger it would have had, each term
  the share of our robot's intersection it covers: a possible shadow counts as half. In the bench, every enemy bullet one of
  ours destroyed fell inside a computed shadow (the check the bench's "intercepts in a
  shadow" column reports).
- **Bullets are named by heading and power.** The engine's bullet events carry the
  bullet's heading, which the adapter now passes on, so the core drops the right bullet
  from its shadows when one hits, misses or is shot down.
- **TIME-1 and TIME-2 read the time from an event**, `TickTime`, which the adapter measures
  around the core's tick and hands in with the next tick's events. The core never reads a
  clock, so a replay takes the same decisions (CORE-2). The allowance is taken as 3 ms, the
  bench machine's CPU constant; Robocode does not tell a robot its own.
- **A computation level sheds work in a fixed order**: level 1 surfs one wave and no
  go-to; level 2 also halves k in every KNN view; level 3 also stops scoring the virtual
  guns. TIME-2's skipped turn holds a level for the rest of the round; TIME-1's slow tick
  adds one for the next tick only. Levels are capped at 3.
- **MOVE-2's baseline is the profile's raw hit rate** on us, and the rolling rate is a window
  cleared at each change, so each flavour is judged on its own waves. A change needs the live
  estimate's margin to be 15 points or less (at one hit in one wave, Agresti-Coull's
  interval is wide enough to "exceed" any baseline) and the centre gap to exceed the two
  margins together. The flavours are added in order: flattener first, then go-to surfing,
  then 100 px further out. A stranger has no baseline and never changes (DIAL-1).
- **DIAL-2** is enforced as before: the policy package cannot see `BotInput` or `BotEvent`,
  and the tick budget and the flavour are driven by events, not the clock or the round.


S7 adds no requirements. It keeps the MELEE group, although the plan's S7 was to cut it:
2.1 had already entered the MeleeRumble with it, and melee runs only while two or more
opponents are alive, so the duel requirements are untouched by it.

## The melee extension (M0–M6)

The melee extension plan keeps Hadur a duellist and adds melee as a second posture behind
a gate that fails closed to the duel. Its requirements are the GATE, MRADAR, MSENSE, MMOVE,
MGUN and MMEM groups, traced to tests like the rest; the build's `hadur.melee.stage` says
which are due. They extend, and in places replace, the MELEE group from release 2.1.

- **The plan's `hadur117` packages are `hadur2` here.** The gate lives in
  `hadur2.core.posture` and the melee subsystems in `hadur2.core.melee`.
- **Duel byte-identity** is checked on sources, not class files, because class bytes change
  with the JDK: `DuelIdentityTest` pins a hash of every file in the duel's packages (adapt,
  gun, knn, ledger, memory, move, physics, policy, shield) as of M0. The replay fixtures pin
  the orchestrator's duel path tick for tick (CORE-2).
- **Robocode leaves sentries out of `getOthers()`**, so GATE-1's "two or more opponents" reads
  it directly. With sentries on the field and several opponents alive, the duel fights the
  closest opponent and keeps it until it dies; the sentry border is a wall because the
  duel's orders are simulated 12 ticks ahead and replaced by a drive to the centre if they
  would come within 30 px of the border zone. The duel's own movement code is not changed.
- **MSENSE-1 and MSENSE-2** are not in the plan's EARS list. They state M2's exit criterion
  ("no ghost targets after deaths") and the energy-drop events M2 builds for M3.
- **MMEM-1's "when a round ends"** is read as: the round is folded into each block when it
  ends, and written at the adapter's next write. The adapter writes at the end of every
  round Hadur survives and at the battle's end (a dead robot's thread that stops to write
  stays in the round, MEM-3), so a round Hadur dies in reaches the store one checkpoint
  later. "Alongside" is a separate `.hm` file beside the `.hp`, since the memory package's
  format is pinned by `DuelIdentityTest`.
- **MMEM-2's "the survivor's profile"** is its 1v1 profile, read and never written, and it
  sets the duel's opening without replaying seeds; "the waves in flight" are the
  survivor's recorded shots that have not reached Hadur. Hand-off happens at the survivor's
  first duel scan, and only when the melee drove until the end (a melee vetoed by a sentry
  or a fault has been a duel all along).

The BENCH group (R0, the rumble climb plan) governs `hadur-bench`, not the robot core, so it
has no Cucumber feature or ArchUnit rule; it is covered by `hadur.bench.StatsTest` and the
report renderers.

- **BENCH-1's weight** is the opponent's line in `hadur-bench/rumble-sample.txt` (its
  stratum's share of the live rumble population, split evenly across that stratum's
  opponents in the set); an opponent with no weight or zero weight is left out of the
  estimate, not counted as zero. The interval is a weighted variance across opponents'
  means, so one noisy opponent's battles do not dominate it.
- **BENCH-2's pairing** is by seed, not by battle order: `--baseline JAR` runs the same
  `RANDOMSEED` against both jars back to back, so the paired difference cancels whatever the
  seed itself varies (the opening, the field) rather than averaging two separately noisy
  means.
- **BENCH-3** was already met by the S1–S6 report tables (hit rates, skipped turns, faults,
  fighting distance, damage per round); `ReportTest` pins those columns so a future report
  change cannot drop what BENCH-3 promises without failing the build.

R1 (client reliability, part of the rumble climb plan) hardens the robot for RoboRumble's
real clients, which the S0–S7 bench never exercised: a slower or busier machine than the
bench's, hundreds of battles writing to a quota-limited data directory, and clients staying
on an older jar after a profile format changes underneath them.

- **TIME-3** replaces the adapter's fixed 3 ms allowance guess with a learned one once the
  engine actually skips a turn, since a RoboRumble client's real allowance can be smaller
  (or larger) than the bench machine's; `TickBudgetTest` covers the learn-once, hold-for-the-
  battle behaviour. The adapter still reports ticks and skips exactly as before; the core
  starts trusting a better number, but only when the tick behind a skip is a plausible share
  of the first guess (`TickBudget.MIN_LEARNED_SHARE`) — the adapter times only its own call
  into the core, not whatever else the engine charged the turn for (a checkpoint write, a
  GC pause), so an unrelated short tick must not become the battle-long allowance.
- **TIME-4** caps a round-end checkpoint's cost: `ProfileLibrary.saveStatsOnly` persists the
  stats alone, via `ProfileCodec.encodeStatsOnly` (which never serialises the caller's own
  seed lists at all), carrying over whatever seeds are already on disk unchanged rather than
  erasing them — a checkpoint before the tenth only leaves stored seeds stale, never gone.
  `HadurCore.checkpoint` originally called it for nine round-end checkpoints out of ten,
  writing the full profile (seeds included) only on the tenth and always at battle end; MEM-10
  (R5) tightened that further to the battle's one checkpoint, so seeds are now only ever
  written fresh by the save at battle end. `CoreMemoryTest.checkpointsCapSeedWrites` and
  `ProfileLibraryTest.statsOnlySaveKeepsStoredSeeds` cover the schedule and the no-erasure
  guarantee.
- **TIME-5** runs one tick through a throwaway core and guard, built and discarded with no
  store and no telemetry, before the real one's first round in `Hadur.java`'s `run()`. The
  tick carries a synthetic scan, not an empty one, so the warm-up actually reaches the
  aiming, movement and memory-adjacent code the real first scan will run, not just the
  "enemy not seen yet" branch; a failure is logged (best-effort, never fatal).
  `HadurWarmUpTest` checks it runs cleanly for a couple of battlefield sizes.
- **MEM-6** turned out to already hold: `ProfileLibrary.evictSeeds` never returns short of
  its target unless it has already stripped every other profile with seeds, and whenever it
  reaches its target the hard-quota check (100% of quota) is guaranteed to pass because its
  target is computed against the lower 90% (`ProfileLibrary.EVICT_AT`) threshold. So a
  write is skipped only once nothing more can be evicted from anyone; no code change was
  needed, only a test pinning the invariant (`ProfileLibraryTest.skipOnlyAfterEveryonesSeedsAreGone`)
  and a javadoc explaining why.
- **MEM-7** adds `ProfileCodec.encode(profile, version)`, which writes any version from
  `OLDEST_VERSION` to the current one, leaving out a field (today, only the normalised-hits
  group) a target version never had, exactly as that version's own encoder would have. A
  `ProfileLibrary` built with a write-version argument (defaulting to the current one) uses
  it for every save it makes — regular saves, eviction rewrites and stats-only checkpoints
  alike — so it is a lever an actual mixed-release migration can turn, not just a capability
  sitting unused: `ProfileLibraryTest.writeVersionAppliesToEverySave` covers it.
- **DIAL-3** found one real gap: `SeedTrust.diverges` compared live and profile margins
  without a finiteness guard, so a non-finite margin (unreachable today, since `Estimate`'s
  margin is always finite by construction — see `EstimateTest.marginIsAlwaysFinite`) would
  have silently read as "no divergence", the wrong direction for a seed the core can no
  longer trust. Fixed defensively so the invariant holds even if `Estimate` is ever changed.

R2 (part of the rumble climb plan) takes the full share from opponents Hadur already beats:
weak and mid-table guns, and rammers, where a cheap policy fix costs nothing against the
top 10 but adds up over the ~900 bots below rank 300.

- **POW-3** extends POW-1's full-power rule to a T1 gun, gated by range (450 px) rather than
  unconditionally: a T1 gun is still weak enough that closing costs less than the energy risk,
  but not so weak that the range no longer matters. `PowerPolicy.reason` checks it right after
  POW-1; `PowerPolicyTest` covers the tier and the range boundary.
- **POW-4** compares the gun's own power against full power by expected value (hit rate times
  `Rules.getBulletDamage`, less the power spent) whenever no other rule applies and both
  rates are known within `PowerPolicy.POW_4_MARGIN` (10 points, not 5: review on PR #61 found
  a full, realistic `HitWindow` of 100 outcomes can't close to 5 points anywhere the rule
  would actually change the shot, so it passed its own unit tests, built from wider windows
  than the real ones, but could never fire in a battle). Robocode's damage curve is convex
  (its slope rises from 4 to 6 past power 1), so this expected value is convex in the power
  fired, and a convex function's best value on an interval is always at one of its ends —
  there is no power between the gun's choice and 3.0 worth checking, only those two.
  `PowerPolicyTest.highHitRateFavoursFullPower` and `.lowHitRateKeepsTheGun` cover both ends
  of that comparison, and `.aFullHitWindowReachesTheGate` pins a real `HitWindow`'s reach.
- **END-3** is a separate calculation, `PowerPolicy.leastPowerThatKills`, rather than another
  `Reason`, because it can override every full-power rule with *less* than the gun's own
  choice: while a single shot at some legal power would kill on a hit, firing more than that
  wastes energy a decided fight no longer needs. `HadurCore` applies it after every other
  power rule as a ceiling, not a replacement (`Math.min` against whatever was already chosen):
  review on PR #61 found the first cut set it outright, so a low-energy gun's own small,
  affordable choice could be overridden by a kill power it could not afford, losing a shot it
  would otherwise have fired. `PowerPolicyTest.leastPowerThatKills` pins the inverse of the
  damage formula on both sides of power 1, and
  `PowerAffordabilityTest.killPowerNeverMakesAnAffordableShotUnaffordable` covers the
  low-energy case end to end.
- **RAM-1** is `RammerPolicy`, a small state machine independent of any opponent profile: ten
  scans of the enemy's own speed toward us at 6 px/tick or more within 250 px turns it on, and
  it holds while the enemy stays in range. That speed is the enemy's velocity resolved onto
  the line from them to us, not the raw change in distance between scans, which review on
  PR #61 found conflated our own approach with theirs and needed dividing by elapsed ticks
  whenever a scan was missed; velocity is already a per-tick quantity, so using it sidesteps
  both problems. Active, it raises the shot's power toward 3.0 in `HadurCore.onScan`, gated
  and capped exactly as the other full-power rules are (never past our own energy's
  threshold, never past a quarter of theirs, never below what was already chosen — the same
  review found the first cut ignored both and could turn an affordable shot into none at
  all), and `SurfMover.setRammerActive` flips which side the no-wave orbit takes, so a
  charging rammer meets a less predictable path than the same side every tick. A rammer
  rarely leaves a real firing wave to surf, so the flip applies only to the plain orbit, not
  to wave surfing. `RammerPolicyTest` covers the state machine, `RammerOrbitTest` the orbit
  reversal, and
  `PowerAffordabilityTest.rammerResponseNeverMakesAnAffordableShotUnaffordable` the low-energy
  guard.
- **WAVE-3** covers a case the energy ledger already partly handled: a shot fired as the enemy
  strikes a wall, where the split between the two is a guess (Firestarter's 8.6% false waves,
  S4's bench). `EnergyLedger.Reading` now carries an `uncertain` flag, set when a wall hit is
  inferred on the same interval as a shot-sized remainder, and its power is clamped to the
  nearest legal bullet power. `MoveController.updateFiringWave` carries the flag onto the
  wave it marks, and `SurfMover` halves such a wave's danger rather than trusting it like a
  clean reading. `EnergyLedgerTest` covers the flag and `FiringWaveTest` the wiring onto the
  wave.
- **TIER-1** is not in this stage's requirements table yet: calibrating the T1/T2 gun-tier
  bounds needs real mid-table opponents, and every bot benched so far reads either T0 (the
  sample bots) or T3 (the top 10 and Shadow) — the gap `Tiers.java`'s own javadoc already
  flagged and issue #53 tracks. It lands in a follow-up once that bench exists, rather than
  guessing bounds from no data in between.

R3 (part of the rumble climb plan) is a gun that hits surfers: the two guns' virtual ratings
never forgot a battle's earlier movement, rated within 1-3 points of each other on the bench,
and carried no surfer-specific signal, so a target that changed its movement mid-battle kept
whichever gun won the opening exchange.

- **GUN-1** reworks `GunController.GunStats` from a flat lifetime average into an
  exponentially decayed one: each virtual bullet multiplies what came before it by
  `0.5^(1/100)` before adding the new one, a 100-shot half-life, so a movement change
  20-30 shots old still dominates the rating while one from round 1 has faded away. The
  choice among guns still only changes once the best one clears every other candidate's
  Agresti-Coull margin (DIAL-1) - reusing `GunController.margin`, the same construction
  `PowerPolicy` and `Tiers` use - so the decay makes the rating responsive without making the
  choice flap on noise. This also unifies gun selection: the old "1.20's rule" fallback (no
  opening set, strictly higher wins, no margin) is now the same margin-gated comparison as
  the opening's live override, through one method, `GunController.liveVerdict`.
  `virtualGunScores`, what folds into the profile across battles (MEM-2, the movement tier's
  evidence), keeps a separate, undecayed lifetime total on each `GunStats`: GUN-1's half-life
  is about this battle's live choice, and has no meaning read back across future battles.
  `GunControllerTest` and `GunOpeningTest` cover the decay and the margin-gated switch.
- **GUN-2** adds three features to `AntiSurferFormula` (9 to 12 dimensions, weight 2 each):
  ticks since the target's last velocity reversal (distinct from the existing
  `targetVchangeTime`, which resets on any speed change, not only a direction change), its
  20-tick displacement (already computed for the main gun's formula, `Wave.targetDl20t`, and
  simply reused here) and how many times its orbit direction flipped over the last 40 ticks.
  `HadurCore.onScan` tracks the two new raw values the same way it already tracks
  `enemyVchangeTime` and the 8/20/40-tick displacements: a tick counter reset on a sign flip,
  and a 40-scan ring buffer of orbit directions counted for reversals, both set onto the gun
  wave (`Wave.setTicksSinceReversal`, `Wave.setOrbitChanges40`) before the anti-surfer views
  read them. A gun seed sample recorded before R3 has no data for the three new features (the
  stored sample format is 13 values, unchanged); `GunController.seed` seeds them at
  `AntiSurferFormula.NEUTRAL_NEW_FEATURE` (0.5, the middle of each feature's [0, 1] range)
  rather than guessing, so an old seed still loads without corrupting the space it aims in.
  `AntiSurferFormulaTest` covers the three features' scaling and the seed padding.
- **GUN-3** fixes two things in `AntiSurferGun.aim`'s kernel search, which the plan doc called
  out as "the 59-angle grid never aims between two narrow peaks": the 59-angle test grid used
  to span the classic, symmetric maximum escape angle (`asin(8 / bulletSpeed)`), even though
  each neighbour's own firing angle is already computed from the target's precise, generally
  asymmetric escape angle (`Wave.preciseEscapeAngle`) - so a neighbour whose true angle fell
  outside the classic bound could never be the chosen angle, no matter how many neighbours
  agreed with it. `DiaUtils.generateFiringAngles(int, double, double)` is a new overload that
  spans `[-preciseEscapeAngle(false), preciseEscapeAngle(true)]` instead, so the grid always
  covers every neighbour's real angle. Second, the Gaussian kernel's bandwidth is now
  explicitly floored at the target's own angular half-width
  (`DiaUtils.botWidthAimAngle(distance)`) rather than only implicitly wider than it through
  the existing "twice the half-width" multiplier - the same floor GUN-4's hybrid gun shares,
  since it reuses this gun's aim mechanics. `AntiSurferGunTest` covers the asymmetric grid and
  the bandwidth floor as explicit invariants (a property test), not only as a side effect of
  today's constants.
- **GUN-4** adds `HybridGun`, a third gun rated alongside the main and anti-surfer guns and
  fired when it rates highest. It shares GUN-2's anti-surfer feature space and GUN-3's aim
  mechanics (precise-escape-angle guess factors, the same widened kernel), but as one
  long-memory view (`HybridGun.createView`, capped at 6,000 points, k 30 at one neighbour per
  8) rather than the anti-surfer gun's four fast-forgetting ones, and it is rated from both
  real and virtual waves exactly as the anti-surfer gun already is (`GunController` always
  fires and scores its virtual bullet in `fireVirtualBullets`/`onWaveBreak`, gate open or
  not, so it already has a history by the time the gate opens). The gate itself
  (`GunController.hybridGateOpen`) is open while the live movement tier is M2 or M3 - read
  from the main and anti-surfer guns' own decayed ratings against the same bounds
  `Tiers.move` uses (duplicated rather than shared: the gun package must not depend on
  `hadur2.core.memory`, `ArchitectureTest.memoryIsLeaf`, so this reads `GunController`'s own
  `margin()` instead of building a `memory.Estimate`) - or while the plain main-vs-anti-surfer
  live verdict already favours a switch. Once open, the hybrid gun joins GUN-1's three-way,
  margin-gated `liveVerdict` like any other candidate. `GunOpeningTest` and `GunControllerTest`
  cover the gate and the three-way choice. **Judgement call**: the plan text left "trained on
  virtual and real waves" and "a third gun" underspecified; this reading was chosen because it
  reuses proven GUN-2/GUN-3 mechanics end to end rather than inventing a fourth aiming
  algorithm, and because gating it on the same live evidence GUN-1 already computes needs no
  new bookkeeping in `HadurCore`. It is a genuine third vote, not a relabelling of the other
  two: its own long-memory view, its own decayed rating, its own gate.
- **POW-5** is a straightforward addition to `PowerPolicy`, but the plan's framing ("already
  there" alongside POW-3/POW-4/RAM-1/END-3) did not match this repository once `origin/master`
  was fetched: R2 (PR #61) turned out to already be merged there with exactly that shape, so
  POW-5 slots in beside it as intended. It is a cap, not a `Reason`, for the same reason END-3
  is: `PowerPolicy.capPower` can only lower the gun's own choice (`Math.min`), so
  `HadurCore.onScan` calls it first, before `PowerPolicy.reason`/`power`, and any full-power
  rule's `Math.max` against the gun's choice overrides the cap afterwards exactly as "unless a
  full-power rule applies" asks - the same never-worsen shape R2's Qodo review already fixed
  POW-3/POW-4/END-3/RAM-1 into, so POW-5 is built into that shape from the start rather than
  needing the same fix later. `PowerPolicyTest` covers the cap and the override, and
  `PowerAffordabilityTest` that it never makes an affordable shot unaffordable (capping only
  ever lowers the energy a shot spends).

The gate not run for R3 is the multi-hour paired A/B bench (top-10 + ranks 31-150, cold,
solo) the plan artifact calls for; the numeric validation it would give - hit rate +1.0pt
against BeepBoop/ScalarR/Diamond/DrussGT, top-10 mean 45.1% to 48%+, ranks 31-150 +1.5pt, tick
p95 at most 2.0ms - is a follow-up, as it was for R0 through R2.

R5 (rumble-safe memory, `docs/rumble-climb-r4-r6-plan.md`) tightens opponent memory itself:
R4's client-conditions bench never reproduced 3.0's live rating collapse, but the data
directory every Hadur version on a rumble client shares (`robots/.data/hadur2/Hadur.data/`)
was still the plan's likeliest live difference, so R5 makes what memory keeps, and how often
it writes, strictly smaller regardless of quota pressure.

- **MEM-8** adds `ProfileLibrary.seedWorthy` (battles at least two, `OpponentProfile
  .recordedScoreShare()` — the same estimated-score formula as a single `BattleOutcome`, but
  summed over every recorded outcome — under 60%) and checks it in `save` before a profile's
  seeds are ever written: a profile that fails it is encoded stats-only regardless of the
  quota (`ProfileCodec.encodeStatsOnly`), the same codec path TIME-4 already used for
  checkpoints. A profile that passes goes through the new `enforceSeedCap`, which keeps at
  most `MAX_SEEDED` (5) profiles holding seeds at a time, evicting the least recently fought
  of the others first — the same order MEM-5's quota eviction already uses. The two caps
  compose: MEM-8 decides who is even a candidate to keep seeds, MEM-5 still evicts under
  quota pressure among whoever MEM-8 left seeded. `ProfileLibraryTest.evictsLeastRecentlyFoughtSeeds`
  and the new `ProfileLibraryTest` MEM-8 cases cover both.
- **MEM-9** namespaces every store name by write version (`ProfileLibrary.fileName(key,
  version)`), since the store is a flat namespace — `ProfileStore`'s own contract, and the
  robot adapter's sandbox forbids path separators in a name — so a "subdirectory" is a name
  prefix, not a real directory. `load` falls back to the nearest other version's file, stats
  only (`readOtherVersion`), when this version has nothing yet, which is MEM-7's codec
  downgrade's one remaining use: carrying tiers forward once, never seeds from a format this
  library did not write. `prepare` calls the new `cleanupOtherVersions`, which deletes other
  versions' files, oldest fought first, only once the store is short of quota — so an old
  version's files are never touched while there is room, and the carry-forward above still
  has something to read from until there genuinely is not.
- **MEM-10** cuts `HadurCore.checkpoint` down to the battle's first call only (a `checkpointed`
  flag); every later call in the same battle is a no-op. Together with the always-on save at
  battle end, that is at most two writes a battle from the core's own flow, both stats-only
  saves that carry over whatever seeds are already on disk (TIME-4) — the seed-worthy
  profiles MEM-8 exempts from the 2 KB figure get their seeds refreshed only by the battle-end
  save, never a checkpoint. `CoreMemoryTest.checkpointsCapSeedWrites` (retagged MEM-10) covers
  the one-write cap and that the caps compose without losing what an earlier save already
  committed.
- **ADAPT-4** needed no code change: `OpeningBook.read` already only replays a seed list
  populated from `profile.gunSeed()`/`.surfSeed()`, so once MEM-8 leaves a profile with a
  known tier and no seeds on disk, those lists are empty and the opening applies from the
  first tick exactly as `OpeningBookTest.knownTierWithNoSeedsAppliesImmediately` now pins.

Test fixtures needed the same tightening: `Profiles.sample` (a decisive, one-battle win)
never qualifies for MEM-8's cap, which is correct — most of the existing MEM-5/MEM-6/RES-3
fixtures that expect seeds to survive a save now use the new `Profiles.seedWorthy` (two
battles, both losses) instead, so seed eviction in those tests is still driven by quota
pressure (MEM-5), not tripped over by MEM-8 first.

The R5 gate (BENCH-4 `data=shared` over 60 opponents, then the weak set again; every weak
battle 35/35; the data directory under 180 KB; 0 memory failures; warm top-10 not below cold
top-10 by more than 1 point) is recorded in `docs/bench/`; see followup.md for the run.

## R7 notes: the session bench, duress and the loader test

- **BENCH-6** is `hadur-bench --session FILE` (`SessionFile`, `SessionRunner`,
  `SessionReport`): one child JVM under the file's heap cap runs every battle through one
  `RobocodeEngine`, writing `session.csv` a battle at a time. The heap figure is the live
  set after a full collection at the battle's end; the pause is the longest collector run
  during the battle. **BENCH-7** is the same session again with `control=ROBOT`.
- **RES-9** is `Duress` (root package, so it may see `BotInput`) driven from
  `HadurCore.tick` when `TickBudget.duress()`, which is `DURESS_SKIPS` (3) skipped turns in the
  round. Only a duel's already-announced opponent is fought this way; melee is untouched.
  Scans in duress only move the last known enemy position. The reversal interval comes from
  a xorshift generator seeded by the round, so a replay is exact (RES-6, CORE-2).
  `ArchitectureTest` pins that `Duress` depends on no gun, movement, KNN, ledger, memory,
  adapt or melee class. The skipped-turn count lives in `TickBudget`, which is in the pinned
  duel sources, so `duel-sources.sha256` was re-pinned deliberately.
- **RES-10** is measured as the live class count of one JVM across a session of battles
  (`RobotLoaderTest`), which is what a retained robot class loader would raise.

## R8 notes: memory at rumble scale (shipped as 3.4)

- Shipped from R8 (docs/rumble-memory-scale-plan.md, docs/skipped-turns-plan.md): MEM-11 to
  MEM-13. Left for later: MEM-14 (format bump), TIME-7 (IO timing records), RES-11 (skip a
  save after 100 skips) and BENCH-8's extended harvester. TIME-6 was built, benched and
  dropped (below).
- **MEM-11** is `FileProfileStore`'s index: `forRobot` lists the directory once (the listing
  it already made to compute the quota), and `names`, `bytesUsed`, `size` and `lastModified`
  answer from it; `write` and `delete` update it. The port gained `size` and `lastModified`
  as default methods, so other stores keep working.
- **MEM-12** is `ProfileLibrary.STATS_ONLY_MAX` (1 KB): `evictSeeds` and `enforceSeedCap`
  skip any own-version profile at or under it unread. A damaged small file is therefore no
  longer reclaimed by MEM-5's pass; MEM-13 removes it in age order instead.
- **MEM-13** is `ProfileLibrary.forgetOldest`, called in `save` after MEM-5's seed eviction
  and before the hard-quota check, so a write is now skipped only when the profile's own
  stats cannot fit an otherwise empty store. Its order is the store's write time (a file is
  rewritten when its opponent is fought), so no profile is read to choose. MEM-6's test now
  checks that nothing is forgotten while any seed remains. `cleanupOtherVersions` (MEM-9)
  uses the same order instead of decoding every other version's file.
- **TIME-6 was dropped.** With `execute()` moved ahead of the battle's set-up, the set-up
  ran on turn 1, which has ten constants of grace instead of the round start's 300: at a
  1 ms constant with 700 profiles on disk it cost 36 skipped turns at the start of round 0
  (turns 2 to 37), enough to put the round into duress (RES-9, three skips). Left before the
  first `execute()`, the same work fits inside the start grace and costs 0 to 4 skips. The
  set-up would only outgrow that grace if it took more than 300 constants (150 ms at a
  0.5 ms constant); here it took about 36 ms.

## R9 notes: the weak-bot leak (shipped as 3.5)

Issue #80: 3.4 was 20th, but lost about 1.0 APS against the robots ranked below 500 (KNN PBI
-1.7), mostly to rammers and mirror movers. The bench reproduced it (Chaser 75.9%, mahrram
64.6%, MirrorNano 77.1%, against 74.7, 65.0 and 70.7 live), so the dropped rounds were
tactics, not live-only stalls. See `docs/bench/r9-weak-leak.md`.

- **RAM-2** is `RammerPolicy.escape` (the battle-long confirmation and the escape's on/off)
  and `move.RamEscape` (the movement). 3.4 spent most of each round within 100 px of a
  rammer, where the RoboRumble's rammers fire their full-power shots: RAM-1 needed ten scans
  inside 250 px, by which point the rammer had arrived, and only flipped the orbit's side.
  The escape plays 24 headings x 2 wall-smoothing orientations forward 20 ticks against a
  turn-limited pure-pursuit model of the enemy and drives the one with the furthest closest
  approach; ties go to the larger mean distance, then to the smallest change of heading. A
  candidate stops being played once it falls below the best closest approach so far, and the
  second orientation is skipped when no wall bent the first, which keeps a tick to about
  0.2 ms. RAM-1 is unchanged.
- **The first cut of RAM-2 failed the top-19 gate.** It started the escape after four
  closing scans within 500 px, with no confirmation. That lifted the weak set from 74.8% to
  87.9%, but strong robots close in like that all the time (ScalarR in 77% of rounds,
  XanderCat 80%), and running from them cost up to 15 points (Raven 60% to 45%, Knight 48% to
  37%). On the 3.4 truth logs no top-19 robot came within 120 px on a four-scan charge with
  both robots above 20 energy (they close in only to finish a disabled Hadur), while every
  rammer and close-range nano did in 61-100% of rounds, so the confirmation is that, in two
  different rounds: on the second top-19 bench XanderCat, spawned 190 px away, once drove
  straight through us at a round's start, which a single ram would have taken for a rammer
  (it cost 10 points in that battle).
- **MIR-1** is `policy.MirrorDetector` (at which lag) and `move.MirrorDrive` (the plan and
  the aim). The detector keeps a running error for each lag 0-8 ticks against the reflection
  through the centre. The first cut also tried the two axis mirrors with a 30-scan run under
  40 px, and it switched on for a few dozen ticks against every top-19 robot (two surfers
  orbiting each other about a point near the centre look like a mirror). On the truth logs of
  both top-19 benches the longest run under 30 px, centre only, counting only scans with both
  robots above 10 energy, was 80; MirrorNano's and MirrorMicro's shortest was 152, so the run
  is now 120 (30 once confirmed in the battle). Without the energy rule, two nearly disabled
  robots crawling about held a 335-scan run against Neuromancer. The
  drive plans straight full-speed runs of 10 to 36 ticks in directions from the golden-ratio
  sequence (RES-6), each clear of the walls by 40 px and of the centre by 140 px, at least 110
  ticks ahead, and follows them order for order; the engine's movement is reproduced exactly
  by `MovementPredictor`, so the plan is remade only after a collision or a skipped turn. The
  aim is the first tick of the bullet's flight at which the reflection of the planned
  position, lagged by the detector's lag, is within the bullet's reach. Offline, on 3.4's
  bench truth logs, aiming at the reflection of our real future position hit MirrorNano and
  MirrorMicro 75-87% of the time against 18-30% for head-on, while aiming at the reflection
  of a straight-line guess of our own path did worse than head-on: the plan is what makes it
  work. MIR-1's movement takes precedence over RAM-2's, since a mirror bot heading for the
  reflection reads as a charge.
- The round record gained `ramEscapeTicks` and `mirrorShots` (fields 35 and 36); fields are
  only ever appended.

## The architecture evolution (A0–A5)

The plan is [docs/architecture-evolution.md](architecture-evolution.md): one identity kernel
and three strands (Duel, Melee, Team) behind one role contract. Its stages are compared with
`hadur.arch.stage` in the root pom. Six new groups carry it: ROLE, WORLD, WEAVE, LINK, SHELF
and STRAND. IDs keep their meaning; only the owner of each group is new.

### Owners

Every requirement group belongs to one owner, the same owner as the code it governs
(`hadur-core/src/test/resources/ownership.txt` maps the packages).

| Owner | Packages | Requirement groups |
|---|---|---|
| Kernel | `model`, `physics`, `knn`, `ledger`, `memory`, `port`, `world` (from A3), `link` (from A4) | CORE, WAVE, MEM, PHYS, WORLD, LINK, SHELF |
| Duel strand | `gun`, `move`, `adapt`, `policy`, `shield`, `duel` (from A2) | ADAPT, GUN, DIST, POW, MOVE, END, DIAL, RADAR, SHIELD, TIME, RAM, MIR |
| Melee strand | `melee` | MELEE, MRADAR, MMOVE, MGUN, MSENSE, MMEM |
| Team strand | `team`, from the Team plan | none yet |
| Conductor | the root package, `role` (`posture` until A1), `replay` | GATE, ROLE, WEAVE, RES, STRAND |
| Bench and release | `hadur-bench`, the adapter | BENCH, REL |

### Requirements

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| ROLE-1 | Event | When a battle starts, the core shall fix the battle's charter from the battle facts before the first tick. | A1 |
| ROLE-2 | Ubiquitous | The core shall choose each tick's role from the charter, the counts of enemies, teammates and sentries alive, the round's vetoes and the roles that have already driven this round, and from nothing else. | A1 |
| ROLE-3 | State | While the Team role's own conditions do not hold, the Melee role is built and has not failed this round, two or more enemies are alive, no sentry robot is alive or has been scanned this round, and the Duel role has not driven this round, the core shall drive the robot with the Melee role. | A1 |
| ROLE-4 | State | While a role has driven in the current round, the core shall not drive with a role above it in the order Team, Melee, Duel. | A1 |
| ROLE-5 | State | While a tick is not in duress (RES-9), the core shall offer each of its events to the roles of the charter, Melee before Duel, in the engine's order, except that a sentry's scan and a sentry's bullet are offered to no role (GATE-5) and Hadur's hit on a robot the Duel is ignoring is not offered to the Melee role. | A2 |
| ROLE-6 | Ubiquitous | The core shall hold no role outside its charter. | A3 |
| WORLD-1 | State | While a tick is not in duress (RES-9), the core shall feed one model of the field with every scan, hit and death that ROLE-5 offers the Melee role, before any role is offered it. | A3 |
| WORLD-2 | Ubiquitous | The core shall report to a role, as its count of others, the engine's count off a team and the count of enemies alive that WORLD-8 defines on a team. | A5 |
| WORLD-3 | Unwanted | If a teammate has sent no report for a set number of ticks while the engine's count of others has fallen, then the core shall count it dead. | A5 |
| WORLD-4 | Event | When teammates' reports arrive, the core shall merge each report once, in the order of their stated ticks, and keep the newer of two sightings of a robot. | A5 |
| WORLD-5 | Event | When a role hands over with bullets of its own still in flight, the core shall keep the first bullet outcomes that follow, one for each of those bullets, out of the next role's gun evidence. | A2 |
| WORLD-6 | Event | When one of our bullets ends on a teammate or on a teammate's bullet, the core shall report it to the role that fired it as a bullet that missed. | A5 |
| WORLD-7 | Ubiquitous | The core shall offer an event that names a teammate to the World alone. | A5 |
| WORLD-8 | State | While in a team battle, the core shall take as its count of enemies alive the smaller of the engine's count of others less the teammates heard from on that tick, and the enemies at the start less the distinct enemies known dead that round. | A5 |
| WEAVE-1 | Ubiquitous | Only the driving role shall originate a tick's body, gun, radar and fire orders, apart from the full-speed order the conductor gives at a change of role. | A2 |
| WEAVE-2 | Ubiquitous | A fence shall only replace a drive; it shall never touch the gun, the radar, the fire order or the messages. | A2 |
| WEAVE-3 | Ubiquitous | The driving role shall order a shot only on a tick for which the conductor has given the fire permission. | A2 |
| WEAVE-4 | State | While a living teammate's last known position is no older than the WORLD-3 window and lies in the fire lane, the conductor shall withhold the fire permission. | A5 |
| WEAVE-5 | State | While in a team battle, the Guard's safe orders shall hold fire. | A5 |
| WEAVE-6 | Unwanted | If the driving role orders a shot on a tick without the fire permission, then the core shall treat it as that role's fault. | A2 |
| LINK-1 | Ubiquitous | Team messages shall be byte arrays in a versioned, checksummed format that the core encodes and decodes. | A4 |
| LINK-2 | Unwanted | If a message fails its checksum or carries an unknown version, then the core shall ignore it and count it. | A4 |
| LINK-3 | Unwanted | If no teammate's report has arrived, then the core shall still resolve its role from the engine's facts alone. | A5 |
| LINK-4 | State | While it has a living teammate, the core shall broadcast its own state, its fresh sightings, the deaths it knows of this round and its bullet events with the orders of every tick it completes. | A5 |
| SHELF-1 | Ubiquitous | A shelf shall be written only on behalf of its own strand's role. | A4 |
| SHELF-2 | State | While in a team battle, a member that is not the team's leader shall neither write to nor delete from the store. | A5 |
| SHELF-3 | Ubiquitous | The `.hp` shelf shall be written only in a Duel-charter battle, the `.hm` shelf only in a Melee-charter battle and the `.ht` shelf only in a Team-charter battle. | A4 |
| SHELF-4 | Ubiquitous | The `.hm` and `.ht` shelves shall each stay within a fixed byte budget. | A4 |
| STRAND-1 | Ubiquitous | Every package of the core shall have exactly one owner: the kernel, one strand, or the conductor. | A0 |
| STRAND-2 | Ubiquitous | No strand's package shall depend on another strand's or on the conductor's, and no kernel package on a strand's or the conductor's. | A0 |
| STRAND-3 | Ubiquitous | Each owner's sources shall be pinned by hash. | A0 |
| STRAND-4 | Ubiquitous | A recorded duel battle and a recorded melee battle shall each replay to identical orders, telemetry and store files. | A0 |
| STRAND-5 | Ubiquitous | A recorded team battle shall replay to identical orders and telemetry for each recorded member. | A5 |

### A5 notes

- **The team baseline.** Five `hadur2.Hadur` make `hadur2.HadurTeam`, built from the same
  commit and classes as the solo jar (a second shade of the robot jar with the team file
  added). Each member plays Melee, then Duel, with teammates off its books, shared eyes
  and a clear fire lane; there is no Team strand yet, and no member writes a profile.
- **The filtered input** is the conductor's `TeamLink`, built only in a Team-charter
  battle, so a duel or a melee sees the raw input and every older fixture replays
  unchanged. A teammate's scan, hit, collision or death goes to the World's roster alone
  (WORLD-7); our bullet that ends on a teammate, or on a teammate's bullet, reaches the
  role as a miss (WORLD-6); and the role's `others` is the World's count of enemies
  alive (WORLD-2).
- **The roster** (`world.Roster`) keeps each teammate's last known position, the tick it
  last reported, and its death. WORLD-3's window is `SILENT_WINDOW`, 20 ticks: a teammate
  silent that long while the engine's count of others has fallen since its last report
  is presumed dead. WORLD-8's count is
  `max(0, min(others - teammates heard this tick, enemies at start - enemies known dead))`;
  a death the engine announces counts a teammate's only when the name is the roster's,
  and a sighting withdraws a presumed death, so the count errs upward.
- **WORLD-4.** Each report is merged once (a report delivered again after a skipped turn
  is not), in the order of its stated tick; a sighting newer than the World's goes in
  through the World's own scan, the deaths it carries are applied, and the sender's own
  position refreshes the roster.
- **LINK-3, LINK-4.** With no report the count still comes from the engine's count and
  the deaths it announced. While a teammate lives, every tick's orders carry our report:
  own state, the tick's fresh sightings, the round's deaths we know of and the shot this
  tick orders, if any.
- **WEAVE-4, the fire lane**, runs from Hadur along the gun's heading. Its half-width is
  24 px at a fresh position (a robot's half-width and a few px of slack) and grows by
  8 px per tick of age; positions older than the WORLD-3 window are left out. A shot the
  lane holds back is counted. **WEAVE-5**: the Guard's safe orders hold fire on a team.
- **SHELF-2.** The Archive is told at tick 0 whether this member is the scribe: off a
  team always, on a team only the leader (200 starting energy). A non-scribe neither
  writes nor deletes, the health record included.
- **The World's shot lifetime** is `max(130, ceil(diagonal / 11))` ticks, the time the
  slowest bullet takes to cross the field: 130 on 1000 x 1000, 155 on 1200 x 1200.
- **Records.** `T,round,tick,teammateHits,teammateBulletHits,collisions,blockedShots,reportsMerged,linkRejected,enemiesAlive`
  at each round's end, and `E,round,tick,count` each time a team member's count of
  enemies alive changes, which the team bench checks against the engine's truth.
- **The team bench** (`--team true`, `team-reference.txt`, `team-gates.txt`) fights each
  reference team in turn at TeamRumble settings and reports score share, rounds won,
  survival, faults, skipped turns, LINK rejects, the share of shots that left with a
  living teammate truly in the lane, the count against the truth, the members' `T`
  sums and the data files the battle left. `--record` records five recorders, one
  transcript per member.
- **STRAND-5.** A member's `F` line carries the rest of its battle facts (name, starting
  energy, sentry border, roster), and the shipped `Replay` and the tests'
  `FixtureReplay` build the core from them with the guard that holds fire. The team
  fixtures are the leader and one droid of a battle against `sampleteam.MyFirstTeam`.
- **Reworded:** GATE-2, MELEE-2 and MMEM-2 read "enemies alive as the core counts them";
  RES-9's shot waits for the fire permission; RES-7 applies off a team. Off a team every
  one of them reads as before.

### A4 notes

- **The ports.** `BotEvent.Message` carries a teammate's bytes and its sender; the
  bullet-meets-bullet event names the other bullet's owner; `BotOrders.messages` carries
  the tick's reports to broadcast, and `BotOrders.withDrive` replaces a drive and keeps
  the gun, radar, fire and messages, which is how `SentryFence` now builds its orders
  (WEAVE-2, whose property now covers the messages). `BattleFacts` gains our name, our
  starting energy (`leads()`: only a team's leader starts with 200) and the sentry border.
  The replay codec appends a `G` event, the owner on `X` and the messages on `O`, each
  only when present, so every older transcript reads and writes back the same.
- **LINK-1, LINK-2** are the kernel's new `link` package: a `Report` (own state, fresh
  sightings, the round's deaths, the bullets fired) and `LinkCodec`, big-endian with a
  version byte and a CRC-32. A message that fails the checksum, carries another version,
  is cut short or runs long is refused whole; the conductor counts it and writes a
  `LINK,round,tick,rejected,sender,reason` record. A good report is kept per teammate
  for A5 to merge. No role is offered a message.
- **SHELF-1, SHELF-3** are the conductor's `Archive` and the port's `GatedProfileStore`.
  Each file belongs to one shelf by name (`.hp` and the battle clock to the Duel, `.hm`
  to Melee, `.ht` to Team, anything else to the conductor), and a battle writes or
  deletes only its own charter's shelf and the conductor's files. The melee seam asks
  the Archive before it saves, so a team battle never tries to write `.hm`; a delete a
  library makes on its own, such as the 1v1 library's clean-up in a melee, is refused
  quietly and counted in a `MEM,…,gated,n` record at the battle's end. Every shelf
  may still be read in any charter.
- **SHELF-4**: the `.hm` blocks were already capped at 16 KB (MMEM-1's `CAP`); the `.ht`
  shelf comes with the Team plan.
- **The adapter is a `TeamRobot`.** It passes the roster from `getTeammates()` (null off
  a team), hands teammates' byte-array messages to the core (anything else arrives as no
  bytes and is refused) and broadcasts the core's. A team battle is now a Team charter:
  until the Team strand exists it builds Melee and Duel, reads every shelf and writes
  none but the health record, and a teammate still reads as an opponent until A5.
- **MMEM-1** reads "a Melee-charter battle".
- **The gate.** All eleven fixtures replay to identical orders, telemetry and store files,
  none re-recorded.

### A3 notes

- **The World.** `melee.EnemyTracker`, `EnemyInfo` and `EnemyShot` moved to the kernel's
  `world` package, unchanged but for three members made public for the melee brain to read.
  `ArchitectureTest.worldReadsNoStrand` keeps it to `physics` and `model`, and
  `meleeIsSeparateFromDuel` now lets `melee` see `world`. The melee pin changed once, as the
  donor (imports only, and the books-only handlers below); the nine pinned packages did not.
- **WORLD-1** is the conductor's `feedWorld`: every scan, hit and death ROLE-5 offers Melee
  goes to the World first, then the melee brain's own books take it through the new
  books-only handlers (`scanned`, `bulletHit`, `hitByBullet`, `died`). A failure feeding the
  World is the Melee role's, as it was inside the tracker (GATE-4). The `on*` handlers stay
  for the melee's own tests and feed its tracker first, as before. The focus and the baton's
  shots read the World.
- **ROLE-6.** A Duel charter builds no `MeleeController`, no World and no melee seam; a melee
  brain handed to a 1v1 core is dropped. The ROLE-5 scenario and tests that heard the melee
  brain in a 1v1 now use a Melee charter with one opponent left, where the Duel drives.
- **TIME-5** runs one warm-up tick per role of the charter: in a melee, the Melee with every
  opponent alive, then the Duel with one left, the hand-off included. The warm-up passed a
  gun cooling rate of 0, which the core refuses, so since R1 the warm-up tick has faulted
  before reaching the guns; it now passes the engine's 0.1, and `HadurWarmUpTest` checks that
  each role drives a tick, which a faulted tick never does.
- **The gate.** All eleven fixtures replay to identical orders, telemetry and store files,
  none re-recorded.

### A2 notes

- **The Duel is lifted.** `duel.DuelController` holds everything the duel did inside
  `HadurCore`, moved verbatim: the guns, the surf, the waves and state logs, the ledger, the
  shield, the S4 opening and seeds, the S5 and S6 policies, the rammer and mirror responses,
  and `Duress`, which moved with it. `RoundStats` moved to the kernel's `model`, so the Duel
  fills in its counters without seeing the conductor. The duel pin only gains the two files;
  `DuelIdentityTest` shows no file in the nine pinned packages changed.
- **The contract.** `role.Role` is the plan's interface, with `Tick`, `RoundFacts` and
  `RoundResult`. The conductor drives each brain through its seam in the root package:
  `DuelSeam` and `MeleeSeam` (today's `meleeTick` and `goTo`, the melee half of the `M`
  record and the `.hm` shelf). Each seam is handed its shelf by charter: the `.hp` library in
  a Duel charter, the melee blocks and the survivors' 1v1 profiles in a Melee charter. The
  baton (`model.Baton`) carries the melee's shots and Hadur's path, so `duel` imports
  nothing from `melee`. `HadurCore` keeps every public method and accessor it had.
- **ROLE-5** is the conductor's `observe`: its own bookkeeping first (round counters,
  deaths, the budget's events), then the Melee seam, then the Duel seam. Sentry scans and a
  sentry's bullets stop there (GATE-5); the Melee seam skips Hadur's hit on a robot the Duel
  ignores. The hand-off happens inside the Duel seam's scan, after the opponent switch and
  before the scan is logged.
- **WORLD-5** is the conductor's count of melee bullets in flight, unchanged; the Duel seam
  asks it once per outcome.
- **WEAVE-1**: `Role.observe` is handed no orders, and the Duel holds a scan's radar lock
  until `drive`, which writes it first, where the scan used to. **WEAVE-2** is a property:
  the sentry fence keeps the gun, radar and fire orders bit for bit. **WEAVE-3**: the
  conductor gives the fire permission before the role drives (always, until A5's fire lane;
  `HadurCore.firePermission` lets tests withhold it), and both seams hold their shot and its
  count without it. **WEAVE-6**: a shot ordered without it is the driving role's fault, a
  melee fault (GATE-4) in Melee and the Guard's in the Duel.
- **The gate.** All eleven fixtures replay to identical orders, telemetry and store files,
  none re-recorded. One shelf rule now reads the charter instead of a count: a battle that
  starts with no opponent at all would be a Duel charter with a `.hp` shelf. Robocode never
  starts one.

### A1 notes

- **ROLE-1** is `Charter.of(BattleFacts)`, fixed in `HadurCore`'s constructor. The adapter
  passes `BattleFacts.solo(width, height, getOthers())`: an `AdvancedRobot` cannot ask for
  teammates, so until A4 the roster is empty and no battle is a Team charter.
- **ROLE-2 to ROLE-4** are `RoleResolver`, in the new `role` package (the melee extension's
  `posture` folded in; `Posture` and `Veto` keep their constants, so only imports change at
  their call sites). The resolver latches the lowest role that completed a tick; a tick the
  Guard covers never completes, so it leaves the latch as it stands. Off a team the enemies
  are the engine's `getOthers()`.
- **GATE-1 is retired** for ROLE-3, which carries the same conditions plus the latch. Its ten
  tags moved: six scenario tags and two `RoleResolverTest` tests to ROLE-3, and the two
  ArchUnit rules to STRAND-2. `sentryAliveKeepsTheDuel` now expects the duel to stay once it
  has driven. The one change in play: a sentry that dies unscanned no longer hands the round
  back to melee. No fixture holds such a round, and every fixture's orders, store files and
  telemetry (less the new `ROLE` lines, which the comparison sets aside) are unchanged.
- The **`ROLE` record**: `ROLE,round,tick,role,charter,enemies,sentries,veto`, at a round's
  first completed tick and at each change of role.

### A0 notes

- **STRAND-1 and STRAND-2** are `hadur2.core.arch.StrandOwnershipTest`, reading
  `ownership.txt`. A package with no owner, or an owner the map does not know, fails the
  build. The layers are checked on the compiled classes with ArchUnit.
- **STRAND-3** pins each owner's sources in `src/test/resources/pins/<owner>.sha256`. A
  stage re-pins only the owners it names (`-Dhadur.pin=duel,conductor`), and its pull request
  says which. `DuelIdentityTest` still pins the nine packages the evolution may not edit.
- **STRAND-4** is `ReplayTest`, driven by the test-side `FixtureReplay`. The recorder now
  logs the store the battle started on, the adapter's round-end, checkpoint, battle-end and
  health-record calls, and the files the battle left. The replay makes those calls with its
  own guard and compares orders with the live robot's, telemetry with the snapshot under
  `replay/telemetry/`, and the store with the live robot's files. A0 recorded five fixtures
  on 3.5.1 beside the six S1 duels: `melee-samples`, `melee-sentry`, `melee-handoff` (on a
  store holding Shadow's 1v1 profile), `warm-abc.Shadow_3.83c` (the second of two warm
  battles) and `duress-sample.Walls` (a duel at a 0.15 ms CPU constant, with rounds in
  RES-9's duress). From A1 to A4 no fixture is re-recorded; where a requirement's wording
  and a fixture disagree, the fixture wins and the difference is raised as its own change.

## The DrussGT route (D1 to D6)

The plan is [docs/druss-route-plan.md](druss-route-plan.md): the findings of the 4 and 5 October 2026 probes against DrussGT 3.1.16 and the stages D0 to D6 that follow from them. Its stages are compared with `hadur.druss.stage` in the root pom, which is `D1`. The plan's draft IDs were renumbered here because open PR #83 reserves BENCH-9, BENCH-10, POW-6, RES-12, RES-13, GUN-6 and DIST-2: the plan's POW-6 is **POW-11** and its RES-12 is **RES-14**; POW-7 to POW-10 and ADAPT-5 keep their numbers. The requirements of D2 to D6 stay in the plan until their stages are built.

### Requirements

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| POW-11 | Ubiquitous | The core shall keep battle-long hit rates for both robots in three bullet power classes (under 0.2, 0.2 to 1.2, above 1.2) and over all their bullets, each with its margin of error. | D1 |
| POW-7 | State | While both robots' battle-long hit rates over all their bullets are below 12.5% by more than their margins, and our energy is no more than 3 below the enemy's, the gun shall fire power 0.1. | D1 |
| POW-8 | State | While POW-7's hit-rate condition holds, our energy is more than 3 below the enemy's and our energy exceeds 10, the gun shall fire its default power. | D1 |
| POW-9 | State | While both robots' energy exceeds 60, the gun shall fire its default power whatever POW-7 would choose. | D1 |
| POW-10 | Ubiquitous | The gun shall fire every duel shot that our energy can pay for, lowering the power where a rule saves energy, except where END-4 holds the shot. | D1 |
| ADAPT-5 | Event | When a profile that records POW-7's hit-rate condition as met loads, the core shall apply POW-7 to POW-9 from the first shot, until this battle's rates contradict it by more than their margins. | D1 |
| RES-14 | Unwanted | If the engine has skipped three turns in a round, then the core shall run at the duress level RES-9 defines until 300 ticks have passed without a skipped turn. | D1 |

POW-7 to POW-9 apply to a duel only. POW-1 to POW-5, RAM-1 and END-3 keep precedence over them. RES-14 retires RES-9 (see the retired table).

### D1 notes

- **POW-11** is `policy.BattleHitRates`, one per robot (`DuelController.ourBattleRates`, `theirBattleRates`): shots and hits in the classes under 0.2, 0.2 to 1.2 and above 1.2, with `Estimate`'s Agresti-Coull margin (the codebase's convention, DIAL-1) for each class and for all bullets. They are never windowed and are cleared only when a different robot becomes the duel opponent (a melee's survivor). Our bullets count at their outcome (hit, miss, or shot down by an enemy bullet, which the 100-outcome window also counts as a miss). Their bullets count where the energy ledger's firing waves resolve: a wave that breaks on us counts as a hit or a miss at the power the energy drop gave, and an enemy bullet our bullet destroyed counts as a miss when its wave is found (the wave's own break skips it, so it is not counted twice). Outcomes in duress are not counted, as nothing is learned there. The round record (`R`) gains twelve appended fields (48 in all): this round's resolved bullets and hits for us and then for them in classes 0, 1 and 2 (`oS0,oH0,oS1,oH1,oS2,oH2,tS0,tH0,tS1,tH1,tS2,tH2`), so a gate reads per-round and battle-long rates, per class, for both robots from the telemetry alone.
- **POW-7 to POW-9** are `PowerPolicy.applies`, `conditionStands` and `lead`. The condition reads "below by more than the margin" as POW-2 does, from the estimate's centre: the centre plus the margin is under `PowerPolicy.BREAK_EVEN`, **12.5%**. The plan's note says POW-7 uses the lower of the two break-even figures (14.3% at power 1 and below, 12.5% at 1.95) for every bullet, so the stricter 12.5% is the constant, and both robots' all-bullet rates must clear it. With either rate unknown the condition does not hold. In the regime, POW-9 comes first (both energies above 60: the default), then POW-7 (no more than 3 behind: the minimum power, 0.1), then POW-8 (more than 3 behind with more than 10 energy: the default). More than 3 behind with 10 or less energy matches no rule, and 1.20's power-down stands there, which at that energy already fires 0.1, as the probe did.
- **"Default power"** is the gun's base power, 1.95, or 2.95 inside 150 px, without 1.20's cubic power-down. This is the only thing the regime replaces: `GunController.calculateBulletPower(..., Stakes)` skips the cubic under `DEFAULT` and starts from the minimum under `CHAFF`, and the quarter-of-their-energy cap, the floor and the cap at our energy still apply. The probe fired a flat 1.95; the 2.95 inside 150 px is the existing close-range rule, kept. POW-5's cap, POW-1 to POW-4 (which raise with a maximum), RAM-1 and END-3 (which lowers) run after it in their old order, so each takes the precedence it had. Melee battles never enter the regime.
- **POW-10.** The duel withheld a shot whenever our energy was not above the power chosen, and the chosen power was capped at our energy, so below 1.95 energy within 325 px every shot was held. `PowerPolicy.payable` lowers a power the energy cannot pay for to 0.1 less than the energy (never below the engine's 0.1), and holds only when even 0.1 would leave nothing (energy at most 0.1). It is applied at the scan, to the wave's power, and again when the shot leaves, since a hit on us in between can make the aimed power dear. The holds that stay are intentional: SHIELD-2's (a shielder predicts the aim the gun settled on), the conductor's fire permission (WEAVE-3), a gun that is hot or off target, and duress. END-4 (D2) will add its hold at the same two places; the hook is commented there.
- **ADAPT-5.** The profile format moves to **version 3**: one u8 after the normalised group, the verdict `OpponentProfile.leadAware`, written at every round fold and so, after a battle's last round, the battle's end. The verdict is what the rule itself holds at that point (`PowerPolicy.applies`): true when this battle's rates satisfy POW-7's condition, or when the profile's verdict stood and this battle never contradicted it. Contradicting means either robot's rate is above 12.5% by more than its margin (the centre less the margin is over the figure). `OpeningBook.read` passes the verdict through as `Opening.leadAware()`, and the Duel applies POW-7 to POW-9 from the first shot while it stands. Under MEM-9 a version keeps its own store names: version 3 files are `<stem>-v3.hp`, a version 2 file is read once, stats only, with the verdict false (its seeds are not carried over, as for any other version), and encoding at version 2 or 1 (MEM-7) leaves the byte out. The profile grows by one byte, so MEM-5, MEM-8's 1 KB stats and MEM-10's 2 KB are unchanged in kind.
- **RES-14** is `TickBudget.duress()`: three skipped turns in the round and fewer than `DURESS_QUIET_TICKS` (300) ticks since the last. `HadurCore` tells the budget the tick (`tickBegan`) before it asks, so the 300 ticks are engine ticks counted from the last skipped turn, never the round clock (DIAL-2). Another skipped turn after duress has ended starts it again, since the round already holds three. When duress ends, the Duel's view of the enemy is stale (the ledger has missed every energy drop, the logs every state), so the conductor resets it once (`DuelSeam.reset`) and the first normal scan starts afresh. Duress itself, the level RES-9 defined, is unchanged. ROLE-5 and WORLD-1 still read "(RES-9)" for the same condition; they mean the duress level.
- **Re-pinned.** This stage changes the duel's play where POW-7 triggers, where POW-10 now fires, and where duress now ends, so the replay fixtures that diverged were re-recorded and the snapshots and source pins re-taken: see the stage notes in [strategy-evolution.md](strategy-evolution.md#d1) for exactly which.

## Retired requirements

A retired requirement keeps its ID; no new requirement reuses it.

| ID | Requirement | Retired | Replaced by |
|---|---|---|---|
| GATE-1 | While two or more opponents are alive, no sentry robot is alive, no sentry has been scanned this round and the melee subsystems have not failed this round, the core shall drive the robot with the melee subsystems instead of the duel subsystems. | A1 | ROLE-3 (the same conditions, plus the latch: once the duel has driven in a round, melee does not return) |
| MELEE-1 | While two or more opponents are alive, the core shall drive the robot with the melee subsystems (sweep radar, minimum-risk movement, melee gun) instead of the duel subsystems. | M1 | GATE-1, GATE-2 (sentries and melee faults now keep the duel) |
| MELEE-3 | While in melee, the radar shall sweep the full circle until every living opponent has been scanned, then keep turning toward the opponent scanned longest ago. | M2 | MRADAR-1, MRADAR-2 (the sweep now keeps spinning with four or more alive and rescans a weak target) |
| MELEE-4 | While in melee, movement shall head for the candidate point of least risk, where risk grows with each opponent's energy over distance squared, near walls and corners, between two opponents, and with fewer escape routes. | M3 | MMOVE-1 to MMOVE-4 (minimum risk over 160 points with the closest-robot term and virtual bullets) |
| MELEE-5 | While in melee, the gun shall target the opponent with the lowest score of energy, distance and gun turn, and shall switch from a living current target only when another scores at least 20% lower and the gun can reach it within 4 ticks. | M4 | MGUN-1 (the field gun aims at the peak of every opponent's solutions, so there is no single target to hold) |
| MELEE-6 | The melee gun shall aim with circular prediction, fall back to linear prediction while the target's turn rate is unknown, and fire no more power than needed to kill the target. | M4 | MGUN-1, MGUN-2, MGUN-3 (learned play-it-forward aim, circular and linear only as the fallback; the energy table and exact kill power) |
| MELEE-8 | While two opponents within 300 px of each other, and further from us than from each other, are both losing energy to others, the strategy shall keep clear of their fight and halve fire power. | M6 | MMOVE-5 (keep clear, unchanged), MGUN-5 (full power: the M6 sweep found the posture's power cuts and holds cost score) |
| RES-9 | If the engine has skipped three turns in a round, then the core shall run the rest of the round at a duress level that adds no samples, builds no waves, reads no neighbour tree, orbits at the distance floor and fires head-on at power 1.0 whenever the gun is cool and the fire permission is given (WEAVE-3). | D1 | RES-14 (the same duress level, which now ends after 300 ticks without a skipped turn; the trigger of three skipped turns in a round is unchanged) |

### R6 notes

- **MOVE-3 and MOVE-4** are one change in `MoveController.getDangerScore`: the kernel
  `2^(-|a - f| / bandwidth)` is integrated (its antiderivative, `kernelMass`) over the precise
  intersection instead of read at its centre, and over `Wave.transmission(intersection)`'s
  segments (0 in a certain shadow, 0.5 in a possible one, 1 elsewhere) instead of scaling the
  whole wave's danger by `1 - shadowedFraction`. A centred, unshadowed neighbour still scores 1.
  The hit-rate term, which has no angle, keeps the old shadow scaling in `SurfMover.waveDanger`.
  An exact feature match no longer makes the weight infinite (#50 item 4).
- **MOVE-5** is `MoveController.FLATTENER_THRESHOLD` (4.5, was 5.9).
- **MOVE-7** keeps the wave each surf index's neighbours were searched for and drops that
  index's cache when a different wave arrives at it (#50 item 3).
- **PHYS-1** zeroes the velocity when the predicted step meets a wall (#50 item 8); **WAVE-4**
  calls `setWallDistances()` after the real power is set (#50 item 7).
- **MOVE-6 is not in this stage.** The profile stores one whole-battle hit count, so a
  same-phase baseline (from the 100th wave) needs new profile fields and a format bump (MEM-9
  carry-forward). It stays on #55.
