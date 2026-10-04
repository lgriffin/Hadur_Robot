# Course plan: Building Hadur

A plan for a [Tutors](https://tutors.dev) course, kept in this repository, that teaches what
was built with Hadur: the hexagonal architecture, the layered testing, requirements as code,
the strategy, and the refined approach that took the robot from 64th to 20th in the
RoboRumble. It doubles as an advanced Java learning aid: it starts from a learner who can
write a class and a loop, and ends at the level the Hadur codebase is written at.

This is a plan only. Nothing here changes the robot, and nothing is built until the plan is
reviewed.

## 1. Shape of the course

**Two kinds of content, matching the request:**

- **Modules with labs** on the parts of Hadur that stayed stable from S1 to 3.5.1: the
  values and the tick, the hexagon, the guardrails in the build, the test layers, EARS and
  traceability, waves and guns, the energy ledger, memory, policies under uncertainty, the
  bench, and performance and resilience. These are taught by building.
- **Short Marp talks** on how Hadur evolved: the rebuild (S0 to S7), melee (2.1, M0 to M6),
  the climb (R0 to R9) and how agents built it. Each is 8 to 12 slides, drawn from the
  documents and numbers already in the repo, with no lab.

**One through-line for the labs: Hadurling.** Learners build a small robot of their own,
"Hadurling", one lab at a time, so every lab extends something they wrote rather than
starting cold. It begins as an ordinary Robocode robot and, by the end, has a core with no
Robocode in it, ArchUnit rules, property tests, a replay test, EARS requirements with a
traceability test, a guess-factor gun on a KD-tree, a small energy ledger, a saved opponent
profile and a bench report. Each lab closes with a **Compare with Hadur** step that opens
the real code for the same idea, pinned to the commit that introduced it (section 5), so the
learner sees the full version after building the small one.

Hadurling is deliberately small (a few hundred lines by the end). The real robot is about
25,000 lines of production Java; reading it is the reward, not the starting point.

## 2. Tutors format, as checked against the reference course

Read from [tutors-reference-course](https://github.com/tutors-sdk/tutors-reference-course)
and the generator in [tutors-mono-repo](https://github.com/tutors-sdk/tutors-mono-repo)
(`packages/jsr/gen`, `packages/jsr/model`), 2026-10-04.

| Thing | Rule |
|---|---|
| Course root | a folder holding `course.md` (title line, then a description), `course.png` and `properties.yaml` |
| Learning object type | taken from the folder name's prefix: `topic-`, `unit-`, `side-`, `book-` (a lab), `talk-`, `note-`, `web-`, `github-`, `archive-`, `tutorial-`, `quiz-`, `panelvideo-` and so on. Folders that match no type are dropped |
| Topic | `topic-NN-name/` with `topic.md` (title line, then a summary) and `topic.png` |
| Unit | `unit-N-name/` with a `.md` title; `side-` units show in a sidebar (the reference course puts a topic's labs there) |
| Lab | `book-name/` with numbered step files, `00.Lab-NN-(md).md`, `01.Step.md`, ..., `img/`, `archives/*.zip` linked as `./archives/x.zip` |
| Talk | `talk-name/` with `talk.md` (title, one or two summary lines), `talk.png`, and either `talk.pdf` or `talk.marp` |
| Marp | `talk.marp` starts with `---` / `marp: true` / `theme` / `paginate` / `---`; the reader renders it as slides with Marp core, Mermaid included |
| Quiz | `quiz-name/quiz.md` with a fenced `quiz` block (multiple choice, `correct:` is the option index) |
| Links | `web-name/` with a `weburl` file; `github-name/` with a `githubid` file |
| Order | folder names sort; a `.md` can override with front matter `order: N` |
| Build | `deno run -A jsr:@tutors/tutors` in the course root writes `json/` (the reader's input); `jsr:@tutors/tutors-lite` writes a static `html/` site |

Two consequences for this repo:

- **No Java source inside the course folder.** A folder such as `book-hexagon/start/` would
  itself be typed as a lab (its path's last type prefix is `/book`), and its files would not
  be a usable project anyway. Lab code lives in `course-labs/` (section 4) and is reached
  from the labs by link, plus a zip in `archives/` for learners who do not clone.
- **Mermaid can be reused.** The reader renders Mermaid in notes, labs and Marp talks, so
  the README's four diagrams can be lifted as they are. The static `tutors-lite` site may
  not render it, so the build checks the reader output only (section 7).

## 3. The course tree

The course root is `course/` at the top of the repository. It is not a Maven module, and
nothing in `mvn verify` reads it.

```
course/
  course.md                 Building Hadur: from a first robot to the RoboRumble top 20
  course.png
  properties.yaml           credits, github link to this repo, labStepsAutoNumber: true
  topic-00-welcome/
  topic-01-first-robot/
  topic-02-physics-and-tests/
  topic-03-values-and-the-tick/
  topic-04-hexagon/
  topic-05-guardrails/
  topic-06-test-layers/
  topic-07-ears/
  topic-08-waves-and-guns/
  topic-09-energy-ledger/
  topic-10-memory/
  topic-11-uncertainty/
  topic-12-the-bench/
  topic-13-time-and-resilience/
  topic-14-melee/
  topic-15-evolution/        Marp talks only
  topic-16-capstone/
course-labs/                 Hadurling, one Maven project per lab step (section 4)
```

A typical module topic, following the reference course's `topic-02-side` layout:

```
topic-04-hexagon/
  topic.md, topic.png
  unit-1-hexagon/
    unit.md
    talk-1-ports-and-adapters/   talk.md, talk.png, talk.marp
    note-1-hadur-core/           note.md, img/
    quiz-1-hexagon/              quiz.md
  side-labs/
    topic-labs.md
    book-hexagon/                00.Lab-04-(md).md, 01..07 steps, img/, archives/start.zip
  unit-2-reading/
    github-1-hadur/              githubid -> lgriffin/Hadur_Robot
    web-1-architecture/          weburl -> docs/architecture.md at its pinned commit
```

## 4. Topics, labs and sources

Level is the Java and design level a learner needs coming in. Each lab names its Hadurling
step: `course-labs/lab-NN` is the answer to Lab NN and the starting point of the next,
each a standalone Maven project (Java 17 for tests, Java 11 for the robot, as
Hadur does it).

### Part 1: Foundations (beginner)

**Topic 00. Welcome** (no prerequisites)
- Talk: *Hadur in ten slides*: what Robocode and the RoboRumble are, the 1,216-robot ladder,
  64th to 20th, what the course builds. Source: README "Standing", release table.
- Lab 00: install JDK 17, Maven 3.9 and Robocode 1.9.5.6; build Hadur with `mvn verify`;
  drop `hadur2.Hadur_3.5.1.jar` into Robocode; watch it beat `sample.Crazy`; run the bench's
  sample set once. Source: README "Build and test", `hadur-bench/README.md`.
- Note: the course map, and how labs and the Hadurling projects fit together.

**Topic 01. A first robot** (classes, methods, loops)
- Talk: the Robocode model: `AdvancedRobot`, the event handlers, `execute()`, a tick, the
  battlefield's coordinates and headings.
- Lab 01 (Hadurling v0): a robot that locks its radar, orbits its enemy and fires power 1.
  Java: classes, inheritance and overriding, fields, `static` versus instance (why Hadur keeps
  its core static: the engine creates a new robot object each round).
- Quiz: events and the tick.
- Compare with Hadur: `hadur-robot/.../hadur2/Hadur.java` (the adapter's event queue).

**Topic 02. Physics as pure functions, and a first test** (methods, `Math`, doubles)
- Talk: angles, bullet speed, maximum escape angle, why "bit-identical to the engine" matters.
- Lab 02: write `normalRelativeAngle`, `bulletSpeed`, `maxEscapeAngle` and wall-stop
  prediction for Hadurling, with JUnit 5 tests, then a first jqwik property ("our angle equals
  the engine's for every input"). Java: static utility classes, floating point and tolerance,
  JUnit 5, Maven test layout.
- Compare with Hadur: `physics/Angles`, `physics/Rules`, `PhysicsMatchesEngineProperties`,
  `WallStopTest`.

### Part 2: Architecture (intermediate)

**Topic 03. Values and the tick** (interfaces, immutability)
- Talk: `BotInput` in, `BotOrders` out; a closed set of `BotEvent`s; NaN meaning "leave the
  setting alone"; handling events in the engine's priority order.
- Lab 03: Hadurling's own `Input`, `Event` and `Orders` values; the robot builds an `Input`
  each tick and applies `Orders`. Java: `final` fields, factory methods, a closed class
  hierarchy without sealed types (Java 11 target, REL-1), `equals` and `hashCode`, defensive
  copies, `List.copyOf`.
- Compare with Hadur: `model/BotInput`, `model/BotEvent`, `model/BotOrders`; architecture.md
  "The tick".

**Topic 04. The hexagon: a brain that does not know it is in Robocode** (packages, dependency direction)
- Talks: *Ports and adapters*, and *Why the hexagon paid for itself* (replay, fuzzing, fault
  injection and the bench all need a core with no engine).
- Lab 04: split Hadurling into `hadurling-core` (no `robocode.*`) and `hadurling-robot`
  (the adapter); add a `Guard` that returns safe orders when the core throws; add a
  `Telemetry` port. Java: multi-module Maven, interfaces as ports, exceptions as a boundary,
  test doubles.
- Note: Hadur's core packages and what each depends on, with the README's hexagon and
  one-tick Mermaid diagrams.
- Compare with Hadur: the S1 commit (section 5), `Guard`, `GuardTest`, `port/*`,
  architecture.md "Modules", "Ports and values".

**Topic 05. Guardrails in the build** (annotations, the build as a reviewer)
- Talk: *Rules that do not rely on anyone remembering them*: ArchUnit, determinism, the
  duel's hash pin, doclint.
- Lab 05: ArchUnit rules for Hadurling (no Robocode in the core; no `Random`, threads,
  I/O or clock; one dependency direction between packages). Break each rule on purpose and
  read the failure. Then a determinism test: the same inputs twice give the same orders.
- Compare with Hadur: `arch/ArchitectureTest`, `arch/DuelIdentityTest`, testing.md "The duel
  is pinned".

### Part 3: Testing and requirements (intermediate to advanced)

**Topic 06. Testing in layers** (generics, functional interfaces)
- Talk: the layer table (architecture, properties, unit, release, replay, behaviour,
  traceability, adapter, bench) and what each catches that the others cannot.
- Lab 06, part one: property tests with jqwik: custom `Arbitrary` generators, shrinking, a round-trip
  property, a model-based property (fast code equals a brute-force check, as MOVE-1 does).
- Lab 06, part two: record and replay. Hadurling writes each tick's input and orders as line records;
  a replay test feeds a recorded battle through a fresh core and requires the same orders.
  Java: `java.util.zip`, readers and writers, `Iterator`, test resources.
- Compare with Hadur: `replay/LineCodec`, `replay/ReplayTest`, `BulletShadowsProperties`,
  testing.md "Replay fixtures".

**Topic 07. Requirements as code: EARS and traceability** (reflection, regular expressions, file I/O)
- Talk: the five EARS patterns, with Hadur's own examples (CORE-1 ubiquitous, MEM-1 event,
  DIST-1 state, WAVE-2 unwanted, POW-1 optional), and why a stable ID is the contract between
  a planner and an implementer.
- Lab 07: write eight EARS requirements for Hadurling in a Markdown table; tag JUnit tests
  with `@Tag("HL-3")` and a Cucumber scenario with `@HL-3`; write a traceability test that
  reads the table, scans the test sources and fails on an untested or unknown ID.
- Quiz: classify ten requirements by pattern.
- Compare with Hadur: `docs/requirements.md`, `trace/RequirementsTraceabilityTest`,
  `features/*.feature`, the site's requirement map.

### Part 4: The strategy (advanced)

**Topic 08. Waves, guess factors and nearest neighbours** (arrays, generics, `PriorityQueue`)
- Talks: *Waves* (a bullet as an expanding circle, the guess factor) and *Surfing* (danger
  over guess factors, choosing a direction).
- Lab 08: a guess-factor gun for Hadurling backed by a small KD-tree, property-tested
  against a brute-force nearest-neighbour search; then a two-option wave surfer. Java:
  generics, arrays for speed, `PriorityQueue`, `Comparator`, complexity.
- Compare with Hadur: `knn/KdTree`, `gun/MainGun`, `gun/AntiSurferGun`, `move/SurfMover`,
  `move/BulletShadows`.

**Topic 09. Seeing shots as they really are: the energy ledger** (state machines, invariants)
- Talk: an energy drop is not always a shot; WAVE-1 and WAVE-2; 99.8% of Shadow's visible
  shots found with no false waves.
- Lab 09: Hadurling's ledger, built test-first: subtract our hits, their refunds and wall
  damage; reject drops outside [0.1, 3.0]; a jqwik generator that mixes events and checks the
  recovered shot power exactly.
- Compare with Hadur: `ledger/EnergyLedger`, `EnergyLedgerProperties`, `waves.feature`,
  the S2 commit.

**Topic 10. Memory: profiles that survive** (binary I/O, versioning, checksums)
- Talk: a profile per opponent, lineage keys, Robocode's data quota, crash-safe saves, and
  the bug that cost 5 to 8 APS live (Topic 13 picks it up).
- Lab 10: a versioned binary codec for a Hadurling profile with `DataOutputStream` and
  `CRC32`; a `ProfileStore` port with an in-memory adapter that can cut a write short;
  properties that every killed write leaves a loadable profile and that old versions still
  load. Java: streams, `ByteBuffer`, checked exceptions, try-with-resources.
- Compare with Hadur: `memory/ProfileCodec`, `memory/LineageKey`, `port/MemoryProfileStore`,
  `hadur2/FileProfileStore`, `FileProfileStoreTest`, the S3 commit.

**Topic 11. Deciding under uncertainty** (value classes, small statistics)
- Talk: DIAL-1: every input carries a margin of error, and every policy stays conservative
  until the evidence is certain enough; live evidence overrules the profile (RES-4).
- Lab 11: an `Estimate` (value and margin) and a rolling hit window; a power policy that
  fires 3.0 only when both hit rates clear their margins (POW-2), and a test that it holds
  back on thin evidence. Then a seed-trust rule that fades stored samples on disagreement.
- Compare with Hadur: `memory/Estimate`, `policy/HitWindow`, `policy/PowerPolicy`,
  `adapt/OpeningBook`, `adapt/SeedTrust`, the S4 and S5 commits; the PR #61 review findings
  in strategy-evolution.md as a case study in rules that can never fire.

### Part 5: Engineering for the real world (advanced)

**Topic 12. Evidence: the bench** (processes, concurrency at the edge, simple statistics)
- Talks: *Nothing merges on a hunch* (gates, cold and warm, 95% intervals over seeds) and
  *Bench versus rumble* (L-02: bench share predicts live at r = 0.84; 0.96 by 3.4).
- Lab 12: run Hadurling headless against the sample bots with Robocode's control API;
  report score share as a mean with a 95% interval over five seeds; A/B one change on paired
  seeds and decide whether it is outside the noise.
- Compare with Hadur: `hadur-bench` (`BattleRunner`, `Report`, `Stats`), `docs/bench/`,
  `data/learnings.md`.

**Topic 13. Time and resilience** (timing, complexity, profiling)
- Talk: *The slide*: 3.0 and 3.1 started near 85.7 APS and lost 5 to 8 points within hours;
  no bench reproduced it until a 300-battle one-JVM session did; the round-end save listed a
  data directory that grows by one file per opponent.
- Lab 13: give Hadurling a tick budget that sheds work after a slow tick; then reproduce the
  slide in miniature (save a profile per opponent, time the save as the directory grows to
  hundreds of files), and fix it with one listing per battle and an index. Java:
  `System.nanoTime`, `java.nio.file`, measuring growth, bounded collections.
- Compare with Hadur: `policy/TickBudget`, `Duress`, the R7 and R8 commits,
  `docs/skipped-turns-plan.md`, `docs/bench/r8-memory-scale.md`.

**Topic 14. Melee: a second posture** (strategy pattern, failing closed)
- Talk: one robot, two brains; a gate that fails closed to the duel; minimum-risk movement;
  "1v1 is sacred".
- Note with the posture diagram and the M6 bench table. No lab: melee is a reading topic,
  and an optional extension in the capstone.
- Compare with Hadur: `posture/PostureGate`, `melee/MinimumRiskMovement`,
  `melee/FieldGun`, architecture.md "Melee and duel".

### Part 6: How Hadur evolved (Marp talks)

**Topic 15. Evolution.** Four units of short decks, each slide carrying a real number or a
link into the repo. These need no lab code and can ship first (section 7).

| Unit | Talk | Draws on |
|---|---|---|
| 1. The rebuild | *Hadur 1.x: strong but opaque* | strategy-evolution.md "Starting point" |
| | *S0: measure before changing anything* | `docs/bench/s0-baseline-1.20-cold.md` |
| | *S1-S2: brain from engine, shots as they are* | S1 and S2 bench reports, CORE-1/2, WAVE-1/2 |
| | *S3-S4: remember and adapt* | S3 and S4 cold and warm reports, MEM, ADAPT, DIAL |
| | *S5-S6: press when ahead, be harder to hit* | S5 and S6 reports; Shadow 40.8% to 57.4% |
| 2. Melee | *2.1 to 3.0: a second brain without touching the first* | `docs/bench/m*-gates.md`, release notes 2.1 and 3.0 |
| 3. The climb | *3.0: 64th, and what the rumble measures* | `docs/bench/rumble-3.0-details.md`, L-01.. |
| | *3.1: 16th for an hour, then 65th* | rumble-climb-top30-plan.md section 1 |
| | *Hunting the slide: the session bench* | `docs/bench/r7-session.md`, skipped-turns-plan.md |
| | *3.4: memory at scale, 20th* | r8-memory-scale.md, top20-analysis.md |
| | *3.5: the weak-bot leak and what is next* | `docs/bench/r9-weak-leak.md`, issue #80 |
| 4. Built by agents | *A planner, implementers and a build that remembers* | README "Built by agents" |

### Part 7: Capstone

**Topic 16. Capstone: one feature end to end.** The learner picks one feature for
Hadurling and delivers it the way every Hadur stage was delivered: EARS requirements first,
failing tests tagged with their IDs, the implementation, ArchUnit and traceability green, a
bench gate with an interval, and release notes. Suggested features, each with the Hadur
version to compare against: run from a rammer (RAM-2), bullet-shadow scoring (MOVE-1), a
mirror-mover detector (MIR-1), or a two-posture melee gate (GATE-1..5).

### Java skills by topic

| Java and engineering skill | Topics |
|---|---|
| Classes, inheritance, overriding, `static` | 01 |
| JUnit 5, Maven layout, floating point | 02 |
| Immutability, value objects, closed hierarchies, `equals`/`hashCode` | 03 |
| Interfaces as ports, multi-module Maven, exceptions as boundaries | 04 |
| ArchUnit, determinism, the build as a reviewer | 05 |
| Generics, functional interfaces, jqwik, I/O streams, zip | 06 |
| Reflection, regular expressions, file scanning, Cucumber | 07 |
| Arrays, `PriorityQueue`, `Comparator`, algorithmic complexity | 08 |
| State machines and invariants, test-first design | 09 |
| Binary I/O, `ByteBuffer`, `CRC32`, versioned formats, fault injection | 10 |
| Small statistics, margins of error, conservative defaults | 11 |
| Running an engine headless, confidence intervals, A/B on paired seeds | 12 |
| `nanoTime`, `java.nio.file`, growth under load, bounded collections | 13 |
| Strategy pattern, failing closed | 14 |

## 5. Pinned commits for "Compare with Hadur"

Labs link to the real code at the commit that introduced it, so the link still shows the
idea in its first, smallest form. Claude sessions cannot push tags, so the links use commit
SHAs; if Leigh wants friendlier names, `course/s1`-style tags can be pushed by hand later.

| Stage | Commit | PR |
|---|---|---|
| S0 bench and baseline | `5d54b9e` | #18 |
| S1 hexagon, guard, replay, traceability | `afd6cc9` | #19 |
| S2 energy ledger, radar reacquire | `c47186e` | #20 |
| S3 opponent memory | `a844960` | #28 |
| S4 recognise and adapt | `6ecfcd4` | #29 |
| S5 aggressive | `a2c571e` | #30 |
| S6 unhittable | `dd9e419` | #31 |
| S7 docs, 2.2 | `60b18fe` | #32 |
| M0-M1 posture gate | `94deb10` | #35 |
| M3 minimum risk | `c1ec5c7` | #37 |
| M6 release 3.0 | `6a33109` | #42 |
| R2 full share vs weak bots | `17f0d4e` | #61 |
| R7 session bench, duress | `e53c8f5` | #71 |
| R8 memory at scale, 3.4 | `04f63e9` | #77 |
| R9 rammers and mirrors, 3.5 | `96607d7` | #81 |
| 3.5.1 | `a9ee021` | #82 |

## 6. Lab code: `course-labs/`

```
course-labs/
  AUTHORING.md             conventions for the course and the labs
  lab-00/                  the starting skeleton (Lab 01 starts here)
  lab-01/ ... lab-13/      lab-NN is the solution of Lab NN and the start of Lab NN+1
  tools/check.sh           builds and tests every lab; zips lab-(NN-1) into
                           course/topic-NN-*/side-labs/book-labNN-*/archives/start.zip
  tools/new-lab.sh         copies one lab to the next, renumbering its artifactIds
  tools/cards.py           writes SVG title cards for course objects without an image
```

- Each lab folder is one standalone Maven project, so a learner who falls behind takes the
  previous folder and carries on. (The first draft of this plan had a `start` and a
  `solution` per lab; one folder per lab holds the same code without the duplicate.)
- Robocode's API comes from Maven Central (`net.sf.robocode:robocode.api:1.9.5.6`), so a
  lab's zip builds on its own, outside this repository.
- The root `pom.xml` does not list `course-labs`, so `mvn verify` for the robot, the
  traceability test and the duel hash pin are untouched.

## 7. Order of build

One PR per phase, planned here and implemented by later threads. Each phase ends with the
course generator run on `course/` (no errors, every learning object typed as intended) and
`tools/check.sh` green for the labs it adds.

| Phase | Delivers | Why this order |
|---|---|---|
| C0 | `course/` skeleton: `course.md`, `properties.yaml`, every `topic.md` and placeholder image; Topic 00 complete; `.gitignore` for `course/json` and `course/html`; publishing notes | proves the folder imports into Tutors before any content |
| C1 | Topic 15, all evolution talks in Marp | needs no lab code; the material exists in `docs/` and `data/` |
| C2 | `course-labs` lab 01 to 05 and Topics 01 to 05 | the foundations every later lab builds on |
| C3 | Labs 06 and 07, Topics 06 and 07 | testing and EARS, the course's distinctive part |
| C4 | Labs 08 to 11, Topics 08 to 11 | the strategy |
| C5 | Labs 12 and 13, Topics 12 to 14, Topic 16 | real-world engineering and the capstone |

**Publishing.** The reference course deploys with a build of `deno run -A jsr:@tutors/tutors`
and serves `json/`, which tutors.dev reads as `tutors.dev/course/<site>`. For this repo:
a Netlify (or Vercel) site with base directory `course`, that build command and publish
directory `json`. GitHub Pages is already used for the Hadur docs site on `gh-pages`, so the
course should not take it over.

## 8. Defaults picked, for review

- **Folder names:** `course/` for the Tutors course and `course-labs/` for lab code.
- **Hadurling as the lab through-line** rather than labs that edit the real robot. Editing
  Hadur directly would mean lab steps fighting the replay fixtures and the duel hash pin, and
  25,000 lines is a steep first read.
- **Netlify for hosting**, keeping `gh-pages` for the docs site.
- **Seventeen topics** in seven parts. If that is more than wanted, Topics 13 and 14 fold into
  the evolution talks and Topic 02 folds into Topic 01, leaving fourteen.
- **No video or podcast objects**; talks are Marp, and Leigh can add recorded panel videos to
  any topic later.
