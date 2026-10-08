# ad.Quest 0.10 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.4% | 100.0% | 75.1% | 35 / 35 | 12.8% | 1.3% | 12 | 0 | 0.42 / 15.1 | 77.2% | +19.2 |
| 2 | 85.0% | 94.3% | 51.7% | 33 / 35 | 12.7% | 1.7% | 10 | 0 | 0.44 / 14.1 | 74.6% | +10.4 |
| 3 | 90.6% | 97.1% | 59.4% | 34 / 35 | 8.8% | 1.5% | 12 | 0 | 0.47 / 12.0 | 81.9% | +8.8 |
| 4 | 79.6% | 91.4% | 52.1% | 32 / 35 | 10.0% | 2.7% | 10 | 0 | 0.57 / 14.3 | 83.9% | -4.3 |
| 5 | 83.5% | 91.4% | 49.6% | 32 / 35 | 10.2% | 2.2% | 11 | 0 | 0.55 / 15.4 | 80.4% | +3.2 |
| 6 | 93.0% | 100.0% | 61.8% | 35 / 35 | 11.7% | 1.6% | 12 | 0 | 0.53 / 12.1 | 80.0% | +13.0 |
| 7 | 93.2% | 100.0% | 60.5% | 35 / 35 | 9.0% | 2.0% | 12 | 0 | 0.51 / 13.9 | 80.9% | +12.3 |
| 8 | 79.4% | 91.4% | 51.6% | 32 / 35 | 13.6% | 3.0% | 9 | 0 | 0.59 / 16.1 | 85.2% | -5.8 |
| 9 | 89.5% | 97.1% | 63.8% | 34 / 35 | 13.5% | 1.9% | 12 | 0 | 0.54 / 16.5 | 79.8% | +9.7 |
| 10 | 92.1% | 100.0% | 63.2% | 35 / 35 | 11.2% | 2.0% | 12 | 0 | 0.47 / 16.0 | 76.1% | +16.0 |
| 11 | 92.6% | 100.0% | 65.4% | 35 / 35 | 8.7% | 1.7% | 9 | 0 | 0.46 / 15.5 | 82.0% | +10.6 |
| 12 | 83.6% | 97.1% | 53.7% | 34 / 35 | 14.3% | 3.4% | 13 | 0 | 0.58 / 12.3 | 74.6% | +8.9 |
| 13 | 78.6% | 94.3% | 57.8% | 33 / 35 | 13.9% | 4.4% | 17 | 0 | 0.85 / 13.9 | 79.8% | -1.2 |
| 14 | 87.3% | 97.1% | 49.1% | 34 / 35 | 9.2% | 2.4% | 12 | 0 | 0.51 / 12.5 | 76.6% | +10.6 |
| 15 | 87.0% | 94.3% | 56.5% | 33 / 35 | 9.7% | 2.3% | 14 | 0 | 0.47 / 15.3 | 78.4% | +8.6 |
| 16 | 82.2% | 91.4% | 49.4% | 32 / 35 | 10.6% | 2.5% | 14 | 0 | 0.54 / 138.8 | 86.7% | -4.5 |

Mean score share 87.1% ± 3.0, baseline 79.9% ± 1.9, paired diff +7.2 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 191 over 16 battles (11.9 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | shield-confirm | 87.1% ± 3.0 | 96.1% ± 1.8 | 57.5% ± 3.9 | 538 / 560 | 11.2% ± 1.1 | 2.3% ± 0.4 | 191 | 0 | 0.85 / 138.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 16 | 379 | 18.1% | 73.9% | 0.0% | 8.0% | 850 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 23306 | 330 | 23311 | 23305 (100.0%) | 1 (0.0%) | 6 (0.0%) | 427 | 74 | 117 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ad.Quest 0.10 | 7751 | 19196 (247.7%) | 3751 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 650 | 486 | 644 | 700 | 10.6 / 8.0 | 284 | 1430 | 564 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 2.3% | 191 | 485 | 3 | 6.6 | 370 / 19196 (2%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | ad.Quest | 1 | 35 | 266 | 3.3% | 13.6% ± 4.8 | 11.3% | 25.7% / 25.7% | 10.5% | 0 / 0 | T?/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
