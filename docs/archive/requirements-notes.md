# Requirement notes (archive)

The notes, readings and stage logs that sat between the requirement tables of docs/requirements.md until 2026-11-22, in their original order. The requirements themselves are in [docs/requirements/](../requirements/README.md).

# Hadur 2 requirements

EARS requirements from the Hadur 2 technical direction. This file is the source of truth: every feature file and unit test names the IDs it covers, and IDs never change meaning.

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
  go-to; level 2 also halves k in every KNN view and drops GUN-7's shadow weighing (the aim is
  D3's plain aim); level 3 also stops scoring the virtual guns. TIME-2's skipped turn holds a level for the rest of the round; TIME-1's slow tick
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
| Kernel | `model`, `physics`, `knn`, `ledger`, `memory`, `port`, `world` (from A3), `link` (from A4) | CORE, WAVE, MEM, PHYS, WORLD, LINK, SHELF |
| Duel strand | `gun`, `move`, `adapt`, `policy`, `shield`, `shieldmode` (from D5), `duel` (from A2) | ADAPT, GUN, DIST, POW, MOVE, END, DIAL, RADAR, SHIELD, TIME, RAM, MIR |
| Melee strand | `melee` | MELEE, MRADAR, MMOVE, MGUN, MSENSE, MMEM |
| Team strand | `team`, from the Team plan | none yet |
| Conductor | the root package, `role` (`posture` until A1), `replay` | GATE, ROLE, WEAVE, RES, STRAND |
| Bench and release | `hadur-bench`, the adapter | BENCH, REL |

### Requirements

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

The plan is [docs/druss-route-plan.md](druss-route-plan.md): the findings of the 4 and 5 October 2026 probes against DrussGT 3.1.16 and the stages D0 to D6 that follow from them. Its stages are compared with `hadur.druss.stage` in the root pom, which is `D5`. The plan's draft IDs were renumbered here because open PR #83 reserves BENCH-9, BENCH-10, POW-6, RES-12, RES-13, GUN-6 and DIST-2: the plan's POW-6 is **POW-11** and its RES-12 is **RES-14**; POW-7 to POW-10 and ADAPT-5 keep their numbers. The requirements of D2 to D6 stay in the plan until their stages are built.

### Requirements

POW-7 to POW-9 apply to a duel only. POW-1 to POW-5, RAM-1 and END-3 keep precedence over them. RES-14 retired RES-9 in D1, and 3.11 retired RES-14 (see the retired table).

### D1 notes

