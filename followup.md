# Testing Follow-up Items

This document tracks known gaps and issues in the test suite that need to be addressed in subsequent PRs.

## Cucumber BDD Integration Tests (Status: PASSING)

All 8 feature files under `src/test/resources/features/` have corresponding step definitions in `src/test/java/hadur117/steps/`, and `mvn verify` passes with 104 Cucumber scenarios + 236 unit tests = 340 tests total.

### Integration tests marked @Pending

Several Cucumber scenarios are stubbed with `assertTrue(true)` because they require a running Robocode battle simulation:

- **06_battle_strategy.feature**: Dominate head-on bot, compete against wave surfer, defeat ram bot
- **08_melee_strategy.feature**: Crossfire avoidance, last-hit avoidance, escape route cutting
- **05_opponent_intelligence.feature**: Anti-surfer feint strategies

These would require a Robocode test harness (e.g., `robocode.control.BattlefieldSpecification`) to run actual battles programmatically.

## Unit Tests (Status: PASSING)

All 236 unit tests pass via `mvn test`. No known gaps in unit test coverage for the current codebase.

**Test files (12 total):**
- `model/` — BattleModeTest (10), MovementTypeTest (8), SnapshotTest (7), OpponentDataTest (20)
- `intel/` — BrainTest (36), MeleeTargetSelectorTest (13)
- `gun/` — GunTest (29), GunWaveTest (12)
- `movement/` — EnemyWaveTest (10), WaveSurferTest (10), MinimumRiskMovementTest (9)
- `radar/` — RadarTest (5)

### Areas with limited test depth

| Area | Gap | Reason |
|------|-----|--------|
| `Gun.onScannedRobot()` | Not unit-testable | Requires `ScannedRobotEvent` which cannot be instantiated without Robocode runtime |
| `WaveSurfer.doSurfing()` | Not unit-testable | Requires live `AdvancedRobot` with working physics |
| `Radar.doDuelRadar()` | Partially tested | Uses mocked robot; real radar behaviour depends on Robocode engine |
| `MinimumRiskMovement.doMinimumRisk()` | Not unit-testable | Requires live robot reference |
| `Brain.update()` | Not unit-testable | Requires `ScannedRobotEvent` |
| `Hadur` (main robot) | Not unit-testable | Extends `AdvancedRobot`, requires Robocode engine |

## Code Coverage (JaCoCo)

JaCoCo is configured in `pom.xml` with `prepare-agent` and `report` goals. Coverage reports generate to `target/site/jacoco/` after `mvn verify`.

**Expected coverage gaps:**
- `Hadur.java` — main robot class, not testable without Robocode runtime
- Event handler methods (`onScannedRobot`, `onHitByBullet`, etc.) — require Robocode events
- Movement execution paths (`doSurfing`, `doMinimumRisk`) — require live robot

## Javadoc (Status: COMPLETE)

All 12 source files and 6 `package-info.java` files have Javadoc. Run `mvn javadoc:javadoc` to generate to `target/site/apidocs/`.

## Recommended Next Steps

1. **Consider Robocode test harness** — For integration-level battle simulation tests (significant effort)
2. **Review JaCoCo coverage report** — Identify any easily testable code paths missed
3. **Per-opponent profiling across battles** — Enhance multi-round learning
