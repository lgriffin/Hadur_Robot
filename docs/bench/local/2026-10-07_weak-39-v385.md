# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1900 over 176 battles (10.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 93.3% ± 1.1 | 99.1% ± 0.7 | 89.1% ± 1.4 | 555 / 560 | 78.8% ± 0.9 | 16.5% ± 1.7 | 193 | 0 | 0.55 / 12.3 |
| bbo.RamboT 0.3 | rammer | 96.4% ± 0.7 | 99.8% ± 0.4 | 94.7% ± 0.8 | 559 / 560 | 74.8% ± 1.2 | 11.3% ± 1.9 | 178 | 0 | 0.57 / 10.9 |
| PSW.Relentless 0.1 | rammer | 97.4% ± 0.4 | 100.0% ± 0.0 | 95.8% ± 0.7 | 560 / 560 | 72.6% ± 0.7 | 8.6% ± 1.7 | 185 | 0 | 0.54 / 40.7 |
| mahrgell.mahrram 1.3 | rammer | 79.1% ± 1.2 | 99.1% ± 0.9 | 70.5% ± 1.1 | 555 / 560 | 71.0% ± 1.0 | 38.7% ± 4.2 | 182 | 0 | 0.57 / 13.2 |
| sample.RamFire | rammer | 98.5% ± 0.8 | 99.8% ± 0.4 | 98.0% ± 1.0 | 559 / 560 | 70.9% ± 1.6 | 5.8% ± 3.1 | 179 | 0 | 0.53 / 11.5 |
| stelo.MirrorNano 1.4 | mirror | 91.1% ± 3.4 | 98.8% ± 2.0 | 84.2% ± 4.7 | 553 / 560 | 34.5% ± 1.9 | 5.3% ± 0.6 | 174 | 0 | 0.70 / 17.1 |
| stelo.MirrorMicro 1.1 | mirror | 80.8% ± 11.9 | 93.8% ± 6.2 | 69.8% ± 16.5 | 525 / 560 | 30.8% ± 6.1 | 7.2% ± 0.7 | 169 | 0 | 0.71 / 118.2 |
| zyx.nano.RedBull 1.0 | nano | 94.0% ± 1.0 | 99.6% ± 0.5 | 91.4% ± 1.2 | 558 / 560 | 80.8% ± 0.7 | 9.1% ± 1.4 | 155 | 0 | 0.51 / 12.7 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 84.3% ± 0.6 | 99.8% ± 0.4 | 76.7% ± 0.8 | 559 / 560 | 83.0% ± 0.4 | 76.9% ± 2.7 | 177 | 0 | 0.50 / 11.0 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.5% ± 0.8 | 96.2% ± 1.5 | 58.9% ± 0.6 | 539 / 560 | 73.6% ± 1.6 | 56.9% ± 3.4 | 160 | 0 | 0.57 / 11.0 |
| mz.NanoDeath 2.56 | nano | 67.2% ± 1.6 | 92.7% ± 2.2 | 59.6% ± 0.8 | 519 / 560 | 74.9% ± 2.1 | 51.5% ± 1.8 | 148 | 0 | 0.55 / 24.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 9 | 1345 | 0 | 0.34 | 2 | 0 | 0 |
| bbo.RamboT 0.3 | 16 | 12 | 874 | 0 | 0.32 | 1 | 0 | 0 |
| PSW.Relentless 0.1 | 16 | 12 | 1098 | 0 | 0.33 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 16 | 13 | 519 | 0 | 0.33 | 0 | 0 | 0 |
| sample.RamFire | 16 | 14 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.MirrorNano 1.4 | 16 | 14 | 298 | 0 | 0.31 | 2 | 2 | 0 |
| stelo.MirrorMicro 1.1 | 16 | 13 | 298 | 0 | 0.30 | 2 | 2 | 0 |
| zyx.nano.RedBull 1.0 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 15 | 91 | 0 | 0.32 | 0 | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 13 | 378 | 0 | 0.29 | 1 | 0 | 0 |
| mz.NanoDeath 2.56 | 16 | 14 | 0 | 0 | 0.26 | 2 | 1 | 0 |

