# Hadur 2: evolution of strategy

As of 2026-09-27 (after S5). The living copy is the [Claude Doc](https://claude.ai/code/artifact/bc581157-b352-49c9-acaf-9f77035202c5); this file is its snapshot for evaluation.

## Summary

Hadur has moved from a hard-to-test dual-mode robot (1.20) to a 1v1 duelist with a Robocode-free core and a measured bench. It now infers enemy shots almost exactly. Against Shadow 3.83c, the reference duelist, 99.4% of the shots a scan could reveal become waves and none of its waves are false. It now wins every round against the sample bots.

Since S3 it also remembers each opponent across battles, crash-safely and within Robocode's data quota. Since S4 it reads that memory: it names the opponent's gun and movement tiers, picks an opening gun and surfing prior from them, replays stored samples into its guns and surfing at half weight, and lets live evidence overrule the profile when they disagree.

Since S5 it also presses when it is ahead: a distance controller that comes in while Hadur clearly out-hits the enemy, full-power shots against guns that cannot hit it, and closing in to finish or ram a beaten enemy.

Score share against Shadow has not moved outside the noise: 40.8% at 1.20, 46.2% at S1, 43.7% at S2, 45.1% at S3, 44.3% at S4 and 46.3% at S5 cold. Warm, S5 scored 48.5% ± 2.5 against 44.0% ± 4.5 for S4 re-run the same day, with survival share up from 52.6% to 62.4%; that is the first warm result above its cold one, but the intervals still overlap. Against the sample bots S5 ends rounds 5-13% sooner without losing share. S6 is the stage that targets Shadow's hit rate on Hadur directly.

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
| S5 | Aggressive distance and power policies | Next |
| S6 | Unhittable movement, tick budget | Planned |
| S7 | Cut melee, rewrite the docs | Planned |

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

## Results by stage

Across stages, Hadur has become more reliable and more accurate, while its score against Shadow has held steady. Each figure is a cold bench: 35 rounds × 5 seeds per opponent, mean ± 95% interval.

| Measure | S0 (1.20) | S1 | S2 | S3 | S4 | S5 |
| --- | --- | --- | --- | --- | --- | --- |
| Shadow score share | 40.8% ± 8.3 | 46.2% ± 6.4 | 43.7% ± 4.6 | 45.1% ± 8.9 | 44.3% ± 5.5 | 46.3% ± 4.5 |
| Shadow survival share | 46.9% ± 11.9 | 55.8% ± 10.0 | 53.1% ± 6.4 | 54.0% ± 10.3 | 54.9% ± 8.5 | 56.6% ± 8.8 |
| Shadow bullet-damage share | 36.5% ± 5.2 | 38.6% ± 3.7 | 36.2% ± 3.5 | 38.0% ± 7.4 | 35.7% ± 3.0 | 37.9% ± 1.0 |
| Shadow rounds won | 82 / 175 | 98 / 175 | 93 / 175 | 95 / 175 | 96 / 175 | 99 / 175 |
| Shadow warm score share | - | - | - | 47.1% | 45.0% ± 10.3 | 48.5% ± 2.5 |
| Sample-bot rounds won | 872 / 875 | 866 / 875 | 875 / 875 | 875 / 875 | 875 / 875 | 875 / 875 |
| Shadow shots found as waves | not measured | not measured | 99.4%, 0 false | 99.9%, 3 false | 99.6%, 2 false | 99.4%, 3 false |
| Skipped turns (all opponents) | 44 | 73 | 57 | 15 | 283 (loaded host) | 174 (host stalls) |
| Faults | not measured | 0 | 0 | 0 | 0 | 0 |
| Memory failures | - | - | - | 0 | 0 | 0 |

No change in score share is outside the noise. Bullet-damage share is the gap to close: Shadow still deals more damage than it takes. Sources: [S0](bench/s0-baseline-1.20-cold.md), [S1](bench/s1-2.0-cold.md), [S2](bench/s2-2.0-cold.md), [S3](bench/s3-2.1-cold.md), [S4](bench/s4-2.1-cold.md) and [S5](bench/s5-2.1-cold.md) bench reports, plus the [S3](bench/s3-2.1-warm.md), [S4](bench/s4-2.1-warm.md) and [S5](bench/s5-2.1-warm.md) warm runs. The S4 re-runs used as S5's baseline are [cold](bench/s4-2.1-shadow-cold-rerun.md), [warm](bench/s4-2.1-shadow-warm-rerun.md) and [sample bots](bench/s4-2.1-samples-cold-rerun.md).

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

At S5 the build runs 361 core, 5 robot and 11 bench tests, none skipped, and all 37 requirements due by S5 are covered (POW-2 was added in S5). GitHub Actions runs `mvn verify` on every push; while Actions is off, stage PRs merge on a local `mvn -B verify` pass.

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

## What comes next

The remaining 4 requirements are all S6's.

| Stage | Strategic bet | Requirements |
| --- | --- | --- |
| S6 | Be unhittable within the tick budget: bullet shadows, switch movement when it is being hit, cut computation instead of skipping turns | MOVE-1, MOVE-2, TIME-1, TIME-2 |

Open items carried forward:

- **Skipped turns** are 15 per cold bench and are S6's gate (zero). The first-scan skips are gone; the rest are scattered.
- **Memory has not clearly paid off against Shadow.** S5's warm run is the first above its cold one (48.5% against 46.3%), but within noise. The T1 and T2 bounds have no bench opponent in them yet, so they are uncalibrated, and S5's gate cannot be tested on them.
- **Aggression against mid-table bots is unmeasured.** A few RoboRumble bots between the sample bots and Shadow would calibrate T1/T2 and show whether closing in pays against them.
- **Checkpoint I/O grew** to about 44 KB a surviving round with full seeds. If rumble clients prove slow at file I/O, checkpoint only the stats.
- **Damage share against Shadow** is about 37-38%. S5 did not move it; S6 targets their hits on Hadur instead.
- **The ledger's remaining ambiguity** is small. A shot fired as the enemy strikes a wall can be 0.5 off in power, and 0.6% of Shadow's visible shots are still missed and have not yet been examined.
