# Plan: teammate collisions and friendly fire in the team jar (T1)

Scope: `hadur2.HadurTeam` (five `hadur2.Hadur`), A5 baseline in `docs/bench/a5-team.md`: 105,566 teammate collisions (~440/round), 884 of our bullets on a teammate, 2,610 on a teammate's bullet, over 3 seeds x 8 teams x 10 rounds. One PR. Solo play (1v1 and melee fixtures) must replay bit-identical.

## 1. Root causes

- **RC1. Neither mover can see a teammate.** `TeamLink.java:103-109`: a teammate's scan goes to `roster.scanned(...)` and `continue`; it never reaches the World's `EnemyTracker`, so `tracker.alive()` (`MeleeController.java:234`) holds enemies only. `TeamLink.java:134-136` drops a teammate `HitRobot` (counted, not offered), so the Duel's `robotsCollided()` (`DuelSeam.java:100-103`) never fires for teammates. `MinimumRiskMovement.chooseDestination` (218-241) scores enemies (`risk()` 289-305), bullets, walls, past positions and noise, no teammate term; the ring cap (`candidates()` 257-267) uses only enemies' nearest distance. `SurfMover` (194-314, 775-781) knows only `enemyLocation`, waves and walls; `DuelController.drive` (631-664) passes nothing else.
- **RC2. Shared eyes make shared destinations.** All members merge each other's sightings (`TeamLink.merge`, 161-196); `MinimumRiskMovement.noise()` (409-413) hashes `round` only, so the noise field is identical for all five; `openingSpot` (435-446) sends members near the same wall to the same strip. Five copies of one deterministic risk function converge on the same minimum.
- **RC3. The roster keeps a position only.** `Roster.Mate` (`world/Roster.java:28-62`) has `x, y, seen`; `reported()` (131-141) and `sighted()` (144-147) drop the `heading`/`velocity` the wire carries (`link/Report.java:116-129`, `Sighting` 15-33).
- **RC4. WEAVE-4 checks the lane at fire time only.** `TeamLink.laneClear` (208-224): half-width 24 px + 8 px per tick of report age against the last known point; ignores the bullet's flight. Only 66 of 33,133 shots had a teammate in the lane at fire time (`TeamHarvester.java:96-112`), yet 884 hit a teammate: ~92% of friendly hits are a teammate entering the lane during flight.
- **RC5.** 2,610 bullet-on-teammate-bullet hits: two members shooting the same target along near-parallel lines. Out of scope (shared-target item).

**Who drives when.** `RoleResolver.resolve` (`role/RoleResolver.java:124-138`): on a team the Team row never holds (`TEAM_BUILT=false`); Melee drives while WORLD-8's enemies >= 2, Duel when 1 enemy remains. So the endgame of a good round is several members surfing the same lone enemy with `SurfMover`, blind to each other.

**How the bench counts.** `TeamReport.read` (`hadur-bench/.../TeamReport.java:98-101`) sums the members' `T` records, field 3 = `TeamLink.teammateCollisions` (HitRobot events naming a teammate, per member per tick). Teammate bullet hits = `T` field 1. Keep these definitions so 3.7's numbers compare.

## 2. Design

Constraints: STRAND-2 (strands may read the kernel, not the conductor or each other); STRAND-3 pins per owner (`-Dhadur.pin=kernel,melee,conductor`); `DuelIdentityTest` forbids editing `move`/`physics`/`gun`/... outside a duel stage (`arch/DuelIdentityTest.java:17-19`). So the melee fix lives in `melee/`, the duel fix is a conductor fence (the WEAVE-2 pattern, like `role/SentryFence`), and the duel's packages are not touched.

### 2a. Kernel: the roster predicts (WORLD-9)
`world/Roster.Mate` gains `heading`, `velocity` filled by `scanned`, `reported`, `sighted` (callers in `TeamLink.java:107,174,178` already have them), and `Point2D.Double at(long tick)`: last known point projected `velocity * (tick - seen)` along `heading`, displacement capped at `8 * (tick - seen)`. Add `Roster.living(long now)`: living mates with `seen >= 0` and age <= `SILENT_WINDOW`, unmodifiable list.

