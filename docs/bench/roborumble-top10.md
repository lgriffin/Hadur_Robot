# Bench: hadur2.Hadur 2.0 against the RoboRumble top 10 (cold)

The 1v1 RoboRumble top 10 as ranked on https://rumble.robowiki.net/Rankings?game=roborumble on 2026-09-26, jars from robocode-archive.strangeautomata.com. Hadur 2.0 is master after S2 (energy ledger). 35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores.

Reproduce with `cd hadur-bench && mvn exec:java -Dexec.args="--set roborumble-top10.txt"` after putting the ten jars in `opponents/`.

## Summary

- **Mean score share 29.9%** across the ten, against 43.7% for Shadow 3.83c in [s2-2.0-cold.md](s2-2.0-cold.md). Hadur won 419 of 1,750 rounds.
- **Close to even** with Raven (52.9%), XanderCat (44.3%) and Tomcat (44.2%). These are the three it also out-survives in about half the rounds.
- **Clearly beaten** by BeepBoop (14.6%, no rounds won), ScalarR (21.0%), Diamond (22.2%) and DrussGT (25.5%). Against these Hadur's hit rate drops to 6 to 7% while theirs stays at 10 to 12%: their movement beats our guns more than their guns beat our movement.
- **Saguaro is a special case (1.7%).** Saguaro sat still for 94% of turns in the battle we inspected, yet Hadur hit it with only 0.5% of its shots and rounds ran to about 2,400 turns until Hadur drained itself firing. That pattern points to bullet shielding (Saguaro shooting down our bullets); this is inferred from the truth log, not confirmed from Saguaro's code. Its 34% false waves also come from this matchup. Hadur needs a counter (stop firing into a shield, or vary the firing angle or timing) before this score moves.
- **Wave fidelity holds up against strong bots**: 99.9 to 100% of real shots matched in every matchup. False waves stay under 4% except Firestarter (7.6%) and Saguaro.
- **No faults**, and Hadur skipped 26 to 126 turns per 175 rounds (ScalarR the most).

## Method notes

- To halve the wall time, the ten opponents ran as two benches in parallel on the 4-core box (five opponents each), so each measured its own `robocode.cpu.constant` (3,074,672 and 3,227,215). A solo re-run of seed 1 against Raven gave 46.6% (parallel: 51.6%) and against XanderCat 51.1% (parallel: 54.4%). Top bots are time-sensitive, so single battles move a few points with CPU load; the 5-seed means and intervals below are the numbers to use.
- XanderCat printed a security-manager refusal once (reading `java.time.zone.ZoneRulesProvider`); it kept running.
- Opponent skipped turns are not counted (the bench reads only Hadur's console).

## Results

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 14.6% ± 2.5 | 0.0% ± 0.0 | 32.5% ± 5.2 | 0 / 175 | 5.8% ± 0.4 | 11.3% ± 0.6 | 64 | 0 | 2.74 / 116.4 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 25.5% ± 4.6 | 10.3% ± 4.8 | 43.1% ± 3.5 | 18 / 175 | 7.4% ± 1.1 | 9.9% ± 1.1 | 65 | 0 | 2.05 / 69.6 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 1.7% ± 0.4 | 0.0% ± 0.0 | 26.1% ± 6.1 | 0 / 175 | 0.5% ± 0.1 | 0.2% ± 0.1 | 26 | 0 | 0.44 / 51.7 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 21.0% ± 2.5 | 8.6% ± 2.5 | 34.8% ± 2.5 | 15 / 175 | 7.2% ± 0.5 | 11.8% ± 0.9 | 126 | 0 | 2.54 / 99.7 |
| voidious.Diamond 1.8.22 | rumble-5 | 22.2% ± 3.0 | 10.4% ± 3.7 | 35.8% ± 3.4 | 22 / 175 | 6.8% ± 0.4 | 9.8% ± 0.3 | 73 | 0 | 2.19 / 68.4 |
| cb.fire.Firestarter 2.0f | rumble-6 | 35.2% ± 4.4 | 17.1% ± 5.6 | 53.2% ± 3.8 | 30 / 175 | 9.4% ± 0.2 | 9.6% ± 0.6 | 67 | 0 | 2.06 / 45.6 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 52.9% ± 7.9 | 66.3% ± 10.8 | 41.7% ± 5.3 | 116 / 175 | 10.0% ± 0.2 | 10.3% ± 0.4 | 26 | 0 | 1.41 / 53.7 |
| xander.cat.XanderCat 12.9 | rumble-8 | 44.3% ± 9.0 | 48.6% ± 10.9 | 41.2% ± 7.2 | 85 / 175 | 10.9% ± 0.5 | 10.4% ± 1.2 | 32 | 0 | 1.55 / 68.8 |
| lxx.Tomcat 3.68 | rumble-9 | 44.2% ± 7.4 | 49.0% ± 11.3 | 40.8% ± 3.8 | 88 / 175 | 9.2% ± 0.6 | 10.6% ± 0.4 | 36 | 0 | 2.57 / 48.0 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 37.6% ± 7.8 | 25.3% ± 10.8 | 49.7% ± 4.3 | 45 / 175 | 9.8% ± 0.4 | 11.0% ± 0.6 | 72 | 0 | 2.67 / 92.0 |

Mean score share over the ten: 29.9%.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 33847 | 357 | 34015 | 33844 (100.0%) | 3 (0.0%) | 171 (0.5%) | 1528 | 226 | 73 |
| jk.mega.DrussGT 3.1.16 | 41596 | 15 | 43287 | 41596 (100.0%) | 0 (0.0%) | 1691 (3.9%) | 2429 | 245 | 68 |
| oog.mega.saguaro.Saguaro 1.0 | 38376 | 16 | 58380 | 38376 (100.0%) | 0 (0.0%) | 20004 (34.3%) | 79 | 9 | 20 |
| aaa.r.ScalarR 0.005h.053-noshield | 32121 | 17 | 32526 | 32116 (100.0%) | 5 (0.0%) | 410 (1.3%) | 1877 | 293 | 149 |
| voidious.Diamond 1.8.22 | 35622 | 1636 | 36521 | 35608 (100.0%) | 14 (0.0%) | 913 (2.5%) | 1972 | 205 | 63 |
| cb.fire.Firestarter 2.0f | 40309 | 1577 | 43622 | 40297 (100.0%) | 12 (0.0%) | 3325 (7.6%) | 3545 | 294 | 80 |
| dsekercioglu.mega.Raven 3.56j8 | 13894 | 60 | 13893 | 13892 (100.0%) | 2 (0.0%) | 1 (0.0%) | 839 | 186 | 27 |
| xander.cat.XanderCat 12.9 | 13934 | 11 | 14283 | 13933 (100.0%) | 1 (0.0%) | 350 (2.5%) | 1201 | 213 | 37 |
| lxx.Tomcat 3.68 | 21626 | 829 | 21673 | 21605 (99.9%) | 21 (0.1%) | 68 (0.3%) | 1355 | 177 | 41 |
| rsalesc.mega.Knight 0.6.28 | 39489 | 773 | 39495 | 39489 (100.0%) | 0 (0.0%) | 6 (0.0%) | 2974 | 339 | 77 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
