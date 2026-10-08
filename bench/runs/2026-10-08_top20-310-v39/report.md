# Bench: hadur2.Hadur 3.10 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2170 over 100 battles (21.7 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 26.4% ± 4.9 | 13.1% ± 7.4 | 45.0% ± 4.0 | 23 / 175 | 5.2% ± 0.2 | 8.6% ± 1.0 | 111 | 0 | 1.99 / 714.8 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 47.2% ± 6.3 | 47.4% ± 10.8 | 47.1% ± 2.0 | 84 / 175 | 7.5% ± 0.1 | 10.0% ± 0.5 | 178 | 0 | 1.60 / 695.5 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 73.9% ± 3.9 | 85.7% ± 5.6 | 62.7% ± 2.8 | 150 / 175 | 18.4% ± 0.7 | 7.0% ± 0.9 | 59 | 0 | 1.96 / 10.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 28.2% ± 5.1 | 19.6% ± 9.3 | 39.0% ± 1.1 | 35 / 175 | 6.4% ± 0.2 | 10.5% ± 0.2 | 161 | 0 | 1.78 / 54.4 |
| voidious.Diamond 1.8.22 | rumble-6 | 43.7% ± 4.0 | 50.0% ± 6.4 | 37.2% ± 2.9 | 88 / 175 | 6.4% ± 0.8 | 9.1% ± 0.8 | 146 | 0 | 1.78 / 202.5 |
| cb.fire.Firestarter 2.0f | rumble-7 | 49.9% ± 6.9 | 48.6% ± 9.7 | 51.8% ± 3.2 | 85 / 175 | 8.1% ± 0.6 | 8.5% ± 0.4 | 151 | 0 | 1.77 / 544.2 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 53.5% ± 7.8 | 68.6% ± 12.5 | 38.2% ± 3.1 | 120 / 175 | 9.6% ± 0.8 | 9.4% ± 0.6 | 80 | 0 | 1.21 / 14.6 |
| xander.cat.XanderCat 12.9 | rumble-9 | 55.6% ± 6.9 | 61.1% ± 9.6 | 50.5% ± 5.3 | 107 / 175 | 11.6% ± 0.3 | 8.6% ± 0.8 | 99 | 0 | 1.28 / 530.3 |
| lxx.Tomcat 3.68 | rumble-10 | 53.9% ± 5.3 | 66.3% ± 7.7 | 42.1% ± 2.8 | 116 / 175 | 9.6% ± 0.4 | 10.4% ± 0.7 | 163 | 0 | 2.16 / 668.7 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 56.5% ± 3.6 | 60.0% ± 5.6 | 52.4% ± 1.5 | 105 / 175 | 9.4% ± 0.4 | 10.1% ± 0.8 | 184 | 0 | 2.12 / 28.1 |
| aw.Gilgalad 1.99.5c | rumble-12 | 50.0% ± 7.7 | 58.0% ± 7.2 | 42.8% ± 8.9 | 102 / 175 | 10.0% ± 2.2 | 10.2% ± 0.7 | 118 | 0 | 1.52 / 20.7 |
| pc.Wavelet 1.5 | rumble-13 | 49.0% ± 8.5 | 49.1% ± 16.3 | 49.4% ± 2.7 | 86 / 175 | 10.3% ± 0.7 | 9.1% ± 1.4 | 65 | 0 | 1.85 / 766.5 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 60.5% ± 6.7 | 72.6% ± 9.3 | 48.8% ± 4.3 | 127 / 175 | 11.1% ± 0.2 | 8.7% ± 0.6 | 70 | 0 | 1.09 / 364.1 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 56.2% ± 6.5 | 72.0% ± 10.8 | 39.6% ± 2.4 | 126 / 175 | 8.5% ± 1.0 | 8.2% ± 0.8 | 54 | 0 | 2.21 / 356.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 69.1% ± 4.9 | 82.7% ± 3.7 | 53.8% ± 6.5 | 145 / 175 | 10.9% ± 0.6 | 7.2% ± 0.5 | 72 | 0 | 1.17 / 15.5 |
| cs.Nene 1.0.5 | rumble-18 | 57.2% ± 11.1 | 74.9% ± 15.3 | 39.3% ± 4.3 | 131 / 175 | 9.6% ± 0.7 | 8.2% ± 1.1 | 54 | 0 | 1.32 / 18.4 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 49.3% ± 7.0 | 52.3% ± 10.5 | 46.9% ± 3.2 | 92 / 175 | 9.6% ± 0.7 | 10.3% ± 0.5 | 190 | 0 | 1.76 / 873.6 |
| voidious.Dookious 1.573c | rumble-20 | 61.7% ± 5.7 | 78.3% ± 7.8 | 42.0% ± 3.2 | 137 / 175 | 9.5% ± 0.7 | 6.8% ± 0.6 | 46 | 0 | 1.16 / 781.5 |
| davidalves.Phoenix 1.02 | rumble-21 | 55.6% ± 11.9 | 71.4% ± 17.2 | 39.8% ± 5.2 | 125 / 175 | 9.8% ± 0.7 | 8.2% ± 0.9 | 66 | 0 | 1.14 / 893.4 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 58.9% ± 3.9 | 56.0% ± 7.4 | 60.5% ± 1.3 | 98 / 175 | 11.8% ± 0.3 | 9.4% ± 0.4 | 103 | 0 | 1.56 / 20.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 5 | 2863 | 53.1% | 30.8% | 0.0% | 16.1% | 1749 |
| jk.mega.DrussGT 3.1.16 | 5 | 2282 | 39.9% | 46.8% | 0.0% | 13.3% | 3133 |
| oog.mega.saguaro.Saguaro 1.0 | 5 | 1291 | 19.4% | 72.3% | 0.0% | 8.3% | 659 |
| aaa.r.ScalarR 0.005h.053-noshield | 5 | 3074 | 45.5% | 38.7% | 0.1% | 15.6% | 2456 |
| voidious.Diamond 1.8.22 | 5 | 2344 | 37.1% | 49.9% | 0.0% | 13.0% | 2601 |
| cb.fire.Firestarter 2.0f | 5 | 2129 | 42.3% | 44.1% | 0.0% | 13.6% | 3376 |
| dsekercioglu.mega.Raven 3.56j8 | 5 | 2054 | 26.8% | 62.5% | 0.0% | 10.7% | 1336 |
| xander.cat.XanderCat 12.9 | 5 | 2054 | 33.1% | 55.6% | 0.0% | 11.3% | 1479 |
| lxx.Tomcat 3.68 | 5 | 2111 | 27.9% | 61.0% | 0.1% | 11.0% | 2143 |
| rsalesc.mega.Knight 0.6.28 | 5 | 1965 | 35.6% | 52.4% | 0.0% | 11.9% | 3104 |
| aw.Gilgalad 1.99.5c | 5 | 2322 | 31.4% | 56.3% | 0.0% | 12.3% | 1675 |
| pc.Wavelet 1.5 | 5 | 2309 | 38.5% | 47.6% | 0.2% | 13.6% | 1493 |
| gh.GresSuffurd 0.4.13 | 5 | 1848 | 26.0% | 63.7% | 0.0% | 10.3% | 1112 |
| kc.serpent.WaveSerpent 2.11 | 5 | 1912 | 25.6% | 64.6% | 0.0% | 9.8% | 1067 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 5 | 1339 | 22.4% | 69.1% | 0.0% | 8.5% | 1246 |
| cs.Nene 1.0.5 | 5 | 1926 | 22.8% | 67.8% | 0.0% | 9.4% | 935 |
| jk.melee.Neuromancer 7.12 | 5 | 2314 | 35.9% | 51.5% | 0.0% | 12.7% | 2111 |
| voidious.Dookious 1.573c | 5 | 1586 | 24.0% | 67.1% | 0.0% | 9.0% | 1005 |
| davidalves.Phoenix 1.02 | 5 | 1999 | 25.0% | 64.9% | 0.0% | 10.1% | 975 |
| rsalesc.roborio.Roborio 1.2.4 | 5 | 1949 | 39.5% | 47.5% | 0.0% | 13.0% | 2807 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 5 | 3 | 596 | 0 | 0.63 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 5 | 0 | 298 | 0 | 1.02 | 5 | 5 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 5 | 4 | 4 | 0 | 0.34 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 5 | 2 | 298 | 0 | 0.92 | 5 | 3 | 0 |
| voidious.Diamond 1.8.22 | 5 | 1 | 0 | 0 | 0.83 | 4 | 4 | 0 |
| cb.fire.Firestarter 2.0f | 5 | 5 | 0 | 0 | 0.86 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 5 | 4 | 0 | 0 | 0.46 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 5 | 2 | 298 | 0 | 0.57 | 2 | 2 | 5 |
| lxx.Tomcat 3.68 | 5 | 3 | 0 | 0 | 0.93 | 2 | 2 | 0 |
| rsalesc.mega.Knight 0.6.28 | 5 | 5 | 0 | 0 | 1.05 | 0 | 0 | 0 |
| aw.Gilgalad 1.99.5c | 5 | 3 | 298 | 0 | 0.67 | 1 | 1 | 0 |
| pc.Wavelet 1.5 | 5 | 2 | 0 | 0 | 0.37 | 3 | 3 | 0 |
| gh.GresSuffurd 0.4.13 | 5 | 2 | 0 | 0 | 0.40 | 3 | 3 | 0 |
| kc.serpent.WaveSerpent 2.11 | 5 | 3 | 0 | 0 | 0.31 | 2 | 2 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 5 | 1 | 770 | 0 | 0.41 | 1 | 1 | 0 |
| cs.Nene 1.0.5 | 5 | 5 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 5 | 3 | 590 | 0 | 1.09 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 5 | 3 | 298 | 0 | 0.26 | 2 | 2 | 0 |
| davidalves.Phoenix 1.02 | 5 | 5 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 5 | 3 | 0 | 0 | 0.59 | 2 | 2 | 0 |

