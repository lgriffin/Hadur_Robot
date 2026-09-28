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
| MELEE-2 | Event | When the number of opponents alive falls from two or more to one, the core shall discard its duel tracking and restore full speed before handling that tick's scans. | S2 |
| MELEE-7 | Unwanted | If the melee target's last scan is more than 5 ticks old, then the core shall not fire at it. | S2 |
| GATE-1 | State | While two or more opponents are alive, no sentry robot is alive, no sentry has been scanned this round and the melee subsystems have not failed this round, the core shall drive the robot with the melee subsystems instead of the duel subsystems. | M1 |
| GATE-2 | Unwanted | If fewer than two opponents are alive, then the core shall drive the robot with the duel subsystems from that same tick. | M1 |
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
| MMEM-1 | Event | When a round of a melee battle ends, the store shall persist each opponent's melee profile block alongside its 1v1 profile. | M5 |
| MMEM-2 | Event | When the number of opponents alive falls to one, the core shall hand the survivor's profile and the waves in flight to the duel subsystems. | M5 |
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
| TIME-5 | Ubiquitous | The adapter shall run one warm-up tick through a discarded core before the first round, so that class loading and JIT warm-up do not cost the first real tick. | R1 |
| MEM-6 | Ubiquitous | The store shall keep statistics loadable at quota by evicting seeds from every profile before any statistics are skipped. | R1 |
| MEM-7 | Ubiquitous | The profile codec shall be able to write a profile in the format a previous release can read. | R1 |
| DIAL-3 | Unwanted | If a margin used in a policy comparison is not a finite number, then the policy shall take its conservative branch rather than treat the comparison as settled. | R1 |

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
  battle behaviour. It needed no change outside `TickBudget` — the adapter still reports
  ticks and skips exactly as before, and the core simply starts trusting a better number.
- **TIME-4** and **TIME-5** are not yet implemented; they touch the `hadur-robot` adapter
  (`Hadur.java`'s round-end/battle-end save calls and its first-round setup) rather than the
  core alone.
- **MEM-6** turned out to already hold: `ProfileLibrary.evictSeeds` never returns short of
  its target unless it has already stripped every other profile with seeds, and whenever it
  reaches its target the hard-quota check (100% of quota) is guaranteed to pass because its
  target is computed against the lower 90% (`ProfileLibrary.EVICT_AT`) threshold. So a
  write is skipped only once nothing more can be evicted from anyone; no code change was
  needed, only a test pinning the invariant (`ProfileLibraryTest.skipOnlyAfterEveryonesSeedsAreGone`)
  and a javadoc explaining why.
- **MEM-7** is not yet implemented; it needs a codec entry point that can write the previous
  release's format, not just read it.
- **DIAL-3** found one real gap: `SeedTrust.diverges` compared live and profile margins
  without a finiteness guard, so a non-finite margin (unreachable today, since `Estimate`'s
  margin is always finite by construction — see `EstimateTest.marginIsAlwaysFinite`) would
  have silently read as "no divergence", the wrong direction for a seed the core can no
  longer trust. Fixed defensively so the invariant holds even if `Estimate` is ever changed.

## Retired requirements

A retired requirement keeps its ID; no new requirement reuses it.

| ID | Requirement | Retired | Replaced by |
|---|---|---|---|
| MELEE-1 | While two or more opponents are alive, the core shall drive the robot with the melee subsystems (sweep radar, minimum-risk movement, melee gun) instead of the duel subsystems. | M1 | GATE-1, GATE-2 (sentries and melee faults now keep the duel) |
| MELEE-3 | While in melee, the radar shall sweep the full circle until every living opponent has been scanned, then keep turning toward the opponent scanned longest ago. | M2 | MRADAR-1, MRADAR-2 (the sweep now keeps spinning with four or more alive and rescans a weak target) |
| MELEE-4 | While in melee, movement shall head for the candidate point of least risk, where risk grows with each opponent's energy over distance squared, near walls and corners, between two opponents, and with fewer escape routes. | M3 | MMOVE-1 to MMOVE-4 (minimum risk over 160 points with the closest-robot term and virtual bullets) |
| MELEE-5 | While in melee, the gun shall target the opponent with the lowest score of energy, distance and gun turn, and shall switch from a living current target only when another scores at least 20% lower and the gun can reach it within 4 ticks. | M4 | MGUN-1 (the field gun aims at the peak of every opponent's solutions, so there is no single target to hold) |
| MELEE-6 | The melee gun shall aim with circular prediction, fall back to linear prediction while the target's turn rate is unknown, and fire no more power than needed to kill the target. | M4 | MGUN-1, MGUN-2, MGUN-3 (learned play-it-forward aim, circular and linear only as the fallback; the energy table and exact kill power) |
| MELEE-8 | While two opponents within 300 px of each other, and further from us than from each other, are both losing energy to others, the strategy shall keep clear of their fight and halve fire power. | M6 | MMOVE-5 (keep clear, unchanged), MGUN-5 (full power: the M6 sweep found the posture's power cuts and holds cost score) |
