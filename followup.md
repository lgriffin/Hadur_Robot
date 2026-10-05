# Follow-ups

Open items from the Hadur 2 stages, newest stage first. The open ones are tracked as
[GitHub issues](https://github.com/lgriffin/Hadur_Robot/issues) (#44 to #56, opened
2026-09-28); the notes below are the detail behind them.

## Architecture evolution A0 to A5 (releases 3.6 and 3.7)

All six stages merged (#87, #88, #89, #92, #93, #94), and 3.7 was entered on the RoboRumble,
MeleeRumble and TeamRumble on 2026-10-05. Open after A5:

- **3.7's passes, read** in [docs/bench/live-3.7.md](docs/bench/live-3.7.md): the 1v1 at
  85.67 (21st) is 0.43 below the predicted range and not yet attributed (L-43); melee 65.25
  (18th) is level; the first team pass reads 39.43 (32nd of 46).
- **Teammates collide: addressed by T1** ([team-plan-t1.md](docs/team-plan-t1.md), 3.8). The A5
  baseline had about 440 collisions a round and 884 of our bullets on a teammate
  ([a5-team.md](docs/bench/a5-team.md)). The World now predicts a teammate, the melee movement
  scores it, the conductor fences the drive of whichever role drives and widens the fire lane
  over the bullet's flight. The smoke bench (3 to 10 rounds against MyFirstTeam, ConceptA and
  ShadowTeam) reads collisions down about 99.9% and friendly hits down 83% to 85%. The T1 gate
  run (`team-gates.txt`, 3 seeds, 8 teams, `docs/bench/t1-team.md`) is still to be run and
  read. Still open for the Team plan: bullets that hit a teammate's bullet (2,610 at A5; the
  shared-target item), a shared target and formation.
- **Droids** (a leader with radar-less members) are left to the Team plan.
- **Stale comments.** Comments in the nine pinned packages that name `HadurCore` are out
  of date since A2. Fixing them is one optional, comment-only re-pin.
- **The Tutors course** (`course/`) teaches the pre-A1 core. Its hexagon and melee notes
  and the capstone lab still describe the posture gate in place of the role resolver.

## Rumble climb R5 and R7 (rumble-safe memory, session bench, duress)

- **R5** (PR #70, merged): MEM-8 to MEM-10 and ADAPT-4. Profiles are stats-only except for
  at most five opponents met twice and scored under 60% against; each profile-format version
  keeps its own file names; the round-end checkpoint writes at most once a battle. Gate in
  `docs/bench/r5-gate.md`: 12 of 12 weak bots 35/35 with a shared never-wiped data
  directory, the `hadur2` directory 18 KB for 60 opponents, warm top-10 43.2% against the
  cold 43.1%. Not released on its own; it ships in the next release after 3.2's live pass.
- **BENCH-6/BENCH-7** (`hadur-bench --session FILE`): the condition no earlier bench had,
  hundreds of battles through one engine process under `-Xmx512M`, with a `sample.Tracker`
  control, per-battle heap after a full collection, longest GC pause, live classes, engine
  disables and duress ticks, reported by blocks of 25 battles. `session-300.txt` and its
  300 opponents (`data/tools/sample_session.py`, fixed seed) are the R7 session; see
  `hadur-bench/README.md`.
- **RES-9** (duress): after three skipped turns in a round the core stops learning (no
  waves, samples or tree reads) and orbits at 400 px, fires head-on at power 1.0 and keeps the
  radar locked for the rest of the round. `RoundStats.duressTicks` is the new last field of
  the R record. The duel's pinned sources changed in `TickBudget.java` only (the skip
  counter): a deliberate re-pin of `duel-sources.sha256`.
- **RES-10**: `RobotLoaderTest` runs 40 one-round battles through one engine under 256 MB
  and requires the live class count to stop growing; the shipped robot passes it, so a leaked
  robot class loader is not the cause of the live slide.
