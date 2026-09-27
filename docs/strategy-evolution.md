# Hadur 2: evolution of strategy

As of 2026-09-27. The living copy is the [Claude Doc](https://claude.ai/code/artifact/bc581157-b352-49c9-acaf-9f77035202c5); this file is its snapshot for evaluation.

## Summary

Hadur has moved from a hard-to-test dual-mode robot (1.20) to a 1v1 duelist with a Robocode-free core and a measured bench. It now infers enemy shots almost exactly. Against Shadow 3.83c, the reference duelist, 99.4% of the shots a scan could reveal become waves and none of its waves are false. It now wins every round against the sample bots.

Since S3 it also remembers each opponent across battles, crash-safely and within Robocode's data quota, though nothing reads that memory yet.

Score share against Shadow has not moved yet: 40.8% at 1.20, 46.2% at S1, 43.7% at S2, 45.1% at S3. All four are within each other's noise. That was expected. S0 to S3 build the foundations (measurement, architecture, accurate waves, memory), and S4 onward is where they are meant to pay off in score.

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
| S4 | Recognise and adapt | Next |
| S5 | Aggressive distance and power policies | Planned |
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

## Results by stage

Across stages, Hadur has become more reliable and more accurate, while its score against Shadow has held steady. Each figure is a cold bench: 35 rounds × 5 seeds per opponent, mean ± 95% interval.

| Measure | S0 (1.20) | S1 | S2 | S3 |
| --- | --- | --- | --- | --- |
| Shadow score share | 40.8% ± 8.3 | 46.2% ± 6.4 | 43.7% ± 4.6 | 45.1% ± 8.9 |
| Shadow survival share | 46.9% ± 11.9 | 55.8% ± 10.0 | 53.1% ± 6.4 | 54.0% ± 10.3 |
| Shadow bullet-damage share | 36.5% ± 5.2 | 38.6% ± 3.7 | 36.2% ± 3.5 | 38.0% ± 7.4 |
| Shadow rounds won | 82 / 175 | 98 / 175 | 93 / 175 | 95 / 175 |
| Sample-bot rounds won | 872 / 875 | 866 / 875 | 875 / 875 | 875 / 875 |
| Shadow shots found as waves | not measured | not measured | 99.4%, 0 false | 99.9%, 3 false |
| Skipped turns (all opponents) | 44 | 73 | 57 | 15 |
| Faults | not measured | 0 | 0 | 0 |
| Memory failures | - | - | - | 0 |

No change in score share is outside the noise. Bullet-damage share is the gap to close: Shadow still deals more damage than it takes. Sources: [S0](bench/s0-baseline-1.20-cold.md), [S1](bench/s1-2.0-cold.md), [S2](bench/s2-2.0-cold.md) and [S3](bench/s3-2.1-cold.md) bench reports, plus the [S3 warm run](bench/s3-2.1-warm.md).

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

At S3 the build runs 236 core, 4 robot and 10 bench tests, none skipped, and all 24 requirements due by S3 are covered. GitHub Actions runs `mvn verify` on every push.

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

The next stages turn accurate perception and memory into score. The remaining 14 requirements are spread over S4 to S6 (6, 4 and 4).

| Stage | Strategic bet | Requirements |
| --- | --- | --- |
| S4 | Recognise the opponent's type and adapt from the first wave, and trust live evidence over old profiles | ADAPT-1 to 3, DIAL-1, DIAL-2, RES-4 |
| S5 | Press when ahead: close distance while out-hitting the enemy, full power against weak movers, finish off a disabled enemy | DIST-1, POW-1, END-1, END-2 |
| S6 | Be unhittable within the tick budget: bullet shadows, switch movement when it is being hit, cut computation instead of skipping turns | MOVE-1, MOVE-2, TIME-1, TIME-2 |

Open items carried forward:

- **Skipped turns** are 15 per cold bench and are S6's gate (zero). The first-scan skips are gone; the rest are scattered.
- **Memory is stored but unread.** Tiers are provisional and the gun and surf seeds are empty; S4 sets the tier thresholds from bench logs and fills the seeds.
- **Damage share against Shadow** is about 37%. S3 to S5 target it.
- **The ledger's remaining ambiguity** is small. A shot fired as the enemy strikes a wall can be 0.5 off in power, and 0.6% of Shadow's visible shots are still missed and have not yet been examined.
