# Authoring the Building Hadur course

How the course in [`../course`](../course) and the lab code in this folder are put together.
The plan behind them is [docs/course-plan.md](../docs/course-plan.md). Read this before
adding or changing a learning object.

## The course folder (`course/`)

Tutors decides what each folder is from the start of its name. A folder whose name does
not start with a learning-object type is ignored, so **never put Java sources, Maven
projects or tool scripts under `course/`**.

| Object | Folder | Files |
|---|---|---|
| Topic | `topic-NN-name/` | `topic.md` (`# Title`, blank line, one or two summary lines), `topic.svg` |
| Unit | `unit-N-name/` | `unit.md` (`# Title`) |
| Sidebar unit (labs) | `side-labs/` | `topic-labs.md` (`# Labs`) |
| Talk (slides) | `talk-N-name/` | `talk.md` (`# Title`, blank line, one or two summary lines), `talk.marp`, `talk.svg` |
| Note | `note-N-name/` | `note.md` (`# Title` then the body), `note.svg`, optional `img/` |
| Lab | `book-labNN-name/` | `00.Lab-NN-Short-title.md` (objectives), `01.Step-name.md`, ... `img/main.svg`, `archives/start.zip` |
| Quiz | `quiz-N-name/` | `quiz.md` (optional front matter, `# Title`, a fenced `quiz` block) |
| Web link | `web-N-name/` | `web.md` (`# Title`, summary), `weburl` (one URL, no newline needed), `web.svg` |

Rules that matter:

- **Titles.** A lab's title comes from its first step's file name: `00.Lab-04-The-hexagon.md`
  shows as "Lab-04-The-hexagon". Each step's id is the text between the first and last dot
  of its file name, so use short ASCII names with hyphens and no spaces.
- **Images.** Every topic, talk, note, web link and lab needs a card image. Use SVG.
  `python3 course-labs/tools/cards.py` writes a plain title card for any learning object
  that has none, so new objects only need their text.
- **Marp.** `talk.marp` starts with this front matter, then slides separated by `---`:

  ```
  ---
  marp: true
  theme: default
  paginate: true
  ---
  ```

  Keep decks short (8 to 12 slides). Mermaid diagrams work in the reader inside fenced
  `mermaid` blocks. Every claim with a number cites where it comes from (a file in the repo).
- **Quizzes.** One fenced block per quiz:

  ````
  ```quiz
  title: The hexagon
  ---
  question: Which module may import robocode.*?
  type: multiple-choice
  options:
    - hadur-core
    - hadur-robot
  correct: 1
  ```
  ````

  `correct` is the zero-based index of the right option. Questions are separated by `---`.
- **Links to Hadur.** Link to the real code at a pinned commit, never to `master`, using
  `https://github.com/lgriffin/Hadur_Robot/blob/<sha>/<path>` (or `/tree/<sha>/<dir>`).
  The commits are in section 5 of the plan; use `a9ee021` (3.5.1) for anything not tied to
  one stage.
- **Style.** Plain, direct English; short paragraphs; no em-dashes. Code blocks name their
  language. Say what the learner will be able to do, then have them do it.

## The lab code (`course-labs/`)

```
course-labs/
  lab-00/          the starting skeleton (Lab 01 starts here)
  lab-01/ ...      the solution to Lab 01, which is also where Lab 02 starts
  lab-13/          the last solution; the capstone starts from it
  tools/
    check.sh       builds and tests every lab, then refreshes each lab's start.zip
    new-lab.sh     copies lab-NN to lab-MM as the starting point for a new lab
    cards.py       writes SVG title cards for course objects that have no image
```

- **lab-NN is the solution of Lab NN; Lab NN starts from lab-(NN-1).** A learner who falls
  behind takes the previous folder and carries on. `check.sh` zips lab-(NN-1) into
  `course/topic-*/side-labs/book-labNN-*/archives/start.zip`.
- Every lab folder is a standalone Maven project with a `README.md` saying what changed from
  the previous lab. `mvn -B verify` inside it must pass. Labs are **not** modules of the
  root `pom.xml`, so the robot's build never sees them.
- From lab-04 each lab is a parent pom with two modules, `hadurling-core` (no Robocode)
  and `hadurling-robot` (the adapter); lab-12 and later add `hadurling-bench`.
- Each lab's artifactIds carry the lab number (`hadurling-lab04`, `hadurling-lab04-core`),
  so two labs never clash in a local repository.

### Shared build settings