- **Open**: the 300-battle session itself and its bisect (heap cap, fresh JVM, wiped data
  directory) decide the R7b fix; results go in `docs/bench/r7-session.md`.

## Rumble climb R4b/R4c (BENCH-4, release 3.2)

- **BENCH-4** (`hadur-bench --client FILE`) runs the opponent set once per rumble-client
  condition a file lists (a shared or prefilled data directory, a forced CPU constant,
  background load, another engine or JVM), each its own pass, and reports survival share
  and skipped turns per opponent per condition. An `engine=`/`java=` condition with nothing
  local to match is reported as not run, not failed.
- **Not reproduced.** Run against master over the weak set: a shared never-wiped data
  directory, the CPU constant forced to 1.0ms and 0.3ms, and four background-load threads
  all leave survival at 97 to 100%, the same as the default bench, against the live drop to
  71-77%. See `docs/bench/r4-client-conditions.md` and `data/learnings.md` L-21.
- **The plan's top candidate doesn't reproduce it either.** A data directory built the way
  a real multi-version client would (the 2.2 jar warm over the weak set, then the 3.0 jar
  warm on top of it, 184 KB), with 3.2 prefilled from it: still 97-100% survival. See
  `docs/bench/r4-prefill-condition.md`.
- **Not tried**: another Robocode engine release, another JVM (BENCH-4 supports both,
  `engine=`/`java=`, but this environment has no second engine distribution or JDK on
  hand), and the actual offline RoboRumble client (`roborumble.jar`) run as a BENCH-4
  condition — suggested during this stage but not one of the Maven-available Robocode
  artifacts, so not attempted. Whoever picks this up with a real rumble client available
  should try those next.
- **Timing for the hand-off**: 3.1 went live at 04:32 UTC 2026-09-29. Don't swap the live
  rumble entry from 3.1 to 3.2 until 3.1's own BotDetails page has been saved (roughly
  10:30 UTC or later, ~6h of pairings) — swapping earlier loses the read on whether R1
  already fixed the collapse.
- **Per the plan's decision tree**, "not reproduced" ships RES-7 and RES-8 anyway: this
  stage releases 3.2 and reads the live rating with BENCH-5 once it has 300+ pairings,
  rather than block on conditions this environment cannot exercise. `hadur.climb.stage`
  moves to `R4`.

## Rumble climb R4a (BENCH-5, RES-7, RES-8)

- **BENCH-5** (`hadur.bench.LiveDetails`) reads a saved LiteRumble BotDetails page and
  reports APS/survival by opponent-APS band, by UTC hour, a before/after split, and live
  minus bench share against a given bench report. Run against 3.0's saved page it reproduces
  the plan's numbers exactly (docs/bench/live-details-3.0.md): 268 pairings at 85.5 APS
  before 08:30 UTC, 239 at 77.2 after. Once 3.1 has 300+ pairings, save its BotDetails page
  and run the same tool against it to see whether R1's client-reliability work touched the
  effect.
- **RES-7**: after three faulting ticks in a round, the guard's safe orders now also fire
  power 1.0 at the enemy's last scanned bearing whenever the gun is cool, so a core that
  faults every tick still returns fire.
- **RES-8**: the core writes a small `health.hc` record at battle end (rounds, rounds
  survived, faults, skipped turns, memory failures, learned tick allowance), so a
  client-side reproduction of a live problem is self-describing.
- **Still open**: BENCH-4 (the client-conditions bench: shared/prefilled data directory,
  CPU constant, background load, another engine or JVM) is R4's next piece, and the one
  most likely to reproduce the 08:30 collapse (L-03 in `data/learnings.md`). `hadur.climb.stage`
  stays at R3 until BENCH-4 lands too, so these three requirements are visible in
  `docs/requirements.md` but not yet due.

## Rumble climb R3.5 (3.1 release)

