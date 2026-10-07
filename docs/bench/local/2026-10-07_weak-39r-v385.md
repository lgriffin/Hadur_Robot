# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1913 over 176 battles (10.9 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 93.4% ± 0.9 | 99.3% ± 0.7 | 89.2% ± 1.3 | 556 / 560 | 78.4% ± 0.9 | 18.8% ± 3.6 | 193 | 0 | 0.56 / 12.7 |
| bbo.RamboT 0.3 | rammer | 96.1% ± 0.8 | 99.8% ± 0.4 | 94.3% ± 0.9 | 559 / 560 | 74.9% ± 1.6 | 11.7% ± 1.7 | 183 | 0 | 0.55 / 11.9 |
| PSW.Relentless 0.1 | rammer | 97.7% ± 0.4 | 100.0% ± 0.0 | 96.2% ± 0.7 | 560 / 560 | 72.8% ± 0.6 | 7.6% ± 1.6 | 182 | 0 | 0.54 / 24.7 |
| mahrgell.mahrram 1.3 | rammer | 79.8% ± 1.0 | 99.1% ± 0.9 | 71.3% ± 1.3 | 555 / 560 | 71.5% ± 1.1 | 35.8% ± 2.4 | 171 | 0 | 0.58 / 10.9 |
| sample.RamFire | rammer | 98.9% ± 0.4 | 100.0% ± 0.0 | 98.5% ± 0.6 | 560 / 560 | 70.3% ± 0.9 | 5.0% ± 2.0 | 179 | 0 | 0.52 / 11.3 |
| stelo.MirrorNano 1.4 | mirror | 92.2% ± 1.4 | 99.6% ± 0.8 | 85.4% ± 1.9 | 558 / 560 | 34.8% ± 1.1 | 5.7% ± 0.4 | 189 | 0 | 0.71 / 14.5 |
| stelo.MirrorMicro 1.1 | mirror | 92.3% ± 0.9 | 99.8% ± 0.4 | 85.8% ± 1.3 | 559 / 560 | 36.7% ± 0.7 | 6.7% ± 0.8 | 167 | 0 | 0.69 / 37.1 |
| zyx.nano.RedBull 1.0 | nano | 93.4% ± 1.0 | 99.3% ± 0.7 | 90.8% ± 1.1 | 556 / 560 | 80.7% ± 0.8 | 9.5% ± 1.3 | 159 | 0 | 0.51 / 9.4 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 84.5% ± 0.8 | 99.8% ± 0.4 | 76.9% ± 0.9 | 559 / 560 | 83.5% ± 0.5 | 77.2% ± 1.5 | 164 | 0 | 0.54 / 9.7 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.6% ± 0.6 | 96.2% ± 1.6 | 58.7% ± 0.6 | 539 / 560 | 72.5% ± 1.2 | 56.7% ± 3.9 | 170 | 0 | 0.59 / 12.2 |
| mz.NanoDeath 2.56 | nano | 66.9% ± 1.6 | 93.9% ± 2.3 | 59.6% ± 0.8 | 526 / 560 | 76.0% ± 2.1 | 52.8% ± 3.0 | 156 | 0 | 0.55 / 10.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 11 | 994 | 0 | 0.34 | 0 | 0 | 0 |
| bbo.RamboT 0.3 | 16 | 10 | 1319 | 0 | 0.33 | 1 | 0 | 0 |
| PSW.Relentless 0.1 | 16 | 14 | 366 | 0 | 0.33 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 16 | 14 | 253 | 0 | 0.31 | 0 | 0 | 0 |
| sample.RamFire | 16 | 13 | 894 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.MirrorNano 1.4 | 16 | 13 | 894 | 0 | 0.34 | 0 | 0 | 0 |
| stelo.MirrorMicro 1.1 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| zyx.nano.RedBull 1.0 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 15 | 103 | 0 | 0.29 | 0 | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 12 | 616 | 0 | 0.30 | 1 | 0 | 0 |
| mz.NanoDeath 2.56 | 16 | 14 | 299 | 0 | 0.28 | 1 | 1 | 0 |

