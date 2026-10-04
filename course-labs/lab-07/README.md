# Lab 07: requirements as code

Changed from lab 06:

- `docs/requirements.md`: eight EARS requirements, `HL-1` to `HL-8`, one per row.
- Tests are tagged with the requirement they verify: `@Tag("HL-3")` on JUnit tests (the class
  or the method) and jqwik's own `@Tag` on properties; `features/hadurling.feature` has
  `@HL-n` scenarios, run by `CucumberTest` with the steps in `CoreSteps`.
- `RequirementsTraceabilityTest` reads the table, scans the test sources of both modules, and
  fails if a requirement is named by no test, or a tag names no requirement. It also writes
  `hadurling-core/target/requirements-coverage.md`.
- No change to main code.

Later labs (waves, ledger, memory, the bench) start from here.
