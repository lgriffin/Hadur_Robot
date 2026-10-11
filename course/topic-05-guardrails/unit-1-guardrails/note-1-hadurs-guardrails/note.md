# Hadur's version: the guardrails

Read this after the talk. It walks through the two test classes that guard Hadur's design, and the documents that explain them.

The architecture rules were first added with the hexagon in S1, so the earliest version is [ArchitectureTest at afd6cc9](https://github.com/lgriffin/Hadur_Robot/blob/afd6cc9/hadur-core/src/test/java/hadur2/core/arch/ArchitectureTest.java). It had the Robocode, randomness, threads and I/O rules. Later stages added the package rules. The links below use the 3.5.1 commit, `a9ee021`, so you can read all of them. `DuelIdentityTest` arrived with the melee extension in M0 ([94deb10](https://github.com/lgriffin/Hadur_Robot/commit/94deb10)).

## ArchitectureTest

[ArchitectureTest](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/java/hadur2/core/arch/ArchitectureTest.java) imports the compiled core once, in a `static` field, and then checks it with many small rules. Read it in this order:

1. `coreHasNoRobocode` and `coreOnlyUsesJdk`: CORE-1, the hexagon's wall
2. `noRandomness`, `noThreads`, `noReflection`, `noIo`: RES-6, the determinism bans
3. `noMutableStatics`: CORE-2, no state shared between cores
4. `layering` and `gunAndMoveIndependent`: which packages may see which
5. `ledgerIsLeaf`, `memoryIsLeaf`, `adaptSeesNoClock`: leaf packages and DIAL-2

Notice how many of the rules are written as "no classes that ... should depend on ...". ArchUnit's fluent style turns a sentence into a test. Notice also that rules carry `@Tag("CORE-1")` and similar. The traceability test in Topic 07 reads those tags.

The architecture document lists the same rules in prose, in its section on [packages in the core](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/docs/architecture.md). The prose and the test say the same thing. If they ever disagree, the test is right, because it is the one that runs.

## DuelIdentityTest

[DuelIdentityTest](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/hadur-core/src/test/java/hadur2/core/arch/DuelIdentityTest.java) walks the source folders of nine duel packages, hashes each `.java` file with SHA-256 (after normalising line endings) and compares the result with a snapshot file in `src/test/resources`. It reports every file that was added, removed or edited.

The class comment explains two design choices:

- It hashes **sources**, not class files, because class bytes change with the compiler.
- Re-pinning is explicit: `-Dhadur.duel.snapshot=write`.

The testing document has a short section called [The duel is pinned](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/docs/testing.md). Read it for the human side: a change that touches the duel must say so in its pull request.

## Determinism

Determinism has two guards. The bans in `ArchitectureTest` stop the usual sources of difference. The replay fixtures prove the result. `ReplayTest.replayIsDeterministic` replays the same battle twice and requires the same orders and the same telemetry. Topic 06 covers replay.

## Doclint

The root [pom.xml](https://github.com/lgriffin/Hadur_Robot/blob/a9ee021/pom.xml) configures the Javadoc plugin with `doclint` set to `all,-missing`. A broken link or a wrong `@param` in a comment fails `mvn verify`. It is a small rule, and it is why Hadur's comments can be trusted.

## Try it

Run the architecture tests alone:

```sh
mvn -B -pl hadur-core test -Dtest=ArchitectureTest
```

Then add `import robocode.util.Utils;` to a class in `hadur-core/src/main` and run the same command. Read the failure. Then take the import out again.
