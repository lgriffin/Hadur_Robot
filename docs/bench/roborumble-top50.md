# Bench: hadur2.Hadur 3.0 vs the RoboRumble top 50 (cold, 2026-09-28)

Snapshot from Leigh's saved LiteRumble scoreboard (2026-09-28), top 50 by APS. 49 of the 50 had a resolvable jar (see [`data/rumble/parsed/2026-09-28_roborumble_top50_jars.tsv`](../../data/rumble/parsed/2026-09-28_roborumble_top50_jars.tsv)); jd.Nullstride 2.3.0 (#2) has no archive-mirror copy and wasn't run. zen.Mirage 0.9.5 (#33) loaded 1 robot instead of 2 (likely missing its Kotlin runtime classes in the jar) and every battle failed — excluded from the totals below.

35 rounds x 5 seeds (data wiped) per opponent on 800x600, split across 4 parallel processes on 4 cores. Engine Robocode 1.9.5.6, security manager on, Java 21.

## Summary

Over the 48 opponents that ran, Hadur's mean score share is **58.5%**, beating 40 of 48 (≥50%
share). The 8 losses are concentrated at the very top of the scoreboard: BeepBoop (#1, 17.2%),
ScalarR (#5, 22.6%), DrussGT (#3, 33.7%), Diamond (#6, 34.5%), Wavelet (#13, 39.5%),
Firestarter (#7, 45.4%), Gilgalad (#12, 49.0%) and Neuromancer (#18, 49.7%) — 6 of these 8 are
in the current top 13, so the gap to top 40 is concentrated in a handful of the very strongest
guns/movements rather than spread across the field. Raw per-bot data:
[`data/bench/2026-09-28_hadur-3.0_roborumble-top50_cold.tsv`](../../data/bench/2026-09-28_hadur-3.0_roborumble-top50_cold.tsv)
(this table's source rows) and
[`data/rumble/parsed/2026-09-28_roborumble_top50_jars.tsv`](../../data/rumble/parsed/2026-09-28_roborumble_top50_jars.tsv)
(rank -> jar URL resolution, including the 2 excluded).

Shares are Hadur's fraction of the two robots' total, mean over 5 battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 17.2% ± 2.9 | 1.1% ± 1.9 | 38.2% ± 5.1 | 2 / 175 | 5.9% ± 0.3 | 9.7% ± 0.4 | 599 | 0 | 3.20 / 645.3 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 33.7% ± 3.5 | 20.7% ± 3.2 | 48.1% ± 3.6 | 37 / 175 | 7.5% ± 0.3 | 9.6% ± 0.5 | 557 | 0 | 2.20 / 644.3 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 74.1% ± 8.5 | 84.6% ± 12.4 | 63.6% ± 7.3 | 148 / 175 | 19.5% ± 2.7 | 6.3% ± 0.7 | 274 | 0 | 4.42 / 500.4 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 22.6% ± 4.8 | 7.4% ± 7.4 | 40.5% ± 3.0 | 13 / 175 | 7.1% ± 0.4 | 10.4% ± 1.2 | 591 | 0 | 2.91 / 660.6 |
| voidious.Diamond 1.8.22 | rumble-6 | 34.5% ± 3.6 | 26.5% ± 5.1 | 44.0% ± 3.6 | 50 / 175 | 7.0% ± 0.3 | 8.6% ± 0.4 | 588 | 0 | 3.30 / 761.5 |
| cb.fire.Firestarter 2.0f | rumble-7 | 45.4% ± 6.2 | 31.5% ± 8.8 | 58.8% ± 4.2 | 56 / 175 | 9.3% ± 0.5 | 8.4% ± 0.3 | 500 | 0 | 2.52 / 605.4 |
| lxx.Tomcat 3.68 | rumble-8 | 54.6% ± 1.4 | 63.0% ± 2.5 | 47.4% ± 1.8 | 111 / 175 | 10.0% ± 0.8 | 9.6% ± 0.6 | 439 | 0 | 2.99 / 805.1 |
| rsalesc.mega.Knight 0.6.28 | rumble-9 | 52.0% ± 4.5 | 47.4% ± 6.4 | 56.7% ± 2.7 | 83 / 175 | 9.6% ± 0.3 | 9.0% ± 0.3 | 747 | 0 | 3.18 / 1143.4 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-10 | 57.0% ± 7.2 | 71.2% ± 9.2 | 43.2% ± 5.4 | 125 / 175 | 9.3% ± 1.1 | 8.9% ± 0.5 | 624 | 0 | 1.92 / 727.7 |
| xander.cat.XanderCat 12.9 | rumble-11 | 57.3% ± 9.1 | 62.6% ± 13.3 | 51.8% ± 6.5 | 110 / 175 | 12.2% ± 3.5 | 8.6% ± 0.5 | 619 | 0 | 2.01 / 1005.2 |
| aw.Gilgalad 1.99.5c | rumble-12 | 49.0% ± 7.3 | 52.6% ± 11.1 | 46.1% ± 4.7 | 94 / 175 | 9.0% ± 2.0 | 9.6% ± 1.1 | 406 | 0 | 2.63 / 633.3 |
| pc.Wavelet 1.5 | rumble-13 | 39.5% ± 5.8 | 20.0% ± 9.4 | 59.1% ± 1.9 | 35 / 175 | 9.9% ± 0.5 | 10.2% ± 0.3 | 183 | 0 | 4.32 / 341.4 |
| kc.serpent.WaveSerpent 2.11 | rumble-14 | 55.1% ± 8.3 | 69.7% ± 11.7 | 40.3% ± 4.3 | 122 / 175 | 8.1% ± 0.6 | 7.9% ± 0.8 | 381 | 0 | 4.25 / 823.1 |
| gh.GresSuffurd 0.4.13 | rumble-15 | 61.2% ± 9.2 | 71.7% ± 15.5 | 50.7% ± 3.1 | 126 / 175 | 10.8% ± 0.9 | 8.3% ± 1.2 | 507 | 0 | 1.69 / 582.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-16 | 67.9% ± 2.5 | 83.3% ± 2.7 | 52.0% ± 3.6 | 146 / 175 | 10.7% ± 0.8 | 7.9% ± 0.2 | 453 | 0 | 1.99 / 764.7 |
| cs.Nene 1.0.5 | rumble-17 | 57.4% ± 3.3 | 73.7% ± 3.9 | 41.2% ± 3.4 | 129 / 175 | 8.7% ± 1.2 | 7.6% ± 0.9 | 455 | 0 | 2.18 / 389.1 |
| jk.melee.Neuromancer 7.12 | rumble-18 | 49.7% ± 5.7 | 44.0% ± 9.6 | 54.7% ± 3.4 | 77 / 175 | 10.5% ± 0.9 | 9.4% ± 0.4 | 599 | 0 | 2.38 / 835.9 |
| voidious.Dookious 1.573c | rumble-19 | 59.8% ± 3.1 | 74.9% ± 3.9 | 43.9% ± 4.5 | 131 / 175 | 8.4% ± 0.8 | 7.0% ± 0.4 | 438 | 0 | 1.84 / 1139.9 |
| davidalves.Phoenix 1.02 | rumble-20 | 61.1% ± 4.7 | 76.6% ± 6.8 | 45.8% ± 3.1 | 134 / 175 | 9.3% ± 0.9 | 7.7% ± 0.3 | 19 | 0 | 1.57 / 79.1 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-21 | 58.9% ± 4.7 | 53.7% ± 8.1 | 62.8% ± 3.1 | 94 / 175 | 13.0% ± 0.7 | 8.7% ± 0.4 | 542 | 0 | 2.58 / 768.5 |
| cb.Domogled 1.2 | rumble-22 | 57.9% ± 5.5 | 48.0% ± 10.2 | 65.8% ± 2.2 | 84 / 175 | 11.3% ± 0.6 | 11.2% ± 11.0 | 533 | 0 | 1.31 / 674.3 |
| mue.Ascendant 1.2.27 | rumble-23 | 53.9% ± 2.8 | 66.1% ± 5.4 | 43.1% ± 3.2 | 116 / 175 | 10.7% ± 0.7 | 8.2% ± 0.5 | 443 | 0 | 1.59 / 724.1 |
| abc.Shadow 3.83c | rumble-24 | 53.7% ± 9.1 | 68.6% ± 12.8 | 40.0% ± 5.0 | 120 / 175 | 9.0% ± 0.6 | 8.5% ± 0.6 | 275 | 0 | 1.81 / 473.8 |
| darkcanuck.Pris 0.92 | rumble-25 | 57.2% ± 6.8 | 69.7% ± 7.8 | 46.1% ± 6.2 | 122 / 175 | 11.0% ± 0.9 | 8.5% ± 1.1 | 355 | 0 | 3.31 / 721.4 |
| fromHell.BlackBox 0.0.2 | rumble-26 | 66.7% ± 6.5 | 78.3% ± 9.9 | 55.3% ± 3.6 | 137 / 175 | 14.1% ± 1.0 | 8.0% ± 0.7 | 290 | 0 | 1.41 / 872.8 |
| kc.serpent.Hydra 0.21 | rumble-27 | 58.4% ± 6.0 | 73.1% ± 8.2 | 43.7% ± 4.9 | 128 / 175 | 8.7% ± 0.4 | 8.0% ± 0.8 | 452 | 0 | 1.69 / 658.6 |
| jk.precise.Wintermute 0.8 | rumble-28 | 70.1% ± 3.1 | 85.7% ± 3.5 | 54.0% ± 4.2 | 150 / 175 | 11.0% ± 1.3 | 7.5% ± 0.5 | 13 | 0 | 1.69 / 88.3 |
| davidalves.Firebird 0.25 | rumble-29 | 64.0% ± 6.2 | 82.3% ± 7.3 | 45.3% ± 4.9 | 144 / 175 | 9.1% ± 0.6 | 7.4% ± 0.3 | 282 | 0 | 2.17 / 551.6 |
| pulsar.PulsarMax 0.8.9 | rumble-30 | 63.0% ± 10.9 | 80.0% ± 14.0 | 45.6% ± 7.1 | 140 / 175 | 9.1% ± 0.5 | 7.3% ± 0.8 | 299 | 0 | 1.62 / 593.8 |
| zyx.mega.YersiniaPestis 3.0 | rumble-31 | 56.2% ± 9.0 | 68.6% ± 14.0 | 44.5% ± 4.1 | 120 / 175 | 9.7% ± 0.5 | 8.0% ± 0.8 | 316 | 0 | 2.85 / 624.5 |
| ags.Midboss 1q.fast | rumble-32 | 68.8% ± 8.8 | 78.9% ± 11.9 | 59.3% ± 5.4 | 138 / 175 | 13.1% ± 0.8 | 8.6% ± 0.6 | 281 | 0 | 2.57 / 775.5 |
| zen.Mirage 0.9.5 | rumble-33 | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 5 battle(s) failed
| pez.rumble.CassiusClay 2rho.02no | rumble-34 | 65.2% ± 8.8 | 70.3% ± 12.9 | 59.8% ± 4.7 | 123 / 175 | 12.4% ± 0.8 | 7.8% ± 0.5 | 425 | 0 | 1.84 / 581.8 |
| Krabb.sliNk.Garm 0.9u | rumble-35 | 68.5% ± 7.3 | 82.5% ± 11.1 | 53.5% ± 3.0 | 124 / 175 | 10.7% ± 0.3 | 6.5% ± 0.7 | 276 | 0 | 3.58 / 524.2 |
| mn.Combat 3.25.0 | rumble-36 | 61.4% ± 4.6 | 73.5% ± 4.8 | 49.3% ± 4.4 | 129 / 175 | 9.8% ± 0.5 | 9.0% ± 0.4 | 492 | 0 | 1.80 / 449.9 |
| axeBots.SilverSurfer 2.53.33fix | rumble-37 | 61.2% ± 6.5 | 72.6% ± 5.9 | 50.9% ± 7.6 | 127 / 175 | 11.4% ± 0.7 | 6.7% ± 0.7 | 317 | 0 | 2.96 / 677.7 |
| cs.s2.Seraphim 2.3.1 | rumble-38 | 67.8% ± 2.5 | 84.0% ± 3.2 | 51.8% ± 4.2 | 147 / 175 | 11.2% ± 1.2 | 7.3% ± 0.3 | 327 | 0 | 1.72 / 770.3 |
| fromHell.CHCl3 1.4.2 | rumble-39 | 68.6% ± 5.5 | 80.6% ± 8.5 | 56.7% ± 4.1 | 141 / 175 | 13.7% ± 1.2 | 7.4% ± 0.4 | 20 | 0 | 1.09 / 20.4 |
| jk.mini.CunobelinDC 1.2 | rumble-40 | 74.2% ± 2.7 | 90.3% ± 5.9 | 57.6% ± 2.7 | 158 / 175 | 11.7% ± 1.3 | 7.0% ± 0.5 | 529 | 0 | 1.60 / 628.0 |
| sheldor.mini.Foilist 1.3.1 | rumble-41 | 67.5% ± 5.6 | 78.9% ± 5.4 | 56.3% ± 6.2 | 138 / 175 | 11.2% ± 1.1 | 7.8% ± 0.7 | 328 | 0 | 1.69 / 757.5 |
| florent.test.Toad 0.14t | rumble-42 | 64.2% ± 12.5 | 79.7% ± 15.2 | 48.5% ± 9.9 | 105 / 175 | 10.4% ± 0.8 | 7.3% ± 0.7 | 671 | 0 | 4.26 / 619.5 |
| cjm.chalk.Chalk 2.6.Be | rumble-43 | 65.7% ± 6.3 | 80.0% ± 7.5 | 50.4% ± 5.1 | 140 / 175 | 9.8% ± 0.4 | 6.6% ± 0.9 | 278 | 0 | 1.55 / 360.4 |
| ar.horizon.Horizon 1.2.2 | rumble-44 | 60.0% ± 2.1 | 72.4% ± 3.3 | 48.6% ± 2.6 | 127 / 175 | 11.0% ± 0.7 | 8.5% ± 0.9 | 305 | 0 | 2.34 / 410.2 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rumble-45 | 61.5% ± 10.6 | 76.0% ± 13.6 | 47.2% ± 6.9 | 133 / 175 | 10.3% ± 0.9 | 7.8% ± 1.1 | 587 | 0 | 1.53 / 547.0 |
| sheldor.mini.FoilistMC 1.0 | rumble-46 | 73.1% ± 7.4 | 87.4% ± 8.2 | 58.4% ± 6.1 | 153 / 175 | 11.4% ± 0.8 | 7.6% ± 0.7 | 13 | 0 | 1.88 / 106.6 |
| pez.rumble.Ali 0.4.9 | rumble-47 | 72.1% ± 5.8 | 86.8% ± 8.1 | 55.3% ± 2.9 | 152 / 175 | 10.0% ± 0.3 | 5.9% ± 0.5 | 326 | 0 | 2.05 / 534.6 |
| dft.Cardigan 1.09 | rumble-48 | 74.8% ± 8.4 | 90.3% ± 10.2 | 58.6% ± 6.2 | 158 / 175 | 11.3% ± 0.1 | 6.9% ± 0.8 | 437 | 0 | 1.50 / 527.7 |
| florent.XSeries.X2 0.17 | rumble-49 | 58.7% ± 6.7 | 73.1% ± 8.9 | 45.0% ± 5.8 | 128 / 175 | 10.4% ± 1.4 | 8.0% ± 0.8 | 75 | 0 | 2.81 / 247.8 |
| ags.rougedc.RougeDC willow | rumble-50 | 67.6% ± 7.5 | 73.7% ± 8.5 | 61.6% ± 6.5 | 129 / 175 | 14.3% ± 1.3 | 10.2% ± 0.6 | 562 | 0 | 2.95 / 651.6 |