148 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 1605 | 44 | 1563 | 1563 (97.4%) | 42 (2.6%) | 0 (0.0%) | 63 | 79 | 45 |
| bbo.RamboT 0.3 | 4553 | 29 | 4466 | 4464 (98.0%) | 89 (2.0%) | 2 (0.0%) | 940 | 377 | 104 |
| PSW.Relentless 0.1 | 968 | 24 | 956 | 955 (98.7%) | 13 (1.3%) | 1 (0.1%) | 416 | 58 | 48 |
| mahrgell.mahrram 1.3 | 5065 | 48 | 5049 | 5048 (99.7%) | 17 (0.3%) | 1 (0.0%) | 2029 | 441 | 41 |
| sample.RamFire | 70 | 11 | 69 | 68 (97.1%) | 2 (2.9%) | 1 (1.4%) | 745 | 40 | 33 |
| stelo.MirrorNano 1.4 | 6982 | 46 | 6929 | 6926 (99.2%) | 56 (0.8%) | 3 (0.0%) | 55 | 143 | 54 |
| stelo.MirrorMicro 1.1 | 6919 | 39 | 6922 | 6919 (100.0%) | 0 (0.0%) | 3 (0.0%) | 27 | 196 | 37 |
| zyx.nano.RedBull 1.0 | 3626 | 29 | 3626 | 3626 (100.0%) | 0 (0.0%) | 0 (0.0%) | 993 | 219 | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2846 | 49 | 2841 | 2840 (99.8%) | 6 (0.2%) | 1 (0.0%) | 1025 | 200 | 35 |
| demetrix.nano.SledgeHammer 0.22 | 5258 | 16 | 5222 | 5220 (99.3%) | 38 (0.7%) | 2 (0.0%) | 2794 | 412 | 51 |
| mz.NanoDeath 2.56 | 4183 | 46 | 4166 | 4164 (99.5%) | 19 (0.5%) | 2 (0.0%) | 8785 | 798 | 46 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 4218 | 7 (0.2%) | 0 |
| bbo.RamboT 0.3 | 4068 | 134 (3.3%) | 0 |
| PSW.Relentless 0.1 | 4667 | 2 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 4772 | 350 (7.3%) | 468 |
| sample.RamFire | 5552 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 7055 | 396 (5.6%) | 50 |
| stelo.MirrorMicro 1.1 | 6965 | 392 (5.6%) | 0 |
| zyx.nano.RedBull 1.0 | 3575 | 97 (2.7%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4442 | 80 (1.8%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 5285 | 220 (4.2%) | 0 |
| mz.NanoDeath 2.56 | 4300 | 78 (1.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 196 | 469 | 137 | 97.3 / 11.9 | 3496 | 3457 | 405 |
| bbo.RamboT 0.3 | 650 | 239 | 400 | 137 | 91.3 / 5.6 | 3539 | 4487 | 96 |
| PSW.Relentless 0.1 | 650 | 264 | 447 | 150 | 95.7 / 3.8 | 3706 | 2134 | 426 |
| mahrgell.mahrram 1.3 | 650 | 183 | 603 | 154 | 100.5 / 40.7 | 4111 | 4605 | 97 |
| sample.RamFire | 650 | 361 | 650 | 173 | 99.3 / 1.5 | 3394 | 167 | 1 |
| stelo.MirrorNano 1.4 | 650 | 498 | 400 | 226 | 69.1 / 11.8 | 5254 | 6907 | 2258 |
| stelo.MirrorMicro 1.1 | 650 | 498 | 400 | 216 | 73.0 / 12.2 | 5307 | 4629 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 179 | 400 | 120 | 87.0 / 8.8 | 3042 | 4417 | 131 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 189 | 650 | 143 | 109.1 / 32.9 | 3772 | 4070 | 288 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 152 | 650 | 168 | 112.5 / 79.4 | 4683 | 3686 | 258 |
| mz.NanoDeath 2.56 | 650 | 152 | 650 | 141 | 95.1 / 64.9 | 3753 | 4530 | 181 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 18.8% | 193 | 44 | 3 | 2.6 | 6 / 7 (86%) | 0 | 0 |
| bbo.RamboT 0.3 | 11.7% | 183 | 40 | 3 | 7.9 | 133 / 134 (99%) | 0 | 0 |
| PSW.Relentless 0.1 | 7.6% | 182 | 48 | 3 | 1.6 | 2 / 2 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 35.8% | 171 | 42 | 3 | 8.8 | 347 / 350 (99%) | 0 | 0 |
| sample.RamFire | 5.0% | 179 | 49 | 3 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.7% | 189 | 65 | 3 | 11.9 | 391 / 396 (99%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.7% | 167 | 69 | 3 | 12.4 | 392 / 392 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 9.5% | 159 | 40 | 3 | 6.5 | 97 / 97 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 77.2% | 164 | 47 | 3 | 4.7 | 79 / 80 (99%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 56.7% | 170 | 50 | 3 | 9.2 | 220 / 220 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 52.8% | 156 | 47 | 3 | 7.1 | 78 / 78 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | vort.Chaser | 1 | 35 | 280 | 29.9% | 3.3% ± 4.3 | 44.7% | 18.2% / 18.1% | 1.6% | 0 / 0 | T?/M? | 94% |
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 272 | 17.0% | 3.1% ± 2.3 | 41.4% | 21.7% / 23.6% | 8.9% | 0 / 0 | T1/M? | 95% |
| PSW.Relentless 0.1 | PSW.Relentless | 1 | 35 | 288 | 23.2% | 1.7% ± 5.5 | 42.9% | 28.8% / 28.4% | 3.6% | 0 / 0 | T?/M? | 97% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 36.8% | 9.0% ± 3.4 | 43.3% | 15.8% / 15.8% | 4.8% | 0 / 0 | T?/M? | 80% |
| sample.RamFire | sample.RamFire | 1 | 35 | 280 | 137.5% | 2.4% ± 21.8 | 42.7% | 53.4% / 53.3% | 42.0% | 0 / 0 | T?/M? | 97% |
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 296 | 6.7% | 8.7% ± 2.9 | 25.6% | 30.0% / 30.4% | 3.4% | 0 / 0 | T3/M? | 91% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 300 | 8.2% | 9.2% ± 2.8 | 25.6% | 26.7% / 24.2% | 1.5% | 0 / 0 | T3/M? | 91% |
| zyx.nano.RedBull 1.0 | zyx.nano.RedBull | 1 | 35 | 296 | 19.2% | 3.4% ± 2.7 | 44.4% | 12.6% / 12.5% | 5.3% | 0 / 0 | T1/M? | 88% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 330 | 89.0% | 8.4% ± 4.3 | 47.5% | 14.5% / 14.6% | 8.0% | 0 / 0 | T?/M? | 82% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 338 | 59.1% | 12.2% ± 3.6 | 47.5% | 10.8% / 10.3% | 5.1% | 0 / 0 | T?/M? | 65% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 55.5% | 3.9% ± 2.9 | 38.6% | 8.6% / 8.9% | 28.1% | 0 / 0 | T1/M? | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| vort.Chaser 0.0.3 | 93.4% ± 0.9 | 94.2% ± 1.0 | -0.8 ± 1.3 |
| bbo.RamboT 0.3 | 96.1% ± 0.8 | 96.9% ± 0.5 | -0.8 ± 0.6 |
| PSW.Relentless 0.1 | 97.7% ± 0.4 | 98.5% ± 0.3 | -0.8 ± 0.4 |
| mahrgell.mahrram 1.3 | 79.8% ± 1.0 | 80.1% ± 1.0 | -0.3 ± 1.2 |
| sample.RamFire | 98.9% ± 0.4 | 99.5% ± 0.3 | -0.6 ± 0.3 |
| stelo.MirrorNano 1.4 | 92.2% ± 1.4 | 91.0% ± 2.1 | +1.2 ± 2.7 |
| stelo.MirrorMicro 1.1 | 92.3% ± 0.9 | 85.9% ± 8.4 | +6.4 ± 8.7 |
| zyx.nano.RedBull 1.0 | 93.4% ± 1.0 | 94.2% ± 0.9 | -0.8 ± 1.3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 84.5% ± 0.8 | 85.1% ± 0.6 | -0.6 ± 1.0 |
| demetrix.nano.SledgeHammer 0.22 | 68.6% ± 0.6 | 68.5% ± 0.8 | +0.0 ± 1.1 |
| mz.NanoDeath 2.56 | 66.9% ± 1.6 | 69.0% ± 1.1 | -2.1 ± 1.9 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| vort.Chaser 0.0.3 | -0.8 ± 1.3 | +0.4 ± 0.8 | +0.4 ± 0.8 | -1.6 ± 1.8 |
| bbo.RamboT 0.3 | -0.8 ± 0.6 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.0 ± 0.7 |
| PSW.Relentless 0.1 | -0.8 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.4 ± 0.7 |
| mahrgell.mahrram 1.3 | -0.3 ± 1.2 | -0.2 ± 1.3 | -0.2 ± 1.3 | +0.1 ± 1.4 |
| sample.RamFire | -0.6 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 0.4 |
| stelo.MirrorNano 1.4 | +1.2 ± 2.7 | +0.2 ± 1.4 | +0.2 ± 1.4 | +1.9 ± 4.0 |
| stelo.MirrorMicro 1.1 | +6.4 ± 8.7 | +4.3 ± 5.0 | +4.3 ± 5.0 | +8.1 ± 11.5 |
| zyx.nano.RedBull 1.0 | -0.8 ± 1.3 | +0.2 ± 0.9 | +0.2 ± 0.9 | -1.0 ± 1.6 |
| bwbaugh.nano.Tirunculus 0.0.0a | -0.6 ± 1.0 | -0.2 ± 0.4 | -0.2 ± 0.4 | -0.4 ± 1.2 |
| demetrix.nano.SledgeHammer 0.22 | +0.0 ± 1.1 | +1.1 ± 2.6 | +1.1 ± 2.6 | +0.2 ± 0.7 |
| mz.NanoDeath 2.56 | -2.1 ± 1.9 | -0.0 ± 2.6 | +0.0 ± 2.6 | +0.3 ± 0.7 |
| All pairs | +0.1 ± 0.9 | +0.5 ± 0.6 | +0.5 ± 0.6 | +0.4 ± 1.1 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 6 | -0.8 ± 1.3 | -1.3 ± 1.6 |
| bbo.RamboT 0.3 | 16 | 8 | -0.8 ± 0.6 | -1.1 ± 0.9 |
| PSW.Relentless 0.1 | 16 | 13 | -0.8 ± 0.4 | -0.9 ± 0.5 |
| mahrgell.mahrram 1.3 | 16 | 13 | -0.3 ± 1.2 | -0.4 ± 1.1 |
| sample.RamFire | 16 | 13 | -0.6 ± 0.3 | -0.7 ± 0.3 |
| stelo.MirrorNano 1.4 | 16 | 12 | +1.2 ± 2.7 | +1.3 ± 3.8 |
| stelo.MirrorMicro 1.1 | 16 | 12 | +6.4 ± 8.7 | -1.2 ± 1.2 |
| zyx.nano.RedBull 1.0 | 16 | 11 | -0.8 ± 1.3 | -1.2 ± 1.2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14 | -0.6 ± 1.0 | -0.4 ± 1.0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 11 | +0.0 ± 1.1 | -0.1 ± 1.1 |
| mz.NanoDeath 2.56 | 16 | 12 | -2.1 ± 1.9 | -2.1 ± 2.2 |
| All pairs | 176 | 125 | +0.1 ± 0.9 | -0.7 ± 0.5 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1910 over 176 battles (10.9 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 94.2% ± 1.0 | 98.9% ± 0.8 | 90.8% ± 1.2 | 554 / 560 | 79.3% ± 1.0 | 17.6% ± 5.2 | 192 | 0 | 0.55 / 9.4 |
| bbo.RamboT 0.3 | rammer | 96.9% ± 0.5 | 99.8% ± 0.4 | 95.3% ± 0.6 | 559 / 560 | 74.5% ± 1.1 | 10.0% ± 1.2 | 183 | 0 | 0.55 / 12.7 |
| PSW.Relentless 0.1 | rammer | 98.5% ± 0.3 | 100.0% ± 0.0 | 97.5% ± 0.5 | 560 / 560 | 72.5% ± 1.0 | 4.9% ± 0.8 | 186 | 0 | 0.54 / 11.1 |
| mahrgell.mahrram 1.3 | rammer | 80.1% ± 1.0 | 99.3% ± 0.9 | 71.2% ± 1.0 | 556 / 560 | 72.0% ± 1.1 | 36.7% ± 3.3 | 172 | 0 | 0.57 / 12.6 |
| sample.RamFire | rammer | 99.5% ± 0.3 | 100.0% ± 0.0 | 99.4% ± 0.4 | 560 / 560 | 69.9% ± 1.2 | 1.8% ± 1.0 | 172 | 0 | 0.52 / 10.9 |
| stelo.MirrorNano 1.4 | mirror | 91.0% ± 2.1 | 99.5% ± 1.1 | 83.5% ± 3.1 | 557 / 560 | 35.0% ± 1.5 | 6.2% ± 0.5 | 179 | 0 | 0.73 / 112.6 |
| stelo.MirrorMicro 1.1 | mirror | 85.9% ± 8.4 | 95.5% ± 5.0 | 77.7% ± 11.0 | 535 / 560 | 33.9% ± 4.1 | 6.6% ± 0.6 | 161 | 0 | 0.69 / 19.1 |
| zyx.nano.RedBull 1.0 | nano | 94.2% ± 0.9 | 99.1% ± 0.7 | 91.9% ± 0.9 | 555 / 560 | 80.0% ± 0.7 | 10.9% ± 3.3 | 163 | 0 | 0.51 / 10.3 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 85.1% ± 0.6 | 100.0% ± 0.0 | 77.3% ± 0.7 | 560 / 560 | 83.5% ± 0.5 | 75.3% ± 2.3 | 180 | 0 | 0.53 / 20.4 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.5% ± 0.8 | 95.2% ± 1.5 | 58.5% ± 0.5 | 533 / 560 | 72.9% ± 1.2 | 57.6% ± 4.1 | 161 | 0 | 0.61 / 12.7 |
| mz.NanoDeath 2.56 | nano | 69.0% ± 1.1 | 93.9% ± 1.9 | 59.3% ± 0.7 | 526 / 560 | 72.5% ± 1.3 | 51.3% ± 1.9 | 161 | 0 | 0.57 / 20.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 8 | 1533 | 0 | 0.34 | 1 | 0 | 0 |
| bbo.RamboT 0.3 | 16 | 10 | 1319 | 0 | 0.33 | 1 | 0 | 0 |
| PSW.Relentless 0.1 | 16 | 14 | 366 | 0 | 0.33 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 16 | 15 | 174 | 0 | 0.31 | 0 | 0 | 0 |
| sample.RamFire | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| stelo.MirrorNano 1.4 | 16 | 15 | 227 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.MirrorMicro 1.1 | 16 | 12 | 298 | 0 | 0.29 | 3 | 3 | 0 |
| zyx.nano.RedBull 1.0 | 16 | 11 | 1050 | 0 | 0.29 | 0 | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 15 | 68 | 0 | 0.32 | 0 | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 13 | 412 | 0 | 0.29 | 2 | 1 | 0 |
| mz.NanoDeath 2.56 | 16 | 14 | 172 | 0 | 0.29 | 1 | 1 | 0 |

143 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 1570 | 37 | 1507 | 1507 (96.0%) | 63 (4.0%) | 0 (0.0%) | 67 | 69 | 50 |
| bbo.RamboT 0.3 | 4621 | 26 | 4538 | 4532 (98.1%) | 89 (1.9%) | 6 (0.1%) | 565 | 313 | 99 |
| PSW.Relentless 0.1 | 924 | 26 | 914 | 913 (98.8%) | 11 (1.2%) | 1 (0.1%) | 327 | 56 | 42 |
| mahrgell.mahrram 1.3 | 5059 | 38 | 5048 | 5047 (99.8%) | 12 (0.2%) | 1 (0.0%) | 1690 | 399 | 44 |
| sample.RamFire | 28 | 5 | 29 | 28 (100.0%) | 0 (0.0%) | 1 (3.4%) | 295 | 16 | 43 |
| stelo.MirrorNano 1.4 | 7126 | 33 | 7112 | 7110 (99.8%) | 16 (0.2%) | 2 (0.0%) | 77 | 156 | 57 |
| stelo.MirrorMicro 1.1 | 10190 | 31 | 10474 | 10168 (99.8%) | 22 (0.2%) | 306 (2.9%) | 30 | 217 | 39 |
| zyx.nano.RedBull 1.0 | 3729 | 31 | 3664 | 3664 (98.3%) | 65 (1.7%) | 0 (0.0%) | 607 | 194 | 48 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2850 | 39 | 2846 | 2846 (99.9%) | 4 (0.1%) | 0 (0.0%) | 605 | 176 | 55 |
| demetrix.nano.SledgeHammer 0.22 | 5356 | 13 | 5333 | 5330 (99.5%) | 26 (0.5%) | 3 (0.1%) | 1428 | 312 | 46 |
| mz.NanoDeath 2.56 | 5125 | 24 | 5115 | 5115 (99.8%) | 10 (0.2%) | 0 (0.0%) | 1469 | 307 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 4131 | 6 (0.1%) | 0 |
| bbo.RamboT 0.3 | 4123 | 114 (2.8%) | 0 |
| PSW.Relentless 0.1 | 4652 | 2 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 4764 | 344 (7.2%) | 1502 |
| sample.RamFire | 5484 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 6987 | 361 (5.2%) | 88 |
| stelo.MirrorMicro 1.1 | 6415 | 337 (5.3%) | 326 |
| zyx.nano.RedBull 1.0 | 3647 | 109 (3.0%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4496 | 83 (1.8%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 5364 | 223 (4.2%) | 0 |
| mz.NanoDeath 2.56 | 5176 | 140 (2.7%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 195 | 402 | 135 | 96.1 / 9.8 | 3385 | 3712 | 368 |
| bbo.RamboT 0.3 | 650 | 243 | 400 | 139 | 91.3 / 4.5 | 3539 | 4744 | 97 |
| PSW.Relentless 0.1 | 650 | 260 | 411 | 150 | 95.4 / 2.4 | 3749 | 2104 | 420 |
| mahrgell.mahrram 1.3 | 650 | 180 | 578 | 154 | 101.2 / 41.1 | 4155 | 4966 | 52 |
| sample.RamFire | 650 | 371 | 650 | 173 | 99.7 / 0.6 | 3564 | 46 | 0 |
| stelo.MirrorNano 1.4 | 650 | 496 | 400 | 229 | 69.2 / 13.5 | 5194 | 6936 | 2327 |
| stelo.MirrorMicro 1.1 | 650 | 500 | 447 | 328 | 64.6 / 17.6 | 4600 | 7744 | 44 |
| zyx.nano.RedBull 1.0 | 650 | 189 | 400 | 122 | 86.5 / 7.7 | 3023 | 4695 | 123 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 192 | 650 | 145 | 110.1 / 32.5 | 3780 | 4558 | 281 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 152 | 650 | 171 | 115.5 / 82.2 | 4806 | 3983 | 134 |
| mz.NanoDeath 2.56 | 650 | 161 | 650 | 166 | 111.8 / 77.0 | 4632 | 5586 | 385 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 17.6% | 192 | 41 | 3 | 2.6 | 6 / 6 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 10.0% | 183 | 35 | 3 | 8.1 | 111 / 114 (97%) | 0 | 0 |
| PSW.Relentless 0.1 | 4.9% | 186 | 50 | 3 | 1.6 | 2 / 2 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 36.7% | 172 | 46 | 3 | 8.9 | 344 / 344 (100%) | 0 | 0 |
| sample.RamFire | 1.8% | 172 | 41 | 3 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 6.2% | 179 | 60 | 3 | 11.9 | 358 / 361 (99%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.6% | 161 | 482 | 3 | 11.7 | 329 / 337 (98%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 10.9% | 163 | 47 | 3 | 6.5 | 109 / 109 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 75.3% | 180 | 53 | 3 | 4.8 | 83 / 83 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 57.6% | 161 | 50 | 3 | 9.4 | 223 / 223 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 51.3% | 161 | 44 | 3 | 9.0 | 139 / 140 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| PSW.Relentless 0.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.9% ± 2.3 | 97.5% ± 1.0 | +14.6 ± 2.8 |
| PSW.Relentless 0.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.0% ± 2.6 | 97.6% ± 0.7 | +9.7 ± 2.5 |
| bbo.RamboT 0.3 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 80.7% ± 4.0 | 95.2% ± 1.0 | +14.5 ± 4.0 |
| bbo.RamboT 0.3 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 86.1% ± 3.4 | 95.5% ± 1.1 | +9.4 ± 3.9 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 69.5% ± 2.7 | 75.0% ± 1.6 | +5.6 ± 2.8 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 70.9% ± 2.1 | 75.6% ± 1.7 | +4.7 ± 3.0 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.9 | 16 | 83.4% ± 5.9 | 98.8% ± 1.8 | +15.3 ± 6.0 | 54.4% ± 2.1 | 56.2% ± 1.1 | +1.8 ± 2.3 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.8.5 | 16 | 89.7% ± 6.9 | 94.9% ± 3.6 | +5.2 ± 7.8 | 54.3% ± 1.8 | 55.7% ± 0.6 | +1.4 ± 1.8 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.9 | 16 | 92.5% ± 7.7 | 100.0% ± 0.0 | +7.5 ± 7.7 | 62.9% ± 2.0 | 69.7% ± 2.1 | +6.8 ± 2.7 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.8.5 | 16 | 96.2% ± 5.8 | 100.0% ± 0.0 | +3.8 ± 5.8 | 66.7% ± 2.8 | 69.8% ± 1.5 | +3.1 ± 2.8 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.9 | 16 | 90.0% ± 7.8 | 95.4% ± 4.7 | +5.4 ± 6.7 | 55.0% ± 1.7 | 58.7% ± 2.1 | +3.8 ± 2.6 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.8.5 | 16 | 91.3% ± 6.7 | 95.6% ± 3.4 | +4.4 ± 6.4 | 55.7% ± 1.5 | 56.6% ± 1.6 | +0.9 ± 2.0 |
| sample.RamFire | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.7% ± 3.6 | 100.0% ± 0.0 | +7.3 ± 3.6 |
| sample.RamFire | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 95.3% ± 2.5 | 100.0% ± 0.0 | +4.7 ± 2.5 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.7% ± 1.7 | 82.8% ± 2.8 | -1.8 ± 3.3 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 95.3% ± 5.6 | -4.7 ± 5.6 | 80.7% ± 4.3 | 69.1% ± 16.9 | -11.6 ± 16.3 |
| stelo.MirrorNano 1.4 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 98.8% ± 2.7 | -1.2 ± 2.7 | 81.0% ± 4.0 | 80.8% ± 6.8 | -0.3 ± 7.3 |
| stelo.MirrorNano 1.4 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 76.9% ± 3.1 | 78.9% ± 10.1 | +2.0 ± 12.0 |
| vort.Chaser 0.0.3 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 100.0% ± 0.0 | +5.0 ± 4.8 | 68.5% ± 2.5 | 92.1% ± 2.3 | +23.6 ± 3.8 |
| vort.Chaser 0.0.3 | hadur2.Hadur 3.8.5 | 16 | 92.5% ± 5.3 | 100.0% ± 0.0 | +7.5 ± 5.3 | 75.4% ± 4.4 | 91.2% ± 1.7 | +15.8 ± 5.2 |
| zyx.nano.RedBull 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 79.9% ± 3.7 | 88.4% ± 2.8 | +8.5 ± 4.5 |
| zyx.nano.RedBull 1.0 | hadur2.Hadur 3.8.5 | 16 | 92.5% ± 5.3 | 100.0% ± 0.0 | +7.5 ± 5.3 | 80.9% ± 4.2 | 89.7% ± 1.8 | +8.8 ± 4.7 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| PSW.Relentless 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -5.1 ± 2.9 | -0.1 ± 1.3 |
| bbo.RamboT 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -5.3 ± 3.2 | -0.3 ± 1.1 |
| bwbaugh.nano.Tirunculus 0.0.0a | -1.2 ± 2.7 | +0.0 ± 0.0 | -1.4 ± 2.8 | -0.5 ± 1.9 |
| demetrix.nano.SledgeHammer 0.22 | -6.2 ± 5.1 | +3.9 ± 4.5 | +0.1 ± 2.1 | +0.5 ± 1.4 |
| mahrgell.mahrram 1.3 | -3.8 ± 8.9 | +0.0 ± 0.0 | -3.7 ± 4.0 | -0.1 ± 2.4 |
| mz.NanoDeath 2.56 | -1.3 ± 10.6 | -0.2 ± 5.9 | -0.8 ± 1.9 | +2.1 ± 2.3 |
| sample.RamFire | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.7 ± 2.8 | +0.0 ± 0.0 |
| stelo.MirrorMicro 1.1 | +0.0 ± 0.0 | +4.7 ± 5.6 | +4.0 ± 4.0 | +13.8 ± 17.6 |
| stelo.MirrorNano 1.4 | +0.0 ± 0.0 | -0.6 ± 3.1 | +4.1 ± 5.4 | +1.9 ± 13.0 |
| vort.Chaser 0.0.3 | +2.5 ± 5.3 | +0.0 ± 0.0 | -6.9 ± 4.1 | +0.9 ± 3.2 |
| zyx.nano.RedBull 1.0 | +3.7 ± 5.8 | +0.0 ± 0.0 | -1.0 ± 4.1 | -1.4 ± 2.8 |