- **3.0's live rating collapsed about 08:30 UTC on 2026-09-28** (85.5 to 77.2 APS, survival
  92.6% to 71.2%) and the bench cannot reproduce it; see
  [docs/rumble-climb-r4-r6-plan.md](docs/rumble-climb-r4-r6-plan.md). R3.5 ships the merged
  and previously unreleased R1 to R3 work as 3.1 so live battles start on it while R4
  investigates the cause directly.
- **None of R1, R2 or R3's own bench gates have been run** yet (`hadur-bench/rumble-sample.txt`
  still only covers the top-30 stratum, so BENCH-1 can't estimate APS). 3.1's own bench (weak
  set and top-10, docs/bench/rumble-3.1-*.md) shows no regression beyond noise, but is not
  those gates.
- **Read with BENCH-5 (2026-09-30): R1 did not touch it.** 3.1's complete pass slides the same
  way (85.7 APS in its first hour to 78.6 in its last; `docs/bench/live-details-3.1.md`).
  The next plan is [docs/rumble-climb-top30-plan.md](docs/rumble-climb-top30-plan.md): enter
  3.2 now, merge the held R5, then R7 (a one-JVM session bench over 300 rumble bots, the
  one condition never benched) and R6 last.

## Release 3.0 and the melee extension (M0 to M6)