59 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 23111 | 304 | 24051 | 23050 (99.7%) | 61 (0.3%) | 1001 (4.2%) | 921 | 160 | 102 |
| jk.mega.DrussGT 3.1.16 | 45117 | 7 | 45097 | 45093 (99.9%) | 24 (0.1%) | 4 (0.0%) | 2849 | 308 | 177 |
| oog.mega.saguaro.Saguaro 1.0 | 5548 | 31 | 5547 | 5545 (99.9%) | 3 (0.1%) | 2 (0.0%) | 306 | 83 | 24 |
| aaa.r.ScalarR 0.005h.053-noshield | 33728 | 11 | 34844 | 33704 (99.9%) | 24 (0.1%) | 1140 (3.3%) | 1831 | 358 | 135 |
| voidious.Diamond 1.8.22 | 36308 | 872 | 37637 | 36276 (99.9%) | 32 (0.1%) | 1361 (3.6%) | 2210 | 201 | 153 |
| cb.fire.Firestarter 2.0f | 42510 | 975 | 49691 | 42510 (100.0%) | 0 (0.0%) | 7181 (14.5%) | 3741 | 337 | 142 |
| dsekercioglu.mega.Raven 3.56j8 | 15788 | 84 | 15788 | 15784 (100.0%) | 4 (0.0%) | 4 (0.0%) | 1216 | 189 | 54 |
| xander.cat.XanderCat 12.9 | 15171 | 6 | 15703 | 15148 (99.8%) | 23 (0.2%) | 555 (3.5%) | 1510 | 195 | 94 |
| lxx.Tomcat 3.68 | 29051 | 566 | 29164 | 29040 (100.0%) | 11 (0.0%) | 124 (0.4%) | 2402 | 255 | 155 |
| rsalesc.mega.Knight 0.6.28 | 44195 | 451 | 44197 | 44183 (100.0%) | 12 (0.0%) | 14 (0.0%) | 3607 | 386 | 159 |
| aw.Gilgalad 1.99.5c | 21634 | 6 | 21664 | 21605 (99.9%) | 29 (0.1%) | 59 (0.3%) | 1644 | 217 | 91 |
| pc.Wavelet 1.5 | 15686 | 5 | 15891 | 15684 (100.0%) | 2 (0.0%) | 207 (1.3%) | 1396 | 167 | 54 |
| gh.GresSuffurd 0.4.13 | 12451 | 11 | 12454 | 12450 (100.0%) | 1 (0.0%) | 4 (0.0%) | 804 | 109 | 61 |
| kc.serpent.WaveSerpent 2.11 | 9800 | 4 | 9789 | 9789 (99.9%) | 11 (0.1%) | 0 (0.0%) | 698 | 64 | 191 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 13557 | 5 | 13497 | 13496 (99.6%) | 61 (0.4%) | 1 (0.0%) | 1058 | 116 | 33 |
| cs.Nene 1.0.5 | 9599 | 83 | 9599 | 9599 (100.0%) | 0 (0.0%) | 0 (0.0%) | 588 | 76 | 42 |
| jk.melee.Neuromancer 7.12 | 27213 | 7 | 27433 | 27151 (99.8%) | 62 (0.2%) | 282 (1.0%) | 2367 | 250 | 281 |
| voidious.Dookious 1.573c | 9548 | 17 | 9528 | 9528 (99.8%) | 20 (0.2%) | 0 (0.0%) | 675 | 73 | 37 |
| davidalves.Phoenix 1.02 | 9263 | 6 | 9263 | 9263 (100.0%) | 0 (0.0%) | 0 (0.0%) | 678 | 106 | 27 |
| rsalesc.roborio.Roborio 1.2.4 | 35257 | 5 | 35297 | 35256 (100.0%) | 1 (0.0%) | 41 (0.1%) | 3601 | 282 | 97 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 22930 | 2511 (11.0%) | 22532 |
| jk.mega.DrussGT 3.1.16 | 44597 | 5818 (13.0%) | 44433 |
| oog.mega.saguaro.Saguaro 1.0 | 6299 | 443 (7.0%) | 6276 |
| aaa.r.ScalarR 0.005h.053-noshield | 33361 | 3933 (11.8%) | 32225 |
| voidious.Diamond 1.8.22 | 36773 | 3931 (10.7%) | 35755 |
| cb.fire.Firestarter 2.0f | 49080 | 4481 (9.1%) | 47838 |
| dsekercioglu.mega.Raven 3.56j8 | 17022 | 1703 (10.0%) | 16183 |
| xander.cat.XanderCat 12.9 | 18529 | 1606 (8.7%) | 17701 |
| lxx.Tomcat 3.68 | 29593 | 3421 (11.6%) | 28848 |
| rsalesc.mega.Knight 0.6.28 | 44612 | 5253 (11.8%) | 44058 |
| aw.Gilgalad 1.99.5c | 22094 | 2278 (10.3%) | 20978 |
| pc.Wavelet 1.5 | 18872 | 1662 (8.8%) | 18056 |
| gh.GresSuffurd 0.4.13 | 12890 | 1336 (10.4%) | 11241 |
| kc.serpent.WaveSerpent 2.11 | 12734 | 857 (6.7%) | 8895 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 15382 | 1454 (9.5%) | 13816 |
| cs.Nene 1.0.5 | 10790 | 1059 (9.8%) | 9547 |
| jk.melee.Neuromancer 7.12 | 29096 | 3047 (10.5%) | 28070 |
| voidious.Dookious 1.573c | 11704 | 940 (8.0%) | 9864 |
| davidalves.Phoenix 1.02 | 11341 | 842 (7.4%) | 8651 |
| rsalesc.roborio.Roborio 1.2.4 | 39508 | 3646 (9.2%) | 39472 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 532 | 650 | 1599 | 20.6 / 25.2 | 0 | 582 | 151 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 3034 | 27.2 / 30.5 | 26 | 5874 | 515 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 439 | 400 | 509 | 44.8 / 26.7 | 818 | 2510 | 339 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2310 | 21.8 / 34.0 | 0 | 1105 | 3 |
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2493 | 19.8 / 33.4 | 82 | 9423 | 194 |
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3226 | 28.8 / 26.8 | 114 | 5495 | 177 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 452 | 650 | 1188 | 22.7 / 36.7 | 189 | 14204 | 1501 |
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1331 | 33.3 / 32.6 | 276 | 2030 | 32 |
| lxx.Tomcat 3.68 | 650 | 508 | 650 | 2008 | 26.8 / 36.8 | 129 | 16166 | 46 |
| rsalesc.mega.Knight 0.6.28 | 650 | 506 | 650 | 2954 | 32.5 / 29.4 | 376 | 8367 | 46 |
| aw.Gilgalad 1.99.5c | 650 | 458 | 620 | 1528 | 28.3 / 37.3 | 189 | 7563 | 5 |
| pc.Wavelet 1.5 | 650 | 443 | 650 | 1349 | 30.5 / 31.4 | 163 | 3492 | 13 |
| gh.GresSuffurd 0.4.13 | 650 | 462 | 650 | 963 | 32.1 / 33.7 | 373 | 4721 | 176 |
| kc.serpent.WaveSerpent 2.11 | 650 | 478 | 650 | 919 | 23.1 / 35.3 | 89 | 7487 | 3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 463 | 650 | 1096 | 30.8 / 26.4 | 282 | 11869 | 153 |
| cs.Nene 1.0.5 | 650 | 472 | 650 | 785 | 24.0 / 37.3 | 103 | 6344 | 1739 |
| jk.melee.Neuromancer 7.12 | 650 | 525 | 650 | 1961 | 30.0 / 34.0 | 66 | 11317 | 21 |
| voidious.Dookious 1.573c | 650 | 482 | 635 | 858 | 22.0 / 30.4 | 106 | 6400 | 3126 |
| davidalves.Phoenix 1.02 | 650 | 463 | 650 | 825 | 24.4 / 37.1 | 146 | 5557 | 10 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 650 | 2671 | 40.5 / 26.4 | 835 | 11158 | 47 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.6% | 111 | 129 | 3 | 136.7 | 2504 / 2511 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.0% | 178 | 185 | 3 | 253.4 | 5789 / 5818 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 7.0% | 59 | 74 | 3 | 31.7 | 442 / 443 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.5% | 161 | 401 | 3 | 193.8 | 3920 / 3933 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.1% | 146 | 174 | 3 | 213.4 | 3922 / 3931 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.5% | 151 | 29483 | 3 | 282.9 | 4455 / 4481 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.4% | 80 | 1543 | 3 | 89.7 | 1696 / 1703 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 99 | 267 | 3 | 88.6 | 1579 / 1606 (98%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.4% | 163 | 7184 | 3 | 166.1 | 3416 / 3421 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.1% | 184 | 195 | 3 | 251.2 | 5249 / 5253 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.2% | 118 | 3146 | 3 | 123.0 | 2274 / 2278 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.1% | 65 | 212 | 3 | 89.5 | 1657 / 1662 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.7% | 70 | 568 | 2 | 69.3 | 1334 / 1336 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 8.2% | 54 | 78 | 3 | 55.2 | 857 / 857 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.2% | 72 | 93 | 3 | 76.5 | 1406 / 1454 (97%) | 0 | 0 |
| cs.Nene 1.0.5 | 8.2% | 54 | 84 | 3 | 54.8 | 1051 / 1059 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.3% | 190 | 3276 | 3 | 156.0 | 3040 / 3047 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 6.8% | 46 | 387 | 3 | 53.8 | 938 / 940 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.2% | 66 | 170 | 3 | 52.8 | 841 / 842 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.4% | 103 | 5632 | 2 | 199.1 | 3641 / 3646 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.6% | 8.1% ± 0.9 | 5.8% | 20.3% / 20.7% | 0.2% | 0 / 0 | T3/M1 | 22% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.3% | 8.7% ± 0.9 | 7.6% | 23.7% / 20.7% | 1.7% | 0 / 0 | T3/M1 | 44% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.0% | 7.8% ± 1.6 | 12.7% | 23.9% / 25.7% | 10.6% | 0 / 0 | T3/M1 | 74% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.4% | 8.0% ± 0.8 | 7.1% | 23.6% / 20.8% | 0.0% | 0 / 0 | T3/M1 | 34% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 9.1% | 7.9% ± 1.0 | 7.8% | 23.2% / 21.8% | 9.3% | 0 / 0 | T3/M1 | 45% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 8.4% | 7.0% ± 1.1 | 9.0% | 19.8% / 20.9% | 3.3% | 0 / 0 | T3/M1 | 54% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.6% | 7.2% ± 0.9 | 10.2% | 22.0% / 21.3% | 11.6% | 0 / 0 | T3/M1 | 60% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 11.1% | 8.1% ± 1.0 | 11.9% | 23.3% / 22.0% | 8.2% | 0 / 0 | T3/M1 | 53% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.3% | 8.6% ± 0.9 | 10.7% | 23.8% / 21.3% | 8.8% | 0 / 0 | T3/M1 | 58% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.1% ± 0.9 | 10.4% | 24.3% / 20.5% | 12.0% | 0 / 0 | T3/M1 | 58% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 10.4% | 8.1% ± 1.0 | 8.8% | 21.1% / 21.1% | 4.0% | 0 / 0 | T3/M1 | 44% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.1% | 6.6% ± 0.9 | 10.6% | 21.3% / 21.0% | 9.8% | 0 / 0 | T2/M1 | 47% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 10.0% | 8.4% ± 1.2 | 10.8% | 24.1% / 23.5% | 13.1% | 0 / 0 | T3/M1 | 56% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 8.5% | 7.3% ± 1.3 | 8.8% | 22.2% / 23.0% | 12.0% | 0 / 0 | T3/M1 | 52% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 7.9% | 6.5% ± 1.1 | 10.8% | 22.3% / 21.8% | 14.2% | 0 / 0 | T2/M1 | 74% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 9.6% | 8.9% ± 1.4 | 9.4% | 24.5% / 24.2% | 8.6% | 0 / 0 | T3/M1 | 47% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 10.9% | 9.2% ± 1.2 | 10.5% | 24.4% / 23.0% | 0.0% | 0 / 0 | T3/M1 | 45% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.8% | 6.9% ± 1.2 | 10.7% | 22.5% / 22.9% | 11.8% | 0 / 0 | T2/M1 | 62% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 9.4% | 8.6% ± 1.3 | 10.1% | 20.6% / 21.5% | 4.7% | 0 / 0 | T3/M1 | 59% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 10.1% | 7.8% ± 0.9 | 11.1% | 23.2% / 20.6% | 13.7% | 0 / 0 | T3/M1 | 54% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.10 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 26.4% ± 4.9 | 24.0% ± 4.0 | +2.4 ± 8.6 |
| jk.mega.DrussGT 3.1.16 | 47.2% ± 6.3 | 47.6% ± 5.0 | -0.4 ± 9.7 |
| oog.mega.saguaro.Saguaro 1.0 | 73.9% ± 3.9 | 72.1% ± 2.2 | +1.9 ± 5.7 |
| aaa.r.ScalarR 0.005h.053-noshield | 28.2% ± 5.1 | 30.8% ± 6.3 | -2.6 ± 4.1 |
| voidious.Diamond 1.8.22 | 43.7% ± 4.0 | 50.0% ± 9.2 | -6.3 ± 8.2 |
| cb.fire.Firestarter 2.0f | 49.9% ± 6.9 | 50.7% ± 2.6 | -0.8 ± 7.1 |
| dsekercioglu.mega.Raven 3.56j8 | 53.5% ± 7.8 | 57.0% ± 6.5 | -3.5 ± 11.0 |
| xander.cat.XanderCat 12.9 | 55.6% ± 6.9 | 62.8% ± 4.5 | -7.1 ± 9.4 |
| lxx.Tomcat 3.68 | 53.9% ± 5.3 | 56.1% ± 4.7 | -2.2 ± 8.6 |
| rsalesc.mega.Knight 0.6.28 | 56.5% ± 3.6 | 55.1% ± 6.1 | +1.5 ± 9.5 |
| aw.Gilgalad 1.99.5c | 50.0% ± 7.7 | 45.6% ± 4.0 | +4.4 ± 7.7 |
| pc.Wavelet 1.5 | 49.0% ± 8.5 | 44.0% ± 3.6 | +5.1 ± 9.2 |
| gh.GresSuffurd 0.4.13 | 60.5% ± 6.7 | 60.8% ± 2.3 | -0.3 ± 5.1 |
| kc.serpent.WaveSerpent 2.11 | 56.2% ± 6.5 | 61.4% ± 5.6 | -5.2 ± 7.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 69.1% ± 4.9 | 62.3% ± 3.4 | +6.8 ± 5.1 |
| cs.Nene 1.0.5 | 57.2% ± 11.1 | 58.6% ± 5.7 | -1.4 ± 7.9 |
| jk.melee.Neuromancer 7.12 | 49.3% ± 7.0 | 54.7% ± 6.1 | -5.4 ± 8.9 |
| voidious.Dookious 1.573c | 61.7% ± 5.7 | 57.9% ± 7.8 | +3.8 ± 11.0 |
| davidalves.Phoenix 1.02 | 55.6% ± 11.9 | 60.6% ± 7.2 | -5.0 ± 9.9 |
| rsalesc.roborio.Roborio 1.2.4 | 58.9% ± 3.9 | 60.7% ± 4.0 | -1.8 ± 6.4 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | +2.4 ± 8.6 | +1.7 ± 11.7 | +1.7 ± 11.7 | +2.9 ± 5.3 |
| jk.mega.DrussGT 3.1.16 | -0.4 ± 9.7 | +0.3 ± 15.5 | +0.6 ± 15.7 | -0.8 ± 4.1 |
| oog.mega.saguaro.Saguaro 1.0 | +1.9 ± 5.7 | +1.1 ± 8.5 | +1.1 ± 8.5 | +2.9 ± 5.1 |
| aaa.r.ScalarR 0.005h.053-noshield | -2.6 ± 4.1 | -3.3 ± 6.6 | -2.9 ± 6.1 | -1.3 ± 2.4 |
| voidious.Diamond 1.8.22 | -6.3 ± 8.2 | -8.3 ± 11.7 | -8.0 ± 11.6 | -3.8 ± 6.3 |
| cb.fire.Firestarter 2.0f | -0.8 ± 7.1 | -1.1 ± 10.0 | -1.7 ± 9.9 | -0.3 ± 2.7 |
| dsekercioglu.mega.Raven 3.56j8 | -3.5 ± 11.0 | -2.9 ± 15.9 | -2.9 ± 15.9 | -3.7 ± 8.0 |
| xander.cat.XanderCat 12.9 | -7.1 ± 9.4 | -10.3 ± 15.8 | -10.3 ± 15.8 | -3.7 ± 3.7 |
| lxx.Tomcat 3.68 | -2.2 ± 8.6 | -2.9 ± 13.0 | -2.9 ± 13.0 | -1.0 ± 4.9 |
| rsalesc.mega.Knight 0.6.28 | +1.5 ± 9.5 | +1.1 ± 14.8 | +1.1 ± 14.8 | +1.8 ± 3.9 |
| aw.Gilgalad 1.99.5c | +4.4 ± 7.7 | +3.2 ± 8.2 | +3.4 ± 8.5 | +6.1 ± 8.4 |
| pc.Wavelet 1.5 | +5.1 ± 9.2 | +9.7 ± 16.0 | +9.7 ± 16.0 | -0.0 ± 4.8 |
| gh.GresSuffurd 0.4.13 | -0.3 ± 5.1 | +0.2 ± 8.2 | -0.0 ± 8.3 | -0.3 ± 3.1 |
| kc.serpent.WaveSerpent 2.11 | -5.2 ± 7.8 | -5.7 ± 13.5 | -5.7 ± 13.5 | -3.4 ± 1.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +6.8 ± 5.1 | +5.3 ± 7.9 | +5.1 ± 8.1 | +7.9 ± 8.1 |
| cs.Nene 1.0.5 | -1.4 ± 7.9 | -2.9 ± 10.3 | -2.9 ± 10.3 | +0.6 ± 2.6 |
| jk.melee.Neuromancer 7.12 | -5.4 ± 8.9 | -8.6 ± 14.2 | -8.6 ± 14.2 | -2.2 ± 3.9 |
| voidious.Dookious 1.573c | +3.8 ± 11.0 | +8.0 ± 14.9 | +8.0 ± 14.9 | -2.2 ± 5.8 |
| davidalves.Phoenix 1.02 | -5.0 ± 9.9 | -6.9 ± 13.4 | -6.9 ± 13.4 | -3.4 ± 6.6 |
| rsalesc.roborio.Roborio 1.2.4 | -1.8 ± 6.4 | -2.3 ± 8.5 | -2.3 ± 8.5 | -1.3 ± 5.8 |
| All pairs | -0.8 ± 1.4 | -1.2 ± 2.1 | -1.2 ± 2.1 | -0.3 ± 1.0 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 5 | 2 | +2.4 ± 8.6 | +7.7 ± 77.1 |
| jk.mega.DrussGT 3.1.16 | 5 | 0 | -0.4 ± 9.7 | n/a |
| oog.mega.saguaro.Saguaro 1.0 | 5 | 3 | +1.9 ± 5.7 | -0.4 ± 12.0 |
| aaa.r.ScalarR 0.005h.053-noshield | 5 | 1 | -2.6 ± 4.1 | -3.0 |
| voidious.Diamond 1.8.22 | 5 | 0 | -6.3 ± 8.2 | n/a |
| cb.fire.Firestarter 2.0f | 5 | 4 | -0.8 ± 7.1 | -1.8 ± 9.6 |
| dsekercioglu.mega.Raven 3.56j8 | 5 | 3 | -3.5 ± 11.0 | -2.8 ± 27.3 |
| xander.cat.XanderCat 12.9 | 5 | 2 | -7.1 ± 9.4 | -7.6 ± 85.3 |
| lxx.Tomcat 3.68 | 5 | 3 | -2.2 ± 8.6 | -1.3 ± 21.8 |
| rsalesc.mega.Knight 0.6.28 | 5 | 3 | +1.5 ± 9.5 | +2.3 ± 24.4 |
| aw.Gilgalad 1.99.5c | 5 | 3 | +4.4 ± 7.7 | +3.7 ± 21.4 |
| pc.Wavelet 1.5 | 5 | 0 | +5.1 ± 9.2 | n/a |
| gh.GresSuffurd 0.4.13 | 5 | 1 | -0.3 ± 5.1 | -1.8 |
| kc.serpent.WaveSerpent 2.11 | 5 | 2 | -5.2 ± 7.8 | +0.7 ± 26.2 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 5 | 1 | +6.8 ± 5.1 | +5.2 |
| cs.Nene 1.0.5 | 5 | 5 | -1.4 ± 7.9 | -1.4 ± 7.9 |
| jk.melee.Neuromancer 7.12 | 5 | 2 | -5.4 ± 8.9 | -6.0 ± 36.3 |
| voidious.Dookious 1.573c | 5 | 2 | +3.8 ± 11.0 | +11.2 ± 5.1 |
| davidalves.Phoenix 1.02 | 5 | 4 | -5.0 ± 9.9 | -2.7 ± 11.1 |
| rsalesc.roborio.Roborio 1.2.4 | 5 | 0 | -1.8 ± 6.4 | n/a |
| All pairs | 100 | 41 | -0.8 ± 1.4 | -0.2 ± 2.3 |

# Bench: hadur2.Hadur 3.10 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2300 over 100 battles (23.0 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 24.0% ± 4.0 | 11.4% ± 5.0 | 42.1% ± 4.9 | 20 / 175 | 4.8% ± 0.4 | 8.3% ± 0.5 | 117 | 0 | 1.99 / 542.0 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 47.6% ± 5.0 | 47.1% ± 7.3 | 47.9% ± 2.7 | 83 / 175 | 7.5% ± 0.4 | 10.3% ± 0.5 | 186 | 0 | 1.53 / 749.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.1% ± 2.2 | 84.6% ± 3.2 | 59.8% ± 2.8 | 148 / 175 | 17.7% ± 1.1 | 6.4% ± 0.7 | 60 | 0 | 2.13 / 534.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 30.8% ± 6.3 | 22.9% ± 12.5 | 40.3% ± 2.3 | 40 / 175 | 6.8% ± 0.9 | 10.9% ± 0.6 | 159 | 0 | 1.88 / 262.8 |
| voidious.Diamond 1.8.22 | rumble-6 | 50.0% ± 9.2 | 58.3% ± 12.7 | 41.1% ± 5.5 | 102 / 175 | 6.5% ± 0.7 | 8.6% ± 0.7 | 139 | 0 | 1.75 / 719.9 |
| cb.fire.Firestarter 2.0f | rumble-7 | 50.7% ± 2.6 | 49.7% ± 3.9 | 52.1% ± 1.3 | 88 / 175 | 8.2% ± 0.3 | 8.3% ± 0.3 | 161 | 0 | 1.80 / 669.0 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 57.0% ± 6.5 | 71.4% ± 8.3 | 41.9% ± 5.6 | 125 / 175 | 9.4% ± 0.8 | 8.8% ± 0.8 | 72 | 0 | 1.21 / 15.4 |
| xander.cat.XanderCat 12.9 | rumble-9 | 62.8% ± 4.5 | 71.4% ± 7.9 | 54.2% ± 2.4 | 125 / 175 | 11.9% ± 0.9 | 8.1% ± 0.6 | 102 | 0 | 1.27 / 786.4 |
| lxx.Tomcat 3.68 | rumble-10 | 56.1% ± 4.7 | 69.1% ± 8.5 | 43.1% ± 2.2 | 121 / 175 | 9.5% ± 0.6 | 10.2% ± 0.4 | 164 | 0 | 2.14 / 766.8 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 55.1% ± 6.1 | 58.9% ± 9.6 | 50.6% ± 2.8 | 103 / 175 | 9.2% ± 0.6 | 9.8% ± 0.5 | 178 | 0 | 2.17 / 585.5 |
| aw.Gilgalad 1.99.5c | rumble-12 | 45.6% ± 4.0 | 54.9% ± 6.8 | 36.7% ± 1.9 | 96 / 175 | 8.2% ± 1.2 | 9.9% ± 0.8 | 150 | 0 | 1.53 / 19.9 |
| pc.Wavelet 1.5 | rumble-13 | 44.0% ± 3.6 | 39.4% ± 5.8 | 49.4% ± 5.6 | 69 / 175 | 10.2% ± 0.9 | 9.1% ± 0.7 | 86 | 0 | 1.94 / 653.2 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 60.8% ± 2.3 | 72.4% ± 3.0 | 49.1% ± 1.8 | 127 / 175 | 11.4% ± 0.4 | 8.6% ± 0.7 | 90 | 0 | 1.11 / 769.0 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 61.4% ± 5.6 | 77.7% ± 8.5 | 43.0% ± 2.4 | 136 / 175 | 9.3% ± 0.7 | 7.5% ± 0.9 | 59 | 0 | 2.21 / 589.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 62.3% ± 3.4 | 77.5% ± 7.8 | 45.8% ± 4.0 | 136 / 175 | 10.4% ± 0.9 | 8.0% ± 0.6 | 75 | 0 | 1.25 / 363.5 |
| cs.Nene 1.0.5 | rumble-18 | 58.6% ± 5.7 | 77.7% ± 7.3 | 38.7% ± 3.9 | 136 / 175 | 9.6% ± 0.6 | 7.7% ± 0.6 | 72 | 0 | 1.32 / 54.9 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 54.7% ± 6.1 | 60.9% ± 8.6 | 49.1% ± 3.3 | 107 / 175 | 10.3% ± 0.2 | 10.2% ± 0.4 | 219 | 0 | 1.74 / 602.9 |
| voidious.Dookious 1.573c | rumble-20 | 57.9% ± 7.8 | 70.3% ± 11.4 | 44.1% ± 3.5 | 123 / 175 | 9.5% ± 1.1 | 7.1% ± 0.9 | 62 | 0 | 1.20 / 768.3 |
| davidalves.Phoenix 1.02 | rumble-21 | 60.6% ± 7.2 | 78.3% ± 10.2 | 43.1% ± 5.7 | 137 / 175 | 10.4% ± 0.8 | 7.9% ± 0.3 | 52 | 0 | 1.09 / 415.0 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 60.7% ± 4.0 | 58.3% ± 4.0 | 61.8% ± 4.6 | 102 / 175 | 11.9% ± 0.6 | 9.1% ± 0.5 | 97 | 0 | 1.52 / 112.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 5 | 2933 | 52.8% | 31.0% | 0.0% | 16.1% | 1917 |
| jk.mega.DrussGT 3.1.16 | 5 | 2316 | 39.7% | 47.2% | 0.0% | 13.1% | 3119 |
| oog.mega.saguaro.Saguaro 1.0 | 5 | 1343 | 20.1% | 71.5% | 0.1% | 8.3% | 696 |
| aaa.r.ScalarR 0.005h.053-noshield | 5 | 3015 | 44.8% | 39.8% | 0.0% | 15.4% | 2653 |
| voidious.Diamond 1.8.22 | 5 | 2102 | 34.7% | 53.3% | 0.0% | 12.0% | 2755 |
| cb.fire.Firestarter 2.0f | 5 | 2081 | 41.8% | 44.8% | 0.0% | 13.4% | 3415 |
| dsekercioglu.mega.Raven 3.56j8 | 5 | 1884 | 26.5% | 63.1% | 0.0% | 10.3% | 1281 |
| xander.cat.XanderCat 12.9 | 5 | 1755 | 28.5% | 61.2% | 0.0% | 10.3% | 1430 |
| lxx.Tomcat 3.68 | 5 | 1974 | 27.4% | 61.9% | 0.1% | 10.6% | 2261 |
| rsalesc.mega.Knight 0.6.28 | 5 | 2027 | 35.5% | 52.6% | 0.0% | 11.9% | 3117 |
| aw.Gilgalad 1.99.5c | 5 | 2366 | 33.4% | 54.2% | 0.0% | 12.4% | 1913 |
| pc.Wavelet 1.5 | 5 | 2527 | 41.9% | 43.0% | 0.2% | 14.8% | 1664 |
| gh.GresSuffurd 0.4.13 | 5 | 1783 | 26.9% | 62.5% | 0.0% | 10.5% | 1137 |
| kc.serpent.WaveSerpent 2.11 | 5 | 1639 | 23.8% | 67.1% | 0.0% | 9.1% | 1069 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 5 | 1628 | 23.9% | 66.9% | 0.0% | 9.1% | 1345 |
| cs.Nene 1.0.5 | 5 | 1806 | 21.6% | 69.7% | 0.0% | 8.7% | 948 |
| jk.melee.Neuromancer 7.12 | 5 | 2074 | 32.8% | 55.7% | 0.0% | 11.6% | 2145 |
| voidious.Dookious 1.573c | 5 | 1814 | 28.7% | 60.5% | 0.0% | 10.8% | 961 |
| davidalves.Phoenix 1.02 | 5 | 1786 | 21.3% | 70.0% | 0.0% | 8.7% | 979 |
| rsalesc.roborio.Roborio 1.2.4 | 5 | 1829 | 39.9% | 47.3% | 0.0% | 12.8% | 2742 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 5 | 4 | 0 | 0 | 0.67 | 1 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 5 | 1 | 894 | 0 | 1.06 | 3 | 3 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 5 | 3 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 5 | 3 | 298 | 0 | 0.91 | 2 | 1 | 0 |
| voidious.Diamond 1.8.22 | 5 | 0 | 0 | 0 | 0.79 | 5 | 5 | 0 |
| cb.fire.Firestarter 2.0f | 5 | 4 | 181 | 0 | 0.92 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 5 | 4 | 0 | 0 | 0.41 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 5 | 3 | 298 | 0 | 0.58 | 1 | 1 | 5 |
| lxx.Tomcat 3.68 | 5 | 5 | 0 | 0 | 0.94 | 0 | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 5 | 3 | 0 | 0 | 1.02 | 2 | 2 | 0 |
| aw.Gilgalad 1.99.5c | 5 | 5 | 0 | 0 | 0.86 | 0 | 0 | 0 |
| pc.Wavelet 1.5 | 5 | 2 | 0 | 0 | 0.49 | 3 | 3 | 0 |
| gh.GresSuffurd 0.4.13 | 5 | 4 | 0 | 0 | 0.51 | 1 | 1 | 0 |
| kc.serpent.WaveSerpent 2.11 | 5 | 3 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 5 | 2 | 0 | 0 | 0.43 | 3 | 3 | 0 |
| cs.Nene 1.0.5 | 5 | 5 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 5 | 2 | 444 | 0 | 1.25 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 5 | 4 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 5 | 4 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 5 | 0 | 298 | 0 | 0.55 | 4 | 4 | 0 |

61 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25745 | 300 | 26958 | 25735 (100.0%) | 10 (0.0%) | 1223 (4.5%) | 1096 | 168 | 97 |
| jk.mega.DrussGT 3.1.16 | 44862 | 6 | 44796 | 44789 (99.8%) | 73 (0.2%) | 7 (0.0%) | 2645 | 328 | 165 |
| oog.mega.saguaro.Saguaro 1.0 | 5978 | 11 | 5934 | 5929 (99.2%) | 49 (0.8%) | 5 (0.1%) | 386 | 91 | 25 |
| aaa.r.ScalarR 0.005h.053-noshield | 36693 | 11 | 37352 | 36664 (99.9%) | 29 (0.1%) | 688 (1.8%) | 2248 | 399 | 175 |
| voidious.Diamond 1.8.22 | 38727 | 754 | 40140 | 38718 (100.0%) | 9 (0.0%) | 1422 (3.5%) | 2267 | 228 | 129 |
| cb.fire.Firestarter 2.0f | 43096 | 946 | 50102 | 43058 (99.9%) | 38 (0.1%) | 7044 (14.1%) | 3820 | 354 | 137 |
| dsekercioglu.mega.Raven 3.56j8 | 15031 | 69 | 15031 | 15030 (100.0%) | 1 (0.0%) | 1 (0.0%) | 1058 | 156 | 42 |
| xander.cat.XanderCat 12.9 | 14299 | 7 | 14691 | 14276 (99.8%) | 23 (0.2%) | 415 (2.8%) | 1422 | 201 | 93 |
| lxx.Tomcat 3.68 | 30879 | 480 | 30985 | 30830 (99.8%) | 49 (0.2%) | 155 (0.5%) | 2594 | 243 | 138 |
| rsalesc.mega.Knight 0.6.28 | 44442 | 354 | 44416 | 44409 (99.9%) | 33 (0.1%) | 7 (0.0%) | 3652 | 337 | 152 |
| aw.Gilgalad 1.99.5c | 25226 | 8 | 25411 | 25224 (100.0%) | 2 (0.0%) | 187 (0.7%) | 1876 | 197 | 149 |
| pc.Wavelet 1.5 | 18485 | 8 | 18799 | 18483 (100.0%) | 2 (0.0%) | 316 (1.7%) | 1580 | 182 | 81 |
| gh.GresSuffurd 0.4.13 | 12751 | 9 | 12753 | 12749 (100.0%) | 2 (0.0%) | 4 (0.0%) | 905 | 122 | 70 |
| kc.serpent.WaveSerpent 2.11 | 9746 | 3 | 9752 | 9746 (100.0%) | 0 (0.0%) | 6 (0.1%) | 780 | 83 | 30 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 14770 | 9 | 14772 | 14769 (100.0%) | 1 (0.0%) | 3 (0.0%) | 1261 | 114 | 76 |
| cs.Nene 1.0.5 | 9813 | 78 | 9811 | 9810 (100.0%) | 3 (0.0%) | 1 (0.0%) | 625 | 69 | 29 |
| jk.melee.Neuromancer 7.12 | 27672 | 7 | 28186 | 27630 (99.8%) | 42 (0.2%) | 556 (2.0%) | 2406 | 263 | 202 |
| voidious.Dookious 1.573c | 9088 | 10 | 9068 | 9068 (99.8%) | 20 (0.2%) | 0 (0.0%) | 581 | 90 | 29 |
| davidalves.Phoenix 1.02 | 9129 | 6 | 9138 | 9128 (100.0%) | 1 (0.0%) | 10 (0.1%) | 645 | 106 | 30 |
| rsalesc.roborio.Roborio 1.2.4 | 34279 | 10 | 34289 | 34256 (99.9%) | 23 (0.1%) | 33 (0.1%) | 3421 | 250 | 79 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25498 | 2724 (10.7%) | 25147 |
| jk.mega.DrussGT 3.1.16 | 44054 | 5692 (12.9%) | 43906 |
| oog.mega.saguaro.Saguaro 1.0 | 6867 | 513 (7.5%) | 6748 |
| aaa.r.ScalarR 0.005h.053-noshield | 36992 | 4297 (11.6%) | 36523 |
| voidious.Diamond 1.8.22 | 38528 | 4082 (10.6%) | 37411 |
| cb.fire.Firestarter 2.0f | 49783 | 4441 (8.9%) | 48931 |
| dsekercioglu.mega.Raven 3.56j8 | 16045 | 1642 (10.2%) | 14987 |
| xander.cat.XanderCat 12.9 | 17960 | 1550 (8.6%) | 17035 |
| lxx.Tomcat 3.68 | 31607 | 3576 (11.3%) | 30780 |
| rsalesc.mega.Knight 0.6.28 | 44798 | 5383 (12.0%) | 44309 |
| aw.Gilgalad 1.99.5c | 26074 | 2774 (10.6%) | 25505 |
| pc.Wavelet 1.5 | 21213 | 1985 (9.4%) | 20400 |
| gh.GresSuffurd 0.4.13 | 13492 | 1369 (10.1%) | 12812 |
| kc.serpent.WaveSerpent 2.11 | 12798 | 966 (7.5%) | 9195 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 16940 | 1591 (9.4%) | 15761 |
| cs.Nene 1.0.5 | 10999 | 1032 (9.4%) | 10005 |
| jk.melee.Neuromancer 7.12 | 29711 | 3107 (10.5%) | 28813 |
| voidious.Dookious 1.573c | 10970 | 844 (7.7%) | 7506 |
| davidalves.Phoenix 1.02 | 11364 | 835 (7.3%) | 8595 |
| rsalesc.roborio.Roborio 1.2.4 | 37932 | 3674 (9.7%) | 37660 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 534 | 650 | 1774 | 18.9 / 26.0 | 0 | 743 | 107 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 2967 | 28.7 / 31.2 | 14 | 6344 | 556 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 446 | 450 | 546 | 40.9 / 27.4 | 683 | 2129 | 617 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2511 | 23.2 / 34.3 | 1 | 1653 | 3 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2622 | 22.2 / 32.0 | 98 | 11921 | 337 |
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3265 | 29.0 / 26.6 | 55 | 4613 | 111 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1133 | 24.8 / 34.0 | 266 | 15129 | 1534 |
| xander.cat.XanderCat 12.9 | 650 | 451 | 650 | 1283 | 36.4 / 30.7 | 282 | 2033 | 66 |
| lxx.Tomcat 3.68 | 650 | 513 | 650 | 2111 | 26.4 / 34.9 | 185 | 23105 | 8 |
| rsalesc.mega.Knight 0.6.28 | 650 | 508 | 650 | 2987 | 31.1 / 30.4 | 295 | 8475 | 88 |
| aw.Gilgalad 1.99.5c | 650 | 494 | 650 | 1763 | 21.3 / 36.6 | 63 | 19120 | 41 |
| pc.Wavelet 1.5 | 650 | 443 | 600 | 1504 | 30.7 / 31.1 | 245 | 2934 | 8 |
| gh.GresSuffurd 0.4.13 | 650 | 458 | 650 | 987 | 30.8 / 31.9 | 467 | 6102 | 143 |
| kc.serpent.WaveSerpent 2.11 | 650 | 481 | 650 | 923 | 23.7 / 31.4 | 90 | 9664 | 5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 460 | 595 | 1206 | 26.4 / 31.1 | 162 | 14254 | 302 |
| cs.Nene 1.0.5 | 650 | 476 | 650 | 798 | 22.7 / 36.0 | 65 | 6306 | 1674 |
| jk.melee.Neuromancer 7.12 | 650 | 527 | 650 | 1995 | 31.7 / 33.0 | 222 | 12666 | 27 |
| voidious.Dookious 1.573c | 650 | 487 | 600 | 811 | 24.7 / 31.4 | 241 | 4937 | 2404 |
| davidalves.Phoenix 1.02 | 650 | 465 | 550 | 830 | 27.2 / 35.7 | 104 | 5465 | 84 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 503 | 650 | 2606 | 40.1 / 24.7 | 693 | 5474 | 135 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.3% | 117 | 6566 | 3 | 152.3 | 2720 / 2724 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 186 | 185 | 3 | 250.0 | 5641 / 5692 (99%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.4% | 60 | 173 | 3 | 33.8 | 472 / 513 (92%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.9% | 159 | 10179 | 3 | 211.3 | 4292 / 4297 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.6% | 139 | 29936 | 3 | 223.7 | 4071 / 4082 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.3% | 161 | 7411 | 3 | 285.6 | 4422 / 4441 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 72 | 1647 | 3 | 85.1 | 1633 / 1642 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.1% | 102 | 475 | 3 | 83.4 | 1529 / 1550 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.2% | 164 | 1023 | 3 | 176.9 | 3573 / 3576 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.8% | 178 | 5434 | 3 | 251.9 | 5376 / 5383 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 9.9% | 150 | 145 | 3 | 144.5 | 2772 / 2774 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.1% | 86 | 128 | 3 | 104.6 | 1984 / 1985 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.6% | 90 | 52 | 3 | 72.2 | 1369 / 1369 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.5% | 59 | 1185 | 2 | 55.1 | 965 / 966 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 8.0% | 75 | 839 | 3 | 83.3 | 1588 / 1591 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.7% | 72 | 7897 | 3 | 55.8 | 1024 / 1032 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.2% | 219 | 75 | 3 | 160.6 | 3102 / 3107 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 62 | 71 | 3 | 51.6 | 843 / 844 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 7.9% | 52 | 66 | 2 | 51.9 | 834 / 835 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.1% | 97 | 196 | 3 | 191.0 | 3647 / 3674 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.10 | 5 | 24.0% ± 20.8 | 16.7% ± 14.3 | -7.3 ± 29.3 | 44.5% ± 9.7 | 36.4% ± 5.2 | -8.2 ± 13.7 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.9 | 5 | 12.0% ± 22.2 | 21.1% ± 19.3 | +9.1 ± 32.8 | 33.5% ± 9.4 | 42.5% ± 5.5 | +9.0 ± 11.2 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.10 | 5 | 56.0% ± 27.2 | 65.6% ± 10.0 | +9.6 ± 24.5 | 44.6% ± 10.6 | 44.3% ± 8.8 | -0.4 ± 13.0 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.9 | 5 | 48.0% ± 22.2 | 54.0% ± 14.2 | +6.0 ± 28.6 | 42.3% ± 8.7 | 36.0% ± 4.9 | -6.3 ± 13.1 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.10 | 5 | 52.0% ± 28.3 | 42.0% ± 26.9 | -10.0 ± 42.1 | 53.4% ± 10.8 | 50.4% ± 8.2 | -3.0 ± 16.4 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.9 | 5 | 40.0% ± 24.8 | 48.0% ± 5.6 | +8.0 ± 28.3 | 49.5% ± 12.0 | 50.5% ± 3.4 | +1.0 ± 14.6 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.10 | 5 | 72.0% ± 37.7 | 68.0% ± 13.6 | -4.0 ± 29.9 | 36.8% ± 10.8 | 36.5% ± 2.9 | -0.2 ± 8.9 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.9 | 5 | 80.0% ± 43.0 | 82.0% ± 5.6 | +2.0 ± 43.4 | 40.8% ± 14.2 | 38.5% ± 3.4 | -2.4 ± 14.6 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.10 | 5 | 76.0% ± 11.1 | 66.0% ± 22.6 | -10.0 ± 15.2 | 43.3% ± 8.2 | 36.4% ± 3.4 | -6.9 ± 7.6 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.9 | 5 | 72.0% ± 13.6 | 73.6% ± 13.8 | +1.6 ± 19.7 | 39.6% ± 8.9 | 42.0% ± 4.3 | +2.4 ± 12.7 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.10 | 5 | 52.0% ± 37.7 | 81.6% ± 13.8 | +29.6 ± 29.6 | 36.9% ± 13.9 | 40.3% ± 7.2 | +3.4 ± 18.0 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.9 | 5 | 76.0% ± 20.8 | 65.3% ± 20.6 | -10.7 ± 38.6 | 46.0% ± 8.4 | 37.6% ± 7.2 | -8.4 ± 13.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.10 | 5 | 76.0% ± 11.1 | 87.8% ± 5.4 | +11.8 ± 13.7 | 53.5% ± 7.1 | 50.7% ± 6.6 | -2.8 ± 10.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.9 | 5 | 84.0% ± 32.4 | 76.4% ± 11.2 | -7.6 ± 32.9 | 49.2% ± 6.2 | 45.7% ± 10.3 | -3.4 ± 15.2 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.10 | 5 | 80.0% ± 17.6 | 63.8% ± 17.4 | -16.2 ± 24.0 | 53.2% ± 8.9 | 42.2% ± 9.9 | -11.1 ± 10.8 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.9 | 5 | 76.0% ± 32.4 | 63.6% ± 18.1 | -12.4 ± 29.9 | 51.5% ± 16.1 | 47.0% ± 5.8 | -4.5 ± 19.0 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.10 | 5 | 48.0% ± 28.3 | 42.2% ± 11.5 | -5.8 ± 32.2 | 60.9% ± 12.6 | 39.7% ± 6.9 | -21.2 ± 13.2 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.9 | 5 | 56.0% ± 20.8 | 46.7% ± 26.1 | -9.3 ± 17.5 | 63.3% ± 9.3 | 45.7% ± 4.0 | -17.5 ± 7.7 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.10 | 5 | 44.0% ± 32.4 | 52.0% ± 10.4 | +8.0 ± 29.6 | 51.9% ± 5.5 | 45.4% ± 3.6 | -6.5 ± 5.2 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.9 | 5 | 52.0% ± 28.3 | 60.0% ± 15.2 | +8.0 ± 23.9 | 54.2% ± 8.2 | 47.3% ± 7.1 | -6.9 ± 8.4 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.10 | 5 | 8.0% ± 22.2 | 14.0% ± 6.8 | +6.0 ± 18.8 | 45.3% ± 6.0 | 40.5% ± 4.4 | -4.9 ± 8.2 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.9 | 5 | 4.0% ± 11.1 | 16.0% ± 16.7 | +12.0 ± 22.2 | 46.4% ± 8.8 | 42.1% ± 9.5 | -4.3 ± 9.5 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.10 | 5 | 80.0% ± 17.6 | 72.7% ± 12.2 | -7.3 ± 22.6 | 45.6% ± 8.6 | 39.2% ± 3.7 | -6.4 ± 10.5 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.9 | 5 | 88.0% ± 13.6 | 79.6% ± 17.1 | -8.4 ± 13.7 | 49.9% ± 6.3 | 45.9% ± 4.4 | -4.0 ± 7.7 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.10 | 5 | 76.0% ± 32.4 | 66.4% ± 11.7 | -9.6 ± 38.9 | 43.4% ± 10.9 | 39.7% ± 6.0 | -3.7 ± 7.5 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.9 | 5 | 76.0% ± 11.1 | 72.0% ± 22.2 | -4.0 ± 29.9 | 42.3% ± 11.0 | 44.1% ± 5.6 | +1.8 ± 11.4 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.10 | 5 | 84.0% ± 11.1 | 80.0% ± 15.2 | -4.0 ± 14.2 | 88.0% ± 3.4 | 45.8% ± 2.4 | -42.2 ± 3.1 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.9 | 5 | 84.0% ± 11.1 | 90.0% ± 8.8 | +6.0 ± 6.8 | 90.3% ± 1.7 | 53.4% ± 8.5 | -36.9 ± 8.2 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.10 | 5 | 32.0% ± 28.3 | 55.1% ± 18.2 | +23.1 ± 28.9 | 52.0% ± 10.0 | 44.1% ± 5.1 | -8.0 ± 11.9 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.9 | 5 | 24.0% ± 27.2 | 61.3% ± 22.4 | +37.3 ± 45.1 | 51.1% ± 8.0 | 49.4% ± 9.8 | -1.7 ± 12.2 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.10 | 5 | 60.0% ± 17.6 | 54.0% ± 14.2 | -6.0 ± 18.8 | 58.9% ± 8.9 | 50.3% ± 5.6 | -8.5 ± 11.0 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.9 | 5 | 52.0% ± 22.2 | 62.0% ± 16.9 | +10.0 ± 26.5 | 51.5% ± 10.2 | 49.2% ± 4.9 | -2.3 ± 11.3 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.10 | 5 | 40.0% ± 0.0 | 64.7% ± 11.2 | +24.7 ± 11.2 | 66.7% ± 6.6 | 57.1% ± 5.8 | -9.6 ± 11.4 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.9 | 5 | 52.0% ± 22.2 | 60.4% ± 27.5 | +8.4 ± 48.3 | 67.6% ± 1.5 | 57.7% ± 9.2 | -9.9 ± 9.7 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.10 | 5 | 48.0% ± 22.2 | 49.6% ± 22.1 | +1.6 ± 37.8 | 42.2% ± 1.9 | 35.1% ± 6.4 | -7.1 ± 4.8 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.9 | 5 | 52.0% ± 22.2 | 57.8% ± 26.5 | +5.8 ± 21.1 | 43.3% ± 12.5 | 37.2% ± 9.3 | -6.2 ± 8.9 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.10 | 5 | 68.0% ± 22.2 | 72.9% ± 7.1 | +4.9 ± 24.5 | 38.1% ± 2.7 | 39.6% ± 5.4 | +1.5 ± 7.3 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.9 | 5 | 72.0% ± 22.2 | 60.0% ± 8.8 | -12.0 ± 23.9 | 50.4% ± 16.6 | 39.3% ± 4.1 | -11.1 ± 13.2 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.10 | 5 | 72.0% ± 33.3 | 64.2% ± 16.4 | -7.8 ± 37.0 | 52.3% ± 11.7 | 52.3% ± 3.9 | -0.1 ± 10.4 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.9 | 5 | 76.0% ± 20.8 | 73.8% ± 16.3 | -2.2 ± 18.6 | 52.9% ± 9.3 | 56.6% ± 9.1 | +3.7 ± 11.2 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | +12.0 ± 22.2 | -4.4 ± 17.0 | +11.0 ± 11.6 | -6.1 ± 7.6 |
| aw.Gilgalad 1.99.5c | +8.0 ± 33.3 | +11.6 ± 21.5 | +2.4 ± 13.6 | +8.3 ± 6.1 |
| cb.fire.Firestarter 2.0f | +12.0 ± 51.5 | -6.0 ± 31.2 | +3.9 ± 21.6 | -0.1 ± 7.7 |
| cs.Nene 1.0.5 | -8.0 ± 28.3 | -14.0 ± 18.8 | -4.1 ± 9.0 | -1.9 ± 5.0 |
| davidalves.Phoenix 1.02 | +4.0 ± 11.1 | -7.6 ± 22.7 | +3.7 ± 14.4 | -5.6 ± 6.9 |
| dsekercioglu.mega.Raven 3.56j8 | -24.0 ± 56.6 | +16.2 ± 27.5 | -9.1 ± 22.2 | +2.7 ± 9.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -8.0 ± 33.3 | +11.3 ± 12.9 | +4.4 ± 12.0 | +5.0 ± 14.8 |
| gh.GresSuffurd 0.4.13 | +4.0 ± 20.8 | +0.2 ± 23.2 | +1.7 ± 18.2 | -4.8 ± 15.4 |
| jk.mega.DrussGT 3.1.16 | -8.0 ± 22.2 | -4.4 ± 29.0 | -2.4 ± 6.4 | -6.0 ± 9.4 |
| jk.melee.Neuromancer 7.12 | -8.0 ± 45.1 | -8.0 ± 18.4 | -2.3 ± 9.0 | -1.9 ± 9.0 |
| kc.mega.BeepBoop 2.0 | +4.0 ± 11.1 | -2.0 ± 16.2 | -1.0 ± 7.1 | -1.6 ± 9.8 |
| kc.serpent.WaveSerpent 2.11 | -8.0 ± 22.2 | -6.9 ± 28.2 | -4.3 ± 9.5 | -6.7 ± 7.2 |
| lxx.Tomcat 3.68 | -0.0 ± 24.8 | -5.6 ± 22.6 | +1.1 ± 4.8 | -4.4 ± 9.5 |
| oog.mega.saguaro.Saguaro 1.0 | +0.0 ± 17.6 | -10.0 ± 19.6 | -2.3 ± 3.9 | -7.6 ± 10.7 |
| pc.Wavelet 1.5 | +8.0 ± 37.7 | -6.2 ± 17.5 | +0.9 ± 17.4 | -5.3 ± 7.7 |
| rsalesc.mega.Knight 0.6.28 | +8.0 ± 22.2 | -8.0 ± 21.0 | +7.3 ± 17.5 | +1.1 ± 6.5 |
| rsalesc.roborio.Roborio 1.2.4 | -12.0 ± 22.2 | +4.2 ± 20.8 | -0.9 ± 7.6 | -0.6 ± 8.6 |
| voidious.Diamond 1.8.22 | -4.0 ± 40.8 | -8.2 ± 19.5 | -1.2 ± 13.4 | -2.1 ± 8.5 |
| voidious.Dookious 1.573c | -4.0 ± 36.8 | +12.9 ± 12.4 | -12.3 ± 15.7 | +0.3 ± 5.0 |
| xander.cat.XanderCat 12.9 | -4.0 ± 27.2 | -9.6 ± 21.6 | -0.5 ± 8.2 | -4.3 ± 11.2 |
