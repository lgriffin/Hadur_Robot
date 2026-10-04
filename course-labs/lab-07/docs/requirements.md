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

The five patterns, with the keyword that gives each away: ubiquitous (no keyword), event-driven
(*when*), state-driven (*while*), unwanted behaviour (*if ... then*), optional feature (*where*).
