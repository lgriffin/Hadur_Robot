# Lab 05: guardrails in the build

Changed from lab 04:

- `ArchitectureTest` (in `hadurling-core`, uses ArchUnit 1.3.0): the core has no
  `robocode.*`; no `java.util.Random`, `Math.random` or threads; no `java.io`, `java.nio` or
  `java.net`; no `System.currentTimeMillis` or `nanoTime`; `model` and `physics` never depend
  on `gun` or `move`; `gun` and `move` never depend on each other.
- `DeterminismTest`: two fresh cores given the same inputs give equal orders, and a guard
  around a healthy core changes nothing.
- No change to main code. The rules describe what it already respects.

Lab 06 starts here.
