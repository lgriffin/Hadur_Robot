# Building Hadur

From a first Robocode robot to the RoboRumble top 20: an advanced Java course built on the Hadur robot.

Hadur is a [Robocode](https://robocode.sourceforge.io/) robot that reached 20th of 1,216 in the 1v1 RoboRumble. This course teaches how it was built: a hexagonal core that does not know it is inside Robocode, tests in layers from ArchUnit rules to replayed battles, requirements written in EARS and traced to the tests that prove them, the strategy (waves, guess factors, nearest neighbours, an energy ledger, opponent memory, policies that respect their margin of error), and the evidence-driven climb that took it from 64th to 20th.

It is also a Java course. It starts from a learner who can write a class and a loop, and ends at the level the Hadur codebase is written at.

## How the course works

- **Modules with labs.** Each lab grows **Hadurling**, a small robot of your own, one step at a time. Every lab ends with a *Compare with Hadur* step that opens the real code for the same idea, at the commit that introduced it.
- **Evolution talks.** Short slide decks tell the story of how Hadur changed, stage by stage, with the real numbers.
- **A capstone.** One feature, delivered the way every Hadur stage was: requirements, failing tests, code, a bench gate and release notes.

| Part | Topics | Level |
|---|---|---|
| 1. Foundations | Welcome, a first robot, physics and a first test | Beginner |
| 2. Architecture | Values and the tick, the hexagon, guardrails in the build | Intermediate |
| 3. Testing and requirements | Testing in layers, requirements as code | Intermediate |
| 4. The strategy | Waves and guns, the energy ledger, memory, deciding under uncertainty | Advanced |
| 5. The real world | The bench, time and resilience, melee | Advanced |
| 6. Evolution | How Hadur evolved | All |
| 7. Capstone | One feature end to end | Advanced |

The lab code is in [`course-labs/`](https://github.com/lgriffin/Hadur_Robot/tree/master/course-labs) of the Hadur repository.