### 2b. Melee: teammates in minimum-risk scoring (MMOVE-6, MMOVE-7, MMOVE-8)
`MeleeController.Situation` gets an overload with `List<Roster.Mate> teammates` (old constructors pass `List.of()`), carried into `MinimumRiskMovement.chooseDestination(..., teammates)`. In `risk(p, v)` add `teammateRisk(p, v)` over living fresh mates with `arrive = now + p.distance(me) / TRAVEL_SPEED`, `q = mate.at(arrive)`:
- Point term (MMOVE-6): `MATE_K * UNIT / max(d, MATE_FLOOR)^2`, `d = p.distance(q)`, `MATE_FLOOR = 36`, `MATE_K ~ 0.6`.
- Path term (MMOVE-7): distance from segment `me -> p` to the mate's track `mate.at(now) -> q`; `MATE_PATH_K * max(0, 1 - sd / MATE_PATH_RANGE)`, `MATE_PATH_RANGE = 60`. Cap the ring: `cap = max(MIN_RING, NEAREST_FRACTION * min(nearest enemy, nearest fresh teammate))`.
- Per-member noise salt (MMOVE-8): `noise()` becomes `mix(round * C ^ (cx << 20) ^ cy ^ salt)` with `salt = 0` off a team (bit-identical solo). On a team `salt = mix(rosterIndex + 1)`, rosterIndex = our name's place in `facts.name()` vs `facts.teammates()` order (leader 0).
- Opening fan: `openingSpot` shifted along the wall by `rosterIndex * 120 px` on a team (0 off a team).

### 2c. Conductor: a teammate fence for whichever role drives (WEAVE-8)
New `role/TeammateFence` mirroring `SentryFence.apply` (`role/SentryFence.java:48-57`): simulate the built orders `HORIZON = 6` ticks with `MovementPredictor.predict`; compare our predicted point with `mate.at(t)` tick by tick; within `CLEAR = 36 + 10` px is a predicted collision. Try in order: the orders as given; `o.withDrive(bodyTurn, ahead, 0)` (brake); `o.withDrive(bodyTurn, -ahead, maxVelocity)` (reverse); take the first that stays clear, else the one with the greatest minimum clearance. Only the drive is replaced. Applied in `HadurCore.tick` right after the sentry fence (`HadurCore.java:443-446`), only when `teamLink != null`. Count interventions in `TeamLink.fenced` and append as the `T` record's last field (backward compatible; widen `team[]` in TeamReport to 6).

### 2d. Fire lane over the flight (WEAVE-7)
`TeamLink.laneClear`: for each living fresh mate, `along = (mate.at(now) - me) . lane`; skip if `along < -half`; the bullet passes that distance between `t1 = along / 19.7` and `t2 = along / 11`; the mate's predicted track over `[t1, t2]` is the segment `mate.at(now + t1) -> mate.at(now + t2)`; hold if its distance to the lane line is `<= LANE_HALF_WIDTH + DRIFT * age + TURN_SLACK * t2`, `TURN_SLACK = 1.5 px/tick`. Teammates behind the gun keep today's test. Keep `blockedShots` counting. The permission stays "before drive" (WEAVE-3/WEAVE-6 unchanged).

### 2e. Plumbing
`TeamLink.filter` builds `roster.living(now)` once per tick; `HadurCore` passes it to `MeleeSeam.drive` -> `Situation` and to `TeammateFence.apply`. Off a team: no fence, empty list, salt 0, so 1v1/melee replays are bit-identical. `MeleeSeam` sets salt and roster index from `core.facts()`.

## 3. Requirements (docs/requirements.md, new section "The Team plan (T1)")
Stage letter: `RequirementsTraceabilityTest.ROW` only accepts `[SMRA]\d`; add `T` with root-pom property `hadur.team.stage` = `T1` and a `due()` clause. Fallback: file under `A6` and bump `hadur.arch.stage`. Owners: WORLD-9 kernel, MMOVE-6..8 melee strand, WEAVE-7/8 conductor.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| WORLD-9 | Event | When a teammate's state is scanned or reported, the World shall keep its heading and velocity with its position and shall predict its position at a later tick from them, moved no further than a robot's top speed allows. | T1 |
| MMOVE-6 | State | While in melee on a team, movement shall add to each candidate point's risk a term for every living teammate whose position is no older than the WORLD-3 window, rising with the inverse square of the distance between the point and the teammate's predicted position when Hadur would arrive. | T1 |
| MMOVE-7 | State | While in melee on a team, movement shall score the path to each candidate against each such teammate's predicted track, and shall cap the candidate ring at the same fraction of the nearest teammate's distance as of the nearest opponent's. | T1 |
| MMOVE-8 | State | While on a team, each member's movement noise field shall differ from its teammates' by the member's place in the roster; off a team the field shall be the one MMOVE-1 uses. | T1 |
| WEAVE-7 | State | While a living teammate's predicted track, over the time a bullet of any power would take to pass it, comes within the fire lane's half-width of the lane, the conductor shall withhold the fire permission. | T1 |
| WEAVE-8 | Unwanted | If the driving role's drive, simulated a set number of ticks ahead, would bring Hadur within a robot's width and a margin of a living teammate's predicted position, then the conductor shall replace the drive with the nearest of a brake or a reversal that stays clear, keeping the gun, radar, fire and message orders. | T1 |

