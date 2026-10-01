# R8 bench: memory at rumble scale (3.3 vs 3.4)

Gate for shipping MEM-11 to MEM-13 as 3.4 (2026-10-01). Two `--client` passes.

## 1. Slow client, full data directory

4 weak bots, 10 rounds, 1 seed, `robocode.cpu.constant` forced to 1 ms. `prefill700` is a
directory built with `tools/Prefill.java` against the 3.3 jar: 698 stats-only profiles,
199,622 bytes of the 200,000-byte quota. Skip positions from `tools/skips.py` (start: turn
10 or earlier; decided: at or after the round's R record).

| Jar | Condition | Skipped turns per battle | start / mid / decided (4 battles) | Survival |
|---|---|---|---|---|
| 3.3 | empty, 1 ms | 5 to 18 | | 90 to 100% |
| 3.3 | prefill700, 1 ms | 188 to 224 | 13 / 29 / 772 | 90 to 100% |
| 3.4 | empty, 1 ms | 8 to 18 | 3 / 26 / 16 | 100% |
| 3.4 | prefill700, 1 ms | 10 to 26 | 1 / 23 / 43 | 100% |

3.3's skips were the round-end saves: about 100 turns after the battle's one checkpoint and
about 100 after the battle-end save, each scanning and reading the full directory. 3.4's
remaining decided skips (up to 20 after the checkpoint) are the engine's own cost of opening
a `RobocodeFileOutputStream` in a 700-file directory, which MEM-14 (fewer, smaller files)
would cut further.

**TIME-6, tried and dropped.** A build with `execute()` ahead of the battle set-up gave
36 to 61 skipped turns a battle in the prefill700 pass, 36 of them in round 0 turns 2 to
37: the set-up (about 36 ms here) left the round start's 300-constant grace for turn 1's
ten constants. Three skips put the round in duress (RES-9). Not shipped.

## 2. Weak set, default constant

`weak-pbi.txt`, 35 rounds, 1 seed, `data=shared`, 3.4 jar:

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 2 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 2 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 2 | 35 / 35 | 1 / 1 |

Every bot 35 of 35, skipped turns 0 to 4 a battle.