| Setting | Value |
|---|---|
| groupId | `course.hadurling` |
| Main code | Java 11 (`maven.compiler.release` 11): RoboRumble clients run 11 |
| Test code | Java 17 (`maven.compiler.testRelease` 17) |
| Robocode API | `net.sf.robocode:robocode.api:1.9.5.6`, scope `provided`, from Maven Central |
| JUnit | 5.11.4 (`junit-jupiter`) |
| jqwik | 1.9.2 (from lab-02); test classes ending `Properties` are included by surefire |
| ArchUnit | 1.3.0 (`archunit-junit5`, from lab-05) |
| Cucumber | 7.20.1 (`cucumber-java`, `cucumber-junit-platform-engine`, `junit-platform-suite`, from lab-07) |
| Surefire | 3.5.2, includes `**/*Test.java`, `**/*Tests.java`, `**/*Properties.java` |

The robot class is always `hadurling.Hadurling`. The core's packages live under
`hadurling.core`.

### What each lab adds

| Lab | Adds | Hadur counterpart |
|---|---|---|
| 00 | `Hadurling extends AdvancedRobot`: spins its radar, nothing else | |
| 01 | radar lock, orbiting at a right angle to the enemy, head-on fire at power 1 when the gun is cool; a static round counter that survives rounds | `hadur2/Hadur.java` |
| 02 | `hadurling.physics.Angles` (normal relative and absolute angles, absolute bearing), `hadurling.physics.Rules` (bullet speed, damage, max escape angle), `hadurling.physics.Field` (walls, distance to wall); JUnit tests; a jqwik property that `Angles` equals `robocode.util.Utils` | `physics/Angles`, `physics/Rules` |
| 03 | `hadurling.model`: immutable `Input`, a closed `Event` hierarchy (`Scan`, `HitByBullet`, `BulletHit`, `HitWall`, `RobotDeath`), `Orders` with NaN meaning "leave unchanged"; a `Brain` that maps `Input` to `Orders`; the robot queues events and applies orders | `model/BotInput`, `BotEvent`, `BotOrders` |
| 04 | two modules; core packages `hadurling.core` (`Core`, `Guard`), `.model`, `.physics`, `.gun` (`HeadOnGun`), `.move` (`Orbit`), `.port` (`Telemetry`); `Guard` returns safe orders when the core throws; `GuardTest`, `CoreTest` | `Guard`, `HadurCore`, `port/` |
| 05 | `ArchitectureTest`: no `robocode..` in the core; no `java.util.Random`, threads, `java.io`/`java.nio`, `System.currentTimeMillis`/`nanoTime` in the core; model and physics never depend on gun or move; gun and move never depend on each other. `DeterminismTest`: the same inputs twice give equal orders | `arch/ArchitectureTest` |
| 06 | `hadurling.core.replay.LineCodec` (Input and Orders to and from text lines); jqwik round-trip properties with custom arbitraries; a scripted battle transcript under `src/test/resources/replay/` and `ReplayTest`; `HadurlingRecorder` in the robot module that writes a transcript from a real battle | `replay/LineCodec`, `ReplayTest` |
| 07 | `docs/requirements.md` with EARS requirements `HL-1`..`HL-8`; JUnit tests tagged `@Tag("HL-n")`; `features/hadurling.feature` with `@HL-n` scenarios; `RequirementsTraceabilityTest` that fails on an untested or unknown ID | `docs/requirements.md`, `trace/RequirementsTraceabilityTest` |
| 08 | `hadurling.core.model.Wave`; `hadurling.core.knn.KdTree<T>` with a brute-force property; `gun.GuessFactorGun` that logs guess factors and aims at the nearest neighbours' densest factor; `move.Surfer` that picks the safer of two directions | `knn/KdTree`, `gun/MainGun`, `move/SurfMover` |
| 09 | `hadurling.core.ledger.EnergyLedger`: our hits, their refunds and wall damage come out of each energy drop; drops outside [0.1, 3.0] make no wave; a jqwik generator of mixed events | `ledger/EnergyLedger` |
| 10 | `hadurling.core.memory.Profile`, `ProfileCodec` (version byte, `CRC32`), `port.ProfileStore`, `port.MemoryProfileStore` (can cut a write short); `FileProfileStore` in the robot; properties for round trips, killed writes and old versions | `memory/ProfileCodec`, `port/MemoryProfileStore` |
| 11 | `hadurling.core.policy.Estimate` (value and margin), `HitWindow`, `PowerPolicy` (power 3 only when both hit rates clear their margins), `SeedTrust` (stored samples fade on disagreement) | `memory/Estimate`, `policy/PowerPolicy`, `adapt/SeedTrust` |
| 12 | `hadurling-bench` module: headless battles through `robocode.control`, a score share with a 95% interval over seeds, a paired-seed A/B; `Stats` is unit-tested; battles run by hand | `hadur-bench` |
| 13 | `policy.TickBudget` (drops a computation level after a slow tick or a skipped turn); `memory.ProfileLibrary` that lists the store once per battle and keeps an index, with a test that counts listings as the store grows to hundreds of profiles | `policy/TickBudget`, R8 |
