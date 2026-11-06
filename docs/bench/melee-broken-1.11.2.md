# Melee robots that do not load on Robocode 1.11.2 (2026-11-02)

Some melee robots are broken on the current engine, so they are found on the cloud box and kept out
of the bench by a skip list. Robocode 1.11.2 (required by the rumble since 2026-11-01, `docs/bench/robocode-1.11.2.md`)
verifies robot classes as they load. Ten robots of the 414-robot melee census fail that check, so
they cannot fight on the bench or on any live client.

## How it was found

`hadur-bench/tools/loadcheck/run.sh` (cloud, 4 cores, Java 21, security manager on, engine 1.11.2
from Maven Central) fights each of the 46 census fields of `melee-census-317` for 3 rounds without
Hadur and logs every battle error and every robot output line that looks like a fault. 36 fields
loaded all nine robots; 10 fields loaded eight.

| Melee rank (2026-11-02) | Robot | Rejected for |
|---:|---|---|
| 13 | rsalesc.melee.Medina 0.4.5 | `java.awt.AWTKeyStroke` in an obfuscated class |
| 16 | catcat20.Matcha 0.006 | bundled gson: `java.sql`, `java.net.URL`, `AccessController` |
| 21 | catcat20.Lambda 0.024 | bundled gson, as Matcha |
| 56 | catcat20.shape.Theta 0.018 | bundled gson, as Matcha |
| 87 | morbid.MorbidPriest 1.0 | `ClassLoader.loadClass`, `Class.getClassLoader` |
| 123 | rsalesc.melee.Monk 0.3.6c | `java.awt.AWTKeyStroke`, as Medina |
| 126 | gre.svman4.Leonidas 1.3.2 | `java.util.Scanner` |
| 128 | Krabb.sliNk.Garm 0.9u | `javax.imageio.ImageIO.setUseCache` |
| 214 | gre.svman4.Morfeas 1.4.1 | `java.util.logging.Logger` |
| 411 | inonit.robocode.javascript.MyFirstRobot 1.1 | `java.net.URI.toURL` (script engine loader) |

They are listed in `hadur-bench/broken-1.11.2.txt` (mode `melee`), the file the 1v1 thread also
writes its rows to; Bench drops listed robots from a set when it loads it (the 1v1 thread's change).

## Not listed

Robots that load and then misbehave are left in, because they did the same on 1.11.1 and still
fight live: `Too many calls to getXX methods` disables (arthord.MannyPacquiao, jab.DiamondStealer,
rrh.Iwillfindyou, which also needed a forced stop), file quota or missing data files (asd.Cthulhu,
pe.SandboxDT, cx.Princess, qohnil.blot.BlotBot) and robots' own exceptions (bayen.nut.Squirrel,
exauge.GateKeeper, rampancy.Durandal and others).

## What it means for melee

The live melee set stops at 416 or 417 pairings (the live set is left at 416). The listed robots
keep the scores they had and get no new battles. On the bench the census loses ten robots, so 10
fields fight with eight opponents, not nine; paired reads (arm against aa on the same fields and
seeds) are unaffected.