- **POW-11** is `policy.BattleHitRates`, one per robot (`DuelController.ourBattleRates`, `theirBattleRates`): shots and hits in the classes under 0.2, 0.2 to 1.2 and above 1.2, with `Estimate`'s Agresti-Coull margin (the codebase's convention, DIAL-1) for each class and for all bullets. They are never windowed and are cleared only when a different robot becomes the duel opponent (a melee's survivor). Our bullets count at their outcome (hit, miss, or shot down by an enemy bullet, which the 100-outcome window also counts as a miss). Their bullets count where the energy ledger's firing waves resolve: a wave that breaks on us counts as a hit or a miss at the power the energy drop gave, and an enemy bullet our bullet destroyed counts as a miss when its wave is found (the wave's own break skips it, so it is not counted twice). Outcomes in duress are not counted, as nothing is learned there. The round record (`R`) gains twelve appended fields (48 in all): this round's resolved bullets and hits for us and then for them in classes 0, 1 and 2 (`oS0,oH0,oS1,oH1,oS2,oH2,tS0,tH0,tS1,tH1,tS2,tH2`), so a gate reads per-round and battle-long rates, per class, for both robots from the telemetry alone.
- **POW-7 to POW-9** are `PowerPolicy.applies`, `conditionStands` and `lead`. The condition reads "below by more than the margin" as POW-2 does, from the estimate's centre: the centre plus the margin is under `PowerPolicy.BREAK_EVEN`, **12.5%**. The plan's note says POW-7 uses the lower of the two break-even figures (14.3% at power 1 and below, 12.5% at 1.95) for every bullet, so the stricter 12.5% is the constant, and both robots' all-bullet rates must clear it. With either rate unknown the condition does not hold. In the regime, POW-9 comes first (both energies above 60: the default), then POW-7 (no more than 3 behind: the minimum power, 0.1), then POW-8 (more than 3 behind with more than 10 energy: the default). More than 3 behind with 10 or less energy matches no rule, and the gun fires the minimum power, 0.1, as the probe did. (1.20's power-down is not relied on: it applies only beyond 325 px, so a nearly dead robot closer in would fire 1.95 or 2.95.)
- **"Default power"** is the gun's base power, 1.95, or 2.95 inside 150 px, without 1.20's cubic power-down. This is the only thing the regime replaces: `GunController.calculateBulletPower(..., Stakes)` skips the cubic under `DEFAULT` and starts from the minimum under `CHAFF`, and the quarter-of-their-energy cap, the floor and the cap at our energy still apply. The probe fired a flat 1.95; the 2.95 inside 150 px is the existing close-range rule, kept. POW-5's cap, POW-1 to POW-4 (which raise with a maximum), RAM-1 and END-3 (which lowers) run after it in their old order, so each takes the precedence it had. Melee battles never enter the regime.
- **POW-10.** The duel withheld a shot whenever our energy was not above the power chosen, and the chosen power was capped at our energy, so below 1.95 energy within 325 px every shot was held. `PowerPolicy.payable` lowers a power the energy cannot pay for to 0.1 less than the energy (never below the engine's 0.1), and holds only when even 0.1 would leave nothing (energy at most 0.1). It is applied at the scan, to the wave's power, and again when the shot leaves, since a hit on us in between can make the aimed power dear. The holds that stay are intentional: SHIELD-2's (a shielder predicts the aim the gun settled on), the conductor's fire permission (WEAVE-3), a gun that is hot or off target, and duress. END-4 (D2) adds its hold where the shot leaves (see the D2 notes).
- **ADAPT-5.** The profile format moves to **version 3**: one u8 after the normalised group, the verdict `OpponentProfile.leadAware`, written at every round fold and so, after a battle's last round, the battle's end. The verdict is what the rule itself holds at that point (`PowerPolicy.applies`): true when this battle's rates satisfy POW-7's condition, or when the profile's verdict stood and this battle never contradicted it. Contradicting means either robot's rate is above 12.5% by more than its margin (the centre less the margin is over the figure). `OpeningBook.read` passes the verdict through as `Opening.leadAware()`, and the Duel applies POW-7 to POW-9 from the first shot while it stands. Under MEM-9 a version keeps its own store names: version 3 files are `<stem>-v3.hp`, a version 2 file is read once, stats only, with the verdict false (its seeds are not carried over, as for any other version), and encoding at version 2 or 1 (MEM-7) leaves the byte out. The profile grows by one byte, so MEM-5, MEM-8's 1 KB stats and MEM-10's 2 KB are unchanged in kind.
- **RES-14** is `TickBudget.duress()`: three skipped turns in the round and fewer than `DURESS_QUIET_TICKS` (300) ticks since the last. `HadurCore` tells the budget the tick (`tickBegan`) before it asks, so the 300 ticks are engine ticks counted from the last skipped turn, never the round clock (DIAL-2). Another skipped turn after duress has ended starts it again, since the round already holds three. When duress ends, the Duel's view of the enemy is stale (the ledger has missed every energy drop, the logs every state), so the conductor resets it once (`DuelSeam.afterDuress`, `DuelController.resumeAfterDuress`) and the first normal scan starts afresh. That reset also discards both wave managers' outstanding waves (the gun's and the surf's), the gun's virtual bullets and the surf's per-wave state, since they would otherwise be judged against the unobserved interval; the battle-long learning (the trees, ratings and hit rates) stays. The 300 ticks count from the tick the engine skipped (the event's `skippedTime`), not the tick the event is handled on. Duress itself, the level RES-9 defined, is unchanged. ROLE-5 and WORLD-1 still read "(RES-9)" for the same condition; they mean the duress level.
- **Re-pinned.** This stage changes the duel's play where POW-7 triggers, where POW-10 now fires, and where duress now ends, so the replay fixtures that diverged were re-recorded and the snapshots and source pins re-taken: see the stage notes in [strategy-evolution.md](strategy-evolution.md#d1) for exactly which.

### D2 notes

- **SHIELD-3** is three small pieces. `shield.EnemyStillness` reads each scan: the enemy has moved when its velocity is not zero or its position differs from the previous scan's by more than 0.5 px (scan rounding, nothing more), and, for the whole-round question, when its position differs from where it was first seen. `DuelController.bulletHitBullet` asks it when one of our duel bullets meets an enemy bullet and passes the answer to `ShieldDetector.bulletIntercepted(enemyStill)`, which latches the shielder at once, alongside SHIELD-1's four in twenty (the latch is the same one, and it holds for the battle). The history is only known from a round's start: a recovery, or the Duel taking over in mid-round (after duress, or the melee's survivor), marks the enemy as having moved, so SHIELD-3 and SHIELD-4 never act on a guess. The latch is duel-only (a melee's bullets are no evidence). A `P,...,shield,...,shield_3` record marks the latch, `shield_3_profile` the profile's. SHIELD-1's own latch keeps its old silence, so the telemetry of battles that SHIELD-1 already caught is unchanged.
- **The profile keeps it** in version 3, not a new version: version 3 is not released, so its verdict byte (ADAPT-5's, 0 or 1) is now a set of flags, bit 0 the lead-aware verdict and bit 1 the shielder flag. The D1 golden file `profiles/v3.hp` has bit 1 clear and still loads unchanged; a byte above 3 is rejected. `OpponentProfile.shielder` is replaced at every fold with what the detector holds as the round ends (`ProfileFolder.shielder`), so after a battle's last round it is the battle's end, and `OpeningBook.read` passes it through as `Opening.shielder()`. When it stands the detector is latched as the battle opens, so SHIELD-2's aim jitter is on from the first shot. A profile written at version 2 or 1 (MEM-7) leaves the flag out. The size of the profile is unchanged. A flag that was latched in error (a different robot behind the same name, or a robot that stopped shielding) is never lifted by the battle; the cost is small, since the jitter stays on the body and the 3.0 shots are only fired at a robot that stands still.
- **SHIELD-4** is `PowerPolicy.shieldPower`, applied at the scan after POW-1 to POW-4 and before END-3 (so END-3 caps it, as the requirement asks), and before RAM-1 and POW-10 as everything is. It replaces what the lead-aware regime chose (3.0 against a still shielder wins over POW-7's 0.1): the plan's reasoning is that a shielder's bullet scales with ours, so a heavier shot makes its shield dearer. Like every full-power rule it does not apply at 12 energy or less (`PowerPolicy.MIN_OUR_ENERGY`): a shielder destroys the shot and there is no refund. END-4 also holds shield mode's attack shots and duress's head-on shot (`PowerPolicy.holdsShotAt`), not only the main gun's. SHIELD-3's one-bullet latch needs the round's history known: a first scan after tick 10 (`EnemyStillness.KNOWN_FROM`) counts the enemy as having moved, and a survivor's stored shielder verdict applies at the melee-to-duel handoff. "Not moved in the last 10 ticks" is `EnemyStillness.stillForTenTicks`: ten ticks since the last scan that showed movement, or since the first scan of the round. Duel only.
- **END-4** is `PowerPolicy.holdsLastShot`, applied where the shot leaves (`fireIfGunTurned`), to the power POW-10 would fire: every scan still makes its wave, which teaches the gun. The smallest bullet power the enemy has fired this battle is the smallest corrected drop the ledger has read as a shot (`DuelController.smallestEnemyPower`), cleared when a different robot becomes the duel opponent. The enemy "can no longer fire" when its energy is below that figure, and the shot is held when it would leave our energy less than `END_4_MARGIN`, 0.3, above the enemy's. One reading is added to the requirement's words: the shot is held only while our energy is above the enemy's. When level or behind there is no lead to keep, and holding would lose to the inactivity rule for certain, so the shot goes (POW-10). A `P,...,power,...,end_4` record marks each change.
- **The inactivity rule, checked on Robocode 1.9.5.6.** `hadur.bench.InactivityCheck` compiles two tiny robots into a scratch Robocode home and runs one-round battles through the engine the bench uses: an Idler that never acts, and a Spender that waits for a cool gun, fires one bullet of a fixed power at the nearest wall and then idles. Neither can damage the other, so only the inactivity penalty can end the round. Result, run on 5 October 2026: with a gap of 0.1, 0.3, 1.0 or 3.0 energy the robot with more energy survived in every case (the round ended at tick 1,451, 1,449, 1,442 and 1,422, the Spender dying first, the Idler alive); with no gap both died on tick 1,452. So the penalty takes the lower robot first (the round lasts about 1,450 ticks from 100 energy each, which fits 0.1 energy a tick for both robots after 450 ticks without a bullet hit), and a gap of even one penalty step is enough; END-4's 0.3 is conservative, not necessary. Reproduce: see the class's Javadoc.
- **Re-pinned and re-recorded.** The profile files, the duel and the conductor changed: see [strategy-evolution.md](strategy-evolution.md#d2) for exactly which pins and fixtures.

### D3 notes

- **GUN-5** is `GunController`'s ratings split in two and one new virtual gun. Every real duel bullet rates the virtual guns, in the table of the class of the power it was fired at: bullets under 0.2 (`GunController.LIGHT_BELOW`, the line POW-11's class 0 uses) in the light table, the rest in the other. This is the second of the two options the plan left open (rate every wave and key two tables by the real shot's class), and the sound one: a wave only exists with a real bullet on it in a duel, so there is exactly one class to key by and no wave is rated twice. Each table is GUN-1's, unchanged inside: 100-shot half-life, Agresti-Coull margin, the gun named only when it clears every other candidate's margin (so "rated highest" reads, as in GUN-1, "highest beyond the margin of error"; the main gun, or the opening's gun, fires while none does). GUN-4's gate reads the table of the shot's class too.
- **The class is known when the gun is chosen.** D1 decides the power at the scan, before aiming, and the gun wave carries it (`Wave.bulletPower()`), so `GunController.aim` reads the class from the wave. The virtual bullets are rated in the class of the power the shot actually went at (`fireVirtualBullets(..., firedPower)`): POW-10 can lower the power between the aim and the shot, which changes the class only for a shot at the 0.2 line, and then the rating follows what was fired.
- **The new gun, `SampledGun`,** is the probe's "sampled aim" (`data/tools/drussgt/build_probe.sh`, GUN=2): one neighbour of the hybrid view, picked by `floor(phase * n)`, and its guess factor scaled by the precise escape angle on its side. It is a candidate for light bullets only (`Opening.SAMPLED`); for heavy bullets it is neither rated nor fired, so the rest class plays exactly as D2 did. The probe fired it unconditionally; here it competes, so it is used only against opponents where it rates highest, which is the part of the plan's warning ("the gate counts both sides") that a rating can see. One departure from the probe: with no neighbours at all the probe fired a uniform guess factor, and this gun fires head-on (`w.absBearing`, as the hybrid gun does).
- **Determinism (RES-6, CORE-2).** The phase is the golden-ratio sequence, the codebase's way (`shield.AimJitter`, `move.MirrorDrive`): no `java.util.Random`. It starts at the golden ratio's fractional part in every core and lives in the `SampledGun` the `GunController` owns, so a replayed battle repeats it. It advances only when a real shot goes out (`GunController.shotFired`, called from `fireIfGunTurned` whether or not the virtual guns are fired), so the several ticks the gun spends aiming one shot all sample the same neighbour, and the virtual bullet scored for the shot is aimed at the same phase as the shot.
- **The profile does not keep the ratings.** The profile stays at format version 3 and the same size (MEM-5, MEM-8's 1 KB statistics and MEM-10's 2 KB): `virtualGunScores` still reports the main and anti-surfer guns' lifetime totals, now added over both classes, which is what MEM-2 folds. Persisting per-class ratings of four guns would spend profile bytes (MEM-5, MEM-8, MEM-10 are tight) and a format change on a verdict the battle reaches itself within tens of shots (about nine shots in ten are light under the lead-aware rule); a stored rating would also have to be decayed and distrusted like a seed (RES-4) so that it could not hold the gun to the last battle's version of an opponent. Nothing here proves that cost is not worth paying: it is deferred, not ruled out. ADAPT-1's opening gun still decides the first light and heavy shots alike.
- **Observability.** No new telemetry record: the `R` records already carry per-class hit rates for both robots (POW-11), which is what D3's gate reads. `GunController.bestGunLabel` now reads the class with more rated shots.
- **Re-pinned.** Only the duel changed (`DuelController`, `GunController`, the new `SampledGun`): `pins/duel.sha256` and `duel-sources.sha256`. No fixture diverged, so none was re-recorded and no snapshot changed: the fixtures' opponents are fought at ordinary power, where the rest class's table is the combined table D2 had, and the sampled gun is never fired before it has been rated best over light shots.
- **Not measured.** The probe's 7.9% to 9.3% light-bullet hit rate is for an unconditional sampled aim; the rated version is expected to land between that and the density peak, and the D3 gate (40 battles, DrussGT's hit rate as well as ours) has not been run.

### D4 notes

- **MOVE-8** is `move.PlanInterval`, published through `MoveController.planIntervals()` (a read-only list, empty when there is no plan). One interval per enemy wave the surf scored on its last drive, nearest wave first: the wave, the absolute bearing interval from the wave's source that would hit the plan's arrival (`angle +/- bandwidth` of the precise intersection of the states the wave crosses us in, so it holds the bearing to the arrival position), and `danger`, the surf's chance that a bullet fired inside it hits (the views' score plus the enemy's hit rate, as `SurfMover.waveDanger` adds them before the damage scaling, cut to [0, 1]). "Guess-factor interval" is published as the equivalent absolute angle interval, which the requirement's text allows and which needs no escape-angle assumption. The plan is the option the surf chose: for the three-option surf, the chosen option's interval on the first wave and, along the cheapest of the three options after it, on the second; for go-to surfing, the kept candidate's. `SurfMover` records each leg's interval as `checkDanger` and `goToDanger` score it, so no extra prediction is run. The Duel clears the plan before each tick's movement and the surf republishes it, so a tick on which the surf does not drive (ram, mirror, rammer escape) publishes nothing and the gun sees no stale plan. The round start clears it too.
- **GUN-7** is `GunController.aim(wave, myNext, time, ShadowValue)`: the plain aim (D3's, with its per-class rating choice) is made first and stays the centre of the choice, then `gun.ShadowAim` weighs a small set of candidates by `P(hit) * damage(power) + avoided`. Candidates, at most 13: the gun's own angle (first, and the winner of every tie, so a shadow worth nothing changes nothing); four offsets of 0.45 and 0.9 of the target's half-width on either side (the bullet still hits where the gun's mass is, but its path crosses other enemy bullets); and, when the main gun aims, up to 8 of its neighbours' own angles within two half-widths of its choice (the "kernel samples"). The other virtual guns' angles are **not** candidates: they are computed only when a real bullet leaves, and a KNN search per gun per aiming tick is the cost this stage was told to avoid.
- **P(hit).** For the main gun it is `0.399 * (sum of weight * exp(-u^2 / 2)) / (sum of weights)` over the neighbours `MainGun.aim` scored (the same projection and validity tests, from one neighbour search: `MainGun.aimWithMass`), `u` the angle from the candidate in units of the main gun's bandwidth (twice the half-width): the gun's own kernel density, read as a probability that a bot's width of bullets lands. For any other gun (anti-surfer, hybrid, sampled, an opening's gun) its neighbours are not read, and the mass is one Gaussian of the same width at the gun's angle with peak 0.15, a typical hit rate against a surfer. Both are constants of this stage (`ShadowAim.KERNEL_SCALE`, `FALLBACK_PEAK`), not measurements.
- **The shadow value** is `duel.ShadowAvoidance`, the one seam between gun and movement (the gun and move packages may not depend on each other, so the Duel builds the gun's `ShadowValue` out of movement's published intervals and `move.ShadowGain`). For each interval, a candidate `OurBullet` leaves from where the gun will be on the tick after the aim, along the candidate angle, at the wave's power's speed; `BulletShadows.of` gives its certain and possible shadows on the wave, `ShadowGain.shares` unions them with the shadows of our bullets already in flight (brought up to date before the aim, so a shot fired this very tick counts) and returns the share of the interval newly stopped, the certain part counting fully and the possible part half (MOVE-1's rule). The saving is `danger * damage(wave power) * newlyStopped / (1 - alreadyStopped)`: the surf's danger was computed with the old shadows in place, so it is spread over the part of the interval nothing yet stops. A wave of uncertain power counts half (WAVE-3). Intervals on waves already past the shot's source are dropped. `ShadowValue.ceiling` (every interval wholly newly stopped) lets the gun skip a candidate whose hit value plus the ceiling cannot beat the best so far, before any geometry is run.
- **Exact when there is nothing to shadow.** With no published interval (no wave in the air, or a tick the surf did not drive), in the head-on warm-up, or with `GunController.SHADOW_AIM` false, the angle returned is the plain aim's, bit for bit; the Duel does not even build the seam. The virtual guns' bullets and ratings are still the guns' own angles, not the shifted one, so the ratings keep saying how good each gun is. The constant `GunController.SHADOW_AIM` ships `true`; setting it false is the A/B the gate may want.
- **What a shadow looks like.** A bullet exactly collinear with the enemy's has a shadow of one bearing, which has no width; the shadow of a slightly oblique path is a narrow range, a few thousandths of a radian against a bot's 0.08 or so, so one bullet usually stops a few percent of an interval, and the term is small. It matters where the gun's mass is flat over a bot width, which is when the offsets cost little. Nothing here says it moves DrussGT's hit rate: that is the stage's bench gate.
- **Cost.** One more KNN-free pass per aiming tick at most: up to 13 candidates by at most two waves, each one `BulletShadows.of` (at most 120 turns, with the cheap rejections), and the main gun's mass from the neighbours its aim already searched. `GunController.aim` is called only within three ticks of a cool gun. The measured micro-benchmark is in the stage notes of [strategy-evolution.md](strategy-evolution.md#d4).
- **Re-pinned and re-recorded.** See [strategy-evolution.md](strategy-evolution.md#d4) for exactly which.

### Stage 3 gun switches (GUN-8 to GUN-10)

Three duel-only switches from the gun read-out (docs/bench/local/2026-10-20_gun-read.md): Hadur's duel gun is Diamond's melee displacement gun, and Diamond 1.8.22 fires `TripHammerKnnGun` in duels. Flags are on `duel.GunDesign` (`TRIPHAMMER`, `FREE_GUN`, `UNDECAYED`), all off, read by `DuelController` into `GunController.setTripHammer`, `setFreeGun` and `setUndecayed`, each of which ignores a melee or team battle. Ablations `thgun` (th), `freegun` (fg) and `nodecay` (nk; nd is nodur's) in `build-ablation.sh`; stacked builds take their suffixes in the order given.

- **GUN-8** is `gun.TripHammerGun` and `gun.TripHammerFormula`, ported from Diamond's source. Constants are Diamond's: weights `INITIAL_WEIGHTS` to `FINAL_WEIGHTS` by `min(1, (size - 1) / FINAL_TIMES[i])` (a 0 time is final at once), set on the view before each query; k = size/9 up to 225; neighbour weight `1 / sqrt(distance)` with Diamond's distance the weighted squared one; 59 angles across the classic maximum escape angle; cube kernel at `2 * 18 / distance`, where the distance is the wave's source to target, and the answer is measured from the wave's absolute bearing (not from our next position, as the other guns are). Where the formula differs from `GunFormula`: the first feature is `min(3, power) / 3`, acceleration is `(a + 2) / 3`, the wall features are capped at 1.25 and 1.15, and there is no crowd feature. The view is never seeded (a seed sample holds the main view's features). With the switch on, `GunController` makes the extra view, the main candidate's aim, its GUN-7 mass (a Gaussian kernel over the same neighbours) and its virtual bullet come from it; the displacement view still logs, and the main gun's virtual totals are not folded into the profile or checked against the gun seed (RES-4) while the switch is on, since that rating would be the TripHammer's. Warm-up (nine points in the main view) and the opening book are unchanged.
- **GUN-9** is one early return in `GunController.liveVerdict`: the highest rating among the candidates (the first on a tie, in the order main, anti-surfer, hybrid, sampled), as Diamond's `bestGun`.
- **GUN-10** gives each `GunStats` a decay factor of 1 instead of the 100-shot half-life; the lifetime totals the profile folds are unchanged.

### D5: the shield list

Shield mode is Hadur's own bullet shield (SHIELD-5, SHIELD-6), the other half of the SHIELD
group's counter to an enemy that shields (SHIELD-1, SHIELD-2). It is a mode of the Duel
strand, in the `shieldmode` package, and applies to a 1v1 battle only.

#### D5 notes

- **The list ships in the robot jar as a class**, `hadur2.ShieldListData` (`hadur-robot/src/main/java/hadur2/ShieldListData.java`),
  one robot per string, `#` for comments. It is a class and not a text resource because
  Robocode's sandbox denies a robot the read of its own jar: `getResourceAsStream` raises a
  security violation and the robot is killed (seen in the BENCH-11 smoke run), while class
  loading always works. The adapter passes the lines on and the core only parses them
  (`ShieldList`; RES-6 keeps I/O out of the core). A line is a robot's name as Robocode lists it:
  `apv.test.Virus 0.6.1` and `apv.test.Virus` both match every version (SHIELD-26: the version a
  line carries records the version it was benched on).
  Matching is exact and case-sensitive, never a prefix. A list that cannot be loaded is an empty
  list. It ships with 14 robots: the 8 the BENCH-11 probe marked "wins" and 6 "open" ones with a
  mean gain of 9 points or more (docs/bench/d5-probe.md, docs/bench/d5-gate.md). 3.10 adds 83: every
  robot of DrussGT's shield list ranked 51st to 700th that shield mode beat at 8 seeds by the same
  rule, from the #140 mid-table run and the shield sweep (docs/bench/local/2026-10-08_shield-sweep.md).
  Each entry carries its version. The sweep also found where shield mode loses: on 58 of those
  robots the interval lay below 0, and over ranks 401-700 as a whole it cost 2.4 points, so the
  list is chosen robot by robot, never by rank. A name goes on only
  after the paired bench shows shield mode beats normal mode for that robot, or an expected gain
  that APS, the objective, counts; SHIELD-6 bounds the cost. Fixtures whose opponent is not on the
  list replay unchanged.
- **Where it applies.** Only a Duel charter (one opponent, no teammates) is given the list; a melee,
  a team or a sentry battle never has shield mode. The list is asked once, with the opponent's
  name at the first scan. For a listed opponent every round opens in shield mode (a `SH,round,tick,on`
  record); the duel's gun and movement take over when it is left.
- **What shield mode does.** It sits still, predicts each enemy bullet's heading from twelve
  head-on predictors (four head-on bases, each plain, plus a learned offset, plus a learned offset
  times our lateral direction) and fires a lighter bullet that meets it in mid-air, stepping 0.1 px
  aside the tick before so the two paths are not collinear (`ShieldGeometry` is the engine's rule
  for two bullets destroying each other). Between shields it fires the main gun at the enemy only
  when its gun will be cool again in time for the enemy's next shot. Our shield bullets are not
  evidence for SHIELD-1's detector, the hit-rate windows or the bullet shadows.
- **SHIELD-6's amount** (`ShieldBudget`). The score share is ours over the pair's total, read over
  the whole battle: ours = 60 for each round of the battle (a round's survival and last-survivor
  bonuses) plus the bullet damage we have dealt so far, and the enemy's score is its bullet damage.
  Our share stays at 85% or more exactly while the enemy's damage is at most
  `allowed = 15/85 * (60 * rounds + our damage dealt)`; past it, shield mode is off for the rest of
  the battle and the duel plays on. Shield mode is there to win the rounds, so the battle is read as
  won and the budget asks what that can afford. A 35-round battle allows about 370 damage from its
  first tick (35 * 60 * 15/85), DrussGT's own limit for its list of 357 robots; each point of
  damage we deal adds 0.18. The allowance does not move with rounds won or lost: a lost round
  already shows in the damage taken. The round count is the engine's `getNumRounds()`, carried in
  `BattleFacts.rounds()` (0 when not known, such as a replayed transcript, and 35 is assumed). Damage
  counts in or out of shield mode. Kill bonuses are left out of both sides, so the allowance is a
  lower bound and errs towards leaving.
- **The round's safety exits** leave shield mode for the rest of that round only, and the next
  round opens in it again: the enemy within 100 px (`close`), a collision (`rammed`), two enemy
  bullets that hit us with no predictor exact (`unpredicted`), three hits taken and more than we
  shot down (`outhit`) and no enemy shot for 120 ticks (`quiet`); until 3.10 RES-14's duress (`duress`) was a seventh, and 3.11 retired it. Each is
  an `SH,round,tick,exit,reason` record. The battle's exit is `SH,round,tick,off,budget`.
- **Records** are written only for a listed opponent, so a battle without the list writes none and
  the round record `R` is unchanged: `SH` as above, and at each round's end `SR,round,tick,
  shieldShots,intercepts,hitsTaken,unpredicted,attackShots,damageTaken,allowed,exit`.
- **BENCH-11** is the bench's `--shield-probe FILE`: it repacks the candidate jar twice, with the
  list naming every opponent of FILE ("on") and an empty list ("off"), under the versions
  `<version>-on` and `<version>-off`, and runs the pair through the paired machinery of BENCH-2.
  The report gives each opponent's paired difference with its interval, a verdict, what shield mode
  did (rounds, shield shots, bullets met, hits taken, early exits, budget exits), the weighted mean
  difference over the file's weights (BENCH-1) and the opponents that win, as list lines.

### D7: the route's scope (release 3.8.5)

Live, 3.8 gained on the top 10 and lost about 1.5 points a pairing on the field below the top
20, with no bench condition yet reproducing the loss ([leak-38-plan.md](leak-38-plan.md), Track
B). The route's parts that act on every duel are scoped to the duels it was built for: those
whose guns out-hit Hadur's or match them.

#### D7 notes

- **MATCH-1** is `policy.Matchup`, read by `DuelController.updateMatchup` at the top of each
  driven tick from POW-11's battle-long rates, and marked by a `P,...,match,...` record
  (`match_won` or `match_open`) on each change. Against the top 10 our gun hits 5% to 8% and
  theirs 9% to 14% on the local bench, so they never read as won. Unknown rates (fewer than 30
  bullets on either side) read as open, so the first round plays as 3.8 did.
- **MATCH-2** passes `shadowAim && !matchWon` to the aim and `still && !matchWon` to SHIELD-3's
  latch. D1's POW-7 and D3's GUN-5 are left as they are: POW-7 already needs both guns below
  break-even, and GUN-5's light class only fires under POW-7. SHIELD-1's four in twenty, D5's
  shield list and SHIELD-4 on a latched shielder are unchanged. `RoundStats.shadowAims` counts
  the aims that weighed shadows; it is not in the round record.

### D8: the rammer trial (release 3.9)

The live-loser bisect ([live-loser-bisect](bench/local/2026-10-07_live-loser-bisect.md)) put the
one resolved regression since 3.4 in 3.5: 3.5.1 scores 6.4 points below 3.4 on the live losers,
14 opponents down. Building 3.8.5 with RAM-2 off wins them back (+14 to +25 points on six of
them, PR #129): close-range fighters such as TopGun, Silver and Ice confirm as rammers, and
running from them, Hadur is hit two to seven times as often. RAM-2 still wins rounds back from
pure rammers (docs/bench/r9-weak-leak.md), so it is tried, not dropped.

#### D8 notes

- **RAM-3** is `policy.EscapeTrial`, held by `DuelController`. The arm is chosen in `newRound`
  when `RammerPolicy.confirmed()` and marked by a `P,<round>,0,ram-trial,<fight mean>,<escape
  mean>,<arm>` record; RAM-2's escape is passed through only in an escape round. The round that
  confirms a rammer is now fought to its end (3.5 started the escape at the confirming ram).
  `roundEnded` records the margin from the last scan's energies, ours 0 on a loss and theirs 0 on
  a win. The samples are battle-long and go with the opponent (`forget`).
- Against a pure rammer, two fought rounds (the confirming ones) and two escape rounds come
  first, so a battle plays as 3.5 did from the fifth ram round. Against a fighter that 3.4 beat,
  two escape rounds are the cost before Hadur fights again.

## The Team plan (T1)

[team-plan-t1.md](team-plan-t1.md) answers the A5 baseline's teammate collisions and friendly fire
([bench/a5-team.md](bench/a5-team.md)). Its stage letter is `T`; the requirements are built
from `hadur.team.stage` in the root pom (`T1`). Owners: WORLD-9 the kernel, MMOVE-6 to
MMOVE-8 the melee strand, WEAVE-7 and WEAVE-8 the conductor.

### T1 notes

- **WORLD-9.** `Roster.Mate` keeps the heading and velocity a scan, a report or a teammate's
  sighting states with the position. `at(tick)` moves the last known point `velocity` px for
  each tick since, along the heading, no more than 8 px a tick. `Roster.living(now)` lists the
  living teammates whose position is no older than `SILENT_WINDOW`.
- **MMOVE-6 to MMOVE-8.** `TeamRisk.teammateRisk` adds `MATE_K` (0.6) over the
  square of the distance (floored at 36 px) to the teammate's predicted point at arrival, and
  `MATE_PATH_K` (0.3) for a path within 60 px of its predicted track; the ring is capped by
  the nearest teammate as by the nearest opponent. The noise hash is salted with
  `mix(place + 1)` on a team and 0 off one, so a solo field is bit for bit what it was, and the
  opening spots fan out along the wall by 120 px a place. The place is the member's rank among
  the team's names in sorted order.
- **WEAVE-7.** The lane also holds while a teammate's predicted track, between the times the
  fastest and the slowest bullet take to cover its distance, passes within the half-width plus
  3 px for each tick of flight (`TeamLink.TURN_SLACK`).
- **WEAVE-8.** `TeammateFence` simulates the built drive six ticks ahead and compares each
  tick with the teammate's predicted point; within 46 px, and nearer than now, is a predicted
  collision. It tries the drive as given, a brake, a reversal, and keeps the first that stays
  clear, else the one with the greatest closest approach. The `T` record's last field counts the
  drives it replaced.
- Solo play is untouched: every term is reached through the team link or an empty teammate list.

### T6 notes: team gun depth and shooting rammers (MGUN-9, MGUN-10)

- **Why.** The gap to 5th in the TeamRumble (~9.9 APS after 3.15) is members dying: against the
  top 20 and against three ramming teams (TeamDeath, Enjambre, ImpactTeam). CombatTeam's gun takes
  21 situations and shoots only the enemies within 150 px when any are that close; Hadur's took
  three and skipped a rammer inside 100 px (docs/plan-team-top5.md).
- **Where.** `FieldGun.K` (21, read through `k()` only while `onTeam`), and the rammer skip in
  `FieldGun.solutions` now tests `!onTeam`. Off a team MGUN-7's 12 and the skip are unchanged.
- **Gate.** PC card team-s1, all 46 TeamRumble opponents, 6 seeds, paired with the 3.15 release:
  A/A +0.2 ± 0.8; `tk21` +2.4 ± 0.7; `tram` +1.2 ± 0.9; both **+3.4 ± 0.9** (PR #226).
- Solo play is untouched: both read `onTeam`, set only while a teammate lives.

### T6 notes: learned team danger (MMOVE-9, MMOVE-10), switches off

- **Why.** Stage 2 of docs/plan-team-top5.md. After S1 the gap to 5th is mostly the top 20
  teams, who kill Hadur's members with learning guns. Members dodged only MMOVE-3's head-on and
  linear guesses, took every shot as aimed at themselves, and learnt nothing from the hits on
  their teammates. CombatTeam (docs/bench/combatteam-3.25.md 2.2, 2.3) does the opposite.
- **Where.** `melee.TeamDanger` keeps, per enemy, up to 1,000 samples of four features
  (distance / 800, |lateral velocity| / 8, advancing velocity / 16, the share of the escape
  angle ahead inside the walls) and the guess factor, clamped to ±1.2. `MeleeController.learn`
  matches a hit to the World's shot of the same power whose flight fits the hit (40 px slack
  plus the shot's fire window). `MinimumRiskMovement.updateBullets(..., mates, danger, nearest,
  learned)` makes up to `K` (12) `LEARNED` bullets a shot with a Gaussian kernel weight
  (`VirtualBullet.weight`, which `bulletRisk` multiplies in; 1 for MMOVE-3's), under a cap of
  384 bullets. The link carries the samples as `Report.Dodge`; a report with dodges is written as
  version 2 (`LinkCodec.VERSION_DODGES`), one without is version 1 byte for byte.
- **Switches.** `TeamDanger.NEAREST` and `TeamDanger.LEARNED` are both off: the shipped team
  plays as before. `build-ablation.sh t6n` and `t6l` turn them on for the PC gate (card team-s2).
- **Team only: never in the 1v1 or melee capabilities.** Both
  are reached only with a living teammate; with no teammate the movement calls MMOVE-3's own path
  (`TeamDangerTest.soloUntouched`, both switches on), and a hit is learnt only while `onTeam`.
  Checked with both switches turned on: every duel and melee replay fixture (Walls, Crazy, RamFire,
  SpinBot, Tracker, Shadow, warm Shadow, duress, melee samples, sentry, hand-off) replays bit for
  bit; only the two team fixtures change. Any release that turns a switch on re-runs that check.

### T7 notes: the team mode table (TMODE-1 to TMODE-4)

- **Why.** There are only 44 teams in the team rumble, so each can have its own strategy. The decompile read (docs/bench/team-top-decompile.md) found that the
  top teams' movement differs from Hadur's mainly in how much of each enemy shot a member takes as
  its own (Ogi, Firestarter), in regrouping when ganged (Ogi), and in closing on the last enemy
  (Ogi, Combat). Different teams punish different things, so each team gets its own modes.
- **Where.** `melee.TeamModes` holds the table (`TABLE`, empty until the per-team screens fill
  it) and the forced default (`FORCE_SOFT`, `FORCE_GANG`, `FORCE_FINISH`, `FORCE_LEARN`, all off).
  `MeleeController.tick` reads the modes each tick on a team. SOFT is
  `TeamRisk.softWeight`; GANG and FINISH are `TeamRisk.pull`, a `Pull`
  that scales the risk in `risk`; LEARN turns on MMOVE-10 for that team.
- **PACK (TMODE-5).** NightmareTeam's leader sends two or three members after each enemy, on
  an arc round it. Hadur has no leader: every member works out the same prey from the
  positions the team shares, and takes its own place on the arc by its bearing order, so the
  places agree without orders on the link. GANG's regroup comes before the hunt; helping a
  ganged teammate comes after it. The gun still picks its own target.
- **SCREEN and POOL (TMODE-6, TMODE-7).** From the Ogi deep dive (docs/bench/ogi-deep-dive.md):
  Ogi divides an enemy's risk by the robots nearer it, teammates included, and keys its danger
  model by class, so one model learns from all five copies of an enemy.
- **DISABLED, MATEFIRE and REAR (TMODE-8 to TMODE-10).** Team stage S4 of docs/plan-team-top5.md,
  after the mode table failed its gate (docs/bench/team-top-decompile.md section 6): CombatTeam's
  small rules (finish a disabled enemy, keep out of teammates' fire) and a leader that keeps back,
  since its death costs every teammate energy. Teammates' shots come from the reports already on
  the link. Ablations tmdis (md), tmfire (mb), tmrear (mr), all off in the shipped build.
- **Ablations.** `build-ablation.sh tmsoft`, `tmgang`, `tmfin`, `tmlearn`, `tmpack`, `tmscreen` and `tmpool` force one mode on
  against every team. One census run of each scores that mode against all 46 teams, which is what
  the table is built from.
- **Team only.** Off a team the controller sets no modes and calls MMOVE-3's own bullet path;
  with every mode on and no teammate, the bullets and the destination are unchanged
  (`TeamModesTest.soloUntouched`). Checked with every mode forced on: the duel and melee replay
  fixtures replay bit for bit.

### T5 notes: shared gun learning (MGUN-8)

- **Why.** mn.CombatTeam, first in the TeamRumble, trains every member's gun on all five
  members' data (docs/bench/combatteam-3.25.md). Hadur's members already share their scans
  (WORLD-4), but only the World took them. Each member's field-gun history (`EnemyHistory`,
  MGUN-1) learnt only from its own radar.
- **Where.** `TeamLink.merge` keeps each sighting the World takes as a `MateSighting` (as it was
  stated, with the World's turn rate then and the distance from us at merge). `HadurCore.tick`
  hands them to `MeleeSeam.mateSightings` before the tick's events, and so before our own
  scans. `MeleeController.mateSighting` feeds `FieldGun.onSighting` alone, which adds the
  sighting to the history as `onScan` would. The World only takes a sighting newer than what it
  holds, so each history stays in time order. The profiles, the danger book and the targeting
  waves keep to our own radar.
- Solo play is untouched: the sightings come only through the team link, which exists only on a
  team.

### T2 notes: team firepower (MGUN-6)

- **Why.** On the team ladder's ranks 21-33 members fired mean power 1.35 against HOFSwarm's
  1.93, did a quarter less damage a battle, and rounds ran a third longer; per enemy bullet they
  were hit no more often than HOFSwarm's members (docs/bench/team-lower-half.md, sections 9-11).
- **Gate.** The `tpow` ablation of 3.12, the code MGUN-6 ships, against all 45 TeamRumble
  opponents, 6 seeds, paired with 3.12 on the PC: 69.2% against 63.5%, **+5.7 ± 1.1 points**, no
  team worse beyond its spread (PR #191, `docs/bench/local/2026-10-12_team-census-tw.md`).
- **Where.** `MeleeEnergyPolicy.teamPower` replaces the table's result in
  `FieldGun.solutions` while `FieldGun.onTeam` is set; `MeleeController` sets it each tick,
  before the targeting waves, from the living teammates (MMOVE-6's list, empty off a team). A
  teammate silent past the window drops out of that list, and with it full power; the gated
  `tpow` build read the same list, so this is the behaviour the gate measured. The
  MGUN-3 table, its lead cap and its two-left row stand off a team and below 30 energy.
- Solo play is untouched: off a team `onTeam` is never set, so 1v1 and melee replay bit for bit.

## 3.11: duress retired (RES-9, RES-14)

3.11 is 3.10 with duress gone. The census (docs/plan-3.11-census.md) benched the same build with
`TickBudget.duress()` never true: +0.73 APS (+0.59 to +0.87) on the whole 1,212-bot field, and on a
client with the CPU constant halved 3.10, in duress every battle, scored 48% share against 85% for the
build without it. RES-14 is retired, and with it RES-9's use (see the retired table).

- **What went.** `TickBudget.duress()`, `tickBegan`, `DURESS_SKIPS` and `DURESS_QUIET_TICKS`; the
  `Duress` class; the conductor's duress branch (`observeInDuress`, `wasInDuress`) and
  `Tick.duress()`; `DuelController.duressDrive`, `duressScan`, `hitInDuress`, `canFightInDuress`,
  `resumeAfterDuress` and the seam's `afterDuress`; `ShieldMode.onDuress` (the `duress` exit);
  `MoveController.discardWaves` and `GunController.discardPendingVirtualBullets`, which only the
  resume used.
- **What stayed.** A skipped turn still sheds a level for the rest of the round (TIME-2) and the first
  one still teaches the allowance (TIME-3); the round simply never leaves the full Duel. The R record's
  `duressTicks` column (index 33) and the bench's duress columns (BENCH-20, BENCH-21, BENCH-23) keep
  their place and now always read 0, so old and new rows still join.
- **Re-recorded and re-pinned.** Only `duress-sample.Walls` (and its telemetry snapshot) diverged; it was
  re-recorded with the bench command in `hadur-bench/README.md` (a 0.15 ms CPU constant, 9 skipped turns)
  and still holds skipped turns, now without duress. The other twelve fixtures replay unchanged. Pins:
  `kernel`, `duel`, `conductor` (`-Dhadur.pin=kernel,duel,conductor`) and `duel-sources.sha256`.
- **ROLE-5 and WORLD-1** lose their "while a tick is not in duress" condition; they held on every tick
  that was not, and now that is every tick.

## 3.12: the mirror aim fires against a shielder (SHIELD-7)

- **The fault.** MIR-1's mirror aim carries no SHIELD-2 offset (`aimCarriesJitter` is false for
  it by design), and SHIELD-2's hold fired only aims that carried one, so once a shield verdict
  latched against a mirror bot the gun never fired again that battle. SHIELD-3 stores the verdict,
  so later battles started silent. 3.12 P4 (docs/plan-3.12.md,
  the p312b/c/d findings in PR #182): on 38 volatile bots the battles under 60%
  share fell from 14 of 152 to none in the warm replay, +4.4 to +5.7 points; the 400-bot screen
  was level (+0.03 APS).
- **Where.** `AimJitter.holdsShot(shielded, aimCarriesJitter, mirrorAim)`, called where
  `DuelController.fireIfGunTurned` decides to hold. The detector, the stored verdict and the
  jitter itself are unchanged (P4's stricter detector and P6's ignored verdict were level on the
  screen and are not in 3.12).

## Toward Nullstride's shield (SHIELD-8 to SHIELD-14)

The plan "Hadur: the road from 87.7 to 90 APS" (2026-10-11, docs/plan-90.md) reads Nullstride
2.3.3's decompiled shield beside Hadur's and lists where they differ. Each difference is one
switch of `shieldmode.ShieldDesign`, so each can be benched on its own (step 1 of that plan).
Each requirement below holds where its switch is on. 3.12 shipped every switch off; since 3.13
the robot ships hold, learn, mode and stay (SHIELD-13), the build the PC's 8-seed step 3 swept
Nullstride's list with (docs/bench/local/2026-10-12_plan90-pc-read.md).

- **Switches** (`ShieldDesign.parse`): `hold`, `learn`, `mode`, `stay`, `turn`, `wall`, or `all` (the first five; `wall` is not in `all`). The
  ablation builds edit the one line `SHIPPED = parse("")` (`hadur-bench/build-ablation.sh`:
  `shold`, `slearn`, `smode`, `sstay`, `sturn`, `swall`, `snull` for all five).
- **SHIELD-8.** A disabled enemy (energy 0) is still shot: it cannot fire back. 3.12 fires the
  main gun between shields and at tick 32 of a quiet enemy; in a simulation of Hadur's own
  classes those attack shots were what let bullets through inside about 420 px.
- **SHIELD-9.** The engine's `BulletHitBulletEvent` carries the other bullet, so the adapter
  passes its heading (`BotEvent.BulletHitBullet.enemyHeading`, appended to the transcript's `X`
  line after the owner; older lines read it as NaN and teach nothing).
- **SHIELD-10** is `shieldmode.ModalOffset`: each kept error carries how many kept errors lie
  within the tolerance of it, so an add is linear in the 500 kept; a tie goes to the latest.
- **SHIELD-11.** `SH,round,tick,off,damage` and `SH,round,tick,off,silent` are the new battle
  exits; SHIELD-6's budget still applies. The 150 is Nullstride's. A shot whose power the
  ledger is unsure of (a wall hit inferred on the same interval) builds no wave but still counts
  as the enemy having fired (`ShieldMode.onEnemyFired`).
- **SHIELD-12** is a reconstruction: the decompiled method is obfuscated, and the tick the
  enemy's body turn is read from is my reading of it. It is a predictor like the others and is
  used only while it has matched the most bullets.
- **SHIELD-13** (3.13). On the PC at 8 seeds against 3.12, the four step-1 builds were level
  with each other on the 89 robots both lists name (hold alone +4.1 points a robot; learn, mode
  and stay each within ±1.4 of it; turn +0.1), so the robot ships the build step 3 measured,
  not a combination it never ran. Step 3: +6.6 points a robot on the 198 (+1.07 APS unpicked);
  103 admitted, worth +1.17 APS on the seeds that chose them. Every switch acts only while shield
  mode is on, which needs a listed opponent in a duel, so no other opponent, and no melee or
  team battle, plays differently.
- **SHIELD-14** (off by default). On the 200 listed robots most of the real `nowave` damage
  came from uncertain shots (SHIELD-5 builds no wave for them): about 3,046 of 6,932 in 400
  battles were shots whose corrected power was right, and 1,979 were shots whose wall split
  picked the wrong impact speed. `EnergyLedger.Reading.guess()` tries `explained - wallDamage(v)`
  over the impact speeds `impactSpeeds` lists (one tick: scanned, +1, -1, -2), keeps legal
  powers in [0.1, 3.0], and takes the one nearest the corrected power of the latest sure shot
  this round; it equals `corrected` for a sure reading and when there is no such reference or
  candidate. `corrected` and every WAVE-3 behaviour are unchanged. The uncertain wave skips
  `findWave`'s power filter and measures the hit's distance error at the hit's own speed.
- **SHIELD-15** (off by default; `strial`, suffix `sy`). Ogi v1's `ShieldTrial`, read from its
  decompiled jar (docs/bench/rivals-source-read.md): every opponent starts shielded and the
  shield is dropped for the battle on the first of the five failures. Counted only for unlisted
  opponents while the mode is on (`ShieldMode.onTrial`): shots from `onEnemyShot`/`onEnemyFired`,
  damage and hits from `onHitByBullet`, shot-down bullets from `onIntercepted`, lost rounds from
  `onRoundEnded(tick, won)`. A ram ends the trial outright, whatever `stay` says. Purpose: the
  field-wide alternative to a longer list (docs/plan-mode-table.md, stage 4). Tests:
  `ShieldTrialTest`.
- **SHIELD-16** (on since mode table v1, PR #244: census gate +0.54 ± 0.20 APS with the 49 robots it added to the shield list; before that off, `sprior`, suffix `sq`). Saguaro 1.0's second head-on option
  (`BulletShieldMode.buildEnemyWave`, index 1): head-on from the shooter's position on the tick
  before it fired, plus its body turn on the firing tick. SHIELD-12's base starts from the firing
  point instead, so it misses a gun that turns with the body while the robot moves. Saguaro's
  shipped shield aim picks this base (options 1, 5 or 9) for SavantMicro, GateKeeper and
  ButtHead, three of the bots our shield fails on with no predictor exact
  (docs/plan-shield-quality.md). Tests: `ShieldDesignTest` (SHIELD-16).
- **SHIELD-17** (off by default; `smove`, suffix `sv`, every shielded opponent; `smovelist`
  with `SHIELD_MOVE=<file>`, suffix `mv`, per opponent through `ShieldTableData.moves()`).
  Saguaro's MovingBulletShield as the plan reads its decompile (docs/plan-mode-table.md, M4):
  the standing shield plus an opening reposition while the enemy's gun cools. `ShieldMode.tick`
  returns `openingDrive` while the opponent is shielded, has not fired this round, no wave or
  plan is open, the field size is known (`Situation`'s 17-argument form, which `DuelController`
  passes) and the tick is before `enemyNextFire - MOVE_STOP_TICKS`. Forward or back by the
  smaller body turn, gun to the main gun's aim, no shot. Duel-only: shield mode runs only in
  `DuelController`. Tests: `ShieldOpeningTest` (SHIELD-17).
- **SHIELD-18** (shipped aims need no switch; `ShieldTableData.aims()` holds shield part 2's 221
  aims and `moves()` its 31 opening drives, with 16 list adds, PR #256, gate +0.31 ± 0.12 APS;
  `srec`, suffix `sk`, writes the records; `saimlist` with `SHIELD_AIM=<file>`, suffix `ak`, fills
  the aims). Saguaro ships each shield bot's best aim (one of 12 options plus an offset, 9 bytes)
  so its shield aims right in round 1; Hadur's predictors start cold every battle. An aim line is
  `shield-aim: predictor offset name` in the list `ShieldList` parses; the predictor index is
  `ShieldMode`'s (with SHIELD-16, 5 bases, 15 predictors). The `SP` record is
  `SP,round,tick,bases,best,offset,exact,samples,openingTicks`, the offset to 9 places since a
  predictor is exact within 1e-5. Tests: `ShieldOpeningTest` (SHIELD-18).
- **DODGE-1 to DODGE-3** (1v1 strategy after 3.16, docs/bench/live-3.16.md: Saguaro's ShotDodger
  mode covers 429 bots, +0.60 APS over Hadur there). `physics/SimpleAims` computes the 12 aims from
  the states `DuelController` puts on each movement wave (`Wave.aimStates`, only while the dodge is
  on); `physics/ShotDodger` counts the matches and gives `SurfMover.waveDanger` its 0/1 danger. Both
  are pure and live in `physics` so team code may reuse them. The first cloud smoke (32 simple-gun
  bots, +0.58 ± 0.67) locked on in only 13 of 32 battles' bots: the matched ones were head-on at lag 1;
  linear guns matched under 40% of bullets. Version 2 adds Saguaro's other experts (one-line linear,
  learned divisor, gun turning with the body). Our own state is exact, so a simple
  gun's bullet matches its aim to within float error; 0.002 rad allows for the enemy's rounding. A
  learning gun matches no aim, so the dodge stays off against it even when forced on. Ablations
  `sdodge` (suffix `sg`, every opponent) and `sdodgelist` (`SHOT_DODGE=<file>`, suffix `dg`, the
  table's entries in `ShieldTableData.dodges()`). Tests: `ShotDodgerTest` (DODGE-1, DODGE-2, DODGE-3).
- **DODGE-4 to DODGE-6** (1v1 plan to 3rd, 2026-10-25: Saguaro leads Hadur by +0.57 APS on the 423 bots its
  table fights with ShotDodger). The dodge-smoke runs showed DODGE-2's reading locked (Machete: 190 of 194
  bullets read matched one expert) yet Hadur took the same damage as without it (about 2,150 a battle): the
  three-option surf cannot reach a spot the known bullet misses at close range. The planner is Hadur's
  own design (inspired by others, not copying them),
  taking three ideas from Saguaro's ShotDodger and none of its code or data: score a path by its
  clearance from the predicted bullet (`damage / clearance^2`, a hit above any miss), add the enemy's
  distance (`2500 / d^2`), and learn the experts loosely (Gaussian, 0.18 GF) from hits and from the
  bullets that passed. Its paths are our surf's stop points, its experts our simple aims, each
  bullet's band our own misses, and against close-range bots it keeps away with no wave in the air.
  `move/ShotDodgePlanner` is that planner; `ShotDodger.observe(aims, heading, escapeAngle)`,
  `observePass`, `prime`, `planBest` and `planActive` its reading; `MoveController.setDodgePasses` the pass
  learning. Shipped experts are derived from our own bench DP records, never from Saguaro's. Ablations
  `sdplan` (suffix `sp`, every opponent) and `sdplanlist` (`SHOT_DODGE_PLAN=<file>`, suffix `sp2`,
  `ShieldTableData.dodgePlans()`; 8 robots held on 12 fresh PC seeds in pc-locks round 6, PR #890, 4 more in round 7, PR #902, 2 more in round 9, PR #913, and 3 more in round 10, PR #922). Tests: `ShotDodgerTest` (DODGE-4, DODGE-5), `ShotDodgePlannerTest` (DODGE-6).
- **POISON-1, POISON-2** (1v1 strategy after 3.16, docs/bench/live-3.16.md: Saguaro's WavePoison
  and WavePoisonShift modes cover 148 bots, +0.87 APS over Hadur there). `move/StopAndGo` drives
  while it is on, read from Saguaro's jar: against a gun that aims from our velocity when it fires,
  every bullet is aimed at a robot all but stopped, and we are gone by the time it lands. The waves
  are still made and logged, so the views keep learning. Ablations `sgo` (suffix `wp`, variant 1)
  and `sgo2` (`ws`, variant 2) for every opponent; `sgolist`/`sgo2list` (`STOP_GO`/`STOP_GO2=<file>`,
  suffixes `wl`/`wm`) for the table's entries in `ShieldTableData.stopGos()`/`stopGoShifts()`.
  Mode table v2 (pc-1v1-modes, PR #263) ships 18 variant 1 and 35 variant 2 entries: verify gate
  on fresh seeds +0.61 ± 0.10 APS over 1,217 pairings, A/A inside its band. Every opponent a
  variant would lose against stays off the table (wrong variant: 5-20% score share).
  Tests: `StopAndGoTest` (POISON-1, POISON-2), `ShieldListResourceTest` (POISON-2).
- **SB records** (measurement, every design): each bullet that hits us from a listed opponent
  writes `SB,round,tick,class,ordinal,predicted,power`, class `off`, `nowave`, `missed`
  (a shield bullet was fired at it), `first` or `unshielded`, so the plan's step 2 can classify
  what still gets through from the battle logs (`data/tools/shield_leaks.py`).

## Top 3, stage 0: where the hits come from (MOVE-9 to MOVE-23, POW-12)

The plan "from 7th to top 3" (2026-10-15, docs/plan-top3.md) finds the 1v1 gap to the robots
above is bullet damage taken from robots on no shield list. Stage 0 measures why those bullets
get through before any movement change is tried. MOVE-9 writes a record and changes no order:
the replay fixtures' orders are unchanged, and their telemetry snapshots differ only by the HF
lines.

- **HF record**: `HF,round,tick,class,gf,linearGf,dangerPct,distance,power,driving,planOffset,planDanger,planAge,options,optionsAge`
  (`move.HitForensics`). An offset of at most 1 means the bullet hit inside the interval the surf's
  plan expected us to occupy (`MoveController.lastPlanFor` keeps each wave's last published plan for the round). A hit is `linear` within our half-width (18 px seen from the source)
  of `asin(lateral velocity / bullet speed) / escape angle`, else `headon` within it of 0. The
  percentile samples 41 guess factors in [-1, 1] with the surf's own danger score; near 0 the
  views thought the angle safe, near 1 they knew it was dangerous. `options` (MOVE-10,
  `HitForensics.optionFlags`) is three characters, counter-clockwise, stop, clockwise: `h` the
  bullet lay inside that option's plan, `m` outside, `-` no plan; the option taken in capitals.
  A hit with a lower-case `m` beside a capital `H` is one another option would have dodged.
  The options are those of the first tick the wave was surfed (`optionsAge` ticks before the
  hit): by the tick before arrival every option leads to the same place, so later ones always
  read `hhh`.

## Top 3: the movement lab

Hadur's movement is tested apart from its gun: a silent Hadur (`build-ablation.sh silent`, which
combines with the other ablations as `silent,<x>`) fights six reference shooters that differ only in
their gun, and its score is the damage it takes. [docs/bench/move-lab.md](bench/move-lab.md) says how
to build, run and read it.

## AES: refitting the surf's danger blend (AES-1, MOVE-22)

The AES assessment (docs/plan-aes.md) keeps one experiment: fit the weights that blend the surf's
danger terms offline, against the bullets the engine says were fired, on the flat-mover x
learning-gun bots. AES-1 records the terms; `data/tools/aes_rank.py` joins them to the truth log,
checks the re-blend picks what the surf picked, and fits.

- **AES record**: `AES,round,tick,fireTime,power,firing,sourceX,sourceY,chosen,views,` then per option
  (counter-clockwise, stop, clockwise) `0` for no plan, or `1,total,` and the `AesRecord.FIXED`
  terms (`low,high,first,hitRate,shadowed,viewScore,damage,uncertain,timeToImpact,distQuotient,escape`)
  followed by `2 * views + 1` view parts (weighted densities, weighted scan weights, fallback or
  `nan`). The views' score is the first `views` parts' sum over the next `views`; the first wave's
  danger is `(hitRate * (1 - shadowed) + viewScore) * damage * (uncertain ? 0.5 : 1) / timeToImpact
  * 2.5^distQuotient / 2.5 * escape`; the total adds the cheapest next-wave danger. Ablation
  `aesrec` (suffix ar) in `build-ablation.sh`; `MoveDesign.AES_RECORD` is off in every shipped jar.

## The enemy-gun oracle (ORACLE-1 to ORACLE-4, MOVE-29, BENCH-134, BENCH-138, BENCH-140, BENCH-141)

K0 of the road to king (Leigh's doc "Hadur: the 1:1 map, tonight's card, and the road to 1v1 king",
2026-10-28; docs/bench/gun-oracle.md). The king's lead is the 431 learning guns on flat movers, where
damage taken is the whole gap and no table mode applies, so the work is a better model of the enemy's
gun. The oracle scores any model of it offline against the bullets the engine says were fired, with
the surf's own views as the baseline, before a model costs a PC battle. AES-1 measured how the surf
blends its terms; the oracle measures what each model predicts.

- **ORC record**: `ORC,round,tick,fireTime,power,firing,sourceX,sourceY,absBearing,orbitDirection,maxEscapeAngle,distance,chosen,`
  then `low,high` per option (counter-clockwise, stop, clockwise; `nan,nan` for no plan), then `views`, then per view
  `on,weight,count` and `count` pairs `guessFactor,scanWeight`. A guess factor `g` is the angle
  `absBearing + g * orbitDirection * maxEscapeAngle`. Ablation `oracle` (suffix or) in `build-ablation.sh`;
  `MoveDesign.ORACLE_RECORD` is off in every shipped jar.

## The melee gun in the crowd (MGUN-7, M7)

The melee gap read (docs/bench/melee-gap-3.13.md) found Hadur 3.13 17th in the MeleeRumble with
the lowest bullet damage of the top-20 fields: its gun sat cool and unfired on 21% of its
ticks. Cheap power and fire-rate switches were level or worse, so M7 changes the gun itself.
Every M7 requirement holds only in free-for-all melee: off a team, where MGUN-6's
`FieldGun.onTeam` is false. A 1v1 battle never reaches the field gun, and a team keeps MGUN-1's
gun as it was (docs/bench/melee-gun-3.13.md).

- **MGUN-7.** `FieldGun.MELEE_K` (12) beside `FieldGun.K` (3), chosen by `FieldGun.k()` from
  `onTeam`. More situations spread each opponent over the angles it is likely to reach, so the
  summed density peaks where several opponents' futures overlap. Gate: the `gk` ablation of
  3.13 on the five top-20 melee fields, 3 seeds each, paired with 3.13: ahead on every field
  (+0.2, +1.3, +1.0, +0.8, +2.2), +1.1 APS pooled; damage a round 54.7 to 56.7, hit rate in the
  crowd 24.6% to 25.2% (`docs/bench/local/2026-10-15_melee-top20-gk-vs-313.md`). A second run
  of fresh battles: +1.3, -1.7, +1.6, +0.4, +1.3, +0.6 pooled, damage +8% (`...-gk2-vs-313.md`);
  +0.85 APS over both.

## The top-5 harness: free points and multi-arm runs (TIME-8, RES-15, BENCH-91..94, R9)

The top-5 plan (docs/plan-top5.md) measures several builds side by side on the PC instead of
one census per idea, and first takes the points Hadur loses to avoidable faults: start-up
disables (a round-0 skip run past the engine's 30-turn limit) and rows that mislabel a round.
None of these change how the robot plays; TIME-8 and RES-15 only report.

- **TIME-8.** `Hadur.setupRecord`, printed once in round 0. The PC's round-0 read
  (`docs/bench/local/2026-10-21_round0-skips.md`) found 39 of 4,848 battles disabled at start-up,
  the first record at median turn 105; the record says where those turns go.
- **RES-15.** `HadurCore.writeBattleHealth` with seven arguments appends
  `,setupMs,firstTurn,maxRun`; the four-argument form keeps the old record, so older readers and
  the replay fixtures are unchanged (since 3.15 the recorder logs the three fields too, see below). `data/tools/live_client.py` reads both shapes.
- **BENCH-91.** `LogHarvester.noteTurn` latches a round once either robot is dead.
- **BENCH-92.** `Arms` and `Bench.runArms`. Shuffling the order spreads load and drift over
  every arm; an A/A arm (the control under another name) prices the run's own noise.
- **BENCH-93.** `Affinity`: PowerShell `ProcessorAffinity` on Windows, `taskset -a -p` elsewhere;
  best effort, written to each battle's `pin.txt`.
- **BENCH-94.** `data/tools/multiarm.py`, tested by `data/tools/test_multiarm.py` in CI.
- **BENCH-219.** `Bench.suiteFieldDone` / `markSuiteFieldDone` (`suite-done.txt`, moved into place
  whole). Why: the cloud box restarted four times on 2026-11-06, and a melee census suite then reran
  every field from the first. Tested in `SuiteResumeTest`.
- **BENCH-95.** `Arms.ROW_FILE` (`arm-row.tsv`) is written in each battle's folder after it is fought;
  `Arms.resumed` reads it back in `Bench.runArms`. Why: on 2026-10-22 a stop of the census to move it
  onto NVMe threw away ~2,000 finished battles, because a queue step could only rerun from zero.
  Tested in `ArmsTest`.
- **BENCH-96.** `Bench.TEAM_DONE` (`team-done.txt`: the team that fought, then the battle's stray data
  files) is written beside a team battle that read back ok; `Bench.resumedTeam` reads it in
  `teamBattle`. Why: the team plan's PC card (docs/plan-team-top5.md) runs 2,208 team battles and
  team mode had no resume, so any stop would have refought a whole step. Tested in `TeamReportTest`.
- **BENCH-97.** `LogHarvester(dir, us, truth)`; the battle child reads `-Dhadur.bench.truth`, which
  `Bench.childFlags` sets from `--truth-log false`. Why: the 2026-10-23 throughput read
  (`docs/bench/throughput.md`) measured the truth log at +7 to 12% a tick on Hadur against DrussGT and
  5.6 MB of gzip a strong battle, read by no bench report. Tested in `TruthLogTest`.
- **BENCH-98.** `hadur-bench/tools/ladder.py`, run by `plans/pc-ladder.queue`; tested by
  `tools/test_ladder.py` in CI. Why: the PC ran 8 team and 12 duel workers on 24 cores and only pinned
  widths above 12 had been measured.
- **BENCH-99.** `hadur-bench/tools/table_v1.py` and `build-ablation.sh slistadd` (suffix mt, needs
  `SHIELD_ADD=<file>`), run by `plans/pc-table-v1.queue`; tested by `tools/test_table_v1.py` in CI.
  Why: Leigh made the per-opponent table the 1v1 strategy (2026-10-23) and runs it on the PC
  unattended, so every pick, build and gate is a queue step with no decision in between.
- **BENCH-105.** `hadur-bench/hostprofile.py`, `benchqueue.py` (host variables, `host`, `--workers`,
  `--work-dir`), `HostWidth.java` (`--parallel auto`, `--cpu-constant auto`); tested by
  `test_hostprofile.py`, `test_benchqueue.py` (HostTest) and `HostWidthTest`. Why: a laptop as a second bench
  machine (2026-10-25); the PC keeps its measured 12 (PR #232). See
  `docs/bench/second-machine.md`.
- **BENCH-106.** `hadur-bench/tools/host_check.py`, `plans/host-check.queue`; tested by
  `tools/test_host_check.py`. Why: a laptop's numbers stand beside the PC's only if its skipped
  turns and level match the PC's on the same battles.
- **BENCH-107.** `HostWidth.shard`, `--shard`; tested by `HostWidthTest`. Why: two machines on one
  census without fighting an opponent twice.
- **BENCH-108.** `Bench.runSuite`, `Bench.suiteLinesAtOnce`; tested by `SuiteParallelTest`. Why: pc-melee-s0
  (results PR #292) asked for 12 workers on the PC but ran 4 battles at a time, because each 4-seed field
  only has 4 battles and the suite ran fields one by one; the main PC should always run at full width.

## 3.15: the census winners shipped (MOVE-24, SHIELD-14 on)

- **MOVE-24.** `MoveDesign.FLATTENER_OFF` (true), set per battle in `DuelController`'s constructor
  as `moveController.setFlattenerOff(duelOnly(FLATTENER_OFF, enemiesTotal))`; `MoveController.viewOn`
  then never turns on `flattener` or `flattener2` and ignores flattener-first. In a duel this plays
  exactly as the benched `flat` ablation (nf: threshold 1000, flattener-first off), whose light
  flattener also kept its own 3% threshold. Ablation `flaton` (fo) undoes it. Why: the top-5
  factorial (PR #221, 1,212 bots) put it at +0.12 ± 0.10 APS, and the release-candidate census
  (PR #222) put it with the wall shot at +0.34 ± 0.15 APS over 3.14 (A/A −0.00 ± 0.17). In a duel
  this supersedes ADAPT-2 and MOVE-5 for the two flatteners. Tested in `SurfOpeningTest`,
  `DuelOnlySwitchesTest` and adapt.feature.
- **SHIELD-14 ships on.** `ShieldDesign.SHIPPED` is `wall,hold,learn,mode,stay`. Shield mode exists
  only in a duel, so melee and team are untouched. Ablation `nowall` (xs) undoes it. Why: +0.19 ±
  0.09 APS in the factorial, all of it on ranks 401+.
- **Fixtures.** `abc.Shadow_3.83c` was re-recorded on 3.15 (the only fixture whose orders moved),
  with its telemetry snapshot; duel and owner pins re-taken. The recorder's `HE` line now carries
  RES-15's three start-up fields, so a fixture recorded since 3.15 replays the seven-field health
  record; older fixtures keep the four-field line.

## Retired requirements

A retired requirement keeps its ID; no new requirement reuses it.

| SURF-BANK-1 | 1v1 surf danger bank (population prior, online table and k-NN over the enemy's known bullets) scaling each three-option total by the 4th root of the bank's share of its first-wave interval. Removed: the replay passed (chosen option hit 8.69% to 8.41% on 33 learners, better on 28), but the whole-field cloud test was level: 1,193 robots x 2 seeds (37900-1, c / aa / sb, live timing) read +0.06 +- 0.12 APS against both controls, A/A clean; a post-hoc low-gap lead (+0.20 +- 0.13 pts on 780 robots) read +0.02 +- 0.20 on fresh seeds 37902-3 (381 robots). Fewer replayed hits on the chosen option do not become score. | 2026-11-16 | - |
| BENCH-TG1 | The bench shall carry the `pc-team-dgun` card: aa, a bb A/A copy and dgu (ablation tmdgun) on the 46 teams of team-census46.txt; a pilot of 3 seeds from 9300 that ends the card, opening its results PR, when dgu's projected team APS change (each team's gain less half its bb gain, over 46) is below zero; else both to 12 seeds, gated at +0.5 APS with the 95% low end above zero; fails, stall and skips stop rules on every battle step; results on claude/pc-team-dgun-results. | T7 | none: pc-team-dgun pilot FAILED (PR #650): projected -0.02 +- 1.75 team APS over 45 teams at 3 seeds, 26 skipped turns a battle vs 17; DUELGUN, TeamDuelGun, the tmdgun arm and the card removed |

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

## Core surf rebuild: heat-jit (MOVE-28)

The stop-point surf (MOVE-25), its simple-aim mix (MOVE-26) and the enemy-gun ensemble (MOVE-27)
failed and are removed (3.22 cleanup); the mimics live on in MOVE-33 and MOVE-34.

## Team step C: Ogi's narrow fire lane and dodging teammates' bullets (WEAVE-9, TMODE-12)

- **Why.** Step B (docs/plan-team-top5.md) found Aleph's edge over us is tempo: the wide lane
  (WEAVE-4, WEAVE-7) held about a third of our shots (9.6 shots per 50 ticks against Aleph's 14.8).
- **Gate.** PC card pc-1v1-modes, team C block: all 46 TeamRumble opponents, 6 seeds, paired with
  3.16 (PR #264). A/A +0.6 ± 0.7; no lane (`tlane0`) +0.9 ± 1.0; narrow lane (`tlaneo`) +2.2 ± 0.9;
  narrow lane with MATEFIRE (`tlaneo,tmfire`) **+2.9 ± 0.9**. The last ships.
- **WEAVE-9.** `TeamLink.NARROW_LANE` (true) picks `narrowLaneClear`; the wide lane stays as
  `wideLaneClear` for the `tlanew` ablation. Constants `NARROW_MATE_HALF` (30) and
  `NARROW_TARGET_HALF` (36).
- **TMODE-12.** `TeamModes.FORCE_MATEFIRE` is true, so TMODE-9 plays against every team.
- Solo play is untouched: the lane is asked only through the team link (null off a team), and
  MATEFIRE reads teammates' bullets only while a teammate lives. The duel and melee replay fixtures
  replay bit for bit.

## Team pack hunting (TMODE-13, TMODE-14)

- **Why.** After step C the whole remaining gap to 5th was survival against the top 20, where
  Nightmare's members hunt in assigned packs (docs/plan-team-top5.md). PACK (TMODE-5) failed by
  shrinking to point-blank, pulling at full strength and scaling the bullets' risk away.
- **Gate.** PC card pc-team-hunt (PR #282): all 46 TeamRumble opponents, 6 seeds, paired with the
  3.17 build. A/A -0.4 ± 0.7; HUNT (`tmhunt`) **+4.1 ± 0.9**, with ShadowTeam +16.5, Aleph +15.3,
  CombatTeam +12.7, Ogi +8.1 and Nightmare -3.2.
- **TMODE-13.** `TeamRisk.huntAssign` and `huntSlot`: leaderless name-order assignment,
  slots at a fixed `HUNT_RADIUS` (350) ranked by bearing, pull `HUNT_PULL` (0.3) that leaves the
  bullets' risk unscaled (`Pull.scalesBullets`).
- **TMODE-14.** `TeamModes.FORCE_HUNT` is true; ablation `tmnohunt` turns it off.
- Solo play is untouched: the modes act only while a teammate lives. With HUNT on, only the team
  replay fixtures change; the duel and melee fixtures replay bit for bit.

## Team lines of fire (TMODE-15, BENCH-114)

- **Why.** Against the 14 mid teams our own bullets do 60 damage a round to our members; Firestarter's
  10 and Combat's 17 (docs/bench/local/team-compare-read.md). Holding fire for a mate in the lane
  (WEAVE-10/11, PR #293) cut hits but lost firepower. Both rivals hold almost no shots (about 2%).
- **TMODE-15.** `TeamModes.Mode.LINES`, `FORCE_LINES` false; `MinimumRiskMovement.linesRisk`, inside
  `teammateRisk` (so HUNT's pull scales it with the other terms). Constants `LINES_K` (0.3),
  `LINES_HALF` (0.3 rad), `LINES_REACH` (800 px). Ablations `tmlines` (suffix ml) and `tmlinesw`
  (mlw: 0.6, 0.45 rad). Card plans/pc-team-lines.queue.
- **BENCH-114.** `TeamHarvester.kind` and `friendly.log`'s `target`, `victimAlong`, `victimAcross`,
  `kind`; `tools/team_losses.py` prints the shares per band.
- Solo play is untouched: the term is read only while a teammate lives. With LINES forced on, only
  the team replay fixtures can change; the duel and melee fixtures replay bit for bit.

## Team per-team table v2 (TMODE-16 to TMODE-18, BENCH-119)

- **Why.** With 47 teams in the rumble, each pairing is about 2% of the APS. The lane (WEAVE-10/11)
  and lines (TMODE-15) screens failed across the field but gained against single teams; the table
  plays them only there.
- **TMODE-16..18.** `TeamModes.Mode.LINESW` (`MinimumRiskMovement.LINES_WIDE_K`/`LINES_WIDE_HALF`),
  `LANEP` and `LANEB` (`TeamLink.narrowLaneClear` asks `TeamLink.modes`, the table by default).
  No FORCE switch: they act only through a table entry, and `TeamModes.TABLE` ships empty, so every
  replay fixture is unchanged.
- **BENCH-119.** `tools/team_modes.py pick --control --min-mean --base`, `lock --out-set`, `gate`;
  card plans/pc-team-table.queue.

## Team gun lines (TMODE-19, BENCH-120)

- **Why.** PR #332: 57% of our own hits are lead shots with no enemy near the line, and nearly every
  victim stood ahead of the shooter, 64% within 100 px of the line. Holding fire (WEAVE-10/11) cost
  more than it saved; a cone behind the enemy (TMODE-15) missed lead shots.
- **TMODE-19.** `TeamModes.Mode.GUNLINE`, `FORCE_GUNLINE` false. `Report.Aim` (gun heading, heat),
  `LinkCodec.VERSION_AIM` = 3, written only when GUNLINE is played, so a report without it is byte
  for byte what it was. `Roster.aimed`, `Mate.gunHeading/gunHeat/aimed`.
  `MinimumRiskMovement.gunLineRisk` inside `teammateRisk`; constants `GUNLINE_K` 0.4, `GUNLINE_HALF`
  70 px, `GUNLINE_NEAR` 20, `GUNLINE_REACH` 900, `GUNLINE_TICKS` 6, `GUNLINE_AGE` 3. Ablations
  `tmgunline` (mgl) and `tmgunlinew` (mglw: 1.0, 100 px). Card plans/pc-team-gunline.queue.
- With GUNLINE forced on, only the team replay fixtures can change; the duel and melee fixtures replay
  bit for bit.

## Team per-opponent counters (TMODE-20 to TMODE-24, BENCH-123)

- **Why.** A plan tailored per opponent, as the 1v1 mode table does. Code reads of
  the 16 costliest teams (docs/plan-team-top5.md section 11): 10 shoot their closest enemy, 9 cut
  power with distance, 5 aim only head-on or only linear.
- **TMODE-20..24.** `TeamModes.Mode.OWN`, `HEADON`, `LINEAR`, `FAR`, `FARTHER`, table-only (no
  FORCE switch). `MeleeController` passes OWN as the nearest rule and HEADON/LINEAR as `only` to
  `MinimumRiskMovement.updateBullets`; `ONE_AIM_WEIGHT` 2; `huntRadius(modes)` gives
  `HUNT_RADIUS_FAR` 500 or `HUNT_RADIUS_FARTHER` 650.
- With all five forced into the default (HEADON and LINEAR in turn), only the team replay fixtures
  move; the duel and melee fixtures replay bit for bit.
- **BENCH-123.** `tools/team_modes.py screens`, `pick --counters --low-end`; build-ablation `tmtab`
  takes `$TEAM_MODE_SUFFIX`; card plans/pc-team-counters.queue.

## Team path check and Troodon at 250 px (TMODE-25, TMODE-26, BENCH-124)

- **Why.** The next team step. Firestarter (2nd) checks each move
  against its own team's bullets in flight; the cloud closer-hunt smoke lost on the field (250 px
  -0.6 +- 1.3, 200 px -2.0 +- 1.3, 22 teams x 6 seeds) but TroodonPack gained at both (+4.3, +3.7).
- **TMODE-25.** `TeamModes.Mode.PATH` (FORCE_PATH, on since TMODE-28): `TeamRisk.pathBest`,
  `pathDamage`, `crossesBox`; `PATH_K` 1, `PATH_HALF` 18, `PATH_TICKS` 15, `PATH_RERANK` 8.
- **TMODE-26.** `TeamModes.Mode.NEAR`, table-only: `huntRadius` gives `HUNT_RADIUS_NEAR` 250.
- With PATH and NEAR both forced into the default, only the three team replay fixtures move; the
  duel and melee fixtures replay bit for bit (ReplayTest, DuelIdentityTest, FaithfulPortTest).
- **BENCH-124.** build-ablation `tmpath` (suffix mp; the named teams play PATH on top of their
  entry), `tmtnear` (suffix tn); `tmtab`/`tmlock` now insert after the shipped entries, and
  `team_modes.py pick --shipped` keeps a named team's modes in its line. Card plans/pc-team-path.queue.

## 1v1 gap to 2nd: shield exit and re-picks (BENCH-126)

- **Why.** 3.18.1 is 4th, 1.28 behind DrussGT; this finds the opponents to tailor for.
  The live read (docs/bench/gap-to-2nd.md) puts the largest tailorable pool on shield robots where both
  rivals score 90-98 and Hadur 70-85. A cloud read on 8 of them shows shield mode leaving the battle at
  SHIELD-11's 150-damage exit around round 15, after which the surf takes 3-5x Saguaro's damage.
- **BENCH-126.** build-ablation `sdmg400` (SHIELD-11 exit at 400 damage, suffix s4), `sdmgoff` (no damage
  exit, SHIELD-6's budget alone, suffix s0), `slistdrop` (`$SHIELD_DROP` robots leave the shield list,
  suffix md). Card plans/pc-shield-exit.queue: the 276 listed robots x c/aa/s4/s0 x 3 seeds, gates at
  +0.10 APS; the three cloud re-picks (Wolverine stop-and-go, Hikari and Melody stop-and-go shift)
  verified on 6 fresh seeds. Nothing ships until a gate passes; 3.18.1 plays bit for bit.
  Test: `ShieldExitPlanTest`.
- **SHIELD-19.** The PC card's global exits failed (s4 +0.04 ± 0.09, s0 -0.01 ± 0.10 APS), but its per-robot
  pick locked 7 robots (2 at 400, 5 with no exit, +0.06 APS in sample). `ShieldList.stayDamage` reads
  `shield-exit4:` / `shield-exit0:` lines (switch bits beside MOVE-28's and GUN-11's); `ShieldMode` takes the
  opponent's exit at its first scan. `ShieldTableData.exitLates()` / `exitOffs()` ship empty; build-ablation
  `sx4list` / `sx0list` fill them from `$SHIELD_EXIT4` / `$SHIELD_EXIT0` (suffixes x4, x0). Tests:
  `ShieldListTest`, `ShieldDesignTest` (SHIELD-19).
- **SHIELD-20.** A debug build's wave and hit records (2026-10-31, `docs/bench/shield-step.md`) traced the
  shield's leaks to its own 0.1 px step aside: an enemy that aims a few ticks before it fires sees the step,
  and its bullet is head-on to where we stood mid-step (Hydrogen 16 of 16 leaks, errors of exactly the step).
  `ShieldDesign.still` (build-ablation `sstill`, suffix sz) tries the plan without the step first; a bullet
  dead on our centre casts no shadow from where we stand, so it still takes the step. Ships off. Test:
  `ShieldDesignTest` (SHIELD-20).
- **SHIELD-22, SHIELD-23.** The rival's shield fires the cheapest crossing that is wide enough and prefers
  powers no dearer than the enemy's bullet times the energy ratio; ours fires the widest shadow up to just
  under the enemy's bullet. `ShieldDesign` gains `cheap` and `ratio` (both off in SHIPPED, not in `all`);
  `ShieldMode.buildPlan` keeps every plan with cheap on and `cheapest` picks the cheapest from the widest
  plan's spot with half its shadow or more (`CHEAP_SHARE` 0.5); `ratio` caps the power by the energy ratio. Ablations `scheap` (sc) and `sratio` (sr). With both off the robot plays bit for bit.
  Card `pc-shield-power` (BENCH-165). Doc docs/bench/shield-power.md. Tests: `ShieldDesignTest`
  (SHIELD-22, SHIELD-23), `ShieldPowerPlanTest` (BENCH-165).
- **SHIELD-24 (tried 2026-11-07, removed).** The shield audit found Princess's learned aim moves after three exact
  rounds and the 500-bullet modal offset stays on the old aim until the 150-damage exit. A `recent` switch (offsets
  from the last 20 bullets, BeepBoop's head-on bonus) read within noise of the still shield on 7 robots and worse on
  Princess; the exit, not the offset, is the constraint. Code removed; read in docs/bench/shield-recent.md.
- **BENCH-214 result (pc-tailor-stack, PR #710, 2026-11-08): FAIL.** The stack set stopped at its pilot (ln -0.15
  points over 25 tailored robots, a fifth of the set, against the 0.3 bar), so stacking a second lever was not
  measured past the pilot; nothing there suggests a gain worth the rest of the run, and one lever a robot stays the
  rule until a card shows otherwise. The race set passed its pilot (+0.71 over 44) and screened +0.15 +- 0.31 points
  over 217 leaners with 9 picks at 2 points, but on 4 fresh seeds the picks gained no more over master than master's
  own A/A copy did (xr +1.33 +- 1.82 vs aa +1.34 +- 1.07), gate +0.01 +- 0.01 APS against the +0.03 bar: the confirm
  could not separate the picks from noise, so they do not ship; a real gain of a point or two on a few of them is not
  ruled out at 4 seeds. Nothing banked; the card is removed. The per-opponent lever route has had its whole-field
  screen, its leaners a second look and stacking a pilot; what is left there is below what a PC card can resolve.
- **BENCH-217 result (pc-field-prior, PR #721, 2026-11-09): FAIL at the pilot.** pf (MOVE-35, the field prior as a danger member at standing weight 2) -0.50 points mean over the 239 pilot robots, pooled -0.10 ± 0.07 APS, A/A +0.00; screen and gate skipped. The cloud AES forensic that followed (docs/bench/local/2026-11-09_prior-forensic-aes.md) is the read: round 0 helped, every later round hurt, because the prior outweighed views that already knew the gun. Oracle bits alone no longer earn a PC card; a danger member shows a round-by-round win on that forensic first.
- **BENCH-207 and BENCH-208 results (2026-11-08).** pc-tailor-near (PR #704): 491 leaning robots at 4 new seeds, ln
  +0.10 +- 0.10 APS, 32 picks at 2 points; confirm on 4 fresh seeds PASS +0.03 +- 0.02 APS (xr +1.28 +- 0.82 points
  over the 32). Banked 28 (as BENCH-197: screen and confirm pooled above 0; a lever already carried or GUN-11 on a
  shielded robot dropped): x5 2, gs 2, fp 5, fl 2, sg 2, sw 4, hj 6, mm 5; AutoBot (pooled below 0), EpeeistDC (sw
  already shipped), Chiva (gs, shielded) and Hyperion (fl, shielded: the flattener never surfs it) stay as master. pc-hj-field (PR #705): the pilot stopped the card, hj
  -0.12 points over 239 robots against A/A -0.14; stop-and-start for the whole field fails and the per-robot hj picks
  stand. Both cards are removed after their runs.
- **POW-17 banked (pc-race-power, BENCH-206, PR #695).** Whole-field screen at 2 seeds: rp +0.14 +- 0.16 APS over
  1,194 robots, 19 picks at 5 points; confirm on 4 fresh seeds PASS +0.10 +- 0.05 APS, 8 held at 3 points: BeepBoop
  +24.3, Nullstride +16.7, Neutrino +15.5, Diamond +15.3, Combat +13.8, Tomcat +10.8, Dookious +6.4, FoilistMC +5.9.
  `ShieldTableData.racePowers()` carries the 8. pc-shield-audit (BENCH-209, PR #697): Princess +7.0 ships with still
  and exit off; Musashi -3.0 stays off.
- **BENCH-220 result (pc-ala-shield, PR #733, 2026-11-10): Ala ships with a still line.** 12 fresh seeds from 11700
  against master and its A/A copy pooled: mz (list add with a `shield-still:` line) +7.34 points (low end +4.19;
  Ala's pooled control 83.6, mz 90.9), mt (list add alone) +3.72; A/A -1.85, inside its band. The 3-point pick locks mz. The card's APS
  gate printed "no battles" for both arms: `shield_s2.py gate` takes its interval across robots, which one robot
  cannot give, so on a one-robot card the per-robot pick is the read. Ala joins `ShieldListData` and
  `ShieldTableData.stills()`.
- **BENCH-223 result (pc-still-field, PR #746, 2026-11-10): X2, Che and Aardvark ship with still lines.** 12 fresh
  seeds from 12200 against master and its A/A copy pooled: X2 +5.7 points (low end +1.1, control 64.1), Che +3.8 (low
  end +1.4), Aardvark +3.6 (low end +0.9); SmallDevil +1.4, Parallax -0.2 and MoojukNano -0.9 do not ship. The gate
  passes (+0.01 ± 0.01 APS), A/A -1.07, inside its band. The three join `ShieldListData` and `ShieldTableData.stills()`.
- **BENCH-235 result (pc-shield-floor, PR #781, 2026-11-12): CassiusClay ships with still and floor lines.** 12 fresh
  seeds from 14800 against master and its A/A copy pooled: list + still + floor (sf) +37.7 points (control 60.9, sf
  98.6; the cloud read +40.4), list + still alone (mz) +0.3; the 3-point pick locks sf, A/A -1.94, inside its band. A
  one-robot card has no cross-robot gate; the pick is worth about +0.03 APS over the field. CassiusClay joins
  `ShieldListData`, `ShieldTableData.stills()` and `ShieldTableData.shieldFloors()` (SHIELD-25).
- **BENCH-238 result (pc-lines, PR #798, 2026-11-13): JKHydra 1.4 ships a 0.2 power cap.** 8 fresh PC seeds from 17600, A/A +0.48 +- 0.94 inside its band: JKHydra +8.6 +- 5.5 at the 3-point pick (cloud +10.6 +- 6.2 on 8 more). The 28 screened robots all lose with the cap (-4 to -68; rammers and nanos worst), so none ships. The line is in `ShieldTableData.powerCaps()`; `plans/lines-cap-shipped.txt` records it for the card test.
- **BENCH-236 result (pc-power-cap, PR #784, 2026-11-12): all seven robots ship a power cap.** 12 fresh seeds from
  16000 against master and its A/A copy pooled: pk +6.86 ±1.98 points a robot (about +0.04 APS over the field), A/A
  -0.38, inside its band. The 3-point pick locks all seven with the interval above 0: Roborio +11.01, Firestarter
  +9.61, Gilgalad +7.15, WaveSurferPG +6.85, MatchupAGF +4.99, Rabbit +4.72, Domogled +3.72. Roborio, Gilgalad,
  Firestarter, Rabbit and Domogled join `ShieldTableData.powerCaps()` (0.2); MatchupAGF and WaveSurferPG join
  `ShieldTableData.powerCapHalves()` (0.5).
- **BENCH-224 result (pc-mirror-off, PR #750, 2026-11-11): all three ship with mirror-off lines.** 12 fresh seeds from 12700
  against master and its A/A copy pooled: Jammy +11.4 points (low end +9.8, control 86.7), MirrorH +3.8 (low end +3.1),
  MirrorL +3.6 (low end +2.9); the 3-point pick locks all three, the gate passes (+0.02 ± 0.01 APS), A/A -0.47, inside
  its band. All three join `ShieldTableData.mirrorOffs()` (MIR-2).
- **BENCH-222 result (pc-shield-rescreen, PR #739, 2026-11-10): both ship with still lines.** 12 fresh seeds from 12000
  against master and its A/A copy pooled: Saturn +10.54 points (low end +7.16, control 81.4), OperatorZeze +3.48
  (low end +0.57, control 86.2); the 3-point pick locks both, which is the per-robot read; the pooled gate passes only at
  its edge (+0.01 ± 0.01 APS, low end just above 0), A/A +0.84, inside its band. Both join `ShieldListData` and `ShieldTableData.stills()`.
- **BENCH-209.** The shield audit's cloud read (docs/bench/shield-recent.md): the still shield beat master on
  Musashi (+20 on 6 seeds) and Princess (+11 on 2 seeds; with the damage exit off +5 on one seed and +2 on 4 fresh ones) and lost on the other five
  BeepBoop-only robots read. `pc-shield-audit` re-measures the two on 12 fresh PC seeds against c and aa before any
  line ships; pc-shield-still (PR #510) did not pick them, so the PC decides. Test: `ShieldAuditPlanTest`.
- **SHIELD-21.** pc-shield-still (PR #510) failed SHIELD-20 globally (+0.09 +- 0.12 APS) but split by robot (31
  listed robots over +5 points, 23 under -5; 9 of BeepBoop's 64 locked). `ShieldList.still` reads `shield-still:`
  lines (switch bit 16); `ShieldMode` takes it at the opponent's first scan. `ShieldTableData.stills()` ships empty;
  build-ablation `szlist` fills it from `$SHIELD_STILL` (suffix zl). Test: `ShieldDesignTest` (SHIELD-21).
- **RAM-5.** A cloud read of 12 nano rammers (2 seeds, `local/2026-10-28_cloud-ram-read.md`): Saguaro 82.1% vs
  Hadur 71.5%, ram damage level, but their bullets hit Hadur on about 58% of shots and Saguaro on 34%. Replaying
  each shot from the truth log, a linear aim would hit Hadur's escape on 52% and a head-on aim on 16%; against
  Saguaro both 35%. No mode we have helps (`local/2026-10-28_cloud-ram-screen.md`: no escape 67.5, stop-and-go
  69.8 / 70.6, simple-aim dodge 72.2, A/A 72.4). A first cut, slowing to 4 px/tick while a shot led for full
  speed flew, lost 2.6 points (more rams, and head-on aim then hit 49%). RAM-5 instead weighs the escape's
  candidate paths against the shots in flight: `RamEscape.onEnemyShot` keeps the shot with its head-on and
  linear aims, `move(..., true)` scores them. `MoveDesign.RAM_BREAK` (off), build-ablation `rambrk` (suffix rk).
  Test: `RamEscapeTest` (RAM-5).
  Smoke of RAM-5 (12 rammers x 2 seeds, `local/2026-10-28_cloud-ram-rk.md`): 71.2 -> 78.3 points a robot, 11 of
  12 up, bullet damage taken 2,200 -> 1,445, linear exposure 51% -> 24%.
- **BENCH-132.** Card plans/pc-1v1-ram.queue: `panel-ram-318.txt` (the live read's rammer / perfect-prediction
  group plus every robot named for ramming, 45) x c/aa/rk x 6 seeds, `panel-exit-pick.txt` x c/aa/xp x 6 seeds;
  gates +0.05 and +0.01 APS. Results branch `claude/pc-1v1-ram-results`. Both steps are watched with halt rules
  (fails, dead, skips, stall, A/A) and `ALERT`; the ram step also finishes early once rk cannot reach +0.05
  APS after 30% (at most 567 battles left unrun). Test: `RamPlanTest`.

## Watching a PC card as it runs (BENCH-128 to BENCH-131)

- **Why.** The harness should watch a card as it runs, so runs with clear failures stop early. A PC card was read only from its
  results PR at the end, so a losing arm, a crash, a skipped-turn build-up or a broken jar cost the
  whole card.
- **BENCH-128.** Bench `--job-order shuffled` (`bench-top20.sh --shuffle-jobs`). `Arms.resumed` read
  rows with `strip()`, which also removed the tab before an empty errors column, so no clean battle was
  ever resumed; it now strips only the line break. Test: `ArmsTest`.
- **BENCH-129..131.** `benchwatch.py` (rules, reading rows, progress Markdown), `benchqueue.py` (`watch:`
  and `stop:` step lines, the progress file and branch, the alert issue, `--no-stop-rules`,
  `--continue-early`, `--no-publish`), `tools/open_results_pr.sh` puts the progress file first in a
  results PR. Card `plans/watch-smoke.queue`. Tests: `test_benchwatch.py`.

## Saor, a MicroMelee entry (SAOR-1 to SAOR-17, stages U0 to U6)

`hadur117.micro.Saor`, a separate robot in the `saor` module, built from the spec "MicroMelee
Rumble Entry" (https://claude.ai/artifact/ANvBYVXHDXn3PePmWPu5J1). Its stages U0 to U5 are the
spec's M0 to M5 (the letter M is the melee extension's here). Design, byte budget and bench plan:
docs/saor.md. Nothing in Hadur's modules depends on it, and it on nothing of Hadur's.

### Saor notes

- **Wording against the spec.** SAOR-1 says "drive to" where the spec says "occupy whenever
  distance remaining is 0": the engine can stop the robot short at a wall, and what the code
  controls is the point. SAOR-4 says "a robot dies" (any `onRobotDeath`), as the spec's event.
  SAOR-6 states the cold gun as built: the playout holds the state, which is circular
  projection at the state's quantised speed and turn; the spec's acceleration term costs bytes
  the class does not have (docs/saor.md). SAOR-15 is new: the shipped class is the core
  flattened by hand, so it is held to the core.
- **Saor 0.2** (docs/plan-saor-first.md 6c-6e). SAOR-6 and SAOR-7 now state the graded vote:
  0.1 held the state until a row had 8 samples, which stage 1 measured at -1.35 APS. SAOR-9, the
  ram leg, is retired (see the retired table).
- **Saor 0.3** (stage 5, PR #360). SAOR-8, the end-game power cap, is retired for SAOR-17, and
  the gun learns a transition on every scan of its target, not only below 0.9 gun heat (no
  requirement named the gate).
- **Coverage.** SAOR-1 to SAOR-10 (SAOR-8 and SAOR-9 retired) and SAOR-17 by property tests and Cucumber on the core, SAOR-6, SAOR-7 and
  SAOR-15 also by the equivalence test on the robots, SAOR-11 and SAOR-15 on the shipped jar by
  `SaorJarIT` (failsafe, after ProGuard). SAOR-12 to SAOR-14 are bench gates: what is covered here
  is their evaluator, `hadur-bench/tools/saor_gates.py`, by `test_saor_gates.py`; whether they
  pass is a bench result, recorded in docs/bench/. SAOR-16 is the plan for 1st
  (docs/plan-saor-first.md): its field builder `tools/saor_live.py` and the micro-only read in
  `saor_arms.py` are covered by `test_saor_live.py` and `test_saor_arms.py`.

## TwinSaor, a Twin Duel team (TWIN-1 to TWIN-14, stages W0 to W3)

`hadur117.twin.TwinSaor`, a separate team in the `twinsaor` module: one class,
`hadur117.twin.SaorTwin`, listed twice. Design, the LunarTwins analysis, the 0.1 build and the
bench card: docs/twinsaor.md. It depends on nothing of Hadur's or Saor's, and they on nothing of it.

- **Coverage.** TWIN-3 by `ArchitectureTest`; TWIN-6 by `GunTest`; TWIN-7, TWIN-9 to TWIN-12 by
  `TeamTest` on the core; TWIN-1 and TWIN-2 on the built jar by `TwinSaorJarIT` (failsafe). TWIN-4,
  TWIN-5 and TWIN-8 are the robot's wiring in `SaorTwin`, stage W1: exercised by the cloud
  head-to-head (docs/twinsaor.md section 8), with a test due before W1. TWIN-13's range bit by
  `TeamTest`, its table by `hadur-bench/tools/test_twin_table.py` (the robot's string is the one the
  W4 picks write); TWIN-14 is the release process (docs/twinsaor.md section 11). Stages compare with
  `hadur.twin.stage` in the root pom (W0); W, because T is the Team plan's letter.

## Deise, a MiniMelee entry (DEISE-1 to DEISE-17, stages E0 to E7)

`hadur117.mini.Deise`, a separate robot in the `deise` module, built to take MiniMelee 1st from
kc.mini.Mirage (2026-10-27). Design, the Mirage analysis and the stages: docs/deise.md.
It depends on nothing of Hadur's, Saor's or TwinSaor's, and they on nothing of it. Its stages
are E0 to E7 (D is the DrussGT route's letter).

- **Coverage.** DEISE-1 to DEISE-5 by `MoveTest` and DEISE-6 to DEISE-10 by `GunTest` on the
  core; DEISE-14 by `ArchitectureTest`; DEISE-12, DEISE-15 and DEISE-16 (on the jars) by
  `DeiseJarIT` (failsafe), DEISE-16 on the compiled classes by `DeiseEquivalenceTest`. DEISE-11
  and the scan wiring of DEISE-5, DEISE-6 and DEISE-17 are the adapters': the equivalence test holds the
  shipped class to `DeiseLab`, and a robot-level test of DEISE-11 is due by E2.
  DEISE-13's field builder (`saor_live.py` with Deise's options) and `deise_fields.py` by
  `test_saor_live.py`.

## Sanaro, a NanoMelee entry (SANARO-1 to SANARO-14, stages N0 to N6)

`hadur117.nano.Sanaro`, a separate robot in the `sanaro` module, built to outrank
d414.nano.Quantum and sheldor.melee.nano.NaturalScience in NanoMelee (2026-10-28, from the
design doc "Nano Melee: Beating NaturalScience & Quantum"). Design, the dissection and the stages:
docs/sanaro.md. It depends on nothing of Hadur's, Saor's, TwinSaor's or Deise's, and they on
nothing of it. The design doc's N-1 to N-12 are SANARO-1 to SANARO-12 here. SANARO-13 is the
bench's own, added after pc-sanaro-n01 showed the NanoMelee-only census picks against the
live-shaped one (docs/sanaro.md section 6). SANARO-14 is 0.2's fire gate (pc-sanaro-n04,
docs/sanaro.md section 12).

- **Coverage.** SANARO-1, SANARO-2 (no `<clinit>`) and SANARO-9 by `SanaroJarIT` (failsafe) on the
  shipped jar; SANARO-2 (table reach) and SANARO-8 (cells) by `SanaroTableTest`, which holds the
  table to `sanaro/table.py`'s formula outside HL's taught blocks; SANARO-3 to SANARO-8 by `SanaroTest`, scan by scan on a
  probe subclass, SANARO-14 too. SANARO-10 to SANARO-13 are bench reads (`tools/sanaro_read.py`; fields by
  `tools/sanaro_fields.py`, both by `test_sanaro.py`), not build gates.

## JayLexi and Eveimear, the MiniRumble and MicroRumble 1v1 entries (JAYLEXI-1 to JAYLEXI-11, EVEIMEAR-1 to EVEIMEAR-12)

`hadur117.mini.JayLexi` (module `jaylexi`, MiniRumble: 1v1 under 1500 bytes) and
`hadur117.micro.Eveimear` (module `eveimear`, MicroRumble: 1v1 under 750 bytes), built from Leigh's
design plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" (2026-10-28) and its
kitlab drafts. Design, bench and results: docs/kitlab.md. Neither depends on Hadur, Saor, TwinSaor,
Deise or Sanaro, nor they on it; Hadur's 1v1 build is untouched. The plan's K1 to K6, J1 to J6 and
E1 to E6 map onto these as the last column says.

- **Coverage.** JAYLEXI-1, JAYLEXI-9, EVEIMEAR-1 and EVEIMEAR-9 by `JayLexiJarIT` and
  `EveimearJarIT` (failsafe) on the shipped jars; JAYLEXI-2 to JAYLEXI-8 by `JayLexiTest`, JAYLEXI-11 by `JayLexiReplayTest`, and
  EVEIMEAR-2 to EVEIMEAR-8, EVEIMEAR-10 and EVEIMEAR-11 by `EveimearTest`, scan by scan on probe
  subclasses. JAYLEXI-10 and EVEIMEAR-12 are bench reads (`tools/kitlab_read.py`; samples by
  `tools/kitlab_fields.py`, both by `test_kitlab.py`), not build gates. Like Sanaro's rows, these carry the
  plan's own IDs in the last column, not a stage, so `RequirementsTraceabilityTest` does not track
  them; the module tests named here are their coverage. The plan's per-tick evidence
  (K5 zero skipped turns, J5 and E6 survival, J1 and J6 on MC2K7 and TCRM) is read from the bench
  report, not gated.

## Allocation and the engine's stop path (TIME-9)

The engine disables a robot that skips more than 30 turns in a row and then tries to stop its
thread from that same thread, which always prints "Unable to stop thread". A real client never
collects garbage on purpose between battles, so a young collection that lands in Hadur's turn
is the usual cause of such a run. TIME-9 lowers how much garbage the core makes without
changing a single decision.

## The hadur117 package (NAME-1, BENCH-124)

Leigh's package is `hadur117`, Saor's from the start (`hadur117.micro.Saor`); Hadur had shipped as
`hadur2` through 3.18. From 3.19 the whole family is in `hadur117`. Robocode lets a robot read
only its own package's data folder, so the first pass of a renamed entry starts with no stored
profiles, and the rumbles list it as a new participant.

## PATH on every team, fresh-seed confirm (BENCH-135)

- **Why.** pc-team-path (PR #414) found no team where PATH paid +3.0 on its own, but pooled over the
  46 it read +0.5 ± 0.5 share points over aa (bb -0.0 ± 0.5), with our own hits on teammates down
  15%. The decision (2026-10-29) was to confirm it as one switch for every team.
- **BENCH-135.** Card plans/pc-team-path2.queue: aa, bb, mp (build-ablation `tmpath`); bb and mp on
  team-census46.txt at 16 seeds from 5100 (16, not 10, to narrow the pooled interval); `team_modes.py
  gate` over all 46 teams at +0.30 APS. A PASS is followed by a PR that sets FORCE_PATH = true.

## Ogi's dodge as one piece (TMODE-27, BENCH-139)

- **Why.** OgiTeam leads the team rumble by about 6.4 APS on survival (97.6%).
  Its parts ported one switch at a time (SOFT, SCREEN, POOL, LEARN, WAVES, radar) read zero; its
  dodge only works whole: shot detection, a learned per-class danger model with simple-aim
  experts, and a path check over the safest spots, so it is built as a parallel rebuild of the team core.
- **TMODE-27.** `TeamModes.Mode.DODGE` (FORCE_DODGE on since TMODE-30), `melee.TeamDodge` and
  `melee.AimExperts`: a parallel team movement path that stands in for the virtual bullets and
  the SOFT/LEARN/POOL/WAVES switches. Profiles are made once a shot (the CPU that sank WAVES with
  learning); experts' errors travel with link samples (LinkCodec version 4, written only when a
  dodge carries them). Ablations `tmdodge` (dg) and `tmdodgeb` (db, the ranking keeps the simple
  bullets). Forced on, every duel and melee fixture replays bit for bit.
- **BENCH-139.** Card plans/pc-team-dodge.queue: global gate and per-team pick from one screen.

## PATH on every team (TMODE-28)

- **Why.** pc-team-path2 (BENCH-135, PR #430), 46 teams x 16 fresh seeds from 5100: PATH forced on
  `mp` +0.7 +- 0.3 share points against aa, bb A/A -0.2 +- 0.3, projected **+0.77 +- 0.36 APS**
  (gate +0.30, low end above zero: PASS). Our bullets on our own members fell 81,824 to 69,429.
  Aleph +3.8, Slartibartfass, ArmyOfShiz and DemoniacNimrods +3.0, Firestarter +2.8, HOFSwarm +2.4;
  Polylunar -2.5, Ogi -0.2. A global switch, not a per-team pick: the confirm was chosen knowing so.
- **TMODE-28.** `TeamModes.FORCE_PATH` is true and the three named entries (GrofGroup, Troodon,
  TroodonDroid) carry `Mode.PATH`, as the measured `tmpath` arm played them. Ablation `tmnopath`
  turns both off; `tmpath` keeps working on older source.
- Solo play is untouched: the modes act only while a teammate lives. Only the two team replay
  fixtures were re-recorded; the duel and melee fixtures replay bit for bit.

## DODGE's own fire and its confirm (TMODE-29, BENCH-142)

- **Why.** pc-team-dodge (PR #437), measured on top of PATH: DODGE for every team +0.55 +- 0.50 APS
  (global gate PASS, low end +0.05); the per-team table (Firestarter, HOFSwarm, TeamDeathTeam)
  +0.24 +- 0.17 on fresh seeds (FAIL). Ogi -2.4, Nightmare -4.8, ImpactTeam -4.3. Our bullets on our
  own members rose 13% (80.5 vs 71.2 a battle): DODGE cleared MATEFIRE's teammate-bullet risk from
  its base ranking and folded teammates' bullets into the median-scaled wave damage.
- **TMODE-29.** `TeamDodge.OWN_FIRE` (on since TMODE-30): keeps `v.mateBullets` in the base ranking and adds
  `PATH_K` x `pathDamage` to each re-ranked risk in `MinimumRiskMovement.rerankBest(..., ownFire)`.
  Ablation `tmdodgef` (suffix of), built with `tmdodge`.
- **BENCH-142.** Card plans/pc-team-dodge2.queue: bb, dg and dgof on 46 teams x 16 seeds from 5600 at
  12 rounds (4,416 battles, about 5 h); one pooled gate per arm. Results claude/pc-team-dodge2-results.
- Both switches off: no replay fixture moves.

## Rumble clients beside the bench: the core fence (BENCH-145 to BENCH-147)

- **Why.** Rumble clients should run beside the bench on the PC without disturbing it. A container caps CPU amount, not placement
  (Docker on Windows is a WSL2 VM whose virtual CPUs float over every host thread), so clients would
  still share cores and L3 with battle JVMs. Processor affinity on both sides, cut along the L3
  groups, does separate them. Notes docs/bench/fence.md.

## The team brain on every team, and its confirm (TMODE-34, BENCH-153)

- **Why.** pc-team-concord (BENCH-150, PR #494), 46 teams x 12 seeds from 6700: CONCORD on every team
  **+0.87 +- 0.53 APS** (gate +0.30, low end +0.34: PASS); the five-team table (Shadow, GlowingHawks,
  ArmyOfShiz, HOFSwarm, TeamDeath) +0.35 +- 0.21 on 16 fresh seeds (PASS), survival +7.4 points. Losses
  to Ogi -3.8, DiamondStealers -2.0, Firestarter -1.9, Combat -1.6; own-member hits +22% in the gate.
  Decision of 2026-10-31: on for every team, plus a confirm card.
- **TMODE-34.** `TeamModes.FORCE_CONCORD` is true and every named entry carries `Mode.CONCORD`, as the
  measured `tmconcord` arm played them. Ablation `tmnoconcord` (suffix ncn) is the build before;
  `tmconcord` keeps working on older source.
- **BENCH-153.** Card plans/pc-team-concord2.queue: aa and bbncn against ncn on 46 teams x 16 fresh
  seeds from 6900 at 10 rounds (2,944 battles, about 3 h); one pooled gate. On a FAIL a PR turns
  CONCORD back off, or keeps it only where both cards agree. Results claude/pc-team-concord2-results.
- Solo play is untouched: CONCORD acts only while a teammate lives. Only the two team replay fixtures
  were re-recorded; the duel and melee fixtures replay bit for bit.

## Hadur as the teacher: nano tables distilled from its decisions (BENCH-155, BENCH-156)

- **Why.** A string constant costs a nano two bytes of code however long it is, and the index shapes the
  small robots already pay for (own energy, enemy energy, `640 / distance`, `getOthers()`, the opponent's
  `getName().hashCode()`) are the whole of what a nano can see. Measured against the stubs on
  2026-10-31: a `charAt` lookup is about 15 bytes, so a table never pays for an expression, only for
  branches, modes and state (a two-threshold power chain 36 -> 20 bytes; a per-opponent mode by name
  hash about 17 bytes). Hadur cannot be ported down; its *answers* can.
- **BENCH-155.** The melee harvester writes `shots.csv`, one row per Hadur shot at the turn it is first
  seen: round, turn, fighters alive before that turn's deaths, Hadur's energy before the shot (its energy
  after, plus the power), the living fighter whose bearing lies nearest the bullet's heading, that
  robot's energy and distance, and the power. Each shot is logged once; sentries and the dead are never
  the target. `MeleeHarvesterTest.shotsLogDecisions`.
- **BENCH-156.** `tools/distill.py power` reads those files into a Sanaro-shaped table (SANARO-2,
  SANARO-8: cell `E * 128 + e` in fortieths, the 321-640 px power, read back through the integer step
  `640 // distance`, shots past 640 px dropped): a cell with at least `--min` shots holds the modal power
  Hadur chose there (ties to the higher power), a thinner cell borrows the nearest filled cell on its
  row within `--reach`, and the rest fall back to `sanaro/table.py`'s formula, so with no data the
  constant is the shipped one byte for byte. `--alive N` keeps only shots fired with N or fewer alive,
  so a 1v1 row block can come from the endgame alone. `tools/distill.py hash` finds the smallest
  power-of-two mask under which every participant's Java `hashCode()` lands on its own cell (or only the
  `--protect`ed names, letting the rest share the default) and writes a `MODES` string from a
  `name<TAB>char` file: in the robot, `MODES.charAt(e.getName().hashCode() & MASK)`. Names in the rumble
  carry the version, so a rival's new release is a new cell. `tools/test_distill.py`.
- Neither tool changes a shipped robot: the constants it writes go into an arm's source under
  `--src`, and the arm earns its place on the census like any other (SANARO-10, SAOR-12).
- **1v1 (2026-10-31).** `tools/distill.py tiers` reads the bench's cold census TSVs (their hit rate on
  Hadur, 514 of the 515 MicroRumble robots) into a modes TSV, and `hash` keys it with an unsigned
  shift so that only robots needing different chars must not share a cell (515 names in 16,384
  cells); `--raw` writes digit values so `charAt` needs no subtraction, `--shift 0 --resolve high`
  trades a few cautious cells for the shift's 3 bytes. Eveimear arms HM (714 B), HP (749 B) and HM7
  play the table in place of, or before, EVEIMEAR-3's detection; `plans/pc-eveimear-h1.queue`
  measures them against 0.1 (docs/kitlab.md section 6).
- **distill.py after pc-eveimear-h1 (2026-10-31).** pc-eveimear-h1 failed (PR #516): a gun's hit
  rate on Hadur is the wrong signal for a stop-and-go robot (docs/kitlab.md section 7).
  `tools/distill.py field` writes a whole-rumble set (`--present` drops robots with no jar, an empty
  set is refused); `oracle` picks per robot the arm that beat the default battle by battle
  (`--z`, `--min-gain`), its summary weighted as `kitlab_read.py` weighs a run; `hash` gives a robot
  the modes file does not list the default, `--resolve default` sends an allowed conflict back to
  it, and a constant over 65,535 bytes of modified UTF-8 is refused.
- **Confirm (PR #529).** pc-team-concord2, 46 teams x 16 fresh seeds from 6900: **+0.50 +- 0.43 APS**
  (PASS), so CONCORD stays on every team. Four teams lost on both cards: Ogi -3.8 then -9.5,
  Nightmare -1.1 then -8.6, Firestarter -1.9 then -4.8, Combat -1.6 then -3.9 share points.
- **BENCH-160.** Card plans/pc-team-noconcord.queue: CONCORD off for those four (xc, tmtab with
  plans/team-noconcord-table.java) and an A/A against aa, 24 fresh seeds from 7000 at 10 rounds (384
  battles, about 25 minutes); gate +0.15 over 46 teams. Results claude/pc-team-noconcord-results.
- **TMODE-35 (PR #538).** pc-team-noconcord, 4 teams x 24 fresh seeds from 7000: CONCORD off for those
  four **+0.24 +- 0.16 APS** (gate +0.15, PASS); Ogi +4.2, Combat +2.6, Nightmare +2.4, Firestarter
  +1.7 share points, every one above zero. TeamModes.TABLE names cz.libors.Ogi, mn.Combat and
  cb.fire.Firestarter with MATEFIRE, HUNT, PATH and DODGE, and Nightmare's two classes drop CONCORD.

## MEM-15: a full data folder no longer costs the first turns (2026-11-01)

- **Why.** pc-fence-qualify runs 3 and 4 (PRs #530, #562) failed their clients at -1.31 and -1.29
  share points, and the bench beside them passed. Hadur's set-up time on the clients grew with its
  data folder: 38 ms near empty, 330 ms at 219 files, 671 ms at 392, with 6, 7 and 79 skipped
  turns a battle, and 92% of battles losing a round. In the robot, every `isFile`, `length` and
  `lastModified` passes Robocode's `RobocodeSecurityPolicy.impliesRobotFileRead`, which
  canonicalizes the file's path and the data directory's (`RobotFileSystemManager.isReadable`); on
  Windows each canonicalization walks the path on disk. MEM-11's one listing cost three of those
  checks per file. The bench never saw it (every battle starts with an empty folder), nor did the
  cloud client behind the clean page (a fresh install). Any long-running client pays it.
- **What.** `FileProfileStore` (the robot's store only; the plain constructor keeps the index in
  memory as before) saves its index in `store.hx`, rewritten before every write and after every
  delete: for each name in the directory, sorted, its length and write time as varints, with
  CRC32s of the names and of the whole file. About 4 bytes a file: 1.4 KB for 360 profiles. A
  battle starts from `dir.list()` (one check) and that file. It lists file by file, as before, when
  the index is missing, damaged, or was written for other names; the next write saves a new one.
  `store.hx` counts toward the quota and never appears in `names()`.
- **Never understating (review on PR #563).** Before a write the saved index records the larger of
  the file's old and new lengths, and it is rewritten after the write only when the file shrank, so
  a robot killed at any point leaves it overstating at worst. An index that cannot be saved is
  emptied and deleted before the write goes ahead; one that cannot be removed either stops the
  write (a counted save failure). In a team battle the five members share the directory, each
  with its own index in memory, so a team member never reads the saved index and removes it
  before its first change; the next battle lists the directory once and saves it again.
- **Measured.** Cloud, 360-file folder, Robocode 1.11.1 under strace (which makes each file call
  slow, as Windows is): set-up 1.6 to 1.9 s and the first turn at 134 to 173 before; 22 to 28 ms and
  the first turn at 1 after, once the first battle has saved the index. 109,615 path lookups
  (`readlink`) for 4 battles before, 35,709 after, most of them the first battle's listing.
  Without strace the core's part of set-up fell from 35 to 87 ms back to 8 to 15 ms.
- Tests: `FileProfileStoreTest.startsFromTheSavedIndex`, `fallsBackToTheListing` (a stray file, a
  removed file, an index cut at every byte, a flipped bit), `keepsNamesThatAreNotFiles`,
  `indexKeepsTheQuotaAndCrashSafety`, `killedBeforeAShrinkingWrite`,
  `anUnsavableIndexNeverStaysBehind`, `teamMembersDropTheSavedIndex`.

## The Ogi mirror: one lever per team (BENCH-166)

HadurTeam 3.21 went live 2nd at 82.13 (2026-11-01), OgiTeam 1st at 88.02. Lined up pairing by pairing
with Ogi's live page, about 3.6 of the ~5.9 APS gap comes from 22 mid teams that both teams beat in
97-100% of rounds (DemoniacNimrods, OmegaSquad, TMNR +15 share points each, Mamba, TidalWave,
ArmyOfShiz, DiamondStealers, HOFSwarm, GrofGroup +10-12); the seven strong teams add about 2 (with the
head-to-head pairing) and the bottom 18 about 0.3. The points leak inside rounds we win.

- **BENCH-166.** Card plans/pc-team-mirror.queue: OgiTeam and HadurTeam master as subjects on the same
  45 teams and 12 seeds from 7300 (1,080 battles, about 70 minutes). `tools/team_mirror.py` swaps each
  of HadurTeam's score parts for Ogi's alone and reports the share it is worth, per team, with
  team_losses.py's round read beside it, and names each team's lever: their survival (members we
  lose), their bullets (damage we soak), our bullets, our survival, bonuses. Results
  claude/pc-team-mirror-results. `tools/test_team_mirror.py`, `TeamMirrorPlanTest`.

## Three angles at once: HEAVY, WARY, DISABLED (TMODE-36, TMODE-37, BENCH-167)

A second overnight PC card explores two or three angles at once (2026-11-01).
Each arm targets the leak in won rounds against the mid teams from a different side:

- **TMODE-36 HEAVY.** CONCORD's 1.9 power cap gives way to full power, so rounds end sooner against
  teams that dodge poorly (MGUN-6's full power benched +5.7 before CONCORD capped it).
- **TMODE-37 WARY.** A member leaves the hunt under 50 energy instead of 20 and plays plain minimum
  risk, so fewer members die in rounds the team wins (each costs 50 survival points a live enemy).
- **DISABLED (TMODE-8)** on today's build: last screened before HUNT, DODGE and CONCORD.
- **BENCH-167.** Card plans/pc-team-angles.queue: 46 teams x 8 seeds from 7400 per arm (2,944 battles,
  about 3 h), per-team pick at +3.0 points, then a 16-seed fresh gate from 7500 on the picked teams.
  Results claude/pc-team-angles-results. `TeamAnglesPlanTest`; `FieldGunTest` (TMODE-36),
  `TeamModesTest` (TMODE-37).

## Members out of their teammates' bullets: CLEAR (TMODE-38, BENCH-170)

The Ogi mirror (BENCH-166, PR #569): Ogi's members take about 11 damage a round from their own team's
bullets, ours about 40, on nearly every team. In the cloud (GrofGroup and DiamondStealers, 8 seeds from
7400), Ogi fires with a mate in the line on 3.9% of shots and ours on 1.5%, yet our own bullets hit our
members 2.96 times per 100 shots and Ogi's 0.63: Ogi's members get out of the way, ours do not. The
teammates' bullets our members are told about are exact (heading, origin and tick); weighting them 5x
or 1000x on the 15-tick path check, a 30-tick check, or Ogi's wave scoring all left own fire at 38-43 a
round. The check drives each candidate from a standstill in any direction; a member running at 8 px a
tick has to brake and turn, so the drive it was given carries it into the bullet.

- **TMODE-38 CLEAR.** Before the ranking, any candidate whose drive meets a teammate bullet within 40
  ticks is dropped, the drive simulated as the melee drive steers it from Hadur's real heading and
  velocity. Only bullets that come within a drive's reach are traced, and only as far down the ranking
  as needed, so the cost is close to today's. Cloud, 4 seeds each: own-fire damage 39 -> 24 a round,
  skipped turns about 31 a battle against 24. Off by default; FORCE_CLEAR (ablation tmclear, suffix cl)
  adds it to every team's modes. `TeamModesTest` (TMODE-38).
- **BENCH-170.** Card plans/pc-team-clear.queue: bb and cl against aa on 45 teams x 12 seeds from 7600
  (2,160 battles, about 2.2 h), own-fire read of both arms, gate +0.30 APS. Results
  claude/pc-team-clear-results. `TeamClearPlanTest`.

## Dodging the enemies' bullets from how a member moves: MOMENTUM (TMODE-39, BENCH-171)

The Ogi mirror (BENCH-166) put +1.78 APS of the gap to Ogi on enemy bullets hitting our members. The
dodge (TMODE-27) scores each destination by driving it 30 ticks through the enemies' waves, and that
drive has the flaw CLEAR fixed for teammates' bullets: it starts from a standstill already facing the
destination. A member at 8 px a tick the other way brakes 2 a tick and turns at most 10 degrees a tick,
so a side step the drive rates safe is often not reached before the wave passes.

- **TMODE-39 MOMENTUM.** The dodge's wave check drives each candidate from Hadur's real heading and
  velocity with CLEAR's physics (nearer way front or back, the engine's turn rate, acceleration and
  braking). The check costs what the old drive did. Off by default; FORCE_MOMENTUM (ablation
  tmmomentum, suffix mo) adds it to every team's modes. Duel and melee fixtures replay bit for bit
  with it forced on. `TeamModesTest` (TMODE-39).
- **BENCH-171.** Card plans/pc-team-momentum.queue: bb and mo against aa on 45 teams x 12 seeds from
  7700 (2,160 battles, about 2.2 h), own-fire read of both arms, gate +0.30 APS. Measured on its own,
  CLEAR off. Results claude/pc-team-momentum-results. `TeamMomentumPlanTest`.

## Per-team aim for the teams Ogi out-hits: AIM (TMODE-40, BENCH-172)

CLEAR and MOMENTUM both failed (PRs #598, #599): cutting own fire 24% moved team APS +0.03. The mirror's
losses reads show where the gap is instead. Against the mid teams OgiTeam and HadurTeam both win almost
every round and deal the same damage, but Ogi hits 3.7 points more often (TroodonPack 24.2% vs 17.7%,
GrofGroup 22.2 vs 18.0, TMNR 20.1 vs 16.3), focuses 4-8 points harder, and ends rounds about 35% sooner,
so its members spend less time under fire. Most of these teams are nano and micro bots with simple
movement.

- **TMODE-40 AIM.** On a team, MGUN-17's aim experts (head-on, linear, circular scored on our own waves)
  run for the classes the table names with AIM, pooled over every copy of a class. Off by default; only
  the table turns it on. FORCE_AIM (ablation tmaim, suffix am) screens it on every team.
  `FieldGunExpertsTest` (TMODE-40).
- **BENCH-172.** Card plans/pc-team-aim.queue: a 15-minute pilot (13 teams x 3 seeds) that ends the card
  on no gain, then the screen to 12 seeds, a per-team pick and a 16-seed fresh gate. Results
  claude/pc-team-aim-results. `TeamAimPlanTest`.

## Per-team strategies from the whole lever set: FARM (TMODE-41 to TMODE-44, BENCH-204), then CLOSE field-wide (BENCH-205, shipped)

The 1v1 climb came from per-opponent tailoring. The team game has the same machinery (the mode
table, `team_modes.py`) but only three narrow cards ever filled it (counters, nododge, noconcord: 7
teams named). The farm card (PR #654) made every team-only lever a table mode and screened each as
one change to every team's current entry on all 46 teams, 6 seeds, paired with aa and an A/A control,
with a pilot after three arms. The pilot stopped it (PR #689): 1 of 45 teams cleared the per-team
rule (BuggerHive with CLOSE), +0.02 APS projected against +0.15. The lesson is statistical: a team
pairing at 6 seeds carries a ±4 to ±10 point interval, so a per-team pick needs a +5 lever, and none
of the three had one. Read field-wide against both baselines (43 teams):

- **FOCUS** (TMODE-41, the least-energy enemy weighed 3x): -2.48 ± 0.90 APS. Members firing down the
  same line hit each other 25% more (teammate bullet hits 84.8k to 106.2k). Removed.
- **NOLANE** (TMODE-43, no fire lane): -0.25 ± 0.63 APS. Own-member hits double (22.4k to 41.4k) for
  a flat score: the held shots were worth about the friendly fire they saved. The lane is not the
  leak. Removed.
- **POST** (TMODE-44) and the six other arms (GANG, OWN+HEADON, OWN+LINEAR, HUNT off, PATH off) never
  ran. POST removed with the card.
- **CLOSE** (TMODE-42, the hunt place 250 px from the prey): +0.41 ± 0.47 APS, the one lever in the
  black (Nightmare +4.5, Aleph +3.6, TMNR +3.5; Shadow -5.7). The 2026-10-28 cloud smoke at 250 px
  read -0.6 ± 1.3 on 22 teams. Confirmed field-wide by BENCH-205 and shipped.
- **BENCH-205.** Card plans/pc-team-close.queue: aa, bb and `tmclose` on 46 teams; a 4-seed pilot
  gated against both baselines (stop under zero), then 12 seeds from 9600 and the +0.15 APS gate.
  1,104 battles an arm in all (the 4-seed pilot's 368 among them), 0 failed. **PASS (PR #696): +0.56 ± 0.42 APS** (45 teams, sum
  +26.0 over 46; the pilot read +0.19 ± 1.10), the A/A control -0.07. A broad small gain: GrofGroup
  +5.2 ± 2.6 is the one team clear on its own, then Aleph +3.9, Firestarter +3.0, ArmyOfShiz +2.8,
  HOFSwarm +2.6; OgiTeam -3.2 ± 4.2 the largest loss, inside noise. Rounds won +0.3 ± 0.7, focus
  fire flat; bullets on own members +4.2 ± 1.7 a battle (about 5%, the A/A control -0.2 ± 1.7):
  hunting 100 px closer bunches the members, a cost the gate clears with. Shipped: `FORCE_CLOSE`
  on and CLOSE on every table entry; ablation `tmnoclose` is the build before. The card is removed.
  `TeamModesTest` (TMODE-42).

`team_modes.py arms` and `pick --stop-below` stay as bench tooling (`test_team_modes.py`).

## The team duelist's gun on team members (TGUN, BENCH-TG1)

Leigh's strategy doc of 2026-11-04 ("Hadur: Team & Melee, the structural shift to 1st") makes the team member the duelist with a crowd around it. Stage 0 (the Duel driving every member from the first tick, ablation tmduel) lost badly on a cloud smoke (PhoenixTeam 15% vs 78%) and was dropped unmerged. SURF (the melee duelist's crowd surfer, MSURF, retired, re-ranking the member's ring, views per enemy class) read -5.7 then -3.7 share points on 6 teams x 2 seeds, members taking about 18% more damage than DODGE, which learns from all five members' hits; it stays on the parked branch claude/team-tsurf-parked, unmerged. DUELGUN read +1.1 +- 2.7 on the same smoke (OgiTeam +6.4) and went to the PC card pc-team-dgun, whose pilot FAILED (PR #650): -0.02 +- 1.75 projected team APS on 45 teams x 3 seeds, the duel guns costing 26 skipped turns a battle to the baseline's 17. TGUN-1, TGUN-2 and BENCH-TG1 are retired and their code removed (see the retired table).
