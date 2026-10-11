# Guardrails

Check the ideas behind ArchUnit, determinism and the duel pin.

```quiz
title: Guardrails in the build
---
question: What does ArchUnit analyse?
type: multiple-choice
options:
  - The running robot's memory
  - Compiled classes, and their dependencies
  - Comments in the source files
  - Git history
correct: 1
---
question: Rule 1 bans robocode.* in the core. Rule 2 allows only java.lang, java.util, java.awt.geom and the core itself. What is the advantage of rule 2?
type: multiple-choice
options:
  - It runs faster
  - It also catches a library nobody thought to ban
  - It checks the Javadoc
  - It lets the core use threads
correct: 1
---
question: Which of these does Hadur's core ban to keep it deterministic?
type: multiple-choice
options:
  - Static final constants
  - Interfaces
  - java.util.List
  - Unseeded randomness, threads, I/O and clocks
correct: 3
---
question: Why does a rule require every static field in the core to be final?
type: multiple-choice
options:
  - A mutable static is state that two cores would share
  - Final fields compile faster
  - The engine forbids static fields
  - Final fields are required by Java 11
correct: 0
---
question: What does DuelIdentityTest hash?
type: multiple-choice
options:
  - The compiled class files of the whole project
  - The replay fixtures
  - The source files of the duel's packages
  - The robot jar
correct: 2
---
question: Why does DuelIdentityTest hash source files rather than class files?
type: multiple-choice
options:
  - Source files are smaller
  - Class bytes change with the JDK that compiles them
  - ArchUnit cannot read class files
  - Class files are not in the repository
correct: 1
---
question: A melee change legitimately has to edit a duel file. What should the pull request do?
type: multiple-choice
options:
  - Delete DuelIdentityTest
  - Skip the build
  - Re-pin the snapshot with -Dhadur.duel.snapshot=write and say why
  - Rename the package
correct: 2
```
