# Hadurling requirements

Each requirement is written in one of the five EARS patterns and has a stable ID. The ID is
the contract: every requirement is named by at least one test (a JUnit or jqwik test tagged
`@Tag("HL-n")`, or a Cucumber scenario tagged `@HL-n`), and every tag in the tests names a
requirement in this table. `RequirementsTraceabilityTest` checks both, so the build fails if
the two drift apart.

| ID | Pattern | Requirement |
|---|---|---|
| HL-1 | Ubiquitous | The core shall not depend on any `robocode` class. |
| HL-2 | Ubiquitous | The core shall return equal orders for equal inputs. |
| HL-3 | Event-driven | When a scan arrives, the core shall turn the radar beyond the enemy so that the next sweep sees it again. |
| HL-4 | State-driven | While the gun is hot, the core shall hold fire. |
| HL-5 | Event-driven | When the robot hits a wall, the core shall reverse its direction of travel. |
| HL-6 | Unwanted behaviour | If the core throws or returns no orders, then the guard shall return safe orders and log one FAULT line per round. |
| HL-7 | Unwanted behaviour | If a transcript line is malformed, then the codec shall reject it with an `IllegalArgumentException`. |
| HL-8 | Optional feature | Where a recorded battle is supplied, the replay shall reproduce the recorded orders tick for tick. |
| HL-9 | Ubiquitous | The KD-tree shall return the same nearest neighbours as a brute-force search over the same points. |
| HL-10 | Event-driven | When one of our waves reaches the enemy, the gun shall file the guess factor at which it was found, and aim at the densest guess factor among the nearest neighbours. |
| HL-11 | State-driven | While the gun has learned fewer than five guess factors, it shall aim head-on. |
| HL-12 | Event-driven | When an enemy wave is in flight, the surfer shall choose the direction of travel whose predicted guess factor has the lower danger. |
| HL-13 | Event-driven | When the energy ledger reports a shot, the core shall give the surfer a wave of the corrected power. |
| HL-14 | Event-driven | When the enemy's energy changes between two scans, the ledger shall take out our bullet hits, the energy the enemy gained by hitting us and any wall damage, and read what is left as the power of the shot. |
| HL-15 | Unwanted behaviour | If the corrected drop is below 0.1 or above 3.0, then the ledger shall report no shot. |
| HL-16 | Event-driven | When our own bullet hits the enemy in the interval its energy drops, the core shall not make a wave from the damage. |
| HL-17 | Ubiquitous | The profile codec shall decode exactly the profile it encoded. |
| HL-18 | Unwanted behaviour | If stored bytes are truncated, altered or of an unknown version, then the codec shall reject them with a `ProfileFormatException` and with nothing else. |
| HL-19 | Event-driven | When a profile written by an older version is loaded, the codec shall fill the fields that version lacks with their defaults. |
| HL-20 | Unwanted behaviour | If the robot is killed part way through a save, then the next load shall return the last complete profile, the old one or the new one. |
| HL-21 | Unwanted behaviour | If the store throws or holds no readable profile, then the library shall return a fresh profile, count the failure and not throw. |
| HL-22 | Ubiquitous | The file store shall keep every file inside the robot's data directory. |
| HL-23 | Event-driven | When the first scan of an opponent arrives, the core shall load that opponent's profile and seed its gun; when the round ends, it shall save what the round taught. |
| HL-24 | Ubiquitous | Every version and duplicate marker of a robot's name shall map to one lineage key, and the key's file name shall contain only safe characters. |
| HL-25 | Ubiquitous | Every rate a policy reads shall carry a 95% margin of error (Agresti-Coull); with no samples the rate shall be unknown and the margin 1. |
| HL-26 | Ubiquitous | A hit window shall hold only the latest N outcomes, and its estimate shall be that of exactly those outcomes. |
| HL-27 | State-driven | While our hit rate is certainly above 20% and theirs certainly below 10%, each beyond its margin of error, and we have more than 12 energy, the power policy shall fire 3.0, but not more than a quarter of their energy. |
| HL-28 | Unwanted behaviour | If either rate is unknown or not yet certain, then the power policy shall keep the gun's own power. |
| HL-29 | State-driven | While the live hit rate is certain and differs from the profile's by more than the wider margin, each wave shall take a twentieth off the seed's weight, never below zero. |
| HL-30 | Unwanted behaviour | If the live evidence is thin or agrees with the profile, then the seed's weight shall not fall. |
| HL-31 | Event-driven | When the seed's weight changes, the gun shall weigh seeded samples accordingly, and ignore them at zero. |
| HL-32 | Event-driven | When the core aims, it shall ask the power policy for the power, with this battle's evidence about the opponent it is fighting. |
| HL-33 | Ubiquitous | The bench shall report a score share as a mean with a 95% confidence interval over seeds, using Student's t. |
| HL-34 | Unwanted behaviour | If fewer than two seeds were fought, then the bench shall report the interval as unknown and not as zero. |
| HL-35 | Event-driven | When two versions are compared, the bench shall pair their results by seed and call the change better or worse only if the whole interval of the paired differences lies on one side of zero. |
| HL-36 | Event-driven | When the previous tick used more than 70% of the time allowance, the tick budget shall shed one computation level for this tick only. |
| HL-37 | Event-driven | When the engine skips a turn, the tick budget shall shed one computation level for the rest of the round, down to level 3. |
| HL-38 | State-driven | While the level is 1 or more the gun shall ask the tree for half as many neighbours; at 2 or more the surfer shall not predict; at 3 the gun shall aim head-on. |
| HL-39 | Ubiquitous | The core shall not read a clock; the adapter shall time each tick and report it as an event on the next. |
| HL-40 | Ubiquitous | The profile library shall list the store once per battle and keep an index, so that no save does work proportional to the number of files in the store. |
| HL-41 | State-driven | While the store is full, the library shall forget the least recently written other profiles, found from the index, until the save fits. |

The five patterns, with the keyword that gives each away: ubiquitous (no keyword), event-driven
(*when*), state-driven (*while*), unwanted behaviour (*if ... then*), optional feature (*where*).
