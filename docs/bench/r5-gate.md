# R5 gate: rumble-safe memory

Run on 2026-10-01 against the R5 build (PR #70, 3.2's version string, `hadur.climb.stage` R5).

## Result

| Gate item | Result |
|---|---|
| `data=shared` over the 61-opponent set (12 weak, 49 of the top 50), data directory never wiped | 60 of 61 battles ran; `zen.Mirage 0.9.5` does not load as a duel opponent (the engine found one robot), as in earlier benches |
| Every weak battle 35/35 | Yes, 12 of 12, 0 to 6 skipped turns each |
| `robots/.data/hadur2` under 180 KB at the end | 18 KB for 60 opponents (about 300 bytes a profile) |
| 0 memory failures | No MEM failure line in any battle |
| Warm top-10 not below cold top-10 by more than 1 point | Warm 43.2% mean score share (3 consecutive battles, data kept) against 3.2's cold 43.1% (`rumble-3.2-top10.md`): no regression |

The weak set was not repeated after the top 49 (the plan's "then the weak set again"): the
data directory holds 60 profiles at 18 KB, nowhere near quota, so a second pass could only
show the same thing the first did.

## data=shared, 61 opponents



robocode.cpu.constant=2855354.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 5 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 2 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| kc.mega.BeepBoop 2.0 | 2.9% | 25 | 1 / 35 | 1 / 1 |
| jk.mega.DrussGT 3.1.16 | 25.7% | 28 | 9 / 35 | 1 / 1 |
| oog.mega.saguaro.Saguaro 1.0 | 91.4% | 5 | 32 / 35 | 1 / 1 |
| aaa.r.ScalarR 0.005h.053-noshield | 17.1% | 28 | 6 / 35 | 1 / 1 |
| voidious.Diamond 1.8.22 | 23.5% | 15 | 9 / 35 | 1 / 1 |
| cb.fire.Firestarter 2.0f | 23.5% | 14 | 9 / 35 | 1 / 1 |
| lxx.Tomcat 3.68 | 74.3% | 27 | 26 / 35 | 1 / 1 |
| rsalesc.mega.Knight 0.6.28 | 25.7% | 15 | 9 / 35 | 1 / 1 |
| dsekercioglu.mega.Raven 3.56j8 | 68.6% | 13 | 24 / 35 | 1 / 1 |
| xander.cat.XanderCat 12.9 | 62.9% | 21 | 22 / 35 | 1 / 1 |
| aw.Gilgalad 1.99.5c | 48.5% | 29 | 18 / 35 | 1 / 1 |
| pc.Wavelet 1.5 | 20.0% | 18 | 7 / 35 | 1 / 1 |
| kc.serpent.WaveSerpent 2.11 | 71.4% | 8 | 25 / 35 | 1 / 1 |
| gh.GresSuffurd 0.4.13 | 71.4% | 4 | 25 / 35 | 1 / 1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 80.0% | 13 | 28 / 35 | 1 / 1 |
| cs.Nene 1.0.5 | 77.1% | 10 | 27 / 35 | 1 / 1 |
| jk.melee.Neuromancer 7.12 | 34.3% | 19 | 12 / 35 | 1 / 1 |
| voidious.Dookious 1.573c | 74.3% | 15 | 26 / 35 | 1 / 1 |
| davidalves.Phoenix 1.02 | 77.1% | 12 | 27 / 35 | 1 / 1 |
| rsalesc.roborio.Roborio 1.2.4 | 57.1% | 15 | 20 / 35 | 1 / 1 |
| cb.Domogled 1.2 | 52.9% | 15 | 19 / 35 | 1 / 1 |
| mue.Ascendant 1.2.27 | 74.3% | 10 | 26 / 35 | 1 / 1 |
| abc.Shadow 3.83c | 65.7% | 5 | 23 / 35 | 1 / 1 |
| darkcanuck.Pris 0.92 | 60.0% | 5 | 21 / 35 | 1 / 1 |
| fromHell.BlackBox 0.0.2 | 54.3% | 11 | 19 / 35 | 1 / 1 |
| kc.serpent.Hydra 0.21 | 61.8% | 9 | 22 / 35 | 1 / 1 |
| jk.precise.Wintermute 0.8 | 82.9% | 8 | 29 / 35 | 1 / 1 |
| davidalves.Firebird 0.25 | 71.4% | 9 | 25 / 35 | 1 / 1 |
| pulsar.PulsarMax 0.8.9 | 71.4% | 8 | 25 / 35 | 1 / 1 |
| zyx.mega.YersiniaPestis 3.0 | 65.7% | 13 | 23 / 35 | 1 / 1 |
| ags.Midboss 1q.fast | 82.9% | 11 | 29 / 35 | 1 / 1 |
| zen.Mirage 0.9.5 | - | 0 | 0 / 0 | 0 / 1 |
| pez.rumble.CassiusClay 2rho.02no | 71.4% | 12 | 25 / 35 | 1 / 1 |
| Krabb.sliNk.Garm 0.9u | 88.6% | 10 | 31 / 35 | 1 / 1 |
| mn.Combat 3.25.0 | 74.3% | 11 | 26 / 35 | 1 / 1 |
| axeBots.SilverSurfer 2.53.33fix | 77.1% | 9 | 27 / 35 | 1 / 1 |
| cs.s2.Seraphim 2.3.1 | 82.9% | 9 | 29 / 35 | 1 / 1 |
| fromHell.CHCl3 1.4.2 | 77.1% | 6 | 27 / 35 | 1 / 1 |
| jk.mini.CunobelinDC 1.2 | 85.7% | 20 | 30 / 35 | 1 / 1 |
| sheldor.mini.Foilist 1.3.1 | 91.2% | 13 | 32 / 35 | 1 / 1 |
| florent.test.Toad 0.14t | 88.6% | 9 | 31 / 35 | 1 / 1 |
| cjm.chalk.Chalk 2.6.Be | 82.9% | 9 | 29 / 35 | 1 / 1 |
| ar.horizon.Horizon 1.2.2 | 82.9% | 6 | 29 / 35 | 1 / 1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 82.9% | 5 | 29 / 35 | 1 / 1 |
| sheldor.mini.FoilistMC 1.0 | 85.7% | 9 | 30 / 35 | 1 / 1 |
| pez.rumble.Ali 0.4.9 | 74.3% | 16 | 26 / 35 | 1 / 1 |
| dft.Cardigan 1.09 | 88.6% | 8 | 31 / 35 | 1 / 1 |
| florent.XSeries.X2 0.17 | 74.3% | 16 | 26 / 35 | 1 / 1 |
| ags.rougedc.RougeDC willow | 74.3% | 11 | 26 / 35 | 1 / 1 |



## Warm top 10 (3 consecutive battles per opponent, data kept)

35 rounds x 3 consecutive battles (data kept) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3094952.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 15.5% ± 1.1 | 0.0% ± 0.0 | 36.5% ± 3.9 | 0 / 105 | 5.6% ± 0.4 | 9.8% ± 0.6 | 21 | 0 | 3.33 / 56.5 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 34.8% ± 11.1 | 22.1% ± 14.3 | 48.5% ± 8.3 | 24 / 105 | 7.8% ± 1.1 | 9.7% ± 1.4 | 35 | 0 | 2.50 / 117.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 65.0% ± 12.4 | 75.2% ± 24.9 | 55.0% ± 9.8 | 79 / 105 | 17.0% ± 7.6 | 7.1% ± 1.1 | 5 | 0 | 3.13 / 26.9 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 24.4% ± 3.7 | 12.4% ± 8.2 | 38.4% ± 8.5 | 13 / 105 | 6.7% ± 1.1 | 10.6% ± 1.5 | 32 | 0 | 2.96 / 211.7 |
| voidious.Diamond 1.8.22 | rumble-5 | 31.8% ± 14.8 | 22.4% ± 20.6 | 42.1% ± 9.2 | 26 / 105 | 7.2% ± 0.5 | 8.8% ± 1.0 | 26 | 0 | 2.67 / 57.2 |
| cb.fire.Firestarter 2.0f | rumble-6 | 38.6% ± 14.6 | 22.3% ± 18.3 | 54.5% ± 9.1 | 25 / 105 | 9.6% ± 0.8 | 8.7% ± 1.1 | 33 | 0 | 2.69 / 80.6 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 62.7% ± 7.7 | 79.0% ± 14.8 | 46.0% ± 4.2 | 83 / 105 | 9.1% ± 2.0 | 8.4% ± 0.9 | 16 | 0 | 1.67 / 18.2 |
| xander.cat.XanderCat 12.9 | rumble-8 | 56.1% ± 19.1 | 61.9% ± 29.6 | 50.3% ± 9.6 | 65 / 105 | 11.1% ± 0.7 | 8.6% ± 1.5 | 24 | 0 | 1.83 / 45.2 |
| lxx.Tomcat 3.68 | rumble-9 | 57.1% ± 22.7 | 68.7% ± 29.8 | 46.6% ± 14.4 | 73 / 105 | 9.6% ± 1.1 | 10.0% ± 1.7 | 34 | 0 | 3.11 / 104.6 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 46.3% ± 9.3 | 37.1% ± 14.2 | 55.0% ± 4.2 | 39 / 105 | 9.7% ± 0.2 | 9.4% ± 1.4 | 38 | 0 | 3.20 / 68.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 22196 | 196 | 22458 | 22193 (100.0%) | 3 (0.0%) | 265 (1.2%) | 974 | 162 | 21 |
| jk.mega.DrussGT 3.1.16 | 25192 | 5 | 25193 | 25192 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1483 | 187 | 31 |
| oog.mega.saguaro.Saguaro 1.0 | 3954 | 8 | 3954 | 3953 (100.0%) | 1 (0.0%) | 1 (0.0%) | 275 | 37 | 6 |
| aaa.r.ScalarR 0.005h.053-noshield | 20479 | 8 | 21055 | 20479 (100.0%) | 0 (0.0%) | 576 (2.7%) | 1098 | 256 | 31 |
| voidious.Diamond 1.8.22 | 21952 | 829 | 22677 | 21940 (99.9%) | 12 (0.1%) | 737 (3.2%) | 1231 | 177 | 24 |
| cb.fire.Firestarter 2.0f | 21648 | 850 | 23665 | 21648 (100.0%) | 0 (0.0%) | 2017 (8.5%) | 1917 | 166 | 35 |
| dsekercioglu.mega.Raven 3.56j8 | 8766 | 54 | 8766 | 8766 (100.0%) | 0 (0.0%) | 0 (0.0%) | 445 | 88 | 11 |
| xander.cat.XanderCat 12.9 | 10473 | 2 | 10856 | 10472 (100.0%) | 1 (0.0%) | 384 (3.5%) | 1073 | 135 | 16 |
| lxx.Tomcat 3.68 | 14042 | 315 | 14092 | 14042 (100.0%) | 0 (0.0%) | 50 (0.4%) | 932 | 101 | 36 |
| rsalesc.mega.Knight 0.6.28 | 23623 | 320 | 23633 | 23622 (100.0%) | 1 (0.0%) | 11 (0.0%) | 1703 | 190 | 36 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 21857 | 2464 (11.3%) | 21318 |
| jk.mega.DrussGT 3.1.16 | 24759 | 3033 (12.3%) | 23915 |
| oog.mega.saguaro.Saguaro 1.0 | 4580 | 323 (7.1%) | 3685 |
| aaa.r.ScalarR 0.005h.053-noshield | 20671 | 2376 (11.5%) | 20172 |
| voidious.Diamond 1.8.22 | 21984 | 2364 (10.8%) | 21763 |
| cb.fire.Firestarter 2.0f | 24638 | 2168 (8.8%) | 24307 |
| dsekercioglu.mega.Raven 3.56j8 | 9177 | 909 (9.9%) | 8517 |
| xander.cat.XanderCat 12.9 | 13099 | 1063 (8.1%) | 12303 |
| lxx.Tomcat 3.68 | 14247 | 1592 (11.2%) | 13819 |
| rsalesc.mega.Knight 0.6.28 | 23339 | 2781 (11.9%) | 22965 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650, 550 | 525 | 650 | 2441 | 17.9 / 31.1 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 650, 550 | 507 | 650 | 2769 | 28.1 / 29.9 | 0 | 128 | 68 |
| oog.mega.saguaro.Saguaro 1.0 | 650, 550, 500 | 436 | 458 | 598 | 37.2 / 30.3 | 509 | 867 | 473 |
| aaa.r.ScalarR 0.005h.053-noshield | 650, 550 | 479 | 650 | 2335 | 21.8 / 34.8 | 0 | 491 | 0 |
| voidious.Diamond 1.8.22 | 650, 550 | 529 | 650 | 2462 | 24.5 / 33.6 | 0 | 171 | 68 |
| cb.fire.Firestarter 2.0f | 650, 550 | 531 | 650 | 2752 | 33.3 / 27.8 | 79 | 299 | 61 |
| dsekercioglu.mega.Raven 3.56j8 | 650, 500, 550 | 452 | 650 | 1111 | 28.4 / 33.3 | 8 | 687 | 978 |
| xander.cat.XanderCat 12.9 | 650, 550 | 446 | 650 | 1541 | 33.4 / 33.1 | 17 | 502 | 45 |
| lxx.Tomcat 3.68 | 650, 550 | 506 | 650 | 1651 | 30.6 / 35.1 | 43 | 133 | 6 |
| rsalesc.mega.Knight 0.6.28 | 650, 550 | 505 | 650 | 2634 | 35.6 / 29.1 | 16 | 286 | 2 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.8% | 21 | 336 | 2 | 212.9 | 2464 / 2464 (100%) | 6 | 3 |
| jk.mega.DrussGT 3.1.16 | 9.7% | 35 | 14717 | 3 | 237.3 | 3032 / 3033 (100%) | 6 | 3 |
| oog.mega.saguaro.Saguaro 1.0 | 7.1% | 5 | 433 | 2 | 37.6 | 323 / 323 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.6% | 32 | 266 | 3 | 200.0 | 2374 / 2376 (100%) | 6 | 3 |
| voidious.Diamond 1.8.22 | 8.8% | 26 | 25629 | 3 | 214.5 | 2361 / 2364 (100%) | 6 | 3 |
| cb.fire.Firestarter 2.0f | 8.7% | 33 | 490 | 3 | 223.9 | 2161 / 2168 (100%) | 6 | 3 |
| dsekercioglu.mega.Raven 3.56j8 | 8.4% | 16 | 800 | 3 | 82.6 | 904 / 909 (99%) | 3 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 24 | 9783 | 3 | 103.1 | 1062 / 1063 (100%) | 6 | 3 |
| lxx.Tomcat 3.68 | 10.0% | 34 | 278 | 3 | 133.9 | 1592 / 1592 (100%) | 6 | 3 |
| rsalesc.mega.Knight 0.6.28 | 9.4% | 38 | 22086 | 3 | 222.3 | 2780 / 2781 (100%) | 6 | 3 |

## Learning curve (score share by battle)

| Opponent | 1 | 2 | 3 |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 16.0% | 15.5% | 15.1% |
| jk.mega.DrussGT 3.1.16 | 39.6% | 30.8% | 33.9% |
| oog.mega.saguaro.Saguaro 1.0 | 61.8% | 62.4% | 70.8% |
| aaa.r.ScalarR 0.005h.053-noshield | 26.1% | 23.9% | 23.3% |
| voidious.Diamond 1.8.22 | 38.6% | 29.2% | 27.6% |
| cb.fire.Firestarter 2.0f | 44.1% | 32.4% | 39.2% |
| dsekercioglu.mega.Raven 3.56j8 | 61.3% | 60.6% | 66.3% |
| xander.cat.XanderCat 12.9 | 47.5% | 62.3% | 58.7% |
| lxx.Tomcat 3.68 | 67.5% | 50.3% | 53.4% |
| rsalesc.mega.Knight 0.6.28 | 50.2% | 42.7% | 46.1% |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 40 |
| jk.mega.DrussGT 3.1.16 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T2/M1 | live, main, main | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 0 |
| voidious.Diamond 1.8.22 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 20 |
| cb.fire.Firestarter 2.0f | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 20 |
| dsekercioglu.mega.Raven 3.56j8 | 2 / 3 | 0 | 0 | T?/M?, T2/M1, T3/M1 | live, main, main | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 0 |
| lxx.Tomcat 3.68 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 0 |
| rsalesc.mega.Knight 0.6.28 | 2 / 3 | 0 | 0 | T?/M?, T3/M1, T3/M1 | live, main, main | 600 / 300 | 20 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 3 | 105 | 23719 | 10.7% | 9.1% ± 1.0 | 5.9% | 21.1% / 21.2% | 0.0% | 600 / 300 | T3/M1 | 17%, 16%, 16% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 3 | 105 | 23721 | 10.7% | 8.7% ± 0.9 | 7.7% | 23.4% / 22.7% | 1.8% | 600 / 300 | T3/M1 | 40%, 31%, 34% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 3 | 105 | 351 | 8.4% | 7.2% ± 0.9 | 13.0% | 24.8% / 25.5% | 9.9% | 0 / 0 | T3/M1 | 62%, 62%, 70% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 3 | 105 | 23739 | 11.1% | 8.9% ± 1.2 | 6.5% | 23.9% / 22.2% | 0.0% | 600 / 300 | T3/M1 | 26%, 24%, 24% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 3 | 105 | 23725 | 9.5% | 8.1% ± 0.9 | 6.9% | 22.6% / 22.0% | 8.9% | 600 / 300 | T3/M1 | 39%, 29%, 27% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 3 | 105 | 23733 | 9.9% | 8.1% ± 1.1 | 10.2% | 20.9% / 21.4% | 3.2% | 600 / 300 | T3/M1 | 43%, 32%, 39% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 3 | 105 | 353 | 8.8% | 7.1% ± 0.8 | 9.5% | 21.4% / 21.4% | 11.8% | 0 / 0 | T3/M1 | 61%, 60%, 66% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 3 | 105 | 23737 | 10.5% | 7.8% ± 0.9 | 10.4% | 23.2% / 22.4% | 8.2% | 600 / 300 | T3/M1 | 47%, 62%, 58% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 3 | 105 | 23697 | 10.3% | 9.0% ± 1.2 | 9.7% | 23.1% / 22.2% | 9.2% | 600 / 300 | T3/M1 | 66%, 51%, 52% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 3 | 105 | 23737 | 10.0% | 8.4% ± 1.1 | 9.2% | 23.8% / 20.8% | 12.6% | 600 / 300 | T3/M1 | 50%, 43%, 46% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
