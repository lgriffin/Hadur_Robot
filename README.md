# Hadur v1.17

**Hadur** — the Hungarian god of war — is a competitive [Robocode](https://robocode.sourceforge.io/) robot built with clean architecture, dual-mode combat, and behaviour-driven development.

## Battle Capabilities

Hadur supports two combat modes, automatically transitioning as opponents are eliminated:

| Mode | Detection | Movement | Targeting | Radar |
|------|-----------|----------|-----------|-------|
| **DUEL** (1v1) | `getOthers() == 1` | True wave surfing | 5-gun virtual array | 2x-overshoot narrow lock |
| **MELEE** (FFA) | `getOthers() > 1` | Minimum-risk positioning | Circular prediction | Stalest-opponent sweep |

### Wave Surfing (Duel)
- Detects enemy fire via energy drops (0.09–3.01 threshold)
- Evaluates clockwise vs counter-clockwise movement per incoming wave
- Multi-wave surfing: 2nd wave used as 35%-weighted tiebreaker
- Segmented danger stats: distance x velocity x acceleration (5x5x3x47 bins)
- Flattener activates when hit rate exceeds 9%
- Precise Robocode physics: acceleration 1.0, deceleration 2.0, velocity-dependent turn rate
- Wall smoothing with 160px stick

### Virtual Gun Array (Duel)
Five guns compete in a rolling 30-wave window:

| Gun | Strategy |
|-----|----------|
| **GuessFactor** | 5D segmented stats (distance, velocity, lateral velocity, acceleration, wall proximity) with 0.95 decay |
| **PatternMatching** | 1000-tick circular history buffer with play-it-forward symbolic matching |
| **Circular** | Constant turn-rate projection |
| **Linear** | Straight-line projection |
| **HeadOn** | Direct bearing |

### Opponent Intelligence
- Classifies movement into 7 types: STOPPED, LINEAR, CIRCULAR, OSCILLATING, RANDOM, WAVE_SURFER, UNKNOWN
- Wave-surfer detection via fire-tick/reversal correlation analysis
- Threat assessment: 35% accuracy + 25% energy + 20% aggression + 20% bullet power
- Multi-round persistence via static fields

### Minimum Risk Movement (Melee)
- Evaluates 24 directions x 3 distances (100/175/250px) every 30 ticks
- Risk per point: `sum(energy / distance^2)` across all enemies
- Penalties for close range (<200px), walls (<60px), corners (<150px), staying in place
- Lateral-angle bonus rewards perpendicular positioning

### Smart Fire Power
- Distance-based scaling: 3.0 (close) down to 1.0 (far)
- Finishing moves when enemy energy <= 4
- Energy conservation caps when low
- Accuracy penalty reduces power during inaccurate phases

## Architecture

```
hadur117/
|-- Hadur.java                       Main robot (orchestrator)
|-- model/
|   |-- BattleMode.java              Enum: DUEL, MELEE
|   |-- MovementType.java            Enum: 7 movement classifications
|   |-- OpponentData.java            Per-opponent state
|   +-- Snapshot.java                Immutable tick snapshot
|-- intel/
|   |-- Brain.java                   Classification, threat assessment, tracking
|   +-- MeleeTargetSelector.java     Target scoring for melee
|-- gun/
|   |-- Gun.java                     5 virtual guns, wave tracking
|   +-- GunWave.java                 Outgoing bullet wave data
|-- movement/
|   |-- WaveSurfer.java              True wave surfing (duel)
|   |-- MinimumRiskMovement.java     Risk-minimising movement (melee)
|   +-- EnemyWave.java               Incoming bullet wave data
+-- radar/
    +-- Radar.java                   Narrow lock / stalest-opponent sweep
```

Dependencies flow inward: subsystems depend on model, the main robot depends on everything. No subsystem references another directly.

## Prerequisites

- **Java 17+** (JDK)
- **Maven 3.8+**

No external dependency setup is needed — `robocode.jar` is bundled in a project-local Maven repository (`repo/`).

## Build

```bash
# Compile
mvn clean compile

# Package (creates target/hadur-1.17.jar)
mvn clean package -DskipTests

# Full build with tests + coverage
mvn clean verify
```

## Testing

### Unit Tests (JUnit 5 + Mockito)

```bash
mvn test
```

Tests cover model classes, Brain classification logic, MeleeTargetSelector scoring, Gun fire-power calculations, and data carriers.

### BDD / Integration Tests (Cucumber)

```bash
mvn verify
```

87 scenarios across 8 feature files define Hadur's expected behaviour:

| Feature | Scenarios | Focus |
|---------|-----------|-------|
| Radar System | 6 | Lock acquisition, maintenance, recovery |
| Movement | 13 | Wave surfing, danger assessment, wall smoothing |
| Targeting | 13 | Virtual guns, GuessFactor, pattern matching |
| Energy Management | 9 | Fire power, conservation, survival mode |
| Opponent Intelligence | 12 | Classification, threat assessment, anti-surfer |
| Battle Strategy | 10 | Mode detection, coordination, analytics |
| Architecture | 10 | Component structure, contracts, naming |
| Melee Strategy | 14 | Mode transitions, anti-gravity, target selection |

Feature files are in `src/test/resources/features/`, step definitions in `src/test/java/hadur117/steps/`.

### Code Coverage (JaCoCo)

```bash
mvn clean verify
```

Coverage report is generated at `target/site/jacoco/index.html`. The JaCoCo agent instruments both unit and integration tests.

## Documentation

### Javadoc

```bash
mvn javadoc:javadoc
```

Browse the generated docs at `target/site/apidocs/index.html`. Every public class and package has documentation covering purpose, key algorithms, and cross-references.

### Maven Site

```bash
mvn site
```

Generates a full project site including Javadoc, JaCoCo coverage, and dependency information at `target/site/index.html`.

## Deploying to Robocode

1. Build the JAR:
   ```bash
   mvn clean package -DskipTests
   ```

2. Copy `target/hadur-1.17.jar` to your Robocode `robots/` directory.

3. In Robocode, add `hadur117.Hadur` to a battle.

## Project Structure

```
Hadur_Robot/
|-- pom.xml                          Maven build configuration
|-- repo/                            Project-local Maven repo (robocode-api)
|-- src/
|   |-- main/
|   |   |-- java/hadur117/           Robot source code (12 files)
|   |   +-- resources/hadur117/      Hadur.properties
|   +-- test/
|       |-- java/hadur117/           Unit tests + Cucumber runner
|       |   +-- steps/               Cucumber step definitions
|       +-- resources/features/      BDD feature files (8 files)
+-- target/                          Build output (git-ignored)
    +-- site/
        |-- apidocs/                 Javadoc
        +-- jacoco/                  Coverage report
```

## Key Design Decisions

- **Dual-mode architecture**: Single robot handles both 1v1 and melee rather than separate bots, with automatic mode transition when opponents are eliminated.
- **Static persistence**: GuessFactor stats, danger stats, and opponent data survive across rounds via static fields — no file I/O needed.
- **Virtual gun selection**: Rolling window (not cumulative) lets the gun adapt within 30 waves when an opponent changes strategy.
- **Flattener threshold**: 9% hit rate triggers profile flattening, inspired by DrussGT's approach to defeating statistical surfers.
- **Hysteresis in target selection**: Prevents thrashing in melee — the current target is kept unless a new one scores >10% better.

## Colour Scheme

| Component | Colour | Hex |
|-----------|--------|-----|
| Body | Dark crimson | `#8B0000` |
| Gun | Molten gold | `#DAA520` |
| Radar | Blood red | `#B22222` |
| Bullets | Orange-red | `#FF4500` |
| Scan arc | Dark orange | `#FF8C00` |

## License

This project is provided for educational and competitive Robocode purposes.

## Author

**lgriffin** — [github.com/lgriffin/robocode](https://github.com/lgriffin/robocode)