145 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 1604 | 42 | 1553 | 1553 (96.8%) | 51 (3.2%) | 0 (0.0%) | 62 | 66 | 39 |
| bbo.RamboT 0.3 | 4538 | 30 | 4480 | 4476 (98.6%) | 62 (1.4%) | 4 (0.1%) | 910 | 372 | 102 |
| PSW.Relentless 0.1 | 969 | 29 | 945 | 945 (97.5%) | 24 (2.5%) | 0 (0.0%) | 402 | 66 | 52 |
| mahrgell.mahrram 1.3 | 5134 | 38 | 5100 | 5100 (99.3%) | 34 (0.7%) | 0 (0.0%) | 2173 | 427 | 43 |
| sample.RamFire | 84 | 14 | 82 | 81 (96.4%) | 3 (3.6%) | 1 (1.2%) | 848 | 43 | 346 |
| stelo.MirrorNano 1.4 | 7323 | 31 | 7307 | 7303 (99.7%) | 20 (0.3%) | 4 (0.1%) | 43 | 179 | 44 |
| stelo.MirrorMicro 1.1 | 13318 | 34 | 13713 | 13295 (99.8%) | 23 (0.2%) | 418 (3.0%) | 38 | 211 | 49 |
| zyx.nano.RedBull 1.0 | 3627 | 24 | 3627 | 3627 (100.0%) | 0 (0.0%) | 0 (0.0%) | 974 | 212 | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2859 | 50 | 2855 | 2853 (99.8%) | 6 (0.2%) | 2 (0.1%) | 1023 | 216 | 42 |
| demetrix.nano.SledgeHammer 0.22 | 5065 | 22 | 5044 | 5041 (99.5%) | 24 (0.5%) | 3 (0.1%) | 3648 | 460 | 48 |
| mz.NanoDeath 2.56 | 4490 | 29 | 4493 | 4490 (100.0%) | 0 (0.0%) | 3 (0.1%) | 6547 | 620 | 37 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 4167 | 1 (0.0%) | 0 |
| bbo.RamboT 0.3 | 4054 | 138 (3.4%) | 0 |
| PSW.Relentless 0.1 | 4714 | 4 (0.1%) | 0 |
| mahrgell.mahrram 1.3 | 4833 | 348 (7.2%) | 702 |
| sample.RamFire | 5534 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 6838 | 326 (4.8%) | 147 |
| stelo.MirrorMicro 1.1 | 6160 | 335 (5.4%) | 536 |
| zyx.nano.RedBull 1.0 | 3572 | 91 (2.5%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4485 | 90 (2.0%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 5093 | 192 (3.8%) | 236 |
| mz.NanoDeath 2.56 | 4547 | 107 (2.4%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 199 | 472 | 136 | 97.1 / 12.0 | 3444 | 3685 | 369 |
| bbo.RamboT 0.3 | 650 | 244 | 400 | 137 | 91.3 / 5.1 | 3522 | 4487 | 134 |
| PSW.Relentless 0.1 | 650 | 266 | 438 | 152 | 95.9 / 4.2 | 3703 | 2269 | 357 |
| mahrgell.mahrram 1.3 | 650 | 180 | 594 | 155 | 100.7 / 42.3 | 4143 | 4492 | 69 |
| sample.RamFire | 650 | 359 | 650 | 173 | 99.3 / 2.0 | 3367 | 167 | 0 |
| stelo.MirrorNano 1.4 | 650 | 500 | 400 | 235 | 67.6 / 12.5 | 5025 | 6835 | 2458 |
| stelo.MirrorMicro 1.1 | 650 | 503 | 463 | 429 | 59.1 / 22.6 | 4273 | 10473 | 78 |
| zyx.nano.RedBull 1.0 | 650 | 182 | 400 | 120 | 86.7 / 8.3 | 3029 | 4521 | 132 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 191 | 650 | 145 | 109.3 / 33.4 | 3816 | 4046 | 262 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 151 | 650 | 163 | 110.3 / 77.3 | 4554 | 3656 | 130 |
| mz.NanoDeath 2.56 | 650 | 152 | 650 | 148 | 100.4 / 68.4 | 4037 | 4920 | 171 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16.5% | 193 | 35 | 3 | 2.6 | 1 / 1 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 11.3% | 178 | 41 | 3 | 7.9 | 138 / 138 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 8.6% | 185 | 48 | 3 | 1.6 | 4 / 4 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 38.7% | 182 | 50 | 3 | 8.9 | 345 / 348 (99%) | 0 | 0 |
| sample.RamFire | 5.8% | 179 | 48 | 3 | 0.1 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.3% | 174 | 57 | 3 | 11.7 | 323 / 326 (99%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 7.2% | 169 | 514 | 3 | 11.4 | 331 / 335 (99%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 9.1% | 155 | 43 | 3 | 6.5 | 91 / 91 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 76.9% | 177 | 36 | 3 | 4.8 | 88 / 90 (98%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 56.9% | 160 | 51 | 3 | 8.8 | 192 / 192 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 51.5% | 148 | 55 | 3 | 7.8 | 107 / 107 (100%) | 0 | 0 |

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
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 272 | 11.4% | 1.9% ± 1.9 | 43.0% | 26.8% / 29.0% | 12.0% | 0 / 0 | T0/M? | 97% |
| PSW.Relentless 0.1 | PSW.Relentless | 1 | 35 | 288 | 23.2% | 1.7% ± 5.5 | 42.9% | 28.8% / 28.4% | 3.6% | 0 / 0 | T?/M? | 97% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 44.6% | 9.7% ± 3.3 | 41.3% | 12.6% / 12.0% | 4.7% | 0 / 0 | T?/M? | 76% |
| sample.RamFire | sample.RamFire | 1 | 35 | 280 | 80.0% | 2.3% ± 27.7 | 40.4% | 52.1% / 53.0% | 44.0% | 0 / 0 | T?/M? | 99% |
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 296 | 6.7% | 8.6% ± 2.9 | 25.8% | 32.7% / 26.0% | 3.2% | 0 / 0 | T3/M? | 92% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 300 | 7.9% | 9.4% ± 3.0 | 26.8% | 33.0% / 27.8% | 1.2% | 0 / 0 | T3/M? | 92% |
| zyx.nano.RedBull 1.0 | zyx.nano.RedBull | 1 | 35 | 296 | 11.6% | 2.7% ± 2.4 | 41.8% | 17.3% / 17.0% | 2.8% | 0 / 0 | T1/M? | 94% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 330 | 92.2% | 8.2% ± 4.4 | 48.6% | 15.4% / 15.4% | 8.4% | 0 / 0 | T?/M? | 82% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 338 | 52.0% | 5.2% ± 3.0 | 39.8% | 10.9% / 11.1% | 23.2% | 0 / 0 | T2/M? | 71% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 62.3% | 13.8% ± 4.0 | 48.7% | 11.7% / 10.5% | 6.2% | 0 / 0 | T?/M? | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| vort.Chaser 0.0.3 | 93.3% ± 1.1 | 94.1% ± 0.9 | -0.8 ± 1.2 |
| bbo.RamboT 0.3 | 96.4% ± 0.7 | 97.0% ± 0.7 | -0.6 ± 1.0 |
| PSW.Relentless 0.1 | 97.4% ± 0.4 | 98.5% ± 0.4 | -1.1 ± 0.5 |
| mahrgell.mahrram 1.3 | 79.1% ± 1.2 | 79.6% ± 1.0 | -0.5 ± 1.9 |
| sample.RamFire | 98.5% ± 0.8 | 99.6% ± 0.3 | -1.1 ± 0.8 |
| stelo.MirrorNano 1.4 | 91.1% ± 3.4 | 92.1% ± 2.1 | -1.0 ± 4.1 |
| stelo.MirrorMicro 1.1 | 80.8% ± 11.9 | 82.2% ± 8.6 | -1.5 ± 12.0 |
| zyx.nano.RedBull 1.0 | 94.0% ± 1.0 | 93.8% ± 0.9 | +0.1 ± 1.5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 84.3% ± 0.6 | 84.8% ± 0.6 | -0.5 ± 0.7 |
| demetrix.nano.SledgeHammer 0.22 | 68.5% ± 0.8 | 68.6% ± 0.8 | -0.1 ± 1.1 |
| mz.NanoDeath 2.56 | 67.2% ± 1.6 | 67.9% ± 1.4 | -0.7 ± 2.1 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| vort.Chaser 0.0.3 | -0.8 ± 1.2 | +0.0 ± 0.8 | +0.0 ± 0.8 | -1.3 ± 1.5 |
| bbo.RamboT 0.3 | -0.6 ± 1.0 | +0.0 ± 0.6 | +0.0 ± 0.6 | -0.6 ± 1.1 |
| PSW.Relentless 0.1 | -1.1 ± 0.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.8 ± 0.8 |
| mahrgell.mahrram 1.3 | -0.5 ± 1.9 | +0.0 ± 1.4 | +0.0 ± 1.4 | -0.3 ± 1.9 |
| sample.RamFire | -1.1 ± 0.8 | -0.2 ± 0.4 | -0.2 ± 0.4 | -1.4 ± 0.9 |
| stelo.MirrorNano 1.4 | -1.0 ± 4.1 | -0.5 ± 2.6 | -0.5 ± 2.6 | -1.3 ± 5.5 |
| stelo.MirrorMicro 1.1 | -1.5 ± 12.0 | -1.2 ± 6.2 | -1.2 ± 6.2 | -1.7 ± 16.7 |
| zyx.nano.RedBull 1.0 | +0.1 ± 1.5 | +0.0 ± 0.8 | +0.0 ± 0.8 | +0.8 ± 2.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | -0.5 ± 0.7 | +0.2 ± 0.7 | +0.2 ± 0.7 | -0.3 ± 1.0 |
| demetrix.nano.SledgeHammer 0.22 | -0.1 ± 1.1 | +2.0 ± 2.1 | +2.0 ± 2.1 | +0.1 ± 0.7 |
| mz.NanoDeath 2.56 | -0.7 ± 2.1 | +0.7 ± 4.3 | +0.7 ± 4.3 | +0.8 ± 1.0 |
| All pairs | -0.7 ± 1.1 | +0.1 ± 0.7 | +0.1 ± 0.7 | -0.6 ± 1.5 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 7 | -0.8 ± 1.2 | -0.9 ± 0.6 |
| bbo.RamboT 0.3 | 16 | 11 | -0.6 ± 1.0 | -0.6 ± 0.9 |
| PSW.Relentless 0.1 | 16 | 9 | -1.1 ± 0.5 | -0.9 ± 0.6 |
| mahrgell.mahrram 1.3 | 16 | 9 | -0.5 ± 1.9 | -0.1 ± 1.6 |
| sample.RamFire | 16 | 12 | -1.1 ± 0.8 | -0.7 ± 0.4 |
| stelo.MirrorNano 1.4 | 16 | 9 | -1.0 ± 4.1 | -0.1 ± 1.1 |
| stelo.MirrorMicro 1.1 | 16 | 11 | -1.5 ± 12.0 | +3.1 ± 8.5 |
| zyx.nano.RedBull 1.0 | 16 | 14 | +0.1 ± 1.5 | -0.4 ± 1.3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 12 | -0.5 ± 0.7 | -0.5 ± 1.0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 10 | -0.1 ± 1.1 | -0.3 ± 1.3 |
| mz.NanoDeath 2.56 | 16 | 12 | -0.7 ± 2.1 | -1.5 ± 2.6 |
| All pairs | 176 | 116 | -0.7 ± 1.1 | -0.3 ± 0.8 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1891 over 176 battles (10.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 94.1% ± 0.9 | 99.1% ± 0.7 | 90.4% ± 1.1 | 555 / 560 | 78.7% ± 0.9 | 13.8% ± 1.7 | 195 | 0 | 0.54 / 13.3 |
| bbo.RamboT 0.3 | rammer | 97.0% ± 0.7 | 99.8% ± 0.4 | 95.3% ± 0.7 | 559 / 560 | 74.5% ± 0.9 | 9.6% ± 0.9 | 166 | 0 | 0.58 / 18.6 |
| PSW.Relentless 0.1 | rammer | 98.5% ± 0.4 | 100.0% ± 0.0 | 97.6% ± 0.6 | 560 / 560 | 72.4% ± 1.3 | 7.9% ± 2.2 | 190 | 0 | 0.53 / 34.0 |
| mahrgell.mahrram 1.3 | rammer | 79.6% ± 1.0 | 99.1% ± 0.7 | 70.7% ± 1.3 | 555 / 560 | 71.2% ± 1.2 | 35.7% ± 1.7 | 182 | 0 | 0.58 / 11.3 |
| sample.RamFire | rammer | 99.6% ± 0.3 | 100.0% ± 0.0 | 99.5% ± 0.4 | 560 / 560 | 70.4% ± 1.0 | 1.9% ± 1.2 | 180 | 0 | 0.53 / 89.3 |
| stelo.MirrorNano 1.4 | mirror | 92.1% ± 2.1 | 99.3% ± 1.5 | 85.6% ± 2.6 | 556 / 560 | 35.1% ± 1.2 | 5.4% ± 0.5 | 176 | 0 | 0.71 / 13.6 |
| stelo.MirrorMicro 1.1 | mirror | 82.2% ± 8.6 | 95.0% ± 4.7 | 71.5% ± 11.7 | 532 / 560 | 31.8% ± 4.3 | 7.4% ± 0.6 | 163 | 0 | 0.71 / 20.0 |
| zyx.nano.RedBull 1.0 | nano | 93.8% ± 0.9 | 99.6% ± 0.5 | 90.5% ± 1.4 | 558 / 560 | 80.5% ± 0.4 | 10.1% ± 2.0 | 151 | 0 | 0.51 / 11.1 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 84.8% ± 0.6 | 99.6% ± 0.5 | 77.0% ± 0.7 | 558 / 560 | 83.2% ± 0.6 | 75.8% ± 3.0 | 169 | 0 | 0.53 / 10.3 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.6% ± 0.8 | 94.3% ± 1.9 | 58.8% ± 0.5 | 528 / 560 | 72.8% ± 0.9 | 54.2% ± 2.6 | 163 | 0 | 0.55 / 14.0 |
| mz.NanoDeath 2.56 | nano | 67.9% ± 1.4 | 92.0% ± 3.0 | 58.8% ± 0.7 | 515 / 560 | 73.1% ± 1.2 | 55.5% ± 4.5 | 156 | 0 | 0.53 / 12.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 10 | 1441 | 0 | 0.35 | 0 | 0 | 0 |
| bbo.RamboT 0.3 | 16 | 14 | 141 | 0 | 0.30 | 1 | 0 | 0 |
| PSW.Relentless 0.1 | 16 | 12 | 1217 | 0 | 0.34 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 16 | 12 | 638 | 0 | 0.33 | 0 | 0 | 0 |
| sample.RamFire | 16 | 14 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.MirrorNano 1.4 | 16 | 11 | 1490 | 0 | 0.31 | 0 | 0 | 0 |
| stelo.MirrorMicro 1.1 | 16 | 13 | 298 | 0 | 0.29 | 2 | 2 | 0 |
| zyx.nano.RedBull 1.0 | 16 | 14 | 246 | 0 | 0.27 | 0 | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13 | 217 | 0 | 0.30 | 0 | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 16 | 13 | 236 | 0 | 0.29 | 1 | 1 | 0 |
| mz.NanoDeath 2.56 | 16 | 12 | 448 | 0 | 0.28 | 2 | 2 | 0 |

138 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 1591 | 30 | 1535 | 1535 (96.5%) | 56 (3.5%) | 0 (0.0%) | 62 | 86 | 42 |
| bbo.RamboT 0.3 | 4551 | 16 | 4544 | 4539 (99.7%) | 12 (0.3%) | 5 (0.1%) | 578 | 307 | 105 |
| PSW.Relentless 0.1 | 902 | 32 | 875 | 871 (96.6%) | 31 (3.4%) | 4 (0.5%) | 330 | 59 | 47 |
| mahrgell.mahrram 1.3 | 5157 | 32 | 5118 | 5117 (99.2%) | 40 (0.8%) | 1 (0.0%) | 1630 | 393 | 35 |
| sample.RamFire | 25 | 9 | 23 | 23 (92.0%) | 2 (8.0%) | 0 (0.0%) | 311 | 16 | 40 |
| stelo.MirrorNano 1.4 | 7011 | 35 | 6923 | 6920 (98.7%) | 91 (1.3%) | 3 (0.0%) | 40 | 153 | 48 |
| stelo.MirrorMicro 1.1 | 12633 | 24 | 13182 | 12609 (99.8%) | 24 (0.2%) | 573 (4.3%) | 34 | 214 | 43 |
| zyx.nano.RedBull 1.0 | 3673 | 27 | 3659 | 3659 (99.6%) | 14 (0.4%) | 0 (0.0%) | 606 | 207 | 32 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2928 | 32 | 2914 | 2914 (99.5%) | 14 (0.5%) | 0 (0.0%) | 556 | 179 | 48 |
| demetrix.nano.SledgeHammer 0.22 | 5345 | 14 | 5335 | 5332 (99.8%) | 13 (0.2%) | 3 (0.1%) | 1404 | 319 | 38 |
| mz.NanoDeath 2.56 | 5118 | 19 | 5092 | 5090 (99.5%) | 28 (0.5%) | 2 (0.0%) | 1622 | 324 | 59 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 4162 | 3 (0.1%) | 0 |
| bbo.RamboT 0.3 | 4038 | 132 (3.3%) | 0 |
| PSW.Relentless 0.1 | 4724 | 3 (0.1%) | 0 |
| mahrgell.mahrram 1.3 | 4850 | 333 (6.9%) | 1179 |
| sample.RamFire | 5502 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 6994 | 344 (4.9%) | 84 |
| stelo.MirrorMicro 1.1 | 6298 | 347 (5.5%) | 576 |
| zyx.nano.RedBull 1.0 | 3628 | 102 (2.8%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4540 | 101 (2.2%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 5358 | 220 (4.1%) | 0 |
| mz.NanoDeath 2.56 | 5151 | 138 (2.7%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 194 | 402 | 136 | 96.3 / 10.2 | 3437 | 3654 | 327 |
| bbo.RamboT 0.3 | 650 | 241 | 400 | 137 | 91.7 / 4.5 | 3598 | 4525 | 114 |
| PSW.Relentless 0.1 | 650 | 267 | 411 | 152 | 95.4 / 2.3 | 3714 | 2033 | 464 |
| mahrgell.mahrram 1.3 | 650 | 182 | 613 | 156 | 101.3 / 42.2 | 4177 | 4903 | 45 |
| sample.RamFire | 650 | 366 | 650 | 173 | 99.7 / 0.5 | 3409 | 27 | 1 |
| stelo.MirrorNano 1.4 | 650 | 496 | 400 | 226 | 68.8 / 11.6 | 5142 | 6850 | 2291 |
| stelo.MirrorMicro 1.1 | 650 | 505 | 478 | 416 | 60.5 / 22.6 | 4282 | 10490 | 83 |
| zyx.nano.RedBull 1.0 | 650 | 175 | 400 | 121 | 87.3 / 9.2 | 3069 | 4874 | 137 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 189 | 650 | 146 | 109.9 / 32.9 | 3808 | 4529 | 318 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 149 | 650 | 170 | 115.0 / 80.7 | 4791 | 4095 | 135 |
| mz.NanoDeath 2.56 | 650 | 156 | 650 | 165 | 112.2 / 78.8 | 4606 | 5793 | 253 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 13.8% | 195 | 36 | 3 | 2.6 | 3 / 3 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 9.6% | 166 | 46 | 3 | 8.1 | 130 / 132 (98%) | 0 | 0 |
| PSW.Relentless 0.1 | 7.9% | 190 | 52 | 3 | 1.5 | 3 / 3 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 35.7% | 182 | 50 | 3 | 9.0 | 333 / 333 (100%) | 0 | 0 |
| sample.RamFire | 1.9% | 180 | 45 | 3 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.4% | 176 | 562 | 3 | 11.7 | 336 / 344 (98%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 7.4% | 163 | 472 | 3 | 11.6 | 347 / 347 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 10.1% | 151 | 46 | 3 | 6.5 | 102 / 102 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 75.8% | 169 | 49 | 3 | 5.0 | 101 / 101 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 54.2% | 163 | 56 | 3 | 9.4 | 220 / 220 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 55.5% | 156 | 46 | 3 | 8.9 | 138 / 138 (100%) | 0 | 0 |

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
| PSW.Relentless 0.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 81.9% ± 2.8 | 97.6% ± 1.1 | +15.7 ± 3.0 |
| PSW.Relentless 0.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 87.6% ± 2.8 | 97.6% ± 0.8 | +10.1 ± 2.9 |
| bbo.RamboT 0.3 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 83.6% ± 3.9 | 95.3% ± 1.0 | +11.7 ± 3.9 |
| bbo.RamboT 0.3 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 87.1% ± 4.3 | 94.9% ± 1.2 | +7.8 ± 4.5 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 69.3% ± 1.4 | 74.9% ± 1.2 | +5.7 ± 1.8 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 72.1% ± 2.2 | 74.8% ± 1.4 | +2.7 ± 3.1 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.9 | 16 | 85.9% ± 6.5 | 97.5% ± 3.1 | +11.6 ± 7.6 | 54.9% ± 1.8 | 56.9% ± 1.5 | +2.0 ± 2.4 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.8.5 | 16 | 88.8% ± 7.8 | 95.0% ± 2.8 | +6.3 ± 8.5 | 55.5% ± 1.4 | 55.7% ± 0.9 | +0.3 ± 1.6 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.9 | 16 | 93.8% ± 6.4 | 100.0% ± 0.0 | +6.2 ± 6.4 | 63.1% ± 3.1 | 68.5% ± 2.1 | +5.4 ± 3.8 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 5.1 | 100.0% ± 0.0 | +6.2 ± 5.1 | 65.0% ± 3.1 | 69.3% ± 1.9 | +4.3 ± 4.2 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.9 | 16 | 89.7% ± 6.9 | 91.8% ± 5.6 | +2.1 ± 9.1 | 56.0% ± 1.7 | 58.1% ± 2.0 | +2.1 ± 2.6 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.8.5 | 16 | 83.8% ± 7.0 | 95.3% ± 4.2 | +11.6 ± 7.5 | 54.0% ± 1.4 | 56.3% ± 1.4 | +2.3 ± 1.9 |
| sample.RamFire | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.4% ± 3.0 | 99.7% ± 0.5 | +8.3 ± 3.2 |
| sample.RamFire | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 95.2% ± 3.4 | 100.0% ± 0.0 | +4.8 ± 3.4 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.9 | 16 | 96.3% ± 5.8 | 90.8% ± 8.9 | -5.5 ± 6.7 | 72.7% ± 14.1 | 63.6% ± 18.5 | -9.1 ± 12.2 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 93.6% ± 6.1 | -6.4 ± 6.1 | 81.3% ± 2.1 | 59.7% ± 19.3 | -21.7 ± 18.4 |
| stelo.MirrorNano 1.4 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 96.5% ± 6.0 | -3.5 ± 6.0 | 82.1% ± 3.3 | 76.8% ± 12.3 | -5.3 ± 12.8 |
| stelo.MirrorNano 1.4 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 98.1% ± 4.0 | -1.9 ± 4.0 | 81.1% ± 3.0 | 80.2% ± 10.6 | -0.9 ± 12.7 |
| vort.Chaser 0.0.3 | hadur2.Hadur 3.9 | 16 | 93.4% ± 5.4 | 100.0% ± 0.0 | +6.6 ± 5.4 | 69.4% ± 3.5 | 90.6% ± 2.1 | +21.3 ± 2.9 |
| vort.Chaser 0.0.3 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 5.1 | 100.0% ± 0.0 | +6.2 ± 5.1 | 75.5% ± 4.2 | 90.0% ± 2.5 | +14.5 ± 6.0 |
| zyx.nano.RedBull 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 4.7 | 79.9% ± 3.3 | 90.0% ± 3.1 | +10.1 ± 3.7 |
| zyx.nano.RedBull 1.0 | hadur2.Hadur 3.8.5 | 16 | 96.2% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 82.1% ± 3.8 | 87.7% ± 2.8 | +5.6 ± 4.5 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| PSW.Relentless 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -5.6 ± 3.8 | -0.0 ± 1.6 |
| bbo.RamboT 0.3 | +0.0 ± 3.9 | -0.6 ± 1.3 | -3.5 ± 5.0 | +0.4 ± 1.6 |
| bwbaugh.nano.Tirunculus 0.0.0a | +1.2 ± 4.7 | +0.0 ± 0.0 | -2.8 ± 2.5 | +0.1 ± 2.2 |
| demetrix.nano.SledgeHammer 0.22 | -2.8 ± 7.4 | +2.5 ± 3.6 | -0.6 ± 1.4 | +1.1 ± 1.6 |
| mahrgell.mahrram 1.3 | -0.0 ± 7.8 | +0.0 ± 0.0 | -1.9 ± 4.2 | -0.8 ± 2.5 |
| mz.NanoDeath 2.56 | +5.9 ± 9.2 | -3.5 ± 6.6 | +2.0 ± 2.0 | +1.8 ± 2.7 |
| sample.RamFire | +0.0 ± 0.0 | +0.0 ± 0.0 | -3.8 ± 3.5 | -0.3 ± 0.5 |
| stelo.MirrorMicro 1.1 | -3.8 ± 5.8 | -2.8 ± 10.8 | -8.6 ± 13.4 | +3.9 ± 23.7 |
| stelo.MirrorNano 1.4 | +0.0 ± 0.0 | -1.6 ± 7.5 | +1.0 ± 4.6 | -3.4 ± 17.1 |
| vort.Chaser 0.0.3 | -0.3 ± 5.5 | +0.0 ± 0.0 | -6.2 ± 4.6 | +0.6 ± 3.1 |
| zyx.nano.RedBull 1.0 | +0.0 ± 5.5 | -0.6 ± 1.3 | -2.2 ± 5.2 | +2.2 ± 4.1 |
