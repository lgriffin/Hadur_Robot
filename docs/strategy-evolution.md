# Hadur 2: evolution of strategy

As of 2026-09-27 (after S7, release 2.2). The living copy is the [Claude Doc](https://claude.ai/code/artifact/bc581157-b352-49c9-acaf-9f77035202c5); this file is its snapshot for evaluation. The living copy also covers the melee extension, R9, the top-15 plan and the architecture evolution (A0 to A5, releases 3.6 and 3.7). For the stages since this snapshot, see the stage log in [architecture-evolution.md](architecture-evolution.md#stage-log) and [what 3.7 should score](bench/expected-3.7.md).

## Summary

Hadur has moved from a hard-to-test dual-mode robot (1.20) to a 1v1 duelist with a Robocode-free core and a measured bench. It now infers enemy shots almost exactly. Against Shadow 3.83c, the reference duelist, 99.4% of the shots a scan could reveal become waves and none of its waves are false. It now wins every round against the sample bots.

Since S3 it also remembers each opponent across battles, crash-safely and within Robocode's data quota. Since S4 it reads that memory: it names the opponent's gun and movement tiers, picks an opening gun and surfing prior from them, replays stored samples into its guns and surfing at half weight, and lets live evidence overrule the profile when they disagree.

Since S5 it also presses when it is ahead: a distance controller that comes in while Hadur clearly out-hits the enemy, full-power shots against guns that cannot hit it, and closing in to finish or ram a beaten enemy.

Score share against Shadow has not moved outside the noise: 40.8% at 1.20, 46.2% at S1, 43.7% at S2, 45.1% at S3, 44.3% at S4 and 46.3% at S5 cold. Warm, S5 scored 48.5% ± 2.5 against 44.0% ± 4.5 for S4 re-run the same day, with survival share up from 52.6% to 62.4%; that is the first warm result above its cold one, but the intervals still overlap. Against the sample bots S5 ends rounds 5-13% sooner without losing share. S6 targets Shadow's hit rate on Hadur directly, and is the first stage to move the score outside the noise: 57.4% ± 5.0 cold, with their hit rate down from 9.9% to 7.9%. Most of the gain is bullet shadows: Hadur now knows exactly which of Shadow's firing angles its own bullets block.

## Starting point: Hadur 1.x

Hadur 1.20 was a strong but opaque robot. It evolved release by release, from 1.x to 1.20, by adding techniques and tuning them against intuition.

- **Movement:** wave surfing. It read an enemy shot from any energy drop of 0.1 to 3.0, then dodged a multi-model danger ensemble.
- **Guns:** KNN guess-factor guns, a 13-dimension feature space, an anti-surfer array and a distance-aware gun selector.
- **Power and energy:** energy-ratio fire power and bullet shadows (1.18 to 1.20).
- **Modes:** duel and melee in one robot, with melee survivability work in the later 1.x releases.

Three weaknesses shaped what came next:

1. **Nothing measured it.** Changes were judged by watching battles, so it was impossible to tell a gain from noise.
2. **Strategy and engine were fused.** Tactics lived inside the Robocode robot class, so they could not be unit-tested or replayed.
3. **Its picture of the enemy was noisy.** It surfed waves that never existed: our own bullet hits, wall hits and collisions all looked like shots. It also missed shots hidden by the enemy's hit refund.

## Direction: a duelist that remembers

Hadur 2 is a 1v1 duelist that is measured at every step. Its goal is to learn each opponent across battles and adapt. The plan comes from the [Hadur 2 artifact](https://claude.ai/artifact/KDkC1j5Yj8vWH6XQydyYH8). It is staged: each stage has a bench gate and EARS requirements, and each is merged only when its gate is met.

| Stage | Focus | State |
| --- | --- | --- |
| S0 | Headless bench and 1.20 baseline | Merged (PR #18) |
| S1 | Hexagonal core, adapter, guard, replay | Merged (PR #19) |
| S2 | Energy ledger, radar reacquire | Merged (PR #20) |
| S3 | Opponent memory | Merged (PR #28) |
| S4 | Recognise and adapt | Merged (PR #29) |
| S5 | Aggressive distance and power policies | Merged (PR #30) |
| S6 | Unhittable movement, tick budget | Merged (PR #31) |
| S7 | Rewrite the docs, release 2.2 (melee kept) | Merged (PR #32) |

Melee was parked on 2026-09-26. The melee work (PR #17) was closed unmerged, and its branch was kept in case a separate melee robot is built later. Every design choice since then optimises for one opponent at a time.

## S0: measure before changing anything

S0 built a headless bench and used it to measure 1.20. The key finding: Hadur wins about half its rounds against Shadow but takes only 40.8% of the score. Shadow out-damages it (36.5% bullet-damage share), even in rounds Shadow loses.

- **How the bench works.** It runs Robocode 1.9.5.6 from Maven, one JVM per battle, with a fixed random seed and the security manager on. Each cold run is 35 rounds by 5 seeds per opponent, with learned data wiped.
- **Ground truth.** Every turn it logs both robots' true positions, energy and live bullets, so later stages can be scored against what really happened.
- **Strategy consequence.** Score share, not rounds won, became the headline metric. Shadow is the reference opponent; the sample bots are sanity checks (1.20 won 872 of 875 of their rounds).
- **A problem surfaced early.** 1.20 skipped 44 turns, 31 of them against Shadow, and some turns spiked to 43 ms. This became S6's tick-budget work.

## S1: separate the brain from the engine

S1 moved all of Hadur's strategy into a core with no Robocode imports, without changing how it plays. Everything after it depends on this: strategy can now be tested, replayed and reasoned about outside the engine.

- **Hexagonal shape.** A thin adapter turns engine events into plain records (`BotInput`, `BotEvent`). The core returns `BotOrders`, and telemetry leaves through a port. ArchUnit enforces the boundary on every build.
- **Guard (RES-1).** If the core throws, the robot still gets safe orders that tick and the fault is recorded. No faults occurred in 1,050 benchmarked rounds.
- **Replay (CORE-2).** Recorded battles against each reference opponent replay through a fresh core to the live robot's exact orders, bit for bit. Any unintended change in play fails the build.
- **The faithful port paid off.** Comparing same-seed battles against 1.20 turn by turn exposed two slips, and both were fixed. First, 1.20's fire check reads the gun's remaining turn in degrees, not radians. Second, 1.20's aim sees gun heat from a shot fired earlier in the same tick. After the fixes, 3 of the 4 comparable battles were identical for all 35 rounds.

Result: 46.2% ± 6.4 score share against Shadow (98 of 175 rounds won), within noise of S0, as intended.

## S2: see the enemy's bullets as they really are

S2 replaced "any energy drop is a shot" with an energy ledger. Hadur now dodges only waves that exist. Against Shadow it finds 99.4% of the shots a scan can reveal, with 0 false waves. Across all opponents, 1,820 drops that 1.20 would have surfed as phantom waves were explained away.

- **The ledger (WAVE-1, WAVE-2).** Between scans it adds up what the enemy's energy should have done without a shot. That means our bullet damage, the enemy's hit refund, collisions and inferred wall damage. Only a remainder in \[0.1, 3.0\] becomes a wave.
- **Radar reacquire (RADAR-1, new).** The bench showed a 1.20 bug: after a skipped turn the radar could lose the enemy for the rest of the round, and Hadur fought blind until it died. The radar now sweeps back toward the last bearing.
- **Wave fidelity, scored against the truth.** The bench matches each inferred wave to the engine's real bullets. This turned vague tuning into specific fixes:
    1. 0.1-power shots read as 0.0999999, so drops are compared with a small tolerance.
    2. The engine applies acceleration before its wall check. Enemies still speeding up into a wall took more damage than the ledger assumed, which caused 13.6% false waves against Crazy.
    3. The bench's own accounting was wrong: shots fired as a robot hit 0 energy are often still seen.
- **Code review round.** An automated review found five real edge cases: shots after missed scans not being surfed, braking over a scan gap mistaken for a wall hit, shots fired while striking a wall, two counters missing from the round record (RES-5), and greedy bench matching. All five are fixed and tested.

Result, with the review fixes: 43.7% ± 4.6 against Shadow, flat within noise. Every one of the 875 sample-bot rounds was won, 8 of 12,144 inferred waves were false, and skipped turns fell from 73 to 57.

## S3: remember each opponent

S3 gives Hadur a memory: one small profile per opponent, kept in Robocode's data directory and loaded on the first scan of every battle. It records how the opponent shoots (hit rates by distance and by whether we move, its power choices), how it moves, how our guns did against it, and each battle's outcome. By design nothing reads it yet. S3's gate was to store and reload memory safely without changing how Hadur fights, and S4 is where the memory drives decisions.

- **One profile per lineage (MEM-1).** Versions and duplicate markers are stripped, so `abc.Shadow 3.84 (2)` shares `abc.Shadow`'s profile. The profile loads before that tick's orders are made.
- **Folded each round, saved each battle (MEM-2, MEM-3).** The core collects the round's shots, hits and scans and folds them in when the round ends. The adapter saves at the end of every round Hadur survives, as a checkpoint, and at the battle's end.
- **Damage never spreads (MEM-4, RES-3).** The file format is hand-written with a CRC-32. A bad file becomes "a stranger" plus a counted failure. Robocode forbids renaming files, so a save writes a copy first and deletes it last; a robot killed at any byte keeps a loadable profile. Tests kill a save at every byte of the file.
- **Within quota (MEM-5).** Above 90% of the 200 KB quota, the least recently fought profiles lose their bulky seeds first. A profile is about 300 bytes today.
- **Duels only.** A melee battle never touches the store.

The bench found two costs of memory, and both were fixed before merging:

1. **Skipped turns on the first scan.** Loading took 7 to 10 ms, and almost all of it was Java setting up each string join on first use. The robot is now compiled to join strings the old way, and the file work that needs no opponent name happens before the first tick. The first scan now costs about 0.3 ms, and round-0 skips, present since 2.1, are gone: 15 skipped turns in the cold bench against 18 before S3.
2. **Writing from a dead robot.** A robot that stops to write a file as it dies stays in the round longer. The enemy kept shooting it and its last bullets refunded it energy. Only the bench noticed, as 1.5% of Shadow's shots missed instead of 0.4%. Checkpoints are now written only when Hadur survives the round.

Result: 45.1% ± 8.9 against Shadow cold, and every sample-bot round won. Over five consecutive battles with memory kept, Shadow is 47.1% ± 9.8, flat from battle to battle as expected. Every profile saved and reloaded (24 of 24 warm starts), with 0 memory failures.

## S4: recognise the opponent and adapt

S4 is the first stage where memory changes play. When a stored profile is found on the first scan, Hadur reads it before making that tick's orders. A stranger, or a profile with too little evidence, is played exactly as before, so the recorded replay battles still reproduce bit for bit.

- **Tiers with a margin of error (DIAL-1).** Every rate in the profile is now an estimate with an Agresti-Coull 95% margin, and a tier is named only when the margin is at most 3 points; otherwise it stays unknown ("T?"). The gun tier reads a *normalised* hit rate: each of the opponent's hits is weighted by how small Hadur looked from where it fired, so a close-range brawler and a long-range sniper are compared fairly. The artifact's bounds put Shadow (normalised 9.5%) in the middle, so the bounds were set from the bench logs to 2, 4.5 and 7%: sample bots are T0 and Shadow T3. The movement tier reads our guns' ratings: M0 when the main gun hits a quarter of the time, M3 when both guns stay under 10%, and M2 when the anti-surfer gun clearly leads.
- **An opening book (ADAPT-1, DIAL-2).** The opening is a pure function of the profile, so the same profile always gives the same opening; an architecture test keeps the clock out of it. Against M0 and M1 movers Hadur opens with the main gun, and against M2 and M3 with the anti-surfer gun, instead of waiting nine waves for the virtual guns to decide. Against a T3 gun it switches on the flattener from the first wave. The opponent's remembered hit rate becomes the surfing prior while live data is thinner than the profile.
- **Seeds (ADAPT-3).** A profile now keeps up to 600 gun and 300 surf samples, quantised to 16-bit values (about 20 KB per profile). They are replayed 50 a tick at half weight, so the first waves of a battle already have neighbours to aim and dodge by, and live samples outweigh them.
- **Live evidence wins (RES-4).** Once the live estimate is tight (margin at most 5 points) and disagrees with the profile beyond both margins, the seed loses 1/20 of its weight on each disagreeing wave, and the opening or prior is dropped. In one bench battle Shadow's live hit rate climbed to 12.5% against a profile of 9.5%, and the surf seed faded as designed.

The bench found one real bug before merging. Robocode charges a robot's quota for every byte written but refunds nothing when a file is deleted, so the crash-safe save (write a copy, delete it later) leaked quota, and with 20 KB seeds 38 saves failed within a few battles. A delete now empties the file first, which Robocode does refund; a test simulates the quota rules.

Result: 44.3% ± 5.5 against Shadow cold and 45.0% ± 10.3 over five warm battles (43, 51, 56, 39 and 36%), against 45.1% and 47.1% at S3. Against Saguaro, the bullet shielder, three warm battles gave 73.4% ± 7.0 (76, 70 and 74%), in line with the 72.4% the shield counter reached before S4; its profile reads T3/M0, so the opening is the main gun. Every sample-bot round was won both ways, the opening book picked the main gun in every warm battle after the first, and there were 0 memory failures. No gain from memory against Shadow is measurable yet. The cold run's skipped turns (283, against 15 at S3) came on a loaded host: 104 of them came in one stall on a single tick, and turn times on sample bots were twice the warm run's. The warm run, which does strictly more work, skipped 146 turns, 72 of them in one stall, and 12 against Shadow.

## S5: press when ahead

S5 replaces 1.20's fixed 650 px with a distance controller, and adds a power policy and an endgame. The S4 benches were re-run first, on the same host, as the baseline: Shadow 45.5% ± 6.0 cold and 44.0% ± 4.5 warm.

- **A distance controller (DIST-1, DIAL-1).** Hadur keeps the last 100 shots of each side as rolling hit rates. On each enemy wave, while ours leads theirs by 5 points beyond the margin of error, the target comes in 25 px; while theirs leads by 5 points, it goes back out. A stranger starts at 650 px, so an unknown bot meets 1.20's distance until the evidence says otherwise; a profile's gun tier starts it closer (T0 at 400 px, T3 at 550 px).
- **The bench moved the floor from 150 to 400 px.** At 150 px, sample bots' head-on guns hit Hadur often enough to take 0.4-2 points of score share off it, even though rounds ended a third sooner. At 300 px a little was still lost; at 400 px every sample bot's share was back at its S4 level. A first version also let one cold battle against Shadow walk in to 175 px on noise, so coming in now needs the lead to be 5 points *after* subtracting its margin.
- **Full power (POW-1, POW-2).** Against a gun the profile rates T0, or while this battle shows Hadur hitting a certain 20%+ and being hit a certain sub-10%, every shot is power 3, capped at what kills. Landing power 3 refunds 9 energy, so against a gun that misses it pays for itself. Neither applies while Hadur has 12 energy or less.
- **Finish and ram (END-1, END-2).** When the enemy is under 16 energy, Hadur has over 40, and the enemy's gun (estimated from its shots) is hotter than Hadur's, the target drops to 150 px, where any gun hits. A disabled enemy is rammed.

Result: against Shadow, 46.3% ± 4.5 cold (bullet-damage share 37.9% ± 1.0, survival share 56.6%) and 48.5% ± 2.5 warm (survival 62.4% ± 4.1), against 45.5% and 44.0% for S4. The gate's second half holds: survival share against the T3 opponent did not fall. Its first half cannot be shown yet: the bench has no T1 or T2 opponent, and the sample bots (T0) already sit at 99-100% bullet-damage share. What moved against them is kill speed: Crazy's rounds fell from 459 to 399 ticks, Walls' from 238 to 213 and SpinBot's from 279 to 266, with 0.3-3 more damage dealt per round. Against Shadow the controller mostly stays out: cold, no lead is certain enough to come in, and warm the T3 opening at 550 px walked back out to 650 within a few rounds.

## S6: be harder to hit

S6 goes after the other half of the damage exchange: Shadow's hits on Hadur.

- **Bullet shadows (MOVE-1).** Hadur follows its own bullets in flight. For each enemy wave, it computes every firing angle whose bullet would meet one of ours, as the engine moves bullets: straight segments, all bullets before any robot. The engine moves bullets one at a time in a random order each turn. So some angles meet in every order (a certain shadow), and some meet only when one bullet happens to move first (a possible shadow, counted as half). The surf scales a wave's danger down by the share of Hadur it shadows. The check is ground truth: every one of the 927 enemy bullets that Hadur's own bullets destroyed in the cold bench fell inside a shadow it had computed. It took three rounds of fixing the geometry against the engine's truth logs to get there (35%, then 83%, then 100%).
- **Go-to surfing, tested and kept in reserve.** Instead of the three options (forward, stop, back), Hadur can pick the safest point along both orbits and drive to it. As the default it lost the A/B: 51.8% ± 5.1 against 54.8% ± 3.7 for the three options, with their hit rate higher and more ticks over budget. So it is only the second movement change below.
- **Changing movement when it is being hit (MOVE-2).** Against a known opponent, if their live hit rate on Hadur beats what the profile says, beyond the margin of error, the movement changes: first the flattener, then go-to surfing, then 100 px further out. Each change waits for fresh evidence. It fired 8 times in the warm bench, but the warm score was the same with it switched off (54.6% against 55.2%), so it has not yet shown a gain.
- **A tick budget (TIME-1, TIME-2).** The robot measures how long the core took on each tick and hands that in as an event, so replays stay exact. A tick over 70% of an assumed 3 ms allowance sheds work on the next tick. A skipped turn sheds it for the rest of the round. Shedding comes in three levels: surf one wave with no go-to, then halve the KNN neighbours, then stop scoring the virtual guns.

Result: against Shadow, 57.4% ± 5.0 cold (survival share 71.4%, bullet-damage share 44.1%, 125 of 175 rounds won) and 54.6% ± 6.0 warm, against 46.3% and 48.5% for S5. Their hit rate on Hadur fell from 9.9% to 7.9%, and bullet-damage share rose 6 points, the first stage to move it. The sample bots are unchanged at 875 of 875 rounds. The gate's other half, zero skipped turns, is not met: 26 against Shadow and 72 over the whole bench. Half of those fall on the turn a round ends, when the profile checkpoint is written, and the rest look like host stalls, since turn p95 is 1.5 ms. Moving the checkpoint write off that turn is the next thing to try.

## Results by stage

Across stages, Hadur has become more reliable and more accurate. Its score against Shadow held steady until S6, which raised it by 11 points. Each figure is a cold bench: 35 rounds × 5 seeds per opponent, mean ± 95% interval.

| Measure | S0 (1.20) | S1 | S2 | S3 | S4 | S5 | S6 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| Shadow score share | 40.8% ± 8.3 | 46.2% ± 6.4 | 43.7% ± 4.6 | 45.1% ± 8.9 | 44.3% ± 5.5 | 46.3% ± 4.5 | 57.4% ± 5.0 |
| Shadow survival share | 46.9% ± 11.9 | 55.8% ± 10.0 | 53.1% ± 6.4 | 54.0% ± 10.3 | 54.9% ± 8.5 | 56.6% ± 8.8 | 71.4% ± 7.1 |
| Shadow bullet-damage share | 36.5% ± 5.2 | 38.6% ± 3.7 | 36.2% ± 3.5 | 38.0% ± 7.4 | 35.7% ± 3.0 | 37.9% ± 1.0 | 44.1% ± 3.7 |
| Shadow rounds won | 82 / 175 | 98 / 175 | 93 / 175 | 95 / 175 | 96 / 175 | 99 / 175 | 125 / 175 |
| Shadow warm score share | - | - | - | 47.1% | 45.0% ± 10.3 | 48.5% ± 2.5 | 54.6% ± 6.0 |
| Sample-bot rounds won | 872 / 875 | 866 / 875 | 875 / 875 | 875 / 875 | 875 / 875 | 875 / 875 | 875 / 875 |
| Shadow shots found as waves | not measured | not measured | 99.4%, 0 false | 99.9%, 3 false | 99.6%, 2 false | 99.4%, 3 false | 99.8%, 2 false |
| Skipped turns (all opponents) | 44 | 73 | 57 | 15 | 283 (loaded host) | 174 (host stalls) | 72 |
| Faults | not measured | 0 | 0 | 0 | 0 | 0 | 0 |
| Memory failures | - | - | - | 0 | 0 | 0 | 0 |

S6 is the first change in score share outside the noise. Bullet-damage share is still the gap to close: Shadow deals more damage than it takes, though less than before. Sources: [S0](bench/s0-baseline-1.20-cold.md), [S1](bench/s1-2.0-cold.md), [S2](bench/s2-2.0-cold.md), [S3](bench/s3-2.1-cold.md), [S4](bench/s4-2.1-cold.md), [S5](bench/s5-2.1-cold.md) and [S6](bench/s6-2.1-cold.md) bench reports, plus the [S3](bench/s3-2.1-warm.md), [S4](bench/s4-2.1-warm.md), [S5](bench/s5-2.1-warm.md) and [S6](bench/s6-2.1-warm.md) warm runs. S6's A/B runs are [three-option](bench/s6-2.1-shadow-options-cold.md), [go-to](bench/s6-2.1-shadow-goto-cold.md) and [warm without MOVE-2](bench/s6-2.1-shadow-warm-noflavour.md). The S4 re-runs used as S5's baseline are [cold](bench/s4-2.1-shadow-cold-rerun.md), [warm](bench/s4-2.1-shadow-warm-rerun.md) and [sample bots](bench/s4-2.1-samples-cold-rerun.md).

## How the strategy is kept honest

Every strategic claim is backed by a requirement, a test that proves it and a bench number. The build fails if any of the three drift apart.

| Layer | What it guards | Tooling |
| --- | --- | --- |
| EARS requirements | What Hadur must do, stage by stage (28 at S1, 29 with RADAR-1) | [requirements.md](requirements.md) |
| Traceability | Each requirement due by the current stage names a test; unknown tags fail; jqwik tests must use jqwik's own tag, or jqwik silently skips them | RequirementsTraceabilityTest |
| Architecture | No Robocode, randomness, threads, reflection, I/O or clock in the core; the ledger may depend only on physics | ArchUnit |
| Properties | Physics equals the engine's bit for bit; the ledger recovers exact shot power under any mix of events | jqwik |
| Behaviour | One feature per requirement group, each scenario tagged with its ID | Cucumber |
| Replay | Real recorded battles reproduce the live robot's orders exactly | ReplayTest |
| Bench | Score, survival, damage, faults, wave fidelity against ground truth | hadur-bench |

At S6 the build runs 380 core, 5 robot and 12 bench tests, none skipped, and all 41 requirements due by S6 are covered. GitHub Actions runs `mvn verify` on every push; while Actions is off, stage PRs merge on a local `mvn -B verify` pass.

## Release 2.1: fight melee too

The Hadur 2 plan is a duelist, and S7 was to cut melee. To enter the MeleeRumble (10-robot
free-for-alls, 1000x1000), 2.1 ports the 1.x melee brain into the core instead. It runs
while two or more opponents are alive (MELEE-1). The radar sweeps toward whichever
opponent was scanned longest ago (MELEE-3). Movement goes to the least risky nearby point,
where risk means opponents' energy over distance squared, walls, corners, crossfire and
few escape routes (MELEE-4). The target is the cheapest kill the gun can reach quickly
(MELEE-5), hit with circular or linear aim (MELEE-6), and stale targets are not fired on
(MELEE-7). Hadur stays out of fights between two others (MELEE-8). When one opponent is
left, the duel takes over from a clean slate (MELEE-2). The jar also drops to Java 11 so
every rumble client can load it (REL-1).

| Melee bench (35 rounds, 1000x1000) | Hadur's mean place of 10 | Score share |
| --- | --- | --- |
| 9 sample bots, 3 battles | 1.0 | 23.0% |
| 9 established melee bots, 5 battles | 4.4 | 10.1% |
| 9 strong bots (Diamond, Shadow, ScalarR, ...), 3 battles | 5.7 | 8.6% |

Against real melee bots Hadur is mid-field: it survives reasonably but does about half the
bullet damage of the leaders, because its melee gun does not learn. A learning melee gun
and shot dodging in the melee mover are the obvious next bets.

## S7: say what it is, and ship it

S7 changes no strategy. The plan said to cut melee in S7, but release 2.1 had already put the 1.x melee brain into the core for the MeleeRumble, and it only runs while two or more opponents are alive, so Leigh chose to keep it. S7 rewrote the README around what the robot does now, stage by stage and requirement by requirement, and refreshed the telemetry reference, the architecture diagram (the shield package) and the rumble entry guide, which now covers the 1v1 RoboRumble as well as the MeleeRumble. The version is 2.2. With GitHub Actions not running jobs, 2.2 was built and checked locally and entered in both the RoboRumble and the MeleeRumble from a Google Drive link (docs/rumble-submission.md); the `v2.2` tag and GitHub release wait for Actions. A last docs pass added docs/testing.md, which describes each test layer and the traceability check.

## The melee extension (M0 to M6): release 3.0

After 2.2, the Melee Extension Plan rebuilt the melee half while keeping Hadur a duelist: the duel's sources are pinned by a hash (`DuelIdentityTest`), and a gate decides each tick which half drives, failing closed to the duel on a sentry or a melee fault (M0, M1). M2 rebuilt the sensing: a radar that keeps spinning with four or more alive, and shots read from opponents' energy drops. M3 replaced the movement with minimum risk over 160 points, the closest-robot term and virtual bullets from those shots; survival on the reference field rose from 33 to 55. M4 replaced the gun with a learning field gun that aims at every opponent at once, and M5 added melee memory and the hand-off of the last opponent's profile and shots to the duel.

M6 was tuning. A sweep of the movement weights at 10 seeds (the bench's noise is about 2 APS at 5) found them at a local optimum; the virtual bullets matter most (without them APS drops 3). On the reference field Hadur survived second best but dealt the least bullet damage of the strong bots, and most of that was the posture holding fire and cutting power; dropping that raised damage by about 15% at the same APS, and 3.0 keeps it as the simpler rule (MGUN-5).

| Melee bench, cold, 1000x1000 | 2.2 | 3.0 |
| --- | --- | --- |
| Reference field, APS | 37.9 | 52.7 to 54.6 |
| Reference field, survival | 32.6 | 59.5 to 63.4 |
| Challenge field, firsts of 100 | 33 | 72 |

The plan's last gate, reference APS 60, is not met. The next levers are the radar (turning it with the gun and body, an arc sweep, as the scan gap is still 10 to 11 ticks) and a warm hand-off bench, so the 1v1 profile at the hand-off can be measured.

## The RoboRumble climb plan (R0-R5)

3.0 placed 64th of 1,216 in the 1v1 RoboRumble on 2026-09-28. The [climb plan
artifact](https://claude.ai/artifact/RrAnDpngzZjcf9hYL3pLcW) reads that placement against
the bench's own results and stages six releases (R0-R5) to close the gap, each still bench-
gated and EARS-traced like the duel and melee plans. Stage PRs on this plan merge without
waiting for review, per standing instruction, once CI is green and any bot review findings
are addressed.

### R0: measure the climb itself

Before changing the robot, the bench needed to measure against the rumble population, not
just the sample bots. `hadur-bench` gained a stratum-weighted APS estimate over a sampled
slice of the live rankings (BENCH-1), a paired-seed A/B mode that cancels a seed's own noise
between a candidate and a baseline jar (BENCH-2), and per-opponent diagnostics for both jars
in that comparison (BENCH-3). This is bench tooling only; it changes nothing the robot does.

### R1: client reliability

R0's bench runs on one fixed machine; a real RoboRumble client does not. R1 hardens the
robot for that gap, closing three of the open items below:

- **TIME-3**: the adapter's fixed 3 ms tick-allowance guess is now only a starting point.
  The first turn a client's engine actually skips, the core learns the real allowance from
  the tick that caused it and uses that number, not the guess, for the rest of the battle.
- **TIME-4**: round-end checkpoints now write seeds only on every tenth surviving round (and
  always at the battle's end); the other nine write stats only, cutting the roughly 44 KB a
  full checkpoint cost to what the stats alone need.
- **TIME-5**: the adapter runs one tick through a throwaway core before the real battle
  starts, so class loading and JIT warm-up land there instead of on the first real tick.
- **MEM-6**: audited, not changed. `ProfileLibrary`'s eviction already never stops short of
  freeing what its 90%-of-quota target needs unless every other profile's seeds are already
  gone, so a write is only ever skipped once nothing more can be evicted from anyone; a test
  pins the invariant.
- **MEM-7**: the profile codec can now write a profile in any format version back to the
  oldest it still reads, so a client left on a previous release can keep reading what a
  newer one writes across an in-place upgrade.
- **DIAL-3**: found one real bug while auditing every margin comparison for a non-finite
  value: `SeedTrust.diverges` would have read an unmeasurable margin as "no divergence",
  the wrong direction for a seed the core can no longer trust. `Estimate`'s own margin is
  always finite by construction, so this was unreachable in practice, but the guard is now
  explicit rather than relying on that invariant never changing.

### R2: full share vs weak and mid-table bots

R2 targets the ~900 bots below rank 300, where a cheap policy fix is free against the top 10
but adds up broadly: full power against more of the gun tiers, an energy-aware choice when no
tier rule applies, never wasting energy on an already-decided kill, and a clean response to a
robot that just drives at us.

- **POW-3**: full power now also applies to a T1 gun (not just T0), gated by range (450 px)
  rather than unconditionally, since a T1 gun's threat is real enough at distance to keep the
  range check that POW-1 doesn't need.
- **POW-4**: where no tier or live-rate rule applies but both rates are known within 10
  points, the gun compares its own power against full power by expected value (hit rate times
  damage, less the energy spent) and fires whichever wins — never below its own choice.
  Robocode's damage curve is convex, so the better of the two ends is always the answer;
  no power in between is ever worth checking. (Review on PR #61 caught the margin set too
  tight: a real 100-outcome rolling window can't close to 5 points anywhere full power
  actually wins, so the rule read as covered by its own tests but could never fire live.)
- **END-3**: the opposite kind of override. While a single shot at some legal power would
  kill on a hit, the gun caps its power at the least power that still does, so a decided
  fight spends no more energy than it needs to end. (Review on PR #61 caught the first cut
  setting it outright instead of capping, which could replace a low-energy gun's own
  affordable choice with a kill power it couldn't afford and cost the shot entirely.)
- **RAM-1**: a robot whose own speed toward us is 6 px/tick or more for ten scans within
  250 px is a rammer, profile or no profile. Hadur now meets it with power raised toward 3.0
  (capped and gated exactly like the other full-power rules, so it never bids more than it
  can afford) and a reversed orbit side, so a charging enemy can't count on the same
  predictable path every tick. (Review on PR #61 caught two bugs here too: the closing rate
  was the raw change in distance, which our own movement and a missed scan could both throw
  off, fixed by reading the enemy's own velocity instead; and the power override ignored
  affordability entirely, fixed by gating and capping it the same way POW-1 through POW-4
  are.)
- **WAVE-3**: a shot fired as the enemy strikes a wall was already detected, but the split
  between wall damage and bullet power there is a guess, not a clean read (Firestarter's
  8.6% false waves). That wave is now marked uncertain and surfed at half weight, rather than
  trusted like an unambiguous one.
- **TIER-1 is not in this release.** Calibrating the T1/T2 gun-tier bounds needs real
  mid-table opponents to bench against, and every bot benched so far reads either T0 or T3 —
  issue #53 tracks getting that bench run. It lands once that data exists, not before.

## The DrussGT route (D1 to D6)

The plan is [druss-route-plan.md](druss-route-plan.md); the requirements are in [requirements.md](requirements.md#the-drussgt-route-d1-to-d6).

<a id="d1"></a>

### D1: power by the lead

Release 3.8. Against DrussGT both guns hit below break-even, so each shot costs its owner more energy than it takes, and the robot firing the lighter bullet keeps its lead (D0's probes, `docs/bench/d0-drussgt-probes.md`). D1 teaches the duel that, and nothing else yet.

- **POW-11** keeps battle-long shot and hit counts for both robots in three power classes and overall, with margins, and the `R` record gains twelve appended fields (`oS0 oH0 oS1 oH1 oS2 oH2 tS0 ... tH2`).
- **POW-7 to POW-9** fire the minimum power while both robots are certainly below break-even and Hadur is level or ahead, and 1.20's default power (without its cubic power-down) when behind by more than 3 with more than 10 energy, or while both exceed 60. POW-1 to POW-5, RAM-1 and END-3 keep precedence.
- **POW-10** never holds a shot Hadur can pay for: it is lowered to what energy allows. The END-4 hook is left for a later stage.
- **ADAPT-5** stores the verdict in the profile (format version 3, so `-v3.hp` file names; a version 2 profile loads its stats only).
- **RES-14** ends duress 300 ticks after the last skipped turn, and retires RES-9.
- **Re-recorded fixtures:** `abc.Shadow_3.83c`, `warm-abc.Shadow_3.83c` (the second battle's transcript, `-2`), `duress-sample.Walls` and `melee-sentry`, with the bench `--record` commands in `hadur-bench/README.md`. The other nine did not diverge in orders and were kept.
- **Review fixes (PR #98):** the fired power is carried on the firing wave (POW-10), enemy hits are counted from the `HitByBullet` event (POW-11), duress exit discards both managers' outstanding waves (RES-14), the RES-14 clock reads the skipped tick the event carries, and a nearly dead trailing robot fires the minimum power (POW-8). The first of these changes orders wherever the shot's power differs from the tick's wave, so eight fixtures were re-recorded again (`abc.Shadow_3.83c`, `warm-abc.Shadow_3.83c`, `duress-sample.Walls`, `melee-samples`, `melee-sentry`, `sample.Tracker`, `sample.Walls` and the team pair `m1`/`m2`), their telemetry snapshots rewritten, and the duel and conductor pins and `duel-sources.sha256` re-pinned.
- **Re-snapshotted:** the telemetry snapshots of all thirteen fixtures (`-Dhadur.replay.snapshot=write`), because the `R` record is longer.
- **Re-pinned:** `pins/kernel.sha256`, `pins/duel.sha256`, `pins/conductor.sha256` (`-Dhadur.pin=kernel,duel,conductor`) and `duel-sources.sha256` (`-Dhadur.duel.snapshot=write`). The melee and team pins did not change.
- **Gate** ([d1-gate.md](bench/d1-gate.md)), paired against 3.7: DrussGT **+12.0 ± 4.3** points (48.2% against 36.2%, 20 battles), the top 10 +6.7 on average (Firestarter +21.3, Diamond +14.1, Knight +11.6), the weak set level. The rule pays against surfers whose power follows ours down, not only DrussGT.
<a id="d2"></a>

### D2: shield openers caught, the last shot kept

Still release 3.8 (D1 and D2 ship together). Two small rules and one engine check; `hadur.druss.stage` was `D2` when this stage was built (it is `D5` once D5 has merged: D5 is the highest stage and every D row is due).

- **SHIELD-3** latches the shielder flag on the first of our bullets destroyed by an enemy that has not moved since the round began, instead of waiting for SHIELD-1's four in twenty. The flag goes into the profile, so battle two starts with it and with SHIELD-2's aim jitter on. The profile stays at format version 3 (not yet released): the verdict byte D1 added is now a set of flags, bit 0 ADAPT-5's verdict and bit 1 the shielder, so the D1 golden file loads unchanged and no new byte is added.
- **SHIELD-4** fires 3.0 at a latched shielder that has not moved in the last 10 ticks, with END-3 still capping it. This is the part of the probe that fired 3.0 at a still target; the plan notes the gain is not yet established, so D2's gate is the bench, not this entry.
- **END-4** holds the shot that would leave Hadur less than 0.3 energy above an enemy that can no longer fire. It holds only while Hadur is ahead (when level or behind the shot goes): a deliberate narrowing of the requirement's wording, described in the requirements notes.
- **Engine check.** `hadur.bench.InactivityCheck` ran two tiny robots that never hit each other through Robocode 1.9.5.6: the one with more energy survived the inactivity penalty at every gap tried (0.1, 0.3, 1.0 and 3.0); with equal energy both died on the same tick. A gap of 0.1 is enough, so the 0.3 margin is conservative.
- **Re-recorded fixture:** `warm-abc.Shadow_3.83c` (the second battle's transcript, with the `-2` command in `hadur-bench/README.md`): SHIELD-3 latches on Shadow in round 0 of the warm battle. The other twelve fixtures did not diverge, and their telemetry is unchanged.
- **Re-snapshotted:** the telemetry snapshot of `warm-abc.Shadow_3.83c` only.
- **Re-pinned:** `pins/kernel.sha256` and `pins/duel.sha256` (`-Dhadur.pin=kernel,duel`) and `duel-sources.sha256` (`-Dhadur.duel.snapshot=write`). The conductor, melee and team pins did not change.
- **Changed scenario:** `shield.feature`'s "a bullet shot down by accident changes nothing" now has the enemy stir first, since against a still enemy one bullet is SHIELD-3's evidence.
- **Gate** ([d2-gate.md](bench/d2-gate.md)), paired against D1 (3.8.1): DrussGT **+1.0 ± 3.8** points (47.6% against 46.6%, 20 battles), level and not below. The stage jars were built on the D1 base before D5 and T1 merged. The top-10 and weak sets are measured once for the whole D2 to D4 stack ([stack gate](bench/stack-gate.md): top 10 +3.5 ± 3.2, weak set level). The report shows no direct evidence for SHIELD-3 or SHIELD-4 against DrussGT, which does not stand still.

<a id="d3"></a>

### D3: light bullets get their own aim

Still release 3.8; `hadur.druss.stage` was `D3` when this stage was built (it stays `D5` with D5 merged). One requirement and one gun.

- **GUN-5** rates the virtual guns separately for bullets under 0.2 and for the rest, and fires the gun rated highest for the class of the shot about to be fired. The duel decides power before it aims (D1), so the gun wave already carries the class when `GunController.aim` runs. Each class keeps GUN-1's decayed ratings and margin gate; the combined table of D2 is now the rest class's.
- **The new gun** is `SampledGun`, the probe's sampled aim (one neighbour of the hybrid view picked by a golden-ratio phase, its guess factor scaled by the escape angle). It competes for light bullets only, so it is used where it rates highest rather than unconditionally as in the probe. The phase is core state and advances with real shots, so replays are deterministic.
- **Not kept in the profile:** the format and its size are unchanged; see the D3 notes in `docs/requirements.md` for why.
- **Re-recorded fixtures:** none. All 68 replay checks pass unchanged: the fixtures' opponents are fought at ordinary power, where the rest class's table is what D2's single table was, and the sampled gun is never fired before it is rated best.
- **Re-snapshotted:** nothing.
- **Re-pinned:** `pins/duel.sha256` (`-Dhadur.pin=duel`) and `duel-sources.sha256` (`-Dhadur.duel.snapshot=write`). The kernel, conductor, melee and team pins did not change.
- **Gate** ([d3-gate.md](bench/d3-gate.md)), paired against D2 (3.8.2): DrussGT **+0.5 ± 4.2** points (45.8% against 45.3%, 20 battles), level and not below. The stage's own measure is **not met**: Hadur's light-bullet hit rate is 7.63% ± 0.18 against 7.60% ± 0.13 for D2 (paired +0.03 ± 0.21), where the plan's probe reached 9.3%; DrussGT's light bullets hit 10.25%. The `R` records do not show how often the sampled gun was chosen. The top-10 and weak sets are measured once for the whole D2 to D4 stack ([stack gate](bench/stack-gate.md)). D3 merged on that stack result, its own measure unmet.

<a id="d4"></a>

### D4: bullets are armour

Still release 3.8; `hadur.druss.stage` was `D4` when this stage was built (it stays `D5` with D5 merged). Two requirements: movement publishes where its plan is, and the gun weighs the shadow of each candidate shot.

- **MOVE-8** publishes, for each enemy wave in the air that the surf scored, the absolute bearing interval from the wave's source that would hit us where the chosen plan puts us when the wave arrives (the equivalent of a guess-factor interval, with no escape-angle assumption), and the surf's own chance that a bullet fired inside it hits. It is recorded as the surf scores its options, so it costs no extra prediction, and it is withdrawn on every tick the surf does not drive.
- **GUN-7** picks the firing angle among at most 13 candidates (the gun's own angle, four offsets of 0.45 and 0.9 half-widths, and up to eight of the main gun's own neighbour angles within two half-widths) by `P(hit) * damage + damage avoided`. The avoided damage is the share of the published interval a candidate bullet's shadow newly stops (`BulletShadows`' geometry, over what our bullets in flight already stop), times the surf's chance of a hit there and the enemy bullet's damage. The gun's own angle wins every tie. The shadow term is `GunController.SHADOW_AIM`, shipped `true`; with nothing to shadow the angle is D3's exactly.
- **Not done:** the other virtual guns' angles are not candidates (they are computed only when a real bullet leaves, and each is a KNN search), and nothing here uses a per-wave fraction of our bullets' certain and possible shadows beyond what MOVE-1 already counts.
- **Cost:** `hadur2.core.duel.ShadowAimBench` (test scope, run by hand) times one aiming tick with 400 learned samples, two enemy waves in the air and two of our bullets in flight: the plain aim took 4.8 ms (the machine was running a gate bench, so only the difference means anything) and the shadow term added 0.09 to 0.10 ms, about 2%, to each aiming tick (two passes of 20,000 aims: 88.0 and 99.4 microseconds). The gun aims on at most four ticks per shot (within three ticks of a cool gun), so the term adds under 0.4 ms per shot and nothing on ticks that do not aim; Hadur's skipped turns were not expected to rise. The gate showed otherwise: slow ticks rose tenfold against D3, so the review fixes shed the shadow term at TickBudget level 2 and up (below).
- **Re-recorded fixtures:** eleven of thirteen diverged, because an enemy wave is in the air for most of a duel, so the shot is shifted wherever a shadow is worth more than the hit it costs: `sample.SpinBot`, `sample.Tracker`, `sample.Crazy`, `sample.Walls`, `sample.RamFire`, `abc.Shadow_3.83c`, `warm-abc.Shadow_3.83c` (the second battle's transcript), `duress-sample.Walls`, `melee-samples`, `melee-sentry` and `melee-handoff` (the three melee fixtures end in duels, or run one with sentries about). Recorded with the commands in `hadur-bench/README.md`, one `--record` run each, on a machine running a gate bench. The two team fixtures did not diverge.
- **Re-snapshotted:** the telemetry of those eleven.
- **Re-pinned:** `pins/duel.sha256` (`-Dhadur.pin=duel`) and `duel-sources.sha256` (`-Dhadur.duel.snapshot=write`). The kernel, conductor, melee and team pins did not change.
- **Gate** ([d4-gate.md](bench/d4-gate.md)), paired against D3 (3.8.3): DrussGT **+1.2 ± 4.3** points (47.3% against 46.1%, 20 battles), level and not below. Its own measure moved the right way but short of the plan's level: DrussGT's hit rate **9.9% against 10.2%** (the plan looks for a point lower), while ours rose from 7.2% to 7.5%. Slow ticks rose from 2,822 to 27,900 and skipped turns from 564 to 616 over 700 rounds.
- **Stack gate** ([stack-gate.md](bench/stack-gate.md)), D4 (with D2 and D3) against D1 on the plan's other sets: top 10 at 3 seeds **+3.5 ± 3.2** points (20 of 30 pairs up; BeepBoop +6.9, ScalarR +6.8, DrussGT +6.6), weak set at 2 seeds **-0.1 ± 0.6**, skipped turns level (746 against 737). D3 and D4 merged on this (PR #104).
- **Review fixes (PR #104):** the shadow aim uses the surf's plan only when it was published on the previous tick, so a tick the shield, duress, ram or mirror drove supplies none (the surf runs after the aim within a tick; the one-tick lag on a reversal tick is accepted, see the PR); a shield-mode attack is rated in the class of the power it actually fired at and advances the sampled gun's phase; `SampledGun` drops zero-weight seeds and picks in proportion to weight; and `TickBudget.shadowAim` sheds the shadow term at level 2 and up. Five fixtures re-recorded (`sample.Crazy`, `sample.RamFire`, `duress-sample.Walls`, `melee-samples`, `melee-handoff`), duel pins re-pinned. These fixes came after the gates.

## D5: the shield list (DrussGT route)

Hadur opens each round in shield mode against the opponents on a list of its own (SHIELD-5): it sits
still, predicts the enemy's bullet from head-on predictors and fires a lighter bullet that meets it
mid-air (`hadur2.core.shieldmode`, ported from the c6d4d7a prototype). SHIELD-6 bounds the cost: once
the enemy's bullet damage exceeds what would hold our score share at 85%, shield mode is off for the
rest of the battle (allowance 15/85 * (60 * the battle's rounds + damage dealt), about 370 for 35 rounds). Per-round exits
(close, rammed, unpredicted, outhit, quiet, duress) hand the round back to the normal duel. The list
ships in robot 3.8 with 14 names, chosen from BENCH-11's paired probe (`--shield-probe`,
[d5-probe.md](bench/d5-probe.md), gate in [d5-gate.md](bench/d5-gate.md)): the 8 it shows shield mode
winning against and 6 more with a mean gain of 9 points or more. It ships as a class, `hadur2.ShieldListData`, because Robocode's
sandbox kills a robot that reads a resource of its own jar. Requirements are in the D5 subsection of
`docs/requirements.md`.

- **Gate** ([d5-gate.md](bench/d5-gate.md)): 46 panel robots, 3 seeds of 35 rounds, shield mode on against off, paired: weighted mean **+2.9 ± 2.7** points over the panel (stratified APS 86.8 against 83.9). Eight robots win; the list takes those and six more at +9 or better, and leaves off the seven it loses against (Hubris, TimCat, RSK1, ThroxBot, Grofvuil, sample.Fire, OscillatorL). D6 is not built: it stays a research item.

## The Team plan (T1): teammates stop running into each other (3.8)

[team-plan-t1.md](team-plan-t1.md) is the first stage of the Team plan, answering the A5
baseline's two team-only faults: about 440 collisions a round and 884 of our bullets on a
teammate. The cause was that neither mover could see a teammate (the World held enemies
only), the five members shared eyes and so one noise field and one choice of destination, and
the fire lane judged only the moment of firing, though about 92% of the friendly hits were a
teammate entering the lane during the flight.

What changed (WORLD-9, MMOVE-6 to MMOVE-8, WEAVE-7, WEAVE-8): the roster keeps each
teammate's heading and velocity and predicts its position; the melee movement adds an
inverse-square term and a path term for each living teammate, caps its ring by the nearest
one and salts its noise field and opening spot by the member's place in the roster; the
conductor's `TeammateFence` replaces a drive that would run into a teammate within six ticks
by a brake or a reversal, whichever role drives (so the duel's endgame is covered without
touching the pinned duel packages); and the fire lane holds while a teammate's predicted
track crosses it over the time a bullet takes to pass.

Smoke bench, 1200 x 1200, seed 1 (3.7 against 3.8 on the same machine and load):

| | 3.7 | 3.8 |
|---|---|---|
| MyFirstTeam, 10 rounds: teammate collisions | 7,287 | 2 |
| MyFirstTeam, 10 rounds: our bullets on a teammate (engine) | 41 | 7 |
| MyFirstTeam, 10 rounds: score share | 82.1% | 95.8% |
| ConceptA, 3 rounds x 2 seeds: teammate collisions | 1,456 | 0 |
| ConceptA, 3 rounds x 2 seeds: our bullets on a teammate | 48 | 7 |

The first fire-lane slack (1.5 px a tick of flight) left 14 friendly hits in the 10 rounds;
3 px cut them to 7 for 17% more held shots. A smoke is not the gate.

- **Gate** ([t1-team.md](bench/t1-team.md)), `team-gates.txt` against 3.7 (3 seeds x 8 teams x 10 rounds): score share **48.2% against 28.8%** (+19.4, every team up), teammate collisions 101,322 to 65 (-99.9%), our bullets on a teammate 1,015 to 328 (-68%, **short of the 80% bar**), shots held for the lane 5,188 to 19,286 (3.7x), 0 faults, 0 LINK rejects. Merged on score share and collisions; narrowing `TURN_SLACK` and spacing members on a shared target are follow-ups.

## Release 3.8

3.8 ships D1, D2, D3, D4 and D5 of the DrussGT route and T1 of the Team plan; D6 stays
research. The stage gates ran on jars built before the later stages and the review fixes
merged, so the shipped build was benched once against 3.7 ([release-check-3.8.md](bench/release-check-3.8.md)):
DrussGT **+10.5 ± 3.1** points over 10 battles (10 of 10 up), the top-10 set **+7.2 ± 6.3**
over 20 (14 up). Skipped turns against DrussGT rose from 314 to 447 over 350 rounds (the top 10 was 298 against 335), the cost to watch live.
Open items are in `followup.md` under the DrussGT route.

## 3.8 live: the top rose, the field fell

The first full 1v1 pass ([live-3.8.md](bench/live-3.8.md), 6 October 2026, 1,205 of 1,215
pairings) puts 3.8 at **84.58 APS, 29th**, down from 3.7's 85.67 (21st) and 3.4's 85.90 (20th).
Melee rose to **16th** (from 18th) and the team to **12th** (from 32nd of 46). In the 1v1,
Nullstride 2.3.3 took 1st from BeepBoop 2.0.

Compared pairing by pairing with 3.4's full pass, the top 10 rose +5.2 points per pairing,
which is where the DrussGT route was aimed. Everyone ranked 21st and below fell 1.55 ± 0.15,
mostly through lost survival (-2.3), and that costs 1.5 APS. D5's shield list gained live.
Holding 3.4's level outside the top 20 would put 3.8 at about 86.0, 20th. So the next work
fixes the leak against the weak and mid field, and keeps the strategy. A paired bench of the
D1 to D4 stage jars against 3.7 on a large weak and mid set comes first.

## 3.8.5 live: a fifth of the leak back

3.8.5 scopes the DrussGT route to duels Hadur is not already winning on the guns (MATCH-1,
MATCH-2): once the battle's hit rates clearly favour Hadur, shadow-weighted aim and the
one-bullet shielder latch switch off. Its first pass ([live-3.8.5.md](bench/live-3.8.5.md),
6 October 2026, 1,206 pairings) puts it at **84.79 APS, 24th**, up from 3.8's 84.58 (29th).
The gain came where the gate aims, +0.36 per pairing against bots ranked 401st and below, and
the top 10 held. But that is about a fifth of the leak. Against 3.4, 3.8.5 still loses 1.1 APS,
mostly as lost survival (-2) against the weak field. 3.7 was already 0.23 below 3.4, so part of
the leak may predate the DrussGT route. The next measure is a release bisect, 3.4 against
3.5.1, 3.7, 3.8 and 3.8.5, on the bots that lost to 3.4 in both live passes.

## 3.9 live: the rammer trial, 13th

The bisect put the whole leak in 3.4 to 3.5.1, and an ablation put it on RAM-2, the rammer escape:
close-range fighters confirm as rammers, and running from them got Hadur hit two to seven times as
often. 3.9 (RAM-3, the rammer trial) keeps the escape only where the battle's own rounds say it
pays: two escape rounds after confirmation, then whichever arm has the better energy margin.

Its first full pass ([live-3.9.md](bench/live-3.9.md), 7 October 2026, 1,215 pairings) puts it at
**87.15 APS, 13th**, Hadur's best 1v1 score, 0.56 under Tomcat 3.68 in 10th. Melee is 19th and the
team 12th, with no change to their play. The gain over 3.8.5 is +2.32 APS, even across every band
from 51st down (+2.2 to +2.9 per pairing, survival +3), six times the gate's estimate: RAM-2 had
been running from ordinary bots across the field, not only from the 40 live losers. 3.9 now beats
3.4 below rank 150. The PC bench read 3.9 level with 3.8.5 on the same random bots where live
shows +2.1, so the bench cannot yet see a field-wide change like this one.

What is left is about 1.8 APS of persistent shortfall below Hadur's own trend, all below rank 20,
mostly against nano and micro rammers and close-range fighters: Hadur wins the rounds and gives a
fifth of the score away, or loses rounds to simple guns. The overnight plan
(`hadur-bench/plans/overnight-39.queue`) checks those two groups on the bench and tests which live
condition the bench is missing.

The compare pages against Tomcat, Knight and Raven then moved the target. All three score
about a point a pairing more than Hadur against the bots ranked 401st and below, with almost
the same survival, and match or trail Hadur above rank 150: the whole 0.57 is points Hadur
gives away to weak bots in rounds it wins. The close-range group turned out to cost the top 10
nearly as much as Hadur, so the next stage aims at the weak tail first.

The overnight runs (issue #138, `docs/bench/local/2026-10-07_overnight-39-findings.md`) and the
mid-table runs (issue #140, `2026-10-07_nullstride-mid-results.md`) then named the mechanism.
On the weak tail the bench sees the gap to Knight (+1.20): Knight takes 14% less bullet damage
and deals the same, so it is movement against simple guns, not kill speed. The ram fix works
(+5.71 over 3.4 on the rammers; 85% of what they still score is bullets). And in the mid-table,
Nullstride's lead is not being hit: on bots from DrussGT's shield list, switching Hadur's own
shield mode on for everyone gained +8.05 a pairing (22 of 30 up, 5 significantly down), while
off that list it cost about a point. So 3.10 has two stages: first extend Hadur's shield list
bot by bot from a sweep of the 200 remaining list bots in ranks 51-700
(`hadur-bench/plans/shield-sweep.queue`), a data-only change that cannot touch off-list bots;
then movement against simple guns, gated on bullet damage taken on the tail.

## 3.10: the shield sweep list

The sweep (issue #146, `docs/bench/local/2026-10-08_shield-sweep.md`) ran shield mode on against
off on the 200 remaining DrussGT-list robots of ranks 51-700: +4.70 over the 109 mid-table ones,
-2.40 over the 91 from 401-700. Robot by robot, 64 cleared the D5 rule, and one more was open with
a mean gain over 9; with the 18 from the #140 run, 3.10 adds 83 robots to the list (97 in all).
On the sweep's own seeds they are worth +0.80 APS, +0.76 shrunk for picking winners on 8 seeds.
A list entry names one robot by its exact version, so every other robot meets 3.9's play; the
gate (`hadur-bench/plans/candidate-310.queue`) reruns the 83 on fresh seeds (`--seed-base`,
BENCH-72) and checks the top 20 and the tail are level.

## 3.10 live: a rough pass, and a bench that crippled 11 bots

3.10's first pass read 86.42, 20th, 0.73 under 3.9. Off the shield list 3.10 is 3.9's code, and
there the pass ran 1.35 a pairing lower (-1.25 APS): a tail of collapsed battles (26 against
3.9's none) of the kind a loaded host produces. The list itself added +0.51 APS, two thirds of
the gate's +0.78. The same reading closed issue #151's leak-38 puzzle: on a typical pass the live
difference is what the bench said. A Windows-only bench defect had crippled 11 opponents since
2026-10-06 (a JDK service lookup the security manager punishes); BENCH-83 and BENCH-84 fix it.
Every opponent is now classed (`docs/bench/opponents-3.10.tsv`): the room against the 8th to
11th bots is +0.76 APS, all below rank 400, and 35 of the gaps are ones the bench reproduces,
mostly rammers ([live notes](bench/live-3.10.md), L-45 to L-47).

## What comes next

Every EARS requirement up to R2, bar TIER-1 (above), is implemented and traced. R3 to R5
(gun vs surfers, movement, and a memory decision) continue the climb plan.

Open items carried forward, each tracked as a [GitHub issue](https://github.com/lgriffin/Hadur_Robot/issues):

- **Read the real rankings.** 3.0 is entered in both rumbles (replacing 2.2); once a few thousand battles are in, the rankings say more than the bench can, and the MeleeRumble rating is the melee plan's last gate.
- **Melee APS is short of 60.** The radar and a warm hand-off bench are the next levers (above).
- **Skipped turns** are 72 per cold bench, not the zero S6 aimed for. Half fall on a round's last turn, when the profile checkpoint is written; R1's TIME-4 cuts what that write costs.
- **MOVE-2 has not shown a gain.** Warm, it scored the same switched on or off. Its baseline averages whole battles, while the live window sees a gun that has already learned; a baseline from the same part of past battles would be fairer.
- **Memory has not clearly paid off against Shadow.** S6's warm run (54.6%) is below its cold one (57.4%), within noise. The T1 and T2 bounds still have no bench opponent in them (issue #53).
- **Aggression against mid-table bots is unmeasured.** A few RoboRumble bots between the sample bots and Shadow would calibrate T1/T2 (TIER-1) and let R2's own gate run against the strata it targets.
- **The ledger's remaining ambiguity** is smaller now that a wall-hit-coincident shot is flagged (WAVE-3), but still there: such a shot can be 0.5 off in power, and 0.2% of Shadow's visible shots are still missed.