## 4. Solo play: nothing changes
All of 2b-2d is reached only through `teamLink != null` or an empty teammate list; salt is XOR 0. `ReplayTest` over the 1v1, melee, sentry, hand-off, warm and duress fixtures must pass with no solo fixture re-recorded; `DuelIdentityTest` untouched. Re-pin only `kernel`, `melee`, `conductor`. The two team fixtures (`replay/team-sampleteam.MyFirstTeam-m1/-m2.txt.gz` and telemetry) are re-recorded with `--team true --record` against `sampleteam.MyFirstTeam` (STRAND-5), listed in the PR.

## 5. Tests
- `world/RosterTest` / properties: WORLD-9 heading/velocity kept from scan, report, sighting; `at(tick)` linear, capped at 8 px/tick; `living(now)` excludes dead, never-seen, stale mates.
- `melee/MinimumRiskMovementTest`: MMOVE-6 (near predicted point costs more; prediction not last-known point counts); MMOVE-7 (path across a track costs more; ring capped by a close mate); MMOVE-8 (salt 0 bit-identical `noise()`/`risk()`; two salts give different destinations); empty-teammate `risk()` equals pre-change exactly.
- `role/TeammateFenceTest` + jqwik properties (like `SentryFenceProperties`): WEAVE-8 drive into a mate 60 px ahead replaced; clear drive returned as same object; gun/radar/fire/messages kept bit for bit; head-on pair both brake.
- `TeamLinkTest`: WEAVE-7 crossing mate holds the shot, receding mate fires; `T` record gains the fence count.
- HadurCore-level: team core heading at a mate gets replaced drive; same input off a team untouched.
- Bench: `TeamHarvester` adds engine-side teammate bullet hits to `rounds.csv`; `TeamReport` prints it beside the `T` sum.

## 6. Gate
`hadur-bench/team-gates.txt` (`--set team-reference.txt --team true --seeds 3 --rounds 10`, 1200x1200), candidate vs the 3.7 team jar, paired by (team, seed). Report `docs/bench/t1-team.md`. Pass when vs 3.7:
- teammate collisions (`T` sum) down >= 90% (<= 44 per round);
- our bullets on a teammate down >= 80% (<= 177 over the suite);
- score share: mean paired difference >= -2.0 points, no team worse beyond its 3-seed spread;
- 0 faults, 0 LINK rejects, 0 count-below-truth, 0 stray shelf files, skipped turns <= 2x 3.7's;
- shots held for the lane reported (a rise above ~3x 5,001 means narrow `TURN_SLACK`).

## 7. Risks
Spreading into fire (start `MATE_K` 0.6, sweep 0.3-1.2); the fence under a wave (horizon 6, 46 px clearance, count shown); mutual fences oscillating (hold a replacement 2 ticks if seen); more held shots (knob `TURN_SLACK`); stale predictions on skipped turns (same `living()` filter); pins and fixtures listed in the PR; traceability stage letter (fallback A6).

## As built (3.8)

Changes from the plan above, each with its reason:

- `TeammateFence.apply` takes each teammate's predicted track (a `Point2D.Double[]` of
  `HORIZON + 1` points built by `TeamLink` from `Roster.Mate.at`), not the mates: `ArchitectureTest`
  lets `role` depend only on `role`, `model` and `physics`, so it cannot name the kernel's `world`.
- `TURN_SLACK` is 3 px a tick, not 1.5: at 1.5 the smoke left 14 of our bullets on a teammate in
  10 rounds against MyFirstTeam, at 3 it left 7, for 17% more held shots.
- The opening fan is centred on a roster of five, `(place - 2) * 120` px, so the ends do not
  both clamp against the corner gap; the place is the member's rank among the team's sorted
  names (the leader is not special).
- The fence's test is "nearer than `min(CLEAR, distance now)` at some tick", so a robot already
  close may drive away; the plan's hold of a replacement for two ticks was not needed (no
  oscillation seen: 0 to 6 collisions in 10 rounds).
- `MATE_PATH_K` is 0.3 and `MATE_K` stays 0.6; collisions were already near zero, so no
  sweep of `MATE_K` was run. A bounding-box test skips the path geometry for tracks far from the
  path (about 60 microseconds a tick for four teammates).
- The stage letter `T` worked (`hadur.team.stage`, `RequirementsTraceabilityTest` accepts it);
  the A6 fallback was not used.
- The bench: `rounds.csv` has a ninth column, the engine's count of our bullets that hit one of
  our members, and a battle directory has `friendly.log` (`TeamHarvester`); the `T` record's last
  field is the count of drives fenced (`TeamReport.team[5]`).
