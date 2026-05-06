# Testing Follow-up Items

This document tracks known gaps and issues in the test suite that need to be addressed in subsequent PRs.

## Cucumber BDD Integration Tests (Priority: HIGH)

The 8 feature files under `src/test/resources/features/` have corresponding step definitions in `src/test/java/hadur117/steps/`, but `mvn verify` currently fails due to Cucumber expression syntax issues in several step definition files.

### Issue: Invalid Cucumber Expression Escapes

Cucumber Expressions only allow escaping these characters: `(`, `)`, `{`, `}`, `\`. Several step definitions contain invalid escapes that cause `CucumberExpressionException` at runtime.

**Files affected:**

| File | Issue | Lines |
|------|-------|-------|
| `ArchitectureSteps.java` | `\/` (escaped forward slash) — partially fixed, some remaining | ~3 instances |
| `EnergySteps.java` | Unescaped `)` after escaped `\(` | Line 246 |
| `MovementSteps.java` | `\[` (escaped bracket — `[` is not escapable) | Line 327 |
| `StrategySteps.java` | Unescaped `)` after escaped `\(` | Lines 48, 54, 59, 67, 284, 454 |
| `MeleeSteps.java` | Unescaped `)` after escaped `\(` | Lines 76, 258, 264, 269, 279, 305, 461, 563, 574 |
| `IntelligenceSteps.java` | Unescaped `)` after escaped `\(` | Lines 162, 288, 296, 308, 329, 337, 342 |
| `TargetingSteps.java` | Unescaped `)` after escaped `\(` | Line 280 |

**Fix:** For each occurrence, ensure both `(` and `)` are escaped as `\\(` and `\\)` in the Java string literal, and remove `\\/` and `\\[` escapes (replace with literal `/` and `[`).

### Issue: Step Expression / Feature File Mismatches (ArchitectureSteps.java)

Several step expressions in `ArchitectureSteps.java` were partially updated but still have mismatches against the updated `07_architecture.feature`. Work was in progress when stopped.

**Remaining mismatches to verify:**
- Step expressions referencing old class names (`HadurRadar`, `HadurGun`, `HadurMovement`) vs new names (`Radar`, `Gun`, `WaveSurfer`) — most were fixed but full verification needed
- Feature text changes around package/naming conventions need step expression alignment

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

### Integration tests marked @Pending

Several Cucumber scenarios are stubbed with `assertTrue(true)` because they require a running Robocode battle simulation:

- **06_battle_strategy.feature**: Dominate head-on bot, compete against wave surfer, defeat ram bot
- **08_melee_strategy.feature**: Crossfire avoidance, last-hit avoidance, escape route cutting
- **05_opponent_intelligence.feature**: Anti-surfer feint strategies

These would require a Robocode test harness (e.g., `robocode.control.BattlefieldSpecification`) to run actual battles programmatically.

## Code Coverage (JaCoCo)

JaCoCo is configured in `pom.xml` with `prepare-agent` and `report` goals. Coverage reports generate to `target/site/jacoco/` after `mvn verify`. Current coverage is based on unit tests only since Cucumber tests are not yet passing.

**Expected coverage gaps:**
- `Hadur.java` — main robot class, not testable without Robocode runtime
- Event handler methods (`onScannedRobot`, `onHitByBullet`, etc.) — require Robocode events
- Movement execution paths (`doSurfing`, `doMinimumRisk`) — require live robot

## Javadoc (Status: COMPLETE)

All 12 source files and 6 `package-info.java` files have Javadoc. Run `mvn javadoc:javadoc` to generate to `target/site/apidocs/`.

## Recommended Next Steps

1. **Fix Cucumber expression escapes** — Straightforward find-and-replace across step files (~30 minutes)
2. **Verify `mvn verify` passes** — Run full build after expression fixes
3. **Review JaCoCo coverage report** — Identify any easily testable code paths missed
4. **Consider Robocode test harness** — For integration-level battle simulation tests (significant effort)
