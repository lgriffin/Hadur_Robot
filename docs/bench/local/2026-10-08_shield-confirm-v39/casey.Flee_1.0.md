# casey.Flee 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.3% | 97.1% | 57.0% | 34 / 35 | 17.3% | 3.3% | 11 | 0 | 0.46 / 20.8 | 80.9% | +5.3 |
| 2 | 90.3% | 100.0% | 60.7% | 35 / 35 | 14.7% | 2.3% | 9 | 0 | 0.40 / 13.5 | 83.3% | +7.0 |
| 3 | 88.6% | 100.0% | 49.1% | 35 / 35 | 10.3% | 2.7% | 9 | 0 | 0.46 / 12.6 | 81.0% | +7.6 |
| 4 | 88.3% | 97.1% | 61.4% | 34 / 35 | 15.3% | 2.3% | 12 | 0 | 0.48 / 10.9 | 84.5% | +3.8 |
| 5 | 89.2% | 100.0% | 57.1% | 35 / 35 | 20.4% | 2.4% | 12 | 0 | 0.48 / 12.4 | 83.4% | +5.9 |
| 6 | 92.0% | 100.0% | 60.2% | 35 / 35 | 15.3% | 1.7% | 12 | 0 | 0.49 / 12.1 | 84.6% | +7.4 |
| 7 | 91.1% | 100.0% | 57.6% | 35 / 35 | 12.4% | 1.8% | 15 | 0 | 0.44 / 12.9 | 81.8% | +9.3 |
| 8 | 84.8% | 97.1% | 49.9% | 34 / 35 | 16.9% | 2.2% | 13 | 0 | 0.50 / 26.5 | 84.1% | +0.7 |
| 9 | 87.1% | 100.0% | 56.7% | 35 / 35 | 13.9% | 3.1% | 11 | 0 | 0.59 / 13.3 | 77.0% | +10.1 |
| 10 | 92.6% | 100.0% | 58.9% | 35 / 35 | 17.9% | 1.7% | 12 | 0 | 0.46 / 10.7 | 77.8% | +14.8 |
| 11 | 89.0% | 100.0% | 53.4% | 35 / 35 | 13.5% | 2.6% | 9 | 0 | 0.51 / 14.0 | 85.2% | +3.8 |
| 12 | 91.0% | 100.0% | 52.4% | 35 / 35 | 18.1% | 2.0% | 11 | 0 | 0.41 / 145.0 | 81.2% | +9.7 |
| 13 | 90.3% | 100.0% | 59.2% | 35 / 35 | 11.8% | 2.4% | 13 | 0 | 0.44 / 21.8 | 81.5% | +8.9 |
| 14 | 91.2% | 100.0% | 60.0% | 35 / 35 | 11.9% | 1.9% | 13 | 0 | 0.47 / 13.7 | 85.9% | +5.2 |
| 15 | 84.2% | 97.1% | 46.2% | 34 / 35 | 19.7% | 2.8% | 15 | 0 | 0.51 / 12.9 | 86.1% | -1.8 |
| 16 | 86.4% | 94.3% | 56.5% | 33 / 35 | 15.6% | 1.6% | 13 | 0 | 0.55 / 11.4 | 89.8% | -3.4 |

Mean score share 88.9% ± 1.4, baseline 83.0% ± 1.7, paired diff +5.9 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 190 over 16 battles (11.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | shield-confirm | 88.9% ± 1.4 | 98.9% ± 0.9 | 56.0% ± 2.4 | 554 / 560 | 15.3% ± 1.6 | 2.3% ± 0.3 | 190 | 0 | 0.59 / 145.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 16 | 316 | 5.9% | 91.5% | 0.0% | 2.5% | 713 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 18664 | 27 | 18818 | 18597 (99.6%) | 67 (0.4%) | 221 (1.2%) | 1968 | 187 | 67 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| casey.Flee 1.0 | 4283 | 16553 (386.5%) | 216 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 650 | 385 | 650 | 563 | 10.5 / 8.3 | 164 | 1897 | 1733 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 2.3% | 190 | 76 | 3 | 3.6 | 144 / 16553 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| casey.Flee 1.0 | casey.Flee | 1 | 35 | 272 | 1.8% | 14.1% ± 7.8 | 13.0% | 26.5% / 22.4% | 7.9% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
