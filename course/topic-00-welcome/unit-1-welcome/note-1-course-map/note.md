# The course map

Seventeen topics in seven parts. Read this once, then use it to find your way back.

## The seven parts

| Part | Topics | Level |
|---|---|---|
| 1. Foundations | 00 Welcome, 01 A first robot, 02 Physics and a first test | Beginner |
| 2. Architecture | 03 Values and the tick, 04 The hexagon, 05 Guardrails in the build | Intermediate |
| 3. Testing and requirements | 06 Testing in layers, 07 Requirements as code | Intermediate to advanced |
| 4. The strategy | 08 Waves, guess factors and nearest neighbours, 09 The energy ledger, 10 Memory, 11 Deciding under uncertainty | Advanced |
| 5. The real world | 12 Evidence: the bench, 13 Time and resilience, 14 Melee | Advanced |
| 6. Evolution | 15 How Hadur evolved | All |
| 7. Capstone | 16 One feature end to end | Advanced |

The level is the Java and design experience you need when you arrive. Topic 00 needs none.

## Two kinds of content

- **Modules with labs** (Topics 01 to 13). Each module has talks, notes and a quiz where it helps, and a lab in the sidebar. You learn by building.
- **Talks without labs** (Topic 15, and the melee topic as reading). Short slide decks on how Hadur evolved: the rebuild, melee, the climb, the three strands and how agents built it. You can read these at any time.

## How the labs fit together

Every lab grows **Hadurling**, your own small robot. The lab code is in the [`course-labs`](https://github.com/lgriffin/Hadur_Robot/tree/master/course-labs) folder of the Hadur repository, one folder per lab:

- `lab-00` is the starting skeleton
- `lab-NN` is the **solution of Lab NN**, and it is also **the start of Lab NN+1**
- So Lab 03 starts from `lab-02`, and when you finish it your work should match `lab-03`
- If you fall behind, take the previous folder and carry on

Each folder is a standalone Maven project with a `README.md` that says what changed from the one before. Run `mvn -B verify` inside it to check it builds and its tests pass.

From `lab-04` each project is a parent pom with two modules: `hadurling-core` (no Robocode) and `hadurling-robot` (the adapter). `lab-12` and later add `hadurling-bench`.

Each lab also has a downloadable `start.zip` for learners who do not clone the repository. Every lab closes with a **Compare with Hadur** step that links the real Hadur code at the commit that introduced the idea.

## Shared build settings

| Setting | Value |
|---|---|
| Robot code | Java 11, so every RoboRumble client can load it |
| Test code | Java 17 |
| Robocode API | 1.9.5.6, from Maven Central |
| Build | Maven 3.9 |

## Where to look things up

- [Hadur repository](https://github.com/lgriffin/Hadur_Robot): the real robot, with its docs and bench reports
- The [Robocode](https://robocode.sourceforge.io/) site
- The [RoboRumble rankings](https://literumble.appspot.com/Rankings?game=roborumble)