- **Reference APS 60 is not met** (#44). Four 10-seed runs of the M6 builds range 52.7 to
  54.6 (docs/bench/m6-gates.md), and the weight sweep found the movement at a local
  optimum. The next levers are the radar (turn it with the gun and body, an arc sweep; the
  worst scan gap is still 10 to 11 ticks against M2's 8) and the field gun's bullet damage.
- **The hand-off gate needs a warm bench** (#45). M5 won 31% of hand-off duels against 57%
  in clean 1v1, but the bench is cold, so the survivor's 1v1 profile is never handed over.
- **The MeleeRumble 2,000-battle gate** waits on the ratings (#46). 3.0 replaced 2.2 in both
  rumbles on 2026-09-28 (docs/rumble-submission.md).
- **No `v2.2` or `v3.0` tag** (#47). Actions runs still fail before any step, so both
  releases were built and verified locally, and gh-pages is republished by hand with
  `site/build.sh --publish`.
- **Skipped turns follow a round win in melee** (#48): the melee profile write at round end,
  the same cause as the duel's round-end skips (S6 below).
- **Code findings from the Javadoc pass** (#50, #51, #52): possible play bugs (NaN margins,
  a stale surf neighbour cache, `is1v1` fixed at battle start), telemetry the round record
  overwrites in melee, and edge cases and dead code. None was fixed by the pass, which
  changed comments only. The broken `{@link #shots()}` in `melee/EnemyTracker` it also
  found was fixed at M6, when doclint started covering the melee packages.
- **The duel gun is the weak spot against strong surfers** (#49). On the 2.2 top-10 cold
  bench (mean 45.1%), BeepBoop, ScalarR, Diamond and DrussGT score 19 to 39%, with our hit
  rate 5.7 to 7.8% against them. No warm top-10 run has been done yet.
- **Scoring virtual bullets along the route costs about 3 APS** in behaviour, not time
  (guessed bullet paths hem Hadur in), so the mover scores destinations only (M4).
- **Four benches in parallel on four cores inflate skipped turns badly;** compare variants
  under equal load, solo, at 10 seeds (the same jar gave 51.3 and 53.7 APS on 5).

## S7

- **Melee stays.** The plan's S7 said to cut melee; Leigh chose to keep it (2026-09-27),
  since 2.1 entered the MeleeRumble with it and it only runs with two or more opponents
  alive. The earlier item under "Release 2.1" is settled.
- **2.2 is entered in both rumbles** (2026-09-27) from a local build hosted on Google Drive;
  the participant line is in docs/rumble-submission.md. Watch the RoboRumble and
  MeleeRumble rankings once a few thousand battles are in, and compare them with the
  bench.
- **The 2.2 tag is not pushed.** GitHub Actions was not running jobs (the verify runs on
  PRs #30 and #31 failed within seconds, before any step), so 2.2 was built and checked
  with a local `mvn -B verify` instead. Pushing `v2.2` once Actions works would publish
  the same source as a GitHub release; the rumble entry does not need it.
- **No mutation testing** (#56). The plan's testing layers named PIT; it was never set up
  (docs/testing.md).
- **No new bench for 2.2.** The only code change after S6 is the version number, so the S6
  benches stand for 2.2.

## S6

- **Go-to surfing lost the A/B as the default.** Against Shadow cold, the three-option surf
  scored 54.8% +- 3.7 and go-to surfing 51.8% +- 5.1, with their hit rate 8.8% against
  9.5% and more slow ticks (438 against 284) and skipped turns (42 against 12)
  (docs/bench/s6-2.1-shadow-options-cold.md, s6-2.1-shadow-goto-cold.md). Go-to stays as
  MOVE-2's second flavour: it is only reached when the base movement is already being hit
  more than the profile says. Its candidates are every second tick along both orbits; a
  finer set, or scoring the second wave for more than the best three, may change the
  result, but costs time the budget does not have at the allowance assumed.
- **The allowance is assumed, not read** (#54). Robocode does not tell a robot its CPU constant;
  3 ms is the bench host's. A slower rumble client would give more time, a faster one less,
  and TIME-1 would shed later or sooner than it should. Hadur could estimate the constant
  from the first skipped turn, as some rumble bots do.
- **Level 3 was reached against Shadow,** mostly from host stalls the budget cannot
  avoid (single turns of 20-50 ms), which count as skipped turns and hold a level for the
  rest of the round. A bench on a quiet host would say how often the core itself runs over
  budget.
- **MOVE-2 has no measurable effect yet** (#55). Cold it never fires, by design: a stranger has
  no baseline. Warm it fired 8 times over 5 battles against Shadow (all three steps in
  battles 2 and 3), and the warm bench scored 54.6% +- 6.0 with it and 55.2% +- 3.8 with it
  switched off, their hit rate 8.3% both ways (docs/bench/s6-2.1-warm.md,
  s6-2.1-shadow-warm-noflavour.md). Part of what triggers it is likely Shadow's gun learning
  within a battle: the profile's rate averages whole battles, cold start included, while
  the live window is the latest 100 waves. A baseline taken from the same part of past
  battles (waves 100 on) would be fairer.
- **Skipped turns are not zero** (#48), which was S6's gate: 72 over the cold bench (26 against
  Shadow, 5 to 14 per sample bot), against 174 at S5 on a stalled host and 15 at S3. Half
  fall on the turn a round ends, when the round record and the profile checkpoint are
  written; the rest are scattered, with turn p95 at 1.5 ms of the 3 ms allowance, which
  points at the host or garbage collection rather than the core. Moving the checkpoint
  write off the round's last turn is the next thing to try.
- **The shadow is a bearing interval from the wave's source, not a guess-factor range.**
  The surf's own views still bin guess factors; the danger is scaled by the share of the
  robot's intersection a shadow covers, not re-binned. A precise surf could zero the bins a
  shadow covers instead.

## S5

- **The gate is only partly measurable.** "Bullet-damage share up against T0-T2" has no
  T1 or T2 opponent in the bench, and the sample bots (T0) already sit at 99-100% share,
  so share cannot rise there. What S5 moved against them is kill speed: rounds 5-13%
  shorter and 0.3-3 more damage dealt per round (docs/bench/s5-2.1-cold.md). Bench a few
  mid-table RoboRumble bots to calibrate T1/T2 and to see whether closing pays against
  them.
- **DIST-1's floor is 400 px, not 150.** At 150 the sample bots' head-on and linear guns hit
  Hadur often enough to take 0.4-2 points of share off it; 300 still lost a little. If a
  T1/T2 set shows closer is better against learning guns that miss, the floor could
  depend on the gun tier instead of being one number.
- **Against Shadow the controller mostly stays out.** Cold, no lead is ever certain enough
  to come in; warm, the T3 opening at 550 px walked back out to 650 within a few rounds,
  because their rolling hit rate led ours by 5 points at some point (going out needs no
  certainty). The warm gain (48.5% +- 2.5 against 44.0% +- 4.5 for S4 re-run) is
  suggestive, not proven: the intervals overlap.
- **The wall stick and the distancing exponent were not re-tuned.** The plan asked for it;
  with the floor at 400 px the fighting distance moved less than the plan assumed (the
  true mean distance against Shadow, from the truth logs, was 473 px at S4 and 469 px at
  S5), so the Diamond constants still fit. Revisit if S6 or a T1/T2 bench moves the distance.
- **POW-2 depends on the distance.** Against Walls at 150 px their hit rate rose to about
  10%, so POW-2 never fired; at 400 px it fired about 1,000 shots a bench. The two
  policies interact through the hit rates, not directly.
- **END-1 fires often against Shadow** (1,759 ticks over a cold bench), whenever Shadow is
  low and has just fired. Its effect is not separable from noise in these runs; a paired
  bench with END-1 off would price it.
- **Skipped turns on the cold run** were 174 against 124 for the S4 re-runs, with single
  turns up to 89 ms: host stalls, not S5 work (turn p95 was unchanged, and a sample-bot
  run of the same code a little earlier skipped 5-11 per opponent). S6's tick budget
  remains the fix.

## S4

- **T1 and T2 are uncalibrated** (#53). The gun-tier bounds (normalised 2, 4.5 and 7%) were set so
  the sample bots read T0 and Shadow T3. No bench opponent falls in T1 or T2 yet; bench the
  RoboRumble top 10 warm to place them.
- **No warm gain against Shadow yet.** Warm 45.0% ± 10.3 against cold 44.3% ± 5.5. The
  opening (main gun, flattener on) is what live play converges to anyway, so the seeds only
  save the first rounds' learning. Look at round-0 to round-2 scores before tuning weights.
- **The S4 cold bench ran on a loaded host.** It skipped 283 turns, 104 of them in one stall,
  with sample-bot turn times twice the warm run's. Rerun the cold set on a quiet host before
  reading skipped turns as a regression; the warm run skipped 12 turns against Shadow.
- **Checkpoint I/O is about 44 KB a surviving round** with full seeds (a copy plus the
  profile). If a rumble client is slow at file I/O, checkpoint stats only and save seeds at
  the battle's end.
- **RES-4 waits for a tight live estimate** (margin at most 5 points), which takes a few
  hundred waves. A profile that is wrong from the first round costs up to that much play.
- **Version 1 profiles lose their seeds** when read (they had none in practice) and are
  rewritten as version 2 on the next save.
- **The S4 benches predate the review fixes.** Qodo's review found that fully faded seeds
  still steered aim and could make surf danger NaN, and that thin profiles replayed seeds.
  The fixes leave cold play bit-identical (the replay fixtures pass) but change warm play
  after a seed fades and for thin profiles; rerun the warm set before comparing with S5.
- **Robocode refunds quota only on rewrite, not on delete.** `FileProfileStore.delete`
  empties a file before deleting it. Any new file the robot writes must do the same.

## S3

- **Tiers are provisional.** `Tiers` uses the artifact's thresholds on raw hit rates (their
  hit rate on us, our virtual guns' weighted ratings), with 30 observations minimum. The
  artifact asks for a normalised hit rate; S4 should set the thresholds from the bench logs
  before the opening book relies on them.
- **Seeds are in the format but empty.** The codec stores up to 600 gun and 300 surf samples
  of 13 shorts each; S4 decides the quantisation and fills them.
- **Hit distance is approximate.** Our hits are filed under the distance at the last scan,
  not at firing; their hits under the distance their wave was fired from when the wave is
  found.
- **Score share in a profile is estimated.** The robot never sees the enemy's score, so the
  profile keeps 60 points a round won plus bullet damage for each side.
- **Every round Hadur survives writes the profile** (a checkpoint, about 1 KB and three file
  operations). A round it loses does not: writing from a dead robot's thread kept it in the
  round, where the enemy went on shooting it and its last bullets refunded it energy. The
  battle-end save always runs. If a rumble client proves slow at file I/O, save only there.
- **String joins are compiled inline** (`-XDstringConcat=inline` in the root pom). Java 9+'s
  default bootstraps each join site on first use, a few ms each, and that alone made the
  first scan skip turns. Keep the flag unless the tick budget work (S6) replaces it.

## Release 2.1 (melee)

- **Melee is mid-field against real melee bots.** Hadur wins almost every round against
  nine sample bots, but against nine established MeleeRumble bots it places around the
  middle (see docs/bench/melee-2.1-classic.md): its bullet damage is about half of the
  leaders' (abc.Tron, rz.Aleph). The gun is plain circular/linear with no learning; a
  melee-aware KNN or play-it-forward gun and energy-drop shot dodging in the mover are the
  obvious next steps.
- **The plan's S7 said "cut melee".** Settled in S7: melee stays in the core.
- **Opponent stats are not used for much.** `OpponentStats` classifies movement and gun
  type, but only the damage a robot has done to Hadur feeds a decision (the target
  selector, when Hadur is low). Profiles in S3 could feed them.
- **No per-tick budget in melee** (#54). The mover scores 108 points against every opponent each
  tick; cheap at 10 robots, but the S6 tick budget (TIME-1/2) should cover melee too.
- **The melee bench reports places and score share only** (#51). It does not collect Hadur's
  R records per battle as the 1v1 bench does.

## S2

- **Unseen shots.** A shot fired while Hadur is disabled, or just before a round ends,
  never shows in a scan. The bench counts unmatched shots from those moments apart
  ("Unseen"). Against Shadow, 33 other shots (0.3%) were missed; not yet examined.
- **Wall-hit inference is a heuristic.** A dead stop within 19 px of a wall that the enemy
  could not have braked into over the scan gap is taken as a wall hit. Energy alone cannot
  tell a wall struck at one speed plus a shot from a wall struck one speed step faster plus
  a shot 0.5 weaker, so such a shot's power can be 0.5 off; the ledger takes the speed
  nearest the scanned one that leaves a legal power, so the shot still becomes a wave.
  A wall hit during a scan gap, when the enemy could also have braked, is not inferred.
- **The robot jar must be rebuilt, not reused.** The robot shade overwrites the plain jar,
  so the jar plugin now forces a rebuild each package; without it, a second `package`
  without `clean` produced a recorder jar with no recorder in it.

## S1

- **ProGuard dropped.** 1.x shrank the robot jar with ProGuard; 2.0 ships the shaded jar
  unshrunk (about 100 KB). Revisit if RoboRumble size matters.
- **The adapter has no unit tests of its own** (#56). It is covered end to end instead: the replay
  fixtures are recorded from the adapter in the real engine, and the bench runs it. A fake
  `AdvancedRobot` harness could test `NaN` handling directly.
- **Replay fixtures pin behaviour.** Any change meant to alter Hadur's play must re-record
  them (see hadur-bench/README.md). Floating-point results come from `Math` functions,
  which HotSpot keeps consistent on one platform; if CI on another architecture disagrees,
  compare with a tolerance there.
- **Skipped turns remain**, and the first scan of a battle is slower than in 1.20, which
  sometimes delays that tick's orders by one turn (see docs/bench/s1-2.0-cold.md). The tick
  budget is S6 work; warming the core up at battle start would be the cheap fix.
