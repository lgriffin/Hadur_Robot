# Hadur's version: the energy ledger

The ledger is small enough to read in one sitting. This note points at the first version, from stage S2, and then at what changed.

The S2 commit is `c47186e`. The class there is 171 lines. The 3.5.1 version is 366, mostly longer Javadoc and WAVE-3.

## The class, at S2

[`EnergyLedger.java` at S2](https://github.com/lgriffin/Hadur_Robot/blob/c47186e/hadur-core/src/main/java/hadur2/core/ledger/EnergyLedger.java)

Read it in this order.

1. The class comment. It names the five causes and says where the ledger sits in the tick: `HadurCore` feeds it hit events, then calls `scan` with the scan.
2. The fields. A baseline flag (`seen`), the last scan's energy, velocity and tick, and three held corrections.
3. The three event methods (`ourBulletHit`, `enemyBulletHitUs`, `robotsCollided`). Each just adds to a held correction.
4. `scan`. The order of corrections is WAVE-1. The returned `Reading` says whether it is a shot, and whether it was a phantom (1.20 would have surfed it) or hidden (1.20 would have missed it).
5. `wallDamage` and `impactSpeeds`. This is the only hard part. Read the list in the Javadoc, then the code.

## The test that matters most

[`EnergyLedgerProperties.java`](https://github.com/lgriffin/Hadur_Robot/blob/c47186e/hadur-core/src/test/java/hadur2/core/ledger/EnergyLedgerProperties.java) has the properties from the talk: recover the exact power under any mix of effects, never make a wave from an explained drop, explain every reachable wall impact speed, and only accept drops inside the bullet range.

Notice the last one:

```java
boolean inRange = drop >= Rules.MIN_BULLET_POWER - 1e-6
    && drop <= Rules.MAX_BULLET_POWER + 1e-6;
assertEquals(inRange, EnergyLedger.isShot(drop));
```

It restates the requirement as a one-line oracle. That is a good habit for the lab.

## From requirement to scenario

[`waves.feature`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/resources/features/waves.feature) says the same things in plain sentences, each tagged with its requirement: a plain drop is a shot, our own damage is not, a shot hidden by a refund is still found, a wall hit is not a shot, a shot seen after missed scans is surfed from the scan before the gap.

Topic 07's traceability test makes sure every `WAVE-n` has at least one test. This feature file is where the sentences live.

## What changed after S2

- WAVE-3 (stage R2): a `Reading` now carries an `uncertain` flag when a wall hit and a shot-sized remainder share one interval. [The 3.5.1 class](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/main/java/hadur2/core/ledger/EnergyLedger.java) clamps the power to a legal value and flags it, and `SurfMover` halves that wave's danger.
- The rest is the same logic with longer comments. The collision guard and the braking check were already in the S2 version.

## The boundary around it

The ledger may depend only on physics and `java..`, and an ArchUnit rule enforces it:

```java
noClasses().that().resideInAPackage("hadur2.core.ledger..")
    .should().dependOnClassesThat().resideOutsideOfPackages(
        "hadur2.core.ledger..", "hadur2.core.physics..", "java..")
    .check(core);
```

That is `ledgerIsLeaf` in [`ArchitectureTest`](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/java/hadur2/core/arch/ArchitectureTest.java). The reason is in its comment: nothing the gun or the movement thinks can change which drops become waves.

## Numbers to remember

From `docs/strategy-evolution.md` and `docs/bench/s2-2.0-cold.md`:

- 99.4% of the shots a scan could reveal found, 0 false waves, against Shadow 3.83c
- 1,820 drops across all opponents explained away that 1.20 would have surfed
- 13.6% false waves against Crazy before the acceleration-before-wall-check fix

## Try this

1. Find the line in `scan` that decides whether a wall hit is looked for. Why does a collision turn it off?
2. A robot at 8 px/tick stops dead at a wall and its energy falls by 3.0 in one tick. Is that a shot? Work it out with `Rules.getWallHitDamage` and the list in `wallDamage`.
3. Open the lab's ledger and compare its `scan` with this one. What does yours not yet handle?
