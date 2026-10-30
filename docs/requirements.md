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
| DIST-3 | State | While the hold-650 switch is on, in a duel, the distance policy shall keep the target distance at the opening distance (650 px for a stranger) for the whole battle, taking no DIST-1 step in or out; END-1's finishing distance is unchanged; with the switch off, DIST-1 applies. | R9 |
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
| TIME-6 | State | While the keep-second-wave switch is on, in a duel, a computation level of 1 (a skipped turn held for the round, or a slow tick) shall still surf two waves, the second being dropped from level 2; the k halving at level 2 and the go-to shedding at level 1 and up are unchanged; with the switch off, level 1 surfs one wave (TIME-1, TIME-2). | R9 |
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
| BENCH-12 | Ubiquitous | The bench shall default to the robot release named in `hadur-robot/pom.xml`, shall run battles in parallel on a pinned CPU constant with a bounded child JVM, and shall name the host, the skipped turns and the duress ticks in every report, so that a run on a loaded machine can be recognised. | R9 |
| BENCH-38 | Ubiquitous | The bench shall compute every 95% interval from Student's t at the sample's own degrees of freedom, accurate to 1e-3 for any df, with no table limit and no normal fallback. | R9 |
| BENCH-39 | Event | When asked for a bootstrap interval of a difference of two samples, the bench shall return the 2.5th to 97.5th percentile of the resampled difference of means, reproducibly for a given seed. | R9 |
| BENCH-40 | Event | When a melee round ends, the bench shall record in `rounds.csv` the tick Hadur died, the robot that killed it (the one whose bullet hit on the death tick, else the nearest robot still alive) and the last robot to hit it, and the melee report shall name who kills Hadur most and the mean death tick. | R9 |
| BENCH-41 | Event | When a team run has a baseline, the team report shall give the pooled candidate-minus-baseline paired difference, with its interval, for rounds won, survival, in-lane shots, focus fire and bullets on own members. | R9 |
| BENCH-42 | Event | When a team round ends, the bench shall record in `rounds.csv` the share of our bullet damage that landed on the round's most-hit enemy, and the team report shall show it per opponent and overall. | R9 |
| BENCH-43 | Ubiquitous | The paired reports shall state how many battles of each build were used against each opponent and shall flag a pair that is uneven because a battle failed. | R9 |
| BENCH-20 | Ubiquitous | The bench shall record per battle its duress ticks, engine disables, security-manager denials and the rounds whose R record is missing, appended after the existing result columns, and shall keep reading rows written without them. | R9 |
| BENCH-21 | State | While a battle finished with no ticks in duress, at most a configured number of skipped turns per round and an R record for every round, the bench shall call it trusted, and its report shall give the trusted count per opponent and the paired score-share difference again over trusted pairs only. | R9 |
| BENCH-22 | Event | When a battle ends, the bench shall wait, within a bound, for the engine to finish reporting before it closes the robot's log, and shall record how many R records are missing and whether the last round's is one of them. | R9 |
| BENCH-23 | Event | When a battle ends, the bench shall write each round's outcome, survival, ticks, bullet damage dealt and taken, hit rate, duress ticks and skipped turns to a rounds file in the battle's directory, and shall merge a run's rounds files into one table. | R9 |
| BENCH-24 | Ubiquitous | The bench shall report per opponent the first five rounds of a battle against the last ten, by win rate and bullet-damage share, with the paired late-minus-early difference and its 95% interval. | R9 |
| BENCH-25 | Ubiquitous | The paired A/B report shall give the paired difference and its 95% interval for score share, survival share, win rate and bullet-damage share, per opponent and over all pairs. | R9 |
| BENCH-50 | Ubiquitous | The bench shall sample the host's CPU utilisation and the number of other Robocode JVMs while it runs, and shall record the minimum, mean and maximum utilisation and the most other JVMs seen during each battle as four columns appended to the battle's result row, so that a run on a busy machine can be told from one on an idle one; a row without the columns shall still be read. | R9 |
| BENCH-51 | Event | When a run starts and again when it ends, the bench shall write `conditions.json` into the run's directory with the commit, the jar checksums, the parallelism, the child CPUs and JVM flags, the CPU constant, the engine version, the host sample summary and the size and checksum of the data directory the run began on. | R9 |
| BENCH-52 | Ubiquitous | The duel report shall carry the child JVM flags in its conditions line as the melee and team reports do, and a paired duel shall fight the candidate first on odd seeds and the baseline first on even seeds, so that a drift in the host's load does not favour one build. | R9 |
| BENCH-53 | Optional | Where `--repeat K` is given, the bench shall fight each jar, opponent and seed K times, write every battle to `repeat.tsv` and print the score-share standard deviation per opponent and pooled. | R9 |
| BENCH-54 | Optional | Where `--cold-warm` is given, the bench shall fight each seed cold with the data directory empty and then warm on the shelf the cold battle left, and shall write the pairing with the shelf's size and checksum to `cold-warm.tsv`. | R9 |
| BENCH-55 | Event | When a battle fails, the bench shall run it again up to `--retries` times (default 1), and shall list every battle that still failed at the end of the run and in the report's footer. | R9 |
| BENCH-56 | Optional | Where `--dry-run true` is given, the bench shall describe the battles its options and set add up to and shall start no robot and no battle; each bench script shall take `--dry-run` and run no build, fetch or bench. | R9 |
| BENCH-57 | Ubiquitous | The bench shall take the arena as `--field WIDTHxHEIGHT` in every mode and shall refuse a value that is not two positive whole numbers. | R9 |
| BENCH-58 | Event | When `sweep-cpu-constant.sh` runs a set, it shall run it once at each multiplier of one CPU constant, with the derived constant and a label naming the multiplier, and shall start nothing under `--dry-run`. | R9 |
| BENCH-59 | Ubiquitous | The bench shall read its arguments from a file when its only argument is `@FILE` (one argument per line), and the PowerShell bench scripts shall pass them that way, so that a value with a space reaches it intact on Windows PowerShell 5.1. | R9 |
| BENCH-60 | Ubiquitous | The bench shall cap each battle JVM's heap at 2G unless `--child-heap` names another size, shall leave the heap uncapped for `--child-heap none`, and every run wrapper shall pass `--child-heap` through. | R9 |
| BENCH-61 | Unwanted | If the battle JVMs a run plans (parallel x heap plus about 300 MB each, or 7500 MB each when uncapped) exceed 70% of the host's free memory, the bench shall refuse to start, name a `--parallel` that fits, and start only when `--force-memory true` is given; `--dry-run true` shall show the estimate. | R9 |
| BENCH-62 | Event | When a run starts and ends, the bench shall record the effective child heap cap and the planned memory in `conditions.json`. | R9 |
| BENCH-63 | Ubiquitous | The bench shall list, under the heading "Excluded or failing opponents" near the top of a duel, melee or team report, every opponent that failed at least half of its battles, with the number failed of the number fought and the first failure's reason, and shall add nothing when no opponent did. | R9 |
| BENCH-64 | Ubiquitous | The bench shall place that block after the report's title and leave the rest of the report unchanged. | R9 |
| BENCH-65 | Event | When a run ends with opponents that failed at least half of their battles, the bench shall name them, with their failed and fought counts, in one line of its console output. | R9 |
| BENCH-66 | Ubiquitous | The bench shall list those opponents under `excluded` in the run's `conditions.json`, so a later tool can tell a shrunken set from a full one. | R9 |
| BENCH-67 | Ubiquitous | The bench shall give a failure's reason as the first line of the battle's error text, cut to 160 characters, and "no result" when there is none. | R9 |
| BENCH-68 | Ubiquitous | The bench shall judge a battle fought by a robot that is not a Hadur build (a reference build) on the engine's own signals alone (it finished, skipped no more turns than the limit, spent no ticks in duress where known), shall not apply the R-record rule to it, and shall show the columns that come from R records as "-" and leave out the Hadur-only report sections. | R9 |
| BENCH-69 | Ubiquitous | The bench shall write `reference`, `ramDamage`, `ramDamageBonus`, `bulletDamageBonus` and `lastSurvivorBonus` (and the `their` form of each) from the engine's battle results as the last columns of `result.csv`, after `otherJvms`, and shall read a row without them as NaN. | R9 |
| BENCH-70 | Ubiquitous | Every duel report shall carry a table "Where their points come from", the opponent's score pooled over the battles as shares of survival, bullet damage, ram damage and bonuses, with "-" for a row that has no split. | R9 |
| BENCH-71 | Ubiquitous | The bench shall record the engine's mean ticks per round for any build, from the round-ended events, as `engineRoundTicks`, and the duel report shall show it per opponent. | R9 |
| BENCH-72 | Optional | Where `--seed-base B` is given, the bench shall give the engine seed B + n for its seed n, so that a confirmation run fights seeds no earlier run used. | R9 |
| BENCH-73 | Optional | Where `analyse.py --live PAGE` is given a parsed BotDetails page, the analysis shall project each opponent's paired difference onto the live APS as the sum of the differences over the page's pairings (the rest of the field unchanged), and beside it a band extrapolation that applies each rank band's mean to all its pairings only where the band has at least three covered opponents (issue #151, A5). | R9 |
| BENCH-74 | Optional | Where a live page is given, the analysis shall report the run's coverage of the live field by rank band (ranks from the page's opponent APS) and name each opponent that is not a live pairing as absent, version drift (another version is live) or unrunnable (listed in `hadur-bench/unrunnable.txt`) (issue #151, A6). | R9 |
| BENCH-75 | Ubiquitous | The LiteRumble arithmetic shall reproduce a saved BotDetails page's APS, APS CI, PWIN, survival, pairings and battles from its pairing rows, and shall give a bench build the same APS, CI (variance shrunk to a prior of 16 with weight 3), PWIN and rounds-won survival, labelled as LiteRumble-style (issue #151, A9). | R9 |
| BENCH-76 | Optional | Where `--unseeded true` is given, the bench shall start every battle without `-DRANDOMSEED`, as the RoboRumble client does, keeping the seed number as a label for pairing and rows (issue #151, gap 11). | R9 |
| BENCH-77 | Optional | Where a session file gives `repeat=N` or `shuffle=SEED`, the session shall fight its list N times over in one engine, in an order shuffled with SEED that the control shares, and with a control the report shall give each opponent's mean score share for both robots and the mean difference with each opponent counted once (issue #151, A1). | R9 |
| BENCH-78 | Optional | Where `--cpu-constant` is given to a session, the bench shall pin it in the home the session runs in, and the session report shall name the constant (issue #151, gap 13). | R9 |
| BENCH-79 | Ubiquitous | The bench shall run Robocode 1.11.1 unless `-Drobocode.version` names another release, and every duel and session report shall name the engine, flagging a release LiteRumble takes no uploads from (issue #151, A2). | R9 |
| BENCH-80 | Optional | Where `live_passes.py drift NEW OLD` is given two parsed BotDetails pages and the opponents the change touched (`--changed`, or `--shield-java` for the shield list's entries), the tool shall report the mean pairing difference with its 95% interval separately for the touched and the untouched opponents, so that a drift on the untouched ones is read as the live environment, not the code (issue #151). | R9 |
| BENCH-81 | Optional | Where `live_passes.py collapses` is given several pages, the tool shall list per page the single-battle pairings scoring `--below` points (12 by default) or more under the median of the other pages against the same opponent, with their battle times (issue #151). | R9 |
| BENCH-82 | Optional | Where `live_passes.py classify` is given pages, peers' BotCompare pages, bench TSVs, set files and the shield list, the tool shall write one row per opponent of the newest page with every pass, a pooled score over the newest two passes (the newest alone for a listed bot), the peers' scores, the bench's, set membership, an outcome tier, problem tags (ROUNDS, LEAK, VOLATILE, PEERGAP, BENCHSEES, BENCHGAP) and a robot kind, and a summary of each class's APS and its net room at the peers' median (issue #151). | R9 |
| BENCH-83 | Ubiquitous | Every battle child (duel, melee, team, session and the inactivity check) shall load the JDK's lazily found providers (time-zone rules, zip entry times, locale formats) in its own thread before the engine starts, so that no robot is the first to need one and is denied the class-path read by the security manager (issue #151). | R9 |
| BENCH-84 | Unwanted | If a battle's engine errors hold a security-manager denial of a `META-INF` resource on the class path, then the bench and `analyse.py` shall not trust that battle and shall name the reason "JDK resource denied" (issue #151). | R9 |
| BENCH-85 | Optional | Where `live_client.py profiles DIR` is given a Hadur data folder, the tool shall decode the newest-format profile of each opponent with ProfileCodec's checks and list its key, battles, rounds, last outcome, ADAPT-5's and SHIELD-3's stored verdicts and seed sizes, counting damaged files apart, so that the shield verdicts a live client carries into later battles can be counted (3.12 plan, P4). | R9 |
| BENCH-86 | Event | When a live client's results file (its `OUTPUT=`) or Hadur's `health.hc` (RES-8) changes during `live_client.py watch`, the tool shall append each battle with a hadur2 robot once (score share, rounds won, bullet damage) and each new health record with the opponent and shield verdict of the profile saved at the same battle end, keeping battles already recorded across uploads and restarts (3.12 plan). | R9 |
| BENCH-87 | Event | When `live_client.py watch` reads a LiteRumble BotDetails page (or `page-diff` is given two), the tool shall save the page, record its header and infer the mean score of each pairing's newly uploaded battles from the pairing's mean and battle count before and after, flagging any under 50 or 25 points or more under the pairing's earlier mean; a failed fetch shall be logged and never stop the watch (3.12 plan). | R9 |
| BENCH-88 | Optional | Where `live_client.py report OUT` is given a watch folder, the tool shall summarise the client's battles per game, the health records' skipped turns, faults and stored shield verdicts, each 1v1 battle under 70% share joined to its health record, the latest profile snapshot and the live page's movement and flagged drops (3.12 plan). | R9 |
| BENCH-89 | Unwanted | If a JVM that `jps` lists ends, starts or is this bench's own battle while the other-JVM count is taken, then the bench shall not count it as another Robocode JVM: its own battles are read before and after the listing, and a listed process that is gone or descends from the bench is left out (plan-90 step 6: the count dropped 22 to 32% of screen pairs). | R9 |
| BENCH-90 | Event-driven | When a melee battle ends a round, the bench shall write one `bullets.csv` row per fighter with its shots, their summed power, its hits on a robot, the damage those did and its shots lost to another bullet, each bullet counted once, plus the same counts for shots fired while five or more fighters were alive (the melee gap read: Hadur's firepower against the field's). | R9 |
| RES-10 | Ubiquitous | The robot shall leave no reference to its classes in the process after a battle, so that the number of classes loaded in one JVM stays flat across a session of battles. | R7 |
| MOVE-3 | Ubiquitous | Movement shall score a wave's danger only over the part of the intersection not in a certain bullet shadow, at half weight inside a possible shadow. | R6 |
| MOVE-4 | Ubiquitous | Movement shall score a wave's danger as the danger density integrated over the firing angles of the precise intersection. | R6 |
| MOVE-5 | State | While the enemy's normalised hit rate less its margin exceeds 4.5%, movement shall enable the flattener views. | R6 |
| MOVE-7 | Event | When a wave in flight is removed or reordered, movement shall discard the neighbour cache of every wave whose surf index changed. | R6 |
| PHYS-1 | Ubiquitous | The movement predictor shall stop a predicted robot at a wall as the engine does. | R6 |
| WAVE-4 | Event | When a movement wave's bullet power is updated, its wall distances shall be recomputed. | R6 |
| WAVE-5 | Event | When our own energy falls by exactly 0.1 on a tick of a duel and no shot of ours, bullet hit, wall hit or robot hit explains it, the core shall take 0.1 off the enemy's energy drop for that tick (the engine's inactivity drain) before classifying the drop as a fired bullet, for every such tick since the last scan. | R9 |
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
|---|---|---|
| Kernel | `model`, `physics`, `knn`, `ledger`, `memory`, `port`, `world` (from A3), `link` (from A4) | CORE, WAVE, MEM, PHYS, WORLD, LINK, SHELF |
| Duel strand | `gun`, `move`, `adapt`, `policy`, `shield`, `shieldmode` (from D5), `duel` (from A2) | ADAPT, GUN, DIST, POW, MOVE, END, DIAL, RADAR, SHIELD, TIME, RAM, MIR |
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
| ROLE-5 | Ubiquitous | The core shall offer each of its events to the roles of the charter, Melee before Duel, in the engine's order, except that a sentry's scan and a sentry's bullet are offered to no role (GATE-5) and Hadur's hit on a robot the Duel is ignoring is not offered to the Melee role. | A2 |
| ROLE-6 | Ubiquitous | The core shall hold no role outside its charter. | A3 |
| WORLD-1 | Ubiquitous | The core shall feed one model of the field with every scan, hit and death that ROLE-5 offers the Melee role, before any role is offered it. | A3 |
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
| WEAVE-4 | Optional | Where the wide fire lane is played (WEAVE-9 off), while a living teammate's last known position is no older than the WORLD-3 window and lies in the fire lane, the conductor shall withhold the fire permission. | A5 |
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

The plan is [docs/druss-route-plan.md](druss-route-plan.md): the findings of the 4 and 5 October 2026 probes against DrussGT 3.1.16 and the stages D0 to D6 that follow from them. Its stages are compared with `hadur.druss.stage` in the root pom, which is `D5`. The plan's draft IDs were renumbered here because open PR #83 reserves BENCH-9, BENCH-10, POW-6, RES-12, RES-13, GUN-6 and DIST-2: the plan's POW-6 is **POW-11** and its RES-12 is **RES-14**; POW-7 to POW-10 and ADAPT-5 keep their numbers. The requirements of D2 to D6 stay in the plan until their stages are built.

### Requirements

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| POW-11 | Ubiquitous | The core shall keep battle-long hit rates for both robots in three bullet power classes (under 0.2, 0.2 to 1.2, above 1.2) and over all their bullets, each with its margin of error. | D1 |
| POW-7 | State | While both robots' battle-long hit rates over all their bullets are below 12.5% by more than their margins, and our energy is no more than 3 below the enemy's, the gun shall fire power 0.1. | D1 |
| POW-8 | State | While POW-7's hit-rate condition holds, our energy is more than 3 below the enemy's and our energy exceeds 10, the gun shall fire its default power. | D1 |
| POW-9 | State | While both robots' energy exceeds 60, the gun shall fire its default power whatever POW-7 would choose. | D1 |
| POW-10 | Ubiquitous | The gun shall fire every duel shot that our energy can pay for, lowering the power where a rule saves energy, except where END-4 holds the shot. | D1 |
| ADAPT-5 | Event | When a profile that records POW-7's hit-rate condition as met loads, the core shall apply POW-7 to POW-9 from the first shot, until this battle's rates contradict it by more than their margins. | D1 |
| SHIELD-3 | Event | When one of our bullets is destroyed by a bullet from an enemy that has not moved since the round began, the core shall treat the enemy as a bullet shielder from the next shot, and shall keep that verdict in the opponent's profile so that the next battle starts with it. | D2 |
| SHIELD-4 | State | While the enemy is treated as a bullet shielder and has not moved in the last 10 ticks, the gun shall fire power 3.0, capped by END-3, with SHIELD-2's aim offset on. | D2 |
| END-4 | State | While the enemy's energy is below the smallest bullet power it has fired this battle, the gun shall not fire a shot that would leave our energy less than 0.3 above the enemy's. | D2 |
| GUN-5 | Ubiquitous | The gun shall rate its virtual guns separately for bullets of power under 0.2, and fire the gun rated highest for the power class of the shot. | D3 |
| MOVE-8 | Ubiquitous | Movement shall publish, for each enemy wave in the air, the guess-factor interval its current plan occupies when that wave arrives, as a read-only value the gun can read through the duel's internal seam. | D4 |
| GUN-7 | Ubiquitous | The gun shall choose each firing angle from its candidates by the expected damage of a hit plus the expected damage avoided by the bullet's shadows on the intervals MOVE-8 publishes. | D4 |
| GUN-8 | State | While the TripHammer switch is on, in a duel, the main gun shall aim from a TripHammer view, Diamond 1.8.22's duel gun: ten features including `min(3, power) / 3`, weights sliding from the initial to the final set by the view's size, one neighbour per nine points up to 225 weighted `1 / sqrt(distance)`, each firing at its guess factor times the orbit direction times the precise escape angle on its side, and the densest of 59 angles across the maximum escape angle under the kernel `1 - abs(u)^3` at twice the bot width's aim angle; the main candidate's virtual bullet and rating shall be that aim's, and the displacement view shall keep logging; with the switch off, or in a melee or team battle, the main gun is the displacement gun. Off by default. | R9 |
| GUN-9 | State | While the free-gun switch is on, in a duel, the live gun verdict shall be the highest-rated candidate with no margin-of-error test, for both power classes (GUN-5), the hybrid gun's gate (GUN-4) unchanged; with the switch off the choice changes only once it clears every other candidate's margin (GUN-1). Off by default. | R9 |
| GUN-10 | State | While the undecayed-ratings switch is on, in a duel, a gun's live rating shall be its lifetime weighted hits over its shots, with no 100-shot half-life; with the switch off GUN-1's decay applies. Off by default. | R9 |
| GUN-11 | State | While in a duel against an opponent the table's `gun-stack: name` lines name (matched as the shield list is), and not on the shield list, the gun shall aim with GUN-8, GUN-9 and GUN-10 on from that opponent's first scan; in melee and team, and against any other opponent, it shall aim exactly as before. | R9 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| BENCH-11 | Event | When a candidate list is given, the bench shall run each named opponent with shield mode on and off over the same seeds and report the paired difference. | D5 |
| SHIELD-5 | Optional | Where the opponent is on the shield list, the core shall open each round in shield mode. | D5 |
| SHIELD-6 | Unwanted | If the enemy's bullet damage in a battle exceeds the amount that would hold our score share below 85%, then the core shall leave shield mode for the rest of that battle. | D5 |

#### D5 notes

- **The list ships in the robot jar as a class**, `hadur2.ShieldListData` (`hadur-robot/src/main/java/hadur2/ShieldListData.java`),
  one robot per string, `#` for comments. It is a class and not a text resource because
  Robocode's sandbox denies a robot the read of its own jar: `getResourceAsStream` raises a
  security violation and the robot is killed (seen in the BENCH-11 smoke run), while class
  loading always works. The adapter passes the lines on and the core only parses them
  (`ShieldList`; RES-6 keeps I/O out of the core). A line is a robot's name as Robocode lists it:
  `apv.test.Virus 0.6.1` matches that version only, and `apv.test.Virus` matches every version.
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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| MATCH-1 | State | While both robots have resolved at least 30 duel bullets this battle and our battle-long hit rate's lower bound is above the enemy's upper bound, the core shall treat the duel as won on the guns, until our lower bound falls to the enemy's raw rate. | D7 |
| MATCH-2 | State | While the duel is won on the guns (MATCH-1), the gun shall not weigh our bullets' shadows (GUN-7), and a bullet destroyed by a still enemy's shall not make it a shielder by itself (SHIELD-3). | D7 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| RAM-3 | State | While the enemy is a confirmed rammer (RAM-2), each round shall play one arm from its start, the escape (RAM-2) or the fight (RAM-1 only, as 3.4 plays): the escape until it has played two rounds, then the arm whose rounds have the higher mean energy margin (our energy at the round's end less the enemy's), the escape on a tie; a round with a ram before the confirmation counts for the fight. | D8 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| WORLD-9 | Event | When a teammate's state is scanned or reported, the World shall keep its heading and velocity with its position and shall predict its position at a later tick from them, moved no further than a robot's top speed allows. | T1 |
| MMOVE-6 | State | While in melee on a team, movement shall add to each candidate point's risk a term for every living teammate whose position is no older than the WORLD-3 window, rising with the inverse square of the distance between the point and the teammate's predicted position when Hadur would arrive. | T1 |
| MMOVE-7 | State | While in melee on a team, movement shall score the path to each candidate against each such teammate's predicted track, and shall cap the candidate ring at the same fraction of the nearest teammate's distance as of the nearest opponent's. | T1 |
| MMOVE-8 | State | While on a team, each member's movement noise field shall differ from its teammates' by the member's place in the roster; off a team the field shall be the one MMOVE-1 uses. | T1 |
| WEAVE-7 | Optional | Where the wide fire lane is played (WEAVE-9 off), while a living teammate's predicted track, over the time a bullet of any power would take to pass it, comes within the fire lane's half-width of the lane, the conductor shall withhold the fire permission. | T1 |
| WEAVE-8 | Unwanted | If the driving role's drive, simulated a set number of ticks ahead, would bring Hadur within a robot's width and a margin of a living teammate's predicted position, then the conductor shall replace the drive with the nearest of a brake or a reversal that stays clear, keeping the gun, radar, fire and message orders. | T1 |
| MGUN-6 | State | While in melee on a team with a living teammate whose position is no older than the WORLD-3 window, and at least 30 energy of its own, the gun shall fire power 3, or the power that kills its target if less, in place of the MGUN-3 table. | T2 |
| MGUN-8 | Event | When the World takes a teammate's reported sighting of an enemy, the field gun shall add it to that enemy's movement history as one of Hadur's own scans, before Hadur's own scans of the same tick. | T5 |
| MGUN-9 | State | While in melee on a team with a living teammate, the field gun shall take 21 situations per opponent from its kNN in place of MGUN-1's three. | T6 |
| MGUN-10 | State | While in melee on a team with a living teammate, the field gun shall keep an opponent closing on Hadur within 100 px among its targets, in place of the rule that leaves it alone unless it can be finished. | T6 |
| MMOVE-9 | Optional | Where the `NEAREST` switch is on, while in melee on a team with a living teammate, movement shall make no virtual bullets for a detected shot whose source was nearer a living teammate than 0.9 times Hadur's distance from it when it was fired. | T6 |
| MMOVE-10 | Optional | Where the `LEARNED` switch is on, while in melee on a team with a living teammate, each enemy bullet that hits Hadur and matches a detected shot shall become a sample of that enemy's gun (Hadur's situation at the fire tick and the guess factor the bullet took), kept and sent in Hadur's report; teammates' samples shall join the same per-enemy log; and a detected shot whose shooter's log holds five samples or more shall be dodged at the aims of its nearest samples, weighted by nearness and weighing two in all, in place of MMOVE-3's head-on and linear bullets. | T6 |
| MMOVE-11 | Optional | Where the `MELEE_AIMED` switch is on, while in melee off a team, each seen shot's virtual bullets shall weigh 1/(1+k)^2 for the k other living opponents nearer its shooter than Hadur was, and a shot under 0.1 shall make none. | M7 |
| MMOVE-12 | Optional | Where the `MELEE_HOPS` switch is on, while in melee off a team with three or more opponents left, the candidate rings shall run from 40 px to 0.45 of the nearest fresh opponent's distance, at least 80 and at most 300 px. | M7 |
| MMOVE-13 | Optional | Where the `MELEE_HEAT` switch is on, while in melee off a team, each fresh living opponent that Hadur is nearer than any other opponent shall be taken to fire at Hadur on the tick its gun could next be cool (from its last seen shot, else tick 30), at its last seen power (else 2) and weighing 0.5, unless a seen shot moves that tick on. | M7 |
| MMOVE-14 | Optional | Where the `MELEE_CLOSER` switch is on, while in melee off a team with three or more opponents left, an opponent's risk term shall be divided by one plus the number of other opponents nearer it than the point. | M7 |
| MMOVE-15 | Optional | Where the `MELEE_SURF` switch is on, while in melee off a team, each seen shot's virtual bullets shall weigh by MMOVE-11's crowd weight; once Hadur's log of a shooter's hits on Hadur holds `TeamDanger.MIN_SAMPLES` samples, that shooter's bullets shall be its four nearest learned aims, carrying the shot's whole weight, in place of head-on and linear; and Hadur shall choose among its `WAVE_RERANK` least risky candidates by the wave check (TMODE-11). | M7 |
| TMODE-1 | State | While in melee on a team with a living teammate, movement shall play the team modes the mode table holds for the first living enemy whose class (its name without version or duplicate marker) the table names, or, for a team the table does not name, the modes the build forces on (none in the shipped build). | T7 |
| TMODE-2 | Optional | Where the SOFT mode is played, a detected shot's virtual bullets shall weigh 1/(1+k)² for the k living teammates nearer its source than Hadur was when it was fired, and a shot weighing under 0.1 shall make none. | T7 |
| TMODE-3 | Optional | Where the GANG mode is played, while two or more enemies seen within the cap age are within 250 px of Hadur, each candidate's risk shall be scaled by e^(0.5 (to − from) / 100) for its and Hadur's distances to the nearest living teammate; otherwise, while that holds for a living teammate, by the same for the nearest such teammate, each distance floored at 300 px. The posture's term shall not be scaled. | T7 |
| TMODE-4 | Optional | Where the FINISH mode is played, while the engine counts one enemy alive, that enemy was seen within the cap age, and Hadur has 30 energy or more, each candidate's risk shall be scaled by e^((to − from) / 100) for its and Hadur's distances to that enemy, each floored at 350 px, in place of TMODE-3. | T7 |
| TMODE-5 | Optional | Where the PACK mode is played, while Hadur has 20 energy or more and is not drawn by TMODE-3's regroup or TMODE-4, each candidate's risk shall be scaled by e^((to − from) / 100), each distance floored at 40 px, toward Hadur's place in a pincer round the prey: the enemy seen within the cap age with the least distance from the members' centre plus 1.2 times its energy; the members ranked by bearing from the prey about their mean bearing and spread about it at most 70° apart, at 0.74 of the nearest member's distance, between 150 and 450 px. | T7 |
| TMODE-6 | Optional | Where the SCREEN mode is played, each enemy's distance to its nearest other robot, by which MMOVE-2 decides whether Hadur at a candidate point would be that enemy's closest, shall take the living teammates in view as well as the other enemies. | T7 |
| TMODE-7 | Optional | Where the POOL mode is played, MMOVE-10's learning and learned aims shall apply as for the LEARN mode, with one log per enemy class (the name without version or duplicate marker) fed by the hits of every copy of that class. | T7 |
| TMODE-8 | Optional | Where the DISABLED mode is played and an enemy seen lately with at most 0.1 energy is within 500 px, the team movement shall draw the member to the nearest such enemy, to 50 px, at half FINISH's strength. | T7 |
| TMODE-9 | Optional | Where the MATEFIRE mode is played, each bullet a teammate reports firing shall count in the member's destination risk as an enemy's virtual bullet does, on the reported heading, until it has passed the member. | T7 |
| TMODE-10 | Optional | Where the REAR mode is played by the team's leader (the member that starts a round with more than 100 energy), each enemy's risk term shall weigh 1.5 times. | T7 |
| TMODE-11 | Optional | Where the WAVES mode is played, the member shall re-rank its eight lowest-risk destinations, and the destination it holds, by the damage expected from the shots in flight its 30-tick drive to each would cross, each shot a profile over its virtual bullets' headings and its escape angle summing to its aimed-at weight, and shall take the least of risk over the median risk plus three times damage over the median damage (floored at 0.1). | T7 |
| WEAVE-9 | State | While a living teammate lies ahead of the gun within 30 px of its line, at the teammate's distance, and nearer Hadur than the nearest enemy within 36 px of that line (at any distance when no enemy is), the conductor shall withhold the fire permission. | T7 |
| WEAVE-10 | Optional | Where the predicted lane is played (ablation tlanep), while a living teammate nearer Hadur than the nearest enemy on the gun's line has a predicted track that, on some tick of a 14 px a tick bullet's flight up to that enemy, lies within 30 px of the line and within 40 px of the bullet along it, the conductor shall withhold the fire permission. | T7 |
| WEAVE-11 | Optional | Where the beyond-target lane is played (ablation tlaneb), while a living teammate up to 450 px beyond the nearest enemy on the gun's line has a predicted track that, on some tick of a 14 px a tick bullet's flight up to 450 px past that enemy, lies within 30 px of the line and within 40 px of the bullet along it, the conductor shall withhold the fire permission. | T7 |
| TMODE-12 | Ubiquitous | The team mode table's default, for a team it does not name, shall include the MATEFIRE mode. | T7 |
| MRADAR-3 | Optional | Where the team look switch is on, while on a team with a living teammate, four or more enemies alive and every one seen, if the gun's heat is 0.2 or less and the freshest scan of its last target by any member is two ticks old or more, then the radar shall turn toward that target. | T7 |
| TMODE-13 | Optional | Where the HUNT mode is played, while Hadur has 20 energy or more, the members (in name order) shall each be assigned the fresh enemy of least (distance + 1.2 × energy)², times 1.6 for an enemy three members already hunt, and Hadur's destination risk, all terms but the bullets' and the posture's, shall be scaled by e^(0.3 (to − from) / 100) for its and Hadur's distances to its place 350 px from its prey, ranked by bearing among the members on that prey and spread up to 70° apart. | T7 |
| TMODE-14 | Ubiquitous | The team mode table's default, for a team it does not name, shall include the HUNT mode. | T7 |
| TMODE-15 | Optional | Where the LINES mode is played (ablations tmlines, tmlinesw), Hadur's destination risk shall add, for each living teammate with a fresh position and its nearest fresh enemy, 0.3 at a point on the line from the teammate through that enemy, falling linearly to none 0.3 radians off that line as the teammate sees it, and none nearer the teammate than the enemy or more than 800 px beyond it. | T7 |
| TMODE-16 | Optional | Where the team mode table names LINESW against a team, Hadur shall play TMODE-15 against it with 0.6 on the line, falling linearly to none 0.45 radians off it. | T7 |
| TMODE-17 | Optional | Where the team mode table names LANEP against a team, Hadur shall play WEAVE-10 against it: a teammate nearer than the target whose predicted track meets a bullet flying the gun's line holds the shot. | T7 |
| TMODE-18 | Optional | Where the team mode table names LANEB against a team, Hadur shall play WEAVE-11 against it: a teammate up to 450 px beyond the target whose predicted track meets the bullet holds the shot. | T7 |
| TMODE-19 | Optional | Where the GUNLINE mode is played (ablations tmgunline, tmgunlinew), each team report shall state the member's gun heading and gun heat (link version 3), and Hadur's destination risk shall add, for each teammate whose stated aim is at most 3 ticks old and whose gun fires within 6 ticks by that heat at 0.1 a tick, 0.4 at a point on the line ahead of that teammate's gun, falling linearly to none 70 px off it, from 20 to 900 px ahead. Where it is not played, the report shall be written as before. | T7 |
| TMODE-20 | Optional | Where the team mode table names OWN against a team, while Hadur has a living teammate, a shot by that team shall make virtual bullets only when no teammate stood 0.9 times nearer its source than Hadur (MMOVE-9's nearest rule). | T7 |
| TMODE-21 | Optional | Where the team mode table names HEADON against a team, while Hadur has a living teammate, each shot by that team shall make one head-on virtual bullet of weight 2, and no linear one. | T7 |
| TMODE-22 | Optional | Where the team mode table names LINEAR against a team, while Hadur has a living teammate, each shot by that team shall make one linear virtual bullet of weight 2, and no head-on one. | T7 |
| TMODE-23 | Optional | Where the team mode table names FAR against a team, the HUNT place shall be 500 px from the prey. | T7 |
| TMODE-24 | Optional | Where the team mode table names FARTHER against a team, the HUNT place shall be 650 px from the prey. | T7 |
| TMODE-25 | Optional | Where the PATH mode is played against a team, while Hadur has a living teammate with a bullet in flight, the destination shall be chosen among the 8 lowest-risk candidates by their risk plus the damage of each teammate bullet that, on Hadur's straight drive there (accelerating 1 px a tick to 8) over the next 15 ticks, crosses Hadur's box 18 px each side; a held destination not yet reached shall be kept unless another scores below 0.9 times its risk plus its own path damage. | T7 |
| TMODE-26 | Optional | Where the team mode table names NEAR against a team, the HUNT place shall be 250 px from the prey. | T7 |
| TMODE-27 | Optional | Where the DODGE mode is played against a team, while Hadur has a living teammate, each detected enemy shot shall be turned once, when first seen, into a profile: the simple aims (head-on, linear, circular, linear at the 16-tick average velocity, linear at half speed) at Hadur's state when it was fired and the team's learned aims pooled by enemy class, each carrying its expert's weight exp(-loss) against that class, where an expert's loss decays by 0.95 a hit and grows by 0 within one bot width of each enemy bullet that hit a member and up to 1 at three, the hit member's errors travelling with its link sample; the shot shall count for Hadur by 1/(1+k)^2 for the k teammates nearer its source (by the nearest rule where the table names OWN); the destination shall be the best of the 12 lowest-risk candidates and the held one by risk/median + 3 x damage/median, the damage being the profiles crossed driving there for 30 ticks plus the teammates' bullets crossed in 15, the held one times 0.9; the base risk then counts no bullet. | T7 |
| TMODE-28 | Ubiquitous | The team mode table's default, for a team it does not name, shall include the PATH mode, and every team the table names shall play PATH on top of its entry. | T7 |
| TMODE-29 | Optional | Where DODGE's own-fire switch is on, DODGE's base ranking shall keep MATEFIRE's teammate-bullet risk, and each re-ranked destination's risk shall gain PATH's factor times the damage of the teammates' bullets crossed on its 15-tick drive, those bullets no longer counting in its wave damage. | T7 |
| TMODE-30 | Ubiquitous | The team mode table's default, for a team it does not name, shall include the DODGE mode, every team the table names shall play DODGE on top of its entry, and DODGE's own-fire switch shall be on. | T7 |

### T1 notes

- **WORLD-9.** `Roster.Mate` keeps the heading and velocity a scan, a report or a teammate's
  sighting states with the position. `at(tick)` moves the last known point `velocity` px for
  each tick since, along the heading, no more than 8 px a tick. `Roster.living(now)` lists the
  living teammates whose position is no older than `SILENT_WINDOW`.
- **MMOVE-6 to MMOVE-8.** `MinimumRiskMovement.teammateRisk` adds `MATE_K` (0.6) over the
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
- **Team only (Leigh, 2026-10-23: "ONLY ... in the team capabilities and NEVER in others").** Both
  are reached only with a living teammate; with no teammate the movement calls MMOVE-3's own path
  (`TeamDangerTest.soloUntouched`, both switches on), and a hit is learnt only while `onTeam`.
  Checked with both switches turned on: every duel and melee replay fixture (Walls, Crazy, RamFire,
  SpinBot, Tracker, Shadow, warm Shadow, duress, melee samples, sentry, hand-off) replays bit for
  bit; only the two team fixtures change. Any release that turns a switch on re-runs that check.

### T7 notes: the team mode table (TMODE-1 to TMODE-4)

- **Why.** Leigh (2026-10-23): "There are only 44 teams in team mode, we can and should have a
  1:1 strategy for them." The decompile read (docs/bench/team-top-decompile.md) found that the
  top teams' movement differs from Hadur's mainly in how much of each enemy shot a member takes as
  its own (Ogi, Firestarter), in regrouping when ganged (Ogi), and in closing on the last enemy
  (Ogi, Combat). Different teams punish different things, so each team gets its own modes.
- **Where.** `melee.TeamModes` holds the table (`TABLE`, empty until the per-team screens fill
  it) and the forced default (`FORCE_SOFT`, `FORCE_GANG`, `FORCE_FINISH`, `FORCE_LEARN`, all off).
  `MeleeController.tick` reads the modes each tick on a team. SOFT is
  `MinimumRiskMovement.softWeight`; GANG and FINISH are `MinimumRiskMovement.pull`, a `Pull`
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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SHIELD-7 | State | While the enemy is treated as a bullet shielder and the gun aims MIR-1's mirror aim, the gun shall fire that aim when it is ready instead of holding it under SHIELD-2. | R9 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SHIELD-8 | State | While shield mode is on with the hold switch, the core shall not fire at a living enemy, and shall keep the gun pointed at it between shields. | R9 |
| SHIELD-9 | Event | When one of our shield bullets meets an enemy bullet whose heading is known and the learn switch is on, the core shall score the heading predictors and update the learned offsets with that heading as it does for a bullet that hit us. | R9 |
| SHIELD-10 | State | While the mode switch is on, each learned offset shall be the heading error that recurs most often, within 1e-5 rad, among the last 500 kept for that base, instead of the running mean. | R9 |
| SHIELD-11 | State | While the stay switch is on, shield mode shall take no exit inside a round, and shall be left for the rest of the battle once the enemy's bullets have done more than 150 damage in it, or when the enemy has not fired by tick 300 of a round. | R9 |
| SHIELD-12 | Optional | Where the turn switch is on, the heading predictors shall include a fifth head-on base: the firing-point base turned by the enemy's body turn on the firing tick. | R9 |
| SHIELD-13 | Ubiquitous | The robot shall ship shield mode with the hold, learn, mode and stay switches on and the turn switch off, and its shield list shall hold the 103 robots of Nullstride 2.3.3's list that the 8-seed step 3 sweep admitted by the D5 rule, beside the 97 it held in 3.12. | R9 |
| SHIELD-14 | Optional | Where the wall switch is on, when the ledger's read of an enemy shot is uncertain (a wall hit inferred on the same scan interval), the core shall build a shield wave at the ledger's best-guess power, the wall-split power nearest the enemy's last sure shot, and match that wave to a hit or an intercepted bullet by distance and time without its power, instead of building none. | R9 |
| SHIELD-15 | Optional | Where the trial switch is on, when a duel opponent not on the shield list is first scanned, the core shall start shield mode against it, and shall leave shield mode for the rest of the battle once its bullets have done more than 35 damage plus 0.25 for each shot it fired, or two rounds in shield mode are lost, or under half of at least 20 ended enemy bullets were shot down, or six of its bullets hit with none shot down, or it rams Hadur. Listed opponents shall play as without the switch. | R9 |
| SHIELD-16 | Optional | Where the prior switch is on, the core shall add a fifth head-on base to the shield predictors: the bearing from where the enemy stood on the tick before it fired to where Hadur stood then, turned by the enemy's body turn on the firing tick. | R9 |
| SHIELD-17 | Optional | Where the move switch is on, or the shield list names the opponent for the opening drive, when a round of shield mode opens, the core shall drive away from the walls and the enemy, each pushing by the inverse square of its distance and the enemy three times a wall, until the enemy's first shot or 5 ticks before the enemy's gun is ready, whichever comes first, and shall then stand still as SHIELD-5 does. | R9 |
| SHIELD-18 | Optional | When the shield list gives a shipped aim for the opponent (a predictor and its offset), the core shall start that predictor with three exact matches and that offset as its base's learned offset. Where the rec switch is on, at each round's end of shield mode the core shall write the best predictor, its offset, its exact matches, the bullets learned from and the round's opening-drive ticks as an `SP` record. | R9 |
| SHIELD-19 | Optional | Where the shield list names the opponent with a `shield-exit4:` line, SHIELD-11 shall leave the battle once the enemy's bullets have done more than 400 damage instead of 150; with a `shield-exit0:` line (which wins when both name it), SHIELD-11 shall take no damage exit and SHIELD-6's budget alone shall end the mode. Other opponents shall play as before. | R9 |
| DODGE-1 | Event-driven | When the duel makes a movement wave while the simple-aim dodge is on, the core shall record on it our position, heading, velocity, last turn and average velocity of the last 10 ticks and the enemy's position and heading, for the wave's tick and the two ticks before, and the wave shall give from them, per tick, where six simple aims send its bullet at its current power (head-on; linear, circular and averaged linear predicted tick by tick with paths stopped 18 px inside the walls; the one-line linear aim of bearing plus lateral velocity over bullet speed; and its arcsine), each aimed from the enemy's position on that tick, with our lateral velocity seen from the enemy and the enemy's body turn to the next tick. | R9 |
| DODGE-2 | State | While the simple-aim dodge is on for the opponent, the core shall count, across the battle's rounds, the enemy bullets whose heading it learns (a hit on us, a bullet meeting ours) and, per expert, those within 0.002 rad of it; the experts per tick being the six aims, the six with the enemy's body turn to the next tick added, and the one-line linear aim with a divisor learned from the bullets read (running mean decayed by 0.85 a bullet, samples between 4 and 30) with and without that turn. While one expert matches at least 3 of them and at least 60% of those read, the surf's danger for a wave shall be 1 when that expert's bullet falls inside the option's hit range (with a 0.005 rad margin) and 0 otherwise, plus a floor of 0.1 (so the distancing and escape factors still rank the safe options) and 0.05 of the views' score, without the hit-rate term; otherwise the views decide as before. At each round's end it shall write `SD,round,tick,best,bestMatches,read,active`, best being the expert's index (tick lag times 14 plus its place). | R9 |
| DODGE-3 | State | While in a duel, the simple-aim dodge shall be on against an opponent the table's `shot-dodge:` lines name (matched as the shield list is), or against every opponent with the dodge switch on (off by default); in melee and team, and against any other opponent, it shall be off and the duel play exactly as before. | R9 |
| DODGE-4 | State | While in a duel, the shot-dodge planner (DODGE-6) shall be on against an opponent the table's `shot-dodge2: expert name` lines name (matched as the shield list is), or against every opponent with the planner switch on (off by default); its expert (DODGE-2's index, or -1 for none) shall prime that expert's score with 3 bullets' worth, a line with a malformed or out-of-range expert shall be skipped, and in melee and team, and against any other opponent, the planner shall be off and the duel play exactly as before. | R9 |
| DODGE-5 | State | While the planner is on, each enemy bullet read (DODGE-2) shall also score every expert exp(-d²/2σ²) for its distance d from the bullet's heading, σ being 0.18 of the wave's escape angle, and each firing wave that passes us neither hitting us nor meeting our bullet shall count, against every expert whose bullet lies inside the wave's precise intersection less 0.005 rad each side, one contradiction; the planner's expert shall be the one with the highest score plus prime less contradictions, and it shall act while that net is at least 3 and the score plus prime is at least 60% of the bullets read plus prime. At each round's end it shall write `DP,round,tick,planBest,planScore,read,passes,contradictions,planActive,planTicks`. DODGE-2's strict reading shall be unchanged. | R9 |
| DODGE-6 | State | While the planner is on and acting, on each surfed tick the tick budget allows go-to on, the duel shall drive to and stop at the stop point whose path costs least over up to 3 surfable waves whose expert bullet is known: standing still, and the points at 3 to 55 ticks along 12 headings and both wall-smoothed orbits; a wave whose expert bullet falls inside the path's precise intersection (within 0.005 rad, at the shadows' transmission) costing 10⁹ times the bullet's damage, any other the damage over the square of the clearance in radians (floored at 10⁻⁴), plus 2500 over the square of the least distance to the enemy extrapolated at its last heading and speed and held in the field, and 10⁹ times 4 when that distance falls under 40 px (a collision); the plan kept until the waves or the expert change, we drift 2 px from it, or 5 ticks pass; with no surfable wave and the enemy within 200 px, it shall instead take the path of the same points over 20 ticks that costs least by the distance term alone; while it acts it shall drive in place of RAM-2's escape, which shall drive on any tick the planner declines; a wave's expert bullet shall be taken as lying anywhere within twice the RMS of that expert's misses on the bullets read within three sigma of it (DODGE-5), at least 0.005 and at most 0.1 rad, either side; on other ticks the surf shall drive as before without DODGE-2's danger. | R9 |
| POISON-1 | State | While stop-and-go is on for the opponent and no rammer escape is under way, the duel shall drive by it instead of the surf: crawl 0.5 px a tick along the orbit while the enemy's gun cools; crawl 0.5 px the other way on the tick the enemy's gun is the variant's ticks (1, or 2 for the shift variant) from ready; and after each detected enemy shot drive at full speed toward a point 140 px along the orbit, pushed out from the enemy by up to 90 px inside 250 px, wall-smoothed with a 160 px stick, until the gun is no more than its braking ticks plus 1 from ready. The orbit direction shall start on the roomier side and turn round when the smoothed heading comes within 45 degrees of the enemy and the other side's does not. At each round's end it shall write `WP,round,tick,goTicks,stopTicks,reverseTicks`. | R9 |
| POISON-2 | State | While in a duel, stop-and-go shall be on against an opponent the table's `stop-go:` lines (variant 1) or `stop-go2:` lines (variant 2) name (matched as the shield list is), or against every opponent with the stop-and-go switch on (off by default, variant set by the switch); in melee and team, and against any other opponent, it shall be off and the duel play exactly as before. | R9 |

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
  own design (Leigh, 2026-10-25: "unique and different, inspired by others but not copying them"),
  taking three ideas from Saguaro's ShotDodger and none of its code or data: score a path by its
  clearance from the predicted bullet (`damage / clearance^2`, a hit above any miss), add the enemy's
  distance (`2500 / d^2`), and learn the experts loosely (Gaussian, 0.18 GF) from hits and from the
  bullets that passed. Its paths are our surf's stop points, its experts our simple aims, each
  bullet's band our own misses, and against close-range bots it keeps away with no wave in the air.
  `move/ShotDodgePlanner` is that planner; `ShotDodger.observe(aims, heading, escapeAngle)`,
  `observePass`, `prime`, `planBest` and `planActive` its reading; `MoveController.setDodgePasses` the pass
  learning. Shipped experts are derived from our own bench DP records, never from Saguaro's. Ablations
  `sdplan` (suffix `sp`, every opponent) and `sdplanlist` (`SHOT_DODGE_PLAN=<file>`, suffix `dp`,
  `ShieldTableData.dodgePlans()`). Tests: `ShotDodgerTest` (DODGE-4, DODGE-5), `ShotDodgePlannerTest` (DODGE-6).
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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| MOVE-9 | Event | When an enemy bullet hits us in a duel, the core shall write an HF record of the hit's class (`headon`, `linear`, `learned`, or `nowave` when no firing wave carried it), its guess factor, where a linear gun would have aimed, the share of the wave's guess factors the danger views scored less dangerous than the hit's, the distance at fire time, the power, whether the Duel drove, and where the hit lay against the surf's last plan on that wave (its offset in plan half-widths, the plan's danger and its age in ticks), read before the hit teaches the views and without changing the surf's neighbour cache. | R9 |
| MOVE-10 | Event | When an enemy bullet hits us in a duel, the HF record shall also say, for each of the three-option surf's options (counter-clockwise, stop, clockwise) as first rated on that wave, whether the hit lay inside that option's plan interval, marking the option taken, and how many ticks before the hit they were rated. | R9 |
| MOVE-11 | State | While the gun-heat wave switch is on, in a duel, and the enemy's estimated gun heat is no more than one tick's cooling, with fewer than two firing waves surfable, the surf shall treat the movement wave of the first tick of that ready spell (held until it has gone or is found to be a real shot, then the newest wave), at the power of the enemy's last detected shot (1.9 before the first), as one more wave to surf after the firing waves, and that wave shall feed no hit-rate, flattener or HF record; with the switch off the surf shall be unchanged. | R9 |
| MOVE-12 | State | While the escape-room switch is on, in a duel, the surf shall multiply the danger it scores for the first surfable wave, in the three-option and the go-to modes alike, by the ratio of our enemy's in-field escape room to the square of ours: `restriction(our end, enemy)` over `restriction(enemy, our end)` squared, where `restriction` is the in-field maximum escape angles on both sides summed over twice `asin(8 / bullet speed)`, our end being where we are when the wave reaches our centre; with the switch off the surf's scores shall be unchanged. | R9 |
| MOVE-13 | State | While the gun-heat wave switch is on and its hold switch is off, in a duel, the surf shall take this tick's newest movement wave as the provisional wave on every ready tick instead of holding one; with the hold switch on the surf shall hold it as MOVE-11 states. | R9 |
| MOVE-14 | State | While the protean switch is on, in a duel, and the enemy's estimated gun heat is no more than one tick's cooling with no firing wave within 10 ticks of us, the surf shall choose among its three options by the protean pick: the options whose danger is within half the least danger plus 0.01 of it are drawn with Gibbs probabilities `exp(-excess / T)`, best first, by a replaying logistic-map die seeded from the enemy's name and the round, where `T` is the views' weighted spread over their mean danger times the least danger, plus 0.02 of the least danger; a pick stands for a dwell drawn geometrically around the configured mean, and a new one is drawn when the dwell runs out, when the window opens, or when a new wave is first surfed; outside that window, or with the switch off, the surf shall take the least-danger option. | R9 |
| MOVE-15 | State | While the gun-split switch is on, in a duel, the surf shall take the protean pick at the hot setting (the temperature floor at half the least danger and the cap at the least danger plus 0.01, dwell 1, MOVE-14's window) on the held gun-heat wave (MOVE-11) once at least 6 of the enemy's hits on us in this battle are counted, across its rounds, and at least 60% of them are of the learned class (MOVE-9), and shall take the gun-heat wave afresh each tick (MOVE-13) with no protean pick otherwise; with the switch off, the hold and protean switches shall decide as MOVE-11, MOVE-13 and MOVE-14 state. | R9 |
| MOVE-16 | State | While the replicator switch is on, in a duel, when an enemy bullet's true angle becomes known, the movement shall multiply each danger view's weight by how well that view predicted the bullet relative to the weighted average (the replicator equation), keeping every view's share at least 2%; with the switch off the views' weights shall be fixed. | R9 |
| MOVE-17 | State | While the gun-gate switch is on and the gun-split switch is off, in a duel, the surf shall offer the gun-heat wave (MOVE-11) only while the enemy's gun is not called learning by MOVE-15's count (at least 6 of its hits on us in this battle counted and at least 60% of them of the learned class), and once it is called learning shall surf as with the gun-heat wave switch off, dropping any held provisional wave; with the switch off, or the gun-split switch on, the gun-heat wave shall be offered as MOVE-11 and MOVE-15 state. | R9 |
| MOVE-18 | State | While the distancing-to-enemy switch is on, in a duel, the surf shall measure its distancing factor `2.5^(d0 / d1) / 2.5` to the enemy's last scanned position instead of to the surfed wave's source; with the switch off it is measured to the source. | R9 |
| MOVE-19 | Event | When, with the bullet-hit-bullet switch on, in a duel, a bullet of ours destroys an enemy bullet whose wave is found, the movement shall teach every hit view the guess factor that bullet was fired at, as for a hit on us; with the switch off the wave is only flagged. | R9 |
| MOVE-20 | Event | When, with the hit-clears-cache switch on, in a duel, an enemy bullet hits us or one of ours destroys an enemy bullet, the movement shall clear its cached neighbour searches; with the switch off they are cleared only when the surfed wave changes. | R9 |
| MOVE-21 | State | While the point-kernel switch is on, in a duel, the danger of an intersection shall weigh each neighbour by the point value `2^-abs(u)` at the intersection's centre (u in half-widths), scaled by the share of the intersection the shadows let through; with the switch off, by MOVE-4's integral over it. | R9 |
| MOVE-23 | State | While the stack-list switch is on, in a duel, the stop-and-start stack (MOVE-13's gun-heat wave held off, SHIELD-14's uncertain-shot wave, and MOVE-20, MOVE-21 and TIME-6 whenever those switches are on) shall apply only to an opponent not on the stack off-list, matched as the shield list is (`package.Class` for every version, or with a version for that one); against a listed opponent every one of those switches shall act as if it were off; an opponent not yet named or not listed gets the stack; with the switch off the switches are as their own requirements state. Off by default. | R9 |
| POW-12 | State | While the pressure-power switch is on, in a duel, our energy exceeds 12, the lead-aware regime (POW-7 to POW-9) is not in force, and this battle's rolling hit rates (the estimates POW-2 and POW-4 read) are known with our rate less its margin at least 12% and theirs plus its margin at most 9%, the gun shall skip the cubic power-down and fire a base power of 2.5 beyond 150 px (2.95 inside 150 px stays), and POW-1 to POW-5, the quarter-of-their-energy cap, END-3, END-4, RAM-1 and SHIELD-4 shall apply to that power in their present order; with the weaker form of the switch on, only the power-down shall be skipped and the base power 1.95 kept; with the switch off, or in a melee or team battle, the gun's power shall be as before. Two gate variants (each off by default) replace the rate test only, keeping the energy floor and the yield to the lead-aware regime: the "always" variant (`pwall`) shall apply pressure power on every duel aim, and the "centres" variant (`pwc`) shall apply it while our rolling hit rate is at least 12% and theirs at most 9% by their centres, each window holding at least 30 outcomes; with both on, "always" wins. | R9 |
| POW-13 | Optional | Where the close-power switch is on (ablation `close200`), in a duel, the gun shall fire power 3 inside 200 px (Ogi's melee rule, MGUN-13), in place of 2.95 inside 150 px, under the same caps; off, the duel keeps 2.95 inside 150 px. | M7 |

- **POW-12** (pressure power, docs/plan-midrange.md stage 1; the plan calls it POW-11, which D1 already holds for the battle-long hit rates) is `PowerPolicy.pressure`, read in `DuelController` through `PowerDesign.PRESSURE` (off) and `PRESSURE_BASE_ONLY_POWERDOWN` (off). The gate reads `ourWindow` and `theirWindow`, the estimates POW-2 and POW-4 read, and yields to the lead-aware regime explicitly, because that regime reads the battle-long rates or the profile's verdict and the two could otherwise overlap. It changes only the gun's base through `GunController.Stakes.PRESSURE` / `PRESSURE_DOWN`; every rule after the gun's choice runs unchanged. Duel only: `enemiesTotal <= 1` gates it and the melee gun ignores `Stakes`. Ablations `pressure` (pw) and `pdown` (pd) in `build-ablation.sh`. The margin gate cannot open over the 100-shot window (the Agresti-Coull margins, about 7 points ours and 5 theirs, need 21+ hits and at most 3 against), so two switchable gates exist: `PowerPolicy.pressureAlways` (`PowerDesign.PRESSURE_ALWAYS`, ablation `pwall`, suffix pa) and `PowerPolicy.pressureCentres` (`PowerDesign.PRESSURE_CENTRES`, ablation `pwc`, suffix pz because pc is pc10's). Precedence in `PowerDesign.pressureHolds`: always, then centres, then the margin gate; all need `PRESSURE`, which the ablations set.

- **MOVE-23** (MOVE-22 is unused here) is `MoveDesign.STACK_LIST`, ablation `stacklist` (xl), read in `DuelController` as the per-opponent `stackOn`, decided when the opponent is named (`announce`): `HEAT_WAVE`, `HEAT_HOLD` (a listed opponent takes the hold, its shipped value), `KEEP_SECOND_WAVE`, `HIT_CLEARS_CACHE`, `POINT_KERNEL` (set again on the move controller at that point) and SHIELD-14's `wall` are each ANDed with it, so with the switch off (`stackOn` always true) nothing changes. The list is `hadur-bench/stack-off-top200.txt` (197 versionless names), held in `hadur-robot`'s `StackListData` and handed to the core inside the `ShieldList` object as lines marked `stack-off:` (`ShieldList.onStackOffList`), so the conductor's constructor is untouched.
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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| BENCH-90 | Ubiquitous | The bench shall carry the movement lab: `hadur-bench/lab-panel.txt`, a set file naming the six reference shooters `lab.HeadOn`, `lab.Linear`, `lab.Circular`, `lab.GFHist`, `lab.Knn` and `lab.PatternMatch` at version 1.0 with their jars in `opponents/` (built by `lab/build-lab.sh`), and `data/tools/move_lab.py`, which for each `LABEL=WORKDIR` reports per opponent the damage Hadur took per round, the rounds it survived and the shooter's hit rate, and for two labels the second minus the first over the seeds both fought, as mean and 95% interval. | R9 |

## AES: refitting the surf's danger blend (AES-1, MOVE-22)

The AES assessment (docs/plan-aes.md) keeps one experiment: fit the weights that blend the surf's
danger terms offline, against the bullets the engine says were fired, on the flat-mover x
learning-gun bots. AES-1 records the terms; `data/tools/aes_rank.py` joins them to the truth log,
checks the re-blend picks what the surf picked, and fits.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| AES-1 | State | While the AES-record switch is on, in a duel, at the first tick the three-option surf publishes its options on a wave (MOVE-10), the duel shall emit one `AES` telemetry record holding the wave's fire time, power, whether a real bullet rides it, its source, the option taken, the number of danger views, and for each option with a plan on the wave its total danger, its plan interval, its first wave's danger, and every term `SurfMover` blends into it (hit-rate term, shadowed share, views' score, damage, uncertain flag, time to impact, distancing quotient, escape multiplier, and each view's weighted density and weighted scan weight, or the fallback's danger); that tick's rating shall be made without the cutoff, and the option taken shall be the one the surf takes with the switch off. With the switch off no record is made. | R9 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| ORACLE-1 | State | While the oracle-record switch is on, in a duel, at the first tick the three-option surf publishes its options on a wave (MOVE-10), the duel shall emit one `ORC` telemetry record holding the wave's fire time, power, whether a real bullet rides it, its source, absolute bearing, orbit direction, maximum escape angle and distance, the option taken, each option's plan interval, and for each danger view whether it is on with data, its weight in the danger average and every neighbour it finds for the wave (guess factor and scan weight, as the views' score weighs them); the neighbours shall be searched in a cache slot of their own, so the option taken is the one the surf takes with the switch off. With the switch off no record is made. | R9 |
| ORACLE-2 | Ubiquitous | `data/tools/gun_oracle.py` shall join each `ORC` record on a real wave to the enemy bullet fired on it, rebuild every view's surface with the surf's own kernel, and rate each model (uniform, each view, the shipped blend, the head-on, linear and circular aims from the truth log) by log2 density at the bullet's guess factor over the uniform's and by the share of bullets from the third of the wave the model rated least dangerous, each opponent weighted equally; with AES records in the same battles it shall report the share of options whose views' score it rebuilds to 0.1% and of waves on which the rebuilt scores pick the option the surf took. | R9 |
| ORACLE-3 | Ubiquitous | `gun_oracle.py join` shall keep each joined wave's battle, fire time and whether its bullet hit Hadur and when (matched to the battle's `HF` records; a hit with no guess factor matches none), and `score` shall rate, beside the K0 models, the rolling blend of K1: the views' normalised surfaces mixed with weights 2^(power x score), a view's score being a decaying mean of log2 of its density at the bullet's guess factor over the uniform's, updated along the battle in fire order only from bullets that hit Hadur and had hit by the rated wave's fire time; and, for reference, each opponent's best fixed mix of the views fitted in hindsight to the scored objective. A data set joined without those columns shall score the K0 models only. | R9 |
| ORACLE-4 | Ubiquitous | `gun_oracle.py join` shall keep every enemy bullet of the truth log as a wave: its fire tick, power, absolute bearing from the shooter to Hadur, Hadur's orbit direction and maximum escape angle, Hadur's state when the enemy aimed (lateral and advancing velocity, acceleration, ticks since reversing and since slowing, distance, wall room ahead and behind, flight time) and the tick the wave passed Hadur with Hadur's guess factor then; and `score` shall rate the visit member (each rated wave's nearest already-passed waves of the battle by those features, a kernel where Hadur was when each passed), the shipped blend with a quarter of it, the rolling blend over the views and the head-on, linear and circular aims (each aim a member whose likelihood is learnt as a view's, its weight scaled by a standing 0.3 against a view's), each model's bits after its best further uniform mix, and each model's mean danger percentile of the bullet. | R9 |
| MOVE-29 | State | While the aim-member switch is on, in a duel, the three-option surf's danger where the views have data shall be the weighted mean of the views' score and the head-on, linear and circular simple aims' (one tick back, each the surf's kernel on the aim's angle over the intersection), each member weighted by its standing weight (1 for the views, 0.1 for an aim) times 2^(2 x its rolling score), the score a mean decayed by 0.8 a bullet of log2 of the member's probability at each bullet that hit us over a uniform guess's (mixed with 5% uniform), learnt before the views learn the bullet. With the switch off the danger is the views'. | R9 |
| BENCH-134 | Ubiquitous | The bench shall carry the `pc-k0-oracle` card: the current release with `aesrec,oracle` on `aes-flat-learning.txt` (the 432 learning guns on flat movers), 2 fresh seeds from 4200, truth log on, 12 workers, stopping on 30 failed battles, 40+ skipped turns a battle over the last 200 or no battle in 30 minutes; then the oracle's join and score, and a results PR only after both pass. | T7 |
| BENCH-135 | Ubiquitous | The bench shall carry the `pc-team-path2` card, which runs PATH (TMODE-25) forced on for every team (`mp`) and a bb A/A against aa on all 46 teams at 16 fresh seeds from 5100, and gates the pooled gain (each team's mp gain less half its bb gain, summed over 46) at +0.30 APS with the 95% low end above zero; the card changes no robot code. | T7 |
| BENCH-139 | Ubiquitous | The bench shall carry the `pc-team-dodge` card, which screens DODGE (TMODE-27) forced on (`dg`) beside a bb A/A against aa on all 46 teams at 12 seeds from 5400; gates DODGE as every team's default on the pooled gain (each team's dg gain less half its bb gain, summed over 46) at +0.30 APS with the 95% low end above zero; picks per team DODGE at +3.0 points or more over both baselines with the low end above zero (a team the shipped table names keeps its entry's modes); and gates the picked table on 16 fresh seeds from 5500 at +0.30 APS; only a passed per-team gate writes that table as the table to ship. | T7 |
| BENCH-142 | Ubiquitous | The bench shall carry the `pc-team-dodge2` card, which runs DODGE (TMODE-27) forced on (`dg`) and DODGE with its own-fire switch (TMODE-29, `dgof`) beside a bb A/A against aa on all 46 teams at 16 fresh seeds from 5600 and 12 rounds, and gates each arm's pooled gain (each team's gain less half its bb gain, summed over 46) at +0.30 APS with the 95% low end above zero; the card changes no robot code. | T7 |
| BENCH-138 | Ubiquitous | The bench shall carry the `pc-k1-aim` card: the current release (c), its A/A copy (aa) and the aim members on (km, MOVE-29) on `aes-flat-learning.txt` (the 432 learning guns on flat movers), 1 fresh seed from 4400, 12 workers, truth log off, stopping on 30 failed battles, an arm scoring nothing in 8, 40+ skipped turns a battle over the last 200, no battle in 30 minutes or an A/A outside its band after 20%, and finishing early once km cannot reach +0.05 APS at z 3 after 30%; then the gate (km minus pooled c and aa over the 432 / 1,217 pairings at +0.05 APS, 95% low end above 0), per-robot losses, the oracle re-joined on the pc-k0-oracle battles when they are on the PC, and a results PR only after the gate passes its analysis. | T7 |
| BENCH-140 | Ubiquitous | The bench shall carry the `pc-sg-aim` card: the current release (c), its A/A copy (aa) and the aim members on (km, MOVE-29) on `simple-guns.txt` (the 434 census opponents with head-on, linear, linear+learning, head-on+learning or mixed guns), 1 fresh seed from 4800, 12 workers, truth log off, with pc-k1-aim's stop rules and futility at +0.05 APS after 30%; then the gate (km minus pooled c and aa over the 434 / 1,217 pairings at +0.05 APS, 95% low end above 0), per-robot losses and a results PR. | T7 |
| BENCH-141 | Ubiquitous | The bench shall carry the `pc-census-320` card: master with MOVE-29 off (c, ablation noaim), its A/A copy (aa) and master as it stands (km) on the 1,212 census robots of `census-312.txt`, 1 fresh seed from 4900, 12 workers, truth log off, with pc-k1-aim's stop rules except skipped turns at 60 a battle over the last 200 (the whole field's healthy level is 31 to 40) and no futility rule; then the gate (km minus pooled c and aa over the field / 1,217 pairings at +0.18 APS, the gap from 3.19 live to 3rd, 95% low end above 0), per-robot losses and a results PR. | T7 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| MGUN-7 | State | While in melee off a team, the field gun shall give each opponent with at least twenty-four learned situations twenty-four firing solutions from its most similar situations, sharing the opponent's weight, and an opponent with fewer one circular or linear solution; on a team it shall keep MGUN-1's three. | M7 |
| MEND-1 | Optional | Where the `THREE_RING` switch is on, while in melee off a team with two opponents alive, movement shall keep the candidate ring and lateral weight it uses with three or more, in place of MMOVE-4's. | M7 |
| MEND-2 | Optional | Where the `THREE_POWER` switch is on, while in melee off a team with two opponents alive, the gun shall take its power from MGUN-3's crowd table, in place of the duel's table. | M7 |
| MEND-3 | State | While in melee off a team with two opponents alive, movement shall weight a point where it would be an opponent's closest robot four times the base risk, in place of MMOVE-2's two. | M7 |
| MGUN-11 | Optional | Where the `CROWD` switch is on, while in melee, the field gun shall describe each opponent's situation also by the distance from it to its nearest robot (Hadur included), whether it is moving toward or away from that robot, and the opponents alive, beside MGUN-1's five attributes. | M7 |
| MGUN-12 | Optional | Where the `CROWD_FLOOR` switch is on, while off a team with three or more opponents alive and 20 energy or more, the melee gun shall fire a target that is not a finisher at no less than power 1.9, still capped by the power that kills the target, by Hadur's energy lead over it and by Hadur's own energy. | M7 |
| MGUN-13 | State | While MGUN-12's conditions hold, the melee gun shall fire power 3 at a target within 200 px and 1.92 beyond, in place of the table, under the same caps. | M7 |
| MGUN-14 | Optional | Where the `OGI_TWO` switch is on, MGUN-13 shall also apply off a team with two opponents alive, in place of the duel's table. | M7 |
| MGUN-15 | Optional | Where the `OGI_LOW` switch is on, MGUN-13 shall apply from 10 own energy in place of 20. | M7 |
| MGUN-16 | State | While MGUN-13 applies, it shall fire power 3 at a target within 300 px in place of 200. | M7 |
| MGUN-17 | Optional | Where the `EXPERTS` switch is on, while in melee off a team, each targeting wave (MGUN-4) shall also score head-on, linear and circular aims at its opponent beside the field gun's own, decayed 0.95 a wave, and once twenty waves have reached an opponent a simple aim whose smoothed hit rate is at least 1.25 times the field gun's shall replace that opponent's solutions with one solution weighted by the field gun's own peak share of the opponent times that ratio, capped at the opponent's weight. | M7 |
| MGUN-18 | Optional | Where the `HIT_TARGET` switch is on, while in melee off a team, the field gun shall multiply an opponent's weight by 5 (h + 1) / (n + 5), with h the decayed virtual hits of the aim the gun fires at it (MGUN-17's pick when that applies, else the field gun's own) and n its decayed waves, and by 1 before any wave has reached it. | M7 |
| MGUN-19 | Optional | Where the `FLAT_DISTANCE` switch is on, while in melee off a team, the field gun's distance weight shall be (100 / max(50, d))^0.7 in place of 100 / max(50, d). | M7 |
| MGUN-20 | Optional | Where the `SOFT_MATCH` switch is on, while in melee off a team, the field gun shall weight each of an opponent's situations by 1 / (its distance + the mean distance of the situations chosen), in place of 1 / (0.01 + its distance). | M7 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TIME-8 | Event | When the robot finishes its first-round setup, it shall print one `SETUP,0,0,warmMs,coreMs,memoryMs,totalMs` record giving the time spent warming up, building the core and loading memory. | R9 |
| RES-15 | Event | When a battle ends, the health record shall add the setup time, the first turn the main loop ran and the longest run of consecutive skipped turns, and stay within 64 bytes. | R9 |
| BENCH-91 | State | While a round has a winner, the bench's per-round row shall keep the damage and survival of the turn the first robot died, so a disable after the round is decided does not turn a win into a loss. | R9 |
| BENCH-92 | Event | When an arms file is given (`--arms FILE`), the bench shall fight every (opponent, seed) job against every arm, cold, in an order shuffled from the job, and write one row per battle to `arms.tsv` and a per-arm table to the report. | R9 |
| BENCH-93 | Option | Where pinning is on (`--pin true`), the bench shall bind each battle's JVM to its worker's own logical processors, leaving the first `--pin-offset` to the OS, and refuse more workers than the processors allow. | R9 |
| BENCH-94 | Ubiquitous | The bench shall carry `data/tools/multiarm.py`, which reads one or more `arms.tsv` files and reports each arm against the pooled control and A/A arms per opponent with 95% intervals, the A/A check, the split by band, engine and start-up disables per arm, and factorial main effects from a design file. | R9 |
| BENCH-95 | Event | When a multi-arm run starts in an output folder where a stopped run already finished some battles, the bench shall read back each battle that finished ok for the same arm (label and robot), opponent and seed, and fight only the rest, unless resuming is turned off (`--resume false`, `--no-resume`). | R9 |
| BENCH-96 | Event | When a team run starts in an output folder where a stopped run already finished some team battles, the bench shall read back each battle that finished ok for the same team, opponent and seed (candidate and baseline alike), and fight only the rest, unless resuming is turned off. | R9 |
| BENCH-97 | Option | Where the truth log is off (`--truth-log false`), a duel battle shall write no `truth.log.gz` and shall still count the enemy shots and every other figure its result row and report carry. | R9 |
| BENCH-98 | Ubiquitous | The bench shall carry `tools/ladder.py`, which reads bench run folders and reports per run the battles an hour, skipped turns a round, engine disables a 100 battles and truth-log disk a battle against a base run, names the widest truth-on run inside the skip and disable limits that is no slower than the base, and compares each truth-off run with the truth-on run of its width. | R9 |
| BENCH-99 | Ubiquitous | The bench shall carry `tools/table_v1.py` and the `slistadd` ablation, which together build mode table v1's shield entries: the screen panel (census robots off the shield list and outside a named set), the confirm set (robots a pick locked with a shield arm), the final list (locked with sasq in the confirm pick and with a shield arm in a first pick), the census candidate (SHIELD-16, the aim the final robots were confirmed with, plus the final robots added to the shield list), and the census gate verdict (+0.5 APS census-weighted with the lower 95% end above +0.3, the A/A inside its band and at least 95% of the census robots read in all three arms). | R9 |
| BENCH-100 | Ubiquitous | The bench shall carry `tools/shield_s2.py`, the `smove`, `srec`, `smovelist` and `saimlist` ablations and the `pc-shield-s2` card, which together build shield part 2 of the mode table: the list adds and opening-drive robots from a screen pick, a shipped aim for each robot the candidate shields (the predictor at least half its battles end on with five or more exact matches, and the median offset), the candidate t2, and the verify gate (t2 minus pooled c and aa summed over the panel and divided by 1,217 pairings, PASS at +0.15 APS with the lower 95% end above 0 and the A/A inside its band). The card's control shall be the version the build makes. | R9 |
| BENCH-101 | Ubiquitous | The bench shall carry `tools/modes_v2.py`, the `sgo`, `sgo2`, `sgolist`, `sgo2list`, `sdodge` and `sdodgelist` ablations, the Saguaro poison and low-normal panels and the `pc-1v1-modes` card, which together build mode table v2: per robot, stop-and-go's variant locked from the screens at +5 points with the 95% interval above 0, the candidate t3, and the verify gate on the robots t3 has an entry for, on fresh seeds, as BENCH-100's. | R9 |
| BENCH-102 | Ubiquitous | The bench shall carry `tools/shield_s3.py` and the `pc-shield-s3` card, which together build the 1v1 table's last per-opponent entries before top 5: a warm-start shield screen of the Saguaro shield robots the list leaves out (each with the shipped aim its shield part 2 screen battles end on, by BENCH-100's rule, with and without the opening drive), a stop-and-go second pass on the Saguaro poison robots table v2 left out (fresh seeds pooled with table v2's screen, locked at +3 points with the 95% interval above 0), the candidate t4 and the verify gate on fresh seeds as BENCH-100's with the bar at +0.05 APS. When nothing locks, the verify still runs (t4 the A/A copy) so the card ends in a results PR. | R9 |
| BENCH-103 | Event | When a melee round ends, the bench shall also record in `rounds.csv` the tick the field fell to Hadur and one other, Hadur's and that survivor's energy at that tick (`-` when the round never came to it), and the bullet damage Hadur took, capped at its energy, while three or more fighters were alive and while two were. | R9 |
| BENCH-104 | Ubiquitous | The bench shall carry `tools/melee_s0.py`, the `melee-census-317` fields (every robot of the 2026-10-25 MeleeRumble rankings but Hadur and the robots without an archive jar, nine to a field) and the `pc-melee-s0` card, which together run melee Stage 0 (docs/plan-melee-top5.md): master against itself on the census at the machine's melee width and CPU constant (BENCH-105; 12 and 1488498 on the PC) and on six fields at half that width, and a read with the A/A gate (paired APS within 0.2, 95% half-width under 0.3), the census level and live projection, rounds won by the field's strongest opponent, the endgame duels by survivor rank with both energies at their start, deaths before the last two and damage taken by phase. The card reads the robot version from the pom and ends in a results PR whatever the gate says. | R9 |
| BENCH-105 | Ubiquitous | The bench shall size itself to the machine it runs on: `hostprofile.py` shall read the physical cores, logical processors, free memory, work-disk space and a local Robocode CPU constant, and give one battle worker per two physical cores (12 on the 24-core PC, which always runs its full width), holding back one core (two for melee) and fitting 70% of free memory at 2.3 GB a worker on a machine under 16 cores, never fewer than 1 and never pinned; the queue runner shall offer these as `${WORKERS}`, `${TEAM_WORKERS}`, `${MELEE_WORKERS}` and `${CPU}`, pass them to every step, log the host and widths, and take `--workers`, `HADUR_BENCH_WORKERS*` or `host.local` over them, a plan's `set` over the detected value only; `--parallel auto` and `--cpu-constant auto` shall read the same values; `--work-dir` (or `HADUR_BENCH_WORK`, or `WORK_DIR` in host.local) shall link a not-yet-existing `work` folder there and never move an existing one; `conditions.json` shall record the host profile and where the width came from. | R9 |
| BENCH-106 | Ubiquitous | The bench shall carry `tools/host_check.py` and the `host-check` card, which fight the PC worker ladder's d12 and t12 battles at the machine's own width and report per block VALID (skipped turns a round within 1.15x the PC's plus 0.02, engine disables a 100 within the PC's plus 2, and a duel level within 1.5 points of the PC's) or TOO LOADED with the width to try next. | R9 |
| BENCH-107 | Option | Where a shard is given (`--shard K/N`), the bench shall fight only every N-th opponent of the set from the K-th, so that N machines split one duel or team set with every opponent fought once, and shall refuse a shard of a melee field or a session. | R9 |
| BENCH-108 | Ubiquitous | When a suite's lines are melee fields, the bench shall run `parallel / min(parallel, seeds)` fields side by side (a field fights at most its seeds at once), so the battles in flight fill `--parallel`, and write the suite report in the suite's line order; warm fields shall count their `--battles`, a suite of mixed lines shall take its narrowest, and labels shall be distinct; `--suite-parallel N` shall set the number, and any other suite, or one that keeps data, records fixtures or has no pinned CPU constant, shall run one line at a time; a failing field shall let the others finish. | R9 |
| BENCH-109 | Ubiquitous | The bench shall carry the `pc-melee-s1` card and `tools/melee_s0.py screen`, which run melee Stage 1 (docs/plan-melee-top5.md): an aa baseline, a bb A/A copy and one arm per MEND switch, each alone on the melee census at 6 seeds and the machine's melee width, and a read that pairs every arm's battles with the baseline's by field and seed and reports per arm the paired census APS with its 95% interval, the 1-30 survivor band's endgame wins, deaths with two opponents left and Hadur's energy entering the endgame, and the verdict (pass at +0.3 or more with the interval above 0 and the 1-30 band no more than 3 points worse; the A/A clean within ±0.25). | R9 |
| BENCH-110 | Ubiquitous | The bench shall carry the `pc-melee-s2` card, which runs melee Stage 2 (docs/plan-melee-top5.md) as BENCH-109 runs Stage 1: an aa baseline, a bb A/A copy, the field gun at 24 situations an opponent, with MGUN-11's crowd attributes, with both, and MEND-3 again, each alone on the melee census at 6 seeds after Stage 1's, read by `tools/melee_s0.py screen` with the gun arms' bar at +0.3 replaced by +0.5, MEND-3's kept at +0.3, and an arm also failing when Hadur's share of the others it outlives falls more than 1 point. | R9 |
| BENCH-110 | Ubiquitous | The bench shall carry `tools/factor_picks.py`, which reads the Stage 2 factorial's runs and design and gives, per factor, its field effect, the robots whose own effect is at least 5 points either way, and the APS a per-opponent switch would add measured held out (picked on the design points with a second factor at one level, read on those at the other, both ways, averaged; only picks away from the shipped level count: "on" picks for a factor that ships off, "off" picks, crediting minus the effect, for one named as shipping on, as sw and F have since 3.15), over 1,217 pairings, using only the robots with every design point and counting those left out. | R9 |
| BENCH-111 | Ubiquitous | The bench shall carry `tools/third.py`, `panel-third-dodge.txt` (the 148 Saguaro ShotDodger robots Hadur 3.17 scores under 95 live or Saguaro leads by more than 3), the `sdplan` and `sdplanlist` ablations and the `pc-1v1-third` card: the factorial picks (BENCH-110); a screen of the panel with the control, its A/A copy and the planner at 3 seeds; the planner locked per robot at +5 points with the 95% interval above 0; each locked robot's expert read from its own battles' DP records (a strict majority of those where the planner acted, else -1); the candidate built from those lines; a verify on the locked robots at 3 fresh seeds; the gate of BENCH-100; and a results PR. | R9 |
| BENCH-112 | Ubiquitous | The bench shall carry the `hjlist` and `gslist` ablations (the robots of `$HEAT_JIT` / `$GUN_STACK` get MOVE-28 / GUN-11 entries), the candidate lists `plans/factor-heatjit.txt` and `plans/factor-gunstack.txt` (the Stage 2 factorial's +5-point picks for hj and G, less the robots a shield or stop-and-go entry already drives), `panel-factor-picks.txt` and the `pc-1v1-factor` card: those robots against the control, its A/A copy and the candidate at 6 fresh seeds, the gate of BENCH-100 at +0.03 APS, and a results PR. | R9 |
| BENCH-113 | Event | When a release is published, the release workflow's summary shall name the release watch, and the bench shall carry the `live-watch` card: `data/tools/live_client.py watch` over every RoboRumble client folder under `C:/RoboRumbleWorkers` with the 1v1, melee and team pages of the versions the card names, keeping only those versions' battles (`--robot`) fought after the watch first started (`--new-only`), and stopping at 10 collapses (1v1 battles at least 15 points under the pairing's score on the live page) or 1,000 1v1 battles, whichever comes first, within 72 hours or when a STOP file appears in the watch folder, then polling health records a further minute for the last battle, and logging the hour's battle counts hourly, then `live_client.py report` and a results PR of the watch folder's TSVs (profiles included), report and log (Leigh, 2026-10-26: the watch is part of every release). | R9 |
| BENCH-114 | Event | When one of our team's bullets hits one of our members, the team harvester's `friendly.log` line shall add where the victim stood when the bullet was first shown: the distance along the bullet's line of the nearest living enemy within 60 px of it (`target`), the victim's distance along and across the line, and the hit's kind: `lane` (ahead within 36 px of the line and nearer than the target), `noline` (no target), `walkin` (hit before reaching the target) or `beyond` (hit past it); and `tools/team_losses.py` shall report the kinds' shares per band. | R9 |
| BENCH-115 | Ubiquitous | The bench shall carry the `pc-melee-bank` card, which builds the field gun at 24 situations an opponent and MEND-3 together, and the same with MGUN-13, runs each, an aa baseline and a bb A/A copy each alone on the melee census at 8 seeds after Stage 2's, and reads it with `tools/melee_s0.py screen --base2`, which pairs every arm but bb with the mean of the two baseline copies battle for battle, at a +0.3 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower, and pairs the MGUN-13 stack with the build without it battle for battle, so crowd power passes only when it adds with the 95% low end above 0. | R9 |
| BENCH-116 | Event | When a melee round ends, the bench shall write one `exposure.csv` row per fighter with its ticks alive while three or more fighters were alive, the summed count over those ticks of other fighters whose nearest living fighter it was, the bullet damage it took while three or more were alive (capped at its energy), and the parts of that damage fired by a shooter whose nearest and whose second nearest living fighter it was when the shot was first seen; and `tools/melee_exposure.py` shall read them per 100 crowd ticks for Hadur and for the census opponents by rank band. | R9 |
| BENCH-117 | Ubiquitous | The bench shall carry the `pc-melee-power` card, which builds MGUN-12 (`pfloor`) and MGUN-13 (`pogi`) each alone beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 6 seeds after the bank card's, and reads it with `tools/melee_s0.py screen --base2` at a +0.3 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-118 | Ubiquitous | The bench shall carry the `pc-melee-ogi` card, which builds MGUN-13 (`pogi`) on master's banked gun beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 8 seeds after the power card's, and reads it with `tools/melee_s0.py screen --base2` at a 0 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-119 | Ubiquitous | The bench shall carry the `pc-team-table` card, which picks each team's best of LANEP, LANEB, LINES and LINESW from the lane and lines screens on master at +3.0 share points or more (scored against both of its card's baselines, with MATEFIRE and HUNT kept), confirms the table on the picked teams at 12 fresh seeds beside a bb A/A, keeps the picks that gained +1.0 or more, and gates the kept table at 16 fresh seeds with `tools/team_modes.py gate`: the summed gains over 46 teams at +0.30 APS or more with the 95% low end above zero. | T7 |
| BENCH-120 | Ubiquitous | The bench shall carry the `pc-team-gunline` card, which builds TMODE-19 (`tmgunline`, and `tmgunlinew` at 1.0 and 100 px) beside an aa baseline and a bb A/A copy, runs each against all 46 teams at 6 seeds from 4500, and writes the loss read and `tools/friendly_hits.py` for every arm. | T7 |
| BENCH-121 | Event | When the release watch runs, it shall start each RoboRumble client it names (`--launch FOLDER:LAUNCHER`: rr01..rr04 `roborumble.bat` and `C:/robocode` `meleerumble.bat` and `teamrumble.bat`), write each console to its own file per start, log Hadur's console lines for a stall disable, a thread the engine cannot stop and a skipped turn with their times (`client-events.tsv`), restart each client every `RESTART` minutes at its next battle end or upload or `WAIT` minutes after that if none ends (logged as cut), start again a client that exits, stop every client when the watch ends, and report the counts and 1v1 skipped turns and share by minutes since the client started. | T7 |
| BENCH-122 | Ubiquitous | The bench shall carry the `pc-melee-power2` card, which builds MGUN-14, MGUN-15 and MGUN-16 each alone and all three together beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 6 seeds after the Ogi card's, and reads it with `tools/melee_s0.py screen --base2` at a 0 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-123 | Ubiquitous | The bench shall carry the `pc-team-counters` card, which builds one table jar per screen of plans/team-counters.tsv (each team's counters, TMODE-20 to TMODE-24, played only against that team), runs each against aa on its teams at 16 seeds from 4600 beside a bb A/A, picks per team the screen at +3.0 points or more with the 95% low end above zero, and gates the picked table on 16 fresh seeds from 4700 at +0.30 APS with the low end above zero; only a passed gate writes that table, as benched, as the table to ship. | T7 |
| BENCH-124 | Ubiquitous | The bench shall carry the `pc-team-path` card, which screens PATH (TMODE-25) forced on against all 46 teams at 10 seeds from 4900 and NEAR (TMODE-26) on the shipped TroodonPack entry at 16 seeds from 4900, each beside a bb A/A on the same seeds, picks per team the arm at +3.0 points or more over both baselines with the 95% low end above zero (a team the shipped table names keeps its entry's modes), and gates the picked table on 16 fresh seeds from 5000 at +0.30 APS with the low end above zero; only a passed gate writes that table as the table to ship. | T7 |
| BENCH-125 | Event | When the PC qualification card (`pc-qualify`) runs, it shall set `UPLOAD=NOT` in each named 1v1 client's `roborumble.txt`, run those clients the old way for `HOURS`, put each config back and set the results files aside so no test battle is uploaded, and score each 1v1 battle of the release against the opponent's pairing on a clean page: QUALIFIED within ±0.5 over at least 40 battles, else NOT QUALIFIED. | T7 |
| BENCH-126 | Ubiquitous | The bench shall carry the `pc-shield-exit` card, which builds SHIELD-11's battle exit at 400 damage (`sdmg400`) and with no damage exit (`sdmgoff`) beside an aa A/A copy, runs them against all robots on the shield list at 3 seeds from 3400 and gates each at +0.10 APS with the 95% low end above zero, writes the per-robot pick and every robot's difference with losses (`tools/per_robot.py`), stops before the results PR if any analysis fails, and verifies the three stop-and-go re-picks (`slistdrop,sgolist,sgo2list`) on 6 fresh seeds from 3500. | T7 |
| BENCH-127 | Ubiquitous | The bench shall carry the `pc-melee-wide` card, which builds MGUN-16 alone beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 8 fresh seeds after the firepower part 2 card's, and reads it with `tools/melee_s0.py screen --base2` at a 0 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-136 | Ubiquitous | The bench shall carry the `pc-melee-surf` card, which builds MMOVE-15 beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 6 fresh seeds after the crowd card's, and reads it with `tools/melee_s0.py screen --base2` at a +0.30 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-137 | Ubiquitous | The bench shall carry the `pc-melee-crowd` card, which builds MMOVE-11, MMOVE-12, MMOVE-13 and MMOVE-14 each alone beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 6 fresh seeds after the wide card's, and reads it with `tools/melee_s0.py screen --base2` at a +0.30 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-143 | Ubiquitous | The bench shall carry the `pc-melee-gun` card, which builds MGUN-17, MGUN-18, MGUN-19 and MGUN-20 each alone beside an aa baseline and a bb A/A copy, runs each alone on the melee census at 6 seeds (3234-3239), halts any arm on 20 failed battles or 30 minutes without one, and reads it with `tools/melee_s0.py screen --base2` at a +0.30 bar with the 95% low end above 0 and Hadur's share of the others it outlives no more than 1 point lower. | R9 |
| BENCH-144 | Ubiquitous | The bench shall carry the `pc-team-nododge` card, which builds TeamModes table entries without DODGE for NightmareTeam, ImpactTeam and ImWithStupidTeam (`xd`, tmtab with plans/team-nododge-table.java) beside an aa baseline and a bb A/A copy, runs each against aa on those three teams at 24 fresh seeds from 5900 and 12 rounds, halts a battle step on 20 failed battles, 30 minutes without one or 40 skipped turns a battle over the last 100, and gates the projected change over 46 teams at +0.15 APS with the 95% low end above zero. | R9 |
| BENCH-128 | Optional | Where a multi-arm run is given `--job-order shuffled`, the bench shall fight its (opponent, seed) jobs in an order seeded from the seed base; and when a stopped multi-arm run is resumed, the bench shall read back every finished battle's row, a clean battle's empty errors column included. | T7 |
| BENCH-129 | Event | When a queue step with a `watch:` line runs, the queue runner shall rewrite the plan's progress file every minute with each step's state and, for the watched step, its battles done of the run's size, battles an hour, ETA, failed battles, skipped turns a battle (first and last 100), and each arm's running difference from the pooled control with its 95% interval and the stop rules' z 3 bound, and shall push the progress, without touching the working tree, to the plan's progress branch every `PROGRESS_MINUTES` and at once on a stop. | T7 |
| BENCH-130 | Event | When a step's pre-declared `stop:` rule trips (fails, dead, skips, stall, aa or futility), the queue runner shall kill that step, log the rule, the battles fought and kept and the battles left unrun; for a halt rule stop the queue with the step resumable, and for a finish rule record the step as done early with its rows so far written as its `arms.tsv`, so the steps after it run. | T7 |
| BENCH-131 | Event | When a stop rule trips or a watched step fails and the plan sets `ALERT`, the queue runner shall open a GitHub issue assigned to that login carrying the progress file. | T7 |
| BENCH-132 | Ubiquitous | The bench shall carry the `pc-1v1-ram` card, which builds RAM-5 on (`rambrk`) and SHIELD-19's exits for pc-shield-exit's 7 per-robot picks (`sx4list,sx0list`) beside an aa A/A copy, runs RAM-5 against the 45 rammers and perfect-prediction robots and the exits against the 7 robots at 6 fresh seeds each (from 3600 and 3700), gates RAM-5 at +0.05 APS and the exits at +0.01 APS with the 95% low end above zero, writes every robot's difference with losses, and stops before the results PR if any analysis fails. | T7 |
| BENCH-133 | Ubiquitous | The bench shall carry the `pc-1to1` card, the 1:1 tournament of docs/bench/local/2026-10-28_one-to-one-map.md: on `panel-1to1-shield.txt` (the 124 robots DrussGT or Nullstride shield and Hadur surfs, rammers out) it runs c, aa, `shield-all,sdmg400`, `shield-all,smove,sdmg400` and `strial`; on `panel-1to1-learn.txt` (the 103 learning- or mixed-gun robots on stat-prone or oscillating movement that Hadur plays normally and scores under 97 against) it runs c, aa, `sgo`, `sgo2` and `sdplan`; each at 6 fresh seeds (from 3800 and 3900), truth log off, 12 workers; it reads each arm's panel gate, `mode_table.py` picks at margin 5 and every robot's per-arm difference with losses, and stops before the results PR if any analysis fails. | T7 |
| RAM-4 | State | While the rammer-heat switch is on, in a duel, once RAM-2 has confirmed the opponent as a rammer, the surf shall offer MOVE-11's gun-heat wave with MOVE-13's hold off (as heatjit plays) for the rest of the battle, whatever those switches are set to; before the confirmation, and in melee or team, the switches are as their own requirements state. Off by default. | R9 |
| RAM-5 | State | While the rammer-dodge switch is on, in a duel, while RAM-2's escape drives, each enemy shot read shall be kept with two aims, head-on at our position on the tick before it left and linear along our heading and speed then, and each candidate path the escape plays shall lose 60 px of its closest approach for every kept aim whose bullet would come within 22 px of us on both axes on that path; with the switch off, or in melee or team, the escape chooses as RAM-2 states. On by default since pc-1v1-ram (PR #394). | R9 |

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
- **RAM-4.** `MoveDesign.RAM_HEAT`, ablation `ramheat` (rh), read in `DuelController` as
  `ramHeat(duelOnly(RAM_HEAT, enemiesTotal), rammer.confirmed())`, which ORs into `HEAT_WAVE` and
  takes `HEAT_HOLD` off; still ANDed with MOVE-23's `stackOn`. Why: the top-5 factorial (PR #221,
  1,212 bots) put heatjit's whole +0.10 APS on the 87 rammers (+1.39 points) and -0.055 APS on
  ranks 51-400. Tested in `DuelOnlySwitchesTest`; screened and censused by `plans/pc-top5-s34.queue`.
- **BENCH-105.** `hadur-bench/hostprofile.py`, `benchqueue.py` (host variables, `host`, `--workers`,
  `--work-dir`), `HostWidth.java` (`--parallel auto`, `--cpu-constant auto`); tested by
  `test_hostprofile.py`, `test_benchqueue.py` (HostTest) and `HostWidthTest`. Why: Leigh 2026-10-25,
  a laptop as a second bench machine; the PC keeps its measured 12 (PR #232). See
  `docs/bench/second-machine.md`.
- **BENCH-106.** `hadur-bench/tools/host_check.py`, `plans/host-check.queue`; tested by
  `tools/test_host_check.py`. Why: a laptop's numbers stand beside the PC's only if its skipped
  turns and level match the PC's on the same battles.
- **BENCH-107.** `HostWidth.shard`, `--shard`; tested by `HostWidthTest`. Why: two machines on one
  census without fighting an opponent twice.
- **BENCH-108.** `Bench.runSuite`, `Bench.suiteLinesAtOnce`; tested by `SuiteParallelTest`. Why: pc-melee-s0
  (results PR #292) asked for 12 workers on the PC but ran 4 battles at a time, because each 4-seed field
  only has 4 battles and the suite ran fields one by one; Leigh: "Main PC should always go max".

## 3.15: the census winners shipped (MOVE-24, SHIELD-14 on)

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| MOVE-24 | State | While in a duel, the surf's danger score shall leave the two flattener views (`flattener`, `flattener2`) off whatever the hit rate, ADAPT-2's flattener-first or MOVE-2's flavour ask, and turn the other views on by their own thresholds; in melee and team the views are as ADAPT-2, MOVE-2 and MOVE-5 state. | R9 |

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

| ID | Requirement | Retired | Replaced by |
|---|---|---|---|
| GATE-1 | While two or more opponents are alive, no sentry robot is alive, no sentry has been scanned this round and the melee subsystems have not failed this round, the core shall drive the robot with the melee subsystems instead of the duel subsystems. | A1 | ROLE-3 (the same conditions, plus the latch: once the duel has driven in a round, melee does not return) |
| MELEE-1 | While two or more opponents are alive, the core shall drive the robot with the melee subsystems (sweep radar, minimum-risk movement, melee gun) instead of the duel subsystems. | M1 | GATE-1, GATE-2 (sentries and melee faults now keep the duel) |
| MELEE-3 | While in melee, the radar shall sweep the full circle until every living opponent has been scanned, then keep turning toward the opponent scanned longest ago. | M2 | MRADAR-1, MRADAR-2 (the sweep now keeps spinning with four or more alive and rescans a weak target) |
| MELEE-4 | While in melee, movement shall head for the candidate point of least risk, where risk grows with each opponent's energy over distance squared, near walls and corners, between two opponents, and with fewer escape routes. | M3 | MMOVE-1 to MMOVE-4 (minimum risk over 160 points with the closest-robot term and virtual bullets) |
| MELEE-5 | While in melee, the gun shall target the opponent with the lowest score of energy, distance and gun turn, and shall switch from a living current target only when another scores at least 20% lower and the gun can reach it within 4 ticks. | M4 | MGUN-1 (the field gun aims at the peak of every opponent's solutions, so there is no single target to hold) |
| MELEE-6 | The melee gun shall aim with circular prediction, fall back to linear prediction while the target's turn rate is unknown, and fire no more power than needed to kill the target. | M4 | MGUN-1, MGUN-2, MGUN-3 (learned play-it-forward aim, circular and linear only as the fallback; the energy table and exact kill power) |
| MELEE-8 | While two opponents within 300 px of each other, and further from us than from each other, are both losing energy to others, the strategy shall keep clear of their fight and halve fire power. | M6 | MMOVE-5 (keep clear, unchanged), MGUN-5 (full power: the M6 sweep found the posture's power cuts and holds cost score) |
| RES-9 | If the engine has skipped three turns in a round, then the core shall run the rest of the round at a duress level that adds no samples, builds no waves, reads no neighbour tree, orbits at the distance floor and fires head-on at power 1.0 whenever the gun is cool and the fire permission is given (WEAVE-3). | D1 | RES-14 (the same duress level, which ended after 300 ticks without a skipped turn), itself retired in 3.11 (below) |
| SAOR-9 | Where the bot has collided with a robot, the oscillation leg shall be 50 px until that robot is next scanned. | Saor 0.2 | none: stage 4 measured the ram leg level (S1 against DC, +0.03 APS), and its 13 bytes pay for SAOR-7's graded vote |
| SAOR-8 | While fewer than 3 opponents remain, bullet power shall not exceed 1.9. | Saor 0.3 | SAOR-17 (no cap): stage 5 (pc-saor-s05, PR #360) measured LAU, no cap and learning on every target scan, at +0.49 ± 0.33 on the MicroMelee census and +0.26 ± 0.26 live-shaped |
| RES-14 | If the engine has skipped three turns in a round, then the core shall run at the duress level RES-9 defines until 300 ticks have passed without a skipped turn. | 3.11 | none: a round is never in duress, and skipped turns still shed levels (TIME-2) and teach the allowance (TIME-3). 3.11 census (docs/plan-3.11-census.md): duress cost +0.73 APS on the whole field and 37 points of share on a slow client |

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

## Core surf rebuild: the stop-point surf (MOVE-25, MOVE-26, MOVE-27)

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| MOVE-25 | State | While the stop-point surf switch is on, in a duel, on a tick with a surfable wave and the tick budget allowing go-to surfing, the surf shall drive to the stop point (where we stand, or one reached along either orbit before the wave passes, kept 7 px apart) whose danger is least, the danger being, per wave, the views' neighbours as a guess-factor histogram smoothed with a Cauchy kernel 0.1 of a guess factor wide and normalised to 1, its mass over the precise intersection of driving there counting only what the bullet shadows let through, times the bullet damage, over sqrt(4 + ticks to impact), times the distancing factor and (650 - 34) / (d - 34) at the leg's end, with the second wave's least such danger added for the ten cheapest first-wave points; and shall keep the point until the waves surfed change, their bullet shadows are recomputed, the danger views learn a hit or a visit, or we are more than 2 px from the planned path. Otherwise the three-option or go-to surf drives. Each round's end shall write `GH,round,tick`, the round's ticks with a cool gun and those of them with the gun 0.05 degrees or more off its aim. Off by default; melee and team never take it. | R9 |
| MOVE-26 | State | While MOVE-25 and the simple-aim mix switch are both on, in a duel, the shot dodger shall read every opponent's bullets and the stop-point danger shall be (1 - s) times MOVE-25's mass plus s times whether the most-matched simple aim's bullet crosses the intersection (within DODGE-2's margin, at the shadows' transmission), with s that aim's matches over the bullets read plus 2, and 0 below 2 matches. Off by default. | R9 |
| MOVE-27 | State | While MOVE-25 and the enemy-gun ensemble switch are both on, in a duel, every firing wave that passes us shall teach six visit-count mimics (rolling-average guess-factor buffers, each with its own segmentation of the wave from the shooter's side and its own depth) where we were; every enemy bullet whose angle we learn shall, before anything learns it, update each model's rolling score (rate 0.05) with its probability within 0.05 of the bullet's guess factor relative to a uniform guess, the views on their histogram, the views starting at 2 and the mimics at 0.5; and MOVE-25's histogram shall be the views' and every mimic with data blended in proportion to their score cubed; and each round's end shall write `GM,round,tick` and the scores, the views first. Off by default. | R9 |
| MOVE-28 | State | While in a duel against an opponent the table's `heat-jit: name` lines name (matched as the shield list is), the surf shall play MOVE-13's stop-and-start as RAM-4 gives it to a confirmed rammer (the gun-heat wave offered, no hold); in melee and team, and against any other opponent, it shall play exactly as before. | R9 |

- **MOVE-25.** `MoveDesign.STOP_POINT_SURF` (false), ablation `surfb` (sb), `move/StopPointSurf.java`,
  handed the tick by `SurfMover.move` before the mode is read. The histogram is
  `MoveController.dangerProfile` (the views, weights and neighbour cache `getDangerScore` uses).
  Why: docs/bench/surf-b-rivals-read.md (DrussGT's and BeepBoop's planners).
- **MOVE-26.** `MoveDesign.AIM_MIX` (false), ablation `aimmix` (am), `StopPointSurf.mass` and
  `simpleAimShare`; the dodger is `physics/ShotDodger` (DODGE-2), turned on in `DuelController.announce`.
- **MOVE-27.** `MoveDesign.MIMICS` (false), ablation `mimics` (gm), `move/GunMimics.java`, set on
  `MoveController.setGunMimics` by the duel's constructor; `MoveController.surfProfile` is what
  `StopPointSurf` rates. Why: BeepBoop weights 22 enemy-gun models by their density at real bullets
  cubed, and Hadur's main views learn only from hits while learning guns learn every visit
  (docs/bench/surf-b-rivals-read.md).

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
- **TMODE-13.** `MinimumRiskMovement.huntAssign` and `huntSlot`: leaderless name-order assignment,
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

- **Why.** Leigh 2026-10-27: tailor a plan per opponent, as the 1v1 mode table does. Code reads of
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

- **Why.** Leigh 2026-10-28: proceed with the next team step. Firestarter (2nd) checks each move
  against its own team's bullets in flight; the cloud closer-hunt smoke lost on the field (250 px
  -0.6 +- 1.3, 200 px -2.0 +- 1.3, 22 teams x 6 seeds) but TroodonPack gained at both (+4.3, +3.7).
- **TMODE-25.** `TeamModes.Mode.PATH` (FORCE_PATH, on since TMODE-28): `MinimumRiskMovement.pathBest`,
  `pathDamage`, `crossesBox`; `PATH_K` 1, `PATH_HALF` 18, `PATH_TICKS` 15, `PATH_RERANK` 8.
- **TMODE-26.** `TeamModes.Mode.NEAR`, table-only: `huntRadius` gives `HUNT_RADIUS_NEAR` 250.
- With PATH and NEAR both forced into the default, only the three team replay fixtures move; the
  duel and melee fixtures replay bit for bit (ReplayTest, DuelIdentityTest, FaithfulPortTest).
- **BENCH-124.** build-ablation `tmpath` (suffix mp; the named teams play PATH on top of their
  entry), `tmtnear` (suffix tn); `tmtab`/`tmlock` now insert after the shipped entries, and
  `team_modes.py pick --shipped` keeps a named team's modes in its line. Card plans/pc-team-path.queue.

## 1v1 gap to 2nd: shield exit and re-picks (BENCH-126)

- **Why.** Leigh 2026-10-28: 3.18.1 is 4th, 1.28 behind DrussGT; find the opponents to tailor for.
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

- **Why.** Leigh 2026-10-28: "Why can't the harness do what you have done in the cloud there and monitor
  as it runs? Instead I'm doing 6 hour runs that have clear failures." A PC card was read only from its
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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SAOR-1 | Ubiquitous | The bot shall drive to a point within 25 px of a battlefield edge, so that it occupies such a point whenever its distance remaining is 0. | U1 |
| SAOR-2 | Ubiquitous | The domain core (`hadur117.micro.core`) shall not import or reference `robocode.*`. | U0 |
| SAOR-3 | Event | When a scanned robot is nearer than the current target, the bot shall adopt it as target and keep it until it dies or a nearer one is scanned. | U1 |
| SAOR-4 | Event | When a robot dies, the bot shall reset the target distance to infinity and release the radar to free spin. | U1 |
| SAOR-5 | State | While gun heat is below 1, the bot shall hold the radar on the target to within one scan width. | U1 |
| SAOR-6 | State | While the Markov row for the opponent's current state holds no sample, the gun shall aim by circular projection, holding that state's speed and turn rate. | U2 |
| SAOR-7 | State | While that row holds a sample, the gun shall aim by Monte-Carlo playout of the opponent's Markov chain and a vote in angle bins, where a playout through a row of fewer than 8 samples votes at most 5 plus 12 for each sample of that row. | U3 |
| SAOR-10 | Unwanted | If gun turn remaining is non-zero, then the bot shall not fire. | U1 |
| SAOR-11 | Unwanted | If Robocode's codesize tool reports more than 749 bytes for the shipped jar, then the build shall fail. | U0 |
| SAOR-12 | Ubiquitous | Before release, the bot shall score 66.0 APS or more over the 155 MicroMelee pairings at 35 rounds on a 1000 x 1000 field. | U3 |
| SAOR-13 | Ubiquitous | Against Figment 1.0 in a 10-bot field over 200 battles, the bot shall out-survive it in 50% or more of battles. | U3 |
| SAOR-14 | Ubiquitous | Against Wallaby 5.1 in the same setup, the bot shall out-score it on bullet damage in 50% or more of battles. | U3 |
| SAOR-15 | Ubiquitous | The shipped class shall give the same orders as the bench adapter, which drives the core, for the same events. | U0 |
| SAOR-16 | Ubiquitous | The live-shaped census shall run fields drawn from the whole MeleeRumble list and score the seated robot only on its pairings against MicroMelee robots, as LiteRumble scores MicroMelee. | U6 |
| SAOR-17 | Ubiquitous | Bullet power shall be log10(energy) times 325 over the target's distance, with no cap but the engine's. | U4 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TWIN-1 | Ubiquitous | The team shall be one robot class listed twice in the team file, neither member a Droid. | W0 |
| TWIN-2 | Unwanted | If the codesize tool reports 2,000 bytes or more for the team jar, then the build shall fail. | W0 |
| TWIN-3 | Ubiquitous | The domain core (`hadur117.twin.core`) shall not import or reference `robocode.*`, and the module shall depend on no Hadur or Saor module. | W0 |
| TWIN-4 | Unwanted | If a scanned robot is a teammate, then the twin shall neither target it nor learn from it. | W1 |
| TWIN-5 | Event | When a twin scans an enemy, it shall broadcast the scan, and both twins shall handle it by the same path. | W1 |
| TWIN-6 | Event | When a twin handles two scans of one enemy by one scanner one tick apart, it shall record that transition in its table for that enemy. | W0 |
| TWIN-7 | State | While two enemies live, both twins shall target the enemy with the least energy, switching only when the other is lower by 20 or more. | W0 |
| TWIN-8 | State | While both twins and both enemies live, the leader shall hold its radar on the target and the other twin on the other enemy. | W1 |
| TWIN-9 | State | While both twins live, each shall drive to a station 45 degrees either side of the team's bearing from the target, at 250 px with two enemies and 160 px with one (0.1: 100). | W0 |
| TWIN-10 | Event | When the target's energy drops by 0.1 to 3 between scans, a twin on its station shall reverse its leg. | W0 |
| TWIN-11 | Unwanted | If the partner is nearer than the target and within 0.15 rad of the gun heading, then the twin shall not fire. | W0 |
| TWIN-12 | State | While a twin is the last of its team against two enemies, it shall play Saor's corner oscillation on the 800 field. | W0 |
| TWIN-13 | Event | When a twin handles a scan of an enemy, it shall OR into its mode the mode table's entry at that enemy's name-hash slot; mode bit 1 shall stop the leg reversing on the target's shot (TWIN-10) and mode bit 2 shall set the two-enemy station range to 180 px. | W3 |
| TWIN-14 | Unwanted | If a team's mode table entry reads below zero on a fresh-seed gate against both the release before it and the default without the entry, then the entry shall not ship. | W3 |

- **Coverage.** TWIN-3 by `ArchitectureTest`; TWIN-6 by `GunTest`; TWIN-7, TWIN-9 to TWIN-12 by
  `TeamTest` on the core; TWIN-1 and TWIN-2 on the built jar by `TwinSaorJarIT` (failsafe). TWIN-4,
  TWIN-5 and TWIN-8 are the robot's wiring in `SaorTwin`, stage W1: exercised by the cloud
  head-to-head (docs/twinsaor.md section 8), with a test due before W1. TWIN-13's range bit by
  `TeamTest`, its table by `hadur-bench/tools/test_twin_table.py` (the robot's string is the one the
  W4 picks write); TWIN-14 is the release process (docs/twinsaor.md section 11). Stages compare with
  `hadur.twin.stage` in the root pom (W0); W, because T is the Team plan's letter.

## Deise, a MiniMelee entry (DEISE-1 to DEISE-16, stages E0 to E3)

`hadur117.mini.Deise`, a separate robot in the `deise` module, built to take MiniMelee 1st from
kc.mini.Mirage (Leigh, 2026-10-27). Design, the Mirage analysis and the stages: docs/deise.md.
It depends on nothing of Hadur's, Saor's or TwinSaor's, and they on nothing of it. Its stages
are E0 to E3 (D is the DrussGT route's letter).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| DEISE-1 | Ubiquitous | Each tick the bot shall drive toward the least-risk of 36 points on a ring of radius 0.45 of the target's distance, within 36 to 160 px, that keep 18 px off the walls (0.2 also kept its destination unless a ring point was 10% safer or the destination was within 16 px; off since 0.3). | E2 |
| DEISE-2 | Ubiquitous | The risk of a point shall include, for each live opponent, 106,667 plus 213,333 times its weight (DEISE-5's, set at every scan), over the squared distance to it (0.3: a flat 80,000; 0.2: 50,000 plus 500 times its energy). | E3 |
| DEISE-3 | State | While no other robot is within 0.9 of the bot's distance from an opponent, the risk of a point shall include the absolute cosine between the heading to the point and the bearing from the point to that opponent (0.2 only; off since 0.3, `Move.ACROSS`). | E2 |
| DEISE-4 | State | While 4 or more opponents remain, the risk of a point shall include the number of opponents times its distance to the nearest corner over 5,000 (0.2 only; off since 0.3, `Move.CORNERS`). | E2 |
| DEISE-5 | Event | When an opponent is scanned, the bot shall set its weight to 1 if no other robot is within 0.9 of the bot's distance from it and 0.25 otherwise (since 0.4; 0.3 weighed only its shots). When its energy has dropped by 0.1 to 3 since its last scan, the bot shall record a wave, fired halfway back to that scan (at most 8 ticks), with a head-on and a linear line, weighed by that weight, in a ring of 64 slots; its danger at a point not yet passed is, for each line, the weight times 4,000 over 800 plus the squared distance from the point to that line's bullet at the point's range, added to the risk (in the shipped class since 0.3; 0.2 left the waves out). | E3 |
| DEISE-6 | Event | When any opponent is scanned 1 to 8 ticks after its last scan, the bot shall record the transition from its last state to its present one, the turn spread over the gap, in that opponent's table, kept across rounds; a full row shall replace a random sample. | E0 |
| DEISE-7 | State | While the target's present Markov row holds no sample, the gun shall play the target on with that state held, which is circular projection. | E0 |
| DEISE-8 | State | While it holds a sample, the gun shall play the target out by sampling its Markov chain, 200 playouts (64 in 0.2), where a playout through a row of fewer than 8 samples votes at most 5 plus 12 for each sample of that row. | E0 |
| DEISE-9 | Ubiquitous | A playout's vote shall cover the 1,024-bin circle over the target's width at its distance, atan(18 / distance) either side, and a playout that leaves the field shall vote 1. | E0 |
| DEISE-10 | Ubiquitous | Bullet power shall be log10(energy) times 325 over the distance, capped at 3, and at least 0.1 (0.3 also capped it at 1.9 plus one for every 3 opponents left, and 0.2 at the power that kills the target). | E3 |
| DEISE-11 | Unwanted | If gun turn remaining is non-zero, or the bot's energy is not above the power, then the bot shall not fire. | E2 |
| DEISE-12 | Unwanted | If Robocode's codesize tool reports more than MiniMelee's 1,499 bytes for the shipped jar, or more than one class in it, then the build shall fail. | E0 |
| DEISE-13 | Ubiquitous | The live-shaped MiniMelee census shall run fields drawn from the whole MeleeRumble list and score the seated robot only on its pairings against MiniMelee robots, with Deise in the field in place of a seated robot. | E0 |
| DEISE-14 | Ubiquitous | The domain core (`hadur117.mini.core`) shall depend on the JDK only, and the module on no Hadur, Saor or TwinSaor module. | E0 |
| DEISE-15 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | E0 |
| DEISE-16 | Ubiquitous | The shipped class, the core flattened by hand, shall give the same orders, to the bit, as the bench adapter (`DeiseLab`, which calls the core) in the same melees, both as compiled and as shipped. | E0 |

- **Coverage.** DEISE-1 to DEISE-5 by `MoveTest` and DEISE-6 to DEISE-10 by `GunTest` on the
  core; DEISE-14 by `ArchitectureTest`; DEISE-12, DEISE-15 and DEISE-16 (on the jars) by
  `DeiseJarIT` (failsafe), DEISE-16 on the compiled classes by `DeiseEquivalenceTest`. DEISE-11
  and the scan wiring of DEISE-5 and DEISE-6 are the adapters': the equivalence test holds the
  shipped class to `DeiseLab`, and a robot-level test of DEISE-11 is due by E2.
  DEISE-13's field builder (`saor_live.py` with Deise's options) and `deise_fields.py` by
  `test_saor_live.py`.

## Sanaro, a NanoMelee entry (SANARO-1 to SANARO-14, stages N0 to N6)

`hadur117.nano.Sanaro`, a separate robot in the `sanaro` module, built to outrank
d414.nano.Quantum and sheldor.melee.nano.NaturalScience in NanoMelee (Leigh, 2026-10-28, from his
design doc "Nano Melee: Beating NaturalScience & Quantum"). Design, the dissection and the stages:
docs/sanaro.md. It depends on nothing of Hadur's, Saor's, TwinSaor's or Deise's, and they on
nothing of it. The design doc's N-1 to N-12 are SANARO-1 to SANARO-12 here. SANARO-13 is the
bench's own, added after pc-sanaro-n01 showed the NanoMelee-only census picks against the
live-shaped one (docs/sanaro.md section 6). SANARO-14 is 0.2's fire gate (pc-sanaro-n04,
docs/sanaro.md section 12).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SANARO-1 | Unwanted | If Robocode's codesize tool reports more than NanoMelee's 249 bytes for the shipped jar, or more than one class in it, then the build shall fail. | N0 |
| SANARO-2 | Unwanted | If the class declares a static initialiser, or its power table has no cell at an index the bot can reach for own and enemy energy 0 to 400, then the build shall fail. | N0 |
| SANARO-3 | Event | When a robot is scanned, the bot shall decay its force field by DECAY (0.9), add a push of 1 over the distance away from that robot's hedged lead position, and turn its body to the field plus the wall push (0.1 first turned SPIRAL 0.6 further, then 0; 0.2 has no spiral term). | N0 |
| SANARO-4 | State | While the body turn still to make exceeds AHEAD (120) degrees, the bot shall drive backwards. | N0 |
| SANARO-5 | Event | When a scanned robot is closer than the target threshold, which creeps out CREEP (25) px every scan, the bot shall take it as the target and snap the threshold to its distance. | N0 |
| SANARO-6 | Event | When the target is scanned, the bot shall turn its radar by its gun heat less LOCK (0.9) times the radar turn remaining: a sweep while the gun is hot, a flip on the target once it is nearly cool. | N0 |
| SANARO-7 | Event | When the target is scanned, the bot shall turn its gun to the bearing plus its lateral velocity over LEAD (16) at every range (0.1: over 10 plus 1.008 to the distance). | N5 |
| SANARO-8 | Event | When the target is scanned, the bot shall fire the table's power for (own energy, target energy) times the integer BAND (640) over the distance; a table cell is the lesser of 0.1 plus a sixteenth of its own energy (at most 2.5, and 3.0 from 120 energy) and the least power that kills any energy the target's truncated energy stands for (up to one more); a target at 128 energy or more reads energy / 128 rows on at its energy mod 128, a limit of the 128 stride. | N0 |
| SANARO-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | N0 |
| SANARO-10 | Ubiquitous | The NanoMelee census shall run ten NanoMelee robots a battle, both leaders in every battle, and the shipped build shall read an APS above NaturalScience 1.2.1's in the same battles by more than its 95% interval over at least 20 battles. | N2 |
| SANARO-11 | Ubiquitous | In the same battles the shipped build shall outsurvive both leaders more often than not. | N2 |
| SANARO-12 | Ubiquitous | One on one with each leader over 35 rounds, the shipped build shall win more than 55% of rounds. | N2 |
| SANARO-13 | Ubiquitous | A change to the shipped build shall read above the shipped build on the live-shaped census (the MeleeRumble fields that hold a NanoMelee robot, NanoMelee pairings counted) by more than its 95% interval. | N3 |
| SANARO-14 | Event | When the target is scanned, the bot shall fire only if the gun's angle to the lead, before this scan's gun turn, is under GATE (18) over the distance in radians, and shall order the gun turn before the shot. | N5 |

- **Coverage.** SANARO-1, SANARO-2 (no `<clinit>`) and SANARO-9 by `SanaroJarIT` (failsafe) on the
  shipped jar; SANARO-2 (table reach) and SANARO-8 (cells) by `SanaroTableTest`, which holds the
  table to `sanaro/table.py`'s formula; SANARO-3 to SANARO-8 by `SanaroTest`, scan by scan on a
  probe subclass, SANARO-14 too. SANARO-10 to SANARO-13 are bench reads (`tools/sanaro_read.py`; fields by
  `tools/sanaro_fields.py`, both by `test_sanaro.py`), not build gates.

## JayLexi and Eveimear, the MiniRumble and MicroRumble 1v1 entries (JAYLEXI-1 to JAYLEXI-11, EVEIMEAR-1 to EVEIMEAR-12)

`hadur117.mini.JayLexi` (module `jaylexi`, MiniRumble: 1v1 under 1500 bytes) and
`hadur117.micro.Eveimear` (module `eveimear`, MicroRumble: 1v1 under 750 bytes), built from Leigh's
design plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" (2026-10-28) and its
kitlab drafts. Design, bench and results: docs/kitlab.md. Neither depends on Hadur, Saor, TwinSaor,
Deise or Sanaro, nor they on it; Hadur's 1v1 build is untouched. The plan's K1 to K6, J1 to J6 and
E1 to E6 map onto these as the last column says.

| ID | Pattern | Requirement | Plan |
|---|---|---|---|
| JAYLEXI-1 | Unwanted | If Robocode's codesize tool reports more than 1,496 bytes for the shipped jar (MiniRumble's 1,499 less 3 spare), then the build shall fail. | K6 |
| JAYLEXI-2 | Event | When the enemy is scanned, the bot shall turn its radar twice the turn to the enemy, so it scans it every tick. | K1 |
| JAYLEXI-3 | Event | When the enemy's energy drops by more than 0.09 and at most 3, after our hits on it (less their damage) and its hits on us (plus three times their power) are booked, the bot shall launch an enemy wave from where the enemy was a tick earlier at that bullet's speed. | K3 |
| JAYLEXI-4 | Event | When the enemy is scanned, the bot shall launch a gun wave segmented on velocity history, lateral speed, walls ahead and distance, aim at its most visited of 47 bins, and log the enemy's bin, weighted 5 for a fired wave, when the wave passes it. | K2, J6 |
| JAYLEXI-5 | State | While an enemy wave is in flight, the bot shall predict back and forward to the wave's arrival and orbit the less dangerous way, danger being the logged bin over the distance to the enemy to the fourth, plus a quarter of the same for the second nearest wave when there is one (0.2); while none is, it shall drive straight away from the enemy. (The plan's stop option measured 2 APS worse, docs/kitlab.md.) | J1 |
| JAYLEXI-6 | Event | When hit by a bullet, or when bullets collide, the bot shall log the guess factor of the hit, smoothed over the neighbouring bins, on the enemy wave that was passing it, and stop surfing that wave. | J2 |
| JAYLEXI-7 | Ubiquitous | The bot shall turn its drive until a 140 px stick from it stays inside the field. | J3 |
| JAYLEXI-8 | Event | When the gun is within 3 degrees of its aim, the bot shall fire 3 inside 150 px and 2 beyond, at most a fifteenth of its own energy and at most what finishes the enemy. | J4, K4 |
| JAYLEXI-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | plan S5 |
| JAYLEXI-10 | Ubiquitous | On the MiniRumble bench sample, paired against Komarious 1.88, the build shall predict at least 87.7 APS before it is submitted. | plan S4 |
| JAYLEXI-11 | Ubiquitous | The shipped code shall give the same orders, bit for bit, as the readable reference kept with the tests, on seeded replays of scans, hits and shots, so bytes are saved without changing play. | 0.2 |
| EVEIMEAR-1 | Unwanted | If Robocode's codesize tool reports more than 746 bytes for the shipped jar (MicroRumble's 749 less 3 spare), then the build shall fail. | K6 |
| EVEIMEAR-2 | Event | While in stop-and-go, when the enemy fires, the bot shall step (3 + (int) (drop x 1.999999)) << 3 px along its orbit. | E1 |
| EVEIMEAR-3 | Event | When the energy the enemy has won back by hitting it (three times each bullet's power, Épéeist's measure) exceeds 40 + 23 x round, the bot shall move every tick and reverse at random for the rest of the battle. | E2 |
| EVEIMEAR-4 | Event | When hit by a bullet, the bot shall keep its orbit direction (the plan's reversal measured 1.65 APS worse on the bench, docs/kitlab.md). | E3 |
| EVEIMEAR-5 | Ubiquitous | The bot shall close its drive angle off the enemy until a 160 px stick stays inside the field, and reverse when the angle has closed under 0.9 rad. | E4 |
| EVEIMEAR-6 | Event | When the enemy is scanned, the bot shall launch a gun wave segmented on velocity history, lateral speed and distance, aim at its most visited of 25 bins, and count the enemy's bin when the wave passes it. | K2 |
| EVEIMEAR-7 | State | While the enemy is inside 100 px, the bot shall fire 3, move every tick and retreat. | E5 |
| EVEIMEAR-8 | Ubiquitous | The bot shall fire 2, at most what finishes the enemy, and never more than its energy less 0.1. | K4 |
| EVEIMEAR-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | plan S5 |
| EVEIMEAR-10 | Event | When the enemy is scanned, the bot shall turn its radar back by the turn it had left. | K1 |
| EVEIMEAR-11 | Event | When we hit the enemy, the bot shall take the bullet's damage off the enemy's energy, and when hit, add three times the bullet's power, so neither reads as a shot. | K3 |
| EVEIMEAR-12 | Ubiquitous | On the MicroRumble bench sample, paired against Épéeist 3.7, the build shall predict at least 85.3 APS before it is submitted. | plan S4 |

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

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TIME-9 | Ubiquitous | The core's surf, bullet-shadow and wave hit-box code shall reuse arrays and plain coordinates instead of building a map, point or line per neighbour, bullet or corner on every tick, with the same arithmetic in the same order, so that every duel, melee and team fixture replays bit for bit. | R9 |

## The hadur117 package (NAME-1, BENCH-124)

Leigh's package is `hadur117`, Saor's from the start (`hadur117.micro.Saor`); Hadur had shipped as
`hadur2` through 3.18. From 3.19 the whole family is in `hadur117`. Robocode lets a robot read
only its own package's data folder, so the first pass of a renamed entry starts with no stored
profiles, and the rumbles list it as a new participant.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| NAME-1 | Ubiquitous | The solo robot, the team, the recorder and the core shall be in package `hadur117` (`hadur117.Hadur`, `hadur117.HadurTeam` of five `hadur117.Hadur`, `hadur117.core`), with jars named `hadur117.Hadur_<release>.jar` and `hadur117.HadurTeam_<release>.jar`, and the rename shall change no decision: every duel, melee and team fixture replays bit for bit. | R9 |
| BENCH-124 | Ubiquitous | The bench, the ablation builder, the shield probe and the live client shall read a robot jar or name from before the rename as `hadur2` and a new one as `hadur117`: the jar name and properties in either package, a team's member from its own package, the shield list repacked in the jar's own package, the data folder of the robot's package, and Hadur's battles, console lines and data folders under either name, never counting Saor (`hadur117.micro.Saor`) as Hadur. | T7 |

## PATH on every team, fresh-seed confirm (BENCH-135)

- **Why.** pc-team-path (PR #414) found no team where PATH paid +3.0 on its own, but pooled over the
  46 it read +0.5 ± 0.5 share points over aa (bb -0.0 ± 0.5), with our own hits on teammates down
  15%. Leigh 2026-10-29 chose to confirm it as one switch for every team.
- **BENCH-135.** Card plans/pc-team-path2.queue: aa, bb, mp (build-ablation `tmpath`); bb and mp on
  team-census46.txt at 16 seeds from 5100 (16, not 10, to narrow the pooled interval); `team_modes.py
  gate` over all 46 teams at +0.30 APS. A PASS is followed by a PR that sets FORCE_PATH = true.

## Ogi's dodge as one piece (TMODE-27, BENCH-139)

- **Why.** Leigh 2026-10-29: OgiTeam leads the team rumble by about 6.4 APS on survival (97.6%).
  Its parts ported one switch at a time (SOFT, SCREEN, POOL, LEARN, WAVES, radar) read zero; its
  dodge only works whole: shot detection, a learned per-class danger model with simple-aim
  experts, and a path check over the safest spots. Leigh: "If it makes sense to do a parallel full
  rebuild of the teams core do so".
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
  Polylunar -2.5, Ogi -0.2. A global switch, not a per-team pick: Leigh chose the confirm knowing so.
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

## DODGE with own fire on every team (TMODE-30)

- **Why.** pc-team-dodge2 (BENCH-142, PR #450), 46 teams x 16 fresh seeds from 5600, on top of PATH:
  DODGE with OWN_FIRE (`dgof`) **+0.85 +- 0.42 APS** (gate +0.30, low end +0.43: PASS); plain DODGE
  +0.45 +- 0.42; bb A/A -0.2 +- 0.4. Own-member hits +2.6 a battle (plain DODGE +9.2). Firestarter
  +5.5, Combat +4.2, HOFSwarm +6.7, TeamDeathTeam +5.9, ArmyOfShiz +5.5, Ogi +2.8; Nightmare -3.5,
  ImpactTeam -4.2, ImWithStupid -2.5. A global switch: Leigh decides the ship.
- **TMODE-30.** `TeamModes.FORCE_DODGE` and `TeamDodge.OWN_FIRE` are true, and the three named entries
  carry `Mode.DODGE`, as the measured `tmdodge,tmdodgef` arm played them. Ablations `tmnododge` (DODGE
  off everywhere) and `tmnoof` (own fire off); `tmdodge` and `tmdodgef` keep working on older source.
- Solo play is untouched: DODGE acts only while a teammate lives. Only the two team replay fixtures
  were re-recorded; the duel and melee fixtures replay bit for bit.
